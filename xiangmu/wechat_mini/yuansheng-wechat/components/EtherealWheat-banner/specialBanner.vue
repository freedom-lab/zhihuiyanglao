<template>
	<div class="banner-container">
		<swiper :current="curIndex" :style="{width: '100vw', height: '57vh'}"
			:indicator-dots="swiperConfig.indicatorDots" :indicator-color="swiperConfig.indicatorColor"
			:indicator-active-color="swiperConfig.indicatorActiveColor" :autoplay="swiperConfig.autoplay"
			:interval="swiperConfig.interval" :duration="swiperConfig.duration" :circular="swiperConfig.circular"
			:previous-margin="swiperConfig.previousMargin" :next-margin="swiperConfig.nextMargin" @change="swiperChange"
			@animationfinish="animationfinish">
			<swiper-item v-for="(item, i) in bannerList" :key="i">
				<div class="image-container"
					:class="[curIndex===0?((i===listLen-1)?'item-left':(i===1?'item-right':'item-center')):(curIndex===listLen-1?(i===0?'item-right':(i===listLen-2?'item-left':'item-center')):(i===curIndex-1?'item-left':(i===curIndex+1?'item-right':'item-center')))]">
					<image :src="item.memberCardNum == 0?item.noCardUrl:item.cardUrl" class="slide-image" :style="{
              transform: curIndex===i?'scale(' + scaleX + ',' + scaleY + ')':'scale(1,1)',
              transitionDuration: '.3s',
              transitionTimingFunction: 'ease'
            }" mode="widthFix" />
				</div>
			</swiper-item>
		</swiper>
	</div>
</template>
<script>
	export default {
		props: {
			bannerList: {
				type: Array,
				default () {
					return []
				}
			},
			swiperConfig: {
				type: Object,
				default () {
					return {
						indicatorDots: true,
						indicatorColor: 'rgba(255, 255, 255, .4)',
						indicatorActiveColor: 'rgba(255, 255, 255, 1)',
						autoplay: false,
						interval: 3000,
						duration: 300,
						circular: true,
						previousMargin: '58rpx',
						nextMargin: '58rpx'
					}
				}
			},
			scaleX: {
				type: String,
				default: (634 / 600).toFixed(4)
			},
			scaleY: {
				type: String,
				default: (378 / 350).toFixed(4)
			},
			// 新增：接收父组件传入的当前索引
			currentIndex: {
				type: Number,
				default: 0
			}
		},
		computed: {
			listLen() {
				return this.bannerList.length
			}
		},
		data() {
			return {
				curIndex: 0,
				descIndex: 0,
				isDescAnimating: false
			}
		},
		// 新增：监听父组件传入的currentIndex变化，同步更新子组件curIndex
		watch: {
			currentIndex(newVal) {
				this.curIndex = newVal;
				this.descIndex = newVal; // 同步描述索引（如果需要）
				console.log(this.bannerList, 'bannerList');
			}
		},
		methods: {
			swiperChange(e) {
				const that = this
				this.curIndex = e.mp.detail.current
				this.isDescAnimating = true
				// 新增：向父组件派发索引变化事件
				this.$emit('change', this.curIndex);
				let timer = setTimeout(function() {
					that.descIndex = e.mp.detail.current
					clearTimeout(timer)
				}, 150)
			},
			animationfinish(e) {
				this.isDescAnimating = false
			},
			getBannerDetail(index) {
				uni.showLoading({
					title: '将前往详情页面',
					duration: 2000,
					mask: true
				})
			}
		}
	}
</script>
<style lang="scss" scoped>
	.banner-container {
		.image-container {
			box-sizing: border-box;
			width: 100%;
			height: 100%;
			display: flex;

			.slide-image {
				width: 520rpx;
				height: auto;
				border-radius: 20rpx;
				border: 20rpx solid #555555;
				z-index: 200;
			}
		}

		.item-left {
			justify-content: flex-end;
			padding: 56rpx 30rpx 0 0;
		}

		.item-right {
			justify-content: flex-start;
			padding: 56rpx 0 0 30rpx;
		}

		.item-center {
			justify-content: center;
			padding: 56rpx 0 0 0;
		}

		.desc-wrap {
			box-sizing: border-box;
			width: 100%;
			height: 98rpx;
			padding: 24rpx 66rpx 0;

			.title {
				width: 100%;
				height: 42rpx;
				line-height: 42rpx;
				color: #222222;
				font-size: 30rpx;
				font-family: 'PingFangTC-Regular';
				font-weight: 600;
				text-align: left;
			}

			.desc {
				margin-top: 4rpx;
				width: 100%;
				height: 34rpx;
				line-height: 34rpx;
				color: #999999;
				font-size: 24rpx;
				font-family: 'PingFangTC-Regular';
				text-align: left;
			}
		}

		@keyframes descAnimation {
			0% {
				opacity: 1;
			}

			25% {
				opacity: .5;
			}

			50% {
				opacity: 0;
			}

			75% {
				opacity: .5;
			}

			100% {
				opacity: 1;
			}
		}

		@-webkit-keyframes descAnimation {
			0% {
				opacity: 1;
			}

			25% {
				opacity: .5;
			}

			50% {
				opacity: 0;
			}

			75% {
				opacity: .5;
			}

			100% {
				opacity: 1;
			}
		}

		.hideAndShowDesc {
			animation: descAnimation .3s ease 1;
			-webkit-animation: descAnimation .3s ease 1;
		}
	}
</style>