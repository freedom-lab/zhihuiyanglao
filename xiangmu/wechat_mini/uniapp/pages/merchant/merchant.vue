<template>
	<view class="u-page" :style="{ 'paddingTop': paddingTop + 'px' }">
		<view class="custom-nav" :style="{ 'paddingTop': paddingTop + 'px', 'height': headerHeight + 'rpx' }">
			<view class="nav-box" :style="{ 'height': headerHeight + 'rpx' }">
				<view class="nav-left" @click="">
					<image class="nav-icon" src="/static/image/cat-icon.png" mode="widthFix"></image>
					<text class="nav-title">签到猫</text>
				</view>
				<view class="nav-middle">
					<text class="nav-subtitle">附近啥都没</text>
				</view>
			</view>
		</view>
		<view class="top-option" :style="{ 'top': paddingTop + 'px', 'paddingTop': headerHeight + 0 + 'rpx' }">
			<view class="search-area">
				<view class="search-box">
					<view class="area" @click="bindRegionChange">
						<view class="u-line-1" style="width: 90rpx;text-align: center;">
							{{ curareaData.name || '请选择' }}
						</view>
						<u-icon name="arrow-down-fill" size="24"></u-icon>
					</view>
					<view class="input-area">
						<u-search placeholder="今日邀商家 来日分钱花" v-model="keyword" searchIconSize="30" bgColor="#fff"
							@search="search" height="60" :showAction="false"></u-search>
						<view class="search-btn" @click="search(false)">
							搜索
						</view>
					</view>
				</view>
				<view class="merchant-add" @click="register">
					<image class="top-img" src="/static/image/merchant-icon.png" mode="widthFix"></image>
					<view class="bottom">
						商家入驻
					</view>
				</view>
			</view>
			<view class="categary-list">
				<u-tabs :list="categaryList" :current="activeIndex" lineWidth="50" lineHeight="5" lineColor="#fff"
					:activeStyle="{ color: '#fff', fontWeight: '700', transform: 'scale(1.2)' }"
					:inactiveStyle="{ color: '#fff', fontWeight: '600', transform: 'scale(1)' }"
					itemStyle="height: 80rpx;" u-sticky @change="categaryChange"></u-tabs>
			</view>
		</view>
		<view class="container">
			<scroll-view :style="{ height: listheight }" scroll-y="true" refresher-enabled="true"
				:refresher-triggered="triggered" :refresher-threshold="100" @refresherrefresh="onRefresh"
				@scrolltolower="scrolltolower">
				<template v-if="merchantList.length !== 0">
					<view class="z-item" v-for="(item, index) in merchantList" :key="index">
						<!-- 商家列表 -->
						<view class="merchant-item" @click="toDetail(item)">
							<!-- 商家Logo -->
							<image v-if="item.headerLogo" class="merchant-logo" :src="item.headerLogo"
								mode="aspectFill">
							</image>
							<image v-else class="merchant-logo"
								src="https://api.ccnet.cc/resources/mini_image/catbglogo-3x.png" mode="aspectFill">
							</image>
							<!-- 商家信息区域 -->
							<view class="merchant-info">
								<!-- 名称 + 电话图标 -->
								<view class="u-line-1 info-top">
									<text class="merchant-name">{{ item.merchantName }}</text>
								</view>

								<view class="info-mid">
									<view class="mid-left">
										<!-- 地址 -->
										<text class="u-line-1 merchant-address">{{ item.merchantShortAddress }}</text>

										<!-- 营业状态 + 营业时间 -->
										<view class="status-wrap">
											<text class="status-tag"
												:class="{ 'open': item.busiStatus == 1, 'close': item.busiStatus == 0 }">
												{{ item.busiStatus == 1 ? "营业中" : "休息中" }}
											</text>
											<text
												class="business-time">{{ `${item.openStartDayDt}至${item.openEndDayDt}` }}</text>
											<text class="business-time">{{ `${item.openStartDt.slice(0, 5)}-${item.openEndDt.slice(0, 5)}`
										}}</text>
										</view>
									</view>
									<!-- <view class="mid-right">
									<button class="u-reset-button" @click.stop="makePhoneCall(item)">
										<image class="phone-icon" src="/static/image/phone-3x.png" mode="widthFix">
									</button>
								</view> -->
								</view>

								<!-- 点赞/收藏/距离 -->
								<view class="stats-wrap">
									<view class="stat-left">
										<view class="stat-item">
											<image class="stat-icon" src="/static/image/location-1x.png"
												mode="widthFix">
											</image>
											<text class="stat-num">{{ item.distance }}</text>
										</view>
									</view>
									<view class="stat-right">
										<view class="stat-item" @click.stop="likeMerchant(item)">
											<image v-if="item.isLike" class="stat-icon"
												src="/static/image/like-t-1x.png" mode="widthFix">
											</image>
											<image v-else class="stat-icon" src="/static/image/like-1x.png"
												mode="widthFix">
											</image>
											<text class="stat-num">{{ item.likeNumText }}</text>
										</view>
										<view class="stat-item" @click.stop="collectMerchant(item)">
											<image v-if="item.isCollect" class="stat-icon"
												src="/static/image/star-t-1x.png" mode="widthFix">
											</image>
											<image v-else class="stat-icon" src="/static/image/star-1x.png"
												mode="widthFix">
											</image>
											<text class="stat-num">{{ item.collectNumText }}</text>
										</view>
									</view>
									<view class="mid-right">
										<button class="u-reset-button" @click.stop="makePhoneCall(item)">
											<view class="right-btn">
												立即联系
											</view>
										</button>
									</view>
								</view>
							</view>
						</view>
					</view>
					<u-loadmore :status="loadstatus" nomoreText="暂无更多商家" height="60" fontSize="24" class="page-bottom"
						@loadmore="loadmore(true)" />
				</template>

				<template v-if="merchantList.length == 0">
					<view
						style="width: 100%;height: 80vh;display: flex;flex-flow: column;align-items: center;justify-content: center;">
						<u-loadmore :status="loadstatus" :nomoreText="nomoreText" height="60" fontSize="24"
							class="page-bottom" />
					</view>
				</template>

			</scroll-view>
		</view>
		<!-- <view class="float-btn-group">
			<button class="u-reset-button float-btn share-btn" open-type="share">
				<view class="btn-text upper">
					分享
				</view>
				<view class="btn-text lower">
					应用
				</view>
			</button>
			<view class="float-btn entry-btn" @click="register">
				<view class="btn-text upper">
					商家
				</view>
				<view class="btn-text lower">
					入驻
				</view>
			</view>
		</view> -->
	</view>
