package cn.pluss.platform.service.careAccidentRecord.impl;

import cn.pluss.platform.mapper.CareAccidentRecordMapper;
import cn.pluss.platform.model.entity.CareAccidentRecord;
import cn.pluss.platform.service.careAccidentRecord.CareAccidentRecordService;
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
@Service("careAccidentRecordService")
public class CareAccidentRecordServiceImpl extends ServiceImpl< CareAccidentRecordMapper, CareAccidentRecord> implements CareAccidentRecordService {
    private static final Logger logger = LoggerFactory.getLogger(CareAccidentRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CareAccidentRecord> queryPage(Map map) {
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
    public CareAccidentRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param careAccidentRecord 实例对象
    * @return 实例对象
    */
    @Override
    public CareAccidentRecord queryOne(CareAccidentRecord careAccidentRecord){
        LambdaQueryWrapper<CareAccidentRecord> queryWrapper = getQueryWrapper(careAccidentRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param careAccidentRecord
    * @return
    */
    @Override
    public List<CareAccidentRecord> queryList(CareAccidentRecord careAccidentRecord) {
        LambdaQueryWrapper<CareAccidentRecord> queryWrapper = getQueryWrapper(careAccidentRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param careAccidentRecord
    * @return
    */
    public static LambdaQueryWrapper<CareAccidentRecord> getQueryWrapper(CareAccidentRecord careAccidentRecord){
        LambdaQueryWrapper<CareAccidentRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (careAccidentRecord.getId() != null) {
            queryWrapper.eq(CareAccidentRecord::getId, careAccidentRecord.getId());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getTenantId())) {
            queryWrapper.eq(CareAccidentRecord::getTenantId, careAccidentRecord.getTenantId());
        }
        if (careAccidentRecord.getCorpId() != null) {
            queryWrapper.eq(CareAccidentRecord::getCorpId, careAccidentRecord.getCorpId());
        }
        if (careAccidentRecord.getInstitutionId() != null) {
            queryWrapper.eq(CareAccidentRecord::getInstitutionId, careAccidentRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getInstitutionName())) {
            queryWrapper.eq(CareAccidentRecord::getInstitutionName, careAccidentRecord.getInstitutionName());
        }
        if (careAccidentRecord.getElderId() != null) {
            queryWrapper.eq(CareAccidentRecord::getElderId, careAccidentRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getElderName())) {
            queryWrapper.eq(CareAccidentRecord::getElderName, careAccidentRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getAccidentType())) {
            queryWrapper.eq(CareAccidentRecord::getAccidentType, careAccidentRecord.getAccidentType());
        }
        if (careAccidentRecord.getOccurDate() != null) {
            queryWrapper.eq(CareAccidentRecord::getOccurDate, careAccidentRecord.getOccurDate());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getPlace())) {
            queryWrapper.eq(CareAccidentRecord::getPlace, careAccidentRecord.getPlace());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getExplainText())) {
            queryWrapper.eq(CareAccidentRecord::getExplainText, careAccidentRecord.getExplainText());
        }
        if (careAccidentRecord.getServerId() != null) {
            queryWrapper.eq(CareAccidentRecord::getServerId, careAccidentRecord.getServerId());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getServerName())) {
            queryWrapper.eq(CareAccidentRecord::getServerName, careAccidentRecord.getServerName());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getResult())) {
            queryWrapper.eq(CareAccidentRecord::getResult, careAccidentRecord.getResult());
        }
        if (careAccidentRecord.getAreaCode() != null) {
            queryWrapper.eq(CareAccidentRecord::getAreaCode, careAccidentRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getAreaName())) {
            queryWrapper.eq(CareAccidentRecord::getAreaName, careAccidentRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(careAccidentRecord.getRemark())) {
            queryWrapper.eq(CareAccidentRecord::getRemark, careAccidentRecord.getRemark());
        }
        if (careAccidentRecord.getCreateUser() != null) {
            queryWrapper.eq(CareAccidentRecord::getCreateUser, careAccidentRecord.getCreateUser());
        }
        if (careAccidentRecord.getCreateDept() != null) {
            queryWrapper.eq(CareAccidentRecord::getCreateDept, careAccidentRecord.getCreateDept());
        }
        if (careAccidentRecord.getCreateTime() != null) {
            queryWrapper.eq(CareAccidentRecord::getCreateTime, careAccidentRecord.getCreateTime());
        }
        if (careAccidentRecord.getUpdateUser() != null) {
            queryWrapper.eq(CareAccidentRecord::getUpdateUser, careAccidentRecord.getUpdateUser());
        }
        if (careAccidentRecord.getUpdateTime() != null) {
            queryWrapper.eq(CareAccidentRecord::getUpdateTime, careAccidentRecord.getUpdateTime());
        }
        if (careAccidentRecord.getStatus() != null) {
            queryWrapper.eq(CareAccidentRecord::getStatus, careAccidentRecord.getStatus());
        }
        if (careAccidentRecord.getIsDeleted() != null) {
            queryWrapper.eq(CareAccidentRecord::getIsDeleted, careAccidentRecord.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param careAccidentRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareAccidentRecord insert(CareAccidentRecord careAccidentRecord) {
        careAccidentRecord.setId(null);
        getBaseMapper().insert(careAccidentRecord);
        return careAccidentRecord;
    }

    /**
    * 更新数据
    *
    * @param careAccidentRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CareAccidentRecord update(CareAccidentRecord careAccidentRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CareAccidentRecord> chainWrapper = new LambdaUpdateChainWrapper<CareAccidentRecord>(getBaseMapper());
        if (careAccidentRecord.getId() != null) {
            chainWrapper.set(CareAccidentRecord::getId, careAccidentRecord.getId());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getTenantId())) {
            chainWrapper.set(CareAccidentRecord::getTenantId, careAccidentRecord.getTenantId());
        }
        if (careAccidentRecord.getCorpId() != null) {
            chainWrapper.set(CareAccidentRecord::getCorpId, careAccidentRecord.getCorpId());
        }
        if (careAccidentRecord.getInstitutionId() != null) {
            chainWrapper.set(CareAccidentRecord::getInstitutionId, careAccidentRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getInstitutionName())) {
            chainWrapper.set(CareAccidentRecord::getInstitutionName, careAccidentRecord.getInstitutionName());
        }
        if (careAccidentRecord.getElderId() != null) {
            chainWrapper.set(CareAccidentRecord::getElderId, careAccidentRecord.getElderId());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getElderName())) {
            chainWrapper.set(CareAccidentRecord::getElderName, careAccidentRecord.getElderName());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getAccidentType())) {
            chainWrapper.set(CareAccidentRecord::getAccidentType, careAccidentRecord.getAccidentType());
        }
        if (careAccidentRecord.getOccurDate() != null) {
            chainWrapper.set(CareAccidentRecord::getOccurDate, careAccidentRecord.getOccurDate());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getPlace())) {
            chainWrapper.set(CareAccidentRecord::getPlace, careAccidentRecord.getPlace());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getExplainText())) {
            chainWrapper.set(CareAccidentRecord::getExplainText, careAccidentRecord.getExplainText());
        }
        if (careAccidentRecord.getServerId() != null) {
            chainWrapper.set(CareAccidentRecord::getServerId, careAccidentRecord.getServerId());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getServerName())) {
            chainWrapper.set(CareAccidentRecord::getServerName, careAccidentRecord.getServerName());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getResult())) {
            chainWrapper.set(CareAccidentRecord::getResult, careAccidentRecord.getResult());
        }
        if (careAccidentRecord.getAreaCode() != null) {
            chainWrapper.set(CareAccidentRecord::getAreaCode, careAccidentRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getAreaName())) {
            chainWrapper.set(CareAccidentRecord::getAreaName, careAccidentRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(careAccidentRecord.getRemark())) {
            chainWrapper.set(CareAccidentRecord::getRemark, careAccidentRecord.getRemark());
        }
        if (careAccidentRecord.getCreateUser() != null) {
            chainWrapper.set(CareAccidentRecord::getCreateUser, careAccidentRecord.getCreateUser());
        }
        if (careAccidentRecord.getCreateDept() != null) {
            chainWrapper.set(CareAccidentRecord::getCreateDept, careAccidentRecord.getCreateDept());
        }
        if (careAccidentRecord.getCreateTime() != null) {
            chainWrapper.set(CareAccidentRecord::getCreateTime, careAccidentRecord.getCreateTime());
        }
        if (careAccidentRecord.getUpdateUser() != null) {
            chainWrapper.set(CareAccidentRecord::getUpdateUser, careAccidentRecord.getUpdateUser());
        }
        if (careAccidentRecord.getUpdateTime() != null) {
            chainWrapper.set(CareAccidentRecord::getUpdateTime, careAccidentRecord.getUpdateTime());
        }
        if (careAccidentRecord.getStatus() != null) {
            chainWrapper.set(CareAccidentRecord::getStatus, careAccidentRecord.getStatus());
        }
        if (careAccidentRecord.getIsDeleted() != null) {
            chainWrapper.set(CareAccidentRecord::getIsDeleted, careAccidentRecord.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CareAccidentRecord::getId, careAccidentRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(careAccidentRecord.getId());
        } else {
            return careAccidentRecord;
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
    public boolean saveCareAccidentRecordBatch(List<CareAccidentRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CareAccidentRecord careAccidentRecord : insertList) {
            //使用默认的雪花算法生成
            careAccidentRecord.setId(null);
            //careAccidentRecord.setCreatedDt(currentDte);
            //careAccidentRecord.setUpdatedDt(currentDte);
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
    public Integer deleteCareAccidentRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CareAccidentRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


