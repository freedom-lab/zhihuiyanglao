package cn.pluss.platform.service.insLogisticsInventoryAdjust.impl;

import cn.pluss.platform.mapper.InsLogisticsInventoryAdjustMapper;
import cn.pluss.platform.model.entity.InsLogisticsInventoryAdjust;
import cn.pluss.platform.service.insLogisticsInventoryAdjust.InsLogisticsInventoryAdjustService;
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
@Service("insLogisticsInventoryAdjustService")
public class InsLogisticsInventoryAdjustServiceImpl extends ServiceImpl< InsLogisticsInventoryAdjustMapper, InsLogisticsInventoryAdjust> implements InsLogisticsInventoryAdjustService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsInventoryAdjustServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsInventoryAdjust> queryPage(Map map) {
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
    public InsLogisticsInventoryAdjust queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsInventoryAdjust 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsInventoryAdjust queryOne(InsLogisticsInventoryAdjust insLogisticsInventoryAdjust){
        LambdaQueryWrapper<InsLogisticsInventoryAdjust> queryWrapper = getQueryWrapper(insLogisticsInventoryAdjust);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsInventoryAdjust
    * @return
    */
    @Override
    public List<InsLogisticsInventoryAdjust> queryList(InsLogisticsInventoryAdjust insLogisticsInventoryAdjust) {
        LambdaQueryWrapper<InsLogisticsInventoryAdjust> queryWrapper = getQueryWrapper(insLogisticsInventoryAdjust);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsInventoryAdjust
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsInventoryAdjust> getQueryWrapper(InsLogisticsInventoryAdjust insLogisticsInventoryAdjust){
        LambdaQueryWrapper<InsLogisticsInventoryAdjust> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsInventoryAdjust.getId() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getId, insLogisticsInventoryAdjust.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryAdjust.getTenantId())) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getTenantId, insLogisticsInventoryAdjust.getTenantId());
        }
        if (insLogisticsInventoryAdjust.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getCorpId, insLogisticsInventoryAdjust.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryAdjust.getCorpName())) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getCorpName, insLogisticsInventoryAdjust.getCorpName());
        }
        if (insLogisticsInventoryAdjust.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getInstitutionId, insLogisticsInventoryAdjust.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryAdjust.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getInstitutionName, insLogisticsInventoryAdjust.getInstitutionName());
        }
        if (insLogisticsInventoryAdjust.getAdjustDate() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getAdjustDate, insLogisticsInventoryAdjust.getAdjustDate());
        }
        if (insLogisticsInventoryAdjust.getWarehouseId() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getWarehouseId, insLogisticsInventoryAdjust.getWarehouseId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryAdjust.getWarehouseName())) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getWarehouseName, insLogisticsInventoryAdjust.getWarehouseName());
        }
        if (insLogisticsInventoryAdjust.getGoodsId() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getGoodsId, insLogisticsInventoryAdjust.getGoodsId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryAdjust.getGoodsName())) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getGoodsName, insLogisticsInventoryAdjust.getGoodsName());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryAdjust.getGoodsCode())) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getGoodsCode, insLogisticsInventoryAdjust.getGoodsCode());
        }
        if (insLogisticsInventoryAdjust.getOldStockNum() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getOldStockNum, insLogisticsInventoryAdjust.getOldStockNum());
        }
        if (insLogisticsInventoryAdjust.getAdjustNum() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getAdjustNum, insLogisticsInventoryAdjust.getAdjustNum());
        }
        if (insLogisticsInventoryAdjust.getNewStockNum() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getNewStockNum, insLogisticsInventoryAdjust.getNewStockNum());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryAdjust.getAdjustMemo())) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getAdjustMemo, insLogisticsInventoryAdjust.getAdjustMemo());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryAdjust.getRemark())) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getRemark, insLogisticsInventoryAdjust.getRemark());
        }
        if (insLogisticsInventoryAdjust.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getCreateUser, insLogisticsInventoryAdjust.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryAdjust.getCreateName())) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getCreateName, insLogisticsInventoryAdjust.getCreateName());
        }
        if (insLogisticsInventoryAdjust.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getCreateDept, insLogisticsInventoryAdjust.getCreateDept());
        }
        if (insLogisticsInventoryAdjust.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getCreateTime, insLogisticsInventoryAdjust.getCreateTime());
        }
        if (insLogisticsInventoryAdjust.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getUpdateUser, insLogisticsInventoryAdjust.getUpdateUser());
        }
        if (insLogisticsInventoryAdjust.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getUpdateTime, insLogisticsInventoryAdjust.getUpdateTime());
        }
        if (insLogisticsInventoryAdjust.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getIsDeleted, insLogisticsInventoryAdjust.getIsDeleted());
        }
        if (insLogisticsInventoryAdjust.getStatus() != null) {
            queryWrapper.eq(InsLogisticsInventoryAdjust::getStatus, insLogisticsInventoryAdjust.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsInventoryAdjust 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsInventoryAdjust insert(InsLogisticsInventoryAdjust insLogisticsInventoryAdjust) {
        insLogisticsInventoryAdjust.setId(null);
        getBaseMapper().insert(insLogisticsInventoryAdjust);
        return insLogisticsInventoryAdjust;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsInventoryAdjust 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsInventoryAdjust update(InsLogisticsInventoryAdjust insLogisticsInventoryAdjust) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsInventoryAdjust> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsInventoryAdjust>(getBaseMapper());
        if (insLogisticsInventoryAdjust.getId() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getId, insLogisticsInventoryAdjust.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryAdjust.getTenantId())) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getTenantId, insLogisticsInventoryAdjust.getTenantId());
        }
        if (insLogisticsInventoryAdjust.getCorpId() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getCorpId, insLogisticsInventoryAdjust.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryAdjust.getCorpName())) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getCorpName, insLogisticsInventoryAdjust.getCorpName());
        }
        if (insLogisticsInventoryAdjust.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getInstitutionId, insLogisticsInventoryAdjust.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryAdjust.getInstitutionName())) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getInstitutionName, insLogisticsInventoryAdjust.getInstitutionName());
        }
        if (insLogisticsInventoryAdjust.getAdjustDate() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getAdjustDate, insLogisticsInventoryAdjust.getAdjustDate());
        }
        if (insLogisticsInventoryAdjust.getWarehouseId() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getWarehouseId, insLogisticsInventoryAdjust.getWarehouseId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryAdjust.getWarehouseName())) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getWarehouseName, insLogisticsInventoryAdjust.getWarehouseName());
        }
        if (insLogisticsInventoryAdjust.getGoodsId() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getGoodsId, insLogisticsInventoryAdjust.getGoodsId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryAdjust.getGoodsName())) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getGoodsName, insLogisticsInventoryAdjust.getGoodsName());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryAdjust.getGoodsCode())) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getGoodsCode, insLogisticsInventoryAdjust.getGoodsCode());
        }
        if (insLogisticsInventoryAdjust.getOldStockNum() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getOldStockNum, insLogisticsInventoryAdjust.getOldStockNum());
        }
        if (insLogisticsInventoryAdjust.getAdjustNum() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getAdjustNum, insLogisticsInventoryAdjust.getAdjustNum());
        }
        if (insLogisticsInventoryAdjust.getNewStockNum() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getNewStockNum, insLogisticsInventoryAdjust.getNewStockNum());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryAdjust.getAdjustMemo())) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getAdjustMemo, insLogisticsInventoryAdjust.getAdjustMemo());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryAdjust.getRemark())) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getRemark, insLogisticsInventoryAdjust.getRemark());
        }
        if (insLogisticsInventoryAdjust.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getCreateUser, insLogisticsInventoryAdjust.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryAdjust.getCreateName())) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getCreateName, insLogisticsInventoryAdjust.getCreateName());
        }
        if (insLogisticsInventoryAdjust.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getCreateDept, insLogisticsInventoryAdjust.getCreateDept());
        }
        if (insLogisticsInventoryAdjust.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getCreateTime, insLogisticsInventoryAdjust.getCreateTime());
        }
        if (insLogisticsInventoryAdjust.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getUpdateUser, insLogisticsInventoryAdjust.getUpdateUser());
        }
        if (insLogisticsInventoryAdjust.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getUpdateTime, insLogisticsInventoryAdjust.getUpdateTime());
        }
        if (insLogisticsInventoryAdjust.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getIsDeleted, insLogisticsInventoryAdjust.getIsDeleted());
        }
        if (insLogisticsInventoryAdjust.getStatus() != null) {
            chainWrapper.set(InsLogisticsInventoryAdjust::getStatus, insLogisticsInventoryAdjust.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsInventoryAdjust::getId, insLogisticsInventoryAdjust.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsInventoryAdjust.getId());
        } else {
            return insLogisticsInventoryAdjust;
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
    public boolean saveInsLogisticsInventoryAdjustBatch(List<InsLogisticsInventoryAdjust> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsInventoryAdjust insLogisticsInventoryAdjust : insertList) {
            //使用默认的雪花算法生成
            insLogisticsInventoryAdjust.setId(null);
            //insLogisticsInventoryAdjust.setCreatedDt(currentDte);
            //insLogisticsInventoryAdjust.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsInventoryAdjustBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsInventoryAdjust> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


