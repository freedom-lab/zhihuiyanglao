package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CareNursingPlanSetting;
import cn.pluss.platform.service.careNursingPlanSetting.CareNursingPlanSettingService;
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
@RequestMapping("/careNursingPlanSetting")
@Api(value = "CareNursingPlanSetting控制类",tags={"CareNursingPlanSetting接口"})
public class CareNursingPlanSettingController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CareNursingPlanSettingService careNursingPlanSettingService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CareNursingPlanSetting>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CareNursingPlanSetting> careNursingPlanSettingList = careNursingPlanSettingService.queryPage(map);
        Integer count= careNursingPlanSettingService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CareNursingPlanSetting>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), careNursingPlanSettingList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param careNursingPlanSetting
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CareNursingPlanSetting>> queryList(@RequestBody CareNursingPlanSetting careNursingPlanSetting) {
        List<CareNursingPlanSetting> careNursingPlanSettingList = careNursingPlanSettingService.queryList(careNursingPlanSetting);
        return ResultGenerator.genSuccessResult(careNursingPlanSettingList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param careNursingPlanSetting 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CareNursingPlanSetting> queryOne(@RequestBody CareNursingPlanSetting careNursingPlanSetting) {
        return ResultGenerator.genSuccessResult(careNursingPlanSettingService.queryOne(careNursingPlanSetting));
    }

    /**
    * 保存数据
    * @param careNursingPlanSetting
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CareNursingPlanSetting careNursingPlanSetting) {
        //Date currentDt = new Date();
        if (careNursingPlanSetting.getId() != null && careNursingPlanSetting.getId().longValue() > 0) {
            //careNursingPlanSetting.setUpdatedDt(currentDt);
            careNursingPlanSettingService.update(careNursingPlanSetting);
        } else {
            //careNursingPlanSetting.setCreatedDt(currentDt);
            //careNursingPlanSetting.setUpdatedDt(currentDt);
            careNursingPlanSettingService.insert(careNursingPlanSetting);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param careNursingPlanSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CareNursingPlanSetting> add(@RequestBody CareNursingPlanSetting careNursingPlanSetting) {
        //Date currentDt = new Date();
        //careNursingPlanSetting.setCreatedDt(currentDt);
        //careNursingPlanSetting.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(careNursingPlanSettingService.insert(careNursingPlanSetting));
    }

    /**
    * 更新数据
    *
    * @param careNursingPlanSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CareNursingPlanSetting> update(@RequestBody CareNursingPlanSetting careNursingPlanSetting) {
        return ResultGenerator.genSuccessResult(careNursingPlanSettingService.update(careNursingPlanSetting));
    }

    /**
    * 通过主键删除数据
    *
    * @param careNursingPlanSetting 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CareNursingPlanSetting careNursingPlanSetting) {
        return ResultGenerator.genSuccessResult(careNursingPlanSettingService.deleteById(careNursingPlanSetting.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CareNursingPlanSetting> insertList) {
        return ResultGenerator.genSuccessResult(careNursingPlanSettingService.saveCareNursingPlanSettingBatch(insertList));
    }

}


