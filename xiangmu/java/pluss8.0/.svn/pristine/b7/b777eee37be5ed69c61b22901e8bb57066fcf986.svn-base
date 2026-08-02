package cn.pluss.platform.service.icDeviceType.impl;

import cn.pluss.platform.mapper.IcDeviceTypeMapper;
import cn.pluss.platform.model.entity.IcDeviceType;
import cn.pluss.platform.service.icDeviceType.IcDeviceTypeService;
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
@Service("icDeviceTypeService")
public class IcDeviceTypeServiceImpl extends ServiceImpl< IcDeviceTypeMapper, IcDeviceType> implements IcDeviceTypeService {
    private static final Logger logger = LoggerFactory.getLogger(IcDeviceTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<IcDeviceType> queryPage(Map map) {
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
    public IcDeviceType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param icDeviceType 实例对象
    * @return 实例对象
    */
    @Override
    public IcDeviceType queryOne(IcDeviceType icDeviceType){
        LambdaQueryWrapper<IcDeviceType> queryWrapper = getQueryWrapper(icDeviceType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param icDeviceType
    * @return
    */
    @Override
    public List<IcDeviceType> queryList(IcDeviceType icDeviceType) {
        LambdaQueryWrapper<IcDeviceType> queryWrapper = getQueryWrapper(icDeviceType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param icDeviceType
    * @return
    */
    public static LambdaQueryWrapper<IcDeviceType> getQueryWrapper(IcDeviceType icDeviceType){
        LambdaQueryWrapper<IcDeviceType> queryWrapper = new LambdaQueryWrapper<>();
        if (icDeviceType.getId() != null) {
            queryWrapper.eq(IcDeviceType::getId, icDeviceType.getId());
        }
        if (StringUtil.isNotEmpty(icDeviceType.getTenantId())) {
            queryWrapper.eq(IcDeviceType::getTenantId, icDeviceType.getTenantId());
        }
        if (icDeviceType.getTransMode() != null) {
            queryWrapper.eq(IcDeviceType::getTransMode, icDeviceType.getTransMode());
        }
        if (icDeviceType.getDeviceType() != null) {
            queryWrapper.eq(IcDeviceType::getDeviceType, icDeviceType.getDeviceType());
        }
        if (icDeviceType.getInterfaceMethod() != null) {
            queryWrapper.eq(IcDeviceType::getInterfaceMethod, icDeviceType.getInterfaceMethod());
        }
        if (StringUtil.isNotEmpty(icDeviceType.getInterfaceUrl())) {
            queryWrapper.eq(IcDeviceType::getInterfaceUrl, icDeviceType.getInterfaceUrl());
        }
        if (StringUtil.isNotEmpty(icDeviceType.getTypeCode())) {
            queryWrapper.eq(IcDeviceType::getTypeCode, icDeviceType.getTypeCode());
        }
        if (StringUtil.isNotEmpty(icDeviceType.getTypeName())) {
            queryWrapper.eq(IcDeviceType::getTypeName, icDeviceType.getTypeName());
        }
        if (StringUtil.isNotEmpty(icDeviceType.getManufacturer())) {
            queryWrapper.eq(IcDeviceType::getManufacturer, icDeviceType.getManufacturer());
        }
        if (StringUtil.isNotEmpty(icDeviceType.getRemark())) {
            queryWrapper.eq(IcDeviceType::getRemark, icDeviceType.getRemark());
        }
        if (icDeviceType.getCreateUser() != null) {
            queryWrapper.eq(IcDeviceType::getCreateUser, icDeviceType.getCreateUser());
        }
        if (icDeviceType.getCreateDept() != null) {
            queryWrapper.eq(IcDeviceType::getCreateDept, icDeviceType.getCreateDept());
        }
        if (icDeviceType.getCreateTime() != null) {
            queryWrapper.eq(IcDeviceType::getCreateTime, icDeviceType.getCreateTime());
        }
        if (icDeviceType.getUpdateUser() != null) {
            queryWrapper.eq(IcDeviceType::getUpdateUser, icDeviceType.getUpdateUser());
        }
        if (icDeviceType.getUpdateTime() != null) {
            queryWrapper.eq(IcDeviceType::getUpdateTime, icDeviceType.getUpdateTime());
        }
        if (icDeviceType.getIsDeleted() != null) {
            queryWrapper.eq(IcDeviceType::getIsDeleted, icDeviceType.getIsDeleted());
        }
        if (icDeviceType.getStatus() != null) {
            queryWrapper.eq(IcDeviceType::getStatus, icDeviceType.getStatus());
        }
        if (icDeviceType.getHostState() != null) {
            queryWrapper.eq(IcDeviceType::getHostState, icDeviceType.getHostState());
        }
        if (StringUtil.isNotEmpty(icDeviceType.getDeviceImg())) {
            queryWrapper.eq(IcDeviceType::getDeviceImg, icDeviceType.getDeviceImg());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param icDeviceType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IcDeviceType insert(IcDeviceType icDeviceType) {
        icDeviceType.setId(null);
        getBaseMapper().insert(icDeviceType);
        return icDeviceType;
    }

    /**
    * 更新数据
    *
    * @param icDeviceType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IcDeviceType update(IcDeviceType icDeviceType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<IcDeviceType> chainWrapper = new LambdaUpdateChainWrapper<IcDeviceType>(getBaseMapper());
        if (icDeviceType.getId() != null) {
            chainWrapper.set(IcDeviceType::getId, icDeviceType.getId());
        }
        if (StringUtil.isNotBlank(icDeviceType.getTenantId())) {
            chainWrapper.set(IcDeviceType::getTenantId, icDeviceType.getTenantId());
        }
        if (icDeviceType.getTransMode() != null) {
            chainWrapper.set(IcDeviceType::getTransMode, icDeviceType.getTransMode());
        }
        if (icDeviceType.getDeviceType() != null) {
            chainWrapper.set(IcDeviceType::getDeviceType, icDeviceType.getDeviceType());
        }
        if (icDeviceType.getInterfaceMethod() != null) {
            chainWrapper.set(IcDeviceType::getInterfaceMethod, icDeviceType.getInterfaceMethod());
        }
        if (StringUtil.isNotBlank(icDeviceType.getInterfaceUrl())) {
            chainWrapper.set(IcDeviceType::getInterfaceUrl, icDeviceType.getInterfaceUrl());
        }
        if (StringUtil.isNotBlank(icDeviceType.getTypeCode())) {
            chainWrapper.set(IcDeviceType::getTypeCode, icDeviceType.getTypeCode());
        }
        if (StringUtil.isNotBlank(icDeviceType.getTypeName())) {
            chainWrapper.set(IcDeviceType::getTypeName, icDeviceType.getTypeName());
        }
        if (StringUtil.isNotBlank(icDeviceType.getManufacturer())) {
            chainWrapper.set(IcDeviceType::getManufacturer, icDeviceType.getManufacturer());
        }
        if (StringUtil.isNotBlank(icDeviceType.getRemark())) {
            chainWrapper.set(IcDeviceType::getRemark, icDeviceType.getRemark());
        }
        if (icDeviceType.getCreateUser() != null) {
            chainWrapper.set(IcDeviceType::getCreateUser, icDeviceType.getCreateUser());
        }
        if (icDeviceType.getCreateDept() != null) {
            chainWrapper.set(IcDeviceType::getCreateDept, icDeviceType.getCreateDept());
        }
        if (icDeviceType.getCreateTime() != null) {
            chainWrapper.set(IcDeviceType::getCreateTime, icDeviceType.getCreateTime());
        }
        if (icDeviceType.getUpdateUser() != null) {
            chainWrapper.set(IcDeviceType::getUpdateUser, icDeviceType.getUpdateUser());
        }
        if (icDeviceType.getUpdateTime() != null) {
            chainWrapper.set(IcDeviceType::getUpdateTime, icDeviceType.getUpdateTime());
        }
        if (icDeviceType.getIsDeleted() != null) {
            chainWrapper.set(IcDeviceType::getIsDeleted, icDeviceType.getIsDeleted());
        }
        if (icDeviceType.getStatus() != null) {
            chainWrapper.set(IcDeviceType::getStatus, icDeviceType.getStatus());
        }
        if (icDeviceType.getHostState() != null) {
            chainWrapper.set(IcDeviceType::getHostState, icDeviceType.getHostState());
        }
        if (StringUtil.isNotBlank(icDeviceType.getDeviceImg())) {
            chainWrapper.set(IcDeviceType::getDeviceImg, icDeviceType.getDeviceImg());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(IcDeviceType::getId, icDeviceType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(icDeviceType.getId());
        } else {
            return icDeviceType;
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
    public boolean saveIcDeviceTypeBatch(List<IcDeviceType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (IcDeviceType icDeviceType : insertList) {
            //使用默认的雪花算法生成
            icDeviceType.setId(null);
            //icDeviceType.setCreatedDt(currentDte);
            //icDeviceType.setUpdatedDt(currentDte);
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
    public Integer deleteIcDeviceTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<IcDeviceType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


