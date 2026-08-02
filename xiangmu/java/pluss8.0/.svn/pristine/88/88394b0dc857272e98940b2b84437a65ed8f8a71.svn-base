package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthInterventionPlan;
import cn.pluss.platform.service.healthInterventionPlan.HealthInterventionPlanService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;



@RestController
@RequestMapping("/healthInterventionPlan")
@Api(value = "HealthInterventionPlan控制类",tags={"HealthInterventionPlan接口"})
public class HealthInterventionPlanController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthInterventionPlanService healthInterventionPlanService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthInterventionPlan>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthInterventionPlan> healthInterventionPlanList = healthInterventionPlanService.queryPage(map);
        Integer count= healthInterventionPlanService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthInterventionPlan>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthInterventionPlanList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthInterventionPlan
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthInterventionPlan>> queryList(@RequestBody HealthInterventionPlan healthInterventionPlan) {
        List<HealthInterventionPlan> healthInterventionPlanList = healthInterventionPlanService.queryList(healthInterventionPlan);
        return ResultGenerator.genSuccessResult(healthInterventionPlanList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthInterventionPlan 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthInterventionPlan> queryOne(@RequestBody HealthInterventionPlan healthInterventionPlan) {
        return ResultGenerator.genSuccessResult(healthInterventionPlanService.queryOne(healthInterventionPlan));
    }

    /**
    * 保存数据
    * @param healthInterventionPlan
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthInterventionPlan healthInterventionPlan) {
        //Date currentDt = new Date();
        if (healthInterventionPlan.getId() != null && healthInterventionPlan.getId().longValue() > 0) {
            //healthInterventionPlan.setUpdatedDt(currentDt);
            healthInterventionPlanService.update(healthInterventionPlan);
        } else {
            //healthInterventionPlan.setCreatedDt(currentDt);
            //healthInterventionPlan.setUpdatedDt(currentDt);
            healthInterventionPlanService.insert(healthInterventionPlan);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthInterventionPlan 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthInterventionPlan> add(@RequestBody HealthInterventionPlan healthInterventionPlan) {
        //Date currentDt = new Date();
        //healthInterventionPlan.setCreatedDt(currentDt);
        //healthInterventionPlan.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthInterventionPlanService.insert(healthInterventionPlan));
    }

    /**
    * 更新数据
    *
    * @param healthInterventionPlan 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthInterventionPlan> update(@RequestBody HealthInterventionPlan healthInterventionPlan) {
        return ResultGenerator.genSuccessResult(healthInterventionPlanService.update(healthInterventionPlan));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthInterventionPlan 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthInterventionPlan healthInterventionPlan) {
        return ResultGenerator.genSuccessResult(healthInterventionPlanService.deleteById(healthInterventionPlan.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthInterventionPlan> insertList) {
        return ResultGenerator.genSuccessResult(healthInterventionPlanService.saveHealthInterventionPlanBatch(insertList));
    }

}


