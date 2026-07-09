package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingChangeNursingRecord;
import cn.pluss.platform.service.insNursingChangeNursingRecord.InsNursingChangeNursingRecordService;
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
@RequestMapping("/insNursingChangeNursingRecord")
@Api(value = "InsNursingChangeNursingRecord控制类",tags={"InsNursingChangeNursingRecord接口"})
public class InsNursingChangeNursingRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingChangeNursingRecordService insNursingChangeNursingRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingChangeNursingRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingChangeNursingRecord> insNursingChangeNursingRecordList = insNursingChangeNursingRecordService.queryPage(map);
        Integer count= insNursingChangeNursingRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingChangeNursingRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingChangeNursingRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingChangeNursingRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingChangeNursingRecord>> queryList(@RequestBody InsNursingChangeNursingRecord insNursingChangeNursingRecord) {
        List<InsNursingChangeNursingRecord> insNursingChangeNursingRecordList = insNursingChangeNursingRecordService.queryList(insNursingChangeNursingRecord);
        return ResultGenerator.genSuccessResult(insNursingChangeNursingRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingChangeNursingRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingChangeNursingRecord> queryOne(@RequestBody InsNursingChangeNursingRecord insNursingChangeNursingRecord) {
        return ResultGenerator.genSuccessResult(insNursingChangeNursingRecordService.queryOne(insNursingChangeNursingRecord));
    }

    /**
    * 保存数据
    * @param insNursingChangeNursingRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingChangeNursingRecord insNursingChangeNursingRecord) {
        //Date currentDt = new Date();
        if (insNursingChangeNursingRecord.getId() != null && insNursingChangeNursingRecord.getId().longValue() > 0) {
            //insNursingChangeNursingRecord.setUpdatedDt(currentDt);
            insNursingChangeNursingRecordService.update(insNursingChangeNursingRecord);
        } else {
            //insNursingChangeNursingRecord.setCreatedDt(currentDt);
            //insNursingChangeNursingRecord.setUpdatedDt(currentDt);
            insNursingChangeNursingRecordService.insert(insNursingChangeNursingRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingChangeNursingRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingChangeNursingRecord> add(@RequestBody InsNursingChangeNursingRecord insNursingChangeNursingRecord) {
        //Date currentDt = new Date();
        //insNursingChangeNursingRecord.setCreatedDt(currentDt);
        //insNursingChangeNursingRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingChangeNursingRecordService.insert(insNursingChangeNursingRecord));
    }

    /**
    * 更新数据
    *
    * @param insNursingChangeNursingRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingChangeNursingRecord> update(@RequestBody InsNursingChangeNursingRecord insNursingChangeNursingRecord) {
        return ResultGenerator.genSuccessResult(insNursingChangeNursingRecordService.update(insNursingChangeNursingRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingChangeNursingRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingChangeNursingRecord insNursingChangeNursingRecord) {
        return ResultGenerator.genSuccessResult(insNursingChangeNursingRecordService.deleteById(insNursingChangeNursingRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingChangeNursingRecord> insertList) {
        return ResultGenerator.genSuccessResult(insNursingChangeNursingRecordService.saveInsNursingChangeNursingRecordBatch(insertList));
    }

}


