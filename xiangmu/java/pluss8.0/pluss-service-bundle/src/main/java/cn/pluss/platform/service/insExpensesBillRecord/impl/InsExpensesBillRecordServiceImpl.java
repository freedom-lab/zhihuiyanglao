package cn.pluss.platform.service.insExpensesBillRecord.impl;

import cn.pluss.platform.mapper.InsExpensesBillRecordMapper;
import cn.pluss.platform.model.dto.HealthDto;
import cn.pluss.platform.model.entity.InsExpensesBillRecord;
import cn.pluss.platform.service.insExpensesBillRecord.InsExpensesBillRecordService;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Transactional
@Service("insExpensesBillRecordService")
public class InsExpensesBillRecordServiceImpl extends ServiceImpl< InsExpensesBillRecordMapper, InsExpensesBillRecord> implements InsExpensesBillRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsExpensesBillRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsExpensesBillRecord> queryPage(Map map) {
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
    public InsExpensesBillRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesBillRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsExpensesBillRecord queryOne(InsExpensesBillRecord insExpensesBillRecord){
        LambdaQueryWrapper<InsExpensesBillRecord> queryWrapper = getQueryWrapper(insExpensesBillRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesBillRecord
    * @return
    */
    @Override
    public List<InsExpensesBillRecord> queryList(InsExpensesBillRecord insExpensesBillRecord) {
        LambdaQueryWrapper<InsExpensesBillRecord> queryWrapper = getQueryWrapper(insExpensesBillRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insExpensesBillRecord
    * @return
    */
    public static LambdaQueryWrapper<InsExpensesBillRecord> getQueryWrapper(InsExpensesBillRecord insExpensesBillRecord){
        LambdaQueryWrapper<InsExpensesBillRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insExpensesBillRecord.getId() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getId, insExpensesBillRecord.getId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getTenantId())) {
            queryWrapper.eq(InsExpensesBillRecord::getTenantId, insExpensesBillRecord.getTenantId());
        }
        if (insExpensesBillRecord.getCorpId() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getCorpId, insExpensesBillRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getCorpName())) {
            queryWrapper.eq(InsExpensesBillRecord::getCorpName, insExpensesBillRecord.getCorpName());
        }
        if (insExpensesBillRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getInstitutionId, insExpensesBillRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getInstitutionName())) {
            queryWrapper.eq(InsExpensesBillRecord::getInstitutionName, insExpensesBillRecord.getInstitutionName());
        }
        if (insExpensesBillRecord.getCheckId() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getCheckId, insExpensesBillRecord.getCheckId());
        }
        if (insExpensesBillRecord.getCheckDate() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getCheckDate, insExpensesBillRecord.getCheckDate());
        }
        if (insExpensesBillRecord.getElderId() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getElderId, insExpensesBillRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getElderName())) {
            queryWrapper.eq(InsExpensesBillRecord::getElderName, insExpensesBillRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getIdCard())) {
            queryWrapper.eq(InsExpensesBillRecord::getIdCard, insExpensesBillRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getSex())) {
            queryWrapper.eq(InsExpensesBillRecord::getSex, insExpensesBillRecord.getSex());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getBillCode())) {
            queryWrapper.eq(InsExpensesBillRecord::getBillCode, insExpensesBillRecord.getBillCode());
        }
        if (insExpensesBillRecord.getBillType() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getBillType, insExpensesBillRecord.getBillType());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getBillName())) {
            queryWrapper.eq(InsExpensesBillRecord::getBillName, insExpensesBillRecord.getBillName());
        }
        if (insExpensesBillRecord.getReceivableAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getReceivableAmount, insExpensesBillRecord.getReceivableAmount());
        }
        if (insExpensesBillRecord.getIsCalculate() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getIsCalculate, insExpensesBillRecord.getIsCalculate());
        }
        if (insExpensesBillRecord.getDiscountType() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getDiscountType, insExpensesBillRecord.getDiscountType());
        }
        if (insExpensesBillRecord.getCalculateId() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getCalculateId, insExpensesBillRecord.getCalculateId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getCalculateName())) {
            queryWrapper.eq(InsExpensesBillRecord::getCalculateName, insExpensesBillRecord.getCalculateName());
        }
        if (insExpensesBillRecord.getCalculateTime() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getCalculateTime, insExpensesBillRecord.getCalculateTime());
        }
        if (insExpensesBillRecord.getPayState() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getPayState, insExpensesBillRecord.getPayState());
        }
        if (insExpensesBillRecord.getPayMethod() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getPayMethod, insExpensesBillRecord.getPayMethod());
        }
        if (insExpensesBillRecord.getActualAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getActualAmount, insExpensesBillRecord.getActualAmount());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getCapitalAmount())) {
            queryWrapper.eq(InsExpensesBillRecord::getCapitalAmount, insExpensesBillRecord.getCapitalAmount());
        }
        if (insExpensesBillRecord.getXjAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getXjAmount, insExpensesBillRecord.getXjAmount());
        }
        if (insExpensesBillRecord.getWxAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getWxAmount, insExpensesBillRecord.getWxAmount());
        }
        if (insExpensesBillRecord.getZfbAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getZfbAmount, insExpensesBillRecord.getZfbAmount());
        }
        if (insExpensesBillRecord.getYlkAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getYlkAmount, insExpensesBillRecord.getYlkAmount());
        }
        if (insExpensesBillRecord.getYeAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getYeAmount, insExpensesBillRecord.getYeAmount());
        }
        if (insExpensesBillRecord.getDjqAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getDjqAmount, insExpensesBillRecord.getDjqAmount());
        }
        if (insExpensesBillRecord.getZzAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getZzAmount, insExpensesBillRecord.getZzAmount());
        }
        if (insExpensesBillRecord.getQtAmount() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getQtAmount, insExpensesBillRecord.getQtAmount());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getPaymentName())) {
            queryWrapper.eq(InsExpensesBillRecord::getPaymentName, insExpensesBillRecord.getPaymentName());
        }
        if (insExpensesBillRecord.getPaymentTime() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getPaymentTime, insExpensesBillRecord.getPaymentTime());
        }
        if (insExpensesBillRecord.getPayeeId() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getPayeeId, insExpensesBillRecord.getPayeeId());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getPayeeName())) {
            queryWrapper.eq(InsExpensesBillRecord::getPayeeName, insExpensesBillRecord.getPayeeName());
        }
        if (insExpensesBillRecord.getPayeeTime() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getPayeeTime, insExpensesBillRecord.getPayeeTime());
        }
        if (insExpensesBillRecord.getBillState() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getBillState, insExpensesBillRecord.getBillState());
        }
        if (insExpensesBillRecord.getPushState() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getPushState, insExpensesBillRecord.getPushState());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getAreaCode())) {
            queryWrapper.eq(InsExpensesBillRecord::getAreaCode, insExpensesBillRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getAreaName())) {
            queryWrapper.eq(InsExpensesBillRecord::getAreaName, insExpensesBillRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getRemark())) {
            queryWrapper.eq(InsExpensesBillRecord::getRemark, insExpensesBillRecord.getRemark());
        }
        if (insExpensesBillRecord.getCreateUser() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getCreateUser, insExpensesBillRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insExpensesBillRecord.getCreateName())) {
            queryWrapper.eq(InsExpensesBillRecord::getCreateName, insExpensesBillRecord.getCreateName());
        }
        if (insExpensesBillRecord.getCreateDept() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getCreateDept, insExpensesBillRecord.getCreateDept());
        }
        if (insExpensesBillRecord.getCreateTime() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getCreateTime, insExpensesBillRecord.getCreateTime());
        }
        if (insExpensesBillRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getUpdateUser, insExpensesBillRecord.getUpdateUser());
        }
        if (insExpensesBillRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getUpdateTime, insExpensesBillRecord.getUpdateTime());
        }
        if (insExpensesBillRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getIsDeleted, insExpensesBillRecord.getIsDeleted());
        }
        if (insExpensesBillRecord.getStatus() != null) {
            queryWrapper.eq(InsExpensesBillRecord::getStatus, insExpensesBillRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insExpensesBillRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesBillRecord insert(InsExpensesBillRecord insExpensesBillRecord) {
        insExpensesBillRecord.setId(null);
        getBaseMapper().insert(insExpensesBillRecord);
        return insExpensesBillRecord;
    }

    /**
    * 更新数据
    *
    * @param insExpensesBillRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesBillRecord update(InsExpensesBillRecord insExpensesBillRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsExpensesBillRecord> chainWrapper = new LambdaUpdateChainWrapper<InsExpensesBillRecord>(getBaseMapper());
        if (insExpensesBillRecord.getId() != null) {
            chainWrapper.set(InsExpensesBillRecord::getId, insExpensesBillRecord.getId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getTenantId())) {
            chainWrapper.set(InsExpensesBillRecord::getTenantId, insExpensesBillRecord.getTenantId());
        }
        if (insExpensesBillRecord.getCorpId() != null) {
            chainWrapper.set(InsExpensesBillRecord::getCorpId, insExpensesBillRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getCorpName())) {
            chainWrapper.set(InsExpensesBillRecord::getCorpName, insExpensesBillRecord.getCorpName());
        }
        if (insExpensesBillRecord.getInstitutionId() != null) {
            chainWrapper.set(InsExpensesBillRecord::getInstitutionId, insExpensesBillRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getInstitutionName())) {
            chainWrapper.set(InsExpensesBillRecord::getInstitutionName, insExpensesBillRecord.getInstitutionName());
        }
        if (insExpensesBillRecord.getCheckId() != null) {
            chainWrapper.set(InsExpensesBillRecord::getCheckId, insExpensesBillRecord.getCheckId());
        }
        if (insExpensesBillRecord.getCheckDate() != null) {
            chainWrapper.set(InsExpensesBillRecord::getCheckDate, insExpensesBillRecord.getCheckDate());
        }
        if (insExpensesBillRecord.getElderId() != null) {
            chainWrapper.set(InsExpensesBillRecord::getElderId, insExpensesBillRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getElderName())) {
            chainWrapper.set(InsExpensesBillRecord::getElderName, insExpensesBillRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getIdCard())) {
            chainWrapper.set(InsExpensesBillRecord::getIdCard, insExpensesBillRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getSex())) {
            chainWrapper.set(InsExpensesBillRecord::getSex, insExpensesBillRecord.getSex());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getBillCode())) {
            chainWrapper.set(InsExpensesBillRecord::getBillCode, insExpensesBillRecord.getBillCode());
        }
        if (insExpensesBillRecord.getBillType() != null) {
            chainWrapper.set(InsExpensesBillRecord::getBillType, insExpensesBillRecord.getBillType());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getBillName())) {
            chainWrapper.set(InsExpensesBillRecord::getBillName, insExpensesBillRecord.getBillName());
        }
        if (insExpensesBillRecord.getReceivableAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getReceivableAmount, insExpensesBillRecord.getReceivableAmount());
        }
        if (insExpensesBillRecord.getIsCalculate() != null) {
            chainWrapper.set(InsExpensesBillRecord::getIsCalculate, insExpensesBillRecord.getIsCalculate());
        }
        if (insExpensesBillRecord.getDiscountType() != null) {
            chainWrapper.set(InsExpensesBillRecord::getDiscountType, insExpensesBillRecord.getDiscountType());
        }
        if (insExpensesBillRecord.getCalculateId() != null) {
            chainWrapper.set(InsExpensesBillRecord::getCalculateId, insExpensesBillRecord.getCalculateId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getCalculateName())) {
            chainWrapper.set(InsExpensesBillRecord::getCalculateName, insExpensesBillRecord.getCalculateName());
        }
        if (insExpensesBillRecord.getCalculateTime() != null) {
            chainWrapper.set(InsExpensesBillRecord::getCalculateTime, insExpensesBillRecord.getCalculateTime());
        }
        if (insExpensesBillRecord.getPayState() != null) {
            chainWrapper.set(InsExpensesBillRecord::getPayState, insExpensesBillRecord.getPayState());
        }
        if (insExpensesBillRecord.getPayMethod() != null) {
            chainWrapper.set(InsExpensesBillRecord::getPayMethod, insExpensesBillRecord.getPayMethod());
        }
        if (insExpensesBillRecord.getActualAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getActualAmount, insExpensesBillRecord.getActualAmount());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getCapitalAmount())) {
            chainWrapper.set(InsExpensesBillRecord::getCapitalAmount, insExpensesBillRecord.getCapitalAmount());
        }
        if (insExpensesBillRecord.getXjAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getXjAmount, insExpensesBillRecord.getXjAmount());
        }
        if (insExpensesBillRecord.getWxAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getWxAmount, insExpensesBillRecord.getWxAmount());
        }
        if (insExpensesBillRecord.getZfbAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getZfbAmount, insExpensesBillRecord.getZfbAmount());
        }
        if (insExpensesBillRecord.getYlkAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getYlkAmount, insExpensesBillRecord.getYlkAmount());
        }
        if (insExpensesBillRecord.getYeAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getYeAmount, insExpensesBillRecord.getYeAmount());
        }
        if (insExpensesBillRecord.getDjqAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getDjqAmount, insExpensesBillRecord.getDjqAmount());
        }
        if (insExpensesBillRecord.getZzAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getZzAmount, insExpensesBillRecord.getZzAmount());
        }
        if (insExpensesBillRecord.getQtAmount() != null) {
            chainWrapper.set(InsExpensesBillRecord::getQtAmount, insExpensesBillRecord.getQtAmount());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getPaymentName())) {
            chainWrapper.set(InsExpensesBillRecord::getPaymentName, insExpensesBillRecord.getPaymentName());
        }
        if (insExpensesBillRecord.getPaymentTime() != null) {
            chainWrapper.set(InsExpensesBillRecord::getPaymentTime, insExpensesBillRecord.getPaymentTime());
        }
        if (insExpensesBillRecord.getPayeeId() != null) {
            chainWrapper.set(InsExpensesBillRecord::getPayeeId, insExpensesBillRecord.getPayeeId());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getPayeeName())) {
            chainWrapper.set(InsExpensesBillRecord::getPayeeName, insExpensesBillRecord.getPayeeName());
        }
        if (insExpensesBillRecord.getPayeeTime() != null) {
            chainWrapper.set(InsExpensesBillRecord::getPayeeTime, insExpensesBillRecord.getPayeeTime());
        }
        if (insExpensesBillRecord.getBillState() != null) {
            chainWrapper.set(InsExpensesBillRecord::getBillState, insExpensesBillRecord.getBillState());
        }
        if (insExpensesBillRecord.getPushState() != null) {
            chainWrapper.set(InsExpensesBillRecord::getPushState, insExpensesBillRecord.getPushState());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getAreaCode())) {
            chainWrapper.set(InsExpensesBillRecord::getAreaCode, insExpensesBillRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getAreaName())) {
            chainWrapper.set(InsExpensesBillRecord::getAreaName, insExpensesBillRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getRemark())) {
            chainWrapper.set(InsExpensesBillRecord::getRemark, insExpensesBillRecord.getRemark());
        }
        if (insExpensesBillRecord.getCreateUser() != null) {
            chainWrapper.set(InsExpensesBillRecord::getCreateUser, insExpensesBillRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insExpensesBillRecord.getCreateName())) {
            chainWrapper.set(InsExpensesBillRecord::getCreateName, insExpensesBillRecord.getCreateName());
        }
        if (insExpensesBillRecord.getCreateDept() != null) {
            chainWrapper.set(InsExpensesBillRecord::getCreateDept, insExpensesBillRecord.getCreateDept());
        }
        if (insExpensesBillRecord.getCreateTime() != null) {
            chainWrapper.set(InsExpensesBillRecord::getCreateTime, insExpensesBillRecord.getCreateTime());
        }
        if (insExpensesBillRecord.getUpdateUser() != null) {
            chainWrapper.set(InsExpensesBillRecord::getUpdateUser, insExpensesBillRecord.getUpdateUser());
        }
        if (insExpensesBillRecord.getUpdateTime() != null) {
            chainWrapper.set(InsExpensesBillRecord::getUpdateTime, insExpensesBillRecord.getUpdateTime());
        }
        if (insExpensesBillRecord.getIsDeleted() != null) {
            chainWrapper.set(InsExpensesBillRecord::getIsDeleted, insExpensesBillRecord.getIsDeleted());
        }
        if (insExpensesBillRecord.getStatus() != null) {
            chainWrapper.set(InsExpensesBillRecord::getStatus, insExpensesBillRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsExpensesBillRecord::getId, insExpensesBillRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insExpensesBillRecord.getId());
        } else {
            return insExpensesBillRecord;
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
    public boolean saveInsExpensesBillRecordBatch(List<InsExpensesBillRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsExpensesBillRecord insExpensesBillRecord : insertList) {
            //使用默认的雪花算法生成
            insExpensesBillRecord.setId(null);
            //insExpensesBillRecord.setCreatedDt(currentDte);
            //insExpensesBillRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsExpensesBillRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsExpensesBillRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Object getThisMonthRevenue(HealthDto healthDto) {
        HashMap<String, Object> result = new HashMap<>();
        LambdaQueryWrapper<InsExpensesBillRecord> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(InsExpensesBillRecord::getBillState, 1);

        if(healthDto.getStratTime() != null && healthDto.getEndTime() != null){
            wrapper.ge(InsExpensesBillRecord::getCreateTime, healthDto.getStratTime()).le(InsExpensesBillRecord::getCreateTime, healthDto.getEndTime());
        }

        List<InsExpensesBillRecord> list = list(wrapper);
        //应收费用
        double totalReceivableAmount = list.stream().collect(Collectors.summarizingDouble(InsExpensesBillRecord::getReceivableAmount)).getSum();
        if (totalReceivableAmount > 0) {
            result.put("receivableAmount",new BigDecimal(totalReceivableAmount).setScale(2, BigDecimal.ROUND_HALF_UP));
        }else {
            result.put("receivableAmount",0.00);
        }

        //实收金额
        double totalActualAmount = list.stream().filter(e->e.getPayState()!=null && e.getPayState()==2).collect(Collectors.summarizingDouble(InsExpensesBillRecord::getActualAmount)).getSum();
        if (totalActualAmount > 0) {
            result.put("actualAmount",new BigDecimal(totalActualAmount).setScale(2, BigDecimal.ROUND_HALF_UP));
        }else {
            result.put("actualAmount",0.00);
        }

        //欠费金额
        double totalArrearsAmount = list.stream().filter(e->e.getPayState()!=null && e.getPayState()==1).collect(Collectors.summarizingDouble(InsExpensesBillRecord::getReceivableAmount)).getSum();
        if (totalArrearsAmount > 0) {
            result.put("arrearsAmount",new BigDecimal(totalArrearsAmount).setScale(2, BigDecimal.ROUND_HALF_UP));
        }else {
            result.put("arrearsAmount",0.00);
        }
        return result;
    }

    @Override
    public Object getThisMonthClassRevenue(HealthDto healthDto) {
        HashMap<String, Object> result = new HashMap<>();
        LambdaQueryWrapper<InsExpensesBillRecord> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(InsExpensesBillRecord::getBillState, 1)
                .eq(InsExpensesBillRecord::getPayState, 2);
        if(healthDto.getStratTime() != null && healthDto.getEndTime() != null){
            wrapper.ge(InsExpensesBillRecord::getCreateTime, healthDto.getStratTime()).le(InsExpensesBillRecord::getCreateTime, healthDto.getEndTime());
        }

        List<InsExpensesBillRecord> list = list(wrapper);
        if (list == null || list.size() == 0){
            return result;
        }
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(e -> e.getBillType() == null ? "0" : String.valueOf(e.getBillType()), Collectors.counting()));
        return collect;
    }


}


