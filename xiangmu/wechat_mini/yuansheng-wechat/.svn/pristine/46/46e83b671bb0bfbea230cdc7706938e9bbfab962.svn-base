<template>
	<!-- 页面容器 -->
	<view class="cat-card-page">
		<view style="height: 20rpx;background-color: #f2f2f2;"></view>
		<template v-if="currentCard.cardName">
			<!-- 中间主图区域，支持手指滑动左右切换主图和底部卡片 -->
			<view class="main-card" @touchstart="onMainTouchStart" @touchend="onMainTouchEnd">
				<view class="card-title">{{ currentCard.cardName }}</view>
				<!-- 轮播图：添加 current-swiper-index 关联并监听 -->
				<specialBanner :banner-list="catList" :swiper-config="swiperConfig" :current-index="currentIndex"
					@change="onSwiperChange"></specialBanner>
				<!-- <view class="rare-tag" v-if="currentCard.isRare">
					<image class="xiyou1" src="https://api.ccnet.cc/resources/mini_image/xiyou1.png" mode="aspectFill">
					</image>
				</view> -->
			</view>
			<view class="generate-btn" @click="generatePoster(1)">生成海报</view>
			<!-- 底部横向图片组（支持侧滑+箭头控制） -->
			<view class="bottom-card-group">
				<!-- 左箭头 -->
				<!-- 	<view class="arrow left-arrow">
					<image @click="scrollLeft" src="https://api.ccnet.cc/resources/mini_image/zuojiantou.png" mode="">
					</image>
				</view> -->

				<!-- 横向滚动容器 -->
				<scroll-view class="card-scroll" scroll-x :scroll-left="scrollLeftVal" @scroll="onScroll">
					<view class="card-list">
						<!-- 循环渲染卡片（数据从catList获取） -->
						<view class="card-item" v-for="(item, index) in catList" :key="index"
							@click="selectCat(item, index)">
							<image :src="item.memberCardNum == 0?item.noCardUrl:item.cardUrl"
								:class="['card-item-img', currentIndex == index ? 'activeImage' : '']">
							</image>
							<view class="card-count" v-if="item.memberCardNum">{{ item.memberCardNum }}</view>
							<view :class="['card-name', currentIndex == index ? 'activeName' : '']">
								{{ item.cardName }}
							</view>
							<!-- 稀有标签（按需显示） -->
							<!-- <view class="item-rare-tag" v-if="item.isRare">
								<image class="xiyou2" src="https://api.ccnet.cc/resources/mini_image/xiyou2.png"
									mode="aspectFill">
								</image>
							</view> -->
						</view>
					</view>
				</scroll-view>

				<!-- 右箭头 -->
				<!-- <view class="arrow right-arrow">
					<image @click="scrollRight" src="https://api.ccnet.cc/resources/mini_image/youjiantou.png" mode="">
					</image>
				</view> -->
			</view>

			<!-- 底部操作按钮 -->
			<view class="bottom-btn-group">
				<button class="operate-btn" open-type="share" @click="shareFriend">分享好友</button>
				<button class="operate-btn" @click="generatePoster(2)">保存相册</button>
			</view>
		</template>
	</view>
</template>

