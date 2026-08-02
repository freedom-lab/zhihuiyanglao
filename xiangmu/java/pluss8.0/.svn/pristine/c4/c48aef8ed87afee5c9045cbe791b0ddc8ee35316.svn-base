package cn.pluss.platform.service.assessmentPersonInfo.impl;

import cn.pluss.platform.mapper.AssessmentPersonInfoMapper;
import cn.pluss.platform.model.entity.AssessmentPersonInfo;
import cn.pluss.platform.service.assessmentPersonInfo.AssessmentPersonInfoService;
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
@Service("assessmentPersonInfoService")
public class AssessmentPersonInfoServiceImpl extends ServiceImpl< AssessmentPersonInfoMapper, AssessmentPersonInfo> implements AssessmentPersonInfoService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentPersonInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentPersonInfo> queryPage(Map map) {
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
    public AssessmentPersonInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentPersonInfo 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentPersonInfo queryOne(AssessmentPersonInfo assessmentPersonInfo){
        LambdaQueryWrapper<AssessmentPersonInfo> queryWrapper = getQueryWrapper(assessmentPersonInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentPersonInfo
    * @return
    */
    @Override
    public List<AssessmentPersonInfo> queryList(AssessmentPersonInfo assessmentPersonInfo) {
        LambdaQueryWrapper<AssessmentPersonInfo> queryWrapper = getQueryWrapper(assessmentPersonInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentPersonInfo
    * @return
    */
    public static LambdaQueryWrapper<AssessmentPersonInfo> getQueryWrapper(AssessmentPersonInfo assessmentPersonInfo){
        LambdaQueryWrapper<AssessmentPersonInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentPersonInfo.getId() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getId, assessmentPersonInfo.getId());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getTenantId())) {
            queryWrapper.eq(AssessmentPersonInfo::getTenantId, assessmentPersonInfo.getTenantId());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getInstitutionId())) {
            queryWrapper.eq(AssessmentPersonInfo::getInstitutionId, assessmentPersonInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getInstitutionName())) {
            queryWrapper.eq(AssessmentPersonInfo::getInstitutionName, assessmentPersonInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getPersonCode())) {
            queryWrapper.eq(AssessmentPersonInfo::getPersonCode, assessmentPersonInfo.getPersonCode());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getPersonName())) {
            queryWrapper.eq(AssessmentPersonInfo::getPersonName, assessmentPersonInfo.getPersonName());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getSex())) {
            queryWrapper.eq(AssessmentPersonInfo::getSex, assessmentPersonInfo.getSex());
        }
        if (assessmentPersonInfo.getAge() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getAge, assessmentPersonInfo.getAge());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getLinkTel())) {
            queryWrapper.eq(AssessmentPersonInfo::getLinkTel, assessmentPersonInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getPassword())) {
            queryWrapper.eq(AssessmentPersonInfo::getPassword, assessmentPersonInfo.getPassword());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getSkillLevel())) {
            queryWrapper.eq(AssessmentPersonInfo::getSkillLevel, assessmentPersonInfo.getSkillLevel());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getDocumentType())) {
            queryWrapper.eq(AssessmentPersonInfo::getDocumentType, assessmentPersonInfo.getDocumentType());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getIdCard())) {
            queryWrapper.eq(AssessmentPersonInfo::getIdCard, assessmentPersonInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getSpecialAbility())) {
            queryWrapper.eq(AssessmentPersonInfo::getSpecialAbility, assessmentPersonInfo.getSpecialAbility());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getIdCardPatha())) {
            queryWrapper.eq(AssessmentPersonInfo::getIdCardPatha, assessmentPersonInfo.getIdCardPatha());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getIdCardPathb())) {
            queryWrapper.eq(AssessmentPersonInfo::getIdCardPathb, assessmentPersonInfo.getIdCardPathb());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getNation())) {
            queryWrapper.eq(AssessmentPersonInfo::getNation, assessmentPersonInfo.getNation());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getDegreeEducation())) {
            queryWrapper.eq(AssessmentPersonInfo::getDegreeEducation, assessmentPersonInfo.getDegreeEducation());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getDutyType())) {
            queryWrapper.eq(AssessmentPersonInfo::getDutyType, assessmentPersonInfo.getDutyType());
        }
        if (assessmentPersonInfo.getEntryDate() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getEntryDate, assessmentPersonInfo.getEntryDate());
        }
        if (assessmentPersonInfo.getDimissionDate() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getDimissionDate, assessmentPersonInfo.getDimissionDate());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getPhoto())) {
            queryWrapper.eq(AssessmentPersonInfo::getPhoto, assessmentPersonInfo.getPhoto());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getAddress())) {
            queryWrapper.eq(AssessmentPersonInfo::getAddress, assessmentPersonInfo.getAddress());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getCertificateImg())) {
            queryWrapper.eq(AssessmentPersonInfo::getCertificateImg, assessmentPersonInfo.getCertificateImg());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getMemo())) {
            queryWrapper.eq(AssessmentPersonInfo::getMemo, assessmentPersonInfo.getMemo());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getRemark())) {
            queryWrapper.eq(AssessmentPersonInfo::getRemark, assessmentPersonInfo.getRemark());
        }
        if (assessmentPersonInfo.getCreateUser() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getCreateUser, assessmentPersonInfo.getCreateUser());
        }
        if (assessmentPersonInfo.getCreateDept() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getCreateDept, assessmentPersonInfo.getCreateDept());
        }
        if (assessmentPersonInfo.getCreateTime() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getCreateTime, assessmentPersonInfo.getCreateTime());
        }
        if (assessmentPersonInfo.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getUpdateUser, assessmentPersonInfo.getUpdateUser());
        }
        if (assessmentPersonInfo.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getUpdateTime, assessmentPersonInfo.getUpdateTime());
        }
        if (StringUtil.isNotEmpty(assessmentPersonInfo.getServerState())) {
            queryWrapper.eq(AssessmentPersonInfo::getServerState, assessmentPersonInfo.getServerState());
        }
        if (assessmentPersonInfo.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getIsDeleted, assessmentPersonInfo.getIsDeleted());
        }
        if (assessmentPersonInfo.getStatus() != null) {
            queryWrapper.eq(AssessmentPersonInfo::getStatus, assessmentPersonInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentPersonInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentPersonInfo insert(AssessmentPersonInfo assessmentPersonInfo) {
        assessmentPersonInfo.setId(null);
        getBaseMapper().insert(assessmentPersonInfo);
        return assessmentPersonInfo;
    }

    /**
    * 更新数据
    *
    * @param assessmentPersonInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentPersonInfo update(AssessmentPersonInfo assessmentPersonInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentPersonInfo> chainWrapper = new LambdaUpdateChainWrapper<AssessmentPersonInfo>(getBaseMapper());
        if (assessmentPersonInfo.getId() != null) {
            chainWrapper.set(AssessmentPersonInfo::getId, assessmentPersonInfo.getId());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getTenantId())) {
            chainWrapper.set(AssessmentPersonInfo::getTenantId, assessmentPersonInfo.getTenantId());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getInstitutionId())) {
            chainWrapper.set(AssessmentPersonInfo::getInstitutionId, assessmentPersonInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getInstitutionName())) {
            chainWrapper.set(AssessmentPersonInfo::getInstitutionName, assessmentPersonInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getPersonCode())) {
            chainWrapper.set(AssessmentPersonInfo::getPersonCode, assessmentPersonInfo.getPersonCode());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getPersonName())) {
            chainWrapper.set(AssessmentPersonInfo::getPersonName, assessmentPersonInfo.getPersonName());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getSex())) {
            chainWrapper.set(AssessmentPersonInfo::getSex, assessmentPersonInfo.getSex());
        }
        if (assessmentPersonInfo.getAge() != null) {
            chainWrapper.set(AssessmentPersonInfo::getAge, assessmentPersonInfo.getAge());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getLinkTel())) {
            chainWrapper.set(AssessmentPersonInfo::getLinkTel, assessmentPersonInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getPassword())) {
            chainWrapper.set(AssessmentPersonInfo::getPassword, assessmentPersonInfo.getPassword());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getSkillLevel())) {
            chainWrapper.set(AssessmentPersonInfo::getSkillLevel, assessmentPersonInfo.getSkillLevel());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getDocumentType())) {
            chainWrapper.set(AssessmentPersonInfo::getDocumentType, assessmentPersonInfo.getDocumentType());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getIdCard())) {
            chainWrapper.set(AssessmentPersonInfo::getIdCard, assessmentPersonInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getSpecialAbility())) {
            chainWrapper.set(AssessmentPersonInfo::getSpecialAbility, assessmentPersonInfo.getSpecialAbility());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getIdCardPatha())) {
            chainWrapper.set(AssessmentPersonInfo::getIdCardPatha, assessmentPersonInfo.getIdCardPatha());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getIdCardPathb())) {
            chainWrapper.set(AssessmentPersonInfo::getIdCardPathb, assessmentPersonInfo.getIdCardPathb());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getNation())) {
            chainWrapper.set(AssessmentPersonInfo::getNation, assessmentPersonInfo.getNation());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getDegreeEducation())) {
            chainWrapper.set(AssessmentPersonInfo::getDegreeEducation, assessmentPersonInfo.getDegreeEducation());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getDutyType())) {
            chainWrapper.set(AssessmentPersonInfo::getDutyType, assessmentPersonInfo.getDutyType());
        }
        if (assessmentPersonInfo.getEntryDate() != null) {
            chainWrapper.set(AssessmentPersonInfo::getEntryDate, assessmentPersonInfo.getEntryDate());
        }
        if (assessmentPersonInfo.getDimissionDate() != null) {
            chainWrapper.set(AssessmentPersonInfo::getDimissionDate, assessmentPersonInfo.getDimissionDate());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getPhoto())) {
            chainWrapper.set(AssessmentPersonInfo::getPhoto, assessmentPersonInfo.getPhoto());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getAddress())) {
            chainWrapper.set(AssessmentPersonInfo::getAddress, assessmentPersonInfo.getAddress());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getCertificateImg())) {
            chainWrapper.set(AssessmentPersonInfo::getCertificateImg, assessmentPersonInfo.getCertificateImg());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getMemo())) {
            chainWrapper.set(AssessmentPersonInfo::getMemo, assessmentPersonInfo.getMemo());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getRemark())) {
            chainWrapper.set(AssessmentPersonInfo::getRemark, assessmentPersonInfo.getRemark());
        }
        if (assessmentPersonInfo.getCreateUser() != null) {
            chainWrapper.set(AssessmentPersonInfo::getCreateUser, assessmentPersonInfo.getCreateUser());
        }
        if (assessmentPersonInfo.getCreateDept() != null) {
            chainWrapper.set(AssessmentPersonInfo::getCreateDept, assessmentPersonInfo.getCreateDept());
        }
        if (assessmentPersonInfo.getCreateTime() != null) {
            chainWrapper.set(AssessmentPersonInfo::getCreateTime, assessmentPersonInfo.getCreateTime());
        }
        if (assessmentPersonInfo.getUpdateUser() != null) {
            chainWrapper.set(AssessmentPersonInfo::getUpdateUser, assessmentPersonInfo.getUpdateUser());
        }
        if (assessmentPersonInfo.getUpdateTime() != null) {
            chainWrapper.set(AssessmentPersonInfo::getUpdateTime, assessmentPersonInfo.getUpdateTime());
        }
        if (StringUtil.isNotBlank(assessmentPersonInfo.getServerState())) {
            chainWrapper.set(AssessmentPersonInfo::getServerState, assessmentPersonInfo.getServerState());
        }
        if (assessmentPersonInfo.getIsDeleted() != null) {
            chainWrapper.set(AssessmentPersonInfo::getIsDeleted, assessmentPersonInfo.getIsDeleted());
        }
        if (assessmentPersonInfo.getStatus() != null) {
            chainWrapper.set(AssessmentPersonInfo::getStatus, assessmentPersonInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentPersonInfo::getId, assessmentPersonInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentPersonInfo.getId());
        } else {
            return assessmentPersonInfo;
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
    public boolean saveAssessmentPersonInfoBatch(List<AssessmentPersonInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentPersonInfo assessmentPersonInfo : insertList) {
            //使用默认的雪花算法生成
            assessmentPersonInfo.setId(null);
            //assessmentPersonInfo.setCreatedDt(currentDte);
            //assessmentPersonInfo.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentPersonInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentPersonInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


