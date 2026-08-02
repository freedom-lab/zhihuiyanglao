package cn.pluss.platform.service.marketOrderInfo.impl;

import cn.pluss.platform.mapper.MarketOrderInfoMapper;
import cn.pluss.platform.model.dto.HealthDto;
import cn.pluss.platform.model.entity.MarketOrderInfo;
import cn.pluss.platform.service.marketOrderInfo.MarketOrderInfoService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Transactional
@Service("marketOrderInfoService")
public class MarketOrderInfoServiceImpl extends ServiceImpl< MarketOrderInfoMapper, MarketOrderInfo> implements MarketOrderInfoService {
    private static final Logger logger = LoggerFactory.getLogger(MarketOrderInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketOrderInfo> queryPage(Map map) {
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
    public MarketOrderInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    public MarketOrderInfo queryOne(MarketOrderInfo marketOrderInfo){
        LambdaQueryWrapper<MarketOrderInfo> queryWrapper = getQueryWrapper(marketOrderInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketOrderInfo
    * @return
    */
    @Override
    public List<MarketOrderInfo> queryList(MarketOrderInfo marketOrderInfo) {
        LambdaQueryWrapper<MarketOrderInfo> queryWrapper = getQueryWrapper(marketOrderInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketOrderInfo
    * @return
    */
    public static LambdaQueryWrapper<MarketOrderInfo> getQueryWrapper(MarketOrderInfo marketOrderInfo){
        LambdaQueryWrapper<MarketOrderInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (marketOrderInfo.getId() != null) {
            queryWrapper.eq(MarketOrderInfo::getId, marketOrderInfo.getId());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getTenantId())) {
            queryWrapper.eq(MarketOrderInfo::getTenantId, marketOrderInfo.getTenantId());
        }
        if (marketOrderInfo.getCorpId() != null) {
            queryWrapper.eq(MarketOrderInfo::getCorpId, marketOrderInfo.getCorpId());
        }
        if (marketOrderInfo.getInstitutionId() != null) {
            queryWrapper.eq(MarketOrderInfo::getInstitutionId, marketOrderInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getInstitutionName())) {
            queryWrapper.eq(MarketOrderInfo::getInstitutionName, marketOrderInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getGoodsName())) {
            queryWrapper.eq(MarketOrderInfo::getGoodsName, marketOrderInfo.getGoodsName());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getOrderCode())) {
            queryWrapper.eq(MarketOrderInfo::getOrderCode, marketOrderInfo.getOrderCode());
        }
        if (marketOrderInfo.getTotal() != null) {
            queryWrapper.eq(MarketOrderInfo::getTotal, marketOrderInfo.getTotal());
        }
        if (marketOrderInfo.getDiscountAmount() != null) {
            queryWrapper.eq(MarketOrderInfo::getDiscountAmount, marketOrderInfo.getDiscountAmount());
        }
        if (marketOrderInfo.getCouponAmount() != null) {
            queryWrapper.eq(MarketOrderInfo::getCouponAmount, marketOrderInfo.getCouponAmount());
        }
        if (marketOrderInfo.getIntegralAmount() != null) {
            queryWrapper.eq(MarketOrderInfo::getIntegralAmount, marketOrderInfo.getIntegralAmount());
        }
        if (marketOrderInfo.getReduceAmount() != null) {
            queryWrapper.eq(MarketOrderInfo::getReduceAmount, marketOrderInfo.getReduceAmount());
        }
        if (marketOrderInfo.getActualTotal() != null) {
            queryWrapper.eq(MarketOrderInfo::getActualTotal, marketOrderInfo.getActualTotal());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getPayType())) {
            queryWrapper.eq(MarketOrderInfo::getPayType, marketOrderInfo.getPayType());
        }
        if (marketOrderInfo.getOrderState() != null) {
            queryWrapper.eq(MarketOrderInfo::getOrderState, marketOrderInfo.getOrderState());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getExpressType())) {
            queryWrapper.eq(MarketOrderInfo::getExpressType, marketOrderInfo.getExpressType());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getExpressCode())) {
            queryWrapper.eq(MarketOrderInfo::getExpressCode, marketOrderInfo.getExpressCode());
        }
        if (marketOrderInfo.getExpressId() != null) {
            queryWrapper.eq(MarketOrderInfo::getExpressId, marketOrderInfo.getExpressId());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getExpressName())) {
            queryWrapper.eq(MarketOrderInfo::getExpressName, marketOrderInfo.getExpressName());
        }
        if (marketOrderInfo.getExpressFee() != null) {
            queryWrapper.eq(MarketOrderInfo::getExpressFee, marketOrderInfo.getExpressFee());
        }
        if (marketOrderInfo.getAddressId() != null) {
            queryWrapper.eq(MarketOrderInfo::getAddressId, marketOrderInfo.getAddressId());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getAddress())) {
            queryWrapper.eq(MarketOrderInfo::getAddress, marketOrderInfo.getAddress());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getLinkTel())) {
            queryWrapper.eq(MarketOrderInfo::getLinkTel, marketOrderInfo.getLinkTel());
        }
        if (marketOrderInfo.getGoodsNums() != null) {
            queryWrapper.eq(MarketOrderInfo::getGoodsNums, marketOrderInfo.getGoodsNums());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getIsNewOrder())) {
            queryWrapper.eq(MarketOrderInfo::getIsNewOrder, marketOrderInfo.getIsNewOrder());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getPersonType())) {
            queryWrapper.eq(MarketOrderInfo::getPersonType, marketOrderInfo.getPersonType());
        }
        if (marketOrderInfo.getPersonId() != null) {
            queryWrapper.eq(MarketOrderInfo::getPersonId, marketOrderInfo.getPersonId());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getPersonName())) {
            queryWrapper.eq(MarketOrderInfo::getPersonName, marketOrderInfo.getPersonName());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getRecipientType())) {
            queryWrapper.eq(MarketOrderInfo::getRecipientType, marketOrderInfo.getRecipientType());
        }
        if (marketOrderInfo.getRecipientId() != null) {
            queryWrapper.eq(MarketOrderInfo::getRecipientId, marketOrderInfo.getRecipientId());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getRecipientName())) {
            queryWrapper.eq(MarketOrderInfo::getRecipientName, marketOrderInfo.getRecipientName());
        }
        if (marketOrderInfo.getReservationTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getReservationTime, marketOrderInfo.getReservationTime());
        }
        if (marketOrderInfo.getServerId() != null) {
            queryWrapper.eq(MarketOrderInfo::getServerId, marketOrderInfo.getServerId());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getServerName())) {
            queryWrapper.eq(MarketOrderInfo::getServerName, marketOrderInfo.getServerName());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getServerTel())) {
            queryWrapper.eq(MarketOrderInfo::getServerTel, marketOrderInfo.getServerTel());
        }
        if (marketOrderInfo.getPayTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getPayTime, marketOrderInfo.getPayTime());
        }
        if (marketOrderInfo.getSendTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getSendTime, marketOrderInfo.getSendTime());
        }
        if (marketOrderInfo.getEndTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getEndTime, marketOrderInfo.getEndTime());
        }
        if (marketOrderInfo.getCancelTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getCancelTime, marketOrderInfo.getCancelTime());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getPayState())) {
            queryWrapper.eq(MarketOrderInfo::getPayState, marketOrderInfo.getPayState());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getDeleteStatus())) {
            queryWrapper.eq(MarketOrderInfo::getDeleteStatus, marketOrderInfo.getDeleteStatus());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getCategoryType())) {
            queryWrapper.eq(MarketOrderInfo::getCategoryType, marketOrderInfo.getCategoryType());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getCloseType())) {
            queryWrapper.eq(MarketOrderInfo::getCloseType, marketOrderInfo.getCloseType());
        }
        if (marketOrderInfo.getDataSource() != null) {
            queryWrapper.eq(MarketOrderInfo::getDataSource, marketOrderInfo.getDataSource());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getRemark())) {
            queryWrapper.eq(MarketOrderInfo::getRemark, marketOrderInfo.getRemark());
        }
        if (marketOrderInfo.getCreateUser() != null) {
            queryWrapper.eq(MarketOrderInfo::getCreateUser, marketOrderInfo.getCreateUser());
        }
        if (marketOrderInfo.getCreateDept() != null) {
            queryWrapper.eq(MarketOrderInfo::getCreateDept, marketOrderInfo.getCreateDept());
        }
        if (marketOrderInfo.getCreateTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getCreateTime, marketOrderInfo.getCreateTime());
        }
        if (marketOrderInfo.getUpdateUser() != null) {
            queryWrapper.eq(MarketOrderInfo::getUpdateUser, marketOrderInfo.getUpdateUser());
        }
        if (marketOrderInfo.getUpdateTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getUpdateTime, marketOrderInfo.getUpdateTime());
        }
        if (marketOrderInfo.getStatus() != null) {
            queryWrapper.eq(MarketOrderInfo::getStatus, marketOrderInfo.getStatus());
        }
        if (marketOrderInfo.getIsDeleted() != null) {
            queryWrapper.eq(MarketOrderInfo::getIsDeleted, marketOrderInfo.getIsDeleted());
        }
        if (marketOrderInfo.getAreaCode() != null) {
            queryWrapper.eq(MarketOrderInfo::getAreaCode, marketOrderInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getAreaName())) {
            queryWrapper.eq(MarketOrderInfo::getAreaName, marketOrderInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getStartImg())) {
            queryWrapper.eq(MarketOrderInfo::getStartImg, marketOrderInfo.getStartImg());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getEndImg())) {
            queryWrapper.eq(MarketOrderInfo::getEndImg, marketOrderInfo.getEndImg());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getVideoUrl())) {
            queryWrapper.eq(MarketOrderInfo::getVideoUrl, marketOrderInfo.getVideoUrl());
        }
        if (StringUtil.isNotEmpty(marketOrderInfo.getOutTradeNo())) {
            queryWrapper.eq(MarketOrderInfo::getOutTradeNo, marketOrderInfo.getOutTradeNo());
        }
        if (marketOrderInfo.getIsAssign() != null) {
            queryWrapper.eq(MarketOrderInfo::getIsAssign, marketOrderInfo.getIsAssign());
        }
        if (marketOrderInfo.getAssignTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getAssignTime, marketOrderInfo.getAssignTime());
        }
        if (marketOrderInfo.getAcceptTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getAcceptTime, marketOrderInfo.getAcceptTime());
        }
        if (marketOrderInfo.getConfirmState() != null) {
            queryWrapper.eq(MarketOrderInfo::getConfirmState, marketOrderInfo.getConfirmState());
        }
        if (marketOrderInfo.getConfirmTime() != null) {
            queryWrapper.eq(MarketOrderInfo::getConfirmTime, marketOrderInfo.getConfirmTime());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketOrderInfo insert(MarketOrderInfo marketOrderInfo) {
        marketOrderInfo.setId(null);
        getBaseMapper().insert(marketOrderInfo);
        return marketOrderInfo;
    }

    /**
    * 更新数据
    *
    * @param marketOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketOrderInfo update(MarketOrderInfo marketOrderInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketOrderInfo> chainWrapper = new LambdaUpdateChainWrapper<MarketOrderInfo>(getBaseMapper());
        if (marketOrderInfo.getId() != null) {
            chainWrapper.set(MarketOrderInfo::getId, marketOrderInfo.getId());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getTenantId())) {
            chainWrapper.set(MarketOrderInfo::getTenantId, marketOrderInfo.getTenantId());
        }
        if (marketOrderInfo.getCorpId() != null) {
            chainWrapper.set(MarketOrderInfo::getCorpId, marketOrderInfo.getCorpId());
        }
        if (marketOrderInfo.getInstitutionId() != null) {
            chainWrapper.set(MarketOrderInfo::getInstitutionId, marketOrderInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getInstitutionName())) {
            chainWrapper.set(MarketOrderInfo::getInstitutionName, marketOrderInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getGoodsName())) {
            chainWrapper.set(MarketOrderInfo::getGoodsName, marketOrderInfo.getGoodsName());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getOrderCode())) {
            chainWrapper.set(MarketOrderInfo::getOrderCode, marketOrderInfo.getOrderCode());
        }
        if (marketOrderInfo.getTotal() != null) {
            chainWrapper.set(MarketOrderInfo::getTotal, marketOrderInfo.getTotal());
        }
        if (marketOrderInfo.getDiscountAmount() != null) {
            chainWrapper.set(MarketOrderInfo::getDiscountAmount, marketOrderInfo.getDiscountAmount());
        }
        if (marketOrderInfo.getCouponAmount() != null) {
            chainWrapper.set(MarketOrderInfo::getCouponAmount, marketOrderInfo.getCouponAmount());
        }
        if (marketOrderInfo.getIntegralAmount() != null) {
            chainWrapper.set(MarketOrderInfo::getIntegralAmount, marketOrderInfo.getIntegralAmount());
        }
        if (marketOrderInfo.getReduceAmount() != null) {
            chainWrapper.set(MarketOrderInfo::getReduceAmount, marketOrderInfo.getReduceAmount());
        }
        if (marketOrderInfo.getActualTotal() != null) {
            chainWrapper.set(MarketOrderInfo::getActualTotal, marketOrderInfo.getActualTotal());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getPayType())) {
            chainWrapper.set(MarketOrderInfo::getPayType, marketOrderInfo.getPayType());
        }
        if (marketOrderInfo.getOrderState() != null) {
            chainWrapper.set(MarketOrderInfo::getOrderState, marketOrderInfo.getOrderState());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getExpressType())) {
            chainWrapper.set(MarketOrderInfo::getExpressType, marketOrderInfo.getExpressType());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getExpressCode())) {
            chainWrapper.set(MarketOrderInfo::getExpressCode, marketOrderInfo.getExpressCode());
        }
        if (marketOrderInfo.getExpressId() != null) {
            chainWrapper.set(MarketOrderInfo::getExpressId, marketOrderInfo.getExpressId());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getExpressName())) {
            chainWrapper.set(MarketOrderInfo::getExpressName, marketOrderInfo.getExpressName());
        }
        if (marketOrderInfo.getExpressFee() != null) {
            chainWrapper.set(MarketOrderInfo::getExpressFee, marketOrderInfo.getExpressFee());
        }
        if (marketOrderInfo.getAddressId() != null) {
            chainWrapper.set(MarketOrderInfo::getAddressId, marketOrderInfo.getAddressId());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getAddress())) {
            chainWrapper.set(MarketOrderInfo::getAddress, marketOrderInfo.getAddress());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getLinkTel())) {
            chainWrapper.set(MarketOrderInfo::getLinkTel, marketOrderInfo.getLinkTel());
        }
        if (marketOrderInfo.getGoodsNums() != null) {
            chainWrapper.set(MarketOrderInfo::getGoodsNums, marketOrderInfo.getGoodsNums());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getIsNewOrder())) {
            chainWrapper.set(MarketOrderInfo::getIsNewOrder, marketOrderInfo.getIsNewOrder());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getPersonType())) {
            chainWrapper.set(MarketOrderInfo::getPersonType, marketOrderInfo.getPersonType());
        }
        if (marketOrderInfo.getPersonId() != null) {
            chainWrapper.set(MarketOrderInfo::getPersonId, marketOrderInfo.getPersonId());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getPersonName())) {
            chainWrapper.set(MarketOrderInfo::getPersonName, marketOrderInfo.getPersonName());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getRecipientType())) {
            chainWrapper.set(MarketOrderInfo::getRecipientType, marketOrderInfo.getRecipientType());
        }
        if (marketOrderInfo.getRecipientId() != null) {
            chainWrapper.set(MarketOrderInfo::getRecipientId, marketOrderInfo.getRecipientId());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getRecipientName())) {
            chainWrapper.set(MarketOrderInfo::getRecipientName, marketOrderInfo.getRecipientName());
        }
        if (marketOrderInfo.getReservationTime() != null) {
            chainWrapper.set(MarketOrderInfo::getReservationTime, marketOrderInfo.getReservationTime());
        }
        if (marketOrderInfo.getServerId() != null) {
            chainWrapper.set(MarketOrderInfo::getServerId, marketOrderInfo.getServerId());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getServerName())) {
            chainWrapper.set(MarketOrderInfo::getServerName, marketOrderInfo.getServerName());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getServerTel())) {
            chainWrapper.set(MarketOrderInfo::getServerTel, marketOrderInfo.getServerTel());
        }
        if (marketOrderInfo.getPayTime() != null) {
            chainWrapper.set(MarketOrderInfo::getPayTime, marketOrderInfo.getPayTime());
        }
        if (marketOrderInfo.getSendTime() != null) {
            chainWrapper.set(MarketOrderInfo::getSendTime, marketOrderInfo.getSendTime());
        }
        if (marketOrderInfo.getEndTime() != null) {
            chainWrapper.set(MarketOrderInfo::getEndTime, marketOrderInfo.getEndTime());
        }
        if (marketOrderInfo.getCancelTime() != null) {
            chainWrapper.set(MarketOrderInfo::getCancelTime, marketOrderInfo.getCancelTime());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getPayState())) {
            chainWrapper.set(MarketOrderInfo::getPayState, marketOrderInfo.getPayState());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getDeleteStatus())) {
            chainWrapper.set(MarketOrderInfo::getDeleteStatus, marketOrderInfo.getDeleteStatus());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getCategoryType())) {
            chainWrapper.set(MarketOrderInfo::getCategoryType, marketOrderInfo.getCategoryType());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getCloseType())) {
            chainWrapper.set(MarketOrderInfo::getCloseType, marketOrderInfo.getCloseType());
        }
        if (marketOrderInfo.getDataSource() != null) {
            chainWrapper.set(MarketOrderInfo::getDataSource, marketOrderInfo.getDataSource());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getRemark())) {
            chainWrapper.set(MarketOrderInfo::getRemark, marketOrderInfo.getRemark());
        }
        if (marketOrderInfo.getCreateUser() != null) {
            chainWrapper.set(MarketOrderInfo::getCreateUser, marketOrderInfo.getCreateUser());
        }
        if (marketOrderInfo.getCreateDept() != null) {
            chainWrapper.set(MarketOrderInfo::getCreateDept, marketOrderInfo.getCreateDept());
        }
        if (marketOrderInfo.getCreateTime() != null) {
            chainWrapper.set(MarketOrderInfo::getCreateTime, marketOrderInfo.getCreateTime());
        }
        if (marketOrderInfo.getUpdateUser() != null) {
            chainWrapper.set(MarketOrderInfo::getUpdateUser, marketOrderInfo.getUpdateUser());
        }
        if (marketOrderInfo.getUpdateTime() != null) {
            chainWrapper.set(MarketOrderInfo::getUpdateTime, marketOrderInfo.getUpdateTime());
        }
        if (marketOrderInfo.getStatus() != null) {
            chainWrapper.set(MarketOrderInfo::getStatus, marketOrderInfo.getStatus());
        }
        if (marketOrderInfo.getIsDeleted() != null) {
            chainWrapper.set(MarketOrderInfo::getIsDeleted, marketOrderInfo.getIsDeleted());
        }
        if (marketOrderInfo.getAreaCode() != null) {
            chainWrapper.set(MarketOrderInfo::getAreaCode, marketOrderInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getAreaName())) {
            chainWrapper.set(MarketOrderInfo::getAreaName, marketOrderInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getStartImg())) {
            chainWrapper.set(MarketOrderInfo::getStartImg, marketOrderInfo.getStartImg());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getEndImg())) {
            chainWrapper.set(MarketOrderInfo::getEndImg, marketOrderInfo.getEndImg());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getVideoUrl())) {
            chainWrapper.set(MarketOrderInfo::getVideoUrl, marketOrderInfo.getVideoUrl());
        }
        if (StringUtil.isNotBlank(marketOrderInfo.getOutTradeNo())) {
            chainWrapper.set(MarketOrderInfo::getOutTradeNo, marketOrderInfo.getOutTradeNo());
        }
        if (marketOrderInfo.getIsAssign() != null) {
            chainWrapper.set(MarketOrderInfo::getIsAssign, marketOrderInfo.getIsAssign());
        }
        if (marketOrderInfo.getAssignTime() != null) {
            chainWrapper.set(MarketOrderInfo::getAssignTime, marketOrderInfo.getAssignTime());
        }
        if (marketOrderInfo.getAcceptTime() != null) {
            chainWrapper.set(MarketOrderInfo::getAcceptTime, marketOrderInfo.getAcceptTime());
        }
        if (marketOrderInfo.getConfirmState() != null) {
            chainWrapper.set(MarketOrderInfo::getConfirmState, marketOrderInfo.getConfirmState());
        }
        if (marketOrderInfo.getConfirmTime() != null) {
            chainWrapper.set(MarketOrderInfo::getConfirmTime, marketOrderInfo.getConfirmTime());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketOrderInfo::getId, marketOrderInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketOrderInfo.getId());
        } else {
            return marketOrderInfo;
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
    public boolean saveMarketOrderInfoBatch(List<MarketOrderInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketOrderInfo marketOrderInfo : insertList) {
            //使用默认的雪花算法生成
            marketOrderInfo.setId(null);
            //marketOrderInfo.setCreatedDt(currentDte);
            //marketOrderInfo.setUpdatedDt(currentDte);
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
    public Integer deleteMarketOrderInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketOrderInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Object valueAddedRevenue(HealthDto healthDto) {
        HashMap<String, Object> result = new HashMap<>();
        //本月物品
        LambdaQueryWrapper<MarketOrderInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(MarketOrderInfo::getPayState,1);
        if(healthDto.getStratTime() != null && healthDto.getEndTime() != null){
            wrapper.ge(MarketOrderInfo::getCreateTime, healthDto.getStratTime()).le(MarketOrderInfo::getCreateTime, healthDto.getEndTime());
        }
        List<MarketOrderInfo> list = list(wrapper);
        if(list==null || list.size()==0){
            result.put("mark", 0);
        }
        double total = list.stream().collect(Collectors.summingDouble(MarketOrderInfo::getActualTotal));
        BigDecimal bigDecimal = new BigDecimal(total).setScale(2, BigDecimal.ROUND_HALF_UP);
        result.put("mark", bigDecimal);
        return result;
    }

    @Override
    public Map<String, Object> valueAddedRevenueCount(HealthDto healthDto) {
        Map<String, Object> result = new HashMap<>();

        // 用 count() 代替全量 list()，把聚合下推到数据库
        boolean hasMonth = healthDto.getStratTime() != null && healthDto.getEndTime() != null;

        // 累计：物品（categoryType="2"）
        long totalGoodsCount = count(new LambdaQueryWrapper<MarketOrderInfo>()
                .eq(MarketOrderInfo::getPayState, "1")
                .eq(MarketOrderInfo::getCategoryType, "2"));
        // 累计：自选服务（categoryType="1"）
        long totalServiceCount = count(new LambdaQueryWrapper<MarketOrderInfo>()
                .eq(MarketOrderInfo::getPayState, "1")
                .eq(MarketOrderInfo::getCategoryType, "1"));

        long monthGoodsCount = 0;
        long monthServiceCount = 0;
        if (hasMonth) {
            // 本月：物品
            monthGoodsCount = count(new LambdaQueryWrapper<MarketOrderInfo>()
                    .eq(MarketOrderInfo::getPayState, "1")
                    .eq(MarketOrderInfo::getCategoryType, "2")
                    .ge(MarketOrderInfo::getCreateTime, healthDto.getStratTime())
                    .le(MarketOrderInfo::getCreateTime, healthDto.getEndTime()));
            // 本月：自选服务
            monthServiceCount = count(new LambdaQueryWrapper<MarketOrderInfo>()
                    .eq(MarketOrderInfo::getPayState, "1")
                    .eq(MarketOrderInfo::getCategoryType, "1")
                    .ge(MarketOrderInfo::getCreateTime, healthDto.getStratTime())
                    .le(MarketOrderInfo::getCreateTime, healthDto.getEndTime()));
        }

        result.put("monthGoodsCount", monthGoodsCount);
        result.put("totalGoodsCount", totalGoodsCount);
        result.put("monthServiceCount", monthServiceCount);
        result.put("totalServiceCount", totalServiceCount);
        return result;
    }
}


