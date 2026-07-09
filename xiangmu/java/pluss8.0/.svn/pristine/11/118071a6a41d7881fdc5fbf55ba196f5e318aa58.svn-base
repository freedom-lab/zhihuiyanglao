package cn.pluss.platform.service.marketGoodsProp.impl;

import cn.pluss.platform.mapper.MarketGoodsPropMapper;
import cn.pluss.platform.model.entity.MarketGoodsProp;
import cn.pluss.platform.service.marketGoodsProp.MarketGoodsPropService;
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
@Service("marketGoodsPropService")
public class MarketGoodsPropServiceImpl extends ServiceImpl< MarketGoodsPropMapper, MarketGoodsProp> implements MarketGoodsPropService {
    private static final Logger logger = LoggerFactory.getLogger(MarketGoodsPropServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketGoodsProp> queryPage(Map map) {
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
    public MarketGoodsProp queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsProp 实例对象
    * @return 实例对象
    */
    @Override
    public MarketGoodsProp queryOne(MarketGoodsProp marketGoodsProp){
        LambdaQueryWrapper<MarketGoodsProp> queryWrapper = getQueryWrapper(marketGoodsProp);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketGoodsProp
    * @return
    */
    @Override
    public List<MarketGoodsProp> queryList(MarketGoodsProp marketGoodsProp) {
        LambdaQueryWrapper<MarketGoodsProp> queryWrapper = getQueryWrapper(marketGoodsProp);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketGoodsProp
    * @return
    */
    public static LambdaQueryWrapper<MarketGoodsProp> getQueryWrapper(MarketGoodsProp marketGoodsProp){
        LambdaQueryWrapper<MarketGoodsProp> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtil.isNotEmpty(marketGoodsProp.getTenantId())) {
            queryWrapper.eq(MarketGoodsProp::getTenantId, marketGoodsProp.getTenantId());
        }
        if (marketGoodsProp.getId() != null) {
            queryWrapper.eq(MarketGoodsProp::getId, marketGoodsProp.getId());
        }
        if (marketGoodsProp.getGoodsId() != null) {
            queryWrapper.eq(MarketGoodsProp::getGoodsId, marketGoodsProp.getGoodsId());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getPropName())) {
            queryWrapper.eq(MarketGoodsProp::getPropName, marketGoodsProp.getPropName());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getPropValue())) {
            queryWrapper.eq(MarketGoodsProp::getPropValue, marketGoodsProp.getPropValue());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getRule())) {
            queryWrapper.eq(MarketGoodsProp::getRule, marketGoodsProp.getRule());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getRemark())) {
            queryWrapper.eq(MarketGoodsProp::getRemark, marketGoodsProp.getRemark());
        }
        if (marketGoodsProp.getCreateUser() != null) {
            queryWrapper.eq(MarketGoodsProp::getCreateUser, marketGoodsProp.getCreateUser());
        }
        if (marketGoodsProp.getCreateDept() != null) {
            queryWrapper.eq(MarketGoodsProp::getCreateDept, marketGoodsProp.getCreateDept());
        }
        if (marketGoodsProp.getCreateTime() != null) {
            queryWrapper.eq(MarketGoodsProp::getCreateTime, marketGoodsProp.getCreateTime());
        }
        if (marketGoodsProp.getUpdateUser() != null) {
            queryWrapper.eq(MarketGoodsProp::getUpdateUser, marketGoodsProp.getUpdateUser());
        }
        if (marketGoodsProp.getUpdateTime() != null) {
            queryWrapper.eq(MarketGoodsProp::getUpdateTime, marketGoodsProp.getUpdateTime());
        }
        if (marketGoodsProp.getStatus() != null) {
            queryWrapper.eq(MarketGoodsProp::getStatus, marketGoodsProp.getStatus());
        }
        if (marketGoodsProp.getIsDeleted() != null) {
            queryWrapper.eq(MarketGoodsProp::getIsDeleted, marketGoodsProp.getIsDeleted());
        }
        if (marketGoodsProp.getPropCategoryId() != null) {
            queryWrapper.eq(MarketGoodsProp::getPropCategoryId, marketGoodsProp.getPropCategoryId());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getSelectType())) {
            queryWrapper.eq(MarketGoodsProp::getSelectType, marketGoodsProp.getSelectType());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getInputType())) {
            queryWrapper.eq(MarketGoodsProp::getInputType, marketGoodsProp.getInputType());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getInputList())) {
            queryWrapper.eq(MarketGoodsProp::getInputList, marketGoodsProp.getInputList());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getFilterType())) {
            queryWrapper.eq(MarketGoodsProp::getFilterType, marketGoodsProp.getFilterType());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getSearchType())) {
            queryWrapper.eq(MarketGoodsProp::getSearchType, marketGoodsProp.getSearchType());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getRelatedStatus())) {
            queryWrapper.eq(MarketGoodsProp::getRelatedStatus, marketGoodsProp.getRelatedStatus());
        }
        if (StringUtil.isNotEmpty(marketGoodsProp.getHandAddStatus())) {
            queryWrapper.eq(MarketGoodsProp::getHandAddStatus, marketGoodsProp.getHandAddStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketGoodsProp 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsProp insert(MarketGoodsProp marketGoodsProp) {
        marketGoodsProp.setId(null);
        getBaseMapper().insert(marketGoodsProp);
        return marketGoodsProp;
    }

    /**
    * 更新数据
    *
    * @param marketGoodsProp 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsProp update(MarketGoodsProp marketGoodsProp) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketGoodsProp> chainWrapper = new LambdaUpdateChainWrapper<MarketGoodsProp>(getBaseMapper());
        if (StringUtil.isNotBlank(marketGoodsProp.getTenantId())) {
            chainWrapper.set(MarketGoodsProp::getTenantId, marketGoodsProp.getTenantId());
        }
        if (marketGoodsProp.getId() != null) {
            chainWrapper.set(MarketGoodsProp::getId, marketGoodsProp.getId());
        }
        if (marketGoodsProp.getGoodsId() != null) {
            chainWrapper.set(MarketGoodsProp::getGoodsId, marketGoodsProp.getGoodsId());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getPropName())) {
            chainWrapper.set(MarketGoodsProp::getPropName, marketGoodsProp.getPropName());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getPropValue())) {
            chainWrapper.set(MarketGoodsProp::getPropValue, marketGoodsProp.getPropValue());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getRule())) {
            chainWrapper.set(MarketGoodsProp::getRule, marketGoodsProp.getRule());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getRemark())) {
            chainWrapper.set(MarketGoodsProp::getRemark, marketGoodsProp.getRemark());
        }
        if (marketGoodsProp.getCreateUser() != null) {
            chainWrapper.set(MarketGoodsProp::getCreateUser, marketGoodsProp.getCreateUser());
        }
        if (marketGoodsProp.getCreateDept() != null) {
            chainWrapper.set(MarketGoodsProp::getCreateDept, marketGoodsProp.getCreateDept());
        }
        if (marketGoodsProp.getCreateTime() != null) {
            chainWrapper.set(MarketGoodsProp::getCreateTime, marketGoodsProp.getCreateTime());
        }
        if (marketGoodsProp.getUpdateUser() != null) {
            chainWrapper.set(MarketGoodsProp::getUpdateUser, marketGoodsProp.getUpdateUser());
        }
        if (marketGoodsProp.getUpdateTime() != null) {
            chainWrapper.set(MarketGoodsProp::getUpdateTime, marketGoodsProp.getUpdateTime());
        }
        if (marketGoodsProp.getStatus() != null) {
            chainWrapper.set(MarketGoodsProp::getStatus, marketGoodsProp.getStatus());
        }
        if (marketGoodsProp.getIsDeleted() != null) {
            chainWrapper.set(MarketGoodsProp::getIsDeleted, marketGoodsProp.getIsDeleted());
        }
        if (marketGoodsProp.getPropCategoryId() != null) {
            chainWrapper.set(MarketGoodsProp::getPropCategoryId, marketGoodsProp.getPropCategoryId());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getSelectType())) {
            chainWrapper.set(MarketGoodsProp::getSelectType, marketGoodsProp.getSelectType());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getInputType())) {
            chainWrapper.set(MarketGoodsProp::getInputType, marketGoodsProp.getInputType());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getInputList())) {
            chainWrapper.set(MarketGoodsProp::getInputList, marketGoodsProp.getInputList());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getFilterType())) {
            chainWrapper.set(MarketGoodsProp::getFilterType, marketGoodsProp.getFilterType());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getSearchType())) {
            chainWrapper.set(MarketGoodsProp::getSearchType, marketGoodsProp.getSearchType());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getRelatedStatus())) {
            chainWrapper.set(MarketGoodsProp::getRelatedStatus, marketGoodsProp.getRelatedStatus());
        }
        if (StringUtil.isNotBlank(marketGoodsProp.getHandAddStatus())) {
            chainWrapper.set(MarketGoodsProp::getHandAddStatus, marketGoodsProp.getHandAddStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketGoodsProp::getId, marketGoodsProp.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketGoodsProp.getId());
        } else {
            return marketGoodsProp;
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
    public boolean saveMarketGoodsPropBatch(List<MarketGoodsProp> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketGoodsProp marketGoodsProp : insertList) {
            //使用默认的雪花算法生成
            marketGoodsProp.setId(null);
            //marketGoodsProp.setCreatedDt(currentDte);
            //marketGoodsProp.setUpdatedDt(currentDte);
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
    public Integer deleteMarketGoodsPropBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketGoodsProp> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


