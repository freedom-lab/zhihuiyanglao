package cn.pluss.platform.service.insSecurityInspectionRecord.impl;

import cn.pluss.platform.mapper.InsSecurityInspectionRecordMapper;
import cn.pluss.platform.model.entity.InsSecurityInspectionRecord;
import cn.pluss.platform.service.insSecurityInspectionRecord.InsSecurityInspectionRecordService;
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
@Service("insSecurityInspectionRecordService")
public class InsSecurityInspectionRecordServiceImpl extends ServiceImpl< InsSecurityInspectionRecordMapper, InsSecurityInspectionRecord> implements InsSecurityInspectionRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsSecurityInspectionRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSecurityInspectionRecord> queryPage(Map map) {
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
    public InsSecurityInspectionRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityInspectionRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsSecurityInspectionRecord queryOne(InsSecurityInspectionRecord insSecurityInspectionRecord){
        LambdaQueryWrapper<InsSecurityInspectionRecord> queryWrapper = getQueryWrapper(insSecurityInspectionRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityInspectionRecord
    * @return
    */
    @Override
    public List<InsSecurityInspectionRecord> queryList(InsSecurityInspectionRecord insSecurityInspectionRecord) {
        LambdaQueryWrapper<InsSecurityInspectionRecord> queryWrapper = getQueryWrapper(insSecurityInspectionRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSecurityInspectionRecord
    * @return
    */
    public static LambdaQueryWrapper<InsSecurityInspectionRecord> getQueryWrapper(InsSecurityInspectionRecord insSecurityInspectionRecord){
        LambdaQueryWrapper<InsSecurityInspectionRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insSecurityInspectionRecord.getId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getId, insSecurityInspectionRecord.getId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecord.getTenantId())) {
            queryWrapper.eq(InsSecurityInspectionRecord::getTenantId, insSecurityInspectionRecord.getTenantId());
        }
        if (insSecurityInspectionRecord.getCorpId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getCorpId, insSecurityInspectionRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecord.getCorpName())) {
            queryWrapper.eq(InsSecurityInspectionRecord::getCorpName, insSecurityInspectionRecord.getCorpName());
        }
        if (insSecurityInspectionRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getInstitutionId, insSecurityInspectionRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecord.getInstitutionName())) {
            queryWrapper.eq(InsSecurityInspectionRecord::getInstitutionName, insSecurityInspectionRecord.getInstitutionName());
        }
        if (insSecurityInspectionRecord.getRouteId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getRouteId, insSecurityInspectionRecord.getRouteId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecord.getRouteName())) {
            queryWrapper.eq(InsSecurityInspectionRecord::getRouteName, insSecurityInspectionRecord.getRouteName());
        }
        if (insSecurityInspectionRecord.getInspectionStartTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getInspectionStartTime, insSecurityInspectionRecord.getInspectionStartTime());
        }
        if (insSecurityInspectionRecord.getInspectionEndTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getInspectionEndTime, insSecurityInspectionRecord.getInspectionEndTime());
        }
        if (insSecurityInspectionRecord.getStaffId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getStaffId, insSecurityInspectionRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecord.getStaffName())) {
            queryWrapper.eq(InsSecurityInspectionRecord::getStaffName, insSecurityInspectionRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecord.getRemark())) {
            queryWrapper.eq(InsSecurityInspectionRecord::getRemark, insSecurityInspectionRecord.getRemark());
        }
        if (insSecurityInspectionRecord.getCreateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getCreateUser, insSecurityInspectionRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecord.getCreateName())) {
            queryWrapper.eq(InsSecurityInspectionRecord::getCreateName, insSecurityInspectionRecord.getCreateName());
        }
        if (insSecurityInspectionRecord.getCreateDept() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getCreateDept, insSecurityInspectionRecord.getCreateDept());
        }
        if (insSecurityInspectionRecord.getCreateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getCreateTime, insSecurityInspectionRecord.getCreateTime());
        }
        if (insSecurityInspectionRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getUpdateUser, insSecurityInspectionRecord.getUpdateUser());
        }
        if (insSecurityInspectionRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getUpdateTime, insSecurityInspectionRecord.getUpdateTime());
        }
        if (insSecurityInspectionRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getIsDeleted, insSecurityInspectionRecord.getIsDeleted());
        }
        if (insSecurityInspectionRecord.getStatus() != null) {
            queryWrapper.eq(InsSecurityInspectionRecord::getStatus, insSecurityInspectionRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSecurityInspectionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionRecord insert(InsSecurityInspectionRecord insSecurityInspectionRecord) {
        insSecurityInspectionRecord.setId(null);
        getBaseMapper().insert(insSecurityInspectionRecord);
        return insSecurityInspectionRecord;
    }

    /**
    * 更新数据
    *
    * @param insSecurityInspectionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionRecord update(InsSecurityInspectionRecord insSecurityInspectionRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSecurityInspectionRecord> chainWrapper = new LambdaUpdateChainWrapper<InsSecurityInspectionRecord>(getBaseMapper());
        if (insSecurityInspectionRecord.getId() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getId, insSecurityInspectionRecord.getId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecord.getTenantId())) {
            chainWrapper.set(InsSecurityInspectionRecord::getTenantId, insSecurityInspectionRecord.getTenantId());
        }
        if (insSecurityInspectionRecord.getCorpId() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getCorpId, insSecurityInspectionRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecord.getCorpName())) {
            chainWrapper.set(InsSecurityInspectionRecord::getCorpName, insSecurityInspectionRecord.getCorpName());
        }
        if (insSecurityInspectionRecord.getInstitutionId() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getInstitutionId, insSecurityInspectionRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecord.getInstitutionName())) {
            chainWrapper.set(InsSecurityInspectionRecord::getInstitutionName, insSecurityInspectionRecord.getInstitutionName());
        }
        if (insSecurityInspectionRecord.getRouteId() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getRouteId, insSecurityInspectionRecord.getRouteId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecord.getRouteName())) {
            chainWrapper.set(InsSecurityInspectionRecord::getRouteName, insSecurityInspectionRecord.getRouteName());
        }
        if (insSecurityInspectionRecord.getInspectionStartTime() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getInspectionStartTime, insSecurityInspectionRecord.getInspectionStartTime());
        }
        if (insSecurityInspectionRecord.getInspectionEndTime() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getInspectionEndTime, insSecurityInspectionRecord.getInspectionEndTime());
        }
        if (insSecurityInspectionRecord.getStaffId() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getStaffId, insSecurityInspectionRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecord.getStaffName())) {
            chainWrapper.set(InsSecurityInspectionRecord::getStaffName, insSecurityInspectionRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecord.getRemark())) {
            chainWrapper.set(InsSecurityInspectionRecord::getRemark, insSecurityInspectionRecord.getRemark());
        }
        if (insSecurityInspectionRecord.getCreateUser() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getCreateUser, insSecurityInspectionRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecord.getCreateName())) {
            chainWrapper.set(InsSecurityInspectionRecord::getCreateName, insSecurityInspectionRecord.getCreateName());
        }
        if (insSecurityInspectionRecord.getCreateDept() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getCreateDept, insSecurityInspectionRecord.getCreateDept());
        }
        if (insSecurityInspectionRecord.getCreateTime() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getCreateTime, insSecurityInspectionRecord.getCreateTime());
        }
        if (insSecurityInspectionRecord.getUpdateUser() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getUpdateUser, insSecurityInspectionRecord.getUpdateUser());
        }
        if (insSecurityInspectionRecord.getUpdateTime() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getUpdateTime, insSecurityInspectionRecord.getUpdateTime());
        }
        if (insSecurityInspectionRecord.getIsDeleted() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getIsDeleted, insSecurityInspectionRecord.getIsDeleted());
        }
        if (insSecurityInspectionRecord.getStatus() != null) {
            chainWrapper.set(InsSecurityInspectionRecord::getStatus, insSecurityInspectionRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSecurityInspectionRecord::getId, insSecurityInspectionRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSecurityInspectionRecord.getId());
        } else {
            return insSecurityInspectionRecord;
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
    public boolean saveInsSecurityInspectionRecordBatch(List<InsSecurityInspectionRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSecurityInspectionRecord insSecurityInspectionRecord : insertList) {
            //使用默认的雪花算法生成
            insSecurityInspectionRecord.setId(null);
            //insSecurityInspectionRecord.setCreatedDt(currentDte);
            //insSecurityInspectionRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsSecurityInspectionRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSecurityInspectionRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


