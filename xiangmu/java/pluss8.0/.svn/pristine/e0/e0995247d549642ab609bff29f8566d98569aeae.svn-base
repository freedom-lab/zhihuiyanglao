package cn.pluss.platform.service.insElderAssessmentWarning.impl;

import cn.pluss.platform.mapper.InsElderAssessmentWarningMapper;
import cn.pluss.platform.model.entity.InsElderAssessmentWarning;
import cn.pluss.platform.service.insElderAssessmentWarning.InsElderAssessmentWarningService;
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
@Service("insElderAssessmentWarningService")
public class InsElderAssessmentWarningServiceImpl extends ServiceImpl< InsElderAssessmentWarningMapper, InsElderAssessmentWarning> implements InsElderAssessmentWarningService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderAssessmentWarningServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderAssessmentWarning> queryPage(Map map) {
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
    public InsElderAssessmentWarning queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderAssessmentWarning 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderAssessmentWarning queryOne(InsElderAssessmentWarning insElderAssessmentWarning){
        LambdaQueryWrapper<InsElderAssessmentWarning> queryWrapper = getQueryWrapper(insElderAssessmentWarning);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderAssessmentWarning
    * @return
    */
    @Override
    public List<InsElderAssessmentWarning> queryList(InsElderAssessmentWarning insElderAssessmentWarning) {
        LambdaQueryWrapper<InsElderAssessmentWarning> queryWrapper = getQueryWrapper(insElderAssessmentWarning);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderAssessmentWarning
    * @return
    */
    public static LambdaQueryWrapper<InsElderAssessmentWarning> getQueryWrapper(InsElderAssessmentWarning insElderAssessmentWarning){
        LambdaQueryWrapper<InsElderAssessmentWarning> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderAssessmentWarning.getId() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getId, insElderAssessmentWarning.getId());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getTenantId())) {
            queryWrapper.eq(InsElderAssessmentWarning::getTenantId, insElderAssessmentWarning.getTenantId());
        }
        if (insElderAssessmentWarning.getCorpId() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getCorpId, insElderAssessmentWarning.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getCorpName())) {
            queryWrapper.eq(InsElderAssessmentWarning::getCorpName, insElderAssessmentWarning.getCorpName());
        }
        if (insElderAssessmentWarning.getInstitutionId() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getInstitutionId, insElderAssessmentWarning.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getInstitutionName())) {
            queryWrapper.eq(InsElderAssessmentWarning::getInstitutionName, insElderAssessmentWarning.getInstitutionName());
        }
        if (insElderAssessmentWarning.getCheckId() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getCheckId, insElderAssessmentWarning.getCheckId());
        }
        if (insElderAssessmentWarning.getCheckDate() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getCheckDate, insElderAssessmentWarning.getCheckDate());
        }
        if (insElderAssessmentWarning.getElderId() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getElderId, insElderAssessmentWarning.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getElderName())) {
            queryWrapper.eq(InsElderAssessmentWarning::getElderName, insElderAssessmentWarning.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getIdCard())) {
            queryWrapper.eq(InsElderAssessmentWarning::getIdCard, insElderAssessmentWarning.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getSex())) {
            queryWrapper.eq(InsElderAssessmentWarning::getSex, insElderAssessmentWarning.getSex());
        }
        if (insElderAssessmentWarning.getAppointId() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getAppointId, insElderAssessmentWarning.getAppointId());
        }
        if (insElderAssessmentWarning.getAssessTime() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getAssessTime, insElderAssessmentWarning.getAssessTime());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getAssessCode())) {
            queryWrapper.eq(InsElderAssessmentWarning::getAssessCode, insElderAssessmentWarning.getAssessCode());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getAssessMemo())) {
            queryWrapper.eq(InsElderAssessmentWarning::getAssessMemo, insElderAssessmentWarning.getAssessMemo());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getInitialLevel())) {
            queryWrapper.eq(InsElderAssessmentWarning::getInitialLevel, insElderAssessmentWarning.getInitialLevel());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getAssessResult())) {
            queryWrapper.eq(InsElderAssessmentWarning::getAssessResult, insElderAssessmentWarning.getAssessResult());
        }
        if (insElderAssessmentWarning.getAssignStaffId() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getAssignStaffId, insElderAssessmentWarning.getAssignStaffId());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getAssignStaffName())) {
            queryWrapper.eq(InsElderAssessmentWarning::getAssignStaffName, insElderAssessmentWarning.getAssignStaffName());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getAssignStaffTel())) {
            queryWrapper.eq(InsElderAssessmentWarning::getAssignStaffTel, insElderAssessmentWarning.getAssignStaffTel());
        }
        if (insElderAssessmentWarning.getWarningState() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getWarningState, insElderAssessmentWarning.getWarningState());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getAreaCode())) {
            queryWrapper.eq(InsElderAssessmentWarning::getAreaCode, insElderAssessmentWarning.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getAreaName())) {
            queryWrapper.eq(InsElderAssessmentWarning::getAreaName, insElderAssessmentWarning.getAreaName());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getRemark())) {
            queryWrapper.eq(InsElderAssessmentWarning::getRemark, insElderAssessmentWarning.getRemark());
        }
        if (insElderAssessmentWarning.getCreateUser() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getCreateUser, insElderAssessmentWarning.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getCreateName())) {
            queryWrapper.eq(InsElderAssessmentWarning::getCreateName, insElderAssessmentWarning.getCreateName());
        }
        if (insElderAssessmentWarning.getCreateDept() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getCreateDept, insElderAssessmentWarning.getCreateDept());
        }
        if (insElderAssessmentWarning.getCreateTime() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getCreateTime, insElderAssessmentWarning.getCreateTime());
        }
        if (insElderAssessmentWarning.getUpdateUser() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getUpdateUser, insElderAssessmentWarning.getUpdateUser());
        }
        if (insElderAssessmentWarning.getUpdateTime() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getUpdateTime, insElderAssessmentWarning.getUpdateTime());
        }
        if (insElderAssessmentWarning.getIsDeleted() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getIsDeleted, insElderAssessmentWarning.getIsDeleted());
        }
        if (insElderAssessmentWarning.getStatus() != null) {
            queryWrapper.eq(InsElderAssessmentWarning::getStatus, insElderAssessmentWarning.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderAssessmentWarning 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderAssessmentWarning insert(InsElderAssessmentWarning insElderAssessmentWarning) {
        insElderAssessmentWarning.setId(null);
        if (StringUtil.isNotEmpty(insElderAssessmentWarning.getAssessCode())) {
            insElderAssessmentWarning.setAssessCode("PG"+StringUtil.getBillno());
        }
        getBaseMapper().insert(insElderAssessmentWarning);
        return insElderAssessmentWarning;
    }

    /**
    * 更新数据
    *
    * @param insElderAssessmentWarning 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderAssessmentWarning update(InsElderAssessmentWarning insElderAssessmentWarning) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderAssessmentWarning> chainWrapper = new LambdaUpdateChainWrapper<InsElderAssessmentWarning>(getBaseMapper());
        if (insElderAssessmentWarning.getId() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getId, insElderAssessmentWarning.getId());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getTenantId())) {
            chainWrapper.set(InsElderAssessmentWarning::getTenantId, insElderAssessmentWarning.getTenantId());
        }
        if (insElderAssessmentWarning.getCorpId() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getCorpId, insElderAssessmentWarning.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getCorpName())) {
            chainWrapper.set(InsElderAssessmentWarning::getCorpName, insElderAssessmentWarning.getCorpName());
        }
        if (insElderAssessmentWarning.getInstitutionId() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getInstitutionId, insElderAssessmentWarning.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getInstitutionName())) {
            chainWrapper.set(InsElderAssessmentWarning::getInstitutionName, insElderAssessmentWarning.getInstitutionName());
        }
        if (insElderAssessmentWarning.getCheckId() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getCheckId, insElderAssessmentWarning.getCheckId());
        }
        if (insElderAssessmentWarning.getCheckDate() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getCheckDate, insElderAssessmentWarning.getCheckDate());
        }
        if (insElderAssessmentWarning.getElderId() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getElderId, insElderAssessmentWarning.getElderId());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getElderName())) {
            chainWrapper.set(InsElderAssessmentWarning::getElderName, insElderAssessmentWarning.getElderName());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getIdCard())) {
            chainWrapper.set(InsElderAssessmentWarning::getIdCard, insElderAssessmentWarning.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getSex())) {
            chainWrapper.set(InsElderAssessmentWarning::getSex, insElderAssessmentWarning.getSex());
        }
        if (insElderAssessmentWarning.getAppointId() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getAppointId, insElderAssessmentWarning.getAppointId());
        }
        if (insElderAssessmentWarning.getAssessTime() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getAssessTime, insElderAssessmentWarning.getAssessTime());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getAssessCode())) {
            chainWrapper.set(InsElderAssessmentWarning::getAssessCode, insElderAssessmentWarning.getAssessCode());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getAssessMemo())) {
            chainWrapper.set(InsElderAssessmentWarning::getAssessMemo, insElderAssessmentWarning.getAssessMemo());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getInitialLevel())) {
            chainWrapper.set(InsElderAssessmentWarning::getInitialLevel, insElderAssessmentWarning.getInitialLevel());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getAssessResult())) {
            chainWrapper.set(InsElderAssessmentWarning::getAssessResult, insElderAssessmentWarning.getAssessResult());
        }
        if (insElderAssessmentWarning.getAssignStaffId() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getAssignStaffId, insElderAssessmentWarning.getAssignStaffId());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getAssignStaffName())) {
            chainWrapper.set(InsElderAssessmentWarning::getAssignStaffName, insElderAssessmentWarning.getAssignStaffName());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getAssignStaffTel())) {
            chainWrapper.set(InsElderAssessmentWarning::getAssignStaffTel, insElderAssessmentWarning.getAssignStaffTel());
        }
        if (insElderAssessmentWarning.getWarningState() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getWarningState, insElderAssessmentWarning.getWarningState());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getAreaCode())) {
            chainWrapper.set(InsElderAssessmentWarning::getAreaCode, insElderAssessmentWarning.getAreaCode());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getAreaName())) {
            chainWrapper.set(InsElderAssessmentWarning::getAreaName, insElderAssessmentWarning.getAreaName());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getRemark())) {
            chainWrapper.set(InsElderAssessmentWarning::getRemark, insElderAssessmentWarning.getRemark());
        }
        if (insElderAssessmentWarning.getCreateUser() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getCreateUser, insElderAssessmentWarning.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderAssessmentWarning.getCreateName())) {
            chainWrapper.set(InsElderAssessmentWarning::getCreateName, insElderAssessmentWarning.getCreateName());
        }
        if (insElderAssessmentWarning.getCreateDept() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getCreateDept, insElderAssessmentWarning.getCreateDept());
        }
        if (insElderAssessmentWarning.getCreateTime() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getCreateTime, insElderAssessmentWarning.getCreateTime());
        }
        if (insElderAssessmentWarning.getUpdateUser() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getUpdateUser, insElderAssessmentWarning.getUpdateUser());
        }
        if (insElderAssessmentWarning.getUpdateTime() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getUpdateTime, insElderAssessmentWarning.getUpdateTime());
        }
        if (insElderAssessmentWarning.getIsDeleted() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getIsDeleted, insElderAssessmentWarning.getIsDeleted());
        }
        if (insElderAssessmentWarning.getStatus() != null) {
            chainWrapper.set(InsElderAssessmentWarning::getStatus, insElderAssessmentWarning.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderAssessmentWarning::getId, insElderAssessmentWarning.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderAssessmentWarning.getId());
        } else {
            return insElderAssessmentWarning;
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
    public boolean saveInsElderAssessmentWarningBatch(List<InsElderAssessmentWarning> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderAssessmentWarning insElderAssessmentWarning : insertList) {
            //使用默认的雪花算法生成
            insElderAssessmentWarning.setId(null);
            //insElderAssessmentWarning.setCreatedDt(currentDte);
            //insElderAssessmentWarning.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderAssessmentWarningBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderAssessmentWarning> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


