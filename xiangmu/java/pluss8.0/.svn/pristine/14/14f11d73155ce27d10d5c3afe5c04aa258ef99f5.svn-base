package cn.pluss.platform.service.careNursingElderStandard.impl;

import cn.pluss.platform.mapper.CareNursingElderStandardMapper;
import cn.pluss.platform.model.entity.CareNursingElderStandard;
import cn.pluss.platform.service.careNursingElderStandard.CareNursingElderStandardService;
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
@Service("careNursingElderStandardService")
public class CareNursingElderStandardServiceImpl extends ServiceImpl< CareNursingElderStandardMapper, CareNursingElderStandard> implements CareNursingElderStandardService {
    private static final Logger logger = LoggerFactory.getLogger(CareNursingElderStandardServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CareNursingElderStandard> queryPage(Map map) {
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
    public CareNursingElderStandard queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param careNursingElderStandard 实例对象
    * @return 实例对象
    */
    @Override
    public CareNursingElderStandard queryOne(CareNursingElderStandard careNursingElderStandard){
        LambdaQueryWrapper<CareNursingElderStandard> queryWrapper = getQueryWrapper(careNursingElderStandard);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param careNursingElderStandard
    * @return
    */
    @Override
    public List<CareNursingElderStandard> queryList(CareNursingElderStandard careNursingElderStandard) {
        LambdaQueryWrapper<CareNursingElderStandard> queryWrapper = getQueryWrapper(careNursingElderStandard);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param careNursingElderStandard
    * @return
    */
    public static LambdaQueryWrapper<CareNursingElderStandard> getQueryWrapper(CareNursingElderStandard careNursingElderStandard){
        LambdaQueryWrapper<CareNursingElderStandard> queryWrapper = new LambdaQueryWrapper<>();
        if (careNursingElderStandard.getId() != null) {
            queryWrapper.eq(CareNursingElderStandard::getId, careNursingElderStandard.getId());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getTenantId())) {
            queryWrapper.eq(CareNursingElderStandard::getTenantId, careNursingElderStandard.getTenantId());
        }
        if (careNursingElderStandard.getCorpId() != null) {
            queryWrapper.eq(CareNursingElderStandard::getCorpId, careNursingElderStandard.getCorpId());
        }
        if (careNursingElderStandard.getInstitutionId() != null) {
            queryWrapper.eq(CareNursingElderStandard::getInstitutionId, careNursingElderStandard.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getInstitutionName())) {
            queryWrapper.eq(CareNursingElderStandard::getInstitutionName, careNursingElderStandard.getInstitutionName());
        }
        if (careNursingElderStandard.getEnrollId() != null) {
            queryWrapper.eq(CareNursingElderStandard::getEnrollId, careNursingElderStandard.getEnrollId());
        }
        if (careNursingElderStandard.getEnrollDate() != null) {
            queryWrapper.eq(CareNursingElderStandard::getEnrollDate, careNursingElderStandard.getEnrollDate());
        }
        if (careNursingElderStandard.getElderId() != null) {
            queryWrapper.eq(CareNursingElderStandard::getElderId, careNursingElderStandard.getElderId());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getElderName())) {
            queryWrapper.eq(CareNursingElderStandard::getElderName, careNursingElderStandard.getElderName());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getIdCard())) {
            queryWrapper.eq(CareNursingElderStandard::getIdCard, careNursingElderStandard.getIdCard());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getSex())) {
            queryWrapper.eq(CareNursingElderStandard::getSex, careNursingElderStandard.getSex());
        }
        if (careNursingElderStandard.getNursingLevelId() != null) {
            queryWrapper.eq(CareNursingElderStandard::getNursingLevelId, careNursingElderStandard.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getNursingLevelName())) {
            queryWrapper.eq(CareNursingElderStandard::getNursingLevelName, careNursingElderStandard.getNursingLevelName());
        }
        if (careNursingElderStandard.getItemCategory() != null) {
            queryWrapper.eq(CareNursingElderStandard::getItemCategory, careNursingElderStandard.getItemCategory());
        }
        if (careNursingElderStandard.getTypeId() != null) {
            queryWrapper.eq(CareNursingElderStandard::getTypeId, careNursingElderStandard.getTypeId());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getTypeName())) {
            queryWrapper.eq(CareNursingElderStandard::getTypeName, careNursingElderStandard.getTypeName());
        }
        if (careNursingElderStandard.getItemId() != null) {
            queryWrapper.eq(CareNursingElderStandard::getItemId, careNursingElderStandard.getItemId());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getItemName())) {
            queryWrapper.eq(CareNursingElderStandard::getItemName, careNursingElderStandard.getItemName());
        }
        if (careNursingElderStandard.getItemFrequency() != null) {
            queryWrapper.eq(CareNursingElderStandard::getItemFrequency, careNursingElderStandard.getItemFrequency());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getOperationType())) {
            queryWrapper.eq(CareNursingElderStandard::getOperationType, careNursingElderStandard.getOperationType());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getStartTime())) {
            queryWrapper.eq(CareNursingElderStandard::getStartTime, careNursingElderStandard.getStartTime());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getEndTime())) {
            queryWrapper.eq(CareNursingElderStandard::getEndTime, careNursingElderStandard.getEndTime());
        }
        if (careNursingElderStandard.getWeekNum() != null) {
            queryWrapper.eq(CareNursingElderStandard::getWeekNum, careNursingElderStandard.getWeekNum());
        }
        if (careNursingElderStandard.getDayNum() != null) {
            queryWrapper.eq(CareNursingElderStandard::getDayNum, careNursingElderStandard.getDayNum());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getRemark())) {
            queryWrapper.eq(CareNursingElderStandard::getRemark, careNursingElderStandard.getRemark());
        }
        if (careNursingElderStandard.getCreateUser() != null) {
            queryWrapper.eq(CareNursingElderStandard::getCreateUser, careNursingElderStandard.getCreateUser());
        }
        if (StringUtil.isNotEmpty(careNursingElderStandard.getCreateName())) {
            queryWrapper.eq(CareNursingElderStandard::getCreateName, careNursingElderStandard.getCreateName());
        }
        if (careNursingElderStandard.getCreateDept() != null) {
            queryWrapper.eq(CareNursingElderStandard::getCreateDept, careNursingElderStandard.getCreateDept());
        }
        if (careNursingElderStandard.getCreateTime() != null) {
            queryWrapper.eq(CareNursingElderStandard::getCreateTime, careNursingElderStandard.getCreateTime());
        }
        if (careNursingElderStandard.getUpdateUser() != null) {
            queryWrapper.eq(CareNursingElderStandard::getUpdateUser, careNursingElderStandard.getUpdateUser());
        }
        if (careNursingElderStandard.getUpdateTime() != null) {
            queryWrapper.eq(CareNursingElderStandard::getUpdateTime, careNursingElderStandard.getUpdateTime());
        }
        if (careNursingElderStandard.getIsDeleted() != null) {
            queryWrapper.eq(CareNursingElderStandard::getIsDeleted, careNursingElderStandard.getIsDeleted());
        }
        if (careNursingElderStandard.getStatus() != null) {
            queryWrapper.eq(CareNursingElderStandard::getStatus, careNursingElderStandard.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param careNursingElderStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingElderStandard insert(CareNursingElderStandard careNursingElderStandard) {
        careNursingElderStandard.setId(null);
        getBaseMapper().insert(careNursingElderStandard);
        return careNursingElderStandard;
    }

    /**
    * 更新数据
    *
    * @param careNursingElderStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareNursingElderStandard update(CareNursingElderStandard careNursingElderStandard) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CareNursingElderStandard> chainWrapper = new LambdaUpdateChainWrapper<CareNursingElderStandard>(getBaseMapper());
        if (careNursingElderStandard.getId() != null) {
            chainWrapper.set(CareNursingElderStandard::getId, careNursingElderStandard.getId());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getTenantId())) {
            chainWrapper.set(CareNursingElderStandard::getTenantId, careNursingElderStandard.getTenantId());
        }
        if (careNursingElderStandard.getCorpId() != null) {
            chainWrapper.set(CareNursingElderStandard::getCorpId, careNursingElderStandard.getCorpId());
        }
        if (careNursingElderStandard.getInstitutionId() != null) {
            chainWrapper.set(CareNursingElderStandard::getInstitutionId, careNursingElderStandard.getInstitutionId());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getInstitutionName())) {
            chainWrapper.set(CareNursingElderStandard::getInstitutionName, careNursingElderStandard.getInstitutionName());
        }
        if (careNursingElderStandard.getEnrollId() != null) {
            chainWrapper.set(CareNursingElderStandard::getEnrollId, careNursingElderStandard.getEnrollId());
        }
        if (careNursingElderStandard.getEnrollDate() != null) {
            chainWrapper.set(CareNursingElderStandard::getEnrollDate, careNursingElderStandard.getEnrollDate());
        }
        if (careNursingElderStandard.getElderId() != null) {
            chainWrapper.set(CareNursingElderStandard::getElderId, careNursingElderStandard.getElderId());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getElderName())) {
            chainWrapper.set(CareNursingElderStandard::getElderName, careNursingElderStandard.getElderName());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getIdCard())) {
            chainWrapper.set(CareNursingElderStandard::getIdCard, careNursingElderStandard.getIdCard());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getSex())) {
            chainWrapper.set(CareNursingElderStandard::getSex, careNursingElderStandard.getSex());
        }
        if (careNursingElderStandard.getNursingLevelId() != null) {
            chainWrapper.set(CareNursingElderStandard::getNursingLevelId, careNursingElderStandard.getNursingLevelId());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getNursingLevelName())) {
            chainWrapper.set(CareNursingElderStandard::getNursingLevelName, careNursingElderStandard.getNursingLevelName());
        }
        if (careNursingElderStandard.getItemCategory() != null) {
            chainWrapper.set(CareNursingElderStandard::getItemCategory, careNursingElderStandard.getItemCategory());
        }
        if (careNursingElderStandard.getTypeId() != null) {
            chainWrapper.set(CareNursingElderStandard::getTypeId, careNursingElderStandard.getTypeId());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getTypeName())) {
            chainWrapper.set(CareNursingElderStandard::getTypeName, careNursingElderStandard.getTypeName());
        }
        if (careNursingElderStandard.getItemId() != null) {
            chainWrapper.set(CareNursingElderStandard::getItemId, careNursingElderStandard.getItemId());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getItemName())) {
            chainWrapper.set(CareNursingElderStandard::getItemName, careNursingElderStandard.getItemName());
        }
        if (careNursingElderStandard.getItemFrequency() != null) {
            chainWrapper.set(CareNursingElderStandard::getItemFrequency, careNursingElderStandard.getItemFrequency());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getOperationType())) {
            chainWrapper.set(CareNursingElderStandard::getOperationType, careNursingElderStandard.getOperationType());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getStartTime())) {
            chainWrapper.set(CareNursingElderStandard::getStartTime, careNursingElderStandard.getStartTime());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getEndTime())) {
            chainWrapper.set(CareNursingElderStandard::getEndTime, careNursingElderStandard.getEndTime());
        }
        if (careNursingElderStandard.getWeekNum() != null) {
            chainWrapper.set(CareNursingElderStandard::getWeekNum, careNursingElderStandard.getWeekNum());
        }
        if (careNursingElderStandard.getDayNum() != null) {
            chainWrapper.set(CareNursingElderStandard::getDayNum, careNursingElderStandard.getDayNum());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getRemark())) {
            chainWrapper.set(CareNursingElderStandard::getRemark, careNursingElderStandard.getRemark());
        }
        if (careNursingElderStandard.getCreateUser() != null) {
            chainWrapper.set(CareNursingElderStandard::getCreateUser, careNursingElderStandard.getCreateUser());
        }
        if (StringUtil.isNotBlank(careNursingElderStandard.getCreateName())) {
            chainWrapper.set(CareNursingElderStandard::getCreateName, careNursingElderStandard.getCreateName());
        }
        if (careNursingElderStandard.getCreateDept() != null) {
            chainWrapper.set(CareNursingElderStandard::getCreateDept, careNursingElderStandard.getCreateDept());
        }
        if (careNursingElderStandard.getCreateTime() != null) {
            chainWrapper.set(CareNursingElderStandard::getCreateTime, careNursingElderStandard.getCreateTime());
        }
        if (careNursingElderStandard.getUpdateUser() != null) {
            chainWrapper.set(CareNursingElderStandard::getUpdateUser, careNursingElderStandard.getUpdateUser());
        }
        if (careNursingElderStandard.getUpdateTime() != null) {
            chainWrapper.set(CareNursingElderStandard::getUpdateTime, careNursingElderStandard.getUpdateTime());
        }
        if (careNursingElderStandard.getIsDeleted() != null) {
            chainWrapper.set(CareNursingElderStandard::getIsDeleted, careNursingElderStandard.getIsDeleted());
        }
        if (careNursingElderStandard.getStatus() != null) {
            chainWrapper.set(CareNursingElderStandard::getStatus, careNursingElderStandard.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CareNursingElderStandard::getId, careNursingElderStandard.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(careNursingElderStandard.getId());
        } else {
            return careNursingElderStandard;
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
    public boolean saveCareNursingElderStandardBatch(List<CareNursingElderStandard> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CareNursingElderStandard careNursingElderStandard : insertList) {
            //使用默认的雪花算法生成
            careNursingElderStandard.setId(null);
            //careNursingElderStandard.setCreatedDt(currentDte);
            //careNursingElderStandard.setUpdatedDt(currentDte);
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
    public Integer deleteCareNursingElderStandardBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CareNursingElderStandard> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


