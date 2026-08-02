package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsStaffEvaluationTemplate;
import cn.pluss.platform.service.insStaffEvaluationTemplate.InsStaffEvaluationTemplateService;
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
@RequestMapping("/insStaffEvaluationTemplate")
@Api(value = "InsStaffEvaluationTemplate控制类",tags={"InsStaffEvaluationTemplate接口"})
public class InsStaffEvaluationTemplateController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsStaffEvaluationTemplateService insStaffEvaluationTemplateService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsStaffEvaluationTemplate>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsStaffEvaluationTemplate> insStaffEvaluationTemplateList = insStaffEvaluationTemplateService.queryPage(map);
        Integer count= insStaffEvaluationTemplateService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsStaffEvaluationTemplate>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insStaffEvaluationTemplateList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationTemplate
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsStaffEvaluationTemplate>> queryList(@RequestBody InsStaffEvaluationTemplate insStaffEvaluationTemplate) {
        List<InsStaffEvaluationTemplate> insStaffEvaluationTemplateList = insStaffEvaluationTemplateService.queryList(insStaffEvaluationTemplate);
        return ResultGenerator.genSuccessResult(insStaffEvaluationTemplateList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insStaffEvaluationTemplate 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsStaffEvaluationTemplate> queryOne(@RequestBody InsStaffEvaluationTemplate insStaffEvaluationTemplate) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationTemplateService.queryOne(insStaffEvaluationTemplate));
    }

    /**
    * 保存数据
    * @param insStaffEvaluationTemplate
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsStaffEvaluationTemplate insStaffEvaluationTemplate) {
        //Date currentDt = new Date();
        if (insStaffEvaluationTemplate.getId() != null && insStaffEvaluationTemplate.getId().longValue() > 0) {
            //insStaffEvaluationTemplate.setUpdatedDt(currentDt);
            insStaffEvaluationTemplateService.update(insStaffEvaluationTemplate);
        } else {
            //insStaffEvaluationTemplate.setCreatedDt(currentDt);
            //insStaffEvaluationTemplate.setUpdatedDt(currentDt);
            insStaffEvaluationTemplateService.insert(insStaffEvaluationTemplate);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationTemplate 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsStaffEvaluationTemplate> add(@RequestBody InsStaffEvaluationTemplate insStaffEvaluationTemplate) {
        //Date currentDt = new Date();
        //insStaffEvaluationTemplate.setCreatedDt(currentDt);
        //insStaffEvaluationTemplate.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insStaffEvaluationTemplateService.insert(insStaffEvaluationTemplate));
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationTemplate 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsStaffEvaluationTemplate> update(@RequestBody InsStaffEvaluationTemplate insStaffEvaluationTemplate) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationTemplateService.update(insStaffEvaluationTemplate));
    }

    /**
    * 通过主键删除数据
    *
    * @param insStaffEvaluationTemplate 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsStaffEvaluationTemplate insStaffEvaluationTemplate) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationTemplateService.deleteById(insStaffEvaluationTemplate.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsStaffEvaluationTemplate> insertList) {
        return ResultGenerator.genSuccessResult(insStaffEvaluationTemplateService.saveInsStaffEvaluationTemplateBatch(insertList));
    }

}


