package cn.pluss.platform.service.insActivityInfo.impl;

import cn.pluss.platform.mapper.InsActivityInfoMapper;
import cn.pluss.platform.model.entity.InsActivityInfo;
import cn.pluss.platform.service.insActivityInfo.InsActivityInfoService;
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
@Service("insActivityInfoService")
public class InsActivityInfoServiceImpl extends ServiceImpl< InsActivityInfoMapper, InsActivityInfo> implements InsActivityInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsActivityInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsActivityInfo> queryPage(Map map) {
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
    public InsActivityInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insActivityInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsActivityInfo queryOne(InsActivityInfo insActivityInfo){
        LambdaQueryWrapper<InsActivityInfo> queryWrapper = getQueryWrapper(insActivityInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insActivityInfo
    * @return
    */
    @Override
    public List<InsActivityInfo> queryList(InsActivityInfo insActivityInfo) {
        LambdaQueryWrapper<InsActivityInfo> queryWrapper = getQueryWrapper(insActivityInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insActivityInfo
    * @return
    */
    public static LambdaQueryWrapper<InsActivityInfo> getQueryWrapper(InsActivityInfo insActivityInfo){
        LambdaQueryWrapper<InsActivityInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insActivityInfo.getId() != null) {
            queryWrapper.eq(InsActivityInfo::getId, insActivityInfo.getId());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getTenantId())) {
            queryWrapper.eq(InsActivityInfo::getTenantId, insActivityInfo.getTenantId());
        }
        if (insActivityInfo.getCorpId() != null) {
            queryWrapper.eq(InsActivityInfo::getCorpId, insActivityInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getCorpName())) {
            queryWrapper.eq(InsActivityInfo::getCorpName, insActivityInfo.getCorpName());
        }
        if (insActivityInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsActivityInfo::getInstitutionId, insActivityInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getInstitutionName())) {
            queryWrapper.eq(InsActivityInfo::getInstitutionName, insActivityInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getActivityCode())) {
            queryWrapper.eq(InsActivityInfo::getActivityCode, insActivityInfo.getActivityCode());
        }
        if (insActivityInfo.getTypeId() != null) {
            queryWrapper.eq(InsActivityInfo::getTypeId, insActivityInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getTypeName())) {
            queryWrapper.eq(InsActivityInfo::getTypeName, insActivityInfo.getTypeName());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getActivityName())) {
            queryWrapper.eq(InsActivityInfo::getActivityName, insActivityInfo.getActivityName());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getActivityPic())) {
            queryWrapper.eq(InsActivityInfo::getActivityPic, insActivityInfo.getActivityPic());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getActivityContent())) {
            queryWrapper.eq(InsActivityInfo::getActivityContent, insActivityInfo.getActivityContent());
        }
        if (insActivityInfo.getActivityState() != null) {
            queryWrapper.eq(InsActivityInfo::getActivityState, insActivityInfo.getActivityState());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getManager())) {
            queryWrapper.eq(InsActivityInfo::getManager, insActivityInfo.getManager());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getLinkTel())) {
            queryWrapper.eq(InsActivityInfo::getLinkTel, insActivityInfo.getLinkTel());
        }
        if (insActivityInfo.getElderNum() != null) {
            queryWrapper.eq(InsActivityInfo::getElderNum, insActivityInfo.getElderNum());
        }
        if (insActivityInfo.getActivityDate() != null) {
            queryWrapper.eq(InsActivityInfo::getActivityDate, insActivityInfo.getActivityDate());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getStartActivityTime())) {
            queryWrapper.eq(InsActivityInfo::getStartActivityTime, insActivityInfo.getStartActivityTime());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getEndActivityTime())) {
            queryWrapper.eq(InsActivityInfo::getEndActivityTime, insActivityInfo.getEndActivityTime());
        }
        if (insActivityInfo.getSignType() != null) {
            queryWrapper.eq(InsActivityInfo::getSignType, insActivityInfo.getSignType());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getActivityAddress())) {
            queryWrapper.eq(InsActivityInfo::getActivityAddress, insActivityInfo.getActivityAddress());
        }
        if (insActivityInfo.getRoomId() != null) {
            queryWrapper.eq(InsActivityInfo::getRoomId, insActivityInfo.getRoomId());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getPointPeople())) {
            queryWrapper.eq(InsActivityInfo::getPointPeople, insActivityInfo.getPointPeople());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getPoint())) {
            queryWrapper.eq(InsActivityInfo::getPoint, insActivityInfo.getPoint());
        }
        if (insActivityInfo.getBonusIntegral() != null) {
            queryWrapper.eq(InsActivityInfo::getBonusIntegral, insActivityInfo.getBonusIntegral());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getResolveName())) {
            queryWrapper.eq(InsActivityInfo::getResolveName, insActivityInfo.getResolveName());
        }
        if (insActivityInfo.getAuditState() != null) {
            queryWrapper.eq(InsActivityInfo::getAuditState, insActivityInfo.getAuditState());
        }
        if (insActivityInfo.getAuditId() != null) {
            queryWrapper.eq(InsActivityInfo::getAuditId, insActivityInfo.getAuditId());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getAuditName())) {
            queryWrapper.eq(InsActivityInfo::getAuditName, insActivityInfo.getAuditName());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getAuditMemo())) {
            queryWrapper.eq(InsActivityInfo::getAuditMemo, insActivityInfo.getAuditMemo());
        }
        if (insActivityInfo.getAuditTime() != null) {
            queryWrapper.eq(InsActivityInfo::getAuditTime, insActivityInfo.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getCancelReason())) {
            queryWrapper.eq(InsActivityInfo::getCancelReason, insActivityInfo.getCancelReason());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getActivityPics())) {
            queryWrapper.eq(InsActivityInfo::getActivityPics, insActivityInfo.getActivityPics());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getActivitySummary())) {
            queryWrapper.eq(InsActivityInfo::getActivitySummary, insActivityInfo.getActivitySummary());
        }
        if (insActivityInfo.getEntryNum() != null) {
            queryWrapper.eq(InsActivityInfo::getEntryNum, insActivityInfo.getEntryNum());
        }
        if (insActivityInfo.getSignNum() != null) {
            queryWrapper.eq(InsActivityInfo::getSignNum, insActivityInfo.getSignNum());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getRemark())) {
            queryWrapper.eq(InsActivityInfo::getRemark, insActivityInfo.getRemark());
        }
        if (insActivityInfo.getCreateUser() != null) {
            queryWrapper.eq(InsActivityInfo::getCreateUser, insActivityInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insActivityInfo.getCreateName())) {
            queryWrapper.eq(InsActivityInfo::getCreateName, insActivityInfo.getCreateName());
        }
        if (insActivityInfo.getCreateDept() != null) {
            queryWrapper.eq(InsActivityInfo::getCreateDept, insActivityInfo.getCreateDept());
        }
        if (insActivityInfo.getCreateTime() != null) {
            queryWrapper.eq(InsActivityInfo::getCreateTime, insActivityInfo.getCreateTime());
        }
        if (insActivityInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsActivityInfo::getUpdateUser, insActivityInfo.getUpdateUser());
        }
        if (insActivityInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsActivityInfo::getUpdateTime, insActivityInfo.getUpdateTime());
        }
        if (insActivityInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsActivityInfo::getIsDeleted, insActivityInfo.getIsDeleted());
        }
        if (insActivityInfo.getStatus() != null) {
            queryWrapper.eq(InsActivityInfo::getStatus, insActivityInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insActivityInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityInfo insert(InsActivityInfo insActivityInfo) {
        insActivityInfo.setId(null);
        getBaseMapper().insert(insActivityInfo);
        return insActivityInfo;
    }

    /**
    * 更新数据
    *
    * @param insActivityInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityInfo update(InsActivityInfo insActivityInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsActivityInfo> chainWrapper = new LambdaUpdateChainWrapper<InsActivityInfo>(getBaseMapper());
        if (insActivityInfo.getId() != null) {
            chainWrapper.set(InsActivityInfo::getId, insActivityInfo.getId());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getTenantId())) {
            chainWrapper.set(InsActivityInfo::getTenantId, insActivityInfo.getTenantId());
        }
        if (insActivityInfo.getCorpId() != null) {
            chainWrapper.set(InsActivityInfo::getCorpId, insActivityInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getCorpName())) {
            chainWrapper.set(InsActivityInfo::getCorpName, insActivityInfo.getCorpName());
        }
        if (insActivityInfo.getInstitutionId() != null) {
            chainWrapper.set(InsActivityInfo::getInstitutionId, insActivityInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getInstitutionName())) {
            chainWrapper.set(InsActivityInfo::getInstitutionName, insActivityInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getActivityCode())) {
            chainWrapper.set(InsActivityInfo::getActivityCode, insActivityInfo.getActivityCode());
        }
        if (insActivityInfo.getTypeId() != null) {
            chainWrapper.set(InsActivityInfo::getTypeId, insActivityInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getTypeName())) {
            chainWrapper.set(InsActivityInfo::getTypeName, insActivityInfo.getTypeName());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getActivityName())) {
            chainWrapper.set(InsActivityInfo::getActivityName, insActivityInfo.getActivityName());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getActivityPic())) {
            chainWrapper.set(InsActivityInfo::getActivityPic, insActivityInfo.getActivityPic());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getActivityContent())) {
            chainWrapper.set(InsActivityInfo::getActivityContent, insActivityInfo.getActivityContent());
        }
        if (insActivityInfo.getActivityState() != null) {
            chainWrapper.set(InsActivityInfo::getActivityState, insActivityInfo.getActivityState());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getManager())) {
            chainWrapper.set(InsActivityInfo::getManager, insActivityInfo.getManager());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getLinkTel())) {
            chainWrapper.set(InsActivityInfo::getLinkTel, insActivityInfo.getLinkTel());
        }
        if (insActivityInfo.getElderNum() != null) {
            chainWrapper.set(InsActivityInfo::getElderNum, insActivityInfo.getElderNum());
        }
        if (insActivityInfo.getActivityDate() != null) {
            chainWrapper.set(InsActivityInfo::getActivityDate, insActivityInfo.getActivityDate());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getStartActivityTime())) {
            chainWrapper.set(InsActivityInfo::getStartActivityTime, insActivityInfo.getStartActivityTime());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getEndActivityTime())) {
            chainWrapper.set(InsActivityInfo::getEndActivityTime, insActivityInfo.getEndActivityTime());
        }
        if (insActivityInfo.getSignType() != null) {
            chainWrapper.set(InsActivityInfo::getSignType, insActivityInfo.getSignType());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getActivityAddress())) {
            chainWrapper.set(InsActivityInfo::getActivityAddress, insActivityInfo.getActivityAddress());
        }
        if (insActivityInfo.getRoomId() != null) {
            chainWrapper.set(InsActivityInfo::getRoomId, insActivityInfo.getRoomId());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getPointPeople())) {
            chainWrapper.set(InsActivityInfo::getPointPeople, insActivityInfo.getPointPeople());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getPoint())) {
            chainWrapper.set(InsActivityInfo::getPoint, insActivityInfo.getPoint());
        }
        if (insActivityInfo.getBonusIntegral() != null) {
            chainWrapper.set(InsActivityInfo::getBonusIntegral, insActivityInfo.getBonusIntegral());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getResolveName())) {
            chainWrapper.set(InsActivityInfo::getResolveName, insActivityInfo.getResolveName());
        }
        if (insActivityInfo.getAuditState() != null) {
            chainWrapper.set(InsActivityInfo::getAuditState, insActivityInfo.getAuditState());
        }
        if (insActivityInfo.getAuditId() != null) {
            chainWrapper.set(InsActivityInfo::getAuditId, insActivityInfo.getAuditId());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getAuditName())) {
            chainWrapper.set(InsActivityInfo::getAuditName, insActivityInfo.getAuditName());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getAuditMemo())) {
            chainWrapper.set(InsActivityInfo::getAuditMemo, insActivityInfo.getAuditMemo());
        }
        if (insActivityInfo.getAuditTime() != null) {
            chainWrapper.set(InsActivityInfo::getAuditTime, insActivityInfo.getAuditTime());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getCancelReason())) {
            chainWrapper.set(InsActivityInfo::getCancelReason, insActivityInfo.getCancelReason());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getActivityPics())) {
            chainWrapper.set(InsActivityInfo::getActivityPics, insActivityInfo.getActivityPics());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getActivitySummary())) {
            chainWrapper.set(InsActivityInfo::getActivitySummary, insActivityInfo.getActivitySummary());
        }
        if (insActivityInfo.getEntryNum() != null) {
            chainWrapper.set(InsActivityInfo::getEntryNum, insActivityInfo.getEntryNum());
        }
        if (insActivityInfo.getSignNum() != null) {
            chainWrapper.set(InsActivityInfo::getSignNum, insActivityInfo.getSignNum());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getRemark())) {
            chainWrapper.set(InsActivityInfo::getRemark, insActivityInfo.getRemark());
        }
        if (insActivityInfo.getCreateUser() != null) {
            chainWrapper.set(InsActivityInfo::getCreateUser, insActivityInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insActivityInfo.getCreateName())) {
            chainWrapper.set(InsActivityInfo::getCreateName, insActivityInfo.getCreateName());
        }
        if (insActivityInfo.getCreateDept() != null) {
            chainWrapper.set(InsActivityInfo::getCreateDept, insActivityInfo.getCreateDept());
        }
        if (insActivityInfo.getCreateTime() != null) {
            chainWrapper.set(InsActivityInfo::getCreateTime, insActivityInfo.getCreateTime());
        }
        if (insActivityInfo.getUpdateUser() != null) {
            chainWrapper.set(InsActivityInfo::getUpdateUser, insActivityInfo.getUpdateUser());
        }
        if (insActivityInfo.getUpdateTime() != null) {
            chainWrapper.set(InsActivityInfo::getUpdateTime, insActivityInfo.getUpdateTime());
        }
        if (insActivityInfo.getIsDeleted() != null) {
            chainWrapper.set(InsActivityInfo::getIsDeleted, insActivityInfo.getIsDeleted());
        }
        if (insActivityInfo.getStatus() != null) {
            chainWrapper.set(InsActivityInfo::getStatus, insActivityInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsActivityInfo::getId, insActivityInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insActivityInfo.getId());
        } else {
            return insActivityInfo;
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
    public boolean saveInsActivityInfoBatch(List<InsActivityInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsActivityInfo insActivityInfo : insertList) {
            //使用默认的雪花算法生成
            insActivityInfo.setId(null);
            //insActivityInfo.setCreatedDt(currentDte);
            //insActivityInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsActivityInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsActivityInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


