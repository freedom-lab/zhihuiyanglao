package cn.pluss.platform.service.marketGoodsSku.impl;

import cn.pluss.platform.mapper.MarketGoodsSkuMapper;
import cn.pluss.platform.model.entity.MarketGoodsSku;
import cn.pluss.platform.service.marketGoodsSku.MarketGoodsSkuService;
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
@Service("marketGoodsSkuService")
public class MarketGoodsSkuServiceImpl extends ServiceImpl< MarketGoodsSkuMapper, MarketGoodsSku> implements MarketGoodsSkuService {
    private static final Logger logger = LoggerFactory.getLogger(MarketGoodsSkuServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketGoodsSku> queryPage(Map map) {
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
    public MarketGoodsSku queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsSku 实例对象
    * @return 实例对象
    */
    @Override
    public MarketGoodsSku queryOne(MarketGoodsSku marketGoodsSku){
        LambdaQueryWrapper<MarketGoodsSku> queryWrapper = getQueryWrapper(marketGoodsSku);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketGoodsSku
    * @return
    */
    @Override
    public List<MarketGoodsSku> queryList(MarketGoodsSku marketGoodsSku) {
        LambdaQueryWrapper<MarketGoodsSku> queryWrapper = getQueryWrapper(marketGoodsSku);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketGoodsSku
    * @return
    */
    public static LambdaQueryWrapper<MarketGoodsSku> getQueryWrapper(MarketGoodsSku marketGoodsSku){
        LambdaQueryWrapper<MarketGoodsSku> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtil.isNotEmpty(marketGoodsSku.getTenantId())) {
            queryWrapper.eq(MarketGoodsSku::getTenantId, marketGoodsSku.getTenantId());
        }
        if (marketGoodsSku.getId() != null) {
            queryWrapper.eq(MarketGoodsSku::getId, marketGoodsSku.getId());
        }
        if (marketGoodsSku.getGoodsId() != null) {
            queryWrapper.eq(MarketGoodsSku::getGoodsId, marketGoodsSku.getGoodsId());
        }
        if (StringUtil.isNotEmpty(marketGoodsSku.getProperties())) {
            queryWrapper.eq(MarketGoodsSku::getProperties, marketGoodsSku.getProperties());
        }
        if (marketGoodsSku.getOriginalPrice() != null) {
            queryWrapper.eq(MarketGoodsSku::getOriginalPrice, marketGoodsSku.getOriginalPrice());
        }
        if (marketGoodsSku.getPrice() != null) {
            queryWrapper.eq(MarketGoodsSku::getPrice, marketGoodsSku.getPrice());
        }
        if (marketGoodsSku.getStartSalesVolume() != null) {
            queryWrapper.eq(MarketGoodsSku::getStartSalesVolume, marketGoodsSku.getStartSalesVolume());
        }
        if (marketGoodsSku.getStock() != null) {
            queryWrapper.eq(MarketGoodsSku::getStock, marketGoodsSku.getStock());
        }
        if (marketGoodsSku.getActualStock() != null) {
            queryWrapper.eq(MarketGoodsSku::getActualStock, marketGoodsSku.getActualStock());
        }
        if (marketGoodsSku.getAlarmStock() != null) {
            queryWrapper.eq(MarketGoodsSku::getAlarmStock, marketGoodsSku.getAlarmStock());
        }
        if (StringUtil.isNotEmpty(marketGoodsSku.getBarCode())) {
            queryWrapper.eq(MarketGoodsSku::getBarCode, marketGoodsSku.getBarCode());
        }
        if (StringUtil.isNotEmpty(marketGoodsSku.getPic())) {
            queryWrapper.eq(MarketGoodsSku::getPic, marketGoodsSku.getPic());
        }
        if (StringUtil.isNotEmpty(marketGoodsSku.getSkuName())) {
            queryWrapper.eq(MarketGoodsSku::getSkuName, marketGoodsSku.getSkuName());
        }
        if (StringUtil.isNotEmpty(marketGoodsSku.getGoodsName())) {
            queryWrapper.eq(MarketGoodsSku::getGoodsName, marketGoodsSku.getGoodsName());
        }
        if (StringUtil.isNotEmpty(marketGoodsSku.getWeight())) {
            queryWrapper.eq(MarketGoodsSku::getWeight, marketGoodsSku.getWeight());
        }
        if (StringUtil.isNotEmpty(marketGoodsSku.getVolume())) {
            queryWrapper.eq(MarketGoodsSku::getVolume, marketGoodsSku.getVolume());
        }
        if (marketGoodsSku.getServerHour() != null) {
            queryWrapper.eq(MarketGoodsSku::getServerHour, marketGoodsSku.getServerHour());
        }
        if (StringUtil.isNotEmpty(marketGoodsSku.getRemark())) {
            queryWrapper.eq(MarketGoodsSku::getRemark, marketGoodsSku.getRemark());
        }
        if (marketGoodsSku.getCreateUser() != null) {
            queryWrapper.eq(MarketGoodsSku::getCreateUser, marketGoodsSku.getCreateUser());
        }
        if (marketGoodsSku.getCreateDept() != null) {
            queryWrapper.eq(MarketGoodsSku::getCreateDept, marketGoodsSku.getCreateDept());
        }
        if (marketGoodsSku.getCreateTime() != null) {
            queryWrapper.eq(MarketGoodsSku::getCreateTime, marketGoodsSku.getCreateTime());
        }
        if (marketGoodsSku.getUpdateUser() != null) {
            queryWrapper.eq(MarketGoodsSku::getUpdateUser, marketGoodsSku.getUpdateUser());
        }
        if (marketGoodsSku.getUpdateTime() != null) {
            queryWrapper.eq(MarketGoodsSku::getUpdateTime, marketGoodsSku.getUpdateTime());
        }
        if (marketGoodsSku.getStatus() != null) {
            queryWrapper.eq(MarketGoodsSku::getStatus, marketGoodsSku.getStatus());
        }
        if (marketGoodsSku.getIsDeleted() != null) {
            queryWrapper.eq(MarketGoodsSku::getIsDeleted, marketGoodsSku.getIsDeleted());
        }
        if (marketGoodsSku.getCorpId() != null) {
            queryWrapper.eq(MarketGoodsSku::getCorpId, marketGoodsSku.getCorpId());
        }
        if (marketGoodsSku.getInstitutionId() != null) {
            queryWrapper.eq(MarketGoodsSku::getInstitutionId, marketGoodsSku.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(marketGoodsSku.getInstitutionName())) {
            queryWrapper.eq(MarketGoodsSku::getInstitutionName, marketGoodsSku.getInstitutionName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketGoodsSku 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsSku insert(MarketGoodsSku marketGoodsSku) {
        marketGoodsSku.setId(null);
        getBaseMapper().insert(marketGoodsSku);
        return marketGoodsSku;
    }

    /**
    * 更新数据
    *
    * @param marketGoodsSku 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsSku update(MarketGoodsSku marketGoodsSku) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketGoodsSku> chainWrapper = new LambdaUpdateChainWrapper<MarketGoodsSku>(getBaseMapper());
        if (StringUtil.isNotBlank(marketGoodsSku.getTenantId())) {
            chainWrapper.set(MarketGoodsSku::getTenantId, marketGoodsSku.getTenantId());
        }
        if (marketGoodsSku.getId() != null) {
            chainWrapper.set(MarketGoodsSku::getId, marketGoodsSku.getId());
        }
        if (marketGoodsSku.getGoodsId() != null) {
            chainWrapper.set(MarketGoodsSku::getGoodsId, marketGoodsSku.getGoodsId());
        }
        if (StringUtil.isNotBlank(marketGoodsSku.getProperties())) {
            chainWrapper.set(MarketGoodsSku::getProperties, marketGoodsSku.getProperties());
        }
        if (marketGoodsSku.getOriginalPrice() != null) {
            chainWrapper.set(MarketGoodsSku::getOriginalPrice, marketGoodsSku.getOriginalPrice());
        }
        if (marketGoodsSku.getPrice() != null) {
            chainWrapper.set(MarketGoodsSku::getPrice, marketGoodsSku.getPrice());
        }
        if (marketGoodsSku.getStartSalesVolume() != null) {
            chainWrapper.set(MarketGoodsSku::getStartSalesVolume, marketGoodsSku.getStartSalesVolume());
        }
        if (marketGoodsSku.getStock() != null) {
            chainWrapper.set(MarketGoodsSku::getStock, marketGoodsSku.getStock());
        }
        if (marketGoodsSku.getActualStock() != null) {
            chainWrapper.set(MarketGoodsSku::getActualStock, marketGoodsSku.getActualStock());
        }
        if (marketGoodsSku.getAlarmStock() != null) {
            chainWrapper.set(MarketGoodsSku::getAlarmStock, marketGoodsSku.getAlarmStock());
        }
        if (StringUtil.isNotBlank(marketGoodsSku.getBarCode())) {
            chainWrapper.set(MarketGoodsSku::getBarCode, marketGoodsSku.getBarCode());
        }
        if (StringUtil.isNotBlank(marketGoodsSku.getPic())) {
            chainWrapper.set(MarketGoodsSku::getPic, marketGoodsSku.getPic());
        }
        if (StringUtil.isNotBlank(marketGoodsSku.getSkuName())) {
            chainWrapper.set(MarketGoodsSku::getSkuName, marketGoodsSku.getSkuName());
        }
        if (StringUtil.isNotBlank(marketGoodsSku.getGoodsName())) {
            chainWrapper.set(MarketGoodsSku::getGoodsName, marketGoodsSku.getGoodsName());
        }
        if (StringUtil.isNotBlank(marketGoodsSku.getWeight())) {
            chainWrapper.set(MarketGoodsSku::getWeight, marketGoodsSku.getWeight());
        }
        if (StringUtil.isNotBlank(marketGoodsSku.getVolume())) {
            chainWrapper.set(MarketGoodsSku::getVolume, marketGoodsSku.getVolume());
        }
        if (marketGoodsSku.getServerHour() != null) {
            chainWrapper.set(MarketGoodsSku::getServerHour, marketGoodsSku.getServerHour());
        }
        if (StringUtil.isNotBlank(marketGoodsSku.getRemark())) {
            chainWrapper.set(MarketGoodsSku::getRemark, marketGoodsSku.getRemark());
        }
        if (marketGoodsSku.getCreateUser() != null) {
            chainWrapper.set(MarketGoodsSku::getCreateUser, marketGoodsSku.getCreateUser());
        }
        if (marketGoodsSku.getCreateDept() != null) {
            chainWrapper.set(MarketGoodsSku::getCreateDept, marketGoodsSku.getCreateDept());
        }
        if (marketGoodsSku.getCreateTime() != null) {
            chainWrapper.set(MarketGoodsSku::getCreateTime, marketGoodsSku.getCreateTime());
        }
        if (marketGoodsSku.getUpdateUser() != null) {
            chainWrapper.set(MarketGoodsSku::getUpdateUser, marketGoodsSku.getUpdateUser());
        }
        if (marketGoodsSku.getUpdateTime() != null) {
            chainWrapper.set(MarketGoodsSku::getUpdateTime, marketGoodsSku.getUpdateTime());
        }
        if (marketGoodsSku.getStatus() != null) {
            chainWrapper.set(MarketGoodsSku::getStatus, marketGoodsSku.getStatus());
        }
        if (marketGoodsSku.getIsDeleted() != null) {
            chainWrapper.set(MarketGoodsSku::getIsDeleted, marketGoodsSku.getIsDeleted());
        }
        if (marketGoodsSku.getCorpId() != null) {
            chainWrapper.set(MarketGoodsSku::getCorpId, marketGoodsSku.getCorpId());
        }
        if (marketGoodsSku.getInstitutionId() != null) {
            chainWrapper.set(MarketGoodsSku::getInstitutionId, marketGoodsSku.getInstitutionId());
        }
        if (StringUtil.isNotBlank(marketGoodsSku.getInstitutionName())) {
            chainWrapper.set(MarketGoodsSku::getInstitutionName, marketGoodsSku.getInstitutionName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketGoodsSku::getId, marketGoodsSku.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketGoodsSku.getId());
        } else {
            return marketGoodsSku;
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
    public boolean saveMarketGoodsSkuBatch(List<MarketGoodsSku> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketGoodsSku marketGoodsSku : insertList) {
            //使用默认的雪花算法生成
            marketGoodsSku.setId(null);
            //marketGoodsSku.setCreatedDt(currentDte);
            //marketGoodsSku.setUpdatedDt(currentDte);
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
    public Integer deleteMarketGoodsSkuBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketGoodsSku> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


