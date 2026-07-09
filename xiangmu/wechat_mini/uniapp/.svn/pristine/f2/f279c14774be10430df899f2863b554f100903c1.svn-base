<template>
	<view class="">
		<u-loading-page v-if="isLoading" :loading="isLoading" loading-text="商家信息加载中..."
			style="position: fixed;width: 100vw;height:100vh;z-index: 9999;"></u-loading-page>
		<view class="u-page" v-else>

			<image v-if="mbaseInfo.headerLogo" class="merchant-logo" :src="mbaseInfo.headerLogo" mode="widthFix">
			</image>
			<image v-else class="merchant-logo" src="https://api.ccnet.cc/resources/mini_image/catbglogo-3x.png"
				mode="aspectFill"></image>
			<view class="container">
				<view class="top-info">

					<view class="info-line">
						<view class="u-line-2 m-title">
							{{mbaseInfo.merchantName}}
						</view>
						<view class="line-item info-cnt">
							<view class="item-top">
								<view class="top-left">
									<view class="tl tl-1 status-wrap">
										<text class="status-tag"
											:class="{ 'open': mbaseInfo.busiStatus == 1, 'close': mbaseInfo.busiStatus == 0 }">
											{{ mbaseInfo.busiStatus == 1 ? "营业中" : "休息中" }}
										</text>
										<text
											class="business-time">{{ `${mbaseInfo.openStartDayDt}至${mbaseInfo.openEndDayDt}` }}</text>
										<text
											class="business-time">{{ `${mbaseInfo.openStartDt} - ${mbaseInfo.openEndDt}` }}</text>
									</view>
									<view class="tl tl-2">
										{{`${mbaseInfo.merchantType} · ￥${Number(mbaseInfo.averagePrice || 0)}/人 · ${mbaseInfo.merchantShortAddress}`}}
									</view>
									<view class="tl tl-3">
										{{mbaseInfo.merchantAddres}}
									</view>
								</view>
								<!-- <view class="top-right">
									<button class="u-reset-button" @click.stop="makePhoneCall(mbaseInfo)">
										<image class="phone-icon" src="/static/image/phone-3x.png" mode="aspectFill">
									</button>
								</view> -->
							</view>
							<!-- 点赞/收藏/距离 -->
							<view class="stats-wrap item-bottom">
								<view class="stat-left">
									<view class="stat-item">
										<image class="stat-icon" src="/static/image/location-1x.png" mode="widthFix">
										</image>
										<text class="stat-num1">距离我{{ mbaseInfo.distance }}</text>
									</view>
								</view>
								<view class="stat-right">
									<view class="stat-item" @click="likeMerchant">
										<image v-if="mbaseInfo.isLike" class="stat-icon"
											src="/static/image/like-t-1x.png" mode="widthFix"></image>
										<image v-else class="stat-icon" src="/static/image/like-1x.png" mode="widthFix">
										</image>
										<text class="stat-num">{{ mbaseInfo.likeNumText }}</text>
									</view>
									<view class="stat-item" @click="collectMerchant" style="margin-left: 30rpx;">
										<image v-if="mbaseInfo.isCollect" class="stat-icon"
											src="/static/image/star-t-1x.png" mode="widthFix"></image>
										<image v-else class="stat-icon" src="/static/image/star-1x.png" mode="widthFix">
										</image>
										<text class="stat-num">{{ mbaseInfo.collectNumText }}</text>
									</view>
								</view>
							</view>
						</view>
					</view>
					<view class="info-line">
						<view class="info-des">
							{{mbaseInfo.introduction}}
						</view>
					</view>
				</view>
				<view class="fixed-bottom">
					<!-- <view class="btn-class share-btn">
						分享商家
					</view> -->
					<button class="u-reset-button btn-class share-btn" open-type="share">分享商家</button>
					<view class="btn-class submit-btn" @click="makePhoneCall(mbaseInfo)">
						联系商家
					</view>
					<!-- <view class="btn-class submit-btn" @click="register">
						我要入驻
					</view> -->
				</view>
			</view>

			<u-modal :show="showConfirm" title="审核通过" content='是否确认审核通过' :showCancelButton="true"
				@cancel="showConfirm=false" @close="showConfirm=false" @confirm="confirmSubmit" ref="uModal"
				:closeOnClickOverlay="true" :asyncClose="true"></u-modal>

		</view>

	</view>

</template>

