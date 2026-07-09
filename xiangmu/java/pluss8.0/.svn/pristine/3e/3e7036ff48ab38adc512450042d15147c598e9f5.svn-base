package cn.pluss.platform.service.insNursingRehabSetting.impl;

import cn.pluss.platform.mapper.InsNursingRehabSettingMapper;
import cn.pluss.platform.model.entity.InsNursingRehabSetting;
import cn.pluss.platform.service.insNursingRehabSetting.InsNursingRehabSettingService;
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
@Service("insNursingRehabSettingService")
public class InsNursingRehabSettingServiceImpl extends ServiceImpl< InsNursingRehabSettingMapper, InsNursingRehabSetting> implements InsNursingRehabSettingService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingRehabSettingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingRehabSetting> queryPage(Map map) {
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
    public InsNursingRehabSetting queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRehabSetting 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingRehabSetting queryOne(InsNursingRehabSetting insNursingRehabSetting){
        LambdaQueryWrapper<InsNursingRehabSetting> queryWrapper = getQueryWrapper(insNursingRehabSetting);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRehabSetting
    * @return
    */
    @Override
    public List<InsNursingRehabSetting> queryList(InsNursingRehabSetting insNursingRehabSetting) {
        LambdaQueryWrapper<InsNursingRehabSetting> queryWrapper = getQueryWrapper(insNursingRehabSetting);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingRehabSetting
    * @return
    */
    public static LambdaQueryWrapper<InsNursingRehabSetting> getQueryWrapper(InsNursingRehabSetting insNursingRehabSetting){
        LambdaQueryWrapper<InsNursingRehabSetting> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingRehabSetting.getId() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getId, insNursingRehabSetting.getId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getTenantId())) {
            queryWrapper.eq(InsNursingRehabSetting::getTenantId, insNursingRehabSetting.getTenantId());
        }
        if (insNursingRehabSetting.getCorpId() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getCorpId, insNursingRehabSetting.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getCorpName())) {
            queryWrapper.eq(InsNursingRehabSetting::getCorpName, insNursingRehabSetting.getCorpName());
        }
        if (insNursingRehabSetting.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getInstitutionId, insNursingRehabSetting.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getInstitutionName())) {
            queryWrapper.eq(InsNursingRehabSetting::getInstitutionName, insNursingRehabSetting.getInstitutionName());
        }
        if (insNursingRehabSetting.getCheckId() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getCheckId, insNursingRehabSetting.getCheckId());
        }
        if (insNursingRehabSetting.getCheckDate() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getCheckDate, insNursingRehabSetting.getCheckDate());
        }
        if (insNursingRehabSetting.getElderId() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getElderId, insNursingRehabSetting.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getElderName())) {
            queryWrapper.eq(InsNursingRehabSetting::getElderName, insNursingRehabSetting.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getIdCard())) {
            queryWrapper.eq(InsNursingRehabSetting::getIdCard, insNursingRehabSetting.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getSex())) {
            queryWrapper.eq(InsNursingRehabSetting::getSex, insNursingRehabSetting.getSex());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getPlanName())) {
            queryWrapper.eq(InsNursingRehabSetting::getPlanName, insNursingRehabSetting.getPlanName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getLocationName())) {
            queryWrapper.eq(InsNursingRehabSetting::getLocationName, insNursingRehabSetting.getLocationName());
        }
        if (insNursingRehabSetting.getStartDate() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getStartDate, insNursingRehabSetting.getStartDate());
        }
        if (insNursingRehabSetting.getEndDate() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getEndDate, insNursingRehabSetting.getEndDate());
        }
        if (insNursingRehabSetting.getExecuteState() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getExecuteState, insNursingRehabSetting.getExecuteState());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getSummarizeContent())) {
            queryWrapper.eq(InsNursingRehabSetting::getSummarizeContent, insNursingRehabSetting.getSummarizeContent());
        }
        if (insNursingRehabSetting.getNursingStaffId() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getNursingStaffId, insNursingRehabSetting.getNursingStaffId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getNursingStaffName())) {
            queryWrapper.eq(InsNursingRehabSetting::getNursingStaffName, insNursingRehabSetting.getNursingStaffName());
        }
        if (insNursingRehabSetting.getSummarizeTime() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getSummarizeTime, insNursingRehabSetting.getSummarizeTime());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getRemark())) {
            queryWrapper.eq(InsNursingRehabSetting::getRemark, insNursingRehabSetting.getRemark());
        }
        if (insNursingRehabSetting.getCreateUser() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getCreateUser, insNursingRehabSetting.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSetting.getCreateName())) {
            queryWrapper.eq(InsNursingRehabSetting::getCreateName, insNursingRehabSetting.getCreateName());
        }
        if (insNursingRehabSetting.getCreateDept() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getCreateDept, insNursingRehabSetting.getCreateDept());
        }
        if (insNursingRehabSetting.getCreateTime() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getCreateTime, insNursingRehabSetting.getCreateTime());
        }
        if (insNursingRehabSetting.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getUpdateUser, insNursingRehabSetting.getUpdateUser());
        }
        if (insNursingRehabSetting.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getUpdateTime, insNursingRehabSetting.getUpdateTime());
        }
        if (insNursingRehabSetting.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getIsDeleted, insNursingRehabSetting.getIsDeleted());
        }
        if (insNursingRehabSetting.getStatus() != null) {
            queryWrapper.eq(InsNursingRehabSetting::getStatus, insNursingRehabSetting.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingRehabSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabSetting insert(InsNursingRehabSetting insNursingRehabSetting) {
        insNursingRehabSetting.setId(null);
        getBaseMapper().insert(insNursingRehabSetting);
        return insNursingRehabSetting;
    }

    /**
    * 更新数据
    *
    * @param insNursingRehabSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabSetting update(InsNursingRehabSetting insNursingRehabSetting) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingRehabSetting> chainWrapper = new LambdaUpdateChainWrapper<InsNursingRehabSetting>(getBaseMapper());
        if (insNursingRehabSetting.getId() != null) {
            chainWrapper.set(InsNursingRehabSetting::getId, insNursingRehabSetting.getId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getTenantId())) {
            chainWrapper.set(InsNursingRehabSetting::getTenantId, insNursingRehabSetting.getTenantId());
        }
        if (insNursingRehabSetting.getCorpId() != null) {
            chainWrapper.set(InsNursingRehabSetting::getCorpId, insNursingRehabSetting.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getCorpName())) {
            chainWrapper.set(InsNursingRehabSetting::getCorpName, insNursingRehabSetting.getCorpName());
        }
        if (insNursingRehabSetting.getInstitutionId() != null) {
            chainWrapper.set(InsNursingRehabSetting::getInstitutionId, insNursingRehabSetting.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getInstitutionName())) {
            chainWrapper.set(InsNursingRehabSetting::getInstitutionName, insNursingRehabSetting.getInstitutionName());
        }
        if (insNursingRehabSetting.getCheckId() != null) {
            chainWrapper.set(InsNursingRehabSetting::getCheckId, insNursingRehabSetting.getCheckId());
        }
        if (insNursingRehabSetting.getCheckDate() != null) {
            chainWrapper.set(InsNursingRehabSetting::getCheckDate, insNursingRehabSetting.getCheckDate());
        }
        if (insNursingRehabSetting.getElderId() != null) {
            chainWrapper.set(InsNursingRehabSetting::getElderId, insNursingRehabSetting.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getElderName())) {
            chainWrapper.set(InsNursingRehabSetting::getElderName, insNursingRehabSetting.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getIdCard())) {
            chainWrapper.set(InsNursingRehabSetting::getIdCard, insNursingRehabSetting.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getSex())) {
            chainWrapper.set(InsNursingRehabSetting::getSex, insNursingRehabSetting.getSex());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getPlanName())) {
            chainWrapper.set(InsNursingRehabSetting::getPlanName, insNursingRehabSetting.getPlanName());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getLocationName())) {
            chainWrapper.set(InsNursingRehabSetting::getLocationName, insNursingRehabSetting.getLocationName());
        }
        if (insNursingRehabSetting.getStartDate() != null) {
            chainWrapper.set(InsNursingRehabSetting::getStartDate, insNursingRehabSetting.getStartDate());
        }
        if (insNursingRehabSetting.getEndDate() != null) {
            chainWrapper.set(InsNursingRehabSetting::getEndDate, insNursingRehabSetting.getEndDate());
        }
        if (insNursingRehabSetting.getExecuteState() != null) {
            chainWrapper.set(InsNursingRehabSetting::getExecuteState, insNursingRehabSetting.getExecuteState());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getSummarizeContent())) {
            chainWrapper.set(InsNursingRehabSetting::getSummarizeContent, insNursingRehabSetting.getSummarizeContent());
        }
        if (insNursingRehabSetting.getNursingStaffId() != null) {
            chainWrapper.set(InsNursingRehabSetting::getNursingStaffId, insNursingRehabSetting.getNursingStaffId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getNursingStaffName())) {
            chainWrapper.set(InsNursingRehabSetting::getNursingStaffName, insNursingRehabSetting.getNursingStaffName());
        }
        if (insNursingRehabSetting.getSummarizeTime() != null) {
            chainWrapper.set(InsNursingRehabSetting::getSummarizeTime, insNursingRehabSetting.getSummarizeTime());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getRemark())) {
            chainWrapper.set(InsNursingRehabSetting::getRemark, insNursingRehabSetting.getRemark());
        }
        if (insNursingRehabSetting.getCreateUser() != null) {
            chainWrapper.set(InsNursingRehabSetting::getCreateUser, insNursingRehabSetting.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingRehabSetting.getCreateName())) {
            chainWrapper.set(InsNursingRehabSetting::getCreateName, insNursingRehabSetting.getCreateName());
        }
        if (insNursingRehabSetting.getCreateDept() != null) {
            chainWrapper.set(InsNursingRehabSetting::getCreateDept, insNursingRehabSetting.getCreateDept());
        }
        if (insNursingRehabSetting.getCreateTime() != null) {
            chainWrapper.set(InsNursingRehabSetting::getCreateTime, insNursingRehabSetting.getCreateTime());
        }
        if (insNursingRehabSetting.getUpdateUser() != null) {
            chainWrapper.set(InsNursingRehabSetting::getUpdateUser, insNursingRehabSetting.getUpdateUser());
        }
        if (insNursingRehabSetting.getUpdateTime() != null) {
            chainWrapper.set(InsNursingRehabSetting::getUpdateTime, insNursingRehabSetting.getUpdateTime());
        }
        if (insNursingRehabSetting.getIsDeleted() != null) {
            chainWrapper.set(InsNursingRehabSetting::getIsDeleted, insNursingRehabSetting.getIsDeleted());
        }
        if (insNursingRehabSetting.getStatus() != null) {
            chainWrapper.set(InsNursingRehabSetting::getStatus, insNursingRehabSetting.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingRehabSetting::getId, insNursingRehabSetting.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingRehabSetting.getId());
        } else {
            return insNursingRehabSetting;
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
    public boolean saveInsNursingRehabSettingBatch(List<InsNursingRehabSetting> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingRehabSetting insNursingRehabSetting : insertList) {
            //使用默认的雪花算法生成
            insNursingRehabSetting.setId(null);
            //insNursingRehabSetting.setCreatedDt(currentDte);
            //insNursingRehabSetting.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingRehabSettingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingRehabSetting> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


