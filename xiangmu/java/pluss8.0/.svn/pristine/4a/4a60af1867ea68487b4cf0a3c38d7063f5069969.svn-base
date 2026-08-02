package cn.pluss.platform.service.healthEcgRecords.impl;

import cn.pluss.platform.mapper.HealthEcgRecordsMapper;
import cn.pluss.platform.model.entity.HealthEcgRecords;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.service.healthEcgRecords.HealthEcgRecordsService;
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
@Service("healthEcgRecordsService")
public class HealthEcgRecordsServiceImpl extends ServiceImpl< HealthEcgRecordsMapper, HealthEcgRecords> implements HealthEcgRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthEcgRecordsServiceImpl.class);

    @Resource
    private HealthParamService healthParamService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthEcgRecords> queryPage(Map map) {
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
    public HealthEcgRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthEcgRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthEcgRecords queryOne(HealthEcgRecords healthEcgRecords){
        LambdaQueryWrapper<HealthEcgRecords> queryWrapper = getQueryWrapper(healthEcgRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthEcgRecords
    * @return
    */
    @Override
    public List<HealthEcgRecords> queryList(HealthEcgRecords healthEcgRecords) {
        LambdaQueryWrapper<HealthEcgRecords> queryWrapper = getQueryWrapper(healthEcgRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthEcgRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthEcgRecords> getQueryWrapper(HealthEcgRecords healthEcgRecords){
        LambdaQueryWrapper<HealthEcgRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthEcgRecords.getId() != null) {
            queryWrapper.eq(HealthEcgRecords::getId, healthEcgRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getTenantId())) {
            queryWrapper.eq(HealthEcgRecords::getTenantId, healthEcgRecords.getTenantId());
        }
        if (healthEcgRecords.getCorpId() != null) {
            queryWrapper.eq(HealthEcgRecords::getCorpId, healthEcgRecords.getCorpId());
        }
        if (healthEcgRecords.getInstitutionId() != null) {
            queryWrapper.eq(HealthEcgRecords::getInstitutionId, healthEcgRecords.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getInstitutionName())) {
            queryWrapper.eq(HealthEcgRecords::getInstitutionName, healthEcgRecords.getInstitutionName());
        }
        if (healthEcgRecords.getElderId() != null) {
            queryWrapper.eq(HealthEcgRecords::getElderId, healthEcgRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getElderName())) {
            queryWrapper.eq(HealthEcgRecords::getElderName, healthEcgRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getIdCard())) {
            queryWrapper.eq(HealthEcgRecords::getIdCard, healthEcgRecords.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getSex())) {
            queryWrapper.eq(HealthEcgRecords::getSex, healthEcgRecords.getSex());
        }
        if (healthEcgRecords.getAge() != null) {
            queryWrapper.eq(HealthEcgRecords::getAge, healthEcgRecords.getAge());
        }
        if (healthEcgRecords.getGaugeTime() != null) {
            queryWrapper.eq(HealthEcgRecords::getGaugeTime, healthEcgRecords.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getGaugeType())) {
            queryWrapper.eq(HealthEcgRecords::getGaugeType, healthEcgRecords.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getConditions())) {
            queryWrapper.eq(HealthEcgRecords::getConditions, healthEcgRecords.getConditions());
        }
        if (healthEcgRecords.getHeartRate() != null) {
            queryWrapper.eq(HealthEcgRecords::getHeartRate, healthEcgRecords.getHeartRate());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getAnalysisResult())) {
            queryWrapper.eq(HealthEcgRecords::getAnalysisResult, healthEcgRecords.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getOpinion())) {
            queryWrapper.eq(HealthEcgRecords::getOpinion, healthEcgRecords.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getWarnFlag())) {
            queryWrapper.eq(HealthEcgRecords::getWarnFlag, healthEcgRecords.getWarnFlag());
        }
        if (healthEcgRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthEcgRecords::getAreaCode, healthEcgRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getAreaName())) {
            queryWrapper.eq(HealthEcgRecords::getAreaName, healthEcgRecords.getAreaName());
        }
        if (healthEcgRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthEcgRecords::getCreateUser, healthEcgRecords.getCreateUser());
        }
        if (healthEcgRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthEcgRecords::getCreateDept, healthEcgRecords.getCreateDept());
        }
        if (healthEcgRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthEcgRecords::getCreateTime, healthEcgRecords.getCreateTime());
        }
        if (healthEcgRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthEcgRecords::getUpdateUser, healthEcgRecords.getUpdateUser());
        }
        if (healthEcgRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthEcgRecords::getUpdateTime, healthEcgRecords.getUpdateTime());
        }
        if (healthEcgRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthEcgRecords::getIsDeleted, healthEcgRecords.getIsDeleted());
        }
        if (healthEcgRecords.getStatus() != null) {
            queryWrapper.eq(HealthEcgRecords::getStatus, healthEcgRecords.getStatus());
        }
        if (StringUtil.isNotEmpty(healthEcgRecords.getDataSource())) {
            queryWrapper.eq(HealthEcgRecords::getDataSource, healthEcgRecords.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthEcgRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthEcgRecords insert(HealthEcgRecords healthEcgRecords) {
        healthEcgRecords.setId(null);
        getBaseMapper().insert(healthEcgRecords);
        return healthEcgRecords;
    }

    /**
    * 更新数据
    *
    * @param healthEcgRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthEcgRecords update(HealthEcgRecords healthEcgRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthEcgRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthEcgRecords>(getBaseMapper());
        if (healthEcgRecords.getId() != null) {
            chainWrapper.set(HealthEcgRecords::getId, healthEcgRecords.getId());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getTenantId())) {
            chainWrapper.set(HealthEcgRecords::getTenantId, healthEcgRecords.getTenantId());
        }
        if (healthEcgRecords.getCorpId() != null) {
            chainWrapper.set(HealthEcgRecords::getCorpId, healthEcgRecords.getCorpId());
        }
        if (healthEcgRecords.getInstitutionId() != null) {
            chainWrapper.set(HealthEcgRecords::getInstitutionId, healthEcgRecords.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getInstitutionName())) {
            chainWrapper.set(HealthEcgRecords::getInstitutionName, healthEcgRecords.getInstitutionName());
        }
        if (healthEcgRecords.getElderId() != null) {
            chainWrapper.set(HealthEcgRecords::getElderId, healthEcgRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getElderName())) {
            chainWrapper.set(HealthEcgRecords::getElderName, healthEcgRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getIdCard())) {
            chainWrapper.set(HealthEcgRecords::getIdCard, healthEcgRecords.getIdCard());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getSex())) {
            chainWrapper.set(HealthEcgRecords::getSex, healthEcgRecords.getSex());
        }
        if (healthEcgRecords.getAge() != null) {
            chainWrapper.set(HealthEcgRecords::getAge, healthEcgRecords.getAge());
        }
        if (healthEcgRecords.getGaugeTime() != null) {
            chainWrapper.set(HealthEcgRecords::getGaugeTime, healthEcgRecords.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getGaugeType())) {
            chainWrapper.set(HealthEcgRecords::getGaugeType, healthEcgRecords.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getConditions())) {
            chainWrapper.set(HealthEcgRecords::getConditions, healthEcgRecords.getConditions());
        }
        if (healthEcgRecords.getHeartRate() != null) {
            chainWrapper.set(HealthEcgRecords::getHeartRate, healthEcgRecords.getHeartRate());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getAnalysisResult())) {
            chainWrapper.set(HealthEcgRecords::getAnalysisResult, healthEcgRecords.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getOpinion())) {
            chainWrapper.set(HealthEcgRecords::getOpinion, healthEcgRecords.getOpinion());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getWarnFlag())) {
            chainWrapper.set(HealthEcgRecords::getWarnFlag, healthEcgRecords.getWarnFlag());
        }
        if (healthEcgRecords.getAreaCode() != null) {
            chainWrapper.set(HealthEcgRecords::getAreaCode, healthEcgRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getAreaName())) {
            chainWrapper.set(HealthEcgRecords::getAreaName, healthEcgRecords.getAreaName());
        }
        if (healthEcgRecords.getCreateUser() != null) {
            chainWrapper.set(HealthEcgRecords::getCreateUser, healthEcgRecords.getCreateUser());
        }
        if (healthEcgRecords.getCreateDept() != null) {
            chainWrapper.set(HealthEcgRecords::getCreateDept, healthEcgRecords.getCreateDept());
        }
        if (healthEcgRecords.getCreateTime() != null) {
            chainWrapper.set(HealthEcgRecords::getCreateTime, healthEcgRecords.getCreateTime());
        }
        if (healthEcgRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthEcgRecords::getUpdateUser, healthEcgRecords.getUpdateUser());
        }
        if (healthEcgRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthEcgRecords::getUpdateTime, healthEcgRecords.getUpdateTime());
        }
        if (healthEcgRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthEcgRecords::getIsDeleted, healthEcgRecords.getIsDeleted());
        }
        if (healthEcgRecords.getStatus() != null) {
            chainWrapper.set(HealthEcgRecords::getStatus, healthEcgRecords.getStatus());
        }
        if (StringUtil.isNotBlank(healthEcgRecords.getDataSource())) {
            chainWrapper.set(HealthEcgRecords::getDataSource, healthEcgRecords.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthEcgRecords::getId, healthEcgRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthEcgRecords.getId());
        } else {
            return healthEcgRecords;
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
    public boolean saveHealthEcgRecordsBatch(List<HealthEcgRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthEcgRecords healthEcgRecords : insertList) {
            //使用默认的雪花算法生成
            healthEcgRecords.setId(null);
            //healthEcgRecords.setCreatedDt(currentDte);
            //healthEcgRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthEcgRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthEcgRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> monitorHeartRate(HealthEcgRecords queryParam) {
        //查询心电图记录
        List<HealthEcgRecords> ecgList = queryList(queryParam);
        if (CollectionUtils.isEmpty(ecgList)) {
            Map<String, Object> emptyResult = new HashMap<>();
            emptyResult.put("normalList", Collections.emptyList());
            emptyResult.put("abnormalList", Collections.emptyList());
            return emptyResult;
        }

        //查出心率(XL)的参考范围
        HealthParam xlParam = healthParamService.getOne(
                new LambdaQueryWrapper<HealthParam>()
                        .eq(HealthParam::getParamCode, "XL")
        );

        //逐条比较心率
        List<HealthEcgRecords> normalList = new ArrayList<>();
        List<HealthEcgRecords> abnormalList = new ArrayList<>();
        for (HealthEcgRecords ecg : ecgList) {
            List<String> abnormalFields = new ArrayList<>();

            if (xlParam != null && ecg.getHeartRate() != null) {
                if (xlParam.getMinValue() != null && ecg.getHeartRate() < xlParam.getMinValue()) {
                    abnormalFields.add("heartRate");
                }
                if (xlParam.getMaxValue() != null && ecg.getHeartRate() > xlParam.getMaxValue()) {
                    if (!abnormalFields.contains("heartRate")) {
                        abnormalFields.add("heartRate");
                    }
                }
            }

            if (!abnormalFields.isEmpty()) {
                ecg.setAbnormalFields(abnormalFields);
                abnormalList.add(ecg);
            } else {
                normalList.add(ecg);
            }
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("normalList", normalList);
        resultMap.put("abnormalList", abnormalList);
        return resultMap;
    }
}


