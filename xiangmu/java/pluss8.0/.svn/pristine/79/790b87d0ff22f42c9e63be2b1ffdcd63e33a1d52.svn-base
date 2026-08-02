package cn.pluss.platform.service.insLogisticsSupplierInfo.impl;

import cn.pluss.platform.mapper.InsLogisticsSupplierInfoMapper;
import cn.pluss.platform.model.entity.InsLogisticsSupplierInfo;
import cn.pluss.platform.service.insLogisticsSupplierInfo.InsLogisticsSupplierInfoService;
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
@Service("insLogisticsSupplierInfoService")
public class InsLogisticsSupplierInfoServiceImpl extends ServiceImpl< InsLogisticsSupplierInfoMapper, InsLogisticsSupplierInfo> implements InsLogisticsSupplierInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsSupplierInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsSupplierInfo> queryPage(Map map) {
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
    public InsLogisticsSupplierInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsSupplierInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsSupplierInfo queryOne(InsLogisticsSupplierInfo insLogisticsSupplierInfo){
        LambdaQueryWrapper<InsLogisticsSupplierInfo> queryWrapper = getQueryWrapper(insLogisticsSupplierInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsSupplierInfo
    * @return
    */
    @Override
    public List<InsLogisticsSupplierInfo> queryList(InsLogisticsSupplierInfo insLogisticsSupplierInfo) {
        LambdaQueryWrapper<InsLogisticsSupplierInfo> queryWrapper = getQueryWrapper(insLogisticsSupplierInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsSupplierInfo
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsSupplierInfo> getQueryWrapper(InsLogisticsSupplierInfo insLogisticsSupplierInfo){
        LambdaQueryWrapper<InsLogisticsSupplierInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsSupplierInfo.getId() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getId, insLogisticsSupplierInfo.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getTenantId())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getTenantId, insLogisticsSupplierInfo.getTenantId());
        }
        if (insLogisticsSupplierInfo.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getCorpId, insLogisticsSupplierInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getCorpName())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getCorpName, insLogisticsSupplierInfo.getCorpName());
        }
        if (insLogisticsSupplierInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getInstitutionId, insLogisticsSupplierInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getInstitutionName, insLogisticsSupplierInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getSupplierName())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getSupplierName, insLogisticsSupplierInfo.getSupplierName());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getSupplierType())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getSupplierType, insLogisticsSupplierInfo.getSupplierType());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getLinkMan())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getLinkMan, insLogisticsSupplierInfo.getLinkMan());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getLinkTel())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getLinkTel, insLogisticsSupplierInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getLegalPerson())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getLegalPerson, insLogisticsSupplierInfo.getLegalPerson());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getDocumentType())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getDocumentType, insLogisticsSupplierInfo.getDocumentType());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getDocumentCode())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getDocumentCode, insLogisticsSupplierInfo.getDocumentCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getTaxNumber())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getTaxNumber, insLogisticsSupplierInfo.getTaxNumber());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getAccountName())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getAccountName, insLogisticsSupplierInfo.getAccountName());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getBankName())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getBankName, insLogisticsSupplierInfo.getBankName());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getBankCode())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getBankCode, insLogisticsSupplierInfo.getBankCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getBusinessNumber())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getBusinessNumber, insLogisticsSupplierInfo.getBusinessNumber());
        }
        if (insLogisticsSupplierInfo.getPeriodValidity() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getPeriodValidity, insLogisticsSupplierInfo.getPeriodValidity());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getBusinessScope())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getBusinessScope, insLogisticsSupplierInfo.getBusinessScope());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getSupplierAddress())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getSupplierAddress, insLogisticsSupplierInfo.getSupplierAddress());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getBusinessImgPath())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getBusinessImgPath, insLogisticsSupplierInfo.getBusinessImgPath());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getRemark())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getRemark, insLogisticsSupplierInfo.getRemark());
        }
        if (insLogisticsSupplierInfo.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getCreateUser, insLogisticsSupplierInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsSupplierInfo.getCreateName())) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getCreateName, insLogisticsSupplierInfo.getCreateName());
        }
        if (insLogisticsSupplierInfo.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getCreateDept, insLogisticsSupplierInfo.getCreateDept());
        }
        if (insLogisticsSupplierInfo.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getCreateTime, insLogisticsSupplierInfo.getCreateTime());
        }
        if (insLogisticsSupplierInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getUpdateUser, insLogisticsSupplierInfo.getUpdateUser());
        }
        if (insLogisticsSupplierInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getUpdateTime, insLogisticsSupplierInfo.getUpdateTime());
        }
        if (insLogisticsSupplierInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getIsDeleted, insLogisticsSupplierInfo.getIsDeleted());
        }
        if (insLogisticsSupplierInfo.getStatus() != null) {
            queryWrapper.eq(InsLogisticsSupplierInfo::getStatus, insLogisticsSupplierInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsSupplierInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsSupplierInfo insert(InsLogisticsSupplierInfo insLogisticsSupplierInfo) {
        insLogisticsSupplierInfo.setId(null);
        getBaseMapper().insert(insLogisticsSupplierInfo);
        return insLogisticsSupplierInfo;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsSupplierInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsSupplierInfo update(InsLogisticsSupplierInfo insLogisticsSupplierInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsSupplierInfo> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsSupplierInfo>(getBaseMapper());
        if (insLogisticsSupplierInfo.getId() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getId, insLogisticsSupplierInfo.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getTenantId())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getTenantId, insLogisticsSupplierInfo.getTenantId());
        }
        if (insLogisticsSupplierInfo.getCorpId() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getCorpId, insLogisticsSupplierInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getCorpName())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getCorpName, insLogisticsSupplierInfo.getCorpName());
        }
        if (insLogisticsSupplierInfo.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getInstitutionId, insLogisticsSupplierInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getInstitutionName())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getInstitutionName, insLogisticsSupplierInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getSupplierName())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getSupplierName, insLogisticsSupplierInfo.getSupplierName());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getSupplierType())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getSupplierType, insLogisticsSupplierInfo.getSupplierType());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getLinkMan())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getLinkMan, insLogisticsSupplierInfo.getLinkMan());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getLinkTel())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getLinkTel, insLogisticsSupplierInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getLegalPerson())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getLegalPerson, insLogisticsSupplierInfo.getLegalPerson());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getDocumentType())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getDocumentType, insLogisticsSupplierInfo.getDocumentType());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getDocumentCode())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getDocumentCode, insLogisticsSupplierInfo.getDocumentCode());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getTaxNumber())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getTaxNumber, insLogisticsSupplierInfo.getTaxNumber());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getAccountName())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getAccountName, insLogisticsSupplierInfo.getAccountName());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getBankName())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getBankName, insLogisticsSupplierInfo.getBankName());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getBankCode())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getBankCode, insLogisticsSupplierInfo.getBankCode());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getBusinessNumber())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getBusinessNumber, insLogisticsSupplierInfo.getBusinessNumber());
        }
        if (insLogisticsSupplierInfo.getPeriodValidity() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getPeriodValidity, insLogisticsSupplierInfo.getPeriodValidity());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getBusinessScope())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getBusinessScope, insLogisticsSupplierInfo.getBusinessScope());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getSupplierAddress())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getSupplierAddress, insLogisticsSupplierInfo.getSupplierAddress());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getBusinessImgPath())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getBusinessImgPath, insLogisticsSupplierInfo.getBusinessImgPath());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getRemark())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getRemark, insLogisticsSupplierInfo.getRemark());
        }
        if (insLogisticsSupplierInfo.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getCreateUser, insLogisticsSupplierInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsSupplierInfo.getCreateName())) {
            chainWrapper.set(InsLogisticsSupplierInfo::getCreateName, insLogisticsSupplierInfo.getCreateName());
        }
        if (insLogisticsSupplierInfo.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getCreateDept, insLogisticsSupplierInfo.getCreateDept());
        }
        if (insLogisticsSupplierInfo.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getCreateTime, insLogisticsSupplierInfo.getCreateTime());
        }
        if (insLogisticsSupplierInfo.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getUpdateUser, insLogisticsSupplierInfo.getUpdateUser());
        }
        if (insLogisticsSupplierInfo.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getUpdateTime, insLogisticsSupplierInfo.getUpdateTime());
        }
        if (insLogisticsSupplierInfo.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getIsDeleted, insLogisticsSupplierInfo.getIsDeleted());
        }
        if (insLogisticsSupplierInfo.getStatus() != null) {
            chainWrapper.set(InsLogisticsSupplierInfo::getStatus, insLogisticsSupplierInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsSupplierInfo::getId, insLogisticsSupplierInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsSupplierInfo.getId());
        } else {
            return insLogisticsSupplierInfo;
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
    public boolean saveInsLogisticsSupplierInfoBatch(List<InsLogisticsSupplierInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsSupplierInfo insLogisticsSupplierInfo : insertList) {
            //使用默认的雪花算法生成
            insLogisticsSupplierInfo.setId(null);
            //insLogisticsSupplierInfo.setCreatedDt(currentDte);
            //insLogisticsSupplierInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsSupplierInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsSupplierInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


