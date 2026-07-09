<template>
	<view class="container">
		<view class="detail">
			<image v-if="messageDetail.messageType == 1" class="detail_icon"
				src="https://api.ccnet.cc/resources/mini_image/worn.png" mode=""></image>
			<image v-else class="detail_icon" src="https://api.ccnet.cc/resources/mini_image/error.png" mode=""></image>
			<view class="">
				{{messageDetail.messageType == 1?'警报消息':'遗嘱消息'}}
			</view>
		</view>
		<view class="content">
			<view class="content_title">
				{{messageDetail.messageTitle}}
			</view>
			<view class="content_detail">
				<view class="content_detail_time">
					<text v-if="messageDetail.messageType !== 3">发件人：{{messageDetail.memberName}},</text>
					<text v-else>发件人:签到猫 </text>
					<text style="margin-left: 20rpx;">{{messageDetail.createDt.slice(0,16)}}</text>
					<!-- <text style="margin-left: 20rpx;">{{messageDetail.receviceName}}</text> -->
				</view>
				<view class="content_detail_content">
					{{messageDetail.messageContent}}
				</view>
			</view>
		</view>

		<view class="concatButton" v-if="messageType =='1' && activeIndex == '0'">
			<view class="concatPeople" @click="makePhoneCall">联系对方</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				messageDetail: {

				},
				messageType: '1',
				activeIndex: 0,
				userInfo: {}
			}
		},
		onLoad(options) {
			console.log(options, '参数');
			const {
				id,
				messageType,
				activeIndex
			} = options
			if (id) {
				this.getMessageDetail(id)
			}
			this.messageType = messageType
			this.activeIndex = activeIndex
			if (messageType == '1') {
				uni.setNavigationBarTitle({
					title: "警报消息"
				})
			} else {
				uni.setNavigationBarTitle({
					title: "遗嘱消息"
				})
			}
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
			makePhoneCall() {
				if (this.userInfo && this.userInfo.phone) {
					uni.makePhoneCall({
						phoneNumber: this.userInfo.phone
					})
				} else {
					uni.showToast({
						title: "暂未查询到手机号",
						icon: "none",
						duration: 2000
					})
				}
			},
			async getMessageDetail(id) {
				const res = await this.$request("/memberMessage/queryOne", {
					id
				})
				if (res.data.code == 200 && res.data.data) {
					this.messageDetail = res.data.data
					if (this.messageDetail.createDt) {
						this.messageDetail.createDt = this.messageDetail.createDt.replaceAll('-', '.');
					}
					this.queryMemberInfo(res.data.data.memberCode)
				} else {
					uni.showToast({
						title: res.data.message,
						icon: 'none',
						duration: 2000
					})
				}
			},
			async queryMemberInfo(memberCode) {
				const res = await this.$request("/member/queryOne", {
					memberCode
				})
				if (res.data.code == 200 && res.data.data) {
					this.userInfo = res.data.data
				}
			},
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		background: #F7F7F7;
		// padding-bottom: ;
		font-weight: normal;
		font-size: 28rpx;
		color: #555555;


		.concatButton {
			width: 100%;
			position: fixed;
			bottom: calc(env(safe-area-inset-bottom) + 40rpx);
			// bottom: calc(constant(safe-area-inset-bottom) + 8px);

			.concatPeople {
				background-color: rgb(255, 167, 5);
				color: #fff;
				font-size: 32rpx;
				width: 50%;
				padding: 20rpx 0;
				margin: 0 auto;
				border-radius: 40rpx;
				text-align: center;
				font-weight: bold;
			}
		}


		.content {
			margin-top: 40rpx;
			background: #FFFFFF;
			border-radius: 20rpx 20rpx 20rpx 20rpx;
			padding: 20rpx;
			margin: 20rpx;

			&_title {
				font-weight: bold;
				font-size: 32rpx;
				color: #333333;


			}

			&_detail {
				&_time {
					margin: 20rpx 0;
				}

				&_content {
					font-size: 32rpx;
					letter-spacing: 5rpx;
					padding-bottom: 130rpx;
				}
			}
		}

		.detail {
			font-weight: bold;
			font-size: 36rpx;
			color: #333333;
			text-align: center;

			&_icon {
				margin: 24rpx auto;
				width: 162rpx;
				height: 144rpx;
			}
		}
	}
</style>