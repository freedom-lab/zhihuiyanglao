package cn.pluss.platform.service.smartCareParam.impl;

import cn.pluss.platform.mapper.SmartCareParamMapper;
import cn.pluss.platform.model.entity.SmartCareParam;
import cn.pluss.platform.service.smartCareParam.SmartCareParamService;
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
@Service("smartCareParamService")
public class SmartCareParamServiceImpl extends ServiceImpl< SmartCareParamMapper, SmartCareParam> implements SmartCareParamService {
    private static final Logger logger = LoggerFactory.getLogger(SmartCareParamServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartCareParam> queryPage(Map map) {
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
    public SmartCareParam queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartCareParam 实例对象
    * @return 实例对象
    */
    @Override
    public SmartCareParam queryOne(SmartCareParam smartCareParam){
        LambdaQueryWrapper<SmartCareParam> queryWrapper = getQueryWrapper(smartCareParam);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartCareParam
    * @return
    */
    @Override
    public List<SmartCareParam> queryList(SmartCareParam smartCareParam) {
        LambdaQueryWrapper<SmartCareParam> queryWrapper = getQueryWrapper(smartCareParam);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartCareParam
    * @return
    */
    public static LambdaQueryWrapper<SmartCareParam> getQueryWrapper(SmartCareParam smartCareParam){
        LambdaQueryWrapper<SmartCareParam> queryWrapper = new LambdaQueryWrapper<>();
        if (smartCareParam.getId() != null) {
            queryWrapper.eq(SmartCareParam::getId, smartCareParam.getId());
        }
        if (StringUtil.isNotEmpty(smartCareParam.getTenantId())) {
            queryWrapper.eq(SmartCareParam::getTenantId, smartCareParam.getTenantId());
        }
        if (smartCareParam.getInstitutionId() != null) {
            queryWrapper.eq(SmartCareParam::getInstitutionId, smartCareParam.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(smartCareParam.getParamType())) {
            queryWrapper.eq(SmartCareParam::getParamType, smartCareParam.getParamType());
        }
        if (smartCareParam.getGateTime() != null) {
            queryWrapper.eq(SmartCareParam::getGateTime, smartCareParam.getGateTime());
        }
        if (StringUtil.isNotEmpty(smartCareParam.getMorningStartTime())) {
            queryWrapper.eq(SmartCareParam::getMorningStartTime, smartCareParam.getMorningStartTime());
        }
        if (StringUtil.isNotEmpty(smartCareParam.getMorningEndTime())) {
            queryWrapper.eq(SmartCareParam::getMorningEndTime, smartCareParam.getMorningEndTime());
        }
        if (StringUtil.isNotEmpty(smartCareParam.getAfternoonStartTime())) {
            queryWrapper.eq(SmartCareParam::getAfternoonStartTime, smartCareParam.getAfternoonStartTime());
        }
        if (StringUtil.isNotEmpty(smartCareParam.getAfternoonEndTime())) {
            queryWrapper.eq(SmartCareParam::getAfternoonEndTime, smartCareParam.getAfternoonEndTime());
        }
        if (smartCareParam.getElderId() != null) {
            queryWrapper.eq(SmartCareParam::getElderId, smartCareParam.getElderId());
        }
        if (StringUtil.isNotEmpty(smartCareParam.getElderName())) {
            queryWrapper.eq(SmartCareParam::getElderName, smartCareParam.getElderName());
        }
        if (StringUtil.isNotEmpty(smartCareParam.getLinkTel())) {
            queryWrapper.eq(SmartCareParam::getLinkTel, smartCareParam.getLinkTel());
        }
        if (StringUtil.isNotEmpty(smartCareParam.getRemark())) {
            queryWrapper.eq(SmartCareParam::getRemark, smartCareParam.getRemark());
        }
        if (smartCareParam.getCreateUser() != null) {
            queryWrapper.eq(SmartCareParam::getCreateUser, smartCareParam.getCreateUser());
        }
        if (smartCareParam.getCreateDept() != null) {
            queryWrapper.eq(SmartCareParam::getCreateDept, smartCareParam.getCreateDept());
        }
        if (smartCareParam.getCreateTime() != null) {
            queryWrapper.eq(SmartCareParam::getCreateTime, smartCareParam.getCreateTime());
        }
        if (smartCareParam.getUpdateUser() != null) {
            queryWrapper.eq(SmartCareParam::getUpdateUser, smartCareParam.getUpdateUser());
        }
        if (smartCareParam.getUpdateTime() != null) {
            queryWrapper.eq(SmartCareParam::getUpdateTime, smartCareParam.getUpdateTime());
        }
        if (smartCareParam.getIsDeleted() != null) {
            queryWrapper.eq(SmartCareParam::getIsDeleted, smartCareParam.getIsDeleted());
        }
        if (smartCareParam.getStatus() != null) {
            queryWrapper.eq(SmartCareParam::getStatus, smartCareParam.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartCareParam 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartCareParam insert(SmartCareParam smartCareParam) {
        smartCareParam.setId(null);
        getBaseMapper().insert(smartCareParam);
        return smartCareParam;
    }

    /**
    * 更新数据
    *
    * @param smartCareParam 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartCareParam update(SmartCareParam smartCareParam) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartCareParam> chainWrapper = new LambdaUpdateChainWrapper<SmartCareParam>(getBaseMapper());
        if (smartCareParam.getId() != null) {
            chainWrapper.set(SmartCareParam::getId, smartCareParam.getId());
        }
        if (StringUtil.isNotBlank(smartCareParam.getTenantId())) {
            chainWrapper.set(SmartCareParam::getTenantId, smartCareParam.getTenantId());
        }
        if (smartCareParam.getInstitutionId() != null) {
            chainWrapper.set(SmartCareParam::getInstitutionId, smartCareParam.getInstitutionId());
        }
        if (StringUtil.isNotBlank(smartCareParam.getParamType())) {
            chainWrapper.set(SmartCareParam::getParamType, smartCareParam.getParamType());
        }
        if (smartCareParam.getGateTime() != null) {
            chainWrapper.set(SmartCareParam::getGateTime, smartCareParam.getGateTime());
        }
        if (StringUtil.isNotBlank(smartCareParam.getMorningStartTime())) {
            chainWrapper.set(SmartCareParam::getMorningStartTime, smartCareParam.getMorningStartTime());
        }
        if (StringUtil.isNotBlank(smartCareParam.getMorningEndTime())) {
            chainWrapper.set(SmartCareParam::getMorningEndTime, smartCareParam.getMorningEndTime());
        }
        if (StringUtil.isNotBlank(smartCareParam.getAfternoonStartTime())) {
            chainWrapper.set(SmartCareParam::getAfternoonStartTime, smartCareParam.getAfternoonStartTime());
        }
        if (StringUtil.isNotBlank(smartCareParam.getAfternoonEndTime())) {
            chainWrapper.set(SmartCareParam::getAfternoonEndTime, smartCareParam.getAfternoonEndTime());
        }
        if (smartCareParam.getElderId() != null) {
            chainWrapper.set(SmartCareParam::getElderId, smartCareParam.getElderId());
        }
        if (StringUtil.isNotBlank(smartCareParam.getElderName())) {
            chainWrapper.set(SmartCareParam::getElderName, smartCareParam.getElderName());
        }
        if (StringUtil.isNotBlank(smartCareParam.getLinkTel())) {
            chainWrapper.set(SmartCareParam::getLinkTel, smartCareParam.getLinkTel());
        }
        if (StringUtil.isNotBlank(smartCareParam.getRemark())) {
            chainWrapper.set(SmartCareParam::getRemark, smartCareParam.getRemark());
        }
        if (smartCareParam.getCreateUser() != null) {
            chainWrapper.set(SmartCareParam::getCreateUser, smartCareParam.getCreateUser());
        }
        if (smartCareParam.getCreateDept() != null) {
            chainWrapper.set(SmartCareParam::getCreateDept, smartCareParam.getCreateDept());
        }
        if (smartCareParam.getCreateTime() != null) {
            chainWrapper.set(SmartCareParam::getCreateTime, smartCareParam.getCreateTime());
        }
        if (smartCareParam.getUpdateUser() != null) {
            chainWrapper.set(SmartCareParam::getUpdateUser, smartCareParam.getUpdateUser());
        }
        if (smartCareParam.getUpdateTime() != null) {
            chainWrapper.set(SmartCareParam::getUpdateTime, smartCareParam.getUpdateTime());
        }
        if (smartCareParam.getIsDeleted() != null) {
            chainWrapper.set(SmartCareParam::getIsDeleted, smartCareParam.getIsDeleted());
        }
        if (smartCareParam.getStatus() != null) {
            chainWrapper.set(SmartCareParam::getStatus, smartCareParam.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartCareParam::getId, smartCareParam.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartCareParam.getId());
        } else {
            return smartCareParam;
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
    public boolean saveSmartCareParamBatch(List<SmartCareParam> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartCareParam smartCareParam : insertList) {
            //使用默认的雪花算法生成
            smartCareParam.setId(null);
            //smartCareParam.setCreatedDt(currentDte);
            //smartCareParam.setUpdatedDt(currentDte);
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
    public Integer deleteSmartCareParamBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartCareParam> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


