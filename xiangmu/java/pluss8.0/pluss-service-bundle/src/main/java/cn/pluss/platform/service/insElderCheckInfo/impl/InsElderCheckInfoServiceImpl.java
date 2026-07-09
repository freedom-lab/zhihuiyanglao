package cn.pluss.platform.service.insElderCheckInfo.impl;

import cn.pluss.platform.mapper.InsElderCheckInfoMapper;
import cn.pluss.platform.model.dto.HealthDto;
import cn.pluss.platform.model.entity.InsBaseBedInfo;
import cn.pluss.platform.model.entity.InsElderCheckInfo;
import cn.pluss.platform.model.entity.InsElderRetreatInfo;
import cn.pluss.platform.model.entity.InsRegisterConsultInfo;
import cn.pluss.platform.service.insBaseBedInfo.InsBaseBedInfoService;
import cn.pluss.platform.service.insElderCheckInfo.InsElderCheckInfoService;
import cn.pluss.platform.service.insElderRetreatInfo.InsElderRetreatInfoService;
import cn.pluss.platform.service.insRegisterConsultInfo.InsRegisterConsultInfoService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;

@Transactional
@Service("insElderCheckInfoService")
public class InsElderCheckInfoServiceImpl extends ServiceImpl< InsElderCheckInfoMapper, InsElderCheckInfo> implements InsElderCheckInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderCheckInfoServiceImpl.class);

    @Resource
    private InsBaseBedInfoService insBaseBedInfoService;

    @Resource
    private InsElderRetreatInfoService insElderRetreatInfoService;

    @Resource
    private InsRegisterConsultInfoService insRegisterConsultInfoService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderCheckInfo> queryPage(Map map) {
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
    public InsElderCheckInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderCheckInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderCheckInfo queryOne(InsElderCheckInfo insElderCheckInfo){
        LambdaQueryWrapper<InsElderCheckInfo> queryWrapper = getQueryWrapper(insElderCheckInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderCheckInfo
    * @return
    */
    @Override
    public List<InsElderCheckInfo> queryList(InsElderCheckInfo insElderCheckInfo) {
        LambdaQueryWrapper<InsElderCheckInfo> queryWrapper = getQueryWrapper(insElderCheckInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderCheckInfo
    * @return
    */
    public static LambdaQueryWrapper<InsElderCheckInfo> getQueryWrapper(InsElderCheckInfo insElderCheckInfo){
        LambdaQueryWrapper<InsElderCheckInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderCheckInfo.getId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getId, insElderCheckInfo.getId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getTenantId())) {
            queryWrapper.eq(InsElderCheckInfo::getTenantId, insElderCheckInfo.getTenantId());
        }
        if (insElderCheckInfo.getCorpId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getCorpId, insElderCheckInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getCorpName())) {
            queryWrapper.eq(InsElderCheckInfo::getCorpName, insElderCheckInfo.getCorpName());
        }
        if (insElderCheckInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getInstitutionId, insElderCheckInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getInstitutionName())) {
            queryWrapper.eq(InsElderCheckInfo::getInstitutionName, insElderCheckInfo.getInstitutionName());
        }
        if (insElderCheckInfo.getElderId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getElderId, insElderCheckInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getElderName())) {
            queryWrapper.eq(InsElderCheckInfo::getElderName, insElderCheckInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getIdCard())) {
            queryWrapper.eq(InsElderCheckInfo::getIdCard, insElderCheckInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getLinkTel())) {
            queryWrapper.eq(InsElderCheckInfo::getLinkTel, insElderCheckInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getSex())) {
            queryWrapper.eq(InsElderCheckInfo::getSex, insElderCheckInfo.getSex());
        }
        if (insElderCheckInfo.getAge() != null) {
            queryWrapper.eq(InsElderCheckInfo::getAge, insElderCheckInfo.getAge());
        }
        if (insElderCheckInfo.getApplyDate() != null) {
            queryWrapper.eq(InsElderCheckInfo::getApplyDate, insElderCheckInfo.getApplyDate());
        }
        if (insElderCheckInfo.getCheckStep() != null) {
            queryWrapper.eq(InsElderCheckInfo::getCheckStep, insElderCheckInfo.getCheckStep());
        }
        if (insElderCheckInfo.getPlanDate() != null) {
            queryWrapper.eq(InsElderCheckInfo::getPlanDate, insElderCheckInfo.getPlanDate());
        }
        if (insElderCheckInfo.getCheckDate() != null) {
            queryWrapper.eq(InsElderCheckInfo::getCheckDate, insElderCheckInfo.getCheckDate());
        }
        if (insElderCheckInfo.getTryingEndDate() != null) {
            queryWrapper.eq(InsElderCheckInfo::getTryingEndDate, insElderCheckInfo.getTryingEndDate());
        }
        if (insElderCheckInfo.getCheckState() != null) {
            queryWrapper.eq(InsElderCheckInfo::getCheckState, insElderCheckInfo.getCheckState());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getCheckCode())) {
            queryWrapper.eq(InsElderCheckInfo::getCheckCode, insElderCheckInfo.getCheckCode());
        }
        if (insElderCheckInfo.getBuildingId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getBuildingId, insElderCheckInfo.getBuildingId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getBuildingName())) {
            queryWrapper.eq(InsElderCheckInfo::getBuildingName, insElderCheckInfo.getBuildingName());
        }
        if (insElderCheckInfo.getFloorId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getFloorId, insElderCheckInfo.getFloorId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getFloorName())) {
            queryWrapper.eq(InsElderCheckInfo::getFloorName, insElderCheckInfo.getFloorName());
        }
        if (insElderCheckInfo.getRoomId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getRoomId, insElderCheckInfo.getRoomId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getRoomName())) {
            queryWrapper.eq(InsElderCheckInfo::getRoomName, insElderCheckInfo.getRoomName());
        }
        if (insElderCheckInfo.getBedId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getBedId, insElderCheckInfo.getBedId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getBedName())) {
            queryWrapper.eq(InsElderCheckInfo::getBedName, insElderCheckInfo.getBedName());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getBedCode())) {
            queryWrapper.eq(InsElderCheckInfo::getBedCode, insElderCheckInfo.getBedCode());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getBedInfo())) {
            queryWrapper.eq(InsElderCheckInfo::getBedInfo, insElderCheckInfo.getBedInfo());
        }
        if (insElderCheckInfo.getIsRoom() != null) {
            queryWrapper.eq(InsElderCheckInfo::getIsRoom, insElderCheckInfo.getIsRoom());
        }
        if (insElderCheckInfo.getNursingLevelId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getNursingLevelId, insElderCheckInfo.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getNursingLevelName())) {
            queryWrapper.eq(InsElderCheckInfo::getNursingLevelName, insElderCheckInfo.getNursingLevelName());
        }
        if (insElderCheckInfo.getNursingGroupId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getNursingGroupId, insElderCheckInfo.getNursingGroupId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getNursingGroupName())) {
            queryWrapper.eq(InsElderCheckInfo::getNursingGroupName, insElderCheckInfo.getNursingGroupName());
        }
        if (insElderCheckInfo.getNursingStaffId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getNursingStaffId, insElderCheckInfo.getNursingStaffId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getNursingStaffName())) {
            queryWrapper.eq(InsElderCheckInfo::getNursingStaffName, insElderCheckInfo.getNursingStaffName());
        }
        if (insElderCheckInfo.getCheckType() != null) {
            queryWrapper.eq(InsElderCheckInfo::getCheckType, insElderCheckInfo.getCheckType());
        }
        if (insElderCheckInfo.getIsHousehold() != null) {
            queryWrapper.eq(InsElderCheckInfo::getIsHousehold, insElderCheckInfo.getIsHousehold());
        }
        if (insElderCheckInfo.getHouseholdId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getHouseholdId, insElderCheckInfo.getHouseholdId());
        }
        if (insElderCheckInfo.getTurnOverState() != null) {
            queryWrapper.eq(InsElderCheckInfo::getTurnOverState, insElderCheckInfo.getTurnOverState());
        }
        if (insElderCheckInfo.getElderCategory() != null) {
            queryWrapper.eq(InsElderCheckInfo::getElderCategory, insElderCheckInfo.getElderCategory());
        }
        if (insElderCheckInfo.getElderCategoryTime() != null) {
            queryWrapper.eq(InsElderCheckInfo::getElderCategoryTime, insElderCheckInfo.getElderCategoryTime());
        }
        if (insElderCheckInfo.getRetreatTime() != null) {
            queryWrapper.eq(InsElderCheckInfo::getRetreatTime, insElderCheckInfo.getRetreatTime());
        }
        if (insElderCheckInfo.getAreaCode() != null) {
            queryWrapper.eq(InsElderCheckInfo::getAreaCode, insElderCheckInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getAreaName())) {
            queryWrapper.eq(InsElderCheckInfo::getAreaName, insElderCheckInfo.getAreaName());
        }
        if (insElderCheckInfo.getTotalAuditState() != null) {
            queryWrapper.eq(InsElderCheckInfo::getTotalAuditState, insElderCheckInfo.getTotalAuditState());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getMediaChannels())) {
            queryWrapper.eq(InsElderCheckInfo::getMediaChannels, insElderCheckInfo.getMediaChannels());
        }
        if (insElderCheckInfo.getSignWay() != null) {
            queryWrapper.eq(InsElderCheckInfo::getSignWay, insElderCheckInfo.getSignWay());
        }
        if (insElderCheckInfo.getSignIsVideo() != null) {
            queryWrapper.eq(InsElderCheckInfo::getSignIsVideo, insElderCheckInfo.getSignIsVideo());
        }
        if (insElderCheckInfo.getRelativesId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getRelativesId, insElderCheckInfo.getRelativesId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getRelativesName())) {
            queryWrapper.eq(InsElderCheckInfo::getRelativesName, insElderCheckInfo.getRelativesName());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getPassWord())) {
            queryWrapper.eq(InsElderCheckInfo::getPassWord, insElderCheckInfo.getPassWord());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getRemark())) {
            queryWrapper.eq(InsElderCheckInfo::getRemark, insElderCheckInfo.getRemark());
        }
        if (insElderCheckInfo.getCreateUser() != null) {
            queryWrapper.eq(InsElderCheckInfo::getCreateUser, insElderCheckInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getCreateName())) {
            queryWrapper.eq(InsElderCheckInfo::getCreateName, insElderCheckInfo.getCreateName());
        }
        if (insElderCheckInfo.getCreateDept() != null) {
            queryWrapper.eq(InsElderCheckInfo::getCreateDept, insElderCheckInfo.getCreateDept());
        }
        if (insElderCheckInfo.getCreateTime() != null) {
            queryWrapper.eq(InsElderCheckInfo::getCreateTime, insElderCheckInfo.getCreateTime());
        }
        if (insElderCheckInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsElderCheckInfo::getUpdateUser, insElderCheckInfo.getUpdateUser());
        }
        if (insElderCheckInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsElderCheckInfo::getUpdateTime, insElderCheckInfo.getUpdateTime());
        }
        if (insElderCheckInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsElderCheckInfo::getIsDeleted, insElderCheckInfo.getIsDeleted());
        }
        if (insElderCheckInfo.getStatus() != null) {
            queryWrapper.eq(InsElderCheckInfo::getStatus, insElderCheckInfo.getStatus());
        }
        if (insElderCheckInfo.getVideoId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getVideoId, insElderCheckInfo.getVideoId());
        }
        if (insElderCheckInfo.getBenefitsId() != null) {
            queryWrapper.eq(InsElderCheckInfo::getBenefitsId, insElderCheckInfo.getBenefitsId());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getBenefitsName())) {
            queryWrapper.eq(InsElderCheckInfo::getBenefitsName, insElderCheckInfo.getBenefitsName());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getAdmissionMethod())) {
            queryWrapper.eq(InsElderCheckInfo::getAdmissionMethod, insElderCheckInfo.getAdmissionMethod());
        }
        if (insElderCheckInfo.getHouseholdCheckState() != null) {
            queryWrapper.eq(InsElderCheckInfo::getHouseholdCheckState, insElderCheckInfo.getHouseholdCheckState());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getHouseholdRelationship())) {
            queryWrapper.eq(InsElderCheckInfo::getHouseholdRelationship, insElderCheckInfo.getHouseholdRelationship());
        }
        if (StringUtil.isNotEmpty(insElderCheckInfo.getBloodType())) {
            queryWrapper.eq(InsElderCheckInfo::getBloodType, insElderCheckInfo.getBloodType());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderCheckInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderCheckInfo insert(InsElderCheckInfo insElderCheckInfo) {
        insElderCheckInfo.setId(null);
        getBaseMapper().insert(insElderCheckInfo);
        return insElderCheckInfo;
    }

    /**
    * 更新数据
    *
    * @param insElderCheckInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderCheckInfo update(InsElderCheckInfo insElderCheckInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderCheckInfo> chainWrapper = new LambdaUpdateChainWrapper<InsElderCheckInfo>(getBaseMapper());
        if (insElderCheckInfo.getId() != null) {
            chainWrapper.set(InsElderCheckInfo::getId, insElderCheckInfo.getId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getTenantId())) {
            chainWrapper.set(InsElderCheckInfo::getTenantId, insElderCheckInfo.getTenantId());
        }
        if (insElderCheckInfo.getCorpId() != null) {
            chainWrapper.set(InsElderCheckInfo::getCorpId, insElderCheckInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getCorpName())) {
            chainWrapper.set(InsElderCheckInfo::getCorpName, insElderCheckInfo.getCorpName());
        }
        if (insElderCheckInfo.getInstitutionId() != null) {
            chainWrapper.set(InsElderCheckInfo::getInstitutionId, insElderCheckInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getInstitutionName())) {
            chainWrapper.set(InsElderCheckInfo::getInstitutionName, insElderCheckInfo.getInstitutionName());
        }
        if (insElderCheckInfo.getElderId() != null) {
            chainWrapper.set(InsElderCheckInfo::getElderId, insElderCheckInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getElderName())) {
            chainWrapper.set(InsElderCheckInfo::getElderName, insElderCheckInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getIdCard())) {
            chainWrapper.set(InsElderCheckInfo::getIdCard, insElderCheckInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getLinkTel())) {
            chainWrapper.set(InsElderCheckInfo::getLinkTel, insElderCheckInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getSex())) {
            chainWrapper.set(InsElderCheckInfo::getSex, insElderCheckInfo.getSex());
        }
        if (insElderCheckInfo.getAge() != null) {
            chainWrapper.set(InsElderCheckInfo::getAge, insElderCheckInfo.getAge());
        }
        if (insElderCheckInfo.getApplyDate() != null) {
            chainWrapper.set(InsElderCheckInfo::getApplyDate, insElderCheckInfo.getApplyDate());
        }
        if (insElderCheckInfo.getCheckStep() != null) {
            chainWrapper.set(InsElderCheckInfo::getCheckStep, insElderCheckInfo.getCheckStep());
        }
        if (insElderCheckInfo.getPlanDate() != null) {
            chainWrapper.set(InsElderCheckInfo::getPlanDate, insElderCheckInfo.getPlanDate());
        }
        if (insElderCheckInfo.getCheckDate() != null) {
            chainWrapper.set(InsElderCheckInfo::getCheckDate, insElderCheckInfo.getCheckDate());
        }
        if (insElderCheckInfo.getTryingEndDate() != null) {
            chainWrapper.set(InsElderCheckInfo::getTryingEndDate, insElderCheckInfo.getTryingEndDate());
        }
        if (insElderCheckInfo.getCheckState() != null) {
            chainWrapper.set(InsElderCheckInfo::getCheckState, insElderCheckInfo.getCheckState());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getCheckCode())) {
            chainWrapper.set(InsElderCheckInfo::getCheckCode, insElderCheckInfo.getCheckCode());
        }
        if (insElderCheckInfo.getBuildingId() != null) {
            chainWrapper.set(InsElderCheckInfo::getBuildingId, insElderCheckInfo.getBuildingId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getBuildingName())) {
            chainWrapper.set(InsElderCheckInfo::getBuildingName, insElderCheckInfo.getBuildingName());
        }
        if (insElderCheckInfo.getFloorId() != null) {
            chainWrapper.set(InsElderCheckInfo::getFloorId, insElderCheckInfo.getFloorId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getFloorName())) {
            chainWrapper.set(InsElderCheckInfo::getFloorName, insElderCheckInfo.getFloorName());
        }
        if (insElderCheckInfo.getRoomId() != null) {
            chainWrapper.set(InsElderCheckInfo::getRoomId, insElderCheckInfo.getRoomId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getRoomName())) {
            chainWrapper.set(InsElderCheckInfo::getRoomName, insElderCheckInfo.getRoomName());
        }
        if (insElderCheckInfo.getBedId() != null) {
            chainWrapper.set(InsElderCheckInfo::getBedId, insElderCheckInfo.getBedId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getBedName())) {
            chainWrapper.set(InsElderCheckInfo::getBedName, insElderCheckInfo.getBedName());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getBedCode())) {
            chainWrapper.set(InsElderCheckInfo::getBedCode, insElderCheckInfo.getBedCode());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getBedInfo())) {
            chainWrapper.set(InsElderCheckInfo::getBedInfo, insElderCheckInfo.getBedInfo());
        }
        if (insElderCheckInfo.getIsRoom() != null) {
            chainWrapper.set(InsElderCheckInfo::getIsRoom, insElderCheckInfo.getIsRoom());
        }
        if (insElderCheckInfo.getNursingLevelId() != null) {
            chainWrapper.set(InsElderCheckInfo::getNursingLevelId, insElderCheckInfo.getNursingLevelId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getNursingLevelName())) {
            chainWrapper.set(InsElderCheckInfo::getNursingLevelName, insElderCheckInfo.getNursingLevelName());
        }
        if (insElderCheckInfo.getNursingGroupId() != null) {
            chainWrapper.set(InsElderCheckInfo::getNursingGroupId, insElderCheckInfo.getNursingGroupId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getNursingGroupName())) {
            chainWrapper.set(InsElderCheckInfo::getNursingGroupName, insElderCheckInfo.getNursingGroupName());
        }
        if (insElderCheckInfo.getNursingStaffId() != null) {
            chainWrapper.set(InsElderCheckInfo::getNursingStaffId, insElderCheckInfo.getNursingStaffId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getNursingStaffName())) {
            chainWrapper.set(InsElderCheckInfo::getNursingStaffName, insElderCheckInfo.getNursingStaffName());
        }
        if (insElderCheckInfo.getCheckType() != null) {
            chainWrapper.set(InsElderCheckInfo::getCheckType, insElderCheckInfo.getCheckType());
        }
        if (insElderCheckInfo.getIsHousehold() != null) {
            chainWrapper.set(InsElderCheckInfo::getIsHousehold, insElderCheckInfo.getIsHousehold());
        }
        if (insElderCheckInfo.getHouseholdId() != null) {
            chainWrapper.set(InsElderCheckInfo::getHouseholdId, insElderCheckInfo.getHouseholdId());
        }
        if (insElderCheckInfo.getTurnOverState() != null) {
            chainWrapper.set(InsElderCheckInfo::getTurnOverState, insElderCheckInfo.getTurnOverState());
        }
        if (insElderCheckInfo.getElderCategory() != null) {
            chainWrapper.set(InsElderCheckInfo::getElderCategory, insElderCheckInfo.getElderCategory());
        }
        if (insElderCheckInfo.getElderCategoryTime() != null) {
            chainWrapper.set(InsElderCheckInfo::getElderCategoryTime, insElderCheckInfo.getElderCategoryTime());
        }
        if (insElderCheckInfo.getRetreatTime() != null) {
            chainWrapper.set(InsElderCheckInfo::getRetreatTime, insElderCheckInfo.getRetreatTime());
        }
        if (insElderCheckInfo.getAreaCode() != null) {
            chainWrapper.set(InsElderCheckInfo::getAreaCode, insElderCheckInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getAreaName())) {
            chainWrapper.set(InsElderCheckInfo::getAreaName, insElderCheckInfo.getAreaName());
        }
        if (insElderCheckInfo.getTotalAuditState() != null) {
            chainWrapper.set(InsElderCheckInfo::getTotalAuditState, insElderCheckInfo.getTotalAuditState());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getMediaChannels())) {
            chainWrapper.set(InsElderCheckInfo::getMediaChannels, insElderCheckInfo.getMediaChannels());
        }
        if (insElderCheckInfo.getSignWay() != null) {
            chainWrapper.set(InsElderCheckInfo::getSignWay, insElderCheckInfo.getSignWay());
        }
        if (insElderCheckInfo.getSignIsVideo() != null) {
            chainWrapper.set(InsElderCheckInfo::getSignIsVideo, insElderCheckInfo.getSignIsVideo());
        }
        if (insElderCheckInfo.getRelativesId() != null) {
            chainWrapper.set(InsElderCheckInfo::getRelativesId, insElderCheckInfo.getRelativesId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getRelativesName())) {
            chainWrapper.set(InsElderCheckInfo::getRelativesName, insElderCheckInfo.getRelativesName());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getPassWord())) {
            chainWrapper.set(InsElderCheckInfo::getPassWord, insElderCheckInfo.getPassWord());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getRemark())) {
            chainWrapper.set(InsElderCheckInfo::getRemark, insElderCheckInfo.getRemark());
        }
        if (insElderCheckInfo.getCreateUser() != null) {
            chainWrapper.set(InsElderCheckInfo::getCreateUser, insElderCheckInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getCreateName())) {
            chainWrapper.set(InsElderCheckInfo::getCreateName, insElderCheckInfo.getCreateName());
        }
        if (insElderCheckInfo.getCreateDept() != null) {
            chainWrapper.set(InsElderCheckInfo::getCreateDept, insElderCheckInfo.getCreateDept());
        }
        if (insElderCheckInfo.getCreateTime() != null) {
            chainWrapper.set(InsElderCheckInfo::getCreateTime, insElderCheckInfo.getCreateTime());
        }
        if (insElderCheckInfo.getUpdateUser() != null) {
            chainWrapper.set(InsElderCheckInfo::getUpdateUser, insElderCheckInfo.getUpdateUser());
        }
        if (insElderCheckInfo.getUpdateTime() != null) {
            chainWrapper.set(InsElderCheckInfo::getUpdateTime, insElderCheckInfo.getUpdateTime());
        }
        if (insElderCheckInfo.getIsDeleted() != null) {
            chainWrapper.set(InsElderCheckInfo::getIsDeleted, insElderCheckInfo.getIsDeleted());
        }
        if (insElderCheckInfo.getStatus() != null) {
            chainWrapper.set(InsElderCheckInfo::getStatus, insElderCheckInfo.getStatus());
        }
        if (insElderCheckInfo.getVideoId() != null) {
            chainWrapper.set(InsElderCheckInfo::getVideoId, insElderCheckInfo.getVideoId());
        }
        if (insElderCheckInfo.getBenefitsId() != null) {
            chainWrapper.set(InsElderCheckInfo::getBenefitsId, insElderCheckInfo.getBenefitsId());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getBenefitsName())) {
            chainWrapper.set(InsElderCheckInfo::getBenefitsName, insElderCheckInfo.getBenefitsName());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getAdmissionMethod())) {
            chainWrapper.set(InsElderCheckInfo::getAdmissionMethod, insElderCheckInfo.getAdmissionMethod());
        }
        if (insElderCheckInfo.getHouseholdCheckState() != null) {
            chainWrapper.set(InsElderCheckInfo::getHouseholdCheckState, insElderCheckInfo.getHouseholdCheckState());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getHouseholdRelationship())) {
            chainWrapper.set(InsElderCheckInfo::getHouseholdRelationship, insElderCheckInfo.getHouseholdRelationship());
        }
        if (StringUtil.isNotBlank(insElderCheckInfo.getBloodType())) {
            chainWrapper.set(InsElderCheckInfo::getBloodType, insElderCheckInfo.getBloodType());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderCheckInfo::getId, insElderCheckInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderCheckInfo.getId());
        } else {
            return insElderCheckInfo;
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
    public boolean saveInsElderCheckInfoBatch(List<InsElderCheckInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderCheckInfo insElderCheckInfo : insertList) {
            //使用默认的雪花算法生成
            insElderCheckInfo.setId(null);
            //insElderCheckInfo.setCreatedDt(currentDte);
            //insElderCheckInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderCheckInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderCheckInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Object getRealTimeData() {
        LambdaQueryWrapper<InsElderCheckInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.in(InsElderCheckInfo::getCheckState, Arrays.asList(2, 3));
        List<InsElderCheckInfo> insElderCheckInfoList = list(wrapper);
        //今日老人在院人数
        int count = insElderCheckInfoList.size();
        HashMap<String, Object> result = new HashMap<>();
        result.put("elderCount", count);
        LambdaQueryWrapper<InsElderCheckInfo> wrapper1 = new LambdaQueryWrapper<>();
        List<InsBaseBedInfo> list = insBaseBedInfoService.list();
        int bedCount = list.size();
        result.put("bedCount", bedCount);
        long occupiedCount = list.stream().filter(e->e.getStatus().equals(3) || e.getStatus().equals(4)).count();
        result.put("ratio",bedCount > 0 ? Math.round(occupiedCount * 10000.0 / bedCount) / 100.0 + "%" : "0%");
//        item.put("ratio", (total > 0 ? Math.round(count * 10000.0 / total) / 100.0 : 0)+"%");
        return result;
    }

    @Override
    public Object getTodayAndMonthData(HealthDto healthDto) {
        HashMap<String, Object> result = new HashMap<>();
        //入住
        LambdaQueryWrapper<InsElderCheckInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(InsElderCheckInfo::getCheckState, 3);
        if(healthDto.getStratTime() != null && healthDto.getEndTime() != null){
            wrapper.ge(InsElderCheckInfo::getCheckDate, healthDto.getStratTime());
            wrapper.le(InsElderCheckInfo::getCheckDate, healthDto.getEndTime());
        }
        List<InsElderCheckInfo> list = list(wrapper);
        result.put("inCount",list==null?0:list.size());

        //离院
        LambdaQueryWrapper<InsElderRetreatInfo> wrapper1 = new LambdaQueryWrapper<>();
        wrapper1.eq(InsElderRetreatInfo::getAuditState, 2);
        if(healthDto.getStratTime() != null && healthDto.getEndTime() != null){
            wrapper1.ge(InsElderRetreatInfo::getRetreatTime, healthDto.getStratTime());
            wrapper1.le(InsElderRetreatInfo::getRetreatTime, healthDto.getEndTime());
        }
        List<InsElderRetreatInfo> list1 = insElderRetreatInfoService.list(wrapper1);
        result.put("outCount",list1==null?0:list1.size());

        //预约
        LambdaQueryWrapper<InsRegisterConsultInfo> wrapper2 = new LambdaQueryWrapper<>();
        wrapper2.eq(InsRegisterConsultInfo::getConsultType, 2)
                .eq(InsRegisterConsultInfo::getConsultState, 1);
        if(healthDto.getStratTime() != null && healthDto.getEndTime() != null){
            wrapper2.ge(InsRegisterConsultInfo::getConsultTime, healthDto.getStratTime());
            wrapper2.le(InsRegisterConsultInfo::getConsultTime, healthDto.getEndTime());
        }
        List<InsRegisterConsultInfo> list2 = insRegisterConsultInfoService.list(wrapper2);
        result.put("appointmentCount",list2==null?0:list2.size());
        return result;
    }

    @Override
    public Object getTodayRealTimeData() {
        // 计算今日起止时间
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date todayStart = cal.getTime();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        Date todayEnd = cal.getTime();

        // 本月起止时间
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        Date monthStart = cal.getTime();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        Date monthEnd = cal.getTime();

        HashMap<String, Object> result = new HashMap<>();

        // 今日在院老人人数
        List<InsElderCheckInfo> elderList = list(new LambdaQueryWrapper<InsElderCheckInfo>()
                .in(InsElderCheckInfo::getCheckState, Arrays.asList(2, 3)));
        result.put("elderCount", elderList.size());

        // 核定床位数 & 入住率
        List<InsBaseBedInfo> bedList = insBaseBedInfoService.list();
        int bedCount = bedList.size();
        result.put("bedCount", bedCount);
        long occupiedCount = bedList.stream()
                .filter(e -> e.getBedState() != null && (e.getBedState().equals(3) || e.getBedState().equals(4)))
                .count();
        result.put("ratio", bedCount > 0
                ? Math.round(occupiedCount * 10000.0 / bedCount) / 100.0 + "%" : "0.00%");

        // 今日入住
        long todayCheckIn = count(new LambdaQueryWrapper<InsElderCheckInfo>()
                .in(InsElderCheckInfo::getCheckState, Arrays.asList(2, 3))
                .ge(InsElderCheckInfo::getCheckDate, todayStart)
                .le(InsElderCheckInfo::getCheckDate, todayEnd));
        result.put("todayCheckIn", todayCheckIn);

        // 今日预约（consultType=2, consultState=1）
        long todayForecast = insRegisterConsultInfoService.count(new LambdaQueryWrapper<InsRegisterConsultInfo>()
                .eq(InsRegisterConsultInfo::getConsultType, 2)
                .eq(InsRegisterConsultInfo::getConsultState, 1)
                .ge(InsRegisterConsultInfo::getConsultTime, todayStart)
                .le(InsRegisterConsultInfo::getConsultTime, todayEnd));
        result.put("todayForecast", todayForecast);

        // 今日来访（consultType=1）
        long todayVisit = insRegisterConsultInfoService.count(new LambdaQueryWrapper<InsRegisterConsultInfo>()
                .eq(InsRegisterConsultInfo::getConsultType, 1)
                .ge(InsRegisterConsultInfo::getConsultTime, todayStart)
                .le(InsRegisterConsultInfo::getConsultTime, todayEnd));
        result.put("todayVisit", todayVisit);

        // 今日离院
        long todayDischarge = insElderRetreatInfoService.count(new LambdaQueryWrapper<InsElderRetreatInfo>()
                .eq(InsElderRetreatInfo::getAuditState, 2)
                .ge(InsElderRetreatInfo::getRetreatTime, todayStart)
                .le(InsElderRetreatInfo::getRetreatTime, todayEnd));
        result.put("todayDischarge", todayDischarge);

        // 本月入住
        long thisMonthCheckIn = count(new LambdaQueryWrapper<InsElderCheckInfo>()
                .in(InsElderCheckInfo::getCheckState, Arrays.asList(2, 3))
                .ge(InsElderCheckInfo::getCheckDate, monthStart)
                .le(InsElderCheckInfo::getCheckDate, monthEnd));
        result.put("thisMonthCheckIn", thisMonthCheckIn);

        // 本月预约
        long thisMonthForecast = insRegisterConsultInfoService.count(new LambdaQueryWrapper<InsRegisterConsultInfo>()
                .eq(InsRegisterConsultInfo::getConsultType, 2)
                .eq(InsRegisterConsultInfo::getConsultState, 1)
                .ge(InsRegisterConsultInfo::getConsultTime, monthStart)
                .le(InsRegisterConsultInfo::getConsultTime, monthEnd));
        result.put("thisMonthForecast", thisMonthForecast);

        // 本月来访
        long thisMonthVisit = insRegisterConsultInfoService.count(new LambdaQueryWrapper<InsRegisterConsultInfo>()
                .eq(InsRegisterConsultInfo::getConsultType, 1)
                .ge(InsRegisterConsultInfo::getConsultTime, monthStart)
                .le(InsRegisterConsultInfo::getConsultTime, monthEnd));
        result.put("thisMonthVisit", thisMonthVisit);

        // 本月离院
        long thisMonthDischarge = insElderRetreatInfoService.count(new LambdaQueryWrapper<InsElderRetreatInfo>()
                .eq(InsElderRetreatInfo::getAuditState, 2)
                .ge(InsElderRetreatInfo::getRetreatTime, monthStart)
                .le(InsElderRetreatInfo::getRetreatTime, monthEnd));
        result.put("thisMonthDischarge", thisMonthDischarge);

        return result;
    }
}


