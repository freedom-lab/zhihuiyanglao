package cn.pluss.platform.service.insNursingGeneralRecord.impl;

import cn.pluss.platform.mapper.InsNursingGeneralRecordMapper;
import cn.pluss.platform.model.entity.InsNursingGeneralRecord;
import cn.pluss.platform.service.insNursingGeneralRecord.InsNursingGeneralRecordService;
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
@Service("insNursingGeneralRecordService")
public class InsNursingGeneralRecordServiceImpl extends ServiceImpl< InsNursingGeneralRecordMapper, InsNursingGeneralRecord> implements InsNursingGeneralRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingGeneralRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingGeneralRecord> queryPage(Map map) {
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
    public InsNursingGeneralRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingGeneralRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingGeneralRecord queryOne(InsNursingGeneralRecord insNursingGeneralRecord){
        LambdaQueryWrapper<InsNursingGeneralRecord> queryWrapper = getQueryWrapper(insNursingGeneralRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingGeneralRecord
    * @return
    */
    @Override
    public List<InsNursingGeneralRecord> queryList(InsNursingGeneralRecord insNursingGeneralRecord) {
        LambdaQueryWrapper<InsNursingGeneralRecord> queryWrapper = getQueryWrapper(insNursingGeneralRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingGeneralRecord
    * @return
    */
    public static LambdaQueryWrapper<InsNursingGeneralRecord> getQueryWrapper(InsNursingGeneralRecord insNursingGeneralRecord){
        LambdaQueryWrapper<InsNursingGeneralRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingGeneralRecord.getId() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getId, insNursingGeneralRecord.getId());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getTenantId())) {
            queryWrapper.eq(InsNursingGeneralRecord::getTenantId, insNursingGeneralRecord.getTenantId());
        }
        if (insNursingGeneralRecord.getCorpId() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getCorpId, insNursingGeneralRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getCorpName())) {
            queryWrapper.eq(InsNursingGeneralRecord::getCorpName, insNursingGeneralRecord.getCorpName());
        }
        if (insNursingGeneralRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getInstitutionId, insNursingGeneralRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getInstitutionName())) {
            queryWrapper.eq(InsNursingGeneralRecord::getInstitutionName, insNursingGeneralRecord.getInstitutionName());
        }
        if (insNursingGeneralRecord.getCheckId() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getCheckId, insNursingGeneralRecord.getCheckId());
        }
        if (insNursingGeneralRecord.getElderId() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getElderId, insNursingGeneralRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getElderName())) {
            queryWrapper.eq(InsNursingGeneralRecord::getElderName, insNursingGeneralRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getIdCard())) {
            queryWrapper.eq(InsNursingGeneralRecord::getIdCard, insNursingGeneralRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getSex())) {
            queryWrapper.eq(InsNursingGeneralRecord::getSex, insNursingGeneralRecord.getSex());
        }
        if (insNursingGeneralRecord.getRecordTime() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getRecordTime, insNursingGeneralRecord.getRecordTime());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getRecordContent())) {
            queryWrapper.eq(InsNursingGeneralRecord::getRecordContent, insNursingGeneralRecord.getRecordContent());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getRecordPath())) {
            queryWrapper.eq(InsNursingGeneralRecord::getRecordPath, insNursingGeneralRecord.getRecordPath());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getRemark())) {
            queryWrapper.eq(InsNursingGeneralRecord::getRemark, insNursingGeneralRecord.getRemark());
        }
        if (insNursingGeneralRecord.getCreateUser() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getCreateUser, insNursingGeneralRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingGeneralRecord.getCreateName())) {
            queryWrapper.eq(InsNursingGeneralRecord::getCreateName, insNursingGeneralRecord.getCreateName());
        }
        if (insNursingGeneralRecord.getCreateDept() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getCreateDept, insNursingGeneralRecord.getCreateDept());
        }
        if (insNursingGeneralRecord.getCreateTime() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getCreateTime, insNursingGeneralRecord.getCreateTime());
        }
        if (insNursingGeneralRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getUpdateUser, insNursingGeneralRecord.getUpdateUser());
        }
        if (insNursingGeneralRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getUpdateTime, insNursingGeneralRecord.getUpdateTime());
        }
        if (insNursingGeneralRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getIsDeleted, insNursingGeneralRecord.getIsDeleted());
        }
        if (insNursingGeneralRecord.getStatus() != null) {
            queryWrapper.eq(InsNursingGeneralRecord::getStatus, insNursingGeneralRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingGeneralRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingGeneralRecord insert(InsNursingGeneralRecord insNursingGeneralRecord) {
        insNursingGeneralRecord.setId(null);
        getBaseMapper().insert(insNursingGeneralRecord);
        return insNursingGeneralRecord;
    }

    /**
    * 更新数据
    *
    * @param insNursingGeneralRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingGeneralRecord update(InsNursingGeneralRecord insNursingGeneralRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingGeneralRecord> chainWrapper = new LambdaUpdateChainWrapper<InsNursingGeneralRecord>(getBaseMapper());
        if (insNursingGeneralRecord.getId() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getId, insNursingGeneralRecord.getId());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getTenantId())) {
            chainWrapper.set(InsNursingGeneralRecord::getTenantId, insNursingGeneralRecord.getTenantId());
        }
        if (insNursingGeneralRecord.getCorpId() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getCorpId, insNursingGeneralRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getCorpName())) {
            chainWrapper.set(InsNursingGeneralRecord::getCorpName, insNursingGeneralRecord.getCorpName());
        }
        if (insNursingGeneralRecord.getInstitutionId() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getInstitutionId, insNursingGeneralRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getInstitutionName())) {
            chainWrapper.set(InsNursingGeneralRecord::getInstitutionName, insNursingGeneralRecord.getInstitutionName());
        }
        if (insNursingGeneralRecord.getCheckId() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getCheckId, insNursingGeneralRecord.getCheckId());
        }
        if (insNursingGeneralRecord.getElderId() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getElderId, insNursingGeneralRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getElderName())) {
            chainWrapper.set(InsNursingGeneralRecord::getElderName, insNursingGeneralRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getIdCard())) {
            chainWrapper.set(InsNursingGeneralRecord::getIdCard, insNursingGeneralRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getSex())) {
            chainWrapper.set(InsNursingGeneralRecord::getSex, insNursingGeneralRecord.getSex());
        }
        if (insNursingGeneralRecord.getRecordTime() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getRecordTime, insNursingGeneralRecord.getRecordTime());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getRecordContent())) {
            chainWrapper.set(InsNursingGeneralRecord::getRecordContent, insNursingGeneralRecord.getRecordContent());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getRecordPath())) {
            chainWrapper.set(InsNursingGeneralRecord::getRecordPath, insNursingGeneralRecord.getRecordPath());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getRemark())) {
            chainWrapper.set(InsNursingGeneralRecord::getRemark, insNursingGeneralRecord.getRemark());
        }
        if (insNursingGeneralRecord.getCreateUser() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getCreateUser, insNursingGeneralRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingGeneralRecord.getCreateName())) {
            chainWrapper.set(InsNursingGeneralRecord::getCreateName, insNursingGeneralRecord.getCreateName());
        }
        if (insNursingGeneralRecord.getCreateDept() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getCreateDept, insNursingGeneralRecord.getCreateDept());
        }
        if (insNursingGeneralRecord.getCreateTime() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getCreateTime, insNursingGeneralRecord.getCreateTime());
        }
        if (insNursingGeneralRecord.getUpdateUser() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getUpdateUser, insNursingGeneralRecord.getUpdateUser());
        }
        if (insNursingGeneralRecord.getUpdateTime() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getUpdateTime, insNursingGeneralRecord.getUpdateTime());
        }
        if (insNursingGeneralRecord.getIsDeleted() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getIsDeleted, insNursingGeneralRecord.getIsDeleted());
        }
        if (insNursingGeneralRecord.getStatus() != null) {
            chainWrapper.set(InsNursingGeneralRecord::getStatus, insNursingGeneralRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingGeneralRecord::getId, insNursingGeneralRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingGeneralRecord.getId());
        } else {
            return insNursingGeneralRecord;
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
    public boolean saveInsNursingGeneralRecordBatch(List<InsNursingGeneralRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingGeneralRecord insNursingGeneralRecord : insertList) {
            //使用默认的雪花算法生成
            insNursingGeneralRecord.setId(null);
            //insNursingGeneralRecord.setCreatedDt(currentDte);
            //insNursingGeneralRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingGeneralRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingGeneralRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


