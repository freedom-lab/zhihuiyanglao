package cn.pluss.platform.controller;


import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.base.auth.userInfo.UserInfoService;
import cn.pluss.platform.mapper.base.auth.RoleUserInfoMapper;
import cn.pluss.platform.model.auth.RoleUserInfo;
import cn.pluss.platform.model.auth.UserInfo;
import cn.pluss.platform.model.dto.HealthDto;
import cn.pluss.platform.model.entity.*;
import cn.pluss.platform.service.assessmentAppoint.AssessmentAppointService;
import cn.pluss.platform.service.elderBaseInfo.ElderBaseInfoService;
import cn.pluss.platform.service.healthArteriosclerosis.HealthArteriosclerosisService;
import cn.pluss.platform.service.healthBloodFat.HealthBloodFatService;
import cn.pluss.platform.service.healthBloodKetone.HealthBloodKetoneService;
import cn.pluss.platform.service.healthBloodOxygen.HealthBloodOxygenService;
import cn.pluss.platform.service.healthBloodPressure.HealthBloodPressureService;
import cn.pluss.platform.service.healthBloodSugar.HealthBloodSugarService;
import cn.pluss.platform.service.healthBoneDensity.HealthBoneDensityService;
import cn.pluss.platform.service.healthCardiovascular.HealthCardiovascularService;
import cn.pluss.platform.service.healthEcgRecords.HealthEcgRecordsService;
import cn.pluss.platform.service.healthEyesight.HealthEyesightService;
import cn.pluss.platform.service.healthHemoglobinRecords.HealthHemoglobinRecordsService;
import cn.pluss.platform.service.healthLungBreathing.HealthLungBreathingService;
import cn.pluss.platform.service.healthLungFunction.HealthLungFunctionService;
import cn.pluss.platform.service.healthPhysicalCheck.HealthPhysicalCheckService;
import cn.pluss.platform.service.healthSportRecords.HealthSportRecordsService;
import cn.pluss.platform.service.healthTemperatureRecords.HealthTemperatureRecordsService;
import cn.pluss.platform.service.healthTongueDiagnosisReport.HealthTongueDiagnosisReportService;
import cn.pluss.platform.service.healthUricacidRecords.HealthUricacidRecordsService;
import cn.pluss.platform.service.healthUrinalysisRecords.HealthUrinalysisRecordsService;
import cn.pluss.platform.service.insBaseBedInfo.InsBaseBedInfoService;
import cn.pluss.platform.service.insElderCheckInfo.InsElderCheckInfoService;
import cn.pluss.platform.service.insElderRetreatInfo.InsElderRetreatInfoService;
import cn.pluss.platform.service.insExpensesBillRecord.InsExpensesBillRecordService;
import cn.pluss.platform.service.insNursingExecutionRecord.InsNursingExecutionRecordService;
import cn.pluss.platform.service.insNursingGroupMember.InsNursingGroupMemberService;
import cn.pluss.platform.service.insNursingServiceOrder.InsNursingServiceOrderService;
import cn.pluss.platform.service.marketOrderInfo.MarketOrderInfoService;
import cn.pluss.platform.service.assessmentTemplate.AssessmentTemplateService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dashboard")
@Api(value = "Dashboard控制类",tags={"Dashboard接口"})
public class DashboardController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private ElderBaseInfoService elderBaseInfoService;
    @Resource
    private InsBaseBedInfoService insBaseBedInfoService;
    @Resource
    private UserInfoService userInfoService;
    @Resource
    private HealthBloodSugarService healthBloodSugarService;
    @Resource
    private HealthBloodPressureService healthBloodPressureService;
    @Resource
    private HealthBloodOxygenService healthBloodOxygenService;
    @Resource
    private HealthArteriosclerosisService healthArteriosclerosisService;
    @Resource
    private HealthBloodFatService healthBloodFatService;
    @Resource
    private HealthBloodKetoneService healthBloodKetoneService;
    @Resource
    private HealthBoneDensityService healthBoneDensityService;
    @Resource
    private HealthCardiovascularService healthCardiovascularService;
    @Resource
    private HealthEcgRecordsService healthEcgRecordsService;
    @Resource
    private HealthEyesightService healthEyesightService;
    @Resource
    private HealthHemoglobinRecordsService healthHemoglobinRecordsService;
    @Resource
    private HealthLungBreathingService healthLungBreathingService;
    @Resource
    private HealthLungFunctionService healthLungFunctionService;
    @Resource
    private HealthPhysicalCheckService healthPhysicalCheckService;
    @Resource
    private HealthSportRecordsService healthSportRecordsService;
    @Resource
    private HealthTemperatureRecordsService healthTemperatureRecordsService;
    @Resource
    private HealthTongueDiagnosisReportService healthTongueDiagnosisReportService;
    @Resource
    private HealthUricacidRecordsService healthUricacidRecordsService;
    @Resource
    private HealthUrinalysisRecordsService healthUrinalysisRecordsService;
    @Resource
    private InsElderCheckInfoService insElderCheckInfoService;
    @Resource
    private InsExpensesBillRecordService insExpensesBillRecordService;
    @Resource
    private MarketOrderInfoService marketOrderInfoService;
    @Resource
    private InsElderRetreatInfoService insElderRetreatInfoService;
    @Resource
    private InsNursingExecutionRecordService insNursingExecutionRecordService;
    @Resource
    private RoleUserInfoMapper roleUserInfoMapper;
    @Resource
    private InsNursingServiceOrderService insNursingServiceOrderService;
    @Resource
    private AssessmentAppointService assessmentAppointService;
    @Resource
    private AssessmentTemplateService assessmentTemplateService;
    @Resource
    private InsNursingGroupMemberService insNursingGroupMemberService;

    @PostMapping("/getElderlyAgeGenderStatistics")
    @ApiOperation(value = "获取老人年龄性别统计", notes = "获取老人年龄性别统计", httpMethod = "POST")
    public Result getElderlyAgeGenderStatistics() {
        return ResultGenerator.genSuccessResult(elderBaseInfoService.getElderlyAgeGenderStatistics());
    }

    @PostMapping("/getCompetencyAssessmentStatistics")
    @ApiOperation(value = "获取老人能力评估统计", notes = "获取老人能力评估统计", httpMethod = "POST")
    public Result getCompetencyAssessmentStatistics() {
        return ResultGenerator.genSuccessResult(elderBaseInfoService.getCompetencyAssessmentStatistics());
    }


    @PostMapping("/getElderlyCategoryStatistics")
    @ApiOperation(value = "获取老人类别统计", notes = "获取老人类别统计", httpMethod = "POST")
    public Result getElderlyCategoryStatistics() {
        return ResultGenerator.genSuccessResult(elderBaseInfoService.getElderlyCategoryStatistics());
    }

    @PostMapping("/getElderlyCareLevelStatistics")
    @ApiOperation(value = "获取老人护理等级统计", notes = "获取老人护理等级统计", httpMethod = "POST")
    public Result getElderlyCareLevelStatistics() {
        return ResultGenerator.genSuccessResult(elderBaseInfoService.getElderlyCareLevelStatistics());
    }

    @PostMapping("/getBedInfoStatistics")
    @ApiOperation(value = "获取床位信息统计", notes = "获取床位信息统计", httpMethod = "POST")
    public Result getBedInfo() {
        return ResultGenerator.genSuccessResult(insBaseBedInfoService.getBedInfoStatistics());
    }

    @PostMapping("/getEmployeeStatistics")
    @ApiOperation(value = "获取员工统计", notes = "获取员工统计", httpMethod = "POST")
    public Result getEmployeeStatistics() {
        return ResultGenerator.genSuccessResult(userInfoService.getEmployeeStatistics());
    }

    @PostMapping("/healthCheck")
    @ApiOperation(value = "健康检测", notes = "健康检测", httpMethod = "POST")
    public Result healthCheck(@RequestBody HealthDto healthDto) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate;
        Date endDate;
        try {
            startDate = sdf.parse(healthDto.getStratTime());
            endDate = sdf.parse(healthDto.getEndTime());
        } catch (ParseException e) {
            return ResultGenerator.genFailResult("时间格式错误，请使用 yyyy-MM-dd HH:mm:ss");
        }

        String timeType = healthDto.getTimeType();

        // 初始化时间标签
        List<String> allLabels = buildTimeLabels(timeType, startDate, endDate);
        Map<String, int[]> statsMap = new LinkedHashMap<>();
        // int[0]=血糖, int[1]=血压, int[2]=血氧, int[3]=其他
        for (String label : allLabels) {
            statsMap.put(label, new int[4]);
        }

        Calendar cal = Calendar.getInstance();

        // --- 血糖 ---
        List<HealthBloodSugar> sugarList = healthBloodSugarService.list(
                new LambdaQueryWrapper<HealthBloodSugar>()
                        .ge(HealthBloodSugar::getGaugeTime, startDate)
                        .le(HealthBloodSugar::getGaugeTime, endDate));
        for (HealthBloodSugar item : sugarList) {
            String label = getTimeLabel(item.getGaugeTime(), timeType, cal);
            statsMap.computeIfAbsent(label, k -> new int[4])[0]++;
        }

        // --- 血压 ---
        List<HealthBloodPressure> pressureList = healthBloodPressureService.list(
                new LambdaQueryWrapper<HealthBloodPressure>()
                        .ge(HealthBloodPressure::getGaugeTime, startDate)
                        .le(HealthBloodPressure::getGaugeTime, endDate));
        for (HealthBloodPressure item : pressureList) {
            String label = getTimeLabel(item.getGaugeTime(), timeType, cal);
            statsMap.computeIfAbsent(label, k -> new int[4])[1]++;
        }

        // --- 血氧 ---
        List<HealthBloodOxygen> oxygenList = healthBloodOxygenService.list(
                new LambdaQueryWrapper<HealthBloodOxygen>()
                        .ge(HealthBloodOxygen::getGaugeTime, startDate)
                        .le(HealthBloodOxygen::getGaugeTime, endDate));
        for (HealthBloodOxygen item : oxygenList) {
            String label = getTimeLabel(item.getGaugeTime(), timeType, cal);
            statsMap.computeIfAbsent(label, k -> new int[4])[2]++;
        }

        // --- 其他检测 ---
        accumulateOther(healthArteriosclerosisService.list(
                new LambdaQueryWrapper<HealthArteriosclerosis>()
                        .ge(HealthArteriosclerosis::getGaugeTime, startDate)
                        .le(HealthArteriosclerosis::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthBloodFatService.list(
                new LambdaQueryWrapper<HealthBloodFat>()
                        .ge(HealthBloodFat::getGaugeTime, startDate)
                        .le(HealthBloodFat::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthBloodKetoneService.list(
                new LambdaQueryWrapper<HealthBloodKetone>()
                        .ge(HealthBloodKetone::getGaugeTime, startDate)
                        .le(HealthBloodKetone::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthBoneDensityService.list(
                new LambdaQueryWrapper<HealthBoneDensity>()
                        .ge(HealthBoneDensity::getGaugeTime, startDate)
                        .le(HealthBoneDensity::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthCardiovascularService.list(
                new LambdaQueryWrapper<HealthCardiovascular>()
                        .ge(HealthCardiovascular::getGaugeTime, startDate)
                        .le(HealthCardiovascular::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthEcgRecordsService.list(
                new LambdaQueryWrapper<HealthEcgRecords>()
                        .ge(HealthEcgRecords::getGaugeTime, startDate)
                        .le(HealthEcgRecords::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthEyesightService.list(
                new LambdaQueryWrapper<HealthEyesight>()
                        .ge(HealthEyesight::getGaugeTime, startDate)
                        .le(HealthEyesight::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthHemoglobinRecordsService.list(
                new LambdaQueryWrapper<HealthHemoglobinRecords>()
                        .ge(HealthHemoglobinRecords::getGaugeTime, startDate)
                        .le(HealthHemoglobinRecords::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthLungBreathingService.list(
                new LambdaQueryWrapper<HealthLungBreathing>()
                        .ge(HealthLungBreathing::getGaugeTime, startDate)
                        .le(HealthLungBreathing::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthLungFunctionService.list(
                new LambdaQueryWrapper<HealthLungFunction>()
                        .ge(HealthLungFunction::getGaugeTime, startDate)
                        .le(HealthLungFunction::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthPhysicalCheckService.list(
                new LambdaQueryWrapper<HealthPhysicalCheck>()
                        .ge(HealthPhysicalCheck::getCreateTime, startDate)
                        .le(HealthPhysicalCheck::getCreateTime, endDate)),
                timeType, cal, statsMap, "getCreateTime");

        accumulateOther(healthSportRecordsService.list(
                new LambdaQueryWrapper<HealthSportRecords>()
                        .ge(HealthSportRecords::getGaugeTime, startDate)
                        .le(HealthSportRecords::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthTemperatureRecordsService.list(
                new LambdaQueryWrapper<HealthTemperatureRecords>()
                        .ge(HealthTemperatureRecords::getGaugeTime, startDate)
                        .le(HealthTemperatureRecords::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthTongueDiagnosisReportService.list(
                new LambdaQueryWrapper<HealthTongueDiagnosisReport>()
                        .ge(HealthTongueDiagnosisReport::getTime, startDate)
                        .le(HealthTongueDiagnosisReport::getTime, endDate)),
                timeType, cal, statsMap, "getTime");

        accumulateOther(healthUricacidRecordsService.list(
                new LambdaQueryWrapper<HealthUricacidRecords>()
                        .ge(HealthUricacidRecords::getGaugeTime, startDate)
                        .le(HealthUricacidRecords::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        accumulateOther(healthUrinalysisRecordsService.list(
                new LambdaQueryWrapper<HealthUrinalysisRecords>()
                        .ge(HealthUrinalysisRecords::getGaugeTime, startDate)
                        .le(HealthUrinalysisRecords::getGaugeTime, endDate)),
                timeType, cal, statsMap);

        // 组装返回结果
        List<Map<String, Object>> result = new ArrayList<>();
        for (Map.Entry<String, int[]> entry : statsMap.entrySet()) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("time", entry.getKey());
            item.put("bloodSugar", entry.getValue()[0]);
            item.put("bloodPressure", entry.getValue()[1]);
            item.put("bloodOxygen", entry.getValue()[2]);
            item.put("other", entry.getValue()[3]);
            result.add(item);
        }

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getRealTimeData")
    @ApiOperation(value = "获取实时数据", notes = "获取实时数据", httpMethod = "POST")
    public Result getRealTimeData() {
        return ResultGenerator.genSuccessResult(insElderCheckInfoService.getRealTimeData());
    }

    @PostMapping("/getTodayAndMonthData")
    @ApiOperation(value = "获取今日/本月数据", notes = "获取今日数据", httpMethod = "POST")
    public Result getTodayAndMonthData(@RequestBody HealthDto healthDto) {
        return ResultGenerator.genSuccessResult(insElderCheckInfoService.getTodayAndMonthData(healthDto));
    }



    @PostMapping("/getThisMonthRevenue")
    @ApiOperation(value = "本月营收统计", notes = "本月营收统计", httpMethod = "POST")
    public Result getThisMonthRevenue(@RequestBody HealthDto healthDto) {
        return ResultGenerator.genSuccessResult(insExpensesBillRecordService.getThisMonthRevenue(healthDto));
    }

    @PostMapping("/getThisMonthClassRevenue")
    @ApiOperation(value = "本月营收分类统计", notes = "本月营收分类统计", httpMethod = "POST")
    public Result getThisMonthClassRevenue(@RequestBody HealthDto healthDto) {
        return ResultGenerator.genSuccessResult(insExpensesBillRecordService.getThisMonthClassRevenue(healthDto));
    }

    @PostMapping("/valueAddedRevenue")
    @ApiOperation(value = "增值营收统计", notes = "增值营收统计", httpMethod = "POST")
    public Result valueAddedRevenue(@RequestBody HealthDto healthDto) {
        return ResultGenerator.genSuccessResult(marketOrderInfoService.valueAddedRevenue(healthDto));
    }

    @PostMapping("/getElderInAndOutStats")
    @ApiOperation(value = "获取老人出入院统计", notes = "获取老人出入院统计", httpMethod = "POST")
    public Result getElderInAndOutStats(@RequestBody HealthDto healthDto) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate;
        Date endDate;
        try {
            startDate = sdf.parse(healthDto.getStratTime());
            endDate = sdf.parse(healthDto.getEndTime());
        } catch (ParseException e) {
            return ResultGenerator.genFailResult("时间格式错误，请使用 yyyy-MM-dd HH:mm:ss");
        }

        String timeType = healthDto.getTimeType();

        // 查询时间段内的入院记录
        List<InsElderCheckInfo> checkList = insElderCheckInfoService.list(
                new LambdaQueryWrapper<InsElderCheckInfo>()
                        .ge(InsElderCheckInfo::getCheckDate, startDate)
                        .le(InsElderCheckInfo::getCheckDate, endDate)
                        .eq(InsElderCheckInfo::getCheckState, 3));

        // 查询时间段内的出院记录
        List<InsElderRetreatInfo> retreatList = insElderRetreatInfoService.list(
                new LambdaQueryWrapper<InsElderRetreatInfo>()
                        .ge(InsElderRetreatInfo::getRetreatTime, startDate)
                        .le(InsElderRetreatInfo::getRetreatTime, endDate)
                        .eq(InsElderRetreatInfo::getAuditState, 2));

        // 初始化时间标签 int[0]=入院, int[1]=出院
        List<String> allLabels = buildTimeLabels(timeType, startDate, endDate);
        Map<String, int[]> statsMap = new LinkedHashMap<>();
        for (String label : allLabels) {
            statsMap.put(label, new int[2]);
        }

        Calendar cal = Calendar.getInstance();

        // 入院统计
        for (InsElderCheckInfo item : checkList) {
            String label = getTimeLabel(item.getCheckDate(), timeType, cal);
            statsMap.computeIfAbsent(label, k -> new int[2])[0]++;
        }

        // 出院统计
        for (InsElderRetreatInfo item : retreatList) {
            String label = getTimeLabel(item.getRetreatTime(), timeType, cal);
            statsMap.computeIfAbsent(label, k -> new int[2])[1]++;
        }

        // 组装返回结果
        List<Map<String, Object>> result = new ArrayList<>();
        for (Map.Entry<String, int[]> entry : statsMap.entrySet()) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("time", entry.getKey());
            item.put("checkIn", entry.getValue()[0]);
            item.put("checkOut", entry.getValue()[1]);
            result.add(item);
        }

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getServiceSupervisionStats")
    @ApiOperation(value = "今日服务监管统计", notes = "今日服务监管统计", httpMethod = "POST")
    public Result getServiceSupervisionStats(@RequestBody HealthDto healthDto) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate;
        Date endDate;
        try {
            startDate = sdf.parse(healthDto.getStratTime());
            endDate = sdf.parse(healthDto.getEndTime());
        } catch (ParseException e) {
            return ResultGenerator.genFailResult("时间格式错误，请使用 yyyy-MM-dd HH:mm:ss");
        }

        // 总数
        long total = insNursingExecutionRecordService.count(
                new LambdaQueryWrapper<InsNursingExecutionRecord>()
                        .ge(InsNursingExecutionRecord::getCreateTime, startDate)
                        .le(InsNursingExecutionRecord::getCreateTime, endDate)
                        .ne(InsNursingExecutionRecord::getNursingState, -1));

        // 已完成数
        long completed = insNursingExecutionRecordService.count(
                new LambdaQueryWrapper<InsNursingExecutionRecord>()
                        .ge(InsNursingExecutionRecord::getCreateTime, startDate)
                        .le(InsNursingExecutionRecord::getCreateTime, endDate)
                        .eq(InsNursingExecutionRecord::getNursingState, 3));

        // 未完成数
        long incomplete = insNursingExecutionRecordService.count(
                new LambdaQueryWrapper<InsNursingExecutionRecord>()
                        .ge(InsNursingExecutionRecord::getCreateTime, startDate)
                        .le(InsNursingExecutionRecord::getCreateTime, endDate)
                        .in(InsNursingExecutionRecord::getNursingState, 1, 2));

        // 完成率
        double completionRate = total > 0 ? Math.round(completed * 1000.0 / total) / 10.0 : 0.0;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("total", total);
        result.put("completed", completed);
        result.put("incomplete", incomplete);
        result.put("completionRate", completionRate);

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getNursingStaffRanking")
    @ApiOperation(value = "护理人员排行榜", notes = "护理人员排行榜", httpMethod = "POST")
    public Result getNursingStaffRanking(@RequestBody HealthDto healthDto) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate;
        Date endDate;
        try {
            startDate = sdf.parse(healthDto.getStratTime());
            endDate = sdf.parse(healthDto.getEndTime());
        } catch (ParseException e) {
            return ResultGenerator.genFailResult("时间格式错误，请使用 yyyy-MM-dd HH:mm:ss");
        }

        String seq = healthDto.getSeq() != null ? healthDto.getSeq().toString() : "1";

        // 查询时间范围内且 nursing_state != -1 的所有记录
        List<InsNursingExecutionRecord> records = insNursingExecutionRecordService.list(
                new LambdaQueryWrapper<InsNursingExecutionRecord>()
                        .ge(InsNursingExecutionRecord::getCreateTime, startDate)
                        .le(InsNursingExecutionRecord::getCreateTime, endDate)
                        .ne(InsNursingExecutionRecord::getNursingState, -1));

        // 按 nursingStaffId 分组
        Map<Long, List<InsNursingExecutionRecord>> grouped = records.stream()
                .filter(r -> r.getNursingStaffId() != null)
                .collect(Collectors.groupingBy(InsNursingExecutionRecord::getNursingStaffId));

        List<Map<String, Object>> rankingList = new ArrayList<>();
        for (Map.Entry<Long, List<InsNursingExecutionRecord>> entry : grouped.entrySet()) {
            List<InsNursingExecutionRecord> list = entry.getValue();
            int total = list.size();
            int completed = (int) list.stream().filter(r -> Integer.valueOf(3).equals(r.getNursingState())).count();
            double completionRate = total > 0 ? Math.round(completed * 1000.0 / total) / 10.0 : 0.0;

            Map<String, Object> item = new LinkedHashMap<>();
            item.put("nursingStaffId", entry.getKey());
            item.put("nursingStaffName", list.get(0).getNursingStaffName());
            item.put("total", total);
            item.put("completed", completed);
            item.put("completionRate", completionRate);
            rankingList.add(item);
        }

        // 按完成率排序 seq=1 降序 seq=2 升序
        if ("2".equals(seq)) {
            rankingList.sort(Comparator.comparingDouble(m -> (double) m.get("completionRate")));
        } else {
            rankingList.sort((a, b) -> Double.compare((double) b.get("completionRate"), (double) a.get("completionRate")));
        }

        return ResultGenerator.genSuccessResult(rankingList);
    }

    @PostMapping("/getServiceRatio")
    @ApiOperation(value = "服务配比统计", notes = "服务配比统计", httpMethod = "POST")
    public Result getServiceRatio() {
        // 在住老人数
        long elderCount = insElderCheckInfoService.count(
                new LambdaQueryWrapper<InsElderCheckInfo>()
                        .eq(InsElderCheckInfo::getCheckState, 3));

        // 护理工人数
        RoleUserInfo query = new RoleUserInfo();
        query.setRoleCode("2");
        List<RoleUserInfo> nurseList = roleUserInfoMapper.queryRoleUserInfoList(query);
        long nurseCount = nurseList != null ? nurseList.size() : 0;

        double ratio = nurseCount > 0 ? Math.round(elderCount * 10.0 / nurseCount) / 10.0 : (double) elderCount;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("elderCount", elderCount);
        result.put("nurseCount", nurseCount);
        result.put("ratio", elderCount + ":" + nurseCount);
        result.put("ratioValue", ratio);

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getNursingServiceOrderList")
    @ApiOperation(value = "自选服务实时工单表", notes = "自选服务实时工单表", httpMethod = "POST")
    public Result getNursingServiceOrderList() {
        // 查询所有的工单
        List<InsNursingServiceOrder> orderList = insNursingServiceOrderService.list(
                new LambdaQueryWrapper<InsNursingServiceOrder>()
                        .ne(InsNursingServiceOrder::getServiceState, -1));

        if (orderList.isEmpty()) {
            return ResultGenerator.genSuccessResult(new ArrayList<>());
        }

        // 批量查床位信息
        Set<Long> elderIds = new HashSet<>();
        for (InsNursingServiceOrder order : orderList) {
            if (order.getElderId() != null) {
                elderIds.add(order.getElderId());
            }
        }

        Map<Long, String> bedInfoMap = new HashMap<>();
        if (!elderIds.isEmpty()) {
            List<InsBaseBedInfo> bedList = insBaseBedInfoService.list(
                    new LambdaQueryWrapper<InsBaseBedInfo>()
                            .in(InsBaseBedInfo::getElderId, elderIds));
            for (InsBaseBedInfo bed : bedList) {
                String info = safeStr(bed.getBuildingName()) + "-"
                        + safeStr(bed.getFloorName()) + "-"
                        + safeStr(bed.getRoomName()) + "-"
                        + safeStr(bed.getBedName());
                bedInfoMap.put(Long.valueOf(bed.getElderId()), info);
            }
        }

        //返回数据
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Map<String, Object>> result = new ArrayList<>();
        for (InsNursingServiceOrder order : orderList) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("elderName", order.getElderName());
            item.put("bedInfo", order.getElderId() != null ? bedInfoMap.getOrDefault(order.getElderId(), "-") : "-");
            item.put("itemName", order.getItemName());

            String stateText;
            if (Integer.valueOf(1).equals(order.getServiceState())) {
                stateText = "未开始";
            } else if (Integer.valueOf(2).equals(order.getServiceState())) {
                stateText = "服务中";
            } else if (Integer.valueOf(3).equals(order.getServiceState())) {
                stateText = "已完成";
            } else {
                stateText = String.valueOf(order.getServiceState());
            }
            item.put("serviceState", stateText);

            item.put("staffName", order.getStaffName());
            item.put("serviceDuration", order.getServiceDuration() != null ? order.getServiceDuration() : "-");
            item.put("serviceStartTime", order.getServiceStartTime() != null ? sdf.format(order.getServiceStartTime()) : "-");

            result.add(item);
        }

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getNursingServiceOrderSummary")
    @ApiOperation(value = "自选服务概括统计", notes = "自选服务概括统计", httpMethod = "POST")
    public Result getNursingServiceOrderSummary(@RequestBody(required = false) HealthDto healthDto) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = null;
        Date endDate = null;
        if (healthDto != null && healthDto.getStratTime() != null && healthDto.getEndTime() != null) {
            try {
                startDate = sdf.parse(healthDto.getStratTime());
                endDate = sdf.parse(healthDto.getEndTime());
            } catch (ParseException e) {
                return ResultGenerator.genFailResult("时间格式错误，请使用 yyyy-MM-dd HH:mm:ss");
            }
        }

        LambdaQueryWrapper<InsNursingServiceOrder> countWrapper = new LambdaQueryWrapper<InsNursingServiceOrder>()
                .ne(InsNursingServiceOrder::getServiceState, -1);
        LambdaQueryWrapper<InsNursingServiceOrder> amountWrapper = new LambdaQueryWrapper<InsNursingServiceOrder>()
                .select(InsNursingServiceOrder::getTotalAmount)
                .eq(InsNursingServiceOrder::getServiceState, 3);
        if (startDate != null && endDate != null) {
            countWrapper.ge(InsNursingServiceOrder::getCreateTime, startDate)
                        .le(InsNursingServiceOrder::getCreateTime, endDate);
            amountWrapper.ge(InsNursingServiceOrder::getCreateTime, startDate)
                         .le(InsNursingServiceOrder::getCreateTime, endDate);
        }

        long orderCount = insNursingServiceOrderService.count(countWrapper);

        List<InsNursingServiceOrder> completedList = insNursingServiceOrderService.list(amountWrapper);
        double totalAmount = completedList.stream()
                .mapToDouble(o -> o.getTotalAmount() != null ? o.getTotalAmount() : 0.0)
                .sum();

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("orderCount", orderCount);
        result.put("totalAmount", Math.round(totalAmount * 100.0) / 100.0);

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getNursingServiceOrderMonthlyStats")
    @ApiOperation(value = "自选服务工单统计（按月）", notes = "自选服务工单统计", httpMethod = "POST")
    public Result getNursingServiceOrderMonthlyStats() {
        List<InsNursingServiceOrder> orderList = insNursingServiceOrderService.list(
                new LambdaQueryWrapper<InsNursingServiceOrder>()
                        .ne(InsNursingServiceOrder::getServiceState, -1));

        // 初始化12个月
        Map<String, double[]> monthlyMap = new LinkedHashMap<>();
        for (int m = 1; m <= 12; m++) {
            String month = String.format("%02d", m);
            monthlyMap.put(month, new double[2]);
        }

        Calendar cal = Calendar.getInstance();
        for (InsNursingServiceOrder order : orderList) {
            if (order.getCreateTime() == null) continue;
            cal.setTime(order.getCreateTime());
            String month = String.format("%02d", cal.get(Calendar.MONTH) + 1);
            double[] stats = monthlyMap.computeIfAbsent(month, k -> new double[2]);
            stats[0]++;
            if (Integer.valueOf(3).equals(order.getServiceState()) && order.getTotalAmount() != null) {
                stats[1] += order.getTotalAmount();
            }
        }

        List<Map<String, Object>> result = new ArrayList<>();
        for (Map.Entry<String, double[]> entry : monthlyMap.entrySet()) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("month", entry.getKey());
            item.put("orderCount", (int) entry.getValue()[0]);
            item.put("totalAmount", Math.round(entry.getValue()[1] * 100.0) / 100.0);
            result.add(item);
        }

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getNursingServiceCategoryStats")
    @ApiOperation(value = "自选服务类别统计", notes = "自选服务类别统计", httpMethod = "POST")
    public Result getNursingServiceCategoryStats() {
        List<InsNursingServiceOrder> orderList = insNursingServiceOrderService.list(
                new LambdaQueryWrapper<InsNursingServiceOrder>()
                        .ne(InsNursingServiceOrder::getServiceState, -1));

        long total = orderList.size();
        if (total == 0) {
            return ResultGenerator.genSuccessResult(new ArrayList<>());
        }

        // 按 typeId 分组
        Map<Long, List<InsNursingServiceOrder>> grouped = orderList.stream()
                .filter(o -> o.getTypeId() != null)
                .collect(Collectors.groupingBy(InsNursingServiceOrder::getTypeId));

        List<Map<String, Object>> result = new ArrayList<>();
        for (Map.Entry<Long, List<InsNursingServiceOrder>> entry : grouped.entrySet()) {
            List<InsNursingServiceOrder> list = entry.getValue();
            int count = list.size();
            double ratio = Math.round(count * 1000.0 / total) / 10.0;

            Map<String, Object> item = new LinkedHashMap<>();
            item.put("typeName", list.get(0).getTypeName());
            item.put("count", count);
            item.put("ratio", ratio);
            result.add(item);
        }

        // 按数量降序排序
        result.sort((a, b) -> Integer.compare((int) b.get("count"), (int) a.get("count")));

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getNursingServiceItemRanking")
    @ApiOperation(value = "自选服务项目排行榜", notes = "按item_id分组统计项目名称、单数、服务时长和总价", httpMethod = "POST")
    public Result getNursingServiceItemRanking() {
        List<InsNursingServiceOrder> orderList = insNursingServiceOrderService.list(
                new LambdaQueryWrapper<InsNursingServiceOrder>()
                        .ne(InsNursingServiceOrder::getServiceState, -1));

        if (orderList.isEmpty()) {
            return ResultGenerator.genSuccessResult(new ArrayList<>());
        }

        // 按 itemId 分组
        Map<Long, List<InsNursingServiceOrder>> grouped = orderList.stream()
                .filter(o -> o.getItemId() != null)
                .collect(Collectors.groupingBy(InsNursingServiceOrder::getItemId));

        List<Map<String, Object>> result = new ArrayList<>();
        for (Map.Entry<Long, List<InsNursingServiceOrder>> entry : grouped.entrySet()) {
            List<InsNursingServiceOrder> list = entry.getValue();
            int count = list.size();
            int totalDuration = list.stream()
                    .mapToInt(o -> o.getServiceDuration() != null ? o.getServiceDuration() : 0)
                    .sum();
            double totalPrice = list.stream()
                    .mapToDouble(o -> o.getTotalAmount() != null ? o.getTotalAmount() : 0.0)
                    .sum();

            Map<String, Object> item = new LinkedHashMap<>();
            item.put("itemName", list.get(0).getItemName());
            item.put("count", count);
            item.put("totalDuration", totalDuration);
            item.put("totalPrice", Math.round(totalPrice * 100.0) / 100.0);
            result.add(item);
        }

        // 按单数降序排序
        result.sort((a, b) -> Integer.compare((int) b.get("count"), (int) a.get("count")));

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getAssessmentSummaryStats")
    @ApiOperation(value = "评估概括", notes = "评估概括", httpMethod = "POST")
    public Result getAssessmentSummaryStats() {
        // 查 assess_state=5 (评估完成)
        List<AssessmentAppoint> list = assessmentAppointService.list(
                new LambdaQueryWrapper<AssessmentAppoint>()
                        .eq(AssessmentAppoint::getAssessState, "5"));

        // 按 assess_type 分组
        Map<String, List<AssessmentAppoint>> byType = list.stream()
                .filter(a -> a.getAssessType() != null)
                .collect(Collectors.groupingBy(AssessmentAppoint::getAssessType));

        Map<String, Object> result = new LinkedHashMap<>();

        // assess_type=1: 能力评估
        List<AssessmentAppoint> type1 = byType.getOrDefault("1", Collections.emptyList());
        result.put("abilityAssessment", type1.size());

        // assess_type=2: 专项评估
        List<AssessmentAppoint> type2 = byType.getOrDefault("2", Collections.emptyList());
        result.put("specialAssessment", type2.size());

        // assess_type=3: 自定义评估，按 template_id 分组
        List<AssessmentAppoint> type3 = byType.getOrDefault("2", Collections.emptyList());
        Map<Long, Long> templateCountMap = type3.stream()
                .filter(a -> a.getTemplateId() != null)
                .collect(Collectors.groupingBy(AssessmentAppoint::getTemplateId, Collectors.counting()));

        // 固定4个模板，保证完整返回
        long[][] templates = {
                {1694168552465092609L}, {1694224752816803841L},
                {1694254242200670209L}, {1694183615242555394L}
        };
        String[] templateNames = {"跌倒风险评估", "噎食风险评估", "坠床风险评估", "压疮风险评估"};

        List<Map<String, Object>> customAssessment = new ArrayList<>();
        for (int i = 0; i < templates.length; i++) {
            Long templateId = templates[i][0];
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("templateId", String.valueOf(templateId));
            item.put("name", templateNames[i]);
            item.put("count", templateCountMap.getOrDefault(templateId, 0L));
            customAssessment.add(item);
        }
        result.put("customAssessment", customAssessment);

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getAbilityAssessmentRiskStats")
    @ApiOperation(value = "能力评估风险等级统计", notes = "能力评估风险等级统计", httpMethod = "POST")
    public Result getAbilityAssessmentRiskStats() {
        // 查 assess_state=5 (评估完成) 且 assess_type=1 (能力评估)
        List<AssessmentAppoint> list = assessmentAppointService.list(
                new LambdaQueryWrapper<AssessmentAppoint>()
                        .eq(AssessmentAppoint::getAssessState, "5")
                        .eq(AssessmentAppoint::getAssessType, "1"));

        // 按 assess_result 分组
        Map<String, Long> countMap = list.stream()
                .filter(a -> a.getAssessResult() != null)
                .collect(Collectors.groupingBy(AssessmentAppoint::getAssessResult, Collectors.counting()));

        // 固定5个等级，保证完整返回
        String[] codes = {"0", "1", "2", "3", "4"};
        String[] names = {"能力完好", "轻度失能", "中度失能", "重度失能", "完全失能"};

        List<Map<String, Object>> result = new ArrayList<>();
        for (int i = 0; i < codes.length; i++) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("name", names[i]);
            item.put("count", countMap.getOrDefault(codes[i], 0L));
            result.add(item);
        }

        return ResultGenerator.genSuccessResult(result);
    }


    @PostMapping("/getAssessmentYearlyStats")
    @ApiOperation(value = "本年评估统计", notes = "本年评估统计", httpMethod = "POST")
    public Result getAssessmentYearlyStats() {
        // 计算本年时间范围
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        cal.clear();
        cal.set(Calendar.YEAR, currentYear);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date yearStart = cal.getTime();
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 31);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        Date yearEnd = cal.getTime();

        // 本年 assess_state=5 的记录
        List<AssessmentAppoint> list = assessmentAppointService.list(
                new LambdaQueryWrapper<AssessmentAppoint>()
                        .eq(AssessmentAppoint::getAssessState, "5")
                        .ge(AssessmentAppoint::getAssessTime, yearStart)
                        .le(AssessmentAppoint::getAssessTime, yearEnd));

        long total = list.size();
        long abilityCount = list.stream().filter(a -> "1".equals(a.getAssessType())).count();
        long specialCount = list.stream().filter(a -> "2".equals(a.getAssessType())).count();

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("totalCount", total);
        result.put("abilityCount", abilityCount);
        result.put("specialCount", specialCount);

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getAssessmentRecordList")
    @ApiOperation(value = "评估对象记录", notes = "评估对象记录", httpMethod = "POST")
    public Result getAssessmentRecordList(@RequestBody Map<String, Object> params) {
        Object typeObj = params.get("type");
        if (typeObj == null) {
            return ResultGenerator.genFailResult("type参数不能为空");
        }
        String type = String.valueOf(typeObj);

        // 查询评估记录
        List<AssessmentAppoint> list = assessmentAppointService.list(
                new LambdaQueryWrapper<AssessmentAppoint>()
                        .eq(AssessmentAppoint::getAssessType, type));

        if (list.isEmpty()) {
            return ResultGenerator.genSuccessResult(new ArrayList<>());
        }

        // 批量查询模板名称，避免 N+1
        Set<Long> templateIds = list.stream()
                .map(AssessmentAppoint::getTemplateId)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
        Map<Long, String> templateMap = new HashMap<>();
        if (!templateIds.isEmpty()) {
            List<AssessmentTemplate> templates = assessmentTemplateService.listByIds(templateIds);
            for (AssessmentTemplate t : templates) {
                templateMap.put(t.getId(), t.getTemplateName());
            }
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Map<String, Object>> result = new ArrayList<>();
        for (AssessmentAppoint a : list) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("elderName", a.getElderName());
            item.put("templateName", a.getTemplateId() != null ? templateMap.getOrDefault(a.getTemplateId(), "-") : "-");

            // 评估状态翻译
            String stateText;
            if ("1".equals(a.getAssessState())) stateText = "待派单";
            else if ("2".equals(a.getAssessState())) stateText = "已派单";
            else if ("3".equals(a.getAssessState())) stateText = "已接单";
            else if ("4".equals(a.getAssessState())) stateText = "评估开始";
            else if ("5".equals(a.getAssessState())) stateText = "评估完成";
            else stateText = a.getAssessState() != null ? a.getAssessState() : "-";
            item.put("assessState", stateText);

            item.put("assignStaffName", a.getAssignStaffName());

            // 评估结果翻译（null不显示）
            if (a.getAssessResult() != null) {
                String resultText;
                if ("0".equals(a.getAssessResult())) resultText = "能力完好";
                else if ("1".equals(a.getAssessResult())) resultText = "轻度失能";
                else if ("2".equals(a.getAssessResult())) resultText = "中度失能";
                else if ("3".equals(a.getAssessResult())) resultText = "重度失能";
                else if ("4".equals(a.getAssessResult())) resultText = "完全失能";
                else resultText = a.getAssessResult();
                item.put("assessResult", resultText);
            }

            item.put("assessTime", a.getAssessTime() != null ? sdf.format(a.getAssessTime()) : "-");
            result.add(item);
        }

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getSpecialAssessmentRiskStats")
    @ApiOperation(value = "专项评估风险等级统计", notes = "专项评估风险等级统计", httpMethod = "POST")
    public Result getSpecialAssessmentRiskStats() {
        // 查 assess_state=5 (评估完成) 且 assess_type=2 (专项评估)
        List<AssessmentAppoint> list = assessmentAppointService.list(
                new LambdaQueryWrapper<AssessmentAppoint>()
                        .eq(AssessmentAppoint::getAssessState, "5")
                        .eq(AssessmentAppoint::getAssessType, "2"));

        // 4个专项模板定义
        String[] templateIds = {
                "1694224752816803841",
                "1694168552465092609",
                "1694254242200670209",
                "1694183615242555394"
        };
        String[] templateNames = {
                "噎食风险评估",
                "老人跌倒风险评估",
                "坠床风险评估",
                "压疮风险评估"
        };
        // 风险等级 code 与名称
        String[] riskCodes = {"1", "2", "3", "4"};
        String[] riskNames = {"低危", "中危", "中高风险", "高风险"};

        List<Map<String, Object>> result = new ArrayList<>();
        for (int t = 0; t < templateIds.length; t++) {
            final String currentTemplateId = templateIds[t];
            // 按 assess_result 分组统计当前模板
            Map<String, Long> countMap = list.stream()
                    .filter(a -> a.getTemplateId() != null && String.valueOf(a.getTemplateId()).equals(currentTemplateId))
                    .filter(a -> a.getAssessResult() != null)
                    .collect(Collectors.groupingBy(AssessmentAppoint::getAssessResult, Collectors.counting()));

            List<Map<String, Object>> riskList = new ArrayList<>();
            for (int r = 0; r < riskCodes.length; r++) {
                Map<String, Object> riskItem = new LinkedHashMap<>();
                riskItem.put("name", riskNames[r]);
                riskItem.put("count", countMap.getOrDefault(riskCodes[r], 0L));
                riskList.add(riskItem);
            }

            Map<String, Object> item = new LinkedHashMap<>();
            item.put("templateName", templateNames[t]);
            item.put("riskStats", riskList);
            result.add(item);
        }

        return ResultGenerator.genSuccessResult(result);
    }



    @PostMapping("/getResidentDetailStats")
    @ApiOperation(value = "用户明细统计", notes = "用户明细统计", httpMethod = "POST")
    public Result getResidentDetailStats() {
        // 计算本月时间范围
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date monthStart = cal.getTime();

        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        Date monthEnd = cal.getTime();

        // 在住老人总数：check_state=3
        long totalResidents = insElderCheckInfoService.count(
                new LambdaQueryWrapper<InsElderCheckInfo>()
                        .eq(InsElderCheckInfo::getCheckState, 3));

        // 本月新增入住数：check_state=3 且 check_date 在本月范围内
        long monthlyNewResidents = insElderCheckInfoService.count(
                new LambdaQueryWrapper<InsElderCheckInfo>()
                        .eq(InsElderCheckInfo::getCheckState, 3)
                        .ge(InsElderCheckInfo::getCheckDate, monthStart)
                        .le(InsElderCheckInfo::getCheckDate, monthEnd));

        // 本月退住人数：audit_state=2 且 retreat_time 在本月范围内
        long monthlyRetreats = insElderRetreatInfoService.count(
                new LambdaQueryWrapper<InsElderRetreatInfo>()
                        .eq(InsElderRetreatInfo::getAuditState, 2)
                        .ge(InsElderRetreatInfo::getRetreatTime, monthStart)
                        .le(InsElderRetreatInfo::getRetreatTime, monthEnd));

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("totalResidents", totalResidents);
        result.put("monthlyNewResidents", monthlyNewResidents);
        result.put("monthlyRetreats", monthlyRetreats);

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getUserAnalysisStats")
    @ApiOperation(value = "用户分析统计", notes = "用户分析统计", httpMethod = "POST")
    public Result getUserAnalysisStats() {
        // 查 check_state=3
        List<InsElderCheckInfo> list = insElderCheckInfoService.list(
                new LambdaQueryWrapper<InsElderCheckInfo>()
                        .eq(InsElderCheckInfo::getCheckState, 3));

        long total = list.size();

        // 性别统计
        Map<String, Long> sexCountMap = list.stream()
                .filter(a -> a.getSex() != null)
                .collect(Collectors.groupingBy(InsElderCheckInfo::getSex, Collectors.counting()));

        List<Map<String, Object>> genderStats = new ArrayList<>();
        String[][] sexDefs = {{"1", "男"}, {"2", "女"}};
        for (String[] def : sexDefs) {
            long count = sexCountMap.getOrDefault(def[0], 0L);
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("name", def[1]);
            item.put("count", count);
            item.put("ratio", total > 0 ? Math.round(count * 1000.0 / total) / 10.0 : 0.0);
            genderStats.add(item);
        }

        // 年龄段统计
        int[][] ageRanges = {{0, 59}, {60, 69}, {70, 79}, {80, 89}, {90, 99}, {100, 999}};
        String[] ageLabels = {"60岁以下", "60-69岁", "70-79岁", "80-89岁", "90-99岁", "100岁及以上"};

        List<Map<String, Object>> ageStats = new ArrayList<>();
        for (int i = 0; i < ageRanges.length; i++) {
            final int minAge = ageRanges[i][0];
            final int maxAge = ageRanges[i][1];
            long count = list.stream()
                    .filter(a -> a.getAge() != null && a.getAge() >= minAge && a.getAge() <= maxAge)
                    .count();
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("name", ageLabels[i]);
            item.put("count", count);
            item.put("ratio", total > 0 ? Math.round(count * 1000.0 / total) / 10.0 : 0.0);
            ageStats.add(item);
        }

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("total", total);
        result.put("genderStats", genderStats);
        result.put("ageStats", ageStats);

        return ResultGenerator.genSuccessResult(result);
    }


    @PostMapping("/getAbilityAssessmentLevelStats")
    @ApiOperation(value = "能力评估等级统计", notes = "能力评估等级统计", httpMethod = "POST")
    public Result getAbilityAssessmentLevelStats() {
        // 查 check_state=3 在住老人的 elder_id 集合
        List<InsElderCheckInfo> checkList = insElderCheckInfoService.list(
                new LambdaQueryWrapper<InsElderCheckInfo>()
                        .eq(InsElderCheckInfo::getCheckState, 3)
                        .select(InsElderCheckInfo::getElderId));
        Set<Long> elderIds = checkList.stream()
                .map(InsElderCheckInfo::getElderId)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());

        if (elderIds.isEmpty()) {
            return ResultGenerator.genSuccessResult(buildEmptyAbilityResult());
        }

        // 查这些老人 assess_state=5 的能力评估记录
        List<AssessmentAppoint> appointList = assessmentAppointService.list(
                new LambdaQueryWrapper<AssessmentAppoint>()
                        .eq(AssessmentAppoint::getAssessState, "5")
                        .in(AssessmentAppoint::getElderId, elderIds));

        // 每个 elder_id 取 assess_time 最新的一条记录
        Map<Long, AssessmentAppoint> latestMap = new HashMap<>();
        for (AssessmentAppoint a : appointList) {
            if (a.getElderId() == null) continue;
            AssessmentAppoint existing = latestMap.get(a.getElderId());
            if (existing == null) {
                latestMap.put(a.getElderId(), a);
            } else if (a.getAssessTime() != null &&
                    (existing.getAssessTime() == null || a.getAssessTime().after(existing.getAssessTime()))) {
                latestMap.put(a.getElderId(), a);
            }
        }

        // 将各老人的最新记录按 assess_result 汇总计数
        Map<String, Long> countMap = latestMap.values().stream()
                .filter(a -> a.getAssessResult() != null)
                .collect(Collectors.groupingBy(AssessmentAppoint::getAssessResult, Collectors.counting()));

        long total = latestMap.size();

        String[] codes = {"0", "1", "2", "3", "4"};
        String[] names = {"能力完好", "轻度失能", "中度失能", "重度失能", "完全失能"};

        List<Map<String, Object>> result = new ArrayList<>();
        for (int i = 0; i < codes.length; i++) {
            long count = countMap.getOrDefault(codes[i], 0L);
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("code", codes[i]);
            item.put("name", names[i]);
            item.put("count", count);
            item.put("ratio", total > 0 ? Math.round(count * 1000.0 / total) / 10.0 : 0.0);
            result.add(item);
        }

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getNursingLevelStats")
    @ApiOperation(value = "护理等级统计", notes = "按护理等级分组统计在住老人数量及比例", httpMethod = "POST")
    public Result getNursingLevelStats() {
        // 查 check_state=3 在住老人
        List<InsElderCheckInfo> list = insElderCheckInfoService.list(
                new LambdaQueryWrapper<InsElderCheckInfo>()
                        .eq(InsElderCheckInfo::getCheckState, 3));

        long total = list.size();

        // 按 nursingLevelId 分组，取每个等级的名称和数量
        Map<Long, List<InsElderCheckInfo>> groupMap = list.stream()
                .filter(a -> a.getNursingLevelId() != null)
                .collect(Collectors.groupingBy(InsElderCheckInfo::getNursingLevelId));

        List<Map<String, Object>> result = new ArrayList<>();
        for (Map.Entry<Long, List<InsElderCheckInfo>> entry : groupMap.entrySet()) {
            String levelName = entry.getValue().get(0).getNursingLevelName();
            long count = entry.getValue().size();
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("nursingLevelId", entry.getKey());
            item.put("nursingLevelName", levelName != null ? levelName : "-");
            item.put("count", count);
            item.put("ratio", total > 0 ? Math.round(count * 1000.0 / total) / 10.0 : 0.0);
            result.add(item);
        }

        Map<String, Object> wrapper = new LinkedHashMap<>();
        wrapper.put("total", total);
        wrapper.put("nursingLevelStats", result);

        return ResultGenerator.genSuccessResult(wrapper);
    }

    @PostMapping("/getUserGrowthTrend")
    @ApiOperation(value = "用户增长趋势", notes = "本年度入住/退住人数按月统计", httpMethod = "POST")
    public Result getUserGrowthTrend() {
        // 计算本年度时间范围
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        cal.clear();
        cal.set(Calendar.YEAR, currentYear);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date yearStart = cal.getTime();

        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 31);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        Date yearEnd = cal.getTime();

        //1~12 月统计桶 [0]=入住, [1]=退住
        int[][] monthly = new int[12][2];

        // 入住统计
        List<InsElderCheckInfo> checkList = insElderCheckInfoService.list(
                new LambdaQueryWrapper<InsElderCheckInfo>()
                        .eq(InsElderCheckInfo::getCheckState, 3)
                        .ge(InsElderCheckInfo::getCheckDate, yearStart)
                        .le(InsElderCheckInfo::getCheckDate, yearEnd));
        for (InsElderCheckInfo item : checkList) {
            if (item.getCheckDate() != null) {
                cal.setTime(item.getCheckDate());
                monthly[cal.get(Calendar.MONTH)][0]++;
            }
        }

        // 退住统计
        List<InsElderRetreatInfo> retreatList = insElderRetreatInfoService.list(
                new LambdaQueryWrapper<InsElderRetreatInfo>()
                        .eq(InsElderRetreatInfo::getAuditState, 2)
                        .ge(InsElderRetreatInfo::getRetreatTime, yearStart)
                        .le(InsElderRetreatInfo::getRetreatTime, yearEnd));
        for (InsElderRetreatInfo item : retreatList) {
            if (item.getRetreatTime() != null) {
                cal.setTime(item.getRetreatTime());
                monthly[cal.get(Calendar.MONTH)][1]++;
            }
        }

        // 返回结果
        List<Map<String, Object>> result = new ArrayList<>();
        for (int m = 0; m < 12; m++) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("month", (m + 1) + "月");
            item.put("checkIn", monthly[m][0]);
            item.put("retreat", monthly[m][1]);
            item.put("netGrowth", monthly[m][0] - monthly[m][1]);
            result.add(item);
        }

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getStaffDetailStats")
    @ApiOperation(value = "职工明细统计", notes = "员工总数、年龄分布、护理员持证率", httpMethod = "POST")
    public Result getStaffDetailStats() {
        // 员工总数 + 年龄分组
        List<UserInfo> userList = userInfoService.queryUserInfoList(new UserInfo());
        long totalEmployees = userList != null ? userList.size() : 0;

        // 年龄段
        int[][] ageRanges  = {{0, 29}, {30, 39}, {40, 49}, {50, 999}};
        String[] ageLabels = {"29岁以下", "30-39岁", "40-49岁", "50岁以上"};

        List<Map<String, Object>> ageStats = new ArrayList<>();
        if (userList != null) {
            for (int i = 0; i < ageRanges.length; i++) {
                final int min = ageRanges[i][0];
                final int max = ageRanges[i][1];
                long count = userList.stream()
                        .filter(u -> u.getAge() != null && u.getAge() >= min && u.getAge() <= max)
                        .count();
                Map<String, Object> item = new LinkedHashMap<>();
                item.put("name", ageLabels[i]);
                item.put("count", count);
                item.put("ratio", totalEmployees > 0 ? Math.round(count * 1000.0 / totalEmployees) / 10.0 : 0.0);
                ageStats.add(item);
            }
        }

        // 护理员统计
        List<InsNursingGroupMember> memberList = insNursingGroupMemberService.list();
        long totalNursing = memberList.size();
        long licensedCount = memberList.stream()
                .filter(m -> m.getIsLicensed() != null && m.getIsLicensed() == 1)
                .count();
        double licenseRate = totalNursing > 0 ? Math.round(licensedCount * 1000.0 / totalNursing) / 10.0 : 0.0;

        Map<String, Object> nursingStats = new LinkedHashMap<>();
        nursingStats.put("totalNursing", totalNursing);
        nursingStats.put("licensedCount", licensedCount);
        nursingStats.put("unlicensedCount", totalNursing - licensedCount);
        nursingStats.put("licenseRate", licenseRate);

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("totalEmployees", totalEmployees);
        result.put("ageStats", ageStats);
        result.put("nursingStats", nursingStats);

        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/getNursingCertificateStats")
    @ApiOperation(value = "护理员证书等级统计", notes = "护理员证书等级统计", httpMethod = "POST")
    public Result getNursingCertificateStats() {
        List<InsNursingGroupMember> memberList = insNursingGroupMemberService.list();
        long total = memberList.size();

        if (total == 0) {
            return ResultGenerator.genSuccessResult(new ArrayList<>());
        }

        Map<Integer, Long> grouped = memberList.stream()
                .filter(m -> m.getLicensedRecord() != null)
                .collect(Collectors.groupingBy(InsNursingGroupMember::getLicensedRecord, Collectors.counting()));

        List<Map<String, Object>> result = new ArrayList<>();
        grouped.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(entry -> {
                    long count = entry.getValue();
                    Map<String, Object> item = new LinkedHashMap<>();
                    item.put("record", entry.getKey());
                    item.put("count", count);
                    item.put("ratio", Math.round(count * 1000.0 / total) / 10.0);
                    result.add(item);
                });

        return ResultGenerator.genSuccessResult(result);
    }


    private List<Map<String, Object>> buildEmptyAbilityResult() {
        String[] codes = {"0", "1", "2", "3", "4"};
        String[] names = {"能力完好", "轻度失能", "中度失能", "重度失能", "完全失能"};
        List<Map<String, Object>> result = new ArrayList<>();
        for (int i = 0; i < codes.length; i++) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("code", codes[i]);
            item.put("name", names[i]);
            item.put("count", 0L);
            item.put("ratio", 0.0);
            result.add(item);
        }
        return result;
    }

    private String safeStr(String s) {
        return s != null ? s : "";
    }

    /**
     * 通用方法：将其他检测表的记录按时间标签累加到 statsMap 的 [3] 位
     * 默认使用 getGaugeTime 方法获取时间
     */
    private <T> void accumulateOther(List<T> records, String timeType, Calendar cal, Map<String, int[]> statsMap) {
        accumulateOther(records, timeType, cal, statsMap, "getGaugeTime");
    }

    /**
     * 通用方法：将其他检测表的记录按时间标签累加到 statsMap 的 [3] 位
     * 可指定获取时间的方法名
     */
    private <T> void accumulateOther(List<T> records, String timeType, Calendar cal, Map<String, int[]> statsMap, String timeMethod) {
        if (records == null || records.isEmpty()) {
            return;
        }
        for (T record : records) {
            Date time = getGaugeTime(record, timeMethod);
            String label = getTimeLabel(time, timeType, cal);
            statsMap.computeIfAbsent(label, k -> new int[4])[3]++;
        }
    }

    /**
     * 通过反射获取任意健康实体的时间字段
     */
    private <T> Date getGaugeTime(T entity, String methodName) {
        try {
            java.lang.reflect.Method method = entity.getClass().getMethod(methodName);
            return (Date) method.invoke(entity);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 根据 timeType 生成时间标签
     * timeType=1: 周一~周日
     * timeType=2: 1号~31号
     * timeType=3: 1月~12月
     */
    private List<String> buildTimeLabels(String timeType, Date startDate, Date endDate) {
        List<String> labels = new ArrayList<>();
        if ("1".equals(timeType)) {
            String[] weekDays = {"周一", "周二", "周三", "周四", "周五", "周六", "周日"};
            Collections.addAll(labels, weekDays);
        } else if ("2".equals(timeType)) {
            for (int d = 1; d <= 31; d++) {
                labels.add(d + "号");
            }
        } else if ("3".equals(timeType)) {
            for (int m = 1; m <= 12; m++) {
                labels.add(m + "月");
            }
        }
        return labels;
    }

    /**
     * 根据 timeType 从日期中提取时间标签
     */
    private String getTimeLabel(Date gaugeTime, String timeType, Calendar cal) {
        if (gaugeTime == null) {
            return "";
        }
        cal.setTime(gaugeTime);
        if ("1".equals(timeType)) {
            String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
            // Calendar.DAY_OF_WEEK: 1=周日, 2=周一, ..., 7=周六
            return weekDays[cal.get(Calendar.DAY_OF_WEEK) - 1];
        } else if ("2".equals(timeType)) {
            return cal.get(Calendar.DAY_OF_MONTH) + "号";
        } else if ("3".equals(timeType)) {
            return (cal.get(Calendar.MONTH) + 1) + "月";
        }
        return "";
    }
}
