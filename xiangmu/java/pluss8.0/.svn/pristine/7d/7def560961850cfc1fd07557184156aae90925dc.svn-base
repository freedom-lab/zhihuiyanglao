package cn.pluss.platform.service.healthBasicsRecords.impl;

import cn.pluss.platform.mapper.HealthBasicsRecordsMapper;
import cn.pluss.platform.model.entity.HealthBasicsRecords;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.service.healthBasicsRecords.HealthBasicsRecordsService;
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
@Service("healthBasicsRecordsService")
public class HealthBasicsRecordsServiceImpl extends ServiceImpl< HealthBasicsRecordsMapper, HealthBasicsRecords> implements HealthBasicsRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthBasicsRecordsServiceImpl.class);

    @Resource
    private HealthParamService healthParamService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthBasicsRecords> queryPage(Map map) {
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
    public HealthBasicsRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthBasicsRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthBasicsRecords queryOne(HealthBasicsRecords healthBasicsRecords){
        LambdaQueryWrapper<HealthBasicsRecords> queryWrapper = getQueryWrapper(healthBasicsRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthBasicsRecords
    * @return
    */
    @Override
    public List<HealthBasicsRecords> queryList(HealthBasicsRecords healthBasicsRecords) {
        LambdaQueryWrapper<HealthBasicsRecords> queryWrapper = getQueryWrapper(healthBasicsRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthBasicsRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthBasicsRecords> getQueryWrapper(HealthBasicsRecords healthBasicsRecords){
        LambdaQueryWrapper<HealthBasicsRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthBasicsRecords.getId() != null) {
            queryWrapper.eq(HealthBasicsRecords::getId, healthBasicsRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getTenantId())) {
            queryWrapper.eq(HealthBasicsRecords::getTenantId, healthBasicsRecords.getTenantId());
        }
        if (healthBasicsRecords.getCorpId() != null) {
            queryWrapper.eq(HealthBasicsRecords::getCorpId, healthBasicsRecords.getCorpId());
        }
        if (healthBasicsRecords.getInstitutionId() != null) {
            queryWrapper.eq(HealthBasicsRecords::getInstitutionId, healthBasicsRecords.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getInstitutionName())) {
            queryWrapper.eq(HealthBasicsRecords::getInstitutionName, healthBasicsRecords.getInstitutionName());
        }
        if (healthBasicsRecords.getElderId() != null) {
            queryWrapper.eq(HealthBasicsRecords::getElderId, healthBasicsRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getElderName())) {
            queryWrapper.eq(HealthBasicsRecords::getElderName, healthBasicsRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getIdCard())) {
            queryWrapper.eq(HealthBasicsRecords::getIdCard, healthBasicsRecords.getIdCard());
        }
        if (healthBasicsRecords.getAge() != null) {
            queryWrapper.eq(HealthBasicsRecords::getAge, healthBasicsRecords.getAge());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getSex())) {
            queryWrapper.eq(HealthBasicsRecords::getSex, healthBasicsRecords.getSex());
        }
        if (healthBasicsRecords.getGaugeTime() != null) {
            queryWrapper.eq(HealthBasicsRecords::getGaugeTime, healthBasicsRecords.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getGaugeType())) {
            queryWrapper.eq(HealthBasicsRecords::getGaugeType, healthBasicsRecords.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getConditions())) {
            queryWrapper.eq(HealthBasicsRecords::getConditions, healthBasicsRecords.getConditions());
        }
        if (healthBasicsRecords.getWaist() != null) {
            queryWrapper.eq(HealthBasicsRecords::getWaist, healthBasicsRecords.getWaist());
        }
        if (healthBasicsRecords.getHeight() != null) {
            queryWrapper.eq(HealthBasicsRecords::getHeight, healthBasicsRecords.getHeight());
        }
        if (healthBasicsRecords.getWeight() != null) {
            queryWrapper.eq(HealthBasicsRecords::getWeight, healthBasicsRecords.getWeight());
        }
        if (healthBasicsRecords.getFatContent() != null) {
            queryWrapper.eq(HealthBasicsRecords::getFatContent, healthBasicsRecords.getFatContent());
        }
        if (healthBasicsRecords.getBmi() != null) {
            queryWrapper.eq(HealthBasicsRecords::getBmi, healthBasicsRecords.getBmi());
        }
        if (healthBasicsRecords.getBmr() != null) {
            queryWrapper.eq(HealthBasicsRecords::getBmr, healthBasicsRecords.getBmr());
        }
        if (healthBasicsRecords.getPbf() != null) {
            queryWrapper.eq(HealthBasicsRecords::getPbf, healthBasicsRecords.getPbf());
        }
        if (healthBasicsRecords.getWater() != null) {
            queryWrapper.eq(HealthBasicsRecords::getWater, healthBasicsRecords.getWater());
        }
        if (healthBasicsRecords.getBone() != null) {
            queryWrapper.eq(HealthBasicsRecords::getBone, healthBasicsRecords.getBone());
        }
        if (healthBasicsRecords.getMuscle() != null) {
            queryWrapper.eq(HealthBasicsRecords::getMuscle, healthBasicsRecords.getMuscle());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getBmiResult())) {
            queryWrapper.eq(HealthBasicsRecords::getBmiResult, healthBasicsRecords.getBmiResult());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getBt())) {
            queryWrapper.eq(HealthBasicsRecords::getBt, healthBasicsRecords.getBt());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getAnalysisResult())) {
            queryWrapper.eq(HealthBasicsRecords::getAnalysisResult, healthBasicsRecords.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getOpinion())) {
            queryWrapper.eq(HealthBasicsRecords::getOpinion, healthBasicsRecords.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getWarnFlag())) {
            queryWrapper.eq(HealthBasicsRecords::getWarnFlag, healthBasicsRecords.getWarnFlag());
        }
        if (healthBasicsRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthBasicsRecords::getAreaCode, healthBasicsRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getAreaName())) {
            queryWrapper.eq(HealthBasicsRecords::getAreaName, healthBasicsRecords.getAreaName());
        }
        if (healthBasicsRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthBasicsRecords::getCreateUser, healthBasicsRecords.getCreateUser());
        }
        if (healthBasicsRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthBasicsRecords::getCreateDept, healthBasicsRecords.getCreateDept());
        }
        if (healthBasicsRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthBasicsRecords::getCreateTime, healthBasicsRecords.getCreateTime());
        }
        if (healthBasicsRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthBasicsRecords::getUpdateUser, healthBasicsRecords.getUpdateUser());
        }
        if (healthBasicsRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthBasicsRecords::getUpdateTime, healthBasicsRecords.getUpdateTime());
        }
        if (healthBasicsRecords.getStatus() != null) {
            queryWrapper.eq(HealthBasicsRecords::getStatus, healthBasicsRecords.getStatus());
        }
        if (healthBasicsRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthBasicsRecords::getIsDeleted, healthBasicsRecords.getIsDeleted());
        }
        if (StringUtil.isNotEmpty(healthBasicsRecords.getDataSource())) {
            queryWrapper.eq(HealthBasicsRecords::getDataSource, healthBasicsRecords.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthBasicsRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBasicsRecords insert(HealthBasicsRecords healthBasicsRecords) {
        healthBasicsRecords.setId(null);
        getBaseMapper().insert(healthBasicsRecords);
        return healthBasicsRecords;
    }

    /**
    * 更新数据
    *
    * @param healthBasicsRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBasicsRecords update(HealthBasicsRecords healthBasicsRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthBasicsRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthBasicsRecords>(getBaseMapper());
        if (healthBasicsRecords.getId() != null) {
            chainWrapper.set(HealthBasicsRecords::getId, healthBasicsRecords.getId());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getTenantId())) {
            chainWrapper.set(HealthBasicsRecords::getTenantId, healthBasicsRecords.getTenantId());
        }
        if (healthBasicsRecords.getCorpId() != null) {
            chainWrapper.set(HealthBasicsRecords::getCorpId, healthBasicsRecords.getCorpId());
        }
        if (healthBasicsRecords.getInstitutionId() != null) {
            chainWrapper.set(HealthBasicsRecords::getInstitutionId, healthBasicsRecords.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getInstitutionName())) {
            chainWrapper.set(HealthBasicsRecords::getInstitutionName, healthBasicsRecords.getInstitutionName());
        }
        if (healthBasicsRecords.getElderId() != null) {
            chainWrapper.set(HealthBasicsRecords::getElderId, healthBasicsRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getElderName())) {
            chainWrapper.set(HealthBasicsRecords::getElderName, healthBasicsRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getIdCard())) {
            chainWrapper.set(HealthBasicsRecords::getIdCard, healthBasicsRecords.getIdCard());
        }
        if (healthBasicsRecords.getAge() != null) {
            chainWrapper.set(HealthBasicsRecords::getAge, healthBasicsRecords.getAge());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getSex())) {
            chainWrapper.set(HealthBasicsRecords::getSex, healthBasicsRecords.getSex());
        }
        if (healthBasicsRecords.getGaugeTime() != null) {
            chainWrapper.set(HealthBasicsRecords::getGaugeTime, healthBasicsRecords.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getGaugeType())) {
            chainWrapper.set(HealthBasicsRecords::getGaugeType, healthBasicsRecords.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getConditions())) {
            chainWrapper.set(HealthBasicsRecords::getConditions, healthBasicsRecords.getConditions());
        }
        if (healthBasicsRecords.getWaist() != null) {
            chainWrapper.set(HealthBasicsRecords::getWaist, healthBasicsRecords.getWaist());
        }
        if (healthBasicsRecords.getHeight() != null) {
            chainWrapper.set(HealthBasicsRecords::getHeight, healthBasicsRecords.getHeight());
        }
        if (healthBasicsRecords.getWeight() != null) {
            chainWrapper.set(HealthBasicsRecords::getWeight, healthBasicsRecords.getWeight());
        }
        if (healthBasicsRecords.getFatContent() != null) {
            chainWrapper.set(HealthBasicsRecords::getFatContent, healthBasicsRecords.getFatContent());
        }
        if (healthBasicsRecords.getBmi() != null) {
            chainWrapper.set(HealthBasicsRecords::getBmi, healthBasicsRecords.getBmi());
        }
        if (healthBasicsRecords.getBmr() != null) {
            chainWrapper.set(HealthBasicsRecords::getBmr, healthBasicsRecords.getBmr());
        }
        if (healthBasicsRecords.getPbf() != null) {
            chainWrapper.set(HealthBasicsRecords::getPbf, healthBasicsRecords.getPbf());
        }
        if (healthBasicsRecords.getWater() != null) {
            chainWrapper.set(HealthBasicsRecords::getWater, healthBasicsRecords.getWater());
        }
        if (healthBasicsRecords.getBone() != null) {
            chainWrapper.set(HealthBasicsRecords::getBone, healthBasicsRecords.getBone());
        }
        if (healthBasicsRecords.getMuscle() != null) {
            chainWrapper.set(HealthBasicsRecords::getMuscle, healthBasicsRecords.getMuscle());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getBmiResult())) {
            chainWrapper.set(HealthBasicsRecords::getBmiResult, healthBasicsRecords.getBmiResult());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getBt())) {
            chainWrapper.set(HealthBasicsRecords::getBt, healthBasicsRecords.getBt());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getAnalysisResult())) {
            chainWrapper.set(HealthBasicsRecords::getAnalysisResult, healthBasicsRecords.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getOpinion())) {
            chainWrapper.set(HealthBasicsRecords::getOpinion, healthBasicsRecords.getOpinion());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getWarnFlag())) {
            chainWrapper.set(HealthBasicsRecords::getWarnFlag, healthBasicsRecords.getWarnFlag());
        }
        if (healthBasicsRecords.getAreaCode() != null) {
            chainWrapper.set(HealthBasicsRecords::getAreaCode, healthBasicsRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getAreaName())) {
            chainWrapper.set(HealthBasicsRecords::getAreaName, healthBasicsRecords.getAreaName());
        }
        if (healthBasicsRecords.getCreateUser() != null) {
            chainWrapper.set(HealthBasicsRecords::getCreateUser, healthBasicsRecords.getCreateUser());
        }
        if (healthBasicsRecords.getCreateDept() != null) {
            chainWrapper.set(HealthBasicsRecords::getCreateDept, healthBasicsRecords.getCreateDept());
        }
        if (healthBasicsRecords.getCreateTime() != null) {
            chainWrapper.set(HealthBasicsRecords::getCreateTime, healthBasicsRecords.getCreateTime());
        }
        if (healthBasicsRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthBasicsRecords::getUpdateUser, healthBasicsRecords.getUpdateUser());
        }
        if (healthBasicsRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthBasicsRecords::getUpdateTime, healthBasicsRecords.getUpdateTime());
        }
        if (healthBasicsRecords.getStatus() != null) {
            chainWrapper.set(HealthBasicsRecords::getStatus, healthBasicsRecords.getStatus());
        }
        if (healthBasicsRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthBasicsRecords::getIsDeleted, healthBasicsRecords.getIsDeleted());
        }
        if (StringUtil.isNotBlank(healthBasicsRecords.getDataSource())) {
            chainWrapper.set(HealthBasicsRecords::getDataSource, healthBasicsRecords.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthBasicsRecords::getId, healthBasicsRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthBasicsRecords.getId());
        } else {
            return healthBasicsRecords;
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
    public boolean saveHealthBasicsRecordsBatch(List<HealthBasicsRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthBasicsRecords healthBasicsRecords : insertList) {
            //使用默认的雪花算法生成
            healthBasicsRecords.setId(null);
            //healthBasicsRecords.setCreatedDt(currentDte);
            //healthBasicsRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthBasicsRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthBasicsRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> monitorBmi(HealthBasicsRecords queryParam) {
        //查询基础记录
        List<HealthBasicsRecords> brList = queryList(queryParam);
        if (CollectionUtils.isEmpty(brList)) {
            Map<String, Object> emptyResult = new HashMap<>();
            emptyResult.put("normalList", Collections.emptyList());
            emptyResult.put("abnormalList", Collections.emptyList());
            return emptyResult;
        }

        // 查出BMI的参考范围
        HealthParam bmiParam = healthParamService.getOne(
                new LambdaQueryWrapper<HealthParam>()
                        .eq(HealthParam::getParamCode, "BMI")
        );

        // 比较BMI
        List<HealthBasicsRecords> normalList = new ArrayList<>();
        List<HealthBasicsRecords> abnormalList = new ArrayList<>();
        for (HealthBasicsRecords br : brList) {
            List<String> abnormalFields = new ArrayList<>();

            if (bmiParam != null && br.getBmi() != null) {
                if (bmiParam.getMinValue() != null && br.getBmi() < bmiParam.getMinValue()) {
                    abnormalFields.add("bmi");
                }
                if (bmiParam.getMaxValue() != null && br.getBmi() > bmiParam.getMaxValue()) {
                    if (!abnormalFields.contains("bmi")) {
                        abnormalFields.add("bmi");
                    }
                }
            }

            if (!abnormalFields.isEmpty()) {
                br.setAbnormalFields(abnormalFields);
                abnormalList.add(br);
            } else {
                normalList.add(br);
            }
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("normalList", normalList);
        resultMap.put("abnormalList", abnormalList);
        return resultMap;
    }
}


