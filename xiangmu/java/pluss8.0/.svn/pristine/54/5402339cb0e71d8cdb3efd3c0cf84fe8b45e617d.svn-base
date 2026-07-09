package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentOption;
import cn.pluss.platform.model.entity.AssessmentQuestion;
import cn.pluss.platform.model.entity.AssessmentStandard;
import cn.pluss.platform.model.entity.AssessmentTemplate;
import cn.pluss.platform.service.assessmentOption.AssessmentOptionService;
import cn.pluss.platform.service.assessmentQuestion.AssessmentQuestionService;
import cn.pluss.platform.service.assessmentStandard.AssessmentStandardService;
import cn.pluss.platform.service.assessmentTemplate.AssessmentTemplateService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/assessmentTemplate")
@Api(value = "AssessmentTemplate控制类",tags={"AssessmentTemplate接口"})
public class AssessmentTemplateController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private AssessmentTemplateService assessmentTemplateService;
    @Resource
    private AssessmentQuestionService assessmentQuestionService;

    @Resource
    private AssessmentOptionService assessmentOptionService;
    @Resource
    private AssessmentStandardService assessmentStandardService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<AssessmentTemplate>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentTemplate> assessmentTemplateList = assessmentTemplateService.queryPage(map);
        Integer count= assessmentTemplateService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentTemplate>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentTemplateList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param assessmentTemplate
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<AssessmentTemplate>> queryList(@RequestBody AssessmentTemplate assessmentTemplate) {
        List<AssessmentTemplate> assessmentTemplateList = assessmentTemplateService.queryList(assessmentTemplate);
        return ResultGenerator.genSuccessResult(assessmentTemplateList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param assessmentTemplate 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<AssessmentTemplate> queryOne(@RequestBody AssessmentTemplate assessmentTemplate) {
        return ResultGenerator.genSuccessResult(assessmentTemplateService.queryOne(assessmentTemplate));
    }

    /**
    * 保存数据
    * @param assessmentTemplate
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody AssessmentTemplate assessmentTemplate) {
        //Date currentDt = new Date();
        if (assessmentTemplate.getId() != null && assessmentTemplate.getId().longValue() > 0) {
            //assessmentTemplate.setUpdatedDt(currentDt);
            assessmentTemplateService.update(assessmentTemplate);
        } else {
            //assessmentTemplate.setCreatedDt(currentDt);
            //assessmentTemplate.setUpdatedDt(currentDt);
            assessmentTemplateService.insert(assessmentTemplate);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param assessmentTemplate 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<AssessmentTemplate> add(@RequestBody AssessmentTemplate assessmentTemplate) {
        //Date currentDt = new Date();
        //assessmentTemplate.setCreatedDt(currentDt);
        //assessmentTemplate.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(assessmentTemplateService.insert(assessmentTemplate));
    }

    /**
    * 更新数据
    *
    * @param assessmentTemplate 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<AssessmentTemplate> update(@RequestBody AssessmentTemplate assessmentTemplate) {
        return ResultGenerator.genSuccessResult(assessmentTemplateService.update(assessmentTemplate));
    }

    /**
    * 通过主键删除数据
    *
    * @param assessmentTemplate 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody AssessmentTemplate assessmentTemplate) {
        return ResultGenerator.genSuccessResult(assessmentTemplateService.deleteById(assessmentTemplate.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<AssessmentTemplate> insertList) {
        return ResultGenerator.genSuccessResult(assessmentTemplateService.saveAssessmentTemplateBatch(insertList));
    }

    /**
     * 保存评估模版
     *
     * @param assessmentTemplate
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/saveAssessmentTemplate")
    @ApiOperation(value = "保存评估模版数据", notes = "保存评估模版数据", httpMethod = "POST")
    public Result saveAssessmentTemplate(@RequestBody AssessmentTemplate assessmentTemplate) {
        Date currentDt = new Date();
        if (assessmentTemplate.getId() != null && assessmentTemplate.getId().longValue() > 0) {
            assessmentTemplate.setUpdateTime(currentDt);
            assessmentTemplateService.update(assessmentTemplate);
            //更新评估问题列表
            if (!CollectionUtils.isEmpty(assessmentTemplate.getAssessmentQuestions())) {
                // 区分新增和更新的问题
                List<AssessmentQuestion> newQuestions = new ArrayList<>();
                List<AssessmentQuestion> updateQuestions = new ArrayList<>();
                // 记录新增问题的引用，用于后续选项处理
                java.util.Set<AssessmentQuestion> newQuestionSet = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap<>());
                for (AssessmentQuestion assessmentQuestion : assessmentTemplate.getAssessmentQuestions()) {
                    assessmentQuestion.setUpdateTime(currentDt);
                    if (assessmentQuestion.getId() != null && assessmentQuestion.getId() > 0) {
                        updateQuestions.add(assessmentQuestion);
                    } else {
                        assessmentQuestion.setTemplateId(assessmentTemplate.getId());
                        assessmentQuestion.setCreateTime(currentDt);
                        assessmentQuestion.setIsDeleted(0);
                        newQuestions.add(assessmentQuestion);
                        newQuestionSet.add(assessmentQuestion);
                    }
                }
                if (!updateQuestions.isEmpty()) {
                    assessmentQuestionService.updateBatchById(updateQuestions);
                }
                if (!newQuestions.isEmpty()) {
                    // insertBatch后，ASSIGN_ID会自动回填id到对象
                    assessmentQuestionService.insertBatch(newQuestions);
                }

                // 收集所有选项
                List<AssessmentOption> newOptions = new ArrayList<>();
                List<AssessmentOption> updateOptions = new ArrayList<>();
                for (AssessmentQuestion question : assessmentTemplate.getAssessmentQuestions()) {
                    List<AssessmentOption> options = question.getAssessmentOptions();
                    if (!CollectionUtils.isEmpty(options)) {
                        if (newQuestionSet.contains(question)) {
                            // 问题为新增 其选项全部为新增，关联回填的questionId
                            for (AssessmentOption option : options) {
                                option.setQuestionId(question.getId());
                                option.setCreateTime(currentDt);
                                option.setUpdateTime(currentDt);
                                option.setIsDeleted(0);
                                newOptions.add(option);
                            }
                        } else {
                            // 问题为更新 需判断每个选项是新增还是更新
                            for (AssessmentOption option : options) {
                                option.setUpdateTime(currentDt);
                                option.setQuestionId(question.getId());
                                if (option.getId() != null && option.getId() > 0) {
                                    updateOptions.add(option);
                                } else {
                                    option.setCreateTime(currentDt);
                                    option.setUpdateTime(currentDt);
                                    option.setIsDeleted(0);
                                    newOptions.add(option);
                                }
                            }
                        }
                    }
                }
                if (!updateOptions.isEmpty()) {
                    assessmentOptionService.updateBatchById(updateOptions);
                }
                if (!newOptions.isEmpty()) {
                    assessmentOptionService.insertBatch(newOptions);
                }
            }
            //更新评估标准列表
            if (!CollectionUtils.isEmpty(assessmentTemplate.getAssessmentStandards())) {
                List<AssessmentStandard> newStandards = new ArrayList<>();
                List<AssessmentStandard> updateStandards = new ArrayList<>();
                assessmentTemplate.getAssessmentStandards().forEach(assessmentStandard -> {
                    assessmentStandard.setUpdateTime(currentDt);
                    if (assessmentStandard.getId() != null && assessmentStandard.getId() > 0) {
                        updateStandards.add(assessmentStandard);
                    } else {
                        assessmentStandard.setTemplateId(assessmentTemplate.getId());
                        assessmentStandard.setCreateTime(currentDt);
                        assessmentStandard.setUpdateTime(currentDt);
                        assessmentStandard.setIsDeleted(0);
                        newStandards.add(assessmentStandard);
                    }
                });
                if (!updateStandards.isEmpty()) {
                    assessmentStandardService.updateBatchById(updateStandards);
                }
                if (!newStandards.isEmpty()) {
                    assessmentStandardService.insertBatch(newStandards);
                }
            }
        } else {
            assessmentTemplate.setCreateTime(currentDt);
            assessmentTemplate.setUpdateTime(currentDt);
            AssessmentTemplate insert = assessmentTemplateService.insert(assessmentTemplate);
            //处理评估问题列表
            if (!CollectionUtils.isEmpty(assessmentTemplate.getAssessmentQuestions())) {
                for (AssessmentQuestion assessmentQuestion : assessmentTemplate.getAssessmentQuestions()) {
                    assessmentQuestion.setTemplateId(insert.getId());
                    assessmentQuestion.setCreateTime(currentDt);
                    assessmentQuestion.setUpdateTime(currentDt);
                    assessmentQuestion.setIsDeleted(0);
                }
                assessmentQuestionService.insertBatch(assessmentTemplate.getAssessmentQuestions());
                List<AssessmentOption> allOptions = new ArrayList<>();
                for (AssessmentQuestion question : assessmentTemplate.getAssessmentQuestions()) {
                    Long questionId = question.getId();
                    List<AssessmentOption> options = question.getAssessmentOptions();
                    if (!CollectionUtils.isEmpty(options)) {
                        for (AssessmentOption option : options) {
                            option.setQuestionId(questionId);
                            option.setCreateTime(currentDt);
                            option.setUpdateTime(currentDt);
                            option.setIsDeleted(0);
                        }
                        allOptions.addAll(options);
                    }
                }
                //处理评估选项
                if (!CollectionUtils.isEmpty(allOptions)) {
                    assessmentOptionService.insertBatch(allOptions);
                }
            }
            if (!CollectionUtils.isEmpty(assessmentTemplate.getAssessmentStandards())) {
                assessmentTemplate.getAssessmentStandards().forEach(assessmentStandard -> {
                    assessmentStandard.setTemplateId(insert.getId());
                    assessmentStandard.setCreateTime(currentDt);
                    assessmentStandard.setUpdateTime(currentDt);
                    assessmentStandard.setIsDeleted(0);
                });
                assessmentStandardService.insertBatch(assessmentTemplate.getAssessmentStandards());
            }
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 根据条件获取集合
     * @param assessmentTemplate
     * @return
     */
    @PostMapping("/queryAssessmentTemplate")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<AssessmentTemplate> queryAssessmentTemplate(@RequestBody AssessmentTemplate assessmentTemplate) {
        AssessmentTemplate detail = assessmentTemplateService.queryOne(assessmentTemplate);
        if (detail != null) {
            //查询评估问题列表
            AssessmentQuestion queryQuestion = new AssessmentQuestion();
            queryQuestion.setTemplateId(assessmentTemplate.getId());
            queryQuestion.setIsDeleted(assessmentTemplate.getIsDeleted());
            List<AssessmentQuestion> assessmentQuestionList = assessmentQuestionService.queryAssessmentQuestionsByTemplateId(queryQuestion);
            if (!CollectionUtils.isEmpty(assessmentQuestionList)) {
                // 1. 收集所有 questionId
                List<Long> questionIds = assessmentQuestionList.stream()
                        .map(AssessmentQuestion::getId)
                        .collect(Collectors.toList());

                // 2. 一次性批量查出所有选项，按 questionId 分组
                List<AssessmentOption> allOptions = assessmentOptionService.selectByQuestionIds(questionIds);
                Map<Long, List<AssessmentOption>> optionMap = new HashMap<>();
                if (!CollectionUtils.isEmpty(allOptions)) {
                    for (AssessmentOption option : allOptions) {
                        List<AssessmentOption> list = optionMap.get(option.getQuestionId());
                        if (list == null) {
                            list = new ArrayList<>();
                            optionMap.put(option.getQuestionId(), list);
                        }
                        list.add(option);
                    }
                }
                // 3. 赋值
                for (AssessmentQuestion assessmentQuestion : assessmentQuestionList) {
                    assessmentQuestion.setAssessmentOptions(
                            optionMap.getOrDefault(assessmentQuestion.getId(), Collections.emptyList())
                    );
                }
            }
            detail.setAssessmentQuestions(assessmentQuestionList);
            //查询评估标准列表
            detail.setAssessmentStandards(assessmentStandardService.queryAssessmentStandardsByTemplateId(detail.getId()));
        }
        return ResultGenerator.genSuccessResult(detail);
    }

    /**
     * 根据多个模板ID获取模板数据（包含问题、选项、标准）
     * @param assessmentTemplate 模板ID列表
     * @return 多个模板完整数据
     */
    @PostMapping("/queryAssessmentTemplateList")
    @ApiOperation(value = "根据多个模板ID获取模板数据", notes = "批量获取模板及其问题、选项、标准数据", httpMethod = "POST")
    public Result queryAssessmentTemplateList(@RequestBody AssessmentTemplate assessmentTemplate) {
        String templateIdss = assessmentTemplate.getTemplateIds();
        if (StringUtil.isEmpty(templateIdss)) {
            return ResultGenerator.genFailResult("模板ID列表为空");
        }
        List<Long> templateIds = Arrays.stream(templateIdss.split(",")).map(Long::parseLong).collect(Collectors.toList());
        // 1. 批量查询模板
        List<AssessmentTemplate> templateList = assessmentTemplateService.listByIds(templateIds);
        if (CollectionUtils.isEmpty(templateList)) {
            return ResultGenerator.genSuccessResult(Collections.emptyList());
        }

        // 2. 批量查询所有模板的问题列表
        List<AssessmentQuestion> allQuestions = assessmentQuestionService.queryAssessmentQuestionsByTemplateIds(templateIds);
        // 按 templateId 分组
        Map<Long, List<AssessmentQuestion>> questionMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(allQuestions)) {
            for (AssessmentQuestion question : allQuestions) {
                List<AssessmentQuestion> list = questionMap.get(question.getTemplateId());
                if (list == null) {
                    list = new ArrayList<>();
                    questionMap.put(question.getTemplateId(), list);
                }
                list.add(question);
            }
        }

        // 3. 批量查询所有选项，按 questionId 分组
        Map<Long, List<AssessmentOption>> optionMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(allQuestions)) {
            List<Long> questionIds = allQuestions.stream()
                    .map(AssessmentQuestion::getId)
                    .collect(Collectors.toList());
            List<AssessmentOption> allOptions = assessmentOptionService.selectByQuestionIds(questionIds);
            if (!CollectionUtils.isEmpty(allOptions)) {
                for (AssessmentOption option : allOptions) {
                    List<AssessmentOption> list = optionMap.get(option.getQuestionId());
                    if (list == null) {
                        list = new ArrayList<>();
                        optionMap.put(option.getQuestionId(), list);
                    }
                    list.add(option);
                }
            }
        }

        // 4. 批量查询所有模板的评估标准
        List<AssessmentStandard> allStandards = assessmentStandardService.queryAssessmentStandardsByTemplateIds(templateIds);
        Map<Long, List<AssessmentStandard>> standardMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(allStandards)) {
            for (AssessmentStandard standard : allStandards) {
                List<AssessmentStandard> list = standardMap.get(standard.getTemplateId());
                if (list == null) {
                    list = new ArrayList<>();
                    standardMap.put(standard.getTemplateId(), list);
                }
                list.add(standard);
            }
        }

        // 5. 组装数据
        for (AssessmentTemplate template : templateList) {
            List<AssessmentQuestion> questions = questionMap.getOrDefault(template.getId(), Collections.emptyList());
            for (AssessmentQuestion question : questions) {
                question.setAssessmentOptions(
                        optionMap.getOrDefault(question.getId(), Collections.emptyList())
                );
            }
            template.setAssessmentQuestions(questions);
            template.setAssessmentStandards(
                    standardMap.getOrDefault(template.getId(), Collections.emptyList())
            );
        }

        return ResultGenerator.genSuccessResult(templateList);
    }

    /**
     *
     * @param assessmentTemplate
     * @return
     */
    @PostMapping("/updateAssessmentTemplate")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result deleteAssessmentTemplate(@RequestBody AssessmentTemplate assessmentTemplate) {
        assessmentTemplateService.updateById(assessmentTemplate);
        //查询评估问题列表
        AssessmentQuestion queryQuestion = new AssessmentQuestion();
        queryQuestion.setTemplateId(assessmentTemplate.getId());
        List<AssessmentQuestion> assessmentQuestionList = assessmentQuestionService.queryAssessmentQuestionsByTemplateId(queryQuestion);

        if (!CollectionUtils.isEmpty(assessmentQuestionList)) {
            // 删除评估问题列表
            for (AssessmentQuestion assessmentQuestion : assessmentQuestionList) {
                assessmentQuestion.setIsDeleted(assessmentTemplate.getIsDeleted());
            }
            // 1. 收集所有 questionId
            List<Long> questionIds = assessmentQuestionList.stream()
                    .map(AssessmentQuestion::getId)
                    .collect(Collectors.toList());

            // 2. 一次性批量查出所有选项，按 questionId 分组
            List<AssessmentOption> allOptions = assessmentOptionService.selectByQuestionIds(questionIds);
            if (!CollectionUtils.isEmpty(allOptions)) {
                for (AssessmentOption option : allOptions) {
                    option.setIsDeleted(assessmentTemplate.getIsDeleted());
                }
                assessmentOptionService.updateBatchById(allOptions);
            }
            assessmentQuestionService.updateBatchById(assessmentQuestionList);
        }
        //查询评估标准列表
        List<AssessmentStandard> assessmentStandards = assessmentStandardService.queryAssessmentStandardsByTemplateId(assessmentTemplate.getId());
        if (!CollectionUtils.isEmpty(assessmentStandards)) {
            // 删除评估标准列表
            for (AssessmentStandard assessmentStandard : assessmentStandards) {
                assessmentStandard.setIsDeleted(assessmentTemplate.getIsDeleted());
            }
            assessmentStandardService.updateBatchById(assessmentStandards);
        }
        return ResultGenerator.genSuccessResult();
    }
}


