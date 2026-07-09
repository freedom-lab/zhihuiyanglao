import Vue from "vue";
import VueRouter from "vue-router";
/**
 * 重写路由的push方法
 */
const routerPush = VueRouter.prototype.push;
VueRouter.prototype.push = function push(location) {
  return routerPush.call(this, location).catch(error => error);
};

// 路由懒加载
const Login = () => import("../views/Login.vue");
const Index = () => import("../views/Index.vue");
const Welcome = () => import("../views/auth/index/Welcome.vue");
const Dashboard = () => import("../views/dataCenter/InsAdminWel/Dashboard.vue");
const appointmentVisitStatistics = () => import("../views/dataCenter/elderlyReport/appointmentVisitStatistics.vue");

const employeeManagement = () =>
  import("../views/auth/employee/EmployeeManagement.vue");
const employeeDetail = () =>
  import("../views/auth/employee/EmployeeDetail.vue");
const OrganizationManagement = () =>
  import("../views/auth/organization/OrganizationManagement.vue");
const Post = () => import("../views/auth/post/Post.vue");
const Menu = () => import("../views/auth/menu/Menu.vue");
const Authority = () => import("../views/auth/authority/Authority.vue");
const OrganizationTypeMaintenance = () =>
  import("../views/auth/organizationType/OrganizationType.vue");
const myAccountView = () => import("../views/auth/my/MyAccountView.vue");
const SystemConfig = () => import("../views/systemConfig/SystemConfig.vue");
const SystemConfigDetails = () =>
  import("../views/systemConfig/SystemConfigDetails.vue");
const TableDesign = () => import("../views/coding/tableDesign/TableDesign.vue");
const Table = () => import('../views/coding/table/Table.vue')
const TableDetails = () => import('../views/coding/table/TableDetails.vue')
const TableDdl = () => import('../views/coding/tableDdl/TableDdl.vue')
const TableDdlDetails = () => import('../views/coding/tableDdl/TableDdlDetails.vue')
// const FromDesigner = () => import('../views/fromDesigner/FromDesigner.vue')


const LoginLog = () => import('../views/loginLog/LoginLog.vue')
const LoginLogDetails = () => import('../views/loginLog/LoginLogDetails.vue')

//design
const FromDesigner = () => import('../components/formDesigner.vue')
const DialogTest = () => import('../views/fromDesigner/dialogTest.vue')
const QueryDialogTest = () => import('../views/fromDesigner/queryDialogTest.vue')
const View = () => import('../views/fromDesigner/view.vue')
const DesignTable = () => import('../views/fromDesigner/table.vue')

const Buildingss = () => import("../views/sysmanage/buildingss.vue");

const RoleMenu = () => import("../views/auth/roleMenu/RoleMenu.vue");
//老人档案
const PielderlyDetail = () => import("../views/pensioninstitution/pielderlydetail.vue");
// 子页面组件
const BaseInfo = () => import("../views/pensioninstitution/child/BaseInfo.vue");
const HealthFile = () => import("../views/pensioninstitution/child/HealthFile.vue");
const NurseEvaluate = () => import("../views/pensioninstitution/child/NurseEvaluate.vue");
const DrugManage = () => import("../views/pensioninstitution/child/DrugManage.vue");
const CostManage = () => import("../views/pensioninstitution/child/CostManage.vue");
const InfoLog = () => import("../views/pensioninstitution/child/InfoLog.vue");
const SignData = () => import("../views/pensioninstitution/child/SignData.vue");
const CheckInfo = () => import("../views/pensioninstitution/child/CheckInfo.vue");
const DoctorAdvice = () => import("../views/pensioninstitution/child/DoctorAdvice.vue");
const MedicalRecord = () => import("../views/pensioninstitution/child/MedicalRecord.vue");
const OutRecord = () => import("../views/pensioninstitution/child/OutRecord.vue");


//-----------运营中心-----------
//入住导航
const CheckInNavi = () => import("../views/operationsCenter/navigation/CheckInNav.vue");
//---咨询接待---
//预约接待
const InsRegisterConsultInfo = () => import("../views/operationsCenter/insRegisterConsultInfo/InsRegisterConsultInfo.vue");
//床位预定登记
const InsRegisterConsultBedInfo = () => import("../views/operationsCenter/insRegisterConsultBedInfo/insRegisterConsultBedInfo.vue");
//探访信息登记
const InsRegisterVisitInfo = () => import("../views/operationsCenter/insRegisterVisitInfo/InsRegisterVisitInfo.vue");
//费用标准
const InsCostInfoSearch = () => import("../views/operationsCenter/insCostInfoSearch/insCostInfoSearch.vue");
//床位监测
const InsBaseBedMonitor = () => import("../views/operationsCenter/insBaseBedMonitor/insBaseBedMonitor.vue");

//---入住办理---
//入住评估
const InsElderCheckInfoAssessment = () => import("../views/operationsCenter/insElderCheckInfoAssessment/insElderCheckInfoAssessment.vue");
//入住档案登记
const InsElderCheckInfoRegister = () => import("../views/operationsCenter/insElderCheckInfoRegister/insElderCheckInfoRegister.vue");
//院长审核
const InsElderCheckInfoAudit = () => import("../views/operationsCenter/insElderCheckInfoAudit/insElderCheckInfoAudit.vue");

//---在住管理---
//入住老人管理
const InsElderCheckInfoManager = () => import("../views/operationsCenter/insElderCheckInfoManager/insElderCheckInfoManager.vue");
//试住老人管理
const InsElderCheckInfoTry = () => import("../views/operationsCenter/insElderCheckInfoTry/insElderCheckInfoTry.vue");
//新入住7日追踪
const InsElderTrackRecord = () => import("../views/operationsCenter/insElderTrackRecord/InsElderTrackRecord.vue");
//医保卡管理
const HealthInsuranceCard = () => import("../views/operationsCenter/healthInsuranceCard/healthInsuranceCard.vue");
//老人健康档案
const HealthBaseInfo = () => import("../views/operationsCenter/healthBaseInfo/HealthBaseInfo.vue");
//老人生活相册
const InsElderPhotoInfo = () => import('../views/operationsCenter/insElderPhotoInfo/InsElderPhotoInfo.vue')
//床位变更申请
const InsElderChangeBedRecord = () => import('../views/operationsCenter/insElderChangeBedRecord/InsElderChangeBedRecord.vue')
//餐费变更申请
const InsExpensesChangeFoodRecord = () => import('../views/operationsCenter/insExpensesChangeFoodRecord/InsExpensesChangeFoodRecord.vue')
//老人保险信息
const InsElderInsureInfo = () => import('../views/operationsCenter/insElderInsureInfo/InsElderInsureInfo.vue')
//老人照护计划
const ElderCareNursingStandard = () => import('../views/operationsCenter/elderCareNursingStandard/elderCareNursingStandard.vue')

//退住管理
//老人退住申请
const InsElderRetreatInfoApply = () => import('../views/operationsCenter/insElderRetreatInfo/InsElderRetreatInfoApply.vue')
//老人退住记录
const InsElderRetreatInfoRecord = () => import('../views/operationsCenter/insElderRetreatInfo/InsElderRetreatInfoRecord.vue')

//---餐厅管理---
//菜品发布管理
const InsCanteenFoodInfo = () => import('../views/operationsCenter/insCanteenFoodInfo/InsCanteenFoodInfo.vue')
//每周菜品展示
const InsCanteenWeekMenu = () => import('../views/operationsCenter/insCanteenWeekMenu/InsCanteenWeekMenu.vue')
//厨房设备保养记录
const CanteenDeviceMaintain = () => import('../views/operationsCenter/canteenDeviceMaintain/CanteenDeviceMaintain.vue')
//助餐厨房餐具消毒记录
const CanteenKitchenDisinfect = () => import('../views/operationsCenter/canteenKitchenDisinfect/CanteenKitchenDisinfect.vue')
//助餐厨房卫生检查记录
const CanteenKitchenHygiene = () => import('../views/operationsCenter/canteenKitchenHygiene/CanteenKitchenHygiene.vue')
//剩菜处理记录
const CanteenLeftoverDisposal = () => import('../views/operationsCenter/canteenLeftoverDisposal/CanteenLeftoverDisposal.vue')
// 堂食就餐记录
const DineInRecord = () => import('../views/operationsCenter/dineInRecord/dineInRecord.vue')
// 退单退款管理
const FoodOrderingRetrun = () => import('../views/operationsCenter/foodOrderingRetrun/foodOrderingRetrun.vue')
// 点餐服务
const FoodOrderingService = () => import('../views/operationsCenter/foodOrderingService/foodOrderingService.vue')
// 送餐计划管理
const InsCanteenPlanSetting = () => import('../views/operationsCenter/insCanteenPlanSetting/InsCanteenPlanSetting.vue')
// 送餐派单管理
const MealDeliveryDispatch = () => import('../views/operationsCenter/mealDeliveryDispatch/mealDeliveryDispatch.vue')
// 送餐完成记录
const MealDeliveryFinish = () => import('../views/operationsCenter/mealDeliveryFinish/mealDeliveryFinish.vue')
// 送餐跟踪管理
const MealDeliveryTacking = () => import('../views/operationsCenter/mealDeliveryTacking/mealDeliveryTacking.vue')
//菜品采购记录
const InsVegetableOrderInfo = () => import('../views/operationsCenter/insVegetableOrderInfo/InsVegetableOrderInfo.vue')
//食材分类设置
const InsCanteenFoodCategory = () => import('../views/operationsCenter/insCanteenFoodCategory/InsCanteenFoodCategory.vue')
//禁忌与过敏源设置
const InsCanteenFoodTabooRel = () => import('../views/operationsCenter/insCanteenFoodTabooRel/InsCanteenFoodTabooRel.vue')
//食材营养信息
const InsCanteenFoodMaterial = () => import('../views/operationsCenter/insCanteenFoodMaterial/InsCanteenFoodMaterial.vue')
//每日膳食上报
const InsCanteenDailyRecipe = () => import('../views/operationsCenter/insCanteenDailyRecipe/InsCanteenDailyRecipe.vue')
//老人每日营养摄入统计
const ElderNutritionDailyStat = () => import('../views/operationsCenter/elderNutritionDailyStat/elderNutritionDailyStat.vue')
//老人每周营养摄入统计
const ElderNutritionWeeklyStat = () => import('../views/operationsCenter/elderNutritionWeeklyStat/elderNutritionWeeklyStat.vue')
//餐品类别分布统计
const FoodCategoryDistStat = () => import('../views/operationsCenter/foodCategoryDistStat/foodCategoryDistStat.vue')


