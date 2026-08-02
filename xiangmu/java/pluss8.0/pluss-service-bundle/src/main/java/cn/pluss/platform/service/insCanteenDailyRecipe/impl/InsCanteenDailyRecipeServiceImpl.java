package cn.pluss.platform.service.insCanteenDailyRecipe.impl;

import cn.pluss.platform.mapper.InsCanteenDailyRecipeMapper;
import cn.pluss.platform.model.entity.InsCanteenDailyRecipe;
import cn.pluss.platform.service.insCanteenDailyRecipe.InsCanteenDailyRecipeService;
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
@Service("insCanteenDailyRecipeService")
public class InsCanteenDailyRecipeServiceImpl extends ServiceImpl< InsCanteenDailyRecipeMapper, InsCanteenDailyRecipe> implements InsCanteenDailyRecipeService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenDailyRecipeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenDailyRecipe> queryPage(Map map) {
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
    public InsCanteenDailyRecipe queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenDailyRecipe 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenDailyRecipe queryOne(InsCanteenDailyRecipe insCanteenDailyRecipe){
        LambdaQueryWrapper<InsCanteenDailyRecipe> queryWrapper = getQueryWrapper(insCanteenDailyRecipe);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenDailyRecipe
    * @return
    */
    @Override
    public List<InsCanteenDailyRecipe> queryList(InsCanteenDailyRecipe insCanteenDailyRecipe) {
        LambdaQueryWrapper<InsCanteenDailyRecipe> queryWrapper = getQueryWrapper(insCanteenDailyRecipe);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenDailyRecipe
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenDailyRecipe> getQueryWrapper(InsCanteenDailyRecipe insCanteenDailyRecipe){
        LambdaQueryWrapper<InsCanteenDailyRecipe> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenDailyRecipe.getId() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getId, insCanteenDailyRecipe.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getTenantId())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getTenantId, insCanteenDailyRecipe.getTenantId());
        }
        if (insCanteenDailyRecipe.getCorpId() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getCorpId, insCanteenDailyRecipe.getCorpId());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getCorpName())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getCorpName, insCanteenDailyRecipe.getCorpName());
        }
        if (insCanteenDailyRecipe.getInstitutionId() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getInstitutionId, insCanteenDailyRecipe.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getInstitutionName())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getInstitutionName, insCanteenDailyRecipe.getInstitutionName());
        }
        if (insCanteenDailyRecipe.getRecipeDate() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getRecipeDate, insCanteenDailyRecipe.getRecipeDate());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getBreakfastFood())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getBreakfastFood, insCanteenDailyRecipe.getBreakfastFood());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getBreakfastImgPath())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getBreakfastImgPath, insCanteenDailyRecipe.getBreakfastImgPath());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getLunchFood())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getLunchFood, insCanteenDailyRecipe.getLunchFood());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getLunchImgPath())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getLunchImgPath, insCanteenDailyRecipe.getLunchImgPath());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getDinnerFood())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getDinnerFood, insCanteenDailyRecipe.getDinnerFood());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getDinnerImgPath())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getDinnerImgPath, insCanteenDailyRecipe.getDinnerImgPath());
        }
        if (insCanteenDailyRecipe.getZcFoodTime() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getZcFoodTime, insCanteenDailyRecipe.getZcFoodTime());
        }
        if (insCanteenDailyRecipe.getZxFoodTime() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getZxFoodTime, insCanteenDailyRecipe.getZxFoodTime());
        }
        if (insCanteenDailyRecipe.getWcFoodTime() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getWcFoodTime, insCanteenDailyRecipe.getWcFoodTime());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getRemark())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getRemark, insCanteenDailyRecipe.getRemark());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getAreaCode())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getAreaCode, insCanteenDailyRecipe.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getAreaName())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getAreaName, insCanteenDailyRecipe.getAreaName());
        }
        if (insCanteenDailyRecipe.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getCreateUser, insCanteenDailyRecipe.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenDailyRecipe.getCreateName())) {
            queryWrapper.eq(InsCanteenDailyRecipe::getCreateName, insCanteenDailyRecipe.getCreateName());
        }
        if (insCanteenDailyRecipe.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getCreateDept, insCanteenDailyRecipe.getCreateDept());
        }
        if (insCanteenDailyRecipe.getCreateTime() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getCreateTime, insCanteenDailyRecipe.getCreateTime());
        }
        if (insCanteenDailyRecipe.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getUpdateUser, insCanteenDailyRecipe.getUpdateUser());
        }
        if (insCanteenDailyRecipe.getUpdateTime() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getUpdateTime, insCanteenDailyRecipe.getUpdateTime());
        }
        if (insCanteenDailyRecipe.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getIsDeleted, insCanteenDailyRecipe.getIsDeleted());
        }
        if (insCanteenDailyRecipe.getStatus() != null) {
            queryWrapper.eq(InsCanteenDailyRecipe::getStatus, insCanteenDailyRecipe.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenDailyRecipe 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenDailyRecipe insert(InsCanteenDailyRecipe insCanteenDailyRecipe) {
        insCanteenDailyRecipe.setId(null);
        getBaseMapper().insert(insCanteenDailyRecipe);
        return insCanteenDailyRecipe;
    }

    /**
    * 更新数据
    *
    * @param insCanteenDailyRecipe 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenDailyRecipe update(InsCanteenDailyRecipe insCanteenDailyRecipe) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenDailyRecipe> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenDailyRecipe>(getBaseMapper());
        if (insCanteenDailyRecipe.getId() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getId, insCanteenDailyRecipe.getId());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getTenantId())) {
            chainWrapper.set(InsCanteenDailyRecipe::getTenantId, insCanteenDailyRecipe.getTenantId());
        }
        if (insCanteenDailyRecipe.getCorpId() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getCorpId, insCanteenDailyRecipe.getCorpId());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getCorpName())) {
            chainWrapper.set(InsCanteenDailyRecipe::getCorpName, insCanteenDailyRecipe.getCorpName());
        }
        if (insCanteenDailyRecipe.getInstitutionId() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getInstitutionId, insCanteenDailyRecipe.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getInstitutionName())) {
            chainWrapper.set(InsCanteenDailyRecipe::getInstitutionName, insCanteenDailyRecipe.getInstitutionName());
        }
        if (insCanteenDailyRecipe.getRecipeDate() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getRecipeDate, insCanteenDailyRecipe.getRecipeDate());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getBreakfastFood())) {
            chainWrapper.set(InsCanteenDailyRecipe::getBreakfastFood, insCanteenDailyRecipe.getBreakfastFood());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getBreakfastImgPath())) {
            chainWrapper.set(InsCanteenDailyRecipe::getBreakfastImgPath, insCanteenDailyRecipe.getBreakfastImgPath());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getLunchFood())) {
            chainWrapper.set(InsCanteenDailyRecipe::getLunchFood, insCanteenDailyRecipe.getLunchFood());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getLunchImgPath())) {
            chainWrapper.set(InsCanteenDailyRecipe::getLunchImgPath, insCanteenDailyRecipe.getLunchImgPath());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getDinnerFood())) {
            chainWrapper.set(InsCanteenDailyRecipe::getDinnerFood, insCanteenDailyRecipe.getDinnerFood());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getDinnerImgPath())) {
            chainWrapper.set(InsCanteenDailyRecipe::getDinnerImgPath, insCanteenDailyRecipe.getDinnerImgPath());
        }
        if (insCanteenDailyRecipe.getZcFoodTime() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getZcFoodTime, insCanteenDailyRecipe.getZcFoodTime());
        }
        if (insCanteenDailyRecipe.getZxFoodTime() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getZxFoodTime, insCanteenDailyRecipe.getZxFoodTime());
        }
        if (insCanteenDailyRecipe.getWcFoodTime() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getWcFoodTime, insCanteenDailyRecipe.getWcFoodTime());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getRemark())) {
            chainWrapper.set(InsCanteenDailyRecipe::getRemark, insCanteenDailyRecipe.getRemark());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getAreaCode())) {
            chainWrapper.set(InsCanteenDailyRecipe::getAreaCode, insCanteenDailyRecipe.getAreaCode());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getAreaName())) {
            chainWrapper.set(InsCanteenDailyRecipe::getAreaName, insCanteenDailyRecipe.getAreaName());
        }
        if (insCanteenDailyRecipe.getCreateUser() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getCreateUser, insCanteenDailyRecipe.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenDailyRecipe.getCreateName())) {
            chainWrapper.set(InsCanteenDailyRecipe::getCreateName, insCanteenDailyRecipe.getCreateName());
        }
        if (insCanteenDailyRecipe.getCreateDept() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getCreateDept, insCanteenDailyRecipe.getCreateDept());
        }
        if (insCanteenDailyRecipe.getCreateTime() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getCreateTime, insCanteenDailyRecipe.getCreateTime());
        }
        if (insCanteenDailyRecipe.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getUpdateUser, insCanteenDailyRecipe.getUpdateUser());
        }
        if (insCanteenDailyRecipe.getUpdateTime() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getUpdateTime, insCanteenDailyRecipe.getUpdateTime());
        }
        if (insCanteenDailyRecipe.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getIsDeleted, insCanteenDailyRecipe.getIsDeleted());
        }
        if (insCanteenDailyRecipe.getStatus() != null) {
            chainWrapper.set(InsCanteenDailyRecipe::getStatus, insCanteenDailyRecipe.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenDailyRecipe::getId, insCanteenDailyRecipe.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenDailyRecipe.getId());
        } else {
            return insCanteenDailyRecipe;
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
    public boolean saveInsCanteenDailyRecipeBatch(List<InsCanteenDailyRecipe> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenDailyRecipe insCanteenDailyRecipe : insertList) {
            //使用默认的雪花算法生成
            insCanteenDailyRecipe.setId(null);
            //insCanteenDailyRecipe.setCreatedDt(currentDte);
            //insCanteenDailyRecipe.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenDailyRecipeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenDailyRecipe> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


