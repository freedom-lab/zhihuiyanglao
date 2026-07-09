package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderContractInfo;
import cn.pluss.platform.service.insBaseContractTemplate.InsBaseContractTemplateService;
import cn.pluss.platform.service.insElderContractInfo.InsElderContractInfoService;
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
@RequestMapping("/insElderContractInfo")
@Api(value = "InsElderContractInfo控制类",tags={"InsElderContractInfo接口"})
public class InsElderContractInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderContractInfoService insElderContractInfoService;

    @Resource
    private InsBaseContractTemplateService insBaseContractTemplateService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderContractInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderContractInfo> insElderContractInfoList = insElderContractInfoService.queryPage(map);
        Integer count= insElderContractInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderContractInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderContractInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderContractInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderContractInfo>> queryList(@RequestBody InsElderContractInfo insElderContractInfo) {
        List<InsElderContractInfo> insElderContractInfoList = insElderContractInfoService.queryList(insElderContractInfo);
        return ResultGenerator.genSuccessResult(insElderContractInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderContractInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderContractInfo> queryOne(@RequestBody InsElderContractInfo insElderContractInfo) {
        return ResultGenerator.genSuccessResult(insElderContractInfoService.queryOne(insElderContractInfo));
    }

    /**
    * 保存数据
    * @param insElderContractInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderContractInfo insElderContractInfo) {
        //Date currentDt = new Date();
        if (insElderContractInfo.getId() != null && insElderContractInfo.getId().longValue() > 0) {
            //insElderContractInfo.setUpdatedDt(currentDt);
            insElderContractInfoService.update(insElderContractInfo);
        } else {
            //insElderContractInfo.setCreatedDt(currentDt);
            //insElderContractInfo.setUpdatedDt(currentDt);
            insElderContractInfoService.insert(insElderContractInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderContractInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderContractInfo> add(@RequestBody InsElderContractInfo insElderContractInfo) {
        //Date currentDt = new Date();
        //insElderContractInfo.setCreatedDt(currentDt);
        //insElderContractInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderContractInfoService.insert(insElderContractInfo));
    }

    /**
    * 更新数据
    *
    * @param insElderContractInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderContractInfo> update(@RequestBody InsElderContractInfo insElderContractInfo) {
        return ResultGenerator.genSuccessResult(insElderContractInfoService.update(insElderContractInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderContractInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderContractInfo insElderContractInfo) {
        return ResultGenerator.genSuccessResult(insElderContractInfoService.deleteById(insElderContractInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderContractInfo> insertList) {
        return ResultGenerator.genSuccessResult(insElderContractInfoService.saveInsElderContractInfoBatch(insertList));
    }

    @PostMapping("/addNewContract")
    @ApiOperation(value = "新增签约合同", notes = "新增签约合同", httpMethod = "POST")
    public Result<InsElderContractInfo> addNewContract(@RequestBody InsElderContractInfo insElderContractInfo) {
        Long templateId = insElderContractInfo.getTemplateId();
        String templateContent = "";
        templateContent = insBaseContractTemplateService.getById(templateId).getTemplateContent();
        Date date = new Date();
        insElderContractInfo.setCreateTime(date);
        insElderContractInfo.setUpdateTime(date);
        insElderContractInfo.setContractState(1);
        insElderContractInfo.setSubmitState(1);
        insElderContractInfo.setTemplateContent(templateContent);
        insElderContractInfo.setContractCode("HT"+StringUtil.getBillno());
        InsElderContractInfo insert = insElderContractInfoService.insert(insElderContractInfo);
        return ResultGenerator.genSuccessResult(insert);
    }
}


