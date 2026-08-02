package cn.pluss.platform.service.insCanteenFoodInfo.impl;

import cn.pluss.platform.mapper.InsCanteenFoodInfoMapper;
import cn.pluss.platform.model.entity.InsCanteenFoodInfo;
import cn.pluss.platform.service.insCanteenFoodInfo.InsCanteenFoodInfoService;
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
@Service("insCanteenFoodInfoService")
public class InsCanteenFoodInfoServiceImpl extends ServiceImpl< InsCanteenFoodInfoMapper, InsCanteenFoodInfo> implements InsCanteenFoodInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenFoodInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenFoodInfo> queryPage(Map map) {
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
    public InsCanteenFoodInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenFoodInfo queryOne(InsCanteenFoodInfo insCanteenFoodInfo){
        LambdaQueryWrapper<InsCanteenFoodInfo> queryWrapper = getQueryWrapper(insCanteenFoodInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenFoodInfo
    * @return
    */
    @Override
    public List<InsCanteenFoodInfo> queryList(InsCanteenFoodInfo insCanteenFoodInfo) {
        LambdaQueryWrapper<InsCanteenFoodInfo> queryWrapper = getQueryWrapper(insCanteenFoodInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenFoodInfo
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenFoodInfo> getQueryWrapper(InsCanteenFoodInfo insCanteenFoodInfo){
        LambdaQueryWrapper<InsCanteenFoodInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenFoodInfo.getId() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getId, insCanteenFoodInfo.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getTenantId())) {
            queryWrapper.eq(InsCanteenFoodInfo::getTenantId, insCanteenFoodInfo.getTenantId());
        }
        if (insCanteenFoodInfo.getCorpId() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getCorpId, insCanteenFoodInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getCorpName())) {
            queryWrapper.eq(InsCanteenFoodInfo::getCorpName, insCanteenFoodInfo.getCorpName());
        }
        if (insCanteenFoodInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getInstitutionId, insCanteenFoodInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getInstitutionName())) {
            queryWrapper.eq(InsCanteenFoodInfo::getInstitutionName, insCanteenFoodInfo.getInstitutionName());
        }
        if (insCanteenFoodInfo.getTypeId() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTypeId, insCanteenFoodInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getTypeName())) {
            queryWrapper.eq(InsCanteenFoodInfo::getTypeName, insCanteenFoodInfo.getTypeName());
        }
        if (insCanteenFoodInfo.getIsPackage() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getIsPackage, insCanteenFoodInfo.getIsPackage());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getFoodName())) {
            queryWrapper.eq(InsCanteenFoodInfo::getFoodName, insCanteenFoodInfo.getFoodName());
        }
        if (insCanteenFoodInfo.getFoodPrice() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getFoodPrice, insCanteenFoodInfo.getFoodPrice());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getFoodUnit())) {
            queryWrapper.eq(InsCanteenFoodInfo::getFoodUnit, insCanteenFoodInfo.getFoodUnit());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getFoodTaste())) {
            queryWrapper.eq(InsCanteenFoodInfo::getFoodTaste, insCanteenFoodInfo.getFoodTaste());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getFoodAvoid())) {
            queryWrapper.eq(InsCanteenFoodInfo::getFoodAvoid, insCanteenFoodInfo.getFoodAvoid());
        }
        if (insCanteenFoodInfo.getPungencyDegree() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getPungencyDegree, insCanteenFoodInfo.getPungencyDegree());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getNutritionDesp())) {
            queryWrapper.eq(InsCanteenFoodInfo::getNutritionDesp, insCanteenFoodInfo.getNutritionDesp());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getIngredientDesp())) {
            queryWrapper.eq(InsCanteenFoodInfo::getIngredientDesp, insCanteenFoodInfo.getIngredientDesp());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getFoodImg())) {
            queryWrapper.eq(InsCanteenFoodInfo::getFoodImg, insCanteenFoodInfo.getFoodImg());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getPackageDesp())) {
            queryWrapper.eq(InsCanteenFoodInfo::getPackageDesp, insCanteenFoodInfo.getPackageDesp());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getRecipeType())) {
            queryWrapper.eq(InsCanteenFoodInfo::getRecipeType, insCanteenFoodInfo.getRecipeType());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getMealTimeType())) {
            queryWrapper.eq(InsCanteenFoodInfo::getMealTimeType, insCanteenFoodInfo.getMealTimeType());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getCookingMethod())) {
            queryWrapper.eq(InsCanteenFoodInfo::getCookingMethod, insCanteenFoodInfo.getCookingMethod());
        }
        if (insCanteenFoodInfo.getPortionWeight() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getPortionWeight, insCanteenFoodInfo.getPortionWeight());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getServingSize())) {
            queryWrapper.eq(InsCanteenFoodInfo::getServingSize, insCanteenFoodInfo.getServingSize());
        }
        if (insCanteenFoodInfo.getTotalCalorie() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalCalorie, insCanteenFoodInfo.getTotalCalorie());
        }
        if (insCanteenFoodInfo.getTotalProtein() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalProtein, insCanteenFoodInfo.getTotalProtein());
        }
        if (insCanteenFoodInfo.getTotalFat() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalFat, insCanteenFoodInfo.getTotalFat());
        }
        if (insCanteenFoodInfo.getTotalCarbohydrate() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalCarbohydrate, insCanteenFoodInfo.getTotalCarbohydrate());
        }
        if (insCanteenFoodInfo.getTotalDietaryFiber() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalDietaryFiber, insCanteenFoodInfo.getTotalDietaryFiber());
        }
        if (insCanteenFoodInfo.getTotalSodium() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalSodium, insCanteenFoodInfo.getTotalSodium());
        }
        if (insCanteenFoodInfo.getTotalPotassium() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalPotassium, insCanteenFoodInfo.getTotalPotassium());
        }
        if (insCanteenFoodInfo.getTotalCalcium() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalCalcium, insCanteenFoodInfo.getTotalCalcium());
        }
        if (insCanteenFoodInfo.getTotalMagnesium() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalMagnesium, insCanteenFoodInfo.getTotalMagnesium());
        }
        if (insCanteenFoodInfo.getTotalPhosphorus() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalPhosphorus, insCanteenFoodInfo.getTotalPhosphorus());
        }
        if (insCanteenFoodInfo.getTotalIron() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalIron, insCanteenFoodInfo.getTotalIron());
        }
        if (insCanteenFoodInfo.getTotalPurine() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getTotalPurine, insCanteenFoodInfo.getTotalPurine());
        }
        if (insCanteenFoodInfo.getIsHighPurine() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getIsHighPurine, insCanteenFoodInfo.getIsHighPurine());
        }
        if (insCanteenFoodInfo.getIsHighSugar() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getIsHighSugar, insCanteenFoodInfo.getIsHighSugar());
        }
        if (insCanteenFoodInfo.getIsHighFat() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getIsHighFat, insCanteenFoodInfo.getIsHighFat());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getTabooExplain())) {
            queryWrapper.eq(InsCanteenFoodInfo::getTabooExplain, insCanteenFoodInfo.getTabooExplain());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getRemark())) {
            queryWrapper.eq(InsCanteenFoodInfo::getRemark, insCanteenFoodInfo.getRemark());
        }
        if (insCanteenFoodInfo.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getCreateUser, insCanteenFoodInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodInfo.getCreateName())) {
            queryWrapper.eq(InsCanteenFoodInfo::getCreateName, insCanteenFoodInfo.getCreateName());
        }
        if (insCanteenFoodInfo.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getCreateDept, insCanteenFoodInfo.getCreateDept());
        }
        if (insCanteenFoodInfo.getCreateTime() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getCreateTime, insCanteenFoodInfo.getCreateTime());
        }
        if (insCanteenFoodInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getUpdateUser, insCanteenFoodInfo.getUpdateUser());
        }
        if (insCanteenFoodInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getUpdateTime, insCanteenFoodInfo.getUpdateTime());
        }
        if (insCanteenFoodInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getIsDeleted, insCanteenFoodInfo.getIsDeleted());
        }
        if (insCanteenFoodInfo.getStatus() != null) {
            queryWrapper.eq(InsCanteenFoodInfo::getStatus, insCanteenFoodInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenFoodInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodInfo insert(InsCanteenFoodInfo insCanteenFoodInfo) {
        insCanteenFoodInfo.setId(null);
        getBaseMapper().insert(insCanteenFoodInfo);
        return insCanteenFoodInfo;
    }

    /**
    * 更新数据
    *
    * @param insCanteenFoodInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodInfo update(InsCanteenFoodInfo insCanteenFoodInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenFoodInfo> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenFoodInfo>(getBaseMapper());
        if (insCanteenFoodInfo.getId() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getId, insCanteenFoodInfo.getId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getTenantId())) {
            chainWrapper.set(InsCanteenFoodInfo::getTenantId, insCanteenFoodInfo.getTenantId());
        }
        if (insCanteenFoodInfo.getCorpId() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getCorpId, insCanteenFoodInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getCorpName())) {
            chainWrapper.set(InsCanteenFoodInfo::getCorpName, insCanteenFoodInfo.getCorpName());
        }
        if (insCanteenFoodInfo.getInstitutionId() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getInstitutionId, insCanteenFoodInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getInstitutionName())) {
            chainWrapper.set(InsCanteenFoodInfo::getInstitutionName, insCanteenFoodInfo.getInstitutionName());
        }
        if (insCanteenFoodInfo.getTypeId() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTypeId, insCanteenFoodInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getTypeName())) {
            chainWrapper.set(InsCanteenFoodInfo::getTypeName, insCanteenFoodInfo.getTypeName());
        }
        if (insCanteenFoodInfo.getIsPackage() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getIsPackage, insCanteenFoodInfo.getIsPackage());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getFoodName())) {
            chainWrapper.set(InsCanteenFoodInfo::getFoodName, insCanteenFoodInfo.getFoodName());
        }
        if (insCanteenFoodInfo.getFoodPrice() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getFoodPrice, insCanteenFoodInfo.getFoodPrice());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getFoodUnit())) {
            chainWrapper.set(InsCanteenFoodInfo::getFoodUnit, insCanteenFoodInfo.getFoodUnit());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getFoodTaste())) {
            chainWrapper.set(InsCanteenFoodInfo::getFoodTaste, insCanteenFoodInfo.getFoodTaste());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getFoodAvoid())) {
            chainWrapper.set(InsCanteenFoodInfo::getFoodAvoid, insCanteenFoodInfo.getFoodAvoid());
        }
        if (insCanteenFoodInfo.getPungencyDegree() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getPungencyDegree, insCanteenFoodInfo.getPungencyDegree());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getNutritionDesp())) {
            chainWrapper.set(InsCanteenFoodInfo::getNutritionDesp, insCanteenFoodInfo.getNutritionDesp());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getIngredientDesp())) {
            chainWrapper.set(InsCanteenFoodInfo::getIngredientDesp, insCanteenFoodInfo.getIngredientDesp());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getFoodImg())) {
            chainWrapper.set(InsCanteenFoodInfo::getFoodImg, insCanteenFoodInfo.getFoodImg());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getPackageDesp())) {
            chainWrapper.set(InsCanteenFoodInfo::getPackageDesp, insCanteenFoodInfo.getPackageDesp());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getRecipeType())) {
            chainWrapper.set(InsCanteenFoodInfo::getRecipeType, insCanteenFoodInfo.getRecipeType());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getMealTimeType())) {
            chainWrapper.set(InsCanteenFoodInfo::getMealTimeType, insCanteenFoodInfo.getMealTimeType());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getCookingMethod())) {
            chainWrapper.set(InsCanteenFoodInfo::getCookingMethod, insCanteenFoodInfo.getCookingMethod());
        }
        if (insCanteenFoodInfo.getPortionWeight() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getPortionWeight, insCanteenFoodInfo.getPortionWeight());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getServingSize())) {
            chainWrapper.set(InsCanteenFoodInfo::getServingSize, insCanteenFoodInfo.getServingSize());
        }
        if (insCanteenFoodInfo.getTotalCalorie() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalCalorie, insCanteenFoodInfo.getTotalCalorie());
        }
        if (insCanteenFoodInfo.getTotalProtein() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalProtein, insCanteenFoodInfo.getTotalProtein());
        }
        if (insCanteenFoodInfo.getTotalFat() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalFat, insCanteenFoodInfo.getTotalFat());
        }
        if (insCanteenFoodInfo.getTotalCarbohydrate() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalCarbohydrate, insCanteenFoodInfo.getTotalCarbohydrate());
        }
        if (insCanteenFoodInfo.getTotalDietaryFiber() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalDietaryFiber, insCanteenFoodInfo.getTotalDietaryFiber());
        }
        if (insCanteenFoodInfo.getTotalSodium() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalSodium, insCanteenFoodInfo.getTotalSodium());
        }
        if (insCanteenFoodInfo.getTotalPotassium() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalPotassium, insCanteenFoodInfo.getTotalPotassium());
        }
        if (insCanteenFoodInfo.getTotalCalcium() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalCalcium, insCanteenFoodInfo.getTotalCalcium());
        }
        if (insCanteenFoodInfo.getTotalMagnesium() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalMagnesium, insCanteenFoodInfo.getTotalMagnesium());
        }
        if (insCanteenFoodInfo.getTotalPhosphorus() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalPhosphorus, insCanteenFoodInfo.getTotalPhosphorus());
        }
        if (insCanteenFoodInfo.getTotalIron() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalIron, insCanteenFoodInfo.getTotalIron());
        }
        if (insCanteenFoodInfo.getTotalPurine() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getTotalPurine, insCanteenFoodInfo.getTotalPurine());
        }
        if (insCanteenFoodInfo.getIsHighPurine() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getIsHighPurine, insCanteenFoodInfo.getIsHighPurine());
        }
        if (insCanteenFoodInfo.getIsHighSugar() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getIsHighSugar, insCanteenFoodInfo.getIsHighSugar());
        }
        if (insCanteenFoodInfo.getIsHighFat() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getIsHighFat, insCanteenFoodInfo.getIsHighFat());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getTabooExplain())) {
            chainWrapper.set(InsCanteenFoodInfo::getTabooExplain, insCanteenFoodInfo.getTabooExplain());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getRemark())) {
            chainWrapper.set(InsCanteenFoodInfo::getRemark, insCanteenFoodInfo.getRemark());
        }
        if (insCanteenFoodInfo.getCreateUser() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getCreateUser, insCanteenFoodInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenFoodInfo.getCreateName())) {
            chainWrapper.set(InsCanteenFoodInfo::getCreateName, insCanteenFoodInfo.getCreateName());
        }
        if (insCanteenFoodInfo.getCreateDept() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getCreateDept, insCanteenFoodInfo.getCreateDept());
        }
        if (insCanteenFoodInfo.getCreateTime() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getCreateTime, insCanteenFoodInfo.getCreateTime());
        }
        if (insCanteenFoodInfo.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getUpdateUser, insCanteenFoodInfo.getUpdateUser());
        }
        if (insCanteenFoodInfo.getUpdateTime() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getUpdateTime, insCanteenFoodInfo.getUpdateTime());
        }
        if (insCanteenFoodInfo.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getIsDeleted, insCanteenFoodInfo.getIsDeleted());
        }
        if (insCanteenFoodInfo.getStatus() != null) {
            chainWrapper.set(InsCanteenFoodInfo::getStatus, insCanteenFoodInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenFoodInfo::getId, insCanteenFoodInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenFoodInfo.getId());
        } else {
            return insCanteenFoodInfo;
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
    public boolean saveInsCanteenFoodInfoBatch(List<InsCanteenFoodInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenFoodInfo insCanteenFoodInfo : insertList) {
            //使用默认的雪花算法生成
            insCanteenFoodInfo.setId(null);
            //insCanteenFoodInfo.setCreatedDt(currentDte);
            //insCanteenFoodInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenFoodInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenFoodInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


