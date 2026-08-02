package cn.pluss.platform.service.insStaffEvaluationRecord.impl;

import cn.pluss.platform.mapper.InsStaffEvaluationRecordMapper;
import cn.pluss.platform.model.entity.InsStaffEvaluationRecord;
import cn.pluss.platform.service.insStaffEvaluationRecord.InsStaffEvaluationRecordService;
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
@Service("insStaffEvaluationRecordService")
public class InsStaffEvaluationRecordServiceImpl extends ServiceImpl< InsStaffEvaluationRecordMapper, InsStaffEvaluationRecord> implements InsStaffEvaluationRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffEvaluationRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffEvaluationRecord> queryPage(Map map) {
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
    public InsStaffEvaluationRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffEvaluationRecord queryOne(InsStaffEvaluationRecord insStaffEvaluationRecord){
        LambdaQueryWrapper<InsStaffEvaluationRecord> queryWrapper = getQueryWrapper(insStaffEvaluationRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationRecord
    * @return
    */
    @Override
    public List<InsStaffEvaluationRecord> queryList(InsStaffEvaluationRecord insStaffEvaluationRecord) {
        LambdaQueryWrapper<InsStaffEvaluationRecord> queryWrapper = getQueryWrapper(insStaffEvaluationRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffEvaluationRecord
    * @return
    */
    public static LambdaQueryWrapper<InsStaffEvaluationRecord> getQueryWrapper(InsStaffEvaluationRecord insStaffEvaluationRecord){
        LambdaQueryWrapper<InsStaffEvaluationRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffEvaluationRecord.getId() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getId, insStaffEvaluationRecord.getId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getTenantId())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getTenantId, insStaffEvaluationRecord.getTenantId());
        }
        if (insStaffEvaluationRecord.getCorpId() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getCorpId, insStaffEvaluationRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getCorpName())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getCorpName, insStaffEvaluationRecord.getCorpName());
        }
        if (insStaffEvaluationRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getInstitutionId, insStaffEvaluationRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getInstitutionName())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getInstitutionName, insStaffEvaluationRecord.getInstitutionName());
        }
        if (insStaffEvaluationRecord.getTemplateId() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getTemplateId, insStaffEvaluationRecord.getTemplateId());
        }
        if (insStaffEvaluationRecord.getStaffId() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getStaffId, insStaffEvaluationRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getStaffName())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getStaffName, insStaffEvaluationRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getSex())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getSex, insStaffEvaluationRecord.getSex());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getIdCard())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getIdCard, insStaffEvaluationRecord.getIdCard());
        }
        if (insStaffEvaluationRecord.getTaskId() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getTaskId, insStaffEvaluationRecord.getTaskId());
        }
        if (insStaffEvaluationRecord.getEvaluationState() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getEvaluationState, insStaffEvaluationRecord.getEvaluationState());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getEvaluationType())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getEvaluationType, insStaffEvaluationRecord.getEvaluationType());
        }
        if (insStaffEvaluationRecord.getTotalScore() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getTotalScore, insStaffEvaluationRecord.getTotalScore());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getScoreResult())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getScoreResult, insStaffEvaluationRecord.getScoreResult());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getSummaryComments())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getSummaryComments, insStaffEvaluationRecord.getSummaryComments());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getImprovementSuggestions())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getImprovementSuggestions, insStaffEvaluationRecord.getImprovementSuggestions());
        }
        if (insStaffEvaluationRecord.getEvaluationTime() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getEvaluationTime, insStaffEvaluationRecord.getEvaluationTime());
        }
        if (insStaffEvaluationRecord.getEvaluatorId() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getEvaluatorId, insStaffEvaluationRecord.getEvaluatorId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getEvaluatorName())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getEvaluatorName, insStaffEvaluationRecord.getEvaluatorName());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getOptionIds())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getOptionIds, insStaffEvaluationRecord.getOptionIds());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getQuestionIds())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getQuestionIds, insStaffEvaluationRecord.getQuestionIds());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getQuestionTypes())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getQuestionTypes, insStaffEvaluationRecord.getQuestionTypes());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getTextMemo())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getTextMemo, insStaffEvaluationRecord.getTextMemo());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getRemark())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getRemark, insStaffEvaluationRecord.getRemark());
        }
        if (insStaffEvaluationRecord.getCreateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getCreateUser, insStaffEvaluationRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationRecord.getCreateName())) {
            queryWrapper.eq(InsStaffEvaluationRecord::getCreateName, insStaffEvaluationRecord.getCreateName());
        }
        if (insStaffEvaluationRecord.getCreateDept() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getCreateDept, insStaffEvaluationRecord.getCreateDept());
        }
        if (insStaffEvaluationRecord.getCreateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getCreateTime, insStaffEvaluationRecord.getCreateTime());
        }
        if (insStaffEvaluationRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getUpdateUser, insStaffEvaluationRecord.getUpdateUser());
        }
        if (insStaffEvaluationRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getUpdateTime, insStaffEvaluationRecord.getUpdateTime());
        }
        if (insStaffEvaluationRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getIsDeleted, insStaffEvaluationRecord.getIsDeleted());
        }
        if (insStaffEvaluationRecord.getStatus() != null) {
            queryWrapper.eq(InsStaffEvaluationRecord::getStatus, insStaffEvaluationRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationRecord insert(InsStaffEvaluationRecord insStaffEvaluationRecord) {
        insStaffEvaluationRecord.setId(null);
        getBaseMapper().insert(insStaffEvaluationRecord);
        return insStaffEvaluationRecord;
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationRecord update(InsStaffEvaluationRecord insStaffEvaluationRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffEvaluationRecord> chainWrapper = new LambdaUpdateChainWrapper<InsStaffEvaluationRecord>(getBaseMapper());
        if (insStaffEvaluationRecord.getId() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getId, insStaffEvaluationRecord.getId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getTenantId())) {
            chainWrapper.set(InsStaffEvaluationRecord::getTenantId, insStaffEvaluationRecord.getTenantId());
        }
        if (insStaffEvaluationRecord.getCorpId() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getCorpId, insStaffEvaluationRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getCorpName())) {
            chainWrapper.set(InsStaffEvaluationRecord::getCorpName, insStaffEvaluationRecord.getCorpName());
        }
        if (insStaffEvaluationRecord.getInstitutionId() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getInstitutionId, insStaffEvaluationRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getInstitutionName())) {
            chainWrapper.set(InsStaffEvaluationRecord::getInstitutionName, insStaffEvaluationRecord.getInstitutionName());
        }
        if (insStaffEvaluationRecord.getTemplateId() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getTemplateId, insStaffEvaluationRecord.getTemplateId());
        }
        if (insStaffEvaluationRecord.getStaffId() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getStaffId, insStaffEvaluationRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getStaffName())) {
            chainWrapper.set(InsStaffEvaluationRecord::getStaffName, insStaffEvaluationRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getSex())) {
            chainWrapper.set(InsStaffEvaluationRecord::getSex, insStaffEvaluationRecord.getSex());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getIdCard())) {
            chainWrapper.set(InsStaffEvaluationRecord::getIdCard, insStaffEvaluationRecord.getIdCard());
        }
        if (insStaffEvaluationRecord.getTaskId() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getTaskId, insStaffEvaluationRecord.getTaskId());
        }
        if (insStaffEvaluationRecord.getEvaluationState() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getEvaluationState, insStaffEvaluationRecord.getEvaluationState());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getEvaluationType())) {
            chainWrapper.set(InsStaffEvaluationRecord::getEvaluationType, insStaffEvaluationRecord.getEvaluationType());
        }
        if (insStaffEvaluationRecord.getTotalScore() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getTotalScore, insStaffEvaluationRecord.getTotalScore());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getScoreResult())) {
            chainWrapper.set(InsStaffEvaluationRecord::getScoreResult, insStaffEvaluationRecord.getScoreResult());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getSummaryComments())) {
            chainWrapper.set(InsStaffEvaluationRecord::getSummaryComments, insStaffEvaluationRecord.getSummaryComments());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getImprovementSuggestions())) {
            chainWrapper.set(InsStaffEvaluationRecord::getImprovementSuggestions, insStaffEvaluationRecord.getImprovementSuggestions());
        }
        if (insStaffEvaluationRecord.getEvaluationTime() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getEvaluationTime, insStaffEvaluationRecord.getEvaluationTime());
        }
        if (insStaffEvaluationRecord.getEvaluatorId() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getEvaluatorId, insStaffEvaluationRecord.getEvaluatorId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getEvaluatorName())) {
            chainWrapper.set(InsStaffEvaluationRecord::getEvaluatorName, insStaffEvaluationRecord.getEvaluatorName());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getOptionIds())) {
            chainWrapper.set(InsStaffEvaluationRecord::getOptionIds, insStaffEvaluationRecord.getOptionIds());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getQuestionIds())) {
            chainWrapper.set(InsStaffEvaluationRecord::getQuestionIds, insStaffEvaluationRecord.getQuestionIds());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getQuestionTypes())) {
            chainWrapper.set(InsStaffEvaluationRecord::getQuestionTypes, insStaffEvaluationRecord.getQuestionTypes());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getTextMemo())) {
            chainWrapper.set(InsStaffEvaluationRecord::getTextMemo, insStaffEvaluationRecord.getTextMemo());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getRemark())) {
            chainWrapper.set(InsStaffEvaluationRecord::getRemark, insStaffEvaluationRecord.getRemark());
        }
        if (insStaffEvaluationRecord.getCreateUser() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getCreateUser, insStaffEvaluationRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationRecord.getCreateName())) {
            chainWrapper.set(InsStaffEvaluationRecord::getCreateName, insStaffEvaluationRecord.getCreateName());
        }
        if (insStaffEvaluationRecord.getCreateDept() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getCreateDept, insStaffEvaluationRecord.getCreateDept());
        }
        if (insStaffEvaluationRecord.getCreateTime() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getCreateTime, insStaffEvaluationRecord.getCreateTime());
        }
        if (insStaffEvaluationRecord.getUpdateUser() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getUpdateUser, insStaffEvaluationRecord.getUpdateUser());
        }
        if (insStaffEvaluationRecord.getUpdateTime() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getUpdateTime, insStaffEvaluationRecord.getUpdateTime());
        }
        if (insStaffEvaluationRecord.getIsDeleted() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getIsDeleted, insStaffEvaluationRecord.getIsDeleted());
        }
        if (insStaffEvaluationRecord.getStatus() != null) {
            chainWrapper.set(InsStaffEvaluationRecord::getStatus, insStaffEvaluationRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffEvaluationRecord::getId, insStaffEvaluationRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffEvaluationRecord.getId());
        } else {
            return insStaffEvaluationRecord;
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
    public boolean saveInsStaffEvaluationRecordBatch(List<InsStaffEvaluationRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffEvaluationRecord insStaffEvaluationRecord : insertList) {
            //使用默认的雪花算法生成
            insStaffEvaluationRecord.setId(null);
            //insStaffEvaluationRecord.setCreatedDt(currentDte);
            //insStaffEvaluationRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffEvaluationRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffEvaluationRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


