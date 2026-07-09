package cn.pluss.platform.service.healthBoneDensity.impl;

import cn.pluss.platform.mapper.HealthBoneDensityMapper;
import cn.pluss.platform.model.entity.HealthBoneDensity;
import cn.pluss.platform.service.healthBoneDensity.HealthBoneDensityService;
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
@Service("healthBoneDensityService")
public class HealthBoneDensityServiceImpl extends ServiceImpl< HealthBoneDensityMapper, HealthBoneDensity> implements HealthBoneDensityService {
    private static final Logger logger = LoggerFactory.getLogger(HealthBoneDensityServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthBoneDensity> queryPage(Map map) {
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
    public HealthBoneDensity queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthBoneDensity 实例对象
    * @return 实例对象
    */
    @Override
    public HealthBoneDensity queryOne(HealthBoneDensity healthBoneDensity){
        LambdaQueryWrapper<HealthBoneDensity> queryWrapper = getQueryWrapper(healthBoneDensity);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthBoneDensity
    * @return
    */
    @Override
    public List<HealthBoneDensity> queryList(HealthBoneDensity healthBoneDensity) {
        LambdaQueryWrapper<HealthBoneDensity> queryWrapper = getQueryWrapper(healthBoneDensity);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthBoneDensity
    * @return
    */
    public static LambdaQueryWrapper<HealthBoneDensity> getQueryWrapper(HealthBoneDensity healthBoneDensity){
        LambdaQueryWrapper<HealthBoneDensity> queryWrapper = new LambdaQueryWrapper<>();
        if (healthBoneDensity.getId() != null) {
            queryWrapper.eq(HealthBoneDensity::getId, healthBoneDensity.getId());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getTenantId())) {
            queryWrapper.eq(HealthBoneDensity::getTenantId, healthBoneDensity.getTenantId());
        }
        if (healthBoneDensity.getCorpId() != null) {
            queryWrapper.eq(HealthBoneDensity::getCorpId, healthBoneDensity.getCorpId());
        }
        if (healthBoneDensity.getInstitutionId() != null) {
            queryWrapper.eq(HealthBoneDensity::getInstitutionId, healthBoneDensity.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getInstitutionName())) {
            queryWrapper.eq(HealthBoneDensity::getInstitutionName, healthBoneDensity.getInstitutionName());
        }
        if (healthBoneDensity.getElderId() != null) {
            queryWrapper.eq(HealthBoneDensity::getElderId, healthBoneDensity.getElderId());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getElderName())) {
            queryWrapper.eq(HealthBoneDensity::getElderName, healthBoneDensity.getElderName());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getIdCard())) {
            queryWrapper.eq(HealthBoneDensity::getIdCard, healthBoneDensity.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getSex())) {
            queryWrapper.eq(HealthBoneDensity::getSex, healthBoneDensity.getSex());
        }
        if (healthBoneDensity.getAge() != null) {
            queryWrapper.eq(HealthBoneDensity::getAge, healthBoneDensity.getAge());
        }
        if (healthBoneDensity.getGaugeTime() != null) {
            queryWrapper.eq(HealthBoneDensity::getGaugeTime, healthBoneDensity.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getGaugeType())) {
            queryWrapper.eq(HealthBoneDensity::getGaugeType, healthBoneDensity.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getPosition())) {
            queryWrapper.eq(HealthBoneDensity::getPosition, healthBoneDensity.getPosition());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getBoneResult())) {
            queryWrapper.eq(HealthBoneDensity::getBoneResult, healthBoneDensity.getBoneResult());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getOpinion())) {
            queryWrapper.eq(HealthBoneDensity::getOpinion, healthBoneDensity.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getWarnFlag())) {
            queryWrapper.eq(HealthBoneDensity::getWarnFlag, healthBoneDensity.getWarnFlag());
        }
        if (healthBoneDensity.getAreaCode() != null) {
            queryWrapper.eq(HealthBoneDensity::getAreaCode, healthBoneDensity.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getAreaName())) {
            queryWrapper.eq(HealthBoneDensity::getAreaName, healthBoneDensity.getAreaName());
        }
        if (healthBoneDensity.getCreateUser() != null) {
            queryWrapper.eq(HealthBoneDensity::getCreateUser, healthBoneDensity.getCreateUser());
        }
        if (healthBoneDensity.getCreateDept() != null) {
            queryWrapper.eq(HealthBoneDensity::getCreateDept, healthBoneDensity.getCreateDept());
        }
        if (healthBoneDensity.getCreateTime() != null) {
            queryWrapper.eq(HealthBoneDensity::getCreateTime, healthBoneDensity.getCreateTime());
        }
        if (healthBoneDensity.getUpdateUser() != null) {
            queryWrapper.eq(HealthBoneDensity::getUpdateUser, healthBoneDensity.getUpdateUser());
        }
        if (healthBoneDensity.getUpdateTime() != null) {
            queryWrapper.eq(HealthBoneDensity::getUpdateTime, healthBoneDensity.getUpdateTime());
        }
        if (healthBoneDensity.getIsDeleted() != null) {
            queryWrapper.eq(HealthBoneDensity::getIsDeleted, healthBoneDensity.getIsDeleted());
        }
        if (healthBoneDensity.getStatus() != null) {
            queryWrapper.eq(HealthBoneDensity::getStatus, healthBoneDensity.getStatus());
        }
        if (StringUtil.isNotEmpty(healthBoneDensity.getDataSource())) {
            queryWrapper.eq(HealthBoneDensity::getDataSource, healthBoneDensity.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthBoneDensity 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBoneDensity insert(HealthBoneDensity healthBoneDensity) {
        healthBoneDensity.setId(null);
        getBaseMapper().insert(healthBoneDensity);
        return healthBoneDensity;
    }

    /**
    * 更新数据
    *
    * @param healthBoneDensity 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBoneDensity update(HealthBoneDensity healthBoneDensity) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthBoneDensity> chainWrapper = new LambdaUpdateChainWrapper<HealthBoneDensity>(getBaseMapper());
        if (healthBoneDensity.getId() != null) {
            chainWrapper.set(HealthBoneDensity::getId, healthBoneDensity.getId());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getTenantId())) {
            chainWrapper.set(HealthBoneDensity::getTenantId, healthBoneDensity.getTenantId());
        }
        if (healthBoneDensity.getCorpId() != null) {
            chainWrapper.set(HealthBoneDensity::getCorpId, healthBoneDensity.getCorpId());
        }
        if (healthBoneDensity.getInstitutionId() != null) {
            chainWrapper.set(HealthBoneDensity::getInstitutionId, healthBoneDensity.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getInstitutionName())) {
            chainWrapper.set(HealthBoneDensity::getInstitutionName, healthBoneDensity.getInstitutionName());
        }
        if (healthBoneDensity.getElderId() != null) {
            chainWrapper.set(HealthBoneDensity::getElderId, healthBoneDensity.getElderId());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getElderName())) {
            chainWrapper.set(HealthBoneDensity::getElderName, healthBoneDensity.getElderName());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getIdCard())) {
            chainWrapper.set(HealthBoneDensity::getIdCard, healthBoneDensity.getIdCard());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getSex())) {
            chainWrapper.set(HealthBoneDensity::getSex, healthBoneDensity.getSex());
        }
        if (healthBoneDensity.getAge() != null) {
            chainWrapper.set(HealthBoneDensity::getAge, healthBoneDensity.getAge());
        }
        if (healthBoneDensity.getGaugeTime() != null) {
            chainWrapper.set(HealthBoneDensity::getGaugeTime, healthBoneDensity.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getGaugeType())) {
            chainWrapper.set(HealthBoneDensity::getGaugeType, healthBoneDensity.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getPosition())) {
            chainWrapper.set(HealthBoneDensity::getPosition, healthBoneDensity.getPosition());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getBoneResult())) {
            chainWrapper.set(HealthBoneDensity::getBoneResult, healthBoneDensity.getBoneResult());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getOpinion())) {
            chainWrapper.set(HealthBoneDensity::getOpinion, healthBoneDensity.getOpinion());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getWarnFlag())) {
            chainWrapper.set(HealthBoneDensity::getWarnFlag, healthBoneDensity.getWarnFlag());
        }
        if (healthBoneDensity.getAreaCode() != null) {
            chainWrapper.set(HealthBoneDensity::getAreaCode, healthBoneDensity.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getAreaName())) {
            chainWrapper.set(HealthBoneDensity::getAreaName, healthBoneDensity.getAreaName());
        }
        if (healthBoneDensity.getCreateUser() != null) {
            chainWrapper.set(HealthBoneDensity::getCreateUser, healthBoneDensity.getCreateUser());
        }
        if (healthBoneDensity.getCreateDept() != null) {
            chainWrapper.set(HealthBoneDensity::getCreateDept, healthBoneDensity.getCreateDept());
        }
        if (healthBoneDensity.getCreateTime() != null) {
            chainWrapper.set(HealthBoneDensity::getCreateTime, healthBoneDensity.getCreateTime());
        }
        if (healthBoneDensity.getUpdateUser() != null) {
            chainWrapper.set(HealthBoneDensity::getUpdateUser, healthBoneDensity.getUpdateUser());
        }
        if (healthBoneDensity.getUpdateTime() != null) {
            chainWrapper.set(HealthBoneDensity::getUpdateTime, healthBoneDensity.getUpdateTime());
        }
        if (healthBoneDensity.getIsDeleted() != null) {
            chainWrapper.set(HealthBoneDensity::getIsDeleted, healthBoneDensity.getIsDeleted());
        }
        if (healthBoneDensity.getStatus() != null) {
            chainWrapper.set(HealthBoneDensity::getStatus, healthBoneDensity.getStatus());
        }
        if (StringUtil.isNotBlank(healthBoneDensity.getDataSource())) {
            chainWrapper.set(HealthBoneDensity::getDataSource, healthBoneDensity.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthBoneDensity::getId, healthBoneDensity.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthBoneDensity.getId());
        } else {
            return healthBoneDensity;
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
    public boolean saveHealthBoneDensityBatch(List<HealthBoneDensity> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthBoneDensity healthBoneDensity : insertList) {
            //使用默认的雪花算法生成
            healthBoneDensity.setId(null);
            //healthBoneDensity.setCreatedDt(currentDte);
            //healthBoneDensity.setUpdatedDt(currentDte);
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
    public Integer deleteHealthBoneDensityBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthBoneDensity> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


