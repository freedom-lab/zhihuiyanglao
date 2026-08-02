package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsCanteenPlanSetting;
import cn.pluss.platform.service.insCanteenPlanSetting.InsCanteenPlanSettingService;
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
@RequestMapping("/insCanteenPlanSetting")
@Api(value = "InsCanteenPlanSetting控制类",tags={"InsCanteenPlanSetting接口"})
public class InsCanteenPlanSettingController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsCanteenPlanSettingService insCanteenPlanSettingService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsCanteenPlanSetting>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsCanteenPlanSetting> insCanteenPlanSettingList = insCanteenPlanSettingService.queryPage(map);
        Integer count= insCanteenPlanSettingService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsCanteenPlanSetting>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insCanteenPlanSettingList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenPlanSetting
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsCanteenPlanSetting>> queryList(@RequestBody InsCanteenPlanSetting insCanteenPlanSetting) {
        List<InsCanteenPlanSetting> insCanteenPlanSettingList = insCanteenPlanSettingService.queryList(insCanteenPlanSetting);
        return ResultGenerator.genSuccessResult(insCanteenPlanSettingList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insCanteenPlanSetting 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsCanteenPlanSetting> queryOne(@RequestBody InsCanteenPlanSetting insCanteenPlanSetting) {
        return ResultGenerator.genSuccessResult(insCanteenPlanSettingService.queryOne(insCanteenPlanSetting));
    }

    /**
    * 保存数据
    * @param insCanteenPlanSetting
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsCanteenPlanSetting insCanteenPlanSetting) {
        //Date currentDt = new Date();
        if (insCanteenPlanSetting.getId() != null && insCanteenPlanSetting.getId().longValue() > 0) {
            //insCanteenPlanSetting.setUpdatedDt(currentDt);
            insCanteenPlanSettingService.update(insCanteenPlanSetting);
        } else {
            //insCanteenPlanSetting.setCreatedDt(currentDt);
            //insCanteenPlanSetting.setUpdatedDt(currentDt);
            insCanteenPlanSettingService.insert(insCanteenPlanSetting);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insCanteenPlanSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsCanteenPlanSetting> add(@RequestBody InsCanteenPlanSetting insCanteenPlanSetting) {
        //Date currentDt = new Date();
        //insCanteenPlanSetting.setCreatedDt(currentDt);
        //insCanteenPlanSetting.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insCanteenPlanSettingService.insert(insCanteenPlanSetting));
    }

    /**
    * 更新数据
    *
    * @param insCanteenPlanSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsCanteenPlanSetting> update(@RequestBody InsCanteenPlanSetting insCanteenPlanSetting) {
        return ResultGenerator.genSuccessResult(insCanteenPlanSettingService.update(insCanteenPlanSetting));
    }

    /**
    * 通过主键删除数据
    *
    * @param insCanteenPlanSetting 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsCanteenPlanSetting insCanteenPlanSetting) {
        return ResultGenerator.genSuccessResult(insCanteenPlanSettingService.deleteById(insCanteenPlanSetting.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsCanteenPlanSetting> insertList) {
        return ResultGenerator.genSuccessResult(insCanteenPlanSettingService.saveInsCanteenPlanSettingBatch(insertList));
    }

}


