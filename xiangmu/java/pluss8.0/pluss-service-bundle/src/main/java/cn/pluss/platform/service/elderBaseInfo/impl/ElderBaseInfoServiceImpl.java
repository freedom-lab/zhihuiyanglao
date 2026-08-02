package cn.pluss.platform.service.elderBaseInfo.impl;

import cn.pluss.platform.mapper.ElderBaseInfoMapper;
import cn.pluss.platform.model.entity.ElderBaseInfo;
import cn.pluss.platform.service.elderBaseInfo.ElderBaseInfoService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

@Transactional
@Service("elderBaseInfoService")
public class ElderBaseInfoServiceImpl extends ServiceImpl< ElderBaseInfoMapper, ElderBaseInfo> implements ElderBaseInfoService {
    private static final Logger logger = LoggerFactory.getLogger(ElderBaseInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<ElderBaseInfo> queryPage(Map map) {
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
    public ElderBaseInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param elderBaseInfo 实例对象
    * @return 实例对象
    */
    @Override
    public ElderBaseInfo queryOne(ElderBaseInfo elderBaseInfo){
        LambdaQueryWrapper<ElderBaseInfo> queryWrapper = getQueryWrapper(elderBaseInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param elderBaseInfo
    * @return
    */
    @Override
    public List<ElderBaseInfo> queryList(ElderBaseInfo elderBaseInfo) {
        LambdaQueryWrapper<ElderBaseInfo> queryWrapper = getQueryWrapper(elderBaseInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param elderBaseInfo
    * @return
    */
    public static LambdaQueryWrapper<ElderBaseInfo> getQueryWrapper(ElderBaseInfo elderBaseInfo){
        LambdaQueryWrapper<ElderBaseInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (elderBaseInfo.getId() != null) {
            queryWrapper.eq(ElderBaseInfo::getId, elderBaseInfo.getId());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getTenantId())) {
            queryWrapper.eq(ElderBaseInfo::getTenantId, elderBaseInfo.getTenantId());
        }
        if (elderBaseInfo.getCorpId() != null) {
            queryWrapper.eq(ElderBaseInfo::getCorpId, elderBaseInfo.getCorpId());
        }
        if (elderBaseInfo.getInstitutionId() != null) {
            queryWrapper.eq(ElderBaseInfo::getInstitutionId, elderBaseInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getInstitutionName())) {
            queryWrapper.eq(ElderBaseInfo::getInstitutionName, elderBaseInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getFileCode())) {
            queryWrapper.eq(ElderBaseInfo::getFileCode, elderBaseInfo.getFileCode());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getElderName())) {
            queryWrapper.eq(ElderBaseInfo::getElderName, elderBaseInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getElderCode())) {
            queryWrapper.eq(ElderBaseInfo::getElderCode, elderBaseInfo.getElderCode());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getElderImg())) {
            queryWrapper.eq(ElderBaseInfo::getElderImg, elderBaseInfo.getElderImg());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getElderCodeImage())) {
            queryWrapper.eq(ElderBaseInfo::getElderCodeImage, elderBaseInfo.getElderCodeImage());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getElderNursingLevel())) {
            queryWrapper.eq(ElderBaseInfo::getElderNursingLevel, elderBaseInfo.getElderNursingLevel());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getSex())) {
            queryWrapper.eq(ElderBaseInfo::getSex, elderBaseInfo.getSex());
        }
        if (elderBaseInfo.getAge() != null) {
            queryWrapper.eq(ElderBaseInfo::getAge, elderBaseInfo.getAge());
        }
        if (elderBaseInfo.getBirthday() != null) {
            queryWrapper.eq(ElderBaseInfo::getBirthday, elderBaseInfo.getBirthday());
        }
        if (elderBaseInfo.getTraditionalBirthday() != null) {
            queryWrapper.eq(ElderBaseInfo::getTraditionalBirthday, elderBaseInfo.getTraditionalBirthday());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getBloodType())) {
            queryWrapper.eq(ElderBaseInfo::getBloodType, elderBaseInfo.getBloodType());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getNationality())) {
            queryWrapper.eq(ElderBaseInfo::getNationality, elderBaseInfo.getNationality());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getNation())) {
            queryWrapper.eq(ElderBaseInfo::getNation, elderBaseInfo.getNation());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getLinkTel())) {
            queryWrapper.eq(ElderBaseInfo::getLinkTel, elderBaseInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getHomeTel())) {
            queryWrapper.eq(ElderBaseInfo::getHomeTel, elderBaseInfo.getHomeTel());
        }
        if (elderBaseInfo.getCensusType() != null) {
            queryWrapper.eq(ElderBaseInfo::getCensusType, elderBaseInfo.getCensusType());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getElderType())) {
            queryWrapper.eq(ElderBaseInfo::getElderType, elderBaseInfo.getElderType());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getDocumentType())) {
            queryWrapper.eq(ElderBaseInfo::getDocumentType, elderBaseInfo.getDocumentType());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIdCard())) {
            queryWrapper.eq(ElderBaseInfo::getIdCard, elderBaseInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getSocialCardNo())) {
            queryWrapper.eq(ElderBaseInfo::getSocialCardNo, elderBaseInfo.getSocialCardNo());
        }
        if (elderBaseInfo.getElderState() != null) {
            queryWrapper.eq(ElderBaseInfo::getElderState, elderBaseInfo.getElderState());
        }
        if (elderBaseInfo.getPensionMode() != null) {
            queryWrapper.eq(ElderBaseInfo::getPensionMode, elderBaseInfo.getPensionMode());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIdentityStatus())) {
            queryWrapper.eq(ElderBaseInfo::getIdentityStatus, elderBaseInfo.getIdentityStatus());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getProvideType())) {
            queryWrapper.eq(ElderBaseInfo::getProvideType, elderBaseInfo.getProvideType());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getMarryState())) {
            queryWrapper.eq(ElderBaseInfo::getMarryState, elderBaseInfo.getMarryState());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getDegreeEducation())) {
            queryWrapper.eq(ElderBaseInfo::getDegreeEducation, elderBaseInfo.getDegreeEducation());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getPoliticalStatus())) {
            queryWrapper.eq(ElderBaseInfo::getPoliticalStatus, elderBaseInfo.getPoliticalStatus());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getReligionType())) {
            queryWrapper.eq(ElderBaseInfo::getReligionType, elderBaseInfo.getReligionType());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getEconomicSources())) {
            queryWrapper.eq(ElderBaseInfo::getEconomicSources, elderBaseInfo.getEconomicSources());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getMonthlyIncome())) {
            queryWrapper.eq(ElderBaseInfo::getMonthlyIncome, elderBaseInfo.getMonthlyIncome());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getLiveState())) {
            queryWrapper.eq(ElderBaseInfo::getLiveState, elderBaseInfo.getLiveState());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getPesidenceType())) {
            queryWrapper.eq(ElderBaseInfo::getPesidenceType, elderBaseInfo.getPesidenceType());
        }
        if (elderBaseInfo.getPesidenceAreaCode() != null) {
            queryWrapper.eq(ElderBaseInfo::getPesidenceAreaCode, elderBaseInfo.getPesidenceAreaCode());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getPesidenceAreaName())) {
            queryWrapper.eq(ElderBaseInfo::getPesidenceAreaName, elderBaseInfo.getPesidenceAreaName());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getPesidenceAddress())) {
            queryWrapper.eq(ElderBaseInfo::getPesidenceAddress, elderBaseInfo.getPesidenceAddress());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getHomeAddress())) {
            queryWrapper.eq(ElderBaseInfo::getHomeAddress, elderBaseInfo.getHomeAddress());
        }
        if (elderBaseInfo.getResidenceId() != null) {
            queryWrapper.eq(ElderBaseInfo::getResidenceId, elderBaseInfo.getResidenceId());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getResidenceName())) {
            queryWrapper.eq(ElderBaseInfo::getResidenceName, elderBaseInfo.getResidenceName());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsProvide())) {
            queryWrapper.eq(ElderBaseInfo::getIsProvide, elderBaseInfo.getIsProvide());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsStayPesidence())) {
            queryWrapper.eq(ElderBaseInfo::getIsStayPesidence, elderBaseInfo.getIsStayPesidence());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsAlone())) {
            queryWrapper.eq(ElderBaseInfo::getIsAlone, elderBaseInfo.getIsAlone());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsDementia())) {
            queryWrapper.eq(ElderBaseInfo::getIsDementia, elderBaseInfo.getIsDementia());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsStayBehind())) {
            queryWrapper.eq(ElderBaseInfo::getIsStayBehind, elderBaseInfo.getIsStayBehind());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsAllowance())) {
            queryWrapper.eq(ElderBaseInfo::getIsAllowance, elderBaseInfo.getIsAllowance());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsPoor())) {
            queryWrapper.eq(ElderBaseInfo::getIsPoor, elderBaseInfo.getIsPoor());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsLonelyOld())) {
            queryWrapper.eq(ElderBaseInfo::getIsLonelyOld, elderBaseInfo.getIsLonelyOld());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsLtci())) {
            queryWrapper.eq(ElderBaseInfo::getIsLtci, elderBaseInfo.getIsLtci());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsDisabled())) {
            queryWrapper.eq(ElderBaseInfo::getIsDisabled, elderBaseInfo.getIsDisabled());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsExtremelyPoor())) {
            queryWrapper.eq(ElderBaseInfo::getIsExtremelyPoor, elderBaseInfo.getIsExtremelyPoor());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsSocialInsurance())) {
            queryWrapper.eq(ElderBaseInfo::getIsSocialInsurance, elderBaseInfo.getIsSocialInsurance());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsEntitled())) {
            queryWrapper.eq(ElderBaseInfo::getIsEntitled, elderBaseInfo.getIsEntitled());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getMedicalCategory())) {
            queryWrapper.eq(ElderBaseInfo::getMedicalCategory, elderBaseInfo.getMedicalCategory());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getOldageInsuranceType())) {
            queryWrapper.eq(ElderBaseInfo::getOldageInsuranceType, elderBaseInfo.getOldageInsuranceType());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getAbilityLevel())) {
            queryWrapper.eq(ElderBaseInfo::getAbilityLevel, elderBaseInfo.getAbilityLevel());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsDisability())) {
            queryWrapper.eq(ElderBaseInfo::getIsDisability, elderBaseInfo.getIsDisability());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getDisabilityLevel())) {
            queryWrapper.eq(ElderBaseInfo::getDisabilityLevel, elderBaseInfo.getDisabilityLevel());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getDisabilityType())) {
            queryWrapper.eq(ElderBaseInfo::getDisabilityType, elderBaseInfo.getDisabilityType());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getDisabilityCard())) {
            queryWrapper.eq(ElderBaseInfo::getDisabilityCard, elderBaseInfo.getDisabilityCard());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getMajorDiseases())) {
            queryWrapper.eq(ElderBaseInfo::getMajorDiseases, elderBaseInfo.getMajorDiseases());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getMajorDiseasesName())) {
            queryWrapper.eq(ElderBaseInfo::getMajorDiseasesName, elderBaseInfo.getMajorDiseasesName());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getGuardianContact())) {
            queryWrapper.eq(ElderBaseInfo::getGuardianContact, elderBaseInfo.getGuardianContact());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getGuardianContactTel())) {
            queryWrapper.eq(ElderBaseInfo::getGuardianContactTel, elderBaseInfo.getGuardianContactTel());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getGuardianContactRelationship())) {
            queryWrapper.eq(ElderBaseInfo::getGuardianContactRelationship, elderBaseInfo.getGuardianContactRelationship());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getGuardianContactAddress())) {
            queryWrapper.eq(ElderBaseInfo::getGuardianContactAddress, elderBaseInfo.getGuardianContactAddress());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getEmergencyContact())) {
            queryWrapper.eq(ElderBaseInfo::getEmergencyContact, elderBaseInfo.getEmergencyContact());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getEmergencyContactTel())) {
            queryWrapper.eq(ElderBaseInfo::getEmergencyContactTel, elderBaseInfo.getEmergencyContactTel());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getEmergencyContactRelationship())) {
            queryWrapper.eq(ElderBaseInfo::getEmergencyContactRelationship, elderBaseInfo.getEmergencyContactRelationship());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getEmergencyContactAddress())) {
            queryWrapper.eq(ElderBaseInfo::getEmergencyContactAddress, elderBaseInfo.getEmergencyContactAddress());
        }
        if (elderBaseInfo.getChildNum() != null) {
            queryWrapper.eq(ElderBaseInfo::getChildNum, elderBaseInfo.getChildNum());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getCharacterType())) {
            queryWrapper.eq(ElderBaseInfo::getCharacterType, elderBaseInfo.getCharacterType());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getHobby())) {
            queryWrapper.eq(ElderBaseInfo::getHobby, elderBaseInfo.getHobby());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getEatingHabits())) {
            queryWrapper.eq(ElderBaseInfo::getEatingHabits, elderBaseInfo.getEatingHabits());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getTaboo())) {
            queryWrapper.eq(ElderBaseInfo::getTaboo, elderBaseInfo.getTaboo());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getWorkUnit())) {
            queryWrapper.eq(ElderBaseInfo::getWorkUnit, elderBaseInfo.getWorkUnit());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getAppPass())) {
            queryWrapper.eq(ElderBaseInfo::getAppPass, elderBaseInfo.getAppPass());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsCome())) {
            queryWrapper.eq(ElderBaseInfo::getIsCome, elderBaseInfo.getIsCome());
        }
        if (elderBaseInfo.getLon() != null) {
            queryWrapper.eq(ElderBaseInfo::getLon, elderBaseInfo.getLon());
        }
        if (elderBaseInfo.getLat() != null) {
            queryWrapper.eq(ElderBaseInfo::getLat, elderBaseInfo.getLat());
        }
        if (elderBaseInfo.getAreaCode() != null) {
            queryWrapper.eq(ElderBaseInfo::getAreaCode, elderBaseInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getAreaName())) {
            queryWrapper.eq(ElderBaseInfo::getAreaName, elderBaseInfo.getAreaName());
        }
        if (elderBaseInfo.getAuditState() != null) {
            queryWrapper.eq(ElderBaseInfo::getAuditState, elderBaseInfo.getAuditState());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getAuditName())) {
            queryWrapper.eq(ElderBaseInfo::getAuditName, elderBaseInfo.getAuditName());
        }
        if (elderBaseInfo.getAuditTime() != null) {
            queryWrapper.eq(ElderBaseInfo::getAuditTime, elderBaseInfo.getAuditTime());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getAuditOpinion())) {
            queryWrapper.eq(ElderBaseInfo::getAuditOpinion, elderBaseInfo.getAuditOpinion());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsOlderAge())) {
            queryWrapper.eq(ElderBaseInfo::getIsOlderAge, elderBaseInfo.getIsOlderAge());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsEmptyNest())) {
            queryWrapper.eq(ElderBaseInfo::getIsEmptyNest, elderBaseInfo.getIsEmptyNest());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsReform())) {
            queryWrapper.eq(ElderBaseInfo::getIsReform, elderBaseInfo.getIsReform());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsBedBuild())) {
            queryWrapper.eq(ElderBaseInfo::getIsBedBuild, elderBaseInfo.getIsBedBuild());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsServiceSubsidy())) {
            queryWrapper.eq(ElderBaseInfo::getIsServiceSubsidy, elderBaseInfo.getIsServiceSubsidy());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsNursingSubsidy())) {
            queryWrapper.eq(ElderBaseInfo::getIsNursingSubsidy, elderBaseInfo.getIsNursingSubsidy());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsSelfCare())) {
            queryWrapper.eq(ElderBaseInfo::getIsSelfCare, elderBaseInfo.getIsSelfCare());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getIsCentralizedCare())) {
            queryWrapper.eq(ElderBaseInfo::getIsCentralizedCare, elderBaseInfo.getIsCentralizedCare());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getHouseholderName())) {
            queryWrapper.eq(ElderBaseInfo::getHouseholderName, elderBaseInfo.getHouseholderName());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getHouseholderIdCard())) {
            queryWrapper.eq(ElderBaseInfo::getHouseholderIdCard, elderBaseInfo.getHouseholderIdCard());
        }
        if (elderBaseInfo.getHouseholderAge() != null) {
            queryWrapper.eq(ElderBaseInfo::getHouseholderAge, elderBaseInfo.getHouseholderAge());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getBasicServiceIds())) {
            queryWrapper.eq(ElderBaseInfo::getBasicServiceIds, elderBaseInfo.getBasicServiceIds());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getRemark())) {
            queryWrapper.eq(ElderBaseInfo::getRemark, elderBaseInfo.getRemark());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getCreateName())) {
            queryWrapper.eq(ElderBaseInfo::getCreateName, elderBaseInfo.getCreateName());
        }
        if (elderBaseInfo.getCreateUser() != null) {
            queryWrapper.eq(ElderBaseInfo::getCreateUser, elderBaseInfo.getCreateUser());
        }
        if (elderBaseInfo.getCreateDept() != null) {
            queryWrapper.eq(ElderBaseInfo::getCreateDept, elderBaseInfo.getCreateDept());
        }
        if (elderBaseInfo.getCreateTime() != null) {
            queryWrapper.eq(ElderBaseInfo::getCreateTime, elderBaseInfo.getCreateTime());
        }
        if (elderBaseInfo.getUpdateUser() != null) {
            queryWrapper.eq(ElderBaseInfo::getUpdateUser, elderBaseInfo.getUpdateUser());
        }
        if (elderBaseInfo.getUpdateTime() != null) {
            queryWrapper.eq(ElderBaseInfo::getUpdateTime, elderBaseInfo.getUpdateTime());
        }
        if (elderBaseInfo.getIsDeleted() != null) {
            queryWrapper.eq(ElderBaseInfo::getIsDeleted, elderBaseInfo.getIsDeleted());
        }
        if (elderBaseInfo.getStatus() != null) {
            queryWrapper.eq(ElderBaseInfo::getStatus, elderBaseInfo.getStatus());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getGuid())) {
            queryWrapper.eq(ElderBaseInfo::getGuid, elderBaseInfo.getGuid());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getFaceGuid())) {
            queryWrapper.eq(ElderBaseInfo::getFaceGuid, elderBaseInfo.getFaceGuid());
        }
        if (elderBaseInfo.getGspState() != null) {
            queryWrapper.eq(ElderBaseInfo::getGspState, elderBaseInfo.getGspState());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getFkElderId())) {
            queryWrapper.eq(ElderBaseInfo::getFkElderId, elderBaseInfo.getFkElderId());
        }
        if (elderBaseInfo.getMonthlyDisposableIncome() != null) {
            queryWrapper.eq(ElderBaseInfo::getMonthlyDisposableIncome, elderBaseInfo.getMonthlyDisposableIncome());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getHealthCondition())) {
            queryWrapper.eq(ElderBaseInfo::getHealthCondition, elderBaseInfo.getHealthCondition());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getHealthId())) {
            queryWrapper.eq(ElderBaseInfo::getHealthId, elderBaseInfo.getHealthId());
        }
        if (elderBaseInfo.getIsWishCareBed() != null) {
            queryWrapper.eq(ElderBaseInfo::getIsWishCareBed, elderBaseInfo.getIsWishCareBed());
        }
        if (elderBaseInfo.getIsInstallCareBed() != null) {
            queryWrapper.eq(ElderBaseInfo::getIsInstallCareBed, elderBaseInfo.getIsInstallCareBed());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getNfcNumber())) {
            queryWrapper.eq(ElderBaseInfo::getNfcNumber, elderBaseInfo.getNfcNumber());
        }
        if (StringUtil.isNotEmpty(elderBaseInfo.getMajorDiseasesOther())) {
            queryWrapper.eq(ElderBaseInfo::getMajorDiseasesOther, elderBaseInfo.getMajorDiseasesOther());
        }
        if (elderBaseInfo.getIsCheck() != null) {
            queryWrapper.eq(ElderBaseInfo::getIsCheck, elderBaseInfo.getIsCheck());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param elderBaseInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public ElderBaseInfo insert(ElderBaseInfo elderBaseInfo) {
        elderBaseInfo.setId(null);
        getBaseMapper().insert(elderBaseInfo);
        return elderBaseInfo;
    }

    /**
    * 更新数据
    *
    * @param elderBaseInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public ElderBaseInfo update(ElderBaseInfo elderBaseInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<ElderBaseInfo> chainWrapper = new LambdaUpdateChainWrapper<ElderBaseInfo>(getBaseMapper());
        if (elderBaseInfo.getId() != null) {
            chainWrapper.set(ElderBaseInfo::getId, elderBaseInfo.getId());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getTenantId())) {
            chainWrapper.set(ElderBaseInfo::getTenantId, elderBaseInfo.getTenantId());
        }
        if (elderBaseInfo.getCorpId() != null) {
            chainWrapper.set(ElderBaseInfo::getCorpId, elderBaseInfo.getCorpId());
        }
        if (elderBaseInfo.getInstitutionId() != null) {
            chainWrapper.set(ElderBaseInfo::getInstitutionId, elderBaseInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getInstitutionName())) {
            chainWrapper.set(ElderBaseInfo::getInstitutionName, elderBaseInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getFileCode())) {
            chainWrapper.set(ElderBaseInfo::getFileCode, elderBaseInfo.getFileCode());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getElderName())) {
            chainWrapper.set(ElderBaseInfo::getElderName, elderBaseInfo.getElderName());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getElderCode())) {
            chainWrapper.set(ElderBaseInfo::getElderCode, elderBaseInfo.getElderCode());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getElderImg())) {
            chainWrapper.set(ElderBaseInfo::getElderImg, elderBaseInfo.getElderImg());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getElderCodeImage())) {
            chainWrapper.set(ElderBaseInfo::getElderCodeImage, elderBaseInfo.getElderCodeImage());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getElderNursingLevel())) {
            chainWrapper.set(ElderBaseInfo::getElderNursingLevel, elderBaseInfo.getElderNursingLevel());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getSex())) {
            chainWrapper.set(ElderBaseInfo::getSex, elderBaseInfo.getSex());
        }
        if (elderBaseInfo.getAge() != null) {
            chainWrapper.set(ElderBaseInfo::getAge, elderBaseInfo.getAge());
        }
        if (elderBaseInfo.getBirthday() != null) {
            chainWrapper.set(ElderBaseInfo::getBirthday, elderBaseInfo.getBirthday());
        }
        if (elderBaseInfo.getTraditionalBirthday() != null) {
            chainWrapper.set(ElderBaseInfo::getTraditionalBirthday, elderBaseInfo.getTraditionalBirthday());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getBloodType())) {
            chainWrapper.set(ElderBaseInfo::getBloodType, elderBaseInfo.getBloodType());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getNationality())) {
            chainWrapper.set(ElderBaseInfo::getNationality, elderBaseInfo.getNationality());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getNation())) {
            chainWrapper.set(ElderBaseInfo::getNation, elderBaseInfo.getNation());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getLinkTel())) {
            chainWrapper.set(ElderBaseInfo::getLinkTel, elderBaseInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getHomeTel())) {
            chainWrapper.set(ElderBaseInfo::getHomeTel, elderBaseInfo.getHomeTel());
        }
        if (elderBaseInfo.getCensusType() != null) {
            chainWrapper.set(ElderBaseInfo::getCensusType, elderBaseInfo.getCensusType());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getElderType())) {
            chainWrapper.set(ElderBaseInfo::getElderType, elderBaseInfo.getElderType());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getDocumentType())) {
            chainWrapper.set(ElderBaseInfo::getDocumentType, elderBaseInfo.getDocumentType());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIdCard())) {
            chainWrapper.set(ElderBaseInfo::getIdCard, elderBaseInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getSocialCardNo())) {
            chainWrapper.set(ElderBaseInfo::getSocialCardNo, elderBaseInfo.getSocialCardNo());
        }
        if (elderBaseInfo.getElderState() != null) {
            chainWrapper.set(ElderBaseInfo::getElderState, elderBaseInfo.getElderState());
        }
        if (elderBaseInfo.getPensionMode() != null) {
            chainWrapper.set(ElderBaseInfo::getPensionMode, elderBaseInfo.getPensionMode());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIdentityStatus())) {
            chainWrapper.set(ElderBaseInfo::getIdentityStatus, elderBaseInfo.getIdentityStatus());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getProvideType())) {
            chainWrapper.set(ElderBaseInfo::getProvideType, elderBaseInfo.getProvideType());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getMarryState())) {
            chainWrapper.set(ElderBaseInfo::getMarryState, elderBaseInfo.getMarryState());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getDegreeEducation())) {
            chainWrapper.set(ElderBaseInfo::getDegreeEducation, elderBaseInfo.getDegreeEducation());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getPoliticalStatus())) {
            chainWrapper.set(ElderBaseInfo::getPoliticalStatus, elderBaseInfo.getPoliticalStatus());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getReligionType())) {
            chainWrapper.set(ElderBaseInfo::getReligionType, elderBaseInfo.getReligionType());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getEconomicSources())) {
            chainWrapper.set(ElderBaseInfo::getEconomicSources, elderBaseInfo.getEconomicSources());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getMonthlyIncome())) {
            chainWrapper.set(ElderBaseInfo::getMonthlyIncome, elderBaseInfo.getMonthlyIncome());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getLiveState())) {
            chainWrapper.set(ElderBaseInfo::getLiveState, elderBaseInfo.getLiveState());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getPesidenceType())) {
            chainWrapper.set(ElderBaseInfo::getPesidenceType, elderBaseInfo.getPesidenceType());
        }
        if (elderBaseInfo.getPesidenceAreaCode() != null) {
            chainWrapper.set(ElderBaseInfo::getPesidenceAreaCode, elderBaseInfo.getPesidenceAreaCode());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getPesidenceAreaName())) {
            chainWrapper.set(ElderBaseInfo::getPesidenceAreaName, elderBaseInfo.getPesidenceAreaName());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getPesidenceAddress())) {
            chainWrapper.set(ElderBaseInfo::getPesidenceAddress, elderBaseInfo.getPesidenceAddress());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getHomeAddress())) {
            chainWrapper.set(ElderBaseInfo::getHomeAddress, elderBaseInfo.getHomeAddress());
        }
        if (elderBaseInfo.getResidenceId() != null) {
            chainWrapper.set(ElderBaseInfo::getResidenceId, elderBaseInfo.getResidenceId());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getResidenceName())) {
            chainWrapper.set(ElderBaseInfo::getResidenceName, elderBaseInfo.getResidenceName());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsProvide())) {
            chainWrapper.set(ElderBaseInfo::getIsProvide, elderBaseInfo.getIsProvide());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsStayPesidence())) {
            chainWrapper.set(ElderBaseInfo::getIsStayPesidence, elderBaseInfo.getIsStayPesidence());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsAlone())) {
            chainWrapper.set(ElderBaseInfo::getIsAlone, elderBaseInfo.getIsAlone());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsDementia())) {
            chainWrapper.set(ElderBaseInfo::getIsDementia, elderBaseInfo.getIsDementia());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsStayBehind())) {
            chainWrapper.set(ElderBaseInfo::getIsStayBehind, elderBaseInfo.getIsStayBehind());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsAllowance())) {
            chainWrapper.set(ElderBaseInfo::getIsAllowance, elderBaseInfo.getIsAllowance());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsPoor())) {
            chainWrapper.set(ElderBaseInfo::getIsPoor, elderBaseInfo.getIsPoor());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsLonelyOld())) {
            chainWrapper.set(ElderBaseInfo::getIsLonelyOld, elderBaseInfo.getIsLonelyOld());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsLtci())) {
            chainWrapper.set(ElderBaseInfo::getIsLtci, elderBaseInfo.getIsLtci());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsDisabled())) {
            chainWrapper.set(ElderBaseInfo::getIsDisabled, elderBaseInfo.getIsDisabled());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsExtremelyPoor())) {
            chainWrapper.set(ElderBaseInfo::getIsExtremelyPoor, elderBaseInfo.getIsExtremelyPoor());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsSocialInsurance())) {
            chainWrapper.set(ElderBaseInfo::getIsSocialInsurance, elderBaseInfo.getIsSocialInsurance());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsEntitled())) {
            chainWrapper.set(ElderBaseInfo::getIsEntitled, elderBaseInfo.getIsEntitled());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getMedicalCategory())) {
            chainWrapper.set(ElderBaseInfo::getMedicalCategory, elderBaseInfo.getMedicalCategory());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getOldageInsuranceType())) {
            chainWrapper.set(ElderBaseInfo::getOldageInsuranceType, elderBaseInfo.getOldageInsuranceType());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getAbilityLevel())) {
            chainWrapper.set(ElderBaseInfo::getAbilityLevel, elderBaseInfo.getAbilityLevel());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsDisability())) {
            chainWrapper.set(ElderBaseInfo::getIsDisability, elderBaseInfo.getIsDisability());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getDisabilityLevel())) {
            chainWrapper.set(ElderBaseInfo::getDisabilityLevel, elderBaseInfo.getDisabilityLevel());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getDisabilityType())) {
            chainWrapper.set(ElderBaseInfo::getDisabilityType, elderBaseInfo.getDisabilityType());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getDisabilityCard())) {
            chainWrapper.set(ElderBaseInfo::getDisabilityCard, elderBaseInfo.getDisabilityCard());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getMajorDiseases())) {
            chainWrapper.set(ElderBaseInfo::getMajorDiseases, elderBaseInfo.getMajorDiseases());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getMajorDiseasesName())) {
            chainWrapper.set(ElderBaseInfo::getMajorDiseasesName, elderBaseInfo.getMajorDiseasesName());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getGuardianContact())) {
            chainWrapper.set(ElderBaseInfo::getGuardianContact, elderBaseInfo.getGuardianContact());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getGuardianContactTel())) {
            chainWrapper.set(ElderBaseInfo::getGuardianContactTel, elderBaseInfo.getGuardianContactTel());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getGuardianContactRelationship())) {
            chainWrapper.set(ElderBaseInfo::getGuardianContactRelationship, elderBaseInfo.getGuardianContactRelationship());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getGuardianContactAddress())) {
            chainWrapper.set(ElderBaseInfo::getGuardianContactAddress, elderBaseInfo.getGuardianContactAddress());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getEmergencyContact())) {
            chainWrapper.set(ElderBaseInfo::getEmergencyContact, elderBaseInfo.getEmergencyContact());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getEmergencyContactTel())) {
            chainWrapper.set(ElderBaseInfo::getEmergencyContactTel, elderBaseInfo.getEmergencyContactTel());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getEmergencyContactRelationship())) {
            chainWrapper.set(ElderBaseInfo::getEmergencyContactRelationship, elderBaseInfo.getEmergencyContactRelationship());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getEmergencyContactAddress())) {
            chainWrapper.set(ElderBaseInfo::getEmergencyContactAddress, elderBaseInfo.getEmergencyContactAddress());
        }
        if (elderBaseInfo.getChildNum() != null) {
            chainWrapper.set(ElderBaseInfo::getChildNum, elderBaseInfo.getChildNum());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getCharacterType())) {
            chainWrapper.set(ElderBaseInfo::getCharacterType, elderBaseInfo.getCharacterType());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getHobby())) {
            chainWrapper.set(ElderBaseInfo::getHobby, elderBaseInfo.getHobby());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getEatingHabits())) {
            chainWrapper.set(ElderBaseInfo::getEatingHabits, elderBaseInfo.getEatingHabits());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getTaboo())) {
            chainWrapper.set(ElderBaseInfo::getTaboo, elderBaseInfo.getTaboo());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getWorkUnit())) {
            chainWrapper.set(ElderBaseInfo::getWorkUnit, elderBaseInfo.getWorkUnit());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getAppPass())) {
            chainWrapper.set(ElderBaseInfo::getAppPass, elderBaseInfo.getAppPass());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsCome())) {
            chainWrapper.set(ElderBaseInfo::getIsCome, elderBaseInfo.getIsCome());
        }
        if (elderBaseInfo.getLon() != null) {
            chainWrapper.set(ElderBaseInfo::getLon, elderBaseInfo.getLon());
        }
        if (elderBaseInfo.getLat() != null) {
            chainWrapper.set(ElderBaseInfo::getLat, elderBaseInfo.getLat());
        }
        if (elderBaseInfo.getAreaCode() != null) {
            chainWrapper.set(ElderBaseInfo::getAreaCode, elderBaseInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getAreaName())) {
            chainWrapper.set(ElderBaseInfo::getAreaName, elderBaseInfo.getAreaName());
        }
        if (elderBaseInfo.getAuditState() != null) {
            chainWrapper.set(ElderBaseInfo::getAuditState, elderBaseInfo.getAuditState());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getAuditName())) {
            chainWrapper.set(ElderBaseInfo::getAuditName, elderBaseInfo.getAuditName());
        }
        if (elderBaseInfo.getAuditTime() != null) {
            chainWrapper.set(ElderBaseInfo::getAuditTime, elderBaseInfo.getAuditTime());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getAuditOpinion())) {
            chainWrapper.set(ElderBaseInfo::getAuditOpinion, elderBaseInfo.getAuditOpinion());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsOlderAge())) {
            chainWrapper.set(ElderBaseInfo::getIsOlderAge, elderBaseInfo.getIsOlderAge());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsEmptyNest())) {
            chainWrapper.set(ElderBaseInfo::getIsEmptyNest, elderBaseInfo.getIsEmptyNest());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsReform())) {
            chainWrapper.set(ElderBaseInfo::getIsReform, elderBaseInfo.getIsReform());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsBedBuild())) {
            chainWrapper.set(ElderBaseInfo::getIsBedBuild, elderBaseInfo.getIsBedBuild());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsServiceSubsidy())) {
            chainWrapper.set(ElderBaseInfo::getIsServiceSubsidy, elderBaseInfo.getIsServiceSubsidy());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsNursingSubsidy())) {
            chainWrapper.set(ElderBaseInfo::getIsNursingSubsidy, elderBaseInfo.getIsNursingSubsidy());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsSelfCare())) {
            chainWrapper.set(ElderBaseInfo::getIsSelfCare, elderBaseInfo.getIsSelfCare());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getIsCentralizedCare())) {
            chainWrapper.set(ElderBaseInfo::getIsCentralizedCare, elderBaseInfo.getIsCentralizedCare());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getHouseholderName())) {
            chainWrapper.set(ElderBaseInfo::getHouseholderName, elderBaseInfo.getHouseholderName());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getHouseholderIdCard())) {
            chainWrapper.set(ElderBaseInfo::getHouseholderIdCard, elderBaseInfo.getHouseholderIdCard());
        }
        if (elderBaseInfo.getHouseholderAge() != null) {
            chainWrapper.set(ElderBaseInfo::getHouseholderAge, elderBaseInfo.getHouseholderAge());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getBasicServiceIds())) {
            chainWrapper.set(ElderBaseInfo::getBasicServiceIds, elderBaseInfo.getBasicServiceIds());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getRemark())) {
            chainWrapper.set(ElderBaseInfo::getRemark, elderBaseInfo.getRemark());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getCreateName())) {
            chainWrapper.set(ElderBaseInfo::getCreateName, elderBaseInfo.getCreateName());
        }
        if (elderBaseInfo.getCreateUser() != null) {
            chainWrapper.set(ElderBaseInfo::getCreateUser, elderBaseInfo.getCreateUser());
        }
        if (elderBaseInfo.getCreateDept() != null) {
            chainWrapper.set(ElderBaseInfo::getCreateDept, elderBaseInfo.getCreateDept());
        }
        if (elderBaseInfo.getCreateTime() != null) {
            chainWrapper.set(ElderBaseInfo::getCreateTime, elderBaseInfo.getCreateTime());
        }
        if (elderBaseInfo.getUpdateUser() != null) {
            chainWrapper.set(ElderBaseInfo::getUpdateUser, elderBaseInfo.getUpdateUser());
        }
        if (elderBaseInfo.getUpdateTime() != null) {
            chainWrapper.set(ElderBaseInfo::getUpdateTime, elderBaseInfo.getUpdateTime());
        }
        if (elderBaseInfo.getIsDeleted() != null) {
            chainWrapper.set(ElderBaseInfo::getIsDeleted, elderBaseInfo.getIsDeleted());
        }
        if (elderBaseInfo.getStatus() != null) {
            chainWrapper.set(ElderBaseInfo::getStatus, elderBaseInfo.getStatus());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getGuid())) {
            chainWrapper.set(ElderBaseInfo::getGuid, elderBaseInfo.getGuid());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getFaceGuid())) {
            chainWrapper.set(ElderBaseInfo::getFaceGuid, elderBaseInfo.getFaceGuid());
        }
        if (elderBaseInfo.getGspState() != null) {
            chainWrapper.set(ElderBaseInfo::getGspState, elderBaseInfo.getGspState());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getFkElderId())) {
            chainWrapper.set(ElderBaseInfo::getFkElderId, elderBaseInfo.getFkElderId());
        }
        if (elderBaseInfo.getMonthlyDisposableIncome() != null) {
            chainWrapper.set(ElderBaseInfo::getMonthlyDisposableIncome, elderBaseInfo.getMonthlyDisposableIncome());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getHealthCondition())) {
            chainWrapper.set(ElderBaseInfo::getHealthCondition, elderBaseInfo.getHealthCondition());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getHealthId())) {
            chainWrapper.set(ElderBaseInfo::getHealthId, elderBaseInfo.getHealthId());
        }
        if (elderBaseInfo.getIsWishCareBed() != null) {
            chainWrapper.set(ElderBaseInfo::getIsWishCareBed, elderBaseInfo.getIsWishCareBed());
        }
        if (elderBaseInfo.getIsInstallCareBed() != null) {
            chainWrapper.set(ElderBaseInfo::getIsInstallCareBed, elderBaseInfo.getIsInstallCareBed());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getNfcNumber())) {
            chainWrapper.set(ElderBaseInfo::getNfcNumber, elderBaseInfo.getNfcNumber());
        }
        if (StringUtil.isNotBlank(elderBaseInfo.getMajorDiseasesOther())) {
            chainWrapper.set(ElderBaseInfo::getMajorDiseasesOther, elderBaseInfo.getMajorDiseasesOther());
        }
        if (elderBaseInfo.getIsCheck() != null) {
            chainWrapper.set(ElderBaseInfo::getIsCheck, elderBaseInfo.getIsCheck());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(ElderBaseInfo::getId, elderBaseInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(elderBaseInfo.getId());
        } else {
            return elderBaseInfo;
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
    public boolean saveElderBaseInfoBatch(List<ElderBaseInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (ElderBaseInfo elderBaseInfo : insertList) {
            //使用默认的雪花算法生成
            elderBaseInfo.setId(null);
            //elderBaseInfo.setCreatedDt(currentDte);
            //elderBaseInfo.setUpdatedDt(currentDte);
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
    public Integer deleteElderBaseInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<ElderBaseInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> getElderlyAgeGenderStatistics() {
        Map<String, Object> result = new LinkedHashMap<>();
        List<ElderBaseInfo> elderBaseInfoList = getBaseMapper().selectList(null);
        int total = elderBaseInfoList.size();
        result.put("total", total);

        // --- 性别统计 ---
        long maleCount = elderBaseInfoList.stream().filter(a -> "1".equals(a.getSex())).count();
        long femaleCount = elderBaseInfoList.stream().filter(a -> "2".equals(a.getSex())).count();

        Map<String, Object> maleStat = new LinkedHashMap<>();
        maleStat.put("count", maleCount);
        maleStat.put("ratio", (total > 0 ? Math.round(maleCount * 10000.0 / total) / 100.0 : 0)+"%");

        Map<String, Object> femaleStat = new LinkedHashMap<>();
        femaleStat.put("count", femaleCount);
        femaleStat.put("ratio", (total > 0 ? Math.round(femaleCount * 10000.0 / total) / 100.0 : 0)+"%");

        Map<String, Object> genderStats = new LinkedHashMap<>();
        genderStats.put("male", maleStat);
        genderStats.put("female", femaleStat);
        result.put("gender", genderStats);

        // --- 年龄段统计 ---
        long under60 = 0;
        long age60to69 = 0;
        long age70to79 = 0;
        long age80to89 = 0;
        long age90to99 = 0;
        long over100 = 0;

        for (ElderBaseInfo elder : elderBaseInfoList) {
            Integer age = elder.getAge();
            if (age == null) {
                continue;
            }
            if (age < 60) {
                under60++;
            } else if (age <= 69) {
                age60to69++;
            } else if (age <= 79) {
                age70to79++;
            } else if (age <= 89) {
                age80to89++;
            } else if (age <= 99) {
                age90to99++;
            } else {
                over100++;
            }
        }

        List<Map<String, Object>> ageGroups = new ArrayList<>();

        String[] ageLabels = {"60岁以下", "60-69岁", "70-79岁", "80-89岁", "90-99岁", "100岁以上"};
        long[] ageCounts = {under60, age60to69, age70to79, age80to89, age90to99, over100};

        for (int i = 0; i < ageLabels.length; i++) {
            Map<String, Object> group = new LinkedHashMap<>();
            group.put("label", ageLabels[i]);
            group.put("count", ageCounts[i]);
            group.put("ratio", (total > 0 ? Math.round(ageCounts[i] * 10000.0 / total) / 100.0 : 0)+"%");
            ageGroups.add(group);
        }
        result.put("ageGroups", ageGroups);

        return result;
    }

    @Override
    public Map<String, Long> getCompetencyAssessmentStatistics() {
        List<ElderBaseInfo> elderBaseInfoList = list();
        if (CollectionUtils.isEmpty(elderBaseInfoList)) {
            return new HashMap<>();
        }
        Map<String, Long> result = elderBaseInfoList.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getAbilityLevel() == null ? "" : e.getAbilityLevel(),
                        Collectors.counting()));
        return result;
    }

    @Override
    public Map<String, Object> getElderlyCategoryStatistics() {
        List<ElderBaseInfo> elderBaseInfoList = list();
        if (CollectionUtils.isEmpty(elderBaseInfoList)) {
            return Collections.emptyMap();
        }
        Map<String, Long> collect = elderBaseInfoList.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getElderType() == null ? "" : e.getElderType(),
                        Collectors.counting()));
        return new HashMap<>(collect);
    }

    @Override
    public Object getElderlyCareLevelStatistics() {

        List<ElderBaseInfo> list = list();
        if (CollectionUtils.isEmpty(list)) {
            return new HashMap<>();
        }
        Map<String, Long> collect = list.stream().filter(e -> e.getElderNursingLevel() != null)
                .collect(Collectors.groupingBy(ElderBaseInfo::getElderNursingLevel, Collectors.counting()));
        return collect;
    }
}


