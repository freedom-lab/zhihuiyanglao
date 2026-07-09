package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.SmartAlarmRemindSet;
import cn.pluss.platform.service.smartAlarmRemindSet.SmartAlarmRemindSetService;
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
@RequestMapping("/smartAlarmRemindSet")
@Api(value = "SmartAlarmRemindSet控制类",tags={"SmartAlarmRemindSet接口"})
public class SmartAlarmRemindSetController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private SmartAlarmRemindSetService smartAlarmRemindSetService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<SmartAlarmRemindSet>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<SmartAlarmRemindSet> smartAlarmRemindSetList = smartAlarmRemindSetService.queryPage(map);
        Integer count= smartAlarmRemindSetService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<SmartAlarmRemindSet>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), smartAlarmRemindSetList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param smartAlarmRemindSet
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<SmartAlarmRemindSet>> queryList(@RequestBody SmartAlarmRemindSet smartAlarmRemindSet) {
        List<SmartAlarmRemindSet> smartAlarmRemindSetList = smartAlarmRemindSetService.queryList(smartAlarmRemindSet);
        return ResultGenerator.genSuccessResult(smartAlarmRemindSetList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param smartAlarmRemindSet 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<SmartAlarmRemindSet> queryOne(@RequestBody SmartAlarmRemindSet smartAlarmRemindSet) {
        return ResultGenerator.genSuccessResult(smartAlarmRemindSetService.queryOne(smartAlarmRemindSet));
    }

    /**
    * 保存数据
    * @param smartAlarmRemindSet
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody SmartAlarmRemindSet smartAlarmRemindSet) {
        //Date currentDt = new Date();
        if (smartAlarmRemindSet.getId() != null && smartAlarmRemindSet.getId().longValue() > 0) {
            //smartAlarmRemindSet.setUpdatedDt(currentDt);
            smartAlarmRemindSetService.update(smartAlarmRemindSet);
        } else {
            //smartAlarmRemindSet.setCreatedDt(currentDt);
            //smartAlarmRemindSet.setUpdatedDt(currentDt);
            smartAlarmRemindSetService.insert(smartAlarmRemindSet);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param smartAlarmRemindSet 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<SmartAlarmRemindSet> add(@RequestBody SmartAlarmRemindSet smartAlarmRemindSet) {
        //Date currentDt = new Date();
        //smartAlarmRemindSet.setCreatedDt(currentDt);
        //smartAlarmRemindSet.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(smartAlarmRemindSetService.insert(smartAlarmRemindSet));
    }

    /**
    * 更新数据
    *
    * @param smartAlarmRemindSet 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<SmartAlarmRemindSet> update(@RequestBody SmartAlarmRemindSet smartAlarmRemindSet) {
        return ResultGenerator.genSuccessResult(smartAlarmRemindSetService.update(smartAlarmRemindSet));
    }

    /**
    * 通过主键删除数据
    *
    * @param smartAlarmRemindSet 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody SmartAlarmRemindSet smartAlarmRemindSet) {
        return ResultGenerator.genSuccessResult(smartAlarmRemindSetService.deleteById(smartAlarmRemindSet.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<SmartAlarmRemindSet> insertList) {
        return ResultGenerator.genSuccessResult(smartAlarmRemindSetService.saveSmartAlarmRemindSetBatch(insertList));
    }

}


