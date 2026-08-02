package cn.pluss.platform.service.healthDiseaseFollow.impl;

import cn.pluss.platform.mapper.HealthDiseaseFollowMapper;
import cn.pluss.platform.model.entity.HealthDiseaseFollow;
import cn.pluss.platform.service.healthDiseaseFollow.HealthDiseaseFollowService;
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
@Service("healthDiseaseFollowService")
public class HealthDiseaseFollowServiceImpl extends ServiceImpl< HealthDiseaseFollowMapper, HealthDiseaseFollow> implements HealthDiseaseFollowService {
    private static final Logger logger = LoggerFactory.getLogger(HealthDiseaseFollowServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthDiseaseFollow> queryPage(Map map) {
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
    public HealthDiseaseFollow queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthDiseaseFollow 实例对象
    * @return 实例对象
    */
    @Override
    public HealthDiseaseFollow queryOne(HealthDiseaseFollow healthDiseaseFollow){
        LambdaQueryWrapper<HealthDiseaseFollow> queryWrapper = getQueryWrapper(healthDiseaseFollow);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthDiseaseFollow
    * @return
    */
    @Override
    public List<HealthDiseaseFollow> queryList(HealthDiseaseFollow healthDiseaseFollow) {
        LambdaQueryWrapper<HealthDiseaseFollow> queryWrapper = getQueryWrapper(healthDiseaseFollow);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthDiseaseFollow
    * @return
    */
    public static LambdaQueryWrapper<HealthDiseaseFollow> getQueryWrapper(HealthDiseaseFollow healthDiseaseFollow){
        LambdaQueryWrapper<HealthDiseaseFollow> queryWrapper = new LambdaQueryWrapper<>();
        if (healthDiseaseFollow.getId() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getId, healthDiseaseFollow.getId());
        }
        if (healthDiseaseFollow.getInterventionsId() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getInterventionsId, healthDiseaseFollow.getInterventionsId());
        }
        if (healthDiseaseFollow.getElderId() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getElderId, healthDiseaseFollow.getElderId());
        }
        if (StringUtil.isNotEmpty(healthDiseaseFollow.getMedicationCondition())) {
            queryWrapper.eq(HealthDiseaseFollow::getMedicationCondition, healthDiseaseFollow.getMedicationCondition());
        }
        if (StringUtil.isNotEmpty(healthDiseaseFollow.getDietCondition())) {
            queryWrapper.eq(HealthDiseaseFollow::getDietCondition, healthDiseaseFollow.getDietCondition());
        }
        if (StringUtil.isNotEmpty(healthDiseaseFollow.getSportCondition())) {
            queryWrapper.eq(HealthDiseaseFollow::getSportCondition, healthDiseaseFollow.getSportCondition());
        }
        if (StringUtil.isNotEmpty(healthDiseaseFollow.getPsychologyCondition())) {
            queryWrapper.eq(HealthDiseaseFollow::getPsychologyCondition, healthDiseaseFollow.getPsychologyCondition());
        }
        if (StringUtil.isNotEmpty(healthDiseaseFollow.getHealthContext())) {
            queryWrapper.eq(HealthDiseaseFollow::getHealthContext, healthDiseaseFollow.getHealthContext());
        }
        if (StringUtil.isNotEmpty(healthDiseaseFollow.getMemo())) {
            queryWrapper.eq(HealthDiseaseFollow::getMemo, healthDiseaseFollow.getMemo());
        }
        if (healthDiseaseFollow.getAreaCode() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getAreaCode, healthDiseaseFollow.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthDiseaseFollow.getAreaName())) {
            queryWrapper.eq(HealthDiseaseFollow::getAreaName, healthDiseaseFollow.getAreaName());
        }
        if (healthDiseaseFollow.getCreateUser() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getCreateUser, healthDiseaseFollow.getCreateUser());
        }
        if (healthDiseaseFollow.getCreateDept() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getCreateDept, healthDiseaseFollow.getCreateDept());
        }
        if (healthDiseaseFollow.getCreateTime() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getCreateTime, healthDiseaseFollow.getCreateTime());
        }
        if (healthDiseaseFollow.getUpdateUser() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getUpdateUser, healthDiseaseFollow.getUpdateUser());
        }
        if (healthDiseaseFollow.getUpdateTime() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getUpdateTime, healthDiseaseFollow.getUpdateTime());
        }
        if (healthDiseaseFollow.getIsDeleted() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getIsDeleted, healthDiseaseFollow.getIsDeleted());
        }
        if (healthDiseaseFollow.getStatus() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getStatus, healthDiseaseFollow.getStatus());
        }
        if (StringUtil.isNotEmpty(healthDiseaseFollow.getRecordName())) {
            queryWrapper.eq(HealthDiseaseFollow::getRecordName, healthDiseaseFollow.getRecordName());
        }
        if (healthDiseaseFollow.getRecordDatetime() != null) {
            queryWrapper.eq(HealthDiseaseFollow::getRecordDatetime, healthDiseaseFollow.getRecordDatetime());
        }
        if (StringUtil.isNotEmpty(healthDiseaseFollow.getTenantId())) {
            queryWrapper.eq(HealthDiseaseFollow::getTenantId, healthDiseaseFollow.getTenantId());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthDiseaseFollow 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthDiseaseFollow insert(HealthDiseaseFollow healthDiseaseFollow) {
        healthDiseaseFollow.setId(null);
        getBaseMapper().insert(healthDiseaseFollow);
        return healthDiseaseFollow;
    }

    /**
    * 更新数据
    *
    * @param healthDiseaseFollow 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthDiseaseFollow update(HealthDiseaseFollow healthDiseaseFollow) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthDiseaseFollow> chainWrapper = new LambdaUpdateChainWrapper<HealthDiseaseFollow>(getBaseMapper());
        if (healthDiseaseFollow.getId() != null) {
            chainWrapper.set(HealthDiseaseFollow::getId, healthDiseaseFollow.getId());
        }
        if (healthDiseaseFollow.getInterventionsId() != null) {
            chainWrapper.set(HealthDiseaseFollow::getInterventionsId, healthDiseaseFollow.getInterventionsId());
        }
        if (healthDiseaseFollow.getElderId() != null) {
            chainWrapper.set(HealthDiseaseFollow::getElderId, healthDiseaseFollow.getElderId());
        }
        if (StringUtil.isNotBlank(healthDiseaseFollow.getMedicationCondition())) {
            chainWrapper.set(HealthDiseaseFollow::getMedicationCondition, healthDiseaseFollow.getMedicationCondition());
        }
        if (StringUtil.isNotBlank(healthDiseaseFollow.getDietCondition())) {
            chainWrapper.set(HealthDiseaseFollow::getDietCondition, healthDiseaseFollow.getDietCondition());
        }
        if (StringUtil.isNotBlank(healthDiseaseFollow.getSportCondition())) {
            chainWrapper.set(HealthDiseaseFollow::getSportCondition, healthDiseaseFollow.getSportCondition());
        }
        if (StringUtil.isNotBlank(healthDiseaseFollow.getPsychologyCondition())) {
            chainWrapper.set(HealthDiseaseFollow::getPsychologyCondition, healthDiseaseFollow.getPsychologyCondition());
        }
        if (StringUtil.isNotBlank(healthDiseaseFollow.getHealthContext())) {
            chainWrapper.set(HealthDiseaseFollow::getHealthContext, healthDiseaseFollow.getHealthContext());
        }
        if (StringUtil.isNotBlank(healthDiseaseFollow.getMemo())) {
            chainWrapper.set(HealthDiseaseFollow::getMemo, healthDiseaseFollow.getMemo());
        }
        if (healthDiseaseFollow.getAreaCode() != null) {
            chainWrapper.set(HealthDiseaseFollow::getAreaCode, healthDiseaseFollow.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthDiseaseFollow.getAreaName())) {
            chainWrapper.set(HealthDiseaseFollow::getAreaName, healthDiseaseFollow.getAreaName());
        }
        if (healthDiseaseFollow.getCreateUser() != null) {
            chainWrapper.set(HealthDiseaseFollow::getCreateUser, healthDiseaseFollow.getCreateUser());
        }
        if (healthDiseaseFollow.getCreateDept() != null) {
            chainWrapper.set(HealthDiseaseFollow::getCreateDept, healthDiseaseFollow.getCreateDept());
        }
        if (healthDiseaseFollow.getCreateTime() != null) {
            chainWrapper.set(HealthDiseaseFollow::getCreateTime, healthDiseaseFollow.getCreateTime());
        }
        if (healthDiseaseFollow.getUpdateUser() != null) {
            chainWrapper.set(HealthDiseaseFollow::getUpdateUser, healthDiseaseFollow.getUpdateUser());
        }
        if (healthDiseaseFollow.getUpdateTime() != null) {
            chainWrapper.set(HealthDiseaseFollow::getUpdateTime, healthDiseaseFollow.getUpdateTime());
        }
        if (healthDiseaseFollow.getIsDeleted() != null) {
            chainWrapper.set(HealthDiseaseFollow::getIsDeleted, healthDiseaseFollow.getIsDeleted());
        }
        if (healthDiseaseFollow.getStatus() != null) {
            chainWrapper.set(HealthDiseaseFollow::getStatus, healthDiseaseFollow.getStatus());
        }
        if (StringUtil.isNotBlank(healthDiseaseFollow.getRecordName())) {
            chainWrapper.set(HealthDiseaseFollow::getRecordName, healthDiseaseFollow.getRecordName());
        }
        if (healthDiseaseFollow.getRecordDatetime() != null) {
            chainWrapper.set(HealthDiseaseFollow::getRecordDatetime, healthDiseaseFollow.getRecordDatetime());
        }
        if (StringUtil.isNotBlank(healthDiseaseFollow.getTenantId())) {
            chainWrapper.set(HealthDiseaseFollow::getTenantId, healthDiseaseFollow.getTenantId());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthDiseaseFollow::getId, healthDiseaseFollow.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthDiseaseFollow.getId());
        } else {
            return healthDiseaseFollow;
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
    public boolean saveHealthDiseaseFollowBatch(List<HealthDiseaseFollow> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthDiseaseFollow healthDiseaseFollow : insertList) {
            //使用默认的雪花算法生成
            healthDiseaseFollow.setId(null);
            //healthDiseaseFollow.setCreatedDt(currentDte);
            //healthDiseaseFollow.setUpdatedDt(currentDte);
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
    public Integer deleteHealthDiseaseFollowBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthDiseaseFollow> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


