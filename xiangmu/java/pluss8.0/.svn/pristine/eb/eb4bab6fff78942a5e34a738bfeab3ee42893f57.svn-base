package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthEyesight;
import cn.pluss.platform.service.healthEyesight.HealthEyesightService;
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
@RequestMapping("/healthEyesight")
@Api(value = "HealthEyesight控制类",tags={"HealthEyesight接口"})
public class HealthEyesightController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthEyesightService healthEyesightService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthEyesight>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthEyesight> healthEyesightList = healthEyesightService.queryPage(map);
        Integer count= healthEyesightService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthEyesight>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthEyesightList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthEyesight
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthEyesight>> queryList(@RequestBody HealthEyesight healthEyesight) {
        List<HealthEyesight> healthEyesightList = healthEyesightService.queryList(healthEyesight);
        return ResultGenerator.genSuccessResult(healthEyesightList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthEyesight 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthEyesight> queryOne(@RequestBody HealthEyesight healthEyesight) {
        return ResultGenerator.genSuccessResult(healthEyesightService.queryOne(healthEyesight));
    }

    /**
    * 保存数据
    * @param healthEyesight
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthEyesight healthEyesight) {
        //Date currentDt = new Date();
        if (healthEyesight.getId() != null && healthEyesight.getId().longValue() > 0) {
            //healthEyesight.setUpdatedDt(currentDt);
            healthEyesightService.update(healthEyesight);
        } else {
            //healthEyesight.setCreatedDt(currentDt);
            //healthEyesight.setUpdatedDt(currentDt);
            healthEyesightService.insert(healthEyesight);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthEyesight 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthEyesight> add(@RequestBody HealthEyesight healthEyesight) {
        //Date currentDt = new Date();
        //healthEyesight.setCreatedDt(currentDt);
        //healthEyesight.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthEyesightService.insert(healthEyesight));
    }

    /**
    * 更新数据
    *
    * @param healthEyesight 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthEyesight> update(@RequestBody HealthEyesight healthEyesight) {
        return ResultGenerator.genSuccessResult(healthEyesightService.update(healthEyesight));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthEyesight 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthEyesight healthEyesight) {
        return ResultGenerator.genSuccessResult(healthEyesightService.deleteById(healthEyesight.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthEyesight> insertList) {
        return ResultGenerator.genSuccessResult(healthEyesightService.saveHealthEyesightBatch(insertList));
    }

}


