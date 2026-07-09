package cn.pluss.platform.service.insSchedulingHandoverRecord.impl;

import cn.pluss.platform.mapper.InsSchedulingHandoverRecordMapper;
import cn.pluss.platform.model.entity.InsSchedulingHandoverRecord;
import cn.pluss.platform.service.insSchedulingHandoverRecord.InsSchedulingHandoverRecordService;
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
@Service("insSchedulingHandoverRecordService")
public class InsSchedulingHandoverRecordServiceImpl extends ServiceImpl< InsSchedulingHandoverRecordMapper, InsSchedulingHandoverRecord> implements InsSchedulingHandoverRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsSchedulingHandoverRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSchedulingHandoverRecord> queryPage(Map map) {
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
    public InsSchedulingHandoverRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingHandoverRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsSchedulingHandoverRecord queryOne(InsSchedulingHandoverRecord insSchedulingHandoverRecord){
        LambdaQueryWrapper<InsSchedulingHandoverRecord> queryWrapper = getQueryWrapper(insSchedulingHandoverRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSchedulingHandoverRecord
    * @return
    */
    @Override
    public List<InsSchedulingHandoverRecord> queryList(InsSchedulingHandoverRecord insSchedulingHandoverRecord) {
        LambdaQueryWrapper<InsSchedulingHandoverRecord> queryWrapper = getQueryWrapper(insSchedulingHandoverRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSchedulingHandoverRecord
    * @return
    */
    public static LambdaQueryWrapper<InsSchedulingHandoverRecord> getQueryWrapper(InsSchedulingHandoverRecord insSchedulingHandoverRecord){
        LambdaQueryWrapper<InsSchedulingHandoverRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insSchedulingHandoverRecord.getId() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getId, insSchedulingHandoverRecord.getId());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getTenantId())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getTenantId, insSchedulingHandoverRecord.getTenantId());
        }
        if (insSchedulingHandoverRecord.getCorpId() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getCorpId, insSchedulingHandoverRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getCorpName())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getCorpName, insSchedulingHandoverRecord.getCorpName());
        }
        if (insSchedulingHandoverRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getInstitutionId, insSchedulingHandoverRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getInstitutionName())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getInstitutionName, insSchedulingHandoverRecord.getInstitutionName());
        }
        if (insSchedulingHandoverRecord.getTableId() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getTableId, insSchedulingHandoverRecord.getTableId());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getTableName())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getTableName, insSchedulingHandoverRecord.getTableName());
        }
        if (insSchedulingHandoverRecord.getDetailId() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getDetailId, insSchedulingHandoverRecord.getDetailId());
        }
        if (insSchedulingHandoverRecord.getClassesId() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getClassesId, insSchedulingHandoverRecord.getClassesId());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getClassesName())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getClassesName, insSchedulingHandoverRecord.getClassesName());
        }
        if (insSchedulingHandoverRecord.getSubmitTime() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getSubmitTime, insSchedulingHandoverRecord.getSubmitTime());
        }
        if (insSchedulingHandoverRecord.getStaffId() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getStaffId, insSchedulingHandoverRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getStaffName())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getStaffName, insSchedulingHandoverRecord.getStaffName());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getIdCard())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getIdCard, insSchedulingHandoverRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getSex())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getSex, insSchedulingHandoverRecord.getSex());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getHandoverContent())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getHandoverContent, insSchedulingHandoverRecord.getHandoverContent());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getImgPath())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getImgPath, insSchedulingHandoverRecord.getImgPath());
        }
        if (insSchedulingHandoverRecord.getTakeoverId() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getTakeoverId, insSchedulingHandoverRecord.getTakeoverId());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getTakeoverName())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getTakeoverName, insSchedulingHandoverRecord.getTakeoverName());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getRemark())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getRemark, insSchedulingHandoverRecord.getRemark());
        }
        if (insSchedulingHandoverRecord.getCreateUser() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getCreateUser, insSchedulingHandoverRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSchedulingHandoverRecord.getCreateName())) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getCreateName, insSchedulingHandoverRecord.getCreateName());
        }
        if (insSchedulingHandoverRecord.getCreateDept() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getCreateDept, insSchedulingHandoverRecord.getCreateDept());
        }
        if (insSchedulingHandoverRecord.getCreateTime() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getCreateTime, insSchedulingHandoverRecord.getCreateTime());
        }
        if (insSchedulingHandoverRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getUpdateUser, insSchedulingHandoverRecord.getUpdateUser());
        }
        if (insSchedulingHandoverRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getUpdateTime, insSchedulingHandoverRecord.getUpdateTime());
        }
        if (insSchedulingHandoverRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getIsDeleted, insSchedulingHandoverRecord.getIsDeleted());
        }
        if (insSchedulingHandoverRecord.getStatus() != null) {
            queryWrapper.eq(InsSchedulingHandoverRecord::getStatus, insSchedulingHandoverRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSchedulingHandoverRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingHandoverRecord insert(InsSchedulingHandoverRecord insSchedulingHandoverRecord) {
        insSchedulingHandoverRecord.setId(null);
        getBaseMapper().insert(insSchedulingHandoverRecord);
        return insSchedulingHandoverRecord;
    }

    /**
    * 更新数据
    *
    * @param insSchedulingHandoverRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingHandoverRecord update(InsSchedulingHandoverRecord insSchedulingHandoverRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSchedulingHandoverRecord> chainWrapper = new LambdaUpdateChainWrapper<InsSchedulingHandoverRecord>(getBaseMapper());
        if (insSchedulingHandoverRecord.getId() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getId, insSchedulingHandoverRecord.getId());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getTenantId())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getTenantId, insSchedulingHandoverRecord.getTenantId());
        }
        if (insSchedulingHandoverRecord.getCorpId() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getCorpId, insSchedulingHandoverRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getCorpName())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getCorpName, insSchedulingHandoverRecord.getCorpName());
        }
        if (insSchedulingHandoverRecord.getInstitutionId() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getInstitutionId, insSchedulingHandoverRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getInstitutionName())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getInstitutionName, insSchedulingHandoverRecord.getInstitutionName());
        }
        if (insSchedulingHandoverRecord.getTableId() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getTableId, insSchedulingHandoverRecord.getTableId());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getTableName())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getTableName, insSchedulingHandoverRecord.getTableName());
        }
        if (insSchedulingHandoverRecord.getDetailId() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getDetailId, insSchedulingHandoverRecord.getDetailId());
        }
        if (insSchedulingHandoverRecord.getClassesId() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getClassesId, insSchedulingHandoverRecord.getClassesId());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getClassesName())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getClassesName, insSchedulingHandoverRecord.getClassesName());
        }
        if (insSchedulingHandoverRecord.getSubmitTime() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getSubmitTime, insSchedulingHandoverRecord.getSubmitTime());
        }
        if (insSchedulingHandoverRecord.getStaffId() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getStaffId, insSchedulingHandoverRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getStaffName())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getStaffName, insSchedulingHandoverRecord.getStaffName());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getIdCard())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getIdCard, insSchedulingHandoverRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getSex())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getSex, insSchedulingHandoverRecord.getSex());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getHandoverContent())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getHandoverContent, insSchedulingHandoverRecord.getHandoverContent());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getImgPath())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getImgPath, insSchedulingHandoverRecord.getImgPath());
        }
        if (insSchedulingHandoverRecord.getTakeoverId() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getTakeoverId, insSchedulingHandoverRecord.getTakeoverId());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getTakeoverName())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getTakeoverName, insSchedulingHandoverRecord.getTakeoverName());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getRemark())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getRemark, insSchedulingHandoverRecord.getRemark());
        }
        if (insSchedulingHandoverRecord.getCreateUser() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getCreateUser, insSchedulingHandoverRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSchedulingHandoverRecord.getCreateName())) {
            chainWrapper.set(InsSchedulingHandoverRecord::getCreateName, insSchedulingHandoverRecord.getCreateName());
        }
        if (insSchedulingHandoverRecord.getCreateDept() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getCreateDept, insSchedulingHandoverRecord.getCreateDept());
        }
        if (insSchedulingHandoverRecord.getCreateTime() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getCreateTime, insSchedulingHandoverRecord.getCreateTime());
        }
        if (insSchedulingHandoverRecord.getUpdateUser() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getUpdateUser, insSchedulingHandoverRecord.getUpdateUser());
        }
        if (insSchedulingHandoverRecord.getUpdateTime() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getUpdateTime, insSchedulingHandoverRecord.getUpdateTime());
        }
        if (insSchedulingHandoverRecord.getIsDeleted() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getIsDeleted, insSchedulingHandoverRecord.getIsDeleted());
        }
        if (insSchedulingHandoverRecord.getStatus() != null) {
            chainWrapper.set(InsSchedulingHandoverRecord::getStatus, insSchedulingHandoverRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSchedulingHandoverRecord::getId, insSchedulingHandoverRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSchedulingHandoverRecord.getId());
        } else {
            return insSchedulingHandoverRecord;
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
    public boolean saveInsSchedulingHandoverRecordBatch(List<InsSchedulingHandoverRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSchedulingHandoverRecord insSchedulingHandoverRecord : insertList) {
            //使用默认的雪花算法生成
            insSchedulingHandoverRecord.setId(null);
            //insSchedulingHandoverRecord.setCreatedDt(currentDte);
            //insSchedulingHandoverRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsSchedulingHandoverRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSchedulingHandoverRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


