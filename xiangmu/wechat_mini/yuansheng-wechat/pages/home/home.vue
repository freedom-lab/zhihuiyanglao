<template>
	<view class="u-page gradient-bg">
		<view class="backGround" :style="{ height: paddingTop + 'px' }"></view>
		<view class="custom-nav" :style="{ height: headerHeight + 'rpx' }">
			<view class="nav-left" @click="">
				<image class="nav-icon" src="/static/cat-icon.png" mode="widthFix"></image>
				<text class="nav-title">签到猫</text>
			</view>
			<view class="nav-middle">
				<text class="nav-subtitle">签到得猫卡</text>
			</view>
		</view>
		<view class="container">
			<view class="top-info">
				<view class="info-line">
					<view class="line-item" @click="goUserSetting">
						<view class="item-top"> 名字 </view>
						<view class="item-bottom">
							<u-icon name="edit-pen" size="40" v-if="!userInfo.memeberName"></u-icon>
							<view class="item-bottom" v-else>
								{{ userInfo.memeberName }}
							</view>
						</view>
					</view>
					<view class="line-item" @click="goUserSetting">
						<view class="item-top"> 联系 </view>
						<view class="item-bottom">
							<u-icon name="edit-pen" size="40" v-if="!userInfo.contractFirstName"></u-icon>
							<view class="item-bottom" v-else>
								{{ userInfo.contractFirstName }}
							</view>
						</view>
					</view>
					<view class="line-item" @click="updateSwitch">
						<view class="item-top"> 开关 </view>
						<view class="item-bottom">
							<template>
								<view v-if="!userInfo.contractFirstSwitch"> OFF </view>
								<view v-else> ON </view>
							</template>
						</view>
					</view>
				</view>
				<view class="info-line">
					<view class="line-item" @click="goCard(1)">
						<view class="item-top"> 小猫 </view>
						<view class="item-bottom"> {{ userInfo.smallCatAmount || 0 }} </view>
					</view>
					<view class="line-item" @click="goCard(2)">
						<view class="item-top"> 大猫 </view>
						<view class="item-bottom"> {{ userInfo.largeCatAmoount || 0 }} </view>
					</view>
					<view class="line-item" @click="goWelfareCenter">
						<view class="item-top"> 福利 </view>
						<view class="item-bottom"> {{ userInfo.welfareAmount || 1 }} </view>
					</view>
				</view>
				<view class="info-line">
					<view class="line-item">
						<view class="item-top"> 签到 </view>
						<view class="item-bottom"> {{ userInfo.signDayNum || 0 }} </view>
					</view>
					<view class="line-item">
						<button class="u-reset-button" open-type="share" v-if="isHaveMemberPhone">
							<view class="item-top"> 分享 </view>
							<view class="item-bottom"> {{ userInfo.shareMemberNums || 0 }} </view>
						</button>
						<template v-else>
							<view class="item-top"> 分享 </view>
							<view class="item-bottom"> {{ userInfo.shareMemberNums || 0 }} </view>
						</template>
					</view>
					<view class="line-item" @click="payShow">
						<view class="item-top"> 支持 </view>
						<view class="item-bottom"> {{ userInfo.walfareAmount || 0 }} </view>
					</view>
				</view>
			</view>
			<view class="container-cnt">
				<view class="signCount" style="padding-top: 30rpx;padding-left: 20rpx;" @click="goWechat">
					《反内卷新电商宣言》
				</view>
				<view class="cnt-main">
					<view class="sign-btn-wrap" :class="{ 'signed-btn': signed }" @click="handleTabClick()">
						<view class="btn-before"
							:class="{ 'anime1-i': anime1, 'anime2-i': anime2, 'anime3-i': anime3, 'anime4-i': anime4, 'anime5-i': anime5, 'anime6-i': anime6, 'anime7-i': anime7 }">
						</view>
						<view class="sign-btn"
							:class="{ 'anime1': anime1, 'anime2': anime2, 'anime3': anime3, 'anime4': anime4, 'anime5': anime5, 'anime6': anime6, 'anime7': anime7 }">
						</view>
						<view class="center-info">
							<image v-if="!signed" class="nav-icon sign-cat-icon" src="/static/cat-icon.png"
								mode="widthFix"></image>
							<image v-if="signed" class="nav-icon sign-cat-icon" src="/static/cat-icon.png"
								mode="widthFix"></image>
							<text v-if="!signed" class="sign-text">今日签到</text>
							<text v-if="signed" class="sign-text">今日已签到</text>
						</view>
						<view class="btn-after"
							:class="{ 'anime1-o': anime1, 'anime2-o': anime2, 'anime3-o': anime3, 'anime4-o': anime4, 'anime5-o': anime5, 'anime6-o': anime6, 'anime7-o': anime7 }">
						</view>
					</view>
				</view>
				<view class="signCount">
					共计已有 {{signCount}} 人次签到
				</view>
				<view class="cnt-week">
					<view class="desc-area">
						<view class="desc-text">
							<view class="flex justify-center align-center">
								<u-icon name="error-circle" size="32" color="#2dd06e"
									style="display: inline-block; margin-right: 10rpx"></u-icon>
								签到即认可支持的《反内卷新电商宣言》
							</view>
							<view class=""> 希望通过我们所有人的共同努力 </view>
							<view class=""> 推动新电商时代加速到来 </view>
						</view>
					</view>
					<view class="week-sign-area">
						<text class="week-title">本周签到</text>
						<view class="week-days">
							<view class="day-item" v-for="(item, idx) in dateList" :key="idx">
								<template v-if="item.istoday == 'after' || item.istoday === true && !item.isSigned">
									<u-icon name="https://api.ccnet.cc/resources/mini_image/catbglogo.png" size="48"
										color="#bfbfbf"></u-icon>
								</template>
								<template v-else>
									<u-icon v-if="item.isSigned"
										name="https://api.ccnet.cc/resources/mini_image/dui.png" size="48"
										color="#2dd06e"></u-icon>
									<u-icon v-if="!item.isSigned"
										name="https://api.ccnet.cc/resources/mini_image/cuo.png" size="48"
										color="#bfbfbf"></u-icon>
								</template>
								<text class="day-date">{{ item.mday }}</text>
							</view>
						</view>
					</view>
				</view>
			</view>
		</view>
		<loginConfirm ref="loginConfirm" @getUserInfoData="getUserInfoData" />
		<rewardSupport ref="rewardSupport" @getUserInfoData="getUserInfoData" />
	</view>
