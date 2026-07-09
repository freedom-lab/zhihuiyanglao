package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentAppoint;
import cn.pluss.platform.model.entity.AssessmentResult;
import cn.pluss.platform.service.assessmentAppoint.AssessmentAppointService;
import cn.pluss.platform.service.assessmentResult.AssessmentResultService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/assessmentResult")
@Api(value = "AssessmentResult控制类",tags={"AssessmentResult接口"})
public class AssessmentResultController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private AssessmentResultService assessmentResultService;

    @Resource
    private AssessmentAppointService assessmentAppointService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<AssessmentResult>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentResult> assessmentResultList = assessmentResultService.queryPage(map);
        Integer count= assessmentResultService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentResult>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentResultList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param assessmentResult
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<AssessmentResult>> queryList(@RequestBody AssessmentResult assessmentResult) {
        List<AssessmentResult> assessmentResultList = assessmentResultService.queryList(assessmentResult);
        return ResultGenerator.genSuccessResult(assessmentResultList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param assessmentResult 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<AssessmentResult> queryOne(@RequestBody AssessmentResult assessmentResult) {
        return ResultGenerator.genSuccessResult(assessmentResultService.queryOne(assessmentResult));
    }

    /**
    * 保存数据
    * @param assessmentResult
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody AssessmentResult assessmentResult) {
        //Date currentDt = new Date();
        if (assessmentResult.getId() != null && assessmentResult.getId().longValue() > 0) {
            //assessmentResult.setUpdatedDt(currentDt);
            assessmentResultService.update(assessmentResult);
        } else {
            //assessmentResult.setCreatedDt(currentDt);
            //assessmentResult.setUpdatedDt(currentDt);
            assessmentResultService.insert(assessmentResult);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param assessmentResult 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<AssessmentResult> add(@RequestBody AssessmentResult assessmentResult) {
        //Date currentDt = new Date();
        //assessmentResult.setCreatedDt(currentDt);
        //assessmentResult.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(assessmentResultService.insert(assessmentResult));
    }

    /**
    * 更新数据
    *
    * @param assessmentResult 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<AssessmentResult> update(@RequestBody AssessmentResult assessmentResult) {
        return ResultGenerator.genSuccessResult(assessmentResultService.update(assessmentResult));
    }

    /**
    * 通过主键删除数据
    *
    * @param assessmentResult 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody AssessmentResult assessmentResult) {
        return ResultGenerator.genSuccessResult(assessmentResultService.deleteById(assessmentResult.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<AssessmentResult> insertList) {
        return ResultGenerator.genSuccessResult(assessmentResultService.saveAssessmentResultBatch(insertList));
    }


    @PostMapping("/saveResult")
    @ApiOperation(value = "评估结果保存", notes = "评估结果保存", httpMethod = "POST")
    public Result saveResult(@RequestBody AssessmentResult assessmentResult) {
        if(assessmentResult.getAppointId()==null){
            return ResultGenerator.genFailResult("appointId为空");
        }
        assessmentResult.setCreateTime(new Date());
        assessmentResult.setUpdateTime(new Date());
        assessmentResult.setIsDeleted(0);
        assessmentResult.setStatus(1);
        assessmentResultService.save(assessmentResult);

        //更新appoin表状态
        AssessmentAppoint assessmentAppoint = new AssessmentAppoint();
        assessmentAppoint.setId(assessmentResult.getAppointId());
        assessmentAppoint.setAssessState("5");
        assessmentAppoint.setUpdateTime(new Date());
        assessmentAppointService.updateById(assessmentAppoint);
        return ResultGenerator.genSuccessResult();
    }

}


