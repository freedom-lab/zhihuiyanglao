package cn.pluss.platform.service.healthLungBreathing.impl;

import cn.pluss.platform.mapper.HealthLungBreathingMapper;
import cn.pluss.platform.model.entity.HealthLungBreathing;
import cn.pluss.platform.service.healthLungBreathing.HealthLungBreathingService;
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
@Service("healthLungBreathingService")
public class HealthLungBreathingServiceImpl extends ServiceImpl< HealthLungBreathingMapper, HealthLungBreathing> implements HealthLungBreathingService {
    private static final Logger logger = LoggerFactory.getLogger(HealthLungBreathingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthLungBreathing> queryPage(Map map) {
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
    public HealthLungBreathing queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthLungBreathing 实例对象
    * @return 实例对象
    */
    @Override
    public HealthLungBreathing queryOne(HealthLungBreathing healthLungBreathing){
        LambdaQueryWrapper<HealthLungBreathing> queryWrapper = getQueryWrapper(healthLungBreathing);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthLungBreathing
    * @return
    */
    @Override
    public List<HealthLungBreathing> queryList(HealthLungBreathing healthLungBreathing) {
        LambdaQueryWrapper<HealthLungBreathing> queryWrapper = getQueryWrapper(healthLungBreathing);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthLungBreathing
    * @return
    */
    public static LambdaQueryWrapper<HealthLungBreathing> getQueryWrapper(HealthLungBreathing healthLungBreathing){
        LambdaQueryWrapper<HealthLungBreathing> queryWrapper = new LambdaQueryWrapper<>();
        if (healthLungBreathing.getId() != null) {
            queryWrapper.eq(HealthLungBreathing::getId, healthLungBreathing.getId());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getTenantId())) {
            queryWrapper.eq(HealthLungBreathing::getTenantId, healthLungBreathing.getTenantId());
        }
        if (healthLungBreathing.getCorpId() != null) {
            queryWrapper.eq(HealthLungBreathing::getCorpId, healthLungBreathing.getCorpId());
        }
        if (healthLungBreathing.getInstitutionId() != null) {
            queryWrapper.eq(HealthLungBreathing::getInstitutionId, healthLungBreathing.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getInstitutionName())) {
            queryWrapper.eq(HealthLungBreathing::getInstitutionName, healthLungBreathing.getInstitutionName());
        }
        if (healthLungBreathing.getElderId() != null) {
            queryWrapper.eq(HealthLungBreathing::getElderId, healthLungBreathing.getElderId());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getElderName())) {
            queryWrapper.eq(HealthLungBreathing::getElderName, healthLungBreathing.getElderName());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getIdCard())) {
            queryWrapper.eq(HealthLungBreathing::getIdCard, healthLungBreathing.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getSex())) {
            queryWrapper.eq(HealthLungBreathing::getSex, healthLungBreathing.getSex());
        }
        if (healthLungBreathing.getAge() != null) {
            queryWrapper.eq(HealthLungBreathing::getAge, healthLungBreathing.getAge());
        }
        if (healthLungBreathing.getGaugeTime() != null) {
            queryWrapper.eq(HealthLungBreathing::getGaugeTime, healthLungBreathing.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getGaugeType())) {
            queryWrapper.eq(HealthLungBreathing::getGaugeType, healthLungBreathing.getGaugeType());
        }
        if (healthLungBreathing.getPEFState() != null) {
            queryWrapper.eq(HealthLungBreathing::getPEFState, healthLungBreathing.getPEFState());
        }
        if (healthLungBreathing.getFEV1State() != null) {
            queryWrapper.eq(HealthLungBreathing::getFEV1State, healthLungBreathing.getFEV1State());
        }
        if (healthLungBreathing.getFVCState() != null) {
            queryWrapper.eq(HealthLungBreathing::getFVCState, healthLungBreathing.getFVCState());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getOpinion())) {
            queryWrapper.eq(HealthLungBreathing::getOpinion, healthLungBreathing.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getWarnFlag())) {
            queryWrapper.eq(HealthLungBreathing::getWarnFlag, healthLungBreathing.getWarnFlag());
        }
        if (healthLungBreathing.getAreaCode() != null) {
            queryWrapper.eq(HealthLungBreathing::getAreaCode, healthLungBreathing.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getAreaName())) {
            queryWrapper.eq(HealthLungBreathing::getAreaName, healthLungBreathing.getAreaName());
        }
        if (healthLungBreathing.getCreateUser() != null) {
            queryWrapper.eq(HealthLungBreathing::getCreateUser, healthLungBreathing.getCreateUser());
        }
        if (healthLungBreathing.getCreateDept() != null) {
            queryWrapper.eq(HealthLungBreathing::getCreateDept, healthLungBreathing.getCreateDept());
        }
        if (healthLungBreathing.getCreateTime() != null) {
            queryWrapper.eq(HealthLungBreathing::getCreateTime, healthLungBreathing.getCreateTime());
        }
        if (healthLungBreathing.getUpdateUser() != null) {
            queryWrapper.eq(HealthLungBreathing::getUpdateUser, healthLungBreathing.getUpdateUser());
        }
        if (healthLungBreathing.getUpdateTime() != null) {
            queryWrapper.eq(HealthLungBreathing::getUpdateTime, healthLungBreathing.getUpdateTime());
        }
        if (healthLungBreathing.getIsDeleted() != null) {
            queryWrapper.eq(HealthLungBreathing::getIsDeleted, healthLungBreathing.getIsDeleted());
        }
        if (healthLungBreathing.getStatus() != null) {
            queryWrapper.eq(HealthLungBreathing::getStatus, healthLungBreathing.getStatus());
        }
        if (StringUtil.isNotEmpty(healthLungBreathing.getDataSource())) {
            queryWrapper.eq(HealthLungBreathing::getDataSource, healthLungBreathing.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthLungBreathing 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthLungBreathing insert(HealthLungBreathing healthLungBreathing) {
        healthLungBreathing.setId(null);
        getBaseMapper().insert(healthLungBreathing);
        return healthLungBreathing;
    }

    /**
    * 更新数据
    *
    * @param healthLungBreathing 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthLungBreathing update(HealthLungBreathing healthLungBreathing) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthLungBreathing> chainWrapper = new LambdaUpdateChainWrapper<HealthLungBreathing>(getBaseMapper());
        if (healthLungBreathing.getId() != null) {
            chainWrapper.set(HealthLungBreathing::getId, healthLungBreathing.getId());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getTenantId())) {
            chainWrapper.set(HealthLungBreathing::getTenantId, healthLungBreathing.getTenantId());
        }
        if (healthLungBreathing.getCorpId() != null) {
            chainWrapper.set(HealthLungBreathing::getCorpId, healthLungBreathing.getCorpId());
        }
        if (healthLungBreathing.getInstitutionId() != null) {
            chainWrapper.set(HealthLungBreathing::getInstitutionId, healthLungBreathing.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getInstitutionName())) {
            chainWrapper.set(HealthLungBreathing::getInstitutionName, healthLungBreathing.getInstitutionName());
        }
        if (healthLungBreathing.getElderId() != null) {
            chainWrapper.set(HealthLungBreathing::getElderId, healthLungBreathing.getElderId());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getElderName())) {
            chainWrapper.set(HealthLungBreathing::getElderName, healthLungBreathing.getElderName());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getIdCard())) {
            chainWrapper.set(HealthLungBreathing::getIdCard, healthLungBreathing.getIdCard());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getSex())) {
            chainWrapper.set(HealthLungBreathing::getSex, healthLungBreathing.getSex());
        }
        if (healthLungBreathing.getAge() != null) {
            chainWrapper.set(HealthLungBreathing::getAge, healthLungBreathing.getAge());
        }
        if (healthLungBreathing.getGaugeTime() != null) {
            chainWrapper.set(HealthLungBreathing::getGaugeTime, healthLungBreathing.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getGaugeType())) {
            chainWrapper.set(HealthLungBreathing::getGaugeType, healthLungBreathing.getGaugeType());
        }
        if (healthLungBreathing.getPEFState() != null) {
            chainWrapper.set(HealthLungBreathing::getPEFState, healthLungBreathing.getPEFState());
        }
        if (healthLungBreathing.getFEV1State() != null) {
            chainWrapper.set(HealthLungBreathing::getFEV1State, healthLungBreathing.getFEV1State());
        }
        if (healthLungBreathing.getFVCState() != null) {
            chainWrapper.set(HealthLungBreathing::getFVCState, healthLungBreathing.getFVCState());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getOpinion())) {
            chainWrapper.set(HealthLungBreathing::getOpinion, healthLungBreathing.getOpinion());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getWarnFlag())) {
            chainWrapper.set(HealthLungBreathing::getWarnFlag, healthLungBreathing.getWarnFlag());
        }
        if (healthLungBreathing.getAreaCode() != null) {
            chainWrapper.set(HealthLungBreathing::getAreaCode, healthLungBreathing.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getAreaName())) {
            chainWrapper.set(HealthLungBreathing::getAreaName, healthLungBreathing.getAreaName());
        }
        if (healthLungBreathing.getCreateUser() != null) {
            chainWrapper.set(HealthLungBreathing::getCreateUser, healthLungBreathing.getCreateUser());
        }
        if (healthLungBreathing.getCreateDept() != null) {
            chainWrapper.set(HealthLungBreathing::getCreateDept, healthLungBreathing.getCreateDept());
        }
        if (healthLungBreathing.getCreateTime() != null) {
            chainWrapper.set(HealthLungBreathing::getCreateTime, healthLungBreathing.getCreateTime());
        }
        if (healthLungBreathing.getUpdateUser() != null) {
            chainWrapper.set(HealthLungBreathing::getUpdateUser, healthLungBreathing.getUpdateUser());
        }
        if (healthLungBreathing.getUpdateTime() != null) {
            chainWrapper.set(HealthLungBreathing::getUpdateTime, healthLungBreathing.getUpdateTime());
        }
        if (healthLungBreathing.getIsDeleted() != null) {
            chainWrapper.set(HealthLungBreathing::getIsDeleted, healthLungBreathing.getIsDeleted());
        }
        if (healthLungBreathing.getStatus() != null) {
            chainWrapper.set(HealthLungBreathing::getStatus, healthLungBreathing.getStatus());
        }
        if (StringUtil.isNotBlank(healthLungBreathing.getDataSource())) {
            chainWrapper.set(HealthLungBreathing::getDataSource, healthLungBreathing.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthLungBreathing::getId, healthLungBreathing.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthLungBreathing.getId());
        } else {
            return healthLungBreathing;
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
    public boolean saveHealthLungBreathingBatch(List<HealthLungBreathing> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthLungBreathing healthLungBreathing : insertList) {
            //使用默认的雪花算法生成
            healthLungBreathing.setId(null);
            //healthLungBreathing.setCreatedDt(currentDte);
            //healthLungBreathing.setUpdatedDt(currentDte);
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
    public Integer deleteHealthLungBreathingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthLungBreathing> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


