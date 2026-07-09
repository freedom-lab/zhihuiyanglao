package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingNoticeTemplate;
import cn.pluss.platform.service.insNursingNoticeTemplate.InsNursingNoticeTemplateService;
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
@RequestMapping("/insNursingNoticeTemplate")
@Api(value = "InsNursingNoticeTemplate控制类",tags={"InsNursingNoticeTemplate接口"})
public class InsNursingNoticeTemplateController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingNoticeTemplateService insNursingNoticeTemplateService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingNoticeTemplate>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingNoticeTemplate> insNursingNoticeTemplateList = insNursingNoticeTemplateService.queryPage(map);
        Integer count= insNursingNoticeTemplateService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingNoticeTemplate>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingNoticeTemplateList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingNoticeTemplate
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingNoticeTemplate>> queryList(@RequestBody InsNursingNoticeTemplate insNursingNoticeTemplate) {
        List<InsNursingNoticeTemplate> insNursingNoticeTemplateList = insNursingNoticeTemplateService.queryList(insNursingNoticeTemplate);
        return ResultGenerator.genSuccessResult(insNursingNoticeTemplateList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingNoticeTemplate 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingNoticeTemplate> queryOne(@RequestBody InsNursingNoticeTemplate insNursingNoticeTemplate) {
        return ResultGenerator.genSuccessResult(insNursingNoticeTemplateService.queryOne(insNursingNoticeTemplate));
    }

    /**
    * 保存数据
    * @param insNursingNoticeTemplate
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingNoticeTemplate insNursingNoticeTemplate) {
        //Date currentDt = new Date();
        if (insNursingNoticeTemplate.getId() != null && insNursingNoticeTemplate.getId().longValue() > 0) {
            //insNursingNoticeTemplate.setUpdatedDt(currentDt);
            insNursingNoticeTemplateService.update(insNursingNoticeTemplate);
        } else {
            //insNursingNoticeTemplate.setCreatedDt(currentDt);
            //insNursingNoticeTemplate.setUpdatedDt(currentDt);
            insNursingNoticeTemplateService.insert(insNursingNoticeTemplate);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingNoticeTemplate 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingNoticeTemplate> add(@RequestBody InsNursingNoticeTemplate insNursingNoticeTemplate) {
        //Date currentDt = new Date();
        //insNursingNoticeTemplate.setCreatedDt(currentDt);
        //insNursingNoticeTemplate.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingNoticeTemplateService.insert(insNursingNoticeTemplate));
    }

    /**
    * 更新数据
    *
    * @param insNursingNoticeTemplate 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingNoticeTemplate> update(@RequestBody InsNursingNoticeTemplate insNursingNoticeTemplate) {
        return ResultGenerator.genSuccessResult(insNursingNoticeTemplateService.update(insNursingNoticeTemplate));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingNoticeTemplate 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingNoticeTemplate insNursingNoticeTemplate) {
        return ResultGenerator.genSuccessResult(insNursingNoticeTemplateService.deleteById(insNursingNoticeTemplate.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingNoticeTemplate> insertList) {
        return ResultGenerator.genSuccessResult(insNursingNoticeTemplateService.saveInsNursingNoticeTemplateBatch(insertList));
    }

}


