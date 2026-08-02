package cn.pluss.platform.service.smartAlarmLevelSet.impl;

import cn.pluss.platform.mapper.SmartAlarmLevelSetMapper;
import cn.pluss.platform.model.entity.SmartAlarmLevelSet;
import cn.pluss.platform.service.smartAlarmLevelSet.SmartAlarmLevelSetService;
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
@Service("smartAlarmLevelSetService")
public class SmartAlarmLevelSetServiceImpl extends ServiceImpl< SmartAlarmLevelSetMapper, SmartAlarmLevelSet> implements SmartAlarmLevelSetService {
    private static final Logger logger = LoggerFactory.getLogger(SmartAlarmLevelSetServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartAlarmLevelSet> queryPage(Map map) {
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
    public SmartAlarmLevelSet queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartAlarmLevelSet 实例对象
    * @return 实例对象
    */
    @Override
    public SmartAlarmLevelSet queryOne(SmartAlarmLevelSet smartAlarmLevelSet){
        LambdaQueryWrapper<SmartAlarmLevelSet> queryWrapper = getQueryWrapper(smartAlarmLevelSet);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartAlarmLevelSet
    * @return
    */
    @Override
    public List<SmartAlarmLevelSet> queryList(SmartAlarmLevelSet smartAlarmLevelSet) {
        LambdaQueryWrapper<SmartAlarmLevelSet> queryWrapper = getQueryWrapper(smartAlarmLevelSet);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartAlarmLevelSet
    * @return
    */
    public static LambdaQueryWrapper<SmartAlarmLevelSet> getQueryWrapper(SmartAlarmLevelSet smartAlarmLevelSet){
        LambdaQueryWrapper<SmartAlarmLevelSet> queryWrapper = new LambdaQueryWrapper<>();
        if (smartAlarmLevelSet.getId() != null) {
            queryWrapper.eq(SmartAlarmLevelSet::getId, smartAlarmLevelSet.getId());
        }
        if (StringUtil.isNotEmpty(smartAlarmLevelSet.getTenantId())) {
            queryWrapper.eq(SmartAlarmLevelSet::getTenantId, smartAlarmLevelSet.getTenantId());
        }
        if (StringUtil.isNotEmpty(smartAlarmLevelSet.getAlarmType())) {
            queryWrapper.eq(SmartAlarmLevelSet::getAlarmType, smartAlarmLevelSet.getAlarmType());
        }
        if (StringUtil.isNotEmpty(smartAlarmLevelSet.getAlarmLevel())) {
            queryWrapper.eq(SmartAlarmLevelSet::getAlarmLevel, smartAlarmLevelSet.getAlarmLevel());
        }
        if (StringUtil.isNotEmpty(smartAlarmLevelSet.getRemark())) {
            queryWrapper.eq(SmartAlarmLevelSet::getRemark, smartAlarmLevelSet.getRemark());
        }
        if (smartAlarmLevelSet.getCreateUser() != null) {
            queryWrapper.eq(SmartAlarmLevelSet::getCreateUser, smartAlarmLevelSet.getCreateUser());
        }
        if (smartAlarmLevelSet.getCreateDept() != null) {
            queryWrapper.eq(SmartAlarmLevelSet::getCreateDept, smartAlarmLevelSet.getCreateDept());
        }
        if (smartAlarmLevelSet.getCreateTime() != null) {
            queryWrapper.eq(SmartAlarmLevelSet::getCreateTime, smartAlarmLevelSet.getCreateTime());
        }
        if (smartAlarmLevelSet.getUpdateUser() != null) {
            queryWrapper.eq(SmartAlarmLevelSet::getUpdateUser, smartAlarmLevelSet.getUpdateUser());
        }
        if (smartAlarmLevelSet.getUpdateTime() != null) {
            queryWrapper.eq(SmartAlarmLevelSet::getUpdateTime, smartAlarmLevelSet.getUpdateTime());
        }
        if (smartAlarmLevelSet.getIsDeleted() != null) {
            queryWrapper.eq(SmartAlarmLevelSet::getIsDeleted, smartAlarmLevelSet.getIsDeleted());
        }
        if (smartAlarmLevelSet.getStatus() != null) {
            queryWrapper.eq(SmartAlarmLevelSet::getStatus, smartAlarmLevelSet.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartAlarmLevelSet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartAlarmLevelSet insert(SmartAlarmLevelSet smartAlarmLevelSet) {
        smartAlarmLevelSet.setId(null);
        getBaseMapper().insert(smartAlarmLevelSet);
        return smartAlarmLevelSet;
    }

    /**
    * 更新数据
    *
    * @param smartAlarmLevelSet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartAlarmLevelSet update(SmartAlarmLevelSet smartAlarmLevelSet) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartAlarmLevelSet> chainWrapper = new LambdaUpdateChainWrapper<SmartAlarmLevelSet>(getBaseMapper());
        if (smartAlarmLevelSet.getId() != null) {
            chainWrapper.set(SmartAlarmLevelSet::getId, smartAlarmLevelSet.getId());
        }
        if (StringUtil.isNotBlank(smartAlarmLevelSet.getTenantId())) {
            chainWrapper.set(SmartAlarmLevelSet::getTenantId, smartAlarmLevelSet.getTenantId());
        }
        if (StringUtil.isNotBlank(smartAlarmLevelSet.getAlarmType())) {
            chainWrapper.set(SmartAlarmLevelSet::getAlarmType, smartAlarmLevelSet.getAlarmType());
        }
        if (StringUtil.isNotBlank(smartAlarmLevelSet.getAlarmLevel())) {
            chainWrapper.set(SmartAlarmLevelSet::getAlarmLevel, smartAlarmLevelSet.getAlarmLevel());
        }
        if (StringUtil.isNotBlank(smartAlarmLevelSet.getRemark())) {
            chainWrapper.set(SmartAlarmLevelSet::getRemark, smartAlarmLevelSet.getRemark());
        }
        if (smartAlarmLevelSet.getCreateUser() != null) {
            chainWrapper.set(SmartAlarmLevelSet::getCreateUser, smartAlarmLevelSet.getCreateUser());
        }
        if (smartAlarmLevelSet.getCreateDept() != null) {
            chainWrapper.set(SmartAlarmLevelSet::getCreateDept, smartAlarmLevelSet.getCreateDept());
        }
        if (smartAlarmLevelSet.getCreateTime() != null) {
            chainWrapper.set(SmartAlarmLevelSet::getCreateTime, smartAlarmLevelSet.getCreateTime());
        }
        if (smartAlarmLevelSet.getUpdateUser() != null) {
            chainWrapper.set(SmartAlarmLevelSet::getUpdateUser, smartAlarmLevelSet.getUpdateUser());
        }
        if (smartAlarmLevelSet.getUpdateTime() != null) {
            chainWrapper.set(SmartAlarmLevelSet::getUpdateTime, smartAlarmLevelSet.getUpdateTime());
        }
        if (smartAlarmLevelSet.getIsDeleted() != null) {
            chainWrapper.set(SmartAlarmLevelSet::getIsDeleted, smartAlarmLevelSet.getIsDeleted());
        }
        if (smartAlarmLevelSet.getStatus() != null) {
            chainWrapper.set(SmartAlarmLevelSet::getStatus, smartAlarmLevelSet.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartAlarmLevelSet::getId, smartAlarmLevelSet.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartAlarmLevelSet.getId());
        } else {
            return smartAlarmLevelSet;
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
    public boolean saveSmartAlarmLevelSetBatch(List<SmartAlarmLevelSet> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartAlarmLevelSet smartAlarmLevelSet : insertList) {
            //使用默认的雪花算法生成
            smartAlarmLevelSet.setId(null);
            //smartAlarmLevelSet.setCreatedDt(currentDte);
            //smartAlarmLevelSet.setUpdatedDt(currentDte);
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
    public Integer deleteSmartAlarmLevelSetBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartAlarmLevelSet> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


