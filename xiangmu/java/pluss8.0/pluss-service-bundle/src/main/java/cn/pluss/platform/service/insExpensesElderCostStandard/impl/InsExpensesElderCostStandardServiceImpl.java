package cn.pluss.platform.service.insExpensesElderCostStandard.impl;

import cn.pluss.platform.mapper.InsExpensesElderCostStandardMapper;
import cn.pluss.platform.model.entity.InsExpensesElderCostStandard;
import cn.pluss.platform.service.insExpensesElderCostStandard.InsExpensesElderCostStandardService;
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
@Service("insExpensesElderCostStandardService")
public class InsExpensesElderCostStandardServiceImpl extends ServiceImpl< InsExpensesElderCostStandardMapper, InsExpensesElderCostStandard> implements InsExpensesElderCostStandardService {
    private static final Logger logger = LoggerFactory.getLogger(InsExpensesElderCostStandardServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsExpensesElderCostStandard> queryPage(Map map) {
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
    public InsExpensesElderCostStandard queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesElderCostStandard 实例对象
    * @return 实例对象
    */
    @Override
    public InsExpensesElderCostStandard queryOne(InsExpensesElderCostStandard insExpensesElderCostStandard){
        LambdaQueryWrapper<InsExpensesElderCostStandard> queryWrapper = getQueryWrapper(insExpensesElderCostStandard);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesElderCostStandard
    * @return
    */
    @Override
    public List<InsExpensesElderCostStandard> queryList(InsExpensesElderCostStandard insExpensesElderCostStandard) {
        LambdaQueryWrapper<InsExpensesElderCostStandard> queryWrapper = getQueryWrapper(insExpensesElderCostStandard);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insExpensesElderCostStandard
    * @return
    */
    public static LambdaQueryWrapper<InsExpensesElderCostStandard> getQueryWrapper(InsExpensesElderCostStandard insExpensesElderCostStandard){
        LambdaQueryWrapper<InsExpensesElderCostStandard> queryWrapper = new LambdaQueryWrapper<>();
        if (insExpensesElderCostStandard.getId() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getId, insExpensesElderCostStandard.getId());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getTenantId())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getTenantId, insExpensesElderCostStandard.getTenantId());
        }
        if (insExpensesElderCostStandard.getCorpId() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCorpId, insExpensesElderCostStandard.getCorpId());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getCorpName())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCorpName, insExpensesElderCostStandard.getCorpName());
        }
        if (insExpensesElderCostStandard.getInstitutionId() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getInstitutionId, insExpensesElderCostStandard.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getInstitutionName())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getInstitutionName, insExpensesElderCostStandard.getInstitutionName());
        }
        if (insExpensesElderCostStandard.getCheckId() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCheckId, insExpensesElderCostStandard.getCheckId());
        }
        if (insExpensesElderCostStandard.getCheckDate() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCheckDate, insExpensesElderCostStandard.getCheckDate());
        }
        if (insExpensesElderCostStandard.getElderId() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getElderId, insExpensesElderCostStandard.getElderId());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getElderName())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getElderName, insExpensesElderCostStandard.getElderName());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getIdCard())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getIdCard, insExpensesElderCostStandard.getIdCard());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getSex())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getSex, insExpensesElderCostStandard.getSex());
        }
        if (insExpensesElderCostStandard.getCostType() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCostType, insExpensesElderCostStandard.getCostType());
        }
        if (insExpensesElderCostStandard.getCostId() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCostId, insExpensesElderCostStandard.getCostId());
        }
        if (insExpensesElderCostStandard.getItemId() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getItemId, insExpensesElderCostStandard.getItemId());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getItemName())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getItemName, insExpensesElderCostStandard.getItemName());
        }
        if (insExpensesElderCostStandard.getItemPrice() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getItemPrice, insExpensesElderCostStandard.getItemPrice());
        }
        if (insExpensesElderCostStandard.getDiscountedPrice() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getDiscountedPrice, insExpensesElderCostStandard.getDiscountedPrice());
        }
        if (insExpensesElderCostStandard.getCostMode() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCostMode, insExpensesElderCostStandard.getCostMode());
        }
        if (insExpensesElderCostStandard.getStartDate() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getStartDate, insExpensesElderCostStandard.getStartDate());
        }
        if (insExpensesElderCostStandard.getEndDate() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getEndDate, insExpensesElderCostStandard.getEndDate());
        }
        if (insExpensesElderCostStandard.getStatus() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getStatus, insExpensesElderCostStandard.getStatus());
        }
        if (insExpensesElderCostStandard.getStopTime() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getStopTime, insExpensesElderCostStandard.getStopTime());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getStopUser())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getStopUser, insExpensesElderCostStandard.getStopUser());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getRemark())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getRemark, insExpensesElderCostStandard.getRemark());
        }
        if (insExpensesElderCostStandard.getCreateUser() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCreateUser, insExpensesElderCostStandard.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insExpensesElderCostStandard.getCreateName())) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCreateName, insExpensesElderCostStandard.getCreateName());
        }
        if (insExpensesElderCostStandard.getCreateDept() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCreateDept, insExpensesElderCostStandard.getCreateDept());
        }
        if (insExpensesElderCostStandard.getCreateTime() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getCreateTime, insExpensesElderCostStandard.getCreateTime());
        }
        if (insExpensesElderCostStandard.getUpdateUser() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getUpdateUser, insExpensesElderCostStandard.getUpdateUser());
        }
        if (insExpensesElderCostStandard.getUpdateTime() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getUpdateTime, insExpensesElderCostStandard.getUpdateTime());
        }
        if (insExpensesElderCostStandard.getIsDeleted() != null) {
            queryWrapper.eq(InsExpensesElderCostStandard::getIsDeleted, insExpensesElderCostStandard.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insExpensesElderCostStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesElderCostStandard insert(InsExpensesElderCostStandard insExpensesElderCostStandard) {
        insExpensesElderCostStandard.setId(null);
        getBaseMapper().insert(insExpensesElderCostStandard);
        return insExpensesElderCostStandard;
    }

    /**
    * 更新数据
    *
    * @param insExpensesElderCostStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesElderCostStandard update(InsExpensesElderCostStandard insExpensesElderCostStandard) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsExpensesElderCostStandard> chainWrapper = new LambdaUpdateChainWrapper<InsExpensesElderCostStandard>(getBaseMapper());
        if (insExpensesElderCostStandard.getId() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getId, insExpensesElderCostStandard.getId());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getTenantId())) {
            chainWrapper.set(InsExpensesElderCostStandard::getTenantId, insExpensesElderCostStandard.getTenantId());
        }
        if (insExpensesElderCostStandard.getCorpId() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getCorpId, insExpensesElderCostStandard.getCorpId());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getCorpName())) {
            chainWrapper.set(InsExpensesElderCostStandard::getCorpName, insExpensesElderCostStandard.getCorpName());
        }
        if (insExpensesElderCostStandard.getInstitutionId() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getInstitutionId, insExpensesElderCostStandard.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getInstitutionName())) {
            chainWrapper.set(InsExpensesElderCostStandard::getInstitutionName, insExpensesElderCostStandard.getInstitutionName());
        }
        if (insExpensesElderCostStandard.getCheckId() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getCheckId, insExpensesElderCostStandard.getCheckId());
        }
        if (insExpensesElderCostStandard.getCheckDate() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getCheckDate, insExpensesElderCostStandard.getCheckDate());
        }
        if (insExpensesElderCostStandard.getElderId() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getElderId, insExpensesElderCostStandard.getElderId());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getElderName())) {
            chainWrapper.set(InsExpensesElderCostStandard::getElderName, insExpensesElderCostStandard.getElderName());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getIdCard())) {
            chainWrapper.set(InsExpensesElderCostStandard::getIdCard, insExpensesElderCostStandard.getIdCard());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getSex())) {
            chainWrapper.set(InsExpensesElderCostStandard::getSex, insExpensesElderCostStandard.getSex());
        }
        if (insExpensesElderCostStandard.getCostType() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getCostType, insExpensesElderCostStandard.getCostType());
        }
        if (insExpensesElderCostStandard.getCostId() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getCostId, insExpensesElderCostStandard.getCostId());
        }
        if (insExpensesElderCostStandard.getItemId() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getItemId, insExpensesElderCostStandard.getItemId());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getItemName())) {
            chainWrapper.set(InsExpensesElderCostStandard::getItemName, insExpensesElderCostStandard.getItemName());
        }
        if (insExpensesElderCostStandard.getItemPrice() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getItemPrice, insExpensesElderCostStandard.getItemPrice());
        }
        if (insExpensesElderCostStandard.getDiscountedPrice() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getDiscountedPrice, insExpensesElderCostStandard.getDiscountedPrice());
        }
        if (insExpensesElderCostStandard.getCostMode() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getCostMode, insExpensesElderCostStandard.getCostMode());
        }
        if (insExpensesElderCostStandard.getStartDate() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getStartDate, insExpensesElderCostStandard.getStartDate());
        }
        if (insExpensesElderCostStandard.getEndDate() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getEndDate, insExpensesElderCostStandard.getEndDate());
        }
        if (insExpensesElderCostStandard.getStatus() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getStatus, insExpensesElderCostStandard.getStatus());
        }
        if (insExpensesElderCostStandard.getStopTime() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getStopTime, insExpensesElderCostStandard.getStopTime());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getStopUser())) {
            chainWrapper.set(InsExpensesElderCostStandard::getStopUser, insExpensesElderCostStandard.getStopUser());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getRemark())) {
            chainWrapper.set(InsExpensesElderCostStandard::getRemark, insExpensesElderCostStandard.getRemark());
        }
        if (insExpensesElderCostStandard.getCreateUser() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getCreateUser, insExpensesElderCostStandard.getCreateUser());
        }
        if (StringUtil.isNotBlank(insExpensesElderCostStandard.getCreateName())) {
            chainWrapper.set(InsExpensesElderCostStandard::getCreateName, insExpensesElderCostStandard.getCreateName());
        }
        if (insExpensesElderCostStandard.getCreateDept() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getCreateDept, insExpensesElderCostStandard.getCreateDept());
        }
        if (insExpensesElderCostStandard.getCreateTime() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getCreateTime, insExpensesElderCostStandard.getCreateTime());
        }
        if (insExpensesElderCostStandard.getUpdateUser() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getUpdateUser, insExpensesElderCostStandard.getUpdateUser());
        }
        if (insExpensesElderCostStandard.getUpdateTime() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getUpdateTime, insExpensesElderCostStandard.getUpdateTime());
        }
        if (insExpensesElderCostStandard.getIsDeleted() != null) {
            chainWrapper.set(InsExpensesElderCostStandard::getIsDeleted, insExpensesElderCostStandard.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsExpensesElderCostStandard::getId, insExpensesElderCostStandard.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insExpensesElderCostStandard.getId());
        } else {
            return insExpensesElderCostStandard;
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
    public boolean saveInsExpensesElderCostStandardBatch(List<InsExpensesElderCostStandard> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsExpensesElderCostStandard insExpensesElderCostStandard : insertList) {
            //使用默认的雪花算法生成
            insExpensesElderCostStandard.setId(null);
            //insExpensesElderCostStandard.setCreatedDt(currentDte);
            //insExpensesElderCostStandard.setUpdatedDt(currentDte);
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
    public Integer deleteInsExpensesElderCostStandardBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsExpensesElderCostStandard> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


