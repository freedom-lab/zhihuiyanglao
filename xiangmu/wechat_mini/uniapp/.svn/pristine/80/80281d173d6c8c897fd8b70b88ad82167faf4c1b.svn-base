<template>
	<view class="u-page">
		<view>
			<u-navbar style="color: #fff;" title="猫卡账本" bgColor="#2dd06e" leftIconSize="40" leftIconColor="#fff"
				@leftClick="backClick" :titleStyle="titleStyle">
			</u-navbar>
		</view>
		<view id="card-area" class="card-area" :style="{ paddingTop: paddingTop + 64  + 'px' }">
			<view class="card-infobox">
				<view class="card-item" @click="goCardDetail(1)">
					<view class="item-top">
						{{ userInfo.smallCatAmount || 0 }}
					</view>
					<view class="item-bottom">
						小猫卡
					</view>

				</view>
				<u-line direction="col" color="#fff" length="32"></u-line>
				<view class="card-item" @click="goCardDetail(2)">
					<view class="item-top">
						{{ userInfo.largeCatAmoount || 0 }}
					</view>
					<view class="item-bottom">
						大猫卡
					</view>

				</view>
				<u-line direction="col" color="#fff" length="32"></u-line>
				<view class="card-item" @click="goWelfareCenter">
					<view class="item-top">
						{{ userInfo.welfareAmount || 0 }}
					</view>
					<view class="item-bottom">
						福利卡
					</view>


				</view>
			</view>
		</view>
		<view class="cardBox">
			<view class="cardBox_inner">
				<view class="cardBox_inner_tabs">
					<view :class="[cardType == 1 ? 'activeTabs' : '', 'cardBox_inner_tabs_item']"
						@click="changeCardType(1)">小猫卡
					</view>
					<view :class="[cardType == 2 ? 'activeTabs' : '', 'cardBox_inner_tabs_item']"
						@click="changeCardType(2)">大猫卡
					</view>
				</view>
			</view>
			<view id="scroll-wrap" class="scroll-wrap" :style="{ height: topHeight-10+ 'px', overflow: 'hidden' }">
				<scroll-view style="width: 100%; height: 100%;" :scroll-y="true" lower-threshold="50"
					@scrolltolower="loadMore">
					<template v-if="cardList.length !== 0">
						<view class="cardItem" v-for="item, index in cardList">
							<view class="cardItem_left">
								<!-- <image class="cardItem_left_cardUrl" :src="item.cardUrl" mode="aspectFit"></image> -->
								<image class="cardItem_left_cardUrl" src="/static/image/newLogo.png" mode="aspectFit">
								</image>

								<view class="cardItem_left_card">
									<view class="cardItem_left_card_type">
										<template v-if="item.resonType == 1">
											好友注册
										</template>
										<template v-if="item.resonType == 2">
											商家入驻
										</template>
										<template v-if="item.resonType == 3">
											每日签到
										</template>
										<template v-if="item.resonType == 4">
											充值支持
										</template>
									</view>
									<view class="cardItem_left_card_time">
										{{ item.createDt.slice(0,16) }}
									</view>
								</view>
							</view>
							<view class="cardItem_right">
								<view class="cardItem_right_cardNums">+{{ item.cardNums || 1 }}</view>
								<view v-if="cardType == 2" class="cardItem_right_rechargeAmount">
									-{{ item.rechargeAmount || 0 }}</view>
							</view>
						</view>
						<view class="cardItemBottom" v-if="totalNum == cardList.length">
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
				cardType: 1,
				userInfo: {},
				totalNum: 4,
				titleStyle: {
					'font-weight': 'bold',
					'font-size': '36rpx',
				},
				// `resonType`  '猫卡获取类型 1 邀请用户 2 邀请商家 3 签到 4 打赏',
				cardList: [],
				queryInfo: {
					currPage: 1,
					pageSize: 20,
					condition: {}
				}
			}
		},
		onLoad(options) {
			let cardType = options.cardType ? options.cardType : 1
			this.cardType = Number(cardType)
			console.log(app.globalData, "---");
			this.paddingTop = app.globalData.deviceInfo.statusBarHeight;
			this.headerHeight = app.globalData.headerHeight;
			this.screenHeight = app.globalData.deviceInfo.screenHeight;

			this.getUserInfoData()
			this.$nextTick(() => {
				this.getAreaHeight()
			})
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
		methods: {
			goCardDetail(cardType) {

				uni.navigateTo({
					url: `/subPages/cardDetail/cardDetail?cardType=${cardType}`
				})

			},
			// 福利中心
			async goWelfareCenter() {

				// uni.navigateTo({
				// 	url: '/subPages/welfareCenter/welfareCenter'
				// })
				const res = await this.$request("/systemConfig/queryOne", {
					propertyKey: 'welfare_setting'
				})
				console.log(res, '-----');

				if (res.data.code == 200 && res.data.data.propertyValue) {
					wx.openOfficialAccountArticle({
						// 服务号文章的链接
						url: res.data.data.propertyValue,
						success(res) {
							console.log('打开文章成功', res);
						},
						fail(err) {
							console.error('打开文章失败', err);
							// 降级处理：提示用户复制链接
							wx.showModal({
								title: '提示',
								content: '无法直接打开文章，请手动复制链接在微信中打开',
								showCancel: false
							});
						}
					});
					// this.isHaveSetting = true
				} else {
					uni.showToast({
						title: "暂无更多内容，敬请期待",
						icon: "none",
						duration: 2000
					})
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
			changeCardType(type) {
				this.queryInfo.currPage = 1
				this.cardType = type
				this.getCardList();
			},
			// 获取猫卡数据
			async getCardList() {
				this.queryInfo.condition.cardType = this.cardType
				this.queryInfo.condition.memberCode = this.userInfo.memberCode
				const res = await this.$request('/memberCardRecords/list', this.queryInfo)
				console.log(res, '列表数据');
				if (res.data.code == 200) {
					this.totalNum = res.data.data.count;
					res.data.data.data.forEach(item => {
						if (item && item.createDt) {
							item.createDt = item.createDt.replaceAll('-', '.');
						}
					})
					if (this.queryInfo.currPage == 1) {
						this.cardList = res.data.data.data
					} else {
						this.cardList = this.cardList.concat(res.data.data.data)
					}
				}
			},
			loadMore() {

				if (timeId) {
					clearTimeout(timeId)
				}
				timeId = setTimeout(() => {
					if (this.totalNum == this.cardList.length) return
					this.queryInfo.currPage += 1
					// 调接口
					this.getCardList()
				}, 500)
			},
			// 查询用户信息
			async getUserInfoData() {
				const memberCode = uni.getStorageSync("userInfo").memberCode
				const res = await this.$request("/member/queryOne", {
					memberCode
				})
				if (res.data.code == 200 && res.data.data) {
					this.userInfo = res.data.data
					this.userInfo.smallCatAmount = this.$formatNumberToWan(this.userInfo.smallCatAmount);
					this.userInfo.largeCatAmount = this.$formatNumberToWan(this.userInfo.largeCatAmount);
					this.userInfo.welfareAmount = this.$formatNumberToWan(this.userInfo.welfareAmount);
					// this.userInfo.signDayNum = this.$formatNumberToWan(this.userInfo.signDayNum);
					// this.userInfo.shareMemberNums = this.$formatNumberToWan(this.userInfo.shareMemberNums);
					// this.userInfo.walfareAmount = this.$formatNumberToWan(this.userInfo.walfareAmount);
					this.getCardList()
				}
			},
			// 获取顶部高度
			getAreaHeight() {
				uni.createSelectorQuery()
					.in(this) // 指定作用域为当前页面/组件
					.select('#scroll-wrap') // 选择节点
					.boundingClientRect(rect => {
						// rect.height 即为元素高度
						console.log('元素高度:', rect)
						this.topHeight = this.screenHeight - rect.top;
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
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
	}

	::v-deep .u-navbar__content__title {
		color: #fff !important;
	}

	.card-area {
		display: flex;
		justify-content: center;
		height: 200rpx;
		padding: 40rpx 20rpx;
		background-color: #2dd06e;
		color: #fff;

		.card-infobox {
			width: 698rpx;
			height: 132rpx;
			background: #FFFFFF2a;
			border-radius: 28rpx 28rpx 28rpx 28rpx;
			padding: 20rpx;
			display: flex;
			justify-content: space-between;
			align-items: center;
			gap: 10rpx;

			.card-item {
				flex: 1;
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				gap: 20rpx;

				.item-top {
					font-size: 38rpx;
					color: #FFFFFF;
					font-weight: bold;
				}

				.item-bottom {
					font-weight: bold;
					font-size: 30rpx;
					color: #FFFFFF;
				}
			}
		}
	}



	.cardBox {
		padding: 20rpx;
		background: #F7F7F7;

		.scroll-wrap {
			width: 100%;
			overflow: hidden;
			box-sizing: border-box;
			background: #fff;
			// 若需要还可设置min-height/max-height
		}

		&_inner {
			background-color: #fff;
			border-radius: 20rpx;

			&_tabs {
				display: flex;
				justify-content: space-around;
				align-items: center;
				border-bottom: 2rpx solid #EBEBEB;

				&_item {
					padding: 22rpx 20rpx;
					font-weight: bold;
					font-size: 32rpx;
					color: #333333;
				}
			}
		}

		.cardItemBottom {
			font-weight: normal;
			font-size: 26rpx;
			color: #B7B7B7;
			text-align: center;
			margin-top: 20rpx;
		}

		.cardItem {
			background-color: #fff;
			display: flex;
			justify-content: space-between;
			align-items: center;
			padding: 20rpx;
			border-bottom: 2rpx solid #EBEBEB;

			&_right {
				&_cardNums {
					font-weight: normal;
					font-size: 28rpx;
					color: #22C55E;
				}

				&_rechargeAmount {
					margin-top: 10rpx;
					font-weight: normal;
					font-size: 26rpx;
					color: #333333;
				}

			}

			&_left {
				display: flex;
				align-items: center;

				&_cardUrl {
					width: 80rpx;
					height: 80rpx;
					border-radius: 50%;
					background-color: #22C55E;
					margin-right: 30rpx;
				}

				&_card {
					display: flex;
					flex-flow: column;
					justify-content: space-between;

					&_type {
						font-weight: bold;
						font-size: 32rpx;
						color: #333333;
					}

					&_time {
						font-weight: normal;
						font-size: 26rpx;
						color: #333333;
						margin-top: 12rpx;
					}
				}
			}
		}

		.activeTabs {
			color: #2dd06e;
			border-bottom: 2rpx solid #2dd06e;
		}
	}
</style>