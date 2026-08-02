package cn.pluss.platform.service.insBaseCostInfo.impl;

import cn.pluss.platform.mapper.InsBaseCostInfoMapper;
import cn.pluss.platform.model.entity.InsBaseCostInfo;
import cn.pluss.platform.service.insBaseCostInfo.InsBaseCostInfoService;
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
@Service("insBaseCostInfoService")
public class InsBaseCostInfoServiceImpl extends ServiceImpl< InsBaseCostInfoMapper, InsBaseCostInfo> implements InsBaseCostInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseCostInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseCostInfo> queryPage(Map map) {
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
    public InsBaseCostInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseCostInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseCostInfo queryOne(InsBaseCostInfo insBaseCostInfo){
        LambdaQueryWrapper<InsBaseCostInfo> queryWrapper = getQueryWrapper(insBaseCostInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseCostInfo
    * @return
    */
    @Override
    public List<InsBaseCostInfo> queryList(InsBaseCostInfo insBaseCostInfo) {
        LambdaQueryWrapper<InsBaseCostInfo> queryWrapper = getQueryWrapper(insBaseCostInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseCostInfo
    * @return
    */
    public static LambdaQueryWrapper<InsBaseCostInfo> getQueryWrapper(InsBaseCostInfo insBaseCostInfo){
        LambdaQueryWrapper<InsBaseCostInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseCostInfo.getId() != null) {
            queryWrapper.eq(InsBaseCostInfo::getId, insBaseCostInfo.getId());
        }
        if (StringUtil.isNotEmpty(insBaseCostInfo.getTenantId())) {
            queryWrapper.eq(InsBaseCostInfo::getTenantId, insBaseCostInfo.getTenantId());
        }
        if (insBaseCostInfo.getCorpId() != null) {
            queryWrapper.eq(InsBaseCostInfo::getCorpId, insBaseCostInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insBaseCostInfo.getCorpName())) {
            queryWrapper.eq(InsBaseCostInfo::getCorpName, insBaseCostInfo.getCorpName());
        }
        if (insBaseCostInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsBaseCostInfo::getInstitutionId, insBaseCostInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insBaseCostInfo.getInstitutionName())) {
            queryWrapper.eq(InsBaseCostInfo::getInstitutionName, insBaseCostInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insBaseCostInfo.getCostCode())) {
            queryWrapper.eq(InsBaseCostInfo::getCostCode, insBaseCostInfo.getCostCode());
        }
        if (StringUtil.isNotEmpty(insBaseCostInfo.getCostName())) {
            queryWrapper.eq(InsBaseCostInfo::getCostName, insBaseCostInfo.getCostName());
        }
        if (insBaseCostInfo.getCostType() != null) {
            queryWrapper.eq(InsBaseCostInfo::getCostType, insBaseCostInfo.getCostType());
        }
        if (insBaseCostInfo.getCostMode() != null) {
            queryWrapper.eq(InsBaseCostInfo::getCostMode, insBaseCostInfo.getCostMode());
        }
        if (insBaseCostInfo.getIsRefund() != null) {
            queryWrapper.eq(InsBaseCostInfo::getIsRefund, insBaseCostInfo.getIsRefund());
        }
        if (StringUtil.isNotEmpty(insBaseCostInfo.getRemark())) {
            queryWrapper.eq(InsBaseCostInfo::getRemark, insBaseCostInfo.getRemark());
        }
        if (insBaseCostInfo.getCreateUser() != null) {
            queryWrapper.eq(InsBaseCostInfo::getCreateUser, insBaseCostInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseCostInfo.getCreateName())) {
            queryWrapper.eq(InsBaseCostInfo::getCreateName, insBaseCostInfo.getCreateName());
        }
        if (insBaseCostInfo.getCreateDept() != null) {
            queryWrapper.eq(InsBaseCostInfo::getCreateDept, insBaseCostInfo.getCreateDept());
        }
        if (insBaseCostInfo.getCreateTime() != null) {
            queryWrapper.eq(InsBaseCostInfo::getCreateTime, insBaseCostInfo.getCreateTime());
        }
        if (insBaseCostInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseCostInfo::getUpdateUser, insBaseCostInfo.getUpdateUser());
        }
        if (insBaseCostInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseCostInfo::getUpdateTime, insBaseCostInfo.getUpdateTime());
        }
        if (insBaseCostInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseCostInfo::getIsDeleted, insBaseCostInfo.getIsDeleted());
        }
        if (insBaseCostInfo.getStatus() != null) {
            queryWrapper.eq(InsBaseCostInfo::getStatus, insBaseCostInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseCostInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseCostInfo insert(InsBaseCostInfo insBaseCostInfo) {
        insBaseCostInfo.setId(null);
        getBaseMapper().insert(insBaseCostInfo);
        return insBaseCostInfo;
    }

    /**
    * 更新数据
    *
    * @param insBaseCostInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseCostInfo update(InsBaseCostInfo insBaseCostInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseCostInfo> chainWrapper = new LambdaUpdateChainWrapper<InsBaseCostInfo>(getBaseMapper());
        if (insBaseCostInfo.getId() != null) {
            chainWrapper.set(InsBaseCostInfo::getId, insBaseCostInfo.getId());
        }
        if (StringUtil.isNotBlank(insBaseCostInfo.getTenantId())) {
            chainWrapper.set(InsBaseCostInfo::getTenantId, insBaseCostInfo.getTenantId());
        }
        if (insBaseCostInfo.getCorpId() != null) {
            chainWrapper.set(InsBaseCostInfo::getCorpId, insBaseCostInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insBaseCostInfo.getCorpName())) {
            chainWrapper.set(InsBaseCostInfo::getCorpName, insBaseCostInfo.getCorpName());
        }
        if (insBaseCostInfo.getInstitutionId() != null) {
            chainWrapper.set(InsBaseCostInfo::getInstitutionId, insBaseCostInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insBaseCostInfo.getInstitutionName())) {
            chainWrapper.set(InsBaseCostInfo::getInstitutionName, insBaseCostInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insBaseCostInfo.getCostCode())) {
            chainWrapper.set(InsBaseCostInfo::getCostCode, insBaseCostInfo.getCostCode());
        }
        if (StringUtil.isNotBlank(insBaseCostInfo.getCostName())) {
            chainWrapper.set(InsBaseCostInfo::getCostName, insBaseCostInfo.getCostName());
        }
        if (insBaseCostInfo.getCostType() != null) {
            chainWrapper.set(InsBaseCostInfo::getCostType, insBaseCostInfo.getCostType());
        }
        if (insBaseCostInfo.getCostMode() != null) {
            chainWrapper.set(InsBaseCostInfo::getCostMode, insBaseCostInfo.getCostMode());
        }
        if (insBaseCostInfo.getIsRefund() != null) {
            chainWrapper.set(InsBaseCostInfo::getIsRefund, insBaseCostInfo.getIsRefund());
        }
        if (StringUtil.isNotBlank(insBaseCostInfo.getRemark())) {
            chainWrapper.set(InsBaseCostInfo::getRemark, insBaseCostInfo.getRemark());
        }
        if (insBaseCostInfo.getCreateUser() != null) {
            chainWrapper.set(InsBaseCostInfo::getCreateUser, insBaseCostInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseCostInfo.getCreateName())) {
            chainWrapper.set(InsBaseCostInfo::getCreateName, insBaseCostInfo.getCreateName());
        }
        if (insBaseCostInfo.getCreateDept() != null) {
            chainWrapper.set(InsBaseCostInfo::getCreateDept, insBaseCostInfo.getCreateDept());
        }
        if (insBaseCostInfo.getCreateTime() != null) {
            chainWrapper.set(InsBaseCostInfo::getCreateTime, insBaseCostInfo.getCreateTime());
        }
        if (insBaseCostInfo.getUpdateUser() != null) {
            chainWrapper.set(InsBaseCostInfo::getUpdateUser, insBaseCostInfo.getUpdateUser());
        }
        if (insBaseCostInfo.getUpdateTime() != null) {
            chainWrapper.set(InsBaseCostInfo::getUpdateTime, insBaseCostInfo.getUpdateTime());
        }
        if (insBaseCostInfo.getIsDeleted() != null) {
            chainWrapper.set(InsBaseCostInfo::getIsDeleted, insBaseCostInfo.getIsDeleted());
        }
        if (insBaseCostInfo.getStatus() != null) {
            chainWrapper.set(InsBaseCostInfo::getStatus, insBaseCostInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseCostInfo::getId, insBaseCostInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseCostInfo.getId());
        } else {
            return insBaseCostInfo;
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
    public boolean saveInsBaseCostInfoBatch(List<InsBaseCostInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseCostInfo insBaseCostInfo : insertList) {
            //使用默认的雪花算法生成
            insBaseCostInfo.setId(null);
            //insBaseCostInfo.setCreatedDt(currentDte);
            //insBaseCostInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseCostInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseCostInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


