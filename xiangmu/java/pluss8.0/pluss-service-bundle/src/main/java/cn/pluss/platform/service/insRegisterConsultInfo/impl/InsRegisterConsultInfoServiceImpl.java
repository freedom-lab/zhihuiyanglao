package cn.pluss.platform.service.insRegisterConsultInfo.impl;

import cn.pluss.platform.mapper.InsRegisterConsultInfoMapper;
import cn.pluss.platform.model.entity.InsRegisterConsultInfo;
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

import java.util.List;
import java.util.Map;

@Transactional
@Service("insRegisterConsultInfoService")
public class InsRegisterConsultInfoServiceImpl extends ServiceImpl< InsRegisterConsultInfoMapper, InsRegisterConsultInfo> implements InsRegisterConsultInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsRegisterConsultInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsRegisterConsultInfo> queryPage(Map map) {
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
    public InsRegisterConsultInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insRegisterConsultInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsRegisterConsultInfo queryOne(InsRegisterConsultInfo insRegisterConsultInfo){
        LambdaQueryWrapper<InsRegisterConsultInfo> queryWrapper = getQueryWrapper(insRegisterConsultInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insRegisterConsultInfo
    * @return
    */
    @Override
    public List<InsRegisterConsultInfo> queryList(InsRegisterConsultInfo insRegisterConsultInfo) {
        LambdaQueryWrapper<InsRegisterConsultInfo> queryWrapper = getQueryWrapper(insRegisterConsultInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insRegisterConsultInfo
    * @return
    */
    public static LambdaQueryWrapper<InsRegisterConsultInfo> getQueryWrapper(InsRegisterConsultInfo insRegisterConsultInfo){
        LambdaQueryWrapper<InsRegisterConsultInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insRegisterConsultInfo.getId() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getId, insRegisterConsultInfo.getId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getTenantId())) {
            queryWrapper.eq(InsRegisterConsultInfo::getTenantId, insRegisterConsultInfo.getTenantId());
        }
        if (insRegisterConsultInfo.getCorpId() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getCorpId, insRegisterConsultInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getCorpName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getCorpName, insRegisterConsultInfo.getCorpName());
        }
        if (insRegisterConsultInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getInstitutionId, insRegisterConsultInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getInstitutionName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getInstitutionName, insRegisterConsultInfo.getInstitutionName());
        }
        if (insRegisterConsultInfo.getConsultType() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getConsultType, insRegisterConsultInfo.getConsultType());
        }
        if (insRegisterConsultInfo.getConsultTime() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getConsultTime, insRegisterConsultInfo.getConsultTime());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getConsultName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getConsultName, insRegisterConsultInfo.getConsultName());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getLinkTel())) {
            queryWrapper.eq(InsRegisterConsultInfo::getLinkTel, insRegisterConsultInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getConditionType())) {
            queryWrapper.eq(InsRegisterConsultInfo::getConditionType, insRegisterConsultInfo.getConditionType());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getConsultMode())) {
            queryWrapper.eq(InsRegisterConsultInfo::getConsultMode, insRegisterConsultInfo.getConsultMode());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getConsultIntention())) {
            queryWrapper.eq(InsRegisterConsultInfo::getConsultIntention, insRegisterConsultInfo.getConsultIntention());
        }
        if (insRegisterConsultInfo.getConsultNum() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getConsultNum, insRegisterConsultInfo.getConsultNum());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getMediaChannels())) {
            queryWrapper.eq(InsRegisterConsultInfo::getMediaChannels, insRegisterConsultInfo.getMediaChannels());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getElderName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getElderName, insRegisterConsultInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getIdCard())) {
            queryWrapper.eq(InsRegisterConsultInfo::getIdCard, insRegisterConsultInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getSex())) {
            queryWrapper.eq(InsRegisterConsultInfo::getSex, insRegisterConsultInfo.getSex());
        }
        if (insRegisterConsultInfo.getAge() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getAge, insRegisterConsultInfo.getAge());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getHomeAddress())) {
            queryWrapper.eq(InsRegisterConsultInfo::getHomeAddress, insRegisterConsultInfo.getHomeAddress());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getAbilityLevel())) {
            queryWrapper.eq(InsRegisterConsultInfo::getAbilityLevel, insRegisterConsultInfo.getAbilityLevel());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getCheckMethod())) {
            queryWrapper.eq(InsRegisterConsultInfo::getCheckMethod, insRegisterConsultInfo.getCheckMethod());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getIdealPrice())) {
            queryWrapper.eq(InsRegisterConsultInfo::getIdealPrice, insRegisterConsultInfo.getIdealPrice());
        }
        if (insRegisterConsultInfo.getAssumeCost() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getAssumeCost, insRegisterConsultInfo.getAssumeCost());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getConcerns())) {
            queryWrapper.eq(InsRegisterConsultInfo::getConcerns, insRegisterConsultInfo.getConcerns());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getSatisfied())) {
            queryWrapper.eq(InsRegisterConsultInfo::getSatisfied, insRegisterConsultInfo.getSatisfied());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getDissatisfied())) {
            queryWrapper.eq(InsRegisterConsultInfo::getDissatisfied, insRegisterConsultInfo.getDissatisfied());
        }
        if (insRegisterConsultInfo.getVisitorsNumber() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getVisitorsNumber, insRegisterConsultInfo.getVisitorsNumber());
        }
        if (insRegisterConsultInfo.getBuildingId() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getBuildingId, insRegisterConsultInfo.getBuildingId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getBuildingName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getBuildingName, insRegisterConsultInfo.getBuildingName());
        }
        if (insRegisterConsultInfo.getFloorId() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getFloorId, insRegisterConsultInfo.getFloorId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getFloorName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getFloorName, insRegisterConsultInfo.getFloorName());
        }
        if (insRegisterConsultInfo.getRoomId() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getRoomId, insRegisterConsultInfo.getRoomId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getRoomName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getRoomName, insRegisterConsultInfo.getRoomName());
        }
        if (insRegisterConsultInfo.getBedId() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getBedId, insRegisterConsultInfo.getBedId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getBedName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getBedName, insRegisterConsultInfo.getBedName());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getBedInfo())) {
            queryWrapper.eq(InsRegisterConsultInfo::getBedInfo, insRegisterConsultInfo.getBedInfo());
        }
        if (insRegisterConsultInfo.getIsRoom() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getIsRoom, insRegisterConsultInfo.getIsRoom());
        }
        if (insRegisterConsultInfo.getReserveStartTime() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getReserveStartTime, insRegisterConsultInfo.getReserveStartTime());
        }
        if (insRegisterConsultInfo.getReserveEndTime() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getReserveEndTime, insRegisterConsultInfo.getReserveEndTime());
        }
        if (insRegisterConsultInfo.getAppointmentFee() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getAppointmentFee, insRegisterConsultInfo.getAppointmentFee());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getRefereeName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getRefereeName, insRegisterConsultInfo.getRefereeName());
        }
        if (insRegisterConsultInfo.getReceptionId() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getReceptionId, insRegisterConsultInfo.getReceptionId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getReceptionPerson())) {
            queryWrapper.eq(InsRegisterConsultInfo::getReceptionPerson, insRegisterConsultInfo.getReceptionPerson());
        }
        if (insRegisterConsultInfo.getConsultState() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getConsultState, insRegisterConsultInfo.getConsultState());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getDataSource())) {
            queryWrapper.eq(InsRegisterConsultInfo::getDataSource, insRegisterConsultInfo.getDataSource());
        }
        if (insRegisterConsultInfo.getChildrenId() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getChildrenId, insRegisterConsultInfo.getChildrenId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getAreaCode())) {
            queryWrapper.eq(InsRegisterConsultInfo::getAreaCode, insRegisterConsultInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getAreaName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getAreaName, insRegisterConsultInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getAppointmentState())) {
            queryWrapper.eq(InsRegisterConsultInfo::getAppointmentState, insRegisterConsultInfo.getAppointmentState());
        }
        if (insRegisterConsultInfo.getBirthday() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getBirthday, insRegisterConsultInfo.getBirthday());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getSocialCardNo())) {
            queryWrapper.eq(InsRegisterConsultInfo::getSocialCardNo, insRegisterConsultInfo.getSocialCardNo());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getMarryState())) {
            queryWrapper.eq(InsRegisterConsultInfo::getMarryState, insRegisterConsultInfo.getMarryState());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getDegreeEducation())) {
            queryWrapper.eq(InsRegisterConsultInfo::getDegreeEducation, insRegisterConsultInfo.getDegreeEducation());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getEconomicSources())) {
            queryWrapper.eq(InsRegisterConsultInfo::getEconomicSources, insRegisterConsultInfo.getEconomicSources());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getHobby())) {
            queryWrapper.eq(InsRegisterConsultInfo::getHobby, insRegisterConsultInfo.getHobby());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getHobbyName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getHobbyName, insRegisterConsultInfo.getHobbyName());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getMajorDiseases())) {
            queryWrapper.eq(InsRegisterConsultInfo::getMajorDiseases, insRegisterConsultInfo.getMajorDiseases());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getMajorDiseasesName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getMajorDiseasesName, insRegisterConsultInfo.getMajorDiseasesName());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getMajorDiseasesOther())) {
            queryWrapper.eq(InsRegisterConsultInfo::getMajorDiseasesOther, insRegisterConsultInfo.getMajorDiseasesOther());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getFailureReason())) {
            queryWrapper.eq(InsRegisterConsultInfo::getFailureReason, insRegisterConsultInfo.getFailureReason());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getRemark())) {
            queryWrapper.eq(InsRegisterConsultInfo::getRemark, insRegisterConsultInfo.getRemark());
        }
        if (insRegisterConsultInfo.getCreateUser() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getCreateUser, insRegisterConsultInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultInfo.getCreateName())) {
            queryWrapper.eq(InsRegisterConsultInfo::getCreateName, insRegisterConsultInfo.getCreateName());
        }
        if (insRegisterConsultInfo.getCreateDept() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getCreateDept, insRegisterConsultInfo.getCreateDept());
        }
        if (insRegisterConsultInfo.getCreateTime() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getCreateTime, insRegisterConsultInfo.getCreateTime());
        }
        if (insRegisterConsultInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getUpdateUser, insRegisterConsultInfo.getUpdateUser());
        }
        if (insRegisterConsultInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getUpdateTime, insRegisterConsultInfo.getUpdateTime());
        }
        if (insRegisterConsultInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getIsDeleted, insRegisterConsultInfo.getIsDeleted());
        }
        if (insRegisterConsultInfo.getStatus() != null) {
            queryWrapper.eq(InsRegisterConsultInfo::getStatus, insRegisterConsultInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insRegisterConsultInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsRegisterConsultInfo insert(InsRegisterConsultInfo insRegisterConsultInfo) {
        insRegisterConsultInfo.setId(null);
        getBaseMapper().insert(insRegisterConsultInfo);
        return insRegisterConsultInfo;
    }

    /**
    * 更新数据
    *
    * @param insRegisterConsultInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsRegisterConsultInfo update(InsRegisterConsultInfo insRegisterConsultInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsRegisterConsultInfo> chainWrapper = new LambdaUpdateChainWrapper<InsRegisterConsultInfo>(getBaseMapper());
        if (insRegisterConsultInfo.getId() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getId, insRegisterConsultInfo.getId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getTenantId())) {
            chainWrapper.set(InsRegisterConsultInfo::getTenantId, insRegisterConsultInfo.getTenantId());
        }
        if (insRegisterConsultInfo.getCorpId() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getCorpId, insRegisterConsultInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getCorpName())) {
            chainWrapper.set(InsRegisterConsultInfo::getCorpName, insRegisterConsultInfo.getCorpName());
        }
        if (insRegisterConsultInfo.getInstitutionId() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getInstitutionId, insRegisterConsultInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getInstitutionName())) {
            chainWrapper.set(InsRegisterConsultInfo::getInstitutionName, insRegisterConsultInfo.getInstitutionName());
        }
        if (insRegisterConsultInfo.getConsultType() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getConsultType, insRegisterConsultInfo.getConsultType());
        }
        if (insRegisterConsultInfo.getConsultTime() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getConsultTime, insRegisterConsultInfo.getConsultTime());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getConsultName())) {
            chainWrapper.set(InsRegisterConsultInfo::getConsultName, insRegisterConsultInfo.getConsultName());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getLinkTel())) {
            chainWrapper.set(InsRegisterConsultInfo::getLinkTel, insRegisterConsultInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getConditionType())) {
            chainWrapper.set(InsRegisterConsultInfo::getConditionType, insRegisterConsultInfo.getConditionType());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getConsultMode())) {
            chainWrapper.set(InsRegisterConsultInfo::getConsultMode, insRegisterConsultInfo.getConsultMode());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getConsultIntention())) {
            chainWrapper.set(InsRegisterConsultInfo::getConsultIntention, insRegisterConsultInfo.getConsultIntention());
        }
        if (insRegisterConsultInfo.getConsultNum() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getConsultNum, insRegisterConsultInfo.getConsultNum());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getMediaChannels())) {
            chainWrapper.set(InsRegisterConsultInfo::getMediaChannels, insRegisterConsultInfo.getMediaChannels());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getElderName())) {
            chainWrapper.set(InsRegisterConsultInfo::getElderName, insRegisterConsultInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getIdCard())) {
            chainWrapper.set(InsRegisterConsultInfo::getIdCard, insRegisterConsultInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getSex())) {
            chainWrapper.set(InsRegisterConsultInfo::getSex, insRegisterConsultInfo.getSex());
        }
        if (insRegisterConsultInfo.getAge() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getAge, insRegisterConsultInfo.getAge());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getHomeAddress())) {
            chainWrapper.set(InsRegisterConsultInfo::getHomeAddress, insRegisterConsultInfo.getHomeAddress());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getAbilityLevel())) {
            chainWrapper.set(InsRegisterConsultInfo::getAbilityLevel, insRegisterConsultInfo.getAbilityLevel());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getCheckMethod())) {
            chainWrapper.set(InsRegisterConsultInfo::getCheckMethod, insRegisterConsultInfo.getCheckMethod());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getIdealPrice())) {
            chainWrapper.set(InsRegisterConsultInfo::getIdealPrice, insRegisterConsultInfo.getIdealPrice());
        }
        if (insRegisterConsultInfo.getAssumeCost() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getAssumeCost, insRegisterConsultInfo.getAssumeCost());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getConcerns())) {
            chainWrapper.set(InsRegisterConsultInfo::getConcerns, insRegisterConsultInfo.getConcerns());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getSatisfied())) {
            chainWrapper.set(InsRegisterConsultInfo::getSatisfied, insRegisterConsultInfo.getSatisfied());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getDissatisfied())) {
            chainWrapper.set(InsRegisterConsultInfo::getDissatisfied, insRegisterConsultInfo.getDissatisfied());
        }
        if (insRegisterConsultInfo.getVisitorsNumber() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getVisitorsNumber, insRegisterConsultInfo.getVisitorsNumber());
        }
        if (insRegisterConsultInfo.getBuildingId() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getBuildingId, insRegisterConsultInfo.getBuildingId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getBuildingName())) {
            chainWrapper.set(InsRegisterConsultInfo::getBuildingName, insRegisterConsultInfo.getBuildingName());
        }
        if (insRegisterConsultInfo.getFloorId() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getFloorId, insRegisterConsultInfo.getFloorId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getFloorName())) {
            chainWrapper.set(InsRegisterConsultInfo::getFloorName, insRegisterConsultInfo.getFloorName());
        }
        if (insRegisterConsultInfo.getRoomId() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getRoomId, insRegisterConsultInfo.getRoomId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getRoomName())) {
            chainWrapper.set(InsRegisterConsultInfo::getRoomName, insRegisterConsultInfo.getRoomName());
        }
        if (insRegisterConsultInfo.getBedId() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getBedId, insRegisterConsultInfo.getBedId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getBedName())) {
            chainWrapper.set(InsRegisterConsultInfo::getBedName, insRegisterConsultInfo.getBedName());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getBedInfo())) {
            chainWrapper.set(InsRegisterConsultInfo::getBedInfo, insRegisterConsultInfo.getBedInfo());
        }
        if (insRegisterConsultInfo.getIsRoom() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getIsRoom, insRegisterConsultInfo.getIsRoom());
        }
        if (insRegisterConsultInfo.getReserveStartTime() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getReserveStartTime, insRegisterConsultInfo.getReserveStartTime());
        }
        if (insRegisterConsultInfo.getReserveEndTime() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getReserveEndTime, insRegisterConsultInfo.getReserveEndTime());
        }
        if (insRegisterConsultInfo.getAppointmentFee() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getAppointmentFee, insRegisterConsultInfo.getAppointmentFee());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getRefereeName())) {
            chainWrapper.set(InsRegisterConsultInfo::getRefereeName, insRegisterConsultInfo.getRefereeName());
        }
        if (insRegisterConsultInfo.getReceptionId() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getReceptionId, insRegisterConsultInfo.getReceptionId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getReceptionPerson())) {
            chainWrapper.set(InsRegisterConsultInfo::getReceptionPerson, insRegisterConsultInfo.getReceptionPerson());
        }
        if (insRegisterConsultInfo.getConsultState() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getConsultState, insRegisterConsultInfo.getConsultState());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getDataSource())) {
            chainWrapper.set(InsRegisterConsultInfo::getDataSource, insRegisterConsultInfo.getDataSource());
        }
        if (insRegisterConsultInfo.getChildrenId() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getChildrenId, insRegisterConsultInfo.getChildrenId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getAreaCode())) {
            chainWrapper.set(InsRegisterConsultInfo::getAreaCode, insRegisterConsultInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getAreaName())) {
            chainWrapper.set(InsRegisterConsultInfo::getAreaName, insRegisterConsultInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getAppointmentState())) {
            chainWrapper.set(InsRegisterConsultInfo::getAppointmentState, insRegisterConsultInfo.getAppointmentState());
        }
        if (insRegisterConsultInfo.getBirthday() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getBirthday, insRegisterConsultInfo.getBirthday());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getSocialCardNo())) {
            chainWrapper.set(InsRegisterConsultInfo::getSocialCardNo, insRegisterConsultInfo.getSocialCardNo());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getMarryState())) {
            chainWrapper.set(InsRegisterConsultInfo::getMarryState, insRegisterConsultInfo.getMarryState());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getDegreeEducation())) {
            chainWrapper.set(InsRegisterConsultInfo::getDegreeEducation, insRegisterConsultInfo.getDegreeEducation());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getEconomicSources())) {
            chainWrapper.set(InsRegisterConsultInfo::getEconomicSources, insRegisterConsultInfo.getEconomicSources());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getHobby())) {
            chainWrapper.set(InsRegisterConsultInfo::getHobby, insRegisterConsultInfo.getHobby());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getHobbyName())) {
            chainWrapper.set(InsRegisterConsultInfo::getHobbyName, insRegisterConsultInfo.getHobbyName());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getMajorDiseases())) {
            chainWrapper.set(InsRegisterConsultInfo::getMajorDiseases, insRegisterConsultInfo.getMajorDiseases());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getMajorDiseasesName())) {
            chainWrapper.set(InsRegisterConsultInfo::getMajorDiseasesName, insRegisterConsultInfo.getMajorDiseasesName());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getMajorDiseasesOther())) {
            chainWrapper.set(InsRegisterConsultInfo::getMajorDiseasesOther, insRegisterConsultInfo.getMajorDiseasesOther());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getFailureReason())) {
            chainWrapper.set(InsRegisterConsultInfo::getFailureReason, insRegisterConsultInfo.getFailureReason());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getRemark())) {
            chainWrapper.set(InsRegisterConsultInfo::getRemark, insRegisterConsultInfo.getRemark());
        }
        if (insRegisterConsultInfo.getCreateUser() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getCreateUser, insRegisterConsultInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insRegisterConsultInfo.getCreateName())) {
            chainWrapper.set(InsRegisterConsultInfo::getCreateName, insRegisterConsultInfo.getCreateName());
        }
        if (insRegisterConsultInfo.getCreateDept() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getCreateDept, insRegisterConsultInfo.getCreateDept());
        }
        if (insRegisterConsultInfo.getCreateTime() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getCreateTime, insRegisterConsultInfo.getCreateTime());
        }
        if (insRegisterConsultInfo.getUpdateUser() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getUpdateUser, insRegisterConsultInfo.getUpdateUser());
        }
        if (insRegisterConsultInfo.getUpdateTime() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getUpdateTime, insRegisterConsultInfo.getUpdateTime());
        }
        if (insRegisterConsultInfo.getIsDeleted() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getIsDeleted, insRegisterConsultInfo.getIsDeleted());
        }
        if (insRegisterConsultInfo.getStatus() != null) {
            chainWrapper.set(InsRegisterConsultInfo::getStatus, insRegisterConsultInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsRegisterConsultInfo::getId, insRegisterConsultInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insRegisterConsultInfo.getId());
        } else {
            return insRegisterConsultInfo;
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
    public boolean saveInsRegisterConsultInfoBatch(List<InsRegisterConsultInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsRegisterConsultInfo insRegisterConsultInfo : insertList) {
            //使用默认的雪花算法生成
            insRegisterConsultInfo.setId(null);
            //insRegisterConsultInfo.setCreatedDt(currentDte);
            //insRegisterConsultInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsRegisterConsultInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsRegisterConsultInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


