package cn.pluss.platform.service.insStaffSalaryRecord.impl;

import cn.pluss.platform.mapper.InsStaffSalaryRecordMapper;
import cn.pluss.platform.model.entity.InsStaffSalaryRecord;
import cn.pluss.platform.service.insStaffSalaryRecord.InsStaffSalaryRecordService;
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
@Service("insStaffSalaryRecordService")
public class InsStaffSalaryRecordServiceImpl extends ServiceImpl< InsStaffSalaryRecordMapper, InsStaffSalaryRecord> implements InsStaffSalaryRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffSalaryRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffSalaryRecord> queryPage(Map map) {
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
    public InsStaffSalaryRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffSalaryRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffSalaryRecord queryOne(InsStaffSalaryRecord insStaffSalaryRecord){
        LambdaQueryWrapper<InsStaffSalaryRecord> queryWrapper = getQueryWrapper(insStaffSalaryRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffSalaryRecord
    * @return
    */
    @Override
    public List<InsStaffSalaryRecord> queryList(InsStaffSalaryRecord insStaffSalaryRecord) {
        LambdaQueryWrapper<InsStaffSalaryRecord> queryWrapper = getQueryWrapper(insStaffSalaryRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffSalaryRecord
    * @return
    */
    public static LambdaQueryWrapper<InsStaffSalaryRecord> getQueryWrapper(InsStaffSalaryRecord insStaffSalaryRecord){
        LambdaQueryWrapper<InsStaffSalaryRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffSalaryRecord.getId() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getId, insStaffSalaryRecord.getId());
        }
        if (StringUtil.isNotEmpty(insStaffSalaryRecord.getTenantId())) {
            queryWrapper.eq(InsStaffSalaryRecord::getTenantId, insStaffSalaryRecord.getTenantId());
        }
        if (insStaffSalaryRecord.getCorpId() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getCorpId, insStaffSalaryRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insStaffSalaryRecord.getCorpName())) {
            queryWrapper.eq(InsStaffSalaryRecord::getCorpName, insStaffSalaryRecord.getCorpName());
        }
        if (insStaffSalaryRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getInstitutionId, insStaffSalaryRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insStaffSalaryRecord.getInstitutionName())) {
            queryWrapper.eq(InsStaffSalaryRecord::getInstitutionName, insStaffSalaryRecord.getInstitutionName());
        }
        if (insStaffSalaryRecord.getStaffId() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getStaffId, insStaffSalaryRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insStaffSalaryRecord.getStaffName())) {
            queryWrapper.eq(InsStaffSalaryRecord::getStaffName, insStaffSalaryRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insStaffSalaryRecord.getSex())) {
            queryWrapper.eq(InsStaffSalaryRecord::getSex, insStaffSalaryRecord.getSex());
        }
        if (StringUtil.isNotEmpty(insStaffSalaryRecord.getIdCard())) {
            queryWrapper.eq(InsStaffSalaryRecord::getIdCard, insStaffSalaryRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insStaffSalaryRecord.getGrantMonth())) {
            queryWrapper.eq(InsStaffSalaryRecord::getGrantMonth, insStaffSalaryRecord.getGrantMonth());
        }
        if (insStaffSalaryRecord.getGrantDate() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getGrantDate, insStaffSalaryRecord.getGrantDate());
        }
        if (insStaffSalaryRecord.getSalaryAmount() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getSalaryAmount, insStaffSalaryRecord.getSalaryAmount());
        }
        if (StringUtil.isNotEmpty(insStaffSalaryRecord.getRemark())) {
            queryWrapper.eq(InsStaffSalaryRecord::getRemark, insStaffSalaryRecord.getRemark());
        }
        if (insStaffSalaryRecord.getCreateUser() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getCreateUser, insStaffSalaryRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffSalaryRecord.getCreateName())) {
            queryWrapper.eq(InsStaffSalaryRecord::getCreateName, insStaffSalaryRecord.getCreateName());
        }
        if (insStaffSalaryRecord.getCreateDept() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getCreateDept, insStaffSalaryRecord.getCreateDept());
        }
        if (insStaffSalaryRecord.getCreateTime() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getCreateTime, insStaffSalaryRecord.getCreateTime());
        }
        if (insStaffSalaryRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getUpdateUser, insStaffSalaryRecord.getUpdateUser());
        }
        if (insStaffSalaryRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getUpdateTime, insStaffSalaryRecord.getUpdateTime());
        }
        if (insStaffSalaryRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getIsDeleted, insStaffSalaryRecord.getIsDeleted());
        }
        if (insStaffSalaryRecord.getStatus() != null) {
            queryWrapper.eq(InsStaffSalaryRecord::getStatus, insStaffSalaryRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffSalaryRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffSalaryRecord insert(InsStaffSalaryRecord insStaffSalaryRecord) {
        insStaffSalaryRecord.setId(null);
        getBaseMapper().insert(insStaffSalaryRecord);
        return insStaffSalaryRecord;
    }

    /**
    * 更新数据
    *
    * @param insStaffSalaryRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffSalaryRecord update(InsStaffSalaryRecord insStaffSalaryRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffSalaryRecord> chainWrapper = new LambdaUpdateChainWrapper<InsStaffSalaryRecord>(getBaseMapper());
        if (insStaffSalaryRecord.getId() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getId, insStaffSalaryRecord.getId());
        }
        if (StringUtil.isNotBlank(insStaffSalaryRecord.getTenantId())) {
            chainWrapper.set(InsStaffSalaryRecord::getTenantId, insStaffSalaryRecord.getTenantId());
        }
        if (insStaffSalaryRecord.getCorpId() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getCorpId, insStaffSalaryRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insStaffSalaryRecord.getCorpName())) {
            chainWrapper.set(InsStaffSalaryRecord::getCorpName, insStaffSalaryRecord.getCorpName());
        }
        if (insStaffSalaryRecord.getInstitutionId() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getInstitutionId, insStaffSalaryRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insStaffSalaryRecord.getInstitutionName())) {
            chainWrapper.set(InsStaffSalaryRecord::getInstitutionName, insStaffSalaryRecord.getInstitutionName());
        }
        if (insStaffSalaryRecord.getStaffId() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getStaffId, insStaffSalaryRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insStaffSalaryRecord.getStaffName())) {
            chainWrapper.set(InsStaffSalaryRecord::getStaffName, insStaffSalaryRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insStaffSalaryRecord.getSex())) {
            chainWrapper.set(InsStaffSalaryRecord::getSex, insStaffSalaryRecord.getSex());
        }
        if (StringUtil.isNotBlank(insStaffSalaryRecord.getIdCard())) {
            chainWrapper.set(InsStaffSalaryRecord::getIdCard, insStaffSalaryRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insStaffSalaryRecord.getGrantMonth())) {
            chainWrapper.set(InsStaffSalaryRecord::getGrantMonth, insStaffSalaryRecord.getGrantMonth());
        }
        if (insStaffSalaryRecord.getGrantDate() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getGrantDate, insStaffSalaryRecord.getGrantDate());
        }
        if (insStaffSalaryRecord.getSalaryAmount() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getSalaryAmount, insStaffSalaryRecord.getSalaryAmount());
        }
        if (StringUtil.isNotBlank(insStaffSalaryRecord.getRemark())) {
            chainWrapper.set(InsStaffSalaryRecord::getRemark, insStaffSalaryRecord.getRemark());
        }
        if (insStaffSalaryRecord.getCreateUser() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getCreateUser, insStaffSalaryRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffSalaryRecord.getCreateName())) {
            chainWrapper.set(InsStaffSalaryRecord::getCreateName, insStaffSalaryRecord.getCreateName());
        }
        if (insStaffSalaryRecord.getCreateDept() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getCreateDept, insStaffSalaryRecord.getCreateDept());
        }
        if (insStaffSalaryRecord.getCreateTime() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getCreateTime, insStaffSalaryRecord.getCreateTime());
        }
        if (insStaffSalaryRecord.getUpdateUser() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getUpdateUser, insStaffSalaryRecord.getUpdateUser());
        }
        if (insStaffSalaryRecord.getUpdateTime() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getUpdateTime, insStaffSalaryRecord.getUpdateTime());
        }
        if (insStaffSalaryRecord.getIsDeleted() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getIsDeleted, insStaffSalaryRecord.getIsDeleted());
        }
        if (insStaffSalaryRecord.getStatus() != null) {
            chainWrapper.set(InsStaffSalaryRecord::getStatus, insStaffSalaryRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffSalaryRecord::getId, insStaffSalaryRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffSalaryRecord.getId());
        } else {
            return insStaffSalaryRecord;
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
    public boolean saveInsStaffSalaryRecordBatch(List<InsStaffSalaryRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffSalaryRecord insStaffSalaryRecord : insertList) {
            //使用默认的雪花算法生成
            insStaffSalaryRecord.setId(null);
            //insStaffSalaryRecord.setCreatedDt(currentDte);
            //insStaffSalaryRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffSalaryRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffSalaryRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