</template>

<script>
	const app = getApp();
	import loginConfirm from '../../components/loginConfirm/loginConfirm.vue';
	import rewardSupport from '../../components/rewardSupport/rewardSupport.vue';
	export default {
		components: {
			loginConfirm,
			rewardSupport
		},
		data() {
			return {
				isHaveMemberPhone: false,
				paddingTop: 0,
				headerHeight: 0,
				dateList: [],
				signed: false,
				signAnime: null,
				initScaleVal: 1,
				show: false,
				animeStyle: {
					'width': '20rpx',
					'height': '20rpx',
				},
				anime1: false,
				anime2: false,
				anime3: false,
				anime4: false,
				anime5: false,
				anime6: false,
				anime7: false,
				userInfo: {},
				signCount: 0,
				wechatSettingUrl: ""
			};
		},
		onLoad(options) {
			this.$payAttention()
			if (options.inviterCode) {
				console.log(options.inviterCode, '邀请人编码');
				uni.setStorageSync("inviterCode", options.inviterCode)
			}
			if (options.scene) {
				var scene = decodeURIComponent(options.scene)
				console.log(scene, '------------what');
			}
			console.log(app.globalData, "---");
			this.paddingTop = app.globalData.deviceInfo.statusBarHeight;
			this.headerHeight = app.globalData.navHeight;
		},
		onShow() {
			this.querySignCount()
			this.getSystemConfigSetting()
			if (!this.signed) {
				this.setsignedanime()
			}
			this.isHaveMemberPhone = this.$isHavePhone()
			if (this.$isLogin()) {
				this.getUserInfoData();
			} else {
				this.getLogin()
			}
		},
		onHide() {
			this.hideAnime()
		},
		onShareAppMessage(res) {
			if (res.from === 'button') { // 来自页面内分享按钮
				console.log(res.target)
			}
			return {
				title: `我是${this.userInfo.memeberName},邀你使用签到猫`,
				path: `/pages/home/home?inviterCode=${this.userInfo.memberCode}`,
				imageUrl: "https://api.ccnet.cc/resources/mini_image/share1.png"
			}
		},
		methods: {

			async querySignCount() {
				const res = await this.$request("/signRecords/queryPageCount", {})
				if (res.data.code == 200) {
					this.signCount = res.data.data
				}
			},
			async getSystemConfigSetting() {
				const res = await this.$request("/systemConfig/queryOne", {
					propertyKey: "home_wechat_setting"
				})
				if (res.data.code == 200) {
					this.wechatSettingUrl = res.data.data.propertyValue
				}
			},
			goWechat() {
				if (!this.wechatSettingUrl) return
				wx.openOfficialAccountArticle({
					// 服务号文章的链接
					url: this.wechatSettingUrl,
					success(res) {
						console.log('打开文章成功', res);
					},
					fail(err) {
						console.error('打开文章失败', err);
						// 降级处理：提示用户复制链接
						wx.showModal({
							title: '提示',
							content: '无法直接打开文章，请手动复制链接在微信中打开',
							showCancel: false
						});
					}
				});
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

					console.log(app.globalData.messageNum, '---app.globalData.messageNum');
				}
			},
			getLogin() {

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
							this.getUserInfoData()
						} else {

						}

					}
				})
			},
			// 福利中心
			async goWelfareCenter() {
				const login = this.showModalFunc()
				if (login) {
					const res = await this.$request("/systemConfig/queryOne", {
						propertyKey: 'welfare_setting'
					})
					console.log(res, '-----');

					if (res.data.code == 200 && res.data.data.propertyValue) {
						wx.openOfficialAccountArticle({
							url: res.data.data.propertyValue,
							success(res) {
								console.log('打开文章成功', res);
							},
							fail(err) {
								console.error('打开文章失败', err);
								wx.showModal({
									title: '提示',
									content: '无法直接打开文章，请手动复制链接在微信中打开',
									showCancel: false
								});
							}
						});
					} else {
						uni.showToast({
							title: "暂无更多内容，敬请期待",
							icon: "none",
							duration: 2000
						})
					}
				}
			},
			// 提示弹框
			showModalFunc() {
				const isHavePhone = this.$isHavePhone()
				if (!isHavePhone) {
					uni.showModal({
						title: "温馨提示",
						content: "签到前请先完善紧急联系人等信息",
						showCancel: false,
						confirmText: "去完善",
						complete: (res) => {
							if (res.confirm) {
								uni.navigateTo({
									url: "/subPages/userSettingOther/userSettingOther"
								})
							}
						}
					})
					return false
				} else {
					return true
				}
			},
			handleTabClick() {
				if (this.signed) {
					return
				}
				const login = this.showModalFunc()
				if (login) {
					this.isPayatThion()
					this.memberSignToday()
				}
			},
			isPayatThion() {
				let that = this
				wx.getSetting({
					withSubscriptions: true,
					success(res) {
						console.log(res.authSetting)
						console.log(res.subscriptionsSetting, '--------')
						if (!res.subscriptionsSetting.itemSettings) {
							that.$payAttention()
						} else if (res.subscriptionsSetting.GjfGpU_Tjztb1Gy1bd4bAFnlM7XQyhGcBgKvGgFr2h4 !==
							'accept') {
							that.$payAttention()
						}
					}
				})
			},
			setsignedanime() {
				this.initScaleVal = 1
				console.log('启动动画')
				this.signAnime = setInterval(() => {
					if (this.initScaleVal > 10e9) {
						this.initScaleVal = 1
					}
					if (this.initScaleVal % 10 == 0 || this.initScaleVal % 10 == 1 || this.initScaleVal % 10 ==
						9) {
						this.anime1 = false
						this.anime2 = false
						this.anime3 = false
						this.anime4 = false
						this.anime5 = false
						this.anime6 = false
						this.anime7 = false
					} else if (this.initScaleVal % 10 == 2) {
						this.anime1 = true
						this.anime2 = false
						this.anime3 = false
						this.anime4 = false
						this.anime5 = false
						this.anime6 = false
						this.anime7 = false
					} else if (this.initScaleVal % 10 == 3) {
						this.anime1 = false
						this.anime2 = true
						this.anime3 = false
						this.anime4 = false
						this.anime5 = false
						this.anime6 = false
						this.anime7 = false
					} else if (this.initScaleVal % 10 == 4) {
						this.anime1 = false
						this.anime2 = false
						this.anime3 = true
						this.anime4 = false
						this.anime5 = false
						this.anime6 = false
						this.anime7 = false
					} else if (this.initScaleVal % 10 == 5) {
						this.anime1 = false
						this.anime2 = false
						this.anime3 = false
						this.anime4 = true
						this.anime5 = false
						this.anime6 = false
						this.anime7 = false
					} else if (this.initScaleVal % 10 == 6) {
						this.anime1 = false
						this.anime2 = false
						this.anime3 = false
						this.anime4 = false
						this.anime5 = true
						this.anime6 = false
						this.anime7 = false
					} else if (this.initScaleVal % 10 == 7) {
						this.anime1 = false
						this.anime2 = false
						this.anime3 = false
						this.anime4 = false
						this.anime5 = false
						this.anime6 = true
						this.anime7 = false
					} else if (this.initScaleVal % 10 == 8) {
						this.anime1 = false
						this.anime2 = false
						this.anime3 = false
						this.anime4 = false
						this.anime5 = false
						this.anime6 = false
						this.anime7 = true
					}
					this.initScaleVal++
				}, 200)
			},
			hideAnime() {
				this.initScaleVal = 1
				clearInterval(this.signAnime)
				this.anime1 = false
				this.anime2 = false
				this.anime3 = false
				this.anime4 = false
				this.anime5 = false
				this.anime6 = false
				this.anime7 = false
				this.signAnime = null
			},
			payShow() {
				const login = this.showModalFunc()
				if (login) {
					this.$refs.rewardSupport.getPaySetConfig()
				}
			},
			goCard(cardType) {
				const login = this.showModalFunc()
				if (login) {
					uni.navigateTo({
						url: `/subPages/cardDetail/cardDetail?cardType=${cardType}`
					})
				}
			},
			goUserSetting() {
				const login = this.showModalFunc()
				if (login) {
					uni.navigateTo({
						url: '/subPages/userSettingOther/userSettingOther'
					})
				}
			},
			updateSwitch() {
				const login = this.showModalFunc()
				if (login) {
					uni.showModal({
						title: '温馨提示',
						content: '确认操作吗？',
						complete: async (res1) => {
							if (res1.confirm) {
								const res = await this.$request("/member/update", {
									id: this.userInfo.id,
									contractFirstSwitch: !this.userInfo.contractFirstSwitch ? 1 : 0,
								})
								console.log(res, '----');
								if (res.data.code == 200) {
									this.getUserInfoData()
								}
							}
						}
					})
				}
			},
			async memberSignToday() {
				if (this.userInfo.isSignToday == 1) return
				const res = await this.$request("/signRecords/memberSign", {
					memberCode: this.userInfo.memberCode
				})
				console.log(res, '----');
				if (res.data.code == 200) {
					this.getUserInfoData()
					this.signed = true
					this.hideAnime()
					this.querySignCount()
				}
			},
			async getUserInfoData() {
				const islogin = this.$isLogin()
				if (!islogin) {
					this.get7DaysDate();
					return
				}
				const memberCode = uni.getStorageSync("userInfo").memberCode
				const res = await this.$request("/member/queryOne", {
					memberCode
				})
				if (res.data.code == 200 && res.data.data) {
					this.userInfo = res.data.data
					this.userInfo.smallCatAmount = this.$formatNumberToWan(this.userInfo.smallCatAmount);
					this.userInfo.largeCatAmount = this.$formatNumberToWan(this.userInfo.largeCatAmount);
					this.userInfo.welfareAmount = this.$formatNumberToWan(this.userInfo.welfareAmount);
					this.userInfo.signDayNum = this.$formatNumberToWan(this.userInfo.signDayNum);
					this.userInfo.shareMemberNums = this.$formatNumberToWan(this.userInfo.shareMemberNums);
					this.userInfo.walfareAmount = this.$formatNumberToWan(this.userInfo.walfareAmount);
					uni.setStorageSync("userInfo", res.data.data)
					this.getMessageNum()
					console.log(this.userInfo, '---');
				}
				this.get7DaysDate();

			},
			async getSignDays(dateArr) {
				const islogin = this.$isLogin()
				if (islogin) {
					const startTime = dateArr[0].fullDate + " 00:00:00"
					const endTime = dateArr[6].fullDate + " 23:59:59"
					const res = await this.$request('/signRecords/querySignDay', {
						memberCode: this.userInfo.memberCode,
						startTime,
						endTime
					})
					console.log(res, '-------');
					if (res.data.code == 200 && res.data.data.length !== 0) {
						const signDays = res.data.data.map(item => item.signTime);
						const updatedArr = dateArr.map(item => {
							return {
								...item,
								isSigned: signDays.includes(item.fullDate)
							};
						});
						this.dateList = updatedArr;
					} else {
						this.dateList = dateArr;
					}
				} else {
					this.dateList = dateArr;
				}
				let todayData = this.dateList.find(item => item.istoday == true)
				if (todayData && todayData.isSigned) {
					console.log('已签到，关闭动画', this.dateList)
					this.signed = true
					this.hideAnime()
				}
			},
			get7DaysDate() {
				const dateArr = [];
				const today = new Date();
				const weekDays = ['周日', '周一', '周二', '周三', '周四', '周五', '周六'];
				const dayOfWeek = today.getDay() === 0 ? 7 : today.getDay();
				let gettedtoday = false
				for (let i = 0; i < 7; i++) {
					const targetDate = new Date(today);
					targetDate.setDate(today.getDate() - (dayOfWeek - 1) + i);
					const year = targetDate.getFullYear();
					const month = this.addZero(targetDate.getMonth() + 1);
					const day = this.addZero(targetDate.getDate());
					const weekDayName = weekDays[targetDate.getDay()];
					const nozmonth = targetDate.getMonth() + 1
					let istoday = dayOfWeek == targetDate.getDay()
					if (gettedtoday) {
						istoday = 'after'
					}
					if (istoday) {
						gettedtoday = true
					}
					dateArr.push({
						fullDate: `${year}-${month}-${day}`,
						day: day,
						mday: `${nozmonth}.${day}`,
						weekDay: weekDayName,
						isSigned: false,
						istoday: istoday,
					});
				}
				console.log("本周日期信息未处理版：", dateArr);
				this.getSignDays(dateArr)
			},
			addZero(num) {
				return num < 10 ? `0${num}` : `${num}`;
			},
		},
	};
