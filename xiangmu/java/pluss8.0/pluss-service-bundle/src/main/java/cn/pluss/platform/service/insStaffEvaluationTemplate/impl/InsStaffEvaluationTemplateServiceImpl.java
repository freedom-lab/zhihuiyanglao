package cn.pluss.platform.service.insStaffEvaluationTemplate.impl;

import cn.pluss.platform.mapper.InsStaffEvaluationTemplateMapper;
import cn.pluss.platform.model.entity.InsStaffEvaluationTemplate;
import cn.pluss.platform.service.insStaffEvaluationTemplate.InsStaffEvaluationTemplateService;
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
@Service("insStaffEvaluationTemplateService")
public class InsStaffEvaluationTemplateServiceImpl extends ServiceImpl< InsStaffEvaluationTemplateMapper, InsStaffEvaluationTemplate> implements InsStaffEvaluationTemplateService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffEvaluationTemplateServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffEvaluationTemplate> queryPage(Map map) {
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
    public InsStaffEvaluationTemplate queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationTemplate 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffEvaluationTemplate queryOne(InsStaffEvaluationTemplate insStaffEvaluationTemplate){
        LambdaQueryWrapper<InsStaffEvaluationTemplate> queryWrapper = getQueryWrapper(insStaffEvaluationTemplate);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationTemplate
    * @return
    */
    @Override
    public List<InsStaffEvaluationTemplate> queryList(InsStaffEvaluationTemplate insStaffEvaluationTemplate) {
        LambdaQueryWrapper<InsStaffEvaluationTemplate> queryWrapper = getQueryWrapper(insStaffEvaluationTemplate);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffEvaluationTemplate
    * @return
    */
    public static LambdaQueryWrapper<InsStaffEvaluationTemplate> getQueryWrapper(InsStaffEvaluationTemplate insStaffEvaluationTemplate){
        LambdaQueryWrapper<InsStaffEvaluationTemplate> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffEvaluationTemplate.getId() != null) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getId, insStaffEvaluationTemplate.getId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTemplate.getTenantId())) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getTenantId, insStaffEvaluationTemplate.getTenantId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTemplate.getTemplateName())) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getTemplateName, insStaffEvaluationTemplate.getTemplateName());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTemplate.getTemplateType())) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getTemplateType, insStaffEvaluationTemplate.getTemplateType());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTemplate.getRemark())) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getRemark, insStaffEvaluationTemplate.getRemark());
        }
        if (insStaffEvaluationTemplate.getCreateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getCreateUser, insStaffEvaluationTemplate.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTemplate.getCreateName())) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getCreateName, insStaffEvaluationTemplate.getCreateName());
        }
        if (insStaffEvaluationTemplate.getCreateDept() != null) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getCreateDept, insStaffEvaluationTemplate.getCreateDept());
        }
        if (insStaffEvaluationTemplate.getCreateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getCreateTime, insStaffEvaluationTemplate.getCreateTime());
        }
        if (insStaffEvaluationTemplate.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getUpdateUser, insStaffEvaluationTemplate.getUpdateUser());
        }
        if (insStaffEvaluationTemplate.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getUpdateTime, insStaffEvaluationTemplate.getUpdateTime());
        }
        if (insStaffEvaluationTemplate.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getIsDeleted, insStaffEvaluationTemplate.getIsDeleted());
        }
        if (insStaffEvaluationTemplate.getStatus() != null) {
            queryWrapper.eq(InsStaffEvaluationTemplate::getStatus, insStaffEvaluationTemplate.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationTemplate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationTemplate insert(InsStaffEvaluationTemplate insStaffEvaluationTemplate) {
        insStaffEvaluationTemplate.setId(null);
        getBaseMapper().insert(insStaffEvaluationTemplate);
        return insStaffEvaluationTemplate;
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationTemplate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationTemplate update(InsStaffEvaluationTemplate insStaffEvaluationTemplate) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffEvaluationTemplate> chainWrapper = new LambdaUpdateChainWrapper<InsStaffEvaluationTemplate>(getBaseMapper());
        if (insStaffEvaluationTemplate.getId() != null) {
            chainWrapper.set(InsStaffEvaluationTemplate::getId, insStaffEvaluationTemplate.getId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTemplate.getTenantId())) {
            chainWrapper.set(InsStaffEvaluationTemplate::getTenantId, insStaffEvaluationTemplate.getTenantId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTemplate.getTemplateName())) {
            chainWrapper.set(InsStaffEvaluationTemplate::getTemplateName, insStaffEvaluationTemplate.getTemplateName());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTemplate.getTemplateType())) {
            chainWrapper.set(InsStaffEvaluationTemplate::getTemplateType, insStaffEvaluationTemplate.getTemplateType());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTemplate.getRemark())) {
            chainWrapper.set(InsStaffEvaluationTemplate::getRemark, insStaffEvaluationTemplate.getRemark());
        }
        if (insStaffEvaluationTemplate.getCreateUser() != null) {
            chainWrapper.set(InsStaffEvaluationTemplate::getCreateUser, insStaffEvaluationTemplate.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTemplate.getCreateName())) {
            chainWrapper.set(InsStaffEvaluationTemplate::getCreateName, insStaffEvaluationTemplate.getCreateName());
        }
        if (insStaffEvaluationTemplate.getCreateDept() != null) {
            chainWrapper.set(InsStaffEvaluationTemplate::getCreateDept, insStaffEvaluationTemplate.getCreateDept());
        }
        if (insStaffEvaluationTemplate.getCreateTime() != null) {
            chainWrapper.set(InsStaffEvaluationTemplate::getCreateTime, insStaffEvaluationTemplate.getCreateTime());
        }
        if (insStaffEvaluationTemplate.getUpdateUser() != null) {
            chainWrapper.set(InsStaffEvaluationTemplate::getUpdateUser, insStaffEvaluationTemplate.getUpdateUser());
        }
        if (insStaffEvaluationTemplate.getUpdateTime() != null) {
            chainWrapper.set(InsStaffEvaluationTemplate::getUpdateTime, insStaffEvaluationTemplate.getUpdateTime());
        }
        if (insStaffEvaluationTemplate.getIsDeleted() != null) {
            chainWrapper.set(InsStaffEvaluationTemplate::getIsDeleted, insStaffEvaluationTemplate.getIsDeleted());
        }
        if (insStaffEvaluationTemplate.getStatus() != null) {
            chainWrapper.set(InsStaffEvaluationTemplate::getStatus, insStaffEvaluationTemplate.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffEvaluationTemplate::getId, insStaffEvaluationTemplate.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffEvaluationTemplate.getId());
        } else {
            return insStaffEvaluationTemplate;
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
    public boolean saveInsStaffEvaluationTemplateBatch(List<InsStaffEvaluationTemplate> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffEvaluationTemplate insStaffEvaluationTemplate : insertList) {
            //使用默认的雪花算法生成
            insStaffEvaluationTemplate.setId(null);
            //insStaffEvaluationTemplate.setCreatedDt(currentDte);
            //insStaffEvaluationTemplate.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffEvaluationTemplateBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffEvaluationTemplate> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


