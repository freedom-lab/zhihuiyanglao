package cn.pluss.platform.service.insSuddenComplaintRecord.impl;

import cn.pluss.platform.mapper.InsSuddenComplaintRecordMapper;
import cn.pluss.platform.model.entity.InsSuddenComplaintRecord;
import cn.pluss.platform.service.insSuddenComplaintRecord.InsSuddenComplaintRecordService;
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
@Service("insSuddenComplaintRecordService")
public class InsSuddenComplaintRecordServiceImpl extends ServiceImpl< InsSuddenComplaintRecordMapper, InsSuddenComplaintRecord> implements InsSuddenComplaintRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsSuddenComplaintRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSuddenComplaintRecord> queryPage(Map map) {
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
    public InsSuddenComplaintRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSuddenComplaintRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsSuddenComplaintRecord queryOne(InsSuddenComplaintRecord insSuddenComplaintRecord){
        LambdaQueryWrapper<InsSuddenComplaintRecord> queryWrapper = getQueryWrapper(insSuddenComplaintRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSuddenComplaintRecord
    * @return
    */
    @Override
    public List<InsSuddenComplaintRecord> queryList(InsSuddenComplaintRecord insSuddenComplaintRecord) {
        LambdaQueryWrapper<InsSuddenComplaintRecord> queryWrapper = getQueryWrapper(insSuddenComplaintRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSuddenComplaintRecord
    * @return
    */
    public static LambdaQueryWrapper<InsSuddenComplaintRecord> getQueryWrapper(InsSuddenComplaintRecord insSuddenComplaintRecord){
        LambdaQueryWrapper<InsSuddenComplaintRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insSuddenComplaintRecord.getId() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getId, insSuddenComplaintRecord.getId());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getTenantId())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getTenantId, insSuddenComplaintRecord.getTenantId());
        }
        if (insSuddenComplaintRecord.getCorpId() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getCorpId, insSuddenComplaintRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getCorpName())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getCorpName, insSuddenComplaintRecord.getCorpName());
        }
        if (insSuddenComplaintRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getInstitutionId, insSuddenComplaintRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getInstitutionName())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getInstitutionName, insSuddenComplaintRecord.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getComplaintType())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getComplaintType, insSuddenComplaintRecord.getComplaintType());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getComplaintName())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getComplaintName, insSuddenComplaintRecord.getComplaintName());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getLinkTel())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getLinkTel, insSuddenComplaintRecord.getLinkTel());
        }
        if (insSuddenComplaintRecord.getComplaintTime() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getComplaintTime, insSuddenComplaintRecord.getComplaintTime());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getComplaintContent())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getComplaintContent, insSuddenComplaintRecord.getComplaintContent());
        }
        if (insSuddenComplaintRecord.getHandleState() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getHandleState, insSuddenComplaintRecord.getHandleState());
        }
        if (insSuddenComplaintRecord.getHandleId() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getHandleId, insSuddenComplaintRecord.getHandleId());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getHandleName())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getHandleName, insSuddenComplaintRecord.getHandleName());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getHandleResults())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getHandleResults, insSuddenComplaintRecord.getHandleResults());
        }
        if (insSuddenComplaintRecord.getHandleTime() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getHandleTime, insSuddenComplaintRecord.getHandleTime());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getRemark())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getRemark, insSuddenComplaintRecord.getRemark());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getFilePath())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getFilePath, insSuddenComplaintRecord.getFilePath());
        }
        if (insSuddenComplaintRecord.getCreateUser() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getCreateUser, insSuddenComplaintRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSuddenComplaintRecord.getCreateName())) {
            queryWrapper.eq(InsSuddenComplaintRecord::getCreateName, insSuddenComplaintRecord.getCreateName());
        }
        if (insSuddenComplaintRecord.getCreateDept() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getCreateDept, insSuddenComplaintRecord.getCreateDept());
        }
        if (insSuddenComplaintRecord.getCreateTime() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getCreateTime, insSuddenComplaintRecord.getCreateTime());
        }
        if (insSuddenComplaintRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getUpdateUser, insSuddenComplaintRecord.getUpdateUser());
        }
        if (insSuddenComplaintRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getUpdateTime, insSuddenComplaintRecord.getUpdateTime());
        }
        if (insSuddenComplaintRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getIsDeleted, insSuddenComplaintRecord.getIsDeleted());
        }
        if (insSuddenComplaintRecord.getStatus() != null) {
            queryWrapper.eq(InsSuddenComplaintRecord::getStatus, insSuddenComplaintRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSuddenComplaintRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenComplaintRecord insert(InsSuddenComplaintRecord insSuddenComplaintRecord) {
        insSuddenComplaintRecord.setId(null);
        getBaseMapper().insert(insSuddenComplaintRecord);
        return insSuddenComplaintRecord;
    }

    /**
    * 更新数据
    *
    * @param insSuddenComplaintRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenComplaintRecord update(InsSuddenComplaintRecord insSuddenComplaintRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSuddenComplaintRecord> chainWrapper = new LambdaUpdateChainWrapper<InsSuddenComplaintRecord>(getBaseMapper());
        if (insSuddenComplaintRecord.getId() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getId, insSuddenComplaintRecord.getId());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getTenantId())) {
            chainWrapper.set(InsSuddenComplaintRecord::getTenantId, insSuddenComplaintRecord.getTenantId());
        }
        if (insSuddenComplaintRecord.getCorpId() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getCorpId, insSuddenComplaintRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getCorpName())) {
            chainWrapper.set(InsSuddenComplaintRecord::getCorpName, insSuddenComplaintRecord.getCorpName());
        }
        if (insSuddenComplaintRecord.getInstitutionId() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getInstitutionId, insSuddenComplaintRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getInstitutionName())) {
            chainWrapper.set(InsSuddenComplaintRecord::getInstitutionName, insSuddenComplaintRecord.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getComplaintType())) {
            chainWrapper.set(InsSuddenComplaintRecord::getComplaintType, insSuddenComplaintRecord.getComplaintType());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getComplaintName())) {
            chainWrapper.set(InsSuddenComplaintRecord::getComplaintName, insSuddenComplaintRecord.getComplaintName());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getLinkTel())) {
            chainWrapper.set(InsSuddenComplaintRecord::getLinkTel, insSuddenComplaintRecord.getLinkTel());
        }
        if (insSuddenComplaintRecord.getComplaintTime() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getComplaintTime, insSuddenComplaintRecord.getComplaintTime());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getComplaintContent())) {
            chainWrapper.set(InsSuddenComplaintRecord::getComplaintContent, insSuddenComplaintRecord.getComplaintContent());
        }
        if (insSuddenComplaintRecord.getHandleState() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getHandleState, insSuddenComplaintRecord.getHandleState());
        }
        if (insSuddenComplaintRecord.getHandleId() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getHandleId, insSuddenComplaintRecord.getHandleId());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getHandleName())) {
            chainWrapper.set(InsSuddenComplaintRecord::getHandleName, insSuddenComplaintRecord.getHandleName());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getHandleResults())) {
            chainWrapper.set(InsSuddenComplaintRecord::getHandleResults, insSuddenComplaintRecord.getHandleResults());
        }
        if (insSuddenComplaintRecord.getHandleTime() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getHandleTime, insSuddenComplaintRecord.getHandleTime());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getRemark())) {
            chainWrapper.set(InsSuddenComplaintRecord::getRemark, insSuddenComplaintRecord.getRemark());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getFilePath())) {
            chainWrapper.set(InsSuddenComplaintRecord::getFilePath, insSuddenComplaintRecord.getFilePath());
        }
        if (insSuddenComplaintRecord.getCreateUser() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getCreateUser, insSuddenComplaintRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSuddenComplaintRecord.getCreateName())) {
            chainWrapper.set(InsSuddenComplaintRecord::getCreateName, insSuddenComplaintRecord.getCreateName());
        }
        if (insSuddenComplaintRecord.getCreateDept() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getCreateDept, insSuddenComplaintRecord.getCreateDept());
        }
        if (insSuddenComplaintRecord.getCreateTime() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getCreateTime, insSuddenComplaintRecord.getCreateTime());
        }
        if (insSuddenComplaintRecord.getUpdateUser() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getUpdateUser, insSuddenComplaintRecord.getUpdateUser());
        }
        if (insSuddenComplaintRecord.getUpdateTime() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getUpdateTime, insSuddenComplaintRecord.getUpdateTime());
        }
        if (insSuddenComplaintRecord.getIsDeleted() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getIsDeleted, insSuddenComplaintRecord.getIsDeleted());
        }
        if (insSuddenComplaintRecord.getStatus() != null) {
            chainWrapper.set(InsSuddenComplaintRecord::getStatus, insSuddenComplaintRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSuddenComplaintRecord::getId, insSuddenComplaintRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSuddenComplaintRecord.getId());
        } else {
            return insSuddenComplaintRecord;
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
    public boolean saveInsSuddenComplaintRecordBatch(List<InsSuddenComplaintRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSuddenComplaintRecord insSuddenComplaintRecord : insertList) {
            //使用默认的雪花算法生成
            insSuddenComplaintRecord.setId(null);
            //insSuddenComplaintRecord.setCreatedDt(currentDte);
            //insSuddenComplaintRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsSuddenComplaintRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSuddenComplaintRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