//---评估管理---
//评估预警管理
const InsElderAssessmentWarning = () => import('../views/operationsCenter/insElderAssessmentWarning/InsElderAssessmentWarning.vue')
// 能力评估
const AbilityAssessment = () => import('../views/abilityAssessment/abilityAssessment.vue')//任务
const AddAbilityAssessment = () => import('../views/abilityAssessment/addAbilityAssessment.vue')//新增任务
const AbilityAssessmentRecord = () => import('../views/abilityAssessment/abilityAssessmentRecord.vue')//记录
// 专项评估
const SpecialAssessment = () => import('../views/specialAssessment/specialAssessment.vue')//任务
const SpecialAssessmentRecord = () => import('../views/specialAssessment/specialAssessmentRecord.vue')//记录
// 九防评估
const CustomAssessment = () => import('../views/customAssessment/customAssessment.vue')//任务
const CustomAssessmentRecord = () => import('../views/customAssessment/customAssessmentRecord.vue')//记录
//能力评估结果
const AssessmentResult = () => import('../views/assessmentResult/AssessmentResult.vue')
//评估模板
const AssessmentTemplate = () => import('../views/assessmentTemplate/AssessmentTemplate.vue')
//老人档案
const AssessmentElderBase = () => import('../views/assessmentElderBase/AssessmentElderBase.vue')

//---合同管理---
//老人合同跟踪
const InsElderContractInfo = () => import('../views/operationsCenter/insElderContractInfo/InsElderContractInfo.vue')
//合同到期预警
const InsElderContractWarning = () => import('../views/operationsCenter/insElderContractWarning/InsElderContractWarning.vue')

//---多协议签订---
//多协议签订
const InsElderMoreContractInfoSign = () => import('../views/operationsCenter/insElderMoreContractInfoSign/insElderMoreContractInfoSign.vue')

//---关怀管理---
//老人生日提醒
const ElderBrthdayRemind = () => import('../views/operationsCenter/elderBrthdayRemind/elderBrthdayRemind.vue')
//用药关怀提醒
const CommunityMedicationRemind = () => import('../views/operationsCenter/communityMedicationRemind/CommunityMedicationRemind.vue')
//主动关怀
const CommunityActiveCareRecord = () => import('../views/operationsCenter/communityActiveCareRecord/CommunityActiveCareRecord.vue')

//财务结算
//退住确认单
const InsExpensesRetreatSure = () => import('../views/operationsCenter/insExpensesRetreatSure/InsExpensesRetreatSure.vue')

//入住押金管理
const CheckInDepositManagement = () => import('../views/operationsCenter/checkInDepositManagement/CheckInDepositManagement.vue')
//老人账户管理
const ElderAccountManage = () => import('../views/operationsCenter/elderAccountManage/ElderAccountManage.vue')
//月度费用核算
const MonthlyFeeCalculate = () => import('../views/operationsCenter/monthlyFeeCalculate/monthlyFeeCalculate.vue')
//预缴月度费用
const PrepayMonthlyFee = () => import('../views/operationsCenter/prepayMonthlyFee/prepayMonthlyFee.vue')
//出院费用核算
const LeaveHospitalFeeCalculate = () => import('../views/operationsCenter/leaveHospitalFeeCalculate/LeaveHospitalFeeCalculate.vue')
//入住账单缴费
const CheckInBillPayment = () => import('../views/operationsCenter/checkInBillPayment/CheckInBillPayment.vue')
//日常账单缴费
const DailyBillPayment = () => import('../views/operationsCenter/dailyBillPayment/DailyBillPayment.vue')
//收费标准调整
const FeeStandardAdjust = () => import('../views/operationsCenter/feeStandardAdjust/FeeStandardAdjust.vue')
//缴费单据明细 
const PaymentBillDetail = () => import('../views/operationsCenter/paymentBillDetail/PaymentBillDetail.vue')
//缴费记录明细
const PaymentRecordDetail = () => import('../views/operationsCenter/paymentRecordDetail/PaymentRecordDetail.vue')
//老人欠费账单
const ElderArrearsBill = () => import('../views/operationsCenter/elderArrearsBill/ElderArrearsBill.vue')
//水电抄表账单
const WaterElectricMeterBill = () => import('../views/operationsCenter/waterElectricMeterBill/WaterElectricMeterBill.vue')
//临时费用记录
const TemporaryFeeRecord = () => import('../views/operationsCenter/temporaryFeeRecord/TemporaryFeeRecord.vue')
//成本费用登记
const CostFeeRegister = () => import('../views/operationsCenter/costFeeRegister/CostFeeRegister.vue')
//老人费用统计
const ElderFeeStatistics = () => import('../views/operationsCenter/elderFeeStatistics/ElderFeeStatistics.vue')



//-----------健康中心-----------
//老人健康档案
const HealthBaseInfoCenter = () => import('../views/healthCenter/healthBaseInfo/HealthBaseInfo.vue')
//老人就诊记录
const HealthVisitRecords = () => import('../views/healthCenter/healthVisitRecords/HealthVisitRecords.vue')
//体检信息管理
const HealthPhysicalCheck = () => import('../views/healthCenter/healthPhysicalCheck/HealthPhysicalCheck.vue')
//健康检测管理
const InsHealthPhysicalReport = () => import('../views/healthCenter/insHealthPhysicalReport/InsHealthPhysicalReport.vue')
//客户健康阈值
const InsElderHealthParam = () => import('../views/healthCenter/insElderHealthParam/InsElderHealthParam.vue')
//健康预警管理
const HealthWarningLog = () => import('../views/healthCenter/healthWarningLog/HealthWarningLog.vue')
//健康 AI 分析
const HealthAiAnalysis = () => import('../views/healthCenter/healthAiAnalysis/HealthAiAnalysis.vue')
//慢病档案
const HealthChronicDiseaseArchive = () => import('../views/healthCenter/healthChronicDiseaseArchive/HealthChronicDiseaseArchive.vue')
//慢病统计
const healthChronicDiseaseArchiveCount = () => import('../views/healthCenter/healthChronicDiseaseArchive/HealthChronicDiseaseArchive.vue')
//干预方案
const HealthInterventionPlan = () => import('../views/healthCenter/healthInterventionPlan/HealthInterventionPlan.vue')
//随访提醒
const HealthDiseaseFollow = () => import('../views/healthCenter/healthDiseaseFollow/HealthDiseaseFollow.vue')
//随访评估
const HealthFollowUp = () => import('../views/healthCenter/healthFollowUp/HealthFollowUp.vue')
//慢病字典
const HealthChronicDiseaseDict = () => import('../views/healthCenter/healthChronicDiseaseDict/HealthChronicDiseaseDict.vue')
//慢病模板
const HealthInterventionsTemple = () => import('../views/healthCenter/healthInterventionsTemple/HealthInterventionsTemple.vue')
//疾病百科
const HealthDiseaseEncyclopedia = () => import('../views/healthCenter/healthDiseaseEncyclopedia/HealthDiseaseEncyclopedia.vue')
//风险等级评估
const InsSecurityDangersCheck = () => import('../views/healthCenter/insSecurityDangersCheck/InsSecurityDangersCheck.vue')
//血压采集管理
const HealthBloodPressure = () => import('../views/healthCenter/healthBloodPressure/HealthBloodPressure.vue')
//血糖采集管理
const HealthBloodSugar = () => import('../views/healthCenter/healthBloodSugar/HealthBloodSugar.vue')
//血氧采集管理
const HealthBloodOxygen = () => import('../views/healthCenter/healthBloodOxygen/HealthBloodOxygen.vue')
//心率采集管理
const HealthEcgRecords = () => import('../views/healthCenter/healthEcgRecords/HealthEcgRecords.vue')
//体温采集管理
const HealthTemperatureRecords = () => import('../views/healthCenter/healthTemperatureRecords/HealthTemperatureRecords.vue')
//运动采集管理
const HealthSportRecords = () => import('../views/healthCenter/healthSportRecords/HealthSportRecords.vue')
//BMI 采集管理
const HealthBasicsRecords = () => import('../views/healthCenter/healthBasicsRecords/HealthBasicsRecords.vue')
//尿酸采集管理
const HealthUricacidRecords = () => import('../views/healthCenter/healthUricacidRecords/HealthUricacidRecords.vue')
//尿常规采集管理
const HealthUrinalysisRecords = () => import('../views/healthCenter/healthUrinalysisRecords/HealthUrinalysisRecords.vue')
//血液酮体采集管理
const HealthBloodKetone = () => import('../views/healthCenter/healthBloodKetone/HealthBloodKetone.vue')
//动脉硬化采集管理
const HealthArteriosclerosis = () => import('../views/healthCenter/healthArteriosclerosis/HealthArteriosclerosis.vue')
//骨密度采集管理
const HealthBoneDensity = () => import('../views/healthCenter/healthBoneDensity/HealthBoneDensity.vue')
//心血管采集管理
const HealthCardiovascular = () => import('../views/healthCenter/healthCardiovascular/HealthCardiovascular.vue')
//视力采集管理
const HealthEyesight = () => import('../views/healthCenter/healthEyesight/HealthEyesight.vue')
//肺呼吸采集管理
const HealthLungBreathing = () => import('../views/healthCenter/healthLungBreathing/HealthLungBreathing.vue')
//肺功能采集管理
const HealthLungFunction = () => import('../views/healthCenter/healthLungFunction/HealthLungFunction.vue')
//血红蛋白采集管理
const HealthHemoglobinRecords = () => import('../views/healthCenter/healthHemoglobinRecords/HealthHemoglobinRecords.vue')
//长期医嘱
const InsMedicalDoctorAdvice = () => import('../views/healthCenter/insMedicalDoctorAdvice/InsMedicalDoctorAdvice.vue')
//临时医嘱
const insMedicalDoctorAdviceTemporary = () => import('../views/healthCenter/insMedicalDoctorAdvice/InsMedicalDoctorAdvice.vue')

