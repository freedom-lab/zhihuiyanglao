package cn.pluss.platform.service.insElderChangeBedRecord.impl;

import cn.pluss.platform.mapper.InsElderChangeBedRecordMapper;
import cn.pluss.platform.model.entity.InsElderChangeBedRecord;
import cn.pluss.platform.service.insElderChangeBedRecord.InsElderChangeBedRecordService;
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
@Service("insElderChangeBedRecordService")
public class InsElderChangeBedRecordServiceImpl extends ServiceImpl< InsElderChangeBedRecordMapper, InsElderChangeBedRecord> implements InsElderChangeBedRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderChangeBedRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderChangeBedRecord> queryPage(Map map) {
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
    public InsElderChangeBedRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderChangeBedRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderChangeBedRecord queryOne(InsElderChangeBedRecord insElderChangeBedRecord){
        LambdaQueryWrapper<InsElderChangeBedRecord> queryWrapper = getQueryWrapper(insElderChangeBedRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderChangeBedRecord
    * @return
    */
    @Override
    public List<InsElderChangeBedRecord> queryList(InsElderChangeBedRecord insElderChangeBedRecord) {
        LambdaQueryWrapper<InsElderChangeBedRecord> queryWrapper = getQueryWrapper(insElderChangeBedRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderChangeBedRecord
    * @return
    */
    public static LambdaQueryWrapper<InsElderChangeBedRecord> getQueryWrapper(InsElderChangeBedRecord insElderChangeBedRecord){
        LambdaQueryWrapper<InsElderChangeBedRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderChangeBedRecord.getId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getId, insElderChangeBedRecord.getId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getTenantId())) {
            queryWrapper.eq(InsElderChangeBedRecord::getTenantId, insElderChangeBedRecord.getTenantId());
        }
        if (insElderChangeBedRecord.getCorpId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getCorpId, insElderChangeBedRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getCorpName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getCorpName, insElderChangeBedRecord.getCorpName());
        }
        if (insElderChangeBedRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getInstitutionId, insElderChangeBedRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getInstitutionName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getInstitutionName, insElderChangeBedRecord.getInstitutionName());
        }
        if (insElderChangeBedRecord.getCheckId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getCheckId, insElderChangeBedRecord.getCheckId());
        }
        if (insElderChangeBedRecord.getCheckDate() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getCheckDate, insElderChangeBedRecord.getCheckDate());
        }
        if (insElderChangeBedRecord.getElderId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getElderId, insElderChangeBedRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getElderName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getElderName, insElderChangeBedRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getIdCard())) {
            queryWrapper.eq(InsElderChangeBedRecord::getIdCard, insElderChangeBedRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getSex())) {
            queryWrapper.eq(InsElderChangeBedRecord::getSex, insElderChangeBedRecord.getSex());
        }
        if (insElderChangeBedRecord.getChangeState() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getChangeState, insElderChangeBedRecord.getChangeState());
        }
        if (insElderChangeBedRecord.getApplyTime() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getApplyTime, insElderChangeBedRecord.getApplyTime());
        }
        if (insElderChangeBedRecord.getExecuteDate() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getExecuteDate, insElderChangeBedRecord.getExecuteDate());
        }
        if (insElderChangeBedRecord.getIsRoom() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getIsRoom, insElderChangeBedRecord.getIsRoom());
        }
        if (insElderChangeBedRecord.getOldBuildingId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldBuildingId, insElderChangeBedRecord.getOldBuildingId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getOldBuildingName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldBuildingName, insElderChangeBedRecord.getOldBuildingName());
        }
        if (insElderChangeBedRecord.getOldFloorId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldFloorId, insElderChangeBedRecord.getOldFloorId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getOldFloorName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldFloorName, insElderChangeBedRecord.getOldFloorName());
        }
        if (insElderChangeBedRecord.getOldRoomId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldRoomId, insElderChangeBedRecord.getOldRoomId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getOldRoomName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldRoomName, insElderChangeBedRecord.getOldRoomName());
        }
        if (insElderChangeBedRecord.getOldBedId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldBedId, insElderChangeBedRecord.getOldBedId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getOldBedName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldBedName, insElderChangeBedRecord.getOldBedName());
        }
        if (insElderChangeBedRecord.getOldBedPrice() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldBedPrice, insElderChangeBedRecord.getOldBedPrice());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getOldBedInfo())) {
            queryWrapper.eq(InsElderChangeBedRecord::getOldBedInfo, insElderChangeBedRecord.getOldBedInfo());
        }
        if (insElderChangeBedRecord.getNewBuildingId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewBuildingId, insElderChangeBedRecord.getNewBuildingId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getNewBuildingName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewBuildingName, insElderChangeBedRecord.getNewBuildingName());
        }
        if (insElderChangeBedRecord.getNewFloorId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewFloorId, insElderChangeBedRecord.getNewFloorId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getNewFloorName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewFloorName, insElderChangeBedRecord.getNewFloorName());
        }
        if (insElderChangeBedRecord.getNewRoomId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewRoomId, insElderChangeBedRecord.getNewRoomId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getNewRoomName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewRoomName, insElderChangeBedRecord.getNewRoomName());
        }
        if (insElderChangeBedRecord.getNewBedId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewBedId, insElderChangeBedRecord.getNewBedId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getNewBedName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewBedName, insElderChangeBedRecord.getNewBedName());
        }
        if (insElderChangeBedRecord.getNewBedPrice() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewBedPrice, insElderChangeBedRecord.getNewBedPrice());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getNewBedInfo())) {
            queryWrapper.eq(InsElderChangeBedRecord::getNewBedInfo, insElderChangeBedRecord.getNewBedInfo());
        }
        if (insElderChangeBedRecord.getStandardId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getStandardId, insElderChangeBedRecord.getStandardId());
        }
        if (insElderChangeBedRecord.getCalculateState() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getCalculateState, insElderChangeBedRecord.getCalculateState());
        }
        if (insElderChangeBedRecord.getSettlementState() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getSettlementState, insElderChangeBedRecord.getSettlementState());
        }
        if (insElderChangeBedRecord.getBillId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getBillId, insElderChangeBedRecord.getBillId());
        }
        if (insElderChangeBedRecord.getAuditState() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getAuditState, insElderChangeBedRecord.getAuditState());
        }
        if (insElderChangeBedRecord.getAuditId() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getAuditId, insElderChangeBedRecord.getAuditId());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getAuditName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getAuditName, insElderChangeBedRecord.getAuditName());
        }
        if (insElderChangeBedRecord.getAuditTime() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getAuditTime, insElderChangeBedRecord.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getAuditMemo())) {
            queryWrapper.eq(InsElderChangeBedRecord::getAuditMemo, insElderChangeBedRecord.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getAreaCode())) {
            queryWrapper.eq(InsElderChangeBedRecord::getAreaCode, insElderChangeBedRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getAreaName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getAreaName, insElderChangeBedRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getRemark())) {
            queryWrapper.eq(InsElderChangeBedRecord::getRemark, insElderChangeBedRecord.getRemark());
        }
        if (insElderChangeBedRecord.getCreateUser() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getCreateUser, insElderChangeBedRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderChangeBedRecord.getCreateName())) {
            queryWrapper.eq(InsElderChangeBedRecord::getCreateName, insElderChangeBedRecord.getCreateName());
        }
        if (insElderChangeBedRecord.getCreateDept() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getCreateDept, insElderChangeBedRecord.getCreateDept());
        }
        if (insElderChangeBedRecord.getCreateTime() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getCreateTime, insElderChangeBedRecord.getCreateTime());
        }
        if (insElderChangeBedRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getUpdateUser, insElderChangeBedRecord.getUpdateUser());
        }
        if (insElderChangeBedRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getUpdateTime, insElderChangeBedRecord.getUpdateTime());
        }
        if (insElderChangeBedRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getIsDeleted, insElderChangeBedRecord.getIsDeleted());
        }
        if (insElderChangeBedRecord.getStatus() != null) {
            queryWrapper.eq(InsElderChangeBedRecord::getStatus, insElderChangeBedRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderChangeBedRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderChangeBedRecord insert(InsElderChangeBedRecord insElderChangeBedRecord) {
        insElderChangeBedRecord.setId(null);
        getBaseMapper().insert(insElderChangeBedRecord);
        return insElderChangeBedRecord;
    }

    /**
    * 更新数据
    *
    * @param insElderChangeBedRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderChangeBedRecord update(InsElderChangeBedRecord insElderChangeBedRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderChangeBedRecord> chainWrapper = new LambdaUpdateChainWrapper<InsElderChangeBedRecord>(getBaseMapper());
        if (insElderChangeBedRecord.getId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getId, insElderChangeBedRecord.getId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getTenantId())) {
            chainWrapper.set(InsElderChangeBedRecord::getTenantId, insElderChangeBedRecord.getTenantId());
        }
        if (insElderChangeBedRecord.getCorpId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getCorpId, insElderChangeBedRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getCorpName())) {
            chainWrapper.set(InsElderChangeBedRecord::getCorpName, insElderChangeBedRecord.getCorpName());
        }
        if (insElderChangeBedRecord.getInstitutionId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getInstitutionId, insElderChangeBedRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getInstitutionName())) {
            chainWrapper.set(InsElderChangeBedRecord::getInstitutionName, insElderChangeBedRecord.getInstitutionName());
        }
        if (insElderChangeBedRecord.getCheckId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getCheckId, insElderChangeBedRecord.getCheckId());
        }
        if (insElderChangeBedRecord.getCheckDate() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getCheckDate, insElderChangeBedRecord.getCheckDate());
        }
        if (insElderChangeBedRecord.getElderId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getElderId, insElderChangeBedRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getElderName())) {
            chainWrapper.set(InsElderChangeBedRecord::getElderName, insElderChangeBedRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getIdCard())) {
            chainWrapper.set(InsElderChangeBedRecord::getIdCard, insElderChangeBedRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getSex())) {
            chainWrapper.set(InsElderChangeBedRecord::getSex, insElderChangeBedRecord.getSex());
        }
        if (insElderChangeBedRecord.getChangeState() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getChangeState, insElderChangeBedRecord.getChangeState());
        }
        if (insElderChangeBedRecord.getApplyTime() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getApplyTime, insElderChangeBedRecord.getApplyTime());
        }
        if (insElderChangeBedRecord.getExecuteDate() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getExecuteDate, insElderChangeBedRecord.getExecuteDate());
        }
        if (insElderChangeBedRecord.getIsRoom() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getIsRoom, insElderChangeBedRecord.getIsRoom());
        }
        if (insElderChangeBedRecord.getOldBuildingId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getOldBuildingId, insElderChangeBedRecord.getOldBuildingId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getOldBuildingName())) {
            chainWrapper.set(InsElderChangeBedRecord::getOldBuildingName, insElderChangeBedRecord.getOldBuildingName());
        }
        if (insElderChangeBedRecord.getOldFloorId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getOldFloorId, insElderChangeBedRecord.getOldFloorId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getOldFloorName())) {
            chainWrapper.set(InsElderChangeBedRecord::getOldFloorName, insElderChangeBedRecord.getOldFloorName());
        }
        if (insElderChangeBedRecord.getOldRoomId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getOldRoomId, insElderChangeBedRecord.getOldRoomId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getOldRoomName())) {
            chainWrapper.set(InsElderChangeBedRecord::getOldRoomName, insElderChangeBedRecord.getOldRoomName());
        }
        if (insElderChangeBedRecord.getOldBedId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getOldBedId, insElderChangeBedRecord.getOldBedId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getOldBedName())) {
            chainWrapper.set(InsElderChangeBedRecord::getOldBedName, insElderChangeBedRecord.getOldBedName());
        }
        if (insElderChangeBedRecord.getOldBedPrice() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getOldBedPrice, insElderChangeBedRecord.getOldBedPrice());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getOldBedInfo())) {
            chainWrapper.set(InsElderChangeBedRecord::getOldBedInfo, insElderChangeBedRecord.getOldBedInfo());
        }
        if (insElderChangeBedRecord.getNewBuildingId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getNewBuildingId, insElderChangeBedRecord.getNewBuildingId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getNewBuildingName())) {
            chainWrapper.set(InsElderChangeBedRecord::getNewBuildingName, insElderChangeBedRecord.getNewBuildingName());
        }
        if (insElderChangeBedRecord.getNewFloorId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getNewFloorId, insElderChangeBedRecord.getNewFloorId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getNewFloorName())) {
            chainWrapper.set(InsElderChangeBedRecord::getNewFloorName, insElderChangeBedRecord.getNewFloorName());
        }
        if (insElderChangeBedRecord.getNewRoomId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getNewRoomId, insElderChangeBedRecord.getNewRoomId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getNewRoomName())) {
            chainWrapper.set(InsElderChangeBedRecord::getNewRoomName, insElderChangeBedRecord.getNewRoomName());
        }
        if (insElderChangeBedRecord.getNewBedId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getNewBedId, insElderChangeBedRecord.getNewBedId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getNewBedName())) {
            chainWrapper.set(InsElderChangeBedRecord::getNewBedName, insElderChangeBedRecord.getNewBedName());
        }
        if (insElderChangeBedRecord.getNewBedPrice() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getNewBedPrice, insElderChangeBedRecord.getNewBedPrice());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getNewBedInfo())) {
            chainWrapper.set(InsElderChangeBedRecord::getNewBedInfo, insElderChangeBedRecord.getNewBedInfo());
        }
        if (insElderChangeBedRecord.getStandardId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getStandardId, insElderChangeBedRecord.getStandardId());
        }
        if (insElderChangeBedRecord.getCalculateState() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getCalculateState, insElderChangeBedRecord.getCalculateState());
        }
        if (insElderChangeBedRecord.getSettlementState() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getSettlementState, insElderChangeBedRecord.getSettlementState());
        }
        if (insElderChangeBedRecord.getBillId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getBillId, insElderChangeBedRecord.getBillId());
        }
        if (insElderChangeBedRecord.getAuditState() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getAuditState, insElderChangeBedRecord.getAuditState());
        }
        if (insElderChangeBedRecord.getAuditId() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getAuditId, insElderChangeBedRecord.getAuditId());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getAuditName())) {
            chainWrapper.set(InsElderChangeBedRecord::getAuditName, insElderChangeBedRecord.getAuditName());
        }
        if (insElderChangeBedRecord.getAuditTime() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getAuditTime, insElderChangeBedRecord.getAuditTime());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getAuditMemo())) {
            chainWrapper.set(InsElderChangeBedRecord::getAuditMemo, insElderChangeBedRecord.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getAreaCode())) {
            chainWrapper.set(InsElderChangeBedRecord::getAreaCode, insElderChangeBedRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getAreaName())) {
            chainWrapper.set(InsElderChangeBedRecord::getAreaName, insElderChangeBedRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getRemark())) {
            chainWrapper.set(InsElderChangeBedRecord::getRemark, insElderChangeBedRecord.getRemark());
        }
        if (insElderChangeBedRecord.getCreateUser() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getCreateUser, insElderChangeBedRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderChangeBedRecord.getCreateName())) {
            chainWrapper.set(InsElderChangeBedRecord::getCreateName, insElderChangeBedRecord.getCreateName());
        }
        if (insElderChangeBedRecord.getCreateDept() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getCreateDept, insElderChangeBedRecord.getCreateDept());
        }
        if (insElderChangeBedRecord.getCreateTime() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getCreateTime, insElderChangeBedRecord.getCreateTime());
        }
        if (insElderChangeBedRecord.getUpdateUser() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getUpdateUser, insElderChangeBedRecord.getUpdateUser());
        }
        if (insElderChangeBedRecord.getUpdateTime() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getUpdateTime, insElderChangeBedRecord.getUpdateTime());
        }
        if (insElderChangeBedRecord.getIsDeleted() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getIsDeleted, insElderChangeBedRecord.getIsDeleted());
        }
        if (insElderChangeBedRecord.getStatus() != null) {
            chainWrapper.set(InsElderChangeBedRecord::getStatus, insElderChangeBedRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderChangeBedRecord::getId, insElderChangeBedRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderChangeBedRecord.getId());
        } else {
            return insElderChangeBedRecord;
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
    public boolean saveInsElderChangeBedRecordBatch(List<InsElderChangeBedRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderChangeBedRecord insElderChangeBedRecord : insertList) {
            //使用默认的雪花算法生成
            insElderChangeBedRecord.setId(null);
            //insElderChangeBedRecord.setCreatedDt(currentDte);
            //insElderChangeBedRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderChangeBedRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderChangeBedRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


