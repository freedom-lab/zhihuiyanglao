<template>
	<view class="u-page">
		<view>
			<u-navbar style="color: #fff;" title="我的二维码" bgColor="#22C55E" leftIconSize="40" leftIconColor="#fff"
				@leftClick="backClick" :titleStyle="titleStyle">
			</u-navbar>
		</view>
		<view class="invite">
			<view class="invite_top" :style="{ paddingTop: paddingTop + 60 + 'px' }">
				<view class="invite_top_title">
					<view class="invite_top_title_one">邀请好友 共享收益</view>
					<view class="invite_top_title_two">每邀1位好友，得1张小猫卡</view>
				</view>
			</view>
			<view class="invite_code">
				<view class="invite_code_back" id="targetId">
					<view class="invite_code_back_white">
						<view class="invite_code_back_white_top">
							<image style="width: 100rpx;height: 100rpx;margin-right: 24rpx;border-radius: 50%;"
								:src="userInfo.avatar" mode="aspectFit"></image>
							<view class="">
								<view class="quanqiu">我是{{ userInfo.memeberName }}</view>
								<view class="yiyou">邀你一起签到猫</view>
							</view>
						</view>
						<image style="width: 500rpx;height: 500rpx;margin: 50rpx auto;" :src="userInfo.inviterQrCode"
							mode="aspectFill">
						</image>
						<view class="qiandao">共建共享反内卷新电商平台</view>
					</view>
					<view class="fuwu">签到猫｜反内卷新电商</view>
				</view>
			</view>
		</view>
		<view class="bottom">
			<view class="bottom_button">
				<button class="bottom_button_one" open-type="share">分享好友</button>
				<button class="bottom_button_two" @click="saveToAlbumByApi">保存相册</button>
			</view>
		</view>
		<canvas canvas-id="temp_canvas_id" class="temp-canvas"></canvas>
	</view>
</template>

