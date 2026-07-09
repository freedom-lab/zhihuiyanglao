package cn.pluss.platform.service.insLogisticsTransferInfo.impl;

import cn.pluss.platform.mapper.InsLogisticsTransferInfoMapper;
import cn.pluss.platform.model.entity.InsLogisticsTransferInfo;
import cn.pluss.platform.service.insLogisticsTransferInfo.InsLogisticsTransferInfoService;
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
@Service("insLogisticsTransferInfoService")
public class InsLogisticsTransferInfoServiceImpl extends ServiceImpl< InsLogisticsTransferInfoMapper, InsLogisticsTransferInfo> implements InsLogisticsTransferInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsTransferInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsTransferInfo> queryPage(Map map) {
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
    public InsLogisticsTransferInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsTransferInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsTransferInfo queryOne(InsLogisticsTransferInfo insLogisticsTransferInfo){
        LambdaQueryWrapper<InsLogisticsTransferInfo> queryWrapper = getQueryWrapper(insLogisticsTransferInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsTransferInfo
    * @return
    */
    @Override
    public List<InsLogisticsTransferInfo> queryList(InsLogisticsTransferInfo insLogisticsTransferInfo) {
        LambdaQueryWrapper<InsLogisticsTransferInfo> queryWrapper = getQueryWrapper(insLogisticsTransferInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsTransferInfo
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsTransferInfo> getQueryWrapper(InsLogisticsTransferInfo insLogisticsTransferInfo){
        LambdaQueryWrapper<InsLogisticsTransferInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsTransferInfo.getId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getId, insLogisticsTransferInfo.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getTenantId())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getTenantId, insLogisticsTransferInfo.getTenantId());
        }
        if (insLogisticsTransferInfo.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getCorpId, insLogisticsTransferInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getCorpName())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getCorpName, insLogisticsTransferInfo.getCorpName());
        }
        if (insLogisticsTransferInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getInstitutionId, insLogisticsTransferInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getInstitutionName, insLogisticsTransferInfo.getInstitutionName());
        }
        if (insLogisticsTransferInfo.getApplyDate() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getApplyDate, insLogisticsTransferInfo.getApplyDate());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getApplyUser())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getApplyUser, insLogisticsTransferInfo.getApplyUser());
        }
        if (insLogisticsTransferInfo.getExpectedDate() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getExpectedDate, insLogisticsTransferInfo.getExpectedDate());
        }
        if (insLogisticsTransferInfo.getWarehouseId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getWarehouseId, insLogisticsTransferInfo.getWarehouseId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getWarehouseName())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getWarehouseName, insLogisticsTransferInfo.getWarehouseName());
        }
        if (insLogisticsTransferInfo.getReceiveInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getReceiveInstitutionId, insLogisticsTransferInfo.getReceiveInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getReceiveInstitutionName())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getReceiveInstitutionName, insLogisticsTransferInfo.getReceiveInstitutionName());
        }
        if (insLogisticsTransferInfo.getReceiveWarehouseId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getReceiveWarehouseId, insLogisticsTransferInfo.getReceiveWarehouseId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getReceiveWarehouseName())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getReceiveWarehouseName, insLogisticsTransferInfo.getReceiveWarehouseName());
        }
        if (insLogisticsTransferInfo.getTransferAmount() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getTransferAmount, insLogisticsTransferInfo.getTransferAmount());
        }
        if (insLogisticsTransferInfo.getTransferState() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getTransferState, insLogisticsTransferInfo.getTransferState());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getTransferMemo())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getTransferMemo, insLogisticsTransferInfo.getTransferMemo());
        }
        if (insLogisticsTransferInfo.getAuditState() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getAuditState, insLogisticsTransferInfo.getAuditState());
        }
        if (insLogisticsTransferInfo.getAuditId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getAuditId, insLogisticsTransferInfo.getAuditId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getAuditName())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getAuditName, insLogisticsTransferInfo.getAuditName());
        }
        if (insLogisticsTransferInfo.getAuditTime() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getAuditTime, insLogisticsTransferInfo.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getAuditMemo())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getAuditMemo, insLogisticsTransferInfo.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getRemark())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getRemark, insLogisticsTransferInfo.getRemark());
        }
        if (insLogisticsTransferInfo.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getCreateUser, insLogisticsTransferInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfo.getCreateName())) {
            queryWrapper.eq(InsLogisticsTransferInfo::getCreateName, insLogisticsTransferInfo.getCreateName());
        }
        if (insLogisticsTransferInfo.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getCreateDept, insLogisticsTransferInfo.getCreateDept());
        }
        if (insLogisticsTransferInfo.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getCreateTime, insLogisticsTransferInfo.getCreateTime());
        }
        if (insLogisticsTransferInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getUpdateUser, insLogisticsTransferInfo.getUpdateUser());
        }
        if (insLogisticsTransferInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getUpdateTime, insLogisticsTransferInfo.getUpdateTime());
        }
        if (insLogisticsTransferInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getIsDeleted, insLogisticsTransferInfo.getIsDeleted());
        }
        if (insLogisticsTransferInfo.getStatus() != null) {
            queryWrapper.eq(InsLogisticsTransferInfo::getStatus, insLogisticsTransferInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsTransferInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsTransferInfo insert(InsLogisticsTransferInfo insLogisticsTransferInfo) {
        insLogisticsTransferInfo.setId(null);
        getBaseMapper().insert(insLogisticsTransferInfo);
        return insLogisticsTransferInfo;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsTransferInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsTransferInfo update(InsLogisticsTransferInfo insLogisticsTransferInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsTransferInfo> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsTransferInfo>(getBaseMapper());
        if (insLogisticsTransferInfo.getId() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getId, insLogisticsTransferInfo.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getTenantId())) {
            chainWrapper.set(InsLogisticsTransferInfo::getTenantId, insLogisticsTransferInfo.getTenantId());
        }
        if (insLogisticsTransferInfo.getCorpId() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getCorpId, insLogisticsTransferInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getCorpName())) {
            chainWrapper.set(InsLogisticsTransferInfo::getCorpName, insLogisticsTransferInfo.getCorpName());
        }
        if (insLogisticsTransferInfo.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getInstitutionId, insLogisticsTransferInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getInstitutionName())) {
            chainWrapper.set(InsLogisticsTransferInfo::getInstitutionName, insLogisticsTransferInfo.getInstitutionName());
        }
        if (insLogisticsTransferInfo.getApplyDate() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getApplyDate, insLogisticsTransferInfo.getApplyDate());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getApplyUser())) {
            chainWrapper.set(InsLogisticsTransferInfo::getApplyUser, insLogisticsTransferInfo.getApplyUser());
        }
        if (insLogisticsTransferInfo.getExpectedDate() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getExpectedDate, insLogisticsTransferInfo.getExpectedDate());
        }
        if (insLogisticsTransferInfo.getWarehouseId() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getWarehouseId, insLogisticsTransferInfo.getWarehouseId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getWarehouseName())) {
            chainWrapper.set(InsLogisticsTransferInfo::getWarehouseName, insLogisticsTransferInfo.getWarehouseName());
        }
        if (insLogisticsTransferInfo.getReceiveInstitutionId() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getReceiveInstitutionId, insLogisticsTransferInfo.getReceiveInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getReceiveInstitutionName())) {
            chainWrapper.set(InsLogisticsTransferInfo::getReceiveInstitutionName, insLogisticsTransferInfo.getReceiveInstitutionName());
        }
        if (insLogisticsTransferInfo.getReceiveWarehouseId() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getReceiveWarehouseId, insLogisticsTransferInfo.getReceiveWarehouseId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getReceiveWarehouseName())) {
            chainWrapper.set(InsLogisticsTransferInfo::getReceiveWarehouseName, insLogisticsTransferInfo.getReceiveWarehouseName());
        }
        if (insLogisticsTransferInfo.getTransferAmount() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getTransferAmount, insLogisticsTransferInfo.getTransferAmount());
        }
        if (insLogisticsTransferInfo.getTransferState() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getTransferState, insLogisticsTransferInfo.getTransferState());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getTransferMemo())) {
            chainWrapper.set(InsLogisticsTransferInfo::getTransferMemo, insLogisticsTransferInfo.getTransferMemo());
        }
        if (insLogisticsTransferInfo.getAuditState() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getAuditState, insLogisticsTransferInfo.getAuditState());
        }
        if (insLogisticsTransferInfo.getAuditId() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getAuditId, insLogisticsTransferInfo.getAuditId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getAuditName())) {
            chainWrapper.set(InsLogisticsTransferInfo::getAuditName, insLogisticsTransferInfo.getAuditName());
        }
        if (insLogisticsTransferInfo.getAuditTime() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getAuditTime, insLogisticsTransferInfo.getAuditTime());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getAuditMemo())) {
            chainWrapper.set(InsLogisticsTransferInfo::getAuditMemo, insLogisticsTransferInfo.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getRemark())) {
            chainWrapper.set(InsLogisticsTransferInfo::getRemark, insLogisticsTransferInfo.getRemark());
        }
        if (insLogisticsTransferInfo.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getCreateUser, insLogisticsTransferInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfo.getCreateName())) {
            chainWrapper.set(InsLogisticsTransferInfo::getCreateName, insLogisticsTransferInfo.getCreateName());
        }
        if (insLogisticsTransferInfo.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getCreateDept, insLogisticsTransferInfo.getCreateDept());
        }
        if (insLogisticsTransferInfo.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getCreateTime, insLogisticsTransferInfo.getCreateTime());
        }
        if (insLogisticsTransferInfo.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getUpdateUser, insLogisticsTransferInfo.getUpdateUser());
        }
        if (insLogisticsTransferInfo.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getUpdateTime, insLogisticsTransferInfo.getUpdateTime());
        }
        if (insLogisticsTransferInfo.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getIsDeleted, insLogisticsTransferInfo.getIsDeleted());
        }
        if (insLogisticsTransferInfo.getStatus() != null) {
            chainWrapper.set(InsLogisticsTransferInfo::getStatus, insLogisticsTransferInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsTransferInfo::getId, insLogisticsTransferInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsTransferInfo.getId());
        } else {
            return insLogisticsTransferInfo;
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
    public boolean saveInsLogisticsTransferInfoBatch(List<InsLogisticsTransferInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsTransferInfo insLogisticsTransferInfo : insertList) {
            //使用默认的雪花算法生成
            insLogisticsTransferInfo.setId(null);
            //insLogisticsTransferInfo.setCreatedDt(currentDte);
            //insLogisticsTransferInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsTransferInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsTransferInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


