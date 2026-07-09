package cn.pluss.platform.service.communityActiveCareRecord.impl;

import cn.pluss.platform.mapper.CommunityActiveCareRecordMapper;
import cn.pluss.platform.model.entity.CommunityActiveCareRecord;
import cn.pluss.platform.service.communityActiveCareRecord.CommunityActiveCareRecordService;
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
@Service("communityActiveCareRecordService")
public class CommunityActiveCareRecordServiceImpl extends ServiceImpl< CommunityActiveCareRecordMapper, CommunityActiveCareRecord> implements CommunityActiveCareRecordService {
    private static final Logger logger = LoggerFactory.getLogger(CommunityActiveCareRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CommunityActiveCareRecord> queryPage(Map map) {
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
    public CommunityActiveCareRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param communityActiveCareRecord 实例对象
    * @return 实例对象
    */
    @Override
    public CommunityActiveCareRecord queryOne(CommunityActiveCareRecord communityActiveCareRecord){
        LambdaQueryWrapper<CommunityActiveCareRecord> queryWrapper = getQueryWrapper(communityActiveCareRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param communityActiveCareRecord
    * @return
    */
    @Override
    public List<CommunityActiveCareRecord> queryList(CommunityActiveCareRecord communityActiveCareRecord) {
        LambdaQueryWrapper<CommunityActiveCareRecord> queryWrapper = getQueryWrapper(communityActiveCareRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param communityActiveCareRecord
    * @return
    */
    public static LambdaQueryWrapper<CommunityActiveCareRecord> getQueryWrapper(CommunityActiveCareRecord communityActiveCareRecord){
        LambdaQueryWrapper<CommunityActiveCareRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (communityActiveCareRecord.getId() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getId, communityActiveCareRecord.getId());
        }
        if (StringUtil.isNotEmpty(communityActiveCareRecord.getTenantId())) {
            queryWrapper.eq(CommunityActiveCareRecord::getTenantId, communityActiveCareRecord.getTenantId());
        }
        if (communityActiveCareRecord.getCorpId() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getCorpId, communityActiveCareRecord.getCorpId());
        }
        if (communityActiveCareRecord.getInstitutionId() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getInstitutionId, communityActiveCareRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(communityActiveCareRecord.getInstitutionName())) {
            queryWrapper.eq(CommunityActiveCareRecord::getInstitutionName, communityActiveCareRecord.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(communityActiveCareRecord.getCareType())) {
            queryWrapper.eq(CommunityActiveCareRecord::getCareType, communityActiveCareRecord.getCareType());
        }
        if (communityActiveCareRecord.getCareMode() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getCareMode, communityActiveCareRecord.getCareMode());
        }
        if (StringUtil.isNotEmpty(communityActiveCareRecord.getSendContext())) {
            queryWrapper.eq(CommunityActiveCareRecord::getSendContext, communityActiveCareRecord.getSendContext());
        }
        if (communityActiveCareRecord.getSendState() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getSendState, communityActiveCareRecord.getSendState());
        }
        if (communityActiveCareRecord.getSendTime() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getSendTime, communityActiveCareRecord.getSendTime());
        }
        if (StringUtil.isNotEmpty(communityActiveCareRecord.getElderIds())) {
            queryWrapper.eq(CommunityActiveCareRecord::getElderIds, communityActiveCareRecord.getElderIds());
        }
        if (StringUtil.isNotEmpty(communityActiveCareRecord.getElderNames())) {
            queryWrapper.eq(CommunityActiveCareRecord::getElderNames, communityActiveCareRecord.getElderNames());
        }
        if (StringUtil.isNotEmpty(communityActiveCareRecord.getTelNums())) {
            queryWrapper.eq(CommunityActiveCareRecord::getTelNums, communityActiveCareRecord.getTelNums());
        }
        if (communityActiveCareRecord.getAmount() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getAmount, communityActiveCareRecord.getAmount());
        }
        if (StringUtil.isNotEmpty(communityActiveCareRecord.getRemark())) {
            queryWrapper.eq(CommunityActiveCareRecord::getRemark, communityActiveCareRecord.getRemark());
        }
        if (communityActiveCareRecord.getCreateUser() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getCreateUser, communityActiveCareRecord.getCreateUser());
        }
        if (communityActiveCareRecord.getCreateDept() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getCreateDept, communityActiveCareRecord.getCreateDept());
        }
        if (communityActiveCareRecord.getCreateTime() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getCreateTime, communityActiveCareRecord.getCreateTime());
        }
        if (communityActiveCareRecord.getUpdateUser() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getUpdateUser, communityActiveCareRecord.getUpdateUser());
        }
        if (communityActiveCareRecord.getUpdateTime() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getUpdateTime, communityActiveCareRecord.getUpdateTime());
        }
        if (communityActiveCareRecord.getStatus() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getStatus, communityActiveCareRecord.getStatus());
        }
        if (communityActiveCareRecord.getIsDeleted() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getIsDeleted, communityActiveCareRecord.getIsDeleted());
        }
        if (communityActiveCareRecord.getAreaCode() != null) {
            queryWrapper.eq(CommunityActiveCareRecord::getAreaCode, communityActiveCareRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(communityActiveCareRecord.getAreaName())) {
            queryWrapper.eq(CommunityActiveCareRecord::getAreaName, communityActiveCareRecord.getAreaName());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param communityActiveCareRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityActiveCareRecord insert(CommunityActiveCareRecord communityActiveCareRecord) {
        communityActiveCareRecord.setId(null);
        getBaseMapper().insert(communityActiveCareRecord);
        return communityActiveCareRecord;
    }

    /**
    * 更新数据
    *
    * @param communityActiveCareRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityActiveCareRecord update(CommunityActiveCareRecord communityActiveCareRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CommunityActiveCareRecord> chainWrapper = new LambdaUpdateChainWrapper<CommunityActiveCareRecord>(getBaseMapper());
        if (communityActiveCareRecord.getId() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getId, communityActiveCareRecord.getId());
        }
        if (StringUtil.isNotBlank(communityActiveCareRecord.getTenantId())) {
            chainWrapper.set(CommunityActiveCareRecord::getTenantId, communityActiveCareRecord.getTenantId());
        }
        if (communityActiveCareRecord.getCorpId() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getCorpId, communityActiveCareRecord.getCorpId());
        }
        if (communityActiveCareRecord.getInstitutionId() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getInstitutionId, communityActiveCareRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(communityActiveCareRecord.getInstitutionName())) {
            chainWrapper.set(CommunityActiveCareRecord::getInstitutionName, communityActiveCareRecord.getInstitutionName());
        }
        if (StringUtil.isNotBlank(communityActiveCareRecord.getCareType())) {
            chainWrapper.set(CommunityActiveCareRecord::getCareType, communityActiveCareRecord.getCareType());
        }
        if (communityActiveCareRecord.getCareMode() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getCareMode, communityActiveCareRecord.getCareMode());
        }
        if (StringUtil.isNotBlank(communityActiveCareRecord.getSendContext())) {
            chainWrapper.set(CommunityActiveCareRecord::getSendContext, communityActiveCareRecord.getSendContext());
        }
        if (communityActiveCareRecord.getSendState() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getSendState, communityActiveCareRecord.getSendState());
        }
        if (communityActiveCareRecord.getSendTime() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getSendTime, communityActiveCareRecord.getSendTime());
        }
        if (StringUtil.isNotBlank(communityActiveCareRecord.getElderIds())) {
            chainWrapper.set(CommunityActiveCareRecord::getElderIds, communityActiveCareRecord.getElderIds());
        }
        if (StringUtil.isNotBlank(communityActiveCareRecord.getElderNames())) {
            chainWrapper.set(CommunityActiveCareRecord::getElderNames, communityActiveCareRecord.getElderNames());
        }
        if (StringUtil.isNotBlank(communityActiveCareRecord.getTelNums())) {
            chainWrapper.set(CommunityActiveCareRecord::getTelNums, communityActiveCareRecord.getTelNums());
        }
        if (communityActiveCareRecord.getAmount() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getAmount, communityActiveCareRecord.getAmount());
        }
        if (StringUtil.isNotBlank(communityActiveCareRecord.getRemark())) {
            chainWrapper.set(CommunityActiveCareRecord::getRemark, communityActiveCareRecord.getRemark());
        }
        if (communityActiveCareRecord.getCreateUser() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getCreateUser, communityActiveCareRecord.getCreateUser());
        }
        if (communityActiveCareRecord.getCreateDept() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getCreateDept, communityActiveCareRecord.getCreateDept());
        }
        if (communityActiveCareRecord.getCreateTime() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getCreateTime, communityActiveCareRecord.getCreateTime());
        }
        if (communityActiveCareRecord.getUpdateUser() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getUpdateUser, communityActiveCareRecord.getUpdateUser());
        }
        if (communityActiveCareRecord.getUpdateTime() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getUpdateTime, communityActiveCareRecord.getUpdateTime());
        }
        if (communityActiveCareRecord.getStatus() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getStatus, communityActiveCareRecord.getStatus());
        }
        if (communityActiveCareRecord.getIsDeleted() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getIsDeleted, communityActiveCareRecord.getIsDeleted());
        }
        if (communityActiveCareRecord.getAreaCode() != null) {
            chainWrapper.set(CommunityActiveCareRecord::getAreaCode, communityActiveCareRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(communityActiveCareRecord.getAreaName())) {
            chainWrapper.set(CommunityActiveCareRecord::getAreaName, communityActiveCareRecord.getAreaName());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CommunityActiveCareRecord::getId, communityActiveCareRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(communityActiveCareRecord.getId());
        } else {
            return communityActiveCareRecord;
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
    public boolean saveCommunityActiveCareRecordBatch(List<CommunityActiveCareRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CommunityActiveCareRecord communityActiveCareRecord : insertList) {
            //使用默认的雪花算法生成
            communityActiveCareRecord.setId(null);
            //communityActiveCareRecord.setCreatedDt(currentDte);
            //communityActiveCareRecord.setUpdatedDt(currentDte);
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
    public Integer deleteCommunityActiveCareRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CommunityActiveCareRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


