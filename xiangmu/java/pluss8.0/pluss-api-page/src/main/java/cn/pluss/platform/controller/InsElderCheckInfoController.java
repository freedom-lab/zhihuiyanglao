package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentElderBase;
import cn.pluss.platform.model.entity.ElderBaseInfo;
import cn.pluss.platform.model.entity.InsElderCheckAudit;
import cn.pluss.platform.model.entity.InsElderCheckInfo;
import cn.pluss.platform.service.elderBaseInfo.ElderBaseInfoService;
import cn.pluss.platform.service.insElderCheckAudit.InsElderCheckAuditService;
import cn.pluss.platform.service.insElderCheckInfo.InsElderCheckInfoService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
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
@RequestMapping("/insElderCheckInfo")
@Api(value = "InsElderCheckInfo控制类",tags={"InsElderCheckInfo接口"})
public class InsElderCheckInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderCheckInfoService insElderCheckInfoService;
    @Resource
    private InsElderCheckAuditService insElderCheckAuditService;

    @Resource
    private ElderBaseInfoService elderBaseInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderCheckInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderCheckInfo> insElderCheckInfoList = insElderCheckInfoService.queryPage(map);
        Integer count= insElderCheckInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderCheckInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderCheckInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderCheckInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderCheckInfo>> queryList(@RequestBody InsElderCheckInfo insElderCheckInfo) {
        List<InsElderCheckInfo> insElderCheckInfoList = insElderCheckInfoService.queryList(insElderCheckInfo);
        return ResultGenerator.genSuccessResult(insElderCheckInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderCheckInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderCheckInfo> queryOne(@RequestBody InsElderCheckInfo insElderCheckInfo) {
        return ResultGenerator.genSuccessResult(insElderCheckInfoService.queryOne(insElderCheckInfo));
    }

    /**
    * 保存数据
    * @param insElderCheckInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderCheckInfo insElderCheckInfo) {
        //Date currentDt = new Date();
        if (insElderCheckInfo.getId() != null && insElderCheckInfo.getId().longValue() > 0) {
            //insElderCheckInfo.setUpdatedDt(currentDt);
            insElderCheckInfoService.update(insElderCheckInfo);
        } else {
            //insElderCheckInfo.setCreatedDt(currentDt);
            //insElderCheckInfo.setUpdatedDt(currentDt);
            insElderCheckInfoService.insert(insElderCheckInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderCheckInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderCheckInfo> add(@RequestBody InsElderCheckInfo insElderCheckInfo) {
        //Date currentDt = new Date();
        //insElderCheckInfo.setCreatedDt(currentDt);
        //insElderCheckInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderCheckInfoService.insert(insElderCheckInfo));
    }

    /**
    * 更新数据
    *
    * @param insElderCheckInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderCheckInfo> update(@RequestBody InsElderCheckInfo insElderCheckInfo) {
        return ResultGenerator.genSuccessResult(insElderCheckInfoService.update(insElderCheckInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderCheckInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderCheckInfo insElderCheckInfo) {
        return ResultGenerator.genSuccessResult(insElderCheckInfoService.deleteById(insElderCheckInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderCheckInfo> insertList) {
        return ResultGenerator.genSuccessResult(insElderCheckInfoService.saveInsElderCheckInfoBatch(insertList));
    }



    /**
     * 审核通过
     * @param insElderCheckInfo
     * @return
     */
    @PostMapping("/checkPass")
    @ApiOperation(value = "审核通过", notes = "审核通过", httpMethod = "POST")
    @Transactional
    public Result checkPass(@RequestBody InsElderCheckInfo insElderCheckInfo){
        Long id = insElderCheckInfo.getId();
        InsElderCheckInfo insElderCheckInfo1 = insElderCheckInfoService.queryById(id);
        insElderCheckInfo.setTotalAuditState(6);
        insElderCheckInfo.setCheckStep(7);
        if(insElderCheckInfo.getAuditState()==3){
            insElderCheckInfo.setTotalAuditState(5);
        }
        insElderCheckInfo.setUpdateTime(new Date());
        InsElderCheckAudit insElderCheckAudit = new InsElderCheckAudit();
        insElderCheckAudit.setInstitutionId(insElderCheckInfo.getInstitutionId());
        insElderCheckAudit.setCheckId(id);
        insElderCheckAudit.setAuditStep(3);
        insElderCheckAudit.setAuditMemo(insElderCheckInfo.getAuditMemo());
        insElderCheckAudit.setAuditState(insElderCheckInfo.getAuditState());
        insElderCheckAudit.setCreateTime(new Date());
        insElderCheckAudit.setUpdateTime(new Date());
        insElderCheckAudit.setTenantId(insElderCheckInfo1.getTenantId());
        insElderCheckAudit.setCorpId(insElderCheckInfo1.getCorpId());
        insElderCheckAudit.setCorpName(insElderCheckInfo1.getCorpName());
        insElderCheckAudit.setCheckId(insElderCheckInfo1.getId());
        insElderCheckAudit.setCheckDate(insElderCheckInfo1.getCheckDate());
        insElderCheckAudit.setElderId(insElderCheckInfo1.getElderId());
        insElderCheckAudit.setElderName(insElderCheckInfo1.getElderName());
        insElderCheckAudit.setIdCard(insElderCheckInfo1.getIdCard());
        insElderCheckAudit.setSex(insElderCheckInfo1.getSex());
        insElderCheckAuditService.insert(insElderCheckAudit);
        return ResultGenerator.genSuccessResult(insElderCheckInfoService.updateById(insElderCheckInfo));
    }


    /**
     * 入住评估保存
     * @param assessmentElderBase
     * @return
     */
    @PostMapping("/saveCheckInAssessment")
    @ApiOperation(value = "入住评估保存", notes = "入住评估保存", httpMethod = "POST")
    @Transactional
    public Result saveCheckInAssessment(@RequestBody AssessmentElderBase assessmentElderBase){
        logger.info("开始入住评估保存");
        ElderBaseInfo elderBaseInfo = new ElderBaseInfo();
        BeanUtils.copyProperties(assessmentElderBase,elderBaseInfo);
        elderBaseInfo.setId(null);
        elderBaseInfo.setCreateTime(new Date());
        elderBaseInfo.setUpdateTime(new Date());
        elderBaseInfoService.insert(elderBaseInfo);

        InsElderCheckInfo insElderCheckInfo = new InsElderCheckInfo();
        insElderCheckInfo.setId(assessmentElderBase.getCheckId());
        insElderCheckInfo.setCheckStep(6);
        insElderCheckInfo.setUpdateTime(new Date());
        insElderCheckInfoService.updateById(insElderCheckInfo);
        logger.info("入住评估保存结束");

        return ResultGenerator.genSuccessResult();

    }

    /**
     * 入住评估回显
     * @param insElderCheckInfo 传入checkId（即InsElderCheckInfo的id）
     * @return 返回入住评估保存的数据（InsElderCheckInfo + ElderBaseInfo）
     */
    @PostMapping("/getCheckInAssessment")
    @ApiOperation(value = "入住评估回显", notes = "根据checkId回显入住评估保存的数据", httpMethod = "POST")
    public Result getCheckInAssessment(@RequestBody InsElderCheckInfo insElderCheckInfo){
        logger.info("开始入住评估回显");
        if(insElderCheckInfo.getId() == null){
            return ResultGenerator.genFailResult("checkId不能为空");
        }
        // 查询入住审核信息
        InsElderCheckInfo checkInfo = insElderCheckInfoService.queryById(insElderCheckInfo.getId());
        if(checkInfo == null){
            return ResultGenerator.genFailResult("未找到对应的入住记录");
        }
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("checkInfo", checkInfo);

        // 根据elderId查询老人基本信息（入住评估保存的数据）
        if(checkInfo.getElderId() != null){
            ElderBaseInfo elderBaseInfo = elderBaseInfoService.queryById(checkInfo.getElderId());
            resultMap.put("elderBaseInfo", elderBaseInfo);
        }
        logger.info("入住评估回显结束");
        return ResultGenerator.genSuccessResult(resultMap);
    }

}