//远程问诊记录
const InsMedicalConsultationRecord = () => import('../views/healthCenter/insMedicalConsultationRecord/InsMedicalConsultationRecord.vue')
//用药计划设置
const InsMedicalDrugInfo = () => import('../views/healthCenter/insMedicalDrugInfo/InsMedicalDrugInfo.vue')
//用药执行记录
const InsMedicalDrugExecuteRecord = () => import('../views/healthCenter/insMedicalDrugExecuteRecord/InsMedicalDrugExecuteRecord.vue')
//自带药品登记
const InsMedicalSelfDrug = () => import('../views/healthCenter/insMedicalSelfDrug/InsMedicalSelfDrug.vue')
//药品库存提醒
const InsMedicalDrugInventory = () => import('../views/healthCenter/insMedicalDrugInventory/InsMedicalDrugInventory.vue')



//-----------照护中心-----------
//护理项目设置
const InsNursingItemInfo = () => import('../views/careCenter/insNursingItemInfo/InsNursingItemInfo.vue')
//照护计划设置
const CareNursingPlanSetting = () => import('../views/careCenter/careNursingPlanSetting/CareNursingPlanSetting.vue')
//照护计划调整
const CareNursingPlanAdjustment = () => import('../views/careCenter/careNursingPlanSetting/CareNursingPlanSetting.vue')
//查看合同
const ReviewContract = () => import('../views/careCenter/insElderContractInfo/InsElderContractInfo.vue')
//护理任务看板
const InsNursingElderStandard = () => import('../views/careCenter/insNursingElderStandard/InsNursingElderStandard.vue')
//护理任务计划
const InsNursingPlanSetting = () => import('../views/careCenter/insNursingPlanSetting/InsNursingPlanSetting.vue')
//护理任务监测
const InsNursingTaskMonitoring = () => import('../views/careCenter/insNursingElderStandard/InsNursingElderStandard.vue')
//异常护理任务
const InsAbnormalNursingTask = () => import('../views/careCenter/insNursingElderStandard/InsNursingElderStandard.vue')
//房间任务记录
const InsNursingRoomExecutionRecord = () => import('../views/careCenter/insNursingRoomExecutionRecord/InsNursingRoomExecutionRecord.vue')
//护理图片查看
const InsNursingExecutionRecord = () => import('../views/careCenter/insNursingExecutionRecord/InsNursingExecutionRecord.vue')
//护理任务汇总
const InsSummaryNursingTasks = () => import('../views/careCenter/insNursingElderStandard/InsNursingElderStandard.vue')
//护理任务报表
const InsNursingTaskReport = () => import('../views/careCenter/insNursingElderStandard/InsNursingElderStandard.vue')
//护理服务绩效统计
const InsNursingPerformanceStatistics = () => import('../views/careCenter/insNursingElderStandard/InsNursingElderStandard.vue')
//服务项目数量统计
const InsNursingTaskRecordStatistics = () => import('../views/careCenter/insNursingExecutionRecord/InsNursingExecutionRecord.vue')
//一般照护记录
const InsNursingGeneralRecord = () => import('../views/careCenter/insNursingGeneralRecord/InsNursingGeneralRecord.vue')
//老人翻身记录
const InsNursingTurnoverRecord = () => import('../views/careCenter/insNursingTurnoverRecord/InsNursingTurnoverRecord.vue')
//临时护理记录
const InsNursingTemporaryRecord = () => import('../views/careCenter/insNursingTemporaryRecord/InsNursingTemporaryRecord.vue')
//服务项目设置
const InsNursingServiceItem = () => import('../views/careCenter/insNursingServiceItem/InsNursingServiceItem.vue')
//自选服务订单
const InsNursingServiceOrder = () => import('../views/careCenter/insNursingServiceOrder/InsNursingServiceOrder.vue')
//自选服务提醒
const InsNursingServiceReminder = () => import('../views/careCenter/insNursingServiceOrder/InsNursingServiceOrder.vue')
//康复训练项目
const InsNursingRehabItem = () => import('../views/careCenter/insNursingRehabItem/InsNursingRehabItem.vue')
//康复训练计划
const InsNursingRehabSetting = () => import('../views/careCenter/insNursingRehabSetting/InsNursingRehabSetting.vue')
//康复训练记录
const InsNursingRehabExecutionRecord = () => import('../views/careCenter/insNursingRehabExecutionRecord/InsNursingRehabExecutionRecord.vue')
//护理组变更
const InsNursingChangeGroupRecord = () => import('../views/careCenter/insNursingChangeGroupRecord/InsNursingChangeGroupRecord.vue')
//护理等级变更
const InsNursingChangeNursingRecord = () => import('../views/careCenter/insNursingChangeNursingRecord/InsNursingChangeNursingRecord.vue')
//护理组设置
const InsNursingGroupInfo = () => import('../views/careCenter/insNursingGroupInfo/InsNursingGroupInfo.vue')
//护理人员设置
const InsNursingGroupMember = () => import('../views/careCenter/insNursingGroupMember/InsNursingGroupMember.vue')
//巡房计划设置
const InsNursingPlanRoom = () => import('../views/careCenter/insNursingPlanRoom/InsNursingPlanRoom.vue')
//巡房执行记录
const InsNursingRoomInspectionExecutionRecord = () => import('../views/careCenter/insNursingRoomExecutionRecord/InsNursingRoomExecutionRecord.vue')
//巡房执行看板
const InsNursingRoomInspectionDashboard = () => import('../views/careCenter/insNursingRoomExecutionRecord/InsNursingRoomExecutionRecord.vue')
//临时费用记录
const InsExpensesPurchaseRecord = () => import('../views/careCenter/insExpensesPurchaseRecord/InsExpensesPurchaseRecord.vue')
//医护查房记录
const InsMedicalCheckRoomRecord = () => import('../views/careCenter/insMedicalCheckRoomRecord/InsMedicalCheckRoomRecord.vue')


