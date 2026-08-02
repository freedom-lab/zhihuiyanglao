package cn.pluss.platform.service.insOfficeNewsInfo.impl;

import cn.pluss.platform.mapper.InsOfficeNewsInfoMapper;
import cn.pluss.platform.model.entity.InsOfficeNewsInfo;
import cn.pluss.platform.service.insOfficeNewsInfo.InsOfficeNewsInfoService;
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
@Service("insOfficeNewsInfoService")
public class InsOfficeNewsInfoServiceImpl extends ServiceImpl< InsOfficeNewsInfoMapper, InsOfficeNewsInfo> implements InsOfficeNewsInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsOfficeNewsInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsOfficeNewsInfo> queryPage(Map map) {
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
    public InsOfficeNewsInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficeNewsInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsOfficeNewsInfo queryOne(InsOfficeNewsInfo insOfficeNewsInfo){
        LambdaQueryWrapper<InsOfficeNewsInfo> queryWrapper = getQueryWrapper(insOfficeNewsInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insOfficeNewsInfo
    * @return
    */
    @Override
    public List<InsOfficeNewsInfo> queryList(InsOfficeNewsInfo insOfficeNewsInfo) {
        LambdaQueryWrapper<InsOfficeNewsInfo> queryWrapper = getQueryWrapper(insOfficeNewsInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insOfficeNewsInfo
    * @return
    */
    public static LambdaQueryWrapper<InsOfficeNewsInfo> getQueryWrapper(InsOfficeNewsInfo insOfficeNewsInfo){
        LambdaQueryWrapper<InsOfficeNewsInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insOfficeNewsInfo.getId() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getId, insOfficeNewsInfo.getId());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getTenantId())) {
            queryWrapper.eq(InsOfficeNewsInfo::getTenantId, insOfficeNewsInfo.getTenantId());
        }
        if (insOfficeNewsInfo.getCorpId() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getCorpId, insOfficeNewsInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getCorpName())) {
            queryWrapper.eq(InsOfficeNewsInfo::getCorpName, insOfficeNewsInfo.getCorpName());
        }
        if (insOfficeNewsInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getInstitutionId, insOfficeNewsInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getInstitutionName())) {
            queryWrapper.eq(InsOfficeNewsInfo::getInstitutionName, insOfficeNewsInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getNewsTitle())) {
            queryWrapper.eq(InsOfficeNewsInfo::getNewsTitle, insOfficeNewsInfo.getNewsTitle());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getNewsSummary())) {
            queryWrapper.eq(InsOfficeNewsInfo::getNewsSummary, insOfficeNewsInfo.getNewsSummary());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getNewsImg())) {
            queryWrapper.eq(InsOfficeNewsInfo::getNewsImg, insOfficeNewsInfo.getNewsImg());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getContent())) {
            queryWrapper.eq(InsOfficeNewsInfo::getContent, insOfficeNewsInfo.getContent());
        }
        if (insOfficeNewsInfo.getNewsType() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getNewsType, insOfficeNewsInfo.getNewsType());
        }
        if (insOfficeNewsInfo.getSubType() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getSubType, insOfficeNewsInfo.getSubType());
        }
        if (insOfficeNewsInfo.getIsTop() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getIsTop, insOfficeNewsInfo.getIsTop());
        }
        if (insOfficeNewsInfo.getIsHot() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getIsHot, insOfficeNewsInfo.getIsHot());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getNewsSource())) {
            queryWrapper.eq(InsOfficeNewsInfo::getNewsSource, insOfficeNewsInfo.getNewsSource());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getAttachment())) {
            queryWrapper.eq(InsOfficeNewsInfo::getAttachment, insOfficeNewsInfo.getAttachment());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getPublishNumber())) {
            queryWrapper.eq(InsOfficeNewsInfo::getPublishNumber, insOfficeNewsInfo.getPublishNumber());
        }
        if (insOfficeNewsInfo.getClickNumber() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getClickNumber, insOfficeNewsInfo.getClickNumber());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getRemark())) {
            queryWrapper.eq(InsOfficeNewsInfo::getRemark, insOfficeNewsInfo.getRemark());
        }
        if (insOfficeNewsInfo.getCreateUser() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getCreateUser, insOfficeNewsInfo.getCreateUser());
        }
        if (insOfficeNewsInfo.getCreateDept() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getCreateDept, insOfficeNewsInfo.getCreateDept());
        }
        if (insOfficeNewsInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getUpdateUser, insOfficeNewsInfo.getUpdateUser());
        }
        if (insOfficeNewsInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getUpdateTime, insOfficeNewsInfo.getUpdateTime());
        }
        if (insOfficeNewsInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getIsDeleted, insOfficeNewsInfo.getIsDeleted());
        }
        if (insOfficeNewsInfo.getStatus() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getStatus, insOfficeNewsInfo.getStatus());
        }
        if (insOfficeNewsInfo.getCreateTime() != null) {
            queryWrapper.eq(InsOfficeNewsInfo::getCreateTime, insOfficeNewsInfo.getCreateTime());
        }
        if (StringUtil.isNotEmpty(insOfficeNewsInfo.getCreateName())) {
            queryWrapper.eq(InsOfficeNewsInfo::getCreateName, insOfficeNewsInfo.getCreateName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insOfficeNewsInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficeNewsInfo insert(InsOfficeNewsInfo insOfficeNewsInfo) {
        insOfficeNewsInfo.setId(null);
        getBaseMapper().insert(insOfficeNewsInfo);
        return insOfficeNewsInfo;
    }

    /**
    * 更新数据
    *
    * @param insOfficeNewsInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficeNewsInfo update(InsOfficeNewsInfo insOfficeNewsInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsOfficeNewsInfo> chainWrapper = new LambdaUpdateChainWrapper<InsOfficeNewsInfo>(getBaseMapper());
        if (insOfficeNewsInfo.getId() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getId, insOfficeNewsInfo.getId());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getTenantId())) {
            chainWrapper.set(InsOfficeNewsInfo::getTenantId, insOfficeNewsInfo.getTenantId());
        }
        if (insOfficeNewsInfo.getCorpId() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getCorpId, insOfficeNewsInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getCorpName())) {
            chainWrapper.set(InsOfficeNewsInfo::getCorpName, insOfficeNewsInfo.getCorpName());
        }
        if (insOfficeNewsInfo.getInstitutionId() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getInstitutionId, insOfficeNewsInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getInstitutionName())) {
            chainWrapper.set(InsOfficeNewsInfo::getInstitutionName, insOfficeNewsInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getNewsTitle())) {
            chainWrapper.set(InsOfficeNewsInfo::getNewsTitle, insOfficeNewsInfo.getNewsTitle());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getNewsSummary())) {
            chainWrapper.set(InsOfficeNewsInfo::getNewsSummary, insOfficeNewsInfo.getNewsSummary());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getNewsImg())) {
            chainWrapper.set(InsOfficeNewsInfo::getNewsImg, insOfficeNewsInfo.getNewsImg());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getContent())) {
            chainWrapper.set(InsOfficeNewsInfo::getContent, insOfficeNewsInfo.getContent());
        }
        if (insOfficeNewsInfo.getNewsType() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getNewsType, insOfficeNewsInfo.getNewsType());
        }
        if (insOfficeNewsInfo.getSubType() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getSubType, insOfficeNewsInfo.getSubType());
        }
        if (insOfficeNewsInfo.getIsTop() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getIsTop, insOfficeNewsInfo.getIsTop());
        }
        if (insOfficeNewsInfo.getIsHot() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getIsHot, insOfficeNewsInfo.getIsHot());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getNewsSource())) {
            chainWrapper.set(InsOfficeNewsInfo::getNewsSource, insOfficeNewsInfo.getNewsSource());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getAttachment())) {
            chainWrapper.set(InsOfficeNewsInfo::getAttachment, insOfficeNewsInfo.getAttachment());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getPublishNumber())) {
            chainWrapper.set(InsOfficeNewsInfo::getPublishNumber, insOfficeNewsInfo.getPublishNumber());
        }
        if (insOfficeNewsInfo.getClickNumber() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getClickNumber, insOfficeNewsInfo.getClickNumber());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getRemark())) {
            chainWrapper.set(InsOfficeNewsInfo::getRemark, insOfficeNewsInfo.getRemark());
        }
        if (insOfficeNewsInfo.getCreateUser() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getCreateUser, insOfficeNewsInfo.getCreateUser());
        }
        if (insOfficeNewsInfo.getCreateDept() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getCreateDept, insOfficeNewsInfo.getCreateDept());
        }
        if (insOfficeNewsInfo.getUpdateUser() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getUpdateUser, insOfficeNewsInfo.getUpdateUser());
        }
        if (insOfficeNewsInfo.getUpdateTime() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getUpdateTime, insOfficeNewsInfo.getUpdateTime());
        }
        if (insOfficeNewsInfo.getIsDeleted() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getIsDeleted, insOfficeNewsInfo.getIsDeleted());
        }
        if (insOfficeNewsInfo.getStatus() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getStatus, insOfficeNewsInfo.getStatus());
        }
        if (insOfficeNewsInfo.getCreateTime() != null) {
            chainWrapper.set(InsOfficeNewsInfo::getCreateTime, insOfficeNewsInfo.getCreateTime());
        }
        if (StringUtil.isNotBlank(insOfficeNewsInfo.getCreateName())) {
            chainWrapper.set(InsOfficeNewsInfo::getCreateName, insOfficeNewsInfo.getCreateName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsOfficeNewsInfo::getId, insOfficeNewsInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insOfficeNewsInfo.getId());
        } else {
            return insOfficeNewsInfo;
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
    public boolean saveInsOfficeNewsInfoBatch(List<InsOfficeNewsInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsOfficeNewsInfo insOfficeNewsInfo : insertList) {
            //使用默认的雪花算法生成
            insOfficeNewsInfo.setId(null);
            //insOfficeNewsInfo.setCreatedDt(currentDte);
            //insOfficeNewsInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsOfficeNewsInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsOfficeNewsInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