<script>
	const app = getApp();
	import specialBanner from '../../components/EtherealWheat-banner/specialBanner.vue'
	export default {
		components: {
			specialBanner
		},
		data() {
			return {
				cardType: 1,
				scrollLeftVal: 0, // scroll-view的滚动距离
				cardWidth: 170, // 单个卡片的宽度（含间距，用于计算滚动步长）
				currentIndex: 0,
				currentCard: {},
				userInfo: {},
				currentCatImg: "https://api.ccnet.cc/resources/mini_image/card1.jpg",
				// 手指滑动坐标
				mainTouchStartX: 0,
				mainTouchStartY: 0,
				mainTouchStartTime: 0, //：触摸开始时间
				swipeConfig: {
					minDistance: 80,
					maxTime: 300,
					maxYRatio: 0.5
				},
				// 底部卡片列表数据（示例）
				catList: [],
				swiperConfig: {
					indicatorDots: false,
					indicatorColor: 'rgba(255, 255, 255, .4)',
					indicatorActiveColor: 'rgba(255, 255, 255, 1)',
					autoplay: false,
					interval: 3000,
					duration: 300,
					circular: false,
					previousMargin: '58rpx',
					nextMargin: '58rpx'
				},
				scrollTimer: null // 防抖定时器
			}
		},
		onLoad(options) {
			console.log(options, '参数');
			let cardType = options.cardType ? options.cardType : 1
			this.cardType = Number(cardType)
			if (cardType == 1) {
				uni.setNavigationBarTitle({
					title: '小猫卡'
				})
			} else {
				uni.setNavigationBarTitle({
					title: '大猫卡'
				})
			}
			console.log(app.globalData, "---");
			const userInfo = uni.getStorageSync("userInfo");
			this.userInfo = userInfo
			this.getCardList(this.cardType)
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
			// 获取猫卡列表
			async getCardList(cardType) {
				const data = {}
				if (this.userInfo && this.userInfo.memberCode) {
					data.memberCode = this.userInfo.memberCode
				}
				data.cardType = cardType
				const res = await this.$request("/card/queryListWithMember", data)
				if (res.data.code == 200) {
					if (res.data.data.length !== 0) {
						this.catList = res.data.data;
						this.currentIndex = 0
						this.currentCard = this.catList[0]
					} else {
						uni.showToast({
							title: "暂无猫卡,敬请期待",
							icon: 'none',
							duration: 2000
						})
					}
				} else {
					uni.showToast({
						title: res.data.message,
						icon: 'none',
						duration: 2000,
					})
				}
				console.log(res, '猫卡');
			},
			// 生成海报
			async generatePoster(type) {
				if (this.currentCard.memberCardNum == 0) {
					return uni.showToast({
						title: '您暂未拥有此卡',
						icon: 'none',
						duration: 2000
					})
				}
				uni.showToast({
					title: "海报生成中...",
					icon: "loading"
				});
				const res = await this.$request("/member/shareQrUrl", {
					memberCode: this.userInfo.memberCode,
					cardCode: this.currentCard.cardCode
				})
				console.log(res, '合成图片');
				uni.hideLoading();
				if (res.data.code == 200) {
					if (type == 1) {
						uni.navigateTo({
							url: `/subPages/cardUrl/cardUrl?url=${decodeURIComponent(res.data.data)}`
						})
					} else {
						this.saveAblum(res.data.data)
					}
				} else {
					uni.showToast({
						title: res.data.message,
						icon: "none",
						duration: 2000
					})
				}
			},
			saveAblum(url) {
				let _this = this
				uni.showModal({
					title: "温馨提示",
					content: "确认要保存到相册吗？",
					complete(res) {
						if (res.confirm) {
							uni.downloadFile({
								url: url,
								success: res => {
									if (res.statusCode === 200) {
										uni.saveImageToPhotosAlbum({
											filePath: res.tempFilePath,
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
			// 选择底部卡片
			selectCat(item, index) {

				this.currentCard = {
					...item
				}; // 避免引用问题
				this.currentIndex = index;
				// 同步滚动到底部选中卡片位置
				this.scrollToIndex(index);
			},
			// 轮播切换的回调：让底部小卡和大图都同步
			onSwiperChange(index) {
				// index为轮播组件传回的新索引
				if (index !== this.currentIndex) {
					this.currentIndex = index;
					this.currentCard = {
						...this.catList[index]
					};
					this.scrollToIndex(index);
				}
			},
			// 左箭头：向左滚动
			scrollLeft() {
				this.scrollLeftVal = Math.max(0, this.scrollLeftVal - this.cardWidth * 2);
			},
			// 右箭头：向右滚动
			scrollRight() {
				this.scrollLeftVal += this.cardWidth;
			},
			// 监听scroll-view滚动（同步scrollLeftVal）
			onScroll(e) {
				this.scrollLeftVal = e.detail.scrollLeft;
			},
			// 分享好友
			shareFriend() {
				uni.share({
					title: "我获得了一张中华白猫卡片！",
					imageUrl: this.currentCatImg,
					success: () => {
						uni.showToast({
							title: "分享成功"
						});
					}
				});
			},
			// 保存到相册
			saveToAlbum() {
				let _this = this
				uni.showModal({
					title: "温馨提示",
					content: "确认要保存到相册吗？",
					complete: (res) => {
						uni.downloadFile({
							url: _this.currentCard.cardUrl,
							success: (res) => {
								uni.saveImageToPhotosAlbum({
									filePath: res.tempFilePath,
									success: () => {
										uni.showToast({
											title: "已保存到相册"
										});
									}
								});
							}
						});
					}
				})
			},
			// 手指在主图区域按下
			onMainTouchStart(e) {
				let touch = e.touches[0];
				this.mainTouchStartX = touch.clientX;
				this.mainTouchStartY = touch.clientY;
				this.mainTouchStartTime = Date.now();
			},
			// 优化后的触摸结束
			onMainTouchEnd(e) {
				let touch = null;
				if (e.changedTouches && e.changedTouches.length) {
					touch = e.changedTouches[0];
				} else {
					return;
				}
				const swipeTime = Date.now() - this.mainTouchStartTime;
				const deltaX = touch.clientX - this.mainTouchStartX;
				const deltaY = touch.clientY - this.mainTouchStartY;
				const absDeltaX = Math.abs(deltaX);
				const absDeltaY = Math.abs(deltaY);

				if (
					swipeTime < this.swipeConfig.maxTime &&
					absDeltaX > this.swipeConfig.minDistance &&
					absDeltaY / absDeltaX < this.swipeConfig.maxYRatio
				) {
					if (deltaX < 0) {
						this.showNextCard();
					} else {
						this.showPrevCard();
					}
				}
			},
			showNextCard() {
				if (this.currentIndex < this.catList.length - 1) {
					this.selectCat(this.catList[this.currentIndex + 1], this.currentIndex + 1);
				} else {
					uni.showToast({
						title: '已经是最后一张',
						icon: 'none'
					});
				}
			},
			showPrevCard() {
				if (this.currentIndex > 0) {
					this.selectCat(this.catList[this.currentIndex - 1], this.currentIndex - 1);
				} else {
					uni.showToast({
						title: '已经是第一张',
						icon: 'none'
					});
				}
			},
			// 控制 scroll-view 滚到选中卡片可见
			scrollToIndex(targetIndex) {
				clearTimeout(this.scrollTimer);
				this.scrollTimer = setTimeout(() => {
					this.scrollLeftVal = Math.max(0, (targetIndex - 1) * this.cardWidth);
				}, 100);
			}
		}
	}
</script>

<style lang="scss" scoped>
	.xiyou1 {
		width: 152rpx;
		height: 80rpx
	}

	.cat-card-page {
		color: #000;
		min-height: 100vh;
		background-color: #fff;
		background-repeat: no-repeat;
		background-position: center center;
		background-size: cover;
		background-attachment: fixed;
		background-origin: padding-box;
	}

	.nav-bar {
		display: flex;
		align-items: center;
		justify-content: space-between;
		padding: 20rpx 30rpx;
		font-size: 32rpx;
	}

	.back-btn {
		font-size: 40rpx;
	}

	.title {
		font-weight: bold;
	}

	.main-card {
		display: flex;
		flex-direction: column;
		align-items: center;
		position: relative;
	}

	.card-title {
		font-size: 32rpx;
		font-weight: bold;
		margin-top: 40rpx;
		margin-bottom: 20rpx;
	}

	.main-img {
		width: 528rpx;
		height: auto;
		border-radius: 20rpx;
		border: 20rpx solid #fff;
	}

	.rare-tag {
		position: absolute;
		bottom: 20rpx;
	}

	.generate-btn {
		width: 248rpx;
		text-align: center;
		margin: 0rpx auto 30rpx auto;
		font-size: 32rpx;
		font-weight: bold;
		color: #FFFFFF;
		background: #22c55e;
		border-radius: 58rpx 58rpx 58rpx 58rpx;
		padding: 16rpx 0;
		// box-shadow: 5rpx 10rpx 10rpx #f2f2f2;
		// border: 2rpx solid #555555;
	}

	.bottom-card-group {
		display: flex;
		align-items: center;
		padding: 0 20rpx;
		margin: 20rpx 0;
		background-color: #fff;
	}

	.arrow {
		font-size: 40rpx;
		padding: 0 10rpx;
		cursor: pointer;
		margin-bottom: 40rpx;

		image {
			width: 38rpx;
			height: 38rpx;
		}
	}

	.card-scroll {
		flex: 1;
		white-space: nowrap;
		overflow: hidden;
		background-color: #FFFFFF;
	}

	.card-list {
		display: inline-flex;
		gap: 20rpx;
	}

	.card-item {
		display: flex;
		flex-direction: column;
		align-items: center;
		width: 150rpx;
		position: relative;
	}

	.card-item-img {
		width: 118rpx;
		height: 158rpx;
		border-radius: 20rpx;
		border: 2px solid #555555;
	}

	.card-count {
		position: absolute;
		top: 0rpx;
		right: 0rpx;
		color: #f40;
		font-size: 22rpx;
		text-align: center;
		border-radius: 50%;
		width: 36rpx;
		height: 36rpx;
		line-height: 36rpx;
		background: #F9B37F;
	}

	.card-name {
		font-size: 26rpx;
		margin-top: 10rpx;
	}

	.item-rare-tag {
		position: absolute;
		left: 10rpx;
		top: 0;

		image {
			width: 66rpx;
			height: 36rpx;
		}
	}

	.bottom-btn-group {
		display: flex;
		background-color: #f2f2f2;
		justify-content: space-around;
		padding: 30rpx 0;
		position: fixed;
		width: 100%;
		bottom: 0;
	}

	.operate-btn {
		margin: 0;
		background-color: #22c55e;
		color: #fff;
		border: 1px solid #fff;
		padding: 0 80rpx;
		border-radius: 60rpx;
		font-size: 32rpx;
		font-weight: bold;
	}

	::v-deep wx-button {
		line-height: 80rpx !important;
	}

	.operate-btn::after {
		line-height: 0 !important;
	}

	.activeImage {
		border: 2px solid #F6AF8B;
	}

	.activeName {
		color: #22c55e;
	}
</style>