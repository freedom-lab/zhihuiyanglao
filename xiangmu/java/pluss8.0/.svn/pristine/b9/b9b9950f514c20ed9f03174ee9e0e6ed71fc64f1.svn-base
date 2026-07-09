package cn.pluss.platform.service.insStaffEvaluationStandard.impl;

import cn.pluss.platform.mapper.InsStaffEvaluationStandardMapper;
import cn.pluss.platform.model.entity.InsStaffEvaluationStandard;
import cn.pluss.platform.service.insStaffEvaluationStandard.InsStaffEvaluationStandardService;
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
@Service("insStaffEvaluationStandardService")
public class InsStaffEvaluationStandardServiceImpl extends ServiceImpl< InsStaffEvaluationStandardMapper, InsStaffEvaluationStandard> implements InsStaffEvaluationStandardService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffEvaluationStandardServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffEvaluationStandard> queryPage(Map map) {
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
    public InsStaffEvaluationStandard queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationStandard 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffEvaluationStandard queryOne(InsStaffEvaluationStandard insStaffEvaluationStandard){
        LambdaQueryWrapper<InsStaffEvaluationStandard> queryWrapper = getQueryWrapper(insStaffEvaluationStandard);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationStandard
    * @return
    */
    @Override
    public List<InsStaffEvaluationStandard> queryList(InsStaffEvaluationStandard insStaffEvaluationStandard) {
        LambdaQueryWrapper<InsStaffEvaluationStandard> queryWrapper = getQueryWrapper(insStaffEvaluationStandard);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffEvaluationStandard
    * @return
    */
    public static LambdaQueryWrapper<InsStaffEvaluationStandard> getQueryWrapper(InsStaffEvaluationStandard insStaffEvaluationStandard){
        LambdaQueryWrapper<InsStaffEvaluationStandard> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffEvaluationStandard.getId() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getId, insStaffEvaluationStandard.getId());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationStandard.getTenantId())) {
            queryWrapper.eq(InsStaffEvaluationStandard::getTenantId, insStaffEvaluationStandard.getTenantId());
        }
        if (insStaffEvaluationStandard.getTemplateId() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getTemplateId, insStaffEvaluationStandard.getTemplateId());
        }
        if (insStaffEvaluationStandard.getScoreStart() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getScoreStart, insStaffEvaluationStandard.getScoreStart());
        }
        if (insStaffEvaluationStandard.getScoreEnd() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getScoreEnd, insStaffEvaluationStandard.getScoreEnd());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationStandard.getScoreResult())) {
            queryWrapper.eq(InsStaffEvaluationStandard::getScoreResult, insStaffEvaluationStandard.getScoreResult());
        }
        if (insStaffEvaluationStandard.getSerialNumber() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getSerialNumber, insStaffEvaluationStandard.getSerialNumber());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationStandard.getRemark())) {
            queryWrapper.eq(InsStaffEvaluationStandard::getRemark, insStaffEvaluationStandard.getRemark());
        }
        if (insStaffEvaluationStandard.getCreateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getCreateUser, insStaffEvaluationStandard.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffEvaluationStandard.getCreateName())) {
            queryWrapper.eq(InsStaffEvaluationStandard::getCreateName, insStaffEvaluationStandard.getCreateName());
        }
        if (insStaffEvaluationStandard.getCreateDept() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getCreateDept, insStaffEvaluationStandard.getCreateDept());
        }
        if (insStaffEvaluationStandard.getCreateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getCreateTime, insStaffEvaluationStandard.getCreateTime());
        }
        if (insStaffEvaluationStandard.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getUpdateUser, insStaffEvaluationStandard.getUpdateUser());
        }
        if (insStaffEvaluationStandard.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getUpdateTime, insStaffEvaluationStandard.getUpdateTime());
        }
        if (insStaffEvaluationStandard.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getIsDeleted, insStaffEvaluationStandard.getIsDeleted());
        }
        if (insStaffEvaluationStandard.getStatus() != null) {
            queryWrapper.eq(InsStaffEvaluationStandard::getStatus, insStaffEvaluationStandard.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffEvaluationStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationStandard insert(InsStaffEvaluationStandard insStaffEvaluationStandard) {
        insStaffEvaluationStandard.setId(null);
        getBaseMapper().insert(insStaffEvaluationStandard);
        return insStaffEvaluationStandard;
    }

    /**
    * 更新数据
    *
    * @param insStaffEvaluationStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffEvaluationStandard update(InsStaffEvaluationStandard insStaffEvaluationStandard) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffEvaluationStandard> chainWrapper = new LambdaUpdateChainWrapper<InsStaffEvaluationStandard>(getBaseMapper());
        if (insStaffEvaluationStandard.getId() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getId, insStaffEvaluationStandard.getId());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationStandard.getTenantId())) {
            chainWrapper.set(InsStaffEvaluationStandard::getTenantId, insStaffEvaluationStandard.getTenantId());
        }
        if (insStaffEvaluationStandard.getTemplateId() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getTemplateId, insStaffEvaluationStandard.getTemplateId());
        }
        if (insStaffEvaluationStandard.getScoreStart() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getScoreStart, insStaffEvaluationStandard.getScoreStart());
        }
        if (insStaffEvaluationStandard.getScoreEnd() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getScoreEnd, insStaffEvaluationStandard.getScoreEnd());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationStandard.getScoreResult())) {
            chainWrapper.set(InsStaffEvaluationStandard::getScoreResult, insStaffEvaluationStandard.getScoreResult());
        }
        if (insStaffEvaluationStandard.getSerialNumber() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getSerialNumber, insStaffEvaluationStandard.getSerialNumber());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationStandard.getRemark())) {
            chainWrapper.set(InsStaffEvaluationStandard::getRemark, insStaffEvaluationStandard.getRemark());
        }
        if (insStaffEvaluationStandard.getCreateUser() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getCreateUser, insStaffEvaluationStandard.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffEvaluationStandard.getCreateName())) {
            chainWrapper.set(InsStaffEvaluationStandard::getCreateName, insStaffEvaluationStandard.getCreateName());
        }
        if (insStaffEvaluationStandard.getCreateDept() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getCreateDept, insStaffEvaluationStandard.getCreateDept());
        }
        if (insStaffEvaluationStandard.getCreateTime() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getCreateTime, insStaffEvaluationStandard.getCreateTime());
        }
        if (insStaffEvaluationStandard.getUpdateUser() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getUpdateUser, insStaffEvaluationStandard.getUpdateUser());
        }
        if (insStaffEvaluationStandard.getUpdateTime() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getUpdateTime, insStaffEvaluationStandard.getUpdateTime());
        }
        if (insStaffEvaluationStandard.getIsDeleted() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getIsDeleted, insStaffEvaluationStandard.getIsDeleted());
        }
        if (insStaffEvaluationStandard.getStatus() != null) {
            chainWrapper.set(InsStaffEvaluationStandard::getStatus, insStaffEvaluationStandard.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffEvaluationStandard::getId, insStaffEvaluationStandard.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffEvaluationStandard.getId());
        } else {
            return insStaffEvaluationStandard;
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
    public boolean saveInsStaffEvaluationStandardBatch(List<InsStaffEvaluationStandard> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffEvaluationStandard insStaffEvaluationStandard : insertList) {
            //使用默认的雪花算法生成
            insStaffEvaluationStandard.setId(null);
            //insStaffEvaluationStandard.setCreatedDt(currentDte);
            //insStaffEvaluationStandard.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffEvaluationStandardBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffEvaluationStandard> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


