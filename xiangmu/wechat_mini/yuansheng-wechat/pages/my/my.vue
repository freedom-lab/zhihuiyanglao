<template>
	<view class="u-page" :style="{ paddingTop: paddingTop + 'px' }">
		<view class="custom-header" :style="{ paddingTop: headerHeight + 'rpx' }">
			<view class="header-left" @click="goUserSetting">
				<!-- <image class="left-icon" src="/static/cat-icon.png" mode="widthFix"></image> -->
				<u-avatar
					:src="userInfo.avatar?userInfo.avatar:'https://api.ccnet.cc/resources/mini_image/cat-icon-avatar.png'"
					size="124"></u-avatar>
				<view class="left-info">
					<view class="li-top">
						{{userInfo.memeberName?userInfo.memeberName:"请登录"}}
					</view>
					<view class="li-bottom">
						{{userInfo.phone || ''}}
					</view>
				</view>
			</view>
			<view class="header-right" @click="goMyInvitCode">
				<image class="right-img" src="https://api.ccnet.cc/resources/mini_image/qrCode.png" mode="widthFix">
				</image>
			</view>
		</view>
		<view class="card-area">
			<view class="card-infobox">
				<view class="card-item" @click="goCardDetail(1)">
					<view class="item-top">
						{{userInfo.smallCatAmount || 0}}
					</view>
					<view class="item-bottom">
						小猫卡
					</view>
				</view>
				<u-line direction="col" color="#fff" length="32"></u-line>
				<view class="card-item" @click="goCardDetail(2)">
					<view class="item-top">
						{{userInfo.largeCatAmoount || 0}}
					</view>
					<view class="item-bottom">
						大猫卡
					</view>
				</view>
				<u-line direction="col" color="#fff" length="32"></u-line>
				<view class="card-item" @click="goWelfareCenter">
					<view class="item-top">
						{{userInfo.welfareAmount || 0}}
					</view>
					<view class="item-bottom">
						福利卡
					</view>
				</view>
			</view>
		</view>


		<view class="container-box">
			<view class="container">
				<view class="top-info">
					<view class="info-line">
						<u-cell-group :border="false">
							<u-cell title="我的消息" @click="goMyMessage" :isLink="true" size="large" :border="false"
								:titleStyle="titleStyle" :rightIconStyle="{'fontSize': '32rpx'}">
								<image slot="icon" class="cell-img"
									src="https://api.ccnet.cc/resources/mini_image/my-1@2x.png" mode="aspectFit">
								</image>
								<text slot="value" class="u-slot-value">
									<text class="messageNum" v-if="messageNum">{{messageNum}}</text>
								</text>
							</u-cell>
							<u-line color="#f3f3f3" length="600rpx" :hairline="false" margin="0 0 0 80rpx"></u-line>
							<u-cell title="猫卡账本" :isLink="true" size="large" :border="false" :titleStyle="titleStyle"
								:rightIconStyle="{'fontSize': '32rpx'}" @click="goCard(1)">
								<image slot="icon" class="cell-img"
									src="https://api.ccnet.cc/resources/mini_image/my-2@2x.png" mode="aspectFit">
								</image>
							</u-cell>
						</u-cell-group>
					</view>
				</view>

				<view class="top-info green-line">
					<view class="info-line">
						<view class="line-left">
							<view class="left-top">
								<view class="lt-img">
									<image class="cell-img" src="https://api.ccnet.cc/resources/mini_image/my-‍3@2x.png"
										mode="aspectFit"></image>
								</view>
								<view class="lt-title">
									邀请好友
								</view>
							</view>
							<view class="left-bottom">
								邀请好友或商家都能自动获得小猫卡~
							</view>
						</view>
						<view class="line-right" @click="goshare">
							<u-button text="立即邀请" shape="circle" openType="share" :hairline="false" plain
								color="#26C761"></u-button>
						</view>
					</view>
				</view>
				<view class="top-info green-line" v-if="isShow">
					<view class="info-line">
						<view class="line-left">
							<view class="left-top">
								<view class="lt-img">
									<image class="cell-img" src="https://api.ccnet.cc/resources/mini_image/my-4@2x.png"
										mode="aspectFit"></image>
								</view>
								<view class="lt-title">
									充值支持
								</view>
							</view>
							<view class="left-bottom">
								充值不仅仅是支持，更能直接获得大猫卡~
							</view>
						</view>
						<view class="line-right" @click="payShow">
							<u-button text="立即充值" shape="circle" :hairline="false" plain color="#26C761"></u-button>
						</view>
					</view>
				</view>

				<view class="top-info">
					<view class="info-line">
						<u-cell-group :border="false">
							<u-cell title="商家中心" :isLink="true" size="large" :border="false" :titleStyle="titleStyle"
								:rightIconStyle="{'fontSize': '32rpx'}" @click="goMerchantCenter">
								<image slot="icon" class="cell-img"
									src="https://api.ccnet.cc/resources/mini_image/my-5@2x.png" mode="aspectFit">
								</image>
							</u-cell>
							<u-line color="#f3f3f3" length="600rpx" :hairline="false" margin="0 0 0 80rpx"></u-line>

							<u-cell title="福利中心" :isLink="true" size="large" :border="false" :titleStyle="titleStyle"
								:rightIconStyle="{'fontSize': '32rpx'}" @click="goWelfareCenter">
								<image slot="icon" class="cell-img"
									src="https://api.ccnet.cc/resources/mini_image/my-6@2x.png" mode="aspectFit">
								</image>
							</u-cell>
							<u-line color="#f3f3f3" length="600rpx" :hairline="false" margin="0 0 0 80rpx"></u-line>

							<u-cell title="个人中心" :isLink="true" size="large" :border="false" :titleStyle="titleStyle"
								:rightIconStyle="{'fontSize': '32rpx'}" @click="goUserSetting">
								<image slot="icon" class="cell-img"
									src="https://api.ccnet.cc/resources/mini_image/my-7@2x.png" mode="aspectFit">
								</image>
							</u-cell>
							<u-line color="#f3f3f3" length="600rpx" :hairline="false" margin="0 0 0 80rpx"></u-line>

							<u-cell title="关注公众号" :isLink="true" size="large" :border="false" :titleStyle="titleStyle"
								:rightIconStyle="{'fontSize': '32rpx'}" @click="getWechatSetting">
								<image slot="icon" class="cell-img"
									src="https://api.ccnet.cc/resources/mini_image/my-8@2x.png" mode="aspectFit">
								</image>
							</u-cell>
							<u-line color="#f3f3f3" length="600rpx" :hairline="false" margin="0 0 0 80rpx"></u-line>

							<u-cell title="后台管理" :isLink="true" size="large" :border="false" :titleStyle="titleStyle"
								:rightIconStyle="{'fontSize': '32rpx'}" @click="goMerchantAudit"
								v-if="userInfo.isManager == 1">
								<image slot="icon" class="cell-img"
									src="https://api.ccnet.cc/resources/mini_image/my-‍9@2x.png" mode="aspectFit">
								</image>
							</u-cell>
						</u-cell-group>
					</view>
				</view>
			</view>
		</view>

		<loginConfirm ref="loginConfirm" />
		<rewardSupport ref="rewardSupport" @getUserInfoData="getUserInfoData" />
	</view>
