package cn.pluss.platform.service.insMedicalConsultationRecord.impl;

import cn.pluss.platform.mapper.InsMedicalConsultationRecordMapper;
import cn.pluss.platform.model.entity.InsMedicalConsultationRecord;
import cn.pluss.platform.service.insMedicalConsultationRecord.InsMedicalConsultationRecordService;
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
@Service("insMedicalConsultationRecordService")
public class InsMedicalConsultationRecordServiceImpl extends ServiceImpl< InsMedicalConsultationRecordMapper, InsMedicalConsultationRecord> implements InsMedicalConsultationRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsMedicalConsultationRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsMedicalConsultationRecord> queryPage(Map map) {
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
    public InsMedicalConsultationRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalConsultationRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsMedicalConsultationRecord queryOne(InsMedicalConsultationRecord insMedicalConsultationRecord){
        LambdaQueryWrapper<InsMedicalConsultationRecord> queryWrapper = getQueryWrapper(insMedicalConsultationRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalConsultationRecord
    * @return
    */
    @Override
    public List<InsMedicalConsultationRecord> queryList(InsMedicalConsultationRecord insMedicalConsultationRecord) {
        LambdaQueryWrapper<InsMedicalConsultationRecord> queryWrapper = getQueryWrapper(insMedicalConsultationRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insMedicalConsultationRecord
    * @return
    */
    public static LambdaQueryWrapper<InsMedicalConsultationRecord> getQueryWrapper(InsMedicalConsultationRecord insMedicalConsultationRecord){
        LambdaQueryWrapper<InsMedicalConsultationRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insMedicalConsultationRecord.getId() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getId, insMedicalConsultationRecord.getId());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getTenantId())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getTenantId, insMedicalConsultationRecord.getTenantId());
        }
        if (insMedicalConsultationRecord.getCorpId() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getCorpId, insMedicalConsultationRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getCorpName())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getCorpName, insMedicalConsultationRecord.getCorpName());
        }
        if (insMedicalConsultationRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getInstitutionId, insMedicalConsultationRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getInstitutionName())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getInstitutionName, insMedicalConsultationRecord.getInstitutionName());
        }
        if (insMedicalConsultationRecord.getCheckId() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getCheckId, insMedicalConsultationRecord.getCheckId());
        }
        if (insMedicalConsultationRecord.getCheckDate() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getCheckDate, insMedicalConsultationRecord.getCheckDate());
        }
        if (insMedicalConsultationRecord.getElderId() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getElderId, insMedicalConsultationRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getElderName())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getElderName, insMedicalConsultationRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getIdCard())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getIdCard, insMedicalConsultationRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getSex())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getSex, insMedicalConsultationRecord.getSex());
        }
        if (insMedicalConsultationRecord.getConsultationTime() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getConsultationTime, insMedicalConsultationRecord.getConsultationTime());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getMedicalHistory())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getMedicalHistory, insMedicalConsultationRecord.getMedicalHistory());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getMainContent())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getMainContent, insMedicalConsultationRecord.getMainContent());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getCheckResult())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getCheckResult, insMedicalConsultationRecord.getCheckResult());
        }
        if (insMedicalConsultationRecord.getDoctorId() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getDoctorId, insMedicalConsultationRecord.getDoctorId());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getDoctorName())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getDoctorName, insMedicalConsultationRecord.getDoctorName());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getRemark())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getRemark, insMedicalConsultationRecord.getRemark());
        }
        if (insMedicalConsultationRecord.getCreateUser() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getCreateUser, insMedicalConsultationRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insMedicalConsultationRecord.getCreateName())) {
            queryWrapper.eq(InsMedicalConsultationRecord::getCreateName, insMedicalConsultationRecord.getCreateName());
        }
        if (insMedicalConsultationRecord.getCreateDept() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getCreateDept, insMedicalConsultationRecord.getCreateDept());
        }
        if (insMedicalConsultationRecord.getCreateTime() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getCreateTime, insMedicalConsultationRecord.getCreateTime());
        }
        if (insMedicalConsultationRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getUpdateUser, insMedicalConsultationRecord.getUpdateUser());
        }
        if (insMedicalConsultationRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getUpdateTime, insMedicalConsultationRecord.getUpdateTime());
        }
        if (insMedicalConsultationRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getIsDeleted, insMedicalConsultationRecord.getIsDeleted());
        }
        if (insMedicalConsultationRecord.getStatus() != null) {
            queryWrapper.eq(InsMedicalConsultationRecord::getStatus, insMedicalConsultationRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insMedicalConsultationRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalConsultationRecord insert(InsMedicalConsultationRecord insMedicalConsultationRecord) {
        insMedicalConsultationRecord.setId(null);
        getBaseMapper().insert(insMedicalConsultationRecord);
        return insMedicalConsultationRecord;
    }

    /**
    * 更新数据
    *
    * @param insMedicalConsultationRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalConsultationRecord update(InsMedicalConsultationRecord insMedicalConsultationRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsMedicalConsultationRecord> chainWrapper = new LambdaUpdateChainWrapper<InsMedicalConsultationRecord>(getBaseMapper());
        if (insMedicalConsultationRecord.getId() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getId, insMedicalConsultationRecord.getId());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getTenantId())) {
            chainWrapper.set(InsMedicalConsultationRecord::getTenantId, insMedicalConsultationRecord.getTenantId());
        }
        if (insMedicalConsultationRecord.getCorpId() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getCorpId, insMedicalConsultationRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getCorpName())) {
            chainWrapper.set(InsMedicalConsultationRecord::getCorpName, insMedicalConsultationRecord.getCorpName());
        }
        if (insMedicalConsultationRecord.getInstitutionId() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getInstitutionId, insMedicalConsultationRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getInstitutionName())) {
            chainWrapper.set(InsMedicalConsultationRecord::getInstitutionName, insMedicalConsultationRecord.getInstitutionName());
        }
        if (insMedicalConsultationRecord.getCheckId() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getCheckId, insMedicalConsultationRecord.getCheckId());
        }
        if (insMedicalConsultationRecord.getCheckDate() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getCheckDate, insMedicalConsultationRecord.getCheckDate());
        }
        if (insMedicalConsultationRecord.getElderId() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getElderId, insMedicalConsultationRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getElderName())) {
            chainWrapper.set(InsMedicalConsultationRecord::getElderName, insMedicalConsultationRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getIdCard())) {
            chainWrapper.set(InsMedicalConsultationRecord::getIdCard, insMedicalConsultationRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getSex())) {
            chainWrapper.set(InsMedicalConsultationRecord::getSex, insMedicalConsultationRecord.getSex());
        }
        if (insMedicalConsultationRecord.getConsultationTime() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getConsultationTime, insMedicalConsultationRecord.getConsultationTime());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getMedicalHistory())) {
            chainWrapper.set(InsMedicalConsultationRecord::getMedicalHistory, insMedicalConsultationRecord.getMedicalHistory());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getMainContent())) {
            chainWrapper.set(InsMedicalConsultationRecord::getMainContent, insMedicalConsultationRecord.getMainContent());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getCheckResult())) {
            chainWrapper.set(InsMedicalConsultationRecord::getCheckResult, insMedicalConsultationRecord.getCheckResult());
        }
        if (insMedicalConsultationRecord.getDoctorId() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getDoctorId, insMedicalConsultationRecord.getDoctorId());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getDoctorName())) {
            chainWrapper.set(InsMedicalConsultationRecord::getDoctorName, insMedicalConsultationRecord.getDoctorName());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getRemark())) {
            chainWrapper.set(InsMedicalConsultationRecord::getRemark, insMedicalConsultationRecord.getRemark());
        }
        if (insMedicalConsultationRecord.getCreateUser() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getCreateUser, insMedicalConsultationRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insMedicalConsultationRecord.getCreateName())) {
            chainWrapper.set(InsMedicalConsultationRecord::getCreateName, insMedicalConsultationRecord.getCreateName());
        }
        if (insMedicalConsultationRecord.getCreateDept() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getCreateDept, insMedicalConsultationRecord.getCreateDept());
        }
        if (insMedicalConsultationRecord.getCreateTime() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getCreateTime, insMedicalConsultationRecord.getCreateTime());
        }
        if (insMedicalConsultationRecord.getUpdateUser() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getUpdateUser, insMedicalConsultationRecord.getUpdateUser());
        }
        if (insMedicalConsultationRecord.getUpdateTime() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getUpdateTime, insMedicalConsultationRecord.getUpdateTime());
        }
        if (insMedicalConsultationRecord.getIsDeleted() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getIsDeleted, insMedicalConsultationRecord.getIsDeleted());
        }
        if (insMedicalConsultationRecord.getStatus() != null) {
            chainWrapper.set(InsMedicalConsultationRecord::getStatus, insMedicalConsultationRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsMedicalConsultationRecord::getId, insMedicalConsultationRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insMedicalConsultationRecord.getId());
        } else {
            return insMedicalConsultationRecord;
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
    public boolean saveInsMedicalConsultationRecordBatch(List<InsMedicalConsultationRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsMedicalConsultationRecord insMedicalConsultationRecord : insertList) {
            //使用默认的雪花算法生成
            insMedicalConsultationRecord.setId(null);
            //insMedicalConsultationRecord.setCreatedDt(currentDte);
            //insMedicalConsultationRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsMedicalConsultationRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsMedicalConsultationRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


