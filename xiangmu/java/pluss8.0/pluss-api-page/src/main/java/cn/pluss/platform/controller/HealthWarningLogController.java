package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthWarningLog;
import cn.pluss.platform.service.healthWarningLog.HealthWarningLogService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/healthWarningLog")
@Api(value = "HealthWarningLog控制类",tags={"HealthWarningLog接口"})
public class HealthWarningLogController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthWarningLogService healthWarningLogService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthWarningLog>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthWarningLog> healthWarningLogList = healthWarningLogService.queryPage(map);
        Integer count= healthWarningLogService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthWarningLog>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthWarningLogList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthWarningLog
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthWarningLog>> queryList(@RequestBody HealthWarningLog healthWarningLog) {
        List<HealthWarningLog> healthWarningLogList = healthWarningLogService.queryList(healthWarningLog);
        return ResultGenerator.genSuccessResult(healthWarningLogList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthWarningLog 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthWarningLog> queryOne(@RequestBody HealthWarningLog healthWarningLog) {
        return ResultGenerator.genSuccessResult(healthWarningLogService.queryOne(healthWarningLog));
    }

    /**
    * 保存数据
    * @param healthWarningLog
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthWarningLog healthWarningLog) {
        //Date currentDt = new Date();
        if (healthWarningLog.getId() != null && healthWarningLog.getId().longValue() > 0) {
            //healthWarningLog.setUpdatedDt(currentDt);
            healthWarningLogService.update(healthWarningLog);
        } else {
            //healthWarningLog.setCreatedDt(currentDt);
            //healthWarningLog.setUpdatedDt(currentDt);
            healthWarningLogService.insert(healthWarningLog);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthWarningLog 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthWarningLog> add(@RequestBody HealthWarningLog healthWarningLog) {
        //Date currentDt = new Date();
        //healthWarningLog.setCreatedDt(currentDt);
        //healthWarningLog.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthWarningLogService.insert(healthWarningLog));
    }

    /**
    * 更新数据
    *
    * @param healthWarningLog 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthWarningLog> update(@RequestBody HealthWarningLog healthWarningLog) {
        return ResultGenerator.genSuccessResult(healthWarningLogService.update(healthWarningLog));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthWarningLog 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthWarningLog healthWarningLog) {
        return ResultGenerator.genSuccessResult(healthWarningLogService.deleteById(healthWarningLog.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthWarningLog> insertList) {
        return ResultGenerator.genSuccessResult(healthWarningLogService.saveHealthWarningLogBatch(insertList));
    }

}


