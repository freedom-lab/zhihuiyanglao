package cn.pluss.platform.service.communityMedicationRemind.impl;

import cn.pluss.platform.mapper.CommunityMedicationRemindMapper;
import cn.pluss.platform.model.entity.CommunityMedicationRemind;
import cn.pluss.platform.service.communityMedicationRemind.CommunityMedicationRemindService;
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
@Service("communityMedicationRemindService")
public class CommunityMedicationRemindServiceImpl extends ServiceImpl< CommunityMedicationRemindMapper, CommunityMedicationRemind> implements CommunityMedicationRemindService {
    private static final Logger logger = LoggerFactory.getLogger(CommunityMedicationRemindServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CommunityMedicationRemind> queryPage(Map map) {
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
    public CommunityMedicationRemind queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param communityMedicationRemind 实例对象
    * @return 实例对象
    */
    @Override
    public CommunityMedicationRemind queryOne(CommunityMedicationRemind communityMedicationRemind){
        LambdaQueryWrapper<CommunityMedicationRemind> queryWrapper = getQueryWrapper(communityMedicationRemind);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param communityMedicationRemind
    * @return
    */
    @Override
    public List<CommunityMedicationRemind> queryList(CommunityMedicationRemind communityMedicationRemind) {
        LambdaQueryWrapper<CommunityMedicationRemind> queryWrapper = getQueryWrapper(communityMedicationRemind);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param communityMedicationRemind
    * @return
    */
    public static LambdaQueryWrapper<CommunityMedicationRemind> getQueryWrapper(CommunityMedicationRemind communityMedicationRemind){
        LambdaQueryWrapper<CommunityMedicationRemind> queryWrapper = new LambdaQueryWrapper<>();
        if (communityMedicationRemind.getId() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getId, communityMedicationRemind.getId());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getTenantId())) {
            queryWrapper.eq(CommunityMedicationRemind::getTenantId, communityMedicationRemind.getTenantId());
        }
        if (communityMedicationRemind.getCorpId() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getCorpId, communityMedicationRemind.getCorpId());
        }
        if (communityMedicationRemind.getInstitutionId() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getInstitutionId, communityMedicationRemind.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getInstitutionName())) {
            queryWrapper.eq(CommunityMedicationRemind::getInstitutionName, communityMedicationRemind.getInstitutionName());
        }
        if (communityMedicationRemind.getElderId() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getElderId, communityMedicationRemind.getElderId());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getElderName())) {
            queryWrapper.eq(CommunityMedicationRemind::getElderName, communityMedicationRemind.getElderName());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getLinkTel())) {
            queryWrapper.eq(CommunityMedicationRemind::getLinkTel, communityMedicationRemind.getLinkTel());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getDrugName())) {
            queryWrapper.eq(CommunityMedicationRemind::getDrugName, communityMedicationRemind.getDrugName());
        }
        if (communityMedicationRemind.getStartDate() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getStartDate, communityMedicationRemind.getStartDate());
        }
        if (communityMedicationRemind.getEndDate() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getEndDate, communityMedicationRemind.getEndDate());
        }
        if (communityMedicationRemind.getDrugDays() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getDrugDays, communityMedicationRemind.getDrugDays());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getDrugDosage())) {
            queryWrapper.eq(CommunityMedicationRemind::getDrugDosage, communityMedicationRemind.getDrugDosage());
        }
        if (communityMedicationRemind.getMedicationType() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getMedicationType, communityMedicationRemind.getMedicationType());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getMorningTime())) {
            queryWrapper.eq(CommunityMedicationRemind::getMorningTime, communityMedicationRemind.getMorningTime());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getNoonTime())) {
            queryWrapper.eq(CommunityMedicationRemind::getNoonTime, communityMedicationRemind.getNoonTime());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getEveningTime())) {
            queryWrapper.eq(CommunityMedicationRemind::getEveningTime, communityMedicationRemind.getEveningTime());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getSelectTime())) {
            queryWrapper.eq(CommunityMedicationRemind::getSelectTime, communityMedicationRemind.getSelectTime());
        }
        if (communityMedicationRemind.getDrugState() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getDrugState, communityMedicationRemind.getDrugState());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getSendContext())) {
            queryWrapper.eq(CommunityMedicationRemind::getSendContext, communityMedicationRemind.getSendContext());
        }
        if (communityMedicationRemind.getAreaCode() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getAreaCode, communityMedicationRemind.getAreaCode());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getAreaName())) {
            queryWrapper.eq(CommunityMedicationRemind::getAreaName, communityMedicationRemind.getAreaName());
        }
        if (StringUtil.isNotEmpty(communityMedicationRemind.getRemark())) {
            queryWrapper.eq(CommunityMedicationRemind::getRemark, communityMedicationRemind.getRemark());
        }
        if (communityMedicationRemind.getCreateUser() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getCreateUser, communityMedicationRemind.getCreateUser());
        }
        if (communityMedicationRemind.getCreateDept() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getCreateDept, communityMedicationRemind.getCreateDept());
        }
        if (communityMedicationRemind.getCreateTime() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getCreateTime, communityMedicationRemind.getCreateTime());
        }
        if (communityMedicationRemind.getUpdateUser() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getUpdateUser, communityMedicationRemind.getUpdateUser());
        }
        if (communityMedicationRemind.getUpdateTime() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getUpdateTime, communityMedicationRemind.getUpdateTime());
        }
        if (communityMedicationRemind.getStatus() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getStatus, communityMedicationRemind.getStatus());
        }
        if (communityMedicationRemind.getIsDeleted() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getIsDeleted, communityMedicationRemind.getIsDeleted());
        }
        if (communityMedicationRemind.getReminderMethod() != null) {
            queryWrapper.eq(CommunityMedicationRemind::getReminderMethod, communityMedicationRemind.getReminderMethod());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param communityMedicationRemind 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityMedicationRemind insert(CommunityMedicationRemind communityMedicationRemind) {
        communityMedicationRemind.setId(null);
        getBaseMapper().insert(communityMedicationRemind);
        return communityMedicationRemind;
    }

    /**
    * 更新数据
    *
    * @param communityMedicationRemind 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityMedicationRemind update(CommunityMedicationRemind communityMedicationRemind) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CommunityMedicationRemind> chainWrapper = new LambdaUpdateChainWrapper<CommunityMedicationRemind>(getBaseMapper());
        if (communityMedicationRemind.getId() != null) {
            chainWrapper.set(CommunityMedicationRemind::getId, communityMedicationRemind.getId());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getTenantId())) {
            chainWrapper.set(CommunityMedicationRemind::getTenantId, communityMedicationRemind.getTenantId());
        }
        if (communityMedicationRemind.getCorpId() != null) {
            chainWrapper.set(CommunityMedicationRemind::getCorpId, communityMedicationRemind.getCorpId());
        }
        if (communityMedicationRemind.getInstitutionId() != null) {
            chainWrapper.set(CommunityMedicationRemind::getInstitutionId, communityMedicationRemind.getInstitutionId());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getInstitutionName())) {
            chainWrapper.set(CommunityMedicationRemind::getInstitutionName, communityMedicationRemind.getInstitutionName());
        }
        if (communityMedicationRemind.getElderId() != null) {
            chainWrapper.set(CommunityMedicationRemind::getElderId, communityMedicationRemind.getElderId());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getElderName())) {
            chainWrapper.set(CommunityMedicationRemind::getElderName, communityMedicationRemind.getElderName());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getLinkTel())) {
            chainWrapper.set(CommunityMedicationRemind::getLinkTel, communityMedicationRemind.getLinkTel());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getDrugName())) {
            chainWrapper.set(CommunityMedicationRemind::getDrugName, communityMedicationRemind.getDrugName());
        }
        if (communityMedicationRemind.getStartDate() != null) {
            chainWrapper.set(CommunityMedicationRemind::getStartDate, communityMedicationRemind.getStartDate());
        }
        if (communityMedicationRemind.getEndDate() != null) {
            chainWrapper.set(CommunityMedicationRemind::getEndDate, communityMedicationRemind.getEndDate());
        }
        if (communityMedicationRemind.getDrugDays() != null) {
            chainWrapper.set(CommunityMedicationRemind::getDrugDays, communityMedicationRemind.getDrugDays());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getDrugDosage())) {
            chainWrapper.set(CommunityMedicationRemind::getDrugDosage, communityMedicationRemind.getDrugDosage());
        }
        if (communityMedicationRemind.getMedicationType() != null) {
            chainWrapper.set(CommunityMedicationRemind::getMedicationType, communityMedicationRemind.getMedicationType());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getMorningTime())) {
            chainWrapper.set(CommunityMedicationRemind::getMorningTime, communityMedicationRemind.getMorningTime());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getNoonTime())) {
            chainWrapper.set(CommunityMedicationRemind::getNoonTime, communityMedicationRemind.getNoonTime());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getEveningTime())) {
            chainWrapper.set(CommunityMedicationRemind::getEveningTime, communityMedicationRemind.getEveningTime());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getSelectTime())) {
            chainWrapper.set(CommunityMedicationRemind::getSelectTime, communityMedicationRemind.getSelectTime());
        }
        if (communityMedicationRemind.getDrugState() != null) {
            chainWrapper.set(CommunityMedicationRemind::getDrugState, communityMedicationRemind.getDrugState());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getSendContext())) {
            chainWrapper.set(CommunityMedicationRemind::getSendContext, communityMedicationRemind.getSendContext());
        }
        if (communityMedicationRemind.getAreaCode() != null) {
            chainWrapper.set(CommunityMedicationRemind::getAreaCode, communityMedicationRemind.getAreaCode());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getAreaName())) {
            chainWrapper.set(CommunityMedicationRemind::getAreaName, communityMedicationRemind.getAreaName());
        }
        if (StringUtil.isNotBlank(communityMedicationRemind.getRemark())) {
            chainWrapper.set(CommunityMedicationRemind::getRemark, communityMedicationRemind.getRemark());
        }
        if (communityMedicationRemind.getCreateUser() != null) {
            chainWrapper.set(CommunityMedicationRemind::getCreateUser, communityMedicationRemind.getCreateUser());
        }
        if (communityMedicationRemind.getCreateDept() != null) {
            chainWrapper.set(CommunityMedicationRemind::getCreateDept, communityMedicationRemind.getCreateDept());
        }
        if (communityMedicationRemind.getCreateTime() != null) {
            chainWrapper.set(CommunityMedicationRemind::getCreateTime, communityMedicationRemind.getCreateTime());
        }
        if (communityMedicationRemind.getUpdateUser() != null) {
            chainWrapper.set(CommunityMedicationRemind::getUpdateUser, communityMedicationRemind.getUpdateUser());
        }
        if (communityMedicationRemind.getUpdateTime() != null) {
            chainWrapper.set(CommunityMedicationRemind::getUpdateTime, communityMedicationRemind.getUpdateTime());
        }
        if (communityMedicationRemind.getStatus() != null) {
            chainWrapper.set(CommunityMedicationRemind::getStatus, communityMedicationRemind.getStatus());
        }
        if (communityMedicationRemind.getIsDeleted() != null) {
            chainWrapper.set(CommunityMedicationRemind::getIsDeleted, communityMedicationRemind.getIsDeleted());
        }
        if (communityMedicationRemind.getReminderMethod() != null) {
            chainWrapper.set(CommunityMedicationRemind::getReminderMethod, communityMedicationRemind.getReminderMethod());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CommunityMedicationRemind::getId, communityMedicationRemind.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(communityMedicationRemind.getId());
        } else {
            return communityMedicationRemind;
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
    public boolean saveCommunityMedicationRemindBatch(List<CommunityMedicationRemind> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CommunityMedicationRemind communityMedicationRemind : insertList) {
            //使用默认的雪花算法生成
            communityMedicationRemind.setId(null);
            //communityMedicationRemind.setCreatedDt(currentDte);
            //communityMedicationRemind.setUpdatedDt(currentDte);
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
    public Integer deleteCommunityMedicationRemindBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CommunityMedicationRemind> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


