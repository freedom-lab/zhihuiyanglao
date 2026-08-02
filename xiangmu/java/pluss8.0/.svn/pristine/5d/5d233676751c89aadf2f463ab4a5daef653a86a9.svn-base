package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentStandard;
import cn.pluss.platform.service.assessmentStandard.AssessmentStandardService;
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
@RequestMapping("/assessmentStandard")
@Api(value = "AssessmentStandard控制类",tags={"AssessmentStandard接口"})
public class AssessmentStandardController{
    private Logger logger = Logger.getLogger(this.getClass());

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
    public Result<PageInfo<AssessmentStandard>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentStandard> assessmentStandardList = assessmentStandardService.queryPage(map);
        Integer count= assessmentStandardService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentStandard>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentStandardList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param assessmentStandard
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<AssessmentStandard>> queryList(@RequestBody AssessmentStandard assessmentStandard) {
        List<AssessmentStandard> assessmentStandardList = assessmentStandardService.queryList(assessmentStandard);
        return ResultGenerator.genSuccessResult(assessmentStandardList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param assessmentStandard 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<AssessmentStandard> queryOne(@RequestBody AssessmentStandard assessmentStandard) {
        return ResultGenerator.genSuccessResult(assessmentStandardService.queryOne(assessmentStandard));
    }

    /**
    * 保存数据
    * @param assessmentStandard
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody AssessmentStandard assessmentStandard) {
        //Date currentDt = new Date();
        if (assessmentStandard.getId() != null && assessmentStandard.getId().longValue() > 0) {
            //assessmentStandard.setUpdatedDt(currentDt);
            assessmentStandardService.update(assessmentStandard);
        } else {
            //assessmentStandard.setCreatedDt(currentDt);
            //assessmentStandard.setUpdatedDt(currentDt);
            assessmentStandardService.insert(assessmentStandard);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param assessmentStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<AssessmentStandard> add(@RequestBody AssessmentStandard assessmentStandard) {
        //Date currentDt = new Date();
        //assessmentStandard.setCreatedDt(currentDt);
        //assessmentStandard.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(assessmentStandardService.insert(assessmentStandard));
    }

    /**
    * 更新数据
    *
    * @param assessmentStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<AssessmentStandard> update(@RequestBody AssessmentStandard assessmentStandard) {
        return ResultGenerator.genSuccessResult(assessmentStandardService.update(assessmentStandard));
    }

    /**
    * 通过主键删除数据
    *
    * @param assessmentStandard 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody AssessmentStandard assessmentStandard) {
        return ResultGenerator.genSuccessResult(assessmentStandardService.deleteById(assessmentStandard.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<AssessmentStandard> insertList) {
        return ResultGenerator.genSuccessResult(assessmentStandardService.saveAssessmentStandardBatch(insertList));
    }

}


