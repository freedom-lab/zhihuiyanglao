package cn.pluss.platform.service.insTrainRelease.impl;

import cn.pluss.platform.mapper.InsTrainReleaseMapper;
import cn.pluss.platform.model.entity.InsTrainRelease;
import cn.pluss.platform.service.insTrainRelease.InsTrainReleaseService;
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
@Service("insTrainReleaseService")
public class InsTrainReleaseServiceImpl extends ServiceImpl< InsTrainReleaseMapper, InsTrainRelease> implements InsTrainReleaseService {
    private static final Logger logger = LoggerFactory.getLogger(InsTrainReleaseServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsTrainRelease> queryPage(Map map) {
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
    public InsTrainRelease queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insTrainRelease 实例对象
    * @return 实例对象
    */
    @Override
    public InsTrainRelease queryOne(InsTrainRelease insTrainRelease){
        LambdaQueryWrapper<InsTrainRelease> queryWrapper = getQueryWrapper(insTrainRelease);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insTrainRelease
    * @return
    */
    @Override
    public List<InsTrainRelease> queryList(InsTrainRelease insTrainRelease) {
        LambdaQueryWrapper<InsTrainRelease> queryWrapper = getQueryWrapper(insTrainRelease);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insTrainRelease
    * @return
    */
    public static LambdaQueryWrapper<InsTrainRelease> getQueryWrapper(InsTrainRelease insTrainRelease){
        LambdaQueryWrapper<InsTrainRelease> queryWrapper = new LambdaQueryWrapper<>();
        if (insTrainRelease.getId() != null) {
            queryWrapper.eq(InsTrainRelease::getId, insTrainRelease.getId());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getTenantId())) {
            queryWrapper.eq(InsTrainRelease::getTenantId, insTrainRelease.getTenantId());
        }
        if (insTrainRelease.getCorpId() != null) {
            queryWrapper.eq(InsTrainRelease::getCorpId, insTrainRelease.getCorpId());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getCorpName())) {
            queryWrapper.eq(InsTrainRelease::getCorpName, insTrainRelease.getCorpName());
        }
        if (insTrainRelease.getInstitutionId() != null) {
            queryWrapper.eq(InsTrainRelease::getInstitutionId, insTrainRelease.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getInstitutionName())) {
            queryWrapper.eq(InsTrainRelease::getInstitutionName, insTrainRelease.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getReleaseName())) {
            queryWrapper.eq(InsTrainRelease::getReleaseName, insTrainRelease.getReleaseName());
        }
        if (insTrainRelease.getTypeId() != null) {
            queryWrapper.eq(InsTrainRelease::getTypeId, insTrainRelease.getTypeId());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getTypeName())) {
            queryWrapper.eq(InsTrainRelease::getTypeName, insTrainRelease.getTypeName());
        }
        if (insTrainRelease.getTrainId() != null) {
            queryWrapper.eq(InsTrainRelease::getTrainId, insTrainRelease.getTrainId());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getTrainName())) {
            queryWrapper.eq(InsTrainRelease::getTrainName, insTrainRelease.getTrainName());
        }
        if (insTrainRelease.getTrainStartTime() != null) {
            queryWrapper.eq(InsTrainRelease::getTrainStartTime, insTrainRelease.getTrainStartTime());
        }
        if (insTrainRelease.getTrainEndTime() != null) {
            queryWrapper.eq(InsTrainRelease::getTrainEndTime, insTrainRelease.getTrainEndTime());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getSpeakerName())) {
            queryWrapper.eq(InsTrainRelease::getSpeakerName, insTrainRelease.getSpeakerName());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getTrainContent())) {
            queryWrapper.eq(InsTrainRelease::getTrainContent, insTrainRelease.getTrainContent());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getTrainLocation())) {
            queryWrapper.eq(InsTrainRelease::getTrainLocation, insTrainRelease.getTrainLocation());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getLinkName())) {
            queryWrapper.eq(InsTrainRelease::getLinkName, insTrainRelease.getLinkName());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getLinkTel())) {
            queryWrapper.eq(InsTrainRelease::getLinkTel, insTrainRelease.getLinkTel());
        }
        if (insTrainRelease.getTrainState() != null) {
            queryWrapper.eq(InsTrainRelease::getTrainState, insTrainRelease.getTrainState());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getRecordName())) {
            queryWrapper.eq(InsTrainRelease::getRecordName, insTrainRelease.getRecordName());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getTrainConclusion())) {
            queryWrapper.eq(InsTrainRelease::getTrainConclusion, insTrainRelease.getTrainConclusion());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getTrainPath())) {
            queryWrapper.eq(InsTrainRelease::getTrainPath, insTrainRelease.getTrainPath());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getRemark())) {
            queryWrapper.eq(InsTrainRelease::getRemark, insTrainRelease.getRemark());
        }
        if (insTrainRelease.getCreateUser() != null) {
            queryWrapper.eq(InsTrainRelease::getCreateUser, insTrainRelease.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insTrainRelease.getCreateName())) {
            queryWrapper.eq(InsTrainRelease::getCreateName, insTrainRelease.getCreateName());
        }
        if (insTrainRelease.getCreateDept() != null) {
            queryWrapper.eq(InsTrainRelease::getCreateDept, insTrainRelease.getCreateDept());
        }
        if (insTrainRelease.getCreateTime() != null) {
            queryWrapper.eq(InsTrainRelease::getCreateTime, insTrainRelease.getCreateTime());
        }
        if (insTrainRelease.getUpdateUser() != null) {
            queryWrapper.eq(InsTrainRelease::getUpdateUser, insTrainRelease.getUpdateUser());
        }
        if (insTrainRelease.getUpdateTime() != null) {
            queryWrapper.eq(InsTrainRelease::getUpdateTime, insTrainRelease.getUpdateTime());
        }
        if (insTrainRelease.getIsDeleted() != null) {
            queryWrapper.eq(InsTrainRelease::getIsDeleted, insTrainRelease.getIsDeleted());
        }
        if (insTrainRelease.getStatus() != null) {
            queryWrapper.eq(InsTrainRelease::getStatus, insTrainRelease.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insTrainRelease 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsTrainRelease insert(InsTrainRelease insTrainRelease) {
        insTrainRelease.setId(null);
        getBaseMapper().insert(insTrainRelease);
        return insTrainRelease;
    }

    /**
    * 更新数据
    *
    * @param insTrainRelease 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsTrainRelease update(InsTrainRelease insTrainRelease) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsTrainRelease> chainWrapper = new LambdaUpdateChainWrapper<InsTrainRelease>(getBaseMapper());
        if (insTrainRelease.getId() != null) {
            chainWrapper.set(InsTrainRelease::getId, insTrainRelease.getId());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getTenantId())) {
            chainWrapper.set(InsTrainRelease::getTenantId, insTrainRelease.getTenantId());
        }
        if (insTrainRelease.getCorpId() != null) {
            chainWrapper.set(InsTrainRelease::getCorpId, insTrainRelease.getCorpId());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getCorpName())) {
            chainWrapper.set(InsTrainRelease::getCorpName, insTrainRelease.getCorpName());
        }
        if (insTrainRelease.getInstitutionId() != null) {
            chainWrapper.set(InsTrainRelease::getInstitutionId, insTrainRelease.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getInstitutionName())) {
            chainWrapper.set(InsTrainRelease::getInstitutionName, insTrainRelease.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getReleaseName())) {
            chainWrapper.set(InsTrainRelease::getReleaseName, insTrainRelease.getReleaseName());
        }
        if (insTrainRelease.getTypeId() != null) {
            chainWrapper.set(InsTrainRelease::getTypeId, insTrainRelease.getTypeId());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getTypeName())) {
            chainWrapper.set(InsTrainRelease::getTypeName, insTrainRelease.getTypeName());
        }
        if (insTrainRelease.getTrainId() != null) {
            chainWrapper.set(InsTrainRelease::getTrainId, insTrainRelease.getTrainId());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getTrainName())) {
            chainWrapper.set(InsTrainRelease::getTrainName, insTrainRelease.getTrainName());
        }
        if (insTrainRelease.getTrainStartTime() != null) {
            chainWrapper.set(InsTrainRelease::getTrainStartTime, insTrainRelease.getTrainStartTime());
        }
        if (insTrainRelease.getTrainEndTime() != null) {
            chainWrapper.set(InsTrainRelease::getTrainEndTime, insTrainRelease.getTrainEndTime());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getSpeakerName())) {
            chainWrapper.set(InsTrainRelease::getSpeakerName, insTrainRelease.getSpeakerName());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getTrainContent())) {
            chainWrapper.set(InsTrainRelease::getTrainContent, insTrainRelease.getTrainContent());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getTrainLocation())) {
            chainWrapper.set(InsTrainRelease::getTrainLocation, insTrainRelease.getTrainLocation());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getLinkName())) {
            chainWrapper.set(InsTrainRelease::getLinkName, insTrainRelease.getLinkName());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getLinkTel())) {
            chainWrapper.set(InsTrainRelease::getLinkTel, insTrainRelease.getLinkTel());
        }
        if (insTrainRelease.getTrainState() != null) {
            chainWrapper.set(InsTrainRelease::getTrainState, insTrainRelease.getTrainState());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getRecordName())) {
            chainWrapper.set(InsTrainRelease::getRecordName, insTrainRelease.getRecordName());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getTrainConclusion())) {
            chainWrapper.set(InsTrainRelease::getTrainConclusion, insTrainRelease.getTrainConclusion());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getTrainPath())) {
            chainWrapper.set(InsTrainRelease::getTrainPath, insTrainRelease.getTrainPath());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getRemark())) {
            chainWrapper.set(InsTrainRelease::getRemark, insTrainRelease.getRemark());
        }
        if (insTrainRelease.getCreateUser() != null) {
            chainWrapper.set(InsTrainRelease::getCreateUser, insTrainRelease.getCreateUser());
        }
        if (StringUtil.isNotBlank(insTrainRelease.getCreateName())) {
            chainWrapper.set(InsTrainRelease::getCreateName, insTrainRelease.getCreateName());
        }
        if (insTrainRelease.getCreateDept() != null) {
            chainWrapper.set(InsTrainRelease::getCreateDept, insTrainRelease.getCreateDept());
        }
        if (insTrainRelease.getCreateTime() != null) {
            chainWrapper.set(InsTrainRelease::getCreateTime, insTrainRelease.getCreateTime());
        }
        if (insTrainRelease.getUpdateUser() != null) {
            chainWrapper.set(InsTrainRelease::getUpdateUser, insTrainRelease.getUpdateUser());
        }
        if (insTrainRelease.getUpdateTime() != null) {
            chainWrapper.set(InsTrainRelease::getUpdateTime, insTrainRelease.getUpdateTime());
        }
        if (insTrainRelease.getIsDeleted() != null) {
            chainWrapper.set(InsTrainRelease::getIsDeleted, insTrainRelease.getIsDeleted());
        }
        if (insTrainRelease.getStatus() != null) {
            chainWrapper.set(InsTrainRelease::getStatus, insTrainRelease.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsTrainRelease::getId, insTrainRelease.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insTrainRelease.getId());
        } else {
            return insTrainRelease;
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
    public boolean saveInsTrainReleaseBatch(List<InsTrainRelease> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsTrainRelease insTrainRelease : insertList) {
            //使用默认的雪花算法生成
            insTrainRelease.setId(null);
            //insTrainRelease.setCreatedDt(currentDte);
            //insTrainRelease.setUpdatedDt(currentDte);
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
    public Integer deleteInsTrainReleaseBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsTrainRelease> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


