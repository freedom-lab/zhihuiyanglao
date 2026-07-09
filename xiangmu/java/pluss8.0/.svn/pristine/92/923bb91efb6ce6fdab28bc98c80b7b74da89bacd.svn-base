package cn.pluss.platform.service.healthTongueDiagnosisReport.impl;

import cn.pluss.platform.mapper.HealthTongueDiagnosisReportMapper;
import cn.pluss.platform.model.entity.HealthTongueDiagnosisReport;
import cn.pluss.platform.service.healthTongueDiagnosisReport.HealthTongueDiagnosisReportService;
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
@Service("healthTongueDiagnosisReportService")
public class HealthTongueDiagnosisReportServiceImpl extends ServiceImpl< HealthTongueDiagnosisReportMapper, HealthTongueDiagnosisReport> implements HealthTongueDiagnosisReportService {
    private static final Logger logger = LoggerFactory.getLogger(HealthTongueDiagnosisReportServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthTongueDiagnosisReport> queryPage(Map map) {
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
    public HealthTongueDiagnosisReport queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthTongueDiagnosisReport 实例对象
    * @return 实例对象
    */
    @Override
    public HealthTongueDiagnosisReport queryOne(HealthTongueDiagnosisReport healthTongueDiagnosisReport){
        LambdaQueryWrapper<HealthTongueDiagnosisReport> queryWrapper = getQueryWrapper(healthTongueDiagnosisReport);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthTongueDiagnosisReport
    * @return
    */
    @Override
    public List<HealthTongueDiagnosisReport> queryList(HealthTongueDiagnosisReport healthTongueDiagnosisReport) {
        LambdaQueryWrapper<HealthTongueDiagnosisReport> queryWrapper = getQueryWrapper(healthTongueDiagnosisReport);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthTongueDiagnosisReport
    * @return
    */
    public static LambdaQueryWrapper<HealthTongueDiagnosisReport> getQueryWrapper(HealthTongueDiagnosisReport healthTongueDiagnosisReport){
        LambdaQueryWrapper<HealthTongueDiagnosisReport> queryWrapper = new LambdaQueryWrapper<>();
        if (healthTongueDiagnosisReport.getId() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getId, healthTongueDiagnosisReport.getId());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getTenantId())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getTenantId, healthTongueDiagnosisReport.getTenantId());
        }
        if (healthTongueDiagnosisReport.getCorpId() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getCorpId, healthTongueDiagnosisReport.getCorpId());
        }
        if (healthTongueDiagnosisReport.getInstitutionId() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getInstitutionId, healthTongueDiagnosisReport.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getInstitutionName())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getInstitutionName, healthTongueDiagnosisReport.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getDeviceCode())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getDeviceCode, healthTongueDiagnosisReport.getDeviceCode());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getDeviceName())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getDeviceName, healthTongueDiagnosisReport.getDeviceName());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getLoginUserCode())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getLoginUserCode, healthTongueDiagnosisReport.getLoginUserCode());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getLoginUserName())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getLoginUserName, healthTongueDiagnosisReport.getLoginUserName());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getName())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getName, healthTongueDiagnosisReport.getName());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getSex())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getSex, healthTongueDiagnosisReport.getSex());
        }
        if (healthTongueDiagnosisReport.getHeight() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getHeight, healthTongueDiagnosisReport.getHeight());
        }
        if (healthTongueDiagnosisReport.getWeight() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getWeight, healthTongueDiagnosisReport.getWeight());
        }
        if (healthTongueDiagnosisReport.getTime() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getTime, healthTongueDiagnosisReport.getTime());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getPdf())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getPdf, healthTongueDiagnosisReport.getPdf());
        }
        if (healthTongueDiagnosisReport.getHealthIndex() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getHealthIndex, healthTongueDiagnosisReport.getHealthIndex());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getConstitutionNames())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getConstitutionNames, healthTongueDiagnosisReport.getConstitutionNames());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getSymptomName())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getSymptomName, healthTongueDiagnosisReport.getSymptomName());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getColorOfTongueNames())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getColorOfTongueNames, healthTongueDiagnosisReport.getColorOfTongueNames());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getColorOfMossNames())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getColorOfMossNames, healthTongueDiagnosisReport.getColorOfMossNames());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getMossNames())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getMossNames, healthTongueDiagnosisReport.getMossNames());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getBodyfluidNames())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getBodyfluidNames, healthTongueDiagnosisReport.getBodyfluidNames());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getShapeOfTongueNames())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getShapeOfTongueNames, healthTongueDiagnosisReport.getShapeOfTongueNames());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getVeinNames())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getVeinNames, healthTongueDiagnosisReport.getVeinNames());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getDiseaseRisks())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getDiseaseRisks, healthTongueDiagnosisReport.getDiseaseRisks());
        }
        if (healthTongueDiagnosisReport.getAreaCode() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getAreaCode, healthTongueDiagnosisReport.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getAreaName())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getAreaName, healthTongueDiagnosisReport.getAreaName());
        }
        if (healthTongueDiagnosisReport.getCreateUser() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getCreateUser, healthTongueDiagnosisReport.getCreateUser());
        }
        if (healthTongueDiagnosisReport.getCreateDept() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getCreateDept, healthTongueDiagnosisReport.getCreateDept());
        }
        if (healthTongueDiagnosisReport.getCreateTime() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getCreateTime, healthTongueDiagnosisReport.getCreateTime());
        }
        if (healthTongueDiagnosisReport.getUpdateUser() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getUpdateUser, healthTongueDiagnosisReport.getUpdateUser());
        }
        if (healthTongueDiagnosisReport.getUpdateTime() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getUpdateTime, healthTongueDiagnosisReport.getUpdateTime());
        }
        if (healthTongueDiagnosisReport.getIsDeleted() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getIsDeleted, healthTongueDiagnosisReport.getIsDeleted());
        }
        if (healthTongueDiagnosisReport.getStatus() != null) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getStatus, healthTongueDiagnosisReport.getStatus());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getDietSuggestion())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getDietSuggestion, healthTongueDiagnosisReport.getDietSuggestion());
        }
        if (StringUtil.isNotEmpty(healthTongueDiagnosisReport.getExerciseSuggestion())) {
            queryWrapper.eq(HealthTongueDiagnosisReport::getExerciseSuggestion, healthTongueDiagnosisReport.getExerciseSuggestion());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthTongueDiagnosisReport 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthTongueDiagnosisReport insert(HealthTongueDiagnosisReport healthTongueDiagnosisReport) {
        healthTongueDiagnosisReport.setId(null);
        getBaseMapper().insert(healthTongueDiagnosisReport);
        return healthTongueDiagnosisReport;
    }

    /**
    * 更新数据
    *
    * @param healthTongueDiagnosisReport 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthTongueDiagnosisReport update(HealthTongueDiagnosisReport healthTongueDiagnosisReport) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthTongueDiagnosisReport> chainWrapper = new LambdaUpdateChainWrapper<HealthTongueDiagnosisReport>(getBaseMapper());
        if (healthTongueDiagnosisReport.getId() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getId, healthTongueDiagnosisReport.getId());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getTenantId())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getTenantId, healthTongueDiagnosisReport.getTenantId());
        }
        if (healthTongueDiagnosisReport.getCorpId() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getCorpId, healthTongueDiagnosisReport.getCorpId());
        }
        if (healthTongueDiagnosisReport.getInstitutionId() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getInstitutionId, healthTongueDiagnosisReport.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getInstitutionName())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getInstitutionName, healthTongueDiagnosisReport.getInstitutionName());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getDeviceCode())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getDeviceCode, healthTongueDiagnosisReport.getDeviceCode());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getDeviceName())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getDeviceName, healthTongueDiagnosisReport.getDeviceName());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getLoginUserCode())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getLoginUserCode, healthTongueDiagnosisReport.getLoginUserCode());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getLoginUserName())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getLoginUserName, healthTongueDiagnosisReport.getLoginUserName());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getName())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getName, healthTongueDiagnosisReport.getName());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getSex())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getSex, healthTongueDiagnosisReport.getSex());
        }
        if (healthTongueDiagnosisReport.getHeight() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getHeight, healthTongueDiagnosisReport.getHeight());
        }
        if (healthTongueDiagnosisReport.getWeight() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getWeight, healthTongueDiagnosisReport.getWeight());
        }
        if (healthTongueDiagnosisReport.getTime() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getTime, healthTongueDiagnosisReport.getTime());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getPdf())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getPdf, healthTongueDiagnosisReport.getPdf());
        }
        if (healthTongueDiagnosisReport.getHealthIndex() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getHealthIndex, healthTongueDiagnosisReport.getHealthIndex());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getConstitutionNames())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getConstitutionNames, healthTongueDiagnosisReport.getConstitutionNames());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getSymptomName())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getSymptomName, healthTongueDiagnosisReport.getSymptomName());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getColorOfTongueNames())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getColorOfTongueNames, healthTongueDiagnosisReport.getColorOfTongueNames());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getColorOfMossNames())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getColorOfMossNames, healthTongueDiagnosisReport.getColorOfMossNames());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getMossNames())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getMossNames, healthTongueDiagnosisReport.getMossNames());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getBodyfluidNames())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getBodyfluidNames, healthTongueDiagnosisReport.getBodyfluidNames());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getShapeOfTongueNames())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getShapeOfTongueNames, healthTongueDiagnosisReport.getShapeOfTongueNames());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getVeinNames())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getVeinNames, healthTongueDiagnosisReport.getVeinNames());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getDiseaseRisks())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getDiseaseRisks, healthTongueDiagnosisReport.getDiseaseRisks());
        }
        if (healthTongueDiagnosisReport.getAreaCode() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getAreaCode, healthTongueDiagnosisReport.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getAreaName())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getAreaName, healthTongueDiagnosisReport.getAreaName());
        }
        if (healthTongueDiagnosisReport.getCreateUser() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getCreateUser, healthTongueDiagnosisReport.getCreateUser());
        }
        if (healthTongueDiagnosisReport.getCreateDept() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getCreateDept, healthTongueDiagnosisReport.getCreateDept());
        }
        if (healthTongueDiagnosisReport.getCreateTime() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getCreateTime, healthTongueDiagnosisReport.getCreateTime());
        }
        if (healthTongueDiagnosisReport.getUpdateUser() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getUpdateUser, healthTongueDiagnosisReport.getUpdateUser());
        }
        if (healthTongueDiagnosisReport.getUpdateTime() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getUpdateTime, healthTongueDiagnosisReport.getUpdateTime());
        }
        if (healthTongueDiagnosisReport.getIsDeleted() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getIsDeleted, healthTongueDiagnosisReport.getIsDeleted());
        }
        if (healthTongueDiagnosisReport.getStatus() != null) {
            chainWrapper.set(HealthTongueDiagnosisReport::getStatus, healthTongueDiagnosisReport.getStatus());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getDietSuggestion())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getDietSuggestion, healthTongueDiagnosisReport.getDietSuggestion());
        }
        if (StringUtil.isNotBlank(healthTongueDiagnosisReport.getExerciseSuggestion())) {
            chainWrapper.set(HealthTongueDiagnosisReport::getExerciseSuggestion, healthTongueDiagnosisReport.getExerciseSuggestion());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthTongueDiagnosisReport::getId, healthTongueDiagnosisReport.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthTongueDiagnosisReport.getId());
        } else {
            return healthTongueDiagnosisReport;
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
    public boolean saveHealthTongueDiagnosisReportBatch(List<HealthTongueDiagnosisReport> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthTongueDiagnosisReport healthTongueDiagnosisReport : insertList) {
            //使用默认的雪花算法生成
            healthTongueDiagnosisReport.setId(null);
            //healthTongueDiagnosisReport.setCreatedDt(currentDte);
            //healthTongueDiagnosisReport.setUpdatedDt(currentDte);
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
    public Integer deleteHealthTongueDiagnosisReportBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthTongueDiagnosisReport> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


