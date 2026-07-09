package cn.pluss.platform.service.careLeaveRecord.impl;

import cn.pluss.platform.mapper.CareLeaveRecordMapper;
import cn.pluss.platform.model.entity.CareLeaveRecord;
import cn.pluss.platform.service.careLeaveRecord.CareLeaveRecordService;
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
@Service("careLeaveRecordService")
public class CareLeaveRecordServiceImpl extends ServiceImpl< CareLeaveRecordMapper, CareLeaveRecord> implements CareLeaveRecordService {
    private static final Logger logger = LoggerFactory.getLogger(CareLeaveRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CareLeaveRecord> queryPage(Map map) {
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
    public CareLeaveRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param careLeaveRecord 实例对象
    * @return 实例对象
    */
    @Override
    public CareLeaveRecord queryOne(CareLeaveRecord careLeaveRecord){
        LambdaQueryWrapper<CareLeaveRecord> queryWrapper = getQueryWrapper(careLeaveRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param careLeaveRecord
    * @return
    */
    @Override
    public List<CareLeaveRecord> queryList(CareLeaveRecord careLeaveRecord) {
        LambdaQueryWrapper<CareLeaveRecord> queryWrapper = getQueryWrapper(careLeaveRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param careLeaveRecord
    * @return
    */
    public static LambdaQueryWrapper<CareLeaveRecord> getQueryWrapper(CareLeaveRecord careLeaveRecord){
        LambdaQueryWrapper<CareLeaveRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (careLeaveRecord.getId() != null) {
            queryWrapper.eq(CareLeaveRecord::getId, careLeaveRecord.getId());
        }
        if (StringUtil.isNotEmpty(careLeaveRecord.getTenantId())) {
            queryWrapper.eq(CareLeaveRecord::getTenantId, careLeaveRecord.getTenantId());
        }
        if (careLeaveRecord.getCorpId() != null) {
            queryWrapper.eq(CareLeaveRecord::getCorpId, careLeaveRecord.getCorpId());
        }
        if (careLeaveRecord.getInstitutionId() != null) {
            queryWrapper.eq(CareLeaveRecord::getInstitutionId, careLeaveRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(careLeaveRecord.getInstitutionName())) {
            queryWrapper.eq(CareLeaveRecord::getInstitutionName, careLeaveRecord.getInstitutionName());
        }
        if (careLeaveRecord.getEnrollId() != null) {
            queryWrapper.eq(CareLeaveRecord::getEnrollId, careLeaveRecord.getEnrollId());
        }
        if (careLeaveRecord.getElderId() != null) {
            queryWrapper.eq(CareLeaveRecord::getElderId, careLeaveRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(careLeaveRecord.getElderName())) {
            queryWrapper.eq(CareLeaveRecord::getElderName, careLeaveRecord.getElderName());
        }
        if (careLeaveRecord.getLeaveDate() != null) {
            queryWrapper.eq(CareLeaveRecord::getLeaveDate, careLeaveRecord.getLeaveDate());
        }
        if (careLeaveRecord.getBackDate() != null) {
            queryWrapper.eq(CareLeaveRecord::getBackDate, careLeaveRecord.getBackDate());
        }
        if (careLeaveRecord.getLeaveDay() != null) {
            queryWrapper.eq(CareLeaveRecord::getLeaveDay, careLeaveRecord.getLeaveDay());
        }
        if (StringUtil.isNotEmpty(careLeaveRecord.getLeaveReason())) {
            queryWrapper.eq(CareLeaveRecord::getLeaveReason, careLeaveRecord.getLeaveReason());
        }
        if (StringUtil.isNotEmpty(careLeaveRecord.getWithName())) {
            queryWrapper.eq(CareLeaveRecord::getWithName, careLeaveRecord.getWithName());
        }
        if (StringUtil.isNotEmpty(careLeaveRecord.getWithLinkTel())) {
            queryWrapper.eq(CareLeaveRecord::getWithLinkTel, careLeaveRecord.getWithLinkTel());
        }
        if (StringUtil.isNotEmpty(careLeaveRecord.getIsRefund())) {
            queryWrapper.eq(CareLeaveRecord::getIsRefund, careLeaveRecord.getIsRefund());
        }
        if (careLeaveRecord.getIsFee() != null) {
            queryWrapper.eq(CareLeaveRecord::getIsFee, careLeaveRecord.getIsFee());
        }
        if (careLeaveRecord.getAreaCode() != null) {
            queryWrapper.eq(CareLeaveRecord::getAreaCode, careLeaveRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(careLeaveRecord.getAreaName())) {
            queryWrapper.eq(CareLeaveRecord::getAreaName, careLeaveRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(careLeaveRecord.getRemark())) {
            queryWrapper.eq(CareLeaveRecord::getRemark, careLeaveRecord.getRemark());
        }
        if (careLeaveRecord.getCreateUser() != null) {
            queryWrapper.eq(CareLeaveRecord::getCreateUser, careLeaveRecord.getCreateUser());
        }
        if (careLeaveRecord.getCreateDept() != null) {
            queryWrapper.eq(CareLeaveRecord::getCreateDept, careLeaveRecord.getCreateDept());
        }
        if (careLeaveRecord.getCreateTime() != null) {
            queryWrapper.eq(CareLeaveRecord::getCreateTime, careLeaveRecord.getCreateTime());
        }
        if (careLeaveRecord.getUpdateUser() != null) {
            queryWrapper.eq(CareLeaveRecord::getUpdateUser, careLeaveRecord.getUpdateUser());
        }
        if (careLeaveRecord.getUpdateTime() != null) {
            queryWrapper.eq(CareLeaveRecord::getUpdateTime, careLeaveRecord.getUpdateTime());
        }
        if (careLeaveRecord.getStatus() != null) {
            queryWrapper.eq(CareLeaveRecord::getStatus, careLeaveRecord.getStatus());
        }
        if (careLeaveRecord.getIsDeleted() != null) {
            queryWrapper.eq(CareLeaveRecord::getIsDeleted, careLeaveRecord.getIsDeleted());
        }
        if (careLeaveRecord.getCalculateState() != null) {
            queryWrapper.eq(CareLeaveRecord::getCalculateState, careLeaveRecord.getCalculateState());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param careLeaveRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareLeaveRecord insert(CareLeaveRecord careLeaveRecord) {
        careLeaveRecord.setId(null);
        getBaseMapper().insert(careLeaveRecord);
        return careLeaveRecord;
    }

    /**
    * 更新数据
    *
    * @param careLeaveRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareLeaveRecord update(CareLeaveRecord careLeaveRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CareLeaveRecord> chainWrapper = new LambdaUpdateChainWrapper<CareLeaveRecord>(getBaseMapper());
        if (careLeaveRecord.getId() != null) {
            chainWrapper.set(CareLeaveRecord::getId, careLeaveRecord.getId());
        }
        if (StringUtil.isNotBlank(careLeaveRecord.getTenantId())) {
            chainWrapper.set(CareLeaveRecord::getTenantId, careLeaveRecord.getTenantId());
        }
        if (careLeaveRecord.getCorpId() != null) {
            chainWrapper.set(CareLeaveRecord::getCorpId, careLeaveRecord.getCorpId());
        }
        if (careLeaveRecord.getInstitutionId() != null) {
            chainWrapper.set(CareLeaveRecord::getInstitutionId, careLeaveRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(careLeaveRecord.getInstitutionName())) {
            chainWrapper.set(CareLeaveRecord::getInstitutionName, careLeaveRecord.getInstitutionName());
        }
        if (careLeaveRecord.getEnrollId() != null) {
            chainWrapper.set(CareLeaveRecord::getEnrollId, careLeaveRecord.getEnrollId());
        }
        if (careLeaveRecord.getElderId() != null) {
            chainWrapper.set(CareLeaveRecord::getElderId, careLeaveRecord.getElderId());
        }
        if (StringUtil.isNotBlank(careLeaveRecord.getElderName())) {
            chainWrapper.set(CareLeaveRecord::getElderName, careLeaveRecord.getElderName());
        }
        if (careLeaveRecord.getLeaveDate() != null) {
            chainWrapper.set(CareLeaveRecord::getLeaveDate, careLeaveRecord.getLeaveDate());
        }
        if (careLeaveRecord.getBackDate() != null) {
            chainWrapper.set(CareLeaveRecord::getBackDate, careLeaveRecord.getBackDate());
        }
        if (careLeaveRecord.getLeaveDay() != null) {
            chainWrapper.set(CareLeaveRecord::getLeaveDay, careLeaveRecord.getLeaveDay());
        }
        if (StringUtil.isNotBlank(careLeaveRecord.getLeaveReason())) {
            chainWrapper.set(CareLeaveRecord::getLeaveReason, careLeaveRecord.getLeaveReason());
        }
        if (StringUtil.isNotBlank(careLeaveRecord.getWithName())) {
            chainWrapper.set(CareLeaveRecord::getWithName, careLeaveRecord.getWithName());
        }
        if (StringUtil.isNotBlank(careLeaveRecord.getWithLinkTel())) {
            chainWrapper.set(CareLeaveRecord::getWithLinkTel, careLeaveRecord.getWithLinkTel());
        }
        if (StringUtil.isNotBlank(careLeaveRecord.getIsRefund())) {
            chainWrapper.set(CareLeaveRecord::getIsRefund, careLeaveRecord.getIsRefund());
        }
        if (careLeaveRecord.getIsFee() != null) {
            chainWrapper.set(CareLeaveRecord::getIsFee, careLeaveRecord.getIsFee());
        }
        if (careLeaveRecord.getAreaCode() != null) {
            chainWrapper.set(CareLeaveRecord::getAreaCode, careLeaveRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(careLeaveRecord.getAreaName())) {
            chainWrapper.set(CareLeaveRecord::getAreaName, careLeaveRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(careLeaveRecord.getRemark())) {
            chainWrapper.set(CareLeaveRecord::getRemark, careLeaveRecord.getRemark());
        }
        if (careLeaveRecord.getCreateUser() != null) {
            chainWrapper.set(CareLeaveRecord::getCreateUser, careLeaveRecord.getCreateUser());
        }
        if (careLeaveRecord.getCreateDept() != null) {
            chainWrapper.set(CareLeaveRecord::getCreateDept, careLeaveRecord.getCreateDept());
        }
        if (careLeaveRecord.getCreateTime() != null) {
            chainWrapper.set(CareLeaveRecord::getCreateTime, careLeaveRecord.getCreateTime());
        }
        if (careLeaveRecord.getUpdateUser() != null) {
            chainWrapper.set(CareLeaveRecord::getUpdateUser, careLeaveRecord.getUpdateUser());
        }
        if (careLeaveRecord.getUpdateTime() != null) {
            chainWrapper.set(CareLeaveRecord::getUpdateTime, careLeaveRecord.getUpdateTime());
        }
        if (careLeaveRecord.getStatus() != null) {
            chainWrapper.set(CareLeaveRecord::getStatus, careLeaveRecord.getStatus());
        }
        if (careLeaveRecord.getIsDeleted() != null) {
            chainWrapper.set(CareLeaveRecord::getIsDeleted, careLeaveRecord.getIsDeleted());
        }
        if (careLeaveRecord.getCalculateState() != null) {
            chainWrapper.set(CareLeaveRecord::getCalculateState, careLeaveRecord.getCalculateState());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CareLeaveRecord::getId, careLeaveRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(careLeaveRecord.getId());
        } else {
            return careLeaveRecord;
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
    public boolean saveCareLeaveRecordBatch(List<CareLeaveRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CareLeaveRecord careLeaveRecord : insertList) {
            //使用默认的雪花算法生成
            careLeaveRecord.setId(null);
            //careLeaveRecord.setCreatedDt(currentDte);
            //careLeaveRecord.setUpdatedDt(currentDte);
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
    public Integer deleteCareLeaveRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CareLeaveRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


