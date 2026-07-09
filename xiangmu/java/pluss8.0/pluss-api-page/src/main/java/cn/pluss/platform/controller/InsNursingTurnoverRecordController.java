package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingTurnoverRecord;
import cn.pluss.platform.service.insNursingTurnoverRecord.InsNursingTurnoverRecordService;
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
@RequestMapping("/insNursingTurnoverRecord")
@Api(value = "InsNursingTurnoverRecord控制类",tags={"InsNursingTurnoverRecord接口"})
public class InsNursingTurnoverRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingTurnoverRecordService insNursingTurnoverRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingTurnoverRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingTurnoverRecord> insNursingTurnoverRecordList = insNursingTurnoverRecordService.queryPage(map);
        Integer count= insNursingTurnoverRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingTurnoverRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingTurnoverRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingTurnoverRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingTurnoverRecord>> queryList(@RequestBody InsNursingTurnoverRecord insNursingTurnoverRecord) {
        List<InsNursingTurnoverRecord> insNursingTurnoverRecordList = insNursingTurnoverRecordService.queryList(insNursingTurnoverRecord);
        return ResultGenerator.genSuccessResult(insNursingTurnoverRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingTurnoverRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingTurnoverRecord> queryOne(@RequestBody InsNursingTurnoverRecord insNursingTurnoverRecord) {
        return ResultGenerator.genSuccessResult(insNursingTurnoverRecordService.queryOne(insNursingTurnoverRecord));
    }

    /**
    * 保存数据
    * @param insNursingTurnoverRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingTurnoverRecord insNursingTurnoverRecord) {
        //Date currentDt = new Date();
        if (insNursingTurnoverRecord.getId() != null && insNursingTurnoverRecord.getId().longValue() > 0) {
            //insNursingTurnoverRecord.setUpdatedDt(currentDt);
            insNursingTurnoverRecordService.update(insNursingTurnoverRecord);
        } else {
            //insNursingTurnoverRecord.setCreatedDt(currentDt);
            //insNursingTurnoverRecord.setUpdatedDt(currentDt);
            insNursingTurnoverRecordService.insert(insNursingTurnoverRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingTurnoverRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingTurnoverRecord> add(@RequestBody InsNursingTurnoverRecord insNursingTurnoverRecord) {
        //Date currentDt = new Date();
        //insNursingTurnoverRecord.setCreatedDt(currentDt);
        //insNursingTurnoverRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingTurnoverRecordService.insert(insNursingTurnoverRecord));
    }

    /**
    * 更新数据
    *
    * @param insNursingTurnoverRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingTurnoverRecord> update(@RequestBody InsNursingTurnoverRecord insNursingTurnoverRecord) {
        return ResultGenerator.genSuccessResult(insNursingTurnoverRecordService.update(insNursingTurnoverRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingTurnoverRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingTurnoverRecord insNursingTurnoverRecord) {
        return ResultGenerator.genSuccessResult(insNursingTurnoverRecordService.deleteById(insNursingTurnoverRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingTurnoverRecord> insertList) {
        return ResultGenerator.genSuccessResult(insNursingTurnoverRecordService.saveInsNursingTurnoverRecordBatch(insertList));
    }

}


