package cn.pluss.platform.service.carePaymentInfo.impl;

import cn.pluss.platform.mapper.CarePaymentInfoMapper;
import cn.pluss.platform.model.entity.CarePaymentInfo;
import cn.pluss.platform.service.carePaymentInfo.CarePaymentInfoService;
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
@Service("carePaymentInfoService")
public class CarePaymentInfoServiceImpl extends ServiceImpl< CarePaymentInfoMapper, CarePaymentInfo> implements CarePaymentInfoService {
    private static final Logger logger = LoggerFactory.getLogger(CarePaymentInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CarePaymentInfo> queryPage(Map map) {
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
    public CarePaymentInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param carePaymentInfo 实例对象
    * @return 实例对象
    */
    @Override
    public CarePaymentInfo queryOne(CarePaymentInfo carePaymentInfo){
        LambdaQueryWrapper<CarePaymentInfo> queryWrapper = getQueryWrapper(carePaymentInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param carePaymentInfo
    * @return
    */
    @Override
    public List<CarePaymentInfo> queryList(CarePaymentInfo carePaymentInfo) {
        LambdaQueryWrapper<CarePaymentInfo> queryWrapper = getQueryWrapper(carePaymentInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param carePaymentInfo
    * @return
    */
    public static LambdaQueryWrapper<CarePaymentInfo> getQueryWrapper(CarePaymentInfo carePaymentInfo){
        LambdaQueryWrapper<CarePaymentInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (carePaymentInfo.getId() != null) {
            queryWrapper.eq(CarePaymentInfo::getId, carePaymentInfo.getId());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getTenantId())) {
            queryWrapper.eq(CarePaymentInfo::getTenantId, carePaymentInfo.getTenantId());
        }
        if (carePaymentInfo.getCorpId() != null) {
            queryWrapper.eq(CarePaymentInfo::getCorpId, carePaymentInfo.getCorpId());
        }
        if (carePaymentInfo.getInstitutionId() != null) {
            queryWrapper.eq(CarePaymentInfo::getInstitutionId, carePaymentInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getInstitutionName())) {
            queryWrapper.eq(CarePaymentInfo::getInstitutionName, carePaymentInfo.getInstitutionName());
        }
        if (carePaymentInfo.getElderId() != null) {
            queryWrapper.eq(CarePaymentInfo::getElderId, carePaymentInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getElderName())) {
            queryWrapper.eq(CarePaymentInfo::getElderName, carePaymentInfo.getElderName());
        }
        if (carePaymentInfo.getEnrollId() != null) {
            queryWrapper.eq(CarePaymentInfo::getEnrollId, carePaymentInfo.getEnrollId());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getPaymentCode())) {
            queryWrapper.eq(CarePaymentInfo::getPaymentCode, carePaymentInfo.getPaymentCode());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getPaymentType())) {
            queryWrapper.eq(CarePaymentInfo::getPaymentType, carePaymentInfo.getPaymentType());
        }
        if (carePaymentInfo.getReceivableAmount() != null) {
            queryWrapper.eq(CarePaymentInfo::getReceivableAmount, carePaymentInfo.getReceivableAmount());
        }
        if (carePaymentInfo.getAmount() != null) {
            queryWrapper.eq(CarePaymentInfo::getAmount, carePaymentInfo.getAmount());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getIsBillConfirm())) {
            queryWrapper.eq(CarePaymentInfo::getIsBillConfirm, carePaymentInfo.getIsBillConfirm());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getHandler())) {
            queryWrapper.eq(CarePaymentInfo::getHandler, carePaymentInfo.getHandler());
        }
        if (carePaymentInfo.getHandlerTime() != null) {
            queryWrapper.eq(CarePaymentInfo::getHandlerTime, carePaymentInfo.getHandlerTime());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getBillExplain())) {
            queryWrapper.eq(CarePaymentInfo::getBillExplain, carePaymentInfo.getBillExplain());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getPayType())) {
            queryWrapper.eq(CarePaymentInfo::getPayType, carePaymentInfo.getPayType());
        }
        if (carePaymentInfo.getAccountPayAmount() != null) {
            queryWrapper.eq(CarePaymentInfo::getAccountPayAmount, carePaymentInfo.getAccountPayAmount());
        }
        if (carePaymentInfo.getOfflinePayAmount() != null) {
            queryWrapper.eq(CarePaymentInfo::getOfflinePayAmount, carePaymentInfo.getOfflinePayAmount());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getPayState())) {
            queryWrapper.eq(CarePaymentInfo::getPayState, carePaymentInfo.getPayState());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getPayeeName())) {
            queryWrapper.eq(CarePaymentInfo::getPayeeName, carePaymentInfo.getPayeeName());
        }
        if (carePaymentInfo.getPayeeTime() != null) {
            queryWrapper.eq(CarePaymentInfo::getPayeeTime, carePaymentInfo.getPayeeTime());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getPayeeExplain())) {
            queryWrapper.eq(CarePaymentInfo::getPayeeExplain, carePaymentInfo.getPayeeExplain());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getPaymentName())) {
            queryWrapper.eq(CarePaymentInfo::getPaymentName, carePaymentInfo.getPaymentName());
        }
        if (carePaymentInfo.getAreaCode() != null) {
            queryWrapper.eq(CarePaymentInfo::getAreaCode, carePaymentInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getAreaName())) {
            queryWrapper.eq(CarePaymentInfo::getAreaName, carePaymentInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(carePaymentInfo.getRemark())) {
            queryWrapper.eq(CarePaymentInfo::getRemark, carePaymentInfo.getRemark());
        }
        if (carePaymentInfo.getCreateUser() != null) {
            queryWrapper.eq(CarePaymentInfo::getCreateUser, carePaymentInfo.getCreateUser());
        }
        if (carePaymentInfo.getCreateDept() != null) {
            queryWrapper.eq(CarePaymentInfo::getCreateDept, carePaymentInfo.getCreateDept());
        }
        if (carePaymentInfo.getCreateTime() != null) {
            queryWrapper.eq(CarePaymentInfo::getCreateTime, carePaymentInfo.getCreateTime());
        }
        if (carePaymentInfo.getUpdateUser() != null) {
            queryWrapper.eq(CarePaymentInfo::getUpdateUser, carePaymentInfo.getUpdateUser());
        }
        if (carePaymentInfo.getUpdateTime() != null) {
            queryWrapper.eq(CarePaymentInfo::getUpdateTime, carePaymentInfo.getUpdateTime());
        }
        if (carePaymentInfo.getStatus() != null) {
            queryWrapper.eq(CarePaymentInfo::getStatus, carePaymentInfo.getStatus());
        }
        if (carePaymentInfo.getIsDeleted() != null) {
            queryWrapper.eq(CarePaymentInfo::getIsDeleted, carePaymentInfo.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param carePaymentInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CarePaymentInfo insert(CarePaymentInfo carePaymentInfo) {
        carePaymentInfo.setId(null);
        getBaseMapper().insert(carePaymentInfo);
        return carePaymentInfo;
    }

    /**
    * 更新数据
    *
    * @param carePaymentInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CarePaymentInfo update(CarePaymentInfo carePaymentInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CarePaymentInfo> chainWrapper = new LambdaUpdateChainWrapper<CarePaymentInfo>(getBaseMapper());
        if (carePaymentInfo.getId() != null) {
            chainWrapper.set(CarePaymentInfo::getId, carePaymentInfo.getId());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getTenantId())) {
            chainWrapper.set(CarePaymentInfo::getTenantId, carePaymentInfo.getTenantId());
        }
        if (carePaymentInfo.getCorpId() != null) {
            chainWrapper.set(CarePaymentInfo::getCorpId, carePaymentInfo.getCorpId());
        }
        if (carePaymentInfo.getInstitutionId() != null) {
            chainWrapper.set(CarePaymentInfo::getInstitutionId, carePaymentInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getInstitutionName())) {
            chainWrapper.set(CarePaymentInfo::getInstitutionName, carePaymentInfo.getInstitutionName());
        }
        if (carePaymentInfo.getElderId() != null) {
            chainWrapper.set(CarePaymentInfo::getElderId, carePaymentInfo.getElderId());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getElderName())) {
            chainWrapper.set(CarePaymentInfo::getElderName, carePaymentInfo.getElderName());
        }
        if (carePaymentInfo.getEnrollId() != null) {
            chainWrapper.set(CarePaymentInfo::getEnrollId, carePaymentInfo.getEnrollId());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getPaymentCode())) {
            chainWrapper.set(CarePaymentInfo::getPaymentCode, carePaymentInfo.getPaymentCode());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getPaymentType())) {
            chainWrapper.set(CarePaymentInfo::getPaymentType, carePaymentInfo.getPaymentType());
        }
        if (carePaymentInfo.getReceivableAmount() != null) {
            chainWrapper.set(CarePaymentInfo::getReceivableAmount, carePaymentInfo.getReceivableAmount());
        }
        if (carePaymentInfo.getAmount() != null) {
            chainWrapper.set(CarePaymentInfo::getAmount, carePaymentInfo.getAmount());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getIsBillConfirm())) {
            chainWrapper.set(CarePaymentInfo::getIsBillConfirm, carePaymentInfo.getIsBillConfirm());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getHandler())) {
            chainWrapper.set(CarePaymentInfo::getHandler, carePaymentInfo.getHandler());
        }
        if (carePaymentInfo.getHandlerTime() != null) {
            chainWrapper.set(CarePaymentInfo::getHandlerTime, carePaymentInfo.getHandlerTime());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getBillExplain())) {
            chainWrapper.set(CarePaymentInfo::getBillExplain, carePaymentInfo.getBillExplain());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getPayType())) {
            chainWrapper.set(CarePaymentInfo::getPayType, carePaymentInfo.getPayType());
        }
        if (carePaymentInfo.getAccountPayAmount() != null) {
            chainWrapper.set(CarePaymentInfo::getAccountPayAmount, carePaymentInfo.getAccountPayAmount());
        }
        if (carePaymentInfo.getOfflinePayAmount() != null) {
            chainWrapper.set(CarePaymentInfo::getOfflinePayAmount, carePaymentInfo.getOfflinePayAmount());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getPayState())) {
            chainWrapper.set(CarePaymentInfo::getPayState, carePaymentInfo.getPayState());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getPayeeName())) {
            chainWrapper.set(CarePaymentInfo::getPayeeName, carePaymentInfo.getPayeeName());
        }
        if (carePaymentInfo.getPayeeTime() != null) {
            chainWrapper.set(CarePaymentInfo::getPayeeTime, carePaymentInfo.getPayeeTime());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getPayeeExplain())) {
            chainWrapper.set(CarePaymentInfo::getPayeeExplain, carePaymentInfo.getPayeeExplain());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getPaymentName())) {
            chainWrapper.set(CarePaymentInfo::getPaymentName, carePaymentInfo.getPaymentName());
        }
        if (carePaymentInfo.getAreaCode() != null) {
            chainWrapper.set(CarePaymentInfo::getAreaCode, carePaymentInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getAreaName())) {
            chainWrapper.set(CarePaymentInfo::getAreaName, carePaymentInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(carePaymentInfo.getRemark())) {
            chainWrapper.set(CarePaymentInfo::getRemark, carePaymentInfo.getRemark());
        }
        if (carePaymentInfo.getCreateUser() != null) {
            chainWrapper.set(CarePaymentInfo::getCreateUser, carePaymentInfo.getCreateUser());
        }
        if (carePaymentInfo.getCreateDept() != null) {
            chainWrapper.set(CarePaymentInfo::getCreateDept, carePaymentInfo.getCreateDept());
        }
        if (carePaymentInfo.getCreateTime() != null) {
            chainWrapper.set(CarePaymentInfo::getCreateTime, carePaymentInfo.getCreateTime());
        }
        if (carePaymentInfo.getUpdateUser() != null) {
            chainWrapper.set(CarePaymentInfo::getUpdateUser, carePaymentInfo.getUpdateUser());
        }
        if (carePaymentInfo.getUpdateTime() != null) {
            chainWrapper.set(CarePaymentInfo::getUpdateTime, carePaymentInfo.getUpdateTime());
        }
        if (carePaymentInfo.getStatus() != null) {
            chainWrapper.set(CarePaymentInfo::getStatus, carePaymentInfo.getStatus());
        }
        if (carePaymentInfo.getIsDeleted() != null) {
            chainWrapper.set(CarePaymentInfo::getIsDeleted, carePaymentInfo.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CarePaymentInfo::getId, carePaymentInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(carePaymentInfo.getId());
        } else {
            return carePaymentInfo;
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
    public boolean saveCarePaymentInfoBatch(List<CarePaymentInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CarePaymentInfo carePaymentInfo : insertList) {
            //使用默认的雪花算法生成
            carePaymentInfo.setId(null);
            //carePaymentInfo.setCreatedDt(currentDte);
            //carePaymentInfo.setUpdatedDt(currentDte);
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
    public Integer deleteCarePaymentInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CarePaymentInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


