package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderCheckAudit;
import cn.pluss.platform.service.insElderCheckAudit.InsElderCheckAuditService;
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
@RequestMapping("/insElderCheckAudit")
@Api(value = "InsElderCheckAudit控制类",tags={"InsElderCheckAudit接口"})
public class InsElderCheckAuditController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderCheckAuditService insElderCheckAuditService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderCheckAudit>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderCheckAudit> insElderCheckAuditList = insElderCheckAuditService.queryPage(map);
        Integer count= insElderCheckAuditService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderCheckAudit>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderCheckAuditList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderCheckAudit
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderCheckAudit>> queryList(@RequestBody InsElderCheckAudit insElderCheckAudit) {
        List<InsElderCheckAudit> insElderCheckAuditList = insElderCheckAuditService.queryList(insElderCheckAudit);
        return ResultGenerator.genSuccessResult(insElderCheckAuditList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderCheckAudit 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderCheckAudit> queryOne(@RequestBody InsElderCheckAudit insElderCheckAudit) {
        return ResultGenerator.genSuccessResult(insElderCheckAuditService.queryOne(insElderCheckAudit));
    }

    /**
    * 保存数据
    * @param insElderCheckAudit
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderCheckAudit insElderCheckAudit) {
        //Date currentDt = new Date();
        if (insElderCheckAudit.getId() != null && insElderCheckAudit.getId().longValue() > 0) {
            //insElderCheckAudit.setUpdatedDt(currentDt);
            insElderCheckAuditService.update(insElderCheckAudit);
        } else {
            //insElderCheckAudit.setCreatedDt(currentDt);
            //insElderCheckAudit.setUpdatedDt(currentDt);
            insElderCheckAuditService.insert(insElderCheckAudit);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderCheckAudit 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderCheckAudit> add(@RequestBody InsElderCheckAudit insElderCheckAudit) {
        //Date currentDt = new Date();
        //insElderCheckAudit.setCreatedDt(currentDt);
        //insElderCheckAudit.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderCheckAuditService.insert(insElderCheckAudit));
    }

    /**
    * 更新数据
    *
    * @param insElderCheckAudit 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderCheckAudit> update(@RequestBody InsElderCheckAudit insElderCheckAudit) {
        return ResultGenerator.genSuccessResult(insElderCheckAuditService.update(insElderCheckAudit));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderCheckAudit 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderCheckAudit insElderCheckAudit) {
        return ResultGenerator.genSuccessResult(insElderCheckAuditService.deleteById(insElderCheckAudit.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderCheckAudit> insertList) {
        return ResultGenerator.genSuccessResult(insElderCheckAuditService.saveInsElderCheckAuditBatch(insertList));
    }

}


