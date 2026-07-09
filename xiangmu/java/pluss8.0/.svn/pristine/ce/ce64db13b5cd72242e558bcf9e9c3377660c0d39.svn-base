package cn.pluss.platform.service.insActivityType.impl;

import cn.pluss.platform.mapper.InsActivityTypeMapper;
import cn.pluss.platform.model.entity.InsActivityType;
import cn.pluss.platform.service.insActivityType.InsActivityTypeService;
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
@Service("insActivityTypeService")
public class InsActivityTypeServiceImpl extends ServiceImpl< InsActivityTypeMapper, InsActivityType> implements InsActivityTypeService {
    private static final Logger logger = LoggerFactory.getLogger(InsActivityTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsActivityType> queryPage(Map map) {
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
    public InsActivityType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insActivityType 实例对象
    * @return 实例对象
    */
    @Override
    public InsActivityType queryOne(InsActivityType insActivityType){
        LambdaQueryWrapper<InsActivityType> queryWrapper = getQueryWrapper(insActivityType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insActivityType
    * @return
    */
    @Override
    public List<InsActivityType> queryList(InsActivityType insActivityType) {
        LambdaQueryWrapper<InsActivityType> queryWrapper = getQueryWrapper(insActivityType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insActivityType
    * @return
    */
    public static LambdaQueryWrapper<InsActivityType> getQueryWrapper(InsActivityType insActivityType){
        LambdaQueryWrapper<InsActivityType> queryWrapper = new LambdaQueryWrapper<>();
        if (insActivityType.getId() != null) {
            queryWrapper.eq(InsActivityType::getId, insActivityType.getId());
        }
        if (StringUtil.isNotEmpty(insActivityType.getTenantId())) {
            queryWrapper.eq(InsActivityType::getTenantId, insActivityType.getTenantId());
        }
        if (insActivityType.getCorpId() != null) {
            queryWrapper.eq(InsActivityType::getCorpId, insActivityType.getCorpId());
        }
        if (StringUtil.isNotEmpty(insActivityType.getCorpName())) {
            queryWrapper.eq(InsActivityType::getCorpName, insActivityType.getCorpName());
        }
        if (insActivityType.getInstitutionId() != null) {
            queryWrapper.eq(InsActivityType::getInstitutionId, insActivityType.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insActivityType.getInstitutionName())) {
            queryWrapper.eq(InsActivityType::getInstitutionName, insActivityType.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insActivityType.getTypeName())) {
            queryWrapper.eq(InsActivityType::getTypeName, insActivityType.getTypeName());
        }
        if (StringUtil.isNotEmpty(insActivityType.getRemark())) {
            queryWrapper.eq(InsActivityType::getRemark, insActivityType.getRemark());
        }
        if (insActivityType.getCreateUser() != null) {
            queryWrapper.eq(InsActivityType::getCreateUser, insActivityType.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insActivityType.getCreateName())) {
            queryWrapper.eq(InsActivityType::getCreateName, insActivityType.getCreateName());
        }
        if (insActivityType.getCreateDept() != null) {
            queryWrapper.eq(InsActivityType::getCreateDept, insActivityType.getCreateDept());
        }
        if (insActivityType.getCreateTime() != null) {
            queryWrapper.eq(InsActivityType::getCreateTime, insActivityType.getCreateTime());
        }
        if (insActivityType.getUpdateUser() != null) {
            queryWrapper.eq(InsActivityType::getUpdateUser, insActivityType.getUpdateUser());
        }
        if (insActivityType.getUpdateTime() != null) {
            queryWrapper.eq(InsActivityType::getUpdateTime, insActivityType.getUpdateTime());
        }
        if (insActivityType.getIsDeleted() != null) {
            queryWrapper.eq(InsActivityType::getIsDeleted, insActivityType.getIsDeleted());
        }
        if (insActivityType.getStatus() != null) {
            queryWrapper.eq(InsActivityType::getStatus, insActivityType.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insActivityType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityType insert(InsActivityType insActivityType) {
        insActivityType.setId(null);
        getBaseMapper().insert(insActivityType);
        return insActivityType;
    }

    /**
    * 更新数据
    *
    * @param insActivityType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityType update(InsActivityType insActivityType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsActivityType> chainWrapper = new LambdaUpdateChainWrapper<InsActivityType>(getBaseMapper());
        if (insActivityType.getId() != null) {
            chainWrapper.set(InsActivityType::getId, insActivityType.getId());
        }
        if (StringUtil.isNotBlank(insActivityType.getTenantId())) {
            chainWrapper.set(InsActivityType::getTenantId, insActivityType.getTenantId());
        }
        if (insActivityType.getCorpId() != null) {
            chainWrapper.set(InsActivityType::getCorpId, insActivityType.getCorpId());
        }
        if (StringUtil.isNotBlank(insActivityType.getCorpName())) {
            chainWrapper.set(InsActivityType::getCorpName, insActivityType.getCorpName());
        }
        if (insActivityType.getInstitutionId() != null) {
            chainWrapper.set(InsActivityType::getInstitutionId, insActivityType.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insActivityType.getInstitutionName())) {
            chainWrapper.set(InsActivityType::getInstitutionName, insActivityType.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insActivityType.getTypeName())) {
            chainWrapper.set(InsActivityType::getTypeName, insActivityType.getTypeName());
        }
        if (StringUtil.isNotBlank(insActivityType.getRemark())) {
            chainWrapper.set(InsActivityType::getRemark, insActivityType.getRemark());
        }
        if (insActivityType.getCreateUser() != null) {
            chainWrapper.set(InsActivityType::getCreateUser, insActivityType.getCreateUser());
        }
        if (StringUtil.isNotBlank(insActivityType.getCreateName())) {
            chainWrapper.set(InsActivityType::getCreateName, insActivityType.getCreateName());
        }
        if (insActivityType.getCreateDept() != null) {
            chainWrapper.set(InsActivityType::getCreateDept, insActivityType.getCreateDept());
        }
        if (insActivityType.getCreateTime() != null) {
            chainWrapper.set(InsActivityType::getCreateTime, insActivityType.getCreateTime());
        }
        if (insActivityType.getUpdateUser() != null) {
            chainWrapper.set(InsActivityType::getUpdateUser, insActivityType.getUpdateUser());
        }
        if (insActivityType.getUpdateTime() != null) {
            chainWrapper.set(InsActivityType::getUpdateTime, insActivityType.getUpdateTime());
        }
        if (insActivityType.getIsDeleted() != null) {
            chainWrapper.set(InsActivityType::getIsDeleted, insActivityType.getIsDeleted());
        }
        if (insActivityType.getStatus() != null) {
            chainWrapper.set(InsActivityType::getStatus, insActivityType.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsActivityType::getId, insActivityType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insActivityType.getId());
        } else {
            return insActivityType;
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
    public boolean saveInsActivityTypeBatch(List<InsActivityType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsActivityType insActivityType : insertList) {
            //使用默认的雪花算法生成
            insActivityType.setId(null);
            //insActivityType.setCreatedDt(currentDte);
            //insActivityType.setUpdatedDt(currentDte);
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
    public Integer deleteInsActivityTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsActivityType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


