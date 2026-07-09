package cn.pluss.platform.service.careNursingItemInfo.impl;

import cn.pluss.platform.mapper.CareNursingItemInfoMapper;
import cn.pluss.platform.model.entity.CareNursingItemInfo;
import cn.pluss.platform.service.careNursingItemInfo.CareNursingItemInfoService;
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
@Service("careNursingItemInfoService")
public class CareNursingItemInfoServiceImpl extends ServiceImpl< CareNursingItemInfoMapper, CareNursingItemInfo> implements CareNursingItemInfoService {
    private static final Logger logger = LoggerFactory.getLogger(CareNursingItemInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CareNursingItemInfo> queryPage(Map map) {
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
    public CareNursingItemInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param careNursingItemInfo 实例对象
    * @return 实例对象
    */
    @Override
    public CareNursingItemInfo queryOne(CareNursingItemInfo careNursingItemInfo){
        LambdaQueryWrapper<CareNursingItemInfo> queryWrapper = getQueryWrapper(careNursingItemInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param careNursingItemInfo
    * @return
    */
    @Override
    public List<CareNursingItemInfo> queryList(CareNursingItemInfo careNursingItemInfo) {
        LambdaQueryWrapper<CareNursingItemInfo> queryWrapper = getQueryWrapper(careNursingItemInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param careNursingItemInfo
    * @return
    */
    public static LambdaQueryWrapper<CareNursingItemInfo> getQueryWrapper(CareNursingItemInfo careNursingItemInfo){
        LambdaQueryWrapper<CareNursingItemInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (careNursingItemInfo.getId() != null) {
            queryWrapper.eq(CareNursingItemInfo::getId, careNursingItemInfo.getId());
        }
        if (StringUtil.isNotEmpty(careNursingItemInfo.getTenantId())) {
            queryWrapper.eq(CareNursingItemInfo::getTenantId, careNursingItemInfo.getTenantId());
        }
        if (careNursingItemInfo.getCorpId() != null) {
            queryWrapper.eq(CareNursingItemInfo::getCorpId, careNursingItemInfo.getCorpId());
        }
        if (careNursingItemInfo.getInstitutionId() != null) {
            queryWrapper.eq(CareNursingItemInfo::getInstitutionId, careNursingItemInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(careNursingItemInfo.getInstitutionName())) {
            queryWrapper.eq(CareNursingItemInfo::getInstitutionName, careNursingItemInfo.getInstitutionName());
        }
        if (careNursingItemInfo.getTypeId() != null) {
            queryWrapper.eq(CareNursingItemInfo::getTypeId, careNursingItemInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(careNursingItemInfo.getTypeName())) {
            queryWrapper.eq(CareNursingItemInfo::getTypeName, careNursingItemInfo.getTypeName());
        }
        if (StringUtil.isNotEmpty(careNursingItemInfo.getItemName())) {
            queryWrapper.eq(CareNursingItemInfo::getItemName, careNursingItemInfo.getItemName());
        }
        if (StringUtil.isNotEmpty(careNursingItemInfo.getItemCode())) {
            queryWrapper.eq(CareNursingItemInfo::getItemCode, careNursingItemInfo.getItemCode());
        }
        if (careNursingItemInfo.getItemFrequency() != null) {
            queryWrapper.eq(CareNursingItemInfo::getItemFrequency, careNursingItemInfo.getItemFrequency());
        }
        if (StringUtil.isNotEmpty(careNursingItemInfo.getOperationType())) {
            queryWrapper.eq(CareNursingItemInfo::getOperationType, careNursingItemInfo.getOperationType());
        }
        if (StringUtil.isNotEmpty(careNursingItemInfo.getIconPath())) {
            queryWrapper.eq(CareNursingItemInfo::getIconPath, careNursingItemInfo.getIconPath());
        }
        if (StringUtil.isNotEmpty(careNursingItemInfo.getRemark())) {
            queryWrapper.eq(CareNursingItemInfo::getRemark, careNursingItemInfo.getRemark());
        }
        if (careNursingItemInfo.getCreateUser() != null) {
            queryWrapper.eq(CareNursingItemInfo::getCreateUser, careNursingItemInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(careNursingItemInfo.getCreateName())) {
            queryWrapper.eq(CareNursingItemInfo::getCreateName, careNursingItemInfo.getCreateName());
        }
        if (careNursingItemInfo.getCreateDept() != null) {
            queryWrapper.eq(CareNursingItemInfo::getCreateDept, careNursingItemInfo.getCreateDept());
        }
        if (careNursingItemInfo.getCreateTime() != null) {
            queryWrapper.eq(CareNursingItemInfo::getCreateTime, careNursingItemInfo.getCreateTime());
        }
        if (careNursingItemInfo.getUpdateUser() != null) {
            queryWrapper.eq(CareNursingItemInfo::getUpdateUser, careNursingItemInfo.getUpdateUser());
        }
        if (careNursingItemInfo.getUpdateTime() != null) {
            queryWrapper.eq(CareNursingItemInfo::getUpdateTime, careNursingItemInfo.getUpdateTime());
        }
        if (careNursingItemInfo.getIsDeleted() != null) {
            queryWrapper.eq(CareNursingItemInfo::getIsDeleted, careNursingItemInfo.getIsDeleted());
        }
        if (careNursingItemInfo.getStatus() != null) {
            queryWrapper.eq(CareNursingItemInfo::getStatus, careNursingItemInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param careNursingItemInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingItemInfo insert(CareNursingItemInfo careNursingItemInfo) {
        careNursingItemInfo.setId(null);
        getBaseMapper().insert(careNursingItemInfo);
        return careNursingItemInfo;
    }

    /**
    * 更新数据
    *
    * @param careNursingItemInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingItemInfo update(CareNursingItemInfo careNursingItemInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CareNursingItemInfo> chainWrapper = new LambdaUpdateChainWrapper<CareNursingItemInfo>(getBaseMapper());
        if (careNursingItemInfo.getId() != null) {
            chainWrapper.set(CareNursingItemInfo::getId, careNursingItemInfo.getId());
        }
        if (StringUtil.isNotBlank(careNursingItemInfo.getTenantId())) {
            chainWrapper.set(CareNursingItemInfo::getTenantId, careNursingItemInfo.getTenantId());
        }
        if (careNursingItemInfo.getCorpId() != null) {
            chainWrapper.set(CareNursingItemInfo::getCorpId, careNursingItemInfo.getCorpId());
        }
        if (careNursingItemInfo.getInstitutionId() != null) {
            chainWrapper.set(CareNursingItemInfo::getInstitutionId, careNursingItemInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(careNursingItemInfo.getInstitutionName())) {
            chainWrapper.set(CareNursingItemInfo::getInstitutionName, careNursingItemInfo.getInstitutionName());
        }
        if (careNursingItemInfo.getTypeId() != null) {
            chainWrapper.set(CareNursingItemInfo::getTypeId, careNursingItemInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(careNursingItemInfo.getTypeName())) {
            chainWrapper.set(CareNursingItemInfo::getTypeName, careNursingItemInfo.getTypeName());
        }
        if (StringUtil.isNotBlank(careNursingItemInfo.getItemName())) {
            chainWrapper.set(CareNursingItemInfo::getItemName, careNursingItemInfo.getItemName());
        }
        if (StringUtil.isNotBlank(careNursingItemInfo.getItemCode())) {
            chainWrapper.set(CareNursingItemInfo::getItemCode, careNursingItemInfo.getItemCode());
        }
        if (careNursingItemInfo.getItemFrequency() != null) {
            chainWrapper.set(CareNursingItemInfo::getItemFrequency, careNursingItemInfo.getItemFrequency());
        }
        if (StringUtil.isNotBlank(careNursingItemInfo.getOperationType())) {
            chainWrapper.set(CareNursingItemInfo::getOperationType, careNursingItemInfo.getOperationType());
        }
        if (StringUtil.isNotBlank(careNursingItemInfo.getIconPath())) {
            chainWrapper.set(CareNursingItemInfo::getIconPath, careNursingItemInfo.getIconPath());
        }
        if (StringUtil.isNotBlank(careNursingItemInfo.getRemark())) {
            chainWrapper.set(CareNursingItemInfo::getRemark, careNursingItemInfo.getRemark());
        }
        if (careNursingItemInfo.getCreateUser() != null) {
            chainWrapper.set(CareNursingItemInfo::getCreateUser, careNursingItemInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(careNursingItemInfo.getCreateName())) {
            chainWrapper.set(CareNursingItemInfo::getCreateName, careNursingItemInfo.getCreateName());
        }
        if (careNursingItemInfo.getCreateDept() != null) {
            chainWrapper.set(CareNursingItemInfo::getCreateDept, careNursingItemInfo.getCreateDept());
        }
        if (careNursingItemInfo.getCreateTime() != null) {
            chainWrapper.set(CareNursingItemInfo::getCreateTime, careNursingItemInfo.getCreateTime());
        }
        if (careNursingItemInfo.getUpdateUser() != null) {
            chainWrapper.set(CareNursingItemInfo::getUpdateUser, careNursingItemInfo.getUpdateUser());
        }
        if (careNursingItemInfo.getUpdateTime() != null) {
            chainWrapper.set(CareNursingItemInfo::getUpdateTime, careNursingItemInfo.getUpdateTime());
        }
        if (careNursingItemInfo.getIsDeleted() != null) {
            chainWrapper.set(CareNursingItemInfo::getIsDeleted, careNursingItemInfo.getIsDeleted());
        }
        if (careNursingItemInfo.getStatus() != null) {
            chainWrapper.set(CareNursingItemInfo::getStatus, careNursingItemInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CareNursingItemInfo::getId, careNursingItemInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(careNursingItemInfo.getId());
        } else {
            return careNursingItemInfo;
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
    public boolean saveCareNursingItemInfoBatch(List<CareNursingItemInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CareNursingItemInfo careNursingItemInfo : insertList) {
            //使用默认的雪花算法生成
            careNursingItemInfo.setId(null);
            //careNursingItemInfo.setCreatedDt(currentDte);
            //careNursingItemInfo.setUpdatedDt(currentDte);
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
    public Integer deleteCareNursingItemInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CareNursingItemInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


