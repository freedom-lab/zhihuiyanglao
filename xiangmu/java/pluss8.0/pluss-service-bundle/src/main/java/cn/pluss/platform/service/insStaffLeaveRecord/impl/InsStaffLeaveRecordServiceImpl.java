package cn.pluss.platform.service.insStaffLeaveRecord.impl;

import cn.pluss.platform.mapper.InsStaffLeaveRecordMapper;
import cn.pluss.platform.model.entity.InsStaffLeaveRecord;
import cn.pluss.platform.service.insStaffLeaveRecord.InsStaffLeaveRecordService;
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
@Service("insStaffLeaveRecordService")
public class InsStaffLeaveRecordServiceImpl extends ServiceImpl< InsStaffLeaveRecordMapper, InsStaffLeaveRecord> implements InsStaffLeaveRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffLeaveRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffLeaveRecord> queryPage(Map map) {
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
    public InsStaffLeaveRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffLeaveRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffLeaveRecord queryOne(InsStaffLeaveRecord insStaffLeaveRecord){
        LambdaQueryWrapper<InsStaffLeaveRecord> queryWrapper = getQueryWrapper(insStaffLeaveRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffLeaveRecord
    * @return
    */
    @Override
    public List<InsStaffLeaveRecord> queryList(InsStaffLeaveRecord insStaffLeaveRecord) {
        LambdaQueryWrapper<InsStaffLeaveRecord> queryWrapper = getQueryWrapper(insStaffLeaveRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffLeaveRecord
    * @return
    */
    public static LambdaQueryWrapper<InsStaffLeaveRecord> getQueryWrapper(InsStaffLeaveRecord insStaffLeaveRecord){
        LambdaQueryWrapper<InsStaffLeaveRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffLeaveRecord.getId() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getId, insStaffLeaveRecord.getId());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getTenantId())) {
            queryWrapper.eq(InsStaffLeaveRecord::getTenantId, insStaffLeaveRecord.getTenantId());
        }
        if (insStaffLeaveRecord.getCorpId() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getCorpId, insStaffLeaveRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getCorpName())) {
            queryWrapper.eq(InsStaffLeaveRecord::getCorpName, insStaffLeaveRecord.getCorpName());
        }
        if (insStaffLeaveRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getInstitutionId, insStaffLeaveRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getInstitutionName())) {
            queryWrapper.eq(InsStaffLeaveRecord::getInstitutionName, insStaffLeaveRecord.getInstitutionName());
        }
        if (insStaffLeaveRecord.getStaffId() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getStaffId, insStaffLeaveRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getStaffName())) {
            queryWrapper.eq(InsStaffLeaveRecord::getStaffName, insStaffLeaveRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getSex())) {
            queryWrapper.eq(InsStaffLeaveRecord::getSex, insStaffLeaveRecord.getSex());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getIdCard())) {
            queryWrapper.eq(InsStaffLeaveRecord::getIdCard, insStaffLeaveRecord.getIdCard());
        }
        if (insStaffLeaveRecord.getLeaveState() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getLeaveState, insStaffLeaveRecord.getLeaveState());
        }
        if (insStaffLeaveRecord.getStartTime() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getStartTime, insStaffLeaveRecord.getStartTime());
        }
        if (insStaffLeaveRecord.getRealityTime() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getRealityTime, insStaffLeaveRecord.getRealityTime());
        }
        if (insStaffLeaveRecord.getLeaveDay() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getLeaveDay, insStaffLeaveRecord.getLeaveDay());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getLeaveMemo())) {
            queryWrapper.eq(InsStaffLeaveRecord::getLeaveMemo, insStaffLeaveRecord.getLeaveMemo());
        }
        if (insStaffLeaveRecord.getAuditState() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getAuditState, insStaffLeaveRecord.getAuditState());
        }
        if (insStaffLeaveRecord.getAuditId() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getAuditId, insStaffLeaveRecord.getAuditId());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getAuditName())) {
            queryWrapper.eq(InsStaffLeaveRecord::getAuditName, insStaffLeaveRecord.getAuditName());
        }
        if (insStaffLeaveRecord.getAuditTime() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getAuditTime, insStaffLeaveRecord.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getAuditMemo())) {
            queryWrapper.eq(InsStaffLeaveRecord::getAuditMemo, insStaffLeaveRecord.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getRemark())) {
            queryWrapper.eq(InsStaffLeaveRecord::getRemark, insStaffLeaveRecord.getRemark());
        }
        if (insStaffLeaveRecord.getCreateUser() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getCreateUser, insStaffLeaveRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffLeaveRecord.getCreateName())) {
            queryWrapper.eq(InsStaffLeaveRecord::getCreateName, insStaffLeaveRecord.getCreateName());
        }
        if (insStaffLeaveRecord.getCreateDept() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getCreateDept, insStaffLeaveRecord.getCreateDept());
        }
        if (insStaffLeaveRecord.getCreateTime() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getCreateTime, insStaffLeaveRecord.getCreateTime());
        }
        if (insStaffLeaveRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getUpdateUser, insStaffLeaveRecord.getUpdateUser());
        }
        if (insStaffLeaveRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getUpdateTime, insStaffLeaveRecord.getUpdateTime());
        }
        if (insStaffLeaveRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getIsDeleted, insStaffLeaveRecord.getIsDeleted());
        }
        if (insStaffLeaveRecord.getStatus() != null) {
            queryWrapper.eq(InsStaffLeaveRecord::getStatus, insStaffLeaveRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffLeaveRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffLeaveRecord insert(InsStaffLeaveRecord insStaffLeaveRecord) {
        insStaffLeaveRecord.setId(null);
        getBaseMapper().insert(insStaffLeaveRecord);
        return insStaffLeaveRecord;
    }

    /**
    * 更新数据
    *
    * @param insStaffLeaveRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffLeaveRecord update(InsStaffLeaveRecord insStaffLeaveRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffLeaveRecord> chainWrapper = new LambdaUpdateChainWrapper<InsStaffLeaveRecord>(getBaseMapper());
        if (insStaffLeaveRecord.getId() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getId, insStaffLeaveRecord.getId());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getTenantId())) {
            chainWrapper.set(InsStaffLeaveRecord::getTenantId, insStaffLeaveRecord.getTenantId());
        }
        if (insStaffLeaveRecord.getCorpId() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getCorpId, insStaffLeaveRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getCorpName())) {
            chainWrapper.set(InsStaffLeaveRecord::getCorpName, insStaffLeaveRecord.getCorpName());
        }
        if (insStaffLeaveRecord.getInstitutionId() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getInstitutionId, insStaffLeaveRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getInstitutionName())) {
            chainWrapper.set(InsStaffLeaveRecord::getInstitutionName, insStaffLeaveRecord.getInstitutionName());
        }
        if (insStaffLeaveRecord.getStaffId() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getStaffId, insStaffLeaveRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getStaffName())) {
            chainWrapper.set(InsStaffLeaveRecord::getStaffName, insStaffLeaveRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getSex())) {
            chainWrapper.set(InsStaffLeaveRecord::getSex, insStaffLeaveRecord.getSex());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getIdCard())) {
            chainWrapper.set(InsStaffLeaveRecord::getIdCard, insStaffLeaveRecord.getIdCard());
        }
        if (insStaffLeaveRecord.getLeaveState() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getLeaveState, insStaffLeaveRecord.getLeaveState());
        }
        if (insStaffLeaveRecord.getStartTime() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getStartTime, insStaffLeaveRecord.getStartTime());
        }
        if (insStaffLeaveRecord.getRealityTime() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getRealityTime, insStaffLeaveRecord.getRealityTime());
        }
        if (insStaffLeaveRecord.getLeaveDay() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getLeaveDay, insStaffLeaveRecord.getLeaveDay());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getLeaveMemo())) {
            chainWrapper.set(InsStaffLeaveRecord::getLeaveMemo, insStaffLeaveRecord.getLeaveMemo());
        }
        if (insStaffLeaveRecord.getAuditState() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getAuditState, insStaffLeaveRecord.getAuditState());
        }
        if (insStaffLeaveRecord.getAuditId() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getAuditId, insStaffLeaveRecord.getAuditId());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getAuditName())) {
            chainWrapper.set(InsStaffLeaveRecord::getAuditName, insStaffLeaveRecord.getAuditName());
        }
        if (insStaffLeaveRecord.getAuditTime() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getAuditTime, insStaffLeaveRecord.getAuditTime());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getAuditMemo())) {
            chainWrapper.set(InsStaffLeaveRecord::getAuditMemo, insStaffLeaveRecord.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getRemark())) {
            chainWrapper.set(InsStaffLeaveRecord::getRemark, insStaffLeaveRecord.getRemark());
        }
        if (insStaffLeaveRecord.getCreateUser() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getCreateUser, insStaffLeaveRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffLeaveRecord.getCreateName())) {
            chainWrapper.set(InsStaffLeaveRecord::getCreateName, insStaffLeaveRecord.getCreateName());
        }
        if (insStaffLeaveRecord.getCreateDept() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getCreateDept, insStaffLeaveRecord.getCreateDept());
        }
        if (insStaffLeaveRecord.getCreateTime() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getCreateTime, insStaffLeaveRecord.getCreateTime());
        }
        if (insStaffLeaveRecord.getUpdateUser() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getUpdateUser, insStaffLeaveRecord.getUpdateUser());
        }
        if (insStaffLeaveRecord.getUpdateTime() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getUpdateTime, insStaffLeaveRecord.getUpdateTime());
        }
        if (insStaffLeaveRecord.getIsDeleted() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getIsDeleted, insStaffLeaveRecord.getIsDeleted());
        }
        if (insStaffLeaveRecord.getStatus() != null) {
            chainWrapper.set(InsStaffLeaveRecord::getStatus, insStaffLeaveRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffLeaveRecord::getId, insStaffLeaveRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffLeaveRecord.getId());
        } else {
            return insStaffLeaveRecord;
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
    public boolean saveInsStaffLeaveRecordBatch(List<InsStaffLeaveRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffLeaveRecord insStaffLeaveRecord : insertList) {
            //使用默认的雪花算法生成
            insStaffLeaveRecord.setId(null);
            //insStaffLeaveRecord.setCreatedDt(currentDte);
            //insStaffLeaveRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffLeaveRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffLeaveRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


