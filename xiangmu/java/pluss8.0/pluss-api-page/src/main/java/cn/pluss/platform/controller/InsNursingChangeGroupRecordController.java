package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingChangeGroupRecord;
import cn.pluss.platform.service.insNursingChangeGroupRecord.InsNursingChangeGroupRecordService;
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
@RequestMapping("/insNursingChangeGroupRecord")
@Api(value = "InsNursingChangeGroupRecord控制类",tags={"InsNursingChangeGroupRecord接口"})
public class InsNursingChangeGroupRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingChangeGroupRecordService insNursingChangeGroupRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingChangeGroupRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingChangeGroupRecord> insNursingChangeGroupRecordList = insNursingChangeGroupRecordService.queryPage(map);
        Integer count= insNursingChangeGroupRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingChangeGroupRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingChangeGroupRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingChangeGroupRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingChangeGroupRecord>> queryList(@RequestBody InsNursingChangeGroupRecord insNursingChangeGroupRecord) {
        List<InsNursingChangeGroupRecord> insNursingChangeGroupRecordList = insNursingChangeGroupRecordService.queryList(insNursingChangeGroupRecord);
        return ResultGenerator.genSuccessResult(insNursingChangeGroupRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingChangeGroupRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingChangeGroupRecord> queryOne(@RequestBody InsNursingChangeGroupRecord insNursingChangeGroupRecord) {
        return ResultGenerator.genSuccessResult(insNursingChangeGroupRecordService.queryOne(insNursingChangeGroupRecord));
    }

    /**
    * 保存数据
    * @param insNursingChangeGroupRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingChangeGroupRecord insNursingChangeGroupRecord) {
        //Date currentDt = new Date();
        if (insNursingChangeGroupRecord.getId() != null && insNursingChangeGroupRecord.getId().longValue() > 0) {
            //insNursingChangeGroupRecord.setUpdatedDt(currentDt);
            insNursingChangeGroupRecordService.update(insNursingChangeGroupRecord);
        } else {
            //insNursingChangeGroupRecord.setCreatedDt(currentDt);
            //insNursingChangeGroupRecord.setUpdatedDt(currentDt);
            insNursingChangeGroupRecordService.insert(insNursingChangeGroupRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingChangeGroupRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingChangeGroupRecord> add(@RequestBody InsNursingChangeGroupRecord insNursingChangeGroupRecord) {
        //Date currentDt = new Date();
        //insNursingChangeGroupRecord.setCreatedDt(currentDt);
        //insNursingChangeGroupRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingChangeGroupRecordService.insert(insNursingChangeGroupRecord));
    }

    /**
    * 更新数据
    *
    * @param insNursingChangeGroupRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingChangeGroupRecord> update(@RequestBody InsNursingChangeGroupRecord insNursingChangeGroupRecord) {
        return ResultGenerator.genSuccessResult(insNursingChangeGroupRecordService.update(insNursingChangeGroupRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingChangeGroupRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingChangeGroupRecord insNursingChangeGroupRecord) {
        return ResultGenerator.genSuccessResult(insNursingChangeGroupRecordService.deleteById(insNursingChangeGroupRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingChangeGroupRecord> insertList) {
        return ResultGenerator.genSuccessResult(insNursingChangeGroupRecordService.saveInsNursingChangeGroupRecordBatch(insertList));
    }

}


