<template>
	<view class="u-page">
		<view class="container">
			<view v-if="isApproved" class="top-info">
				<view class="info-line res-info">
					<view v-if="auditResult == 1" class="audit-result result-approved">
						<view class="res-title">
							审核通过
						</view>
						<view class="res-remark">

						</view>
					</view>
					<view v-else-if="auditResult == 2" class="audit-result result-disApprove">
						<view class="res-title">
							审核拒绝
						</view>
						<view class="res-remark">
							{{ mbaseInfo.approvalReason}}
						</view>
					</view>
				</view>
			</view>
			<view class="top-info form-class">
				<u--form labelPosition="left" :model="mbaseInfo" :rules="rules" ref="uForm" borderBottom
					labelWidth="150" :labelStyle="{}">
					<view class="form-item-class hasTips">
						<u-form-item label="对外展示" required prop="openStatus">
							<view class="form-label" slot="label">
								对外展示
								<view class="required-icon">
									*
								</view>
								<view class="label-tips">
									默认展示商家信息给附近用户，关闭则不展示
								</view>
							</view>
							<view class="form-right" slot="right">
								<u-switch v-model="mbaseInfo.openStatus" :activeValue="1" :inactiveValue="0"
									@change="openStatusChange" size="50" activeColor="#26C761" inactiveColor="#f2f2f2"
									space="6" :disabled="!editable"></u-switch>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class">
						<u-form-item label="有无店面" required prop="isHaveHeadImg">
							<view class="form-label" slot="label">
								有无店面
								<view class="required-icon">
									*
								</view>
							</view>
							<view class="form-right" slot="right">
								<u-radio-group v-model="mbaseInfo.isHaveHeadImg" size="32" iconSize="28"
									:disabled="!editable" placement="row">
									<u-radio activeColor="#22C55E" shape="circle" :name="1" label="有" labelSize="32"
										labelColor="#151A1E">
										<!-- <view class="custom-icon" slot="icon">
											·
										</view> -->
									</u-radio>
									<u-radio activeColor="#22C55E" shape="circle" :name="0" label="无" labelSize="32"
										labelColor="#151A1E"></u-radio>
								</u-radio-group>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class">
						<u-form-item label="商家名称" required prop="merchantName">
							<view class="form-label" slot="label">
								商家名称
								<view class="required-icon">
									*
								</view>
							</view>
							<view class="form-right" slot="right">
								<u--input v-model="mbaseInfo.merchantName" inputAlign="right" fontSize="32"
									color="#151A1E" border="none" :readonly="!editable"></u--input>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class" @click="showTypeSelect = true">
						<u-form-item label="商家类别" required prop="merchantType">
							<view class="form-label" slot="label">
								商家类别
								<view class="required-icon">
									*
								</view>
							</view>
							<view class="form-right" slot="right">
								<view class="form-right-box">
									<view class="">
										{{mbaseInfo.merchantType}}
									</view>
									<view class="f-right-icon">
										<u-icon name="arrow-down" size="32"></u-icon>
									</view>
								</view>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class hasTips">
						<u-form-item label="商家地址" required prop="merchantAddres">
							<view class="form-label" slot="label">
								商家地址
								<view class="required-icon">
									*
								</view>
								<view class="label-tips">
									通过地图定位选择自己的实体店面地址或服务区域地址
								</view>
							</view>
							<view class="form-right" slot="right">
								<view class="form-right-box" @click="tochooselocation">
									<view class="u-line-2">
										{{mbaseInfo.merchantAddres}}
									</view>
									<!-- <u--input v-model="mbaseInfo.merchantAddres" inputAlign="right" fontSize="32"
										color="#151A1E" border="none"></u--input> -->
									<view class="f-right-icon">
										<u-icon name="arrow-right" size="32"></u-icon>
									</view>
								</view>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class hasTips">
						<u-form-item label="地址简称" required prop="merchantShortAddress">
							<view class="form-label" slot="label">
								地址简称
								<view class="required-icon">
									*
								</view>
								<view class="label-tips">
									显示在附近商家列表的商家名称下方
								</view>
							</view>
							<view class="form-right" slot="right">
								<u--input v-model="mbaseInfo.merchantShortAddress" inputAlign="right" fontSize="32"
									color="#151A1E" border="none" :readonly="!editable"></u--input>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class" @click="showOpenDay = true">
						<u-form-item label="营业星期" required prop="openDayDt">
							<view class="form-label" slot="label">
								营业星期
								<view class="required-icon">
									*
								</view>
							</view>
							<view class="form-right" slot="right">
								<view class="form-right-box">
									<view class="">
										{{mbaseInfo.openDayDt}}
									</view>
									<view class="f-right-icon">
										<u-icon name="arrow-down" size="32"></u-icon>
									</view>
								</view>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class" @click="showOpenDt = true">
						<u-form-item label="营业时间" required prop="openDt">
							<view class="form-label" slot="label">
								营业时间
								<view class="required-icon">
									*
								</view>
							</view>
							<view class="form-right" slot="right">
								<view class="form-right-box">
									<view class="">
										{{mbaseInfo.openDt}}
									</view>
									<view class="f-right-icon">
										<u-icon name="arrow-down" size="32"></u-icon>
									</view>
								</view>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class">
						<u-form-item label="客服电话" required prop="merchantPhone">
							<view class="form-label" slot="label">
								客服电话
								<view class="required-icon">
									*
								</view>
							</view>
							<view class="form-right" slot="right">
								<u--input v-model="mbaseInfo.merchantPhone" inputAlign="right" fontSize="32"
									color="#151A1E" border="none" :readonly="!editable"></u--input>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class">
						<u-form-item label="人均价格" required prop="averagePrice">
							<view class="form-label" slot="label">
								人均价格
							</view>
							<view class="form-right" slot="right">
								<u--input v-model="mbaseInfo.averagePrice" inputAlign="right" fontSize="32"
									color="#151A1E" border="none" :readonly="!editable"></u--input>
							</view>
						</u-form-item>
					</view>

					<view class="form-item-class bottom-cnt">
						<u-form-item label="门头照片" required prop="headerLogo">
							<view class="form-label" slot="label">
								门头照片
								<view class="required-icon">
									*
								</view>
							</view>
							<view class="form-right" slot="right">
							</view>
						</u-form-item>
						<view class="form-cnt">
							<u-upload :fileList="fileList_headerLogo" width="640" height="440" @afterRead="afterRead"
								@delete="deletePic" name="headerLogo" :maxCount="1" :deletable="editable"></u-upload>
						</view>
					</view>

					<view class="form-item-class bottom-cnt" v-if="mbaseInfo.isHaveHeadImg">
						<u-form-item label="营业执照" required prop="license">
							<view class="form-label" slot="label">
								营业执照
								<view class="required-icon">
									*
								</view>
							</view>
							<view class="form-right" slot="right">
							</view>
						</u-form-item>
						<view class="form-cnt">
							<u-upload :fileList="fileList_license" width="640" height="440" @afterRead="afterRead"
								@delete="deletePic" name="license" :maxCount="1" :deletable="editable"></u-upload>
						</view>
					</view>

					<view class="form-item-class bottom-cnt">
						<u-form-item label="商家简介" required prop="introduction">
							<view class="form-label" slot="label">
								商家简介
							</view>
							<view class="form-right" slot="right">
								<!-- <u--input v-model="mbaseInfo.introduction" inputAlign="right" fontSize="32" color="#151A1E" border="none"></u--input> -->
							</view>
						</u-form-item>
						<view class="form-cnt">
							<u--textarea v-model="mbaseInfo.introduction" placeholder="请输入..." count height="360"
								maxlength="200" :readonly="!editable"></u--textarea>
						</view>
					</view>

				</u--form>
			</view>
			<view v-if="!isApproved" class="fixed-bottom">
				<view v-if="!isApproved" class="btn-class save-btn" @click="openReject">
					驳回
				</view>
				<view v-if="!isApproved" class="btn-class submit-btn" @click="handleSubmit">
					审核通过
				</view>
			</view>
		</view>

		<u-action-sheet :show="showTypeSelect" :actions="categaryList" title="请选择商家类别" @close="showTypeSelect = false"
			@select="typeSelect">
		</u-action-sheet>

		<u-popup :show="showOpenDay" mode="center" round="32" :closeOnClickOverlay="false">
			<view class="popup-box">
				<view class="popup-title">
					请选择营业星期范围
				</view>
				<picker-view :value="OpenDayArr" @change="bindOpenDayChange" class="c-picker-view">
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in weekArr" :key="index">{{item}}</view>
					</picker-view-column>
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in weekgap" :key="index">{{item}}</view>
					</picker-view-column>
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in weekArr" :key="index">{{item}}</view>
					</picker-view-column>
				</picker-view>
				<view class="popup-item">
					<u-button type="success" shape="circle" @click="showOpenDay = false">确认</u-button>
				</view>
			</view>
		</u-popup>

		<u-popup :show="showOpenDt" mode="center" round="32" :closeOnClickOverlay="false">
			<view class="popup-box">
				<view class="popup-title">
					请选择营业时间范围
				</view>
				<picker-view :value="OpenDtArr" @change="bindOpenDtChange" class="c-picker-view">
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in hours1" :key="index">{{item}}</view>
					</picker-view-column>
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in timemid" :key="index">{{item}}</view>
					</picker-view-column>
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in min1" :key="index">{{item}}</view>
					</picker-view-column>
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in timegap" :key="index">{{item}}</view>
					</picker-view-column>
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in hours1" :key="index">{{item}}</view>
					</picker-view-column>
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in timemid" :key="index">{{item}}</view>
					</picker-view-column>
					<picker-view-column>
						<view class="cpv-item" v-for="(item,index) in min1" :key="index">{{item}}</view>
					</picker-view-column>
				</picker-view>
				<view class="popup-item">
					<u-button type="success" shape="circle" @click="closeOpenDt">确认</u-button>
				</view>
			</view>
		</u-popup>

		<u-popup :show="showReject" mode="center" round="32" :closeOnClickOverlay="false" :safeAreaInsetBottom="false">
			<view class="popup-box">
				<view class="popup-item">
					<text class="popup-title">审核不通过</text>
				</view>
				<view class="popup-item">
					<u--textarea v-model="approvalReason" placeholder="请输入..." count height="360"
						maxlength="200"></u--textarea>
				</view>
				<view class="popup-item">
					<button class="u-reset-button back-ubtn" @click="showReject = false">返回</button>
					<button class="u-reset-button confirm-ubtn" @click="handleReject">发送</button>

					<!-- <u-button class="back-ubtn" type="default" plain shape="circle" @click="showReject = false">返回</u-button>
					<u-button class="confirm-ubtn" type="success" shape="circle" @click="handleReject">发送</u-button> -->
				</view>
			</view>
		</u-popup>
		<u-modal :show="showConfirm" title="审核通过" content='是否确认审核通过' :showCancelButton="true"
			@cancel="showConfirm=false" @close="showConfirm=false" @confirm="confirmSubmit" ref="uModal"
			:closeOnClickOverlay="true" :asyncClose="true"></u-modal>

	</view>
