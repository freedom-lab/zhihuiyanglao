package cn.pluss.platform.service.gspInstitutionBuildingTransfer.impl;

import cn.pluss.platform.mapper.GspInstitutionBuildingTransferMapper;
import cn.pluss.platform.model.entity.GspInstitutionBuildingTransfer;
import cn.pluss.platform.service.gspInstitutionBuildingTransfer.GspInstitutionBuildingTransferService;
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
@Service("gspInstitutionBuildingTransferService")
public class GspInstitutionBuildingTransferServiceImpl extends ServiceImpl< GspInstitutionBuildingTransferMapper, GspInstitutionBuildingTransfer> implements GspInstitutionBuildingTransferService {
    private static final Logger logger = LoggerFactory.getLogger(GspInstitutionBuildingTransferServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<GspInstitutionBuildingTransfer> queryPage(Map map) {
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
    public GspInstitutionBuildingTransfer queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param gspInstitutionBuildingTransfer 实例对象
    * @return 实例对象
    */
    @Override
    public GspInstitutionBuildingTransfer queryOne(GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer){
        LambdaQueryWrapper<GspInstitutionBuildingTransfer> queryWrapper = getQueryWrapper(gspInstitutionBuildingTransfer);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param gspInstitutionBuildingTransfer
    * @return
    */
    @Override
    public List<GspInstitutionBuildingTransfer> queryList(GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer) {
        LambdaQueryWrapper<GspInstitutionBuildingTransfer> queryWrapper = getQueryWrapper(gspInstitutionBuildingTransfer);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param gspInstitutionBuildingTransfer
    * @return
    */
    public static LambdaQueryWrapper<GspInstitutionBuildingTransfer> getQueryWrapper(GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer){
        LambdaQueryWrapper<GspInstitutionBuildingTransfer> queryWrapper = new LambdaQueryWrapper<>();
        if (gspInstitutionBuildingTransfer.getId() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getId, gspInstitutionBuildingTransfer.getId());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getTenantId())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getTenantId, gspInstitutionBuildingTransfer.getTenantId());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getDataId())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getDataId, gspInstitutionBuildingTransfer.getDataId());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getInstitutionId())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getInstitutionId, gspInstitutionBuildingTransfer.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getInstitutionName())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getInstitutionName, gspInstitutionBuildingTransfer.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getCreditCode())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getCreditCode, gspInstitutionBuildingTransfer.getCreditCode());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getBuildingName())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getBuildingName, gspInstitutionBuildingTransfer.getBuildingName());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getStructure())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getStructure, gspInstitutionBuildingTransfer.getStructure());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getFloor())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getFloor, gspInstitutionBuildingTransfer.getFloor());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getFloorNum())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getFloorNum, gspInstitutionBuildingTransfer.getFloorNum());
        }
        if (gspInstitutionBuildingTransfer.getBuildingTime() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getBuildingTime, gspInstitutionBuildingTransfer.getBuildingTime());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getBuildingArea())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getBuildingArea, gspInstitutionBuildingTransfer.getBuildingArea());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getPrice())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getPrice, gspInstitutionBuildingTransfer.getPrice());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getOriginalValue())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getOriginalValue, gspInstitutionBuildingTransfer.getOriginalValue());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getResidueRatio())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getResidueRatio, gspInstitutionBuildingTransfer.getResidueRatio());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getNetValue())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getNetValue, gspInstitutionBuildingTransfer.getNetValue());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getTotalPrice())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getTotalPrice, gspInstitutionBuildingTransfer.getTotalPrice());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getBuildingType())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getBuildingType, gspInstitutionBuildingTransfer.getBuildingType());
        }
        if (gspInstitutionBuildingTransfer.getAreaCode() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getAreaCode, gspInstitutionBuildingTransfer.getAreaCode());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getAreaName())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getAreaName, gspInstitutionBuildingTransfer.getAreaName());
        }
        if (StringUtil.isNotEmpty(gspInstitutionBuildingTransfer.getRemark())) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getRemark, gspInstitutionBuildingTransfer.getRemark());
        }
        if (gspInstitutionBuildingTransfer.getCreateUser() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getCreateUser, gspInstitutionBuildingTransfer.getCreateUser());
        }
        if (gspInstitutionBuildingTransfer.getCreateDept() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getCreateDept, gspInstitutionBuildingTransfer.getCreateDept());
        }
        if (gspInstitutionBuildingTransfer.getCreateTime() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getCreateTime, gspInstitutionBuildingTransfer.getCreateTime());
        }
        if (gspInstitutionBuildingTransfer.getUpdateUser() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getUpdateUser, gspInstitutionBuildingTransfer.getUpdateUser());
        }
        if (gspInstitutionBuildingTransfer.getUpdateTime() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getUpdateTime, gspInstitutionBuildingTransfer.getUpdateTime());
        }
        if (gspInstitutionBuildingTransfer.getIsDeleted() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getIsDeleted, gspInstitutionBuildingTransfer.getIsDeleted());
        }
        if (gspInstitutionBuildingTransfer.getStatus() != null) {
            queryWrapper.eq(GspInstitutionBuildingTransfer::getStatus, gspInstitutionBuildingTransfer.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param gspInstitutionBuildingTransfer 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public GspInstitutionBuildingTransfer insert(GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer) {
        gspInstitutionBuildingTransfer.setId(null);
        getBaseMapper().insert(gspInstitutionBuildingTransfer);
        return gspInstitutionBuildingTransfer;
    }

    /**
    * 更新数据
    *
    * @param gspInstitutionBuildingTransfer 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public GspInstitutionBuildingTransfer update(GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<GspInstitutionBuildingTransfer> chainWrapper = new LambdaUpdateChainWrapper<GspInstitutionBuildingTransfer>(getBaseMapper());
        if (gspInstitutionBuildingTransfer.getId() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getId, gspInstitutionBuildingTransfer.getId());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getTenantId())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getTenantId, gspInstitutionBuildingTransfer.getTenantId());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getDataId())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getDataId, gspInstitutionBuildingTransfer.getDataId());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getInstitutionId())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getInstitutionId, gspInstitutionBuildingTransfer.getInstitutionId());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getInstitutionName())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getInstitutionName, gspInstitutionBuildingTransfer.getInstitutionName());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getCreditCode())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getCreditCode, gspInstitutionBuildingTransfer.getCreditCode());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getBuildingName())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getBuildingName, gspInstitutionBuildingTransfer.getBuildingName());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getStructure())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getStructure, gspInstitutionBuildingTransfer.getStructure());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getFloor())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getFloor, gspInstitutionBuildingTransfer.getFloor());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getFloorNum())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getFloorNum, gspInstitutionBuildingTransfer.getFloorNum());
        }
        if (gspInstitutionBuildingTransfer.getBuildingTime() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getBuildingTime, gspInstitutionBuildingTransfer.getBuildingTime());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getBuildingArea())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getBuildingArea, gspInstitutionBuildingTransfer.getBuildingArea());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getPrice())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getPrice, gspInstitutionBuildingTransfer.getPrice());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getOriginalValue())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getOriginalValue, gspInstitutionBuildingTransfer.getOriginalValue());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getResidueRatio())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getResidueRatio, gspInstitutionBuildingTransfer.getResidueRatio());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getNetValue())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getNetValue, gspInstitutionBuildingTransfer.getNetValue());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getTotalPrice())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getTotalPrice, gspInstitutionBuildingTransfer.getTotalPrice());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getBuildingType())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getBuildingType, gspInstitutionBuildingTransfer.getBuildingType());
        }
        if (gspInstitutionBuildingTransfer.getAreaCode() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getAreaCode, gspInstitutionBuildingTransfer.getAreaCode());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getAreaName())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getAreaName, gspInstitutionBuildingTransfer.getAreaName());
        }
        if (StringUtil.isNotBlank(gspInstitutionBuildingTransfer.getRemark())) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getRemark, gspInstitutionBuildingTransfer.getRemark());
        }
        if (gspInstitutionBuildingTransfer.getCreateUser() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getCreateUser, gspInstitutionBuildingTransfer.getCreateUser());
        }
        if (gspInstitutionBuildingTransfer.getCreateDept() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getCreateDept, gspInstitutionBuildingTransfer.getCreateDept());
        }
        if (gspInstitutionBuildingTransfer.getCreateTime() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getCreateTime, gspInstitutionBuildingTransfer.getCreateTime());
        }
        if (gspInstitutionBuildingTransfer.getUpdateUser() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getUpdateUser, gspInstitutionBuildingTransfer.getUpdateUser());
        }
        if (gspInstitutionBuildingTransfer.getUpdateTime() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getUpdateTime, gspInstitutionBuildingTransfer.getUpdateTime());
        }
        if (gspInstitutionBuildingTransfer.getIsDeleted() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getIsDeleted, gspInstitutionBuildingTransfer.getIsDeleted());
        }
        if (gspInstitutionBuildingTransfer.getStatus() != null) {
            chainWrapper.set(GspInstitutionBuildingTransfer::getStatus, gspInstitutionBuildingTransfer.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(GspInstitutionBuildingTransfer::getId, gspInstitutionBuildingTransfer.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(gspInstitutionBuildingTransfer.getId());
        } else {
            return gspInstitutionBuildingTransfer;
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
    public boolean saveGspInstitutionBuildingTransferBatch(List<GspInstitutionBuildingTransfer> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer : insertList) {
            //使用默认的雪花算法生成
            gspInstitutionBuildingTransfer.setId(null);
            //gspInstitutionBuildingTransfer.setCreatedDt(currentDte);
            //gspInstitutionBuildingTransfer.setUpdatedDt(currentDte);
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
    public Integer deleteGspInstitutionBuildingTransferBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<GspInstitutionBuildingTransfer> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


