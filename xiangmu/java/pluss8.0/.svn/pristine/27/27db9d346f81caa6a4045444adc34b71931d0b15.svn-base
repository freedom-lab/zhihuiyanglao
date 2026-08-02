package cn.pluss.platform.service.insNursingExecutionRecord.impl;

import cn.pluss.platform.mapper.InsNursingExecutionRecordMapper;
import cn.pluss.platform.model.entity.InsNursingExecutionRecord;
import cn.pluss.platform.service.insNursingExecutionRecord.InsNursingExecutionRecordService;
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
@Service("insNursingExecutionRecordService")
public class InsNursingExecutionRecordServiceImpl extends ServiceImpl< InsNursingExecutionRecordMapper, InsNursingExecutionRecord> implements InsNursingExecutionRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingExecutionRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingExecutionRecord> queryPage(Map map) {
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
    public InsNursingExecutionRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingExecutionRecord queryOne(InsNursingExecutionRecord insNursingExecutionRecord){
        LambdaQueryWrapper<InsNursingExecutionRecord> queryWrapper = getQueryWrapper(insNursingExecutionRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingExecutionRecord
    * @return
    */
    @Override
    public List<InsNursingExecutionRecord> queryList(InsNursingExecutionRecord insNursingExecutionRecord) {
        LambdaQueryWrapper<InsNursingExecutionRecord> queryWrapper = getQueryWrapper(insNursingExecutionRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingExecutionRecord
    * @return
    */
    public static LambdaQueryWrapper<InsNursingExecutionRecord> getQueryWrapper(InsNursingExecutionRecord insNursingExecutionRecord){
        LambdaQueryWrapper<InsNursingExecutionRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingExecutionRecord.getId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getId, insNursingExecutionRecord.getId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getTenantId())) {
            queryWrapper.eq(InsNursingExecutionRecord::getTenantId, insNursingExecutionRecord.getTenantId());
        }
        if (insNursingExecutionRecord.getCorpId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getCorpId, insNursingExecutionRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getCorpName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getCorpName, insNursingExecutionRecord.getCorpName());
        }
        if (insNursingExecutionRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getInstitutionId, insNursingExecutionRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getInstitutionName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getInstitutionName, insNursingExecutionRecord.getInstitutionName());
        }
        if (insNursingExecutionRecord.getCheckId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getCheckId, insNursingExecutionRecord.getCheckId());
        }
        if (insNursingExecutionRecord.getCheckDate() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getCheckDate, insNursingExecutionRecord.getCheckDate());
        }
        if (insNursingExecutionRecord.getElderId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getElderId, insNursingExecutionRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getElderName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getElderName, insNursingExecutionRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getIdCard())) {
            queryWrapper.eq(InsNursingExecutionRecord::getIdCard, insNursingExecutionRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getSex())) {
            queryWrapper.eq(InsNursingExecutionRecord::getSex, insNursingExecutionRecord.getSex());
        }
        if (insNursingExecutionRecord.getNursingDate() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getNursingDate, insNursingExecutionRecord.getNursingDate());
        }
        if (insNursingExecutionRecord.getNursingLevelId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getNursingLevelId, insNursingExecutionRecord.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getNursingLevelName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getNursingLevelName, insNursingExecutionRecord.getNursingLevelName());
        }
        if (insNursingExecutionRecord.getTypeId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getTypeId, insNursingExecutionRecord.getTypeId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getTypeName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getTypeName, insNursingExecutionRecord.getTypeName());
        }
        if (insNursingExecutionRecord.getItemId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getItemId, insNursingExecutionRecord.getItemId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getItemName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getItemName, insNursingExecutionRecord.getItemName());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getItemCode())) {
            queryWrapper.eq(InsNursingExecutionRecord::getItemCode, insNursingExecutionRecord.getItemCode());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getPlanStartTime())) {
            queryWrapper.eq(InsNursingExecutionRecord::getPlanStartTime, insNursingExecutionRecord.getPlanStartTime());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getPlanEndTime())) {
            queryWrapper.eq(InsNursingExecutionRecord::getPlanEndTime, insNursingExecutionRecord.getPlanEndTime());
        }
        if (insNursingExecutionRecord.getNursingState() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getNursingState, insNursingExecutionRecord.getNursingState());
        }
        if (insNursingExecutionRecord.getServiceStartTime() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getServiceStartTime, insNursingExecutionRecord.getServiceStartTime());
        }
        if (insNursingExecutionRecord.getServiceEndTime() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getServiceEndTime, insNursingExecutionRecord.getServiceEndTime());
        }
        if (insNursingExecutionRecord.getServiceTime() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getServiceTime, insNursingExecutionRecord.getServiceTime());
        }
        if (insNursingExecutionRecord.getNursingGroupId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getNursingGroupId, insNursingExecutionRecord.getNursingGroupId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getNursingGroupName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getNursingGroupName, insNursingExecutionRecord.getNursingGroupName());
        }
        if (insNursingExecutionRecord.getNursingStaffId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getNursingStaffId, insNursingExecutionRecord.getNursingStaffId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getNursingStaffName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getNursingStaffName, insNursingExecutionRecord.getNursingStaffName());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getRevocationReason())) {
            queryWrapper.eq(InsNursingExecutionRecord::getRevocationReason, insNursingExecutionRecord.getRevocationReason());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getImgPath())) {
            queryWrapper.eq(InsNursingExecutionRecord::getImgPath, insNursingExecutionRecord.getImgPath());
        }
        if (insNursingExecutionRecord.getRecorderId() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getRecorderId, insNursingExecutionRecord.getRecorderId());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getNursingMemberCard())) {
            queryWrapper.eq(InsNursingExecutionRecord::getNursingMemberCard, insNursingExecutionRecord.getNursingMemberCard());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getAudioPath())) {
            queryWrapper.eq(InsNursingExecutionRecord::getAudioPath, insNursingExecutionRecord.getAudioPath());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getAreaCode())) {
            queryWrapper.eq(InsNursingExecutionRecord::getAreaCode, insNursingExecutionRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getAreaName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getAreaName, insNursingExecutionRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getRemark())) {
            queryWrapper.eq(InsNursingExecutionRecord::getRemark, insNursingExecutionRecord.getRemark());
        }
        if (insNursingExecutionRecord.getCreateUser() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getCreateUser, insNursingExecutionRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingExecutionRecord.getCreateName())) {
            queryWrapper.eq(InsNursingExecutionRecord::getCreateName, insNursingExecutionRecord.getCreateName());
        }
        if (insNursingExecutionRecord.getCreateDept() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getCreateDept, insNursingExecutionRecord.getCreateDept());
        }
        if (insNursingExecutionRecord.getCreateTime() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getCreateTime, insNursingExecutionRecord.getCreateTime());
        }
        if (insNursingExecutionRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getUpdateUser, insNursingExecutionRecord.getUpdateUser());
        }
        if (insNursingExecutionRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getUpdateTime, insNursingExecutionRecord.getUpdateTime());
        }
        if (insNursingExecutionRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getIsDeleted, insNursingExecutionRecord.getIsDeleted());
        }
        if (insNursingExecutionRecord.getStatus() != null) {
            queryWrapper.eq(InsNursingExecutionRecord::getStatus, insNursingExecutionRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingExecutionRecord insert(InsNursingExecutionRecord insNursingExecutionRecord) {
        insNursingExecutionRecord.setId(null);
        getBaseMapper().insert(insNursingExecutionRecord);
        return insNursingExecutionRecord;
    }

    /**
    * 更新数据
    *
    * @param insNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingExecutionRecord update(InsNursingExecutionRecord insNursingExecutionRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingExecutionRecord> chainWrapper = new LambdaUpdateChainWrapper<InsNursingExecutionRecord>(getBaseMapper());
        if (insNursingExecutionRecord.getId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getId, insNursingExecutionRecord.getId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getTenantId())) {
            chainWrapper.set(InsNursingExecutionRecord::getTenantId, insNursingExecutionRecord.getTenantId());
        }
        if (insNursingExecutionRecord.getCorpId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getCorpId, insNursingExecutionRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getCorpName())) {
            chainWrapper.set(InsNursingExecutionRecord::getCorpName, insNursingExecutionRecord.getCorpName());
        }
        if (insNursingExecutionRecord.getInstitutionId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getInstitutionId, insNursingExecutionRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getInstitutionName())) {
            chainWrapper.set(InsNursingExecutionRecord::getInstitutionName, insNursingExecutionRecord.getInstitutionName());
        }
        if (insNursingExecutionRecord.getCheckId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getCheckId, insNursingExecutionRecord.getCheckId());
        }
        if (insNursingExecutionRecord.getCheckDate() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getCheckDate, insNursingExecutionRecord.getCheckDate());
        }
        if (insNursingExecutionRecord.getElderId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getElderId, insNursingExecutionRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getElderName())) {
            chainWrapper.set(InsNursingExecutionRecord::getElderName, insNursingExecutionRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getIdCard())) {
            chainWrapper.set(InsNursingExecutionRecord::getIdCard, insNursingExecutionRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getSex())) {
            chainWrapper.set(InsNursingExecutionRecord::getSex, insNursingExecutionRecord.getSex());
        }
        if (insNursingExecutionRecord.getNursingDate() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getNursingDate, insNursingExecutionRecord.getNursingDate());
        }
        if (insNursingExecutionRecord.getNursingLevelId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getNursingLevelId, insNursingExecutionRecord.getNursingLevelId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getNursingLevelName())) {
            chainWrapper.set(InsNursingExecutionRecord::getNursingLevelName, insNursingExecutionRecord.getNursingLevelName());
        }
        if (insNursingExecutionRecord.getTypeId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getTypeId, insNursingExecutionRecord.getTypeId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getTypeName())) {
            chainWrapper.set(InsNursingExecutionRecord::getTypeName, insNursingExecutionRecord.getTypeName());
        }
        if (insNursingExecutionRecord.getItemId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getItemId, insNursingExecutionRecord.getItemId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getItemName())) {
            chainWrapper.set(InsNursingExecutionRecord::getItemName, insNursingExecutionRecord.getItemName());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getItemCode())) {
            chainWrapper.set(InsNursingExecutionRecord::getItemCode, insNursingExecutionRecord.getItemCode());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getPlanStartTime())) {
            chainWrapper.set(InsNursingExecutionRecord::getPlanStartTime, insNursingExecutionRecord.getPlanStartTime());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getPlanEndTime())) {
            chainWrapper.set(InsNursingExecutionRecord::getPlanEndTime, insNursingExecutionRecord.getPlanEndTime());
        }
        if (insNursingExecutionRecord.getNursingState() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getNursingState, insNursingExecutionRecord.getNursingState());
        }
        if (insNursingExecutionRecord.getServiceStartTime() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getServiceStartTime, insNursingExecutionRecord.getServiceStartTime());
        }
        if (insNursingExecutionRecord.getServiceEndTime() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getServiceEndTime, insNursingExecutionRecord.getServiceEndTime());
        }
        if (insNursingExecutionRecord.getServiceTime() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getServiceTime, insNursingExecutionRecord.getServiceTime());
        }
        if (insNursingExecutionRecord.getNursingGroupId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getNursingGroupId, insNursingExecutionRecord.getNursingGroupId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getNursingGroupName())) {
            chainWrapper.set(InsNursingExecutionRecord::getNursingGroupName, insNursingExecutionRecord.getNursingGroupName());
        }
        if (insNursingExecutionRecord.getNursingStaffId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getNursingStaffId, insNursingExecutionRecord.getNursingStaffId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getNursingStaffName())) {
            chainWrapper.set(InsNursingExecutionRecord::getNursingStaffName, insNursingExecutionRecord.getNursingStaffName());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getRevocationReason())) {
            chainWrapper.set(InsNursingExecutionRecord::getRevocationReason, insNursingExecutionRecord.getRevocationReason());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getImgPath())) {
            chainWrapper.set(InsNursingExecutionRecord::getImgPath, insNursingExecutionRecord.getImgPath());
        }
        if (insNursingExecutionRecord.getRecorderId() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getRecorderId, insNursingExecutionRecord.getRecorderId());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getNursingMemberCard())) {
            chainWrapper.set(InsNursingExecutionRecord::getNursingMemberCard, insNursingExecutionRecord.getNursingMemberCard());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getAudioPath())) {
            chainWrapper.set(InsNursingExecutionRecord::getAudioPath, insNursingExecutionRecord.getAudioPath());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getAreaCode())) {
            chainWrapper.set(InsNursingExecutionRecord::getAreaCode, insNursingExecutionRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getAreaName())) {
            chainWrapper.set(InsNursingExecutionRecord::getAreaName, insNursingExecutionRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getRemark())) {
            chainWrapper.set(InsNursingExecutionRecord::getRemark, insNursingExecutionRecord.getRemark());
        }
        if (insNursingExecutionRecord.getCreateUser() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getCreateUser, insNursingExecutionRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingExecutionRecord.getCreateName())) {
            chainWrapper.set(InsNursingExecutionRecord::getCreateName, insNursingExecutionRecord.getCreateName());
        }
        if (insNursingExecutionRecord.getCreateDept() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getCreateDept, insNursingExecutionRecord.getCreateDept());
        }
        if (insNursingExecutionRecord.getCreateTime() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getCreateTime, insNursingExecutionRecord.getCreateTime());
        }
        if (insNursingExecutionRecord.getUpdateUser() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getUpdateUser, insNursingExecutionRecord.getUpdateUser());
        }
        if (insNursingExecutionRecord.getUpdateTime() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getUpdateTime, insNursingExecutionRecord.getUpdateTime());
        }
        if (insNursingExecutionRecord.getIsDeleted() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getIsDeleted, insNursingExecutionRecord.getIsDeleted());
        }
        if (insNursingExecutionRecord.getStatus() != null) {
            chainWrapper.set(InsNursingExecutionRecord::getStatus, insNursingExecutionRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingExecutionRecord::getId, insNursingExecutionRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingExecutionRecord.getId());
        } else {
            return insNursingExecutionRecord;
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
    public boolean saveInsNursingExecutionRecordBatch(List<InsNursingExecutionRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingExecutionRecord insNursingExecutionRecord : insertList) {
            //使用默认的雪花算法生成
            insNursingExecutionRecord.setId(null);
            //insNursingExecutionRecord.setCreatedDt(currentDte);
            //insNursingExecutionRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingExecutionRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingExecutionRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


