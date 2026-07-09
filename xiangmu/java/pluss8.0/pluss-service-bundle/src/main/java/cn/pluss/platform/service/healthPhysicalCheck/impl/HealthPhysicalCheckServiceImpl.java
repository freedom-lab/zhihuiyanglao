package cn.pluss.platform.service.healthPhysicalCheck.impl;

import cn.pluss.platform.mapper.HealthPhysicalCheckMapper;
import cn.pluss.platform.model.entity.HealthPhysicalCheck;
import cn.pluss.platform.service.healthPhysicalCheck.HealthPhysicalCheckService;
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
@Service("healthPhysicalCheckService")
public class HealthPhysicalCheckServiceImpl extends ServiceImpl< HealthPhysicalCheckMapper, HealthPhysicalCheck> implements HealthPhysicalCheckService {
    private static final Logger logger = LoggerFactory.getLogger(HealthPhysicalCheckServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthPhysicalCheck> queryPage(Map map) {
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
    public HealthPhysicalCheck queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthPhysicalCheck 实例对象
    * @return 实例对象
    */
    @Override
    public HealthPhysicalCheck queryOne(HealthPhysicalCheck healthPhysicalCheck){
        LambdaQueryWrapper<HealthPhysicalCheck> queryWrapper = getQueryWrapper(healthPhysicalCheck);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthPhysicalCheck
    * @return
    */
    @Override
    public List<HealthPhysicalCheck> queryList(HealthPhysicalCheck healthPhysicalCheck) {
        LambdaQueryWrapper<HealthPhysicalCheck> queryWrapper = getQueryWrapper(healthPhysicalCheck);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthPhysicalCheck
    * @return
    */
    public static LambdaQueryWrapper<HealthPhysicalCheck> getQueryWrapper(HealthPhysicalCheck healthPhysicalCheck){
        LambdaQueryWrapper<HealthPhysicalCheck> queryWrapper = new LambdaQueryWrapper<>();
        if (healthPhysicalCheck.getId() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getId, healthPhysicalCheck.getId());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getTenantId())) {
            queryWrapper.eq(HealthPhysicalCheck::getTenantId, healthPhysicalCheck.getTenantId());
        }
        if (healthPhysicalCheck.getElderId() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getElderId, healthPhysicalCheck.getElderId());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getElderName())) {
            queryWrapper.eq(HealthPhysicalCheck::getElderName, healthPhysicalCheck.getElderName());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getIdCard())) {
            queryWrapper.eq(HealthPhysicalCheck::getIdCard, healthPhysicalCheck.getIdCard());
        }
        if (healthPhysicalCheck.getAge() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getAge, healthPhysicalCheck.getAge());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getSex())) {
            queryWrapper.eq(HealthPhysicalCheck::getSex, healthPhysicalCheck.getSex());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getBirthday())) {
            queryWrapper.eq(HealthPhysicalCheck::getBirthday, healthPhysicalCheck.getBirthday());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getRecentSymptom())) {
            queryWrapper.eq(HealthPhysicalCheck::getRecentSymptom, healthPhysicalCheck.getRecentSymptom());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getSleepTime())) {
            queryWrapper.eq(HealthPhysicalCheck::getSleepTime, healthPhysicalCheck.getSleepTime());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getTemperature())) {
            queryWrapper.eq(HealthPhysicalCheck::getTemperature, healthPhysicalCheck.getTemperature());
        }
        if (healthPhysicalCheck.getPulse() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getPulse, healthPhysicalCheck.getPulse());
        }
        if (healthPhysicalCheck.getBreathe() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getBreathe, healthPhysicalCheck.getBreathe());
        }
        if (healthPhysicalCheck.getHighPressure() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getHighPressure, healthPhysicalCheck.getHighPressure());
        }
        if (healthPhysicalCheck.getLowPressure() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getLowPressure, healthPhysicalCheck.getLowPressure());
        }
        if (healthPhysicalCheck.getHeight() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getHeight, healthPhysicalCheck.getHeight());
        }
        if (healthPhysicalCheck.getWeight() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getWeight, healthPhysicalCheck.getWeight());
        }
        if (healthPhysicalCheck.getWaistline() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getWaistline, healthPhysicalCheck.getWaistline());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getSelfAssessment())) {
            queryWrapper.eq(HealthPhysicalCheck::getSelfAssessment, healthPhysicalCheck.getSelfAssessment());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getSelfDesp())) {
            queryWrapper.eq(HealthPhysicalCheck::getSelfDesp, healthPhysicalCheck.getSelfDesp());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getSkinStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getSkinStatus, healthPhysicalCheck.getSkinStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getSkinDesp())) {
            queryWrapper.eq(HealthPhysicalCheck::getSkinDesp, healthPhysicalCheck.getSkinDesp());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getLymphStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getLymphStatus, healthPhysicalCheck.getLymphStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getLymphDesp())) {
            queryWrapper.eq(HealthPhysicalCheck::getLymphDesp, healthPhysicalCheck.getLymphDesp());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getLipsStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getLipsStatus, healthPhysicalCheck.getLipsStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getToothStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getToothStatus, healthPhysicalCheck.getToothStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getThroatStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getThroatStatus, healthPhysicalCheck.getThroatStatus());
        }
        if (healthPhysicalCheck.getLeftEyesight() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getLeftEyesight, healthPhysicalCheck.getLeftEyesight());
        }
        if (healthPhysicalCheck.getRightEyesight() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getRightEyesight, healthPhysicalCheck.getRightEyesight());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getListeningStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getListeningStatus, healthPhysicalCheck.getListeningStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getEarNoseStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getEarNoseStatus, healthPhysicalCheck.getEarNoseStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getEyeStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getEyeStatus, healthPhysicalCheck.getEyeStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getChestShape())) {
            queryWrapper.eq(HealthPhysicalCheck::getChestShape, healthPhysicalCheck.getChestShape());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getChestPercussion())) {
            queryWrapper.eq(HealthPhysicalCheck::getChestPercussion, healthPhysicalCheck.getChestPercussion());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getChestSounds())) {
            queryWrapper.eq(HealthPhysicalCheck::getChestSounds, healthPhysicalCheck.getChestSounds());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getHeartStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getHeartStatus, healthPhysicalCheck.getHeartStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getHeartRate())) {
            queryWrapper.eq(HealthPhysicalCheck::getHeartRate, healthPhysicalCheck.getHeartRate());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getHeartRhythm())) {
            queryWrapper.eq(HealthPhysicalCheck::getHeartRhythm, healthPhysicalCheck.getHeartRhythm());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getHeartSounds())) {
            queryWrapper.eq(HealthPhysicalCheck::getHeartSounds, healthPhysicalCheck.getHeartSounds());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getAbdomenStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getAbdomenStatus, healthPhysicalCheck.getAbdomenStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getAbdomenDesp())) {
            queryWrapper.eq(HealthPhysicalCheck::getAbdomenDesp, healthPhysicalCheck.getAbdomenDesp());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getArmsSkin())) {
            queryWrapper.eq(HealthPhysicalCheck::getArmsSkin, healthPhysicalCheck.getArmsSkin());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getArmsSkinDesp())) {
            queryWrapper.eq(HealthPhysicalCheck::getArmsSkinDesp, healthPhysicalCheck.getArmsSkinDesp());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getCanTouch())) {
            queryWrapper.eq(HealthPhysicalCheck::getCanTouch, healthPhysicalCheck.getCanTouch());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getNoTouch())) {
            queryWrapper.eq(HealthPhysicalCheck::getNoTouch, healthPhysicalCheck.getNoTouch());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getAnusStatus())) {
            queryWrapper.eq(HealthPhysicalCheck::getAnusStatus, healthPhysicalCheck.getAnusStatus());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getWomanCheck())) {
            queryWrapper.eq(HealthPhysicalCheck::getWomanCheck, healthPhysicalCheck.getWomanCheck());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getCheckFile())) {
            queryWrapper.eq(HealthPhysicalCheck::getCheckFile, healthPhysicalCheck.getCheckFile());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getCheckResult())) {
            queryWrapper.eq(HealthPhysicalCheck::getCheckResult, healthPhysicalCheck.getCheckResult());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getPhysicalState())) {
            queryWrapper.eq(HealthPhysicalCheck::getPhysicalState, healthPhysicalCheck.getPhysicalState());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getHospitalName())) {
            queryWrapper.eq(HealthPhysicalCheck::getHospitalName, healthPhysicalCheck.getHospitalName());
        }
        if (healthPhysicalCheck.getAreaCode() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getAreaCode, healthPhysicalCheck.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthPhysicalCheck.getAreaName())) {
            queryWrapper.eq(HealthPhysicalCheck::getAreaName, healthPhysicalCheck.getAreaName());
        }
        if (healthPhysicalCheck.getCreateUser() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getCreateUser, healthPhysicalCheck.getCreateUser());
        }
        if (healthPhysicalCheck.getCreateDept() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getCreateDept, healthPhysicalCheck.getCreateDept());
        }
        if (healthPhysicalCheck.getCreateTime() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getCreateTime, healthPhysicalCheck.getCreateTime());
        }
        if (healthPhysicalCheck.getUpdateUser() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getUpdateUser, healthPhysicalCheck.getUpdateUser());
        }
        if (healthPhysicalCheck.getUpdateTime() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getUpdateTime, healthPhysicalCheck.getUpdateTime());
        }
        if (healthPhysicalCheck.getStatus() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getStatus, healthPhysicalCheck.getStatus());
        }
        if (healthPhysicalCheck.getIsDeleted() != null) {
            queryWrapper.eq(HealthPhysicalCheck::getIsDeleted, healthPhysicalCheck.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthPhysicalCheck 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthPhysicalCheck insert(HealthPhysicalCheck healthPhysicalCheck) {
        healthPhysicalCheck.setId(null);
        getBaseMapper().insert(healthPhysicalCheck);
        return healthPhysicalCheck;
    }

    /**
    * 更新数据
    *
    * @param healthPhysicalCheck 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthPhysicalCheck update(HealthPhysicalCheck healthPhysicalCheck) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthPhysicalCheck> chainWrapper = new LambdaUpdateChainWrapper<HealthPhysicalCheck>(getBaseMapper());
        if (healthPhysicalCheck.getId() != null) {
            chainWrapper.set(HealthPhysicalCheck::getId, healthPhysicalCheck.getId());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getTenantId())) {
            chainWrapper.set(HealthPhysicalCheck::getTenantId, healthPhysicalCheck.getTenantId());
        }
        if (healthPhysicalCheck.getElderId() != null) {
            chainWrapper.set(HealthPhysicalCheck::getElderId, healthPhysicalCheck.getElderId());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getElderName())) {
            chainWrapper.set(HealthPhysicalCheck::getElderName, healthPhysicalCheck.getElderName());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getIdCard())) {
            chainWrapper.set(HealthPhysicalCheck::getIdCard, healthPhysicalCheck.getIdCard());
        }
        if (healthPhysicalCheck.getAge() != null) {
            chainWrapper.set(HealthPhysicalCheck::getAge, healthPhysicalCheck.getAge());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getSex())) {
            chainWrapper.set(HealthPhysicalCheck::getSex, healthPhysicalCheck.getSex());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getBirthday())) {
            chainWrapper.set(HealthPhysicalCheck::getBirthday, healthPhysicalCheck.getBirthday());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getRecentSymptom())) {
            chainWrapper.set(HealthPhysicalCheck::getRecentSymptom, healthPhysicalCheck.getRecentSymptom());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getSleepTime())) {
            chainWrapper.set(HealthPhysicalCheck::getSleepTime, healthPhysicalCheck.getSleepTime());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getTemperature())) {
            chainWrapper.set(HealthPhysicalCheck::getTemperature, healthPhysicalCheck.getTemperature());
        }
        if (healthPhysicalCheck.getPulse() != null) {
            chainWrapper.set(HealthPhysicalCheck::getPulse, healthPhysicalCheck.getPulse());
        }
        if (healthPhysicalCheck.getBreathe() != null) {
            chainWrapper.set(HealthPhysicalCheck::getBreathe, healthPhysicalCheck.getBreathe());
        }
        if (healthPhysicalCheck.getHighPressure() != null) {
            chainWrapper.set(HealthPhysicalCheck::getHighPressure, healthPhysicalCheck.getHighPressure());
        }
        if (healthPhysicalCheck.getLowPressure() != null) {
            chainWrapper.set(HealthPhysicalCheck::getLowPressure, healthPhysicalCheck.getLowPressure());
        }
        if (healthPhysicalCheck.getHeight() != null) {
            chainWrapper.set(HealthPhysicalCheck::getHeight, healthPhysicalCheck.getHeight());
        }
        if (healthPhysicalCheck.getWeight() != null) {
            chainWrapper.set(HealthPhysicalCheck::getWeight, healthPhysicalCheck.getWeight());
        }
        if (healthPhysicalCheck.getWaistline() != null) {
            chainWrapper.set(HealthPhysicalCheck::getWaistline, healthPhysicalCheck.getWaistline());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getSelfAssessment())) {
            chainWrapper.set(HealthPhysicalCheck::getSelfAssessment, healthPhysicalCheck.getSelfAssessment());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getSelfDesp())) {
            chainWrapper.set(HealthPhysicalCheck::getSelfDesp, healthPhysicalCheck.getSelfDesp());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getSkinStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getSkinStatus, healthPhysicalCheck.getSkinStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getSkinDesp())) {
            chainWrapper.set(HealthPhysicalCheck::getSkinDesp, healthPhysicalCheck.getSkinDesp());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getLymphStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getLymphStatus, healthPhysicalCheck.getLymphStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getLymphDesp())) {
            chainWrapper.set(HealthPhysicalCheck::getLymphDesp, healthPhysicalCheck.getLymphDesp());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getLipsStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getLipsStatus, healthPhysicalCheck.getLipsStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getToothStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getToothStatus, healthPhysicalCheck.getToothStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getThroatStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getThroatStatus, healthPhysicalCheck.getThroatStatus());
        }
        if (healthPhysicalCheck.getLeftEyesight() != null) {
            chainWrapper.set(HealthPhysicalCheck::getLeftEyesight, healthPhysicalCheck.getLeftEyesight());
        }
        if (healthPhysicalCheck.getRightEyesight() != null) {
            chainWrapper.set(HealthPhysicalCheck::getRightEyesight, healthPhysicalCheck.getRightEyesight());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getListeningStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getListeningStatus, healthPhysicalCheck.getListeningStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getEarNoseStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getEarNoseStatus, healthPhysicalCheck.getEarNoseStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getEyeStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getEyeStatus, healthPhysicalCheck.getEyeStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getChestShape())) {
            chainWrapper.set(HealthPhysicalCheck::getChestShape, healthPhysicalCheck.getChestShape());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getChestPercussion())) {
            chainWrapper.set(HealthPhysicalCheck::getChestPercussion, healthPhysicalCheck.getChestPercussion());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getChestSounds())) {
            chainWrapper.set(HealthPhysicalCheck::getChestSounds, healthPhysicalCheck.getChestSounds());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getHeartStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getHeartStatus, healthPhysicalCheck.getHeartStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getHeartRate())) {
            chainWrapper.set(HealthPhysicalCheck::getHeartRate, healthPhysicalCheck.getHeartRate());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getHeartRhythm())) {
            chainWrapper.set(HealthPhysicalCheck::getHeartRhythm, healthPhysicalCheck.getHeartRhythm());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getHeartSounds())) {
            chainWrapper.set(HealthPhysicalCheck::getHeartSounds, healthPhysicalCheck.getHeartSounds());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getAbdomenStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getAbdomenStatus, healthPhysicalCheck.getAbdomenStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getAbdomenDesp())) {
            chainWrapper.set(HealthPhysicalCheck::getAbdomenDesp, healthPhysicalCheck.getAbdomenDesp());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getArmsSkin())) {
            chainWrapper.set(HealthPhysicalCheck::getArmsSkin, healthPhysicalCheck.getArmsSkin());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getArmsSkinDesp())) {
            chainWrapper.set(HealthPhysicalCheck::getArmsSkinDesp, healthPhysicalCheck.getArmsSkinDesp());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getCanTouch())) {
            chainWrapper.set(HealthPhysicalCheck::getCanTouch, healthPhysicalCheck.getCanTouch());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getNoTouch())) {
            chainWrapper.set(HealthPhysicalCheck::getNoTouch, healthPhysicalCheck.getNoTouch());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getAnusStatus())) {
            chainWrapper.set(HealthPhysicalCheck::getAnusStatus, healthPhysicalCheck.getAnusStatus());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getWomanCheck())) {
            chainWrapper.set(HealthPhysicalCheck::getWomanCheck, healthPhysicalCheck.getWomanCheck());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getCheckFile())) {
            chainWrapper.set(HealthPhysicalCheck::getCheckFile, healthPhysicalCheck.getCheckFile());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getCheckResult())) {
            chainWrapper.set(HealthPhysicalCheck::getCheckResult, healthPhysicalCheck.getCheckResult());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getPhysicalState())) {
            chainWrapper.set(HealthPhysicalCheck::getPhysicalState, healthPhysicalCheck.getPhysicalState());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getHospitalName())) {
            chainWrapper.set(HealthPhysicalCheck::getHospitalName, healthPhysicalCheck.getHospitalName());
        }
        if (healthPhysicalCheck.getAreaCode() != null) {
            chainWrapper.set(HealthPhysicalCheck::getAreaCode, healthPhysicalCheck.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthPhysicalCheck.getAreaName())) {
            chainWrapper.set(HealthPhysicalCheck::getAreaName, healthPhysicalCheck.getAreaName());
        }
        if (healthPhysicalCheck.getCreateUser() != null) {
            chainWrapper.set(HealthPhysicalCheck::getCreateUser, healthPhysicalCheck.getCreateUser());
        }
        if (healthPhysicalCheck.getCreateDept() != null) {
            chainWrapper.set(HealthPhysicalCheck::getCreateDept, healthPhysicalCheck.getCreateDept());
        }
        if (healthPhysicalCheck.getCreateTime() != null) {
            chainWrapper.set(HealthPhysicalCheck::getCreateTime, healthPhysicalCheck.getCreateTime());
        }
        if (healthPhysicalCheck.getUpdateUser() != null) {
            chainWrapper.set(HealthPhysicalCheck::getUpdateUser, healthPhysicalCheck.getUpdateUser());
        }
        if (healthPhysicalCheck.getUpdateTime() != null) {
            chainWrapper.set(HealthPhysicalCheck::getUpdateTime, healthPhysicalCheck.getUpdateTime());
        }
        if (healthPhysicalCheck.getStatus() != null) {
            chainWrapper.set(HealthPhysicalCheck::getStatus, healthPhysicalCheck.getStatus());
        }
        if (healthPhysicalCheck.getIsDeleted() != null) {
            chainWrapper.set(HealthPhysicalCheck::getIsDeleted, healthPhysicalCheck.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthPhysicalCheck::getId, healthPhysicalCheck.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthPhysicalCheck.getId());
        } else {
            return healthPhysicalCheck;
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
    public boolean saveHealthPhysicalCheckBatch(List<HealthPhysicalCheck> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthPhysicalCheck healthPhysicalCheck : insertList) {
            //使用默认的雪花算法生成
            healthPhysicalCheck.setId(null);
            //healthPhysicalCheck.setCreatedDt(currentDte);
            //healthPhysicalCheck.setUpdatedDt(currentDte);
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
    public Integer deleteHealthPhysicalCheckBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthPhysicalCheck> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


