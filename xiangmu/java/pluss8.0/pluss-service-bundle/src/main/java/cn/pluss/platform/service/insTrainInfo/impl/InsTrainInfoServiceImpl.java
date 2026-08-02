package cn.pluss.platform.service.insTrainInfo.impl;

import cn.pluss.platform.mapper.InsTrainInfoMapper;
import cn.pluss.platform.model.entity.InsTrainInfo;
import cn.pluss.platform.service.insTrainInfo.InsTrainInfoService;
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
@Service("insTrainInfoService")
public class InsTrainInfoServiceImpl extends ServiceImpl< InsTrainInfoMapper, InsTrainInfo> implements InsTrainInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsTrainInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsTrainInfo> queryPage(Map map) {
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
    public InsTrainInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insTrainInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsTrainInfo queryOne(InsTrainInfo insTrainInfo){
        LambdaQueryWrapper<InsTrainInfo> queryWrapper = getQueryWrapper(insTrainInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insTrainInfo
    * @return
    */
    @Override
    public List<InsTrainInfo> queryList(InsTrainInfo insTrainInfo) {
        LambdaQueryWrapper<InsTrainInfo> queryWrapper = getQueryWrapper(insTrainInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insTrainInfo
    * @return
    */
    public static LambdaQueryWrapper<InsTrainInfo> getQueryWrapper(InsTrainInfo insTrainInfo){
        LambdaQueryWrapper<InsTrainInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insTrainInfo.getId() != null) {
            queryWrapper.eq(InsTrainInfo::getId, insTrainInfo.getId());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getTenantId())) {
            queryWrapper.eq(InsTrainInfo::getTenantId, insTrainInfo.getTenantId());
        }
        if (insTrainInfo.getCorpId() != null) {
            queryWrapper.eq(InsTrainInfo::getCorpId, insTrainInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getCorpName())) {
            queryWrapper.eq(InsTrainInfo::getCorpName, insTrainInfo.getCorpName());
        }
        if (insTrainInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsTrainInfo::getInstitutionId, insTrainInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getInstitutionName())) {
            queryWrapper.eq(InsTrainInfo::getInstitutionName, insTrainInfo.getInstitutionName());
        }
        if (insTrainInfo.getTypeId() != null) {
            queryWrapper.eq(InsTrainInfo::getTypeId, insTrainInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getTypeName())) {
            queryWrapper.eq(InsTrainInfo::getTypeName, insTrainInfo.getTypeName());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getTrainCode())) {
            queryWrapper.eq(InsTrainInfo::getTrainCode, insTrainInfo.getTrainCode());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getTrainName())) {
            queryWrapper.eq(InsTrainInfo::getTrainName, insTrainInfo.getTrainName());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getSpeakerName())) {
            queryWrapper.eq(InsTrainInfo::getSpeakerName, insTrainInfo.getSpeakerName());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getTrainContent())) {
            queryWrapper.eq(InsTrainInfo::getTrainContent, insTrainInfo.getTrainContent());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getTrainImgPath())) {
            queryWrapper.eq(InsTrainInfo::getTrainImgPath, insTrainInfo.getTrainImgPath());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getRemark())) {
            queryWrapper.eq(InsTrainInfo::getRemark, insTrainInfo.getRemark());
        }
        if (insTrainInfo.getCreateUser() != null) {
            queryWrapper.eq(InsTrainInfo::getCreateUser, insTrainInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insTrainInfo.getCreateName())) {
            queryWrapper.eq(InsTrainInfo::getCreateName, insTrainInfo.getCreateName());
        }
        if (insTrainInfo.getCreateDept() != null) {
            queryWrapper.eq(InsTrainInfo::getCreateDept, insTrainInfo.getCreateDept());
        }
        if (insTrainInfo.getCreateTime() != null) {
            queryWrapper.eq(InsTrainInfo::getCreateTime, insTrainInfo.getCreateTime());
        }
        if (insTrainInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsTrainInfo::getUpdateUser, insTrainInfo.getUpdateUser());
        }
        if (insTrainInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsTrainInfo::getUpdateTime, insTrainInfo.getUpdateTime());
        }
        if (insTrainInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsTrainInfo::getIsDeleted, insTrainInfo.getIsDeleted());
        }
        if (insTrainInfo.getStatus() != null) {
            queryWrapper.eq(InsTrainInfo::getStatus, insTrainInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insTrainInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsTrainInfo insert(InsTrainInfo insTrainInfo) {
        insTrainInfo.setId(null);
        getBaseMapper().insert(insTrainInfo);
        return insTrainInfo;
    }

    /**
    * 更新数据
    *
    * @param insTrainInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsTrainInfo update(InsTrainInfo insTrainInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsTrainInfo> chainWrapper = new LambdaUpdateChainWrapper<InsTrainInfo>(getBaseMapper());
        if (insTrainInfo.getId() != null) {
            chainWrapper.set(InsTrainInfo::getId, insTrainInfo.getId());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getTenantId())) {
            chainWrapper.set(InsTrainInfo::getTenantId, insTrainInfo.getTenantId());
        }
        if (insTrainInfo.getCorpId() != null) {
            chainWrapper.set(InsTrainInfo::getCorpId, insTrainInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getCorpName())) {
            chainWrapper.set(InsTrainInfo::getCorpName, insTrainInfo.getCorpName());
        }
        if (insTrainInfo.getInstitutionId() != null) {
            chainWrapper.set(InsTrainInfo::getInstitutionId, insTrainInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getInstitutionName())) {
            chainWrapper.set(InsTrainInfo::getInstitutionName, insTrainInfo.getInstitutionName());
        }
        if (insTrainInfo.getTypeId() != null) {
            chainWrapper.set(InsTrainInfo::getTypeId, insTrainInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getTypeName())) {
            chainWrapper.set(InsTrainInfo::getTypeName, insTrainInfo.getTypeName());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getTrainCode())) {
            chainWrapper.set(InsTrainInfo::getTrainCode, insTrainInfo.getTrainCode());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getTrainName())) {
            chainWrapper.set(InsTrainInfo::getTrainName, insTrainInfo.getTrainName());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getSpeakerName())) {
            chainWrapper.set(InsTrainInfo::getSpeakerName, insTrainInfo.getSpeakerName());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getTrainContent())) {
            chainWrapper.set(InsTrainInfo::getTrainContent, insTrainInfo.getTrainContent());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getTrainImgPath())) {
            chainWrapper.set(InsTrainInfo::getTrainImgPath, insTrainInfo.getTrainImgPath());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getRemark())) {
            chainWrapper.set(InsTrainInfo::getRemark, insTrainInfo.getRemark());
        }
        if (insTrainInfo.getCreateUser() != null) {
            chainWrapper.set(InsTrainInfo::getCreateUser, insTrainInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insTrainInfo.getCreateName())) {
            chainWrapper.set(InsTrainInfo::getCreateName, insTrainInfo.getCreateName());
        }
        if (insTrainInfo.getCreateDept() != null) {
            chainWrapper.set(InsTrainInfo::getCreateDept, insTrainInfo.getCreateDept());
        }
        if (insTrainInfo.getCreateTime() != null) {
            chainWrapper.set(InsTrainInfo::getCreateTime, insTrainInfo.getCreateTime());
        }
        if (insTrainInfo.getUpdateUser() != null) {
            chainWrapper.set(InsTrainInfo::getUpdateUser, insTrainInfo.getUpdateUser());
        }
        if (insTrainInfo.getUpdateTime() != null) {
            chainWrapper.set(InsTrainInfo::getUpdateTime, insTrainInfo.getUpdateTime());
        }
        if (insTrainInfo.getIsDeleted() != null) {
            chainWrapper.set(InsTrainInfo::getIsDeleted, insTrainInfo.getIsDeleted());
        }
        if (insTrainInfo.getStatus() != null) {
            chainWrapper.set(InsTrainInfo::getStatus, insTrainInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsTrainInfo::getId, insTrainInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insTrainInfo.getId());
        } else {
            return insTrainInfo;
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
    public boolean saveInsTrainInfoBatch(List<InsTrainInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsTrainInfo insTrainInfo : insertList) {
            //使用默认的雪花算法生成
            insTrainInfo.setId(null);
            //insTrainInfo.setCreatedDt(currentDte);
            //insTrainInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsTrainInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsTrainInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


