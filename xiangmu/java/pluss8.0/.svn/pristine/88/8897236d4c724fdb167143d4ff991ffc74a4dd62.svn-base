package cn.pluss.platform.service.insCanteenFoodMaterial.impl;

import cn.pluss.platform.mapper.InsCanteenFoodMaterialMapper;
import cn.pluss.platform.model.entity.InsCanteenFoodMaterial;
import cn.pluss.platform.service.insCanteenFoodMaterial.InsCanteenFoodMaterialService;
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
@Service("insCanteenFoodMaterialService")
public class InsCanteenFoodMaterialServiceImpl extends ServiceImpl< InsCanteenFoodMaterialMapper, InsCanteenFoodMaterial> implements InsCanteenFoodMaterialService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenFoodMaterialServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenFoodMaterial> queryPage(Map map) {
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
    public InsCanteenFoodMaterial queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodMaterial 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenFoodMaterial queryOne(InsCanteenFoodMaterial insCanteenFoodMaterial){
        LambdaQueryWrapper<InsCanteenFoodMaterial> queryWrapper = getQueryWrapper(insCanteenFoodMaterial);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenFoodMaterial
    * @return
    */
    @Override
    public List<InsCanteenFoodMaterial> queryList(InsCanteenFoodMaterial insCanteenFoodMaterial) {
        LambdaQueryWrapper<InsCanteenFoodMaterial> queryWrapper = getQueryWrapper(insCanteenFoodMaterial);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenFoodMaterial
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenFoodMaterial> getQueryWrapper(InsCanteenFoodMaterial insCanteenFoodMaterial){
        LambdaQueryWrapper<InsCanteenFoodMaterial> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenFoodMaterial.getId() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getId, insCanteenFoodMaterial.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodMaterial.getTenantId())) {
            queryWrapper.eq(InsCanteenFoodMaterial::getTenantId, insCanteenFoodMaterial.getTenantId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodMaterial.getMaterialName())) {
            queryWrapper.eq(InsCanteenFoodMaterial::getMaterialName, insCanteenFoodMaterial.getMaterialName());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodMaterial.getPinyinCode())) {
            queryWrapper.eq(InsCanteenFoodMaterial::getPinyinCode, insCanteenFoodMaterial.getPinyinCode());
        }
        if (insCanteenFoodMaterial.getCateId() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getCateId, insCanteenFoodMaterial.getCateId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodMaterial.getUnit())) {
            queryWrapper.eq(InsCanteenFoodMaterial::getUnit, insCanteenFoodMaterial.getUnit());
        }
        if (insCanteenFoodMaterial.getReferenceAmount() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getReferenceAmount, insCanteenFoodMaterial.getReferenceAmount());
        }
        if (insCanteenFoodMaterial.getCalorie() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getCalorie, insCanteenFoodMaterial.getCalorie());
        }
        if (insCanteenFoodMaterial.getProtein() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getProtein, insCanteenFoodMaterial.getProtein());
        }
        if (insCanteenFoodMaterial.getFat() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getFat, insCanteenFoodMaterial.getFat());
        }
        if (insCanteenFoodMaterial.getCarbohydrate() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getCarbohydrate, insCanteenFoodMaterial.getCarbohydrate());
        }
        if (insCanteenFoodMaterial.getDietaryFiber() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getDietaryFiber, insCanteenFoodMaterial.getDietaryFiber());
        }
        if (insCanteenFoodMaterial.getSodium() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getSodium, insCanteenFoodMaterial.getSodium());
        }
        if (insCanteenFoodMaterial.getPotassium() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getPotassium, insCanteenFoodMaterial.getPotassium());
        }
        if (insCanteenFoodMaterial.getCalcium() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getCalcium, insCanteenFoodMaterial.getCalcium());
        }
        if (insCanteenFoodMaterial.getPhosphorus() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getPhosphorus, insCanteenFoodMaterial.getPhosphorus());
        }
        if (insCanteenFoodMaterial.getMagnesium() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getMagnesium, insCanteenFoodMaterial.getMagnesium());
        }
        if (insCanteenFoodMaterial.getIron() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getIron, insCanteenFoodMaterial.getIron());
        }
        if (insCanteenFoodMaterial.getPurine() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getPurine, insCanteenFoodMaterial.getPurine());
        }
        if (insCanteenFoodMaterial.getGiValue() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getGiValue, insCanteenFoodMaterial.getGiValue());
        }
        if (insCanteenFoodMaterial.getIsHighPurine() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getIsHighPurine, insCanteenFoodMaterial.getIsHighPurine());
        }
        if (insCanteenFoodMaterial.getIsHighSugar() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getIsHighSugar, insCanteenFoodMaterial.getIsHighSugar());
        }
        if (insCanteenFoodMaterial.getEdiblePartRate() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getEdiblePartRate, insCanteenFoodMaterial.getEdiblePartRate());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodMaterial.getDescription())) {
            queryWrapper.eq(InsCanteenFoodMaterial::getDescription, insCanteenFoodMaterial.getDescription());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodMaterial.getRemark())) {
            queryWrapper.eq(InsCanteenFoodMaterial::getRemark, insCanteenFoodMaterial.getRemark());
        }
        if (insCanteenFoodMaterial.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getCreateUser, insCanteenFoodMaterial.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodMaterial.getCreateName())) {
            queryWrapper.eq(InsCanteenFoodMaterial::getCreateName, insCanteenFoodMaterial.getCreateName());
        }
        if (insCanteenFoodMaterial.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getCreateDept, insCanteenFoodMaterial.getCreateDept());
        }
        if (insCanteenFoodMaterial.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getUpdateUser, insCanteenFoodMaterial.getUpdateUser());
        }
        if (insCanteenFoodMaterial.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getIsDeleted, insCanteenFoodMaterial.getIsDeleted());
        }
        if (insCanteenFoodMaterial.getStatus() != null) {
            queryWrapper.eq(InsCanteenFoodMaterial::getStatus, insCanteenFoodMaterial.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenFoodMaterial 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodMaterial insert(InsCanteenFoodMaterial insCanteenFoodMaterial) {
        insCanteenFoodMaterial.setId(null);
        getBaseMapper().insert(insCanteenFoodMaterial);
        return insCanteenFoodMaterial;
    }

    /**
    * 更新数据
    *
    * @param insCanteenFoodMaterial 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodMaterial update(InsCanteenFoodMaterial insCanteenFoodMaterial) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenFoodMaterial> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenFoodMaterial>(getBaseMapper());
        if (insCanteenFoodMaterial.getId() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getId, insCanteenFoodMaterial.getId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodMaterial.getTenantId())) {
            chainWrapper.set(InsCanteenFoodMaterial::getTenantId, insCanteenFoodMaterial.getTenantId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodMaterial.getMaterialName())) {
            chainWrapper.set(InsCanteenFoodMaterial::getMaterialName, insCanteenFoodMaterial.getMaterialName());
        }
        if (StringUtil.isNotBlank(insCanteenFoodMaterial.getPinyinCode())) {
            chainWrapper.set(InsCanteenFoodMaterial::getPinyinCode, insCanteenFoodMaterial.getPinyinCode());
        }
        if (insCanteenFoodMaterial.getCateId() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getCateId, insCanteenFoodMaterial.getCateId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodMaterial.getUnit())) {
            chainWrapper.set(InsCanteenFoodMaterial::getUnit, insCanteenFoodMaterial.getUnit());
        }
        if (insCanteenFoodMaterial.getReferenceAmount() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getReferenceAmount, insCanteenFoodMaterial.getReferenceAmount());
        }
        if (insCanteenFoodMaterial.getCalorie() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getCalorie, insCanteenFoodMaterial.getCalorie());
        }
        if (insCanteenFoodMaterial.getProtein() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getProtein, insCanteenFoodMaterial.getProtein());
        }
        if (insCanteenFoodMaterial.getFat() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getFat, insCanteenFoodMaterial.getFat());
        }
        if (insCanteenFoodMaterial.getCarbohydrate() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getCarbohydrate, insCanteenFoodMaterial.getCarbohydrate());
        }
        if (insCanteenFoodMaterial.getDietaryFiber() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getDietaryFiber, insCanteenFoodMaterial.getDietaryFiber());
        }
        if (insCanteenFoodMaterial.getSodium() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getSodium, insCanteenFoodMaterial.getSodium());
        }
        if (insCanteenFoodMaterial.getPotassium() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getPotassium, insCanteenFoodMaterial.getPotassium());
        }
        if (insCanteenFoodMaterial.getCalcium() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getCalcium, insCanteenFoodMaterial.getCalcium());
        }
        if (insCanteenFoodMaterial.getPhosphorus() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getPhosphorus, insCanteenFoodMaterial.getPhosphorus());
        }
        if (insCanteenFoodMaterial.getMagnesium() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getMagnesium, insCanteenFoodMaterial.getMagnesium());
        }
        if (insCanteenFoodMaterial.getIron() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getIron, insCanteenFoodMaterial.getIron());
        }
        if (insCanteenFoodMaterial.getPurine() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getPurine, insCanteenFoodMaterial.getPurine());
        }
        if (insCanteenFoodMaterial.getGiValue() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getGiValue, insCanteenFoodMaterial.getGiValue());
        }
        if (insCanteenFoodMaterial.getIsHighPurine() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getIsHighPurine, insCanteenFoodMaterial.getIsHighPurine());
        }
        if (insCanteenFoodMaterial.getIsHighSugar() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getIsHighSugar, insCanteenFoodMaterial.getIsHighSugar());
        }
        if (insCanteenFoodMaterial.getEdiblePartRate() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getEdiblePartRate, insCanteenFoodMaterial.getEdiblePartRate());
        }
        if (StringUtil.isNotBlank(insCanteenFoodMaterial.getDescription())) {
            chainWrapper.set(InsCanteenFoodMaterial::getDescription, insCanteenFoodMaterial.getDescription());
        }
        if (StringUtil.isNotBlank(insCanteenFoodMaterial.getRemark())) {
            chainWrapper.set(InsCanteenFoodMaterial::getRemark, insCanteenFoodMaterial.getRemark());
        }
        if (insCanteenFoodMaterial.getCreateUser() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getCreateUser, insCanteenFoodMaterial.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenFoodMaterial.getCreateName())) {
            chainWrapper.set(InsCanteenFoodMaterial::getCreateName, insCanteenFoodMaterial.getCreateName());
        }
        if (insCanteenFoodMaterial.getCreateDept() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getCreateDept, insCanteenFoodMaterial.getCreateDept());
        }
        if (insCanteenFoodMaterial.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getUpdateUser, insCanteenFoodMaterial.getUpdateUser());
        }
        if (insCanteenFoodMaterial.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getIsDeleted, insCanteenFoodMaterial.getIsDeleted());
        }
        if (insCanteenFoodMaterial.getStatus() != null) {
            chainWrapper.set(InsCanteenFoodMaterial::getStatus, insCanteenFoodMaterial.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenFoodMaterial::getId, insCanteenFoodMaterial.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenFoodMaterial.getId());
        } else {
            return insCanteenFoodMaterial;
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
    public boolean saveInsCanteenFoodMaterialBatch(List<InsCanteenFoodMaterial> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenFoodMaterial insCanteenFoodMaterial : insertList) {
            //使用默认的雪花算法生成
            insCanteenFoodMaterial.setId(null);
            //insCanteenFoodMaterial.setCreatedDt(currentDte);
            //insCanteenFoodMaterial.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenFoodMaterialBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenFoodMaterial> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


