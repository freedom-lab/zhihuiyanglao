package cn.pluss.platform.service.marketGoodsAttributeValue.impl;

import cn.pluss.platform.mapper.MarketGoodsAttributeValueMapper;
import cn.pluss.platform.model.entity.MarketGoodsAttributeValue;
import cn.pluss.platform.service.marketGoodsAttributeValue.MarketGoodsAttributeValueService;
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
@Service("marketGoodsAttributeValueService")
public class MarketGoodsAttributeValueServiceImpl extends ServiceImpl< MarketGoodsAttributeValueMapper, MarketGoodsAttributeValue> implements MarketGoodsAttributeValueService {
    private static final Logger logger = LoggerFactory.getLogger(MarketGoodsAttributeValueServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketGoodsAttributeValue> queryPage(Map map) {
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
    public MarketGoodsAttributeValue queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsAttributeValue 实例对象
    * @return 实例对象
    */
    @Override
    public MarketGoodsAttributeValue queryOne(MarketGoodsAttributeValue marketGoodsAttributeValue){
        LambdaQueryWrapper<MarketGoodsAttributeValue> queryWrapper = getQueryWrapper(marketGoodsAttributeValue);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketGoodsAttributeValue
    * @return
    */
    @Override
    public List<MarketGoodsAttributeValue> queryList(MarketGoodsAttributeValue marketGoodsAttributeValue) {
        LambdaQueryWrapper<MarketGoodsAttributeValue> queryWrapper = getQueryWrapper(marketGoodsAttributeValue);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketGoodsAttributeValue
    * @return
    */
    public static LambdaQueryWrapper<MarketGoodsAttributeValue> getQueryWrapper(MarketGoodsAttributeValue marketGoodsAttributeValue){
        LambdaQueryWrapper<MarketGoodsAttributeValue> queryWrapper = new LambdaQueryWrapper<>();
        if (marketGoodsAttributeValue.getId() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getId, marketGoodsAttributeValue.getId());
        }
        if (StringUtil.isNotEmpty(marketGoodsAttributeValue.getTenantId())) {
            queryWrapper.eq(MarketGoodsAttributeValue::getTenantId, marketGoodsAttributeValue.getTenantId());
        }
        if (marketGoodsAttributeValue.getGoodsId() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getGoodsId, marketGoodsAttributeValue.getGoodsId());
        }
        if (marketGoodsAttributeValue.getGoodsPropId() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getGoodsPropId, marketGoodsAttributeValue.getGoodsPropId());
        }
        if (StringUtil.isNotEmpty(marketGoodsAttributeValue.getValue())) {
            queryWrapper.eq(MarketGoodsAttributeValue::getValue, marketGoodsAttributeValue.getValue());
        }
        if (StringUtil.isNotEmpty(marketGoodsAttributeValue.getRemark())) {
            queryWrapper.eq(MarketGoodsAttributeValue::getRemark, marketGoodsAttributeValue.getRemark());
        }
        if (marketGoodsAttributeValue.getCreateUser() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getCreateUser, marketGoodsAttributeValue.getCreateUser());
        }
        if (marketGoodsAttributeValue.getCreateDept() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getCreateDept, marketGoodsAttributeValue.getCreateDept());
        }
        if (marketGoodsAttributeValue.getCreateTime() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getCreateTime, marketGoodsAttributeValue.getCreateTime());
        }
        if (marketGoodsAttributeValue.getUpdateUser() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getUpdateUser, marketGoodsAttributeValue.getUpdateUser());
        }
        if (marketGoodsAttributeValue.getUpdateTime() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getUpdateTime, marketGoodsAttributeValue.getUpdateTime());
        }
        if (marketGoodsAttributeValue.getStatus() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getStatus, marketGoodsAttributeValue.getStatus());
        }
        if (marketGoodsAttributeValue.getIsDeleted() != null) {
            queryWrapper.eq(MarketGoodsAttributeValue::getIsDeleted, marketGoodsAttributeValue.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketGoodsAttributeValue 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsAttributeValue insert(MarketGoodsAttributeValue marketGoodsAttributeValue) {
        marketGoodsAttributeValue.setId(null);
        getBaseMapper().insert(marketGoodsAttributeValue);
        return marketGoodsAttributeValue;
    }

    /**
    * 更新数据
    *
    * @param marketGoodsAttributeValue 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsAttributeValue update(MarketGoodsAttributeValue marketGoodsAttributeValue) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketGoodsAttributeValue> chainWrapper = new LambdaUpdateChainWrapper<MarketGoodsAttributeValue>(getBaseMapper());
        if (marketGoodsAttributeValue.getId() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getId, marketGoodsAttributeValue.getId());
        }
        if (StringUtil.isNotBlank(marketGoodsAttributeValue.getTenantId())) {
            chainWrapper.set(MarketGoodsAttributeValue::getTenantId, marketGoodsAttributeValue.getTenantId());
        }
        if (marketGoodsAttributeValue.getGoodsId() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getGoodsId, marketGoodsAttributeValue.getGoodsId());
        }
        if (marketGoodsAttributeValue.getGoodsPropId() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getGoodsPropId, marketGoodsAttributeValue.getGoodsPropId());
        }
        if (StringUtil.isNotBlank(marketGoodsAttributeValue.getValue())) {
            chainWrapper.set(MarketGoodsAttributeValue::getValue, marketGoodsAttributeValue.getValue());
        }
        if (StringUtil.isNotBlank(marketGoodsAttributeValue.getRemark())) {
            chainWrapper.set(MarketGoodsAttributeValue::getRemark, marketGoodsAttributeValue.getRemark());
        }
        if (marketGoodsAttributeValue.getCreateUser() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getCreateUser, marketGoodsAttributeValue.getCreateUser());
        }
        if (marketGoodsAttributeValue.getCreateDept() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getCreateDept, marketGoodsAttributeValue.getCreateDept());
        }
        if (marketGoodsAttributeValue.getCreateTime() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getCreateTime, marketGoodsAttributeValue.getCreateTime());
        }
        if (marketGoodsAttributeValue.getUpdateUser() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getUpdateUser, marketGoodsAttributeValue.getUpdateUser());
        }
        if (marketGoodsAttributeValue.getUpdateTime() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getUpdateTime, marketGoodsAttributeValue.getUpdateTime());
        }
        if (marketGoodsAttributeValue.getStatus() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getStatus, marketGoodsAttributeValue.getStatus());
        }
        if (marketGoodsAttributeValue.getIsDeleted() != null) {
            chainWrapper.set(MarketGoodsAttributeValue::getIsDeleted, marketGoodsAttributeValue.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketGoodsAttributeValue::getId, marketGoodsAttributeValue.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketGoodsAttributeValue.getId());
        } else {
            return marketGoodsAttributeValue;
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
    public boolean saveMarketGoodsAttributeValueBatch(List<MarketGoodsAttributeValue> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketGoodsAttributeValue marketGoodsAttributeValue : insertList) {
            //使用默认的雪花算法生成
            marketGoodsAttributeValue.setId(null);
            //marketGoodsAttributeValue.setCreatedDt(currentDte);
            //marketGoodsAttributeValue.setUpdatedDt(currentDte);
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
    public Integer deleteMarketGoodsAttributeValueBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketGoodsAttributeValue> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


