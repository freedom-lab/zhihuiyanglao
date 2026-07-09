package cn.pluss.platform.service.healthUrinalysisRecords.impl;

import cn.pluss.platform.mapper.HealthUrinalysisRecordsMapper;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.model.entity.HealthUrinalysisRecords;
import cn.pluss.platform.service.healthUrinalysisRecords.HealthUrinalysisRecordsService;
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
@Service("healthUrinalysisRecordsService")
public class HealthUrinalysisRecordsServiceImpl extends ServiceImpl< HealthUrinalysisRecordsMapper, HealthUrinalysisRecords> implements HealthUrinalysisRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthUrinalysisRecordsServiceImpl.class);

    @Resource
    private HealthParamService healthParamService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthUrinalysisRecords> queryPage(Map map) {
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
    public HealthUrinalysisRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthUrinalysisRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthUrinalysisRecords queryOne(HealthUrinalysisRecords healthUrinalysisRecords){
        LambdaQueryWrapper<HealthUrinalysisRecords> queryWrapper = getQueryWrapper(healthUrinalysisRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthUrinalysisRecords
    * @return
    */
    @Override
    public List<HealthUrinalysisRecords> queryList(HealthUrinalysisRecords healthUrinalysisRecords) {
        LambdaQueryWrapper<HealthUrinalysisRecords> queryWrapper = getQueryWrapper(healthUrinalysisRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthUrinalysisRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthUrinalysisRecords> getQueryWrapper(HealthUrinalysisRecords healthUrinalysisRecords){
        LambdaQueryWrapper<HealthUrinalysisRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthUrinalysisRecords.getId() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getId, healthUrinalysisRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getTenantId())) {
            queryWrapper.eq(HealthUrinalysisRecords::getTenantId, healthUrinalysisRecords.getTenantId());
        }
        if (healthUrinalysisRecords.getCorpId() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getCorpId, healthUrinalysisRecords.getCorpId());
        }
        if (healthUrinalysisRecords.getInstitutionId() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getInstitutionId, healthUrinalysisRecords.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getInstitutionName())) {
            queryWrapper.eq(HealthUrinalysisRecords::getInstitutionName, healthUrinalysisRecords.getInstitutionName());
        }
        if (healthUrinalysisRecords.getElderId() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getElderId, healthUrinalysisRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getElderName())) {
            queryWrapper.eq(HealthUrinalysisRecords::getElderName, healthUrinalysisRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getIdCard())) {
            queryWrapper.eq(HealthUrinalysisRecords::getIdCard, healthUrinalysisRecords.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getSex())) {
            queryWrapper.eq(HealthUrinalysisRecords::getSex, healthUrinalysisRecords.getSex());
        }
        if (healthUrinalysisRecords.getAge() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getAge, healthUrinalysisRecords.getAge());
        }
        if (healthUrinalysisRecords.getGaugeTime() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getGaugeTime, healthUrinalysisRecords.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getGaugeType())) {
            queryWrapper.eq(HealthUrinalysisRecords::getGaugeType, healthUrinalysisRecords.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getConditions())) {
            queryWrapper.eq(HealthUrinalysisRecords::getConditions, healthUrinalysisRecords.getConditions());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getLeu())) {
            queryWrapper.eq(HealthUrinalysisRecords::getLeu, healthUrinalysisRecords.getLeu());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getNit())) {
            queryWrapper.eq(HealthUrinalysisRecords::getNit, healthUrinalysisRecords.getNit());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getUbg())) {
            queryWrapper.eq(HealthUrinalysisRecords::getUbg, healthUrinalysisRecords.getUbg());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getPro())) {
            queryWrapper.eq(HealthUrinalysisRecords::getPro, healthUrinalysisRecords.getPro());
        }
        if (healthUrinalysisRecords.getPh() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getPh, healthUrinalysisRecords.getPh());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getBld())) {
            queryWrapper.eq(HealthUrinalysisRecords::getBld, healthUrinalysisRecords.getBld());
        }
        if (healthUrinalysisRecords.getSg() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getSg, healthUrinalysisRecords.getSg());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getKet())) {
            queryWrapper.eq(HealthUrinalysisRecords::getKet, healthUrinalysisRecords.getKet());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getBil())) {
            queryWrapper.eq(HealthUrinalysisRecords::getBil, healthUrinalysisRecords.getBil());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getGlu())) {
            queryWrapper.eq(HealthUrinalysisRecords::getGlu, healthUrinalysisRecords.getGlu());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getVc())) {
            queryWrapper.eq(HealthUrinalysisRecords::getVc, healthUrinalysisRecords.getVc());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getAnalysisResult())) {
            queryWrapper.eq(HealthUrinalysisRecords::getAnalysisResult, healthUrinalysisRecords.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getOpinion())) {
            queryWrapper.eq(HealthUrinalysisRecords::getOpinion, healthUrinalysisRecords.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getWarnFlag())) {
            queryWrapper.eq(HealthUrinalysisRecords::getWarnFlag, healthUrinalysisRecords.getWarnFlag());
        }
        if (healthUrinalysisRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getAreaCode, healthUrinalysisRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getAreaName())) {
            queryWrapper.eq(HealthUrinalysisRecords::getAreaName, healthUrinalysisRecords.getAreaName());
        }
        if (healthUrinalysisRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getCreateUser, healthUrinalysisRecords.getCreateUser());
        }
        if (healthUrinalysisRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getCreateDept, healthUrinalysisRecords.getCreateDept());
        }
        if (healthUrinalysisRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getCreateTime, healthUrinalysisRecords.getCreateTime());
        }
        if (healthUrinalysisRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getUpdateUser, healthUrinalysisRecords.getUpdateUser());
        }
        if (healthUrinalysisRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getUpdateTime, healthUrinalysisRecords.getUpdateTime());
        }
        if (healthUrinalysisRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getIsDeleted, healthUrinalysisRecords.getIsDeleted());
        }
        if (healthUrinalysisRecords.getStatus() != null) {
            queryWrapper.eq(HealthUrinalysisRecords::getStatus, healthUrinalysisRecords.getStatus());
        }
        if (StringUtil.isNotEmpty(healthUrinalysisRecords.getDataSource())) {
            queryWrapper.eq(HealthUrinalysisRecords::getDataSource, healthUrinalysisRecords.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthUrinalysisRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthUrinalysisRecords insert(HealthUrinalysisRecords healthUrinalysisRecords) {
        healthUrinalysisRecords.setId(null);
        getBaseMapper().insert(healthUrinalysisRecords);
        return healthUrinalysisRecords;
    }

    /**
    * 更新数据
    *
    * @param healthUrinalysisRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthUrinalysisRecords update(HealthUrinalysisRecords healthUrinalysisRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthUrinalysisRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthUrinalysisRecords>(getBaseMapper());
        if (healthUrinalysisRecords.getId() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getId, healthUrinalysisRecords.getId());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getTenantId())) {
            chainWrapper.set(HealthUrinalysisRecords::getTenantId, healthUrinalysisRecords.getTenantId());
        }
        if (healthUrinalysisRecords.getCorpId() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getCorpId, healthUrinalysisRecords.getCorpId());
        }
        if (healthUrinalysisRecords.getInstitutionId() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getInstitutionId, healthUrinalysisRecords.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getInstitutionName())) {
            chainWrapper.set(HealthUrinalysisRecords::getInstitutionName, healthUrinalysisRecords.getInstitutionName());
        }
        if (healthUrinalysisRecords.getElderId() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getElderId, healthUrinalysisRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getElderName())) {
            chainWrapper.set(HealthUrinalysisRecords::getElderName, healthUrinalysisRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getIdCard())) {
            chainWrapper.set(HealthUrinalysisRecords::getIdCard, healthUrinalysisRecords.getIdCard());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getSex())) {
            chainWrapper.set(HealthUrinalysisRecords::getSex, healthUrinalysisRecords.getSex());
        }
        if (healthUrinalysisRecords.getAge() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getAge, healthUrinalysisRecords.getAge());
        }
        if (healthUrinalysisRecords.getGaugeTime() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getGaugeTime, healthUrinalysisRecords.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getGaugeType())) {
            chainWrapper.set(HealthUrinalysisRecords::getGaugeType, healthUrinalysisRecords.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getConditions())) {
            chainWrapper.set(HealthUrinalysisRecords::getConditions, healthUrinalysisRecords.getConditions());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getLeu())) {
            chainWrapper.set(HealthUrinalysisRecords::getLeu, healthUrinalysisRecords.getLeu());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getNit())) {
            chainWrapper.set(HealthUrinalysisRecords::getNit, healthUrinalysisRecords.getNit());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getUbg())) {
            chainWrapper.set(HealthUrinalysisRecords::getUbg, healthUrinalysisRecords.getUbg());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getPro())) {
            chainWrapper.set(HealthUrinalysisRecords::getPro, healthUrinalysisRecords.getPro());
        }
        if (healthUrinalysisRecords.getPh() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getPh, healthUrinalysisRecords.getPh());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getBld())) {
            chainWrapper.set(HealthUrinalysisRecords::getBld, healthUrinalysisRecords.getBld());
        }
        if (healthUrinalysisRecords.getSg() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getSg, healthUrinalysisRecords.getSg());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getKet())) {
            chainWrapper.set(HealthUrinalysisRecords::getKet, healthUrinalysisRecords.getKet());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getBil())) {
            chainWrapper.set(HealthUrinalysisRecords::getBil, healthUrinalysisRecords.getBil());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getGlu())) {
            chainWrapper.set(HealthUrinalysisRecords::getGlu, healthUrinalysisRecords.getGlu());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getVc())) {
            chainWrapper.set(HealthUrinalysisRecords::getVc, healthUrinalysisRecords.getVc());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getAnalysisResult())) {
            chainWrapper.set(HealthUrinalysisRecords::getAnalysisResult, healthUrinalysisRecords.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getOpinion())) {
            chainWrapper.set(HealthUrinalysisRecords::getOpinion, healthUrinalysisRecords.getOpinion());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getWarnFlag())) {
            chainWrapper.set(HealthUrinalysisRecords::getWarnFlag, healthUrinalysisRecords.getWarnFlag());
        }
        if (healthUrinalysisRecords.getAreaCode() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getAreaCode, healthUrinalysisRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getAreaName())) {
            chainWrapper.set(HealthUrinalysisRecords::getAreaName, healthUrinalysisRecords.getAreaName());
        }
        if (healthUrinalysisRecords.getCreateUser() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getCreateUser, healthUrinalysisRecords.getCreateUser());
        }
        if (healthUrinalysisRecords.getCreateDept() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getCreateDept, healthUrinalysisRecords.getCreateDept());
        }
        if (healthUrinalysisRecords.getCreateTime() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getCreateTime, healthUrinalysisRecords.getCreateTime());
        }
        if (healthUrinalysisRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getUpdateUser, healthUrinalysisRecords.getUpdateUser());
        }
        if (healthUrinalysisRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getUpdateTime, healthUrinalysisRecords.getUpdateTime());
        }
        if (healthUrinalysisRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getIsDeleted, healthUrinalysisRecords.getIsDeleted());
        }
        if (healthUrinalysisRecords.getStatus() != null) {
            chainWrapper.set(HealthUrinalysisRecords::getStatus, healthUrinalysisRecords.getStatus());
        }
        if (StringUtil.isNotBlank(healthUrinalysisRecords.getDataSource())) {
            chainWrapper.set(HealthUrinalysisRecords::getDataSource, healthUrinalysisRecords.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthUrinalysisRecords::getId, healthUrinalysisRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthUrinalysisRecords.getId());
        } else {
            return healthUrinalysisRecords;
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
    public boolean saveHealthUrinalysisRecordsBatch(List<HealthUrinalysisRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthUrinalysisRecords healthUrinalysisRecords : insertList) {
            //使用默认的雪花算法生成
            healthUrinalysisRecords.setId(null);
            //healthUrinalysisRecords.setCreatedDt(currentDte);
            //healthUrinalysisRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthUrinalysisRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthUrinalysisRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> monitorUrinalysis(HealthUrinalysisRecords queryParam) {
        //查询尿常规记录
        List<HealthUrinalysisRecords> urList = queryList(queryParam);
        if (CollectionUtils.isEmpty(urList)) {
            Map<String, Object> emptyResult = new HashMap<>();
            emptyResult.put("normalList", Collections.emptyList());
            emptyResult.put("abnormalList", Collections.emptyList());
            return emptyResult;
        }

        //查出 NCG_PH 和 NCG_SG 的参考范围
        List<String> paramCodes = Arrays.asList("NCG_PH", "NCG_SG");
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
        HealthParam phParam = paramMap.get("NCG_PH");
        HealthParam sgParam = paramMap.get("NCG_SG");

        //比较 ph 和 sg
        List<HealthUrinalysisRecords> normalList = new ArrayList<>();
        List<HealthUrinalysisRecords> abnormalList = new ArrayList<>();
        for (HealthUrinalysisRecords ur : urList) {
            List<String> abnormalFields = new ArrayList<>();

            // 酸碱度 ph
            if (phParam != null && ur.getPh() != null) {
                if (phParam.getMinValue() != null && ur.getPh() < phParam.getMinValue()) {
                    abnormalFields.add("ph");
                }
                if (phParam.getMaxValue() != null && ur.getPh() > phParam.getMaxValue()) {
                    if (!abnormalFields.contains("ph")) {
                        abnormalFields.add("ph");
                    }
                }
            }
            // 比重 sg
            if (sgParam != null && ur.getSg() != null) {
                if (sgParam.getMinValue() != null && ur.getSg() < sgParam.getMinValue()) {
                    abnormalFields.add("sg");
                }
                if (sgParam.getMaxValue() != null && ur.getSg() > sgParam.getMaxValue()) {
                    if (!abnormalFields.contains("sg")) {
                        abnormalFields.add("sg");
                    }
                }
            }

            if (!abnormalFields.isEmpty()) {
                ur.setAbnormalFields(abnormalFields);
                abnormalList.add(ur);
            } else {
                normalList.add(ur);
            }
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("normalList", normalList);
        resultMap.put("abnormalList", abnormalList);
        return resultMap;
    }
}


