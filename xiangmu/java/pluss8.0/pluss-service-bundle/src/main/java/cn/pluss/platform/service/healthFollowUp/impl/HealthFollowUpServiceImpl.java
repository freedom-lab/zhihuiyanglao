package cn.pluss.platform.service.healthFollowUp.impl;

import cn.pluss.platform.mapper.HealthFollowUpMapper;
import cn.pluss.platform.model.entity.HealthFollowUp;
import cn.pluss.platform.service.healthFollowUp.HealthFollowUpService;
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
@Service("healthFollowUpService")
public class HealthFollowUpServiceImpl extends ServiceImpl< HealthFollowUpMapper, HealthFollowUp> implements HealthFollowUpService {
    private static final Logger logger = LoggerFactory.getLogger(HealthFollowUpServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthFollowUp> queryPage(Map map) {
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
    public HealthFollowUp queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthFollowUp 实例对象
    * @return 实例对象
    */
    @Override
    public HealthFollowUp queryOne(HealthFollowUp healthFollowUp){
        LambdaQueryWrapper<HealthFollowUp> queryWrapper = getQueryWrapper(healthFollowUp);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthFollowUp
    * @return
    */
    @Override
    public List<HealthFollowUp> queryList(HealthFollowUp healthFollowUp) {
        LambdaQueryWrapper<HealthFollowUp> queryWrapper = getQueryWrapper(healthFollowUp);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthFollowUp
    * @return
    */
    public static LambdaQueryWrapper<HealthFollowUp> getQueryWrapper(HealthFollowUp healthFollowUp){
        LambdaQueryWrapper<HealthFollowUp> queryWrapper = new LambdaQueryWrapper<>();
        if (healthFollowUp.getId() != null) {
            queryWrapper.eq(HealthFollowUp::getId, healthFollowUp.getId());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getTenantId())) {
            queryWrapper.eq(HealthFollowUp::getTenantId, healthFollowUp.getTenantId());
        }
        if (healthFollowUp.getCorpId() != null) {
            queryWrapper.eq(HealthFollowUp::getCorpId, healthFollowUp.getCorpId());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getCorpName())) {
            queryWrapper.eq(HealthFollowUp::getCorpName, healthFollowUp.getCorpName());
        }
        if (healthFollowUp.getInstitutionId() != null) {
            queryWrapper.eq(HealthFollowUp::getInstitutionId, healthFollowUp.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getInstitutionName())) {
            queryWrapper.eq(HealthFollowUp::getInstitutionName, healthFollowUp.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getFollowUpNo())) {
            queryWrapper.eq(HealthFollowUp::getFollowUpNo, healthFollowUp.getFollowUpNo());
        }
        if (healthFollowUp.getArchiveId() != null) {
            queryWrapper.eq(HealthFollowUp::getArchiveId, healthFollowUp.getArchiveId());
        }
        if (healthFollowUp.getElderId() != null) {
            queryWrapper.eq(HealthFollowUp::getElderId, healthFollowUp.getElderId());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getElderName())) {
            queryWrapper.eq(HealthFollowUp::getElderName, healthFollowUp.getElderName());
        }
        if (healthFollowUp.getDoctorId() != null) {
            queryWrapper.eq(HealthFollowUp::getDoctorId, healthFollowUp.getDoctorId());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getDoctorName())) {
            queryWrapper.eq(HealthFollowUp::getDoctorName, healthFollowUp.getDoctorName());
        }
        if (healthFollowUp.getFollowUpDate() != null) {
            queryWrapper.eq(HealthFollowUp::getFollowUpDate, healthFollowUp.getFollowUpDate());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getFollowUpType())) {
            queryWrapper.eq(HealthFollowUp::getFollowUpType, healthFollowUp.getFollowUpType());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getSymptomsSigns())) {
            queryWrapper.eq(HealthFollowUp::getSymptomsSigns, healthFollowUp.getSymptomsSigns());
        }
        if (healthFollowUp.getBloodPressureSys() != null) {
            queryWrapper.eq(HealthFollowUp::getBloodPressureSys, healthFollowUp.getBloodPressureSys());
        }
        if (healthFollowUp.getBloodPressureDia() != null) {
            queryWrapper.eq(HealthFollowUp::getBloodPressureDia, healthFollowUp.getBloodPressureDia());
        }
        if (healthFollowUp.getBloodSugarFasting() != null) {
            queryWrapper.eq(HealthFollowUp::getBloodSugarFasting, healthFollowUp.getBloodSugarFasting());
        }
        if (healthFollowUp.getBloodSugarPostprandial() != null) {
            queryWrapper.eq(HealthFollowUp::getBloodSugarPostprandial, healthFollowUp.getBloodSugarPostprandial());
        }
        if (healthFollowUp.getHeartRate() != null) {
            queryWrapper.eq(HealthFollowUp::getHeartRate, healthFollowUp.getHeartRate());
        }
        if (healthFollowUp.getWeight() != null) {
            queryWrapper.eq(HealthFollowUp::getWeight, healthFollowUp.getWeight());
        }
        if (healthFollowUp.getMedicationAdherence() != null) {
            queryWrapper.eq(HealthFollowUp::getMedicationAdherence, healthFollowUp.getMedicationAdherence());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getPlanExecution())) {
            queryWrapper.eq(HealthFollowUp::getPlanExecution, healthFollowUp.getPlanExecution());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getExistingProblems())) {
            queryWrapper.eq(HealthFollowUp::getExistingProblems, healthFollowUp.getExistingProblems());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getTreatmentAdvice())) {
            queryWrapper.eq(HealthFollowUp::getTreatmentAdvice, healthFollowUp.getTreatmentAdvice());
        }
        if (healthFollowUp.getControlStatus() != null) {
            queryWrapper.eq(HealthFollowUp::getControlStatus, healthFollowUp.getControlStatus());
        }
        if (healthFollowUp.getRiskLevel() != null) {
            queryWrapper.eq(HealthFollowUp::getRiskLevel, healthFollowUp.getRiskLevel());
        }
        if (healthFollowUp.getNextFollowUpDate() != null) {
            queryWrapper.eq(HealthFollowUp::getNextFollowUpDate, healthFollowUp.getNextFollowUpDate());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getFilePath())) {
            queryWrapper.eq(HealthFollowUp::getFilePath, healthFollowUp.getFilePath());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getRemark())) {
            queryWrapper.eq(HealthFollowUp::getRemark, healthFollowUp.getRemark());
        }
        if (healthFollowUp.getCreateUser() != null) {
            queryWrapper.eq(HealthFollowUp::getCreateUser, healthFollowUp.getCreateUser());
        }
        if (StringUtil.isNotEmpty(healthFollowUp.getCreateName())) {
            queryWrapper.eq(HealthFollowUp::getCreateName, healthFollowUp.getCreateName());
        }
        if (healthFollowUp.getCreateDept() != null) {
            queryWrapper.eq(HealthFollowUp::getCreateDept, healthFollowUp.getCreateDept());
        }
        if (healthFollowUp.getCreateTime() != null) {
            queryWrapper.eq(HealthFollowUp::getCreateTime, healthFollowUp.getCreateTime());
        }
        if (healthFollowUp.getUpdateUser() != null) {
            queryWrapper.eq(HealthFollowUp::getUpdateUser, healthFollowUp.getUpdateUser());
        }
        if (healthFollowUp.getUpdateTime() != null) {
            queryWrapper.eq(HealthFollowUp::getUpdateTime, healthFollowUp.getUpdateTime());
        }
        if (healthFollowUp.getIsDeleted() != null) {
            queryWrapper.eq(HealthFollowUp::getIsDeleted, healthFollowUp.getIsDeleted());
        }
        if (healthFollowUp.getStatus() != null) {
            queryWrapper.eq(HealthFollowUp::getStatus, healthFollowUp.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthFollowUp 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthFollowUp insert(HealthFollowUp healthFollowUp) {
        healthFollowUp.setId(null);
        getBaseMapper().insert(healthFollowUp);
        return healthFollowUp;
    }

    /**
    * 更新数据
    *
    * @param healthFollowUp 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthFollowUp update(HealthFollowUp healthFollowUp) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthFollowUp> chainWrapper = new LambdaUpdateChainWrapper<HealthFollowUp>(getBaseMapper());
        if (healthFollowUp.getId() != null) {
            chainWrapper.set(HealthFollowUp::getId, healthFollowUp.getId());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getTenantId())) {
            chainWrapper.set(HealthFollowUp::getTenantId, healthFollowUp.getTenantId());
        }
        if (healthFollowUp.getCorpId() != null) {
            chainWrapper.set(HealthFollowUp::getCorpId, healthFollowUp.getCorpId());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getCorpName())) {
            chainWrapper.set(HealthFollowUp::getCorpName, healthFollowUp.getCorpName());
        }
        if (healthFollowUp.getInstitutionId() != null) {
            chainWrapper.set(HealthFollowUp::getInstitutionId, healthFollowUp.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getInstitutionName())) {
            chainWrapper.set(HealthFollowUp::getInstitutionName, healthFollowUp.getInstitutionName());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getFollowUpNo())) {
            chainWrapper.set(HealthFollowUp::getFollowUpNo, healthFollowUp.getFollowUpNo());
        }
        if (healthFollowUp.getArchiveId() != null) {
            chainWrapper.set(HealthFollowUp::getArchiveId, healthFollowUp.getArchiveId());
        }
        if (healthFollowUp.getElderId() != null) {
            chainWrapper.set(HealthFollowUp::getElderId, healthFollowUp.getElderId());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getElderName())) {
            chainWrapper.set(HealthFollowUp::getElderName, healthFollowUp.getElderName());
        }
        if (healthFollowUp.getDoctorId() != null) {
            chainWrapper.set(HealthFollowUp::getDoctorId, healthFollowUp.getDoctorId());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getDoctorName())) {
            chainWrapper.set(HealthFollowUp::getDoctorName, healthFollowUp.getDoctorName());
        }
        if (healthFollowUp.getFollowUpDate() != null) {
            chainWrapper.set(HealthFollowUp::getFollowUpDate, healthFollowUp.getFollowUpDate());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getFollowUpType())) {
            chainWrapper.set(HealthFollowUp::getFollowUpType, healthFollowUp.getFollowUpType());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getSymptomsSigns())) {
            chainWrapper.set(HealthFollowUp::getSymptomsSigns, healthFollowUp.getSymptomsSigns());
        }
        if (healthFollowUp.getBloodPressureSys() != null) {
            chainWrapper.set(HealthFollowUp::getBloodPressureSys, healthFollowUp.getBloodPressureSys());
        }
        if (healthFollowUp.getBloodPressureDia() != null) {
            chainWrapper.set(HealthFollowUp::getBloodPressureDia, healthFollowUp.getBloodPressureDia());
        }
        if (healthFollowUp.getBloodSugarFasting() != null) {
            chainWrapper.set(HealthFollowUp::getBloodSugarFasting, healthFollowUp.getBloodSugarFasting());
        }
        if (healthFollowUp.getBloodSugarPostprandial() != null) {
            chainWrapper.set(HealthFollowUp::getBloodSugarPostprandial, healthFollowUp.getBloodSugarPostprandial());
        }
        if (healthFollowUp.getHeartRate() != null) {
            chainWrapper.set(HealthFollowUp::getHeartRate, healthFollowUp.getHeartRate());
        }
        if (healthFollowUp.getWeight() != null) {
            chainWrapper.set(HealthFollowUp::getWeight, healthFollowUp.getWeight());
        }
        if (healthFollowUp.getMedicationAdherence() != null) {
            chainWrapper.set(HealthFollowUp::getMedicationAdherence, healthFollowUp.getMedicationAdherence());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getPlanExecution())) {
            chainWrapper.set(HealthFollowUp::getPlanExecution, healthFollowUp.getPlanExecution());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getExistingProblems())) {
            chainWrapper.set(HealthFollowUp::getExistingProblems, healthFollowUp.getExistingProblems());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getTreatmentAdvice())) {
            chainWrapper.set(HealthFollowUp::getTreatmentAdvice, healthFollowUp.getTreatmentAdvice());
        }
        if (healthFollowUp.getControlStatus() != null) {
            chainWrapper.set(HealthFollowUp::getControlStatus, healthFollowUp.getControlStatus());
        }
        if (healthFollowUp.getRiskLevel() != null) {
            chainWrapper.set(HealthFollowUp::getRiskLevel, healthFollowUp.getRiskLevel());
        }
        if (healthFollowUp.getNextFollowUpDate() != null) {
            chainWrapper.set(HealthFollowUp::getNextFollowUpDate, healthFollowUp.getNextFollowUpDate());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getFilePath())) {
            chainWrapper.set(HealthFollowUp::getFilePath, healthFollowUp.getFilePath());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getRemark())) {
            chainWrapper.set(HealthFollowUp::getRemark, healthFollowUp.getRemark());
        }
        if (healthFollowUp.getCreateUser() != null) {
            chainWrapper.set(HealthFollowUp::getCreateUser, healthFollowUp.getCreateUser());
        }
        if (StringUtil.isNotBlank(healthFollowUp.getCreateName())) {
            chainWrapper.set(HealthFollowUp::getCreateName, healthFollowUp.getCreateName());
        }
        if (healthFollowUp.getCreateDept() != null) {
            chainWrapper.set(HealthFollowUp::getCreateDept, healthFollowUp.getCreateDept());
        }
        if (healthFollowUp.getCreateTime() != null) {
            chainWrapper.set(HealthFollowUp::getCreateTime, healthFollowUp.getCreateTime());
        }
        if (healthFollowUp.getUpdateUser() != null) {
            chainWrapper.set(HealthFollowUp::getUpdateUser, healthFollowUp.getUpdateUser());
        }
        if (healthFollowUp.getUpdateTime() != null) {
            chainWrapper.set(HealthFollowUp::getUpdateTime, healthFollowUp.getUpdateTime());
        }
        if (healthFollowUp.getIsDeleted() != null) {
            chainWrapper.set(HealthFollowUp::getIsDeleted, healthFollowUp.getIsDeleted());
        }
        if (healthFollowUp.getStatus() != null) {
            chainWrapper.set(HealthFollowUp::getStatus, healthFollowUp.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthFollowUp::getId, healthFollowUp.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthFollowUp.getId());
        } else {
            return healthFollowUp;
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
    public boolean saveHealthFollowUpBatch(List<HealthFollowUp> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthFollowUp healthFollowUp : insertList) {
            //使用默认的雪花算法生成
            healthFollowUp.setId(null);
            //healthFollowUp.setCreatedDt(currentDte);
            //healthFollowUp.setUpdatedDt(currentDte);
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
    public Integer deleteHealthFollowUpBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthFollowUp> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


