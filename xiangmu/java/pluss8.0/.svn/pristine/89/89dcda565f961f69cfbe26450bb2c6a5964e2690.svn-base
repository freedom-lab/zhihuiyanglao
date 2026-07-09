package cn.pluss.platform.service.careFeeSet.impl;

import cn.pluss.platform.mapper.CareFeeSetMapper;
import cn.pluss.platform.model.entity.CareFeeSet;
import cn.pluss.platform.service.careFeeSet.CareFeeSetService;
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
@Service("careFeeSetService")
public class CareFeeSetServiceImpl extends ServiceImpl< CareFeeSetMapper, CareFeeSet> implements CareFeeSetService {
    private static final Logger logger = LoggerFactory.getLogger(CareFeeSetServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CareFeeSet> queryPage(Map map) {
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
    public CareFeeSet queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param careFeeSet 实例对象
    * @return 实例对象
    */
    @Override
    public CareFeeSet queryOne(CareFeeSet careFeeSet){
        LambdaQueryWrapper<CareFeeSet> queryWrapper = getQueryWrapper(careFeeSet);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param careFeeSet
    * @return
    */
    @Override
    public List<CareFeeSet> queryList(CareFeeSet careFeeSet) {
        LambdaQueryWrapper<CareFeeSet> queryWrapper = getQueryWrapper(careFeeSet);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param careFeeSet
    * @return
    */
    public static LambdaQueryWrapper<CareFeeSet> getQueryWrapper(CareFeeSet careFeeSet){
        LambdaQueryWrapper<CareFeeSet> queryWrapper = new LambdaQueryWrapper<>();
        if (careFeeSet.getId() != null) {
            queryWrapper.eq(CareFeeSet::getId, careFeeSet.getId());
        }
        if (StringUtil.isNotEmpty(careFeeSet.getTenantId())) {
            queryWrapper.eq(CareFeeSet::getTenantId, careFeeSet.getTenantId());
        }
        if (careFeeSet.getCorpId() != null) {
            queryWrapper.eq(CareFeeSet::getCorpId, careFeeSet.getCorpId());
        }
        if (careFeeSet.getInstitutionId() != null) {
            queryWrapper.eq(CareFeeSet::getInstitutionId, careFeeSet.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(careFeeSet.getInstitutionName())) {
            queryWrapper.eq(CareFeeSet::getInstitutionName, careFeeSet.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(careFeeSet.getFeeName())) {
            queryWrapper.eq(CareFeeSet::getFeeName, careFeeSet.getFeeName());
        }
        if (StringUtil.isNotEmpty(careFeeSet.getFeeCode())) {
            queryWrapper.eq(CareFeeSet::getFeeCode, careFeeSet.getFeeCode());
        }
        if (careFeeSet.getFeeType() != null) {
            queryWrapper.eq(CareFeeSet::getFeeType, careFeeSet.getFeeType());
        }
        if (StringUtil.isNotEmpty(careFeeSet.getCostType())) {
            queryWrapper.eq(CareFeeSet::getCostType, careFeeSet.getCostType());
        }
        if (StringUtil.isNotEmpty(careFeeSet.getIsRefund())) {
            queryWrapper.eq(CareFeeSet::getIsRefund, careFeeSet.getIsRefund());
        }
        if (careFeeSet.getAmount() != null) {
            queryWrapper.eq(CareFeeSet::getAmount, careFeeSet.getAmount());
        }
        if (StringUtil.isNotEmpty(careFeeSet.getMemo())) {
            queryWrapper.eq(CareFeeSet::getMemo, careFeeSet.getMemo());
        }
        if (StringUtil.isNotEmpty(careFeeSet.getRemark())) {
            queryWrapper.eq(CareFeeSet::getRemark, careFeeSet.getRemark());
        }
        if (careFeeSet.getCreateUser() != null) {
            queryWrapper.eq(CareFeeSet::getCreateUser, careFeeSet.getCreateUser());
        }
        if (StringUtil.isNotEmpty(careFeeSet.getCreateName())) {
            queryWrapper.eq(CareFeeSet::getCreateName, careFeeSet.getCreateName());
        }
        if (careFeeSet.getCreateDept() != null) {
            queryWrapper.eq(CareFeeSet::getCreateDept, careFeeSet.getCreateDept());
        }
        if (careFeeSet.getCreateTime() != null) {
            queryWrapper.eq(CareFeeSet::getCreateTime, careFeeSet.getCreateTime());
        }
        if (careFeeSet.getUpdateUser() != null) {
            queryWrapper.eq(CareFeeSet::getUpdateUser, careFeeSet.getUpdateUser());
        }
        if (careFeeSet.getUpdateTime() != null) {
            queryWrapper.eq(CareFeeSet::getUpdateTime, careFeeSet.getUpdateTime());
        }
        if (careFeeSet.getStatus() != null) {
            queryWrapper.eq(CareFeeSet::getStatus, careFeeSet.getStatus());
        }
        if (careFeeSet.getIsDeleted() != null) {
            queryWrapper.eq(CareFeeSet::getIsDeleted, careFeeSet.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param careFeeSet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareFeeSet insert(CareFeeSet careFeeSet) {
        careFeeSet.setId(null);
        getBaseMapper().insert(careFeeSet);
        return careFeeSet;
    }

    /**
    * 更新数据
    *
    * @param careFeeSet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareFeeSet update(CareFeeSet careFeeSet) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CareFeeSet> chainWrapper = new LambdaUpdateChainWrapper<CareFeeSet>(getBaseMapper());
        if (careFeeSet.getId() != null) {
            chainWrapper.set(CareFeeSet::getId, careFeeSet.getId());
        }
        if (StringUtil.isNotBlank(careFeeSet.getTenantId())) {
            chainWrapper.set(CareFeeSet::getTenantId, careFeeSet.getTenantId());
        }
        if (careFeeSet.getCorpId() != null) {
            chainWrapper.set(CareFeeSet::getCorpId, careFeeSet.getCorpId());
        }
        if (careFeeSet.getInstitutionId() != null) {
            chainWrapper.set(CareFeeSet::getInstitutionId, careFeeSet.getInstitutionId());
        }
        if (StringUtil.isNotBlank(careFeeSet.getInstitutionName())) {
            chainWrapper.set(CareFeeSet::getInstitutionName, careFeeSet.getInstitutionName());
        }
        if (StringUtil.isNotBlank(careFeeSet.getFeeName())) {
            chainWrapper.set(CareFeeSet::getFeeName, careFeeSet.getFeeName());
        }
        if (StringUtil.isNotBlank(careFeeSet.getFeeCode())) {
            chainWrapper.set(CareFeeSet::getFeeCode, careFeeSet.getFeeCode());
        }
        if (careFeeSet.getFeeType() != null) {
            chainWrapper.set(CareFeeSet::getFeeType, careFeeSet.getFeeType());
        }
        if (StringUtil.isNotBlank(careFeeSet.getCostType())) {
            chainWrapper.set(CareFeeSet::getCostType, careFeeSet.getCostType());
        }
        if (StringUtil.isNotBlank(careFeeSet.getIsRefund())) {
            chainWrapper.set(CareFeeSet::getIsRefund, careFeeSet.getIsRefund());
        }
        if (careFeeSet.getAmount() != null) {
            chainWrapper.set(CareFeeSet::getAmount, careFeeSet.getAmount());
        }
        if (StringUtil.isNotBlank(careFeeSet.getMemo())) {
            chainWrapper.set(CareFeeSet::getMemo, careFeeSet.getMemo());
        }
        if (StringUtil.isNotBlank(careFeeSet.getRemark())) {
            chainWrapper.set(CareFeeSet::getRemark, careFeeSet.getRemark());
        }
        if (careFeeSet.getCreateUser() != null) {
            chainWrapper.set(CareFeeSet::getCreateUser, careFeeSet.getCreateUser());
        }
        if (StringUtil.isNotBlank(careFeeSet.getCreateName())) {
            chainWrapper.set(CareFeeSet::getCreateName, careFeeSet.getCreateName());
        }
        if (careFeeSet.getCreateDept() != null) {
            chainWrapper.set(CareFeeSet::getCreateDept, careFeeSet.getCreateDept());
        }
        if (careFeeSet.getCreateTime() != null) {
            chainWrapper.set(CareFeeSet::getCreateTime, careFeeSet.getCreateTime());
        }
        if (careFeeSet.getUpdateUser() != null) {
            chainWrapper.set(CareFeeSet::getUpdateUser, careFeeSet.getUpdateUser());
        }
        if (careFeeSet.getUpdateTime() != null) {
            chainWrapper.set(CareFeeSet::getUpdateTime, careFeeSet.getUpdateTime());
        }
        if (careFeeSet.getStatus() != null) {
            chainWrapper.set(CareFeeSet::getStatus, careFeeSet.getStatus());
        }
        if (careFeeSet.getIsDeleted() != null) {
            chainWrapper.set(CareFeeSet::getIsDeleted, careFeeSet.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CareFeeSet::getId, careFeeSet.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(careFeeSet.getId());
        } else {
            return careFeeSet;
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
    public boolean saveCareFeeSetBatch(List<CareFeeSet> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CareFeeSet careFeeSet : insertList) {
            //使用默认的雪花算法生成
            careFeeSet.setId(null);
            //careFeeSet.setCreatedDt(currentDte);
            //careFeeSet.setUpdatedDt(currentDte);
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
    public Integer deleteCareFeeSetBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CareFeeSet> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


