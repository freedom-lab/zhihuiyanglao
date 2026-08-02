package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthVisitRecords;
import cn.pluss.platform.service.healthVisitRecords.HealthVisitRecordsService;
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
@RequestMapping("/healthVisitRecords")
@Api(value = "HealthVisitRecords控制类",tags={"HealthVisitRecords接口"})
public class HealthVisitRecordsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthVisitRecordsService healthVisitRecordsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthVisitRecords>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthVisitRecords> healthVisitRecordsList = healthVisitRecordsService.queryPage(map);
        Integer count= healthVisitRecordsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthVisitRecords>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthVisitRecordsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthVisitRecords
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthVisitRecords>> queryList(@RequestBody HealthVisitRecords healthVisitRecords) {
        List<HealthVisitRecords> healthVisitRecordsList = healthVisitRecordsService.queryList(healthVisitRecords);
        return ResultGenerator.genSuccessResult(healthVisitRecordsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthVisitRecords 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthVisitRecords> queryOne(@RequestBody HealthVisitRecords healthVisitRecords) {
        return ResultGenerator.genSuccessResult(healthVisitRecordsService.queryOne(healthVisitRecords));
    }

    /**
    * 保存数据
    * @param healthVisitRecords
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthVisitRecords healthVisitRecords) {
        //Date currentDt = new Date();
        if (healthVisitRecords.getId() != null && healthVisitRecords.getId().longValue() > 0) {
            //healthVisitRecords.setUpdatedDt(currentDt);
            healthVisitRecordsService.update(healthVisitRecords);
        } else {
            //healthVisitRecords.setCreatedDt(currentDt);
            //healthVisitRecords.setUpdatedDt(currentDt);
            healthVisitRecordsService.insert(healthVisitRecords);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthVisitRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthVisitRecords> add(@RequestBody HealthVisitRecords healthVisitRecords) {
        //Date currentDt = new Date();
        //healthVisitRecords.setCreatedDt(currentDt);
        //healthVisitRecords.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthVisitRecordsService.insert(healthVisitRecords));
    }

    /**
    * 更新数据
    *
    * @param healthVisitRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthVisitRecords> update(@RequestBody HealthVisitRecords healthVisitRecords) {
        return ResultGenerator.genSuccessResult(healthVisitRecordsService.update(healthVisitRecords));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthVisitRecords 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthVisitRecords healthVisitRecords) {
        return ResultGenerator.genSuccessResult(healthVisitRecordsService.deleteById(healthVisitRecords.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthVisitRecords> insertList) {
        return ResultGenerator.genSuccessResult(healthVisitRecordsService.saveHealthVisitRecordsBatch(insertList));
    }

}


