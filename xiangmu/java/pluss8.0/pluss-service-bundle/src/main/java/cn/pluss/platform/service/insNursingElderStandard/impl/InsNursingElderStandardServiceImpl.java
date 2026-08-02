package cn.pluss.platform.service.insNursingElderStandard.impl;

import cn.pluss.platform.mapper.InsNursingElderStandardMapper;
import cn.pluss.platform.model.entity.InsNursingElderStandard;
import cn.pluss.platform.service.insNursingElderStandard.InsNursingElderStandardService;
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
@Service("insNursingElderStandardService")
public class InsNursingElderStandardServiceImpl extends ServiceImpl< InsNursingElderStandardMapper, InsNursingElderStandard> implements InsNursingElderStandardService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingElderStandardServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingElderStandard> queryPage(Map map) {
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
    public InsNursingElderStandard queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingElderStandard 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingElderStandard queryOne(InsNursingElderStandard insNursingElderStandard){
        LambdaQueryWrapper<InsNursingElderStandard> queryWrapper = getQueryWrapper(insNursingElderStandard);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingElderStandard
    * @return
    */
    @Override
    public List<InsNursingElderStandard> queryList(InsNursingElderStandard insNursingElderStandard) {
        LambdaQueryWrapper<InsNursingElderStandard> queryWrapper = getQueryWrapper(insNursingElderStandard);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingElderStandard
    * @return
    */
    public static LambdaQueryWrapper<InsNursingElderStandard> getQueryWrapper(InsNursingElderStandard insNursingElderStandard){
        LambdaQueryWrapper<InsNursingElderStandard> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingElderStandard.getId() != null) {
            queryWrapper.eq(InsNursingElderStandard::getId, insNursingElderStandard.getId());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getTenantId())) {
            queryWrapper.eq(InsNursingElderStandard::getTenantId, insNursingElderStandard.getTenantId());
        }
        if (insNursingElderStandard.getCorpId() != null) {
            queryWrapper.eq(InsNursingElderStandard::getCorpId, insNursingElderStandard.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getCorpName())) {
            queryWrapper.eq(InsNursingElderStandard::getCorpName, insNursingElderStandard.getCorpName());
        }
        if (insNursingElderStandard.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingElderStandard::getInstitutionId, insNursingElderStandard.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getInstitutionName())) {
            queryWrapper.eq(InsNursingElderStandard::getInstitutionName, insNursingElderStandard.getInstitutionName());
        }
        if (insNursingElderStandard.getCheckId() != null) {
            queryWrapper.eq(InsNursingElderStandard::getCheckId, insNursingElderStandard.getCheckId());
        }
        if (insNursingElderStandard.getCheckDate() != null) {
            queryWrapper.eq(InsNursingElderStandard::getCheckDate, insNursingElderStandard.getCheckDate());
        }
        if (insNursingElderStandard.getElderId() != null) {
            queryWrapper.eq(InsNursingElderStandard::getElderId, insNursingElderStandard.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getElderName())) {
            queryWrapper.eq(InsNursingElderStandard::getElderName, insNursingElderStandard.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getIdCard())) {
            queryWrapper.eq(InsNursingElderStandard::getIdCard, insNursingElderStandard.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getSex())) {
            queryWrapper.eq(InsNursingElderStandard::getSex, insNursingElderStandard.getSex());
        }
        if (insNursingElderStandard.getNursingLevelId() != null) {
            queryWrapper.eq(InsNursingElderStandard::getNursingLevelId, insNursingElderStandard.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getNursingLevelName())) {
            queryWrapper.eq(InsNursingElderStandard::getNursingLevelName, insNursingElderStandard.getNursingLevelName());
        }
        if (insNursingElderStandard.getItemCategory() != null) {
            queryWrapper.eq(InsNursingElderStandard::getItemCategory, insNursingElderStandard.getItemCategory());
        }
        if (insNursingElderStandard.getTypeId() != null) {
            queryWrapper.eq(InsNursingElderStandard::getTypeId, insNursingElderStandard.getTypeId());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getTypeName())) {
            queryWrapper.eq(InsNursingElderStandard::getTypeName, insNursingElderStandard.getTypeName());
        }
        if (insNursingElderStandard.getItemId() != null) {
            queryWrapper.eq(InsNursingElderStandard::getItemId, insNursingElderStandard.getItemId());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getItemName())) {
            queryWrapper.eq(InsNursingElderStandard::getItemName, insNursingElderStandard.getItemName());
        }
        if (insNursingElderStandard.getItemFrequency() != null) {
            queryWrapper.eq(InsNursingElderStandard::getItemFrequency, insNursingElderStandard.getItemFrequency());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getStartTime())) {
            queryWrapper.eq(InsNursingElderStandard::getStartTime, insNursingElderStandard.getStartTime());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getEndTime())) {
            queryWrapper.eq(InsNursingElderStandard::getEndTime, insNursingElderStandard.getEndTime());
        }
        if (insNursingElderStandard.getWeekNum() != null) {
            queryWrapper.eq(InsNursingElderStandard::getWeekNum, insNursingElderStandard.getWeekNum());
        }
        if (insNursingElderStandard.getDayNum() != null) {
            queryWrapper.eq(InsNursingElderStandard::getDayNum, insNursingElderStandard.getDayNum());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getRemark())) {
            queryWrapper.eq(InsNursingElderStandard::getRemark, insNursingElderStandard.getRemark());
        }
        if (insNursingElderStandard.getCreateUser() != null) {
            queryWrapper.eq(InsNursingElderStandard::getCreateUser, insNursingElderStandard.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingElderStandard.getCreateName())) {
            queryWrapper.eq(InsNursingElderStandard::getCreateName, insNursingElderStandard.getCreateName());
        }
        if (insNursingElderStandard.getCreateDept() != null) {
            queryWrapper.eq(InsNursingElderStandard::getCreateDept, insNursingElderStandard.getCreateDept());
        }
        if (insNursingElderStandard.getCreateTime() != null) {
            queryWrapper.eq(InsNursingElderStandard::getCreateTime, insNursingElderStandard.getCreateTime());
        }
        if (insNursingElderStandard.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingElderStandard::getUpdateUser, insNursingElderStandard.getUpdateUser());
        }
        if (insNursingElderStandard.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingElderStandard::getUpdateTime, insNursingElderStandard.getUpdateTime());
        }
        if (insNursingElderStandard.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingElderStandard::getIsDeleted, insNursingElderStandard.getIsDeleted());
        }
        if (insNursingElderStandard.getStatus() != null) {
            queryWrapper.eq(InsNursingElderStandard::getStatus, insNursingElderStandard.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingElderStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingElderStandard insert(InsNursingElderStandard insNursingElderStandard) {
        insNursingElderStandard.setId(null);
        getBaseMapper().insert(insNursingElderStandard);
        return insNursingElderStandard;
    }

    /**
    * 更新数据
    *
    * @param insNursingElderStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingElderStandard update(InsNursingElderStandard insNursingElderStandard) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingElderStandard> chainWrapper = new LambdaUpdateChainWrapper<InsNursingElderStandard>(getBaseMapper());
        if (insNursingElderStandard.getId() != null) {
            chainWrapper.set(InsNursingElderStandard::getId, insNursingElderStandard.getId());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getTenantId())) {
            chainWrapper.set(InsNursingElderStandard::getTenantId, insNursingElderStandard.getTenantId());
        }
        if (insNursingElderStandard.getCorpId() != null) {
            chainWrapper.set(InsNursingElderStandard::getCorpId, insNursingElderStandard.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getCorpName())) {
            chainWrapper.set(InsNursingElderStandard::getCorpName, insNursingElderStandard.getCorpName());
        }
        if (insNursingElderStandard.getInstitutionId() != null) {
            chainWrapper.set(InsNursingElderStandard::getInstitutionId, insNursingElderStandard.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getInstitutionName())) {
            chainWrapper.set(InsNursingElderStandard::getInstitutionName, insNursingElderStandard.getInstitutionName());
        }
        if (insNursingElderStandard.getCheckId() != null) {
            chainWrapper.set(InsNursingElderStandard::getCheckId, insNursingElderStandard.getCheckId());
        }
        if (insNursingElderStandard.getCheckDate() != null) {
            chainWrapper.set(InsNursingElderStandard::getCheckDate, insNursingElderStandard.getCheckDate());
        }
        if (insNursingElderStandard.getElderId() != null) {
            chainWrapper.set(InsNursingElderStandard::getElderId, insNursingElderStandard.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getElderName())) {
            chainWrapper.set(InsNursingElderStandard::getElderName, insNursingElderStandard.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getIdCard())) {
            chainWrapper.set(InsNursingElderStandard::getIdCard, insNursingElderStandard.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getSex())) {
            chainWrapper.set(InsNursingElderStandard::getSex, insNursingElderStandard.getSex());
        }
        if (insNursingElderStandard.getNursingLevelId() != null) {
            chainWrapper.set(InsNursingElderStandard::getNursingLevelId, insNursingElderStandard.getNursingLevelId());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getNursingLevelName())) {
            chainWrapper.set(InsNursingElderStandard::getNursingLevelName, insNursingElderStandard.getNursingLevelName());
        }
        if (insNursingElderStandard.getItemCategory() != null) {
            chainWrapper.set(InsNursingElderStandard::getItemCategory, insNursingElderStandard.getItemCategory());
        }
        if (insNursingElderStandard.getTypeId() != null) {
            chainWrapper.set(InsNursingElderStandard::getTypeId, insNursingElderStandard.getTypeId());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getTypeName())) {
            chainWrapper.set(InsNursingElderStandard::getTypeName, insNursingElderStandard.getTypeName());
        }
        if (insNursingElderStandard.getItemId() != null) {
            chainWrapper.set(InsNursingElderStandard::getItemId, insNursingElderStandard.getItemId());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getItemName())) {
            chainWrapper.set(InsNursingElderStandard::getItemName, insNursingElderStandard.getItemName());
        }
        if (insNursingElderStandard.getItemFrequency() != null) {
            chainWrapper.set(InsNursingElderStandard::getItemFrequency, insNursingElderStandard.getItemFrequency());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getStartTime())) {
            chainWrapper.set(InsNursingElderStandard::getStartTime, insNursingElderStandard.getStartTime());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getEndTime())) {
            chainWrapper.set(InsNursingElderStandard::getEndTime, insNursingElderStandard.getEndTime());
        }
        if (insNursingElderStandard.getWeekNum() != null) {
            chainWrapper.set(InsNursingElderStandard::getWeekNum, insNursingElderStandard.getWeekNum());
        }
        if (insNursingElderStandard.getDayNum() != null) {
            chainWrapper.set(InsNursingElderStandard::getDayNum, insNursingElderStandard.getDayNum());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getRemark())) {
            chainWrapper.set(InsNursingElderStandard::getRemark, insNursingElderStandard.getRemark());
        }
        if (insNursingElderStandard.getCreateUser() != null) {
            chainWrapper.set(InsNursingElderStandard::getCreateUser, insNursingElderStandard.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingElderStandard.getCreateName())) {
            chainWrapper.set(InsNursingElderStandard::getCreateName, insNursingElderStandard.getCreateName());
        }
        if (insNursingElderStandard.getCreateDept() != null) {
            chainWrapper.set(InsNursingElderStandard::getCreateDept, insNursingElderStandard.getCreateDept());
        }
        if (insNursingElderStandard.getCreateTime() != null) {
            chainWrapper.set(InsNursingElderStandard::getCreateTime, insNursingElderStandard.getCreateTime());
        }
        if (insNursingElderStandard.getUpdateUser() != null) {
            chainWrapper.set(InsNursingElderStandard::getUpdateUser, insNursingElderStandard.getUpdateUser());
        }
        if (insNursingElderStandard.getUpdateTime() != null) {
            chainWrapper.set(InsNursingElderStandard::getUpdateTime, insNursingElderStandard.getUpdateTime());
        }
        if (insNursingElderStandard.getIsDeleted() != null) {
            chainWrapper.set(InsNursingElderStandard::getIsDeleted, insNursingElderStandard.getIsDeleted());
        }
        if (insNursingElderStandard.getStatus() != null) {
            chainWrapper.set(InsNursingElderStandard::getStatus, insNursingElderStandard.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingElderStandard::getId, insNursingElderStandard.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingElderStandard.getId());
        } else {
            return insNursingElderStandard;
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
    public boolean saveInsNursingElderStandardBatch(List<InsNursingElderStandard> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingElderStandard insNursingElderStandard : insertList) {
            //使用默认的雪花算法生成
            insNursingElderStandard.setId(null);
            //insNursingElderStandard.setCreatedDt(currentDte);
            //insNursingElderStandard.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingElderStandardBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingElderStandard> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


