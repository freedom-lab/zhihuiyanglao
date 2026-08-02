<template>
	<view class="u-page">
		<view class="current-area">
			<u-icon name="map-fill" size="40"></u-icon>
			<text>{{curareaData.name}}</text>
		</view>
		<view class="search-area">
			<u-search placeholder="搜索市区" v-model="keyword" searchIconSize="30" bgColor="#fff" @search="search"
				height="60" :showAction="false" shape="square"></u-search>
		</view>
		<uni-indexed-list ref="u-indexedList" :options="areaoptions" :showSelect="false"
			@click="selectArea"></uni-indexed-list>
	</view>
</template>

<script>
	const app = getApp()
	let dom
	import * as dealwithAreaList from '../../utils/areaList.js'
	// #ifdef APP-NVUE
	dom = weex.requireModule('dom');
	// #endif
	export default {
		data() {
			return {
				// indexList: ["A", "B", "C", "D", "F", "G", "H", "J", "K", "L", "N", "P", "Q", "S", "T", "U", "W", "X", "Y", "Z"],
				indexList: ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
					"T", "U", "V", "W", "X", "Y", "Z"
				],
				itemArr: [],
				areaList: [], //市级数据列表
				curareaData: {},
				areaoptions: [],
				groupObj: {}, //市级数据ABC分组
				keyword: '', //搜索关键字
			}
		},
		onLoad() {
			this.getAreaList()
		},
		onShow() {
			this.curareaData = uni.getStorageSync("curareaData")
			// console.log('石家庄市：',this.curareaData)
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
			async getAreaList() {
				// const memberCode = uni.getStorageSync("userInfo").memberCode
				const params = {
					name: this.keyword
				}
				this.areaList = []
				const res = await this.$request("/area/queryListAndChild", params)
				if (res.data.code == 200 && res.data.data) {
					const areaData = res.data.data
					if (areaData.length > 0) {
						areaData.forEach(item => {
							const handledchild = item.child.map(citem => {
								citem.child = null
								return citem
							})
							this.areaList = this.areaList.concat(handledchild)
						})
						const groupCityByLetter = dealwithAreaList.groupCityByLetter(this.areaList, 'name')
						this.$nextTick(() => {
							this.areaoptions = groupCityByLetter.options
							this.groupObj = groupCityByLetter.groupObj
							this.areaList = groupCityByLetter.cityList
							console.log(this.areaList, '结果：', this.areaoptions, this.groupObj)
						})
					} else {
						this.areaoptions = []
					}
				}
			},
			selectArea(e) {
				const itemIndex = e.item.itemIndex
				const objKey = e.item.key
				this.curareaData = this.groupObj[objKey]?.find(item => item.name == e.item.name) || {}
				// console.log(e,'选中：',itemIndex,objKey,this.curareaData,'离谱排序：',this.groupObj[objKey]?.[itemIndex])
				uni.setStorageSync("areachanged", true)
				uni.setStorageSync("curareaData", this.curareaData)
				uni.navigateBack()
			},
			search() {
				this.getAreaList()
				return
				if (this.keyword) {
					const firstLetter = dealwithAreaList.getChinesePinyinAbbreviation(this.keyword)
					const Alist = dealwithAreaList.PINYIN_INITIAL_CONSONANT_LETTERS
					const Aindex = Alist.findIndex((ii) => ii == firstLetter) //首字母位置
					console.log(this.keyword, '待搜索的首字母：', firstLetter, '|', Alist, Aindex)
					const ilistobj = this.$refs['u-indexedList']
					const data = {
						winOffsetY: ilistobj.winOffsetY,
						itemHeight: ilistobj.itemHeight,
						lists: ilistobj.lists,
					}
					// 模拟跳转高度
					let indexpageY = Aindex * data.itemHeight + data.winOffsetY + 2
					const targetIndex = data.lists[Aindex].items.findIndex(iii => iii.name.includes(this.keyword.charAt(
						0)))
					const targetpageY = targetIndex * 51
					this.$refs['u-indexedList'].touchStart({
						pageY: indexpageY,
						touches: [{
							pageY: indexpageY
						}]
					})
					setTimeout(() => {
						// uni.pageScrollTo({
						//     scrollTop: targetpageY, // 向下滚动100px（scrollTop是页面滚动的距离，值越大越靠下）
						//     duration: 300, // 滚动动画时长（毫秒），0为无动画，可选
						//     success: () => {
						//       console.log(`滚动到${targetpageY}px位置成功`);
						//     },
						//     fail: (err) => {
						//       console.error('滚动失败：', err);
						//     }
						// });
						this.$refs['u-indexedList'].touchEnd()
					}, 300)
					console.log('sho手动： ', data, targetIndex, targetpageY)
					if (dom) {
						dom.scrollToElement(this.$refs['u-indexedList'].$refs['uni-indexed-list-' + Aindex][0], {
							animated: false
						})
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

		::v-deep .uni-indexed-list {
			top: 160rpx;
		}

		// ::v-deep .uni-indexed-list__menu{
		// 	padding-bottom: 60rpx;
		// 	height: 80%;
		// }
		// ::v-deep .uni-indexed-list__menu-item{
		// 	flex: initial;
		// 	height: 56rpx;
		// }
	}

	.current-area {
		display: flex;
		height: 80rpx;
		align-items: center;
		gap: 8rpx;
		color: #2f2f2f;
		font-size: 32rpx;
		font-weight: bold;
		background-color: #fff;
		padding: 10rpx 20rpx;
	}

	::v-deep .u-index-list {
		.vue-ref {
			max-height: unset !important;
		}
	}

	.list-cell {
		display: flex;
		box-sizing: border-box;
		width: 100%;
		padding: 10px 24rpx;
		overflow: hidden;
		color: #323233;
		font-size: 14px;
		line-height: 24px;
		background-color: #fff;
	}
</style>