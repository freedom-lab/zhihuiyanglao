package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentQuestion;
import cn.pluss.platform.service.assessmentQuestion.AssessmentQuestionService;
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
@RequestMapping("/assessmentQuestion")
@Api(value = "AssessmentQuestion控制类",tags={"AssessmentQuestion接口"})
public class AssessmentQuestionController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private AssessmentQuestionService assessmentQuestionService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<AssessmentQuestion>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentQuestion> assessmentQuestionList = assessmentQuestionService.queryPage(map);
        Integer count= assessmentQuestionService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentQuestion>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentQuestionList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param assessmentQuestion
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<AssessmentQuestion>> queryList(@RequestBody AssessmentQuestion assessmentQuestion) {
        List<AssessmentQuestion> assessmentQuestionList = assessmentQuestionService.queryList(assessmentQuestion);
        return ResultGenerator.genSuccessResult(assessmentQuestionList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param assessmentQuestion 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<AssessmentQuestion> queryOne(@RequestBody AssessmentQuestion assessmentQuestion) {
        return ResultGenerator.genSuccessResult(assessmentQuestionService.queryOne(assessmentQuestion));
    }

    /**
    * 保存数据
    * @param assessmentQuestion
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody AssessmentQuestion assessmentQuestion) {
        //Date currentDt = new Date();
        if (assessmentQuestion.getId() != null && assessmentQuestion.getId().longValue() > 0) {
            //assessmentQuestion.setUpdatedDt(currentDt);
            assessmentQuestionService.update(assessmentQuestion);
        } else {
            //assessmentQuestion.setCreatedDt(currentDt);
            //assessmentQuestion.setUpdatedDt(currentDt);
            assessmentQuestionService.insert(assessmentQuestion);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param assessmentQuestion 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<AssessmentQuestion> add(@RequestBody AssessmentQuestion assessmentQuestion) {
        //Date currentDt = new Date();
        //assessmentQuestion.setCreatedDt(currentDt);
        //assessmentQuestion.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(assessmentQuestionService.insert(assessmentQuestion));
    }

    /**
    * 更新数据
    *
    * @param assessmentQuestion 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<AssessmentQuestion> update(@RequestBody AssessmentQuestion assessmentQuestion) {
        return ResultGenerator.genSuccessResult(assessmentQuestionService.update(assessmentQuestion));
    }

    /**
    * 通过主键删除数据
    *
    * @param assessmentQuestion 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody AssessmentQuestion assessmentQuestion) {
        return ResultGenerator.genSuccessResult(assessmentQuestionService.deleteById(assessmentQuestion.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<AssessmentQuestion> insertList) {
        return ResultGenerator.genSuccessResult(assessmentQuestionService.saveAssessmentQuestionBatch(insertList));
    }

}


