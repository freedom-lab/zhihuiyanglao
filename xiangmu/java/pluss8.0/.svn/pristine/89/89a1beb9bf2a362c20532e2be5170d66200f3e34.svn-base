package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthLungBreathing;
import cn.pluss.platform.service.healthLungBreathing.HealthLungBreathingService;
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
@RequestMapping("/healthLungBreathing")
@Api(value = "HealthLungBreathing控制类",tags={"HealthLungBreathing接口"})
public class HealthLungBreathingController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthLungBreathingService healthLungBreathingService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthLungBreathing>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthLungBreathing> healthLungBreathingList = healthLungBreathingService.queryPage(map);
        Integer count= healthLungBreathingService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthLungBreathing>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthLungBreathingList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthLungBreathing
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthLungBreathing>> queryList(@RequestBody HealthLungBreathing healthLungBreathing) {
        List<HealthLungBreathing> healthLungBreathingList = healthLungBreathingService.queryList(healthLungBreathing);
        return ResultGenerator.genSuccessResult(healthLungBreathingList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthLungBreathing 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthLungBreathing> queryOne(@RequestBody HealthLungBreathing healthLungBreathing) {
        return ResultGenerator.genSuccessResult(healthLungBreathingService.queryOne(healthLungBreathing));
    }

    /**
    * 保存数据
    * @param healthLungBreathing
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthLungBreathing healthLungBreathing) {
        //Date currentDt = new Date();
        if (healthLungBreathing.getId() != null && healthLungBreathing.getId().longValue() > 0) {
            //healthLungBreathing.setUpdatedDt(currentDt);
            healthLungBreathingService.update(healthLungBreathing);
        } else {
            //healthLungBreathing.setCreatedDt(currentDt);
            //healthLungBreathing.setUpdatedDt(currentDt);
            healthLungBreathingService.insert(healthLungBreathing);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthLungBreathing 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthLungBreathing> add(@RequestBody HealthLungBreathing healthLungBreathing) {
        //Date currentDt = new Date();
        //healthLungBreathing.setCreatedDt(currentDt);
        //healthLungBreathing.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthLungBreathingService.insert(healthLungBreathing));
    }

    /**
    * 更新数据
    *
    * @param healthLungBreathing 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthLungBreathing> update(@RequestBody HealthLungBreathing healthLungBreathing) {
        return ResultGenerator.genSuccessResult(healthLungBreathingService.update(healthLungBreathing));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthLungBreathing 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthLungBreathing healthLungBreathing) {
        return ResultGenerator.genSuccessResult(healthLungBreathingService.deleteById(healthLungBreathing.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthLungBreathing> insertList) {
        return ResultGenerator.genSuccessResult(healthLungBreathingService.saveHealthLungBreathingBatch(insertList));
    }

}


