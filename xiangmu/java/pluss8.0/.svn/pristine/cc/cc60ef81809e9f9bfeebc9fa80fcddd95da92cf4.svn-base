package cn.pluss.platform.service.insSchedulingTableChangeRecord.impl;

import cn.pluss.platform.mapper.InsSchedulingTableChangeRecordMapper;
import cn.pluss.platform.model.entity.InsSchedulingTableChangeRecord;
import cn.pluss.platform.service.insSchedulingTableChangeRecord.InsSchedulingTableChangeRecordService;
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
@Service("insSchedulingTableChangeRecordService")
public class InsSchedulingTableChangeRecordServiceImpl extends ServiceImpl< InsSchedulingTableChangeRecordMapper, InsSchedulingTableChangeRecord> implements InsSchedulingTableChangeRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsSchedulingTableChangeRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSchedulingTableChangeRecord> queryPage(Map map) {
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
    public InsSchedulingTableChangeRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingTableChangeRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsSchedulingTableChangeRecord queryOne(InsSchedulingTableChangeRecord insSchedulingTableChangeRecord){
        LambdaQueryWrapper<InsSchedulingTableChangeRecord> queryWrapper = getQueryWrapper(insSchedulingTableChangeRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSchedulingTableChangeRecord
    * @return
    */
    @Override
    public List<InsSchedulingTableChangeRecord> queryList(InsSchedulingTableChangeRecord insSchedulingTableChangeRecord) {
        LambdaQueryWrapper<InsSchedulingTableChangeRecord> queryWrapper = getQueryWrapper(insSchedulingTableChangeRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSchedulingTableChangeRecord
    * @return
    */
    public static LambdaQueryWrapper<InsSchedulingTableChangeRecord> getQueryWrapper(InsSchedulingTableChangeRecord insSchedulingTableChangeRecord){
        LambdaQueryWrapper<InsSchedulingTableChangeRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insSchedulingTableChangeRecord.getId() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getId, insSchedulingTableChangeRecord.getId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getTenantId())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getTenantId, insSchedulingTableChangeRecord.getTenantId());
        }
        if (insSchedulingTableChangeRecord.getCorpId() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getCorpId, insSchedulingTableChangeRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getCorpName())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getCorpName, insSchedulingTableChangeRecord.getCorpName());
        }
        if (insSchedulingTableChangeRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getInstitutionId, insSchedulingTableChangeRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getInstitutionName())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getInstitutionName, insSchedulingTableChangeRecord.getInstitutionName());
        }
        if (insSchedulingTableChangeRecord.getChangeType() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getChangeType, insSchedulingTableChangeRecord.getChangeType());
        }
        if (insSchedulingTableChangeRecord.getStaffIdOne() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getStaffIdOne, insSchedulingTableChangeRecord.getStaffIdOne());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getStaffNameOne())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getStaffNameOne, insSchedulingTableChangeRecord.getStaffNameOne());
        }
        if (insSchedulingTableChangeRecord.getTableIdOne() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getTableIdOne, insSchedulingTableChangeRecord.getTableIdOne());
        }
        if (insSchedulingTableChangeRecord.getTableDateOne() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getTableDateOne, insSchedulingTableChangeRecord.getTableDateOne());
        }
        if (insSchedulingTableChangeRecord.getClassesIdOne() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getClassesIdOne, insSchedulingTableChangeRecord.getClassesIdOne());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getClassesNameOne())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getClassesNameOne, insSchedulingTableChangeRecord.getClassesNameOne());
        }
        if (insSchedulingTableChangeRecord.getStaffIdTwo() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getStaffIdTwo, insSchedulingTableChangeRecord.getStaffIdTwo());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getStaffNameTwo())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getStaffNameTwo, insSchedulingTableChangeRecord.getStaffNameTwo());
        }
        if (insSchedulingTableChangeRecord.getTableIdTwo() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getTableIdTwo, insSchedulingTableChangeRecord.getTableIdTwo());
        }
        if (insSchedulingTableChangeRecord.getTableDateTwo() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getTableDateTwo, insSchedulingTableChangeRecord.getTableDateTwo());
        }
        if (insSchedulingTableChangeRecord.getClassesIdTwo() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getClassesIdTwo, insSchedulingTableChangeRecord.getClassesIdTwo());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getClassesNameTwo())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getClassesNameTwo, insSchedulingTableChangeRecord.getClassesNameTwo());
        }
        if (insSchedulingTableChangeRecord.getAuditState() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getAuditState, insSchedulingTableChangeRecord.getAuditState());
        }
        if (insSchedulingTableChangeRecord.getAuditId() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getAuditId, insSchedulingTableChangeRecord.getAuditId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getAuditName())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getAuditName, insSchedulingTableChangeRecord.getAuditName());
        }
        if (insSchedulingTableChangeRecord.getAuditTime() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getAuditTime, insSchedulingTableChangeRecord.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getAuditMemo())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getAuditMemo, insSchedulingTableChangeRecord.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getRemark())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getRemark, insSchedulingTableChangeRecord.getRemark());
        }
        if (insSchedulingTableChangeRecord.getCreateUser() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getCreateUser, insSchedulingTableChangeRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableChangeRecord.getCreateName())) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getCreateName, insSchedulingTableChangeRecord.getCreateName());
        }
        if (insSchedulingTableChangeRecord.getCreateDept() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getCreateDept, insSchedulingTableChangeRecord.getCreateDept());
        }
        if (insSchedulingTableChangeRecord.getCreateTime() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getCreateTime, insSchedulingTableChangeRecord.getCreateTime());
        }
        if (insSchedulingTableChangeRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getUpdateUser, insSchedulingTableChangeRecord.getUpdateUser());
        }
        if (insSchedulingTableChangeRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getUpdateTime, insSchedulingTableChangeRecord.getUpdateTime());
        }
        if (insSchedulingTableChangeRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getIsDeleted, insSchedulingTableChangeRecord.getIsDeleted());
        }
        if (insSchedulingTableChangeRecord.getStatus() != null) {
            queryWrapper.eq(InsSchedulingTableChangeRecord::getStatus, insSchedulingTableChangeRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSchedulingTableChangeRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingTableChangeRecord insert(InsSchedulingTableChangeRecord insSchedulingTableChangeRecord) {
        insSchedulingTableChangeRecord.setId(null);
        getBaseMapper().insert(insSchedulingTableChangeRecord);
        return insSchedulingTableChangeRecord;
    }

    /**
    * 更新数据
    *
    * @param insSchedulingTableChangeRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingTableChangeRecord update(InsSchedulingTableChangeRecord insSchedulingTableChangeRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSchedulingTableChangeRecord> chainWrapper = new LambdaUpdateChainWrapper<InsSchedulingTableChangeRecord>(getBaseMapper());
        if (insSchedulingTableChangeRecord.getId() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getId, insSchedulingTableChangeRecord.getId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getTenantId())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getTenantId, insSchedulingTableChangeRecord.getTenantId());
        }
        if (insSchedulingTableChangeRecord.getCorpId() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getCorpId, insSchedulingTableChangeRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getCorpName())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getCorpName, insSchedulingTableChangeRecord.getCorpName());
        }
        if (insSchedulingTableChangeRecord.getInstitutionId() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getInstitutionId, insSchedulingTableChangeRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getInstitutionName())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getInstitutionName, insSchedulingTableChangeRecord.getInstitutionName());
        }
        if (insSchedulingTableChangeRecord.getChangeType() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getChangeType, insSchedulingTableChangeRecord.getChangeType());
        }
        if (insSchedulingTableChangeRecord.getStaffIdOne() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getStaffIdOne, insSchedulingTableChangeRecord.getStaffIdOne());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getStaffNameOne())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getStaffNameOne, insSchedulingTableChangeRecord.getStaffNameOne());
        }
        if (insSchedulingTableChangeRecord.getTableIdOne() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getTableIdOne, insSchedulingTableChangeRecord.getTableIdOne());
        }
        if (insSchedulingTableChangeRecord.getTableDateOne() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getTableDateOne, insSchedulingTableChangeRecord.getTableDateOne());
        }
        if (insSchedulingTableChangeRecord.getClassesIdOne() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getClassesIdOne, insSchedulingTableChangeRecord.getClassesIdOne());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getClassesNameOne())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getClassesNameOne, insSchedulingTableChangeRecord.getClassesNameOne());
        }
        if (insSchedulingTableChangeRecord.getStaffIdTwo() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getStaffIdTwo, insSchedulingTableChangeRecord.getStaffIdTwo());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getStaffNameTwo())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getStaffNameTwo, insSchedulingTableChangeRecord.getStaffNameTwo());
        }
        if (insSchedulingTableChangeRecord.getTableIdTwo() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getTableIdTwo, insSchedulingTableChangeRecord.getTableIdTwo());
        }
        if (insSchedulingTableChangeRecord.getTableDateTwo() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getTableDateTwo, insSchedulingTableChangeRecord.getTableDateTwo());
        }
        if (insSchedulingTableChangeRecord.getClassesIdTwo() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getClassesIdTwo, insSchedulingTableChangeRecord.getClassesIdTwo());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getClassesNameTwo())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getClassesNameTwo, insSchedulingTableChangeRecord.getClassesNameTwo());
        }
        if (insSchedulingTableChangeRecord.getAuditState() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getAuditState, insSchedulingTableChangeRecord.getAuditState());
        }
        if (insSchedulingTableChangeRecord.getAuditId() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getAuditId, insSchedulingTableChangeRecord.getAuditId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getAuditName())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getAuditName, insSchedulingTableChangeRecord.getAuditName());
        }
        if (insSchedulingTableChangeRecord.getAuditTime() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getAuditTime, insSchedulingTableChangeRecord.getAuditTime());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getAuditMemo())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getAuditMemo, insSchedulingTableChangeRecord.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getRemark())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getRemark, insSchedulingTableChangeRecord.getRemark());
        }
        if (insSchedulingTableChangeRecord.getCreateUser() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getCreateUser, insSchedulingTableChangeRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSchedulingTableChangeRecord.getCreateName())) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getCreateName, insSchedulingTableChangeRecord.getCreateName());
        }
        if (insSchedulingTableChangeRecord.getCreateDept() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getCreateDept, insSchedulingTableChangeRecord.getCreateDept());
        }
        if (insSchedulingTableChangeRecord.getCreateTime() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getCreateTime, insSchedulingTableChangeRecord.getCreateTime());
        }
        if (insSchedulingTableChangeRecord.getUpdateUser() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getUpdateUser, insSchedulingTableChangeRecord.getUpdateUser());
        }
        if (insSchedulingTableChangeRecord.getUpdateTime() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getUpdateTime, insSchedulingTableChangeRecord.getUpdateTime());
        }
        if (insSchedulingTableChangeRecord.getIsDeleted() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getIsDeleted, insSchedulingTableChangeRecord.getIsDeleted());
        }
        if (insSchedulingTableChangeRecord.getStatus() != null) {
            chainWrapper.set(InsSchedulingTableChangeRecord::getStatus, insSchedulingTableChangeRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSchedulingTableChangeRecord::getId, insSchedulingTableChangeRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSchedulingTableChangeRecord.getId());
        } else {
            return insSchedulingTableChangeRecord;
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
    public boolean saveInsSchedulingTableChangeRecordBatch(List<InsSchedulingTableChangeRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSchedulingTableChangeRecord insSchedulingTableChangeRecord : insertList) {
            //使用默认的雪花算法生成
            insSchedulingTableChangeRecord.setId(null);
            //insSchedulingTableChangeRecord.setCreatedDt(currentDte);
            //insSchedulingTableChangeRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsSchedulingTableChangeRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSchedulingTableChangeRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


