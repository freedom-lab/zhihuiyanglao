package cn.pluss.platform.service.healthInterventionsTemple.impl;

import cn.pluss.platform.mapper.HealthInterventionsTempleMapper;
import cn.pluss.platform.model.entity.HealthInterventionsTemple;
import cn.pluss.platform.service.healthInterventionsTemple.HealthInterventionsTempleService;
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
@Service("healthInterventionsTempleService")
public class HealthInterventionsTempleServiceImpl extends ServiceImpl< HealthInterventionsTempleMapper, HealthInterventionsTemple> implements HealthInterventionsTempleService {
    private static final Logger logger = LoggerFactory.getLogger(HealthInterventionsTempleServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthInterventionsTemple> queryPage(Map map) {
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
    public HealthInterventionsTemple queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthInterventionsTemple 实例对象
    * @return 实例对象
    */
    @Override
    public HealthInterventionsTemple queryOne(HealthInterventionsTemple healthInterventionsTemple){
        LambdaQueryWrapper<HealthInterventionsTemple> queryWrapper = getQueryWrapper(healthInterventionsTemple);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthInterventionsTemple
    * @return
    */
    @Override
    public List<HealthInterventionsTemple> queryList(HealthInterventionsTemple healthInterventionsTemple) {
        LambdaQueryWrapper<HealthInterventionsTemple> queryWrapper = getQueryWrapper(healthInterventionsTemple);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthInterventionsTemple
    * @return
    */
    public static LambdaQueryWrapper<HealthInterventionsTemple> getQueryWrapper(HealthInterventionsTemple healthInterventionsTemple){
        LambdaQueryWrapper<HealthInterventionsTemple> queryWrapper = new LambdaQueryWrapper<>();
        if (healthInterventionsTemple.getId() != null) {
            queryWrapper.eq(HealthInterventionsTemple::getId, healthInterventionsTemple.getId());
        }
        if (StringUtil.isNotEmpty(healthInterventionsTemple.getTenantId())) {
            queryWrapper.eq(HealthInterventionsTemple::getTenantId, healthInterventionsTemple.getTenantId());
        }
        if (StringUtil.isNotEmpty(healthInterventionsTemple.getDiseaseId())) {
            queryWrapper.eq(HealthInterventionsTemple::getDiseaseId, healthInterventionsTemple.getDiseaseId());
        }
        if (StringUtil.isNotEmpty(healthInterventionsTemple.getDiseaseName())) {
            queryWrapper.eq(HealthInterventionsTemple::getDiseaseName, healthInterventionsTemple.getDiseaseName());
        }
        if (StringUtil.isNotEmpty(healthInterventionsTemple.getControlPlan())) {
            queryWrapper.eq(HealthInterventionsTemple::getControlPlan, healthInterventionsTemple.getControlPlan());
        }
        if (StringUtil.isNotEmpty(healthInterventionsTemple.getDietGuide())) {
            queryWrapper.eq(HealthInterventionsTemple::getDietGuide, healthInterventionsTemple.getDietGuide());
        }
        if (StringUtil.isNotEmpty(healthInterventionsTemple.getSportGuide())) {
            queryWrapper.eq(HealthInterventionsTemple::getSportGuide, healthInterventionsTemple.getSportGuide());
        }
        if (StringUtil.isNotEmpty(healthInterventionsTemple.getReferenceRecipe())) {
            queryWrapper.eq(HealthInterventionsTemple::getReferenceRecipe, healthInterventionsTemple.getReferenceRecipe());
        }
        if (StringUtil.isNotEmpty(healthInterventionsTemple.getTraditionalMedicine())) {
            queryWrapper.eq(HealthInterventionsTemple::getTraditionalMedicine, healthInterventionsTemple.getTraditionalMedicine());
        }
        if (StringUtil.isNotEmpty(healthInterventionsTemple.getOtherTips())) {
            queryWrapper.eq(HealthInterventionsTemple::getOtherTips, healthInterventionsTemple.getOtherTips());
        }
        if (healthInterventionsTemple.getCreateUser() != null) {
            queryWrapper.eq(HealthInterventionsTemple::getCreateUser, healthInterventionsTemple.getCreateUser());
        }
        if (healthInterventionsTemple.getCreateDept() != null) {
            queryWrapper.eq(HealthInterventionsTemple::getCreateDept, healthInterventionsTemple.getCreateDept());
        }
        if (healthInterventionsTemple.getCreateTime() != null) {
            queryWrapper.eq(HealthInterventionsTemple::getCreateTime, healthInterventionsTemple.getCreateTime());
        }
        if (healthInterventionsTemple.getUpdateUser() != null) {
            queryWrapper.eq(HealthInterventionsTemple::getUpdateUser, healthInterventionsTemple.getUpdateUser());
        }
        if (healthInterventionsTemple.getUpdateTime() != null) {
            queryWrapper.eq(HealthInterventionsTemple::getUpdateTime, healthInterventionsTemple.getUpdateTime());
        }
        if (healthInterventionsTemple.getIsDeleted() != null) {
            queryWrapper.eq(HealthInterventionsTemple::getIsDeleted, healthInterventionsTemple.getIsDeleted());
        }
        if (healthInterventionsTemple.getStatus() != null) {
            queryWrapper.eq(HealthInterventionsTemple::getStatus, healthInterventionsTemple.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthInterventionsTemple 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventionsTemple insert(HealthInterventionsTemple healthInterventionsTemple) {
        healthInterventionsTemple.setId(null);
        getBaseMapper().insert(healthInterventionsTemple);
        return healthInterventionsTemple;
    }

    /**
    * 更新数据
    *
    * @param healthInterventionsTemple 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventionsTemple update(HealthInterventionsTemple healthInterventionsTemple) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthInterventionsTemple> chainWrapper = new LambdaUpdateChainWrapper<HealthInterventionsTemple>(getBaseMapper());
        if (healthInterventionsTemple.getId() != null) {
            chainWrapper.set(HealthInterventionsTemple::getId, healthInterventionsTemple.getId());
        }
        if (StringUtil.isNotBlank(healthInterventionsTemple.getTenantId())) {
            chainWrapper.set(HealthInterventionsTemple::getTenantId, healthInterventionsTemple.getTenantId());
        }
        if (StringUtil.isNotBlank(healthInterventionsTemple.getDiseaseId())) {
            chainWrapper.set(HealthInterventionsTemple::getDiseaseId, healthInterventionsTemple.getDiseaseId());
        }
        if (StringUtil.isNotBlank(healthInterventionsTemple.getDiseaseName())) {
            chainWrapper.set(HealthInterventionsTemple::getDiseaseName, healthInterventionsTemple.getDiseaseName());
        }
        if (StringUtil.isNotBlank(healthInterventionsTemple.getControlPlan())) {
            chainWrapper.set(HealthInterventionsTemple::getControlPlan, healthInterventionsTemple.getControlPlan());
        }
        if (StringUtil.isNotBlank(healthInterventionsTemple.getDietGuide())) {
            chainWrapper.set(HealthInterventionsTemple::getDietGuide, healthInterventionsTemple.getDietGuide());
        }
        if (StringUtil.isNotBlank(healthInterventionsTemple.getSportGuide())) {
            chainWrapper.set(HealthInterventionsTemple::getSportGuide, healthInterventionsTemple.getSportGuide());
        }
        if (StringUtil.isNotBlank(healthInterventionsTemple.getReferenceRecipe())) {
            chainWrapper.set(HealthInterventionsTemple::getReferenceRecipe, healthInterventionsTemple.getReferenceRecipe());
        }
        if (StringUtil.isNotBlank(healthInterventionsTemple.getTraditionalMedicine())) {
            chainWrapper.set(HealthInterventionsTemple::getTraditionalMedicine, healthInterventionsTemple.getTraditionalMedicine());
        }
        if (StringUtil.isNotBlank(healthInterventionsTemple.getOtherTips())) {
            chainWrapper.set(HealthInterventionsTemple::getOtherTips, healthInterventionsTemple.getOtherTips());
        }
        if (healthInterventionsTemple.getCreateUser() != null) {
            chainWrapper.set(HealthInterventionsTemple::getCreateUser, healthInterventionsTemple.getCreateUser());
        }
        if (healthInterventionsTemple.getCreateDept() != null) {
            chainWrapper.set(HealthInterventionsTemple::getCreateDept, healthInterventionsTemple.getCreateDept());
        }
        if (healthInterventionsTemple.getCreateTime() != null) {
            chainWrapper.set(HealthInterventionsTemple::getCreateTime, healthInterventionsTemple.getCreateTime());
        }
        if (healthInterventionsTemple.getUpdateUser() != null) {
            chainWrapper.set(HealthInterventionsTemple::getUpdateUser, healthInterventionsTemple.getUpdateUser());
        }
        if (healthInterventionsTemple.getUpdateTime() != null) {
            chainWrapper.set(HealthInterventionsTemple::getUpdateTime, healthInterventionsTemple.getUpdateTime());
        }
        if (healthInterventionsTemple.getIsDeleted() != null) {
            chainWrapper.set(HealthInterventionsTemple::getIsDeleted, healthInterventionsTemple.getIsDeleted());
        }
        if (healthInterventionsTemple.getStatus() != null) {
            chainWrapper.set(HealthInterventionsTemple::getStatus, healthInterventionsTemple.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthInterventionsTemple::getId, healthInterventionsTemple.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthInterventionsTemple.getId());
        } else {
            return healthInterventionsTemple;
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
    public boolean saveHealthInterventionsTempleBatch(List<HealthInterventionsTemple> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthInterventionsTemple healthInterventionsTemple : insertList) {
            //使用默认的雪花算法生成
            healthInterventionsTemple.setId(null);
            //healthInterventionsTemple.setCreatedDt(currentDte);
            //healthInterventionsTemple.setUpdatedDt(currentDte);
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
    public Integer deleteHealthInterventionsTempleBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthInterventionsTemple> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


