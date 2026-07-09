package cn.pluss.platform.controller;

import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.base.auth.userInfo.UserInfoService;
import cn.pluss.platform.model.entity.*;
import cn.pluss.platform.service.elderBaseInfo.ElderBaseInfoService;
import cn.pluss.platform.service.healthWarningLog.HealthWarningLogService;
import cn.pluss.platform.service.insBaseBedInfo.InsBaseBedInfoService;
import cn.pluss.platform.service.insCanteenOrderInfo.InsCanteenOrderInfoService;
import cn.pluss.platform.service.insElderCheckInfo.InsElderCheckInfoService;
import cn.pluss.platform.service.insElderRetreatInfo.InsElderRetreatInfoService;
import cn.pluss.platform.service.insExpensesBillRecordDetail.InsExpensesBillRecordDetailService;
import cn.pluss.platform.service.insNursingGroupMember.InsNursingGroupMemberService;
import cn.pluss.platform.service.iotDeviceAlarmLog.IotDeviceAlarmLogService;
import cn.pluss.platform.service.iotDeviceInfo.IotDeviceInfoService;
import cn.pluss.platform.service.marketOrderInfo.MarketOrderInfoService;
import cn.pluss.platform.model.dto.HealthDto;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/deandashboard")
@Api(value = "DeanDashboard控制类",tags={"Dashboard接口"})
public class DeanDashboardController {

    @Resource
    private InsExpensesBillRecordDetailService insExpensesBillRecordDetailService;
    @Resource
    private InsElderCheckInfoService insElderCheckInfoService;
    @Resource
    private ElderBaseInfoService elderBaseInfoService;
    @Resource
    private InsNursingGroupMemberService insNursingGroupMemberService;
    @Resource
    private UserInfoService userInfoService;
    @Resource
    private InsElderRetreatInfoService insElderRetreatInfoService;
    @Resource
    private InsBaseBedInfoService insBaseBedInfoService;
    @Resource
    private InsCanteenOrderInfoService insCanteenOrderInfoService;
    @Resource
    private IotDeviceInfoService iotDeviceInfoService;
    @Resource
    private IotDeviceAlarmLogService iotDeviceAlarmLogService;
    @Resource
    private HealthWarningLogService healthWarningLogService;
    @Resource
    private MarketOrderInfoService marketOrderInfoService;

