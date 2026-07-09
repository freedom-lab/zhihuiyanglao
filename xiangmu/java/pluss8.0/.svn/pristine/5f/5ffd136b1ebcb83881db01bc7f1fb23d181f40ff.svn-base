package cn.pluss.platform.service.insStaffEvaluateRecord.impl;

import cn.pluss.platform.mapper.InsStaffEvaluateRecordMapper;
import cn.pluss.platform.model.entity.InsStaffEvaluateRecord;
import cn.pluss.platform.service.insStaffEvaluateRecord.InsStaffEvaluateRecordService;
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
@Service("insStaffEvaluateRecordService")
public class InsStaffEvaluateRecordServiceImpl extends ServiceImpl< InsStaffEvaluateRecordMapper, InsStaffEvaluateRecord> implements InsStaffEvaluateRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffEvaluateRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffEvaluateRecord> queryPage(Map map) {
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
    public InsStaffEvaluateRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluateRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffEvaluateRecord queryOne(InsStaffEvaluateRecord insStaffEvaluateRecord){
        LambdaQueryWrapper<InsStaffEvaluateRecord> queryWrapper = getQueryWrapper(insStaffEvaluateRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluateRecord
    * @return
    */
    @Override
    public List<InsStaffEvaluateRecord> queryList(InsStaffEvaluateRecord insStaffEvaluateRecord) {
        LambdaQueryWrapper<InsStaffEvaluateRecord> queryWrapper = getQueryWrapper(insStaffEvaluateRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffEvaluateRecord
    * @return
    */
    public static LambdaQueryWrapper<InsStaffEvaluateRecord> getQueryWrapper(InsStaffEvaluateRecord insStaffEvaluateRecord){
        LambdaQueryWrapper<InsStaffEvaluateRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffEvaluateRecord.getId() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getId, insStaffEvaluateRecord.getId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getTenantId())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getTenantId, insStaffEvaluateRecord.getTenantId());
        }
        if (insStaffEvaluateRecord.getCorpId() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getCorpId, insStaffEvaluateRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getCorpName())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getCorpName, insStaffEvaluateRecord.getCorpName());
        }
        if (insStaffEvaluateRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getInstitutionId, insStaffEvaluateRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getInstitutionName())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getInstitutionName, insStaffEvaluateRecord.getInstitutionName());
        }
        if (insStaffEvaluateRecord.getStaffId() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getStaffId, insStaffEvaluateRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getStaffName())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getStaffName, insStaffEvaluateRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getSex())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getSex, insStaffEvaluateRecord.getSex());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getIdCard())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getIdCard, insStaffEvaluateRecord.getIdCard());
        }
        if (insStaffEvaluateRecord.getEvaluatorId() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getEvaluatorId, insStaffEvaluateRecord.getEvaluatorId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getEvaluatorName())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getEvaluatorName, insStaffEvaluateRecord.getEvaluatorName());
        }
        if (insStaffEvaluateRecord.getTimelinessEvaluate() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getTimelinessEvaluate, insStaffEvaluateRecord.getTimelinessEvaluate());
        }
        if (insStaffEvaluateRecord.getIntegrityEvaluate() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getIntegrityEvaluate, insStaffEvaluateRecord.getIntegrityEvaluate());
        }
        if (insStaffEvaluateRecord.getServiceEvaluate() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getServiceEvaluate, insStaffEvaluateRecord.getServiceEvaluate());
        }
        if (insStaffEvaluateRecord.getDetailEvaluate() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getDetailEvaluate, insStaffEvaluateRecord.getDetailEvaluate());
        }
        if (insStaffEvaluateRecord.getQualityEvaluate() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getQualityEvaluate, insStaffEvaluateRecord.getQualityEvaluate());
        }
        if (insStaffEvaluateRecord.getCompEvaluate() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getCompEvaluate, insStaffEvaluateRecord.getCompEvaluate());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getEvaluateContent())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getEvaluateContent, insStaffEvaluateRecord.getEvaluateContent());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getEvaluateImg())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getEvaluateImg, insStaffEvaluateRecord.getEvaluateImg());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getRemark())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getRemark, insStaffEvaluateRecord.getRemark());
        }
        if (insStaffEvaluateRecord.getCreateUser() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getCreateUser, insStaffEvaluateRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluateRecord.getCreateName())) {
            queryWrapper.eq(InsStaffEvaluateRecord::getCreateName, insStaffEvaluateRecord.getCreateName());
        }
        if (insStaffEvaluateRecord.getCreateDept() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getCreateDept, insStaffEvaluateRecord.getCreateDept());
        }
        if (insStaffEvaluateRecord.getCreateTime() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getCreateTime, insStaffEvaluateRecord.getCreateTime());
        }
        if (insStaffEvaluateRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getUpdateUser, insStaffEvaluateRecord.getUpdateUser());
        }
        if (insStaffEvaluateRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getUpdateTime, insStaffEvaluateRecord.getUpdateTime());
        }
        if (insStaffEvaluateRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getIsDeleted, insStaffEvaluateRecord.getIsDeleted());
        }
        if (insStaffEvaluateRecord.getStatus() != null) {
            queryWrapper.eq(InsStaffEvaluateRecord::getStatus, insStaffEvaluateRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluateRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluateRecord insert(InsStaffEvaluateRecord insStaffEvaluateRecord) {
        insStaffEvaluateRecord.setId(null);
        getBaseMapper().insert(insStaffEvaluateRecord);
        return insStaffEvaluateRecord;
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluateRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluateRecord update(InsStaffEvaluateRecord insStaffEvaluateRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffEvaluateRecord> chainWrapper = new LambdaUpdateChainWrapper<InsStaffEvaluateRecord>(getBaseMapper());
        if (insStaffEvaluateRecord.getId() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getId, insStaffEvaluateRecord.getId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getTenantId())) {
            chainWrapper.set(InsStaffEvaluateRecord::getTenantId, insStaffEvaluateRecord.getTenantId());
        }
        if (insStaffEvaluateRecord.getCorpId() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getCorpId, insStaffEvaluateRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getCorpName())) {
            chainWrapper.set(InsStaffEvaluateRecord::getCorpName, insStaffEvaluateRecord.getCorpName());
        }
        if (insStaffEvaluateRecord.getInstitutionId() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getInstitutionId, insStaffEvaluateRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getInstitutionName())) {
            chainWrapper.set(InsStaffEvaluateRecord::getInstitutionName, insStaffEvaluateRecord.getInstitutionName());
        }
        if (insStaffEvaluateRecord.getStaffId() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getStaffId, insStaffEvaluateRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getStaffName())) {
            chainWrapper.set(InsStaffEvaluateRecord::getStaffName, insStaffEvaluateRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getSex())) {
            chainWrapper.set(InsStaffEvaluateRecord::getSex, insStaffEvaluateRecord.getSex());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getIdCard())) {
            chainWrapper.set(InsStaffEvaluateRecord::getIdCard, insStaffEvaluateRecord.getIdCard());
        }
        if (insStaffEvaluateRecord.getEvaluatorId() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getEvaluatorId, insStaffEvaluateRecord.getEvaluatorId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getEvaluatorName())) {
            chainWrapper.set(InsStaffEvaluateRecord::getEvaluatorName, insStaffEvaluateRecord.getEvaluatorName());
        }
        if (insStaffEvaluateRecord.getTimelinessEvaluate() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getTimelinessEvaluate, insStaffEvaluateRecord.getTimelinessEvaluate());
        }
        if (insStaffEvaluateRecord.getIntegrityEvaluate() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getIntegrityEvaluate, insStaffEvaluateRecord.getIntegrityEvaluate());
        }
        if (insStaffEvaluateRecord.getServiceEvaluate() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getServiceEvaluate, insStaffEvaluateRecord.getServiceEvaluate());
        }
        if (insStaffEvaluateRecord.getDetailEvaluate() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getDetailEvaluate, insStaffEvaluateRecord.getDetailEvaluate());
        }
        if (insStaffEvaluateRecord.getQualityEvaluate() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getQualityEvaluate, insStaffEvaluateRecord.getQualityEvaluate());
        }
        if (insStaffEvaluateRecord.getCompEvaluate() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getCompEvaluate, insStaffEvaluateRecord.getCompEvaluate());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getEvaluateContent())) {
            chainWrapper.set(InsStaffEvaluateRecord::getEvaluateContent, insStaffEvaluateRecord.getEvaluateContent());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getEvaluateImg())) {
            chainWrapper.set(InsStaffEvaluateRecord::getEvaluateImg, insStaffEvaluateRecord.getEvaluateImg());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getRemark())) {
            chainWrapper.set(InsStaffEvaluateRecord::getRemark, insStaffEvaluateRecord.getRemark());
        }
        if (insStaffEvaluateRecord.getCreateUser() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getCreateUser, insStaffEvaluateRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffEvaluateRecord.getCreateName())) {
            chainWrapper.set(InsStaffEvaluateRecord::getCreateName, insStaffEvaluateRecord.getCreateName());
        }
        if (insStaffEvaluateRecord.getCreateDept() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getCreateDept, insStaffEvaluateRecord.getCreateDept());
        }
        if (insStaffEvaluateRecord.getCreateTime() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getCreateTime, insStaffEvaluateRecord.getCreateTime());
        }
        if (insStaffEvaluateRecord.getUpdateUser() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getUpdateUser, insStaffEvaluateRecord.getUpdateUser());
        }
        if (insStaffEvaluateRecord.getUpdateTime() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getUpdateTime, insStaffEvaluateRecord.getUpdateTime());
        }
        if (insStaffEvaluateRecord.getIsDeleted() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getIsDeleted, insStaffEvaluateRecord.getIsDeleted());
        }
        if (insStaffEvaluateRecord.getStatus() != null) {
            chainWrapper.set(InsStaffEvaluateRecord::getStatus, insStaffEvaluateRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffEvaluateRecord::getId, insStaffEvaluateRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffEvaluateRecord.getId());
        } else {
            return insStaffEvaluateRecord;
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
    public boolean saveInsStaffEvaluateRecordBatch(List<InsStaffEvaluateRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffEvaluateRecord insStaffEvaluateRecord : insertList) {
            //使用默认的雪花算法生成
            insStaffEvaluateRecord.setId(null);
            //insStaffEvaluateRecord.setCreatedDt(currentDte);
            //insStaffEvaluateRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffEvaluateRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffEvaluateRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


