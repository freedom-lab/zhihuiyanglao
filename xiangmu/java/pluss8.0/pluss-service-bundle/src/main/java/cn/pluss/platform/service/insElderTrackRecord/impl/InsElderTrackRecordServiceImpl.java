package cn.pluss.platform.service.insElderTrackRecord.impl;

import cn.pluss.platform.mapper.InsElderTrackRecordMapper;
import cn.pluss.platform.model.entity.InsElderTrackRecord;
import cn.pluss.platform.service.insElderTrackRecord.InsElderTrackRecordService;
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
@Service("insElderTrackRecordService")
public class InsElderTrackRecordServiceImpl extends ServiceImpl< InsElderTrackRecordMapper, InsElderTrackRecord> implements InsElderTrackRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderTrackRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderTrackRecord> queryPage(Map map) {
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
    public InsElderTrackRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderTrackRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderTrackRecord queryOne(InsElderTrackRecord insElderTrackRecord){
        LambdaQueryWrapper<InsElderTrackRecord> queryWrapper = getQueryWrapper(insElderTrackRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderTrackRecord
    * @return
    */
    @Override
    public List<InsElderTrackRecord> queryList(InsElderTrackRecord insElderTrackRecord) {
        LambdaQueryWrapper<InsElderTrackRecord> queryWrapper = getQueryWrapper(insElderTrackRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderTrackRecord
    * @return
    */
    public static LambdaQueryWrapper<InsElderTrackRecord> getQueryWrapper(InsElderTrackRecord insElderTrackRecord){
        LambdaQueryWrapper<InsElderTrackRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderTrackRecord.getId() != null) {
            queryWrapper.eq(InsElderTrackRecord::getId, insElderTrackRecord.getId());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getTenantId())) {
            queryWrapper.eq(InsElderTrackRecord::getTenantId, insElderTrackRecord.getTenantId());
        }
        if (insElderTrackRecord.getCorpId() != null) {
            queryWrapper.eq(InsElderTrackRecord::getCorpId, insElderTrackRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getCorpName())) {
            queryWrapper.eq(InsElderTrackRecord::getCorpName, insElderTrackRecord.getCorpName());
        }
        if (insElderTrackRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsElderTrackRecord::getInstitutionId, insElderTrackRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getInstitutionName())) {
            queryWrapper.eq(InsElderTrackRecord::getInstitutionName, insElderTrackRecord.getInstitutionName());
        }
        if (insElderTrackRecord.getCheckId() != null) {
            queryWrapper.eq(InsElderTrackRecord::getCheckId, insElderTrackRecord.getCheckId());
        }
        if (insElderTrackRecord.getElderId() != null) {
            queryWrapper.eq(InsElderTrackRecord::getElderId, insElderTrackRecord.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getElderName())) {
            queryWrapper.eq(InsElderTrackRecord::getElderName, insElderTrackRecord.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getIdCard())) {
            queryWrapper.eq(InsElderTrackRecord::getIdCard, insElderTrackRecord.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getSex())) {
            queryWrapper.eq(InsElderTrackRecord::getSex, insElderTrackRecord.getSex());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getProblemDescribeOne())) {
            queryWrapper.eq(InsElderTrackRecord::getProblemDescribeOne, insElderTrackRecord.getProblemDescribeOne());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getHandleDescribeOne())) {
            queryWrapper.eq(InsElderTrackRecord::getHandleDescribeOne, insElderTrackRecord.getHandleDescribeOne());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getProblemDescribeTwo())) {
            queryWrapper.eq(InsElderTrackRecord::getProblemDescribeTwo, insElderTrackRecord.getProblemDescribeTwo());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getHandleDescribeTwo())) {
            queryWrapper.eq(InsElderTrackRecord::getHandleDescribeTwo, insElderTrackRecord.getHandleDescribeTwo());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getProblemDescribeThree())) {
            queryWrapper.eq(InsElderTrackRecord::getProblemDescribeThree, insElderTrackRecord.getProblemDescribeThree());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getHandleDescribeThree())) {
            queryWrapper.eq(InsElderTrackRecord::getHandleDescribeThree, insElderTrackRecord.getHandleDescribeThree());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getProblemDescribeFour())) {
            queryWrapper.eq(InsElderTrackRecord::getProblemDescribeFour, insElderTrackRecord.getProblemDescribeFour());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getHandleDescribeFour())) {
            queryWrapper.eq(InsElderTrackRecord::getHandleDescribeFour, insElderTrackRecord.getHandleDescribeFour());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getProblemDescribeFive())) {
            queryWrapper.eq(InsElderTrackRecord::getProblemDescribeFive, insElderTrackRecord.getProblemDescribeFive());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getHandleDescribeFive())) {
            queryWrapper.eq(InsElderTrackRecord::getHandleDescribeFive, insElderTrackRecord.getHandleDescribeFive());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getProblemDescribeSix())) {
            queryWrapper.eq(InsElderTrackRecord::getProblemDescribeSix, insElderTrackRecord.getProblemDescribeSix());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getHandleDescribeSix())) {
            queryWrapper.eq(InsElderTrackRecord::getHandleDescribeSix, insElderTrackRecord.getHandleDescribeSix());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getProblemDescribeSeven())) {
            queryWrapper.eq(InsElderTrackRecord::getProblemDescribeSeven, insElderTrackRecord.getProblemDescribeSeven());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getHandleDescribeSeven())) {
            queryWrapper.eq(InsElderTrackRecord::getHandleDescribeSeven, insElderTrackRecord.getHandleDescribeSeven());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getRemark())) {
            queryWrapper.eq(InsElderTrackRecord::getRemark, insElderTrackRecord.getRemark());
        }
        if (insElderTrackRecord.getCreateUser() != null) {
            queryWrapper.eq(InsElderTrackRecord::getCreateUser, insElderTrackRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderTrackRecord.getCreateName())) {
            queryWrapper.eq(InsElderTrackRecord::getCreateName, insElderTrackRecord.getCreateName());
        }
        if (insElderTrackRecord.getCreateDept() != null) {
            queryWrapper.eq(InsElderTrackRecord::getCreateDept, insElderTrackRecord.getCreateDept());
        }
        if (insElderTrackRecord.getCreateTime() != null) {
            queryWrapper.eq(InsElderTrackRecord::getCreateTime, insElderTrackRecord.getCreateTime());
        }
        if (insElderTrackRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsElderTrackRecord::getUpdateUser, insElderTrackRecord.getUpdateUser());
        }
        if (insElderTrackRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsElderTrackRecord::getUpdateTime, insElderTrackRecord.getUpdateTime());
        }
        if (insElderTrackRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsElderTrackRecord::getIsDeleted, insElderTrackRecord.getIsDeleted());
        }
        if (insElderTrackRecord.getStatus() != null) {
            queryWrapper.eq(InsElderTrackRecord::getStatus, insElderTrackRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderTrackRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderTrackRecord insert(InsElderTrackRecord insElderTrackRecord) {
        insElderTrackRecord.setId(null);
        getBaseMapper().insert(insElderTrackRecord);
        return insElderTrackRecord;
    }

    /**
    * 更新数据
    *
    * @param insElderTrackRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderTrackRecord update(InsElderTrackRecord insElderTrackRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderTrackRecord> chainWrapper = new LambdaUpdateChainWrapper<InsElderTrackRecord>(getBaseMapper());
        if (insElderTrackRecord.getId() != null) {
            chainWrapper.set(InsElderTrackRecord::getId, insElderTrackRecord.getId());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getTenantId())) {
            chainWrapper.set(InsElderTrackRecord::getTenantId, insElderTrackRecord.getTenantId());
        }
        if (insElderTrackRecord.getCorpId() != null) {
            chainWrapper.set(InsElderTrackRecord::getCorpId, insElderTrackRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getCorpName())) {
            chainWrapper.set(InsElderTrackRecord::getCorpName, insElderTrackRecord.getCorpName());
        }
        if (insElderTrackRecord.getInstitutionId() != null) {
            chainWrapper.set(InsElderTrackRecord::getInstitutionId, insElderTrackRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getInstitutionName())) {
            chainWrapper.set(InsElderTrackRecord::getInstitutionName, insElderTrackRecord.getInstitutionName());
        }
        if (insElderTrackRecord.getCheckId() != null) {
            chainWrapper.set(InsElderTrackRecord::getCheckId, insElderTrackRecord.getCheckId());
        }
        if (insElderTrackRecord.getElderId() != null) {
            chainWrapper.set(InsElderTrackRecord::getElderId, insElderTrackRecord.getElderId());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getElderName())) {
            chainWrapper.set(InsElderTrackRecord::getElderName, insElderTrackRecord.getElderName());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getIdCard())) {
            chainWrapper.set(InsElderTrackRecord::getIdCard, insElderTrackRecord.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getSex())) {
            chainWrapper.set(InsElderTrackRecord::getSex, insElderTrackRecord.getSex());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getProblemDescribeOne())) {
            chainWrapper.set(InsElderTrackRecord::getProblemDescribeOne, insElderTrackRecord.getProblemDescribeOne());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getHandleDescribeOne())) {
            chainWrapper.set(InsElderTrackRecord::getHandleDescribeOne, insElderTrackRecord.getHandleDescribeOne());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getProblemDescribeTwo())) {
            chainWrapper.set(InsElderTrackRecord::getProblemDescribeTwo, insElderTrackRecord.getProblemDescribeTwo());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getHandleDescribeTwo())) {
            chainWrapper.set(InsElderTrackRecord::getHandleDescribeTwo, insElderTrackRecord.getHandleDescribeTwo());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getProblemDescribeThree())) {
            chainWrapper.set(InsElderTrackRecord::getProblemDescribeThree, insElderTrackRecord.getProblemDescribeThree());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getHandleDescribeThree())) {
            chainWrapper.set(InsElderTrackRecord::getHandleDescribeThree, insElderTrackRecord.getHandleDescribeThree());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getProblemDescribeFour())) {
            chainWrapper.set(InsElderTrackRecord::getProblemDescribeFour, insElderTrackRecord.getProblemDescribeFour());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getHandleDescribeFour())) {
            chainWrapper.set(InsElderTrackRecord::getHandleDescribeFour, insElderTrackRecord.getHandleDescribeFour());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getProblemDescribeFive())) {
            chainWrapper.set(InsElderTrackRecord::getProblemDescribeFive, insElderTrackRecord.getProblemDescribeFive());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getHandleDescribeFive())) {
            chainWrapper.set(InsElderTrackRecord::getHandleDescribeFive, insElderTrackRecord.getHandleDescribeFive());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getProblemDescribeSix())) {
            chainWrapper.set(InsElderTrackRecord::getProblemDescribeSix, insElderTrackRecord.getProblemDescribeSix());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getHandleDescribeSix())) {
            chainWrapper.set(InsElderTrackRecord::getHandleDescribeSix, insElderTrackRecord.getHandleDescribeSix());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getProblemDescribeSeven())) {
            chainWrapper.set(InsElderTrackRecord::getProblemDescribeSeven, insElderTrackRecord.getProblemDescribeSeven());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getHandleDescribeSeven())) {
            chainWrapper.set(InsElderTrackRecord::getHandleDescribeSeven, insElderTrackRecord.getHandleDescribeSeven());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getRemark())) {
            chainWrapper.set(InsElderTrackRecord::getRemark, insElderTrackRecord.getRemark());
        }
        if (insElderTrackRecord.getCreateUser() != null) {
            chainWrapper.set(InsElderTrackRecord::getCreateUser, insElderTrackRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderTrackRecord.getCreateName())) {
            chainWrapper.set(InsElderTrackRecord::getCreateName, insElderTrackRecord.getCreateName());
        }
        if (insElderTrackRecord.getCreateDept() != null) {
            chainWrapper.set(InsElderTrackRecord::getCreateDept, insElderTrackRecord.getCreateDept());
        }
        if (insElderTrackRecord.getCreateTime() != null) {
            chainWrapper.set(InsElderTrackRecord::getCreateTime, insElderTrackRecord.getCreateTime());
        }
        if (insElderTrackRecord.getUpdateUser() != null) {
            chainWrapper.set(InsElderTrackRecord::getUpdateUser, insElderTrackRecord.getUpdateUser());
        }
        if (insElderTrackRecord.getUpdateTime() != null) {
            chainWrapper.set(InsElderTrackRecord::getUpdateTime, insElderTrackRecord.getUpdateTime());
        }
        if (insElderTrackRecord.getIsDeleted() != null) {
            chainWrapper.set(InsElderTrackRecord::getIsDeleted, insElderTrackRecord.getIsDeleted());
        }
        if (insElderTrackRecord.getStatus() != null) {
            chainWrapper.set(InsElderTrackRecord::getStatus, insElderTrackRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderTrackRecord::getId, insElderTrackRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderTrackRecord.getId());
        } else {
            return insElderTrackRecord;
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
    public boolean saveInsElderTrackRecordBatch(List<InsElderTrackRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderTrackRecord insElderTrackRecord : insertList) {
            //使用默认的雪花算法生成
            insElderTrackRecord.setId(null);
            //insElderTrackRecord.setCreatedDt(currentDte);
            //insElderTrackRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderTrackRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderTrackRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


