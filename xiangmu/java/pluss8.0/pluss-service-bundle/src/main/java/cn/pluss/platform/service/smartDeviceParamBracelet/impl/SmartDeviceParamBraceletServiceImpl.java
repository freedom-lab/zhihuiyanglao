package cn.pluss.platform.service.smartDeviceParamBracelet.impl;

import cn.pluss.platform.mapper.SmartDeviceParamBraceletMapper;
import cn.pluss.platform.model.entity.SmartDeviceParamBracelet;
import cn.pluss.platform.service.smartDeviceParamBracelet.SmartDeviceParamBraceletService;
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
@Service("smartDeviceParamBraceletService")
public class SmartDeviceParamBraceletServiceImpl extends ServiceImpl< SmartDeviceParamBraceletMapper, SmartDeviceParamBracelet> implements SmartDeviceParamBraceletService {
    private static final Logger logger = LoggerFactory.getLogger(SmartDeviceParamBraceletServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartDeviceParamBracelet> queryPage(Map map) {
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
    public SmartDeviceParamBracelet queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceParamBracelet 实例对象
    * @return 实例对象
    */
    @Override
    public SmartDeviceParamBracelet queryOne(SmartDeviceParamBracelet smartDeviceParamBracelet){
        LambdaQueryWrapper<SmartDeviceParamBracelet> queryWrapper = getQueryWrapper(smartDeviceParamBracelet);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceParamBracelet
    * @return
    */
    @Override
    public List<SmartDeviceParamBracelet> queryList(SmartDeviceParamBracelet smartDeviceParamBracelet) {
        LambdaQueryWrapper<SmartDeviceParamBracelet> queryWrapper = getQueryWrapper(smartDeviceParamBracelet);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartDeviceParamBracelet
    * @return
    */
    public static LambdaQueryWrapper<SmartDeviceParamBracelet> getQueryWrapper(SmartDeviceParamBracelet smartDeviceParamBracelet){
        LambdaQueryWrapper<SmartDeviceParamBracelet> queryWrapper = new LambdaQueryWrapper<>();
        if (smartDeviceParamBracelet.getId() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getId, smartDeviceParamBracelet.getId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getTenantId())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getTenantId, smartDeviceParamBracelet.getTenantId());
        }
        if (smartDeviceParamBracelet.getGrantId() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getGrantId, smartDeviceParamBracelet.getGrantId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getDeviceName())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getDeviceName, smartDeviceParamBracelet.getDeviceName());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getDeviceSerial())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getDeviceSerial, smartDeviceParamBracelet.getDeviceSerial());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getSosNumberOne())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getSosNumberOne, smartDeviceParamBracelet.getSosNumberOne());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getSosNumberTwo())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getSosNumberTwo, smartDeviceParamBracelet.getSosNumberTwo());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getSosNumberThree())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getSosNumberThree, smartDeviceParamBracelet.getSosNumberThree());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getFamilyNameOne())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getFamilyNameOne, smartDeviceParamBracelet.getFamilyNameOne());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getFamilyNameTwo())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getFamilyNameTwo, smartDeviceParamBracelet.getFamilyNameTwo());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getFamilyNameThree())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getFamilyNameThree, smartDeviceParamBracelet.getFamilyNameThree());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getFamilyNameFour())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getFamilyNameFour, smartDeviceParamBracelet.getFamilyNameFour());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getFamilyNumberOne())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getFamilyNumberOne, smartDeviceParamBracelet.getFamilyNumberOne());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getFamilyNumberTwo())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getFamilyNumberTwo, smartDeviceParamBracelet.getFamilyNumberTwo());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getFamilyNumberThree())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getFamilyNumberThree, smartDeviceParamBracelet.getFamilyNumberThree());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getFamilyNumberFour())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getFamilyNumberFour, smartDeviceParamBracelet.getFamilyNumberFour());
        }
        if (smartDeviceParamBracelet.getLocationInterval() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getLocationInterval, smartDeviceParamBracelet.getLocationInterval());
        }
        if (smartDeviceParamBracelet.getHeartInterval() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getHeartInterval, smartDeviceParamBracelet.getHeartInterval());
        }
        if (smartDeviceParamBracelet.getStepInterval() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getStepInterval, smartDeviceParamBracelet.getStepInterval());
        }
        if (smartDeviceParamBracelet.getNeedUpdate() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getNeedUpdate, smartDeviceParamBracelet.getNeedUpdate());
        }
        if (smartDeviceParamBracelet.getBatteryAlert() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getBatteryAlert, smartDeviceParamBracelet.getBatteryAlert());
        }
        if (smartDeviceParamBracelet.getSosAlert() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getSosAlert, smartDeviceParamBracelet.getSosAlert());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getCenterTel())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getCenterTel, smartDeviceParamBracelet.getCenterTel());
        }
        if (smartDeviceParamBracelet.getRemoteShutdowm() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getRemoteShutdowm, smartDeviceParamBracelet.getRemoteShutdowm());
        }
        if (smartDeviceParamBracelet.getUpdateState() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getUpdateState, smartDeviceParamBracelet.getUpdateState());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamBracelet.getRemark())) {
            queryWrapper.eq(SmartDeviceParamBracelet::getRemark, smartDeviceParamBracelet.getRemark());
        }
        if (smartDeviceParamBracelet.getCreateUser() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getCreateUser, smartDeviceParamBracelet.getCreateUser());
        }
        if (smartDeviceParamBracelet.getCreateDept() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getCreateDept, smartDeviceParamBracelet.getCreateDept());
        }
        if (smartDeviceParamBracelet.getCreateTime() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getCreateTime, smartDeviceParamBracelet.getCreateTime());
        }
        if (smartDeviceParamBracelet.getUpdateUser() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getUpdateUser, smartDeviceParamBracelet.getUpdateUser());
        }
        if (smartDeviceParamBracelet.getUpdateTime() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getUpdateTime, smartDeviceParamBracelet.getUpdateTime());
        }
        if (smartDeviceParamBracelet.getIsDeleted() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getIsDeleted, smartDeviceParamBracelet.getIsDeleted());
        }
        if (smartDeviceParamBracelet.getStatus() != null) {
            queryWrapper.eq(SmartDeviceParamBracelet::getStatus, smartDeviceParamBracelet.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartDeviceParamBracelet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamBracelet insert(SmartDeviceParamBracelet smartDeviceParamBracelet) {
        smartDeviceParamBracelet.setId(null);
        getBaseMapper().insert(smartDeviceParamBracelet);
        return smartDeviceParamBracelet;
    }

    /**
    * 更新数据
    *
    * @param smartDeviceParamBracelet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamBracelet update(SmartDeviceParamBracelet smartDeviceParamBracelet) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartDeviceParamBracelet> chainWrapper = new LambdaUpdateChainWrapper<SmartDeviceParamBracelet>(getBaseMapper());
        if (smartDeviceParamBracelet.getId() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getId, smartDeviceParamBracelet.getId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getTenantId())) {
            chainWrapper.set(SmartDeviceParamBracelet::getTenantId, smartDeviceParamBracelet.getTenantId());
        }
        if (smartDeviceParamBracelet.getGrantId() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getGrantId, smartDeviceParamBracelet.getGrantId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getDeviceName())) {
            chainWrapper.set(SmartDeviceParamBracelet::getDeviceName, smartDeviceParamBracelet.getDeviceName());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getDeviceSerial())) {
            chainWrapper.set(SmartDeviceParamBracelet::getDeviceSerial, smartDeviceParamBracelet.getDeviceSerial());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getSosNumberOne())) {
            chainWrapper.set(SmartDeviceParamBracelet::getSosNumberOne, smartDeviceParamBracelet.getSosNumberOne());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getSosNumberTwo())) {
            chainWrapper.set(SmartDeviceParamBracelet::getSosNumberTwo, smartDeviceParamBracelet.getSosNumberTwo());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getSosNumberThree())) {
            chainWrapper.set(SmartDeviceParamBracelet::getSosNumberThree, smartDeviceParamBracelet.getSosNumberThree());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getFamilyNameOne())) {
            chainWrapper.set(SmartDeviceParamBracelet::getFamilyNameOne, smartDeviceParamBracelet.getFamilyNameOne());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getFamilyNameTwo())) {
            chainWrapper.set(SmartDeviceParamBracelet::getFamilyNameTwo, smartDeviceParamBracelet.getFamilyNameTwo());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getFamilyNameThree())) {
            chainWrapper.set(SmartDeviceParamBracelet::getFamilyNameThree, smartDeviceParamBracelet.getFamilyNameThree());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getFamilyNameFour())) {
            chainWrapper.set(SmartDeviceParamBracelet::getFamilyNameFour, smartDeviceParamBracelet.getFamilyNameFour());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getFamilyNumberOne())) {
            chainWrapper.set(SmartDeviceParamBracelet::getFamilyNumberOne, smartDeviceParamBracelet.getFamilyNumberOne());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getFamilyNumberTwo())) {
            chainWrapper.set(SmartDeviceParamBracelet::getFamilyNumberTwo, smartDeviceParamBracelet.getFamilyNumberTwo());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getFamilyNumberThree())) {
            chainWrapper.set(SmartDeviceParamBracelet::getFamilyNumberThree, smartDeviceParamBracelet.getFamilyNumberThree());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getFamilyNumberFour())) {
            chainWrapper.set(SmartDeviceParamBracelet::getFamilyNumberFour, smartDeviceParamBracelet.getFamilyNumberFour());
        }
        if (smartDeviceParamBracelet.getLocationInterval() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getLocationInterval, smartDeviceParamBracelet.getLocationInterval());
        }
        if (smartDeviceParamBracelet.getHeartInterval() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getHeartInterval, smartDeviceParamBracelet.getHeartInterval());
        }
        if (smartDeviceParamBracelet.getStepInterval() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getStepInterval, smartDeviceParamBracelet.getStepInterval());
        }
        if (smartDeviceParamBracelet.getNeedUpdate() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getNeedUpdate, smartDeviceParamBracelet.getNeedUpdate());
        }
        if (smartDeviceParamBracelet.getBatteryAlert() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getBatteryAlert, smartDeviceParamBracelet.getBatteryAlert());
        }
        if (smartDeviceParamBracelet.getSosAlert() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getSosAlert, smartDeviceParamBracelet.getSosAlert());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getCenterTel())) {
            chainWrapper.set(SmartDeviceParamBracelet::getCenterTel, smartDeviceParamBracelet.getCenterTel());
        }
        if (smartDeviceParamBracelet.getRemoteShutdowm() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getRemoteShutdowm, smartDeviceParamBracelet.getRemoteShutdowm());
        }
        if (smartDeviceParamBracelet.getUpdateState() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getUpdateState, smartDeviceParamBracelet.getUpdateState());
        }
        if (StringUtil.isNotBlank(smartDeviceParamBracelet.getRemark())) {
            chainWrapper.set(SmartDeviceParamBracelet::getRemark, smartDeviceParamBracelet.getRemark());
        }
        if (smartDeviceParamBracelet.getCreateUser() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getCreateUser, smartDeviceParamBracelet.getCreateUser());
        }
        if (smartDeviceParamBracelet.getCreateDept() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getCreateDept, smartDeviceParamBracelet.getCreateDept());
        }
        if (smartDeviceParamBracelet.getCreateTime() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getCreateTime, smartDeviceParamBracelet.getCreateTime());
        }
        if (smartDeviceParamBracelet.getUpdateUser() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getUpdateUser, smartDeviceParamBracelet.getUpdateUser());
        }
        if (smartDeviceParamBracelet.getUpdateTime() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getUpdateTime, smartDeviceParamBracelet.getUpdateTime());
        }
        if (smartDeviceParamBracelet.getIsDeleted() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getIsDeleted, smartDeviceParamBracelet.getIsDeleted());
        }
        if (smartDeviceParamBracelet.getStatus() != null) {
            chainWrapper.set(SmartDeviceParamBracelet::getStatus, smartDeviceParamBracelet.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartDeviceParamBracelet::getId, smartDeviceParamBracelet.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartDeviceParamBracelet.getId());
        } else {
            return smartDeviceParamBracelet;
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
    public boolean saveSmartDeviceParamBraceletBatch(List<SmartDeviceParamBracelet> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartDeviceParamBracelet smartDeviceParamBracelet : insertList) {
            //使用默认的雪花算法生成
            smartDeviceParamBracelet.setId(null);
            //smartDeviceParamBracelet.setCreatedDt(currentDte);
            //smartDeviceParamBracelet.setUpdatedDt(currentDte);
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
    public Integer deleteSmartDeviceParamBraceletBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartDeviceParamBracelet> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


