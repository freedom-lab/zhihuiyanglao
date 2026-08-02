package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthDiseaseEncyclopedia;
import cn.pluss.platform.service.healthDiseaseEncyclopedia.HealthDiseaseEncyclopediaService;
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
@RequestMapping("/healthDiseaseEncyclopedia")
@Api(value = "HealthDiseaseEncyclopedia控制类",tags={"HealthDiseaseEncyclopedia接口"})
public class HealthDiseaseEncyclopediaController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthDiseaseEncyclopediaService healthDiseaseEncyclopediaService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthDiseaseEncyclopedia>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthDiseaseEncyclopedia> healthDiseaseEncyclopediaList = healthDiseaseEncyclopediaService.queryPage(map);
        Integer count= healthDiseaseEncyclopediaService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthDiseaseEncyclopedia>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthDiseaseEncyclopediaList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthDiseaseEncyclopedia
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthDiseaseEncyclopedia>> queryList(@RequestBody HealthDiseaseEncyclopedia healthDiseaseEncyclopedia) {
        List<HealthDiseaseEncyclopedia> healthDiseaseEncyclopediaList = healthDiseaseEncyclopediaService.queryList(healthDiseaseEncyclopedia);
        return ResultGenerator.genSuccessResult(healthDiseaseEncyclopediaList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthDiseaseEncyclopedia 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthDiseaseEncyclopedia> queryOne(@RequestBody HealthDiseaseEncyclopedia healthDiseaseEncyclopedia) {
        return ResultGenerator.genSuccessResult(healthDiseaseEncyclopediaService.queryOne(healthDiseaseEncyclopedia));
    }

    /**
    * 保存数据
    * @param healthDiseaseEncyclopedia
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthDiseaseEncyclopedia healthDiseaseEncyclopedia) {
        //Date currentDt = new Date();
        if (healthDiseaseEncyclopedia.getId() != null && healthDiseaseEncyclopedia.getId().longValue() > 0) {
            //healthDiseaseEncyclopedia.setUpdatedDt(currentDt);
            healthDiseaseEncyclopediaService.update(healthDiseaseEncyclopedia);
        } else {
            //healthDiseaseEncyclopedia.setCreatedDt(currentDt);
            //healthDiseaseEncyclopedia.setUpdatedDt(currentDt);
            healthDiseaseEncyclopediaService.insert(healthDiseaseEncyclopedia);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthDiseaseEncyclopedia 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthDiseaseEncyclopedia> add(@RequestBody HealthDiseaseEncyclopedia healthDiseaseEncyclopedia) {
        //Date currentDt = new Date();
        //healthDiseaseEncyclopedia.setCreatedDt(currentDt);
        //healthDiseaseEncyclopedia.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthDiseaseEncyclopediaService.insert(healthDiseaseEncyclopedia));
    }

    /**
    * 更新数据
    *
    * @param healthDiseaseEncyclopedia 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthDiseaseEncyclopedia> update(@RequestBody HealthDiseaseEncyclopedia healthDiseaseEncyclopedia) {
        return ResultGenerator.genSuccessResult(healthDiseaseEncyclopediaService.update(healthDiseaseEncyclopedia));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthDiseaseEncyclopedia 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthDiseaseEncyclopedia healthDiseaseEncyclopedia) {
        return ResultGenerator.genSuccessResult(healthDiseaseEncyclopediaService.deleteById(healthDiseaseEncyclopedia.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthDiseaseEncyclopedia> insertList) {
        return ResultGenerator.genSuccessResult(healthDiseaseEncyclopediaService.saveHealthDiseaseEncyclopediaBatch(insertList));
    }

}