    @PostMapping("/dean")
    @ApiOperation(value = "院长驾驶舱总览", notes = "聚合院长驾驶舱所有统计数据", httpMethod = "POST")
    public Result getDashboardData() {
        Map<String, Object> dashboard = new LinkedHashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

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

        HealthDto healthDto = new HealthDto();
        healthDto.setStratTime(sdf.format(monthStart));
        healthDto.setEndTime(sdf.format(monthEnd));

        //1.当月收入（含费用分类明细）—— 查费用账单明细表
        List<InsExpensesBillRecordDetail> billList = insExpensesBillRecordDetailService.list(
                new LambdaQueryWrapper<InsExpensesBillRecordDetail>()
                        .eq(InsExpensesBillRecordDetail::getBillState, 1)
                        .ge(InsExpensesBillRecordDetail::getCreateTime, monthStart)
                        .le(InsExpensesBillRecordDetail::getCreateTime, monthEnd));

        // paymentType → 费用名称映射
        String[] paymentTypeNames = {
                "","护理费",  "床位费", "入住押金","餐费", "医疗备用金"
        };
        Map<String, Object> monthlyRevenue = new LinkedHashMap<>();
        // 三大金额指标
        double receivableTotal = billList.stream()
                .mapToDouble(r -> r.getReceivableAmount() != null ? r.getReceivableAmount() : 0.0).sum();
        double actualTotal = billList.stream()
                .filter(r -> r.getPayState() != null && r.getPayState() == 2)
                .mapToDouble(r -> r.getActualAmount() != null ? r.getActualAmount() : 0.0).sum();
        double arrearsTotal = billList.stream()
                .filter(r -> r.getPayState() != null && r.getPayState() == 1)
                .mapToDouble(r -> {
                    double receivable = r.getReceivableAmount() != null ? r.getReceivableAmount() : 0.0;
                    double preferential = r.getPreferentialAmount() != null ? r.getPreferentialAmount() : 0.0;
                    return receivable - preferential;
                }).sum();
        monthlyRevenue.put("receivableAmount",
                receivableTotal > 0 ? new BigDecimal(receivableTotal).setScale(2, RoundingMode.HALF_UP) : 0.00);
        monthlyRevenue.put("actualAmount",
                actualTotal > 0 ? new BigDecimal(actualTotal).setScale(2, RoundingMode.HALF_UP) : 0.00);
        monthlyRevenue.put("arrearsAmount",
                arrearsTotal > 0 ? new BigDecimal(arrearsTotal).setScale(2, RoundingMode.HALF_UP) : 0.00);

        // 费用项目分类（已支付，按 paymentType 聚合 actualAmount）
        Map<Integer, Double> typeAmountMap = new LinkedHashMap<>();
        billList.stream()
                .filter(r -> r.getPayState() != null && r.getPayState() == 2
                        && r.getPaymentType() != null)
                .forEach(r -> {
                    double amt = r.getActualAmount() != null ? r.getActualAmount() : 0.0;
                    typeAmountMap.merge(r.getPaymentType(), amt, Double::sum);
                });
        List<Map<String, Object>> categoryBreakdown = new ArrayList<>();
        for (Map.Entry<Integer, Double> entry : typeAmountMap.entrySet()) {
            int type = entry.getKey();
            String name = (type >= 1 && type < paymentTypeNames.length)
                    ? paymentTypeNames[type] : "月度费用";
            Map<String, Object> cat = new LinkedHashMap<>();
            cat.put("paymentType", type);
            cat.put("billName", name);
            cat.put("amount", entry.getValue() > 0
                    ? BigDecimal.valueOf(entry.getValue()).setScale(2, RoundingMode.HALF_UP)
                    : 0.00);
            categoryBreakdown.add(cat);
        }
        monthlyRevenue.put("categoryBreakdown", categoryBreakdown);
        dashboard.put("monthlyRevenue", monthlyRevenue);

        //2.今日实时数据
        dashboard.put("todayRealTimeData", insElderCheckInfoService.getTodayRealTimeData());

        //3.老人画像
        Map<String, Object> elderPortrait = new LinkedHashMap<>();
        elderPortrait.put("ageGenderStats", elderBaseInfoService.getElderlyAgeGenderStatistics());
        elderPortrait.put("careLevelStats", elderBaseInfoService.getElderlyCareLevelStatistics());
        elderPortrait.put("categoryStats", elderBaseInfoService.getElderlyCategoryStatistics());
        dashboard.put("elderPortrait", elderPortrait);

        //4.护理员持证统计（只查licensedRecord列，减少数据传输）
        List<InsNursingGroupMember> memberList = insNursingGroupMemberService.list(
                new LambdaQueryWrapper<InsNursingGroupMember>()
                        .select(InsNursingGroupMember::getLicensedRecord));
        // 按 licensedRecord 分组统计（0=未评级,1=一级,2=二级,3=三级,4=四级,5=五级）
        String[] certLevelNames = {"未评级", "一级/高级技师", "二级/技师", "三级/高级工", "四级/中级工", "五级/初级工"};
        Map<Integer, Long> certCountMap = memberList.stream()
                .collect(Collectors.groupingBy(
                        m -> m.getLicensedRecord() != null ? m.getLicensedRecord() : 0,
                        Collectors.counting()));
        List<Map<String, Object>> nursingCertStats = new ArrayList<>();
        int[] certOrder = {1, 2, 3, 4, 5, 0};
        for (int level : certOrder) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("category", certLevelNames[level]);
            item.put("value", certCountMap.getOrDefault(level, 0L));
            nursingCertStats.add(item);
        }
        dashboard.put("nursingCertStats", nursingCertStats);

