package cn.pluss.platform.service.insBaseContractTemplate.impl;

import cn.pluss.platform.mapper.InsBaseContractTemplateMapper;
import cn.pluss.platform.model.entity.InsBaseContractTemplate;
import cn.pluss.platform.service.insBaseContractTemplate.InsBaseContractTemplateService;
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
@Service("insBaseContractTemplateService")
public class InsBaseContractTemplateServiceImpl extends ServiceImpl< InsBaseContractTemplateMapper, InsBaseContractTemplate> implements InsBaseContractTemplateService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseContractTemplateServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseContractTemplate> queryPage(Map map) {
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
    public InsBaseContractTemplate queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseContractTemplate 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseContractTemplate queryOne(InsBaseContractTemplate insBaseContractTemplate){
        LambdaQueryWrapper<InsBaseContractTemplate> queryWrapper = getQueryWrapper(insBaseContractTemplate);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseContractTemplate
    * @return
    */
    @Override
    public List<InsBaseContractTemplate> queryList(InsBaseContractTemplate insBaseContractTemplate) {
        LambdaQueryWrapper<InsBaseContractTemplate> queryWrapper = getQueryWrapper(insBaseContractTemplate);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseContractTemplate
    * @return
    */
    public static LambdaQueryWrapper<InsBaseContractTemplate> getQueryWrapper(InsBaseContractTemplate insBaseContractTemplate){
        LambdaQueryWrapper<InsBaseContractTemplate> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseContractTemplate.getId() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getId, insBaseContractTemplate.getId());
        }
        if (StringUtil.isNotEmpty(insBaseContractTemplate.getTenantId())) {
            queryWrapper.eq(InsBaseContractTemplate::getTenantId, insBaseContractTemplate.getTenantId());
        }
        if (insBaseContractTemplate.getCorpId() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getCorpId, insBaseContractTemplate.getCorpId());
        }
        if (StringUtil.isNotEmpty(insBaseContractTemplate.getCorpName())) {
            queryWrapper.eq(InsBaseContractTemplate::getCorpName, insBaseContractTemplate.getCorpName());
        }
        if (insBaseContractTemplate.getInstitutionId() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getInstitutionId, insBaseContractTemplate.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insBaseContractTemplate.getInstitutionName())) {
            queryWrapper.eq(InsBaseContractTemplate::getInstitutionName, insBaseContractTemplate.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insBaseContractTemplate.getTemplateName())) {
            queryWrapper.eq(InsBaseContractTemplate::getTemplateName, insBaseContractTemplate.getTemplateName());
        }
        if (StringUtil.isNotEmpty(insBaseContractTemplate.getTemplateContent())) {
            queryWrapper.eq(InsBaseContractTemplate::getTemplateContent, insBaseContractTemplate.getTemplateContent());
        }
        if (StringUtil.isNotEmpty(insBaseContractTemplate.getRemark())) {
            queryWrapper.eq(InsBaseContractTemplate::getRemark, insBaseContractTemplate.getRemark());
        }
        if (insBaseContractTemplate.getCreateUser() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getCreateUser, insBaseContractTemplate.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseContractTemplate.getCreateName())) {
            queryWrapper.eq(InsBaseContractTemplate::getCreateName, insBaseContractTemplate.getCreateName());
        }
        if (insBaseContractTemplate.getCreateDept() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getCreateDept, insBaseContractTemplate.getCreateDept());
        }
        if (insBaseContractTemplate.getCreateTime() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getCreateTime, insBaseContractTemplate.getCreateTime());
        }
        if (insBaseContractTemplate.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getUpdateUser, insBaseContractTemplate.getUpdateUser());
        }
        if (insBaseContractTemplate.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getUpdateTime, insBaseContractTemplate.getUpdateTime());
        }
        if (insBaseContractTemplate.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getIsDeleted, insBaseContractTemplate.getIsDeleted());
        }
        if (insBaseContractTemplate.getStatus() != null) {
            queryWrapper.eq(InsBaseContractTemplate::getStatus, insBaseContractTemplate.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseContractTemplate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseContractTemplate insert(InsBaseContractTemplate insBaseContractTemplate) {
        insBaseContractTemplate.setId(null);
        getBaseMapper().insert(insBaseContractTemplate);
        return insBaseContractTemplate;
    }

    /**
    * 更新数据
    *
    * @param insBaseContractTemplate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseContractTemplate update(InsBaseContractTemplate insBaseContractTemplate) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseContractTemplate> chainWrapper = new LambdaUpdateChainWrapper<InsBaseContractTemplate>(getBaseMapper());
        if (insBaseContractTemplate.getId() != null) {
            chainWrapper.set(InsBaseContractTemplate::getId, insBaseContractTemplate.getId());
        }
        if (StringUtil.isNotBlank(insBaseContractTemplate.getTenantId())) {
            chainWrapper.set(InsBaseContractTemplate::getTenantId, insBaseContractTemplate.getTenantId());
        }
        if (insBaseContractTemplate.getCorpId() != null) {
            chainWrapper.set(InsBaseContractTemplate::getCorpId, insBaseContractTemplate.getCorpId());
        }
        if (StringUtil.isNotBlank(insBaseContractTemplate.getCorpName())) {
            chainWrapper.set(InsBaseContractTemplate::getCorpName, insBaseContractTemplate.getCorpName());
        }
        if (insBaseContractTemplate.getInstitutionId() != null) {
            chainWrapper.set(InsBaseContractTemplate::getInstitutionId, insBaseContractTemplate.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insBaseContractTemplate.getInstitutionName())) {
            chainWrapper.set(InsBaseContractTemplate::getInstitutionName, insBaseContractTemplate.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insBaseContractTemplate.getTemplateName())) {
            chainWrapper.set(InsBaseContractTemplate::getTemplateName, insBaseContractTemplate.getTemplateName());
        }
        if (StringUtil.isNotBlank(insBaseContractTemplate.getTemplateContent())) {
            chainWrapper.set(InsBaseContractTemplate::getTemplateContent, insBaseContractTemplate.getTemplateContent());
        }
        if (StringUtil.isNotBlank(insBaseContractTemplate.getRemark())) {
            chainWrapper.set(InsBaseContractTemplate::getRemark, insBaseContractTemplate.getRemark());
        }
        if (insBaseContractTemplate.getCreateUser() != null) {
            chainWrapper.set(InsBaseContractTemplate::getCreateUser, insBaseContractTemplate.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseContractTemplate.getCreateName())) {
            chainWrapper.set(InsBaseContractTemplate::getCreateName, insBaseContractTemplate.getCreateName());
        }
        if (insBaseContractTemplate.getCreateDept() != null) {
            chainWrapper.set(InsBaseContractTemplate::getCreateDept, insBaseContractTemplate.getCreateDept());
        }
        if (insBaseContractTemplate.getCreateTime() != null) {
            chainWrapper.set(InsBaseContractTemplate::getCreateTime, insBaseContractTemplate.getCreateTime());
        }
        if (insBaseContractTemplate.getUpdateUser() != null) {
            chainWrapper.set(InsBaseContractTemplate::getUpdateUser, insBaseContractTemplate.getUpdateUser());
        }
        if (insBaseContractTemplate.getUpdateTime() != null) {
            chainWrapper.set(InsBaseContractTemplate::getUpdateTime, insBaseContractTemplate.getUpdateTime());
        }
        if (insBaseContractTemplate.getIsDeleted() != null) {
            chainWrapper.set(InsBaseContractTemplate::getIsDeleted, insBaseContractTemplate.getIsDeleted());
        }
        if (insBaseContractTemplate.getStatus() != null) {
            chainWrapper.set(InsBaseContractTemplate::getStatus, insBaseContractTemplate.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseContractTemplate::getId, insBaseContractTemplate.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseContractTemplate.getId());
        } else {
            return insBaseContractTemplate;
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
    public boolean saveInsBaseContractTemplateBatch(List<InsBaseContractTemplate> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseContractTemplate insBaseContractTemplate : insertList) {
            //使用默认的雪花算法生成
            insBaseContractTemplate.setId(null);
            //insBaseContractTemplate.setCreatedDt(currentDte);
            //insBaseContractTemplate.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseContractTemplateBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseContractTemplate> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


