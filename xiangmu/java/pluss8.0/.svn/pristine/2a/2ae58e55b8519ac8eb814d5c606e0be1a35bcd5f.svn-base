package cn.pluss.platform.service.insNursingPlanSetting.impl;

import cn.pluss.platform.mapper.InsNursingPlanSettingMapper;
import cn.pluss.platform.model.entity.InsNursingPlanSetting;
import cn.pluss.platform.service.insNursingPlanSetting.InsNursingPlanSettingService;
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
@Service("insNursingPlanSettingService")
public class InsNursingPlanSettingServiceImpl extends ServiceImpl< InsNursingPlanSettingMapper, InsNursingPlanSetting> implements InsNursingPlanSettingService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingPlanSettingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingPlanSetting> queryPage(Map map) {
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
    public InsNursingPlanSetting queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingPlanSetting 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingPlanSetting queryOne(InsNursingPlanSetting insNursingPlanSetting){
        LambdaQueryWrapper<InsNursingPlanSetting> queryWrapper = getQueryWrapper(insNursingPlanSetting);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingPlanSetting
    * @return
    */
    @Override
    public List<InsNursingPlanSetting> queryList(InsNursingPlanSetting insNursingPlanSetting) {
        LambdaQueryWrapper<InsNursingPlanSetting> queryWrapper = getQueryWrapper(insNursingPlanSetting);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingPlanSetting
    * @return
    */
    public static LambdaQueryWrapper<InsNursingPlanSetting> getQueryWrapper(InsNursingPlanSetting insNursingPlanSetting){
        LambdaQueryWrapper<InsNursingPlanSetting> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingPlanSetting.getId() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getId, insNursingPlanSetting.getId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getTenantId())) {
            queryWrapper.eq(InsNursingPlanSetting::getTenantId, insNursingPlanSetting.getTenantId());
        }
        if (insNursingPlanSetting.getCorpId() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getCorpId, insNursingPlanSetting.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getCorpName())) {
            queryWrapper.eq(InsNursingPlanSetting::getCorpName, insNursingPlanSetting.getCorpName());
        }
        if (insNursingPlanSetting.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getInstitutionId, insNursingPlanSetting.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getInstitutionName())) {
            queryWrapper.eq(InsNursingPlanSetting::getInstitutionName, insNursingPlanSetting.getInstitutionName());
        }
        if (insNursingPlanSetting.getNursingLevelId() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getNursingLevelId, insNursingPlanSetting.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getNursingLevelName())) {
            queryWrapper.eq(InsNursingPlanSetting::getNursingLevelName, insNursingPlanSetting.getNursingLevelName());
        }
        if (insNursingPlanSetting.getTypeId() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getTypeId, insNursingPlanSetting.getTypeId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getTypeName())) {
            queryWrapper.eq(InsNursingPlanSetting::getTypeName, insNursingPlanSetting.getTypeName());
        }
        if (insNursingPlanSetting.getItemId() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getItemId, insNursingPlanSetting.getItemId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getItemName())) {
            queryWrapper.eq(InsNursingPlanSetting::getItemName, insNursingPlanSetting.getItemName());
        }
        if (insNursingPlanSetting.getItemFrequency() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getItemFrequency, insNursingPlanSetting.getItemFrequency());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getStartTime())) {
            queryWrapper.eq(InsNursingPlanSetting::getStartTime, insNursingPlanSetting.getStartTime());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getEndTime())) {
            queryWrapper.eq(InsNursingPlanSetting::getEndTime, insNursingPlanSetting.getEndTime());
        }
        if (insNursingPlanSetting.getWeekNum() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getWeekNum, insNursingPlanSetting.getWeekNum());
        }
        if (insNursingPlanSetting.getDayNum() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getDayNum, insNursingPlanSetting.getDayNum());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getRemark())) {
            queryWrapper.eq(InsNursingPlanSetting::getRemark, insNursingPlanSetting.getRemark());
        }
        if (insNursingPlanSetting.getCreateUser() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getCreateUser, insNursingPlanSetting.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingPlanSetting.getCreateName())) {
            queryWrapper.eq(InsNursingPlanSetting::getCreateName, insNursingPlanSetting.getCreateName());
        }
        if (insNursingPlanSetting.getCreateDept() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getCreateDept, insNursingPlanSetting.getCreateDept());
        }
        if (insNursingPlanSetting.getCreateTime() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getCreateTime, insNursingPlanSetting.getCreateTime());
        }
        if (insNursingPlanSetting.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getUpdateUser, insNursingPlanSetting.getUpdateUser());
        }
        if (insNursingPlanSetting.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getUpdateTime, insNursingPlanSetting.getUpdateTime());
        }
        if (insNursingPlanSetting.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getIsDeleted, insNursingPlanSetting.getIsDeleted());
        }
        if (insNursingPlanSetting.getStatus() != null) {
            queryWrapper.eq(InsNursingPlanSetting::getStatus, insNursingPlanSetting.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingPlanSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingPlanSetting insert(InsNursingPlanSetting insNursingPlanSetting) {
        insNursingPlanSetting.setId(null);
        getBaseMapper().insert(insNursingPlanSetting);
        return insNursingPlanSetting;
    }

    /**
    * 更新数据
    *
    * @param insNursingPlanSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingPlanSetting update(InsNursingPlanSetting insNursingPlanSetting) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingPlanSetting> chainWrapper = new LambdaUpdateChainWrapper<InsNursingPlanSetting>(getBaseMapper());
        if (insNursingPlanSetting.getId() != null) {
            chainWrapper.set(InsNursingPlanSetting::getId, insNursingPlanSetting.getId());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getTenantId())) {
            chainWrapper.set(InsNursingPlanSetting::getTenantId, insNursingPlanSetting.getTenantId());
        }
        if (insNursingPlanSetting.getCorpId() != null) {
            chainWrapper.set(InsNursingPlanSetting::getCorpId, insNursingPlanSetting.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getCorpName())) {
            chainWrapper.set(InsNursingPlanSetting::getCorpName, insNursingPlanSetting.getCorpName());
        }
        if (insNursingPlanSetting.getInstitutionId() != null) {
            chainWrapper.set(InsNursingPlanSetting::getInstitutionId, insNursingPlanSetting.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getInstitutionName())) {
            chainWrapper.set(InsNursingPlanSetting::getInstitutionName, insNursingPlanSetting.getInstitutionName());
        }
        if (insNursingPlanSetting.getNursingLevelId() != null) {
            chainWrapper.set(InsNursingPlanSetting::getNursingLevelId, insNursingPlanSetting.getNursingLevelId());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getNursingLevelName())) {
            chainWrapper.set(InsNursingPlanSetting::getNursingLevelName, insNursingPlanSetting.getNursingLevelName());
        }
        if (insNursingPlanSetting.getTypeId() != null) {
            chainWrapper.set(InsNursingPlanSetting::getTypeId, insNursingPlanSetting.getTypeId());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getTypeName())) {
            chainWrapper.set(InsNursingPlanSetting::getTypeName, insNursingPlanSetting.getTypeName());
        }
        if (insNursingPlanSetting.getItemId() != null) {
            chainWrapper.set(InsNursingPlanSetting::getItemId, insNursingPlanSetting.getItemId());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getItemName())) {
            chainWrapper.set(InsNursingPlanSetting::getItemName, insNursingPlanSetting.getItemName());
        }
        if (insNursingPlanSetting.getItemFrequency() != null) {
            chainWrapper.set(InsNursingPlanSetting::getItemFrequency, insNursingPlanSetting.getItemFrequency());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getStartTime())) {
            chainWrapper.set(InsNursingPlanSetting::getStartTime, insNursingPlanSetting.getStartTime());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getEndTime())) {
            chainWrapper.set(InsNursingPlanSetting::getEndTime, insNursingPlanSetting.getEndTime());
        }
        if (insNursingPlanSetting.getWeekNum() != null) {
            chainWrapper.set(InsNursingPlanSetting::getWeekNum, insNursingPlanSetting.getWeekNum());
        }
        if (insNursingPlanSetting.getDayNum() != null) {
            chainWrapper.set(InsNursingPlanSetting::getDayNum, insNursingPlanSetting.getDayNum());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getRemark())) {
            chainWrapper.set(InsNursingPlanSetting::getRemark, insNursingPlanSetting.getRemark());
        }
        if (insNursingPlanSetting.getCreateUser() != null) {
            chainWrapper.set(InsNursingPlanSetting::getCreateUser, insNursingPlanSetting.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingPlanSetting.getCreateName())) {
            chainWrapper.set(InsNursingPlanSetting::getCreateName, insNursingPlanSetting.getCreateName());
        }
        if (insNursingPlanSetting.getCreateDept() != null) {
            chainWrapper.set(InsNursingPlanSetting::getCreateDept, insNursingPlanSetting.getCreateDept());
        }
        if (insNursingPlanSetting.getCreateTime() != null) {
            chainWrapper.set(InsNursingPlanSetting::getCreateTime, insNursingPlanSetting.getCreateTime());
        }
        if (insNursingPlanSetting.getUpdateUser() != null) {
            chainWrapper.set(InsNursingPlanSetting::getUpdateUser, insNursingPlanSetting.getUpdateUser());
        }
        if (insNursingPlanSetting.getUpdateTime() != null) {
            chainWrapper.set(InsNursingPlanSetting::getUpdateTime, insNursingPlanSetting.getUpdateTime());
        }
        if (insNursingPlanSetting.getIsDeleted() != null) {
            chainWrapper.set(InsNursingPlanSetting::getIsDeleted, insNursingPlanSetting.getIsDeleted());
        }
        if (insNursingPlanSetting.getStatus() != null) {
            chainWrapper.set(InsNursingPlanSetting::getStatus, insNursingPlanSetting.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingPlanSetting::getId, insNursingPlanSetting.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingPlanSetting.getId());
        } else {
            return insNursingPlanSetting;
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
    public boolean saveInsNursingPlanSettingBatch(List<InsNursingPlanSetting> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingPlanSetting insNursingPlanSetting : insertList) {
            //使用默认的雪花算法生成
            insNursingPlanSetting.setId(null);
            //insNursingPlanSetting.setCreatedDt(currentDte);
            //insNursingPlanSetting.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingPlanSettingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingPlanSetting> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


