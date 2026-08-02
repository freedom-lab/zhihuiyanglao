package cn.pluss.platform.service.marketGoodsInfo.impl;

import cn.pluss.platform.mapper.MarketGoodsInfoMapper;
import cn.pluss.platform.model.entity.MarketGoodsInfo;
import cn.pluss.platform.service.marketGoodsInfo.MarketGoodsInfoService;
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
@Service("marketGoodsInfoService")
public class MarketGoodsInfoServiceImpl extends ServiceImpl< MarketGoodsInfoMapper, MarketGoodsInfo> implements MarketGoodsInfoService {
    private static final Logger logger = LoggerFactory.getLogger(MarketGoodsInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketGoodsInfo> queryPage(Map map) {
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
    public MarketGoodsInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsInfo 实例对象
    * @return 实例对象
    */
    @Override
    public MarketGoodsInfo queryOne(MarketGoodsInfo marketGoodsInfo){
        LambdaQueryWrapper<MarketGoodsInfo> queryWrapper = getQueryWrapper(marketGoodsInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketGoodsInfo
    * @return
    */
    @Override
    public List<MarketGoodsInfo> queryList(MarketGoodsInfo marketGoodsInfo) {
        LambdaQueryWrapper<MarketGoodsInfo> queryWrapper = getQueryWrapper(marketGoodsInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketGoodsInfo
    * @return
    */
    public static LambdaQueryWrapper<MarketGoodsInfo> getQueryWrapper(MarketGoodsInfo marketGoodsInfo){
        LambdaQueryWrapper<MarketGoodsInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (marketGoodsInfo.getId() != null) {
            queryWrapper.eq(MarketGoodsInfo::getId, marketGoodsInfo.getId());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getTenantId())) {
            queryWrapper.eq(MarketGoodsInfo::getTenantId, marketGoodsInfo.getTenantId());
        }
        if (marketGoodsInfo.getCorpId() != null) {
            queryWrapper.eq(MarketGoodsInfo::getCorpId, marketGoodsInfo.getCorpId());
        }
        if (marketGoodsInfo.getInstitutionId() != null) {
            queryWrapper.eq(MarketGoodsInfo::getInstitutionId, marketGoodsInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getInstitutionName())) {
            queryWrapper.eq(MarketGoodsInfo::getInstitutionName, marketGoodsInfo.getInstitutionName());
        }
        if (marketGoodsInfo.getAttributeCategoryId() != null) {
            queryWrapper.eq(MarketGoodsInfo::getAttributeCategoryId, marketGoodsInfo.getAttributeCategoryId());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getGoodsName())) {
            queryWrapper.eq(MarketGoodsInfo::getGoodsName, marketGoodsInfo.getGoodsName());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getGoodsSn())) {
            queryWrapper.eq(MarketGoodsInfo::getGoodsSn, marketGoodsInfo.getGoodsSn());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getSubGoodName())) {
            queryWrapper.eq(MarketGoodsInfo::getSubGoodName, marketGoodsInfo.getSubGoodName());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getGoodsCode())) {
            queryWrapper.eq(MarketGoodsInfo::getGoodsCode, marketGoodsInfo.getGoodsCode());
        }
        if (marketGoodsInfo.getBrandId() != null) {
            queryWrapper.eq(MarketGoodsInfo::getBrandId, marketGoodsInfo.getBrandId());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getBrandName())) {
            queryWrapper.eq(MarketGoodsInfo::getBrandName, marketGoodsInfo.getBrandName());
        }
        if (marketGoodsInfo.getOriginalPrice() != null) {
            queryWrapper.eq(MarketGoodsInfo::getOriginalPrice, marketGoodsInfo.getOriginalPrice());
        }
        if (marketGoodsInfo.getPrice() != null) {
            queryWrapper.eq(MarketGoodsInfo::getPrice, marketGoodsInfo.getPrice());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getBrief())) {
            queryWrapper.eq(MarketGoodsInfo::getBrief, marketGoodsInfo.getBrief());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getDescription())) {
            queryWrapper.eq(MarketGoodsInfo::getDescription, marketGoodsInfo.getDescription());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getPic())) {
            queryWrapper.eq(MarketGoodsInfo::getPic, marketGoodsInfo.getPic());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getImgs())) {
            queryWrapper.eq(MarketGoodsInfo::getImgs, marketGoodsInfo.getImgs());
        }
        if (marketGoodsInfo.getBigTypeId() != null) {
            queryWrapper.eq(MarketGoodsInfo::getBigTypeId, marketGoodsInfo.getBigTypeId());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getBigTypeName())) {
            queryWrapper.eq(MarketGoodsInfo::getBigTypeName, marketGoodsInfo.getBigTypeName());
        }
        if (marketGoodsInfo.getTypeId() != null) {
            queryWrapper.eq(MarketGoodsInfo::getTypeId, marketGoodsInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getTypeName())) {
            queryWrapper.eq(MarketGoodsInfo::getTypeName, marketGoodsInfo.getTypeName());
        }
        if (marketGoodsInfo.getSaleNum() != null) {
            queryWrapper.eq(MarketGoodsInfo::getSaleNum, marketGoodsInfo.getSaleNum());
        }
        if (marketGoodsInfo.getTotalStock() != null) {
            queryWrapper.eq(MarketGoodsInfo::getTotalStock, marketGoodsInfo.getTotalStock());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getCategoryType())) {
            queryWrapper.eq(MarketGoodsInfo::getCategoryType, marketGoodsInfo.getCategoryType());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getDeliveryType())) {
            queryWrapper.eq(MarketGoodsInfo::getDeliveryType, marketGoodsInfo.getDeliveryType());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getIsFreeShip())) {
            queryWrapper.eq(MarketGoodsInfo::getIsFreeShip, marketGoodsInfo.getIsFreeShip());
        }
        if (marketGoodsInfo.getExpressFee() != null) {
            queryWrapper.eq(MarketGoodsInfo::getExpressFee, marketGoodsInfo.getExpressFee());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getIsNew())) {
            queryWrapper.eq(MarketGoodsInfo::getIsNew, marketGoodsInfo.getIsNew());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getIsSuggest())) {
            queryWrapper.eq(MarketGoodsInfo::getIsSuggest, marketGoodsInfo.getIsSuggest());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getIsUseIntegral())) {
            queryWrapper.eq(MarketGoodsInfo::getIsUseIntegral, marketGoodsInfo.getIsUseIntegral());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getIsUseMember())) {
            queryWrapper.eq(MarketGoodsInfo::getIsUseMember, marketGoodsInfo.getIsUseMember());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getIsUseCoupon())) {
            queryWrapper.eq(MarketGoodsInfo::getIsUseCoupon, marketGoodsInfo.getIsUseCoupon());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getUnit())) {
            queryWrapper.eq(MarketGoodsInfo::getUnit, marketGoodsInfo.getUnit());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getAuditState())) {
            queryWrapper.eq(MarketGoodsInfo::getAuditState, marketGoodsInfo.getAuditState());
        }
        if (marketGoodsInfo.getPutawayTime() != null) {
            queryWrapper.eq(MarketGoodsInfo::getPutawayTime, marketGoodsInfo.getPutawayTime());
        }
        if (marketGoodsInfo.getClickNum() != null) {
            queryWrapper.eq(MarketGoodsInfo::getClickNum, marketGoodsInfo.getClickNum());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getRemark())) {
            queryWrapper.eq(MarketGoodsInfo::getRemark, marketGoodsInfo.getRemark());
        }
        if (marketGoodsInfo.getCreateUser() != null) {
            queryWrapper.eq(MarketGoodsInfo::getCreateUser, marketGoodsInfo.getCreateUser());
        }
        if (marketGoodsInfo.getCreateDept() != null) {
            queryWrapper.eq(MarketGoodsInfo::getCreateDept, marketGoodsInfo.getCreateDept());
        }
        if (marketGoodsInfo.getCreateTime() != null) {
            queryWrapper.eq(MarketGoodsInfo::getCreateTime, marketGoodsInfo.getCreateTime());
        }
        if (marketGoodsInfo.getUpdateUser() != null) {
            queryWrapper.eq(MarketGoodsInfo::getUpdateUser, marketGoodsInfo.getUpdateUser());
        }
        if (marketGoodsInfo.getUpdateTime() != null) {
            queryWrapper.eq(MarketGoodsInfo::getUpdateTime, marketGoodsInfo.getUpdateTime());
        }
        if (marketGoodsInfo.getStatus() != null) {
            queryWrapper.eq(MarketGoodsInfo::getStatus, marketGoodsInfo.getStatus());
        }
        if (marketGoodsInfo.getIsDeleted() != null) {
            queryWrapper.eq(MarketGoodsInfo::getIsDeleted, marketGoodsInfo.getIsDeleted());
        }
        if (StringUtil.isNotEmpty(marketGoodsInfo.getServiceIds())) {
            queryWrapper.eq(MarketGoodsInfo::getServiceIds, marketGoodsInfo.getServiceIds());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketGoodsInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsInfo insert(MarketGoodsInfo marketGoodsInfo) {
        marketGoodsInfo.setId(null);
        getBaseMapper().insert(marketGoodsInfo);
        return marketGoodsInfo;
    }

    /**
    * 更新数据
    *
    * @param marketGoodsInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsInfo update(MarketGoodsInfo marketGoodsInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketGoodsInfo> chainWrapper = new LambdaUpdateChainWrapper<MarketGoodsInfo>(getBaseMapper());
        if (marketGoodsInfo.getId() != null) {
            chainWrapper.set(MarketGoodsInfo::getId, marketGoodsInfo.getId());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getTenantId())) {
            chainWrapper.set(MarketGoodsInfo::getTenantId, marketGoodsInfo.getTenantId());
        }
        if (marketGoodsInfo.getCorpId() != null) {
            chainWrapper.set(MarketGoodsInfo::getCorpId, marketGoodsInfo.getCorpId());
        }
        if (marketGoodsInfo.getInstitutionId() != null) {
            chainWrapper.set(MarketGoodsInfo::getInstitutionId, marketGoodsInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getInstitutionName())) {
            chainWrapper.set(MarketGoodsInfo::getInstitutionName, marketGoodsInfo.getInstitutionName());
        }
        if (marketGoodsInfo.getAttributeCategoryId() != null) {
            chainWrapper.set(MarketGoodsInfo::getAttributeCategoryId, marketGoodsInfo.getAttributeCategoryId());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getGoodsName())) {
            chainWrapper.set(MarketGoodsInfo::getGoodsName, marketGoodsInfo.getGoodsName());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getGoodsSn())) {
            chainWrapper.set(MarketGoodsInfo::getGoodsSn, marketGoodsInfo.getGoodsSn());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getSubGoodName())) {
            chainWrapper.set(MarketGoodsInfo::getSubGoodName, marketGoodsInfo.getSubGoodName());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getGoodsCode())) {
            chainWrapper.set(MarketGoodsInfo::getGoodsCode, marketGoodsInfo.getGoodsCode());
        }
        if (marketGoodsInfo.getBrandId() != null) {
            chainWrapper.set(MarketGoodsInfo::getBrandId, marketGoodsInfo.getBrandId());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getBrandName())) {
            chainWrapper.set(MarketGoodsInfo::getBrandName, marketGoodsInfo.getBrandName());
        }
        if (marketGoodsInfo.getOriginalPrice() != null) {
            chainWrapper.set(MarketGoodsInfo::getOriginalPrice, marketGoodsInfo.getOriginalPrice());
        }
        if (marketGoodsInfo.getPrice() != null) {
            chainWrapper.set(MarketGoodsInfo::getPrice, marketGoodsInfo.getPrice());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getBrief())) {
            chainWrapper.set(MarketGoodsInfo::getBrief, marketGoodsInfo.getBrief());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getDescription())) {
            chainWrapper.set(MarketGoodsInfo::getDescription, marketGoodsInfo.getDescription());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getPic())) {
            chainWrapper.set(MarketGoodsInfo::getPic, marketGoodsInfo.getPic());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getImgs())) {
            chainWrapper.set(MarketGoodsInfo::getImgs, marketGoodsInfo.getImgs());
        }
        if (marketGoodsInfo.getBigTypeId() != null) {
            chainWrapper.set(MarketGoodsInfo::getBigTypeId, marketGoodsInfo.getBigTypeId());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getBigTypeName())) {
            chainWrapper.set(MarketGoodsInfo::getBigTypeName, marketGoodsInfo.getBigTypeName());
        }
        if (marketGoodsInfo.getTypeId() != null) {
            chainWrapper.set(MarketGoodsInfo::getTypeId, marketGoodsInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getTypeName())) {
            chainWrapper.set(MarketGoodsInfo::getTypeName, marketGoodsInfo.getTypeName());
        }
        if (marketGoodsInfo.getSaleNum() != null) {
            chainWrapper.set(MarketGoodsInfo::getSaleNum, marketGoodsInfo.getSaleNum());
        }
        if (marketGoodsInfo.getTotalStock() != null) {
            chainWrapper.set(MarketGoodsInfo::getTotalStock, marketGoodsInfo.getTotalStock());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getCategoryType())) {
            chainWrapper.set(MarketGoodsInfo::getCategoryType, marketGoodsInfo.getCategoryType());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getDeliveryType())) {
            chainWrapper.set(MarketGoodsInfo::getDeliveryType, marketGoodsInfo.getDeliveryType());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getIsFreeShip())) {
            chainWrapper.set(MarketGoodsInfo::getIsFreeShip, marketGoodsInfo.getIsFreeShip());
        }
        if (marketGoodsInfo.getExpressFee() != null) {
            chainWrapper.set(MarketGoodsInfo::getExpressFee, marketGoodsInfo.getExpressFee());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getIsNew())) {
            chainWrapper.set(MarketGoodsInfo::getIsNew, marketGoodsInfo.getIsNew());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getIsSuggest())) {
            chainWrapper.set(MarketGoodsInfo::getIsSuggest, marketGoodsInfo.getIsSuggest());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getIsUseIntegral())) {
            chainWrapper.set(MarketGoodsInfo::getIsUseIntegral, marketGoodsInfo.getIsUseIntegral());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getIsUseMember())) {
            chainWrapper.set(MarketGoodsInfo::getIsUseMember, marketGoodsInfo.getIsUseMember());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getIsUseCoupon())) {
            chainWrapper.set(MarketGoodsInfo::getIsUseCoupon, marketGoodsInfo.getIsUseCoupon());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getUnit())) {
            chainWrapper.set(MarketGoodsInfo::getUnit, marketGoodsInfo.getUnit());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getAuditState())) {
            chainWrapper.set(MarketGoodsInfo::getAuditState, marketGoodsInfo.getAuditState());
        }
        if (marketGoodsInfo.getPutawayTime() != null) {
            chainWrapper.set(MarketGoodsInfo::getPutawayTime, marketGoodsInfo.getPutawayTime());
        }
        if (marketGoodsInfo.getClickNum() != null) {
            chainWrapper.set(MarketGoodsInfo::getClickNum, marketGoodsInfo.getClickNum());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getRemark())) {
            chainWrapper.set(MarketGoodsInfo::getRemark, marketGoodsInfo.getRemark());
        }
        if (marketGoodsInfo.getCreateUser() != null) {
            chainWrapper.set(MarketGoodsInfo::getCreateUser, marketGoodsInfo.getCreateUser());
        }
        if (marketGoodsInfo.getCreateDept() != null) {
            chainWrapper.set(MarketGoodsInfo::getCreateDept, marketGoodsInfo.getCreateDept());
        }
        if (marketGoodsInfo.getCreateTime() != null) {
            chainWrapper.set(MarketGoodsInfo::getCreateTime, marketGoodsInfo.getCreateTime());
        }
        if (marketGoodsInfo.getUpdateUser() != null) {
            chainWrapper.set(MarketGoodsInfo::getUpdateUser, marketGoodsInfo.getUpdateUser());
        }
        if (marketGoodsInfo.getUpdateTime() != null) {
            chainWrapper.set(MarketGoodsInfo::getUpdateTime, marketGoodsInfo.getUpdateTime());
        }
        if (marketGoodsInfo.getStatus() != null) {
            chainWrapper.set(MarketGoodsInfo::getStatus, marketGoodsInfo.getStatus());
        }
        if (marketGoodsInfo.getIsDeleted() != null) {
            chainWrapper.set(MarketGoodsInfo::getIsDeleted, marketGoodsInfo.getIsDeleted());
        }
        if (StringUtil.isNotBlank(marketGoodsInfo.getServiceIds())) {
            chainWrapper.set(MarketGoodsInfo::getServiceIds, marketGoodsInfo.getServiceIds());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketGoodsInfo::getId, marketGoodsInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketGoodsInfo.getId());
        } else {
            return marketGoodsInfo;
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
    public boolean saveMarketGoodsInfoBatch(List<MarketGoodsInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketGoodsInfo marketGoodsInfo : insertList) {
            //使用默认的雪花算法生成
            marketGoodsInfo.setId(null);
            //marketGoodsInfo.setCreatedDt(currentDte);
            //marketGoodsInfo.setUpdatedDt(currentDte);
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
    public Integer deleteMarketGoodsInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketGoodsInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


