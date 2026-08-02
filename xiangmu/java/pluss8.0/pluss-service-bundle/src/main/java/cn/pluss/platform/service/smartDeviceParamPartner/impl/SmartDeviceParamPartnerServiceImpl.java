package cn.pluss.platform.service.smartDeviceParamPartner.impl;

import cn.pluss.platform.mapper.SmartDeviceParamPartnerMapper;
import cn.pluss.platform.model.entity.SmartDeviceParamPartner;
import cn.pluss.platform.service.smartDeviceParamPartner.SmartDeviceParamPartnerService;
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
@Service("smartDeviceParamPartnerService")
public class SmartDeviceParamPartnerServiceImpl extends ServiceImpl< SmartDeviceParamPartnerMapper, SmartDeviceParamPartner> implements SmartDeviceParamPartnerService {
    private static final Logger logger = LoggerFactory.getLogger(SmartDeviceParamPartnerServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartDeviceParamPartner> queryPage(Map map) {
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
    public SmartDeviceParamPartner queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceParamPartner 实例对象
    * @return 实例对象
    */
    @Override
    public SmartDeviceParamPartner queryOne(SmartDeviceParamPartner smartDeviceParamPartner){
        LambdaQueryWrapper<SmartDeviceParamPartner> queryWrapper = getQueryWrapper(smartDeviceParamPartner);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceParamPartner
    * @return
    */
    @Override
    public List<SmartDeviceParamPartner> queryList(SmartDeviceParamPartner smartDeviceParamPartner) {
        LambdaQueryWrapper<SmartDeviceParamPartner> queryWrapper = getQueryWrapper(smartDeviceParamPartner);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartDeviceParamPartner
    * @return
    */
    public static LambdaQueryWrapper<SmartDeviceParamPartner> getQueryWrapper(SmartDeviceParamPartner smartDeviceParamPartner){
        LambdaQueryWrapper<SmartDeviceParamPartner> queryWrapper = new LambdaQueryWrapper<>();
        if (smartDeviceParamPartner.getId() != null) {
            queryWrapper.eq(SmartDeviceParamPartner::getId, smartDeviceParamPartner.getId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getTenantId())) {
            queryWrapper.eq(SmartDeviceParamPartner::getTenantId, smartDeviceParamPartner.getTenantId());
        }
        if (smartDeviceParamPartner.getGrantId() != null) {
            queryWrapper.eq(SmartDeviceParamPartner::getGrantId, smartDeviceParamPartner.getGrantId());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getDeviceName())) {
            queryWrapper.eq(SmartDeviceParamPartner::getDeviceName, smartDeviceParamPartner.getDeviceName());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getDeviceSerial())) {
            queryWrapper.eq(SmartDeviceParamPartner::getDeviceSerial, smartDeviceParamPartner.getDeviceSerial());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getSosNumber())) {
            queryWrapper.eq(SmartDeviceParamPartner::getSosNumber, smartDeviceParamPartner.getSosNumber());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getFamilyNumber())) {
            queryWrapper.eq(SmartDeviceParamPartner::getFamilyNumber, smartDeviceParamPartner.getFamilyNumber());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getWhiteNumberOne())) {
            queryWrapper.eq(SmartDeviceParamPartner::getWhiteNumberOne, smartDeviceParamPartner.getWhiteNumberOne());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getWhiteNumberTwo())) {
            queryWrapper.eq(SmartDeviceParamPartner::getWhiteNumberTwo, smartDeviceParamPartner.getWhiteNumberTwo());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getWhiteNumberThree())) {
            queryWrapper.eq(SmartDeviceParamPartner::getWhiteNumberThree, smartDeviceParamPartner.getWhiteNumberThree());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getWhiteNumberFour())) {
            queryWrapper.eq(SmartDeviceParamPartner::getWhiteNumberFour, smartDeviceParamPartner.getWhiteNumberFour());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getWhiteNumberFive())) {
            queryWrapper.eq(SmartDeviceParamPartner::getWhiteNumberFive, smartDeviceParamPartner.getWhiteNumberFive());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getWhiteNumberSex())) {
            queryWrapper.eq(SmartDeviceParamPartner::getWhiteNumberSex, smartDeviceParamPartner.getWhiteNumberSex());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getWhiteNumberSeven())) {
            queryWrapper.eq(SmartDeviceParamPartner::getWhiteNumberSeven, smartDeviceParamPartner.getWhiteNumberSeven());
        }
        if (StringUtil.isNotEmpty(smartDeviceParamPartner.getRemark())) {
            queryWrapper.eq(SmartDeviceParamPartner::getRemark, smartDeviceParamPartner.getRemark());
        }
        if (smartDeviceParamPartner.getCreateUser() != null) {
            queryWrapper.eq(SmartDeviceParamPartner::getCreateUser, smartDeviceParamPartner.getCreateUser());
        }
        if (smartDeviceParamPartner.getCreateDept() != null) {
            queryWrapper.eq(SmartDeviceParamPartner::getCreateDept, smartDeviceParamPartner.getCreateDept());
        }
        if (smartDeviceParamPartner.getCreateTime() != null) {
            queryWrapper.eq(SmartDeviceParamPartner::getCreateTime, smartDeviceParamPartner.getCreateTime());
        }
        if (smartDeviceParamPartner.getUpdateUser() != null) {
            queryWrapper.eq(SmartDeviceParamPartner::getUpdateUser, smartDeviceParamPartner.getUpdateUser());
        }
        if (smartDeviceParamPartner.getUpdateTime() != null) {
            queryWrapper.eq(SmartDeviceParamPartner::getUpdateTime, smartDeviceParamPartner.getUpdateTime());
        }
        if (smartDeviceParamPartner.getIsDeleted() != null) {
            queryWrapper.eq(SmartDeviceParamPartner::getIsDeleted, smartDeviceParamPartner.getIsDeleted());
        }
        if (smartDeviceParamPartner.getStatus() != null) {
            queryWrapper.eq(SmartDeviceParamPartner::getStatus, smartDeviceParamPartner.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartDeviceParamPartner 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamPartner insert(SmartDeviceParamPartner smartDeviceParamPartner) {
        smartDeviceParamPartner.setId(null);
        getBaseMapper().insert(smartDeviceParamPartner);
        return smartDeviceParamPartner;
    }

    /**
    * 更新数据
    *
    * @param smartDeviceParamPartner 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceParamPartner update(SmartDeviceParamPartner smartDeviceParamPartner) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartDeviceParamPartner> chainWrapper = new LambdaUpdateChainWrapper<SmartDeviceParamPartner>(getBaseMapper());
        if (smartDeviceParamPartner.getId() != null) {
            chainWrapper.set(SmartDeviceParamPartner::getId, smartDeviceParamPartner.getId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getTenantId())) {
            chainWrapper.set(SmartDeviceParamPartner::getTenantId, smartDeviceParamPartner.getTenantId());
        }
        if (smartDeviceParamPartner.getGrantId() != null) {
            chainWrapper.set(SmartDeviceParamPartner::getGrantId, smartDeviceParamPartner.getGrantId());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getDeviceName())) {
            chainWrapper.set(SmartDeviceParamPartner::getDeviceName, smartDeviceParamPartner.getDeviceName());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getDeviceSerial())) {
            chainWrapper.set(SmartDeviceParamPartner::getDeviceSerial, smartDeviceParamPartner.getDeviceSerial());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getSosNumber())) {
            chainWrapper.set(SmartDeviceParamPartner::getSosNumber, smartDeviceParamPartner.getSosNumber());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getFamilyNumber())) {
            chainWrapper.set(SmartDeviceParamPartner::getFamilyNumber, smartDeviceParamPartner.getFamilyNumber());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getWhiteNumberOne())) {
            chainWrapper.set(SmartDeviceParamPartner::getWhiteNumberOne, smartDeviceParamPartner.getWhiteNumberOne());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getWhiteNumberTwo())) {
            chainWrapper.set(SmartDeviceParamPartner::getWhiteNumberTwo, smartDeviceParamPartner.getWhiteNumberTwo());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getWhiteNumberThree())) {
            chainWrapper.set(SmartDeviceParamPartner::getWhiteNumberThree, smartDeviceParamPartner.getWhiteNumberThree());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getWhiteNumberFour())) {
            chainWrapper.set(SmartDeviceParamPartner::getWhiteNumberFour, smartDeviceParamPartner.getWhiteNumberFour());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getWhiteNumberFive())) {
            chainWrapper.set(SmartDeviceParamPartner::getWhiteNumberFive, smartDeviceParamPartner.getWhiteNumberFive());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getWhiteNumberSex())) {
            chainWrapper.set(SmartDeviceParamPartner::getWhiteNumberSex, smartDeviceParamPartner.getWhiteNumberSex());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getWhiteNumberSeven())) {
            chainWrapper.set(SmartDeviceParamPartner::getWhiteNumberSeven, smartDeviceParamPartner.getWhiteNumberSeven());
        }
        if (StringUtil.isNotBlank(smartDeviceParamPartner.getRemark())) {
            chainWrapper.set(SmartDeviceParamPartner::getRemark, smartDeviceParamPartner.getRemark());
        }
        if (smartDeviceParamPartner.getCreateUser() != null) {
            chainWrapper.set(SmartDeviceParamPartner::getCreateUser, smartDeviceParamPartner.getCreateUser());
        }
        if (smartDeviceParamPartner.getCreateDept() != null) {
            chainWrapper.set(SmartDeviceParamPartner::getCreateDept, smartDeviceParamPartner.getCreateDept());
        }
        if (smartDeviceParamPartner.getCreateTime() != null) {
            chainWrapper.set(SmartDeviceParamPartner::getCreateTime, smartDeviceParamPartner.getCreateTime());
        }
        if (smartDeviceParamPartner.getUpdateUser() != null) {
            chainWrapper.set(SmartDeviceParamPartner::getUpdateUser, smartDeviceParamPartner.getUpdateUser());
        }
        if (smartDeviceParamPartner.getUpdateTime() != null) {
            chainWrapper.set(SmartDeviceParamPartner::getUpdateTime, smartDeviceParamPartner.getUpdateTime());
        }
        if (smartDeviceParamPartner.getIsDeleted() != null) {
            chainWrapper.set(SmartDeviceParamPartner::getIsDeleted, smartDeviceParamPartner.getIsDeleted());
        }
        if (smartDeviceParamPartner.getStatus() != null) {
            chainWrapper.set(SmartDeviceParamPartner::getStatus, smartDeviceParamPartner.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartDeviceParamPartner::getId, smartDeviceParamPartner.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartDeviceParamPartner.getId());
        } else {
            return smartDeviceParamPartner;
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
    public boolean saveSmartDeviceParamPartnerBatch(List<SmartDeviceParamPartner> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartDeviceParamPartner smartDeviceParamPartner : insertList) {
            //使用默认的雪花算法生成
            smartDeviceParamPartner.setId(null);
            //smartDeviceParamPartner.setCreatedDt(currentDte);
            //smartDeviceParamPartner.setUpdatedDt(currentDte);
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
    public Integer deleteSmartDeviceParamPartnerBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartDeviceParamPartner> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


