package cn.pluss.platform.service.insStaffEvaluationOption.impl;

import cn.pluss.platform.mapper.InsStaffEvaluationOptionMapper;
import cn.pluss.platform.model.entity.InsStaffEvaluationOption;
import cn.pluss.platform.service.insStaffEvaluationOption.InsStaffEvaluationOptionService;
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
@Service("insStaffEvaluationOptionService")
public class InsStaffEvaluationOptionServiceImpl extends ServiceImpl< InsStaffEvaluationOptionMapper, InsStaffEvaluationOption> implements InsStaffEvaluationOptionService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffEvaluationOptionServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffEvaluationOption> queryPage(Map map) {
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
    public InsStaffEvaluationOption queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationOption 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffEvaluationOption queryOne(InsStaffEvaluationOption insStaffEvaluationOption){
        LambdaQueryWrapper<InsStaffEvaluationOption> queryWrapper = getQueryWrapper(insStaffEvaluationOption);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationOption
    * @return
    */
    @Override
    public List<InsStaffEvaluationOption> queryList(InsStaffEvaluationOption insStaffEvaluationOption) {
        LambdaQueryWrapper<InsStaffEvaluationOption> queryWrapper = getQueryWrapper(insStaffEvaluationOption);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffEvaluationOption
    * @return
    */
    public static LambdaQueryWrapper<InsStaffEvaluationOption> getQueryWrapper(InsStaffEvaluationOption insStaffEvaluationOption){
        LambdaQueryWrapper<InsStaffEvaluationOption> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffEvaluationOption.getId() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getId, insStaffEvaluationOption.getId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationOption.getTenantId())) {
            queryWrapper.eq(InsStaffEvaluationOption::getTenantId, insStaffEvaluationOption.getTenantId());
        }
        if (insStaffEvaluationOption.getTemplateId() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getTemplateId, insStaffEvaluationOption.getTemplateId());
        }
        if (insStaffEvaluationOption.getGroupId() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getGroupId, insStaffEvaluationOption.getGroupId());
        }
        if (insStaffEvaluationOption.getQuestionId() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getQuestionId, insStaffEvaluationOption.getQuestionId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationOption.getOptionContent())) {
            queryWrapper.eq(InsStaffEvaluationOption::getOptionContent, insStaffEvaluationOption.getOptionContent());
        }
        if (insStaffEvaluationOption.getOptionScore() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getOptionScore, insStaffEvaluationOption.getOptionScore());
        }
        if (insStaffEvaluationOption.getSerialNumber() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getSerialNumber, insStaffEvaluationOption.getSerialNumber());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationOption.getRemark())) {
            queryWrapper.eq(InsStaffEvaluationOption::getRemark, insStaffEvaluationOption.getRemark());
        }
        if (insStaffEvaluationOption.getCreateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getCreateUser, insStaffEvaluationOption.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationOption.getCreateName())) {
            queryWrapper.eq(InsStaffEvaluationOption::getCreateName, insStaffEvaluationOption.getCreateName());
        }
        if (insStaffEvaluationOption.getCreateDept() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getCreateDept, insStaffEvaluationOption.getCreateDept());
        }
        if (insStaffEvaluationOption.getCreateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getCreateTime, insStaffEvaluationOption.getCreateTime());
        }
        if (insStaffEvaluationOption.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getUpdateUser, insStaffEvaluationOption.getUpdateUser());
        }
        if (insStaffEvaluationOption.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getUpdateTime, insStaffEvaluationOption.getUpdateTime());
        }
        if (insStaffEvaluationOption.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getIsDeleted, insStaffEvaluationOption.getIsDeleted());
        }
        if (insStaffEvaluationOption.getStatus() != null) {
            queryWrapper.eq(InsStaffEvaluationOption::getStatus, insStaffEvaluationOption.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationOption 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationOption insert(InsStaffEvaluationOption insStaffEvaluationOption) {
        insStaffEvaluationOption.setId(null);
        getBaseMapper().insert(insStaffEvaluationOption);
        return insStaffEvaluationOption;
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationOption 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationOption update(InsStaffEvaluationOption insStaffEvaluationOption) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffEvaluationOption> chainWrapper = new LambdaUpdateChainWrapper<InsStaffEvaluationOption>(getBaseMapper());
        if (insStaffEvaluationOption.getId() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getId, insStaffEvaluationOption.getId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationOption.getTenantId())) {
            chainWrapper.set(InsStaffEvaluationOption::getTenantId, insStaffEvaluationOption.getTenantId());
        }
        if (insStaffEvaluationOption.getTemplateId() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getTemplateId, insStaffEvaluationOption.getTemplateId());
        }
        if (insStaffEvaluationOption.getGroupId() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getGroupId, insStaffEvaluationOption.getGroupId());
        }
        if (insStaffEvaluationOption.getQuestionId() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getQuestionId, insStaffEvaluationOption.getQuestionId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationOption.getOptionContent())) {
            chainWrapper.set(InsStaffEvaluationOption::getOptionContent, insStaffEvaluationOption.getOptionContent());
        }
        if (insStaffEvaluationOption.getOptionScore() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getOptionScore, insStaffEvaluationOption.getOptionScore());
        }
        if (insStaffEvaluationOption.getSerialNumber() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getSerialNumber, insStaffEvaluationOption.getSerialNumber());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationOption.getRemark())) {
            chainWrapper.set(InsStaffEvaluationOption::getRemark, insStaffEvaluationOption.getRemark());
        }
        if (insStaffEvaluationOption.getCreateUser() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getCreateUser, insStaffEvaluationOption.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationOption.getCreateName())) {
            chainWrapper.set(InsStaffEvaluationOption::getCreateName, insStaffEvaluationOption.getCreateName());
        }
        if (insStaffEvaluationOption.getCreateDept() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getCreateDept, insStaffEvaluationOption.getCreateDept());
        }
        if (insStaffEvaluationOption.getCreateTime() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getCreateTime, insStaffEvaluationOption.getCreateTime());
        }
        if (insStaffEvaluationOption.getUpdateUser() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getUpdateUser, insStaffEvaluationOption.getUpdateUser());
        }
        if (insStaffEvaluationOption.getUpdateTime() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getUpdateTime, insStaffEvaluationOption.getUpdateTime());
        }
        if (insStaffEvaluationOption.getIsDeleted() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getIsDeleted, insStaffEvaluationOption.getIsDeleted());
        }
        if (insStaffEvaluationOption.getStatus() != null) {
            chainWrapper.set(InsStaffEvaluationOption::getStatus, insStaffEvaluationOption.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffEvaluationOption::getId, insStaffEvaluationOption.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffEvaluationOption.getId());
        } else {
            return insStaffEvaluationOption;
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
    public boolean saveInsStaffEvaluationOptionBatch(List<InsStaffEvaluationOption> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffEvaluationOption insStaffEvaluationOption : insertList) {
            //使用默认的雪花算法生成
            insStaffEvaluationOption.setId(null);
            //insStaffEvaluationOption.setCreatedDt(currentDte);
            //insStaffEvaluationOption.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffEvaluationOptionBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffEvaluationOption> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


