package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthUrinalysisRecords;
import cn.pluss.platform.service.healthUrinalysisRecords.HealthUrinalysisRecordsService;
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
@RequestMapping("/healthUrinalysisRecords")
@Api(value = "HealthUrinalysisRecords控制类",tags={"HealthUrinalysisRecords接口"})
public class HealthUrinalysisRecordsController{
    private Logger logger = Logger.getLogger(this.getClass());

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
    public Result<PageInfo<HealthUrinalysisRecords>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthUrinalysisRecords> healthUrinalysisRecordsList = healthUrinalysisRecordsService.queryPage(map);
        Integer count= healthUrinalysisRecordsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthUrinalysisRecords>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthUrinalysisRecordsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthUrinalysisRecords
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthUrinalysisRecords>> queryList(@RequestBody HealthUrinalysisRecords healthUrinalysisRecords) {
        List<HealthUrinalysisRecords> healthUrinalysisRecordsList = healthUrinalysisRecordsService.queryList(healthUrinalysisRecords);
        return ResultGenerator.genSuccessResult(healthUrinalysisRecordsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthUrinalysisRecords 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthUrinalysisRecords> queryOne(@RequestBody HealthUrinalysisRecords healthUrinalysisRecords) {
        return ResultGenerator.genSuccessResult(healthUrinalysisRecordsService.queryOne(healthUrinalysisRecords));
    }

    /**
    * 保存数据
    * @param healthUrinalysisRecords
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthUrinalysisRecords healthUrinalysisRecords) {
        //Date currentDt = new Date();
        if (healthUrinalysisRecords.getId() != null && healthUrinalysisRecords.getId().longValue() > 0) {
            //healthUrinalysisRecords.setUpdatedDt(currentDt);
            healthUrinalysisRecordsService.update(healthUrinalysisRecords);
        } else {
            //healthUrinalysisRecords.setCreatedDt(currentDt);
            //healthUrinalysisRecords.setUpdatedDt(currentDt);
            healthUrinalysisRecordsService.insert(healthUrinalysisRecords);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthUrinalysisRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthUrinalysisRecords> add(@RequestBody HealthUrinalysisRecords healthUrinalysisRecords) {
        //Date currentDt = new Date();
        //healthUrinalysisRecords.setCreatedDt(currentDt);
        //healthUrinalysisRecords.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthUrinalysisRecordsService.insert(healthUrinalysisRecords));
    }

    /**
    * 更新数据
    *
    * @param healthUrinalysisRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthUrinalysisRecords> update(@RequestBody HealthUrinalysisRecords healthUrinalysisRecords) {
        return ResultGenerator.genSuccessResult(healthUrinalysisRecordsService.update(healthUrinalysisRecords));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthUrinalysisRecords 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthUrinalysisRecords healthUrinalysisRecords) {
        return ResultGenerator.genSuccessResult(healthUrinalysisRecordsService.deleteById(healthUrinalysisRecords.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthUrinalysisRecords> insertList) {
        return ResultGenerator.genSuccessResult(healthUrinalysisRecordsService.saveHealthUrinalysisRecordsBatch(insertList));
    }

}


