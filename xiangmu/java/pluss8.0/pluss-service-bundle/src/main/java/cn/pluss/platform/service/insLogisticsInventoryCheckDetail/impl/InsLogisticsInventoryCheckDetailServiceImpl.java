package cn.pluss.platform.service.insLogisticsInventoryCheckDetail.impl;

import cn.pluss.platform.mapper.InsLogisticsInventoryCheckDetailMapper;
import cn.pluss.platform.model.entity.InsLogisticsInventoryCheckDetail;
import cn.pluss.platform.service.insLogisticsInventoryCheckDetail.InsLogisticsInventoryCheckDetailService;
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
@Service("insLogisticsInventoryCheckDetailService")
public class InsLogisticsInventoryCheckDetailServiceImpl extends ServiceImpl< InsLogisticsInventoryCheckDetailMapper, InsLogisticsInventoryCheckDetail> implements InsLogisticsInventoryCheckDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsInventoryCheckDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsInventoryCheckDetail> queryPage(Map map) {
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
    public InsLogisticsInventoryCheckDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsInventoryCheckDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsInventoryCheckDetail queryOne(InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail){
        LambdaQueryWrapper<InsLogisticsInventoryCheckDetail> queryWrapper = getQueryWrapper(insLogisticsInventoryCheckDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsInventoryCheckDetail
    * @return
    */
    @Override
    public List<InsLogisticsInventoryCheckDetail> queryList(InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail) {
        LambdaQueryWrapper<InsLogisticsInventoryCheckDetail> queryWrapper = getQueryWrapper(insLogisticsInventoryCheckDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsInventoryCheckDetail
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsInventoryCheckDetail> getQueryWrapper(InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail){
        LambdaQueryWrapper<InsLogisticsInventoryCheckDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsInventoryCheckDetail.getId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getId, insLogisticsInventoryCheckDetail.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getTenantId())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getTenantId, insLogisticsInventoryCheckDetail.getTenantId());
        }
        if (insLogisticsInventoryCheckDetail.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getCorpId, insLogisticsInventoryCheckDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getCorpName())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getCorpName, insLogisticsInventoryCheckDetail.getCorpName());
        }
        if (insLogisticsInventoryCheckDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getInstitutionId, insLogisticsInventoryCheckDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getInstitutionName, insLogisticsInventoryCheckDetail.getInstitutionName());
        }
        if (insLogisticsInventoryCheckDetail.getCheckId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getCheckId, insLogisticsInventoryCheckDetail.getCheckId());
        }
        if (insLogisticsInventoryCheckDetail.getGoodsId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getGoodsId, insLogisticsInventoryCheckDetail.getGoodsId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getGoodsName())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getGoodsName, insLogisticsInventoryCheckDetail.getGoodsName());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getGoodsCode())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getGoodsCode, insLogisticsInventoryCheckDetail.getGoodsCode());
        }
        if (insLogisticsInventoryCheckDetail.getTypeId() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getTypeId, insLogisticsInventoryCheckDetail.getTypeId());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getTypeName())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getTypeName, insLogisticsInventoryCheckDetail.getTypeName());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getGoodsUnit())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getGoodsUnit, insLogisticsInventoryCheckDetail.getGoodsUnit());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getGoodsStandards())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getGoodsStandards, insLogisticsInventoryCheckDetail.getGoodsStandards());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getBarCode())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getBarCode, insLogisticsInventoryCheckDetail.getBarCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getManufactorName())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getManufactorName, insLogisticsInventoryCheckDetail.getManufactorName());
        }
        if (insLogisticsInventoryCheckDetail.getStockNum() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getStockNum, insLogisticsInventoryCheckDetail.getStockNum());
        }
        if (insLogisticsInventoryCheckDetail.getRealNum() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getRealNum, insLogisticsInventoryCheckDetail.getRealNum());
        }
        if (insLogisticsInventoryCheckDetail.getGoodsPrice() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getGoodsPrice, insLogisticsInventoryCheckDetail.getGoodsPrice());
        }
        if (insLogisticsInventoryCheckDetail.getDifferNum() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getDifferNum, insLogisticsInventoryCheckDetail.getDifferNum());
        }
        if (insLogisticsInventoryCheckDetail.getDifferAmount() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getDifferAmount, insLogisticsInventoryCheckDetail.getDifferAmount());
        }
        if (insLogisticsInventoryCheckDetail.getCheckState() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getCheckState, insLogisticsInventoryCheckDetail.getCheckState());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getRemark())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getRemark, insLogisticsInventoryCheckDetail.getRemark());
        }
        if (insLogisticsInventoryCheckDetail.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getCreateUser, insLogisticsInventoryCheckDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsInventoryCheckDetail.getCreateName())) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getCreateName, insLogisticsInventoryCheckDetail.getCreateName());
        }
        if (insLogisticsInventoryCheckDetail.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getCreateDept, insLogisticsInventoryCheckDetail.getCreateDept());
        }
        if (insLogisticsInventoryCheckDetail.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getCreateTime, insLogisticsInventoryCheckDetail.getCreateTime());
        }
        if (insLogisticsInventoryCheckDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getUpdateUser, insLogisticsInventoryCheckDetail.getUpdateUser());
        }
        if (insLogisticsInventoryCheckDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getUpdateTime, insLogisticsInventoryCheckDetail.getUpdateTime());
        }
        if (insLogisticsInventoryCheckDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getIsDeleted, insLogisticsInventoryCheckDetail.getIsDeleted());
        }
        if (insLogisticsInventoryCheckDetail.getStatus() != null) {
            queryWrapper.eq(InsLogisticsInventoryCheckDetail::getStatus, insLogisticsInventoryCheckDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsInventoryCheckDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsInventoryCheckDetail insert(InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail) {
        insLogisticsInventoryCheckDetail.setId(null);
        getBaseMapper().insert(insLogisticsInventoryCheckDetail);
        return insLogisticsInventoryCheckDetail;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsInventoryCheckDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsInventoryCheckDetail update(InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsInventoryCheckDetail> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsInventoryCheckDetail>(getBaseMapper());
        if (insLogisticsInventoryCheckDetail.getId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getId, insLogisticsInventoryCheckDetail.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getTenantId())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getTenantId, insLogisticsInventoryCheckDetail.getTenantId());
        }
        if (insLogisticsInventoryCheckDetail.getCorpId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getCorpId, insLogisticsInventoryCheckDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getCorpName())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getCorpName, insLogisticsInventoryCheckDetail.getCorpName());
        }
        if (insLogisticsInventoryCheckDetail.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getInstitutionId, insLogisticsInventoryCheckDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getInstitutionName())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getInstitutionName, insLogisticsInventoryCheckDetail.getInstitutionName());
        }
        if (insLogisticsInventoryCheckDetail.getCheckId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getCheckId, insLogisticsInventoryCheckDetail.getCheckId());
        }
        if (insLogisticsInventoryCheckDetail.getGoodsId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getGoodsId, insLogisticsInventoryCheckDetail.getGoodsId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getGoodsName())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getGoodsName, insLogisticsInventoryCheckDetail.getGoodsName());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getGoodsCode())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getGoodsCode, insLogisticsInventoryCheckDetail.getGoodsCode());
        }
        if (insLogisticsInventoryCheckDetail.getTypeId() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getTypeId, insLogisticsInventoryCheckDetail.getTypeId());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getTypeName())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getTypeName, insLogisticsInventoryCheckDetail.getTypeName());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getGoodsUnit())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getGoodsUnit, insLogisticsInventoryCheckDetail.getGoodsUnit());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getGoodsStandards())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getGoodsStandards, insLogisticsInventoryCheckDetail.getGoodsStandards());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getBarCode())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getBarCode, insLogisticsInventoryCheckDetail.getBarCode());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getManufactorName())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getManufactorName, insLogisticsInventoryCheckDetail.getManufactorName());
        }
        if (insLogisticsInventoryCheckDetail.getStockNum() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getStockNum, insLogisticsInventoryCheckDetail.getStockNum());
        }
        if (insLogisticsInventoryCheckDetail.getRealNum() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getRealNum, insLogisticsInventoryCheckDetail.getRealNum());
        }
        if (insLogisticsInventoryCheckDetail.getGoodsPrice() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getGoodsPrice, insLogisticsInventoryCheckDetail.getGoodsPrice());
        }
        if (insLogisticsInventoryCheckDetail.getDifferNum() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getDifferNum, insLogisticsInventoryCheckDetail.getDifferNum());
        }
        if (insLogisticsInventoryCheckDetail.getDifferAmount() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getDifferAmount, insLogisticsInventoryCheckDetail.getDifferAmount());
        }
        if (insLogisticsInventoryCheckDetail.getCheckState() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getCheckState, insLogisticsInventoryCheckDetail.getCheckState());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getRemark())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getRemark, insLogisticsInventoryCheckDetail.getRemark());
        }
        if (insLogisticsInventoryCheckDetail.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getCreateUser, insLogisticsInventoryCheckDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsInventoryCheckDetail.getCreateName())) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getCreateName, insLogisticsInventoryCheckDetail.getCreateName());
        }
        if (insLogisticsInventoryCheckDetail.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getCreateDept, insLogisticsInventoryCheckDetail.getCreateDept());
        }
        if (insLogisticsInventoryCheckDetail.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getCreateTime, insLogisticsInventoryCheckDetail.getCreateTime());
        }
        if (insLogisticsInventoryCheckDetail.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getUpdateUser, insLogisticsInventoryCheckDetail.getUpdateUser());
        }
        if (insLogisticsInventoryCheckDetail.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getUpdateTime, insLogisticsInventoryCheckDetail.getUpdateTime());
        }
        if (insLogisticsInventoryCheckDetail.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getIsDeleted, insLogisticsInventoryCheckDetail.getIsDeleted());
        }
        if (insLogisticsInventoryCheckDetail.getStatus() != null) {
            chainWrapper.set(InsLogisticsInventoryCheckDetail::getStatus, insLogisticsInventoryCheckDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsInventoryCheckDetail::getId, insLogisticsInventoryCheckDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsInventoryCheckDetail.getId());
        } else {
            return insLogisticsInventoryCheckDetail;
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
    public boolean saveInsLogisticsInventoryCheckDetailBatch(List<InsLogisticsInventoryCheckDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail : insertList) {
            //使用默认的雪花算法生成
            insLogisticsInventoryCheckDetail.setId(null);
            //insLogisticsInventoryCheckDetail.setCreatedDt(currentDte);
            //insLogisticsInventoryCheckDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsInventoryCheckDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsInventoryCheckDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


