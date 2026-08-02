package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsExpensesExpenditureRecord;
import cn.pluss.platform.service.insExpensesExpenditureRecord.InsExpensesExpenditureRecordService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/insExpensesExpenditureRecord")
@Api(value = "InsExpensesExpenditureRecord控制类",tags={"InsExpensesExpenditureRecord接口"})
public class InsExpensesExpenditureRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsExpensesExpenditureRecordService insExpensesExpenditureRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsExpensesExpenditureRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsExpensesExpenditureRecord> insExpensesExpenditureRecordList = insExpensesExpenditureRecordService.queryPage(map);
        Integer count= insExpensesExpenditureRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsExpensesExpenditureRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insExpensesExpenditureRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesExpenditureRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsExpensesExpenditureRecord>> queryList(@RequestBody InsExpensesExpenditureRecord insExpensesExpenditureRecord) {
        List<InsExpensesExpenditureRecord> insExpensesExpenditureRecordList = insExpensesExpenditureRecordService.queryList(insExpensesExpenditureRecord);
        return ResultGenerator.genSuccessResult(insExpensesExpenditureRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insExpensesExpenditureRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsExpensesExpenditureRecord> queryOne(@RequestBody InsExpensesExpenditureRecord insExpensesExpenditureRecord) {
        return ResultGenerator.genSuccessResult(insExpensesExpenditureRecordService.queryOne(insExpensesExpenditureRecord));
    }

    /**
    * 保存数据
    * @param insExpensesExpenditureRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsExpensesExpenditureRecord insExpensesExpenditureRecord) {
        //Date currentDt = new Date();
        if (insExpensesExpenditureRecord.getId() != null && insExpensesExpenditureRecord.getId().longValue() > 0) {
            //insExpensesExpenditureRecord.setUpdatedDt(currentDt);
            insExpensesExpenditureRecordService.update(insExpensesExpenditureRecord);
        } else {
            //insExpensesExpenditureRecord.setCreatedDt(currentDt);
            //insExpensesExpenditureRecord.setUpdatedDt(currentDt);
            insExpensesExpenditureRecordService.insert(insExpensesExpenditureRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insExpensesExpenditureRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsExpensesExpenditureRecord> add(@RequestBody InsExpensesExpenditureRecord insExpensesExpenditureRecord) {
        //Date currentDt = new Date();
        //insExpensesExpenditureRecord.setCreatedDt(currentDt);
        //insExpensesExpenditureRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insExpensesExpenditureRecordService.insert(insExpensesExpenditureRecord));
    }

    /**
    * 更新数据
    *
    * @param insExpensesExpenditureRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsExpensesExpenditureRecord> update(@RequestBody InsExpensesExpenditureRecord insExpensesExpenditureRecord) {
        return ResultGenerator.genSuccessResult(insExpensesExpenditureRecordService.update(insExpensesExpenditureRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insExpensesExpenditureRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsExpensesExpenditureRecord insExpensesExpenditureRecord) {
        return ResultGenerator.genSuccessResult(insExpensesExpenditureRecordService.deleteById(insExpensesExpenditureRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsExpensesExpenditureRecord> insertList) {
        return ResultGenerator.genSuccessResult(insExpensesExpenditureRecordService.saveInsExpensesExpenditureRecordBatch(insertList));
    }

}


