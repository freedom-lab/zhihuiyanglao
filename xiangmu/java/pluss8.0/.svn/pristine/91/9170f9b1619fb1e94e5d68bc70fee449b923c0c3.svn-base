package cn.pluss.platform.service.healthLungFunction.impl;

import cn.pluss.platform.mapper.HealthLungFunctionMapper;
import cn.pluss.platform.model.entity.HealthLungFunction;
import cn.pluss.platform.service.healthLungFunction.HealthLungFunctionService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

@Transactional
@Service("healthLungFunctionService")
public class HealthLungFunctionServiceImpl extends ServiceImpl< HealthLungFunctionMapper, HealthLungFunction> implements HealthLungFunctionService {
    private static final Logger logger = LoggerFactory.getLogger(HealthLungFunctionServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthLungFunction> queryPage(Map map) {
        return getBaseMapper().queryPage(map);
    }

    /**
    * 分页查询计数
    * @param map
    * @return 
    */
    @Override
    public Integer queryPageCount(Map map) {
        return getBaseMapper().queryPageCount(map);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param id 主键
    * @return 实例对象
    */
    @Override
    public HealthLungFunction queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthLungFunction 实例对象
    * @return 实例对象
    */
    @Override
    public HealthLungFunction queryOne(HealthLungFunction healthLungFunction){
        LambdaQueryWrapper<HealthLungFunction> queryWrapper = getQueryWrapper(healthLungFunction);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthLungFunction
    * @return
    */
    @Override
    public List<HealthLungFunction> queryList(HealthLungFunction healthLungFunction) {
        LambdaQueryWrapper<HealthLungFunction> queryWrapper = getQueryWrapper(healthLungFunction);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthLungFunction
    * @return
    */
    public static LambdaQueryWrapper<HealthLungFunction> getQueryWrapper(HealthLungFunction healthLungFunction){
        LambdaQueryWrapper<HealthLungFunction> queryWrapper = new LambdaQueryWrapper<>();
        if (healthLungFunction.getId() != null) {
            queryWrapper.eq(HealthLungFunction::getId, healthLungFunction.getId());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getTenantId())) {
            queryWrapper.eq(HealthLungFunction::getTenantId, healthLungFunction.getTenantId());
        }
        if (healthLungFunction.getCorpId() != null) {
            queryWrapper.eq(HealthLungFunction::getCorpId, healthLungFunction.getCorpId());
        }
        if (healthLungFunction.getInstitutionId() != null) {
            queryWrapper.eq(HealthLungFunction::getInstitutionId, healthLungFunction.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getInstitutionName())) {
            queryWrapper.eq(HealthLungFunction::getInstitutionName, healthLungFunction.getInstitutionName());
        }
        if (healthLungFunction.getElderId() != null) {
            queryWrapper.eq(HealthLungFunction::getElderId, healthLungFunction.getElderId());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getElderName())) {
            queryWrapper.eq(HealthLungFunction::getElderName, healthLungFunction.getElderName());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getIdCard())) {
            queryWrapper.eq(HealthLungFunction::getIdCard, healthLungFunction.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getSex())) {
            queryWrapper.eq(HealthLungFunction::getSex, healthLungFunction.getSex());
        }
        if (healthLungFunction.getAge() != null) {
            queryWrapper.eq(HealthLungFunction::getAge, healthLungFunction.getAge());
        }
        if (healthLungFunction.getGaugeTime() != null) {
            queryWrapper.eq(HealthLungFunction::getGaugeTime, healthLungFunction.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getGaugeType())) {
            queryWrapper.eq(HealthLungFunction::getGaugeType, healthLungFunction.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getFVCData())) {
            queryWrapper.eq(HealthLungFunction::getFVCData, healthLungFunction.getFVCData());
        }
        if (healthLungFunction.getVCData() != null) {
            queryWrapper.eq(HealthLungFunction::getVCData, healthLungFunction.getVCData());
        }
        if (healthLungFunction.getMVVData() != null) {
            queryWrapper.eq(HealthLungFunction::getMVVData, healthLungFunction.getMVVData());
        }
        if (healthLungFunction.getResult() != null) {
            queryWrapper.eq(HealthLungFunction::getResult, healthLungFunction.getResult());
        }
        if (healthLungFunction.getFVCReal() != null) {
            queryWrapper.eq(HealthLungFunction::getFVCReal, healthLungFunction.getFVCReal());
        }
        if (healthLungFunction.getFVCPlan() != null) {
            queryWrapper.eq(HealthLungFunction::getFVCPlan, healthLungFunction.getFVCPlan());
        }
        if (healthLungFunction.getFVCPercent() != null) {
            queryWrapper.eq(HealthLungFunction::getFVCPercent, healthLungFunction.getFVCPercent());
        }
        if (healthLungFunction.getFVC1Real() != null) {
            queryWrapper.eq(HealthLungFunction::getFVC1Real, healthLungFunction.getFVC1Real());
        }
        if (healthLungFunction.getFVC1Plan() != null) {
            queryWrapper.eq(HealthLungFunction::getFVC1Plan, healthLungFunction.getFVC1Plan());
        }
        if (healthLungFunction.getFVC1Percent() != null) {
            queryWrapper.eq(HealthLungFunction::getFVC1Percent, healthLungFunction.getFVC1Percent());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getFVC2Real())) {
            queryWrapper.eq(HealthLungFunction::getFVC2Real, healthLungFunction.getFVC2Real());
        }
        if (healthLungFunction.getFVC3Real() != null) {
            queryWrapper.eq(HealthLungFunction::getFVC3Real, healthLungFunction.getFVC3Real());
        }
        if (healthLungFunction.getFEV1Real() != null) {
            queryWrapper.eq(HealthLungFunction::getFEV1Real, healthLungFunction.getFEV1Real());
        }
        if (healthLungFunction.getFEV1Plan() != null) {
            queryWrapper.eq(HealthLungFunction::getFEV1Plan, healthLungFunction.getFEV1Plan());
        }
        if (healthLungFunction.getFEV1Percent() != null) {
            queryWrapper.eq(HealthLungFunction::getFEV1Percent, healthLungFunction.getFEV1Percent());
        }
        if (healthLungFunction.getFEV2Real() != null) {
            queryWrapper.eq(HealthLungFunction::getFEV2Real, healthLungFunction.getFEV2Real());
        }
        if (healthLungFunction.getFEV3Real() != null) {
            queryWrapper.eq(HealthLungFunction::getFEV3Real, healthLungFunction.getFEV3Real());
        }
        if (healthLungFunction.getMMFReal() != null) {
            queryWrapper.eq(HealthLungFunction::getMMFReal, healthLungFunction.getMMFReal());
        }
        if (healthLungFunction.getMMFPlan() != null) {
            queryWrapper.eq(HealthLungFunction::getMMFPlan, healthLungFunction.getMMFPlan());
        }
        if (healthLungFunction.getMMFPercent() != null) {
            queryWrapper.eq(HealthLungFunction::getMMFPercent, healthLungFunction.getMMFPercent());
        }
        if (healthLungFunction.getMVV1Real() != null) {
            queryWrapper.eq(HealthLungFunction::getMVV1Real, healthLungFunction.getMVV1Real());
        }
        if (healthLungFunction.getMVV1Plan() != null) {
            queryWrapper.eq(HealthLungFunction::getMVV1Plan, healthLungFunction.getMVV1Plan());
        }
        if (healthLungFunction.getMVV1Percent() != null) {
            queryWrapper.eq(HealthLungFunction::getMVV1Percent, healthLungFunction.getMVV1Percent());
        }
        if (healthLungFunction.getBSA1Real() != null) {
            queryWrapper.eq(HealthLungFunction::getBSA1Real, healthLungFunction.getBSA1Real());
        }
        if (healthLungFunction.getMVV1BSAReal() != null) {
            queryWrapper.eq(HealthLungFunction::getMVV1BSAReal, healthLungFunction.getMVV1BSAReal());
        }
        if (healthLungFunction.getMVV1BSAPlan() != null) {
            queryWrapper.eq(HealthLungFunction::getMVV1BSAPlan, healthLungFunction.getMVV1BSAPlan());
        }
        if (healthLungFunction.getMVV1BSAPercent() != null) {
            queryWrapper.eq(HealthLungFunction::getMVV1BSAPercent, healthLungFunction.getMVV1BSAPercent());
        }
        if (healthLungFunction.getPEFReal() != null) {
            queryWrapper.eq(HealthLungFunction::getPEFReal, healthLungFunction.getPEFReal());
        }
        if (healthLungFunction.getPEFPlan() != null) {
            queryWrapper.eq(HealthLungFunction::getPEFPlan, healthLungFunction.getPEFPlan());
        }
        if (healthLungFunction.getPEFPercent() != null) {
            queryWrapper.eq(HealthLungFunction::getPEFPercent, healthLungFunction.getPEFPercent());
        }
        if (healthLungFunction.getV75Real() != null) {
            queryWrapper.eq(HealthLungFunction::getV75Real, healthLungFunction.getV75Real());
        }
        if (healthLungFunction.getV75Plan() != null) {
            queryWrapper.eq(HealthLungFunction::getV75Plan, healthLungFunction.getV75Plan());
        }
        if (healthLungFunction.getV75Percent() != null) {
            queryWrapper.eq(HealthLungFunction::getV75Percent, healthLungFunction.getV75Percent());
        }
        if (healthLungFunction.getV50Real() != null) {
            queryWrapper.eq(HealthLungFunction::getV50Real, healthLungFunction.getV50Real());
        }
        if (healthLungFunction.getV50Plan() != null) {
            queryWrapper.eq(HealthLungFunction::getV50Plan, healthLungFunction.getV50Plan());
        }
        if (healthLungFunction.getV50Percent() != null) {
            queryWrapper.eq(HealthLungFunction::getV50Percent, healthLungFunction.getV50Percent());
        }
        if (healthLungFunction.getV25Real() != null) {
            queryWrapper.eq(HealthLungFunction::getV25Real, healthLungFunction.getV25Real());
        }
        if (healthLungFunction.getV25Plan() != null) {
            queryWrapper.eq(HealthLungFunction::getV25Plan, healthLungFunction.getV25Plan());
        }
        if (healthLungFunction.getV25Percent() != null) {
            queryWrapper.eq(HealthLungFunction::getV25Percent, healthLungFunction.getV25Percent());
        }
        if (healthLungFunction.getV50V25Real() != null) {
            queryWrapper.eq(HealthLungFunction::getV50V25Real, healthLungFunction.getV50V25Real());
        }
        if (healthLungFunction.getV50V25Plan() != null) {
            queryWrapper.eq(HealthLungFunction::getV50V25Plan, healthLungFunction.getV50V25Plan());
        }
        if (healthLungFunction.getV50V25Percent() != null) {
            queryWrapper.eq(HealthLungFunction::getV50V25Percent, healthLungFunction.getV50V25Percent());
        }
        if (healthLungFunction.getV25HReal() != null) {
            queryWrapper.eq(HealthLungFunction::getV25HReal, healthLungFunction.getV25HReal());
        }
        if (healthLungFunction.getV25HPlan() != null) {
            queryWrapper.eq(HealthLungFunction::getV25HPlan, healthLungFunction.getV25HPlan());
        }
        if (healthLungFunction.getV25HPercent() != null) {
            queryWrapper.eq(HealthLungFunction::getV25HPercent, healthLungFunction.getV25HPercent());
        }
        if (healthLungFunction.getVCReal() != null) {
            queryWrapper.eq(HealthLungFunction::getVCReal, healthLungFunction.getVCReal());
        }
        if (healthLungFunction.getVCPlan() != null) {
            queryWrapper.eq(HealthLungFunction::getVCPlan, healthLungFunction.getVCPlan());
        }
        if (healthLungFunction.getVCPercent() != null) {
            queryWrapper.eq(HealthLungFunction::getVCPercent, healthLungFunction.getVCPercent());
        }
        if (healthLungFunction.getTVReal() != null) {
            queryWrapper.eq(HealthLungFunction::getTVReal, healthLungFunction.getTVReal());
        }
        if (healthLungFunction.getIRVReal() != null) {
            queryWrapper.eq(HealthLungFunction::getIRVReal, healthLungFunction.getIRVReal());
        }
        if (healthLungFunction.getERVReal() != null) {
            queryWrapper.eq(HealthLungFunction::getERVReal, healthLungFunction.getERVReal());
        }
        if (healthLungFunction.getICReal() != null) {
            queryWrapper.eq(HealthLungFunction::getICReal, healthLungFunction.getICReal());
        }
        if (healthLungFunction.getMVReal() != null) {
            queryWrapper.eq(HealthLungFunction::getMVReal, healthLungFunction.getMVReal());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getOpinion())) {
            queryWrapper.eq(HealthLungFunction::getOpinion, healthLungFunction.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getWarnFlag())) {
            queryWrapper.eq(HealthLungFunction::getWarnFlag, healthLungFunction.getWarnFlag());
        }
        if (healthLungFunction.getAreaCode() != null) {
            queryWrapper.eq(HealthLungFunction::getAreaCode, healthLungFunction.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getAreaName())) {
            queryWrapper.eq(HealthLungFunction::getAreaName, healthLungFunction.getAreaName());
        }
        if (healthLungFunction.getCreateUser() != null) {
            queryWrapper.eq(HealthLungFunction::getCreateUser, healthLungFunction.getCreateUser());
        }
        if (healthLungFunction.getCreateDept() != null) {
            queryWrapper.eq(HealthLungFunction::getCreateDept, healthLungFunction.getCreateDept());
        }
        if (healthLungFunction.getCreateTime() != null) {
            queryWrapper.eq(HealthLungFunction::getCreateTime, healthLungFunction.getCreateTime());
        }
        if (healthLungFunction.getUpdateUser() != null) {
            queryWrapper.eq(HealthLungFunction::getUpdateUser, healthLungFunction.getUpdateUser());
        }
        if (healthLungFunction.getUpdateTime() != null) {
            queryWrapper.eq(HealthLungFunction::getUpdateTime, healthLungFunction.getUpdateTime());
        }
        if (healthLungFunction.getIsDeleted() != null) {
            queryWrapper.eq(HealthLungFunction::getIsDeleted, healthLungFunction.getIsDeleted());
        }
        if (healthLungFunction.getStatus() != null) {
            queryWrapper.eq(HealthLungFunction::getStatus, healthLungFunction.getStatus());
        }
        if (StringUtil.isNotEmpty(healthLungFunction.getDataSource())) {
            queryWrapper.eq(HealthLungFunction::getDataSource, healthLungFunction.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthLungFunction 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthLungFunction insert(HealthLungFunction healthLungFunction) {
        healthLungFunction.setId(null);
        getBaseMapper().insert(healthLungFunction);
        return healthLungFunction;
    }

    /**
    * 更新数据
    *
    * @param healthLungFunction 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthLungFunction update(HealthLungFunction healthLungFunction) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthLungFunction> chainWrapper = new LambdaUpdateChainWrapper<HealthLungFunction>(getBaseMapper());
        if (healthLungFunction.getId() != null) {
            chainWrapper.set(HealthLungFunction::getId, healthLungFunction.getId());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getTenantId())) {
            chainWrapper.set(HealthLungFunction::getTenantId, healthLungFunction.getTenantId());
        }
        if (healthLungFunction.getCorpId() != null) {
            chainWrapper.set(HealthLungFunction::getCorpId, healthLungFunction.getCorpId());
        }
        if (healthLungFunction.getInstitutionId() != null) {
            chainWrapper.set(HealthLungFunction::getInstitutionId, healthLungFunction.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getInstitutionName())) {
            chainWrapper.set(HealthLungFunction::getInstitutionName, healthLungFunction.getInstitutionName());
        }
        if (healthLungFunction.getElderId() != null) {
            chainWrapper.set(HealthLungFunction::getElderId, healthLungFunction.getElderId());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getElderName())) {
            chainWrapper.set(HealthLungFunction::getElderName, healthLungFunction.getElderName());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getIdCard())) {
            chainWrapper.set(HealthLungFunction::getIdCard, healthLungFunction.getIdCard());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getSex())) {
            chainWrapper.set(HealthLungFunction::getSex, healthLungFunction.getSex());
        }
        if (healthLungFunction.getAge() != null) {
            chainWrapper.set(HealthLungFunction::getAge, healthLungFunction.getAge());
        }
        if (healthLungFunction.getGaugeTime() != null) {
            chainWrapper.set(HealthLungFunction::getGaugeTime, healthLungFunction.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getGaugeType())) {
            chainWrapper.set(HealthLungFunction::getGaugeType, healthLungFunction.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getFVCData())) {
            chainWrapper.set(HealthLungFunction::getFVCData, healthLungFunction.getFVCData());
        }
        if (healthLungFunction.getVCData() != null) {
            chainWrapper.set(HealthLungFunction::getVCData, healthLungFunction.getVCData());
        }
        if (healthLungFunction.getMVVData() != null) {
            chainWrapper.set(HealthLungFunction::getMVVData, healthLungFunction.getMVVData());
        }
        if (healthLungFunction.getResult() != null) {
            chainWrapper.set(HealthLungFunction::getResult, healthLungFunction.getResult());
        }
        if (healthLungFunction.getFVCReal() != null) {
            chainWrapper.set(HealthLungFunction::getFVCReal, healthLungFunction.getFVCReal());
        }
        if (healthLungFunction.getFVCPlan() != null) {
            chainWrapper.set(HealthLungFunction::getFVCPlan, healthLungFunction.getFVCPlan());
        }
        if (healthLungFunction.getFVCPercent() != null) {
            chainWrapper.set(HealthLungFunction::getFVCPercent, healthLungFunction.getFVCPercent());
        }
        if (healthLungFunction.getFVC1Real() != null) {
            chainWrapper.set(HealthLungFunction::getFVC1Real, healthLungFunction.getFVC1Real());
        }
        if (healthLungFunction.getFVC1Plan() != null) {
            chainWrapper.set(HealthLungFunction::getFVC1Plan, healthLungFunction.getFVC1Plan());
        }
        if (healthLungFunction.getFVC1Percent() != null) {
            chainWrapper.set(HealthLungFunction::getFVC1Percent, healthLungFunction.getFVC1Percent());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getFVC2Real())) {
            chainWrapper.set(HealthLungFunction::getFVC2Real, healthLungFunction.getFVC2Real());
        }
        if (healthLungFunction.getFVC3Real() != null) {
            chainWrapper.set(HealthLungFunction::getFVC3Real, healthLungFunction.getFVC3Real());
        }
        if (healthLungFunction.getFEV1Real() != null) {
            chainWrapper.set(HealthLungFunction::getFEV1Real, healthLungFunction.getFEV1Real());
        }
        if (healthLungFunction.getFEV1Plan() != null) {
            chainWrapper.set(HealthLungFunction::getFEV1Plan, healthLungFunction.getFEV1Plan());
        }
        if (healthLungFunction.getFEV1Percent() != null) {
            chainWrapper.set(HealthLungFunction::getFEV1Percent, healthLungFunction.getFEV1Percent());
        }
        if (healthLungFunction.getFEV2Real() != null) {
            chainWrapper.set(HealthLungFunction::getFEV2Real, healthLungFunction.getFEV2Real());
        }
        if (healthLungFunction.getFEV3Real() != null) {
            chainWrapper.set(HealthLungFunction::getFEV3Real, healthLungFunction.getFEV3Real());
        }
        if (healthLungFunction.getMMFReal() != null) {
            chainWrapper.set(HealthLungFunction::getMMFReal, healthLungFunction.getMMFReal());
        }
        if (healthLungFunction.getMMFPlan() != null) {
            chainWrapper.set(HealthLungFunction::getMMFPlan, healthLungFunction.getMMFPlan());
        }
        if (healthLungFunction.getMMFPercent() != null) {
            chainWrapper.set(HealthLungFunction::getMMFPercent, healthLungFunction.getMMFPercent());
        }
        if (healthLungFunction.getMVV1Real() != null) {
            chainWrapper.set(HealthLungFunction::getMVV1Real, healthLungFunction.getMVV1Real());
        }
        if (healthLungFunction.getMVV1Plan() != null) {
            chainWrapper.set(HealthLungFunction::getMVV1Plan, healthLungFunction.getMVV1Plan());
        }
        if (healthLungFunction.getMVV1Percent() != null) {
            chainWrapper.set(HealthLungFunction::getMVV1Percent, healthLungFunction.getMVV1Percent());
        }
        if (healthLungFunction.getBSA1Real() != null) {
            chainWrapper.set(HealthLungFunction::getBSA1Real, healthLungFunction.getBSA1Real());
        }
        if (healthLungFunction.getMVV1BSAReal() != null) {
            chainWrapper.set(HealthLungFunction::getMVV1BSAReal, healthLungFunction.getMVV1BSAReal());
        }
        if (healthLungFunction.getMVV1BSAPlan() != null) {
            chainWrapper.set(HealthLungFunction::getMVV1BSAPlan, healthLungFunction.getMVV1BSAPlan());
        }
        if (healthLungFunction.getMVV1BSAPercent() != null) {
            chainWrapper.set(HealthLungFunction::getMVV1BSAPercent, healthLungFunction.getMVV1BSAPercent());
        }
        if (healthLungFunction.getPEFReal() != null) {
            chainWrapper.set(HealthLungFunction::getPEFReal, healthLungFunction.getPEFReal());
        }
        if (healthLungFunction.getPEFPlan() != null) {
            chainWrapper.set(HealthLungFunction::getPEFPlan, healthLungFunction.getPEFPlan());
        }
        if (healthLungFunction.getPEFPercent() != null) {
            chainWrapper.set(HealthLungFunction::getPEFPercent, healthLungFunction.getPEFPercent());
        }
        if (healthLungFunction.getV75Real() != null) {
            chainWrapper.set(HealthLungFunction::getV75Real, healthLungFunction.getV75Real());
        }
        if (healthLungFunction.getV75Plan() != null) {
            chainWrapper.set(HealthLungFunction::getV75Plan, healthLungFunction.getV75Plan());
        }
        if (healthLungFunction.getV75Percent() != null) {
            chainWrapper.set(HealthLungFunction::getV75Percent, healthLungFunction.getV75Percent());
        }
        if (healthLungFunction.getV50Real() != null) {
            chainWrapper.set(HealthLungFunction::getV50Real, healthLungFunction.getV50Real());
        }
        if (healthLungFunction.getV50Plan() != null) {
            chainWrapper.set(HealthLungFunction::getV50Plan, healthLungFunction.getV50Plan());
        }
        if (healthLungFunction.getV50Percent() != null) {
            chainWrapper.set(HealthLungFunction::getV50Percent, healthLungFunction.getV50Percent());
        }
        if (healthLungFunction.getV25Real() != null) {
            chainWrapper.set(HealthLungFunction::getV25Real, healthLungFunction.getV25Real());
        }
        if (healthLungFunction.getV25Plan() != null) {
            chainWrapper.set(HealthLungFunction::getV25Plan, healthLungFunction.getV25Plan());
        }
        if (healthLungFunction.getV25Percent() != null) {
            chainWrapper.set(HealthLungFunction::getV25Percent, healthLungFunction.getV25Percent());
        }
        if (healthLungFunction.getV50V25Real() != null) {
            chainWrapper.set(HealthLungFunction::getV50V25Real, healthLungFunction.getV50V25Real());
        }
        if (healthLungFunction.getV50V25Plan() != null) {
            chainWrapper.set(HealthLungFunction::getV50V25Plan, healthLungFunction.getV50V25Plan());
        }
        if (healthLungFunction.getV50V25Percent() != null) {
            chainWrapper.set(HealthLungFunction::getV50V25Percent, healthLungFunction.getV50V25Percent());
        }
        if (healthLungFunction.getV25HReal() != null) {
            chainWrapper.set(HealthLungFunction::getV25HReal, healthLungFunction.getV25HReal());
        }
        if (healthLungFunction.getV25HPlan() != null) {
            chainWrapper.set(HealthLungFunction::getV25HPlan, healthLungFunction.getV25HPlan());
        }
        if (healthLungFunction.getV25HPercent() != null) {
            chainWrapper.set(HealthLungFunction::getV25HPercent, healthLungFunction.getV25HPercent());
        }
        if (healthLungFunction.getVCReal() != null) {
            chainWrapper.set(HealthLungFunction::getVCReal, healthLungFunction.getVCReal());
        }
        if (healthLungFunction.getVCPlan() != null) {
            chainWrapper.set(HealthLungFunction::getVCPlan, healthLungFunction.getVCPlan());
        }
        if (healthLungFunction.getVCPercent() != null) {
            chainWrapper.set(HealthLungFunction::getVCPercent, healthLungFunction.getVCPercent());
        }
        if (healthLungFunction.getTVReal() != null) {
            chainWrapper.set(HealthLungFunction::getTVReal, healthLungFunction.getTVReal());
        }
        if (healthLungFunction.getIRVReal() != null) {
            chainWrapper.set(HealthLungFunction::getIRVReal, healthLungFunction.getIRVReal());
        }
        if (healthLungFunction.getERVReal() != null) {
            chainWrapper.set(HealthLungFunction::getERVReal, healthLungFunction.getERVReal());
        }
        if (healthLungFunction.getICReal() != null) {
            chainWrapper.set(HealthLungFunction::getICReal, healthLungFunction.getICReal());
        }
        if (healthLungFunction.getMVReal() != null) {
            chainWrapper.set(HealthLungFunction::getMVReal, healthLungFunction.getMVReal());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getOpinion())) {
            chainWrapper.set(HealthLungFunction::getOpinion, healthLungFunction.getOpinion());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getWarnFlag())) {
            chainWrapper.set(HealthLungFunction::getWarnFlag, healthLungFunction.getWarnFlag());
        }
        if (healthLungFunction.getAreaCode() != null) {
            chainWrapper.set(HealthLungFunction::getAreaCode, healthLungFunction.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getAreaName())) {
            chainWrapper.set(HealthLungFunction::getAreaName, healthLungFunction.getAreaName());
        }
        if (healthLungFunction.getCreateUser() != null) {
            chainWrapper.set(HealthLungFunction::getCreateUser, healthLungFunction.getCreateUser());
        }
        if (healthLungFunction.getCreateDept() != null) {
            chainWrapper.set(HealthLungFunction::getCreateDept, healthLungFunction.getCreateDept());
        }
        if (healthLungFunction.getCreateTime() != null) {
            chainWrapper.set(HealthLungFunction::getCreateTime, healthLungFunction.getCreateTime());
        }
        if (healthLungFunction.getUpdateUser() != null) {
            chainWrapper.set(HealthLungFunction::getUpdateUser, healthLungFunction.getUpdateUser());
        }
        if (healthLungFunction.getUpdateTime() != null) {
            chainWrapper.set(HealthLungFunction::getUpdateTime, healthLungFunction.getUpdateTime());
        }
        if (healthLungFunction.getIsDeleted() != null) {
            chainWrapper.set(HealthLungFunction::getIsDeleted, healthLungFunction.getIsDeleted());
        }
        if (healthLungFunction.getStatus() != null) {
            chainWrapper.set(HealthLungFunction::getStatus, healthLungFunction.getStatus());
        }
        if (StringUtil.isNotBlank(healthLungFunction.getDataSource())) {
            chainWrapper.set(HealthLungFunction::getDataSource, healthLungFunction.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthLungFunction::getId, healthLungFunction.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthLungFunction.getId());
        } else {
            return healthLungFunction;
        }
    }

    /**
    * 通过主键删除数据
    *
    * @param id 主键
    * @return 是否成功
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public boolean deleteById(Long id) {
        int total = getBaseMapper().deleteById(id);
        return total > 0;
    }

    /**
    * 批量新增
    * @param insertList
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public boolean saveHealthLungFunctionBatch(List<HealthLungFunction> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthLungFunction healthLungFunction : insertList) {
            //使用默认的雪花算法生成
            healthLungFunction.setId(null);
            //healthLungFunction.setCreatedDt(currentDte);
            //healthLungFunction.setUpdatedDt(currentDte);
        }
        return saveBatch(insertList);
    }

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public Integer deleteHealthLungFunctionBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthLungFunction> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


