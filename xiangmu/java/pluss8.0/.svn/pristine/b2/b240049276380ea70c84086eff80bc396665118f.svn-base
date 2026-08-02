package cn.pluss.platform.service.insNursingNoticeTemplate.impl;

import cn.pluss.platform.mapper.InsNursingNoticeTemplateMapper;
import cn.pluss.platform.model.entity.InsNursingNoticeTemplate;
import cn.pluss.platform.service.insNursingNoticeTemplate.InsNursingNoticeTemplateService;
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
@Service("insNursingNoticeTemplateService")
public class InsNursingNoticeTemplateServiceImpl extends ServiceImpl< InsNursingNoticeTemplateMapper, InsNursingNoticeTemplate> implements InsNursingNoticeTemplateService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingNoticeTemplateServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingNoticeTemplate> queryPage(Map map) {
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
    public InsNursingNoticeTemplate queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingNoticeTemplate 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingNoticeTemplate queryOne(InsNursingNoticeTemplate insNursingNoticeTemplate){
        LambdaQueryWrapper<InsNursingNoticeTemplate> queryWrapper = getQueryWrapper(insNursingNoticeTemplate);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingNoticeTemplate
    * @return
    */
    @Override
    public List<InsNursingNoticeTemplate> queryList(InsNursingNoticeTemplate insNursingNoticeTemplate) {
        LambdaQueryWrapper<InsNursingNoticeTemplate> queryWrapper = getQueryWrapper(insNursingNoticeTemplate);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingNoticeTemplate
    * @return
    */
    public static LambdaQueryWrapper<InsNursingNoticeTemplate> getQueryWrapper(InsNursingNoticeTemplate insNursingNoticeTemplate){
        LambdaQueryWrapper<InsNursingNoticeTemplate> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingNoticeTemplate.getId() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getId, insNursingNoticeTemplate.getId());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getTenantId())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getTenantId, insNursingNoticeTemplate.getTenantId());
        }
        if (insNursingNoticeTemplate.getCorpId() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getCorpId, insNursingNoticeTemplate.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getCorpName())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getCorpName, insNursingNoticeTemplate.getCorpName());
        }
        if (insNursingNoticeTemplate.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getInstitutionId, insNursingNoticeTemplate.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getInstitutionName())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getInstitutionName, insNursingNoticeTemplate.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getNoticeType())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getNoticeType, insNursingNoticeTemplate.getNoticeType());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getNoticeName())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getNoticeName, insNursingNoticeTemplate.getNoticeName());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getNoticeContent())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getNoticeContent, insNursingNoticeTemplate.getNoticeContent());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getSignatoryRequired())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getSignatoryRequired, insNursingNoticeTemplate.getSignatoryRequired());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getPostName())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getPostName, insNursingNoticeTemplate.getPostName());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getRemark())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getRemark, insNursingNoticeTemplate.getRemark());
        }
        if (insNursingNoticeTemplate.getCreateUser() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getCreateUser, insNursingNoticeTemplate.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingNoticeTemplate.getCreateName())) {
            queryWrapper.eq(InsNursingNoticeTemplate::getCreateName, insNursingNoticeTemplate.getCreateName());
        }
        if (insNursingNoticeTemplate.getCreateDept() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getCreateDept, insNursingNoticeTemplate.getCreateDept());
        }
        if (insNursingNoticeTemplate.getCreateTime() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getCreateTime, insNursingNoticeTemplate.getCreateTime());
        }
        if (insNursingNoticeTemplate.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getUpdateUser, insNursingNoticeTemplate.getUpdateUser());
        }
        if (insNursingNoticeTemplate.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getUpdateTime, insNursingNoticeTemplate.getUpdateTime());
        }
        if (insNursingNoticeTemplate.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getIsDeleted, insNursingNoticeTemplate.getIsDeleted());
        }
        if (insNursingNoticeTemplate.getStatus() != null) {
            queryWrapper.eq(InsNursingNoticeTemplate::getStatus, insNursingNoticeTemplate.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingNoticeTemplate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingNoticeTemplate insert(InsNursingNoticeTemplate insNursingNoticeTemplate) {
        insNursingNoticeTemplate.setId(null);
        getBaseMapper().insert(insNursingNoticeTemplate);
        return insNursingNoticeTemplate;
    }

    /**
    * 更新数据
    *
    * @param insNursingNoticeTemplate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingNoticeTemplate update(InsNursingNoticeTemplate insNursingNoticeTemplate) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingNoticeTemplate> chainWrapper = new LambdaUpdateChainWrapper<InsNursingNoticeTemplate>(getBaseMapper());
        if (insNursingNoticeTemplate.getId() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getId, insNursingNoticeTemplate.getId());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getTenantId())) {
            chainWrapper.set(InsNursingNoticeTemplate::getTenantId, insNursingNoticeTemplate.getTenantId());
        }
        if (insNursingNoticeTemplate.getCorpId() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getCorpId, insNursingNoticeTemplate.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getCorpName())) {
            chainWrapper.set(InsNursingNoticeTemplate::getCorpName, insNursingNoticeTemplate.getCorpName());
        }
        if (insNursingNoticeTemplate.getInstitutionId() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getInstitutionId, insNursingNoticeTemplate.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getInstitutionName())) {
            chainWrapper.set(InsNursingNoticeTemplate::getInstitutionName, insNursingNoticeTemplate.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getNoticeType())) {
            chainWrapper.set(InsNursingNoticeTemplate::getNoticeType, insNursingNoticeTemplate.getNoticeType());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getNoticeName())) {
            chainWrapper.set(InsNursingNoticeTemplate::getNoticeName, insNursingNoticeTemplate.getNoticeName());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getNoticeContent())) {
            chainWrapper.set(InsNursingNoticeTemplate::getNoticeContent, insNursingNoticeTemplate.getNoticeContent());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getSignatoryRequired())) {
            chainWrapper.set(InsNursingNoticeTemplate::getSignatoryRequired, insNursingNoticeTemplate.getSignatoryRequired());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getPostName())) {
            chainWrapper.set(InsNursingNoticeTemplate::getPostName, insNursingNoticeTemplate.getPostName());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getRemark())) {
            chainWrapper.set(InsNursingNoticeTemplate::getRemark, insNursingNoticeTemplate.getRemark());
        }
        if (insNursingNoticeTemplate.getCreateUser() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getCreateUser, insNursingNoticeTemplate.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingNoticeTemplate.getCreateName())) {
            chainWrapper.set(InsNursingNoticeTemplate::getCreateName, insNursingNoticeTemplate.getCreateName());
        }
        if (insNursingNoticeTemplate.getCreateDept() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getCreateDept, insNursingNoticeTemplate.getCreateDept());
        }
        if (insNursingNoticeTemplate.getCreateTime() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getCreateTime, insNursingNoticeTemplate.getCreateTime());
        }
        if (insNursingNoticeTemplate.getUpdateUser() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getUpdateUser, insNursingNoticeTemplate.getUpdateUser());
        }
        if (insNursingNoticeTemplate.getUpdateTime() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getUpdateTime, insNursingNoticeTemplate.getUpdateTime());
        }
        if (insNursingNoticeTemplate.getIsDeleted() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getIsDeleted, insNursingNoticeTemplate.getIsDeleted());
        }
        if (insNursingNoticeTemplate.getStatus() != null) {
            chainWrapper.set(InsNursingNoticeTemplate::getStatus, insNursingNoticeTemplate.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingNoticeTemplate::getId, insNursingNoticeTemplate.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingNoticeTemplate.getId());
        } else {
            return insNursingNoticeTemplate;
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
    public boolean saveInsNursingNoticeTemplateBatch(List<InsNursingNoticeTemplate> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingNoticeTemplate insNursingNoticeTemplate : insertList) {
            //使用默认的雪花算法生成
            insNursingNoticeTemplate.setId(null);
            //insNursingNoticeTemplate.setCreatedDt(currentDte);
            //insNursingNoticeTemplate.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingNoticeTemplateBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingNoticeTemplate> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


