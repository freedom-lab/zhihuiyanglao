package cn.pluss.platform.service.healthBloodPressure.impl;

import cn.pluss.platform.mapper.HealthBloodPressureMapper;
import cn.pluss.platform.model.entity.HealthBloodPressure;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.model.vo.BloodDetectionVo;
import cn.pluss.platform.model.vo.BloodWeeklyStatVo;
import cn.pluss.platform.service.healthBloodPressure.HealthBloodPressureService;
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
@Service("healthBloodPressureService")
public class HealthBloodPressureServiceImpl extends ServiceImpl< HealthBloodPressureMapper, HealthBloodPressure> implements HealthBloodPressureService {
    private static final Logger logger = LoggerFactory.getLogger(HealthBloodPressureServiceImpl.class);

    @Resource
    private HealthParamService healthParamService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthBloodPressure> queryPage(Map map) {
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
    public HealthBloodPressure queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthBloodPressure 实例对象
    * @return 实例对象
    */
    @Override
    public HealthBloodPressure queryOne(HealthBloodPressure healthBloodPressure){
        LambdaQueryWrapper<HealthBloodPressure> queryWrapper = getQueryWrapper(healthBloodPressure);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthBloodPressure
    * @return
    */
    @Override
    public List<HealthBloodPressure> queryList(HealthBloodPressure healthBloodPressure) {
        LambdaQueryWrapper<HealthBloodPressure> queryWrapper = getQueryWrapper(healthBloodPressure);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthBloodPressure
    * @return
    */
    public static LambdaQueryWrapper<HealthBloodPressure> getQueryWrapper(HealthBloodPressure healthBloodPressure){
        LambdaQueryWrapper<HealthBloodPressure> queryWrapper = new LambdaQueryWrapper<>();
        if (healthBloodPressure.getId() != null) {
            queryWrapper.eq(HealthBloodPressure::getId, healthBloodPressure.getId());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getTenantId())) {
            queryWrapper.eq(HealthBloodPressure::getTenantId, healthBloodPressure.getTenantId());
        }
        if (healthBloodPressure.getCorpId() != null) {
            queryWrapper.eq(HealthBloodPressure::getCorpId, healthBloodPressure.getCorpId());
        }
        if (healthBloodPressure.getInstitutionId() != null) {
            queryWrapper.eq(HealthBloodPressure::getInstitutionId, healthBloodPressure.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getInstitutionName())) {
            queryWrapper.eq(HealthBloodPressure::getInstitutionName, healthBloodPressure.getInstitutionName());
        }
        if (healthBloodPressure.getElderId() != null) {
            queryWrapper.eq(HealthBloodPressure::getElderId, healthBloodPressure.getElderId());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getElderName())) {
            queryWrapper.eq(HealthBloodPressure::getElderName, healthBloodPressure.getElderName());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getIdCard())) {
            queryWrapper.eq(HealthBloodPressure::getIdCard, healthBloodPressure.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getSex())) {
            queryWrapper.eq(HealthBloodPressure::getSex, healthBloodPressure.getSex());
        }
        if (healthBloodPressure.getAge() != null) {
            queryWrapper.eq(HealthBloodPressure::getAge, healthBloodPressure.getAge());
        }
        if (healthBloodPressure.getGaugeTime() != null) {
            queryWrapper.eq(HealthBloodPressure::getGaugeTime, healthBloodPressure.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getGaugeType())) {
            queryWrapper.eq(HealthBloodPressure::getGaugeType, healthBloodPressure.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getConditions())) {
            queryWrapper.eq(HealthBloodPressure::getConditions, healthBloodPressure.getConditions());
        }
        if (healthBloodPressure.getPulseRate() != null) {
            queryWrapper.eq(HealthBloodPressure::getPulseRate, healthBloodPressure.getPulseRate());
        }
        if (healthBloodPressure.getSystolicPressure() != null) {
            queryWrapper.eq(HealthBloodPressure::getSystolicPressure, healthBloodPressure.getSystolicPressure());
        }
        if (healthBloodPressure.getDiastolicPressure() != null) {
            queryWrapper.eq(HealthBloodPressure::getDiastolicPressure, healthBloodPressure.getDiastolicPressure());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getAnalysisResult())) {
            queryWrapper.eq(HealthBloodPressure::getAnalysisResult, healthBloodPressure.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getOpinion())) {
            queryWrapper.eq(HealthBloodPressure::getOpinion, healthBloodPressure.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getWarnFlag())) {
            queryWrapper.eq(HealthBloodPressure::getWarnFlag, healthBloodPressure.getWarnFlag());
        }
        if (healthBloodPressure.getAreaCode() != null) {
            queryWrapper.eq(HealthBloodPressure::getAreaCode, healthBloodPressure.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getAreaName())) {
            queryWrapper.eq(HealthBloodPressure::getAreaName, healthBloodPressure.getAreaName());
        }
        if (healthBloodPressure.getCreateUser() != null) {
            queryWrapper.eq(HealthBloodPressure::getCreateUser, healthBloodPressure.getCreateUser());
        }
        if (healthBloodPressure.getCreateDept() != null) {
            queryWrapper.eq(HealthBloodPressure::getCreateDept, healthBloodPressure.getCreateDept());
        }
        if (healthBloodPressure.getCreateTime() != null) {
            queryWrapper.eq(HealthBloodPressure::getCreateTime, healthBloodPressure.getCreateTime());
        }
        if (healthBloodPressure.getUpdateUser() != null) {
            queryWrapper.eq(HealthBloodPressure::getUpdateUser, healthBloodPressure.getUpdateUser());
        }
        if (healthBloodPressure.getUpdateTime() != null) {
            queryWrapper.eq(HealthBloodPressure::getUpdateTime, healthBloodPressure.getUpdateTime());
        }
        if (healthBloodPressure.getIsDeleted() != null) {
            queryWrapper.eq(HealthBloodPressure::getIsDeleted, healthBloodPressure.getIsDeleted());
        }
        if (healthBloodPressure.getStatus() != null) {
            queryWrapper.eq(HealthBloodPressure::getStatus, healthBloodPressure.getStatus());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getDataSource())) {
            queryWrapper.eq(HealthBloodPressure::getDataSource, healthBloodPressure.getDataSource());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getSystolicPressureResult())) {
            queryWrapper.eq(HealthBloodPressure::getSystolicPressureResult, healthBloodPressure.getSystolicPressureResult());
        }
        if (StringUtil.isNotEmpty(healthBloodPressure.getDiastolicPressureResult())) {
            queryWrapper.eq(HealthBloodPressure::getDiastolicPressureResult, healthBloodPressure.getDiastolicPressureResult());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthBloodPressure 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodPressure insert(HealthBloodPressure healthBloodPressure) {
        healthBloodPressure.setId(null);
        getBaseMapper().insert(healthBloodPressure);
        return healthBloodPressure;
    }

    /**
    * 更新数据
    *
    * @param healthBloodPressure 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodPressure update(HealthBloodPressure healthBloodPressure) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthBloodPressure> chainWrapper = new LambdaUpdateChainWrapper<HealthBloodPressure>(getBaseMapper());
        if (healthBloodPressure.getId() != null) {
            chainWrapper.set(HealthBloodPressure::getId, healthBloodPressure.getId());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getTenantId())) {
            chainWrapper.set(HealthBloodPressure::getTenantId, healthBloodPressure.getTenantId());
        }
        if (healthBloodPressure.getCorpId() != null) {
            chainWrapper.set(HealthBloodPressure::getCorpId, healthBloodPressure.getCorpId());
        }
        if (healthBloodPressure.getInstitutionId() != null) {
            chainWrapper.set(HealthBloodPressure::getInstitutionId, healthBloodPressure.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getInstitutionName())) {
            chainWrapper.set(HealthBloodPressure::getInstitutionName, healthBloodPressure.getInstitutionName());
        }
        if (healthBloodPressure.getElderId() != null) {
            chainWrapper.set(HealthBloodPressure::getElderId, healthBloodPressure.getElderId());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getElderName())) {
            chainWrapper.set(HealthBloodPressure::getElderName, healthBloodPressure.getElderName());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getIdCard())) {
            chainWrapper.set(HealthBloodPressure::getIdCard, healthBloodPressure.getIdCard());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getSex())) {
            chainWrapper.set(HealthBloodPressure::getSex, healthBloodPressure.getSex());
        }
        if (healthBloodPressure.getAge() != null) {
            chainWrapper.set(HealthBloodPressure::getAge, healthBloodPressure.getAge());
        }
        if (healthBloodPressure.getGaugeTime() != null) {
            chainWrapper.set(HealthBloodPressure::getGaugeTime, healthBloodPressure.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getGaugeType())) {
            chainWrapper.set(HealthBloodPressure::getGaugeType, healthBloodPressure.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getConditions())) {
            chainWrapper.set(HealthBloodPressure::getConditions, healthBloodPressure.getConditions());
        }
        if (healthBloodPressure.getPulseRate() != null) {
            chainWrapper.set(HealthBloodPressure::getPulseRate, healthBloodPressure.getPulseRate());
        }
        if (healthBloodPressure.getSystolicPressure() != null) {
            chainWrapper.set(HealthBloodPressure::getSystolicPressure, healthBloodPressure.getSystolicPressure());
        }
        if (healthBloodPressure.getDiastolicPressure() != null) {
            chainWrapper.set(HealthBloodPressure::getDiastolicPressure, healthBloodPressure.getDiastolicPressure());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getAnalysisResult())) {
            chainWrapper.set(HealthBloodPressure::getAnalysisResult, healthBloodPressure.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getOpinion())) {
            chainWrapper.set(HealthBloodPressure::getOpinion, healthBloodPressure.getOpinion());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getWarnFlag())) {
            chainWrapper.set(HealthBloodPressure::getWarnFlag, healthBloodPressure.getWarnFlag());
        }
        if (healthBloodPressure.getAreaCode() != null) {
            chainWrapper.set(HealthBloodPressure::getAreaCode, healthBloodPressure.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getAreaName())) {
            chainWrapper.set(HealthBloodPressure::getAreaName, healthBloodPressure.getAreaName());
        }
        if (healthBloodPressure.getCreateUser() != null) {
            chainWrapper.set(HealthBloodPressure::getCreateUser, healthBloodPressure.getCreateUser());
        }
        if (healthBloodPressure.getCreateDept() != null) {
            chainWrapper.set(HealthBloodPressure::getCreateDept, healthBloodPressure.getCreateDept());
        }
        if (healthBloodPressure.getCreateTime() != null) {
            chainWrapper.set(HealthBloodPressure::getCreateTime, healthBloodPressure.getCreateTime());
        }
        if (healthBloodPressure.getUpdateUser() != null) {
            chainWrapper.set(HealthBloodPressure::getUpdateUser, healthBloodPressure.getUpdateUser());
        }
        if (healthBloodPressure.getUpdateTime() != null) {
            chainWrapper.set(HealthBloodPressure::getUpdateTime, healthBloodPressure.getUpdateTime());
        }
        if (healthBloodPressure.getIsDeleted() != null) {
            chainWrapper.set(HealthBloodPressure::getIsDeleted, healthBloodPressure.getIsDeleted());
        }
        if (healthBloodPressure.getStatus() != null) {
            chainWrapper.set(HealthBloodPressure::getStatus, healthBloodPressure.getStatus());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getDataSource())) {
            chainWrapper.set(HealthBloodPressure::getDataSource, healthBloodPressure.getDataSource());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getSystolicPressureResult())) {
            chainWrapper.set(HealthBloodPressure::getSystolicPressureResult, healthBloodPressure.getSystolicPressureResult());
        }
        if (StringUtil.isNotBlank(healthBloodPressure.getDiastolicPressureResult())) {
            chainWrapper.set(HealthBloodPressure::getDiastolicPressureResult, healthBloodPressure.getDiastolicPressureResult());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthBloodPressure::getId, healthBloodPressure.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthBloodPressure.getId());
        } else {
            return healthBloodPressure;
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
    public boolean saveHealthBloodPressureBatch(List<HealthBloodPressure> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthBloodPressure healthBloodPressure : insertList) {
            //使用默认的雪花算法生成
            healthBloodPressure.setId(null);
            //healthBloodPressure.setCreatedDt(currentDte);
            //healthBloodPressure.setUpdatedDt(currentDte);
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
    public Integer deleteHealthBloodPressureBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthBloodPressure> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> monitorBloodPressure(HealthBloodPressure healthBloodPressure) {
        // 查询血压记录
        List<HealthBloodPressure> bpList = queryList(healthBloodPressure);
        if (CollectionUtils.isEmpty(bpList)) {
            Map<String, Object> emptyResult = new HashMap<>();
            emptyResult.put("normalList", Collections.emptyList());
            emptyResult.put("abnormalList", Collections.emptyList());
            return emptyResult;
        }

        //查出脉搏(MB)、高压(XY_GY)、低压(XY_DY)的参考范围
        List<String> paramCodes = Arrays.asList("MB", "XY_GY", "XY_DY");
        List<HealthParam> params = healthParamService.list(
                new LambdaQueryWrapper<HealthParam>()
                        .in(HealthParam::getParamCode, paramCodes)
        );
        Map<String, HealthParam> paramMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(params)) {
            for (HealthParam p : params) {
                paramMap.put(p.getParamCode(), p);
            }
        }
        HealthParam mbParam = paramMap.get("MB");
        HealthParam xyGyParam = paramMap.get("XY_GY");
        HealthParam xyDyParam = paramMap.get("XY_DY");

        //记录异常字段名
        List<HealthBloodPressure> normalList = new ArrayList<>();
        List<HealthBloodPressure> abnormalList = new ArrayList<>();
        for (HealthBloodPressure bp : bpList) {
            List<String> abnormalFields = new ArrayList<>();

            // 脉搏率
            if (mbParam != null && bp.getPulseRate() != null) {
                if (mbParam.getMinValue() != null && bp.getPulseRate() < mbParam.getMinValue()) {
                    abnormalFields.add("pulseRate");
                }
                if (mbParam.getMaxValue() != null && bp.getPulseRate() > mbParam.getMaxValue()) {
                    if (!abnormalFields.contains("pulseRate")) {
                        abnormalFields.add("pulseRate");
                    }
                }
            }
            // 收缩压(高压)
            if (xyGyParam != null && bp.getSystolicPressure() != null) {
                if (xyGyParam.getMinValue() != null && bp.getSystolicPressure() < xyGyParam.getMinValue()) {
                    abnormalFields.add("systolicPressure");
                }
                if (xyGyParam.getMaxValue() != null && bp.getSystolicPressure() > xyGyParam.getMaxValue()) {
                    if (!abnormalFields.contains("systolicPressure")) {
                        abnormalFields.add("systolicPressure");
                    }
                }
            }
            // 舒张压(低压)
            if (xyDyParam != null && bp.getDiastolicPressure() != null) {
                if (xyDyParam.getMinValue() != null && bp.getDiastolicPressure() < xyDyParam.getMinValue()) {
                    abnormalFields.add("diastolicPressure");
                }
                if (xyDyParam.getMaxValue() != null && bp.getDiastolicPressure() > xyDyParam.getMaxValue()) {
                    if (!abnormalFields.contains("diastolicPressure")) {
                        abnormalFields.add("diastolicPressure");
                    }
                }
            }

            if (!abnormalFields.isEmpty()) {
                bp.setAbnormalFields(abnormalFields);
                abnormalList.add(bp);
            } else {
                normalList.add(bp);
            }
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("normalList", normalList);
        resultMap.put("abnormalList", abnormalList);
        return resultMap;
    }

    @Override
    public BloodDetectionVo queryBloodPressureDetectionStatistics(HealthBloodPressure healthBloodPressure) {
        return getBaseMapper().queryBloodPressureDetectionStatistics(healthBloodPressure);
    }

    @Override
    public List<BloodWeeklyStatVo> queryWeeklyBloodPressureStats() {
        return getBaseMapper().queryWeeklyBloodPressureStats();
    }
}


