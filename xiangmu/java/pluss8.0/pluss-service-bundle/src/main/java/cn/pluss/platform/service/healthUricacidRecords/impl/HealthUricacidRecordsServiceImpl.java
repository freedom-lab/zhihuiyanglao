package cn.pluss.platform.service.healthUricacidRecords.impl;

import cn.pluss.platform.mapper.HealthUricacidRecordsMapper;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.model.entity.HealthUricacidRecords;
import cn.pluss.platform.service.healthUricacidRecords.HealthUricacidRecordsService;
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
@Service("healthUricacidRecordsService")
public class HealthUricacidRecordsServiceImpl extends ServiceImpl< HealthUricacidRecordsMapper, HealthUricacidRecords> implements HealthUricacidRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthUricacidRecordsServiceImpl.class);

    @Resource
    private HealthParamService healthParamService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthUricacidRecords> queryPage(Map map) {
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
    public HealthUricacidRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthUricacidRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthUricacidRecords queryOne(HealthUricacidRecords healthUricacidRecords){
        LambdaQueryWrapper<HealthUricacidRecords> queryWrapper = getQueryWrapper(healthUricacidRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthUricacidRecords
    * @return
    */
    @Override
    public List<HealthUricacidRecords> queryList(HealthUricacidRecords healthUricacidRecords) {
        LambdaQueryWrapper<HealthUricacidRecords> queryWrapper = getQueryWrapper(healthUricacidRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthUricacidRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthUricacidRecords> getQueryWrapper(HealthUricacidRecords healthUricacidRecords){
        LambdaQueryWrapper<HealthUricacidRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthUricacidRecords.getId() != null) {
            queryWrapper.eq(HealthUricacidRecords::getId, healthUricacidRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getTenantId())) {
            queryWrapper.eq(HealthUricacidRecords::getTenantId, healthUricacidRecords.getTenantId());
        }
        if (healthUricacidRecords.getCorpId() != null) {
            queryWrapper.eq(HealthUricacidRecords::getCorpId, healthUricacidRecords.getCorpId());
        }
        if (healthUricacidRecords.getInstitutionId() != null) {
            queryWrapper.eq(HealthUricacidRecords::getInstitutionId, healthUricacidRecords.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getInstitutionName())) {
            queryWrapper.eq(HealthUricacidRecords::getInstitutionName, healthUricacidRecords.getInstitutionName());
        }
        if (healthUricacidRecords.getElderId() != null) {
            queryWrapper.eq(HealthUricacidRecords::getElderId, healthUricacidRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getElderName())) {
            queryWrapper.eq(HealthUricacidRecords::getElderName, healthUricacidRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getIdCard())) {
            queryWrapper.eq(HealthUricacidRecords::getIdCard, healthUricacidRecords.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getSex())) {
            queryWrapper.eq(HealthUricacidRecords::getSex, healthUricacidRecords.getSex());
        }
        if (healthUricacidRecords.getAge() != null) {
            queryWrapper.eq(HealthUricacidRecords::getAge, healthUricacidRecords.getAge());
        }
        if (healthUricacidRecords.getGaugeTime() != null) {
            queryWrapper.eq(HealthUricacidRecords::getGaugeTime, healthUricacidRecords.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getGaugeType())) {
            queryWrapper.eq(HealthUricacidRecords::getGaugeType, healthUricacidRecords.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getConditions())) {
            queryWrapper.eq(HealthUricacidRecords::getConditions, healthUricacidRecords.getConditions());
        }
        if (healthUricacidRecords.getUricAcid() != null) {
            queryWrapper.eq(HealthUricacidRecords::getUricAcid, healthUricacidRecords.getUricAcid());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getAnalysisResult())) {
            queryWrapper.eq(HealthUricacidRecords::getAnalysisResult, healthUricacidRecords.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getOpinion())) {
            queryWrapper.eq(HealthUricacidRecords::getOpinion, healthUricacidRecords.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getWarnFlag())) {
            queryWrapper.eq(HealthUricacidRecords::getWarnFlag, healthUricacidRecords.getWarnFlag());
        }
        if (healthUricacidRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthUricacidRecords::getAreaCode, healthUricacidRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getAreaName())) {
            queryWrapper.eq(HealthUricacidRecords::getAreaName, healthUricacidRecords.getAreaName());
        }
        if (healthUricacidRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthUricacidRecords::getCreateUser, healthUricacidRecords.getCreateUser());
        }
        if (healthUricacidRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthUricacidRecords::getCreateDept, healthUricacidRecords.getCreateDept());
        }
        if (healthUricacidRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthUricacidRecords::getCreateTime, healthUricacidRecords.getCreateTime());
        }
        if (healthUricacidRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthUricacidRecords::getUpdateUser, healthUricacidRecords.getUpdateUser());
        }
        if (healthUricacidRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthUricacidRecords::getUpdateTime, healthUricacidRecords.getUpdateTime());
        }
        if (healthUricacidRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthUricacidRecords::getIsDeleted, healthUricacidRecords.getIsDeleted());
        }
        if (healthUricacidRecords.getStatus() != null) {
            queryWrapper.eq(HealthUricacidRecords::getStatus, healthUricacidRecords.getStatus());
        }
        if (StringUtil.isNotEmpty(healthUricacidRecords.getDataSource())) {
            queryWrapper.eq(HealthUricacidRecords::getDataSource, healthUricacidRecords.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthUricacidRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthUricacidRecords insert(HealthUricacidRecords healthUricacidRecords) {
        healthUricacidRecords.setId(null);
        getBaseMapper().insert(healthUricacidRecords);
        return healthUricacidRecords;
    }

    /**
    * 更新数据
    *
    * @param healthUricacidRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthUricacidRecords update(HealthUricacidRecords healthUricacidRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthUricacidRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthUricacidRecords>(getBaseMapper());
        if (healthUricacidRecords.getId() != null) {
            chainWrapper.set(HealthUricacidRecords::getId, healthUricacidRecords.getId());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getTenantId())) {
            chainWrapper.set(HealthUricacidRecords::getTenantId, healthUricacidRecords.getTenantId());
        }
        if (healthUricacidRecords.getCorpId() != null) {
            chainWrapper.set(HealthUricacidRecords::getCorpId, healthUricacidRecords.getCorpId());
        }
        if (healthUricacidRecords.getInstitutionId() != null) {
            chainWrapper.set(HealthUricacidRecords::getInstitutionId, healthUricacidRecords.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getInstitutionName())) {
            chainWrapper.set(HealthUricacidRecords::getInstitutionName, healthUricacidRecords.getInstitutionName());
        }
        if (healthUricacidRecords.getElderId() != null) {
            chainWrapper.set(HealthUricacidRecords::getElderId, healthUricacidRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getElderName())) {
            chainWrapper.set(HealthUricacidRecords::getElderName, healthUricacidRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getIdCard())) {
            chainWrapper.set(HealthUricacidRecords::getIdCard, healthUricacidRecords.getIdCard());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getSex())) {
            chainWrapper.set(HealthUricacidRecords::getSex, healthUricacidRecords.getSex());
        }
        if (healthUricacidRecords.getAge() != null) {
            chainWrapper.set(HealthUricacidRecords::getAge, healthUricacidRecords.getAge());
        }
        if (healthUricacidRecords.getGaugeTime() != null) {
            chainWrapper.set(HealthUricacidRecords::getGaugeTime, healthUricacidRecords.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getGaugeType())) {
            chainWrapper.set(HealthUricacidRecords::getGaugeType, healthUricacidRecords.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getConditions())) {
            chainWrapper.set(HealthUricacidRecords::getConditions, healthUricacidRecords.getConditions());
        }
        if (healthUricacidRecords.getUricAcid() != null) {
            chainWrapper.set(HealthUricacidRecords::getUricAcid, healthUricacidRecords.getUricAcid());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getAnalysisResult())) {
            chainWrapper.set(HealthUricacidRecords::getAnalysisResult, healthUricacidRecords.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getOpinion())) {
            chainWrapper.set(HealthUricacidRecords::getOpinion, healthUricacidRecords.getOpinion());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getWarnFlag())) {
            chainWrapper.set(HealthUricacidRecords::getWarnFlag, healthUricacidRecords.getWarnFlag());
        }
        if (healthUricacidRecords.getAreaCode() != null) {
            chainWrapper.set(HealthUricacidRecords::getAreaCode, healthUricacidRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getAreaName())) {
            chainWrapper.set(HealthUricacidRecords::getAreaName, healthUricacidRecords.getAreaName());
        }
        if (healthUricacidRecords.getCreateUser() != null) {
            chainWrapper.set(HealthUricacidRecords::getCreateUser, healthUricacidRecords.getCreateUser());
        }
        if (healthUricacidRecords.getCreateDept() != null) {
            chainWrapper.set(HealthUricacidRecords::getCreateDept, healthUricacidRecords.getCreateDept());
        }
        if (healthUricacidRecords.getCreateTime() != null) {
            chainWrapper.set(HealthUricacidRecords::getCreateTime, healthUricacidRecords.getCreateTime());
        }
        if (healthUricacidRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthUricacidRecords::getUpdateUser, healthUricacidRecords.getUpdateUser());
        }
        if (healthUricacidRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthUricacidRecords::getUpdateTime, healthUricacidRecords.getUpdateTime());
        }
        if (healthUricacidRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthUricacidRecords::getIsDeleted, healthUricacidRecords.getIsDeleted());
        }
        if (healthUricacidRecords.getStatus() != null) {
            chainWrapper.set(HealthUricacidRecords::getStatus, healthUricacidRecords.getStatus());
        }
        if (StringUtil.isNotBlank(healthUricacidRecords.getDataSource())) {
            chainWrapper.set(HealthUricacidRecords::getDataSource, healthUricacidRecords.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthUricacidRecords::getId, healthUricacidRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthUricacidRecords.getId());
        } else {
            return healthUricacidRecords;
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
    public boolean saveHealthUricacidRecordsBatch(List<HealthUricacidRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthUricacidRecords healthUricacidRecords : insertList) {
            //使用默认的雪花算法生成
            healthUricacidRecords.setId(null);
            //healthUricacidRecords.setCreatedDt(currentDte);
            //healthUricacidRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthUricacidRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthUricacidRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> monitorUricAcid(HealthUricacidRecords queryParam) {
        //查询尿酸记录
        List<HealthUricacidRecords> uaList = queryList(queryParam);
        if (CollectionUtils.isEmpty(uaList)) {
            Map<String, Object> emptyResult = new HashMap<>();
            emptyResult.put("normalList", Collections.emptyList());
            emptyResult.put("abnormalList", Collections.emptyList());
            return emptyResult;
        }

        //查出尿酸(NS_UMOL)的参考范围
        HealthParam nsUmolParam = healthParamService.getOne(
                new LambdaQueryWrapper<HealthParam>()
                        .eq(HealthParam::getParamCode, "NS_UMOL")
        );

        //比较尿酸
        List<HealthUricacidRecords> normalList = new ArrayList<>();
        List<HealthUricacidRecords> abnormalList = new ArrayList<>();
        for (HealthUricacidRecords ua : uaList) {
            List<String> abnormalFields = new ArrayList<>();

            if (nsUmolParam != null && ua.getUricAcid() != null) {
                if (nsUmolParam.getMinValue() != null && ua.getUricAcid() < nsUmolParam.getMinValue()) {
                    abnormalFields.add("uricAcid");
                }
                if (nsUmolParam.getMaxValue() != null && ua.getUricAcid() > nsUmolParam.getMaxValue()) {
                    if (!abnormalFields.contains("uricAcid")) {
                        abnormalFields.add("uricAcid");
                    }
                }
            }

            if (!abnormalFields.isEmpty()) {
                ua.setAbnormalFields(abnormalFields);
                abnormalList.add(ua);
            } else {
                normalList.add(ua);
            }
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("normalList", normalList);
        resultMap.put("abnormalList", abnormalList);
        return resultMap;
    }
}


