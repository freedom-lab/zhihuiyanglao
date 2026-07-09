<template>
	<view class="">
		<view class="container">
			<view class="avatar">
				<button class="avatar_button" type="default" open-type="chooseAvatar" @chooseavatar="chooseavatar">
					<image class="avatar_button_url"
						:src="userInfo.avatar?userInfo.avatar:'https://api.ccnet.cc/resources/mini_image/catbglogo.png'"
						mode="aspectFit"></image>
					<view class="avatar_button_camera">
						<u-icon class="avatar_button_camera_i" color="#fff" size="40" name="camera"></u-icon>
					</view>
				</button>
			</view>
			<view class="userInfo">
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">名字</text>
						<text class="userInfo_item_left_red">*</text>
					</view>
					<view class="userInfo_item_right">
						<!-- #ifdef APP -->
						<u--input placeholder="请输入姓名" border="none" inputAlign="right" v-model="userInfo.memeberName"
							fontSize="32rpx"></u--input>
						<!-- #endif -->
						<!-- #ifdef MP-WEIXIN -->
						<input class="uni-input" style="text-align: right;" type="nickname"
							v-model="userInfo.memeberName" placeholder="请输入/授权姓名" />
						<!-- #endif -->

					</view>
				</view>
				<view class="border_line"></view>
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">手机号</text>
						<text class="userInfo_item_left_red">*</text>
					</view>
					<view class="userInfo_item_right">
						<template v-if="userInfo.phone">
							<u--input placeholder="请输入手机号" border="none" inputAlign="right" v-model="userInfo.phone"
								fontSize="32rpx" disabled disabledColor="#ffffff" backgroundColor="#ffffff"></u--input>
						</template>
						<template v-else>
							<button class="phone-btn" open-type="getPhoneNumber" @getphonenumber="getMemberPhone">
								授权手机号
							</button>
						</template>
					</view>
				</view>
			</view>
			<view class="title">
				<view class="">一日未签到，次日6:00发警报</view>
			</view>
			<view class="userInfo">
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">联系人1</text>
					</view>
					<view class="userInfo_item_right">
						<u--input placeholder="请输入紧急联系人1" border="none" inputAlign="right"
							v-model="userInfo.contractFirstName" @blur="nameChange" fontSize="32rpx"></u--input>
					</view>
				</view>
				<view class="border_line"></view>
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">手机号1</text>
						<!-- <text class="userInfo_item_left_red">*</text> -->
					</view>
					<view class="userInfo_item_right">
						<u--input placeholder="请输入紧急联系人手机号1" border="none" inputAlign="right"
							v-model="userInfo.contractFirstPhone" @blur="phoneChange" fontSize="32rpx"></u--input>
					</view>
				</view>
				<view class="border_line"></view>
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">联系邮箱1</text>
						<text class="userInfo_item_left_red">*</text>
					</view>
					<view class="userInfo_item_right">
						<u--input placeholder="请输入紧急联系人邮箱1" border="none" inputAlign="right"
							v-model="userInfo.contractFirstEmail" @blur="emailChange" fontSize="32rpx"></u--input>
					</view>
				</view>
				<view class="border_line"></view>
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">联系开关1</text>
						<text class="userInfo_item_left_red">*</text>
					</view>
					<view class="userInfo_item_right">
						<u-switch size="50" v-model="userInfo.contractFirstSwitch" active-color="#26C761"
							:activeValue="1" :inactiveValue="0"></u-switch>
					</view>
				</view>
				<view class="border_line"></view>
				<view class="userInfo_item_textarea">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">联系消息1（警报）</text>
						<text class="userInfo_item_left_red">*</text>
					</view>
					<view style="margin-top: 20rpx;">
						<u--textarea v-model="userInfo.contractFirstMessage" placeholder="请输入紧急联系人消息1" count
							maxlength="700" fontSize="32rpx" autoHeight
							style="width: 100%;min-height: 500rpx;max-height: 2500rpx;"></u--textarea>
					</view>
				</view>
			</view>
			<view class="title">
				<view class="">30日未签到，31日6:00发遗嘱</view>
			</view>
			<view class="userInfo">
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">联系人2</text>
					</view>
					<view class="userInfo_item_right">
						<u--input placeholder="请输入紧急联系人手机号2" border="none" inputAlign="right"
							v-model="userInfo.contractSecondName" fontSize="32rpx"></u--input>
					</view>
				</view>
				<view class="border_line"></view>
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">手机号2</text>
						<!-- <text class="userInfo_item_left_red">*</text> -->
					</view>
					<view class="userInfo_item_right">
						<u--input placeholder="请输入紧急联系人手机号2" border="none" inputAlign="right"
							v-model="userInfo.contractSecondPhone" fontSize="32rpx"></u--input>
					</view>
				</view>
				<view class="border_line"></view>
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">联系邮箱2</text>
						<!-- <text class="userInfo_item_left_red">*</text> -->
					</view>
					<view class="userInfo_item_right">
						<u--input placeholder="请输入紧急联系人邮箱2" border="none" inputAlign="right"
							v-model="userInfo.contractSecondEmail" fontSize="32rpx"></u--input>
					</view>
				</view>
				<view class="border_line"></view>
				<view class="userInfo_item">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">联系开关2</text>
						<!-- <text class="userInfo_item_left_red">*</text> -->
					</view>
					<view class="userInfo_item_right">
						<u-switch size="50" v-model="userInfo.contractSecondSwitch" active-color="#26C761"
							:activeValue="1" :inactiveValue="0"></u-switch>
					</view>
				</view>
				<view class="border_line"></view>
				<view class="userInfo_item_textarea">
					<view class="userInfo_item_left">
						<text class="userInfo_item_left_name">联系消息2（遗嘱）</text>
						<!-- <text class="userInfo_item_left_red">*</text> -->
					</view>
					<view style="margin-top: 20rpx;">
						<u--textarea v-model="userInfo.contractSecondMessage" placeholder="请输入紧急联系人消息2" count
							maxlength="700" fontSize="32rpx" autoHeight
							style="width: 100%;min-height: 500rpx;max-height: 2500rpx;"></u--textarea>
					</view>
				</view>
			</view>

			<view class="checkarea">
				<u-checkbox-group v-model="checkboxValue1" @change="checkboxChange" size="32" iconSize='26'>
					<u-checkbox :checked="checked" shape="circle" :name="true">
						<view class="label-class" slot="label">
						</view>
					</u-checkbox>
				</u-checkbox-group>
				<view class="checkarea-cnt" @click="setchecked">
					请阅读并勾选《
					<view class="btn-class" @click="toDeatil(1)">
						签到猫用户协议
					</view>
					》、《
					<view class="btn-class" @click="toDeatil(2)">
						隐私政策
					</view>
					》
				</view>
			</view>


		</view>
		<view class="save">
			<view class="save_button" @click="saveConfirm">
				保存设置
			</view>
		</view>
	</view>

