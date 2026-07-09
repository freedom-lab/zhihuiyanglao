package cn.pluss.platform.service.insSecurityDangersQuestion.impl;

import cn.pluss.platform.mapper.InsSecurityDangersQuestionMapper;
import cn.pluss.platform.model.entity.InsSecurityDangersQuestion;
import cn.pluss.platform.service.insSecurityDangersQuestion.InsSecurityDangersQuestionService;
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
@Service("insSecurityDangersQuestionService")
public class InsSecurityDangersQuestionServiceImpl extends ServiceImpl< InsSecurityDangersQuestionMapper, InsSecurityDangersQuestion> implements InsSecurityDangersQuestionService {
    private static final Logger logger = LoggerFactory.getLogger(InsSecurityDangersQuestionServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSecurityDangersQuestion> queryPage(Map map) {
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
    public InsSecurityDangersQuestion queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityDangersQuestion 实例对象
    * @return 实例对象
    */
    @Override
    public InsSecurityDangersQuestion queryOne(InsSecurityDangersQuestion insSecurityDangersQuestion){
        LambdaQueryWrapper<InsSecurityDangersQuestion> queryWrapper = getQueryWrapper(insSecurityDangersQuestion);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityDangersQuestion
    * @return
    */
    @Override
    public List<InsSecurityDangersQuestion> queryList(InsSecurityDangersQuestion insSecurityDangersQuestion) {
        LambdaQueryWrapper<InsSecurityDangersQuestion> queryWrapper = getQueryWrapper(insSecurityDangersQuestion);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSecurityDangersQuestion
    * @return
    */
    public static LambdaQueryWrapper<InsSecurityDangersQuestion> getQueryWrapper(InsSecurityDangersQuestion insSecurityDangersQuestion){
        LambdaQueryWrapper<InsSecurityDangersQuestion> queryWrapper = new LambdaQueryWrapper<>();
        if (insSecurityDangersQuestion.getId() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getId, insSecurityDangersQuestion.getId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersQuestion.getTenantId())) {
            queryWrapper.eq(InsSecurityDangersQuestion::getTenantId, insSecurityDangersQuestion.getTenantId());
        }
        if (insSecurityDangersQuestion.getCorpId() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getCorpId, insSecurityDangersQuestion.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersQuestion.getCorpName())) {
            queryWrapper.eq(InsSecurityDangersQuestion::getCorpName, insSecurityDangersQuestion.getCorpName());
        }
        if (insSecurityDangersQuestion.getInstitutionId() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getInstitutionId, insSecurityDangersQuestion.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersQuestion.getInstitutionName())) {
            queryWrapper.eq(InsSecurityDangersQuestion::getInstitutionName, insSecurityDangersQuestion.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersQuestion.getDangersType())) {
            queryWrapper.eq(InsSecurityDangersQuestion::getDangersType, insSecurityDangersQuestion.getDangersType());
        }
        if (insSecurityDangersQuestion.getCategoryId() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getCategoryId, insSecurityDangersQuestion.getCategoryId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersQuestion.getCategoryName())) {
            queryWrapper.eq(InsSecurityDangersQuestion::getCategoryName, insSecurityDangersQuestion.getCategoryName());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersQuestion.getQuestionName())) {
            queryWrapper.eq(InsSecurityDangersQuestion::getQuestionName, insSecurityDangersQuestion.getQuestionName());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersQuestion.getRemark())) {
            queryWrapper.eq(InsSecurityDangersQuestion::getRemark, insSecurityDangersQuestion.getRemark());
        }
        if (insSecurityDangersQuestion.getCreateUser() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getCreateUser, insSecurityDangersQuestion.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersQuestion.getCreateName())) {
            queryWrapper.eq(InsSecurityDangersQuestion::getCreateName, insSecurityDangersQuestion.getCreateName());
        }
        if (insSecurityDangersQuestion.getCreateDept() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getCreateDept, insSecurityDangersQuestion.getCreateDept());
        }
        if (insSecurityDangersQuestion.getCreateTime() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getCreateTime, insSecurityDangersQuestion.getCreateTime());
        }
        if (insSecurityDangersQuestion.getUpdateUser() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getUpdateUser, insSecurityDangersQuestion.getUpdateUser());
        }
        if (insSecurityDangersQuestion.getUpdateTime() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getUpdateTime, insSecurityDangersQuestion.getUpdateTime());
        }
        if (insSecurityDangersQuestion.getIsDeleted() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getIsDeleted, insSecurityDangersQuestion.getIsDeleted());
        }
        if (insSecurityDangersQuestion.getStatus() != null) {
            queryWrapper.eq(InsSecurityDangersQuestion::getStatus, insSecurityDangersQuestion.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSecurityDangersQuestion 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityDangersQuestion insert(InsSecurityDangersQuestion insSecurityDangersQuestion) {
        insSecurityDangersQuestion.setId(null);
        getBaseMapper().insert(insSecurityDangersQuestion);
        return insSecurityDangersQuestion;
    }

    /**
    * 更新数据
    *
    * @param insSecurityDangersQuestion 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityDangersQuestion update(InsSecurityDangersQuestion insSecurityDangersQuestion) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSecurityDangersQuestion> chainWrapper = new LambdaUpdateChainWrapper<InsSecurityDangersQuestion>(getBaseMapper());
        if (insSecurityDangersQuestion.getId() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getId, insSecurityDangersQuestion.getId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersQuestion.getTenantId())) {
            chainWrapper.set(InsSecurityDangersQuestion::getTenantId, insSecurityDangersQuestion.getTenantId());
        }
        if (insSecurityDangersQuestion.getCorpId() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getCorpId, insSecurityDangersQuestion.getCorpId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersQuestion.getCorpName())) {
            chainWrapper.set(InsSecurityDangersQuestion::getCorpName, insSecurityDangersQuestion.getCorpName());
        }
        if (insSecurityDangersQuestion.getInstitutionId() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getInstitutionId, insSecurityDangersQuestion.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersQuestion.getInstitutionName())) {
            chainWrapper.set(InsSecurityDangersQuestion::getInstitutionName, insSecurityDangersQuestion.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSecurityDangersQuestion.getDangersType())) {
            chainWrapper.set(InsSecurityDangersQuestion::getDangersType, insSecurityDangersQuestion.getDangersType());
        }
        if (insSecurityDangersQuestion.getCategoryId() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getCategoryId, insSecurityDangersQuestion.getCategoryId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersQuestion.getCategoryName())) {
            chainWrapper.set(InsSecurityDangersQuestion::getCategoryName, insSecurityDangersQuestion.getCategoryName());
        }
        if (StringUtil.isNotBlank(insSecurityDangersQuestion.getQuestionName())) {
            chainWrapper.set(InsSecurityDangersQuestion::getQuestionName, insSecurityDangersQuestion.getQuestionName());
        }
        if (StringUtil.isNotBlank(insSecurityDangersQuestion.getRemark())) {
            chainWrapper.set(InsSecurityDangersQuestion::getRemark, insSecurityDangersQuestion.getRemark());
        }
        if (insSecurityDangersQuestion.getCreateUser() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getCreateUser, insSecurityDangersQuestion.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSecurityDangersQuestion.getCreateName())) {
            chainWrapper.set(InsSecurityDangersQuestion::getCreateName, insSecurityDangersQuestion.getCreateName());
        }
        if (insSecurityDangersQuestion.getCreateDept() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getCreateDept, insSecurityDangersQuestion.getCreateDept());
        }
        if (insSecurityDangersQuestion.getCreateTime() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getCreateTime, insSecurityDangersQuestion.getCreateTime());
        }
        if (insSecurityDangersQuestion.getUpdateUser() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getUpdateUser, insSecurityDangersQuestion.getUpdateUser());
        }
        if (insSecurityDangersQuestion.getUpdateTime() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getUpdateTime, insSecurityDangersQuestion.getUpdateTime());
        }
        if (insSecurityDangersQuestion.getIsDeleted() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getIsDeleted, insSecurityDangersQuestion.getIsDeleted());
        }
        if (insSecurityDangersQuestion.getStatus() != null) {
            chainWrapper.set(InsSecurityDangersQuestion::getStatus, insSecurityDangersQuestion.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSecurityDangersQuestion::getId, insSecurityDangersQuestion.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSecurityDangersQuestion.getId());
        } else {
            return insSecurityDangersQuestion;
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
    public boolean saveInsSecurityDangersQuestionBatch(List<InsSecurityDangersQuestion> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSecurityDangersQuestion insSecurityDangersQuestion : insertList) {
            //使用默认的雪花算法生成
            insSecurityDangersQuestion.setId(null);
            //insSecurityDangersQuestion.setCreatedDt(currentDte);
            //insSecurityDangersQuestion.setUpdatedDt(currentDte);
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
    public Integer deleteInsSecurityDangersQuestionBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSecurityDangersQuestion> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


