package cn.pluss.platform.service.insNursingChangeGroupRecord.impl;

import cn.pluss.platform.mapper.InsNursingChangeGroupRecordMapper;
import cn.pluss.platform.model.entity.InsNursingChangeGroupRecord;
import cn.pluss.platform.service.insNursingChangeGroupRecord.InsNursingChangeGroupRecordService;
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
@Service("insNursingChangeGroupRecordService")
public class InsNursingChangeGroupRecordServiceImpl extends ServiceImpl< InsNursingChangeGroupRecordMapper, InsNursingChangeGroupRecord> implements InsNursingChangeGroupRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingChangeGroupRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingChangeGroupRecord> queryPage(Map map) {
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
    public InsNursingChangeGroupRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingChangeGroupRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingChangeGroupRecord queryOne(InsNursingChangeGroupRecord insNursingChangeGroupRecord){
        LambdaQueryWrapper<InsNursingChangeGroupRecord> queryWrapper = getQueryWrapper(insNursingChangeGroupRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingChangeGroupRecord
    * @return
    */
    @Override
    public List<InsNursingChangeGroupRecord> queryList(InsNursingChangeGroupRecord insNursingChangeGroupRecord) {
        LambdaQueryWrapper<InsNursingChangeGroupRecord> queryWrapper = getQueryWrapper(insNursingChangeGroupRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingChangeGroupRecord
    * @return
    */
    public static LambdaQueryWrapper<InsNursingChangeGroupRecord> getQueryWrapper(InsNursingChangeGroupRecord insNursingChangeGroupRecord){
        LambdaQueryWrapper<InsNursingChangeGroupRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingChangeGroupRecord.getId() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getId, insNursingChangeGroupRecord.getId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getTenantId())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getTenantId, insNursingChangeGroupRecord.getTenantId());
        }
        if (insNursingChangeGroupRecord.getCorpId() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getCorpId, insNursingChangeGroupRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getCorpName())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getCorpName, insNursingChangeGroupRecord.getCorpName());
        }
        if (insNursingChangeGroupRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getInstitutionId, insNursingChangeGroupRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getInstitutionName())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getInstitutionName, insNursingChangeGroupRecord.getInstitutionName());
        }
        if (insNursingChangeGroupRecord.getCheckId() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getCheckId, insNursingChangeGroupRecord.getCheckId());
        }
        if (insNursingChangeGroupRecord.getCheckDate() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getCheckDate, insNursingChangeGroupRecord.getCheckDate());
        }
        if (insNursingChangeGroupRecord.getElderId() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getElderId, insNursingChangeGroupRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getElderName())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getElderName, insNursingChangeGroupRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getIdCard())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getIdCard, insNursingChangeGroupRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getSex())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getSex, insNursingChangeGroupRecord.getSex());
        }
        if (insNursingChangeGroupRecord.getChangeTime() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getChangeTime, insNursingChangeGroupRecord.getChangeTime());
        }
        if (insNursingChangeGroupRecord.getOldGroupId() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getOldGroupId, insNursingChangeGroupRecord.getOldGroupId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getOldGroupName())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getOldGroupName, insNursingChangeGroupRecord.getOldGroupName());
        }
        if (insNursingChangeGroupRecord.getNewGroupId() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getNewGroupId, insNursingChangeGroupRecord.getNewGroupId());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getNewGroupName())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getNewGroupName, insNursingChangeGroupRecord.getNewGroupName());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getRemark())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getRemark, insNursingChangeGroupRecord.getRemark());
        }
        if (insNursingChangeGroupRecord.getCreateUser() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getCreateUser, insNursingChangeGroupRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingChangeGroupRecord.getCreateName())) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getCreateName, insNursingChangeGroupRecord.getCreateName());
        }
        if (insNursingChangeGroupRecord.getCreateDept() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getCreateDept, insNursingChangeGroupRecord.getCreateDept());
        }
        if (insNursingChangeGroupRecord.getCreateTime() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getCreateTime, insNursingChangeGroupRecord.getCreateTime());
        }
        if (insNursingChangeGroupRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getUpdateUser, insNursingChangeGroupRecord.getUpdateUser());
        }
        if (insNursingChangeGroupRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getUpdateTime, insNursingChangeGroupRecord.getUpdateTime());
        }
        if (insNursingChangeGroupRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getIsDeleted, insNursingChangeGroupRecord.getIsDeleted());
        }
        if (insNursingChangeGroupRecord.getStatus() != null) {
            queryWrapper.eq(InsNursingChangeGroupRecord::getStatus, insNursingChangeGroupRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingChangeGroupRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingChangeGroupRecord insert(InsNursingChangeGroupRecord insNursingChangeGroupRecord) {
        insNursingChangeGroupRecord.setId(null);
        getBaseMapper().insert(insNursingChangeGroupRecord);
        return insNursingChangeGroupRecord;
    }

    /**
    * 更新数据
    *
    * @param insNursingChangeGroupRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingChangeGroupRecord update(InsNursingChangeGroupRecord insNursingChangeGroupRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingChangeGroupRecord> chainWrapper = new LambdaUpdateChainWrapper<InsNursingChangeGroupRecord>(getBaseMapper());
        if (insNursingChangeGroupRecord.getId() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getId, insNursingChangeGroupRecord.getId());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getTenantId())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getTenantId, insNursingChangeGroupRecord.getTenantId());
        }
        if (insNursingChangeGroupRecord.getCorpId() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getCorpId, insNursingChangeGroupRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getCorpName())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getCorpName, insNursingChangeGroupRecord.getCorpName());
        }
        if (insNursingChangeGroupRecord.getInstitutionId() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getInstitutionId, insNursingChangeGroupRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getInstitutionName())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getInstitutionName, insNursingChangeGroupRecord.getInstitutionName());
        }
        if (insNursingChangeGroupRecord.getCheckId() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getCheckId, insNursingChangeGroupRecord.getCheckId());
        }
        if (insNursingChangeGroupRecord.getCheckDate() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getCheckDate, insNursingChangeGroupRecord.getCheckDate());
        }
        if (insNursingChangeGroupRecord.getElderId() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getElderId, insNursingChangeGroupRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getElderName())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getElderName, insNursingChangeGroupRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getIdCard())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getIdCard, insNursingChangeGroupRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getSex())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getSex, insNursingChangeGroupRecord.getSex());
        }
        if (insNursingChangeGroupRecord.getChangeTime() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getChangeTime, insNursingChangeGroupRecord.getChangeTime());
        }
        if (insNursingChangeGroupRecord.getOldGroupId() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getOldGroupId, insNursingChangeGroupRecord.getOldGroupId());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getOldGroupName())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getOldGroupName, insNursingChangeGroupRecord.getOldGroupName());
        }
        if (insNursingChangeGroupRecord.getNewGroupId() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getNewGroupId, insNursingChangeGroupRecord.getNewGroupId());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getNewGroupName())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getNewGroupName, insNursingChangeGroupRecord.getNewGroupName());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getRemark())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getRemark, insNursingChangeGroupRecord.getRemark());
        }
        if (insNursingChangeGroupRecord.getCreateUser() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getCreateUser, insNursingChangeGroupRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingChangeGroupRecord.getCreateName())) {
            chainWrapper.set(InsNursingChangeGroupRecord::getCreateName, insNursingChangeGroupRecord.getCreateName());
        }
        if (insNursingChangeGroupRecord.getCreateDept() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getCreateDept, insNursingChangeGroupRecord.getCreateDept());
        }
        if (insNursingChangeGroupRecord.getCreateTime() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getCreateTime, insNursingChangeGroupRecord.getCreateTime());
        }
        if (insNursingChangeGroupRecord.getUpdateUser() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getUpdateUser, insNursingChangeGroupRecord.getUpdateUser());
        }
        if (insNursingChangeGroupRecord.getUpdateTime() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getUpdateTime, insNursingChangeGroupRecord.getUpdateTime());
        }
        if (insNursingChangeGroupRecord.getIsDeleted() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getIsDeleted, insNursingChangeGroupRecord.getIsDeleted());
        }
        if (insNursingChangeGroupRecord.getStatus() != null) {
            chainWrapper.set(InsNursingChangeGroupRecord::getStatus, insNursingChangeGroupRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingChangeGroupRecord::getId, insNursingChangeGroupRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingChangeGroupRecord.getId());
        } else {
            return insNursingChangeGroupRecord;
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
    public boolean saveInsNursingChangeGroupRecordBatch(List<InsNursingChangeGroupRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingChangeGroupRecord insNursingChangeGroupRecord : insertList) {
            //使用默认的雪花算法生成
            insNursingChangeGroupRecord.setId(null);
            //insNursingChangeGroupRecord.setCreatedDt(currentDte);
            //insNursingChangeGroupRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingChangeGroupRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingChangeGroupRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


