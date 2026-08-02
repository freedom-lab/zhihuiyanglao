package cn.pluss.platform.service.insExpensesChangeFoodRecord.impl;

import cn.pluss.platform.mapper.InsExpensesChangeFoodRecordMapper;
import cn.pluss.platform.model.entity.InsExpensesChangeFoodRecord;
import cn.pluss.platform.service.insExpensesChangeFoodRecord.InsExpensesChangeFoodRecordService;
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
@Service("insExpensesChangeFoodRecordService")
public class InsExpensesChangeFoodRecordServiceImpl extends ServiceImpl< InsExpensesChangeFoodRecordMapper, InsExpensesChangeFoodRecord> implements InsExpensesChangeFoodRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsExpensesChangeFoodRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsExpensesChangeFoodRecord> queryPage(Map map) {
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
    public InsExpensesChangeFoodRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesChangeFoodRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsExpensesChangeFoodRecord queryOne(InsExpensesChangeFoodRecord insExpensesChangeFoodRecord){
        LambdaQueryWrapper<InsExpensesChangeFoodRecord> queryWrapper = getQueryWrapper(insExpensesChangeFoodRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesChangeFoodRecord
    * @return
    */
    @Override
    public List<InsExpensesChangeFoodRecord> queryList(InsExpensesChangeFoodRecord insExpensesChangeFoodRecord) {
        LambdaQueryWrapper<InsExpensesChangeFoodRecord> queryWrapper = getQueryWrapper(insExpensesChangeFoodRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insExpensesChangeFoodRecord
    * @return
    */
    public static LambdaQueryWrapper<InsExpensesChangeFoodRecord> getQueryWrapper(InsExpensesChangeFoodRecord insExpensesChangeFoodRecord){
        LambdaQueryWrapper<InsExpensesChangeFoodRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insExpensesChangeFoodRecord.getId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getId, insExpensesChangeFoodRecord.getId());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getTenantId())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getTenantId, insExpensesChangeFoodRecord.getTenantId());
        }
        if (insExpensesChangeFoodRecord.getCorpId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getCorpId, insExpensesChangeFoodRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getCorpName())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getCorpName, insExpensesChangeFoodRecord.getCorpName());
        }
        if (insExpensesChangeFoodRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getInstitutionId, insExpensesChangeFoodRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getInstitutionName())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getInstitutionName, insExpensesChangeFoodRecord.getInstitutionName());
        }
        if (insExpensesChangeFoodRecord.getCheckId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getCheckId, insExpensesChangeFoodRecord.getCheckId());
        }
        if (insExpensesChangeFoodRecord.getCheckDate() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getCheckDate, insExpensesChangeFoodRecord.getCheckDate());
        }
        if (insExpensesChangeFoodRecord.getElderId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getElderId, insExpensesChangeFoodRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getElderName())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getElderName, insExpensesChangeFoodRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getIdCard())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getIdCard, insExpensesChangeFoodRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getSex())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getSex, insExpensesChangeFoodRecord.getSex());
        }
        if (insExpensesChangeFoodRecord.getChangeState() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getChangeState, insExpensesChangeFoodRecord.getChangeState());
        }
        if (insExpensesChangeFoodRecord.getApplyTime() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getApplyTime, insExpensesChangeFoodRecord.getApplyTime());
        }
        if (insExpensesChangeFoodRecord.getOldFoodId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getOldFoodId, insExpensesChangeFoodRecord.getOldFoodId());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getOldFoodName())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getOldFoodName, insExpensesChangeFoodRecord.getOldFoodName());
        }
        if (insExpensesChangeFoodRecord.getOldFoodPrice() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getOldFoodPrice, insExpensesChangeFoodRecord.getOldFoodPrice());
        }
        if (insExpensesChangeFoodRecord.getNewFoodId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getNewFoodId, insExpensesChangeFoodRecord.getNewFoodId());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getNewFoodName())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getNewFoodName, insExpensesChangeFoodRecord.getNewFoodName());
        }
        if (insExpensesChangeFoodRecord.getNewFoodPrice() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getNewFoodPrice, insExpensesChangeFoodRecord.getNewFoodPrice());
        }
        if (insExpensesChangeFoodRecord.getStandardId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getStandardId, insExpensesChangeFoodRecord.getStandardId());
        }
        if (insExpensesChangeFoodRecord.getCalculateState() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getCalculateState, insExpensesChangeFoodRecord.getCalculateState());
        }
        if (insExpensesChangeFoodRecord.getSettlementState() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getSettlementState, insExpensesChangeFoodRecord.getSettlementState());
        }
        if (insExpensesChangeFoodRecord.getBillId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getBillId, insExpensesChangeFoodRecord.getBillId());
        }
        if (insExpensesChangeFoodRecord.getAuditState() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getAuditState, insExpensesChangeFoodRecord.getAuditState());
        }
        if (insExpensesChangeFoodRecord.getAuditId() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getAuditId, insExpensesChangeFoodRecord.getAuditId());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getAuditName())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getAuditName, insExpensesChangeFoodRecord.getAuditName());
        }
        if (insExpensesChangeFoodRecord.getAuditTime() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getAuditTime, insExpensesChangeFoodRecord.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getAuditMemo())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getAuditMemo, insExpensesChangeFoodRecord.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getAreaCode())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getAreaCode, insExpensesChangeFoodRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getAreaName())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getAreaName, insExpensesChangeFoodRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getRemark())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getRemark, insExpensesChangeFoodRecord.getRemark());
        }
        if (insExpensesChangeFoodRecord.getCreateUser() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getCreateUser, insExpensesChangeFoodRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insExpensesChangeFoodRecord.getCreateName())) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getCreateName, insExpensesChangeFoodRecord.getCreateName());
        }
        if (insExpensesChangeFoodRecord.getCreateDept() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getCreateDept, insExpensesChangeFoodRecord.getCreateDept());
        }
        if (insExpensesChangeFoodRecord.getCreateTime() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getCreateTime, insExpensesChangeFoodRecord.getCreateTime());
        }
        if (insExpensesChangeFoodRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getUpdateUser, insExpensesChangeFoodRecord.getUpdateUser());
        }
        if (insExpensesChangeFoodRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getUpdateTime, insExpensesChangeFoodRecord.getUpdateTime());
        }
        if (insExpensesChangeFoodRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getIsDeleted, insExpensesChangeFoodRecord.getIsDeleted());
        }
        if (insExpensesChangeFoodRecord.getStatus() != null) {
            queryWrapper.eq(InsExpensesChangeFoodRecord::getStatus, insExpensesChangeFoodRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insExpensesChangeFoodRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesChangeFoodRecord insert(InsExpensesChangeFoodRecord insExpensesChangeFoodRecord) {
        insExpensesChangeFoodRecord.setId(null);
        getBaseMapper().insert(insExpensesChangeFoodRecord);
        return insExpensesChangeFoodRecord;
    }

    /**
    * 更新数据
    *
    * @param insExpensesChangeFoodRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesChangeFoodRecord update(InsExpensesChangeFoodRecord insExpensesChangeFoodRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsExpensesChangeFoodRecord> chainWrapper = new LambdaUpdateChainWrapper<InsExpensesChangeFoodRecord>(getBaseMapper());
        if (insExpensesChangeFoodRecord.getId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getId, insExpensesChangeFoodRecord.getId());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getTenantId())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getTenantId, insExpensesChangeFoodRecord.getTenantId());
        }
        if (insExpensesChangeFoodRecord.getCorpId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getCorpId, insExpensesChangeFoodRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getCorpName())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getCorpName, insExpensesChangeFoodRecord.getCorpName());
        }
        if (insExpensesChangeFoodRecord.getInstitutionId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getInstitutionId, insExpensesChangeFoodRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getInstitutionName())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getInstitutionName, insExpensesChangeFoodRecord.getInstitutionName());
        }
        if (insExpensesChangeFoodRecord.getCheckId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getCheckId, insExpensesChangeFoodRecord.getCheckId());
        }
        if (insExpensesChangeFoodRecord.getCheckDate() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getCheckDate, insExpensesChangeFoodRecord.getCheckDate());
        }
        if (insExpensesChangeFoodRecord.getElderId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getElderId, insExpensesChangeFoodRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getElderName())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getElderName, insExpensesChangeFoodRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getIdCard())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getIdCard, insExpensesChangeFoodRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getSex())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getSex, insExpensesChangeFoodRecord.getSex());
        }
        if (insExpensesChangeFoodRecord.getChangeState() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getChangeState, insExpensesChangeFoodRecord.getChangeState());
        }
        if (insExpensesChangeFoodRecord.getApplyTime() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getApplyTime, insExpensesChangeFoodRecord.getApplyTime());
        }
        if (insExpensesChangeFoodRecord.getOldFoodId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getOldFoodId, insExpensesChangeFoodRecord.getOldFoodId());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getOldFoodName())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getOldFoodName, insExpensesChangeFoodRecord.getOldFoodName());
        }
        if (insExpensesChangeFoodRecord.getOldFoodPrice() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getOldFoodPrice, insExpensesChangeFoodRecord.getOldFoodPrice());
        }
        if (insExpensesChangeFoodRecord.getNewFoodId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getNewFoodId, insExpensesChangeFoodRecord.getNewFoodId());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getNewFoodName())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getNewFoodName, insExpensesChangeFoodRecord.getNewFoodName());
        }
        if (insExpensesChangeFoodRecord.getNewFoodPrice() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getNewFoodPrice, insExpensesChangeFoodRecord.getNewFoodPrice());
        }
        if (insExpensesChangeFoodRecord.getStandardId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getStandardId, insExpensesChangeFoodRecord.getStandardId());
        }
        if (insExpensesChangeFoodRecord.getCalculateState() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getCalculateState, insExpensesChangeFoodRecord.getCalculateState());
        }
        if (insExpensesChangeFoodRecord.getSettlementState() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getSettlementState, insExpensesChangeFoodRecord.getSettlementState());
        }
        if (insExpensesChangeFoodRecord.getBillId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getBillId, insExpensesChangeFoodRecord.getBillId());
        }
        if (insExpensesChangeFoodRecord.getAuditState() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getAuditState, insExpensesChangeFoodRecord.getAuditState());
        }
        if (insExpensesChangeFoodRecord.getAuditId() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getAuditId, insExpensesChangeFoodRecord.getAuditId());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getAuditName())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getAuditName, insExpensesChangeFoodRecord.getAuditName());
        }
        if (insExpensesChangeFoodRecord.getAuditTime() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getAuditTime, insExpensesChangeFoodRecord.getAuditTime());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getAuditMemo())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getAuditMemo, insExpensesChangeFoodRecord.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getAreaCode())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getAreaCode, insExpensesChangeFoodRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getAreaName())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getAreaName, insExpensesChangeFoodRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getRemark())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getRemark, insExpensesChangeFoodRecord.getRemark());
        }
        if (insExpensesChangeFoodRecord.getCreateUser() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getCreateUser, insExpensesChangeFoodRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insExpensesChangeFoodRecord.getCreateName())) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getCreateName, insExpensesChangeFoodRecord.getCreateName());
        }
        if (insExpensesChangeFoodRecord.getCreateDept() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getCreateDept, insExpensesChangeFoodRecord.getCreateDept());
        }
        if (insExpensesChangeFoodRecord.getCreateTime() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getCreateTime, insExpensesChangeFoodRecord.getCreateTime());
        }
        if (insExpensesChangeFoodRecord.getUpdateUser() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getUpdateUser, insExpensesChangeFoodRecord.getUpdateUser());
        }
        if (insExpensesChangeFoodRecord.getUpdateTime() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getUpdateTime, insExpensesChangeFoodRecord.getUpdateTime());
        }
        if (insExpensesChangeFoodRecord.getIsDeleted() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getIsDeleted, insExpensesChangeFoodRecord.getIsDeleted());
        }
        if (insExpensesChangeFoodRecord.getStatus() != null) {
            chainWrapper.set(InsExpensesChangeFoodRecord::getStatus, insExpensesChangeFoodRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsExpensesChangeFoodRecord::getId, insExpensesChangeFoodRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insExpensesChangeFoodRecord.getId());
        } else {
            return insExpensesChangeFoodRecord;
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
    public boolean saveInsExpensesChangeFoodRecordBatch(List<InsExpensesChangeFoodRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsExpensesChangeFoodRecord insExpensesChangeFoodRecord : insertList) {
            //使用默认的雪花算法生成
            insExpensesChangeFoodRecord.setId(null);
            //insExpensesChangeFoodRecord.setCreatedDt(currentDte);
            //insExpensesChangeFoodRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsExpensesChangeFoodRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsExpensesChangeFoodRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


