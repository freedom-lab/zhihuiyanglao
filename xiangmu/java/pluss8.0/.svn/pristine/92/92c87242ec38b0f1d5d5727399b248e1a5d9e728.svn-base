package cn.pluss.platform.service.assessmentQuestion.impl;

import cn.pluss.platform.mapper.AssessmentQuestionMapper;
import cn.pluss.platform.model.entity.AssessmentQuestion;
import cn.pluss.platform.service.assessmentQuestion.AssessmentQuestionService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Transactional
@Service("assessmentQuestionService")
public class AssessmentQuestionServiceImpl extends ServiceImpl< AssessmentQuestionMapper, AssessmentQuestion> implements AssessmentQuestionService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentQuestionServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentQuestion> queryPage(Map map) {
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
    public AssessmentQuestion queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentQuestion 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentQuestion queryOne(AssessmentQuestion assessmentQuestion){
        LambdaQueryWrapper<AssessmentQuestion> queryWrapper = getQueryWrapper(assessmentQuestion);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentQuestion
    * @return
    */
    @Override
    public List<AssessmentQuestion> queryList(AssessmentQuestion assessmentQuestion) {
        LambdaQueryWrapper<AssessmentQuestion> queryWrapper = getQueryWrapper(assessmentQuestion);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentQuestion
    * @return
    */
    public static LambdaQueryWrapper<AssessmentQuestion> getQueryWrapper(AssessmentQuestion assessmentQuestion){
        LambdaQueryWrapper<AssessmentQuestion> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentQuestion.getId() != null) {
            queryWrapper.eq(AssessmentQuestion::getId, assessmentQuestion.getId());
        }
        if (StringUtil.isNotEmpty(assessmentQuestion.getTenantId())) {
            queryWrapper.eq(AssessmentQuestion::getTenantId, assessmentQuestion.getTenantId());
        }
        if (StringUtil.isNotEmpty(assessmentQuestion.getQuestionName())) {
            queryWrapper.eq(AssessmentQuestion::getQuestionName, assessmentQuestion.getQuestionName());
        }
        if (StringUtil.isNotEmpty(assessmentQuestion.getQuestionType())) {
            queryWrapper.eq(AssessmentQuestion::getQuestionType, assessmentQuestion.getQuestionType());
        }
        if (assessmentQuestion.getStatus() != null) {
            queryWrapper.eq(AssessmentQuestion::getStatus, assessmentQuestion.getStatus());
        }
        if (assessmentQuestion.getTemplateId() != null) {
            queryWrapper.eq(AssessmentQuestion::getTemplateId, assessmentQuestion.getTemplateId());
        }
        if (assessmentQuestion.getSerialNumber() != null) {
            queryWrapper.eq(AssessmentQuestion::getSerialNumber, assessmentQuestion.getSerialNumber());
        }
        if (assessmentQuestion.getGroupType() != null) {
            queryWrapper.eq(AssessmentQuestion::getGroupType, assessmentQuestion.getGroupType());
        }
        if (StringUtil.isNotEmpty(assessmentQuestion.getRemark())) {
            queryWrapper.eq(AssessmentQuestion::getRemark, assessmentQuestion.getRemark());
        }
        if (assessmentQuestion.getCreateUser() != null) {
            queryWrapper.eq(AssessmentQuestion::getCreateUser, assessmentQuestion.getCreateUser());
        }
        if (assessmentQuestion.getCreateDept() != null) {
            queryWrapper.eq(AssessmentQuestion::getCreateDept, assessmentQuestion.getCreateDept());
        }
        if (assessmentQuestion.getCreateTime() != null) {
            queryWrapper.eq(AssessmentQuestion::getCreateTime, assessmentQuestion.getCreateTime());
        }
        if (assessmentQuestion.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentQuestion::getUpdateUser, assessmentQuestion.getUpdateUser());
        }
        if (assessmentQuestion.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentQuestion::getUpdateTime, assessmentQuestion.getUpdateTime());
        }
        if (assessmentQuestion.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentQuestion::getIsDeleted, assessmentQuestion.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentQuestion 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentQuestion insert(AssessmentQuestion assessmentQuestion) {
        assessmentQuestion.setId(null);
        getBaseMapper().insert(assessmentQuestion);
        return assessmentQuestion;
    }

    /**
    * 更新数据
    *
    * @param assessmentQuestion 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentQuestion update(AssessmentQuestion assessmentQuestion) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentQuestion> chainWrapper = new LambdaUpdateChainWrapper<AssessmentQuestion>(getBaseMapper());
        if (assessmentQuestion.getId() != null) {
            chainWrapper.set(AssessmentQuestion::getId, assessmentQuestion.getId());
        }
        if (StringUtil.isNotBlank(assessmentQuestion.getTenantId())) {
            chainWrapper.set(AssessmentQuestion::getTenantId, assessmentQuestion.getTenantId());
        }
        if (StringUtil.isNotBlank(assessmentQuestion.getQuestionName())) {
            chainWrapper.set(AssessmentQuestion::getQuestionName, assessmentQuestion.getQuestionName());
        }
        if (StringUtil.isNotBlank(assessmentQuestion.getQuestionType())) {
            chainWrapper.set(AssessmentQuestion::getQuestionType, assessmentQuestion.getQuestionType());
        }
        if (assessmentQuestion.getStatus() != null) {
            chainWrapper.set(AssessmentQuestion::getStatus, assessmentQuestion.getStatus());
        }
        if (assessmentQuestion.getTemplateId() != null) {
            chainWrapper.set(AssessmentQuestion::getTemplateId, assessmentQuestion.getTemplateId());
        }
        if (assessmentQuestion.getSerialNumber() != null) {
            chainWrapper.set(AssessmentQuestion::getSerialNumber, assessmentQuestion.getSerialNumber());
        }
        if (assessmentQuestion.getGroupType() != null) {
            chainWrapper.set(AssessmentQuestion::getGroupType, assessmentQuestion.getGroupType());
        }
        if (StringUtil.isNotBlank(assessmentQuestion.getRemark())) {
            chainWrapper.set(AssessmentQuestion::getRemark, assessmentQuestion.getRemark());
        }
        if (assessmentQuestion.getCreateUser() != null) {
            chainWrapper.set(AssessmentQuestion::getCreateUser, assessmentQuestion.getCreateUser());
        }
        if (assessmentQuestion.getCreateDept() != null) {
            chainWrapper.set(AssessmentQuestion::getCreateDept, assessmentQuestion.getCreateDept());
        }
        if (assessmentQuestion.getCreateTime() != null) {
            chainWrapper.set(AssessmentQuestion::getCreateTime, assessmentQuestion.getCreateTime());
        }
        if (assessmentQuestion.getUpdateUser() != null) {
            chainWrapper.set(AssessmentQuestion::getUpdateUser, assessmentQuestion.getUpdateUser());
        }
        if (assessmentQuestion.getUpdateTime() != null) {
            chainWrapper.set(AssessmentQuestion::getUpdateTime, assessmentQuestion.getUpdateTime());
        }
        if (assessmentQuestion.getIsDeleted() != null) {
            chainWrapper.set(AssessmentQuestion::getIsDeleted, assessmentQuestion.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentQuestion::getId, assessmentQuestion.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentQuestion.getId());
        } else {
            return assessmentQuestion;
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
    public boolean saveAssessmentQuestionBatch(List<AssessmentQuestion> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentQuestion assessmentQuestion : insertList) {
            //使用默认的雪花算法生成
            assessmentQuestion.setId(null);
            //assessmentQuestion.setCreatedDt(currentDte);
            //assessmentQuestion.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentQuestionBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentQuestion> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public List<AssessmentQuestion> queryAssessmentQuestionsByTemplateId(AssessmentQuestion assessmentQuestion) {
        return getBaseMapper().queryAssessmentQuestionsByTemplateId(assessmentQuestion);
    }

    @Override
    public List<AssessmentQuestion> queryAssessmentQuestionsByTemplateIds(List<Long> templateIds) {
        return getBaseMapper().queryAssessmentQuestionsByTemplateIds(templateIds);
    }
}


