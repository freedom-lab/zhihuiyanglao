package cn.pluss.platform.service.insMedicalDrugInventory.impl;

import cn.pluss.platform.mapper.InsMedicalDrugInventoryMapper;
import cn.pluss.platform.model.entity.InsMedicalDrugInventory;
import cn.pluss.platform.service.insMedicalDrugInventory.InsMedicalDrugInventoryService;
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
@Service("insMedicalDrugInventoryService")
public class InsMedicalDrugInventoryServiceImpl extends ServiceImpl< InsMedicalDrugInventoryMapper, InsMedicalDrugInventory> implements InsMedicalDrugInventoryService {
    private static final Logger logger = LoggerFactory.getLogger(InsMedicalDrugInventoryServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsMedicalDrugInventory> queryPage(Map map) {
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
    public InsMedicalDrugInventory queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalDrugInventory 实例对象
    * @return 实例对象
    */
    @Override
    public InsMedicalDrugInventory queryOne(InsMedicalDrugInventory insMedicalDrugInventory){
        LambdaQueryWrapper<InsMedicalDrugInventory> queryWrapper = getQueryWrapper(insMedicalDrugInventory);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalDrugInventory
    * @return
    */
    @Override
    public List<InsMedicalDrugInventory> queryList(InsMedicalDrugInventory insMedicalDrugInventory) {
        LambdaQueryWrapper<InsMedicalDrugInventory> queryWrapper = getQueryWrapper(insMedicalDrugInventory);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insMedicalDrugInventory
    * @return
    */
    public static LambdaQueryWrapper<InsMedicalDrugInventory> getQueryWrapper(InsMedicalDrugInventory insMedicalDrugInventory){
        LambdaQueryWrapper<InsMedicalDrugInventory> queryWrapper = new LambdaQueryWrapper<>();
        if (insMedicalDrugInventory.getId() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getId, insMedicalDrugInventory.getId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInventory.getTenantId())) {
            queryWrapper.eq(InsMedicalDrugInventory::getTenantId, insMedicalDrugInventory.getTenantId());
        }
        if (insMedicalDrugInventory.getCorpId() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getCorpId, insMedicalDrugInventory.getCorpId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInventory.getCorpName())) {
            queryWrapper.eq(InsMedicalDrugInventory::getCorpName, insMedicalDrugInventory.getCorpName());
        }
        if (insMedicalDrugInventory.getInstitutionId() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getInstitutionId, insMedicalDrugInventory.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInventory.getInstitutionName())) {
            queryWrapper.eq(InsMedicalDrugInventory::getInstitutionName, insMedicalDrugInventory.getInstitutionName());
        }
        if (insMedicalDrugInventory.getDrugId() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getDrugId, insMedicalDrugInventory.getDrugId());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInventory.getDrugName())) {
            queryWrapper.eq(InsMedicalDrugInventory::getDrugName, insMedicalDrugInventory.getDrugName());
        }
        if (insMedicalDrugInventory.getTotalNum() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getTotalNum, insMedicalDrugInventory.getTotalNum());
        }
        if (insMedicalDrugInventory.getUseNum() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getUseNum, insMedicalDrugInventory.getUseNum());
        }
        if (insMedicalDrugInventory.getRemainingNum() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getRemainingNum, insMedicalDrugInventory.getRemainingNum());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInventory.getRemark())) {
            queryWrapper.eq(InsMedicalDrugInventory::getRemark, insMedicalDrugInventory.getRemark());
        }
        if (insMedicalDrugInventory.getCreateUser() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getCreateUser, insMedicalDrugInventory.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insMedicalDrugInventory.getCreateName())) {
            queryWrapper.eq(InsMedicalDrugInventory::getCreateName, insMedicalDrugInventory.getCreateName());
        }
        if (insMedicalDrugInventory.getCreateDept() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getCreateDept, insMedicalDrugInventory.getCreateDept());
        }
        if (insMedicalDrugInventory.getCreateTime() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getCreateTime, insMedicalDrugInventory.getCreateTime());
        }
        if (insMedicalDrugInventory.getUpdateUser() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getUpdateUser, insMedicalDrugInventory.getUpdateUser());
        }
        if (insMedicalDrugInventory.getUpdateTime() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getUpdateTime, insMedicalDrugInventory.getUpdateTime());
        }
        if (insMedicalDrugInventory.getIsDeleted() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getIsDeleted, insMedicalDrugInventory.getIsDeleted());
        }
        if (insMedicalDrugInventory.getStatus() != null) {
            queryWrapper.eq(InsMedicalDrugInventory::getStatus, insMedicalDrugInventory.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insMedicalDrugInventory 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalDrugInventory insert(InsMedicalDrugInventory insMedicalDrugInventory) {
        insMedicalDrugInventory.setId(null);
        getBaseMapper().insert(insMedicalDrugInventory);
        return insMedicalDrugInventory;
    }

    /**
    * 更新数据
    *
    * @param insMedicalDrugInventory 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalDrugInventory update(InsMedicalDrugInventory insMedicalDrugInventory) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsMedicalDrugInventory> chainWrapper = new LambdaUpdateChainWrapper<InsMedicalDrugInventory>(getBaseMapper());
        if (insMedicalDrugInventory.getId() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getId, insMedicalDrugInventory.getId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInventory.getTenantId())) {
            chainWrapper.set(InsMedicalDrugInventory::getTenantId, insMedicalDrugInventory.getTenantId());
        }
        if (insMedicalDrugInventory.getCorpId() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getCorpId, insMedicalDrugInventory.getCorpId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInventory.getCorpName())) {
            chainWrapper.set(InsMedicalDrugInventory::getCorpName, insMedicalDrugInventory.getCorpName());
        }
        if (insMedicalDrugInventory.getInstitutionId() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getInstitutionId, insMedicalDrugInventory.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInventory.getInstitutionName())) {
            chainWrapper.set(InsMedicalDrugInventory::getInstitutionName, insMedicalDrugInventory.getInstitutionName());
        }
        if (insMedicalDrugInventory.getDrugId() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getDrugId, insMedicalDrugInventory.getDrugId());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInventory.getDrugName())) {
            chainWrapper.set(InsMedicalDrugInventory::getDrugName, insMedicalDrugInventory.getDrugName());
        }
        if (insMedicalDrugInventory.getTotalNum() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getTotalNum, insMedicalDrugInventory.getTotalNum());
        }
        if (insMedicalDrugInventory.getUseNum() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getUseNum, insMedicalDrugInventory.getUseNum());
        }
        if (insMedicalDrugInventory.getRemainingNum() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getRemainingNum, insMedicalDrugInventory.getRemainingNum());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInventory.getRemark())) {
            chainWrapper.set(InsMedicalDrugInventory::getRemark, insMedicalDrugInventory.getRemark());
        }
        if (insMedicalDrugInventory.getCreateUser() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getCreateUser, insMedicalDrugInventory.getCreateUser());
        }
        if (StringUtil.isNotBlank(insMedicalDrugInventory.getCreateName())) {
            chainWrapper.set(InsMedicalDrugInventory::getCreateName, insMedicalDrugInventory.getCreateName());
        }
        if (insMedicalDrugInventory.getCreateDept() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getCreateDept, insMedicalDrugInventory.getCreateDept());
        }
        if (insMedicalDrugInventory.getCreateTime() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getCreateTime, insMedicalDrugInventory.getCreateTime());
        }
        if (insMedicalDrugInventory.getUpdateUser() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getUpdateUser, insMedicalDrugInventory.getUpdateUser());
        }
        if (insMedicalDrugInventory.getUpdateTime() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getUpdateTime, insMedicalDrugInventory.getUpdateTime());
        }
        if (insMedicalDrugInventory.getIsDeleted() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getIsDeleted, insMedicalDrugInventory.getIsDeleted());
        }
        if (insMedicalDrugInventory.getStatus() != null) {
            chainWrapper.set(InsMedicalDrugInventory::getStatus, insMedicalDrugInventory.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsMedicalDrugInventory::getId, insMedicalDrugInventory.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insMedicalDrugInventory.getId());
        } else {
            return insMedicalDrugInventory;
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
    public boolean saveInsMedicalDrugInventoryBatch(List<InsMedicalDrugInventory> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsMedicalDrugInventory insMedicalDrugInventory : insertList) {
            //使用默认的雪花算法生成
            insMedicalDrugInventory.setId(null);
            //insMedicalDrugInventory.setCreatedDt(currentDte);
            //insMedicalDrugInventory.setUpdatedDt(currentDte);
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
    public Integer deleteInsMedicalDrugInventoryBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsMedicalDrugInventory> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


