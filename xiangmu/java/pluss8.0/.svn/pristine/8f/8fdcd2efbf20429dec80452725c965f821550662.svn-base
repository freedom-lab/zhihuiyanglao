package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsMedicalDrugExecuteRecord;
import cn.pluss.platform.service.insMedicalDrugExecuteRecord.InsMedicalDrugExecuteRecordService;
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
@RequestMapping("/insMedicalDrugExecuteRecord")
@Api(value = "InsMedicalDrugExecuteRecord控制类",tags={"InsMedicalDrugExecuteRecord接口"})
public class InsMedicalDrugExecuteRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsMedicalDrugExecuteRecordService insMedicalDrugExecuteRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsMedicalDrugExecuteRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsMedicalDrugExecuteRecord> insMedicalDrugExecuteRecordList = insMedicalDrugExecuteRecordService.queryPage(map);
        Integer count= insMedicalDrugExecuteRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsMedicalDrugExecuteRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insMedicalDrugExecuteRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalDrugExecuteRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsMedicalDrugExecuteRecord>> queryList(@RequestBody InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord) {
        List<InsMedicalDrugExecuteRecord> insMedicalDrugExecuteRecordList = insMedicalDrugExecuteRecordService.queryList(insMedicalDrugExecuteRecord);
        return ResultGenerator.genSuccessResult(insMedicalDrugExecuteRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insMedicalDrugExecuteRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsMedicalDrugExecuteRecord> queryOne(@RequestBody InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord) {
        return ResultGenerator.genSuccessResult(insMedicalDrugExecuteRecordService.queryOne(insMedicalDrugExecuteRecord));
    }

    /**
    * 保存数据
    * @param insMedicalDrugExecuteRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord) {
        //Date currentDt = new Date();
        if (insMedicalDrugExecuteRecord.getId() != null && insMedicalDrugExecuteRecord.getId().longValue() > 0) {
            //insMedicalDrugExecuteRecord.setUpdatedDt(currentDt);
            insMedicalDrugExecuteRecordService.update(insMedicalDrugExecuteRecord);
        } else {
            //insMedicalDrugExecuteRecord.setCreatedDt(currentDt);
            //insMedicalDrugExecuteRecord.setUpdatedDt(currentDt);
            insMedicalDrugExecuteRecordService.insert(insMedicalDrugExecuteRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insMedicalDrugExecuteRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsMedicalDrugExecuteRecord> add(@RequestBody InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord) {
        //Date currentDt = new Date();
        //insMedicalDrugExecuteRecord.setCreatedDt(currentDt);
        //insMedicalDrugExecuteRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insMedicalDrugExecuteRecordService.insert(insMedicalDrugExecuteRecord));
    }

    /**
    * 更新数据
    *
    * @param insMedicalDrugExecuteRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsMedicalDrugExecuteRecord> update(@RequestBody InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord) {
        return ResultGenerator.genSuccessResult(insMedicalDrugExecuteRecordService.update(insMedicalDrugExecuteRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insMedicalDrugExecuteRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord) {
        return ResultGenerator.genSuccessResult(insMedicalDrugExecuteRecordService.deleteById(insMedicalDrugExecuteRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsMedicalDrugExecuteRecord> insertList) {
        return ResultGenerator.genSuccessResult(insMedicalDrugExecuteRecordService.saveInsMedicalDrugExecuteRecordBatch(insertList));
    }

}


