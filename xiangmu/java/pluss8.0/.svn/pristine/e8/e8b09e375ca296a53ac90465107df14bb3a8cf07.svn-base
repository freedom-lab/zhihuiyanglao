package cn.pluss.platform.service.marketGoodsUnit.impl;

import cn.pluss.platform.mapper.MarketGoodsUnitMapper;
import cn.pluss.platform.model.entity.MarketGoodsUnit;
import cn.pluss.platform.service.marketGoodsUnit.MarketGoodsUnitService;
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
@Service("marketGoodsUnitService")
public class MarketGoodsUnitServiceImpl extends ServiceImpl< MarketGoodsUnitMapper, MarketGoodsUnit> implements MarketGoodsUnitService {
    private static final Logger logger = LoggerFactory.getLogger(MarketGoodsUnitServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketGoodsUnit> queryPage(Map map) {
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
    public MarketGoodsUnit queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsUnit 实例对象
    * @return 实例对象
    */
    @Override
    public MarketGoodsUnit queryOne(MarketGoodsUnit marketGoodsUnit){
        LambdaQueryWrapper<MarketGoodsUnit> queryWrapper = getQueryWrapper(marketGoodsUnit);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketGoodsUnit
    * @return
    */
    @Override
    public List<MarketGoodsUnit> queryList(MarketGoodsUnit marketGoodsUnit) {
        LambdaQueryWrapper<MarketGoodsUnit> queryWrapper = getQueryWrapper(marketGoodsUnit);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketGoodsUnit
    * @return
    */
    public static LambdaQueryWrapper<MarketGoodsUnit> getQueryWrapper(MarketGoodsUnit marketGoodsUnit){
        LambdaQueryWrapper<MarketGoodsUnit> queryWrapper = new LambdaQueryWrapper<>();
        if (marketGoodsUnit.getId() != null) {
            queryWrapper.eq(MarketGoodsUnit::getId, marketGoodsUnit.getId());
        }
        if (StringUtil.isNotEmpty(marketGoodsUnit.getTenantId())) {
            queryWrapper.eq(MarketGoodsUnit::getTenantId, marketGoodsUnit.getTenantId());
        }
        if (StringUtil.isNotEmpty(marketGoodsUnit.getName())) {
            queryWrapper.eq(MarketGoodsUnit::getName, marketGoodsUnit.getName());
        }
        if (StringUtil.isNotEmpty(marketGoodsUnit.getRemark())) {
            queryWrapper.eq(MarketGoodsUnit::getRemark, marketGoodsUnit.getRemark());
        }
        if (marketGoodsUnit.getCreateUser() != null) {
            queryWrapper.eq(MarketGoodsUnit::getCreateUser, marketGoodsUnit.getCreateUser());
        }
        if (marketGoodsUnit.getCreateDept() != null) {
            queryWrapper.eq(MarketGoodsUnit::getCreateDept, marketGoodsUnit.getCreateDept());
        }
        if (marketGoodsUnit.getCreateTime() != null) {
            queryWrapper.eq(MarketGoodsUnit::getCreateTime, marketGoodsUnit.getCreateTime());
        }
        if (marketGoodsUnit.getUpdateUser() != null) {
            queryWrapper.eq(MarketGoodsUnit::getUpdateUser, marketGoodsUnit.getUpdateUser());
        }
        if (marketGoodsUnit.getUpdateTime() != null) {
            queryWrapper.eq(MarketGoodsUnit::getUpdateTime, marketGoodsUnit.getUpdateTime());
        }
        if (marketGoodsUnit.getStatus() != null) {
            queryWrapper.eq(MarketGoodsUnit::getStatus, marketGoodsUnit.getStatus());
        }
        if (marketGoodsUnit.getIsDeleted() != null) {
            queryWrapper.eq(MarketGoodsUnit::getIsDeleted, marketGoodsUnit.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketGoodsUnit 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsUnit insert(MarketGoodsUnit marketGoodsUnit) {
        marketGoodsUnit.setId(null);
        getBaseMapper().insert(marketGoodsUnit);
        return marketGoodsUnit;
    }

    /**
    * 更新数据
    *
    * @param marketGoodsUnit 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsUnit update(MarketGoodsUnit marketGoodsUnit) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketGoodsUnit> chainWrapper = new LambdaUpdateChainWrapper<MarketGoodsUnit>(getBaseMapper());
        if (marketGoodsUnit.getId() != null) {
            chainWrapper.set(MarketGoodsUnit::getId, marketGoodsUnit.getId());
        }
        if (StringUtil.isNotBlank(marketGoodsUnit.getTenantId())) {
            chainWrapper.set(MarketGoodsUnit::getTenantId, marketGoodsUnit.getTenantId());
        }
        if (StringUtil.isNotBlank(marketGoodsUnit.getName())) {
            chainWrapper.set(MarketGoodsUnit::getName, marketGoodsUnit.getName());
        }
        if (StringUtil.isNotBlank(marketGoodsUnit.getRemark())) {
            chainWrapper.set(MarketGoodsUnit::getRemark, marketGoodsUnit.getRemark());
        }
        if (marketGoodsUnit.getCreateUser() != null) {
            chainWrapper.set(MarketGoodsUnit::getCreateUser, marketGoodsUnit.getCreateUser());
        }
        if (marketGoodsUnit.getCreateDept() != null) {
            chainWrapper.set(MarketGoodsUnit::getCreateDept, marketGoodsUnit.getCreateDept());
        }
        if (marketGoodsUnit.getCreateTime() != null) {
            chainWrapper.set(MarketGoodsUnit::getCreateTime, marketGoodsUnit.getCreateTime());
        }
        if (marketGoodsUnit.getUpdateUser() != null) {
            chainWrapper.set(MarketGoodsUnit::getUpdateUser, marketGoodsUnit.getUpdateUser());
        }
        if (marketGoodsUnit.getUpdateTime() != null) {
            chainWrapper.set(MarketGoodsUnit::getUpdateTime, marketGoodsUnit.getUpdateTime());
        }
        if (marketGoodsUnit.getStatus() != null) {
            chainWrapper.set(MarketGoodsUnit::getStatus, marketGoodsUnit.getStatus());
        }
        if (marketGoodsUnit.getIsDeleted() != null) {
            chainWrapper.set(MarketGoodsUnit::getIsDeleted, marketGoodsUnit.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketGoodsUnit::getId, marketGoodsUnit.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketGoodsUnit.getId());
        } else {
            return marketGoodsUnit;
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
    public boolean saveMarketGoodsUnitBatch(List<MarketGoodsUnit> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketGoodsUnit marketGoodsUnit : insertList) {
            //使用默认的雪花算法生成
            marketGoodsUnit.setId(null);
            //marketGoodsUnit.setCreatedDt(currentDte);
            //marketGoodsUnit.setUpdatedDt(currentDte);
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
    public Integer deleteMarketGoodsUnitBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketGoodsUnit> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


