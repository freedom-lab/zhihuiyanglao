package cn.pluss.platform.service.ysElderFollowupRecord.impl;

import cn.pluss.platform.mapper.YsElderFollowupRecordMapper;
import cn.pluss.platform.model.entity.YsElderFollowupRecord;
import cn.pluss.platform.service.ysElderFollowupRecord.YsElderFollowupRecordService;
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
@Service("ysElderFollowupRecordService")
public class YsElderFollowupRecordServiceImpl extends ServiceImpl< YsElderFollowupRecordMapper, YsElderFollowupRecord> implements YsElderFollowupRecordService {
    private static final Logger logger = LoggerFactory.getLogger(YsElderFollowupRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<YsElderFollowupRecord> queryPage(Map map) {
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
    public YsElderFollowupRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param ysElderFollowupRecord 实例对象
    * @return 实例对象
    */
    @Override
    public YsElderFollowupRecord queryOne(YsElderFollowupRecord ysElderFollowupRecord){
        LambdaQueryWrapper<YsElderFollowupRecord> queryWrapper = getQueryWrapper(ysElderFollowupRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param ysElderFollowupRecord
    * @return
    */
    @Override
    public List<YsElderFollowupRecord> queryList(YsElderFollowupRecord ysElderFollowupRecord) {
        LambdaQueryWrapper<YsElderFollowupRecord> queryWrapper = getQueryWrapper(ysElderFollowupRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param ysElderFollowupRecord
    * @return
    */
    public static LambdaQueryWrapper<YsElderFollowupRecord> getQueryWrapper(YsElderFollowupRecord ysElderFollowupRecord){
        LambdaQueryWrapper<YsElderFollowupRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (ysElderFollowupRecord.getId() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getId, ysElderFollowupRecord.getId());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getTenantId())) {
            queryWrapper.eq(YsElderFollowupRecord::getTenantId, ysElderFollowupRecord.getTenantId());
        }
        if (ysElderFollowupRecord.getCorpId() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getCorpId, ysElderFollowupRecord.getCorpId());
        }
        if (ysElderFollowupRecord.getInstitutionId() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getInstitutionId, ysElderFollowupRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getInstitutionName())) {
            queryWrapper.eq(YsElderFollowupRecord::getInstitutionName, ysElderFollowupRecord.getInstitutionName());
        }
        if (ysElderFollowupRecord.getElderId() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getElderId, ysElderFollowupRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getElderName())) {
            queryWrapper.eq(YsElderFollowupRecord::getElderName, ysElderFollowupRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getIdCard())) {
            queryWrapper.eq(YsElderFollowupRecord::getIdCard, ysElderFollowupRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getLinkTel())) {
            queryWrapper.eq(YsElderFollowupRecord::getLinkTel, ysElderFollowupRecord.getLinkTel());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getSex())) {
            queryWrapper.eq(YsElderFollowupRecord::getSex, ysElderFollowupRecord.getSex());
        }
        if (ysElderFollowupRecord.getAge() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getAge, ysElderFollowupRecord.getAge());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getHomeAddress())) {
            queryWrapper.eq(YsElderFollowupRecord::getHomeAddress, ysElderFollowupRecord.getHomeAddress());
        }
        if (ysElderFollowupRecord.getAccessTime() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getAccessTime, ysElderFollowupRecord.getAccessTime());
        }
        if (ysElderFollowupRecord.getDoctorId() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getDoctorId, ysElderFollowupRecord.getDoctorId());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getDoctorName())) {
            queryWrapper.eq(YsElderFollowupRecord::getDoctorName, ysElderFollowupRecord.getDoctorName());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getAccessType())) {
            queryWrapper.eq(YsElderFollowupRecord::getAccessType, ysElderFollowupRecord.getAccessType());
        }
        if (ysElderFollowupRecord.getPulseRate() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getPulseRate, ysElderFollowupRecord.getPulseRate());
        }
        if (ysElderFollowupRecord.getSystolicPressure() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getSystolicPressure, ysElderFollowupRecord.getSystolicPressure());
        }
        if (ysElderFollowupRecord.getDiastolicPressure() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getDiastolicPressure, ysElderFollowupRecord.getDiastolicPressure());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getPressureResult())) {
            queryWrapper.eq(YsElderFollowupRecord::getPressureResult, ysElderFollowupRecord.getPressureResult());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getConditions())) {
            queryWrapper.eq(YsElderFollowupRecord::getConditions, ysElderFollowupRecord.getConditions());
        }
        if (ysElderFollowupRecord.getBloodGlucose() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getBloodGlucose, ysElderFollowupRecord.getBloodGlucose());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getGlucoseResult())) {
            queryWrapper.eq(YsElderFollowupRecord::getGlucoseResult, ysElderFollowupRecord.getGlucoseResult());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getHealthContext())) {
            queryWrapper.eq(YsElderFollowupRecord::getHealthContext, ysElderFollowupRecord.getHealthContext());
        }
        if (ysElderFollowupRecord.getNextAccessTime() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getNextAccessTime, ysElderFollowupRecord.getNextAccessTime());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getAttachPath())) {
            queryWrapper.eq(YsElderFollowupRecord::getAttachPath, ysElderFollowupRecord.getAttachPath());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getAccessRecom())) {
            queryWrapper.eq(YsElderFollowupRecord::getAccessRecom, ysElderFollowupRecord.getAccessRecom());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getAccessContext())) {
            queryWrapper.eq(YsElderFollowupRecord::getAccessContext, ysElderFollowupRecord.getAccessContext());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getRemark())) {
            queryWrapper.eq(YsElderFollowupRecord::getRemark, ysElderFollowupRecord.getRemark());
        }
        if (ysElderFollowupRecord.getDataSource() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getDataSource, ysElderFollowupRecord.getDataSource());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getAreaCode())) {
            queryWrapper.eq(YsElderFollowupRecord::getAreaCode, ysElderFollowupRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getAreaName())) {
            queryWrapper.eq(YsElderFollowupRecord::getAreaName, ysElderFollowupRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(ysElderFollowupRecord.getCreateName())) {
            queryWrapper.eq(YsElderFollowupRecord::getCreateName, ysElderFollowupRecord.getCreateName());
        }
        if (ysElderFollowupRecord.getCreateUser() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getCreateUser, ysElderFollowupRecord.getCreateUser());
        }
        if (ysElderFollowupRecord.getCreateDept() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getCreateDept, ysElderFollowupRecord.getCreateDept());
        }
        if (ysElderFollowupRecord.getCreateTime() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getCreateTime, ysElderFollowupRecord.getCreateTime());
        }
        if (ysElderFollowupRecord.getUpdateUser() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getUpdateUser, ysElderFollowupRecord.getUpdateUser());
        }
        if (ysElderFollowupRecord.getUpdateTime() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getUpdateTime, ysElderFollowupRecord.getUpdateTime());
        }
        if (ysElderFollowupRecord.getIsDeleted() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getIsDeleted, ysElderFollowupRecord.getIsDeleted());
        }
        if (ysElderFollowupRecord.getStatus() != null) {
            queryWrapper.eq(YsElderFollowupRecord::getStatus, ysElderFollowupRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param ysElderFollowupRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public YsElderFollowupRecord insert(YsElderFollowupRecord ysElderFollowupRecord) {
        ysElderFollowupRecord.setId(null);
        getBaseMapper().insert(ysElderFollowupRecord);
        return ysElderFollowupRecord;
    }

    /**
    * 更新数据
    *
    * @param ysElderFollowupRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public YsElderFollowupRecord update(YsElderFollowupRecord ysElderFollowupRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<YsElderFollowupRecord> chainWrapper = new LambdaUpdateChainWrapper<YsElderFollowupRecord>(getBaseMapper());
        if (ysElderFollowupRecord.getId() != null) {
            chainWrapper.set(YsElderFollowupRecord::getId, ysElderFollowupRecord.getId());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getTenantId())) {
            chainWrapper.set(YsElderFollowupRecord::getTenantId, ysElderFollowupRecord.getTenantId());
        }
        if (ysElderFollowupRecord.getCorpId() != null) {
            chainWrapper.set(YsElderFollowupRecord::getCorpId, ysElderFollowupRecord.getCorpId());
        }
        if (ysElderFollowupRecord.getInstitutionId() != null) {
            chainWrapper.set(YsElderFollowupRecord::getInstitutionId, ysElderFollowupRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getInstitutionName())) {
            chainWrapper.set(YsElderFollowupRecord::getInstitutionName, ysElderFollowupRecord.getInstitutionName());
        }
        if (ysElderFollowupRecord.getElderId() != null) {
            chainWrapper.set(YsElderFollowupRecord::getElderId, ysElderFollowupRecord.getElderId());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getElderName())) {
            chainWrapper.set(YsElderFollowupRecord::getElderName, ysElderFollowupRecord.getElderName());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getIdCard())) {
            chainWrapper.set(YsElderFollowupRecord::getIdCard, ysElderFollowupRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getLinkTel())) {
            chainWrapper.set(YsElderFollowupRecord::getLinkTel, ysElderFollowupRecord.getLinkTel());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getSex())) {
            chainWrapper.set(YsElderFollowupRecord::getSex, ysElderFollowupRecord.getSex());
        }
        if (ysElderFollowupRecord.getAge() != null) {
            chainWrapper.set(YsElderFollowupRecord::getAge, ysElderFollowupRecord.getAge());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getHomeAddress())) {
            chainWrapper.set(YsElderFollowupRecord::getHomeAddress, ysElderFollowupRecord.getHomeAddress());
        }
        if (ysElderFollowupRecord.getAccessTime() != null) {
            chainWrapper.set(YsElderFollowupRecord::getAccessTime, ysElderFollowupRecord.getAccessTime());
        }
        if (ysElderFollowupRecord.getDoctorId() != null) {
            chainWrapper.set(YsElderFollowupRecord::getDoctorId, ysElderFollowupRecord.getDoctorId());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getDoctorName())) {
            chainWrapper.set(YsElderFollowupRecord::getDoctorName, ysElderFollowupRecord.getDoctorName());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getAccessType())) {
            chainWrapper.set(YsElderFollowupRecord::getAccessType, ysElderFollowupRecord.getAccessType());
        }
        if (ysElderFollowupRecord.getPulseRate() != null) {
            chainWrapper.set(YsElderFollowupRecord::getPulseRate, ysElderFollowupRecord.getPulseRate());
        }
        if (ysElderFollowupRecord.getSystolicPressure() != null) {
            chainWrapper.set(YsElderFollowupRecord::getSystolicPressure, ysElderFollowupRecord.getSystolicPressure());
        }
        if (ysElderFollowupRecord.getDiastolicPressure() != null) {
            chainWrapper.set(YsElderFollowupRecord::getDiastolicPressure, ysElderFollowupRecord.getDiastolicPressure());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getPressureResult())) {
            chainWrapper.set(YsElderFollowupRecord::getPressureResult, ysElderFollowupRecord.getPressureResult());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getConditions())) {
            chainWrapper.set(YsElderFollowupRecord::getConditions, ysElderFollowupRecord.getConditions());
        }
        if (ysElderFollowupRecord.getBloodGlucose() != null) {
            chainWrapper.set(YsElderFollowupRecord::getBloodGlucose, ysElderFollowupRecord.getBloodGlucose());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getGlucoseResult())) {
            chainWrapper.set(YsElderFollowupRecord::getGlucoseResult, ysElderFollowupRecord.getGlucoseResult());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getHealthContext())) {
            chainWrapper.set(YsElderFollowupRecord::getHealthContext, ysElderFollowupRecord.getHealthContext());
        }
        if (ysElderFollowupRecord.getNextAccessTime() != null) {
            chainWrapper.set(YsElderFollowupRecord::getNextAccessTime, ysElderFollowupRecord.getNextAccessTime());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getAttachPath())) {
            chainWrapper.set(YsElderFollowupRecord::getAttachPath, ysElderFollowupRecord.getAttachPath());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getAccessRecom())) {
            chainWrapper.set(YsElderFollowupRecord::getAccessRecom, ysElderFollowupRecord.getAccessRecom());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getAccessContext())) {
            chainWrapper.set(YsElderFollowupRecord::getAccessContext, ysElderFollowupRecord.getAccessContext());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getRemark())) {
            chainWrapper.set(YsElderFollowupRecord::getRemark, ysElderFollowupRecord.getRemark());
        }
        if (ysElderFollowupRecord.getDataSource() != null) {
            chainWrapper.set(YsElderFollowupRecord::getDataSource, ysElderFollowupRecord.getDataSource());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getAreaCode())) {
            chainWrapper.set(YsElderFollowupRecord::getAreaCode, ysElderFollowupRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getAreaName())) {
            chainWrapper.set(YsElderFollowupRecord::getAreaName, ysElderFollowupRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(ysElderFollowupRecord.getCreateName())) {
            chainWrapper.set(YsElderFollowupRecord::getCreateName, ysElderFollowupRecord.getCreateName());
        }
        if (ysElderFollowupRecord.getCreateUser() != null) {
            chainWrapper.set(YsElderFollowupRecord::getCreateUser, ysElderFollowupRecord.getCreateUser());
        }
        if (ysElderFollowupRecord.getCreateDept() != null) {
            chainWrapper.set(YsElderFollowupRecord::getCreateDept, ysElderFollowupRecord.getCreateDept());
        }
        if (ysElderFollowupRecord.getCreateTime() != null) {
            chainWrapper.set(YsElderFollowupRecord::getCreateTime, ysElderFollowupRecord.getCreateTime());
        }
        if (ysElderFollowupRecord.getUpdateUser() != null) {
            chainWrapper.set(YsElderFollowupRecord::getUpdateUser, ysElderFollowupRecord.getUpdateUser());
        }
        if (ysElderFollowupRecord.getUpdateTime() != null) {
            chainWrapper.set(YsElderFollowupRecord::getUpdateTime, ysElderFollowupRecord.getUpdateTime());
        }
        if (ysElderFollowupRecord.getIsDeleted() != null) {
            chainWrapper.set(YsElderFollowupRecord::getIsDeleted, ysElderFollowupRecord.getIsDeleted());
        }
        if (ysElderFollowupRecord.getStatus() != null) {
            chainWrapper.set(YsElderFollowupRecord::getStatus, ysElderFollowupRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(YsElderFollowupRecord::getId, ysElderFollowupRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(ysElderFollowupRecord.getId());
        } else {
            return ysElderFollowupRecord;
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
    public boolean saveYsElderFollowupRecordBatch(List<YsElderFollowupRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (YsElderFollowupRecord ysElderFollowupRecord : insertList) {
            //使用默认的雪花算法生成
            ysElderFollowupRecord.setId(null);
            //ysElderFollowupRecord.setCreatedDt(currentDte);
            //ysElderFollowupRecord.setUpdatedDt(currentDte);
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
    public Integer deleteYsElderFollowupRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<YsElderFollowupRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