//-----------综合管控-----------
//护理班次设置
const InsSchedulingClasses = () => import('../views/unifiedControl/insSchedulingClasses/InsSchedulingClasses.vue')
//护理排班设置
const InsSchedulingTable = () => import('../views/unifiedControl/insSchedulingTable/InsSchedulingTable.vue')
//护理排班看板
const InsSchedulingTableSettings = () => import('../views/unifiedControl/insSchedulingTableSettings/InsSchedulingTableSettings.vue')
//护士排班设置
const InsNurseSchedulingSettings = () => import('../views/unifiedControl/insSchedulingTable/InsSchedulingTable.vue')
//护士排班看板
const InsNurseSchedulingTable = () => import('../views/unifiedControl/insSchedulingTableSettings/InsSchedulingTableSettings.vue')
//换班申请审核
const InsSchedulingHandoverReview = () => import('../views/unifiedControl/insSchedulingHandoverRecord/InsSchedulingHandoverRecord.vue')
//交接班记录
const InsSchedulingHandoverRecord = () => import('../views/unifiedControl/insSchedulingHandoverRecord/InsSchedulingHandoverRecord.vue')
//培训类别设置
const InsTrainType = () => import('../views/unifiedControl/insTrainType/InsTrainType.vue')
//培训信息设置
const InsTrainInfo = () => import('../views/unifiedControl/insTrainInfo/InsTrainInfo.vue')
//培训信息发布
const InsTrainRelease = () => import('../views/unifiedControl/insTrainRelease/InsTrainRelease.vue')
//员工知识培训
const OcTrainKnowledge = () => import('../views/unifiedControl/ocTrainRecord/OcTrainRecord.vue')
//员工技能培训
const OcTrainSkill = () => import('../views/unifiedControl/ocTrainRecord/OcTrainRecord.vue')
//员工档案管理
const InsStaffMemberCardInfo = () => import('../views/unifiedControl/insStaffMemberCardInfo/InsStaffMemberCardInfo.vue')
//员工请假管理
const InsStaffLeaveRecord = () => import('../views/unifiedControl/insStaffLeaveRecord/InsStaffLeaveRecord.vue')
//员工合同管理
const InsStaffContractInfo = () => import('../views/unifiedControl/insStaffContractInfo/InsStaffContractInfo.vue')
//员工生日提醒
const InsStaffBirthdayReminder = () => import('../views/unifiedControl/insStaffMemberCardInfo/InsStaffMemberCardInfo.vue')
//员工考勤管理
const InsFaceStaffSignRecord = () => import('../views/unifiedControl/insFaceStaffSignRecord/InsFaceStaffSignRecord.vue')
//员工离职记录
const InsStaffDimissionRecord = () => import('../views/unifiedControl/insStaffDimissionRecord/InsStaffDimissionRecord.vue')
//员工薪资管理
const InsStaffSalaryRecord = () => import('../views/unifiedControl/insStaffSalaryRecord/InsStaffSalaryRecord.vue')
//考评中心
const InsStaffEvaluationGroup = () => import('../views/unifiedControl/insStaffEvaluationGroup/InsStaffEvaluationGroup.vue')
//考评任务
const InsStaffEvaluationTasks = () => import('../views/unifiedControl/insStaffEvaluationTasks/InsStaffEvaluationTasks.vue')
//考评执行
const InsStaffEvaluationExcute = () => import('../views/unifiedControl/insStaffEvaluationTasks/InsStaffEvaluationTasks.vue')
//考评记录
const InsStaffEvaluationRecord = () => import('../views/unifiedControl/insStaffEvaluationRecord/InsStaffEvaluationRecord.vue')
//考评模板
const InsStaffEvaluationTemplate = () => import('../views/unifiedControl/insStaffEvaluationTemplate/InsStaffEvaluationTemplate.vue')
//物品分类
const InsLogisticsGoodsType = () => import('../views/unifiedControl/insLogisticsGoodsType/InsLogisticsGoodsType.vue')
//物品信息
const InsLogisticsGoodsInfo = () => import('../views/unifiedControl/insLogisticsGoodsInfo/InsLogisticsGoodsInfo.vue')
//仓库管理
const InsLogisticsWarehouseInfo = () => import('../views/unifiedControl/insLogisticsWarehouseInfo/InsLogisticsWarehouseInfo.vue')
//供应商管理
const InsLogisticsSupplierInfo = () => import('../views/unifiedControl/insLogisticsSupplierInfo/InsLogisticsSupplierInfo.vue')
//入库管理
const InsLogisticsProcureInfo = () => import('../views/unifiedControl/insLogisticsProcureInfo/InsLogisticsProcureInfo.vue')
//出库管理
const InsLogisticsOutboundInfo = () => import('../views/unifiedControl/insLogisticsOutboundInfo/InsLogisticsOutboundInfo.vue')
//库存调整
const InsLogisticsInventoryAdjust = () => import('../views/unifiedControl/insLogisticsInventoryAdjust/InsLogisticsInventoryAdjust.vue')
//库存盘点
const InsLogisticsInventoryCheck = () => import('../views/unifiedControl/insLogisticsInventoryCheck/InsLogisticsInventoryCheck.vue')
//库存查询
const InsLogisticsInventoryInfo = () => import('../views/unifiedControl/insLogisticsInventoryInfo/InsLogisticsInventoryInfo.vue')
//物品调拨
const InsLogisticsTransferInfo = () => import('../views/unifiedControl/insLogisticsTransferInfo/InsLogisticsTransferInfo.vue')
//过期查询
const ExpiredInventoryInfo = () => import('../views/unifiedControl/insLogisticsInventoryInfo/InsLogisticsInventoryInfo.vue')
//物品订单
const InsLogisticsOrderInfo = () => import('../views/unifiedControl/insLogisticsOrderInfo/InsLogisticsOrderInfo.vue')
//物品下单
const InsLogisticsGoodsInfoOrder = () => import('../views/unifiedControl/insLogisticsGoodsInfo/InsLogisticsGoodsInfo.vue')
//物资入库
const InsLogisticsMaterialInto = () => import('../views/unifiedControl/insLogisticsMaterialInto/InsLogisticsMaterialInto.vue')
//物资出库
const InsLogisticsMaterialOut = () => import('../views/unifiedControl/insLogisticsMaterialOut/InsLogisticsMaterialOut.vue')
//物资报损
const InsLogisticsMaterialFrmloss = () => import('../views/unifiedControl/insLogisticsMaterialFrmloss/InsLogisticsMaterialFrmloss.vue')
//物资出库统计
const InsLogisticsMaterialOutCount = () => import('../views/unifiedControl/insLogisticsMaterialOut/InsLogisticsMaterialOut.vue')
//护理事故登记
const InsElderAccidentInfo = () => import('../views/unifiedControl/insElderAccidentInfo/InsElderAccidentInfo.vue')
//突发事故登记
const InsSuddenEventInfo = () => import('../views/unifiedControl/insSuddenEventInfo/InsSuddenEventInfo.vue')
//事件预案设置
const InsSuddenEventSetting = () => import('../views/unifiedControl/insSuddenEventSetting/InsSuddenEventSetting.vue')
//不合规信息登记
const InsSuddenErrorInfo = () => import('../views/unifiedControl/insSuddenErrorInfo/InsSuddenErrorInfo.vue')
//投诉记录
const InsSuddenComplaintRecord = () => import('../views/unifiedControl/insSuddenComplaintRecord/InsSuddenComplaintRecord.vue')
//水电管理
const InsSuWaterElectricRecord = () => import('../views/unifiedControl/insSuWaterElectricRecord/InsSuWaterElectricRecord.vue')
//报修管理
const InsSuddenRepairInfo = () => import('../views/unifiedControl/insSuddenRepairInfo/InsSuddenRepairInfo.vue')
//物业服务满意度
const InsAptSatisfactionRecord = () => import('../views/unifiedControl/insAptSatisfactionRecord/InsAptSatisfactionRecord.vue')
//活动类型管理
const InsActivityType = () => import('../views/unifiedControl/insActivityType/InsActivityType.vue')
//活动发布管理
const InsActivityInfo = () => import('../views/unifiedControl/insActivityInfo/InsActivityInfo.vue')
//活动报名记录
const InsActivityEntryInfo = () => import('../views/unifiedControl/insActivityEntryInfo/InsActivityEntryInfo.vue')
//活动档案室管理
const InsActivityRoomInfo = () => import('../views/unifiedControl/insActivityRoomInfo/InsActivityRoomInfo.vue')
//机构保险管理
const InsAffairsLiabilityInsurance = () => import('../views/unifiedControl/insAffairsLiabilityInsurance/InsAffairsLiabilityInsurance.vue')
//物资捐赠激励
const InsDonateRecord = () => import('../views/unifiedControl/insDonateRecord/InsDonateRecord.vue')
//捐赠数据汇总
const InsDonateInfo = () => import('../views/unifiedControl/insDonateInfo/InsDonateInfo.vue')
//评价管理记录
const InsInstitutionEvaluate = () => import('../views/unifiedControl/insInstitutionEvaluate/InsInstitutionEvaluate.vue')
//护工满意度评价
const InsStaffEvaluateRecord = () => import('../views/unifiedControl/insStaffEvaluateRecord/InsStaffEvaluateRecord.vue')
//设施设备记录
const GspInstitutionDeviceTransfer = () => import('../views/unifiedControl/gspInstitutionDeviceTransfer/GspInstitutionDeviceTransfer.vue')
//房屋建筑记录
const GspInstitutionBuildingTransfer = () => import('../views/unifiedControl/gspInstitutionBuildingTransfer/GspInstitutionBuildingTransfer.vue')
//巡检点设置
const InsSecurityInspectionPoint = () => import('../views/unifiedControl/insSecurityInspectionPoint/InsSecurityInspectionPoint.vue')
//巡检执行记录
const InsSecurityInspectionRecord = () => import('../views/unifiedControl/insSecurityInspectionRecord/InsSecurityInspectionRecord.vue')
//巡检路线设置
const InsSecurityInspectionRoute = () => import('../views/unifiedControl/insSecurityInspectionRoute/InsSecurityInspectionRoute.vue')


//-----------设备物联-----------
//床位监测图
const IotInsBaseBedInfo = () => import('../views/iot/insBaseBedInfo/InsBaseBedInfo.vue')
//床位监护
const BedInsBaseBedInfo = () => import('../views/iot/insBaseBedInfo/InsBaseBedInfo.vue')
//血压监护
const IotHealthBloodPressure = () => import('../views/iot/healthBloodPressure/HealthBloodPressure.vue')
//血糖监护
const IotHealthBloodSugar = () => import('../views/iot/healthBloodSugar/HealthBloodSugar.vue')
//无感知检测
const IotHealthPhysicalCheck = () => import('../views/iot/healthPhysicalCheck/HealthPhysicalCheck.vue')
//设备分类管理
const IotDeviceTypeManagement = () => import('../views/iot/iotDeviceType/IotDeviceType.vue')
//设备档案管理
const IotDeviceType = () => import('../views/iot/iotDeviceType/IotDeviceType.vue')
//设备日志管理
const IotDeviceDataManagement = () => import('../views/iot/iotDeviceDataLog/IotDeviceDataLog.vue')
//设备告警管理
const DeviceAlarmLog = () => import('../views/iot/iotDeviceAlarmLog/IotDeviceAlarmLog.vue')
//告警级别设置
const SmartAlarmLevelSet = () => import('../views/iot/smartAlarmLevelSet/SmartAlarmLevelSet.vue')
//告警提醒设置
const SmartAlarmRemindSet = () => import('../views/iot/smartAlarmRemindSet/SmartAlarmRemindSet.vue')
//老人设备发放
const SmartDeviceGrant = () => import('../views/iot/smartDeviceGrant/SmartDeviceGrant.vue')
//机构设备发放
const SmartDeviceGrantIot = () => import('../views/iot/smartDeviceGrant/SmartDeviceGrant.vue')
//设备告警记录
const IotDeviceAlarmLog = () => import('../views/iot/iotDeviceAlarmLog/IotDeviceAlarmLog.vue')
//设备操作日志
const IotDeviceDataLog = () => import('../views/iot/iotDeviceDataLog/IotDeviceDataLog.vue')
//健康监测视图
const HealthBaseInfoIot = () => import('../views/iot/healthBaseInfo/HealthBaseInfo.vue')
//SOS告警弹屏
const SmartAlarmRecord = () => import('../views/iot/smartAlarmRecord/SmartAlarmRecord.vue')
//床位告警弹屏
const BedSmartAlarmRecord = () => import('../views/iot/smartAlarmRecord/SmartAlarmRecord.vue')
//全局预警参数
const SmartCareParam = () => import('../views/iot/smartCareParam/SmartCareParam.vue')
//个人预警参数
const SmartCareParamPerson = () => import('../views/iot/smartCareParam/SmartCareParamPerson.vue')


