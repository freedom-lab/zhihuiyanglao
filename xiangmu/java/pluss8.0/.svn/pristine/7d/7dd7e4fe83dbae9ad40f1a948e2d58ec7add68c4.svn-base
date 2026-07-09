package cn.pluss.platform.service.insStaffEvaluationGroup.impl;

import cn.pluss.platform.mapper.InsStaffEvaluationGroupMapper;
import cn.pluss.platform.model.entity.InsStaffEvaluationGroup;
import cn.pluss.platform.service.insStaffEvaluationGroup.InsStaffEvaluationGroupService;
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
@Service("insStaffEvaluationGroupService")
public class InsStaffEvaluationGroupServiceImpl extends ServiceImpl< InsStaffEvaluationGroupMapper, InsStaffEvaluationGroup> implements InsStaffEvaluationGroupService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffEvaluationGroupServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffEvaluationGroup> queryPage(Map map) {
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
    public InsStaffEvaluationGroup queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationGroup 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffEvaluationGroup queryOne(InsStaffEvaluationGroup insStaffEvaluationGroup){
        LambdaQueryWrapper<InsStaffEvaluationGroup> queryWrapper = getQueryWrapper(insStaffEvaluationGroup);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationGroup
    * @return
    */
    @Override
    public List<InsStaffEvaluationGroup> queryList(InsStaffEvaluationGroup insStaffEvaluationGroup) {
        LambdaQueryWrapper<InsStaffEvaluationGroup> queryWrapper = getQueryWrapper(insStaffEvaluationGroup);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffEvaluationGroup
    * @return
    */
    public static LambdaQueryWrapper<InsStaffEvaluationGroup> getQueryWrapper(InsStaffEvaluationGroup insStaffEvaluationGroup){
        LambdaQueryWrapper<InsStaffEvaluationGroup> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffEvaluationGroup.getId() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getId, insStaffEvaluationGroup.getId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationGroup.getTenantId())) {
            queryWrapper.eq(InsStaffEvaluationGroup::getTenantId, insStaffEvaluationGroup.getTenantId());
        }
        if (insStaffEvaluationGroup.getTemplateId() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getTemplateId, insStaffEvaluationGroup.getTemplateId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationGroup.getGroupName())) {
            queryWrapper.eq(InsStaffEvaluationGroup::getGroupName, insStaffEvaluationGroup.getGroupName());
        }
        if (insStaffEvaluationGroup.getSerialNumber() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getSerialNumber, insStaffEvaluationGroup.getSerialNumber());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationGroup.getRemark())) {
            queryWrapper.eq(InsStaffEvaluationGroup::getRemark, insStaffEvaluationGroup.getRemark());
        }
        if (insStaffEvaluationGroup.getCreateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getCreateUser, insStaffEvaluationGroup.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationGroup.getCreateName())) {
            queryWrapper.eq(InsStaffEvaluationGroup::getCreateName, insStaffEvaluationGroup.getCreateName());
        }
        if (insStaffEvaluationGroup.getCreateDept() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getCreateDept, insStaffEvaluationGroup.getCreateDept());
        }
        if (insStaffEvaluationGroup.getCreateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getCreateTime, insStaffEvaluationGroup.getCreateTime());
        }
        if (insStaffEvaluationGroup.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getUpdateUser, insStaffEvaluationGroup.getUpdateUser());
        }
        if (insStaffEvaluationGroup.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getUpdateTime, insStaffEvaluationGroup.getUpdateTime());
        }
        if (insStaffEvaluationGroup.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getIsDeleted, insStaffEvaluationGroup.getIsDeleted());
        }
        if (insStaffEvaluationGroup.getStatus() != null) {
            queryWrapper.eq(InsStaffEvaluationGroup::getStatus, insStaffEvaluationGroup.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationGroup 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationGroup insert(InsStaffEvaluationGroup insStaffEvaluationGroup) {
        insStaffEvaluationGroup.setId(null);
        getBaseMapper().insert(insStaffEvaluationGroup);
        return insStaffEvaluationGroup;
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationGroup 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationGroup update(InsStaffEvaluationGroup insStaffEvaluationGroup) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffEvaluationGroup> chainWrapper = new LambdaUpdateChainWrapper<InsStaffEvaluationGroup>(getBaseMapper());
        if (insStaffEvaluationGroup.getId() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getId, insStaffEvaluationGroup.getId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationGroup.getTenantId())) {
            chainWrapper.set(InsStaffEvaluationGroup::getTenantId, insStaffEvaluationGroup.getTenantId());
        }
        if (insStaffEvaluationGroup.getTemplateId() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getTemplateId, insStaffEvaluationGroup.getTemplateId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationGroup.getGroupName())) {
            chainWrapper.set(InsStaffEvaluationGroup::getGroupName, insStaffEvaluationGroup.getGroupName());
        }
        if (insStaffEvaluationGroup.getSerialNumber() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getSerialNumber, insStaffEvaluationGroup.getSerialNumber());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationGroup.getRemark())) {
            chainWrapper.set(InsStaffEvaluationGroup::getRemark, insStaffEvaluationGroup.getRemark());
        }
        if (insStaffEvaluationGroup.getCreateUser() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getCreateUser, insStaffEvaluationGroup.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationGroup.getCreateName())) {
            chainWrapper.set(InsStaffEvaluationGroup::getCreateName, insStaffEvaluationGroup.getCreateName());
        }
        if (insStaffEvaluationGroup.getCreateDept() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getCreateDept, insStaffEvaluationGroup.getCreateDept());
        }
        if (insStaffEvaluationGroup.getCreateTime() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getCreateTime, insStaffEvaluationGroup.getCreateTime());
        }
        if (insStaffEvaluationGroup.getUpdateUser() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getUpdateUser, insStaffEvaluationGroup.getUpdateUser());
        }
        if (insStaffEvaluationGroup.getUpdateTime() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getUpdateTime, insStaffEvaluationGroup.getUpdateTime());
        }
        if (insStaffEvaluationGroup.getIsDeleted() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getIsDeleted, insStaffEvaluationGroup.getIsDeleted());
        }
        if (insStaffEvaluationGroup.getStatus() != null) {
            chainWrapper.set(InsStaffEvaluationGroup::getStatus, insStaffEvaluationGroup.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffEvaluationGroup::getId, insStaffEvaluationGroup.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffEvaluationGroup.getId());
        } else {
            return insStaffEvaluationGroup;
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
    public boolean saveInsStaffEvaluationGroupBatch(List<InsStaffEvaluationGroup> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffEvaluationGroup insStaffEvaluationGroup : insertList) {
            //使用默认的雪花算法生成
            insStaffEvaluationGroup.setId(null);
            //insStaffEvaluationGroup.setCreatedDt(currentDte);
            //insStaffEvaluationGroup.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffEvaluationGroupBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffEvaluationGroup> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


