package cn.pluss.platform.service.insStaffEvaluationQuestion.impl;

import cn.pluss.platform.mapper.InsStaffEvaluationQuestionMapper;
import cn.pluss.platform.model.entity.InsStaffEvaluationQuestion;
import cn.pluss.platform.service.insStaffEvaluationQuestion.InsStaffEvaluationQuestionService;
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
@Service("insStaffEvaluationQuestionService")
public class InsStaffEvaluationQuestionServiceImpl extends ServiceImpl< InsStaffEvaluationQuestionMapper, InsStaffEvaluationQuestion> implements InsStaffEvaluationQuestionService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffEvaluationQuestionServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffEvaluationQuestion> queryPage(Map map) {
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
    public InsStaffEvaluationQuestion queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationQuestion 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffEvaluationQuestion queryOne(InsStaffEvaluationQuestion insStaffEvaluationQuestion){
        LambdaQueryWrapper<InsStaffEvaluationQuestion> queryWrapper = getQueryWrapper(insStaffEvaluationQuestion);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationQuestion
    * @return
    */
    @Override
    public List<InsStaffEvaluationQuestion> queryList(InsStaffEvaluationQuestion insStaffEvaluationQuestion) {
        LambdaQueryWrapper<InsStaffEvaluationQuestion> queryWrapper = getQueryWrapper(insStaffEvaluationQuestion);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffEvaluationQuestion
    * @return
    */
    public static LambdaQueryWrapper<InsStaffEvaluationQuestion> getQueryWrapper(InsStaffEvaluationQuestion insStaffEvaluationQuestion){
        LambdaQueryWrapper<InsStaffEvaluationQuestion> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffEvaluationQuestion.getId() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getId, insStaffEvaluationQuestion.getId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationQuestion.getTenantId())) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getTenantId, insStaffEvaluationQuestion.getTenantId());
        }
        if (insStaffEvaluationQuestion.getTemplateId() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getTemplateId, insStaffEvaluationQuestion.getTemplateId());
        }
        if (insStaffEvaluationQuestion.getGroupId() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getGroupId, insStaffEvaluationQuestion.getGroupId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationQuestion.getGroupName())) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getGroupName, insStaffEvaluationQuestion.getGroupName());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationQuestion.getQuestionName())) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getQuestionName, insStaffEvaluationQuestion.getQuestionName());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationQuestion.getQuestionType())) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getQuestionType, insStaffEvaluationQuestion.getQuestionType());
        }
        if (insStaffEvaluationQuestion.getSerialNumber() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getSerialNumber, insStaffEvaluationQuestion.getSerialNumber());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationQuestion.getRemark())) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getRemark, insStaffEvaluationQuestion.getRemark());
        }
        if (insStaffEvaluationQuestion.getCreateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getCreateUser, insStaffEvaluationQuestion.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationQuestion.getCreateName())) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getCreateName, insStaffEvaluationQuestion.getCreateName());
        }
        if (insStaffEvaluationQuestion.getCreateDept() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getCreateDept, insStaffEvaluationQuestion.getCreateDept());
        }
        if (insStaffEvaluationQuestion.getCreateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getCreateTime, insStaffEvaluationQuestion.getCreateTime());
        }
        if (insStaffEvaluationQuestion.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getUpdateUser, insStaffEvaluationQuestion.getUpdateUser());
        }
        if (insStaffEvaluationQuestion.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getUpdateTime, insStaffEvaluationQuestion.getUpdateTime());
        }
        if (insStaffEvaluationQuestion.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getIsDeleted, insStaffEvaluationQuestion.getIsDeleted());
        }
        if (insStaffEvaluationQuestion.getStatus() != null) {
            queryWrapper.eq(InsStaffEvaluationQuestion::getStatus, insStaffEvaluationQuestion.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationQuestion 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationQuestion insert(InsStaffEvaluationQuestion insStaffEvaluationQuestion) {
        insStaffEvaluationQuestion.setId(null);
        getBaseMapper().insert(insStaffEvaluationQuestion);
        return insStaffEvaluationQuestion;
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationQuestion 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationQuestion update(InsStaffEvaluationQuestion insStaffEvaluationQuestion) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffEvaluationQuestion> chainWrapper = new LambdaUpdateChainWrapper<InsStaffEvaluationQuestion>(getBaseMapper());
        if (insStaffEvaluationQuestion.getId() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getId, insStaffEvaluationQuestion.getId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationQuestion.getTenantId())) {
            chainWrapper.set(InsStaffEvaluationQuestion::getTenantId, insStaffEvaluationQuestion.getTenantId());
        }
        if (insStaffEvaluationQuestion.getTemplateId() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getTemplateId, insStaffEvaluationQuestion.getTemplateId());
        }
        if (insStaffEvaluationQuestion.getGroupId() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getGroupId, insStaffEvaluationQuestion.getGroupId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationQuestion.getGroupName())) {
            chainWrapper.set(InsStaffEvaluationQuestion::getGroupName, insStaffEvaluationQuestion.getGroupName());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationQuestion.getQuestionName())) {
            chainWrapper.set(InsStaffEvaluationQuestion::getQuestionName, insStaffEvaluationQuestion.getQuestionName());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationQuestion.getQuestionType())) {
            chainWrapper.set(InsStaffEvaluationQuestion::getQuestionType, insStaffEvaluationQuestion.getQuestionType());
        }
        if (insStaffEvaluationQuestion.getSerialNumber() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getSerialNumber, insStaffEvaluationQuestion.getSerialNumber());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationQuestion.getRemark())) {
            chainWrapper.set(InsStaffEvaluationQuestion::getRemark, insStaffEvaluationQuestion.getRemark());
        }
        if (insStaffEvaluationQuestion.getCreateUser() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getCreateUser, insStaffEvaluationQuestion.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationQuestion.getCreateName())) {
            chainWrapper.set(InsStaffEvaluationQuestion::getCreateName, insStaffEvaluationQuestion.getCreateName());
        }
        if (insStaffEvaluationQuestion.getCreateDept() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getCreateDept, insStaffEvaluationQuestion.getCreateDept());
        }
        if (insStaffEvaluationQuestion.getCreateTime() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getCreateTime, insStaffEvaluationQuestion.getCreateTime());
        }
        if (insStaffEvaluationQuestion.getUpdateUser() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getUpdateUser, insStaffEvaluationQuestion.getUpdateUser());
        }
        if (insStaffEvaluationQuestion.getUpdateTime() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getUpdateTime, insStaffEvaluationQuestion.getUpdateTime());
        }
        if (insStaffEvaluationQuestion.getIsDeleted() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getIsDeleted, insStaffEvaluationQuestion.getIsDeleted());
        }
        if (insStaffEvaluationQuestion.getStatus() != null) {
            chainWrapper.set(InsStaffEvaluationQuestion::getStatus, insStaffEvaluationQuestion.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffEvaluationQuestion::getId, insStaffEvaluationQuestion.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffEvaluationQuestion.getId());
        } else {
            return insStaffEvaluationQuestion;
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
    public boolean saveInsStaffEvaluationQuestionBatch(List<InsStaffEvaluationQuestion> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffEvaluationQuestion insStaffEvaluationQuestion : insertList) {
            //使用默认的雪花算法生成
            insStaffEvaluationQuestion.setId(null);
            //insStaffEvaluationQuestion.setCreatedDt(currentDte);
            //insStaffEvaluationQuestion.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffEvaluationQuestionBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffEvaluationQuestion> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


