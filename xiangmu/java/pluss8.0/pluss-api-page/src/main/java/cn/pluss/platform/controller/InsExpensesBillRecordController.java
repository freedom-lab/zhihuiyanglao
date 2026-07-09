package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsExpensesBillRecord;
import cn.pluss.platform.service.insExpensesBillRecord.InsExpensesBillRecordService;
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
@RequestMapping("/insExpensesBillRecord")
@Api(value = "InsExpensesBillRecord控制类",tags={"InsExpensesBillRecord接口"})
public class InsExpensesBillRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsExpensesBillRecordService insExpensesBillRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsExpensesBillRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsExpensesBillRecord> insExpensesBillRecordList = insExpensesBillRecordService.queryPage(map);
        Integer count= insExpensesBillRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsExpensesBillRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insExpensesBillRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesBillRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsExpensesBillRecord>> queryList(@RequestBody InsExpensesBillRecord insExpensesBillRecord) {
        List<InsExpensesBillRecord> insExpensesBillRecordList = insExpensesBillRecordService.queryList(insExpensesBillRecord);
        return ResultGenerator.genSuccessResult(insExpensesBillRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insExpensesBillRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsExpensesBillRecord> queryOne(@RequestBody InsExpensesBillRecord insExpensesBillRecord) {
        return ResultGenerator.genSuccessResult(insExpensesBillRecordService.queryOne(insExpensesBillRecord));
    }

    /**
    * 保存数据
    * @param insExpensesBillRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsExpensesBillRecord insExpensesBillRecord) {
        //Date currentDt = new Date();
        if (insExpensesBillRecord.getId() != null && insExpensesBillRecord.getId().longValue() > 0) {
            //insExpensesBillRecord.setUpdatedDt(currentDt);
            insExpensesBillRecordService.update(insExpensesBillRecord);
        } else {
            //insExpensesBillRecord.setCreatedDt(currentDt);
            //insExpensesBillRecord.setUpdatedDt(currentDt);
            insExpensesBillRecordService.insert(insExpensesBillRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insExpensesBillRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsExpensesBillRecord> add(@RequestBody InsExpensesBillRecord insExpensesBillRecord) {
        //Date currentDt = new Date();
        //insExpensesBillRecord.setCreatedDt(currentDt);
        //insExpensesBillRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insExpensesBillRecordService.insert(insExpensesBillRecord));
    }

    /**
    * 更新数据
    *
    * @param insExpensesBillRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsExpensesBillRecord> update(@RequestBody InsExpensesBillRecord insExpensesBillRecord) {
        return ResultGenerator.genSuccessResult(insExpensesBillRecordService.update(insExpensesBillRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insExpensesBillRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsExpensesBillRecord insExpensesBillRecord) {
        return ResultGenerator.genSuccessResult(insExpensesBillRecordService.deleteById(insExpensesBillRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsExpensesBillRecord> insertList) {
        return ResultGenerator.genSuccessResult(insExpensesBillRecordService.saveInsExpensesBillRecordBatch(insertList));
    }

}


