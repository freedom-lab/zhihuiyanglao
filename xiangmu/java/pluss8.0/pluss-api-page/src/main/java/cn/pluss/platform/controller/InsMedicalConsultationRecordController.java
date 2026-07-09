package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsMedicalConsultationRecord;
import cn.pluss.platform.service.insMedicalConsultationRecord.InsMedicalConsultationRecordService;
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
@RequestMapping("/insMedicalConsultationRecord")
@Api(value = "InsMedicalConsultationRecord控制类",tags={"InsMedicalConsultationRecord接口"})
public class InsMedicalConsultationRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsMedicalConsultationRecordService insMedicalConsultationRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsMedicalConsultationRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsMedicalConsultationRecord> insMedicalConsultationRecordList = insMedicalConsultationRecordService.queryPage(map);
        Integer count= insMedicalConsultationRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsMedicalConsultationRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insMedicalConsultationRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalConsultationRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsMedicalConsultationRecord>> queryList(@RequestBody InsMedicalConsultationRecord insMedicalConsultationRecord) {
        List<InsMedicalConsultationRecord> insMedicalConsultationRecordList = insMedicalConsultationRecordService.queryList(insMedicalConsultationRecord);
        return ResultGenerator.genSuccessResult(insMedicalConsultationRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insMedicalConsultationRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsMedicalConsultationRecord> queryOne(@RequestBody InsMedicalConsultationRecord insMedicalConsultationRecord) {
        return ResultGenerator.genSuccessResult(insMedicalConsultationRecordService.queryOne(insMedicalConsultationRecord));
    }

    /**
    * 保存数据
    * @param insMedicalConsultationRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsMedicalConsultationRecord insMedicalConsultationRecord) {
        //Date currentDt = new Date();
        if (insMedicalConsultationRecord.getId() != null && insMedicalConsultationRecord.getId().longValue() > 0) {
            //insMedicalConsultationRecord.setUpdatedDt(currentDt);
            insMedicalConsultationRecordService.update(insMedicalConsultationRecord);
        } else {
            //insMedicalConsultationRecord.setCreatedDt(currentDt);
            //insMedicalConsultationRecord.setUpdatedDt(currentDt);
            insMedicalConsultationRecordService.insert(insMedicalConsultationRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insMedicalConsultationRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsMedicalConsultationRecord> add(@RequestBody InsMedicalConsultationRecord insMedicalConsultationRecord) {
        //Date currentDt = new Date();
        //insMedicalConsultationRecord.setCreatedDt(currentDt);
        //insMedicalConsultationRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insMedicalConsultationRecordService.insert(insMedicalConsultationRecord));
    }

    /**
    * 更新数据
    *
    * @param insMedicalConsultationRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsMedicalConsultationRecord> update(@RequestBody InsMedicalConsultationRecord insMedicalConsultationRecord) {
        return ResultGenerator.genSuccessResult(insMedicalConsultationRecordService.update(insMedicalConsultationRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insMedicalConsultationRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsMedicalConsultationRecord insMedicalConsultationRecord) {
        return ResultGenerator.genSuccessResult(insMedicalConsultationRecordService.deleteById(insMedicalConsultationRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsMedicalConsultationRecord> insertList) {
        return ResultGenerator.genSuccessResult(insMedicalConsultationRecordService.saveInsMedicalConsultationRecordBatch(insertList));
    }

}


