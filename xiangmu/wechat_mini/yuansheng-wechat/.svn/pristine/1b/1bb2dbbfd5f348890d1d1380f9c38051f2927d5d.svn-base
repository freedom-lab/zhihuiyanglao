<template>
	<view class="container">
		<view class="avatar">
			<button class="avatar_button" type="default" open-type="chooseAvatar" @chooseavatar="chooseavatar">
				<image class="avatar_button_url"
					:src="userInfo.avatar?userInfo.avatar:'https://pc.xnzx888.com/resources/upload/html/xnzxlogo.png'"
					mode="aspectFit"></image>
				<view class="avatar_button_camera">
					<u-icon class="avatar_button_camera_i" color="#fff" size="40" name="camera"></u-icon>
				</view>
			</button>
		</view>
		<view class="userInfo">
			<view class="userInfo_item">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">姓名</text>
					<text class="userInfo_item_left_red">*</text>
				</view>
				<view class="userInfo_item_right">
					<u--input placeholder="请输入姓名" border="none" inputAlign="right" v-model="userInfo.memeberName"
						fontSize="32rpx"></u--input>
				</view>
			</view>
			<view class="border_line"></view>
			<view class="userInfo_item">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">手机号</text>
					<text class="userInfo_item_left_red">*</text>
				</view>
				<view class="userInfo_item_right">
					<u--input placeholder="请输入手机号" border="none" inputAlign="right" v-model="userInfo.phone" disabled
						fontSize="32rpx"></u--input>
				</view>
			</view>
		</view>
		<view class="title">
			<view class="">【一日不签到,次日6:00发警报】</view>
		</view>
		<view class="userInfo">
			<view class="userInfo_item">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">联系人1</text>
				</view>
				<view class="userInfo_item_right">
					<u--input placeholder="请输入联系人1" border="none" inputAlign="right"
						v-model="userInfo.contractFirstName" fontSize="32rpx"></u--input>
				</view>
			</view>
			<view class="border_line"></view>
			<view class="userInfo_item">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">手机号1</text>
					<!-- <text class="userInfo_item_left_red">*</text> -->
				</view>
				<view class="userInfo_item_right">
					<u--input placeholder="请输入联系人1手机号" border="none" inputAlign="right"
						v-model="userInfo.contractFirstPhone" fontSize="32rpx"></u--input>
				</view>
			</view>
			<view class="border_line"></view>
			<view class="userInfo_item">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">联系邮箱</text>
					<text class="userInfo_item_left_red">*</text>
				</view>
				<view class="userInfo_item_right">
					<u--input placeholder="请输入联系人1邮箱" border="none" inputAlign="right"
						v-model="userInfo.contractFirstEmail" fontSize="32rpx"></u--input>
				</view>
			</view>
			<view class="border_line"></view>
			<view class="userInfo_item">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">联系开关</text>
					<text class="userInfo_item_left_red">*</text>
				</view>
				<view class="userInfo_item_right">
					<u-switch size="50" v-model="userInfo.contractFirstSwitch" active-color="#26C761" :activeValue="1"
						:inactiveValue="0"></u-switch>
				</view>
			</view>
			<view class="border_line"></view>
			<view class="userInfo_item_textarea">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">联系信息</text>
					<text class="userInfo_item_left_red">*</text>
				</view>
				<view style="margin-top: 20rpx;">
					<u--textarea style="width: 100%;" height="256" v-model="userInfo.contractFirstMessage"
						placeholder="请输入内容" count maxlength="70" fontSize="32rpx"></u--textarea>
				</view>
			</view>
		</view>
		<view class="title">
			<view class="">【30日不签到,次日6:00发遗嘱】</view>
		</view>
		<view class="userInfo">
			<view class="userInfo_item">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">联系人2</text>
				</view>
				<view class="userInfo_item_right">
					<u--input placeholder="请输入联系人2" border="none" inputAlign="right"
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
					<u--input placeholder="请输入联系人2手机号" border="none" inputAlign="right"
						v-model="userInfo.contractSecondPhone" fontSize="32rpx"></u--input>
				</view>
			</view>
			<view class="border_line"></view>
			<view class="userInfo_item">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">联系邮箱2</text>
					<text class="userInfo_item_left_red">*</text>
				</view>
				<view class="userInfo_item_right">
					<u--input placeholder="请输入联系人2邮箱" border="none" inputAlign="right"
						v-model="userInfo.contractSecondEmail" fontSize="32rpx"></u--input>
				</view>
			</view>
			<view class="border_line"></view>
			<view class="userInfo_item">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">联系开关2</text>
					<text class="userInfo_item_left_red">*</text>
				</view>
				<view class="userInfo_item_right">
					<u-switch size="50" v-model="userInfo.contractSecondSwitch" active-color="#26C761" :activeValue="1"
						:inactiveValue="0"></u-switch>
				</view>
			</view>
			<view class="border_line"></view>
			<view class="userInfo_item_textarea">
				<view class="userInfo_item_left">
					<text class="userInfo_item_left_name">联系信息2</text>
					<text class="userInfo_item_left_red">*</text>
				</view>
				<view style="margin-top: 20rpx;">
					<u--textarea style="width: 100%;" height="256" v-model="userInfo.contractSecondMessage"
						placeholder="请输入内容" count maxlength="70" fontSize="32rpx"></u--textarea>
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
	export default {
		data() {
			return {
				userInfo: {},
				value: 1,
				value2: ''
			}
		},
		onLoad() {
			this.getUserInfoData()
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
			saveConfirm() {
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
						title: "请填写姓名",
						icon: 'none',
						duration: 2000
					})
					return false
				}
				if (!this.userInfo.phone) {
					uni.showToast({
						title: "请填写手机号",
						icon: 'none',
						duration: 2000
					})
					return false
				}
				if (!this.userInfo.contractFirstEmail) {
					uni.showToast({
						title: "请填写联系人1邮箱",
						icon: 'none',
						duration: 2000
					})
					return false
				}
				if (!this.userInfo.contractFirstMessage) {
					uni.showToast({
						title: "请填写联系人1联系信息",
						icon: 'none',
						duration: 2000
					})
					return false
				}
				if (!this.userInfo.contractSecondEmail) {
					uni.showToast({
						title: "请填写联系人2邮箱",
						icon: 'none',
						duration: 2000
					})
					return false
				}
				if (!this.userInfo.contractSecondMessage) {
					uni.showToast({
						title: "请填写联系人2联系信息",
						icon: 'none',
						duration: 2000
					})
					return false
				}
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
				}

			},
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20rpx;
		background: #F7F7F7;
		padding-bottom: calc(env(safe-area-inset-bottom));

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
			font-weight: bold;
			font-size: 34rpx;
			color: #151A1E;
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


		.save {
			margin: 44rpx 0;

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
	}
</style>