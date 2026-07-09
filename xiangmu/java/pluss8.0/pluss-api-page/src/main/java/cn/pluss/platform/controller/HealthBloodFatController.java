package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthBloodFat;
import cn.pluss.platform.service.healthBloodFat.HealthBloodFatService;
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
@RequestMapping("/healthBloodFat")
@Api(value = "HealthBloodFat控制类",tags={"HealthBloodFat接口"})
public class HealthBloodFatController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthBloodFatService healthBloodFatService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthBloodFat>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthBloodFat> healthBloodFatList = healthBloodFatService.queryPage(map);
        Integer count= healthBloodFatService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthBloodFat>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthBloodFatList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthBloodFat
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthBloodFat>> queryList(@RequestBody HealthBloodFat healthBloodFat) {
        List<HealthBloodFat> healthBloodFatList = healthBloodFatService.queryList(healthBloodFat);
        return ResultGenerator.genSuccessResult(healthBloodFatList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthBloodFat 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthBloodFat> queryOne(@RequestBody HealthBloodFat healthBloodFat) {
        return ResultGenerator.genSuccessResult(healthBloodFatService.queryOne(healthBloodFat));
    }

    /**
    * 保存数据
    * @param healthBloodFat
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthBloodFat healthBloodFat) {
        //Date currentDt = new Date();
        if (healthBloodFat.getId() != null && healthBloodFat.getId().longValue() > 0) {
            //healthBloodFat.setUpdatedDt(currentDt);
            healthBloodFatService.update(healthBloodFat);
        } else {
            //healthBloodFat.setCreatedDt(currentDt);
            //healthBloodFat.setUpdatedDt(currentDt);
            healthBloodFatService.insert(healthBloodFat);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthBloodFat 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthBloodFat> add(@RequestBody HealthBloodFat healthBloodFat) {
        //Date currentDt = new Date();
        //healthBloodFat.setCreatedDt(currentDt);
        //healthBloodFat.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthBloodFatService.insert(healthBloodFat));
    }

    /**
    * 更新数据
    *
    * @param healthBloodFat 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthBloodFat> update(@RequestBody HealthBloodFat healthBloodFat) {
        return ResultGenerator.genSuccessResult(healthBloodFatService.update(healthBloodFat));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthBloodFat 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthBloodFat healthBloodFat) {
        return ResultGenerator.genSuccessResult(healthBloodFatService.deleteById(healthBloodFat.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthBloodFat> insertList) {
        return ResultGenerator.genSuccessResult(healthBloodFatService.saveHealthBloodFatBatch(insertList));
    }

}


