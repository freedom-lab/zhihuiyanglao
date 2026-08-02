package cn.pluss.platform.service.insElderLeaveRecord.impl;

import cn.pluss.platform.mapper.InsElderLeaveRecordMapper;
import cn.pluss.platform.model.entity.InsElderLeaveRecord;
import cn.pluss.platform.service.insElderLeaveRecord.InsElderLeaveRecordService;
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
@Service("insElderLeaveRecordService")
public class InsElderLeaveRecordServiceImpl extends ServiceImpl< InsElderLeaveRecordMapper, InsElderLeaveRecord> implements InsElderLeaveRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderLeaveRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderLeaveRecord> queryPage(Map map) {
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
    public InsElderLeaveRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderLeaveRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderLeaveRecord queryOne(InsElderLeaveRecord insElderLeaveRecord){
        LambdaQueryWrapper<InsElderLeaveRecord> queryWrapper = getQueryWrapper(insElderLeaveRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderLeaveRecord
    * @return
    */
    @Override
    public List<InsElderLeaveRecord> queryList(InsElderLeaveRecord insElderLeaveRecord) {
        LambdaQueryWrapper<InsElderLeaveRecord> queryWrapper = getQueryWrapper(insElderLeaveRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderLeaveRecord
    * @return
    */
    public static LambdaQueryWrapper<InsElderLeaveRecord> getQueryWrapper(InsElderLeaveRecord insElderLeaveRecord){
        LambdaQueryWrapper<InsElderLeaveRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderLeaveRecord.getId() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getId, insElderLeaveRecord.getId());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getTenantId())) {
            queryWrapper.eq(InsElderLeaveRecord::getTenantId, insElderLeaveRecord.getTenantId());
        }
        if (insElderLeaveRecord.getCorpId() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getCorpId, insElderLeaveRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getCorpName())) {
            queryWrapper.eq(InsElderLeaveRecord::getCorpName, insElderLeaveRecord.getCorpName());
        }
        if (insElderLeaveRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getInstitutionId, insElderLeaveRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getInstitutionName())) {
            queryWrapper.eq(InsElderLeaveRecord::getInstitutionName, insElderLeaveRecord.getInstitutionName());
        }
        if (insElderLeaveRecord.getCheckId() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getCheckId, insElderLeaveRecord.getCheckId());
        }
        if (insElderLeaveRecord.getCheckDate() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getCheckDate, insElderLeaveRecord.getCheckDate());
        }
        if (insElderLeaveRecord.getElderId() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getElderId, insElderLeaveRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getElderName())) {
            queryWrapper.eq(InsElderLeaveRecord::getElderName, insElderLeaveRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getIdCard())) {
            queryWrapper.eq(InsElderLeaveRecord::getIdCard, insElderLeaveRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getSex())) {
            queryWrapper.eq(InsElderLeaveRecord::getSex, insElderLeaveRecord.getSex());
        }
        if (insElderLeaveRecord.getLeaveState() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getLeaveState, insElderLeaveRecord.getLeaveState());
        }
        if (insElderLeaveRecord.getStartTime() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getStartTime, insElderLeaveRecord.getStartTime());
        }
        if (insElderLeaveRecord.getRealityTime() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getRealityTime, insElderLeaveRecord.getRealityTime());
        }
        if (insElderLeaveRecord.getLeaveDay() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getLeaveDay, insElderLeaveRecord.getLeaveDay());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getLeaveMemo())) {
            queryWrapper.eq(InsElderLeaveRecord::getLeaveMemo, insElderLeaveRecord.getLeaveMemo());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getAccompanyName())) {
            queryWrapper.eq(InsElderLeaveRecord::getAccompanyName, insElderLeaveRecord.getAccompanyName());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getAccompanyTel())) {
            queryWrapper.eq(InsElderLeaveRecord::getAccompanyTel, insElderLeaveRecord.getAccompanyTel());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getRelationshipType())) {
            queryWrapper.eq(InsElderLeaveRecord::getRelationshipType, insElderLeaveRecord.getRelationshipType());
        }
        if (insElderLeaveRecord.getAuditState() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getAuditState, insElderLeaveRecord.getAuditState());
        }
        if (insElderLeaveRecord.getAuditId() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getAuditId, insElderLeaveRecord.getAuditId());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getAuditName())) {
            queryWrapper.eq(InsElderLeaveRecord::getAuditName, insElderLeaveRecord.getAuditName());
        }
        if (insElderLeaveRecord.getAuditTime() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getAuditTime, insElderLeaveRecord.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getAuditMemo())) {
            queryWrapper.eq(InsElderLeaveRecord::getAuditMemo, insElderLeaveRecord.getAuditMemo());
        }
        if (insElderLeaveRecord.getIsBedFee() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getIsBedFee, insElderLeaveRecord.getIsBedFee());
        }
        if (insElderLeaveRecord.getRefundState() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getRefundState, insElderLeaveRecord.getRefundState());
        }
        if (insElderLeaveRecord.getCalculateState() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getCalculateState, insElderLeaveRecord.getCalculateState());
        }
        if (insElderLeaveRecord.getNursingState() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getNursingState, insElderLeaveRecord.getNursingState());
        }
        if (insElderLeaveRecord.getNursingStaffId() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getNursingStaffId, insElderLeaveRecord.getNursingStaffId());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getNursingStaffName())) {
            queryWrapper.eq(InsElderLeaveRecord::getNursingStaffName, insElderLeaveRecord.getNursingStaffName());
        }
        if (insElderLeaveRecord.getCheckTime() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getCheckTime, insElderLeaveRecord.getCheckTime());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getAreaCode())) {
            queryWrapper.eq(InsElderLeaveRecord::getAreaCode, insElderLeaveRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getAreaName())) {
            queryWrapper.eq(InsElderLeaveRecord::getAreaName, insElderLeaveRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getRemark())) {
            queryWrapper.eq(InsElderLeaveRecord::getRemark, insElderLeaveRecord.getRemark());
        }
        if (insElderLeaveRecord.getCreateUser() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getCreateUser, insElderLeaveRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderLeaveRecord.getCreateName())) {
            queryWrapper.eq(InsElderLeaveRecord::getCreateName, insElderLeaveRecord.getCreateName());
        }
        if (insElderLeaveRecord.getCreateDept() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getCreateDept, insElderLeaveRecord.getCreateDept());
        }
        if (insElderLeaveRecord.getCreateTime() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getCreateTime, insElderLeaveRecord.getCreateTime());
        }
        if (insElderLeaveRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getUpdateUser, insElderLeaveRecord.getUpdateUser());
        }
        if (insElderLeaveRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getUpdateTime, insElderLeaveRecord.getUpdateTime());
        }
        if (insElderLeaveRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getIsDeleted, insElderLeaveRecord.getIsDeleted());
        }
        if (insElderLeaveRecord.getStatus() != null) {
            queryWrapper.eq(InsElderLeaveRecord::getStatus, insElderLeaveRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderLeaveRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderLeaveRecord insert(InsElderLeaveRecord insElderLeaveRecord) {
        insElderLeaveRecord.setId(null);
        getBaseMapper().insert(insElderLeaveRecord);
        return insElderLeaveRecord;
    }

    /**
    * 更新数据
    *
    * @param insElderLeaveRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderLeaveRecord update(InsElderLeaveRecord insElderLeaveRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderLeaveRecord> chainWrapper = new LambdaUpdateChainWrapper<InsElderLeaveRecord>(getBaseMapper());
        if (insElderLeaveRecord.getId() != null) {
            chainWrapper.set(InsElderLeaveRecord::getId, insElderLeaveRecord.getId());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getTenantId())) {
            chainWrapper.set(InsElderLeaveRecord::getTenantId, insElderLeaveRecord.getTenantId());
        }
        if (insElderLeaveRecord.getCorpId() != null) {
            chainWrapper.set(InsElderLeaveRecord::getCorpId, insElderLeaveRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getCorpName())) {
            chainWrapper.set(InsElderLeaveRecord::getCorpName, insElderLeaveRecord.getCorpName());
        }
        if (insElderLeaveRecord.getInstitutionId() != null) {
            chainWrapper.set(InsElderLeaveRecord::getInstitutionId, insElderLeaveRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getInstitutionName())) {
            chainWrapper.set(InsElderLeaveRecord::getInstitutionName, insElderLeaveRecord.getInstitutionName());
        }
        if (insElderLeaveRecord.getCheckId() != null) {
            chainWrapper.set(InsElderLeaveRecord::getCheckId, insElderLeaveRecord.getCheckId());
        }
        if (insElderLeaveRecord.getCheckDate() != null) {
            chainWrapper.set(InsElderLeaveRecord::getCheckDate, insElderLeaveRecord.getCheckDate());
        }
        if (insElderLeaveRecord.getElderId() != null) {
            chainWrapper.set(InsElderLeaveRecord::getElderId, insElderLeaveRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getElderName())) {
            chainWrapper.set(InsElderLeaveRecord::getElderName, insElderLeaveRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getIdCard())) {
            chainWrapper.set(InsElderLeaveRecord::getIdCard, insElderLeaveRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getSex())) {
            chainWrapper.set(InsElderLeaveRecord::getSex, insElderLeaveRecord.getSex());
        }
        if (insElderLeaveRecord.getLeaveState() != null) {
            chainWrapper.set(InsElderLeaveRecord::getLeaveState, insElderLeaveRecord.getLeaveState());
        }
        if (insElderLeaveRecord.getStartTime() != null) {
            chainWrapper.set(InsElderLeaveRecord::getStartTime, insElderLeaveRecord.getStartTime());
        }
        if (insElderLeaveRecord.getRealityTime() != null) {
            chainWrapper.set(InsElderLeaveRecord::getRealityTime, insElderLeaveRecord.getRealityTime());
        }
        if (insElderLeaveRecord.getLeaveDay() != null) {
            chainWrapper.set(InsElderLeaveRecord::getLeaveDay, insElderLeaveRecord.getLeaveDay());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getLeaveMemo())) {
            chainWrapper.set(InsElderLeaveRecord::getLeaveMemo, insElderLeaveRecord.getLeaveMemo());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getAccompanyName())) {
            chainWrapper.set(InsElderLeaveRecord::getAccompanyName, insElderLeaveRecord.getAccompanyName());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getAccompanyTel())) {
            chainWrapper.set(InsElderLeaveRecord::getAccompanyTel, insElderLeaveRecord.getAccompanyTel());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getRelationshipType())) {
            chainWrapper.set(InsElderLeaveRecord::getRelationshipType, insElderLeaveRecord.getRelationshipType());
        }
        if (insElderLeaveRecord.getAuditState() != null) {
            chainWrapper.set(InsElderLeaveRecord::getAuditState, insElderLeaveRecord.getAuditState());
        }
        if (insElderLeaveRecord.getAuditId() != null) {
            chainWrapper.set(InsElderLeaveRecord::getAuditId, insElderLeaveRecord.getAuditId());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getAuditName())) {
            chainWrapper.set(InsElderLeaveRecord::getAuditName, insElderLeaveRecord.getAuditName());
        }
        if (insElderLeaveRecord.getAuditTime() != null) {
            chainWrapper.set(InsElderLeaveRecord::getAuditTime, insElderLeaveRecord.getAuditTime());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getAuditMemo())) {
            chainWrapper.set(InsElderLeaveRecord::getAuditMemo, insElderLeaveRecord.getAuditMemo());
        }
        if (insElderLeaveRecord.getIsBedFee() != null) {
            chainWrapper.set(InsElderLeaveRecord::getIsBedFee, insElderLeaveRecord.getIsBedFee());
        }
        if (insElderLeaveRecord.getRefundState() != null) {
            chainWrapper.set(InsElderLeaveRecord::getRefundState, insElderLeaveRecord.getRefundState());
        }
        if (insElderLeaveRecord.getCalculateState() != null) {
            chainWrapper.set(InsElderLeaveRecord::getCalculateState, insElderLeaveRecord.getCalculateState());
        }
        if (insElderLeaveRecord.getNursingState() != null) {
            chainWrapper.set(InsElderLeaveRecord::getNursingState, insElderLeaveRecord.getNursingState());
        }
        if (insElderLeaveRecord.getNursingStaffId() != null) {
            chainWrapper.set(InsElderLeaveRecord::getNursingStaffId, insElderLeaveRecord.getNursingStaffId());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getNursingStaffName())) {
            chainWrapper.set(InsElderLeaveRecord::getNursingStaffName, insElderLeaveRecord.getNursingStaffName());
        }
        if (insElderLeaveRecord.getCheckTime() != null) {
            chainWrapper.set(InsElderLeaveRecord::getCheckTime, insElderLeaveRecord.getCheckTime());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getAreaCode())) {
            chainWrapper.set(InsElderLeaveRecord::getAreaCode, insElderLeaveRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getAreaName())) {
            chainWrapper.set(InsElderLeaveRecord::getAreaName, insElderLeaveRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getRemark())) {
            chainWrapper.set(InsElderLeaveRecord::getRemark, insElderLeaveRecord.getRemark());
        }
        if (insElderLeaveRecord.getCreateUser() != null) {
            chainWrapper.set(InsElderLeaveRecord::getCreateUser, insElderLeaveRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderLeaveRecord.getCreateName())) {
            chainWrapper.set(InsElderLeaveRecord::getCreateName, insElderLeaveRecord.getCreateName());
        }
        if (insElderLeaveRecord.getCreateDept() != null) {
            chainWrapper.set(InsElderLeaveRecord::getCreateDept, insElderLeaveRecord.getCreateDept());
        }
        if (insElderLeaveRecord.getCreateTime() != null) {
            chainWrapper.set(InsElderLeaveRecord::getCreateTime, insElderLeaveRecord.getCreateTime());
        }
        if (insElderLeaveRecord.getUpdateUser() != null) {
            chainWrapper.set(InsElderLeaveRecord::getUpdateUser, insElderLeaveRecord.getUpdateUser());
        }
        if (insElderLeaveRecord.getUpdateTime() != null) {
            chainWrapper.set(InsElderLeaveRecord::getUpdateTime, insElderLeaveRecord.getUpdateTime());
        }
        if (insElderLeaveRecord.getIsDeleted() != null) {
            chainWrapper.set(InsElderLeaveRecord::getIsDeleted, insElderLeaveRecord.getIsDeleted());
        }
        if (insElderLeaveRecord.getStatus() != null) {
            chainWrapper.set(InsElderLeaveRecord::getStatus, insElderLeaveRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderLeaveRecord::getId, insElderLeaveRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderLeaveRecord.getId());
        } else {
            return insElderLeaveRecord;
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
    public boolean saveInsElderLeaveRecordBatch(List<InsElderLeaveRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderLeaveRecord insElderLeaveRecord : insertList) {
            //使用默认的雪花算法生成
            insElderLeaveRecord.setId(null);
            //insElderLeaveRecord.setCreatedDt(currentDte);
            //insElderLeaveRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderLeaveRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderLeaveRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


