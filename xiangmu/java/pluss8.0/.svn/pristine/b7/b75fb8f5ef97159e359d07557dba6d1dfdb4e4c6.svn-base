package cn.pluss.platform.service.healthTemperatureRecords.impl;

import cn.pluss.platform.mapper.HealthTemperatureRecordsMapper;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.model.entity.HealthTemperatureRecords;
import cn.pluss.platform.service.healthTemperatureRecords.HealthTemperatureRecordsService;
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
@Service("healthTemperatureRecordsService")
public class HealthTemperatureRecordsServiceImpl extends ServiceImpl< HealthTemperatureRecordsMapper, HealthTemperatureRecords> implements HealthTemperatureRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthTemperatureRecordsServiceImpl.class);

    @Resource
    private HealthParamService healthParamService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthTemperatureRecords> queryPage(Map map) {
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
    public HealthTemperatureRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthTemperatureRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthTemperatureRecords queryOne(HealthTemperatureRecords healthTemperatureRecords){
        LambdaQueryWrapper<HealthTemperatureRecords> queryWrapper = getQueryWrapper(healthTemperatureRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthTemperatureRecords
    * @return
    */
    @Override
    public List<HealthTemperatureRecords> queryList(HealthTemperatureRecords healthTemperatureRecords) {
        LambdaQueryWrapper<HealthTemperatureRecords> queryWrapper = getQueryWrapper(healthTemperatureRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthTemperatureRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthTemperatureRecords> getQueryWrapper(HealthTemperatureRecords healthTemperatureRecords){
        LambdaQueryWrapper<HealthTemperatureRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthTemperatureRecords.getId() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getId, healthTemperatureRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getTenantId())) {
            queryWrapper.eq(HealthTemperatureRecords::getTenantId, healthTemperatureRecords.getTenantId());
        }
        if (healthTemperatureRecords.getCorpId() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getCorpId, healthTemperatureRecords.getCorpId());
        }
        if (healthTemperatureRecords.getInstitutionId() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getInstitutionId, healthTemperatureRecords.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getInstitutionName())) {
            queryWrapper.eq(HealthTemperatureRecords::getInstitutionName, healthTemperatureRecords.getInstitutionName());
        }
        if (healthTemperatureRecords.getElderId() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getElderId, healthTemperatureRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getElderName())) {
            queryWrapper.eq(HealthTemperatureRecords::getElderName, healthTemperatureRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getIdCard())) {
            queryWrapper.eq(HealthTemperatureRecords::getIdCard, healthTemperatureRecords.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getSex())) {
            queryWrapper.eq(HealthTemperatureRecords::getSex, healthTemperatureRecords.getSex());
        }
        if (healthTemperatureRecords.getAge() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getAge, healthTemperatureRecords.getAge());
        }
        if (healthTemperatureRecords.getGaugeTime() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getGaugeTime, healthTemperatureRecords.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getGaugeType())) {
            queryWrapper.eq(HealthTemperatureRecords::getGaugeType, healthTemperatureRecords.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getConditions())) {
            queryWrapper.eq(HealthTemperatureRecords::getConditions, healthTemperatureRecords.getConditions());
        }
        if (healthTemperatureRecords.getBodyTemperature() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getBodyTemperature, healthTemperatureRecords.getBodyTemperature());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getAnalysisResult())) {
            queryWrapper.eq(HealthTemperatureRecords::getAnalysisResult, healthTemperatureRecords.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getOpinion())) {
            queryWrapper.eq(HealthTemperatureRecords::getOpinion, healthTemperatureRecords.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getWarnFlag())) {
            queryWrapper.eq(HealthTemperatureRecords::getWarnFlag, healthTemperatureRecords.getWarnFlag());
        }
        if (healthTemperatureRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getAreaCode, healthTemperatureRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getAreaName())) {
            queryWrapper.eq(HealthTemperatureRecords::getAreaName, healthTemperatureRecords.getAreaName());
        }
        if (healthTemperatureRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getCreateUser, healthTemperatureRecords.getCreateUser());
        }
        if (healthTemperatureRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getCreateDept, healthTemperatureRecords.getCreateDept());
        }
        if (healthTemperatureRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getCreateTime, healthTemperatureRecords.getCreateTime());
        }
        if (healthTemperatureRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getUpdateUser, healthTemperatureRecords.getUpdateUser());
        }
        if (healthTemperatureRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getUpdateTime, healthTemperatureRecords.getUpdateTime());
        }
        if (healthTemperatureRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getIsDeleted, healthTemperatureRecords.getIsDeleted());
        }
        if (healthTemperatureRecords.getStatus() != null) {
            queryWrapper.eq(HealthTemperatureRecords::getStatus, healthTemperatureRecords.getStatus());
        }
        if (StringUtil.isNotEmpty(healthTemperatureRecords.getDataSource())) {
            queryWrapper.eq(HealthTemperatureRecords::getDataSource, healthTemperatureRecords.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthTemperatureRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthTemperatureRecords insert(HealthTemperatureRecords healthTemperatureRecords) {
        healthTemperatureRecords.setId(null);
        getBaseMapper().insert(healthTemperatureRecords);
        return healthTemperatureRecords;
    }

    /**
    * 更新数据
    *
    * @param healthTemperatureRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthTemperatureRecords update(HealthTemperatureRecords healthTemperatureRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthTemperatureRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthTemperatureRecords>(getBaseMapper());
        if (healthTemperatureRecords.getId() != null) {
            chainWrapper.set(HealthTemperatureRecords::getId, healthTemperatureRecords.getId());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getTenantId())) {
            chainWrapper.set(HealthTemperatureRecords::getTenantId, healthTemperatureRecords.getTenantId());
        }
        if (healthTemperatureRecords.getCorpId() != null) {
            chainWrapper.set(HealthTemperatureRecords::getCorpId, healthTemperatureRecords.getCorpId());
        }
        if (healthTemperatureRecords.getInstitutionId() != null) {
            chainWrapper.set(HealthTemperatureRecords::getInstitutionId, healthTemperatureRecords.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getInstitutionName())) {
            chainWrapper.set(HealthTemperatureRecords::getInstitutionName, healthTemperatureRecords.getInstitutionName());
        }
        if (healthTemperatureRecords.getElderId() != null) {
            chainWrapper.set(HealthTemperatureRecords::getElderId, healthTemperatureRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getElderName())) {
            chainWrapper.set(HealthTemperatureRecords::getElderName, healthTemperatureRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getIdCard())) {
            chainWrapper.set(HealthTemperatureRecords::getIdCard, healthTemperatureRecords.getIdCard());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getSex())) {
            chainWrapper.set(HealthTemperatureRecords::getSex, healthTemperatureRecords.getSex());
        }
        if (healthTemperatureRecords.getAge() != null) {
            chainWrapper.set(HealthTemperatureRecords::getAge, healthTemperatureRecords.getAge());
        }
        if (healthTemperatureRecords.getGaugeTime() != null) {
            chainWrapper.set(HealthTemperatureRecords::getGaugeTime, healthTemperatureRecords.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getGaugeType())) {
            chainWrapper.set(HealthTemperatureRecords::getGaugeType, healthTemperatureRecords.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getConditions())) {
            chainWrapper.set(HealthTemperatureRecords::getConditions, healthTemperatureRecords.getConditions());
        }
        if (healthTemperatureRecords.getBodyTemperature() != null) {
            chainWrapper.set(HealthTemperatureRecords::getBodyTemperature, healthTemperatureRecords.getBodyTemperature());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getAnalysisResult())) {
            chainWrapper.set(HealthTemperatureRecords::getAnalysisResult, healthTemperatureRecords.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getOpinion())) {
            chainWrapper.set(HealthTemperatureRecords::getOpinion, healthTemperatureRecords.getOpinion());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getWarnFlag())) {
            chainWrapper.set(HealthTemperatureRecords::getWarnFlag, healthTemperatureRecords.getWarnFlag());
        }
        if (healthTemperatureRecords.getAreaCode() != null) {
            chainWrapper.set(HealthTemperatureRecords::getAreaCode, healthTemperatureRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getAreaName())) {
            chainWrapper.set(HealthTemperatureRecords::getAreaName, healthTemperatureRecords.getAreaName());
        }
        if (healthTemperatureRecords.getCreateUser() != null) {
            chainWrapper.set(HealthTemperatureRecords::getCreateUser, healthTemperatureRecords.getCreateUser());
        }
        if (healthTemperatureRecords.getCreateDept() != null) {
            chainWrapper.set(HealthTemperatureRecords::getCreateDept, healthTemperatureRecords.getCreateDept());
        }
        if (healthTemperatureRecords.getCreateTime() != null) {
            chainWrapper.set(HealthTemperatureRecords::getCreateTime, healthTemperatureRecords.getCreateTime());
        }
        if (healthTemperatureRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthTemperatureRecords::getUpdateUser, healthTemperatureRecords.getUpdateUser());
        }
        if (healthTemperatureRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthTemperatureRecords::getUpdateTime, healthTemperatureRecords.getUpdateTime());
        }
        if (healthTemperatureRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthTemperatureRecords::getIsDeleted, healthTemperatureRecords.getIsDeleted());
        }
        if (healthTemperatureRecords.getStatus() != null) {
            chainWrapper.set(HealthTemperatureRecords::getStatus, healthTemperatureRecords.getStatus());
        }
        if (StringUtil.isNotBlank(healthTemperatureRecords.getDataSource())) {
            chainWrapper.set(HealthTemperatureRecords::getDataSource, healthTemperatureRecords.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthTemperatureRecords::getId, healthTemperatureRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthTemperatureRecords.getId());
        } else {
            return healthTemperatureRecords;
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
    public boolean saveHealthTemperatureRecordsBatch(List<HealthTemperatureRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthTemperatureRecords healthTemperatureRecords : insertList) {
            //使用默认的雪花算法生成
            healthTemperatureRecords.setId(null);
            //healthTemperatureRecords.setCreatedDt(currentDte);
            //healthTemperatureRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthTemperatureRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthTemperatureRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> monitorBodyTemperature(HealthTemperatureRecords queryParam) {
        //查询体温记录
        List<HealthTemperatureRecords> trList = queryList(queryParam);
        if (CollectionUtils.isEmpty(trList)) {
            Map<String, Object> emptyResult = new HashMap<>();
            emptyResult.put("normalList", Collections.emptyList());
            emptyResult.put("abnormalList", Collections.emptyList());
            return emptyResult;
        }

        //查出体温(TW)的参考范围
        HealthParam twParam = healthParamService.getOne(
                new LambdaQueryWrapper<HealthParam>()
                        .eq(HealthParam::getParamCode, "TW")
        );

        // 逐条比较体温
        List<HealthTemperatureRecords> normalList = new ArrayList<>();
        List<HealthTemperatureRecords> abnormalList = new ArrayList<>();
        for (HealthTemperatureRecords tr : trList) {
            List<String> abnormalFields = new ArrayList<>();

            if (twParam != null && tr.getBodyTemperature() != null) {
                if (twParam.getMinValue() != null && tr.getBodyTemperature() < twParam.getMinValue()) {
                    abnormalFields.add("bodyTemperature");
                }
                if (twParam.getMaxValue() != null && tr.getBodyTemperature() > twParam.getMaxValue()) {
                    if (!abnormalFields.contains("bodyTemperature")) {
                        abnormalFields.add("bodyTemperature");
                    }
                }
            }

            if (!abnormalFields.isEmpty()) {
                tr.setAbnormalFields(abnormalFields);
                abnormalList.add(tr);
            } else {
                normalList.add(tr);
            }
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("normalList", normalList);
        resultMap.put("abnormalList", abnormalList);
        return resultMap;
    }
}


