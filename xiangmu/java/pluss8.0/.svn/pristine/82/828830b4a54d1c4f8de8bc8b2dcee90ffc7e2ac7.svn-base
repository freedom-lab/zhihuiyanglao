package cn.pluss.platform.service.insOfficePolicyInfo.impl;

import cn.pluss.platform.mapper.InsOfficePolicyInfoMapper;
import cn.pluss.platform.model.entity.InsOfficePolicyInfo;
import cn.pluss.platform.service.insOfficePolicyInfo.InsOfficePolicyInfoService;
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
@Service("insOfficePolicyInfoService")
public class InsOfficePolicyInfoServiceImpl extends ServiceImpl< InsOfficePolicyInfoMapper, InsOfficePolicyInfo> implements InsOfficePolicyInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsOfficePolicyInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsOfficePolicyInfo> queryPage(Map map) {
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
    public InsOfficePolicyInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficePolicyInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsOfficePolicyInfo queryOne(InsOfficePolicyInfo insOfficePolicyInfo){
        LambdaQueryWrapper<InsOfficePolicyInfo> queryWrapper = getQueryWrapper(insOfficePolicyInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insOfficePolicyInfo
    * @return
    */
    @Override
    public List<InsOfficePolicyInfo> queryList(InsOfficePolicyInfo insOfficePolicyInfo) {
        LambdaQueryWrapper<InsOfficePolicyInfo> queryWrapper = getQueryWrapper(insOfficePolicyInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insOfficePolicyInfo
    * @return
    */
    public static LambdaQueryWrapper<InsOfficePolicyInfo> getQueryWrapper(InsOfficePolicyInfo insOfficePolicyInfo){
        LambdaQueryWrapper<InsOfficePolicyInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insOfficePolicyInfo.getId() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getId, insOfficePolicyInfo.getId());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getTenantId())) {
            queryWrapper.eq(InsOfficePolicyInfo::getTenantId, insOfficePolicyInfo.getTenantId());
        }
        if (insOfficePolicyInfo.getCorpId() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getCorpId, insOfficePolicyInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getCorpName())) {
            queryWrapper.eq(InsOfficePolicyInfo::getCorpName, insOfficePolicyInfo.getCorpName());
        }
        if (insOfficePolicyInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getInstitutionId, insOfficePolicyInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getInstitutionName())) {
            queryWrapper.eq(InsOfficePolicyInfo::getInstitutionName, insOfficePolicyInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getNewsTitle())) {
            queryWrapper.eq(InsOfficePolicyInfo::getNewsTitle, insOfficePolicyInfo.getNewsTitle());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getNewsSummary())) {
            queryWrapper.eq(InsOfficePolicyInfo::getNewsSummary, insOfficePolicyInfo.getNewsSummary());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getNewsImg())) {
            queryWrapper.eq(InsOfficePolicyInfo::getNewsImg, insOfficePolicyInfo.getNewsImg());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getContent())) {
            queryWrapper.eq(InsOfficePolicyInfo::getContent, insOfficePolicyInfo.getContent());
        }
        if (insOfficePolicyInfo.getNewsType() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getNewsType, insOfficePolicyInfo.getNewsType());
        }
        if (insOfficePolicyInfo.getSubType() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getSubType, insOfficePolicyInfo.getSubType());
        }
        if (insOfficePolicyInfo.getIsTop() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getIsTop, insOfficePolicyInfo.getIsTop());
        }
        if (insOfficePolicyInfo.getIsHot() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getIsHot, insOfficePolicyInfo.getIsHot());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getNewsSource())) {
            queryWrapper.eq(InsOfficePolicyInfo::getNewsSource, insOfficePolicyInfo.getNewsSource());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getAttachment())) {
            queryWrapper.eq(InsOfficePolicyInfo::getAttachment, insOfficePolicyInfo.getAttachment());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getPublishNumber())) {
            queryWrapper.eq(InsOfficePolicyInfo::getPublishNumber, insOfficePolicyInfo.getPublishNumber());
        }
        if (insOfficePolicyInfo.getAgeStart() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getAgeStart, insOfficePolicyInfo.getAgeStart());
        }
        if (insOfficePolicyInfo.getAgeEnd() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getAgeEnd, insOfficePolicyInfo.getAgeEnd());
        }
        if (insOfficePolicyInfo.getHealthStatus() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getHealthStatus, insOfficePolicyInfo.getHealthStatus());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getElderType())) {
            queryWrapper.eq(InsOfficePolicyInfo::getElderType, insOfficePolicyInfo.getElderType());
        }
        if (insOfficePolicyInfo.getClickNumber() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getClickNumber, insOfficePolicyInfo.getClickNumber());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getRemark())) {
            queryWrapper.eq(InsOfficePolicyInfo::getRemark, insOfficePolicyInfo.getRemark());
        }
        if (insOfficePolicyInfo.getCreateUser() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getCreateUser, insOfficePolicyInfo.getCreateUser());
        }
        if (insOfficePolicyInfo.getCreateDept() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getCreateDept, insOfficePolicyInfo.getCreateDept());
        }
        if (insOfficePolicyInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getUpdateUser, insOfficePolicyInfo.getUpdateUser());
        }
        if (insOfficePolicyInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getUpdateTime, insOfficePolicyInfo.getUpdateTime());
        }
        if (insOfficePolicyInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getIsDeleted, insOfficePolicyInfo.getIsDeleted());
        }
        if (insOfficePolicyInfo.getStatus() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getStatus, insOfficePolicyInfo.getStatus());
        }
        if (insOfficePolicyInfo.getCreateTime() != null) {
            queryWrapper.eq(InsOfficePolicyInfo::getCreateTime, insOfficePolicyInfo.getCreateTime());
        }
        if (StringUtil.isNotEmpty(insOfficePolicyInfo.getCreateName())) {
            queryWrapper.eq(InsOfficePolicyInfo::getCreateName, insOfficePolicyInfo.getCreateName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insOfficePolicyInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficePolicyInfo insert(InsOfficePolicyInfo insOfficePolicyInfo) {
        insOfficePolicyInfo.setId(null);
        getBaseMapper().insert(insOfficePolicyInfo);
        return insOfficePolicyInfo;
    }

    /**
    * 更新数据
    *
    * @param insOfficePolicyInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficePolicyInfo update(InsOfficePolicyInfo insOfficePolicyInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsOfficePolicyInfo> chainWrapper = new LambdaUpdateChainWrapper<InsOfficePolicyInfo>(getBaseMapper());
        if (insOfficePolicyInfo.getId() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getId, insOfficePolicyInfo.getId());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getTenantId())) {
            chainWrapper.set(InsOfficePolicyInfo::getTenantId, insOfficePolicyInfo.getTenantId());
        }
        if (insOfficePolicyInfo.getCorpId() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getCorpId, insOfficePolicyInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getCorpName())) {
            chainWrapper.set(InsOfficePolicyInfo::getCorpName, insOfficePolicyInfo.getCorpName());
        }
        if (insOfficePolicyInfo.getInstitutionId() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getInstitutionId, insOfficePolicyInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getInstitutionName())) {
            chainWrapper.set(InsOfficePolicyInfo::getInstitutionName, insOfficePolicyInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getNewsTitle())) {
            chainWrapper.set(InsOfficePolicyInfo::getNewsTitle, insOfficePolicyInfo.getNewsTitle());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getNewsSummary())) {
            chainWrapper.set(InsOfficePolicyInfo::getNewsSummary, insOfficePolicyInfo.getNewsSummary());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getNewsImg())) {
            chainWrapper.set(InsOfficePolicyInfo::getNewsImg, insOfficePolicyInfo.getNewsImg());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getContent())) {
            chainWrapper.set(InsOfficePolicyInfo::getContent, insOfficePolicyInfo.getContent());
        }
        if (insOfficePolicyInfo.getNewsType() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getNewsType, insOfficePolicyInfo.getNewsType());
        }
        if (insOfficePolicyInfo.getSubType() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getSubType, insOfficePolicyInfo.getSubType());
        }
        if (insOfficePolicyInfo.getIsTop() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getIsTop, insOfficePolicyInfo.getIsTop());
        }
        if (insOfficePolicyInfo.getIsHot() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getIsHot, insOfficePolicyInfo.getIsHot());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getNewsSource())) {
            chainWrapper.set(InsOfficePolicyInfo::getNewsSource, insOfficePolicyInfo.getNewsSource());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getAttachment())) {
            chainWrapper.set(InsOfficePolicyInfo::getAttachment, insOfficePolicyInfo.getAttachment());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getPublishNumber())) {
            chainWrapper.set(InsOfficePolicyInfo::getPublishNumber, insOfficePolicyInfo.getPublishNumber());
        }
        if (insOfficePolicyInfo.getAgeStart() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getAgeStart, insOfficePolicyInfo.getAgeStart());
        }
        if (insOfficePolicyInfo.getAgeEnd() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getAgeEnd, insOfficePolicyInfo.getAgeEnd());
        }
        if (insOfficePolicyInfo.getHealthStatus() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getHealthStatus, insOfficePolicyInfo.getHealthStatus());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getElderType())) {
            chainWrapper.set(InsOfficePolicyInfo::getElderType, insOfficePolicyInfo.getElderType());
        }
        if (insOfficePolicyInfo.getClickNumber() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getClickNumber, insOfficePolicyInfo.getClickNumber());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getRemark())) {
            chainWrapper.set(InsOfficePolicyInfo::getRemark, insOfficePolicyInfo.getRemark());
        }
        if (insOfficePolicyInfo.getCreateUser() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getCreateUser, insOfficePolicyInfo.getCreateUser());
        }
        if (insOfficePolicyInfo.getCreateDept() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getCreateDept, insOfficePolicyInfo.getCreateDept());
        }
        if (insOfficePolicyInfo.getUpdateUser() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getUpdateUser, insOfficePolicyInfo.getUpdateUser());
        }
        if (insOfficePolicyInfo.getUpdateTime() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getUpdateTime, insOfficePolicyInfo.getUpdateTime());
        }
        if (insOfficePolicyInfo.getIsDeleted() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getIsDeleted, insOfficePolicyInfo.getIsDeleted());
        }
        if (insOfficePolicyInfo.getStatus() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getStatus, insOfficePolicyInfo.getStatus());
        }
        if (insOfficePolicyInfo.getCreateTime() != null) {
            chainWrapper.set(InsOfficePolicyInfo::getCreateTime, insOfficePolicyInfo.getCreateTime());
        }
        if (StringUtil.isNotBlank(insOfficePolicyInfo.getCreateName())) {
            chainWrapper.set(InsOfficePolicyInfo::getCreateName, insOfficePolicyInfo.getCreateName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsOfficePolicyInfo::getId, insOfficePolicyInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insOfficePolicyInfo.getId());
        } else {
            return insOfficePolicyInfo;
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
    public boolean saveInsOfficePolicyInfoBatch(List<InsOfficePolicyInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsOfficePolicyInfo insOfficePolicyInfo : insertList) {
            //使用默认的雪花算法生成
            insOfficePolicyInfo.setId(null);
            //insOfficePolicyInfo.setCreatedDt(currentDte);
            //insOfficePolicyInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsOfficePolicyInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsOfficePolicyInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


