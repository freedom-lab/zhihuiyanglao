package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthBasicsRecords;
import cn.pluss.platform.service.healthBasicsRecords.HealthBasicsRecordsService;
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
@RequestMapping("/healthBasicsRecords")
@Api(value = "HealthBasicsRecords控制类",tags={"HealthBasicsRecords接口"})
public class HealthBasicsRecordsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthBasicsRecordsService healthBasicsRecordsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthBasicsRecords>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthBasicsRecords> healthBasicsRecordsList = healthBasicsRecordsService.queryPage(map);
        Integer count= healthBasicsRecordsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthBasicsRecords>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthBasicsRecordsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthBasicsRecords
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthBasicsRecords>> queryList(@RequestBody HealthBasicsRecords healthBasicsRecords) {
        List<HealthBasicsRecords> healthBasicsRecordsList = healthBasicsRecordsService.queryList(healthBasicsRecords);
        return ResultGenerator.genSuccessResult(healthBasicsRecordsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthBasicsRecords 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthBasicsRecords> queryOne(@RequestBody HealthBasicsRecords healthBasicsRecords) {
        return ResultGenerator.genSuccessResult(healthBasicsRecordsService.queryOne(healthBasicsRecords));
    }

    /**
    * 保存数据
    * @param healthBasicsRecords
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthBasicsRecords healthBasicsRecords) {
        //Date currentDt = new Date();
        if (healthBasicsRecords.getId() != null && healthBasicsRecords.getId().longValue() > 0) {
            //healthBasicsRecords.setUpdatedDt(currentDt);
            healthBasicsRecordsService.update(healthBasicsRecords);
        } else {
            //healthBasicsRecords.setCreatedDt(currentDt);
            //healthBasicsRecords.setUpdatedDt(currentDt);
            healthBasicsRecordsService.insert(healthBasicsRecords);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthBasicsRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthBasicsRecords> add(@RequestBody HealthBasicsRecords healthBasicsRecords) {
        //Date currentDt = new Date();
        //healthBasicsRecords.setCreatedDt(currentDt);
        //healthBasicsRecords.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthBasicsRecordsService.insert(healthBasicsRecords));
    }

    /**
    * 更新数据
    *
    * @param healthBasicsRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthBasicsRecords> update(@RequestBody HealthBasicsRecords healthBasicsRecords) {
        return ResultGenerator.genSuccessResult(healthBasicsRecordsService.update(healthBasicsRecords));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthBasicsRecords 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthBasicsRecords healthBasicsRecords) {
        return ResultGenerator.genSuccessResult(healthBasicsRecordsService.deleteById(healthBasicsRecords.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthBasicsRecords> insertList) {
        return ResultGenerator.genSuccessResult(healthBasicsRecordsService.saveHealthBasicsRecordsBatch(insertList));
    }

}


