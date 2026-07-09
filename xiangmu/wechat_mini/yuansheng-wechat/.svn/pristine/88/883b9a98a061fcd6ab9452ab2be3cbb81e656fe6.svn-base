<template>
	<view class="container">
		<web-view :src="url"></web-view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				url: ""
			}
		},
		onLoad() {
			this.getWechatSetting()
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
			// 查询公众号地址配置
			async getWechatSetting() {
				const res = await this.$request("/systemConfig/queryOne", {
					propertyKey: 'wechat_setting'
				})
				console.log(res, '-----');

				if (res.data.code == 200 && res.data.data.propertyValue) {
					this.url = res.data.data.propertyValue
				}
			},
		}
	}
</script>

<style>
	.container {
		padding: 20px;

	}
</style>