package cn.pluss.platform.service.insLogisticsInventoryInfo.impl;

import cn.pluss.platform.mapper.InsLogisticsInventoryInfoMapper;
import cn.pluss.platform.model.entity.InsLogisticsInventoryInfo;
import cn.pluss.platform.service.insLogisticsInventoryInfo.InsLogisticsInventoryInfoService;
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
@Service("insLogisticsInventoryInfoService")
public class InsLogisticsInventoryInfoServiceImpl extends ServiceImpl< InsLogisticsInventoryInfoMapper, InsLogisticsInventoryInfo> implements InsLogisticsInventoryInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsInventoryInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsInventoryInfo> queryPage(Map map) {
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
    public InsLogisticsInventoryInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsInventoryInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsInventoryInfo queryOne(InsLogisticsInventoryInfo insLogisticsInventoryInfo){
        LambdaQueryWrapper<InsLogisticsInventoryInfo> queryWrapper = getQueryWrapper(insLogisticsInventoryInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsInventoryInfo
    * @return
    */
    @Override
    public List<InsLogisticsInventoryInfo> queryList(InsLogisticsInventoryInfo insLogisticsInventoryInfo) {
        LambdaQueryWrapper<InsLogisticsInventoryInfo> queryWrapper = getQueryWrapper(insLogisticsInventoryInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsInventoryInfo
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsInventoryInfo> getQueryWrapper(InsLogisticsInventoryInfo insLogisticsInventoryInfo){
        LambdaQueryWrapper<InsLogisticsInventoryInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsInventoryInfo.getId() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getId, insLogisticsInventoryInfo.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getTenantId())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getTenantId, insLogisticsInventoryInfo.getTenantId());
        }
        if (insLogisticsInventoryInfo.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getCorpId, insLogisticsInventoryInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getCorpName())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getCorpName, insLogisticsInventoryInfo.getCorpName());
        }
        if (insLogisticsInventoryInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getInstitutionId, insLogisticsInventoryInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getInstitutionName, insLogisticsInventoryInfo.getInstitutionName());
        }
        if (insLogisticsInventoryInfo.getWarehouseId() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getWarehouseId, insLogisticsInventoryInfo.getWarehouseId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getWarehouseName())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getWarehouseName, insLogisticsInventoryInfo.getWarehouseName());
        }
        if (insLogisticsInventoryInfo.getGoodsId() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getGoodsId, insLogisticsInventoryInfo.getGoodsId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getGoodsName())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getGoodsName, insLogisticsInventoryInfo.getGoodsName());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getGoodsCode())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getGoodsCode, insLogisticsInventoryInfo.getGoodsCode());
        }
        if (insLogisticsInventoryInfo.getTypeId() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getTypeId, insLogisticsInventoryInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getTypeName())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getTypeName, insLogisticsInventoryInfo.getTypeName());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getGoodsUnit())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getGoodsUnit, insLogisticsInventoryInfo.getGoodsUnit());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getGoodsStandards())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getGoodsStandards, insLogisticsInventoryInfo.getGoodsStandards());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getBarCode())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getBarCode, insLogisticsInventoryInfo.getBarCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getManufactorName())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getManufactorName, insLogisticsInventoryInfo.getManufactorName());
        }
        if (insLogisticsInventoryInfo.getGoodsPrice() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getGoodsPrice, insLogisticsInventoryInfo.getGoodsPrice());
        }
        if (insLogisticsInventoryInfo.getSellingPrice() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getSellingPrice, insLogisticsInventoryInfo.getSellingPrice());
        }
        if (insLogisticsInventoryInfo.getStockNum() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getStockNum, insLogisticsInventoryInfo.getStockNum());
        }
        if (insLogisticsInventoryInfo.getInNum() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getInNum, insLogisticsInventoryInfo.getInNum());
        }
        if (insLogisticsInventoryInfo.getOutNum() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getOutNum, insLogisticsInventoryInfo.getOutNum());
        }
        if (insLogisticsInventoryInfo.getStockAmount() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getStockAmount, insLogisticsInventoryInfo.getStockAmount());
        }
        if (insLogisticsInventoryInfo.getSellingAmount() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getSellingAmount, insLogisticsInventoryInfo.getSellingAmount());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getRemark())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getRemark, insLogisticsInventoryInfo.getRemark());
        }
        if (insLogisticsInventoryInfo.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getCreateUser, insLogisticsInventoryInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryInfo.getCreateName())) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getCreateName, insLogisticsInventoryInfo.getCreateName());
        }
        if (insLogisticsInventoryInfo.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getCreateDept, insLogisticsInventoryInfo.getCreateDept());
        }
        if (insLogisticsInventoryInfo.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getCreateTime, insLogisticsInventoryInfo.getCreateTime());
        }
        if (insLogisticsInventoryInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getUpdateUser, insLogisticsInventoryInfo.getUpdateUser());
        }
        if (insLogisticsInventoryInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getUpdateTime, insLogisticsInventoryInfo.getUpdateTime());
        }
        if (insLogisticsInventoryInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getIsDeleted, insLogisticsInventoryInfo.getIsDeleted());
        }
        if (insLogisticsInventoryInfo.getStatus() != null) {
            queryWrapper.eq(InsLogisticsInventoryInfo::getStatus, insLogisticsInventoryInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsInventoryInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsInventoryInfo insert(InsLogisticsInventoryInfo insLogisticsInventoryInfo) {
        insLogisticsInventoryInfo.setId(null);
        getBaseMapper().insert(insLogisticsInventoryInfo);
        return insLogisticsInventoryInfo;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsInventoryInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsInventoryInfo update(InsLogisticsInventoryInfo insLogisticsInventoryInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsInventoryInfo> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsInventoryInfo>(getBaseMapper());
        if (insLogisticsInventoryInfo.getId() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getId, insLogisticsInventoryInfo.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getTenantId())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getTenantId, insLogisticsInventoryInfo.getTenantId());
        }
        if (insLogisticsInventoryInfo.getCorpId() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getCorpId, insLogisticsInventoryInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getCorpName())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getCorpName, insLogisticsInventoryInfo.getCorpName());
        }
        if (insLogisticsInventoryInfo.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getInstitutionId, insLogisticsInventoryInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getInstitutionName())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getInstitutionName, insLogisticsInventoryInfo.getInstitutionName());
        }
        if (insLogisticsInventoryInfo.getWarehouseId() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getWarehouseId, insLogisticsInventoryInfo.getWarehouseId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getWarehouseName())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getWarehouseName, insLogisticsInventoryInfo.getWarehouseName());
        }
        if (insLogisticsInventoryInfo.getGoodsId() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getGoodsId, insLogisticsInventoryInfo.getGoodsId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getGoodsName())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getGoodsName, insLogisticsInventoryInfo.getGoodsName());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getGoodsCode())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getGoodsCode, insLogisticsInventoryInfo.getGoodsCode());
        }
        if (insLogisticsInventoryInfo.getTypeId() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getTypeId, insLogisticsInventoryInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getTypeName())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getTypeName, insLogisticsInventoryInfo.getTypeName());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getGoodsUnit())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getGoodsUnit, insLogisticsInventoryInfo.getGoodsUnit());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getGoodsStandards())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getGoodsStandards, insLogisticsInventoryInfo.getGoodsStandards());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getBarCode())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getBarCode, insLogisticsInventoryInfo.getBarCode());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getManufactorName())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getManufactorName, insLogisticsInventoryInfo.getManufactorName());
        }
        if (insLogisticsInventoryInfo.getGoodsPrice() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getGoodsPrice, insLogisticsInventoryInfo.getGoodsPrice());
        }
        if (insLogisticsInventoryInfo.getSellingPrice() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getSellingPrice, insLogisticsInventoryInfo.getSellingPrice());
        }
        if (insLogisticsInventoryInfo.getStockNum() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getStockNum, insLogisticsInventoryInfo.getStockNum());
        }
        if (insLogisticsInventoryInfo.getInNum() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getInNum, insLogisticsInventoryInfo.getInNum());
        }
        if (insLogisticsInventoryInfo.getOutNum() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getOutNum, insLogisticsInventoryInfo.getOutNum());
        }
        if (insLogisticsInventoryInfo.getStockAmount() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getStockAmount, insLogisticsInventoryInfo.getStockAmount());
        }
        if (insLogisticsInventoryInfo.getSellingAmount() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getSellingAmount, insLogisticsInventoryInfo.getSellingAmount());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getRemark())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getRemark, insLogisticsInventoryInfo.getRemark());
        }
        if (insLogisticsInventoryInfo.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getCreateUser, insLogisticsInventoryInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryInfo.getCreateName())) {
            chainWrapper.set(InsLogisticsInventoryInfo::getCreateName, insLogisticsInventoryInfo.getCreateName());
        }
        if (insLogisticsInventoryInfo.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getCreateDept, insLogisticsInventoryInfo.getCreateDept());
        }
        if (insLogisticsInventoryInfo.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getCreateTime, insLogisticsInventoryInfo.getCreateTime());
        }
        if (insLogisticsInventoryInfo.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getUpdateUser, insLogisticsInventoryInfo.getUpdateUser());
        }
        if (insLogisticsInventoryInfo.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getUpdateTime, insLogisticsInventoryInfo.getUpdateTime());
        }
        if (insLogisticsInventoryInfo.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getIsDeleted, insLogisticsInventoryInfo.getIsDeleted());
        }
        if (insLogisticsInventoryInfo.getStatus() != null) {
            chainWrapper.set(InsLogisticsInventoryInfo::getStatus, insLogisticsInventoryInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsInventoryInfo::getId, insLogisticsInventoryInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsInventoryInfo.getId());
        } else {
            return insLogisticsInventoryInfo;
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
    public boolean saveInsLogisticsInventoryInfoBatch(List<InsLogisticsInventoryInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsInventoryInfo insLogisticsInventoryInfo : insertList) {
            //使用默认的雪花算法生成
            insLogisticsInventoryInfo.setId(null);
            //insLogisticsInventoryInfo.setCreatedDt(currentDte);
            //insLogisticsInventoryInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsInventoryInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsInventoryInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


