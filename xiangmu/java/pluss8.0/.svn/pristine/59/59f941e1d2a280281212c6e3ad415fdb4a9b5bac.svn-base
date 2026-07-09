package cn.pluss.platform.service.insSchedulingClasses.impl;

import cn.pluss.platform.mapper.InsSchedulingClassesMapper;
import cn.pluss.platform.model.entity.InsSchedulingClasses;
import cn.pluss.platform.service.insSchedulingClasses.InsSchedulingClassesService;
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
@Service("insSchedulingClassesService")
public class InsSchedulingClassesServiceImpl extends ServiceImpl< InsSchedulingClassesMapper, InsSchedulingClasses> implements InsSchedulingClassesService {
    private static final Logger logger = LoggerFactory.getLogger(InsSchedulingClassesServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSchedulingClasses> queryPage(Map map) {
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
    public InsSchedulingClasses queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingClasses 实例对象
    * @return 实例对象
    */
    @Override
    public InsSchedulingClasses queryOne(InsSchedulingClasses insSchedulingClasses){
        LambdaQueryWrapper<InsSchedulingClasses> queryWrapper = getQueryWrapper(insSchedulingClasses);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSchedulingClasses
    * @return
    */
    @Override
    public List<InsSchedulingClasses> queryList(InsSchedulingClasses insSchedulingClasses) {
        LambdaQueryWrapper<InsSchedulingClasses> queryWrapper = getQueryWrapper(insSchedulingClasses);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSchedulingClasses
    * @return
    */
    public static LambdaQueryWrapper<InsSchedulingClasses> getQueryWrapper(InsSchedulingClasses insSchedulingClasses){
        LambdaQueryWrapper<InsSchedulingClasses> queryWrapper = new LambdaQueryWrapper<>();
        if (insSchedulingClasses.getId() != null) {
            queryWrapper.eq(InsSchedulingClasses::getId, insSchedulingClasses.getId());
        }
        if (StringUtil.isNotEmpty(insSchedulingClasses.getTenantId())) {
            queryWrapper.eq(InsSchedulingClasses::getTenantId, insSchedulingClasses.getTenantId());
        }
        if (insSchedulingClasses.getCorpId() != null) {
            queryWrapper.eq(InsSchedulingClasses::getCorpId, insSchedulingClasses.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSchedulingClasses.getCorpName())) {
            queryWrapper.eq(InsSchedulingClasses::getCorpName, insSchedulingClasses.getCorpName());
        }
        if (insSchedulingClasses.getInstitutionId() != null) {
            queryWrapper.eq(InsSchedulingClasses::getInstitutionId, insSchedulingClasses.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSchedulingClasses.getInstitutionName())) {
            queryWrapper.eq(InsSchedulingClasses::getInstitutionName, insSchedulingClasses.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSchedulingClasses.getClassesName())) {
            queryWrapper.eq(InsSchedulingClasses::getClassesName, insSchedulingClasses.getClassesName());
        }
        if (insSchedulingClasses.getClassesType() != null) {
            queryWrapper.eq(InsSchedulingClasses::getClassesType, insSchedulingClasses.getClassesType());
        }
        if (StringUtil.isNotEmpty(insSchedulingClasses.getStartTime())) {
            queryWrapper.eq(InsSchedulingClasses::getStartTime, insSchedulingClasses.getStartTime());
        }
        if (StringUtil.isNotEmpty(insSchedulingClasses.getEndTime())) {
            queryWrapper.eq(InsSchedulingClasses::getEndTime, insSchedulingClasses.getEndTime());
        }
        if (insSchedulingClasses.getRequiredNum() != null) {
            queryWrapper.eq(InsSchedulingClasses::getRequiredNum, insSchedulingClasses.getRequiredNum());
        }
        if (insSchedulingClasses.getMinRequiredLevel() != null) {
            queryWrapper.eq(InsSchedulingClasses::getMinRequiredLevel, insSchedulingClasses.getMinRequiredLevel());
        }
        if (insSchedulingClasses.getRestDuration() != null) {
            queryWrapper.eq(InsSchedulingClasses::getRestDuration, insSchedulingClasses.getRestDuration());
        }
        if (StringUtil.isNotEmpty(insSchedulingClasses.getRemark())) {
            queryWrapper.eq(InsSchedulingClasses::getRemark, insSchedulingClasses.getRemark());
        }
        if (insSchedulingClasses.getCreateUser() != null) {
            queryWrapper.eq(InsSchedulingClasses::getCreateUser, insSchedulingClasses.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSchedulingClasses.getCreateName())) {
            queryWrapper.eq(InsSchedulingClasses::getCreateName, insSchedulingClasses.getCreateName());
        }
        if (insSchedulingClasses.getCreateDept() != null) {
            queryWrapper.eq(InsSchedulingClasses::getCreateDept, insSchedulingClasses.getCreateDept());
        }
        if (insSchedulingClasses.getCreateTime() != null) {
            queryWrapper.eq(InsSchedulingClasses::getCreateTime, insSchedulingClasses.getCreateTime());
        }
        if (insSchedulingClasses.getUpdateUser() != null) {
            queryWrapper.eq(InsSchedulingClasses::getUpdateUser, insSchedulingClasses.getUpdateUser());
        }
        if (insSchedulingClasses.getUpdateTime() != null) {
            queryWrapper.eq(InsSchedulingClasses::getUpdateTime, insSchedulingClasses.getUpdateTime());
        }
        if (insSchedulingClasses.getIsDeleted() != null) {
            queryWrapper.eq(InsSchedulingClasses::getIsDeleted, insSchedulingClasses.getIsDeleted());
        }
        if (insSchedulingClasses.getStatus() != null) {
            queryWrapper.eq(InsSchedulingClasses::getStatus, insSchedulingClasses.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSchedulingClasses 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingClasses insert(InsSchedulingClasses insSchedulingClasses) {
        insSchedulingClasses.setId(null);
        getBaseMapper().insert(insSchedulingClasses);
        return insSchedulingClasses;
    }

    /**
    * 更新数据
    *
    * @param insSchedulingClasses 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingClasses update(InsSchedulingClasses insSchedulingClasses) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSchedulingClasses> chainWrapper = new LambdaUpdateChainWrapper<InsSchedulingClasses>(getBaseMapper());
        if (insSchedulingClasses.getId() != null) {
            chainWrapper.set(InsSchedulingClasses::getId, insSchedulingClasses.getId());
        }
        if (StringUtil.isNotBlank(insSchedulingClasses.getTenantId())) {
            chainWrapper.set(InsSchedulingClasses::getTenantId, insSchedulingClasses.getTenantId());
        }
        if (insSchedulingClasses.getCorpId() != null) {
            chainWrapper.set(InsSchedulingClasses::getCorpId, insSchedulingClasses.getCorpId());
        }
        if (StringUtil.isNotBlank(insSchedulingClasses.getCorpName())) {
            chainWrapper.set(InsSchedulingClasses::getCorpName, insSchedulingClasses.getCorpName());
        }
        if (insSchedulingClasses.getInstitutionId() != null) {
            chainWrapper.set(InsSchedulingClasses::getInstitutionId, insSchedulingClasses.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSchedulingClasses.getInstitutionName())) {
            chainWrapper.set(InsSchedulingClasses::getInstitutionName, insSchedulingClasses.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSchedulingClasses.getClassesName())) {
            chainWrapper.set(InsSchedulingClasses::getClassesName, insSchedulingClasses.getClassesName());
        }
        if (insSchedulingClasses.getClassesType() != null) {
            chainWrapper.set(InsSchedulingClasses::getClassesType, insSchedulingClasses.getClassesType());
        }
        if (StringUtil.isNotBlank(insSchedulingClasses.getStartTime())) {
            chainWrapper.set(InsSchedulingClasses::getStartTime, insSchedulingClasses.getStartTime());
        }
        if (StringUtil.isNotBlank(insSchedulingClasses.getEndTime())) {
            chainWrapper.set(InsSchedulingClasses::getEndTime, insSchedulingClasses.getEndTime());
        }
        if (insSchedulingClasses.getRequiredNum() != null) {
            chainWrapper.set(InsSchedulingClasses::getRequiredNum, insSchedulingClasses.getRequiredNum());
        }
        if (insSchedulingClasses.getMinRequiredLevel() != null) {
            chainWrapper.set(InsSchedulingClasses::getMinRequiredLevel, insSchedulingClasses.getMinRequiredLevel());
        }
        if (insSchedulingClasses.getRestDuration() != null) {
            chainWrapper.set(InsSchedulingClasses::getRestDuration, insSchedulingClasses.getRestDuration());
        }
        if (StringUtil.isNotBlank(insSchedulingClasses.getRemark())) {
            chainWrapper.set(InsSchedulingClasses::getRemark, insSchedulingClasses.getRemark());
        }
        if (insSchedulingClasses.getCreateUser() != null) {
            chainWrapper.set(InsSchedulingClasses::getCreateUser, insSchedulingClasses.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSchedulingClasses.getCreateName())) {
            chainWrapper.set(InsSchedulingClasses::getCreateName, insSchedulingClasses.getCreateName());
        }
        if (insSchedulingClasses.getCreateDept() != null) {
            chainWrapper.set(InsSchedulingClasses::getCreateDept, insSchedulingClasses.getCreateDept());
        }
        if (insSchedulingClasses.getCreateTime() != null) {
            chainWrapper.set(InsSchedulingClasses::getCreateTime, insSchedulingClasses.getCreateTime());
        }
        if (insSchedulingClasses.getUpdateUser() != null) {
            chainWrapper.set(InsSchedulingClasses::getUpdateUser, insSchedulingClasses.getUpdateUser());
        }
        if (insSchedulingClasses.getUpdateTime() != null) {
            chainWrapper.set(InsSchedulingClasses::getUpdateTime, insSchedulingClasses.getUpdateTime());
        }
        if (insSchedulingClasses.getIsDeleted() != null) {
            chainWrapper.set(InsSchedulingClasses::getIsDeleted, insSchedulingClasses.getIsDeleted());
        }
        if (insSchedulingClasses.getStatus() != null) {
            chainWrapper.set(InsSchedulingClasses::getStatus, insSchedulingClasses.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSchedulingClasses::getId, insSchedulingClasses.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSchedulingClasses.getId());
        } else {
            return insSchedulingClasses;
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
    public boolean saveInsSchedulingClassesBatch(List<InsSchedulingClasses> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSchedulingClasses insSchedulingClasses : insertList) {
            //使用默认的雪花算法生成
            insSchedulingClasses.setId(null);
            //insSchedulingClasses.setCreatedDt(currentDte);
            //insSchedulingClasses.setUpdatedDt(currentDte);
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
    public Integer deleteInsSchedulingClassesBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSchedulingClasses> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


