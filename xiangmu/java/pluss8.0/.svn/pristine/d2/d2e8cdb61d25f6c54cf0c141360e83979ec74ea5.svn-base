package cn.pluss.platform.service.healthDiseaseEncyclopedia.impl;

import cn.pluss.platform.mapper.HealthDiseaseEncyclopediaMapper;
import cn.pluss.platform.model.entity.HealthDiseaseEncyclopedia;
import cn.pluss.platform.service.healthDiseaseEncyclopedia.HealthDiseaseEncyclopediaService;
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
@Service("healthDiseaseEncyclopediaService")
public class HealthDiseaseEncyclopediaServiceImpl extends ServiceImpl< HealthDiseaseEncyclopediaMapper, HealthDiseaseEncyclopedia> implements HealthDiseaseEncyclopediaService {
    private static final Logger logger = LoggerFactory.getLogger(HealthDiseaseEncyclopediaServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthDiseaseEncyclopedia> queryPage(Map map) {
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
    public HealthDiseaseEncyclopedia queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthDiseaseEncyclopedia 实例对象
    * @return 实例对象
    */
    @Override
    public HealthDiseaseEncyclopedia queryOne(HealthDiseaseEncyclopedia healthDiseaseEncyclopedia){
        LambdaQueryWrapper<HealthDiseaseEncyclopedia> queryWrapper = getQueryWrapper(healthDiseaseEncyclopedia);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthDiseaseEncyclopedia
    * @return
    */
    @Override
    public List<HealthDiseaseEncyclopedia> queryList(HealthDiseaseEncyclopedia healthDiseaseEncyclopedia) {
        LambdaQueryWrapper<HealthDiseaseEncyclopedia> queryWrapper = getQueryWrapper(healthDiseaseEncyclopedia);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthDiseaseEncyclopedia
    * @return
    */
    public static LambdaQueryWrapper<HealthDiseaseEncyclopedia> getQueryWrapper(HealthDiseaseEncyclopedia healthDiseaseEncyclopedia){
        LambdaQueryWrapper<HealthDiseaseEncyclopedia> queryWrapper = new LambdaQueryWrapper<>();
        if (healthDiseaseEncyclopedia.getId() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getId, healthDiseaseEncyclopedia.getId());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getTenantId())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getTenantId, healthDiseaseEncyclopedia.getTenantId());
        }
        if (healthDiseaseEncyclopedia.getCorpId() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getCorpId, healthDiseaseEncyclopedia.getCorpId());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getCorpName())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getCorpName, healthDiseaseEncyclopedia.getCorpName());
        }
        if (healthDiseaseEncyclopedia.getInstitutionId() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getInstitutionId, healthDiseaseEncyclopedia.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getInstitutionName())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getInstitutionName, healthDiseaseEncyclopedia.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getTitle())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getTitle, healthDiseaseEncyclopedia.getTitle());
        }
        if (healthDiseaseEncyclopedia.getDiseaseId() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getDiseaseId, healthDiseaseEncyclopedia.getDiseaseId());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getDiseaseName())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getDiseaseName, healthDiseaseEncyclopedia.getDiseaseName());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getContentType())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getContentType, healthDiseaseEncyclopedia.getContentType());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getSource())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getSource, healthDiseaseEncyclopedia.getSource());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getContent())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getContent, healthDiseaseEncyclopedia.getContent());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getCoverImage())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getCoverImage, healthDiseaseEncyclopedia.getCoverImage());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getVideoUrl())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getVideoUrl, healthDiseaseEncyclopedia.getVideoUrl());
        }
        if (healthDiseaseEncyclopedia.getPublishTime() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getPublishTime, healthDiseaseEncyclopedia.getPublishTime());
        }
        if (healthDiseaseEncyclopedia.getViewCount() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getViewCount, healthDiseaseEncyclopedia.getViewCount());
        }
        if (healthDiseaseEncyclopedia.getCollectCount() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getCollectCount, healthDiseaseEncyclopedia.getCollectCount());
        }
        if (healthDiseaseEncyclopedia.getIsRecommend() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getIsRecommend, healthDiseaseEncyclopedia.getIsRecommend());
        }
        if (healthDiseaseEncyclopedia.getContentStatus() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getContentStatus, healthDiseaseEncyclopedia.getContentStatus());
        }
        if (healthDiseaseEncyclopedia.getAuditState() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getAuditState, healthDiseaseEncyclopedia.getAuditState());
        }
        if (healthDiseaseEncyclopedia.getAuditId() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getAuditId, healthDiseaseEncyclopedia.getAuditId());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getAuditName())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getAuditName, healthDiseaseEncyclopedia.getAuditName());
        }
        if (healthDiseaseEncyclopedia.getAuditTime() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getAuditTime, healthDiseaseEncyclopedia.getAuditTime());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getAuditMemo())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getAuditMemo, healthDiseaseEncyclopedia.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getKeywords())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getKeywords, healthDiseaseEncyclopedia.getKeywords());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getRemark())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getRemark, healthDiseaseEncyclopedia.getRemark());
        }
        if (healthDiseaseEncyclopedia.getCreateUser() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getCreateUser, healthDiseaseEncyclopedia.getCreateUser());
        }
        if (StringUtil.isNotEmpty(healthDiseaseEncyclopedia.getCreateName())) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getCreateName, healthDiseaseEncyclopedia.getCreateName());
        }
        if (healthDiseaseEncyclopedia.getCreateDept() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getCreateDept, healthDiseaseEncyclopedia.getCreateDept());
        }
        if (healthDiseaseEncyclopedia.getCreateTime() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getCreateTime, healthDiseaseEncyclopedia.getCreateTime());
        }
        if (healthDiseaseEncyclopedia.getUpdateUser() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getUpdateUser, healthDiseaseEncyclopedia.getUpdateUser());
        }
        if (healthDiseaseEncyclopedia.getUpdateTime() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getUpdateTime, healthDiseaseEncyclopedia.getUpdateTime());
        }
        if (healthDiseaseEncyclopedia.getIsDeleted() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getIsDeleted, healthDiseaseEncyclopedia.getIsDeleted());
        }
        if (healthDiseaseEncyclopedia.getStatus() != null) {
            queryWrapper.eq(HealthDiseaseEncyclopedia::getStatus, healthDiseaseEncyclopedia.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthDiseaseEncyclopedia 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthDiseaseEncyclopedia insert(HealthDiseaseEncyclopedia healthDiseaseEncyclopedia) {
        healthDiseaseEncyclopedia.setId(null);
        getBaseMapper().insert(healthDiseaseEncyclopedia);
        return healthDiseaseEncyclopedia;
    }

    /**
    * 更新数据
    *
    * @param healthDiseaseEncyclopedia 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthDiseaseEncyclopedia update(HealthDiseaseEncyclopedia healthDiseaseEncyclopedia) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthDiseaseEncyclopedia> chainWrapper = new LambdaUpdateChainWrapper<HealthDiseaseEncyclopedia>(getBaseMapper());
        if (healthDiseaseEncyclopedia.getId() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getId, healthDiseaseEncyclopedia.getId());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getTenantId())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getTenantId, healthDiseaseEncyclopedia.getTenantId());
        }
        if (healthDiseaseEncyclopedia.getCorpId() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getCorpId, healthDiseaseEncyclopedia.getCorpId());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getCorpName())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getCorpName, healthDiseaseEncyclopedia.getCorpName());
        }
        if (healthDiseaseEncyclopedia.getInstitutionId() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getInstitutionId, healthDiseaseEncyclopedia.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getInstitutionName())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getInstitutionName, healthDiseaseEncyclopedia.getInstitutionName());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getTitle())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getTitle, healthDiseaseEncyclopedia.getTitle());
        }
        if (healthDiseaseEncyclopedia.getDiseaseId() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getDiseaseId, healthDiseaseEncyclopedia.getDiseaseId());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getDiseaseName())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getDiseaseName, healthDiseaseEncyclopedia.getDiseaseName());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getContentType())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getContentType, healthDiseaseEncyclopedia.getContentType());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getSource())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getSource, healthDiseaseEncyclopedia.getSource());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getContent())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getContent, healthDiseaseEncyclopedia.getContent());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getCoverImage())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getCoverImage, healthDiseaseEncyclopedia.getCoverImage());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getVideoUrl())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getVideoUrl, healthDiseaseEncyclopedia.getVideoUrl());
        }
        if (healthDiseaseEncyclopedia.getPublishTime() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getPublishTime, healthDiseaseEncyclopedia.getPublishTime());
        }
        if (healthDiseaseEncyclopedia.getViewCount() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getViewCount, healthDiseaseEncyclopedia.getViewCount());
        }
        if (healthDiseaseEncyclopedia.getCollectCount() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getCollectCount, healthDiseaseEncyclopedia.getCollectCount());
        }
        if (healthDiseaseEncyclopedia.getIsRecommend() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getIsRecommend, healthDiseaseEncyclopedia.getIsRecommend());
        }
        if (healthDiseaseEncyclopedia.getContentStatus() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getContentStatus, healthDiseaseEncyclopedia.getContentStatus());
        }
        if (healthDiseaseEncyclopedia.getAuditState() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getAuditState, healthDiseaseEncyclopedia.getAuditState());
        }
        if (healthDiseaseEncyclopedia.getAuditId() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getAuditId, healthDiseaseEncyclopedia.getAuditId());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getAuditName())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getAuditName, healthDiseaseEncyclopedia.getAuditName());
        }
        if (healthDiseaseEncyclopedia.getAuditTime() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getAuditTime, healthDiseaseEncyclopedia.getAuditTime());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getAuditMemo())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getAuditMemo, healthDiseaseEncyclopedia.getAuditMemo());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getKeywords())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getKeywords, healthDiseaseEncyclopedia.getKeywords());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getRemark())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getRemark, healthDiseaseEncyclopedia.getRemark());
        }
        if (healthDiseaseEncyclopedia.getCreateUser() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getCreateUser, healthDiseaseEncyclopedia.getCreateUser());
        }
        if (StringUtil.isNotBlank(healthDiseaseEncyclopedia.getCreateName())) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getCreateName, healthDiseaseEncyclopedia.getCreateName());
        }
        if (healthDiseaseEncyclopedia.getCreateDept() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getCreateDept, healthDiseaseEncyclopedia.getCreateDept());
        }
        if (healthDiseaseEncyclopedia.getCreateTime() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getCreateTime, healthDiseaseEncyclopedia.getCreateTime());
        }
        if (healthDiseaseEncyclopedia.getUpdateUser() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getUpdateUser, healthDiseaseEncyclopedia.getUpdateUser());
        }
        if (healthDiseaseEncyclopedia.getUpdateTime() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getUpdateTime, healthDiseaseEncyclopedia.getUpdateTime());
        }
        if (healthDiseaseEncyclopedia.getIsDeleted() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getIsDeleted, healthDiseaseEncyclopedia.getIsDeleted());
        }
        if (healthDiseaseEncyclopedia.getStatus() != null) {
            chainWrapper.set(HealthDiseaseEncyclopedia::getStatus, healthDiseaseEncyclopedia.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthDiseaseEncyclopedia::getId, healthDiseaseEncyclopedia.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthDiseaseEncyclopedia.getId());
        } else {
            return healthDiseaseEncyclopedia;
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
    public boolean saveHealthDiseaseEncyclopediaBatch(List<HealthDiseaseEncyclopedia> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthDiseaseEncyclopedia healthDiseaseEncyclopedia : insertList) {
            //使用默认的雪花算法生成
            healthDiseaseEncyclopedia.setId(null);
            //healthDiseaseEncyclopedia.setCreatedDt(currentDte);
            //healthDiseaseEncyclopedia.setUpdatedDt(currentDte);
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
    public Integer deleteHealthDiseaseEncyclopediaBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthDiseaseEncyclopedia> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


