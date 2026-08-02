package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentInstitutionInfo;
import cn.pluss.platform.service.assessmentInstitutionInfo.AssessmentInstitutionInfoService;
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
@RequestMapping("/assessmentInstitutionInfo")
@Api(value = "AssessmentInstitutionInfo控制类",tags={"AssessmentInstitutionInfo接口"})
public class AssessmentInstitutionInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private AssessmentInstitutionInfoService assessmentInstitutionInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<AssessmentInstitutionInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentInstitutionInfo> assessmentInstitutionInfoList = assessmentInstitutionInfoService.queryPage(map);
        Integer count= assessmentInstitutionInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentInstitutionInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentInstitutionInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param assessmentInstitutionInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<AssessmentInstitutionInfo>> queryList(@RequestBody AssessmentInstitutionInfo assessmentInstitutionInfo) {
        List<AssessmentInstitutionInfo> assessmentInstitutionInfoList = assessmentInstitutionInfoService.queryList(assessmentInstitutionInfo);
        return ResultGenerator.genSuccessResult(assessmentInstitutionInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param assessmentInstitutionInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<AssessmentInstitutionInfo> queryOne(@RequestBody AssessmentInstitutionInfo assessmentInstitutionInfo) {
        return ResultGenerator.genSuccessResult(assessmentInstitutionInfoService.queryOne(assessmentInstitutionInfo));
    }

    /**
    * 保存数据
    * @param assessmentInstitutionInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody AssessmentInstitutionInfo assessmentInstitutionInfo) {
        //Date currentDt = new Date();
        if (assessmentInstitutionInfo.getId() != null && assessmentInstitutionInfo.getId().longValue() > 0) {
            //assessmentInstitutionInfo.setUpdatedDt(currentDt);
            assessmentInstitutionInfoService.update(assessmentInstitutionInfo);
        } else {
            //assessmentInstitutionInfo.setCreatedDt(currentDt);
            //assessmentInstitutionInfo.setUpdatedDt(currentDt);
            assessmentInstitutionInfoService.insert(assessmentInstitutionInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param assessmentInstitutionInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<AssessmentInstitutionInfo> add(@RequestBody AssessmentInstitutionInfo assessmentInstitutionInfo) {
        //Date currentDt = new Date();
        //assessmentInstitutionInfo.setCreatedDt(currentDt);
        //assessmentInstitutionInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(assessmentInstitutionInfoService.insert(assessmentInstitutionInfo));
    }

    /**
    * 更新数据
    *
    * @param assessmentInstitutionInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<AssessmentInstitutionInfo> update(@RequestBody AssessmentInstitutionInfo assessmentInstitutionInfo) {
        return ResultGenerator.genSuccessResult(assessmentInstitutionInfoService.update(assessmentInstitutionInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param assessmentInstitutionInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody AssessmentInstitutionInfo assessmentInstitutionInfo) {
        return ResultGenerator.genSuccessResult(assessmentInstitutionInfoService.deleteById(assessmentInstitutionInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<AssessmentInstitutionInfo> insertList) {
        return ResultGenerator.genSuccessResult(assessmentInstitutionInfoService.saveAssessmentInstitutionInfoBatch(insertList));
    }

}


