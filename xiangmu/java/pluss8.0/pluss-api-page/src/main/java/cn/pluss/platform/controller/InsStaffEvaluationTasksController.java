package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsStaffEvaluationTasks;
import cn.pluss.platform.service.insStaffEvaluationTasks.InsStaffEvaluationTasksService;
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
@RequestMapping("/insStaffEvaluationTasks")
@Api(value = "InsStaffEvaluationTasks控制类",tags={"InsStaffEvaluationTasks接口"})
public class InsStaffEvaluationTasksController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsStaffEvaluationTasksService insStaffEvaluationTasksService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsStaffEvaluationTasks>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsStaffEvaluationTasks> insStaffEvaluationTasksList = insStaffEvaluationTasksService.queryPage(map);
        Integer count= insStaffEvaluationTasksService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsStaffEvaluationTasks>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insStaffEvaluationTasksList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationTasks
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsStaffEvaluationTasks>> queryList(@RequestBody InsStaffEvaluationTasks insStaffEvaluationTasks) {
        List<InsStaffEvaluationTasks> insStaffEvaluationTasksList = insStaffEvaluationTasksService.queryList(insStaffEvaluationTasks);
        return ResultGenerator.genSuccessResult(insStaffEvaluationTasksList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insStaffEvaluationTasks 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsStaffEvaluationTasks> queryOne(@RequestBody InsStaffEvaluationTasks insStaffEvaluationTasks) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationTasksService.queryOne(insStaffEvaluationTasks));
    }

    /**
    * 保存数据
    * @param insStaffEvaluationTasks
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsStaffEvaluationTasks insStaffEvaluationTasks) {
        //Date currentDt = new Date();
        if (insStaffEvaluationTasks.getId() != null && insStaffEvaluationTasks.getId().longValue() > 0) {
            //insStaffEvaluationTasks.setUpdatedDt(currentDt);
            insStaffEvaluationTasksService.update(insStaffEvaluationTasks);
        } else {
            //insStaffEvaluationTasks.setCreatedDt(currentDt);
            //insStaffEvaluationTasks.setUpdatedDt(currentDt);
            insStaffEvaluationTasksService.insert(insStaffEvaluationTasks);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationTasks 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsStaffEvaluationTasks> add(@RequestBody InsStaffEvaluationTasks insStaffEvaluationTasks) {
        //Date currentDt = new Date();
        //insStaffEvaluationTasks.setCreatedDt(currentDt);
        //insStaffEvaluationTasks.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insStaffEvaluationTasksService.insert(insStaffEvaluationTasks));
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationTasks 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsStaffEvaluationTasks> update(@RequestBody InsStaffEvaluationTasks insStaffEvaluationTasks) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationTasksService.update(insStaffEvaluationTasks));
    }

    /**
    * 通过主键删除数据
    *
    * @param insStaffEvaluationTasks 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsStaffEvaluationTasks insStaffEvaluationTasks) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationTasksService.deleteById(insStaffEvaluationTasks.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsStaffEvaluationTasks> insertList) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationTasksService.saveInsStaffEvaluationTasksBatch(insertList));
    }

}


