package cn.pluss.platform.service.healthChronicDiseaseArchive.impl;

import cn.pluss.platform.mapper.HealthChronicDiseaseArchiveMapper;
import cn.pluss.platform.model.entity.HealthChronicDiseaseArchive;
import cn.pluss.platform.service.healthChronicDiseaseArchive.HealthChronicDiseaseArchiveService;
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
@Service("healthChronicDiseaseArchiveService")
public class HealthChronicDiseaseArchiveServiceImpl extends ServiceImpl< HealthChronicDiseaseArchiveMapper, HealthChronicDiseaseArchive> implements HealthChronicDiseaseArchiveService {
    private static final Logger logger = LoggerFactory.getLogger(HealthChronicDiseaseArchiveServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthChronicDiseaseArchive> queryPage(Map map) {
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
    public HealthChronicDiseaseArchive queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthChronicDiseaseArchive 实例对象
    * @return 实例对象
    */
    @Override
    public HealthChronicDiseaseArchive queryOne(HealthChronicDiseaseArchive healthChronicDiseaseArchive){
        LambdaQueryWrapper<HealthChronicDiseaseArchive> queryWrapper = getQueryWrapper(healthChronicDiseaseArchive);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthChronicDiseaseArchive
    * @return
    */
    @Override
    public List<HealthChronicDiseaseArchive> queryList(HealthChronicDiseaseArchive healthChronicDiseaseArchive) {
        LambdaQueryWrapper<HealthChronicDiseaseArchive> queryWrapper = getQueryWrapper(healthChronicDiseaseArchive);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthChronicDiseaseArchive
    * @return
    */
    public static LambdaQueryWrapper<HealthChronicDiseaseArchive> getQueryWrapper(HealthChronicDiseaseArchive healthChronicDiseaseArchive){
        LambdaQueryWrapper<HealthChronicDiseaseArchive> queryWrapper = new LambdaQueryWrapper<>();
        if (healthChronicDiseaseArchive.getId() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getId, healthChronicDiseaseArchive.getId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getTenantId())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getTenantId, healthChronicDiseaseArchive.getTenantId());
        }
        if (healthChronicDiseaseArchive.getCorpId() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getCorpId, healthChronicDiseaseArchive.getCorpId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getCorpName())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getCorpName, healthChronicDiseaseArchive.getCorpName());
        }
        if (healthChronicDiseaseArchive.getInstitutionId() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getInstitutionId, healthChronicDiseaseArchive.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getInstitutionName())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getInstitutionName, healthChronicDiseaseArchive.getInstitutionName());
        }
        if (healthChronicDiseaseArchive.getDoctorId() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getDoctorId, healthChronicDiseaseArchive.getDoctorId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getDoctorName())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getDoctorName, healthChronicDiseaseArchive.getDoctorName());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getArchiveNo())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getArchiveNo, healthChronicDiseaseArchive.getArchiveNo());
        }
        if (healthChronicDiseaseArchive.getEstablishDate() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getEstablishDate, healthChronicDiseaseArchive.getEstablishDate());
        }
        if (healthChronicDiseaseArchive.getElderId() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getElderId, healthChronicDiseaseArchive.getElderId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getElderName())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getElderName, healthChronicDiseaseArchive.getElderName());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getIdCard())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getIdCard, healthChronicDiseaseArchive.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getSex())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getSex, healthChronicDiseaseArchive.getSex());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getBirthDate())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getBirthDate, healthChronicDiseaseArchive.getBirthDate());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getMedicalCategory())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getMedicalCategory, healthChronicDiseaseArchive.getMedicalCategory());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getMedicalCardNumber())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getMedicalCardNumber, healthChronicDiseaseArchive.getMedicalCardNumber());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getDiseaseIds())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getDiseaseIds, healthChronicDiseaseArchive.getDiseaseIds());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getDiseaseNames())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getDiseaseNames, healthChronicDiseaseArchive.getDiseaseNames());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getSmokingStatus())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getSmokingStatus, healthChronicDiseaseArchive.getSmokingStatus());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getDrinkingStatus())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getDrinkingStatus, healthChronicDiseaseArchive.getDrinkingStatus());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getDietHabits())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getDietHabits, healthChronicDiseaseArchive.getDietHabits());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getExerciseHabits())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getExerciseHabits, healthChronicDiseaseArchive.getExerciseHabits());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getSleepCondition())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getSleepCondition, healthChronicDiseaseArchive.getSleepCondition());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getDrugAllergyHistory())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getDrugAllergyHistory, healthChronicDiseaseArchive.getDrugAllergyHistory());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getMajorDiseaseHistory())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getMajorDiseaseHistory, healthChronicDiseaseArchive.getMajorDiseaseHistory());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getFamilyMedicalHistory())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getFamilyMedicalHistory, healthChronicDiseaseArchive.getFamilyMedicalHistory());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getPastReferralRecords())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getPastReferralRecords, healthChronicDiseaseArchive.getPastReferralRecords());
        }
        if (healthChronicDiseaseArchive.getRiskLevel() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getRiskLevel, healthChronicDiseaseArchive.getRiskLevel());
        }
        if (healthChronicDiseaseArchive.getControlStatus() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getControlStatus, healthChronicDiseaseArchive.getControlStatus());
        }
        if (healthChronicDiseaseArchive.getFollowUpCycle() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getFollowUpCycle, healthChronicDiseaseArchive.getFollowUpCycle());
        }
        if (healthChronicDiseaseArchive.getSignState() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getSignState, healthChronicDiseaseArchive.getSignState());
        }
        if (healthChronicDiseaseArchive.getSignDate() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getSignDate, healthChronicDiseaseArchive.getSignDate());
        }
        if (healthChronicDiseaseArchive.getSignDoctorId() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getSignDoctorId, healthChronicDiseaseArchive.getSignDoctorId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getSignDoctorName())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getSignDoctorName, healthChronicDiseaseArchive.getSignDoctorName());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getRemark())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getRemark, healthChronicDiseaseArchive.getRemark());
        }
        if (healthChronicDiseaseArchive.getCreateUser() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getCreateUser, healthChronicDiseaseArchive.getCreateUser());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseArchive.getCreateName())) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getCreateName, healthChronicDiseaseArchive.getCreateName());
        }
        if (healthChronicDiseaseArchive.getCreateDept() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getCreateDept, healthChronicDiseaseArchive.getCreateDept());
        }
        if (healthChronicDiseaseArchive.getCreateTime() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getCreateTime, healthChronicDiseaseArchive.getCreateTime());
        }
        if (healthChronicDiseaseArchive.getUpdateUser() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getUpdateUser, healthChronicDiseaseArchive.getUpdateUser());
        }
        if (healthChronicDiseaseArchive.getUpdateTime() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getUpdateTime, healthChronicDiseaseArchive.getUpdateTime());
        }
        if (healthChronicDiseaseArchive.getIsDeleted() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getIsDeleted, healthChronicDiseaseArchive.getIsDeleted());
        }
        if (healthChronicDiseaseArchive.getStatus() != null) {
            queryWrapper.eq(HealthChronicDiseaseArchive::getStatus, healthChronicDiseaseArchive.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthChronicDiseaseArchive 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthChronicDiseaseArchive insert(HealthChronicDiseaseArchive healthChronicDiseaseArchive) {
        healthChronicDiseaseArchive.setId(null);
        getBaseMapper().insert(healthChronicDiseaseArchive);
        return healthChronicDiseaseArchive;
    }

    /**
    * 更新数据
    *
    * @param healthChronicDiseaseArchive 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthChronicDiseaseArchive update(HealthChronicDiseaseArchive healthChronicDiseaseArchive) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthChronicDiseaseArchive> chainWrapper = new LambdaUpdateChainWrapper<HealthChronicDiseaseArchive>(getBaseMapper());
        if (healthChronicDiseaseArchive.getId() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getId, healthChronicDiseaseArchive.getId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getTenantId())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getTenantId, healthChronicDiseaseArchive.getTenantId());
        }
        if (healthChronicDiseaseArchive.getCorpId() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getCorpId, healthChronicDiseaseArchive.getCorpId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getCorpName())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getCorpName, healthChronicDiseaseArchive.getCorpName());
        }
        if (healthChronicDiseaseArchive.getInstitutionId() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getInstitutionId, healthChronicDiseaseArchive.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getInstitutionName())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getInstitutionName, healthChronicDiseaseArchive.getInstitutionName());
        }
        if (healthChronicDiseaseArchive.getDoctorId() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getDoctorId, healthChronicDiseaseArchive.getDoctorId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getDoctorName())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getDoctorName, healthChronicDiseaseArchive.getDoctorName());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getArchiveNo())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getArchiveNo, healthChronicDiseaseArchive.getArchiveNo());
        }
        if (healthChronicDiseaseArchive.getEstablishDate() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getEstablishDate, healthChronicDiseaseArchive.getEstablishDate());
        }
        if (healthChronicDiseaseArchive.getElderId() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getElderId, healthChronicDiseaseArchive.getElderId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getElderName())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getElderName, healthChronicDiseaseArchive.getElderName());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getIdCard())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getIdCard, healthChronicDiseaseArchive.getIdCard());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getSex())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getSex, healthChronicDiseaseArchive.getSex());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getBirthDate())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getBirthDate, healthChronicDiseaseArchive.getBirthDate());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getMedicalCategory())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getMedicalCategory, healthChronicDiseaseArchive.getMedicalCategory());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getMedicalCardNumber())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getMedicalCardNumber, healthChronicDiseaseArchive.getMedicalCardNumber());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getDiseaseIds())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getDiseaseIds, healthChronicDiseaseArchive.getDiseaseIds());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getDiseaseNames())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getDiseaseNames, healthChronicDiseaseArchive.getDiseaseNames());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getSmokingStatus())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getSmokingStatus, healthChronicDiseaseArchive.getSmokingStatus());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getDrinkingStatus())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getDrinkingStatus, healthChronicDiseaseArchive.getDrinkingStatus());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getDietHabits())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getDietHabits, healthChronicDiseaseArchive.getDietHabits());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getExerciseHabits())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getExerciseHabits, healthChronicDiseaseArchive.getExerciseHabits());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getSleepCondition())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getSleepCondition, healthChronicDiseaseArchive.getSleepCondition());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getDrugAllergyHistory())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getDrugAllergyHistory, healthChronicDiseaseArchive.getDrugAllergyHistory());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getMajorDiseaseHistory())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getMajorDiseaseHistory, healthChronicDiseaseArchive.getMajorDiseaseHistory());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getFamilyMedicalHistory())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getFamilyMedicalHistory, healthChronicDiseaseArchive.getFamilyMedicalHistory());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getPastReferralRecords())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getPastReferralRecords, healthChronicDiseaseArchive.getPastReferralRecords());
        }
        if (healthChronicDiseaseArchive.getRiskLevel() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getRiskLevel, healthChronicDiseaseArchive.getRiskLevel());
        }
        if (healthChronicDiseaseArchive.getControlStatus() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getControlStatus, healthChronicDiseaseArchive.getControlStatus());
        }
        if (healthChronicDiseaseArchive.getFollowUpCycle() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getFollowUpCycle, healthChronicDiseaseArchive.getFollowUpCycle());
        }
        if (healthChronicDiseaseArchive.getSignState() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getSignState, healthChronicDiseaseArchive.getSignState());
        }
        if (healthChronicDiseaseArchive.getSignDate() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getSignDate, healthChronicDiseaseArchive.getSignDate());
        }
        if (healthChronicDiseaseArchive.getSignDoctorId() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getSignDoctorId, healthChronicDiseaseArchive.getSignDoctorId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getSignDoctorName())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getSignDoctorName, healthChronicDiseaseArchive.getSignDoctorName());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getRemark())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getRemark, healthChronicDiseaseArchive.getRemark());
        }
        if (healthChronicDiseaseArchive.getCreateUser() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getCreateUser, healthChronicDiseaseArchive.getCreateUser());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseArchive.getCreateName())) {
            chainWrapper.set(HealthChronicDiseaseArchive::getCreateName, healthChronicDiseaseArchive.getCreateName());
        }
        if (healthChronicDiseaseArchive.getCreateDept() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getCreateDept, healthChronicDiseaseArchive.getCreateDept());
        }
        if (healthChronicDiseaseArchive.getCreateTime() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getCreateTime, healthChronicDiseaseArchive.getCreateTime());
        }
        if (healthChronicDiseaseArchive.getUpdateUser() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getUpdateUser, healthChronicDiseaseArchive.getUpdateUser());
        }
        if (healthChronicDiseaseArchive.getUpdateTime() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getUpdateTime, healthChronicDiseaseArchive.getUpdateTime());
        }
        if (healthChronicDiseaseArchive.getIsDeleted() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getIsDeleted, healthChronicDiseaseArchive.getIsDeleted());
        }
        if (healthChronicDiseaseArchive.getStatus() != null) {
            chainWrapper.set(HealthChronicDiseaseArchive::getStatus, healthChronicDiseaseArchive.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthChronicDiseaseArchive::getId, healthChronicDiseaseArchive.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthChronicDiseaseArchive.getId());
        } else {
            return healthChronicDiseaseArchive;
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
    public boolean saveHealthChronicDiseaseArchiveBatch(List<HealthChronicDiseaseArchive> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthChronicDiseaseArchive healthChronicDiseaseArchive : insertList) {
            //使用默认的雪花算法生成
            healthChronicDiseaseArchive.setId(null);
            //healthChronicDiseaseArchive.setCreatedDt(currentDte);
            //healthChronicDiseaseArchive.setUpdatedDt(currentDte);
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
    public Integer deleteHealthChronicDiseaseArchiveBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthChronicDiseaseArchive> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


