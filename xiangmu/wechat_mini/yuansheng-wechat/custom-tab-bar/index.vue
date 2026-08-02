<template>
	<view>
		<u-tabbar :value="activeTab" @change="handleTabChange" :fixed="true" :placeholder="true" activeColor="#14d06d"
			:safeAreaInsetBottom="true">
			<u-tabbar-item v-for="(item, index) in tabList" :key="index"
				:text="activeTab === index && index === 0 ? '' : item.text" @click="handleTabClick(item, index)"
				:badge="index == 2 ? messageNum : 0">
				<image class="u-page__item__slot-icon" :class="activeTab === index && index === 0 ? 'active-home' : ''"
					slot="active-icon" :src="item['active-icon']" mode="aspectFit" />
				<image class="u-page__item__slot-icon" slot="inactive-icon" :src="item['inactive-icon']"
					mode="aspectFit" />
			</u-tabbar-item>
		</u-tabbar>
	</view>
</template>

<script>
	const app = getApp()
	export default {
		data() {
			return {
				tabvalue: 0,
				messageNum: 0,
				tabList: [{
						text: '首页',
						url: '/pages/home/home',
						'active-icon': '/static/image/catbglogo.png',
						'inactive-icon': '/static/image/home-2x.png',
					},
					{
						text: '附近',
						url: '/pages/merchant/merchant',
						'active-icon': '/static/image/location-t-2x.png',
						'inactive-icon': '/static/image/location-3x.png',
					},
					{
						text: '我的',
						url: '/pages/my/my',
						'active-icon': '/static/image/my-t-2x.png',
						'inactive-icon': '/static/image/my-3x.png',
					}
				],
				pollTimer: null
			}
		},
		computed: {
			// 计算属性：从app获取全局选中索引
			activeTab: {
				get() {
					this.startPolling()
					return app.globalData.tabvalue || 0;
				},
				set(val) {
					app.globalData.tabvalue = val
				}
			},

		},

		mounted() {
			this.getMessageNum()
		},
		destroyed() {
			this.clearPollTimer()
		},
		methods: {
			clearPollTimer() {
				if (this.pollTimer) {
					clearInterval(this.pollTimer)
					this.pollTimer = null
				}
			},
			// 启动轮询
			startPolling() {
				this.clearPollTimer()
				this.pollTimer = setInterval(() => {
					this.getMessageNum()
				}, 5000)
			},
			async getMessageNum() {
				try {
					const userInfo = uni.getStorageSync("userInfo")
					if (userInfo) {
						const res = await this.$request("/memberMessage/queryList", {
							reciveceCode: userInfo.memberCode,
							isRead: 0
						})
						let msgList = (res && res.data && res.data.data) || []
						let messageNum = Array.isArray(msgList) ? msgList.length : 0
						this.messageNum = messageNum > 99 ? "99+" : messageNum
					} else {
						this.messageNum = 0
					}
				} catch (e) {
					this.messageNum = 0
					console.error('获取消息数量失败:', e)
				}
			},
			handleTabClick(item, index) {
				if (this.activeTab === index) return
				uni.switchTab({
					url: item.url,
				})
			},
			handleTabChange(index) {
				this.tabvalue = index
				this.activeTab = index
				this.getMessageNum()
			},
		}
	}
</script>

<style lang="scss" scoped>
	.u-page__item__slot-icon {
		width: 40rpx;
		height: 40rpx;
		object-fit: scale-down;
	}

	.active-home {
		width: 80rpx;
		height: 80rpx;
		box-shadow: 0 6rpx 12rpx 2rpx rgba(20, 208, 109, 0.3);
		border-radius: 50%;
		transform: translateY(-4rpx);
	}
</style>