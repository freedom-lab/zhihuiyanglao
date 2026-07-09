package cn.pluss.platform.service.healthSportRecords.impl;

import cn.pluss.platform.mapper.HealthSportRecordsMapper;
import cn.pluss.platform.model.entity.HealthSportRecords;
import cn.pluss.platform.service.healthSportRecords.HealthSportRecordsService;
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
@Service("healthSportRecordsService")
public class HealthSportRecordsServiceImpl extends ServiceImpl< HealthSportRecordsMapper, HealthSportRecords> implements HealthSportRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthSportRecordsServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthSportRecords> queryPage(Map map) {
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
    public HealthSportRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthSportRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthSportRecords queryOne(HealthSportRecords healthSportRecords){
        LambdaQueryWrapper<HealthSportRecords> queryWrapper = getQueryWrapper(healthSportRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthSportRecords
    * @return
    */
    @Override
    public List<HealthSportRecords> queryList(HealthSportRecords healthSportRecords) {
        LambdaQueryWrapper<HealthSportRecords> queryWrapper = getQueryWrapper(healthSportRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthSportRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthSportRecords> getQueryWrapper(HealthSportRecords healthSportRecords){
        LambdaQueryWrapper<HealthSportRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthSportRecords.getId() != null) {
            queryWrapper.eq(HealthSportRecords::getId, healthSportRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getTenantId())) {
            queryWrapper.eq(HealthSportRecords::getTenantId, healthSportRecords.getTenantId());
        }
        if (healthSportRecords.getCorpId() != null) {
            queryWrapper.eq(HealthSportRecords::getCorpId, healthSportRecords.getCorpId());
        }
        if (healthSportRecords.getInstitutionId() != null) {
            queryWrapper.eq(HealthSportRecords::getInstitutionId, healthSportRecords.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getInstitutionName())) {
            queryWrapper.eq(HealthSportRecords::getInstitutionName, healthSportRecords.getInstitutionName());
        }
        if (healthSportRecords.getElderId() != null) {
            queryWrapper.eq(HealthSportRecords::getElderId, healthSportRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getElderName())) {
            queryWrapper.eq(HealthSportRecords::getElderName, healthSportRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getIdCard())) {
            queryWrapper.eq(HealthSportRecords::getIdCard, healthSportRecords.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getSex())) {
            queryWrapper.eq(HealthSportRecords::getSex, healthSportRecords.getSex());
        }
        if (healthSportRecords.getAge() != null) {
            queryWrapper.eq(HealthSportRecords::getAge, healthSportRecords.getAge());
        }
        if (healthSportRecords.getGaugeTime() != null) {
            queryWrapper.eq(HealthSportRecords::getGaugeTime, healthSportRecords.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getGaugeType())) {
            queryWrapper.eq(HealthSportRecords::getGaugeType, healthSportRecords.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getConditions())) {
            queryWrapper.eq(HealthSportRecords::getConditions, healthSportRecords.getConditions());
        }
        if (healthSportRecords.getTarget() != null) {
            queryWrapper.eq(HealthSportRecords::getTarget, healthSportRecords.getTarget());
        }
        if (healthSportRecords.getActual() != null) {
            queryWrapper.eq(HealthSportRecords::getActual, healthSportRecords.getActual());
        }
        if (healthSportRecords.getTotals() != null) {
            queryWrapper.eq(HealthSportRecords::getTotals, healthSportRecords.getTotals());
        }
        if (healthSportRecords.getCalories() != null) {
            queryWrapper.eq(HealthSportRecords::getCalories, healthSportRecords.getCalories());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getAnalysisResult())) {
            queryWrapper.eq(HealthSportRecords::getAnalysisResult, healthSportRecords.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getOpinion())) {
            queryWrapper.eq(HealthSportRecords::getOpinion, healthSportRecords.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getWarnFlag())) {
            queryWrapper.eq(HealthSportRecords::getWarnFlag, healthSportRecords.getWarnFlag());
        }
        if (healthSportRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthSportRecords::getAreaCode, healthSportRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getAreaName())) {
            queryWrapper.eq(HealthSportRecords::getAreaName, healthSportRecords.getAreaName());
        }
        if (healthSportRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthSportRecords::getCreateUser, healthSportRecords.getCreateUser());
        }
        if (healthSportRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthSportRecords::getCreateDept, healthSportRecords.getCreateDept());
        }
        if (healthSportRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthSportRecords::getCreateTime, healthSportRecords.getCreateTime());
        }
        if (healthSportRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthSportRecords::getUpdateUser, healthSportRecords.getUpdateUser());
        }
        if (healthSportRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthSportRecords::getUpdateTime, healthSportRecords.getUpdateTime());
        }
        if (healthSportRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthSportRecords::getIsDeleted, healthSportRecords.getIsDeleted());
        }
        if (healthSportRecords.getStatus() != null) {
            queryWrapper.eq(HealthSportRecords::getStatus, healthSportRecords.getStatus());
        }
        if (StringUtil.isNotEmpty(healthSportRecords.getDataSource())) {
            queryWrapper.eq(HealthSportRecords::getDataSource, healthSportRecords.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthSportRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthSportRecords insert(HealthSportRecords healthSportRecords) {
        healthSportRecords.setId(null);
        getBaseMapper().insert(healthSportRecords);
        return healthSportRecords;
    }

    /**
    * 更新数据
    *
    * @param healthSportRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthSportRecords update(HealthSportRecords healthSportRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthSportRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthSportRecords>(getBaseMapper());
        if (healthSportRecords.getId() != null) {
            chainWrapper.set(HealthSportRecords::getId, healthSportRecords.getId());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getTenantId())) {
            chainWrapper.set(HealthSportRecords::getTenantId, healthSportRecords.getTenantId());
        }
        if (healthSportRecords.getCorpId() != null) {
            chainWrapper.set(HealthSportRecords::getCorpId, healthSportRecords.getCorpId());
        }
        if (healthSportRecords.getInstitutionId() != null) {
            chainWrapper.set(HealthSportRecords::getInstitutionId, healthSportRecords.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getInstitutionName())) {
            chainWrapper.set(HealthSportRecords::getInstitutionName, healthSportRecords.getInstitutionName());
        }
        if (healthSportRecords.getElderId() != null) {
            chainWrapper.set(HealthSportRecords::getElderId, healthSportRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getElderName())) {
            chainWrapper.set(HealthSportRecords::getElderName, healthSportRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getIdCard())) {
            chainWrapper.set(HealthSportRecords::getIdCard, healthSportRecords.getIdCard());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getSex())) {
            chainWrapper.set(HealthSportRecords::getSex, healthSportRecords.getSex());
        }
        if (healthSportRecords.getAge() != null) {
            chainWrapper.set(HealthSportRecords::getAge, healthSportRecords.getAge());
        }
        if (healthSportRecords.getGaugeTime() != null) {
            chainWrapper.set(HealthSportRecords::getGaugeTime, healthSportRecords.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getGaugeType())) {
            chainWrapper.set(HealthSportRecords::getGaugeType, healthSportRecords.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getConditions())) {
            chainWrapper.set(HealthSportRecords::getConditions, healthSportRecords.getConditions());
        }
        if (healthSportRecords.getTarget() != null) {
            chainWrapper.set(HealthSportRecords::getTarget, healthSportRecords.getTarget());
        }
        if (healthSportRecords.getActual() != null) {
            chainWrapper.set(HealthSportRecords::getActual, healthSportRecords.getActual());
        }
        if (healthSportRecords.getTotals() != null) {
            chainWrapper.set(HealthSportRecords::getTotals, healthSportRecords.getTotals());
        }
        if (healthSportRecords.getCalories() != null) {
            chainWrapper.set(HealthSportRecords::getCalories, healthSportRecords.getCalories());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getAnalysisResult())) {
            chainWrapper.set(HealthSportRecords::getAnalysisResult, healthSportRecords.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getOpinion())) {
            chainWrapper.set(HealthSportRecords::getOpinion, healthSportRecords.getOpinion());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getWarnFlag())) {
            chainWrapper.set(HealthSportRecords::getWarnFlag, healthSportRecords.getWarnFlag());
        }
        if (healthSportRecords.getAreaCode() != null) {
            chainWrapper.set(HealthSportRecords::getAreaCode, healthSportRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getAreaName())) {
            chainWrapper.set(HealthSportRecords::getAreaName, healthSportRecords.getAreaName());
        }
        if (healthSportRecords.getCreateUser() != null) {
            chainWrapper.set(HealthSportRecords::getCreateUser, healthSportRecords.getCreateUser());
        }
        if (healthSportRecords.getCreateDept() != null) {
            chainWrapper.set(HealthSportRecords::getCreateDept, healthSportRecords.getCreateDept());
        }
        if (healthSportRecords.getCreateTime() != null) {
            chainWrapper.set(HealthSportRecords::getCreateTime, healthSportRecords.getCreateTime());
        }
        if (healthSportRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthSportRecords::getUpdateUser, healthSportRecords.getUpdateUser());
        }
        if (healthSportRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthSportRecords::getUpdateTime, healthSportRecords.getUpdateTime());
        }
        if (healthSportRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthSportRecords::getIsDeleted, healthSportRecords.getIsDeleted());
        }
        if (healthSportRecords.getStatus() != null) {
            chainWrapper.set(HealthSportRecords::getStatus, healthSportRecords.getStatus());
        }
        if (StringUtil.isNotBlank(healthSportRecords.getDataSource())) {
            chainWrapper.set(HealthSportRecords::getDataSource, healthSportRecords.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthSportRecords::getId, healthSportRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthSportRecords.getId());
        } else {
            return healthSportRecords;
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
    public boolean saveHealthSportRecordsBatch(List<HealthSportRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthSportRecords healthSportRecords : insertList) {
            //使用默认的雪花算法生成
            healthSportRecords.setId(null);
            //healthSportRecords.setCreatedDt(currentDte);
            //healthSportRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthSportRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthSportRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


