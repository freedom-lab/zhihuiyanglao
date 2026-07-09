package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.HealthChronicDiseaseArchive;
import cn.pluss.platform.service.healthChronicDiseaseArchive.HealthChronicDiseaseArchiveService;
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
@RequestMapping("/healthChronicDiseaseArchive")
@Api(value = "HealthChronicDiseaseArchive控制类",tags={"HealthChronicDiseaseArchive接口"})
public class HealthChronicDiseaseArchiveController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private HealthChronicDiseaseArchiveService healthChronicDiseaseArchiveService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<HealthChronicDiseaseArchive>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<HealthChronicDiseaseArchive> healthChronicDiseaseArchiveList = healthChronicDiseaseArchiveService.queryPage(map);
        Integer count= healthChronicDiseaseArchiveService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<HealthChronicDiseaseArchive>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), healthChronicDiseaseArchiveList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param healthChronicDiseaseArchive
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<HealthChronicDiseaseArchive>> queryList(@RequestBody HealthChronicDiseaseArchive healthChronicDiseaseArchive) {
        List<HealthChronicDiseaseArchive> healthChronicDiseaseArchiveList = healthChronicDiseaseArchiveService.queryList(healthChronicDiseaseArchive);
        return ResultGenerator.genSuccessResult(healthChronicDiseaseArchiveList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param healthChronicDiseaseArchive 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<HealthChronicDiseaseArchive> queryOne(@RequestBody HealthChronicDiseaseArchive healthChronicDiseaseArchive) {
        return ResultGenerator.genSuccessResult(healthChronicDiseaseArchiveService.queryOne(healthChronicDiseaseArchive));
    }

    /**
    * 保存数据
    * @param healthChronicDiseaseArchive
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody HealthChronicDiseaseArchive healthChronicDiseaseArchive) {
        //Date currentDt = new Date();
        if (healthChronicDiseaseArchive.getId() != null && healthChronicDiseaseArchive.getId().longValue() > 0) {
            //healthChronicDiseaseArchive.setUpdatedDt(currentDt);
            healthChronicDiseaseArchiveService.update(healthChronicDiseaseArchive);
        } else {
            //healthChronicDiseaseArchive.setCreatedDt(currentDt);
            //healthChronicDiseaseArchive.setUpdatedDt(currentDt);
            healthChronicDiseaseArchiveService.insert(healthChronicDiseaseArchive);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param healthChronicDiseaseArchive 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<HealthChronicDiseaseArchive> add(@RequestBody HealthChronicDiseaseArchive healthChronicDiseaseArchive) {
        //Date currentDt = new Date();
        //healthChronicDiseaseArchive.setCreatedDt(currentDt);
        //healthChronicDiseaseArchive.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(healthChronicDiseaseArchiveService.insert(healthChronicDiseaseArchive));
    }

    /**
    * 更新数据
    *
    * @param healthChronicDiseaseArchive 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<HealthChronicDiseaseArchive> update(@RequestBody HealthChronicDiseaseArchive healthChronicDiseaseArchive) {
        return ResultGenerator.genSuccessResult(healthChronicDiseaseArchiveService.update(healthChronicDiseaseArchive));
    }

    /**
    * 通过主键删除数据
    *
    * @param healthChronicDiseaseArchive 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody HealthChronicDiseaseArchive healthChronicDiseaseArchive) {
        return ResultGenerator.genSuccessResult(healthChronicDiseaseArchiveService.deleteById(healthChronicDiseaseArchive.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<HealthChronicDiseaseArchive> insertList) {
        return ResultGenerator.genSuccessResult(healthChronicDiseaseArchiveService.saveHealthChronicDiseaseArchiveBatch(insertList));
    }

}


