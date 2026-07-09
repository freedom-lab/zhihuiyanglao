package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.MemberConsumeLog;
import cn.pluss.platform.service.memberConsumeLog.MemberConsumeLogService;
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
@RequestMapping("/memberConsumeLog")
@Api(value = "MemberConsumeLog控制类",tags={"MemberConsumeLog接口"})
public class MemberConsumeLogController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private MemberConsumeLogService memberConsumeLogService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<MemberConsumeLog>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<MemberConsumeLog> memberConsumeLogList = memberConsumeLogService.queryPage(map);
        Integer count= memberConsumeLogService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<MemberConsumeLog>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), memberConsumeLogList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param memberConsumeLog
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<MemberConsumeLog>> queryList(@RequestBody MemberConsumeLog memberConsumeLog) {
        List<MemberConsumeLog> memberConsumeLogList = memberConsumeLogService.queryList(memberConsumeLog);
        return ResultGenerator.genSuccessResult(memberConsumeLogList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param memberConsumeLog 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<MemberConsumeLog> queryOne(@RequestBody MemberConsumeLog memberConsumeLog) {
        return ResultGenerator.genSuccessResult(memberConsumeLogService.queryOne(memberConsumeLog));
    }

    /**
    * 保存数据
    * @param memberConsumeLog
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody MemberConsumeLog memberConsumeLog) {
        //Date currentDt = new Date();
        if (memberConsumeLog.getId() != null && memberConsumeLog.getId().longValue() > 0) {
            //memberConsumeLog.setUpdatedDt(currentDt);
            memberConsumeLogService.update(memberConsumeLog);
        } else {
            //memberConsumeLog.setCreatedDt(currentDt);
            //memberConsumeLog.setUpdatedDt(currentDt);
            memberConsumeLogService.insert(memberConsumeLog);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param memberConsumeLog 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<MemberConsumeLog> add(@RequestBody MemberConsumeLog memberConsumeLog) {
        //Date currentDt = new Date();
        //memberConsumeLog.setCreatedDt(currentDt);
        //memberConsumeLog.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(memberConsumeLogService.insert(memberConsumeLog));
    }

    /**
    * 更新数据
    *
    * @param memberConsumeLog 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<MemberConsumeLog> update(@RequestBody MemberConsumeLog memberConsumeLog) {
        return ResultGenerator.genSuccessResult(memberConsumeLogService.update(memberConsumeLog));
    }

    /**
    * 通过主键删除数据
    *
    * @param memberConsumeLog 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody MemberConsumeLog memberConsumeLog) {
        return ResultGenerator.genSuccessResult(memberConsumeLogService.deleteById(memberConsumeLog.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<MemberConsumeLog> insertList) {
        return ResultGenerator.genSuccessResult(memberConsumeLogService.saveMemberConsumeLogBatch(insertList));
    }

}


