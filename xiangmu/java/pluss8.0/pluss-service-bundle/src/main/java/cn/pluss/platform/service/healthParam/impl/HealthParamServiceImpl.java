package cn.pluss.platform.service.healthParam.impl;

import cn.pluss.platform.mapper.HealthParamMapper;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.service.healthParam.HealthParamService;
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
@Service("healthParamService")
public class HealthParamServiceImpl extends ServiceImpl< HealthParamMapper, HealthParam> implements HealthParamService {
    private static final Logger logger = LoggerFactory.getLogger(HealthParamServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthParam> queryPage(Map map) {
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
    public HealthParam queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthParam 实例对象
    * @return 实例对象
    */
    @Override
    public HealthParam queryOne(HealthParam healthParam){
        LambdaQueryWrapper<HealthParam> queryWrapper = getQueryWrapper(healthParam);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthParam
    * @return
    */
    @Override
    public List<HealthParam> queryList(HealthParam healthParam) {
        LambdaQueryWrapper<HealthParam> queryWrapper = getQueryWrapper(healthParam);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthParam
    * @return
    */
    public static LambdaQueryWrapper<HealthParam> getQueryWrapper(HealthParam healthParam){
        LambdaQueryWrapper<HealthParam> queryWrapper = new LambdaQueryWrapper<>();
        if (healthParam.getId() != null) {
            queryWrapper.eq(HealthParam::getId, healthParam.getId());
        }
        if (StringUtil.isNotEmpty(healthParam.getParamCode())) {
            queryWrapper.eq(HealthParam::getParamCode, healthParam.getParamCode());
        }
        if (StringUtil.isNotEmpty(healthParam.getCodeName())) {
            queryWrapper.eq(HealthParam::getCodeName, healthParam.getCodeName());
        }
        if (healthParam.getMaxValue() != null) {
            queryWrapper.eq(HealthParam::getMaxValue, healthParam.getMaxValue());
        }
        if (healthParam.getMinValue() != null) {
            queryWrapper.eq(HealthParam::getMinValue, healthParam.getMinValue());
        }
        if (StringUtil.isNotEmpty(healthParam.getRemark())) {
            queryWrapper.eq(HealthParam::getRemark, healthParam.getRemark());
        }
        if (healthParam.getCreateUser() != null) {
            queryWrapper.eq(HealthParam::getCreateUser, healthParam.getCreateUser());
        }
        if (healthParam.getCreateDept() != null) {
            queryWrapper.eq(HealthParam::getCreateDept, healthParam.getCreateDept());
        }
        if (healthParam.getCreateTime() != null) {
            queryWrapper.eq(HealthParam::getCreateTime, healthParam.getCreateTime());
        }
        if (healthParam.getUpdateUser() != null) {
            queryWrapper.eq(HealthParam::getUpdateUser, healthParam.getUpdateUser());
        }
        if (healthParam.getUpdateTime() != null) {
            queryWrapper.eq(HealthParam::getUpdateTime, healthParam.getUpdateTime());
        }
        if (healthParam.getIsDeleted() != null) {
            queryWrapper.eq(HealthParam::getIsDeleted, healthParam.getIsDeleted());
        }
        if (healthParam.getStatus() != null) {
            queryWrapper.eq(HealthParam::getStatus, healthParam.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthParam 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthParam insert(HealthParam healthParam) {
        healthParam.setId(null);
        getBaseMapper().insert(healthParam);
        return healthParam;
    }

    /**
    * 更新数据
    *
    * @param healthParam 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthParam update(HealthParam healthParam) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthParam> chainWrapper = new LambdaUpdateChainWrapper<HealthParam>(getBaseMapper());
        if (healthParam.getId() != null) {
            chainWrapper.set(HealthParam::getId, healthParam.getId());
        }
        if (StringUtil.isNotBlank(healthParam.getParamCode())) {
            chainWrapper.set(HealthParam::getParamCode, healthParam.getParamCode());
        }
        if (StringUtil.isNotBlank(healthParam.getCodeName())) {
            chainWrapper.set(HealthParam::getCodeName, healthParam.getCodeName());
        }
        if (healthParam.getMaxValue() != null) {
            chainWrapper.set(HealthParam::getMaxValue, healthParam.getMaxValue());
        }
        if (healthParam.getMinValue() != null) {
            chainWrapper.set(HealthParam::getMinValue, healthParam.getMinValue());
        }
        if (StringUtil.isNotBlank(healthParam.getRemark())) {
            chainWrapper.set(HealthParam::getRemark, healthParam.getRemark());
        }
        if (healthParam.getCreateUser() != null) {
            chainWrapper.set(HealthParam::getCreateUser, healthParam.getCreateUser());
        }
        if (healthParam.getCreateDept() != null) {
            chainWrapper.set(HealthParam::getCreateDept, healthParam.getCreateDept());
        }
        if (healthParam.getCreateTime() != null) {
            chainWrapper.set(HealthParam::getCreateTime, healthParam.getCreateTime());
        }
        if (healthParam.getUpdateUser() != null) {
            chainWrapper.set(HealthParam::getUpdateUser, healthParam.getUpdateUser());
        }
        if (healthParam.getUpdateTime() != null) {
            chainWrapper.set(HealthParam::getUpdateTime, healthParam.getUpdateTime());
        }
        if (healthParam.getIsDeleted() != null) {
            chainWrapper.set(HealthParam::getIsDeleted, healthParam.getIsDeleted());
        }
        if (healthParam.getStatus() != null) {
            chainWrapper.set(HealthParam::getStatus, healthParam.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthParam::getId, healthParam.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthParam.getId());
        } else {
            return healthParam;
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
    public boolean saveHealthParamBatch(List<HealthParam> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthParam healthParam : insertList) {
            //使用默认的雪花算法生成
            healthParam.setId(null);
            //healthParam.setCreatedDt(currentDte);
            //healthParam.setUpdatedDt(currentDte);
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
    public Integer deleteHealthParamBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthParam> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


