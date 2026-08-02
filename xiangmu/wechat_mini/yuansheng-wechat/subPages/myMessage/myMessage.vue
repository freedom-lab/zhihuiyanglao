<template>
	<view class="u-page">
		<view>
			<u-navbar style="color: #fff;" title="我的消息" bgColor="#2dd06e" leftIconSize="40" leftIconColor="#fff"
				@leftClick="backClick">
			</u-navbar>
		</view>
		<view class="message" :style="{ paddingTop: paddingTop + 50 + 'px' }">
			<view class="message_label">
				<template v-for="item,index in labelList">
					<view @click="changeLabel(index)"
						:class="['message_label_item',activeLabelIndex == index?'activeLabel':'']">{{item}}</view>
				</template>
			</view>
			<view class="message_list">
				<view class="message_list_title">
					<view :class="['message_list_title_item',activeIndex == 0?'active':'']" @click="changeActive(0)">
						<text>我收到的</text>
						<text v-if="messageNum" class="messageNum">{{messageNum}}</text>
					</view>
					<view :class="['message_list_title_item',activeIndex == 1?'active':'']" @click="changeActive(1)">
						我发起的</view>
				</view>
				<view id="scroll-wrap" class="scroll-wrap" :style="{ height: topHeight + 'px', overflow: 'hidden' }">
					<scroll-view style="width: 100%; height: 100%;" :scroll-y="true" lower-threshold="50"
						@scrolltolower="loadMore">
						<template v-if="messageList.length !== 0">
							<view class="messageList_item" v-for="item,index in messageList" @click="goDetail(item)">
								<view class="messageList_item_top">
									<view class="messageList_item_top_left" :style="item.isRead?'color:#bababa':''">
										{{item.messageTitle}}
									</view>
									<view class="messageList_item_top_right">
										<!-- 1警报消息 2遗嘱消息 3 审核消息' -->
										<template v-if="item.messageType == 1">
											<view class="messageList_item_top_right_one">警报消息</view>
										</template>
										<template v-if="item.messageType == 2">
											<view class="messageList_item_top_right_two">警报消息</view>
										</template>
										<template v-if="item.messageType == 3">
											<view class="messageList_item_top_right_three">审核消息</view>
										</template>
									</view>
								</view>
								<view class="messageList_item_center">
									<view class="messageList_item_center_left" :style="item.isRead?'color:#bababa':''">
										<text v-if="item.messageType !== 3">发件人：{{item.memberName}},</text>
										<text v-else>发件人：签到猫,</text>
										<text style="margin-left: 20rpx;">{{item.createDt.slice(0,16)}}</text>
									</view>
									<u-icon size="30" name="arrow-right" color="#D6D6D6"></u-icon>
								</view>
								<view class="messageList_item_bottom">
									<!-- <view class="" v-if="item.approvalStatus == 1">审核通过</view>
									<view class="" v-if="item.approvalStatus == 2">审核不通过</view> -->
									<view class="messageList_item_bottom_content"
										:style="item.isRead?'color:#bababa':''">{{item.messageContent}}</view>
								</view>
							</view>

							<view class="cardItemBottom" v-if="totalNum == messageList.length">
								已经到底了
							</view>
						</template>
						<template v-else>
							<view style="margin-top: 200rpx;">
								<u-empty mode="data" text="暂无记录" textColor="#B7B7B7" textSize="28"
									icon="https://api.ccnet.cc/resources/mini_image/kongshuju.png">
								</u-empty>
							</view>
						</template>
					</scroll-view>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	const app = getApp();
	let timeId = null;
	export default {
		data() {
			return {
				paddingTop: 0,
				headerHeight: 0,
				screenHeight: 0,
				topHeight: 0,
				activeLabelIndex: 0,
				activeIndex: 0,
				totalNum: 0,
				labelList: ["全部", '警报消息', "遗嘱消息", "审核消息"],
				messageList: [],
				queryInfo: {
					currPage: 1,
					pageSize: 20,
					condition: {}
				},
				messageNum: 0
			}
		},
		onLoad() {
			this.paddingTop = app.globalData.deviceInfo.statusBarHeight;
			this.headerHeight = app.globalData.headerHeight;
			this.screenHeight = app.globalData.deviceInfo.screenHeight;
			this.$nextTick(() => {
				this.getAreaHeight()
			})
			this.getMessageList()

		},
		onShareAppMessage(res) {
			if (res.from === 'button') { // 来自页面内分享按钮
				console.log(res.target)
			}
			const userInfo = uni.getStorageSync("userInfo")
			return {
				title: `我是${userInfo.memeberName},邀你使用签到猫`,
				path: `/pages/home/home?inviterCode=${userInfo.memberCode}`,
				imageUrl: "https://api.ccnet.cc/resources/mini_image/share1.png"
			}
		},
		onShow() {
			this.getMessageNum()
		},
		methods: {
			async getMessageNum() {
				const userInfo = uni.getStorageSync("userInfo")
				if (userInfo) {
					const res = await this.$request("/memberMessage/queryList", {
						reciveceCode: userInfo.memberCode,
						isRead: 0
					})
					let messageNum = res.data.data.length || 0
					if (messageNum && messageNum > 99) {
						this.messageNum = "99+"
					} else {
						this.messageNum = messageNum
					}
					app.globalData.messageNum = this.messageNum
					console.log(res, '---消息数量');
				}
			},
			backClick() {
				const pages = getCurrentPages();
				console.log(pages, '额面');
				if (pages.length > 1) {
					uni.navigateBack();
				} else {
					uni.switchTab({
						url: '/pages/home/home'
					});
				}
			},
			changeLabel(index) {
				this.activeLabelIndex = index
				this.queryInfo.currPage = 1
				this.getMessageList()
			},
			changeActive(index) {
				this.activeIndex = index
				this.queryInfo.currPage = 1
				this.getMessageList()
			},
			loadMore() {
				if (timeId) {
					clearTimeout(timeId)
				}
				timeId = setTimeout(() => {
					if (this.totalNum == this.messageList.length) return
					this.queryInfo.currPage += 1
					// 调接口
					this.getMessageList()
				}, 500)
			},
			// 获取猫卡数据
			async getMessageList() {
				console.log(this.activeLabelIndex, '----------');
				if (this.activeLabelIndex == 0) {
					this.queryInfo.condition.messageType = null
				} else {
					this.queryInfo.condition.messageType = this.activeLabelIndex
				}
				const userInfo = uni.getStorageSync('userInfo')
				if (!userInfo) return
				if (this.activeIndex == 0) {
					this.queryInfo.condition.reciveceCode = userInfo.memberCode
					this.queryInfo.condition.memberCode = null
				} else {
					this.queryInfo.condition.reciveceCode = null
					this.queryInfo.condition.memberCode = userInfo.memberCode
				}
				const res = await this.$request('/memberMessage/list', this.queryInfo)
				console.log(res, '列表数据');
				if (res.data.code == 200) {
					this.totalNum = res.data.data.count;
					res.data.data.data.forEach(item => {
						if (item && item.createDt) {
							item.createDt = item.createDt.replaceAll('-', '.');
						}
					})
					if (this.queryInfo.currPage == 1) {
						this.messageList = res.data.data.data
					} else {
						this.messageList = this.messageList.concat(res.data.data.data)
					}
				}
			},
			async goDetail(item) {
				if (item.messageType == 3) {
					// uni.navigateTo({
					// 	url: `/subPages/merchantaudit/merchantaudit?merchantCode=${item.merchantCode}`
					// })
					uni.navigateTo({
						url: "/subPages/register/register"
					})
				} else {
					uni.navigateTo({
						url: `/subPages/myMessageDetail/myMessageDetail?messageType=${item.messageType}&id=${item.id}&activeIndex=${this.activeIndex}`
					})
				}
				const res = await this.$request("/memberMessage/update", {
					id: item.id,
					isRead: 1
				})
			},
			// 获取顶部高度
			getAreaHeight() {
				uni.createSelectorQuery()
					.in(this) // 指定作用域为当前页面/组件
					.select('#scroll-wrap') // 选择节点
					.boundingClientRect(rect => {
						// rect.height 即为元素高度
						console.log('元素高度:', rect)
						this.topHeight = this.screenHeight - rect.top - 20;
						console.log('元素高度this.screenHeight - rect.top:', this.screenHeight - rect.top)
					})
					.exec()
			},
		}
	}
