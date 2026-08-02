package cn.pluss.platform.service.marketGoodsBrand.impl;

import cn.pluss.platform.mapper.MarketGoodsBrandMapper;
import cn.pluss.platform.model.entity.MarketGoodsBrand;
import cn.pluss.platform.service.marketGoodsBrand.MarketGoodsBrandService;
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
@Service("marketGoodsBrandService")
public class MarketGoodsBrandServiceImpl extends ServiceImpl< MarketGoodsBrandMapper, MarketGoodsBrand> implements MarketGoodsBrandService {
    private static final Logger logger = LoggerFactory.getLogger(MarketGoodsBrandServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketGoodsBrand> queryPage(Map map) {
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
    public MarketGoodsBrand queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsBrand 实例对象
    * @return 实例对象
    */
    @Override
    public MarketGoodsBrand queryOne(MarketGoodsBrand marketGoodsBrand){
        LambdaQueryWrapper<MarketGoodsBrand> queryWrapper = getQueryWrapper(marketGoodsBrand);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketGoodsBrand
    * @return
    */
    @Override
    public List<MarketGoodsBrand> queryList(MarketGoodsBrand marketGoodsBrand) {
        LambdaQueryWrapper<MarketGoodsBrand> queryWrapper = getQueryWrapper(marketGoodsBrand);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketGoodsBrand
    * @return
    */
    public static LambdaQueryWrapper<MarketGoodsBrand> getQueryWrapper(MarketGoodsBrand marketGoodsBrand){
        LambdaQueryWrapper<MarketGoodsBrand> queryWrapper = new LambdaQueryWrapper<>();
        if (marketGoodsBrand.getId() != null) {
            queryWrapper.eq(MarketGoodsBrand::getId, marketGoodsBrand.getId());
        }
        if (StringUtil.isNotEmpty(marketGoodsBrand.getTenantId())) {
            queryWrapper.eq(MarketGoodsBrand::getTenantId, marketGoodsBrand.getTenantId());
        }
        if (marketGoodsBrand.getGoodsType() != null) {
            queryWrapper.eq(MarketGoodsBrand::getGoodsType, marketGoodsBrand.getGoodsType());
        }
        if (StringUtil.isNotEmpty(marketGoodsBrand.getGoodsTypeName())) {
            queryWrapper.eq(MarketGoodsBrand::getGoodsTypeName, marketGoodsBrand.getGoodsTypeName());
        }
        if (StringUtil.isNotEmpty(marketGoodsBrand.getBrandName())) {
            queryWrapper.eq(MarketGoodsBrand::getBrandName, marketGoodsBrand.getBrandName());
        }
        if (StringUtil.isNotEmpty(marketGoodsBrand.getBrandPic())) {
            queryWrapper.eq(MarketGoodsBrand::getBrandPic, marketGoodsBrand.getBrandPic());
        }
        if (StringUtil.isNotEmpty(marketGoodsBrand.getMemo())) {
            queryWrapper.eq(MarketGoodsBrand::getMemo, marketGoodsBrand.getMemo());
        }
        if (marketGoodsBrand.getSort() != null) {
            queryWrapper.eq(MarketGoodsBrand::getSort, marketGoodsBrand.getSort());
        }
        if (StringUtil.isNotEmpty(marketGoodsBrand.getBrief())) {
            queryWrapper.eq(MarketGoodsBrand::getBrief, marketGoodsBrand.getBrief());
        }
        if (StringUtil.isNotEmpty(marketGoodsBrand.getContent())) {
            queryWrapper.eq(MarketGoodsBrand::getContent, marketGoodsBrand.getContent());
        }
        if (StringUtil.isNotEmpty(marketGoodsBrand.getFirstChar())) {
            queryWrapper.eq(MarketGoodsBrand::getFirstChar, marketGoodsBrand.getFirstChar());
        }
        if (StringUtil.isNotEmpty(marketGoodsBrand.getRemark())) {
            queryWrapper.eq(MarketGoodsBrand::getRemark, marketGoodsBrand.getRemark());
        }
        if (marketGoodsBrand.getCreateUser() != null) {
            queryWrapper.eq(MarketGoodsBrand::getCreateUser, marketGoodsBrand.getCreateUser());
        }
        if (marketGoodsBrand.getCreateDept() != null) {
            queryWrapper.eq(MarketGoodsBrand::getCreateDept, marketGoodsBrand.getCreateDept());
        }
        if (marketGoodsBrand.getCreateTime() != null) {
            queryWrapper.eq(MarketGoodsBrand::getCreateTime, marketGoodsBrand.getCreateTime());
        }
        if (marketGoodsBrand.getUpdateUser() != null) {
            queryWrapper.eq(MarketGoodsBrand::getUpdateUser, marketGoodsBrand.getUpdateUser());
        }
        if (marketGoodsBrand.getUpdateTime() != null) {
            queryWrapper.eq(MarketGoodsBrand::getUpdateTime, marketGoodsBrand.getUpdateTime());
        }
        if (marketGoodsBrand.getStatus() != null) {
            queryWrapper.eq(MarketGoodsBrand::getStatus, marketGoodsBrand.getStatus());
        }
        if (marketGoodsBrand.getIsDeleted() != null) {
            queryWrapper.eq(MarketGoodsBrand::getIsDeleted, marketGoodsBrand.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketGoodsBrand 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsBrand insert(MarketGoodsBrand marketGoodsBrand) {
        marketGoodsBrand.setId(null);
        getBaseMapper().insert(marketGoodsBrand);
        return marketGoodsBrand;
    }

    /**
    * 更新数据
    *
    * @param marketGoodsBrand 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsBrand update(MarketGoodsBrand marketGoodsBrand) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketGoodsBrand> chainWrapper = new LambdaUpdateChainWrapper<MarketGoodsBrand>(getBaseMapper());
        if (marketGoodsBrand.getId() != null) {
            chainWrapper.set(MarketGoodsBrand::getId, marketGoodsBrand.getId());
        }
        if (StringUtil.isNotBlank(marketGoodsBrand.getTenantId())) {
            chainWrapper.set(MarketGoodsBrand::getTenantId, marketGoodsBrand.getTenantId());
        }
        if (marketGoodsBrand.getGoodsType() != null) {
            chainWrapper.set(MarketGoodsBrand::getGoodsType, marketGoodsBrand.getGoodsType());
        }
        if (StringUtil.isNotBlank(marketGoodsBrand.getGoodsTypeName())) {
            chainWrapper.set(MarketGoodsBrand::getGoodsTypeName, marketGoodsBrand.getGoodsTypeName());
        }
        if (StringUtil.isNotBlank(marketGoodsBrand.getBrandName())) {
            chainWrapper.set(MarketGoodsBrand::getBrandName, marketGoodsBrand.getBrandName());
        }
        if (StringUtil.isNotBlank(marketGoodsBrand.getBrandPic())) {
            chainWrapper.set(MarketGoodsBrand::getBrandPic, marketGoodsBrand.getBrandPic());
        }
        if (StringUtil.isNotBlank(marketGoodsBrand.getMemo())) {
            chainWrapper.set(MarketGoodsBrand::getMemo, marketGoodsBrand.getMemo());
        }
        if (marketGoodsBrand.getSort() != null) {
            chainWrapper.set(MarketGoodsBrand::getSort, marketGoodsBrand.getSort());
        }
        if (StringUtil.isNotBlank(marketGoodsBrand.getBrief())) {
            chainWrapper.set(MarketGoodsBrand::getBrief, marketGoodsBrand.getBrief());
        }
        if (StringUtil.isNotBlank(marketGoodsBrand.getContent())) {
            chainWrapper.set(MarketGoodsBrand::getContent, marketGoodsBrand.getContent());
        }
        if (StringUtil.isNotBlank(marketGoodsBrand.getFirstChar())) {
            chainWrapper.set(MarketGoodsBrand::getFirstChar, marketGoodsBrand.getFirstChar());
        }
        if (StringUtil.isNotBlank(marketGoodsBrand.getRemark())) {
            chainWrapper.set(MarketGoodsBrand::getRemark, marketGoodsBrand.getRemark());
        }
        if (marketGoodsBrand.getCreateUser() != null) {
            chainWrapper.set(MarketGoodsBrand::getCreateUser, marketGoodsBrand.getCreateUser());
        }
        if (marketGoodsBrand.getCreateDept() != null) {
            chainWrapper.set(MarketGoodsBrand::getCreateDept, marketGoodsBrand.getCreateDept());
        }
        if (marketGoodsBrand.getCreateTime() != null) {
            chainWrapper.set(MarketGoodsBrand::getCreateTime, marketGoodsBrand.getCreateTime());
        }
        if (marketGoodsBrand.getUpdateUser() != null) {
            chainWrapper.set(MarketGoodsBrand::getUpdateUser, marketGoodsBrand.getUpdateUser());
        }
        if (marketGoodsBrand.getUpdateTime() != null) {
            chainWrapper.set(MarketGoodsBrand::getUpdateTime, marketGoodsBrand.getUpdateTime());
        }
        if (marketGoodsBrand.getStatus() != null) {
            chainWrapper.set(MarketGoodsBrand::getStatus, marketGoodsBrand.getStatus());
        }
        if (marketGoodsBrand.getIsDeleted() != null) {
            chainWrapper.set(MarketGoodsBrand::getIsDeleted, marketGoodsBrand.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketGoodsBrand::getId, marketGoodsBrand.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketGoodsBrand.getId());
        } else {
            return marketGoodsBrand;
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
    public boolean saveMarketGoodsBrandBatch(List<MarketGoodsBrand> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketGoodsBrand marketGoodsBrand : insertList) {
            //使用默认的雪花算法生成
            marketGoodsBrand.setId(null);
            //marketGoodsBrand.setCreatedDt(currentDte);
            //marketGoodsBrand.setUpdatedDt(currentDte);
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
    public Integer deleteMarketGoodsBrandBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketGoodsBrand> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


