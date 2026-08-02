package cn.pluss.platform.service.insOfficeFileInfo.impl;

import cn.pluss.platform.mapper.InsOfficeFileInfoMapper;
import cn.pluss.platform.model.entity.InsOfficeFileInfo;
import cn.pluss.platform.service.insOfficeFileInfo.InsOfficeFileInfoService;
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
@Service("insOfficeFileInfoService")
public class InsOfficeFileInfoServiceImpl extends ServiceImpl< InsOfficeFileInfoMapper, InsOfficeFileInfo> implements InsOfficeFileInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsOfficeFileInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsOfficeFileInfo> queryPage(Map map) {
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
    public InsOfficeFileInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficeFileInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsOfficeFileInfo queryOne(InsOfficeFileInfo insOfficeFileInfo){
        LambdaQueryWrapper<InsOfficeFileInfo> queryWrapper = getQueryWrapper(insOfficeFileInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insOfficeFileInfo
    * @return
    */
    @Override
    public List<InsOfficeFileInfo> queryList(InsOfficeFileInfo insOfficeFileInfo) {
        LambdaQueryWrapper<InsOfficeFileInfo> queryWrapper = getQueryWrapper(insOfficeFileInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insOfficeFileInfo
    * @return
    */
    public static LambdaQueryWrapper<InsOfficeFileInfo> getQueryWrapper(InsOfficeFileInfo insOfficeFileInfo){
        LambdaQueryWrapper<InsOfficeFileInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insOfficeFileInfo.getId() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getId, insOfficeFileInfo.getId());
        }
        if (StringUtil.isNotEmpty(insOfficeFileInfo.getTenantId())) {
            queryWrapper.eq(InsOfficeFileInfo::getTenantId, insOfficeFileInfo.getTenantId());
        }
        if (insOfficeFileInfo.getCorpId() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getCorpId, insOfficeFileInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insOfficeFileInfo.getCorpName())) {
            queryWrapper.eq(InsOfficeFileInfo::getCorpName, insOfficeFileInfo.getCorpName());
        }
        if (insOfficeFileInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getInstitutionId, insOfficeFileInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insOfficeFileInfo.getInstitutionName())) {
            queryWrapper.eq(InsOfficeFileInfo::getInstitutionName, insOfficeFileInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insOfficeFileInfo.getFileTitle())) {
            queryWrapper.eq(InsOfficeFileInfo::getFileTitle, insOfficeFileInfo.getFileTitle());
        }
        if (StringUtil.isNotEmpty(insOfficeFileInfo.getFileUrl())) {
            queryWrapper.eq(InsOfficeFileInfo::getFileUrl, insOfficeFileInfo.getFileUrl());
        }
        if (StringUtil.isNotEmpty(insOfficeFileInfo.getFileImg())) {
            queryWrapper.eq(InsOfficeFileInfo::getFileImg, insOfficeFileInfo.getFileImg());
        }
        if (insOfficeFileInfo.getFileType() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getFileType, insOfficeFileInfo.getFileType());
        }
        if (StringUtil.isNotEmpty(insOfficeFileInfo.getFileSize())) {
            queryWrapper.eq(InsOfficeFileInfo::getFileSize, insOfficeFileInfo.getFileSize());
        }
        if (StringUtil.isNotEmpty(insOfficeFileInfo.getRemark())) {
            queryWrapper.eq(InsOfficeFileInfo::getRemark, insOfficeFileInfo.getRemark());
        }
        if (insOfficeFileInfo.getCreateUser() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getCreateUser, insOfficeFileInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insOfficeFileInfo.getCreateName())) {
            queryWrapper.eq(InsOfficeFileInfo::getCreateName, insOfficeFileInfo.getCreateName());
        }
        if (insOfficeFileInfo.getCreateDept() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getCreateDept, insOfficeFileInfo.getCreateDept());
        }
        if (insOfficeFileInfo.getCreateTime() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getCreateTime, insOfficeFileInfo.getCreateTime());
        }
        if (insOfficeFileInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getUpdateUser, insOfficeFileInfo.getUpdateUser());
        }
        if (insOfficeFileInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getUpdateTime, insOfficeFileInfo.getUpdateTime());
        }
        if (insOfficeFileInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getIsDeleted, insOfficeFileInfo.getIsDeleted());
        }
        if (insOfficeFileInfo.getStatus() != null) {
            queryWrapper.eq(InsOfficeFileInfo::getStatus, insOfficeFileInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insOfficeFileInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficeFileInfo insert(InsOfficeFileInfo insOfficeFileInfo) {
        insOfficeFileInfo.setId(null);
        getBaseMapper().insert(insOfficeFileInfo);
        return insOfficeFileInfo;
    }

    /**
    * 更新数据
    *
    * @param insOfficeFileInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsOfficeFileInfo update(InsOfficeFileInfo insOfficeFileInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsOfficeFileInfo> chainWrapper = new LambdaUpdateChainWrapper<InsOfficeFileInfo>(getBaseMapper());
        if (insOfficeFileInfo.getId() != null) {
            chainWrapper.set(InsOfficeFileInfo::getId, insOfficeFileInfo.getId());
        }
        if (StringUtil.isNotBlank(insOfficeFileInfo.getTenantId())) {
            chainWrapper.set(InsOfficeFileInfo::getTenantId, insOfficeFileInfo.getTenantId());
        }
        if (insOfficeFileInfo.getCorpId() != null) {
            chainWrapper.set(InsOfficeFileInfo::getCorpId, insOfficeFileInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insOfficeFileInfo.getCorpName())) {
            chainWrapper.set(InsOfficeFileInfo::getCorpName, insOfficeFileInfo.getCorpName());
        }
        if (insOfficeFileInfo.getInstitutionId() != null) {
            chainWrapper.set(InsOfficeFileInfo::getInstitutionId, insOfficeFileInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insOfficeFileInfo.getInstitutionName())) {
            chainWrapper.set(InsOfficeFileInfo::getInstitutionName, insOfficeFileInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insOfficeFileInfo.getFileTitle())) {
            chainWrapper.set(InsOfficeFileInfo::getFileTitle, insOfficeFileInfo.getFileTitle());
        }
        if (StringUtil.isNotBlank(insOfficeFileInfo.getFileUrl())) {
            chainWrapper.set(InsOfficeFileInfo::getFileUrl, insOfficeFileInfo.getFileUrl());
        }
        if (StringUtil.isNotBlank(insOfficeFileInfo.getFileImg())) {
            chainWrapper.set(InsOfficeFileInfo::getFileImg, insOfficeFileInfo.getFileImg());
        }
        if (insOfficeFileInfo.getFileType() != null) {
            chainWrapper.set(InsOfficeFileInfo::getFileType, insOfficeFileInfo.getFileType());
        }
        if (StringUtil.isNotBlank(insOfficeFileInfo.getFileSize())) {
            chainWrapper.set(InsOfficeFileInfo::getFileSize, insOfficeFileInfo.getFileSize());
        }
        if (StringUtil.isNotBlank(insOfficeFileInfo.getRemark())) {
            chainWrapper.set(InsOfficeFileInfo::getRemark, insOfficeFileInfo.getRemark());
        }
        if (insOfficeFileInfo.getCreateUser() != null) {
            chainWrapper.set(InsOfficeFileInfo::getCreateUser, insOfficeFileInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insOfficeFileInfo.getCreateName())) {
            chainWrapper.set(InsOfficeFileInfo::getCreateName, insOfficeFileInfo.getCreateName());
        }
        if (insOfficeFileInfo.getCreateDept() != null) {
            chainWrapper.set(InsOfficeFileInfo::getCreateDept, insOfficeFileInfo.getCreateDept());
        }
        if (insOfficeFileInfo.getCreateTime() != null) {
            chainWrapper.set(InsOfficeFileInfo::getCreateTime, insOfficeFileInfo.getCreateTime());
        }
        if (insOfficeFileInfo.getUpdateUser() != null) {
            chainWrapper.set(InsOfficeFileInfo::getUpdateUser, insOfficeFileInfo.getUpdateUser());
        }
        if (insOfficeFileInfo.getUpdateTime() != null) {
            chainWrapper.set(InsOfficeFileInfo::getUpdateTime, insOfficeFileInfo.getUpdateTime());
        }
        if (insOfficeFileInfo.getIsDeleted() != null) {
            chainWrapper.set(InsOfficeFileInfo::getIsDeleted, insOfficeFileInfo.getIsDeleted());
        }
        if (insOfficeFileInfo.getStatus() != null) {
            chainWrapper.set(InsOfficeFileInfo::getStatus, insOfficeFileInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsOfficeFileInfo::getId, insOfficeFileInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insOfficeFileInfo.getId());
        } else {
            return insOfficeFileInfo;
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
    public boolean saveInsOfficeFileInfoBatch(List<InsOfficeFileInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsOfficeFileInfo insOfficeFileInfo : insertList) {
            //使用默认的雪花算法生成
            insOfficeFileInfo.setId(null);
            //insOfficeFileInfo.setCreatedDt(currentDte);
            //insOfficeFileInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsOfficeFileInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsOfficeFileInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


