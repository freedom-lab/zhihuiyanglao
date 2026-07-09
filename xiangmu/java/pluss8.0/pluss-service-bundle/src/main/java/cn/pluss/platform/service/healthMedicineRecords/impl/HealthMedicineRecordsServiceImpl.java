package cn.pluss.platform.service.healthMedicineRecords.impl;

import cn.pluss.platform.mapper.HealthMedicineRecordsMapper;
import cn.pluss.platform.model.entity.HealthMedicineRecords;
import cn.pluss.platform.service.healthMedicineRecords.HealthMedicineRecordsService;
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
@Service("healthMedicineRecordsService")
public class HealthMedicineRecordsServiceImpl extends ServiceImpl< HealthMedicineRecordsMapper, HealthMedicineRecords> implements HealthMedicineRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthMedicineRecordsServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthMedicineRecords> queryPage(Map map) {
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
    public HealthMedicineRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthMedicineRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthMedicineRecords queryOne(HealthMedicineRecords healthMedicineRecords){
        LambdaQueryWrapper<HealthMedicineRecords> queryWrapper = getQueryWrapper(healthMedicineRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthMedicineRecords
    * @return
    */
    @Override
    public List<HealthMedicineRecords> queryList(HealthMedicineRecords healthMedicineRecords) {
        LambdaQueryWrapper<HealthMedicineRecords> queryWrapper = getQueryWrapper(healthMedicineRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthMedicineRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthMedicineRecords> getQueryWrapper(HealthMedicineRecords healthMedicineRecords){
        LambdaQueryWrapper<HealthMedicineRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthMedicineRecords.getId() != null) {
            queryWrapper.eq(HealthMedicineRecords::getId, healthMedicineRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getTenantId())) {
            queryWrapper.eq(HealthMedicineRecords::getTenantId, healthMedicineRecords.getTenantId());
        }
        if (healthMedicineRecords.getCorpId() != null) {
            queryWrapper.eq(HealthMedicineRecords::getCorpId, healthMedicineRecords.getCorpId());
        }
        if (healthMedicineRecords.getInstitutionId() != null) {
            queryWrapper.eq(HealthMedicineRecords::getInstitutionId, healthMedicineRecords.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getInstitutionName())) {
            queryWrapper.eq(HealthMedicineRecords::getInstitutionName, healthMedicineRecords.getInstitutionName());
        }
        if (healthMedicineRecords.getElderId() != null) {
            queryWrapper.eq(HealthMedicineRecords::getElderId, healthMedicineRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getElderName())) {
            queryWrapper.eq(HealthMedicineRecords::getElderName, healthMedicineRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getIdCard())) {
            queryWrapper.eq(HealthMedicineRecords::getIdCard, healthMedicineRecords.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getDrugName())) {
            queryWrapper.eq(HealthMedicineRecords::getDrugName, healthMedicineRecords.getDrugName());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getUseType())) {
            queryWrapper.eq(HealthMedicineRecords::getUseType, healthMedicineRecords.getUseType());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getDrugFrequencyUnit())) {
            queryWrapper.eq(HealthMedicineRecords::getDrugFrequencyUnit, healthMedicineRecords.getDrugFrequencyUnit());
        }
        if (healthMedicineRecords.getDrugFrequency() != null) {
            queryWrapper.eq(HealthMedicineRecords::getDrugFrequency, healthMedicineRecords.getDrugFrequency());
        }
        if (healthMedicineRecords.getDrugDosage() != null) {
            queryWrapper.eq(HealthMedicineRecords::getDrugDosage, healthMedicineRecords.getDrugDosage());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getDrugUnit())) {
            queryWrapper.eq(HealthMedicineRecords::getDrugUnit, healthMedicineRecords.getDrugUnit());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getDrugRemark())) {
            queryWrapper.eq(HealthMedicineRecords::getDrugRemark, healthMedicineRecords.getDrugRemark());
        }
        if (healthMedicineRecords.getStartDate() != null) {
            queryWrapper.eq(HealthMedicineRecords::getStartDate, healthMedicineRecords.getStartDate());
        }
        if (healthMedicineRecords.getEndDate() != null) {
            queryWrapper.eq(HealthMedicineRecords::getEndDate, healthMedicineRecords.getEndDate());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getCompliance())) {
            queryWrapper.eq(HealthMedicineRecords::getCompliance, healthMedicineRecords.getCompliance());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getEffectDesp())) {
            queryWrapper.eq(HealthMedicineRecords::getEffectDesp, healthMedicineRecords.getEffectDesp());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getRecordName())) {
            queryWrapper.eq(HealthMedicineRecords::getRecordName, healthMedicineRecords.getRecordName());
        }
        if (healthMedicineRecords.getRecordDatetime() != null) {
            queryWrapper.eq(HealthMedicineRecords::getRecordDatetime, healthMedicineRecords.getRecordDatetime());
        }
        if (healthMedicineRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthMedicineRecords::getCreateUser, healthMedicineRecords.getCreateUser());
        }
        if (healthMedicineRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthMedicineRecords::getCreateDept, healthMedicineRecords.getCreateDept());
        }
        if (healthMedicineRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthMedicineRecords::getCreateTime, healthMedicineRecords.getCreateTime());
        }
        if (healthMedicineRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthMedicineRecords::getUpdateUser, healthMedicineRecords.getUpdateUser());
        }
        if (healthMedicineRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthMedicineRecords::getUpdateTime, healthMedicineRecords.getUpdateTime());
        }
        if (healthMedicineRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthMedicineRecords::getIsDeleted, healthMedicineRecords.getIsDeleted());
        }
        if (healthMedicineRecords.getStatus() != null) {
            queryWrapper.eq(HealthMedicineRecords::getStatus, healthMedicineRecords.getStatus());
        }
        if (healthMedicineRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthMedicineRecords::getAreaCode, healthMedicineRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthMedicineRecords.getAreaName())) {
            queryWrapper.eq(HealthMedicineRecords::getAreaName, healthMedicineRecords.getAreaName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthMedicineRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthMedicineRecords insert(HealthMedicineRecords healthMedicineRecords) {
        healthMedicineRecords.setId(null);
        getBaseMapper().insert(healthMedicineRecords);
        return healthMedicineRecords;
    }

    /**
    * 更新数据
    *
    * @param healthMedicineRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthMedicineRecords update(HealthMedicineRecords healthMedicineRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthMedicineRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthMedicineRecords>(getBaseMapper());
        if (healthMedicineRecords.getId() != null) {
            chainWrapper.set(HealthMedicineRecords::getId, healthMedicineRecords.getId());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getTenantId())) {
            chainWrapper.set(HealthMedicineRecords::getTenantId, healthMedicineRecords.getTenantId());
        }
        if (healthMedicineRecords.getCorpId() != null) {
            chainWrapper.set(HealthMedicineRecords::getCorpId, healthMedicineRecords.getCorpId());
        }
        if (healthMedicineRecords.getInstitutionId() != null) {
            chainWrapper.set(HealthMedicineRecords::getInstitutionId, healthMedicineRecords.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getInstitutionName())) {
            chainWrapper.set(HealthMedicineRecords::getInstitutionName, healthMedicineRecords.getInstitutionName());
        }
        if (healthMedicineRecords.getElderId() != null) {
            chainWrapper.set(HealthMedicineRecords::getElderId, healthMedicineRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getElderName())) {
            chainWrapper.set(HealthMedicineRecords::getElderName, healthMedicineRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getIdCard())) {
            chainWrapper.set(HealthMedicineRecords::getIdCard, healthMedicineRecords.getIdCard());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getDrugName())) {
            chainWrapper.set(HealthMedicineRecords::getDrugName, healthMedicineRecords.getDrugName());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getUseType())) {
            chainWrapper.set(HealthMedicineRecords::getUseType, healthMedicineRecords.getUseType());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getDrugFrequencyUnit())) {
            chainWrapper.set(HealthMedicineRecords::getDrugFrequencyUnit, healthMedicineRecords.getDrugFrequencyUnit());
        }
        if (healthMedicineRecords.getDrugFrequency() != null) {
            chainWrapper.set(HealthMedicineRecords::getDrugFrequency, healthMedicineRecords.getDrugFrequency());
        }
        if (healthMedicineRecords.getDrugDosage() != null) {
            chainWrapper.set(HealthMedicineRecords::getDrugDosage, healthMedicineRecords.getDrugDosage());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getDrugUnit())) {
            chainWrapper.set(HealthMedicineRecords::getDrugUnit, healthMedicineRecords.getDrugUnit());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getDrugRemark())) {
            chainWrapper.set(HealthMedicineRecords::getDrugRemark, healthMedicineRecords.getDrugRemark());
        }
        if (healthMedicineRecords.getStartDate() != null) {
            chainWrapper.set(HealthMedicineRecords::getStartDate, healthMedicineRecords.getStartDate());
        }
        if (healthMedicineRecords.getEndDate() != null) {
            chainWrapper.set(HealthMedicineRecords::getEndDate, healthMedicineRecords.getEndDate());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getCompliance())) {
            chainWrapper.set(HealthMedicineRecords::getCompliance, healthMedicineRecords.getCompliance());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getEffectDesp())) {
            chainWrapper.set(HealthMedicineRecords::getEffectDesp, healthMedicineRecords.getEffectDesp());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getRecordName())) {
            chainWrapper.set(HealthMedicineRecords::getRecordName, healthMedicineRecords.getRecordName());
        }
        if (healthMedicineRecords.getRecordDatetime() != null) {
            chainWrapper.set(HealthMedicineRecords::getRecordDatetime, healthMedicineRecords.getRecordDatetime());
        }
        if (healthMedicineRecords.getCreateUser() != null) {
            chainWrapper.set(HealthMedicineRecords::getCreateUser, healthMedicineRecords.getCreateUser());
        }
        if (healthMedicineRecords.getCreateDept() != null) {
            chainWrapper.set(HealthMedicineRecords::getCreateDept, healthMedicineRecords.getCreateDept());
        }
        if (healthMedicineRecords.getCreateTime() != null) {
            chainWrapper.set(HealthMedicineRecords::getCreateTime, healthMedicineRecords.getCreateTime());
        }
        if (healthMedicineRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthMedicineRecords::getUpdateUser, healthMedicineRecords.getUpdateUser());
        }
        if (healthMedicineRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthMedicineRecords::getUpdateTime, healthMedicineRecords.getUpdateTime());
        }
        if (healthMedicineRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthMedicineRecords::getIsDeleted, healthMedicineRecords.getIsDeleted());
        }
        if (healthMedicineRecords.getStatus() != null) {
            chainWrapper.set(HealthMedicineRecords::getStatus, healthMedicineRecords.getStatus());
        }
        if (healthMedicineRecords.getAreaCode() != null) {
            chainWrapper.set(HealthMedicineRecords::getAreaCode, healthMedicineRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthMedicineRecords.getAreaName())) {
            chainWrapper.set(HealthMedicineRecords::getAreaName, healthMedicineRecords.getAreaName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthMedicineRecords::getId, healthMedicineRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthMedicineRecords.getId());
        } else {
            return healthMedicineRecords;
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
    public boolean saveHealthMedicineRecordsBatch(List<HealthMedicineRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthMedicineRecords healthMedicineRecords : insertList) {
            //使用默认的雪花算法生成
            healthMedicineRecords.setId(null);
            //healthMedicineRecords.setCreatedDt(currentDte);
            //healthMedicineRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthMedicineRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthMedicineRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


