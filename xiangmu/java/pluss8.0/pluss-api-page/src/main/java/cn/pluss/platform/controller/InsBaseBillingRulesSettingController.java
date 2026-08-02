package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsBaseBillingRulesSetting;
import cn.pluss.platform.service.insBaseBillingRulesSetting.InsBaseBillingRulesSettingService;
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
@RequestMapping("/insBaseBillingRulesSetting")
@Api(value = "InsBaseBillingRulesSetting控制类",tags={"InsBaseBillingRulesSetting接口"})
public class InsBaseBillingRulesSettingController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsBaseBillingRulesSettingService insBaseBillingRulesSettingService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsBaseBillingRulesSetting>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsBaseBillingRulesSetting> insBaseBillingRulesSettingList = insBaseBillingRulesSettingService.queryPage(map);
        Integer count= insBaseBillingRulesSettingService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsBaseBillingRulesSetting>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insBaseBillingRulesSettingList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insBaseBillingRulesSetting
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsBaseBillingRulesSetting>> queryList(@RequestBody InsBaseBillingRulesSetting insBaseBillingRulesSetting) {
        List<InsBaseBillingRulesSetting> insBaseBillingRulesSettingList = insBaseBillingRulesSettingService.queryList(insBaseBillingRulesSetting);
        return ResultGenerator.genSuccessResult(insBaseBillingRulesSettingList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insBaseBillingRulesSetting 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsBaseBillingRulesSetting> queryOne(@RequestBody InsBaseBillingRulesSetting insBaseBillingRulesSetting) {
        return ResultGenerator.genSuccessResult(insBaseBillingRulesSettingService.queryOne(insBaseBillingRulesSetting));
    }

    /**
    * 保存数据
    * @param insBaseBillingRulesSetting
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsBaseBillingRulesSetting insBaseBillingRulesSetting) {
        //Date currentDt = new Date();
        if (insBaseBillingRulesSetting.getId() != null && insBaseBillingRulesSetting.getId().longValue() > 0) {
            //insBaseBillingRulesSetting.setUpdatedDt(currentDt);
            insBaseBillingRulesSettingService.update(insBaseBillingRulesSetting);
        } else {
            //insBaseBillingRulesSetting.setCreatedDt(currentDt);
            //insBaseBillingRulesSetting.setUpdatedDt(currentDt);
            insBaseBillingRulesSettingService.insert(insBaseBillingRulesSetting);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insBaseBillingRulesSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsBaseBillingRulesSetting> add(@RequestBody InsBaseBillingRulesSetting insBaseBillingRulesSetting) {
        //Date currentDt = new Date();
        //insBaseBillingRulesSetting.setCreatedDt(currentDt);
        //insBaseBillingRulesSetting.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insBaseBillingRulesSettingService.insert(insBaseBillingRulesSetting));
    }

    /**
    * 更新数据
    *
    * @param insBaseBillingRulesSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsBaseBillingRulesSetting> update(@RequestBody InsBaseBillingRulesSetting insBaseBillingRulesSetting) {
        return ResultGenerator.genSuccessResult(insBaseBillingRulesSettingService.update(insBaseBillingRulesSetting));
    }

    /**
    * 通过主键删除数据
    *
    * @param insBaseBillingRulesSetting 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsBaseBillingRulesSetting insBaseBillingRulesSetting) {
        return ResultGenerator.genSuccessResult(insBaseBillingRulesSettingService.deleteById(insBaseBillingRulesSetting.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsBaseBillingRulesSetting> insertList) {
        return ResultGenerator.genSuccessResult(insBaseBillingRulesSettingService.saveInsBaseBillingRulesSettingBatch(insertList));
    }

}


