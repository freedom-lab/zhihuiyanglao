package cn.pluss.platform.service.marketPropCategory.impl;

import cn.pluss.platform.mapper.MarketPropCategoryMapper;
import cn.pluss.platform.model.entity.MarketPropCategory;
import cn.pluss.platform.service.marketPropCategory.MarketPropCategoryService;
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
@Service("marketPropCategoryService")
public class MarketPropCategoryServiceImpl extends ServiceImpl< MarketPropCategoryMapper, MarketPropCategory> implements MarketPropCategoryService {
    private static final Logger logger = LoggerFactory.getLogger(MarketPropCategoryServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketPropCategory> queryPage(Map map) {
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
    public MarketPropCategory queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketPropCategory 实例对象
    * @return 实例对象
    */
    @Override
    public MarketPropCategory queryOne(MarketPropCategory marketPropCategory){
        LambdaQueryWrapper<MarketPropCategory> queryWrapper = getQueryWrapper(marketPropCategory);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketPropCategory
    * @return
    */
    @Override
    public List<MarketPropCategory> queryList(MarketPropCategory marketPropCategory) {
        LambdaQueryWrapper<MarketPropCategory> queryWrapper = getQueryWrapper(marketPropCategory);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketPropCategory
    * @return
    */
    public static LambdaQueryWrapper<MarketPropCategory> getQueryWrapper(MarketPropCategory marketPropCategory){
        LambdaQueryWrapper<MarketPropCategory> queryWrapper = new LambdaQueryWrapper<>();
        if (marketPropCategory.getId() != null) {
            queryWrapper.eq(MarketPropCategory::getId, marketPropCategory.getId());
        }
        if (StringUtil.isNotEmpty(marketPropCategory.getCategoryType())) {
            queryWrapper.eq(MarketPropCategory::getCategoryType, marketPropCategory.getCategoryType());
        }
        if (StringUtil.isNotEmpty(marketPropCategory.getName())) {
            queryWrapper.eq(MarketPropCategory::getName, marketPropCategory.getName());
        }
        if (StringUtil.isNotEmpty(marketPropCategory.getTenantId())) {
            queryWrapper.eq(MarketPropCategory::getTenantId, marketPropCategory.getTenantId());
        }
        if (StringUtil.isNotEmpty(marketPropCategory.getRemark())) {
            queryWrapper.eq(MarketPropCategory::getRemark, marketPropCategory.getRemark());
        }
        if (marketPropCategory.getCreateUser() != null) {
            queryWrapper.eq(MarketPropCategory::getCreateUser, marketPropCategory.getCreateUser());
        }
        if (marketPropCategory.getCreateDept() != null) {
            queryWrapper.eq(MarketPropCategory::getCreateDept, marketPropCategory.getCreateDept());
        }
        if (marketPropCategory.getCreateTime() != null) {
            queryWrapper.eq(MarketPropCategory::getCreateTime, marketPropCategory.getCreateTime());
        }
        if (marketPropCategory.getUpdateUser() != null) {
            queryWrapper.eq(MarketPropCategory::getUpdateUser, marketPropCategory.getUpdateUser());
        }
        if (marketPropCategory.getUpdateTime() != null) {
            queryWrapper.eq(MarketPropCategory::getUpdateTime, marketPropCategory.getUpdateTime());
        }
        if (marketPropCategory.getStatus() != null) {
            queryWrapper.eq(MarketPropCategory::getStatus, marketPropCategory.getStatus());
        }
        if (marketPropCategory.getIsDeleted() != null) {
            queryWrapper.eq(MarketPropCategory::getIsDeleted, marketPropCategory.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketPropCategory 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketPropCategory insert(MarketPropCategory marketPropCategory) {
        marketPropCategory.setId(null);
        getBaseMapper().insert(marketPropCategory);
        return marketPropCategory;
    }

    /**
    * 更新数据
    *
    * @param marketPropCategory 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketPropCategory update(MarketPropCategory marketPropCategory) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketPropCategory> chainWrapper = new LambdaUpdateChainWrapper<MarketPropCategory>(getBaseMapper());
        if (marketPropCategory.getId() != null) {
            chainWrapper.set(MarketPropCategory::getId, marketPropCategory.getId());
        }
        if (StringUtil.isNotBlank(marketPropCategory.getCategoryType())) {
            chainWrapper.set(MarketPropCategory::getCategoryType, marketPropCategory.getCategoryType());
        }
        if (StringUtil.isNotBlank(marketPropCategory.getName())) {
            chainWrapper.set(MarketPropCategory::getName, marketPropCategory.getName());
        }
        if (StringUtil.isNotBlank(marketPropCategory.getTenantId())) {
            chainWrapper.set(MarketPropCategory::getTenantId, marketPropCategory.getTenantId());
        }
        if (StringUtil.isNotBlank(marketPropCategory.getRemark())) {
            chainWrapper.set(MarketPropCategory::getRemark, marketPropCategory.getRemark());
        }
        if (marketPropCategory.getCreateUser() != null) {
            chainWrapper.set(MarketPropCategory::getCreateUser, marketPropCategory.getCreateUser());
        }
        if (marketPropCategory.getCreateDept() != null) {
            chainWrapper.set(MarketPropCategory::getCreateDept, marketPropCategory.getCreateDept());
        }
        if (marketPropCategory.getCreateTime() != null) {
            chainWrapper.set(MarketPropCategory::getCreateTime, marketPropCategory.getCreateTime());
        }
        if (marketPropCategory.getUpdateUser() != null) {
            chainWrapper.set(MarketPropCategory::getUpdateUser, marketPropCategory.getUpdateUser());
        }
        if (marketPropCategory.getUpdateTime() != null) {
            chainWrapper.set(MarketPropCategory::getUpdateTime, marketPropCategory.getUpdateTime());
        }
        if (marketPropCategory.getStatus() != null) {
            chainWrapper.set(MarketPropCategory::getStatus, marketPropCategory.getStatus());
        }
        if (marketPropCategory.getIsDeleted() != null) {
            chainWrapper.set(MarketPropCategory::getIsDeleted, marketPropCategory.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketPropCategory::getId, marketPropCategory.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketPropCategory.getId());
        } else {
            return marketPropCategory;
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
    public boolean saveMarketPropCategoryBatch(List<MarketPropCategory> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketPropCategory marketPropCategory : insertList) {
            //使用默认的雪花算法生成
            marketPropCategory.setId(null);
            //marketPropCategory.setCreatedDt(currentDte);
            //marketPropCategory.setUpdatedDt(currentDte);
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
    public Integer deleteMarketPropCategoryBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketPropCategory> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


