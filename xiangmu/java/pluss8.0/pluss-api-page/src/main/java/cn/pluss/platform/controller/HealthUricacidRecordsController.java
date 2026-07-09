package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthUricacidRecords;
import cn.pluss.platform.service.healthUricacidRecords.HealthUricacidRecordsService;
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
@RequestMapping("/healthUricacidRecords")
@Api(value = "HealthUricacidRecords控制类",tags={"HealthUricacidRecords接口"})
public class HealthUricacidRecordsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthUricacidRecordsService healthUricacidRecordsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthUricacidRecords>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthUricacidRecords> healthUricacidRecordsList = healthUricacidRecordsService.queryPage(map);
        Integer count= healthUricacidRecordsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthUricacidRecords>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthUricacidRecordsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthUricacidRecords
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthUricacidRecords>> queryList(@RequestBody HealthUricacidRecords healthUricacidRecords) {
        List<HealthUricacidRecords> healthUricacidRecordsList = healthUricacidRecordsService.queryList(healthUricacidRecords);
        return ResultGenerator.genSuccessResult(healthUricacidRecordsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthUricacidRecords 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthUricacidRecords> queryOne(@RequestBody HealthUricacidRecords healthUricacidRecords) {
        return ResultGenerator.genSuccessResult(healthUricacidRecordsService.queryOne(healthUricacidRecords));
    }

    /**
    * 保存数据
    * @param healthUricacidRecords
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthUricacidRecords healthUricacidRecords) {
        //Date currentDt = new Date();
        if (healthUricacidRecords.getId() != null && healthUricacidRecords.getId().longValue() > 0) {
            //healthUricacidRecords.setUpdatedDt(currentDt);
            healthUricacidRecordsService.update(healthUricacidRecords);
        } else {
            //healthUricacidRecords.setCreatedDt(currentDt);
            //healthUricacidRecords.setUpdatedDt(currentDt);
            healthUricacidRecordsService.insert(healthUricacidRecords);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthUricacidRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthUricacidRecords> add(@RequestBody HealthUricacidRecords healthUricacidRecords) {
        //Date currentDt = new Date();
        //healthUricacidRecords.setCreatedDt(currentDt);
        //healthUricacidRecords.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthUricacidRecordsService.insert(healthUricacidRecords));
    }

    /**
    * 更新数据
    *
    * @param healthUricacidRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthUricacidRecords> update(@RequestBody HealthUricacidRecords healthUricacidRecords) {
        return ResultGenerator.genSuccessResult(healthUricacidRecordsService.update(healthUricacidRecords));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthUricacidRecords 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthUricacidRecords healthUricacidRecords) {
        return ResultGenerator.genSuccessResult(healthUricacidRecordsService.deleteById(healthUricacidRecords.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthUricacidRecords> insertList) {
        return ResultGenerator.genSuccessResult(healthUricacidRecordsService.saveHealthUricacidRecordsBatch(insertList));
    }

}


