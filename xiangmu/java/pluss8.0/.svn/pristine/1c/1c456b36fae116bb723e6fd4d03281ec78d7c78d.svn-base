package cn.pluss.platform.service.insFaceStaffSignRecord.impl;

import cn.pluss.platform.mapper.InsFaceStaffSignRecordMapper;
import cn.pluss.platform.model.entity.InsFaceStaffSignRecord;
import cn.pluss.platform.service.insFaceStaffSignRecord.InsFaceStaffSignRecordService;
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
@Service("insFaceStaffSignRecordService")
public class InsFaceStaffSignRecordServiceImpl extends ServiceImpl< InsFaceStaffSignRecordMapper, InsFaceStaffSignRecord> implements InsFaceStaffSignRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsFaceStaffSignRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsFaceStaffSignRecord> queryPage(Map map) {
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
    public InsFaceStaffSignRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insFaceStaffSignRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsFaceStaffSignRecord queryOne(InsFaceStaffSignRecord insFaceStaffSignRecord){
        LambdaQueryWrapper<InsFaceStaffSignRecord> queryWrapper = getQueryWrapper(insFaceStaffSignRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insFaceStaffSignRecord
    * @return
    */
    @Override
    public List<InsFaceStaffSignRecord> queryList(InsFaceStaffSignRecord insFaceStaffSignRecord) {
        LambdaQueryWrapper<InsFaceStaffSignRecord> queryWrapper = getQueryWrapper(insFaceStaffSignRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insFaceStaffSignRecord
    * @return
    */
    public static LambdaQueryWrapper<InsFaceStaffSignRecord> getQueryWrapper(InsFaceStaffSignRecord insFaceStaffSignRecord){
        LambdaQueryWrapper<InsFaceStaffSignRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insFaceStaffSignRecord.getId() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getId, insFaceStaffSignRecord.getId());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getTenantId())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getTenantId, insFaceStaffSignRecord.getTenantId());
        }
        if (insFaceStaffSignRecord.getCorpId() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getCorpId, insFaceStaffSignRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getCorpName())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getCorpName, insFaceStaffSignRecord.getCorpName());
        }
        if (insFaceStaffSignRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getInstitutionId, insFaceStaffSignRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getInstitutionName())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getInstitutionName, insFaceStaffSignRecord.getInstitutionName());
        }
        if (insFaceStaffSignRecord.getStaffId() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getStaffId, insFaceStaffSignRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getStaffName())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getStaffName, insFaceStaffSignRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getIdCard())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getIdCard, insFaceStaffSignRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getSex())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getSex, insFaceStaffSignRecord.getSex());
        }
        if (insFaceStaffSignRecord.getSignTime() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getSignTime, insFaceStaffSignRecord.getSignTime());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getSignPhoto())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getSignPhoto, insFaceStaffSignRecord.getSignPhoto());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getSignAddress())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getSignAddress, insFaceStaffSignRecord.getSignAddress());
        }
        if (insFaceStaffSignRecord.getTemperature() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getTemperature, insFaceStaffSignRecord.getTemperature());
        }
        if (insFaceStaffSignRecord.getAreaCode() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getAreaCode, insFaceStaffSignRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getAreaName())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getAreaName, insFaceStaffSignRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getRemark())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getRemark, insFaceStaffSignRecord.getRemark());
        }
        if (insFaceStaffSignRecord.getCreateUser() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getCreateUser, insFaceStaffSignRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insFaceStaffSignRecord.getCreateName())) {
            queryWrapper.eq(InsFaceStaffSignRecord::getCreateName, insFaceStaffSignRecord.getCreateName());
        }
        if (insFaceStaffSignRecord.getCreateDept() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getCreateDept, insFaceStaffSignRecord.getCreateDept());
        }
        if (insFaceStaffSignRecord.getCreateTime() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getCreateTime, insFaceStaffSignRecord.getCreateTime());
        }
        if (insFaceStaffSignRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getUpdateUser, insFaceStaffSignRecord.getUpdateUser());
        }
        if (insFaceStaffSignRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getUpdateTime, insFaceStaffSignRecord.getUpdateTime());
        }
        if (insFaceStaffSignRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getIsDeleted, insFaceStaffSignRecord.getIsDeleted());
        }
        if (insFaceStaffSignRecord.getStatus() != null) {
            queryWrapper.eq(InsFaceStaffSignRecord::getStatus, insFaceStaffSignRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insFaceStaffSignRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsFaceStaffSignRecord insert(InsFaceStaffSignRecord insFaceStaffSignRecord) {
        insFaceStaffSignRecord.setId(null);
        getBaseMapper().insert(insFaceStaffSignRecord);
        return insFaceStaffSignRecord;
    }

    /**
    * 更新数据
    *
    * @param insFaceStaffSignRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsFaceStaffSignRecord update(InsFaceStaffSignRecord insFaceStaffSignRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsFaceStaffSignRecord> chainWrapper = new LambdaUpdateChainWrapper<InsFaceStaffSignRecord>(getBaseMapper());
        if (insFaceStaffSignRecord.getId() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getId, insFaceStaffSignRecord.getId());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getTenantId())) {
            chainWrapper.set(InsFaceStaffSignRecord::getTenantId, insFaceStaffSignRecord.getTenantId());
        }
        if (insFaceStaffSignRecord.getCorpId() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getCorpId, insFaceStaffSignRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getCorpName())) {
            chainWrapper.set(InsFaceStaffSignRecord::getCorpName, insFaceStaffSignRecord.getCorpName());
        }
        if (insFaceStaffSignRecord.getInstitutionId() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getInstitutionId, insFaceStaffSignRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getInstitutionName())) {
            chainWrapper.set(InsFaceStaffSignRecord::getInstitutionName, insFaceStaffSignRecord.getInstitutionName());
        }
        if (insFaceStaffSignRecord.getStaffId() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getStaffId, insFaceStaffSignRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getStaffName())) {
            chainWrapper.set(InsFaceStaffSignRecord::getStaffName, insFaceStaffSignRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getIdCard())) {
            chainWrapper.set(InsFaceStaffSignRecord::getIdCard, insFaceStaffSignRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getSex())) {
            chainWrapper.set(InsFaceStaffSignRecord::getSex, insFaceStaffSignRecord.getSex());
        }
        if (insFaceStaffSignRecord.getSignTime() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getSignTime, insFaceStaffSignRecord.getSignTime());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getSignPhoto())) {
            chainWrapper.set(InsFaceStaffSignRecord::getSignPhoto, insFaceStaffSignRecord.getSignPhoto());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getSignAddress())) {
            chainWrapper.set(InsFaceStaffSignRecord::getSignAddress, insFaceStaffSignRecord.getSignAddress());
        }
        if (insFaceStaffSignRecord.getTemperature() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getTemperature, insFaceStaffSignRecord.getTemperature());
        }
        if (insFaceStaffSignRecord.getAreaCode() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getAreaCode, insFaceStaffSignRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getAreaName())) {
            chainWrapper.set(InsFaceStaffSignRecord::getAreaName, insFaceStaffSignRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getRemark())) {
            chainWrapper.set(InsFaceStaffSignRecord::getRemark, insFaceStaffSignRecord.getRemark());
        }
        if (insFaceStaffSignRecord.getCreateUser() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getCreateUser, insFaceStaffSignRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insFaceStaffSignRecord.getCreateName())) {
            chainWrapper.set(InsFaceStaffSignRecord::getCreateName, insFaceStaffSignRecord.getCreateName());
        }
        if (insFaceStaffSignRecord.getCreateDept() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getCreateDept, insFaceStaffSignRecord.getCreateDept());
        }
        if (insFaceStaffSignRecord.getCreateTime() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getCreateTime, insFaceStaffSignRecord.getCreateTime());
        }
        if (insFaceStaffSignRecord.getUpdateUser() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getUpdateUser, insFaceStaffSignRecord.getUpdateUser());
        }
        if (insFaceStaffSignRecord.getUpdateTime() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getUpdateTime, insFaceStaffSignRecord.getUpdateTime());
        }
        if (insFaceStaffSignRecord.getIsDeleted() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getIsDeleted, insFaceStaffSignRecord.getIsDeleted());
        }
        if (insFaceStaffSignRecord.getStatus() != null) {
            chainWrapper.set(InsFaceStaffSignRecord::getStatus, insFaceStaffSignRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsFaceStaffSignRecord::getId, insFaceStaffSignRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insFaceStaffSignRecord.getId());
        } else {
            return insFaceStaffSignRecord;
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
    public boolean saveInsFaceStaffSignRecordBatch(List<InsFaceStaffSignRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsFaceStaffSignRecord insFaceStaffSignRecord : insertList) {
            //使用默认的雪花算法生成
            insFaceStaffSignRecord.setId(null);
            //insFaceStaffSignRecord.setCreatedDt(currentDte);
            //insFaceStaffSignRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsFaceStaffSignRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsFaceStaffSignRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


