package cn.pluss.platform.service.careNursingItemType.impl;

import cn.pluss.platform.mapper.CareNursingItemTypeMapper;
import cn.pluss.platform.model.entity.CareNursingItemType;
import cn.pluss.platform.service.careNursingItemType.CareNursingItemTypeService;
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
@Service("careNursingItemTypeService")
public class CareNursingItemTypeServiceImpl extends ServiceImpl< CareNursingItemTypeMapper, CareNursingItemType> implements CareNursingItemTypeService {
    private static final Logger logger = LoggerFactory.getLogger(CareNursingItemTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CareNursingItemType> queryPage(Map map) {
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
    public CareNursingItemType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param careNursingItemType 实例对象
    * @return 实例对象
    */
    @Override
    public CareNursingItemType queryOne(CareNursingItemType careNursingItemType){
        LambdaQueryWrapper<CareNursingItemType> queryWrapper = getQueryWrapper(careNursingItemType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param careNursingItemType
    * @return
    */
    @Override
    public List<CareNursingItemType> queryList(CareNursingItemType careNursingItemType) {
        LambdaQueryWrapper<CareNursingItemType> queryWrapper = getQueryWrapper(careNursingItemType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param careNursingItemType
    * @return
    */
    public static LambdaQueryWrapper<CareNursingItemType> getQueryWrapper(CareNursingItemType careNursingItemType){
        LambdaQueryWrapper<CareNursingItemType> queryWrapper = new LambdaQueryWrapper<>();
        if (careNursingItemType.getId() != null) {
            queryWrapper.eq(CareNursingItemType::getId, careNursingItemType.getId());
        }
        if (StringUtil.isNotEmpty(careNursingItemType.getTenantId())) {
            queryWrapper.eq(CareNursingItemType::getTenantId, careNursingItemType.getTenantId());
        }
        if (careNursingItemType.getCorpId() != null) {
            queryWrapper.eq(CareNursingItemType::getCorpId, careNursingItemType.getCorpId());
        }
        if (careNursingItemType.getInstitutionId() != null) {
            queryWrapper.eq(CareNursingItemType::getInstitutionId, careNursingItemType.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(careNursingItemType.getInstitutionName())) {
            queryWrapper.eq(CareNursingItemType::getInstitutionName, careNursingItemType.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(careNursingItemType.getTypeName())) {
            queryWrapper.eq(CareNursingItemType::getTypeName, careNursingItemType.getTypeName());
        }
        if (StringUtil.isNotEmpty(careNursingItemType.getRemark())) {
            queryWrapper.eq(CareNursingItemType::getRemark, careNursingItemType.getRemark());
        }
        if (careNursingItemType.getCreateUser() != null) {
            queryWrapper.eq(CareNursingItemType::getCreateUser, careNursingItemType.getCreateUser());
        }
        if (StringUtil.isNotEmpty(careNursingItemType.getCreateName())) {
            queryWrapper.eq(CareNursingItemType::getCreateName, careNursingItemType.getCreateName());
        }
        if (careNursingItemType.getCreateDept() != null) {
            queryWrapper.eq(CareNursingItemType::getCreateDept, careNursingItemType.getCreateDept());
        }
        if (careNursingItemType.getCreateTime() != null) {
            queryWrapper.eq(CareNursingItemType::getCreateTime, careNursingItemType.getCreateTime());
        }
        if (careNursingItemType.getUpdateUser() != null) {
            queryWrapper.eq(CareNursingItemType::getUpdateUser, careNursingItemType.getUpdateUser());
        }
        if (careNursingItemType.getUpdateTime() != null) {
            queryWrapper.eq(CareNursingItemType::getUpdateTime, careNursingItemType.getUpdateTime());
        }
        if (careNursingItemType.getIsDeleted() != null) {
            queryWrapper.eq(CareNursingItemType::getIsDeleted, careNursingItemType.getIsDeleted());
        }
        if (careNursingItemType.getStatus() != null) {
            queryWrapper.eq(CareNursingItemType::getStatus, careNursingItemType.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param careNursingItemType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingItemType insert(CareNursingItemType careNursingItemType) {
        careNursingItemType.setId(null);
        getBaseMapper().insert(careNursingItemType);
        return careNursingItemType;
    }

    /**
    * 更新数据
    *
    * @param careNursingItemType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingItemType update(CareNursingItemType careNursingItemType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CareNursingItemType> chainWrapper = new LambdaUpdateChainWrapper<CareNursingItemType>(getBaseMapper());
        if (careNursingItemType.getId() != null) {
            chainWrapper.set(CareNursingItemType::getId, careNursingItemType.getId());
        }
        if (StringUtil.isNotBlank(careNursingItemType.getTenantId())) {
            chainWrapper.set(CareNursingItemType::getTenantId, careNursingItemType.getTenantId());
        }
        if (careNursingItemType.getCorpId() != null) {
            chainWrapper.set(CareNursingItemType::getCorpId, careNursingItemType.getCorpId());
        }
        if (careNursingItemType.getInstitutionId() != null) {
            chainWrapper.set(CareNursingItemType::getInstitutionId, careNursingItemType.getInstitutionId());
        }
        if (StringUtil.isNotBlank(careNursingItemType.getInstitutionName())) {
            chainWrapper.set(CareNursingItemType::getInstitutionName, careNursingItemType.getInstitutionName());
        }
        if (StringUtil.isNotBlank(careNursingItemType.getTypeName())) {
            chainWrapper.set(CareNursingItemType::getTypeName, careNursingItemType.getTypeName());
        }
        if (StringUtil.isNotBlank(careNursingItemType.getRemark())) {
            chainWrapper.set(CareNursingItemType::getRemark, careNursingItemType.getRemark());
        }
        if (careNursingItemType.getCreateUser() != null) {
            chainWrapper.set(CareNursingItemType::getCreateUser, careNursingItemType.getCreateUser());
        }
        if (StringUtil.isNotBlank(careNursingItemType.getCreateName())) {
            chainWrapper.set(CareNursingItemType::getCreateName, careNursingItemType.getCreateName());
        }
        if (careNursingItemType.getCreateDept() != null) {
            chainWrapper.set(CareNursingItemType::getCreateDept, careNursingItemType.getCreateDept());
        }
        if (careNursingItemType.getCreateTime() != null) {
            chainWrapper.set(CareNursingItemType::getCreateTime, careNursingItemType.getCreateTime());
        }
        if (careNursingItemType.getUpdateUser() != null) {
            chainWrapper.set(CareNursingItemType::getUpdateUser, careNursingItemType.getUpdateUser());
        }
        if (careNursingItemType.getUpdateTime() != null) {
            chainWrapper.set(CareNursingItemType::getUpdateTime, careNursingItemType.getUpdateTime());
        }
        if (careNursingItemType.getIsDeleted() != null) {
            chainWrapper.set(CareNursingItemType::getIsDeleted, careNursingItemType.getIsDeleted());
        }
        if (careNursingItemType.getStatus() != null) {
            chainWrapper.set(CareNursingItemType::getStatus, careNursingItemType.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CareNursingItemType::getId, careNursingItemType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(careNursingItemType.getId());
        } else {
            return careNursingItemType;
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
    public boolean saveCareNursingItemTypeBatch(List<CareNursingItemType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CareNursingItemType careNursingItemType : insertList) {
            //使用默认的雪花算法生成
            careNursingItemType.setId(null);
            //careNursingItemType.setCreatedDt(currentDte);
            //careNursingItemType.setUpdatedDt(currentDte);
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
    public Integer deleteCareNursingItemTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CareNursingItemType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


