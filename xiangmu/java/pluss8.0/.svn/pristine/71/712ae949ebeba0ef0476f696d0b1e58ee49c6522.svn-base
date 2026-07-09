package cn.pluss.platform.service.insSecurityDangersCategory.impl;

import cn.pluss.platform.mapper.InsSecurityDangersCategoryMapper;
import cn.pluss.platform.model.entity.InsSecurityDangersCategory;
import cn.pluss.platform.service.insSecurityDangersCategory.InsSecurityDangersCategoryService;
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
@Service("insSecurityDangersCategoryService")
public class InsSecurityDangersCategoryServiceImpl extends ServiceImpl< InsSecurityDangersCategoryMapper, InsSecurityDangersCategory> implements InsSecurityDangersCategoryService {
    private static final Logger logger = LoggerFactory.getLogger(InsSecurityDangersCategoryServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSecurityDangersCategory> queryPage(Map map) {
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
    public InsSecurityDangersCategory queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityDangersCategory 实例对象
    * @return 实例对象
    */
    @Override
    public InsSecurityDangersCategory queryOne(InsSecurityDangersCategory insSecurityDangersCategory){
        LambdaQueryWrapper<InsSecurityDangersCategory> queryWrapper = getQueryWrapper(insSecurityDangersCategory);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityDangersCategory
    * @return
    */
    @Override
    public List<InsSecurityDangersCategory> queryList(InsSecurityDangersCategory insSecurityDangersCategory) {
        LambdaQueryWrapper<InsSecurityDangersCategory> queryWrapper = getQueryWrapper(insSecurityDangersCategory);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSecurityDangersCategory
    * @return
    */
    public static LambdaQueryWrapper<InsSecurityDangersCategory> getQueryWrapper(InsSecurityDangersCategory insSecurityDangersCategory){
        LambdaQueryWrapper<InsSecurityDangersCategory> queryWrapper = new LambdaQueryWrapper<>();
        if (insSecurityDangersCategory.getId() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getId, insSecurityDangersCategory.getId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCategory.getTenantId())) {
            queryWrapper.eq(InsSecurityDangersCategory::getTenantId, insSecurityDangersCategory.getTenantId());
        }
        if (insSecurityDangersCategory.getCorpId() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getCorpId, insSecurityDangersCategory.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCategory.getCorpName())) {
            queryWrapper.eq(InsSecurityDangersCategory::getCorpName, insSecurityDangersCategory.getCorpName());
        }
        if (insSecurityDangersCategory.getInstitutionId() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getInstitutionId, insSecurityDangersCategory.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCategory.getInstitutionName())) {
            queryWrapper.eq(InsSecurityDangersCategory::getInstitutionName, insSecurityDangersCategory.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCategory.getDangersType())) {
            queryWrapper.eq(InsSecurityDangersCategory::getDangersType, insSecurityDangersCategory.getDangersType());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCategory.getCategoryName())) {
            queryWrapper.eq(InsSecurityDangersCategory::getCategoryName, insSecurityDangersCategory.getCategoryName());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCategory.getRemark())) {
            queryWrapper.eq(InsSecurityDangersCategory::getRemark, insSecurityDangersCategory.getRemark());
        }
        if (insSecurityDangersCategory.getCreateUser() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getCreateUser, insSecurityDangersCategory.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCategory.getCreateName())) {
            queryWrapper.eq(InsSecurityDangersCategory::getCreateName, insSecurityDangersCategory.getCreateName());
        }
        if (insSecurityDangersCategory.getCreateDept() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getCreateDept, insSecurityDangersCategory.getCreateDept());
        }
        if (insSecurityDangersCategory.getCreateTime() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getCreateTime, insSecurityDangersCategory.getCreateTime());
        }
        if (insSecurityDangersCategory.getUpdateUser() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getUpdateUser, insSecurityDangersCategory.getUpdateUser());
        }
        if (insSecurityDangersCategory.getUpdateTime() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getUpdateTime, insSecurityDangersCategory.getUpdateTime());
        }
        if (insSecurityDangersCategory.getIsDeleted() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getIsDeleted, insSecurityDangersCategory.getIsDeleted());
        }
        if (insSecurityDangersCategory.getStatus() != null) {
            queryWrapper.eq(InsSecurityDangersCategory::getStatus, insSecurityDangersCategory.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSecurityDangersCategory 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityDangersCategory insert(InsSecurityDangersCategory insSecurityDangersCategory) {
        insSecurityDangersCategory.setId(null);
        getBaseMapper().insert(insSecurityDangersCategory);
        return insSecurityDangersCategory;
    }

    /**
    * 更新数据
    *
    * @param insSecurityDangersCategory 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityDangersCategory update(InsSecurityDangersCategory insSecurityDangersCategory) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSecurityDangersCategory> chainWrapper = new LambdaUpdateChainWrapper<InsSecurityDangersCategory>(getBaseMapper());
        if (insSecurityDangersCategory.getId() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getId, insSecurityDangersCategory.getId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCategory.getTenantId())) {
            chainWrapper.set(InsSecurityDangersCategory::getTenantId, insSecurityDangersCategory.getTenantId());
        }
        if (insSecurityDangersCategory.getCorpId() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getCorpId, insSecurityDangersCategory.getCorpId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCategory.getCorpName())) {
            chainWrapper.set(InsSecurityDangersCategory::getCorpName, insSecurityDangersCategory.getCorpName());
        }
        if (insSecurityDangersCategory.getInstitutionId() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getInstitutionId, insSecurityDangersCategory.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCategory.getInstitutionName())) {
            chainWrapper.set(InsSecurityDangersCategory::getInstitutionName, insSecurityDangersCategory.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCategory.getDangersType())) {
            chainWrapper.set(InsSecurityDangersCategory::getDangersType, insSecurityDangersCategory.getDangersType());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCategory.getCategoryName())) {
            chainWrapper.set(InsSecurityDangersCategory::getCategoryName, insSecurityDangersCategory.getCategoryName());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCategory.getRemark())) {
            chainWrapper.set(InsSecurityDangersCategory::getRemark, insSecurityDangersCategory.getRemark());
        }
        if (insSecurityDangersCategory.getCreateUser() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getCreateUser, insSecurityDangersCategory.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCategory.getCreateName())) {
            chainWrapper.set(InsSecurityDangersCategory::getCreateName, insSecurityDangersCategory.getCreateName());
        }
        if (insSecurityDangersCategory.getCreateDept() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getCreateDept, insSecurityDangersCategory.getCreateDept());
        }
        if (insSecurityDangersCategory.getCreateTime() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getCreateTime, insSecurityDangersCategory.getCreateTime());
        }
        if (insSecurityDangersCategory.getUpdateUser() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getUpdateUser, insSecurityDangersCategory.getUpdateUser());
        }
        if (insSecurityDangersCategory.getUpdateTime() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getUpdateTime, insSecurityDangersCategory.getUpdateTime());
        }
        if (insSecurityDangersCategory.getIsDeleted() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getIsDeleted, insSecurityDangersCategory.getIsDeleted());
        }
        if (insSecurityDangersCategory.getStatus() != null) {
            chainWrapper.set(InsSecurityDangersCategory::getStatus, insSecurityDangersCategory.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSecurityDangersCategory::getId, insSecurityDangersCategory.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSecurityDangersCategory.getId());
        } else {
            return insSecurityDangersCategory;
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
    public boolean saveInsSecurityDangersCategoryBatch(List<InsSecurityDangersCategory> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSecurityDangersCategory insSecurityDangersCategory : insertList) {
            //使用默认的雪花算法生成
            insSecurityDangersCategory.setId(null);
            //insSecurityDangersCategory.setCreatedDt(currentDte);
            //insSecurityDangersCategory.setUpdatedDt(currentDte);
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
    public Integer deleteInsSecurityDangersCategoryBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSecurityDangersCategory> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


