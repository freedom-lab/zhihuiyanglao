package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsSchedulingTableSettings;
import cn.pluss.platform.service.insSchedulingTableSettings.InsSchedulingTableSettingsService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;



@RestController
@RequestMapping("/insSchedulingTableSettings")
@Api(value = "InsSchedulingTableSettings控制类",tags={"InsSchedulingTableSettings接口"})
public class InsSchedulingTableSettingsController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsSchedulingTableSettingsService insSchedulingTableSettingsService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsSchedulingTableSettings>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsSchedulingTableSettings> insSchedulingTableSettingsList = insSchedulingTableSettingsService.queryPage(map);
        Integer count= insSchedulingTableSettingsService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsSchedulingTableSettings>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insSchedulingTableSettingsList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insSchedulingTableSettings
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsSchedulingTableSettings>> queryList(@RequestBody InsSchedulingTableSettings insSchedulingTableSettings) {
        List<InsSchedulingTableSettings> insSchedulingTableSettingsList = insSchedulingTableSettingsService.queryList(insSchedulingTableSettings);
        return ResultGenerator.genSuccessResult(insSchedulingTableSettingsList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insSchedulingTableSettings 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsSchedulingTableSettings> queryOne(@RequestBody InsSchedulingTableSettings insSchedulingTableSettings) {
        return ResultGenerator.genSuccessResult(insSchedulingTableSettingsService.queryOne(insSchedulingTableSettings));
    }

    /**
    * 保存数据
    * @param insSchedulingTableSettings
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsSchedulingTableSettings insSchedulingTableSettings) {
        //Date currentDt = new Date();
        if (insSchedulingTableSettings.getId() != null && insSchedulingTableSettings.getId().longValue() > 0) {
            //insSchedulingTableSettings.setUpdatedDt(currentDt);
            insSchedulingTableSettingsService.update(insSchedulingTableSettings);
        } else {
            //insSchedulingTableSettings.setCreatedDt(currentDt);
            //insSchedulingTableSettings.setUpdatedDt(currentDt);
            insSchedulingTableSettingsService.insert(insSchedulingTableSettings);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insSchedulingTableSettings 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsSchedulingTableSettings> add(@RequestBody InsSchedulingTableSettings insSchedulingTableSettings) {
        //Date currentDt = new Date();
        //insSchedulingTableSettings.setCreatedDt(currentDt);
        //insSchedulingTableSettings.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insSchedulingTableSettingsService.insert(insSchedulingTableSettings));
    }

    /**
    * 更新数据
    *
    * @param insSchedulingTableSettings 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsSchedulingTableSettings> update(@RequestBody InsSchedulingTableSettings insSchedulingTableSettings) {
        return ResultGenerator.genSuccessResult(insSchedulingTableSettingsService.update(insSchedulingTableSettings));
    }

    /**
    * 通过主键删除数据
    *
    * @param insSchedulingTableSettings 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsSchedulingTableSettings insSchedulingTableSettings) {
        return ResultGenerator.genSuccessResult(insSchedulingTableSettingsService.deleteById(insSchedulingTableSettings.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsSchedulingTableSettings> insertList) {
        return ResultGenerator.genSuccessResult(insSchedulingTableSettingsService.saveInsSchedulingTableSettingsBatch(insertList));
    }

}


