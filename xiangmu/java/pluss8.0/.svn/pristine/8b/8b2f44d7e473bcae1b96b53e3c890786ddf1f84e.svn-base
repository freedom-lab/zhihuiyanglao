package cn.pluss.platform.service.insActivityEntryInfo.impl;

import cn.pluss.platform.mapper.InsActivityEntryInfoMapper;
import cn.pluss.platform.model.entity.InsActivityEntryInfo;
import cn.pluss.platform.service.insActivityEntryInfo.InsActivityEntryInfoService;
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
@Service("insActivityEntryInfoService")
public class InsActivityEntryInfoServiceImpl extends ServiceImpl< InsActivityEntryInfoMapper, InsActivityEntryInfo> implements InsActivityEntryInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsActivityEntryInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsActivityEntryInfo> queryPage(Map map) {
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
    public InsActivityEntryInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insActivityEntryInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsActivityEntryInfo queryOne(InsActivityEntryInfo insActivityEntryInfo){
        LambdaQueryWrapper<InsActivityEntryInfo> queryWrapper = getQueryWrapper(insActivityEntryInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insActivityEntryInfo
    * @return
    */
    @Override
    public List<InsActivityEntryInfo> queryList(InsActivityEntryInfo insActivityEntryInfo) {
        LambdaQueryWrapper<InsActivityEntryInfo> queryWrapper = getQueryWrapper(insActivityEntryInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insActivityEntryInfo
    * @return
    */
    public static LambdaQueryWrapper<InsActivityEntryInfo> getQueryWrapper(InsActivityEntryInfo insActivityEntryInfo){
        LambdaQueryWrapper<InsActivityEntryInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insActivityEntryInfo.getId() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getId, insActivityEntryInfo.getId());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getTenantId())) {
            queryWrapper.eq(InsActivityEntryInfo::getTenantId, insActivityEntryInfo.getTenantId());
        }
        if (insActivityEntryInfo.getCorpId() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getCorpId, insActivityEntryInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getCorpName())) {
            queryWrapper.eq(InsActivityEntryInfo::getCorpName, insActivityEntryInfo.getCorpName());
        }
        if (insActivityEntryInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getInstitutionId, insActivityEntryInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getInstitutionName())) {
            queryWrapper.eq(InsActivityEntryInfo::getInstitutionName, insActivityEntryInfo.getInstitutionName());
        }
        if (insActivityEntryInfo.getCheckId() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getCheckId, insActivityEntryInfo.getCheckId());
        }
        if (insActivityEntryInfo.getCheckDate() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getCheckDate, insActivityEntryInfo.getCheckDate());
        }
        if (insActivityEntryInfo.getElderId() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getElderId, insActivityEntryInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getElderName())) {
            queryWrapper.eq(InsActivityEntryInfo::getElderName, insActivityEntryInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getIdCard())) {
            queryWrapper.eq(InsActivityEntryInfo::getIdCard, insActivityEntryInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getSex())) {
            queryWrapper.eq(InsActivityEntryInfo::getSex, insActivityEntryInfo.getSex());
        }
        if (insActivityEntryInfo.getEntryTime() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getEntryTime, insActivityEntryInfo.getEntryTime());
        }
        if (insActivityEntryInfo.getTypeId() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getTypeId, insActivityEntryInfo.getTypeId());
        }
        if (insActivityEntryInfo.getActivityId() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getActivityId, insActivityEntryInfo.getActivityId());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getActivityName())) {
            queryWrapper.eq(InsActivityEntryInfo::getActivityName, insActivityEntryInfo.getActivityName());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getActivityAddress())) {
            queryWrapper.eq(InsActivityEntryInfo::getActivityAddress, insActivityEntryInfo.getActivityAddress());
        }
        if (insActivityEntryInfo.getActivityDate() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getActivityDate, insActivityEntryInfo.getActivityDate());
        }
        if (insActivityEntryInfo.getIsSign() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getIsSign, insActivityEntryInfo.getIsSign());
        }
        if (insActivityEntryInfo.getSignTime() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getSignTime, insActivityEntryInfo.getSignTime());
        }
        if (insActivityEntryInfo.getSignWay() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getSignWay, insActivityEntryInfo.getSignWay());
        }
        if (insActivityEntryInfo.getBonusIntegral() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getBonusIntegral, insActivityEntryInfo.getBonusIntegral());
        }
        if (insActivityEntryInfo.getQuitTime() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getQuitTime, insActivityEntryInfo.getQuitTime());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getRemark())) {
            queryWrapper.eq(InsActivityEntryInfo::getRemark, insActivityEntryInfo.getRemark());
        }
        if (insActivityEntryInfo.getCreateUser() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getCreateUser, insActivityEntryInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insActivityEntryInfo.getCreateName())) {
            queryWrapper.eq(InsActivityEntryInfo::getCreateName, insActivityEntryInfo.getCreateName());
        }
        if (insActivityEntryInfo.getCreateDept() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getCreateDept, insActivityEntryInfo.getCreateDept());
        }
        if (insActivityEntryInfo.getCreateTime() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getCreateTime, insActivityEntryInfo.getCreateTime());
        }
        if (insActivityEntryInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getUpdateUser, insActivityEntryInfo.getUpdateUser());
        }
        if (insActivityEntryInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getUpdateTime, insActivityEntryInfo.getUpdateTime());
        }
        if (insActivityEntryInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getIsDeleted, insActivityEntryInfo.getIsDeleted());
        }
        if (insActivityEntryInfo.getStatus() != null) {
            queryWrapper.eq(InsActivityEntryInfo::getStatus, insActivityEntryInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insActivityEntryInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityEntryInfo insert(InsActivityEntryInfo insActivityEntryInfo) {
        insActivityEntryInfo.setId(null);
        getBaseMapper().insert(insActivityEntryInfo);
        return insActivityEntryInfo;
    }

    /**
    * 更新数据
    *
    * @param insActivityEntryInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityEntryInfo update(InsActivityEntryInfo insActivityEntryInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsActivityEntryInfo> chainWrapper = new LambdaUpdateChainWrapper<InsActivityEntryInfo>(getBaseMapper());
        if (insActivityEntryInfo.getId() != null) {
            chainWrapper.set(InsActivityEntryInfo::getId, insActivityEntryInfo.getId());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getTenantId())) {
            chainWrapper.set(InsActivityEntryInfo::getTenantId, insActivityEntryInfo.getTenantId());
        }
        if (insActivityEntryInfo.getCorpId() != null) {
            chainWrapper.set(InsActivityEntryInfo::getCorpId, insActivityEntryInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getCorpName())) {
            chainWrapper.set(InsActivityEntryInfo::getCorpName, insActivityEntryInfo.getCorpName());
        }
        if (insActivityEntryInfo.getInstitutionId() != null) {
            chainWrapper.set(InsActivityEntryInfo::getInstitutionId, insActivityEntryInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getInstitutionName())) {
            chainWrapper.set(InsActivityEntryInfo::getInstitutionName, insActivityEntryInfo.getInstitutionName());
        }
        if (insActivityEntryInfo.getCheckId() != null) {
            chainWrapper.set(InsActivityEntryInfo::getCheckId, insActivityEntryInfo.getCheckId());
        }
        if (insActivityEntryInfo.getCheckDate() != null) {
            chainWrapper.set(InsActivityEntryInfo::getCheckDate, insActivityEntryInfo.getCheckDate());
        }
        if (insActivityEntryInfo.getElderId() != null) {
            chainWrapper.set(InsActivityEntryInfo::getElderId, insActivityEntryInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getElderName())) {
            chainWrapper.set(InsActivityEntryInfo::getElderName, insActivityEntryInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getIdCard())) {
            chainWrapper.set(InsActivityEntryInfo::getIdCard, insActivityEntryInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getSex())) {
            chainWrapper.set(InsActivityEntryInfo::getSex, insActivityEntryInfo.getSex());
        }
        if (insActivityEntryInfo.getEntryTime() != null) {
            chainWrapper.set(InsActivityEntryInfo::getEntryTime, insActivityEntryInfo.getEntryTime());
        }
        if (insActivityEntryInfo.getTypeId() != null) {
            chainWrapper.set(InsActivityEntryInfo::getTypeId, insActivityEntryInfo.getTypeId());
        }
        if (insActivityEntryInfo.getActivityId() != null) {
            chainWrapper.set(InsActivityEntryInfo::getActivityId, insActivityEntryInfo.getActivityId());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getActivityName())) {
            chainWrapper.set(InsActivityEntryInfo::getActivityName, insActivityEntryInfo.getActivityName());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getActivityAddress())) {
            chainWrapper.set(InsActivityEntryInfo::getActivityAddress, insActivityEntryInfo.getActivityAddress());
        }
        if (insActivityEntryInfo.getActivityDate() != null) {
            chainWrapper.set(InsActivityEntryInfo::getActivityDate, insActivityEntryInfo.getActivityDate());
        }
        if (insActivityEntryInfo.getIsSign() != null) {
            chainWrapper.set(InsActivityEntryInfo::getIsSign, insActivityEntryInfo.getIsSign());
        }
        if (insActivityEntryInfo.getSignTime() != null) {
            chainWrapper.set(InsActivityEntryInfo::getSignTime, insActivityEntryInfo.getSignTime());
        }
        if (insActivityEntryInfo.getSignWay() != null) {
            chainWrapper.set(InsActivityEntryInfo::getSignWay, insActivityEntryInfo.getSignWay());
        }
        if (insActivityEntryInfo.getBonusIntegral() != null) {
            chainWrapper.set(InsActivityEntryInfo::getBonusIntegral, insActivityEntryInfo.getBonusIntegral());
        }
        if (insActivityEntryInfo.getQuitTime() != null) {
            chainWrapper.set(InsActivityEntryInfo::getQuitTime, insActivityEntryInfo.getQuitTime());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getRemark())) {
            chainWrapper.set(InsActivityEntryInfo::getRemark, insActivityEntryInfo.getRemark());
        }
        if (insActivityEntryInfo.getCreateUser() != null) {
            chainWrapper.set(InsActivityEntryInfo::getCreateUser, insActivityEntryInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insActivityEntryInfo.getCreateName())) {
            chainWrapper.set(InsActivityEntryInfo::getCreateName, insActivityEntryInfo.getCreateName());
        }
        if (insActivityEntryInfo.getCreateDept() != null) {
            chainWrapper.set(InsActivityEntryInfo::getCreateDept, insActivityEntryInfo.getCreateDept());
        }
        if (insActivityEntryInfo.getCreateTime() != null) {
            chainWrapper.set(InsActivityEntryInfo::getCreateTime, insActivityEntryInfo.getCreateTime());
        }
        if (insActivityEntryInfo.getUpdateUser() != null) {
            chainWrapper.set(InsActivityEntryInfo::getUpdateUser, insActivityEntryInfo.getUpdateUser());
        }
        if (insActivityEntryInfo.getUpdateTime() != null) {
            chainWrapper.set(InsActivityEntryInfo::getUpdateTime, insActivityEntryInfo.getUpdateTime());
        }
        if (insActivityEntryInfo.getIsDeleted() != null) {
            chainWrapper.set(InsActivityEntryInfo::getIsDeleted, insActivityEntryInfo.getIsDeleted());
        }
        if (insActivityEntryInfo.getStatus() != null) {
            chainWrapper.set(InsActivityEntryInfo::getStatus, insActivityEntryInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsActivityEntryInfo::getId, insActivityEntryInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insActivityEntryInfo.getId());
        } else {
            return insActivityEntryInfo;
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
    public boolean saveInsActivityEntryInfoBatch(List<InsActivityEntryInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsActivityEntryInfo insActivityEntryInfo : insertList) {
            //使用默认的雪花算法生成
            insActivityEntryInfo.setId(null);
            //insActivityEntryInfo.setCreatedDt(currentDte);
            //insActivityEntryInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsActivityEntryInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsActivityEntryInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


