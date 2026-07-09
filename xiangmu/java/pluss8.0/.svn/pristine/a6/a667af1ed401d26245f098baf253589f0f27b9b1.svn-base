package cn.pluss.platform.service.insNursingItemInfo.impl;

import cn.pluss.platform.mapper.InsNursingItemInfoMapper;
import cn.pluss.platform.model.entity.InsNursingItemInfo;
import cn.pluss.platform.service.insNursingItemInfo.InsNursingItemInfoService;
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
@Service("insNursingItemInfoService")
public class InsNursingItemInfoServiceImpl extends ServiceImpl< InsNursingItemInfoMapper, InsNursingItemInfo> implements InsNursingItemInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingItemInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingItemInfo> queryPage(Map map) {
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
    public InsNursingItemInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingItemInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingItemInfo queryOne(InsNursingItemInfo insNursingItemInfo){
        LambdaQueryWrapper<InsNursingItemInfo> queryWrapper = getQueryWrapper(insNursingItemInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingItemInfo
    * @return
    */
    @Override
    public List<InsNursingItemInfo> queryList(InsNursingItemInfo insNursingItemInfo) {
        LambdaQueryWrapper<InsNursingItemInfo> queryWrapper = getQueryWrapper(insNursingItemInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingItemInfo
    * @return
    */
    public static LambdaQueryWrapper<InsNursingItemInfo> getQueryWrapper(InsNursingItemInfo insNursingItemInfo){
        LambdaQueryWrapper<InsNursingItemInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingItemInfo.getId() != null) {
            queryWrapper.eq(InsNursingItemInfo::getId, insNursingItemInfo.getId());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getTenantId())) {
            queryWrapper.eq(InsNursingItemInfo::getTenantId, insNursingItemInfo.getTenantId());
        }
        if (insNursingItemInfo.getCorpId() != null) {
            queryWrapper.eq(InsNursingItemInfo::getCorpId, insNursingItemInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getCorpName())) {
            queryWrapper.eq(InsNursingItemInfo::getCorpName, insNursingItemInfo.getCorpName());
        }
        if (insNursingItemInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingItemInfo::getInstitutionId, insNursingItemInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getInstitutionName())) {
            queryWrapper.eq(InsNursingItemInfo::getInstitutionName, insNursingItemInfo.getInstitutionName());
        }
        if (insNursingItemInfo.getTypeId() != null) {
            queryWrapper.eq(InsNursingItemInfo::getTypeId, insNursingItemInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getTypeName())) {
            queryWrapper.eq(InsNursingItemInfo::getTypeName, insNursingItemInfo.getTypeName());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getItemName())) {
            queryWrapper.eq(InsNursingItemInfo::getItemName, insNursingItemInfo.getItemName());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getItemCode())) {
            queryWrapper.eq(InsNursingItemInfo::getItemCode, insNursingItemInfo.getItemCode());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getOperationType())) {
            queryWrapper.eq(InsNursingItemInfo::getOperationType, insNursingItemInfo.getOperationType());
        }
        if (insNursingItemInfo.getItemFrequency() != null) {
            queryWrapper.eq(InsNursingItemInfo::getItemFrequency, insNursingItemInfo.getItemFrequency());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getIconPath())) {
            queryWrapper.eq(InsNursingItemInfo::getIconPath, insNursingItemInfo.getIconPath());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getRemark())) {
            queryWrapper.eq(InsNursingItemInfo::getRemark, insNursingItemInfo.getRemark());
        }
        if (insNursingItemInfo.getCreateUser() != null) {
            queryWrapper.eq(InsNursingItemInfo::getCreateUser, insNursingItemInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingItemInfo.getCreateName())) {
            queryWrapper.eq(InsNursingItemInfo::getCreateName, insNursingItemInfo.getCreateName());
        }
        if (insNursingItemInfo.getCreateDept() != null) {
            queryWrapper.eq(InsNursingItemInfo::getCreateDept, insNursingItemInfo.getCreateDept());
        }
        if (insNursingItemInfo.getCreateTime() != null) {
            queryWrapper.eq(InsNursingItemInfo::getCreateTime, insNursingItemInfo.getCreateTime());
        }
        if (insNursingItemInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingItemInfo::getUpdateUser, insNursingItemInfo.getUpdateUser());
        }
        if (insNursingItemInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingItemInfo::getUpdateTime, insNursingItemInfo.getUpdateTime());
        }
        if (insNursingItemInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingItemInfo::getIsDeleted, insNursingItemInfo.getIsDeleted());
        }
        if (insNursingItemInfo.getStatus() != null) {
            queryWrapper.eq(InsNursingItemInfo::getStatus, insNursingItemInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingItemInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingItemInfo insert(InsNursingItemInfo insNursingItemInfo) {
        insNursingItemInfo.setId(null);
        getBaseMapper().insert(insNursingItemInfo);
        return insNursingItemInfo;
    }

    /**
    * 更新数据
    *
    * @param insNursingItemInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingItemInfo update(InsNursingItemInfo insNursingItemInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingItemInfo> chainWrapper = new LambdaUpdateChainWrapper<InsNursingItemInfo>(getBaseMapper());
        if (insNursingItemInfo.getId() != null) {
            chainWrapper.set(InsNursingItemInfo::getId, insNursingItemInfo.getId());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getTenantId())) {
            chainWrapper.set(InsNursingItemInfo::getTenantId, insNursingItemInfo.getTenantId());
        }
        if (insNursingItemInfo.getCorpId() != null) {
            chainWrapper.set(InsNursingItemInfo::getCorpId, insNursingItemInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getCorpName())) {
            chainWrapper.set(InsNursingItemInfo::getCorpName, insNursingItemInfo.getCorpName());
        }
        if (insNursingItemInfo.getInstitutionId() != null) {
            chainWrapper.set(InsNursingItemInfo::getInstitutionId, insNursingItemInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getInstitutionName())) {
            chainWrapper.set(InsNursingItemInfo::getInstitutionName, insNursingItemInfo.getInstitutionName());
        }
        if (insNursingItemInfo.getTypeId() != null) {
            chainWrapper.set(InsNursingItemInfo::getTypeId, insNursingItemInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getTypeName())) {
            chainWrapper.set(InsNursingItemInfo::getTypeName, insNursingItemInfo.getTypeName());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getItemName())) {
            chainWrapper.set(InsNursingItemInfo::getItemName, insNursingItemInfo.getItemName());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getItemCode())) {
            chainWrapper.set(InsNursingItemInfo::getItemCode, insNursingItemInfo.getItemCode());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getOperationType())) {
            chainWrapper.set(InsNursingItemInfo::getOperationType, insNursingItemInfo.getOperationType());
        }
        if (insNursingItemInfo.getItemFrequency() != null) {
            chainWrapper.set(InsNursingItemInfo::getItemFrequency, insNursingItemInfo.getItemFrequency());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getIconPath())) {
            chainWrapper.set(InsNursingItemInfo::getIconPath, insNursingItemInfo.getIconPath());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getRemark())) {
            chainWrapper.set(InsNursingItemInfo::getRemark, insNursingItemInfo.getRemark());
        }
        if (insNursingItemInfo.getCreateUser() != null) {
            chainWrapper.set(InsNursingItemInfo::getCreateUser, insNursingItemInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingItemInfo.getCreateName())) {
            chainWrapper.set(InsNursingItemInfo::getCreateName, insNursingItemInfo.getCreateName());
        }
        if (insNursingItemInfo.getCreateDept() != null) {
            chainWrapper.set(InsNursingItemInfo::getCreateDept, insNursingItemInfo.getCreateDept());
        }
        if (insNursingItemInfo.getCreateTime() != null) {
            chainWrapper.set(InsNursingItemInfo::getCreateTime, insNursingItemInfo.getCreateTime());
        }
        if (insNursingItemInfo.getUpdateUser() != null) {
            chainWrapper.set(InsNursingItemInfo::getUpdateUser, insNursingItemInfo.getUpdateUser());
        }
        if (insNursingItemInfo.getUpdateTime() != null) {
            chainWrapper.set(InsNursingItemInfo::getUpdateTime, insNursingItemInfo.getUpdateTime());
        }
        if (insNursingItemInfo.getIsDeleted() != null) {
            chainWrapper.set(InsNursingItemInfo::getIsDeleted, insNursingItemInfo.getIsDeleted());
        }
        if (insNursingItemInfo.getStatus() != null) {
            chainWrapper.set(InsNursingItemInfo::getStatus, insNursingItemInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingItemInfo::getId, insNursingItemInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingItemInfo.getId());
        } else {
            return insNursingItemInfo;
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
    public boolean saveInsNursingItemInfoBatch(List<InsNursingItemInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingItemInfo insNursingItemInfo : insertList) {
            //使用默认的雪花算法生成
            insNursingItemInfo.setId(null);
            //insNursingItemInfo.setCreatedDt(currentDte);
            //insNursingItemInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingItemInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingItemInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


