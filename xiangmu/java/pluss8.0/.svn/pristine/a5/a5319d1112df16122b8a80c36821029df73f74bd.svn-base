package cn.pluss.platform.service.careNursingExecutionRecord.impl;

import cn.pluss.platform.mapper.CareNursingExecutionRecordMapper;
import cn.pluss.platform.model.entity.CareNursingExecutionRecord;
import cn.pluss.platform.service.careNursingExecutionRecord.CareNursingExecutionRecordService;
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
@Service("careNursingExecutionRecordService")
public class CareNursingExecutionRecordServiceImpl extends ServiceImpl< CareNursingExecutionRecordMapper, CareNursingExecutionRecord> implements CareNursingExecutionRecordService {
    private static final Logger logger = LoggerFactory.getLogger(CareNursingExecutionRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CareNursingExecutionRecord> queryPage(Map map) {
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
    public CareNursingExecutionRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param careNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    public CareNursingExecutionRecord queryOne(CareNursingExecutionRecord careNursingExecutionRecord){
        LambdaQueryWrapper<CareNursingExecutionRecord> queryWrapper = getQueryWrapper(careNursingExecutionRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param careNursingExecutionRecord
    * @return
    */
    @Override
    public List<CareNursingExecutionRecord> queryList(CareNursingExecutionRecord careNursingExecutionRecord) {
        LambdaQueryWrapper<CareNursingExecutionRecord> queryWrapper = getQueryWrapper(careNursingExecutionRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param careNursingExecutionRecord
    * @return
    */
    public static LambdaQueryWrapper<CareNursingExecutionRecord> getQueryWrapper(CareNursingExecutionRecord careNursingExecutionRecord){
        LambdaQueryWrapper<CareNursingExecutionRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (careNursingExecutionRecord.getId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getId, careNursingExecutionRecord.getId());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getTenantId())) {
            queryWrapper.eq(CareNursingExecutionRecord::getTenantId, careNursingExecutionRecord.getTenantId());
        }
        if (careNursingExecutionRecord.getCorpId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getCorpId, careNursingExecutionRecord.getCorpId());
        }
        if (careNursingExecutionRecord.getInstitutionId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getInstitutionId, careNursingExecutionRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getInstitutionName())) {
            queryWrapper.eq(CareNursingExecutionRecord::getInstitutionName, careNursingExecutionRecord.getInstitutionName());
        }
        if (careNursingExecutionRecord.getEnrollId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getEnrollId, careNursingExecutionRecord.getEnrollId());
        }
        if (careNursingExecutionRecord.getEnrollDate() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getEnrollDate, careNursingExecutionRecord.getEnrollDate());
        }
        if (careNursingExecutionRecord.getElderId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getElderId, careNursingExecutionRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getElderName())) {
            queryWrapper.eq(CareNursingExecutionRecord::getElderName, careNursingExecutionRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getIdCard())) {
            queryWrapper.eq(CareNursingExecutionRecord::getIdCard, careNursingExecutionRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getSex())) {
            queryWrapper.eq(CareNursingExecutionRecord::getSex, careNursingExecutionRecord.getSex());
        }
        if (careNursingExecutionRecord.getNursingDate() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getNursingDate, careNursingExecutionRecord.getNursingDate());
        }
        if (careNursingExecutionRecord.getNursingLevelId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getNursingLevelId, careNursingExecutionRecord.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getNursingLevelName())) {
            queryWrapper.eq(CareNursingExecutionRecord::getNursingLevelName, careNursingExecutionRecord.getNursingLevelName());
        }
        if (careNursingExecutionRecord.getTypeId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getTypeId, careNursingExecutionRecord.getTypeId());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getTypeName())) {
            queryWrapper.eq(CareNursingExecutionRecord::getTypeName, careNursingExecutionRecord.getTypeName());
        }
        if (careNursingExecutionRecord.getItemId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getItemId, careNursingExecutionRecord.getItemId());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getItemName())) {
            queryWrapper.eq(CareNursingExecutionRecord::getItemName, careNursingExecutionRecord.getItemName());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getItemCode())) {
            queryWrapper.eq(CareNursingExecutionRecord::getItemCode, careNursingExecutionRecord.getItemCode());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getPlanStartTime())) {
            queryWrapper.eq(CareNursingExecutionRecord::getPlanStartTime, careNursingExecutionRecord.getPlanStartTime());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getPlanEndTime())) {
            queryWrapper.eq(CareNursingExecutionRecord::getPlanEndTime, careNursingExecutionRecord.getPlanEndTime());
        }
        if (careNursingExecutionRecord.getNursingState() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getNursingState, careNursingExecutionRecord.getNursingState());
        }
        if (careNursingExecutionRecord.getServiceStartTime() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getServiceStartTime, careNursingExecutionRecord.getServiceStartTime());
        }
        if (careNursingExecutionRecord.getServiceEndTime() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getServiceEndTime, careNursingExecutionRecord.getServiceEndTime());
        }
        if (careNursingExecutionRecord.getServiceTime() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getServiceTime, careNursingExecutionRecord.getServiceTime());
        }
        if (careNursingExecutionRecord.getNursingGroupId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getNursingGroupId, careNursingExecutionRecord.getNursingGroupId());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getNursingGroupName())) {
            queryWrapper.eq(CareNursingExecutionRecord::getNursingGroupName, careNursingExecutionRecord.getNursingGroupName());
        }
        if (careNursingExecutionRecord.getNursingStaffId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getNursingStaffId, careNursingExecutionRecord.getNursingStaffId());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getNursingStaffName())) {
            queryWrapper.eq(CareNursingExecutionRecord::getNursingStaffName, careNursingExecutionRecord.getNursingStaffName());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getRevocationReason())) {
            queryWrapper.eq(CareNursingExecutionRecord::getRevocationReason, careNursingExecutionRecord.getRevocationReason());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getImgPath())) {
            queryWrapper.eq(CareNursingExecutionRecord::getImgPath, careNursingExecutionRecord.getImgPath());
        }
        if (careNursingExecutionRecord.getRecorderId() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getRecorderId, careNursingExecutionRecord.getRecorderId());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getNursingMemberCard())) {
            queryWrapper.eq(CareNursingExecutionRecord::getNursingMemberCard, careNursingExecutionRecord.getNursingMemberCard());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getAreaCode())) {
            queryWrapper.eq(CareNursingExecutionRecord::getAreaCode, careNursingExecutionRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getAreaName())) {
            queryWrapper.eq(CareNursingExecutionRecord::getAreaName, careNursingExecutionRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getRemark())) {
            queryWrapper.eq(CareNursingExecutionRecord::getRemark, careNursingExecutionRecord.getRemark());
        }
        if (careNursingExecutionRecord.getCreateUser() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getCreateUser, careNursingExecutionRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(careNursingExecutionRecord.getCreateName())) {
            queryWrapper.eq(CareNursingExecutionRecord::getCreateName, careNursingExecutionRecord.getCreateName());
        }
        if (careNursingExecutionRecord.getCreateDept() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getCreateDept, careNursingExecutionRecord.getCreateDept());
        }
        if (careNursingExecutionRecord.getCreateTime() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getCreateTime, careNursingExecutionRecord.getCreateTime());
        }
        if (careNursingExecutionRecord.getUpdateUser() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getUpdateUser, careNursingExecutionRecord.getUpdateUser());
        }
        if (careNursingExecutionRecord.getUpdateTime() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getUpdateTime, careNursingExecutionRecord.getUpdateTime());
        }
        if (careNursingExecutionRecord.getIsDeleted() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getIsDeleted, careNursingExecutionRecord.getIsDeleted());
        }
        if (careNursingExecutionRecord.getStatus() != null) {
            queryWrapper.eq(CareNursingExecutionRecord::getStatus, careNursingExecutionRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param careNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingExecutionRecord insert(CareNursingExecutionRecord careNursingExecutionRecord) {
        careNursingExecutionRecord.setId(null);
        getBaseMapper().insert(careNursingExecutionRecord);
        return careNursingExecutionRecord;
    }

    /**
    * 更新数据
    *
    * @param careNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingExecutionRecord update(CareNursingExecutionRecord careNursingExecutionRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CareNursingExecutionRecord> chainWrapper = new LambdaUpdateChainWrapper<CareNursingExecutionRecord>(getBaseMapper());
        if (careNursingExecutionRecord.getId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getId, careNursingExecutionRecord.getId());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getTenantId())) {
            chainWrapper.set(CareNursingExecutionRecord::getTenantId, careNursingExecutionRecord.getTenantId());
        }
        if (careNursingExecutionRecord.getCorpId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getCorpId, careNursingExecutionRecord.getCorpId());
        }
        if (careNursingExecutionRecord.getInstitutionId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getInstitutionId, careNursingExecutionRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getInstitutionName())) {
            chainWrapper.set(CareNursingExecutionRecord::getInstitutionName, careNursingExecutionRecord.getInstitutionName());
        }
        if (careNursingExecutionRecord.getEnrollId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getEnrollId, careNursingExecutionRecord.getEnrollId());
        }
        if (careNursingExecutionRecord.getEnrollDate() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getEnrollDate, careNursingExecutionRecord.getEnrollDate());
        }
        if (careNursingExecutionRecord.getElderId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getElderId, careNursingExecutionRecord.getElderId());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getElderName())) {
            chainWrapper.set(CareNursingExecutionRecord::getElderName, careNursingExecutionRecord.getElderName());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getIdCard())) {
            chainWrapper.set(CareNursingExecutionRecord::getIdCard, careNursingExecutionRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getSex())) {
            chainWrapper.set(CareNursingExecutionRecord::getSex, careNursingExecutionRecord.getSex());
        }
        if (careNursingExecutionRecord.getNursingDate() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getNursingDate, careNursingExecutionRecord.getNursingDate());
        }
        if (careNursingExecutionRecord.getNursingLevelId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getNursingLevelId, careNursingExecutionRecord.getNursingLevelId());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getNursingLevelName())) {
            chainWrapper.set(CareNursingExecutionRecord::getNursingLevelName, careNursingExecutionRecord.getNursingLevelName());
        }
        if (careNursingExecutionRecord.getTypeId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getTypeId, careNursingExecutionRecord.getTypeId());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getTypeName())) {
            chainWrapper.set(CareNursingExecutionRecord::getTypeName, careNursingExecutionRecord.getTypeName());
        }
        if (careNursingExecutionRecord.getItemId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getItemId, careNursingExecutionRecord.getItemId());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getItemName())) {
            chainWrapper.set(CareNursingExecutionRecord::getItemName, careNursingExecutionRecord.getItemName());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getItemCode())) {
            chainWrapper.set(CareNursingExecutionRecord::getItemCode, careNursingExecutionRecord.getItemCode());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getPlanStartTime())) {
            chainWrapper.set(CareNursingExecutionRecord::getPlanStartTime, careNursingExecutionRecord.getPlanStartTime());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getPlanEndTime())) {
            chainWrapper.set(CareNursingExecutionRecord::getPlanEndTime, careNursingExecutionRecord.getPlanEndTime());
        }
        if (careNursingExecutionRecord.getNursingState() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getNursingState, careNursingExecutionRecord.getNursingState());
        }
        if (careNursingExecutionRecord.getServiceStartTime() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getServiceStartTime, careNursingExecutionRecord.getServiceStartTime());
        }
        if (careNursingExecutionRecord.getServiceEndTime() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getServiceEndTime, careNursingExecutionRecord.getServiceEndTime());
        }
        if (careNursingExecutionRecord.getServiceTime() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getServiceTime, careNursingExecutionRecord.getServiceTime());
        }
        if (careNursingExecutionRecord.getNursingGroupId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getNursingGroupId, careNursingExecutionRecord.getNursingGroupId());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getNursingGroupName())) {
            chainWrapper.set(CareNursingExecutionRecord::getNursingGroupName, careNursingExecutionRecord.getNursingGroupName());
        }
        if (careNursingExecutionRecord.getNursingStaffId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getNursingStaffId, careNursingExecutionRecord.getNursingStaffId());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getNursingStaffName())) {
            chainWrapper.set(CareNursingExecutionRecord::getNursingStaffName, careNursingExecutionRecord.getNursingStaffName());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getRevocationReason())) {
            chainWrapper.set(CareNursingExecutionRecord::getRevocationReason, careNursingExecutionRecord.getRevocationReason());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getImgPath())) {
            chainWrapper.set(CareNursingExecutionRecord::getImgPath, careNursingExecutionRecord.getImgPath());
        }
        if (careNursingExecutionRecord.getRecorderId() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getRecorderId, careNursingExecutionRecord.getRecorderId());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getNursingMemberCard())) {
            chainWrapper.set(CareNursingExecutionRecord::getNursingMemberCard, careNursingExecutionRecord.getNursingMemberCard());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getAreaCode())) {
            chainWrapper.set(CareNursingExecutionRecord::getAreaCode, careNursingExecutionRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getAreaName())) {
            chainWrapper.set(CareNursingExecutionRecord::getAreaName, careNursingExecutionRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getRemark())) {
            chainWrapper.set(CareNursingExecutionRecord::getRemark, careNursingExecutionRecord.getRemark());
        }
        if (careNursingExecutionRecord.getCreateUser() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getCreateUser, careNursingExecutionRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(careNursingExecutionRecord.getCreateName())) {
            chainWrapper.set(CareNursingExecutionRecord::getCreateName, careNursingExecutionRecord.getCreateName());
        }
        if (careNursingExecutionRecord.getCreateDept() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getCreateDept, careNursingExecutionRecord.getCreateDept());
        }
        if (careNursingExecutionRecord.getCreateTime() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getCreateTime, careNursingExecutionRecord.getCreateTime());
        }
        if (careNursingExecutionRecord.getUpdateUser() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getUpdateUser, careNursingExecutionRecord.getUpdateUser());
        }
        if (careNursingExecutionRecord.getUpdateTime() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getUpdateTime, careNursingExecutionRecord.getUpdateTime());
        }
        if (careNursingExecutionRecord.getIsDeleted() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getIsDeleted, careNursingExecutionRecord.getIsDeleted());
        }
        if (careNursingExecutionRecord.getStatus() != null) {
            chainWrapper.set(CareNursingExecutionRecord::getStatus, careNursingExecutionRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CareNursingExecutionRecord::getId, careNursingExecutionRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(careNursingExecutionRecord.getId());
        } else {
            return careNursingExecutionRecord;
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
    public boolean saveCareNursingExecutionRecordBatch(List<CareNursingExecutionRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CareNursingExecutionRecord careNursingExecutionRecord : insertList) {
            //使用默认的雪花算法生成
            careNursingExecutionRecord.setId(null);
            //careNursingExecutionRecord.setCreatedDt(currentDte);
            //careNursingExecutionRecord.setUpdatedDt(currentDte);
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
    public Integer deleteCareNursingExecutionRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CareNursingExecutionRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


