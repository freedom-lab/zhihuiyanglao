package cn.pluss.platform.service.insLogisticsInventoryCheck.impl;

import cn.pluss.platform.mapper.InsLogisticsInventoryCheckMapper;
import cn.pluss.platform.model.entity.InsLogisticsInventoryCheck;
import cn.pluss.platform.service.insLogisticsInventoryCheck.InsLogisticsInventoryCheckService;
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
@Service("insLogisticsInventoryCheckService")
public class InsLogisticsInventoryCheckServiceImpl extends ServiceImpl< InsLogisticsInventoryCheckMapper, InsLogisticsInventoryCheck> implements InsLogisticsInventoryCheckService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsInventoryCheckServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsInventoryCheck> queryPage(Map map) {
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
    public InsLogisticsInventoryCheck queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsInventoryCheck 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsInventoryCheck queryOne(InsLogisticsInventoryCheck insLogisticsInventoryCheck){
        LambdaQueryWrapper<InsLogisticsInventoryCheck> queryWrapper = getQueryWrapper(insLogisticsInventoryCheck);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsInventoryCheck
    * @return
    */
    @Override
    public List<InsLogisticsInventoryCheck> queryList(InsLogisticsInventoryCheck insLogisticsInventoryCheck) {
        LambdaQueryWrapper<InsLogisticsInventoryCheck> queryWrapper = getQueryWrapper(insLogisticsInventoryCheck);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsInventoryCheck
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsInventoryCheck> getQueryWrapper(InsLogisticsInventoryCheck insLogisticsInventoryCheck){
        LambdaQueryWrapper<InsLogisticsInventoryCheck> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsInventoryCheck.getId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getId, insLogisticsInventoryCheck.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheck.getTenantId())) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getTenantId, insLogisticsInventoryCheck.getTenantId());
        }
        if (insLogisticsInventoryCheck.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getCorpId, insLogisticsInventoryCheck.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheck.getCorpName())) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getCorpName, insLogisticsInventoryCheck.getCorpName());
        }
        if (insLogisticsInventoryCheck.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getInstitutionId, insLogisticsInventoryCheck.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheck.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getInstitutionName, insLogisticsInventoryCheck.getInstitutionName());
        }
        if (insLogisticsInventoryCheck.getCheckDate() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getCheckDate, insLogisticsInventoryCheck.getCheckDate());
        }
        if (insLogisticsInventoryCheck.getWarehouseId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getWarehouseId, insLogisticsInventoryCheck.getWarehouseId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheck.getWarehouseName())) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getWarehouseName, insLogisticsInventoryCheck.getWarehouseName());
        }
        if (insLogisticsInventoryCheck.getStaffId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getStaffId, insLogisticsInventoryCheck.getStaffId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheck.getStaffName())) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getStaffName, insLogisticsInventoryCheck.getStaffName());
        }
        if (insLogisticsInventoryCheck.getCheckState() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getCheckState, insLogisticsInventoryCheck.getCheckState());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheck.getRemark())) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getRemark, insLogisticsInventoryCheck.getRemark());
        }
        if (insLogisticsInventoryCheck.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getCreateUser, insLogisticsInventoryCheck.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheck.getCreateName())) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getCreateName, insLogisticsInventoryCheck.getCreateName());
        }
        if (insLogisticsInventoryCheck.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getCreateDept, insLogisticsInventoryCheck.getCreateDept());
        }
        if (insLogisticsInventoryCheck.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getCreateTime, insLogisticsInventoryCheck.getCreateTime());
        }
        if (insLogisticsInventoryCheck.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getUpdateUser, insLogisticsInventoryCheck.getUpdateUser());
        }
        if (insLogisticsInventoryCheck.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getUpdateTime, insLogisticsInventoryCheck.getUpdateTime());
        }
        if (insLogisticsInventoryCheck.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getIsDeleted, insLogisticsInventoryCheck.getIsDeleted());
        }
        if (insLogisticsInventoryCheck.getStatus() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheck::getStatus, insLogisticsInventoryCheck.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsInventoryCheck 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsInventoryCheck insert(InsLogisticsInventoryCheck insLogisticsInventoryCheck) {
        insLogisticsInventoryCheck.setId(null);
        getBaseMapper().insert(insLogisticsInventoryCheck);
        return insLogisticsInventoryCheck;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsInventoryCheck 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsInventoryCheck update(InsLogisticsInventoryCheck insLogisticsInventoryCheck) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsInventoryCheck> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsInventoryCheck>(getBaseMapper());
        if (insLogisticsInventoryCheck.getId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getId, insLogisticsInventoryCheck.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheck.getTenantId())) {
            chainWrapper.set(InsLogisticsInventoryCheck::getTenantId, insLogisticsInventoryCheck.getTenantId());
        }
        if (insLogisticsInventoryCheck.getCorpId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getCorpId, insLogisticsInventoryCheck.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheck.getCorpName())) {
            chainWrapper.set(InsLogisticsInventoryCheck::getCorpName, insLogisticsInventoryCheck.getCorpName());
        }
        if (insLogisticsInventoryCheck.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getInstitutionId, insLogisticsInventoryCheck.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheck.getInstitutionName())) {
            chainWrapper.set(InsLogisticsInventoryCheck::getInstitutionName, insLogisticsInventoryCheck.getInstitutionName());
        }
        if (insLogisticsInventoryCheck.getCheckDate() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getCheckDate, insLogisticsInventoryCheck.getCheckDate());
        }
        if (insLogisticsInventoryCheck.getWarehouseId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getWarehouseId, insLogisticsInventoryCheck.getWarehouseId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheck.getWarehouseName())) {
            chainWrapper.set(InsLogisticsInventoryCheck::getWarehouseName, insLogisticsInventoryCheck.getWarehouseName());
        }
        if (insLogisticsInventoryCheck.getStaffId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getStaffId, insLogisticsInventoryCheck.getStaffId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheck.getStaffName())) {
            chainWrapper.set(InsLogisticsInventoryCheck::getStaffName, insLogisticsInventoryCheck.getStaffName());
        }
        if (insLogisticsInventoryCheck.getCheckState() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getCheckState, insLogisticsInventoryCheck.getCheckState());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheck.getRemark())) {
            chainWrapper.set(InsLogisticsInventoryCheck::getRemark, insLogisticsInventoryCheck.getRemark());
        }
        if (insLogisticsInventoryCheck.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getCreateUser, insLogisticsInventoryCheck.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheck.getCreateName())) {
            chainWrapper.set(InsLogisticsInventoryCheck::getCreateName, insLogisticsInventoryCheck.getCreateName());
        }
        if (insLogisticsInventoryCheck.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getCreateDept, insLogisticsInventoryCheck.getCreateDept());
        }
        if (insLogisticsInventoryCheck.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getCreateTime, insLogisticsInventoryCheck.getCreateTime());
        }
        if (insLogisticsInventoryCheck.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getUpdateUser, insLogisticsInventoryCheck.getUpdateUser());
        }
        if (insLogisticsInventoryCheck.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getUpdateTime, insLogisticsInventoryCheck.getUpdateTime());
        }
        if (insLogisticsInventoryCheck.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getIsDeleted, insLogisticsInventoryCheck.getIsDeleted());
        }
        if (insLogisticsInventoryCheck.getStatus() != null) {
            chainWrapper.set(InsLogisticsInventoryCheck::getStatus, insLogisticsInventoryCheck.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsInventoryCheck::getId, insLogisticsInventoryCheck.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsInventoryCheck.getId());
        } else {
            return insLogisticsInventoryCheck;
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
    public boolean saveInsLogisticsInventoryCheckBatch(List<InsLogisticsInventoryCheck> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsInventoryCheck insLogisticsInventoryCheck : insertList) {
            //使用默认的雪花算法生成
            insLogisticsInventoryCheck.setId(null);
            //insLogisticsInventoryCheck.setCreatedDt(currentDte);
            //insLogisticsInventoryCheck.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsInventoryCheckBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsInventoryCheck> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


