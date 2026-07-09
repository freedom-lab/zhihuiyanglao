package cn.pluss.platform.service.healthCardiovascular.impl;

import cn.pluss.platform.mapper.HealthCardiovascularMapper;
import cn.pluss.platform.model.entity.HealthCardiovascular;
import cn.pluss.platform.service.healthCardiovascular.HealthCardiovascularService;
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
@Service("healthCardiovascularService")
public class HealthCardiovascularServiceImpl extends ServiceImpl< HealthCardiovascularMapper, HealthCardiovascular> implements HealthCardiovascularService {
    private static final Logger logger = LoggerFactory.getLogger(HealthCardiovascularServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthCardiovascular> queryPage(Map map) {
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
    public HealthCardiovascular queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthCardiovascular 实例对象
    * @return 实例对象
    */
    @Override
    public HealthCardiovascular queryOne(HealthCardiovascular healthCardiovascular){
        LambdaQueryWrapper<HealthCardiovascular> queryWrapper = getQueryWrapper(healthCardiovascular);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthCardiovascular
    * @return
    */
    @Override
    public List<HealthCardiovascular> queryList(HealthCardiovascular healthCardiovascular) {
        LambdaQueryWrapper<HealthCardiovascular> queryWrapper = getQueryWrapper(healthCardiovascular);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthCardiovascular
    * @return
    */
    public static LambdaQueryWrapper<HealthCardiovascular> getQueryWrapper(HealthCardiovascular healthCardiovascular){
        LambdaQueryWrapper<HealthCardiovascular> queryWrapper = new LambdaQueryWrapper<>();
        if (healthCardiovascular.getId() != null) {
            queryWrapper.eq(HealthCardiovascular::getId, healthCardiovascular.getId());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getTenantId())) {
            queryWrapper.eq(HealthCardiovascular::getTenantId, healthCardiovascular.getTenantId());
        }
        if (healthCardiovascular.getCorpId() != null) {
            queryWrapper.eq(HealthCardiovascular::getCorpId, healthCardiovascular.getCorpId());
        }
        if (healthCardiovascular.getInstitutionId() != null) {
            queryWrapper.eq(HealthCardiovascular::getInstitutionId, healthCardiovascular.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getInstitutionName())) {
            queryWrapper.eq(HealthCardiovascular::getInstitutionName, healthCardiovascular.getInstitutionName());
        }
        if (healthCardiovascular.getElderId() != null) {
            queryWrapper.eq(HealthCardiovascular::getElderId, healthCardiovascular.getElderId());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getElderName())) {
            queryWrapper.eq(HealthCardiovascular::getElderName, healthCardiovascular.getElderName());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getIdCard())) {
            queryWrapper.eq(HealthCardiovascular::getIdCard, healthCardiovascular.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getSex())) {
            queryWrapper.eq(HealthCardiovascular::getSex, healthCardiovascular.getSex());
        }
        if (healthCardiovascular.getAge() != null) {
            queryWrapper.eq(HealthCardiovascular::getAge, healthCardiovascular.getAge());
        }
        if (healthCardiovascular.getGaugeTime() != null) {
            queryWrapper.eq(HealthCardiovascular::getGaugeTime, healthCardiovascular.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getGaugeType())) {
            queryWrapper.eq(HealthCardiovascular::getGaugeType, healthCardiovascular.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getVeinOne())) {
            queryWrapper.eq(HealthCardiovascular::getVeinOne, healthCardiovascular.getVeinOne());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getVeinTwo())) {
            queryWrapper.eq(HealthCardiovascular::getVeinTwo, healthCardiovascular.getVeinTwo());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getVeinThere())) {
            queryWrapper.eq(HealthCardiovascular::getVeinThere, healthCardiovascular.getVeinThere());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getVeinFour())) {
            queryWrapper.eq(HealthCardiovascular::getVeinFour, healthCardiovascular.getVeinFour());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getVeinFive())) {
            queryWrapper.eq(HealthCardiovascular::getVeinFive, healthCardiovascular.getVeinFive());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getVeinResult())) {
            queryWrapper.eq(HealthCardiovascular::getVeinResult, healthCardiovascular.getVeinResult());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getOpinion())) {
            queryWrapper.eq(HealthCardiovascular::getOpinion, healthCardiovascular.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getWarnFlag())) {
            queryWrapper.eq(HealthCardiovascular::getWarnFlag, healthCardiovascular.getWarnFlag());
        }
        if (healthCardiovascular.getAreaCode() != null) {
            queryWrapper.eq(HealthCardiovascular::getAreaCode, healthCardiovascular.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getAreaName())) {
            queryWrapper.eq(HealthCardiovascular::getAreaName, healthCardiovascular.getAreaName());
        }
        if (healthCardiovascular.getCreateUser() != null) {
            queryWrapper.eq(HealthCardiovascular::getCreateUser, healthCardiovascular.getCreateUser());
        }
        if (healthCardiovascular.getCreateDept() != null) {
            queryWrapper.eq(HealthCardiovascular::getCreateDept, healthCardiovascular.getCreateDept());
        }
        if (healthCardiovascular.getCreateTime() != null) {
            queryWrapper.eq(HealthCardiovascular::getCreateTime, healthCardiovascular.getCreateTime());
        }
        if (healthCardiovascular.getUpdateUser() != null) {
            queryWrapper.eq(HealthCardiovascular::getUpdateUser, healthCardiovascular.getUpdateUser());
        }
        if (healthCardiovascular.getUpdateTime() != null) {
            queryWrapper.eq(HealthCardiovascular::getUpdateTime, healthCardiovascular.getUpdateTime());
        }
        if (healthCardiovascular.getIsDeleted() != null) {
            queryWrapper.eq(HealthCardiovascular::getIsDeleted, healthCardiovascular.getIsDeleted());
        }
        if (healthCardiovascular.getStatus() != null) {
            queryWrapper.eq(HealthCardiovascular::getStatus, healthCardiovascular.getStatus());
        }
        if (StringUtil.isNotEmpty(healthCardiovascular.getDataSource())) {
            queryWrapper.eq(HealthCardiovascular::getDataSource, healthCardiovascular.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthCardiovascular 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthCardiovascular insert(HealthCardiovascular healthCardiovascular) {
        healthCardiovascular.setId(null);
        getBaseMapper().insert(healthCardiovascular);
        return healthCardiovascular;
    }

    /**
    * 更新数据
    *
    * @param healthCardiovascular 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthCardiovascular update(HealthCardiovascular healthCardiovascular) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthCardiovascular> chainWrapper = new LambdaUpdateChainWrapper<HealthCardiovascular>(getBaseMapper());
        if (healthCardiovascular.getId() != null) {
            chainWrapper.set(HealthCardiovascular::getId, healthCardiovascular.getId());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getTenantId())) {
            chainWrapper.set(HealthCardiovascular::getTenantId, healthCardiovascular.getTenantId());
        }
        if (healthCardiovascular.getCorpId() != null) {
            chainWrapper.set(HealthCardiovascular::getCorpId, healthCardiovascular.getCorpId());
        }
        if (healthCardiovascular.getInstitutionId() != null) {
            chainWrapper.set(HealthCardiovascular::getInstitutionId, healthCardiovascular.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getInstitutionName())) {
            chainWrapper.set(HealthCardiovascular::getInstitutionName, healthCardiovascular.getInstitutionName());
        }
        if (healthCardiovascular.getElderId() != null) {
            chainWrapper.set(HealthCardiovascular::getElderId, healthCardiovascular.getElderId());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getElderName())) {
            chainWrapper.set(HealthCardiovascular::getElderName, healthCardiovascular.getElderName());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getIdCard())) {
            chainWrapper.set(HealthCardiovascular::getIdCard, healthCardiovascular.getIdCard());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getSex())) {
            chainWrapper.set(HealthCardiovascular::getSex, healthCardiovascular.getSex());
        }
        if (healthCardiovascular.getAge() != null) {
            chainWrapper.set(HealthCardiovascular::getAge, healthCardiovascular.getAge());
        }
        if (healthCardiovascular.getGaugeTime() != null) {
            chainWrapper.set(HealthCardiovascular::getGaugeTime, healthCardiovascular.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getGaugeType())) {
            chainWrapper.set(HealthCardiovascular::getGaugeType, healthCardiovascular.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getVeinOne())) {
            chainWrapper.set(HealthCardiovascular::getVeinOne, healthCardiovascular.getVeinOne());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getVeinTwo())) {
            chainWrapper.set(HealthCardiovascular::getVeinTwo, healthCardiovascular.getVeinTwo());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getVeinThere())) {
            chainWrapper.set(HealthCardiovascular::getVeinThere, healthCardiovascular.getVeinThere());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getVeinFour())) {
            chainWrapper.set(HealthCardiovascular::getVeinFour, healthCardiovascular.getVeinFour());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getVeinFive())) {
            chainWrapper.set(HealthCardiovascular::getVeinFive, healthCardiovascular.getVeinFive());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getVeinResult())) {
            chainWrapper.set(HealthCardiovascular::getVeinResult, healthCardiovascular.getVeinResult());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getOpinion())) {
            chainWrapper.set(HealthCardiovascular::getOpinion, healthCardiovascular.getOpinion());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getWarnFlag())) {
            chainWrapper.set(HealthCardiovascular::getWarnFlag, healthCardiovascular.getWarnFlag());
        }
        if (healthCardiovascular.getAreaCode() != null) {
            chainWrapper.set(HealthCardiovascular::getAreaCode, healthCardiovascular.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getAreaName())) {
            chainWrapper.set(HealthCardiovascular::getAreaName, healthCardiovascular.getAreaName());
        }
        if (healthCardiovascular.getCreateUser() != null) {
            chainWrapper.set(HealthCardiovascular::getCreateUser, healthCardiovascular.getCreateUser());
        }
        if (healthCardiovascular.getCreateDept() != null) {
            chainWrapper.set(HealthCardiovascular::getCreateDept, healthCardiovascular.getCreateDept());
        }
        if (healthCardiovascular.getCreateTime() != null) {
            chainWrapper.set(HealthCardiovascular::getCreateTime, healthCardiovascular.getCreateTime());
        }
        if (healthCardiovascular.getUpdateUser() != null) {
            chainWrapper.set(HealthCardiovascular::getUpdateUser, healthCardiovascular.getUpdateUser());
        }
        if (healthCardiovascular.getUpdateTime() != null) {
            chainWrapper.set(HealthCardiovascular::getUpdateTime, healthCardiovascular.getUpdateTime());
        }
        if (healthCardiovascular.getIsDeleted() != null) {
            chainWrapper.set(HealthCardiovascular::getIsDeleted, healthCardiovascular.getIsDeleted());
        }
        if (healthCardiovascular.getStatus() != null) {
            chainWrapper.set(HealthCardiovascular::getStatus, healthCardiovascular.getStatus());
        }
        if (StringUtil.isNotBlank(healthCardiovascular.getDataSource())) {
            chainWrapper.set(HealthCardiovascular::getDataSource, healthCardiovascular.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthCardiovascular::getId, healthCardiovascular.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthCardiovascular.getId());
        } else {
            return healthCardiovascular;
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
    public boolean saveHealthCardiovascularBatch(List<HealthCardiovascular> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthCardiovascular healthCardiovascular : insertList) {
            //使用默认的雪花算法生成
            healthCardiovascular.setId(null);
            //healthCardiovascular.setCreatedDt(currentDte);
            //healthCardiovascular.setUpdatedDt(currentDte);
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
    public Integer deleteHealthCardiovascularBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthCardiovascular> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


