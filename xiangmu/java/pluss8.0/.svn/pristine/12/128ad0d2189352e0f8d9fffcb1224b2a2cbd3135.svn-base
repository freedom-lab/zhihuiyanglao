package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.OcTrainRecord;
import cn.pluss.platform.service.ocTrainRecord.OcTrainRecordService;
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
@RequestMapping("/ocTrainRecord")
@Api(value = "OcTrainRecord控制类",tags={"OcTrainRecord接口"})
public class OcTrainRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private OcTrainRecordService ocTrainRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<OcTrainRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<OcTrainRecord> ocTrainRecordList = ocTrainRecordService.queryPage(map);
        Integer count= ocTrainRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<OcTrainRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), ocTrainRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param ocTrainRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<OcTrainRecord>> queryList(@RequestBody OcTrainRecord ocTrainRecord) {
        List<OcTrainRecord> ocTrainRecordList = ocTrainRecordService.queryList(ocTrainRecord);
        return ResultGenerator.genSuccessResult(ocTrainRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param ocTrainRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<OcTrainRecord> queryOne(@RequestBody OcTrainRecord ocTrainRecord) {
        return ResultGenerator.genSuccessResult(ocTrainRecordService.queryOne(ocTrainRecord));
    }

    /**
    * 保存数据
    * @param ocTrainRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody OcTrainRecord ocTrainRecord) {
        //Date currentDt = new Date();
        if (ocTrainRecord.getId() != null && ocTrainRecord.getId().longValue() > 0) {
            //ocTrainRecord.setUpdatedDt(currentDt);
            ocTrainRecordService.update(ocTrainRecord);
        } else {
            //ocTrainRecord.setCreatedDt(currentDt);
            //ocTrainRecord.setUpdatedDt(currentDt);
            ocTrainRecordService.insert(ocTrainRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param ocTrainRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<OcTrainRecord> add(@RequestBody OcTrainRecord ocTrainRecord) {
        //Date currentDt = new Date();
        //ocTrainRecord.setCreatedDt(currentDt);
        //ocTrainRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(ocTrainRecordService.insert(ocTrainRecord));
    }

    /**
    * 更新数据
    *
    * @param ocTrainRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<OcTrainRecord> update(@RequestBody OcTrainRecord ocTrainRecord) {
        return ResultGenerator.genSuccessResult(ocTrainRecordService.update(ocTrainRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param ocTrainRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody OcTrainRecord ocTrainRecord) {
        return ResultGenerator.genSuccessResult(ocTrainRecordService.deleteById(ocTrainRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<OcTrainRecord> insertList) {
        return ResultGenerator.genSuccessResult(ocTrainRecordService.saveOcTrainRecordBatch(insertList));
    }

}


