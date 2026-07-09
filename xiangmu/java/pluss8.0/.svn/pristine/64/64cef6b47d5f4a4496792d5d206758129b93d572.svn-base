package cn.pluss.platform.service.insOfficeKnowledgeInfo.impl;

import cn.pluss.platform.mapper.InsOfficeKnowledgeInfoMapper;
import cn.pluss.platform.model.entity.InsOfficeKnowledgeInfo;
import cn.pluss.platform.service.insOfficeKnowledgeInfo.InsOfficeKnowledgeInfoService;
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
@Service("insOfficeKnowledgeInfoService")
public class InsOfficeKnowledgeInfoServiceImpl extends ServiceImpl< InsOfficeKnowledgeInfoMapper, InsOfficeKnowledgeInfo> implements InsOfficeKnowledgeInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsOfficeKnowledgeInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsOfficeKnowledgeInfo> queryPage(Map map) {
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
    public InsOfficeKnowledgeInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficeKnowledgeInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsOfficeKnowledgeInfo queryOne(InsOfficeKnowledgeInfo insOfficeKnowledgeInfo){
        LambdaQueryWrapper<InsOfficeKnowledgeInfo> queryWrapper = getQueryWrapper(insOfficeKnowledgeInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insOfficeKnowledgeInfo
    * @return
    */
    @Override
    public List<InsOfficeKnowledgeInfo> queryList(InsOfficeKnowledgeInfo insOfficeKnowledgeInfo) {
        LambdaQueryWrapper<InsOfficeKnowledgeInfo> queryWrapper = getQueryWrapper(insOfficeKnowledgeInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insOfficeKnowledgeInfo
    * @return
    */
    public static LambdaQueryWrapper<InsOfficeKnowledgeInfo> getQueryWrapper(InsOfficeKnowledgeInfo insOfficeKnowledgeInfo){
        LambdaQueryWrapper<InsOfficeKnowledgeInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insOfficeKnowledgeInfo.getId() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getId, insOfficeKnowledgeInfo.getId());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getTenantId())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getTenantId, insOfficeKnowledgeInfo.getTenantId());
        }
        if (insOfficeKnowledgeInfo.getCorpId() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getCorpId, insOfficeKnowledgeInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getCorpName())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getCorpName, insOfficeKnowledgeInfo.getCorpName());
        }
        if (insOfficeKnowledgeInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getInstitutionId, insOfficeKnowledgeInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getInstitutionName())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getInstitutionName, insOfficeKnowledgeInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getNewsTitle())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getNewsTitle, insOfficeKnowledgeInfo.getNewsTitle());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getNewsSummary())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getNewsSummary, insOfficeKnowledgeInfo.getNewsSummary());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getNewsImg())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getNewsImg, insOfficeKnowledgeInfo.getNewsImg());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getContent())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getContent, insOfficeKnowledgeInfo.getContent());
        }
        if (insOfficeKnowledgeInfo.getKnowType() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getKnowType, insOfficeKnowledgeInfo.getKnowType());
        }
        if (insOfficeKnowledgeInfo.getIsTop() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getIsTop, insOfficeKnowledgeInfo.getIsTop());
        }
        if (insOfficeKnowledgeInfo.getIsHot() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getIsHot, insOfficeKnowledgeInfo.getIsHot());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getNewsSource())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getNewsSource, insOfficeKnowledgeInfo.getNewsSource());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getAttachment())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getAttachment, insOfficeKnowledgeInfo.getAttachment());
        }
        if (insOfficeKnowledgeInfo.getClickNumber() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getClickNumber, insOfficeKnowledgeInfo.getClickNumber());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getRemark())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getRemark, insOfficeKnowledgeInfo.getRemark());
        }
        if (insOfficeKnowledgeInfo.getCreateUser() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getCreateUser, insOfficeKnowledgeInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insOfficeKnowledgeInfo.getCreateName())) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getCreateName, insOfficeKnowledgeInfo.getCreateName());
        }
        if (insOfficeKnowledgeInfo.getCreateDept() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getCreateDept, insOfficeKnowledgeInfo.getCreateDept());
        }
        if (insOfficeKnowledgeInfo.getCreateTime() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getCreateTime, insOfficeKnowledgeInfo.getCreateTime());
        }
        if (insOfficeKnowledgeInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getUpdateUser, insOfficeKnowledgeInfo.getUpdateUser());
        }
        if (insOfficeKnowledgeInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getUpdateTime, insOfficeKnowledgeInfo.getUpdateTime());
        }
        if (insOfficeKnowledgeInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getIsDeleted, insOfficeKnowledgeInfo.getIsDeleted());
        }
        if (insOfficeKnowledgeInfo.getStatus() != null) {
            queryWrapper.eq(InsOfficeKnowledgeInfo::getStatus, insOfficeKnowledgeInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insOfficeKnowledgeInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficeKnowledgeInfo insert(InsOfficeKnowledgeInfo insOfficeKnowledgeInfo) {
        insOfficeKnowledgeInfo.setId(null);
        getBaseMapper().insert(insOfficeKnowledgeInfo);
        return insOfficeKnowledgeInfo;
    }

    /**
    * 更新数据
    *
    * @param insOfficeKnowledgeInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficeKnowledgeInfo update(InsOfficeKnowledgeInfo insOfficeKnowledgeInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsOfficeKnowledgeInfo> chainWrapper = new LambdaUpdateChainWrapper<InsOfficeKnowledgeInfo>(getBaseMapper());
        if (insOfficeKnowledgeInfo.getId() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getId, insOfficeKnowledgeInfo.getId());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getTenantId())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getTenantId, insOfficeKnowledgeInfo.getTenantId());
        }
        if (insOfficeKnowledgeInfo.getCorpId() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getCorpId, insOfficeKnowledgeInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getCorpName())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getCorpName, insOfficeKnowledgeInfo.getCorpName());
        }
        if (insOfficeKnowledgeInfo.getInstitutionId() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getInstitutionId, insOfficeKnowledgeInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getInstitutionName())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getInstitutionName, insOfficeKnowledgeInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getNewsTitle())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getNewsTitle, insOfficeKnowledgeInfo.getNewsTitle());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getNewsSummary())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getNewsSummary, insOfficeKnowledgeInfo.getNewsSummary());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getNewsImg())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getNewsImg, insOfficeKnowledgeInfo.getNewsImg());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getContent())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getContent, insOfficeKnowledgeInfo.getContent());
        }
        if (insOfficeKnowledgeInfo.getKnowType() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getKnowType, insOfficeKnowledgeInfo.getKnowType());
        }
        if (insOfficeKnowledgeInfo.getIsTop() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getIsTop, insOfficeKnowledgeInfo.getIsTop());
        }
        if (insOfficeKnowledgeInfo.getIsHot() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getIsHot, insOfficeKnowledgeInfo.getIsHot());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getNewsSource())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getNewsSource, insOfficeKnowledgeInfo.getNewsSource());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getAttachment())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getAttachment, insOfficeKnowledgeInfo.getAttachment());
        }
        if (insOfficeKnowledgeInfo.getClickNumber() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getClickNumber, insOfficeKnowledgeInfo.getClickNumber());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getRemark())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getRemark, insOfficeKnowledgeInfo.getRemark());
        }
        if (insOfficeKnowledgeInfo.getCreateUser() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getCreateUser, insOfficeKnowledgeInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insOfficeKnowledgeInfo.getCreateName())) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getCreateName, insOfficeKnowledgeInfo.getCreateName());
        }
        if (insOfficeKnowledgeInfo.getCreateDept() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getCreateDept, insOfficeKnowledgeInfo.getCreateDept());
        }
        if (insOfficeKnowledgeInfo.getCreateTime() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getCreateTime, insOfficeKnowledgeInfo.getCreateTime());
        }
        if (insOfficeKnowledgeInfo.getUpdateUser() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getUpdateUser, insOfficeKnowledgeInfo.getUpdateUser());
        }
        if (insOfficeKnowledgeInfo.getUpdateTime() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getUpdateTime, insOfficeKnowledgeInfo.getUpdateTime());
        }
        if (insOfficeKnowledgeInfo.getIsDeleted() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getIsDeleted, insOfficeKnowledgeInfo.getIsDeleted());
        }
        if (insOfficeKnowledgeInfo.getStatus() != null) {
            chainWrapper.set(InsOfficeKnowledgeInfo::getStatus, insOfficeKnowledgeInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsOfficeKnowledgeInfo::getId, insOfficeKnowledgeInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insOfficeKnowledgeInfo.getId());
        } else {
            return insOfficeKnowledgeInfo;
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
    public boolean saveInsOfficeKnowledgeInfoBatch(List<InsOfficeKnowledgeInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsOfficeKnowledgeInfo insOfficeKnowledgeInfo : insertList) {
            //使用默认的雪花算法生成
            insOfficeKnowledgeInfo.setId(null);
            //insOfficeKnowledgeInfo.setCreatedDt(currentDte);
            //insOfficeKnowledgeInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsOfficeKnowledgeInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsOfficeKnowledgeInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


