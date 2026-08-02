package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsExpensesImprestUsesRecord;
import cn.pluss.platform.service.insExpensesImprestUsesRecord.InsExpensesImprestUsesRecordService;
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
@RequestMapping("/insExpensesImprestUsesRecord")
@Api(value = "InsExpensesImprestUsesRecord控制类",tags={"InsExpensesImprestUsesRecord接口"})
public class InsExpensesImprestUsesRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsExpensesImprestUsesRecordService insExpensesImprestUsesRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsExpensesImprestUsesRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsExpensesImprestUsesRecord> insExpensesImprestUsesRecordList = insExpensesImprestUsesRecordService.queryPage(map);
        Integer count= insExpensesImprestUsesRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsExpensesImprestUsesRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insExpensesImprestUsesRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesImprestUsesRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsExpensesImprestUsesRecord>> queryList(@RequestBody InsExpensesImprestUsesRecord insExpensesImprestUsesRecord) {
        List<InsExpensesImprestUsesRecord> insExpensesImprestUsesRecordList = insExpensesImprestUsesRecordService.queryList(insExpensesImprestUsesRecord);
        return ResultGenerator.genSuccessResult(insExpensesImprestUsesRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insExpensesImprestUsesRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsExpensesImprestUsesRecord> queryOne(@RequestBody InsExpensesImprestUsesRecord insExpensesImprestUsesRecord) {
        return ResultGenerator.genSuccessResult(insExpensesImprestUsesRecordService.queryOne(insExpensesImprestUsesRecord));
    }

    /**
    * 保存数据
    * @param insExpensesImprestUsesRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsExpensesImprestUsesRecord insExpensesImprestUsesRecord) {
        //Date currentDt = new Date();
        if (insExpensesImprestUsesRecord.getId() != null && insExpensesImprestUsesRecord.getId().longValue() > 0) {
            //insExpensesImprestUsesRecord.setUpdatedDt(currentDt);
            insExpensesImprestUsesRecordService.update(insExpensesImprestUsesRecord);
        } else {
            //insExpensesImprestUsesRecord.setCreatedDt(currentDt);
            //insExpensesImprestUsesRecord.setUpdatedDt(currentDt);
            insExpensesImprestUsesRecordService.insert(insExpensesImprestUsesRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insExpensesImprestUsesRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsExpensesImprestUsesRecord> add(@RequestBody InsExpensesImprestUsesRecord insExpensesImprestUsesRecord) {
        //Date currentDt = new Date();
        //insExpensesImprestUsesRecord.setCreatedDt(currentDt);
        //insExpensesImprestUsesRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insExpensesImprestUsesRecordService.insert(insExpensesImprestUsesRecord));
    }

    /**
    * 更新数据
    *
    * @param insExpensesImprestUsesRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsExpensesImprestUsesRecord> update(@RequestBody InsExpensesImprestUsesRecord insExpensesImprestUsesRecord) {
        return ResultGenerator.genSuccessResult(insExpensesImprestUsesRecordService.update(insExpensesImprestUsesRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insExpensesImprestUsesRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsExpensesImprestUsesRecord insExpensesImprestUsesRecord) {
        return ResultGenerator.genSuccessResult(insExpensesImprestUsesRecordService.deleteById(insExpensesImprestUsesRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsExpensesImprestUsesRecord> insertList) {
        return ResultGenerator.genSuccessResult(insExpensesImprestUsesRecordService.saveInsExpensesImprestUsesRecordBatch(insertList));
    }

}


