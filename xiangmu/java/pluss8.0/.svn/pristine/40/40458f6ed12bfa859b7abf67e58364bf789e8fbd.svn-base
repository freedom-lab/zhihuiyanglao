package cn.pluss.platform.service.assessmentAppoint.impl;

import cn.pluss.platform.mapper.AssessmentAppointMapper;
import cn.pluss.platform.model.entity.AssessmentAppoint;
import cn.pluss.platform.service.assessmentAppoint.AssessmentAppointService;
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
@Service("assessmentAppointService")
public class AssessmentAppointServiceImpl extends ServiceImpl< AssessmentAppointMapper, AssessmentAppoint> implements AssessmentAppointService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentAppointServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentAppoint> queryPage(Map map) {
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
    public AssessmentAppoint queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentAppoint 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentAppoint queryOne(AssessmentAppoint assessmentAppoint){
        LambdaQueryWrapper<AssessmentAppoint> queryWrapper = getQueryWrapper(assessmentAppoint);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentAppoint
    * @return
    */
    @Override
    public List<AssessmentAppoint> queryList(AssessmentAppoint assessmentAppoint) {
        LambdaQueryWrapper<AssessmentAppoint> queryWrapper = getQueryWrapper(assessmentAppoint);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentAppoint
    * @return
    */
    public static LambdaQueryWrapper<AssessmentAppoint> getQueryWrapper(AssessmentAppoint assessmentAppoint){
        LambdaQueryWrapper<AssessmentAppoint> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentAppoint.getId() != null) {
            queryWrapper.eq(AssessmentAppoint::getId, assessmentAppoint.getId());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getTenantId())) {
            queryWrapper.eq(AssessmentAppoint::getTenantId, assessmentAppoint.getTenantId());
        }
        if (assessmentAppoint.getCorpId() != null) {
            queryWrapper.eq(AssessmentAppoint::getCorpId, assessmentAppoint.getCorpId());
        }
        if (assessmentAppoint.getInstitutionId() != null) {
            queryWrapper.eq(AssessmentAppoint::getInstitutionId, assessmentAppoint.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getInstitutionName())) {
            queryWrapper.eq(AssessmentAppoint::getInstitutionName, assessmentAppoint.getInstitutionName());
        }
        if (assessmentAppoint.getElderId() != null) {
            queryWrapper.eq(AssessmentAppoint::getElderId, assessmentAppoint.getElderId());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getElderName())) {
            queryWrapper.eq(AssessmentAppoint::getElderName, assessmentAppoint.getElderName());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getIdCard())) {
            queryWrapper.eq(AssessmentAppoint::getIdCard, assessmentAppoint.getIdCard());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getSex())) {
            queryWrapper.eq(AssessmentAppoint::getSex, assessmentAppoint.getSex());
        }
        if (assessmentAppoint.getAge() != null) {
            queryWrapper.eq(AssessmentAppoint::getAge, assessmentAppoint.getAge());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAddress())) {
            queryWrapper.eq(AssessmentAppoint::getAddress, assessmentAppoint.getAddress());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getLinkTel())) {
            queryWrapper.eq(AssessmentAppoint::getLinkTel, assessmentAppoint.getLinkTel());
        }
        if (assessmentAppoint.getPlanDate() != null) {
            queryWrapper.eq(AssessmentAppoint::getPlanDate, assessmentAppoint.getPlanDate());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessCode())) {
            queryWrapper.eq(AssessmentAppoint::getAssessCode, assessmentAppoint.getAssessCode());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessMemo())) {
            queryWrapper.eq(AssessmentAppoint::getAssessMemo, assessmentAppoint.getAssessMemo());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessWay())) {
            queryWrapper.eq(AssessmentAppoint::getAssessWay, assessmentAppoint.getAssessWay());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAllocationState())) {
            queryWrapper.eq(AssessmentAppoint::getAllocationState, assessmentAppoint.getAllocationState());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessState())) {
            queryWrapper.eq(AssessmentAppoint::getAssessState, assessmentAppoint.getAssessState());
        }
        if (assessmentAppoint.getAssessTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getAssessTime, assessmentAppoint.getAssessTime());
        }
        if (assessmentAppoint.getNextAssessTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getNextAssessTime, assessmentAppoint.getNextAssessTime());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getInitialLevel())) {
            queryWrapper.eq(AssessmentAppoint::getInitialLevel, assessmentAppoint.getInitialLevel());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessResult())) {
            queryWrapper.eq(AssessmentAppoint::getAssessResult, assessmentAppoint.getAssessResult());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getSpecialResult())) {
            queryWrapper.eq(AssessmentAppoint::getSpecialResult, assessmentAppoint.getSpecialResult());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessAddress())) {
            queryWrapper.eq(AssessmentAppoint::getAssessAddress, assessmentAppoint.getAssessAddress());
        }
        if (assessmentAppoint.getTotalPoints() != null) {
            queryWrapper.eq(AssessmentAppoint::getTotalPoints, assessmentAppoint.getTotalPoints());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getQuestionTypes())) {
            queryWrapper.eq(AssessmentAppoint::getQuestionTypes, assessmentAppoint.getQuestionTypes());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getDataSource())) {
            queryWrapper.eq(AssessmentAppoint::getDataSource, assessmentAppoint.getDataSource());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getOptionIds())) {
            queryWrapper.eq(AssessmentAppoint::getOptionIds, assessmentAppoint.getOptionIds());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getQuestionIds())) {
            queryWrapper.eq(AssessmentAppoint::getQuestionIds, assessmentAppoint.getQuestionIds());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessType())) {
            queryWrapper.eq(AssessmentAppoint::getAssessType, assessmentAppoint.getAssessType());
        }
        if (assessmentAppoint.getTemplateId() != null) {
            queryWrapper.eq(AssessmentAppoint::getTemplateId, assessmentAppoint.getTemplateId());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessmentCriteria())) {
            queryWrapper.eq(AssessmentAppoint::getAssessmentCriteria, assessmentAppoint.getAssessmentCriteria());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessFile())) {
            queryWrapper.eq(AssessmentAppoint::getAssessFile, assessmentAppoint.getAssessFile());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessSignImg())) {
            queryWrapper.eq(AssessmentAppoint::getAssessSignImg, assessmentAppoint.getAssessSignImg());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getElderSignImg())) {
            queryWrapper.eq(AssessmentAppoint::getElderSignImg, assessmentAppoint.getElderSignImg());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessProcessImg())) {
            queryWrapper.eq(AssessmentAppoint::getAssessProcessImg, assessmentAppoint.getAssessProcessImg());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssessProcessVideo())) {
            queryWrapper.eq(AssessmentAppoint::getAssessProcessVideo, assessmentAppoint.getAssessProcessVideo());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getProvideSignImg())) {
            queryWrapper.eq(AssessmentAppoint::getProvideSignImg, assessmentAppoint.getProvideSignImg());
        }
        if (assessmentAppoint.getAssignOrgId() != null) {
            queryWrapper.eq(AssessmentAppoint::getAssignOrgId, assessmentAppoint.getAssignOrgId());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssignOrgName())) {
            queryWrapper.eq(AssessmentAppoint::getAssignOrgName, assessmentAppoint.getAssignOrgName());
        }
        if (assessmentAppoint.getAssignStaffId() != null) {
            queryWrapper.eq(AssessmentAppoint::getAssignStaffId, assessmentAppoint.getAssignStaffId());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssignStaffName())) {
            queryWrapper.eq(AssessmentAppoint::getAssignStaffName, assessmentAppoint.getAssignStaffName());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAssignStaffTel())) {
            queryWrapper.eq(AssessmentAppoint::getAssignStaffTel, assessmentAppoint.getAssignStaffTel());
        }
        if (assessmentAppoint.getAssignTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getAssignTime, assessmentAppoint.getAssignTime());
        }
        if (assessmentAppoint.getAcceptOrderTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getAcceptOrderTime, assessmentAppoint.getAcceptOrderTime());
        }
        if (assessmentAppoint.getAssessStartTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getAssessStartTime, assessmentAppoint.getAssessStartTime());
        }
        if (assessmentAppoint.getAssessEndTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getAssessEndTime, assessmentAppoint.getAssessEndTime());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getInstitutionAduitState())) {
            queryWrapper.eq(AssessmentAppoint::getInstitutionAduitState, assessmentAppoint.getInstitutionAduitState());
        }
        if (assessmentAppoint.getInstitutionAduitTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getInstitutionAduitTime, assessmentAppoint.getInstitutionAduitTime());
        }
        if (assessmentAppoint.getInstitutionAduitId() != null) {
            queryWrapper.eq(AssessmentAppoint::getInstitutionAduitId, assessmentAppoint.getInstitutionAduitId());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getInstitutionAduitName())) {
            queryWrapper.eq(AssessmentAppoint::getInstitutionAduitName, assessmentAppoint.getInstitutionAduitName());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getInstitutionAduitReason())) {
            queryWrapper.eq(AssessmentAppoint::getInstitutionAduitReason, assessmentAppoint.getInstitutionAduitReason());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getCivilAuditState())) {
            queryWrapper.eq(AssessmentAppoint::getCivilAuditState, assessmentAppoint.getCivilAuditState());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getCivilAuditName())) {
            queryWrapper.eq(AssessmentAppoint::getCivilAuditName, assessmentAppoint.getCivilAuditName());
        }
        if (assessmentAppoint.getCivilAuditTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getCivilAuditTime, assessmentAppoint.getCivilAuditTime());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getCivilAduitReason())) {
            queryWrapper.eq(AssessmentAppoint::getCivilAduitReason, assessmentAppoint.getCivilAduitReason());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getRemark())) {
            queryWrapper.eq(AssessmentAppoint::getRemark, assessmentAppoint.getRemark());
        }
        if (assessmentAppoint.getCreateUser() != null) {
            queryWrapper.eq(AssessmentAppoint::getCreateUser, assessmentAppoint.getCreateUser());
        }
        if (assessmentAppoint.getCreateDept() != null) {
            queryWrapper.eq(AssessmentAppoint::getCreateDept, assessmentAppoint.getCreateDept());
        }
        if (assessmentAppoint.getCreateTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getCreateTime, assessmentAppoint.getCreateTime());
        }
        if (assessmentAppoint.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentAppoint::getUpdateUser, assessmentAppoint.getUpdateUser());
        }
        if (assessmentAppoint.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentAppoint::getUpdateTime, assessmentAppoint.getUpdateTime());
        }
        if (assessmentAppoint.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentAppoint::getIsDeleted, assessmentAppoint.getIsDeleted());
        }
        if (assessmentAppoint.getStatus() != null) {
            queryWrapper.eq(AssessmentAppoint::getStatus, assessmentAppoint.getStatus());
        }
        if (assessmentAppoint.getAreaCode() != null) {
            queryWrapper.eq(AssessmentAppoint::getAreaCode, assessmentAppoint.getAreaCode());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getAreaName())) {
            queryWrapper.eq(AssessmentAppoint::getAreaName, assessmentAppoint.getAreaName());
        }
        if (assessmentAppoint.getAssessUses() != null) {
            queryWrapper.eq(AssessmentAppoint::getAssessUses, assessmentAppoint.getAssessUses());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getGuardianContact())) {
            queryWrapper.eq(AssessmentAppoint::getGuardianContact, assessmentAppoint.getGuardianContact());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getGuardianContactTel())) {
            queryWrapper.eq(AssessmentAppoint::getGuardianContactTel, assessmentAppoint.getGuardianContactTel());
        }
        if (assessmentAppoint.getIsWishCareBed() != null) {
            queryWrapper.eq(AssessmentAppoint::getIsWishCareBed, assessmentAppoint.getIsWishCareBed());
        }
        if (assessmentAppoint.getIsInstallCareBed() != null) {
            queryWrapper.eq(AssessmentAppoint::getIsInstallCareBed, assessmentAppoint.getIsInstallCareBed());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getElderType())) {
            queryWrapper.eq(AssessmentAppoint::getElderType, assessmentAppoint.getElderType());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getLiveState())) {
            queryWrapper.eq(AssessmentAppoint::getLiveState, assessmentAppoint.getLiveState());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getDisabilityLevel())) {
            queryWrapper.eq(AssessmentAppoint::getDisabilityLevel, assessmentAppoint.getDisabilityLevel());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getDisabilityType())) {
            queryWrapper.eq(AssessmentAppoint::getDisabilityType, assessmentAppoint.getDisabilityType());
        }
        if (StringUtil.isNotEmpty(assessmentAppoint.getEconomicSources())) {
            queryWrapper.eq(AssessmentAppoint::getEconomicSources, assessmentAppoint.getEconomicSources());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentAppoint 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentAppoint insert(AssessmentAppoint assessmentAppoint) {
        assessmentAppoint.setId(null);
        getBaseMapper().insert(assessmentAppoint);
        return assessmentAppoint;
    }

    /**
    * 更新数据
    *
    * @param assessmentAppoint 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentAppoint update(AssessmentAppoint assessmentAppoint) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentAppoint> chainWrapper = new LambdaUpdateChainWrapper<AssessmentAppoint>(getBaseMapper());
        if (assessmentAppoint.getId() != null) {
            chainWrapper.set(AssessmentAppoint::getId, assessmentAppoint.getId());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getTenantId())) {
            chainWrapper.set(AssessmentAppoint::getTenantId, assessmentAppoint.getTenantId());
        }
        if (assessmentAppoint.getCorpId() != null) {
            chainWrapper.set(AssessmentAppoint::getCorpId, assessmentAppoint.getCorpId());
        }
        if (assessmentAppoint.getInstitutionId() != null) {
            chainWrapper.set(AssessmentAppoint::getInstitutionId, assessmentAppoint.getInstitutionId());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getInstitutionName())) {
            chainWrapper.set(AssessmentAppoint::getInstitutionName, assessmentAppoint.getInstitutionName());
        }
        if (assessmentAppoint.getElderId() != null) {
            chainWrapper.set(AssessmentAppoint::getElderId, assessmentAppoint.getElderId());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getElderName())) {
            chainWrapper.set(AssessmentAppoint::getElderName, assessmentAppoint.getElderName());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getIdCard())) {
            chainWrapper.set(AssessmentAppoint::getIdCard, assessmentAppoint.getIdCard());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getSex())) {
            chainWrapper.set(AssessmentAppoint::getSex, assessmentAppoint.getSex());
        }
        if (assessmentAppoint.getAge() != null) {
            chainWrapper.set(AssessmentAppoint::getAge, assessmentAppoint.getAge());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAddress())) {
            chainWrapper.set(AssessmentAppoint::getAddress, assessmentAppoint.getAddress());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getLinkTel())) {
            chainWrapper.set(AssessmentAppoint::getLinkTel, assessmentAppoint.getLinkTel());
        }
        if (assessmentAppoint.getPlanDate() != null) {
            chainWrapper.set(AssessmentAppoint::getPlanDate, assessmentAppoint.getPlanDate());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessCode())) {
            chainWrapper.set(AssessmentAppoint::getAssessCode, assessmentAppoint.getAssessCode());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessMemo())) {
            chainWrapper.set(AssessmentAppoint::getAssessMemo, assessmentAppoint.getAssessMemo());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessWay())) {
            chainWrapper.set(AssessmentAppoint::getAssessWay, assessmentAppoint.getAssessWay());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAllocationState())) {
            chainWrapper.set(AssessmentAppoint::getAllocationState, assessmentAppoint.getAllocationState());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessState())) {
            chainWrapper.set(AssessmentAppoint::getAssessState, assessmentAppoint.getAssessState());
        }
        if (assessmentAppoint.getAssessTime() != null) {
            chainWrapper.set(AssessmentAppoint::getAssessTime, assessmentAppoint.getAssessTime());
        }
        if (assessmentAppoint.getNextAssessTime() != null) {
            chainWrapper.set(AssessmentAppoint::getNextAssessTime, assessmentAppoint.getNextAssessTime());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getInitialLevel())) {
            chainWrapper.set(AssessmentAppoint::getInitialLevel, assessmentAppoint.getInitialLevel());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessResult())) {
            chainWrapper.set(AssessmentAppoint::getAssessResult, assessmentAppoint.getAssessResult());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getSpecialResult())) {
            chainWrapper.set(AssessmentAppoint::getSpecialResult, assessmentAppoint.getSpecialResult());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessAddress())) {
            chainWrapper.set(AssessmentAppoint::getAssessAddress, assessmentAppoint.getAssessAddress());
        }
        if (assessmentAppoint.getTotalPoints() != null) {
            chainWrapper.set(AssessmentAppoint::getTotalPoints, assessmentAppoint.getTotalPoints());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getQuestionTypes())) {
            chainWrapper.set(AssessmentAppoint::getQuestionTypes, assessmentAppoint.getQuestionTypes());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getDataSource())) {
            chainWrapper.set(AssessmentAppoint::getDataSource, assessmentAppoint.getDataSource());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getOptionIds())) {
            chainWrapper.set(AssessmentAppoint::getOptionIds, assessmentAppoint.getOptionIds());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getQuestionIds())) {
            chainWrapper.set(AssessmentAppoint::getQuestionIds, assessmentAppoint.getQuestionIds());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessType())) {
            chainWrapper.set(AssessmentAppoint::getAssessType, assessmentAppoint.getAssessType());
        }
        if (assessmentAppoint.getTemplateId() != null) {
            chainWrapper.set(AssessmentAppoint::getTemplateId, assessmentAppoint.getTemplateId());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessmentCriteria())) {
            chainWrapper.set(AssessmentAppoint::getAssessmentCriteria, assessmentAppoint.getAssessmentCriteria());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessFile())) {
            chainWrapper.set(AssessmentAppoint::getAssessFile, assessmentAppoint.getAssessFile());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessSignImg())) {
            chainWrapper.set(AssessmentAppoint::getAssessSignImg, assessmentAppoint.getAssessSignImg());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getElderSignImg())) {
            chainWrapper.set(AssessmentAppoint::getElderSignImg, assessmentAppoint.getElderSignImg());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessProcessImg())) {
            chainWrapper.set(AssessmentAppoint::getAssessProcessImg, assessmentAppoint.getAssessProcessImg());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssessProcessVideo())) {
            chainWrapper.set(AssessmentAppoint::getAssessProcessVideo, assessmentAppoint.getAssessProcessVideo());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getProvideSignImg())) {
            chainWrapper.set(AssessmentAppoint::getProvideSignImg, assessmentAppoint.getProvideSignImg());
        }
        if (assessmentAppoint.getAssignOrgId() != null) {
            chainWrapper.set(AssessmentAppoint::getAssignOrgId, assessmentAppoint.getAssignOrgId());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssignOrgName())) {
            chainWrapper.set(AssessmentAppoint::getAssignOrgName, assessmentAppoint.getAssignOrgName());
        }
        if (assessmentAppoint.getAssignStaffId() != null) {
            chainWrapper.set(AssessmentAppoint::getAssignStaffId, assessmentAppoint.getAssignStaffId());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssignStaffName())) {
            chainWrapper.set(AssessmentAppoint::getAssignStaffName, assessmentAppoint.getAssignStaffName());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAssignStaffTel())) {
            chainWrapper.set(AssessmentAppoint::getAssignStaffTel, assessmentAppoint.getAssignStaffTel());
        }
        if (assessmentAppoint.getAssignTime() != null) {
            chainWrapper.set(AssessmentAppoint::getAssignTime, assessmentAppoint.getAssignTime());
        }
        if (assessmentAppoint.getAcceptOrderTime() != null) {
            chainWrapper.set(AssessmentAppoint::getAcceptOrderTime, assessmentAppoint.getAcceptOrderTime());
        }
        if (assessmentAppoint.getAssessStartTime() != null) {
            chainWrapper.set(AssessmentAppoint::getAssessStartTime, assessmentAppoint.getAssessStartTime());
        }
        if (assessmentAppoint.getAssessEndTime() != null) {
            chainWrapper.set(AssessmentAppoint::getAssessEndTime, assessmentAppoint.getAssessEndTime());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getInstitutionAduitState())) {
            chainWrapper.set(AssessmentAppoint::getInstitutionAduitState, assessmentAppoint.getInstitutionAduitState());
        }
        if (assessmentAppoint.getInstitutionAduitTime() != null) {
            chainWrapper.set(AssessmentAppoint::getInstitutionAduitTime, assessmentAppoint.getInstitutionAduitTime());
        }
        if (assessmentAppoint.getInstitutionAduitId() != null) {
            chainWrapper.set(AssessmentAppoint::getInstitutionAduitId, assessmentAppoint.getInstitutionAduitId());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getInstitutionAduitName())) {
            chainWrapper.set(AssessmentAppoint::getInstitutionAduitName, assessmentAppoint.getInstitutionAduitName());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getInstitutionAduitReason())) {
            chainWrapper.set(AssessmentAppoint::getInstitutionAduitReason, assessmentAppoint.getInstitutionAduitReason());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getCivilAuditState())) {
            chainWrapper.set(AssessmentAppoint::getCivilAuditState, assessmentAppoint.getCivilAuditState());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getCivilAuditName())) {
            chainWrapper.set(AssessmentAppoint::getCivilAuditName, assessmentAppoint.getCivilAuditName());
        }
        if (assessmentAppoint.getCivilAuditTime() != null) {
            chainWrapper.set(AssessmentAppoint::getCivilAuditTime, assessmentAppoint.getCivilAuditTime());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getCivilAduitReason())) {
            chainWrapper.set(AssessmentAppoint::getCivilAduitReason, assessmentAppoint.getCivilAduitReason());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getRemark())) {
            chainWrapper.set(AssessmentAppoint::getRemark, assessmentAppoint.getRemark());
        }
        if (assessmentAppoint.getCreateUser() != null) {
            chainWrapper.set(AssessmentAppoint::getCreateUser, assessmentAppoint.getCreateUser());
        }
        if (assessmentAppoint.getCreateDept() != null) {
            chainWrapper.set(AssessmentAppoint::getCreateDept, assessmentAppoint.getCreateDept());
        }
        if (assessmentAppoint.getCreateTime() != null) {
            chainWrapper.set(AssessmentAppoint::getCreateTime, assessmentAppoint.getCreateTime());
        }
        if (assessmentAppoint.getUpdateUser() != null) {
            chainWrapper.set(AssessmentAppoint::getUpdateUser, assessmentAppoint.getUpdateUser());
        }
        if (assessmentAppoint.getUpdateTime() != null) {
            chainWrapper.set(AssessmentAppoint::getUpdateTime, assessmentAppoint.getUpdateTime());
        }
        if (assessmentAppoint.getIsDeleted() != null) {
            chainWrapper.set(AssessmentAppoint::getIsDeleted, assessmentAppoint.getIsDeleted());
        }
        if (assessmentAppoint.getStatus() != null) {
            chainWrapper.set(AssessmentAppoint::getStatus, assessmentAppoint.getStatus());
        }
        if (assessmentAppoint.getAreaCode() != null) {
            chainWrapper.set(AssessmentAppoint::getAreaCode, assessmentAppoint.getAreaCode());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getAreaName())) {
            chainWrapper.set(AssessmentAppoint::getAreaName, assessmentAppoint.getAreaName());
        }
        if (assessmentAppoint.getAssessUses() != null) {
            chainWrapper.set(AssessmentAppoint::getAssessUses, assessmentAppoint.getAssessUses());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getGuardianContact())) {
            chainWrapper.set(AssessmentAppoint::getGuardianContact, assessmentAppoint.getGuardianContact());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getGuardianContactTel())) {
            chainWrapper.set(AssessmentAppoint::getGuardianContactTel, assessmentAppoint.getGuardianContactTel());
        }
        if (assessmentAppoint.getIsWishCareBed() != null) {
            chainWrapper.set(AssessmentAppoint::getIsWishCareBed, assessmentAppoint.getIsWishCareBed());
        }
        if (assessmentAppoint.getIsInstallCareBed() != null) {
            chainWrapper.set(AssessmentAppoint::getIsInstallCareBed, assessmentAppoint.getIsInstallCareBed());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getElderType())) {
            chainWrapper.set(AssessmentAppoint::getElderType, assessmentAppoint.getElderType());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getLiveState())) {
            chainWrapper.set(AssessmentAppoint::getLiveState, assessmentAppoint.getLiveState());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getDisabilityLevel())) {
            chainWrapper.set(AssessmentAppoint::getDisabilityLevel, assessmentAppoint.getDisabilityLevel());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getDisabilityType())) {
            chainWrapper.set(AssessmentAppoint::getDisabilityType, assessmentAppoint.getDisabilityType());
        }
        if (StringUtil.isNotBlank(assessmentAppoint.getEconomicSources())) {
            chainWrapper.set(AssessmentAppoint::getEconomicSources, assessmentAppoint.getEconomicSources());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentAppoint::getId, assessmentAppoint.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentAppoint.getId());
        } else {
            return assessmentAppoint;
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
    public boolean saveAssessmentAppointBatch(List<AssessmentAppoint> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentAppoint assessmentAppoint : insertList) {
            //使用默认的雪花算法生成
            assessmentAppoint.setId(null);
            //assessmentAppoint.setCreatedDt(currentDte);
            //assessmentAppoint.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentAppointBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentAppoint> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public List<AssessmentAppoint> queryTaskPage(Map<String, Object> map) {
        return getBaseMapper().queryTaskPage(map);
    }

    @Override
    public Integer queryTaskPageCount(Map<String, Object> map) {
        return getBaseMapper().queryTaskPageCount(map);
    }

    @Override
    public List<AssessmentAppoint> queryResultPage(Map<String, Object> map) {
        return getBaseMapper().queryResultPage(map);
    }

    @Override
    public Integer queryResultPageCount(Map<String, Object> map) {
        return getBaseMapper().queryResultPageCount(map);
    }
}


