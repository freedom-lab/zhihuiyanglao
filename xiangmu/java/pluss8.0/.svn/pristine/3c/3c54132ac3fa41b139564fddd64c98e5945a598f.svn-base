package cn.pluss.platform.service.smartDeviceGrant.impl;

import cn.pluss.platform.mapper.SmartDeviceGrantMapper;
import cn.pluss.platform.model.entity.SmartDeviceGrant;
import cn.pluss.platform.service.smartDeviceGrant.SmartDeviceGrantService;
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
@Service("smartDeviceGrantService")
public class SmartDeviceGrantServiceImpl extends ServiceImpl< SmartDeviceGrantMapper, SmartDeviceGrant> implements SmartDeviceGrantService {
    private static final Logger logger = LoggerFactory.getLogger(SmartDeviceGrantServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartDeviceGrant> queryPage(Map map) {
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
    public SmartDeviceGrant queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceGrant 实例对象
    * @return 实例对象
    */
    @Override
    public SmartDeviceGrant queryOne(SmartDeviceGrant smartDeviceGrant){
        LambdaQueryWrapper<SmartDeviceGrant> queryWrapper = getQueryWrapper(smartDeviceGrant);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceGrant
    * @return
    */
    @Override
    public List<SmartDeviceGrant> queryList(SmartDeviceGrant smartDeviceGrant) {
        LambdaQueryWrapper<SmartDeviceGrant> queryWrapper = getQueryWrapper(smartDeviceGrant);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartDeviceGrant
    * @return
    */
    public static LambdaQueryWrapper<SmartDeviceGrant> getQueryWrapper(SmartDeviceGrant smartDeviceGrant){
        LambdaQueryWrapper<SmartDeviceGrant> queryWrapper = new LambdaQueryWrapper<>();
        if (smartDeviceGrant.getId() != null) {
            queryWrapper.eq(SmartDeviceGrant::getId, smartDeviceGrant.getId());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getTenantId())) {
            queryWrapper.eq(SmartDeviceGrant::getTenantId, smartDeviceGrant.getTenantId());
        }
        if (smartDeviceGrant.getCorpId() != null) {
            queryWrapper.eq(SmartDeviceGrant::getCorpId, smartDeviceGrant.getCorpId());
        }
        if (smartDeviceGrant.getInstitutionId() != null) {
            queryWrapper.eq(SmartDeviceGrant::getInstitutionId, smartDeviceGrant.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getInstitutionName())) {
            queryWrapper.eq(SmartDeviceGrant::getInstitutionName, smartDeviceGrant.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getInstitutionCode())) {
            queryWrapper.eq(SmartDeviceGrant::getInstitutionCode, smartDeviceGrant.getInstitutionCode());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getBigDeviceType())) {
            queryWrapper.eq(SmartDeviceGrant::getBigDeviceType, smartDeviceGrant.getBigDeviceType());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getPid())) {
            queryWrapper.eq(SmartDeviceGrant::getPid, smartDeviceGrant.getPid());
        }
        if (smartDeviceGrant.getTypeId() != null) {
            queryWrapper.eq(SmartDeviceGrant::getTypeId, smartDeviceGrant.getTypeId());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getDeviceName())) {
            queryWrapper.eq(SmartDeviceGrant::getDeviceName, smartDeviceGrant.getDeviceName());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getDeviceSerial())) {
            queryWrapper.eq(SmartDeviceGrant::getDeviceSerial, smartDeviceGrant.getDeviceSerial());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getIsOnline())) {
            queryWrapper.eq(SmartDeviceGrant::getIsOnline, smartDeviceGrant.getIsOnline());
        }
        if (smartDeviceGrant.getBattery() != null) {
            queryWrapper.eq(SmartDeviceGrant::getBattery, smartDeviceGrant.getBattery());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getSynStatus())) {
            queryWrapper.eq(SmartDeviceGrant::getSynStatus, smartDeviceGrant.getSynStatus());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getGrantType())) {
            queryWrapper.eq(SmartDeviceGrant::getGrantType, smartDeviceGrant.getGrantType());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getSceneType())) {
            queryWrapper.eq(SmartDeviceGrant::getSceneType, smartDeviceGrant.getSceneType());
        }
        if (smartDeviceGrant.getElderId() != null) {
            queryWrapper.eq(SmartDeviceGrant::getElderId, smartDeviceGrant.getElderId());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getElderName())) {
            queryWrapper.eq(SmartDeviceGrant::getElderName, smartDeviceGrant.getElderName());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getIdCard())) {
            queryWrapper.eq(SmartDeviceGrant::getIdCard, smartDeviceGrant.getIdCard());
        }
        if (smartDeviceGrant.getRoomId() != null) {
            queryWrapper.eq(SmartDeviceGrant::getRoomId, smartDeviceGrant.getRoomId());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getRoomName())) {
            queryWrapper.eq(SmartDeviceGrant::getRoomName, smartDeviceGrant.getRoomName());
        }
        if (smartDeviceGrant.getBedId() != null) {
            queryWrapper.eq(SmartDeviceGrant::getBedId, smartDeviceGrant.getBedId());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getBedName())) {
            queryWrapper.eq(SmartDeviceGrant::getBedName, smartDeviceGrant.getBedName());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getGrantLocation())) {
            queryWrapper.eq(SmartDeviceGrant::getGrantLocation, smartDeviceGrant.getGrantLocation());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getImg())) {
            queryWrapper.eq(SmartDeviceGrant::getImg, smartDeviceGrant.getImg());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getParam())) {
            queryWrapper.eq(SmartDeviceGrant::getParam, smartDeviceGrant.getParam());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getDeviceVersion())) {
            queryWrapper.eq(SmartDeviceGrant::getDeviceVersion, smartDeviceGrant.getDeviceVersion());
        }
        if (smartDeviceGrant.getBelongInstitutionType() != null) {
            queryWrapper.eq(SmartDeviceGrant::getBelongInstitutionType, smartDeviceGrant.getBelongInstitutionType());
        }
        if (smartDeviceGrant.getAreaCode() != null) {
            queryWrapper.eq(SmartDeviceGrant::getAreaCode, smartDeviceGrant.getAreaCode());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getAreaName())) {
            queryWrapper.eq(SmartDeviceGrant::getAreaName, smartDeviceGrant.getAreaName());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getRemark())) {
            queryWrapper.eq(SmartDeviceGrant::getRemark, smartDeviceGrant.getRemark());
        }
        if (smartDeviceGrant.getCreateUser() != null) {
            queryWrapper.eq(SmartDeviceGrant::getCreateUser, smartDeviceGrant.getCreateUser());
        }
        if (StringUtil.isNotEmpty(smartDeviceGrant.getCreateName())) {
            queryWrapper.eq(SmartDeviceGrant::getCreateName, smartDeviceGrant.getCreateName());
        }
        if (smartDeviceGrant.getCreateDept() != null) {
            queryWrapper.eq(SmartDeviceGrant::getCreateDept, smartDeviceGrant.getCreateDept());
        }
        if (smartDeviceGrant.getCreateTime() != null) {
            queryWrapper.eq(SmartDeviceGrant::getCreateTime, smartDeviceGrant.getCreateTime());
        }
        if (smartDeviceGrant.getUpdateUser() != null) {
            queryWrapper.eq(SmartDeviceGrant::getUpdateUser, smartDeviceGrant.getUpdateUser());
        }
        if (smartDeviceGrant.getUpdateTime() != null) {
            queryWrapper.eq(SmartDeviceGrant::getUpdateTime, smartDeviceGrant.getUpdateTime());
        }
        if (smartDeviceGrant.getIsDeleted() != null) {
            queryWrapper.eq(SmartDeviceGrant::getIsDeleted, smartDeviceGrant.getIsDeleted());
        }
        if (smartDeviceGrant.getStatus() != null) {
            queryWrapper.eq(SmartDeviceGrant::getStatus, smartDeviceGrant.getStatus());
        }
        if (smartDeviceGrant.getGspState() != null) {
            queryWrapper.eq(SmartDeviceGrant::getGspState, smartDeviceGrant.getGspState());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartDeviceGrant 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceGrant insert(SmartDeviceGrant smartDeviceGrant) {
        smartDeviceGrant.setId(null);
        getBaseMapper().insert(smartDeviceGrant);
        return smartDeviceGrant;
    }

    /**
    * 更新数据
    *
    * @param smartDeviceGrant 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceGrant update(SmartDeviceGrant smartDeviceGrant) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartDeviceGrant> chainWrapper = new LambdaUpdateChainWrapper<SmartDeviceGrant>(getBaseMapper());
        if (smartDeviceGrant.getId() != null) {
            chainWrapper.set(SmartDeviceGrant::getId, smartDeviceGrant.getId());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getTenantId())) {
            chainWrapper.set(SmartDeviceGrant::getTenantId, smartDeviceGrant.getTenantId());
        }
        if (smartDeviceGrant.getCorpId() != null) {
            chainWrapper.set(SmartDeviceGrant::getCorpId, smartDeviceGrant.getCorpId());
        }
        if (smartDeviceGrant.getInstitutionId() != null) {
            chainWrapper.set(SmartDeviceGrant::getInstitutionId, smartDeviceGrant.getInstitutionId());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getInstitutionName())) {
            chainWrapper.set(SmartDeviceGrant::getInstitutionName, smartDeviceGrant.getInstitutionName());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getInstitutionCode())) {
            chainWrapper.set(SmartDeviceGrant::getInstitutionCode, smartDeviceGrant.getInstitutionCode());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getBigDeviceType())) {
            chainWrapper.set(SmartDeviceGrant::getBigDeviceType, smartDeviceGrant.getBigDeviceType());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getPid())) {
            chainWrapper.set(SmartDeviceGrant::getPid, smartDeviceGrant.getPid());
        }
        if (smartDeviceGrant.getTypeId() != null) {
            chainWrapper.set(SmartDeviceGrant::getTypeId, smartDeviceGrant.getTypeId());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getDeviceName())) {
            chainWrapper.set(SmartDeviceGrant::getDeviceName, smartDeviceGrant.getDeviceName());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getDeviceSerial())) {
            chainWrapper.set(SmartDeviceGrant::getDeviceSerial, smartDeviceGrant.getDeviceSerial());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getIsOnline())) {
            chainWrapper.set(SmartDeviceGrant::getIsOnline, smartDeviceGrant.getIsOnline());
        }
        if (smartDeviceGrant.getBattery() != null) {
            chainWrapper.set(SmartDeviceGrant::getBattery, smartDeviceGrant.getBattery());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getSynStatus())) {
            chainWrapper.set(SmartDeviceGrant::getSynStatus, smartDeviceGrant.getSynStatus());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getGrantType())) {
            chainWrapper.set(SmartDeviceGrant::getGrantType, smartDeviceGrant.getGrantType());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getSceneType())) {
            chainWrapper.set(SmartDeviceGrant::getSceneType, smartDeviceGrant.getSceneType());
        }
        if (smartDeviceGrant.getElderId() != null) {
            chainWrapper.set(SmartDeviceGrant::getElderId, smartDeviceGrant.getElderId());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getElderName())) {
            chainWrapper.set(SmartDeviceGrant::getElderName, smartDeviceGrant.getElderName());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getIdCard())) {
            chainWrapper.set(SmartDeviceGrant::getIdCard, smartDeviceGrant.getIdCard());
        }
        if (smartDeviceGrant.getRoomId() != null) {
            chainWrapper.set(SmartDeviceGrant::getRoomId, smartDeviceGrant.getRoomId());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getRoomName())) {
            chainWrapper.set(SmartDeviceGrant::getRoomName, smartDeviceGrant.getRoomName());
        }
        if (smartDeviceGrant.getBedId() != null) {
            chainWrapper.set(SmartDeviceGrant::getBedId, smartDeviceGrant.getBedId());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getBedName())) {
            chainWrapper.set(SmartDeviceGrant::getBedName, smartDeviceGrant.getBedName());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getGrantLocation())) {
            chainWrapper.set(SmartDeviceGrant::getGrantLocation, smartDeviceGrant.getGrantLocation());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getImg())) {
            chainWrapper.set(SmartDeviceGrant::getImg, smartDeviceGrant.getImg());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getParam())) {
            chainWrapper.set(SmartDeviceGrant::getParam, smartDeviceGrant.getParam());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getDeviceVersion())) {
            chainWrapper.set(SmartDeviceGrant::getDeviceVersion, smartDeviceGrant.getDeviceVersion());
        }
        if (smartDeviceGrant.getBelongInstitutionType() != null) {
            chainWrapper.set(SmartDeviceGrant::getBelongInstitutionType, smartDeviceGrant.getBelongInstitutionType());
        }
        if (smartDeviceGrant.getAreaCode() != null) {
            chainWrapper.set(SmartDeviceGrant::getAreaCode, smartDeviceGrant.getAreaCode());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getAreaName())) {
            chainWrapper.set(SmartDeviceGrant::getAreaName, smartDeviceGrant.getAreaName());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getRemark())) {
            chainWrapper.set(SmartDeviceGrant::getRemark, smartDeviceGrant.getRemark());
        }
        if (smartDeviceGrant.getCreateUser() != null) {
            chainWrapper.set(SmartDeviceGrant::getCreateUser, smartDeviceGrant.getCreateUser());
        }
        if (StringUtil.isNotBlank(smartDeviceGrant.getCreateName())) {
            chainWrapper.set(SmartDeviceGrant::getCreateName, smartDeviceGrant.getCreateName());
        }
        if (smartDeviceGrant.getCreateDept() != null) {
            chainWrapper.set(SmartDeviceGrant::getCreateDept, smartDeviceGrant.getCreateDept());
        }
        if (smartDeviceGrant.getCreateTime() != null) {
            chainWrapper.set(SmartDeviceGrant::getCreateTime, smartDeviceGrant.getCreateTime());
        }
        if (smartDeviceGrant.getUpdateUser() != null) {
            chainWrapper.set(SmartDeviceGrant::getUpdateUser, smartDeviceGrant.getUpdateUser());
        }
        if (smartDeviceGrant.getUpdateTime() != null) {
            chainWrapper.set(SmartDeviceGrant::getUpdateTime, smartDeviceGrant.getUpdateTime());
        }
        if (smartDeviceGrant.getIsDeleted() != null) {
            chainWrapper.set(SmartDeviceGrant::getIsDeleted, smartDeviceGrant.getIsDeleted());
        }
        if (smartDeviceGrant.getStatus() != null) {
            chainWrapper.set(SmartDeviceGrant::getStatus, smartDeviceGrant.getStatus());
        }
        if (smartDeviceGrant.getGspState() != null) {
            chainWrapper.set(SmartDeviceGrant::getGspState, smartDeviceGrant.getGspState());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartDeviceGrant::getId, smartDeviceGrant.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartDeviceGrant.getId());
        } else {
            return smartDeviceGrant;
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
    public boolean saveSmartDeviceGrantBatch(List<SmartDeviceGrant> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartDeviceGrant smartDeviceGrant : insertList) {
            //使用默认的雪花算法生成
            smartDeviceGrant.setId(null);
            //smartDeviceGrant.setCreatedDt(currentDte);
            //smartDeviceGrant.setUpdatedDt(currentDte);
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
    public Integer deleteSmartDeviceGrantBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartDeviceGrant> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


