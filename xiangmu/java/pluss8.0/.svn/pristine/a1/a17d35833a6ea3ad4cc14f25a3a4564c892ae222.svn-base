package cn.pluss.platform.service.healthArteriosclerosis.impl;

import cn.pluss.platform.mapper.HealthArteriosclerosisMapper;
import cn.pluss.platform.model.entity.HealthArteriosclerosis;
import cn.pluss.platform.service.healthArteriosclerosis.HealthArteriosclerosisService;
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
@Service("healthArteriosclerosisService")
public class HealthArteriosclerosisServiceImpl extends ServiceImpl< HealthArteriosclerosisMapper, HealthArteriosclerosis> implements HealthArteriosclerosisService {
    private static final Logger logger = LoggerFactory.getLogger(HealthArteriosclerosisServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthArteriosclerosis> queryPage(Map map) {
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
    public HealthArteriosclerosis queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthArteriosclerosis 实例对象
    * @return 实例对象
    */
    @Override
    public HealthArteriosclerosis queryOne(HealthArteriosclerosis healthArteriosclerosis){
        LambdaQueryWrapper<HealthArteriosclerosis> queryWrapper = getQueryWrapper(healthArteriosclerosis);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthArteriosclerosis
    * @return
    */
    @Override
    public List<HealthArteriosclerosis> queryList(HealthArteriosclerosis healthArteriosclerosis) {
        LambdaQueryWrapper<HealthArteriosclerosis> queryWrapper = getQueryWrapper(healthArteriosclerosis);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthArteriosclerosis
    * @return
    */
    public static LambdaQueryWrapper<HealthArteriosclerosis> getQueryWrapper(HealthArteriosclerosis healthArteriosclerosis){
        LambdaQueryWrapper<HealthArteriosclerosis> queryWrapper = new LambdaQueryWrapper<>();
        if (healthArteriosclerosis.getId() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getId, healthArteriosclerosis.getId());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getTenantId())) {
            queryWrapper.eq(HealthArteriosclerosis::getTenantId, healthArteriosclerosis.getTenantId());
        }
        if (healthArteriosclerosis.getCorpId() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getCorpId, healthArteriosclerosis.getCorpId());
        }
        if (healthArteriosclerosis.getInstitutionId() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getInstitutionId, healthArteriosclerosis.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getInstitutionName())) {
            queryWrapper.eq(HealthArteriosclerosis::getInstitutionName, healthArteriosclerosis.getInstitutionName());
        }
        if (healthArteriosclerosis.getElderId() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getElderId, healthArteriosclerosis.getElderId());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getElderName())) {
            queryWrapper.eq(HealthArteriosclerosis::getElderName, healthArteriosclerosis.getElderName());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getIdCard())) {
            queryWrapper.eq(HealthArteriosclerosis::getIdCard, healthArteriosclerosis.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getSex())) {
            queryWrapper.eq(HealthArteriosclerosis::getSex, healthArteriosclerosis.getSex());
        }
        if (healthArteriosclerosis.getAge() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getAge, healthArteriosclerosis.getAge());
        }
        if (healthArteriosclerosis.getGaugeTime() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getGaugeTime, healthArteriosclerosis.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getGaugeType())) {
            queryWrapper.eq(HealthArteriosclerosis::getGaugeType, healthArteriosclerosis.getGaugeType());
        }
        if (healthArteriosclerosis.getHeightPressure() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getHeightPressure, healthArteriosclerosis.getHeightPressure());
        }
        if (healthArteriosclerosis.getLowPressure() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getLowPressure, healthArteriosclerosis.getLowPressure());
        }
        if (healthArteriosclerosis.getPulse() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getPulse, healthArteriosclerosis.getPulse());
        }
        if (healthArteriosclerosis.getAVI() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getAVI, healthArteriosclerosis.getAVI());
        }
        if (healthArteriosclerosis.getAVIRefer() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getAVIRefer, healthArteriosclerosis.getAVIRefer());
        }
        if (healthArteriosclerosis.getAPI() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getAPI, healthArteriosclerosis.getAPI());
        }
        if (healthArteriosclerosis.getAPIRefer() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getAPIRefer, healthArteriosclerosis.getAPIRefer());
        }
        if (healthArteriosclerosis.getCSBP() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getCSBP, healthArteriosclerosis.getCSBP());
        }
        if (healthArteriosclerosis.getCAPP() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getCAPP, healthArteriosclerosis.getCAPP());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getAddTime())) {
            queryWrapper.eq(HealthArteriosclerosis::getAddTime, healthArteriosclerosis.getAddTime());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getTip())) {
            queryWrapper.eq(HealthArteriosclerosis::getTip, healthArteriosclerosis.getTip());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getOpinion())) {
            queryWrapper.eq(HealthArteriosclerosis::getOpinion, healthArteriosclerosis.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getWarnFlag())) {
            queryWrapper.eq(HealthArteriosclerosis::getWarnFlag, healthArteriosclerosis.getWarnFlag());
        }
        if (healthArteriosclerosis.getAreaCode() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getAreaCode, healthArteriosclerosis.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getAreaName())) {
            queryWrapper.eq(HealthArteriosclerosis::getAreaName, healthArteriosclerosis.getAreaName());
        }
        if (healthArteriosclerosis.getCreateUser() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getCreateUser, healthArteriosclerosis.getCreateUser());
        }
        if (healthArteriosclerosis.getCreateDept() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getCreateDept, healthArteriosclerosis.getCreateDept());
        }
        if (healthArteriosclerosis.getCreateTime() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getCreateTime, healthArteriosclerosis.getCreateTime());
        }
        if (healthArteriosclerosis.getUpdateUser() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getUpdateUser, healthArteriosclerosis.getUpdateUser());
        }
        if (healthArteriosclerosis.getUpdateTime() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getUpdateTime, healthArteriosclerosis.getUpdateTime());
        }
        if (healthArteriosclerosis.getIsDeleted() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getIsDeleted, healthArteriosclerosis.getIsDeleted());
        }
        if (healthArteriosclerosis.getStatus() != null) {
            queryWrapper.eq(HealthArteriosclerosis::getStatus, healthArteriosclerosis.getStatus());
        }
        if (StringUtil.isNotEmpty(healthArteriosclerosis.getDataSource())) {
            queryWrapper.eq(HealthArteriosclerosis::getDataSource, healthArteriosclerosis.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthArteriosclerosis 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthArteriosclerosis insert(HealthArteriosclerosis healthArteriosclerosis) {
        healthArteriosclerosis.setId(null);
        getBaseMapper().insert(healthArteriosclerosis);
        return healthArteriosclerosis;
    }

    /**
    * 更新数据
    *
    * @param healthArteriosclerosis 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthArteriosclerosis update(HealthArteriosclerosis healthArteriosclerosis) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthArteriosclerosis> chainWrapper = new LambdaUpdateChainWrapper<HealthArteriosclerosis>(getBaseMapper());
        if (healthArteriosclerosis.getId() != null) {
            chainWrapper.set(HealthArteriosclerosis::getId, healthArteriosclerosis.getId());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getTenantId())) {
            chainWrapper.set(HealthArteriosclerosis::getTenantId, healthArteriosclerosis.getTenantId());
        }
        if (healthArteriosclerosis.getCorpId() != null) {
            chainWrapper.set(HealthArteriosclerosis::getCorpId, healthArteriosclerosis.getCorpId());
        }
        if (healthArteriosclerosis.getInstitutionId() != null) {
            chainWrapper.set(HealthArteriosclerosis::getInstitutionId, healthArteriosclerosis.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getInstitutionName())) {
            chainWrapper.set(HealthArteriosclerosis::getInstitutionName, healthArteriosclerosis.getInstitutionName());
        }
        if (healthArteriosclerosis.getElderId() != null) {
            chainWrapper.set(HealthArteriosclerosis::getElderId, healthArteriosclerosis.getElderId());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getElderName())) {
            chainWrapper.set(HealthArteriosclerosis::getElderName, healthArteriosclerosis.getElderName());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getIdCard())) {
            chainWrapper.set(HealthArteriosclerosis::getIdCard, healthArteriosclerosis.getIdCard());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getSex())) {
            chainWrapper.set(HealthArteriosclerosis::getSex, healthArteriosclerosis.getSex());
        }
        if (healthArteriosclerosis.getAge() != null) {
            chainWrapper.set(HealthArteriosclerosis::getAge, healthArteriosclerosis.getAge());
        }
        if (healthArteriosclerosis.getGaugeTime() != null) {
            chainWrapper.set(HealthArteriosclerosis::getGaugeTime, healthArteriosclerosis.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getGaugeType())) {
            chainWrapper.set(HealthArteriosclerosis::getGaugeType, healthArteriosclerosis.getGaugeType());
        }
        if (healthArteriosclerosis.getHeightPressure() != null) {
            chainWrapper.set(HealthArteriosclerosis::getHeightPressure, healthArteriosclerosis.getHeightPressure());
        }
        if (healthArteriosclerosis.getLowPressure() != null) {
            chainWrapper.set(HealthArteriosclerosis::getLowPressure, healthArteriosclerosis.getLowPressure());
        }
        if (healthArteriosclerosis.getPulse() != null) {
            chainWrapper.set(HealthArteriosclerosis::getPulse, healthArteriosclerosis.getPulse());
        }
        if (healthArteriosclerosis.getAVI() != null) {
            chainWrapper.set(HealthArteriosclerosis::getAVI, healthArteriosclerosis.getAVI());
        }
        if (healthArteriosclerosis.getAVIRefer() != null) {
            chainWrapper.set(HealthArteriosclerosis::getAVIRefer, healthArteriosclerosis.getAVIRefer());
        }
        if (healthArteriosclerosis.getAPI() != null) {
            chainWrapper.set(HealthArteriosclerosis::getAPI, healthArteriosclerosis.getAPI());
        }
        if (healthArteriosclerosis.getAPIRefer() != null) {
            chainWrapper.set(HealthArteriosclerosis::getAPIRefer, healthArteriosclerosis.getAPIRefer());
        }
        if (healthArteriosclerosis.getCSBP() != null) {
            chainWrapper.set(HealthArteriosclerosis::getCSBP, healthArteriosclerosis.getCSBP());
        }
        if (healthArteriosclerosis.getCAPP() != null) {
            chainWrapper.set(HealthArteriosclerosis::getCAPP, healthArteriosclerosis.getCAPP());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getAddTime())) {
            chainWrapper.set(HealthArteriosclerosis::getAddTime, healthArteriosclerosis.getAddTime());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getTip())) {
            chainWrapper.set(HealthArteriosclerosis::getTip, healthArteriosclerosis.getTip());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getOpinion())) {
            chainWrapper.set(HealthArteriosclerosis::getOpinion, healthArteriosclerosis.getOpinion());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getWarnFlag())) {
            chainWrapper.set(HealthArteriosclerosis::getWarnFlag, healthArteriosclerosis.getWarnFlag());
        }
        if (healthArteriosclerosis.getAreaCode() != null) {
            chainWrapper.set(HealthArteriosclerosis::getAreaCode, healthArteriosclerosis.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getAreaName())) {
            chainWrapper.set(HealthArteriosclerosis::getAreaName, healthArteriosclerosis.getAreaName());
        }
        if (healthArteriosclerosis.getCreateUser() != null) {
            chainWrapper.set(HealthArteriosclerosis::getCreateUser, healthArteriosclerosis.getCreateUser());
        }
        if (healthArteriosclerosis.getCreateDept() != null) {
            chainWrapper.set(HealthArteriosclerosis::getCreateDept, healthArteriosclerosis.getCreateDept());
        }
        if (healthArteriosclerosis.getCreateTime() != null) {
            chainWrapper.set(HealthArteriosclerosis::getCreateTime, healthArteriosclerosis.getCreateTime());
        }
        if (healthArteriosclerosis.getUpdateUser() != null) {
            chainWrapper.set(HealthArteriosclerosis::getUpdateUser, healthArteriosclerosis.getUpdateUser());
        }
        if (healthArteriosclerosis.getUpdateTime() != null) {
            chainWrapper.set(HealthArteriosclerosis::getUpdateTime, healthArteriosclerosis.getUpdateTime());
        }
        if (healthArteriosclerosis.getIsDeleted() != null) {
            chainWrapper.set(HealthArteriosclerosis::getIsDeleted, healthArteriosclerosis.getIsDeleted());
        }
        if (healthArteriosclerosis.getStatus() != null) {
            chainWrapper.set(HealthArteriosclerosis::getStatus, healthArteriosclerosis.getStatus());
        }
        if (StringUtil.isNotBlank(healthArteriosclerosis.getDataSource())) {
            chainWrapper.set(HealthArteriosclerosis::getDataSource, healthArteriosclerosis.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthArteriosclerosis::getId, healthArteriosclerosis.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthArteriosclerosis.getId());
        } else {
            return healthArteriosclerosis;
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
    public boolean saveHealthArteriosclerosisBatch(List<HealthArteriosclerosis> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthArteriosclerosis healthArteriosclerosis : insertList) {
            //使用默认的雪花算法生成
            healthArteriosclerosis.setId(null);
            //healthArteriosclerosis.setCreatedDt(currentDte);
            //healthArteriosclerosis.setUpdatedDt(currentDte);
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
    public Integer deleteHealthArteriosclerosisBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthArteriosclerosis> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


