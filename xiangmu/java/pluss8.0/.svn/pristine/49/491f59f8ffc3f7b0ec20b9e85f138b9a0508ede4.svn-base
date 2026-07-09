package cn.pluss.platform.service.insLogisticsGoodsType.impl;

import cn.pluss.platform.mapper.InsLogisticsGoodsTypeMapper;
import cn.pluss.platform.model.entity.InsLogisticsGoodsType;
import cn.pluss.platform.service.insLogisticsGoodsType.InsLogisticsGoodsTypeService;
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
@Service("insLogisticsGoodsTypeService")
public class InsLogisticsGoodsTypeServiceImpl extends ServiceImpl< InsLogisticsGoodsTypeMapper, InsLogisticsGoodsType> implements InsLogisticsGoodsTypeService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsGoodsTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsGoodsType> queryPage(Map map) {
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
    public InsLogisticsGoodsType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsGoodsType 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsGoodsType queryOne(InsLogisticsGoodsType insLogisticsGoodsType){
        LambdaQueryWrapper<InsLogisticsGoodsType> queryWrapper = getQueryWrapper(insLogisticsGoodsType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsGoodsType
    * @return
    */
    @Override
    public List<InsLogisticsGoodsType> queryList(InsLogisticsGoodsType insLogisticsGoodsType) {
        LambdaQueryWrapper<InsLogisticsGoodsType> queryWrapper = getQueryWrapper(insLogisticsGoodsType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsGoodsType
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsGoodsType> getQueryWrapper(InsLogisticsGoodsType insLogisticsGoodsType){
        LambdaQueryWrapper<InsLogisticsGoodsType> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsGoodsType.getId() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getId, insLogisticsGoodsType.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsType.getTenantId())) {
            queryWrapper.eq(InsLogisticsGoodsType::getTenantId, insLogisticsGoodsType.getTenantId());
        }
        if (insLogisticsGoodsType.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getCorpId, insLogisticsGoodsType.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsType.getCorpName())) {
            queryWrapper.eq(InsLogisticsGoodsType::getCorpName, insLogisticsGoodsType.getCorpName());
        }
        if (insLogisticsGoodsType.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getInstitutionId, insLogisticsGoodsType.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsType.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsGoodsType::getInstitutionName, insLogisticsGoodsType.getInstitutionName());
        }
        if (insLogisticsGoodsType.getParentId() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getParentId, insLogisticsGoodsType.getParentId());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsType.getParentName())) {
            queryWrapper.eq(InsLogisticsGoodsType::getParentName, insLogisticsGoodsType.getParentName());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsType.getTypeName())) {
            queryWrapper.eq(InsLogisticsGoodsType::getTypeName, insLogisticsGoodsType.getTypeName());
        }
        if (insLogisticsGoodsType.getSort() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getSort, insLogisticsGoodsType.getSort());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsType.getRemark())) {
            queryWrapper.eq(InsLogisticsGoodsType::getRemark, insLogisticsGoodsType.getRemark());
        }
        if (insLogisticsGoodsType.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getCreateUser, insLogisticsGoodsType.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsType.getCreateName())) {
            queryWrapper.eq(InsLogisticsGoodsType::getCreateName, insLogisticsGoodsType.getCreateName());
        }
        if (insLogisticsGoodsType.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getCreateDept, insLogisticsGoodsType.getCreateDept());
        }
        if (insLogisticsGoodsType.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getCreateTime, insLogisticsGoodsType.getCreateTime());
        }
        if (insLogisticsGoodsType.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getUpdateUser, insLogisticsGoodsType.getUpdateUser());
        }
        if (insLogisticsGoodsType.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getUpdateTime, insLogisticsGoodsType.getUpdateTime());
        }
        if (insLogisticsGoodsType.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getIsDeleted, insLogisticsGoodsType.getIsDeleted());
        }
        if (insLogisticsGoodsType.getStatus() != null) {
            queryWrapper.eq(InsLogisticsGoodsType::getStatus, insLogisticsGoodsType.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsGoodsType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsGoodsType insert(InsLogisticsGoodsType insLogisticsGoodsType) {
        insLogisticsGoodsType.setId(null);
        getBaseMapper().insert(insLogisticsGoodsType);
        return insLogisticsGoodsType;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsGoodsType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsGoodsType update(InsLogisticsGoodsType insLogisticsGoodsType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsGoodsType> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsGoodsType>(getBaseMapper());
        if (insLogisticsGoodsType.getId() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getId, insLogisticsGoodsType.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsType.getTenantId())) {
            chainWrapper.set(InsLogisticsGoodsType::getTenantId, insLogisticsGoodsType.getTenantId());
        }
        if (insLogisticsGoodsType.getCorpId() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getCorpId, insLogisticsGoodsType.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsType.getCorpName())) {
            chainWrapper.set(InsLogisticsGoodsType::getCorpName, insLogisticsGoodsType.getCorpName());
        }
        if (insLogisticsGoodsType.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getInstitutionId, insLogisticsGoodsType.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsType.getInstitutionName())) {
            chainWrapper.set(InsLogisticsGoodsType::getInstitutionName, insLogisticsGoodsType.getInstitutionName());
        }
        if (insLogisticsGoodsType.getParentId() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getParentId, insLogisticsGoodsType.getParentId());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsType.getParentName())) {
            chainWrapper.set(InsLogisticsGoodsType::getParentName, insLogisticsGoodsType.getParentName());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsType.getTypeName())) {
            chainWrapper.set(InsLogisticsGoodsType::getTypeName, insLogisticsGoodsType.getTypeName());
        }
        if (insLogisticsGoodsType.getSort() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getSort, insLogisticsGoodsType.getSort());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsType.getRemark())) {
            chainWrapper.set(InsLogisticsGoodsType::getRemark, insLogisticsGoodsType.getRemark());
        }
        if (insLogisticsGoodsType.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getCreateUser, insLogisticsGoodsType.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsType.getCreateName())) {
            chainWrapper.set(InsLogisticsGoodsType::getCreateName, insLogisticsGoodsType.getCreateName());
        }
        if (insLogisticsGoodsType.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getCreateDept, insLogisticsGoodsType.getCreateDept());
        }
        if (insLogisticsGoodsType.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getCreateTime, insLogisticsGoodsType.getCreateTime());
        }
        if (insLogisticsGoodsType.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getUpdateUser, insLogisticsGoodsType.getUpdateUser());
        }
        if (insLogisticsGoodsType.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getUpdateTime, insLogisticsGoodsType.getUpdateTime());
        }
        if (insLogisticsGoodsType.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getIsDeleted, insLogisticsGoodsType.getIsDeleted());
        }
        if (insLogisticsGoodsType.getStatus() != null) {
            chainWrapper.set(InsLogisticsGoodsType::getStatus, insLogisticsGoodsType.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsGoodsType::getId, insLogisticsGoodsType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsGoodsType.getId());
        } else {
            return insLogisticsGoodsType;
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
    public boolean saveInsLogisticsGoodsTypeBatch(List<InsLogisticsGoodsType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsGoodsType insLogisticsGoodsType : insertList) {
            //使用默认的雪花算法生成
            insLogisticsGoodsType.setId(null);
            //insLogisticsGoodsType.setCreatedDt(currentDte);
            //insLogisticsGoodsType.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsGoodsTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsGoodsType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


