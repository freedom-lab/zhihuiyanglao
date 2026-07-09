package cn.pluss.platform.service.insBaseBillingRulesSetting.impl;

import cn.pluss.platform.mapper.InsBaseBillingRulesSettingMapper;
import cn.pluss.platform.model.entity.InsBaseBillingRulesSetting;
import cn.pluss.platform.service.insBaseBillingRulesSetting.InsBaseBillingRulesSettingService;
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
@Service("insBaseBillingRulesSettingService")
public class InsBaseBillingRulesSettingServiceImpl extends ServiceImpl< InsBaseBillingRulesSettingMapper, InsBaseBillingRulesSetting> implements InsBaseBillingRulesSettingService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseBillingRulesSettingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseBillingRulesSetting> queryPage(Map map) {
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
    public InsBaseBillingRulesSetting queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseBillingRulesSetting 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseBillingRulesSetting queryOne(InsBaseBillingRulesSetting insBaseBillingRulesSetting){
        LambdaQueryWrapper<InsBaseBillingRulesSetting> queryWrapper = getQueryWrapper(insBaseBillingRulesSetting);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseBillingRulesSetting
    * @return
    */
    @Override
    public List<InsBaseBillingRulesSetting> queryList(InsBaseBillingRulesSetting insBaseBillingRulesSetting) {
        LambdaQueryWrapper<InsBaseBillingRulesSetting> queryWrapper = getQueryWrapper(insBaseBillingRulesSetting);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseBillingRulesSetting
    * @return
    */
    public static LambdaQueryWrapper<InsBaseBillingRulesSetting> getQueryWrapper(InsBaseBillingRulesSetting insBaseBillingRulesSetting){
        LambdaQueryWrapper<InsBaseBillingRulesSetting> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseBillingRulesSetting.getId() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getId, insBaseBillingRulesSetting.getId());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getTenantId())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getTenantId, insBaseBillingRulesSetting.getTenantId());
        }
        if (insBaseBillingRulesSetting.getCorpId() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCorpId, insBaseBillingRulesSetting.getCorpId());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getCorpName())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCorpName, insBaseBillingRulesSetting.getCorpName());
        }
        if (insBaseBillingRulesSetting.getInstitutionId() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getInstitutionId, insBaseBillingRulesSetting.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getInstitutionName())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getInstitutionName, insBaseBillingRulesSetting.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getCheckFlowPath())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCheckFlowPath, insBaseBillingRulesSetting.getCheckFlowPath());
        }
        if (insBaseBillingRulesSetting.getCheckDayCharges() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCheckDayCharges, insBaseBillingRulesSetting.getCheckDayCharges());
        }
        if (insBaseBillingRulesSetting.getBillingRules() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getBillingRules, insBaseBillingRulesSetting.getBillingRules());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getBillTitle())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getBillTitle, insBaseBillingRulesSetting.getBillTitle());
        }
        if (insBaseBillingRulesSetting.getFeeReminderNumber() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getFeeReminderNumber, insBaseBillingRulesSetting.getFeeReminderNumber());
        }
        if (insBaseBillingRulesSetting.getLeaveRefundNumber() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getLeaveRefundNumber, insBaseBillingRulesSetting.getLeaveRefundNumber());
        }
        if (insBaseBillingRulesSetting.getRetreatDayCharges() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getRetreatDayCharges, insBaseBillingRulesSetting.getRetreatDayCharges());
        }
        if (insBaseBillingRulesSetting.getCostReserveNumber() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCostReserveNumber, insBaseBillingRulesSetting.getCostReserveNumber());
        }
        if (insBaseBillingRulesSetting.getWaterPrice() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getWaterPrice, insBaseBillingRulesSetting.getWaterPrice());
        }
        if (insBaseBillingRulesSetting.getElectricPrice() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getElectricPrice, insBaseBillingRulesSetting.getElectricPrice());
        }
        if (insBaseBillingRulesSetting.getContractNumber() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getContractNumber, insBaseBillingRulesSetting.getContractNumber());
        }
        if (insBaseBillingRulesSetting.getAssessNumber() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getAssessNumber, insBaseBillingRulesSetting.getAssessNumber());
        }
        if (insBaseBillingRulesSetting.getNursingNumber() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getNursingNumber, insBaseBillingRulesSetting.getNursingNumber());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getPartyName())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getPartyName, insBaseBillingRulesSetting.getPartyName());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getPartyTel())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getPartyTel, insBaseBillingRulesSetting.getPartyTel());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getPartyAddress())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getPartyAddress, insBaseBillingRulesSetting.getPartyAddress());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getCodeImgPath())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCodeImgPath, insBaseBillingRulesSetting.getCodeImgPath());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getBreakfastTime())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getBreakfastTime, insBaseBillingRulesSetting.getBreakfastTime());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getLunchTime())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getLunchTime, insBaseBillingRulesSetting.getLunchTime());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getDinnerTime())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getDinnerTime, insBaseBillingRulesSetting.getDinnerTime());
        }
        if (insBaseBillingRulesSetting.getCheckDistance() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCheckDistance, insBaseBillingRulesSetting.getCheckDistance());
        }
        if (insBaseBillingRulesSetting.getCheckPosition() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCheckPosition, insBaseBillingRulesSetting.getCheckPosition());
        }
        if (insBaseBillingRulesSetting.getRestDays() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getRestDays, insBaseBillingRulesSetting.getRestDays());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getCompanySeal())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCompanySeal, insBaseBillingRulesSetting.getCompanySeal());
        }
        if (insBaseBillingRulesSetting.getHotWaterPrice() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getHotWaterPrice, insBaseBillingRulesSetting.getHotWaterPrice());
        }
        if (insBaseBillingRulesSetting.getHeatingPrice() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getHeatingPrice, insBaseBillingRulesSetting.getHeatingPrice());
        }
        if (insBaseBillingRulesSetting.getMedicalExpert() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getMedicalExpert, insBaseBillingRulesSetting.getMedicalExpert());
        }
        if (insBaseBillingRulesSetting.getFilingRate() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getFilingRate, insBaseBillingRulesSetting.getFilingRate());
        }
        if (insBaseBillingRulesSetting.getYearFollow() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getYearFollow, insBaseBillingRulesSetting.getYearFollow());
        }
        if (insBaseBillingRulesSetting.getDrugWarning() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getDrugWarning, insBaseBillingRulesSetting.getDrugWarning());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getRemark())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getRemark, insBaseBillingRulesSetting.getRemark());
        }
        if (insBaseBillingRulesSetting.getCreateUser() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCreateUser, insBaseBillingRulesSetting.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseBillingRulesSetting.getCreateName())) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCreateName, insBaseBillingRulesSetting.getCreateName());
        }
        if (insBaseBillingRulesSetting.getCreateDept() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCreateDept, insBaseBillingRulesSetting.getCreateDept());
        }
        if (insBaseBillingRulesSetting.getCreateTime() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getCreateTime, insBaseBillingRulesSetting.getCreateTime());
        }
        if (insBaseBillingRulesSetting.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getUpdateUser, insBaseBillingRulesSetting.getUpdateUser());
        }
        if (insBaseBillingRulesSetting.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getUpdateTime, insBaseBillingRulesSetting.getUpdateTime());
        }
        if (insBaseBillingRulesSetting.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getIsDeleted, insBaseBillingRulesSetting.getIsDeleted());
        }
        if (insBaseBillingRulesSetting.getStatus() != null) {
            queryWrapper.eq(InsBaseBillingRulesSetting::getStatus, insBaseBillingRulesSetting.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseBillingRulesSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseBillingRulesSetting insert(InsBaseBillingRulesSetting insBaseBillingRulesSetting) {
        insBaseBillingRulesSetting.setId(null);
        getBaseMapper().insert(insBaseBillingRulesSetting);
        return insBaseBillingRulesSetting;
    }

    /**
    * 更新数据
    *
    * @param insBaseBillingRulesSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseBillingRulesSetting update(InsBaseBillingRulesSetting insBaseBillingRulesSetting) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseBillingRulesSetting> chainWrapper = new LambdaUpdateChainWrapper<InsBaseBillingRulesSetting>(getBaseMapper());
        if (insBaseBillingRulesSetting.getId() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getId, insBaseBillingRulesSetting.getId());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getTenantId())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getTenantId, insBaseBillingRulesSetting.getTenantId());
        }
        if (insBaseBillingRulesSetting.getCorpId() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCorpId, insBaseBillingRulesSetting.getCorpId());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getCorpName())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCorpName, insBaseBillingRulesSetting.getCorpName());
        }
        if (insBaseBillingRulesSetting.getInstitutionId() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getInstitutionId, insBaseBillingRulesSetting.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getInstitutionName())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getInstitutionName, insBaseBillingRulesSetting.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getCheckFlowPath())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCheckFlowPath, insBaseBillingRulesSetting.getCheckFlowPath());
        }
        if (insBaseBillingRulesSetting.getCheckDayCharges() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCheckDayCharges, insBaseBillingRulesSetting.getCheckDayCharges());
        }
        if (insBaseBillingRulesSetting.getBillingRules() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getBillingRules, insBaseBillingRulesSetting.getBillingRules());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getBillTitle())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getBillTitle, insBaseBillingRulesSetting.getBillTitle());
        }
        if (insBaseBillingRulesSetting.getFeeReminderNumber() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getFeeReminderNumber, insBaseBillingRulesSetting.getFeeReminderNumber());
        }
        if (insBaseBillingRulesSetting.getLeaveRefundNumber() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getLeaveRefundNumber, insBaseBillingRulesSetting.getLeaveRefundNumber());
        }
        if (insBaseBillingRulesSetting.getRetreatDayCharges() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getRetreatDayCharges, insBaseBillingRulesSetting.getRetreatDayCharges());
        }
        if (insBaseBillingRulesSetting.getCostReserveNumber() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCostReserveNumber, insBaseBillingRulesSetting.getCostReserveNumber());
        }
        if (insBaseBillingRulesSetting.getWaterPrice() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getWaterPrice, insBaseBillingRulesSetting.getWaterPrice());
        }
        if (insBaseBillingRulesSetting.getElectricPrice() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getElectricPrice, insBaseBillingRulesSetting.getElectricPrice());
        }
        if (insBaseBillingRulesSetting.getContractNumber() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getContractNumber, insBaseBillingRulesSetting.getContractNumber());
        }
        if (insBaseBillingRulesSetting.getAssessNumber() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getAssessNumber, insBaseBillingRulesSetting.getAssessNumber());
        }
        if (insBaseBillingRulesSetting.getNursingNumber() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getNursingNumber, insBaseBillingRulesSetting.getNursingNumber());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getPartyName())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getPartyName, insBaseBillingRulesSetting.getPartyName());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getPartyTel())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getPartyTel, insBaseBillingRulesSetting.getPartyTel());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getPartyAddress())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getPartyAddress, insBaseBillingRulesSetting.getPartyAddress());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getCodeImgPath())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCodeImgPath, insBaseBillingRulesSetting.getCodeImgPath());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getBreakfastTime())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getBreakfastTime, insBaseBillingRulesSetting.getBreakfastTime());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getLunchTime())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getLunchTime, insBaseBillingRulesSetting.getLunchTime());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getDinnerTime())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getDinnerTime, insBaseBillingRulesSetting.getDinnerTime());
        }
        if (insBaseBillingRulesSetting.getCheckDistance() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCheckDistance, insBaseBillingRulesSetting.getCheckDistance());
        }
        if (insBaseBillingRulesSetting.getCheckPosition() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCheckPosition, insBaseBillingRulesSetting.getCheckPosition());
        }
        if (insBaseBillingRulesSetting.getRestDays() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getRestDays, insBaseBillingRulesSetting.getRestDays());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getCompanySeal())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCompanySeal, insBaseBillingRulesSetting.getCompanySeal());
        }
        if (insBaseBillingRulesSetting.getHotWaterPrice() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getHotWaterPrice, insBaseBillingRulesSetting.getHotWaterPrice());
        }
        if (insBaseBillingRulesSetting.getHeatingPrice() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getHeatingPrice, insBaseBillingRulesSetting.getHeatingPrice());
        }
        if (insBaseBillingRulesSetting.getMedicalExpert() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getMedicalExpert, insBaseBillingRulesSetting.getMedicalExpert());
        }
        if (insBaseBillingRulesSetting.getFilingRate() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getFilingRate, insBaseBillingRulesSetting.getFilingRate());
        }
        if (insBaseBillingRulesSetting.getYearFollow() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getYearFollow, insBaseBillingRulesSetting.getYearFollow());
        }
        if (insBaseBillingRulesSetting.getDrugWarning() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getDrugWarning, insBaseBillingRulesSetting.getDrugWarning());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getRemark())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getRemark, insBaseBillingRulesSetting.getRemark());
        }
        if (insBaseBillingRulesSetting.getCreateUser() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCreateUser, insBaseBillingRulesSetting.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseBillingRulesSetting.getCreateName())) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCreateName, insBaseBillingRulesSetting.getCreateName());
        }
        if (insBaseBillingRulesSetting.getCreateDept() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCreateDept, insBaseBillingRulesSetting.getCreateDept());
        }
        if (insBaseBillingRulesSetting.getCreateTime() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getCreateTime, insBaseBillingRulesSetting.getCreateTime());
        }
        if (insBaseBillingRulesSetting.getUpdateUser() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getUpdateUser, insBaseBillingRulesSetting.getUpdateUser());
        }
        if (insBaseBillingRulesSetting.getUpdateTime() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getUpdateTime, insBaseBillingRulesSetting.getUpdateTime());
        }
        if (insBaseBillingRulesSetting.getIsDeleted() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getIsDeleted, insBaseBillingRulesSetting.getIsDeleted());
        }
        if (insBaseBillingRulesSetting.getStatus() != null) {
            chainWrapper.set(InsBaseBillingRulesSetting::getStatus, insBaseBillingRulesSetting.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseBillingRulesSetting::getId, insBaseBillingRulesSetting.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseBillingRulesSetting.getId());
        } else {
            return insBaseBillingRulesSetting;
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
    public boolean saveInsBaseBillingRulesSettingBatch(List<InsBaseBillingRulesSetting> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseBillingRulesSetting insBaseBillingRulesSetting : insertList) {
            //使用默认的雪花算法生成
            insBaseBillingRulesSetting.setId(null);
            //insBaseBillingRulesSetting.setCreatedDt(currentDte);
            //insBaseBillingRulesSetting.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseBillingRulesSettingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseBillingRulesSetting> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


