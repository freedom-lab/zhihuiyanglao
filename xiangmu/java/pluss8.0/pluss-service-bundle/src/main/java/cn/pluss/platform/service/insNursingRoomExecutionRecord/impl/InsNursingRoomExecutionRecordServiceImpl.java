package cn.pluss.platform.service.insNursingRoomExecutionRecord.impl;

import cn.pluss.platform.mapper.InsNursingRoomExecutionRecordMapper;
import cn.pluss.platform.model.entity.InsNursingRoomExecutionRecord;
import cn.pluss.platform.service.insNursingRoomExecutionRecord.InsNursingRoomExecutionRecordService;
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
@Service("insNursingRoomExecutionRecordService")
public class InsNursingRoomExecutionRecordServiceImpl extends ServiceImpl< InsNursingRoomExecutionRecordMapper, InsNursingRoomExecutionRecord> implements InsNursingRoomExecutionRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingRoomExecutionRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingRoomExecutionRecord> queryPage(Map map) {
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
    public InsNursingRoomExecutionRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRoomExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingRoomExecutionRecord queryOne(InsNursingRoomExecutionRecord insNursingRoomExecutionRecord){
        LambdaQueryWrapper<InsNursingRoomExecutionRecord> queryWrapper = getQueryWrapper(insNursingRoomExecutionRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRoomExecutionRecord
    * @return
    */
    @Override
    public List<InsNursingRoomExecutionRecord> queryList(InsNursingRoomExecutionRecord insNursingRoomExecutionRecord) {
        LambdaQueryWrapper<InsNursingRoomExecutionRecord> queryWrapper = getQueryWrapper(insNursingRoomExecutionRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingRoomExecutionRecord
    * @return
    */
    public static LambdaQueryWrapper<InsNursingRoomExecutionRecord> getQueryWrapper(InsNursingRoomExecutionRecord insNursingRoomExecutionRecord){
        LambdaQueryWrapper<InsNursingRoomExecutionRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingRoomExecutionRecord.getId() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getId, insNursingRoomExecutionRecord.getId());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getTenantId())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getTenantId, insNursingRoomExecutionRecord.getTenantId());
        }
        if (insNursingRoomExecutionRecord.getCorpId() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getCorpId, insNursingRoomExecutionRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getCorpName())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getCorpName, insNursingRoomExecutionRecord.getCorpName());
        }
        if (insNursingRoomExecutionRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getInstitutionId, insNursingRoomExecutionRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getInstitutionName())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getInstitutionName, insNursingRoomExecutionRecord.getInstitutionName());
        }
        if (insNursingRoomExecutionRecord.getPlanId() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getPlanId, insNursingRoomExecutionRecord.getPlanId());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getPlanName())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getPlanName, insNursingRoomExecutionRecord.getPlanName());
        }
        if (insNursingRoomExecutionRecord.getPatrolRoomDate() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getPatrolRoomDate, insNursingRoomExecutionRecord.getPatrolRoomDate());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getTimeSlot())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getTimeSlot, insNursingRoomExecutionRecord.getTimeSlot());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getPatrolContent())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getPatrolContent, insNursingRoomExecutionRecord.getPatrolContent());
        }
        if (insNursingRoomExecutionRecord.getBuildingId() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getBuildingId, insNursingRoomExecutionRecord.getBuildingId());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getBuildingName())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getBuildingName, insNursingRoomExecutionRecord.getBuildingName());
        }
        if (insNursingRoomExecutionRecord.getFloorId() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getFloorId, insNursingRoomExecutionRecord.getFloorId());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getFloorName())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getFloorName, insNursingRoomExecutionRecord.getFloorName());
        }
        if (insNursingRoomExecutionRecord.getRoomId() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getRoomId, insNursingRoomExecutionRecord.getRoomId());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getRoomName())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getRoomName, insNursingRoomExecutionRecord.getRoomName());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getRoomInfo())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getRoomInfo, insNursingRoomExecutionRecord.getRoomInfo());
        }
        if (insNursingRoomExecutionRecord.getPatrolState() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getPatrolState, insNursingRoomExecutionRecord.getPatrolState());
        }
        if (insNursingRoomExecutionRecord.getStaffId() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getStaffId, insNursingRoomExecutionRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getStaffName())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getStaffName, insNursingRoomExecutionRecord.getStaffName());
        }
        if (insNursingRoomExecutionRecord.getNursingGroupId() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getNursingGroupId, insNursingRoomExecutionRecord.getNursingGroupId());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getNursingGroupName())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getNursingGroupName, insNursingRoomExecutionRecord.getNursingGroupName());
        }
        if (insNursingRoomExecutionRecord.getCompleteTime() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getCompleteTime, insNursingRoomExecutionRecord.getCompleteTime());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getPatrolIllustrate())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getPatrolIllustrate, insNursingRoomExecutionRecord.getPatrolIllustrate());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getImgPath())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getImgPath, insNursingRoomExecutionRecord.getImgPath());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getRemark())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getRemark, insNursingRoomExecutionRecord.getRemark());
        }
        if (insNursingRoomExecutionRecord.getCreateUser() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getCreateUser, insNursingRoomExecutionRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingRoomExecutionRecord.getCreateName())) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getCreateName, insNursingRoomExecutionRecord.getCreateName());
        }
        if (insNursingRoomExecutionRecord.getCreateDept() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getCreateDept, insNursingRoomExecutionRecord.getCreateDept());
        }
        if (insNursingRoomExecutionRecord.getCreateTime() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getCreateTime, insNursingRoomExecutionRecord.getCreateTime());
        }
        if (insNursingRoomExecutionRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getUpdateUser, insNursingRoomExecutionRecord.getUpdateUser());
        }
        if (insNursingRoomExecutionRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getUpdateTime, insNursingRoomExecutionRecord.getUpdateTime());
        }
        if (insNursingRoomExecutionRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getIsDeleted, insNursingRoomExecutionRecord.getIsDeleted());
        }
        if (insNursingRoomExecutionRecord.getStatus() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getStatus, insNursingRoomExecutionRecord.getStatus());
        }
        if (insNursingRoomExecutionRecord.getPatrolType() != null) {
            queryWrapper.eq(InsNursingRoomExecutionRecord::getPatrolType, insNursingRoomExecutionRecord.getPatrolType());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingRoomExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRoomExecutionRecord insert(InsNursingRoomExecutionRecord insNursingRoomExecutionRecord) {
        insNursingRoomExecutionRecord.setId(null);
        getBaseMapper().insert(insNursingRoomExecutionRecord);
        return insNursingRoomExecutionRecord;
    }

    /**
    * 更新数据
    *
    * @param insNursingRoomExecutionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRoomExecutionRecord update(InsNursingRoomExecutionRecord insNursingRoomExecutionRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingRoomExecutionRecord> chainWrapper = new LambdaUpdateChainWrapper<InsNursingRoomExecutionRecord>(getBaseMapper());
        if (insNursingRoomExecutionRecord.getId() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getId, insNursingRoomExecutionRecord.getId());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getTenantId())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getTenantId, insNursingRoomExecutionRecord.getTenantId());
        }
        if (insNursingRoomExecutionRecord.getCorpId() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getCorpId, insNursingRoomExecutionRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getCorpName())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getCorpName, insNursingRoomExecutionRecord.getCorpName());
        }
        if (insNursingRoomExecutionRecord.getInstitutionId() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getInstitutionId, insNursingRoomExecutionRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getInstitutionName())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getInstitutionName, insNursingRoomExecutionRecord.getInstitutionName());
        }
        if (insNursingRoomExecutionRecord.getPlanId() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getPlanId, insNursingRoomExecutionRecord.getPlanId());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getPlanName())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getPlanName, insNursingRoomExecutionRecord.getPlanName());
        }
        if (insNursingRoomExecutionRecord.getPatrolRoomDate() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getPatrolRoomDate, insNursingRoomExecutionRecord.getPatrolRoomDate());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getTimeSlot())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getTimeSlot, insNursingRoomExecutionRecord.getTimeSlot());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getPatrolContent())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getPatrolContent, insNursingRoomExecutionRecord.getPatrolContent());
        }
        if (insNursingRoomExecutionRecord.getBuildingId() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getBuildingId, insNursingRoomExecutionRecord.getBuildingId());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getBuildingName())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getBuildingName, insNursingRoomExecutionRecord.getBuildingName());
        }
        if (insNursingRoomExecutionRecord.getFloorId() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getFloorId, insNursingRoomExecutionRecord.getFloorId());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getFloorName())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getFloorName, insNursingRoomExecutionRecord.getFloorName());
        }
        if (insNursingRoomExecutionRecord.getRoomId() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getRoomId, insNursingRoomExecutionRecord.getRoomId());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getRoomName())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getRoomName, insNursingRoomExecutionRecord.getRoomName());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getRoomInfo())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getRoomInfo, insNursingRoomExecutionRecord.getRoomInfo());
        }
        if (insNursingRoomExecutionRecord.getPatrolState() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getPatrolState, insNursingRoomExecutionRecord.getPatrolState());
        }
        if (insNursingRoomExecutionRecord.getStaffId() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getStaffId, insNursingRoomExecutionRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getStaffName())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getStaffName, insNursingRoomExecutionRecord.getStaffName());
        }
        if (insNursingRoomExecutionRecord.getNursingGroupId() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getNursingGroupId, insNursingRoomExecutionRecord.getNursingGroupId());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getNursingGroupName())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getNursingGroupName, insNursingRoomExecutionRecord.getNursingGroupName());
        }
        if (insNursingRoomExecutionRecord.getCompleteTime() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getCompleteTime, insNursingRoomExecutionRecord.getCompleteTime());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getPatrolIllustrate())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getPatrolIllustrate, insNursingRoomExecutionRecord.getPatrolIllustrate());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getImgPath())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getImgPath, insNursingRoomExecutionRecord.getImgPath());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getRemark())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getRemark, insNursingRoomExecutionRecord.getRemark());
        }
        if (insNursingRoomExecutionRecord.getCreateUser() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getCreateUser, insNursingRoomExecutionRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingRoomExecutionRecord.getCreateName())) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getCreateName, insNursingRoomExecutionRecord.getCreateName());
        }
        if (insNursingRoomExecutionRecord.getCreateDept() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getCreateDept, insNursingRoomExecutionRecord.getCreateDept());
        }
        if (insNursingRoomExecutionRecord.getCreateTime() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getCreateTime, insNursingRoomExecutionRecord.getCreateTime());
        }
        if (insNursingRoomExecutionRecord.getUpdateUser() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getUpdateUser, insNursingRoomExecutionRecord.getUpdateUser());
        }
        if (insNursingRoomExecutionRecord.getUpdateTime() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getUpdateTime, insNursingRoomExecutionRecord.getUpdateTime());
        }
        if (insNursingRoomExecutionRecord.getIsDeleted() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getIsDeleted, insNursingRoomExecutionRecord.getIsDeleted());
        }
        if (insNursingRoomExecutionRecord.getStatus() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getStatus, insNursingRoomExecutionRecord.getStatus());
        }
        if (insNursingRoomExecutionRecord.getPatrolType() != null) {
            chainWrapper.set(InsNursingRoomExecutionRecord::getPatrolType, insNursingRoomExecutionRecord.getPatrolType());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingRoomExecutionRecord::getId, insNursingRoomExecutionRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingRoomExecutionRecord.getId());
        } else {
            return insNursingRoomExecutionRecord;
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
    public boolean saveInsNursingRoomExecutionRecordBatch(List<InsNursingRoomExecutionRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingRoomExecutionRecord insNursingRoomExecutionRecord : insertList) {
            //使用默认的雪花算法生成
            insNursingRoomExecutionRecord.setId(null);
            //insNursingRoomExecutionRecord.setCreatedDt(currentDte);
            //insNursingRoomExecutionRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingRoomExecutionRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingRoomExecutionRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


