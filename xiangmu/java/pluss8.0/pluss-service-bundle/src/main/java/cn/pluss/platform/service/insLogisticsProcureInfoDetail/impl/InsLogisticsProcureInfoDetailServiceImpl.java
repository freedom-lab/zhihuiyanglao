package cn.pluss.platform.service.insLogisticsProcureInfoDetail.impl;

import cn.pluss.platform.mapper.InsLogisticsProcureInfoDetailMapper;
import cn.pluss.platform.model.entity.InsLogisticsProcureInfoDetail;
import cn.pluss.platform.service.insLogisticsProcureInfoDetail.InsLogisticsProcureInfoDetailService;
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
@Service("insLogisticsProcureInfoDetailService")
public class InsLogisticsProcureInfoDetailServiceImpl extends ServiceImpl< InsLogisticsProcureInfoDetailMapper, InsLogisticsProcureInfoDetail> implements InsLogisticsProcureInfoDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsProcureInfoDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsProcureInfoDetail> queryPage(Map map) {
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
    public InsLogisticsProcureInfoDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsProcureInfoDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsProcureInfoDetail queryOne(InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail){
        LambdaQueryWrapper<InsLogisticsProcureInfoDetail> queryWrapper = getQueryWrapper(insLogisticsProcureInfoDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsProcureInfoDetail
    * @return
    */
    @Override
    public List<InsLogisticsProcureInfoDetail> queryList(InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail) {
        LambdaQueryWrapper<InsLogisticsProcureInfoDetail> queryWrapper = getQueryWrapper(insLogisticsProcureInfoDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsProcureInfoDetail
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsProcureInfoDetail> getQueryWrapper(InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail){
        LambdaQueryWrapper<InsLogisticsProcureInfoDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsProcureInfoDetail.getId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getId, insLogisticsProcureInfoDetail.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getTenantId())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getTenantId, insLogisticsProcureInfoDetail.getTenantId());
        }
        if (insLogisticsProcureInfoDetail.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getCorpId, insLogisticsProcureInfoDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getCorpName())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getCorpName, insLogisticsProcureInfoDetail.getCorpName());
        }
        if (insLogisticsProcureInfoDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getInstitutionId, insLogisticsProcureInfoDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getInstitutionName, insLogisticsProcureInfoDetail.getInstitutionName());
        }
        if (insLogisticsProcureInfoDetail.getProcureId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getProcureId, insLogisticsProcureInfoDetail.getProcureId());
        }
        if (insLogisticsProcureInfoDetail.getGoodsId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getGoodsId, insLogisticsProcureInfoDetail.getGoodsId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getGoodsName())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getGoodsName, insLogisticsProcureInfoDetail.getGoodsName());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getGoodsCode())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getGoodsCode, insLogisticsProcureInfoDetail.getGoodsCode());
        }
        if (insLogisticsProcureInfoDetail.getTypeId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getTypeId, insLogisticsProcureInfoDetail.getTypeId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getTypeName())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getTypeName, insLogisticsProcureInfoDetail.getTypeName());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getGoodsUnit())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getGoodsUnit, insLogisticsProcureInfoDetail.getGoodsUnit());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getGoodsStandards())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getGoodsStandards, insLogisticsProcureInfoDetail.getGoodsStandards());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getBarCode())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getBarCode, insLogisticsProcureInfoDetail.getBarCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getManufactorName())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getManufactorName, insLogisticsProcureInfoDetail.getManufactorName());
        }
        if (insLogisticsProcureInfoDetail.getGoodsPrice() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getGoodsPrice, insLogisticsProcureInfoDetail.getGoodsPrice());
        }
        if (insLogisticsProcureInfoDetail.getGoodsNum() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getGoodsNum, insLogisticsProcureInfoDetail.getGoodsNum());
        }
        if (insLogisticsProcureInfoDetail.getProcureAmount() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getProcureAmount, insLogisticsProcureInfoDetail.getProcureAmount());
        }
        if (insLogisticsProcureInfoDetail.getProductionDate() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getProductionDate, insLogisticsProcureInfoDetail.getProductionDate());
        }
        if (insLogisticsProcureInfoDetail.getValidityDate() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getValidityDate, insLogisticsProcureInfoDetail.getValidityDate());
        }
        if (insLogisticsProcureInfoDetail.getInventoryId() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getInventoryId, insLogisticsProcureInfoDetail.getInventoryId());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getRemark())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getRemark, insLogisticsProcureInfoDetail.getRemark());
        }
        if (insLogisticsProcureInfoDetail.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getCreateUser, insLogisticsProcureInfoDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsProcureInfoDetail.getCreateName())) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getCreateName, insLogisticsProcureInfoDetail.getCreateName());
        }
        if (insLogisticsProcureInfoDetail.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getCreateDept, insLogisticsProcureInfoDetail.getCreateDept());
        }
        if (insLogisticsProcureInfoDetail.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getCreateTime, insLogisticsProcureInfoDetail.getCreateTime());
        }
        if (insLogisticsProcureInfoDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getUpdateUser, insLogisticsProcureInfoDetail.getUpdateUser());
        }
        if (insLogisticsProcureInfoDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getUpdateTime, insLogisticsProcureInfoDetail.getUpdateTime());
        }
        if (insLogisticsProcureInfoDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getIsDeleted, insLogisticsProcureInfoDetail.getIsDeleted());
        }
        if (insLogisticsProcureInfoDetail.getStatus() != null) {
            queryWrapper.eq(InsLogisticsProcureInfoDetail::getStatus, insLogisticsProcureInfoDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsProcureInfoDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsProcureInfoDetail insert(InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail) {
        insLogisticsProcureInfoDetail.setId(null);
        getBaseMapper().insert(insLogisticsProcureInfoDetail);
        return insLogisticsProcureInfoDetail;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsProcureInfoDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsProcureInfoDetail update(InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsProcureInfoDetail> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsProcureInfoDetail>(getBaseMapper());
        if (insLogisticsProcureInfoDetail.getId() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getId, insLogisticsProcureInfoDetail.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getTenantId())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getTenantId, insLogisticsProcureInfoDetail.getTenantId());
        }
        if (insLogisticsProcureInfoDetail.getCorpId() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getCorpId, insLogisticsProcureInfoDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getCorpName())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getCorpName, insLogisticsProcureInfoDetail.getCorpName());
        }
        if (insLogisticsProcureInfoDetail.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getInstitutionId, insLogisticsProcureInfoDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getInstitutionName())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getInstitutionName, insLogisticsProcureInfoDetail.getInstitutionName());
        }
        if (insLogisticsProcureInfoDetail.getProcureId() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getProcureId, insLogisticsProcureInfoDetail.getProcureId());
        }
        if (insLogisticsProcureInfoDetail.getGoodsId() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getGoodsId, insLogisticsProcureInfoDetail.getGoodsId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getGoodsName())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getGoodsName, insLogisticsProcureInfoDetail.getGoodsName());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getGoodsCode())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getGoodsCode, insLogisticsProcureInfoDetail.getGoodsCode());
        }
        if (insLogisticsProcureInfoDetail.getTypeId() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getTypeId, insLogisticsProcureInfoDetail.getTypeId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getTypeName())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getTypeName, insLogisticsProcureInfoDetail.getTypeName());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getGoodsUnit())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getGoodsUnit, insLogisticsProcureInfoDetail.getGoodsUnit());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getGoodsStandards())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getGoodsStandards, insLogisticsProcureInfoDetail.getGoodsStandards());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getBarCode())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getBarCode, insLogisticsProcureInfoDetail.getBarCode());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getManufactorName())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getManufactorName, insLogisticsProcureInfoDetail.getManufactorName());
        }
        if (insLogisticsProcureInfoDetail.getGoodsPrice() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getGoodsPrice, insLogisticsProcureInfoDetail.getGoodsPrice());
        }
        if (insLogisticsProcureInfoDetail.getGoodsNum() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getGoodsNum, insLogisticsProcureInfoDetail.getGoodsNum());
        }
        if (insLogisticsProcureInfoDetail.getProcureAmount() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getProcureAmount, insLogisticsProcureInfoDetail.getProcureAmount());
        }
        if (insLogisticsProcureInfoDetail.getProductionDate() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getProductionDate, insLogisticsProcureInfoDetail.getProductionDate());
        }
        if (insLogisticsProcureInfoDetail.getValidityDate() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getValidityDate, insLogisticsProcureInfoDetail.getValidityDate());
        }
        if (insLogisticsProcureInfoDetail.getInventoryId() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getInventoryId, insLogisticsProcureInfoDetail.getInventoryId());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getRemark())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getRemark, insLogisticsProcureInfoDetail.getRemark());
        }
        if (insLogisticsProcureInfoDetail.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getCreateUser, insLogisticsProcureInfoDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsProcureInfoDetail.getCreateName())) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getCreateName, insLogisticsProcureInfoDetail.getCreateName());
        }
        if (insLogisticsProcureInfoDetail.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getCreateDept, insLogisticsProcureInfoDetail.getCreateDept());
        }
        if (insLogisticsProcureInfoDetail.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getCreateTime, insLogisticsProcureInfoDetail.getCreateTime());
        }
        if (insLogisticsProcureInfoDetail.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getUpdateUser, insLogisticsProcureInfoDetail.getUpdateUser());
        }
        if (insLogisticsProcureInfoDetail.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getUpdateTime, insLogisticsProcureInfoDetail.getUpdateTime());
        }
        if (insLogisticsProcureInfoDetail.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getIsDeleted, insLogisticsProcureInfoDetail.getIsDeleted());
        }
        if (insLogisticsProcureInfoDetail.getStatus() != null) {
            chainWrapper.set(InsLogisticsProcureInfoDetail::getStatus, insLogisticsProcureInfoDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsProcureInfoDetail::getId, insLogisticsProcureInfoDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsProcureInfoDetail.getId());
        } else {
            return insLogisticsProcureInfoDetail;
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
    public boolean saveInsLogisticsProcureInfoDetailBatch(List<InsLogisticsProcureInfoDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail : insertList) {
            //使用默认的雪花算法生成
            insLogisticsProcureInfoDetail.setId(null);
            //insLogisticsProcureInfoDetail.setCreatedDt(currentDte);
            //insLogisticsProcureInfoDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsProcureInfoDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsProcureInfoDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


