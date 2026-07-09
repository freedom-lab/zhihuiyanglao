package cn.pluss.platform.service.insStaffEvaluationTasks.impl;

import cn.pluss.platform.mapper.InsStaffEvaluationTasksMapper;
import cn.pluss.platform.model.entity.InsStaffEvaluationTasks;
import cn.pluss.platform.service.insStaffEvaluationTasks.InsStaffEvaluationTasksService;
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
@Service("insStaffEvaluationTasksService")
public class InsStaffEvaluationTasksServiceImpl extends ServiceImpl< InsStaffEvaluationTasksMapper, InsStaffEvaluationTasks> implements InsStaffEvaluationTasksService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffEvaluationTasksServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffEvaluationTasks> queryPage(Map map) {
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
    public InsStaffEvaluationTasks queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationTasks 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffEvaluationTasks queryOne(InsStaffEvaluationTasks insStaffEvaluationTasks){
        LambdaQueryWrapper<InsStaffEvaluationTasks> queryWrapper = getQueryWrapper(insStaffEvaluationTasks);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationTasks
    * @return
    */
    @Override
    public List<InsStaffEvaluationTasks> queryList(InsStaffEvaluationTasks insStaffEvaluationTasks) {
        LambdaQueryWrapper<InsStaffEvaluationTasks> queryWrapper = getQueryWrapper(insStaffEvaluationTasks);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffEvaluationTasks
    * @return
    */
    public static LambdaQueryWrapper<InsStaffEvaluationTasks> getQueryWrapper(InsStaffEvaluationTasks insStaffEvaluationTasks){
        LambdaQueryWrapper<InsStaffEvaluationTasks> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffEvaluationTasks.getId() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getId, insStaffEvaluationTasks.getId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getTenantId())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getTenantId, insStaffEvaluationTasks.getTenantId());
        }
        if (insStaffEvaluationTasks.getCorpId() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getCorpId, insStaffEvaluationTasks.getCorpId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getCorpName())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getCorpName, insStaffEvaluationTasks.getCorpName());
        }
        if (insStaffEvaluationTasks.getInstitutionId() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getInstitutionId, insStaffEvaluationTasks.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getInstitutionName())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getInstitutionName, insStaffEvaluationTasks.getInstitutionName());
        }
        if (insStaffEvaluationTasks.getTemplateId() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getTemplateId, insStaffEvaluationTasks.getTemplateId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getTaskName())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getTaskName, insStaffEvaluationTasks.getTaskName());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getEvaluationType())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getEvaluationType, insStaffEvaluationTasks.getEvaluationType());
        }
        if (insStaffEvaluationTasks.getStartDate() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getStartDate, insStaffEvaluationTasks.getStartDate());
        }
        if (insStaffEvaluationTasks.getEndDate() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getEndDate, insStaffEvaluationTasks.getEndDate());
        }
        if (insStaffEvaluationTasks.getTasksState() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getTasksState, insStaffEvaluationTasks.getTasksState());
        }
        if (insStaffEvaluationTasks.getInitiateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getInitiateTime, insStaffEvaluationTasks.getInitiateTime());
        }
        if (insStaffEvaluationTasks.getInitiateId() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getInitiateId, insStaffEvaluationTasks.getInitiateId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getInitiateName())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getInitiateName, insStaffEvaluationTasks.getInitiateName());
        }
        if (insStaffEvaluationTasks.getEvaluatorId() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getEvaluatorId, insStaffEvaluationTasks.getEvaluatorId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getEvaluatorName())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getEvaluatorName, insStaffEvaluationTasks.getEvaluatorName());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getStaffIds())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getStaffIds, insStaffEvaluationTasks.getStaffIds());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getStaffNames())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getStaffNames, insStaffEvaluationTasks.getStaffNames());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getRemark())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getRemark, insStaffEvaluationTasks.getRemark());
        }
        if (insStaffEvaluationTasks.getCreateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getCreateUser, insStaffEvaluationTasks.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationTasks.getCreateName())) {
            queryWrapper.eq(InsStaffEvaluationTasks::getCreateName, insStaffEvaluationTasks.getCreateName());
        }
        if (insStaffEvaluationTasks.getCreateDept() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getCreateDept, insStaffEvaluationTasks.getCreateDept());
        }
        if (insStaffEvaluationTasks.getCreateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getCreateTime, insStaffEvaluationTasks.getCreateTime());
        }
        if (insStaffEvaluationTasks.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getUpdateUser, insStaffEvaluationTasks.getUpdateUser());
        }
        if (insStaffEvaluationTasks.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getUpdateTime, insStaffEvaluationTasks.getUpdateTime());
        }
        if (insStaffEvaluationTasks.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getIsDeleted, insStaffEvaluationTasks.getIsDeleted());
        }
        if (insStaffEvaluationTasks.getStatus() != null) {
            queryWrapper.eq(InsStaffEvaluationTasks::getStatus, insStaffEvaluationTasks.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationTasks 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationTasks insert(InsStaffEvaluationTasks insStaffEvaluationTasks) {
        insStaffEvaluationTasks.setId(null);
        getBaseMapper().insert(insStaffEvaluationTasks);
        return insStaffEvaluationTasks;
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationTasks 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationTasks update(InsStaffEvaluationTasks insStaffEvaluationTasks) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffEvaluationTasks> chainWrapper = new LambdaUpdateChainWrapper<InsStaffEvaluationTasks>(getBaseMapper());
        if (insStaffEvaluationTasks.getId() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getId, insStaffEvaluationTasks.getId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getTenantId())) {
            chainWrapper.set(InsStaffEvaluationTasks::getTenantId, insStaffEvaluationTasks.getTenantId());
        }
        if (insStaffEvaluationTasks.getCorpId() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getCorpId, insStaffEvaluationTasks.getCorpId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getCorpName())) {
            chainWrapper.set(InsStaffEvaluationTasks::getCorpName, insStaffEvaluationTasks.getCorpName());
        }
        if (insStaffEvaluationTasks.getInstitutionId() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getInstitutionId, insStaffEvaluationTasks.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getInstitutionName())) {
            chainWrapper.set(InsStaffEvaluationTasks::getInstitutionName, insStaffEvaluationTasks.getInstitutionName());
        }
        if (insStaffEvaluationTasks.getTemplateId() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getTemplateId, insStaffEvaluationTasks.getTemplateId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getTaskName())) {
            chainWrapper.set(InsStaffEvaluationTasks::getTaskName, insStaffEvaluationTasks.getTaskName());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getEvaluationType())) {
            chainWrapper.set(InsStaffEvaluationTasks::getEvaluationType, insStaffEvaluationTasks.getEvaluationType());
        }
        if (insStaffEvaluationTasks.getStartDate() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getStartDate, insStaffEvaluationTasks.getStartDate());
        }
        if (insStaffEvaluationTasks.getEndDate() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getEndDate, insStaffEvaluationTasks.getEndDate());
        }
        if (insStaffEvaluationTasks.getTasksState() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getTasksState, insStaffEvaluationTasks.getTasksState());
        }
        if (insStaffEvaluationTasks.getInitiateTime() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getInitiateTime, insStaffEvaluationTasks.getInitiateTime());
        }
        if (insStaffEvaluationTasks.getInitiateId() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getInitiateId, insStaffEvaluationTasks.getInitiateId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getInitiateName())) {
            chainWrapper.set(InsStaffEvaluationTasks::getInitiateName, insStaffEvaluationTasks.getInitiateName());
        }
        if (insStaffEvaluationTasks.getEvaluatorId() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getEvaluatorId, insStaffEvaluationTasks.getEvaluatorId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getEvaluatorName())) {
            chainWrapper.set(InsStaffEvaluationTasks::getEvaluatorName, insStaffEvaluationTasks.getEvaluatorName());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getStaffIds())) {
            chainWrapper.set(InsStaffEvaluationTasks::getStaffIds, insStaffEvaluationTasks.getStaffIds());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getStaffNames())) {
            chainWrapper.set(InsStaffEvaluationTasks::getStaffNames, insStaffEvaluationTasks.getStaffNames());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getRemark())) {
            chainWrapper.set(InsStaffEvaluationTasks::getRemark, insStaffEvaluationTasks.getRemark());
        }
        if (insStaffEvaluationTasks.getCreateUser() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getCreateUser, insStaffEvaluationTasks.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationTasks.getCreateName())) {
            chainWrapper.set(InsStaffEvaluationTasks::getCreateName, insStaffEvaluationTasks.getCreateName());
        }
        if (insStaffEvaluationTasks.getCreateDept() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getCreateDept, insStaffEvaluationTasks.getCreateDept());
        }
        if (insStaffEvaluationTasks.getCreateTime() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getCreateTime, insStaffEvaluationTasks.getCreateTime());
        }
        if (insStaffEvaluationTasks.getUpdateUser() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getUpdateUser, insStaffEvaluationTasks.getUpdateUser());
        }
        if (insStaffEvaluationTasks.getUpdateTime() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getUpdateTime, insStaffEvaluationTasks.getUpdateTime());
        }
        if (insStaffEvaluationTasks.getIsDeleted() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getIsDeleted, insStaffEvaluationTasks.getIsDeleted());
        }
        if (insStaffEvaluationTasks.getStatus() != null) {
            chainWrapper.set(InsStaffEvaluationTasks::getStatus, insStaffEvaluationTasks.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffEvaluationTasks::getId, insStaffEvaluationTasks.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffEvaluationTasks.getId());
        } else {
            return insStaffEvaluationTasks;
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
    public boolean saveInsStaffEvaluationTasksBatch(List<InsStaffEvaluationTasks> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffEvaluationTasks insStaffEvaluationTasks : insertList) {
            //使用默认的雪花算法生成
            insStaffEvaluationTasks.setId(null);
            //insStaffEvaluationTasks.setCreatedDt(currentDte);
            //insStaffEvaluationTasks.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffEvaluationTasksBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffEvaluationTasks> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


