package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsSuddenEventSetting;
import cn.pluss.platform.service.insSuddenEventSetting.InsSuddenEventSettingService;
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
@RequestMapping("/insSuddenEventSetting")
@Api(value = "InsSuddenEventSetting控制类",tags={"InsSuddenEventSetting接口"})
public class InsSuddenEventSettingController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsSuddenEventSettingService insSuddenEventSettingService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsSuddenEventSetting>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsSuddenEventSetting> insSuddenEventSettingList = insSuddenEventSettingService.queryPage(map);
        Integer count= insSuddenEventSettingService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsSuddenEventSetting>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insSuddenEventSettingList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insSuddenEventSetting
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsSuddenEventSetting>> queryList(@RequestBody InsSuddenEventSetting insSuddenEventSetting) {
        List<InsSuddenEventSetting> insSuddenEventSettingList = insSuddenEventSettingService.queryList(insSuddenEventSetting);
        return ResultGenerator.genSuccessResult(insSuddenEventSettingList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insSuddenEventSetting 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsSuddenEventSetting> queryOne(@RequestBody InsSuddenEventSetting insSuddenEventSetting) {
        return ResultGenerator.genSuccessResult(insSuddenEventSettingService.queryOne(insSuddenEventSetting));
    }

    /**
    * 保存数据
    * @param insSuddenEventSetting
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsSuddenEventSetting insSuddenEventSetting) {
        //Date currentDt = new Date();
        if (insSuddenEventSetting.getId() != null && insSuddenEventSetting.getId().longValue() > 0) {
            //insSuddenEventSetting.setUpdatedDt(currentDt);
            insSuddenEventSettingService.update(insSuddenEventSetting);
        } else {
            //insSuddenEventSetting.setCreatedDt(currentDt);
            //insSuddenEventSetting.setUpdatedDt(currentDt);
            insSuddenEventSettingService.insert(insSuddenEventSetting);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insSuddenEventSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsSuddenEventSetting> add(@RequestBody InsSuddenEventSetting insSuddenEventSetting) {
        //Date currentDt = new Date();
        //insSuddenEventSetting.setCreatedDt(currentDt);
        //insSuddenEventSetting.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insSuddenEventSettingService.insert(insSuddenEventSetting));
    }

    /**
    * 更新数据
    *
    * @param insSuddenEventSetting 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsSuddenEventSetting> update(@RequestBody InsSuddenEventSetting insSuddenEventSetting) {
        return ResultGenerator.genSuccessResult(insSuddenEventSettingService.update(insSuddenEventSetting));
    }

    /**
    * 通过主键删除数据
    *
    * @param insSuddenEventSetting 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsSuddenEventSetting insSuddenEventSetting) {
        return ResultGenerator.genSuccessResult(insSuddenEventSettingService.deleteById(insSuddenEventSetting.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsSuddenEventSetting> insertList) {
        return ResultGenerator.genSuccessResult(insSuddenEventSettingService.saveInsSuddenEventSettingBatch(insertList));
    }

}


