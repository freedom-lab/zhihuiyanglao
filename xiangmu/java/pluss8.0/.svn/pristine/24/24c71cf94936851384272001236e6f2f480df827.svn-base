package cn.pluss.platform.service.healthBaseInfo.impl;

import cn.pluss.platform.mapper.HealthBaseInfoMapper;
import cn.pluss.platform.model.entity.HealthBaseInfo;
import cn.pluss.platform.service.healthBaseInfo.HealthBaseInfoService;
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
@Service("healthBaseInfoService")
public class HealthBaseInfoServiceImpl extends ServiceImpl< HealthBaseInfoMapper, HealthBaseInfo> implements HealthBaseInfoService {
    private static final Logger logger = LoggerFactory.getLogger(HealthBaseInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthBaseInfo> queryPage(Map map) {
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
    public HealthBaseInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthBaseInfo 实例对象
    * @return 实例对象
    */
    @Override
    public HealthBaseInfo queryOne(HealthBaseInfo healthBaseInfo){
        LambdaQueryWrapper<HealthBaseInfo> queryWrapper = getQueryWrapper(healthBaseInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthBaseInfo
    * @return
    */
    @Override
    public List<HealthBaseInfo> queryList(HealthBaseInfo healthBaseInfo) {
        LambdaQueryWrapper<HealthBaseInfo> queryWrapper = getQueryWrapper(healthBaseInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthBaseInfo
    * @return
    */
    public static LambdaQueryWrapper<HealthBaseInfo> getQueryWrapper(HealthBaseInfo healthBaseInfo){
        LambdaQueryWrapper<HealthBaseInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (healthBaseInfo.getId() != null) {
            queryWrapper.eq(HealthBaseInfo::getId, healthBaseInfo.getId());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getTenantId())) {
            queryWrapper.eq(HealthBaseInfo::getTenantId, healthBaseInfo.getTenantId());
        }
        if (healthBaseInfo.getCorpId() != null) {
            queryWrapper.eq(HealthBaseInfo::getCorpId, healthBaseInfo.getCorpId());
        }
        if (healthBaseInfo.getInstitutionId() != null) {
            queryWrapper.eq(HealthBaseInfo::getInstitutionId, healthBaseInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getInstitutionName())) {
            queryWrapper.eq(HealthBaseInfo::getInstitutionName, healthBaseInfo.getInstitutionName());
        }
        if (healthBaseInfo.getElderId() != null) {
            queryWrapper.eq(HealthBaseInfo::getElderId, healthBaseInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getElderName())) {
            queryWrapper.eq(HealthBaseInfo::getElderName, healthBaseInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getIdCard())) {
            queryWrapper.eq(HealthBaseInfo::getIdCard, healthBaseInfo.getIdCard());
        }
        if (healthBaseInfo.getAge() != null) {
            queryWrapper.eq(HealthBaseInfo::getAge, healthBaseInfo.getAge());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getSex())) {
            queryWrapper.eq(HealthBaseInfo::getSex, healthBaseInfo.getSex());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getLinkTel())) {
            queryWrapper.eq(HealthBaseInfo::getLinkTel, healthBaseInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getMarryState())) {
            queryWrapper.eq(HealthBaseInfo::getMarryState, healthBaseInfo.getMarryState());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getDegreeEducation())) {
            queryWrapper.eq(HealthBaseInfo::getDegreeEducation, healthBaseInfo.getDegreeEducation());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getDisabilityType())) {
            queryWrapper.eq(HealthBaseInfo::getDisabilityType, healthBaseInfo.getDisabilityType());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getMajorDiseases())) {
            queryWrapper.eq(HealthBaseInfo::getMajorDiseases, healthBaseInfo.getMajorDiseases());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getMajorDiseasesName())) {
            queryWrapper.eq(HealthBaseInfo::getMajorDiseasesName, healthBaseInfo.getMajorDiseasesName());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getMedicalCategory())) {
            queryWrapper.eq(HealthBaseInfo::getMedicalCategory, healthBaseInfo.getMedicalCategory());
        }
        if (healthBaseInfo.getIsChildren() != null) {
            queryWrapper.eq(HealthBaseInfo::getIsChildren, healthBaseInfo.getIsChildren());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getWorkUnit())) {
            queryWrapper.eq(HealthBaseInfo::getWorkUnit, healthBaseInfo.getWorkUnit());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getCareer())) {
            queryWrapper.eq(HealthBaseInfo::getCareer, healthBaseInfo.getCareer());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getFileCode())) {
            queryWrapper.eq(HealthBaseInfo::getFileCode, healthBaseInfo.getFileCode());
        }
        if (healthBaseInfo.getFileDate() != null) {
            queryWrapper.eq(HealthBaseInfo::getFileDate, healthBaseInfo.getFileDate());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getPutFileName())) {
            queryWrapper.eq(HealthBaseInfo::getPutFileName, healthBaseInfo.getPutFileName());
        }
        if (healthBaseInfo.getHeight() != null) {
            queryWrapper.eq(HealthBaseInfo::getHeight, healthBaseInfo.getHeight());
        }
        if (healthBaseInfo.getWeight() != null) {
            queryWrapper.eq(HealthBaseInfo::getWeight, healthBaseInfo.getWeight());
        }
        if (healthBaseInfo.getWaist() != null) {
            queryWrapper.eq(HealthBaseInfo::getWaist, healthBaseInfo.getWaist());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getExposureHistory())) {
            queryWrapper.eq(HealthBaseInfo::getExposureHistory, healthBaseInfo.getExposureHistory());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getDrinkingHabits())) {
            queryWrapper.eq(HealthBaseInfo::getDrinkingHabits, healthBaseInfo.getDrinkingHabits());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getSmokingHabits())) {
            queryWrapper.eq(HealthBaseInfo::getSmokingHabits, healthBaseInfo.getSmokingHabits());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getAllergicHistory())) {
            queryWrapper.eq(HealthBaseInfo::getAllergicHistory, healthBaseInfo.getAllergicHistory());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getDietaryHabit())) {
            queryWrapper.eq(HealthBaseInfo::getDietaryHabit, healthBaseInfo.getDietaryHabit());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getSleepQuality())) {
            queryWrapper.eq(HealthBaseInfo::getSleepQuality, healthBaseInfo.getSleepQuality());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getRelieveBowels())) {
            queryWrapper.eq(HealthBaseInfo::getRelieveBowels, healthBaseInfo.getRelieveBowels());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getOperationNameOne())) {
            queryWrapper.eq(HealthBaseInfo::getOperationNameOne, healthBaseInfo.getOperationNameOne());
        }
        if (healthBaseInfo.getOperationTimeOne() != null) {
            queryWrapper.eq(HealthBaseInfo::getOperationTimeOne, healthBaseInfo.getOperationTimeOne());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getOperationNameTwo())) {
            queryWrapper.eq(HealthBaseInfo::getOperationNameTwo, healthBaseInfo.getOperationNameTwo());
        }
        if (healthBaseInfo.getOperationTimeTwo() != null) {
            queryWrapper.eq(HealthBaseInfo::getOperationTimeTwo, healthBaseInfo.getOperationTimeTwo());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getTraumaNameOne())) {
            queryWrapper.eq(HealthBaseInfo::getTraumaNameOne, healthBaseInfo.getTraumaNameOne());
        }
        if (healthBaseInfo.getTraumaTimeOne() != null) {
            queryWrapper.eq(HealthBaseInfo::getTraumaTimeOne, healthBaseInfo.getTraumaTimeOne());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getTraumaNameTwo())) {
            queryWrapper.eq(HealthBaseInfo::getTraumaNameTwo, healthBaseInfo.getTraumaNameTwo());
        }
        if (healthBaseInfo.getTraumaTimeTwo() != null) {
            queryWrapper.eq(HealthBaseInfo::getTraumaTimeTwo, healthBaseInfo.getTraumaTimeTwo());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getBloodNameOne())) {
            queryWrapper.eq(HealthBaseInfo::getBloodNameOne, healthBaseInfo.getBloodNameOne());
        }
        if (healthBaseInfo.getBloodTimeOne() != null) {
            queryWrapper.eq(HealthBaseInfo::getBloodTimeOne, healthBaseInfo.getBloodTimeOne());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getBloodNameTwo())) {
            queryWrapper.eq(HealthBaseInfo::getBloodNameTwo, healthBaseInfo.getBloodNameTwo());
        }
        if (healthBaseInfo.getBloodTimeTwo() != null) {
            queryWrapper.eq(HealthBaseInfo::getBloodTimeTwo, healthBaseInfo.getBloodTimeTwo());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getFatherDiseaseIds())) {
            queryWrapper.eq(HealthBaseInfo::getFatherDiseaseIds, healthBaseInfo.getFatherDiseaseIds());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getMotherDiseaseIds())) {
            queryWrapper.eq(HealthBaseInfo::getMotherDiseaseIds, healthBaseInfo.getMotherDiseaseIds());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getChildrenDiseaseIds())) {
            queryWrapper.eq(HealthBaseInfo::getChildrenDiseaseIds, healthBaseInfo.getChildrenDiseaseIds());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getBrotherDiseaseIds())) {
            queryWrapper.eq(HealthBaseInfo::getBrotherDiseaseIds, healthBaseInfo.getBrotherDiseaseIds());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getGeneticDisease())) {
            queryWrapper.eq(HealthBaseInfo::getGeneticDisease, healthBaseInfo.getGeneticDisease());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getHealthGuidance())) {
            queryWrapper.eq(HealthBaseInfo::getHealthGuidance, healthBaseInfo.getHealthGuidance());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getIntubationType())) {
            queryWrapper.eq(HealthBaseInfo::getIntubationType, healthBaseInfo.getIntubationType());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getMemo())) {
            queryWrapper.eq(HealthBaseInfo::getMemo, healthBaseInfo.getMemo());
        }
        if (healthBaseInfo.getAreaCode() != null) {
            queryWrapper.eq(HealthBaseInfo::getAreaCode, healthBaseInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getAreaName())) {
            queryWrapper.eq(HealthBaseInfo::getAreaName, healthBaseInfo.getAreaName());
        }
        if (healthBaseInfo.getCreateUser() != null) {
            queryWrapper.eq(HealthBaseInfo::getCreateUser, healthBaseInfo.getCreateUser());
        }
        if (healthBaseInfo.getCreateDept() != null) {
            queryWrapper.eq(HealthBaseInfo::getCreateDept, healthBaseInfo.getCreateDept());
        }
        if (healthBaseInfo.getCreateTime() != null) {
            queryWrapper.eq(HealthBaseInfo::getCreateTime, healthBaseInfo.getCreateTime());
        }
        if (healthBaseInfo.getUpdateUser() != null) {
            queryWrapper.eq(HealthBaseInfo::getUpdateUser, healthBaseInfo.getUpdateUser());
        }
        if (healthBaseInfo.getUpdateTime() != null) {
            queryWrapper.eq(HealthBaseInfo::getUpdateTime, healthBaseInfo.getUpdateTime());
        }
        if (healthBaseInfo.getStatus() != null) {
            queryWrapper.eq(HealthBaseInfo::getStatus, healthBaseInfo.getStatus());
        }
        if (healthBaseInfo.getIsDeleted() != null) {
            queryWrapper.eq(HealthBaseInfo::getIsDeleted, healthBaseInfo.getIsDeleted());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getMajorDiseasesOther())) {
            queryWrapper.eq(HealthBaseInfo::getMajorDiseasesOther, healthBaseInfo.getMajorDiseasesOther());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getPid())) {
            queryWrapper.eq(HealthBaseInfo::getPid, healthBaseInfo.getPid());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getPvid())) {
            queryWrapper.eq(HealthBaseInfo::getPvid, healthBaseInfo.getPvid());
        }
        if (StringUtil.isNotEmpty(healthBaseInfo.getBloodType())) {
            queryWrapper.eq(HealthBaseInfo::getBloodType, healthBaseInfo.getBloodType());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthBaseInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBaseInfo insert(HealthBaseInfo healthBaseInfo) {
        healthBaseInfo.setId(null);
        getBaseMapper().insert(healthBaseInfo);
        return healthBaseInfo;
    }

    /**
    * 更新数据
    *
    * @param healthBaseInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBaseInfo update(HealthBaseInfo healthBaseInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthBaseInfo> chainWrapper = new LambdaUpdateChainWrapper<HealthBaseInfo>(getBaseMapper());
        if (healthBaseInfo.getId() != null) {
            chainWrapper.set(HealthBaseInfo::getId, healthBaseInfo.getId());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getTenantId())) {
            chainWrapper.set(HealthBaseInfo::getTenantId, healthBaseInfo.getTenantId());
        }
        if (healthBaseInfo.getCorpId() != null) {
            chainWrapper.set(HealthBaseInfo::getCorpId, healthBaseInfo.getCorpId());
        }
        if (healthBaseInfo.getInstitutionId() != null) {
            chainWrapper.set(HealthBaseInfo::getInstitutionId, healthBaseInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getInstitutionName())) {
            chainWrapper.set(HealthBaseInfo::getInstitutionName, healthBaseInfo.getInstitutionName());
        }
        if (healthBaseInfo.getElderId() != null) {
            chainWrapper.set(HealthBaseInfo::getElderId, healthBaseInfo.getElderId());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getElderName())) {
            chainWrapper.set(HealthBaseInfo::getElderName, healthBaseInfo.getElderName());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getIdCard())) {
            chainWrapper.set(HealthBaseInfo::getIdCard, healthBaseInfo.getIdCard());
        }
        if (healthBaseInfo.getAge() != null) {
            chainWrapper.set(HealthBaseInfo::getAge, healthBaseInfo.getAge());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getSex())) {
            chainWrapper.set(HealthBaseInfo::getSex, healthBaseInfo.getSex());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getLinkTel())) {
            chainWrapper.set(HealthBaseInfo::getLinkTel, healthBaseInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getMarryState())) {
            chainWrapper.set(HealthBaseInfo::getMarryState, healthBaseInfo.getMarryState());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getDegreeEducation())) {
            chainWrapper.set(HealthBaseInfo::getDegreeEducation, healthBaseInfo.getDegreeEducation());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getDisabilityType())) {
            chainWrapper.set(HealthBaseInfo::getDisabilityType, healthBaseInfo.getDisabilityType());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getMajorDiseases())) {
            chainWrapper.set(HealthBaseInfo::getMajorDiseases, healthBaseInfo.getMajorDiseases());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getMajorDiseasesName())) {
            chainWrapper.set(HealthBaseInfo::getMajorDiseasesName, healthBaseInfo.getMajorDiseasesName());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getMedicalCategory())) {
            chainWrapper.set(HealthBaseInfo::getMedicalCategory, healthBaseInfo.getMedicalCategory());
        }
        if (healthBaseInfo.getIsChildren() != null) {
            chainWrapper.set(HealthBaseInfo::getIsChildren, healthBaseInfo.getIsChildren());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getWorkUnit())) {
            chainWrapper.set(HealthBaseInfo::getWorkUnit, healthBaseInfo.getWorkUnit());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getCareer())) {
            chainWrapper.set(HealthBaseInfo::getCareer, healthBaseInfo.getCareer());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getFileCode())) {
            chainWrapper.set(HealthBaseInfo::getFileCode, healthBaseInfo.getFileCode());
        }
        if (healthBaseInfo.getFileDate() != null) {
            chainWrapper.set(HealthBaseInfo::getFileDate, healthBaseInfo.getFileDate());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getPutFileName())) {
            chainWrapper.set(HealthBaseInfo::getPutFileName, healthBaseInfo.getPutFileName());
        }
        if (healthBaseInfo.getHeight() != null) {
            chainWrapper.set(HealthBaseInfo::getHeight, healthBaseInfo.getHeight());
        }
        if (healthBaseInfo.getWeight() != null) {
            chainWrapper.set(HealthBaseInfo::getWeight, healthBaseInfo.getWeight());
        }
        if (healthBaseInfo.getWaist() != null) {
            chainWrapper.set(HealthBaseInfo::getWaist, healthBaseInfo.getWaist());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getExposureHistory())) {
            chainWrapper.set(HealthBaseInfo::getExposureHistory, healthBaseInfo.getExposureHistory());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getDrinkingHabits())) {
            chainWrapper.set(HealthBaseInfo::getDrinkingHabits, healthBaseInfo.getDrinkingHabits());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getSmokingHabits())) {
            chainWrapper.set(HealthBaseInfo::getSmokingHabits, healthBaseInfo.getSmokingHabits());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getAllergicHistory())) {
            chainWrapper.set(HealthBaseInfo::getAllergicHistory, healthBaseInfo.getAllergicHistory());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getDietaryHabit())) {
            chainWrapper.set(HealthBaseInfo::getDietaryHabit, healthBaseInfo.getDietaryHabit());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getSleepQuality())) {
            chainWrapper.set(HealthBaseInfo::getSleepQuality, healthBaseInfo.getSleepQuality());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getRelieveBowels())) {
            chainWrapper.set(HealthBaseInfo::getRelieveBowels, healthBaseInfo.getRelieveBowels());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getOperationNameOne())) {
            chainWrapper.set(HealthBaseInfo::getOperationNameOne, healthBaseInfo.getOperationNameOne());
        }
        if (healthBaseInfo.getOperationTimeOne() != null) {
            chainWrapper.set(HealthBaseInfo::getOperationTimeOne, healthBaseInfo.getOperationTimeOne());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getOperationNameTwo())) {
            chainWrapper.set(HealthBaseInfo::getOperationNameTwo, healthBaseInfo.getOperationNameTwo());
        }
        if (healthBaseInfo.getOperationTimeTwo() != null) {
            chainWrapper.set(HealthBaseInfo::getOperationTimeTwo, healthBaseInfo.getOperationTimeTwo());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getTraumaNameOne())) {
            chainWrapper.set(HealthBaseInfo::getTraumaNameOne, healthBaseInfo.getTraumaNameOne());
        }
        if (healthBaseInfo.getTraumaTimeOne() != null) {
            chainWrapper.set(HealthBaseInfo::getTraumaTimeOne, healthBaseInfo.getTraumaTimeOne());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getTraumaNameTwo())) {
            chainWrapper.set(HealthBaseInfo::getTraumaNameTwo, healthBaseInfo.getTraumaNameTwo());
        }
        if (healthBaseInfo.getTraumaTimeTwo() != null) {
            chainWrapper.set(HealthBaseInfo::getTraumaTimeTwo, healthBaseInfo.getTraumaTimeTwo());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getBloodNameOne())) {
            chainWrapper.set(HealthBaseInfo::getBloodNameOne, healthBaseInfo.getBloodNameOne());
        }
        if (healthBaseInfo.getBloodTimeOne() != null) {
            chainWrapper.set(HealthBaseInfo::getBloodTimeOne, healthBaseInfo.getBloodTimeOne());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getBloodNameTwo())) {
            chainWrapper.set(HealthBaseInfo::getBloodNameTwo, healthBaseInfo.getBloodNameTwo());
        }
        if (healthBaseInfo.getBloodTimeTwo() != null) {
            chainWrapper.set(HealthBaseInfo::getBloodTimeTwo, healthBaseInfo.getBloodTimeTwo());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getFatherDiseaseIds())) {
            chainWrapper.set(HealthBaseInfo::getFatherDiseaseIds, healthBaseInfo.getFatherDiseaseIds());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getMotherDiseaseIds())) {
            chainWrapper.set(HealthBaseInfo::getMotherDiseaseIds, healthBaseInfo.getMotherDiseaseIds());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getChildrenDiseaseIds())) {
            chainWrapper.set(HealthBaseInfo::getChildrenDiseaseIds, healthBaseInfo.getChildrenDiseaseIds());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getBrotherDiseaseIds())) {
            chainWrapper.set(HealthBaseInfo::getBrotherDiseaseIds, healthBaseInfo.getBrotherDiseaseIds());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getGeneticDisease())) {
            chainWrapper.set(HealthBaseInfo::getGeneticDisease, healthBaseInfo.getGeneticDisease());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getHealthGuidance())) {
            chainWrapper.set(HealthBaseInfo::getHealthGuidance, healthBaseInfo.getHealthGuidance());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getIntubationType())) {
            chainWrapper.set(HealthBaseInfo::getIntubationType, healthBaseInfo.getIntubationType());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getMemo())) {
            chainWrapper.set(HealthBaseInfo::getMemo, healthBaseInfo.getMemo());
        }
        if (healthBaseInfo.getAreaCode() != null) {
            chainWrapper.set(HealthBaseInfo::getAreaCode, healthBaseInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getAreaName())) {
            chainWrapper.set(HealthBaseInfo::getAreaName, healthBaseInfo.getAreaName());
        }
        if (healthBaseInfo.getCreateUser() != null) {
            chainWrapper.set(HealthBaseInfo::getCreateUser, healthBaseInfo.getCreateUser());
        }
        if (healthBaseInfo.getCreateDept() != null) {
            chainWrapper.set(HealthBaseInfo::getCreateDept, healthBaseInfo.getCreateDept());
        }
        if (healthBaseInfo.getCreateTime() != null) {
            chainWrapper.set(HealthBaseInfo::getCreateTime, healthBaseInfo.getCreateTime());
        }
        if (healthBaseInfo.getUpdateUser() != null) {
            chainWrapper.set(HealthBaseInfo::getUpdateUser, healthBaseInfo.getUpdateUser());
        }
        if (healthBaseInfo.getUpdateTime() != null) {
            chainWrapper.set(HealthBaseInfo::getUpdateTime, healthBaseInfo.getUpdateTime());
        }
        if (healthBaseInfo.getStatus() != null) {
            chainWrapper.set(HealthBaseInfo::getStatus, healthBaseInfo.getStatus());
        }
        if (healthBaseInfo.getIsDeleted() != null) {
            chainWrapper.set(HealthBaseInfo::getIsDeleted, healthBaseInfo.getIsDeleted());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getMajorDiseasesOther())) {
            chainWrapper.set(HealthBaseInfo::getMajorDiseasesOther, healthBaseInfo.getMajorDiseasesOther());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getPid())) {
            chainWrapper.set(HealthBaseInfo::getPid, healthBaseInfo.getPid());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getPvid())) {
            chainWrapper.set(HealthBaseInfo::getPvid, healthBaseInfo.getPvid());
        }
        if (StringUtil.isNotBlank(healthBaseInfo.getBloodType())) {
            chainWrapper.set(HealthBaseInfo::getBloodType, healthBaseInfo.getBloodType());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthBaseInfo::getId, healthBaseInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthBaseInfo.getId());
        } else {
            return healthBaseInfo;
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
    public boolean saveHealthBaseInfoBatch(List<HealthBaseInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthBaseInfo healthBaseInfo : insertList) {
            //使用默认的雪花算法生成
            healthBaseInfo.setId(null);
            //healthBaseInfo.setCreatedDt(currentDte);
            //healthBaseInfo.setUpdatedDt(currentDte);
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
    public Integer deleteHealthBaseInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthBaseInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


