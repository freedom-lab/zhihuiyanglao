package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentOption;
import cn.pluss.platform.service.assessmentOption.AssessmentOptionService;
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
@RequestMapping("/assessmentOption")
@Api(value = "AssessmentOption控制类",tags={"AssessmentOption接口"})
public class AssessmentOptionController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private AssessmentOptionService assessmentOptionService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<AssessmentOption>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentOption> assessmentOptionList = assessmentOptionService.queryPage(map);
        Integer count= assessmentOptionService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentOption>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentOptionList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param assessmentOption
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<AssessmentOption>> queryList(@RequestBody AssessmentOption assessmentOption) {
        List<AssessmentOption> assessmentOptionList = assessmentOptionService.queryList(assessmentOption);
        return ResultGenerator.genSuccessResult(assessmentOptionList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param assessmentOption 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<AssessmentOption> queryOne(@RequestBody AssessmentOption assessmentOption) {
        return ResultGenerator.genSuccessResult(assessmentOptionService.queryOne(assessmentOption));
    }

    /**
    * 保存数据
    * @param assessmentOption
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody AssessmentOption assessmentOption) {
        //Date currentDt = new Date();
        if (assessmentOption.getId() != null && assessmentOption.getId().longValue() > 0) {
            //assessmentOption.setUpdatedDt(currentDt);
            assessmentOptionService.update(assessmentOption);
        } else {
            //assessmentOption.setCreatedDt(currentDt);
            //assessmentOption.setUpdatedDt(currentDt);
            assessmentOptionService.insert(assessmentOption);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param assessmentOption 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<AssessmentOption> add(@RequestBody AssessmentOption assessmentOption) {
        //Date currentDt = new Date();
        //assessmentOption.setCreatedDt(currentDt);
        //assessmentOption.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(assessmentOptionService.insert(assessmentOption));
    }

    /**
    * 更新数据
    *
    * @param assessmentOption 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<AssessmentOption> update(@RequestBody AssessmentOption assessmentOption) {
        return ResultGenerator.genSuccessResult(assessmentOptionService.update(assessmentOption));
    }

    /**
    * 通过主键删除数据
    *
    * @param assessmentOption 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody AssessmentOption assessmentOption) {
        return ResultGenerator.genSuccessResult(assessmentOptionService.deleteById(assessmentOption.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<AssessmentOption> insertList) {
        return ResultGenerator.genSuccessResult(assessmentOptionService.saveAssessmentOptionBatch(insertList));
    }

}


