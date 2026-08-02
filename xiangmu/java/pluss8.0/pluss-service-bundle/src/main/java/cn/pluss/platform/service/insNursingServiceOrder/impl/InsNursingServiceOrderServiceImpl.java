package cn.pluss.platform.service.insNursingServiceOrder.impl;

import cn.pluss.platform.mapper.InsNursingServiceOrderMapper;
import cn.pluss.platform.model.entity.InsNursingServiceOrder;
import cn.pluss.platform.service.insNursingServiceOrder.InsNursingServiceOrderService;
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
@Service("insNursingServiceOrderService")
public class InsNursingServiceOrderServiceImpl extends ServiceImpl< InsNursingServiceOrderMapper, InsNursingServiceOrder> implements InsNursingServiceOrderService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingServiceOrderServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingServiceOrder> queryPage(Map map) {
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
    public InsNursingServiceOrder queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingServiceOrder 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingServiceOrder queryOne(InsNursingServiceOrder insNursingServiceOrder){
        LambdaQueryWrapper<InsNursingServiceOrder> queryWrapper = getQueryWrapper(insNursingServiceOrder);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingServiceOrder
    * @return
    */
    @Override
    public List<InsNursingServiceOrder> queryList(InsNursingServiceOrder insNursingServiceOrder) {
        LambdaQueryWrapper<InsNursingServiceOrder> queryWrapper = getQueryWrapper(insNursingServiceOrder);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingServiceOrder
    * @return
    */
    public static LambdaQueryWrapper<InsNursingServiceOrder> getQueryWrapper(InsNursingServiceOrder insNursingServiceOrder){
        LambdaQueryWrapper<InsNursingServiceOrder> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingServiceOrder.getId() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getId, insNursingServiceOrder.getId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getTenantId())) {
            queryWrapper.eq(InsNursingServiceOrder::getTenantId, insNursingServiceOrder.getTenantId());
        }
        if (insNursingServiceOrder.getCorpId() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getCorpId, insNursingServiceOrder.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getCorpName())) {
            queryWrapper.eq(InsNursingServiceOrder::getCorpName, insNursingServiceOrder.getCorpName());
        }
        if (insNursingServiceOrder.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getInstitutionId, insNursingServiceOrder.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getInstitutionName())) {
            queryWrapper.eq(InsNursingServiceOrder::getInstitutionName, insNursingServiceOrder.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getOrderCode())) {
            queryWrapper.eq(InsNursingServiceOrder::getOrderCode, insNursingServiceOrder.getOrderCode());
        }
        if (insNursingServiceOrder.getCheckId() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getCheckId, insNursingServiceOrder.getCheckId());
        }
        if (insNursingServiceOrder.getCheckDate() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getCheckDate, insNursingServiceOrder.getCheckDate());
        }
        if (insNursingServiceOrder.getElderId() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getElderId, insNursingServiceOrder.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getElderName())) {
            queryWrapper.eq(InsNursingServiceOrder::getElderName, insNursingServiceOrder.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getIdCard())) {
            queryWrapper.eq(InsNursingServiceOrder::getIdCard, insNursingServiceOrder.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getLinkTel())) {
            queryWrapper.eq(InsNursingServiceOrder::getLinkTel, insNursingServiceOrder.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getSex())) {
            queryWrapper.eq(InsNursingServiceOrder::getSex, insNursingServiceOrder.getSex());
        }
        if (insNursingServiceOrder.getServiceTime() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getServiceTime, insNursingServiceOrder.getServiceTime());
        }
        if (insNursingServiceOrder.getTypeId() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getTypeId, insNursingServiceOrder.getTypeId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getTypeName())) {
            queryWrapper.eq(InsNursingServiceOrder::getTypeName, insNursingServiceOrder.getTypeName());
        }
        if (insNursingServiceOrder.getItemId() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getItemId, insNursingServiceOrder.getItemId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getItemName())) {
            queryWrapper.eq(InsNursingServiceOrder::getItemName, insNursingServiceOrder.getItemName());
        }
        if (insNursingServiceOrder.getItemPrice() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getItemPrice, insNursingServiceOrder.getItemPrice());
        }
        if (insNursingServiceOrder.getBuyNumber() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getBuyNumber, insNursingServiceOrder.getBuyNumber());
        }
        if (insNursingServiceOrder.getTotalAmount() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getTotalAmount, insNursingServiceOrder.getTotalAmount());
        }
        if (insNursingServiceOrder.getServiceState() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getServiceState, insNursingServiceOrder.getServiceState());
        }
        if (insNursingServiceOrder.getServiceStartTime() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getServiceStartTime, insNursingServiceOrder.getServiceStartTime());
        }
        if (insNursingServiceOrder.getServiceEndTime() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getServiceEndTime, insNursingServiceOrder.getServiceEndTime());
        }
        if (insNursingServiceOrder.getPayState() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getPayState, insNursingServiceOrder.getPayState());
        }
        if (insNursingServiceOrder.getPayMethod() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getPayMethod, insNursingServiceOrder.getPayMethod());
        }
        if (insNursingServiceOrder.getStaffId() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getStaffId, insNursingServiceOrder.getStaffId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getStaffName())) {
            queryWrapper.eq(InsNursingServiceOrder::getStaffName, insNursingServiceOrder.getStaffName());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getRevocationReason())) {
            queryWrapper.eq(InsNursingServiceOrder::getRevocationReason, insNursingServiceOrder.getRevocationReason());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getImgPath())) {
            queryWrapper.eq(InsNursingServiceOrder::getImgPath, insNursingServiceOrder.getImgPath());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getAreaCode())) {
            queryWrapper.eq(InsNursingServiceOrder::getAreaCode, insNursingServiceOrder.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getAreaName())) {
            queryWrapper.eq(InsNursingServiceOrder::getAreaName, insNursingServiceOrder.getAreaName());
        }
        if (insNursingServiceOrder.getNextDate() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getNextDate, insNursingServiceOrder.getNextDate());
        }
        if (insNursingServiceOrder.getServiceDuration() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getServiceDuration, insNursingServiceOrder.getServiceDuration());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getRemark())) {
            queryWrapper.eq(InsNursingServiceOrder::getRemark, insNursingServiceOrder.getRemark());
        }
        if (insNursingServiceOrder.getCreateUser() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getCreateUser, insNursingServiceOrder.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingServiceOrder.getCreateName())) {
            queryWrapper.eq(InsNursingServiceOrder::getCreateName, insNursingServiceOrder.getCreateName());
        }
        if (insNursingServiceOrder.getCreateDept() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getCreateDept, insNursingServiceOrder.getCreateDept());
        }
        if (insNursingServiceOrder.getCreateTime() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getCreateTime, insNursingServiceOrder.getCreateTime());
        }
        if (insNursingServiceOrder.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getUpdateUser, insNursingServiceOrder.getUpdateUser());
        }
        if (insNursingServiceOrder.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getUpdateTime, insNursingServiceOrder.getUpdateTime());
        }
        if (insNursingServiceOrder.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getIsDeleted, insNursingServiceOrder.getIsDeleted());
        }
        if (insNursingServiceOrder.getStatus() != null) {
            queryWrapper.eq(InsNursingServiceOrder::getStatus, insNursingServiceOrder.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingServiceOrder 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingServiceOrder insert(InsNursingServiceOrder insNursingServiceOrder) {
        insNursingServiceOrder.setId(null);
        getBaseMapper().insert(insNursingServiceOrder);
        return insNursingServiceOrder;
    }

    /**
    * 更新数据
    *
    * @param insNursingServiceOrder 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingServiceOrder update(InsNursingServiceOrder insNursingServiceOrder) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingServiceOrder> chainWrapper = new LambdaUpdateChainWrapper<InsNursingServiceOrder>(getBaseMapper());
        if (insNursingServiceOrder.getId() != null) {
            chainWrapper.set(InsNursingServiceOrder::getId, insNursingServiceOrder.getId());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getTenantId())) {
            chainWrapper.set(InsNursingServiceOrder::getTenantId, insNursingServiceOrder.getTenantId());
        }
        if (insNursingServiceOrder.getCorpId() != null) {
            chainWrapper.set(InsNursingServiceOrder::getCorpId, insNursingServiceOrder.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getCorpName())) {
            chainWrapper.set(InsNursingServiceOrder::getCorpName, insNursingServiceOrder.getCorpName());
        }
        if (insNursingServiceOrder.getInstitutionId() != null) {
            chainWrapper.set(InsNursingServiceOrder::getInstitutionId, insNursingServiceOrder.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getInstitutionName())) {
            chainWrapper.set(InsNursingServiceOrder::getInstitutionName, insNursingServiceOrder.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getOrderCode())) {
            chainWrapper.set(InsNursingServiceOrder::getOrderCode, insNursingServiceOrder.getOrderCode());
        }
        if (insNursingServiceOrder.getCheckId() != null) {
            chainWrapper.set(InsNursingServiceOrder::getCheckId, insNursingServiceOrder.getCheckId());
        }
        if (insNursingServiceOrder.getCheckDate() != null) {
            chainWrapper.set(InsNursingServiceOrder::getCheckDate, insNursingServiceOrder.getCheckDate());
        }
        if (insNursingServiceOrder.getElderId() != null) {
            chainWrapper.set(InsNursingServiceOrder::getElderId, insNursingServiceOrder.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getElderName())) {
            chainWrapper.set(InsNursingServiceOrder::getElderName, insNursingServiceOrder.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getIdCard())) {
            chainWrapper.set(InsNursingServiceOrder::getIdCard, insNursingServiceOrder.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getLinkTel())) {
            chainWrapper.set(InsNursingServiceOrder::getLinkTel, insNursingServiceOrder.getLinkTel());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getSex())) {
            chainWrapper.set(InsNursingServiceOrder::getSex, insNursingServiceOrder.getSex());
        }
        if (insNursingServiceOrder.getServiceTime() != null) {
            chainWrapper.set(InsNursingServiceOrder::getServiceTime, insNursingServiceOrder.getServiceTime());
        }
        if (insNursingServiceOrder.getTypeId() != null) {
            chainWrapper.set(InsNursingServiceOrder::getTypeId, insNursingServiceOrder.getTypeId());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getTypeName())) {
            chainWrapper.set(InsNursingServiceOrder::getTypeName, insNursingServiceOrder.getTypeName());
        }
        if (insNursingServiceOrder.getItemId() != null) {
            chainWrapper.set(InsNursingServiceOrder::getItemId, insNursingServiceOrder.getItemId());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getItemName())) {
            chainWrapper.set(InsNursingServiceOrder::getItemName, insNursingServiceOrder.getItemName());
        }
        if (insNursingServiceOrder.getItemPrice() != null) {
            chainWrapper.set(InsNursingServiceOrder::getItemPrice, insNursingServiceOrder.getItemPrice());
        }
        if (insNursingServiceOrder.getBuyNumber() != null) {
            chainWrapper.set(InsNursingServiceOrder::getBuyNumber, insNursingServiceOrder.getBuyNumber());
        }
        if (insNursingServiceOrder.getTotalAmount() != null) {
            chainWrapper.set(InsNursingServiceOrder::getTotalAmount, insNursingServiceOrder.getTotalAmount());
        }
        if (insNursingServiceOrder.getServiceState() != null) {
            chainWrapper.set(InsNursingServiceOrder::getServiceState, insNursingServiceOrder.getServiceState());
        }
        if (insNursingServiceOrder.getServiceStartTime() != null) {
            chainWrapper.set(InsNursingServiceOrder::getServiceStartTime, insNursingServiceOrder.getServiceStartTime());
        }
        if (insNursingServiceOrder.getServiceEndTime() != null) {
            chainWrapper.set(InsNursingServiceOrder::getServiceEndTime, insNursingServiceOrder.getServiceEndTime());
        }
        if (insNursingServiceOrder.getPayState() != null) {
            chainWrapper.set(InsNursingServiceOrder::getPayState, insNursingServiceOrder.getPayState());
        }
        if (insNursingServiceOrder.getPayMethod() != null) {
            chainWrapper.set(InsNursingServiceOrder::getPayMethod, insNursingServiceOrder.getPayMethod());
        }
        if (insNursingServiceOrder.getStaffId() != null) {
            chainWrapper.set(InsNursingServiceOrder::getStaffId, insNursingServiceOrder.getStaffId());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getStaffName())) {
            chainWrapper.set(InsNursingServiceOrder::getStaffName, insNursingServiceOrder.getStaffName());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getRevocationReason())) {
            chainWrapper.set(InsNursingServiceOrder::getRevocationReason, insNursingServiceOrder.getRevocationReason());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getImgPath())) {
            chainWrapper.set(InsNursingServiceOrder::getImgPath, insNursingServiceOrder.getImgPath());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getAreaCode())) {
            chainWrapper.set(InsNursingServiceOrder::getAreaCode, insNursingServiceOrder.getAreaCode());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getAreaName())) {
            chainWrapper.set(InsNursingServiceOrder::getAreaName, insNursingServiceOrder.getAreaName());
        }
        if (insNursingServiceOrder.getNextDate() != null) {
            chainWrapper.set(InsNursingServiceOrder::getNextDate, insNursingServiceOrder.getNextDate());
        }
        if (insNursingServiceOrder.getServiceDuration() != null) {
            chainWrapper.set(InsNursingServiceOrder::getServiceDuration, insNursingServiceOrder.getServiceDuration());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getRemark())) {
            chainWrapper.set(InsNursingServiceOrder::getRemark, insNursingServiceOrder.getRemark());
        }
        if (insNursingServiceOrder.getCreateUser() != null) {
            chainWrapper.set(InsNursingServiceOrder::getCreateUser, insNursingServiceOrder.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingServiceOrder.getCreateName())) {
            chainWrapper.set(InsNursingServiceOrder::getCreateName, insNursingServiceOrder.getCreateName());
        }
        if (insNursingServiceOrder.getCreateDept() != null) {
            chainWrapper.set(InsNursingServiceOrder::getCreateDept, insNursingServiceOrder.getCreateDept());
        }
        if (insNursingServiceOrder.getCreateTime() != null) {
            chainWrapper.set(InsNursingServiceOrder::getCreateTime, insNursingServiceOrder.getCreateTime());
        }
        if (insNursingServiceOrder.getUpdateUser() != null) {
            chainWrapper.set(InsNursingServiceOrder::getUpdateUser, insNursingServiceOrder.getUpdateUser());
        }
        if (insNursingServiceOrder.getUpdateTime() != null) {
            chainWrapper.set(InsNursingServiceOrder::getUpdateTime, insNursingServiceOrder.getUpdateTime());
        }
        if (insNursingServiceOrder.getIsDeleted() != null) {
            chainWrapper.set(InsNursingServiceOrder::getIsDeleted, insNursingServiceOrder.getIsDeleted());
        }
        if (insNursingServiceOrder.getStatus() != null) {
            chainWrapper.set(InsNursingServiceOrder::getStatus, insNursingServiceOrder.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingServiceOrder::getId, insNursingServiceOrder.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingServiceOrder.getId());
        } else {
            return insNursingServiceOrder;
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
    public boolean saveInsNursingServiceOrderBatch(List<InsNursingServiceOrder> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingServiceOrder insNursingServiceOrder : insertList) {
            //使用默认的雪花算法生成
            insNursingServiceOrder.setId(null);
            //insNursingServiceOrder.setCreatedDt(currentDte);
            //insNursingServiceOrder.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingServiceOrderBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingServiceOrder> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


