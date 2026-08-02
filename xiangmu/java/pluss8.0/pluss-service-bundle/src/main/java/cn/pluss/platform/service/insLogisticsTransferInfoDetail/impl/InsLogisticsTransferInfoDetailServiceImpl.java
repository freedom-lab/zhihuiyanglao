package cn.pluss.platform.service.insLogisticsTransferInfoDetail.impl;

import cn.pluss.platform.mapper.InsLogisticsTransferInfoDetailMapper;
import cn.pluss.platform.model.entity.InsLogisticsTransferInfoDetail;
import cn.pluss.platform.service.insLogisticsTransferInfoDetail.InsLogisticsTransferInfoDetailService;
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
@Service("insLogisticsTransferInfoDetailService")
public class InsLogisticsTransferInfoDetailServiceImpl extends ServiceImpl< InsLogisticsTransferInfoDetailMapper, InsLogisticsTransferInfoDetail> implements InsLogisticsTransferInfoDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsTransferInfoDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsTransferInfoDetail> queryPage(Map map) {
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
    public InsLogisticsTransferInfoDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsTransferInfoDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsTransferInfoDetail queryOne(InsLogisticsTransferInfoDetail insLogisticsTransferInfoDetail){
        LambdaQueryWrapper<InsLogisticsTransferInfoDetail> queryWrapper = getQueryWrapper(insLogisticsTransferInfoDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsTransferInfoDetail
    * @return
    */
    @Override
    public List<InsLogisticsTransferInfoDetail> queryList(InsLogisticsTransferInfoDetail insLogisticsTransferInfoDetail) {
        LambdaQueryWrapper<InsLogisticsTransferInfoDetail> queryWrapper = getQueryWrapper(insLogisticsTransferInfoDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsTransferInfoDetail
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsTransferInfoDetail> getQueryWrapper(InsLogisticsTransferInfoDetail insLogisticsTransferInfoDetail){
        LambdaQueryWrapper<InsLogisticsTransferInfoDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsTransferInfoDetail.getId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getId, insLogisticsTransferInfoDetail.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getTenantId())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getTenantId, insLogisticsTransferInfoDetail.getTenantId());
        }
        if (insLogisticsTransferInfoDetail.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getCorpId, insLogisticsTransferInfoDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getCorpName())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getCorpName, insLogisticsTransferInfoDetail.getCorpName());
        }
        if (insLogisticsTransferInfoDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getInstitutionId, insLogisticsTransferInfoDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getInstitutionName, insLogisticsTransferInfoDetail.getInstitutionName());
        }
        if (insLogisticsTransferInfoDetail.getTransferId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getTransferId, insLogisticsTransferInfoDetail.getTransferId());
        }
        if (insLogisticsTransferInfoDetail.getInventoryId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getInventoryId, insLogisticsTransferInfoDetail.getInventoryId());
        }
        if (insLogisticsTransferInfoDetail.getGoodsId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getGoodsId, insLogisticsTransferInfoDetail.getGoodsId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getGoodsName())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getGoodsName, insLogisticsTransferInfoDetail.getGoodsName());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getGoodsCode())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getGoodsCode, insLogisticsTransferInfoDetail.getGoodsCode());
        }
        if (insLogisticsTransferInfoDetail.getTypeId() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getTypeId, insLogisticsTransferInfoDetail.getTypeId());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getTypeName())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getTypeName, insLogisticsTransferInfoDetail.getTypeName());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getGoodsUnit())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getGoodsUnit, insLogisticsTransferInfoDetail.getGoodsUnit());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getGoodsStandards())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getGoodsStandards, insLogisticsTransferInfoDetail.getGoodsStandards());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getBarCode())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getBarCode, insLogisticsTransferInfoDetail.getBarCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getManufactorName())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getManufactorName, insLogisticsTransferInfoDetail.getManufactorName());
        }
        if (insLogisticsTransferInfoDetail.getGoodsPrice() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getGoodsPrice, insLogisticsTransferInfoDetail.getGoodsPrice());
        }
        if (insLogisticsTransferInfoDetail.getGoodsNum() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getGoodsNum, insLogisticsTransferInfoDetail.getGoodsNum());
        }
        if (insLogisticsTransferInfoDetail.getTransferAmount() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getTransferAmount, insLogisticsTransferInfoDetail.getTransferAmount());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getRemark())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getRemark, insLogisticsTransferInfoDetail.getRemark());
        }
        if (insLogisticsTransferInfoDetail.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getCreateUser, insLogisticsTransferInfoDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsTransferInfoDetail.getCreateName())) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getCreateName, insLogisticsTransferInfoDetail.getCreateName());
        }
        if (insLogisticsTransferInfoDetail.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getCreateDept, insLogisticsTransferInfoDetail.getCreateDept());
        }
        if (insLogisticsTransferInfoDetail.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getCreateTime, insLogisticsTransferInfoDetail.getCreateTime());
        }
        if (insLogisticsTransferInfoDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getUpdateUser, insLogisticsTransferInfoDetail.getUpdateUser());
        }
        if (insLogisticsTransferInfoDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getUpdateTime, insLogisticsTransferInfoDetail.getUpdateTime());
        }
        if (insLogisticsTransferInfoDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getIsDeleted, insLogisticsTransferInfoDetail.getIsDeleted());
        }
        if (insLogisticsTransferInfoDetail.getStatus() != null) {
            queryWrapper.eq(InsLogisticsTransferInfoDetail::getStatus, insLogisticsTransferInfoDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsTransferInfoDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsTransferInfoDetail insert(InsLogisticsTransferInfoDetail insLogisticsTransferInfoDetail) {
        insLogisticsTransferInfoDetail.setId(null);
        getBaseMapper().insert(insLogisticsTransferInfoDetail);
        return insLogisticsTransferInfoDetail;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsTransferInfoDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsTransferInfoDetail update(InsLogisticsTransferInfoDetail insLogisticsTransferInfoDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsTransferInfoDetail> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsTransferInfoDetail>(getBaseMapper());
        if (insLogisticsTransferInfoDetail.getId() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getId, insLogisticsTransferInfoDetail.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getTenantId())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getTenantId, insLogisticsTransferInfoDetail.getTenantId());
        }
        if (insLogisticsTransferInfoDetail.getCorpId() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getCorpId, insLogisticsTransferInfoDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getCorpName())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getCorpName, insLogisticsTransferInfoDetail.getCorpName());
        }
        if (insLogisticsTransferInfoDetail.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getInstitutionId, insLogisticsTransferInfoDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getInstitutionName())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getInstitutionName, insLogisticsTransferInfoDetail.getInstitutionName());
        }
        if (insLogisticsTransferInfoDetail.getTransferId() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getTransferId, insLogisticsTransferInfoDetail.getTransferId());
        }
        if (insLogisticsTransferInfoDetail.getInventoryId() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getInventoryId, insLogisticsTransferInfoDetail.getInventoryId());
        }
        if (insLogisticsTransferInfoDetail.getGoodsId() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getGoodsId, insLogisticsTransferInfoDetail.getGoodsId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getGoodsName())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getGoodsName, insLogisticsTransferInfoDetail.getGoodsName());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getGoodsCode())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getGoodsCode, insLogisticsTransferInfoDetail.getGoodsCode());
        }
        if (insLogisticsTransferInfoDetail.getTypeId() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getTypeId, insLogisticsTransferInfoDetail.getTypeId());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getTypeName())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getTypeName, insLogisticsTransferInfoDetail.getTypeName());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getGoodsUnit())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getGoodsUnit, insLogisticsTransferInfoDetail.getGoodsUnit());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getGoodsStandards())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getGoodsStandards, insLogisticsTransferInfoDetail.getGoodsStandards());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getBarCode())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getBarCode, insLogisticsTransferInfoDetail.getBarCode());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getManufactorName())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getManufactorName, insLogisticsTransferInfoDetail.getManufactorName());
        }
        if (insLogisticsTransferInfoDetail.getGoodsPrice() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getGoodsPrice, insLogisticsTransferInfoDetail.getGoodsPrice());
        }
        if (insLogisticsTransferInfoDetail.getGoodsNum() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getGoodsNum, insLogisticsTransferInfoDetail.getGoodsNum());
        }
        if (insLogisticsTransferInfoDetail.getTransferAmount() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getTransferAmount, insLogisticsTransferInfoDetail.getTransferAmount());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getRemark())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getRemark, insLogisticsTransferInfoDetail.getRemark());
        }
        if (insLogisticsTransferInfoDetail.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getCreateUser, insLogisticsTransferInfoDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsTransferInfoDetail.getCreateName())) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getCreateName, insLogisticsTransferInfoDetail.getCreateName());
        }
        if (insLogisticsTransferInfoDetail.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getCreateDept, insLogisticsTransferInfoDetail.getCreateDept());
        }
        if (insLogisticsTransferInfoDetail.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getCreateTime, insLogisticsTransferInfoDetail.getCreateTime());
        }
        if (insLogisticsTransferInfoDetail.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getUpdateUser, insLogisticsTransferInfoDetail.getUpdateUser());
        }
        if (insLogisticsTransferInfoDetail.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getUpdateTime, insLogisticsTransferInfoDetail.getUpdateTime());
        }
        if (insLogisticsTransferInfoDetail.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getIsDeleted, insLogisticsTransferInfoDetail.getIsDeleted());
        }
        if (insLogisticsTransferInfoDetail.getStatus() != null) {
            chainWrapper.set(InsLogisticsTransferInfoDetail::getStatus, insLogisticsTransferInfoDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsTransferInfoDetail::getId, insLogisticsTransferInfoDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsTransferInfoDetail.getId());
        } else {
            return insLogisticsTransferInfoDetail;
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
    public boolean saveInsLogisticsTransferInfoDetailBatch(List<InsLogisticsTransferInfoDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsTransferInfoDetail insLogisticsTransferInfoDetail : insertList) {
            //使用默认的雪花算法生成
            insLogisticsTransferInfoDetail.setId(null);
            //insLogisticsTransferInfoDetail.setCreatedDt(currentDte);
            //insLogisticsTransferInfoDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsTransferInfoDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsTransferInfoDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


