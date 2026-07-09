package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthInterventionsTemple;
import cn.pluss.platform.service.healthInterventionsTemple.HealthInterventionsTempleService;
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
@RequestMapping("/healthInterventionsTemple")
@Api(value = "HealthInterventionsTemple控制类",tags={"HealthInterventionsTemple接口"})
public class HealthInterventionsTempleController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthInterventionsTempleService healthInterventionsTempleService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthInterventionsTemple>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthInterventionsTemple> healthInterventionsTempleList = healthInterventionsTempleService.queryPage(map);
        Integer count= healthInterventionsTempleService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthInterventionsTemple>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthInterventionsTempleList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthInterventionsTemple
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthInterventionsTemple>> queryList(@RequestBody HealthInterventionsTemple healthInterventionsTemple) {
        List<HealthInterventionsTemple> healthInterventionsTempleList = healthInterventionsTempleService.queryList(healthInterventionsTemple);
        return ResultGenerator.genSuccessResult(healthInterventionsTempleList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthInterventionsTemple 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthInterventionsTemple> queryOne(@RequestBody HealthInterventionsTemple healthInterventionsTemple) {
        return ResultGenerator.genSuccessResult(healthInterventionsTempleService.queryOne(healthInterventionsTemple));
    }

    /**
    * 保存数据
    * @param healthInterventionsTemple
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthInterventionsTemple healthInterventionsTemple) {
        //Date currentDt = new Date();
        if (healthInterventionsTemple.getId() != null && healthInterventionsTemple.getId().longValue() > 0) {
            //healthInterventionsTemple.setUpdatedDt(currentDt);
            healthInterventionsTempleService.update(healthInterventionsTemple);
        } else {
            //healthInterventionsTemple.setCreatedDt(currentDt);
            //healthInterventionsTemple.setUpdatedDt(currentDt);
            healthInterventionsTempleService.insert(healthInterventionsTemple);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthInterventionsTemple 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthInterventionsTemple> add(@RequestBody HealthInterventionsTemple healthInterventionsTemple) {
        //Date currentDt = new Date();
        //healthInterventionsTemple.setCreatedDt(currentDt);
        //healthInterventionsTemple.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthInterventionsTempleService.insert(healthInterventionsTemple));
    }

    /**
    * 更新数据
    *
    * @param healthInterventionsTemple 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthInterventionsTemple> update(@RequestBody HealthInterventionsTemple healthInterventionsTemple) {
        return ResultGenerator.genSuccessResult(healthInterventionsTempleService.update(healthInterventionsTemple));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthInterventionsTemple 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthInterventionsTemple healthInterventionsTemple) {
        return ResultGenerator.genSuccessResult(healthInterventionsTempleService.deleteById(healthInterventionsTemple.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthInterventionsTemple> insertList) {
        return ResultGenerator.genSuccessResult(healthInterventionsTempleService.saveHealthInterventionsTempleBatch(insertList));
    }

}


