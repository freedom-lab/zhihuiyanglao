package cn.pluss.platform.service.assessmentStandard.impl;

import cn.pluss.platform.mapper.AssessmentStandardMapper;
import cn.pluss.platform.model.entity.AssessmentStandard;
import cn.pluss.platform.service.assessmentStandard.AssessmentStandardService;
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
@Service("assessmentStandardService")
public class AssessmentStandardServiceImpl extends ServiceImpl< AssessmentStandardMapper, AssessmentStandard> implements AssessmentStandardService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentStandardServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentStandard> queryPage(Map map) {
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
    public AssessmentStandard queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentStandard 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentStandard queryOne(AssessmentStandard assessmentStandard){
        LambdaQueryWrapper<AssessmentStandard> queryWrapper = getQueryWrapper(assessmentStandard);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentStandard
    * @return
    */
    @Override
    public List<AssessmentStandard> queryList(AssessmentStandard assessmentStandard) {
        LambdaQueryWrapper<AssessmentStandard> queryWrapper = getQueryWrapper(assessmentStandard);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentStandard
    * @return
    */
    public static LambdaQueryWrapper<AssessmentStandard> getQueryWrapper(AssessmentStandard assessmentStandard){
        LambdaQueryWrapper<AssessmentStandard> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentStandard.getId() != null) {
            queryWrapper.eq(AssessmentStandard::getId, assessmentStandard.getId());
        }
        if (StringUtil.isNotEmpty(assessmentStandard.getTenantId())) {
            queryWrapper.eq(AssessmentStandard::getTenantId, assessmentStandard.getTenantId());
        }
        if (StringUtil.isNotEmpty(assessmentStandard.getLevelName())) {
            queryWrapper.eq(AssessmentStandard::getLevelName, assessmentStandard.getLevelName());
        }
        if (assessmentStandard.getTemplateId() != null) {
            queryWrapper.eq(AssessmentStandard::getTemplateId, assessmentStandard.getTemplateId());
        }
        if (assessmentStandard.getScoreStart() != null) {
            queryWrapper.eq(AssessmentStandard::getScoreStart, assessmentStandard.getScoreStart());
        }
        if (assessmentStandard.getScoreEnd() != null) {
            queryWrapper.eq(AssessmentStandard::getScoreEnd, assessmentStandard.getScoreEnd());
        }
        if (StringUtil.isNotEmpty(assessmentStandard.getScoreResult())) {
            queryWrapper.eq(AssessmentStandard::getScoreResult, assessmentStandard.getScoreResult());
        }
        if (assessmentStandard.getSerialNumber() != null) {
            queryWrapper.eq(AssessmentStandard::getSerialNumber, assessmentStandard.getSerialNumber());
        }
        if (StringUtil.isNotEmpty(assessmentStandard.getRemark())) {
            queryWrapper.eq(AssessmentStandard::getRemark, assessmentStandard.getRemark());
        }
        if (assessmentStandard.getCreateUser() != null) {
            queryWrapper.eq(AssessmentStandard::getCreateUser, assessmentStandard.getCreateUser());
        }
        if (assessmentStandard.getCreateDept() != null) {
            queryWrapper.eq(AssessmentStandard::getCreateDept, assessmentStandard.getCreateDept());
        }
        if (assessmentStandard.getCreateTime() != null) {
            queryWrapper.eq(AssessmentStandard::getCreateTime, assessmentStandard.getCreateTime());
        }
        if (assessmentStandard.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentStandard::getUpdateUser, assessmentStandard.getUpdateUser());
        }
        if (assessmentStandard.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentStandard::getUpdateTime, assessmentStandard.getUpdateTime());
        }
        if (assessmentStandard.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentStandard::getIsDeleted, assessmentStandard.getIsDeleted());
        }
        if (assessmentStandard.getStatus() != null) {
            queryWrapper.eq(AssessmentStandard::getStatus, assessmentStandard.getStatus());
        }
        if (StringUtil.isNotEmpty(assessmentStandard.getAssessmentSuggest())) {
            queryWrapper.eq(AssessmentStandard::getAssessmentSuggest, assessmentStandard.getAssessmentSuggest());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentStandard insert(AssessmentStandard assessmentStandard) {
        assessmentStandard.setId(null);
        getBaseMapper().insert(assessmentStandard);
        return assessmentStandard;
    }

    /**
    * 更新数据
    *
    * @param assessmentStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentStandard update(AssessmentStandard assessmentStandard) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentStandard> chainWrapper = new LambdaUpdateChainWrapper<AssessmentStandard>(getBaseMapper());
        if (assessmentStandard.getId() != null) {
            chainWrapper.set(AssessmentStandard::getId, assessmentStandard.getId());
        }
        if (StringUtil.isNotBlank(assessmentStandard.getTenantId())) {
            chainWrapper.set(AssessmentStandard::getTenantId, assessmentStandard.getTenantId());
        }
        if (StringUtil.isNotBlank(assessmentStandard.getLevelName())) {
            chainWrapper.set(AssessmentStandard::getLevelName, assessmentStandard.getLevelName());
        }
        if (assessmentStandard.getTemplateId() != null) {
            chainWrapper.set(AssessmentStandard::getTemplateId, assessmentStandard.getTemplateId());
        }
        if (assessmentStandard.getScoreStart() != null) {
            chainWrapper.set(AssessmentStandard::getScoreStart, assessmentStandard.getScoreStart());
        }
        if (assessmentStandard.getScoreEnd() != null) {
            chainWrapper.set(AssessmentStandard::getScoreEnd, assessmentStandard.getScoreEnd());
        }
        if (StringUtil.isNotBlank(assessmentStandard.getScoreResult())) {
            chainWrapper.set(AssessmentStandard::getScoreResult, assessmentStandard.getScoreResult());
        }
        if (assessmentStandard.getSerialNumber() != null) {
            chainWrapper.set(AssessmentStandard::getSerialNumber, assessmentStandard.getSerialNumber());
        }
        if (StringUtil.isNotBlank(assessmentStandard.getRemark())) {
            chainWrapper.set(AssessmentStandard::getRemark, assessmentStandard.getRemark());
        }
        if (assessmentStandard.getCreateUser() != null) {
            chainWrapper.set(AssessmentStandard::getCreateUser, assessmentStandard.getCreateUser());
        }
        if (assessmentStandard.getCreateDept() != null) {
            chainWrapper.set(AssessmentStandard::getCreateDept, assessmentStandard.getCreateDept());
        }
        if (assessmentStandard.getCreateTime() != null) {
            chainWrapper.set(AssessmentStandard::getCreateTime, assessmentStandard.getCreateTime());
        }
        if (assessmentStandard.getUpdateUser() != null) {
            chainWrapper.set(AssessmentStandard::getUpdateUser, assessmentStandard.getUpdateUser());
        }
        if (assessmentStandard.getUpdateTime() != null) {
            chainWrapper.set(AssessmentStandard::getUpdateTime, assessmentStandard.getUpdateTime());
        }
        if (assessmentStandard.getIsDeleted() != null) {
            chainWrapper.set(AssessmentStandard::getIsDeleted, assessmentStandard.getIsDeleted());
        }
        if (assessmentStandard.getStatus() != null) {
            chainWrapper.set(AssessmentStandard::getStatus, assessmentStandard.getStatus());
        }
        if (StringUtil.isNotBlank(assessmentStandard.getAssessmentSuggest())) {
            chainWrapper.set(AssessmentStandard::getAssessmentSuggest, assessmentStandard.getAssessmentSuggest());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentStandard::getId, assessmentStandard.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentStandard.getId());
        } else {
            return assessmentStandard;
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
    public boolean saveAssessmentStandardBatch(List<AssessmentStandard> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentStandard assessmentStandard : insertList) {
            //使用默认的雪花算法生成
            assessmentStandard.setId(null);
            //assessmentStandard.setCreatedDt(currentDte);
            //assessmentStandard.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentStandardBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentStandard> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public List<AssessmentStandard> queryAssessmentStandardsByTemplateId(Long id) {
        return getBaseMapper().queryAssessmentStandardsByTemplateId(id);
    }

    @Override
    public List<AssessmentStandard> queryAssessmentStandardsByTemplateIds(List<Long> templateIds) {
        return getBaseMapper().queryAssessmentStandardsByTemplateIds(templateIds);
    }
}


