package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthBloodFat;
import cn.pluss.platform.model.entity.HealthBloodOxygen;
import cn.pluss.platform.model.entity.HealthBloodPressure;
import cn.pluss.platform.model.entity.HealthBloodSugar;
import cn.pluss.platform.model.entity.HealthBasicsRecords;
import cn.pluss.platform.model.entity.HealthEcgRecords;
import cn.pluss.platform.model.entity.HealthTemperatureRecords;
import cn.pluss.platform.model.entity.HealthUricacidRecords;
import cn.pluss.platform.model.entity.HealthUrinalysisRecords;
import cn.pluss.platform.service.healthBasicsRecords.HealthBasicsRecordsService;
import cn.pluss.platform.service.healthBloodFat.HealthBloodFatService;
import cn.pluss.platform.service.healthBloodOxygen.HealthBloodOxygenService;
import cn.pluss.platform.model.vo.BloodDetectionVo;
import cn.pluss.platform.model.vo.BloodWeeklyStatVo;
import cn.pluss.platform.service.healthBloodPressure.HealthBloodPressureService;
import cn.pluss.platform.service.healthBloodSugar.HealthBloodSugarService;
import cn.pluss.platform.service.healthEcgRecords.HealthEcgRecordsService;
import cn.pluss.platform.service.healthTemperatureRecords.HealthTemperatureRecordsService;
import cn.pluss.platform.service.healthUricacidRecords.HealthUricacidRecordsService;
import cn.pluss.platform.service.healthUrinalysisRecords.HealthUrinalysisRecordsService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;



