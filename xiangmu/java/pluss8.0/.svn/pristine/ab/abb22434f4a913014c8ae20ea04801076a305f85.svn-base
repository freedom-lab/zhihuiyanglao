package cn.pluss.platform.service.marketUserCollection.impl;

import cn.pluss.platform.mapper.MarketUserCollectionMapper;
import cn.pluss.platform.model.entity.MarketUserCollection;
import cn.pluss.platform.service.marketUserCollection.MarketUserCollectionService;
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
@Service("marketUserCollectionService")
public class MarketUserCollectionServiceImpl extends ServiceImpl< MarketUserCollectionMapper, MarketUserCollection> implements MarketUserCollectionService {
    private static final Logger logger = LoggerFactory.getLogger(MarketUserCollectionServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketUserCollection> queryPage(Map map) {
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
    public MarketUserCollection queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketUserCollection 实例对象
    * @return 实例对象
    */
    @Override
    public MarketUserCollection queryOne(MarketUserCollection marketUserCollection){
        LambdaQueryWrapper<MarketUserCollection> queryWrapper = getQueryWrapper(marketUserCollection);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketUserCollection
    * @return
    */
    @Override
    public List<MarketUserCollection> queryList(MarketUserCollection marketUserCollection) {
        LambdaQueryWrapper<MarketUserCollection> queryWrapper = getQueryWrapper(marketUserCollection);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketUserCollection
    * @return
    */
    public static LambdaQueryWrapper<MarketUserCollection> getQueryWrapper(MarketUserCollection marketUserCollection){
        LambdaQueryWrapper<MarketUserCollection> queryWrapper = new LambdaQueryWrapper<>();
        if (marketUserCollection.getId() != null) {
            queryWrapper.eq(MarketUserCollection::getId, marketUserCollection.getId());
        }
        if (StringUtil.isNotEmpty(marketUserCollection.getTenantId())) {
            queryWrapper.eq(MarketUserCollection::getTenantId, marketUserCollection.getTenantId());
        }
        if (marketUserCollection.getGoodsId() != null) {
            queryWrapper.eq(MarketUserCollection::getGoodsId, marketUserCollection.getGoodsId());
        }
        if (marketUserCollection.getElderId() != null) {
            queryWrapper.eq(MarketUserCollection::getElderId, marketUserCollection.getElderId());
        }
        if (marketUserCollection.getCollectTime() != null) {
            queryWrapper.eq(MarketUserCollection::getCollectTime, marketUserCollection.getCollectTime());
        }
        if (StringUtil.isNotEmpty(marketUserCollection.getRemark())) {
            queryWrapper.eq(MarketUserCollection::getRemark, marketUserCollection.getRemark());
        }
        if (marketUserCollection.getCreateUser() != null) {
            queryWrapper.eq(MarketUserCollection::getCreateUser, marketUserCollection.getCreateUser());
        }
        if (marketUserCollection.getCreateDept() != null) {
            queryWrapper.eq(MarketUserCollection::getCreateDept, marketUserCollection.getCreateDept());
        }
        if (marketUserCollection.getCreateTime() != null) {
            queryWrapper.eq(MarketUserCollection::getCreateTime, marketUserCollection.getCreateTime());
        }
        if (marketUserCollection.getUpdateUser() != null) {
            queryWrapper.eq(MarketUserCollection::getUpdateUser, marketUserCollection.getUpdateUser());
        }
        if (marketUserCollection.getUpdateTime() != null) {
            queryWrapper.eq(MarketUserCollection::getUpdateTime, marketUserCollection.getUpdateTime());
        }
        if (marketUserCollection.getStatus() != null) {
            queryWrapper.eq(MarketUserCollection::getStatus, marketUserCollection.getStatus());
        }
        if (marketUserCollection.getIsDeleted() != null) {
            queryWrapper.eq(MarketUserCollection::getIsDeleted, marketUserCollection.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketUserCollection 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketUserCollection insert(MarketUserCollection marketUserCollection) {
        marketUserCollection.setId(null);
        getBaseMapper().insert(marketUserCollection);
        return marketUserCollection;
    }

    /**
    * 更新数据
    *
    * @param marketUserCollection 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketUserCollection update(MarketUserCollection marketUserCollection) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketUserCollection> chainWrapper = new LambdaUpdateChainWrapper<MarketUserCollection>(getBaseMapper());
        if (marketUserCollection.getId() != null) {
            chainWrapper.set(MarketUserCollection::getId, marketUserCollection.getId());
        }
        if (StringUtil.isNotBlank(marketUserCollection.getTenantId())) {
            chainWrapper.set(MarketUserCollection::getTenantId, marketUserCollection.getTenantId());
        }
        if (marketUserCollection.getGoodsId() != null) {
            chainWrapper.set(MarketUserCollection::getGoodsId, marketUserCollection.getGoodsId());
        }
        if (marketUserCollection.getElderId() != null) {
            chainWrapper.set(MarketUserCollection::getElderId, marketUserCollection.getElderId());
        }
        if (marketUserCollection.getCollectTime() != null) {
            chainWrapper.set(MarketUserCollection::getCollectTime, marketUserCollection.getCollectTime());
        }
        if (StringUtil.isNotBlank(marketUserCollection.getRemark())) {
            chainWrapper.set(MarketUserCollection::getRemark, marketUserCollection.getRemark());
        }
        if (marketUserCollection.getCreateUser() != null) {
            chainWrapper.set(MarketUserCollection::getCreateUser, marketUserCollection.getCreateUser());
        }
        if (marketUserCollection.getCreateDept() != null) {
            chainWrapper.set(MarketUserCollection::getCreateDept, marketUserCollection.getCreateDept());
        }
        if (marketUserCollection.getCreateTime() != null) {
            chainWrapper.set(MarketUserCollection::getCreateTime, marketUserCollection.getCreateTime());
        }
        if (marketUserCollection.getUpdateUser() != null) {
            chainWrapper.set(MarketUserCollection::getUpdateUser, marketUserCollection.getUpdateUser());
        }
        if (marketUserCollection.getUpdateTime() != null) {
            chainWrapper.set(MarketUserCollection::getUpdateTime, marketUserCollection.getUpdateTime());
        }
        if (marketUserCollection.getStatus() != null) {
            chainWrapper.set(MarketUserCollection::getStatus, marketUserCollection.getStatus());
        }
        if (marketUserCollection.getIsDeleted() != null) {
            chainWrapper.set(MarketUserCollection::getIsDeleted, marketUserCollection.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketUserCollection::getId, marketUserCollection.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketUserCollection.getId());
        } else {
            return marketUserCollection;
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
    public boolean saveMarketUserCollectionBatch(List<MarketUserCollection> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketUserCollection marketUserCollection : insertList) {
            //使用默认的雪花算法生成
            marketUserCollection.setId(null);
            //marketUserCollection.setCreatedDt(currentDte);
            //marketUserCollection.setUpdatedDt(currentDte);
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
    public Integer deleteMarketUserCollectionBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketUserCollection> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


