package cn.pluss.platform.service.smartDeviceParamCamera.impl;

import cn.pluss.platform.mapper.SmartDeviceParamCameraMapper;
import cn.pluss.platform.model.entity.SmartDeviceParamCamera;
import cn.pluss.platform.service.smartDeviceParamCamera.SmartDeviceParamCameraService;
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
@Service("smartDeviceParamCameraService")
public class SmartDeviceParamCameraServiceImpl extends ServiceImpl< SmartDeviceParamCameraMapper, SmartDeviceParamCamera> implements SmartDeviceParamCameraService {
    private static final Logger logger = LoggerFactory.getLogger(SmartDeviceParamCameraServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartDeviceParamCamera> queryPage(Map map) {
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
    public SmartDeviceParamCamera queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceParamCamera 实例对象
    * @return 实例对象
    */
    @Override
    public SmartDeviceParamCamera queryOne(SmartDeviceParamCamera smartDeviceParamCamera){
        LambdaQueryWrapper<SmartDeviceParamCamera> queryWrapper = getQueryWrapper(smartDeviceParamCamera);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceParamCamera
    * @return
    */
    @Override
    public List<SmartDeviceParamCamera> queryList(SmartDeviceParamCamera smartDeviceParamCamera) {
        LambdaQueryWrapper<SmartDeviceParamCamera> queryWrapper = getQueryWrapper(smartDeviceParamCamera);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartDeviceParamCamera
    * @return
    */
    public static LambdaQueryWrapper<SmartDeviceParamCamera> getQueryWrapper(SmartDeviceParamCamera smartDeviceParamCamera){
        LambdaQueryWrapper<SmartDeviceParamCamera> queryWrapper = new LambdaQueryWrapper<>();
        if (smartDeviceParamCamera.getId() != null) {
            queryWrapper.eq(SmartDeviceParamCamera::getId, smartDeviceParamCamera.getId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getTenantId())) {
            queryWrapper.eq(SmartDeviceParamCamera::getTenantId, smartDeviceParamCamera.getTenantId());
        }
        if (smartDeviceParamCamera.getGrantId() != null) {
            queryWrapper.eq(SmartDeviceParamCamera::getGrantId, smartDeviceParamCamera.getGrantId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getDeviceName())) {
            queryWrapper.eq(SmartDeviceParamCamera::getDeviceName, smartDeviceParamCamera.getDeviceName());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getDeviceSerial())) {
            queryWrapper.eq(SmartDeviceParamCamera::getDeviceSerial, smartDeviceParamCamera.getDeviceSerial());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getCameraType())) {
            queryWrapper.eq(SmartDeviceParamCamera::getCameraType, smartDeviceParamCamera.getCameraType());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getCameraAccount())) {
            queryWrapper.eq(SmartDeviceParamCamera::getCameraAccount, smartDeviceParamCamera.getCameraAccount());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getCameraPassword())) {
            queryWrapper.eq(SmartDeviceParamCamera::getCameraPassword, smartDeviceParamCamera.getCameraPassword());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getPcCameraUrl())) {
            queryWrapper.eq(SmartDeviceParamCamera::getPcCameraUrl, smartDeviceParamCamera.getPcCameraUrl());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getCameraUrl())) {
            queryWrapper.eq(SmartDeviceParamCamera::getCameraUrl, smartDeviceParamCamera.getCameraUrl());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getPcPlaybackUrl())) {
            queryWrapper.eq(SmartDeviceParamCamera::getPcPlaybackUrl, smartDeviceParamCamera.getPcPlaybackUrl());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamCamera.getRemark())) {
            queryWrapper.eq(SmartDeviceParamCamera::getRemark, smartDeviceParamCamera.getRemark());
        }
        if (smartDeviceParamCamera.getCreateUser() != null) {
            queryWrapper.eq(SmartDeviceParamCamera::getCreateUser, smartDeviceParamCamera.getCreateUser());
        }
        if (smartDeviceParamCamera.getCreateDept() != null) {
            queryWrapper.eq(SmartDeviceParamCamera::getCreateDept, smartDeviceParamCamera.getCreateDept());
        }
        if (smartDeviceParamCamera.getCreateTime() != null) {
            queryWrapper.eq(SmartDeviceParamCamera::getCreateTime, smartDeviceParamCamera.getCreateTime());
        }
        if (smartDeviceParamCamera.getUpdateUser() != null) {
            queryWrapper.eq(SmartDeviceParamCamera::getUpdateUser, smartDeviceParamCamera.getUpdateUser());
        }
        if (smartDeviceParamCamera.getUpdateTime() != null) {
            queryWrapper.eq(SmartDeviceParamCamera::getUpdateTime, smartDeviceParamCamera.getUpdateTime());
        }
        if (smartDeviceParamCamera.getIsDeleted() != null) {
            queryWrapper.eq(SmartDeviceParamCamera::getIsDeleted, smartDeviceParamCamera.getIsDeleted());
        }
        if (smartDeviceParamCamera.getStatus() != null) {
            queryWrapper.eq(SmartDeviceParamCamera::getStatus, smartDeviceParamCamera.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartDeviceParamCamera 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamCamera insert(SmartDeviceParamCamera smartDeviceParamCamera) {
        smartDeviceParamCamera.setId(null);
        getBaseMapper().insert(smartDeviceParamCamera);
        return smartDeviceParamCamera;
    }

    /**
    * 更新数据
    *
    * @param smartDeviceParamCamera 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamCamera update(SmartDeviceParamCamera smartDeviceParamCamera) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartDeviceParamCamera> chainWrapper = new LambdaUpdateChainWrapper<SmartDeviceParamCamera>(getBaseMapper());
        if (smartDeviceParamCamera.getId() != null) {
            chainWrapper.set(SmartDeviceParamCamera::getId, smartDeviceParamCamera.getId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getTenantId())) {
            chainWrapper.set(SmartDeviceParamCamera::getTenantId, smartDeviceParamCamera.getTenantId());
        }
        if (smartDeviceParamCamera.getGrantId() != null) {
            chainWrapper.set(SmartDeviceParamCamera::getGrantId, smartDeviceParamCamera.getGrantId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getDeviceName())) {
            chainWrapper.set(SmartDeviceParamCamera::getDeviceName, smartDeviceParamCamera.getDeviceName());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getDeviceSerial())) {
            chainWrapper.set(SmartDeviceParamCamera::getDeviceSerial, smartDeviceParamCamera.getDeviceSerial());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getCameraType())) {
            chainWrapper.set(SmartDeviceParamCamera::getCameraType, smartDeviceParamCamera.getCameraType());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getCameraAccount())) {
            chainWrapper.set(SmartDeviceParamCamera::getCameraAccount, smartDeviceParamCamera.getCameraAccount());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getCameraPassword())) {
            chainWrapper.set(SmartDeviceParamCamera::getCameraPassword, smartDeviceParamCamera.getCameraPassword());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getPcCameraUrl())) {
            chainWrapper.set(SmartDeviceParamCamera::getPcCameraUrl, smartDeviceParamCamera.getPcCameraUrl());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getCameraUrl())) {
            chainWrapper.set(SmartDeviceParamCamera::getCameraUrl, smartDeviceParamCamera.getCameraUrl());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getPcPlaybackUrl())) {
            chainWrapper.set(SmartDeviceParamCamera::getPcPlaybackUrl, smartDeviceParamCamera.getPcPlaybackUrl());
        }
        if (StringUtil.isNotBlank(smartDeviceParamCamera.getRemark())) {
            chainWrapper.set(SmartDeviceParamCamera::getRemark, smartDeviceParamCamera.getRemark());
        }
        if (smartDeviceParamCamera.getCreateUser() != null) {
            chainWrapper.set(SmartDeviceParamCamera::getCreateUser, smartDeviceParamCamera.getCreateUser());
        }
        if (smartDeviceParamCamera.getCreateDept() != null) {
            chainWrapper.set(SmartDeviceParamCamera::getCreateDept, smartDeviceParamCamera.getCreateDept());
        }
        if (smartDeviceParamCamera.getCreateTime() != null) {
            chainWrapper.set(SmartDeviceParamCamera::getCreateTime, smartDeviceParamCamera.getCreateTime());
        }
        if (smartDeviceParamCamera.getUpdateUser() != null) {
            chainWrapper.set(SmartDeviceParamCamera::getUpdateUser, smartDeviceParamCamera.getUpdateUser());
        }
        if (smartDeviceParamCamera.getUpdateTime() != null) {
            chainWrapper.set(SmartDeviceParamCamera::getUpdateTime, smartDeviceParamCamera.getUpdateTime());
        }
        if (smartDeviceParamCamera.getIsDeleted() != null) {
            chainWrapper.set(SmartDeviceParamCamera::getIsDeleted, smartDeviceParamCamera.getIsDeleted());
        }
        if (smartDeviceParamCamera.getStatus() != null) {
            chainWrapper.set(SmartDeviceParamCamera::getStatus, smartDeviceParamCamera.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartDeviceParamCamera::getId, smartDeviceParamCamera.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartDeviceParamCamera.getId());
        } else {
            return smartDeviceParamCamera;
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
    public boolean saveSmartDeviceParamCameraBatch(List<SmartDeviceParamCamera> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartDeviceParamCamera smartDeviceParamCamera : insertList) {
            //使用默认的雪花算法生成
            smartDeviceParamCamera.setId(null);
            //smartDeviceParamCamera.setCreatedDt(currentDte);
            //smartDeviceParamCamera.setUpdatedDt(currentDte);
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
    public Integer deleteSmartDeviceParamCameraBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartDeviceParamCamera> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


