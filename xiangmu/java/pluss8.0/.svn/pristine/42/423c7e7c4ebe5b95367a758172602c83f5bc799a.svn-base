package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthInterventions;
import cn.pluss.platform.service.healthInterventions.HealthInterventionsService;
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
@RequestMapping("/healthInterventions")
@Api(value = "HealthInterventions控制类",tags={"HealthInterventions接口"})
public class HealthInterventionsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthInterventionsService healthInterventionsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthInterventions>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthInterventions> healthInterventionsList = healthInterventionsService.queryPage(map);
        Integer count= healthInterventionsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthInterventions>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthInterventionsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthInterventions
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthInterventions>> queryList(@RequestBody HealthInterventions healthInterventions) {
        List<HealthInterventions> healthInterventionsList = healthInterventionsService.queryList(healthInterventions);
        return ResultGenerator.genSuccessResult(healthInterventionsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthInterventions 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthInterventions> queryOne(@RequestBody HealthInterventions healthInterventions) {
        return ResultGenerator.genSuccessResult(healthInterventionsService.queryOne(healthInterventions));
    }

    /**
    * 保存数据
    * @param healthInterventions
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthInterventions healthInterventions) {
        //Date currentDt = new Date();
        if (healthInterventions.getId() != null && healthInterventions.getId().longValue() > 0) {
            //healthInterventions.setUpdatedDt(currentDt);
            healthInterventionsService.update(healthInterventions);
        } else {
            //healthInterventions.setCreatedDt(currentDt);
            //healthInterventions.setUpdatedDt(currentDt);
            healthInterventionsService.insert(healthInterventions);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthInterventions 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthInterventions> add(@RequestBody HealthInterventions healthInterventions) {
        //Date currentDt = new Date();
        //healthInterventions.setCreatedDt(currentDt);
        //healthInterventions.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthInterventionsService.insert(healthInterventions));
    }

    /**
    * 更新数据
    *
    * @param healthInterventions 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthInterventions> update(@RequestBody HealthInterventions healthInterventions) {
        return ResultGenerator.genSuccessResult(healthInterventionsService.update(healthInterventions));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthInterventions 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthInterventions healthInterventions) {
        return ResultGenerator.genSuccessResult(healthInterventionsService.deleteById(healthInterventions.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthInterventions> insertList) {
        return ResultGenerator.genSuccessResult(healthInterventionsService.saveHealthInterventionsBatch(insertList));
    }

}


