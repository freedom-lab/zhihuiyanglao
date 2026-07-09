package cn.pluss.platform.service.insStaffDimissionRecord.impl;

import cn.pluss.platform.mapper.InsStaffDimissionRecordMapper;
import cn.pluss.platform.model.entity.InsStaffDimissionRecord;
import cn.pluss.platform.service.insStaffDimissionRecord.InsStaffDimissionRecordService;
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
@Service("insStaffDimissionRecordService")
public class InsStaffDimissionRecordServiceImpl extends ServiceImpl< InsStaffDimissionRecordMapper, InsStaffDimissionRecord> implements InsStaffDimissionRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffDimissionRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffDimissionRecord> queryPage(Map map) {
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
    public InsStaffDimissionRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffDimissionRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffDimissionRecord queryOne(InsStaffDimissionRecord insStaffDimissionRecord){
        LambdaQueryWrapper<InsStaffDimissionRecord> queryWrapper = getQueryWrapper(insStaffDimissionRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffDimissionRecord
    * @return
    */
    @Override
    public List<InsStaffDimissionRecord> queryList(InsStaffDimissionRecord insStaffDimissionRecord) {
        LambdaQueryWrapper<InsStaffDimissionRecord> queryWrapper = getQueryWrapper(insStaffDimissionRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffDimissionRecord
    * @return
    */
    public static LambdaQueryWrapper<InsStaffDimissionRecord> getQueryWrapper(InsStaffDimissionRecord insStaffDimissionRecord){
        LambdaQueryWrapper<InsStaffDimissionRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffDimissionRecord.getId() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getId, insStaffDimissionRecord.getId());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getTenantId())) {
            queryWrapper.eq(InsStaffDimissionRecord::getTenantId, insStaffDimissionRecord.getTenantId());
        }
        if (insStaffDimissionRecord.getCorpId() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getCorpId, insStaffDimissionRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getCorpName())) {
            queryWrapper.eq(InsStaffDimissionRecord::getCorpName, insStaffDimissionRecord.getCorpName());
        }
        if (insStaffDimissionRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getInstitutionId, insStaffDimissionRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getInstitutionName())) {
            queryWrapper.eq(InsStaffDimissionRecord::getInstitutionName, insStaffDimissionRecord.getInstitutionName());
        }
        if (insStaffDimissionRecord.getStaffId() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getStaffId, insStaffDimissionRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getStaffName())) {
            queryWrapper.eq(InsStaffDimissionRecord::getStaffName, insStaffDimissionRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getSex())) {
            queryWrapper.eq(InsStaffDimissionRecord::getSex, insStaffDimissionRecord.getSex());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getIdCard())) {
            queryWrapper.eq(InsStaffDimissionRecord::getIdCard, insStaffDimissionRecord.getIdCard());
        }
        if (insStaffDimissionRecord.getEntryDate() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getEntryDate, insStaffDimissionRecord.getEntryDate());
        }
        if (insStaffDimissionRecord.getDimissionDate() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getDimissionDate, insStaffDimissionRecord.getDimissionDate());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getDimissionType())) {
            queryWrapper.eq(InsStaffDimissionRecord::getDimissionType, insStaffDimissionRecord.getDimissionType());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getDimissionMemo())) {
            queryWrapper.eq(InsStaffDimissionRecord::getDimissionMemo, insStaffDimissionRecord.getDimissionMemo());
        }
        if (insStaffDimissionRecord.getAuditState() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getAuditState, insStaffDimissionRecord.getAuditState());
        }
        if (insStaffDimissionRecord.getAuditId() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getAuditId, insStaffDimissionRecord.getAuditId());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getAuditName())) {
            queryWrapper.eq(InsStaffDimissionRecord::getAuditName, insStaffDimissionRecord.getAuditName());
        }
        if (insStaffDimissionRecord.getAuditTime() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getAuditTime, insStaffDimissionRecord.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getAuditMemo())) {
            queryWrapper.eq(InsStaffDimissionRecord::getAuditMemo, insStaffDimissionRecord.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getRemark())) {
            queryWrapper.eq(InsStaffDimissionRecord::getRemark, insStaffDimissionRecord.getRemark());
        }
        if (insStaffDimissionRecord.getCreateUser() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getCreateUser, insStaffDimissionRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffDimissionRecord.getCreateName())) {
            queryWrapper.eq(InsStaffDimissionRecord::getCreateName, insStaffDimissionRecord.getCreateName());
        }
        if (insStaffDimissionRecord.getCreateDept() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getCreateDept, insStaffDimissionRecord.getCreateDept());
        }
        if (insStaffDimissionRecord.getCreateTime() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getCreateTime, insStaffDimissionRecord.getCreateTime());
        }
        if (insStaffDimissionRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getUpdateUser, insStaffDimissionRecord.getUpdateUser());
        }
        if (insStaffDimissionRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getUpdateTime, insStaffDimissionRecord.getUpdateTime());
        }
        if (insStaffDimissionRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getIsDeleted, insStaffDimissionRecord.getIsDeleted());
        }
        if (insStaffDimissionRecord.getStatus() != null) {
            queryWrapper.eq(InsStaffDimissionRecord::getStatus, insStaffDimissionRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffDimissionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffDimissionRecord insert(InsStaffDimissionRecord insStaffDimissionRecord) {
        insStaffDimissionRecord.setId(null);
        getBaseMapper().insert(insStaffDimissionRecord);
        return insStaffDimissionRecord;
    }

    /**
    * 更新数据
    *
    * @param insStaffDimissionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffDimissionRecord update(InsStaffDimissionRecord insStaffDimissionRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffDimissionRecord> chainWrapper = new LambdaUpdateChainWrapper<InsStaffDimissionRecord>(getBaseMapper());
        if (insStaffDimissionRecord.getId() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getId, insStaffDimissionRecord.getId());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getTenantId())) {
            chainWrapper.set(InsStaffDimissionRecord::getTenantId, insStaffDimissionRecord.getTenantId());
        }
        if (insStaffDimissionRecord.getCorpId() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getCorpId, insStaffDimissionRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getCorpName())) {
            chainWrapper.set(InsStaffDimissionRecord::getCorpName, insStaffDimissionRecord.getCorpName());
        }
        if (insStaffDimissionRecord.getInstitutionId() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getInstitutionId, insStaffDimissionRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getInstitutionName())) {
            chainWrapper.set(InsStaffDimissionRecord::getInstitutionName, insStaffDimissionRecord.getInstitutionName());
        }
        if (insStaffDimissionRecord.getStaffId() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getStaffId, insStaffDimissionRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getStaffName())) {
            chainWrapper.set(InsStaffDimissionRecord::getStaffName, insStaffDimissionRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getSex())) {
            chainWrapper.set(InsStaffDimissionRecord::getSex, insStaffDimissionRecord.getSex());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getIdCard())) {
            chainWrapper.set(InsStaffDimissionRecord::getIdCard, insStaffDimissionRecord.getIdCard());
        }
        if (insStaffDimissionRecord.getEntryDate() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getEntryDate, insStaffDimissionRecord.getEntryDate());
        }
        if (insStaffDimissionRecord.getDimissionDate() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getDimissionDate, insStaffDimissionRecord.getDimissionDate());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getDimissionType())) {
            chainWrapper.set(InsStaffDimissionRecord::getDimissionType, insStaffDimissionRecord.getDimissionType());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getDimissionMemo())) {
            chainWrapper.set(InsStaffDimissionRecord::getDimissionMemo, insStaffDimissionRecord.getDimissionMemo());
        }
        if (insStaffDimissionRecord.getAuditState() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getAuditState, insStaffDimissionRecord.getAuditState());
        }
        if (insStaffDimissionRecord.getAuditId() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getAuditId, insStaffDimissionRecord.getAuditId());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getAuditName())) {
            chainWrapper.set(InsStaffDimissionRecord::getAuditName, insStaffDimissionRecord.getAuditName());
        }
        if (insStaffDimissionRecord.getAuditTime() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getAuditTime, insStaffDimissionRecord.getAuditTime());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getAuditMemo())) {
            chainWrapper.set(InsStaffDimissionRecord::getAuditMemo, insStaffDimissionRecord.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getRemark())) {
            chainWrapper.set(InsStaffDimissionRecord::getRemark, insStaffDimissionRecord.getRemark());
        }
        if (insStaffDimissionRecord.getCreateUser() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getCreateUser, insStaffDimissionRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffDimissionRecord.getCreateName())) {
            chainWrapper.set(InsStaffDimissionRecord::getCreateName, insStaffDimissionRecord.getCreateName());
        }
        if (insStaffDimissionRecord.getCreateDept() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getCreateDept, insStaffDimissionRecord.getCreateDept());
        }
        if (insStaffDimissionRecord.getCreateTime() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getCreateTime, insStaffDimissionRecord.getCreateTime());
        }
        if (insStaffDimissionRecord.getUpdateUser() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getUpdateUser, insStaffDimissionRecord.getUpdateUser());
        }
        if (insStaffDimissionRecord.getUpdateTime() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getUpdateTime, insStaffDimissionRecord.getUpdateTime());
        }
        if (insStaffDimissionRecord.getIsDeleted() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getIsDeleted, insStaffDimissionRecord.getIsDeleted());
        }
        if (insStaffDimissionRecord.getStatus() != null) {
            chainWrapper.set(InsStaffDimissionRecord::getStatus, insStaffDimissionRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffDimissionRecord::getId, insStaffDimissionRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffDimissionRecord.getId());
        } else {
            return insStaffDimissionRecord;
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
    public boolean saveInsStaffDimissionRecordBatch(List<InsStaffDimissionRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffDimissionRecord insStaffDimissionRecord : insertList) {
            //使用默认的雪花算法生成
            insStaffDimissionRecord.setId(null);
            //insStaffDimissionRecord.setCreatedDt(currentDte);
            //insStaffDimissionRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffDimissionRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffDimissionRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


