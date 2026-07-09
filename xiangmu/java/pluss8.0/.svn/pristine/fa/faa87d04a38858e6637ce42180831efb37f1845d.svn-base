package cn.pluss.platform.service.communityConsultationRecord.impl;

import cn.pluss.platform.mapper.CommunityConsultationRecordMapper;
import cn.pluss.platform.model.entity.CommunityConsultationRecord;
import cn.pluss.platform.service.communityConsultationRecord.CommunityConsultationRecordService;
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
@Service("communityConsultationRecordService")
public class CommunityConsultationRecordServiceImpl extends ServiceImpl< CommunityConsultationRecordMapper, CommunityConsultationRecord> implements CommunityConsultationRecordService {
    private static final Logger logger = LoggerFactory.getLogger(CommunityConsultationRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CommunityConsultationRecord> queryPage(Map map) {
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
    public CommunityConsultationRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param communityConsultationRecord 实例对象
    * @return 实例对象
    */
    @Override
    public CommunityConsultationRecord queryOne(CommunityConsultationRecord communityConsultationRecord){
        LambdaQueryWrapper<CommunityConsultationRecord> queryWrapper = getQueryWrapper(communityConsultationRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param communityConsultationRecord
    * @return
    */
    @Override
    public List<CommunityConsultationRecord> queryList(CommunityConsultationRecord communityConsultationRecord) {
        LambdaQueryWrapper<CommunityConsultationRecord> queryWrapper = getQueryWrapper(communityConsultationRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param communityConsultationRecord
    * @return
    */
    public static LambdaQueryWrapper<CommunityConsultationRecord> getQueryWrapper(CommunityConsultationRecord communityConsultationRecord){
        LambdaQueryWrapper<CommunityConsultationRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (communityConsultationRecord.getId() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getId, communityConsultationRecord.getId());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getTenantId())) {
            queryWrapper.eq(CommunityConsultationRecord::getTenantId, communityConsultationRecord.getTenantId());
        }
        if (communityConsultationRecord.getCorpId() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getCorpId, communityConsultationRecord.getCorpId());
        }
        if (communityConsultationRecord.getInstitutionId() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getInstitutionId, communityConsultationRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getInstitutionName())) {
            queryWrapper.eq(CommunityConsultationRecord::getInstitutionName, communityConsultationRecord.getInstitutionName());
        }
        if (communityConsultationRecord.getElderId() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getElderId, communityConsultationRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getElderName())) {
            queryWrapper.eq(CommunityConsultationRecord::getElderName, communityConsultationRecord.getElderName());
        }
        if (communityConsultationRecord.getRoomId() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getRoomId, communityConsultationRecord.getRoomId());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getRoomName())) {
            queryWrapper.eq(CommunityConsultationRecord::getRoomName, communityConsultationRecord.getRoomName());
        }
        if (communityConsultationRecord.getDoctorId() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getDoctorId, communityConsultationRecord.getDoctorId());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getDoctorName())) {
            queryWrapper.eq(CommunityConsultationRecord::getDoctorName, communityConsultationRecord.getDoctorName());
        }
        if (communityConsultationRecord.getConsultationTime() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getConsultationTime, communityConsultationRecord.getConsultationTime());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getMedicalHistory())) {
            queryWrapper.eq(CommunityConsultationRecord::getMedicalHistory, communityConsultationRecord.getMedicalHistory());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getMainContent())) {
            queryWrapper.eq(CommunityConsultationRecord::getMainContent, communityConsultationRecord.getMainContent());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getCheckResult())) {
            queryWrapper.eq(CommunityConsultationRecord::getCheckResult, communityConsultationRecord.getCheckResult());
        }
        if (communityConsultationRecord.getAreaCode() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getAreaCode, communityConsultationRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getAreaName())) {
            queryWrapper.eq(CommunityConsultationRecord::getAreaName, communityConsultationRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getCreateUserName())) {
            queryWrapper.eq(CommunityConsultationRecord::getCreateUserName, communityConsultationRecord.getCreateUserName());
        }
        if (StringUtil.isNotEmpty(communityConsultationRecord.getRemark())) {
            queryWrapper.eq(CommunityConsultationRecord::getRemark, communityConsultationRecord.getRemark());
        }
        if (communityConsultationRecord.getCreateUser() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getCreateUser, communityConsultationRecord.getCreateUser());
        }
        if (communityConsultationRecord.getCreateDept() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getCreateDept, communityConsultationRecord.getCreateDept());
        }
        if (communityConsultationRecord.getCreateTime() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getCreateTime, communityConsultationRecord.getCreateTime());
        }
        if (communityConsultationRecord.getUpdateUser() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getUpdateUser, communityConsultationRecord.getUpdateUser());
        }
        if (communityConsultationRecord.getUpdateTime() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getUpdateTime, communityConsultationRecord.getUpdateTime());
        }
        if (communityConsultationRecord.getStatus() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getStatus, communityConsultationRecord.getStatus());
        }
        if (communityConsultationRecord.getIsDeleted() != null) {
            queryWrapper.eq(CommunityConsultationRecord::getIsDeleted, communityConsultationRecord.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param communityConsultationRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityConsultationRecord insert(CommunityConsultationRecord communityConsultationRecord) {
        communityConsultationRecord.setId(null);
        getBaseMapper().insert(communityConsultationRecord);
        return communityConsultationRecord;
    }

    /**
    * 更新数据
    *
    * @param communityConsultationRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityConsultationRecord update(CommunityConsultationRecord communityConsultationRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CommunityConsultationRecord> chainWrapper = new LambdaUpdateChainWrapper<CommunityConsultationRecord>(getBaseMapper());
        if (communityConsultationRecord.getId() != null) {
            chainWrapper.set(CommunityConsultationRecord::getId, communityConsultationRecord.getId());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getTenantId())) {
            chainWrapper.set(CommunityConsultationRecord::getTenantId, communityConsultationRecord.getTenantId());
        }
        if (communityConsultationRecord.getCorpId() != null) {
            chainWrapper.set(CommunityConsultationRecord::getCorpId, communityConsultationRecord.getCorpId());
        }
        if (communityConsultationRecord.getInstitutionId() != null) {
            chainWrapper.set(CommunityConsultationRecord::getInstitutionId, communityConsultationRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getInstitutionName())) {
            chainWrapper.set(CommunityConsultationRecord::getInstitutionName, communityConsultationRecord.getInstitutionName());
        }
        if (communityConsultationRecord.getElderId() != null) {
            chainWrapper.set(CommunityConsultationRecord::getElderId, communityConsultationRecord.getElderId());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getElderName())) {
            chainWrapper.set(CommunityConsultationRecord::getElderName, communityConsultationRecord.getElderName());
        }
        if (communityConsultationRecord.getRoomId() != null) {
            chainWrapper.set(CommunityConsultationRecord::getRoomId, communityConsultationRecord.getRoomId());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getRoomName())) {
            chainWrapper.set(CommunityConsultationRecord::getRoomName, communityConsultationRecord.getRoomName());
        }
        if (communityConsultationRecord.getDoctorId() != null) {
            chainWrapper.set(CommunityConsultationRecord::getDoctorId, communityConsultationRecord.getDoctorId());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getDoctorName())) {
            chainWrapper.set(CommunityConsultationRecord::getDoctorName, communityConsultationRecord.getDoctorName());
        }
        if (communityConsultationRecord.getConsultationTime() != null) {
            chainWrapper.set(CommunityConsultationRecord::getConsultationTime, communityConsultationRecord.getConsultationTime());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getMedicalHistory())) {
            chainWrapper.set(CommunityConsultationRecord::getMedicalHistory, communityConsultationRecord.getMedicalHistory());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getMainContent())) {
            chainWrapper.set(CommunityConsultationRecord::getMainContent, communityConsultationRecord.getMainContent());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getCheckResult())) {
            chainWrapper.set(CommunityConsultationRecord::getCheckResult, communityConsultationRecord.getCheckResult());
        }
        if (communityConsultationRecord.getAreaCode() != null) {
            chainWrapper.set(CommunityConsultationRecord::getAreaCode, communityConsultationRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getAreaName())) {
            chainWrapper.set(CommunityConsultationRecord::getAreaName, communityConsultationRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getCreateUserName())) {
            chainWrapper.set(CommunityConsultationRecord::getCreateUserName, communityConsultationRecord.getCreateUserName());
        }
        if (StringUtil.isNotBlank(communityConsultationRecord.getRemark())) {
            chainWrapper.set(CommunityConsultationRecord::getRemark, communityConsultationRecord.getRemark());
        }
        if (communityConsultationRecord.getCreateUser() != null) {
            chainWrapper.set(CommunityConsultationRecord::getCreateUser, communityConsultationRecord.getCreateUser());
        }
        if (communityConsultationRecord.getCreateDept() != null) {
            chainWrapper.set(CommunityConsultationRecord::getCreateDept, communityConsultationRecord.getCreateDept());
        }
        if (communityConsultationRecord.getCreateTime() != null) {
            chainWrapper.set(CommunityConsultationRecord::getCreateTime, communityConsultationRecord.getCreateTime());
        }
        if (communityConsultationRecord.getUpdateUser() != null) {
            chainWrapper.set(CommunityConsultationRecord::getUpdateUser, communityConsultationRecord.getUpdateUser());
        }
        if (communityConsultationRecord.getUpdateTime() != null) {
            chainWrapper.set(CommunityConsultationRecord::getUpdateTime, communityConsultationRecord.getUpdateTime());
        }
        if (communityConsultationRecord.getStatus() != null) {
            chainWrapper.set(CommunityConsultationRecord::getStatus, communityConsultationRecord.getStatus());
        }
        if (communityConsultationRecord.getIsDeleted() != null) {
            chainWrapper.set(CommunityConsultationRecord::getIsDeleted, communityConsultationRecord.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CommunityConsultationRecord::getId, communityConsultationRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(communityConsultationRecord.getId());
        } else {
            return communityConsultationRecord;
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
    public boolean saveCommunityConsultationRecordBatch(List<CommunityConsultationRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CommunityConsultationRecord communityConsultationRecord : insertList) {
            //使用默认的雪花算法生成
            communityConsultationRecord.setId(null);
            //communityConsultationRecord.setCreatedDt(currentDte);
            //communityConsultationRecord.setUpdatedDt(currentDte);
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
    public Integer deleteCommunityConsultationRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CommunityConsultationRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


