package cn.pluss.platform.service.insElderContractCostStandard.impl;

import cn.pluss.platform.mapper.InsElderContractCostStandardMapper;
import cn.pluss.platform.model.entity.InsElderContractCostStandard;
import cn.pluss.platform.service.insElderContractCostStandard.InsElderContractCostStandardService;
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
@Service("insElderContractCostStandardService")
public class InsElderContractCostStandardServiceImpl extends ServiceImpl< InsElderContractCostStandardMapper, InsElderContractCostStandard> implements InsElderContractCostStandardService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderContractCostStandardServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderContractCostStandard> queryPage(Map map) {
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
    public InsElderContractCostStandard queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderContractCostStandard 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderContractCostStandard queryOne(InsElderContractCostStandard insElderContractCostStandard){
        LambdaQueryWrapper<InsElderContractCostStandard> queryWrapper = getQueryWrapper(insElderContractCostStandard);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderContractCostStandard
    * @return
    */
    @Override
    public List<InsElderContractCostStandard> queryList(InsElderContractCostStandard insElderContractCostStandard) {
        LambdaQueryWrapper<InsElderContractCostStandard> queryWrapper = getQueryWrapper(insElderContractCostStandard);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderContractCostStandard
    * @return
    */
    public static LambdaQueryWrapper<InsElderContractCostStandard> getQueryWrapper(InsElderContractCostStandard insElderContractCostStandard){
        LambdaQueryWrapper<InsElderContractCostStandard> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderContractCostStandard.getId() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getId, insElderContractCostStandard.getId());
        }
        if (StringUtil.isNotEmpty(insElderContractCostStandard.getTenantId())) {
            queryWrapper.eq(InsElderContractCostStandard::getTenantId, insElderContractCostStandard.getTenantId());
        }
        if (insElderContractCostStandard.getCorpId() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getCorpId, insElderContractCostStandard.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderContractCostStandard.getCorpName())) {
            queryWrapper.eq(InsElderContractCostStandard::getCorpName, insElderContractCostStandard.getCorpName());
        }
        if (insElderContractCostStandard.getInstitutionId() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getInstitutionId, insElderContractCostStandard.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderContractCostStandard.getInstitutionName())) {
            queryWrapper.eq(InsElderContractCostStandard::getInstitutionName, insElderContractCostStandard.getInstitutionName());
        }
        if (insElderContractCostStandard.getCheckId() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getCheckId, insElderContractCostStandard.getCheckId());
        }
        if (insElderContractCostStandard.getCheckDate() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getCheckDate, insElderContractCostStandard.getCheckDate());
        }
        if (insElderContractCostStandard.getElderId() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getElderId, insElderContractCostStandard.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderContractCostStandard.getElderName())) {
            queryWrapper.eq(InsElderContractCostStandard::getElderName, insElderContractCostStandard.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderContractCostStandard.getIdCard())) {
            queryWrapper.eq(InsElderContractCostStandard::getIdCard, insElderContractCostStandard.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderContractCostStandard.getSex())) {
            queryWrapper.eq(InsElderContractCostStandard::getSex, insElderContractCostStandard.getSex());
        }
        if (insElderContractCostStandard.getContractId() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getContractId, insElderContractCostStandard.getContractId());
        }
        if (insElderContractCostStandard.getCostType() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getCostType, insElderContractCostStandard.getCostType());
        }
        if (insElderContractCostStandard.getCostId() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getCostId, insElderContractCostStandard.getCostId());
        }
        if (insElderContractCostStandard.getItemId() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getItemId, insElderContractCostStandard.getItemId());
        }
        if (StringUtil.isNotEmpty(insElderContractCostStandard.getItemName())) {
            queryWrapper.eq(InsElderContractCostStandard::getItemName, insElderContractCostStandard.getItemName());
        }
        if (insElderContractCostStandard.getItemPrice() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getItemPrice, insElderContractCostStandard.getItemPrice());
        }
        if (insElderContractCostStandard.getDiscountedPrice() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getDiscountedPrice, insElderContractCostStandard.getDiscountedPrice());
        }
        if (insElderContractCostStandard.getDiscountRate() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getDiscountRate, insElderContractCostStandard.getDiscountRate());
        }
        if (insElderContractCostStandard.getCostMode() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getCostMode, insElderContractCostStandard.getCostMode());
        }
        if (StringUtil.isNotEmpty(insElderContractCostStandard.getRemark())) {
            queryWrapper.eq(InsElderContractCostStandard::getRemark, insElderContractCostStandard.getRemark());
        }
        if (insElderContractCostStandard.getCreateUser() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getCreateUser, insElderContractCostStandard.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderContractCostStandard.getCreateName())) {
            queryWrapper.eq(InsElderContractCostStandard::getCreateName, insElderContractCostStandard.getCreateName());
        }
        if (insElderContractCostStandard.getCreateDept() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getCreateDept, insElderContractCostStandard.getCreateDept());
        }
        if (insElderContractCostStandard.getCreateTime() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getCreateTime, insElderContractCostStandard.getCreateTime());
        }
        if (insElderContractCostStandard.getUpdateUser() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getUpdateUser, insElderContractCostStandard.getUpdateUser());
        }
        if (insElderContractCostStandard.getUpdateTime() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getUpdateTime, insElderContractCostStandard.getUpdateTime());
        }
        if (insElderContractCostStandard.getIsDeleted() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getIsDeleted, insElderContractCostStandard.getIsDeleted());
        }
        if (insElderContractCostStandard.getStatus() != null) {
            queryWrapper.eq(InsElderContractCostStandard::getStatus, insElderContractCostStandard.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderContractCostStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderContractCostStandard insert(InsElderContractCostStandard insElderContractCostStandard) {
        insElderContractCostStandard.setId(null);
        getBaseMapper().insert(insElderContractCostStandard);
        return insElderContractCostStandard;
    }

    /**
    * 更新数据
    *
    * @param insElderContractCostStandard 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderContractCostStandard update(InsElderContractCostStandard insElderContractCostStandard) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderContractCostStandard> chainWrapper = new LambdaUpdateChainWrapper<InsElderContractCostStandard>(getBaseMapper());
        if (insElderContractCostStandard.getId() != null) {
            chainWrapper.set(InsElderContractCostStandard::getId, insElderContractCostStandard.getId());
        }
        if (StringUtil.isNotBlank(insElderContractCostStandard.getTenantId())) {
            chainWrapper.set(InsElderContractCostStandard::getTenantId, insElderContractCostStandard.getTenantId());
        }
        if (insElderContractCostStandard.getCorpId() != null) {
            chainWrapper.set(InsElderContractCostStandard::getCorpId, insElderContractCostStandard.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderContractCostStandard.getCorpName())) {
            chainWrapper.set(InsElderContractCostStandard::getCorpName, insElderContractCostStandard.getCorpName());
        }
        if (insElderContractCostStandard.getInstitutionId() != null) {
            chainWrapper.set(InsElderContractCostStandard::getInstitutionId, insElderContractCostStandard.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderContractCostStandard.getInstitutionName())) {
            chainWrapper.set(InsElderContractCostStandard::getInstitutionName, insElderContractCostStandard.getInstitutionName());
        }
        if (insElderContractCostStandard.getCheckId() != null) {
            chainWrapper.set(InsElderContractCostStandard::getCheckId, insElderContractCostStandard.getCheckId());
        }
        if (insElderContractCostStandard.getCheckDate() != null) {
            chainWrapper.set(InsElderContractCostStandard::getCheckDate, insElderContractCostStandard.getCheckDate());
        }
        if (insElderContractCostStandard.getElderId() != null) {
            chainWrapper.set(InsElderContractCostStandard::getElderId, insElderContractCostStandard.getElderId());
        }
        if (StringUtil.isNotBlank(insElderContractCostStandard.getElderName())) {
            chainWrapper.set(InsElderContractCostStandard::getElderName, insElderContractCostStandard.getElderName());
        }
        if (StringUtil.isNotBlank(insElderContractCostStandard.getIdCard())) {
            chainWrapper.set(InsElderContractCostStandard::getIdCard, insElderContractCostStandard.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderContractCostStandard.getSex())) {
            chainWrapper.set(InsElderContractCostStandard::getSex, insElderContractCostStandard.getSex());
        }
        if (insElderContractCostStandard.getContractId() != null) {
            chainWrapper.set(InsElderContractCostStandard::getContractId, insElderContractCostStandard.getContractId());
        }
        if (insElderContractCostStandard.getCostType() != null) {
            chainWrapper.set(InsElderContractCostStandard::getCostType, insElderContractCostStandard.getCostType());
        }
        if (insElderContractCostStandard.getCostId() != null) {
            chainWrapper.set(InsElderContractCostStandard::getCostId, insElderContractCostStandard.getCostId());
        }
        if (insElderContractCostStandard.getItemId() != null) {
            chainWrapper.set(InsElderContractCostStandard::getItemId, insElderContractCostStandard.getItemId());
        }
        if (StringUtil.isNotBlank(insElderContractCostStandard.getItemName())) {
            chainWrapper.set(InsElderContractCostStandard::getItemName, insElderContractCostStandard.getItemName());
        }
        if (insElderContractCostStandard.getItemPrice() != null) {
            chainWrapper.set(InsElderContractCostStandard::getItemPrice, insElderContractCostStandard.getItemPrice());
        }
        if (insElderContractCostStandard.getDiscountedPrice() != null) {
            chainWrapper.set(InsElderContractCostStandard::getDiscountedPrice, insElderContractCostStandard.getDiscountedPrice());
        }
        if (insElderContractCostStandard.getDiscountRate() != null) {
            chainWrapper.set(InsElderContractCostStandard::getDiscountRate, insElderContractCostStandard.getDiscountRate());
        }
        if (insElderContractCostStandard.getCostMode() != null) {
            chainWrapper.set(InsElderContractCostStandard::getCostMode, insElderContractCostStandard.getCostMode());
        }
        if (StringUtil.isNotBlank(insElderContractCostStandard.getRemark())) {
            chainWrapper.set(InsElderContractCostStandard::getRemark, insElderContractCostStandard.getRemark());
        }
        if (insElderContractCostStandard.getCreateUser() != null) {
            chainWrapper.set(InsElderContractCostStandard::getCreateUser, insElderContractCostStandard.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderContractCostStandard.getCreateName())) {
            chainWrapper.set(InsElderContractCostStandard::getCreateName, insElderContractCostStandard.getCreateName());
        }
        if (insElderContractCostStandard.getCreateDept() != null) {
            chainWrapper.set(InsElderContractCostStandard::getCreateDept, insElderContractCostStandard.getCreateDept());
        }
        if (insElderContractCostStandard.getCreateTime() != null) {
            chainWrapper.set(InsElderContractCostStandard::getCreateTime, insElderContractCostStandard.getCreateTime());
        }
        if (insElderContractCostStandard.getUpdateUser() != null) {
            chainWrapper.set(InsElderContractCostStandard::getUpdateUser, insElderContractCostStandard.getUpdateUser());
        }
        if (insElderContractCostStandard.getUpdateTime() != null) {
            chainWrapper.set(InsElderContractCostStandard::getUpdateTime, insElderContractCostStandard.getUpdateTime());
        }
        if (insElderContractCostStandard.getIsDeleted() != null) {
            chainWrapper.set(InsElderContractCostStandard::getIsDeleted, insElderContractCostStandard.getIsDeleted());
        }
        if (insElderContractCostStandard.getStatus() != null) {
            chainWrapper.set(InsElderContractCostStandard::getStatus, insElderContractCostStandard.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderContractCostStandard::getId, insElderContractCostStandard.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderContractCostStandard.getId());
        } else {
            return insElderContractCostStandard;
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
    public boolean saveInsElderContractCostStandardBatch(List<InsElderContractCostStandard> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderContractCostStandard insElderContractCostStandard : insertList) {
            //使用默认的雪花算法生成
            insElderContractCostStandard.setId(null);
            //insElderContractCostStandard.setCreatedDt(currentDte);
            //insElderContractCostStandard.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderContractCostStandardBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderContractCostStandard> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


