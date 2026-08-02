package cn.pluss.platform.service.insElderPhotoInfo.impl;

import cn.pluss.platform.mapper.InsElderPhotoInfoMapper;
import cn.pluss.platform.model.entity.InsElderPhotoInfo;
import cn.pluss.platform.service.insElderPhotoInfo.InsElderPhotoInfoService;
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
@Service("insElderPhotoInfoService")
public class InsElderPhotoInfoServiceImpl extends ServiceImpl< InsElderPhotoInfoMapper, InsElderPhotoInfo> implements InsElderPhotoInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderPhotoInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderPhotoInfo> queryPage(Map map) {
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
    public InsElderPhotoInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderPhotoInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderPhotoInfo queryOne(InsElderPhotoInfo insElderPhotoInfo){
        LambdaQueryWrapper<InsElderPhotoInfo> queryWrapper = getQueryWrapper(insElderPhotoInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderPhotoInfo
    * @return
    */
    @Override
    public List<InsElderPhotoInfo> queryList(InsElderPhotoInfo insElderPhotoInfo) {
        LambdaQueryWrapper<InsElderPhotoInfo> queryWrapper = getQueryWrapper(insElderPhotoInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderPhotoInfo
    * @return
    */
    public static LambdaQueryWrapper<InsElderPhotoInfo> getQueryWrapper(InsElderPhotoInfo insElderPhotoInfo){
        LambdaQueryWrapper<InsElderPhotoInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderPhotoInfo.getId() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getId, insElderPhotoInfo.getId());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getTenantId())) {
            queryWrapper.eq(InsElderPhotoInfo::getTenantId, insElderPhotoInfo.getTenantId());
        }
        if (insElderPhotoInfo.getCorpId() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getCorpId, insElderPhotoInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getCorpName())) {
            queryWrapper.eq(InsElderPhotoInfo::getCorpName, insElderPhotoInfo.getCorpName());
        }
        if (insElderPhotoInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getInstitutionId, insElderPhotoInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getInstitutionName())) {
            queryWrapper.eq(InsElderPhotoInfo::getInstitutionName, insElderPhotoInfo.getInstitutionName());
        }
        if (insElderPhotoInfo.getCheckId() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getCheckId, insElderPhotoInfo.getCheckId());
        }
        if (insElderPhotoInfo.getCheckDate() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getCheckDate, insElderPhotoInfo.getCheckDate());
        }
        if (insElderPhotoInfo.getElderId() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getElderId, insElderPhotoInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getElderName())) {
            queryWrapper.eq(InsElderPhotoInfo::getElderName, insElderPhotoInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getIdCard())) {
            queryWrapper.eq(InsElderPhotoInfo::getIdCard, insElderPhotoInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getSex())) {
            queryWrapper.eq(InsElderPhotoInfo::getSex, insElderPhotoInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getTitleName())) {
            queryWrapper.eq(InsElderPhotoInfo::getTitleName, insElderPhotoInfo.getTitleName());
        }
        if (insElderPhotoInfo.getTitleDate() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getTitleDate, insElderPhotoInfo.getTitleDate());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getPhotoPath())) {
            queryWrapper.eq(InsElderPhotoInfo::getPhotoPath, insElderPhotoInfo.getPhotoPath());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getAreaCode())) {
            queryWrapper.eq(InsElderPhotoInfo::getAreaCode, insElderPhotoInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getAreaName())) {
            queryWrapper.eq(InsElderPhotoInfo::getAreaName, insElderPhotoInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getRemark())) {
            queryWrapper.eq(InsElderPhotoInfo::getRemark, insElderPhotoInfo.getRemark());
        }
        if (insElderPhotoInfo.getCreateUser() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getCreateUser, insElderPhotoInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderPhotoInfo.getCreateName())) {
            queryWrapper.eq(InsElderPhotoInfo::getCreateName, insElderPhotoInfo.getCreateName());
        }
        if (insElderPhotoInfo.getCreateDept() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getCreateDept, insElderPhotoInfo.getCreateDept());
        }
        if (insElderPhotoInfo.getCreateTime() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getCreateTime, insElderPhotoInfo.getCreateTime());
        }
        if (insElderPhotoInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getUpdateUser, insElderPhotoInfo.getUpdateUser());
        }
        if (insElderPhotoInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getUpdateTime, insElderPhotoInfo.getUpdateTime());
        }
        if (insElderPhotoInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getIsDeleted, insElderPhotoInfo.getIsDeleted());
        }
        if (insElderPhotoInfo.getStatus() != null) {
            queryWrapper.eq(InsElderPhotoInfo::getStatus, insElderPhotoInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderPhotoInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderPhotoInfo insert(InsElderPhotoInfo insElderPhotoInfo) {
        insElderPhotoInfo.setId(null);
        getBaseMapper().insert(insElderPhotoInfo);
        return insElderPhotoInfo;
    }

    /**
    * 更新数据
    *
    * @param insElderPhotoInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderPhotoInfo update(InsElderPhotoInfo insElderPhotoInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderPhotoInfo> chainWrapper = new LambdaUpdateChainWrapper<InsElderPhotoInfo>(getBaseMapper());
        if (insElderPhotoInfo.getId() != null) {
            chainWrapper.set(InsElderPhotoInfo::getId, insElderPhotoInfo.getId());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getTenantId())) {
            chainWrapper.set(InsElderPhotoInfo::getTenantId, insElderPhotoInfo.getTenantId());
        }
        if (insElderPhotoInfo.getCorpId() != null) {
            chainWrapper.set(InsElderPhotoInfo::getCorpId, insElderPhotoInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getCorpName())) {
            chainWrapper.set(InsElderPhotoInfo::getCorpName, insElderPhotoInfo.getCorpName());
        }
        if (insElderPhotoInfo.getInstitutionId() != null) {
            chainWrapper.set(InsElderPhotoInfo::getInstitutionId, insElderPhotoInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getInstitutionName())) {
            chainWrapper.set(InsElderPhotoInfo::getInstitutionName, insElderPhotoInfo.getInstitutionName());
        }
        if (insElderPhotoInfo.getCheckId() != null) {
            chainWrapper.set(InsElderPhotoInfo::getCheckId, insElderPhotoInfo.getCheckId());
        }
        if (insElderPhotoInfo.getCheckDate() != null) {
            chainWrapper.set(InsElderPhotoInfo::getCheckDate, insElderPhotoInfo.getCheckDate());
        }
        if (insElderPhotoInfo.getElderId() != null) {
            chainWrapper.set(InsElderPhotoInfo::getElderId, insElderPhotoInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getElderName())) {
            chainWrapper.set(InsElderPhotoInfo::getElderName, insElderPhotoInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getIdCard())) {
            chainWrapper.set(InsElderPhotoInfo::getIdCard, insElderPhotoInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getSex())) {
            chainWrapper.set(InsElderPhotoInfo::getSex, insElderPhotoInfo.getSex());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getTitleName())) {
            chainWrapper.set(InsElderPhotoInfo::getTitleName, insElderPhotoInfo.getTitleName());
        }
        if (insElderPhotoInfo.getTitleDate() != null) {
            chainWrapper.set(InsElderPhotoInfo::getTitleDate, insElderPhotoInfo.getTitleDate());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getPhotoPath())) {
            chainWrapper.set(InsElderPhotoInfo::getPhotoPath, insElderPhotoInfo.getPhotoPath());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getAreaCode())) {
            chainWrapper.set(InsElderPhotoInfo::getAreaCode, insElderPhotoInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getAreaName())) {
            chainWrapper.set(InsElderPhotoInfo::getAreaName, insElderPhotoInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getRemark())) {
            chainWrapper.set(InsElderPhotoInfo::getRemark, insElderPhotoInfo.getRemark());
        }
        if (insElderPhotoInfo.getCreateUser() != null) {
            chainWrapper.set(InsElderPhotoInfo::getCreateUser, insElderPhotoInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderPhotoInfo.getCreateName())) {
            chainWrapper.set(InsElderPhotoInfo::getCreateName, insElderPhotoInfo.getCreateName());
        }
        if (insElderPhotoInfo.getCreateDept() != null) {
            chainWrapper.set(InsElderPhotoInfo::getCreateDept, insElderPhotoInfo.getCreateDept());
        }
        if (insElderPhotoInfo.getCreateTime() != null) {
            chainWrapper.set(InsElderPhotoInfo::getCreateTime, insElderPhotoInfo.getCreateTime());
        }
        if (insElderPhotoInfo.getUpdateUser() != null) {
            chainWrapper.set(InsElderPhotoInfo::getUpdateUser, insElderPhotoInfo.getUpdateUser());
        }
        if (insElderPhotoInfo.getUpdateTime() != null) {
            chainWrapper.set(InsElderPhotoInfo::getUpdateTime, insElderPhotoInfo.getUpdateTime());
        }
        if (insElderPhotoInfo.getIsDeleted() != null) {
            chainWrapper.set(InsElderPhotoInfo::getIsDeleted, insElderPhotoInfo.getIsDeleted());
        }
        if (insElderPhotoInfo.getStatus() != null) {
            chainWrapper.set(InsElderPhotoInfo::getStatus, insElderPhotoInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderPhotoInfo::getId, insElderPhotoInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderPhotoInfo.getId());
        } else {
            return insElderPhotoInfo;
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
    public boolean saveInsElderPhotoInfoBatch(List<InsElderPhotoInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderPhotoInfo insElderPhotoInfo : insertList) {
            //使用默认的雪花算法生成
            insElderPhotoInfo.setId(null);
            //insElderPhotoInfo.setCreatedDt(currentDte);
            //insElderPhotoInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderPhotoInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderPhotoInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


