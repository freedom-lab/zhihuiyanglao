package cn.pluss.platform.service.insCanteenFoodType.impl;

import cn.pluss.platform.mapper.InsCanteenFoodTypeMapper;
import cn.pluss.platform.model.entity.InsCanteenFoodType;
import cn.pluss.platform.service.insCanteenFoodType.InsCanteenFoodTypeService;
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
@Service("insCanteenFoodTypeService")
public class InsCanteenFoodTypeServiceImpl extends ServiceImpl< InsCanteenFoodTypeMapper, InsCanteenFoodType> implements InsCanteenFoodTypeService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenFoodTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenFoodType> queryPage(Map map) {
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
    public InsCanteenFoodType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodType 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenFoodType queryOne(InsCanteenFoodType insCanteenFoodType){
        LambdaQueryWrapper<InsCanteenFoodType> queryWrapper = getQueryWrapper(insCanteenFoodType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenFoodType
    * @return
    */
    @Override
    public List<InsCanteenFoodType> queryList(InsCanteenFoodType insCanteenFoodType) {
        LambdaQueryWrapper<InsCanteenFoodType> queryWrapper = getQueryWrapper(insCanteenFoodType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenFoodType
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenFoodType> getQueryWrapper(InsCanteenFoodType insCanteenFoodType){
        LambdaQueryWrapper<InsCanteenFoodType> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenFoodType.getId() != null) {
            queryWrapper.eq(InsCanteenFoodType::getId, insCanteenFoodType.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodType.getTenantId())) {
            queryWrapper.eq(InsCanteenFoodType::getTenantId, insCanteenFoodType.getTenantId());
        }
        if (insCanteenFoodType.getCorpId() != null) {
            queryWrapper.eq(InsCanteenFoodType::getCorpId, insCanteenFoodType.getCorpId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodType.getCorpName())) {
            queryWrapper.eq(InsCanteenFoodType::getCorpName, insCanteenFoodType.getCorpName());
        }
        if (insCanteenFoodType.getInstitutionId() != null) {
            queryWrapper.eq(InsCanteenFoodType::getInstitutionId, insCanteenFoodType.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodType.getInstitutionName())) {
            queryWrapper.eq(InsCanteenFoodType::getInstitutionName, insCanteenFoodType.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodType.getTypeName())) {
            queryWrapper.eq(InsCanteenFoodType::getTypeName, insCanteenFoodType.getTypeName());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodType.getTypeCode())) {
            queryWrapper.eq(InsCanteenFoodType::getTypeCode, insCanteenFoodType.getTypeCode());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodType.getIcon())) {
            queryWrapper.eq(InsCanteenFoodType::getIcon, insCanteenFoodType.getIcon());
        }
        if (insCanteenFoodType.getSort() != null) {
            queryWrapper.eq(InsCanteenFoodType::getSort, insCanteenFoodType.getSort());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodType.getRemark())) {
            queryWrapper.eq(InsCanteenFoodType::getRemark, insCanteenFoodType.getRemark());
        }
        if (insCanteenFoodType.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenFoodType::getCreateUser, insCanteenFoodType.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodType.getCreateName())) {
            queryWrapper.eq(InsCanteenFoodType::getCreateName, insCanteenFoodType.getCreateName());
        }
        if (insCanteenFoodType.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenFoodType::getCreateDept, insCanteenFoodType.getCreateDept());
        }
        if (insCanteenFoodType.getCreateTime() != null) {
            queryWrapper.eq(InsCanteenFoodType::getCreateTime, insCanteenFoodType.getCreateTime());
        }
        if (insCanteenFoodType.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenFoodType::getUpdateUser, insCanteenFoodType.getUpdateUser());
        }
        if (insCanteenFoodType.getUpdateTime() != null) {
            queryWrapper.eq(InsCanteenFoodType::getUpdateTime, insCanteenFoodType.getUpdateTime());
        }
        if (insCanteenFoodType.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenFoodType::getIsDeleted, insCanteenFoodType.getIsDeleted());
        }
        if (insCanteenFoodType.getStatus() != null) {
            queryWrapper.eq(InsCanteenFoodType::getStatus, insCanteenFoodType.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenFoodType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodType insert(InsCanteenFoodType insCanteenFoodType) {
        insCanteenFoodType.setId(null);
        getBaseMapper().insert(insCanteenFoodType);
        return insCanteenFoodType;
    }

    /**
    * 更新数据
    *
    * @param insCanteenFoodType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodType update(InsCanteenFoodType insCanteenFoodType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenFoodType> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenFoodType>(getBaseMapper());
        if (insCanteenFoodType.getId() != null) {
            chainWrapper.set(InsCanteenFoodType::getId, insCanteenFoodType.getId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodType.getTenantId())) {
            chainWrapper.set(InsCanteenFoodType::getTenantId, insCanteenFoodType.getTenantId());
        }
        if (insCanteenFoodType.getCorpId() != null) {
            chainWrapper.set(InsCanteenFoodType::getCorpId, insCanteenFoodType.getCorpId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodType.getCorpName())) {
            chainWrapper.set(InsCanteenFoodType::getCorpName, insCanteenFoodType.getCorpName());
        }
        if (insCanteenFoodType.getInstitutionId() != null) {
            chainWrapper.set(InsCanteenFoodType::getInstitutionId, insCanteenFoodType.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodType.getInstitutionName())) {
            chainWrapper.set(InsCanteenFoodType::getInstitutionName, insCanteenFoodType.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insCanteenFoodType.getTypeName())) {
            chainWrapper.set(InsCanteenFoodType::getTypeName, insCanteenFoodType.getTypeName());
        }
        if (StringUtil.isNotBlank(insCanteenFoodType.getTypeCode())) {
            chainWrapper.set(InsCanteenFoodType::getTypeCode, insCanteenFoodType.getTypeCode());
        }
        if (StringUtil.isNotBlank(insCanteenFoodType.getIcon())) {
            chainWrapper.set(InsCanteenFoodType::getIcon, insCanteenFoodType.getIcon());
        }
        if (insCanteenFoodType.getSort() != null) {
            chainWrapper.set(InsCanteenFoodType::getSort, insCanteenFoodType.getSort());
        }
        if (StringUtil.isNotBlank(insCanteenFoodType.getRemark())) {
            chainWrapper.set(InsCanteenFoodType::getRemark, insCanteenFoodType.getRemark());
        }
        if (insCanteenFoodType.getCreateUser() != null) {
            chainWrapper.set(InsCanteenFoodType::getCreateUser, insCanteenFoodType.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenFoodType.getCreateName())) {
            chainWrapper.set(InsCanteenFoodType::getCreateName, insCanteenFoodType.getCreateName());
        }
        if (insCanteenFoodType.getCreateDept() != null) {
            chainWrapper.set(InsCanteenFoodType::getCreateDept, insCanteenFoodType.getCreateDept());
        }
        if (insCanteenFoodType.getCreateTime() != null) {
            chainWrapper.set(InsCanteenFoodType::getCreateTime, insCanteenFoodType.getCreateTime());
        }
        if (insCanteenFoodType.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenFoodType::getUpdateUser, insCanteenFoodType.getUpdateUser());
        }
        if (insCanteenFoodType.getUpdateTime() != null) {
            chainWrapper.set(InsCanteenFoodType::getUpdateTime, insCanteenFoodType.getUpdateTime());
        }
        if (insCanteenFoodType.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenFoodType::getIsDeleted, insCanteenFoodType.getIsDeleted());
        }
        if (insCanteenFoodType.getStatus() != null) {
            chainWrapper.set(InsCanteenFoodType::getStatus, insCanteenFoodType.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenFoodType::getId, insCanteenFoodType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenFoodType.getId());
        } else {
            return insCanteenFoodType;
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
    public boolean saveInsCanteenFoodTypeBatch(List<InsCanteenFoodType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenFoodType insCanteenFoodType : insertList) {
            //使用默认的雪花算法生成
            insCanteenFoodType.setId(null);
            //insCanteenFoodType.setCreatedDt(currentDte);
            //insCanteenFoodType.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenFoodTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenFoodType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


