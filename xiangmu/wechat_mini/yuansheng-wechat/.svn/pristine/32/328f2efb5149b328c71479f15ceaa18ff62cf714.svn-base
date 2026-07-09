<template>
	<view>
		<u-popup :show="show" mode="bottom" round="32" :closeOnClickOverlay="true">
			<view class="support">
				<view class="support_title">
					<view class="">充值支持签到猫平台</view>
					<u-icon name="close-circle" size="50" @click="closeSupport"></u-icon>
				</view>
				<view class="support_miaoshu">
					<view class="support_miaoshu_green">{{ payNum }} 元</view>
					<view class="support_miaoshu_small">/首次充值任意金额可得1张大猫卡</view>
				</view>
				<view class="support_reward" v-if="payConfigList.length !== 0">
					<template v-for="item, index in payConfigList">
						<view :class="['support_reward_item', activeIndex == index ? 'active' : '']"
							@click="changeReward(item, index)">
							￥{{ item.giftAmount }}
						</view>
					</template>
				</view>
				<view class="support_input">
					<u--input placeholder="请输入自定义金额" :placeholderStyle="placeholderStyle" border="surround" type="digit"
						v-model="myPayNum" fontSize="32rpx" :customStyle="{ height: '60rpx' }" @input="handleInput"
						@blur="inputBlur"></u--input>
					<!-- @setFormatter="formatAmount" @input="handleInput" @blur="inputBlur" -->
				</view>
				<view class="support_check">
					<u-checkbox-group v-model="checkboxValue" placement="column" @change="checkboxChange">
						<u-checkbox activeColor="#26C761" size="28" labelSize="28"
							:customStyle="{ marginBottom: '8px' }" v-for="(item, index) in checkboxList" :key="index"
							:label="item" :name="item">
						</u-checkbox>
					</u-checkbox-group>
				</view>
				<view class="support_button">
					<view class="support_button_pay" @click="orderPay">
						确认支付 {{ payNum }} 元
					</view>
				</view>
			</view>
		</u-popup>
	</view>
</template>

