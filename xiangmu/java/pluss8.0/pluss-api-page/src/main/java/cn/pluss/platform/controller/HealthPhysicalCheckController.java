package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthPhysicalCheck;
import cn.pluss.platform.service.healthPhysicalCheck.HealthPhysicalCheckService;
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
@RequestMapping("/healthPhysicalCheck")
@Api(value = "HealthPhysicalCheck控制类",tags={"HealthPhysicalCheck接口"})
public class HealthPhysicalCheckController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthPhysicalCheckService healthPhysicalCheckService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthPhysicalCheck>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthPhysicalCheck> healthPhysicalCheckList = healthPhysicalCheckService.queryPage(map);
        Integer count= healthPhysicalCheckService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthPhysicalCheck>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthPhysicalCheckList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthPhysicalCheck
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthPhysicalCheck>> queryList(@RequestBody HealthPhysicalCheck healthPhysicalCheck) {
        List<HealthPhysicalCheck> healthPhysicalCheckList = healthPhysicalCheckService.queryList(healthPhysicalCheck);
        return ResultGenerator.genSuccessResult(healthPhysicalCheckList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthPhysicalCheck 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthPhysicalCheck> queryOne(@RequestBody HealthPhysicalCheck healthPhysicalCheck) {
        return ResultGenerator.genSuccessResult(healthPhysicalCheckService.queryOne(healthPhysicalCheck));
    }

    /**
    * 保存数据
    * @param healthPhysicalCheck
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthPhysicalCheck healthPhysicalCheck) {
        //Date currentDt = new Date();
        if (healthPhysicalCheck.getId() != null && healthPhysicalCheck.getId().longValue() > 0) {
            //healthPhysicalCheck.setUpdatedDt(currentDt);
            healthPhysicalCheckService.update(healthPhysicalCheck);
        } else {
            //healthPhysicalCheck.setCreatedDt(currentDt);
            //healthPhysicalCheck.setUpdatedDt(currentDt);
            healthPhysicalCheckService.insert(healthPhysicalCheck);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthPhysicalCheck 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthPhysicalCheck> add(@RequestBody HealthPhysicalCheck healthPhysicalCheck) {
        //Date currentDt = new Date();
        //healthPhysicalCheck.setCreatedDt(currentDt);
        //healthPhysicalCheck.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthPhysicalCheckService.insert(healthPhysicalCheck));
    }

    /**
    * 更新数据
    *
    * @param healthPhysicalCheck 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthPhysicalCheck> update(@RequestBody HealthPhysicalCheck healthPhysicalCheck) {
        return ResultGenerator.genSuccessResult(healthPhysicalCheckService.update(healthPhysicalCheck));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthPhysicalCheck 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthPhysicalCheck healthPhysicalCheck) {
        return ResultGenerator.genSuccessResult(healthPhysicalCheckService.deleteById(healthPhysicalCheck.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthPhysicalCheck> insertList) {
        return ResultGenerator.genSuccessResult(healthPhysicalCheckService.saveHealthPhysicalCheckBatch(insertList));
    }

}