<script>
	const app = getApp();
	export default {
		data() {
			return {
				paddingTop: 0,
				headerHeight: 0,
				screenHeight: 0,
				topHeight: 0,
				userInfo: {},
				titleStyle: {
					'font-weight': 'bold',
					'font-size': '36rpx',
				}
			}
		},
		onLoad() {
			this.paddingTop = app.globalData.deviceInfo.statusBarHeight;
			this.headerHeight = app.globalData.headerHeight;
			this.screenHeight = app.globalData.deviceInfo.screenHeight;
			this.getUserInfoData()
		},
		onShareAppMessage(res) {
			if (res.from === 'button') {
				console.log(res.target)
			}
			return {
				title: `我是${this.userInfo.memeberName},邀你使用签到猫`,
				path: `/pages/home/home?inviterCode=${this.userInfo.memberCode}`,
				imageUrl: "https://api.ccnet.cc/resources/mini_image/share1.png"
			}
		},
		methods: {
			backClick() {
				const pages = getCurrentPages();
				if (pages.length > 1) {
					uni.navigateBack();
				} else {
					uni.switchTab({
						url: '/pages/home/home'
					});
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
			// 通过接口合成获取
			async saveToAlbumByApi() {
				const data = {}
				const res = await this.$request("/member/inviterCodeImerge", {
					memberCode: this.userInfo.memberCode
				})
				if (res.data.code == 200 && res.data.data) {
					this.saveAblum(res.data.data)
				} else {
					uni.showToast({
						title: res.data.message,
						icon: "none",
						duration: 2000
					})
				}
			},

			/**
			 * 合成id为targetId的元素为图片到相册
			 */
			async saveTargetToAlbum() {
				try {
					// 等待图片加载完成
					await new Promise(resolve => setTimeout(resolve, 500));

					const query = uni.createSelectorQuery().in(this);
					// 获取元素尺寸
					const rect = await new Promise((resolve, reject) => {
						query.select('#targetId')
							.boundingClientRect(res => {
								if (res) resolve(res);
								else reject(new Error('未找到页面元素'));
							})
							.exec();
					});
					const width = rect.width;
					const height = rect.height + 20;

					// 向canvas绘制页面内容。注意：uni-app/微信小程序不能真正渲染页面为canvas图片，需自行重新绘制内容和图片
					const ctx = uni.createCanvasContext('temp_canvas_id', this);

					// 填充背景
					ctx.setFillStyle('#404040');
					ctx.fillRect(0, 0, width, height);

					// draw white panel
					const panelMargin = 40;
					const panelRadius = 20;
					const panelPadding = 42;
					const panelStartY = 80;
					const panelHeight = height - panelStartY - 54;
					const panelWidth = width - panelMargin * 2;

					// Draw rounded rectangle for the white area
					function drawRoundRect(ctx, x, y, w, h, r, color) {
						ctx.save();
						ctx.setFillStyle(color);
						ctx.beginPath();
						ctx.moveTo(x + r, y);
						ctx.arcTo(x + w, y, x + w, y + h, r);
						ctx.arcTo(x + w, y + h, x, y + h, r);
						ctx.arcTo(x, y + h, x, y, r);
						ctx.arcTo(x, y, x + w, y, r);
						ctx.closePath();
						ctx.fill();
						ctx.restore();
					}
					drawRoundRect(ctx, panelMargin, panelStartY, panelWidth, panelHeight, panelRadius, "#fff");

					// 绘制头像
					const avatarSize = 50;
					const avatarMarginRight = 12;
					const avatarX = panelMargin + panelPadding;
					const avatarY = panelStartY + panelPadding;
					const avatarUrl = this.userInfo.avatar;
					await new Promise((resolve) => {
						uni.getImageInfo({
							src: avatarUrl,
							success: (res) => {
								ctx.save();
								ctx.beginPath();
								ctx.arc(avatarX + avatarSize / 2, avatarY + avatarSize / 2,
									avatarSize / 2, 0, 2 * Math.PI);
								ctx.closePath();
								ctx.clip();
								ctx.drawImage(res.path, avatarX, avatarY, avatarSize, avatarSize);
								ctx.restore();
								resolve();
							},
							fail: resolve
						});
					});

					// 绘制"我是xxx"文字
					const nameX = avatarX + avatarSize + avatarMarginRight;
					const nameY = avatarY + 12;
					ctx.setFontSize(16);
					ctx.setFillStyle("#333");
					ctx.setTextAlign("left");
					ctx.fillText("我是" + (this.userInfo.memeberName || ""), nameX, nameY + 12);

					ctx.setFontSize(12);
					ctx.setFillStyle("#A8A8A8");
					ctx.fillText("邀你一起共建共享签到猫", nameX, nameY + 28);

					// 绘制二维码图片
					const qrSizeX = 240;
					const qrSizeY = 258;
					const qrX = panelMargin + (panelWidth - qrSizeX) / 2;
					const qrY = avatarY + avatarSize + 5;
					const qrUrl = this.userInfo.inviterQrCode;
					await new Promise((resolve) => {
						uni.getImageInfo({
							src: qrUrl,
							success: (res) => {
								ctx.drawImage(res.path, qrX, qrY, qrSizeX, qrSizeY);
								resolve();
							},
							fail: resolve
						});
					});

					// 绘制底部文案
					ctx.setFontSize(14);
					ctx.setFillStyle("#A8A8A8");
					ctx.setTextAlign("center");
					ctx.fillText("共建共享全球数字服务平台", width / 2, qrY + qrSizeY + 15);

					ctx.setFontSize(12);
					ctx.setFillStyle("#A3A3A3");
					ctx.setTextAlign("center");
					ctx.fillText("签到猫｜全球数字服务网", width / 2, qrY + qrSizeY + 70);

					// 执行绘图
					await new Promise(resolve => {
						ctx.draw(false, resolve);
					});

					// 导出图片
					await new Promise((resolve, reject) => {
						uni.canvasToTempFilePath({
							x: 0,
							y: 0,
							width: width,
							height: height,
							destWidth: width * 2,
							destHeight: height * 2,
							canvasId: 'temp_canvas_id',
							success: async (res) => {
								console.log(res.tempFilePath)
								await this.saveImageToAlbum(res.tempFilePath);
								uni.showToast({
									title: '保存成功',
									icon: 'success'
								});
								resolve();
							},
							fail: reject
						}, this)
					});
				} catch (err) {
					console.error('保存失败', err);
					// 降级：仅保存二维码
					this.saveAblum();
				}
			},

			/**
			 * 保存图片到相册
			 */
			saveImageToAlbum(tempFilePath) {
				return new Promise((resolve, reject) => {
					uni.getSetting({
						success: (res) => {
							if (!res.authSetting['scope.writePhotosAlbum']) {
								uni.authorize({
									scope: 'scope.writePhotosAlbum',
									success: () => this.saveImage(tempFilePath, resolve,
										reject),
									fail: () => {
										uni.showModal({
											title: '提示',
											content: '需要授权保存图片到相册，请前往设置开启',
											confirmText: '去设置',
											success: (modalRes) => {
												if (modalRes.confirm) uni
													.openSetting();
												reject(new Error('用户拒绝授权'));
											}
										});
									}
								});
							} else {
								this.saveImage(tempFilePath, resolve, reject);
							}
						},
						fail: (err) => reject(err)
					});
				});
			},

			saveImage(tempFilePath, resolve, reject) {
				uni.saveImageToPhotosAlbum({
					filePath: tempFilePath,
					success: () => resolve(),
					fail: (err) => reject(err)
				});
			},

			// 降级方案：单独保存二维码
			saveAblum(url) {
				let _this = this
				uni.showModal({
					title: "温馨提示",
					content: "确认要保存到相册吗？",
					complete(res) {
						if (res.confirm) {
							uni.downloadFile({
								url,
								success: result => {
									if (result.statusCode === 200) {
										uni.saveImageToPhotosAlbum({
											filePath: result.tempFilePath,
											success: function() {
												uni.showToast({
													title: '保存成功',
													icon: 'none',
												});
											},
											fail: function(e) {
												uni.showToast({
													title: '取消保存',
													icon: 'none',
												});
											}
										});
									}
								}
							});
						}
					}
				})
			},
		}
	}
</script>

<style lang="scss" scoped>
	.u-page {
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
	}

	::v-deep .u-navbar__content__title {
		color: #fff !important;
	}

	.temp-canvas {
		position: fixed;
		top: -9999rpx;
		left: -9999rpx;
		width: 1000rpx;
		height: 1500rpx;
		opacity: 0;
		z-index: -9999;
	}

	.invite {
		&_top {
			background: #22C55E;
			padding: 20rpx 20rpx 100rpx 20rpx;

			&_title {
				color: #FFFFFF;
				background: #2dd06e;
				width: 94%;
				padding: 16rpx 0;
				text-align: center;
				margin: 0 auto;
				border-radius: 24rpx;

				&_one {
					letter-spacing: 8rpx;
					font-weight: bold;
					font-size: 40rpx;
				}

				&_two {
					letter-spacing: 5rpx;
					font-weight: 500;
					margin-top: 8rpx;
					font-size: 28rpx;
				}
			}
		}

		&_code {
			position: relative;
			top: -60rpx;
			padding: 0 20rpx;

			&_back {
				background: #404040;
				border-radius: 10rpx;
				padding: 80rpx 40rpx 64rpx 40rpx;

				&_white {
					background: #fff;
					border-radius: 20rpx;
					padding: 44rpx 42rpx 48rpx 42rpx;
					display: flex;
					flex-flow: column;
					align-items: center;
					justify-content: center;

					&_top {
						display: flex;
						align-items: center;
					}
				}
			}
		}
	}

	.bottom {
		width: 100%;
		position: fixed;
		bottom: calc(env(safe-area-inset-bottom));
		background-color: #fff;

		&_button {
			display: flex;
			justify-content: space-around;
			align-items: center;
			font-weight: bold;
			font-size: 42rpx;
			color: #FFFFFF;
			text-align: center;
			padding: 20rpx 0 30rpx 0;

			&_one {
				background: #26C761;
				color: #fff !important;
				border-radius: 44rpx;
				padding: 0 56rpx;
				margin: 0 !important;
				box-shadow: 5rpx 5rpx 5rpx 5rpx #ccc;
			}

			&_one::after {
				border: none;
				margin: 0;
				padding: 0;
			}

			&_two {
				background: #FFBB01;
				color: #fff !important;
				border-radius: 44rpx;
				padding: 0 56rpx;
				margin: 0 !important;
				box-shadow: 5rpx 5rpx 5rpx 5rpx #ccc;
			}

			&_two::after {
				border: none;
				margin: 0;
				padding: 0;
			}
		}
	}

	.quanqiu {
		font-weight: bold;
		font-size: 36rpx;
		color: #333333;
	}

	.yiyou {
		font-weight: normal;
		font-size: 28rpx;
		color: #A8A8A8;
		margin-top: 8rpx;
	}

	.qiandao {
		font-weight: normal;
		font-size: 28rpx;
		color: #A8A8A8;
		text-align: center;
	}

	.fuwu {
		font-weight: normal;
		font-style: italic;
		font-size: 28rpx;
		color: #A3A3A3;
		text-align: center;
		margin-top: 32rpx;
	}
</style>