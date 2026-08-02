<template>
	<view>
		<u-popup :show="show" mode="center" round="32" :closeOnClickOverlay="true" :safeAreaInsetBottom="false">
			<view class="getphone-popup">
				<view class="popup-header">
					<text class="title">获取手机号</text>
					<text class="desc">为了更好的为您提供服务，请授权手机号</text>
				</view>
				<button class="phone-btn" open-type="getPhoneNumber" @getphonenumber="getMemberPhone">
					授权手机号
				</button>
			</view>
		</u-popup>
	</view>
</template>

<script>
	export default {
		name: "loginConfirm",
		props: {},
		data() {
			return {
				show: false,
				code: ""
			};
		},
		onShow() {

		},
		methods: {
			showDialog() {
				uni.showModal({
					title: "温馨提示",
					content: "请授权登录，体验完整功能",
					complete: (res) => {
						if (res.confirm) {
							this.getLogin()
						}
						if (res.cancel) {
							// this.$emit("close", false)
						}
					}
				})
			},
			getLogin() {
				// this.$payAttention()
				wx.login({
					success: async (e) => {
						console.log(e, '-----');
						if (e.errMsg == "login:ok") {
							const res = await this.$request("/member/weiXinLogin", {
								js_code: e.code,
								// inviterCode: "202602023287538637378"
							})
							console.log(res, '----');
							if (res.data.code == 200) {
								wx.login({
									success: async (code) => {
										this.show = true
										this.code = code.code
									},
								})
							}
						} else {

						}

					}
				})
			},
			getMemberPhone(e) {
				// 先注册一个账号再获取手机号
				console.log(e, '手机号');
				const {
					code,
					iv,
					encryptedData,
					errMsg
				} = e.detail
				// return
				if (errMsg == "getPhoneNumber:ok") {
					uni.login({
						complete: async (e) => {
							console.log("登录", e);

							const res = await this.$request("/member/decodePhone", {
								js_code: this.code,
								iv,
								encryptedData
							})
							if (res.data.code == 200) {

								uni.setStorageSync("userInfo", res.data.data)
								this.show = false
								this.$emit("getUserInfoData")
							} else {
								this.show = false
								uni.showToast({
									title: res.data.message,
									icon: 'none',
									duration: 2000
								})
							}
						}
					})
				}

			}
		}
	}
</script>

<style lang="scss" scoped>
	.getphone-popup {
		width: 600rpx;
		padding: 60rpx 44rpx 40rpx;
		background: #ffffff;
		border-radius: 44rpx;
		display: flex;
		flex-direction: column;
		align-items: center;
		gap: 40rpx;
	}

	.popup-header {
		text-align: center;
	}

	.title {
		display: block;
		font-size: 36rpx;
		font-weight: 600;
		color: #1a1a1a;
		margin-bottom: 24rpx;
	}

	.desc {
		font-size: 28rpx;
		color: #666666;
		line-height: 1.5;
	}

	.phone-btn {
		width: 100%;
		height: 96rpx;
		background: #27ae60;
		color: #ffffff;
		border: none;
		border-radius: 48rpx;
		font-size: 36rpx;
		font-weight: 600;
		letter-spacing: 2rpx;
		display: flex;
		align-items: center;
		justify-content: center;
	}

	.phone-btn:active {
		background: #219653;
		transform: scale(0.99);
	}
</style>