        //5.员工岗位统计
        dashboard.put("employeeStats", userInfoService.getEmployeeStatistics());


        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
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

        //7.床位使用统计
        dashboard.put("bedStats", insBaseBedInfoService.getBedInfoStatisticsCount());

        //8.智能设备概况
        List<IotDeviceInfo> deviceList = iotDeviceInfoService.list();
        long totalDevices = deviceList.size();
        long onlineDevices = deviceList.stream()
                .filter(d -> d.getDeviceState() != null && d.getDeviceState() == 1).count();
        long offlineDevices = totalDevices - onlineDevices;

        // 告警数量（当天，按device_name去重）
        Calendar todayCal = Calendar.getInstance();
        todayCal.set(Calendar.HOUR_OF_DAY, 0);
        todayCal.set(Calendar.MINUTE, 0);
        todayCal.set(Calendar.SECOND, 0);
        todayCal.set(Calendar.MILLISECOND, 0);
        Date todayStart = todayCal.getTime();
        todayCal.set(Calendar.HOUR_OF_DAY, 23);
        todayCal.set(Calendar.MINUTE, 59);
        todayCal.set(Calendar.SECOND, 59);
        Date todayEnd = todayCal.getTime();
        long alarmCount = iotDeviceAlarmLogService.list(
                new LambdaQueryWrapper<IotDeviceAlarmLog>()
                        .ge(IotDeviceAlarmLog::getAlarmTime, todayStart)
                        .le(IotDeviceAlarmLog::getAlarmTime, todayEnd)
                        .isNotNull(IotDeviceAlarmLog::getDeviceName)
        ).stream().map(IotDeviceAlarmLog::getDeviceName).distinct().count();

        // 在线率
        BigDecimal onlineRate = totalDevices > 0
                ? new BigDecimal(onlineDevices).multiply(new BigDecimal("100"))
                .divide(new BigDecimal(totalDevices), 1, RoundingMode.HALF_UP)
                : BigDecimal.ZERO;

        Map<String, Object> deviceOverview = new LinkedHashMap<>();
        deviceOverview.put("totalDevices", totalDevices);
        deviceOverview.put("onlineDevices", onlineDevices);
        deviceOverview.put("offlineDevices", offlineDevices);
        deviceOverview.put("alarmCount", alarmCount);
        deviceOverview.put("onlineRate", onlineRate);

        dashboard.put("deviceOverview", deviceOverview);


        //10.告警处理统计（已处理/未处理 百分比）
        long deviceAlarmTotal = iotDeviceAlarmLogService.count();
        long deviceAlarmUnprocessed = iotDeviceAlarmLogService.count(
                new LambdaQueryWrapper<IotDeviceAlarmLog>()
                        .eq(IotDeviceAlarmLog::getStatus, 0));
        long deviceAlarmProcessed = deviceAlarmTotal - deviceAlarmUnprocessed;

        BigDecimal processedRate = deviceAlarmTotal > 0
                ? new BigDecimal(deviceAlarmProcessed).multiply(new BigDecimal("100"))
                .divide(new BigDecimal(deviceAlarmTotal), 1, RoundingMode.HALF_UP)
                : BigDecimal.ZERO;
        BigDecimal unprocessedRate = deviceAlarmTotal > 0
                ? new BigDecimal(deviceAlarmUnprocessed).multiply(new BigDecimal("100"))
                .divide(new BigDecimal(deviceAlarmTotal), 1, RoundingMode.HALF_UP)
                : BigDecimal.ZERO;