</template>

<script>
	const app = getApp()
	export default {
		data() {
			return {
				paddingTop: 0,
				headerHeight: 0,
				listheight: '100vh',
				triggered: false,
				curareaData: {},
				area: {
					name: '合肥市'
				},
				cityName: '合肥市',
				keyword: '',
				region: [],
				customItem: '全部',
				categaryList: [{
					name: '全部',
					value: ''
				}, {
					name: '收藏',
					value: 'collect',
					typeCode: '',
				}],
				userInfo: {},
				activeIndex: 0,
				merchantList: [],
				currPage: 1,
				pageCount: 0,
				loadstatus: 'loadmore', //加载前值为 loadmore，加载中为loading，没有数据为nomore
				isCollectList: false, // 收藏列表？
				weekArr: ['周一', '周二', '周三', '周四', '周五', '周六', '周日'],
				nomoreText: '定位城市暂无商家邀请商家来入驻吧'
			}
		},
		onLoad(options) {
			console.log(app.globalData, '---');
			if (options.inviterCode) {
				console.log(options.inviterCode, '邀请人编码');
				uni.setStorageSync("inviterCode", options.inviterCode)
			}
			this.paddingTop = app.globalData.deviceInfo.statusBarHeight
			this.headerHeight = app.globalData.navHeight
			this.listheight =
				`${app.globalData.deviceInfo.safeArea.height - this.paddingTop - this.headerHeight - 26 - app.globalData.deviceInfo.safeAreaInsets.bottom}px` //calc('100vh' - `${this.paddingTop}px` - `${this.headerHeight}rpx` - env(safe-area-inset-bottom))
			this.getMerchantTypeList()
			if (this.$isLogin()) {
				// const curareaData = uni.getStorageSync("curareaData")
				// this.cityName = curareaData.name ? curareaData.name : this.cityName
				this.getinitlocation()
			} else {
				this.getLogin()
			}
		},
		onShow() {
			// this.getMerchantTypeList()

			const areachanged = uni.getStorageSync('areachanged')
			// console.log(areachanged, 'curareaData', curareaData);
			// this.loadstatus = "loading"
			if (areachanged) {

				this.getinitlocation()
				setTimeout(() => {
					uni.setStorageSync("areachanged", false)
				}, 500)
			}
			// else {
			// this.getinitlocation()
			// }
			// this.getMessageNum()
		},
		onPullDownRefresh() {
			this.init()
		},
		onReachBottom() {
			// console.log('到底了')
			// this.loadmore()
		},
		onShareAppMessage() {
			this.userInfo = uni.getStorageSync("userInfo")
			return {
				title: `我是${this.userInfo.memeberName},邀你入驻签到猫`,
				path: `/pages/merchant/merchant?inviterCode=${this.userInfo.memberCode}`,
				imageUrl: "https://api.ccnet.cc/resources/mini_image/share3.png",
			}
		},
		methods: {
			getLogin() {
				let that = this
				wx.login({
					success: async (e) => {
						console.log(e, '-----');
						if (e.errMsg == "login:ok") {
							const res = await this.$request("/member/weiXinLogin", {
								js_code: e.code,
								// inviterCode: "202602023287538637378"
							})
							console.log(res, '----');
							if (res.data.code == 200) {
								uni.setStorageSync("userInfo", res.data.data)
							}

							// const curareaData = uni.getStorageSync("curareaData")
							// that.cityName = curareaData.name ? curareaData.name : that.cityName
							that.getinitlocation()
						} else {}
					}
				})
			},
			async getMessageNum() {
				const userInfo = uni.getStorageSync("userInfo")
				if (userInfo) {
					const res = await this.$request("/memberMessage/queryList", {
						reciveceCode: userInfo.memberCode,
						isRead: 0
					})
					let messageNum = res.data.data.length || 0
					if (messageNum && messageNum > 99) {
						app.globalData.messageNum = "99+"
					} else {
						app.globalData.messageNum = messageNum
					}

					console.log(res, '---消息数量');
				}
			},
			async likeMerchant(item) {
				const memberCode = uni.getStorageSync("userInfo").memberCode
				if (item.isLike) {
					const res = await this.$request("/memberLike/cancelLike", {
						memberCode,
						merchantCode: item.merchantCode
					})
					console.log(res, '-----');
					if (res.data.code == 200) {
						item.isLike = false;
						item.likeNums -= 1
						item.likeNumText = this.$formatNumberToWan(item.likeNums);
						uni.showToast({
							title: "取消点赞",
							icon: 'none',
							duration: 2000
						})
					}
				} else {
					const res = await this.$request("/memberLike/addNew", {
						memberCode,
						merchantCode: item.merchantCode
					})
					console.log(res, '-----');
					if (res.data.code == 200) {
						item.isLike = true;
						item.likeNums += 1
						item.likeNumText = this.$formatNumberToWan(item.likeNums);
						uni.showToast({
							title: "点赞成功",
							icon: 'none',
							duration: 2000
						})
					}
				}
			},
			async collectMerchant(item) {
				const memberCode = uni.getStorageSync("userInfo").memberCode
				if (item.isCollect) {
					const res = await this.$request("/memberCollecttion/cancelCollect", {
						memberCode,
						merchantCode: item.merchantCode
					})
					console.log(res, '-----');
					if (res.data.code == 200) {
						item.isCollect = false;
						item.collectNums -= 1
						item.collectNumText = this.$formatNumberToWan(item.collectNums);
						uni.showToast({
							title: "取消收藏",
							icon: 'none',
							duration: 2000
						})
					}
				} else {
					const res = await this.$request("/memberCollecttion/addNew", {
						memberCode,
						merchantCode: item.merchantCode
					})
					console.log(res, '-----');
					if (res.data.code == 200) {
						item.isCollect = true;
						item.collectNums += 1
						item.collectNumText = this.$formatNumberToWan(item.collectNums);
						uni.showToast({
							title: "收藏成功",
							icon: 'none',
							duration: 2000
						})
					}
				}
			},
			// 地址授权
			getuserLocationAuth() {
				uni.authorize({
					scope: 'scope.userLocation',
					success() {
						console.log('用户同意授权')
					}
				})
			},
			// 默认当前位置
			getinitlocation() {
				let that = this
				uni.getLocation({
					type: 'gcj02', // 坐标系类型：gcj02（国测局坐标系，适用于国内），wgs84（GPS坐标系）
					altitude: false, // 是否需要高度信息（按需设置）
					geocode: false, // 是否需要地址信息（按需设置，会增加接口耗时）
					success: async (res) => {
						const {
							latitude,
							longitude
						} = res; // 纬度、经度


						this.curareaData = {
							latitude,
							longitude,

						}

						// uni.setStorageSync("curareaData", this.curareaData)
						await this.getNowLocaltion(latitude, longitude)
						// await this.getNowLocaltion(31.296769, 117.341339)
					},
					fail: (err) => {
						console.error('定位失败：', err);
						// 处理失败原因（如用户拒绝授权、位置服务未开启等）
						if (err.errMsg.includes('auth deny')) {
							// console.log('用户拒绝定位授权，请引导用户开启');
							// 可选：提示用户开启授权
							// uni.showToast({ title: '请开启定位授权', icon: 'none' });
						}
					}
				});
			},
			// 获取当前位置
			async getNowLocaltion(latitude, longitude) {
				const loacl = uni.getStorageSync("curareaData")
				const res = await this.$request('/area/queryNearOne', {
					latitude: latitude,
					longitude: longitude
				})
				if (res.data.code == 200) {
					if (!loacl) {
						this.curareaData.name = res.data.data?.name
						this.cityName = res.data.data?.name
					} else {
						this.curareaData.name = loacl.name
						this.cityName = loacl.name
					}
					this.init(true);
					// uni.setStorageSync("curareaData", this.curareaData)
				}
				console.log(res, '--------------------------');
			},
			bindRegionChange(event) {
				uni.navigateTo({
					url: '/subPages/areaList/areaList',
				})
				// console.log('xua选择省市区：', event)
				// this.region = event.detail.value
			},
			categaryChange(e) {
				// console.log(e, 'eeeee');
				this.activeIndex = e.index
				this.currPage = 1
				// console.log(this.activeIndex, '点击');
				if (e.index == 1 && e.value == 'collect') {
					this.isCollectList = true
				} else {
					this.isCollectList = false
				}
				this.init(false);
			},
			scrolltolower() {
				console.log('触底-加载新数据')
				this.loadmore(true);
			},
			// @scrolltoupper="scrolltoupper"
			scrolltoupper() {
				console.log('下拉刷新')
				this.init()
			},
			// 搜索
			search() {
				this.init(false)
			},
			// 初始化
			init(flags = true) {
				// this.keyword = ''
				this.currPage = 1
				this.pageCount = 0
				this.merchantList = []
				this.loadstatus = 'loading'
				this.loadmore(flags);
			},
			onRefresh() {
				this.triggered = true
				this.init(true)
			},
			async loadmore(flags) {
				if (this.loadstatus == 'nomore') return;
				this.loadstatus = 'loading'
				if (this.isCollectList) {
					await this.getCollectMerchantList()
				} else {
					await this.getMerchantList(flags)
				}
				// console.log('加载新数据：', this.currPage, this.merchantList)
				// || !(this.merchantList.length > 0)
				if (!(this.currPage < this.pageCount)) {
					this.loadstatus = 'nomore'
				} else {
					this.currPage++
					this.loadstatus = 'loadmore'
				}
			},
			// 获取类型列表
			async getMerchantTypeList() {
				// const memberCode = uni.getStorageSync("userInfo").memberCode
				const params = {}
				const res = await this.$request("/merchantType/queryList", params)
				if (res.data.code == 200 && res.data.data) {
					const newArr = res.data.data.map(item => {
						const newitem = {
							...item,
							name: item.typeName,
							value: item.typeCode,
						}
						return newitem
					})
					this.categaryList = [{
							name: '全部',
							value: '',
							typeCode: '',
						}, {
							name: '收藏',
							value: 'collect',
							typeCode: '',
						},
						...newArr
					]
					// this.activeMerchantType = this.categaryList[0].value
					this.activeIndex = 0
					console.log('newArr', newArr, '|', this.categaryList)
				}
			},
			async getMerchantList(flags) {
				const memberCode = uni.getStorageSync("userInfo").memberCode
				if (this.currPage == 1) {
					this.merchantList = []
				}
				console.log(this.cityName, 'this.curareaData.name');
				const params = {
					pageSize: 10,
					currPage: this.currPage,
					condition: {
						lat: this.curareaData.latitude,
						lon: this.curareaData.longitude,
						merchantName: this.keyword,
						memberCode: memberCode,
						approvalStatus: 1,
						city: this.cityName
					}
				}
				console.log(this.activeIndex, 'this.activeIndex', this.categaryList[this.activeIndex].value);
				if (this.activeIndex == 0 || this.activeIndex == 1) {
					params.condition.merchantTypeCode = null
				} else {
					params.condition.merchantTypeCode = this.categaryList[this.activeIndex].value
				}
				const res = await this.$request("/merchantBaseInfo/queryMerchantByLocation", params)
				uni.stopPullDownRefresh()
				this.triggered = false
				if (res.data.code == 200 && res.data.data) {
					const newArr = res.data.data.data.map(item => {
						item.collectNums = item.collectNums ? Number(item.collectNums) : 0
						item.likeNums = item.likeNums ? Number(item.likeNums) : 0
						item.busiStatus = this.getBusiStatus(item)
						item.distance = this.formatDistance(item.distance)

						item.collectNumText = this.$formatNumberToWan(item.collectNums);
						item.likeNumText = this.$formatNumberToWan(item.likeNums);

						return item
					})
					if (newArr.length > 0) {
						this.merchantList.push(...newArr)
					} else {
						if (flags) {
							this.nomoreText = "定位城市暂无商家，邀请商家来入驻吧"
						} else {
							this.nomoreText = "没搜索到此类商家，邀请商家来入驻吧"
						}
					}
					// console.log('newArr', newArr, '|', this.merchantList)
					this.pageCount = res.data.data.pageCount
				}
			},
			async getCollectMerchantList() {
				const memberCode = uni.getStorageSync("userInfo").memberCode
				if (this.currPage == 1) {
					this.merchantList = []
				}
				const params = {
					pageSize: 10,
					currPage: this.currPage,
					condition: {
						lat: this.curareaData.latitude,
						lon: this.curareaData.longitude,
						merchantName: this.keyword,
						memberCode: memberCode,
					}
				}
				console.log(this.activeIndex, 'this.activeIndex', this.categaryList[this.activeIndex].value);
				if (this.activeIndex == 0 || this.activeIndex == 1) {
					params.condition.merchantTypeCode = null
				} else {
					params.condition.merchantTypeCode = this.categaryList[this.activeIndex].value
				}
				const res = await this.$request("/memberCollecttion/getCollectMerchantPage", params)
				uni.stopPullDownRefresh()
				this.triggered = false
				if (res.data.code == 200 && res.data.data) {
					const newArr = res.data.data.data.map(item => {
						item.collectNums = item.collectNums ? Number(item.collectNums) : 0
						item.likeNums = item.likeNums ? Number(item.likeNums) : 0
						item.busiStatus = this.getBusiStatus(item)
						item.distance = this.formatDistance(item.distance)

						item.collectNumText = this.$formatNumberToWan(item.collectNums);
						item.likeNumText = this.$formatNumberToWan(item.likeNums);
						return item
					})
					if (newArr.length > 0) {
						this.merchantList.push(...newArr)
					} else {
						this.nomoreText = "无更多收藏商家"
					}
					// console.log('newArr', newArr, '|', this.merchantList)
					this.pageCount = res.data.data.pageCount
				}
			},

			/**
			 * 格式化距离显示（输入km，输出指定格式）
			 * @param {number} km - 距离（单位：千米/km），如0.05、0.1、0.5、1.2、12.3、123.4、1234.5
			 * @returns {string} 格式化后的距离文本，如"<0.1km"、"0.1km"、"12.3公里"
			 */
			formatDistance(km) {
				// 1. 校验输入合法性：非数字/负数转为0处理
				const distance = typeof km === 'number' && !isNaN(km) && km >= 0 ?
					km :
					0;

				// 2. <0.1km（即<100m）：显示<0.1km
				if (distance < 0.1) {
					return '<0.1km';
				}

				// 3. ≥0.1km：四舍五入保留1位小数
				const rounded = Math.round(distance * 10) / 10;

				// 4. 单位规则：≥1km显示“公里”，0.1~0.9km显示“km”
				const unit = rounded >= 1 ? '公里' : 'km';

				// 5. 拼接结果（如0.1km、1.2公里、1234.5公里）
				return `${rounded}${unit}`;
			},

			// 修复周日判断bug
			getBusiStatus(row) {
				const now = new Date();
				let compareWeek0 = now.getDay(); // 0=周日, 1=周一,...,6=周六

				// 将0~6转为weekArr下标: 0=周日→6, 1=周一→0, ..., 6=周六→5
				let todayIdx = compareWeek0 === 0 ? 6 : compareWeek0 - 1;

				let startIdx = this.weekArr.findIndex(item => item == row.openStartDayDt);
				let endIdx = this.weekArr.findIndex(item => item == row.openEndDayDt);

				let busiStatus = 0;
				console.log('营业时间', todayIdx, startIdx, endIdx);

				// 1. 时间解析与转换（提取公共变量）
				const startDt = row.openStartDt ? row.openStartDt.split(':') : [0, 0];
				const endDt = row.openEndDt ? row.openEndDt.split(':') : [24, 0];
				const startTime = Number(startDt[0]) * 100 + Number(startDt[1]); // 如20:00→2000
				const endTime = Number(endDt[0]) * 100 + Number(endDt[1]); // 如02:00→200
				const nowh = now.getHours();
				const nowm = now.getMinutes();
				const currentTime = nowh * 100 + nowm; // 当前时间（如01:30→130，21:00→2100）

				// 2. 优先处理跨天场景（endTime < startTime）
				if (endTime < startTime) {
					// 先判断星期是否在营业范围（含跨周逻辑）
					let inDayScope = false;
					if (startIdx <= endIdx) {
						inDayScope = todayIdx >= startIdx && todayIdx <= endIdx;
					} else {
						inDayScope = todayIdx >= startIdx || todayIdx <= endIdx;
					}
					// 跨天时间判断：00:00~endTime 或 startTime~24:00
					const zeroTime = 0; // 00:00对应的数字
					const twentyFourTime = 2400; // 24:00对应的数字
					const isInCrossTime = (currentTime >= zeroTime && currentTime <= endTime) ||
						(currentTime >= startTime && currentTime <= twentyFourTime);
					// 星期+时间都符合 → 营业
					if (inDayScope && isInCrossTime) {
						busiStatus = 1;
					}
					return busiStatus; // 跨天场景直接返回结果，不走后续逻辑
				}

				// 3. 非跨天场景（原有逻辑，含跨周判断）
				let inDayScope = false;
				if (startIdx <= endIdx) {
					inDayScope = todayIdx >= startIdx && todayIdx <= endIdx;
				} else {
					// 跨周: 比如周五~周一，今天是周六(todayIdx=5)，startIdx=4,endIdx=0
					inDayScope = todayIdx >= startIdx || todayIdx <= endIdx;
				}

				if (inDayScope) {
					if (currentTime >= startTime && currentTime <= endTime) {
						busiStatus = 1;
					}
				}
				return busiStatus;
			},
			register() {
				uni.navigateTo({
					url: '/subPages/register/register'
				})
			},
			toDetail(e) {
				console.log('去详情页：', e)
				uni.navigateTo({
					url: `/subPages/merchantDetail/merchantDetail?merchantCode=${e.merchantCode}&mbaseinfo=${encodeURIComponent(JSON.stringify(e))}`
				})
			},
			makePhoneCall(e) {
				// 调用拨打电话API
				uni.makePhoneCall({
					phoneNumber: e.merchantPhone,
					success: () => {
						console.log('拨打电话成功')
						// 这里可以添加拨打成功的埋点统计
					},
					fail: (err) => {
						console.error('拨打电话失败:', err)
						uni.showToast({
							title: '拨打电话失败',
							icon: 'none'
						})
					}
				})
			},
		}
	}
