package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsSecurityInspectionRecord;
import cn.pluss.platform.service.insSecurityInspectionRecord.InsSecurityInspectionRecordService;
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
@RequestMapping("/insSecurityInspectionRecord")
@Api(value = "InsSecurityInspectionRecord控制类",tags={"InsSecurityInspectionRecord接口"})
public class InsSecurityInspectionRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsSecurityInspectionRecordService insSecurityInspectionRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsSecurityInspectionRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsSecurityInspectionRecord> insSecurityInspectionRecordList = insSecurityInspectionRecordService.queryPage(map);
        Integer count= insSecurityInspectionRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsSecurityInspectionRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insSecurityInspectionRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityInspectionRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsSecurityInspectionRecord>> queryList(@RequestBody InsSecurityInspectionRecord insSecurityInspectionRecord) {
        List<InsSecurityInspectionRecord> insSecurityInspectionRecordList = insSecurityInspectionRecordService.queryList(insSecurityInspectionRecord);
        return ResultGenerator.genSuccessResult(insSecurityInspectionRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insSecurityInspectionRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsSecurityInspectionRecord> queryOne(@RequestBody InsSecurityInspectionRecord insSecurityInspectionRecord) {
        return ResultGenerator.genSuccessResult(insSecurityInspectionRecordService.queryOne(insSecurityInspectionRecord));
    }

    /**
    * 保存数据
    * @param insSecurityInspectionRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsSecurityInspectionRecord insSecurityInspectionRecord) {
        //Date currentDt = new Date();
        if (insSecurityInspectionRecord.getId() != null && insSecurityInspectionRecord.getId().longValue() > 0) {
            //insSecurityInspectionRecord.setUpdatedDt(currentDt);
            insSecurityInspectionRecordService.update(insSecurityInspectionRecord);
        } else {
            //insSecurityInspectionRecord.setCreatedDt(currentDt);
            //insSecurityInspectionRecord.setUpdatedDt(currentDt);
            insSecurityInspectionRecordService.insert(insSecurityInspectionRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insSecurityInspectionRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsSecurityInspectionRecord> add(@RequestBody InsSecurityInspectionRecord insSecurityInspectionRecord) {
        //Date currentDt = new Date();
        //insSecurityInspectionRecord.setCreatedDt(currentDt);
        //insSecurityInspectionRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insSecurityInspectionRecordService.insert(insSecurityInspectionRecord));
    }

    /**
    * 更新数据
    *
    * @param insSecurityInspectionRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsSecurityInspectionRecord> update(@RequestBody InsSecurityInspectionRecord insSecurityInspectionRecord) {
        return ResultGenerator.genSuccessResult(insSecurityInspectionRecordService.update(insSecurityInspectionRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insSecurityInspectionRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsSecurityInspectionRecord insSecurityInspectionRecord) {
        return ResultGenerator.genSuccessResult(insSecurityInspectionRecordService.deleteById(insSecurityInspectionRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsSecurityInspectionRecord> insertList) {
        return ResultGenerator.genSuccessResult(insSecurityInspectionRecordService.saveInsSecurityInspectionRecordBatch(insertList));
    }

}


