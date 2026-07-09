package cn.pluss.platform.service.iotDeviceInfo.impl;

import cn.pluss.platform.mapper.IotDeviceInfoMapper;
import cn.pluss.platform.model.entity.IotDeviceInfo;
import cn.pluss.platform.service.iotDeviceInfo.IotDeviceInfoService;
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
@Service("iotDeviceInfoService")
public class IotDeviceInfoServiceImpl extends ServiceImpl< IotDeviceInfoMapper, IotDeviceInfo> implements IotDeviceInfoService {
    private static final Logger logger = LoggerFactory.getLogger(IotDeviceInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<IotDeviceInfo> queryPage(Map map) {
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
    public IotDeviceInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param iotDeviceInfo 实例对象
    * @return 实例对象
    */
    @Override
    public IotDeviceInfo queryOne(IotDeviceInfo iotDeviceInfo){
        LambdaQueryWrapper<IotDeviceInfo> queryWrapper = getQueryWrapper(iotDeviceInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param iotDeviceInfo
    * @return
    */
    @Override
    public List<IotDeviceInfo> queryList(IotDeviceInfo iotDeviceInfo) {
        LambdaQueryWrapper<IotDeviceInfo> queryWrapper = getQueryWrapper(iotDeviceInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param iotDeviceInfo
    * @return
    */
    public static LambdaQueryWrapper<IotDeviceInfo> getQueryWrapper(IotDeviceInfo iotDeviceInfo){
        LambdaQueryWrapper<IotDeviceInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (iotDeviceInfo.getId() != null) {
            queryWrapper.eq(IotDeviceInfo::getId, iotDeviceInfo.getId());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getTenantId())) {
            queryWrapper.eq(IotDeviceInfo::getTenantId, iotDeviceInfo.getTenantId());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getTenantName())) {
            queryWrapper.eq(IotDeviceInfo::getTenantName, iotDeviceInfo.getTenantName());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getPid())) {
            queryWrapper.eq(IotDeviceInfo::getPid, iotDeviceInfo.getPid());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getBigDeviceType())) {
            queryWrapper.eq(IotDeviceInfo::getBigDeviceType, iotDeviceInfo.getBigDeviceType());
        }
        if (iotDeviceInfo.getTypeId() != null) {
            queryWrapper.eq(IotDeviceInfo::getTypeId, iotDeviceInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getDeviceName())) {
            queryWrapper.eq(IotDeviceInfo::getDeviceName, iotDeviceInfo.getDeviceName());
        }
        if (iotDeviceInfo.getGrantId() != null) {
            queryWrapper.eq(IotDeviceInfo::getGrantId, iotDeviceInfo.getGrantId());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getDeviceVersion())) {
            queryWrapper.eq(IotDeviceInfo::getDeviceVersion, iotDeviceInfo.getDeviceVersion());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getDeviceSerial())) {
            queryWrapper.eq(IotDeviceInfo::getDeviceSerial, iotDeviceInfo.getDeviceSerial());
        }
        if (iotDeviceInfo.getIssueState() != null) {
            queryWrapper.eq(IotDeviceInfo::getIssueState, iotDeviceInfo.getIssueState());
        }
        if (iotDeviceInfo.getBattery() != null) {
            queryWrapper.eq(IotDeviceInfo::getBattery, iotDeviceInfo.getBattery());
        }
        if (iotDeviceInfo.getDeviceState() != null) {
            queryWrapper.eq(IotDeviceInfo::getDeviceState, iotDeviceInfo.getDeviceState());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getRemark())) {
            queryWrapper.eq(IotDeviceInfo::getRemark, iotDeviceInfo.getRemark());
        }
        if (iotDeviceInfo.getCreateUser() != null) {
            queryWrapper.eq(IotDeviceInfo::getCreateUser, iotDeviceInfo.getCreateUser());
        }
        if (iotDeviceInfo.getCreateDept() != null) {
            queryWrapper.eq(IotDeviceInfo::getCreateDept, iotDeviceInfo.getCreateDept());
        }
        if (iotDeviceInfo.getCreateTime() != null) {
            queryWrapper.eq(IotDeviceInfo::getCreateTime, iotDeviceInfo.getCreateTime());
        }
        if (iotDeviceInfo.getUpdateUser() != null) {
            queryWrapper.eq(IotDeviceInfo::getUpdateUser, iotDeviceInfo.getUpdateUser());
        }
        if (iotDeviceInfo.getUpdateTime() != null) {
            queryWrapper.eq(IotDeviceInfo::getUpdateTime, iotDeviceInfo.getUpdateTime());
        }
        if (iotDeviceInfo.getIsDeleted() != null) {
            queryWrapper.eq(IotDeviceInfo::getIsDeleted, iotDeviceInfo.getIsDeleted());
        }
        if (iotDeviceInfo.getStatus() != null) {
            queryWrapper.eq(IotDeviceInfo::getStatus, iotDeviceInfo.getStatus());
        }
        if (iotDeviceInfo.getCorpId() != null) {
            queryWrapper.eq(IotDeviceInfo::getCorpId, iotDeviceInfo.getCorpId());
        }
        if (iotDeviceInfo.getInstitutionId() != null) {
            queryWrapper.eq(IotDeviceInfo::getInstitutionId, iotDeviceInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getInstitutionName())) {
            queryWrapper.eq(IotDeviceInfo::getInstitutionName, iotDeviceInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(iotDeviceInfo.getRoomId())) {
            queryWrapper.eq(IotDeviceInfo::getRoomId, iotDeviceInfo.getRoomId());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param iotDeviceInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IotDeviceInfo insert(IotDeviceInfo iotDeviceInfo) {
        iotDeviceInfo.setId(null);
        getBaseMapper().insert(iotDeviceInfo);
        return iotDeviceInfo;
    }

    /**
    * 更新数据
    *
    * @param iotDeviceInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IotDeviceInfo update(IotDeviceInfo iotDeviceInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<IotDeviceInfo> chainWrapper = new LambdaUpdateChainWrapper<IotDeviceInfo>(getBaseMapper());
        if (iotDeviceInfo.getId() != null) {
            chainWrapper.set(IotDeviceInfo::getId, iotDeviceInfo.getId());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getTenantId())) {
            chainWrapper.set(IotDeviceInfo::getTenantId, iotDeviceInfo.getTenantId());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getTenantName())) {
            chainWrapper.set(IotDeviceInfo::getTenantName, iotDeviceInfo.getTenantName());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getPid())) {
            chainWrapper.set(IotDeviceInfo::getPid, iotDeviceInfo.getPid());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getBigDeviceType())) {
            chainWrapper.set(IotDeviceInfo::getBigDeviceType, iotDeviceInfo.getBigDeviceType());
        }
        if (iotDeviceInfo.getTypeId() != null) {
            chainWrapper.set(IotDeviceInfo::getTypeId, iotDeviceInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getDeviceName())) {
            chainWrapper.set(IotDeviceInfo::getDeviceName, iotDeviceInfo.getDeviceName());
        }
        if (iotDeviceInfo.getGrantId() != null) {
            chainWrapper.set(IotDeviceInfo::getGrantId, iotDeviceInfo.getGrantId());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getDeviceVersion())) {
            chainWrapper.set(IotDeviceInfo::getDeviceVersion, iotDeviceInfo.getDeviceVersion());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getDeviceSerial())) {
            chainWrapper.set(IotDeviceInfo::getDeviceSerial, iotDeviceInfo.getDeviceSerial());
        }
        if (iotDeviceInfo.getIssueState() != null) {
            chainWrapper.set(IotDeviceInfo::getIssueState, iotDeviceInfo.getIssueState());
        }
        if (iotDeviceInfo.getBattery() != null) {
            chainWrapper.set(IotDeviceInfo::getBattery, iotDeviceInfo.getBattery());
        }
        if (iotDeviceInfo.getDeviceState() != null) {
            chainWrapper.set(IotDeviceInfo::getDeviceState, iotDeviceInfo.getDeviceState());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getRemark())) {
            chainWrapper.set(IotDeviceInfo::getRemark, iotDeviceInfo.getRemark());
        }
        if (iotDeviceInfo.getCreateUser() != null) {
            chainWrapper.set(IotDeviceInfo::getCreateUser, iotDeviceInfo.getCreateUser());
        }
        if (iotDeviceInfo.getCreateDept() != null) {
            chainWrapper.set(IotDeviceInfo::getCreateDept, iotDeviceInfo.getCreateDept());
        }
        if (iotDeviceInfo.getCreateTime() != null) {
            chainWrapper.set(IotDeviceInfo::getCreateTime, iotDeviceInfo.getCreateTime());
        }
        if (iotDeviceInfo.getUpdateUser() != null) {
            chainWrapper.set(IotDeviceInfo::getUpdateUser, iotDeviceInfo.getUpdateUser());
        }
        if (iotDeviceInfo.getUpdateTime() != null) {
            chainWrapper.set(IotDeviceInfo::getUpdateTime, iotDeviceInfo.getUpdateTime());
        }
        if (iotDeviceInfo.getIsDeleted() != null) {
            chainWrapper.set(IotDeviceInfo::getIsDeleted, iotDeviceInfo.getIsDeleted());
        }
        if (iotDeviceInfo.getStatus() != null) {
            chainWrapper.set(IotDeviceInfo::getStatus, iotDeviceInfo.getStatus());
        }
        if (iotDeviceInfo.getCorpId() != null) {
            chainWrapper.set(IotDeviceInfo::getCorpId, iotDeviceInfo.getCorpId());
        }
        if (iotDeviceInfo.getInstitutionId() != null) {
            chainWrapper.set(IotDeviceInfo::getInstitutionId, iotDeviceInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getInstitutionName())) {
            chainWrapper.set(IotDeviceInfo::getInstitutionName, iotDeviceInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(iotDeviceInfo.getRoomId())) {
            chainWrapper.set(IotDeviceInfo::getRoomId, iotDeviceInfo.getRoomId());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(IotDeviceInfo::getId, iotDeviceInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(iotDeviceInfo.getId());
        } else {
            return iotDeviceInfo;
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
    public boolean saveIotDeviceInfoBatch(List<IotDeviceInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (IotDeviceInfo iotDeviceInfo : insertList) {
            //使用默认的雪花算法生成
            iotDeviceInfo.setId(null);
            //iotDeviceInfo.setCreatedDt(currentDte);
            //iotDeviceInfo.setUpdatedDt(currentDte);
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
    public Integer deleteIotDeviceInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<IotDeviceInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


