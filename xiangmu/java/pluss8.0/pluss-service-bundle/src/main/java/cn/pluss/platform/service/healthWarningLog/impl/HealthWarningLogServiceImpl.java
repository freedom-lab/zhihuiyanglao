package cn.pluss.platform.service.healthWarningLog.impl;

import cn.pluss.platform.mapper.HealthWarningLogMapper;
import cn.pluss.platform.model.entity.HealthWarningLog;
import cn.pluss.platform.service.healthWarningLog.HealthWarningLogService;
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
@Service("healthWarningLogService")
public class HealthWarningLogServiceImpl extends ServiceImpl< HealthWarningLogMapper, HealthWarningLog> implements HealthWarningLogService {
    private static final Logger logger = LoggerFactory.getLogger(HealthWarningLogServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthWarningLog> queryPage(Map map) {
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
    public HealthWarningLog queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthWarningLog 实例对象
    * @return 实例对象
    */
    @Override
    public HealthWarningLog queryOne(HealthWarningLog healthWarningLog){
        LambdaQueryWrapper<HealthWarningLog> queryWrapper = getQueryWrapper(healthWarningLog);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthWarningLog
    * @return
    */
    @Override
    public List<HealthWarningLog> queryList(HealthWarningLog healthWarningLog) {
        LambdaQueryWrapper<HealthWarningLog> queryWrapper = getQueryWrapper(healthWarningLog);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthWarningLog
    * @return
    */
    public static LambdaQueryWrapper<HealthWarningLog> getQueryWrapper(HealthWarningLog healthWarningLog){
        LambdaQueryWrapper<HealthWarningLog> queryWrapper = new LambdaQueryWrapper<>();
        if (healthWarningLog.getId() != null) {
            queryWrapper.eq(HealthWarningLog::getId, healthWarningLog.getId());
        }
        if (StringUtil.isNotEmpty(healthWarningLog.getTenantId())) {
            queryWrapper.eq(HealthWarningLog::getTenantId, healthWarningLog.getTenantId());
        }
        if (healthWarningLog.getCorpId() != null) {
            queryWrapper.eq(HealthWarningLog::getCorpId, healthWarningLog.getCorpId());
        }
        if (healthWarningLog.getInstitutionId() != null) {
            queryWrapper.eq(HealthWarningLog::getInstitutionId, healthWarningLog.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthWarningLog.getInstitutionName())) {
            queryWrapper.eq(HealthWarningLog::getInstitutionName, healthWarningLog.getInstitutionName());
        }
        if (healthWarningLog.getElderId() != null) {
            queryWrapper.eq(HealthWarningLog::getElderId, healthWarningLog.getElderId());
        }
        if (StringUtil.isNotEmpty(healthWarningLog.getElderName())) {
            queryWrapper.eq(HealthWarningLog::getElderName, healthWarningLog.getElderName());
        }
        if (StringUtil.isNotEmpty(healthWarningLog.getSex())) {
            queryWrapper.eq(HealthWarningLog::getSex, healthWarningLog.getSex());
        }
        if (StringUtil.isNotEmpty(healthWarningLog.getIdCard())) {
            queryWrapper.eq(HealthWarningLog::getIdCard, healthWarningLog.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthWarningLog.getHealthyType())) {
            queryWrapper.eq(HealthWarningLog::getHealthyType, healthWarningLog.getHealthyType());
        }
        if (StringUtil.isNotEmpty(healthWarningLog.getWarningText())) {
            queryWrapper.eq(HealthWarningLog::getWarningText, healthWarningLog.getWarningText());
        }
        if (healthWarningLog.getWarningTime() != null) {
            queryWrapper.eq(HealthWarningLog::getWarningTime, healthWarningLog.getWarningTime());
        }
        if (healthWarningLog.getReadState() != null) {
            queryWrapper.eq(HealthWarningLog::getReadState, healthWarningLog.getReadState());
        }
        if (healthWarningLog.getAreaCode() != null) {
            queryWrapper.eq(HealthWarningLog::getAreaCode, healthWarningLog.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthWarningLog.getAreaName())) {
            queryWrapper.eq(HealthWarningLog::getAreaName, healthWarningLog.getAreaName());
        }
        if (healthWarningLog.getCreateUser() != null) {
            queryWrapper.eq(HealthWarningLog::getCreateUser, healthWarningLog.getCreateUser());
        }
        if (healthWarningLog.getCreateDept() != null) {
            queryWrapper.eq(HealthWarningLog::getCreateDept, healthWarningLog.getCreateDept());
        }
        if (healthWarningLog.getCreateTime() != null) {
            queryWrapper.eq(HealthWarningLog::getCreateTime, healthWarningLog.getCreateTime());
        }
        if (healthWarningLog.getUpdateUser() != null) {
            queryWrapper.eq(HealthWarningLog::getUpdateUser, healthWarningLog.getUpdateUser());
        }
        if (healthWarningLog.getUpdateTime() != null) {
            queryWrapper.eq(HealthWarningLog::getUpdateTime, healthWarningLog.getUpdateTime());
        }
        if (healthWarningLog.getStatus() != null) {
            queryWrapper.eq(HealthWarningLog::getStatus, healthWarningLog.getStatus());
        }
        if (healthWarningLog.getIsDeleted() != null) {
            queryWrapper.eq(HealthWarningLog::getIsDeleted, healthWarningLog.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthWarningLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthWarningLog insert(HealthWarningLog healthWarningLog) {
        healthWarningLog.setId(null);
        getBaseMapper().insert(healthWarningLog);
        return healthWarningLog;
    }

    /**
    * 更新数据
    *
    * @param healthWarningLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthWarningLog update(HealthWarningLog healthWarningLog) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthWarningLog> chainWrapper = new LambdaUpdateChainWrapper<HealthWarningLog>(getBaseMapper());
        if (healthWarningLog.getId() != null) {
            chainWrapper.set(HealthWarningLog::getId, healthWarningLog.getId());
        }
        if (StringUtil.isNotBlank(healthWarningLog.getTenantId())) {
            chainWrapper.set(HealthWarningLog::getTenantId, healthWarningLog.getTenantId());
        }
        if (healthWarningLog.getCorpId() != null) {
            chainWrapper.set(HealthWarningLog::getCorpId, healthWarningLog.getCorpId());
        }
        if (healthWarningLog.getInstitutionId() != null) {
            chainWrapper.set(HealthWarningLog::getInstitutionId, healthWarningLog.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthWarningLog.getInstitutionName())) {
            chainWrapper.set(HealthWarningLog::getInstitutionName, healthWarningLog.getInstitutionName());
        }
        if (healthWarningLog.getElderId() != null) {
            chainWrapper.set(HealthWarningLog::getElderId, healthWarningLog.getElderId());
        }
        if (StringUtil.isNotBlank(healthWarningLog.getElderName())) {
            chainWrapper.set(HealthWarningLog::getElderName, healthWarningLog.getElderName());
        }
        if (StringUtil.isNotBlank(healthWarningLog.getSex())) {
            chainWrapper.set(HealthWarningLog::getSex, healthWarningLog.getSex());
        }
        if (StringUtil.isNotBlank(healthWarningLog.getIdCard())) {
            chainWrapper.set(HealthWarningLog::getIdCard, healthWarningLog.getIdCard());
        }
        if (StringUtil.isNotBlank(healthWarningLog.getHealthyType())) {
            chainWrapper.set(HealthWarningLog::getHealthyType, healthWarningLog.getHealthyType());
        }
        if (StringUtil.isNotBlank(healthWarningLog.getWarningText())) {
            chainWrapper.set(HealthWarningLog::getWarningText, healthWarningLog.getWarningText());
        }
        if (healthWarningLog.getWarningTime() != null) {
            chainWrapper.set(HealthWarningLog::getWarningTime, healthWarningLog.getWarningTime());
        }
        if (healthWarningLog.getReadState() != null) {
            chainWrapper.set(HealthWarningLog::getReadState, healthWarningLog.getReadState());
        }
        if (healthWarningLog.getAreaCode() != null) {
            chainWrapper.set(HealthWarningLog::getAreaCode, healthWarningLog.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthWarningLog.getAreaName())) {
            chainWrapper.set(HealthWarningLog::getAreaName, healthWarningLog.getAreaName());
        }
        if (healthWarningLog.getCreateUser() != null) {
            chainWrapper.set(HealthWarningLog::getCreateUser, healthWarningLog.getCreateUser());
        }
        if (healthWarningLog.getCreateDept() != null) {
            chainWrapper.set(HealthWarningLog::getCreateDept, healthWarningLog.getCreateDept());
        }
        if (healthWarningLog.getCreateTime() != null) {
            chainWrapper.set(HealthWarningLog::getCreateTime, healthWarningLog.getCreateTime());
        }
        if (healthWarningLog.getUpdateUser() != null) {
            chainWrapper.set(HealthWarningLog::getUpdateUser, healthWarningLog.getUpdateUser());
        }
        if (healthWarningLog.getUpdateTime() != null) {
            chainWrapper.set(HealthWarningLog::getUpdateTime, healthWarningLog.getUpdateTime());
        }
        if (healthWarningLog.getStatus() != null) {
            chainWrapper.set(HealthWarningLog::getStatus, healthWarningLog.getStatus());
        }
        if (healthWarningLog.getIsDeleted() != null) {
            chainWrapper.set(HealthWarningLog::getIsDeleted, healthWarningLog.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthWarningLog::getId, healthWarningLog.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthWarningLog.getId());
        } else {
            return healthWarningLog;
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
    public boolean saveHealthWarningLogBatch(List<HealthWarningLog> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthWarningLog healthWarningLog : insertList) {
            //使用默认的雪花算法生成
            healthWarningLog.setId(null);
            //healthWarningLog.setCreatedDt(currentDte);
            //healthWarningLog.setUpdatedDt(currentDte);
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
    public Integer deleteHealthWarningLogBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthWarningLog> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


