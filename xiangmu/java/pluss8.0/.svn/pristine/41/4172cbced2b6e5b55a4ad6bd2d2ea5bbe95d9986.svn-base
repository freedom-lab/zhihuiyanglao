package cn.pluss.platform.service.smartAlarmRemindSet.impl;

import cn.pluss.platform.mapper.SmartAlarmRemindSetMapper;
import cn.pluss.platform.model.entity.SmartAlarmRemindSet;
import cn.pluss.platform.service.smartAlarmRemindSet.SmartAlarmRemindSetService;
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
@Service("smartAlarmRemindSetService")
public class SmartAlarmRemindSetServiceImpl extends ServiceImpl< SmartAlarmRemindSetMapper, SmartAlarmRemindSet> implements SmartAlarmRemindSetService {
    private static final Logger logger = LoggerFactory.getLogger(SmartAlarmRemindSetServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartAlarmRemindSet> queryPage(Map map) {
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
    public SmartAlarmRemindSet queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartAlarmRemindSet 实例对象
    * @return 实例对象
    */
    @Override
    public SmartAlarmRemindSet queryOne(SmartAlarmRemindSet smartAlarmRemindSet){
        LambdaQueryWrapper<SmartAlarmRemindSet> queryWrapper = getQueryWrapper(smartAlarmRemindSet);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartAlarmRemindSet
    * @return
    */
    @Override
    public List<SmartAlarmRemindSet> queryList(SmartAlarmRemindSet smartAlarmRemindSet) {
        LambdaQueryWrapper<SmartAlarmRemindSet> queryWrapper = getQueryWrapper(smartAlarmRemindSet);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartAlarmRemindSet
    * @return
    */
    public static LambdaQueryWrapper<SmartAlarmRemindSet> getQueryWrapper(SmartAlarmRemindSet smartAlarmRemindSet){
        LambdaQueryWrapper<SmartAlarmRemindSet> queryWrapper = new LambdaQueryWrapper<>();
        if (smartAlarmRemindSet.getId() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getId, smartAlarmRemindSet.getId());
        }
        if (StringUtil.isNotEmpty(smartAlarmRemindSet.getTenantId())) {
            queryWrapper.eq(SmartAlarmRemindSet::getTenantId, smartAlarmRemindSet.getTenantId());
        }
        if (StringUtil.isNotEmpty(smartAlarmRemindSet.getAlarmLevel())) {
            queryWrapper.eq(SmartAlarmRemindSet::getAlarmLevel, smartAlarmRemindSet.getAlarmLevel());
        }
        if (smartAlarmRemindSet.getIsUserApp() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getIsUserApp, smartAlarmRemindSet.getIsUserApp());
        }
        if (smartAlarmRemindSet.getIsServerApp() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getIsServerApp, smartAlarmRemindSet.getIsServerApp());
        }
        if (smartAlarmRemindSet.getIsSms() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getIsSms, smartAlarmRemindSet.getIsSms());
        }
        if (smartAlarmRemindSet.getIsPhone() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getIsPhone, smartAlarmRemindSet.getIsPhone());
        }
        if (StringUtil.isNotEmpty(smartAlarmRemindSet.getRemark())) {
            queryWrapper.eq(SmartAlarmRemindSet::getRemark, smartAlarmRemindSet.getRemark());
        }
        if (smartAlarmRemindSet.getCreateUser() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getCreateUser, smartAlarmRemindSet.getCreateUser());
        }
        if (smartAlarmRemindSet.getCreateDept() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getCreateDept, smartAlarmRemindSet.getCreateDept());
        }
        if (smartAlarmRemindSet.getCreateTime() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getCreateTime, smartAlarmRemindSet.getCreateTime());
        }
        if (smartAlarmRemindSet.getUpdateUser() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getUpdateUser, smartAlarmRemindSet.getUpdateUser());
        }
        if (smartAlarmRemindSet.getUpdateTime() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getUpdateTime, smartAlarmRemindSet.getUpdateTime());
        }
        if (smartAlarmRemindSet.getIsDeleted() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getIsDeleted, smartAlarmRemindSet.getIsDeleted());
        }
        if (smartAlarmRemindSet.getStatus() != null) {
            queryWrapper.eq(SmartAlarmRemindSet::getStatus, smartAlarmRemindSet.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartAlarmRemindSet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartAlarmRemindSet insert(SmartAlarmRemindSet smartAlarmRemindSet) {
        smartAlarmRemindSet.setId(null);
        getBaseMapper().insert(smartAlarmRemindSet);
        return smartAlarmRemindSet;
    }

    /**
    * 更新数据
    *
    * @param smartAlarmRemindSet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartAlarmRemindSet update(SmartAlarmRemindSet smartAlarmRemindSet) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartAlarmRemindSet> chainWrapper = new LambdaUpdateChainWrapper<SmartAlarmRemindSet>(getBaseMapper());
        if (smartAlarmRemindSet.getId() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getId, smartAlarmRemindSet.getId());
        }
        if (StringUtil.isNotBlank(smartAlarmRemindSet.getTenantId())) {
            chainWrapper.set(SmartAlarmRemindSet::getTenantId, smartAlarmRemindSet.getTenantId());
        }
        if (StringUtil.isNotBlank(smartAlarmRemindSet.getAlarmLevel())) {
            chainWrapper.set(SmartAlarmRemindSet::getAlarmLevel, smartAlarmRemindSet.getAlarmLevel());
        }
        if (smartAlarmRemindSet.getIsUserApp() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getIsUserApp, smartAlarmRemindSet.getIsUserApp());
        }
        if (smartAlarmRemindSet.getIsServerApp() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getIsServerApp, smartAlarmRemindSet.getIsServerApp());
        }
        if (smartAlarmRemindSet.getIsSms() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getIsSms, smartAlarmRemindSet.getIsSms());
        }
        if (smartAlarmRemindSet.getIsPhone() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getIsPhone, smartAlarmRemindSet.getIsPhone());
        }
        if (StringUtil.isNotBlank(smartAlarmRemindSet.getRemark())) {
            chainWrapper.set(SmartAlarmRemindSet::getRemark, smartAlarmRemindSet.getRemark());
        }
        if (smartAlarmRemindSet.getCreateUser() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getCreateUser, smartAlarmRemindSet.getCreateUser());
        }
        if (smartAlarmRemindSet.getCreateDept() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getCreateDept, smartAlarmRemindSet.getCreateDept());
        }
        if (smartAlarmRemindSet.getCreateTime() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getCreateTime, smartAlarmRemindSet.getCreateTime());
        }
        if (smartAlarmRemindSet.getUpdateUser() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getUpdateUser, smartAlarmRemindSet.getUpdateUser());
        }
        if (smartAlarmRemindSet.getUpdateTime() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getUpdateTime, smartAlarmRemindSet.getUpdateTime());
        }
        if (smartAlarmRemindSet.getIsDeleted() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getIsDeleted, smartAlarmRemindSet.getIsDeleted());
        }
        if (smartAlarmRemindSet.getStatus() != null) {
            chainWrapper.set(SmartAlarmRemindSet::getStatus, smartAlarmRemindSet.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartAlarmRemindSet::getId, smartAlarmRemindSet.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartAlarmRemindSet.getId());
        } else {
            return smartAlarmRemindSet;
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
    public boolean saveSmartAlarmRemindSetBatch(List<SmartAlarmRemindSet> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartAlarmRemindSet smartAlarmRemindSet : insertList) {
            //使用默认的雪花算法生成
            smartAlarmRemindSet.setId(null);
            //smartAlarmRemindSet.setCreatedDt(currentDte);
            //smartAlarmRemindSet.setUpdatedDt(currentDte);
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
    public Integer deleteSmartAlarmRemindSetBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartAlarmRemindSet> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


