package cn.pluss.platform.service.insMedicalDrugExecuteRecord.impl;

import cn.pluss.platform.mapper.InsMedicalDrugExecuteRecordMapper;
import cn.pluss.platform.model.entity.InsMedicalDrugExecuteRecord;
import cn.pluss.platform.service.insMedicalDrugExecuteRecord.InsMedicalDrugExecuteRecordService;
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
@Service("insMedicalDrugExecuteRecordService")
public class InsMedicalDrugExecuteRecordServiceImpl extends ServiceImpl< InsMedicalDrugExecuteRecordMapper, InsMedicalDrugExecuteRecord> implements InsMedicalDrugExecuteRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsMedicalDrugExecuteRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsMedicalDrugExecuteRecord> queryPage(Map map) {
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
    public InsMedicalDrugExecuteRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalDrugExecuteRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsMedicalDrugExecuteRecord queryOne(InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord){
        LambdaQueryWrapper<InsMedicalDrugExecuteRecord> queryWrapper = getQueryWrapper(insMedicalDrugExecuteRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalDrugExecuteRecord
    * @return
    */
    @Override
    public List<InsMedicalDrugExecuteRecord> queryList(InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord) {
        LambdaQueryWrapper<InsMedicalDrugExecuteRecord> queryWrapper = getQueryWrapper(insMedicalDrugExecuteRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insMedicalDrugExecuteRecord
    * @return
    */
    public static LambdaQueryWrapper<InsMedicalDrugExecuteRecord> getQueryWrapper(InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord){
        LambdaQueryWrapper<InsMedicalDrugExecuteRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insMedicalDrugExecuteRecord.getId() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getId, insMedicalDrugExecuteRecord.getId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getTenantId())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getTenantId, insMedicalDrugExecuteRecord.getTenantId());
        }
        if (insMedicalDrugExecuteRecord.getCorpId() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getCorpId, insMedicalDrugExecuteRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getCorpName())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getCorpName, insMedicalDrugExecuteRecord.getCorpName());
        }
        if (insMedicalDrugExecuteRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getInstitutionId, insMedicalDrugExecuteRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getInstitutionName())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getInstitutionName, insMedicalDrugExecuteRecord.getInstitutionName());
        }
        if (insMedicalDrugExecuteRecord.getCheckId() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getCheckId, insMedicalDrugExecuteRecord.getCheckId());
        }
        if (insMedicalDrugExecuteRecord.getCheckDate() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getCheckDate, insMedicalDrugExecuteRecord.getCheckDate());
        }
        if (insMedicalDrugExecuteRecord.getElderId() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getElderId, insMedicalDrugExecuteRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getElderName())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getElderName, insMedicalDrugExecuteRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getIdCard())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getIdCard, insMedicalDrugExecuteRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getSex())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getSex, insMedicalDrugExecuteRecord.getSex());
        }
        if (insMedicalDrugExecuteRecord.getDrugId() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getDrugId, insMedicalDrugExecuteRecord.getDrugId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getDrugName())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getDrugName, insMedicalDrugExecuteRecord.getDrugName());
        }
        if (insMedicalDrugExecuteRecord.getExecuteDate() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getExecuteDate, insMedicalDrugExecuteRecord.getExecuteDate());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getExecuteTime())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getExecuteTime, insMedicalDrugExecuteRecord.getExecuteTime());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getDrugMethods())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getDrugMethods, insMedicalDrugExecuteRecord.getDrugMethods());
        }
        if (insMedicalDrugExecuteRecord.getDrugDosage() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getDrugDosage, insMedicalDrugExecuteRecord.getDrugDosage());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getDrugUnit())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getDrugUnit, insMedicalDrugExecuteRecord.getDrugUnit());
        }
        if (insMedicalDrugExecuteRecord.getExecuteState() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getExecuteState, insMedicalDrugExecuteRecord.getExecuteState());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getExecuteMemo())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getExecuteMemo, insMedicalDrugExecuteRecord.getExecuteMemo());
        }
        if (insMedicalDrugExecuteRecord.getStaffId() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getStaffId, insMedicalDrugExecuteRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getStaffName())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getStaffName, insMedicalDrugExecuteRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getRemark())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getRemark, insMedicalDrugExecuteRecord.getRemark());
        }
        if (insMedicalDrugExecuteRecord.getCreateUser() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getCreateUser, insMedicalDrugExecuteRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugExecuteRecord.getCreateName())) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getCreateName, insMedicalDrugExecuteRecord.getCreateName());
        }
        if (insMedicalDrugExecuteRecord.getCreateDept() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getCreateDept, insMedicalDrugExecuteRecord.getCreateDept());
        }
        if (insMedicalDrugExecuteRecord.getCreateTime() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getCreateTime, insMedicalDrugExecuteRecord.getCreateTime());
        }
        if (insMedicalDrugExecuteRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getUpdateUser, insMedicalDrugExecuteRecord.getUpdateUser());
        }
        if (insMedicalDrugExecuteRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getUpdateTime, insMedicalDrugExecuteRecord.getUpdateTime());
        }
        if (insMedicalDrugExecuteRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getIsDeleted, insMedicalDrugExecuteRecord.getIsDeleted());
        }
        if (insMedicalDrugExecuteRecord.getStatus() != null) {
            queryWrapper.eq(InsMedicalDrugExecuteRecord::getStatus, insMedicalDrugExecuteRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insMedicalDrugExecuteRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalDrugExecuteRecord insert(InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord) {
        insMedicalDrugExecuteRecord.setId(null);
        getBaseMapper().insert(insMedicalDrugExecuteRecord);
        return insMedicalDrugExecuteRecord;
    }

    /**
    * 更新数据
    *
    * @param insMedicalDrugExecuteRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalDrugExecuteRecord update(InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsMedicalDrugExecuteRecord> chainWrapper = new LambdaUpdateChainWrapper<InsMedicalDrugExecuteRecord>(getBaseMapper());
        if (insMedicalDrugExecuteRecord.getId() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getId, insMedicalDrugExecuteRecord.getId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getTenantId())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getTenantId, insMedicalDrugExecuteRecord.getTenantId());
        }
        if (insMedicalDrugExecuteRecord.getCorpId() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getCorpId, insMedicalDrugExecuteRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getCorpName())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getCorpName, insMedicalDrugExecuteRecord.getCorpName());
        }
        if (insMedicalDrugExecuteRecord.getInstitutionId() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getInstitutionId, insMedicalDrugExecuteRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getInstitutionName())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getInstitutionName, insMedicalDrugExecuteRecord.getInstitutionName());
        }
        if (insMedicalDrugExecuteRecord.getCheckId() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getCheckId, insMedicalDrugExecuteRecord.getCheckId());
        }
        if (insMedicalDrugExecuteRecord.getCheckDate() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getCheckDate, insMedicalDrugExecuteRecord.getCheckDate());
        }
        if (insMedicalDrugExecuteRecord.getElderId() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getElderId, insMedicalDrugExecuteRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getElderName())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getElderName, insMedicalDrugExecuteRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getIdCard())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getIdCard, insMedicalDrugExecuteRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getSex())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getSex, insMedicalDrugExecuteRecord.getSex());
        }
        if (insMedicalDrugExecuteRecord.getDrugId() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getDrugId, insMedicalDrugExecuteRecord.getDrugId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getDrugName())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getDrugName, insMedicalDrugExecuteRecord.getDrugName());
        }
        if (insMedicalDrugExecuteRecord.getExecuteDate() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getExecuteDate, insMedicalDrugExecuteRecord.getExecuteDate());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getExecuteTime())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getExecuteTime, insMedicalDrugExecuteRecord.getExecuteTime());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getDrugMethods())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getDrugMethods, insMedicalDrugExecuteRecord.getDrugMethods());
        }
        if (insMedicalDrugExecuteRecord.getDrugDosage() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getDrugDosage, insMedicalDrugExecuteRecord.getDrugDosage());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getDrugUnit())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getDrugUnit, insMedicalDrugExecuteRecord.getDrugUnit());
        }
        if (insMedicalDrugExecuteRecord.getExecuteState() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getExecuteState, insMedicalDrugExecuteRecord.getExecuteState());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getExecuteMemo())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getExecuteMemo, insMedicalDrugExecuteRecord.getExecuteMemo());
        }
        if (insMedicalDrugExecuteRecord.getStaffId() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getStaffId, insMedicalDrugExecuteRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getStaffName())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getStaffName, insMedicalDrugExecuteRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getRemark())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getRemark, insMedicalDrugExecuteRecord.getRemark());
        }
        if (insMedicalDrugExecuteRecord.getCreateUser() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getCreateUser, insMedicalDrugExecuteRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insMedicalDrugExecuteRecord.getCreateName())) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getCreateName, insMedicalDrugExecuteRecord.getCreateName());
        }
        if (insMedicalDrugExecuteRecord.getCreateDept() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getCreateDept, insMedicalDrugExecuteRecord.getCreateDept());
        }
        if (insMedicalDrugExecuteRecord.getCreateTime() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getCreateTime, insMedicalDrugExecuteRecord.getCreateTime());
        }
        if (insMedicalDrugExecuteRecord.getUpdateUser() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getUpdateUser, insMedicalDrugExecuteRecord.getUpdateUser());
        }
        if (insMedicalDrugExecuteRecord.getUpdateTime() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getUpdateTime, insMedicalDrugExecuteRecord.getUpdateTime());
        }
        if (insMedicalDrugExecuteRecord.getIsDeleted() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getIsDeleted, insMedicalDrugExecuteRecord.getIsDeleted());
        }
        if (insMedicalDrugExecuteRecord.getStatus() != null) {
            chainWrapper.set(InsMedicalDrugExecuteRecord::getStatus, insMedicalDrugExecuteRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsMedicalDrugExecuteRecord::getId, insMedicalDrugExecuteRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insMedicalDrugExecuteRecord.getId());
        } else {
            return insMedicalDrugExecuteRecord;
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
    public boolean saveInsMedicalDrugExecuteRecordBatch(List<InsMedicalDrugExecuteRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord : insertList) {
            //使用默认的雪花算法生成
            insMedicalDrugExecuteRecord.setId(null);
            //insMedicalDrugExecuteRecord.setCreatedDt(currentDte);
            //insMedicalDrugExecuteRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsMedicalDrugExecuteRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsMedicalDrugExecuteRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


