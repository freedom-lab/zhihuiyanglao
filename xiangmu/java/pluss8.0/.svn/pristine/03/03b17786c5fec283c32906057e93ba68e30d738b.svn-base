package cn.pluss.platform.service.insNursingRehabExecutionRecord.impl;

import cn.pluss.platform.mapper.InsNursingRehabExecutionRecordMapper;
import cn.pluss.platform.model.entity.InsNursingRehabExecutionRecord;
import cn.pluss.platform.service.insNursingRehabExecutionRecord.InsNursingRehabExecutionRecordService;
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
@Service("insNursingRehabExecutionRecordService")
public class InsNursingRehabExecutionRecordServiceImpl extends ServiceImpl< InsNursingRehabExecutionRecordMapper, InsNursingRehabExecutionRecord> implements InsNursingRehabExecutionRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingRehabExecutionRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingRehabExecutionRecord> queryPage(Map map) {
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
    public InsNursingRehabExecutionRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRehabExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingRehabExecutionRecord queryOne(InsNursingRehabExecutionRecord insNursingRehabExecutionRecord){
        LambdaQueryWrapper<InsNursingRehabExecutionRecord> queryWrapper = getQueryWrapper(insNursingRehabExecutionRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRehabExecutionRecord
    * @return
    */
    @Override
    public List<InsNursingRehabExecutionRecord> queryList(InsNursingRehabExecutionRecord insNursingRehabExecutionRecord) {
        LambdaQueryWrapper<InsNursingRehabExecutionRecord> queryWrapper = getQueryWrapper(insNursingRehabExecutionRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingRehabExecutionRecord
    * @return
    */
    public static LambdaQueryWrapper<InsNursingRehabExecutionRecord> getQueryWrapper(InsNursingRehabExecutionRecord insNursingRehabExecutionRecord){
        LambdaQueryWrapper<InsNursingRehabExecutionRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingRehabExecutionRecord.getId() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getId, insNursingRehabExecutionRecord.getId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getTenantId())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getTenantId, insNursingRehabExecutionRecord.getTenantId());
        }
        if (insNursingRehabExecutionRecord.getCorpId() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getCorpId, insNursingRehabExecutionRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getCorpName())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getCorpName, insNursingRehabExecutionRecord.getCorpName());
        }
        if (insNursingRehabExecutionRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getInstitutionId, insNursingRehabExecutionRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getInstitutionName())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getInstitutionName, insNursingRehabExecutionRecord.getInstitutionName());
        }
        if (insNursingRehabExecutionRecord.getCheckId() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getCheckId, insNursingRehabExecutionRecord.getCheckId());
        }
        if (insNursingRehabExecutionRecord.getCheckDate() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getCheckDate, insNursingRehabExecutionRecord.getCheckDate());
        }
        if (insNursingRehabExecutionRecord.getElderId() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getElderId, insNursingRehabExecutionRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getElderName())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getElderName, insNursingRehabExecutionRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getIdCard())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getIdCard, insNursingRehabExecutionRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getSex())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getSex, insNursingRehabExecutionRecord.getSex());
        }
        if (insNursingRehabExecutionRecord.getExecutionDate() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getExecutionDate, insNursingRehabExecutionRecord.getExecutionDate());
        }
        if (insNursingRehabExecutionRecord.getPlanId() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getPlanId, insNursingRehabExecutionRecord.getPlanId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getPlanName())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getPlanName, insNursingRehabExecutionRecord.getPlanName());
        }
        if (insNursingRehabExecutionRecord.getItemId() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getItemId, insNursingRehabExecutionRecord.getItemId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getItemName())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getItemName, insNursingRehabExecutionRecord.getItemName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getTrainingContent())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getTrainingContent, insNursingRehabExecutionRecord.getTrainingContent());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getPlanStartTime())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getPlanStartTime, insNursingRehabExecutionRecord.getPlanStartTime());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getPlanEndTime())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getPlanEndTime, insNursingRehabExecutionRecord.getPlanEndTime());
        }
        if (insNursingRehabExecutionRecord.getNursingState() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getNursingState, insNursingRehabExecutionRecord.getNursingState());
        }
        if (insNursingRehabExecutionRecord.getServiceStartTime() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getServiceStartTime, insNursingRehabExecutionRecord.getServiceStartTime());
        }
        if (insNursingRehabExecutionRecord.getServiceEndTime() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getServiceEndTime, insNursingRehabExecutionRecord.getServiceEndTime());
        }
        if (insNursingRehabExecutionRecord.getServiceTime() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getServiceTime, insNursingRehabExecutionRecord.getServiceTime());
        }
        if (insNursingRehabExecutionRecord.getNursingStaffId() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getNursingStaffId, insNursingRehabExecutionRecord.getNursingStaffId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getNursingStaffName())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getNursingStaffName, insNursingRehabExecutionRecord.getNursingStaffName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getRevocationReason())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getRevocationReason, insNursingRehabExecutionRecord.getRevocationReason());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getImgPath())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getImgPath, insNursingRehabExecutionRecord.getImgPath());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getAreaCode())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getAreaCode, insNursingRehabExecutionRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getAreaName())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getAreaName, insNursingRehabExecutionRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getRemark())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getRemark, insNursingRehabExecutionRecord.getRemark());
        }
        if (insNursingRehabExecutionRecord.getCreateUser() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getCreateUser, insNursingRehabExecutionRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingRehabExecutionRecord.getCreateName())) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getCreateName, insNursingRehabExecutionRecord.getCreateName());
        }
        if (insNursingRehabExecutionRecord.getCreateDept() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getCreateDept, insNursingRehabExecutionRecord.getCreateDept());
        }
        if (insNursingRehabExecutionRecord.getCreateTime() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getCreateTime, insNursingRehabExecutionRecord.getCreateTime());
        }
        if (insNursingRehabExecutionRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getUpdateUser, insNursingRehabExecutionRecord.getUpdateUser());
        }
        if (insNursingRehabExecutionRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getUpdateTime, insNursingRehabExecutionRecord.getUpdateTime());
        }
        if (insNursingRehabExecutionRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getIsDeleted, insNursingRehabExecutionRecord.getIsDeleted());
        }
        if (insNursingRehabExecutionRecord.getStatus() != null) {
            queryWrapper.eq(InsNursingRehabExecutionRecord::getStatus, insNursingRehabExecutionRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingRehabExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabExecutionRecord insert(InsNursingRehabExecutionRecord insNursingRehabExecutionRecord) {
        insNursingRehabExecutionRecord.setId(null);
        getBaseMapper().insert(insNursingRehabExecutionRecord);
        return insNursingRehabExecutionRecord;
    }

    /**
    * 更新数据
    *
    * @param insNursingRehabExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabExecutionRecord update(InsNursingRehabExecutionRecord insNursingRehabExecutionRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingRehabExecutionRecord> chainWrapper = new LambdaUpdateChainWrapper<InsNursingRehabExecutionRecord>(getBaseMapper());
        if (insNursingRehabExecutionRecord.getId() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getId, insNursingRehabExecutionRecord.getId());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getTenantId())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getTenantId, insNursingRehabExecutionRecord.getTenantId());
        }
        if (insNursingRehabExecutionRecord.getCorpId() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getCorpId, insNursingRehabExecutionRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getCorpName())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getCorpName, insNursingRehabExecutionRecord.getCorpName());
        }
        if (insNursingRehabExecutionRecord.getInstitutionId() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getInstitutionId, insNursingRehabExecutionRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getInstitutionName())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getInstitutionName, insNursingRehabExecutionRecord.getInstitutionName());
        }
        if (insNursingRehabExecutionRecord.getCheckId() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getCheckId, insNursingRehabExecutionRecord.getCheckId());
        }
        if (insNursingRehabExecutionRecord.getCheckDate() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getCheckDate, insNursingRehabExecutionRecord.getCheckDate());
        }
        if (insNursingRehabExecutionRecord.getElderId() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getElderId, insNursingRehabExecutionRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getElderName())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getElderName, insNursingRehabExecutionRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getIdCard())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getIdCard, insNursingRehabExecutionRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getSex())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getSex, insNursingRehabExecutionRecord.getSex());
        }
        if (insNursingRehabExecutionRecord.getExecutionDate() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getExecutionDate, insNursingRehabExecutionRecord.getExecutionDate());
        }
        if (insNursingRehabExecutionRecord.getPlanId() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getPlanId, insNursingRehabExecutionRecord.getPlanId());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getPlanName())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getPlanName, insNursingRehabExecutionRecord.getPlanName());
        }
        if (insNursingRehabExecutionRecord.getItemId() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getItemId, insNursingRehabExecutionRecord.getItemId());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getItemName())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getItemName, insNursingRehabExecutionRecord.getItemName());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getTrainingContent())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getTrainingContent, insNursingRehabExecutionRecord.getTrainingContent());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getPlanStartTime())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getPlanStartTime, insNursingRehabExecutionRecord.getPlanStartTime());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getPlanEndTime())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getPlanEndTime, insNursingRehabExecutionRecord.getPlanEndTime());
        }
        if (insNursingRehabExecutionRecord.getNursingState() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getNursingState, insNursingRehabExecutionRecord.getNursingState());
        }
        if (insNursingRehabExecutionRecord.getServiceStartTime() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getServiceStartTime, insNursingRehabExecutionRecord.getServiceStartTime());
        }
        if (insNursingRehabExecutionRecord.getServiceEndTime() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getServiceEndTime, insNursingRehabExecutionRecord.getServiceEndTime());
        }
        if (insNursingRehabExecutionRecord.getServiceTime() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getServiceTime, insNursingRehabExecutionRecord.getServiceTime());
        }
        if (insNursingRehabExecutionRecord.getNursingStaffId() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getNursingStaffId, insNursingRehabExecutionRecord.getNursingStaffId());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getNursingStaffName())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getNursingStaffName, insNursingRehabExecutionRecord.getNursingStaffName());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getRevocationReason())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getRevocationReason, insNursingRehabExecutionRecord.getRevocationReason());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getImgPath())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getImgPath, insNursingRehabExecutionRecord.getImgPath());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getAreaCode())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getAreaCode, insNursingRehabExecutionRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getAreaName())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getAreaName, insNursingRehabExecutionRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getRemark())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getRemark, insNursingRehabExecutionRecord.getRemark());
        }
        if (insNursingRehabExecutionRecord.getCreateUser() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getCreateUser, insNursingRehabExecutionRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingRehabExecutionRecord.getCreateName())) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getCreateName, insNursingRehabExecutionRecord.getCreateName());
        }
        if (insNursingRehabExecutionRecord.getCreateDept() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getCreateDept, insNursingRehabExecutionRecord.getCreateDept());
        }
        if (insNursingRehabExecutionRecord.getCreateTime() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getCreateTime, insNursingRehabExecutionRecord.getCreateTime());
        }
        if (insNursingRehabExecutionRecord.getUpdateUser() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getUpdateUser, insNursingRehabExecutionRecord.getUpdateUser());
        }
        if (insNursingRehabExecutionRecord.getUpdateTime() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getUpdateTime, insNursingRehabExecutionRecord.getUpdateTime());
        }
        if (insNursingRehabExecutionRecord.getIsDeleted() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getIsDeleted, insNursingRehabExecutionRecord.getIsDeleted());
        }
        if (insNursingRehabExecutionRecord.getStatus() != null) {
            chainWrapper.set(InsNursingRehabExecutionRecord::getStatus, insNursingRehabExecutionRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingRehabExecutionRecord::getId, insNursingRehabExecutionRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingRehabExecutionRecord.getId());
        } else {
            return insNursingRehabExecutionRecord;
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
    public boolean saveInsNursingRehabExecutionRecordBatch(List<InsNursingRehabExecutionRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingRehabExecutionRecord insNursingRehabExecutionRecord : insertList) {
            //使用默认的雪花算法生成
            insNursingRehabExecutionRecord.setId(null);
            //insNursingRehabExecutionRecord.setCreatedDt(currentDte);
            //insNursingRehabExecutionRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingRehabExecutionRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingRehabExecutionRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


