package cn.pluss.platform.service.smartAlarmRecord.impl;

import cn.pluss.platform.mapper.SmartAlarmRecordMapper;
import cn.pluss.platform.model.entity.SmartAlarmRecord;
import cn.pluss.platform.service.smartAlarmRecord.SmartAlarmRecordService;
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
@Service("smartAlarmRecordService")
public class SmartAlarmRecordServiceImpl extends ServiceImpl< SmartAlarmRecordMapper, SmartAlarmRecord> implements SmartAlarmRecordService {
    private static final Logger logger = LoggerFactory.getLogger(SmartAlarmRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartAlarmRecord> queryPage(Map map) {
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
    public SmartAlarmRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartAlarmRecord 实例对象
    * @return 实例对象
    */
    @Override
    public SmartAlarmRecord queryOne(SmartAlarmRecord smartAlarmRecord){
        LambdaQueryWrapper<SmartAlarmRecord> queryWrapper = getQueryWrapper(smartAlarmRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartAlarmRecord
    * @return
    */
    @Override
    public List<SmartAlarmRecord> queryList(SmartAlarmRecord smartAlarmRecord) {
        LambdaQueryWrapper<SmartAlarmRecord> queryWrapper = getQueryWrapper(smartAlarmRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartAlarmRecord
    * @return
    */
    public static LambdaQueryWrapper<SmartAlarmRecord> getQueryWrapper(SmartAlarmRecord smartAlarmRecord){
        LambdaQueryWrapper<SmartAlarmRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (smartAlarmRecord.getId() != null) {
            queryWrapper.eq(SmartAlarmRecord::getId, smartAlarmRecord.getId());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getTenantId())) {
            queryWrapper.eq(SmartAlarmRecord::getTenantId, smartAlarmRecord.getTenantId());
        }
        if (smartAlarmRecord.getCorpId() != null) {
            queryWrapper.eq(SmartAlarmRecord::getCorpId, smartAlarmRecord.getCorpId());
        }
        if (smartAlarmRecord.getInstitutionId() != null) {
            queryWrapper.eq(SmartAlarmRecord::getInstitutionId, smartAlarmRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getInstitutionName())) {
            queryWrapper.eq(SmartAlarmRecord::getInstitutionName, smartAlarmRecord.getInstitutionName());
        }
        if (smartAlarmRecord.getGrantId() != null) {
            queryWrapper.eq(SmartAlarmRecord::getGrantId, smartAlarmRecord.getGrantId());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getBigDeviceType())) {
            queryWrapper.eq(SmartAlarmRecord::getBigDeviceType, smartAlarmRecord.getBigDeviceType());
        }
        if (smartAlarmRecord.getTypeId() != null) {
            queryWrapper.eq(SmartAlarmRecord::getTypeId, smartAlarmRecord.getTypeId());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getDeviceName())) {
            queryWrapper.eq(SmartAlarmRecord::getDeviceName, smartAlarmRecord.getDeviceName());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getDeviceSerial())) {
            queryWrapper.eq(SmartAlarmRecord::getDeviceSerial, smartAlarmRecord.getDeviceSerial());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getSceneType())) {
            queryWrapper.eq(SmartAlarmRecord::getSceneType, smartAlarmRecord.getSceneType());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getElderId())) {
            queryWrapper.eq(SmartAlarmRecord::getElderId, smartAlarmRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getElderName())) {
            queryWrapper.eq(SmartAlarmRecord::getElderName, smartAlarmRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getLinkTel())) {
            queryWrapper.eq(SmartAlarmRecord::getLinkTel, smartAlarmRecord.getLinkTel());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getIdCard())) {
            queryWrapper.eq(SmartAlarmRecord::getIdCard, smartAlarmRecord.getIdCard());
        }
        if (smartAlarmRecord.getLon() != null) {
            queryWrapper.eq(SmartAlarmRecord::getLon, smartAlarmRecord.getLon());
        }
        if (smartAlarmRecord.getLat() != null) {
            queryWrapper.eq(SmartAlarmRecord::getLat, smartAlarmRecord.getLat());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getAddress())) {
            queryWrapper.eq(SmartAlarmRecord::getAddress, smartAlarmRecord.getAddress());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getAlarmCode())) {
            queryWrapper.eq(SmartAlarmRecord::getAlarmCode, smartAlarmRecord.getAlarmCode());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getAlarmLevel())) {
            queryWrapper.eq(SmartAlarmRecord::getAlarmLevel, smartAlarmRecord.getAlarmLevel());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getAlarmType())) {
            queryWrapper.eq(SmartAlarmRecord::getAlarmType, smartAlarmRecord.getAlarmType());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getSleepAlarmType())) {
            queryWrapper.eq(SmartAlarmRecord::getSleepAlarmType, smartAlarmRecord.getSleepAlarmType());
        }
        if (smartAlarmRecord.getAlarmTime() != null) {
            queryWrapper.eq(SmartAlarmRecord::getAlarmTime, smartAlarmRecord.getAlarmTime());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getAlarmContent())) {
            queryWrapper.eq(SmartAlarmRecord::getAlarmContent, smartAlarmRecord.getAlarmContent());
        }
        if (smartAlarmRecord.getReadState() != null) {
            queryWrapper.eq(SmartAlarmRecord::getReadState, smartAlarmRecord.getReadState());
        }
        if (smartAlarmRecord.getHandleType() != null) {
            queryWrapper.eq(SmartAlarmRecord::getHandleType, smartAlarmRecord.getHandleType());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getHandleState())) {
            queryWrapper.eq(SmartAlarmRecord::getHandleState, smartAlarmRecord.getHandleState());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getHandleResult())) {
            queryWrapper.eq(SmartAlarmRecord::getHandleResult, smartAlarmRecord.getHandleResult());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getHandleImg())) {
            queryWrapper.eq(SmartAlarmRecord::getHandleImg, smartAlarmRecord.getHandleImg());
        }
        if (smartAlarmRecord.getHandleId() != null) {
            queryWrapper.eq(SmartAlarmRecord::getHandleId, smartAlarmRecord.getHandleId());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getHandleUser())) {
            queryWrapper.eq(SmartAlarmRecord::getHandleUser, smartAlarmRecord.getHandleUser());
        }
        if (smartAlarmRecord.getHandleTime() != null) {
            queryWrapper.eq(SmartAlarmRecord::getHandleTime, smartAlarmRecord.getHandleTime());
        }
        if (smartAlarmRecord.getBelongInstitutionType() != null) {
            queryWrapper.eq(SmartAlarmRecord::getBelongInstitutionType, smartAlarmRecord.getBelongInstitutionType());
        }
        if (smartAlarmRecord.getAreaCode() != null) {
            queryWrapper.eq(SmartAlarmRecord::getAreaCode, smartAlarmRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getAreaName())) {
            queryWrapper.eq(SmartAlarmRecord::getAreaName, smartAlarmRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getRemark())) {
            queryWrapper.eq(SmartAlarmRecord::getRemark, smartAlarmRecord.getRemark());
        }
        if (smartAlarmRecord.getCreateUser() != null) {
            queryWrapper.eq(SmartAlarmRecord::getCreateUser, smartAlarmRecord.getCreateUser());
        }
        if (smartAlarmRecord.getCreateDept() != null) {
            queryWrapper.eq(SmartAlarmRecord::getCreateDept, smartAlarmRecord.getCreateDept());
        }
        if (smartAlarmRecord.getCreateTime() != null) {
            queryWrapper.eq(SmartAlarmRecord::getCreateTime, smartAlarmRecord.getCreateTime());
        }
        if (smartAlarmRecord.getUpdateUser() != null) {
            queryWrapper.eq(SmartAlarmRecord::getUpdateUser, smartAlarmRecord.getUpdateUser());
        }
        if (smartAlarmRecord.getUpdateTime() != null) {
            queryWrapper.eq(SmartAlarmRecord::getUpdateTime, smartAlarmRecord.getUpdateTime());
        }
        if (smartAlarmRecord.getIsDeleted() != null) {
            queryWrapper.eq(SmartAlarmRecord::getIsDeleted, smartAlarmRecord.getIsDeleted());
        }
        if (smartAlarmRecord.getStatus() != null) {
            queryWrapper.eq(SmartAlarmRecord::getStatus, smartAlarmRecord.getStatus());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getAudioUrl())) {
            queryWrapper.eq(SmartAlarmRecord::getAudioUrl, smartAlarmRecord.getAudioUrl());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getCallPhones())) {
            queryWrapper.eq(SmartAlarmRecord::getCallPhones, smartAlarmRecord.getCallPhones());
        }
        if (StringUtil.isNotEmpty(smartAlarmRecord.getCallTaskIds())) {
            queryWrapper.eq(SmartAlarmRecord::getCallTaskIds, smartAlarmRecord.getCallTaskIds());
        }
        if (smartAlarmRecord.getCallCount() != null) {
            queryWrapper.eq(SmartAlarmRecord::getCallCount, smartAlarmRecord.getCallCount());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartAlarmRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartAlarmRecord insert(SmartAlarmRecord smartAlarmRecord) {
        smartAlarmRecord.setId(null);
        getBaseMapper().insert(smartAlarmRecord);
        return smartAlarmRecord;
    }

    /**
    * 更新数据
    *
    * @param smartAlarmRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartAlarmRecord update(SmartAlarmRecord smartAlarmRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartAlarmRecord> chainWrapper = new LambdaUpdateChainWrapper<SmartAlarmRecord>(getBaseMapper());
        if (smartAlarmRecord.getId() != null) {
            chainWrapper.set(SmartAlarmRecord::getId, smartAlarmRecord.getId());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getTenantId())) {
            chainWrapper.set(SmartAlarmRecord::getTenantId, smartAlarmRecord.getTenantId());
        }
        if (smartAlarmRecord.getCorpId() != null) {
            chainWrapper.set(SmartAlarmRecord::getCorpId, smartAlarmRecord.getCorpId());
        }
        if (smartAlarmRecord.getInstitutionId() != null) {
            chainWrapper.set(SmartAlarmRecord::getInstitutionId, smartAlarmRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getInstitutionName())) {
            chainWrapper.set(SmartAlarmRecord::getInstitutionName, smartAlarmRecord.getInstitutionName());
        }
        if (smartAlarmRecord.getGrantId() != null) {
            chainWrapper.set(SmartAlarmRecord::getGrantId, smartAlarmRecord.getGrantId());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getBigDeviceType())) {
            chainWrapper.set(SmartAlarmRecord::getBigDeviceType, smartAlarmRecord.getBigDeviceType());
        }
        if (smartAlarmRecord.getTypeId() != null) {
            chainWrapper.set(SmartAlarmRecord::getTypeId, smartAlarmRecord.getTypeId());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getDeviceName())) {
            chainWrapper.set(SmartAlarmRecord::getDeviceName, smartAlarmRecord.getDeviceName());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getDeviceSerial())) {
            chainWrapper.set(SmartAlarmRecord::getDeviceSerial, smartAlarmRecord.getDeviceSerial());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getSceneType())) {
            chainWrapper.set(SmartAlarmRecord::getSceneType, smartAlarmRecord.getSceneType());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getElderId())) {
            chainWrapper.set(SmartAlarmRecord::getElderId, smartAlarmRecord.getElderId());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getElderName())) {
            chainWrapper.set(SmartAlarmRecord::getElderName, smartAlarmRecord.getElderName());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getLinkTel())) {
            chainWrapper.set(SmartAlarmRecord::getLinkTel, smartAlarmRecord.getLinkTel());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getIdCard())) {
            chainWrapper.set(SmartAlarmRecord::getIdCard, smartAlarmRecord.getIdCard());
        }
        if (smartAlarmRecord.getLon() != null) {
            chainWrapper.set(SmartAlarmRecord::getLon, smartAlarmRecord.getLon());
        }
        if (smartAlarmRecord.getLat() != null) {
            chainWrapper.set(SmartAlarmRecord::getLat, smartAlarmRecord.getLat());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getAddress())) {
            chainWrapper.set(SmartAlarmRecord::getAddress, smartAlarmRecord.getAddress());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getAlarmCode())) {
            chainWrapper.set(SmartAlarmRecord::getAlarmCode, smartAlarmRecord.getAlarmCode());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getAlarmLevel())) {
            chainWrapper.set(SmartAlarmRecord::getAlarmLevel, smartAlarmRecord.getAlarmLevel());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getAlarmType())) {
            chainWrapper.set(SmartAlarmRecord::getAlarmType, smartAlarmRecord.getAlarmType());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getSleepAlarmType())) {
            chainWrapper.set(SmartAlarmRecord::getSleepAlarmType, smartAlarmRecord.getSleepAlarmType());
        }
        if (smartAlarmRecord.getAlarmTime() != null) {
            chainWrapper.set(SmartAlarmRecord::getAlarmTime, smartAlarmRecord.getAlarmTime());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getAlarmContent())) {
            chainWrapper.set(SmartAlarmRecord::getAlarmContent, smartAlarmRecord.getAlarmContent());
        }
        if (smartAlarmRecord.getReadState() != null) {
            chainWrapper.set(SmartAlarmRecord::getReadState, smartAlarmRecord.getReadState());
        }
        if (smartAlarmRecord.getHandleType() != null) {
            chainWrapper.set(SmartAlarmRecord::getHandleType, smartAlarmRecord.getHandleType());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getHandleState())) {
            chainWrapper.set(SmartAlarmRecord::getHandleState, smartAlarmRecord.getHandleState());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getHandleResult())) {
            chainWrapper.set(SmartAlarmRecord::getHandleResult, smartAlarmRecord.getHandleResult());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getHandleImg())) {
            chainWrapper.set(SmartAlarmRecord::getHandleImg, smartAlarmRecord.getHandleImg());
        }
        if (smartAlarmRecord.getHandleId() != null) {
            chainWrapper.set(SmartAlarmRecord::getHandleId, smartAlarmRecord.getHandleId());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getHandleUser())) {
            chainWrapper.set(SmartAlarmRecord::getHandleUser, smartAlarmRecord.getHandleUser());
        }
        if (smartAlarmRecord.getHandleTime() != null) {
            chainWrapper.set(SmartAlarmRecord::getHandleTime, smartAlarmRecord.getHandleTime());
        }
        if (smartAlarmRecord.getBelongInstitutionType() != null) {
            chainWrapper.set(SmartAlarmRecord::getBelongInstitutionType, smartAlarmRecord.getBelongInstitutionType());
        }
        if (smartAlarmRecord.getAreaCode() != null) {
            chainWrapper.set(SmartAlarmRecord::getAreaCode, smartAlarmRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getAreaName())) {
            chainWrapper.set(SmartAlarmRecord::getAreaName, smartAlarmRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getRemark())) {
            chainWrapper.set(SmartAlarmRecord::getRemark, smartAlarmRecord.getRemark());
        }
        if (smartAlarmRecord.getCreateUser() != null) {
            chainWrapper.set(SmartAlarmRecord::getCreateUser, smartAlarmRecord.getCreateUser());
        }
        if (smartAlarmRecord.getCreateDept() != null) {
            chainWrapper.set(SmartAlarmRecord::getCreateDept, smartAlarmRecord.getCreateDept());
        }
        if (smartAlarmRecord.getCreateTime() != null) {
            chainWrapper.set(SmartAlarmRecord::getCreateTime, smartAlarmRecord.getCreateTime());
        }
        if (smartAlarmRecord.getUpdateUser() != null) {
            chainWrapper.set(SmartAlarmRecord::getUpdateUser, smartAlarmRecord.getUpdateUser());
        }
        if (smartAlarmRecord.getUpdateTime() != null) {
            chainWrapper.set(SmartAlarmRecord::getUpdateTime, smartAlarmRecord.getUpdateTime());
        }
        if (smartAlarmRecord.getIsDeleted() != null) {
            chainWrapper.set(SmartAlarmRecord::getIsDeleted, smartAlarmRecord.getIsDeleted());
        }
        if (smartAlarmRecord.getStatus() != null) {
            chainWrapper.set(SmartAlarmRecord::getStatus, smartAlarmRecord.getStatus());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getAudioUrl())) {
            chainWrapper.set(SmartAlarmRecord::getAudioUrl, smartAlarmRecord.getAudioUrl());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getCallPhones())) {
            chainWrapper.set(SmartAlarmRecord::getCallPhones, smartAlarmRecord.getCallPhones());
        }
        if (StringUtil.isNotBlank(smartAlarmRecord.getCallTaskIds())) {
            chainWrapper.set(SmartAlarmRecord::getCallTaskIds, smartAlarmRecord.getCallTaskIds());
        }
        if (smartAlarmRecord.getCallCount() != null) {
            chainWrapper.set(SmartAlarmRecord::getCallCount, smartAlarmRecord.getCallCount());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartAlarmRecord::getId, smartAlarmRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartAlarmRecord.getId());
        } else {
            return smartAlarmRecord;
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
    public boolean saveSmartAlarmRecordBatch(List<SmartAlarmRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartAlarmRecord smartAlarmRecord : insertList) {
            //使用默认的雪花算法生成
            smartAlarmRecord.setId(null);
            //smartAlarmRecord.setCreatedDt(currentDte);
            //smartAlarmRecord.setUpdatedDt(currentDte);
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
    public Integer deleteSmartAlarmRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartAlarmRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


