package cn.pluss.platform.service.insNursingGroupMember.impl;

import cn.pluss.platform.mapper.InsNursingGroupMemberMapper;
import cn.pluss.platform.model.entity.InsNursingGroupMember;
import cn.pluss.platform.service.insNursingGroupMember.InsNursingGroupMemberService;
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
@Service("insNursingGroupMemberService")
public class InsNursingGroupMemberServiceImpl extends ServiceImpl< InsNursingGroupMemberMapper, InsNursingGroupMember> implements InsNursingGroupMemberService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingGroupMemberServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingGroupMember> queryPage(Map map) {
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
    public InsNursingGroupMember queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingGroupMember 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingGroupMember queryOne(InsNursingGroupMember insNursingGroupMember){
        LambdaQueryWrapper<InsNursingGroupMember> queryWrapper = getQueryWrapper(insNursingGroupMember);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingGroupMember
    * @return
    */
    @Override
    public List<InsNursingGroupMember> queryList(InsNursingGroupMember insNursingGroupMember) {
        LambdaQueryWrapper<InsNursingGroupMember> queryWrapper = getQueryWrapper(insNursingGroupMember);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingGroupMember
    * @return
    */
    public static LambdaQueryWrapper<InsNursingGroupMember> getQueryWrapper(InsNursingGroupMember insNursingGroupMember){
        LambdaQueryWrapper<InsNursingGroupMember> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingGroupMember.getId() != null) {
            queryWrapper.eq(InsNursingGroupMember::getId, insNursingGroupMember.getId());
        }
        if (StringUtil.isNotEmpty(insNursingGroupMember.getTenantId())) {
            queryWrapper.eq(InsNursingGroupMember::getTenantId, insNursingGroupMember.getTenantId());
        }
        if (insNursingGroupMember.getCorpId() != null) {
            queryWrapper.eq(InsNursingGroupMember::getCorpId, insNursingGroupMember.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingGroupMember.getCorpName())) {
            queryWrapper.eq(InsNursingGroupMember::getCorpName, insNursingGroupMember.getCorpName());
        }
        if (insNursingGroupMember.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingGroupMember::getInstitutionId, insNursingGroupMember.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingGroupMember.getInstitutionName())) {
            queryWrapper.eq(InsNursingGroupMember::getInstitutionName, insNursingGroupMember.getInstitutionName());
        }
        if (insNursingGroupMember.getGroupId() != null) {
            queryWrapper.eq(InsNursingGroupMember::getGroupId, insNursingGroupMember.getGroupId());
        }
        if (StringUtil.isNotEmpty(insNursingGroupMember.getGroupName())) {
            queryWrapper.eq(InsNursingGroupMember::getGroupName, insNursingGroupMember.getGroupName());
        }
        if (insNursingGroupMember.getNursingStaffId() != null) {
            queryWrapper.eq(InsNursingGroupMember::getNursingStaffId, insNursingGroupMember.getNursingStaffId());
        }
        if (StringUtil.isNotEmpty(insNursingGroupMember.getNursingStaffName())) {
            queryWrapper.eq(InsNursingGroupMember::getNursingStaffName, insNursingGroupMember.getNursingStaffName());
        }
        if (StringUtil.isNotEmpty(insNursingGroupMember.getRemark())) {
            queryWrapper.eq(InsNursingGroupMember::getRemark, insNursingGroupMember.getRemark());
        }
        if (insNursingGroupMember.getCreateUser() != null) {
            queryWrapper.eq(InsNursingGroupMember::getCreateUser, insNursingGroupMember.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingGroupMember.getCreateName())) {
            queryWrapper.eq(InsNursingGroupMember::getCreateName, insNursingGroupMember.getCreateName());
        }
        if (insNursingGroupMember.getCreateDept() != null) {
            queryWrapper.eq(InsNursingGroupMember::getCreateDept, insNursingGroupMember.getCreateDept());
        }
        if (insNursingGroupMember.getCreateTime() != null) {
            queryWrapper.eq(InsNursingGroupMember::getCreateTime, insNursingGroupMember.getCreateTime());
        }
        if (insNursingGroupMember.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingGroupMember::getUpdateUser, insNursingGroupMember.getUpdateUser());
        }
        if (insNursingGroupMember.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingGroupMember::getUpdateTime, insNursingGroupMember.getUpdateTime());
        }
        if (insNursingGroupMember.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingGroupMember::getIsDeleted, insNursingGroupMember.getIsDeleted());
        }
        if (insNursingGroupMember.getStatus() != null) {
            queryWrapper.eq(InsNursingGroupMember::getStatus, insNursingGroupMember.getStatus());
        }
        if (insNursingGroupMember.getIsLicensed() != null) {
            queryWrapper.eq(InsNursingGroupMember::getIsLicensed, insNursingGroupMember.getIsLicensed());
        }
        if (insNursingGroupMember.getLicensedRecord() != null) {
            queryWrapper.eq(InsNursingGroupMember::getLicensedRecord, insNursingGroupMember.getLicensedRecord());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingGroupMember 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingGroupMember insert(InsNursingGroupMember insNursingGroupMember) {
        insNursingGroupMember.setId(null);
        getBaseMapper().insert(insNursingGroupMember);
        return insNursingGroupMember;
    }

    /**
    * 更新数据
    *
    * @param insNursingGroupMember 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingGroupMember update(InsNursingGroupMember insNursingGroupMember) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingGroupMember> chainWrapper = new LambdaUpdateChainWrapper<InsNursingGroupMember>(getBaseMapper());
        if (insNursingGroupMember.getId() != null) {
            chainWrapper.set(InsNursingGroupMember::getId, insNursingGroupMember.getId());
        }
        if (StringUtil.isNotBlank(insNursingGroupMember.getTenantId())) {
            chainWrapper.set(InsNursingGroupMember::getTenantId, insNursingGroupMember.getTenantId());
        }
        if (insNursingGroupMember.getCorpId() != null) {
            chainWrapper.set(InsNursingGroupMember::getCorpId, insNursingGroupMember.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingGroupMember.getCorpName())) {
            chainWrapper.set(InsNursingGroupMember::getCorpName, insNursingGroupMember.getCorpName());
        }
        if (insNursingGroupMember.getInstitutionId() != null) {
            chainWrapper.set(InsNursingGroupMember::getInstitutionId, insNursingGroupMember.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingGroupMember.getInstitutionName())) {
            chainWrapper.set(InsNursingGroupMember::getInstitutionName, insNursingGroupMember.getInstitutionName());
        }
        if (insNursingGroupMember.getGroupId() != null) {
            chainWrapper.set(InsNursingGroupMember::getGroupId, insNursingGroupMember.getGroupId());
        }
        if (StringUtil.isNotBlank(insNursingGroupMember.getGroupName())) {
            chainWrapper.set(InsNursingGroupMember::getGroupName, insNursingGroupMember.getGroupName());
        }
        if (insNursingGroupMember.getNursingStaffId() != null) {
            chainWrapper.set(InsNursingGroupMember::getNursingStaffId, insNursingGroupMember.getNursingStaffId());
        }
        if (StringUtil.isNotBlank(insNursingGroupMember.getNursingStaffName())) {
            chainWrapper.set(InsNursingGroupMember::getNursingStaffName, insNursingGroupMember.getNursingStaffName());
        }
        if (StringUtil.isNotBlank(insNursingGroupMember.getRemark())) {
            chainWrapper.set(InsNursingGroupMember::getRemark, insNursingGroupMember.getRemark());
        }
        if (insNursingGroupMember.getCreateUser() != null) {
            chainWrapper.set(InsNursingGroupMember::getCreateUser, insNursingGroupMember.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingGroupMember.getCreateName())) {
            chainWrapper.set(InsNursingGroupMember::getCreateName, insNursingGroupMember.getCreateName());
        }
        if (insNursingGroupMember.getCreateDept() != null) {
            chainWrapper.set(InsNursingGroupMember::getCreateDept, insNursingGroupMember.getCreateDept());
        }
        if (insNursingGroupMember.getCreateTime() != null) {
            chainWrapper.set(InsNursingGroupMember::getCreateTime, insNursingGroupMember.getCreateTime());
        }
        if (insNursingGroupMember.getUpdateUser() != null) {
            chainWrapper.set(InsNursingGroupMember::getUpdateUser, insNursingGroupMember.getUpdateUser());
        }
        if (insNursingGroupMember.getUpdateTime() != null) {
            chainWrapper.set(InsNursingGroupMember::getUpdateTime, insNursingGroupMember.getUpdateTime());
        }
        if (insNursingGroupMember.getIsDeleted() != null) {
            chainWrapper.set(InsNursingGroupMember::getIsDeleted, insNursingGroupMember.getIsDeleted());
        }
        if (insNursingGroupMember.getStatus() != null) {
            chainWrapper.set(InsNursingGroupMember::getStatus, insNursingGroupMember.getStatus());
        }
        if (insNursingGroupMember.getIsLicensed() != null) {
            chainWrapper.set(InsNursingGroupMember::getIsLicensed, insNursingGroupMember.getIsLicensed());
        }
        if (insNursingGroupMember.getLicensedRecord() != null) {
            chainWrapper.set(InsNursingGroupMember::getLicensedRecord, insNursingGroupMember.getLicensedRecord());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingGroupMember::getId, insNursingGroupMember.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingGroupMember.getId());
        } else {
            return insNursingGroupMember;
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
    public boolean saveInsNursingGroupMemberBatch(List<InsNursingGroupMember> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingGroupMember insNursingGroupMember : insertList) {
            //使用默认的雪花算法生成
            insNursingGroupMember.setId(null);
            //insNursingGroupMember.setCreatedDt(currentDte);
            //insNursingGroupMember.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingGroupMemberBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingGroupMember> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


