package cn.pluss.platform.service.assessmentResult.impl;

import cn.pluss.platform.mapper.AssessmentResultMapper;
import cn.pluss.platform.model.entity.AssessmentResult;
import cn.pluss.platform.service.assessmentResult.AssessmentResultService;
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
@Service("assessmentResultService")
public class AssessmentResultServiceImpl extends ServiceImpl< AssessmentResultMapper, AssessmentResult> implements AssessmentResultService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentResultServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentResult> queryPage(Map map) {
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
    public AssessmentResult queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentResult 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentResult queryOne(AssessmentResult assessmentResult){
        LambdaQueryWrapper<AssessmentResult> queryWrapper = getQueryWrapper(assessmentResult);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentResult
    * @return
    */
    @Override
    public List<AssessmentResult> queryList(AssessmentResult assessmentResult) {
        LambdaQueryWrapper<AssessmentResult> queryWrapper = getQueryWrapper(assessmentResult);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentResult
    * @return
    */
    public static LambdaQueryWrapper<AssessmentResult> getQueryWrapper(AssessmentResult assessmentResult){
        LambdaQueryWrapper<AssessmentResult> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentResult.getId() != null) {
            queryWrapper.eq(AssessmentResult::getId, assessmentResult.getId());
        }
        if (StringUtil.isNotEmpty(assessmentResult.getTenantId())) {
            queryWrapper.eq(AssessmentResult::getTenantId, assessmentResult.getTenantId());
        }
        if (assessmentResult.getAppointId() != null) {
            queryWrapper.eq(AssessmentResult::getAppointId, assessmentResult.getAppointId());
        }
        if (StringUtil.isNotEmpty(assessmentResult.getOptionIds())) {
            queryWrapper.eq(AssessmentResult::getOptionIds, assessmentResult.getOptionIds());
        }
        if (StringUtil.isNotEmpty(assessmentResult.getQuestionIds())) {
            queryWrapper.eq(AssessmentResult::getQuestionIds, assessmentResult.getQuestionIds());
        }
        if (assessmentResult.getStepId() != null) {
            queryWrapper.eq(AssessmentResult::getStepId, assessmentResult.getStepId());
        }
        if (assessmentResult.getResultMark() != null) {
            queryWrapper.eq(AssessmentResult::getResultMark, assessmentResult.getResultMark());
        }
        if (assessmentResult.getAssessTime() != null) {
            queryWrapper.eq(AssessmentResult::getAssessTime, assessmentResult.getAssessTime());
        }
        if (StringUtil.isNotEmpty(assessmentResult.getAssessResult())) {
            queryWrapper.eq(AssessmentResult::getAssessResult, assessmentResult.getAssessResult());
        }
        if (StringUtil.isNotEmpty(assessmentResult.getQuestionTypes())) {
            queryWrapper.eq(AssessmentResult::getQuestionTypes, assessmentResult.getQuestionTypes());
        }
        if (StringUtil.isNotEmpty(assessmentResult.getTextMemo())) {
            queryWrapper.eq(AssessmentResult::getTextMemo, assessmentResult.getTextMemo());
        }
        if (assessmentResult.getCreateUser() != null) {
            queryWrapper.eq(AssessmentResult::getCreateUser, assessmentResult.getCreateUser());
        }
        if (assessmentResult.getCreateDept() != null) {
            queryWrapper.eq(AssessmentResult::getCreateDept, assessmentResult.getCreateDept());
        }
        if (assessmentResult.getCreateTime() != null) {
            queryWrapper.eq(AssessmentResult::getCreateTime, assessmentResult.getCreateTime());
        }
        if (assessmentResult.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentResult::getUpdateUser, assessmentResult.getUpdateUser());
        }
        if (assessmentResult.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentResult::getUpdateTime, assessmentResult.getUpdateTime());
        }
        if (assessmentResult.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentResult::getIsDeleted, assessmentResult.getIsDeleted());
        }
        if (assessmentResult.getStatus() != null) {
            queryWrapper.eq(AssessmentResult::getStatus, assessmentResult.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentResult 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentResult insert(AssessmentResult assessmentResult) {
        assessmentResult.setId(null);
        getBaseMapper().insert(assessmentResult);
        return assessmentResult;
    }

    /**
    * 更新数据
    *
    * @param assessmentResult 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentResult update(AssessmentResult assessmentResult) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentResult> chainWrapper = new LambdaUpdateChainWrapper<AssessmentResult>(getBaseMapper());
        if (assessmentResult.getId() != null) {
            chainWrapper.set(AssessmentResult::getId, assessmentResult.getId());
        }
        if (StringUtil.isNotBlank(assessmentResult.getTenantId())) {
            chainWrapper.set(AssessmentResult::getTenantId, assessmentResult.getTenantId());
        }
        if (assessmentResult.getAppointId() != null) {
            chainWrapper.set(AssessmentResult::getAppointId, assessmentResult.getAppointId());
        }
        if (StringUtil.isNotBlank(assessmentResult.getOptionIds())) {
            chainWrapper.set(AssessmentResult::getOptionIds, assessmentResult.getOptionIds());
        }
        if (StringUtil.isNotBlank(assessmentResult.getQuestionIds())) {
            chainWrapper.set(AssessmentResult::getQuestionIds, assessmentResult.getQuestionIds());
        }
        if (assessmentResult.getStepId() != null) {
            chainWrapper.set(AssessmentResult::getStepId, assessmentResult.getStepId());
        }
        if (assessmentResult.getResultMark() != null) {
            chainWrapper.set(AssessmentResult::getResultMark, assessmentResult.getResultMark());
        }
        if (assessmentResult.getAssessTime() != null) {
            chainWrapper.set(AssessmentResult::getAssessTime, assessmentResult.getAssessTime());
        }
        if (StringUtil.isNotBlank(assessmentResult.getAssessResult())) {
            chainWrapper.set(AssessmentResult::getAssessResult, assessmentResult.getAssessResult());
        }
        if (StringUtil.isNotBlank(assessmentResult.getQuestionTypes())) {
            chainWrapper.set(AssessmentResult::getQuestionTypes, assessmentResult.getQuestionTypes());
        }
        if (StringUtil.isNotBlank(assessmentResult.getTextMemo())) {
            chainWrapper.set(AssessmentResult::getTextMemo, assessmentResult.getTextMemo());
        }
        if (assessmentResult.getCreateUser() != null) {
            chainWrapper.set(AssessmentResult::getCreateUser, assessmentResult.getCreateUser());
        }
        if (assessmentResult.getCreateDept() != null) {
            chainWrapper.set(AssessmentResult::getCreateDept, assessmentResult.getCreateDept());
        }
        if (assessmentResult.getCreateTime() != null) {
            chainWrapper.set(AssessmentResult::getCreateTime, assessmentResult.getCreateTime());
        }
        if (assessmentResult.getUpdateUser() != null) {
            chainWrapper.set(AssessmentResult::getUpdateUser, assessmentResult.getUpdateUser());
        }
        if (assessmentResult.getUpdateTime() != null) {
            chainWrapper.set(AssessmentResult::getUpdateTime, assessmentResult.getUpdateTime());
        }
        if (assessmentResult.getIsDeleted() != null) {
            chainWrapper.set(AssessmentResult::getIsDeleted, assessmentResult.getIsDeleted());
        }
        if (assessmentResult.getStatus() != null) {
            chainWrapper.set(AssessmentResult::getStatus, assessmentResult.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentResult::getId, assessmentResult.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentResult.getId());
        } else {
            return assessmentResult;
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
    public boolean saveAssessmentResultBatch(List<AssessmentResult> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentResult assessmentResult : insertList) {
            //使用默认的雪花算法生成
            assessmentResult.setId(null);
            //assessmentResult.setCreatedDt(currentDte);
            //assessmentResult.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentResultBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentResult> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


