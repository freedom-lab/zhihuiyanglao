package cn.pluss.platform.service.insExpensesExpenditureRecord.impl;

import cn.pluss.platform.mapper.InsExpensesExpenditureRecordMapper;
import cn.pluss.platform.model.entity.InsExpensesExpenditureRecord;
import cn.pluss.platform.service.insExpensesExpenditureRecord.InsExpensesExpenditureRecordService;
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
@Service("insExpensesExpenditureRecordService")
public class InsExpensesExpenditureRecordServiceImpl extends ServiceImpl< InsExpensesExpenditureRecordMapper, InsExpensesExpenditureRecord> implements InsExpensesExpenditureRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsExpensesExpenditureRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsExpensesExpenditureRecord> queryPage(Map map) {
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
    public InsExpensesExpenditureRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesExpenditureRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsExpensesExpenditureRecord queryOne(InsExpensesExpenditureRecord insExpensesExpenditureRecord){
        LambdaQueryWrapper<InsExpensesExpenditureRecord> queryWrapper = getQueryWrapper(insExpensesExpenditureRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesExpenditureRecord
    * @return
    */
    @Override
    public List<InsExpensesExpenditureRecord> queryList(InsExpensesExpenditureRecord insExpensesExpenditureRecord) {
        LambdaQueryWrapper<InsExpensesExpenditureRecord> queryWrapper = getQueryWrapper(insExpensesExpenditureRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insExpensesExpenditureRecord
    * @return
    */
    public static LambdaQueryWrapper<InsExpensesExpenditureRecord> getQueryWrapper(InsExpensesExpenditureRecord insExpensesExpenditureRecord){
        LambdaQueryWrapper<InsExpensesExpenditureRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insExpensesExpenditureRecord.getId() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getId, insExpensesExpenditureRecord.getId());
        }
        if (StringUtil.isNotEmpty(insExpensesExpenditureRecord.getTenantId())) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getTenantId, insExpensesExpenditureRecord.getTenantId());
        }
        if (insExpensesExpenditureRecord.getCorpId() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getCorpId, insExpensesExpenditureRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insExpensesExpenditureRecord.getCorpName())) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getCorpName, insExpensesExpenditureRecord.getCorpName());
        }
        if (insExpensesExpenditureRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getInstitutionId, insExpensesExpenditureRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insExpensesExpenditureRecord.getInstitutionName())) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getInstitutionName, insExpensesExpenditureRecord.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insExpensesExpenditureRecord.getYearsMonths())) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getYearsMonths, insExpensesExpenditureRecord.getYearsMonths());
        }
        if (StringUtil.isNotEmpty(insExpensesExpenditureRecord.getExpenditureType())) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getExpenditureType, insExpensesExpenditureRecord.getExpenditureType());
        }
        if (insExpensesExpenditureRecord.getExpenditureCost() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getExpenditureCost, insExpensesExpenditureRecord.getExpenditureCost());
        }
        if (StringUtil.isNotEmpty(insExpensesExpenditureRecord.getRemark())) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getRemark, insExpensesExpenditureRecord.getRemark());
        }
        if (insExpensesExpenditureRecord.getCreateUser() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getCreateUser, insExpensesExpenditureRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insExpensesExpenditureRecord.getCreateName())) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getCreateName, insExpensesExpenditureRecord.getCreateName());
        }
        if (insExpensesExpenditureRecord.getCreateDept() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getCreateDept, insExpensesExpenditureRecord.getCreateDept());
        }
        if (insExpensesExpenditureRecord.getCreateTime() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getCreateTime, insExpensesExpenditureRecord.getCreateTime());
        }
        if (insExpensesExpenditureRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getUpdateUser, insExpensesExpenditureRecord.getUpdateUser());
        }
        if (insExpensesExpenditureRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getUpdateTime, insExpensesExpenditureRecord.getUpdateTime());
        }
        if (insExpensesExpenditureRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getIsDeleted, insExpensesExpenditureRecord.getIsDeleted());
        }
        if (insExpensesExpenditureRecord.getStatus() != null) {
            queryWrapper.eq(InsExpensesExpenditureRecord::getStatus, insExpensesExpenditureRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insExpensesExpenditureRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesExpenditureRecord insert(InsExpensesExpenditureRecord insExpensesExpenditureRecord) {
        insExpensesExpenditureRecord.setId(null);
        getBaseMapper().insert(insExpensesExpenditureRecord);
        return insExpensesExpenditureRecord;
    }

    /**
    * 更新数据
    *
    * @param insExpensesExpenditureRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesExpenditureRecord update(InsExpensesExpenditureRecord insExpensesExpenditureRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsExpensesExpenditureRecord> chainWrapper = new LambdaUpdateChainWrapper<InsExpensesExpenditureRecord>(getBaseMapper());
        if (insExpensesExpenditureRecord.getId() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getId, insExpensesExpenditureRecord.getId());
        }
        if (StringUtil.isNotBlank(insExpensesExpenditureRecord.getTenantId())) {
            chainWrapper.set(InsExpensesExpenditureRecord::getTenantId, insExpensesExpenditureRecord.getTenantId());
        }
        if (insExpensesExpenditureRecord.getCorpId() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getCorpId, insExpensesExpenditureRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insExpensesExpenditureRecord.getCorpName())) {
            chainWrapper.set(InsExpensesExpenditureRecord::getCorpName, insExpensesExpenditureRecord.getCorpName());
        }
        if (insExpensesExpenditureRecord.getInstitutionId() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getInstitutionId, insExpensesExpenditureRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insExpensesExpenditureRecord.getInstitutionName())) {
            chainWrapper.set(InsExpensesExpenditureRecord::getInstitutionName, insExpensesExpenditureRecord.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insExpensesExpenditureRecord.getYearsMonths())) {
            chainWrapper.set(InsExpensesExpenditureRecord::getYearsMonths, insExpensesExpenditureRecord.getYearsMonths());
        }
        if (StringUtil.isNotBlank(insExpensesExpenditureRecord.getExpenditureType())) {
            chainWrapper.set(InsExpensesExpenditureRecord::getExpenditureType, insExpensesExpenditureRecord.getExpenditureType());
        }
        if (insExpensesExpenditureRecord.getExpenditureCost() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getExpenditureCost, insExpensesExpenditureRecord.getExpenditureCost());
        }
        if (StringUtil.isNotBlank(insExpensesExpenditureRecord.getRemark())) {
            chainWrapper.set(InsExpensesExpenditureRecord::getRemark, insExpensesExpenditureRecord.getRemark());
        }
        if (insExpensesExpenditureRecord.getCreateUser() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getCreateUser, insExpensesExpenditureRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insExpensesExpenditureRecord.getCreateName())) {
            chainWrapper.set(InsExpensesExpenditureRecord::getCreateName, insExpensesExpenditureRecord.getCreateName());
        }
        if (insExpensesExpenditureRecord.getCreateDept() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getCreateDept, insExpensesExpenditureRecord.getCreateDept());
        }
        if (insExpensesExpenditureRecord.getCreateTime() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getCreateTime, insExpensesExpenditureRecord.getCreateTime());
        }
        if (insExpensesExpenditureRecord.getUpdateUser() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getUpdateUser, insExpensesExpenditureRecord.getUpdateUser());
        }
        if (insExpensesExpenditureRecord.getUpdateTime() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getUpdateTime, insExpensesExpenditureRecord.getUpdateTime());
        }
        if (insExpensesExpenditureRecord.getIsDeleted() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getIsDeleted, insExpensesExpenditureRecord.getIsDeleted());
        }
        if (insExpensesExpenditureRecord.getStatus() != null) {
            chainWrapper.set(InsExpensesExpenditureRecord::getStatus, insExpensesExpenditureRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsExpensesExpenditureRecord::getId, insExpensesExpenditureRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insExpensesExpenditureRecord.getId());
        } else {
            return insExpensesExpenditureRecord;
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
    public boolean saveInsExpensesExpenditureRecordBatch(List<InsExpensesExpenditureRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsExpensesExpenditureRecord insExpensesExpenditureRecord : insertList) {
            //使用默认的雪花算法生成
            insExpensesExpenditureRecord.setId(null);
            //insExpensesExpenditureRecord.setCreatedDt(currentDte);
            //insExpensesExpenditureRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsExpensesExpenditureRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsExpensesExpenditureRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


