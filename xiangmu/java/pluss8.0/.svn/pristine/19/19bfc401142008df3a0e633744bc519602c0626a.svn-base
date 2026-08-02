package cn.pluss.platform.service.iotDeviceDataLog.impl;

import cn.pluss.platform.mapper.IotDeviceDataLogMapper;
import cn.pluss.platform.model.entity.IotDeviceDataLog;
import cn.pluss.platform.service.iotDeviceDataLog.IotDeviceDataLogService;
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
@Service("iotDeviceDataLogService")
public class IotDeviceDataLogServiceImpl extends ServiceImpl< IotDeviceDataLogMapper, IotDeviceDataLog> implements IotDeviceDataLogService {
    private static final Logger logger = LoggerFactory.getLogger(IotDeviceDataLogServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<IotDeviceDataLog> queryPage(Map map) {
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
    public IotDeviceDataLog queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param iotDeviceDataLog 实例对象
    * @return 实例对象
    */
    @Override
    public IotDeviceDataLog queryOne(IotDeviceDataLog iotDeviceDataLog){
        LambdaQueryWrapper<IotDeviceDataLog> queryWrapper = getQueryWrapper(iotDeviceDataLog);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param iotDeviceDataLog
    * @return
    */
    @Override
    public List<IotDeviceDataLog> queryList(IotDeviceDataLog iotDeviceDataLog) {
        LambdaQueryWrapper<IotDeviceDataLog> queryWrapper = getQueryWrapper(iotDeviceDataLog);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param iotDeviceDataLog
    * @return
    */
    public static LambdaQueryWrapper<IotDeviceDataLog> getQueryWrapper(IotDeviceDataLog iotDeviceDataLog){
        LambdaQueryWrapper<IotDeviceDataLog> queryWrapper = new LambdaQueryWrapper<>();
        if (iotDeviceDataLog.getId() != null) {
            queryWrapper.eq(IotDeviceDataLog::getId, iotDeviceDataLog.getId());
        }
        if (StringUtil.isNotEmpty(iotDeviceDataLog.getTenantId())) {
            queryWrapper.eq(IotDeviceDataLog::getTenantId, iotDeviceDataLog.getTenantId());
        }
        if (StringUtil.isNotEmpty(iotDeviceDataLog.getTenantName())) {
            queryWrapper.eq(IotDeviceDataLog::getTenantName, iotDeviceDataLog.getTenantName());
        }
        if (StringUtil.isNotEmpty(iotDeviceDataLog.getBigDeviceType())) {
            queryWrapper.eq(IotDeviceDataLog::getBigDeviceType, iotDeviceDataLog.getBigDeviceType());
        }
        if (iotDeviceDataLog.getTypeId() != null) {
            queryWrapper.eq(IotDeviceDataLog::getTypeId, iotDeviceDataLog.getTypeId());
        }
        if (StringUtil.isNotEmpty(iotDeviceDataLog.getDeviceName())) {
            queryWrapper.eq(IotDeviceDataLog::getDeviceName, iotDeviceDataLog.getDeviceName());
        }
        if (StringUtil.isNotEmpty(iotDeviceDataLog.getDeviceSerial())) {
            queryWrapper.eq(IotDeviceDataLog::getDeviceSerial, iotDeviceDataLog.getDeviceSerial());
        }
        if (StringUtil.isNotEmpty(iotDeviceDataLog.getDeviceDataContent())) {
            queryWrapper.eq(IotDeviceDataLog::getDeviceDataContent, iotDeviceDataLog.getDeviceDataContent());
        }
        if (StringUtil.isNotEmpty(iotDeviceDataLog.getRemark())) {
            queryWrapper.eq(IotDeviceDataLog::getRemark, iotDeviceDataLog.getRemark());
        }
        if (iotDeviceDataLog.getCreateUser() != null) {
            queryWrapper.eq(IotDeviceDataLog::getCreateUser, iotDeviceDataLog.getCreateUser());
        }
        if (iotDeviceDataLog.getCreateDept() != null) {
            queryWrapper.eq(IotDeviceDataLog::getCreateDept, iotDeviceDataLog.getCreateDept());
        }
        if (iotDeviceDataLog.getCreateTime() != null) {
            queryWrapper.eq(IotDeviceDataLog::getCreateTime, iotDeviceDataLog.getCreateTime());
        }
        if (iotDeviceDataLog.getUpdateUser() != null) {
            queryWrapper.eq(IotDeviceDataLog::getUpdateUser, iotDeviceDataLog.getUpdateUser());
        }
        if (iotDeviceDataLog.getUpdateTime() != null) {
            queryWrapper.eq(IotDeviceDataLog::getUpdateTime, iotDeviceDataLog.getUpdateTime());
        }
        if (iotDeviceDataLog.getIsDeleted() != null) {
            queryWrapper.eq(IotDeviceDataLog::getIsDeleted, iotDeviceDataLog.getIsDeleted());
        }
        if (iotDeviceDataLog.getStatus() != null) {
            queryWrapper.eq(IotDeviceDataLog::getStatus, iotDeviceDataLog.getStatus());
        }
        if (iotDeviceDataLog.getCorpId() != null) {
            queryWrapper.eq(IotDeviceDataLog::getCorpId, iotDeviceDataLog.getCorpId());
        }
        if (iotDeviceDataLog.getInstitutionId() != null) {
            queryWrapper.eq(IotDeviceDataLog::getInstitutionId, iotDeviceDataLog.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(iotDeviceDataLog.getInstitutionName())) {
            queryWrapper.eq(IotDeviceDataLog::getInstitutionName, iotDeviceDataLog.getInstitutionName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param iotDeviceDataLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IotDeviceDataLog insert(IotDeviceDataLog iotDeviceDataLog) {
        iotDeviceDataLog.setId(null);
        getBaseMapper().insert(iotDeviceDataLog);
        return iotDeviceDataLog;
    }

    /**
    * 更新数据
    *
    * @param iotDeviceDataLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IotDeviceDataLog update(IotDeviceDataLog iotDeviceDataLog) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<IotDeviceDataLog> chainWrapper = new LambdaUpdateChainWrapper<IotDeviceDataLog>(getBaseMapper());
        if (iotDeviceDataLog.getId() != null) {
            chainWrapper.set(IotDeviceDataLog::getId, iotDeviceDataLog.getId());
        }
        if (StringUtil.isNotBlank(iotDeviceDataLog.getTenantId())) {
            chainWrapper.set(IotDeviceDataLog::getTenantId, iotDeviceDataLog.getTenantId());
        }
        if (StringUtil.isNotBlank(iotDeviceDataLog.getTenantName())) {
            chainWrapper.set(IotDeviceDataLog::getTenantName, iotDeviceDataLog.getTenantName());
        }
        if (StringUtil.isNotBlank(iotDeviceDataLog.getBigDeviceType())) {
            chainWrapper.set(IotDeviceDataLog::getBigDeviceType, iotDeviceDataLog.getBigDeviceType());
        }
        if (iotDeviceDataLog.getTypeId() != null) {
            chainWrapper.set(IotDeviceDataLog::getTypeId, iotDeviceDataLog.getTypeId());
        }
        if (StringUtil.isNotBlank(iotDeviceDataLog.getDeviceName())) {
            chainWrapper.set(IotDeviceDataLog::getDeviceName, iotDeviceDataLog.getDeviceName());
        }
        if (StringUtil.isNotBlank(iotDeviceDataLog.getDeviceSerial())) {
            chainWrapper.set(IotDeviceDataLog::getDeviceSerial, iotDeviceDataLog.getDeviceSerial());
        }
        if (StringUtil.isNotBlank(iotDeviceDataLog.getDeviceDataContent())) {
            chainWrapper.set(IotDeviceDataLog::getDeviceDataContent, iotDeviceDataLog.getDeviceDataContent());
        }
        if (StringUtil.isNotBlank(iotDeviceDataLog.getRemark())) {
            chainWrapper.set(IotDeviceDataLog::getRemark, iotDeviceDataLog.getRemark());
        }
        if (iotDeviceDataLog.getCreateUser() != null) {
            chainWrapper.set(IotDeviceDataLog::getCreateUser, iotDeviceDataLog.getCreateUser());
        }
        if (iotDeviceDataLog.getCreateDept() != null) {
            chainWrapper.set(IotDeviceDataLog::getCreateDept, iotDeviceDataLog.getCreateDept());
        }
        if (iotDeviceDataLog.getCreateTime() != null) {
            chainWrapper.set(IotDeviceDataLog::getCreateTime, iotDeviceDataLog.getCreateTime());
        }
        if (iotDeviceDataLog.getUpdateUser() != null) {
            chainWrapper.set(IotDeviceDataLog::getUpdateUser, iotDeviceDataLog.getUpdateUser());
        }
        if (iotDeviceDataLog.getUpdateTime() != null) {
            chainWrapper.set(IotDeviceDataLog::getUpdateTime, iotDeviceDataLog.getUpdateTime());
        }
        if (iotDeviceDataLog.getIsDeleted() != null) {
            chainWrapper.set(IotDeviceDataLog::getIsDeleted, iotDeviceDataLog.getIsDeleted());
        }
        if (iotDeviceDataLog.getStatus() != null) {
            chainWrapper.set(IotDeviceDataLog::getStatus, iotDeviceDataLog.getStatus());
        }
        if (iotDeviceDataLog.getCorpId() != null) {
            chainWrapper.set(IotDeviceDataLog::getCorpId, iotDeviceDataLog.getCorpId());
        }
        if (iotDeviceDataLog.getInstitutionId() != null) {
            chainWrapper.set(IotDeviceDataLog::getInstitutionId, iotDeviceDataLog.getInstitutionId());
        }
        if (StringUtil.isNotBlank(iotDeviceDataLog.getInstitutionName())) {
            chainWrapper.set(IotDeviceDataLog::getInstitutionName, iotDeviceDataLog.getInstitutionName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(IotDeviceDataLog::getId, iotDeviceDataLog.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(iotDeviceDataLog.getId());
        } else {
            return iotDeviceDataLog;
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
    public boolean saveIotDeviceDataLogBatch(List<IotDeviceDataLog> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (IotDeviceDataLog iotDeviceDataLog : insertList) {
            //使用默认的雪花算法生成
            iotDeviceDataLog.setId(null);
            //iotDeviceDataLog.setCreatedDt(currentDte);
            //iotDeviceDataLog.setUpdatedDt(currentDte);
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
    public Integer deleteIotDeviceDataLogBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<IotDeviceDataLog> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


