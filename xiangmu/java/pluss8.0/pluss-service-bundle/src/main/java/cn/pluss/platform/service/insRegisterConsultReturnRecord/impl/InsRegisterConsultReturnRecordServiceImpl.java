package cn.pluss.platform.service.insRegisterConsultReturnRecord.impl;

import cn.pluss.platform.mapper.InsRegisterConsultReturnRecordMapper;
import cn.pluss.platform.model.entity.InsRegisterConsultReturnRecord;
import cn.pluss.platform.service.insRegisterConsultReturnRecord.InsRegisterConsultReturnRecordService;
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
@Service("insRegisterConsultReturnRecordService")
public class InsRegisterConsultReturnRecordServiceImpl extends ServiceImpl< InsRegisterConsultReturnRecordMapper, InsRegisterConsultReturnRecord> implements InsRegisterConsultReturnRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsRegisterConsultReturnRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsRegisterConsultReturnRecord> queryPage(Map map) {
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
    public InsRegisterConsultReturnRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insRegisterConsultReturnRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsRegisterConsultReturnRecord queryOne(InsRegisterConsultReturnRecord insRegisterConsultReturnRecord){
        LambdaQueryWrapper<InsRegisterConsultReturnRecord> queryWrapper = getQueryWrapper(insRegisterConsultReturnRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insRegisterConsultReturnRecord
    * @return
    */
    @Override
    public List<InsRegisterConsultReturnRecord> queryList(InsRegisterConsultReturnRecord insRegisterConsultReturnRecord) {
        LambdaQueryWrapper<InsRegisterConsultReturnRecord> queryWrapper = getQueryWrapper(insRegisterConsultReturnRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insRegisterConsultReturnRecord
    * @return
    */
    public static LambdaQueryWrapper<InsRegisterConsultReturnRecord> getQueryWrapper(InsRegisterConsultReturnRecord insRegisterConsultReturnRecord){
        LambdaQueryWrapper<InsRegisterConsultReturnRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insRegisterConsultReturnRecord.getId() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getId, insRegisterConsultReturnRecord.getId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getTenantId())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getTenantId, insRegisterConsultReturnRecord.getTenantId());
        }
        if (insRegisterConsultReturnRecord.getCorpId() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getCorpId, insRegisterConsultReturnRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getCorpName())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getCorpName, insRegisterConsultReturnRecord.getCorpName());
        }
        if (insRegisterConsultReturnRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getInstitutionId, insRegisterConsultReturnRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getInstitutionName())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getInstitutionName, insRegisterConsultReturnRecord.getInstitutionName());
        }
        if (insRegisterConsultReturnRecord.getAdvisoryId() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getAdvisoryId, insRegisterConsultReturnRecord.getAdvisoryId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getConsultName())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getConsultName, insRegisterConsultReturnRecord.getConsultName());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getLinkTel())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getLinkTel, insRegisterConsultReturnRecord.getLinkTel());
        }
        if (insRegisterConsultReturnRecord.getReturnId() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getReturnId, insRegisterConsultReturnRecord.getReturnId());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getReturnName())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getReturnName, insRegisterConsultReturnRecord.getReturnName());
        }
        if (insRegisterConsultReturnRecord.getReturnTime() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getReturnTime, insRegisterConsultReturnRecord.getReturnTime());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getReturnType())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getReturnType, insRegisterConsultReturnRecord.getReturnType());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getReturnEffect())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getReturnEffect, insRegisterConsultReturnRecord.getReturnEffect());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getReturnResult())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getReturnResult, insRegisterConsultReturnRecord.getReturnResult());
        }
        if (insRegisterConsultReturnRecord.getNextReturnTime() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getNextReturnTime, insRegisterConsultReturnRecord.getNextReturnTime());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getAreaCode())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getAreaCode, insRegisterConsultReturnRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getAreaName())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getAreaName, insRegisterConsultReturnRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getRemark())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getRemark, insRegisterConsultReturnRecord.getRemark());
        }
        if (insRegisterConsultReturnRecord.getCreateUser() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getCreateUser, insRegisterConsultReturnRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insRegisterConsultReturnRecord.getCreateName())) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getCreateName, insRegisterConsultReturnRecord.getCreateName());
        }
        if (insRegisterConsultReturnRecord.getCreateDept() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getCreateDept, insRegisterConsultReturnRecord.getCreateDept());
        }
        if (insRegisterConsultReturnRecord.getCreateTime() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getCreateTime, insRegisterConsultReturnRecord.getCreateTime());
        }
        if (insRegisterConsultReturnRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getUpdateUser, insRegisterConsultReturnRecord.getUpdateUser());
        }
        if (insRegisterConsultReturnRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getUpdateTime, insRegisterConsultReturnRecord.getUpdateTime());
        }
        if (insRegisterConsultReturnRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getIsDeleted, insRegisterConsultReturnRecord.getIsDeleted());
        }
        if (insRegisterConsultReturnRecord.getStatus() != null) {
            queryWrapper.eq(InsRegisterConsultReturnRecord::getStatus, insRegisterConsultReturnRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insRegisterConsultReturnRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsRegisterConsultReturnRecord insert(InsRegisterConsultReturnRecord insRegisterConsultReturnRecord) {
        insRegisterConsultReturnRecord.setId(null);
        getBaseMapper().insert(insRegisterConsultReturnRecord);
        return insRegisterConsultReturnRecord;
    }

    /**
    * 更新数据
    *
    * @param insRegisterConsultReturnRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsRegisterConsultReturnRecord update(InsRegisterConsultReturnRecord insRegisterConsultReturnRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsRegisterConsultReturnRecord> chainWrapper = new LambdaUpdateChainWrapper<InsRegisterConsultReturnRecord>(getBaseMapper());
        if (insRegisterConsultReturnRecord.getId() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getId, insRegisterConsultReturnRecord.getId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getTenantId())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getTenantId, insRegisterConsultReturnRecord.getTenantId());
        }
        if (insRegisterConsultReturnRecord.getCorpId() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getCorpId, insRegisterConsultReturnRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getCorpName())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getCorpName, insRegisterConsultReturnRecord.getCorpName());
        }
        if (insRegisterConsultReturnRecord.getInstitutionId() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getInstitutionId, insRegisterConsultReturnRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getInstitutionName())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getInstitutionName, insRegisterConsultReturnRecord.getInstitutionName());
        }
        if (insRegisterConsultReturnRecord.getAdvisoryId() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getAdvisoryId, insRegisterConsultReturnRecord.getAdvisoryId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getConsultName())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getConsultName, insRegisterConsultReturnRecord.getConsultName());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getLinkTel())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getLinkTel, insRegisterConsultReturnRecord.getLinkTel());
        }
        if (insRegisterConsultReturnRecord.getReturnId() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getReturnId, insRegisterConsultReturnRecord.getReturnId());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getReturnName())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getReturnName, insRegisterConsultReturnRecord.getReturnName());
        }
        if (insRegisterConsultReturnRecord.getReturnTime() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getReturnTime, insRegisterConsultReturnRecord.getReturnTime());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getReturnType())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getReturnType, insRegisterConsultReturnRecord.getReturnType());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getReturnEffect())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getReturnEffect, insRegisterConsultReturnRecord.getReturnEffect());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getReturnResult())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getReturnResult, insRegisterConsultReturnRecord.getReturnResult());
        }
        if (insRegisterConsultReturnRecord.getNextReturnTime() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getNextReturnTime, insRegisterConsultReturnRecord.getNextReturnTime());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getAreaCode())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getAreaCode, insRegisterConsultReturnRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getAreaName())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getAreaName, insRegisterConsultReturnRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getRemark())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getRemark, insRegisterConsultReturnRecord.getRemark());
        }
        if (insRegisterConsultReturnRecord.getCreateUser() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getCreateUser, insRegisterConsultReturnRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insRegisterConsultReturnRecord.getCreateName())) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getCreateName, insRegisterConsultReturnRecord.getCreateName());
        }
        if (insRegisterConsultReturnRecord.getCreateDept() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getCreateDept, insRegisterConsultReturnRecord.getCreateDept());
        }
        if (insRegisterConsultReturnRecord.getCreateTime() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getCreateTime, insRegisterConsultReturnRecord.getCreateTime());
        }
        if (insRegisterConsultReturnRecord.getUpdateUser() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getUpdateUser, insRegisterConsultReturnRecord.getUpdateUser());
        }
        if (insRegisterConsultReturnRecord.getUpdateTime() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getUpdateTime, insRegisterConsultReturnRecord.getUpdateTime());
        }
        if (insRegisterConsultReturnRecord.getIsDeleted() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getIsDeleted, insRegisterConsultReturnRecord.getIsDeleted());
        }
        if (insRegisterConsultReturnRecord.getStatus() != null) {
            chainWrapper.set(InsRegisterConsultReturnRecord::getStatus, insRegisterConsultReturnRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsRegisterConsultReturnRecord::getId, insRegisterConsultReturnRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insRegisterConsultReturnRecord.getId());
        } else {
            return insRegisterConsultReturnRecord;
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
    public boolean saveInsRegisterConsultReturnRecordBatch(List<InsRegisterConsultReturnRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsRegisterConsultReturnRecord insRegisterConsultReturnRecord : insertList) {
            //使用默认的雪花算法生成
            insRegisterConsultReturnRecord.setId(null);
            //insRegisterConsultReturnRecord.setCreatedDt(currentDte);
            //insRegisterConsultReturnRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsRegisterConsultReturnRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsRegisterConsultReturnRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


