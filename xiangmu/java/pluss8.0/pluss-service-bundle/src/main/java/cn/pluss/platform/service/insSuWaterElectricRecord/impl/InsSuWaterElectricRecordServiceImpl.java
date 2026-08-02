package cn.pluss.platform.service.insSuWaterElectricRecord.impl;

import cn.pluss.platform.mapper.InsSuWaterElectricRecordMapper;
import cn.pluss.platform.model.entity.InsSuWaterElectricRecord;
import cn.pluss.platform.service.insSuWaterElectricRecord.InsSuWaterElectricRecordService;
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
@Service("insSuWaterElectricRecordService")
public class InsSuWaterElectricRecordServiceImpl extends ServiceImpl< InsSuWaterElectricRecordMapper, InsSuWaterElectricRecord> implements InsSuWaterElectricRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsSuWaterElectricRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSuWaterElectricRecord> queryPage(Map map) {
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
    public InsSuWaterElectricRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSuWaterElectricRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsSuWaterElectricRecord queryOne(InsSuWaterElectricRecord insSuWaterElectricRecord){
        LambdaQueryWrapper<InsSuWaterElectricRecord> queryWrapper = getQueryWrapper(insSuWaterElectricRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSuWaterElectricRecord
    * @return
    */
    @Override
    public List<InsSuWaterElectricRecord> queryList(InsSuWaterElectricRecord insSuWaterElectricRecord) {
        LambdaQueryWrapper<InsSuWaterElectricRecord> queryWrapper = getQueryWrapper(insSuWaterElectricRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSuWaterElectricRecord
    * @return
    */
    public static LambdaQueryWrapper<InsSuWaterElectricRecord> getQueryWrapper(InsSuWaterElectricRecord insSuWaterElectricRecord){
        LambdaQueryWrapper<InsSuWaterElectricRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insSuWaterElectricRecord.getId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getId, insSuWaterElectricRecord.getId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getTenantId())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getTenantId, insSuWaterElectricRecord.getTenantId());
        }
        if (insSuWaterElectricRecord.getCorpId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getCorpId, insSuWaterElectricRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getCorpName())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getCorpName, insSuWaterElectricRecord.getCorpName());
        }
        if (insSuWaterElectricRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getInstitutionId, insSuWaterElectricRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getInstitutionName())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getInstitutionName, insSuWaterElectricRecord.getInstitutionName());
        }
        if (insSuWaterElectricRecord.getBuildingId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getBuildingId, insSuWaterElectricRecord.getBuildingId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getBuildingName())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getBuildingName, insSuWaterElectricRecord.getBuildingName());
        }
        if (insSuWaterElectricRecord.getFloorId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getFloorId, insSuWaterElectricRecord.getFloorId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getFloorName())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getFloorName, insSuWaterElectricRecord.getFloorName());
        }
        if (insSuWaterElectricRecord.getRoomId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getRoomId, insSuWaterElectricRecord.getRoomId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getRoomName())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getRoomName, insSuWaterElectricRecord.getRoomName());
        }
        if (insSuWaterElectricRecord.getReadingDate() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getReadingDate, insSuWaterElectricRecord.getReadingDate());
        }
        if (insSuWaterElectricRecord.getWaterPrice() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getWaterPrice, insSuWaterElectricRecord.getWaterPrice());
        }
        if (insSuWaterElectricRecord.getWaterNumber() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getWaterNumber, insSuWaterElectricRecord.getWaterNumber());
        }
        if (insSuWaterElectricRecord.getElectricPrice() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getElectricPrice, insSuWaterElectricRecord.getElectricPrice());
        }
        if (insSuWaterElectricRecord.getElectricNumber() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getElectricNumber, insSuWaterElectricRecord.getElectricNumber());
        }
        if (insSuWaterElectricRecord.getHotWaterPrice() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getHotWaterPrice, insSuWaterElectricRecord.getHotWaterPrice());
        }
        if (insSuWaterElectricRecord.getHotWaterNumber() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getHotWaterNumber, insSuWaterElectricRecord.getHotWaterNumber());
        }
        if (insSuWaterElectricRecord.getHeatingPrice() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getHeatingPrice, insSuWaterElectricRecord.getHeatingPrice());
        }
        if (insSuWaterElectricRecord.getHeatingNumber() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getHeatingNumber, insSuWaterElectricRecord.getHeatingNumber());
        }
        if (insSuWaterElectricRecord.getStartDate() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getStartDate, insSuWaterElectricRecord.getStartDate());
        }
        if (insSuWaterElectricRecord.getEndDate() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getEndDate, insSuWaterElectricRecord.getEndDate());
        }
        if (insSuWaterElectricRecord.getWaterTotalAmount() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getWaterTotalAmount, insSuWaterElectricRecord.getWaterTotalAmount());
        }
        if (insSuWaterElectricRecord.getElectricTotalAmount() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getElectricTotalAmount, insSuWaterElectricRecord.getElectricTotalAmount());
        }
        if (insSuWaterElectricRecord.getHotWaterTotalAmount() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getHotWaterTotalAmount, insSuWaterElectricRecord.getHotWaterTotalAmount());
        }
        if (insSuWaterElectricRecord.getHeatingTotalAmount() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getHeatingTotalAmount, insSuWaterElectricRecord.getHeatingTotalAmount());
        }
        if (insSuWaterElectricRecord.getSettlementState() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getSettlementState, insSuWaterElectricRecord.getSettlementState());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getAreaCode())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getAreaCode, insSuWaterElectricRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getAreaName())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getAreaName, insSuWaterElectricRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getRemark())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getRemark, insSuWaterElectricRecord.getRemark());
        }
        if (insSuWaterElectricRecord.getCreateUser() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getCreateUser, insSuWaterElectricRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecord.getCreateName())) {
            queryWrapper.eq(InsSuWaterElectricRecord::getCreateName, insSuWaterElectricRecord.getCreateName());
        }
        if (insSuWaterElectricRecord.getCreateDept() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getCreateDept, insSuWaterElectricRecord.getCreateDept());
        }
        if (insSuWaterElectricRecord.getCreateTime() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getCreateTime, insSuWaterElectricRecord.getCreateTime());
        }
        if (insSuWaterElectricRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getUpdateUser, insSuWaterElectricRecord.getUpdateUser());
        }
        if (insSuWaterElectricRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getUpdateTime, insSuWaterElectricRecord.getUpdateTime());
        }
        if (insSuWaterElectricRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getIsDeleted, insSuWaterElectricRecord.getIsDeleted());
        }
        if (insSuWaterElectricRecord.getStatus() != null) {
            queryWrapper.eq(InsSuWaterElectricRecord::getStatus, insSuWaterElectricRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSuWaterElectricRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuWaterElectricRecord insert(InsSuWaterElectricRecord insSuWaterElectricRecord) {
        insSuWaterElectricRecord.setId(null);
        getBaseMapper().insert(insSuWaterElectricRecord);
        return insSuWaterElectricRecord;
    }

    /**
    * 更新数据
    *
    * @param insSuWaterElectricRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuWaterElectricRecord update(InsSuWaterElectricRecord insSuWaterElectricRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSuWaterElectricRecord> chainWrapper = new LambdaUpdateChainWrapper<InsSuWaterElectricRecord>(getBaseMapper());
        if (insSuWaterElectricRecord.getId() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getId, insSuWaterElectricRecord.getId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getTenantId())) {
            chainWrapper.set(InsSuWaterElectricRecord::getTenantId, insSuWaterElectricRecord.getTenantId());
        }
        if (insSuWaterElectricRecord.getCorpId() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getCorpId, insSuWaterElectricRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getCorpName())) {
            chainWrapper.set(InsSuWaterElectricRecord::getCorpName, insSuWaterElectricRecord.getCorpName());
        }
        if (insSuWaterElectricRecord.getInstitutionId() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getInstitutionId, insSuWaterElectricRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getInstitutionName())) {
            chainWrapper.set(InsSuWaterElectricRecord::getInstitutionName, insSuWaterElectricRecord.getInstitutionName());
        }
        if (insSuWaterElectricRecord.getBuildingId() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getBuildingId, insSuWaterElectricRecord.getBuildingId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getBuildingName())) {
            chainWrapper.set(InsSuWaterElectricRecord::getBuildingName, insSuWaterElectricRecord.getBuildingName());
        }
        if (insSuWaterElectricRecord.getFloorId() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getFloorId, insSuWaterElectricRecord.getFloorId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getFloorName())) {
            chainWrapper.set(InsSuWaterElectricRecord::getFloorName, insSuWaterElectricRecord.getFloorName());
        }
        if (insSuWaterElectricRecord.getRoomId() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getRoomId, insSuWaterElectricRecord.getRoomId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getRoomName())) {
            chainWrapper.set(InsSuWaterElectricRecord::getRoomName, insSuWaterElectricRecord.getRoomName());
        }
        if (insSuWaterElectricRecord.getReadingDate() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getReadingDate, insSuWaterElectricRecord.getReadingDate());
        }
        if (insSuWaterElectricRecord.getWaterPrice() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getWaterPrice, insSuWaterElectricRecord.getWaterPrice());
        }
        if (insSuWaterElectricRecord.getWaterNumber() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getWaterNumber, insSuWaterElectricRecord.getWaterNumber());
        }
        if (insSuWaterElectricRecord.getElectricPrice() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getElectricPrice, insSuWaterElectricRecord.getElectricPrice());
        }
        if (insSuWaterElectricRecord.getElectricNumber() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getElectricNumber, insSuWaterElectricRecord.getElectricNumber());
        }
        if (insSuWaterElectricRecord.getHotWaterPrice() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getHotWaterPrice, insSuWaterElectricRecord.getHotWaterPrice());
        }
        if (insSuWaterElectricRecord.getHotWaterNumber() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getHotWaterNumber, insSuWaterElectricRecord.getHotWaterNumber());
        }
        if (insSuWaterElectricRecord.getHeatingPrice() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getHeatingPrice, insSuWaterElectricRecord.getHeatingPrice());
        }
        if (insSuWaterElectricRecord.getHeatingNumber() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getHeatingNumber, insSuWaterElectricRecord.getHeatingNumber());
        }
        if (insSuWaterElectricRecord.getStartDate() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getStartDate, insSuWaterElectricRecord.getStartDate());
        }
        if (insSuWaterElectricRecord.getEndDate() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getEndDate, insSuWaterElectricRecord.getEndDate());
        }
        if (insSuWaterElectricRecord.getWaterTotalAmount() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getWaterTotalAmount, insSuWaterElectricRecord.getWaterTotalAmount());
        }
        if (insSuWaterElectricRecord.getElectricTotalAmount() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getElectricTotalAmount, insSuWaterElectricRecord.getElectricTotalAmount());
        }
        if (insSuWaterElectricRecord.getHotWaterTotalAmount() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getHotWaterTotalAmount, insSuWaterElectricRecord.getHotWaterTotalAmount());
        }
        if (insSuWaterElectricRecord.getHeatingTotalAmount() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getHeatingTotalAmount, insSuWaterElectricRecord.getHeatingTotalAmount());
        }
        if (insSuWaterElectricRecord.getSettlementState() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getSettlementState, insSuWaterElectricRecord.getSettlementState());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getAreaCode())) {
            chainWrapper.set(InsSuWaterElectricRecord::getAreaCode, insSuWaterElectricRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getAreaName())) {
            chainWrapper.set(InsSuWaterElectricRecord::getAreaName, insSuWaterElectricRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getRemark())) {
            chainWrapper.set(InsSuWaterElectricRecord::getRemark, insSuWaterElectricRecord.getRemark());
        }
        if (insSuWaterElectricRecord.getCreateUser() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getCreateUser, insSuWaterElectricRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecord.getCreateName())) {
            chainWrapper.set(InsSuWaterElectricRecord::getCreateName, insSuWaterElectricRecord.getCreateName());
        }
        if (insSuWaterElectricRecord.getCreateDept() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getCreateDept, insSuWaterElectricRecord.getCreateDept());
        }
        if (insSuWaterElectricRecord.getCreateTime() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getCreateTime, insSuWaterElectricRecord.getCreateTime());
        }
        if (insSuWaterElectricRecord.getUpdateUser() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getUpdateUser, insSuWaterElectricRecord.getUpdateUser());
        }
        if (insSuWaterElectricRecord.getUpdateTime() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getUpdateTime, insSuWaterElectricRecord.getUpdateTime());
        }
        if (insSuWaterElectricRecord.getIsDeleted() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getIsDeleted, insSuWaterElectricRecord.getIsDeleted());
        }
        if (insSuWaterElectricRecord.getStatus() != null) {
            chainWrapper.set(InsSuWaterElectricRecord::getStatus, insSuWaterElectricRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSuWaterElectricRecord::getId, insSuWaterElectricRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSuWaterElectricRecord.getId());
        } else {
            return insSuWaterElectricRecord;
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
    public boolean saveInsSuWaterElectricRecordBatch(List<InsSuWaterElectricRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSuWaterElectricRecord insSuWaterElectricRecord : insertList) {
            //使用默认的雪花算法生成
            insSuWaterElectricRecord.setId(null);
            //insSuWaterElectricRecord.setCreatedDt(currentDte);
            //insSuWaterElectricRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsSuWaterElectricRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSuWaterElectricRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


