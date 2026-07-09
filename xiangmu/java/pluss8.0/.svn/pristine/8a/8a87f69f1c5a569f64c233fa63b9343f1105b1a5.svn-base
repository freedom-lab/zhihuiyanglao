package cn.pluss.platform.service.insSecurityDangersCheck.impl;

import cn.pluss.platform.mapper.InsSecurityDangersCheckMapper;
import cn.pluss.platform.model.entity.InsSecurityDangersCheck;
import cn.pluss.platform.service.insSecurityDangersCheck.InsSecurityDangersCheckService;
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
@Service("insSecurityDangersCheckService")
public class InsSecurityDangersCheckServiceImpl extends ServiceImpl< InsSecurityDangersCheckMapper, InsSecurityDangersCheck> implements InsSecurityDangersCheckService {
    private static final Logger logger = LoggerFactory.getLogger(InsSecurityDangersCheckServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSecurityDangersCheck> queryPage(Map map) {
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
    public InsSecurityDangersCheck queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityDangersCheck 实例对象
    * @return 实例对象
    */
    @Override
    public InsSecurityDangersCheck queryOne(InsSecurityDangersCheck insSecurityDangersCheck){
        LambdaQueryWrapper<InsSecurityDangersCheck> queryWrapper = getQueryWrapper(insSecurityDangersCheck);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityDangersCheck
    * @return
    */
    @Override
    public List<InsSecurityDangersCheck> queryList(InsSecurityDangersCheck insSecurityDangersCheck) {
        LambdaQueryWrapper<InsSecurityDangersCheck> queryWrapper = getQueryWrapper(insSecurityDangersCheck);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSecurityDangersCheck
    * @return
    */
    public static LambdaQueryWrapper<InsSecurityDangersCheck> getQueryWrapper(InsSecurityDangersCheck insSecurityDangersCheck){
        LambdaQueryWrapper<InsSecurityDangersCheck> queryWrapper = new LambdaQueryWrapper<>();
        if (insSecurityDangersCheck.getId() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getId, insSecurityDangersCheck.getId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getTenantId())) {
            queryWrapper.eq(InsSecurityDangersCheck::getTenantId, insSecurityDangersCheck.getTenantId());
        }
        if (insSecurityDangersCheck.getCorpId() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getCorpId, insSecurityDangersCheck.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getCorpName())) {
            queryWrapper.eq(InsSecurityDangersCheck::getCorpName, insSecurityDangersCheck.getCorpName());
        }
        if (insSecurityDangersCheck.getInstitutionId() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getInstitutionId, insSecurityDangersCheck.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getInstitutionName())) {
            queryWrapper.eq(InsSecurityDangersCheck::getInstitutionName, insSecurityDangersCheck.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getInstitutionAddress())) {
            queryWrapper.eq(InsSecurityDangersCheck::getInstitutionAddress, insSecurityDangersCheck.getInstitutionAddress());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getDangersType())) {
            queryWrapper.eq(InsSecurityDangersCheck::getDangersType, insSecurityDangersCheck.getDangersType());
        }
        if (insSecurityDangersCheck.getCheckDate() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getCheckDate, insSecurityDangersCheck.getCheckDate());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getPicName())) {
            queryWrapper.eq(InsSecurityDangersCheck::getPicName, insSecurityDangersCheck.getPicName());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getManagerName())) {
            queryWrapper.eq(InsSecurityDangersCheck::getManagerName, insSecurityDangersCheck.getManagerName());
        }
        if (insSecurityDangersCheck.getBuildingNum() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getBuildingNum, insSecurityDangersCheck.getBuildingNum());
        }
        if (insSecurityDangersCheck.getStaffNum() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getStaffNum, insSecurityDangersCheck.getStaffNum());
        }
        if (insSecurityDangersCheck.getAreaNum() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getAreaNum, insSecurityDangersCheck.getAreaNum());
        }
        if (insSecurityDangersCheck.getStayNum() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getStayNum, insSecurityDangersCheck.getStayNum());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getPicNameSign())) {
            queryWrapper.eq(InsSecurityDangersCheck::getPicNameSign, insSecurityDangersCheck.getPicNameSign());
        }
        if (insSecurityDangersCheck.getAreaCode() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getAreaCode, insSecurityDangersCheck.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getAreaName())) {
            queryWrapper.eq(InsSecurityDangersCheck::getAreaName, insSecurityDangersCheck.getAreaName());
        }
        if (insSecurityDangersCheck.getSubmitState() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getSubmitState, insSecurityDangersCheck.getSubmitState());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getRemark())) {
            queryWrapper.eq(InsSecurityDangersCheck::getRemark, insSecurityDangersCheck.getRemark());
        }
        if (insSecurityDangersCheck.getCreateUser() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getCreateUser, insSecurityDangersCheck.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getCreateName())) {
            queryWrapper.eq(InsSecurityDangersCheck::getCreateName, insSecurityDangersCheck.getCreateName());
        }
        if (insSecurityDangersCheck.getCreateDept() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getCreateDept, insSecurityDangersCheck.getCreateDept());
        }
        if (insSecurityDangersCheck.getCreateTime() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getCreateTime, insSecurityDangersCheck.getCreateTime());
        }
        if (insSecurityDangersCheck.getUpdateUser() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getUpdateUser, insSecurityDangersCheck.getUpdateUser());
        }
        if (insSecurityDangersCheck.getUpdateTime() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getUpdateTime, insSecurityDangersCheck.getUpdateTime());
        }
        if (insSecurityDangersCheck.getIsDeleted() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getIsDeleted, insSecurityDangersCheck.getIsDeleted());
        }
        if (insSecurityDangersCheck.getStatus() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getStatus, insSecurityDangersCheck.getStatus());
        }
        if (insSecurityDangersCheck.getTaskId() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getTaskId, insSecurityDangersCheck.getTaskId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getTaskTitle())) {
            queryWrapper.eq(InsSecurityDangersCheck::getTaskTitle, insSecurityDangersCheck.getTaskTitle());
        }
        if (insSecurityDangersCheck.getAuditState() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getAuditState, insSecurityDangersCheck.getAuditState());
        }
        if (insSecurityDangersCheck.getAuditId() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getAuditId, insSecurityDangersCheck.getAuditId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getAuditName())) {
            queryWrapper.eq(InsSecurityDangersCheck::getAuditName, insSecurityDangersCheck.getAuditName());
        }
        if (insSecurityDangersCheck.getAuditTime() != null) {
            queryWrapper.eq(InsSecurityDangersCheck::getAuditTime, insSecurityDangersCheck.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheck.getAuditMemo())) {
            queryWrapper.eq(InsSecurityDangersCheck::getAuditMemo, insSecurityDangersCheck.getAuditMemo());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSecurityDangersCheck 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityDangersCheck insert(InsSecurityDangersCheck insSecurityDangersCheck) {
        insSecurityDangersCheck.setId(null);
        getBaseMapper().insert(insSecurityDangersCheck);
        return insSecurityDangersCheck;
    }

    /**
    * 更新数据
    *
    * @param insSecurityDangersCheck 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityDangersCheck update(InsSecurityDangersCheck insSecurityDangersCheck) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSecurityDangersCheck> chainWrapper = new LambdaUpdateChainWrapper<InsSecurityDangersCheck>(getBaseMapper());
        if (insSecurityDangersCheck.getId() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getId, insSecurityDangersCheck.getId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getTenantId())) {
            chainWrapper.set(InsSecurityDangersCheck::getTenantId, insSecurityDangersCheck.getTenantId());
        }
        if (insSecurityDangersCheck.getCorpId() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getCorpId, insSecurityDangersCheck.getCorpId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getCorpName())) {
            chainWrapper.set(InsSecurityDangersCheck::getCorpName, insSecurityDangersCheck.getCorpName());
        }
        if (insSecurityDangersCheck.getInstitutionId() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getInstitutionId, insSecurityDangersCheck.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getInstitutionName())) {
            chainWrapper.set(InsSecurityDangersCheck::getInstitutionName, insSecurityDangersCheck.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getInstitutionAddress())) {
            chainWrapper.set(InsSecurityDangersCheck::getInstitutionAddress, insSecurityDangersCheck.getInstitutionAddress());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getDangersType())) {
            chainWrapper.set(InsSecurityDangersCheck::getDangersType, insSecurityDangersCheck.getDangersType());
        }
        if (insSecurityDangersCheck.getCheckDate() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getCheckDate, insSecurityDangersCheck.getCheckDate());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getPicName())) {
            chainWrapper.set(InsSecurityDangersCheck::getPicName, insSecurityDangersCheck.getPicName());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getManagerName())) {
            chainWrapper.set(InsSecurityDangersCheck::getManagerName, insSecurityDangersCheck.getManagerName());
        }
        if (insSecurityDangersCheck.getBuildingNum() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getBuildingNum, insSecurityDangersCheck.getBuildingNum());
        }
        if (insSecurityDangersCheck.getStaffNum() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getStaffNum, insSecurityDangersCheck.getStaffNum());
        }
        if (insSecurityDangersCheck.getAreaNum() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getAreaNum, insSecurityDangersCheck.getAreaNum());
        }
        if (insSecurityDangersCheck.getStayNum() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getStayNum, insSecurityDangersCheck.getStayNum());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getPicNameSign())) {
            chainWrapper.set(InsSecurityDangersCheck::getPicNameSign, insSecurityDangersCheck.getPicNameSign());
        }
        if (insSecurityDangersCheck.getAreaCode() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getAreaCode, insSecurityDangersCheck.getAreaCode());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getAreaName())) {
            chainWrapper.set(InsSecurityDangersCheck::getAreaName, insSecurityDangersCheck.getAreaName());
        }
        if (insSecurityDangersCheck.getSubmitState() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getSubmitState, insSecurityDangersCheck.getSubmitState());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getRemark())) {
            chainWrapper.set(InsSecurityDangersCheck::getRemark, insSecurityDangersCheck.getRemark());
        }
        if (insSecurityDangersCheck.getCreateUser() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getCreateUser, insSecurityDangersCheck.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getCreateName())) {
            chainWrapper.set(InsSecurityDangersCheck::getCreateName, insSecurityDangersCheck.getCreateName());
        }
        if (insSecurityDangersCheck.getCreateDept() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getCreateDept, insSecurityDangersCheck.getCreateDept());
        }
        if (insSecurityDangersCheck.getCreateTime() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getCreateTime, insSecurityDangersCheck.getCreateTime());
        }
        if (insSecurityDangersCheck.getUpdateUser() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getUpdateUser, insSecurityDangersCheck.getUpdateUser());
        }
        if (insSecurityDangersCheck.getUpdateTime() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getUpdateTime, insSecurityDangersCheck.getUpdateTime());
        }
        if (insSecurityDangersCheck.getIsDeleted() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getIsDeleted, insSecurityDangersCheck.getIsDeleted());
        }
        if (insSecurityDangersCheck.getStatus() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getStatus, insSecurityDangersCheck.getStatus());
        }
        if (insSecurityDangersCheck.getTaskId() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getTaskId, insSecurityDangersCheck.getTaskId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getTaskTitle())) {
            chainWrapper.set(InsSecurityDangersCheck::getTaskTitle, insSecurityDangersCheck.getTaskTitle());
        }
        if (insSecurityDangersCheck.getAuditState() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getAuditState, insSecurityDangersCheck.getAuditState());
        }
        if (insSecurityDangersCheck.getAuditId() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getAuditId, insSecurityDangersCheck.getAuditId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getAuditName())) {
            chainWrapper.set(InsSecurityDangersCheck::getAuditName, insSecurityDangersCheck.getAuditName());
        }
        if (insSecurityDangersCheck.getAuditTime() != null) {
            chainWrapper.set(InsSecurityDangersCheck::getAuditTime, insSecurityDangersCheck.getAuditTime());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheck.getAuditMemo())) {
            chainWrapper.set(InsSecurityDangersCheck::getAuditMemo, insSecurityDangersCheck.getAuditMemo());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSecurityDangersCheck::getId, insSecurityDangersCheck.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSecurityDangersCheck.getId());
        } else {
            return insSecurityDangersCheck;
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
    public boolean saveInsSecurityDangersCheckBatch(List<InsSecurityDangersCheck> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSecurityDangersCheck insSecurityDangersCheck : insertList) {
            //使用默认的雪花算法生成
            insSecurityDangersCheck.setId(null);
            //insSecurityDangersCheck.setCreatedDt(currentDte);
            //insSecurityDangersCheck.setUpdatedDt(currentDte);
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
    public Integer deleteInsSecurityDangersCheckBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSecurityDangersCheck> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


