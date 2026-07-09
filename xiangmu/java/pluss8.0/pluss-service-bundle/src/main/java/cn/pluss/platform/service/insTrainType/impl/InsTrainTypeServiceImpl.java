package cn.pluss.platform.service.insTrainType.impl;

import cn.pluss.platform.mapper.InsTrainTypeMapper;
import cn.pluss.platform.model.entity.InsTrainType;
import cn.pluss.platform.service.insTrainType.InsTrainTypeService;
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
@Service("insTrainTypeService")
public class InsTrainTypeServiceImpl extends ServiceImpl< InsTrainTypeMapper, InsTrainType> implements InsTrainTypeService {
    private static final Logger logger = LoggerFactory.getLogger(InsTrainTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsTrainType> queryPage(Map map) {
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
    public InsTrainType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insTrainType 实例对象
    * @return 实例对象
    */
    @Override
    public InsTrainType queryOne(InsTrainType insTrainType){
        LambdaQueryWrapper<InsTrainType> queryWrapper = getQueryWrapper(insTrainType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insTrainType
    * @return
    */
    @Override
    public List<InsTrainType> queryList(InsTrainType insTrainType) {
        LambdaQueryWrapper<InsTrainType> queryWrapper = getQueryWrapper(insTrainType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insTrainType
    * @return
    */
    public static LambdaQueryWrapper<InsTrainType> getQueryWrapper(InsTrainType insTrainType){
        LambdaQueryWrapper<InsTrainType> queryWrapper = new LambdaQueryWrapper<>();
        if (insTrainType.getId() != null) {
            queryWrapper.eq(InsTrainType::getId, insTrainType.getId());
        }
        if (StringUtil.isNotEmpty(insTrainType.getTenantId())) {
            queryWrapper.eq(InsTrainType::getTenantId, insTrainType.getTenantId());
        }
        if (insTrainType.getCorpId() != null) {
            queryWrapper.eq(InsTrainType::getCorpId, insTrainType.getCorpId());
        }
        if (StringUtil.isNotEmpty(insTrainType.getCorpName())) {
            queryWrapper.eq(InsTrainType::getCorpName, insTrainType.getCorpName());
        }
        if (insTrainType.getInstitutionId() != null) {
            queryWrapper.eq(InsTrainType::getInstitutionId, insTrainType.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insTrainType.getInstitutionName())) {
            queryWrapper.eq(InsTrainType::getInstitutionName, insTrainType.getInstitutionName());
        }
        if (insTrainType.getParentId() != null) {
            queryWrapper.eq(InsTrainType::getParentId, insTrainType.getParentId());
        }
        if (StringUtil.isNotEmpty(insTrainType.getParentName())) {
            queryWrapper.eq(InsTrainType::getParentName, insTrainType.getParentName());
        }
        if (StringUtil.isNotEmpty(insTrainType.getTypeName())) {
            queryWrapper.eq(InsTrainType::getTypeName, insTrainType.getTypeName());
        }
        if (insTrainType.getSort() != null) {
            queryWrapper.eq(InsTrainType::getSort, insTrainType.getSort());
        }
        if (StringUtil.isNotEmpty(insTrainType.getRemark())) {
            queryWrapper.eq(InsTrainType::getRemark, insTrainType.getRemark());
        }
        if (insTrainType.getCreateUser() != null) {
            queryWrapper.eq(InsTrainType::getCreateUser, insTrainType.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insTrainType.getCreateName())) {
            queryWrapper.eq(InsTrainType::getCreateName, insTrainType.getCreateName());
        }
        if (insTrainType.getCreateDept() != null) {
            queryWrapper.eq(InsTrainType::getCreateDept, insTrainType.getCreateDept());
        }
        if (insTrainType.getCreateTime() != null) {
            queryWrapper.eq(InsTrainType::getCreateTime, insTrainType.getCreateTime());
        }
        if (insTrainType.getUpdateUser() != null) {
            queryWrapper.eq(InsTrainType::getUpdateUser, insTrainType.getUpdateUser());
        }
        if (insTrainType.getUpdateTime() != null) {
            queryWrapper.eq(InsTrainType::getUpdateTime, insTrainType.getUpdateTime());
        }
        if (insTrainType.getIsDeleted() != null) {
            queryWrapper.eq(InsTrainType::getIsDeleted, insTrainType.getIsDeleted());
        }
        if (insTrainType.getStatus() != null) {
            queryWrapper.eq(InsTrainType::getStatus, insTrainType.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insTrainType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsTrainType insert(InsTrainType insTrainType) {
        insTrainType.setId(null);
        getBaseMapper().insert(insTrainType);
        return insTrainType;
    }

    /**
    * 更新数据
    *
    * @param insTrainType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsTrainType update(InsTrainType insTrainType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsTrainType> chainWrapper = new LambdaUpdateChainWrapper<InsTrainType>(getBaseMapper());
        if (insTrainType.getId() != null) {
            chainWrapper.set(InsTrainType::getId, insTrainType.getId());
        }
        if (StringUtil.isNotBlank(insTrainType.getTenantId())) {
            chainWrapper.set(InsTrainType::getTenantId, insTrainType.getTenantId());
        }
        if (insTrainType.getCorpId() != null) {
            chainWrapper.set(InsTrainType::getCorpId, insTrainType.getCorpId());
        }
        if (StringUtil.isNotBlank(insTrainType.getCorpName())) {
            chainWrapper.set(InsTrainType::getCorpName, insTrainType.getCorpName());
        }
        if (insTrainType.getInstitutionId() != null) {
            chainWrapper.set(InsTrainType::getInstitutionId, insTrainType.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insTrainType.getInstitutionName())) {
            chainWrapper.set(InsTrainType::getInstitutionName, insTrainType.getInstitutionName());
        }
        if (insTrainType.getParentId() != null) {
            chainWrapper.set(InsTrainType::getParentId, insTrainType.getParentId());
        }
        if (StringUtil.isNotBlank(insTrainType.getParentName())) {
            chainWrapper.set(InsTrainType::getParentName, insTrainType.getParentName());
        }
        if (StringUtil.isNotBlank(insTrainType.getTypeName())) {
            chainWrapper.set(InsTrainType::getTypeName, insTrainType.getTypeName());
        }
        if (insTrainType.getSort() != null) {
            chainWrapper.set(InsTrainType::getSort, insTrainType.getSort());
        }
        if (StringUtil.isNotBlank(insTrainType.getRemark())) {
            chainWrapper.set(InsTrainType::getRemark, insTrainType.getRemark());
        }
        if (insTrainType.getCreateUser() != null) {
            chainWrapper.set(InsTrainType::getCreateUser, insTrainType.getCreateUser());
        }
        if (StringUtil.isNotBlank(insTrainType.getCreateName())) {
            chainWrapper.set(InsTrainType::getCreateName, insTrainType.getCreateName());
        }
        if (insTrainType.getCreateDept() != null) {
            chainWrapper.set(InsTrainType::getCreateDept, insTrainType.getCreateDept());
        }
        if (insTrainType.getCreateTime() != null) {
            chainWrapper.set(InsTrainType::getCreateTime, insTrainType.getCreateTime());
        }
        if (insTrainType.getUpdateUser() != null) {
            chainWrapper.set(InsTrainType::getUpdateUser, insTrainType.getUpdateUser());
        }
        if (insTrainType.getUpdateTime() != null) {
            chainWrapper.set(InsTrainType::getUpdateTime, insTrainType.getUpdateTime());
        }
        if (insTrainType.getIsDeleted() != null) {
            chainWrapper.set(InsTrainType::getIsDeleted, insTrainType.getIsDeleted());
        }
        if (insTrainType.getStatus() != null) {
            chainWrapper.set(InsTrainType::getStatus, insTrainType.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsTrainType::getId, insTrainType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insTrainType.getId());
        } else {
            return insTrainType;
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
    public boolean saveInsTrainTypeBatch(List<InsTrainType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsTrainType insTrainType : insertList) {
            //使用默认的雪花算法生成
            insTrainType.setId(null);
            //insTrainType.setCreatedDt(currentDte);
            //insTrainType.setUpdatedDt(currentDte);
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
    public Integer deleteInsTrainTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsTrainType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


