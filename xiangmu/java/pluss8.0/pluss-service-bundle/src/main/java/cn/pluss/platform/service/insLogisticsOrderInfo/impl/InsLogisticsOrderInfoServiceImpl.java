package cn.pluss.platform.service.insLogisticsOrderInfo.impl;

import cn.pluss.platform.mapper.InsLogisticsOrderInfoMapper;
import cn.pluss.platform.model.entity.InsLogisticsOrderInfo;
import cn.pluss.platform.service.insLogisticsOrderInfo.InsLogisticsOrderInfoService;
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
@Service("insLogisticsOrderInfoService")
public class InsLogisticsOrderInfoServiceImpl extends ServiceImpl< InsLogisticsOrderInfoMapper, InsLogisticsOrderInfo> implements InsLogisticsOrderInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsOrderInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsOrderInfo> queryPage(Map map) {
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
    public InsLogisticsOrderInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsOrderInfo queryOne(InsLogisticsOrderInfo insLogisticsOrderInfo){
        LambdaQueryWrapper<InsLogisticsOrderInfo> queryWrapper = getQueryWrapper(insLogisticsOrderInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsOrderInfo
    * @return
    */
    @Override
    public List<InsLogisticsOrderInfo> queryList(InsLogisticsOrderInfo insLogisticsOrderInfo) {
        LambdaQueryWrapper<InsLogisticsOrderInfo> queryWrapper = getQueryWrapper(insLogisticsOrderInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsOrderInfo
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsOrderInfo> getQueryWrapper(InsLogisticsOrderInfo insLogisticsOrderInfo){
        LambdaQueryWrapper<InsLogisticsOrderInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsOrderInfo.getId() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getId, insLogisticsOrderInfo.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getTenantId())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getTenantId, insLogisticsOrderInfo.getTenantId());
        }
        if (insLogisticsOrderInfo.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getCorpId, insLogisticsOrderInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getCorpName())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getCorpName, insLogisticsOrderInfo.getCorpName());
        }
        if (insLogisticsOrderInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getInstitutionId, insLogisticsOrderInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getInstitutionName, insLogisticsOrderInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getOrderCode())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getOrderCode, insLogisticsOrderInfo.getOrderCode());
        }
        if (insLogisticsOrderInfo.getOrderState() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getOrderState, insLogisticsOrderInfo.getOrderState());
        }
        if (insLogisticsOrderInfo.getCheckId() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getCheckId, insLogisticsOrderInfo.getCheckId());
        }
        if (insLogisticsOrderInfo.getCheckDate() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getCheckDate, insLogisticsOrderInfo.getCheckDate());
        }
        if (insLogisticsOrderInfo.getElderId() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getElderId, insLogisticsOrderInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getElderName())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getElderName, insLogisticsOrderInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getIdCard())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getIdCard, insLogisticsOrderInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getSex())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getSex, insLogisticsOrderInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getLinkTel())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getLinkTel, insLogisticsOrderInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getAddress())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getAddress, insLogisticsOrderInfo.getAddress());
        }
        if (insLogisticsOrderInfo.getTotalAmount() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getTotalAmount, insLogisticsOrderInfo.getTotalAmount());
        }
        if (insLogisticsOrderInfo.getPayAmount() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getPayAmount, insLogisticsOrderInfo.getPayAmount());
        }
        if (insLogisticsOrderInfo.getOfferAmount() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getOfferAmount, insLogisticsOrderInfo.getOfferAmount());
        }
        if (insLogisticsOrderInfo.getOrderTime() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getOrderTime, insLogisticsOrderInfo.getOrderTime());
        }
        if (insLogisticsOrderInfo.getPayState() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getPayState, insLogisticsOrderInfo.getPayState());
        }
        if (insLogisticsOrderInfo.getPayMethod() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getPayMethod, insLogisticsOrderInfo.getPayMethod());
        }
        if (insLogisticsOrderInfo.getPayTime() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getPayTime, insLogisticsOrderInfo.getPayTime());
        }
        if (insLogisticsOrderInfo.getOrderSource() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getOrderSource, insLogisticsOrderInfo.getOrderSource());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getIdentifyState())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getIdentifyState, insLogisticsOrderInfo.getIdentifyState());
        }
        if (insLogisticsOrderInfo.getStaffId() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getStaffId, insLogisticsOrderInfo.getStaffId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getStaffName())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getStaffName, insLogisticsOrderInfo.getStaffName());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getStaffLinkTel())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getStaffLinkTel, insLogisticsOrderInfo.getStaffLinkTel());
        }
        if (insLogisticsOrderInfo.getSendState() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getSendState, insLogisticsOrderInfo.getSendState());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getSendImg())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getSendImg, insLogisticsOrderInfo.getSendImg());
        }
        if (insLogisticsOrderInfo.getSendTime() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getSendTime, insLogisticsOrderInfo.getSendTime());
        }
        if (insLogisticsOrderInfo.getRefundTime() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getRefundTime, insLogisticsOrderInfo.getRefundTime());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getRefundReason())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getRefundReason, insLogisticsOrderInfo.getRefundReason());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getRemark())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getRemark, insLogisticsOrderInfo.getRemark());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getAreaCode())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getAreaCode, insLogisticsOrderInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getAreaName())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getAreaName, insLogisticsOrderInfo.getAreaName());
        }
        if (insLogisticsOrderInfo.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getCreateUser, insLogisticsOrderInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getCreateName())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getCreateName, insLogisticsOrderInfo.getCreateName());
        }
        if (insLogisticsOrderInfo.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getCreateDept, insLogisticsOrderInfo.getCreateDept());
        }
        if (insLogisticsOrderInfo.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getCreateTime, insLogisticsOrderInfo.getCreateTime());
        }
        if (insLogisticsOrderInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getUpdateUser, insLogisticsOrderInfo.getUpdateUser());
        }
        if (insLogisticsOrderInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getUpdateTime, insLogisticsOrderInfo.getUpdateTime());
        }
        if (insLogisticsOrderInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getIsDeleted, insLogisticsOrderInfo.getIsDeleted());
        }
        if (insLogisticsOrderInfo.getStatus() != null) {
            queryWrapper.eq(InsLogisticsOrderInfo::getStatus, insLogisticsOrderInfo.getStatus());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderInfo.getOutTradeNo())) {
            queryWrapper.eq(InsLogisticsOrderInfo::getOutTradeNo, insLogisticsOrderInfo.getOutTradeNo());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOrderInfo insert(InsLogisticsOrderInfo insLogisticsOrderInfo) {
        insLogisticsOrderInfo.setId(null);
        getBaseMapper().insert(insLogisticsOrderInfo);
        return insLogisticsOrderInfo;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOrderInfo update(InsLogisticsOrderInfo insLogisticsOrderInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsOrderInfo> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsOrderInfo>(getBaseMapper());
        if (insLogisticsOrderInfo.getId() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getId, insLogisticsOrderInfo.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getTenantId())) {
            chainWrapper.set(InsLogisticsOrderInfo::getTenantId, insLogisticsOrderInfo.getTenantId());
        }
        if (insLogisticsOrderInfo.getCorpId() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getCorpId, insLogisticsOrderInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getCorpName())) {
            chainWrapper.set(InsLogisticsOrderInfo::getCorpName, insLogisticsOrderInfo.getCorpName());
        }
        if (insLogisticsOrderInfo.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getInstitutionId, insLogisticsOrderInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getInstitutionName())) {
            chainWrapper.set(InsLogisticsOrderInfo::getInstitutionName, insLogisticsOrderInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getOrderCode())) {
            chainWrapper.set(InsLogisticsOrderInfo::getOrderCode, insLogisticsOrderInfo.getOrderCode());
        }
        if (insLogisticsOrderInfo.getOrderState() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getOrderState, insLogisticsOrderInfo.getOrderState());
        }
        if (insLogisticsOrderInfo.getCheckId() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getCheckId, insLogisticsOrderInfo.getCheckId());
        }
        if (insLogisticsOrderInfo.getCheckDate() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getCheckDate, insLogisticsOrderInfo.getCheckDate());
        }
        if (insLogisticsOrderInfo.getElderId() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getElderId, insLogisticsOrderInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getElderName())) {
            chainWrapper.set(InsLogisticsOrderInfo::getElderName, insLogisticsOrderInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getIdCard())) {
            chainWrapper.set(InsLogisticsOrderInfo::getIdCard, insLogisticsOrderInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getSex())) {
            chainWrapper.set(InsLogisticsOrderInfo::getSex, insLogisticsOrderInfo.getSex());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getLinkTel())) {
            chainWrapper.set(InsLogisticsOrderInfo::getLinkTel, insLogisticsOrderInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getAddress())) {
            chainWrapper.set(InsLogisticsOrderInfo::getAddress, insLogisticsOrderInfo.getAddress());
        }
        if (insLogisticsOrderInfo.getTotalAmount() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getTotalAmount, insLogisticsOrderInfo.getTotalAmount());
        }
        if (insLogisticsOrderInfo.getPayAmount() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getPayAmount, insLogisticsOrderInfo.getPayAmount());
        }
        if (insLogisticsOrderInfo.getOfferAmount() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getOfferAmount, insLogisticsOrderInfo.getOfferAmount());
        }
        if (insLogisticsOrderInfo.getOrderTime() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getOrderTime, insLogisticsOrderInfo.getOrderTime());
        }
        if (insLogisticsOrderInfo.getPayState() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getPayState, insLogisticsOrderInfo.getPayState());
        }
        if (insLogisticsOrderInfo.getPayMethod() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getPayMethod, insLogisticsOrderInfo.getPayMethod());
        }
        if (insLogisticsOrderInfo.getPayTime() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getPayTime, insLogisticsOrderInfo.getPayTime());
        }
        if (insLogisticsOrderInfo.getOrderSource() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getOrderSource, insLogisticsOrderInfo.getOrderSource());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getIdentifyState())) {
            chainWrapper.set(InsLogisticsOrderInfo::getIdentifyState, insLogisticsOrderInfo.getIdentifyState());
        }
        if (insLogisticsOrderInfo.getStaffId() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getStaffId, insLogisticsOrderInfo.getStaffId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getStaffName())) {
            chainWrapper.set(InsLogisticsOrderInfo::getStaffName, insLogisticsOrderInfo.getStaffName());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getStaffLinkTel())) {
            chainWrapper.set(InsLogisticsOrderInfo::getStaffLinkTel, insLogisticsOrderInfo.getStaffLinkTel());
        }
        if (insLogisticsOrderInfo.getSendState() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getSendState, insLogisticsOrderInfo.getSendState());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getSendImg())) {
            chainWrapper.set(InsLogisticsOrderInfo::getSendImg, insLogisticsOrderInfo.getSendImg());
        }
        if (insLogisticsOrderInfo.getSendTime() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getSendTime, insLogisticsOrderInfo.getSendTime());
        }
        if (insLogisticsOrderInfo.getRefundTime() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getRefundTime, insLogisticsOrderInfo.getRefundTime());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getRefundReason())) {
            chainWrapper.set(InsLogisticsOrderInfo::getRefundReason, insLogisticsOrderInfo.getRefundReason());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getRemark())) {
            chainWrapper.set(InsLogisticsOrderInfo::getRemark, insLogisticsOrderInfo.getRemark());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getAreaCode())) {
            chainWrapper.set(InsLogisticsOrderInfo::getAreaCode, insLogisticsOrderInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getAreaName())) {
            chainWrapper.set(InsLogisticsOrderInfo::getAreaName, insLogisticsOrderInfo.getAreaName());
        }
        if (insLogisticsOrderInfo.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getCreateUser, insLogisticsOrderInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getCreateName())) {
            chainWrapper.set(InsLogisticsOrderInfo::getCreateName, insLogisticsOrderInfo.getCreateName());
        }
        if (insLogisticsOrderInfo.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getCreateDept, insLogisticsOrderInfo.getCreateDept());
        }
        if (insLogisticsOrderInfo.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getCreateTime, insLogisticsOrderInfo.getCreateTime());
        }
        if (insLogisticsOrderInfo.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getUpdateUser, insLogisticsOrderInfo.getUpdateUser());
        }
        if (insLogisticsOrderInfo.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getUpdateTime, insLogisticsOrderInfo.getUpdateTime());
        }
        if (insLogisticsOrderInfo.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getIsDeleted, insLogisticsOrderInfo.getIsDeleted());
        }
        if (insLogisticsOrderInfo.getStatus() != null) {
            chainWrapper.set(InsLogisticsOrderInfo::getStatus, insLogisticsOrderInfo.getStatus());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderInfo.getOutTradeNo())) {
            chainWrapper.set(InsLogisticsOrderInfo::getOutTradeNo, insLogisticsOrderInfo.getOutTradeNo());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsOrderInfo::getId, insLogisticsOrderInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsOrderInfo.getId());
        } else {
            return insLogisticsOrderInfo;
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
    public boolean saveInsLogisticsOrderInfoBatch(List<InsLogisticsOrderInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsOrderInfo insLogisticsOrderInfo : insertList) {
            //使用默认的雪花算法生成
            insLogisticsOrderInfo.setId(null);
            //insLogisticsOrderInfo.setCreatedDt(currentDte);
            //insLogisticsOrderInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsOrderInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsOrderInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


