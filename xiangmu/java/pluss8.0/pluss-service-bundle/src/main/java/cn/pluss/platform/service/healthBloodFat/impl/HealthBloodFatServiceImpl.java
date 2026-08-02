package cn.pluss.platform.service.healthBloodFat.impl;

import cn.pluss.platform.mapper.HealthBloodFatMapper;
import cn.pluss.platform.model.entity.HealthBloodFat;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.service.healthBloodFat.HealthBloodFatService;
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
@Service("healthBloodFatService")
public class HealthBloodFatServiceImpl extends ServiceImpl< HealthBloodFatMapper, HealthBloodFat> implements HealthBloodFatService {
    private static final Logger logger = LoggerFactory.getLogger(HealthBloodFatServiceImpl.class);

    @Resource
    private HealthParamService healthParamService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthBloodFat> queryPage(Map map) {
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
    public HealthBloodFat queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthBloodFat 实例对象
    * @return 实例对象
    */
    @Override
    public HealthBloodFat queryOne(HealthBloodFat healthBloodFat){
        LambdaQueryWrapper<HealthBloodFat> queryWrapper = getQueryWrapper(healthBloodFat);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthBloodFat
    * @return
    */
    @Override
    public List<HealthBloodFat> queryList(HealthBloodFat healthBloodFat) {
        LambdaQueryWrapper<HealthBloodFat> queryWrapper = getQueryWrapper(healthBloodFat);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthBloodFat
    * @return
    */
    public static LambdaQueryWrapper<HealthBloodFat> getQueryWrapper(HealthBloodFat healthBloodFat){
        LambdaQueryWrapper<HealthBloodFat> queryWrapper = new LambdaQueryWrapper<>();
        if (healthBloodFat.getId() != null) {
            queryWrapper.eq(HealthBloodFat::getId, healthBloodFat.getId());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getTenantId())) {
            queryWrapper.eq(HealthBloodFat::getTenantId, healthBloodFat.getTenantId());
        }
        if (healthBloodFat.getCorpId() != null) {
            queryWrapper.eq(HealthBloodFat::getCorpId, healthBloodFat.getCorpId());
        }
        if (healthBloodFat.getInstitutionId() != null) {
            queryWrapper.eq(HealthBloodFat::getInstitutionId, healthBloodFat.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getInstitutionName())) {
            queryWrapper.eq(HealthBloodFat::getInstitutionName, healthBloodFat.getInstitutionName());
        }
        if (healthBloodFat.getElderId() != null) {
            queryWrapper.eq(HealthBloodFat::getElderId, healthBloodFat.getElderId());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getElderName())) {
            queryWrapper.eq(HealthBloodFat::getElderName, healthBloodFat.getElderName());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getIdCard())) {
            queryWrapper.eq(HealthBloodFat::getIdCard, healthBloodFat.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getSex())) {
            queryWrapper.eq(HealthBloodFat::getSex, healthBloodFat.getSex());
        }
        if (healthBloodFat.getAge() != null) {
            queryWrapper.eq(HealthBloodFat::getAge, healthBloodFat.getAge());
        }
        if (healthBloodFat.getGaugeTime() != null) {
            queryWrapper.eq(HealthBloodFat::getGaugeTime, healthBloodFat.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getGaugeType())) {
            queryWrapper.eq(HealthBloodFat::getGaugeType, healthBloodFat.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getConditions())) {
            queryWrapper.eq(HealthBloodFat::getConditions, healthBloodFat.getConditions());
        }
        if (healthBloodFat.getChol() != null) {
            queryWrapper.eq(HealthBloodFat::getChol, healthBloodFat.getChol());
        }
        if (healthBloodFat.getHdlchol() != null) {
            queryWrapper.eq(HealthBloodFat::getHdlchol, healthBloodFat.getHdlchol());
        }
        if (healthBloodFat.getTrig() != null) {
            queryWrapper.eq(HealthBloodFat::getTrig, healthBloodFat.getTrig());
        }
        if (healthBloodFat.getCalcldl() != null) {
            queryWrapper.eq(HealthBloodFat::getCalcldl, healthBloodFat.getCalcldl());
        }
        if (healthBloodFat.getTcHdl() != null) {
            queryWrapper.eq(HealthBloodFat::getTcHdl, healthBloodFat.getTcHdl());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getAnalysisResult())) {
            queryWrapper.eq(HealthBloodFat::getAnalysisResult, healthBloodFat.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getOpinion())) {
            queryWrapper.eq(HealthBloodFat::getOpinion, healthBloodFat.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getWarnFlag())) {
            queryWrapper.eq(HealthBloodFat::getWarnFlag, healthBloodFat.getWarnFlag());
        }
        if (healthBloodFat.getAreaCode() != null) {
            queryWrapper.eq(HealthBloodFat::getAreaCode, healthBloodFat.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getAreaName())) {
            queryWrapper.eq(HealthBloodFat::getAreaName, healthBloodFat.getAreaName());
        }
        if (healthBloodFat.getCreateUser() != null) {
            queryWrapper.eq(HealthBloodFat::getCreateUser, healthBloodFat.getCreateUser());
        }
        if (healthBloodFat.getCreateDept() != null) {
            queryWrapper.eq(HealthBloodFat::getCreateDept, healthBloodFat.getCreateDept());
        }
        if (healthBloodFat.getCreateTime() != null) {
            queryWrapper.eq(HealthBloodFat::getCreateTime, healthBloodFat.getCreateTime());
        }
        if (healthBloodFat.getUpdateUser() != null) {
            queryWrapper.eq(HealthBloodFat::getUpdateUser, healthBloodFat.getUpdateUser());
        }
        if (healthBloodFat.getUpdateTime() != null) {
            queryWrapper.eq(HealthBloodFat::getUpdateTime, healthBloodFat.getUpdateTime());
        }
        if (healthBloodFat.getIsDeleted() != null) {
            queryWrapper.eq(HealthBloodFat::getIsDeleted, healthBloodFat.getIsDeleted());
        }
        if (healthBloodFat.getStatus() != null) {
            queryWrapper.eq(HealthBloodFat::getStatus, healthBloodFat.getStatus());
        }
        if (StringUtil.isNotEmpty(healthBloodFat.getDataSource())) {
            queryWrapper.eq(HealthBloodFat::getDataSource, healthBloodFat.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthBloodFat 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodFat insert(HealthBloodFat healthBloodFat) {
        healthBloodFat.setId(null);
        getBaseMapper().insert(healthBloodFat);
        return healthBloodFat;
    }

    /**
    * 更新数据
    *
    * @param healthBloodFat 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodFat update(HealthBloodFat healthBloodFat) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthBloodFat> chainWrapper = new LambdaUpdateChainWrapper<HealthBloodFat>(getBaseMapper());
        if (healthBloodFat.getId() != null) {
            chainWrapper.set(HealthBloodFat::getId, healthBloodFat.getId());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getTenantId())) {
            chainWrapper.set(HealthBloodFat::getTenantId, healthBloodFat.getTenantId());
        }
        if (healthBloodFat.getCorpId() != null) {
            chainWrapper.set(HealthBloodFat::getCorpId, healthBloodFat.getCorpId());
        }
        if (healthBloodFat.getInstitutionId() != null) {
            chainWrapper.set(HealthBloodFat::getInstitutionId, healthBloodFat.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getInstitutionName())) {
            chainWrapper.set(HealthBloodFat::getInstitutionName, healthBloodFat.getInstitutionName());
        }
        if (healthBloodFat.getElderId() != null) {
            chainWrapper.set(HealthBloodFat::getElderId, healthBloodFat.getElderId());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getElderName())) {
            chainWrapper.set(HealthBloodFat::getElderName, healthBloodFat.getElderName());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getIdCard())) {
            chainWrapper.set(HealthBloodFat::getIdCard, healthBloodFat.getIdCard());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getSex())) {
            chainWrapper.set(HealthBloodFat::getSex, healthBloodFat.getSex());
        }
        if (healthBloodFat.getAge() != null) {
            chainWrapper.set(HealthBloodFat::getAge, healthBloodFat.getAge());
        }
        if (healthBloodFat.getGaugeTime() != null) {
            chainWrapper.set(HealthBloodFat::getGaugeTime, healthBloodFat.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getGaugeType())) {
            chainWrapper.set(HealthBloodFat::getGaugeType, healthBloodFat.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getConditions())) {
            chainWrapper.set(HealthBloodFat::getConditions, healthBloodFat.getConditions());
        }
        if (healthBloodFat.getChol() != null) {
            chainWrapper.set(HealthBloodFat::getChol, healthBloodFat.getChol());
        }
        if (healthBloodFat.getHdlchol() != null) {
            chainWrapper.set(HealthBloodFat::getHdlchol, healthBloodFat.getHdlchol());
        }
        if (healthBloodFat.getTrig() != null) {
            chainWrapper.set(HealthBloodFat::getTrig, healthBloodFat.getTrig());
        }
        if (healthBloodFat.getCalcldl() != null) {
            chainWrapper.set(HealthBloodFat::getCalcldl, healthBloodFat.getCalcldl());
        }
        if (healthBloodFat.getTcHdl() != null) {
            chainWrapper.set(HealthBloodFat::getTcHdl, healthBloodFat.getTcHdl());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getAnalysisResult())) {
            chainWrapper.set(HealthBloodFat::getAnalysisResult, healthBloodFat.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getOpinion())) {
            chainWrapper.set(HealthBloodFat::getOpinion, healthBloodFat.getOpinion());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getWarnFlag())) {
            chainWrapper.set(HealthBloodFat::getWarnFlag, healthBloodFat.getWarnFlag());
        }
        if (healthBloodFat.getAreaCode() != null) {
            chainWrapper.set(HealthBloodFat::getAreaCode, healthBloodFat.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getAreaName())) {
            chainWrapper.set(HealthBloodFat::getAreaName, healthBloodFat.getAreaName());
        }
        if (healthBloodFat.getCreateUser() != null) {
            chainWrapper.set(HealthBloodFat::getCreateUser, healthBloodFat.getCreateUser());
        }
        if (healthBloodFat.getCreateDept() != null) {
            chainWrapper.set(HealthBloodFat::getCreateDept, healthBloodFat.getCreateDept());
        }
        if (healthBloodFat.getCreateTime() != null) {
            chainWrapper.set(HealthBloodFat::getCreateTime, healthBloodFat.getCreateTime());
        }
        if (healthBloodFat.getUpdateUser() != null) {
            chainWrapper.set(HealthBloodFat::getUpdateUser, healthBloodFat.getUpdateUser());
        }
        if (healthBloodFat.getUpdateTime() != null) {
            chainWrapper.set(HealthBloodFat::getUpdateTime, healthBloodFat.getUpdateTime());
        }
        if (healthBloodFat.getIsDeleted() != null) {
            chainWrapper.set(HealthBloodFat::getIsDeleted, healthBloodFat.getIsDeleted());
        }
        if (healthBloodFat.getStatus() != null) {
            chainWrapper.set(HealthBloodFat::getStatus, healthBloodFat.getStatus());
        }
        if (StringUtil.isNotBlank(healthBloodFat.getDataSource())) {
            chainWrapper.set(HealthBloodFat::getDataSource, healthBloodFat.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthBloodFat::getId, healthBloodFat.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthBloodFat.getId());
        } else {
            return healthBloodFat;
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
    public boolean saveHealthBloodFatBatch(List<HealthBloodFat> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthBloodFat healthBloodFat : insertList) {
            //使用默认的雪花算法生成
            healthBloodFat.setId(null);
            //healthBloodFat.setCreatedDt(currentDte);
            //healthBloodFat.setUpdatedDt(currentDte);
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
    public Integer deleteHealthBloodFatBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthBloodFat> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> monitorCholesterol(HealthBloodFat queryParam) {
        //查询血脂记录
        List<HealthBloodFat> bfList = queryList(queryParam);
        if (CollectionUtils.isEmpty(bfList)) {
            Map<String, Object> emptyResult = new HashMap<>();
            emptyResult.put("normalList", Collections.emptyList());
            emptyResult.put("abnormalList", Collections.emptyList());
            return emptyResult;
        }

        // 查出胆固醇(DGC)的参考范围
        HealthParam dgcParam = healthParamService.getOne(
                new LambdaQueryWrapper<HealthParam>()
                        .eq(HealthParam::getParamCode, "DGC")
        );

        //比较胆固醇
        List<HealthBloodFat> normalList = new ArrayList<>();
        List<HealthBloodFat> abnormalList = new ArrayList<>();
        for (HealthBloodFat bf : bfList) {
            List<String> abnormalFields = new ArrayList<>();

            if (dgcParam != null && bf.getChol() != null) {
                if (dgcParam.getMinValue() != null && bf.getChol() < dgcParam.getMinValue()) {
                    abnormalFields.add("chol");
                }
                if (dgcParam.getMaxValue() != null && bf.getChol() > dgcParam.getMaxValue()) {
                    if (!abnormalFields.contains("chol")) {
                        abnormalFields.add("chol");
                    }
                }
            }

            if (!abnormalFields.isEmpty()) {
                bf.setAbnormalFields(abnormalFields);
                abnormalList.add(bf);
            } else {
                normalList.add(bf);
            }
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("normalList", normalList);
        resultMap.put("abnormalList", abnormalList);
        return resultMap;
    }
}