</script>

<style lang="scss" scoped>
	.u-page {
		width: 100vw;
		height: 100vh;
		// height: auto;
		box-sizing: border-box;
		padding: 0;
		display: flex;
		flex-direction: column;
		background-color: #2dd06e;
		position: relative; // 为悬浮按钮做定位
	}

	.page-bottom {
		padding-bottom: env(safe-area-inset-bottom);
	}

	/* 1. 自定义导航栏 */
	.custom-nav {
		background-color: #2dd06e;
		position: fixed;
		top: 0;
		left: 0;
		width: 100vw;
		box-sizing: border-box;
		z-index: 999;

		.nav-box {
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 0rpx 24rpx 0rpx;
			background-color: #2dd06e;
			color: #fff;
			position: relative;
		}

		.nav-left {
			position: absolute;
			top: 50%;
			left: 0;
			transform: translateY(-52%);
			display: flex;
			align-items: center;
			gap: 12rpx;
			height: 58rpx;
			padding: 2rpx 20rpx;

			.nav-icon {
				width: 72rpx;
				height: 72rpx;
			}

			.nav-title {
				font-size: 36rpx;
				font-weight: 500;
				letter-spacing: 4rpx;
			}
		}

		.nav-middle {
			height: 40rpx;
			display: flex;
			justify-content: center;
			align-items: center;
			background-color: #ffffff;
			padding: 2rpx 16rpx;
			transform: translateY(-2rpx);
			border-radius: 25rpx 0 25rpx 0;

			.nav-subtitle {
				font-size: 25rpx;
				color: #2dd06e;
				font-weight: 500;
				font-style: italic;
				letter-spacing: 4rpx;
			}
		}

		.nav-right {
			display: flex;
			align-items: center;
			gap: 16rpx;

			.nav-more {
				width: 36rpx;
				height: 36rpx;
			}

			.nav-switch {
				width: 60rpx;
				height: 36rpx;
			}
		}
	}

	.top-option {
		background-color: #2dd06e;
		position: sticky;
		// top: 0;
		left: 0;
		width: 100%;
		padding: 0 10rpx 0 20rpx;
		box-sizing: border-box;
		z-index: 9;
	}

	.search-area {
		width: 100%;
		display: flex;
		justify-content: space-between;
		align-items: center;
		padding-top: 10rpx;

		.search-box {
			display: flex;
			justify-content: space-between;
			align-items: center;
			flex: 1;
			padding: 10rpx;
			box-sizing: border-box;
			background-color: #fff;
			height: 80rpx;
			border-radius: 40rpx;

			.area {
				padding: 0 0 0 10rpx;
				display: flex;
				flex-shrink: 0;
				align-items: center;
				font-size: 24rpx;
			}

			.input-area {
				flex: 1;
				position: relative;
				width: 100%;
				height: 100%;

				::v-deep .u-search__content {
					padding-left: 4rpx;
					padding-right: 110rpx;
				}

				::v-deep .u-search__content__input {
					font-size: 24rpx;
					margin: 0;
				}

				.search-btn {
					position: absolute;
					right: 2rpx;
					top: 0rpx;
					// transform: translateY(-50%);
					background: #22C55E;
					width: 110rpx;
					height: 60rpx;
					padding: 0 20rpx;
					box-sizing: border-box;
					border-radius: 30rpx;
					font-size: 28rpx;
					color: #fff;
					text-align: center;
					display: flex;
					justify-content: center;
					align-items: center;
					z-index: 10;
				}
			}
		}

		.merchant-add {
			flex-shrink: 0;
			width: 120rpx;
			color: #fff;
			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;
			gap: 4rpx;

			.top-img {
				width: 46rpx;
				height: 46rpx;
			}

			.bottom {
				height: 30rpx;
				font-size: 24rpx;
				color: #333333;
			}
		}
	}

	.categary-list {
		width: 100%;
		color: #fff;
		padding: 0 0 10rpx;

		::v-deep .u-tabs__wrapper__nav__line {
			margin-left: 24rpx;
		}

		::v-deep .u-tabs__wrapper__nav__item,
		::v-deep .u-tabs__wrapper__nav__item__text {
			font-size: 32rpx;
		}

		.list-item {
			flex-shrink: 0;
			width: 100rpx;
			height: 40rpx;
			padding-bottom: 10rpx;
			position: relative;
			overflow: visible;
			text-align: center;
			// border-bottom: 2rpx solid #fff;
		}

		.active-list {
			&::after {
				content: '';
				display: block;
				position: absolute;
				bottom: 0rpx;
				left: 50%;
				transform: translateX(-50%);
				width: 40rpx;
				height: 4rpx;
				background-color: #fff;
			}
		}
	}

	.container {
		width: 100%;
		height: auto;
		flex: 1;
		background: #f2f2f2;
		box-sizing: border-box;
		padding: 10rpx 20rpx;
		// padding-bottom: calc(env(safe-area-inset-bottom) + 51px);
	}

	.merchant-list {
		background: #ffffff;
		flex: 1;
		width: 100%;
		padding: 10rpx 20rpx 180rpx;
		box-sizing: border-box;
	}

	/* 商家项容器 */
	.merchant-item {
		display: flex;
		align-items: flex-start;
		background-color: #fff;
		gap: 15rpx;
		padding: 20rpx;
		border-bottom: 1px solid #f5f5f5;

		/* 商家Logo */
		.merchant-logo {
			width: 190rpx;
			height: 190rpx;
			flex-shrink: 0;
			border-radius: 8rpx;
		}

		/* 商家信息区域 */
		.merchant-info {
			flex: 1;
			display: flex;
			flex-direction: column;
			height: 190rpx;
			justify-content: space-between;
			gap: 8rpx;
			padding: 0 0 0 10rpx;

			/* 名称 */
			.info-top {
				display: flex;
				// justify-content: space-between;
				align-items: center;

				.merchant-name {
					font-weight: 600;
					font-family: Alibaba PuHuiTi 3.0, Alibaba PuHuiTi 30;
					font-size: 36rpx;
					max-width: 90%;
					color: #333333;
				}
			}

			.info-mid {
				display: flex;
				justify-content: space-between;
				align-items: center;
				font-size: 26rpx;
				color: #333333;

				.mid-left {
					display: flex;
					flex-direction: column;
					justify-content: space-between;
					gap: 12rpx;
				}

				.mid-right {
					.phone-icon {
						width: 67rpx;
						height: 67rpx;
					}
				}
			}

			/* 地址 */
			.merchant-address {
				font-size: 26rpx;
				color: #8e8d91;
				font-weight: 600;
				min-width: 60%;
			}

			/* 营业状态+时间 */
			.status-wrap {
				display: flex;
				align-items: center;
				gap: 10rpx;
				font-size: 24rpx;
				font-weight: 600;

				.status-tag {
					// padding: 0rpx 8rpx;
					border-radius: 4rpx;
				}

				/* 营业中样式 */
				.open {
					color: #22C55E;
					// background-color: rgba(45, 208, 110, 0.1);
				}

				/* 休息中样式 */
				.close {
					color: #f40;
					// background-color: #f5f5f5;
				}

				.business-time {
					// font-size: 24rpx;
					color: #8e8d91;
				}
			}

			/* 点赞/收藏/距离 */
			.stats-wrap {
				display: flex;
				justify-content: space-between;
				align-items: center;
				gap: 20rpx;
				margin-top: 5rpx;

				.stat-left {
					display: flex;
					align-items: center;
					gap: 30rpx;
				}

				.stat-right {
					flex: 1;
					display: flex;
					align-items: center;
					gap: 20rpx;
					justify-content: center;
				}

				.stat-item {
					display: flex;
					align-items: center;
					gap: 8rpx;

					.stat-icon {
						width: 30rpx;
						height: 30rpx;
					}

					.stat-num {
						font-size: 25rpx;
						color: #333333;
						// font-weight: 600;
					}
				}

				.mid-right {
					.right-btn {
						background: #d5fdea;
						color: #2fcd82;
						height: 36rpx;
						padding: 6rpx 10rpx;
						font-size: 24rpx;
					}
				}
			}
		}
	}

	/* 悬浮操作按钮 */
	.float-btn-group {
		position: fixed;
		bottom: calc(env(safe-area-inset-bottom) + 80px);
		left: 50%;
		transform: translateX(-50%);
		display: flex;
		gap: 40rpx;

		.float-btn {
			// padding: 20rpx;
			border-radius: 50%;
			width: 124rpx;
			height: 124rpx;
			box-sizing: border-box;
			color: #fff;
			font-size: 32rpx;
			font-weight: 600;
			letter-spacing: 6rpx;
			// box-shadow: 0 2rpx 10rpx rgba(0, 0, 0, 0.1);
			overflow: hidden;

			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;

			.sbtn-image {
				width: 100%;
				height: 100%;
			}
		}

		.share-btn {
			background-color: #26c761;
		}

		.entry-btn {
			background-color: #26c761;
		}

		.btn-text {
			latter-spacing: 24rpx;
		}
	}
</style>