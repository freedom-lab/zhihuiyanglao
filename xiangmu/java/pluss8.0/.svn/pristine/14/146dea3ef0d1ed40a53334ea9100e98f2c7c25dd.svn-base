package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderTrackRecord;
import cn.pluss.platform.service.insElderTrackRecord.InsElderTrackRecordService;
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
@RequestMapping("/insElderTrackRecord")
@Api(value = "InsElderTrackRecord控制类",tags={"InsElderTrackRecord接口"})
public class InsElderTrackRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderTrackRecordService insElderTrackRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderTrackRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderTrackRecord> insElderTrackRecordList = insElderTrackRecordService.queryPage(map);
        Integer count= insElderTrackRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderTrackRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderTrackRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderTrackRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderTrackRecord>> queryList(@RequestBody InsElderTrackRecord insElderTrackRecord) {
        List<InsElderTrackRecord> insElderTrackRecordList = insElderTrackRecordService.queryList(insElderTrackRecord);
        return ResultGenerator.genSuccessResult(insElderTrackRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderTrackRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderTrackRecord> queryOne(@RequestBody InsElderTrackRecord insElderTrackRecord) {
        return ResultGenerator.genSuccessResult(insElderTrackRecordService.queryOne(insElderTrackRecord));
    }

    /**
    * 保存数据
    * @param insElderTrackRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderTrackRecord insElderTrackRecord) {
        //Date currentDt = new Date();
        if (insElderTrackRecord.getId() != null && insElderTrackRecord.getId().longValue() > 0) {
            //insElderTrackRecord.setUpdatedDt(currentDt);
            insElderTrackRecordService.update(insElderTrackRecord);
        } else {
            //insElderTrackRecord.setCreatedDt(currentDt);
            //insElderTrackRecord.setUpdatedDt(currentDt);
            insElderTrackRecordService.insert(insElderTrackRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderTrackRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderTrackRecord> add(@RequestBody InsElderTrackRecord insElderTrackRecord) {
        //Date currentDt = new Date();
        //insElderTrackRecord.setCreatedDt(currentDt);
        //insElderTrackRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderTrackRecordService.insert(insElderTrackRecord));
    }

    /**
    * 更新数据
    *
    * @param insElderTrackRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderTrackRecord> update(@RequestBody InsElderTrackRecord insElderTrackRecord) {
        return ResultGenerator.genSuccessResult(insElderTrackRecordService.update(insElderTrackRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderTrackRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderTrackRecord insElderTrackRecord) {
        return ResultGenerator.genSuccessResult(insElderTrackRecordService.deleteById(insElderTrackRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderTrackRecord> insertList) {
        return ResultGenerator.genSuccessResult(insElderTrackRecordService.saveInsElderTrackRecordBatch(insertList));
    }

}


