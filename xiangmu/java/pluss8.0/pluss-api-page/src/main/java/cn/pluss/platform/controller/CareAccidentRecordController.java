package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CareAccidentRecord;
import cn.pluss.platform.service.careAccidentRecord.CareAccidentRecordService;
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
@RequestMapping("/careAccidentRecord")
@Api(value = "CareAccidentRecord控制类",tags={"CareAccidentRecord接口"})
public class CareAccidentRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CareAccidentRecordService careAccidentRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CareAccidentRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CareAccidentRecord> careAccidentRecordList = careAccidentRecordService.queryPage(map);
        Integer count= careAccidentRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CareAccidentRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), careAccidentRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param careAccidentRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CareAccidentRecord>> queryList(@RequestBody CareAccidentRecord careAccidentRecord) {
        List<CareAccidentRecord> careAccidentRecordList = careAccidentRecordService.queryList(careAccidentRecord);
        return ResultGenerator.genSuccessResult(careAccidentRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param careAccidentRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CareAccidentRecord> queryOne(@RequestBody CareAccidentRecord careAccidentRecord) {
        return ResultGenerator.genSuccessResult(careAccidentRecordService.queryOne(careAccidentRecord));
    }

    /**
    * 保存数据
    * @param careAccidentRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CareAccidentRecord careAccidentRecord) {
        //Date currentDt = new Date();
        if (careAccidentRecord.getId() != null && careAccidentRecord.getId().longValue() > 0) {
            //careAccidentRecord.setUpdatedDt(currentDt);
            careAccidentRecordService.update(careAccidentRecord);
        } else {
            //careAccidentRecord.setCreatedDt(currentDt);
            //careAccidentRecord.setUpdatedDt(currentDt);
            careAccidentRecordService.insert(careAccidentRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param careAccidentRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CareAccidentRecord> add(@RequestBody CareAccidentRecord careAccidentRecord) {
        //Date currentDt = new Date();
        //careAccidentRecord.setCreatedDt(currentDt);
        //careAccidentRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(careAccidentRecordService.insert(careAccidentRecord));
    }

    /**
    * 更新数据
    *
    * @param careAccidentRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CareAccidentRecord> update(@RequestBody CareAccidentRecord careAccidentRecord) {
        return ResultGenerator.genSuccessResult(careAccidentRecordService.update(careAccidentRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param careAccidentRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CareAccidentRecord careAccidentRecord) {
        return ResultGenerator.genSuccessResult(careAccidentRecordService.deleteById(careAccidentRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CareAccidentRecord> insertList) {
        return ResultGenerator.genSuccessResult(careAccidentRecordService.saveCareAccidentRecordBatch(insertList));
    }

}


