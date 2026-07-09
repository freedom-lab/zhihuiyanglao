package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthChronicDiseaseDict;
import cn.pluss.platform.service.healthChronicDiseaseDict.HealthChronicDiseaseDictService;
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
@RequestMapping("/healthChronicDiseaseDict")
@Api(value = "HealthChronicDiseaseDict控制类",tags={"HealthChronicDiseaseDict接口"})
public class HealthChronicDiseaseDictController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthChronicDiseaseDictService healthChronicDiseaseDictService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthChronicDiseaseDict>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthChronicDiseaseDict> healthChronicDiseaseDictList = healthChronicDiseaseDictService.queryPage(map);
        Integer count= healthChronicDiseaseDictService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthChronicDiseaseDict>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthChronicDiseaseDictList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthChronicDiseaseDict
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthChronicDiseaseDict>> queryList(@RequestBody HealthChronicDiseaseDict healthChronicDiseaseDict) {
        List<HealthChronicDiseaseDict> healthChronicDiseaseDictList = healthChronicDiseaseDictService.queryList(healthChronicDiseaseDict);
        return ResultGenerator.genSuccessResult(healthChronicDiseaseDictList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthChronicDiseaseDict 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthChronicDiseaseDict> queryOne(@RequestBody HealthChronicDiseaseDict healthChronicDiseaseDict) {
        return ResultGenerator.genSuccessResult(healthChronicDiseaseDictService.queryOne(healthChronicDiseaseDict));
    }

    /**
    * 保存数据
    * @param healthChronicDiseaseDict
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthChronicDiseaseDict healthChronicDiseaseDict) {
        //Date currentDt = new Date();
        if (healthChronicDiseaseDict.getId() != null && healthChronicDiseaseDict.getId().longValue() > 0) {
            //healthChronicDiseaseDict.setUpdatedDt(currentDt);
            healthChronicDiseaseDictService.update(healthChronicDiseaseDict);
        } else {
            //healthChronicDiseaseDict.setCreatedDt(currentDt);
            //healthChronicDiseaseDict.setUpdatedDt(currentDt);
            healthChronicDiseaseDictService.insert(healthChronicDiseaseDict);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthChronicDiseaseDict 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthChronicDiseaseDict> add(@RequestBody HealthChronicDiseaseDict healthChronicDiseaseDict) {
        //Date currentDt = new Date();
        //healthChronicDiseaseDict.setCreatedDt(currentDt);
        //healthChronicDiseaseDict.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthChronicDiseaseDictService.insert(healthChronicDiseaseDict));
    }

    /**
    * 更新数据
    *
    * @param healthChronicDiseaseDict 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthChronicDiseaseDict> update(@RequestBody HealthChronicDiseaseDict healthChronicDiseaseDict) {
        return ResultGenerator.genSuccessResult(healthChronicDiseaseDictService.update(healthChronicDiseaseDict));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthChronicDiseaseDict 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthChronicDiseaseDict healthChronicDiseaseDict) {
        return ResultGenerator.genSuccessResult(healthChronicDiseaseDictService.deleteById(healthChronicDiseaseDict.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthChronicDiseaseDict> insertList) {
        return ResultGenerator.genSuccessResult(healthChronicDiseaseDictService.saveHealthChronicDiseaseDictBatch(insertList));
    }

}


