package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CareNursingExecutionRecord;
import cn.pluss.platform.service.careNursingExecutionRecord.CareNursingExecutionRecordService;
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
@RequestMapping("/careNursingExecutionRecord")
@Api(value = "CareNursingExecutionRecord控制类",tags={"CareNursingExecutionRecord接口"})
public class CareNursingExecutionRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CareNursingExecutionRecordService careNursingExecutionRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CareNursingExecutionRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CareNursingExecutionRecord> careNursingExecutionRecordList = careNursingExecutionRecordService.queryPage(map);
        Integer count= careNursingExecutionRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CareNursingExecutionRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), careNursingExecutionRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param careNursingExecutionRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CareNursingExecutionRecord>> queryList(@RequestBody CareNursingExecutionRecord careNursingExecutionRecord) {
        List<CareNursingExecutionRecord> careNursingExecutionRecordList = careNursingExecutionRecordService.queryList(careNursingExecutionRecord);
        return ResultGenerator.genSuccessResult(careNursingExecutionRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param careNursingExecutionRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CareNursingExecutionRecord> queryOne(@RequestBody CareNursingExecutionRecord careNursingExecutionRecord) {
        return ResultGenerator.genSuccessResult(careNursingExecutionRecordService.queryOne(careNursingExecutionRecord));
    }

    /**
    * 保存数据
    * @param careNursingExecutionRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CareNursingExecutionRecord careNursingExecutionRecord) {
        //Date currentDt = new Date();
        if (careNursingExecutionRecord.getId() != null && careNursingExecutionRecord.getId().longValue() > 0) {
            //careNursingExecutionRecord.setUpdatedDt(currentDt);
            careNursingExecutionRecordService.update(careNursingExecutionRecord);
        } else {
            //careNursingExecutionRecord.setCreatedDt(currentDt);
            //careNursingExecutionRecord.setUpdatedDt(currentDt);
            careNursingExecutionRecordService.insert(careNursingExecutionRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param careNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CareNursingExecutionRecord> add(@RequestBody CareNursingExecutionRecord careNursingExecutionRecord) {
        //Date currentDt = new Date();
        //careNursingExecutionRecord.setCreatedDt(currentDt);
        //careNursingExecutionRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(careNursingExecutionRecordService.insert(careNursingExecutionRecord));
    }

    /**
    * 更新数据
    *
    * @param careNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CareNursingExecutionRecord> update(@RequestBody CareNursingExecutionRecord careNursingExecutionRecord) {
        return ResultGenerator.genSuccessResult(careNursingExecutionRecordService.update(careNursingExecutionRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param careNursingExecutionRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CareNursingExecutionRecord careNursingExecutionRecord) {
        return ResultGenerator.genSuccessResult(careNursingExecutionRecordService.deleteById(careNursingExecutionRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CareNursingExecutionRecord> insertList) {
        return ResultGenerator.genSuccessResult(careNursingExecutionRecordService.saveCareNursingExecutionRecordBatch(insertList));
    }

}


