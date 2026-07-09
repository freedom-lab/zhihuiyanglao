package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthBloodSugar;
import cn.pluss.platform.model.vo.BloodWeeklyStatVo;
import cn.pluss.platform.model.vo.SugarDetectionVo;
import cn.pluss.platform.service.healthBloodSugar.HealthBloodSugarService;
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
@RequestMapping("/healthBloodSugar")
@Api(value = "HealthBloodSugar控制类",tags={"HealthBloodSugar接口"})
public class HealthBloodSugarController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthBloodSugarService healthBloodSugarService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthBloodSugar>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthBloodSugar> healthBloodSugarList = healthBloodSugarService.queryPage(map);
        Integer count= healthBloodSugarService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthBloodSugar>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthBloodSugarList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthBloodSugar
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthBloodSugar>> queryList(@RequestBody HealthBloodSugar healthBloodSugar) {
        List<HealthBloodSugar> healthBloodSugarList = healthBloodSugarService.queryList(healthBloodSugar);
        return ResultGenerator.genSuccessResult(healthBloodSugarList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthBloodSugar 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthBloodSugar> queryOne(@RequestBody HealthBloodSugar healthBloodSugar) {
        return ResultGenerator.genSuccessResult(healthBloodSugarService.queryOne(healthBloodSugar));
    }

    /**
    * 保存数据
    * @param healthBloodSugar
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthBloodSugar healthBloodSugar) {
        //Date currentDt = new Date();
        if (healthBloodSugar.getId() != null && healthBloodSugar.getId().longValue() > 0) {
            //healthBloodSugar.setUpdatedDt(currentDt);
            healthBloodSugarService.update(healthBloodSugar);
        } else {
            //healthBloodSugar.setCreatedDt(currentDt);
            //healthBloodSugar.setUpdatedDt(currentDt);
            healthBloodSugarService.insert(healthBloodSugar);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthBloodSugar 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthBloodSugar> add(@RequestBody HealthBloodSugar healthBloodSugar) {
        //Date currentDt = new Date();
        //healthBloodSugar.setCreatedDt(currentDt);
        //healthBloodSugar.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthBloodSugarService.insert(healthBloodSugar));
    }

    /**
    * 更新数据
    *
    * @param healthBloodSugar 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthBloodSugar> update(@RequestBody HealthBloodSugar healthBloodSugar) {
        return ResultGenerator.genSuccessResult(healthBloodSugarService.update(healthBloodSugar));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthBloodSugar 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthBloodSugar healthBloodSugar) {
        return ResultGenerator.genSuccessResult(healthBloodSugarService.deleteById(healthBloodSugar.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthBloodSugar> insertList) {
        return ResultGenerator.genSuccessResult(healthBloodSugarService.saveHealthBloodSugarBatch(insertList));
    }

    /**
     * 血糖检测统计查询
     * @param healthBloodSugar
     * @return
     */
    @PostMapping("/queryBloodSugarDetectionStatistics")
    @ApiOperation(value = "血糖检测统计查询", notes = "血糖检测统计查询", httpMethod = "POST")
    public Result<SugarDetectionVo> queryBloodSugarDetectionStatistics(@RequestBody(required = false) HealthBloodSugar healthBloodSugar) {
        SugarDetectionVo sugarDetectionVo = healthBloodSugarService.queryBloodSugarDetectionStatistics(healthBloodSugar);
        return ResultGenerator.genSuccessResult(sugarDetectionVo);
    }

    /**
     * 近七天血糖正常/异常统计（按天分组）
     * @return
     */
    @PostMapping("/queryWeeklyBloodSugarStats")
    @ApiOperation(value = "近七天血糖正常异常统计", notes = "按近七天分组统计血糖正常和异常数量", httpMethod = "POST")
    public Result<List<BloodWeeklyStatVo>> queryWeeklyBloodSugarStats() {
        List<BloodWeeklyStatVo> list = healthBloodSugarService.queryWeeklyBloodSugarStats();
        return ResultGenerator.genSuccessResult(list);
    }

}


