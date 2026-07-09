package cn.pluss.platform.service.insCanteenOrderInfo.impl;

import cn.pluss.platform.mapper.InsCanteenOrderInfoMapper;
import cn.pluss.platform.model.entity.InsCanteenOrderInfo;
import cn.pluss.platform.service.insCanteenOrderInfo.InsCanteenOrderInfoService;
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
@Service("insCanteenOrderInfoService")
public class InsCanteenOrderInfoServiceImpl extends ServiceImpl< InsCanteenOrderInfoMapper, InsCanteenOrderInfo> implements InsCanteenOrderInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenOrderInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenOrderInfo> queryPage(Map map) {
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
    public InsCanteenOrderInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenOrderInfo queryOne(InsCanteenOrderInfo insCanteenOrderInfo){
        LambdaQueryWrapper<InsCanteenOrderInfo> queryWrapper = getQueryWrapper(insCanteenOrderInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenOrderInfo
    * @return
    */
    @Override
    public List<InsCanteenOrderInfo> queryList(InsCanteenOrderInfo insCanteenOrderInfo) {
        LambdaQueryWrapper<InsCanteenOrderInfo> queryWrapper = getQueryWrapper(insCanteenOrderInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenOrderInfo
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenOrderInfo> getQueryWrapper(InsCanteenOrderInfo insCanteenOrderInfo){
        LambdaQueryWrapper<InsCanteenOrderInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenOrderInfo.getId() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getId, insCanteenOrderInfo.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getTenantId())) {
            queryWrapper.eq(InsCanteenOrderInfo::getTenantId, insCanteenOrderInfo.getTenantId());
        }
        if (insCanteenOrderInfo.getCorpId() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getCorpId, insCanteenOrderInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getCorpName())) {
            queryWrapper.eq(InsCanteenOrderInfo::getCorpName, insCanteenOrderInfo.getCorpName());
        }
        if (insCanteenOrderInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getInstitutionId, insCanteenOrderInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getInstitutionName())) {
            queryWrapper.eq(InsCanteenOrderInfo::getInstitutionName, insCanteenOrderInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getCardNo())) {
            queryWrapper.eq(InsCanteenOrderInfo::getCardNo, insCanteenOrderInfo.getCardNo());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getMealNum())) {
            queryWrapper.eq(InsCanteenOrderInfo::getMealNum, insCanteenOrderInfo.getMealNum());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getOrderCode())) {
            queryWrapper.eq(InsCanteenOrderInfo::getOrderCode, insCanteenOrderInfo.getOrderCode());
        }
        if (insCanteenOrderInfo.getOrderType() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getOrderType, insCanteenOrderInfo.getOrderType());
        }
        if (insCanteenOrderInfo.getOrderState() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getOrderState, insCanteenOrderInfo.getOrderState());
        }
        if (insCanteenOrderInfo.getPersonType() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getPersonType, insCanteenOrderInfo.getPersonType());
        }
        if (insCanteenOrderInfo.getCheckId() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getCheckId, insCanteenOrderInfo.getCheckId());
        }
        if (insCanteenOrderInfo.getCheckDate() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getCheckDate, insCanteenOrderInfo.getCheckDate());
        }
        if (insCanteenOrderInfo.getElderId() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getElderId, insCanteenOrderInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getElderName())) {
            queryWrapper.eq(InsCanteenOrderInfo::getElderName, insCanteenOrderInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getIdCard())) {
            queryWrapper.eq(InsCanteenOrderInfo::getIdCard, insCanteenOrderInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getSex())) {
            queryWrapper.eq(InsCanteenOrderInfo::getSex, insCanteenOrderInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getLinkTel())) {
            queryWrapper.eq(InsCanteenOrderInfo::getLinkTel, insCanteenOrderInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getAddress())) {
            queryWrapper.eq(InsCanteenOrderInfo::getAddress, insCanteenOrderInfo.getAddress());
        }
        if (insCanteenOrderInfo.getTotalAmount() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getTotalAmount, insCanteenOrderInfo.getTotalAmount());
        }
        if (insCanteenOrderInfo.getPayAmount() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getPayAmount, insCanteenOrderInfo.getPayAmount());
        }
        if (insCanteenOrderInfo.getOfferAmount() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getOfferAmount, insCanteenOrderInfo.getOfferAmount());
        }
        if (insCanteenOrderInfo.getMealType() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getMealType, insCanteenOrderInfo.getMealType());
        }
        if (insCanteenOrderInfo.getOrderTime() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getOrderTime, insCanteenOrderInfo.getOrderTime());
        }
        if (insCanteenOrderInfo.getPayState() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getPayState, insCanteenOrderInfo.getPayState());
        }
        if (insCanteenOrderInfo.getPayMethod() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getPayMethod, insCanteenOrderInfo.getPayMethod());
        }
        if (insCanteenOrderInfo.getPayTime() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getPayTime, insCanteenOrderInfo.getPayTime());
        }
        if (insCanteenOrderInfo.getOrderSource() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getOrderSource, insCanteenOrderInfo.getOrderSource());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getIdentifyState())) {
            queryWrapper.eq(InsCanteenOrderInfo::getIdentifyState, insCanteenOrderInfo.getIdentifyState());
        }
        if (insCanteenOrderInfo.getStaffId() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getStaffId, insCanteenOrderInfo.getStaffId());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getStaffName())) {
            queryWrapper.eq(InsCanteenOrderInfo::getStaffName, insCanteenOrderInfo.getStaffName());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getStaffLinkTel())) {
            queryWrapper.eq(InsCanteenOrderInfo::getStaffLinkTel, insCanteenOrderInfo.getStaffLinkTel());
        }
        if (insCanteenOrderInfo.getPlanTime() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getPlanTime, insCanteenOrderInfo.getPlanTime());
        }
        if (insCanteenOrderInfo.getServiceStartTime() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getServiceStartTime, insCanteenOrderInfo.getServiceStartTime());
        }
        if (insCanteenOrderInfo.getServiceEndTime() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getServiceEndTime, insCanteenOrderInfo.getServiceEndTime());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getTakeImgs())) {
            queryWrapper.eq(InsCanteenOrderInfo::getTakeImgs, insCanteenOrderInfo.getTakeImgs());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getDeliveryImgs())) {
            queryWrapper.eq(InsCanteenOrderInfo::getDeliveryImgs, insCanteenOrderInfo.getDeliveryImgs());
        }
        if (insCanteenOrderInfo.getRefundTime() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getRefundTime, insCanteenOrderInfo.getRefundTime());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getRefundReason())) {
            queryWrapper.eq(InsCanteenOrderInfo::getRefundReason, insCanteenOrderInfo.getRefundReason());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getRemark())) {
            queryWrapper.eq(InsCanteenOrderInfo::getRemark, insCanteenOrderInfo.getRemark());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getAreaCode())) {
            queryWrapper.eq(InsCanteenOrderInfo::getAreaCode, insCanteenOrderInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getAreaName())) {
            queryWrapper.eq(InsCanteenOrderInfo::getAreaName, insCanteenOrderInfo.getAreaName());
        }
        if (insCanteenOrderInfo.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getCreateUser, insCanteenOrderInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getCreateName())) {
            queryWrapper.eq(InsCanteenOrderInfo::getCreateName, insCanteenOrderInfo.getCreateName());
        }
        if (insCanteenOrderInfo.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getCreateDept, insCanteenOrderInfo.getCreateDept());
        }
        if (insCanteenOrderInfo.getCreateTime() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getCreateTime, insCanteenOrderInfo.getCreateTime());
        }
        if (insCanteenOrderInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getUpdateUser, insCanteenOrderInfo.getUpdateUser());
        }
        if (insCanteenOrderInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getUpdateTime, insCanteenOrderInfo.getUpdateTime());
        }
        if (insCanteenOrderInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getIsDeleted, insCanteenOrderInfo.getIsDeleted());
        }
        if (insCanteenOrderInfo.getStatus() != null) {
            queryWrapper.eq(InsCanteenOrderInfo::getStatus, insCanteenOrderInfo.getStatus());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderInfo.getOutTradeNo())) {
            queryWrapper.eq(InsCanteenOrderInfo::getOutTradeNo, insCanteenOrderInfo.getOutTradeNo());
        }
        if (insCanteenOrderInfo.getOrderStateList() != null && !insCanteenOrderInfo.getOrderStateList().isEmpty()) {
            queryWrapper.in(InsCanteenOrderInfo::getOrderState, insCanteenOrderInfo.getOrderStateList());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenOrderInfo insert(InsCanteenOrderInfo insCanteenOrderInfo) {
        insCanteenOrderInfo.setId(null);
        getBaseMapper().insert(insCanteenOrderInfo);
        return insCanteenOrderInfo;
    }

    /**
    * 更新数据
    *
    * @param insCanteenOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenOrderInfo update(InsCanteenOrderInfo insCanteenOrderInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenOrderInfo> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenOrderInfo>(getBaseMapper());
        if (insCanteenOrderInfo.getId() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getId, insCanteenOrderInfo.getId());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getTenantId())) {
            chainWrapper.set(InsCanteenOrderInfo::getTenantId, insCanteenOrderInfo.getTenantId());
        }
        if (insCanteenOrderInfo.getCorpId() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getCorpId, insCanteenOrderInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getCorpName())) {
            chainWrapper.set(InsCanteenOrderInfo::getCorpName, insCanteenOrderInfo.getCorpName());
        }
        if (insCanteenOrderInfo.getInstitutionId() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getInstitutionId, insCanteenOrderInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getInstitutionName())) {
            chainWrapper.set(InsCanteenOrderInfo::getInstitutionName, insCanteenOrderInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getCardNo())) {
            chainWrapper.set(InsCanteenOrderInfo::getCardNo, insCanteenOrderInfo.getCardNo());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getMealNum())) {
            chainWrapper.set(InsCanteenOrderInfo::getMealNum, insCanteenOrderInfo.getMealNum());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getOrderCode())) {
            chainWrapper.set(InsCanteenOrderInfo::getOrderCode, insCanteenOrderInfo.getOrderCode());
        }
        if (insCanteenOrderInfo.getOrderType() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getOrderType, insCanteenOrderInfo.getOrderType());
        }
        if (insCanteenOrderInfo.getOrderState() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getOrderState, insCanteenOrderInfo.getOrderState());
        }
        if (insCanteenOrderInfo.getPersonType() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getPersonType, insCanteenOrderInfo.getPersonType());
        }
        if (insCanteenOrderInfo.getCheckId() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getCheckId, insCanteenOrderInfo.getCheckId());
        }
        if (insCanteenOrderInfo.getCheckDate() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getCheckDate, insCanteenOrderInfo.getCheckDate());
        }
        if (insCanteenOrderInfo.getElderId() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getElderId, insCanteenOrderInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getElderName())) {
            chainWrapper.set(InsCanteenOrderInfo::getElderName, insCanteenOrderInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getIdCard())) {
            chainWrapper.set(InsCanteenOrderInfo::getIdCard, insCanteenOrderInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getSex())) {
            chainWrapper.set(InsCanteenOrderInfo::getSex, insCanteenOrderInfo.getSex());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getLinkTel())) {
            chainWrapper.set(InsCanteenOrderInfo::getLinkTel, insCanteenOrderInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getAddress())) {
            chainWrapper.set(InsCanteenOrderInfo::getAddress, insCanteenOrderInfo.getAddress());
        }
        if (insCanteenOrderInfo.getTotalAmount() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getTotalAmount, insCanteenOrderInfo.getTotalAmount());
        }
        if (insCanteenOrderInfo.getPayAmount() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getPayAmount, insCanteenOrderInfo.getPayAmount());
        }
        if (insCanteenOrderInfo.getOfferAmount() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getOfferAmount, insCanteenOrderInfo.getOfferAmount());
        }
        if (insCanteenOrderInfo.getMealType() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getMealType, insCanteenOrderInfo.getMealType());
        }
        if (insCanteenOrderInfo.getOrderTime() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getOrderTime, insCanteenOrderInfo.getOrderTime());
        }
        if (insCanteenOrderInfo.getPayState() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getPayState, insCanteenOrderInfo.getPayState());
        }
        if (insCanteenOrderInfo.getPayMethod() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getPayMethod, insCanteenOrderInfo.getPayMethod());
        }
        if (insCanteenOrderInfo.getPayTime() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getPayTime, insCanteenOrderInfo.getPayTime());
        }
        if (insCanteenOrderInfo.getOrderSource() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getOrderSource, insCanteenOrderInfo.getOrderSource());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getIdentifyState())) {
            chainWrapper.set(InsCanteenOrderInfo::getIdentifyState, insCanteenOrderInfo.getIdentifyState());
        }
        if (insCanteenOrderInfo.getStaffId() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getStaffId, insCanteenOrderInfo.getStaffId());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getStaffName())) {
            chainWrapper.set(InsCanteenOrderInfo::getStaffName, insCanteenOrderInfo.getStaffName());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getStaffLinkTel())) {
            chainWrapper.set(InsCanteenOrderInfo::getStaffLinkTel, insCanteenOrderInfo.getStaffLinkTel());
        }
        if (insCanteenOrderInfo.getPlanTime() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getPlanTime, insCanteenOrderInfo.getPlanTime());
        }
        if (insCanteenOrderInfo.getServiceStartTime() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getServiceStartTime, insCanteenOrderInfo.getServiceStartTime());
        }
        if (insCanteenOrderInfo.getServiceEndTime() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getServiceEndTime, insCanteenOrderInfo.getServiceEndTime());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getTakeImgs())) {
            chainWrapper.set(InsCanteenOrderInfo::getTakeImgs, insCanteenOrderInfo.getTakeImgs());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getDeliveryImgs())) {
            chainWrapper.set(InsCanteenOrderInfo::getDeliveryImgs, insCanteenOrderInfo.getDeliveryImgs());
        }
        if (insCanteenOrderInfo.getRefundTime() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getRefundTime, insCanteenOrderInfo.getRefundTime());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getRefundReason())) {
            chainWrapper.set(InsCanteenOrderInfo::getRefundReason, insCanteenOrderInfo.getRefundReason());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getRemark())) {
            chainWrapper.set(InsCanteenOrderInfo::getRemark, insCanteenOrderInfo.getRemark());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getAreaCode())) {
            chainWrapper.set(InsCanteenOrderInfo::getAreaCode, insCanteenOrderInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getAreaName())) {
            chainWrapper.set(InsCanteenOrderInfo::getAreaName, insCanteenOrderInfo.getAreaName());
        }
        if (insCanteenOrderInfo.getCreateUser() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getCreateUser, insCanteenOrderInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getCreateName())) {
            chainWrapper.set(InsCanteenOrderInfo::getCreateName, insCanteenOrderInfo.getCreateName());
        }
        if (insCanteenOrderInfo.getCreateDept() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getCreateDept, insCanteenOrderInfo.getCreateDept());
        }
        if (insCanteenOrderInfo.getCreateTime() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getCreateTime, insCanteenOrderInfo.getCreateTime());
        }
        if (insCanteenOrderInfo.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getUpdateUser, insCanteenOrderInfo.getUpdateUser());
        }
        if (insCanteenOrderInfo.getUpdateTime() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getUpdateTime, insCanteenOrderInfo.getUpdateTime());
        }
        if (insCanteenOrderInfo.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getIsDeleted, insCanteenOrderInfo.getIsDeleted());
        }
        if (insCanteenOrderInfo.getStatus() != null) {
            chainWrapper.set(InsCanteenOrderInfo::getStatus, insCanteenOrderInfo.getStatus());
        }
        if (StringUtil.isNotBlank(insCanteenOrderInfo.getOutTradeNo())) {
            chainWrapper.set(InsCanteenOrderInfo::getOutTradeNo, insCanteenOrderInfo.getOutTradeNo());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenOrderInfo::getId, insCanteenOrderInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenOrderInfo.getId());
        } else {
            return insCanteenOrderInfo;
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
    public boolean saveInsCanteenOrderInfoBatch(List<InsCanteenOrderInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenOrderInfo insCanteenOrderInfo : insertList) {
            //使用默认的雪花算法生成
            insCanteenOrderInfo.setId(null);
            //insCanteenOrderInfo.setCreatedDt(currentDte);
            //insCanteenOrderInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenOrderInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenOrderInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