</script>

<style lang="scss" scoped>
	.u-page {
		width: 100vw;
		background: #F7F7F7;
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
	}

	::v-deep .u-navbar__content__title {
		color: #fff !important;
	}

	.cardItemBottom {
		font-weight: normal;
		font-size: 26rpx;
		color: #B7B7B7;
		text-align: center;
		margin-top: 20rpx;
	}

	.message {
		padding: 20rpx;

		&_label {
			display: flex;
			align-items: center;

			&_item {
				text-align: center;
				width: 20%;
				margin-right: 20rpx;
				padding: 6rpx 0;
				font-weight: normal;
				font-size: 30rpx;
				color: #fff;
				background: #aaa6a6;
				border-radius: 8rpx 8rpx 8rpx 8rpx;
			}
		}

		&_list {
			background: #fff;
			border-radius: 20rpx;
			padding: 20rpx;
			margin-top: 30rpx;


			&_title {
				font-weight: bold;
				font-size: 32rpx;
				color: #333333;
				display: flex;
				align-items: center;
				justify-content: space-around;
				border-bottom: 2rpx solid #EBEBEB;

				&_item {
					padding: 16rpx 20rpx;
					position: relative;

					.messageNum {
						position: absolute;
						top: 0;
						right: -20rpx;
						border-top-right-radius: 100px;
						border-top-left-radius: 100px;
						border-bottom-left-radius: 100px;
						border-bottom-right-radius: 100px;
						display: flex;
						flex-direction: row;
						line-height: 11px;
						text-align: center;
						font-size: 11px;
						color: #FFFFFF;
						padding: 2px 5px;
						background-color: #f56c6c;
					}
				}
			}
		}
	}

	.messageList_item {
		padding: 20rpx;
		border-bottom: 2rpx solid #EBEBEB;

		&_top {
			display: flex;
			align-items: center;
			justify-content: space-between;

			&_left {
				font-weight: bold;
				font-size: 32rpx;
				color: #333333;
			}

			&_right {
				font-weight: normal;
				font-size: 28rpx;
				color: #FFFFFF;

				&_one {
					padding: 2rpx 12rpx;
					background: #FFA700;
					border-radius: 8rpx 8rpx 8rpx 8rpx;
				}

				&_two {
					padding: 2rpx 12rpx;
					background: #FF0000;
					border-radius: 8rpx 8rpx 8rpx 8rpx;
				}

				&_three {
					padding: 2rpx 12rpx;
					background: #27c560;
					border-radius: 8rpx 8rpx 8rpx 8rpx;
				}
			}
		}

		&_center {
			display: flex;
			align-items: center;
			justify-content: space-between;
			margin: 16rpx 0;
			font-weight: normal;
			font-size: 26rpx;
			color: #bababa;
		}

		&_bottom {
			font-weight: normal;
			font-size: 28rpx;
			color: #000;

			&_content {
				margin-top: 16rpx;
				white-space: nowrap;
				/* 强制文本单行显示，不换行 */
				overflow: hidden;
				/* 隐藏超出容器的文本内容 */
				text-overflow: ellipsis;
				/* 超出部分用省略号「...」表示 */
			}
		}

	}

	.activeLabel {
		color: #FFFFFF;
		background: #22C55E;
	}

	.active {
		color: #22C55E;
		border-bottom: 2rpx solid #22C55E;
	}
</style>