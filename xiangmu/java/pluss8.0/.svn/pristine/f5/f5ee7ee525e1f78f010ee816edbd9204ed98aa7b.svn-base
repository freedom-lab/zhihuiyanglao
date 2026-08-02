package cn.pluss.platform.service.insElderInsureInfo.impl;

import cn.pluss.platform.mapper.InsElderInsureInfoMapper;
import cn.pluss.platform.model.entity.InsElderInsureInfo;
import cn.pluss.platform.service.insElderInsureInfo.InsElderInsureInfoService;
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
@Service("insElderInsureInfoService")
public class InsElderInsureInfoServiceImpl extends ServiceImpl< InsElderInsureInfoMapper, InsElderInsureInfo> implements InsElderInsureInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderInsureInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderInsureInfo> queryPage(Map map) {
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
    public InsElderInsureInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderInsureInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderInsureInfo queryOne(InsElderInsureInfo insElderInsureInfo){
        LambdaQueryWrapper<InsElderInsureInfo> queryWrapper = getQueryWrapper(insElderInsureInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderInsureInfo
    * @return
    */
    @Override
    public List<InsElderInsureInfo> queryList(InsElderInsureInfo insElderInsureInfo) {
        LambdaQueryWrapper<InsElderInsureInfo> queryWrapper = getQueryWrapper(insElderInsureInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderInsureInfo
    * @return
    */
    public static LambdaQueryWrapper<InsElderInsureInfo> getQueryWrapper(InsElderInsureInfo insElderInsureInfo){
        LambdaQueryWrapper<InsElderInsureInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderInsureInfo.getId() != null) {
            queryWrapper.eq(InsElderInsureInfo::getId, insElderInsureInfo.getId());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getTenantId())) {
            queryWrapper.eq(InsElderInsureInfo::getTenantId, insElderInsureInfo.getTenantId());
        }
        if (insElderInsureInfo.getCorpId() != null) {
            queryWrapper.eq(InsElderInsureInfo::getCorpId, insElderInsureInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getCorpName())) {
            queryWrapper.eq(InsElderInsureInfo::getCorpName, insElderInsureInfo.getCorpName());
        }
        if (insElderInsureInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsElderInsureInfo::getInstitutionId, insElderInsureInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getInstitutionName())) {
            queryWrapper.eq(InsElderInsureInfo::getInstitutionName, insElderInsureInfo.getInstitutionName());
        }
        if (insElderInsureInfo.getCheckId() != null) {
            queryWrapper.eq(InsElderInsureInfo::getCheckId, insElderInsureInfo.getCheckId());
        }
        if (insElderInsureInfo.getCheckDate() != null) {
            queryWrapper.eq(InsElderInsureInfo::getCheckDate, insElderInsureInfo.getCheckDate());
        }
        if (insElderInsureInfo.getElderId() != null) {
            queryWrapper.eq(InsElderInsureInfo::getElderId, insElderInsureInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getElderName())) {
            queryWrapper.eq(InsElderInsureInfo::getElderName, insElderInsureInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getIdCard())) {
            queryWrapper.eq(InsElderInsureInfo::getIdCard, insElderInsureInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getSex())) {
            queryWrapper.eq(InsElderInsureInfo::getSex, insElderInsureInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getInsuredName())) {
            queryWrapper.eq(InsElderInsureInfo::getInsuredName, insElderInsureInfo.getInsuredName());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getInsuredCompany())) {
            queryWrapper.eq(InsElderInsureInfo::getInsuredCompany, insElderInsureInfo.getInsuredCompany());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getInsuredUnit())) {
            queryWrapper.eq(InsElderInsureInfo::getInsuredUnit, insElderInsureInfo.getInsuredUnit());
        }
        if (insElderInsureInfo.getInsuredStartDate() != null) {
            queryWrapper.eq(InsElderInsureInfo::getInsuredStartDate, insElderInsureInfo.getInsuredStartDate());
        }
        if (insElderInsureInfo.getInsuredEndDate() != null) {
            queryWrapper.eq(InsElderInsureInfo::getInsuredEndDate, insElderInsureInfo.getInsuredEndDate());
        }
        if (insElderInsureInfo.getPaymentDate() != null) {
            queryWrapper.eq(InsElderInsureInfo::getPaymentDate, insElderInsureInfo.getPaymentDate());
        }
        if (insElderInsureInfo.getPaymentBase() != null) {
            queryWrapper.eq(InsElderInsureInfo::getPaymentBase, insElderInsureInfo.getPaymentBase());
        }
        if (insElderInsureInfo.getPaymentAmount() != null) {
            queryWrapper.eq(InsElderInsureInfo::getPaymentAmount, insElderInsureInfo.getPaymentAmount());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getFilePath())) {
            queryWrapper.eq(InsElderInsureInfo::getFilePath, insElderInsureInfo.getFilePath());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getAreaCode())) {
            queryWrapper.eq(InsElderInsureInfo::getAreaCode, insElderInsureInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getAreaName())) {
            queryWrapper.eq(InsElderInsureInfo::getAreaName, insElderInsureInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getRemark())) {
            queryWrapper.eq(InsElderInsureInfo::getRemark, insElderInsureInfo.getRemark());
        }
        if (insElderInsureInfo.getCreateUser() != null) {
            queryWrapper.eq(InsElderInsureInfo::getCreateUser, insElderInsureInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderInsureInfo.getCreateName())) {
            queryWrapper.eq(InsElderInsureInfo::getCreateName, insElderInsureInfo.getCreateName());
        }
        if (insElderInsureInfo.getCreateDept() != null) {
            queryWrapper.eq(InsElderInsureInfo::getCreateDept, insElderInsureInfo.getCreateDept());
        }
        if (insElderInsureInfo.getCreateTime() != null) {
            queryWrapper.eq(InsElderInsureInfo::getCreateTime, insElderInsureInfo.getCreateTime());
        }
        if (insElderInsureInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsElderInsureInfo::getUpdateUser, insElderInsureInfo.getUpdateUser());
        }
        if (insElderInsureInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsElderInsureInfo::getUpdateTime, insElderInsureInfo.getUpdateTime());
        }
        if (insElderInsureInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsElderInsureInfo::getIsDeleted, insElderInsureInfo.getIsDeleted());
        }
        if (insElderInsureInfo.getStatus() != null) {
            queryWrapper.eq(InsElderInsureInfo::getStatus, insElderInsureInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderInsureInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderInsureInfo insert(InsElderInsureInfo insElderInsureInfo) {
        insElderInsureInfo.setId(null);
        getBaseMapper().insert(insElderInsureInfo);
        return insElderInsureInfo;
    }

    /**
    * 更新数据
    *
    * @param insElderInsureInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderInsureInfo update(InsElderInsureInfo insElderInsureInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderInsureInfo> chainWrapper = new LambdaUpdateChainWrapper<InsElderInsureInfo>(getBaseMapper());
        if (insElderInsureInfo.getId() != null) {
            chainWrapper.set(InsElderInsureInfo::getId, insElderInsureInfo.getId());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getTenantId())) {
            chainWrapper.set(InsElderInsureInfo::getTenantId, insElderInsureInfo.getTenantId());
        }
        if (insElderInsureInfo.getCorpId() != null) {
            chainWrapper.set(InsElderInsureInfo::getCorpId, insElderInsureInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getCorpName())) {
            chainWrapper.set(InsElderInsureInfo::getCorpName, insElderInsureInfo.getCorpName());
        }
        if (insElderInsureInfo.getInstitutionId() != null) {
            chainWrapper.set(InsElderInsureInfo::getInstitutionId, insElderInsureInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getInstitutionName())) {
            chainWrapper.set(InsElderInsureInfo::getInstitutionName, insElderInsureInfo.getInstitutionName());
        }
        if (insElderInsureInfo.getCheckId() != null) {
            chainWrapper.set(InsElderInsureInfo::getCheckId, insElderInsureInfo.getCheckId());
        }
        if (insElderInsureInfo.getCheckDate() != null) {
            chainWrapper.set(InsElderInsureInfo::getCheckDate, insElderInsureInfo.getCheckDate());
        }
        if (insElderInsureInfo.getElderId() != null) {
            chainWrapper.set(InsElderInsureInfo::getElderId, insElderInsureInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getElderName())) {
            chainWrapper.set(InsElderInsureInfo::getElderName, insElderInsureInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getIdCard())) {
            chainWrapper.set(InsElderInsureInfo::getIdCard, insElderInsureInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getSex())) {
            chainWrapper.set(InsElderInsureInfo::getSex, insElderInsureInfo.getSex());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getInsuredName())) {
            chainWrapper.set(InsElderInsureInfo::getInsuredName, insElderInsureInfo.getInsuredName());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getInsuredCompany())) {
            chainWrapper.set(InsElderInsureInfo::getInsuredCompany, insElderInsureInfo.getInsuredCompany());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getInsuredUnit())) {
            chainWrapper.set(InsElderInsureInfo::getInsuredUnit, insElderInsureInfo.getInsuredUnit());
        }
        if (insElderInsureInfo.getInsuredStartDate() != null) {
            chainWrapper.set(InsElderInsureInfo::getInsuredStartDate, insElderInsureInfo.getInsuredStartDate());
        }
        if (insElderInsureInfo.getInsuredEndDate() != null) {
            chainWrapper.set(InsElderInsureInfo::getInsuredEndDate, insElderInsureInfo.getInsuredEndDate());
        }
        if (insElderInsureInfo.getPaymentDate() != null) {
            chainWrapper.set(InsElderInsureInfo::getPaymentDate, insElderInsureInfo.getPaymentDate());
        }
        if (insElderInsureInfo.getPaymentBase() != null) {
            chainWrapper.set(InsElderInsureInfo::getPaymentBase, insElderInsureInfo.getPaymentBase());
        }
        if (insElderInsureInfo.getPaymentAmount() != null) {
            chainWrapper.set(InsElderInsureInfo::getPaymentAmount, insElderInsureInfo.getPaymentAmount());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getFilePath())) {
            chainWrapper.set(InsElderInsureInfo::getFilePath, insElderInsureInfo.getFilePath());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getAreaCode())) {
            chainWrapper.set(InsElderInsureInfo::getAreaCode, insElderInsureInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getAreaName())) {
            chainWrapper.set(InsElderInsureInfo::getAreaName, insElderInsureInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getRemark())) {
            chainWrapper.set(InsElderInsureInfo::getRemark, insElderInsureInfo.getRemark());
        }
        if (insElderInsureInfo.getCreateUser() != null) {
            chainWrapper.set(InsElderInsureInfo::getCreateUser, insElderInsureInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderInsureInfo.getCreateName())) {
            chainWrapper.set(InsElderInsureInfo::getCreateName, insElderInsureInfo.getCreateName());
        }
        if (insElderInsureInfo.getCreateDept() != null) {
            chainWrapper.set(InsElderInsureInfo::getCreateDept, insElderInsureInfo.getCreateDept());
        }
        if (insElderInsureInfo.getCreateTime() != null) {
            chainWrapper.set(InsElderInsureInfo::getCreateTime, insElderInsureInfo.getCreateTime());
        }
        if (insElderInsureInfo.getUpdateUser() != null) {
            chainWrapper.set(InsElderInsureInfo::getUpdateUser, insElderInsureInfo.getUpdateUser());
        }
        if (insElderInsureInfo.getUpdateTime() != null) {
            chainWrapper.set(InsElderInsureInfo::getUpdateTime, insElderInsureInfo.getUpdateTime());
        }
        if (insElderInsureInfo.getIsDeleted() != null) {
            chainWrapper.set(InsElderInsureInfo::getIsDeleted, insElderInsureInfo.getIsDeleted());
        }
        if (insElderInsureInfo.getStatus() != null) {
            chainWrapper.set(InsElderInsureInfo::getStatus, insElderInsureInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderInsureInfo::getId, insElderInsureInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderInsureInfo.getId());
        } else {
            return insElderInsureInfo;
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
    public boolean saveInsElderInsureInfoBatch(List<InsElderInsureInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderInsureInfo insElderInsureInfo : insertList) {
            //使用默认的雪花算法生成
            insElderInsureInfo.setId(null);
            //insElderInsureInfo.setCreatedDt(currentDte);
            //insElderInsureInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderInsureInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderInsureInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


