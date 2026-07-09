package cn.pluss.platform.service.healthAiAnalysis.impl;

import cn.pluss.platform.mapper.HealthAiAnalysisMapper;
import cn.pluss.platform.model.entity.HealthAiAnalysis;
import cn.pluss.platform.service.healthAiAnalysis.HealthAiAnalysisService;
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
@Service("healthAiAnalysisService")
public class HealthAiAnalysisServiceImpl extends ServiceImpl< HealthAiAnalysisMapper, HealthAiAnalysis> implements HealthAiAnalysisService {
    private static final Logger logger = LoggerFactory.getLogger(HealthAiAnalysisServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthAiAnalysis> queryPage(Map map) {
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
    public HealthAiAnalysis queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthAiAnalysis 实例对象
    * @return 实例对象
    */
    @Override
    public HealthAiAnalysis queryOne(HealthAiAnalysis healthAiAnalysis){
        LambdaQueryWrapper<HealthAiAnalysis> queryWrapper = getQueryWrapper(healthAiAnalysis);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthAiAnalysis
    * @return
    */
    @Override
    public List<HealthAiAnalysis> queryList(HealthAiAnalysis healthAiAnalysis) {
        LambdaQueryWrapper<HealthAiAnalysis> queryWrapper = getQueryWrapper(healthAiAnalysis);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthAiAnalysis
    * @return
    */
    public static LambdaQueryWrapper<HealthAiAnalysis> getQueryWrapper(HealthAiAnalysis healthAiAnalysis){
        LambdaQueryWrapper<HealthAiAnalysis> queryWrapper = new LambdaQueryWrapper<>();
        if (healthAiAnalysis.getId() != null) {
            queryWrapper.eq(HealthAiAnalysis::getId, healthAiAnalysis.getId());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getTenantId())) {
            queryWrapper.eq(HealthAiAnalysis::getTenantId, healthAiAnalysis.getTenantId());
        }
        if (healthAiAnalysis.getCorpId() != null) {
            queryWrapper.eq(HealthAiAnalysis::getCorpId, healthAiAnalysis.getCorpId());
        }
        if (healthAiAnalysis.getInstitutionId() != null) {
            queryWrapper.eq(HealthAiAnalysis::getInstitutionId, healthAiAnalysis.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getInstitutionName())) {
            queryWrapper.eq(HealthAiAnalysis::getInstitutionName, healthAiAnalysis.getInstitutionName());
        }
        if (healthAiAnalysis.getElderId() != null) {
            queryWrapper.eq(HealthAiAnalysis::getElderId, healthAiAnalysis.getElderId());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getElderName())) {
            queryWrapper.eq(HealthAiAnalysis::getElderName, healthAiAnalysis.getElderName());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getIdCard())) {
            queryWrapper.eq(HealthAiAnalysis::getIdCard, healthAiAnalysis.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getSex())) {
            queryWrapper.eq(HealthAiAnalysis::getSex, healthAiAnalysis.getSex());
        }
        if (healthAiAnalysis.getAge() != null) {
            queryWrapper.eq(HealthAiAnalysis::getAge, healthAiAnalysis.getAge());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getHealthIndicatorType())) {
            queryWrapper.eq(HealthAiAnalysis::getHealthIndicatorType, healthAiAnalysis.getHealthIndicatorType());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getAnalysisType())) {
            queryWrapper.eq(HealthAiAnalysis::getAnalysisType, healthAiAnalysis.getAnalysisType());
        }
        if (healthAiAnalysis.getDataSourceId() != null) {
            queryWrapper.eq(HealthAiAnalysis::getDataSourceId, healthAiAnalysis.getDataSourceId());
        }
        if (healthAiAnalysis.getDataStartTime() != null) {
            queryWrapper.eq(HealthAiAnalysis::getDataStartTime, healthAiAnalysis.getDataStartTime());
        }
        if (healthAiAnalysis.getDataEndTime() != null) {
            queryWrapper.eq(HealthAiAnalysis::getDataEndTime, healthAiAnalysis.getDataEndTime());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getRawDataJson())) {
            queryWrapper.eq(HealthAiAnalysis::getRawDataJson, healthAiAnalysis.getRawDataJson());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getRiskLevel())) {
            queryWrapper.eq(HealthAiAnalysis::getRiskLevel, healthAiAnalysis.getRiskLevel());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getTrendAnalysis())) {
            queryWrapper.eq(HealthAiAnalysis::getTrendAnalysis, healthAiAnalysis.getTrendAnalysis());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getPredictionResult())) {
            queryWrapper.eq(HealthAiAnalysis::getPredictionResult, healthAiAnalysis.getPredictionResult());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getDietAdvice())) {
            queryWrapper.eq(HealthAiAnalysis::getDietAdvice, healthAiAnalysis.getDietAdvice());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getExerciseAdvice())) {
            queryWrapper.eq(HealthAiAnalysis::getExerciseAdvice, healthAiAnalysis.getExerciseAdvice());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getHealthGuidance())) {
            queryWrapper.eq(HealthAiAnalysis::getHealthGuidance, healthAiAnalysis.getHealthGuidance());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getWarningMessage())) {
            queryWrapper.eq(HealthAiAnalysis::getWarningMessage, healthAiAnalysis.getWarningMessage());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getInterventionSuggestions())) {
            queryWrapper.eq(HealthAiAnalysis::getInterventionSuggestions, healthAiAnalysis.getInterventionSuggestions());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getIndicatorSpecificJson())) {
            queryWrapper.eq(HealthAiAnalysis::getIndicatorSpecificJson, healthAiAnalysis.getIndicatorSpecificJson());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getAiRawResponse())) {
            queryWrapper.eq(HealthAiAnalysis::getAiRawResponse, healthAiAnalysis.getAiRawResponse());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getAiModel())) {
            queryWrapper.eq(HealthAiAnalysis::getAiModel, healthAiAnalysis.getAiModel());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getAiPromptVersion())) {
            queryWrapper.eq(HealthAiAnalysis::getAiPromptVersion, healthAiAnalysis.getAiPromptVersion());
        }
        if (healthAiAnalysis.getAnalysisDate() != null) {
            queryWrapper.eq(HealthAiAnalysis::getAnalysisDate, healthAiAnalysis.getAnalysisDate());
        }
        if (healthAiAnalysis.getAnalysisDurationMs() != null) {
            queryWrapper.eq(HealthAiAnalysis::getAnalysisDurationMs, healthAiAnalysis.getAnalysisDurationMs());
        }
        if (healthAiAnalysis.getAreaCode() != null) {
            queryWrapper.eq(HealthAiAnalysis::getAreaCode, healthAiAnalysis.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getAreaName())) {
            queryWrapper.eq(HealthAiAnalysis::getAreaName, healthAiAnalysis.getAreaName());
        }
        if (StringUtil.isNotEmpty(healthAiAnalysis.getRemark())) {
            queryWrapper.eq(HealthAiAnalysis::getRemark, healthAiAnalysis.getRemark());
        }
        if (healthAiAnalysis.getCreateUser() != null) {
            queryWrapper.eq(HealthAiAnalysis::getCreateUser, healthAiAnalysis.getCreateUser());
        }
        if (healthAiAnalysis.getCreateDept() != null) {
            queryWrapper.eq(HealthAiAnalysis::getCreateDept, healthAiAnalysis.getCreateDept());
        }
        if (healthAiAnalysis.getCreateTime() != null) {
            queryWrapper.eq(HealthAiAnalysis::getCreateTime, healthAiAnalysis.getCreateTime());
        }
        if (healthAiAnalysis.getUpdateUser() != null) {
            queryWrapper.eq(HealthAiAnalysis::getUpdateUser, healthAiAnalysis.getUpdateUser());
        }
        if (healthAiAnalysis.getUpdateTime() != null) {
            queryWrapper.eq(HealthAiAnalysis::getUpdateTime, healthAiAnalysis.getUpdateTime());
        }
        if (healthAiAnalysis.getIsDeleted() != null) {
            queryWrapper.eq(HealthAiAnalysis::getIsDeleted, healthAiAnalysis.getIsDeleted());
        }
        if (healthAiAnalysis.getStatus() != null) {
            queryWrapper.eq(HealthAiAnalysis::getStatus, healthAiAnalysis.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthAiAnalysis 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthAiAnalysis insert(HealthAiAnalysis healthAiAnalysis) {
        healthAiAnalysis.setId(null);
        getBaseMapper().insert(healthAiAnalysis);
        return healthAiAnalysis;
    }

    /**
    * 更新数据
    *
    * @param healthAiAnalysis 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthAiAnalysis update(HealthAiAnalysis healthAiAnalysis) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthAiAnalysis> chainWrapper = new LambdaUpdateChainWrapper<HealthAiAnalysis>(getBaseMapper());
        if (healthAiAnalysis.getId() != null) {
            chainWrapper.set(HealthAiAnalysis::getId, healthAiAnalysis.getId());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getTenantId())) {
            chainWrapper.set(HealthAiAnalysis::getTenantId, healthAiAnalysis.getTenantId());
        }
        if (healthAiAnalysis.getCorpId() != null) {
            chainWrapper.set(HealthAiAnalysis::getCorpId, healthAiAnalysis.getCorpId());
        }
        if (healthAiAnalysis.getInstitutionId() != null) {
            chainWrapper.set(HealthAiAnalysis::getInstitutionId, healthAiAnalysis.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getInstitutionName())) {
            chainWrapper.set(HealthAiAnalysis::getInstitutionName, healthAiAnalysis.getInstitutionName());
        }
        if (healthAiAnalysis.getElderId() != null) {
            chainWrapper.set(HealthAiAnalysis::getElderId, healthAiAnalysis.getElderId());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getElderName())) {
            chainWrapper.set(HealthAiAnalysis::getElderName, healthAiAnalysis.getElderName());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getIdCard())) {
            chainWrapper.set(HealthAiAnalysis::getIdCard, healthAiAnalysis.getIdCard());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getSex())) {
            chainWrapper.set(HealthAiAnalysis::getSex, healthAiAnalysis.getSex());
        }
        if (healthAiAnalysis.getAge() != null) {
            chainWrapper.set(HealthAiAnalysis::getAge, healthAiAnalysis.getAge());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getHealthIndicatorType())) {
            chainWrapper.set(HealthAiAnalysis::getHealthIndicatorType, healthAiAnalysis.getHealthIndicatorType());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getAnalysisType())) {
            chainWrapper.set(HealthAiAnalysis::getAnalysisType, healthAiAnalysis.getAnalysisType());
        }
        if (healthAiAnalysis.getDataSourceId() != null) {
            chainWrapper.set(HealthAiAnalysis::getDataSourceId, healthAiAnalysis.getDataSourceId());
        }
        if (healthAiAnalysis.getDataStartTime() != null) {
            chainWrapper.set(HealthAiAnalysis::getDataStartTime, healthAiAnalysis.getDataStartTime());
        }
        if (healthAiAnalysis.getDataEndTime() != null) {
            chainWrapper.set(HealthAiAnalysis::getDataEndTime, healthAiAnalysis.getDataEndTime());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getRawDataJson())) {
            chainWrapper.set(HealthAiAnalysis::getRawDataJson, healthAiAnalysis.getRawDataJson());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getRiskLevel())) {
            chainWrapper.set(HealthAiAnalysis::getRiskLevel, healthAiAnalysis.getRiskLevel());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getTrendAnalysis())) {
            chainWrapper.set(HealthAiAnalysis::getTrendAnalysis, healthAiAnalysis.getTrendAnalysis());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getPredictionResult())) {
            chainWrapper.set(HealthAiAnalysis::getPredictionResult, healthAiAnalysis.getPredictionResult());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getDietAdvice())) {
            chainWrapper.set(HealthAiAnalysis::getDietAdvice, healthAiAnalysis.getDietAdvice());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getExerciseAdvice())) {
            chainWrapper.set(HealthAiAnalysis::getExerciseAdvice, healthAiAnalysis.getExerciseAdvice());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getHealthGuidance())) {
            chainWrapper.set(HealthAiAnalysis::getHealthGuidance, healthAiAnalysis.getHealthGuidance());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getWarningMessage())) {
            chainWrapper.set(HealthAiAnalysis::getWarningMessage, healthAiAnalysis.getWarningMessage());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getInterventionSuggestions())) {
            chainWrapper.set(HealthAiAnalysis::getInterventionSuggestions, healthAiAnalysis.getInterventionSuggestions());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getIndicatorSpecificJson())) {
            chainWrapper.set(HealthAiAnalysis::getIndicatorSpecificJson, healthAiAnalysis.getIndicatorSpecificJson());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getAiRawResponse())) {
            chainWrapper.set(HealthAiAnalysis::getAiRawResponse, healthAiAnalysis.getAiRawResponse());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getAiModel())) {
            chainWrapper.set(HealthAiAnalysis::getAiModel, healthAiAnalysis.getAiModel());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getAiPromptVersion())) {
            chainWrapper.set(HealthAiAnalysis::getAiPromptVersion, healthAiAnalysis.getAiPromptVersion());
        }
        if (healthAiAnalysis.getAnalysisDate() != null) {
            chainWrapper.set(HealthAiAnalysis::getAnalysisDate, healthAiAnalysis.getAnalysisDate());
        }
        if (healthAiAnalysis.getAnalysisDurationMs() != null) {
            chainWrapper.set(HealthAiAnalysis::getAnalysisDurationMs, healthAiAnalysis.getAnalysisDurationMs());
        }
        if (healthAiAnalysis.getAreaCode() != null) {
            chainWrapper.set(HealthAiAnalysis::getAreaCode, healthAiAnalysis.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getAreaName())) {
            chainWrapper.set(HealthAiAnalysis::getAreaName, healthAiAnalysis.getAreaName());
        }
        if (StringUtil.isNotBlank(healthAiAnalysis.getRemark())) {
            chainWrapper.set(HealthAiAnalysis::getRemark, healthAiAnalysis.getRemark());
        }
        if (healthAiAnalysis.getCreateUser() != null) {
            chainWrapper.set(HealthAiAnalysis::getCreateUser, healthAiAnalysis.getCreateUser());
        }
        if (healthAiAnalysis.getCreateDept() != null) {
            chainWrapper.set(HealthAiAnalysis::getCreateDept, healthAiAnalysis.getCreateDept());
        }
        if (healthAiAnalysis.getCreateTime() != null) {
            chainWrapper.set(HealthAiAnalysis::getCreateTime, healthAiAnalysis.getCreateTime());
        }
        if (healthAiAnalysis.getUpdateUser() != null) {
            chainWrapper.set(HealthAiAnalysis::getUpdateUser, healthAiAnalysis.getUpdateUser());
        }
        if (healthAiAnalysis.getUpdateTime() != null) {
            chainWrapper.set(HealthAiAnalysis::getUpdateTime, healthAiAnalysis.getUpdateTime());
        }
        if (healthAiAnalysis.getIsDeleted() != null) {
            chainWrapper.set(HealthAiAnalysis::getIsDeleted, healthAiAnalysis.getIsDeleted());
        }
        if (healthAiAnalysis.getStatus() != null) {
            chainWrapper.set(HealthAiAnalysis::getStatus, healthAiAnalysis.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthAiAnalysis::getId, healthAiAnalysis.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthAiAnalysis.getId());
        } else {
            return healthAiAnalysis;
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
    public boolean saveHealthAiAnalysisBatch(List<HealthAiAnalysis> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthAiAnalysis healthAiAnalysis : insertList) {
            //使用默认的雪花算法生成
            healthAiAnalysis.setId(null);
            //healthAiAnalysis.setCreatedDt(currentDte);
            //healthAiAnalysis.setUpdatedDt(currentDte);
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
    public Integer deleteHealthAiAnalysisBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthAiAnalysis> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


