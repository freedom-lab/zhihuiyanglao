package cn.pluss.platform.service.bladeProcessLeave.impl;

import cn.pluss.platform.mapper.BladeProcessLeaveMapper;
import cn.pluss.platform.model.entity.BladeProcessLeave;
import cn.pluss.platform.service.bladeProcessLeave.BladeProcessLeaveService;
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
@Service("bladeProcessLeaveService")
public class BladeProcessLeaveServiceImpl extends ServiceImpl< BladeProcessLeaveMapper, BladeProcessLeave> implements BladeProcessLeaveService {
    private static final Logger logger = LoggerFactory.getLogger(BladeProcessLeaveServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<BladeProcessLeave> queryPage(Map map) {
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
    public BladeProcessLeave queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param bladeProcessLeave 实例对象
    * @return 实例对象
    */
    @Override
    public BladeProcessLeave queryOne(BladeProcessLeave bladeProcessLeave){
        LambdaQueryWrapper<BladeProcessLeave> queryWrapper = getQueryWrapper(bladeProcessLeave);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param bladeProcessLeave
    * @return
    */
    @Override
    public List<BladeProcessLeave> queryList(BladeProcessLeave bladeProcessLeave) {
        LambdaQueryWrapper<BladeProcessLeave> queryWrapper = getQueryWrapper(bladeProcessLeave);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param bladeProcessLeave
    * @return
    */
    public static LambdaQueryWrapper<BladeProcessLeave> getQueryWrapper(BladeProcessLeave bladeProcessLeave){
        LambdaQueryWrapper<BladeProcessLeave> queryWrapper = new LambdaQueryWrapper<>();
        if (bladeProcessLeave.getId() != null) {
            queryWrapper.eq(BladeProcessLeave::getId, bladeProcessLeave.getId());
        }
        if (StringUtil.isNotEmpty(bladeProcessLeave.getProcessDefinitionId())) {
            queryWrapper.eq(BladeProcessLeave::getProcessDefinitionId, bladeProcessLeave.getProcessDefinitionId());
        }
        if (StringUtil.isNotEmpty(bladeProcessLeave.getProcessInstanceId())) {
            queryWrapper.eq(BladeProcessLeave::getProcessInstanceId, bladeProcessLeave.getProcessInstanceId());
        }
        if (bladeProcessLeave.getStartTime() != null) {
            queryWrapper.eq(BladeProcessLeave::getStartTime, bladeProcessLeave.getStartTime());
        }
        if (bladeProcessLeave.getEndTime() != null) {
            queryWrapper.eq(BladeProcessLeave::getEndTime, bladeProcessLeave.getEndTime());
        }
        if (StringUtil.isNotEmpty(bladeProcessLeave.getReason())) {
            queryWrapper.eq(BladeProcessLeave::getReason, bladeProcessLeave.getReason());
        }
        if (StringUtil.isNotEmpty(bladeProcessLeave.getTaskUser())) {
            queryWrapper.eq(BladeProcessLeave::getTaskUser, bladeProcessLeave.getTaskUser());
        }
        if (bladeProcessLeave.getApplyTime() != null) {
            queryWrapper.eq(BladeProcessLeave::getApplyTime, bladeProcessLeave.getApplyTime());
        }
        if (bladeProcessLeave.getCreateUser() != null) {
            queryWrapper.eq(BladeProcessLeave::getCreateUser, bladeProcessLeave.getCreateUser());
        }
        if (bladeProcessLeave.getCreateDept() != null) {
            queryWrapper.eq(BladeProcessLeave::getCreateDept, bladeProcessLeave.getCreateDept());
        }
        if (bladeProcessLeave.getCreateTime() != null) {
            queryWrapper.eq(BladeProcessLeave::getCreateTime, bladeProcessLeave.getCreateTime());
        }
        if (bladeProcessLeave.getUpdateUser() != null) {
            queryWrapper.eq(BladeProcessLeave::getUpdateUser, bladeProcessLeave.getUpdateUser());
        }
        if (bladeProcessLeave.getUpdateTime() != null) {
            queryWrapper.eq(BladeProcessLeave::getUpdateTime, bladeProcessLeave.getUpdateTime());
        }
        if (bladeProcessLeave.getStatus() != null) {
            queryWrapper.eq(BladeProcessLeave::getStatus, bladeProcessLeave.getStatus());
        }
        if (bladeProcessLeave.getIsDeleted() != null) {
            queryWrapper.eq(BladeProcessLeave::getIsDeleted, bladeProcessLeave.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param bladeProcessLeave 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public BladeProcessLeave insert(BladeProcessLeave bladeProcessLeave) {
        bladeProcessLeave.setId(null);
        getBaseMapper().insert(bladeProcessLeave);
        return bladeProcessLeave;
    }

    /**
    * 更新数据
    *
    * @param bladeProcessLeave 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public BladeProcessLeave update(BladeProcessLeave bladeProcessLeave) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<BladeProcessLeave> chainWrapper = new LambdaUpdateChainWrapper<BladeProcessLeave>(getBaseMapper());
        if (bladeProcessLeave.getId() != null) {
            chainWrapper.set(BladeProcessLeave::getId, bladeProcessLeave.getId());
        }
        if (StringUtil.isNotBlank(bladeProcessLeave.getProcessDefinitionId())) {
            chainWrapper.set(BladeProcessLeave::getProcessDefinitionId, bladeProcessLeave.getProcessDefinitionId());
        }
        if (StringUtil.isNotBlank(bladeProcessLeave.getProcessInstanceId())) {
            chainWrapper.set(BladeProcessLeave::getProcessInstanceId, bladeProcessLeave.getProcessInstanceId());
        }
        if (bladeProcessLeave.getStartTime() != null) {
            chainWrapper.set(BladeProcessLeave::getStartTime, bladeProcessLeave.getStartTime());
        }
        if (bladeProcessLeave.getEndTime() != null) {
            chainWrapper.set(BladeProcessLeave::getEndTime, bladeProcessLeave.getEndTime());
        }
        if (StringUtil.isNotBlank(bladeProcessLeave.getReason())) {
            chainWrapper.set(BladeProcessLeave::getReason, bladeProcessLeave.getReason());
        }
        if (StringUtil.isNotBlank(bladeProcessLeave.getTaskUser())) {
            chainWrapper.set(BladeProcessLeave::getTaskUser, bladeProcessLeave.getTaskUser());
        }
        if (bladeProcessLeave.getApplyTime() != null) {
            chainWrapper.set(BladeProcessLeave::getApplyTime, bladeProcessLeave.getApplyTime());
        }
        if (bladeProcessLeave.getCreateUser() != null) {
            chainWrapper.set(BladeProcessLeave::getCreateUser, bladeProcessLeave.getCreateUser());
        }
        if (bladeProcessLeave.getCreateDept() != null) {
            chainWrapper.set(BladeProcessLeave::getCreateDept, bladeProcessLeave.getCreateDept());
        }
        if (bladeProcessLeave.getCreateTime() != null) {
            chainWrapper.set(BladeProcessLeave::getCreateTime, bladeProcessLeave.getCreateTime());
        }
        if (bladeProcessLeave.getUpdateUser() != null) {
            chainWrapper.set(BladeProcessLeave::getUpdateUser, bladeProcessLeave.getUpdateUser());
        }
        if (bladeProcessLeave.getUpdateTime() != null) {
            chainWrapper.set(BladeProcessLeave::getUpdateTime, bladeProcessLeave.getUpdateTime());
        }
        if (bladeProcessLeave.getStatus() != null) {
            chainWrapper.set(BladeProcessLeave::getStatus, bladeProcessLeave.getStatus());
        }
        if (bladeProcessLeave.getIsDeleted() != null) {
            chainWrapper.set(BladeProcessLeave::getIsDeleted, bladeProcessLeave.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(BladeProcessLeave::getId, bladeProcessLeave.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(bladeProcessLeave.getId());
        } else {
            return bladeProcessLeave;
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
    public boolean saveBladeProcessLeaveBatch(List<BladeProcessLeave> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (BladeProcessLeave bladeProcessLeave : insertList) {
            //使用默认的雪花算法生成
            bladeProcessLeave.setId(null);
            //bladeProcessLeave.setCreatedDt(currentDte);
            //bladeProcessLeave.setUpdatedDt(currentDte);
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
    public Integer deleteBladeProcessLeaveBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<BladeProcessLeave> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


