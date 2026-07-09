package cn.pluss.platform.service.healthInterventionPlan.impl;

import cn.pluss.platform.mapper.HealthInterventionPlanMapper;
import cn.pluss.platform.model.entity.HealthInterventionPlan;
import cn.pluss.platform.service.healthInterventionPlan.HealthInterventionPlanService;
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
@Service("healthInterventionPlanService")
public class HealthInterventionPlanServiceImpl extends ServiceImpl< HealthInterventionPlanMapper, HealthInterventionPlan> implements HealthInterventionPlanService {
    private static final Logger logger = LoggerFactory.getLogger(HealthInterventionPlanServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthInterventionPlan> queryPage(Map map) {
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
    public HealthInterventionPlan queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthInterventionPlan 实例对象
    * @return 实例对象
    */
    @Override
    public HealthInterventionPlan queryOne(HealthInterventionPlan healthInterventionPlan){
        LambdaQueryWrapper<HealthInterventionPlan> queryWrapper = getQueryWrapper(healthInterventionPlan);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthInterventionPlan
    * @return
    */
    @Override
    public List<HealthInterventionPlan> queryList(HealthInterventionPlan healthInterventionPlan) {
        LambdaQueryWrapper<HealthInterventionPlan> queryWrapper = getQueryWrapper(healthInterventionPlan);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthInterventionPlan
    * @return
    */
    public static LambdaQueryWrapper<HealthInterventionPlan> getQueryWrapper(HealthInterventionPlan healthInterventionPlan){
        LambdaQueryWrapper<HealthInterventionPlan> queryWrapper = new LambdaQueryWrapper<>();
        if (healthInterventionPlan.getId() != null) {
            queryWrapper.eq(HealthInterventionPlan::getId, healthInterventionPlan.getId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getTenantId())) {
            queryWrapper.eq(HealthInterventionPlan::getTenantId, healthInterventionPlan.getTenantId());
        }
        if (healthInterventionPlan.getCorpId() != null) {
            queryWrapper.eq(HealthInterventionPlan::getCorpId, healthInterventionPlan.getCorpId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getCorpName())) {
            queryWrapper.eq(HealthInterventionPlan::getCorpName, healthInterventionPlan.getCorpName());
        }
        if (healthInterventionPlan.getInstitutionId() != null) {
            queryWrapper.eq(HealthInterventionPlan::getInstitutionId, healthInterventionPlan.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getInstitutionName())) {
            queryWrapper.eq(HealthInterventionPlan::getInstitutionName, healthInterventionPlan.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getPlanNo())) {
            queryWrapper.eq(HealthInterventionPlan::getPlanNo, healthInterventionPlan.getPlanNo());
        }
        if (healthInterventionPlan.getArchiveId() != null) {
            queryWrapper.eq(HealthInterventionPlan::getArchiveId, healthInterventionPlan.getArchiveId());
        }
        if (healthInterventionPlan.getElderId() != null) {
            queryWrapper.eq(HealthInterventionPlan::getElderId, healthInterventionPlan.getElderId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getElderName())) {
            queryWrapper.eq(HealthInterventionPlan::getElderName, healthInterventionPlan.getElderName());
        }
        if (healthInterventionPlan.getDoctorId() != null) {
            queryWrapper.eq(HealthInterventionPlan::getDoctorId, healthInterventionPlan.getDoctorId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getDoctorName())) {
            queryWrapper.eq(HealthInterventionPlan::getDoctorName, healthInterventionPlan.getDoctorName());
        }
        if (healthInterventionPlan.getDevelopTime() != null) {
            queryWrapper.eq(HealthInterventionPlan::getDevelopTime, healthInterventionPlan.getDevelopTime());
        }
        if (healthInterventionPlan.getStartDate() != null) {
            queryWrapper.eq(HealthInterventionPlan::getStartDate, healthInterventionPlan.getStartDate());
        }
        if (healthInterventionPlan.getEndDate() != null) {
            queryWrapper.eq(HealthInterventionPlan::getEndDate, healthInterventionPlan.getEndDate());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getInterventionTarget())) {
            queryWrapper.eq(HealthInterventionPlan::getInterventionTarget, healthInterventionPlan.getInterventionTarget());
        }
        if (healthInterventionPlan.getDiseaseId() != null) {
            queryWrapper.eq(HealthInterventionPlan::getDiseaseId, healthInterventionPlan.getDiseaseId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getDiseaseName())) {
            queryWrapper.eq(HealthInterventionPlan::getDiseaseName, healthInterventionPlan.getDiseaseName());
        }
        if (healthInterventionPlan.getDiseaseLevelId() != null) {
            queryWrapper.eq(HealthInterventionPlan::getDiseaseLevelId, healthInterventionPlan.getDiseaseLevelId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getDiseaseLevelName())) {
            queryWrapper.eq(HealthInterventionPlan::getDiseaseLevelName, healthInterventionPlan.getDiseaseLevelName());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getMedicationPlan())) {
            queryWrapper.eq(HealthInterventionPlan::getMedicationPlan, healthInterventionPlan.getMedicationPlan());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getDietPlan())) {
            queryWrapper.eq(HealthInterventionPlan::getDietPlan, healthInterventionPlan.getDietPlan());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getMonitoringPlan())) {
            queryWrapper.eq(HealthInterventionPlan::getMonitoringPlan, healthInterventionPlan.getMonitoringPlan());
        }
        if (healthInterventionPlan.getPlanState() != null) {
            queryWrapper.eq(HealthInterventionPlan::getPlanState, healthInterventionPlan.getPlanState());
        }
        if (healthInterventionPlan.getExecutionRate() != null) {
            queryWrapper.eq(HealthInterventionPlan::getExecutionRate, healthInterventionPlan.getExecutionRate());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getEffectEvaluation())) {
            queryWrapper.eq(HealthInterventionPlan::getEffectEvaluation, healthInterventionPlan.getEffectEvaluation());
        }
        if (healthInterventionPlan.getAdjustmentCount() != null) {
            queryWrapper.eq(HealthInterventionPlan::getAdjustmentCount, healthInterventionPlan.getAdjustmentCount());
        }
        if (healthInterventionPlan.getLastAdjustTime() != null) {
            queryWrapper.eq(HealthInterventionPlan::getLastAdjustTime, healthInterventionPlan.getLastAdjustTime());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getRemark())) {
            queryWrapper.eq(HealthInterventionPlan::getRemark, healthInterventionPlan.getRemark());
        }
        if (healthInterventionPlan.getCreateUser() != null) {
            queryWrapper.eq(HealthInterventionPlan::getCreateUser, healthInterventionPlan.getCreateUser());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlan.getCreateName())) {
            queryWrapper.eq(HealthInterventionPlan::getCreateName, healthInterventionPlan.getCreateName());
        }
        if (healthInterventionPlan.getCreateDept() != null) {
            queryWrapper.eq(HealthInterventionPlan::getCreateDept, healthInterventionPlan.getCreateDept());
        }
        if (healthInterventionPlan.getCreateTime() != null) {
            queryWrapper.eq(HealthInterventionPlan::getCreateTime, healthInterventionPlan.getCreateTime());
        }
        if (healthInterventionPlan.getUpdateUser() != null) {
            queryWrapper.eq(HealthInterventionPlan::getUpdateUser, healthInterventionPlan.getUpdateUser());
        }
        if (healthInterventionPlan.getUpdateTime() != null) {
            queryWrapper.eq(HealthInterventionPlan::getUpdateTime, healthInterventionPlan.getUpdateTime());
        }
        if (healthInterventionPlan.getIsDeleted() != null) {
            queryWrapper.eq(HealthInterventionPlan::getIsDeleted, healthInterventionPlan.getIsDeleted());
        }
        if (healthInterventionPlan.getStatus() != null) {
            queryWrapper.eq(HealthInterventionPlan::getStatus, healthInterventionPlan.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthInterventionPlan 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventionPlan insert(HealthInterventionPlan healthInterventionPlan) {
        healthInterventionPlan.setId(null);
        getBaseMapper().insert(healthInterventionPlan);
        return healthInterventionPlan;
    }

    /**
    * 更新数据
    *
    * @param healthInterventionPlan 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventionPlan update(HealthInterventionPlan healthInterventionPlan) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthInterventionPlan> chainWrapper = new LambdaUpdateChainWrapper<HealthInterventionPlan>(getBaseMapper());
        if (healthInterventionPlan.getId() != null) {
            chainWrapper.set(HealthInterventionPlan::getId, healthInterventionPlan.getId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getTenantId())) {
            chainWrapper.set(HealthInterventionPlan::getTenantId, healthInterventionPlan.getTenantId());
        }
        if (healthInterventionPlan.getCorpId() != null) {
            chainWrapper.set(HealthInterventionPlan::getCorpId, healthInterventionPlan.getCorpId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getCorpName())) {
            chainWrapper.set(HealthInterventionPlan::getCorpName, healthInterventionPlan.getCorpName());
        }
        if (healthInterventionPlan.getInstitutionId() != null) {
            chainWrapper.set(HealthInterventionPlan::getInstitutionId, healthInterventionPlan.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getInstitutionName())) {
            chainWrapper.set(HealthInterventionPlan::getInstitutionName, healthInterventionPlan.getInstitutionName());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getPlanNo())) {
            chainWrapper.set(HealthInterventionPlan::getPlanNo, healthInterventionPlan.getPlanNo());
        }
        if (healthInterventionPlan.getArchiveId() != null) {
            chainWrapper.set(HealthInterventionPlan::getArchiveId, healthInterventionPlan.getArchiveId());
        }
        if (healthInterventionPlan.getElderId() != null) {
            chainWrapper.set(HealthInterventionPlan::getElderId, healthInterventionPlan.getElderId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getElderName())) {
            chainWrapper.set(HealthInterventionPlan::getElderName, healthInterventionPlan.getElderName());
        }
        if (healthInterventionPlan.getDoctorId() != null) {
            chainWrapper.set(HealthInterventionPlan::getDoctorId, healthInterventionPlan.getDoctorId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getDoctorName())) {
            chainWrapper.set(HealthInterventionPlan::getDoctorName, healthInterventionPlan.getDoctorName());
        }
        if (healthInterventionPlan.getDevelopTime() != null) {
            chainWrapper.set(HealthInterventionPlan::getDevelopTime, healthInterventionPlan.getDevelopTime());
        }
        if (healthInterventionPlan.getStartDate() != null) {
            chainWrapper.set(HealthInterventionPlan::getStartDate, healthInterventionPlan.getStartDate());
        }
        if (healthInterventionPlan.getEndDate() != null) {
            chainWrapper.set(HealthInterventionPlan::getEndDate, healthInterventionPlan.getEndDate());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getInterventionTarget())) {
            chainWrapper.set(HealthInterventionPlan::getInterventionTarget, healthInterventionPlan.getInterventionTarget());
        }
        if (healthInterventionPlan.getDiseaseId() != null) {
            chainWrapper.set(HealthInterventionPlan::getDiseaseId, healthInterventionPlan.getDiseaseId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getDiseaseName())) {
            chainWrapper.set(HealthInterventionPlan::getDiseaseName, healthInterventionPlan.getDiseaseName());
        }
        if (healthInterventionPlan.getDiseaseLevelId() != null) {
            chainWrapper.set(HealthInterventionPlan::getDiseaseLevelId, healthInterventionPlan.getDiseaseLevelId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getDiseaseLevelName())) {
            chainWrapper.set(HealthInterventionPlan::getDiseaseLevelName, healthInterventionPlan.getDiseaseLevelName());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getMedicationPlan())) {
            chainWrapper.set(HealthInterventionPlan::getMedicationPlan, healthInterventionPlan.getMedicationPlan());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getDietPlan())) {
            chainWrapper.set(HealthInterventionPlan::getDietPlan, healthInterventionPlan.getDietPlan());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getMonitoringPlan())) {
            chainWrapper.set(HealthInterventionPlan::getMonitoringPlan, healthInterventionPlan.getMonitoringPlan());
        }
        if (healthInterventionPlan.getPlanState() != null) {
            chainWrapper.set(HealthInterventionPlan::getPlanState, healthInterventionPlan.getPlanState());
        }
        if (healthInterventionPlan.getExecutionRate() != null) {
            chainWrapper.set(HealthInterventionPlan::getExecutionRate, healthInterventionPlan.getExecutionRate());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getEffectEvaluation())) {
            chainWrapper.set(HealthInterventionPlan::getEffectEvaluation, healthInterventionPlan.getEffectEvaluation());
        }
        if (healthInterventionPlan.getAdjustmentCount() != null) {
            chainWrapper.set(HealthInterventionPlan::getAdjustmentCount, healthInterventionPlan.getAdjustmentCount());
        }
        if (healthInterventionPlan.getLastAdjustTime() != null) {
            chainWrapper.set(HealthInterventionPlan::getLastAdjustTime, healthInterventionPlan.getLastAdjustTime());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getRemark())) {
            chainWrapper.set(HealthInterventionPlan::getRemark, healthInterventionPlan.getRemark());
        }
        if (healthInterventionPlan.getCreateUser() != null) {
            chainWrapper.set(HealthInterventionPlan::getCreateUser, healthInterventionPlan.getCreateUser());
        }
        if (StringUtil.isNotBlank(healthInterventionPlan.getCreateName())) {
            chainWrapper.set(HealthInterventionPlan::getCreateName, healthInterventionPlan.getCreateName());
        }
        if (healthInterventionPlan.getCreateDept() != null) {
            chainWrapper.set(HealthInterventionPlan::getCreateDept, healthInterventionPlan.getCreateDept());
        }
        if (healthInterventionPlan.getCreateTime() != null) {
            chainWrapper.set(HealthInterventionPlan::getCreateTime, healthInterventionPlan.getCreateTime());
        }
        if (healthInterventionPlan.getUpdateUser() != null) {
            chainWrapper.set(HealthInterventionPlan::getUpdateUser, healthInterventionPlan.getUpdateUser());
        }
        if (healthInterventionPlan.getUpdateTime() != null) {
            chainWrapper.set(HealthInterventionPlan::getUpdateTime, healthInterventionPlan.getUpdateTime());
        }
        if (healthInterventionPlan.getIsDeleted() != null) {
            chainWrapper.set(HealthInterventionPlan::getIsDeleted, healthInterventionPlan.getIsDeleted());
        }
        if (healthInterventionPlan.getStatus() != null) {
            chainWrapper.set(HealthInterventionPlan::getStatus, healthInterventionPlan.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthInterventionPlan::getId, healthInterventionPlan.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthInterventionPlan.getId());
        } else {
            return healthInterventionPlan;
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
    public boolean saveHealthInterventionPlanBatch(List<HealthInterventionPlan> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthInterventionPlan healthInterventionPlan : insertList) {
            //使用默认的雪花算法生成
            healthInterventionPlan.setId(null);
            //healthInterventionPlan.setCreatedDt(currentDte);
            //healthInterventionPlan.setUpdatedDt(currentDte);
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
    public Integer deleteHealthInterventionPlanBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthInterventionPlan> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


