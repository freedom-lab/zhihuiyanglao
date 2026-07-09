package cn.pluss.platform.service.insExpensesPurchaseRecord.impl;

import cn.pluss.platform.mapper.InsExpensesPurchaseRecordMapper;
import cn.pluss.platform.model.entity.InsExpensesPurchaseRecord;
import cn.pluss.platform.service.insExpensesPurchaseRecord.InsExpensesPurchaseRecordService;
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
@Service("insExpensesPurchaseRecordService")
public class InsExpensesPurchaseRecordServiceImpl extends ServiceImpl< InsExpensesPurchaseRecordMapper, InsExpensesPurchaseRecord> implements InsExpensesPurchaseRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsExpensesPurchaseRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsExpensesPurchaseRecord> queryPage(Map map) {
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
    public InsExpensesPurchaseRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesPurchaseRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsExpensesPurchaseRecord queryOne(InsExpensesPurchaseRecord insExpensesPurchaseRecord){
        LambdaQueryWrapper<InsExpensesPurchaseRecord> queryWrapper = getQueryWrapper(insExpensesPurchaseRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesPurchaseRecord
    * @return
    */
    @Override
    public List<InsExpensesPurchaseRecord> queryList(InsExpensesPurchaseRecord insExpensesPurchaseRecord) {
        LambdaQueryWrapper<InsExpensesPurchaseRecord> queryWrapper = getQueryWrapper(insExpensesPurchaseRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insExpensesPurchaseRecord
    * @return
    */
    public static LambdaQueryWrapper<InsExpensesPurchaseRecord> getQueryWrapper(InsExpensesPurchaseRecord insExpensesPurchaseRecord){
        LambdaQueryWrapper<InsExpensesPurchaseRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insExpensesPurchaseRecord.getId() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getId, insExpensesPurchaseRecord.getId());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getTenantId())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getTenantId, insExpensesPurchaseRecord.getTenantId());
        }
        if (insExpensesPurchaseRecord.getCorpId() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getCorpId, insExpensesPurchaseRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getCorpName())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getCorpName, insExpensesPurchaseRecord.getCorpName());
        }
        if (insExpensesPurchaseRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getInstitutionId, insExpensesPurchaseRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getInstitutionName())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getInstitutionName, insExpensesPurchaseRecord.getInstitutionName());
        }
        if (insExpensesPurchaseRecord.getCheckId() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getCheckId, insExpensesPurchaseRecord.getCheckId());
        }
        if (insExpensesPurchaseRecord.getCheckDate() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getCheckDate, insExpensesPurchaseRecord.getCheckDate());
        }
        if (insExpensesPurchaseRecord.getElderId() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getElderId, insExpensesPurchaseRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getElderName())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getElderName, insExpensesPurchaseRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getIdCard())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getIdCard, insExpensesPurchaseRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getSex())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getSex, insExpensesPurchaseRecord.getSex());
        }
        if (insExpensesPurchaseRecord.getBuyTime() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getBuyTime, insExpensesPurchaseRecord.getBuyTime());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getArticleName())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getArticleName, insExpensesPurchaseRecord.getArticleName());
        }
        if (insExpensesPurchaseRecord.getArticleType() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getArticleType, insExpensesPurchaseRecord.getArticleType());
        }
        if (insExpensesPurchaseRecord.getArticlePrice() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getArticlePrice, insExpensesPurchaseRecord.getArticlePrice());
        }
        if (insExpensesPurchaseRecord.getStaffId() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getStaffId, insExpensesPurchaseRecord.getStaffId());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getStaffName())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getStaffName, insExpensesPurchaseRecord.getStaffName());
        }
        if (insExpensesPurchaseRecord.getSettlementState() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getSettlementState, insExpensesPurchaseRecord.getSettlementState());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getAreaCode())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getAreaCode, insExpensesPurchaseRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getAreaName())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getAreaName, insExpensesPurchaseRecord.getAreaName());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getRemark())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getRemark, insExpensesPurchaseRecord.getRemark());
        }
        if (insExpensesPurchaseRecord.getCreateUser() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getCreateUser, insExpensesPurchaseRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insExpensesPurchaseRecord.getCreateName())) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getCreateName, insExpensesPurchaseRecord.getCreateName());
        }
        if (insExpensesPurchaseRecord.getCreateDept() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getCreateDept, insExpensesPurchaseRecord.getCreateDept());
        }
        if (insExpensesPurchaseRecord.getCreateTime() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getCreateTime, insExpensesPurchaseRecord.getCreateTime());
        }
        if (insExpensesPurchaseRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getUpdateUser, insExpensesPurchaseRecord.getUpdateUser());
        }
        if (insExpensesPurchaseRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getUpdateTime, insExpensesPurchaseRecord.getUpdateTime());
        }
        if (insExpensesPurchaseRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getIsDeleted, insExpensesPurchaseRecord.getIsDeleted());
        }
        if (insExpensesPurchaseRecord.getStatus() != null) {
            queryWrapper.eq(InsExpensesPurchaseRecord::getStatus, insExpensesPurchaseRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insExpensesPurchaseRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesPurchaseRecord insert(InsExpensesPurchaseRecord insExpensesPurchaseRecord) {
        insExpensesPurchaseRecord.setId(null);
        getBaseMapper().insert(insExpensesPurchaseRecord);
        return insExpensesPurchaseRecord;
    }

    /**
    * 更新数据
    *
    * @param insExpensesPurchaseRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesPurchaseRecord update(InsExpensesPurchaseRecord insExpensesPurchaseRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsExpensesPurchaseRecord> chainWrapper = new LambdaUpdateChainWrapper<InsExpensesPurchaseRecord>(getBaseMapper());
        if (insExpensesPurchaseRecord.getId() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getId, insExpensesPurchaseRecord.getId());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getTenantId())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getTenantId, insExpensesPurchaseRecord.getTenantId());
        }
        if (insExpensesPurchaseRecord.getCorpId() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getCorpId, insExpensesPurchaseRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getCorpName())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getCorpName, insExpensesPurchaseRecord.getCorpName());
        }
        if (insExpensesPurchaseRecord.getInstitutionId() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getInstitutionId, insExpensesPurchaseRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getInstitutionName())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getInstitutionName, insExpensesPurchaseRecord.getInstitutionName());
        }
        if (insExpensesPurchaseRecord.getCheckId() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getCheckId, insExpensesPurchaseRecord.getCheckId());
        }
        if (insExpensesPurchaseRecord.getCheckDate() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getCheckDate, insExpensesPurchaseRecord.getCheckDate());
        }
        if (insExpensesPurchaseRecord.getElderId() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getElderId, insExpensesPurchaseRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getElderName())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getElderName, insExpensesPurchaseRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getIdCard())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getIdCard, insExpensesPurchaseRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getSex())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getSex, insExpensesPurchaseRecord.getSex());
        }
        if (insExpensesPurchaseRecord.getBuyTime() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getBuyTime, insExpensesPurchaseRecord.getBuyTime());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getArticleName())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getArticleName, insExpensesPurchaseRecord.getArticleName());
        }
        if (insExpensesPurchaseRecord.getArticleType() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getArticleType, insExpensesPurchaseRecord.getArticleType());
        }
        if (insExpensesPurchaseRecord.getArticlePrice() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getArticlePrice, insExpensesPurchaseRecord.getArticlePrice());
        }
        if (insExpensesPurchaseRecord.getStaffId() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getStaffId, insExpensesPurchaseRecord.getStaffId());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getStaffName())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getStaffName, insExpensesPurchaseRecord.getStaffName());
        }
        if (insExpensesPurchaseRecord.getSettlementState() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getSettlementState, insExpensesPurchaseRecord.getSettlementState());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getAreaCode())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getAreaCode, insExpensesPurchaseRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getAreaName())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getAreaName, insExpensesPurchaseRecord.getAreaName());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getRemark())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getRemark, insExpensesPurchaseRecord.getRemark());
        }
        if (insExpensesPurchaseRecord.getCreateUser() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getCreateUser, insExpensesPurchaseRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insExpensesPurchaseRecord.getCreateName())) {
            chainWrapper.set(InsExpensesPurchaseRecord::getCreateName, insExpensesPurchaseRecord.getCreateName());
        }
        if (insExpensesPurchaseRecord.getCreateDept() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getCreateDept, insExpensesPurchaseRecord.getCreateDept());
        }
        if (insExpensesPurchaseRecord.getCreateTime() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getCreateTime, insExpensesPurchaseRecord.getCreateTime());
        }
        if (insExpensesPurchaseRecord.getUpdateUser() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getUpdateUser, insExpensesPurchaseRecord.getUpdateUser());
        }
        if (insExpensesPurchaseRecord.getUpdateTime() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getUpdateTime, insExpensesPurchaseRecord.getUpdateTime());
        }
        if (insExpensesPurchaseRecord.getIsDeleted() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getIsDeleted, insExpensesPurchaseRecord.getIsDeleted());
        }
        if (insExpensesPurchaseRecord.getStatus() != null) {
            chainWrapper.set(InsExpensesPurchaseRecord::getStatus, insExpensesPurchaseRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsExpensesPurchaseRecord::getId, insExpensesPurchaseRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insExpensesPurchaseRecord.getId());
        } else {
            return insExpensesPurchaseRecord;
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
    public boolean saveInsExpensesPurchaseRecordBatch(List<InsExpensesPurchaseRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsExpensesPurchaseRecord insExpensesPurchaseRecord : insertList) {
            //使用默认的雪花算法生成
            insExpensesPurchaseRecord.setId(null);
            //insExpensesPurchaseRecord.setCreatedDt(currentDte);
            //insExpensesPurchaseRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsExpensesPurchaseRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsExpensesPurchaseRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