<script>
	let timeId = null
	export default {
		name: "rewardSupport",
		data() {
			return {
				show: false,
				payNum: '',
				myPayNum: '',
				placeholderStyle: {
					'font-weight': 'nomarl',
					'font-size': '28rpx',
					'color': ' #9E9E9E',
				},
				payConfigList: [],
				activeIndex: 0,
				checkboxValue: [],
				checkboxList: ['充值即付费成为签到猫平台共建共享创始会员', '请理性充值，每累计充值10元可随机获得1张大猫卡'],
				label1: '充值即付费成为签到猫平台共建共享创始会员',
				label2: '请理性充值，每累计充值10元可随机获得1张大猫卡'
			};
		},
		// onShow() {
		// 	this.getPaySetConfig()
		// },
		methods: {
			// 核心：金额格式化函数（给setFormatter使用）
			formatAmount(val) {
				if (!val) return '';
				let str = val.toString().trim();
				// 1. 过滤非数字和非小数点
				str = str.replace(/[^\d.]/g, "");
				// 2. 只保留一个小数点
				str = str.replace(/\.{2,}/g, ".");
				str = str.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
				// 3. 处理以小数点开头的情况（.12 → 0.12）
				if (str.startsWith('.')) {
					str = '0' + str;
				}
				// 4. 去除整数部分多余的0（000123 → 123，000.12 → 0.12）
				str = str.replace(/^0+(?=\d)/, '');
				if (str === '') str = '0';
				// 5. 强制保留小数点后两位，超出截断
				const decimalIndex = str.indexOf('.');
				if (decimalIndex !== -1) {
					const integerPart = str.substring(0, decimalIndex);
					const decimalPart = str.substring(decimalIndex + 1, decimalIndex + 3); // 只取后两位
					str = `${integerPart || 0}.${decimalPart}`;
				}
				// 6. 同步更新支付金额和选中状态（输入自定义金额时取消预设选中）
				this.payNum = str || '0';
				if (str && str !== '0') {
					this.activeIndex = -1;
				}
				return str;
			},
			// 核心优化：金额过滤，仅保留数字和最多两位小数，兼容不规范输入
			filterTwoDecimals(val) {
				if (!val) return '';
				let str = val.toString().trim();
				// 1. 移除所有非数字和非小数点的字符
				str = str.replace(/[^\d.]/g, "");
				// 2. 只保留第一个小数点，去除多余的
				str = str.replace(/\.{2,}/g, ".");
				str = str.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
				// 3. 处理以小数点开头的情况（如.12 → 0.12）
				if (str.startsWith('.')) {
					str = '0' + str;
				}
				// 4. 处理整数部分多个0的情况（如000123 → 123，000.12 → 0.12）
				str = str.replace(/^0+(?=\d)/, '');
				if (str === '') str = '0'; // 空值重置为0
				// 5. 强制保留小数点后两位，超出部分截断
				const decimalIndex = str.indexOf('.');
				if (decimalIndex !== -1) {
					const integerPart = str.substring(0, decimalIndex);
					const decimalPart = str.substring(decimalIndex + 1, decimalIndex + 3); // 只取后两位
					str = `${integerPart || 0}.${decimalPart}`;
				}
				// 6. 最终格式化（避免0. → 0，0.1 → 0.10等）
				return str.replace(/\.?$/, '').replace(/(\.\d{1})$/, '$10');
			},

			// 优化：输入框实时校验（兼容小程序/uView事件格式）
			handleInput(e) {
				// 统一解析小程序/H5的输入值（关键兼容点）
				let inputValue = '';
				if (typeof e === 'object' && e !== null) {
					// 小程序中uView的input事件返回 {detail: {value: xxx}}
					inputValue = e.detail?.value || '';
				} else if (typeof e === 'string') {
					// H5中直接返回字符串
					inputValue = e;
				}

				// 强制过滤并保留两位小数
				// const filteredValue = this.filterTwoDecimals(inputValue);
				// 同步到输入框（关键：强制覆盖，避免用户输入超两位）
				this.myPayNum = inputValue;

				// 取消预设金额选中状态
				if (this.activeIndex !== -1) {
					this.activeIndex = -1;
				}
				// 同步支付金额（空值时设为0，避免NaN）
				this.payNum = inputValue || '0';
			},

			// 优化：失焦后最终格式化（兜底）
			inputBlur(e) {
				let val = '';
				if (typeof e === 'object' && e !== null) {
					val = e.detail?.value || '';
				} else if (typeof e === 'string') {
					val = e;
				}
				const filtered = this.filterTwoDecimals(val);
				this.myPayNum = val;

				// 空值时恢复默认预设金额
				if (!val || val === '0') {
					this.activeIndex = 0;
					this.payNum = this.payConfigList[0]?.giftAmount || '0';
				} else {
					this.activeIndex = -1;
					this.payNum = val;
				}
			},
			// 关闭打赏框
			closeSupport() {
				this.show = false
			},
			// 切换充值金额
			changeReward(item, index) {
				this.activeIndex = index
				this.myPayNum = ''
				this.payNum = item.giftAmount
			},
			// 选择条例
			checkboxChange(e) {
				console.log(e, '---');
			},
			// 弹出打赏框
			// 查询充值配置
			async getPaySetConfig() {
				const res = await this.$request('/giftAmountSetup/queryList', {})
				console.log(res, '----');
				if (res.data.code == 200 && res.data.data) {
					this.payConfigList = res.data.data
					this.payNum = res.data.data[0]?.giftAmount || 0
				}
				this.show = true
			},
			orderPay() {
				let _this = this
				if (this.payNum == 0 || this.payNum == '') {
					return uni.showToast({
						title: "请选择/输入正确的打赏金额",
						icon: "none",
						duration: 2000
					})
				}
				// 校验不能超过两位小数
				if (!/^\d+(\.\d{1,2})?$/.test(this.payNum)) {
					return uni.showToast({
						title: "金额最多保留两位小数",
						icon: "none",
						duration: 2000
					})
				}
				if (this.checkboxValue.length == 0) {
					return uni.showToast({
						title: "请勾选充值须知",
						icon: "none",
						duration: 2000
					})
				}
				if (!this.checkboxValue.includes(this.label1)) {
					return uni.showToast({
						title: `请勾选${this.label1}`,
						icon: "none",
						duration: 2000
					})
				}
				if (!this.checkboxValue.includes(this.label2)) {
					return uni.showToast({
						title: `请勾选${this.label2}`,
						icon: "none",
						duration: 2000
					})
				}
				if (timeId) {
					clearTimeout(timeId)
				}
				timeId = setTimeout(() => {
					uni.showModal({
						title: "温馨提示",
						content: "确认要充值吗？",
						complete: async (result) => {
							if (result.confirm) {
								uni.showLoading({
									title: "请稍等",
									mask: true
								})
								const memberCode = uni.getStorageSync('userInfo').memberCode
								const res = await _this.$request('/order/unifiedOrder', {
									memberCode,
									sumToPay: _this.payNum
								})
								console.log(res, '-下单结果');
								if (res.data.code == 200) {
									// 拉起支付
									_this.weChatPay(res.data.data.data)
								} else {
									uni.hideLoading()
									uni.showToast({
										title: res.data.message,
										icon: 'none',
										duration: 2000
									})
								}
							}
						}
					})
				}, 500)
			},
			weChatPay(data) {
				let _this = this
				console.log(data, '这是什么');
				const {
					nonce_str,
					msg,
					paySign,
					signType,
					timeStamp
				} = data
				wx.requestPayment({
					'timeStamp': timeStamp,
					'nonceStr': nonce_str,
					'package': msg,
					'signType': signType,
					'paySign': paySign,
					'success': async (a) => {
						uni.hideLoading()
						uni.showToast({
							title: '充值成功',
							duration: 2000
						})
						_this.show = false
						_this.myPayNum = ''
						_this.checkboxValue = []
						_this.activeIndex = 0

						_this.$emit("getUserInfoData")
					},
					'fail': function(res) {
						console.log('支付失败', res)
						uni.showToast({
							title: "取消支付",
							icon: 'none',
							duration: 2000
						})
					},
					'complete': function(res) {
						uni.hideLoading()
						_this.show = false
						_this.activeIndex = 0
						_this.myPayNum = ''
						_this.checkboxValue = []
						console.log(res)
					}
				})

			}
		},
	}
