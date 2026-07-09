package cn.pluss.platform.service.insExpensesBillRecordDetail.impl;

import cn.pluss.platform.mapper.InsExpensesBillRecordDetailMapper;
import cn.pluss.platform.model.entity.InsExpensesBillRecordDetail;
import cn.pluss.platform.service.insExpensesBillRecordDetail.InsExpensesBillRecordDetailService;
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
@Service("insExpensesBillRecordDetailService")
public class InsExpensesBillRecordDetailServiceImpl extends ServiceImpl< InsExpensesBillRecordDetailMapper, InsExpensesBillRecordDetail> implements InsExpensesBillRecordDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsExpensesBillRecordDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsExpensesBillRecordDetail> queryPage(Map map) {
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
    public InsExpensesBillRecordDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesBillRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsExpensesBillRecordDetail queryOne(InsExpensesBillRecordDetail insExpensesBillRecordDetail){
        LambdaQueryWrapper<InsExpensesBillRecordDetail> queryWrapper = getQueryWrapper(insExpensesBillRecordDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesBillRecordDetail
    * @return
    */
    @Override
    public List<InsExpensesBillRecordDetail> queryList(InsExpensesBillRecordDetail insExpensesBillRecordDetail) {
        LambdaQueryWrapper<InsExpensesBillRecordDetail> queryWrapper = getQueryWrapper(insExpensesBillRecordDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insExpensesBillRecordDetail
    * @return
    */
    public static LambdaQueryWrapper<InsExpensesBillRecordDetail> getQueryWrapper(InsExpensesBillRecordDetail insExpensesBillRecordDetail){
        LambdaQueryWrapper<InsExpensesBillRecordDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insExpensesBillRecordDetail.getId() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getId, insExpensesBillRecordDetail.getId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getTenantId())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getTenantId, insExpensesBillRecordDetail.getTenantId());
        }
        if (insExpensesBillRecordDetail.getCorpId() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCorpId, insExpensesBillRecordDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getCorpName())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCorpName, insExpensesBillRecordDetail.getCorpName());
        }
        if (insExpensesBillRecordDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getInstitutionId, insExpensesBillRecordDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getInstitutionName())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getInstitutionName, insExpensesBillRecordDetail.getInstitutionName());
        }
        if (insExpensesBillRecordDetail.getCheckId() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCheckId, insExpensesBillRecordDetail.getCheckId());
        }
        if (insExpensesBillRecordDetail.getCheckDate() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCheckDate, insExpensesBillRecordDetail.getCheckDate());
        }
        if (insExpensesBillRecordDetail.getElderId() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getElderId, insExpensesBillRecordDetail.getElderId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getElderName())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getElderName, insExpensesBillRecordDetail.getElderName());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getIdCard())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getIdCard, insExpensesBillRecordDetail.getIdCard());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getSex())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getSex, insExpensesBillRecordDetail.getSex());
        }
        if (insExpensesBillRecordDetail.getBillId() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getBillId, insExpensesBillRecordDetail.getBillId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getBillCode())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getBillCode, insExpensesBillRecordDetail.getBillCode());
        }
        if (insExpensesBillRecordDetail.getPaymentType() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getPaymentType, insExpensesBillRecordDetail.getPaymentType());
        }
        if (insExpensesBillRecordDetail.getReceivableAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getReceivableAmount, insExpensesBillRecordDetail.getReceivableAmount());
        }
        if (insExpensesBillRecordDetail.getActualAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getActualAmount, insExpensesBillRecordDetail.getActualAmount());
        }
        if (insExpensesBillRecordDetail.getPreferentialAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getPreferentialAmount, insExpensesBillRecordDetail.getPreferentialAmount());
        }
        if (insExpensesBillRecordDetail.getDiscountRate() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getDiscountRate, insExpensesBillRecordDetail.getDiscountRate());
        }
        if (insExpensesBillRecordDetail.getTallyType() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getTallyType, insExpensesBillRecordDetail.getTallyType());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getCostMemo())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCostMemo, insExpensesBillRecordDetail.getCostMemo());
        }
        if (insExpensesBillRecordDetail.getPayState() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getPayState, insExpensesBillRecordDetail.getPayState());
        }
        if (insExpensesBillRecordDetail.getItemId() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getItemId, insExpensesBillRecordDetail.getItemId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getItemName())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getItemName, insExpensesBillRecordDetail.getItemName());
        }
        if (insExpensesBillRecordDetail.getItemPrice() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getItemPrice, insExpensesBillRecordDetail.getItemPrice());
        }
        if (insExpensesBillRecordDetail.getCostMode() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCostMode, insExpensesBillRecordDetail.getCostMode());
        }
        if (insExpensesBillRecordDetail.getStartDate() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getStartDate, insExpensesBillRecordDetail.getStartDate());
        }
        if (insExpensesBillRecordDetail.getEndDate() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getEndDate, insExpensesBillRecordDetail.getEndDate());
        }
        if (insExpensesBillRecordDetail.getChangeId() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getChangeId, insExpensesBillRecordDetail.getChangeId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getDetailIds())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getDetailIds, insExpensesBillRecordDetail.getDetailIds());
        }
        if (insExpensesBillRecordDetail.getBillState() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getBillState, insExpensesBillRecordDetail.getBillState());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getAreaCode())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getAreaCode, insExpensesBillRecordDetail.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getAreaName())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getAreaName, insExpensesBillRecordDetail.getAreaName());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getRemark())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getRemark, insExpensesBillRecordDetail.getRemark());
        }
        if (insExpensesBillRecordDetail.getCreateUser() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCreateUser, insExpensesBillRecordDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecordDetail.getCreateName())) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCreateName, insExpensesBillRecordDetail.getCreateName());
        }
        if (insExpensesBillRecordDetail.getCreateDept() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCreateDept, insExpensesBillRecordDetail.getCreateDept());
        }
        if (insExpensesBillRecordDetail.getCreateTime() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getCreateTime, insExpensesBillRecordDetail.getCreateTime());
        }
        if (insExpensesBillRecordDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getUpdateUser, insExpensesBillRecordDetail.getUpdateUser());
        }
        if (insExpensesBillRecordDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getUpdateTime, insExpensesBillRecordDetail.getUpdateTime());
        }
        if (insExpensesBillRecordDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getIsDeleted, insExpensesBillRecordDetail.getIsDeleted());
        }
        if (insExpensesBillRecordDetail.getStatus() != null) {
            queryWrapper.eq(InsExpensesBillRecordDetail::getStatus, insExpensesBillRecordDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insExpensesBillRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesBillRecordDetail insert(InsExpensesBillRecordDetail insExpensesBillRecordDetail) {
        insExpensesBillRecordDetail.setId(null);
        getBaseMapper().insert(insExpensesBillRecordDetail);
        return insExpensesBillRecordDetail;
    }

    /**
    * 更新数据
    *
    * @param insExpensesBillRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesBillRecordDetail update(InsExpensesBillRecordDetail insExpensesBillRecordDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsExpensesBillRecordDetail> chainWrapper = new LambdaUpdateChainWrapper<InsExpensesBillRecordDetail>(getBaseMapper());
        if (insExpensesBillRecordDetail.getId() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getId, insExpensesBillRecordDetail.getId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getTenantId())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getTenantId, insExpensesBillRecordDetail.getTenantId());
        }
        if (insExpensesBillRecordDetail.getCorpId() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCorpId, insExpensesBillRecordDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getCorpName())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCorpName, insExpensesBillRecordDetail.getCorpName());
        }
        if (insExpensesBillRecordDetail.getInstitutionId() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getInstitutionId, insExpensesBillRecordDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getInstitutionName())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getInstitutionName, insExpensesBillRecordDetail.getInstitutionName());
        }
        if (insExpensesBillRecordDetail.getCheckId() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCheckId, insExpensesBillRecordDetail.getCheckId());
        }
        if (insExpensesBillRecordDetail.getCheckDate() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCheckDate, insExpensesBillRecordDetail.getCheckDate());
        }
        if (insExpensesBillRecordDetail.getElderId() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getElderId, insExpensesBillRecordDetail.getElderId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getElderName())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getElderName, insExpensesBillRecordDetail.getElderName());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getIdCard())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getIdCard, insExpensesBillRecordDetail.getIdCard());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getSex())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getSex, insExpensesBillRecordDetail.getSex());
        }
        if (insExpensesBillRecordDetail.getBillId() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getBillId, insExpensesBillRecordDetail.getBillId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getBillCode())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getBillCode, insExpensesBillRecordDetail.getBillCode());
        }
        if (insExpensesBillRecordDetail.getPaymentType() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getPaymentType, insExpensesBillRecordDetail.getPaymentType());
        }
        if (insExpensesBillRecordDetail.getReceivableAmount() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getReceivableAmount, insExpensesBillRecordDetail.getReceivableAmount());
        }
        if (insExpensesBillRecordDetail.getActualAmount() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getActualAmount, insExpensesBillRecordDetail.getActualAmount());
        }
        if (insExpensesBillRecordDetail.getPreferentialAmount() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getPreferentialAmount, insExpensesBillRecordDetail.getPreferentialAmount());
        }
        if (insExpensesBillRecordDetail.getDiscountRate() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getDiscountRate, insExpensesBillRecordDetail.getDiscountRate());
        }
        if (insExpensesBillRecordDetail.getTallyType() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getTallyType, insExpensesBillRecordDetail.getTallyType());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getCostMemo())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCostMemo, insExpensesBillRecordDetail.getCostMemo());
        }
        if (insExpensesBillRecordDetail.getPayState() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getPayState, insExpensesBillRecordDetail.getPayState());
        }
        if (insExpensesBillRecordDetail.getItemId() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getItemId, insExpensesBillRecordDetail.getItemId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getItemName())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getItemName, insExpensesBillRecordDetail.getItemName());
        }
        if (insExpensesBillRecordDetail.getItemPrice() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getItemPrice, insExpensesBillRecordDetail.getItemPrice());
        }
        if (insExpensesBillRecordDetail.getCostMode() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCostMode, insExpensesBillRecordDetail.getCostMode());
        }
        if (insExpensesBillRecordDetail.getStartDate() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getStartDate, insExpensesBillRecordDetail.getStartDate());
        }
        if (insExpensesBillRecordDetail.getEndDate() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getEndDate, insExpensesBillRecordDetail.getEndDate());
        }
        if (insExpensesBillRecordDetail.getChangeId() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getChangeId, insExpensesBillRecordDetail.getChangeId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getDetailIds())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getDetailIds, insExpensesBillRecordDetail.getDetailIds());
        }
        if (insExpensesBillRecordDetail.getBillState() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getBillState, insExpensesBillRecordDetail.getBillState());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getAreaCode())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getAreaCode, insExpensesBillRecordDetail.getAreaCode());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getAreaName())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getAreaName, insExpensesBillRecordDetail.getAreaName());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getRemark())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getRemark, insExpensesBillRecordDetail.getRemark());
        }
        if (insExpensesBillRecordDetail.getCreateUser() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCreateUser, insExpensesBillRecordDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecordDetail.getCreateName())) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCreateName, insExpensesBillRecordDetail.getCreateName());
        }
        if (insExpensesBillRecordDetail.getCreateDept() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCreateDept, insExpensesBillRecordDetail.getCreateDept());
        }
        if (insExpensesBillRecordDetail.getCreateTime() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getCreateTime, insExpensesBillRecordDetail.getCreateTime());
        }
        if (insExpensesBillRecordDetail.getUpdateUser() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getUpdateUser, insExpensesBillRecordDetail.getUpdateUser());
        }
        if (insExpensesBillRecordDetail.getUpdateTime() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getUpdateTime, insExpensesBillRecordDetail.getUpdateTime());
        }
        if (insExpensesBillRecordDetail.getIsDeleted() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getIsDeleted, insExpensesBillRecordDetail.getIsDeleted());
        }
        if (insExpensesBillRecordDetail.getStatus() != null) {
            chainWrapper.set(InsExpensesBillRecordDetail::getStatus, insExpensesBillRecordDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsExpensesBillRecordDetail::getId, insExpensesBillRecordDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insExpensesBillRecordDetail.getId());
        } else {
            return insExpensesBillRecordDetail;
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
    public boolean saveInsExpensesBillRecordDetailBatch(List<InsExpensesBillRecordDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsExpensesBillRecordDetail insExpensesBillRecordDetail : insertList) {
            //使用默认的雪花算法生成
            insExpensesBillRecordDetail.setId(null);
            //insExpensesBillRecordDetail.setCreatedDt(currentDte);
            //insExpensesBillRecordDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsExpensesBillRecordDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsExpensesBillRecordDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


