package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CareLeaveRecord;
import cn.pluss.platform.service.careLeaveRecord.CareLeaveRecordService;
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
@RequestMapping("/careLeaveRecord")
@Api(value = "CareLeaveRecord控制类",tags={"CareLeaveRecord接口"})
public class CareLeaveRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CareLeaveRecordService careLeaveRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CareLeaveRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CareLeaveRecord> careLeaveRecordList = careLeaveRecordService.queryPage(map);
        Integer count= careLeaveRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CareLeaveRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), careLeaveRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param careLeaveRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CareLeaveRecord>> queryList(@RequestBody CareLeaveRecord careLeaveRecord) {
        List<CareLeaveRecord> careLeaveRecordList = careLeaveRecordService.queryList(careLeaveRecord);
        return ResultGenerator.genSuccessResult(careLeaveRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param careLeaveRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CareLeaveRecord> queryOne(@RequestBody CareLeaveRecord careLeaveRecord) {
        return ResultGenerator.genSuccessResult(careLeaveRecordService.queryOne(careLeaveRecord));
    }

    /**
    * 保存数据
    * @param careLeaveRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CareLeaveRecord careLeaveRecord) {
        //Date currentDt = new Date();
        if (careLeaveRecord.getId() != null && careLeaveRecord.getId().longValue() > 0) {
            //careLeaveRecord.setUpdatedDt(currentDt);
            careLeaveRecordService.update(careLeaveRecord);
        } else {
            //careLeaveRecord.setCreatedDt(currentDt);
            //careLeaveRecord.setUpdatedDt(currentDt);
            careLeaveRecordService.insert(careLeaveRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param careLeaveRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CareLeaveRecord> add(@RequestBody CareLeaveRecord careLeaveRecord) {
        //Date currentDt = new Date();
        //careLeaveRecord.setCreatedDt(currentDt);
        //careLeaveRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(careLeaveRecordService.insert(careLeaveRecord));
    }

    /**
    * 更新数据
    *
    * @param careLeaveRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CareLeaveRecord> update(@RequestBody CareLeaveRecord careLeaveRecord) {
        return ResultGenerator.genSuccessResult(careLeaveRecordService.update(careLeaveRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param careLeaveRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CareLeaveRecord careLeaveRecord) {
        return ResultGenerator.genSuccessResult(careLeaveRecordService.deleteById(careLeaveRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CareLeaveRecord> insertList) {
        return ResultGenerator.genSuccessResult(careLeaveRecordService.saveCareLeaveRecordBatch(insertList));
    }

}


