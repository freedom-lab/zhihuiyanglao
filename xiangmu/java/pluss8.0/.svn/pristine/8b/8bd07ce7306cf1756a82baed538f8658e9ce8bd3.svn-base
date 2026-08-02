package cn.pluss.platform.service.assessmentTemplate.impl;

import cn.pluss.platform.mapper.AssessmentTemplateMapper;
import cn.pluss.platform.model.entity.AssessmentTemplate;
import cn.pluss.platform.service.assessmentTemplate.AssessmentTemplateService;
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
@Service("assessmentTemplateService")
public class AssessmentTemplateServiceImpl extends ServiceImpl< AssessmentTemplateMapper, AssessmentTemplate> implements AssessmentTemplateService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentTemplateServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentTemplate> queryPage(Map map) {
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
    public AssessmentTemplate queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentTemplate 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentTemplate queryOne(AssessmentTemplate assessmentTemplate){
        LambdaQueryWrapper<AssessmentTemplate> queryWrapper = getQueryWrapper(assessmentTemplate);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentTemplate
    * @return
    */
    @Override
    public List<AssessmentTemplate> queryList(AssessmentTemplate assessmentTemplate) {
        LambdaQueryWrapper<AssessmentTemplate> queryWrapper = getQueryWrapper(assessmentTemplate);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentTemplate
    * @return
    */
    public static LambdaQueryWrapper<AssessmentTemplate> getQueryWrapper(AssessmentTemplate assessmentTemplate){
        LambdaQueryWrapper<AssessmentTemplate> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentTemplate.getId() != null) {
            queryWrapper.eq(AssessmentTemplate::getId, assessmentTemplate.getId());
        }
        if (StringUtil.isNotEmpty(assessmentTemplate.getTenantId())) {
            queryWrapper.eq(AssessmentTemplate::getTenantId, assessmentTemplate.getTenantId());
        }
        if (StringUtil.isNotEmpty(assessmentTemplate.getTemplateName())) {
            queryWrapper.eq(AssessmentTemplate::getTemplateName, assessmentTemplate.getTemplateName());
        }
        if (StringUtil.isNotEmpty(assessmentTemplate.getAssessmentCriteria())) {
            queryWrapper.eq(AssessmentTemplate::getAssessmentCriteria, assessmentTemplate.getAssessmentCriteria());
        }
        if (StringUtil.isNotEmpty(assessmentTemplate.getTemplateType())) {
            queryWrapper.eq(AssessmentTemplate::getTemplateType, assessmentTemplate.getTemplateType());
        }
        if (StringUtil.isNotEmpty(assessmentTemplate.getStatus())) {
            queryWrapper.eq(AssessmentTemplate::getStatus, assessmentTemplate.getStatus());
        }
        if (StringUtil.isNotEmpty(assessmentTemplate.getRemark())) {
            queryWrapper.eq(AssessmentTemplate::getRemark, assessmentTemplate.getRemark());
        }
        if (assessmentTemplate.getCreateUser() != null) {
            queryWrapper.eq(AssessmentTemplate::getCreateUser, assessmentTemplate.getCreateUser());
        }
        if (assessmentTemplate.getCreateDept() != null) {
            queryWrapper.eq(AssessmentTemplate::getCreateDept, assessmentTemplate.getCreateDept());
        }
        if (assessmentTemplate.getCreateTime() != null) {
            queryWrapper.eq(AssessmentTemplate::getCreateTime, assessmentTemplate.getCreateTime());
        }
        if (assessmentTemplate.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentTemplate::getUpdateUser, assessmentTemplate.getUpdateUser());
        }
        if (assessmentTemplate.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentTemplate::getUpdateTime, assessmentTemplate.getUpdateTime());
        }
        if (assessmentTemplate.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentTemplate::getIsDeleted, assessmentTemplate.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentTemplate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentTemplate insert(AssessmentTemplate assessmentTemplate) {
        assessmentTemplate.setId(null);
        getBaseMapper().insert(assessmentTemplate);
        return assessmentTemplate;
    }

    /**
    * 更新数据
    *
    * @param assessmentTemplate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentTemplate update(AssessmentTemplate assessmentTemplate) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentTemplate> chainWrapper = new LambdaUpdateChainWrapper<AssessmentTemplate>(getBaseMapper());
        if (assessmentTemplate.getId() != null) {
            chainWrapper.set(AssessmentTemplate::getId, assessmentTemplate.getId());
        }
        if (StringUtil.isNotBlank(assessmentTemplate.getTenantId())) {
            chainWrapper.set(AssessmentTemplate::getTenantId, assessmentTemplate.getTenantId());
        }
        if (StringUtil.isNotBlank(assessmentTemplate.getTemplateName())) {
            chainWrapper.set(AssessmentTemplate::getTemplateName, assessmentTemplate.getTemplateName());
        }
        if (StringUtil.isNotBlank(assessmentTemplate.getAssessmentCriteria())) {
            chainWrapper.set(AssessmentTemplate::getAssessmentCriteria, assessmentTemplate.getAssessmentCriteria());
        }
        if (StringUtil.isNotBlank(assessmentTemplate.getTemplateType())) {
            chainWrapper.set(AssessmentTemplate::getTemplateType, assessmentTemplate.getTemplateType());
        }
        if (StringUtil.isNotBlank(assessmentTemplate.getStatus())) {
            chainWrapper.set(AssessmentTemplate::getStatus, assessmentTemplate.getStatus());
        }
        if (StringUtil.isNotBlank(assessmentTemplate.getRemark())) {
            chainWrapper.set(AssessmentTemplate::getRemark, assessmentTemplate.getRemark());
        }
        if (assessmentTemplate.getCreateUser() != null) {
            chainWrapper.set(AssessmentTemplate::getCreateUser, assessmentTemplate.getCreateUser());
        }
        if (assessmentTemplate.getCreateDept() != null) {
            chainWrapper.set(AssessmentTemplate::getCreateDept, assessmentTemplate.getCreateDept());
        }
        if (assessmentTemplate.getCreateTime() != null) {
            chainWrapper.set(AssessmentTemplate::getCreateTime, assessmentTemplate.getCreateTime());
        }
        if (assessmentTemplate.getUpdateUser() != null) {
            chainWrapper.set(AssessmentTemplate::getUpdateUser, assessmentTemplate.getUpdateUser());
        }
        if (assessmentTemplate.getUpdateTime() != null) {
            chainWrapper.set(AssessmentTemplate::getUpdateTime, assessmentTemplate.getUpdateTime());
        }
        if (assessmentTemplate.getIsDeleted() != null) {
            chainWrapper.set(AssessmentTemplate::getIsDeleted, assessmentTemplate.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentTemplate::getId, assessmentTemplate.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentTemplate.getId());
        } else {
            return assessmentTemplate;
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
    public boolean saveAssessmentTemplateBatch(List<AssessmentTemplate> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentTemplate assessmentTemplate : insertList) {
            //使用默认的雪花算法生成
            assessmentTemplate.setId(null);
            //assessmentTemplate.setCreatedDt(currentDte);
            //assessmentTemplate.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentTemplateBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentTemplate> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


