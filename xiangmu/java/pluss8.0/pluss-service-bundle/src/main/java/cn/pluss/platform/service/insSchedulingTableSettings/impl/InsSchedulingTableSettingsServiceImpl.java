package cn.pluss.platform.service.insSchedulingTableSettings.impl;

import cn.pluss.platform.mapper.InsSchedulingTableSettingsMapper;
import cn.pluss.platform.model.entity.InsSchedulingTableSettings;
import cn.pluss.platform.service.insSchedulingTableSettings.InsSchedulingTableSettingsService;
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
@Service("insSchedulingTableSettingsService")
public class InsSchedulingTableSettingsServiceImpl extends ServiceImpl< InsSchedulingTableSettingsMapper, InsSchedulingTableSettings> implements InsSchedulingTableSettingsService {
    private static final Logger logger = LoggerFactory.getLogger(InsSchedulingTableSettingsServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSchedulingTableSettings> queryPage(Map map) {
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
    public InsSchedulingTableSettings queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingTableSettings 实例对象
    * @return 实例对象
    */
    @Override
    public InsSchedulingTableSettings queryOne(InsSchedulingTableSettings insSchedulingTableSettings){
        LambdaQueryWrapper<InsSchedulingTableSettings> queryWrapper = getQueryWrapper(insSchedulingTableSettings);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSchedulingTableSettings
    * @return
    */
    @Override
    public List<InsSchedulingTableSettings> queryList(InsSchedulingTableSettings insSchedulingTableSettings) {
        LambdaQueryWrapper<InsSchedulingTableSettings> queryWrapper = getQueryWrapper(insSchedulingTableSettings);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSchedulingTableSettings
    * @return
    */
    public static LambdaQueryWrapper<InsSchedulingTableSettings> getQueryWrapper(InsSchedulingTableSettings insSchedulingTableSettings){
        LambdaQueryWrapper<InsSchedulingTableSettings> queryWrapper = new LambdaQueryWrapper<>();
        if (insSchedulingTableSettings.getId() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getId, insSchedulingTableSettings.getId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getTenantId())) {
            queryWrapper.eq(InsSchedulingTableSettings::getTenantId, insSchedulingTableSettings.getTenantId());
        }
        if (insSchedulingTableSettings.getCorpId() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getCorpId, insSchedulingTableSettings.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getCorpName())) {
            queryWrapper.eq(InsSchedulingTableSettings::getCorpName, insSchedulingTableSettings.getCorpName());
        }
        if (insSchedulingTableSettings.getInstitutionId() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getInstitutionId, insSchedulingTableSettings.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getInstitutionName())) {
            queryWrapper.eq(InsSchedulingTableSettings::getInstitutionName, insSchedulingTableSettings.getInstitutionName());
        }
        if (insSchedulingTableSettings.getTableId() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getTableId, insSchedulingTableSettings.getTableId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getTableName())) {
            queryWrapper.eq(InsSchedulingTableSettings::getTableName, insSchedulingTableSettings.getTableName());
        }
        if (insSchedulingTableSettings.getTableDate() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getTableDate, insSchedulingTableSettings.getTableDate());
        }
        if (insSchedulingTableSettings.getLockState() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getLockState, insSchedulingTableSettings.getLockState());
        }
        if (insSchedulingTableSettings.getClassesId() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getClassesId, insSchedulingTableSettings.getClassesId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getClassesName())) {
            queryWrapper.eq(InsSchedulingTableSettings::getClassesName, insSchedulingTableSettings.getClassesName());
        }
        if (insSchedulingTableSettings.getStaffId() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getStaffId, insSchedulingTableSettings.getStaffId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getStaffName())) {
            queryWrapper.eq(InsSchedulingTableSettings::getStaffName, insSchedulingTableSettings.getStaffName());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getIdCard())) {
            queryWrapper.eq(InsSchedulingTableSettings::getIdCard, insSchedulingTableSettings.getIdCard());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getSex())) {
            queryWrapper.eq(InsSchedulingTableSettings::getSex, insSchedulingTableSettings.getSex());
        }
        if (insSchedulingTableSettings.getWorkStartTime() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getWorkStartTime, insSchedulingTableSettings.getWorkStartTime());
        }
        if (insSchedulingTableSettings.getWorkEndTime() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getWorkEndTime, insSchedulingTableSettings.getWorkEndTime());
        }
        if (insSchedulingTableSettings.getSigninTime() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getSigninTime, insSchedulingTableSettings.getSigninTime());
        }
        if (insSchedulingTableSettings.getSignoutTime() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getSignoutTime, insSchedulingTableSettings.getSignoutTime());
        }
        if (insSchedulingTableSettings.getWorkState() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getWorkState, insSchedulingTableSettings.getWorkState());
        }
        if (insSchedulingTableSettings.getOffState() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getOffState, insSchedulingTableSettings.getOffState());
        }
        if (insSchedulingTableSettings.getTableState() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getTableState, insSchedulingTableSettings.getTableState());
        }
        if (insSchedulingTableSettings.getRestDuration() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getRestDuration, insSchedulingTableSettings.getRestDuration());
        }
        if (insSchedulingTableSettings.getSchedulingType() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getSchedulingType, insSchedulingTableSettings.getSchedulingType());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getRemark())) {
            queryWrapper.eq(InsSchedulingTableSettings::getRemark, insSchedulingTableSettings.getRemark());
        }
        if (insSchedulingTableSettings.getCreateUser() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getCreateUser, insSchedulingTableSettings.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableSettings.getCreateName())) {
            queryWrapper.eq(InsSchedulingTableSettings::getCreateName, insSchedulingTableSettings.getCreateName());
        }
        if (insSchedulingTableSettings.getCreateDept() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getCreateDept, insSchedulingTableSettings.getCreateDept());
        }
        if (insSchedulingTableSettings.getCreateTime() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getCreateTime, insSchedulingTableSettings.getCreateTime());
        }
        if (insSchedulingTableSettings.getUpdateUser() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getUpdateUser, insSchedulingTableSettings.getUpdateUser());
        }
        if (insSchedulingTableSettings.getUpdateTime() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getUpdateTime, insSchedulingTableSettings.getUpdateTime());
        }
        if (insSchedulingTableSettings.getIsDeleted() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getIsDeleted, insSchedulingTableSettings.getIsDeleted());
        }
        if (insSchedulingTableSettings.getStatus() != null) {
            queryWrapper.eq(InsSchedulingTableSettings::getStatus, insSchedulingTableSettings.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSchedulingTableSettings 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingTableSettings insert(InsSchedulingTableSettings insSchedulingTableSettings) {
        insSchedulingTableSettings.setId(null);
        getBaseMapper().insert(insSchedulingTableSettings);
        return insSchedulingTableSettings;
    }

    /**
    * 更新数据
    *
    * @param insSchedulingTableSettings 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingTableSettings update(InsSchedulingTableSettings insSchedulingTableSettings) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSchedulingTableSettings> chainWrapper = new LambdaUpdateChainWrapper<InsSchedulingTableSettings>(getBaseMapper());
        if (insSchedulingTableSettings.getId() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getId, insSchedulingTableSettings.getId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getTenantId())) {
            chainWrapper.set(InsSchedulingTableSettings::getTenantId, insSchedulingTableSettings.getTenantId());
        }
        if (insSchedulingTableSettings.getCorpId() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getCorpId, insSchedulingTableSettings.getCorpId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getCorpName())) {
            chainWrapper.set(InsSchedulingTableSettings::getCorpName, insSchedulingTableSettings.getCorpName());
        }
        if (insSchedulingTableSettings.getInstitutionId() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getInstitutionId, insSchedulingTableSettings.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getInstitutionName())) {
            chainWrapper.set(InsSchedulingTableSettings::getInstitutionName, insSchedulingTableSettings.getInstitutionName());
        }
        if (insSchedulingTableSettings.getTableId() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getTableId, insSchedulingTableSettings.getTableId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getTableName())) {
            chainWrapper.set(InsSchedulingTableSettings::getTableName, insSchedulingTableSettings.getTableName());
        }
        if (insSchedulingTableSettings.getTableDate() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getTableDate, insSchedulingTableSettings.getTableDate());
        }
        if (insSchedulingTableSettings.getLockState() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getLockState, insSchedulingTableSettings.getLockState());
        }
        if (insSchedulingTableSettings.getClassesId() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getClassesId, insSchedulingTableSettings.getClassesId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getClassesName())) {
            chainWrapper.set(InsSchedulingTableSettings::getClassesName, insSchedulingTableSettings.getClassesName());
        }
        if (insSchedulingTableSettings.getStaffId() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getStaffId, insSchedulingTableSettings.getStaffId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getStaffName())) {
            chainWrapper.set(InsSchedulingTableSettings::getStaffName, insSchedulingTableSettings.getStaffName());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getIdCard())) {
            chainWrapper.set(InsSchedulingTableSettings::getIdCard, insSchedulingTableSettings.getIdCard());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getSex())) {
            chainWrapper.set(InsSchedulingTableSettings::getSex, insSchedulingTableSettings.getSex());
        }
        if (insSchedulingTableSettings.getWorkStartTime() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getWorkStartTime, insSchedulingTableSettings.getWorkStartTime());
        }
        if (insSchedulingTableSettings.getWorkEndTime() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getWorkEndTime, insSchedulingTableSettings.getWorkEndTime());
        }
        if (insSchedulingTableSettings.getSigninTime() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getSigninTime, insSchedulingTableSettings.getSigninTime());
        }
        if (insSchedulingTableSettings.getSignoutTime() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getSignoutTime, insSchedulingTableSettings.getSignoutTime());
        }
        if (insSchedulingTableSettings.getWorkState() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getWorkState, insSchedulingTableSettings.getWorkState());
        }
        if (insSchedulingTableSettings.getOffState() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getOffState, insSchedulingTableSettings.getOffState());
        }
        if (insSchedulingTableSettings.getTableState() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getTableState, insSchedulingTableSettings.getTableState());
        }
        if (insSchedulingTableSettings.getRestDuration() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getRestDuration, insSchedulingTableSettings.getRestDuration());
        }
        if (insSchedulingTableSettings.getSchedulingType() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getSchedulingType, insSchedulingTableSettings.getSchedulingType());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getRemark())) {
            chainWrapper.set(InsSchedulingTableSettings::getRemark, insSchedulingTableSettings.getRemark());
        }
        if (insSchedulingTableSettings.getCreateUser() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getCreateUser, insSchedulingTableSettings.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSchedulingTableSettings.getCreateName())) {
            chainWrapper.set(InsSchedulingTableSettings::getCreateName, insSchedulingTableSettings.getCreateName());
        }
        if (insSchedulingTableSettings.getCreateDept() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getCreateDept, insSchedulingTableSettings.getCreateDept());
        }
        if (insSchedulingTableSettings.getCreateTime() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getCreateTime, insSchedulingTableSettings.getCreateTime());
        }
        if (insSchedulingTableSettings.getUpdateUser() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getUpdateUser, insSchedulingTableSettings.getUpdateUser());
        }
        if (insSchedulingTableSettings.getUpdateTime() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getUpdateTime, insSchedulingTableSettings.getUpdateTime());
        }
        if (insSchedulingTableSettings.getIsDeleted() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getIsDeleted, insSchedulingTableSettings.getIsDeleted());
        }
        if (insSchedulingTableSettings.getStatus() != null) {
            chainWrapper.set(InsSchedulingTableSettings::getStatus, insSchedulingTableSettings.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSchedulingTableSettings::getId, insSchedulingTableSettings.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSchedulingTableSettings.getId());
        } else {
            return insSchedulingTableSettings;
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
    public boolean saveInsSchedulingTableSettingsBatch(List<InsSchedulingTableSettings> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSchedulingTableSettings insSchedulingTableSettings : insertList) {
            //使用默认的雪花算法生成
            insSchedulingTableSettings.setId(null);
            //insSchedulingTableSettings.setCreatedDt(currentDte);
            //insSchedulingTableSettings.setUpdatedDt(currentDte);
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
    public Integer deleteInsSchedulingTableSettingsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSchedulingTableSettings> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


