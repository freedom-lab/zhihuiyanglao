package cn.pluss.platform.service.healthDiseaseRecords.impl;

import cn.pluss.platform.mapper.HealthDiseaseRecordsMapper;
import cn.pluss.platform.model.entity.HealthDiseaseRecords;
import cn.pluss.platform.service.healthDiseaseRecords.HealthDiseaseRecordsService;
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
@Service("healthDiseaseRecordsService")
public class HealthDiseaseRecordsServiceImpl extends ServiceImpl< HealthDiseaseRecordsMapper, HealthDiseaseRecords> implements HealthDiseaseRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthDiseaseRecordsServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthDiseaseRecords> queryPage(Map map) {
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
    public HealthDiseaseRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthDiseaseRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthDiseaseRecords queryOne(HealthDiseaseRecords healthDiseaseRecords){
        LambdaQueryWrapper<HealthDiseaseRecords> queryWrapper = getQueryWrapper(healthDiseaseRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthDiseaseRecords
    * @return
    */
    @Override
    public List<HealthDiseaseRecords> queryList(HealthDiseaseRecords healthDiseaseRecords) {
        LambdaQueryWrapper<HealthDiseaseRecords> queryWrapper = getQueryWrapper(healthDiseaseRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthDiseaseRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthDiseaseRecords> getQueryWrapper(HealthDiseaseRecords healthDiseaseRecords){
        LambdaQueryWrapper<HealthDiseaseRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthDiseaseRecords.getId() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getId, healthDiseaseRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthDiseaseRecords.getTenantId())) {
            queryWrapper.eq(HealthDiseaseRecords::getTenantId, healthDiseaseRecords.getTenantId());
        }
        if (healthDiseaseRecords.getElderId() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getElderId, healthDiseaseRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthDiseaseRecords.getElderName())) {
            queryWrapper.eq(HealthDiseaseRecords::getElderName, healthDiseaseRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthDiseaseRecords.getIdCard())) {
            queryWrapper.eq(HealthDiseaseRecords::getIdCard, healthDiseaseRecords.getIdCard());
        }
        if (healthDiseaseRecords.getMedicalRecordId() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getMedicalRecordId, healthDiseaseRecords.getMedicalRecordId());
        }
        if (healthDiseaseRecords.getRecordTime() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getRecordTime, healthDiseaseRecords.getRecordTime());
        }
        if (StringUtil.isNotEmpty(healthDiseaseRecords.getDiseaseCharacteristic())) {
            queryWrapper.eq(HealthDiseaseRecords::getDiseaseCharacteristic, healthDiseaseRecords.getDiseaseCharacteristic());
        }
        if (StringUtil.isNotEmpty(healthDiseaseRecords.getPreliminaryDiagnosis())) {
            queryWrapper.eq(HealthDiseaseRecords::getPreliminaryDiagnosis, healthDiseaseRecords.getPreliminaryDiagnosis());
        }
        if (StringUtil.isNotEmpty(healthDiseaseRecords.getTreatmentPlan())) {
            queryWrapper.eq(HealthDiseaseRecords::getTreatmentPlan, healthDiseaseRecords.getTreatmentPlan());
        }
        if (StringUtil.isNotEmpty(healthDiseaseRecords.getDoctorName())) {
            queryWrapper.eq(HealthDiseaseRecords::getDoctorName, healthDiseaseRecords.getDoctorName());
        }
        if (StringUtil.isNotEmpty(healthDiseaseRecords.getImgPath())) {
            queryWrapper.eq(HealthDiseaseRecords::getImgPath, healthDiseaseRecords.getImgPath());
        }
        if (healthDiseaseRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getAreaCode, healthDiseaseRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthDiseaseRecords.getAreaName())) {
            queryWrapper.eq(HealthDiseaseRecords::getAreaName, healthDiseaseRecords.getAreaName());
        }
        if (healthDiseaseRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getCreateUser, healthDiseaseRecords.getCreateUser());
        }
        if (healthDiseaseRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getCreateDept, healthDiseaseRecords.getCreateDept());
        }
        if (healthDiseaseRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getCreateTime, healthDiseaseRecords.getCreateTime());
        }
        if (healthDiseaseRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getUpdateUser, healthDiseaseRecords.getUpdateUser());
        }
        if (healthDiseaseRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getUpdateTime, healthDiseaseRecords.getUpdateTime());
        }
        if (healthDiseaseRecords.getStatus() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getStatus, healthDiseaseRecords.getStatus());
        }
        if (healthDiseaseRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthDiseaseRecords::getIsDeleted, healthDiseaseRecords.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthDiseaseRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthDiseaseRecords insert(HealthDiseaseRecords healthDiseaseRecords) {
        healthDiseaseRecords.setId(null);
        getBaseMapper().insert(healthDiseaseRecords);
        return healthDiseaseRecords;
    }

    /**
    * 更新数据
    *
    * @param healthDiseaseRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthDiseaseRecords update(HealthDiseaseRecords healthDiseaseRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthDiseaseRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthDiseaseRecords>(getBaseMapper());
        if (healthDiseaseRecords.getId() != null) {
            chainWrapper.set(HealthDiseaseRecords::getId, healthDiseaseRecords.getId());
        }
        if (StringUtil.isNotBlank(healthDiseaseRecords.getTenantId())) {
            chainWrapper.set(HealthDiseaseRecords::getTenantId, healthDiseaseRecords.getTenantId());
        }
        if (healthDiseaseRecords.getElderId() != null) {
            chainWrapper.set(HealthDiseaseRecords::getElderId, healthDiseaseRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthDiseaseRecords.getElderName())) {
            chainWrapper.set(HealthDiseaseRecords::getElderName, healthDiseaseRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthDiseaseRecords.getIdCard())) {
            chainWrapper.set(HealthDiseaseRecords::getIdCard, healthDiseaseRecords.getIdCard());
        }
        if (healthDiseaseRecords.getMedicalRecordId() != null) {
            chainWrapper.set(HealthDiseaseRecords::getMedicalRecordId, healthDiseaseRecords.getMedicalRecordId());
        }
        if (healthDiseaseRecords.getRecordTime() != null) {
            chainWrapper.set(HealthDiseaseRecords::getRecordTime, healthDiseaseRecords.getRecordTime());
        }
        if (StringUtil.isNotBlank(healthDiseaseRecords.getDiseaseCharacteristic())) {
            chainWrapper.set(HealthDiseaseRecords::getDiseaseCharacteristic, healthDiseaseRecords.getDiseaseCharacteristic());
        }
        if (StringUtil.isNotBlank(healthDiseaseRecords.getPreliminaryDiagnosis())) {
            chainWrapper.set(HealthDiseaseRecords::getPreliminaryDiagnosis, healthDiseaseRecords.getPreliminaryDiagnosis());
        }
        if (StringUtil.isNotBlank(healthDiseaseRecords.getTreatmentPlan())) {
            chainWrapper.set(HealthDiseaseRecords::getTreatmentPlan, healthDiseaseRecords.getTreatmentPlan());
        }
        if (StringUtil.isNotBlank(healthDiseaseRecords.getDoctorName())) {
            chainWrapper.set(HealthDiseaseRecords::getDoctorName, healthDiseaseRecords.getDoctorName());
        }
        if (StringUtil.isNotBlank(healthDiseaseRecords.getImgPath())) {
            chainWrapper.set(HealthDiseaseRecords::getImgPath, healthDiseaseRecords.getImgPath());
        }
        if (healthDiseaseRecords.getAreaCode() != null) {
            chainWrapper.set(HealthDiseaseRecords::getAreaCode, healthDiseaseRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthDiseaseRecords.getAreaName())) {
            chainWrapper.set(HealthDiseaseRecords::getAreaName, healthDiseaseRecords.getAreaName());
        }
        if (healthDiseaseRecords.getCreateUser() != null) {
            chainWrapper.set(HealthDiseaseRecords::getCreateUser, healthDiseaseRecords.getCreateUser());
        }
        if (healthDiseaseRecords.getCreateDept() != null) {
            chainWrapper.set(HealthDiseaseRecords::getCreateDept, healthDiseaseRecords.getCreateDept());
        }
        if (healthDiseaseRecords.getCreateTime() != null) {
            chainWrapper.set(HealthDiseaseRecords::getCreateTime, healthDiseaseRecords.getCreateTime());
        }
        if (healthDiseaseRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthDiseaseRecords::getUpdateUser, healthDiseaseRecords.getUpdateUser());
        }
        if (healthDiseaseRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthDiseaseRecords::getUpdateTime, healthDiseaseRecords.getUpdateTime());
        }
        if (healthDiseaseRecords.getStatus() != null) {
            chainWrapper.set(HealthDiseaseRecords::getStatus, healthDiseaseRecords.getStatus());
        }
        if (healthDiseaseRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthDiseaseRecords::getIsDeleted, healthDiseaseRecords.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthDiseaseRecords::getId, healthDiseaseRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthDiseaseRecords.getId());
        } else {
            return healthDiseaseRecords;
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
    public boolean saveHealthDiseaseRecordsBatch(List<HealthDiseaseRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthDiseaseRecords healthDiseaseRecords : insertList) {
            //使用默认的雪花算法生成
            healthDiseaseRecords.setId(null);
            //healthDiseaseRecords.setCreatedDt(currentDte);
            //healthDiseaseRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthDiseaseRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthDiseaseRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


