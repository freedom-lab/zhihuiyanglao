package cn.pluss.platform.service.insRegisterVisitInfo.impl;

import cn.pluss.platform.mapper.InsRegisterVisitInfoMapper;
import cn.pluss.platform.model.entity.InsRegisterVisitInfo;
import cn.pluss.platform.service.insRegisterVisitInfo.InsRegisterVisitInfoService;
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
@Service("insRegisterVisitInfoService")
public class InsRegisterVisitInfoServiceImpl extends ServiceImpl< InsRegisterVisitInfoMapper, InsRegisterVisitInfo> implements InsRegisterVisitInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsRegisterVisitInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsRegisterVisitInfo> queryPage(Map map) {
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
    public InsRegisterVisitInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insRegisterVisitInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsRegisterVisitInfo queryOne(InsRegisterVisitInfo insRegisterVisitInfo){
        LambdaQueryWrapper<InsRegisterVisitInfo> queryWrapper = getQueryWrapper(insRegisterVisitInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insRegisterVisitInfo
    * @return
    */
    @Override
    public List<InsRegisterVisitInfo> queryList(InsRegisterVisitInfo insRegisterVisitInfo) {
        LambdaQueryWrapper<InsRegisterVisitInfo> queryWrapper = getQueryWrapper(insRegisterVisitInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insRegisterVisitInfo
    * @return
    */
    public static LambdaQueryWrapper<InsRegisterVisitInfo> getQueryWrapper(InsRegisterVisitInfo insRegisterVisitInfo){
        LambdaQueryWrapper<InsRegisterVisitInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insRegisterVisitInfo.getId() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getId, insRegisterVisitInfo.getId());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getTenantId())) {
            queryWrapper.eq(InsRegisterVisitInfo::getTenantId, insRegisterVisitInfo.getTenantId());
        }
        if (insRegisterVisitInfo.getCorpId() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getCorpId, insRegisterVisitInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getCorpName())) {
            queryWrapper.eq(InsRegisterVisitInfo::getCorpName, insRegisterVisitInfo.getCorpName());
        }
        if (insRegisterVisitInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getInstitutionId, insRegisterVisitInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getInstitutionName())) {
            queryWrapper.eq(InsRegisterVisitInfo::getInstitutionName, insRegisterVisitInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getVisitName())) {
            queryWrapper.eq(InsRegisterVisitInfo::getVisitName, insRegisterVisitInfo.getVisitName());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getVisitLinkTel())) {
            queryWrapper.eq(InsRegisterVisitInfo::getVisitLinkTel, insRegisterVisitInfo.getVisitLinkTel());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getDocumentType())) {
            queryWrapper.eq(InsRegisterVisitInfo::getDocumentType, insRegisterVisitInfo.getDocumentType());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getDocumentCode())) {
            queryWrapper.eq(InsRegisterVisitInfo::getDocumentCode, insRegisterVisitInfo.getDocumentCode());
        }
        if (insRegisterVisitInfo.getVisitTime() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getVisitTime, insRegisterVisitInfo.getVisitTime());
        }
        if (insRegisterVisitInfo.getVisitNum() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getVisitNum, insRegisterVisitInfo.getVisitNum());
        }
        if (insRegisterVisitInfo.getPlanLeaveTime() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getPlanLeaveTime, insRegisterVisitInfo.getPlanLeaveTime());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getRelationType())) {
            queryWrapper.eq(InsRegisterVisitInfo::getRelationType, insRegisterVisitInfo.getRelationType());
        }
        if (insRegisterVisitInfo.getElderId() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getElderId, insRegisterVisitInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getElderName())) {
            queryWrapper.eq(InsRegisterVisitInfo::getElderName, insRegisterVisitInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getIdCard())) {
            queryWrapper.eq(InsRegisterVisitInfo::getIdCard, insRegisterVisitInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getLinkTel())) {
            queryWrapper.eq(InsRegisterVisitInfo::getLinkTel, insRegisterVisitInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getSex())) {
            queryWrapper.eq(InsRegisterVisitInfo::getSex, insRegisterVisitInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getBedInfo())) {
            queryWrapper.eq(InsRegisterVisitInfo::getBedInfo, insRegisterVisitInfo.getBedInfo());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getBelongings())) {
            queryWrapper.eq(InsRegisterVisitInfo::getBelongings, insRegisterVisitInfo.getBelongings());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getFilePath())) {
            queryWrapper.eq(InsRegisterVisitInfo::getFilePath, insRegisterVisitInfo.getFilePath());
        }
        if (insRegisterVisitInfo.getFromRisk() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getFromRisk, insRegisterVisitInfo.getFromRisk());
        }
        if (insRegisterVisitInfo.getTemperature() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getTemperature, insRegisterVisitInfo.getTemperature());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getIsAgree())) {
            queryWrapper.eq(InsRegisterVisitInfo::getIsAgree, insRegisterVisitInfo.getIsAgree());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getAgreeExplain())) {
            queryWrapper.eq(InsRegisterVisitInfo::getAgreeExplain, insRegisterVisitInfo.getAgreeExplain());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getAgreeName())) {
            queryWrapper.eq(InsRegisterVisitInfo::getAgreeName, insRegisterVisitInfo.getAgreeName());
        }
        if (insRegisterVisitInfo.getAgreeTime() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getAgreeTime, insRegisterVisitInfo.getAgreeTime());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getAreaCode())) {
            queryWrapper.eq(InsRegisterVisitInfo::getAreaCode, insRegisterVisitInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getAreaName())) {
            queryWrapper.eq(InsRegisterVisitInfo::getAreaName, insRegisterVisitInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getRemark())) {
            queryWrapper.eq(InsRegisterVisitInfo::getRemark, insRegisterVisitInfo.getRemark());
        }
        if (insRegisterVisitInfo.getCreateUser() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getCreateUser, insRegisterVisitInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insRegisterVisitInfo.getCreateName())) {
            queryWrapper.eq(InsRegisterVisitInfo::getCreateName, insRegisterVisitInfo.getCreateName());
        }
        if (insRegisterVisitInfo.getCreateDept() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getCreateDept, insRegisterVisitInfo.getCreateDept());
        }
        if (insRegisterVisitInfo.getCreateTime() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getCreateTime, insRegisterVisitInfo.getCreateTime());
        }
        if (insRegisterVisitInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getUpdateUser, insRegisterVisitInfo.getUpdateUser());
        }
        if (insRegisterVisitInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getUpdateTime, insRegisterVisitInfo.getUpdateTime());
        }
        if (insRegisterVisitInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getIsDeleted, insRegisterVisitInfo.getIsDeleted());
        }
        if (insRegisterVisitInfo.getStatus() != null) {
            queryWrapper.eq(InsRegisterVisitInfo::getStatus, insRegisterVisitInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insRegisterVisitInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsRegisterVisitInfo insert(InsRegisterVisitInfo insRegisterVisitInfo) {
        insRegisterVisitInfo.setId(null);
        getBaseMapper().insert(insRegisterVisitInfo);
        return insRegisterVisitInfo;
    }

    /**
    * 更新数据
    *
    * @param insRegisterVisitInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsRegisterVisitInfo update(InsRegisterVisitInfo insRegisterVisitInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsRegisterVisitInfo> chainWrapper = new LambdaUpdateChainWrapper<InsRegisterVisitInfo>(getBaseMapper());
        if (insRegisterVisitInfo.getId() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getId, insRegisterVisitInfo.getId());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getTenantId())) {
            chainWrapper.set(InsRegisterVisitInfo::getTenantId, insRegisterVisitInfo.getTenantId());
        }
        if (insRegisterVisitInfo.getCorpId() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getCorpId, insRegisterVisitInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getCorpName())) {
            chainWrapper.set(InsRegisterVisitInfo::getCorpName, insRegisterVisitInfo.getCorpName());
        }
        if (insRegisterVisitInfo.getInstitutionId() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getInstitutionId, insRegisterVisitInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getInstitutionName())) {
            chainWrapper.set(InsRegisterVisitInfo::getInstitutionName, insRegisterVisitInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getVisitName())) {
            chainWrapper.set(InsRegisterVisitInfo::getVisitName, insRegisterVisitInfo.getVisitName());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getVisitLinkTel())) {
            chainWrapper.set(InsRegisterVisitInfo::getVisitLinkTel, insRegisterVisitInfo.getVisitLinkTel());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getDocumentType())) {
            chainWrapper.set(InsRegisterVisitInfo::getDocumentType, insRegisterVisitInfo.getDocumentType());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getDocumentCode())) {
            chainWrapper.set(InsRegisterVisitInfo::getDocumentCode, insRegisterVisitInfo.getDocumentCode());
        }
        if (insRegisterVisitInfo.getVisitTime() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getVisitTime, insRegisterVisitInfo.getVisitTime());
        }
        if (insRegisterVisitInfo.getVisitNum() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getVisitNum, insRegisterVisitInfo.getVisitNum());
        }
        if (insRegisterVisitInfo.getPlanLeaveTime() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getPlanLeaveTime, insRegisterVisitInfo.getPlanLeaveTime());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getRelationType())) {
            chainWrapper.set(InsRegisterVisitInfo::getRelationType, insRegisterVisitInfo.getRelationType());
        }
        if (insRegisterVisitInfo.getElderId() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getElderId, insRegisterVisitInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getElderName())) {
            chainWrapper.set(InsRegisterVisitInfo::getElderName, insRegisterVisitInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getIdCard())) {
            chainWrapper.set(InsRegisterVisitInfo::getIdCard, insRegisterVisitInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getLinkTel())) {
            chainWrapper.set(InsRegisterVisitInfo::getLinkTel, insRegisterVisitInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getSex())) {
            chainWrapper.set(InsRegisterVisitInfo::getSex, insRegisterVisitInfo.getSex());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getBedInfo())) {
            chainWrapper.set(InsRegisterVisitInfo::getBedInfo, insRegisterVisitInfo.getBedInfo());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getBelongings())) {
            chainWrapper.set(InsRegisterVisitInfo::getBelongings, insRegisterVisitInfo.getBelongings());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getFilePath())) {
            chainWrapper.set(InsRegisterVisitInfo::getFilePath, insRegisterVisitInfo.getFilePath());
        }
        if (insRegisterVisitInfo.getFromRisk() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getFromRisk, insRegisterVisitInfo.getFromRisk());
        }
        if (insRegisterVisitInfo.getTemperature() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getTemperature, insRegisterVisitInfo.getTemperature());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getIsAgree())) {
            chainWrapper.set(InsRegisterVisitInfo::getIsAgree, insRegisterVisitInfo.getIsAgree());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getAgreeExplain())) {
            chainWrapper.set(InsRegisterVisitInfo::getAgreeExplain, insRegisterVisitInfo.getAgreeExplain());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getAgreeName())) {
            chainWrapper.set(InsRegisterVisitInfo::getAgreeName, insRegisterVisitInfo.getAgreeName());
        }
        if (insRegisterVisitInfo.getAgreeTime() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getAgreeTime, insRegisterVisitInfo.getAgreeTime());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getAreaCode())) {
            chainWrapper.set(InsRegisterVisitInfo::getAreaCode, insRegisterVisitInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getAreaName())) {
            chainWrapper.set(InsRegisterVisitInfo::getAreaName, insRegisterVisitInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getRemark())) {
            chainWrapper.set(InsRegisterVisitInfo::getRemark, insRegisterVisitInfo.getRemark());
        }
        if (insRegisterVisitInfo.getCreateUser() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getCreateUser, insRegisterVisitInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insRegisterVisitInfo.getCreateName())) {
            chainWrapper.set(InsRegisterVisitInfo::getCreateName, insRegisterVisitInfo.getCreateName());
        }
        if (insRegisterVisitInfo.getCreateDept() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getCreateDept, insRegisterVisitInfo.getCreateDept());
        }
        if (insRegisterVisitInfo.getCreateTime() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getCreateTime, insRegisterVisitInfo.getCreateTime());
        }
        if (insRegisterVisitInfo.getUpdateUser() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getUpdateUser, insRegisterVisitInfo.getUpdateUser());
        }
        if (insRegisterVisitInfo.getUpdateTime() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getUpdateTime, insRegisterVisitInfo.getUpdateTime());
        }
        if (insRegisterVisitInfo.getIsDeleted() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getIsDeleted, insRegisterVisitInfo.getIsDeleted());
        }
        if (insRegisterVisitInfo.getStatus() != null) {
            chainWrapper.set(InsRegisterVisitInfo::getStatus, insRegisterVisitInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsRegisterVisitInfo::getId, insRegisterVisitInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insRegisterVisitInfo.getId());
        } else {
            return insRegisterVisitInfo;
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
    public boolean saveInsRegisterVisitInfoBatch(List<InsRegisterVisitInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsRegisterVisitInfo insRegisterVisitInfo : insertList) {
            //使用默认的雪花算法生成
            insRegisterVisitInfo.setId(null);
            //insRegisterVisitInfo.setCreatedDt(currentDte);
            //insRegisterVisitInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsRegisterVisitInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsRegisterVisitInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


