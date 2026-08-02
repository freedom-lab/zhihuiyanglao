<template>
	<view class="u-page">
		<view class="container">
			<template v-for="item,index in formData.propertyValueList">
				<image v-if="item" class="welfareImg" :src="item" mode="widthFix"></image>
			</template>
		</view>
	</view>
</template>

<script>
	const app = getApp()
	export default {
		data() {
			return {
				paddingTop: 0,
				headerHeight: 0,
				formData: {
					propertyValueList: [],
				}, // 福利中心 设置数据
				propertyValueList: [],
			}
		},
		onLoad() {
			this.getUserInfoData()
		},
		onShow() {
			this.init()
		},
		onPullDownRefresh() {
			this.init()
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
			// 查询用户信息
			async getUserInfoData() {
				const islogin = this.$isLogin()
				if (!islogin) return
				const memberCode = uni.getStorageSync("userInfo").memberCode
				const res = await this.$request("/member/queryOne", {
					memberCode
				})
				if (res.data.code == 200 && res.data.data) {
					this.userInfo = res.data.data
				}
			},
			// 初始化
			init() {
				this.getConfigData()
			},
			async getConfigData() {
				// const inviterUserInfo = uni.getStorageSync("userInfo")
				const params = {
					propertyKey: 'welfare_center',
				}
				const res = await this.$request("/systemConfig/queryOne", params)
				uni.stopPullDownRefresh()
				if (res.data.code == 200 && res.data.data) {
					this.formData = {
						...this.formData,
						...res.data.data,
					};
					if (res.data.data?.propertyValue) {
						this.formData.propertyValueList = res.data.data.propertyValue.split(",");
					}
				}
			},
		}
	}
</script>

<style lang="scss" scoped>
	.u-page {
		width: 100vw;
		height: 100vh;
		// height: 100%;
		box-sizing: border-box;
		padding: 0;
		display: flex;
		flex-direction: column;
	}

	.container {
		width: 100%;
		height: auto;
		flex: 1;
		background: #F7F7F7;
		box-sizing: border-box;
	}

	.welfareImg {
		width: 100%;
		// display: block;
	}
</style>