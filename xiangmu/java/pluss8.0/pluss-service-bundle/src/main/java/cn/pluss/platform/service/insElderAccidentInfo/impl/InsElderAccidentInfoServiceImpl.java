package cn.pluss.platform.service.insElderAccidentInfo.impl;

import cn.pluss.platform.mapper.InsElderAccidentInfoMapper;
import cn.pluss.platform.model.entity.InsElderAccidentInfo;
import cn.pluss.platform.service.insElderAccidentInfo.InsElderAccidentInfoService;
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
@Service("insElderAccidentInfoService")
public class InsElderAccidentInfoServiceImpl extends ServiceImpl< InsElderAccidentInfoMapper, InsElderAccidentInfo> implements InsElderAccidentInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderAccidentInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderAccidentInfo> queryPage(Map map) {
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
    public InsElderAccidentInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderAccidentInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderAccidentInfo queryOne(InsElderAccidentInfo insElderAccidentInfo){
        LambdaQueryWrapper<InsElderAccidentInfo> queryWrapper = getQueryWrapper(insElderAccidentInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderAccidentInfo
    * @return
    */
    @Override
    public List<InsElderAccidentInfo> queryList(InsElderAccidentInfo insElderAccidentInfo) {
        LambdaQueryWrapper<InsElderAccidentInfo> queryWrapper = getQueryWrapper(insElderAccidentInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderAccidentInfo
    * @return
    */
    public static LambdaQueryWrapper<InsElderAccidentInfo> getQueryWrapper(InsElderAccidentInfo insElderAccidentInfo){
        LambdaQueryWrapper<InsElderAccidentInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderAccidentInfo.getId() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getId, insElderAccidentInfo.getId());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getTenantId())) {
            queryWrapper.eq(InsElderAccidentInfo::getTenantId, insElderAccidentInfo.getTenantId());
        }
        if (insElderAccidentInfo.getCorpId() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getCorpId, insElderAccidentInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getCorpName())) {
            queryWrapper.eq(InsElderAccidentInfo::getCorpName, insElderAccidentInfo.getCorpName());
        }
        if (insElderAccidentInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getInstitutionId, insElderAccidentInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getInstitutionName())) {
            queryWrapper.eq(InsElderAccidentInfo::getInstitutionName, insElderAccidentInfo.getInstitutionName());
        }
        if (insElderAccidentInfo.getCheckId() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getCheckId, insElderAccidentInfo.getCheckId());
        }
        if (insElderAccidentInfo.getCheckDate() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getCheckDate, insElderAccidentInfo.getCheckDate());
        }
        if (insElderAccidentInfo.getElderId() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getElderId, insElderAccidentInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getElderName())) {
            queryWrapper.eq(InsElderAccidentInfo::getElderName, insElderAccidentInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getIdCard())) {
            queryWrapper.eq(InsElderAccidentInfo::getIdCard, insElderAccidentInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getSex())) {
            queryWrapper.eq(InsElderAccidentInfo::getSex, insElderAccidentInfo.getSex());
        }
        if (insElderAccidentInfo.getOccurTime() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getOccurTime, insElderAccidentInfo.getOccurTime());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getAccidentType())) {
            queryWrapper.eq(InsElderAccidentInfo::getAccidentType, insElderAccidentInfo.getAccidentType());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getAccidentReason())) {
            queryWrapper.eq(InsElderAccidentInfo::getAccidentReason, insElderAccidentInfo.getAccidentReason());
        }
        if (insElderAccidentInfo.getNursingStaffId() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getNursingStaffId, insElderAccidentInfo.getNursingStaffId());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getNursingStaffName())) {
            queryWrapper.eq(InsElderAccidentInfo::getNursingStaffName, insElderAccidentInfo.getNursingStaffName());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getHandlingResult())) {
            queryWrapper.eq(InsElderAccidentInfo::getHandlingResult, insElderAccidentInfo.getHandlingResult());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getRemark())) {
            queryWrapper.eq(InsElderAccidentInfo::getRemark, insElderAccidentInfo.getRemark());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getFilePath())) {
            queryWrapper.eq(InsElderAccidentInfo::getFilePath, insElderAccidentInfo.getFilePath());
        }
        if (insElderAccidentInfo.getCreateUser() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getCreateUser, insElderAccidentInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderAccidentInfo.getCreateName())) {
            queryWrapper.eq(InsElderAccidentInfo::getCreateName, insElderAccidentInfo.getCreateName());
        }
        if (insElderAccidentInfo.getCreateDept() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getCreateDept, insElderAccidentInfo.getCreateDept());
        }
        if (insElderAccidentInfo.getCreateTime() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getCreateTime, insElderAccidentInfo.getCreateTime());
        }
        if (insElderAccidentInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getUpdateUser, insElderAccidentInfo.getUpdateUser());
        }
        if (insElderAccidentInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getUpdateTime, insElderAccidentInfo.getUpdateTime());
        }
        if (insElderAccidentInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getIsDeleted, insElderAccidentInfo.getIsDeleted());
        }
        if (insElderAccidentInfo.getStatus() != null) {
            queryWrapper.eq(InsElderAccidentInfo::getStatus, insElderAccidentInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderAccidentInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderAccidentInfo insert(InsElderAccidentInfo insElderAccidentInfo) {
        insElderAccidentInfo.setId(null);
        getBaseMapper().insert(insElderAccidentInfo);
        return insElderAccidentInfo;
    }

    /**
    * 更新数据
    *
    * @param insElderAccidentInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderAccidentInfo update(InsElderAccidentInfo insElderAccidentInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderAccidentInfo> chainWrapper = new LambdaUpdateChainWrapper<InsElderAccidentInfo>(getBaseMapper());
        if (insElderAccidentInfo.getId() != null) {
            chainWrapper.set(InsElderAccidentInfo::getId, insElderAccidentInfo.getId());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getTenantId())) {
            chainWrapper.set(InsElderAccidentInfo::getTenantId, insElderAccidentInfo.getTenantId());
        }
        if (insElderAccidentInfo.getCorpId() != null) {
            chainWrapper.set(InsElderAccidentInfo::getCorpId, insElderAccidentInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getCorpName())) {
            chainWrapper.set(InsElderAccidentInfo::getCorpName, insElderAccidentInfo.getCorpName());
        }
        if (insElderAccidentInfo.getInstitutionId() != null) {
            chainWrapper.set(InsElderAccidentInfo::getInstitutionId, insElderAccidentInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getInstitutionName())) {
            chainWrapper.set(InsElderAccidentInfo::getInstitutionName, insElderAccidentInfo.getInstitutionName());
        }
        if (insElderAccidentInfo.getCheckId() != null) {
            chainWrapper.set(InsElderAccidentInfo::getCheckId, insElderAccidentInfo.getCheckId());
        }
        if (insElderAccidentInfo.getCheckDate() != null) {
            chainWrapper.set(InsElderAccidentInfo::getCheckDate, insElderAccidentInfo.getCheckDate());
        }
        if (insElderAccidentInfo.getElderId() != null) {
            chainWrapper.set(InsElderAccidentInfo::getElderId, insElderAccidentInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getElderName())) {
            chainWrapper.set(InsElderAccidentInfo::getElderName, insElderAccidentInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getIdCard())) {
            chainWrapper.set(InsElderAccidentInfo::getIdCard, insElderAccidentInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getSex())) {
            chainWrapper.set(InsElderAccidentInfo::getSex, insElderAccidentInfo.getSex());
        }
        if (insElderAccidentInfo.getOccurTime() != null) {
            chainWrapper.set(InsElderAccidentInfo::getOccurTime, insElderAccidentInfo.getOccurTime());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getAccidentType())) {
            chainWrapper.set(InsElderAccidentInfo::getAccidentType, insElderAccidentInfo.getAccidentType());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getAccidentReason())) {
            chainWrapper.set(InsElderAccidentInfo::getAccidentReason, insElderAccidentInfo.getAccidentReason());
        }
        if (insElderAccidentInfo.getNursingStaffId() != null) {
            chainWrapper.set(InsElderAccidentInfo::getNursingStaffId, insElderAccidentInfo.getNursingStaffId());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getNursingStaffName())) {
            chainWrapper.set(InsElderAccidentInfo::getNursingStaffName, insElderAccidentInfo.getNursingStaffName());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getHandlingResult())) {
            chainWrapper.set(InsElderAccidentInfo::getHandlingResult, insElderAccidentInfo.getHandlingResult());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getRemark())) {
            chainWrapper.set(InsElderAccidentInfo::getRemark, insElderAccidentInfo.getRemark());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getFilePath())) {
            chainWrapper.set(InsElderAccidentInfo::getFilePath, insElderAccidentInfo.getFilePath());
        }
        if (insElderAccidentInfo.getCreateUser() != null) {
            chainWrapper.set(InsElderAccidentInfo::getCreateUser, insElderAccidentInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderAccidentInfo.getCreateName())) {
            chainWrapper.set(InsElderAccidentInfo::getCreateName, insElderAccidentInfo.getCreateName());
        }
        if (insElderAccidentInfo.getCreateDept() != null) {
            chainWrapper.set(InsElderAccidentInfo::getCreateDept, insElderAccidentInfo.getCreateDept());
        }
        if (insElderAccidentInfo.getCreateTime() != null) {
            chainWrapper.set(InsElderAccidentInfo::getCreateTime, insElderAccidentInfo.getCreateTime());
        }
        if (insElderAccidentInfo.getUpdateUser() != null) {
            chainWrapper.set(InsElderAccidentInfo::getUpdateUser, insElderAccidentInfo.getUpdateUser());
        }
        if (insElderAccidentInfo.getUpdateTime() != null) {
            chainWrapper.set(InsElderAccidentInfo::getUpdateTime, insElderAccidentInfo.getUpdateTime());
        }
        if (insElderAccidentInfo.getIsDeleted() != null) {
            chainWrapper.set(InsElderAccidentInfo::getIsDeleted, insElderAccidentInfo.getIsDeleted());
        }
        if (insElderAccidentInfo.getStatus() != null) {
            chainWrapper.set(InsElderAccidentInfo::getStatus, insElderAccidentInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderAccidentInfo::getId, insElderAccidentInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderAccidentInfo.getId());
        } else {
            return insElderAccidentInfo;
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
    public boolean saveInsElderAccidentInfoBatch(List<InsElderAccidentInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderAccidentInfo insElderAccidentInfo : insertList) {
            //使用默认的雪花算法生成
            insElderAccidentInfo.setId(null);
            //insElderAccidentInfo.setCreatedDt(currentDte);
            //insElderAccidentInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderAccidentInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderAccidentInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


