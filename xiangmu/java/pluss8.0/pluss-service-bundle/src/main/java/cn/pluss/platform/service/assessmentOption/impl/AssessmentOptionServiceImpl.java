package cn.pluss.platform.service.assessmentOption.impl;

import cn.pluss.platform.mapper.AssessmentOptionMapper;
import cn.pluss.platform.model.entity.AssessmentOption;
import cn.pluss.platform.service.assessmentOption.AssessmentOptionService;
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
@Service("assessmentOptionService")
public class AssessmentOptionServiceImpl extends ServiceImpl< AssessmentOptionMapper, AssessmentOption> implements AssessmentOptionService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentOptionServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentOption> queryPage(Map map) {
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
    public AssessmentOption queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentOption 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentOption queryOne(AssessmentOption assessmentOption){
        LambdaQueryWrapper<AssessmentOption> queryWrapper = getQueryWrapper(assessmentOption);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentOption
    * @return
    */
    @Override
    public List<AssessmentOption> queryList(AssessmentOption assessmentOption) {
        LambdaQueryWrapper<AssessmentOption> queryWrapper = getQueryWrapper(assessmentOption);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentOption
    * @return
    */
    public static LambdaQueryWrapper<AssessmentOption> getQueryWrapper(AssessmentOption assessmentOption){
        LambdaQueryWrapper<AssessmentOption> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentOption.getId() != null) {
            queryWrapper.eq(AssessmentOption::getId, assessmentOption.getId());
        }
        if (StringUtil.isNotEmpty(assessmentOption.getTenantId())) {
            queryWrapper.eq(AssessmentOption::getTenantId, assessmentOption.getTenantId());
        }
        if (assessmentOption.getQuestionId() != null) {
            queryWrapper.eq(AssessmentOption::getQuestionId, assessmentOption.getQuestionId());
        }
        if (assessmentOption.getOptionMark() != null) {
            queryWrapper.eq(AssessmentOption::getOptionMark, assessmentOption.getOptionMark());
        }
        if (assessmentOption.getIsuse() != null) {
            queryWrapper.eq(AssessmentOption::getIsuse, assessmentOption.getIsuse());
        }
        if (StringUtil.isNotEmpty(assessmentOption.getOptionContent())) {
            queryWrapper.eq(AssessmentOption::getOptionContent, assessmentOption.getOptionContent());
        }
        if (assessmentOption.getSerialNumber() != null) {
            queryWrapper.eq(AssessmentOption::getSerialNumber, assessmentOption.getSerialNumber());
        }
        if (StringUtil.isNotEmpty(assessmentOption.getRemark())) {
            queryWrapper.eq(AssessmentOption::getRemark, assessmentOption.getRemark());
        }
        if (assessmentOption.getCreateUser() != null) {
            queryWrapper.eq(AssessmentOption::getCreateUser, assessmentOption.getCreateUser());
        }
        if (assessmentOption.getCreateDept() != null) {
            queryWrapper.eq(AssessmentOption::getCreateDept, assessmentOption.getCreateDept());
        }
        if (assessmentOption.getCreateTime() != null) {
            queryWrapper.eq(AssessmentOption::getCreateTime, assessmentOption.getCreateTime());
        }
        if (assessmentOption.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentOption::getUpdateUser, assessmentOption.getUpdateUser());
        }
        if (assessmentOption.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentOption::getUpdateTime, assessmentOption.getUpdateTime());
        }
        if (assessmentOption.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentOption::getIsDeleted, assessmentOption.getIsDeleted());
        }
        if (assessmentOption.getStatus() != null) {
            queryWrapper.eq(AssessmentOption::getStatus, assessmentOption.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentOption 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentOption insert(AssessmentOption assessmentOption) {
        assessmentOption.setId(null);
        getBaseMapper().insert(assessmentOption);
        return assessmentOption;
    }

    /**
    * 更新数据
    *
    * @param assessmentOption 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentOption update(AssessmentOption assessmentOption) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentOption> chainWrapper = new LambdaUpdateChainWrapper<AssessmentOption>(getBaseMapper());
        if (assessmentOption.getId() != null) {
            chainWrapper.set(AssessmentOption::getId, assessmentOption.getId());
        }
        if (StringUtil.isNotBlank(assessmentOption.getTenantId())) {
            chainWrapper.set(AssessmentOption::getTenantId, assessmentOption.getTenantId());
        }
        if (assessmentOption.getQuestionId() != null) {
            chainWrapper.set(AssessmentOption::getQuestionId, assessmentOption.getQuestionId());
        }
        if (assessmentOption.getOptionMark() != null) {
            chainWrapper.set(AssessmentOption::getOptionMark, assessmentOption.getOptionMark());
        }
        if (assessmentOption.getIsuse() != null) {
            chainWrapper.set(AssessmentOption::getIsuse, assessmentOption.getIsuse());
        }
        if (StringUtil.isNotBlank(assessmentOption.getOptionContent())) {
            chainWrapper.set(AssessmentOption::getOptionContent, assessmentOption.getOptionContent());
        }
        if (assessmentOption.getSerialNumber() != null) {
            chainWrapper.set(AssessmentOption::getSerialNumber, assessmentOption.getSerialNumber());
        }
        if (StringUtil.isNotBlank(assessmentOption.getRemark())) {
            chainWrapper.set(AssessmentOption::getRemark, assessmentOption.getRemark());
        }
        if (assessmentOption.getCreateUser() != null) {
            chainWrapper.set(AssessmentOption::getCreateUser, assessmentOption.getCreateUser());
        }
        if (assessmentOption.getCreateDept() != null) {
            chainWrapper.set(AssessmentOption::getCreateDept, assessmentOption.getCreateDept());
        }
        if (assessmentOption.getCreateTime() != null) {
            chainWrapper.set(AssessmentOption::getCreateTime, assessmentOption.getCreateTime());
        }
        if (assessmentOption.getUpdateUser() != null) {
            chainWrapper.set(AssessmentOption::getUpdateUser, assessmentOption.getUpdateUser());
        }
        if (assessmentOption.getUpdateTime() != null) {
            chainWrapper.set(AssessmentOption::getUpdateTime, assessmentOption.getUpdateTime());
        }
        if (assessmentOption.getIsDeleted() != null) {
            chainWrapper.set(AssessmentOption::getIsDeleted, assessmentOption.getIsDeleted());
        }
        if (assessmentOption.getStatus() != null) {
            chainWrapper.set(AssessmentOption::getStatus, assessmentOption.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentOption::getId, assessmentOption.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentOption.getId());
        } else {
            return assessmentOption;
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
    public boolean saveAssessmentOptionBatch(List<AssessmentOption> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentOption assessmentOption : insertList) {
            //使用默认的雪花算法生成
            assessmentOption.setId(null);
            //assessmentOption.setCreatedDt(currentDte);
            //assessmentOption.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentOptionBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentOption> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    /**
    * 根据问题ID列表批量查询选项
    * @param questionIds
    * @return
    */
    @Override
    public List<AssessmentOption> selectByQuestionIds(List<Long> questionIds) {
        if(CollectionUtils.isEmpty(questionIds)){
            return null;
        }
        return getBaseMapper().selectByQuestionIds(questionIds);
    }
}


