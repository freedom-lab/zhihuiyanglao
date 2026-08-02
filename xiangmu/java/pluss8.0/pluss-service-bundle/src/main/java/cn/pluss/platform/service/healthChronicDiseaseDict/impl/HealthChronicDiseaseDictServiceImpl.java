package cn.pluss.platform.service.healthChronicDiseaseDict.impl;

import cn.pluss.platform.mapper.HealthChronicDiseaseDictMapper;
import cn.pluss.platform.model.entity.HealthChronicDiseaseDict;
import cn.pluss.platform.service.healthChronicDiseaseDict.HealthChronicDiseaseDictService;
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
@Service("healthChronicDiseaseDictService")
public class HealthChronicDiseaseDictServiceImpl extends ServiceImpl< HealthChronicDiseaseDictMapper, HealthChronicDiseaseDict> implements HealthChronicDiseaseDictService {
    private static final Logger logger = LoggerFactory.getLogger(HealthChronicDiseaseDictServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthChronicDiseaseDict> queryPage(Map map) {
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
    public HealthChronicDiseaseDict queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthChronicDiseaseDict 实例对象
    * @return 实例对象
    */
    @Override
    public HealthChronicDiseaseDict queryOne(HealthChronicDiseaseDict healthChronicDiseaseDict){
        LambdaQueryWrapper<HealthChronicDiseaseDict> queryWrapper = getQueryWrapper(healthChronicDiseaseDict);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthChronicDiseaseDict
    * @return
    */
    @Override
    public List<HealthChronicDiseaseDict> queryList(HealthChronicDiseaseDict healthChronicDiseaseDict) {
        LambdaQueryWrapper<HealthChronicDiseaseDict> queryWrapper = getQueryWrapper(healthChronicDiseaseDict);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthChronicDiseaseDict
    * @return
    */
    public static LambdaQueryWrapper<HealthChronicDiseaseDict> getQueryWrapper(HealthChronicDiseaseDict healthChronicDiseaseDict){
        LambdaQueryWrapper<HealthChronicDiseaseDict> queryWrapper = new LambdaQueryWrapper<>();
        if (healthChronicDiseaseDict.getId() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getId, healthChronicDiseaseDict.getId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDict.getTenantId())) {
            queryWrapper.eq(HealthChronicDiseaseDict::getTenantId, healthChronicDiseaseDict.getTenantId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDict.getDiseaseName())) {
            queryWrapper.eq(HealthChronicDiseaseDict::getDiseaseName, healthChronicDiseaseDict.getDiseaseName());
        }
        if (healthChronicDiseaseDict.getParentId() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getParentId, healthChronicDiseaseDict.getParentId());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDict.getParentName())) {
            queryWrapper.eq(HealthChronicDiseaseDict::getParentName, healthChronicDiseaseDict.getParentName());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDict.getMedicationPlan())) {
            queryWrapper.eq(HealthChronicDiseaseDict::getMedicationPlan, healthChronicDiseaseDict.getMedicationPlan());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDict.getDietPlan())) {
            queryWrapper.eq(HealthChronicDiseaseDict::getDietPlan, healthChronicDiseaseDict.getDietPlan());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDict.getMonitoringPlan())) {
            queryWrapper.eq(HealthChronicDiseaseDict::getMonitoringPlan, healthChronicDiseaseDict.getMonitoringPlan());
        }
        if (healthChronicDiseaseDict.getSortNum() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getSortNum, healthChronicDiseaseDict.getSortNum());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDict.getRemark())) {
            queryWrapper.eq(HealthChronicDiseaseDict::getRemark, healthChronicDiseaseDict.getRemark());
        }
        if (healthChronicDiseaseDict.getCreateUser() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getCreateUser, healthChronicDiseaseDict.getCreateUser());
        }
        if (StringUtil.isNotEmpty(healthChronicDiseaseDict.getCreateName())) {
            queryWrapper.eq(HealthChronicDiseaseDict::getCreateName, healthChronicDiseaseDict.getCreateName());
        }
        if (healthChronicDiseaseDict.getCreateDept() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getCreateDept, healthChronicDiseaseDict.getCreateDept());
        }
        if (healthChronicDiseaseDict.getCreateTime() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getCreateTime, healthChronicDiseaseDict.getCreateTime());
        }
        if (healthChronicDiseaseDict.getUpdateUser() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getUpdateUser, healthChronicDiseaseDict.getUpdateUser());
        }
        if (healthChronicDiseaseDict.getUpdateTime() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getUpdateTime, healthChronicDiseaseDict.getUpdateTime());
        }
        if (healthChronicDiseaseDict.getIsDeleted() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getIsDeleted, healthChronicDiseaseDict.getIsDeleted());
        }
        if (healthChronicDiseaseDict.getStatus() != null) {
            queryWrapper.eq(HealthChronicDiseaseDict::getStatus, healthChronicDiseaseDict.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthChronicDiseaseDict 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthChronicDiseaseDict insert(HealthChronicDiseaseDict healthChronicDiseaseDict) {
        healthChronicDiseaseDict.setId(null);
        getBaseMapper().insert(healthChronicDiseaseDict);
        return healthChronicDiseaseDict;
    }

    /**
    * 更新数据
    *
    * @param healthChronicDiseaseDict 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthChronicDiseaseDict update(HealthChronicDiseaseDict healthChronicDiseaseDict) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthChronicDiseaseDict> chainWrapper = new LambdaUpdateChainWrapper<HealthChronicDiseaseDict>(getBaseMapper());
        if (healthChronicDiseaseDict.getId() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getId, healthChronicDiseaseDict.getId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDict.getTenantId())) {
            chainWrapper.set(HealthChronicDiseaseDict::getTenantId, healthChronicDiseaseDict.getTenantId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDict.getDiseaseName())) {
            chainWrapper.set(HealthChronicDiseaseDict::getDiseaseName, healthChronicDiseaseDict.getDiseaseName());
        }
        if (healthChronicDiseaseDict.getParentId() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getParentId, healthChronicDiseaseDict.getParentId());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDict.getParentName())) {
            chainWrapper.set(HealthChronicDiseaseDict::getParentName, healthChronicDiseaseDict.getParentName());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDict.getMedicationPlan())) {
            chainWrapper.set(HealthChronicDiseaseDict::getMedicationPlan, healthChronicDiseaseDict.getMedicationPlan());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDict.getDietPlan())) {
            chainWrapper.set(HealthChronicDiseaseDict::getDietPlan, healthChronicDiseaseDict.getDietPlan());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDict.getMonitoringPlan())) {
            chainWrapper.set(HealthChronicDiseaseDict::getMonitoringPlan, healthChronicDiseaseDict.getMonitoringPlan());
        }
        if (healthChronicDiseaseDict.getSortNum() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getSortNum, healthChronicDiseaseDict.getSortNum());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDict.getRemark())) {
            chainWrapper.set(HealthChronicDiseaseDict::getRemark, healthChronicDiseaseDict.getRemark());
        }
        if (healthChronicDiseaseDict.getCreateUser() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getCreateUser, healthChronicDiseaseDict.getCreateUser());
        }
        if (StringUtil.isNotBlank(healthChronicDiseaseDict.getCreateName())) {
            chainWrapper.set(HealthChronicDiseaseDict::getCreateName, healthChronicDiseaseDict.getCreateName());
        }
        if (healthChronicDiseaseDict.getCreateDept() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getCreateDept, healthChronicDiseaseDict.getCreateDept());
        }
        if (healthChronicDiseaseDict.getCreateTime() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getCreateTime, healthChronicDiseaseDict.getCreateTime());
        }
        if (healthChronicDiseaseDict.getUpdateUser() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getUpdateUser, healthChronicDiseaseDict.getUpdateUser());
        }
        if (healthChronicDiseaseDict.getUpdateTime() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getUpdateTime, healthChronicDiseaseDict.getUpdateTime());
        }
        if (healthChronicDiseaseDict.getIsDeleted() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getIsDeleted, healthChronicDiseaseDict.getIsDeleted());
        }
        if (healthChronicDiseaseDict.getStatus() != null) {
            chainWrapper.set(HealthChronicDiseaseDict::getStatus, healthChronicDiseaseDict.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthChronicDiseaseDict::getId, healthChronicDiseaseDict.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthChronicDiseaseDict.getId());
        } else {
            return healthChronicDiseaseDict;
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
    public boolean saveHealthChronicDiseaseDictBatch(List<HealthChronicDiseaseDict> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthChronicDiseaseDict healthChronicDiseaseDict : insertList) {
            //使用默认的雪花算法生成
            healthChronicDiseaseDict.setId(null);
            //healthChronicDiseaseDict.setCreatedDt(currentDte);
            //healthChronicDiseaseDict.setUpdatedDt(currentDte);
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
    public Integer deleteHealthChronicDiseaseDictBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthChronicDiseaseDict> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


