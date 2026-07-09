package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthArteriosclerosis;
import cn.pluss.platform.service.healthArteriosclerosis.HealthArteriosclerosisService;
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
@RequestMapping("/healthArteriosclerosis")
@Api(value = "HealthArteriosclerosis控制类",tags={"HealthArteriosclerosis接口"})
public class HealthArteriosclerosisController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthArteriosclerosisService healthArteriosclerosisService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthArteriosclerosis>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthArteriosclerosis> healthArteriosclerosisList = healthArteriosclerosisService.queryPage(map);
        Integer count= healthArteriosclerosisService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthArteriosclerosis>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthArteriosclerosisList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthArteriosclerosis
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthArteriosclerosis>> queryList(@RequestBody HealthArteriosclerosis healthArteriosclerosis) {
        List<HealthArteriosclerosis> healthArteriosclerosisList = healthArteriosclerosisService.queryList(healthArteriosclerosis);
        return ResultGenerator.genSuccessResult(healthArteriosclerosisList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthArteriosclerosis 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthArteriosclerosis> queryOne(@RequestBody HealthArteriosclerosis healthArteriosclerosis) {
        return ResultGenerator.genSuccessResult(healthArteriosclerosisService.queryOne(healthArteriosclerosis));
    }

    /**
    * 保存数据
    * @param healthArteriosclerosis
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthArteriosclerosis healthArteriosclerosis) {
        //Date currentDt = new Date();
        if (healthArteriosclerosis.getId() != null && healthArteriosclerosis.getId().longValue() > 0) {
            //healthArteriosclerosis.setUpdatedDt(currentDt);
            healthArteriosclerosisService.update(healthArteriosclerosis);
        } else {
            //healthArteriosclerosis.setCreatedDt(currentDt);
            //healthArteriosclerosis.setUpdatedDt(currentDt);
            healthArteriosclerosisService.insert(healthArteriosclerosis);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthArteriosclerosis 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthArteriosclerosis> add(@RequestBody HealthArteriosclerosis healthArteriosclerosis) {
        //Date currentDt = new Date();
        //healthArteriosclerosis.setCreatedDt(currentDt);
        //healthArteriosclerosis.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthArteriosclerosisService.insert(healthArteriosclerosis));
    }

    /**
    * 更新数据
    *
    * @param healthArteriosclerosis 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthArteriosclerosis> update(@RequestBody HealthArteriosclerosis healthArteriosclerosis) {
        return ResultGenerator.genSuccessResult(healthArteriosclerosisService.update(healthArteriosclerosis));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthArteriosclerosis 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthArteriosclerosis healthArteriosclerosis) {
        return ResultGenerator.genSuccessResult(healthArteriosclerosisService.deleteById(healthArteriosclerosis.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthArteriosclerosis> insertList) {
        return ResultGenerator.genSuccessResult(healthArteriosclerosisService.saveHealthArteriosclerosisBatch(insertList));
    }

}


