package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsDonateRecord;
import cn.pluss.platform.service.insDonateRecord.InsDonateRecordService;
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
@RequestMapping("/insDonateRecord")
@Api(value = "InsDonateRecord控制类",tags={"InsDonateRecord接口"})
public class InsDonateRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsDonateRecordService insDonateRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsDonateRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsDonateRecord> insDonateRecordList = insDonateRecordService.queryPage(map);
        Integer count= insDonateRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsDonateRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insDonateRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insDonateRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsDonateRecord>> queryList(@RequestBody InsDonateRecord insDonateRecord) {
        List<InsDonateRecord> insDonateRecordList = insDonateRecordService.queryList(insDonateRecord);
        return ResultGenerator.genSuccessResult(insDonateRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insDonateRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsDonateRecord> queryOne(@RequestBody InsDonateRecord insDonateRecord) {
        return ResultGenerator.genSuccessResult(insDonateRecordService.queryOne(insDonateRecord));
    }

    /**
    * 保存数据
    * @param insDonateRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsDonateRecord insDonateRecord) {
        //Date currentDt = new Date();
        if (insDonateRecord.getId() != null && insDonateRecord.getId().longValue() > 0) {
            //insDonateRecord.setUpdatedDt(currentDt);
            insDonateRecordService.update(insDonateRecord);
        } else {
            //insDonateRecord.setCreatedDt(currentDt);
            //insDonateRecord.setUpdatedDt(currentDt);
            insDonateRecordService.insert(insDonateRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insDonateRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsDonateRecord> add(@RequestBody InsDonateRecord insDonateRecord) {
        //Date currentDt = new Date();
        //insDonateRecord.setCreatedDt(currentDt);
        //insDonateRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insDonateRecordService.insert(insDonateRecord));
    }

    /**
    * 更新数据
    *
    * @param insDonateRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsDonateRecord> update(@RequestBody InsDonateRecord insDonateRecord) {
        return ResultGenerator.genSuccessResult(insDonateRecordService.update(insDonateRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param insDonateRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsDonateRecord insDonateRecord) {
        return ResultGenerator.genSuccessResult(insDonateRecordService.deleteById(insDonateRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsDonateRecord> insertList) {
        return ResultGenerator.genSuccessResult(insDonateRecordService.saveInsDonateRecordBatch(insertList));
    }

}


