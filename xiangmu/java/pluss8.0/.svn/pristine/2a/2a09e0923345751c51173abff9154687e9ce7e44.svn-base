package cn.pluss.platform.service.insLogisticsOutboundInfo.impl;

import cn.pluss.platform.mapper.InsLogisticsOutboundInfoMapper;
import cn.pluss.platform.model.entity.InsLogisticsOutboundInfo;
import cn.pluss.platform.service.insLogisticsOutboundInfo.InsLogisticsOutboundInfoService;
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
@Service("insLogisticsOutboundInfoService")
public class InsLogisticsOutboundInfoServiceImpl extends ServiceImpl< InsLogisticsOutboundInfoMapper, InsLogisticsOutboundInfo> implements InsLogisticsOutboundInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsOutboundInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsOutboundInfo> queryPage(Map map) {
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
    public InsLogisticsOutboundInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsOutboundInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsOutboundInfo queryOne(InsLogisticsOutboundInfo insLogisticsOutboundInfo){
        LambdaQueryWrapper<InsLogisticsOutboundInfo> queryWrapper = getQueryWrapper(insLogisticsOutboundInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsOutboundInfo
    * @return
    */
    @Override
    public List<InsLogisticsOutboundInfo> queryList(InsLogisticsOutboundInfo insLogisticsOutboundInfo) {
        LambdaQueryWrapper<InsLogisticsOutboundInfo> queryWrapper = getQueryWrapper(insLogisticsOutboundInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsOutboundInfo
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsOutboundInfo> getQueryWrapper(InsLogisticsOutboundInfo insLogisticsOutboundInfo){
        LambdaQueryWrapper<InsLogisticsOutboundInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsOutboundInfo.getId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getId, insLogisticsOutboundInfo.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getTenantId())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getTenantId, insLogisticsOutboundInfo.getTenantId());
        }
        if (insLogisticsOutboundInfo.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCorpId, insLogisticsOutboundInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getCorpName())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCorpName, insLogisticsOutboundInfo.getCorpName());
        }
        if (insLogisticsOutboundInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getInstitutionId, insLogisticsOutboundInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getInstitutionName, insLogisticsOutboundInfo.getInstitutionName());
        }
        if (insLogisticsOutboundInfo.getOutboundDate() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getOutboundDate, insLogisticsOutboundInfo.getOutboundDate());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getOutboundCode())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getOutboundCode, insLogisticsOutboundInfo.getOutboundCode());
        }
        if (insLogisticsOutboundInfo.getCkType() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCkType, insLogisticsOutboundInfo.getCkType());
        }
        if (insLogisticsOutboundInfo.getWarehouseId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getWarehouseId, insLogisticsOutboundInfo.getWarehouseId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getWarehouseName())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getWarehouseName, insLogisticsOutboundInfo.getWarehouseName());
        }
        if (insLogisticsOutboundInfo.getNeckType() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getNeckType, insLogisticsOutboundInfo.getNeckType());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getNeckDepartment())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getNeckDepartment, insLogisticsOutboundInfo.getNeckDepartment());
        }
        if (insLogisticsOutboundInfo.getNeckId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getNeckId, insLogisticsOutboundInfo.getNeckId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getNeckName())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getNeckName, insLogisticsOutboundInfo.getNeckName());
        }
        if (insLogisticsOutboundInfo.getOutboundAmount() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getOutboundAmount, insLogisticsOutboundInfo.getOutboundAmount());
        }
        if (insLogisticsOutboundInfo.getCkState() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCkState, insLogisticsOutboundInfo.getCkState());
        }
        if (insLogisticsOutboundInfo.getAuditState() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getAuditState, insLogisticsOutboundInfo.getAuditState());
        }
        if (insLogisticsOutboundInfo.getAuditId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getAuditId, insLogisticsOutboundInfo.getAuditId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getAuditName())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getAuditName, insLogisticsOutboundInfo.getAuditName());
        }
        if (insLogisticsOutboundInfo.getAuditTime() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getAuditTime, insLogisticsOutboundInfo.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getAuditMemo())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getAuditMemo, insLogisticsOutboundInfo.getAuditMemo());
        }
        if (insLogisticsOutboundInfo.getOrderId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getOrderId, insLogisticsOutboundInfo.getOrderId());
        }
        if (insLogisticsOutboundInfo.getCheckId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCheckId, insLogisticsOutboundInfo.getCheckId());
        }
        if (insLogisticsOutboundInfo.getCheckDate() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCheckDate, insLogisticsOutboundInfo.getCheckDate());
        }
        if (insLogisticsOutboundInfo.getElderId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getElderId, insLogisticsOutboundInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getElderName())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getElderName, insLogisticsOutboundInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getIdCard())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getIdCard, insLogisticsOutboundInfo.getIdCard());
        }
        if (insLogisticsOutboundInfo.getRecoveryStatus() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getRecoveryStatus, insLogisticsOutboundInfo.getRecoveryStatus());
        }
        if (insLogisticsOutboundInfo.getRecoveryTime() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getRecoveryTime, insLogisticsOutboundInfo.getRecoveryTime());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getRemark())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getRemark, insLogisticsOutboundInfo.getRemark());
        }
        if (insLogisticsOutboundInfo.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCreateUser, insLogisticsOutboundInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfo.getCreateName())) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCreateName, insLogisticsOutboundInfo.getCreateName());
        }
        if (insLogisticsOutboundInfo.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCreateDept, insLogisticsOutboundInfo.getCreateDept());
        }
        if (insLogisticsOutboundInfo.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getCreateTime, insLogisticsOutboundInfo.getCreateTime());
        }
        if (insLogisticsOutboundInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getUpdateUser, insLogisticsOutboundInfo.getUpdateUser());
        }
        if (insLogisticsOutboundInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getUpdateTime, insLogisticsOutboundInfo.getUpdateTime());
        }
        if (insLogisticsOutboundInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getIsDeleted, insLogisticsOutboundInfo.getIsDeleted());
        }
        if (insLogisticsOutboundInfo.getStatus() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfo::getStatus, insLogisticsOutboundInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsOutboundInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOutboundInfo insert(InsLogisticsOutboundInfo insLogisticsOutboundInfo) {
        insLogisticsOutboundInfo.setId(null);
        getBaseMapper().insert(insLogisticsOutboundInfo);
        return insLogisticsOutboundInfo;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsOutboundInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOutboundInfo update(InsLogisticsOutboundInfo insLogisticsOutboundInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsOutboundInfo> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsOutboundInfo>(getBaseMapper());
        if (insLogisticsOutboundInfo.getId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getId, insLogisticsOutboundInfo.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getTenantId())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getTenantId, insLogisticsOutboundInfo.getTenantId());
        }
        if (insLogisticsOutboundInfo.getCorpId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCorpId, insLogisticsOutboundInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getCorpName())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCorpName, insLogisticsOutboundInfo.getCorpName());
        }
        if (insLogisticsOutboundInfo.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getInstitutionId, insLogisticsOutboundInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getInstitutionName())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getInstitutionName, insLogisticsOutboundInfo.getInstitutionName());
        }
        if (insLogisticsOutboundInfo.getOutboundDate() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getOutboundDate, insLogisticsOutboundInfo.getOutboundDate());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getOutboundCode())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getOutboundCode, insLogisticsOutboundInfo.getOutboundCode());
        }
        if (insLogisticsOutboundInfo.getCkType() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCkType, insLogisticsOutboundInfo.getCkType());
        }
        if (insLogisticsOutboundInfo.getWarehouseId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getWarehouseId, insLogisticsOutboundInfo.getWarehouseId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getWarehouseName())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getWarehouseName, insLogisticsOutboundInfo.getWarehouseName());
        }
        if (insLogisticsOutboundInfo.getNeckType() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getNeckType, insLogisticsOutboundInfo.getNeckType());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getNeckDepartment())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getNeckDepartment, insLogisticsOutboundInfo.getNeckDepartment());
        }
        if (insLogisticsOutboundInfo.getNeckId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getNeckId, insLogisticsOutboundInfo.getNeckId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getNeckName())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getNeckName, insLogisticsOutboundInfo.getNeckName());
        }
        if (insLogisticsOutboundInfo.getOutboundAmount() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getOutboundAmount, insLogisticsOutboundInfo.getOutboundAmount());
        }
        if (insLogisticsOutboundInfo.getCkState() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCkState, insLogisticsOutboundInfo.getCkState());
        }
        if (insLogisticsOutboundInfo.getAuditState() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getAuditState, insLogisticsOutboundInfo.getAuditState());
        }
        if (insLogisticsOutboundInfo.getAuditId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getAuditId, insLogisticsOutboundInfo.getAuditId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getAuditName())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getAuditName, insLogisticsOutboundInfo.getAuditName());
        }
        if (insLogisticsOutboundInfo.getAuditTime() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getAuditTime, insLogisticsOutboundInfo.getAuditTime());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getAuditMemo())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getAuditMemo, insLogisticsOutboundInfo.getAuditMemo());
        }
        if (insLogisticsOutboundInfo.getOrderId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getOrderId, insLogisticsOutboundInfo.getOrderId());
        }
        if (insLogisticsOutboundInfo.getCheckId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCheckId, insLogisticsOutboundInfo.getCheckId());
        }
        if (insLogisticsOutboundInfo.getCheckDate() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCheckDate, insLogisticsOutboundInfo.getCheckDate());
        }
        if (insLogisticsOutboundInfo.getElderId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getElderId, insLogisticsOutboundInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getElderName())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getElderName, insLogisticsOutboundInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getIdCard())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getIdCard, insLogisticsOutboundInfo.getIdCard());
        }
        if (insLogisticsOutboundInfo.getRecoveryStatus() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getRecoveryStatus, insLogisticsOutboundInfo.getRecoveryStatus());
        }
        if (insLogisticsOutboundInfo.getRecoveryTime() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getRecoveryTime, insLogisticsOutboundInfo.getRecoveryTime());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getRemark())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getRemark, insLogisticsOutboundInfo.getRemark());
        }
        if (insLogisticsOutboundInfo.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCreateUser, insLogisticsOutboundInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfo.getCreateName())) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCreateName, insLogisticsOutboundInfo.getCreateName());
        }
        if (insLogisticsOutboundInfo.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCreateDept, insLogisticsOutboundInfo.getCreateDept());
        }
        if (insLogisticsOutboundInfo.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getCreateTime, insLogisticsOutboundInfo.getCreateTime());
        }
        if (insLogisticsOutboundInfo.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getUpdateUser, insLogisticsOutboundInfo.getUpdateUser());
        }
        if (insLogisticsOutboundInfo.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getUpdateTime, insLogisticsOutboundInfo.getUpdateTime());
        }
        if (insLogisticsOutboundInfo.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getIsDeleted, insLogisticsOutboundInfo.getIsDeleted());
        }
        if (insLogisticsOutboundInfo.getStatus() != null) {
            chainWrapper.set(InsLogisticsOutboundInfo::getStatus, insLogisticsOutboundInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsOutboundInfo::getId, insLogisticsOutboundInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsOutboundInfo.getId());
        } else {
            return insLogisticsOutboundInfo;
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
    public boolean saveInsLogisticsOutboundInfoBatch(List<InsLogisticsOutboundInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsOutboundInfo insLogisticsOutboundInfo : insertList) {
            //使用默认的雪花算法生成
            insLogisticsOutboundInfo.setId(null);
            //insLogisticsOutboundInfo.setCreatedDt(currentDte);
            //insLogisticsOutboundInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsOutboundInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsOutboundInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


