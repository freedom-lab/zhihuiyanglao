package cn.pluss.platform.service.healthEyesight.impl;

import cn.pluss.platform.mapper.HealthEyesightMapper;
import cn.pluss.platform.model.entity.HealthEyesight;
import cn.pluss.platform.service.healthEyesight.HealthEyesightService;
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
@Service("healthEyesightService")
public class HealthEyesightServiceImpl extends ServiceImpl< HealthEyesightMapper, HealthEyesight> implements HealthEyesightService {
    private static final Logger logger = LoggerFactory.getLogger(HealthEyesightServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthEyesight> queryPage(Map map) {
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
    public HealthEyesight queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthEyesight 实例对象
    * @return 实例对象
    */
    @Override
    public HealthEyesight queryOne(HealthEyesight healthEyesight){
        LambdaQueryWrapper<HealthEyesight> queryWrapper = getQueryWrapper(healthEyesight);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthEyesight
    * @return
    */
    @Override
    public List<HealthEyesight> queryList(HealthEyesight healthEyesight) {
        LambdaQueryWrapper<HealthEyesight> queryWrapper = getQueryWrapper(healthEyesight);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthEyesight
    * @return
    */
    public static LambdaQueryWrapper<HealthEyesight> getQueryWrapper(HealthEyesight healthEyesight){
        LambdaQueryWrapper<HealthEyesight> queryWrapper = new LambdaQueryWrapper<>();
        if (healthEyesight.getId() != null) {
            queryWrapper.eq(HealthEyesight::getId, healthEyesight.getId());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getTenantId())) {
            queryWrapper.eq(HealthEyesight::getTenantId, healthEyesight.getTenantId());
        }
        if (healthEyesight.getCorpId() != null) {
            queryWrapper.eq(HealthEyesight::getCorpId, healthEyesight.getCorpId());
        }
        if (healthEyesight.getInstitutionId() != null) {
            queryWrapper.eq(HealthEyesight::getInstitutionId, healthEyesight.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getInstitutionName())) {
            queryWrapper.eq(HealthEyesight::getInstitutionName, healthEyesight.getInstitutionName());
        }
        if (healthEyesight.getElderId() != null) {
            queryWrapper.eq(HealthEyesight::getElderId, healthEyesight.getElderId());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getElderName())) {
            queryWrapper.eq(HealthEyesight::getElderName, healthEyesight.getElderName());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getIdCard())) {
            queryWrapper.eq(HealthEyesight::getIdCard, healthEyesight.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getSex())) {
            queryWrapper.eq(HealthEyesight::getSex, healthEyesight.getSex());
        }
        if (healthEyesight.getAge() != null) {
            queryWrapper.eq(HealthEyesight::getAge, healthEyesight.getAge());
        }
        if (healthEyesight.getGaugeTime() != null) {
            queryWrapper.eq(HealthEyesight::getGaugeTime, healthEyesight.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getGaugeType())) {
            queryWrapper.eq(HealthEyesight::getGaugeType, healthEyesight.getGaugeType());
        }
        if (healthEyesight.getLeftEyesightState() != null) {
            queryWrapper.eq(HealthEyesight::getLeftEyesightState, healthEyesight.getLeftEyesightState());
        }
        if (healthEyesight.getRightEyesightState() != null) {
            queryWrapper.eq(HealthEyesight::getRightEyesightState, healthEyesight.getRightEyesightState());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getOpinion())) {
            queryWrapper.eq(HealthEyesight::getOpinion, healthEyesight.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getWarnFlag())) {
            queryWrapper.eq(HealthEyesight::getWarnFlag, healthEyesight.getWarnFlag());
        }
        if (healthEyesight.getAreaCode() != null) {
            queryWrapper.eq(HealthEyesight::getAreaCode, healthEyesight.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getAreaName())) {
            queryWrapper.eq(HealthEyesight::getAreaName, healthEyesight.getAreaName());
        }
        if (healthEyesight.getCreateUser() != null) {
            queryWrapper.eq(HealthEyesight::getCreateUser, healthEyesight.getCreateUser());
        }
        if (healthEyesight.getCreateDept() != null) {
            queryWrapper.eq(HealthEyesight::getCreateDept, healthEyesight.getCreateDept());
        }
        if (healthEyesight.getCreateTime() != null) {
            queryWrapper.eq(HealthEyesight::getCreateTime, healthEyesight.getCreateTime());
        }
        if (healthEyesight.getUpdateUser() != null) {
            queryWrapper.eq(HealthEyesight::getUpdateUser, healthEyesight.getUpdateUser());
        }
        if (healthEyesight.getUpdateTime() != null) {
            queryWrapper.eq(HealthEyesight::getUpdateTime, healthEyesight.getUpdateTime());
        }
        if (healthEyesight.getIsDeleted() != null) {
            queryWrapper.eq(HealthEyesight::getIsDeleted, healthEyesight.getIsDeleted());
        }
        if (healthEyesight.getStatus() != null) {
            queryWrapper.eq(HealthEyesight::getStatus, healthEyesight.getStatus());
        }
        if (StringUtil.isNotEmpty(healthEyesight.getDataSource())) {
            queryWrapper.eq(HealthEyesight::getDataSource, healthEyesight.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthEyesight 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthEyesight insert(HealthEyesight healthEyesight) {
        healthEyesight.setId(null);
        getBaseMapper().insert(healthEyesight);
        return healthEyesight;
    }

    /**
    * 更新数据
    *
    * @param healthEyesight 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthEyesight update(HealthEyesight healthEyesight) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthEyesight> chainWrapper = new LambdaUpdateChainWrapper<HealthEyesight>(getBaseMapper());
        if (healthEyesight.getId() != null) {
            chainWrapper.set(HealthEyesight::getId, healthEyesight.getId());
        }
        if (StringUtil.isNotBlank(healthEyesight.getTenantId())) {
            chainWrapper.set(HealthEyesight::getTenantId, healthEyesight.getTenantId());
        }
        if (healthEyesight.getCorpId() != null) {
            chainWrapper.set(HealthEyesight::getCorpId, healthEyesight.getCorpId());
        }
        if (healthEyesight.getInstitutionId() != null) {
            chainWrapper.set(HealthEyesight::getInstitutionId, healthEyesight.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthEyesight.getInstitutionName())) {
            chainWrapper.set(HealthEyesight::getInstitutionName, healthEyesight.getInstitutionName());
        }
        if (healthEyesight.getElderId() != null) {
            chainWrapper.set(HealthEyesight::getElderId, healthEyesight.getElderId());
        }
        if (StringUtil.isNotBlank(healthEyesight.getElderName())) {
            chainWrapper.set(HealthEyesight::getElderName, healthEyesight.getElderName());
        }
        if (StringUtil.isNotBlank(healthEyesight.getIdCard())) {
            chainWrapper.set(HealthEyesight::getIdCard, healthEyesight.getIdCard());
        }
        if (StringUtil.isNotBlank(healthEyesight.getSex())) {
            chainWrapper.set(HealthEyesight::getSex, healthEyesight.getSex());
        }
        if (healthEyesight.getAge() != null) {
            chainWrapper.set(HealthEyesight::getAge, healthEyesight.getAge());
        }
        if (healthEyesight.getGaugeTime() != null) {
            chainWrapper.set(HealthEyesight::getGaugeTime, healthEyesight.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthEyesight.getGaugeType())) {
            chainWrapper.set(HealthEyesight::getGaugeType, healthEyesight.getGaugeType());
        }
        if (healthEyesight.getLeftEyesightState() != null) {
            chainWrapper.set(HealthEyesight::getLeftEyesightState, healthEyesight.getLeftEyesightState());
        }
        if (healthEyesight.getRightEyesightState() != null) {
            chainWrapper.set(HealthEyesight::getRightEyesightState, healthEyesight.getRightEyesightState());
        }
        if (StringUtil.isNotBlank(healthEyesight.getOpinion())) {
            chainWrapper.set(HealthEyesight::getOpinion, healthEyesight.getOpinion());
        }
        if (StringUtil.isNotBlank(healthEyesight.getWarnFlag())) {
            chainWrapper.set(HealthEyesight::getWarnFlag, healthEyesight.getWarnFlag());
        }
        if (healthEyesight.getAreaCode() != null) {
            chainWrapper.set(HealthEyesight::getAreaCode, healthEyesight.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthEyesight.getAreaName())) {
            chainWrapper.set(HealthEyesight::getAreaName, healthEyesight.getAreaName());
        }
        if (healthEyesight.getCreateUser() != null) {
            chainWrapper.set(HealthEyesight::getCreateUser, healthEyesight.getCreateUser());
        }
        if (healthEyesight.getCreateDept() != null) {
            chainWrapper.set(HealthEyesight::getCreateDept, healthEyesight.getCreateDept());
        }
        if (healthEyesight.getCreateTime() != null) {
            chainWrapper.set(HealthEyesight::getCreateTime, healthEyesight.getCreateTime());
        }
        if (healthEyesight.getUpdateUser() != null) {
            chainWrapper.set(HealthEyesight::getUpdateUser, healthEyesight.getUpdateUser());
        }
        if (healthEyesight.getUpdateTime() != null) {
            chainWrapper.set(HealthEyesight::getUpdateTime, healthEyesight.getUpdateTime());
        }
        if (healthEyesight.getIsDeleted() != null) {
            chainWrapper.set(HealthEyesight::getIsDeleted, healthEyesight.getIsDeleted());
        }
        if (healthEyesight.getStatus() != null) {
            chainWrapper.set(HealthEyesight::getStatus, healthEyesight.getStatus());
        }
        if (StringUtil.isNotBlank(healthEyesight.getDataSource())) {
            chainWrapper.set(HealthEyesight::getDataSource, healthEyesight.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthEyesight::getId, healthEyesight.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthEyesight.getId());
        } else {
            return healthEyesight;
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
    public boolean saveHealthEyesightBatch(List<HealthEyesight> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthEyesight healthEyesight : insertList) {
            //使用默认的雪花算法生成
            healthEyesight.setId(null);
            //healthEyesight.setCreatedDt(currentDte);
            //healthEyesight.setUpdatedDt(currentDte);
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
    public Integer deleteHealthEyesightBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthEyesight> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


