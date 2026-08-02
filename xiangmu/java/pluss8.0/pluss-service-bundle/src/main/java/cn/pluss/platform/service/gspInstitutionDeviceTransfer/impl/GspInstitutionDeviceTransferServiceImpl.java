package cn.pluss.platform.service.gspInstitutionDeviceTransfer.impl;

import cn.pluss.platform.mapper.GspInstitutionDeviceTransferMapper;
import cn.pluss.platform.model.entity.GspInstitutionDeviceTransfer;
import cn.pluss.platform.service.gspInstitutionDeviceTransfer.GspInstitutionDeviceTransferService;
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
@Service("gspInstitutionDeviceTransferService")
public class GspInstitutionDeviceTransferServiceImpl extends ServiceImpl< GspInstitutionDeviceTransferMapper, GspInstitutionDeviceTransfer> implements GspInstitutionDeviceTransferService {
    private static final Logger logger = LoggerFactory.getLogger(GspInstitutionDeviceTransferServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<GspInstitutionDeviceTransfer> queryPage(Map map) {
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
    public GspInstitutionDeviceTransfer queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param gspInstitutionDeviceTransfer 实例对象
    * @return 实例对象
    */
    @Override
    public GspInstitutionDeviceTransfer queryOne(GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer){
        LambdaQueryWrapper<GspInstitutionDeviceTransfer> queryWrapper = getQueryWrapper(gspInstitutionDeviceTransfer);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param gspInstitutionDeviceTransfer
    * @return
    */
    @Override
    public List<GspInstitutionDeviceTransfer> queryList(GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer) {
        LambdaQueryWrapper<GspInstitutionDeviceTransfer> queryWrapper = getQueryWrapper(gspInstitutionDeviceTransfer);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param gspInstitutionDeviceTransfer
    * @return
    */
    public static LambdaQueryWrapper<GspInstitutionDeviceTransfer> getQueryWrapper(GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer){
        LambdaQueryWrapper<GspInstitutionDeviceTransfer> queryWrapper = new LambdaQueryWrapper<>();
        if (gspInstitutionDeviceTransfer.getId() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getId, gspInstitutionDeviceTransfer.getId());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getTenantId())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getTenantId, gspInstitutionDeviceTransfer.getTenantId());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getDataId())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getDataId, gspInstitutionDeviceTransfer.getDataId());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getInstitutionId())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getInstitutionId, gspInstitutionDeviceTransfer.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getInstitutionName())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getInstitutionName, gspInstitutionDeviceTransfer.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getDeviceCode())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getDeviceCode, gspInstitutionDeviceTransfer.getDeviceCode());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getDeviceName())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getDeviceName, gspInstitutionDeviceTransfer.getDeviceName());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getModel())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getModel, gspInstitutionDeviceTransfer.getModel());
        }
        if (gspInstitutionDeviceTransfer.getNum() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getNum, gspInstitutionDeviceTransfer.getNum());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getPrice())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getPrice, gspInstitutionDeviceTransfer.getPrice());
        }
        if (gspInstitutionDeviceTransfer.getBuyTime() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getBuyTime, gspInstitutionDeviceTransfer.getBuyTime());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getVender())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getVender, gspInstitutionDeviceTransfer.getVender());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getStorageLocation())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getStorageLocation, gspInstitutionDeviceTransfer.getStorageLocation());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getDeviceType())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getDeviceType, gspInstitutionDeviceTransfer.getDeviceType());
        }
        if (gspInstitutionDeviceTransfer.getAreaCode() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getAreaCode, gspInstitutionDeviceTransfer.getAreaCode());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getAreaName())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getAreaName, gspInstitutionDeviceTransfer.getAreaName());
        }
        if (StringUtil.isNotEmpty(gspInstitutionDeviceTransfer.getRemark())) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getRemark, gspInstitutionDeviceTransfer.getRemark());
        }
        if (gspInstitutionDeviceTransfer.getCreateUser() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getCreateUser, gspInstitutionDeviceTransfer.getCreateUser());
        }
        if (gspInstitutionDeviceTransfer.getCreateDept() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getCreateDept, gspInstitutionDeviceTransfer.getCreateDept());
        }
        if (gspInstitutionDeviceTransfer.getCreateTime() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getCreateTime, gspInstitutionDeviceTransfer.getCreateTime());
        }
        if (gspInstitutionDeviceTransfer.getUpdateUser() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getUpdateUser, gspInstitutionDeviceTransfer.getUpdateUser());
        }
        if (gspInstitutionDeviceTransfer.getUpdateTime() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getUpdateTime, gspInstitutionDeviceTransfer.getUpdateTime());
        }
        if (gspInstitutionDeviceTransfer.getIsDeleted() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getIsDeleted, gspInstitutionDeviceTransfer.getIsDeleted());
        }
        if (gspInstitutionDeviceTransfer.getStatus() != null) {
            queryWrapper.eq(GspInstitutionDeviceTransfer::getStatus, gspInstitutionDeviceTransfer.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param gspInstitutionDeviceTransfer 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public GspInstitutionDeviceTransfer insert(GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer) {
        gspInstitutionDeviceTransfer.setId(null);
        getBaseMapper().insert(gspInstitutionDeviceTransfer);
        return gspInstitutionDeviceTransfer;
    }

    /**
    * 更新数据
    *
    * @param gspInstitutionDeviceTransfer 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public GspInstitutionDeviceTransfer update(GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<GspInstitutionDeviceTransfer> chainWrapper = new LambdaUpdateChainWrapper<GspInstitutionDeviceTransfer>(getBaseMapper());
        if (gspInstitutionDeviceTransfer.getId() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getId, gspInstitutionDeviceTransfer.getId());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getTenantId())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getTenantId, gspInstitutionDeviceTransfer.getTenantId());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getDataId())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getDataId, gspInstitutionDeviceTransfer.getDataId());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getInstitutionId())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getInstitutionId, gspInstitutionDeviceTransfer.getInstitutionId());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getInstitutionName())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getInstitutionName, gspInstitutionDeviceTransfer.getInstitutionName());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getDeviceCode())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getDeviceCode, gspInstitutionDeviceTransfer.getDeviceCode());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getDeviceName())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getDeviceName, gspInstitutionDeviceTransfer.getDeviceName());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getModel())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getModel, gspInstitutionDeviceTransfer.getModel());
        }
        if (gspInstitutionDeviceTransfer.getNum() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getNum, gspInstitutionDeviceTransfer.getNum());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getPrice())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getPrice, gspInstitutionDeviceTransfer.getPrice());
        }
        if (gspInstitutionDeviceTransfer.getBuyTime() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getBuyTime, gspInstitutionDeviceTransfer.getBuyTime());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getVender())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getVender, gspInstitutionDeviceTransfer.getVender());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getStorageLocation())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getStorageLocation, gspInstitutionDeviceTransfer.getStorageLocation());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getDeviceType())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getDeviceType, gspInstitutionDeviceTransfer.getDeviceType());
        }
        if (gspInstitutionDeviceTransfer.getAreaCode() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getAreaCode, gspInstitutionDeviceTransfer.getAreaCode());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getAreaName())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getAreaName, gspInstitutionDeviceTransfer.getAreaName());
        }
        if (StringUtil.isNotBlank(gspInstitutionDeviceTransfer.getRemark())) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getRemark, gspInstitutionDeviceTransfer.getRemark());
        }
        if (gspInstitutionDeviceTransfer.getCreateUser() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getCreateUser, gspInstitutionDeviceTransfer.getCreateUser());
        }
        if (gspInstitutionDeviceTransfer.getCreateDept() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getCreateDept, gspInstitutionDeviceTransfer.getCreateDept());
        }
        if (gspInstitutionDeviceTransfer.getCreateTime() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getCreateTime, gspInstitutionDeviceTransfer.getCreateTime());
        }
        if (gspInstitutionDeviceTransfer.getUpdateUser() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getUpdateUser, gspInstitutionDeviceTransfer.getUpdateUser());
        }
        if (gspInstitutionDeviceTransfer.getUpdateTime() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getUpdateTime, gspInstitutionDeviceTransfer.getUpdateTime());
        }
        if (gspInstitutionDeviceTransfer.getIsDeleted() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getIsDeleted, gspInstitutionDeviceTransfer.getIsDeleted());
        }
        if (gspInstitutionDeviceTransfer.getStatus() != null) {
            chainWrapper.set(GspInstitutionDeviceTransfer::getStatus, gspInstitutionDeviceTransfer.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(GspInstitutionDeviceTransfer::getId, gspInstitutionDeviceTransfer.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(gspInstitutionDeviceTransfer.getId());
        } else {
            return gspInstitutionDeviceTransfer;
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
    public boolean saveGspInstitutionDeviceTransferBatch(List<GspInstitutionDeviceTransfer> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer : insertList) {
            //使用默认的雪花算法生成
            gspInstitutionDeviceTransfer.setId(null);
            //gspInstitutionDeviceTransfer.setCreatedDt(currentDte);
            //gspInstitutionDeviceTransfer.setUpdatedDt(currentDte);
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
    public Integer deleteGspInstitutionDeviceTransferBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<GspInstitutionDeviceTransfer> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


