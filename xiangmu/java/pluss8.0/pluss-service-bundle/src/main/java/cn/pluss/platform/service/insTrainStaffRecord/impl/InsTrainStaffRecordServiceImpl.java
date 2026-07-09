package cn.pluss.platform.service.insTrainStaffRecord.impl;

import cn.pluss.platform.mapper.InsTrainStaffRecordMapper;
import cn.pluss.platform.model.entity.InsTrainStaffRecord;
import cn.pluss.platform.service.insTrainStaffRecord.InsTrainStaffRecordService;
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
@Service("insTrainStaffRecordService")
public class InsTrainStaffRecordServiceImpl extends ServiceImpl< InsTrainStaffRecordMapper, InsTrainStaffRecord> implements InsTrainStaffRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsTrainStaffRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsTrainStaffRecord> queryPage(Map map) {
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
    public InsTrainStaffRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insTrainStaffRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsTrainStaffRecord queryOne(InsTrainStaffRecord insTrainStaffRecord){
        LambdaQueryWrapper<InsTrainStaffRecord> queryWrapper = getQueryWrapper(insTrainStaffRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insTrainStaffRecord
    * @return
    */
    @Override
    public List<InsTrainStaffRecord> queryList(InsTrainStaffRecord insTrainStaffRecord) {
        LambdaQueryWrapper<InsTrainStaffRecord> queryWrapper = getQueryWrapper(insTrainStaffRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insTrainStaffRecord
    * @return
    */
    public static LambdaQueryWrapper<InsTrainStaffRecord> getQueryWrapper(InsTrainStaffRecord insTrainStaffRecord){
        LambdaQueryWrapper<InsTrainStaffRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insTrainStaffRecord.getId() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getId, insTrainStaffRecord.getId());
        }
        if (StringUtil.isNotEmpty(insTrainStaffRecord.getTenantId())) {
            queryWrapper.eq(InsTrainStaffRecord::getTenantId, insTrainStaffRecord.getTenantId());
        }
        if (insTrainStaffRecord.getCorpId() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getCorpId, insTrainStaffRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insTrainStaffRecord.getCorpName())) {
            queryWrapper.eq(InsTrainStaffRecord::getCorpName, insTrainStaffRecord.getCorpName());
        }
        if (insTrainStaffRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getInstitutionId, insTrainStaffRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insTrainStaffRecord.getInstitutionName())) {
            queryWrapper.eq(InsTrainStaffRecord::getInstitutionName, insTrainStaffRecord.getInstitutionName());
        }
        if (insTrainStaffRecord.getReleaseId() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getReleaseId, insTrainStaffRecord.getReleaseId());
        }
        if (insTrainStaffRecord.getStaffId() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getStaffId, insTrainStaffRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insTrainStaffRecord.getStaffName())) {
            queryWrapper.eq(InsTrainStaffRecord::getStaffName, insTrainStaffRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insTrainStaffRecord.getIdCard())) {
            queryWrapper.eq(InsTrainStaffRecord::getIdCard, insTrainStaffRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insTrainStaffRecord.getSex())) {
            queryWrapper.eq(InsTrainStaffRecord::getSex, insTrainStaffRecord.getSex());
        }
        if (StringUtil.isNotEmpty(insTrainStaffRecord.getLinkTel())) {
            queryWrapper.eq(InsTrainStaffRecord::getLinkTel, insTrainStaffRecord.getLinkTel());
        }
        if (insTrainStaffRecord.getScoreNumber() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getScoreNumber, insTrainStaffRecord.getScoreNumber());
        }
        if (StringUtil.isNotEmpty(insTrainStaffRecord.getRemark())) {
            queryWrapper.eq(InsTrainStaffRecord::getRemark, insTrainStaffRecord.getRemark());
        }
        if (insTrainStaffRecord.getCreateUser() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getCreateUser, insTrainStaffRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insTrainStaffRecord.getCreateName())) {
            queryWrapper.eq(InsTrainStaffRecord::getCreateName, insTrainStaffRecord.getCreateName());
        }
        if (insTrainStaffRecord.getCreateDept() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getCreateDept, insTrainStaffRecord.getCreateDept());
        }
        if (insTrainStaffRecord.getCreateTime() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getCreateTime, insTrainStaffRecord.getCreateTime());
        }
        if (insTrainStaffRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getUpdateUser, insTrainStaffRecord.getUpdateUser());
        }
        if (insTrainStaffRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getUpdateTime, insTrainStaffRecord.getUpdateTime());
        }
        if (insTrainStaffRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getIsDeleted, insTrainStaffRecord.getIsDeleted());
        }
        if (insTrainStaffRecord.getStatus() != null) {
            queryWrapper.eq(InsTrainStaffRecord::getStatus, insTrainStaffRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insTrainStaffRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsTrainStaffRecord insert(InsTrainStaffRecord insTrainStaffRecord) {
        insTrainStaffRecord.setId(null);
        getBaseMapper().insert(insTrainStaffRecord);
        return insTrainStaffRecord;
    }

    /**
    * 更新数据
    *
    * @param insTrainStaffRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsTrainStaffRecord update(InsTrainStaffRecord insTrainStaffRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsTrainStaffRecord> chainWrapper = new LambdaUpdateChainWrapper<InsTrainStaffRecord>(getBaseMapper());
        if (insTrainStaffRecord.getId() != null) {
            chainWrapper.set(InsTrainStaffRecord::getId, insTrainStaffRecord.getId());
        }
        if (StringUtil.isNotBlank(insTrainStaffRecord.getTenantId())) {
            chainWrapper.set(InsTrainStaffRecord::getTenantId, insTrainStaffRecord.getTenantId());
        }
        if (insTrainStaffRecord.getCorpId() != null) {
            chainWrapper.set(InsTrainStaffRecord::getCorpId, insTrainStaffRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insTrainStaffRecord.getCorpName())) {
            chainWrapper.set(InsTrainStaffRecord::getCorpName, insTrainStaffRecord.getCorpName());
        }
        if (insTrainStaffRecord.getInstitutionId() != null) {
            chainWrapper.set(InsTrainStaffRecord::getInstitutionId, insTrainStaffRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insTrainStaffRecord.getInstitutionName())) {
            chainWrapper.set(InsTrainStaffRecord::getInstitutionName, insTrainStaffRecord.getInstitutionName());
        }
        if (insTrainStaffRecord.getReleaseId() != null) {
            chainWrapper.set(InsTrainStaffRecord::getReleaseId, insTrainStaffRecord.getReleaseId());
        }
        if (insTrainStaffRecord.getStaffId() != null) {
            chainWrapper.set(InsTrainStaffRecord::getStaffId, insTrainStaffRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insTrainStaffRecord.getStaffName())) {
            chainWrapper.set(InsTrainStaffRecord::getStaffName, insTrainStaffRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insTrainStaffRecord.getIdCard())) {
            chainWrapper.set(InsTrainStaffRecord::getIdCard, insTrainStaffRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insTrainStaffRecord.getSex())) {
            chainWrapper.set(InsTrainStaffRecord::getSex, insTrainStaffRecord.getSex());
        }
        if (StringUtil.isNotBlank(insTrainStaffRecord.getLinkTel())) {
            chainWrapper.set(InsTrainStaffRecord::getLinkTel, insTrainStaffRecord.getLinkTel());
        }
        if (insTrainStaffRecord.getScoreNumber() != null) {
            chainWrapper.set(InsTrainStaffRecord::getScoreNumber, insTrainStaffRecord.getScoreNumber());
        }
        if (StringUtil.isNotBlank(insTrainStaffRecord.getRemark())) {
            chainWrapper.set(InsTrainStaffRecord::getRemark, insTrainStaffRecord.getRemark());
        }
        if (insTrainStaffRecord.getCreateUser() != null) {
            chainWrapper.set(InsTrainStaffRecord::getCreateUser, insTrainStaffRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insTrainStaffRecord.getCreateName())) {
            chainWrapper.set(InsTrainStaffRecord::getCreateName, insTrainStaffRecord.getCreateName());
        }
        if (insTrainStaffRecord.getCreateDept() != null) {
            chainWrapper.set(InsTrainStaffRecord::getCreateDept, insTrainStaffRecord.getCreateDept());
        }
        if (insTrainStaffRecord.getCreateTime() != null) {
            chainWrapper.set(InsTrainStaffRecord::getCreateTime, insTrainStaffRecord.getCreateTime());
        }
        if (insTrainStaffRecord.getUpdateUser() != null) {
            chainWrapper.set(InsTrainStaffRecord::getUpdateUser, insTrainStaffRecord.getUpdateUser());
        }
        if (insTrainStaffRecord.getUpdateTime() != null) {
            chainWrapper.set(InsTrainStaffRecord::getUpdateTime, insTrainStaffRecord.getUpdateTime());
        }
        if (insTrainStaffRecord.getIsDeleted() != null) {
            chainWrapper.set(InsTrainStaffRecord::getIsDeleted, insTrainStaffRecord.getIsDeleted());
        }
        if (insTrainStaffRecord.getStatus() != null) {
            chainWrapper.set(InsTrainStaffRecord::getStatus, insTrainStaffRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsTrainStaffRecord::getId, insTrainStaffRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insTrainStaffRecord.getId());
        } else {
            return insTrainStaffRecord;
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
    public boolean saveInsTrainStaffRecordBatch(List<InsTrainStaffRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsTrainStaffRecord insTrainStaffRecord : insertList) {
            //使用默认的雪花算法生成
            insTrainStaffRecord.setId(null);
            //insTrainStaffRecord.setCreatedDt(currentDte);
            //insTrainStaffRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsTrainStaffRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsTrainStaffRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


