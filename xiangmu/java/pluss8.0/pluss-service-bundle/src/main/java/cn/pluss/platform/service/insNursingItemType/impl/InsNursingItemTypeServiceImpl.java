package cn.pluss.platform.service.insNursingItemType.impl;

import cn.pluss.platform.mapper.InsNursingItemTypeMapper;
import cn.pluss.platform.model.entity.InsNursingItemType;
import cn.pluss.platform.service.insNursingItemType.InsNursingItemTypeService;
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
@Service("insNursingItemTypeService")
public class InsNursingItemTypeServiceImpl extends ServiceImpl< InsNursingItemTypeMapper, InsNursingItemType> implements InsNursingItemTypeService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingItemTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingItemType> queryPage(Map map) {
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
    public InsNursingItemType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingItemType 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingItemType queryOne(InsNursingItemType insNursingItemType){
        LambdaQueryWrapper<InsNursingItemType> queryWrapper = getQueryWrapper(insNursingItemType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingItemType
    * @return
    */
    @Override
    public List<InsNursingItemType> queryList(InsNursingItemType insNursingItemType) {
        LambdaQueryWrapper<InsNursingItemType> queryWrapper = getQueryWrapper(insNursingItemType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingItemType
    * @return
    */
    public static LambdaQueryWrapper<InsNursingItemType> getQueryWrapper(InsNursingItemType insNursingItemType){
        LambdaQueryWrapper<InsNursingItemType> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingItemType.getId() != null) {
            queryWrapper.eq(InsNursingItemType::getId, insNursingItemType.getId());
        }
        if (StringUtil.isNotEmpty(insNursingItemType.getTenantId())) {
            queryWrapper.eq(InsNursingItemType::getTenantId, insNursingItemType.getTenantId());
        }
        if (insNursingItemType.getCorpId() != null) {
            queryWrapper.eq(InsNursingItemType::getCorpId, insNursingItemType.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingItemType.getCorpName())) {
            queryWrapper.eq(InsNursingItemType::getCorpName, insNursingItemType.getCorpName());
        }
        if (insNursingItemType.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingItemType::getInstitutionId, insNursingItemType.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingItemType.getInstitutionName())) {
            queryWrapper.eq(InsNursingItemType::getInstitutionName, insNursingItemType.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insNursingItemType.getTypeName())) {
            queryWrapper.eq(InsNursingItemType::getTypeName, insNursingItemType.getTypeName());
        }
        if (StringUtil.isNotEmpty(insNursingItemType.getRemark())) {
            queryWrapper.eq(InsNursingItemType::getRemark, insNursingItemType.getRemark());
        }
        if (insNursingItemType.getCreateUser() != null) {
            queryWrapper.eq(InsNursingItemType::getCreateUser, insNursingItemType.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingItemType.getCreateName())) {
            queryWrapper.eq(InsNursingItemType::getCreateName, insNursingItemType.getCreateName());
        }
        if (insNursingItemType.getCreateDept() != null) {
            queryWrapper.eq(InsNursingItemType::getCreateDept, insNursingItemType.getCreateDept());
        }
        if (insNursingItemType.getCreateTime() != null) {
            queryWrapper.eq(InsNursingItemType::getCreateTime, insNursingItemType.getCreateTime());
        }
        if (insNursingItemType.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingItemType::getUpdateUser, insNursingItemType.getUpdateUser());
        }
        if (insNursingItemType.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingItemType::getUpdateTime, insNursingItemType.getUpdateTime());
        }
        if (insNursingItemType.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingItemType::getIsDeleted, insNursingItemType.getIsDeleted());
        }
        if (insNursingItemType.getStatus() != null) {
            queryWrapper.eq(InsNursingItemType::getStatus, insNursingItemType.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingItemType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingItemType insert(InsNursingItemType insNursingItemType) {
        insNursingItemType.setId(null);
        getBaseMapper().insert(insNursingItemType);
        return insNursingItemType;
    }

    /**
    * 更新数据
    *
    * @param insNursingItemType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingItemType update(InsNursingItemType insNursingItemType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingItemType> chainWrapper = new LambdaUpdateChainWrapper<InsNursingItemType>(getBaseMapper());
        if (insNursingItemType.getId() != null) {
            chainWrapper.set(InsNursingItemType::getId, insNursingItemType.getId());
        }
        if (StringUtil.isNotBlank(insNursingItemType.getTenantId())) {
            chainWrapper.set(InsNursingItemType::getTenantId, insNursingItemType.getTenantId());
        }
        if (insNursingItemType.getCorpId() != null) {
            chainWrapper.set(InsNursingItemType::getCorpId, insNursingItemType.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingItemType.getCorpName())) {
            chainWrapper.set(InsNursingItemType::getCorpName, insNursingItemType.getCorpName());
        }
        if (insNursingItemType.getInstitutionId() != null) {
            chainWrapper.set(InsNursingItemType::getInstitutionId, insNursingItemType.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingItemType.getInstitutionName())) {
            chainWrapper.set(InsNursingItemType::getInstitutionName, insNursingItemType.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insNursingItemType.getTypeName())) {
            chainWrapper.set(InsNursingItemType::getTypeName, insNursingItemType.getTypeName());
        }
        if (StringUtil.isNotBlank(insNursingItemType.getRemark())) {
            chainWrapper.set(InsNursingItemType::getRemark, insNursingItemType.getRemark());
        }
        if (insNursingItemType.getCreateUser() != null) {
            chainWrapper.set(InsNursingItemType::getCreateUser, insNursingItemType.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingItemType.getCreateName())) {
            chainWrapper.set(InsNursingItemType::getCreateName, insNursingItemType.getCreateName());
        }
        if (insNursingItemType.getCreateDept() != null) {
            chainWrapper.set(InsNursingItemType::getCreateDept, insNursingItemType.getCreateDept());
        }
        if (insNursingItemType.getCreateTime() != null) {
            chainWrapper.set(InsNursingItemType::getCreateTime, insNursingItemType.getCreateTime());
        }
        if (insNursingItemType.getUpdateUser() != null) {
            chainWrapper.set(InsNursingItemType::getUpdateUser, insNursingItemType.getUpdateUser());
        }
        if (insNursingItemType.getUpdateTime() != null) {
            chainWrapper.set(InsNursingItemType::getUpdateTime, insNursingItemType.getUpdateTime());
        }
        if (insNursingItemType.getIsDeleted() != null) {
            chainWrapper.set(InsNursingItemType::getIsDeleted, insNursingItemType.getIsDeleted());
        }
        if (insNursingItemType.getStatus() != null) {
            chainWrapper.set(InsNursingItemType::getStatus, insNursingItemType.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingItemType::getId, insNursingItemType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingItemType.getId());
        } else {
            return insNursingItemType;
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
    public boolean saveInsNursingItemTypeBatch(List<InsNursingItemType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingItemType insNursingItemType : insertList) {
            //使用默认的雪花算法生成
            insNursingItemType.setId(null);
            //insNursingItemType.setCreatedDt(currentDte);
            //insNursingItemType.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingItemTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingItemType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


