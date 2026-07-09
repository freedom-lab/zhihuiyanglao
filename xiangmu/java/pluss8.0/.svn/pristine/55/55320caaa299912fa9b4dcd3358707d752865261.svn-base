package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthBloodKetone;
import cn.pluss.platform.service.healthBloodKetone.HealthBloodKetoneService;
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
@RequestMapping("/healthBloodKetone")
@Api(value = "HealthBloodKetone控制类",tags={"HealthBloodKetone接口"})
public class HealthBloodKetoneController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthBloodKetoneService healthBloodKetoneService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthBloodKetone>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthBloodKetone> healthBloodKetoneList = healthBloodKetoneService.queryPage(map);
        Integer count= healthBloodKetoneService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthBloodKetone>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthBloodKetoneList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthBloodKetone
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthBloodKetone>> queryList(@RequestBody HealthBloodKetone healthBloodKetone) {
        List<HealthBloodKetone> healthBloodKetoneList = healthBloodKetoneService.queryList(healthBloodKetone);
        return ResultGenerator.genSuccessResult(healthBloodKetoneList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthBloodKetone 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthBloodKetone> queryOne(@RequestBody HealthBloodKetone healthBloodKetone) {
        return ResultGenerator.genSuccessResult(healthBloodKetoneService.queryOne(healthBloodKetone));
    }

    /**
    * 保存数据
    * @param healthBloodKetone
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthBloodKetone healthBloodKetone) {
        //Date currentDt = new Date();
        if (healthBloodKetone.getId() != null && healthBloodKetone.getId().longValue() > 0) {
            //healthBloodKetone.setUpdatedDt(currentDt);
            healthBloodKetoneService.update(healthBloodKetone);
        } else {
            //healthBloodKetone.setCreatedDt(currentDt);
            //healthBloodKetone.setUpdatedDt(currentDt);
            healthBloodKetoneService.insert(healthBloodKetone);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthBloodKetone 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthBloodKetone> add(@RequestBody HealthBloodKetone healthBloodKetone) {
        //Date currentDt = new Date();
        //healthBloodKetone.setCreatedDt(currentDt);
        //healthBloodKetone.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthBloodKetoneService.insert(healthBloodKetone));
    }

    /**
    * 更新数据
    *
    * @param healthBloodKetone 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthBloodKetone> update(@RequestBody HealthBloodKetone healthBloodKetone) {
        return ResultGenerator.genSuccessResult(healthBloodKetoneService.update(healthBloodKetone));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthBloodKetone 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthBloodKetone healthBloodKetone) {
        return ResultGenerator.genSuccessResult(healthBloodKetoneService.deleteById(healthBloodKetone.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthBloodKetone> insertList) {
        return ResultGenerator.genSuccessResult(healthBloodKetoneService.saveHealthBloodKetoneBatch(insertList));
    }

}


