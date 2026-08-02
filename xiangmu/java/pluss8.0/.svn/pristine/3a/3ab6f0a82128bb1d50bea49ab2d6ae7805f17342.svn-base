package cn.pluss.platform.service.iotDeviceAlarmLog.impl;

import cn.pluss.platform.mapper.IotDeviceAlarmLogMapper;
import cn.pluss.platform.model.entity.IotDeviceAlarmLog;
import cn.pluss.platform.service.iotDeviceAlarmLog.IotDeviceAlarmLogService;
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
@Service("iotDeviceAlarmLogService")
public class IotDeviceAlarmLogServiceImpl extends ServiceImpl< IotDeviceAlarmLogMapper, IotDeviceAlarmLog> implements IotDeviceAlarmLogService {
    private static final Logger logger = LoggerFactory.getLogger(IotDeviceAlarmLogServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<IotDeviceAlarmLog> queryPage(Map map) {
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
    public IotDeviceAlarmLog queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param iotDeviceAlarmLog 实例对象
    * @return 实例对象
    */
    @Override
    public IotDeviceAlarmLog queryOne(IotDeviceAlarmLog iotDeviceAlarmLog){
        LambdaQueryWrapper<IotDeviceAlarmLog> queryWrapper = getQueryWrapper(iotDeviceAlarmLog);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param iotDeviceAlarmLog
    * @return
    */
    @Override
    public List<IotDeviceAlarmLog> queryList(IotDeviceAlarmLog iotDeviceAlarmLog) {
        LambdaQueryWrapper<IotDeviceAlarmLog> queryWrapper = getQueryWrapper(iotDeviceAlarmLog);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param iotDeviceAlarmLog
    * @return
    */
    public static LambdaQueryWrapper<IotDeviceAlarmLog> getQueryWrapper(IotDeviceAlarmLog iotDeviceAlarmLog){
        LambdaQueryWrapper<IotDeviceAlarmLog> queryWrapper = new LambdaQueryWrapper<>();
        if (iotDeviceAlarmLog.getId() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getId, iotDeviceAlarmLog.getId());
        }
        if (StringUtil.isNotEmpty(iotDeviceAlarmLog.getTenantId())) {
            queryWrapper.eq(IotDeviceAlarmLog::getTenantId, iotDeviceAlarmLog.getTenantId());
        }
        if (StringUtil.isNotEmpty(iotDeviceAlarmLog.getTenantName())) {
            queryWrapper.eq(IotDeviceAlarmLog::getTenantName, iotDeviceAlarmLog.getTenantName());
        }
        if (StringUtil.isNotEmpty(iotDeviceAlarmLog.getBigDeviceType())) {
            queryWrapper.eq(IotDeviceAlarmLog::getBigDeviceType, iotDeviceAlarmLog.getBigDeviceType());
        }
        if (iotDeviceAlarmLog.getTypeId() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getTypeId, iotDeviceAlarmLog.getTypeId());
        }
        if (StringUtil.isNotEmpty(iotDeviceAlarmLog.getDeviceName())) {
            queryWrapper.eq(IotDeviceAlarmLog::getDeviceName, iotDeviceAlarmLog.getDeviceName());
        }
        if (StringUtil.isNotEmpty(iotDeviceAlarmLog.getDeviceSerial())) {
            queryWrapper.eq(IotDeviceAlarmLog::getDeviceSerial, iotDeviceAlarmLog.getDeviceSerial());
        }
        if (iotDeviceAlarmLog.getAlarmType() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getAlarmType, iotDeviceAlarmLog.getAlarmType());
        }
        if (iotDeviceAlarmLog.getSleepAlarmType() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getSleepAlarmType, iotDeviceAlarmLog.getSleepAlarmType());
        }
        if (StringUtil.isNotEmpty(iotDeviceAlarmLog.getAlarmText())) {
            queryWrapper.eq(IotDeviceAlarmLog::getAlarmText, iotDeviceAlarmLog.getAlarmText());
        }
        if (iotDeviceAlarmLog.getAlarmTime() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getAlarmTime, iotDeviceAlarmLog.getAlarmTime());
        }
        if (iotDeviceAlarmLog.getSyncState() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getSyncState, iotDeviceAlarmLog.getSyncState());
        }
        if (StringUtil.isNotEmpty(iotDeviceAlarmLog.getRemark())) {
            queryWrapper.eq(IotDeviceAlarmLog::getRemark, iotDeviceAlarmLog.getRemark());
        }
        if (iotDeviceAlarmLog.getCreateUser() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getCreateUser, iotDeviceAlarmLog.getCreateUser());
        }
        if (iotDeviceAlarmLog.getCreateDept() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getCreateDept, iotDeviceAlarmLog.getCreateDept());
        }
        if (iotDeviceAlarmLog.getCreateTime() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getCreateTime, iotDeviceAlarmLog.getCreateTime());
        }
        if (iotDeviceAlarmLog.getUpdateUser() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getUpdateUser, iotDeviceAlarmLog.getUpdateUser());
        }
        if (iotDeviceAlarmLog.getUpdateTime() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getUpdateTime, iotDeviceAlarmLog.getUpdateTime());
        }
        if (iotDeviceAlarmLog.getIsDeleted() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getIsDeleted, iotDeviceAlarmLog.getIsDeleted());
        }
        if (iotDeviceAlarmLog.getStatus() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getStatus, iotDeviceAlarmLog.getStatus());
        }
        if (iotDeviceAlarmLog.getCorpId() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getCorpId, iotDeviceAlarmLog.getCorpId());
        }
        if (iotDeviceAlarmLog.getInstitutionId() != null) {
            queryWrapper.eq(IotDeviceAlarmLog::getInstitutionId, iotDeviceAlarmLog.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(iotDeviceAlarmLog.getInstitutionName())) {
            queryWrapper.eq(IotDeviceAlarmLog::getInstitutionName, iotDeviceAlarmLog.getInstitutionName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param iotDeviceAlarmLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IotDeviceAlarmLog insert(IotDeviceAlarmLog iotDeviceAlarmLog) {
        iotDeviceAlarmLog.setId(null);
        getBaseMapper().insert(iotDeviceAlarmLog);
        return iotDeviceAlarmLog;
    }

    /**
    * 更新数据
    *
    * @param iotDeviceAlarmLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IotDeviceAlarmLog update(IotDeviceAlarmLog iotDeviceAlarmLog) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<IotDeviceAlarmLog> chainWrapper = new LambdaUpdateChainWrapper<IotDeviceAlarmLog>(getBaseMapper());
        if (iotDeviceAlarmLog.getId() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getId, iotDeviceAlarmLog.getId());
        }
        if (StringUtil.isNotBlank(iotDeviceAlarmLog.getTenantId())) {
            chainWrapper.set(IotDeviceAlarmLog::getTenantId, iotDeviceAlarmLog.getTenantId());
        }
        if (StringUtil.isNotBlank(iotDeviceAlarmLog.getTenantName())) {
            chainWrapper.set(IotDeviceAlarmLog::getTenantName, iotDeviceAlarmLog.getTenantName());
        }
        if (StringUtil.isNotBlank(iotDeviceAlarmLog.getBigDeviceType())) {
            chainWrapper.set(IotDeviceAlarmLog::getBigDeviceType, iotDeviceAlarmLog.getBigDeviceType());
        }
        if (iotDeviceAlarmLog.getTypeId() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getTypeId, iotDeviceAlarmLog.getTypeId());
        }
        if (StringUtil.isNotBlank(iotDeviceAlarmLog.getDeviceName())) {
            chainWrapper.set(IotDeviceAlarmLog::getDeviceName, iotDeviceAlarmLog.getDeviceName());
        }
        if (StringUtil.isNotBlank(iotDeviceAlarmLog.getDeviceSerial())) {
            chainWrapper.set(IotDeviceAlarmLog::getDeviceSerial, iotDeviceAlarmLog.getDeviceSerial());
        }
        if (iotDeviceAlarmLog.getAlarmType() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getAlarmType, iotDeviceAlarmLog.getAlarmType());
        }
        if (iotDeviceAlarmLog.getSleepAlarmType() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getSleepAlarmType, iotDeviceAlarmLog.getSleepAlarmType());
        }
        if (StringUtil.isNotBlank(iotDeviceAlarmLog.getAlarmText())) {
            chainWrapper.set(IotDeviceAlarmLog::getAlarmText, iotDeviceAlarmLog.getAlarmText());
        }
        if (iotDeviceAlarmLog.getAlarmTime() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getAlarmTime, iotDeviceAlarmLog.getAlarmTime());
        }
        if (iotDeviceAlarmLog.getSyncState() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getSyncState, iotDeviceAlarmLog.getSyncState());
        }
        if (StringUtil.isNotBlank(iotDeviceAlarmLog.getRemark())) {
            chainWrapper.set(IotDeviceAlarmLog::getRemark, iotDeviceAlarmLog.getRemark());
        }
        if (iotDeviceAlarmLog.getCreateUser() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getCreateUser, iotDeviceAlarmLog.getCreateUser());
        }
        if (iotDeviceAlarmLog.getCreateDept() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getCreateDept, iotDeviceAlarmLog.getCreateDept());
        }
        if (iotDeviceAlarmLog.getCreateTime() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getCreateTime, iotDeviceAlarmLog.getCreateTime());
        }
        if (iotDeviceAlarmLog.getUpdateUser() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getUpdateUser, iotDeviceAlarmLog.getUpdateUser());
        }
        if (iotDeviceAlarmLog.getUpdateTime() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getUpdateTime, iotDeviceAlarmLog.getUpdateTime());
        }
        if (iotDeviceAlarmLog.getIsDeleted() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getIsDeleted, iotDeviceAlarmLog.getIsDeleted());
        }
        if (iotDeviceAlarmLog.getStatus() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getStatus, iotDeviceAlarmLog.getStatus());
        }
        if (iotDeviceAlarmLog.getCorpId() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getCorpId, iotDeviceAlarmLog.getCorpId());
        }
        if (iotDeviceAlarmLog.getInstitutionId() != null) {
            chainWrapper.set(IotDeviceAlarmLog::getInstitutionId, iotDeviceAlarmLog.getInstitutionId());
        }
        if (StringUtil.isNotBlank(iotDeviceAlarmLog.getInstitutionName())) {
            chainWrapper.set(IotDeviceAlarmLog::getInstitutionName, iotDeviceAlarmLog.getInstitutionName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(IotDeviceAlarmLog::getId, iotDeviceAlarmLog.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(iotDeviceAlarmLog.getId());
        } else {
            return iotDeviceAlarmLog;
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
    public boolean saveIotDeviceAlarmLogBatch(List<IotDeviceAlarmLog> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (IotDeviceAlarmLog iotDeviceAlarmLog : insertList) {
            //使用默认的雪花算法生成
            iotDeviceAlarmLog.setId(null);
            //iotDeviceAlarmLog.setCreatedDt(currentDte);
            //iotDeviceAlarmLog.setUpdatedDt(currentDte);
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
    public Integer deleteIotDeviceAlarmLogBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<IotDeviceAlarmLog> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


