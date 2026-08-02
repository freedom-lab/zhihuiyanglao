package cn.pluss.platform.service.insMedicalDrugInfo.impl;

import cn.pluss.platform.mapper.InsMedicalDrugInfoMapper;
import cn.pluss.platform.model.entity.InsMedicalDrugInfo;
import cn.pluss.platform.service.insMedicalDrugInfo.InsMedicalDrugInfoService;
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
@Service("insMedicalDrugInfoService")
public class InsMedicalDrugInfoServiceImpl extends ServiceImpl< InsMedicalDrugInfoMapper, InsMedicalDrugInfo> implements InsMedicalDrugInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsMedicalDrugInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsMedicalDrugInfo> queryPage(Map map) {
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
    public InsMedicalDrugInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalDrugInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsMedicalDrugInfo queryOne(InsMedicalDrugInfo insMedicalDrugInfo){
        LambdaQueryWrapper<InsMedicalDrugInfo> queryWrapper = getQueryWrapper(insMedicalDrugInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalDrugInfo
    * @return
    */
    @Override
    public List<InsMedicalDrugInfo> queryList(InsMedicalDrugInfo insMedicalDrugInfo) {
        LambdaQueryWrapper<InsMedicalDrugInfo> queryWrapper = getQueryWrapper(insMedicalDrugInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insMedicalDrugInfo
    * @return
    */
    public static LambdaQueryWrapper<InsMedicalDrugInfo> getQueryWrapper(InsMedicalDrugInfo insMedicalDrugInfo){
        LambdaQueryWrapper<InsMedicalDrugInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insMedicalDrugInfo.getId() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getId, insMedicalDrugInfo.getId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getTenantId())) {
            queryWrapper.eq(InsMedicalDrugInfo::getTenantId, insMedicalDrugInfo.getTenantId());
        }
        if (insMedicalDrugInfo.getCorpId() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getCorpId, insMedicalDrugInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getCorpName())) {
            queryWrapper.eq(InsMedicalDrugInfo::getCorpName, insMedicalDrugInfo.getCorpName());
        }
        if (insMedicalDrugInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getInstitutionId, insMedicalDrugInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getInstitutionName())) {
            queryWrapper.eq(InsMedicalDrugInfo::getInstitutionName, insMedicalDrugInfo.getInstitutionName());
        }
        if (insMedicalDrugInfo.getCheckId() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getCheckId, insMedicalDrugInfo.getCheckId());
        }
        if (insMedicalDrugInfo.getCheckDate() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getCheckDate, insMedicalDrugInfo.getCheckDate());
        }
        if (insMedicalDrugInfo.getElderId() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getElderId, insMedicalDrugInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getElderName())) {
            queryWrapper.eq(InsMedicalDrugInfo::getElderName, insMedicalDrugInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getIdCard())) {
            queryWrapper.eq(InsMedicalDrugInfo::getIdCard, insMedicalDrugInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getSex())) {
            queryWrapper.eq(InsMedicalDrugInfo::getSex, insMedicalDrugInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getDrugName())) {
            queryWrapper.eq(InsMedicalDrugInfo::getDrugName, insMedicalDrugInfo.getDrugName());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getDrugRoute())) {
            queryWrapper.eq(InsMedicalDrugInfo::getDrugRoute, insMedicalDrugInfo.getDrugRoute());
        }
        if (insMedicalDrugInfo.getStartDate() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getStartDate, insMedicalDrugInfo.getStartDate());
        }
        if (insMedicalDrugInfo.getEndDate() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getEndDate, insMedicalDrugInfo.getEndDate());
        }
        if (insMedicalDrugInfo.getTotalNum() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getTotalNum, insMedicalDrugInfo.getTotalNum());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getDrugMethods())) {
            queryWrapper.eq(InsMedicalDrugInfo::getDrugMethods, insMedicalDrugInfo.getDrugMethods());
        }
        if (insMedicalDrugInfo.getDrugDosage() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getDrugDosage, insMedicalDrugInfo.getDrugDosage());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getDrugUnit())) {
            queryWrapper.eq(InsMedicalDrugInfo::getDrugUnit, insMedicalDrugInfo.getDrugUnit());
        }
        if (insMedicalDrugInfo.getTimeType() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getTimeType, insMedicalDrugInfo.getTimeType());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getWeekNum())) {
            queryWrapper.eq(InsMedicalDrugInfo::getWeekNum, insMedicalDrugInfo.getWeekNum());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getZaoTime())) {
            queryWrapper.eq(InsMedicalDrugInfo::getZaoTime, insMedicalDrugInfo.getZaoTime());
        }
        if (insMedicalDrugInfo.getZaoDosage() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getZaoDosage, insMedicalDrugInfo.getZaoDosage());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getZhongTime())) {
            queryWrapper.eq(InsMedicalDrugInfo::getZhongTime, insMedicalDrugInfo.getZhongTime());
        }
        if (insMedicalDrugInfo.getZhongDosage() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getZhongDosage, insMedicalDrugInfo.getZhongDosage());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getWanTime())) {
            queryWrapper.eq(InsMedicalDrugInfo::getWanTime, insMedicalDrugInfo.getWanTime());
        }
        if (insMedicalDrugInfo.getWanDosage() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getWanDosage, insMedicalDrugInfo.getWanDosage());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getSqTime())) {
            queryWrapper.eq(InsMedicalDrugInfo::getSqTime, insMedicalDrugInfo.getSqTime());
        }
        if (insMedicalDrugInfo.getSqDosage() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getSqDosage, insMedicalDrugInfo.getSqDosage());
        }
        if (insMedicalDrugInfo.getDrugSource() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getDrugSource, insMedicalDrugInfo.getDrugSource());
        }
        if (insMedicalDrugInfo.getIsAdverse() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getIsAdverse, insMedicalDrugInfo.getIsAdverse());
        }
        if (insMedicalDrugInfo.getAuditState() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getAuditState, insMedicalDrugInfo.getAuditState());
        }
        if (insMedicalDrugInfo.getAuditId() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getAuditId, insMedicalDrugInfo.getAuditId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getAuditName())) {
            queryWrapper.eq(InsMedicalDrugInfo::getAuditName, insMedicalDrugInfo.getAuditName());
        }
        if (insMedicalDrugInfo.getAuditTime() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getAuditTime, insMedicalDrugInfo.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getAuditMemo())) {
            queryWrapper.eq(InsMedicalDrugInfo::getAuditMemo, insMedicalDrugInfo.getAuditMemo());
        }
        if (insMedicalDrugInfo.getStatus() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getStatus, insMedicalDrugInfo.getStatus());
        }
        if (insMedicalDrugInfo.getStopDate() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getStopDate, insMedicalDrugInfo.getStopDate());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getStopMemo())) {
            queryWrapper.eq(InsMedicalDrugInfo::getStopMemo, insMedicalDrugInfo.getStopMemo());
        }
        if (insMedicalDrugInfo.getStopAuditState() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getStopAuditState, insMedicalDrugInfo.getStopAuditState());
        }
        if (insMedicalDrugInfo.getStopAuditId() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getStopAuditId, insMedicalDrugInfo.getStopAuditId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getStopAuditName())) {
            queryWrapper.eq(InsMedicalDrugInfo::getStopAuditName, insMedicalDrugInfo.getStopAuditName());
        }
        if (insMedicalDrugInfo.getStopAuditTime() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getStopAuditTime, insMedicalDrugInfo.getStopAuditTime());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getStopAuditMemo())) {
            queryWrapper.eq(InsMedicalDrugInfo::getStopAuditMemo, insMedicalDrugInfo.getStopAuditMemo());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getRemark())) {
            queryWrapper.eq(InsMedicalDrugInfo::getRemark, insMedicalDrugInfo.getRemark());
        }
        if (insMedicalDrugInfo.getCreateUser() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getCreateUser, insMedicalDrugInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInfo.getCreateName())) {
            queryWrapper.eq(InsMedicalDrugInfo::getCreateName, insMedicalDrugInfo.getCreateName());
        }
        if (insMedicalDrugInfo.getCreateDept() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getCreateDept, insMedicalDrugInfo.getCreateDept());
        }
        if (insMedicalDrugInfo.getCreateTime() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getCreateTime, insMedicalDrugInfo.getCreateTime());
        }
        if (insMedicalDrugInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getUpdateUser, insMedicalDrugInfo.getUpdateUser());
        }
        if (insMedicalDrugInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getUpdateTime, insMedicalDrugInfo.getUpdateTime());
        }
        if (insMedicalDrugInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsMedicalDrugInfo::getIsDeleted, insMedicalDrugInfo.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insMedicalDrugInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalDrugInfo insert(InsMedicalDrugInfo insMedicalDrugInfo) {
        insMedicalDrugInfo.setId(null);
        getBaseMapper().insert(insMedicalDrugInfo);
        return insMedicalDrugInfo;
    }

    /**
    * 更新数据
    *
    * @param insMedicalDrugInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalDrugInfo update(InsMedicalDrugInfo insMedicalDrugInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsMedicalDrugInfo> chainWrapper = new LambdaUpdateChainWrapper<InsMedicalDrugInfo>(getBaseMapper());
        if (insMedicalDrugInfo.getId() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getId, insMedicalDrugInfo.getId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getTenantId())) {
            chainWrapper.set(InsMedicalDrugInfo::getTenantId, insMedicalDrugInfo.getTenantId());
        }
        if (insMedicalDrugInfo.getCorpId() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getCorpId, insMedicalDrugInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getCorpName())) {
            chainWrapper.set(InsMedicalDrugInfo::getCorpName, insMedicalDrugInfo.getCorpName());
        }
        if (insMedicalDrugInfo.getInstitutionId() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getInstitutionId, insMedicalDrugInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getInstitutionName())) {
            chainWrapper.set(InsMedicalDrugInfo::getInstitutionName, insMedicalDrugInfo.getInstitutionName());
        }
        if (insMedicalDrugInfo.getCheckId() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getCheckId, insMedicalDrugInfo.getCheckId());
        }
        if (insMedicalDrugInfo.getCheckDate() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getCheckDate, insMedicalDrugInfo.getCheckDate());
        }
        if (insMedicalDrugInfo.getElderId() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getElderId, insMedicalDrugInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getElderName())) {
            chainWrapper.set(InsMedicalDrugInfo::getElderName, insMedicalDrugInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getIdCard())) {
            chainWrapper.set(InsMedicalDrugInfo::getIdCard, insMedicalDrugInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getSex())) {
            chainWrapper.set(InsMedicalDrugInfo::getSex, insMedicalDrugInfo.getSex());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getDrugName())) {
            chainWrapper.set(InsMedicalDrugInfo::getDrugName, insMedicalDrugInfo.getDrugName());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getDrugRoute())) {
            chainWrapper.set(InsMedicalDrugInfo::getDrugRoute, insMedicalDrugInfo.getDrugRoute());
        }
        if (insMedicalDrugInfo.getStartDate() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getStartDate, insMedicalDrugInfo.getStartDate());
        }
        if (insMedicalDrugInfo.getEndDate() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getEndDate, insMedicalDrugInfo.getEndDate());
        }
        if (insMedicalDrugInfo.getTotalNum() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getTotalNum, insMedicalDrugInfo.getTotalNum());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getDrugMethods())) {
            chainWrapper.set(InsMedicalDrugInfo::getDrugMethods, insMedicalDrugInfo.getDrugMethods());
        }
        if (insMedicalDrugInfo.getDrugDosage() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getDrugDosage, insMedicalDrugInfo.getDrugDosage());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getDrugUnit())) {
            chainWrapper.set(InsMedicalDrugInfo::getDrugUnit, insMedicalDrugInfo.getDrugUnit());
        }
        if (insMedicalDrugInfo.getTimeType() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getTimeType, insMedicalDrugInfo.getTimeType());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getWeekNum())) {
            chainWrapper.set(InsMedicalDrugInfo::getWeekNum, insMedicalDrugInfo.getWeekNum());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getZaoTime())) {
            chainWrapper.set(InsMedicalDrugInfo::getZaoTime, insMedicalDrugInfo.getZaoTime());
        }
        if (insMedicalDrugInfo.getZaoDosage() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getZaoDosage, insMedicalDrugInfo.getZaoDosage());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getZhongTime())) {
            chainWrapper.set(InsMedicalDrugInfo::getZhongTime, insMedicalDrugInfo.getZhongTime());
        }
        if (insMedicalDrugInfo.getZhongDosage() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getZhongDosage, insMedicalDrugInfo.getZhongDosage());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getWanTime())) {
            chainWrapper.set(InsMedicalDrugInfo::getWanTime, insMedicalDrugInfo.getWanTime());
        }
        if (insMedicalDrugInfo.getWanDosage() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getWanDosage, insMedicalDrugInfo.getWanDosage());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getSqTime())) {
            chainWrapper.set(InsMedicalDrugInfo::getSqTime, insMedicalDrugInfo.getSqTime());
        }
        if (insMedicalDrugInfo.getSqDosage() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getSqDosage, insMedicalDrugInfo.getSqDosage());
        }
        if (insMedicalDrugInfo.getDrugSource() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getDrugSource, insMedicalDrugInfo.getDrugSource());
        }
        if (insMedicalDrugInfo.getIsAdverse() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getIsAdverse, insMedicalDrugInfo.getIsAdverse());
        }
        if (insMedicalDrugInfo.getAuditState() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getAuditState, insMedicalDrugInfo.getAuditState());
        }
        if (insMedicalDrugInfo.getAuditId() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getAuditId, insMedicalDrugInfo.getAuditId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getAuditName())) {
            chainWrapper.set(InsMedicalDrugInfo::getAuditName, insMedicalDrugInfo.getAuditName());
        }
        if (insMedicalDrugInfo.getAuditTime() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getAuditTime, insMedicalDrugInfo.getAuditTime());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getAuditMemo())) {
            chainWrapper.set(InsMedicalDrugInfo::getAuditMemo, insMedicalDrugInfo.getAuditMemo());
        }
        if (insMedicalDrugInfo.getStatus() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getStatus, insMedicalDrugInfo.getStatus());
        }
        if (insMedicalDrugInfo.getStopDate() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getStopDate, insMedicalDrugInfo.getStopDate());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getStopMemo())) {
            chainWrapper.set(InsMedicalDrugInfo::getStopMemo, insMedicalDrugInfo.getStopMemo());
        }
        if (insMedicalDrugInfo.getStopAuditState() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getStopAuditState, insMedicalDrugInfo.getStopAuditState());
        }
        if (insMedicalDrugInfo.getStopAuditId() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getStopAuditId, insMedicalDrugInfo.getStopAuditId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getStopAuditName())) {
            chainWrapper.set(InsMedicalDrugInfo::getStopAuditName, insMedicalDrugInfo.getStopAuditName());
        }
        if (insMedicalDrugInfo.getStopAuditTime() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getStopAuditTime, insMedicalDrugInfo.getStopAuditTime());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getStopAuditMemo())) {
            chainWrapper.set(InsMedicalDrugInfo::getStopAuditMemo, insMedicalDrugInfo.getStopAuditMemo());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getRemark())) {
            chainWrapper.set(InsMedicalDrugInfo::getRemark, insMedicalDrugInfo.getRemark());
        }
        if (insMedicalDrugInfo.getCreateUser() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getCreateUser, insMedicalDrugInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInfo.getCreateName())) {
            chainWrapper.set(InsMedicalDrugInfo::getCreateName, insMedicalDrugInfo.getCreateName());
        }
        if (insMedicalDrugInfo.getCreateDept() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getCreateDept, insMedicalDrugInfo.getCreateDept());
        }
        if (insMedicalDrugInfo.getCreateTime() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getCreateTime, insMedicalDrugInfo.getCreateTime());
        }
        if (insMedicalDrugInfo.getUpdateUser() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getUpdateUser, insMedicalDrugInfo.getUpdateUser());
        }
        if (insMedicalDrugInfo.getUpdateTime() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getUpdateTime, insMedicalDrugInfo.getUpdateTime());
        }
        if (insMedicalDrugInfo.getIsDeleted() != null) {
            chainWrapper.set(InsMedicalDrugInfo::getIsDeleted, insMedicalDrugInfo.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsMedicalDrugInfo::getId, insMedicalDrugInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insMedicalDrugInfo.getId());
        } else {
            return insMedicalDrugInfo;
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
    public boolean saveInsMedicalDrugInfoBatch(List<InsMedicalDrugInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsMedicalDrugInfo insMedicalDrugInfo : insertList) {
            //使用默认的雪花算法生成
            insMedicalDrugInfo.setId(null);
            //insMedicalDrugInfo.setCreatedDt(currentDte);
            //insMedicalDrugInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsMedicalDrugInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsMedicalDrugInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


