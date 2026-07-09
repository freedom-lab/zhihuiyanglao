package cn.pluss.platform.service.careNursingLevelSetting.impl;

import cn.pluss.platform.mapper.CareNursingLevelSettingMapper;
import cn.pluss.platform.model.entity.CareNursingLevelSetting;
import cn.pluss.platform.service.careNursingLevelSetting.CareNursingLevelSettingService;
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
@Service("careNursingLevelSettingService")
public class CareNursingLevelSettingServiceImpl extends ServiceImpl< CareNursingLevelSettingMapper, CareNursingLevelSetting> implements CareNursingLevelSettingService {
    private static final Logger logger = LoggerFactory.getLogger(CareNursingLevelSettingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CareNursingLevelSetting> queryPage(Map map) {
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
    public CareNursingLevelSetting queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param careNursingLevelSetting 实例对象
    * @return 实例对象
    */
    @Override
    public CareNursingLevelSetting queryOne(CareNursingLevelSetting careNursingLevelSetting){
        LambdaQueryWrapper<CareNursingLevelSetting> queryWrapper = getQueryWrapper(careNursingLevelSetting);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param careNursingLevelSetting
    * @return
    */
    @Override
    public List<CareNursingLevelSetting> queryList(CareNursingLevelSetting careNursingLevelSetting) {
        LambdaQueryWrapper<CareNursingLevelSetting> queryWrapper = getQueryWrapper(careNursingLevelSetting);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param careNursingLevelSetting
    * @return
    */
    public static LambdaQueryWrapper<CareNursingLevelSetting> getQueryWrapper(CareNursingLevelSetting careNursingLevelSetting){
        LambdaQueryWrapper<CareNursingLevelSetting> queryWrapper = new LambdaQueryWrapper<>();
        if (careNursingLevelSetting.getId() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getId, careNursingLevelSetting.getId());
        }
        if (StringUtil.isNotEmpty(careNursingLevelSetting.getTenantId())) {
            queryWrapper.eq(CareNursingLevelSetting::getTenantId, careNursingLevelSetting.getTenantId());
        }
        if (careNursingLevelSetting.getCorpId() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getCorpId, careNursingLevelSetting.getCorpId());
        }
        if (careNursingLevelSetting.getInstitutionId() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getInstitutionId, careNursingLevelSetting.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(careNursingLevelSetting.getInstitutionName())) {
            queryWrapper.eq(CareNursingLevelSetting::getInstitutionName, careNursingLevelSetting.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(careNursingLevelSetting.getNursingLevelName())) {
            queryWrapper.eq(CareNursingLevelSetting::getNursingLevelName, careNursingLevelSetting.getNursingLevelName());
        }
        if (StringUtil.isNotEmpty(careNursingLevelSetting.getRemark())) {
            queryWrapper.eq(CareNursingLevelSetting::getRemark, careNursingLevelSetting.getRemark());
        }
        if (careNursingLevelSetting.getCreateUser() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getCreateUser, careNursingLevelSetting.getCreateUser());
        }
        if (StringUtil.isNotEmpty(careNursingLevelSetting.getCreateName())) {
            queryWrapper.eq(CareNursingLevelSetting::getCreateName, careNursingLevelSetting.getCreateName());
        }
        if (careNursingLevelSetting.getCreateDept() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getCreateDept, careNursingLevelSetting.getCreateDept());
        }
        if (careNursingLevelSetting.getCreateTime() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getCreateTime, careNursingLevelSetting.getCreateTime());
        }
        if (careNursingLevelSetting.getUpdateUser() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getUpdateUser, careNursingLevelSetting.getUpdateUser());
        }
        if (careNursingLevelSetting.getUpdateTime() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getUpdateTime, careNursingLevelSetting.getUpdateTime());
        }
        if (careNursingLevelSetting.getIsDeleted() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getIsDeleted, careNursingLevelSetting.getIsDeleted());
        }
        if (careNursingLevelSetting.getStatus() != null) {
            queryWrapper.eq(CareNursingLevelSetting::getStatus, careNursingLevelSetting.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param careNursingLevelSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingLevelSetting insert(CareNursingLevelSetting careNursingLevelSetting) {
        careNursingLevelSetting.setId(null);
        getBaseMapper().insert(careNursingLevelSetting);
        return careNursingLevelSetting;
    }

    /**
    * 更新数据
    *
    * @param careNursingLevelSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingLevelSetting update(CareNursingLevelSetting careNursingLevelSetting) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CareNursingLevelSetting> chainWrapper = new LambdaUpdateChainWrapper<CareNursingLevelSetting>(getBaseMapper());
        if (careNursingLevelSetting.getId() != null) {
            chainWrapper.set(CareNursingLevelSetting::getId, careNursingLevelSetting.getId());
        }
        if (StringUtil.isNotBlank(careNursingLevelSetting.getTenantId())) {
            chainWrapper.set(CareNursingLevelSetting::getTenantId, careNursingLevelSetting.getTenantId());
        }
        if (careNursingLevelSetting.getCorpId() != null) {
            chainWrapper.set(CareNursingLevelSetting::getCorpId, careNursingLevelSetting.getCorpId());
        }
        if (careNursingLevelSetting.getInstitutionId() != null) {
            chainWrapper.set(CareNursingLevelSetting::getInstitutionId, careNursingLevelSetting.getInstitutionId());
        }
        if (StringUtil.isNotBlank(careNursingLevelSetting.getInstitutionName())) {
            chainWrapper.set(CareNursingLevelSetting::getInstitutionName, careNursingLevelSetting.getInstitutionName());
        }
        if (StringUtil.isNotBlank(careNursingLevelSetting.getNursingLevelName())) {
            chainWrapper.set(CareNursingLevelSetting::getNursingLevelName, careNursingLevelSetting.getNursingLevelName());
        }
        if (StringUtil.isNotBlank(careNursingLevelSetting.getRemark())) {
            chainWrapper.set(CareNursingLevelSetting::getRemark, careNursingLevelSetting.getRemark());
        }
        if (careNursingLevelSetting.getCreateUser() != null) {
            chainWrapper.set(CareNursingLevelSetting::getCreateUser, careNursingLevelSetting.getCreateUser());
        }
        if (StringUtil.isNotBlank(careNursingLevelSetting.getCreateName())) {
            chainWrapper.set(CareNursingLevelSetting::getCreateName, careNursingLevelSetting.getCreateName());
        }
        if (careNursingLevelSetting.getCreateDept() != null) {
            chainWrapper.set(CareNursingLevelSetting::getCreateDept, careNursingLevelSetting.getCreateDept());
        }
        if (careNursingLevelSetting.getCreateTime() != null) {
            chainWrapper.set(CareNursingLevelSetting::getCreateTime, careNursingLevelSetting.getCreateTime());
        }
        if (careNursingLevelSetting.getUpdateUser() != null) {
            chainWrapper.set(CareNursingLevelSetting::getUpdateUser, careNursingLevelSetting.getUpdateUser());
        }
        if (careNursingLevelSetting.getUpdateTime() != null) {
            chainWrapper.set(CareNursingLevelSetting::getUpdateTime, careNursingLevelSetting.getUpdateTime());
        }
        if (careNursingLevelSetting.getIsDeleted() != null) {
            chainWrapper.set(CareNursingLevelSetting::getIsDeleted, careNursingLevelSetting.getIsDeleted());
        }
        if (careNursingLevelSetting.getStatus() != null) {
            chainWrapper.set(CareNursingLevelSetting::getStatus, careNursingLevelSetting.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CareNursingLevelSetting::getId, careNursingLevelSetting.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(careNursingLevelSetting.getId());
        } else {
            return careNursingLevelSetting;
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
    public boolean saveCareNursingLevelSettingBatch(List<CareNursingLevelSetting> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CareNursingLevelSetting careNursingLevelSetting : insertList) {
            //使用默认的雪花算法生成
            careNursingLevelSetting.setId(null);
            //careNursingLevelSetting.setCreatedDt(currentDte);
            //careNursingLevelSetting.setUpdatedDt(currentDte);
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
    public Integer deleteCareNursingLevelSettingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CareNursingLevelSetting> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