//-----------数据看板-----------
//预约参观统计
const ReservationVisitStat = () => import('../views/dataBoard/reservationVisitStat/reservationVisitStat.vue')
//媒介渠道统计
const MediaChannelStat = () => import('../views/dataBoard/mediaChannelStat/mediaChannelStat.vue')
//咨询预定统计
const ConsultBookStat = () => import('../views/dataBoard/consultBookStat/consultBookStat.vue')
//老人年龄统计
const ElderAgeStat = () => import('../views/dataBoard/elderAgeStat/elderAgeStat.vue')
//老人类别统计
const ElderTypeStat = () => import('../views/dataBoard/elderTypeStat/elderTypeStat.vue')
//老人护理等级统计
const ElderNurseLevelStat = () => import('../views/dataBoard/elderNurseLevelStat/elderNurseLevelStat.vue')
//老人能力评估统计
const ElderAbilityEvaluateStat = () => import('../views/dataBoard/elderAbilityEvaluateStat/elderAbilityEvaluateStat.vue')
//老人流动月度统计
const ElderFlowMonthStat = () => import('../views/dataBoard/elderFlowMonthStat/elderFlowMonthStat.vue')
//老人饮食习惯统计
const ElderDietHabitStat = () => import('../views/dataBoard/elderDietHabitStat/elderDietHabitStat.vue')
//老人主要疾病统计
const ElderMainIllnessStat = () => import('../views/dataBoard/elderMainIllnessStat/elderMainIllnessStat.vue')
//护理事故统计
const NurseAccidentStat = () => import('../views/dataBoard/nurseAccidentStat/nurseAccidentStat.vue')
//突发事件统计
const EmergencyEventStat = () => import('../views/dataBoard/emergencyEventStat/emergencyEventStat.vue')
//后勤报修统计
const LogisticsRepairStat = () => import('../views/dataBoard/logisticsRepairStat/logisticsRepairStat.vue')
//物品订单统计
const GoodsOrderStat = () => import('../views/dataBoard/goodsOrderStat/goodsOrderStat.vue')
//物品消耗总汇
const GoodsConsumeTotal = () => import('../views/dataBoard/goodsConsumeTotal/goodsConsumeTotal.vue')
//物品出库统计
const GoodsOutStockStat = () => import('../views/dataBoard/goodsOutStockStat/goodsOutStockStat.vue')
//员工物品领用
const StaffGoodsReceive = () => import('../views/dataBoard/staffGoodsReceive/staffGoodsReceive.vue')
//餐饮订单统计
const CaterOrderStat = () => import('../views/dataBoard/caterOrderStat/caterOrderStat.vue')
//自选服务订单统计
const SelfServiceOrderStat = () => import('../views/dataBoard/selfServiceOrderStat/selfServiceOrderStat.vue')
//房间分析
const RoomAnalyse = () => import('../views/dataBoard/roomAnalyse/roomAnalyse.vue')
//床位分析
const BedAnalyse = () => import('../views/dataBoard/bedAnalyse/bedAnalyse.vue')
//培训类型统计
const TrainTypeStat = () => import('../views/dataBoard/trainTypeStat/trainTypeStat.vue')
//收费日报表
const ChargeDailyReport = () => import('../views/dataBoard/chargeDailyReport/chargeDailyReport.vue')
//结算日报汇总表
const SettleDailyTotalReport = () => import('../views/dataBoard/settleDailyTotalReport/settleDailyTotalReport.vue')
//月收入汇总表
const MonthIncomeTotalReport = () => import('../views/dataBoard/monthIncomeTotalReport/monthIncomeTotalReport.vue')
//月费用收入汇总表
const MonthCostIncomeTotalReport = () => import('../views/dataBoard/monthCostIncomeTotalReport/monthCostIncomeTotalReport.vue')
//人员概况统计
const StaffOverviewStat = () => import('../views/dataBoard/staffOverviewStat/staffOverviewStat.vue')
//护理员证书等级统计
const NurseCertLevelStat = () => import('../views/dataBoard/nurseCertLevelStat/nurseCertLevelStat.vue')
//年度收支汇总
const YearIncomeExpenseTotal = () => import('../views/dataBoard/yearIncomeExpenseTotal/yearIncomeExpenseTotal.vue')
//年度项目收入分析
const YearProjectIncomeAnalyse = () => import('../views/dataBoard/yearProjectIncomeAnalyse/yearProjectIncomeAnalyse.vue')
//欠费汇总统计
const ArrearsTotalStat = () => import('../views/dataBoard/arrearsTotalStat/arrearsTotalStat.vue')
//出入院统计
const InOutHospitalStat = () => import('../views/dataBoard/inOutHospitalStat/inOutHospitalStat.vue')
//老人流动情况月报
const ElderFlowMonthReport = () => import('../views/dataBoard/elderFlowMonthReport/elderFlowMonthReport.vue')
//机构月度分析
const InstitutionMonthAnalyse = () => import('../views/dataBoard/institutionMonthAnalyse/institutionMonthAnalyse.vue')
//老人欠费一览表
const ElderArrearsList = () => import('../views/dataBoard/elderArrearsList/elderArrearsList.vue')
//买菜统计
const BuyFoodStat = () => import('../views/dataBoard/buyFoodStat/buyFoodStat.vue')
//分菜统计
const DistributeFoodStat = () => import('../views/dataBoard/distributeFoodStat/distributeFoodStat.vue')


//-----------系统设置-----------
//流程指引设置
const InsBaseHelpCenter = () => import('../views/system/insBaseHelpCenter/InsBaseHelpCenter.vue')
//视频教程设置
const VedioInsBaseHelpCenter = () => import('../views/system/insBaseHelpCenter/InsBaseHelpCenter.vue')
//操作手册设置
const OperationInsBaseHelpCenter = () => import('../views/system/insBaseHelpCenter/InsBaseHelpCenter.vue')
//信息发布
const SystemInsTrainRelease = () => import('../views/system/insTrainRelease/InsTrainRelease.vue')
//新闻资讯
const InsOfficeNewsInfo = () => import('../views/system/insOfficeNewsInfo/InsOfficeNewsInfo.vue')
//行业政策
const InsOfficePolicyInfo = () => import('../views/system/insOfficePolicyInfo/InsOfficePolicyInfo.vue')
//通知公告
const BladeNotice = () => import('../views/system/bladeNotice/BladeNotice.vue')
//文件下载
const InsOfficeFileInfo = () => import('../views/system/insOfficeFileInfo/InsOfficeFileInfo.vue')
//养生知识
const InsOfficeKnowledgeInfo = () => import('../views/system/insOfficeKnowledgeInfo/InsOfficeKnowledgeInfo.vue')
//养老课堂
const InsOfficeOnlineClass = () => import('../views/system/insOfficeOnlineClass/InsOfficeOnlineClass.vue')

//短信发布
const JcSmsSend = () => import('../views/system/jcSmsSend/JcSmsSend.vue')
//短信参数
const BladeSms = () => import('../views/system/bladeSms/BladeSms.vue')
//短信模版
const JcSmsTemplet = () => import('../views/system/jcSmsTemplet/JcSmsTemplet.vue')
//---合同管理---
//合同模版
const InsBaseContractTemplate = () => import('../views/insBaseContractTemplate/InsBaseContractTemplate.vue')
//基础费用设置
  const CareFeeSet = () => import('../views/system/careFeeSet/CareFeeSet.vue')
  const InsBaseCostInfo = () => import('../views/system/insBaseCostInfo/insBaseCostInfo.vue')
//机构信息编辑
  const Organ = () => import('../views/system/organ/Organ.vue')
//机构参数设置
  const InsBaseBillingRulesSetting = () => import('../views/system/insBaseBillingRulesSetting/InsBaseBillingRulesSetting.vue')
//部门信息设置
const SystemOrgan = () => import('../views/system/organ/Organ.vue')
//岗位信息设置
  const OrganPost = () => import('../views/system/organPost/OrganPost.vue')
//员工信息设置
  const SystemInsStaffMemberCardInfo = () => import('../views/system/insStaffMemberCardInfo/InsStaffMemberCardInfo.vue')
//常用模板设置
  const JcUserFunction = () => import('../views/system/jcUserFunction/JcUserFunction.vue')

