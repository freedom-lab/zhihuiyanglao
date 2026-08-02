package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingRoomExecutionRecord;
import cn.pluss.platform.service.insNursingRoomExecutionRecord.InsNursingRoomExecutionRecordService;
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
@RequestMapping("/insNursingRoomExecutionRecord")
@Api(value = "InsNursingRoomExecutionRecord控制类",tags={"InsNursingRoomExecutionRecord接口"})
public class InsNursingRoomExecutionRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingRoomExecutionRecordService insNursingRoomExecutionRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingRoomExecutionRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingRoomExecutionRecord> insNursingRoomExecutionRecordList = insNursingRoomExecutionRecordService.queryPage(map);
        Integer count= insNursingRoomExecutionRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingRoomExecutionRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingRoomExecutionRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRoomExecutionRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingRoomExecutionRecord>> queryList(@RequestBody InsNursingRoomExecutionRecord insNursingRoomExecutionRecord) {
        List<InsNursingRoomExecutionRecord> insNursingRoomExecutionRecordList = insNursingRoomExecutionRecordService.queryList(insNursingRoomExecutionRecord);
        return ResultGenerator.genSuccessResult(insNursingRoomExecutionRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingRoomExecutionRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingRoomExecutionRecord> queryOne(@RequestBody InsNursingRoomExecutionRecord insNursingRoomExecutionRecord) {
        return ResultGenerator.genSuccessResult(insNursingRoomExecutionRecordService.queryOne(insNursingRoomExecutionRecord));
    }

    /**
    * 保存数据
    * @param insNursingRoomExecutionRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingRoomExecutionRecord insNursingRoomExecutionRecord) {
        //Date currentDt = new Date();
        if (insNursingRoomExecutionRecord.getId() != null && insNursingRoomExecutionRecord.getId().longValue() > 0) {
            //insNursingRoomExecutionRecord.setUpdatedDt(currentDt);
            insNursingRoomExecutionRecordService.update(insNursingRoomExecutionRecord);
        } else {
            //insNursingRoomExecutionRecord.setCreatedDt(currentDt);
            //insNursingRoomExecutionRecord.setUpdatedDt(currentDt);
            insNursingRoomExecutionRecordService.insert(insNursingRoomExecutionRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingRoomExecutionRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingRoomExecutionRecord> add(@RequestBody InsNursingRoomExecutionRecord insNursingRoomExecutionRecord) {
        //Date currentDt = new Date();
        //insNursingRoomExecutionRecord.setCreatedDt(currentDt);
        //insNursingRoomExecutionRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingRoomExecutionRecordService.insert(insNursingRoomExecutionRecord));
    }

    /**
    * 更新数据
    *
    * @param insNursingRoomExecutionRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingRoomExecutionRecord> update(@RequestBody InsNursingRoomExecutionRecord insNursingRoomExecutionRecord) {
        return ResultGenerator.genSuccessResult(insNursingRoomExecutionRecordService.update(insNursingRoomExecutionRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingRoomExecutionRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingRoomExecutionRecord insNursingRoomExecutionRecord) {
        return ResultGenerator.genSuccessResult(insNursingRoomExecutionRecordService.deleteById(insNursingRoomExecutionRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingRoomExecutionRecord> insertList) {
        return ResultGenerator.genSuccessResult(insNursingRoomExecutionRecordService.saveInsNursingRoomExecutionRecordBatch(insertList));
    }

}


