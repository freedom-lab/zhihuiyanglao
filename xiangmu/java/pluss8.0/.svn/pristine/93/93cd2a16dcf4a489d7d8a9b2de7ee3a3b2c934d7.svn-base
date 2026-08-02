package cn.pluss.platform.service.insNursingTemporaryRecord.impl;

import cn.pluss.platform.mapper.InsNursingTemporaryRecordMapper;
import cn.pluss.platform.model.entity.InsNursingTemporaryRecord;
import cn.pluss.platform.service.insNursingTemporaryRecord.InsNursingTemporaryRecordService;
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
@Service("insNursingTemporaryRecordService")
public class InsNursingTemporaryRecordServiceImpl extends ServiceImpl< InsNursingTemporaryRecordMapper, InsNursingTemporaryRecord> implements InsNursingTemporaryRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingTemporaryRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingTemporaryRecord> queryPage(Map map) {
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
    public InsNursingTemporaryRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingTemporaryRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingTemporaryRecord queryOne(InsNursingTemporaryRecord insNursingTemporaryRecord){
        LambdaQueryWrapper<InsNursingTemporaryRecord> queryWrapper = getQueryWrapper(insNursingTemporaryRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingTemporaryRecord
    * @return
    */
    @Override
    public List<InsNursingTemporaryRecord> queryList(InsNursingTemporaryRecord insNursingTemporaryRecord) {
        LambdaQueryWrapper<InsNursingTemporaryRecord> queryWrapper = getQueryWrapper(insNursingTemporaryRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingTemporaryRecord
    * @return
    */
    public static LambdaQueryWrapper<InsNursingTemporaryRecord> getQueryWrapper(InsNursingTemporaryRecord insNursingTemporaryRecord){
        LambdaQueryWrapper<InsNursingTemporaryRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingTemporaryRecord.getId() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getId, insNursingTemporaryRecord.getId());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getTenantId())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getTenantId, insNursingTemporaryRecord.getTenantId());
        }
        if (insNursingTemporaryRecord.getCorpId() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getCorpId, insNursingTemporaryRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getCorpName())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getCorpName, insNursingTemporaryRecord.getCorpName());
        }
        if (insNursingTemporaryRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getInstitutionId, insNursingTemporaryRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getInstitutionName())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getInstitutionName, insNursingTemporaryRecord.getInstitutionName());
        }
        if (insNursingTemporaryRecord.getCheckId() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getCheckId, insNursingTemporaryRecord.getCheckId());
        }
        if (insNursingTemporaryRecord.getCheckDate() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getCheckDate, insNursingTemporaryRecord.getCheckDate());
        }
        if (insNursingTemporaryRecord.getElderId() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getElderId, insNursingTemporaryRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getElderName())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getElderName, insNursingTemporaryRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getIdCard())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getIdCard, insNursingTemporaryRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getSex())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getSex, insNursingTemporaryRecord.getSex());
        }
        if (insNursingTemporaryRecord.getNursingDate() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getNursingDate, insNursingTemporaryRecord.getNursingDate());
        }
        if (insNursingTemporaryRecord.getTypeId() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getTypeId, insNursingTemporaryRecord.getTypeId());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getTypeName())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getTypeName, insNursingTemporaryRecord.getTypeName());
        }
        if (insNursingTemporaryRecord.getItemId() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getItemId, insNursingTemporaryRecord.getItemId());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getItemName())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getItemName, insNursingTemporaryRecord.getItemName());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getItemCode())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getItemCode, insNursingTemporaryRecord.getItemCode());
        }
        if (insNursingTemporaryRecord.getNursingState() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getNursingState, insNursingTemporaryRecord.getNursingState());
        }
        if (insNursingTemporaryRecord.getServiceEndTime() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getServiceEndTime, insNursingTemporaryRecord.getServiceEndTime());
        }
        if (insNursingTemporaryRecord.getNursingStaffId() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getNursingStaffId, insNursingTemporaryRecord.getNursingStaffId());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getNursingStaffName())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getNursingStaffName, insNursingTemporaryRecord.getNursingStaffName());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getNursingPath())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getNursingPath, insNursingTemporaryRecord.getNursingPath());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getHealthInstructions())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getHealthInstructions, insNursingTemporaryRecord.getHealthInstructions());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getRemark())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getRemark, insNursingTemporaryRecord.getRemark());
        }
        if (insNursingTemporaryRecord.getCreateUser() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getCreateUser, insNursingTemporaryRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingTemporaryRecord.getCreateName())) {
            queryWrapper.eq(InsNursingTemporaryRecord::getCreateName, insNursingTemporaryRecord.getCreateName());
        }
        if (insNursingTemporaryRecord.getCreateDept() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getCreateDept, insNursingTemporaryRecord.getCreateDept());
        }
        if (insNursingTemporaryRecord.getCreateTime() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getCreateTime, insNursingTemporaryRecord.getCreateTime());
        }
        if (insNursingTemporaryRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getUpdateUser, insNursingTemporaryRecord.getUpdateUser());
        }
        if (insNursingTemporaryRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getUpdateTime, insNursingTemporaryRecord.getUpdateTime());
        }
        if (insNursingTemporaryRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getIsDeleted, insNursingTemporaryRecord.getIsDeleted());
        }
        if (insNursingTemporaryRecord.getStatus() != null) {
            queryWrapper.eq(InsNursingTemporaryRecord::getStatus, insNursingTemporaryRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingTemporaryRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingTemporaryRecord insert(InsNursingTemporaryRecord insNursingTemporaryRecord) {
        insNursingTemporaryRecord.setId(null);
        getBaseMapper().insert(insNursingTemporaryRecord);
        return insNursingTemporaryRecord;
    }

    /**
    * 更新数据
    *
    * @param insNursingTemporaryRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingTemporaryRecord update(InsNursingTemporaryRecord insNursingTemporaryRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingTemporaryRecord> chainWrapper = new LambdaUpdateChainWrapper<InsNursingTemporaryRecord>(getBaseMapper());
        if (insNursingTemporaryRecord.getId() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getId, insNursingTemporaryRecord.getId());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getTenantId())) {
            chainWrapper.set(InsNursingTemporaryRecord::getTenantId, insNursingTemporaryRecord.getTenantId());
        }
        if (insNursingTemporaryRecord.getCorpId() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getCorpId, insNursingTemporaryRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getCorpName())) {
            chainWrapper.set(InsNursingTemporaryRecord::getCorpName, insNursingTemporaryRecord.getCorpName());
        }
        if (insNursingTemporaryRecord.getInstitutionId() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getInstitutionId, insNursingTemporaryRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getInstitutionName())) {
            chainWrapper.set(InsNursingTemporaryRecord::getInstitutionName, insNursingTemporaryRecord.getInstitutionName());
        }
        if (insNursingTemporaryRecord.getCheckId() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getCheckId, insNursingTemporaryRecord.getCheckId());
        }
        if (insNursingTemporaryRecord.getCheckDate() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getCheckDate, insNursingTemporaryRecord.getCheckDate());
        }
        if (insNursingTemporaryRecord.getElderId() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getElderId, insNursingTemporaryRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getElderName())) {
            chainWrapper.set(InsNursingTemporaryRecord::getElderName, insNursingTemporaryRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getIdCard())) {
            chainWrapper.set(InsNursingTemporaryRecord::getIdCard, insNursingTemporaryRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getSex())) {
            chainWrapper.set(InsNursingTemporaryRecord::getSex, insNursingTemporaryRecord.getSex());
        }
        if (insNursingTemporaryRecord.getNursingDate() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getNursingDate, insNursingTemporaryRecord.getNursingDate());
        }
        if (insNursingTemporaryRecord.getTypeId() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getTypeId, insNursingTemporaryRecord.getTypeId());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getTypeName())) {
            chainWrapper.set(InsNursingTemporaryRecord::getTypeName, insNursingTemporaryRecord.getTypeName());
        }
        if (insNursingTemporaryRecord.getItemId() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getItemId, insNursingTemporaryRecord.getItemId());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getItemName())) {
            chainWrapper.set(InsNursingTemporaryRecord::getItemName, insNursingTemporaryRecord.getItemName());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getItemCode())) {
            chainWrapper.set(InsNursingTemporaryRecord::getItemCode, insNursingTemporaryRecord.getItemCode());
        }
        if (insNursingTemporaryRecord.getNursingState() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getNursingState, insNursingTemporaryRecord.getNursingState());
        }
        if (insNursingTemporaryRecord.getServiceEndTime() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getServiceEndTime, insNursingTemporaryRecord.getServiceEndTime());
        }
        if (insNursingTemporaryRecord.getNursingStaffId() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getNursingStaffId, insNursingTemporaryRecord.getNursingStaffId());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getNursingStaffName())) {
            chainWrapper.set(InsNursingTemporaryRecord::getNursingStaffName, insNursingTemporaryRecord.getNursingStaffName());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getNursingPath())) {
            chainWrapper.set(InsNursingTemporaryRecord::getNursingPath, insNursingTemporaryRecord.getNursingPath());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getHealthInstructions())) {
            chainWrapper.set(InsNursingTemporaryRecord::getHealthInstructions, insNursingTemporaryRecord.getHealthInstructions());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getRemark())) {
            chainWrapper.set(InsNursingTemporaryRecord::getRemark, insNursingTemporaryRecord.getRemark());
        }
        if (insNursingTemporaryRecord.getCreateUser() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getCreateUser, insNursingTemporaryRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingTemporaryRecord.getCreateName())) {
            chainWrapper.set(InsNursingTemporaryRecord::getCreateName, insNursingTemporaryRecord.getCreateName());
        }
        if (insNursingTemporaryRecord.getCreateDept() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getCreateDept, insNursingTemporaryRecord.getCreateDept());
        }
        if (insNursingTemporaryRecord.getCreateTime() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getCreateTime, insNursingTemporaryRecord.getCreateTime());
        }
        if (insNursingTemporaryRecord.getUpdateUser() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getUpdateUser, insNursingTemporaryRecord.getUpdateUser());
        }
        if (insNursingTemporaryRecord.getUpdateTime() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getUpdateTime, insNursingTemporaryRecord.getUpdateTime());
        }
        if (insNursingTemporaryRecord.getIsDeleted() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getIsDeleted, insNursingTemporaryRecord.getIsDeleted());
        }
        if (insNursingTemporaryRecord.getStatus() != null) {
            chainWrapper.set(InsNursingTemporaryRecord::getStatus, insNursingTemporaryRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingTemporaryRecord::getId, insNursingTemporaryRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingTemporaryRecord.getId());
        } else {
            return insNursingTemporaryRecord;
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
    public boolean saveInsNursingTemporaryRecordBatch(List<InsNursingTemporaryRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingTemporaryRecord insNursingTemporaryRecord : insertList) {
            //使用默认的雪花算法生成
            insNursingTemporaryRecord.setId(null);
            //insNursingTemporaryRecord.setCreatedDt(currentDte);
            //insNursingTemporaryRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingTemporaryRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingTemporaryRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


