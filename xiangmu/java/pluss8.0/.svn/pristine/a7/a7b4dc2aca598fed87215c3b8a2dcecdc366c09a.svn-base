package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthSportRecords;
import cn.pluss.platform.service.healthSportRecords.HealthSportRecordsService;
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
@RequestMapping("/healthSportRecords")
@Api(value = "HealthSportRecords控制类",tags={"HealthSportRecords接口"})
public class HealthSportRecordsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthSportRecordsService healthSportRecordsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthSportRecords>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthSportRecords> healthSportRecordsList = healthSportRecordsService.queryPage(map);
        Integer count= healthSportRecordsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthSportRecords>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthSportRecordsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthSportRecords
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthSportRecords>> queryList(@RequestBody HealthSportRecords healthSportRecords) {
        List<HealthSportRecords> healthSportRecordsList = healthSportRecordsService.queryList(healthSportRecords);
        return ResultGenerator.genSuccessResult(healthSportRecordsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthSportRecords 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthSportRecords> queryOne(@RequestBody HealthSportRecords healthSportRecords) {
        return ResultGenerator.genSuccessResult(healthSportRecordsService.queryOne(healthSportRecords));
    }

    /**
    * 保存数据
    * @param healthSportRecords
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthSportRecords healthSportRecords) {
        //Date currentDt = new Date();
        if (healthSportRecords.getId() != null && healthSportRecords.getId().longValue() > 0) {
            //healthSportRecords.setUpdatedDt(currentDt);
            healthSportRecordsService.update(healthSportRecords);
        } else {
            //healthSportRecords.setCreatedDt(currentDt);
            //healthSportRecords.setUpdatedDt(currentDt);
            healthSportRecordsService.insert(healthSportRecords);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthSportRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthSportRecords> add(@RequestBody HealthSportRecords healthSportRecords) {
        //Date currentDt = new Date();
        //healthSportRecords.setCreatedDt(currentDt);
        //healthSportRecords.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthSportRecordsService.insert(healthSportRecords));
    }

    /**
    * 更新数据
    *
    * @param healthSportRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthSportRecords> update(@RequestBody HealthSportRecords healthSportRecords) {
        return ResultGenerator.genSuccessResult(healthSportRecordsService.update(healthSportRecords));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthSportRecords 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthSportRecords healthSportRecords) {
        return ResultGenerator.genSuccessResult(healthSportRecordsService.deleteById(healthSportRecords.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthSportRecords> insertList) {
        return ResultGenerator.genSuccessResult(healthSportRecordsService.saveHealthSportRecordsBatch(insertList));
    }

}


