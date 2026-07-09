package cn.pluss.platform.service.smartDeviceParamBed.impl;

import cn.pluss.platform.mapper.SmartDeviceParamBedMapper;
import cn.pluss.platform.model.entity.SmartDeviceParamBed;
import cn.pluss.platform.service.smartDeviceParamBed.SmartDeviceParamBedService;
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
@Service("smartDeviceParamBedService")
public class SmartDeviceParamBedServiceImpl extends ServiceImpl< SmartDeviceParamBedMapper, SmartDeviceParamBed> implements SmartDeviceParamBedService {
    private static final Logger logger = LoggerFactory.getLogger(SmartDeviceParamBedServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartDeviceParamBed> queryPage(Map map) {
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
    public SmartDeviceParamBed queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceParamBed 实例对象
    * @return 实例对象
    */
    @Override
    public SmartDeviceParamBed queryOne(SmartDeviceParamBed smartDeviceParamBed){
        LambdaQueryWrapper<SmartDeviceParamBed> queryWrapper = getQueryWrapper(smartDeviceParamBed);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceParamBed
    * @return
    */
    @Override
    public List<SmartDeviceParamBed> queryList(SmartDeviceParamBed smartDeviceParamBed) {
        LambdaQueryWrapper<SmartDeviceParamBed> queryWrapper = getQueryWrapper(smartDeviceParamBed);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartDeviceParamBed
    * @return
    */
    public static LambdaQueryWrapper<SmartDeviceParamBed> getQueryWrapper(SmartDeviceParamBed smartDeviceParamBed){
        LambdaQueryWrapper<SmartDeviceParamBed> queryWrapper = new LambdaQueryWrapper<>();
        if (smartDeviceParamBed.getId() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getId, smartDeviceParamBed.getId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBed.getTenantId())) {
            queryWrapper.eq(SmartDeviceParamBed::getTenantId, smartDeviceParamBed.getTenantId());
        }
        if (smartDeviceParamBed.getGrantId() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getGrantId, smartDeviceParamBed.getGrantId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBed.getDeviceName())) {
            queryWrapper.eq(SmartDeviceParamBed::getDeviceName, smartDeviceParamBed.getDeviceName());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBed.getDeviceSerial())) {
            queryWrapper.eq(SmartDeviceParamBed::getDeviceSerial, smartDeviceParamBed.getDeviceSerial());
        }
        if (smartDeviceParamBed.getHrAlarmEnable() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getHrAlarmEnable, smartDeviceParamBed.getHrAlarmEnable());
        }
        if (smartDeviceParamBed.getHrAlarmMax() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getHrAlarmMax, smartDeviceParamBed.getHrAlarmMax());
        }
        if (smartDeviceParamBed.getHrAlarmMin() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getHrAlarmMin, smartDeviceParamBed.getHrAlarmMin());
        }
        if (smartDeviceParamBed.getRrAlarmEnable() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getRrAlarmEnable, smartDeviceParamBed.getRrAlarmEnable());
        }
        if (smartDeviceParamBed.getRrStopEnable() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getRrStopEnable, smartDeviceParamBed.getRrStopEnable());
        }
        if (smartDeviceParamBed.getRrAlarmMax() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getRrAlarmMax, smartDeviceParamBed.getRrAlarmMax());
        }
        if (smartDeviceParamBed.getRrAlarmMin() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getRrAlarmMin, smartDeviceParamBed.getRrAlarmMin());
        }
        if (smartDeviceParamBed.getOffBedEnable() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getOffBedEnable, smartDeviceParamBed.getOffBedEnable());
        }
        if (smartDeviceParamBed.getLeaveDura() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getLeaveDura, smartDeviceParamBed.getLeaveDura());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBed.getSleepDayDuraStart())) {
            queryWrapper.eq(SmartDeviceParamBed::getSleepDayDuraStart, smartDeviceParamBed.getSleepDayDuraStart());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBed.getSleepDayDuraStop())) {
            queryWrapper.eq(SmartDeviceParamBed::getSleepDayDuraStop, smartDeviceParamBed.getSleepDayDuraStop());
        }
        if (smartDeviceParamBed.getSleepAllDayEnable() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getSleepAllDayEnable, smartDeviceParamBed.getSleepAllDayEnable());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBed.getSleepNightDuraStart())) {
            queryWrapper.eq(SmartDeviceParamBed::getSleepNightDuraStart, smartDeviceParamBed.getSleepNightDuraStart());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBed.getSleepNightDuraStop())) {
            queryWrapper.eq(SmartDeviceParamBed::getSleepNightDuraStop, smartDeviceParamBed.getSleepNightDuraStop());
        }
        if (smartDeviceParamBed.getNoonSleepDayEnable() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getNoonSleepDayEnable, smartDeviceParamBed.getNoonSleepDayEnable());
        }
        if (smartDeviceParamBed.getNightSleepsDayEnable() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getNightSleepsDayEnable, smartDeviceParamBed.getNightSleepsDayEnable());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBed.getRemark())) {
            queryWrapper.eq(SmartDeviceParamBed::getRemark, smartDeviceParamBed.getRemark());
        }
        if (smartDeviceParamBed.getCreateUser() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getCreateUser, smartDeviceParamBed.getCreateUser());
        }
        if (smartDeviceParamBed.getCreateDept() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getCreateDept, smartDeviceParamBed.getCreateDept());
        }
        if (smartDeviceParamBed.getCreateTime() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getCreateTime, smartDeviceParamBed.getCreateTime());
        }
        if (smartDeviceParamBed.getUpdateUser() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getUpdateUser, smartDeviceParamBed.getUpdateUser());
        }
        if (smartDeviceParamBed.getUpdateTime() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getUpdateTime, smartDeviceParamBed.getUpdateTime());
        }
        if (smartDeviceParamBed.getIsDeleted() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getIsDeleted, smartDeviceParamBed.getIsDeleted());
        }
        if (smartDeviceParamBed.getStatus() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getStatus, smartDeviceParamBed.getStatus());
        }
        if (smartDeviceParamBed.getHeartRate() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getHeartRate, smartDeviceParamBed.getHeartRate());
        }
        if (smartDeviceParamBed.getBreathRate() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getBreathRate, smartDeviceParamBed.getBreathRate());
        }
        if (smartDeviceParamBed.getOnBed() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getOnBed, smartDeviceParamBed.getOnBed());
        }
        if (smartDeviceParamBed.getBodyShake() != null) {
            queryWrapper.eq(SmartDeviceParamBed::getBodyShake, smartDeviceParamBed.getBodyShake());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartDeviceParamBed 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamBed insert(SmartDeviceParamBed smartDeviceParamBed) {
        smartDeviceParamBed.setId(null);
        getBaseMapper().insert(smartDeviceParamBed);
        return smartDeviceParamBed;
    }

    /**
    * 更新数据
    *
    * @param smartDeviceParamBed 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamBed update(SmartDeviceParamBed smartDeviceParamBed) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartDeviceParamBed> chainWrapper = new LambdaUpdateChainWrapper<SmartDeviceParamBed>(getBaseMapper());
        if (smartDeviceParamBed.getId() != null) {
            chainWrapper.set(SmartDeviceParamBed::getId, smartDeviceParamBed.getId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBed.getTenantId())) {
            chainWrapper.set(SmartDeviceParamBed::getTenantId, smartDeviceParamBed.getTenantId());
        }
        if (smartDeviceParamBed.getGrantId() != null) {
            chainWrapper.set(SmartDeviceParamBed::getGrantId, smartDeviceParamBed.getGrantId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBed.getDeviceName())) {
            chainWrapper.set(SmartDeviceParamBed::getDeviceName, smartDeviceParamBed.getDeviceName());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBed.getDeviceSerial())) {
            chainWrapper.set(SmartDeviceParamBed::getDeviceSerial, smartDeviceParamBed.getDeviceSerial());
        }
        if (smartDeviceParamBed.getHrAlarmEnable() != null) {
            chainWrapper.set(SmartDeviceParamBed::getHrAlarmEnable, smartDeviceParamBed.getHrAlarmEnable());
        }
        if (smartDeviceParamBed.getHrAlarmMax() != null) {
            chainWrapper.set(SmartDeviceParamBed::getHrAlarmMax, smartDeviceParamBed.getHrAlarmMax());
        }
        if (smartDeviceParamBed.getHrAlarmMin() != null) {
            chainWrapper.set(SmartDeviceParamBed::getHrAlarmMin, smartDeviceParamBed.getHrAlarmMin());
        }
        if (smartDeviceParamBed.getRrAlarmEnable() != null) {
            chainWrapper.set(SmartDeviceParamBed::getRrAlarmEnable, smartDeviceParamBed.getRrAlarmEnable());
        }
        if (smartDeviceParamBed.getRrStopEnable() != null) {
            chainWrapper.set(SmartDeviceParamBed::getRrStopEnable, smartDeviceParamBed.getRrStopEnable());
        }
        if (smartDeviceParamBed.getRrAlarmMax() != null) {
            chainWrapper.set(SmartDeviceParamBed::getRrAlarmMax, smartDeviceParamBed.getRrAlarmMax());
        }
        if (smartDeviceParamBed.getRrAlarmMin() != null) {
            chainWrapper.set(SmartDeviceParamBed::getRrAlarmMin, smartDeviceParamBed.getRrAlarmMin());
        }
        if (smartDeviceParamBed.getOffBedEnable() != null) {
            chainWrapper.set(SmartDeviceParamBed::getOffBedEnable, smartDeviceParamBed.getOffBedEnable());
        }
        if (smartDeviceParamBed.getLeaveDura() != null) {
            chainWrapper.set(SmartDeviceParamBed::getLeaveDura, smartDeviceParamBed.getLeaveDura());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBed.getSleepDayDuraStart())) {
            chainWrapper.set(SmartDeviceParamBed::getSleepDayDuraStart, smartDeviceParamBed.getSleepDayDuraStart());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBed.getSleepDayDuraStop())) {
            chainWrapper.set(SmartDeviceParamBed::getSleepDayDuraStop, smartDeviceParamBed.getSleepDayDuraStop());
        }
        if (smartDeviceParamBed.getSleepAllDayEnable() != null) {
            chainWrapper.set(SmartDeviceParamBed::getSleepAllDayEnable, smartDeviceParamBed.getSleepAllDayEnable());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBed.getSleepNightDuraStart())) {
            chainWrapper.set(SmartDeviceParamBed::getSleepNightDuraStart, smartDeviceParamBed.getSleepNightDuraStart());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBed.getSleepNightDuraStop())) {
            chainWrapper.set(SmartDeviceParamBed::getSleepNightDuraStop, smartDeviceParamBed.getSleepNightDuraStop());
        }
        if (smartDeviceParamBed.getNoonSleepDayEnable() != null) {
            chainWrapper.set(SmartDeviceParamBed::getNoonSleepDayEnable, smartDeviceParamBed.getNoonSleepDayEnable());
        }
        if (smartDeviceParamBed.getNightSleepsDayEnable() != null) {
            chainWrapper.set(SmartDeviceParamBed::getNightSleepsDayEnable, smartDeviceParamBed.getNightSleepsDayEnable());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBed.getRemark())) {
            chainWrapper.set(SmartDeviceParamBed::getRemark, smartDeviceParamBed.getRemark());
        }
        if (smartDeviceParamBed.getCreateUser() != null) {
            chainWrapper.set(SmartDeviceParamBed::getCreateUser, smartDeviceParamBed.getCreateUser());
        }
        if (smartDeviceParamBed.getCreateDept() != null) {
            chainWrapper.set(SmartDeviceParamBed::getCreateDept, smartDeviceParamBed.getCreateDept());
        }
        if (smartDeviceParamBed.getCreateTime() != null) {
            chainWrapper.set(SmartDeviceParamBed::getCreateTime, smartDeviceParamBed.getCreateTime());
        }
        if (smartDeviceParamBed.getUpdateUser() != null) {
            chainWrapper.set(SmartDeviceParamBed::getUpdateUser, smartDeviceParamBed.getUpdateUser());
        }
        if (smartDeviceParamBed.getUpdateTime() != null) {
            chainWrapper.set(SmartDeviceParamBed::getUpdateTime, smartDeviceParamBed.getUpdateTime());
        }
        if (smartDeviceParamBed.getIsDeleted() != null) {
            chainWrapper.set(SmartDeviceParamBed::getIsDeleted, smartDeviceParamBed.getIsDeleted());
        }
        if (smartDeviceParamBed.getStatus() != null) {
            chainWrapper.set(SmartDeviceParamBed::getStatus, smartDeviceParamBed.getStatus());
        }
        if (smartDeviceParamBed.getHeartRate() != null) {
            chainWrapper.set(SmartDeviceParamBed::getHeartRate, smartDeviceParamBed.getHeartRate());
        }
        if (smartDeviceParamBed.getBreathRate() != null) {
            chainWrapper.set(SmartDeviceParamBed::getBreathRate, smartDeviceParamBed.getBreathRate());
        }
        if (smartDeviceParamBed.getOnBed() != null) {
            chainWrapper.set(SmartDeviceParamBed::getOnBed, smartDeviceParamBed.getOnBed());
        }
        if (smartDeviceParamBed.getBodyShake() != null) {
            chainWrapper.set(SmartDeviceParamBed::getBodyShake, smartDeviceParamBed.getBodyShake());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartDeviceParamBed::getId, smartDeviceParamBed.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartDeviceParamBed.getId());
        } else {
            return smartDeviceParamBed;
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
    public boolean saveSmartDeviceParamBedBatch(List<SmartDeviceParamBed> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartDeviceParamBed smartDeviceParamBed : insertList) {
            //使用默认的雪花算法生成
            smartDeviceParamBed.setId(null);
            //smartDeviceParamBed.setCreatedDt(currentDte);
            //smartDeviceParamBed.setUpdatedDt(currentDte);
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
    public Integer deleteSmartDeviceParamBedBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartDeviceParamBed> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public void updateSmartDeviceParamBed(SmartDeviceParamBed smartDeviceParamBed) {
        getBaseMapper().updateSmartDeviceParamBed(smartDeviceParamBed);
    }
}


