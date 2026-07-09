package cn.pluss.platform.service.healthBloodKetone.impl;

import cn.pluss.platform.mapper.HealthBloodKetoneMapper;
import cn.pluss.platform.model.entity.HealthBloodKetone;
import cn.pluss.platform.service.healthBloodKetone.HealthBloodKetoneService;
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
@Service("healthBloodKetoneService")
public class HealthBloodKetoneServiceImpl extends ServiceImpl< HealthBloodKetoneMapper, HealthBloodKetone> implements HealthBloodKetoneService {
    private static final Logger logger = LoggerFactory.getLogger(HealthBloodKetoneServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthBloodKetone> queryPage(Map map) {
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
    public HealthBloodKetone queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthBloodKetone 实例对象
    * @return 实例对象
    */
    @Override
    public HealthBloodKetone queryOne(HealthBloodKetone healthBloodKetone){
        LambdaQueryWrapper<HealthBloodKetone> queryWrapper = getQueryWrapper(healthBloodKetone);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthBloodKetone
    * @return
    */
    @Override
    public List<HealthBloodKetone> queryList(HealthBloodKetone healthBloodKetone) {
        LambdaQueryWrapper<HealthBloodKetone> queryWrapper = getQueryWrapper(healthBloodKetone);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthBloodKetone
    * @return
    */
    public static LambdaQueryWrapper<HealthBloodKetone> getQueryWrapper(HealthBloodKetone healthBloodKetone){
        LambdaQueryWrapper<HealthBloodKetone> queryWrapper = new LambdaQueryWrapper<>();
        if (healthBloodKetone.getId() != null) {
            queryWrapper.eq(HealthBloodKetone::getId, healthBloodKetone.getId());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getTenantId())) {
            queryWrapper.eq(HealthBloodKetone::getTenantId, healthBloodKetone.getTenantId());
        }
        if (healthBloodKetone.getCorpId() != null) {
            queryWrapper.eq(HealthBloodKetone::getCorpId, healthBloodKetone.getCorpId());
        }
        if (healthBloodKetone.getInstitutionId() != null) {
            queryWrapper.eq(HealthBloodKetone::getInstitutionId, healthBloodKetone.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getInstitutionName())) {
            queryWrapper.eq(HealthBloodKetone::getInstitutionName, healthBloodKetone.getInstitutionName());
        }
        if (healthBloodKetone.getElderId() != null) {
            queryWrapper.eq(HealthBloodKetone::getElderId, healthBloodKetone.getElderId());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getElderName())) {
            queryWrapper.eq(HealthBloodKetone::getElderName, healthBloodKetone.getElderName());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getIdCard())) {
            queryWrapper.eq(HealthBloodKetone::getIdCard, healthBloodKetone.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getSex())) {
            queryWrapper.eq(HealthBloodKetone::getSex, healthBloodKetone.getSex());
        }
        if (healthBloodKetone.getAge() != null) {
            queryWrapper.eq(HealthBloodKetone::getAge, healthBloodKetone.getAge());
        }
        if (healthBloodKetone.getGaugeTime() != null) {
            queryWrapper.eq(HealthBloodKetone::getGaugeTime, healthBloodKetone.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getGaugeType())) {
            queryWrapper.eq(HealthBloodKetone::getGaugeType, healthBloodKetone.getGaugeType());
        }
        if (healthBloodKetone.getHCYState() != null) {
            queryWrapper.eq(HealthBloodKetone::getHCYState, healthBloodKetone.getHCYState());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getOpinion())) {
            queryWrapper.eq(HealthBloodKetone::getOpinion, healthBloodKetone.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getWarnFlag())) {
            queryWrapper.eq(HealthBloodKetone::getWarnFlag, healthBloodKetone.getWarnFlag());
        }
        if (healthBloodKetone.getAreaCode() != null) {
            queryWrapper.eq(HealthBloodKetone::getAreaCode, healthBloodKetone.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getAreaName())) {
            queryWrapper.eq(HealthBloodKetone::getAreaName, healthBloodKetone.getAreaName());
        }
        if (healthBloodKetone.getCreateUser() != null) {
            queryWrapper.eq(HealthBloodKetone::getCreateUser, healthBloodKetone.getCreateUser());
        }
        if (healthBloodKetone.getCreateDept() != null) {
            queryWrapper.eq(HealthBloodKetone::getCreateDept, healthBloodKetone.getCreateDept());
        }
        if (healthBloodKetone.getCreateTime() != null) {
            queryWrapper.eq(HealthBloodKetone::getCreateTime, healthBloodKetone.getCreateTime());
        }
        if (healthBloodKetone.getUpdateUser() != null) {
            queryWrapper.eq(HealthBloodKetone::getUpdateUser, healthBloodKetone.getUpdateUser());
        }
        if (healthBloodKetone.getUpdateTime() != null) {
            queryWrapper.eq(HealthBloodKetone::getUpdateTime, healthBloodKetone.getUpdateTime());
        }
        if (healthBloodKetone.getIsDeleted() != null) {
            queryWrapper.eq(HealthBloodKetone::getIsDeleted, healthBloodKetone.getIsDeleted());
        }
        if (healthBloodKetone.getStatus() != null) {
            queryWrapper.eq(HealthBloodKetone::getStatus, healthBloodKetone.getStatus());
        }
        if (StringUtil.isNotEmpty(healthBloodKetone.getDataSource())) {
            queryWrapper.eq(HealthBloodKetone::getDataSource, healthBloodKetone.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthBloodKetone 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodKetone insert(HealthBloodKetone healthBloodKetone) {
        healthBloodKetone.setId(null);
        getBaseMapper().insert(healthBloodKetone);
        return healthBloodKetone;
    }

    /**
    * 更新数据
    *
    * @param healthBloodKetone 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodKetone update(HealthBloodKetone healthBloodKetone) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthBloodKetone> chainWrapper = new LambdaUpdateChainWrapper<HealthBloodKetone>(getBaseMapper());
        if (healthBloodKetone.getId() != null) {
            chainWrapper.set(HealthBloodKetone::getId, healthBloodKetone.getId());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getTenantId())) {
            chainWrapper.set(HealthBloodKetone::getTenantId, healthBloodKetone.getTenantId());
        }
        if (healthBloodKetone.getCorpId() != null) {
            chainWrapper.set(HealthBloodKetone::getCorpId, healthBloodKetone.getCorpId());
        }
        if (healthBloodKetone.getInstitutionId() != null) {
            chainWrapper.set(HealthBloodKetone::getInstitutionId, healthBloodKetone.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getInstitutionName())) {
            chainWrapper.set(HealthBloodKetone::getInstitutionName, healthBloodKetone.getInstitutionName());
        }
        if (healthBloodKetone.getElderId() != null) {
            chainWrapper.set(HealthBloodKetone::getElderId, healthBloodKetone.getElderId());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getElderName())) {
            chainWrapper.set(HealthBloodKetone::getElderName, healthBloodKetone.getElderName());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getIdCard())) {
            chainWrapper.set(HealthBloodKetone::getIdCard, healthBloodKetone.getIdCard());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getSex())) {
            chainWrapper.set(HealthBloodKetone::getSex, healthBloodKetone.getSex());
        }
        if (healthBloodKetone.getAge() != null) {
            chainWrapper.set(HealthBloodKetone::getAge, healthBloodKetone.getAge());
        }
        if (healthBloodKetone.getGaugeTime() != null) {
            chainWrapper.set(HealthBloodKetone::getGaugeTime, healthBloodKetone.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getGaugeType())) {
            chainWrapper.set(HealthBloodKetone::getGaugeType, healthBloodKetone.getGaugeType());
        }
        if (healthBloodKetone.getHCYState() != null) {
            chainWrapper.set(HealthBloodKetone::getHCYState, healthBloodKetone.getHCYState());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getOpinion())) {
            chainWrapper.set(HealthBloodKetone::getOpinion, healthBloodKetone.getOpinion());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getWarnFlag())) {
            chainWrapper.set(HealthBloodKetone::getWarnFlag, healthBloodKetone.getWarnFlag());
        }
        if (healthBloodKetone.getAreaCode() != null) {
            chainWrapper.set(HealthBloodKetone::getAreaCode, healthBloodKetone.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getAreaName())) {
            chainWrapper.set(HealthBloodKetone::getAreaName, healthBloodKetone.getAreaName());
        }
        if (healthBloodKetone.getCreateUser() != null) {
            chainWrapper.set(HealthBloodKetone::getCreateUser, healthBloodKetone.getCreateUser());
        }
        if (healthBloodKetone.getCreateDept() != null) {
            chainWrapper.set(HealthBloodKetone::getCreateDept, healthBloodKetone.getCreateDept());
        }
        if (healthBloodKetone.getCreateTime() != null) {
            chainWrapper.set(HealthBloodKetone::getCreateTime, healthBloodKetone.getCreateTime());
        }
        if (healthBloodKetone.getUpdateUser() != null) {
            chainWrapper.set(HealthBloodKetone::getUpdateUser, healthBloodKetone.getUpdateUser());
        }
        if (healthBloodKetone.getUpdateTime() != null) {
            chainWrapper.set(HealthBloodKetone::getUpdateTime, healthBloodKetone.getUpdateTime());
        }
        if (healthBloodKetone.getIsDeleted() != null) {
            chainWrapper.set(HealthBloodKetone::getIsDeleted, healthBloodKetone.getIsDeleted());
        }
        if (healthBloodKetone.getStatus() != null) {
            chainWrapper.set(HealthBloodKetone::getStatus, healthBloodKetone.getStatus());
        }
        if (StringUtil.isNotBlank(healthBloodKetone.getDataSource())) {
            chainWrapper.set(HealthBloodKetone::getDataSource, healthBloodKetone.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthBloodKetone::getId, healthBloodKetone.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthBloodKetone.getId());
        } else {
            return healthBloodKetone;
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
    public boolean saveHealthBloodKetoneBatch(List<HealthBloodKetone> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthBloodKetone healthBloodKetone : insertList) {
            //使用默认的雪花算法生成
            healthBloodKetone.setId(null);
            //healthBloodKetone.setCreatedDt(currentDte);
            //healthBloodKetone.setUpdatedDt(currentDte);
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
    public Integer deleteHealthBloodKetoneBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthBloodKetone> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


