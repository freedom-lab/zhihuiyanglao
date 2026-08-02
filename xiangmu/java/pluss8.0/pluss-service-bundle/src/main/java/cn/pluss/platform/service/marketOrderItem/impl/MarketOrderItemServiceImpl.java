package cn.pluss.platform.service.marketOrderItem.impl;

import cn.pluss.platform.mapper.MarketOrderItemMapper;
import cn.pluss.platform.model.entity.MarketOrderItem;
import cn.pluss.platform.service.marketOrderItem.MarketOrderItemService;
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
@Service("marketOrderItemService")
public class MarketOrderItemServiceImpl extends ServiceImpl< MarketOrderItemMapper, MarketOrderItem> implements MarketOrderItemService {
    private static final Logger logger = LoggerFactory.getLogger(MarketOrderItemServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketOrderItem> queryPage(Map map) {
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
    public MarketOrderItem queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketOrderItem 实例对象
    * @return 实例对象
    */
    @Override
    public MarketOrderItem queryOne(MarketOrderItem marketOrderItem){
        LambdaQueryWrapper<MarketOrderItem> queryWrapper = getQueryWrapper(marketOrderItem);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketOrderItem
    * @return
    */
    @Override
    public List<MarketOrderItem> queryList(MarketOrderItem marketOrderItem) {
        LambdaQueryWrapper<MarketOrderItem> queryWrapper = getQueryWrapper(marketOrderItem);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketOrderItem
    * @return
    */
    public static LambdaQueryWrapper<MarketOrderItem> getQueryWrapper(MarketOrderItem marketOrderItem){
        LambdaQueryWrapper<MarketOrderItem> queryWrapper = new LambdaQueryWrapper<>();
        if (marketOrderItem.getId() != null) {
            queryWrapper.eq(MarketOrderItem::getId, marketOrderItem.getId());
        }
        if (StringUtil.isNotEmpty(marketOrderItem.getTenantId())) {
            queryWrapper.eq(MarketOrderItem::getTenantId, marketOrderItem.getTenantId());
        }
        if (StringUtil.isNotEmpty(marketOrderItem.getOrderCode())) {
            queryWrapper.eq(MarketOrderItem::getOrderCode, marketOrderItem.getOrderCode());
        }
        if (marketOrderItem.getOrderId() != null) {
            queryWrapper.eq(MarketOrderItem::getOrderId, marketOrderItem.getOrderId());
        }
        if (marketOrderItem.getGoodsId() != null) {
            queryWrapper.eq(MarketOrderItem::getGoodsId, marketOrderItem.getGoodsId());
        }
        if (marketOrderItem.getBigTypeId() != null) {
            queryWrapper.eq(MarketOrderItem::getBigTypeId, marketOrderItem.getBigTypeId());
        }
        if (StringUtil.isNotEmpty(marketOrderItem.getBigTypeName())) {
            queryWrapper.eq(MarketOrderItem::getBigTypeName, marketOrderItem.getBigTypeName());
        }
        if (marketOrderItem.getSkuId() != null) {
            queryWrapper.eq(MarketOrderItem::getSkuId, marketOrderItem.getSkuId());
        }
        if (marketOrderItem.getGoodsCount() != null) {
            queryWrapper.eq(MarketOrderItem::getGoodsCount, marketOrderItem.getGoodsCount());
        }
        if (StringUtil.isNotEmpty(marketOrderItem.getGoodsName())) {
            queryWrapper.eq(MarketOrderItem::getGoodsName, marketOrderItem.getGoodsName());
        }
        if (StringUtil.isNotEmpty(marketOrderItem.getSkuName())) {
            queryWrapper.eq(MarketOrderItem::getSkuName, marketOrderItem.getSkuName());
        }
        if (StringUtil.isNotEmpty(marketOrderItem.getPic())) {
            queryWrapper.eq(MarketOrderItem::getPic, marketOrderItem.getPic());
        }
        if (marketOrderItem.getPrice() != null) {
            queryWrapper.eq(MarketOrderItem::getPrice, marketOrderItem.getPrice());
        }
        if (marketOrderItem.getElderId() != null) {
            queryWrapper.eq(MarketOrderItem::getElderId, marketOrderItem.getElderId());
        }
        if (marketOrderItem.getTotalAmount() != null) {
            queryWrapper.eq(MarketOrderItem::getTotalAmount, marketOrderItem.getTotalAmount());
        }
        if (marketOrderItem.getBuyTime() != null) {
            queryWrapper.eq(MarketOrderItem::getBuyTime, marketOrderItem.getBuyTime());
        }
        if (StringUtil.isNotEmpty(marketOrderItem.getEvaluateState())) {
            queryWrapper.eq(MarketOrderItem::getEvaluateState, marketOrderItem.getEvaluateState());
        }
        if (StringUtil.isNotEmpty(marketOrderItem.getRemark())) {
            queryWrapper.eq(MarketOrderItem::getRemark, marketOrderItem.getRemark());
        }
        if (marketOrderItem.getCreateUser() != null) {
            queryWrapper.eq(MarketOrderItem::getCreateUser, marketOrderItem.getCreateUser());
        }
        if (marketOrderItem.getCreateDept() != null) {
            queryWrapper.eq(MarketOrderItem::getCreateDept, marketOrderItem.getCreateDept());
        }
        if (marketOrderItem.getCreateTime() != null) {
            queryWrapper.eq(MarketOrderItem::getCreateTime, marketOrderItem.getCreateTime());
        }
        if (marketOrderItem.getUpdateUser() != null) {
            queryWrapper.eq(MarketOrderItem::getUpdateUser, marketOrderItem.getUpdateUser());
        }
        if (marketOrderItem.getUpdateTime() != null) {
            queryWrapper.eq(MarketOrderItem::getUpdateTime, marketOrderItem.getUpdateTime());
        }
        if (marketOrderItem.getStatus() != null) {
            queryWrapper.eq(MarketOrderItem::getStatus, marketOrderItem.getStatus());
        }
        if (marketOrderItem.getIsDeleted() != null) {
            queryWrapper.eq(MarketOrderItem::getIsDeleted, marketOrderItem.getIsDeleted());
        }
        if (marketOrderItem.getCorpId() != null) {
            queryWrapper.eq(MarketOrderItem::getCorpId, marketOrderItem.getCorpId());
        }
        if (marketOrderItem.getInstitutionId() != null) {
            queryWrapper.eq(MarketOrderItem::getInstitutionId, marketOrderItem.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(marketOrderItem.getInstitutionName())) {
            queryWrapper.eq(MarketOrderItem::getInstitutionName, marketOrderItem.getInstitutionName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketOrderItem 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketOrderItem insert(MarketOrderItem marketOrderItem) {
        marketOrderItem.setId(null);
        getBaseMapper().insert(marketOrderItem);
        return marketOrderItem;
    }

    /**
    * 更新数据
    *
    * @param marketOrderItem 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketOrderItem update(MarketOrderItem marketOrderItem) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketOrderItem> chainWrapper = new LambdaUpdateChainWrapper<MarketOrderItem>(getBaseMapper());
        if (marketOrderItem.getId() != null) {
            chainWrapper.set(MarketOrderItem::getId, marketOrderItem.getId());
        }
        if (StringUtil.isNotBlank(marketOrderItem.getTenantId())) {
            chainWrapper.set(MarketOrderItem::getTenantId, marketOrderItem.getTenantId());
        }
        if (StringUtil.isNotBlank(marketOrderItem.getOrderCode())) {
            chainWrapper.set(MarketOrderItem::getOrderCode, marketOrderItem.getOrderCode());
        }
        if (marketOrderItem.getOrderId() != null) {
            chainWrapper.set(MarketOrderItem::getOrderId, marketOrderItem.getOrderId());
        }
        if (marketOrderItem.getGoodsId() != null) {
            chainWrapper.set(MarketOrderItem::getGoodsId, marketOrderItem.getGoodsId());
        }
        if (marketOrderItem.getBigTypeId() != null) {
            chainWrapper.set(MarketOrderItem::getBigTypeId, marketOrderItem.getBigTypeId());
        }
        if (StringUtil.isNotBlank(marketOrderItem.getBigTypeName())) {
            chainWrapper.set(MarketOrderItem::getBigTypeName, marketOrderItem.getBigTypeName());
        }
        if (marketOrderItem.getSkuId() != null) {
            chainWrapper.set(MarketOrderItem::getSkuId, marketOrderItem.getSkuId());
        }
        if (marketOrderItem.getGoodsCount() != null) {
            chainWrapper.set(MarketOrderItem::getGoodsCount, marketOrderItem.getGoodsCount());
        }
        if (StringUtil.isNotBlank(marketOrderItem.getGoodsName())) {
            chainWrapper.set(MarketOrderItem::getGoodsName, marketOrderItem.getGoodsName());
        }
        if (StringUtil.isNotBlank(marketOrderItem.getSkuName())) {
            chainWrapper.set(MarketOrderItem::getSkuName, marketOrderItem.getSkuName());
        }
        if (StringUtil.isNotBlank(marketOrderItem.getPic())) {
            chainWrapper.set(MarketOrderItem::getPic, marketOrderItem.getPic());
        }
        if (marketOrderItem.getPrice() != null) {
            chainWrapper.set(MarketOrderItem::getPrice, marketOrderItem.getPrice());
        }
        if (marketOrderItem.getElderId() != null) {
            chainWrapper.set(MarketOrderItem::getElderId, marketOrderItem.getElderId());
        }
        if (marketOrderItem.getTotalAmount() != null) {
            chainWrapper.set(MarketOrderItem::getTotalAmount, marketOrderItem.getTotalAmount());
        }
        if (marketOrderItem.getBuyTime() != null) {
            chainWrapper.set(MarketOrderItem::getBuyTime, marketOrderItem.getBuyTime());
        }
        if (StringUtil.isNotBlank(marketOrderItem.getEvaluateState())) {
            chainWrapper.set(MarketOrderItem::getEvaluateState, marketOrderItem.getEvaluateState());
        }
        if (StringUtil.isNotBlank(marketOrderItem.getRemark())) {
            chainWrapper.set(MarketOrderItem::getRemark, marketOrderItem.getRemark());
        }
        if (marketOrderItem.getCreateUser() != null) {
            chainWrapper.set(MarketOrderItem::getCreateUser, marketOrderItem.getCreateUser());
        }
        if (marketOrderItem.getCreateDept() != null) {
            chainWrapper.set(MarketOrderItem::getCreateDept, marketOrderItem.getCreateDept());
        }
        if (marketOrderItem.getCreateTime() != null) {
            chainWrapper.set(MarketOrderItem::getCreateTime, marketOrderItem.getCreateTime());
        }
        if (marketOrderItem.getUpdateUser() != null) {
            chainWrapper.set(MarketOrderItem::getUpdateUser, marketOrderItem.getUpdateUser());
        }
        if (marketOrderItem.getUpdateTime() != null) {
            chainWrapper.set(MarketOrderItem::getUpdateTime, marketOrderItem.getUpdateTime());
        }
        if (marketOrderItem.getStatus() != null) {
            chainWrapper.set(MarketOrderItem::getStatus, marketOrderItem.getStatus());
        }
        if (marketOrderItem.getIsDeleted() != null) {
            chainWrapper.set(MarketOrderItem::getIsDeleted, marketOrderItem.getIsDeleted());
        }
        if (marketOrderItem.getCorpId() != null) {
            chainWrapper.set(MarketOrderItem::getCorpId, marketOrderItem.getCorpId());
        }
        if (marketOrderItem.getInstitutionId() != null) {
            chainWrapper.set(MarketOrderItem::getInstitutionId, marketOrderItem.getInstitutionId());
        }
        if (StringUtil.isNotBlank(marketOrderItem.getInstitutionName())) {
            chainWrapper.set(MarketOrderItem::getInstitutionName, marketOrderItem.getInstitutionName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketOrderItem::getId, marketOrderItem.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketOrderItem.getId());
        } else {
            return marketOrderItem;
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
    public boolean saveMarketOrderItemBatch(List<MarketOrderItem> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketOrderItem marketOrderItem : insertList) {
            //使用默认的雪花算法生成
            marketOrderItem.setId(null);
            //marketOrderItem.setCreatedDt(currentDte);
            //marketOrderItem.setUpdatedDt(currentDte);
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
    public Integer deleteMarketOrderItemBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketOrderItem> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


