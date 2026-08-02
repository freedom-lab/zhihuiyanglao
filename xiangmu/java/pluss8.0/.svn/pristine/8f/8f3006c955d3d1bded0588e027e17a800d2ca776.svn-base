package cn.pluss.platform.service.marketOrderRefund.impl;

import cn.pluss.platform.mapper.MarketOrderRefundMapper;
import cn.pluss.platform.model.entity.MarketOrderRefund;
import cn.pluss.platform.service.marketOrderRefund.MarketOrderRefundService;
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
@Service("marketOrderRefundService")
public class MarketOrderRefundServiceImpl extends ServiceImpl< MarketOrderRefundMapper, MarketOrderRefund> implements MarketOrderRefundService {
    private static final Logger logger = LoggerFactory.getLogger(MarketOrderRefundServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketOrderRefund> queryPage(Map map) {
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
    public MarketOrderRefund queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketOrderRefund 实例对象
    * @return 实例对象
    */
    @Override
    public MarketOrderRefund queryOne(MarketOrderRefund marketOrderRefund){
        LambdaQueryWrapper<MarketOrderRefund> queryWrapper = getQueryWrapper(marketOrderRefund);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketOrderRefund
    * @return
    */
    @Override
    public List<MarketOrderRefund> queryList(MarketOrderRefund marketOrderRefund) {
        LambdaQueryWrapper<MarketOrderRefund> queryWrapper = getQueryWrapper(marketOrderRefund);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketOrderRefund
    * @return
    */
    public static LambdaQueryWrapper<MarketOrderRefund> getQueryWrapper(MarketOrderRefund marketOrderRefund){
        LambdaQueryWrapper<MarketOrderRefund> queryWrapper = new LambdaQueryWrapper<>();
        if (marketOrderRefund.getId() != null) {
            queryWrapper.eq(MarketOrderRefund::getId, marketOrderRefund.getId());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getTenantId())) {
            queryWrapper.eq(MarketOrderRefund::getTenantId, marketOrderRefund.getTenantId());
        }
        if (marketOrderRefund.getCorpId() != null) {
            queryWrapper.eq(MarketOrderRefund::getCorpId, marketOrderRefund.getCorpId());
        }
        if (marketOrderRefund.getInstitutionId() != null) {
            queryWrapper.eq(MarketOrderRefund::getInstitutionId, marketOrderRefund.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getInstitutionName())) {
            queryWrapper.eq(MarketOrderRefund::getInstitutionName, marketOrderRefund.getInstitutionName());
        }
        if (marketOrderRefund.getOrderId() != null) {
            queryWrapper.eq(MarketOrderRefund::getOrderId, marketOrderRefund.getOrderId());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getOrderCode())) {
            queryWrapper.eq(MarketOrderRefund::getOrderCode, marketOrderRefund.getOrderCode());
        }
        if (marketOrderRefund.getOrderAmount() != null) {
            queryWrapper.eq(MarketOrderRefund::getOrderAmount, marketOrderRefund.getOrderAmount());
        }
        if (marketOrderRefund.getOrderItemId() != null) {
            queryWrapper.eq(MarketOrderRefund::getOrderItemId, marketOrderRefund.getOrderItemId());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getRefundCode())) {
            queryWrapper.eq(MarketOrderRefund::getRefundCode, marketOrderRefund.getRefundCode());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getOutTradeNo())) {
            queryWrapper.eq(MarketOrderRefund::getOutTradeNo, marketOrderRefund.getOutTradeNo());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getOutRefundNo())) {
            queryWrapper.eq(MarketOrderRefund::getOutRefundNo, marketOrderRefund.getOutRefundNo());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getPayType())) {
            queryWrapper.eq(MarketOrderRefund::getPayType, marketOrderRefund.getPayType());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getPersonType())) {
            queryWrapper.eq(MarketOrderRefund::getPersonType, marketOrderRefund.getPersonType());
        }
        if (marketOrderRefund.getPersonId() != null) {
            queryWrapper.eq(MarketOrderRefund::getPersonId, marketOrderRefund.getPersonId());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getPersonName())) {
            queryWrapper.eq(MarketOrderRefund::getPersonName, marketOrderRefund.getPersonName());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getIdCard())) {
            queryWrapper.eq(MarketOrderRefund::getIdCard, marketOrderRefund.getIdCard());
        }
        if (marketOrderRefund.getGoodsNum() != null) {
            queryWrapper.eq(MarketOrderRefund::getGoodsNum, marketOrderRefund.getGoodsNum());
        }
        if (marketOrderRefund.getRefundAmount() != null) {
            queryWrapper.eq(MarketOrderRefund::getRefundAmount, marketOrderRefund.getRefundAmount());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getApplyType())) {
            queryWrapper.eq(MarketOrderRefund::getApplyType, marketOrderRefund.getApplyType());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getAuditState())) {
            queryWrapper.eq(MarketOrderRefund::getAuditState, marketOrderRefund.getAuditState());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getAuditName())) {
            queryWrapper.eq(MarketOrderRefund::getAuditName, marketOrderRefund.getAuditName());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getAuditMemo())) {
            queryWrapper.eq(MarketOrderRefund::getAuditMemo, marketOrderRefund.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getReturnState())) {
            queryWrapper.eq(MarketOrderRefund::getReturnState, marketOrderRefund.getReturnState());
        }
        if (marketOrderRefund.getApplyTime() != null) {
            queryWrapper.eq(MarketOrderRefund::getApplyTime, marketOrderRefund.getApplyTime());
        }
        if (marketOrderRefund.getHandleTime() != null) {
            queryWrapper.eq(MarketOrderRefund::getHandleTime, marketOrderRefund.getHandleTime());
        }
        if (marketOrderRefund.getRefundTime() != null) {
            queryWrapper.eq(MarketOrderRefund::getRefundTime, marketOrderRefund.getRefundTime());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getPics())) {
            queryWrapper.eq(MarketOrderRefund::getPics, marketOrderRefund.getPics());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getApplyReason())) {
            queryWrapper.eq(MarketOrderRefund::getApplyReason, marketOrderRefund.getApplyReason());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getSellerMemo())) {
            queryWrapper.eq(MarketOrderRefund::getSellerMemo, marketOrderRefund.getSellerMemo());
        }
        if (marketOrderRefund.getExpressId() != null) {
            queryWrapper.eq(MarketOrderRefund::getExpressId, marketOrderRefund.getExpressId());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getExpressName())) {
            queryWrapper.eq(MarketOrderRefund::getExpressName, marketOrderRefund.getExpressName());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getExpressNo())) {
            queryWrapper.eq(MarketOrderRefund::getExpressNo, marketOrderRefund.getExpressNo());
        }
        if (marketOrderRefund.getSendTime() != null) {
            queryWrapper.eq(MarketOrderRefund::getSendTime, marketOrderRefund.getSendTime());
        }
        if (marketOrderRefund.getReceiveTime() != null) {
            queryWrapper.eq(MarketOrderRefund::getReceiveTime, marketOrderRefund.getReceiveTime());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getReceiveMemo())) {
            queryWrapper.eq(MarketOrderRefund::getReceiveMemo, marketOrderRefund.getReceiveMemo());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getRemark())) {
            queryWrapper.eq(MarketOrderRefund::getRemark, marketOrderRefund.getRemark());
        }
        if (marketOrderRefund.getCreateUser() != null) {
            queryWrapper.eq(MarketOrderRefund::getCreateUser, marketOrderRefund.getCreateUser());
        }
        if (marketOrderRefund.getCreateDept() != null) {
            queryWrapper.eq(MarketOrderRefund::getCreateDept, marketOrderRefund.getCreateDept());
        }
        if (marketOrderRefund.getCreateTime() != null) {
            queryWrapper.eq(MarketOrderRefund::getCreateTime, marketOrderRefund.getCreateTime());
        }
        if (marketOrderRefund.getUpdateUser() != null) {
            queryWrapper.eq(MarketOrderRefund::getUpdateUser, marketOrderRefund.getUpdateUser());
        }
        if (marketOrderRefund.getUpdateTime() != null) {
            queryWrapper.eq(MarketOrderRefund::getUpdateTime, marketOrderRefund.getUpdateTime());
        }
        if (marketOrderRefund.getStatus() != null) {
            queryWrapper.eq(MarketOrderRefund::getStatus, marketOrderRefund.getStatus());
        }
        if (marketOrderRefund.getIsDeleted() != null) {
            queryWrapper.eq(MarketOrderRefund::getIsDeleted, marketOrderRefund.getIsDeleted());
        }
        if (marketOrderRefund.getAreaCode() != null) {
            queryWrapper.eq(MarketOrderRefund::getAreaCode, marketOrderRefund.getAreaCode());
        }
        if (StringUtil.isNotEmpty(marketOrderRefund.getAreaName())) {
            queryWrapper.eq(MarketOrderRefund::getAreaName, marketOrderRefund.getAreaName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketOrderRefund 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketOrderRefund insert(MarketOrderRefund marketOrderRefund) {
        marketOrderRefund.setId(null);
        getBaseMapper().insert(marketOrderRefund);
        return marketOrderRefund;
    }

    /**
    * 更新数据
    *
    * @param marketOrderRefund 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketOrderRefund update(MarketOrderRefund marketOrderRefund) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketOrderRefund> chainWrapper = new LambdaUpdateChainWrapper<MarketOrderRefund>(getBaseMapper());
        if (marketOrderRefund.getId() != null) {
            chainWrapper.set(MarketOrderRefund::getId, marketOrderRefund.getId());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getTenantId())) {
            chainWrapper.set(MarketOrderRefund::getTenantId, marketOrderRefund.getTenantId());
        }
        if (marketOrderRefund.getCorpId() != null) {
            chainWrapper.set(MarketOrderRefund::getCorpId, marketOrderRefund.getCorpId());
        }
        if (marketOrderRefund.getInstitutionId() != null) {
            chainWrapper.set(MarketOrderRefund::getInstitutionId, marketOrderRefund.getInstitutionId());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getInstitutionName())) {
            chainWrapper.set(MarketOrderRefund::getInstitutionName, marketOrderRefund.getInstitutionName());
        }
        if (marketOrderRefund.getOrderId() != null) {
            chainWrapper.set(MarketOrderRefund::getOrderId, marketOrderRefund.getOrderId());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getOrderCode())) {
            chainWrapper.set(MarketOrderRefund::getOrderCode, marketOrderRefund.getOrderCode());
        }
        if (marketOrderRefund.getOrderAmount() != null) {
            chainWrapper.set(MarketOrderRefund::getOrderAmount, marketOrderRefund.getOrderAmount());
        }
        if (marketOrderRefund.getOrderItemId() != null) {
            chainWrapper.set(MarketOrderRefund::getOrderItemId, marketOrderRefund.getOrderItemId());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getRefundCode())) {
            chainWrapper.set(MarketOrderRefund::getRefundCode, marketOrderRefund.getRefundCode());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getOutTradeNo())) {
            chainWrapper.set(MarketOrderRefund::getOutTradeNo, marketOrderRefund.getOutTradeNo());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getOutRefundNo())) {
            chainWrapper.set(MarketOrderRefund::getOutRefundNo, marketOrderRefund.getOutRefundNo());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getPayType())) {
            chainWrapper.set(MarketOrderRefund::getPayType, marketOrderRefund.getPayType());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getPersonType())) {
            chainWrapper.set(MarketOrderRefund::getPersonType, marketOrderRefund.getPersonType());
        }
        if (marketOrderRefund.getPersonId() != null) {
            chainWrapper.set(MarketOrderRefund::getPersonId, marketOrderRefund.getPersonId());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getPersonName())) {
            chainWrapper.set(MarketOrderRefund::getPersonName, marketOrderRefund.getPersonName());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getIdCard())) {
            chainWrapper.set(MarketOrderRefund::getIdCard, marketOrderRefund.getIdCard());
        }
        if (marketOrderRefund.getGoodsNum() != null) {
            chainWrapper.set(MarketOrderRefund::getGoodsNum, marketOrderRefund.getGoodsNum());
        }
        if (marketOrderRefund.getRefundAmount() != null) {
            chainWrapper.set(MarketOrderRefund::getRefundAmount, marketOrderRefund.getRefundAmount());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getApplyType())) {
            chainWrapper.set(MarketOrderRefund::getApplyType, marketOrderRefund.getApplyType());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getAuditState())) {
            chainWrapper.set(MarketOrderRefund::getAuditState, marketOrderRefund.getAuditState());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getAuditName())) {
            chainWrapper.set(MarketOrderRefund::getAuditName, marketOrderRefund.getAuditName());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getAuditMemo())) {
            chainWrapper.set(MarketOrderRefund::getAuditMemo, marketOrderRefund.getAuditMemo());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getReturnState())) {
            chainWrapper.set(MarketOrderRefund::getReturnState, marketOrderRefund.getReturnState());
        }
        if (marketOrderRefund.getApplyTime() != null) {
            chainWrapper.set(MarketOrderRefund::getApplyTime, marketOrderRefund.getApplyTime());
        }
        if (marketOrderRefund.getHandleTime() != null) {
            chainWrapper.set(MarketOrderRefund::getHandleTime, marketOrderRefund.getHandleTime());
        }
        if (marketOrderRefund.getRefundTime() != null) {
            chainWrapper.set(MarketOrderRefund::getRefundTime, marketOrderRefund.getRefundTime());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getPics())) {
            chainWrapper.set(MarketOrderRefund::getPics, marketOrderRefund.getPics());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getApplyReason())) {
            chainWrapper.set(MarketOrderRefund::getApplyReason, marketOrderRefund.getApplyReason());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getSellerMemo())) {
            chainWrapper.set(MarketOrderRefund::getSellerMemo, marketOrderRefund.getSellerMemo());
        }
        if (marketOrderRefund.getExpressId() != null) {
            chainWrapper.set(MarketOrderRefund::getExpressId, marketOrderRefund.getExpressId());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getExpressName())) {
            chainWrapper.set(MarketOrderRefund::getExpressName, marketOrderRefund.getExpressName());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getExpressNo())) {
            chainWrapper.set(MarketOrderRefund::getExpressNo, marketOrderRefund.getExpressNo());
        }
        if (marketOrderRefund.getSendTime() != null) {
            chainWrapper.set(MarketOrderRefund::getSendTime, marketOrderRefund.getSendTime());
        }
        if (marketOrderRefund.getReceiveTime() != null) {
            chainWrapper.set(MarketOrderRefund::getReceiveTime, marketOrderRefund.getReceiveTime());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getReceiveMemo())) {
            chainWrapper.set(MarketOrderRefund::getReceiveMemo, marketOrderRefund.getReceiveMemo());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getRemark())) {
            chainWrapper.set(MarketOrderRefund::getRemark, marketOrderRefund.getRemark());
        }
        if (marketOrderRefund.getCreateUser() != null) {
            chainWrapper.set(MarketOrderRefund::getCreateUser, marketOrderRefund.getCreateUser());
        }
        if (marketOrderRefund.getCreateDept() != null) {
            chainWrapper.set(MarketOrderRefund::getCreateDept, marketOrderRefund.getCreateDept());
        }
        if (marketOrderRefund.getCreateTime() != null) {
            chainWrapper.set(MarketOrderRefund::getCreateTime, marketOrderRefund.getCreateTime());
        }
        if (marketOrderRefund.getUpdateUser() != null) {
            chainWrapper.set(MarketOrderRefund::getUpdateUser, marketOrderRefund.getUpdateUser());
        }
        if (marketOrderRefund.getUpdateTime() != null) {
            chainWrapper.set(MarketOrderRefund::getUpdateTime, marketOrderRefund.getUpdateTime());
        }
        if (marketOrderRefund.getStatus() != null) {
            chainWrapper.set(MarketOrderRefund::getStatus, marketOrderRefund.getStatus());
        }
        if (marketOrderRefund.getIsDeleted() != null) {
            chainWrapper.set(MarketOrderRefund::getIsDeleted, marketOrderRefund.getIsDeleted());
        }
        if (marketOrderRefund.getAreaCode() != null) {
            chainWrapper.set(MarketOrderRefund::getAreaCode, marketOrderRefund.getAreaCode());
        }
        if (StringUtil.isNotBlank(marketOrderRefund.getAreaName())) {
            chainWrapper.set(MarketOrderRefund::getAreaName, marketOrderRefund.getAreaName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketOrderRefund::getId, marketOrderRefund.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketOrderRefund.getId());
        } else {
            return marketOrderRefund;
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
    public boolean saveMarketOrderRefundBatch(List<MarketOrderRefund> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketOrderRefund marketOrderRefund : insertList) {
            //使用默认的雪花算法生成
            marketOrderRefund.setId(null);
            //marketOrderRefund.setCreatedDt(currentDte);
            //marketOrderRefund.setUpdatedDt(currentDte);
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
    public Integer deleteMarketOrderRefundBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketOrderRefund> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


