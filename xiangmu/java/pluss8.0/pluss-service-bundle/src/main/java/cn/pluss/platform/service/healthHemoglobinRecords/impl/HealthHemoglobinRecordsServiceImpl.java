package cn.pluss.platform.service.healthHemoglobinRecords.impl;

import cn.pluss.platform.mapper.HealthHemoglobinRecordsMapper;
import cn.pluss.platform.model.entity.HealthHemoglobinRecords;
import cn.pluss.platform.service.healthHemoglobinRecords.HealthHemoglobinRecordsService;
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
@Service("healthHemoglobinRecordsService")
public class HealthHemoglobinRecordsServiceImpl extends ServiceImpl< HealthHemoglobinRecordsMapper, HealthHemoglobinRecords> implements HealthHemoglobinRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthHemoglobinRecordsServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthHemoglobinRecords> queryPage(Map map) {
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
    public HealthHemoglobinRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthHemoglobinRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthHemoglobinRecords queryOne(HealthHemoglobinRecords healthHemoglobinRecords){
        LambdaQueryWrapper<HealthHemoglobinRecords> queryWrapper = getQueryWrapper(healthHemoglobinRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthHemoglobinRecords
    * @return
    */
    @Override
    public List<HealthHemoglobinRecords> queryList(HealthHemoglobinRecords healthHemoglobinRecords) {
        LambdaQueryWrapper<HealthHemoglobinRecords> queryWrapper = getQueryWrapper(healthHemoglobinRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthHemoglobinRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthHemoglobinRecords> getQueryWrapper(HealthHemoglobinRecords healthHemoglobinRecords){
        LambdaQueryWrapper<HealthHemoglobinRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthHemoglobinRecords.getId() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getId, healthHemoglobinRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getTenantId())) {
            queryWrapper.eq(HealthHemoglobinRecords::getTenantId, healthHemoglobinRecords.getTenantId());
        }
        if (healthHemoglobinRecords.getCorpId() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getCorpId, healthHemoglobinRecords.getCorpId());
        }
        if (healthHemoglobinRecords.getInstitutionId() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getInstitutionId, healthHemoglobinRecords.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getInstitutionName())) {
            queryWrapper.eq(HealthHemoglobinRecords::getInstitutionName, healthHemoglobinRecords.getInstitutionName());
        }
        if (healthHemoglobinRecords.getElderId() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getElderId, healthHemoglobinRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getElderName())) {
            queryWrapper.eq(HealthHemoglobinRecords::getElderName, healthHemoglobinRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getIdCard())) {
            queryWrapper.eq(HealthHemoglobinRecords::getIdCard, healthHemoglobinRecords.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getSex())) {
            queryWrapper.eq(HealthHemoglobinRecords::getSex, healthHemoglobinRecords.getSex());
        }
        if (healthHemoglobinRecords.getAge() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getAge, healthHemoglobinRecords.getAge());
        }
        if (healthHemoglobinRecords.getGaugeTime() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getGaugeTime, healthHemoglobinRecords.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getGaugeType())) {
            queryWrapper.eq(HealthHemoglobinRecords::getGaugeType, healthHemoglobinRecords.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getConditions())) {
            queryWrapper.eq(HealthHemoglobinRecords::getConditions, healthHemoglobinRecords.getConditions());
        }
        if (healthHemoglobinRecords.getHemoglobin() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getHemoglobin, healthHemoglobinRecords.getHemoglobin());
        }
        if (healthHemoglobinRecords.getHct() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getHct, healthHemoglobinRecords.getHct());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getAnalysisResult())) {
            queryWrapper.eq(HealthHemoglobinRecords::getAnalysisResult, healthHemoglobinRecords.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getOpinion())) {
            queryWrapper.eq(HealthHemoglobinRecords::getOpinion, healthHemoglobinRecords.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getWarnFlag())) {
            queryWrapper.eq(HealthHemoglobinRecords::getWarnFlag, healthHemoglobinRecords.getWarnFlag());
        }
        if (healthHemoglobinRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getAreaCode, healthHemoglobinRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getAreaName())) {
            queryWrapper.eq(HealthHemoglobinRecords::getAreaName, healthHemoglobinRecords.getAreaName());
        }
        if (healthHemoglobinRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getCreateUser, healthHemoglobinRecords.getCreateUser());
        }
        if (healthHemoglobinRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getCreateDept, healthHemoglobinRecords.getCreateDept());
        }
        if (healthHemoglobinRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getCreateTime, healthHemoglobinRecords.getCreateTime());
        }
        if (healthHemoglobinRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getUpdateUser, healthHemoglobinRecords.getUpdateUser());
        }
        if (healthHemoglobinRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getUpdateTime, healthHemoglobinRecords.getUpdateTime());
        }
        if (healthHemoglobinRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getIsDeleted, healthHemoglobinRecords.getIsDeleted());
        }
        if (healthHemoglobinRecords.getStatus() != null) {
            queryWrapper.eq(HealthHemoglobinRecords::getStatus, healthHemoglobinRecords.getStatus());
        }
        if (StringUtil.isNotEmpty(healthHemoglobinRecords.getDataSource())) {
            queryWrapper.eq(HealthHemoglobinRecords::getDataSource, healthHemoglobinRecords.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthHemoglobinRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthHemoglobinRecords insert(HealthHemoglobinRecords healthHemoglobinRecords) {
        healthHemoglobinRecords.setId(null);
        getBaseMapper().insert(healthHemoglobinRecords);
        return healthHemoglobinRecords;
    }

    /**
    * 更新数据
    *
    * @param healthHemoglobinRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthHemoglobinRecords update(HealthHemoglobinRecords healthHemoglobinRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthHemoglobinRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthHemoglobinRecords>(getBaseMapper());
        if (healthHemoglobinRecords.getId() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getId, healthHemoglobinRecords.getId());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getTenantId())) {
            chainWrapper.set(HealthHemoglobinRecords::getTenantId, healthHemoglobinRecords.getTenantId());
        }
        if (healthHemoglobinRecords.getCorpId() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getCorpId, healthHemoglobinRecords.getCorpId());
        }
        if (healthHemoglobinRecords.getInstitutionId() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getInstitutionId, healthHemoglobinRecords.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getInstitutionName())) {
            chainWrapper.set(HealthHemoglobinRecords::getInstitutionName, healthHemoglobinRecords.getInstitutionName());
        }
        if (healthHemoglobinRecords.getElderId() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getElderId, healthHemoglobinRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getElderName())) {
            chainWrapper.set(HealthHemoglobinRecords::getElderName, healthHemoglobinRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getIdCard())) {
            chainWrapper.set(HealthHemoglobinRecords::getIdCard, healthHemoglobinRecords.getIdCard());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getSex())) {
            chainWrapper.set(HealthHemoglobinRecords::getSex, healthHemoglobinRecords.getSex());
        }
        if (healthHemoglobinRecords.getAge() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getAge, healthHemoglobinRecords.getAge());
        }
        if (healthHemoglobinRecords.getGaugeTime() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getGaugeTime, healthHemoglobinRecords.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getGaugeType())) {
            chainWrapper.set(HealthHemoglobinRecords::getGaugeType, healthHemoglobinRecords.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getConditions())) {
            chainWrapper.set(HealthHemoglobinRecords::getConditions, healthHemoglobinRecords.getConditions());
        }
        if (healthHemoglobinRecords.getHemoglobin() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getHemoglobin, healthHemoglobinRecords.getHemoglobin());
        }
        if (healthHemoglobinRecords.getHct() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getHct, healthHemoglobinRecords.getHct());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getAnalysisResult())) {
            chainWrapper.set(HealthHemoglobinRecords::getAnalysisResult, healthHemoglobinRecords.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getOpinion())) {
            chainWrapper.set(HealthHemoglobinRecords::getOpinion, healthHemoglobinRecords.getOpinion());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getWarnFlag())) {
            chainWrapper.set(HealthHemoglobinRecords::getWarnFlag, healthHemoglobinRecords.getWarnFlag());
        }
        if (healthHemoglobinRecords.getAreaCode() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getAreaCode, healthHemoglobinRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getAreaName())) {
            chainWrapper.set(HealthHemoglobinRecords::getAreaName, healthHemoglobinRecords.getAreaName());
        }
        if (healthHemoglobinRecords.getCreateUser() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getCreateUser, healthHemoglobinRecords.getCreateUser());
        }
        if (healthHemoglobinRecords.getCreateDept() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getCreateDept, healthHemoglobinRecords.getCreateDept());
        }
        if (healthHemoglobinRecords.getCreateTime() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getCreateTime, healthHemoglobinRecords.getCreateTime());
        }
        if (healthHemoglobinRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getUpdateUser, healthHemoglobinRecords.getUpdateUser());
        }
        if (healthHemoglobinRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getUpdateTime, healthHemoglobinRecords.getUpdateTime());
        }
        if (healthHemoglobinRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getIsDeleted, healthHemoglobinRecords.getIsDeleted());
        }
        if (healthHemoglobinRecords.getStatus() != null) {
            chainWrapper.set(HealthHemoglobinRecords::getStatus, healthHemoglobinRecords.getStatus());
        }
        if (StringUtil.isNotBlank(healthHemoglobinRecords.getDataSource())) {
            chainWrapper.set(HealthHemoglobinRecords::getDataSource, healthHemoglobinRecords.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthHemoglobinRecords::getId, healthHemoglobinRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthHemoglobinRecords.getId());
        } else {
            return healthHemoglobinRecords;
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
    public boolean saveHealthHemoglobinRecordsBatch(List<HealthHemoglobinRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthHemoglobinRecords healthHemoglobinRecords : insertList) {
            //使用默认的雪花算法生成
            healthHemoglobinRecords.setId(null);
            //healthHemoglobinRecords.setCreatedDt(currentDte);
            //healthHemoglobinRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthHemoglobinRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthHemoglobinRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


