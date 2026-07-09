package cn.pluss.platform.service.smartDeviceArchive.impl;

import cn.pluss.platform.mapper.SmartDeviceArchiveMapper;
import cn.pluss.platform.model.entity.SmartDeviceArchive;
import cn.pluss.platform.service.smartDeviceArchive.SmartDeviceArchiveService;
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
@Service("smartDeviceArchiveService")
public class SmartDeviceArchiveServiceImpl extends ServiceImpl< SmartDeviceArchiveMapper, SmartDeviceArchive> implements SmartDeviceArchiveService {
    private static final Logger logger = LoggerFactory.getLogger(SmartDeviceArchiveServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartDeviceArchive> queryPage(Map map) {
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
    public SmartDeviceArchive queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceArchive 实例对象
    * @return 实例对象
    */
    @Override
    public SmartDeviceArchive queryOne(SmartDeviceArchive smartDeviceArchive){
        LambdaQueryWrapper<SmartDeviceArchive> queryWrapper = getQueryWrapper(smartDeviceArchive);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceArchive
    * @return
    */
    @Override
    public List<SmartDeviceArchive> queryList(SmartDeviceArchive smartDeviceArchive) {
        LambdaQueryWrapper<SmartDeviceArchive> queryWrapper = getQueryWrapper(smartDeviceArchive);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartDeviceArchive
    * @return
    */
    public static LambdaQueryWrapper<SmartDeviceArchive> getQueryWrapper(SmartDeviceArchive smartDeviceArchive){
        LambdaQueryWrapper<SmartDeviceArchive> queryWrapper = new LambdaQueryWrapper<>();
        if (smartDeviceArchive.getId() != null) {
            queryWrapper.eq(SmartDeviceArchive::getId, smartDeviceArchive.getId());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getTenantId())) {
            queryWrapper.eq(SmartDeviceArchive::getTenantId, smartDeviceArchive.getTenantId());
        }
        if (smartDeviceArchive.getCorpId() != null) {
            queryWrapper.eq(SmartDeviceArchive::getCorpId, smartDeviceArchive.getCorpId());
        }
        if (smartDeviceArchive.getInstitutionId() != null) {
            queryWrapper.eq(SmartDeviceArchive::getInstitutionId, smartDeviceArchive.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getInstitutionName())) {
            queryWrapper.eq(SmartDeviceArchive::getInstitutionName, smartDeviceArchive.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getBigDeviceType())) {
            queryWrapper.eq(SmartDeviceArchive::getBigDeviceType, smartDeviceArchive.getBigDeviceType());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getPid())) {
            queryWrapper.eq(SmartDeviceArchive::getPid, smartDeviceArchive.getPid());
        }
        if (smartDeviceArchive.getTypeId() != null) {
            queryWrapper.eq(SmartDeviceArchive::getTypeId, smartDeviceArchive.getTypeId());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getDeviceName())) {
            queryWrapper.eq(SmartDeviceArchive::getDeviceName, smartDeviceArchive.getDeviceName());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getDeviceSerial())) {
            queryWrapper.eq(SmartDeviceArchive::getDeviceSerial, smartDeviceArchive.getDeviceSerial());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getDeviceVersion())) {
            queryWrapper.eq(SmartDeviceArchive::getDeviceVersion, smartDeviceArchive.getDeviceVersion());
        }
        if (smartDeviceArchive.getIssueState() != null) {
            queryWrapper.eq(SmartDeviceArchive::getIssueState, smartDeviceArchive.getIssueState());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getImg())) {
            queryWrapper.eq(SmartDeviceArchive::getImg, smartDeviceArchive.getImg());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getParam())) {
            queryWrapper.eq(SmartDeviceArchive::getParam, smartDeviceArchive.getParam());
        }
        if (smartDeviceArchive.getAreaCode() != null) {
            queryWrapper.eq(SmartDeviceArchive::getAreaCode, smartDeviceArchive.getAreaCode());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getAreaName())) {
            queryWrapper.eq(SmartDeviceArchive::getAreaName, smartDeviceArchive.getAreaName());
        }
        if (StringUtil.isNotEmpty(smartDeviceArchive.getRemark())) {
            queryWrapper.eq(SmartDeviceArchive::getRemark, smartDeviceArchive.getRemark());
        }
        if (smartDeviceArchive.getCreateUser() != null) {
            queryWrapper.eq(SmartDeviceArchive::getCreateUser, smartDeviceArchive.getCreateUser());
        }
        if (smartDeviceArchive.getCreateDept() != null) {
            queryWrapper.eq(SmartDeviceArchive::getCreateDept, smartDeviceArchive.getCreateDept());
        }
        if (smartDeviceArchive.getCreateTime() != null) {
            queryWrapper.eq(SmartDeviceArchive::getCreateTime, smartDeviceArchive.getCreateTime());
        }
        if (smartDeviceArchive.getUpdateUser() != null) {
            queryWrapper.eq(SmartDeviceArchive::getUpdateUser, smartDeviceArchive.getUpdateUser());
        }
        if (smartDeviceArchive.getUpdateTime() != null) {
            queryWrapper.eq(SmartDeviceArchive::getUpdateTime, smartDeviceArchive.getUpdateTime());
        }
        if (smartDeviceArchive.getIsDeleted() != null) {
            queryWrapper.eq(SmartDeviceArchive::getIsDeleted, smartDeviceArchive.getIsDeleted());
        }
        if (smartDeviceArchive.getStatus() != null) {
            queryWrapper.eq(SmartDeviceArchive::getStatus, smartDeviceArchive.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartDeviceArchive 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceArchive insert(SmartDeviceArchive smartDeviceArchive) {
        smartDeviceArchive.setId(null);
        getBaseMapper().insert(smartDeviceArchive);
        return smartDeviceArchive;
    }

    /**
    * 更新数据
    *
    * @param smartDeviceArchive 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceArchive update(SmartDeviceArchive smartDeviceArchive) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartDeviceArchive> chainWrapper = new LambdaUpdateChainWrapper<SmartDeviceArchive>(getBaseMapper());
        if (smartDeviceArchive.getId() != null) {
            chainWrapper.set(SmartDeviceArchive::getId, smartDeviceArchive.getId());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getTenantId())) {
            chainWrapper.set(SmartDeviceArchive::getTenantId, smartDeviceArchive.getTenantId());
        }
        if (smartDeviceArchive.getCorpId() != null) {
            chainWrapper.set(SmartDeviceArchive::getCorpId, smartDeviceArchive.getCorpId());
        }
        if (smartDeviceArchive.getInstitutionId() != null) {
            chainWrapper.set(SmartDeviceArchive::getInstitutionId, smartDeviceArchive.getInstitutionId());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getInstitutionName())) {
            chainWrapper.set(SmartDeviceArchive::getInstitutionName, smartDeviceArchive.getInstitutionName());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getBigDeviceType())) {
            chainWrapper.set(SmartDeviceArchive::getBigDeviceType, smartDeviceArchive.getBigDeviceType());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getPid())) {
            chainWrapper.set(SmartDeviceArchive::getPid, smartDeviceArchive.getPid());
        }
        if (smartDeviceArchive.getTypeId() != null) {
            chainWrapper.set(SmartDeviceArchive::getTypeId, smartDeviceArchive.getTypeId());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getDeviceName())) {
            chainWrapper.set(SmartDeviceArchive::getDeviceName, smartDeviceArchive.getDeviceName());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getDeviceSerial())) {
            chainWrapper.set(SmartDeviceArchive::getDeviceSerial, smartDeviceArchive.getDeviceSerial());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getDeviceVersion())) {
            chainWrapper.set(SmartDeviceArchive::getDeviceVersion, smartDeviceArchive.getDeviceVersion());
        }
        if (smartDeviceArchive.getIssueState() != null) {
            chainWrapper.set(SmartDeviceArchive::getIssueState, smartDeviceArchive.getIssueState());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getImg())) {
            chainWrapper.set(SmartDeviceArchive::getImg, smartDeviceArchive.getImg());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getParam())) {
            chainWrapper.set(SmartDeviceArchive::getParam, smartDeviceArchive.getParam());
        }
        if (smartDeviceArchive.getAreaCode() != null) {
            chainWrapper.set(SmartDeviceArchive::getAreaCode, smartDeviceArchive.getAreaCode());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getAreaName())) {
            chainWrapper.set(SmartDeviceArchive::getAreaName, smartDeviceArchive.getAreaName());
        }
        if (StringUtil.isNotBlank(smartDeviceArchive.getRemark())) {
            chainWrapper.set(SmartDeviceArchive::getRemark, smartDeviceArchive.getRemark());
        }
        if (smartDeviceArchive.getCreateUser() != null) {
            chainWrapper.set(SmartDeviceArchive::getCreateUser, smartDeviceArchive.getCreateUser());
        }
        if (smartDeviceArchive.getCreateDept() != null) {
            chainWrapper.set(SmartDeviceArchive::getCreateDept, smartDeviceArchive.getCreateDept());
        }
        if (smartDeviceArchive.getCreateTime() != null) {
            chainWrapper.set(SmartDeviceArchive::getCreateTime, smartDeviceArchive.getCreateTime());
        }
        if (smartDeviceArchive.getUpdateUser() != null) {
            chainWrapper.set(SmartDeviceArchive::getUpdateUser, smartDeviceArchive.getUpdateUser());
        }
        if (smartDeviceArchive.getUpdateTime() != null) {
            chainWrapper.set(SmartDeviceArchive::getUpdateTime, smartDeviceArchive.getUpdateTime());
        }
        if (smartDeviceArchive.getIsDeleted() != null) {
            chainWrapper.set(SmartDeviceArchive::getIsDeleted, smartDeviceArchive.getIsDeleted());
        }
        if (smartDeviceArchive.getStatus() != null) {
            chainWrapper.set(SmartDeviceArchive::getStatus, smartDeviceArchive.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartDeviceArchive::getId, smartDeviceArchive.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartDeviceArchive.getId());
        } else {
            return smartDeviceArchive;
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
    public boolean saveSmartDeviceArchiveBatch(List<SmartDeviceArchive> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartDeviceArchive smartDeviceArchive : insertList) {
            //使用默认的雪花算法生成
            smartDeviceArchive.setId(null);
            //smartDeviceArchive.setCreatedDt(currentDte);
            //smartDeviceArchive.setUpdatedDt(currentDte);
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
    public Integer deleteSmartDeviceArchiveBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartDeviceArchive> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


