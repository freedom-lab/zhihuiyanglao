package cn.pluss.platform.service.healthBloodOxygen.impl;

import cn.pluss.platform.mapper.HealthBloodOxygenMapper;
import cn.pluss.platform.model.entity.HealthBloodOxygen;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.service.healthBloodOxygen.HealthBloodOxygenService;
import cn.pluss.platform.service.healthParam.HealthParamService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;

@Transactional
@Service("healthBloodOxygenService")
public class HealthBloodOxygenServiceImpl extends ServiceImpl< HealthBloodOxygenMapper, HealthBloodOxygen> implements HealthBloodOxygenService {
    private static final Logger logger = LoggerFactory.getLogger(HealthBloodOxygenServiceImpl.class);

    @Resource
    private HealthParamService healthParamService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthBloodOxygen> queryPage(Map map) {
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
    public HealthBloodOxygen queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthBloodOxygen 实例对象
    * @return 实例对象
    */
    @Override
    public HealthBloodOxygen queryOne(HealthBloodOxygen healthBloodOxygen){
        LambdaQueryWrapper<HealthBloodOxygen> queryWrapper = getQueryWrapper(healthBloodOxygen);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthBloodOxygen
    * @return
    */
    @Override
    public List<HealthBloodOxygen> queryList(HealthBloodOxygen healthBloodOxygen) {
        LambdaQueryWrapper<HealthBloodOxygen> queryWrapper = getQueryWrapper(healthBloodOxygen);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthBloodOxygen
    * @return
    */
    public static LambdaQueryWrapper<HealthBloodOxygen> getQueryWrapper(HealthBloodOxygen healthBloodOxygen){
        LambdaQueryWrapper<HealthBloodOxygen> queryWrapper = new LambdaQueryWrapper<>();
        if (healthBloodOxygen.getId() != null) {
            queryWrapper.eq(HealthBloodOxygen::getId, healthBloodOxygen.getId());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getTenantId())) {
            queryWrapper.eq(HealthBloodOxygen::getTenantId, healthBloodOxygen.getTenantId());
        }
        if (healthBloodOxygen.getCorpId() != null) {
            queryWrapper.eq(HealthBloodOxygen::getCorpId, healthBloodOxygen.getCorpId());
        }
        if (healthBloodOxygen.getInstitutionId() != null) {
            queryWrapper.eq(HealthBloodOxygen::getInstitutionId, healthBloodOxygen.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getInstitutionName())) {
            queryWrapper.eq(HealthBloodOxygen::getInstitutionName, healthBloodOxygen.getInstitutionName());
        }
        if (healthBloodOxygen.getElderId() != null) {
            queryWrapper.eq(HealthBloodOxygen::getElderId, healthBloodOxygen.getElderId());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getElderName())) {
            queryWrapper.eq(HealthBloodOxygen::getElderName, healthBloodOxygen.getElderName());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getIdCard())) {
            queryWrapper.eq(HealthBloodOxygen::getIdCard, healthBloodOxygen.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getSex())) {
            queryWrapper.eq(HealthBloodOxygen::getSex, healthBloodOxygen.getSex());
        }
        if (healthBloodOxygen.getAge() != null) {
            queryWrapper.eq(HealthBloodOxygen::getAge, healthBloodOxygen.getAge());
        }
        if (healthBloodOxygen.getGaugeTime() != null) {
            queryWrapper.eq(HealthBloodOxygen::getGaugeTime, healthBloodOxygen.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getGaugeType())) {
            queryWrapper.eq(HealthBloodOxygen::getGaugeType, healthBloodOxygen.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getConditions())) {
            queryWrapper.eq(HealthBloodOxygen::getConditions, healthBloodOxygen.getConditions());
        }
        if (healthBloodOxygen.getOxygenSaturation() != null) {
            queryWrapper.eq(HealthBloodOxygen::getOxygenSaturation, healthBloodOxygen.getOxygenSaturation());
        }
        if (healthBloodOxygen.getPulseRate() != null) {
            queryWrapper.eq(HealthBloodOxygen::getPulseRate, healthBloodOxygen.getPulseRate());
        }
        if (healthBloodOxygen.getBodyTemperature() != null) {
            queryWrapper.eq(HealthBloodOxygen::getBodyTemperature, healthBloodOxygen.getBodyTemperature());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getAnalysisResult())) {
            queryWrapper.eq(HealthBloodOxygen::getAnalysisResult, healthBloodOxygen.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getOpinion())) {
            queryWrapper.eq(HealthBloodOxygen::getOpinion, healthBloodOxygen.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getWarnFlag())) {
            queryWrapper.eq(HealthBloodOxygen::getWarnFlag, healthBloodOxygen.getWarnFlag());
        }
        if (healthBloodOxygen.getAreaCode() != null) {
            queryWrapper.eq(HealthBloodOxygen::getAreaCode, healthBloodOxygen.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getAreaName())) {
            queryWrapper.eq(HealthBloodOxygen::getAreaName, healthBloodOxygen.getAreaName());
        }
        if (healthBloodOxygen.getCreateUser() != null) {
            queryWrapper.eq(HealthBloodOxygen::getCreateUser, healthBloodOxygen.getCreateUser());
        }
        if (healthBloodOxygen.getCreateDept() != null) {
            queryWrapper.eq(HealthBloodOxygen::getCreateDept, healthBloodOxygen.getCreateDept());
        }
        if (healthBloodOxygen.getCreateTime() != null) {
            queryWrapper.eq(HealthBloodOxygen::getCreateTime, healthBloodOxygen.getCreateTime());
        }
        if (healthBloodOxygen.getUpdateUser() != null) {
            queryWrapper.eq(HealthBloodOxygen::getUpdateUser, healthBloodOxygen.getUpdateUser());
        }
        if (healthBloodOxygen.getUpdateTime() != null) {
            queryWrapper.eq(HealthBloodOxygen::getUpdateTime, healthBloodOxygen.getUpdateTime());
        }
        if (healthBloodOxygen.getIsDeleted() != null) {
            queryWrapper.eq(HealthBloodOxygen::getIsDeleted, healthBloodOxygen.getIsDeleted());
        }
        if (healthBloodOxygen.getStatus() != null) {
            queryWrapper.eq(HealthBloodOxygen::getStatus, healthBloodOxygen.getStatus());
        }
        if (StringUtil.isNotEmpty(healthBloodOxygen.getDataSource())) {
            queryWrapper.eq(HealthBloodOxygen::getDataSource, healthBloodOxygen.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthBloodOxygen 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodOxygen insert(HealthBloodOxygen healthBloodOxygen) {
        healthBloodOxygen.setId(null);
        getBaseMapper().insert(healthBloodOxygen);
        return healthBloodOxygen;
    }

    /**
    * 更新数据
    *
    * @param healthBloodOxygen 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodOxygen update(HealthBloodOxygen healthBloodOxygen) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthBloodOxygen> chainWrapper = new LambdaUpdateChainWrapper<HealthBloodOxygen>(getBaseMapper());
        if (healthBloodOxygen.getId() != null) {
            chainWrapper.set(HealthBloodOxygen::getId, healthBloodOxygen.getId());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getTenantId())) {
            chainWrapper.set(HealthBloodOxygen::getTenantId, healthBloodOxygen.getTenantId());
        }
        if (healthBloodOxygen.getCorpId() != null) {
            chainWrapper.set(HealthBloodOxygen::getCorpId, healthBloodOxygen.getCorpId());
        }
        if (healthBloodOxygen.getInstitutionId() != null) {
            chainWrapper.set(HealthBloodOxygen::getInstitutionId, healthBloodOxygen.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getInstitutionName())) {
            chainWrapper.set(HealthBloodOxygen::getInstitutionName, healthBloodOxygen.getInstitutionName());
        }
        if (healthBloodOxygen.getElderId() != null) {
            chainWrapper.set(HealthBloodOxygen::getElderId, healthBloodOxygen.getElderId());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getElderName())) {
            chainWrapper.set(HealthBloodOxygen::getElderName, healthBloodOxygen.getElderName());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getIdCard())) {
            chainWrapper.set(HealthBloodOxygen::getIdCard, healthBloodOxygen.getIdCard());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getSex())) {
            chainWrapper.set(HealthBloodOxygen::getSex, healthBloodOxygen.getSex());
        }
        if (healthBloodOxygen.getAge() != null) {
            chainWrapper.set(HealthBloodOxygen::getAge, healthBloodOxygen.getAge());
        }
        if (healthBloodOxygen.getGaugeTime() != null) {
            chainWrapper.set(HealthBloodOxygen::getGaugeTime, healthBloodOxygen.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getGaugeType())) {
            chainWrapper.set(HealthBloodOxygen::getGaugeType, healthBloodOxygen.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getConditions())) {
            chainWrapper.set(HealthBloodOxygen::getConditions, healthBloodOxygen.getConditions());
        }
        if (healthBloodOxygen.getOxygenSaturation() != null) {
            chainWrapper.set(HealthBloodOxygen::getOxygenSaturation, healthBloodOxygen.getOxygenSaturation());
        }
        if (healthBloodOxygen.getPulseRate() != null) {
            chainWrapper.set(HealthBloodOxygen::getPulseRate, healthBloodOxygen.getPulseRate());
        }
        if (healthBloodOxygen.getBodyTemperature() != null) {
            chainWrapper.set(HealthBloodOxygen::getBodyTemperature, healthBloodOxygen.getBodyTemperature());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getAnalysisResult())) {
            chainWrapper.set(HealthBloodOxygen::getAnalysisResult, healthBloodOxygen.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getOpinion())) {
            chainWrapper.set(HealthBloodOxygen::getOpinion, healthBloodOxygen.getOpinion());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getWarnFlag())) {
            chainWrapper.set(HealthBloodOxygen::getWarnFlag, healthBloodOxygen.getWarnFlag());
        }
        if (healthBloodOxygen.getAreaCode() != null) {
            chainWrapper.set(HealthBloodOxygen::getAreaCode, healthBloodOxygen.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getAreaName())) {
            chainWrapper.set(HealthBloodOxygen::getAreaName, healthBloodOxygen.getAreaName());
        }
        if (healthBloodOxygen.getCreateUser() != null) {
            chainWrapper.set(HealthBloodOxygen::getCreateUser, healthBloodOxygen.getCreateUser());
        }
        if (healthBloodOxygen.getCreateDept() != null) {
            chainWrapper.set(HealthBloodOxygen::getCreateDept, healthBloodOxygen.getCreateDept());
        }
        if (healthBloodOxygen.getCreateTime() != null) {
            chainWrapper.set(HealthBloodOxygen::getCreateTime, healthBloodOxygen.getCreateTime());
        }
        if (healthBloodOxygen.getUpdateUser() != null) {
            chainWrapper.set(HealthBloodOxygen::getUpdateUser, healthBloodOxygen.getUpdateUser());
        }
        if (healthBloodOxygen.getUpdateTime() != null) {
            chainWrapper.set(HealthBloodOxygen::getUpdateTime, healthBloodOxygen.getUpdateTime());
        }
        if (healthBloodOxygen.getIsDeleted() != null) {
            chainWrapper.set(HealthBloodOxygen::getIsDeleted, healthBloodOxygen.getIsDeleted());
        }
        if (healthBloodOxygen.getStatus() != null) {
            chainWrapper.set(HealthBloodOxygen::getStatus, healthBloodOxygen.getStatus());
        }
        if (StringUtil.isNotBlank(healthBloodOxygen.getDataSource())) {
            chainWrapper.set(HealthBloodOxygen::getDataSource, healthBloodOxygen.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthBloodOxygen::getId, healthBloodOxygen.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthBloodOxygen.getId());
        } else {
            return healthBloodOxygen;
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
    public boolean saveHealthBloodOxygenBatch(List<HealthBloodOxygen> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthBloodOxygen healthBloodOxygen : insertList) {
            //使用默认的雪花算法生成
            healthBloodOxygen.setId(null);
            //healthBloodOxygen.setCreatedDt(currentDte);
            //healthBloodOxygen.setUpdatedDt(currentDte);
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
    public Integer deleteHealthBloodOxygenBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthBloodOxygen> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> monitorBloodOxygen(HealthBloodOxygen queryParam) {
        // 查询血氧记录
        List<HealthBloodOxygen> boList = queryList(queryParam);
        if (CollectionUtils.isEmpty(boList)) {
            Map<String, Object> emptyResult = new HashMap<>();
            emptyResult.put("normalList", Collections.emptyList());
            emptyResult.put("abnormalList", Collections.emptyList());
            return emptyResult;
        }

        // 查出血氧(XY)的参考范围
        HealthParam xyParam = healthParamService.getOne(
                new LambdaQueryWrapper<HealthParam>()
                        .eq(HealthParam::getParamCode, "XY")
        );

        //比较血氧饱和度
        List<HealthBloodOxygen> normalList = new ArrayList<>();
        List<HealthBloodOxygen> abnormalList = new ArrayList<>();
        for (HealthBloodOxygen bo : boList) {
            List<String> abnormalFields = new ArrayList<>();

            if (xyParam != null && bo.getOxygenSaturation() != null) {
                if (xyParam.getMinValue() != null && bo.getOxygenSaturation() < xyParam.getMinValue()) {
                    abnormalFields.add("oxygenSaturation");
                }
                if (xyParam.getMaxValue() != null && bo.getOxygenSaturation() > xyParam.getMaxValue()) {
                    if (!abnormalFields.contains("oxygenSaturation")) {
                        abnormalFields.add("oxygenSaturation");
                    }
                }
            }

            if (!abnormalFields.isEmpty()) {
                bo.setAbnormalFields(abnormalFields);
                abnormalList.add(bo);
            } else {
                normalList.add(bo);
            }
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("normalList", normalList);
        resultMap.put("abnormalList", abnormalList);
        return resultMap;
    }
}


