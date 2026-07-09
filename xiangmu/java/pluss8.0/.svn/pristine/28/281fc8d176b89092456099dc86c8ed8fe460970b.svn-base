package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthMedicineRecords;
import cn.pluss.platform.service.healthMedicineRecords.HealthMedicineRecordsService;
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
@RequestMapping("/healthMedicineRecords")
@Api(value = "HealthMedicineRecords控制类",tags={"HealthMedicineRecords接口"})
public class HealthMedicineRecordsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthMedicineRecordsService healthMedicineRecordsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthMedicineRecords>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthMedicineRecords> healthMedicineRecordsList = healthMedicineRecordsService.queryPage(map);
        Integer count= healthMedicineRecordsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthMedicineRecords>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthMedicineRecordsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthMedicineRecords
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthMedicineRecords>> queryList(@RequestBody HealthMedicineRecords healthMedicineRecords) {
        List<HealthMedicineRecords> healthMedicineRecordsList = healthMedicineRecordsService.queryList(healthMedicineRecords);
        return ResultGenerator.genSuccessResult(healthMedicineRecordsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthMedicineRecords 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthMedicineRecords> queryOne(@RequestBody HealthMedicineRecords healthMedicineRecords) {
        return ResultGenerator.genSuccessResult(healthMedicineRecordsService.queryOne(healthMedicineRecords));
    }

    /**
    * 保存数据
    * @param healthMedicineRecords
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthMedicineRecords healthMedicineRecords) {
        //Date currentDt = new Date();
        if (healthMedicineRecords.getId() != null && healthMedicineRecords.getId().longValue() > 0) {
            //healthMedicineRecords.setUpdatedDt(currentDt);
            healthMedicineRecordsService.update(healthMedicineRecords);
        } else {
            //healthMedicineRecords.setCreatedDt(currentDt);
            //healthMedicineRecords.setUpdatedDt(currentDt);
            healthMedicineRecordsService.insert(healthMedicineRecords);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthMedicineRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthMedicineRecords> add(@RequestBody HealthMedicineRecords healthMedicineRecords) {
        //Date currentDt = new Date();
        //healthMedicineRecords.setCreatedDt(currentDt);
        //healthMedicineRecords.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthMedicineRecordsService.insert(healthMedicineRecords));
    }

    /**
    * 更新数据
    *
    * @param healthMedicineRecords 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthMedicineRecords> update(@RequestBody HealthMedicineRecords healthMedicineRecords) {
        return ResultGenerator.genSuccessResult(healthMedicineRecordsService.update(healthMedicineRecords));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthMedicineRecords 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthMedicineRecords healthMedicineRecords) {
        return ResultGenerator.genSuccessResult(healthMedicineRecordsService.deleteById(healthMedicineRecords.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthMedicineRecords> insertList) {
        return ResultGenerator.genSuccessResult(healthMedicineRecordsService.saveHealthMedicineRecordsBatch(insertList));
    }

}


