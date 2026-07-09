package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingRehabSetting;
import cn.pluss.platform.service.insNursingRehabSetting.InsNursingRehabSettingService;
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
@RequestMapping("/insNursingRehabSetting")
@Api(value = "InsNursingRehabSetting控制类",tags={"InsNursingRehabSetting接口"})
public class InsNursingRehabSettingController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingRehabSettingService insNursingRehabSettingService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingRehabSetting>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingRehabSetting> insNursingRehabSettingList = insNursingRehabSettingService.queryPage(map);
        Integer count= insNursingRehabSettingService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingRehabSetting>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingRehabSettingList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRehabSetting
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingRehabSetting>> queryList(@RequestBody InsNursingRehabSetting insNursingRehabSetting) {
        List<InsNursingRehabSetting> insNursingRehabSettingList = insNursingRehabSettingService.queryList(insNursingRehabSetting);
        return ResultGenerator.genSuccessResult(insNursingRehabSettingList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingRehabSetting 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingRehabSetting> queryOne(@RequestBody InsNursingRehabSetting insNursingRehabSetting) {
        return ResultGenerator.genSuccessResult(insNursingRehabSettingService.queryOne(insNursingRehabSetting));
    }

    /**
    * 保存数据
    * @param insNursingRehabSetting
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingRehabSetting insNursingRehabSetting) {
        //Date currentDt = new Date();
        if (insNursingRehabSetting.getId() != null && insNursingRehabSetting.getId().longValue() > 0) {
            //insNursingRehabSetting.setUpdatedDt(currentDt);
            insNursingRehabSettingService.update(insNursingRehabSetting);
        } else {
            //insNursingRehabSetting.setCreatedDt(currentDt);
            //insNursingRehabSetting.setUpdatedDt(currentDt);
            insNursingRehabSettingService.insert(insNursingRehabSetting);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingRehabSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingRehabSetting> add(@RequestBody InsNursingRehabSetting insNursingRehabSetting) {
        //Date currentDt = new Date();
        //insNursingRehabSetting.setCreatedDt(currentDt);
        //insNursingRehabSetting.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingRehabSettingService.insert(insNursingRehabSetting));
    }

    /**
    * 更新数据
    *
    * @param insNursingRehabSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingRehabSetting> update(@RequestBody InsNursingRehabSetting insNursingRehabSetting) {
        return ResultGenerator.genSuccessResult(insNursingRehabSettingService.update(insNursingRehabSetting));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingRehabSetting 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingRehabSetting insNursingRehabSetting) {
        return ResultGenerator.genSuccessResult(insNursingRehabSettingService.deleteById(insNursingRehabSetting.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingRehabSetting> insertList) {
        return ResultGenerator.genSuccessResult(insNursingRehabSettingService.saveInsNursingRehabSettingBatch(insertList));
    }

}


