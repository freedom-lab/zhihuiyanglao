package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsFaceStaffSignRecord;
import cn.pluss.platform.service.insFaceStaffSignRecord.InsFaceStaffSignRecordService;
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
@RequestMapping("/insFaceStaffSignRecord")
@Api(value = "InsFaceStaffSignRecord控制类",tags={"InsFaceStaffSignRecord接口"})
public class InsFaceStaffSignRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsFaceStaffSignRecordService insFaceStaffSignRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsFaceStaffSignRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsFaceStaffSignRecord> insFaceStaffSignRecordList = insFaceStaffSignRecordService.queryPage(map);
        Integer count= insFaceStaffSignRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsFaceStaffSignRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insFaceStaffSignRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insFaceStaffSignRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsFaceStaffSignRecord>> queryList(@RequestBody InsFaceStaffSignRecord insFaceStaffSignRecord) {
        List<InsFaceStaffSignRecord> insFaceStaffSignRecordList = insFaceStaffSignRecordService.queryList(insFaceStaffSignRecord);
        return ResultGenerator.genSuccessResult(insFaceStaffSignRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insFaceStaffSignRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsFaceStaffSignRecord> queryOne(@RequestBody InsFaceStaffSignRecord insFaceStaffSignRecord) {
        return ResultGenerator.genSuccessResult(insFaceStaffSignRecordService.queryOne(insFaceStaffSignRecord));
    }

    /**
    * 保存数据
    * @param insFaceStaffSignRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsFaceStaffSignRecord insFaceStaffSignRecord) {
        //Date currentDt = new Date();
        if (insFaceStaffSignRecord.getId() != null && insFaceStaffSignRecord.getId().longValue() > 0) {
            //insFaceStaffSignRecord.setUpdatedDt(currentDt);
            insFaceStaffSignRecordService.update(insFaceStaffSignRecord);
        } else {
            //insFaceStaffSignRecord.setCreatedDt(currentDt);
            //insFaceStaffSignRecord.setUpdatedDt(currentDt);
            insFaceStaffSignRecordService.insert(insFaceStaffSignRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insFaceStaffSignRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsFaceStaffSignRecord> add(@RequestBody InsFaceStaffSignRecord insFaceStaffSignRecord) {
        //Date currentDt = new Date();
        //insFaceStaffSignRecord.setCreatedDt(currentDt);
        //insFaceStaffSignRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insFaceStaffSignRecordService.insert(insFaceStaffSignRecord));
    }

    /**
    * 更新数据
    *
    * @param insFaceStaffSignRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsFaceStaffSignRecord> update(@RequestBody InsFaceStaffSignRecord insFaceStaffSignRecord) {
        return ResultGenerator.genSuccessResult(insFaceStaffSignRecordService.update(insFaceStaffSignRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insFaceStaffSignRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsFaceStaffSignRecord insFaceStaffSignRecord) {
        return ResultGenerator.genSuccessResult(insFaceStaffSignRecordService.deleteById(insFaceStaffSignRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsFaceStaffSignRecord> insertList) {
        return ResultGenerator.genSuccessResult(insFaceStaffSignRecordService.saveInsFaceStaffSignRecordBatch(insertList));
    }

}