</template>

<script>
	const app = getApp();
	export default {
		data() {
			return {
				auditResult: null,
				editable: true, // 是否可以编辑
				btnloading: false,
				isApproved: false, //是否已审核
				mbaseInfo: {
					merchantName: '',
					headerLogo: '',
					isHaveHeadImg: 1,
					merchantTypeCode: '',
					merchantType: '',
					openStatus: 1,
					merchantAddres: '',
					merchantShortAddress: '',
					openDayDt: '周一至周日', // 营业日
					openStartDayDt: '',
					openEndDayDt: '',
					openDt: '00:00-24:00', //营业时间
					openStartDt: '',
					openEndDt: '',
					introduction: '',
					averagePrice: '',
					merchantPhone: '',
				},
				merchantApprovalInfo: {},
				showTypeSelect: false,
				categaryList: [],
				actions1: [],
				showOpenDay: false,
				OpenDayColumns: [
					['周一', '周二', '周三', '周四', '周五', '周六', '周日']
				],
				OpenDayArr: [0, 0, 6],
				weekArr: ['周一', '周二', '周三', '周四', '周五', '周六', '周日'],
				weekgap: ['至'],
				showOpenDt: false,
				OpenDtArr: [0, 0, 0, 0, 24, 0, 60],
				hours1: ['00', '01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12', '13', '14', '15',
					'16', '17', '18', '19', '20', '21', '22', '23', '24'
				],
				min1: ['00', '01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12', '13', '14', '15',
					'16', '17', '18', '19', '20', '21', '22', '23', '24'
				],
				timemid: [':'],
				timegap: ['-'],
				rules: {
					'merchantName': {
						type: 'string',
						required: true,
						message: '请输入',
						trigger: ['blur', 'change']
					},
					merchantTypeCode: {
						type: 'string',
						required: true,
						message: '请选择',
						trigger: ['change']
					},
					merchantAddres: {
						type: 'string',
						required: true,
						message: '请选择',
						trigger: ['blur', 'change']
					},
					merchantShortAddress: {
						type: 'string',
						required: true,
						message: '请输入',
						trigger: ['blur', 'change']
					},
					openDayDt: {
						type: 'string',
						required: true,
						message: '请选择',
						trigger: ['change']
					},
					openDt: {
						type: 'string',
						required: true,
						message: '请选择',
						trigger: ['change']
					},
					merchantPhone: {
						type: 'string',
						required: true,
						message: '请输入',
						trigger: ['blur', 'change']
					},

					headerLogo: {
						type: 'string',
						required: true,
						message: '请上传',
						trigger: ['change']
					},
					license: {
						type: 'string',
						required: true,
						message: '请上传',
						trigger: ['change']
					},
				},
				fileList_headerLogo: [],
				fileList_license: [],
				userInfo: {},
				showReject: false,
				showConfirm: false,
				approvalReason: '',
				curMerchantCode: '',
			}
		},
		onLoad(option) {
			this.curMerchantCode = option.merchantCode
			this.getMerchantTypeList()
			this.inittimearr()
			this.getUserInfoData()
			this.getMerchantInfo()
		},
		onReady() {
			//如果需要兼容微信小程序，并且校验规则中含有方法等，只能通过setRules方法设置规则。
			this.$refs.uForm.setRules(this.rules)
		},
		onShow() {

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
			// 获取类型列表
			async getMerchantTypeList() {
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
					this.categaryList = newArr
				}
			},
			async getMerchantInfo() {
				// const memberCode = uni.getStorageSync("userInfo").memberCode
				const params = {
					merchantCode: this.curMerchantCode,
				}
				const res = await this.$request("/merchantApproval/queryOne", params)
				if (res.data.code == 200 && res.data.data) {
					const targetone = res.data.data
					if (targetone) {
						this.merchantApprovalInfo = targetone
						this.mbaseInfo = targetone
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
			openStatusChange(e) {
				console.log('对外展示？', e)
			},
			typeSelect(e) {
				this.mbaseInfo.merchantType = e.name
				this.mbaseInfo.merchantTypeCode = e.value
				this.$refs.uForm.validateField('merchantTypeCode')
			},
			// 删除图片
			deletePic(event) {
				this[`fileList_${event.name}`].splice(event.index, 1);
			},
			// 新增图片
			async afterRead(event) {
				if (!this.editable) {
					return
				}
				// 当设置 multiple 为 true 时, file 为数组格式，否则为对象格式
				const urldata = await this.$upLoadFile(event.file.url)
				this[`fileList_${event.name}`] = [{
					'url': urldata.url
				}]
				this.mbaseInfo[`${event.name}`] = urldata.url
				console.log(event, 'xin新增图片：', urldata, this[`fileList_${event.name}`])
			},
			openStartDayChange() {
				this.mbaseInfo.openDayDt = `${this.mbaseInfo.openStartDayDt}至${this.mbaseInfo.openEndDayDt}`
				this.OpenDayArr[0] = this.weekArr.findIndex(item => item == this.mbaseInfo.openStartDayDt)
				this.OpenDayArr[2] = this.weekArr.findIndex(item => item == this.mbaseInfo.openEndDayDt)
			},
			bindOpenDayChange(e) {
				const val = e.detail.value
				this.mbaseInfo.openStartDayDt = `${this.weekArr[val[0]]}`
				this.mbaseInfo.openEndDayDt = `${this.weekArr[val[2]]}`
				this.mbaseInfo.openDayDt = `${this.weekArr[val[0]]}至${this.weekArr[val[2]]}`
			},
			openStartDtChange() {
				this.mbaseInfo.openDt = `${this.mbaseInfo.openStartDt}-${this.mbaseInfo.openEndDt}`
				const startdt = this.mbaseInfo.openStartDt.split(':')
				const enddt = this.mbaseInfo.openEndDt.split(':')
				this.OpenDtArr[0] = this.hours1.findIndex(item => item == startdt[0])
				this.OpenDtArr[2] = this.min1.findIndex(item => item == startdt[1])
				this.OpenDtArr[4] = this.hours1.findIndex(item => item == enddt[0])
				this.OpenDtArr[6] = this.min1.findIndex(item => item == enddt[1])
			},
			closeOpenDt() {
				this.showOpenDt = false
			},
			inittimearr() {
				this.hours1 = []
				this.min1 = []
				for (let i = 0; i <= 24; i++) {
					const ivalue = i > 9 ? i : '0' + i
					this.hours1.push(ivalue)
				}
				for (let j = 0; j <= 59; j++) {
					const jvalue = j > 9 ? j : '0' + j
					this.min1.push(jvalue)
				}
			},
			bindOpenDtChange(e) {
				const val = e.detail.value
				this.mbaseInfo.openStartDt = `${this.hours1[val[0]]}:${this.min1[val[2]]}`
				this.mbaseInfo.openEndDt = `${this.hours1[val[4]]}:${this.min1[val[6]]}`
				this.mbaseInfo.openDt =
					`${this.hours1[val[0]]}:${this.min1[val[2]]}-${this.hours1[val[4]]}:${this.min1[val[6]]}`
			},
			tochooselocation() {
				const that = this
				// uni.openLocation({
				// 	latitude: Number(that.mbaseInfo.latitude),
				// 	longitude: Number(that.mbaseInfo.longitude),
				// 	name: that.mbaseInfo.merchantShortAddress,
				// 	address: that.mbaseInfo.merchantAddres,
				// 	scale: 18
				// })
				// console.log('openlocation失败：' , that.mbaseInfo);

				uni.chooseLocation({
					success: function(res) {
						// console.log(res,'位置名称：' + res.name);
						// console.log('详细地址：' + res.address);
						// console.log('纬度：' + res.latitude);
						// console.log('经度：' + res.longitude);
						that.mbaseInfo.merchantAddres = res.address
						that.mbaseInfo.merchantShortAddress = res.name
						that.mbaseInfo.latitude = res.latitude
						that.mbaseInfo.longitude = res.longitude
					},
					fail: (err) => {
						console.log(err, '获取位置')
					}
				});
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
				this.$refs.uForm.validate().then(res => {
					this.showConfirm = true
				}).catch(errors => {})
			},
			confirmSubmit() {
				this.doSubmit(1)
			},
			async doSubmit(status) {
				if (this.btnloading) {
					return
				}
				await this.auditSave()
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
						uni.setStorageSync("justapproved", true)
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
			// 审核时保存
			async auditSave() {
				return new Promise(async (resolve, reject) => {
					const inviterUserInfo = uni.getStorageSync("userInfo")
					const params = {
						...this.mbaseInfo,
						inviterMemberCode: inviterUserInfo.memberCode,
						inviterMemberName: inviterUserInfo.memeberName,
						inviterMemberPhone: inviterUserInfo.phone,
						headerLogo: this.fileList_headerLogo[0]?.url || '',
						license: this.fileList_license[0]?.url || '',
					}
					const res = await this.$request("/merchantApproval/update", params).catch(err => {
						// this.btnloading = false
					})
					if (res.data.code == 200) {
						resolve(true)
					} else {
						// this.btnloading = false
					}
				})
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
		background: #F7F7F7;
	}

	.container {
		width: 100%;
		// height: 100%;
		height: auto;
		flex: 1;
		background: #f2f2f2;
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
		margin-top: 20rpx;
		background-color: #ffffff;
		border-radius: 30rpx;

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
					font-size: 32rpx;
					font-weight: bold;
					min-height: 36rpx;
				}
			}
		}

		.info-line+.info-line {
			border-top: 1rpx solid #f2f2f2;
		}
	}

	.form-class {
		padding: 20rpx 20rpx 20rpx 30rpx;

		.form-item-class {
			border-bottom: 2rpx solid #DDDDDD;
		}

		.hasTips {
			padding-bottom: 50rpx;

			::v-deep .u-form-item__body__right__message {
				transform: translateY(40rpx);
			}
		}

		.bottom-cnt {
			display: flex;
			flex-direction: column;

			.form-cnt {
				margin-bottom: 20rpx;

				::v-deep .u-upload {
					.u-icon__icon {
						font-size: 64rpx !important;
					}

					.u-upload__deletable {
						width: 42rpx;
						height: 42rpx;
						line-height: 42rpx;
						font-size: 28rpx !important;
					}

					.uicon-close {
						font-size: 28rpx !important;
					}

					.u-upload__deletable__icon {
						top: 40%;
						transform: translateY(-50%);
					}
				}
			}
		}

		.form-label {
			display: flex;
			font-size: 32rpx;
			// height: 70rpx;
			color: #747474;
			margin-right: 10rpx;
			position: relative;

			.required-icon {
				color: red;
			}

			.label-tips {
				position: absolute;
				bottom: -46rpx;
				left: 0;
				width: calc(100vw - 40rpx);
				font-size: 26rpx;
				color: #747474;
			}
		}

		.form-right {
			flex: 1;
			display: flex;
			justify-content: flex-end;
			align-items: center;
			width: 500rpx;
			min-width: 450rpx;
			height: 100%;
			font-size: 32rpx;
			color: #151A1E;
			font-weight: 400;

			.form-right-box {
				flex: 1;
				width: 100%;
				display: flex;
				justify-content: flex-end;
				align-items: center;
			}

			.custom-icon {
				color: #fff;
			}

			.f-right-icon {
				flex-shrink: 0;
				margin-left: 10rpx;
				padding-top: 2rpx;
			}
		}

		::v-deep .u-radio-group {
			justify-content: flex-end;
			gap: 20rpx;
		}

		// ::v-deep .u-form-item__body__right__content__slot{
		// 	justify-content: flex-end;
		// }
	}

	.fixed-bottom {
		position: fixed;
		left: 0;
		bottom: 0;
		width: 100%;
		height: calc(100rpx + env(safe-area-inset-bottom));
		padding: 10rpx 30rpx 30rpx;
		box-sizing: border-box;
		background: #F7F7F7;
		display: flex;
		justify-content: center;
		align-items: center;
		gap: 16rpx;
		z-index: 12;
	}

	.btn-class {
		width: 80%;
		height: 80rpx;
		box-sizing: border-box;
		border-radius: 37rpx;
		line-height: 80rpx;
		text-align: center;
		font-size: 36rpx;
		color: #FFFFFF;
		font-weight: 600;
		letter-spacing: 2rpx;
		background: #26C761;
		border: 2rpx solid #22C55E;
	}

	.save-btn {
		background: #ffffff;
		color: #FF0000;
		border: 2rpx solid #FF0000;
		width: calc(100% / 3);
	}

	.submit-btn {
		width: calc(2 * (100% / 3));
	}

	.popup-box {
		width: 600rpx;
		padding: 20rpx 44rpx 30rpx;
		background: #ffffff;
		border-radius: 44rpx;
		display: flex;
		flex-direction: column;
		align-items: center;
		gap: 10rpx;

		.popup-item {
			width: 100%;
			box-sizing: border-box;
			height: auto;
			padding: 20rpx 30rpx 0;
			display: flex;
			align-items: center;
			gap: 56rpx;

			.popup-title {
				font-size: 36rpx;
				color: #333333;
				font-weight: 600;
				display: flex;
				justify-content: center;
				align-items: center;
				width: 100%;
			}

			.item-left {
				display: flex;
				align-items: center;
			}

			.item-right {
				flex: 1;
				display: flex;
				justify-content: flex-end;
				align-items: center;
			}
		}
	}

	.back-ubtn {
		width: 174rpx;
		height: 62rpx;
		background: #FFFFFF;
		border-radius: 38rpx 38rpx 38rpx 38rpx;
		border: 2rpx solid #BBBBBB;
		font-size: 30rpx;
		color: #747474;
		font-weight: 600;
		display: flex;
		justify-content: center;
		align-items: center;
	}

	.confirm-ubtn {
		width: 174rpx;
		height: 62rpx;
		background: #22C55E;
		border-radius: 38rpx 38rpx 38rpx 38rpx;
		border: 2rpx solid #22C55E;
		font-size: 30rpx;
		color: #FFFFFF;
		font-weight: 600;
		display: flex;
		justify-content: center;
		align-items: center;
	}

	.p-right-icon {
		flex-shrink: 0;
		margin-left: 10rpx;
		padding-top: 2rpx;
	}

	.res-info {
		padding: 20rpx 36rpx !important;

		.audit-result {
			display: flex;
			flex-direction: column;
			gap: 10rpx;

			.res-title {
				font-size: 36rpx;
				font-weight: 600;
			}

			.res-remark {
				flex: 1;
				font-size: 32rpx;
				font-weight: 600;
			}
		}

		.result-approved {
			color: #22C55E;
		}

		.result-disApprove {
			color: #F20000;
		}
	}

	.c-picker-view {
		width: 100%;
		height: 600rpx;
		margin-top: 20rpx;
	}

	.cpv-item {
		line-height: 100rpx;
		text-align: center;
	}
</style>