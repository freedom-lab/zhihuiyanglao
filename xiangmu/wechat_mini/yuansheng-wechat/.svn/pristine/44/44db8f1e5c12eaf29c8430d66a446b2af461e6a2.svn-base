<template>
	<view class="u-page">
		<view class="container">
			<u-list class="ulist-class" :height="listheight" :enableBackToTop="true" @scrolltolower="scrolltolower">
				<u-list-item v-for="(item, index) in auditList" :key="index">
					<!-- 商家列表 -->
					<view class="merchant-item" @click="toAudit(item)">
						<!-- 商家Logo -->
						<image v-if="item.headerLogo" class="merchant-logo" :src="item.headerLogo" mode="aspectFill">
						</image>
						<image v-else class="merchant-logo" src="https://api.ccnet.cc/resources/mini_image/catbglogo-3x.png" mode="aspectFill">
						</image>
						<!-- 商家信息区域 -->
						<view class="merchant-info">
							<!-- 名称  -->
							<view class="u-line-1 info-top">
								<text class="merchant-name">{{ item.merchantName }}</text>
							</view>

							<view class="info-mid">
								<view class="mid-left">
									<!-- 地址 -->
									<text class="merchant-address">{{ item.merchantShortAddress }}</text>

								</view>
							</view>
							<view class="info-mid">
								<view class="mid-left">
									<!-- 营业状态 + 营业时间 -->
									<view class="status-wrap a-time">
										<text>营业时间：</text>
										<text
											class="business-time">{{ `${item.openStartDayDt}至${item.openEndDayDt}` }}</text>
										<text
											class="business-time">{{ `${item.openStartDt} - ${item.openEndDt}` }}</text>
									</view>
								</view>
							</view>

							<view class="status-wrap mid-right pa-statustag">
								<text class="status-tag"
									:class="{ 'preApprove': item.approvalStatus == 0 , 'approved': item.approvalStatus == 1, 'disApprove': item.approvalStatus == 2 }">
									{{ item.approvalStatus == 1 ? "审核通过" : item.approvalStatus == 2 ? "审核拒绝" : "待审核" }}
								</text>
							</view>

						</view>
					</view>
				</u-list-item>
				<u-loadmore :status="loadstatus" fontSize="24" class="page-bottom" @loadmore="loadmore" />
			</u-list>
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
				listheight: '100vh',

				auditList: [],
				currPage: 1,
				pageCount: 0,
				loadstatus: 'loadmore', //加载前值为 loadmore，加载中为loading，没有数据为nomore
			}
		},
		onLoad() {
			this.paddingTop = app.globalData.deviceInfo.statusBarHeight
			this.headerHeight = app.globalData.headerHeight
			this.listheight = `${app.globalData.deviceInfo.safeArea.height - this.paddingTop}px`
			this.getUserInfoData()
			this.loadmore();
		},
		onShow() {},
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
		onPullDownRefresh() {
			this.init()
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
			scrolltolower() {
				this.loadmore();
			},
			// @scrolltoupper="scrolltoupper"
			scrolltoupper() {
				this.init()
			},
			// 初始化
			init() {
				this.currPage = 1
				this.pageCount = 0
				this.auditList = []
				this.loadstatus = 'loading'
				this.loadmore();
			},
			async loadmore() {
				if (this.loadstatus == 'nomore') return;
				this.loadstatus = 'loading'
				await this.getAuditList()
				// console.log('加载新数据：', this.currPage, this.merchantList)
				// || !(this.merchantList.length > 0)
				if (!(this.currPage < this.pageCount)) {
					this.loadstatus = 'nomore'
				} else {
					this.currPage++
					this.loadstatus = 'loadmore'
				}
			},
			async getAuditList() {
				const inviterUserInfo = uni.getStorageSync("userInfo")
				if (this.currPage == 1) {
					this.auditList = []
				}
				const params = {
					pageSize: 10,
					currPage: this.currPage,
					condition: {
						inviterMemberCode: inviterUserInfo.memberCode
					}
				}
				const res = await this.$request("/merchantBaseInfo/list", params)
				uni.stopPullDownRefresh()
				if (res.data.code == 200 && res.data.data) {
					const newArr = res.data.data.data
					if (newArr.length > 0) {
						this.auditList.push(...newArr)
					}
					console.log('newArr', newArr, '|', this.auditList)
					this.pageCount = res.data.data.pageCount
				}
			},
			toAudit(e) {
				console.log('商家中心页：', e)
				uni.navigateTo({
					url: `/subPages/merchantCenter/merchantCenter?merchantCode=${e.merchantCode}`
				})
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
		padding: 10rpx 20rpx;
		// ::v-deep .u-list{
		// 	background: #ffffff;
		// }
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
		gap: 15rpx;
		padding: 20rpx;
		box-sizing: border-box;
		border-bottom: 1px solid #f5f5f5;
		background: #ffffff;
		margin-bottom: 20rpx;
		border-radius: 20rpx;

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
			padding: 0 10rpx;
			position: relative;

			/* 名称 */
			.info-top {
				// display: flex;
				// justify-content: space-between;
				// align-items: center;
				box-sizing: border-box;
				padding-right: 120rpx;
				height: 68rpx;
				line-height: 68rpx;

				.merchant-name {
					font-weight: 600;
					font-family: Alibaba PuHuiTi 3.0, Alibaba PuHuiTi 30;
					font-size: 36rpx;
					color: #333333;
				}
			}

			.info-mid {
				display: flex;
				justify-content: space-between;
				align-items: center;
				font-size: 26rpx;
				color: #333333;
				flex: 1;

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
				font-weight: 600;
				font-size: 30rpx;
				color: #333333;
			}

			.a-time {
				font-weight: 500;
				font-size: 26rpx;
				color: #747474;
			}

			/* 营业状态+时间 */
			.status-wrap {
				display: flex;
				align-items: center;
				gap: 10rpx;
				font-size: 26rpx;

				.status-tag {
					padding: 8rpx 16rpx;
					border-radius: 8rpx;
					color: #ffffff;
					font-weight: 500;
					font-size: 26rpx;
					min-width: 100rpx;
					display: flex;
					justify-content: center;
					align-items: center;
				}

				/* 待审核 */
				.preApprove {
					background: #FF7600;
				}

				/* 审核通过样式 */
				.approved {
					background: #22C55E;
				}

				/* 审核拒绝样式 */
				.disApprove {
					background: #FF0000;
				}

				.business-time {
					// font-size: 24rpx;
					color: #747474;
				}
			}

			.pa-statustag {
				position: absolute;
				top: 0;
				right: 0;
			}

		}
	}
</style>