<script>
	const app = getApp();
	export default {
		data() {
			return {
				auditResult: null,
				editable: false, // 是否可以编辑
				btnloading: false,
				isApproved: false, //是否已审核
				mbaseInfo: {},
				merchantApprovalInfo: {},
				showTypeSelect: false,
				actions1: [{
						name: '餐饮',
						code: '1'
					},
					{
						name: '其他',
						code: '2',
					},
				],
				isLoading: true,
				showOpenDay: false,
				showOpenDayStart: false,
				showOpenDayEnd: false,
				OpenDayColumns: [
					['周一', '周二', '周三', '周四', '周五', '周六', '周日']
				],
				weekArr: ['周一', '周二', '周三', '周四', '周五', '周六', '周日'],
				showOpenDt: false,
				showOpenDtStart: false,
				showOpenDtEnd: false,
				fileList_headerLogo: [],
				fileList_license: [],
				userInfo: {},
				showReject: false,
				showConfirm: false,
				approvalReason: '',
				curMerchantCode: '',
				curareaData: {},
			}
		},
		onLoad(option) {
			this.curMerchantCode = option.merchantCode
			// if (option.mbaseinfo) {
			// 	const mbaseinfo = JSON.parse(decodeURIComponent(option.mbaseinfo))
			// 	this.tempDetail(mbaseinfo)
			// }
			const curareaData = uni.getStorageSync("curareaData")
			const areachanged = uni.getStorageSync('areachanged')
			console.log(areachanged, 'curareaData', curareaData);
			// if (areachanged && curareaData) {
			// 	this.getMerchantDetail(curareaData)
			// } else {
			this.getinitlocation()
			// }
			if (option.inviterCode) {
				uni.setStorageSync("inviterCode", option.inviterCode)
			}
		},
		onReady() {},
		onShow() {
			this.getUserInfoData()
		},
		onShareAppMessage() {
			const shareData = this.mbaseInfo
			return {
				title: `${shareData.merchantName}`,
				path: `/subPages/merchantDetail/merchantDetail?inviterCode=${this.userInfo.memberCode}&merchantCode=${shareData.merchantCode}`,
				imageUrl: shareData.headerLogo,
			}
		},
		methods: {
			// 默认当前位置
			getinitlocation() {
				let that = this
				uni.getLocation({
					type: 'gcj02', // 坐标系类型：gcj02（国测局坐标系，适用于国内），wgs84（GPS坐标系）
					altitude: false, // 是否需要高度信息（按需设置）
					geocode: false, // 是否需要地址信息（按需设置，会增加接口耗时）
					success: (res) => {
						const {
							latitude,
							longitude
						} = res; // 纬度、经度
						const curareaData = {
							latitude,
							longitude,
						}
						// uni.setStorageSync("curareaData", curareaData)
						this.getMerchantDetail(curareaData)

					},
					fail: (err) => {
						console.error('定位失败：', err);
						if (err.errMsg.includes('auth deny')) {}
					}
				});
			},

			async getMerchantDetail(curareaData) {
				const data = {
					...curareaData,
					merchantCode: this.curMerchantCode,
					memberCode: uni.getStorageSync("userInfo").memberCode,
				}
				console.log(data, 'data==============', this.userInfo);
				const res = await this.$request("/merchantBaseInfo/queryOneWithDistance", data)
				if (res.data.code == 200) {
					res.data.data.likeNums = Number(res.data.data.likeNums)
					res.data.data.collectNums = Number(res.data.data.collectNums)
					this.isLoading = false
					this.tempDetail(res.data.data)
				}
			},
			async likeMerchant() {
				const memberCode = uni.getStorageSync("userInfo").memberCode
				if (this.mbaseInfo.isLike) {
					const res = await this.$request("/memberLike/cancelLike", {
						memberCode,
						merchantCode: this.mbaseInfo.merchantCode
					})
					console.log(res, '-----');
					if (res.data.code == 200) {

						this.mbaseInfo.isLike = false;
						this.mbaseInfo.likeNums -= 1
						this.mbaseInfo.likeNumText = this.$formatNumberToWan(this.mbaseInfo.likeNums);
						uni.showToast({
							title: "取消点赞",
							icon: 'none',
							duration: 2000
						})
					}
				} else {
					const res = await this.$request("/memberLike/addNew", {
						memberCode,
						merchantCode: this.mbaseInfo.merchantCode
					})
					console.log(res, '-----');
					if (res.data.code == 200) {
						this.mbaseInfo.isLike = true;
						this.mbaseInfo.likeNums += 1
						this.mbaseInfo.likeNumText = this.$formatNumberToWan(this.mbaseInfo.likeNums);
						uni.showToast({
							title: "点赞成功",
							icon: 'none',
							duration: 2000
						})
					}
				}
				uni.setStorageSync("areachanged", true)
			},

			async collectMerchant() {
				const memberCode = uni.getStorageSync("userInfo").memberCode
				if (this.mbaseInfo.isCollect) {
					const res = await this.$request("/memberCollecttion/cancelCollect", {
						memberCode,
						merchantCode: this.mbaseInfo.merchantCode
					})
					console.log(res, '-----');
					if (res.data.code == 200) {
						this.mbaseInfo.isCollect = false;
						this.mbaseInfo.collectNums -= 1
						this.mbaseInfo.collectNumText = this.$formatNumberToWan(this.mbaseInfo.collectNums);
						uni.showToast({
							title: "取消收藏",
							icon: 'none',
							duration: 2000
						})
					}
				} else {
					const res = await this.$request("/memberCollecttion/addNew", {
						memberCode,
						merchantCode: this.mbaseInfo.merchantCode
					})
					console.log(res, '-----');
					if (res.data.code == 200) {
						this.mbaseInfo.isCollect = true;
						this.mbaseInfo.collectNums += 1
						this.mbaseInfo.collectNumText = this.$formatNumberToWan(this.mbaseInfo.collectNums);
						uni.showToast({
							title: "收藏成功",
							icon: 'none',
							duration: 2000
						})
					}
				}
				uni.setStorageSync("areachanged", true)
			},
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
			// 临时详情
			tempDetail(targetone) {
				// if (targetone) {
				this.merchantApprovalInfo = targetone
				this.mbaseInfo = targetone
				this.mbaseInfo.distance = this.formatDistance(this.mbaseInfo.distance)
				this.mbaseInfo.busiStatus = this.getBusiStatus(this.mbaseInfo)
				this.mbaseInfo.likeNumText = this.$formatNumberToWan(this.mbaseInfo.likeNums);
				this.mbaseInfo.collectNumText = this.$formatNumberToWan(this.mbaseInfo.collectNums);
				this.openStartDayChange()
				this.openStartDtChange()
				this.isApproved = targetone.approvalStatus != 0
				this.auditResult = targetone.approvalStatus
				// }
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
			// 获取详情
			async getMerchantInfo() {
				// const memberCode = uni.getStorageSync("userInfo").memberCode
				// const params = {
				// 	merchantCode: this.curMerchantCode,
				// }
				const params = {
					pageSize: 1,
					currPage: 1,
					condition: {
						lat: this.curareaData.latitude,
						lon: this.curareaData.longitude,
						merchantCode: this.curMerchantCode,
						memberCode: this.userInfo.memberCode,
						approvalStatus: 1,
					}
				}
				const res = await this.$request("/merchantBaseInfo/queryMerchantByLocation", params)
				if (res.data.code == 200 && res.data.data) {
					const targetone = res.data.data.data[0]
					if (targetone) {
						targetone.collectNums = targetone.collectNums ? Number(targetone.collectNums) : 0
						targetone.likeNums = targetone.likeNums ? Number(targetone.likeNums) : 0
						targetone.busiStatus = this.getBusiStatus(targetone)

						this.merchantApprovalInfo = targetone
						this.mbaseInfo = targetone
						this.mbaseInfo.likeNumText = this.$formatNumberToWan(this.mbaseInfo.likeNums);
						this.mbaseInfo.collectNumText = this.$formatNumberToWan(this.mbaseInfo.collectNums);
						this.fileList_headerLogo = this.merchantApprovalInfo.headerLogo ? [{
							url: this.merchantApprovalInfo.headerLogo,
						}] : []
						this.fileList_license = this.merchantApprovalInfo.license ? [{
								url: this.merchantApprovalInfo.license,
							}] : [],
							this.openStartDayChange()
						this.openStartDtChange()
						this.isApproved = targetone.approvalStatus != 0
						this.auditResult = targetone.approvalStatus
					}
				}
			},
			// 获取营业状态
			getBusiStatus(row) {
				const now = new Date();
				// 1. 星期相关处理（原有逻辑）
				let compareWeek0 = now.getDay(); // 0=周日, 1=周一,...,6=周六
				let compareWeek1 = this.weekArr.findIndex(item => item == row.openStartDayDt) + 1;
				let compareWeek2 = this.weekArr.findIndex(item => item == row.openEndDayDt) + 1;

				let busiStatus = 0;

				// 2. 时间解析与转换（提取公共变量）
				const startDt = row.openStartDt ? row.openStartDt.split(':') : [0, 0];
				const endDt = row.openEndDt ? row.openEndDt.split(':') : [24, 0];
				const startTime = Number(startDt[0]) * 100 + Number(startDt[1]); // 如20:00→2000
				const endTime = Number(endDt[0]) * 100 + Number(endDt[1]); // 如02:00→200
				const nowh = now.getHours();
				const nowm = now.getMinutes();
				const currentTime = nowh * 100 + nowm; // 当前时间（如01:30→130，21:00→2100）

				// 3. 优先处理跨天场景（endTime < startTime）
				if (endTime < startTime) {
					// 跨天判断规则：当前时间在 [00:00~endTime] 或 [startTime~24:00]
					const zeroTime = 0; // 00:00对应的数字
					const twentyFourTime = 2400; // 24:00对应的数字
					// 判断是否在跨天的有效时间段内
					const isInCrossTime = (currentTime >= zeroTime && currentTime <= endTime) ||
						(currentTime >= startTime && currentTime <= twentyFourTime);
					// 同时需满足星期在营业范围内
					if (compareWeek0 >= compareWeek1 && compareWeek0 <= compareWeek2 && isInCrossTime) {
						busiStatus = 1;
					}
					return busiStatus;
				}

				// 4. 非跨天场景（原有逻辑）
				if (compareWeek0 >= compareWeek1 && compareWeek0 <= compareWeek2) {
					if (currentTime >= startTime && currentTime <= endTime) {
						busiStatus = 1;
					}
				}
				return busiStatus;
			},
			openStartDayChange() {
				this.mbaseInfo.openDayDt = `${this.mbaseInfo.openStartDayDt}至${this.mbaseInfo.openEndDayDt}`
			},
			openStartDtChange() {
				this.mbaseInfo.openDt = `${this.mbaseInfo.openStartDt}-${this.mbaseInfo.openEndDt}`
			},
			tochooselocation() {
				const that = this
				uni.openLocation({
					latitude: that.mbaseInfo.latitude,
					longitude: that.mbaseInfo.longitude,
					name: that.mbaseInfo.merchantShortAddress,
					address: that.mbaseInfo.merchantAddres,
					scale: 18
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
			register() {
				uni.navigateTo({
					url: '/subPages/register/register'
				})
			},
			openReject() {
				this.showReject = true
			},
			// 驳回
			handleReject() {
				if (this.approvalReason) {
					this.doSubmit(2)
				} else {
					uni.showToast({
						title: "请输入审核备注",
						icon: "none",
					})
				}
			},
			handleSubmit() {
				this.showConfirm = true
			},
			confirmSubmit() {
				this.doSubmit(1)
			},
			async doSubmit(status) {
				if (this.btnloading) {
					return
				}
				this.btnloading = true
				const inviterUserInfo = uni.getStorageSync("userInfo")
				const params = {
					...this.mbaseInfo,
					approvalMemberCode: inviterUserInfo.memberCode,
					approvalMemberName: inviterUserInfo.memeberName,
					approvalStatus: status,
					approvalReason: this.approvalReason,
				}
				console.log('提交前：', params)
				// return
				const res = await this.$request("/merchantApproval/approvalMerchant", params).catch(err => {
					this.btnloading = false
					this.showConfirm = false
				})
				if (res.data.code == 200) {
					uni.$u.toast('审核成功！')

					setTimeout(() => {
						uni.navigateBack()
						this.btnloading = false
						this.showConfirm = false
					}, 2000)
					// if(status == 1){
					// 	this.addMerchant(params)
					// }else{
					// }
					console.log('提交结果：', res)
				} else {
					this.btnloading = false
					this.showConfirm = false
				}
			},
			// 审核成功生成商家信息
			async addMerchant(newdata) {
				const inviterUserInfo = uni.getStorageSync("userInfo")
				const params = {
					...newdata,
				}
				delete params.id
				console.log('提交前：', params)
				// return
				const res = await this.$request("/merchantBaseInfo/save", params).catch(err => {
					this.btnloading = false
				})
				if (res.data.code == 200) {
					uni.$u.toast('提交审核成功！')
					setTimeout(() => {
						uni.switchTab({
							url: '/pages/merchant/merchant'
						})
					}, 2000)
					console.log('提交结果：', res)
				}
				this.btnloading = false
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
		display: flex;
		flex-direction: column;
		background: #ffffff;
	}

	/* 商家Logo */
	.merchant-logo {
		width: 100%;
		// height: 520rpx;
		flex-shrink: 0;
	}

	.container {
		width: 100%;
		// height: 100%;
		height: auto;
		flex: 1;
		background: #ffffff;
		box-sizing: border-box;
		padding: 0 20rpx;
		padding-bottom: calc(130rpx + env(safe-area-inset-bottom));
		display: flex;
		flex-direction: column;
		position: relative;
	}

	.top-info {
		width: 100%;
		box-sizing: border-box;
		padding: 10rpx;
		background-color: #ffffff;



		.info-line {
			width: 100%;
			display: flex;
			flex-direction: column;
			gap: 20rpx;
			padding: 20rpx 0 40rpx;

			.m-title {
				font-size: 44rpx;
				color: #333333;
				line-height: 68rpx;
				font-weight: bold;
			}

			.info-des {
				font-size: 32rpx;
				color: #555555;
				line-height: 54rpx;
				text-align: justify;
				/* 核心属性：两端对齐 */
			}

			.line-item {
				width: 100%;
				flex: 1;
				display: flex;
				flex-direction: column;
				align-items: center;
				gap: 10rpx;

				.item-top {
					font-size: 28rpx;
				}

				.item-bottom {
					font-size: 32rpx;
					font-weight: bold;
					min-height: 36rpx;
				}
			}

			.info-cnt {
				.item-top {
					width: 100%;
					display: flex;
					justify-content: space-between;
					align-items: center;
					gap: 10rpx;
					position: relative;

					.top-left {
						display: flex;
						flex-direction: column;
						flex: 1;
						gap: 16rpx;

						.tl {
							font-size: 32rpx;
							color: #555555;
						}

						.tl-1 {}

						.tl-2 {}

						/* 营业状态+时间 */
						.status-wrap {
							display: flex;
							align-items: center;
							gap: 10rpx;
							font-size: 28rpx;

							.status-tag {
								padding: 3rpx 6rpx;
								border-radius: 6rpx;
								color: #ffffff;
								font-weight: 500;
								font-size: 28rpx;
								width: 100rpx;
								display: flex;
								justify-content: center;
								align-items: center;
							}

							/* 营业中样式 */
							.open {
								background: #26C761;
							}

							/* 休息中样式 */
							.close {
								background: #Fe7600;
							}

							.business-time {
								color: #555555;
							}
						}
					}

					.top-right {
						flex-shrink: 0;
						width: 100rpx;
						height: 100%;
						box-sizing: border-box;
						display: flex;
						align-items: center;
						justify-content: center;
						transform: translateY(-30rpx);

						.phone-icon {
							width: 67rpx;
							height: 67rpx;
							// position: absolute;
							// top: 20rpx;
							// right: 10rpx;
						}
					}
				}
			}
		}

		.info-line+.info-line {
			border-top: 2rpx solid #eaeaea;
		}
	}

	/* 点赞/收藏/距离 */
	.stats-wrap {
		width: 100%;
		display: flex;
		justify-content: space-between;
		align-items: center;
		gap: 20rpx;
		margin-top: 5rpx;

		.stat-left {
			display: flex;
			align-items: center;
			gap: 20rpx;
		}

		.stat-right {
			flex: 1;
			display: flex;
			align-items: center;
			gap: 20rpx;
			justify-content: flex-end;
		}

		.stat-item {
			display: flex;
			align-items: center;
			gap: 8rpx;

			.stat-icon {
				width: 36rpx;
				height: 36rpx;
			}

			.stat-num {
				font-size: 28rpx;
				color: #333333;
			}

			.stat-num1 {
				color: #555555;
				font-size: 28rpx;
				font-weight: normal;
			}
		}
	}

	.fixed-bottom {
		position: fixed;
		left: 0;
		bottom: 0;
		width: 100%;
		height: calc(100rpx + env(safe-area-inset-bottom));
		padding: 10rpx 30rpx 30rpx;
		box-sizing: border-box;
		background: #ffffff;
		display: flex;
		justify-content: center;
		align-items: center;
		gap: 60rpx;
		z-index: 12;
		border-top: 2rpx solid #eaeaea;
	}

	.btn-class {
		width: 50%;
		height: 86rpx;
		box-sizing: border-box;
		border-radius: 44rpx;
		line-height: 86rpx;
		text-align: center;
		font-size: 36rpx;
		color: #FFFFFF;
		font-weight: 600;
		letter-spacing: 2rpx;
		background: #26C761;
		border: 2rpx solid #22C55E;
	}

	.share-btn {
		background: #FFBB01;
		border: 2rpx solid #FFBB01;
		width: 40%;
	}

	.submit-btn {
		background: #26C761;
		border: 2rpx solid #26C761;
		width: 40%;
	}
</style>