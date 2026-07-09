package cn.pluss.platform.service.insExpensesImprestUsesRecord.impl;

import cn.pluss.platform.mapper.InsExpensesImprestUsesRecordMapper;
import cn.pluss.platform.model.entity.InsExpensesImprestUsesRecord;
import cn.pluss.platform.service.insExpensesImprestUsesRecord.InsExpensesImprestUsesRecordService;
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
@Service("insExpensesImprestUsesRecordService")
public class InsExpensesImprestUsesRecordServiceImpl extends ServiceImpl< InsExpensesImprestUsesRecordMapper, InsExpensesImprestUsesRecord> implements InsExpensesImprestUsesRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsExpensesImprestUsesRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsExpensesImprestUsesRecord> queryPage(Map map) {
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
    public InsExpensesImprestUsesRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesImprestUsesRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsExpensesImprestUsesRecord queryOne(InsExpensesImprestUsesRecord insExpensesImprestUsesRecord){
        LambdaQueryWrapper<InsExpensesImprestUsesRecord> queryWrapper = getQueryWrapper(insExpensesImprestUsesRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesImprestUsesRecord
    * @return
    */
    @Override
    public List<InsExpensesImprestUsesRecord> queryList(InsExpensesImprestUsesRecord insExpensesImprestUsesRecord) {
        LambdaQueryWrapper<InsExpensesImprestUsesRecord> queryWrapper = getQueryWrapper(insExpensesImprestUsesRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insExpensesImprestUsesRecord
    * @return
    */
    public static LambdaQueryWrapper<InsExpensesImprestUsesRecord> getQueryWrapper(InsExpensesImprestUsesRecord insExpensesImprestUsesRecord){
        LambdaQueryWrapper<InsExpensesImprestUsesRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insExpensesImprestUsesRecord.getId() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getId, insExpensesImprestUsesRecord.getId());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getTenantId())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getTenantId, insExpensesImprestUsesRecord.getTenantId());
        }
        if (insExpensesImprestUsesRecord.getCorpId() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getCorpId, insExpensesImprestUsesRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getCorpName())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getCorpName, insExpensesImprestUsesRecord.getCorpName());
        }
        if (insExpensesImprestUsesRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getInstitutionId, insExpensesImprestUsesRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getInstitutionName())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getInstitutionName, insExpensesImprestUsesRecord.getInstitutionName());
        }
        if (insExpensesImprestUsesRecord.getCheckId() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getCheckId, insExpensesImprestUsesRecord.getCheckId());
        }
        if (insExpensesImprestUsesRecord.getCheckDate() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getCheckDate, insExpensesImprestUsesRecord.getCheckDate());
        }
        if (insExpensesImprestUsesRecord.getElderId() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getElderId, insExpensesImprestUsesRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getElderName())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getElderName, insExpensesImprestUsesRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getIdCard())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getIdCard, insExpensesImprestUsesRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getSex())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getSex, insExpensesImprestUsesRecord.getSex());
        }
        if (insExpensesImprestUsesRecord.getUsesTime() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getUsesTime, insExpensesImprestUsesRecord.getUsesTime());
        }
        if (insExpensesImprestUsesRecord.getOldAmount() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getOldAmount, insExpensesImprestUsesRecord.getOldAmount());
        }
        if (insExpensesImprestUsesRecord.getUsesAmount() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getUsesAmount, insExpensesImprestUsesRecord.getUsesAmount());
        }
        if (insExpensesImprestUsesRecord.getNewAmount() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getNewAmount, insExpensesImprestUsesRecord.getNewAmount());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getUsesMemo())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getUsesMemo, insExpensesImprestUsesRecord.getUsesMemo());
        }
        if (insExpensesImprestUsesRecord.getStaffId() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getStaffId, insExpensesImprestUsesRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getStaffName())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getStaffName, insExpensesImprestUsesRecord.getStaffName());
        }
        if (insExpensesImprestUsesRecord.getUsesType() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getUsesType, insExpensesImprestUsesRecord.getUsesType());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getRemark())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getRemark, insExpensesImprestUsesRecord.getRemark());
        }
        if (insExpensesImprestUsesRecord.getCreateUser() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getCreateUser, insExpensesImprestUsesRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insExpensesImprestUsesRecord.getCreateName())) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getCreateName, insExpensesImprestUsesRecord.getCreateName());
        }
        if (insExpensesImprestUsesRecord.getCreateDept() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getCreateDept, insExpensesImprestUsesRecord.getCreateDept());
        }
        if (insExpensesImprestUsesRecord.getCreateTime() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getCreateTime, insExpensesImprestUsesRecord.getCreateTime());
        }
        if (insExpensesImprestUsesRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getUpdateUser, insExpensesImprestUsesRecord.getUpdateUser());
        }
        if (insExpensesImprestUsesRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getUpdateTime, insExpensesImprestUsesRecord.getUpdateTime());
        }
        if (insExpensesImprestUsesRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getIsDeleted, insExpensesImprestUsesRecord.getIsDeleted());
        }
        if (insExpensesImprestUsesRecord.getStatus() != null) {
            queryWrapper.eq(InsExpensesImprestUsesRecord::getStatus, insExpensesImprestUsesRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insExpensesImprestUsesRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesImprestUsesRecord insert(InsExpensesImprestUsesRecord insExpensesImprestUsesRecord) {
        insExpensesImprestUsesRecord.setId(null);
        getBaseMapper().insert(insExpensesImprestUsesRecord);
        return insExpensesImprestUsesRecord;
    }

    /**
    * 更新数据
    *
    * @param insExpensesImprestUsesRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesImprestUsesRecord update(InsExpensesImprestUsesRecord insExpensesImprestUsesRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsExpensesImprestUsesRecord> chainWrapper = new LambdaUpdateChainWrapper<InsExpensesImprestUsesRecord>(getBaseMapper());
        if (insExpensesImprestUsesRecord.getId() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getId, insExpensesImprestUsesRecord.getId());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getTenantId())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getTenantId, insExpensesImprestUsesRecord.getTenantId());
        }
        if (insExpensesImprestUsesRecord.getCorpId() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getCorpId, insExpensesImprestUsesRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getCorpName())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getCorpName, insExpensesImprestUsesRecord.getCorpName());
        }
        if (insExpensesImprestUsesRecord.getInstitutionId() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getInstitutionId, insExpensesImprestUsesRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getInstitutionName())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getInstitutionName, insExpensesImprestUsesRecord.getInstitutionName());
        }
        if (insExpensesImprestUsesRecord.getCheckId() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getCheckId, insExpensesImprestUsesRecord.getCheckId());
        }
        if (insExpensesImprestUsesRecord.getCheckDate() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getCheckDate, insExpensesImprestUsesRecord.getCheckDate());
        }
        if (insExpensesImprestUsesRecord.getElderId() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getElderId, insExpensesImprestUsesRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getElderName())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getElderName, insExpensesImprestUsesRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getIdCard())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getIdCard, insExpensesImprestUsesRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getSex())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getSex, insExpensesImprestUsesRecord.getSex());
        }
        if (insExpensesImprestUsesRecord.getUsesTime() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getUsesTime, insExpensesImprestUsesRecord.getUsesTime());
        }
        if (insExpensesImprestUsesRecord.getOldAmount() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getOldAmount, insExpensesImprestUsesRecord.getOldAmount());
        }
        if (insExpensesImprestUsesRecord.getUsesAmount() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getUsesAmount, insExpensesImprestUsesRecord.getUsesAmount());
        }
        if (insExpensesImprestUsesRecord.getNewAmount() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getNewAmount, insExpensesImprestUsesRecord.getNewAmount());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getUsesMemo())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getUsesMemo, insExpensesImprestUsesRecord.getUsesMemo());
        }
        if (insExpensesImprestUsesRecord.getStaffId() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getStaffId, insExpensesImprestUsesRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getStaffName())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getStaffName, insExpensesImprestUsesRecord.getStaffName());
        }
        if (insExpensesImprestUsesRecord.getUsesType() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getUsesType, insExpensesImprestUsesRecord.getUsesType());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getRemark())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getRemark, insExpensesImprestUsesRecord.getRemark());
        }
        if (insExpensesImprestUsesRecord.getCreateUser() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getCreateUser, insExpensesImprestUsesRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insExpensesImprestUsesRecord.getCreateName())) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getCreateName, insExpensesImprestUsesRecord.getCreateName());
        }
        if (insExpensesImprestUsesRecord.getCreateDept() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getCreateDept, insExpensesImprestUsesRecord.getCreateDept());
        }
        if (insExpensesImprestUsesRecord.getCreateTime() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getCreateTime, insExpensesImprestUsesRecord.getCreateTime());
        }
        if (insExpensesImprestUsesRecord.getUpdateUser() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getUpdateUser, insExpensesImprestUsesRecord.getUpdateUser());
        }
        if (insExpensesImprestUsesRecord.getUpdateTime() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getUpdateTime, insExpensesImprestUsesRecord.getUpdateTime());
        }
        if (insExpensesImprestUsesRecord.getIsDeleted() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getIsDeleted, insExpensesImprestUsesRecord.getIsDeleted());
        }
        if (insExpensesImprestUsesRecord.getStatus() != null) {
            chainWrapper.set(InsExpensesImprestUsesRecord::getStatus, insExpensesImprestUsesRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsExpensesImprestUsesRecord::getId, insExpensesImprestUsesRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insExpensesImprestUsesRecord.getId());
        } else {
            return insExpensesImprestUsesRecord;
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
    public boolean saveInsExpensesImprestUsesRecordBatch(List<InsExpensesImprestUsesRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsExpensesImprestUsesRecord insExpensesImprestUsesRecord : insertList) {
            //使用默认的雪花算法生成
            insExpensesImprestUsesRecord.setId(null);
            //insExpensesImprestUsesRecord.setCreatedDt(currentDte);
            //insExpensesImprestUsesRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsExpensesImprestUsesRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsExpensesImprestUsesRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