</script>

<style lang="scss" scoped>
	.support {
		padding: 42rpx 26rpx 56rpx 26rpx;

		&_title {
			font-weight: 500;
			font-size: 50rpx;
			color: #333333;
			display: flex;
			justify-content: space-between;
		}

		&_miaoshu {
			display: flex;
			align-items: flex-end;
			margin-top: 10rpx;

			&_green {
				font-weight: 500;
				font-size: 38rpx;
				color: #26C761;
				margin-right: 12rpx;

			}

			&_small {
				font-weight: normal;
				font-size: 24rpx;
				color: #333333;
			}
		}

		&_reward {
			margin: 20rpx 0;
			display: flex;
			justify-content: space-around;
			flex-flow: wrap;

			&_item {
				padding: 20rpx 0;
				width: 30%;
				background: #FFFFFF;
				border-radius: 16rpx 16rpx 16rpx 16rpx;
				border: 2rpx solid #CACACA;
				display: flex;
				justify-content: center;
				align-items: center;
				margin: 10rpx 0;
				font-weight: 500s;
				font-size: 40rpx;
				color: #333333;
			}
		}

		.active {
			background: #26C761;
			font-weight: 600;
			font-size: 40rpx;
			color: #FFFFFF;

		}

		&_input {
			font-weight: 500;
			font-size: 38rpx;
			color: #9E9E9E;
			margin: 26rpx 0;

		}



		&_button {
			&_pay {
				width: 80%;
				margin: 40rpx auto 0;
				background: #26C761;
				border-radius: 42rpx 42rpx 42rpx 42rpx;
				font-weight: 500;
				font-size: 36rpx;
				color: #FFFFFF;
				padding: 16rpx;
				text-align: center;
			}
		}
	}

	// ::deep .custom-input .u-input__wrapper {
	// 	height: 100rpx !important;
	// 	/* 输入框整体高度 */
	// 	line-height: 100rpx !important;
	// 	/* 文字垂直居中（和高度一致） */
	// 	padding: 0 20rpx !important;
	// 	/* 可选：调整左右内边距，避免文字贴边 */
	// }

	::deep .u-checkbox {
		/* 取消默认选中的背景色、边框色 */
		--u-checkbox-checked-bg-color: transparent !important;
		--u-checkbox-checked-border-color: transparent !important;

		/* 自定义勾号颜色（比如设置为绿色，可改为你需要的颜色） */
		--u-checkbox-icon-color: #00C805 !important;
	}

	::deep .u-checkbox__icon--checked {
		font-size: 16px !important;
		/* 勾号大小 */
		/* 若勾号位置偏移，可调整定位 */
		position: relative;
		top: -1px;
		left: 0;
	}

	/* 可选：未选中时的边框样式（保持默认或自定义） */
	::deep .u-checkbox__border {
		border-color: #ccc !important;
		/* 未选中边框色 */
	}

	/* 新增样式也可加在这里，如果想精细控制高度，可以添加如下样式 */
	::deep .u-input__wrapper {
		height: 80rpx !important;
		line-height: 80rpx !important;
	}
</style>