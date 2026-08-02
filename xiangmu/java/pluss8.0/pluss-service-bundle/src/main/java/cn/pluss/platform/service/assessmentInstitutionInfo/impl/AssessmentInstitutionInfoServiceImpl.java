package cn.pluss.platform.service.assessmentInstitutionInfo.impl;

import cn.pluss.platform.mapper.AssessmentInstitutionInfoMapper;
import cn.pluss.platform.model.entity.AssessmentInstitutionInfo;
import cn.pluss.platform.service.assessmentInstitutionInfo.AssessmentInstitutionInfoService;
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
@Service("assessmentInstitutionInfoService")
public class AssessmentInstitutionInfoServiceImpl extends ServiceImpl< AssessmentInstitutionInfoMapper, AssessmentInstitutionInfo> implements AssessmentInstitutionInfoService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentInstitutionInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentInstitutionInfo> queryPage(Map map) {
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
    public AssessmentInstitutionInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentInstitutionInfo 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentInstitutionInfo queryOne(AssessmentInstitutionInfo assessmentInstitutionInfo){
        LambdaQueryWrapper<AssessmentInstitutionInfo> queryWrapper = getQueryWrapper(assessmentInstitutionInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentInstitutionInfo
    * @return
    */
    @Override
    public List<AssessmentInstitutionInfo> queryList(AssessmentInstitutionInfo assessmentInstitutionInfo) {
        LambdaQueryWrapper<AssessmentInstitutionInfo> queryWrapper = getQueryWrapper(assessmentInstitutionInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentInstitutionInfo
    * @return
    */
    public static LambdaQueryWrapper<AssessmentInstitutionInfo> getQueryWrapper(AssessmentInstitutionInfo assessmentInstitutionInfo){
        LambdaQueryWrapper<AssessmentInstitutionInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentInstitutionInfo.getId() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getId, assessmentInstitutionInfo.getId());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getTenantId())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getTenantId, assessmentInstitutionInfo.getTenantId());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getInstitutionCode())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getInstitutionCode, assessmentInstitutionInfo.getInstitutionCode());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getInstitutionImg())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getInstitutionImg, assessmentInstitutionInfo.getInstitutionImg());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getLicenseImg())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getLicenseImg, assessmentInstitutionInfo.getLicenseImg());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getInstitutionName())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getInstitutionName, assessmentInstitutionInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getCreditCode())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getCreditCode, assessmentInstitutionInfo.getCreditCode());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getLegalMan())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getLegalMan, assessmentInstitutionInfo.getLegalMan());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getLegalLinkTel())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getLegalLinkTel, assessmentInstitutionInfo.getLegalLinkTel());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getIdCard())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getIdCard, assessmentInstitutionInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getManager())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getManager, assessmentInstitutionInfo.getManager());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getLinkTel())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getLinkTel, assessmentInstitutionInfo.getLinkTel());
        }
        if (assessmentInstitutionInfo.getEstablishDate() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getEstablishDate, assessmentInstitutionInfo.getEstablishDate());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getRegistrar())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getRegistrar, assessmentInstitutionInfo.getRegistrar());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getBusinessArea())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getBusinessArea, assessmentInstitutionInfo.getBusinessArea());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getAddress())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getAddress, assessmentInstitutionInfo.getAddress());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getUsername())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getUsername, assessmentInstitutionInfo.getUsername());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getPassword())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getPassword, assessmentInstitutionInfo.getPassword());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getInstitutionBrief())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getInstitutionBrief, assessmentInstitutionInfo.getInstitutionBrief());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getInstitutionStatus())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getInstitutionStatus, assessmentInstitutionInfo.getInstitutionStatus());
        }
        if (assessmentInstitutionInfo.getAreaCode() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getAreaCode, assessmentInstitutionInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getAreaName())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getAreaName, assessmentInstitutionInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getRemark())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getRemark, assessmentInstitutionInfo.getRemark());
        }
        if (assessmentInstitutionInfo.getCreateUser() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getCreateUser, assessmentInstitutionInfo.getCreateUser());
        }
        if (assessmentInstitutionInfo.getCreateDept() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getCreateDept, assessmentInstitutionInfo.getCreateDept());
        }
        if (assessmentInstitutionInfo.getCreateTime() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getCreateTime, assessmentInstitutionInfo.getCreateTime());
        }
        if (assessmentInstitutionInfo.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getUpdateUser, assessmentInstitutionInfo.getUpdateUser());
        }
        if (assessmentInstitutionInfo.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getUpdateTime, assessmentInstitutionInfo.getUpdateTime());
        }
        if (assessmentInstitutionInfo.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getIsDeleted, assessmentInstitutionInfo.getIsDeleted());
        }
        if (assessmentInstitutionInfo.getStatus() != null) {
            queryWrapper.eq(AssessmentInstitutionInfo::getStatus, assessmentInstitutionInfo.getStatus());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getInstitutionType())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getInstitutionType, assessmentInstitutionInfo.getInstitutionType());
        }
        if (StringUtil.isNotEmpty(assessmentInstitutionInfo.getManageLevel())) {
            queryWrapper.eq(AssessmentInstitutionInfo::getManageLevel, assessmentInstitutionInfo.getManageLevel());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentInstitutionInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentInstitutionInfo insert(AssessmentInstitutionInfo assessmentInstitutionInfo) {
        assessmentInstitutionInfo.setId(null);
        getBaseMapper().insert(assessmentInstitutionInfo);
        return assessmentInstitutionInfo;
    }

    /**
    * 更新数据
    *
    * @param assessmentInstitutionInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentInstitutionInfo update(AssessmentInstitutionInfo assessmentInstitutionInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentInstitutionInfo> chainWrapper = new LambdaUpdateChainWrapper<AssessmentInstitutionInfo>(getBaseMapper());
        if (assessmentInstitutionInfo.getId() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getId, assessmentInstitutionInfo.getId());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getTenantId())) {
            chainWrapper.set(AssessmentInstitutionInfo::getTenantId, assessmentInstitutionInfo.getTenantId());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getInstitutionCode())) {
            chainWrapper.set(AssessmentInstitutionInfo::getInstitutionCode, assessmentInstitutionInfo.getInstitutionCode());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getInstitutionImg())) {
            chainWrapper.set(AssessmentInstitutionInfo::getInstitutionImg, assessmentInstitutionInfo.getInstitutionImg());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getLicenseImg())) {
            chainWrapper.set(AssessmentInstitutionInfo::getLicenseImg, assessmentInstitutionInfo.getLicenseImg());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getInstitutionName())) {
            chainWrapper.set(AssessmentInstitutionInfo::getInstitutionName, assessmentInstitutionInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getCreditCode())) {
            chainWrapper.set(AssessmentInstitutionInfo::getCreditCode, assessmentInstitutionInfo.getCreditCode());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getLegalMan())) {
            chainWrapper.set(AssessmentInstitutionInfo::getLegalMan, assessmentInstitutionInfo.getLegalMan());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getLegalLinkTel())) {
            chainWrapper.set(AssessmentInstitutionInfo::getLegalLinkTel, assessmentInstitutionInfo.getLegalLinkTel());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getIdCard())) {
            chainWrapper.set(AssessmentInstitutionInfo::getIdCard, assessmentInstitutionInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getManager())) {
            chainWrapper.set(AssessmentInstitutionInfo::getManager, assessmentInstitutionInfo.getManager());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getLinkTel())) {
            chainWrapper.set(AssessmentInstitutionInfo::getLinkTel, assessmentInstitutionInfo.getLinkTel());
        }
        if (assessmentInstitutionInfo.getEstablishDate() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getEstablishDate, assessmentInstitutionInfo.getEstablishDate());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getRegistrar())) {
            chainWrapper.set(AssessmentInstitutionInfo::getRegistrar, assessmentInstitutionInfo.getRegistrar());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getBusinessArea())) {
            chainWrapper.set(AssessmentInstitutionInfo::getBusinessArea, assessmentInstitutionInfo.getBusinessArea());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getAddress())) {
            chainWrapper.set(AssessmentInstitutionInfo::getAddress, assessmentInstitutionInfo.getAddress());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getUsername())) {
            chainWrapper.set(AssessmentInstitutionInfo::getUsername, assessmentInstitutionInfo.getUsername());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getPassword())) {
            chainWrapper.set(AssessmentInstitutionInfo::getPassword, assessmentInstitutionInfo.getPassword());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getInstitutionBrief())) {
            chainWrapper.set(AssessmentInstitutionInfo::getInstitutionBrief, assessmentInstitutionInfo.getInstitutionBrief());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getInstitutionStatus())) {
            chainWrapper.set(AssessmentInstitutionInfo::getInstitutionStatus, assessmentInstitutionInfo.getInstitutionStatus());
        }
        if (assessmentInstitutionInfo.getAreaCode() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getAreaCode, assessmentInstitutionInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getAreaName())) {
            chainWrapper.set(AssessmentInstitutionInfo::getAreaName, assessmentInstitutionInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getRemark())) {
            chainWrapper.set(AssessmentInstitutionInfo::getRemark, assessmentInstitutionInfo.getRemark());
        }
        if (assessmentInstitutionInfo.getCreateUser() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getCreateUser, assessmentInstitutionInfo.getCreateUser());
        }
        if (assessmentInstitutionInfo.getCreateDept() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getCreateDept, assessmentInstitutionInfo.getCreateDept());
        }
        if (assessmentInstitutionInfo.getCreateTime() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getCreateTime, assessmentInstitutionInfo.getCreateTime());
        }
        if (assessmentInstitutionInfo.getUpdateUser() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getUpdateUser, assessmentInstitutionInfo.getUpdateUser());
        }
        if (assessmentInstitutionInfo.getUpdateTime() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getUpdateTime, assessmentInstitutionInfo.getUpdateTime());
        }
        if (assessmentInstitutionInfo.getIsDeleted() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getIsDeleted, assessmentInstitutionInfo.getIsDeleted());
        }
        if (assessmentInstitutionInfo.getStatus() != null) {
            chainWrapper.set(AssessmentInstitutionInfo::getStatus, assessmentInstitutionInfo.getStatus());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getInstitutionType())) {
            chainWrapper.set(AssessmentInstitutionInfo::getInstitutionType, assessmentInstitutionInfo.getInstitutionType());
        }
        if (StringUtil.isNotBlank(assessmentInstitutionInfo.getManageLevel())) {
            chainWrapper.set(AssessmentInstitutionInfo::getManageLevel, assessmentInstitutionInfo.getManageLevel());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentInstitutionInfo::getId, assessmentInstitutionInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentInstitutionInfo.getId());
        } else {
            return assessmentInstitutionInfo;
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
    public boolean saveAssessmentInstitutionInfoBatch(List<AssessmentInstitutionInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentInstitutionInfo assessmentInstitutionInfo : insertList) {
            //使用默认的雪花算法生成
            assessmentInstitutionInfo.setId(null);
            //assessmentInstitutionInfo.setCreatedDt(currentDte);
            //assessmentInstitutionInfo.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentInstitutionInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentInstitutionInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


