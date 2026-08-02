package cn.pluss.platform.service.insLogisticsOutboundInfoDetail.impl;

import cn.pluss.platform.mapper.InsLogisticsOutboundInfoDetailMapper;
import cn.pluss.platform.model.entity.InsLogisticsOutboundInfoDetail;
import cn.pluss.platform.service.insLogisticsOutboundInfoDetail.InsLogisticsOutboundInfoDetailService;
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
@Service("insLogisticsOutboundInfoDetailService")
public class InsLogisticsOutboundInfoDetailServiceImpl extends ServiceImpl< InsLogisticsOutboundInfoDetailMapper, InsLogisticsOutboundInfoDetail> implements InsLogisticsOutboundInfoDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsOutboundInfoDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsOutboundInfoDetail> queryPage(Map map) {
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
    public InsLogisticsOutboundInfoDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsOutboundInfoDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsOutboundInfoDetail queryOne(InsLogisticsOutboundInfoDetail insLogisticsOutboundInfoDetail){
        LambdaQueryWrapper<InsLogisticsOutboundInfoDetail> queryWrapper = getQueryWrapper(insLogisticsOutboundInfoDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsOutboundInfoDetail
    * @return
    */
    @Override
    public List<InsLogisticsOutboundInfoDetail> queryList(InsLogisticsOutboundInfoDetail insLogisticsOutboundInfoDetail) {
        LambdaQueryWrapper<InsLogisticsOutboundInfoDetail> queryWrapper = getQueryWrapper(insLogisticsOutboundInfoDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsOutboundInfoDetail
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsOutboundInfoDetail> getQueryWrapper(InsLogisticsOutboundInfoDetail insLogisticsOutboundInfoDetail){
        LambdaQueryWrapper<InsLogisticsOutboundInfoDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsOutboundInfoDetail.getId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getId, insLogisticsOutboundInfoDetail.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getTenantId())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getTenantId, insLogisticsOutboundInfoDetail.getTenantId());
        }
        if (insLogisticsOutboundInfoDetail.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getCorpId, insLogisticsOutboundInfoDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getCorpName())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getCorpName, insLogisticsOutboundInfoDetail.getCorpName());
        }
        if (insLogisticsOutboundInfoDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getInstitutionId, insLogisticsOutboundInfoDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getInstitutionName, insLogisticsOutboundInfoDetail.getInstitutionName());
        }
        if (insLogisticsOutboundInfoDetail.getOutboundId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getOutboundId, insLogisticsOutboundInfoDetail.getOutboundId());
        }
        if (insLogisticsOutboundInfoDetail.getGoodsId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getGoodsId, insLogisticsOutboundInfoDetail.getGoodsId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getGoodsName())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getGoodsName, insLogisticsOutboundInfoDetail.getGoodsName());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getGoodsCode())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getGoodsCode, insLogisticsOutboundInfoDetail.getGoodsCode());
        }
        if (insLogisticsOutboundInfoDetail.getTypeId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getTypeId, insLogisticsOutboundInfoDetail.getTypeId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getTypeName())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getTypeName, insLogisticsOutboundInfoDetail.getTypeName());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getGoodsUnit())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getGoodsUnit, insLogisticsOutboundInfoDetail.getGoodsUnit());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getGoodsStandards())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getGoodsStandards, insLogisticsOutboundInfoDetail.getGoodsStandards());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getBarCode())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getBarCode, insLogisticsOutboundInfoDetail.getBarCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getManufactorName())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getManufactorName, insLogisticsOutboundInfoDetail.getManufactorName());
        }
        if (insLogisticsOutboundInfoDetail.getOutPrice() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getOutPrice, insLogisticsOutboundInfoDetail.getOutPrice());
        }
        if (insLogisticsOutboundInfoDetail.getOutNum() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getOutNum, insLogisticsOutboundInfoDetail.getOutNum());
        }
        if (insLogisticsOutboundInfoDetail.getOutAmount() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getOutAmount, insLogisticsOutboundInfoDetail.getOutAmount());
        }
        if (insLogisticsOutboundInfoDetail.getInventoryId() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getInventoryId, insLogisticsOutboundInfoDetail.getInventoryId());
        }
        if (insLogisticsOutboundInfoDetail.getIsRecovery() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getIsRecovery, insLogisticsOutboundInfoDetail.getIsRecovery());
        }
        if (insLogisticsOutboundInfoDetail.getRecoveryTime() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getRecoveryTime, insLogisticsOutboundInfoDetail.getRecoveryTime());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getRemark())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getRemark, insLogisticsOutboundInfoDetail.getRemark());
        }
        if (insLogisticsOutboundInfoDetail.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getCreateUser, insLogisticsOutboundInfoDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsOutboundInfoDetail.getCreateName())) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getCreateName, insLogisticsOutboundInfoDetail.getCreateName());
        }
        if (insLogisticsOutboundInfoDetail.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getCreateDept, insLogisticsOutboundInfoDetail.getCreateDept());
        }
        if (insLogisticsOutboundInfoDetail.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getCreateTime, insLogisticsOutboundInfoDetail.getCreateTime());
        }
        if (insLogisticsOutboundInfoDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getUpdateUser, insLogisticsOutboundInfoDetail.getUpdateUser());
        }
        if (insLogisticsOutboundInfoDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getUpdateTime, insLogisticsOutboundInfoDetail.getUpdateTime());
        }
        if (insLogisticsOutboundInfoDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getIsDeleted, insLogisticsOutboundInfoDetail.getIsDeleted());
        }
        if (insLogisticsOutboundInfoDetail.getStatus() != null) {
            queryWrapper.eq(InsLogisticsOutboundInfoDetail::getStatus, insLogisticsOutboundInfoDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsOutboundInfoDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOutboundInfoDetail insert(InsLogisticsOutboundInfoDetail insLogisticsOutboundInfoDetail) {
        insLogisticsOutboundInfoDetail.setId(null);
        getBaseMapper().insert(insLogisticsOutboundInfoDetail);
        return insLogisticsOutboundInfoDetail;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsOutboundInfoDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOutboundInfoDetail update(InsLogisticsOutboundInfoDetail insLogisticsOutboundInfoDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsOutboundInfoDetail> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsOutboundInfoDetail>(getBaseMapper());
        if (insLogisticsOutboundInfoDetail.getId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getId, insLogisticsOutboundInfoDetail.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getTenantId())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getTenantId, insLogisticsOutboundInfoDetail.getTenantId());
        }
        if (insLogisticsOutboundInfoDetail.getCorpId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getCorpId, insLogisticsOutboundInfoDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getCorpName())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getCorpName, insLogisticsOutboundInfoDetail.getCorpName());
        }
        if (insLogisticsOutboundInfoDetail.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getInstitutionId, insLogisticsOutboundInfoDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getInstitutionName())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getInstitutionName, insLogisticsOutboundInfoDetail.getInstitutionName());
        }
        if (insLogisticsOutboundInfoDetail.getOutboundId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getOutboundId, insLogisticsOutboundInfoDetail.getOutboundId());
        }
        if (insLogisticsOutboundInfoDetail.getGoodsId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getGoodsId, insLogisticsOutboundInfoDetail.getGoodsId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getGoodsName())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getGoodsName, insLogisticsOutboundInfoDetail.getGoodsName());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getGoodsCode())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getGoodsCode, insLogisticsOutboundInfoDetail.getGoodsCode());
        }
        if (insLogisticsOutboundInfoDetail.getTypeId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getTypeId, insLogisticsOutboundInfoDetail.getTypeId());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getTypeName())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getTypeName, insLogisticsOutboundInfoDetail.getTypeName());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getGoodsUnit())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getGoodsUnit, insLogisticsOutboundInfoDetail.getGoodsUnit());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getGoodsStandards())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getGoodsStandards, insLogisticsOutboundInfoDetail.getGoodsStandards());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getBarCode())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getBarCode, insLogisticsOutboundInfoDetail.getBarCode());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getManufactorName())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getManufactorName, insLogisticsOutboundInfoDetail.getManufactorName());
        }
        if (insLogisticsOutboundInfoDetail.getOutPrice() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getOutPrice, insLogisticsOutboundInfoDetail.getOutPrice());
        }
        if (insLogisticsOutboundInfoDetail.getOutNum() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getOutNum, insLogisticsOutboundInfoDetail.getOutNum());
        }
        if (insLogisticsOutboundInfoDetail.getOutAmount() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getOutAmount, insLogisticsOutboundInfoDetail.getOutAmount());
        }
        if (insLogisticsOutboundInfoDetail.getInventoryId() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getInventoryId, insLogisticsOutboundInfoDetail.getInventoryId());
        }
        if (insLogisticsOutboundInfoDetail.getIsRecovery() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getIsRecovery, insLogisticsOutboundInfoDetail.getIsRecovery());
        }
        if (insLogisticsOutboundInfoDetail.getRecoveryTime() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getRecoveryTime, insLogisticsOutboundInfoDetail.getRecoveryTime());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getRemark())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getRemark, insLogisticsOutboundInfoDetail.getRemark());
        }
        if (insLogisticsOutboundInfoDetail.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getCreateUser, insLogisticsOutboundInfoDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsOutboundInfoDetail.getCreateName())) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getCreateName, insLogisticsOutboundInfoDetail.getCreateName());
        }
        if (insLogisticsOutboundInfoDetail.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getCreateDept, insLogisticsOutboundInfoDetail.getCreateDept());
        }
        if (insLogisticsOutboundInfoDetail.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getCreateTime, insLogisticsOutboundInfoDetail.getCreateTime());
        }
        if (insLogisticsOutboundInfoDetail.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getUpdateUser, insLogisticsOutboundInfoDetail.getUpdateUser());
        }
        if (insLogisticsOutboundInfoDetail.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getUpdateTime, insLogisticsOutboundInfoDetail.getUpdateTime());
        }
        if (insLogisticsOutboundInfoDetail.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getIsDeleted, insLogisticsOutboundInfoDetail.getIsDeleted());
        }
        if (insLogisticsOutboundInfoDetail.getStatus() != null) {
            chainWrapper.set(InsLogisticsOutboundInfoDetail::getStatus, insLogisticsOutboundInfoDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsOutboundInfoDetail::getId, insLogisticsOutboundInfoDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsOutboundInfoDetail.getId());
        } else {
            return insLogisticsOutboundInfoDetail;
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
    public boolean saveInsLogisticsOutboundInfoDetailBatch(List<InsLogisticsOutboundInfoDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsOutboundInfoDetail insLogisticsOutboundInfoDetail : insertList) {
            //使用默认的雪花算法生成
            insLogisticsOutboundInfoDetail.setId(null);
            //insLogisticsOutboundInfoDetail.setCreatedDt(currentDte);
            //insLogisticsOutboundInfoDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsOutboundInfoDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsOutboundInfoDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


