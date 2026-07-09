package cn.pluss.platform.service.insSuddenEventInfo.impl;

import cn.pluss.platform.mapper.InsSuddenEventInfoMapper;
import cn.pluss.platform.model.entity.InsSuddenEventInfo;
import cn.pluss.platform.service.insSuddenEventInfo.InsSuddenEventInfoService;
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
@Service("insSuddenEventInfoService")
public class InsSuddenEventInfoServiceImpl extends ServiceImpl< InsSuddenEventInfoMapper, InsSuddenEventInfo> implements InsSuddenEventInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsSuddenEventInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSuddenEventInfo> queryPage(Map map) {
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
    public InsSuddenEventInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSuddenEventInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsSuddenEventInfo queryOne(InsSuddenEventInfo insSuddenEventInfo){
        LambdaQueryWrapper<InsSuddenEventInfo> queryWrapper = getQueryWrapper(insSuddenEventInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSuddenEventInfo
    * @return
    */
    @Override
    public List<InsSuddenEventInfo> queryList(InsSuddenEventInfo insSuddenEventInfo) {
        LambdaQueryWrapper<InsSuddenEventInfo> queryWrapper = getQueryWrapper(insSuddenEventInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSuddenEventInfo
    * @return
    */
    public static LambdaQueryWrapper<InsSuddenEventInfo> getQueryWrapper(InsSuddenEventInfo insSuddenEventInfo){
        LambdaQueryWrapper<InsSuddenEventInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insSuddenEventInfo.getId() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getId, insSuddenEventInfo.getId());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getTenantId())) {
            queryWrapper.eq(InsSuddenEventInfo::getTenantId, insSuddenEventInfo.getTenantId());
        }
        if (insSuddenEventInfo.getCorpId() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getCorpId, insSuddenEventInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getCorpName())) {
            queryWrapper.eq(InsSuddenEventInfo::getCorpName, insSuddenEventInfo.getCorpName());
        }
        if (insSuddenEventInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getInstitutionId, insSuddenEventInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getInstitutionName())) {
            queryWrapper.eq(InsSuddenEventInfo::getInstitutionName, insSuddenEventInfo.getInstitutionName());
        }
        if (insSuddenEventInfo.getCheckId() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getCheckId, insSuddenEventInfo.getCheckId());
        }
        if (insSuddenEventInfo.getCheckDate() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getCheckDate, insSuddenEventInfo.getCheckDate());
        }
        if (insSuddenEventInfo.getElderId() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getElderId, insSuddenEventInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getElderName())) {
            queryWrapper.eq(InsSuddenEventInfo::getElderName, insSuddenEventInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getIdCard())) {
            queryWrapper.eq(InsSuddenEventInfo::getIdCard, insSuddenEventInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getSex())) {
            queryWrapper.eq(InsSuddenEventInfo::getSex, insSuddenEventInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getEventType())) {
            queryWrapper.eq(InsSuddenEventInfo::getEventType, insSuddenEventInfo.getEventType());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getPlanMemo())) {
            queryWrapper.eq(InsSuddenEventInfo::getPlanMemo, insSuddenEventInfo.getPlanMemo());
        }
        if (insSuddenEventInfo.getEventTime() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getEventTime, insSuddenEventInfo.getEventTime());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getEventPlace())) {
            queryWrapper.eq(InsSuddenEventInfo::getEventPlace, insSuddenEventInfo.getEventPlace());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getEventProcess())) {
            queryWrapper.eq(InsSuddenEventInfo::getEventProcess, insSuddenEventInfo.getEventProcess());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getSeverityType())) {
            queryWrapper.eq(InsSuddenEventInfo::getSeverityType, insSuddenEventInfo.getSeverityType());
        }
        if (insSuddenEventInfo.getHandleState() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getHandleState, insSuddenEventInfo.getHandleState());
        }
        if (insSuddenEventInfo.getStaffId() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getStaffId, insSuddenEventInfo.getStaffId());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getStaffName())) {
            queryWrapper.eq(InsSuddenEventInfo::getStaffName, insSuddenEventInfo.getStaffName());
        }
        if (insSuddenEventInfo.getHandleTime() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getHandleTime, insSuddenEventInfo.getHandleTime());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getHandleResults())) {
            queryWrapper.eq(InsSuddenEventInfo::getHandleResults, insSuddenEventInfo.getHandleResults());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getDiscussionOpinions())) {
            queryWrapper.eq(InsSuddenEventInfo::getDiscussionOpinions, insSuddenEventInfo.getDiscussionOpinions());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getEventImgPath())) {
            queryWrapper.eq(InsSuddenEventInfo::getEventImgPath, insSuddenEventInfo.getEventImgPath());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getRemark())) {
            queryWrapper.eq(InsSuddenEventInfo::getRemark, insSuddenEventInfo.getRemark());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getAreaCode())) {
            queryWrapper.eq(InsSuddenEventInfo::getAreaCode, insSuddenEventInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getAreaName())) {
            queryWrapper.eq(InsSuddenEventInfo::getAreaName, insSuddenEventInfo.getAreaName());
        }
        if (insSuddenEventInfo.getCreateUser() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getCreateUser, insSuddenEventInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSuddenEventInfo.getCreateName())) {
            queryWrapper.eq(InsSuddenEventInfo::getCreateName, insSuddenEventInfo.getCreateName());
        }
        if (insSuddenEventInfo.getCreateDept() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getCreateDept, insSuddenEventInfo.getCreateDept());
        }
        if (insSuddenEventInfo.getCreateTime() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getCreateTime, insSuddenEventInfo.getCreateTime());
        }
        if (insSuddenEventInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getUpdateUser, insSuddenEventInfo.getUpdateUser());
        }
        if (insSuddenEventInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getUpdateTime, insSuddenEventInfo.getUpdateTime());
        }
        if (insSuddenEventInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getIsDeleted, insSuddenEventInfo.getIsDeleted());
        }
        if (insSuddenEventInfo.getStatus() != null) {
            queryWrapper.eq(InsSuddenEventInfo::getStatus, insSuddenEventInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSuddenEventInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenEventInfo insert(InsSuddenEventInfo insSuddenEventInfo) {
        insSuddenEventInfo.setId(null);
        getBaseMapper().insert(insSuddenEventInfo);
        return insSuddenEventInfo;
    }

    /**
    * 更新数据
    *
    * @param insSuddenEventInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenEventInfo update(InsSuddenEventInfo insSuddenEventInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSuddenEventInfo> chainWrapper = new LambdaUpdateChainWrapper<InsSuddenEventInfo>(getBaseMapper());
        if (insSuddenEventInfo.getId() != null) {
            chainWrapper.set(InsSuddenEventInfo::getId, insSuddenEventInfo.getId());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getTenantId())) {
            chainWrapper.set(InsSuddenEventInfo::getTenantId, insSuddenEventInfo.getTenantId());
        }
        if (insSuddenEventInfo.getCorpId() != null) {
            chainWrapper.set(InsSuddenEventInfo::getCorpId, insSuddenEventInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getCorpName())) {
            chainWrapper.set(InsSuddenEventInfo::getCorpName, insSuddenEventInfo.getCorpName());
        }
        if (insSuddenEventInfo.getInstitutionId() != null) {
            chainWrapper.set(InsSuddenEventInfo::getInstitutionId, insSuddenEventInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getInstitutionName())) {
            chainWrapper.set(InsSuddenEventInfo::getInstitutionName, insSuddenEventInfo.getInstitutionName());
        }
        if (insSuddenEventInfo.getCheckId() != null) {
            chainWrapper.set(InsSuddenEventInfo::getCheckId, insSuddenEventInfo.getCheckId());
        }
        if (insSuddenEventInfo.getCheckDate() != null) {
            chainWrapper.set(InsSuddenEventInfo::getCheckDate, insSuddenEventInfo.getCheckDate());
        }
        if (insSuddenEventInfo.getElderId() != null) {
            chainWrapper.set(InsSuddenEventInfo::getElderId, insSuddenEventInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getElderName())) {
            chainWrapper.set(InsSuddenEventInfo::getElderName, insSuddenEventInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getIdCard())) {
            chainWrapper.set(InsSuddenEventInfo::getIdCard, insSuddenEventInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getSex())) {
            chainWrapper.set(InsSuddenEventInfo::getSex, insSuddenEventInfo.getSex());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getEventType())) {
            chainWrapper.set(InsSuddenEventInfo::getEventType, insSuddenEventInfo.getEventType());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getPlanMemo())) {
            chainWrapper.set(InsSuddenEventInfo::getPlanMemo, insSuddenEventInfo.getPlanMemo());
        }
        if (insSuddenEventInfo.getEventTime() != null) {
            chainWrapper.set(InsSuddenEventInfo::getEventTime, insSuddenEventInfo.getEventTime());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getEventPlace())) {
            chainWrapper.set(InsSuddenEventInfo::getEventPlace, insSuddenEventInfo.getEventPlace());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getEventProcess())) {
            chainWrapper.set(InsSuddenEventInfo::getEventProcess, insSuddenEventInfo.getEventProcess());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getSeverityType())) {
            chainWrapper.set(InsSuddenEventInfo::getSeverityType, insSuddenEventInfo.getSeverityType());
        }
        if (insSuddenEventInfo.getHandleState() != null) {
            chainWrapper.set(InsSuddenEventInfo::getHandleState, insSuddenEventInfo.getHandleState());
        }
        if (insSuddenEventInfo.getStaffId() != null) {
            chainWrapper.set(InsSuddenEventInfo::getStaffId, insSuddenEventInfo.getStaffId());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getStaffName())) {
            chainWrapper.set(InsSuddenEventInfo::getStaffName, insSuddenEventInfo.getStaffName());
        }
        if (insSuddenEventInfo.getHandleTime() != null) {
            chainWrapper.set(InsSuddenEventInfo::getHandleTime, insSuddenEventInfo.getHandleTime());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getHandleResults())) {
            chainWrapper.set(InsSuddenEventInfo::getHandleResults, insSuddenEventInfo.getHandleResults());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getDiscussionOpinions())) {
            chainWrapper.set(InsSuddenEventInfo::getDiscussionOpinions, insSuddenEventInfo.getDiscussionOpinions());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getEventImgPath())) {
            chainWrapper.set(InsSuddenEventInfo::getEventImgPath, insSuddenEventInfo.getEventImgPath());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getRemark())) {
            chainWrapper.set(InsSuddenEventInfo::getRemark, insSuddenEventInfo.getRemark());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getAreaCode())) {
            chainWrapper.set(InsSuddenEventInfo::getAreaCode, insSuddenEventInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getAreaName())) {
            chainWrapper.set(InsSuddenEventInfo::getAreaName, insSuddenEventInfo.getAreaName());
        }
        if (insSuddenEventInfo.getCreateUser() != null) {
            chainWrapper.set(InsSuddenEventInfo::getCreateUser, insSuddenEventInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSuddenEventInfo.getCreateName())) {
            chainWrapper.set(InsSuddenEventInfo::getCreateName, insSuddenEventInfo.getCreateName());
        }
        if (insSuddenEventInfo.getCreateDept() != null) {
            chainWrapper.set(InsSuddenEventInfo::getCreateDept, insSuddenEventInfo.getCreateDept());
        }
        if (insSuddenEventInfo.getCreateTime() != null) {
            chainWrapper.set(InsSuddenEventInfo::getCreateTime, insSuddenEventInfo.getCreateTime());
        }
        if (insSuddenEventInfo.getUpdateUser() != null) {
            chainWrapper.set(InsSuddenEventInfo::getUpdateUser, insSuddenEventInfo.getUpdateUser());
        }
        if (insSuddenEventInfo.getUpdateTime() != null) {
            chainWrapper.set(InsSuddenEventInfo::getUpdateTime, insSuddenEventInfo.getUpdateTime());
        }
        if (insSuddenEventInfo.getIsDeleted() != null) {
            chainWrapper.set(InsSuddenEventInfo::getIsDeleted, insSuddenEventInfo.getIsDeleted());
        }
        if (insSuddenEventInfo.getStatus() != null) {
            chainWrapper.set(InsSuddenEventInfo::getStatus, insSuddenEventInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSuddenEventInfo::getId, insSuddenEventInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSuddenEventInfo.getId());
        } else {
            return insSuddenEventInfo;
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
    public boolean saveInsSuddenEventInfoBatch(List<InsSuddenEventInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSuddenEventInfo insSuddenEventInfo : insertList) {
            //使用默认的雪花算法生成
            insSuddenEventInfo.setId(null);
            //insSuddenEventInfo.setCreatedDt(currentDte);
            //insSuddenEventInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsSuddenEventInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSuddenEventInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


