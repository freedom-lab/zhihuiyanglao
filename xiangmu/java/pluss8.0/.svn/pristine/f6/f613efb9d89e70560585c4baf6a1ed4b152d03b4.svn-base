package cn.pluss.platform.service.insMedicalCheckRoomRecord.impl;

import cn.pluss.platform.mapper.InsMedicalCheckRoomRecordMapper;
import cn.pluss.platform.model.entity.InsMedicalCheckRoomRecord;
import cn.pluss.platform.service.insMedicalCheckRoomRecord.InsMedicalCheckRoomRecordService;
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
@Service("insMedicalCheckRoomRecordService")
public class InsMedicalCheckRoomRecordServiceImpl extends ServiceImpl< InsMedicalCheckRoomRecordMapper, InsMedicalCheckRoomRecord> implements InsMedicalCheckRoomRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsMedicalCheckRoomRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsMedicalCheckRoomRecord> queryPage(Map map) {
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
    public InsMedicalCheckRoomRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalCheckRoomRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsMedicalCheckRoomRecord queryOne(InsMedicalCheckRoomRecord insMedicalCheckRoomRecord){
        LambdaQueryWrapper<InsMedicalCheckRoomRecord> queryWrapper = getQueryWrapper(insMedicalCheckRoomRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalCheckRoomRecord
    * @return
    */
    @Override
    public List<InsMedicalCheckRoomRecord> queryList(InsMedicalCheckRoomRecord insMedicalCheckRoomRecord) {
        LambdaQueryWrapper<InsMedicalCheckRoomRecord> queryWrapper = getQueryWrapper(insMedicalCheckRoomRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insMedicalCheckRoomRecord
    * @return
    */
    public static LambdaQueryWrapper<InsMedicalCheckRoomRecord> getQueryWrapper(InsMedicalCheckRoomRecord insMedicalCheckRoomRecord){
        LambdaQueryWrapper<InsMedicalCheckRoomRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insMedicalCheckRoomRecord.getId() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getId, insMedicalCheckRoomRecord.getId());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getTenantId())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getTenantId, insMedicalCheckRoomRecord.getTenantId());
        }
        if (insMedicalCheckRoomRecord.getCorpId() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCorpId, insMedicalCheckRoomRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getCorpName())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCorpName, insMedicalCheckRoomRecord.getCorpName());
        }
        if (insMedicalCheckRoomRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getInstitutionId, insMedicalCheckRoomRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getInstitutionName())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getInstitutionName, insMedicalCheckRoomRecord.getInstitutionName());
        }
        if (insMedicalCheckRoomRecord.getCheckId() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCheckId, insMedicalCheckRoomRecord.getCheckId());
        }
        if (insMedicalCheckRoomRecord.getCheckDate() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCheckDate, insMedicalCheckRoomRecord.getCheckDate());
        }
        if (insMedicalCheckRoomRecord.getElderId() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getElderId, insMedicalCheckRoomRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getElderName())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getElderName, insMedicalCheckRoomRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getIdCard())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getIdCard, insMedicalCheckRoomRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getSex())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getSex, insMedicalCheckRoomRecord.getSex());
        }
        if (insMedicalCheckRoomRecord.getCheckTime() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCheckTime, insMedicalCheckRoomRecord.getCheckTime());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getCheckContent())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCheckContent, insMedicalCheckRoomRecord.getCheckContent());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getHandleResult())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getHandleResult, insMedicalCheckRoomRecord.getHandleResult());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getCheckName())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCheckName, insMedicalCheckRoomRecord.getCheckName());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getAreaCode())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getAreaCode, insMedicalCheckRoomRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getAreaName())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getAreaName, insMedicalCheckRoomRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getRemark())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getRemark, insMedicalCheckRoomRecord.getRemark());
        }
        if (insMedicalCheckRoomRecord.getCreateUser() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCreateUser, insMedicalCheckRoomRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insMedicalCheckRoomRecord.getCreateName())) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCreateName, insMedicalCheckRoomRecord.getCreateName());
        }
        if (insMedicalCheckRoomRecord.getCreateDept() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCreateDept, insMedicalCheckRoomRecord.getCreateDept());
        }
        if (insMedicalCheckRoomRecord.getCreateTime() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getCreateTime, insMedicalCheckRoomRecord.getCreateTime());
        }
        if (insMedicalCheckRoomRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getUpdateUser, insMedicalCheckRoomRecord.getUpdateUser());
        }
        if (insMedicalCheckRoomRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getUpdateTime, insMedicalCheckRoomRecord.getUpdateTime());
        }
        if (insMedicalCheckRoomRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getIsDeleted, insMedicalCheckRoomRecord.getIsDeleted());
        }
        if (insMedicalCheckRoomRecord.getStatus() != null) {
            queryWrapper.eq(InsMedicalCheckRoomRecord::getStatus, insMedicalCheckRoomRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insMedicalCheckRoomRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalCheckRoomRecord insert(InsMedicalCheckRoomRecord insMedicalCheckRoomRecord) {
        insMedicalCheckRoomRecord.setId(null);
        getBaseMapper().insert(insMedicalCheckRoomRecord);
        return insMedicalCheckRoomRecord;
    }

    /**
    * 更新数据
    *
    * @param insMedicalCheckRoomRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalCheckRoomRecord update(InsMedicalCheckRoomRecord insMedicalCheckRoomRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsMedicalCheckRoomRecord> chainWrapper = new LambdaUpdateChainWrapper<InsMedicalCheckRoomRecord>(getBaseMapper());
        if (insMedicalCheckRoomRecord.getId() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getId, insMedicalCheckRoomRecord.getId());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getTenantId())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getTenantId, insMedicalCheckRoomRecord.getTenantId());
        }
        if (insMedicalCheckRoomRecord.getCorpId() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCorpId, insMedicalCheckRoomRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getCorpName())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCorpName, insMedicalCheckRoomRecord.getCorpName());
        }
        if (insMedicalCheckRoomRecord.getInstitutionId() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getInstitutionId, insMedicalCheckRoomRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getInstitutionName())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getInstitutionName, insMedicalCheckRoomRecord.getInstitutionName());
        }
        if (insMedicalCheckRoomRecord.getCheckId() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCheckId, insMedicalCheckRoomRecord.getCheckId());
        }
        if (insMedicalCheckRoomRecord.getCheckDate() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCheckDate, insMedicalCheckRoomRecord.getCheckDate());
        }
        if (insMedicalCheckRoomRecord.getElderId() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getElderId, insMedicalCheckRoomRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getElderName())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getElderName, insMedicalCheckRoomRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getIdCard())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getIdCard, insMedicalCheckRoomRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getSex())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getSex, insMedicalCheckRoomRecord.getSex());
        }
        if (insMedicalCheckRoomRecord.getCheckTime() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCheckTime, insMedicalCheckRoomRecord.getCheckTime());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getCheckContent())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCheckContent, insMedicalCheckRoomRecord.getCheckContent());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getHandleResult())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getHandleResult, insMedicalCheckRoomRecord.getHandleResult());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getCheckName())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCheckName, insMedicalCheckRoomRecord.getCheckName());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getAreaCode())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getAreaCode, insMedicalCheckRoomRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getAreaName())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getAreaName, insMedicalCheckRoomRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getRemark())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getRemark, insMedicalCheckRoomRecord.getRemark());
        }
        if (insMedicalCheckRoomRecord.getCreateUser() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCreateUser, insMedicalCheckRoomRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insMedicalCheckRoomRecord.getCreateName())) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCreateName, insMedicalCheckRoomRecord.getCreateName());
        }
        if (insMedicalCheckRoomRecord.getCreateDept() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCreateDept, insMedicalCheckRoomRecord.getCreateDept());
        }
        if (insMedicalCheckRoomRecord.getCreateTime() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getCreateTime, insMedicalCheckRoomRecord.getCreateTime());
        }
        if (insMedicalCheckRoomRecord.getUpdateUser() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getUpdateUser, insMedicalCheckRoomRecord.getUpdateUser());
        }
        if (insMedicalCheckRoomRecord.getUpdateTime() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getUpdateTime, insMedicalCheckRoomRecord.getUpdateTime());
        }
        if (insMedicalCheckRoomRecord.getIsDeleted() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getIsDeleted, insMedicalCheckRoomRecord.getIsDeleted());
        }
        if (insMedicalCheckRoomRecord.getStatus() != null) {
            chainWrapper.set(InsMedicalCheckRoomRecord::getStatus, insMedicalCheckRoomRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsMedicalCheckRoomRecord::getId, insMedicalCheckRoomRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insMedicalCheckRoomRecord.getId());
        } else {
            return insMedicalCheckRoomRecord;
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
    public boolean saveInsMedicalCheckRoomRecordBatch(List<InsMedicalCheckRoomRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsMedicalCheckRoomRecord insMedicalCheckRoomRecord : insertList) {
            //使用默认的雪花算法生成
            insMedicalCheckRoomRecord.setId(null);
            //insMedicalCheckRoomRecord.setCreatedDt(currentDte);
            //insMedicalCheckRoomRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsMedicalCheckRoomRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsMedicalCheckRoomRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


