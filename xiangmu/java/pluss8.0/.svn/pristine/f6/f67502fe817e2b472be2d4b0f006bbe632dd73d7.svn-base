package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthDiseaseRecords;
import cn.pluss.platform.service.healthDiseaseRecords.HealthDiseaseRecordsService;
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
@RequestMapping("/healthDiseaseRecords")
@Api(value = "HealthDiseaseRecords控制类",tags={"HealthDiseaseRecords接口"})
public class HealthDiseaseRecordsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthDiseaseRecordsService healthDiseaseRecordsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthDiseaseRecords>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthDiseaseRecords> healthDiseaseRecordsList = healthDiseaseRecordsService.queryPage(map);
        Integer count= healthDiseaseRecordsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthDiseaseRecords>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthDiseaseRecordsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthDiseaseRecords
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthDiseaseRecords>> queryList(@RequestBody HealthDiseaseRecords healthDiseaseRecords) {
        List<HealthDiseaseRecords> healthDiseaseRecordsList = healthDiseaseRecordsService.queryList(healthDiseaseRecords);
        return ResultGenerator.genSuccessResult(healthDiseaseRecordsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthDiseaseRecords 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthDiseaseRecords> queryOne(@RequestBody HealthDiseaseRecords healthDiseaseRecords) {
        return ResultGenerator.genSuccessResult(healthDiseaseRecordsService.queryOne(healthDiseaseRecords));
    }

    /**
    * 保存数据
    * @param healthDiseaseRecords
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthDiseaseRecords healthDiseaseRecords) {
        //Date currentDt = new Date();
        if (healthDiseaseRecords.getId() != null && healthDiseaseRecords.getId().longValue() > 0) {
            //healthDiseaseRecords.setUpdatedDt(currentDt);
            healthDiseaseRecordsService.update(healthDiseaseRecords);
        } else {
            //healthDiseaseRecords.setCreatedDt(currentDt);
            //healthDiseaseRecords.setUpdatedDt(currentDt);
            healthDiseaseRecordsService.insert(healthDiseaseRecords);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthDiseaseRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthDiseaseRecords> add(@RequestBody HealthDiseaseRecords healthDiseaseRecords) {
        //Date currentDt = new Date();
        //healthDiseaseRecords.setCreatedDt(currentDt);
        //healthDiseaseRecords.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthDiseaseRecordsService.insert(healthDiseaseRecords));
    }

    /**
    * 更新数据
    *
    * @param healthDiseaseRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthDiseaseRecords> update(@RequestBody HealthDiseaseRecords healthDiseaseRecords) {
        return ResultGenerator.genSuccessResult(healthDiseaseRecordsService.update(healthDiseaseRecords));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthDiseaseRecords 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthDiseaseRecords healthDiseaseRecords) {
        return ResultGenerator.genSuccessResult(healthDiseaseRecordsService.deleteById(healthDiseaseRecords.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthDiseaseRecords> insertList) {
        return ResultGenerator.genSuccessResult(healthDiseaseRecordsService.saveHealthDiseaseRecordsBatch(insertList));
    }

}


