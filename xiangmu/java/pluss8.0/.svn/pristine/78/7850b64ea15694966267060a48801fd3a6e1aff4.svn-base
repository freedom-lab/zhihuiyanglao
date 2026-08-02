package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsBaseLeaveRefundSetting;
import cn.pluss.platform.service.insBaseLeaveRefundSetting.InsBaseLeaveRefundSettingService;
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
@RequestMapping("/insBaseLeaveRefundSetting")
@Api(value = "InsBaseLeaveRefundSetting控制类",tags={"InsBaseLeaveRefundSetting接口"})
public class InsBaseLeaveRefundSettingController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsBaseLeaveRefundSettingService insBaseLeaveRefundSettingService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsBaseLeaveRefundSetting>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsBaseLeaveRefundSetting> insBaseLeaveRefundSettingList = insBaseLeaveRefundSettingService.queryPage(map);
        Integer count= insBaseLeaveRefundSettingService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsBaseLeaveRefundSetting>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insBaseLeaveRefundSettingList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insBaseLeaveRefundSetting
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsBaseLeaveRefundSetting>> queryList(@RequestBody InsBaseLeaveRefundSetting insBaseLeaveRefundSetting) {
        List<InsBaseLeaveRefundSetting> insBaseLeaveRefundSettingList = insBaseLeaveRefundSettingService.queryList(insBaseLeaveRefundSetting);
        return ResultGenerator.genSuccessResult(insBaseLeaveRefundSettingList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insBaseLeaveRefundSetting 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsBaseLeaveRefundSetting> queryOne(@RequestBody InsBaseLeaveRefundSetting insBaseLeaveRefundSetting) {
        return ResultGenerator.genSuccessResult(insBaseLeaveRefundSettingService.queryOne(insBaseLeaveRefundSetting));
    }

    /**
    * 保存数据
    * @param insBaseLeaveRefundSetting
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsBaseLeaveRefundSetting insBaseLeaveRefundSetting) {
        //Date currentDt = new Date();
        if (insBaseLeaveRefundSetting.getId() != null && insBaseLeaveRefundSetting.getId().longValue() > 0) {
            //insBaseLeaveRefundSetting.setUpdatedDt(currentDt);
            insBaseLeaveRefundSettingService.update(insBaseLeaveRefundSetting);
        } else {
            //insBaseLeaveRefundSetting.setCreatedDt(currentDt);
            //insBaseLeaveRefundSetting.setUpdatedDt(currentDt);
            insBaseLeaveRefundSettingService.insert(insBaseLeaveRefundSetting);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insBaseLeaveRefundSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsBaseLeaveRefundSetting> add(@RequestBody InsBaseLeaveRefundSetting insBaseLeaveRefundSetting) {
        //Date currentDt = new Date();
        //insBaseLeaveRefundSetting.setCreatedDt(currentDt);
        //insBaseLeaveRefundSetting.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insBaseLeaveRefundSettingService.insert(insBaseLeaveRefundSetting));
    }

    /**
    * 更新数据
    *
    * @param insBaseLeaveRefundSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsBaseLeaveRefundSetting> update(@RequestBody InsBaseLeaveRefundSetting insBaseLeaveRefundSetting) {
        return ResultGenerator.genSuccessResult(insBaseLeaveRefundSettingService.update(insBaseLeaveRefundSetting));
    }

    /**
    * 通过主键删除数据
    *
    * @param insBaseLeaveRefundSetting 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsBaseLeaveRefundSetting insBaseLeaveRefundSetting) {
        return ResultGenerator.genSuccessResult(insBaseLeaveRefundSettingService.deleteById(insBaseLeaveRefundSetting.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsBaseLeaveRefundSetting> insertList) {
        return ResultGenerator.genSuccessResult(insBaseLeaveRefundSettingService.saveInsBaseLeaveRefundSettingBatch(insertList));
    }

}


