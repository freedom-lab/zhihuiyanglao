package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderChangeBedRecord;
import cn.pluss.platform.service.insElderChangeBedRecord.InsElderChangeBedRecordService;
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
@RequestMapping("/insElderChangeBedRecord")
@Api(value = "InsElderChangeBedRecord控制类",tags={"InsElderChangeBedRecord接口"})
public class InsElderChangeBedRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderChangeBedRecordService insElderChangeBedRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderChangeBedRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderChangeBedRecord> insElderChangeBedRecordList = insElderChangeBedRecordService.queryPage(map);
        Integer count= insElderChangeBedRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderChangeBedRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderChangeBedRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderChangeBedRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderChangeBedRecord>> queryList(@RequestBody InsElderChangeBedRecord insElderChangeBedRecord) {
        List<InsElderChangeBedRecord> insElderChangeBedRecordList = insElderChangeBedRecordService.queryList(insElderChangeBedRecord);
        return ResultGenerator.genSuccessResult(insElderChangeBedRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderChangeBedRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderChangeBedRecord> queryOne(@RequestBody InsElderChangeBedRecord insElderChangeBedRecord) {
        return ResultGenerator.genSuccessResult(insElderChangeBedRecordService.queryOne(insElderChangeBedRecord));
    }

    /**
    * 保存数据
    * @param insElderChangeBedRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderChangeBedRecord insElderChangeBedRecord) {
        //Date currentDt = new Date();
        if (insElderChangeBedRecord.getId() != null && insElderChangeBedRecord.getId().longValue() > 0) {
            //insElderChangeBedRecord.setUpdatedDt(currentDt);
            insElderChangeBedRecordService.update(insElderChangeBedRecord);
        } else {
            //insElderChangeBedRecord.setCreatedDt(currentDt);
            //insElderChangeBedRecord.setUpdatedDt(currentDt);
            insElderChangeBedRecordService.insert(insElderChangeBedRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderChangeBedRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderChangeBedRecord> add(@RequestBody InsElderChangeBedRecord insElderChangeBedRecord) {
        //Date currentDt = new Date();
        //insElderChangeBedRecord.setCreatedDt(currentDt);
        //insElderChangeBedRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderChangeBedRecordService.insert(insElderChangeBedRecord));
    }

    /**
    * 更新数据
    *
    * @param insElderChangeBedRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderChangeBedRecord> update(@RequestBody InsElderChangeBedRecord insElderChangeBedRecord) {
        return ResultGenerator.genSuccessResult(insElderChangeBedRecordService.update(insElderChangeBedRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderChangeBedRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderChangeBedRecord insElderChangeBedRecord) {
        return ResultGenerator.genSuccessResult(insElderChangeBedRecordService.deleteById(insElderChangeBedRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderChangeBedRecord> insertList) {
        return ResultGenerator.genSuccessResult(insElderChangeBedRecordService.saveInsElderChangeBedRecordBatch(insertList));
    }

}


