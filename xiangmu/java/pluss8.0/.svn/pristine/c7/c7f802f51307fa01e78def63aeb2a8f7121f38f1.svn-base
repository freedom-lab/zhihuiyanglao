package cn.pluss.platform.service.iotDeviceType.impl;

import cn.pluss.platform.mapper.IotDeviceTypeMapper;
import cn.pluss.platform.model.entity.IotDeviceType;
import cn.pluss.platform.service.iotDeviceType.IotDeviceTypeService;
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
@Service("iotDeviceTypeService")
public class IotDeviceTypeServiceImpl extends ServiceImpl< IotDeviceTypeMapper, IotDeviceType> implements IotDeviceTypeService {
    private static final Logger logger = LoggerFactory.getLogger(IotDeviceTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<IotDeviceType> queryPage(Map map) {
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
    public IotDeviceType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param iotDeviceType 实例对象
    * @return 实例对象
    */
    @Override
    public IotDeviceType queryOne(IotDeviceType iotDeviceType){
        LambdaQueryWrapper<IotDeviceType> queryWrapper = getQueryWrapper(iotDeviceType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param iotDeviceType
    * @return
    */
    @Override
    public List<IotDeviceType> queryList(IotDeviceType iotDeviceType) {
        LambdaQueryWrapper<IotDeviceType> queryWrapper = getQueryWrapper(iotDeviceType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param iotDeviceType
    * @return
    */
    public static LambdaQueryWrapper<IotDeviceType> getQueryWrapper(IotDeviceType iotDeviceType){
        LambdaQueryWrapper<IotDeviceType> queryWrapper = new LambdaQueryWrapper<>();
        if (iotDeviceType.getId() != null) {
            queryWrapper.eq(IotDeviceType::getId, iotDeviceType.getId());
        }
        if (StringUtil.isNotEmpty(iotDeviceType.getTenantId())) {
            queryWrapper.eq(IotDeviceType::getTenantId, iotDeviceType.getTenantId());
        }
        if (iotDeviceType.getTransMode() != null) {
            queryWrapper.eq(IotDeviceType::getTransMode, iotDeviceType.getTransMode());
        }
        if (StringUtil.isNotEmpty(iotDeviceType.getBigDeviceType())) {
            queryWrapper.eq(IotDeviceType::getBigDeviceType, iotDeviceType.getBigDeviceType());
        }
        if (iotDeviceType.getInterfaceMethod() != null) {
            queryWrapper.eq(IotDeviceType::getInterfaceMethod, iotDeviceType.getInterfaceMethod());
        }
        if (StringUtil.isNotEmpty(iotDeviceType.getInterfaceUrl())) {
            queryWrapper.eq(IotDeviceType::getInterfaceUrl, iotDeviceType.getInterfaceUrl());
        }
        if (StringUtil.isNotEmpty(iotDeviceType.getTypeName())) {
            queryWrapper.eq(IotDeviceType::getTypeName, iotDeviceType.getTypeName());
        }
        if (StringUtil.isNotEmpty(iotDeviceType.getManufacturer())) {
            queryWrapper.eq(IotDeviceType::getManufacturer, iotDeviceType.getManufacturer());
        }
        if (iotDeviceType.getUseRange() != null) {
            queryWrapper.eq(IotDeviceType::getUseRange, iotDeviceType.getUseRange());
        }
        if (iotDeviceType.getHostState() != null) {
            queryWrapper.eq(IotDeviceType::getHostState, iotDeviceType.getHostState());
        }
        if (StringUtil.isNotEmpty(iotDeviceType.getParamDesp())) {
            queryWrapper.eq(IotDeviceType::getParamDesp, iotDeviceType.getParamDesp());
        }
        if (StringUtil.isNotEmpty(iotDeviceType.getDeviceImg())) {
            queryWrapper.eq(IotDeviceType::getDeviceImg, iotDeviceType.getDeviceImg());
        }
        if (StringUtil.isNotEmpty(iotDeviceType.getRemark())) {
            queryWrapper.eq(IotDeviceType::getRemark, iotDeviceType.getRemark());
        }
        if (iotDeviceType.getCreateUser() != null) {
            queryWrapper.eq(IotDeviceType::getCreateUser, iotDeviceType.getCreateUser());
        }
        if (iotDeviceType.getCreateDept() != null) {
            queryWrapper.eq(IotDeviceType::getCreateDept, iotDeviceType.getCreateDept());
        }
        if (iotDeviceType.getCreateTime() != null) {
            queryWrapper.eq(IotDeviceType::getCreateTime, iotDeviceType.getCreateTime());
        }
        if (iotDeviceType.getUpdateUser() != null) {
            queryWrapper.eq(IotDeviceType::getUpdateUser, iotDeviceType.getUpdateUser());
        }
        if (iotDeviceType.getUpdateTime() != null) {
            queryWrapper.eq(IotDeviceType::getUpdateTime, iotDeviceType.getUpdateTime());
        }
        if (iotDeviceType.getIsDeleted() != null) {
            queryWrapper.eq(IotDeviceType::getIsDeleted, iotDeviceType.getIsDeleted());
        }
        if (iotDeviceType.getStatus() != null) {
            queryWrapper.eq(IotDeviceType::getStatus, iotDeviceType.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param iotDeviceType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IotDeviceType insert(IotDeviceType iotDeviceType) {
        iotDeviceType.setId(null);
        getBaseMapper().insert(iotDeviceType);
        return iotDeviceType;
    }

    /**
    * 更新数据
    *
    * @param iotDeviceType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IotDeviceType update(IotDeviceType iotDeviceType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<IotDeviceType> chainWrapper = new LambdaUpdateChainWrapper<IotDeviceType>(getBaseMapper());
        if (iotDeviceType.getId() != null) {
            chainWrapper.set(IotDeviceType::getId, iotDeviceType.getId());
        }
        if (StringUtil.isNotBlank(iotDeviceType.getTenantId())) {
            chainWrapper.set(IotDeviceType::getTenantId, iotDeviceType.getTenantId());
        }
        if (iotDeviceType.getTransMode() != null) {
            chainWrapper.set(IotDeviceType::getTransMode, iotDeviceType.getTransMode());
        }
        if (StringUtil.isNotBlank(iotDeviceType.getBigDeviceType())) {
            chainWrapper.set(IotDeviceType::getBigDeviceType, iotDeviceType.getBigDeviceType());
        }
        if (iotDeviceType.getInterfaceMethod() != null) {
            chainWrapper.set(IotDeviceType::getInterfaceMethod, iotDeviceType.getInterfaceMethod());
        }
        if (StringUtil.isNotBlank(iotDeviceType.getInterfaceUrl())) {
            chainWrapper.set(IotDeviceType::getInterfaceUrl, iotDeviceType.getInterfaceUrl());
        }
        if (StringUtil.isNotBlank(iotDeviceType.getTypeName())) {
            chainWrapper.set(IotDeviceType::getTypeName, iotDeviceType.getTypeName());
        }
        if (StringUtil.isNotBlank(iotDeviceType.getManufacturer())) {
            chainWrapper.set(IotDeviceType::getManufacturer, iotDeviceType.getManufacturer());
        }
        if (iotDeviceType.getUseRange() != null) {
            chainWrapper.set(IotDeviceType::getUseRange, iotDeviceType.getUseRange());
        }
        if (iotDeviceType.getHostState() != null) {
            chainWrapper.set(IotDeviceType::getHostState, iotDeviceType.getHostState());
        }
        if (StringUtil.isNotBlank(iotDeviceType.getParamDesp())) {
            chainWrapper.set(IotDeviceType::getParamDesp, iotDeviceType.getParamDesp());
        }
        if (StringUtil.isNotBlank(iotDeviceType.getDeviceImg())) {
            chainWrapper.set(IotDeviceType::getDeviceImg, iotDeviceType.getDeviceImg());
        }
        if (StringUtil.isNotBlank(iotDeviceType.getRemark())) {
            chainWrapper.set(IotDeviceType::getRemark, iotDeviceType.getRemark());
        }
        if (iotDeviceType.getCreateUser() != null) {
            chainWrapper.set(IotDeviceType::getCreateUser, iotDeviceType.getCreateUser());
        }
        if (iotDeviceType.getCreateDept() != null) {
            chainWrapper.set(IotDeviceType::getCreateDept, iotDeviceType.getCreateDept());
        }
        if (iotDeviceType.getCreateTime() != null) {
            chainWrapper.set(IotDeviceType::getCreateTime, iotDeviceType.getCreateTime());
        }
        if (iotDeviceType.getUpdateUser() != null) {
            chainWrapper.set(IotDeviceType::getUpdateUser, iotDeviceType.getUpdateUser());
        }
        if (iotDeviceType.getUpdateTime() != null) {
            chainWrapper.set(IotDeviceType::getUpdateTime, iotDeviceType.getUpdateTime());
        }
        if (iotDeviceType.getIsDeleted() != null) {
            chainWrapper.set(IotDeviceType::getIsDeleted, iotDeviceType.getIsDeleted());
        }
        if (iotDeviceType.getStatus() != null) {
            chainWrapper.set(IotDeviceType::getStatus, iotDeviceType.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(IotDeviceType::getId, iotDeviceType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(iotDeviceType.getId());
        } else {
            return iotDeviceType;
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
    public boolean saveIotDeviceTypeBatch(List<IotDeviceType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (IotDeviceType iotDeviceType : insertList) {
            //使用默认的雪花算法生成
            iotDeviceType.setId(null);
            //iotDeviceType.setCreatedDt(currentDte);
            //iotDeviceType.setUpdatedDt(currentDte);
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
    public Integer deleteIotDeviceTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<IotDeviceType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


