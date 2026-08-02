package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentPersonInfo;
import cn.pluss.platform.service.assessmentPersonInfo.AssessmentPersonInfoService;
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
@RequestMapping("/assessmentPersonInfo")
@Api(value = "AssessmentPersonInfo控制类",tags={"AssessmentPersonInfo接口"})
public class AssessmentPersonInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private AssessmentPersonInfoService assessmentPersonInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<AssessmentPersonInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentPersonInfo> assessmentPersonInfoList = assessmentPersonInfoService.queryPage(map);
        Integer count= assessmentPersonInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentPersonInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentPersonInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param assessmentPersonInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<AssessmentPersonInfo>> queryList(@RequestBody AssessmentPersonInfo assessmentPersonInfo) {
        List<AssessmentPersonInfo> assessmentPersonInfoList = assessmentPersonInfoService.queryList(assessmentPersonInfo);
        return ResultGenerator.genSuccessResult(assessmentPersonInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param assessmentPersonInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<AssessmentPersonInfo> queryOne(@RequestBody AssessmentPersonInfo assessmentPersonInfo) {
        return ResultGenerator.genSuccessResult(assessmentPersonInfoService.queryOne(assessmentPersonInfo));
    }

    /**
    * 保存数据
    * @param assessmentPersonInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody AssessmentPersonInfo assessmentPersonInfo) {
        //Date currentDt = new Date();
        if (assessmentPersonInfo.getId() != null && assessmentPersonInfo.getId().longValue() > 0) {
            //assessmentPersonInfo.setUpdatedDt(currentDt);
            assessmentPersonInfoService.update(assessmentPersonInfo);
        } else {
            //assessmentPersonInfo.setCreatedDt(currentDt);
            //assessmentPersonInfo.setUpdatedDt(currentDt);
            assessmentPersonInfoService.insert(assessmentPersonInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param assessmentPersonInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<AssessmentPersonInfo> add(@RequestBody AssessmentPersonInfo assessmentPersonInfo) {
        //Date currentDt = new Date();
        //assessmentPersonInfo.setCreatedDt(currentDt);
        //assessmentPersonInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(assessmentPersonInfoService.insert(assessmentPersonInfo));
    }

    /**
    * 更新数据
    *
    * @param assessmentPersonInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<AssessmentPersonInfo> update(@RequestBody AssessmentPersonInfo assessmentPersonInfo) {
        return ResultGenerator.genSuccessResult(assessmentPersonInfoService.update(assessmentPersonInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param assessmentPersonInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody AssessmentPersonInfo assessmentPersonInfo) {
        return ResultGenerator.genSuccessResult(assessmentPersonInfoService.deleteById(assessmentPersonInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<AssessmentPersonInfo> insertList) {
        return ResultGenerator.genSuccessResult(assessmentPersonInfoService.saveAssessmentPersonInfoBatch(insertList));
    }

}


