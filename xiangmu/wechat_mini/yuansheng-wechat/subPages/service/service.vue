<template>
	<view class="container">

		<view v-html="text">

		</view>

	</view>
</template>

<script>
	export default {
		data() {
			return {
				type: 1,
				text: '',
			}
		},
		onLoad(option) {
			this.type = option.type
			uni.setNavigationBarTitle({
				title: this.type == 1 ? '签到猫用户协议' : '隐私政策'
			})
			this.getService()
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
			async getService() {
				const res = await this.$request("/systemConfig/queryOne", {
					propertyKey: this.type == 1 ? 'peopleService' : 'privateService'
				})
				if (res.data.code == 200 && res.data.data) {
					this.text = res.data.data.propertyValue || ''
				}
			},
		}
	}
</script>

<style>
	.container {
		padding: 20px;
		font-size: 14px;
		line-height: 24px;
	}
</style>