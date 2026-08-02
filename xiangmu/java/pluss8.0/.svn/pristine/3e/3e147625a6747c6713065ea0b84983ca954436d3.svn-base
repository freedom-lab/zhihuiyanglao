package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthTemperatureRecords;
import cn.pluss.platform.service.healthTemperatureRecords.HealthTemperatureRecordsService;
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
@RequestMapping("/healthTemperatureRecords")
@Api(value = "HealthTemperatureRecords控制类",tags={"HealthTemperatureRecords接口"})
public class HealthTemperatureRecordsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthTemperatureRecordsService healthTemperatureRecordsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthTemperatureRecords>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthTemperatureRecords> healthTemperatureRecordsList = healthTemperatureRecordsService.queryPage(map);
        Integer count= healthTemperatureRecordsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthTemperatureRecords>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthTemperatureRecordsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthTemperatureRecords
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthTemperatureRecords>> queryList(@RequestBody HealthTemperatureRecords healthTemperatureRecords) {
        List<HealthTemperatureRecords> healthTemperatureRecordsList = healthTemperatureRecordsService.queryList(healthTemperatureRecords);
        return ResultGenerator.genSuccessResult(healthTemperatureRecordsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthTemperatureRecords 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthTemperatureRecords> queryOne(@RequestBody HealthTemperatureRecords healthTemperatureRecords) {
        return ResultGenerator.genSuccessResult(healthTemperatureRecordsService.queryOne(healthTemperatureRecords));
    }

    /**
    * 保存数据
    * @param healthTemperatureRecords
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthTemperatureRecords healthTemperatureRecords) {
        //Date currentDt = new Date();
        if (healthTemperatureRecords.getId() != null && healthTemperatureRecords.getId().longValue() > 0) {
            //healthTemperatureRecords.setUpdatedDt(currentDt);
            healthTemperatureRecordsService.update(healthTemperatureRecords);
        } else {
            //healthTemperatureRecords.setCreatedDt(currentDt);
            //healthTemperatureRecords.setUpdatedDt(currentDt);
            healthTemperatureRecordsService.insert(healthTemperatureRecords);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthTemperatureRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthTemperatureRecords> add(@RequestBody HealthTemperatureRecords healthTemperatureRecords) {
        //Date currentDt = new Date();
        //healthTemperatureRecords.setCreatedDt(currentDt);
        //healthTemperatureRecords.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthTemperatureRecordsService.insert(healthTemperatureRecords));
    }

    /**
    * 更新数据
    *
    * @param healthTemperatureRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthTemperatureRecords> update(@RequestBody HealthTemperatureRecords healthTemperatureRecords) {
        return ResultGenerator.genSuccessResult(healthTemperatureRecordsService.update(healthTemperatureRecords));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthTemperatureRecords 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthTemperatureRecords healthTemperatureRecords) {
        return ResultGenerator.genSuccessResult(healthTemperatureRecordsService.deleteById(healthTemperatureRecords.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthTemperatureRecords> insertList) {
        return ResultGenerator.genSuccessResult(healthTemperatureRecordsService.saveHealthTemperatureRecordsBatch(insertList));
    }

}


