package cn.pluss.platform.service.insDonateRecord.impl;

import cn.pluss.platform.mapper.InsDonateRecordMapper;
import cn.pluss.platform.model.entity.InsDonateRecord;
import cn.pluss.platform.service.insDonateRecord.InsDonateRecordService;
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
@Service("insDonateRecordService")
public class InsDonateRecordServiceImpl extends ServiceImpl< InsDonateRecordMapper, InsDonateRecord> implements InsDonateRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsDonateRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsDonateRecord> queryPage(Map map) {
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
    public InsDonateRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insDonateRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsDonateRecord queryOne(InsDonateRecord insDonateRecord){
        LambdaQueryWrapper<InsDonateRecord> queryWrapper = getQueryWrapper(insDonateRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insDonateRecord
    * @return
    */
    @Override
    public List<InsDonateRecord> queryList(InsDonateRecord insDonateRecord) {
        LambdaQueryWrapper<InsDonateRecord> queryWrapper = getQueryWrapper(insDonateRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insDonateRecord
    * @return
    */
    public static LambdaQueryWrapper<InsDonateRecord> getQueryWrapper(InsDonateRecord insDonateRecord){
        LambdaQueryWrapper<InsDonateRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insDonateRecord.getId() != null) {
            queryWrapper.eq(InsDonateRecord::getId, insDonateRecord.getId());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getTenantId())) {
            queryWrapper.eq(InsDonateRecord::getTenantId, insDonateRecord.getTenantId());
        }
        if (insDonateRecord.getCorpId() != null) {
            queryWrapper.eq(InsDonateRecord::getCorpId, insDonateRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getCorpName())) {
            queryWrapper.eq(InsDonateRecord::getCorpName, insDonateRecord.getCorpName());
        }
        if (insDonateRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsDonateRecord::getInstitutionId, insDonateRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getInstitutionName())) {
            queryWrapper.eq(InsDonateRecord::getInstitutionName, insDonateRecord.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getDonateCode())) {
            queryWrapper.eq(InsDonateRecord::getDonateCode, insDonateRecord.getDonateCode());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getDonateName())) {
            queryWrapper.eq(InsDonateRecord::getDonateName, insDonateRecord.getDonateName());
        }
        if (insDonateRecord.getDonateTime() != null) {
            queryWrapper.eq(InsDonateRecord::getDonateTime, insDonateRecord.getDonateTime());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getDonateType())) {
            queryWrapper.eq(InsDonateRecord::getDonateType, insDonateRecord.getDonateType());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getRecipientName())) {
            queryWrapper.eq(InsDonateRecord::getRecipientName, insDonateRecord.getRecipientName());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getDonateDestinate())) {
            queryWrapper.eq(InsDonateRecord::getDonateDestinate, insDonateRecord.getDonateDestinate());
        }
        if (insDonateRecord.getDonateCertificate() != null) {
            queryWrapper.eq(InsDonateRecord::getDonateCertificate, insDonateRecord.getDonateCertificate());
        }
        if (insDonateRecord.getBackHonor() != null) {
            queryWrapper.eq(InsDonateRecord::getBackHonor, insDonateRecord.getBackHonor());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getDonorWords())) {
            queryWrapper.eq(InsDonateRecord::getDonorWords, insDonateRecord.getDonorWords());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getRemark())) {
            queryWrapper.eq(InsDonateRecord::getRemark, insDonateRecord.getRemark());
        }
        if (insDonateRecord.getCreateUser() != null) {
            queryWrapper.eq(InsDonateRecord::getCreateUser, insDonateRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insDonateRecord.getCreateName())) {
            queryWrapper.eq(InsDonateRecord::getCreateName, insDonateRecord.getCreateName());
        }
        if (insDonateRecord.getCreateDept() != null) {
            queryWrapper.eq(InsDonateRecord::getCreateDept, insDonateRecord.getCreateDept());
        }
        if (insDonateRecord.getCreateTime() != null) {
            queryWrapper.eq(InsDonateRecord::getCreateTime, insDonateRecord.getCreateTime());
        }
        if (insDonateRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsDonateRecord::getUpdateUser, insDonateRecord.getUpdateUser());
        }
        if (insDonateRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsDonateRecord::getUpdateTime, insDonateRecord.getUpdateTime());
        }
        if (insDonateRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsDonateRecord::getIsDeleted, insDonateRecord.getIsDeleted());
        }
        if (insDonateRecord.getStatus() != null) {
            queryWrapper.eq(InsDonateRecord::getStatus, insDonateRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insDonateRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsDonateRecord insert(InsDonateRecord insDonateRecord) {
        insDonateRecord.setId(null);
        getBaseMapper().insert(insDonateRecord);
        return insDonateRecord;
    }

    /**
    * 更新数据
    *
    * @param insDonateRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsDonateRecord update(InsDonateRecord insDonateRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsDonateRecord> chainWrapper = new LambdaUpdateChainWrapper<InsDonateRecord>(getBaseMapper());
        if (insDonateRecord.getId() != null) {
            chainWrapper.set(InsDonateRecord::getId, insDonateRecord.getId());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getTenantId())) {
            chainWrapper.set(InsDonateRecord::getTenantId, insDonateRecord.getTenantId());
        }
        if (insDonateRecord.getCorpId() != null) {
            chainWrapper.set(InsDonateRecord::getCorpId, insDonateRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getCorpName())) {
            chainWrapper.set(InsDonateRecord::getCorpName, insDonateRecord.getCorpName());
        }
        if (insDonateRecord.getInstitutionId() != null) {
            chainWrapper.set(InsDonateRecord::getInstitutionId, insDonateRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getInstitutionName())) {
            chainWrapper.set(InsDonateRecord::getInstitutionName, insDonateRecord.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getDonateCode())) {
            chainWrapper.set(InsDonateRecord::getDonateCode, insDonateRecord.getDonateCode());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getDonateName())) {
            chainWrapper.set(InsDonateRecord::getDonateName, insDonateRecord.getDonateName());
        }
        if (insDonateRecord.getDonateTime() != null) {
            chainWrapper.set(InsDonateRecord::getDonateTime, insDonateRecord.getDonateTime());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getDonateType())) {
            chainWrapper.set(InsDonateRecord::getDonateType, insDonateRecord.getDonateType());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getRecipientName())) {
            chainWrapper.set(InsDonateRecord::getRecipientName, insDonateRecord.getRecipientName());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getDonateDestinate())) {
            chainWrapper.set(InsDonateRecord::getDonateDestinate, insDonateRecord.getDonateDestinate());
        }
        if (insDonateRecord.getDonateCertificate() != null) {
            chainWrapper.set(InsDonateRecord::getDonateCertificate, insDonateRecord.getDonateCertificate());
        }
        if (insDonateRecord.getBackHonor() != null) {
            chainWrapper.set(InsDonateRecord::getBackHonor, insDonateRecord.getBackHonor());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getDonorWords())) {
            chainWrapper.set(InsDonateRecord::getDonorWords, insDonateRecord.getDonorWords());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getRemark())) {
            chainWrapper.set(InsDonateRecord::getRemark, insDonateRecord.getRemark());
        }
        if (insDonateRecord.getCreateUser() != null) {
            chainWrapper.set(InsDonateRecord::getCreateUser, insDonateRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insDonateRecord.getCreateName())) {
            chainWrapper.set(InsDonateRecord::getCreateName, insDonateRecord.getCreateName());
        }
        if (insDonateRecord.getCreateDept() != null) {
            chainWrapper.set(InsDonateRecord::getCreateDept, insDonateRecord.getCreateDept());
        }
        if (insDonateRecord.getCreateTime() != null) {
            chainWrapper.set(InsDonateRecord::getCreateTime, insDonateRecord.getCreateTime());
        }
        if (insDonateRecord.getUpdateUser() != null) {
            chainWrapper.set(InsDonateRecord::getUpdateUser, insDonateRecord.getUpdateUser());
        }
        if (insDonateRecord.getUpdateTime() != null) {
            chainWrapper.set(InsDonateRecord::getUpdateTime, insDonateRecord.getUpdateTime());
        }
        if (insDonateRecord.getIsDeleted() != null) {
            chainWrapper.set(InsDonateRecord::getIsDeleted, insDonateRecord.getIsDeleted());
        }
        if (insDonateRecord.getStatus() != null) {
            chainWrapper.set(InsDonateRecord::getStatus, insDonateRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsDonateRecord::getId, insDonateRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insDonateRecord.getId());
        } else {
            return insDonateRecord;
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
    public boolean saveInsDonateRecordBatch(List<InsDonateRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsDonateRecord insDonateRecord : insertList) {
            //使用默认的雪花算法生成
            insDonateRecord.setId(null);
            //insDonateRecord.setCreatedDt(currentDte);
            //insDonateRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsDonateRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsDonateRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


