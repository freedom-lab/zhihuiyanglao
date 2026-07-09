package cn.pluss.platform.service.insElderContractInfo.impl;

import cn.pluss.platform.mapper.InsElderContractInfoMapper;
import cn.pluss.platform.model.entity.InsElderContractInfo;
import cn.pluss.platform.service.insElderContractInfo.InsElderContractInfoService;
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
@Service("insElderContractInfoService")
public class InsElderContractInfoServiceImpl extends ServiceImpl< InsElderContractInfoMapper, InsElderContractInfo> implements InsElderContractInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderContractInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderContractInfo> queryPage(Map map) {
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
    public InsElderContractInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderContractInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderContractInfo queryOne(InsElderContractInfo insElderContractInfo){
        LambdaQueryWrapper<InsElderContractInfo> queryWrapper = getQueryWrapper(insElderContractInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderContractInfo
    * @return
    */
    @Override
    public List<InsElderContractInfo> queryList(InsElderContractInfo insElderContractInfo) {
        LambdaQueryWrapper<InsElderContractInfo> queryWrapper = getQueryWrapper(insElderContractInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderContractInfo
    * @return
    */
    public static LambdaQueryWrapper<InsElderContractInfo> getQueryWrapper(InsElderContractInfo insElderContractInfo){
        LambdaQueryWrapper<InsElderContractInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderContractInfo.getId() != null) {
            queryWrapper.eq(InsElderContractInfo::getId, insElderContractInfo.getId());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getTenantId())) {
            queryWrapper.eq(InsElderContractInfo::getTenantId, insElderContractInfo.getTenantId());
        }
        if (insElderContractInfo.getCorpId() != null) {
            queryWrapper.eq(InsElderContractInfo::getCorpId, insElderContractInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getCorpName())) {
            queryWrapper.eq(InsElderContractInfo::getCorpName, insElderContractInfo.getCorpName());
        }
        if (insElderContractInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsElderContractInfo::getInstitutionId, insElderContractInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getInstitutionName())) {
            queryWrapper.eq(InsElderContractInfo::getInstitutionName, insElderContractInfo.getInstitutionName());
        }
        if (insElderContractInfo.getCheckId() != null) {
            queryWrapper.eq(InsElderContractInfo::getCheckId, insElderContractInfo.getCheckId());
        }
        if (insElderContractInfo.getElderId() != null) {
            queryWrapper.eq(InsElderContractInfo::getElderId, insElderContractInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getElderName())) {
            queryWrapper.eq(InsElderContractInfo::getElderName, insElderContractInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getIdCard())) {
            queryWrapper.eq(InsElderContractInfo::getIdCard, insElderContractInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getSex())) {
            queryWrapper.eq(InsElderContractInfo::getSex, insElderContractInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getContractCode())) {
            queryWrapper.eq(InsElderContractInfo::getContractCode, insElderContractInfo.getContractCode());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getContractName())) {
            queryWrapper.eq(InsElderContractInfo::getContractName, insElderContractInfo.getContractName());
        }
        if (insElderContractInfo.getTemplateId() != null) {
            queryWrapper.eq(InsElderContractInfo::getTemplateId, insElderContractInfo.getTemplateId());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getTemplateName())) {
            queryWrapper.eq(InsElderContractInfo::getTemplateName, insElderContractInfo.getTemplateName());
        }
        if (insElderContractInfo.getSignTime() != null) {
            queryWrapper.eq(InsElderContractInfo::getSignTime, insElderContractInfo.getSignTime());
        }
        if (insElderContractInfo.getStartDate() != null) {
            queryWrapper.eq(InsElderContractInfo::getStartDate, insElderContractInfo.getStartDate());
        }
        if (insElderContractInfo.getEndDate() != null) {
            queryWrapper.eq(InsElderContractInfo::getEndDate, insElderContractInfo.getEndDate());
        }
        if (insElderContractInfo.getDepositAmount() != null) {
            queryWrapper.eq(InsElderContractInfo::getDepositAmount, insElderContractInfo.getDepositAmount());
        }
        if (insElderContractInfo.getCostType() != null) {
            queryWrapper.eq(InsElderContractInfo::getCostType, insElderContractInfo.getCostType());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getBedType())) {
            queryWrapper.eq(InsElderContractInfo::getBedType, insElderContractInfo.getBedType());
        }
        if (insElderContractInfo.getBedAmount() != null) {
            queryWrapper.eq(InsElderContractInfo::getBedAmount, insElderContractInfo.getBedAmount());
        }
        if (insElderContractInfo.getBedDepositAmount() != null) {
            queryWrapper.eq(InsElderContractInfo::getBedDepositAmount, insElderContractInfo.getBedDepositAmount());
        }
        if (insElderContractInfo.getNursingLevelId() != null) {
            queryWrapper.eq(InsElderContractInfo::getNursingLevelId, insElderContractInfo.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getNursingLevelName())) {
            queryWrapper.eq(InsElderContractInfo::getNursingLevelName, insElderContractInfo.getNursingLevelName());
        }
        if (insElderContractInfo.getNursingAmount() != null) {
            queryWrapper.eq(InsElderContractInfo::getNursingAmount, insElderContractInfo.getNursingAmount());
        }
        if (insElderContractInfo.getNursingDepositAmount() != null) {
            queryWrapper.eq(InsElderContractInfo::getNursingDepositAmount, insElderContractInfo.getNursingDepositAmount());
        }
        if (insElderContractInfo.getFoodAmount() != null) {
            queryWrapper.eq(InsElderContractInfo::getFoodAmount, insElderContractInfo.getFoodAmount());
        }
        if (insElderContractInfo.getFoodDepositAmount() != null) {
            queryWrapper.eq(InsElderContractInfo::getFoodDepositAmount, insElderContractInfo.getFoodDepositAmount());
        }
        if (insElderContractInfo.getIsSubsidy() != null) {
            queryWrapper.eq(InsElderContractInfo::getIsSubsidy, insElderContractInfo.getIsSubsidy());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getContractDesp())) {
            queryWrapper.eq(InsElderContractInfo::getContractDesp, insElderContractInfo.getContractDesp());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getPartyNameA())) {
            queryWrapper.eq(InsElderContractInfo::getPartyNameA, insElderContractInfo.getPartyNameA());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getLinkTelA())) {
            queryWrapper.eq(InsElderContractInfo::getLinkTelA, insElderContractInfo.getLinkTelA());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getAddressA())) {
            queryWrapper.eq(InsElderContractInfo::getAddressA, insElderContractInfo.getAddressA());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getPartyNameB())) {
            queryWrapper.eq(InsElderContractInfo::getPartyNameB, insElderContractInfo.getPartyNameB());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getLinkTelB())) {
            queryWrapper.eq(InsElderContractInfo::getLinkTelB, insElderContractInfo.getLinkTelB());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getAddressB())) {
            queryWrapper.eq(InsElderContractInfo::getAddressB, insElderContractInfo.getAddressB());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getPartyNameC())) {
            queryWrapper.eq(InsElderContractInfo::getPartyNameC, insElderContractInfo.getPartyNameC());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getLinkTelC())) {
            queryWrapper.eq(InsElderContractInfo::getLinkTelC, insElderContractInfo.getLinkTelC());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getAddressC())) {
            queryWrapper.eq(InsElderContractInfo::getAddressC, insElderContractInfo.getAddressC());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getTemplateContent())) {
            queryWrapper.eq(InsElderContractInfo::getTemplateContent, insElderContractInfo.getTemplateContent());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getContractPath())) {
            queryWrapper.eq(InsElderContractInfo::getContractPath, insElderContractInfo.getContractPath());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getInvoicePath())) {
            queryWrapper.eq(InsElderContractInfo::getInvoicePath, insElderContractInfo.getInvoicePath());
        }
        if (insElderContractInfo.getContractState() != null) {
            queryWrapper.eq(InsElderContractInfo::getContractState, insElderContractInfo.getContractState());
        }
        if (insElderContractInfo.getSubmitState() != null) {
            queryWrapper.eq(InsElderContractInfo::getSubmitState, insElderContractInfo.getSubmitState());
        }
        if (insElderContractInfo.getSigningState() != null) {
            queryWrapper.eq(InsElderContractInfo::getSigningState, insElderContractInfo.getSigningState());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getAreaCode())) {
            queryWrapper.eq(InsElderContractInfo::getAreaCode, insElderContractInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getAreaName())) {
            queryWrapper.eq(InsElderContractInfo::getAreaName, insElderContractInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getRemark())) {
            queryWrapper.eq(InsElderContractInfo::getRemark, insElderContractInfo.getRemark());
        }
        if (insElderContractInfo.getCreateUser() != null) {
            queryWrapper.eq(InsElderContractInfo::getCreateUser, insElderContractInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getCreateName())) {
            queryWrapper.eq(InsElderContractInfo::getCreateName, insElderContractInfo.getCreateName());
        }
        if (insElderContractInfo.getCreateDept() != null) {
            queryWrapper.eq(InsElderContractInfo::getCreateDept, insElderContractInfo.getCreateDept());
        }
        if (insElderContractInfo.getCreateTime() != null) {
            queryWrapper.eq(InsElderContractInfo::getCreateTime, insElderContractInfo.getCreateTime());
        }
        if (insElderContractInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsElderContractInfo::getUpdateUser, insElderContractInfo.getUpdateUser());
        }
        if (insElderContractInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsElderContractInfo::getUpdateTime, insElderContractInfo.getUpdateTime());
        }
        if (insElderContractInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsElderContractInfo::getIsDeleted, insElderContractInfo.getIsDeleted());
        }
        if (insElderContractInfo.getStatus() != null) {
            queryWrapper.eq(InsElderContractInfo::getStatus, insElderContractInfo.getStatus());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getCodePath())) {
            queryWrapper.eq(InsElderContractInfo::getCodePath, insElderContractInfo.getCodePath());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getStafferSign())) {
            queryWrapper.eq(InsElderContractInfo::getStafferSign, insElderContractInfo.getStafferSign());
        }
        if (insElderContractInfo.getStafferDate() != null) {
            queryWrapper.eq(InsElderContractInfo::getStafferDate, insElderContractInfo.getStafferDate());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getGuardianSign())) {
            queryWrapper.eq(InsElderContractInfo::getGuardianSign, insElderContractInfo.getGuardianSign());
        }
        if (insElderContractInfo.getGuardianDate() != null) {
            queryWrapper.eq(InsElderContractInfo::getGuardianDate, insElderContractInfo.getGuardianDate());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getOtherSign())) {
            queryWrapper.eq(InsElderContractInfo::getOtherSign, insElderContractInfo.getOtherSign());
        }
        if (insElderContractInfo.getOtherDate() != null) {
            queryWrapper.eq(InsElderContractInfo::getOtherDate, insElderContractInfo.getOtherDate());
        }
        if (insElderContractInfo.getAuditState() != null) {
            queryWrapper.eq(InsElderContractInfo::getAuditState, insElderContractInfo.getAuditState());
        }
        if (insElderContractInfo.getAuditId() != null) {
            queryWrapper.eq(InsElderContractInfo::getAuditId, insElderContractInfo.getAuditId());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getAuditName())) {
            queryWrapper.eq(InsElderContractInfo::getAuditName, insElderContractInfo.getAuditName());
        }
        if (insElderContractInfo.getAuditTime() != null) {
            queryWrapper.eq(InsElderContractInfo::getAuditTime, insElderContractInfo.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insElderContractInfo.getAuditMemo())) {
            queryWrapper.eq(InsElderContractInfo::getAuditMemo, insElderContractInfo.getAuditMemo());
        }
        if (insElderContractInfo.getSendState() != null) {
            queryWrapper.eq(InsElderContractInfo::getSendState, insElderContractInfo.getSendState());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderContractInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderContractInfo insert(InsElderContractInfo insElderContractInfo) {
        insElderContractInfo.setId(null);
        getBaseMapper().insert(insElderContractInfo);
        return insElderContractInfo;
    }

    /**
    * 更新数据
    *
    * @param insElderContractInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderContractInfo update(InsElderContractInfo insElderContractInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderContractInfo> chainWrapper = new LambdaUpdateChainWrapper<InsElderContractInfo>(getBaseMapper());
        if (insElderContractInfo.getId() != null) {
            chainWrapper.set(InsElderContractInfo::getId, insElderContractInfo.getId());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getTenantId())) {
            chainWrapper.set(InsElderContractInfo::getTenantId, insElderContractInfo.getTenantId());
        }
        if (insElderContractInfo.getCorpId() != null) {
            chainWrapper.set(InsElderContractInfo::getCorpId, insElderContractInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getCorpName())) {
            chainWrapper.set(InsElderContractInfo::getCorpName, insElderContractInfo.getCorpName());
        }
        if (insElderContractInfo.getInstitutionId() != null) {
            chainWrapper.set(InsElderContractInfo::getInstitutionId, insElderContractInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getInstitutionName())) {
            chainWrapper.set(InsElderContractInfo::getInstitutionName, insElderContractInfo.getInstitutionName());
        }
        if (insElderContractInfo.getCheckId() != null) {
            chainWrapper.set(InsElderContractInfo::getCheckId, insElderContractInfo.getCheckId());
        }
        if (insElderContractInfo.getElderId() != null) {
            chainWrapper.set(InsElderContractInfo::getElderId, insElderContractInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getElderName())) {
            chainWrapper.set(InsElderContractInfo::getElderName, insElderContractInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getIdCard())) {
            chainWrapper.set(InsElderContractInfo::getIdCard, insElderContractInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getSex())) {
            chainWrapper.set(InsElderContractInfo::getSex, insElderContractInfo.getSex());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getContractCode())) {
            chainWrapper.set(InsElderContractInfo::getContractCode, insElderContractInfo.getContractCode());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getContractName())) {
            chainWrapper.set(InsElderContractInfo::getContractName, insElderContractInfo.getContractName());
        }
        if (insElderContractInfo.getTemplateId() != null) {
            chainWrapper.set(InsElderContractInfo::getTemplateId, insElderContractInfo.getTemplateId());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getTemplateName())) {
            chainWrapper.set(InsElderContractInfo::getTemplateName, insElderContractInfo.getTemplateName());
        }
        if (insElderContractInfo.getSignTime() != null) {
            chainWrapper.set(InsElderContractInfo::getSignTime, insElderContractInfo.getSignTime());
        }
        if (insElderContractInfo.getStartDate() != null) {
            chainWrapper.set(InsElderContractInfo::getStartDate, insElderContractInfo.getStartDate());
        }
        if (insElderContractInfo.getEndDate() != null) {
            chainWrapper.set(InsElderContractInfo::getEndDate, insElderContractInfo.getEndDate());
        }
        if (insElderContractInfo.getDepositAmount() != null) {
            chainWrapper.set(InsElderContractInfo::getDepositAmount, insElderContractInfo.getDepositAmount());
        }
        if (insElderContractInfo.getCostType() != null) {
            chainWrapper.set(InsElderContractInfo::getCostType, insElderContractInfo.getCostType());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getBedType())) {
            chainWrapper.set(InsElderContractInfo::getBedType, insElderContractInfo.getBedType());
        }
        if (insElderContractInfo.getBedAmount() != null) {
            chainWrapper.set(InsElderContractInfo::getBedAmount, insElderContractInfo.getBedAmount());
        }
        if (insElderContractInfo.getBedDepositAmount() != null) {
            chainWrapper.set(InsElderContractInfo::getBedDepositAmount, insElderContractInfo.getBedDepositAmount());
        }
        if (insElderContractInfo.getNursingLevelId() != null) {
            chainWrapper.set(InsElderContractInfo::getNursingLevelId, insElderContractInfo.getNursingLevelId());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getNursingLevelName())) {
            chainWrapper.set(InsElderContractInfo::getNursingLevelName, insElderContractInfo.getNursingLevelName());
        }
        if (insElderContractInfo.getNursingAmount() != null) {
            chainWrapper.set(InsElderContractInfo::getNursingAmount, insElderContractInfo.getNursingAmount());
        }
        if (insElderContractInfo.getNursingDepositAmount() != null) {
            chainWrapper.set(InsElderContractInfo::getNursingDepositAmount, insElderContractInfo.getNursingDepositAmount());
        }
        if (insElderContractInfo.getFoodAmount() != null) {
            chainWrapper.set(InsElderContractInfo::getFoodAmount, insElderContractInfo.getFoodAmount());
        }
        if (insElderContractInfo.getFoodDepositAmount() != null) {
            chainWrapper.set(InsElderContractInfo::getFoodDepositAmount, insElderContractInfo.getFoodDepositAmount());
        }
        if (insElderContractInfo.getIsSubsidy() != null) {
            chainWrapper.set(InsElderContractInfo::getIsSubsidy, insElderContractInfo.getIsSubsidy());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getContractDesp())) {
            chainWrapper.set(InsElderContractInfo::getContractDesp, insElderContractInfo.getContractDesp());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getPartyNameA())) {
            chainWrapper.set(InsElderContractInfo::getPartyNameA, insElderContractInfo.getPartyNameA());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getLinkTelA())) {
            chainWrapper.set(InsElderContractInfo::getLinkTelA, insElderContractInfo.getLinkTelA());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getAddressA())) {
            chainWrapper.set(InsElderContractInfo::getAddressA, insElderContractInfo.getAddressA());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getPartyNameB())) {
            chainWrapper.set(InsElderContractInfo::getPartyNameB, insElderContractInfo.getPartyNameB());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getLinkTelB())) {
            chainWrapper.set(InsElderContractInfo::getLinkTelB, insElderContractInfo.getLinkTelB());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getAddressB())) {
            chainWrapper.set(InsElderContractInfo::getAddressB, insElderContractInfo.getAddressB());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getPartyNameC())) {
            chainWrapper.set(InsElderContractInfo::getPartyNameC, insElderContractInfo.getPartyNameC());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getLinkTelC())) {
            chainWrapper.set(InsElderContractInfo::getLinkTelC, insElderContractInfo.getLinkTelC());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getAddressC())) {
            chainWrapper.set(InsElderContractInfo::getAddressC, insElderContractInfo.getAddressC());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getTemplateContent())) {
            chainWrapper.set(InsElderContractInfo::getTemplateContent, insElderContractInfo.getTemplateContent());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getContractPath())) {
            chainWrapper.set(InsElderContractInfo::getContractPath, insElderContractInfo.getContractPath());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getInvoicePath())) {
            chainWrapper.set(InsElderContractInfo::getInvoicePath, insElderContractInfo.getInvoicePath());
        }
        if (insElderContractInfo.getContractState() != null) {
            chainWrapper.set(InsElderContractInfo::getContractState, insElderContractInfo.getContractState());
        }
        if (insElderContractInfo.getSubmitState() != null) {
            chainWrapper.set(InsElderContractInfo::getSubmitState, insElderContractInfo.getSubmitState());
        }
        if (insElderContractInfo.getSigningState() != null) {
            chainWrapper.set(InsElderContractInfo::getSigningState, insElderContractInfo.getSigningState());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getAreaCode())) {
            chainWrapper.set(InsElderContractInfo::getAreaCode, insElderContractInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getAreaName())) {
            chainWrapper.set(InsElderContractInfo::getAreaName, insElderContractInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getRemark())) {
            chainWrapper.set(InsElderContractInfo::getRemark, insElderContractInfo.getRemark());
        }
        if (insElderContractInfo.getCreateUser() != null) {
            chainWrapper.set(InsElderContractInfo::getCreateUser, insElderContractInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getCreateName())) {
            chainWrapper.set(InsElderContractInfo::getCreateName, insElderContractInfo.getCreateName());
        }
        if (insElderContractInfo.getCreateDept() != null) {
            chainWrapper.set(InsElderContractInfo::getCreateDept, insElderContractInfo.getCreateDept());
        }
        if (insElderContractInfo.getCreateTime() != null) {
            chainWrapper.set(InsElderContractInfo::getCreateTime, insElderContractInfo.getCreateTime());
        }
        if (insElderContractInfo.getUpdateUser() != null) {
            chainWrapper.set(InsElderContractInfo::getUpdateUser, insElderContractInfo.getUpdateUser());
        }
        if (insElderContractInfo.getUpdateTime() != null) {
            chainWrapper.set(InsElderContractInfo::getUpdateTime, insElderContractInfo.getUpdateTime());
        }
        if (insElderContractInfo.getIsDeleted() != null) {
            chainWrapper.set(InsElderContractInfo::getIsDeleted, insElderContractInfo.getIsDeleted());
        }
        if (insElderContractInfo.getStatus() != null) {
            chainWrapper.set(InsElderContractInfo::getStatus, insElderContractInfo.getStatus());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getCodePath())) {
            chainWrapper.set(InsElderContractInfo::getCodePath, insElderContractInfo.getCodePath());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getStafferSign())) {
            chainWrapper.set(InsElderContractInfo::getStafferSign, insElderContractInfo.getStafferSign());
        }
        if (insElderContractInfo.getStafferDate() != null) {
            chainWrapper.set(InsElderContractInfo::getStafferDate, insElderContractInfo.getStafferDate());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getGuardianSign())) {
            chainWrapper.set(InsElderContractInfo::getGuardianSign, insElderContractInfo.getGuardianSign());
        }
        if (insElderContractInfo.getGuardianDate() != null) {
            chainWrapper.set(InsElderContractInfo::getGuardianDate, insElderContractInfo.getGuardianDate());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getOtherSign())) {
            chainWrapper.set(InsElderContractInfo::getOtherSign, insElderContractInfo.getOtherSign());
        }
        if (insElderContractInfo.getOtherDate() != null) {
            chainWrapper.set(InsElderContractInfo::getOtherDate, insElderContractInfo.getOtherDate());
        }
        if (insElderContractInfo.getAuditState() != null) {
            chainWrapper.set(InsElderContractInfo::getAuditState, insElderContractInfo.getAuditState());
        }
        if (insElderContractInfo.getAuditId() != null) {
            chainWrapper.set(InsElderContractInfo::getAuditId, insElderContractInfo.getAuditId());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getAuditName())) {
            chainWrapper.set(InsElderContractInfo::getAuditName, insElderContractInfo.getAuditName());
        }
        if (insElderContractInfo.getAuditTime() != null) {
            chainWrapper.set(InsElderContractInfo::getAuditTime, insElderContractInfo.getAuditTime());
        }
        if (StringUtil.isNotBlank(insElderContractInfo.getAuditMemo())) {
            chainWrapper.set(InsElderContractInfo::getAuditMemo, insElderContractInfo.getAuditMemo());
        }
        if (insElderContractInfo.getSendState() != null) {
            chainWrapper.set(InsElderContractInfo::getSendState, insElderContractInfo.getSendState());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderContractInfo::getId, insElderContractInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderContractInfo.getId());
        } else {
            return insElderContractInfo;
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
    public boolean saveInsElderContractInfoBatch(List<InsElderContractInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderContractInfo insElderContractInfo : insertList) {
            //使用默认的雪花算法生成
            insElderContractInfo.setId(null);
            //insElderContractInfo.setCreatedDt(currentDte);
            //insElderContractInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderContractInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderContractInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


