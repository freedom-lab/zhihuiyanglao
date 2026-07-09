<template>
	<view class="container">
		<!-- 图片容器：占满可视区域（除底部按钮） -->
		<view style="height: 20rpx;background-color: #f2f2f2;"></view>
		<view class="img-wrapper">
			<image :src="url" mode="aspectFit" class=" poster-img"></image>
		</view>
		<view class="bottom-btn-group">
			<button class="operate-btn" @click="saveToAlbum">保存海报到相册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				url: ""
			}
		},
		onLoad(options) {
			this.url = decodeURI(options.url)
		},
		onShareAppMessage(res) {
			if (res.from === 'button') {
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
			// 保存到相册（逻辑不变，仅优化异常处理）
			saveToAlbum() {
				let _this = this
				uni.showModal({
					title: "温馨提示",
					content: "确认要保存到相册吗？",
					success: (res) => { // 替换complete为success，避免取消时也执行下载
						if (res.confirm) {
							uni.showLoading({
								title: '保存中...'
							})
							uni.downloadFile({
								url: _this.url,
								success: (res) => {
									if (res.statusCode === 200) { // 增加状态码校验
										uni.saveImageToPhotosAlbum({
											filePath: res.tempFilePath,
											success: () => {
												uni.hideLoading()
												uni.showToast({
													title: "已保存到相册",
													icon: "success"
												});
											},
											fail: (err) => {
												uni.hideLoading()
												uni.showToast({
													title: "保存失败：" + err
														.errMsg,
													icon: "none"
												});
											}
										});
									} else {
										uni.hideLoading()
										uni.showToast({
											title: "图片下载失败",
											icon: "none"
										});
									}
								},
								fail: (err) => {
									uni.hideLoading()
									uni.showToast({
										title: "下载失败：" + err.errMsg,
										icon: "none"
									});
								}
							});
						}
					}
				})
			},
		}
	}
</script>

<style scoped>
	/* 外层容器：占满整个屏幕，flex布局，方向垂直 */
	.container {
		width: 100vw;
		height: 100vh;
		display: flex;
		flex-direction: column;
		box-sizing: border-box;
		overflow: hidden;
		background-color: #fff;
		/* 防止整体滚动 */
	}

	/* 图片容器：填充除底部按钮外的所有空间 */
	.img-wrapper {
		flex: 1;
		/* 自动占满剩余高度 */
		width: 100%;
		overflow: hidden;
		/* 隐藏图片超出部分 */
		display: flex;
		justify-content: center;
		align-items: center;
		background-color: #f5f5f5;
		/* 图片加载前的背景色 */
	}

	/* 海报图片：铺满容器，保持比例 */
	.poster-img {
		width: 100%;
		height: 100%;
		object-fit: contain;
		/* 铺满容器且保持比例，超出部分裁剪 */
		/* 如果需要完整显示图片（不裁剪），替换为 object-fit: contain; */
	}

	/* 底部按钮组：固定在底部，不占flex空间 */
	.bottom-btn-group {
		width: 100%;
		/* padding: 15rpx 0 calc(env(safe-area-inset-bottom)) 0; */
		padding: 30rpx 0;
		background-color: #f2f2f2;
		box-sizing: border-box;
		z-index: 10;
		/* 保证按钮在最上层 */
	}

	.operate-btn {
		margin: 0 auto;
		width: 80%;
		background-color: #22c55e;
		color: #fff;
		border: 1px solid #fff;
		border-radius: 60rpx;
		font-size: 32rpx;
		font-weight: bold;
		/* padding: 8rpx 0; */
		/* 增加内边距，优化点击体验 */
	}

	::v-deep wx-button {
		line-height: 80rpx !important;
	}
</style>