package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsRegisterConsultReturnRecord;
import cn.pluss.platform.service.insRegisterConsultReturnRecord.InsRegisterConsultReturnRecordService;
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
@RequestMapping("/insRegisterConsultReturnRecord")
@Api(value = "InsRegisterConsultReturnRecord控制类",tags={"InsRegisterConsultReturnRecord接口"})
public class InsRegisterConsultReturnRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsRegisterConsultReturnRecordService insRegisterConsultReturnRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsRegisterConsultReturnRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsRegisterConsultReturnRecord> insRegisterConsultReturnRecordList = insRegisterConsultReturnRecordService.queryPage(map);
        Integer count= insRegisterConsultReturnRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsRegisterConsultReturnRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insRegisterConsultReturnRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insRegisterConsultReturnRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsRegisterConsultReturnRecord>> queryList(@RequestBody InsRegisterConsultReturnRecord insRegisterConsultReturnRecord) {
        List<InsRegisterConsultReturnRecord> insRegisterConsultReturnRecordList = insRegisterConsultReturnRecordService.queryList(insRegisterConsultReturnRecord);
        return ResultGenerator.genSuccessResult(insRegisterConsultReturnRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insRegisterConsultReturnRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsRegisterConsultReturnRecord> queryOne(@RequestBody InsRegisterConsultReturnRecord insRegisterConsultReturnRecord) {
        return ResultGenerator.genSuccessResult(insRegisterConsultReturnRecordService.queryOne(insRegisterConsultReturnRecord));
    }

    /**
    * 保存数据
    * @param insRegisterConsultReturnRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsRegisterConsultReturnRecord insRegisterConsultReturnRecord) {
        //Date currentDt = new Date();
        if (insRegisterConsultReturnRecord.getId() != null && insRegisterConsultReturnRecord.getId().longValue() > 0) {
            //insRegisterConsultReturnRecord.setUpdatedDt(currentDt);
            insRegisterConsultReturnRecordService.update(insRegisterConsultReturnRecord);
        } else {
            //insRegisterConsultReturnRecord.setCreatedDt(currentDt);
            //insRegisterConsultReturnRecord.setUpdatedDt(currentDt);
            insRegisterConsultReturnRecordService.insert(insRegisterConsultReturnRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insRegisterConsultReturnRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsRegisterConsultReturnRecord> add(@RequestBody InsRegisterConsultReturnRecord insRegisterConsultReturnRecord) {
        //Date currentDt = new Date();
        //insRegisterConsultReturnRecord.setCreatedDt(currentDt);
        //insRegisterConsultReturnRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insRegisterConsultReturnRecordService.insert(insRegisterConsultReturnRecord));
    }

    /**
    * 更新数据
    *
    * @param insRegisterConsultReturnRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsRegisterConsultReturnRecord> update(@RequestBody InsRegisterConsultReturnRecord insRegisterConsultReturnRecord) {
        return ResultGenerator.genSuccessResult(insRegisterConsultReturnRecordService.update(insRegisterConsultReturnRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insRegisterConsultReturnRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsRegisterConsultReturnRecord insRegisterConsultReturnRecord) {
        return ResultGenerator.genSuccessResult(insRegisterConsultReturnRecordService.deleteById(insRegisterConsultReturnRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsRegisterConsultReturnRecord> insertList) {
        return ResultGenerator.genSuccessResult(insRegisterConsultReturnRecordService.saveInsRegisterConsultReturnRecordBatch(insertList));
    }

}


