package cn.pluss.platform.service.insVegetableOrderInfo.impl;

import cn.pluss.platform.mapper.InsVegetableOrderInfoMapper;
import cn.pluss.platform.model.entity.InsVegetableOrderInfo;
import cn.pluss.platform.service.insVegetableOrderInfo.InsVegetableOrderInfoService;
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
@Service("insVegetableOrderInfoService")
public class InsVegetableOrderInfoServiceImpl extends ServiceImpl< InsVegetableOrderInfoMapper, InsVegetableOrderInfo> implements InsVegetableOrderInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsVegetableOrderInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsVegetableOrderInfo> queryPage(Map map) {
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
    public InsVegetableOrderInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insVegetableOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsVegetableOrderInfo queryOne(InsVegetableOrderInfo insVegetableOrderInfo){
        LambdaQueryWrapper<InsVegetableOrderInfo> queryWrapper = getQueryWrapper(insVegetableOrderInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insVegetableOrderInfo
    * @return
    */
    @Override
    public List<InsVegetableOrderInfo> queryList(InsVegetableOrderInfo insVegetableOrderInfo) {
        LambdaQueryWrapper<InsVegetableOrderInfo> queryWrapper = getQueryWrapper(insVegetableOrderInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insVegetableOrderInfo
    * @return
    */
    public static LambdaQueryWrapper<InsVegetableOrderInfo> getQueryWrapper(InsVegetableOrderInfo insVegetableOrderInfo){
        LambdaQueryWrapper<InsVegetableOrderInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insVegetableOrderInfo.getId() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getId, insVegetableOrderInfo.getId());
        }
        if (StringUtil.isNotEmpty(insVegetableOrderInfo.getTenantId())) {
            queryWrapper.eq(InsVegetableOrderInfo::getTenantId, insVegetableOrderInfo.getTenantId());
        }
        if (insVegetableOrderInfo.getCorpId() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getCorpId, insVegetableOrderInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insVegetableOrderInfo.getCorpName())) {
            queryWrapper.eq(InsVegetableOrderInfo::getCorpName, insVegetableOrderInfo.getCorpName());
        }
        if (insVegetableOrderInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getInstitutionId, insVegetableOrderInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insVegetableOrderInfo.getInstitutionName())) {
            queryWrapper.eq(InsVegetableOrderInfo::getInstitutionName, insVegetableOrderInfo.getInstitutionName());
        }
        if (insVegetableOrderInfo.getTypeId() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getTypeId, insVegetableOrderInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(insVegetableOrderInfo.getTypeName())) {
            queryWrapper.eq(InsVegetableOrderInfo::getTypeName, insVegetableOrderInfo.getTypeName());
        }
        if (StringUtil.isNotEmpty(insVegetableOrderInfo.getVegetableName())) {
            queryWrapper.eq(InsVegetableOrderInfo::getVegetableName, insVegetableOrderInfo.getVegetableName());
        }
        if (StringUtil.isNotEmpty(insVegetableOrderInfo.getPurchaseName())) {
            queryWrapper.eq(InsVegetableOrderInfo::getPurchaseName, insVegetableOrderInfo.getPurchaseName());
        }
        if (insVegetableOrderInfo.getPurchaseAmount() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getPurchaseAmount, insVegetableOrderInfo.getPurchaseAmount());
        }
        if (insVegetableOrderInfo.getPurchaseTime() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getPurchaseTime, insVegetableOrderInfo.getPurchaseTime());
        }
        if (StringUtil.isNotEmpty(insVegetableOrderInfo.getRemark())) {
            queryWrapper.eq(InsVegetableOrderInfo::getRemark, insVegetableOrderInfo.getRemark());
        }
        if (insVegetableOrderInfo.getCreateUser() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getCreateUser, insVegetableOrderInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insVegetableOrderInfo.getCreateName())) {
            queryWrapper.eq(InsVegetableOrderInfo::getCreateName, insVegetableOrderInfo.getCreateName());
        }
        if (insVegetableOrderInfo.getCreateDept() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getCreateDept, insVegetableOrderInfo.getCreateDept());
        }
        if (insVegetableOrderInfo.getCreateTime() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getCreateTime, insVegetableOrderInfo.getCreateTime());
        }
        if (insVegetableOrderInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getUpdateUser, insVegetableOrderInfo.getUpdateUser());
        }
        if (insVegetableOrderInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getUpdateTime, insVegetableOrderInfo.getUpdateTime());
        }
        if (insVegetableOrderInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getIsDeleted, insVegetableOrderInfo.getIsDeleted());
        }
        if (insVegetableOrderInfo.getStatus() != null) {
            queryWrapper.eq(InsVegetableOrderInfo::getStatus, insVegetableOrderInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insVegetableOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsVegetableOrderInfo insert(InsVegetableOrderInfo insVegetableOrderInfo) {
        insVegetableOrderInfo.setId(null);
        getBaseMapper().insert(insVegetableOrderInfo);
        return insVegetableOrderInfo;
    }

    /**
    * 更新数据
    *
    * @param insVegetableOrderInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsVegetableOrderInfo update(InsVegetableOrderInfo insVegetableOrderInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsVegetableOrderInfo> chainWrapper = new LambdaUpdateChainWrapper<InsVegetableOrderInfo>(getBaseMapper());
        if (insVegetableOrderInfo.getId() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getId, insVegetableOrderInfo.getId());
        }
        if (StringUtil.isNotBlank(insVegetableOrderInfo.getTenantId())) {
            chainWrapper.set(InsVegetableOrderInfo::getTenantId, insVegetableOrderInfo.getTenantId());
        }
        if (insVegetableOrderInfo.getCorpId() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getCorpId, insVegetableOrderInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insVegetableOrderInfo.getCorpName())) {
            chainWrapper.set(InsVegetableOrderInfo::getCorpName, insVegetableOrderInfo.getCorpName());
        }
        if (insVegetableOrderInfo.getInstitutionId() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getInstitutionId, insVegetableOrderInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insVegetableOrderInfo.getInstitutionName())) {
            chainWrapper.set(InsVegetableOrderInfo::getInstitutionName, insVegetableOrderInfo.getInstitutionName());
        }
        if (insVegetableOrderInfo.getTypeId() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getTypeId, insVegetableOrderInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(insVegetableOrderInfo.getTypeName())) {
            chainWrapper.set(InsVegetableOrderInfo::getTypeName, insVegetableOrderInfo.getTypeName());
        }
        if (StringUtil.isNotBlank(insVegetableOrderInfo.getVegetableName())) {
            chainWrapper.set(InsVegetableOrderInfo::getVegetableName, insVegetableOrderInfo.getVegetableName());
        }
        if (StringUtil.isNotBlank(insVegetableOrderInfo.getPurchaseName())) {
            chainWrapper.set(InsVegetableOrderInfo::getPurchaseName, insVegetableOrderInfo.getPurchaseName());
        }
        if (insVegetableOrderInfo.getPurchaseAmount() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getPurchaseAmount, insVegetableOrderInfo.getPurchaseAmount());
        }
        if (insVegetableOrderInfo.getPurchaseTime() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getPurchaseTime, insVegetableOrderInfo.getPurchaseTime());
        }
        if (StringUtil.isNotBlank(insVegetableOrderInfo.getRemark())) {
            chainWrapper.set(InsVegetableOrderInfo::getRemark, insVegetableOrderInfo.getRemark());
        }
        if (insVegetableOrderInfo.getCreateUser() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getCreateUser, insVegetableOrderInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insVegetableOrderInfo.getCreateName())) {
            chainWrapper.set(InsVegetableOrderInfo::getCreateName, insVegetableOrderInfo.getCreateName());
        }
        if (insVegetableOrderInfo.getCreateDept() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getCreateDept, insVegetableOrderInfo.getCreateDept());
        }
        if (insVegetableOrderInfo.getCreateTime() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getCreateTime, insVegetableOrderInfo.getCreateTime());
        }
        if (insVegetableOrderInfo.getUpdateUser() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getUpdateUser, insVegetableOrderInfo.getUpdateUser());
        }
        if (insVegetableOrderInfo.getUpdateTime() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getUpdateTime, insVegetableOrderInfo.getUpdateTime());
        }
        if (insVegetableOrderInfo.getIsDeleted() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getIsDeleted, insVegetableOrderInfo.getIsDeleted());
        }
        if (insVegetableOrderInfo.getStatus() != null) {
            chainWrapper.set(InsVegetableOrderInfo::getStatus, insVegetableOrderInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsVegetableOrderInfo::getId, insVegetableOrderInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insVegetableOrderInfo.getId());
        } else {
            return insVegetableOrderInfo;
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
    public boolean saveInsVegetableOrderInfoBatch(List<InsVegetableOrderInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsVegetableOrderInfo insVegetableOrderInfo : insertList) {
            //使用默认的雪花算法生成
            insVegetableOrderInfo.setId(null);
            //insVegetableOrderInfo.setCreatedDt(currentDte);
            //insVegetableOrderInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsVegetableOrderInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsVegetableOrderInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


