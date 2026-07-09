package cn.pluss.platform.service.insCanteenPlanSetting.impl;

import cn.pluss.platform.mapper.InsCanteenPlanSettingMapper;
import cn.pluss.platform.model.entity.InsCanteenPlanSetting;
import cn.pluss.platform.service.insCanteenPlanSetting.InsCanteenPlanSettingService;
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
@Service("insCanteenPlanSettingService")
public class InsCanteenPlanSettingServiceImpl extends ServiceImpl< InsCanteenPlanSettingMapper, InsCanteenPlanSetting> implements InsCanteenPlanSettingService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenPlanSettingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenPlanSetting> queryPage(Map map) {
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
    public InsCanteenPlanSetting queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenPlanSetting 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenPlanSetting queryOne(InsCanteenPlanSetting insCanteenPlanSetting){
        LambdaQueryWrapper<InsCanteenPlanSetting> queryWrapper = getQueryWrapper(insCanteenPlanSetting);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenPlanSetting
    * @return
    */
    @Override
    public List<InsCanteenPlanSetting> queryList(InsCanteenPlanSetting insCanteenPlanSetting) {
        LambdaQueryWrapper<InsCanteenPlanSetting> queryWrapper = getQueryWrapper(insCanteenPlanSetting);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenPlanSetting
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenPlanSetting> getQueryWrapper(InsCanteenPlanSetting insCanteenPlanSetting){
        LambdaQueryWrapper<InsCanteenPlanSetting> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenPlanSetting.getId() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getId, insCanteenPlanSetting.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getTenantId())) {
            queryWrapper.eq(InsCanteenPlanSetting::getTenantId, insCanteenPlanSetting.getTenantId());
        }
        if (insCanteenPlanSetting.getCorpId() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getCorpId, insCanteenPlanSetting.getCorpId());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getCorpName())) {
            queryWrapper.eq(InsCanteenPlanSetting::getCorpName, insCanteenPlanSetting.getCorpName());
        }
        if (insCanteenPlanSetting.getInstitutionId() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getInstitutionId, insCanteenPlanSetting.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getInstitutionName())) {
            queryWrapper.eq(InsCanteenPlanSetting::getInstitutionName, insCanteenPlanSetting.getInstitutionName());
        }
        if (insCanteenPlanSetting.getCheckId() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getCheckId, insCanteenPlanSetting.getCheckId());
        }
        if (insCanteenPlanSetting.getElderId() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getElderId, insCanteenPlanSetting.getElderId());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getElderName())) {
            queryWrapper.eq(InsCanteenPlanSetting::getElderName, insCanteenPlanSetting.getElderName());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getIdCard())) {
            queryWrapper.eq(InsCanteenPlanSetting::getIdCard, insCanteenPlanSetting.getIdCard());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getLinkTel())) {
            queryWrapper.eq(InsCanteenPlanSetting::getLinkTel, insCanteenPlanSetting.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getAddress())) {
            queryWrapper.eq(InsCanteenPlanSetting::getAddress, insCanteenPlanSetting.getAddress());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getMealType())) {
            queryWrapper.eq(InsCanteenPlanSetting::getMealType, insCanteenPlanSetting.getMealType());
        }
        if (insCanteenPlanSetting.getStaffId() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getStaffId, insCanteenPlanSetting.getStaffId());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getStaffName())) {
            queryWrapper.eq(InsCanteenPlanSetting::getStaffName, insCanteenPlanSetting.getStaffName());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getStaffLinkTel())) {
            queryWrapper.eq(InsCanteenPlanSetting::getStaffLinkTel, insCanteenPlanSetting.getStaffLinkTel());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getRemark())) {
            queryWrapper.eq(InsCanteenPlanSetting::getRemark, insCanteenPlanSetting.getRemark());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getAreaCode())) {
            queryWrapper.eq(InsCanteenPlanSetting::getAreaCode, insCanteenPlanSetting.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getAreaName())) {
            queryWrapper.eq(InsCanteenPlanSetting::getAreaName, insCanteenPlanSetting.getAreaName());
        }
        if (insCanteenPlanSetting.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getCreateUser, insCanteenPlanSetting.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenPlanSetting.getCreateName())) {
            queryWrapper.eq(InsCanteenPlanSetting::getCreateName, insCanteenPlanSetting.getCreateName());
        }
        if (insCanteenPlanSetting.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getCreateDept, insCanteenPlanSetting.getCreateDept());
        }
        if (insCanteenPlanSetting.getCreateTime() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getCreateTime, insCanteenPlanSetting.getCreateTime());
        }
        if (insCanteenPlanSetting.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getUpdateUser, insCanteenPlanSetting.getUpdateUser());
        }
        if (insCanteenPlanSetting.getUpdateTime() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getUpdateTime, insCanteenPlanSetting.getUpdateTime());
        }
        if (insCanteenPlanSetting.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getIsDeleted, insCanteenPlanSetting.getIsDeleted());
        }
        if (insCanteenPlanSetting.getStatus() != null) {
            queryWrapper.eq(InsCanteenPlanSetting::getStatus, insCanteenPlanSetting.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenPlanSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenPlanSetting insert(InsCanteenPlanSetting insCanteenPlanSetting) {
        insCanteenPlanSetting.setId(null);
        getBaseMapper().insert(insCanteenPlanSetting);
        return insCanteenPlanSetting;
    }

    /**
    * 更新数据
    *
    * @param insCanteenPlanSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenPlanSetting update(InsCanteenPlanSetting insCanteenPlanSetting) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenPlanSetting> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenPlanSetting>(getBaseMapper());
        if (insCanteenPlanSetting.getId() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getId, insCanteenPlanSetting.getId());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getTenantId())) {
            chainWrapper.set(InsCanteenPlanSetting::getTenantId, insCanteenPlanSetting.getTenantId());
        }
        if (insCanteenPlanSetting.getCorpId() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getCorpId, insCanteenPlanSetting.getCorpId());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getCorpName())) {
            chainWrapper.set(InsCanteenPlanSetting::getCorpName, insCanteenPlanSetting.getCorpName());
        }
        if (insCanteenPlanSetting.getInstitutionId() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getInstitutionId, insCanteenPlanSetting.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getInstitutionName())) {
            chainWrapper.set(InsCanteenPlanSetting::getInstitutionName, insCanteenPlanSetting.getInstitutionName());
        }
        if (insCanteenPlanSetting.getCheckId() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getCheckId, insCanteenPlanSetting.getCheckId());
        }
        if (insCanteenPlanSetting.getElderId() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getElderId, insCanteenPlanSetting.getElderId());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getElderName())) {
            chainWrapper.set(InsCanteenPlanSetting::getElderName, insCanteenPlanSetting.getElderName());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getIdCard())) {
            chainWrapper.set(InsCanteenPlanSetting::getIdCard, insCanteenPlanSetting.getIdCard());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getLinkTel())) {
            chainWrapper.set(InsCanteenPlanSetting::getLinkTel, insCanteenPlanSetting.getLinkTel());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getAddress())) {
            chainWrapper.set(InsCanteenPlanSetting::getAddress, insCanteenPlanSetting.getAddress());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getMealType())) {
            chainWrapper.set(InsCanteenPlanSetting::getMealType, insCanteenPlanSetting.getMealType());
        }
        if (insCanteenPlanSetting.getStaffId() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getStaffId, insCanteenPlanSetting.getStaffId());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getStaffName())) {
            chainWrapper.set(InsCanteenPlanSetting::getStaffName, insCanteenPlanSetting.getStaffName());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getStaffLinkTel())) {
            chainWrapper.set(InsCanteenPlanSetting::getStaffLinkTel, insCanteenPlanSetting.getStaffLinkTel());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getRemark())) {
            chainWrapper.set(InsCanteenPlanSetting::getRemark, insCanteenPlanSetting.getRemark());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getAreaCode())) {
            chainWrapper.set(InsCanteenPlanSetting::getAreaCode, insCanteenPlanSetting.getAreaCode());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getAreaName())) {
            chainWrapper.set(InsCanteenPlanSetting::getAreaName, insCanteenPlanSetting.getAreaName());
        }
        if (insCanteenPlanSetting.getCreateUser() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getCreateUser, insCanteenPlanSetting.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenPlanSetting.getCreateName())) {
            chainWrapper.set(InsCanteenPlanSetting::getCreateName, insCanteenPlanSetting.getCreateName());
        }
        if (insCanteenPlanSetting.getCreateDept() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getCreateDept, insCanteenPlanSetting.getCreateDept());
        }
        if (insCanteenPlanSetting.getCreateTime() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getCreateTime, insCanteenPlanSetting.getCreateTime());
        }
        if (insCanteenPlanSetting.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getUpdateUser, insCanteenPlanSetting.getUpdateUser());
        }
        if (insCanteenPlanSetting.getUpdateTime() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getUpdateTime, insCanteenPlanSetting.getUpdateTime());
        }
        if (insCanteenPlanSetting.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getIsDeleted, insCanteenPlanSetting.getIsDeleted());
        }
        if (insCanteenPlanSetting.getStatus() != null) {
            chainWrapper.set(InsCanteenPlanSetting::getStatus, insCanteenPlanSetting.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenPlanSetting::getId, insCanteenPlanSetting.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenPlanSetting.getId());
        } else {
            return insCanteenPlanSetting;
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
    public boolean saveInsCanteenPlanSettingBatch(List<InsCanteenPlanSetting> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenPlanSetting insCanteenPlanSetting : insertList) {
            //使用默认的雪花算法生成
            insCanteenPlanSetting.setId(null);
            //insCanteenPlanSetting.setCreatedDt(currentDte);
            //insCanteenPlanSetting.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenPlanSettingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenPlanSetting> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


