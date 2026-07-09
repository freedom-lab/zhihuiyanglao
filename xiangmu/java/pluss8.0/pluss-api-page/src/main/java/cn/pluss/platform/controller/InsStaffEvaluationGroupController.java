package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsStaffEvaluationGroup;
import cn.pluss.platform.service.insStaffEvaluationGroup.InsStaffEvaluationGroupService;
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
@RequestMapping("/insStaffEvaluationGroup")
@Api(value = "InsStaffEvaluationGroup控制类",tags={"InsStaffEvaluationGroup接口"})
public class InsStaffEvaluationGroupController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsStaffEvaluationGroupService insStaffEvaluationGroupService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsStaffEvaluationGroup>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsStaffEvaluationGroup> insStaffEvaluationGroupList = insStaffEvaluationGroupService.queryPage(map);
        Integer count= insStaffEvaluationGroupService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsStaffEvaluationGroup>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insStaffEvaluationGroupList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationGroup
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsStaffEvaluationGroup>> queryList(@RequestBody InsStaffEvaluationGroup insStaffEvaluationGroup) {
        List<InsStaffEvaluationGroup> insStaffEvaluationGroupList = insStaffEvaluationGroupService.queryList(insStaffEvaluationGroup);
        return ResultGenerator.genSuccessResult(insStaffEvaluationGroupList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insStaffEvaluationGroup 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsStaffEvaluationGroup> queryOne(@RequestBody InsStaffEvaluationGroup insStaffEvaluationGroup) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationGroupService.queryOne(insStaffEvaluationGroup));
    }

    /**
    * 保存数据
    * @param insStaffEvaluationGroup
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsStaffEvaluationGroup insStaffEvaluationGroup) {
        //Date currentDt = new Date();
        if (insStaffEvaluationGroup.getId() != null && insStaffEvaluationGroup.getId().longValue() > 0) {
            //insStaffEvaluationGroup.setUpdatedDt(currentDt);
            insStaffEvaluationGroupService.update(insStaffEvaluationGroup);
        } else {
            //insStaffEvaluationGroup.setCreatedDt(currentDt);
            //insStaffEvaluationGroup.setUpdatedDt(currentDt);
            insStaffEvaluationGroupService.insert(insStaffEvaluationGroup);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationGroup 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsStaffEvaluationGroup> add(@RequestBody InsStaffEvaluationGroup insStaffEvaluationGroup) {
        //Date currentDt = new Date();
        //insStaffEvaluationGroup.setCreatedDt(currentDt);
        //insStaffEvaluationGroup.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insStaffEvaluationGroupService.insert(insStaffEvaluationGroup));
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationGroup 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsStaffEvaluationGroup> update(@RequestBody InsStaffEvaluationGroup insStaffEvaluationGroup) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationGroupService.update(insStaffEvaluationGroup));
    }

    /**
    * 通过主键删除数据
    *
    * @param insStaffEvaluationGroup 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsStaffEvaluationGroup insStaffEvaluationGroup) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationGroupService.deleteById(insStaffEvaluationGroup.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsStaffEvaluationGroup> insertList) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationGroupService.saveInsStaffEvaluationGroupBatch(insertList));
    }

}