        Map<String, Object> alarmProcessStats = new LinkedHashMap<>();
        //已处理百分比
        alarmProcessStats.put("processedRate", processedRate);
        //未处理百分比
        alarmProcessStats.put("unprocessedRate", unprocessedRate);
        //告警总数
        alarmProcessStats.put("deviceAlarmTotal", deviceAlarmTotal);
        //已处理数
        alarmProcessStats.put("deviceAlarmProcessed", deviceAlarmProcessed);
        //未处理数
        alarmProcessStats.put("deviceAlarmUnprocessed", deviceAlarmUnprocessed);
        dashboard.put("alarmProcessStats", alarmProcessStats);


        //11.增值服务统计（物品订单 + 餐饮订单 + 自选服务订单，本月+累计）
        Map<String, Object> marketStats = marketOrderInfoService.valueAddedRevenueCount(healthDto);
        // 餐饮订单（InsCanteenOrderInfo）
        long monthCanteenCount = insCanteenOrderInfoService.count(
                new LambdaQueryWrapper<InsCanteenOrderInfo>()
                        .ge(InsCanteenOrderInfo::getCreateTime, monthStart)
                        .le(InsCanteenOrderInfo::getCreateTime, monthEnd));
        long totalCanteenCount = insCanteenOrderInfoService.count();
        Map<String, Object> valueAddedStats = new LinkedHashMap<>();
        valueAddedStats.put("monthGoodsCount", marketStats.get("monthGoodsCount"));
        valueAddedStats.put("totalGoodsCount", marketStats.get("totalGoodsCount"));
        valueAddedStats.put("monthCanteenCount", monthCanteenCount);
        valueAddedStats.put("totalCanteenCount", totalCanteenCount);
        valueAddedStats.put("monthServiceCount", marketStats.get("monthServiceCount"));
        valueAddedStats.put("totalServiceCount", marketStats.get("totalServiceCount"));
        dashboard.put("valueAddedRevenue", valueAddedStats);