</template>

<script>
	const app = getApp()
	export default {
		data() {
			return {
				userInfo: {},
				code: "",
				jsCodeTimer: null,
				jsCodeInterval: 200000,
				checkboxValue1: [],
				// 基本案列数据
				checkboxList1: [{
					name: '',
					disabled: false
				}, ],
				checkvalue: '1',
				checked: false,
			}
		},
		onLoad() {
			this.getUserInfoData()
		},
		onUnload() {
			this.clearJsCodeTimer()
		},
		onBeforeUnmount() {
			this.clearJsCodeTimer()
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

			getJsCode() {
				// 终止条件：用户信息存在且有手机号，清除定时器并返回
				if (this.userInfo && this.userInfo.phone) {
					this.clearJsCodeTimer() // 统一清除定时器
					console.log('用户已获取手机号，停止jsCode轮询');
					return
				}
				wx.login({
					success: async (res) => {
						if (res.code) {
							this.code = res.code
							console.log('获取jsCode成功：', res.code);
						} else {
							console.error('获取jsCode失败：', res.errMsg);
						}
					},
					fail: (err) => {
						console.error('wx.login调用失败：', err.errMsg);
					}
				})
				this.clearJsCodeTimer()
				this.jsCodeTimer = setTimeout(() => {
					this.getJsCode()
				}, this.jsCodeInterval)
			},
			clearJsCodeTimer() {
				if (this.jsCodeTimer) {
					clearTimeout(this.jsCodeTimer)
					this.jsCodeTimer = null // 清空定时器变量，避免判断异常
				}
			},
			checkboxChange(n) {
				if (n[0]) {
					this.checked = true
				} else {
					this.checked = false
				}
			},
			setchecked(e) {
				this.checked = !this.checked
			},
			toDeatil(type) {
				uni.navigateTo({
					url: `/subPages/service/service?type=${type}`
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
						complete: async (login) => {
							console.log("登录", login);
							const inviterCode = uni.getStorageSync("inviterCode")
							console.log(inviterCode, 'inviterCode');
							const res = await this.$request("/member/decodePhone", {
								js_code: login.code,
								iv,
								encryptedData,
								inviterCode
							})
							if (res.data.code == 200) {
								uni.setStorageSync("userInfo", res.data.data)
								console.log(inviterCode, 'inviterCode');
								if (inviterCode) {
									uni.removeStorageSync("inviterCode")
								}
								// this.getUserInfoData()
								if (res.data.data.phone) {
									this.userInfo.phone = res.data.data.phone
								}
							} else {
								uni.showToast({
									title: res.data.message,
									icon: 'none',
									duration: 2000
								})
							}
						}
					})
				}

			},
			saveConfirm() {
				if (!this.checked) {
					uni.showToast({
						title: '请先阅读并勾选下方《签到猫用户协议》、《隐私政策》',
						icon: 'none'
					})
					return
				}
				const flags = this.saveBeforeSign();
				if (flags) {
					uni.showModal({
						title: "温馨提示",
						content: "确认保存设置吗？",
						complete: async (res) => {
							if (res.confirm) {
								const res = await this.$request("/member/save", this.userInfo)
								console.log(res, '---');
								if (res.data.code == 200) {
									uni.showToast({
										title: "保存成功",
										duration: 2000
									})
									app.globalData.tabvalue = 0
									uni.switchTab({
										url: "/pages/home/home"
									})
								}
							}
						}
					})
				}
			},
			// 保存前校验
			saveBeforeSign() {
				if (!this.userInfo.memeberName) {
					uni.showToast({
						title: "请填写/授权姓名",
						icon: 'none',
						duration: 2000
					})
					return false
				}
				if (!this.userInfo.phone) {
					uni.showToast({
						title: "请授权手机号",
						icon: 'none',
						duration: 2000
					})
					return false
				}
				if (!this.userInfo.contractFirstEmail) {
					uni.showToast({
						title: "请填写联系邮箱1",
						icon: 'none',
						duration: 2000
					})
					return false
				}
				if (!this.userInfo.contractFirstMessage) {
					uni.showToast({
						title: "请填写联系信息1",
						icon: 'none',
						duration: 2000
					})
					return false
				}
				// if (!this.userInfo.contractSecondEmail) {
				// 	uni.showToast({
				// 		title: "请填写联系人2邮箱",
				// 		icon: 'none',
				// 		duration: 2000
				// 	})
				// 	return false
				// }
				// if (!this.userInfo.contractSecondMessage) {
				// 	uni.showToast({
				// 		title: "请填写联系人2联系信息",
				// 		icon: 'none',
				// 		duration: 2000
				// 	})
				// 	return false
				// }
				return true
			},
			// 上传头像
			async chooseavatar(e) {
				console.log("上传头像", e);
				const res = await this.$upLoadFile(e.detail.avatarUrl)
				console.log(res, '----');
				if (res && res.url) {
					this.userInfo.avatar = res.url
				}
			},
			// 查询用户信息
			async getUserInfoData() {
				const memberCode = uni.getStorageSync("userInfo").memberCode
				const res = await this.$request("/member/queryOne", {
					memberCode
				})
				if (res.data.code == 200 && res.data.data) {
					this.userInfo = res.data.data
					// this.getJsCode()
				}
			},
			nameChange(e) {
				console.log(e, '名字');
				if (e && !this.userInfo.contractSecondName) {
					this.userInfo.contractSecondName = e
				}
			},
			phoneChange(e) {
				console.log(e, '手机号');
				if (e && !this.userInfo.contractSecondPhone) {
					this.userInfo.contractSecondPhone = e
				}
			},
			emailChange(e) {
				console.log(e, '邮箱');
				if (e && !this.userInfo.contractSecondEmail) {
					this.userInfo.contractSecondEmail = e
				}
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20rpx;
		padding-bottom: 300rpx;
		background: #F7F7F7;
		// padding-bottom: calc(env(safe-area-inset-bottom));

		.avatar {
			&_button {
				width: 154rpx;
				height: 154rpx;
				// border-radius: 50%;
				padding: 0;
				margin: 0 auto;
				background: none;
				position: relative;

				&_url {
					width: 100%;
					height: 100%;
					border-radius: 50%;
				}

				&_camera {
					position: absolute;
					border-radius: 50%;
					padding: 4rpx;
					bottom: 0;
					right: 0;
					z-index: 999;
					width: 40rpx;
					height: 40rpx;
					background: rgba(51, 51, 51, 0.66);

				}

			}


			&_button::after {
				border: none;
			}
		}

		.border_line {
			width: 100%;
			height: 0rpx;
			border-bottom: 1rpx solid #DDDDDD;
		}

		.title {
			font-size: 32rpx;
			color: #747474;
			text-align: center;
			margin: 36rpx 0;
		}

		.userInfo {
			margin: 40rpx 0;
			background: #fff;
			border-radius: 20rpx;

			&_item_textarea {
				padding: 20rpx;

				&_left {
					font-weight: normal;
					font-size: 32rpx;
					color: #747474;

					&_name {}

					&_red {
						color: #FF0000;
					}
				}

			}

			&_item {
				display: flex;
				align-items: center;
				justify-content: space-between;
				padding: 20rpx;

				&_left {
					font-weight: normal;
					font-size: 32rpx;
					color: #747474;

					&_name {}

					&_red {
						color: #FF0000;
					}
				}

				&_right {
					max-width: 80%;
					overflow: hidden;

					.u-input {
						border: none !important;

					}
				}
			}
		}


	}

	.save {
		width: 100%;
		padding: 44rpx 0;
		position: fixed;
		bottom: 0;
		z-index: 10;
		background-color: #FFFFFF;

		&_button {
			width: 80%;
			font-weight: normal;
			font-size: 36rpx;
			color: #FFFFFF;
			height: 74rpx;
			line-height: 74rpx;
			text-align: center;
			margin: 0 auto;
			background: #26C761;
			border-radius: 38rpx 38rpx 38rpx 38rpx;
		}
	}

	.phone-btn {
		// width: 100%;
		// width: 52rpx;
		// height: 26rpx;
		// height: 96rpx;
		background: #27ae60;
		color: #ffffff;
		border: none;
		border-radius: 48rpx;
		font-size: 25rpx;
		font-weight: 600;
		letter-spacing: 2rpx;
		padding: 0 20rpx;
		margin: 0;
	}

	.phone-btn:active {
		background: #219653;
		transform: scale(0.99);
	}

	.checkarea {
		font-size: 26rpx;
		color: #747474;
		margin: 6rpx 0;
		width: 100%;
		padding-left: 20rpx;
		display: flex;
		align-items: center;

		.checkarea-cnt {
			box-sizing: border-box;
			padding: 30rpx 0rpx;
			display: flex;
			align-items: center;
		}

		.btn-class {
			color: #3A9DFF;
		}
	}
</style>