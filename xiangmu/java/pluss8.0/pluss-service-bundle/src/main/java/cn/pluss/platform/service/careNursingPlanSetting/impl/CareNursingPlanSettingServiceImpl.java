package cn.pluss.platform.service.careNursingPlanSetting.impl;

import cn.pluss.platform.mapper.CareNursingPlanSettingMapper;
import cn.pluss.platform.model.entity.CareNursingPlanSetting;
import cn.pluss.platform.service.careNursingPlanSetting.CareNursingPlanSettingService;
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
@Service("careNursingPlanSettingService")
public class CareNursingPlanSettingServiceImpl extends ServiceImpl< CareNursingPlanSettingMapper, CareNursingPlanSetting> implements CareNursingPlanSettingService {
    private static final Logger logger = LoggerFactory.getLogger(CareNursingPlanSettingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CareNursingPlanSetting> queryPage(Map map) {
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
    public CareNursingPlanSetting queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param careNursingPlanSetting 实例对象
    * @return 实例对象
    */
    @Override
    public CareNursingPlanSetting queryOne(CareNursingPlanSetting careNursingPlanSetting){
        LambdaQueryWrapper<CareNursingPlanSetting> queryWrapper = getQueryWrapper(careNursingPlanSetting);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param careNursingPlanSetting
    * @return
    */
    @Override
    public List<CareNursingPlanSetting> queryList(CareNursingPlanSetting careNursingPlanSetting) {
        LambdaQueryWrapper<CareNursingPlanSetting> queryWrapper = getQueryWrapper(careNursingPlanSetting);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param careNursingPlanSetting
    * @return
    */
    public static LambdaQueryWrapper<CareNursingPlanSetting> getQueryWrapper(CareNursingPlanSetting careNursingPlanSetting){
        LambdaQueryWrapper<CareNursingPlanSetting> queryWrapper = new LambdaQueryWrapper<>();
        if (careNursingPlanSetting.getId() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getId, careNursingPlanSetting.getId());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getTenantId())) {
            queryWrapper.eq(CareNursingPlanSetting::getTenantId, careNursingPlanSetting.getTenantId());
        }
        if (careNursingPlanSetting.getCorpId() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getCorpId, careNursingPlanSetting.getCorpId());
        }
        if (careNursingPlanSetting.getInstitutionId() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getInstitutionId, careNursingPlanSetting.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getInstitutionName())) {
            queryWrapper.eq(CareNursingPlanSetting::getInstitutionName, careNursingPlanSetting.getInstitutionName());
        }
        if (careNursingPlanSetting.getNursingLevelId() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getNursingLevelId, careNursingPlanSetting.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getNursingLevelName())) {
            queryWrapper.eq(CareNursingPlanSetting::getNursingLevelName, careNursingPlanSetting.getNursingLevelName());
        }
        if (careNursingPlanSetting.getTypeId() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getTypeId, careNursingPlanSetting.getTypeId());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getTypeName())) {
            queryWrapper.eq(CareNursingPlanSetting::getTypeName, careNursingPlanSetting.getTypeName());
        }
        if (careNursingPlanSetting.getItemId() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getItemId, careNursingPlanSetting.getItemId());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getItemName())) {
            queryWrapper.eq(CareNursingPlanSetting::getItemName, careNursingPlanSetting.getItemName());
        }
        if (careNursingPlanSetting.getItemFrequency() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getItemFrequency, careNursingPlanSetting.getItemFrequency());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getOperationType())) {
            queryWrapper.eq(CareNursingPlanSetting::getOperationType, careNursingPlanSetting.getOperationType());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getStartTime())) {
            queryWrapper.eq(CareNursingPlanSetting::getStartTime, careNursingPlanSetting.getStartTime());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getEndTime())) {
            queryWrapper.eq(CareNursingPlanSetting::getEndTime, careNursingPlanSetting.getEndTime());
        }
        if (careNursingPlanSetting.getWeekNum() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getWeekNum, careNursingPlanSetting.getWeekNum());
        }
        if (careNursingPlanSetting.getDayNum() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getDayNum, careNursingPlanSetting.getDayNum());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getRemark())) {
            queryWrapper.eq(CareNursingPlanSetting::getRemark, careNursingPlanSetting.getRemark());
        }
        if (careNursingPlanSetting.getCreateUser() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getCreateUser, careNursingPlanSetting.getCreateUser());
        }
        if (StringUtil.isNotEmpty(careNursingPlanSetting.getCreateName())) {
            queryWrapper.eq(CareNursingPlanSetting::getCreateName, careNursingPlanSetting.getCreateName());
        }
        if (careNursingPlanSetting.getCreateDept() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getCreateDept, careNursingPlanSetting.getCreateDept());
        }
        if (careNursingPlanSetting.getCreateTime() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getCreateTime, careNursingPlanSetting.getCreateTime());
        }
        if (careNursingPlanSetting.getUpdateUser() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getUpdateUser, careNursingPlanSetting.getUpdateUser());
        }
        if (careNursingPlanSetting.getUpdateTime() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getUpdateTime, careNursingPlanSetting.getUpdateTime());
        }
        if (careNursingPlanSetting.getIsDeleted() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getIsDeleted, careNursingPlanSetting.getIsDeleted());
        }
        if (careNursingPlanSetting.getStatus() != null) {
            queryWrapper.eq(CareNursingPlanSetting::getStatus, careNursingPlanSetting.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param careNursingPlanSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingPlanSetting insert(CareNursingPlanSetting careNursingPlanSetting) {
        careNursingPlanSetting.setId(null);
        getBaseMapper().insert(careNursingPlanSetting);
        return careNursingPlanSetting;
    }

    /**
    * 更新数据
    *
    * @param careNursingPlanSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingPlanSetting update(CareNursingPlanSetting careNursingPlanSetting) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CareNursingPlanSetting> chainWrapper = new LambdaUpdateChainWrapper<CareNursingPlanSetting>(getBaseMapper());
        if (careNursingPlanSetting.getId() != null) {
            chainWrapper.set(CareNursingPlanSetting::getId, careNursingPlanSetting.getId());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getTenantId())) {
            chainWrapper.set(CareNursingPlanSetting::getTenantId, careNursingPlanSetting.getTenantId());
        }
        if (careNursingPlanSetting.getCorpId() != null) {
            chainWrapper.set(CareNursingPlanSetting::getCorpId, careNursingPlanSetting.getCorpId());
        }
        if (careNursingPlanSetting.getInstitutionId() != null) {
            chainWrapper.set(CareNursingPlanSetting::getInstitutionId, careNursingPlanSetting.getInstitutionId());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getInstitutionName())) {
            chainWrapper.set(CareNursingPlanSetting::getInstitutionName, careNursingPlanSetting.getInstitutionName());
        }
        if (careNursingPlanSetting.getNursingLevelId() != null) {
            chainWrapper.set(CareNursingPlanSetting::getNursingLevelId, careNursingPlanSetting.getNursingLevelId());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getNursingLevelName())) {
            chainWrapper.set(CareNursingPlanSetting::getNursingLevelName, careNursingPlanSetting.getNursingLevelName());
        }
        if (careNursingPlanSetting.getTypeId() != null) {
            chainWrapper.set(CareNursingPlanSetting::getTypeId, careNursingPlanSetting.getTypeId());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getTypeName())) {
            chainWrapper.set(CareNursingPlanSetting::getTypeName, careNursingPlanSetting.getTypeName());
        }
        if (careNursingPlanSetting.getItemId() != null) {
            chainWrapper.set(CareNursingPlanSetting::getItemId, careNursingPlanSetting.getItemId());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getItemName())) {
            chainWrapper.set(CareNursingPlanSetting::getItemName, careNursingPlanSetting.getItemName());
        }
        if (careNursingPlanSetting.getItemFrequency() != null) {
            chainWrapper.set(CareNursingPlanSetting::getItemFrequency, careNursingPlanSetting.getItemFrequency());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getOperationType())) {
            chainWrapper.set(CareNursingPlanSetting::getOperationType, careNursingPlanSetting.getOperationType());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getStartTime())) {
            chainWrapper.set(CareNursingPlanSetting::getStartTime, careNursingPlanSetting.getStartTime());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getEndTime())) {
            chainWrapper.set(CareNursingPlanSetting::getEndTime, careNursingPlanSetting.getEndTime());
        }
        if (careNursingPlanSetting.getWeekNum() != null) {
            chainWrapper.set(CareNursingPlanSetting::getWeekNum, careNursingPlanSetting.getWeekNum());
        }
        if (careNursingPlanSetting.getDayNum() != null) {
            chainWrapper.set(CareNursingPlanSetting::getDayNum, careNursingPlanSetting.getDayNum());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getRemark())) {
            chainWrapper.set(CareNursingPlanSetting::getRemark, careNursingPlanSetting.getRemark());
        }
        if (careNursingPlanSetting.getCreateUser() != null) {
            chainWrapper.set(CareNursingPlanSetting::getCreateUser, careNursingPlanSetting.getCreateUser());
        }
        if (StringUtil.isNotBlank(careNursingPlanSetting.getCreateName())) {
            chainWrapper.set(CareNursingPlanSetting::getCreateName, careNursingPlanSetting.getCreateName());
        }
        if (careNursingPlanSetting.getCreateDept() != null) {
            chainWrapper.set(CareNursingPlanSetting::getCreateDept, careNursingPlanSetting.getCreateDept());
        }
        if (careNursingPlanSetting.getCreateTime() != null) {
            chainWrapper.set(CareNursingPlanSetting::getCreateTime, careNursingPlanSetting.getCreateTime());
        }
        if (careNursingPlanSetting.getUpdateUser() != null) {
            chainWrapper.set(CareNursingPlanSetting::getUpdateUser, careNursingPlanSetting.getUpdateUser());
        }
        if (careNursingPlanSetting.getUpdateTime() != null) {
            chainWrapper.set(CareNursingPlanSetting::getUpdateTime, careNursingPlanSetting.getUpdateTime());
        }
        if (careNursingPlanSetting.getIsDeleted() != null) {
            chainWrapper.set(CareNursingPlanSetting::getIsDeleted, careNursingPlanSetting.getIsDeleted());
        }
        if (careNursingPlanSetting.getStatus() != null) {
            chainWrapper.set(CareNursingPlanSetting::getStatus, careNursingPlanSetting.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CareNursingPlanSetting::getId, careNursingPlanSetting.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(careNursingPlanSetting.getId());
        } else {
            return careNursingPlanSetting;
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
    public boolean saveCareNursingPlanSettingBatch(List<CareNursingPlanSetting> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CareNursingPlanSetting careNursingPlanSetting : insertList) {
            //使用默认的雪花算法生成
            careNursingPlanSetting.setId(null);
            //careNursingPlanSetting.setCreatedDt(currentDte);
            //careNursingPlanSetting.setUpdatedDt(currentDte);
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
    public Integer deleteCareNursingPlanSettingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CareNursingPlanSetting> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