</script>

<style lang="scss" scoped>
	.wrap {
		padding: 12px;
	}

	/* 使页面背景覆盖全屏，并实现分段渐变 */
	.gradient-bg {
		width: 100vw;
		height: 100vh;
		min-height: 100vh;
		position: relative;
		// 下面为分段渐变，50%处过渡，顶部到50%为绿渐变，50%-100%为白色
		background: linear-gradient(to bottom,
				#2dd06e 0%,
				#d4eee0 50%,
				#fff 50.001%,
				#fff 100%);
	}

	/* 保持老样式，防止有其它地方调用 */
	.backGround {
		background: transparent;
		background-color: #2dd06e;
	}

	.u-page {
		width: 100vw;
		height: 100vh;
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
		background: none !important;
	}

	/* 1. 自定义导航栏 */
	.custom-nav {
		display: flex;
		justify-content: center;
		align-items: center;
		padding: 0 24rpx 0;
		background-color: #2dd06e;
		color: #fff;
		position: relative;
		border: none;

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

	.container {
		width: 100%;
		height: calc(100% - env(safe-area-inset-bottom) - 51px);
		flex: 1;
		box-sizing: border-box;
		padding: 0 20rpx;
		display: flex;
		flex-direction: column;
		// gap: 20rpx;
		padding-bottom: calc(env(safe-area-inset-bottom) + 51px);
		position: relative;
		background: linear-gradient(to bottom,
				#2dd06e 0%,
				#d4eee0 30%,
				#ebf9f2 50%,
				#fff 60%,
				#fff 100%);

		// 去掉原本的顶部背景色，全部依赖根页面背景
		.container-bg {
			display: none !important;
		}
	}

	.top-info {
		width: 100%;
		box-sizing: border-box;
		padding: 10rpx;
		background-color: #ffffff;
		border-radius: 30rpx;
		z-index: 1;

		.info-line {
			display: flex;
			justify-content: space-between;
			align-items: center;
			gap: 20rpx;
			padding: 10rpx 0;

			.line-item {
				flex: 1;
				display: flex;
				flex-direction: column;
				align-items: center;
				gap: 10rpx;

				.item-top {
					font-size: 28rpx;
				}

				.item-bottom {
					font-size: 28rpx;
					font-weight: bold;
					min-height: 36rpx;
					max-width: 200rpx;
					white-space: nowrap;
					overflow: hidden;
					text-overflow: ellipsis;
				}
			}
		}

		.info-line+.info-line {
			border-top: 1rpx solid #f2f2f2;
		}
	}


	.container-cnt {
		width: 100%;
		min-height: 50%;
		box-sizing: border-box;
		padding: 0 0rpx;
		margin-top: 20rpx;
		flex: 1;
		display: flex;
		flex-direction: column;
		gap: 20rpx;
		z-index: 1;
		background-color: #ffffff;
		border-radius: 30rpx;

		.cnt-main {
			// flex: 1;
			display: flex;
			flex-direction: column;
			align-items: center;
		}

		.cnt-week {
			background-color: #ffffff;
			border-radius: 30rpx 30rpx 0 0;
			padding-top: 20rpx;
		}
	}

	@keyframes signanime {
		0% {
			opacity: 1;
			transform: scale(1);
		}

		50% {
			transform: scale(1.2);
		}

		100% {
			opacity: 0;
			transform: scale(1.6);
		}
	}

	.anime1 {
		width: 283rpx !important;
		height: 283rpx !important;
	}

	.anime2 {
		width: 287rpx !important;
		height: 287rpx !important;
	}

	.anime3 {
		width: 291rpx !important;
		height: 291rpx !important;
	}

	.anime4 {
		width: 296rpx !important;
		height: 296rpx !important;
	}

	.anime5 {
		width: 292rpx !important;
		height: 292rpx !important;
	}

	.anime6 {
		width: 286rpx !important;
		height: 286rpx !important;
	}

	.anime7 {
		width: 282rpx !important;
		height: 282rpx !important;
	}

	.anime1-i {
		width: 363rpx !important;
		height: 363rpx !important;
	}

	.anime2-i {
		width: 367rpx !important;
		height: 367rpx !important;
	}

	.anime3-i {
		width: 371rpx !important;
		height: 371rpx !important;
	}

	.anime4-i {
		width: 376rpx !important;
		height: 376rpx !important;
	}

	.anime5-i {
		width: 372rpx !important;
		height: 372rpx !important;
	}

	.anime6-i {
		width: 366rpx !important;
		height: 366rpx !important;
	}

	.anime7-i {
		width: 362rpx !important;
		height: 362rpx !important;
	}

	.anime1-o {
		width: 443rpx !important;
		height: 443rpx !important;
	}

	.anime2-o {
		width: 447rpx !important;
		height: 447rpx !important;
	}

	.anime3-o {
		width: 451rpx !important;
		height: 451rpx !important;
	}

	.anime4-o {
		width: 456rpx !important;
		height: 456rpx !important;
	}

	.anime5-o {
		width: 452rpx !important;
		height: 452rpx !important;
	}

	.anime6-o {
		width: 446rpx !important;
		height: 446rpx !important;
	}

	.anime7-o {
		width: 442rpx !important;
		height: 442rpx !important;
	}

	/* 3. 今日签到按钮 */
	.sign-btn-wrap {
		display: flex;
		justify-content: center;
		flex: 1;
		min-height: 400rpx;
		padding: 40rpx 0;
		position: relative;

		.sign-btn {
			width: 280rpx;
			height: 280rpx;
			border-radius: 50%;
			background-color: #14d16d;
			display: flex;
			flex-direction: column;
			justify-content: center;
			align-items: center;
			z-index: 9;
			position: absolute;
			top: 50%;
			left: 50%;
			transform: translate(-50%, -50%);
			transition: all 200ms;
			animation: signanime 5s linear 0 infinite;
		}

		.center-info {
			width: 320rpx;
			height: 320rpx;
			display: flex;
			flex-direction: column;
			justify-content: center;
			align-items: center;
			z-index: 10;
			position: absolute;
			top: 50%;
			left: 50%;
			transform: translate(-50%, -50%);

			.sign-cat-icon {
				width: 150rpx;
				height: 150rpx;
				margin-bottom: 12rpx;
			}

			.sign-text {
				font-size: 32rpx;
				color: #fff;
				font-weight: bold;
				latter-spacing: 3px;
			}
		}

		.btn-before {
			content: "";
			position: absolute;
			top: 50%;
			left: 50%;
			transform: translate(-50%, -50%);
			transition: all 200ms;
			width: 360rpx;
			height: 360rpx;
			border-radius: 50%;
			background-color: #aff4d1;
			z-index: 8;
		}

		.btn-after {
			content: "";
			position: absolute;
			top: 50%;
			left: 50%;
			transform: translate(-50%, -50%);
			transition: all 200ms;
			width: 440rpx;
			height: 440rpx;
			border-radius: 50%;
			background-color: #dbfaeb;
			z-index: 7;
		}
	}

	.signed-btn {
		.sign-btn {
			background-color: #a6a6a6;
		}

		.btn-before {
			background-color: #d9d9d9;
		}

		.btn-after {
			background-color: #f2f2f2;
		}
	}

	.signCount {
		font-size: 28rpx;
		letter-spacing: 2rpx;
		font-weight: 530;
		text-align: center;
	}

	.desc-area {
		padding: 20rpx 32rpx 20rpx;
		display: flex;
		align-items: flex-start;
		gap: 12rpx;
		border-bottom: 1rpx solid #f2f2f2;
		border-top: 1rpx solid #f2f2f2;

		.info-icon {
			width: 28rpx;
			height: 28rpx;
			margin-top: 4rpx;
		}

		.desc-text {
			flex: 1;
			font-size: 28rpx;
			letter-spacing: 2rpx;
			font-weight: 530;
			line-height: 1.6;
			text-align: center;
			white-space: pre-line;
			word-break: break-all;
			word-wrap: break-word;
		}
	}

	.week-sign-area {
		// border-top: 1rpx solid #f2f2f2;
		padding: 16rpx 32rpx 30rpx;

		.week-title {
			font-size: 28rpx;
			font-weight: 500;
			color: #333;
			letter-spacing: 3rpx;
			margin-bottom: 28rpx;
			display: block;
			text-align: center;
		}

		.week-days {
			display: flex;
			justify-content: space-between;

			.day-item {
				display: flex;
				flex-direction: column;
				align-items: center;
				gap: 8rpx;

				.day-date {
					font-size: 28rpx;
					color: #333333;
					font-weight: 500;
				}

				.day-icon {
					width: 46rpx;
					height: 46rpx;
				}
			}
		}
	}

	.bg-purple {
		background: #ced7e1;
	}

	.bg-purple-light {
		background: #e5e9f2;
	}

	.bg-purple-dark {
		background: #99a9bf;
	}
</style>