package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CommunityConsultationRecord;
import cn.pluss.platform.service.communityConsultationRecord.CommunityConsultationRecordService;
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
@RequestMapping("/communityConsultationRecord")
@Api(value = "CommunityConsultationRecord控制类",tags={"CommunityConsultationRecord接口"})
public class CommunityConsultationRecordController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CommunityConsultationRecordService communityConsultationRecordService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CommunityConsultationRecord>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CommunityConsultationRecord> communityConsultationRecordList = communityConsultationRecordService.queryPage(map);
        Integer count= communityConsultationRecordService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CommunityConsultationRecord>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), communityConsultationRecordList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param communityConsultationRecord
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CommunityConsultationRecord>> queryList(@RequestBody CommunityConsultationRecord communityConsultationRecord) {
        List<CommunityConsultationRecord> communityConsultationRecordList = communityConsultationRecordService.queryList(communityConsultationRecord);
        return ResultGenerator.genSuccessResult(communityConsultationRecordList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param communityConsultationRecord 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CommunityConsultationRecord> queryOne(@RequestBody CommunityConsultationRecord communityConsultationRecord) {
        return ResultGenerator.genSuccessResult(communityConsultationRecordService.queryOne(communityConsultationRecord));
    }

    /**
    * 保存数据
    * @param communityConsultationRecord
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CommunityConsultationRecord communityConsultationRecord) {
        //Date currentDt = new Date();
        if (communityConsultationRecord.getId() != null && communityConsultationRecord.getId().longValue() > 0) {
            //communityConsultationRecord.setUpdatedDt(currentDt);
            communityConsultationRecordService.update(communityConsultationRecord);
        } else {
            //communityConsultationRecord.setCreatedDt(currentDt);
            //communityConsultationRecord.setUpdatedDt(currentDt);
            communityConsultationRecordService.insert(communityConsultationRecord);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param communityConsultationRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CommunityConsultationRecord> add(@RequestBody CommunityConsultationRecord communityConsultationRecord) {
        //Date currentDt = new Date();
        //communityConsultationRecord.setCreatedDt(currentDt);
        //communityConsultationRecord.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(communityConsultationRecordService.insert(communityConsultationRecord));
    }

    /**
    * 更新数据
    *
    * @param communityConsultationRecord 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CommunityConsultationRecord> update(@RequestBody CommunityConsultationRecord communityConsultationRecord) {
        return ResultGenerator.genSuccessResult(communityConsultationRecordService.update(communityConsultationRecord));
    }

    /**
    * 通过主键删除数据
    *
    * @param communityConsultationRecord 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CommunityConsultationRecord communityConsultationRecord) {
        return ResultGenerator.genSuccessResult(communityConsultationRecordService.deleteById(communityConsultationRecord.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CommunityConsultationRecord> insertList) {
        return ResultGenerator.genSuccessResult(communityConsultationRecordService.saveCommunityConsultationRecordBatch(insertList));
    }

}