@RestController
@RequestMapping("/healthBloodPressure")
@Api(value = "HealthBloodPressure控制类",tags={"HealthBloodPressure接口"})
public class HealthBloodPressureController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthBloodPressureService healthBloodPressureService;

    @Resource
    private HealthBloodSugarService healthBloodSugarService;

    @Resource
    private HealthBloodOxygenService healthBloodOxygenService;

    @Resource
    private HealthEcgRecordsService healthEcgRecordsService;

    @Resource
    private HealthTemperatureRecordsService healthTemperatureRecordsService;

    @Resource
    private HealthBasicsRecordsService healthBasicsRecordsService;

    @Resource
    private HealthBloodFatService healthBloodFatService;

    @Resource
    private HealthUricacidRecordsService healthUricacidRecordsService;

    @Resource
    private HealthUrinalysisRecordsService healthUrinalysisRecordsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthBloodPressure>> list(@RequestBody PageQueryInfo pageQueryInfo) {
        if(pageQueryInfo.getPageSize()==0) {
            pageQueryInfo.setPageSize(ProjectConstant.PAGE_SIZE);
        }
        if(pageQueryInfo.getCurrPage()==0) {
            pageQueryInfo.setCurrPage(1);
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageSize",pageQueryInfo.getPageSize());
        map.put("offset", (pageQueryInfo.getCurrPage()-1)*pageQueryInfo.getPageSize());
        if(pageQueryInfo.getCondition() != null){
            map.putAll(pageQueryInfo.getCondition());
        }
        List<HealthBloodPressure> healthBloodPressureList = healthBloodPressureService.queryPage(map);
        Integer count= healthBloodPressureService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthBloodPressure>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthBloodPressureList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthBloodPressure
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthBloodPressure>> queryList(@RequestBody HealthBloodPressure healthBloodPressure) {
        List<HealthBloodPressure> healthBloodPressureList = healthBloodPressureService.queryList(healthBloodPressure);
        return ResultGenerator.genSuccessResult(healthBloodPressureList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthBloodPressure 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthBloodPressure> queryOne(@RequestBody HealthBloodPressure healthBloodPressure) {
        return ResultGenerator.genSuccessResult(healthBloodPressureService.queryOne(healthBloodPressure));
    }

    /**
    * 保存数据
    * @param healthBloodPressure
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthBloodPressure healthBloodPressure) {
        //Date currentDt = new Date();
        if (healthBloodPressure.getId() != null && healthBloodPressure.getId().longValue() > 0) {
            //healthBloodPressure.setUpdatedDt(currentDt);
            healthBloodPressureService.update(healthBloodPressure);
        } else {
            //healthBloodPressure.setCreatedDt(currentDt);
            //healthBloodPressure.setUpdatedDt(currentDt);
            healthBloodPressureService.insert(healthBloodPressure);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthBloodPressure 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthBloodPressure> add(@RequestBody HealthBloodPressure healthBloodPressure) {
        //Date currentDt = new Date();
        //healthBloodPressure.setCreatedDt(currentDt);
        //healthBloodPressure.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthBloodPressureService.insert(healthBloodPressure));
    }

    /**
    * 更新数据
    *
    * @param healthBloodPressure 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthBloodPressure> update(@RequestBody HealthBloodPressure healthBloodPressure) {
        return ResultGenerator.genSuccessResult(healthBloodPressureService.update(healthBloodPressure));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthBloodPressure 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthBloodPressure healthBloodPressure) {
        return ResultGenerator.genSuccessResult(healthBloodPressureService.deleteById(healthBloodPressure.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthBloodPressure> insertList) {
        return ResultGenerator.genSuccessResult(healthBloodPressureService.saveHealthBloodPressureBatch(insertList));
    }

    @PostMapping("/monitorElderList")
    @ApiOperation(value = "监控老人列表", notes = "monitorType=1血压监控 monitorType=2血糖监控 monitorType=3血氧监控 monitorType=4心率监控 monitorType=5体温监控 monitorType=6BMI监控 monitorType=7胆固醇监控 monitorType=8尿酸监控 monitorType=9尿常规监控", httpMethod = "POST")
    public Result monitorElderList(@RequestBody HealthBloodPressure param) {
        String monitorType = param.getMonitorType();
        if ("1".equals(monitorType)) {
            Map<String, Object> resultMap = healthBloodPressureService.monitorBloodPressure(param);
            return ResultGenerator.genSuccessResult(resultMap);
        } else if ("2".equals(monitorType)) {
            HealthBloodSugar bsQuery = new HealthBloodSugar();
            BeanUtils.copyProperties(param, bsQuery);
            Map<String, Object> resultMap = healthBloodSugarService.monitorBloodSugar(bsQuery);
            return ResultGenerator.genSuccessResult(resultMap);
        } else if ("3".equals(monitorType)) {
            HealthBloodOxygen boQuery = new HealthBloodOxygen();
            BeanUtils.copyProperties(param, boQuery);
            Map<String, Object> resultMap = healthBloodOxygenService.monitorBloodOxygen(boQuery);
            return ResultGenerator.genSuccessResult(resultMap);
        } else if ("4".equals(monitorType)) {
            HealthEcgRecords ecgQuery = new HealthEcgRecords();
            BeanUtils.copyProperties(param, ecgQuery);
            Map<String, Object> resultMap = healthEcgRecordsService.monitorHeartRate(ecgQuery);
            return ResultGenerator.genSuccessResult(resultMap);
        } else if ("5".equals(monitorType)) {
            HealthTemperatureRecords trQuery = new HealthTemperatureRecords();
            BeanUtils.copyProperties(param, trQuery);
            Map<String, Object> resultMap = healthTemperatureRecordsService.monitorBodyTemperature(trQuery);
            return ResultGenerator.genSuccessResult(resultMap);
        } else if ("6".equals(monitorType)) {
            HealthBasicsRecords brQuery = new HealthBasicsRecords();
            BeanUtils.copyProperties(param, brQuery);
            Map<String, Object> resultMap = healthBasicsRecordsService.monitorBmi(brQuery);
            return ResultGenerator.genSuccessResult(resultMap);
        } else if ("7".equals(monitorType)) {
            HealthBloodFat bfQuery = new HealthBloodFat();
            BeanUtils.copyProperties(param, bfQuery);
            Map<String, Object> resultMap = healthBloodFatService.monitorCholesterol(bfQuery);
            return ResultGenerator.genSuccessResult(resultMap);
        } else if ("8".equals(monitorType)) {
            HealthUricacidRecords uaQuery = new HealthUricacidRecords();
            BeanUtils.copyProperties(param, uaQuery);
            Map<String, Object> resultMap = healthUricacidRecordsService.monitorUricAcid(uaQuery);
            return ResultGenerator.genSuccessResult(resultMap);
        } else if ("9".equals(monitorType)) {
            HealthUrinalysisRecords urQuery = new HealthUrinalysisRecords();
            BeanUtils.copyProperties(param, urQuery);
            Map<String, Object> resultMap = healthUrinalysisRecordsService.monitorUrinalysis(urQuery);
            return ResultGenerator.genSuccessResult(resultMap);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 血压检测统计查询
     * @param healthBloodPressure
     * @return
     */
    @PostMapping("/queryBloodPressureDetectionStatistics")
    @ApiOperation(value = "血压检测统计查询", notes = "血压检测统计查询", httpMethod = "POST")
    public Result<BloodDetectionVo> queryBloodPressureDetectionStatistics(@RequestBody(required = false) HealthBloodPressure healthBloodPressure) {
        BloodDetectionVo bloodPressureDetectionVo = healthBloodPressureService.queryBloodPressureDetectionStatistics(healthBloodPressure);
        return ResultGenerator.genSuccessResult(bloodPressureDetectionVo);
    }

    /**
     * 近七天血压正常/异常统计（按天分组）
     * @return
     */
    @PostMapping("/queryWeeklyBloodPressureStats")
    @ApiOperation(value = "近七天血压正常异常统计", notes = "近七天分组统计血压正常和异常数量", httpMethod = "POST")
    public Result<List<BloodWeeklyStatVo>> queryWeeklyBloodPressureStats() {
        List<BloodWeeklyStatVo> list = healthBloodPressureService.queryWeeklyBloodPressureStats();
        return ResultGenerator.genSuccessResult(list);
    }
}


