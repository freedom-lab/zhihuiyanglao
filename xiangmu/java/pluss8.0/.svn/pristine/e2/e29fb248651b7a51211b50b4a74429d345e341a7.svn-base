package cn.pluss.platform.service.insCanteenFoodCategory.impl;

import cn.pluss.platform.mapper.InsCanteenFoodCategoryMapper;
import cn.pluss.platform.model.entity.InsCanteenFoodCategory;
import cn.pluss.platform.service.insCanteenFoodCategory.InsCanteenFoodCategoryService;
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
@Service("insCanteenFoodCategoryService")
public class InsCanteenFoodCategoryServiceImpl extends ServiceImpl< InsCanteenFoodCategoryMapper, InsCanteenFoodCategory> implements InsCanteenFoodCategoryService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenFoodCategoryServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenFoodCategory> queryPage(Map map) {
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
    public InsCanteenFoodCategory queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodCategory 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenFoodCategory queryOne(InsCanteenFoodCategory insCanteenFoodCategory){
        LambdaQueryWrapper<InsCanteenFoodCategory> queryWrapper = getQueryWrapper(insCanteenFoodCategory);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenFoodCategory
    * @return
    */
    @Override
    public List<InsCanteenFoodCategory> queryList(InsCanteenFoodCategory insCanteenFoodCategory) {
        LambdaQueryWrapper<InsCanteenFoodCategory> queryWrapper = getQueryWrapper(insCanteenFoodCategory);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenFoodCategory
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenFoodCategory> getQueryWrapper(InsCanteenFoodCategory insCanteenFoodCategory){
        LambdaQueryWrapper<InsCanteenFoodCategory> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenFoodCategory.getId() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getId, insCanteenFoodCategory.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodCategory.getTenantId())) {
            queryWrapper.eq(InsCanteenFoodCategory::getTenantId, insCanteenFoodCategory.getTenantId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodCategory.getCateName())) {
            queryWrapper.eq(InsCanteenFoodCategory::getCateName, insCanteenFoodCategory.getCateName());
        }
        if (insCanteenFoodCategory.getParentId() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getParentId, insCanteenFoodCategory.getParentId());
        }
        if (insCanteenFoodCategory.getLevel() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getLevel, insCanteenFoodCategory.getLevel());
        }
        if (insCanteenFoodCategory.getSortNum() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getSortNum, insCanteenFoodCategory.getSortNum());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodCategory.getRemark())) {
            queryWrapper.eq(InsCanteenFoodCategory::getRemark, insCanteenFoodCategory.getRemark());
        }
        if (insCanteenFoodCategory.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getCreateUser, insCanteenFoodCategory.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodCategory.getCreateName())) {
            queryWrapper.eq(InsCanteenFoodCategory::getCreateName, insCanteenFoodCategory.getCreateName());
        }
        if (insCanteenFoodCategory.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getCreateDept, insCanteenFoodCategory.getCreateDept());
        }
        if (insCanteenFoodCategory.getCreateDt() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getCreateDt, insCanteenFoodCategory.getCreateDt());
        }
        if (insCanteenFoodCategory.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getUpdateUser, insCanteenFoodCategory.getUpdateUser());
        }
        if (insCanteenFoodCategory.getUpdateDt() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getUpdateDt, insCanteenFoodCategory.getUpdateDt());
        }
        if (insCanteenFoodCategory.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getIsDeleted, insCanteenFoodCategory.getIsDeleted());
        }
        if (insCanteenFoodCategory.getStatus() != null) {
            queryWrapper.eq(InsCanteenFoodCategory::getStatus, insCanteenFoodCategory.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenFoodCategory 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodCategory insert(InsCanteenFoodCategory insCanteenFoodCategory) {
        insCanteenFoodCategory.setId(null);
        getBaseMapper().insert(insCanteenFoodCategory);
        return insCanteenFoodCategory;
    }

    /**
    * 更新数据
    *
    * @param insCanteenFoodCategory 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodCategory update(InsCanteenFoodCategory insCanteenFoodCategory) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenFoodCategory> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenFoodCategory>(getBaseMapper());
        if (insCanteenFoodCategory.getId() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getId, insCanteenFoodCategory.getId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodCategory.getTenantId())) {
            chainWrapper.set(InsCanteenFoodCategory::getTenantId, insCanteenFoodCategory.getTenantId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodCategory.getCateName())) {
            chainWrapper.set(InsCanteenFoodCategory::getCateName, insCanteenFoodCategory.getCateName());
        }
        if (insCanteenFoodCategory.getParentId() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getParentId, insCanteenFoodCategory.getParentId());
        }
        if (insCanteenFoodCategory.getLevel() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getLevel, insCanteenFoodCategory.getLevel());
        }
        if (insCanteenFoodCategory.getSortNum() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getSortNum, insCanteenFoodCategory.getSortNum());
        }
        if (StringUtil.isNotBlank(insCanteenFoodCategory.getRemark())) {
            chainWrapper.set(InsCanteenFoodCategory::getRemark, insCanteenFoodCategory.getRemark());
        }
        if (insCanteenFoodCategory.getCreateUser() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getCreateUser, insCanteenFoodCategory.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenFoodCategory.getCreateName())) {
            chainWrapper.set(InsCanteenFoodCategory::getCreateName, insCanteenFoodCategory.getCreateName());
        }
        if (insCanteenFoodCategory.getCreateDept() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getCreateDept, insCanteenFoodCategory.getCreateDept());
        }
        if (insCanteenFoodCategory.getCreateDt() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getCreateDt, insCanteenFoodCategory.getCreateDt());
        }
        if (insCanteenFoodCategory.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getUpdateUser, insCanteenFoodCategory.getUpdateUser());
        }
        if (insCanteenFoodCategory.getUpdateDt() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getUpdateDt, insCanteenFoodCategory.getUpdateDt());
        }
        if (insCanteenFoodCategory.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getIsDeleted, insCanteenFoodCategory.getIsDeleted());
        }
        if (insCanteenFoodCategory.getStatus() != null) {
            chainWrapper.set(InsCanteenFoodCategory::getStatus, insCanteenFoodCategory.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenFoodCategory::getId, insCanteenFoodCategory.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenFoodCategory.getId());
        } else {
            return insCanteenFoodCategory;
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
    public boolean saveInsCanteenFoodCategoryBatch(List<InsCanteenFoodCategory> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenFoodCategory insCanteenFoodCategory : insertList) {
            //使用默认的雪花算法生成
            insCanteenFoodCategory.setId(null);
            //insCanteenFoodCategory.setCreatedDt(currentDte);
            //insCanteenFoodCategory.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenFoodCategoryBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenFoodCategory> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


