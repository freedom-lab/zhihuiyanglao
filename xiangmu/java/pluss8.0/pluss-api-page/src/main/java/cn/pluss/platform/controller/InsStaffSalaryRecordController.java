package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsStaffSalaryRecord;
import cn.pluss.platform.service.insStaffSalaryRecord.InsStaffSalaryRecordService;
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
@RequestMapping("/insStaffSalaryRecord")
@Api(value = "InsStaffSalaryRecord控制类",tags={"InsStaffSalaryRecord接口"})
public class InsStaffSalaryRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsStaffSalaryRecordService insStaffSalaryRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsStaffSalaryRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsStaffSalaryRecord> insStaffSalaryRecordList = insStaffSalaryRecordService.queryPage(map);
        Integer count= insStaffSalaryRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsStaffSalaryRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insStaffSalaryRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insStaffSalaryRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsStaffSalaryRecord>> queryList(@RequestBody InsStaffSalaryRecord insStaffSalaryRecord) {
        List<InsStaffSalaryRecord> insStaffSalaryRecordList = insStaffSalaryRecordService.queryList(insStaffSalaryRecord);
        return ResultGenerator.genSuccessResult(insStaffSalaryRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insStaffSalaryRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsStaffSalaryRecord> queryOne(@RequestBody InsStaffSalaryRecord insStaffSalaryRecord) {
        return ResultGenerator.genSuccessResult(insStaffSalaryRecordService.queryOne(insStaffSalaryRecord));
    }

    /**
    * 保存数据
    * @param insStaffSalaryRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsStaffSalaryRecord insStaffSalaryRecord) {
        //Date currentDt = new Date();
        if (insStaffSalaryRecord.getId() != null && insStaffSalaryRecord.getId().longValue() > 0) {
            //insStaffSalaryRecord.setUpdatedDt(currentDt);
            insStaffSalaryRecordService.update(insStaffSalaryRecord);
        } else {
            //insStaffSalaryRecord.setCreatedDt(currentDt);
            //insStaffSalaryRecord.setUpdatedDt(currentDt);
            insStaffSalaryRecordService.insert(insStaffSalaryRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insStaffSalaryRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsStaffSalaryRecord> add(@RequestBody InsStaffSalaryRecord insStaffSalaryRecord) {
        //Date currentDt = new Date();
        //insStaffSalaryRecord.setCreatedDt(currentDt);
        //insStaffSalaryRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insStaffSalaryRecordService.insert(insStaffSalaryRecord));
    }

    /**
    * 更新数据
    *
    * @param insStaffSalaryRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsStaffSalaryRecord> update(@RequestBody InsStaffSalaryRecord insStaffSalaryRecord) {
        return ResultGenerator.genSuccessResult(insStaffSalaryRecordService.update(insStaffSalaryRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insStaffSalaryRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsStaffSalaryRecord insStaffSalaryRecord) {
        return ResultGenerator.genSuccessResult(insStaffSalaryRecordService.deleteById(insStaffSalaryRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsStaffSalaryRecord> insertList) {
        return ResultGenerator.genSuccessResult(insStaffSalaryRecordService.saveInsStaffSalaryRecordBatch(insertList));
    }

}