Vue.use(VueRouter);

const BladeDict = () => import('../views/bladeDict/BladeDict.vue');

const routes = [
  { path: "/", redirect: "/index" },
  { path: "/login", component: Login },
  { path: '/visualization/insScreen', component: () => import('@/views/visualization/insScreen/insScreen.vue'), meta: { keepAlive: true } },
  {
    path: "/index",
    component: Index,
    redirect: "/Welcome",
    children: [
      { path: "/index", component: Welcome },
      { path: "/employee", component: employeeManagement },
      { path: "/employee/details", component: employeeDetail },
      { path: "/organization", component: OrganizationManagement },
      { path: "/post", component: Post },
      { path: "/menu", component: Menu },
      { path: "/authority", component: Authority },
      { path: "/organizationType", component: OrganizationTypeMaintenance },
      { path: "/myAccountView", component: myAccountView },
      { path: "/roleMenu", component: RoleMenu },
      { path: "/systemConfig", component: SystemConfig },
      { path: "/systemConfig/details", component: SystemConfigDetails },
      { path: "/tableDesign", component: TableDesign },
      { path: '/coding', component: Table },
      { path: '/table/details', component: TableDetails },
      { path: '/tableDdl', component: TableDdl },
      { path: '/tableDdl/details', component: TableDdlDetails },
      { path: '/loginLog', component: LoginLog },
      { path: '/loginLog/details', component: LoginLogDetails },
      { path: '/fromDesigner', name: 'designer', component: FromDesigner },
      { path: '/dialog', name: 'dialogTest', component: DialogTest },
      { path: '/queryDialog', name: 'queryDialogTest', component: QueryDialogTest },
      { path: '/view', name: 'view', component: View },
      { path: '/table', name: 'table', component: DesignTable },
      { path: '/dashboard', name: 'table', component: Dashboard },
      { path: '/appointmentVisitStatistics', name: 'table', component: appointmentVisitStatistics },

      //导航
      { path: '/checkInNavi', name: 'table', component: CheckInNavi },



      { path: "/buildingss", component: Buildingss },
      {
        path: "/pielderlydetail",
        component: PielderlyDetail,
        redirect: "/pielderlydetail/base",
        children: [
          { path: "base", component: BaseInfo },
          { path: "health", component: HealthFile },
          { path: "nurse", component: NurseEvaluate },
          { path: "drug", component: DrugManage },
          { path: "cost", component: CostManage },
          { path: "infoLog", component: InfoLog },
          { path: "sign", component: SignData },
          { path: "check", component: CheckInfo },
          { path: "doctor", component: DoctorAdvice },
          { path: "record", component: MedicalRecord },
          { path: "out", component: OutRecord },
        ],
      },

      { path: '/picheckservice/bedall', component: () => import('@/views/pensioninstitution/picheckservice/bedall.vue'), meta: { keepAlive: true } },
      { path: '/instituionSystem/instituion/bedSearch', component: () => import('@/views/pensioninstitution/picheckservice/roomall/roomall.vue'), meta: { keepAlive: true } },
      { path: '/bladeDict', component: BladeDict },

    ],
  },

  //-----------运营中心-----------
  {
    path: "/operationsCenter",
    component: Index,
    redirect: "/operationsCenter/healthBaseInfo",
    children: [
      { path: '/insRegisterConsultInfo', component: InsRegisterConsultInfo },
      { path: '/insRegisterConsultBedInfo', component: InsRegisterConsultBedInfo },
      { path: '/insRegisterVisitInfo', component: InsRegisterVisitInfo },
      { path: '/insBaseBedMonitor', component: InsBaseBedMonitor },
      { path: '/insElderCheckInfoRegister', component: InsElderCheckInfoRegister },
      { path: '/insElderCheckInfoAudit', component: InsElderCheckInfoAudit },
      { path: '/insElderCheckInfoAssessment', component: InsElderCheckInfoAssessment },
      { path: '/insElderCheckInfoManager', component: InsElderCheckInfoManager },
      { path: '/healthBaseInfo', component: HealthBaseInfo },
      { path: '/insCostInfoSearch', component: InsCostInfoSearch },
      { path: '/insElderCheckInfoTry', component: InsElderCheckInfoTry },
      { path: '/insElderTrackRecord', component: InsElderTrackRecord },
      { path: '/healthInsuranceCard', component: HealthInsuranceCard },
      { path: '/insCanteenFoodInfo', component: InsCanteenFoodInfo },
      { path: '/insCanteenWeekMenu', component: InsCanteenWeekMenu },
      { path: '/insBaseContractTemplate', component: InsBaseContractTemplate },
      { path: '/canteenDeviceMaintain', component: CanteenDeviceMaintain },
      { path: '/canteenKitchenDisinfect', component: CanteenKitchenDisinfect },
      { path: '/canteenKitchenHygiene', component: CanteenKitchenHygiene },
      { path: '/canteenLeftoverDisposal', component: CanteenLeftoverDisposal },
      { path: "/dineInRecord", component: DineInRecord },
      { path: "/foodOrderingRetrun", component: FoodOrderingRetrun },
      { path: "/foodOrderingService", component: FoodOrderingService },
      { path: "/insCanteenPlanSetting", component: InsCanteenPlanSetting },
      { path: "/mealDeliveryDispatch", component: MealDeliveryDispatch },
      { path: "/mealDeliveryFinish", component: MealDeliveryFinish },
      { path: "/mealDeliveryTacking", component: MealDeliveryTacking },
      { path: '/assessmentResult', component: AssessmentResult },
      { path: '/insElderAssessmentWarning', component: InsElderAssessmentWarning },
      { path: '/abilityAssessment', component: AbilityAssessment },
      { path: '/addAbilityAssessment', component: AddAbilityAssessment },
      { path: '/specialAssessment', component: SpecialAssessment },
      { path: '/customAssessment', component: CustomAssessment },
      { path: '/abilityAssessmentRecord', component: AbilityAssessmentRecord },
      { path: '/specialAssessmentRecord', component: SpecialAssessmentRecord },
      { path: '/customAssessmentRecord', component: CustomAssessmentRecord },
      { path: '/insElderContractInfo', component: InsElderContractInfo },
      { path: '/insElderContractWarning', component: InsElderContractWarning },
      { path: '/assessmentTemplate', component: AssessmentTemplate },
      { path: '/assessmentElderBase', component: AssessmentElderBase },
      { path: '/insElderPhotoInfo', component: InsElderPhotoInfo },
      { path: '/insElderChangeBedRecord', component: InsElderChangeBedRecord },
      { path: '/insExpensesChangeFoodRecord', component: InsExpensesChangeFoodRecord },
      { path: '/insElderInsureInfo', component: InsElderInsureInfo },
      { path: '/elderCareNursingStandard', component: ElderCareNursingStandard },
      { path: '/insElderRetreatInfoApply', component: InsElderRetreatInfoApply },
      { path: '/insElderRetreatInfoRecord', component: InsElderRetreatInfoRecord },
      { path: '/insElderMoreContractInfoSign', component: InsElderMoreContractInfoSign },
      { path: '/elderBrthdayRemind', component: ElderBrthdayRemind },
      { path: '/communityMedicationRemind', component: CommunityMedicationRemind },
      { path: '/communityActiveCareRecord', component: CommunityActiveCareRecord },
      { path: '/insVegetableOrderInfo', component: InsVegetableOrderInfo },
      { path: '/insCanteenFoodCategory', component: InsCanteenFoodCategory },
      { path: '/insCanteenFoodTabooRel', component: InsCanteenFoodTabooRel },
      { path: '/insCanteenFoodMaterial', component: InsCanteenFoodMaterial },
      { path: '/insCanteenDailyRecipe', component: InsCanteenDailyRecipe },
      { path: '/elderNutritionDailyStat', component: ElderNutritionDailyStat },
      { path: '/elderNutritionWeeklyStat', component: ElderNutritionWeeklyStat },
      { path: '/foodCategoryDistStat', component: FoodCategoryDistStat },
      { path: '/insExpensesRetreatSure', component: InsExpensesRetreatSure },
      { path: 'checkInDepositManagement', component: CheckInDepositManagement},
      { path: 'elderAccountManage', component: ElderAccountManage },
      { path: 'monthlyFeeCalculate', component: MonthlyFeeCalculate },
      { path: 'prepayMonthlyFee', component: PrepayMonthlyFee },
      { path: 'leaveHospitalFeeCalculate', component: LeaveHospitalFeeCalculate },
      { path: 'checkInBillPayment', component: CheckInBillPayment },
      { path: 'dailyBillPayment', component: DailyBillPayment },
      { path: 'feeStandardAdjust', component: FeeStandardAdjust },
      { path: 'paymentBillDetail', component: PaymentBillDetail },
      { path: 'paymentRecordDetail', component: PaymentRecordDetail },
      { path: 'elderArrearsBill', component: ElderArrearsBill },
      { path: 'waterElectricMeterBill', component: WaterElectricMeterBill },
      { path: 'temporaryFeeRecord', component: TemporaryFeeRecord },
      { path: 'costFeeRegister', component: CostFeeRegister },
      { path: 'elderFeeStatistics', component: ElderFeeStatistics },
    ],
  },


  //-----------健康中心-----------
  {
    path: "/healthCenter",
    component: Index,
    redirect: "/healthCenter/healthBaseInfo",
    children: [
      { path: "healthBaseInfo", component: HealthBaseInfoCenter },
      { path: 'healthVisitRecords', component: HealthVisitRecords },
      { path: 'healthPhysicalCheck', component: HealthPhysicalCheck },
      { path: 'insHealthPhysicalReport', component: InsHealthPhysicalReport },
      { path: 'insElderHealthParam', component: InsElderHealthParam },
      { path: 'healthWarningLog', component: HealthWarningLog },
      { path: 'healthAiAnalysis', component: HealthAiAnalysis },
      { path: 'healthChronicDiseaseArchive', component: HealthChronicDiseaseArchive },
      { path: 'healthInterventionPlan', component: HealthInterventionPlan },
      { path: 'healthDiseaseFollow', component: HealthDiseaseFollow },
      { path: 'healthFollowUp', component: HealthFollowUp },
      { path: 'healthChronicDiseaseDict', component: HealthChronicDiseaseDict },
      { path: 'healthInterventionsTemple', component: HealthInterventionsTemple },
      { path: 'healthDiseaseEncyclopedia', component: HealthDiseaseEncyclopedia },
      { path: 'healthChronicDiseaseArchiveCount', component: healthChronicDiseaseArchiveCount },
      { path: 'insSecurityDangersCheck', component: InsSecurityDangersCheck },
      { path: 'healthBloodPressure', component: HealthBloodPressure },
      { path: 'healthBloodSugar', component: HealthBloodSugar },
      { path: 'healthBloodOxygen', component: HealthBloodOxygen },
      { path: 'healthEcgRecords', component: HealthEcgRecords },
      { path: 'healthTemperatureRecords', component: HealthTemperatureRecords },
      { path: 'healthSportRecords', component: HealthSportRecords },
      { path: 'healthBasicsRecords', component: HealthBasicsRecords },
      { path: 'healthUricacidRecords', component: HealthUricacidRecords },
      { path: 'healthUrinalysisRecords', component: HealthUrinalysisRecords },
      { path: 'healthBloodKetone', component: HealthBloodKetone },
      { path: 'healthArteriosclerosis', component: HealthArteriosclerosis },
      { path: 'healthBoneDensity', component: HealthBoneDensity },
      { path: 'healthCardiovascular', component: HealthCardiovascular },
      { path: 'healthEyesight', component: HealthEyesight },
      { path: 'healthLungBreathing', component: HealthLungBreathing },
      { path: 'healthLungFunction', component: HealthLungFunction },
      { path: 'healthHemoglobinRecords', component: HealthHemoglobinRecords },
      { path: 'insMedicalDoctorAdvice', component: InsMedicalDoctorAdvice },
      { path: 'insMedicalDoctorAdviceTemporary', component: insMedicalDoctorAdviceTemporary },
      { path: 'insMedicalConsultationRecord', component: InsMedicalConsultationRecord },
      { path: 'insMedicalDrugInfo', component: InsMedicalDrugInfo },
      { path: 'insMedicalDrugExecuteRecord', component: InsMedicalDrugExecuteRecord },
      { path: 'insMedicalSelfDrug', component: InsMedicalSelfDrug },
      { path: 'insMedicalDrugInventory', component: InsMedicalDrugInventory },

    ],
  },

  //-----------照护中心-----------
  {
    path: "/careCenter",
    component: Index,
    redirect: "/careCenter/insNursingItemInfo",
    children: [
      { path: 'insNursingItemInfo', component: InsNursingItemInfo },
      { path: 'careNursingPlanSetting', component: CareNursingPlanSetting },
      { path: 'CareNursingPlanAdjustment', component: CareNursingPlanAdjustment },
      { path: 'ReviewContract', component: ReviewContract },
      { path: 'insNursingElderStandard', component: InsNursingElderStandard },
      { path: 'insNursingPlanSetting', component: InsNursingPlanSetting },
      { path: 'InsNursingTaskMonitoring', component: InsNursingTaskMonitoring },
      { path: 'InsAbnormalNursingTask', component: InsAbnormalNursingTask },
      { path: 'insNursingRoomExecutionRecord', component: InsNursingRoomExecutionRecord },
      { path: 'insNursingExecutionRecord', component: InsNursingExecutionRecord },
      { path: 'InsSummaryNursingTasks', component: InsSummaryNursingTasks },
      { path: 'InsNursingTaskReport', component: InsNursingTaskReport },
      { path: 'InsNursingPerformanceStatistics', component: InsNursingPerformanceStatistics },
      { path: 'InsNursingTaskRecordStatistics', component: InsNursingTaskRecordStatistics },
      { path: 'insNursingGeneralRecord', component: InsNursingGeneralRecord },
      { path: 'insNursingTurnoverRecord', component: InsNursingTurnoverRecord },
      { path: 'insNursingTemporaryRecord', component: InsNursingTemporaryRecord },
      { path: 'insNursingServiceItem', component: InsNursingServiceItem },
      { path: 'insNursingServiceOrder', component: InsNursingServiceOrder },
      { path: 'InsNursingServiceReminder', component: InsNursingServiceReminder },
      { path: 'insNursingRehabItem', component: InsNursingRehabItem },
      { path: 'insNursingRehabSetting', component: InsNursingRehabSetting },
      { path: 'insNursingRehabExecutionRecord', component: InsNursingRehabExecutionRecord },
      { path: 'insNursingChangeGroupRecord', component: InsNursingChangeGroupRecord },
      { path: 'insNursingChangeNursingRecord', component: InsNursingChangeNursingRecord },
      { path: 'insNursingGroupInfo', component: InsNursingGroupInfo },
      { path: 'insNursingGroupMember', component: InsNursingGroupMember },
      { path: 'insNursingPlanRoom', component: InsNursingPlanRoom },
      { path: 'InsNursingRoomInspectionExecutionRecord', component: InsNursingRoomInspectionExecutionRecord },
      { path: 'InsNursingRoomInspectionDashboard', component: InsNursingRoomInspectionDashboard },
      { path: 'insExpensesPurchaseRecord', component: InsExpensesPurchaseRecord },
      { path: 'insMedicalCheckRoomRecord', component: InsMedicalCheckRoomRecord },

    ],
  },

  //-----------综合管控-----------
  {
    path: "/unifiedControl",
    component: Index,
    redirect: "/unifiedControl/insSchedulingClasses",
    children: [
      { path: 'insSchedulingClasses', component: InsSchedulingClasses },
      { path: 'insSchedulingTable', component: InsSchedulingTable },
      { path: 'insSchedulingTableSettings', component: InsSchedulingTableSettings },
      { path: 'InsNurseSchedulingSettings', component: InsNurseSchedulingSettings },
      { path: 'InsNurseSchedulingTable', component: InsNurseSchedulingTable },
      { path: 'InsSchedulingHandoverReview', component: InsSchedulingHandoverReview },
      { path: 'insSchedulingHandoverRecord', component: InsSchedulingHandoverRecord },
      { path: 'insTrainType', component: InsTrainType },
      { path: 'insTrainInfo', component: InsTrainInfo },
      { path: 'insTrainRelease', component: InsTrainRelease },
      { path: 'OcTrainKnowledge', component: OcTrainKnowledge },
      { path: 'OcTrainSkill', component: OcTrainSkill },
      { path: 'insStaffMemberCardInfo', component: InsStaffMemberCardInfo },
      { path: 'insStaffLeaveRecord', component: InsStaffLeaveRecord },
      { path: 'insStaffContractInfo', component: InsStaffContractInfo },
      { path: 'InsStaffBirthdayReminder', component: InsStaffBirthdayReminder },
      { path: 'insFaceStaffSignRecord', component: InsFaceStaffSignRecord },
      { path: 'insStaffDimissionRecord', component: InsStaffDimissionRecord },
      { path: 'insStaffSalaryRecord', component: InsStaffSalaryRecord },
      { path: 'insStaffEvaluationGroup', component: InsStaffEvaluationGroup },
      { path: 'insStaffEvaluationTasks', component: InsStaffEvaluationTasks },
      { path: 'InsStaffEvaluationExcute', component: InsStaffEvaluationExcute },
      { path: 'insStaffEvaluationRecord', component: InsStaffEvaluationRecord },
      { path: 'insStaffEvaluationTemplate', component: InsStaffEvaluationTemplate },
      { path: 'insLogisticsGoodsType', component: InsLogisticsGoodsType },
      { path: 'insLogisticsGoodsInfo', component: InsLogisticsGoodsInfo },
      { path: 'insLogisticsWarehouseInfo', component: InsLogisticsWarehouseInfo },
      { path: 'insLogisticsSupplierInfo', component: InsLogisticsSupplierInfo },
      { path: 'insLogisticsProcureInfo', component: InsLogisticsProcureInfo },
      { path: 'insLogisticsOutboundInfo', component: InsLogisticsOutboundInfo },
      { path: 'insLogisticsInventoryAdjust', component: InsLogisticsInventoryAdjust },
      { path: 'insLogisticsInventoryCheck', component: InsLogisticsInventoryCheck },
      { path: 'insLogisticsInventoryInfo', component: InsLogisticsInventoryInfo },
      { path: 'insLogisticsTransferInfo', component: InsLogisticsTransferInfo },
      { path: 'ExpiredInventoryInfo', component: ExpiredInventoryInfo },
      { path: 'insLogisticsOrderInfo', component: InsLogisticsOrderInfo },
      { path: 'InsLogisticsGoodsInfoOrder', component: InsLogisticsGoodsInfoOrder },
      { path: 'insLogisticsMaterialInto', component: InsLogisticsMaterialInto },
      { path: 'insLogisticsMaterialOut', component: InsLogisticsMaterialOut },
      { path: 'insLogisticsMaterialFrmloss', component: InsLogisticsMaterialFrmloss },
      { path: 'InsLogisticsMaterialOutCount', component: InsLogisticsMaterialOutCount },
      { path: 'insElderAccidentInfo', component: InsElderAccidentInfo },
      { path: 'insSuddenEventInfo', component: InsSuddenEventInfo },
      { path: 'insSuddenEventSetting', component: InsSuddenEventSetting },
      { path: 'insSuddenErrorInfo', component: InsSuddenErrorInfo },
      { path: 'insSuddenComplaintRecord', component: InsSuddenComplaintRecord },
      { path: 'insSuWaterElectricRecord', component: InsSuWaterElectricRecord },
      { path: 'insSuddenRepairInfo', component: InsSuddenRepairInfo },
      { path: 'insAptSatisfactionRecord', component: InsAptSatisfactionRecord },
      { path: 'insSecurityInspectionRoute', component: InsSecurityInspectionRoute },
      { path: 'insActivityType', component: InsActivityType },
      { path: 'insActivityInfo', component: InsActivityInfo },
      { path: 'insActivityEntryInfo', component: InsActivityEntryInfo },
      { path: 'insActivityRoomInfo', component: InsActivityRoomInfo },
      { path: 'insAffairsLiabilityInsurance', component: InsAffairsLiabilityInsurance },
      { path: 'insDonateRecord', component: InsDonateRecord },
      { path: 'insDonateInfo', component: InsDonateInfo },
      { path: 'insInstitutionEvaluate', component: InsInstitutionEvaluate },
      { path: 'insStaffEvaluateRecord', component: InsStaffEvaluateRecord },
      { path: 'gspInstitutionDeviceTransfer', component: GspInstitutionDeviceTransfer },
      { path: 'gspInstitutionBuildingTransfer', component: GspInstitutionBuildingTransfer },
      { path: 'insSecurityInspectionPoint', component: InsSecurityInspectionPoint },
      { path: 'insSecurityInspectionRecord', component: InsSecurityInspectionRecord },
    ],
  },

  //-----------设备物联-----------
  {
    path: "/iot",
    component: Index,
    redirect: "/iot/iotInsBaseBedInfo",
    children: [
      { path: 'iotInsBaseBedInfo', component: IotInsBaseBedInfo },
      { path: 'bedInsBaseBedInfo', component: BedInsBaseBedInfo },
      { path: 'iotHealthBloodPressure', component: IotHealthBloodPressure },
      { path: 'iotHealthBloodSugar', component: IotHealthBloodSugar },
      { path: 'iotHealthPhysicalCheck', component: IotHealthPhysicalCheck },
      { path: 'iotDeviceTypeManagement', component: IotDeviceTypeManagement },
      { path: 'iotDeviceType', component: IotDeviceType },
      { path: 'iotDeviceDataManagement', component: IotDeviceDataManagement },
      { path: 'deviceAlarmLog', component: DeviceAlarmLog },
      { path: 'smartAlarmLevelSet', component: SmartAlarmLevelSet },
      { path: 'smartAlarmRemindSet', component: SmartAlarmRemindSet },
      { path: 'smartDeviceGrant', component: SmartDeviceGrant },
      { path: 'smartDeviceGrantIot', component: SmartDeviceGrantIot },
      { path: 'iotDeviceAlarmLog', component: IotDeviceAlarmLog },
      { path: 'iotDeviceDataLog', component: IotDeviceDataLog },
      { path: 'healthBaseInfoIot', component: HealthBaseInfoIot },
      { path: 'smartAlarmRecord', component: SmartAlarmRecord },
      { path: 'bedSmartAlarmRecord', component: BedSmartAlarmRecord },
      { path: 'smartCareParam', component: SmartCareParam },
      { path: 'smartCareParamPerosn', component: SmartCareParamPerson },
    ],
  },

  //-----------数据看板-----------
  {
    path: "/dataBoard",
    component: Index,
    redirect: "/dataBoard/healthBaseInfo",
    children: [
      { path: "healthBaseInfo", component: HealthBaseInfoCenter },
      { path: 'reservationVisitStat', component: ReservationVisitStat },
      { path: 'mediaChannelStat', component: MediaChannelStat },
      { path: 'consultBookStat', component: ConsultBookStat },
      { path: 'elderAgeStat', component: ElderAgeStat },
      { path: 'elderTypeStat', component: ElderTypeStat },
      { path: 'elderNurseLevelStat', component: ElderNurseLevelStat },
      { path: 'elderAbilityEvaluateStat', component: ElderAbilityEvaluateStat },
      { path: 'elderFlowMonthStat', component: ElderFlowMonthStat },
      { path: 'elderDietHabitStat', component: ElderDietHabitStat },
      { path: 'elderMainIllnessStat', component: ElderMainIllnessStat },
      { path: 'nurseAccidentStat', component: NurseAccidentStat },
      { path: 'emergencyEventStat', component: EmergencyEventStat },
      { path: 'logisticsRepairStat', component: LogisticsRepairStat },
      { path: 'goodsOrderStat', component: GoodsOrderStat },
      { path: 'goodsConsumeTotal', component: GoodsConsumeTotal },
      { path: 'goodsOutStockStat', component: GoodsOutStockStat },
      { path: 'staffGoodsReceive', component: StaffGoodsReceive },
      { path: 'caterOrderStat', component: CaterOrderStat },
      { path: 'selfServiceOrderStat', component: SelfServiceOrderStat },
      { path: 'roomAnalyse', component: RoomAnalyse },
      { path: 'bedAnalyse', component: BedAnalyse },
      { path: 'trainTypeStat', component: TrainTypeStat },
      { path: 'chargeDailyReport', component: ChargeDailyReport },
      { path: 'settleDailyTotalReport', component: SettleDailyTotalReport },
      { path: 'monthIncomeTotalReport', component: MonthIncomeTotalReport },
      { path: 'monthCostIncomeTotalReport', component: MonthCostIncomeTotalReport },
      { path: 'staffOverviewStat', component: StaffOverviewStat },
      { path: 'nurseCertLevelStat', component: NurseCertLevelStat },
      { path: 'yearIncomeExpenseTotal', component: YearIncomeExpenseTotal },
      { path: 'yearProjectIncomeAnalyse', component: YearProjectIncomeAnalyse },
      { path: 'arrearsTotalStat', component: ArrearsTotalStat },
      { path: 'inOutHospitalStat', component: InOutHospitalStat },
      { path: 'elderFlowMonthReport', component: ElderFlowMonthReport },
      { path: 'institutionMonthAnalyse', component: InstitutionMonthAnalyse },
      { path: 'elderArrearsList', component: ElderArrearsList },
      { path: 'buyFoodStat', component: BuyFoodStat },
      { path: 'distributeFoodStat', component: DistributeFoodStat },
    ],
  },
  
  //-----------系统设置-----------
  {
    path: "/system",
    component: Index,
    redirect: "/system/insBaseHelpCenter",
    children: [
      { path: 'insBaseHelpCenter', component: InsBaseHelpCenter },
      { path: 'vedioInsBaseHelpCenter', component: VedioInsBaseHelpCenter },
      { path: 'operationInsBaseHelpCenter', component: OperationInsBaseHelpCenter },
      { path: 'systemInsTrainRelease', component: SystemInsTrainRelease },
      { path: 'jcSmsSend', component: JcSmsSend },
      { path: 'careFeeSet', component: CareFeeSet },
      { path: 'insBaseCostInfo', component: InsBaseCostInfo },
      { path: 'organ', component: Organ },
      { path: 'insBaseBillingRulesSetting', component: InsBaseBillingRulesSetting },
      { path: 'systemOrgan', component: OrganizationManagement },
      { path: 'organPost', component: OrganPost },
      { path: 'systemInsStaffMemberCardInfo', component: SystemInsStaffMemberCardInfo },
      { path: 'jcUserFunction', component: JcUserFunction },
      { path: 'bladeSms', component: BladeSms },
      { path: 'jcSmsTemplet', component: JcSmsTemplet },
      { path: 'bladeNotice', component: BladeNotice },
      { path: 'insOfficeFileInfo', component: InsOfficeFileInfo },
      { path: 'insOfficeKnowledgeInfo', component: InsOfficeKnowledgeInfo },
      { path: 'insOfficeNewsInfo', component: InsOfficeNewsInfo },
      { path: 'insOfficeOnlineClass', component: InsOfficeOnlineClass },
      { path: 'insOfficePolicyInfo', component: InsOfficePolicyInfo },
    ],
  },

];

const router = new VueRouter({
  routes
});

// 挂载路由导航守卫,to表示将要访问的路径，from表示从哪里来，next是下一个要做的操作 next('/login')强制跳转login
router.beforeEach((to, from, next) => {
  if (to.path === "/login") {
    next();
  } else {
    let token = ""; //token保存在localstorage中

    let item = localStorage.getItem("token");
    // 先将拿到的试着进行json转为对象的形式
    try {
      item = JSON.parse(item);
    } catch (error) {
      // eslint-disable-next-line no-self-assign
      item = item;
    }
    if (item && item.startTime) {
      let date = new Date().getTime();
      // 如果大于就是过期了，如果小于或等于就还没过期
      let timel = date - item.startTime;
      console.log("timelength:" + timel + ",expires:" + item.expires);
      if (timel < item.expires) {
        token = item.value;
      }
    }
    if (token === null || token === "") {
      next("/login");
    } else {
      next();
    }
  }
});

export default router;
