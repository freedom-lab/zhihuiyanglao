package cn.pluss.platform.service.healthVisitRecords.impl;

import cn.pluss.platform.mapper.HealthVisitRecordsMapper;
import cn.pluss.platform.model.entity.HealthVisitRecords;
import cn.pluss.platform.service.healthVisitRecords.HealthVisitRecordsService;
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
@Service("healthVisitRecordsService")
public class HealthVisitRecordsServiceImpl extends ServiceImpl< HealthVisitRecordsMapper, HealthVisitRecords> implements HealthVisitRecordsService {
    private static final Logger logger = LoggerFactory.getLogger(HealthVisitRecordsServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthVisitRecords> queryPage(Map map) {
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
    public HealthVisitRecords queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthVisitRecords 实例对象
    * @return 实例对象
    */
    @Override
    public HealthVisitRecords queryOne(HealthVisitRecords healthVisitRecords){
        LambdaQueryWrapper<HealthVisitRecords> queryWrapper = getQueryWrapper(healthVisitRecords);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthVisitRecords
    * @return
    */
    @Override
    public List<HealthVisitRecords> queryList(HealthVisitRecords healthVisitRecords) {
        LambdaQueryWrapper<HealthVisitRecords> queryWrapper = getQueryWrapper(healthVisitRecords);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthVisitRecords
    * @return
    */
    public static LambdaQueryWrapper<HealthVisitRecords> getQueryWrapper(HealthVisitRecords healthVisitRecords){
        LambdaQueryWrapper<HealthVisitRecords> queryWrapper = new LambdaQueryWrapper<>();
        if (healthVisitRecords.getId() != null) {
            queryWrapper.eq(HealthVisitRecords::getId, healthVisitRecords.getId());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getTenantId())) {
            queryWrapper.eq(HealthVisitRecords::getTenantId, healthVisitRecords.getTenantId());
        }
        if (healthVisitRecords.getCorpId() != null) {
            queryWrapper.eq(HealthVisitRecords::getCorpId, healthVisitRecords.getCorpId());
        }
        if (healthVisitRecords.getInstitutionId() != null) {
            queryWrapper.eq(HealthVisitRecords::getInstitutionId, healthVisitRecords.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getInstitutionName())) {
            queryWrapper.eq(HealthVisitRecords::getInstitutionName, healthVisitRecords.getInstitutionName());
        }
        if (healthVisitRecords.getElderId() != null) {
            queryWrapper.eq(HealthVisitRecords::getElderId, healthVisitRecords.getElderId());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getElderName())) {
            queryWrapper.eq(HealthVisitRecords::getElderName, healthVisitRecords.getElderName());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getIdCard())) {
            queryWrapper.eq(HealthVisitRecords::getIdCard, healthVisitRecords.getIdCard());
        }
        if (healthVisitRecords.getAge() != null) {
            queryWrapper.eq(HealthVisitRecords::getAge, healthVisitRecords.getAge());
        }
        if (healthVisitRecords.getCheckDate() != null) {
            queryWrapper.eq(HealthVisitRecords::getCheckDate, healthVisitRecords.getCheckDate());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getHospital())) {
            queryWrapper.eq(HealthVisitRecords::getHospital, healthVisitRecords.getHospital());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getOffice())) {
            queryWrapper.eq(HealthVisitRecords::getOffice, healthVisitRecords.getOffice());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getDoctor())) {
            queryWrapper.eq(HealthVisitRecords::getDoctor, healthVisitRecords.getDoctor());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getMainContent())) {
            queryWrapper.eq(HealthVisitRecords::getMainContent, healthVisitRecords.getMainContent());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getPresentIllness())) {
            queryWrapper.eq(HealthVisitRecords::getPresentIllness, healthVisitRecords.getPresentIllness());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getPastHistory())) {
            queryWrapper.eq(HealthVisitRecords::getPastHistory, healthVisitRecords.getPastHistory());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getFamilyHistory())) {
            queryWrapper.eq(HealthVisitRecords::getFamilyHistory, healthVisitRecords.getFamilyHistory());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getBodyCheck())) {
            queryWrapper.eq(HealthVisitRecords::getBodyCheck, healthVisitRecords.getBodyCheck());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getAuxiliaryCheck())) {
            queryWrapper.eq(HealthVisitRecords::getAuxiliaryCheck, healthVisitRecords.getAuxiliaryCheck());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getMien())) {
            queryWrapper.eq(HealthVisitRecords::getMien, healthVisitRecords.getMien());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getAuxe())) {
            queryWrapper.eq(HealthVisitRecords::getAuxe, healthVisitRecords.getAuxe());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getNutrition())) {
            queryWrapper.eq(HealthVisitRecords::getNutrition, healthVisitRecords.getNutrition());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getSkinMucosa())) {
            queryWrapper.eq(HealthVisitRecords::getSkinMucosa, healthVisitRecords.getSkinMucosa());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getLymphNode())) {
            queryWrapper.eq(HealthVisitRecords::getLymphNode, healthVisitRecords.getLymphNode());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getHeadOrgan())) {
            queryWrapper.eq(HealthVisitRecords::getHeadOrgan, healthVisitRecords.getHeadOrgan());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getChest())) {
            queryWrapper.eq(HealthVisitRecords::getChest, healthVisitRecords.getChest());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getAbdomen())) {
            queryWrapper.eq(HealthVisitRecords::getAbdomen, healthVisitRecords.getAbdomen());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getCheckResult())) {
            queryWrapper.eq(HealthVisitRecords::getCheckResult, healthVisitRecords.getCheckResult());
        }
        if (healthVisitRecords.getAreaCode() != null) {
            queryWrapper.eq(HealthVisitRecords::getAreaCode, healthVisitRecords.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getAreaName())) {
            queryWrapper.eq(HealthVisitRecords::getAreaName, healthVisitRecords.getAreaName());
        }
        if (healthVisitRecords.getCreateUser() != null) {
            queryWrapper.eq(HealthVisitRecords::getCreateUser, healthVisitRecords.getCreateUser());
        }
        if (healthVisitRecords.getCreateDept() != null) {
            queryWrapper.eq(HealthVisitRecords::getCreateDept, healthVisitRecords.getCreateDept());
        }
        if (healthVisitRecords.getCreateTime() != null) {
            queryWrapper.eq(HealthVisitRecords::getCreateTime, healthVisitRecords.getCreateTime());
        }
        if (healthVisitRecords.getUpdateUser() != null) {
            queryWrapper.eq(HealthVisitRecords::getUpdateUser, healthVisitRecords.getUpdateUser());
        }
        if (healthVisitRecords.getUpdateTime() != null) {
            queryWrapper.eq(HealthVisitRecords::getUpdateTime, healthVisitRecords.getUpdateTime());
        }
        if (healthVisitRecords.getStatus() != null) {
            queryWrapper.eq(HealthVisitRecords::getStatus, healthVisitRecords.getStatus());
        }
        if (healthVisitRecords.getIsDeleted() != null) {
            queryWrapper.eq(HealthVisitRecords::getIsDeleted, healthVisitRecords.getIsDeleted());
        }
        if (StringUtil.isNotEmpty(healthVisitRecords.getRecordName())) {
            queryWrapper.eq(HealthVisitRecords::getRecordName, healthVisitRecords.getRecordName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthVisitRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthVisitRecords insert(HealthVisitRecords healthVisitRecords) {
        healthVisitRecords.setId(null);
        getBaseMapper().insert(healthVisitRecords);
        return healthVisitRecords;
    }

    /**
    * 更新数据
    *
    * @param healthVisitRecords 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthVisitRecords update(HealthVisitRecords healthVisitRecords) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthVisitRecords> chainWrapper = new LambdaUpdateChainWrapper<HealthVisitRecords>(getBaseMapper());
        if (healthVisitRecords.getId() != null) {
            chainWrapper.set(HealthVisitRecords::getId, healthVisitRecords.getId());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getTenantId())) {
            chainWrapper.set(HealthVisitRecords::getTenantId, healthVisitRecords.getTenantId());
        }
        if (healthVisitRecords.getCorpId() != null) {
            chainWrapper.set(HealthVisitRecords::getCorpId, healthVisitRecords.getCorpId());
        }
        if (healthVisitRecords.getInstitutionId() != null) {
            chainWrapper.set(HealthVisitRecords::getInstitutionId, healthVisitRecords.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getInstitutionName())) {
            chainWrapper.set(HealthVisitRecords::getInstitutionName, healthVisitRecords.getInstitutionName());
        }
        if (healthVisitRecords.getElderId() != null) {
            chainWrapper.set(HealthVisitRecords::getElderId, healthVisitRecords.getElderId());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getElderName())) {
            chainWrapper.set(HealthVisitRecords::getElderName, healthVisitRecords.getElderName());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getIdCard())) {
            chainWrapper.set(HealthVisitRecords::getIdCard, healthVisitRecords.getIdCard());
        }
        if (healthVisitRecords.getAge() != null) {
            chainWrapper.set(HealthVisitRecords::getAge, healthVisitRecords.getAge());
        }
        if (healthVisitRecords.getCheckDate() != null) {
            chainWrapper.set(HealthVisitRecords::getCheckDate, healthVisitRecords.getCheckDate());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getHospital())) {
            chainWrapper.set(HealthVisitRecords::getHospital, healthVisitRecords.getHospital());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getOffice())) {
            chainWrapper.set(HealthVisitRecords::getOffice, healthVisitRecords.getOffice());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getDoctor())) {
            chainWrapper.set(HealthVisitRecords::getDoctor, healthVisitRecords.getDoctor());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getMainContent())) {
            chainWrapper.set(HealthVisitRecords::getMainContent, healthVisitRecords.getMainContent());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getPresentIllness())) {
            chainWrapper.set(HealthVisitRecords::getPresentIllness, healthVisitRecords.getPresentIllness());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getPastHistory())) {
            chainWrapper.set(HealthVisitRecords::getPastHistory, healthVisitRecords.getPastHistory());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getFamilyHistory())) {
            chainWrapper.set(HealthVisitRecords::getFamilyHistory, healthVisitRecords.getFamilyHistory());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getBodyCheck())) {
            chainWrapper.set(HealthVisitRecords::getBodyCheck, healthVisitRecords.getBodyCheck());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getAuxiliaryCheck())) {
            chainWrapper.set(HealthVisitRecords::getAuxiliaryCheck, healthVisitRecords.getAuxiliaryCheck());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getMien())) {
            chainWrapper.set(HealthVisitRecords::getMien, healthVisitRecords.getMien());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getAuxe())) {
            chainWrapper.set(HealthVisitRecords::getAuxe, healthVisitRecords.getAuxe());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getNutrition())) {
            chainWrapper.set(HealthVisitRecords::getNutrition, healthVisitRecords.getNutrition());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getSkinMucosa())) {
            chainWrapper.set(HealthVisitRecords::getSkinMucosa, healthVisitRecords.getSkinMucosa());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getLymphNode())) {
            chainWrapper.set(HealthVisitRecords::getLymphNode, healthVisitRecords.getLymphNode());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getHeadOrgan())) {
            chainWrapper.set(HealthVisitRecords::getHeadOrgan, healthVisitRecords.getHeadOrgan());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getChest())) {
            chainWrapper.set(HealthVisitRecords::getChest, healthVisitRecords.getChest());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getAbdomen())) {
            chainWrapper.set(HealthVisitRecords::getAbdomen, healthVisitRecords.getAbdomen());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getCheckResult())) {
            chainWrapper.set(HealthVisitRecords::getCheckResult, healthVisitRecords.getCheckResult());
        }
        if (healthVisitRecords.getAreaCode() != null) {
            chainWrapper.set(HealthVisitRecords::getAreaCode, healthVisitRecords.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getAreaName())) {
            chainWrapper.set(HealthVisitRecords::getAreaName, healthVisitRecords.getAreaName());
        }
        if (healthVisitRecords.getCreateUser() != null) {
            chainWrapper.set(HealthVisitRecords::getCreateUser, healthVisitRecords.getCreateUser());
        }
        if (healthVisitRecords.getCreateDept() != null) {
            chainWrapper.set(HealthVisitRecords::getCreateDept, healthVisitRecords.getCreateDept());
        }
        if (healthVisitRecords.getCreateTime() != null) {
            chainWrapper.set(HealthVisitRecords::getCreateTime, healthVisitRecords.getCreateTime());
        }
        if (healthVisitRecords.getUpdateUser() != null) {
            chainWrapper.set(HealthVisitRecords::getUpdateUser, healthVisitRecords.getUpdateUser());
        }
        if (healthVisitRecords.getUpdateTime() != null) {
            chainWrapper.set(HealthVisitRecords::getUpdateTime, healthVisitRecords.getUpdateTime());
        }
        if (healthVisitRecords.getStatus() != null) {
            chainWrapper.set(HealthVisitRecords::getStatus, healthVisitRecords.getStatus());
        }
        if (healthVisitRecords.getIsDeleted() != null) {
            chainWrapper.set(HealthVisitRecords::getIsDeleted, healthVisitRecords.getIsDeleted());
        }
        if (StringUtil.isNotBlank(healthVisitRecords.getRecordName())) {
            chainWrapper.set(HealthVisitRecords::getRecordName, healthVisitRecords.getRecordName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthVisitRecords::getId, healthVisitRecords.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthVisitRecords.getId());
        } else {
            return healthVisitRecords;
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
    public boolean saveHealthVisitRecordsBatch(List<HealthVisitRecords> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthVisitRecords healthVisitRecords : insertList) {
            //使用默认的雪花算法生成
            healthVisitRecords.setId(null);
            //healthVisitRecords.setCreatedDt(currentDte);
            //healthVisitRecords.setUpdatedDt(currentDte);
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
    public Integer deleteHealthVisitRecordsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthVisitRecords> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


