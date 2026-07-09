package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthEcgRecords;
import cn.pluss.platform.service.healthEcgRecords.HealthEcgRecordsService;
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
@RequestMapping("/healthEcgRecords")
@Api(value = "HealthEcgRecords控制类",tags={"HealthEcgRecords接口"})
public class HealthEcgRecordsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthEcgRecordsService healthEcgRecordsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthEcgRecords>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthEcgRecords> healthEcgRecordsList = healthEcgRecordsService.queryPage(map);
        Integer count= healthEcgRecordsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthEcgRecords>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthEcgRecordsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthEcgRecords
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthEcgRecords>> queryList(@RequestBody HealthEcgRecords healthEcgRecords) {
        List<HealthEcgRecords> healthEcgRecordsList = healthEcgRecordsService.queryList(healthEcgRecords);
        return ResultGenerator.genSuccessResult(healthEcgRecordsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthEcgRecords 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthEcgRecords> queryOne(@RequestBody HealthEcgRecords healthEcgRecords) {
        return ResultGenerator.genSuccessResult(healthEcgRecordsService.queryOne(healthEcgRecords));
    }

    /**
    * 保存数据
    * @param healthEcgRecords
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthEcgRecords healthEcgRecords) {
        //Date currentDt = new Date();
        if (healthEcgRecords.getId() != null && healthEcgRecords.getId().longValue() > 0) {
            //healthEcgRecords.setUpdatedDt(currentDt);
            healthEcgRecordsService.update(healthEcgRecords);
        } else {
            //healthEcgRecords.setCreatedDt(currentDt);
            //healthEcgRecords.setUpdatedDt(currentDt);
            healthEcgRecordsService.insert(healthEcgRecords);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthEcgRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthEcgRecords> add(@RequestBody HealthEcgRecords healthEcgRecords) {
        //Date currentDt = new Date();
        //healthEcgRecords.setCreatedDt(currentDt);
        //healthEcgRecords.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthEcgRecordsService.insert(healthEcgRecords));
    }

    /**
    * 更新数据
    *
    * @param healthEcgRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthEcgRecords> update(@RequestBody HealthEcgRecords healthEcgRecords) {
        return ResultGenerator.genSuccessResult(healthEcgRecordsService.update(healthEcgRecords));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthEcgRecords 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthEcgRecords healthEcgRecords) {
        return ResultGenerator.genSuccessResult(healthEcgRecordsService.deleteById(healthEcgRecords.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthEcgRecords> insertList) {
        return ResultGenerator.genSuccessResult(healthEcgRecordsService.saveHealthEcgRecordsBatch(insertList));
    }

}


