package cn.pluss.platform.service.healthInterventionPlanDrug.impl;

import cn.pluss.platform.mapper.HealthInterventionPlanDrugMapper;
import cn.pluss.platform.model.entity.HealthInterventionPlanDrug;
import cn.pluss.platform.service.healthInterventionPlanDrug.HealthInterventionPlanDrugService;
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
@Service("healthInterventionPlanDrugService")
public class HealthInterventionPlanDrugServiceImpl extends ServiceImpl< HealthInterventionPlanDrugMapper, HealthInterventionPlanDrug> implements HealthInterventionPlanDrugService {
    private static final Logger logger = LoggerFactory.getLogger(HealthInterventionPlanDrugServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthInterventionPlanDrug> queryPage(Map map) {
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
    public HealthInterventionPlanDrug queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthInterventionPlanDrug 实例对象
    * @return 实例对象
    */
    @Override
    public HealthInterventionPlanDrug queryOne(HealthInterventionPlanDrug healthInterventionPlanDrug){
        LambdaQueryWrapper<HealthInterventionPlanDrug> queryWrapper = getQueryWrapper(healthInterventionPlanDrug);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthInterventionPlanDrug
    * @return
    */
    @Override
    public List<HealthInterventionPlanDrug> queryList(HealthInterventionPlanDrug healthInterventionPlanDrug) {
        LambdaQueryWrapper<HealthInterventionPlanDrug> queryWrapper = getQueryWrapper(healthInterventionPlanDrug);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthInterventionPlanDrug
    * @return
    */
    public static LambdaQueryWrapper<HealthInterventionPlanDrug> getQueryWrapper(HealthInterventionPlanDrug healthInterventionPlanDrug){
        LambdaQueryWrapper<HealthInterventionPlanDrug> queryWrapper = new LambdaQueryWrapper<>();
        if (healthInterventionPlanDrug.getId() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getId, healthInterventionPlanDrug.getId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getTenantId())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getTenantId, healthInterventionPlanDrug.getTenantId());
        }
        if (healthInterventionPlanDrug.getPlanId() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getPlanId, healthInterventionPlanDrug.getPlanId());
        }
        if (healthInterventionPlanDrug.getElderId() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getElderId, healthInterventionPlanDrug.getElderId());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getDrugName())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getDrugName, healthInterventionPlanDrug.getDrugName());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getDrugSpecs())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getDrugSpecs, healthInterventionPlanDrug.getDrugSpecs());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getDrugMethod())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getDrugMethod, healthInterventionPlanDrug.getDrugMethod());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getDrugDosage())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getDrugDosage, healthInterventionPlanDrug.getDrugDosage());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getDrugRate())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getDrugRate, healthInterventionPlanDrug.getDrugRate());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getFactoryName())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getFactoryName, healthInterventionPlanDrug.getFactoryName());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getImgPath())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getImgPath, healthInterventionPlanDrug.getImgPath());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getRemark())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getRemark, healthInterventionPlanDrug.getRemark());
        }
        if (healthInterventionPlanDrug.getCreateUser() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getCreateUser, healthInterventionPlanDrug.getCreateUser());
        }
        if (StringUtil.isNotEmpty(healthInterventionPlanDrug.getCreateName())) {
            queryWrapper.eq(HealthInterventionPlanDrug::getCreateName, healthInterventionPlanDrug.getCreateName());
        }
        if (healthInterventionPlanDrug.getCreateDept() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getCreateDept, healthInterventionPlanDrug.getCreateDept());
        }
        if (healthInterventionPlanDrug.getCreateTime() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getCreateTime, healthInterventionPlanDrug.getCreateTime());
        }
        if (healthInterventionPlanDrug.getUpdateUser() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getUpdateUser, healthInterventionPlanDrug.getUpdateUser());
        }
        if (healthInterventionPlanDrug.getUpdateTime() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getUpdateTime, healthInterventionPlanDrug.getUpdateTime());
        }
        if (healthInterventionPlanDrug.getIsDeleted() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getIsDeleted, healthInterventionPlanDrug.getIsDeleted());
        }
        if (healthInterventionPlanDrug.getStatus() != null) {
            queryWrapper.eq(HealthInterventionPlanDrug::getStatus, healthInterventionPlanDrug.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthInterventionPlanDrug 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventionPlanDrug insert(HealthInterventionPlanDrug healthInterventionPlanDrug) {
        healthInterventionPlanDrug.setId(null);
        getBaseMapper().insert(healthInterventionPlanDrug);
        return healthInterventionPlanDrug;
    }

    /**
    * 更新数据
    *
    * @param healthInterventionPlanDrug 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventionPlanDrug update(HealthInterventionPlanDrug healthInterventionPlanDrug) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthInterventionPlanDrug> chainWrapper = new LambdaUpdateChainWrapper<HealthInterventionPlanDrug>(getBaseMapper());
        if (healthInterventionPlanDrug.getId() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getId, healthInterventionPlanDrug.getId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getTenantId())) {
            chainWrapper.set(HealthInterventionPlanDrug::getTenantId, healthInterventionPlanDrug.getTenantId());
        }
        if (healthInterventionPlanDrug.getPlanId() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getPlanId, healthInterventionPlanDrug.getPlanId());
        }
        if (healthInterventionPlanDrug.getElderId() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getElderId, healthInterventionPlanDrug.getElderId());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getDrugName())) {
            chainWrapper.set(HealthInterventionPlanDrug::getDrugName, healthInterventionPlanDrug.getDrugName());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getDrugSpecs())) {
            chainWrapper.set(HealthInterventionPlanDrug::getDrugSpecs, healthInterventionPlanDrug.getDrugSpecs());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getDrugMethod())) {
            chainWrapper.set(HealthInterventionPlanDrug::getDrugMethod, healthInterventionPlanDrug.getDrugMethod());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getDrugDosage())) {
            chainWrapper.set(HealthInterventionPlanDrug::getDrugDosage, healthInterventionPlanDrug.getDrugDosage());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getDrugRate())) {
            chainWrapper.set(HealthInterventionPlanDrug::getDrugRate, healthInterventionPlanDrug.getDrugRate());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getFactoryName())) {
            chainWrapper.set(HealthInterventionPlanDrug::getFactoryName, healthInterventionPlanDrug.getFactoryName());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getImgPath())) {
            chainWrapper.set(HealthInterventionPlanDrug::getImgPath, healthInterventionPlanDrug.getImgPath());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getRemark())) {
            chainWrapper.set(HealthInterventionPlanDrug::getRemark, healthInterventionPlanDrug.getRemark());
        }
        if (healthInterventionPlanDrug.getCreateUser() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getCreateUser, healthInterventionPlanDrug.getCreateUser());
        }
        if (StringUtil.isNotBlank(healthInterventionPlanDrug.getCreateName())) {
            chainWrapper.set(HealthInterventionPlanDrug::getCreateName, healthInterventionPlanDrug.getCreateName());
        }
        if (healthInterventionPlanDrug.getCreateDept() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getCreateDept, healthInterventionPlanDrug.getCreateDept());
        }
        if (healthInterventionPlanDrug.getCreateTime() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getCreateTime, healthInterventionPlanDrug.getCreateTime());
        }
        if (healthInterventionPlanDrug.getUpdateUser() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getUpdateUser, healthInterventionPlanDrug.getUpdateUser());
        }
        if (healthInterventionPlanDrug.getUpdateTime() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getUpdateTime, healthInterventionPlanDrug.getUpdateTime());
        }
        if (healthInterventionPlanDrug.getIsDeleted() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getIsDeleted, healthInterventionPlanDrug.getIsDeleted());
        }
        if (healthInterventionPlanDrug.getStatus() != null) {
            chainWrapper.set(HealthInterventionPlanDrug::getStatus, healthInterventionPlanDrug.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthInterventionPlanDrug::getId, healthInterventionPlanDrug.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthInterventionPlanDrug.getId());
        } else {
            return healthInterventionPlanDrug;
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
    public boolean saveHealthInterventionPlanDrugBatch(List<HealthInterventionPlanDrug> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthInterventionPlanDrug healthInterventionPlanDrug : insertList) {
            //使用默认的雪花算法生成
            healthInterventionPlanDrug.setId(null);
            //healthInterventionPlanDrug.setCreatedDt(currentDte);
            //healthInterventionPlanDrug.setUpdatedDt(currentDte);
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
    public Integer deleteHealthInterventionPlanDrugBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthInterventionPlanDrug> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


