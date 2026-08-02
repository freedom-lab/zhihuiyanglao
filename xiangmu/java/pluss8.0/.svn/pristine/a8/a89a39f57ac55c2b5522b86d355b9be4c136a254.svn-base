package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingExecutionRecord;
import cn.pluss.platform.service.insNursingExecutionRecord.InsNursingExecutionRecordService;
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
@RequestMapping("/insNursingExecutionRecord")
@Api(value = "InsNursingExecutionRecord控制类",tags={"InsNursingExecutionRecord接口"})
public class InsNursingExecutionRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingExecutionRecordService insNursingExecutionRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingExecutionRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingExecutionRecord> insNursingExecutionRecordList = insNursingExecutionRecordService.queryPage(map);
        Integer count= insNursingExecutionRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingExecutionRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingExecutionRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingExecutionRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingExecutionRecord>> queryList(@RequestBody InsNursingExecutionRecord insNursingExecutionRecord) {
        List<InsNursingExecutionRecord> insNursingExecutionRecordList = insNursingExecutionRecordService.queryList(insNursingExecutionRecord);
        return ResultGenerator.genSuccessResult(insNursingExecutionRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingExecutionRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingExecutionRecord> queryOne(@RequestBody InsNursingExecutionRecord insNursingExecutionRecord) {
        return ResultGenerator.genSuccessResult(insNursingExecutionRecordService.queryOne(insNursingExecutionRecord));
    }

    /**
    * 保存数据
    * @param insNursingExecutionRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingExecutionRecord insNursingExecutionRecord) {
        //Date currentDt = new Date();
        if (insNursingExecutionRecord.getId() != null && insNursingExecutionRecord.getId().longValue() > 0) {
            //insNursingExecutionRecord.setUpdatedDt(currentDt);
            insNursingExecutionRecordService.update(insNursingExecutionRecord);
        } else {
            //insNursingExecutionRecord.setCreatedDt(currentDt);
            //insNursingExecutionRecord.setUpdatedDt(currentDt);
            insNursingExecutionRecordService.insert(insNursingExecutionRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingExecutionRecord> add(@RequestBody InsNursingExecutionRecord insNursingExecutionRecord) {
        //Date currentDt = new Date();
        //insNursingExecutionRecord.setCreatedDt(currentDt);
        //insNursingExecutionRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingExecutionRecordService.insert(insNursingExecutionRecord));
    }

    /**
    * 更新数据
    *
    * @param insNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingExecutionRecord> update(@RequestBody InsNursingExecutionRecord insNursingExecutionRecord) {
        return ResultGenerator.genSuccessResult(insNursingExecutionRecordService.update(insNursingExecutionRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingExecutionRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingExecutionRecord insNursingExecutionRecord) {
        return ResultGenerator.genSuccessResult(insNursingExecutionRecordService.deleteById(insNursingExecutionRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingExecutionRecord> insertList) {
        return ResultGenerator.genSuccessResult(insNursingExecutionRecordService.saveInsNursingExecutionRecordBatch(insertList));
    }

}


