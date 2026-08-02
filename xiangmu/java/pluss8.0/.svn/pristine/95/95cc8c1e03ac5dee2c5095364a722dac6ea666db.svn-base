package cn.pluss.platform.service.insBaseCostItemInfo.impl;

import cn.pluss.platform.mapper.InsBaseCostItemInfoMapper;
import cn.pluss.platform.model.entity.InsBaseCostItemInfo;
import cn.pluss.platform.service.insBaseCostItemInfo.InsBaseCostItemInfoService;
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
@Service("insBaseCostItemInfoService")
public class InsBaseCostItemInfoServiceImpl extends ServiceImpl< InsBaseCostItemInfoMapper, InsBaseCostItemInfo> implements InsBaseCostItemInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseCostItemInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseCostItemInfo> queryPage(Map map) {
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
    public InsBaseCostItemInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseCostItemInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseCostItemInfo queryOne(InsBaseCostItemInfo insBaseCostItemInfo){
        LambdaQueryWrapper<InsBaseCostItemInfo> queryWrapper = getQueryWrapper(insBaseCostItemInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseCostItemInfo
    * @return
    */
    @Override
    public List<InsBaseCostItemInfo> queryList(InsBaseCostItemInfo insBaseCostItemInfo) {
        LambdaQueryWrapper<InsBaseCostItemInfo> queryWrapper = getQueryWrapper(insBaseCostItemInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseCostItemInfo
    * @return
    */
    public static LambdaQueryWrapper<InsBaseCostItemInfo> getQueryWrapper(InsBaseCostItemInfo insBaseCostItemInfo){
        LambdaQueryWrapper<InsBaseCostItemInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseCostItemInfo.getId() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getId, insBaseCostItemInfo.getId());
        }
        if (StringUtil.isNotEmpty(insBaseCostItemInfo.getTenantId())) {
            queryWrapper.eq(InsBaseCostItemInfo::getTenantId, insBaseCostItemInfo.getTenantId());
        }
        if (insBaseCostItemInfo.getCorpId() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getCorpId, insBaseCostItemInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insBaseCostItemInfo.getCorpName())) {
            queryWrapper.eq(InsBaseCostItemInfo::getCorpName, insBaseCostItemInfo.getCorpName());
        }
        if (insBaseCostItemInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getInstitutionId, insBaseCostItemInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insBaseCostItemInfo.getInstitutionName())) {
            queryWrapper.eq(InsBaseCostItemInfo::getInstitutionName, insBaseCostItemInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insBaseCostItemInfo.getItemName())) {
            queryWrapper.eq(InsBaseCostItemInfo::getItemName, insBaseCostItemInfo.getItemName());
        }
        if (insBaseCostItemInfo.getItemDayPrice() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getItemDayPrice, insBaseCostItemInfo.getItemDayPrice());
        }
        if (insBaseCostItemInfo.getItemMonthPrice() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getItemMonthPrice, insBaseCostItemInfo.getItemMonthPrice());
        }
        if (insBaseCostItemInfo.getCostId() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getCostId, insBaseCostItemInfo.getCostId());
        }
        if (StringUtil.isNotEmpty(insBaseCostItemInfo.getCostCode())) {
            queryWrapper.eq(InsBaseCostItemInfo::getCostCode, insBaseCostItemInfo.getCostCode());
        }
        if (StringUtil.isNotEmpty(insBaseCostItemInfo.getCostName())) {
            queryWrapper.eq(InsBaseCostItemInfo::getCostName, insBaseCostItemInfo.getCostName());
        }
        if (insBaseCostItemInfo.getCostType() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getCostType, insBaseCostItemInfo.getCostType());
        }
        if (insBaseCostItemInfo.getCostMode() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getCostMode, insBaseCostItemInfo.getCostMode());
        }
        if (insBaseCostItemInfo.getIsRefund() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getIsRefund, insBaseCostItemInfo.getIsRefund());
        }
        if (StringUtil.isNotEmpty(insBaseCostItemInfo.getAbilityLevel())) {
            queryWrapper.eq(InsBaseCostItemInfo::getAbilityLevel, insBaseCostItemInfo.getAbilityLevel());
        }
        if (StringUtil.isNotEmpty(insBaseCostItemInfo.getRemark())) {
            queryWrapper.eq(InsBaseCostItemInfo::getRemark, insBaseCostItemInfo.getRemark());
        }
        if (insBaseCostItemInfo.getCreateUser() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getCreateUser, insBaseCostItemInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseCostItemInfo.getCreateName())) {
            queryWrapper.eq(InsBaseCostItemInfo::getCreateName, insBaseCostItemInfo.getCreateName());
        }
        if (insBaseCostItemInfo.getCreateDept() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getCreateDept, insBaseCostItemInfo.getCreateDept());
        }
        if (insBaseCostItemInfo.getCreateTime() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getCreateTime, insBaseCostItemInfo.getCreateTime());
        }
        if (insBaseCostItemInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getUpdateUser, insBaseCostItemInfo.getUpdateUser());
        }
        if (insBaseCostItemInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getUpdateTime, insBaseCostItemInfo.getUpdateTime());
        }
        if (insBaseCostItemInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getIsDeleted, insBaseCostItemInfo.getIsDeleted());
        }
        if (insBaseCostItemInfo.getStatus() != null) {
            queryWrapper.eq(InsBaseCostItemInfo::getStatus, insBaseCostItemInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseCostItemInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseCostItemInfo insert(InsBaseCostItemInfo insBaseCostItemInfo) {
        insBaseCostItemInfo.setId(null);
        getBaseMapper().insert(insBaseCostItemInfo);
        return insBaseCostItemInfo;
    }

    /**
    * 更新数据
    *
    * @param insBaseCostItemInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseCostItemInfo update(InsBaseCostItemInfo insBaseCostItemInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseCostItemInfo> chainWrapper = new LambdaUpdateChainWrapper<InsBaseCostItemInfo>(getBaseMapper());
        if (insBaseCostItemInfo.getId() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getId, insBaseCostItemInfo.getId());
        }
        if (StringUtil.isNotBlank(insBaseCostItemInfo.getTenantId())) {
            chainWrapper.set(InsBaseCostItemInfo::getTenantId, insBaseCostItemInfo.getTenantId());
        }
        if (insBaseCostItemInfo.getCorpId() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getCorpId, insBaseCostItemInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insBaseCostItemInfo.getCorpName())) {
            chainWrapper.set(InsBaseCostItemInfo::getCorpName, insBaseCostItemInfo.getCorpName());
        }
        if (insBaseCostItemInfo.getInstitutionId() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getInstitutionId, insBaseCostItemInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insBaseCostItemInfo.getInstitutionName())) {
            chainWrapper.set(InsBaseCostItemInfo::getInstitutionName, insBaseCostItemInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insBaseCostItemInfo.getItemName())) {
            chainWrapper.set(InsBaseCostItemInfo::getItemName, insBaseCostItemInfo.getItemName());
        }
        if (insBaseCostItemInfo.getItemDayPrice() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getItemDayPrice, insBaseCostItemInfo.getItemDayPrice());
        }
        if (insBaseCostItemInfo.getItemMonthPrice() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getItemMonthPrice, insBaseCostItemInfo.getItemMonthPrice());
        }
        if (insBaseCostItemInfo.getCostId() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getCostId, insBaseCostItemInfo.getCostId());
        }
        if (StringUtil.isNotBlank(insBaseCostItemInfo.getCostCode())) {
            chainWrapper.set(InsBaseCostItemInfo::getCostCode, insBaseCostItemInfo.getCostCode());
        }
        if (StringUtil.isNotBlank(insBaseCostItemInfo.getCostName())) {
            chainWrapper.set(InsBaseCostItemInfo::getCostName, insBaseCostItemInfo.getCostName());
        }
        if (insBaseCostItemInfo.getCostType() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getCostType, insBaseCostItemInfo.getCostType());
        }
        if (insBaseCostItemInfo.getCostMode() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getCostMode, insBaseCostItemInfo.getCostMode());
        }
        if (insBaseCostItemInfo.getIsRefund() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getIsRefund, insBaseCostItemInfo.getIsRefund());
        }
        if (StringUtil.isNotBlank(insBaseCostItemInfo.getAbilityLevel())) {
            chainWrapper.set(InsBaseCostItemInfo::getAbilityLevel, insBaseCostItemInfo.getAbilityLevel());
        }
        if (StringUtil.isNotBlank(insBaseCostItemInfo.getRemark())) {
            chainWrapper.set(InsBaseCostItemInfo::getRemark, insBaseCostItemInfo.getRemark());
        }
        if (insBaseCostItemInfo.getCreateUser() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getCreateUser, insBaseCostItemInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseCostItemInfo.getCreateName())) {
            chainWrapper.set(InsBaseCostItemInfo::getCreateName, insBaseCostItemInfo.getCreateName());
        }
        if (insBaseCostItemInfo.getCreateDept() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getCreateDept, insBaseCostItemInfo.getCreateDept());
        }
        if (insBaseCostItemInfo.getCreateTime() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getCreateTime, insBaseCostItemInfo.getCreateTime());
        }
        if (insBaseCostItemInfo.getUpdateUser() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getUpdateUser, insBaseCostItemInfo.getUpdateUser());
        }
        if (insBaseCostItemInfo.getUpdateTime() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getUpdateTime, insBaseCostItemInfo.getUpdateTime());
        }
        if (insBaseCostItemInfo.getIsDeleted() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getIsDeleted, insBaseCostItemInfo.getIsDeleted());
        }
        if (insBaseCostItemInfo.getStatus() != null) {
            chainWrapper.set(InsBaseCostItemInfo::getStatus, insBaseCostItemInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseCostItemInfo::getId, insBaseCostItemInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseCostItemInfo.getId());
        } else {
            return insBaseCostItemInfo;
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
    public boolean saveInsBaseCostItemInfoBatch(List<InsBaseCostItemInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseCostItemInfo insBaseCostItemInfo : insertList) {
            //使用默认的雪花算法生成
            insBaseCostItemInfo.setId(null);
            //insBaseCostItemInfo.setCreatedDt(currentDte);
            //insBaseCostItemInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseCostItemInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseCostItemInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


