package cn.pluss.platform.service.carePaymentDetail.impl;

import cn.pluss.platform.mapper.CarePaymentDetailMapper;
import cn.pluss.platform.model.entity.CarePaymentDetail;
import cn.pluss.platform.service.carePaymentDetail.CarePaymentDetailService;
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
@Service("carePaymentDetailService")
public class CarePaymentDetailServiceImpl extends ServiceImpl< CarePaymentDetailMapper, CarePaymentDetail> implements CarePaymentDetailService {
    private static final Logger logger = LoggerFactory.getLogger(CarePaymentDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CarePaymentDetail> queryPage(Map map) {
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
    public CarePaymentDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param carePaymentDetail 实例对象
    * @return 实例对象
    */
    @Override
    public CarePaymentDetail queryOne(CarePaymentDetail carePaymentDetail){
        LambdaQueryWrapper<CarePaymentDetail> queryWrapper = getQueryWrapper(carePaymentDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param carePaymentDetail
    * @return
    */
    @Override
    public List<CarePaymentDetail> queryList(CarePaymentDetail carePaymentDetail) {
        LambdaQueryWrapper<CarePaymentDetail> queryWrapper = getQueryWrapper(carePaymentDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param carePaymentDetail
    * @return
    */
    public static LambdaQueryWrapper<CarePaymentDetail> getQueryWrapper(CarePaymentDetail carePaymentDetail){
        LambdaQueryWrapper<CarePaymentDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (carePaymentDetail.getId() != null) {
            queryWrapper.eq(CarePaymentDetail::getId, carePaymentDetail.getId());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getTenantId())) {
            queryWrapper.eq(CarePaymentDetail::getTenantId, carePaymentDetail.getTenantId());
        }
        if (carePaymentDetail.getCorpId() != null) {
            queryWrapper.eq(CarePaymentDetail::getCorpId, carePaymentDetail.getCorpId());
        }
        if (carePaymentDetail.getInstitutionId() != null) {
            queryWrapper.eq(CarePaymentDetail::getInstitutionId, carePaymentDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getInstitutionName())) {
            queryWrapper.eq(CarePaymentDetail::getInstitutionName, carePaymentDetail.getInstitutionName());
        }
        if (carePaymentDetail.getElderId() != null) {
            queryWrapper.eq(CarePaymentDetail::getElderId, carePaymentDetail.getElderId());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getElderName())) {
            queryWrapper.eq(CarePaymentDetail::getElderName, carePaymentDetail.getElderName());
        }
        if (carePaymentDetail.getPaymentId() != null) {
            queryWrapper.eq(CarePaymentDetail::getPaymentId, carePaymentDetail.getPaymentId());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getSerialCode())) {
            queryWrapper.eq(CarePaymentDetail::getSerialCode, carePaymentDetail.getSerialCode());
        }
        if (carePaymentDetail.getItemId() != null) {
            queryWrapper.eq(CarePaymentDetail::getItemId, carePaymentDetail.getItemId());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getItemName())) {
            queryWrapper.eq(CarePaymentDetail::getItemName, carePaymentDetail.getItemName());
        }
        if (carePaymentDetail.getItemPrice() != null) {
            queryWrapper.eq(CarePaymentDetail::getItemPrice, carePaymentDetail.getItemPrice());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getFeeType())) {
            queryWrapper.eq(CarePaymentDetail::getFeeType, carePaymentDetail.getFeeType());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getCostType())) {
            queryWrapper.eq(CarePaymentDetail::getCostType, carePaymentDetail.getCostType());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getIsRefund())) {
            queryWrapper.eq(CarePaymentDetail::getIsRefund, carePaymentDetail.getIsRefund());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getIsPreferential())) {
            queryWrapper.eq(CarePaymentDetail::getIsPreferential, carePaymentDetail.getIsPreferential());
        }
        if (carePaymentDetail.getAmount() != null) {
            queryWrapper.eq(CarePaymentDetail::getAmount, carePaymentDetail.getAmount());
        }
        if (carePaymentDetail.getPreferentialAmount() != null) {
            queryWrapper.eq(CarePaymentDetail::getPreferentialAmount, carePaymentDetail.getPreferentialAmount());
        }
        if (carePaymentDetail.getCostAmount() != null) {
            queryWrapper.eq(CarePaymentDetail::getCostAmount, carePaymentDetail.getCostAmount());
        }
        if (carePaymentDetail.getStartDate() != null) {
            queryWrapper.eq(CarePaymentDetail::getStartDate, carePaymentDetail.getStartDate());
        }
        if (carePaymentDetail.getEndDate() != null) {
            queryWrapper.eq(CarePaymentDetail::getEndDate, carePaymentDetail.getEndDate());
        }
        if (carePaymentDetail.getChangeId() != null) {
            queryWrapper.eq(CarePaymentDetail::getChangeId, carePaymentDetail.getChangeId());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getOrderIds())) {
            queryWrapper.eq(CarePaymentDetail::getOrderIds, carePaymentDetail.getOrderIds());
        }
        if (carePaymentDetail.getAreaCode() != null) {
            queryWrapper.eq(CarePaymentDetail::getAreaCode, carePaymentDetail.getAreaCode());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getAreaName())) {
            queryWrapper.eq(CarePaymentDetail::getAreaName, carePaymentDetail.getAreaName());
        }
        if (StringUtil.isNotEmpty(carePaymentDetail.getRemark())) {
            queryWrapper.eq(CarePaymentDetail::getRemark, carePaymentDetail.getRemark());
        }
        if (carePaymentDetail.getCreateUser() != null) {
            queryWrapper.eq(CarePaymentDetail::getCreateUser, carePaymentDetail.getCreateUser());
        }
        if (carePaymentDetail.getCreateDept() != null) {
            queryWrapper.eq(CarePaymentDetail::getCreateDept, carePaymentDetail.getCreateDept());
        }
        if (carePaymentDetail.getCreateTime() != null) {
            queryWrapper.eq(CarePaymentDetail::getCreateTime, carePaymentDetail.getCreateTime());
        }
        if (carePaymentDetail.getUpdateUser() != null) {
            queryWrapper.eq(CarePaymentDetail::getUpdateUser, carePaymentDetail.getUpdateUser());
        }
        if (carePaymentDetail.getUpdateTime() != null) {
            queryWrapper.eq(CarePaymentDetail::getUpdateTime, carePaymentDetail.getUpdateTime());
        }
        if (carePaymentDetail.getStatus() != null) {
            queryWrapper.eq(CarePaymentDetail::getStatus, carePaymentDetail.getStatus());
        }
        if (carePaymentDetail.getIsDeleted() != null) {
            queryWrapper.eq(CarePaymentDetail::getIsDeleted, carePaymentDetail.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param carePaymentDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CarePaymentDetail insert(CarePaymentDetail carePaymentDetail) {
        carePaymentDetail.setId(null);
        getBaseMapper().insert(carePaymentDetail);
        return carePaymentDetail;
    }

    /**
    * 更新数据
    *
    * @param carePaymentDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CarePaymentDetail update(CarePaymentDetail carePaymentDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CarePaymentDetail> chainWrapper = new LambdaUpdateChainWrapper<CarePaymentDetail>(getBaseMapper());
        if (carePaymentDetail.getId() != null) {
            chainWrapper.set(CarePaymentDetail::getId, carePaymentDetail.getId());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getTenantId())) {
            chainWrapper.set(CarePaymentDetail::getTenantId, carePaymentDetail.getTenantId());
        }
        if (carePaymentDetail.getCorpId() != null) {
            chainWrapper.set(CarePaymentDetail::getCorpId, carePaymentDetail.getCorpId());
        }
        if (carePaymentDetail.getInstitutionId() != null) {
            chainWrapper.set(CarePaymentDetail::getInstitutionId, carePaymentDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getInstitutionName())) {
            chainWrapper.set(CarePaymentDetail::getInstitutionName, carePaymentDetail.getInstitutionName());
        }
        if (carePaymentDetail.getElderId() != null) {
            chainWrapper.set(CarePaymentDetail::getElderId, carePaymentDetail.getElderId());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getElderName())) {
            chainWrapper.set(CarePaymentDetail::getElderName, carePaymentDetail.getElderName());
        }
        if (carePaymentDetail.getPaymentId() != null) {
            chainWrapper.set(CarePaymentDetail::getPaymentId, carePaymentDetail.getPaymentId());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getSerialCode())) {
            chainWrapper.set(CarePaymentDetail::getSerialCode, carePaymentDetail.getSerialCode());
        }
        if (carePaymentDetail.getItemId() != null) {
            chainWrapper.set(CarePaymentDetail::getItemId, carePaymentDetail.getItemId());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getItemName())) {
            chainWrapper.set(CarePaymentDetail::getItemName, carePaymentDetail.getItemName());
        }
        if (carePaymentDetail.getItemPrice() != null) {
            chainWrapper.set(CarePaymentDetail::getItemPrice, carePaymentDetail.getItemPrice());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getFeeType())) {
            chainWrapper.set(CarePaymentDetail::getFeeType, carePaymentDetail.getFeeType());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getCostType())) {
            chainWrapper.set(CarePaymentDetail::getCostType, carePaymentDetail.getCostType());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getIsRefund())) {
            chainWrapper.set(CarePaymentDetail::getIsRefund, carePaymentDetail.getIsRefund());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getIsPreferential())) {
            chainWrapper.set(CarePaymentDetail::getIsPreferential, carePaymentDetail.getIsPreferential());
        }
        if (carePaymentDetail.getAmount() != null) {
            chainWrapper.set(CarePaymentDetail::getAmount, carePaymentDetail.getAmount());
        }
        if (carePaymentDetail.getPreferentialAmount() != null) {
            chainWrapper.set(CarePaymentDetail::getPreferentialAmount, carePaymentDetail.getPreferentialAmount());
        }
        if (carePaymentDetail.getCostAmount() != null) {
            chainWrapper.set(CarePaymentDetail::getCostAmount, carePaymentDetail.getCostAmount());
        }
        if (carePaymentDetail.getStartDate() != null) {
            chainWrapper.set(CarePaymentDetail::getStartDate, carePaymentDetail.getStartDate());
        }
        if (carePaymentDetail.getEndDate() != null) {
            chainWrapper.set(CarePaymentDetail::getEndDate, carePaymentDetail.getEndDate());
        }
        if (carePaymentDetail.getChangeId() != null) {
            chainWrapper.set(CarePaymentDetail::getChangeId, carePaymentDetail.getChangeId());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getOrderIds())) {
            chainWrapper.set(CarePaymentDetail::getOrderIds, carePaymentDetail.getOrderIds());
        }
        if (carePaymentDetail.getAreaCode() != null) {
            chainWrapper.set(CarePaymentDetail::getAreaCode, carePaymentDetail.getAreaCode());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getAreaName())) {
            chainWrapper.set(CarePaymentDetail::getAreaName, carePaymentDetail.getAreaName());
        }
        if (StringUtil.isNotBlank(carePaymentDetail.getRemark())) {
            chainWrapper.set(CarePaymentDetail::getRemark, carePaymentDetail.getRemark());
        }
        if (carePaymentDetail.getCreateUser() != null) {
            chainWrapper.set(CarePaymentDetail::getCreateUser, carePaymentDetail.getCreateUser());
        }
        if (carePaymentDetail.getCreateDept() != null) {
            chainWrapper.set(CarePaymentDetail::getCreateDept, carePaymentDetail.getCreateDept());
        }
        if (carePaymentDetail.getCreateTime() != null) {
            chainWrapper.set(CarePaymentDetail::getCreateTime, carePaymentDetail.getCreateTime());
        }
        if (carePaymentDetail.getUpdateUser() != null) {
            chainWrapper.set(CarePaymentDetail::getUpdateUser, carePaymentDetail.getUpdateUser());
        }
        if (carePaymentDetail.getUpdateTime() != null) {
            chainWrapper.set(CarePaymentDetail::getUpdateTime, carePaymentDetail.getUpdateTime());
        }
        if (carePaymentDetail.getStatus() != null) {
            chainWrapper.set(CarePaymentDetail::getStatus, carePaymentDetail.getStatus());
        }
        if (carePaymentDetail.getIsDeleted() != null) {
            chainWrapper.set(CarePaymentDetail::getIsDeleted, carePaymentDetail.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CarePaymentDetail::getId, carePaymentDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(carePaymentDetail.getId());
        } else {
            return carePaymentDetail;
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
    public boolean saveCarePaymentDetailBatch(List<CarePaymentDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CarePaymentDetail carePaymentDetail : insertList) {
            //使用默认的雪花算法生成
            carePaymentDetail.setId(null);
            //carePaymentDetail.setCreatedDt(currentDte);
            //carePaymentDetail.setUpdatedDt(currentDte);
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
    public Integer deleteCarePaymentDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CarePaymentDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


