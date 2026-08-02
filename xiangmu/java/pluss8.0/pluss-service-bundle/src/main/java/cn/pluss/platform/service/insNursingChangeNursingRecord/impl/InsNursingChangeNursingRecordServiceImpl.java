package cn.pluss.platform.service.insNursingChangeNursingRecord.impl;

import cn.pluss.platform.mapper.InsNursingChangeNursingRecordMapper;
import cn.pluss.platform.model.entity.InsNursingChangeNursingRecord;
import cn.pluss.platform.service.insNursingChangeNursingRecord.InsNursingChangeNursingRecordService;
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
@Service("insNursingChangeNursingRecordService")
public class InsNursingChangeNursingRecordServiceImpl extends ServiceImpl< InsNursingChangeNursingRecordMapper, InsNursingChangeNursingRecord> implements InsNursingChangeNursingRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingChangeNursingRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingChangeNursingRecord> queryPage(Map map) {
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
    public InsNursingChangeNursingRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingChangeNursingRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingChangeNursingRecord queryOne(InsNursingChangeNursingRecord insNursingChangeNursingRecord){
        LambdaQueryWrapper<InsNursingChangeNursingRecord> queryWrapper = getQueryWrapper(insNursingChangeNursingRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingChangeNursingRecord
    * @return
    */
    @Override
    public List<InsNursingChangeNursingRecord> queryList(InsNursingChangeNursingRecord insNursingChangeNursingRecord) {
        LambdaQueryWrapper<InsNursingChangeNursingRecord> queryWrapper = getQueryWrapper(insNursingChangeNursingRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingChangeNursingRecord
    * @return
    */
    public static LambdaQueryWrapper<InsNursingChangeNursingRecord> getQueryWrapper(InsNursingChangeNursingRecord insNursingChangeNursingRecord){
        LambdaQueryWrapper<InsNursingChangeNursingRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingChangeNursingRecord.getId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getId, insNursingChangeNursingRecord.getId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getTenantId())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getTenantId, insNursingChangeNursingRecord.getTenantId());
        }
        if (insNursingChangeNursingRecord.getCorpId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getCorpId, insNursingChangeNursingRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getCorpName())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getCorpName, insNursingChangeNursingRecord.getCorpName());
        }
        if (insNursingChangeNursingRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getInstitutionId, insNursingChangeNursingRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getInstitutionName())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getInstitutionName, insNursingChangeNursingRecord.getInstitutionName());
        }
        if (insNursingChangeNursingRecord.getCheckId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getCheckId, insNursingChangeNursingRecord.getCheckId());
        }
        if (insNursingChangeNursingRecord.getElderId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getElderId, insNursingChangeNursingRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getElderName())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getElderName, insNursingChangeNursingRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getIdCard())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getIdCard, insNursingChangeNursingRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getSex())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getSex, insNursingChangeNursingRecord.getSex());
        }
        if (insNursingChangeNursingRecord.getChangeState() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getChangeState, insNursingChangeNursingRecord.getChangeState());
        }
        if (insNursingChangeNursingRecord.getApplyTime() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getApplyTime, insNursingChangeNursingRecord.getApplyTime());
        }
        if (insNursingChangeNursingRecord.getOldNursingLevelId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getOldNursingLevelId, insNursingChangeNursingRecord.getOldNursingLevelId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getOldNursingLevelName())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getOldNursingLevelName, insNursingChangeNursingRecord.getOldNursingLevelName());
        }
        if (insNursingChangeNursingRecord.getOldNursingPrice() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getOldNursingPrice, insNursingChangeNursingRecord.getOldNursingPrice());
        }
        if (insNursingChangeNursingRecord.getNewNursingLevelId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getNewNursingLevelId, insNursingChangeNursingRecord.getNewNursingLevelId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getNewNursingLevelName())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getNewNursingLevelName, insNursingChangeNursingRecord.getNewNursingLevelName());
        }
        if (insNursingChangeNursingRecord.getNewNursingPrice() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getNewNursingPrice, insNursingChangeNursingRecord.getNewNursingPrice());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getAccordingPath())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getAccordingPath, insNursingChangeNursingRecord.getAccordingPath());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getAccordingDescribe())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getAccordingDescribe, insNursingChangeNursingRecord.getAccordingDescribe());
        }
        if (insNursingChangeNursingRecord.getStandardId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getStandardId, insNursingChangeNursingRecord.getStandardId());
        }
        if (insNursingChangeNursingRecord.getCalculateState() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getCalculateState, insNursingChangeNursingRecord.getCalculateState());
        }
        if (insNursingChangeNursingRecord.getSettlementState() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getSettlementState, insNursingChangeNursingRecord.getSettlementState());
        }
        if (insNursingChangeNursingRecord.getBillId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getBillId, insNursingChangeNursingRecord.getBillId());
        }
        if (insNursingChangeNursingRecord.getAuditState() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getAuditState, insNursingChangeNursingRecord.getAuditState());
        }
        if (insNursingChangeNursingRecord.getAuditId() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getAuditId, insNursingChangeNursingRecord.getAuditId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getAuditName())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getAuditName, insNursingChangeNursingRecord.getAuditName());
        }
        if (insNursingChangeNursingRecord.getAuditTime() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getAuditTime, insNursingChangeNursingRecord.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getAuditMemo())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getAuditMemo, insNursingChangeNursingRecord.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getAreaCode())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getAreaCode, insNursingChangeNursingRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getAreaName())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getAreaName, insNursingChangeNursingRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getRemark())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getRemark, insNursingChangeNursingRecord.getRemark());
        }
        if (insNursingChangeNursingRecord.getCreateUser() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getCreateUser, insNursingChangeNursingRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingChangeNursingRecord.getCreateName())) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getCreateName, insNursingChangeNursingRecord.getCreateName());
        }
        if (insNursingChangeNursingRecord.getCreateDept() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getCreateDept, insNursingChangeNursingRecord.getCreateDept());
        }
        if (insNursingChangeNursingRecord.getCreateTime() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getCreateTime, insNursingChangeNursingRecord.getCreateTime());
        }
        if (insNursingChangeNursingRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getUpdateUser, insNursingChangeNursingRecord.getUpdateUser());
        }
        if (insNursingChangeNursingRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getUpdateTime, insNursingChangeNursingRecord.getUpdateTime());
        }
        if (insNursingChangeNursingRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getIsDeleted, insNursingChangeNursingRecord.getIsDeleted());
        }
        if (insNursingChangeNursingRecord.getStatus() != null) {
            queryWrapper.eq(InsNursingChangeNursingRecord::getStatus, insNursingChangeNursingRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingChangeNursingRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingChangeNursingRecord insert(InsNursingChangeNursingRecord insNursingChangeNursingRecord) {
        insNursingChangeNursingRecord.setId(null);
        getBaseMapper().insert(insNursingChangeNursingRecord);
        return insNursingChangeNursingRecord;
    }

    /**
    * 更新数据
    *
    * @param insNursingChangeNursingRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingChangeNursingRecord update(InsNursingChangeNursingRecord insNursingChangeNursingRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingChangeNursingRecord> chainWrapper = new LambdaUpdateChainWrapper<InsNursingChangeNursingRecord>(getBaseMapper());
        if (insNursingChangeNursingRecord.getId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getId, insNursingChangeNursingRecord.getId());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getTenantId())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getTenantId, insNursingChangeNursingRecord.getTenantId());
        }
        if (insNursingChangeNursingRecord.getCorpId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getCorpId, insNursingChangeNursingRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getCorpName())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getCorpName, insNursingChangeNursingRecord.getCorpName());
        }
        if (insNursingChangeNursingRecord.getInstitutionId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getInstitutionId, insNursingChangeNursingRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getInstitutionName())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getInstitutionName, insNursingChangeNursingRecord.getInstitutionName());
        }
        if (insNursingChangeNursingRecord.getCheckId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getCheckId, insNursingChangeNursingRecord.getCheckId());
        }
        if (insNursingChangeNursingRecord.getElderId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getElderId, insNursingChangeNursingRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getElderName())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getElderName, insNursingChangeNursingRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getIdCard())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getIdCard, insNursingChangeNursingRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getSex())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getSex, insNursingChangeNursingRecord.getSex());
        }
        if (insNursingChangeNursingRecord.getChangeState() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getChangeState, insNursingChangeNursingRecord.getChangeState());
        }
        if (insNursingChangeNursingRecord.getApplyTime() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getApplyTime, insNursingChangeNursingRecord.getApplyTime());
        }
        if (insNursingChangeNursingRecord.getOldNursingLevelId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getOldNursingLevelId, insNursingChangeNursingRecord.getOldNursingLevelId());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getOldNursingLevelName())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getOldNursingLevelName, insNursingChangeNursingRecord.getOldNursingLevelName());
        }
        if (insNursingChangeNursingRecord.getOldNursingPrice() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getOldNursingPrice, insNursingChangeNursingRecord.getOldNursingPrice());
        }
        if (insNursingChangeNursingRecord.getNewNursingLevelId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getNewNursingLevelId, insNursingChangeNursingRecord.getNewNursingLevelId());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getNewNursingLevelName())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getNewNursingLevelName, insNursingChangeNursingRecord.getNewNursingLevelName());
        }
        if (insNursingChangeNursingRecord.getNewNursingPrice() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getNewNursingPrice, insNursingChangeNursingRecord.getNewNursingPrice());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getAccordingPath())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getAccordingPath, insNursingChangeNursingRecord.getAccordingPath());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getAccordingDescribe())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getAccordingDescribe, insNursingChangeNursingRecord.getAccordingDescribe());
        }
        if (insNursingChangeNursingRecord.getStandardId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getStandardId, insNursingChangeNursingRecord.getStandardId());
        }
        if (insNursingChangeNursingRecord.getCalculateState() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getCalculateState, insNursingChangeNursingRecord.getCalculateState());
        }
        if (insNursingChangeNursingRecord.getSettlementState() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getSettlementState, insNursingChangeNursingRecord.getSettlementState());
        }
        if (insNursingChangeNursingRecord.getBillId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getBillId, insNursingChangeNursingRecord.getBillId());
        }
        if (insNursingChangeNursingRecord.getAuditState() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getAuditState, insNursingChangeNursingRecord.getAuditState());
        }
        if (insNursingChangeNursingRecord.getAuditId() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getAuditId, insNursingChangeNursingRecord.getAuditId());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getAuditName())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getAuditName, insNursingChangeNursingRecord.getAuditName());
        }
        if (insNursingChangeNursingRecord.getAuditTime() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getAuditTime, insNursingChangeNursingRecord.getAuditTime());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getAuditMemo())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getAuditMemo, insNursingChangeNursingRecord.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getAreaCode())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getAreaCode, insNursingChangeNursingRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getAreaName())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getAreaName, insNursingChangeNursingRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getRemark())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getRemark, insNursingChangeNursingRecord.getRemark());
        }
        if (insNursingChangeNursingRecord.getCreateUser() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getCreateUser, insNursingChangeNursingRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingChangeNursingRecord.getCreateName())) {
            chainWrapper.set(InsNursingChangeNursingRecord::getCreateName, insNursingChangeNursingRecord.getCreateName());
        }
        if (insNursingChangeNursingRecord.getCreateDept() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getCreateDept, insNursingChangeNursingRecord.getCreateDept());
        }
        if (insNursingChangeNursingRecord.getCreateTime() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getCreateTime, insNursingChangeNursingRecord.getCreateTime());
        }
        if (insNursingChangeNursingRecord.getUpdateUser() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getUpdateUser, insNursingChangeNursingRecord.getUpdateUser());
        }
        if (insNursingChangeNursingRecord.getUpdateTime() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getUpdateTime, insNursingChangeNursingRecord.getUpdateTime());
        }
        if (insNursingChangeNursingRecord.getIsDeleted() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getIsDeleted, insNursingChangeNursingRecord.getIsDeleted());
        }
        if (insNursingChangeNursingRecord.getStatus() != null) {
            chainWrapper.set(InsNursingChangeNursingRecord::getStatus, insNursingChangeNursingRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingChangeNursingRecord::getId, insNursingChangeNursingRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingChangeNursingRecord.getId());
        } else {
            return insNursingChangeNursingRecord;
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
    public boolean saveInsNursingChangeNursingRecordBatch(List<InsNursingChangeNursingRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingChangeNursingRecord insNursingChangeNursingRecord : insertList) {
            //使用默认的雪花算法生成
            insNursingChangeNursingRecord.setId(null);
            //insNursingChangeNursingRecord.setCreatedDt(currentDte);
            //insNursingChangeNursingRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingChangeNursingRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingChangeNursingRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


