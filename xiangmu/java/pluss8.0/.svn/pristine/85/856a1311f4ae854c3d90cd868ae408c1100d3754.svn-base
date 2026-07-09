package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentDrugSituation;
import cn.pluss.platform.service.assessmentDrugSituation.AssessmentDrugSituationService;
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
@RequestMapping("/assessmentDrugSituation")
@Api(value = "AssessmentDrugSituation控制类",tags={"AssessmentDrugSituation接口"})
public class AssessmentDrugSituationController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private AssessmentDrugSituationService assessmentDrugSituationService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<AssessmentDrugSituation>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentDrugSituation> assessmentDrugSituationList = assessmentDrugSituationService.queryPage(map);
        Integer count= assessmentDrugSituationService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentDrugSituation>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentDrugSituationList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param assessmentDrugSituation
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<AssessmentDrugSituation>> queryList(@RequestBody AssessmentDrugSituation assessmentDrugSituation) {
        List<AssessmentDrugSituation> assessmentDrugSituationList = assessmentDrugSituationService.queryList(assessmentDrugSituation);
        return ResultGenerator.genSuccessResult(assessmentDrugSituationList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param assessmentDrugSituation 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<AssessmentDrugSituation> queryOne(@RequestBody AssessmentDrugSituation assessmentDrugSituation) {
        return ResultGenerator.genSuccessResult(assessmentDrugSituationService.queryOne(assessmentDrugSituation));
    }

    /**
    * 保存数据
    * @param assessmentDrugSituation
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody AssessmentDrugSituation assessmentDrugSituation) {
        //Date currentDt = new Date();
        if (assessmentDrugSituation.getId() != null && assessmentDrugSituation.getId().longValue() > 0) {
            //assessmentDrugSituation.setUpdatedDt(currentDt);
            assessmentDrugSituationService.update(assessmentDrugSituation);
        } else {
            //assessmentDrugSituation.setCreatedDt(currentDt);
            //assessmentDrugSituation.setUpdatedDt(currentDt);
            assessmentDrugSituationService.insert(assessmentDrugSituation);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param assessmentDrugSituation 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<AssessmentDrugSituation> add(@RequestBody AssessmentDrugSituation assessmentDrugSituation) {
        //Date currentDt = new Date();
        //assessmentDrugSituation.setCreatedDt(currentDt);
        //assessmentDrugSituation.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(assessmentDrugSituationService.insert(assessmentDrugSituation));
    }

    /**
    * 更新数据
    *
    * @param assessmentDrugSituation 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<AssessmentDrugSituation> update(@RequestBody AssessmentDrugSituation assessmentDrugSituation) {
        return ResultGenerator.genSuccessResult(assessmentDrugSituationService.update(assessmentDrugSituation));
    }

    /**
    * 通过主键删除数据
    *
    * @param assessmentDrugSituation 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody AssessmentDrugSituation assessmentDrugSituation) {
        return ResultGenerator.genSuccessResult(assessmentDrugSituationService.deleteById(assessmentDrugSituation.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<AssessmentDrugSituation> insertList) {
        return ResultGenerator.genSuccessResult(assessmentDrugSituationService.saveAssessmentDrugSituationBatch(insertList));
    }

}


