package cn.pluss.platform.service.smartDeviceParamFall.impl;

import cn.pluss.platform.mapper.SmartDeviceParamFallMapper;
import cn.pluss.platform.model.entity.SmartDeviceParamFall;
import cn.pluss.platform.service.smartDeviceParamFall.SmartDeviceParamFallService;
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
@Service("smartDeviceParamFallService")
public class SmartDeviceParamFallServiceImpl extends ServiceImpl< SmartDeviceParamFallMapper, SmartDeviceParamFall> implements SmartDeviceParamFallService {
    private static final Logger logger = LoggerFactory.getLogger(SmartDeviceParamFallServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartDeviceParamFall> queryPage(Map map) {
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
    public SmartDeviceParamFall queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceParamFall 实例对象
    * @return 实例对象
    */
    @Override
    public SmartDeviceParamFall queryOne(SmartDeviceParamFall smartDeviceParamFall){
        LambdaQueryWrapper<SmartDeviceParamFall> queryWrapper = getQueryWrapper(smartDeviceParamFall);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceParamFall
    * @return
    */
    @Override
    public List<SmartDeviceParamFall> queryList(SmartDeviceParamFall smartDeviceParamFall) {
        LambdaQueryWrapper<SmartDeviceParamFall> queryWrapper = getQueryWrapper(smartDeviceParamFall);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartDeviceParamFall
    * @return
    */
    public static LambdaQueryWrapper<SmartDeviceParamFall> getQueryWrapper(SmartDeviceParamFall smartDeviceParamFall){
        LambdaQueryWrapper<SmartDeviceParamFall> queryWrapper = new LambdaQueryWrapper<>();
        if (smartDeviceParamFall.getId() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getId, smartDeviceParamFall.getId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamFall.getTenantId())) {
            queryWrapper.eq(SmartDeviceParamFall::getTenantId, smartDeviceParamFall.getTenantId());
        }
        if (smartDeviceParamFall.getGrantId() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getGrantId, smartDeviceParamFall.getGrantId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamFall.getDeviceName())) {
            queryWrapper.eq(SmartDeviceParamFall::getDeviceName, smartDeviceParamFall.getDeviceName());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamFall.getDeviceSerial())) {
            queryWrapper.eq(SmartDeviceParamFall::getDeviceSerial, smartDeviceParamFall.getDeviceSerial());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamFall.getFallType())) {
            queryWrapper.eq(SmartDeviceParamFall::getFallType, smartDeviceParamFall.getFallType());
        }
        if (smartDeviceParamFall.getInstallHeight() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getInstallHeight, smartDeviceParamFall.getInstallHeight());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamFall.getSomeoneExist())) {
            queryWrapper.eq(SmartDeviceParamFall::getSomeoneExist, smartDeviceParamFall.getSomeoneExist());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamFall.getMotionStatus())) {
            queryWrapper.eq(SmartDeviceParamFall::getMotionStatus, smartDeviceParamFall.getMotionStatus());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamFall.getMovementSign())) {
            queryWrapper.eq(SmartDeviceParamFall::getMovementSign, smartDeviceParamFall.getMovementSign());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamFall.getParam())) {
            queryWrapper.eq(SmartDeviceParamFall::getParam, smartDeviceParamFall.getParam());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamFall.getRemark())) {
            queryWrapper.eq(SmartDeviceParamFall::getRemark, smartDeviceParamFall.getRemark());
        }
        if (smartDeviceParamFall.getCreateUser() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getCreateUser, smartDeviceParamFall.getCreateUser());
        }
        if (smartDeviceParamFall.getCreateDept() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getCreateDept, smartDeviceParamFall.getCreateDept());
        }
        if (smartDeviceParamFall.getCreateTime() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getCreateTime, smartDeviceParamFall.getCreateTime());
        }
        if (smartDeviceParamFall.getUpdateUser() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getUpdateUser, smartDeviceParamFall.getUpdateUser());
        }
        if (smartDeviceParamFall.getUpdateTime() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getUpdateTime, smartDeviceParamFall.getUpdateTime());
        }
        if (smartDeviceParamFall.getIsDeleted() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getIsDeleted, smartDeviceParamFall.getIsDeleted());
        }
        if (smartDeviceParamFall.getStatus() != null) {
            queryWrapper.eq(SmartDeviceParamFall::getStatus, smartDeviceParamFall.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartDeviceParamFall 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamFall insert(SmartDeviceParamFall smartDeviceParamFall) {
        smartDeviceParamFall.setId(null);
        getBaseMapper().insert(smartDeviceParamFall);
        return smartDeviceParamFall;
    }

    /**
    * 更新数据
    *
    * @param smartDeviceParamFall 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamFall update(SmartDeviceParamFall smartDeviceParamFall) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartDeviceParamFall> chainWrapper = new LambdaUpdateChainWrapper<SmartDeviceParamFall>(getBaseMapper());
        if (smartDeviceParamFall.getId() != null) {
            chainWrapper.set(SmartDeviceParamFall::getId, smartDeviceParamFall.getId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamFall.getTenantId())) {
            chainWrapper.set(SmartDeviceParamFall::getTenantId, smartDeviceParamFall.getTenantId());
        }
        if (smartDeviceParamFall.getGrantId() != null) {
            chainWrapper.set(SmartDeviceParamFall::getGrantId, smartDeviceParamFall.getGrantId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamFall.getDeviceName())) {
            chainWrapper.set(SmartDeviceParamFall::getDeviceName, smartDeviceParamFall.getDeviceName());
        }
        if (StringUtil.isNotBlank(smartDeviceParamFall.getDeviceSerial())) {
            chainWrapper.set(SmartDeviceParamFall::getDeviceSerial, smartDeviceParamFall.getDeviceSerial());
        }
        if (StringUtil.isNotBlank(smartDeviceParamFall.getFallType())) {
            chainWrapper.set(SmartDeviceParamFall::getFallType, smartDeviceParamFall.getFallType());
        }
        if (smartDeviceParamFall.getInstallHeight() != null) {
            chainWrapper.set(SmartDeviceParamFall::getInstallHeight, smartDeviceParamFall.getInstallHeight());
        }
        if (StringUtil.isNotBlank(smartDeviceParamFall.getSomeoneExist())) {
            chainWrapper.set(SmartDeviceParamFall::getSomeoneExist, smartDeviceParamFall.getSomeoneExist());
        }
        if (StringUtil.isNotBlank(smartDeviceParamFall.getMotionStatus())) {
            chainWrapper.set(SmartDeviceParamFall::getMotionStatus, smartDeviceParamFall.getMotionStatus());
        }
        if (StringUtil.isNotBlank(smartDeviceParamFall.getMovementSign())) {
            chainWrapper.set(SmartDeviceParamFall::getMovementSign, smartDeviceParamFall.getMovementSign());
        }
        if (StringUtil.isNotBlank(smartDeviceParamFall.getParam())) {
            chainWrapper.set(SmartDeviceParamFall::getParam, smartDeviceParamFall.getParam());
        }
        if (StringUtil.isNotBlank(smartDeviceParamFall.getRemark())) {
            chainWrapper.set(SmartDeviceParamFall::getRemark, smartDeviceParamFall.getRemark());
        }
        if (smartDeviceParamFall.getCreateUser() != null) {
            chainWrapper.set(SmartDeviceParamFall::getCreateUser, smartDeviceParamFall.getCreateUser());
        }
        if (smartDeviceParamFall.getCreateDept() != null) {
            chainWrapper.set(SmartDeviceParamFall::getCreateDept, smartDeviceParamFall.getCreateDept());
        }
        if (smartDeviceParamFall.getCreateTime() != null) {
            chainWrapper.set(SmartDeviceParamFall::getCreateTime, smartDeviceParamFall.getCreateTime());
        }
        if (smartDeviceParamFall.getUpdateUser() != null) {
            chainWrapper.set(SmartDeviceParamFall::getUpdateUser, smartDeviceParamFall.getUpdateUser());
        }
        if (smartDeviceParamFall.getUpdateTime() != null) {
            chainWrapper.set(SmartDeviceParamFall::getUpdateTime, smartDeviceParamFall.getUpdateTime());
        }
        if (smartDeviceParamFall.getIsDeleted() != null) {
            chainWrapper.set(SmartDeviceParamFall::getIsDeleted, smartDeviceParamFall.getIsDeleted());
        }
        if (smartDeviceParamFall.getStatus() != null) {
            chainWrapper.set(SmartDeviceParamFall::getStatus, smartDeviceParamFall.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartDeviceParamFall::getId, smartDeviceParamFall.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartDeviceParamFall.getId());
        } else {
            return smartDeviceParamFall;
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
    public boolean saveSmartDeviceParamFallBatch(List<SmartDeviceParamFall> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartDeviceParamFall smartDeviceParamFall : insertList) {
            //使用默认的雪花算法生成
            smartDeviceParamFall.setId(null);
            //smartDeviceParamFall.setCreatedDt(currentDte);
            //smartDeviceParamFall.setUpdatedDt(currentDte);
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
    public Integer deleteSmartDeviceParamFallBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartDeviceParamFall> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    /**
    * 根据设备序列号更新摔倒检测数据
    * @param smartDeviceParamFall 实例对象（deviceSerial 必填）
    * @return 更新后的对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void updateByDeviceSerial(SmartDeviceParamFall smartDeviceParamFall) {
        LambdaUpdateChainWrapper<SmartDeviceParamFall> chainWrapper = new LambdaUpdateChainWrapper<>(getBaseMapper());
        if (StringUtil.isNotBlank(smartDeviceParamFall.getSomeoneExist())) {
            chainWrapper.set(SmartDeviceParamFall::getSomeoneExist, smartDeviceParamFall.getSomeoneExist());
        }
        if (smartDeviceParamFall.getUpdateTime() != null) {
            chainWrapper.set(SmartDeviceParamFall::getUpdateTime, smartDeviceParamFall.getUpdateTime());
        }
        chainWrapper.eq(SmartDeviceParamFall::getDeviceSerial, smartDeviceParamFall.getDeviceSerial());
        chainWrapper.update();
    }

}


