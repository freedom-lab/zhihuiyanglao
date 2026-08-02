package cn.pluss.platform.service.insOfficeOnlineClass.impl;

import cn.pluss.platform.mapper.InsOfficeOnlineClassMapper;
import cn.pluss.platform.model.entity.InsOfficeOnlineClass;
import cn.pluss.platform.service.insOfficeOnlineClass.InsOfficeOnlineClassService;
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
@Service("insOfficeOnlineClassService")
public class InsOfficeOnlineClassServiceImpl extends ServiceImpl< InsOfficeOnlineClassMapper, InsOfficeOnlineClass> implements InsOfficeOnlineClassService {
    private static final Logger logger = LoggerFactory.getLogger(InsOfficeOnlineClassServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsOfficeOnlineClass> queryPage(Map map) {
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
    public InsOfficeOnlineClass queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficeOnlineClass 实例对象
    * @return 实例对象
    */
    @Override
    public InsOfficeOnlineClass queryOne(InsOfficeOnlineClass insOfficeOnlineClass){
        LambdaQueryWrapper<InsOfficeOnlineClass> queryWrapper = getQueryWrapper(insOfficeOnlineClass);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insOfficeOnlineClass
    * @return
    */
    @Override
    public List<InsOfficeOnlineClass> queryList(InsOfficeOnlineClass insOfficeOnlineClass) {
        LambdaQueryWrapper<InsOfficeOnlineClass> queryWrapper = getQueryWrapper(insOfficeOnlineClass);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insOfficeOnlineClass
    * @return
    */
    public static LambdaQueryWrapper<InsOfficeOnlineClass> getQueryWrapper(InsOfficeOnlineClass insOfficeOnlineClass){
        LambdaQueryWrapper<InsOfficeOnlineClass> queryWrapper = new LambdaQueryWrapper<>();
        if (insOfficeOnlineClass.getId() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getId, insOfficeOnlineClass.getId());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getTenantId())) {
            queryWrapper.eq(InsOfficeOnlineClass::getTenantId, insOfficeOnlineClass.getTenantId());
        }
        if (insOfficeOnlineClass.getCorpId() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getCorpId, insOfficeOnlineClass.getCorpId());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getCorpName())) {
            queryWrapper.eq(InsOfficeOnlineClass::getCorpName, insOfficeOnlineClass.getCorpName());
        }
        if (insOfficeOnlineClass.getInstitutionId() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getInstitutionId, insOfficeOnlineClass.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getInstitutionName())) {
            queryWrapper.eq(InsOfficeOnlineClass::getInstitutionName, insOfficeOnlineClass.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getNewsTitle())) {
            queryWrapper.eq(InsOfficeOnlineClass::getNewsTitle, insOfficeOnlineClass.getNewsTitle());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getNewsSummary())) {
            queryWrapper.eq(InsOfficeOnlineClass::getNewsSummary, insOfficeOnlineClass.getNewsSummary());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getNewsImg())) {
            queryWrapper.eq(InsOfficeOnlineClass::getNewsImg, insOfficeOnlineClass.getNewsImg());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getVideoUrl())) {
            queryWrapper.eq(InsOfficeOnlineClass::getVideoUrl, insOfficeOnlineClass.getVideoUrl());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getContent())) {
            queryWrapper.eq(InsOfficeOnlineClass::getContent, insOfficeOnlineClass.getContent());
        }
        if (insOfficeOnlineClass.getNewsType() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getNewsType, insOfficeOnlineClass.getNewsType());
        }
        if (insOfficeOnlineClass.getSubType() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getSubType, insOfficeOnlineClass.getSubType());
        }
        if (insOfficeOnlineClass.getClassGrade() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getClassGrade, insOfficeOnlineClass.getClassGrade());
        }
        if (insOfficeOnlineClass.getIsTop() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getIsTop, insOfficeOnlineClass.getIsTop());
        }
        if (insOfficeOnlineClass.getIsHot() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getIsHot, insOfficeOnlineClass.getIsHot());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getNewsSource())) {
            queryWrapper.eq(InsOfficeOnlineClass::getNewsSource, insOfficeOnlineClass.getNewsSource());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getAttachment())) {
            queryWrapper.eq(InsOfficeOnlineClass::getAttachment, insOfficeOnlineClass.getAttachment());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getPublishNumber())) {
            queryWrapper.eq(InsOfficeOnlineClass::getPublishNumber, insOfficeOnlineClass.getPublishNumber());
        }
        if (insOfficeOnlineClass.getClickNumber() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getClickNumber, insOfficeOnlineClass.getClickNumber());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getRemark())) {
            queryWrapper.eq(InsOfficeOnlineClass::getRemark, insOfficeOnlineClass.getRemark());
        }
        if (insOfficeOnlineClass.getCreateUser() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getCreateUser, insOfficeOnlineClass.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insOfficeOnlineClass.getCreateName())) {
            queryWrapper.eq(InsOfficeOnlineClass::getCreateName, insOfficeOnlineClass.getCreateName());
        }
        if (insOfficeOnlineClass.getCreateDept() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getCreateDept, insOfficeOnlineClass.getCreateDept());
        }
        if (insOfficeOnlineClass.getCreateTime() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getCreateTime, insOfficeOnlineClass.getCreateTime());
        }
        if (insOfficeOnlineClass.getUpdateUser() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getUpdateUser, insOfficeOnlineClass.getUpdateUser());
        }
        if (insOfficeOnlineClass.getUpdateTime() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getUpdateTime, insOfficeOnlineClass.getUpdateTime());
        }
        if (insOfficeOnlineClass.getIsDeleted() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getIsDeleted, insOfficeOnlineClass.getIsDeleted());
        }
        if (insOfficeOnlineClass.getStatus() != null) {
            queryWrapper.eq(InsOfficeOnlineClass::getStatus, insOfficeOnlineClass.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insOfficeOnlineClass 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficeOnlineClass insert(InsOfficeOnlineClass insOfficeOnlineClass) {
        insOfficeOnlineClass.setId(null);
        getBaseMapper().insert(insOfficeOnlineClass);
        return insOfficeOnlineClass;
    }

    /**
    * 更新数据
    *
    * @param insOfficeOnlineClass 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficeOnlineClass update(InsOfficeOnlineClass insOfficeOnlineClass) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsOfficeOnlineClass> chainWrapper = new LambdaUpdateChainWrapper<InsOfficeOnlineClass>(getBaseMapper());
        if (insOfficeOnlineClass.getId() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getId, insOfficeOnlineClass.getId());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getTenantId())) {
            chainWrapper.set(InsOfficeOnlineClass::getTenantId, insOfficeOnlineClass.getTenantId());
        }
        if (insOfficeOnlineClass.getCorpId() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getCorpId, insOfficeOnlineClass.getCorpId());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getCorpName())) {
            chainWrapper.set(InsOfficeOnlineClass::getCorpName, insOfficeOnlineClass.getCorpName());
        }
        if (insOfficeOnlineClass.getInstitutionId() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getInstitutionId, insOfficeOnlineClass.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getInstitutionName())) {
            chainWrapper.set(InsOfficeOnlineClass::getInstitutionName, insOfficeOnlineClass.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getNewsTitle())) {
            chainWrapper.set(InsOfficeOnlineClass::getNewsTitle, insOfficeOnlineClass.getNewsTitle());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getNewsSummary())) {
            chainWrapper.set(InsOfficeOnlineClass::getNewsSummary, insOfficeOnlineClass.getNewsSummary());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getNewsImg())) {
            chainWrapper.set(InsOfficeOnlineClass::getNewsImg, insOfficeOnlineClass.getNewsImg());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getVideoUrl())) {
            chainWrapper.set(InsOfficeOnlineClass::getVideoUrl, insOfficeOnlineClass.getVideoUrl());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getContent())) {
            chainWrapper.set(InsOfficeOnlineClass::getContent, insOfficeOnlineClass.getContent());
        }
        if (insOfficeOnlineClass.getNewsType() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getNewsType, insOfficeOnlineClass.getNewsType());
        }
        if (insOfficeOnlineClass.getSubType() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getSubType, insOfficeOnlineClass.getSubType());
        }
        if (insOfficeOnlineClass.getClassGrade() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getClassGrade, insOfficeOnlineClass.getClassGrade());
        }
        if (insOfficeOnlineClass.getIsTop() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getIsTop, insOfficeOnlineClass.getIsTop());
        }
        if (insOfficeOnlineClass.getIsHot() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getIsHot, insOfficeOnlineClass.getIsHot());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getNewsSource())) {
            chainWrapper.set(InsOfficeOnlineClass::getNewsSource, insOfficeOnlineClass.getNewsSource());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getAttachment())) {
            chainWrapper.set(InsOfficeOnlineClass::getAttachment, insOfficeOnlineClass.getAttachment());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getPublishNumber())) {
            chainWrapper.set(InsOfficeOnlineClass::getPublishNumber, insOfficeOnlineClass.getPublishNumber());
        }
        if (insOfficeOnlineClass.getClickNumber() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getClickNumber, insOfficeOnlineClass.getClickNumber());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getRemark())) {
            chainWrapper.set(InsOfficeOnlineClass::getRemark, insOfficeOnlineClass.getRemark());
        }
        if (insOfficeOnlineClass.getCreateUser() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getCreateUser, insOfficeOnlineClass.getCreateUser());
        }
        if (StringUtil.isNotBlank(insOfficeOnlineClass.getCreateName())) {
            chainWrapper.set(InsOfficeOnlineClass::getCreateName, insOfficeOnlineClass.getCreateName());
        }
        if (insOfficeOnlineClass.getCreateDept() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getCreateDept, insOfficeOnlineClass.getCreateDept());
        }
        if (insOfficeOnlineClass.getCreateTime() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getCreateTime, insOfficeOnlineClass.getCreateTime());
        }
        if (insOfficeOnlineClass.getUpdateUser() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getUpdateUser, insOfficeOnlineClass.getUpdateUser());
        }
        if (insOfficeOnlineClass.getUpdateTime() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getUpdateTime, insOfficeOnlineClass.getUpdateTime());
        }
        if (insOfficeOnlineClass.getIsDeleted() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getIsDeleted, insOfficeOnlineClass.getIsDeleted());
        }
        if (insOfficeOnlineClass.getStatus() != null) {
            chainWrapper.set(InsOfficeOnlineClass::getStatus, insOfficeOnlineClass.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsOfficeOnlineClass::getId, insOfficeOnlineClass.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insOfficeOnlineClass.getId());
        } else {
            return insOfficeOnlineClass;
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
    public boolean saveInsOfficeOnlineClassBatch(List<InsOfficeOnlineClass> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsOfficeOnlineClass insOfficeOnlineClass : insertList) {
            //使用默认的雪花算法生成
            insOfficeOnlineClass.setId(null);
            //insOfficeOnlineClass.setCreatedDt(currentDte);
            //insOfficeOnlineClass.setUpdatedDt(currentDte);
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
    public Integer deleteInsOfficeOnlineClassBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsOfficeOnlineClass> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


