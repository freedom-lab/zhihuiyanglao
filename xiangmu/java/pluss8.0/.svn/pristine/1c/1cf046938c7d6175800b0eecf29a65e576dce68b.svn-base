package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentAppoint;
import cn.pluss.platform.service.assessmentAppoint.AssessmentAppointService;
import cn.pluss.platform.service.assessmentElderBase.AssessmentElderBaseService;
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
@RequestMapping("/assessmentAppoint")
@Api(value = "AssessmentAppoint控制类",tags={"AssessmentAppoint接口"})
public class AssessmentAppointController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private AssessmentAppointService assessmentAppointService;

    @Resource
    private AssessmentElderBaseService assessmentElderBaseService;
    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<AssessmentAppoint>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentAppoint> assessmentAppointList = assessmentAppointService.queryPage(map);
        Integer count= assessmentAppointService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentAppoint>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentAppointList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param assessmentAppoint
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<AssessmentAppoint>> queryList(@RequestBody AssessmentAppoint assessmentAppoint) {
        List<AssessmentAppoint> assessmentAppointList = assessmentAppointService.queryList(assessmentAppoint);
        return ResultGenerator.genSuccessResult(assessmentAppointList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param assessmentAppoint 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<AssessmentAppoint> queryOne(@RequestBody AssessmentAppoint assessmentAppoint) {
        return ResultGenerator.genSuccessResult(assessmentAppointService.queryOne(assessmentAppoint));
    }

    /**
    * 保存数据
    * @param assessmentAppoint
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody AssessmentAppoint assessmentAppoint) {
        //Date currentDt = new Date();
        if (assessmentAppoint.getId() != null && assessmentAppoint.getId().longValue() > 0) {
            //assessmentAppoint.setUpdatedDt(currentDt);
            assessmentAppointService.update(assessmentAppoint);
        } else {
            //assessmentAppoint.setCreatedDt(currentDt);
            //assessmentAppoint.setUpdatedDt(currentDt);
            assessmentAppointService.insert(assessmentAppoint);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param assessmentAppoint 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<AssessmentAppoint> add(@RequestBody AssessmentAppoint assessmentAppoint) {
        //Date currentDt = new Date();
        //assessmentAppoint.setCreatedDt(currentDt);
        //assessmentAppoint.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(assessmentAppointService.insert(assessmentAppoint));
    }

    /**
    * 更新数据
    *
    * @param assessmentAppoint 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<AssessmentAppoint> update(@RequestBody AssessmentAppoint assessmentAppoint) {
        return ResultGenerator.genSuccessResult(assessmentAppointService.update(assessmentAppoint));
    }

    /**
    * 通过主键删除数据
    *
    * @param assessmentAppoint 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody AssessmentAppoint assessmentAppoint) {
        return ResultGenerator.genSuccessResult(assessmentAppointService.deleteById(assessmentAppoint.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<AssessmentAppoint> insertList) {
        return ResultGenerator.genSuccessResult(assessmentAppointService.saveAssessmentAppointBatch(insertList));
    }
    /**
     * 创建评估任务
     * @param assessmentAppoint 实例对象
     * @return 实例对象
     */
    @PostMapping("/createAssessmentAppoint")
    @ApiOperation(value = "创建评估任务", notes = "创建评估任务", httpMethod = "POST")
    public Result<AssessmentAppoint> createAssessmentAppoint(@RequestBody AssessmentAppoint assessmentAppoint) {
        String assessCode="PG"+StringUtil.getBillno();
        AssessmentAppoint insert = assessmentAppointService.insert(assessmentAppoint);
        //1.保存基本登记信息
        assessmentAppoint.getAssessmentElderBase().setAppointId(insert.getId());
        assessmentElderBaseService.insert(assessmentAppoint.getAssessmentElderBase());

        Date currentDt = new Date();
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 评估任务查询
     * @param pageQueryInfo
     * @return
     */
    @PostMapping("/queryTask")
    @ApiOperation(value = "评估任务查询", notes = "评估任务查询", httpMethod = "POST")
    public Result<PageInfo<AssessmentAppoint>> queryTask(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentAppoint> assessmentAppointList = assessmentAppointService.queryTaskPage(map);
        Integer count= assessmentAppointService.queryTaskPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentAppoint>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentAppointList);
        return ResultGenerator.genSuccessResult(pager);
    }


    /**
     * 评估结果查询
     * @param pageQueryInfo
     * @return
     */
    @PostMapping("/queryResult")
    @ApiOperation(value = "评估结果查询", notes = "评估结果查询", httpMethod = "POST")
    public Result<PageInfo<AssessmentAppoint>> queryResult(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<AssessmentAppoint> assessmentAppointList = assessmentAppointService.queryResultPage(map);
        Integer count= assessmentAppointService.queryResultPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<AssessmentAppoint>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), assessmentAppointList);
        return ResultGenerator.genSuccessResult(pager);
    }
}


