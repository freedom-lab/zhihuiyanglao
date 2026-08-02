package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderLeaveRecord;
import cn.pluss.platform.service.insElderLeaveRecord.InsElderLeaveRecordService;
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
@RequestMapping("/insElderLeaveRecord")
@Api(value = "InsElderLeaveRecord控制类",tags={"InsElderLeaveRecord接口"})
public class InsElderLeaveRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderLeaveRecordService insElderLeaveRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderLeaveRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderLeaveRecord> insElderLeaveRecordList = insElderLeaveRecordService.queryPage(map);
        Integer count= insElderLeaveRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderLeaveRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderLeaveRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderLeaveRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderLeaveRecord>> queryList(@RequestBody InsElderLeaveRecord insElderLeaveRecord) {
        List<InsElderLeaveRecord> insElderLeaveRecordList = insElderLeaveRecordService.queryList(insElderLeaveRecord);
        return ResultGenerator.genSuccessResult(insElderLeaveRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderLeaveRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderLeaveRecord> queryOne(@RequestBody InsElderLeaveRecord insElderLeaveRecord) {
        return ResultGenerator.genSuccessResult(insElderLeaveRecordService.queryOne(insElderLeaveRecord));
    }

    /**
    * 保存数据
    * @param insElderLeaveRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderLeaveRecord insElderLeaveRecord) {
        //Date currentDt = new Date();
        if (insElderLeaveRecord.getId() != null && insElderLeaveRecord.getId().longValue() > 0) {
            //insElderLeaveRecord.setUpdatedDt(currentDt);
            insElderLeaveRecordService.update(insElderLeaveRecord);
        } else {
            //insElderLeaveRecord.setCreatedDt(currentDt);
            //insElderLeaveRecord.setUpdatedDt(currentDt);
            insElderLeaveRecordService.insert(insElderLeaveRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderLeaveRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderLeaveRecord> add(@RequestBody InsElderLeaveRecord insElderLeaveRecord) {
        //Date currentDt = new Date();
        //insElderLeaveRecord.setCreatedDt(currentDt);
        //insElderLeaveRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderLeaveRecordService.insert(insElderLeaveRecord));
    }

    /**
    * 更新数据
    *
    * @param insElderLeaveRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderLeaveRecord> update(@RequestBody InsElderLeaveRecord insElderLeaveRecord) {
        return ResultGenerator.genSuccessResult(insElderLeaveRecordService.update(insElderLeaveRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderLeaveRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderLeaveRecord insElderLeaveRecord) {
        return ResultGenerator.genSuccessResult(insElderLeaveRecordService.deleteById(insElderLeaveRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderLeaveRecord> insertList) {
        return ResultGenerator.genSuccessResult(insElderLeaveRecordService.saveInsElderLeaveRecordBatch(insertList));
    }

}


