package cn.pluss.platform.service.healthInterventionPlanAdjust.impl;

import cn.pluss.platform.mapper.HealthInterventionPlanAdjustMapper;
import cn.pluss.platform.model.entity.HealthInterventionPlanAdjust;
import cn.pluss.platform.service.healthInterventionPlanAdjust.HealthInterventionPlanAdjustService;
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
@Service("healthInterventionPlanAdjustService")
public class HealthInterventionPlanAdjustServiceImpl extends ServiceImpl< HealthInterventionPlanAdjustMapper, HealthInterventionPlanAdjust> implements HealthInterventionPlanAdjustService {
    private static final Logger logger = LoggerFactory.getLogger(HealthInterventionPlanAdjustServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthInterventionPlanAdjust> queryPage(Map map) {
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
    public HealthInterventionPlanAdjust queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthInterventionPlanAdjust 实例对象
    * @return 实例对象
    */
    @Override
    public HealthInterventionPlanAdjust queryOne(HealthInterventionPlanAdjust healthInterventionPlanAdjust){
        LambdaQueryWrapper<HealthInterventionPlanAdjust> queryWrapper = getQueryWrapper(healthInterventionPlanAdjust);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthInterventionPlanAdjust
    * @return
    */
    @Override
    public List<HealthInterventionPlanAdjust> queryList(HealthInterventionPlanAdjust healthInterventionPlanAdjust) {
        LambdaQueryWrapper<HealthInterventionPlanAdjust> queryWrapper = getQueryWrapper(healthInterventionPlanAdjust);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthInterventionPlanAdjust
    * @return
    */
    public static LambdaQueryWrapper<HealthInterventionPlanAdjust> getQueryWrapper(HealthInterventionPlanAdjust healthInterventionPlanAdjust){
        LambdaQueryWrapper<HealthInterventionPlanAdjust> queryWrapper = new LambdaQueryWrapper<>();
        if (healthInterventionPlanAdjust.getId() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getId, healthInterventionPlanAdjust.getId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanAdjust.getTenantId())) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getTenantId, healthInterventionPlanAdjust.getTenantId());
        }
        if (healthInterventionPlanAdjust.getPlanId() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getPlanId, healthInterventionPlanAdjust.getPlanId());
        }
        if (healthInterventionPlanAdjust.getAdjustTime() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getAdjustTime, healthInterventionPlanAdjust.getAdjustTime());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanAdjust.getAdjustReason())) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getAdjustReason, healthInterventionPlanAdjust.getAdjustReason());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanAdjust.getAdjustContent())) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getAdjustContent, healthInterventionPlanAdjust.getAdjustContent());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanAdjust.getBeforeAdjustment())) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getBeforeAdjustment, healthInterventionPlanAdjust.getBeforeAdjustment());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanAdjust.getAfterAdjustment())) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getAfterAdjustment, healthInterventionPlanAdjust.getAfterAdjustment());
        }
        if (healthInterventionPlanAdjust.getAdjustDoctorId() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getAdjustDoctorId, healthInterventionPlanAdjust.getAdjustDoctorId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanAdjust.getAdjustDoctorName())) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getAdjustDoctorName, healthInterventionPlanAdjust.getAdjustDoctorName());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanAdjust.getEffectEvaluation())) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getEffectEvaluation, healthInterventionPlanAdjust.getEffectEvaluation());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanAdjust.getRemark())) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getRemark, healthInterventionPlanAdjust.getRemark());
        }
        if (healthInterventionPlanAdjust.getCreateUser() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getCreateUser, healthInterventionPlanAdjust.getCreateUser());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanAdjust.getCreateName())) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getCreateName, healthInterventionPlanAdjust.getCreateName());
        }
        if (healthInterventionPlanAdjust.getCreateDept() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getCreateDept, healthInterventionPlanAdjust.getCreateDept());
        }
        if (healthInterventionPlanAdjust.getCreateTime() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getCreateTime, healthInterventionPlanAdjust.getCreateTime());
        }
        if (healthInterventionPlanAdjust.getUpdateUser() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getUpdateUser, healthInterventionPlanAdjust.getUpdateUser());
        }
        if (healthInterventionPlanAdjust.getUpdateTime() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getUpdateTime, healthInterventionPlanAdjust.getUpdateTime());
        }
        if (healthInterventionPlanAdjust.getIsDeleted() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getIsDeleted, healthInterventionPlanAdjust.getIsDeleted());
        }
        if (healthInterventionPlanAdjust.getStatus() != null) {
            queryWrapper.eq(HealthInterventionPlanAdjust::getStatus, healthInterventionPlanAdjust.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthInterventionPlanAdjust 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventionPlanAdjust insert(HealthInterventionPlanAdjust healthInterventionPlanAdjust) {
        healthInterventionPlanAdjust.setId(null);
        getBaseMapper().insert(healthInterventionPlanAdjust);
        return healthInterventionPlanAdjust;
    }

    /**
    * 更新数据
    *
    * @param healthInterventionPlanAdjust 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventionPlanAdjust update(HealthInterventionPlanAdjust healthInterventionPlanAdjust) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthInterventionPlanAdjust> chainWrapper = new LambdaUpdateChainWrapper<HealthInterventionPlanAdjust>(getBaseMapper());
        if (healthInterventionPlanAdjust.getId() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getId, healthInterventionPlanAdjust.getId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanAdjust.getTenantId())) {
            chainWrapper.set(HealthInterventionPlanAdjust::getTenantId, healthInterventionPlanAdjust.getTenantId());
        }
        if (healthInterventionPlanAdjust.getPlanId() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getPlanId, healthInterventionPlanAdjust.getPlanId());
        }
        if (healthInterventionPlanAdjust.getAdjustTime() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getAdjustTime, healthInterventionPlanAdjust.getAdjustTime());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanAdjust.getAdjustReason())) {
            chainWrapper.set(HealthInterventionPlanAdjust::getAdjustReason, healthInterventionPlanAdjust.getAdjustReason());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanAdjust.getAdjustContent())) {
            chainWrapper.set(HealthInterventionPlanAdjust::getAdjustContent, healthInterventionPlanAdjust.getAdjustContent());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanAdjust.getBeforeAdjustment())) {
            chainWrapper.set(HealthInterventionPlanAdjust::getBeforeAdjustment, healthInterventionPlanAdjust.getBeforeAdjustment());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanAdjust.getAfterAdjustment())) {
            chainWrapper.set(HealthInterventionPlanAdjust::getAfterAdjustment, healthInterventionPlanAdjust.getAfterAdjustment());
        }
        if (healthInterventionPlanAdjust.getAdjustDoctorId() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getAdjustDoctorId, healthInterventionPlanAdjust.getAdjustDoctorId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanAdjust.getAdjustDoctorName())) {
            chainWrapper.set(HealthInterventionPlanAdjust::getAdjustDoctorName, healthInterventionPlanAdjust.getAdjustDoctorName());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanAdjust.getEffectEvaluation())) {
            chainWrapper.set(HealthInterventionPlanAdjust::getEffectEvaluation, healthInterventionPlanAdjust.getEffectEvaluation());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanAdjust.getRemark())) {
            chainWrapper.set(HealthInterventionPlanAdjust::getRemark, healthInterventionPlanAdjust.getRemark());
        }
        if (healthInterventionPlanAdjust.getCreateUser() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getCreateUser, healthInterventionPlanAdjust.getCreateUser());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanAdjust.getCreateName())) {
            chainWrapper.set(HealthInterventionPlanAdjust::getCreateName, healthInterventionPlanAdjust.getCreateName());
        }
        if (healthInterventionPlanAdjust.getCreateDept() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getCreateDept, healthInterventionPlanAdjust.getCreateDept());
        }
        if (healthInterventionPlanAdjust.getCreateTime() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getCreateTime, healthInterventionPlanAdjust.getCreateTime());
        }
        if (healthInterventionPlanAdjust.getUpdateUser() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getUpdateUser, healthInterventionPlanAdjust.getUpdateUser());
        }
        if (healthInterventionPlanAdjust.getUpdateTime() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getUpdateTime, healthInterventionPlanAdjust.getUpdateTime());
        }
        if (healthInterventionPlanAdjust.getIsDeleted() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getIsDeleted, healthInterventionPlanAdjust.getIsDeleted());
        }
        if (healthInterventionPlanAdjust.getStatus() != null) {
            chainWrapper.set(HealthInterventionPlanAdjust::getStatus, healthInterventionPlanAdjust.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthInterventionPlanAdjust::getId, healthInterventionPlanAdjust.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthInterventionPlanAdjust.getId());
        } else {
            return healthInterventionPlanAdjust;
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
    public boolean saveHealthInterventionPlanAdjustBatch(List<HealthInterventionPlanAdjust> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthInterventionPlanAdjust healthInterventionPlanAdjust : insertList) {
            //使用默认的雪花算法生成
            healthInterventionPlanAdjust.setId(null);
            //healthInterventionPlanAdjust.setCreatedDt(currentDte);
            //healthInterventionPlanAdjust.setUpdatedDt(currentDte);
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
    public Integer deleteHealthInterventionPlanAdjustBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthInterventionPlanAdjust> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


