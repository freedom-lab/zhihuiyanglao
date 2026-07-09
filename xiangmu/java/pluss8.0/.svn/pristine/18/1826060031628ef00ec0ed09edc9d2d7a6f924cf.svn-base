package cn.pluss.platform.service.insNursingTurnoverRecord.impl;

import cn.pluss.platform.mapper.InsNursingTurnoverRecordMapper;
import cn.pluss.platform.model.entity.InsNursingTurnoverRecord;
import cn.pluss.platform.service.insNursingTurnoverRecord.InsNursingTurnoverRecordService;
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
@Service("insNursingTurnoverRecordService")
public class InsNursingTurnoverRecordServiceImpl extends ServiceImpl< InsNursingTurnoverRecordMapper, InsNursingTurnoverRecord> implements InsNursingTurnoverRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingTurnoverRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingTurnoverRecord> queryPage(Map map) {
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
    public InsNursingTurnoverRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingTurnoverRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingTurnoverRecord queryOne(InsNursingTurnoverRecord insNursingTurnoverRecord){
        LambdaQueryWrapper<InsNursingTurnoverRecord> queryWrapper = getQueryWrapper(insNursingTurnoverRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingTurnoverRecord
    * @return
    */
    @Override
    public List<InsNursingTurnoverRecord> queryList(InsNursingTurnoverRecord insNursingTurnoverRecord) {
        LambdaQueryWrapper<InsNursingTurnoverRecord> queryWrapper = getQueryWrapper(insNursingTurnoverRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingTurnoverRecord
    * @return
    */
    public static LambdaQueryWrapper<InsNursingTurnoverRecord> getQueryWrapper(InsNursingTurnoverRecord insNursingTurnoverRecord){
        LambdaQueryWrapper<InsNursingTurnoverRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingTurnoverRecord.getId() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getId, insNursingTurnoverRecord.getId());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getTenantId())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getTenantId, insNursingTurnoverRecord.getTenantId());
        }
        if (insNursingTurnoverRecord.getCorpId() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getCorpId, insNursingTurnoverRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getCorpName())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getCorpName, insNursingTurnoverRecord.getCorpName());
        }
        if (insNursingTurnoverRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getInstitutionId, insNursingTurnoverRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getInstitutionName())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getInstitutionName, insNursingTurnoverRecord.getInstitutionName());
        }
        if (insNursingTurnoverRecord.getCheckId() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getCheckId, insNursingTurnoverRecord.getCheckId());
        }
        if (insNursingTurnoverRecord.getCheckDate() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getCheckDate, insNursingTurnoverRecord.getCheckDate());
        }
        if (insNursingTurnoverRecord.getElderId() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getElderId, insNursingTurnoverRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getElderName())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getElderName, insNursingTurnoverRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getIdCard())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getIdCard, insNursingTurnoverRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getSex())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getSex, insNursingTurnoverRecord.getSex());
        }
        if (insNursingTurnoverRecord.getNursingDate() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getNursingDate, insNursingTurnoverRecord.getNursingDate());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getPlanTime())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getPlanTime, insNursingTurnoverRecord.getPlanTime());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getRealityTime())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getRealityTime, insNursingTurnoverRecord.getRealityTime());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getDecubitus())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getDecubitus, insNursingTurnoverRecord.getDecubitus());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getSkinCondition())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getSkinCondition, insNursingTurnoverRecord.getSkinCondition());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getProtectiveEquipment())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getProtectiveEquipment, insNursingTurnoverRecord.getProtectiveEquipment());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getPressureUlcer())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getPressureUlcer, insNursingTurnoverRecord.getPressureUlcer());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getRemark())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getRemark, insNursingTurnoverRecord.getRemark());
        }
        if (insNursingTurnoverRecord.getCreateUser() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getCreateUser, insNursingTurnoverRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingTurnoverRecord.getCreateName())) {
            queryWrapper.eq(InsNursingTurnoverRecord::getCreateName, insNursingTurnoverRecord.getCreateName());
        }
        if (insNursingTurnoverRecord.getCreateDept() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getCreateDept, insNursingTurnoverRecord.getCreateDept());
        }
        if (insNursingTurnoverRecord.getCreateTime() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getCreateTime, insNursingTurnoverRecord.getCreateTime());
        }
        if (insNursingTurnoverRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getUpdateUser, insNursingTurnoverRecord.getUpdateUser());
        }
        if (insNursingTurnoverRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getUpdateTime, insNursingTurnoverRecord.getUpdateTime());
        }
        if (insNursingTurnoverRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getIsDeleted, insNursingTurnoverRecord.getIsDeleted());
        }
        if (insNursingTurnoverRecord.getStatus() != null) {
            queryWrapper.eq(InsNursingTurnoverRecord::getStatus, insNursingTurnoverRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingTurnoverRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingTurnoverRecord insert(InsNursingTurnoverRecord insNursingTurnoverRecord) {
        insNursingTurnoverRecord.setId(null);
        getBaseMapper().insert(insNursingTurnoverRecord);
        return insNursingTurnoverRecord;
    }

    /**
    * 更新数据
    *
    * @param insNursingTurnoverRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingTurnoverRecord update(InsNursingTurnoverRecord insNursingTurnoverRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingTurnoverRecord> chainWrapper = new LambdaUpdateChainWrapper<InsNursingTurnoverRecord>(getBaseMapper());
        if (insNursingTurnoverRecord.getId() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getId, insNursingTurnoverRecord.getId());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getTenantId())) {
            chainWrapper.set(InsNursingTurnoverRecord::getTenantId, insNursingTurnoverRecord.getTenantId());
        }
        if (insNursingTurnoverRecord.getCorpId() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getCorpId, insNursingTurnoverRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getCorpName())) {
            chainWrapper.set(InsNursingTurnoverRecord::getCorpName, insNursingTurnoverRecord.getCorpName());
        }
        if (insNursingTurnoverRecord.getInstitutionId() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getInstitutionId, insNursingTurnoverRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getInstitutionName())) {
            chainWrapper.set(InsNursingTurnoverRecord::getInstitutionName, insNursingTurnoverRecord.getInstitutionName());
        }
        if (insNursingTurnoverRecord.getCheckId() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getCheckId, insNursingTurnoverRecord.getCheckId());
        }
        if (insNursingTurnoverRecord.getCheckDate() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getCheckDate, insNursingTurnoverRecord.getCheckDate());
        }
        if (insNursingTurnoverRecord.getElderId() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getElderId, insNursingTurnoverRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getElderName())) {
            chainWrapper.set(InsNursingTurnoverRecord::getElderName, insNursingTurnoverRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getIdCard())) {
            chainWrapper.set(InsNursingTurnoverRecord::getIdCard, insNursingTurnoverRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getSex())) {
            chainWrapper.set(InsNursingTurnoverRecord::getSex, insNursingTurnoverRecord.getSex());
        }
        if (insNursingTurnoverRecord.getNursingDate() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getNursingDate, insNursingTurnoverRecord.getNursingDate());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getPlanTime())) {
            chainWrapper.set(InsNursingTurnoverRecord::getPlanTime, insNursingTurnoverRecord.getPlanTime());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getRealityTime())) {
            chainWrapper.set(InsNursingTurnoverRecord::getRealityTime, insNursingTurnoverRecord.getRealityTime());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getDecubitus())) {
            chainWrapper.set(InsNursingTurnoverRecord::getDecubitus, insNursingTurnoverRecord.getDecubitus());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getSkinCondition())) {
            chainWrapper.set(InsNursingTurnoverRecord::getSkinCondition, insNursingTurnoverRecord.getSkinCondition());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getProtectiveEquipment())) {
            chainWrapper.set(InsNursingTurnoverRecord::getProtectiveEquipment, insNursingTurnoverRecord.getProtectiveEquipment());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getPressureUlcer())) {
            chainWrapper.set(InsNursingTurnoverRecord::getPressureUlcer, insNursingTurnoverRecord.getPressureUlcer());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getRemark())) {
            chainWrapper.set(InsNursingTurnoverRecord::getRemark, insNursingTurnoverRecord.getRemark());
        }
        if (insNursingTurnoverRecord.getCreateUser() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getCreateUser, insNursingTurnoverRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingTurnoverRecord.getCreateName())) {
            chainWrapper.set(InsNursingTurnoverRecord::getCreateName, insNursingTurnoverRecord.getCreateName());
        }
        if (insNursingTurnoverRecord.getCreateDept() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getCreateDept, insNursingTurnoverRecord.getCreateDept());
        }
        if (insNursingTurnoverRecord.getCreateTime() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getCreateTime, insNursingTurnoverRecord.getCreateTime());
        }
        if (insNursingTurnoverRecord.getUpdateUser() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getUpdateUser, insNursingTurnoverRecord.getUpdateUser());
        }
        if (insNursingTurnoverRecord.getUpdateTime() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getUpdateTime, insNursingTurnoverRecord.getUpdateTime());
        }
        if (insNursingTurnoverRecord.getIsDeleted() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getIsDeleted, insNursingTurnoverRecord.getIsDeleted());
        }
        if (insNursingTurnoverRecord.getStatus() != null) {
            chainWrapper.set(InsNursingTurnoverRecord::getStatus, insNursingTurnoverRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingTurnoverRecord::getId, insNursingTurnoverRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingTurnoverRecord.getId());
        } else {
            return insNursingTurnoverRecord;
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
    public boolean saveInsNursingTurnoverRecordBatch(List<InsNursingTurnoverRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingTurnoverRecord insNursingTurnoverRecord : insertList) {
            //使用默认的雪花算法生成
            insNursingTurnoverRecord.setId(null);
            //insNursingTurnoverRecord.setCreatedDt(currentDte);
            //insNursingTurnoverRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingTurnoverRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingTurnoverRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