</template>

<script>
	const app = getApp();
	import loginConfirm from '../../components/loginConfirm/loginConfirm.vue';
	import rewardSupport from '../../components/rewardSupport/rewardSupport.vue';
	export default {
		components: {
			loginConfirm,
			rewardSupport
		},
		data() {
			return {
				isShow: false,
				messageNum: 0,
				paddingTop: 0,
				headerHeight: 0,
				titleStyle: {
					'fontSize': '32rpx',
					'color': '#333333',
					'fontWeight': '500'
				},
				isHaveSetting: false,
				userInfo: {},
				shareTitleList: [
					'签到得猫卡 · 猫卡当饭卡',
					'我是@xx*，邀你使用签到猫',
					'我是@xx*，邀你签到入驻'
				],
			}
		},
		onLoad() {
			console.log(app.globalData, "---");
			this.paddingTop = app.globalData.deviceInfo.statusBarHeight;
			this.headerHeight = app.globalData.headerHeight;
		},
		onShow() {
			this.getUserInfoData()
			console.log("userInfo", uni.getStorageSync("userInfo"));
			// this.getWechatSetting()
			this.getMessageNum()
			this.getSystemConfig()
		},
		onShareAppMessage(res) {
			if (res.from === 'button') { // 来自页面内分享按钮
				console.log(res.target)
			}
			return {
				title: `我是${this.userInfo.memeberName},邀你使用签到猫`,
				path: `/pages/home/home?inviterCode=${this.userInfo.memberCode}`,
				imageUrl: "https://api.ccnet.cc/resources/mini_image/share1.png"
			}
		},

		methods: {
			// 配置文件
			async getSystemConfig() {
				const res = await this.$request("/systemConfig/queryOne", {
					propertyKey: 'isShowPop'
				})
				if (res.data.code == 200 && res.data.data) {
					if (Number(res.data.data.propertyValue) == 0) this.isShow = false
					if (Number(res.data.data.propertyValue) == 1) this.isShow = true

				}
			},
			async getMessageNum() {
				const userInfo = uni.getStorageSync("userInfo")
				if (userInfo) {
					const res = await this.$request("/memberMessage/queryList", {
						reciveceCode: userInfo.memberCode,
						isRead: 0
					})
					console.log(res, '消息消息');
					let messageNum = res.data.data.length || 0
					if (messageNum && messageNum > 99) {
						this.messageNum = "99+"
					} else {
						this.messageNum = messageNum || ''
					}
					app.globalData.messageNum = this.messageNum
					console.log(this.messageNum, '---消息数量');
				}
			},
			// 检查是否登录
			handleTabClick() {
				const islogin = this.$isLogin()
				if (!islogin) {
					this.$refs.loginConfirm.showDialog()
					return false
				}
				return true
			},
			// 前往邀请码
			goMyInvitCode() {
				const boolen = this.$isHavePhone()
				if (boolen) {
					uni.navigateTo({
						url: `/subPages/myInvitCode/myInvitCode`
					})
				}
			},
			// 前往我的消息
			goMyMessage() {
				const boolen = this.handleTabClick()
				if (boolen) {
					uni.navigateTo({
						url: `/subPages/myMessage/myMessage`
					})
				}
			},
			// 分享
			goshare() {
				// const memberCode = uni.getStorageSync("userInfo").memberCode
				// const shareImage = 'https://api.ccnet.cc/resources/mini_image/catbglogo.png'
				// const shareTitel = this.shareTitleList[0]
				// uni.share({
				// 	provider: 'weixin',
				// 	scene: "WXSceneSession",
				// 	type: 5,
				// 	imageUrl: shareImage,
				// 	title: shareTitel,
				// 	miniProgram: {
				// 		id: 'wx848fe8e0488717fc',
				// 		path: `pages/home/home?inviterMemberCode=${memberCode}`,
				// 		type: 0, //可取值： 0-正式版； 1-测试版； 2-体验版。 默认值为0。
				// 		webUrl: 'https://api.ccnet.cc'
				// 	},
				// 	success: ret => {
				// 		console.log(ret);
				// 	},
				// 	fail: res => {
				// 		console.log(res)
				// 	}
				// });
			},
			// 打赏
			payShow() {
				const boolen = this.handleTabClick()
				if (boolen) {
					this.$refs.rewardSupport.getPaySetConfig()
				}
			},
			// 大小猫卡
			goCard(cardType) {
				const boolen = this.handleTabClick()
				if (boolen) {
					uni.navigateTo({
						url: `/subPages/cardTransaction/cardTransaction?cardType=${cardType}`
					})
				}
			},
			goCardDetail(cardType) {
				const boolen = this.handleTabClick()
				if (boolen) {
					uni.navigateTo({
						url: `/subPages/cardDetail/cardDetail?cardType=${cardType}`
					})
				}
			},
			// 福利中心
			async goWelfareCenter() {
				const boolen = this.handleTabClick()
				if (boolen) {
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
				}

			},
			// 设置中心
			goUserSetting() {
				const boolen = this.handleTabClick()
				if (boolen) {
					uni.navigateTo({
						url: '/subPages/userSettingOther/userSettingOther'
					})
				}
			},
			// 商家中心
			goMerchantCenter() {
				const boolen = this.handleTabClick()
				if (boolen) {
					uni.navigateTo({
						url: '/subPages/register/register'
					})
				}
			},

			// 后台管理
			goMerchantAudit() {
				const boolen = this.handleTabClick()
				if (boolen) {
					uni.navigateTo({
						url: '/subPages/merchantaudit/merchantAuditList'
					})
				}
			},
			// 查询用户信息
			async getUserInfoData() {
				// const islogin = this.$isLogin()
				// if (!islogin) return
				const userInfo = uni.getStorageSync("userInfo")
				if (!userInfo) return
				const res = await this.$request("/member/queryOne", {
					memberCode: userInfo.memberCode
				})
				console.log(res, '------------用户');
				if (res.data.code == 200 && res.data.data) {
					this.userInfo = res.data.data
					this.userInfo.smallCatAmount = this.$formatNumberToWan(this.userInfo.smallCatAmount);
					this.userInfo.largeCatAmount = this.$formatNumberToWan(this.userInfo.largeCatAmount);
					this.userInfo.welfareAmount = this.$formatNumberToWan(this.userInfo.welfareAmount);
					uni.setStorageSync("userInfo", res.data.data)
					// this.userInfo.signDayNum = this.$formatNumberToWan(this.userInfo.signDayNum);
					// this.userInfo.shareMemberNums = this.$formatNumberToWan(this.userInfo.shareMemberNums);
					// this.userInfo.walfareAmount = this.$formatNumberToWan(this.userInfo.walfareAmount);
				}

			},

			// 查询公众号地址配置
			async getWechatSetting() {
				const res = await this.$request("/systemConfig/queryOne", {
					propertyKey: 'wechat_setting'
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
		}
	}
</script>

<style lang="scss" scoped>
	// .container {
	// 	padding: 20px;
	// 	font-size: 14px;
	// 	line-height: 24px;
	// }
	.u-page {
		width: 100vw;
		height: 100vh;
		// height: 100%;
		// padding: 0 20rpx env(safe-area-inset-bottom);
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
		background-color: #2dd06e;
	}

	/* 1. 自定义导航栏 */
	.custom-header {
		display: flex;
		justify-content: space-between;
		align-items: center;
		height: 180rpx;
		gap: 10rpx;
		padding: 20rpx;
		background-color: #2dd06e;
		color: #fff;
		position: relative;

		.header-left {
			flex: 1;
			display: flex;
			justify-content: space-between;
			align-items: center;
			gap: 12rpx;
			height: 100%;
			padding: 2rpx 20rpx;

			.left-icon {
				width: 124rpx;
				height: 124rpx;
				flex-shrink: 0;
			}

			.left-info {
				flex: 1;
				font-size: 28rpx;
				display: flex;
				flex-direction: column;
				justify-content: center;
				height: 100%;

				.li-top {
					font-size: 36rpx;
					font-weight: bold;
				}

				.li-bottom {}
			}
		}

		.header-right {
			width: 100rpx;
			height: 100%;
			flex-shrink: 0;
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 2rpx 20rpx;

			.right-img {
				width: 45rpx;
				height: 45rpx;
			}
		}
	}

	.card-area {
		display: flex;
		justify-content: center;
		height: 200rpx;
		padding: 0 20rpx 80rpx;
		background-color: #2dd06e;
		color: #fff;
		border-radius: 0 0 30rpx 30rpx;

		.card-infobox {
			width: 698rpx;
			// height: 132rpx;
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
					font-weight: 700;
				}

				.item-bottom {
					font-size: 30rpx;
					color: #FFFFFF;
					font-weight: 600;
				}
			}
		}
	}

	.container-box {
		width: 100%;
		height: 100%;
		flex: 1;
		background: #F7F7F7;
	}

	.container {
		margin-top: -70rpx;
		width: 100%;
		height: 100%;
		box-sizing: border-box;
		padding: 0 20rpx;
		display: flex;
		flex-direction: column;
		padding-bottom: calc(env(safe-area-inset-bottom) + 100rpx);
	}

	.top-info {
		width: 100%;
		box-sizing: border-box;
		padding: 10rpx;
		margin-top: 20rpx;
		background-color: #ffffff;
		border-radius: 16rpx;

		.cell-img {
			width: 46rpx;
			height: 46rpx;
			transform: translate(4rpx, 0);
			margin-right: 20rpx;
		}

		.info-line {
			display: flex;
			justify-content: space-between;
			align-items: center;
			gap: 20rpx;
			padding: 10rpx 0;

			.line-item {
				flex: 1;
				display: flex;
				flex-direction: column;
				align-items: center;
				gap: 10rpx;

				.item-top {
					font-size: 28rpx;
				}

				.item-bottom {
					font-size: 32rpx;
					font-weight: bold;
					min-height: 36rpx;
				}
			}
		}

		.info-line+.info-line {
			border-top: 1rpx solid #f2f2f2;
		}
	}

	.green-line {
		background: linear-gradient(81deg, #4CDC80 0%, #47DC7D 100%);
		color: #fff;
		height: 140rpx;
		padding: 10rpx 30rpx 10rpx 40rpx;

		.line-left {
			flex: 1;
			width: 50%;
			height: 100%;
			display: flex;
			flex-direction: column;
			justify-content: center;
			gap: 10rpx;

			.left-top {
				display: flex;
				justify-content: space-between;
				align-items: center;
				gap: 10rpx;

				.lt-img {
					width: 46rpx;
					height: 46rpx;
					flex-shrink: 0;
					transform: translate(4rpx, -1rpx);
				}

				.lt-title {
					flex: 1;
					font-size: 32rpx;
					color: #fff;
					font-weight: 500;
					margin-left: 20rpx;
				}
			}

			.left-bottom {
				font-size: 22rpx;
				font-weight: 600;
				color: #FFFFFF;
			}
		}

		.line-right {
			::v-deep .u-button {
				border: none !important;
				height: 66rpx !important;
			}

			::v-deep .u-button__text {
				font-size: 32rpx !important;
				color: #26C761 !important;
				latter-spacing: 4rpx;
				padding: 0 4rpx;
				font-weight: bold !important;
			}
		}
	}

	.messageNum {
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
</style>