        //12.订单数量趋势图（本年度按月，三条线：物品订单、餐饮订单、自选服务单）
        // 物品 + 自选服务（MarketOrderInfo，categoryType="2"=物品，"1"=自选服务）
        List<MarketOrderInfo> yearMarketOrders = marketOrderInfoService.list(
                new LambdaQueryWrapper<MarketOrderInfo>()
                        .eq(MarketOrderInfo::getPayState, "1")
                        .ge(MarketOrderInfo::getCreateTime, yearStart)
                        .le(MarketOrderInfo::getCreateTime, yearEnd));
        int[] monthlyGoods = new int[12];
        int[] monthlyService = new int[12];
        for (MarketOrderInfo order : yearMarketOrders) {
            if (order.getCreateTime() != null) {
                cal.setTime(order.getCreateTime());
                int idx = cal.get(Calendar.MONTH);
                if ("2".equals(order.getCategoryType())) monthlyGoods[idx]++;
                else if ("1".equals(order.getCategoryType())) monthlyService[idx]++;
            }
        }
        // 餐饮订单（InsCanteenOrderInfo）
        List<InsCanteenOrderInfo> yearCanteenOrders = insCanteenOrderInfoService.list(
                new LambdaQueryWrapper<InsCanteenOrderInfo>()
                        .ge(InsCanteenOrderInfo::getCreateTime, yearStart)
                        .le(InsCanteenOrderInfo::getCreateTime, yearEnd));
        int[] monthlyCanteen = new int[12];
        for (InsCanteenOrderInfo order : yearCanteenOrders) {
            if (order.getCreateTime() != null) {
                cal.setTime(order.getCreateTime());
                monthlyCanteen[cal.get(Calendar.MONTH)]++;
            }
        }
        List<Map<String, Object>> orderTrend = new ArrayList<>();
        for (int m = 0; m < 12; m++) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("month", (m + 1) + "月");
            item.put("goodsOrderCount", monthlyGoods[m]);
            item.put("canteenOrderCount", monthlyCanteen[m]);
            item.put("serviceOrderCount", monthlyService[m]);
            orderTrend.add(item);
        }
        dashboard.put("orderTrend", orderTrend);

        return ResultGenerator.genSuccessResult(dashboard);
    }

    @PostMapping("/alarmStats")
    @ApiOperation(value = "告警数量统计", notes = "按年月查询告警分类统计，year和month不传则默认当月", httpMethod = "POST")
    public Result getAlarmStats(@RequestParam(value = "year", required = false) Integer year,@RequestParam(value = "month", required = false) Integer month) {
        Calendar cal = Calendar.getInstance();
        if (year == null) {
            year = cal.get(Calendar.YEAR);
        }
        if (month == null) {
            month = cal.get(Calendar.MONTH) + 1;
        }
        // 计算指定月份时间范围
        cal.clear();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
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

        // 查询指定月份告警日志
        List<IotDeviceAlarmLog> alarmLogList = iotDeviceAlarmLogService.list(
                new LambdaQueryWrapper<IotDeviceAlarmLog>()
                        .ge(IotDeviceAlarmLog::getAlarmTime, monthStart)
                        .le(IotDeviceAlarmLog::getAlarmTime, monthEnd));
        Map<Integer, Long> alarmTypeCountMap = alarmLogList.stream()
                .filter(a -> a.getAlarmType() != null)
                .collect(Collectors.groupingBy(IotDeviceAlarmLog::getAlarmType, Collectors.counting()));
        String[] alarmTypeNames = {"", "燃气告警", "烟雾告警", "水浸告警", "紧急呼叫告警",
                "门磁告警", "红外告警", "低电量告警", "离线告警", "跌倒告警",
                "床垫告警", "围栏告警", "联网告警", "电源故障", "灰尘告警"};
        List<Map<String, Object>> alarmTypeStats = new ArrayList<>();
        for (int i = 1; i < alarmTypeNames.length; i++) {
            Map<String, Object> alarmItem = new LinkedHashMap<>();
            alarmItem.put("alarmType", i);
            alarmItem.put("alarmTypeName", alarmTypeNames[i]);
            alarmItem.put("count", alarmTypeCountMap.getOrDefault(i, 0L));
            alarmTypeStats.add(alarmItem);
        }

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("alarmTypeStats", alarmTypeStats);
        result.put("deviceAlarmTotal", alarmLogList.size());
        return ResultGenerator.genSuccessResult(result);
    }

    @PostMapping("/inoutTrend")
    @ApiOperation(value = "出入院趋势分析", notes = "timeType: 1=本周, 2=本月, 3=本年", httpMethod = "POST")
    public Result getInOutTrend(@RequestBody(required = false) HealthDto healthDto) {
        String timeType = (healthDto != null && healthDto.getTimeType() != null) ? healthDto.getTimeType() : "1";
        Calendar cal = Calendar.getInstance();

        Date rangeStart;
        Date rangeEnd;
        int slots;
        String[] labels;

        switch (timeType) {
            case "2": // 本月（按天）
                cal.set(Calendar.DAY_OF_MONTH, 1);
                cal.set(Calendar.HOUR_OF_DAY, 0);
                cal.set(Calendar.MINUTE, 0);
                cal.set(Calendar.SECOND, 0);
                cal.set(Calendar.MILLISECOND, 0);
                rangeStart = cal.getTime();
                int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
                cal.set(Calendar.DAY_OF_MONTH, daysInMonth);
                cal.set(Calendar.HOUR_OF_DAY, 23);
                cal.set(Calendar.MINUTE, 59);
                cal.set(Calendar.SECOND, 59);
                rangeEnd = cal.getTime();
                slots = daysInMonth;
                labels = new String[slots];
                for (int i = 0; i < slots; i++) labels[i] = (i + 1) + "日";
                break;
            case "3": // 本年（按月）
                cal.clear();
                cal.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
                cal.set(Calendar.MONTH, Calendar.JANUARY);
                cal.set(Calendar.DAY_OF_MONTH, 1);
                rangeStart = cal.getTime();
                cal.set(Calendar.MONTH, Calendar.DECEMBER);
                cal.set(Calendar.DAY_OF_MONTH, 31);
                cal.set(Calendar.HOUR_OF_DAY, 23);
                cal.set(Calendar.MINUTE, 59);
                cal.set(Calendar.SECOND, 59);
                rangeEnd = cal.getTime();
                slots = 12;
                labels = new String[]{"1月","2月","3月","4月","5月","6月",
                        "7月","8月","9月","10月","11月","12月"};
                break;
            default: // 本周（按周一~周日）
                cal.setFirstDayOfWeek(Calendar.MONDAY);
                cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
                cal.set(Calendar.HOUR_OF_DAY, 0);
                cal.set(Calendar.MINUTE, 0);
                cal.set(Calendar.SECOND, 0);
                cal.set(Calendar.MILLISECOND, 0);
                rangeStart = cal.getTime();
                cal.add(Calendar.DAY_OF_MONTH, 6);
                cal.set(Calendar.HOUR_OF_DAY, 23);
                cal.set(Calendar.MINUTE, 59);
                cal.set(Calendar.SECOND, 59);
                rangeEnd = cal.getTime();
                slots = 7;
                labels = new String[]{"周一","周二","周三","周四","周五","周六","周日"};
                break;
        }

        // 入住人数（checkState IN 2,3）
        int[] checkInArr = new int[slots];
        List<InsElderCheckInfo> checkList = insElderCheckInfoService.list(
                new LambdaQueryWrapper<InsElderCheckInfo>()
                        .in(InsElderCheckInfo::getCheckState, Arrays.asList(2, 3))
                        .ge(InsElderCheckInfo::getCheckDate, rangeStart)
                        .le(InsElderCheckInfo::getCheckDate, rangeEnd));
        for (InsElderCheckInfo item : checkList) {
            if (item.getCheckDate() != null) {
                int idx = getIndex(item.getCheckDate(), timeType, cal);
                if (idx >= 0 && idx < slots) checkInArr[idx]++;
            }
        }

        // 退住人数（auditState=2）
        int[] retreatArr = new int[slots];
        List<InsElderRetreatInfo> retreatList = insElderRetreatInfoService.list(
                new LambdaQueryWrapper<InsElderRetreatInfo>()
                        .eq(InsElderRetreatInfo::getAuditState, 2)
                        .ge(InsElderRetreatInfo::getRetreatTime, rangeStart)
                        .le(InsElderRetreatInfo::getRetreatTime, rangeEnd));
        for (InsElderRetreatInfo item : retreatList) {
            if (item.getRetreatTime() != null) {
                int idx = getIndex(item.getRetreatTime(), timeType, cal);
                if (idx >= 0 && idx < slots) retreatArr[idx]++;
            }
        }

        List<Map<String, Object>> trend = new ArrayList<>();
        for (int i = 0; i < slots; i++) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("label", labels[i]);
            item.put("checkIn", checkInArr[i]);
            item.put("retreat", retreatArr[i]);
            trend.add(item);
        }
        return ResultGenerator.genSuccessResult(trend);
    }

    /**
     * 根据 timeType 计算日期落在哪个槽位（返回索引）
     */
    private int getIndex(Date date, String timeType, Calendar cal) {
        cal.setTime(date);
        switch (timeType) {
            case "2": // 本月：DAY_OF_MONTH - 1（1日→0，2日→1...）
                return cal.get(Calendar.DAY_OF_MONTH) - 1;
            case "3": // 本年：MONTH（0~11）
                return cal.get(Calendar.MONTH);
            default: // 本周：DAY_OF_WEEK（MONDAY=2→0 ... SUNDAY=1→6）
                int dow = cal.get(Calendar.DAY_OF_WEEK);
                return dow == Calendar.SUNDAY ? 6 : dow - Calendar.MONDAY;
        }
    }


}
