package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthTongueDiagnosisReport;
import cn.pluss.platform.service.healthTongueDiagnosisReport.HealthTongueDiagnosisReportService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;



@RestController
@RequestMapping("/healthTongueDiagnosisReport")
@Api(value = "HealthTongueDiagnosisReport控制类",tags={"HealthTongueDiagnosisReport接口"})
public class HealthTongueDiagnosisReportController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthTongueDiagnosisReportService healthTongueDiagnosisReportService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthTongueDiagnosisReport>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthTongueDiagnosisReport> healthTongueDiagnosisReportList = healthTongueDiagnosisReportService.queryPage(map);
        Integer count= healthTongueDiagnosisReportService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthTongueDiagnosisReport>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthTongueDiagnosisReportList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthTongueDiagnosisReport
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthTongueDiagnosisReport>> queryList(@RequestBody HealthTongueDiagnosisReport healthTongueDiagnosisReport) {
        List<HealthTongueDiagnosisReport> healthTongueDiagnosisReportList = healthTongueDiagnosisReportService.queryList(healthTongueDiagnosisReport);
        return ResultGenerator.genSuccessResult(healthTongueDiagnosisReportList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthTongueDiagnosisReport 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthTongueDiagnosisReport> queryOne(@RequestBody HealthTongueDiagnosisReport healthTongueDiagnosisReport) {
        return ResultGenerator.genSuccessResult(healthTongueDiagnosisReportService.queryOne(healthTongueDiagnosisReport));
    }

    /**
    * 保存数据
    * @param healthTongueDiagnosisReport
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthTongueDiagnosisReport healthTongueDiagnosisReport) {
        //Date currentDt = new Date();
        if (healthTongueDiagnosisReport.getId() != null && healthTongueDiagnosisReport.getId().longValue() > 0) {
            //healthTongueDiagnosisReport.setUpdatedDt(currentDt);
            healthTongueDiagnosisReportService.update(healthTongueDiagnosisReport);
        } else {
            //healthTongueDiagnosisReport.setCreatedDt(currentDt);
            //healthTongueDiagnosisReport.setUpdatedDt(currentDt);
            healthTongueDiagnosisReportService.insert(healthTongueDiagnosisReport);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthTongueDiagnosisReport 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthTongueDiagnosisReport> add(@RequestBody HealthTongueDiagnosisReport healthTongueDiagnosisReport) {
        //Date currentDt = new Date();
        //healthTongueDiagnosisReport.setCreatedDt(currentDt);
        //healthTongueDiagnosisReport.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthTongueDiagnosisReportService.insert(healthTongueDiagnosisReport));
    }

    /**
    * 更新数据
    *
    * @param healthTongueDiagnosisReport 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthTongueDiagnosisReport> update(@RequestBody HealthTongueDiagnosisReport healthTongueDiagnosisReport) {
        return ResultGenerator.genSuccessResult(healthTongueDiagnosisReportService.update(healthTongueDiagnosisReport));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthTongueDiagnosisReport 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthTongueDiagnosisReport healthTongueDiagnosisReport) {
        return ResultGenerator.genSuccessResult(healthTongueDiagnosisReportService.deleteById(healthTongueDiagnosisReport.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthTongueDiagnosisReport> insertList) {
        return ResultGenerator.genSuccessResult(healthTongueDiagnosisReportService.saveHealthTongueDiagnosisReportBatch(insertList));
    }

}


