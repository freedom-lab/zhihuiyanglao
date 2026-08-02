package cn.pluss.platform.service.insNursingServiceType.impl;

import cn.pluss.platform.mapper.InsNursingServiceTypeMapper;
import cn.pluss.platform.model.entity.InsNursingServiceType;
import cn.pluss.platform.service.insNursingServiceType.InsNursingServiceTypeService;
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
@Service("insNursingServiceTypeService")
public class InsNursingServiceTypeServiceImpl extends ServiceImpl< InsNursingServiceTypeMapper, InsNursingServiceType> implements InsNursingServiceTypeService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingServiceTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingServiceType> queryPage(Map map) {
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
    public InsNursingServiceType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingServiceType 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingServiceType queryOne(InsNursingServiceType insNursingServiceType){
        LambdaQueryWrapper<InsNursingServiceType> queryWrapper = getQueryWrapper(insNursingServiceType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingServiceType
    * @return
    */
    @Override
    public List<InsNursingServiceType> queryList(InsNursingServiceType insNursingServiceType) {
        LambdaQueryWrapper<InsNursingServiceType> queryWrapper = getQueryWrapper(insNursingServiceType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingServiceType
    * @return
    */
    public static LambdaQueryWrapper<InsNursingServiceType> getQueryWrapper(InsNursingServiceType insNursingServiceType){
        LambdaQueryWrapper<InsNursingServiceType> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingServiceType.getId() != null) {
            queryWrapper.eq(InsNursingServiceType::getId, insNursingServiceType.getId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceType.getTenantId())) {
            queryWrapper.eq(InsNursingServiceType::getTenantId, insNursingServiceType.getTenantId());
        }
        if (insNursingServiceType.getCorpId() != null) {
            queryWrapper.eq(InsNursingServiceType::getCorpId, insNursingServiceType.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceType.getCorpName())) {
            queryWrapper.eq(InsNursingServiceType::getCorpName, insNursingServiceType.getCorpName());
        }
        if (insNursingServiceType.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingServiceType::getInstitutionId, insNursingServiceType.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceType.getInstitutionName())) {
            queryWrapper.eq(InsNursingServiceType::getInstitutionName, insNursingServiceType.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insNursingServiceType.getTypeName())) {
            queryWrapper.eq(InsNursingServiceType::getTypeName, insNursingServiceType.getTypeName());
        }
        if (StringUtil.isNotEmpty(insNursingServiceType.getRemark())) {
            queryWrapper.eq(InsNursingServiceType::getRemark, insNursingServiceType.getRemark());
        }
        if (StringUtil.isNotEmpty(insNursingServiceType.getIconPath())) {
            queryWrapper.eq(InsNursingServiceType::getIconPath, insNursingServiceType.getIconPath());
        }
        if (insNursingServiceType.getCreateUser() != null) {
            queryWrapper.eq(InsNursingServiceType::getCreateUser, insNursingServiceType.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingServiceType.getCreateName())) {
            queryWrapper.eq(InsNursingServiceType::getCreateName, insNursingServiceType.getCreateName());
        }
        if (insNursingServiceType.getCreateDept() != null) {
            queryWrapper.eq(InsNursingServiceType::getCreateDept, insNursingServiceType.getCreateDept());
        }
        if (insNursingServiceType.getCreateTime() != null) {
            queryWrapper.eq(InsNursingServiceType::getCreateTime, insNursingServiceType.getCreateTime());
        }
        if (insNursingServiceType.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingServiceType::getUpdateUser, insNursingServiceType.getUpdateUser());
        }
        if (insNursingServiceType.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingServiceType::getUpdateTime, insNursingServiceType.getUpdateTime());
        }
        if (insNursingServiceType.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingServiceType::getIsDeleted, insNursingServiceType.getIsDeleted());
        }
        if (insNursingServiceType.getStatus() != null) {
            queryWrapper.eq(InsNursingServiceType::getStatus, insNursingServiceType.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingServiceType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingServiceType insert(InsNursingServiceType insNursingServiceType) {
        insNursingServiceType.setId(null);
        getBaseMapper().insert(insNursingServiceType);
        return insNursingServiceType;
    }

    /**
    * 更新数据
    *
    * @param insNursingServiceType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingServiceType update(InsNursingServiceType insNursingServiceType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingServiceType> chainWrapper = new LambdaUpdateChainWrapper<InsNursingServiceType>(getBaseMapper());
        if (insNursingServiceType.getId() != null) {
            chainWrapper.set(InsNursingServiceType::getId, insNursingServiceType.getId());
        }
        if (StringUtil.isNotBlank(insNursingServiceType.getTenantId())) {
            chainWrapper.set(InsNursingServiceType::getTenantId, insNursingServiceType.getTenantId());
        }
        if (insNursingServiceType.getCorpId() != null) {
            chainWrapper.set(InsNursingServiceType::getCorpId, insNursingServiceType.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingServiceType.getCorpName())) {
            chainWrapper.set(InsNursingServiceType::getCorpName, insNursingServiceType.getCorpName());
        }
        if (insNursingServiceType.getInstitutionId() != null) {
            chainWrapper.set(InsNursingServiceType::getInstitutionId, insNursingServiceType.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingServiceType.getInstitutionName())) {
            chainWrapper.set(InsNursingServiceType::getInstitutionName, insNursingServiceType.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insNursingServiceType.getTypeName())) {
            chainWrapper.set(InsNursingServiceType::getTypeName, insNursingServiceType.getTypeName());
        }
        if (StringUtil.isNotBlank(insNursingServiceType.getRemark())) {
            chainWrapper.set(InsNursingServiceType::getRemark, insNursingServiceType.getRemark());
        }
        if (StringUtil.isNotBlank(insNursingServiceType.getIconPath())) {
            chainWrapper.set(InsNursingServiceType::getIconPath, insNursingServiceType.getIconPath());
        }
        if (insNursingServiceType.getCreateUser() != null) {
            chainWrapper.set(InsNursingServiceType::getCreateUser, insNursingServiceType.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingServiceType.getCreateName())) {
            chainWrapper.set(InsNursingServiceType::getCreateName, insNursingServiceType.getCreateName());
        }
        if (insNursingServiceType.getCreateDept() != null) {
            chainWrapper.set(InsNursingServiceType::getCreateDept, insNursingServiceType.getCreateDept());
        }
        if (insNursingServiceType.getCreateTime() != null) {
            chainWrapper.set(InsNursingServiceType::getCreateTime, insNursingServiceType.getCreateTime());
        }
        if (insNursingServiceType.getUpdateUser() != null) {
            chainWrapper.set(InsNursingServiceType::getUpdateUser, insNursingServiceType.getUpdateUser());
        }
        if (insNursingServiceType.getUpdateTime() != null) {
            chainWrapper.set(InsNursingServiceType::getUpdateTime, insNursingServiceType.getUpdateTime());
        }
        if (insNursingServiceType.getIsDeleted() != null) {
            chainWrapper.set(InsNursingServiceType::getIsDeleted, insNursingServiceType.getIsDeleted());
        }
        if (insNursingServiceType.getStatus() != null) {
            chainWrapper.set(InsNursingServiceType::getStatus, insNursingServiceType.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingServiceType::getId, insNursingServiceType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingServiceType.getId());
        } else {
            return insNursingServiceType;
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
    public boolean saveInsNursingServiceTypeBatch(List<InsNursingServiceType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingServiceType insNursingServiceType : insertList) {
            //使用默认的雪花算法生成
            insNursingServiceType.setId(null);
            //insNursingServiceType.setCreatedDt(currentDte);
            //insNursingServiceType.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingServiceTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingServiceType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


