package cn.pluss.platform.service.healthChronicDiseaseDetail.impl;

import cn.pluss.platform.mapper.HealthChronicDiseaseDetailMapper;
import cn.pluss.platform.model.entity.HealthChronicDiseaseDetail;
import cn.pluss.platform.service.healthChronicDiseaseDetail.HealthChronicDiseaseDetailService;
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
@Service("healthChronicDiseaseDetailService")
public class HealthChronicDiseaseDetailServiceImpl extends ServiceImpl< HealthChronicDiseaseDetailMapper, HealthChronicDiseaseDetail> implements HealthChronicDiseaseDetailService {
    private static final Logger logger = LoggerFactory.getLogger(HealthChronicDiseaseDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthChronicDiseaseDetail> queryPage(Map map) {
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
    public HealthChronicDiseaseDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthChronicDiseaseDetail 实例对象
    * @return 实例对象
    */
    @Override
    public HealthChronicDiseaseDetail queryOne(HealthChronicDiseaseDetail healthChronicDiseaseDetail){
        LambdaQueryWrapper<HealthChronicDiseaseDetail> queryWrapper = getQueryWrapper(healthChronicDiseaseDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthChronicDiseaseDetail
    * @return
    */
    @Override
    public List<HealthChronicDiseaseDetail> queryList(HealthChronicDiseaseDetail healthChronicDiseaseDetail) {
        LambdaQueryWrapper<HealthChronicDiseaseDetail> queryWrapper = getQueryWrapper(healthChronicDiseaseDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthChronicDiseaseDetail
    * @return
    */
    public static LambdaQueryWrapper<HealthChronicDiseaseDetail> getQueryWrapper(HealthChronicDiseaseDetail healthChronicDiseaseDetail){
        LambdaQueryWrapper<HealthChronicDiseaseDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (healthChronicDiseaseDetail.getId() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getId, healthChronicDiseaseDetail.getId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getTenantId())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getTenantId, healthChronicDiseaseDetail.getTenantId());
        }
        if (healthChronicDiseaseDetail.getCorpId() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getCorpId, healthChronicDiseaseDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getCorpName())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getCorpName, healthChronicDiseaseDetail.getCorpName());
        }
        if (healthChronicDiseaseDetail.getInstitutionId() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getInstitutionId, healthChronicDiseaseDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getInstitutionName())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getInstitutionName, healthChronicDiseaseDetail.getInstitutionName());
        }
        if (healthChronicDiseaseDetail.getArchiveId() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getArchiveId, healthChronicDiseaseDetail.getArchiveId());
        }
        if (healthChronicDiseaseDetail.getElderId() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getElderId, healthChronicDiseaseDetail.getElderId());
        }
        if (healthChronicDiseaseDetail.getDiseaseId() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getDiseaseId, healthChronicDiseaseDetail.getDiseaseId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getDiseaseName())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getDiseaseName, healthChronicDiseaseDetail.getDiseaseName());
        }
        if (healthChronicDiseaseDetail.getDiseaseLevelId() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getDiseaseLevelId, healthChronicDiseaseDetail.getDiseaseLevelId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getDiseaseLevelName())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getDiseaseLevelName, healthChronicDiseaseDetail.getDiseaseLevelName());
        }
        if (healthChronicDiseaseDetail.getDiagnosisDate() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getDiagnosisDate, healthChronicDiseaseDetail.getDiagnosisDate());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getDiagnosisHospital())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getDiagnosisHospital, healthChronicDiseaseDetail.getDiagnosisHospital());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getComplications())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getComplications, healthChronicDiseaseDetail.getComplications());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getMedicationAllergy())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getMedicationAllergy, healthChronicDiseaseDetail.getMedicationAllergy());
        }
        if (healthChronicDiseaseDetail.getLastTreatmentDate() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getLastTreatmentDate, healthChronicDiseaseDetail.getLastTreatmentDate());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getRemark())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getRemark, healthChronicDiseaseDetail.getRemark());
        }
        if (healthChronicDiseaseDetail.getCreateUser() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getCreateUser, healthChronicDiseaseDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDetail.getCreateName())) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getCreateName, healthChronicDiseaseDetail.getCreateName());
        }
        if (healthChronicDiseaseDetail.getCreateDept() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getCreateDept, healthChronicDiseaseDetail.getCreateDept());
        }
        if (healthChronicDiseaseDetail.getCreateTime() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getCreateTime, healthChronicDiseaseDetail.getCreateTime());
        }
        if (healthChronicDiseaseDetail.getUpdateUser() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getUpdateUser, healthChronicDiseaseDetail.getUpdateUser());
        }
        if (healthChronicDiseaseDetail.getUpdateTime() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getUpdateTime, healthChronicDiseaseDetail.getUpdateTime());
        }
        if (healthChronicDiseaseDetail.getIsDeleted() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getIsDeleted, healthChronicDiseaseDetail.getIsDeleted());
        }
        if (healthChronicDiseaseDetail.getStatus() != null) {
            queryWrapper.eq(HealthChronicDiseaseDetail::getStatus, healthChronicDiseaseDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthChronicDiseaseDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthChronicDiseaseDetail insert(HealthChronicDiseaseDetail healthChronicDiseaseDetail) {
        healthChronicDiseaseDetail.setId(null);
        getBaseMapper().insert(healthChronicDiseaseDetail);
        return healthChronicDiseaseDetail;
    }

    /**
    * 更新数据
    *
    * @param healthChronicDiseaseDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthChronicDiseaseDetail update(HealthChronicDiseaseDetail healthChronicDiseaseDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthChronicDiseaseDetail> chainWrapper = new LambdaUpdateChainWrapper<HealthChronicDiseaseDetail>(getBaseMapper());
        if (healthChronicDiseaseDetail.getId() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getId, healthChronicDiseaseDetail.getId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getTenantId())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getTenantId, healthChronicDiseaseDetail.getTenantId());
        }
        if (healthChronicDiseaseDetail.getCorpId() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getCorpId, healthChronicDiseaseDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getCorpName())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getCorpName, healthChronicDiseaseDetail.getCorpName());
        }
        if (healthChronicDiseaseDetail.getInstitutionId() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getInstitutionId, healthChronicDiseaseDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getInstitutionName())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getInstitutionName, healthChronicDiseaseDetail.getInstitutionName());
        }
        if (healthChronicDiseaseDetail.getArchiveId() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getArchiveId, healthChronicDiseaseDetail.getArchiveId());
        }
        if (healthChronicDiseaseDetail.getElderId() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getElderId, healthChronicDiseaseDetail.getElderId());
        }
        if (healthChronicDiseaseDetail.getDiseaseId() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getDiseaseId, healthChronicDiseaseDetail.getDiseaseId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getDiseaseName())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getDiseaseName, healthChronicDiseaseDetail.getDiseaseName());
        }
        if (healthChronicDiseaseDetail.getDiseaseLevelId() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getDiseaseLevelId, healthChronicDiseaseDetail.getDiseaseLevelId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getDiseaseLevelName())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getDiseaseLevelName, healthChronicDiseaseDetail.getDiseaseLevelName());
        }
        if (healthChronicDiseaseDetail.getDiagnosisDate() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getDiagnosisDate, healthChronicDiseaseDetail.getDiagnosisDate());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getDiagnosisHospital())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getDiagnosisHospital, healthChronicDiseaseDetail.getDiagnosisHospital());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getComplications())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getComplications, healthChronicDiseaseDetail.getComplications());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getMedicationAllergy())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getMedicationAllergy, healthChronicDiseaseDetail.getMedicationAllergy());
        }
        if (healthChronicDiseaseDetail.getLastTreatmentDate() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getLastTreatmentDate, healthChronicDiseaseDetail.getLastTreatmentDate());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getRemark())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getRemark, healthChronicDiseaseDetail.getRemark());
        }
        if (healthChronicDiseaseDetail.getCreateUser() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getCreateUser, healthChronicDiseaseDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDetail.getCreateName())) {
            chainWrapper.set(HealthChronicDiseaseDetail::getCreateName, healthChronicDiseaseDetail.getCreateName());
        }
        if (healthChronicDiseaseDetail.getCreateDept() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getCreateDept, healthChronicDiseaseDetail.getCreateDept());
        }
        if (healthChronicDiseaseDetail.getCreateTime() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getCreateTime, healthChronicDiseaseDetail.getCreateTime());
        }
        if (healthChronicDiseaseDetail.getUpdateUser() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getUpdateUser, healthChronicDiseaseDetail.getUpdateUser());
        }
        if (healthChronicDiseaseDetail.getUpdateTime() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getUpdateTime, healthChronicDiseaseDetail.getUpdateTime());
        }
        if (healthChronicDiseaseDetail.getIsDeleted() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getIsDeleted, healthChronicDiseaseDetail.getIsDeleted());
        }
        if (healthChronicDiseaseDetail.getStatus() != null) {
            chainWrapper.set(HealthChronicDiseaseDetail::getStatus, healthChronicDiseaseDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthChronicDiseaseDetail::getId, healthChronicDiseaseDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthChronicDiseaseDetail.getId());
        } else {
            return healthChronicDiseaseDetail;
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
    public boolean saveHealthChronicDiseaseDetailBatch(List<HealthChronicDiseaseDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthChronicDiseaseDetail healthChronicDiseaseDetail : insertList) {
            //使用默认的雪花算法生成
            healthChronicDiseaseDetail.setId(null);
            //healthChronicDiseaseDetail.setCreatedDt(currentDte);
            //healthChronicDiseaseDetail.setUpdatedDt(currentDte);
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
    public Integer deleteHealthChronicDiseaseDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthChronicDiseaseDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


