package cn.pluss.platform.service.insLogisticsProcureInfo.impl;

import cn.pluss.platform.mapper.InsLogisticsProcureInfoMapper;
import cn.pluss.platform.model.entity.InsLogisticsProcureInfo;
import cn.pluss.platform.service.insLogisticsProcureInfo.InsLogisticsProcureInfoService;
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
@Service("insLogisticsProcureInfoService")
public class InsLogisticsProcureInfoServiceImpl extends ServiceImpl< InsLogisticsProcureInfoMapper, InsLogisticsProcureInfo> implements InsLogisticsProcureInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsProcureInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsProcureInfo> queryPage(Map map) {
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
    public InsLogisticsProcureInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsProcureInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsProcureInfo queryOne(InsLogisticsProcureInfo insLogisticsProcureInfo){
        LambdaQueryWrapper<InsLogisticsProcureInfo> queryWrapper = getQueryWrapper(insLogisticsProcureInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsProcureInfo
    * @return
    */
    @Override
    public List<InsLogisticsProcureInfo> queryList(InsLogisticsProcureInfo insLogisticsProcureInfo) {
        LambdaQueryWrapper<InsLogisticsProcureInfo> queryWrapper = getQueryWrapper(insLogisticsProcureInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsProcureInfo
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsProcureInfo> getQueryWrapper(InsLogisticsProcureInfo insLogisticsProcureInfo){
        LambdaQueryWrapper<InsLogisticsProcureInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsProcureInfo.getId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getId, insLogisticsProcureInfo.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getTenantId())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getTenantId, insLogisticsProcureInfo.getTenantId());
        }
        if (insLogisticsProcureInfo.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getCorpId, insLogisticsProcureInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getCorpName())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getCorpName, insLogisticsProcureInfo.getCorpName());
        }
        if (insLogisticsProcureInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getInstitutionId, insLogisticsProcureInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getInstitutionName, insLogisticsProcureInfo.getInstitutionName());
        }
        if (insLogisticsProcureInfo.getProcureDate() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getProcureDate, insLogisticsProcureInfo.getProcureDate());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getProcureCode())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getProcureCode, insLogisticsProcureInfo.getProcureCode());
        }
        if (insLogisticsProcureInfo.getRkType() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getRkType, insLogisticsProcureInfo.getRkType());
        }
        if (insLogisticsProcureInfo.getSupplierId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getSupplierId, insLogisticsProcureInfo.getSupplierId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getSupplierName())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getSupplierName, insLogisticsProcureInfo.getSupplierName());
        }
        if (insLogisticsProcureInfo.getWarehouseId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getWarehouseId, insLogisticsProcureInfo.getWarehouseId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getWarehouseName())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getWarehouseName, insLogisticsProcureInfo.getWarehouseName());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getProcureUser())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getProcureUser, insLogisticsProcureInfo.getProcureUser());
        }
        if (insLogisticsProcureInfo.getProcureAmount() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getProcureAmount, insLogisticsProcureInfo.getProcureAmount());
        }
        if (insLogisticsProcureInfo.getRkState() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getRkState, insLogisticsProcureInfo.getRkState());
        }
        if (insLogisticsProcureInfo.getAuditState() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getAuditState, insLogisticsProcureInfo.getAuditState());
        }
        if (insLogisticsProcureInfo.getAuditId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getAuditId, insLogisticsProcureInfo.getAuditId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getAuditName())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getAuditName, insLogisticsProcureInfo.getAuditName());
        }
        if (insLogisticsProcureInfo.getAuditTime() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getAuditTime, insLogisticsProcureInfo.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getAuditMemo())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getAuditMemo, insLogisticsProcureInfo.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getRemark())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getRemark, insLogisticsProcureInfo.getRemark());
        }
        if (insLogisticsProcureInfo.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getCreateUser, insLogisticsProcureInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfo.getCreateName())) {
            queryWrapper.eq(InsLogisticsProcureInfo::getCreateName, insLogisticsProcureInfo.getCreateName());
        }
        if (insLogisticsProcureInfo.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getCreateDept, insLogisticsProcureInfo.getCreateDept());
        }
        if (insLogisticsProcureInfo.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getCreateTime, insLogisticsProcureInfo.getCreateTime());
        }
        if (insLogisticsProcureInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getUpdateUser, insLogisticsProcureInfo.getUpdateUser());
        }
        if (insLogisticsProcureInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getUpdateTime, insLogisticsProcureInfo.getUpdateTime());
        }
        if (insLogisticsProcureInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getIsDeleted, insLogisticsProcureInfo.getIsDeleted());
        }
        if (insLogisticsProcureInfo.getStatus() != null) {
            queryWrapper.eq(InsLogisticsProcureInfo::getStatus, insLogisticsProcureInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsProcureInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsProcureInfo insert(InsLogisticsProcureInfo insLogisticsProcureInfo) {
        insLogisticsProcureInfo.setId(null);
        getBaseMapper().insert(insLogisticsProcureInfo);
        return insLogisticsProcureInfo;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsProcureInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsProcureInfo update(InsLogisticsProcureInfo insLogisticsProcureInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsProcureInfo> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsProcureInfo>(getBaseMapper());
        if (insLogisticsProcureInfo.getId() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getId, insLogisticsProcureInfo.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getTenantId())) {
            chainWrapper.set(InsLogisticsProcureInfo::getTenantId, insLogisticsProcureInfo.getTenantId());
        }
        if (insLogisticsProcureInfo.getCorpId() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getCorpId, insLogisticsProcureInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getCorpName())) {
            chainWrapper.set(InsLogisticsProcureInfo::getCorpName, insLogisticsProcureInfo.getCorpName());
        }
        if (insLogisticsProcureInfo.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getInstitutionId, insLogisticsProcureInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getInstitutionName())) {
            chainWrapper.set(InsLogisticsProcureInfo::getInstitutionName, insLogisticsProcureInfo.getInstitutionName());
        }
        if (insLogisticsProcureInfo.getProcureDate() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getProcureDate, insLogisticsProcureInfo.getProcureDate());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getProcureCode())) {
            chainWrapper.set(InsLogisticsProcureInfo::getProcureCode, insLogisticsProcureInfo.getProcureCode());
        }
        if (insLogisticsProcureInfo.getRkType() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getRkType, insLogisticsProcureInfo.getRkType());
        }
        if (insLogisticsProcureInfo.getSupplierId() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getSupplierId, insLogisticsProcureInfo.getSupplierId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getSupplierName())) {
            chainWrapper.set(InsLogisticsProcureInfo::getSupplierName, insLogisticsProcureInfo.getSupplierName());
        }
        if (insLogisticsProcureInfo.getWarehouseId() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getWarehouseId, insLogisticsProcureInfo.getWarehouseId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getWarehouseName())) {
            chainWrapper.set(InsLogisticsProcureInfo::getWarehouseName, insLogisticsProcureInfo.getWarehouseName());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getProcureUser())) {
            chainWrapper.set(InsLogisticsProcureInfo::getProcureUser, insLogisticsProcureInfo.getProcureUser());
        }
        if (insLogisticsProcureInfo.getProcureAmount() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getProcureAmount, insLogisticsProcureInfo.getProcureAmount());
        }
        if (insLogisticsProcureInfo.getRkState() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getRkState, insLogisticsProcureInfo.getRkState());
        }
        if (insLogisticsProcureInfo.getAuditState() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getAuditState, insLogisticsProcureInfo.getAuditState());
        }
        if (insLogisticsProcureInfo.getAuditId() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getAuditId, insLogisticsProcureInfo.getAuditId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getAuditName())) {
            chainWrapper.set(InsLogisticsProcureInfo::getAuditName, insLogisticsProcureInfo.getAuditName());
        }
        if (insLogisticsProcureInfo.getAuditTime() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getAuditTime, insLogisticsProcureInfo.getAuditTime());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getAuditMemo())) {
            chainWrapper.set(InsLogisticsProcureInfo::getAuditMemo, insLogisticsProcureInfo.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getRemark())) {
            chainWrapper.set(InsLogisticsProcureInfo::getRemark, insLogisticsProcureInfo.getRemark());
        }
        if (insLogisticsProcureInfo.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getCreateUser, insLogisticsProcureInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfo.getCreateName())) {
            chainWrapper.set(InsLogisticsProcureInfo::getCreateName, insLogisticsProcureInfo.getCreateName());
        }
        if (insLogisticsProcureInfo.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getCreateDept, insLogisticsProcureInfo.getCreateDept());
        }
        if (insLogisticsProcureInfo.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getCreateTime, insLogisticsProcureInfo.getCreateTime());
        }
        if (insLogisticsProcureInfo.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getUpdateUser, insLogisticsProcureInfo.getUpdateUser());
        }
        if (insLogisticsProcureInfo.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getUpdateTime, insLogisticsProcureInfo.getUpdateTime());
        }
        if (insLogisticsProcureInfo.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getIsDeleted, insLogisticsProcureInfo.getIsDeleted());
        }
        if (insLogisticsProcureInfo.getStatus() != null) {
            chainWrapper.set(InsLogisticsProcureInfo::getStatus, insLogisticsProcureInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsProcureInfo::getId, insLogisticsProcureInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsProcureInfo.getId());
        } else {
            return insLogisticsProcureInfo;
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
    public boolean saveInsLogisticsProcureInfoBatch(List<InsLogisticsProcureInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsProcureInfo insLogisticsProcureInfo : insertList) {
            //使用默认的雪花算法生成
            insLogisticsProcureInfo.setId(null);
            //insLogisticsProcureInfo.setCreatedDt(currentDte);
            //insLogisticsProcureInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsProcureInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsProcureInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


