package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthBoneDensity;
import cn.pluss.platform.service.healthBoneDensity.HealthBoneDensityService;
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
@RequestMapping("/healthBoneDensity")
@Api(value = "HealthBoneDensity控制类",tags={"HealthBoneDensity接口"})
public class HealthBoneDensityController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthBoneDensityService healthBoneDensityService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthBoneDensity>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthBoneDensity> healthBoneDensityList = healthBoneDensityService.queryPage(map);
        Integer count= healthBoneDensityService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthBoneDensity>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthBoneDensityList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthBoneDensity
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthBoneDensity>> queryList(@RequestBody HealthBoneDensity healthBoneDensity) {
        List<HealthBoneDensity> healthBoneDensityList = healthBoneDensityService.queryList(healthBoneDensity);
        return ResultGenerator.genSuccessResult(healthBoneDensityList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthBoneDensity 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthBoneDensity> queryOne(@RequestBody HealthBoneDensity healthBoneDensity) {
        return ResultGenerator.genSuccessResult(healthBoneDensityService.queryOne(healthBoneDensity));
    }

    /**
    * 保存数据
    * @param healthBoneDensity
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthBoneDensity healthBoneDensity) {
        //Date currentDt = new Date();
        if (healthBoneDensity.getId() != null && healthBoneDensity.getId().longValue() > 0) {
            //healthBoneDensity.setUpdatedDt(currentDt);
            healthBoneDensityService.update(healthBoneDensity);
        } else {
            //healthBoneDensity.setCreatedDt(currentDt);
            //healthBoneDensity.setUpdatedDt(currentDt);
            healthBoneDensityService.insert(healthBoneDensity);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthBoneDensity 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthBoneDensity> add(@RequestBody HealthBoneDensity healthBoneDensity) {
        //Date currentDt = new Date();
        //healthBoneDensity.setCreatedDt(currentDt);
        //healthBoneDensity.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthBoneDensityService.insert(healthBoneDensity));
    }

    /**
    * 更新数据
    *
    * @param healthBoneDensity 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthBoneDensity> update(@RequestBody HealthBoneDensity healthBoneDensity) {
        return ResultGenerator.genSuccessResult(healthBoneDensityService.update(healthBoneDensity));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthBoneDensity 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthBoneDensity healthBoneDensity) {
        return ResultGenerator.genSuccessResult(healthBoneDensityService.deleteById(healthBoneDensity.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthBoneDensity> insertList) {
        return ResultGenerator.genSuccessResult(healthBoneDensityService.saveHealthBoneDensityBatch(insertList));
    }

}


