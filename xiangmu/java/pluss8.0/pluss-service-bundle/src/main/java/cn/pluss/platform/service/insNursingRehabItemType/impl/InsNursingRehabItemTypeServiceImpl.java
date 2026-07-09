package cn.pluss.platform.service.insNursingRehabItemType.impl;

import cn.pluss.platform.mapper.InsNursingRehabItemTypeMapper;
import cn.pluss.platform.model.entity.InsNursingRehabItemType;
import cn.pluss.platform.service.insNursingRehabItemType.InsNursingRehabItemTypeService;
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
@Service("insNursingRehabItemTypeService")
public class InsNursingRehabItemTypeServiceImpl extends ServiceImpl< InsNursingRehabItemTypeMapper, InsNursingRehabItemType> implements InsNursingRehabItemTypeService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingRehabItemTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingRehabItemType> queryPage(Map map) {
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
    public InsNursingRehabItemType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRehabItemType 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingRehabItemType queryOne(InsNursingRehabItemType insNursingRehabItemType){
        LambdaQueryWrapper<InsNursingRehabItemType> queryWrapper = getQueryWrapper(insNursingRehabItemType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRehabItemType
    * @return
    */
    @Override
    public List<InsNursingRehabItemType> queryList(InsNursingRehabItemType insNursingRehabItemType) {
        LambdaQueryWrapper<InsNursingRehabItemType> queryWrapper = getQueryWrapper(insNursingRehabItemType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingRehabItemType
    * @return
    */
    public static LambdaQueryWrapper<InsNursingRehabItemType> getQueryWrapper(InsNursingRehabItemType insNursingRehabItemType){
        LambdaQueryWrapper<InsNursingRehabItemType> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingRehabItemType.getId() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getId, insNursingRehabItemType.getId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItemType.getTenantId())) {
            queryWrapper.eq(InsNursingRehabItemType::getTenantId, insNursingRehabItemType.getTenantId());
        }
        if (insNursingRehabItemType.getCorpId() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getCorpId, insNursingRehabItemType.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItemType.getCorpName())) {
            queryWrapper.eq(InsNursingRehabItemType::getCorpName, insNursingRehabItemType.getCorpName());
        }
        if (insNursingRehabItemType.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getInstitutionId, insNursingRehabItemType.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItemType.getInstitutionName())) {
            queryWrapper.eq(InsNursingRehabItemType::getInstitutionName, insNursingRehabItemType.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItemType.getTypeName())) {
            queryWrapper.eq(InsNursingRehabItemType::getTypeName, insNursingRehabItemType.getTypeName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItemType.getRemark())) {
            queryWrapper.eq(InsNursingRehabItemType::getRemark, insNursingRehabItemType.getRemark());
        }
        if (insNursingRehabItemType.getCreateUser() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getCreateUser, insNursingRehabItemType.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItemType.getCreateName())) {
            queryWrapper.eq(InsNursingRehabItemType::getCreateName, insNursingRehabItemType.getCreateName());
        }
        if (insNursingRehabItemType.getCreateDept() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getCreateDept, insNursingRehabItemType.getCreateDept());
        }
        if (insNursingRehabItemType.getCreateTime() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getCreateTime, insNursingRehabItemType.getCreateTime());
        }
        if (insNursingRehabItemType.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getUpdateUser, insNursingRehabItemType.getUpdateUser());
        }
        if (insNursingRehabItemType.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getUpdateTime, insNursingRehabItemType.getUpdateTime());
        }
        if (insNursingRehabItemType.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getIsDeleted, insNursingRehabItemType.getIsDeleted());
        }
        if (insNursingRehabItemType.getStatus() != null) {
            queryWrapper.eq(InsNursingRehabItemType::getStatus, insNursingRehabItemType.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingRehabItemType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabItemType insert(InsNursingRehabItemType insNursingRehabItemType) {
        insNursingRehabItemType.setId(null);
        getBaseMapper().insert(insNursingRehabItemType);
        return insNursingRehabItemType;
    }

    /**
    * 更新数据
    *
    * @param insNursingRehabItemType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabItemType update(InsNursingRehabItemType insNursingRehabItemType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingRehabItemType> chainWrapper = new LambdaUpdateChainWrapper<InsNursingRehabItemType>(getBaseMapper());
        if (insNursingRehabItemType.getId() != null) {
            chainWrapper.set(InsNursingRehabItemType::getId, insNursingRehabItemType.getId());
        }
        if (StringUtil.isNotBlank(insNursingRehabItemType.getTenantId())) {
            chainWrapper.set(InsNursingRehabItemType::getTenantId, insNursingRehabItemType.getTenantId());
        }
        if (insNursingRehabItemType.getCorpId() != null) {
            chainWrapper.set(InsNursingRehabItemType::getCorpId, insNursingRehabItemType.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingRehabItemType.getCorpName())) {
            chainWrapper.set(InsNursingRehabItemType::getCorpName, insNursingRehabItemType.getCorpName());
        }
        if (insNursingRehabItemType.getInstitutionId() != null) {
            chainWrapper.set(InsNursingRehabItemType::getInstitutionId, insNursingRehabItemType.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingRehabItemType.getInstitutionName())) {
            chainWrapper.set(InsNursingRehabItemType::getInstitutionName, insNursingRehabItemType.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insNursingRehabItemType.getTypeName())) {
            chainWrapper.set(InsNursingRehabItemType::getTypeName, insNursingRehabItemType.getTypeName());
        }
        if (StringUtil.isNotBlank(insNursingRehabItemType.getRemark())) {
            chainWrapper.set(InsNursingRehabItemType::getRemark, insNursingRehabItemType.getRemark());
        }
        if (insNursingRehabItemType.getCreateUser() != null) {
            chainWrapper.set(InsNursingRehabItemType::getCreateUser, insNursingRehabItemType.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingRehabItemType.getCreateName())) {
            chainWrapper.set(InsNursingRehabItemType::getCreateName, insNursingRehabItemType.getCreateName());
        }
        if (insNursingRehabItemType.getCreateDept() != null) {
            chainWrapper.set(InsNursingRehabItemType::getCreateDept, insNursingRehabItemType.getCreateDept());
        }
        if (insNursingRehabItemType.getCreateTime() != null) {
            chainWrapper.set(InsNursingRehabItemType::getCreateTime, insNursingRehabItemType.getCreateTime());
        }
        if (insNursingRehabItemType.getUpdateUser() != null) {
            chainWrapper.set(InsNursingRehabItemType::getUpdateUser, insNursingRehabItemType.getUpdateUser());
        }
        if (insNursingRehabItemType.getUpdateTime() != null) {
            chainWrapper.set(InsNursingRehabItemType::getUpdateTime, insNursingRehabItemType.getUpdateTime());
        }
        if (insNursingRehabItemType.getIsDeleted() != null) {
            chainWrapper.set(InsNursingRehabItemType::getIsDeleted, insNursingRehabItemType.getIsDeleted());
        }
        if (insNursingRehabItemType.getStatus() != null) {
            chainWrapper.set(InsNursingRehabItemType::getStatus, insNursingRehabItemType.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingRehabItemType::getId, insNursingRehabItemType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingRehabItemType.getId());
        } else {
            return insNursingRehabItemType;
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
    public boolean saveInsNursingRehabItemTypeBatch(List<InsNursingRehabItemType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingRehabItemType insNursingRehabItemType : insertList) {
            //使用默认的雪花算法生成
            insNursingRehabItemType.setId(null);
            //insNursingRehabItemType.setCreatedDt(currentDte);
            //insNursingRehabItemType.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingRehabItemTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingRehabItemType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


