package cn.pluss.platform.service.healthInterventions.impl;

import cn.pluss.platform.mapper.HealthInterventionsMapper;
import cn.pluss.platform.model.entity.HealthInterventions;
import cn.pluss.platform.service.healthInterventions.HealthInterventionsService;
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
@Service("healthInterventionsService")
public class HealthInterventionsServiceImpl extends ServiceImpl< HealthInterventionsMapper, HealthInterventions> implements HealthInterventionsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthInterventionsServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthInterventions> queryPage(Map map) {
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
    public HealthInterventions queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthInterventions 实例对象
    * @return 实例对象
    */
    @Override
    public HealthInterventions queryOne(HealthInterventions healthInterventions){
        LambdaQueryWrapper<HealthInterventions> queryWrapper = getQueryWrapper(healthInterventions);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthInterventions
    * @return
    */
    @Override
    public List<HealthInterventions> queryList(HealthInterventions healthInterventions) {
        LambdaQueryWrapper<HealthInterventions> queryWrapper = getQueryWrapper(healthInterventions);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthInterventions
    * @return
    */
    public static LambdaQueryWrapper<HealthInterventions> getQueryWrapper(HealthInterventions healthInterventions){
        LambdaQueryWrapper<HealthInterventions> queryWrapper = new LambdaQueryWrapper<>();
        if (healthInterventions.getId() != null) {
            queryWrapper.eq(HealthInterventions::getId, healthInterventions.getId());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getTenantId())) {
            queryWrapper.eq(HealthInterventions::getTenantId, healthInterventions.getTenantId());
        }
        if (healthInterventions.getCorpId() != null) {
            queryWrapper.eq(HealthInterventions::getCorpId, healthInterventions.getCorpId());
        }
        if (healthInterventions.getInstitutionId() != null) {
            queryWrapper.eq(HealthInterventions::getInstitutionId, healthInterventions.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getInstitutionName())) {
            queryWrapper.eq(HealthInterventions::getInstitutionName, healthInterventions.getInstitutionName());
        }
        if (healthInterventions.getElderId() != null) {
            queryWrapper.eq(HealthInterventions::getElderId, healthInterventions.getElderId());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getElderName())) {
            queryWrapper.eq(HealthInterventions::getElderName, healthInterventions.getElderName());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getIdCard())) {
            queryWrapper.eq(HealthInterventions::getIdCard, healthInterventions.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getSex())) {
            queryWrapper.eq(HealthInterventions::getSex, healthInterventions.getSex());
        }
        if (healthInterventions.getAge() != null) {
            queryWrapper.eq(HealthInterventions::getAge, healthInterventions.getAge());
        }
        if (healthInterventions.getBirthday() != null) {
            queryWrapper.eq(HealthInterventions::getBirthday, healthInterventions.getBirthday());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getDiseaseId())) {
            queryWrapper.eq(HealthInterventions::getDiseaseId, healthInterventions.getDiseaseId());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getDiseaseName())) {
            queryWrapper.eq(HealthInterventions::getDiseaseName, healthInterventions.getDiseaseName());
        }
        if (healthInterventions.getMeddleTime() != null) {
            queryWrapper.eq(HealthInterventions::getMeddleTime, healthInterventions.getMeddleTime());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getControlPlan())) {
            queryWrapper.eq(HealthInterventions::getControlPlan, healthInterventions.getControlPlan());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getDietGuide())) {
            queryWrapper.eq(HealthInterventions::getDietGuide, healthInterventions.getDietGuide());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getSportGuide())) {
            queryWrapper.eq(HealthInterventions::getSportGuide, healthInterventions.getSportGuide());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getReferenceRecipe())) {
            queryWrapper.eq(HealthInterventions::getReferenceRecipe, healthInterventions.getReferenceRecipe());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getTraditionalMedicine())) {
            queryWrapper.eq(HealthInterventions::getTraditionalMedicine, healthInterventions.getTraditionalMedicine());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getOtherTips())) {
            queryWrapper.eq(HealthInterventions::getOtherTips, healthInterventions.getOtherTips());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getMakeName())) {
            queryWrapper.eq(HealthInterventions::getMakeName, healthInterventions.getMakeName());
        }
        if (healthInterventions.getAreaCode() != null) {
            queryWrapper.eq(HealthInterventions::getAreaCode, healthInterventions.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getAreaName())) {
            queryWrapper.eq(HealthInterventions::getAreaName, healthInterventions.getAreaName());
        }
        if (healthInterventions.getCreateUser() != null) {
            queryWrapper.eq(HealthInterventions::getCreateUser, healthInterventions.getCreateUser());
        }
        if (healthInterventions.getCreateDept() != null) {
            queryWrapper.eq(HealthInterventions::getCreateDept, healthInterventions.getCreateDept());
        }
        if (healthInterventions.getCreateTime() != null) {
            queryWrapper.eq(HealthInterventions::getCreateTime, healthInterventions.getCreateTime());
        }
        if (healthInterventions.getUpdateUser() != null) {
            queryWrapper.eq(HealthInterventions::getUpdateUser, healthInterventions.getUpdateUser());
        }
        if (healthInterventions.getUpdateTime() != null) {
            queryWrapper.eq(HealthInterventions::getUpdateTime, healthInterventions.getUpdateTime());
        }
        if (healthInterventions.getIsDeleted() != null) {
            queryWrapper.eq(HealthInterventions::getIsDeleted, healthInterventions.getIsDeleted());
        }
        if (healthInterventions.getStatus() != null) {
            queryWrapper.eq(HealthInterventions::getStatus, healthInterventions.getStatus());
        }
        if (StringUtil.isNotEmpty(healthInterventions.getLinkTel())) {
            queryWrapper.eq(HealthInterventions::getLinkTel, healthInterventions.getLinkTel());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthInterventions 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventions insert(HealthInterventions healthInterventions) {
        healthInterventions.setId(null);
        getBaseMapper().insert(healthInterventions);
        return healthInterventions;
    }

    /**
    * 更新数据
    *
    * @param healthInterventions 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthInterventions update(HealthInterventions healthInterventions) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthInterventions> chainWrapper = new LambdaUpdateChainWrapper<HealthInterventions>(getBaseMapper());
        if (healthInterventions.getId() != null) {
            chainWrapper.set(HealthInterventions::getId, healthInterventions.getId());
        }
        if (StringUtil.isNotBlank(healthInterventions.getTenantId())) {
            chainWrapper.set(HealthInterventions::getTenantId, healthInterventions.getTenantId());
        }
        if (healthInterventions.getCorpId() != null) {
            chainWrapper.set(HealthInterventions::getCorpId, healthInterventions.getCorpId());
        }
        if (healthInterventions.getInstitutionId() != null) {
            chainWrapper.set(HealthInterventions::getInstitutionId, healthInterventions.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthInterventions.getInstitutionName())) {
            chainWrapper.set(HealthInterventions::getInstitutionName, healthInterventions.getInstitutionName());
        }
        if (healthInterventions.getElderId() != null) {
            chainWrapper.set(HealthInterventions::getElderId, healthInterventions.getElderId());
        }
        if (StringUtil.isNotBlank(healthInterventions.getElderName())) {
            chainWrapper.set(HealthInterventions::getElderName, healthInterventions.getElderName());
        }
        if (StringUtil.isNotBlank(healthInterventions.getIdCard())) {
            chainWrapper.set(HealthInterventions::getIdCard, healthInterventions.getIdCard());
        }
        if (StringUtil.isNotBlank(healthInterventions.getSex())) {
            chainWrapper.set(HealthInterventions::getSex, healthInterventions.getSex());
        }
        if (healthInterventions.getAge() != null) {
            chainWrapper.set(HealthInterventions::getAge, healthInterventions.getAge());
        }
        if (healthInterventions.getBirthday() != null) {
            chainWrapper.set(HealthInterventions::getBirthday, healthInterventions.getBirthday());
        }
        if (StringUtil.isNotBlank(healthInterventions.getDiseaseId())) {
            chainWrapper.set(HealthInterventions::getDiseaseId, healthInterventions.getDiseaseId());
        }
        if (StringUtil.isNotBlank(healthInterventions.getDiseaseName())) {
            chainWrapper.set(HealthInterventions::getDiseaseName, healthInterventions.getDiseaseName());
        }
        if (healthInterventions.getMeddleTime() != null) {
            chainWrapper.set(HealthInterventions::getMeddleTime, healthInterventions.getMeddleTime());
        }
        if (StringUtil.isNotBlank(healthInterventions.getControlPlan())) {
            chainWrapper.set(HealthInterventions::getControlPlan, healthInterventions.getControlPlan());
        }
        if (StringUtil.isNotBlank(healthInterventions.getDietGuide())) {
            chainWrapper.set(HealthInterventions::getDietGuide, healthInterventions.getDietGuide());
        }
        if (StringUtil.isNotBlank(healthInterventions.getSportGuide())) {
            chainWrapper.set(HealthInterventions::getSportGuide, healthInterventions.getSportGuide());
        }
        if (StringUtil.isNotBlank(healthInterventions.getReferenceRecipe())) {
            chainWrapper.set(HealthInterventions::getReferenceRecipe, healthInterventions.getReferenceRecipe());
        }
        if (StringUtil.isNotBlank(healthInterventions.getTraditionalMedicine())) {
            chainWrapper.set(HealthInterventions::getTraditionalMedicine, healthInterventions.getTraditionalMedicine());
        }
        if (StringUtil.isNotBlank(healthInterventions.getOtherTips())) {
            chainWrapper.set(HealthInterventions::getOtherTips, healthInterventions.getOtherTips());
        }
        if (StringUtil.isNotBlank(healthInterventions.getMakeName())) {
            chainWrapper.set(HealthInterventions::getMakeName, healthInterventions.getMakeName());
        }
        if (healthInterventions.getAreaCode() != null) {
            chainWrapper.set(HealthInterventions::getAreaCode, healthInterventions.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthInterventions.getAreaName())) {
            chainWrapper.set(HealthInterventions::getAreaName, healthInterventions.getAreaName());
        }
        if (healthInterventions.getCreateUser() != null) {
            chainWrapper.set(HealthInterventions::getCreateUser, healthInterventions.getCreateUser());
        }
        if (healthInterventions.getCreateDept() != null) {
            chainWrapper.set(HealthInterventions::getCreateDept, healthInterventions.getCreateDept());
        }
        if (healthInterventions.getCreateTime() != null) {
            chainWrapper.set(HealthInterventions::getCreateTime, healthInterventions.getCreateTime());
        }
        if (healthInterventions.getUpdateUser() != null) {
            chainWrapper.set(HealthInterventions::getUpdateUser, healthInterventions.getUpdateUser());
        }
        if (healthInterventions.getUpdateTime() != null) {
            chainWrapper.set(HealthInterventions::getUpdateTime, healthInterventions.getUpdateTime());
        }
        if (healthInterventions.getIsDeleted() != null) {
            chainWrapper.set(HealthInterventions::getIsDeleted, healthInterventions.getIsDeleted());
        }
        if (healthInterventions.getStatus() != null) {
            chainWrapper.set(HealthInterventions::getStatus, healthInterventions.getStatus());
        }
        if (StringUtil.isNotBlank(healthInterventions.getLinkTel())) {
            chainWrapper.set(HealthInterventions::getLinkTel, healthInterventions.getLinkTel());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthInterventions::getId, healthInterventions.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthInterventions.getId());
        } else {
            return healthInterventions;
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
    public boolean saveHealthInterventionsBatch(List<HealthInterventions> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthInterventions healthInterventions : insertList) {
            //使用默认的雪花算法生成
            healthInterventions.setId(null);
            //healthInterventions.setCreatedDt(currentDte);
            //healthInterventions.setUpdatedDt(currentDte);
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
    public Integer deleteHealthInterventionsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthInterventions> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


