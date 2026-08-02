package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthLungFunction;
import cn.pluss.platform.service.healthLungFunction.HealthLungFunctionService;
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
@RequestMapping("/healthLungFunction")
@Api(value = "HealthLungFunction控制类",tags={"HealthLungFunction接口"})
public class HealthLungFunctionController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthLungFunctionService healthLungFunctionService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthLungFunction>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthLungFunction> healthLungFunctionList = healthLungFunctionService.queryPage(map);
        Integer count= healthLungFunctionService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthLungFunction>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthLungFunctionList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthLungFunction
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthLungFunction>> queryList(@RequestBody HealthLungFunction healthLungFunction) {
        List<HealthLungFunction> healthLungFunctionList = healthLungFunctionService.queryList(healthLungFunction);
        return ResultGenerator.genSuccessResult(healthLungFunctionList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthLungFunction 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthLungFunction> queryOne(@RequestBody HealthLungFunction healthLungFunction) {
        return ResultGenerator.genSuccessResult(healthLungFunctionService.queryOne(healthLungFunction));
    }

    /**
    * 保存数据
    * @param healthLungFunction
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthLungFunction healthLungFunction) {
        //Date currentDt = new Date();
        if (healthLungFunction.getId() != null && healthLungFunction.getId().longValue() > 0) {
            //healthLungFunction.setUpdatedDt(currentDt);
            healthLungFunctionService.update(healthLungFunction);
        } else {
            //healthLungFunction.setCreatedDt(currentDt);
            //healthLungFunction.setUpdatedDt(currentDt);
            healthLungFunctionService.insert(healthLungFunction);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthLungFunction 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthLungFunction> add(@RequestBody HealthLungFunction healthLungFunction) {
        //Date currentDt = new Date();
        //healthLungFunction.setCreatedDt(currentDt);
        //healthLungFunction.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthLungFunctionService.insert(healthLungFunction));
    }

    /**
    * 更新数据
    *
    * @param healthLungFunction 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthLungFunction> update(@RequestBody HealthLungFunction healthLungFunction) {
        return ResultGenerator.genSuccessResult(healthLungFunctionService.update(healthLungFunction));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthLungFunction 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthLungFunction healthLungFunction) {
        return ResultGenerator.genSuccessResult(healthLungFunctionService.deleteById(healthLungFunction.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthLungFunction> insertList) {
        return ResultGenerator.genSuccessResult(healthLungFunctionService.saveHealthLungFunctionBatch(insertList));
    }

}


