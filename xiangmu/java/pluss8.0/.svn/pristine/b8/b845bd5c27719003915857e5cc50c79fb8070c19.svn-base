package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsHealthPhysicalReport;
import cn.pluss.platform.service.insHealthPhysicalReport.InsHealthPhysicalReportService;
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
@RequestMapping("/insHealthPhysicalReport")
@Api(value = "InsHealthPhysicalReport控制类",tags={"InsHealthPhysicalReport接口"})
public class InsHealthPhysicalReportController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsHealthPhysicalReportService insHealthPhysicalReportService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsHealthPhysicalReport>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsHealthPhysicalReport> insHealthPhysicalReportList = insHealthPhysicalReportService.queryPage(map);
        Integer count= insHealthPhysicalReportService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsHealthPhysicalReport>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insHealthPhysicalReportList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insHealthPhysicalReport
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsHealthPhysicalReport>> queryList(@RequestBody InsHealthPhysicalReport insHealthPhysicalReport) {
        List<InsHealthPhysicalReport> insHealthPhysicalReportList = insHealthPhysicalReportService.queryList(insHealthPhysicalReport);
        return ResultGenerator.genSuccessResult(insHealthPhysicalReportList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insHealthPhysicalReport 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsHealthPhysicalReport> queryOne(@RequestBody InsHealthPhysicalReport insHealthPhysicalReport) {
        return ResultGenerator.genSuccessResult(insHealthPhysicalReportService.queryOne(insHealthPhysicalReport));
    }

    /**
    * 保存数据
    * @param insHealthPhysicalReport
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsHealthPhysicalReport insHealthPhysicalReport) {
        //Date currentDt = new Date();
        if (insHealthPhysicalReport.getId() != null && insHealthPhysicalReport.getId().longValue() > 0) {
            //insHealthPhysicalReport.setUpdatedDt(currentDt);
            insHealthPhysicalReportService.update(insHealthPhysicalReport);
        } else {
            //insHealthPhysicalReport.setCreatedDt(currentDt);
            //insHealthPhysicalReport.setUpdatedDt(currentDt);
            insHealthPhysicalReportService.insert(insHealthPhysicalReport);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insHealthPhysicalReport 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsHealthPhysicalReport> add(@RequestBody InsHealthPhysicalReport insHealthPhysicalReport) {
        //Date currentDt = new Date();
        //insHealthPhysicalReport.setCreatedDt(currentDt);
        //insHealthPhysicalReport.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insHealthPhysicalReportService.insert(insHealthPhysicalReport));
    }

    /**
    * 更新数据
    *
    * @param insHealthPhysicalReport 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsHealthPhysicalReport> update(@RequestBody InsHealthPhysicalReport insHealthPhysicalReport) {
        return ResultGenerator.genSuccessResult(insHealthPhysicalReportService.update(insHealthPhysicalReport));
    }

    /**
    * 通过主键删除数据
    *
    * @param insHealthPhysicalReport 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsHealthPhysicalReport insHealthPhysicalReport) {
        return ResultGenerator.genSuccessResult(insHealthPhysicalReportService.deleteById(insHealthPhysicalReport.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsHealthPhysicalReport> insertList) {
        return ResultGenerator.genSuccessResult(insHealthPhysicalReportService.saveInsHealthPhysicalReportBatch(insertList));
    }

}


