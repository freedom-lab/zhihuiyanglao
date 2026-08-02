package cn.pluss.platform.service.memberConsumeLog.impl;

import cn.pluss.platform.mapper.MemberConsumeLogMapper;
import cn.pluss.platform.model.entity.MemberConsumeLog;
import cn.pluss.platform.service.memberConsumeLog.MemberConsumeLogService;
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
@Service("memberConsumeLogService")
public class MemberConsumeLogServiceImpl extends ServiceImpl< MemberConsumeLogMapper, MemberConsumeLog> implements MemberConsumeLogService {
    private static final Logger logger = LoggerFactory.getLogger(MemberConsumeLogServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MemberConsumeLog> queryPage(Map map) {
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
    public MemberConsumeLog queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param memberConsumeLog 实例对象
    * @return 实例对象
    */
    @Override
    public MemberConsumeLog queryOne(MemberConsumeLog memberConsumeLog){
        LambdaQueryWrapper<MemberConsumeLog> queryWrapper = getQueryWrapper(memberConsumeLog);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param memberConsumeLog
    * @return
    */
    @Override
    public List<MemberConsumeLog> queryList(MemberConsumeLog memberConsumeLog) {
        LambdaQueryWrapper<MemberConsumeLog> queryWrapper = getQueryWrapper(memberConsumeLog);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param memberConsumeLog
    * @return
    */
    public static LambdaQueryWrapper<MemberConsumeLog> getQueryWrapper(MemberConsumeLog memberConsumeLog){
        LambdaQueryWrapper<MemberConsumeLog> queryWrapper = new LambdaQueryWrapper<>();
        if (memberConsumeLog.getId() != null) {
            queryWrapper.eq(MemberConsumeLog::getId, memberConsumeLog.getId());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getTenantId())) {
            queryWrapper.eq(MemberConsumeLog::getTenantId, memberConsumeLog.getTenantId());
        }
        if (memberConsumeLog.getCorpId() != null) {
            queryWrapper.eq(MemberConsumeLog::getCorpId, memberConsumeLog.getCorpId());
        }
        if (memberConsumeLog.getInstitutionId() != null) {
            queryWrapper.eq(MemberConsumeLog::getInstitutionId, memberConsumeLog.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getInstitutionName())) {
            queryWrapper.eq(MemberConsumeLog::getInstitutionName, memberConsumeLog.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getSerialNumber())) {
            queryWrapper.eq(MemberConsumeLog::getSerialNumber, memberConsumeLog.getSerialNumber());
        }
        if (memberConsumeLog.getElderId() != null) {
            queryWrapper.eq(MemberConsumeLog::getElderId, memberConsumeLog.getElderId());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getElderName())) {
            queryWrapper.eq(MemberConsumeLog::getElderName, memberConsumeLog.getElderName());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getSex())) {
            queryWrapper.eq(MemberConsumeLog::getSex, memberConsumeLog.getSex());
        }
        if (memberConsumeLog.getAge() != null) {
            queryWrapper.eq(MemberConsumeLog::getAge, memberConsumeLog.getAge());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getIdCard())) {
            queryWrapper.eq(MemberConsumeLog::getIdCard, memberConsumeLog.getIdCard());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getLinkTel())) {
            queryWrapper.eq(MemberConsumeLog::getLinkTel, memberConsumeLog.getLinkTel());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getMemberCard())) {
            queryWrapper.eq(MemberConsumeLog::getMemberCard, memberConsumeLog.getMemberCard());
        }
        if (memberConsumeLog.getMemberLevel() != null) {
            queryWrapper.eq(MemberConsumeLog::getMemberLevel, memberConsumeLog.getMemberLevel());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getConsumeName())) {
            queryWrapper.eq(MemberConsumeLog::getConsumeName, memberConsumeLog.getConsumeName());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getConsumeType())) {
            queryWrapper.eq(MemberConsumeLog::getConsumeType, memberConsumeLog.getConsumeType());
        }
        if (memberConsumeLog.getConsumeAmount() != null) {
            queryWrapper.eq(MemberConsumeLog::getConsumeAmount, memberConsumeLog.getConsumeAmount());
        }
        if (memberConsumeLog.getIntegral() != null) {
            queryWrapper.eq(MemberConsumeLog::getIntegral, memberConsumeLog.getIntegral());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getPayType())) {
            queryWrapper.eq(MemberConsumeLog::getPayType, memberConsumeLog.getPayType());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getPayState())) {
            queryWrapper.eq(MemberConsumeLog::getPayState, memberConsumeLog.getPayState());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getConsumeState())) {
            queryWrapper.eq(MemberConsumeLog::getConsumeState, memberConsumeLog.getConsumeState());
        }
        if (memberConsumeLog.getConsumeTime() != null) {
            queryWrapper.eq(MemberConsumeLog::getConsumeTime, memberConsumeLog.getConsumeTime());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getCreateName())) {
            queryWrapper.eq(MemberConsumeLog::getCreateName, memberConsumeLog.getCreateName());
        }
        if (memberConsumeLog.getAreaCode() != null) {
            queryWrapper.eq(MemberConsumeLog::getAreaCode, memberConsumeLog.getAreaCode());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getAreaName())) {
            queryWrapper.eq(MemberConsumeLog::getAreaName, memberConsumeLog.getAreaName());
        }
        if (StringUtil.isNotEmpty(memberConsumeLog.getRemark())) {
            queryWrapper.eq(MemberConsumeLog::getRemark, memberConsumeLog.getRemark());
        }
        if (memberConsumeLog.getCreateUser() != null) {
            queryWrapper.eq(MemberConsumeLog::getCreateUser, memberConsumeLog.getCreateUser());
        }
        if (memberConsumeLog.getCreateDept() != null) {
            queryWrapper.eq(MemberConsumeLog::getCreateDept, memberConsumeLog.getCreateDept());
        }
        if (memberConsumeLog.getCreateTime() != null) {
            queryWrapper.eq(MemberConsumeLog::getCreateTime, memberConsumeLog.getCreateTime());
        }
        if (memberConsumeLog.getUpdateUser() != null) {
            queryWrapper.eq(MemberConsumeLog::getUpdateUser, memberConsumeLog.getUpdateUser());
        }
        if (memberConsumeLog.getUpdateTime() != null) {
            queryWrapper.eq(MemberConsumeLog::getUpdateTime, memberConsumeLog.getUpdateTime());
        }
        if (memberConsumeLog.getStatus() != null) {
            queryWrapper.eq(MemberConsumeLog::getStatus, memberConsumeLog.getStatus());
        }
        if (memberConsumeLog.getIsDeleted() != null) {
            queryWrapper.eq(MemberConsumeLog::getIsDeleted, memberConsumeLog.getIsDeleted());
        }
        if (memberConsumeLog.getDataSource() != null) {
            queryWrapper.eq(MemberConsumeLog::getDataSource, memberConsumeLog.getDataSource());
        }
        if (memberConsumeLog.getIsReadly() != null) {
            queryWrapper.eq(MemberConsumeLog::getIsReadly, memberConsumeLog.getIsReadly());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param memberConsumeLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MemberConsumeLog insert(MemberConsumeLog memberConsumeLog) {
        memberConsumeLog.setId(null);
        getBaseMapper().insert(memberConsumeLog);
        return memberConsumeLog;
    }

    /**
    * 更新数据
    *
    * @param memberConsumeLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MemberConsumeLog update(MemberConsumeLog memberConsumeLog) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MemberConsumeLog> chainWrapper = new LambdaUpdateChainWrapper<MemberConsumeLog>(getBaseMapper());
        if (memberConsumeLog.getId() != null) {
            chainWrapper.set(MemberConsumeLog::getId, memberConsumeLog.getId());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getTenantId())) {
            chainWrapper.set(MemberConsumeLog::getTenantId, memberConsumeLog.getTenantId());
        }
        if (memberConsumeLog.getCorpId() != null) {
            chainWrapper.set(MemberConsumeLog::getCorpId, memberConsumeLog.getCorpId());
        }
        if (memberConsumeLog.getInstitutionId() != null) {
            chainWrapper.set(MemberConsumeLog::getInstitutionId, memberConsumeLog.getInstitutionId());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getInstitutionName())) {
            chainWrapper.set(MemberConsumeLog::getInstitutionName, memberConsumeLog.getInstitutionName());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getSerialNumber())) {
            chainWrapper.set(MemberConsumeLog::getSerialNumber, memberConsumeLog.getSerialNumber());
        }
        if (memberConsumeLog.getElderId() != null) {
            chainWrapper.set(MemberConsumeLog::getElderId, memberConsumeLog.getElderId());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getElderName())) {
            chainWrapper.set(MemberConsumeLog::getElderName, memberConsumeLog.getElderName());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getSex())) {
            chainWrapper.set(MemberConsumeLog::getSex, memberConsumeLog.getSex());
        }
        if (memberConsumeLog.getAge() != null) {
            chainWrapper.set(MemberConsumeLog::getAge, memberConsumeLog.getAge());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getIdCard())) {
            chainWrapper.set(MemberConsumeLog::getIdCard, memberConsumeLog.getIdCard());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getLinkTel())) {
            chainWrapper.set(MemberConsumeLog::getLinkTel, memberConsumeLog.getLinkTel());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getMemberCard())) {
            chainWrapper.set(MemberConsumeLog::getMemberCard, memberConsumeLog.getMemberCard());
        }
        if (memberConsumeLog.getMemberLevel() != null) {
            chainWrapper.set(MemberConsumeLog::getMemberLevel, memberConsumeLog.getMemberLevel());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getConsumeName())) {
            chainWrapper.set(MemberConsumeLog::getConsumeName, memberConsumeLog.getConsumeName());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getConsumeType())) {
            chainWrapper.set(MemberConsumeLog::getConsumeType, memberConsumeLog.getConsumeType());
        }
        if (memberConsumeLog.getConsumeAmount() != null) {
            chainWrapper.set(MemberConsumeLog::getConsumeAmount, memberConsumeLog.getConsumeAmount());
        }
        if (memberConsumeLog.getIntegral() != null) {
            chainWrapper.set(MemberConsumeLog::getIntegral, memberConsumeLog.getIntegral());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getPayType())) {
            chainWrapper.set(MemberConsumeLog::getPayType, memberConsumeLog.getPayType());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getPayState())) {
            chainWrapper.set(MemberConsumeLog::getPayState, memberConsumeLog.getPayState());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getConsumeState())) {
            chainWrapper.set(MemberConsumeLog::getConsumeState, memberConsumeLog.getConsumeState());
        }
        if (memberConsumeLog.getConsumeTime() != null) {
            chainWrapper.set(MemberConsumeLog::getConsumeTime, memberConsumeLog.getConsumeTime());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getCreateName())) {
            chainWrapper.set(MemberConsumeLog::getCreateName, memberConsumeLog.getCreateName());
        }
        if (memberConsumeLog.getAreaCode() != null) {
            chainWrapper.set(MemberConsumeLog::getAreaCode, memberConsumeLog.getAreaCode());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getAreaName())) {
            chainWrapper.set(MemberConsumeLog::getAreaName, memberConsumeLog.getAreaName());
        }
        if (StringUtil.isNotBlank(memberConsumeLog.getRemark())) {
            chainWrapper.set(MemberConsumeLog::getRemark, memberConsumeLog.getRemark());
        }
        if (memberConsumeLog.getCreateUser() != null) {
            chainWrapper.set(MemberConsumeLog::getCreateUser, memberConsumeLog.getCreateUser());
        }
        if (memberConsumeLog.getCreateDept() != null) {
            chainWrapper.set(MemberConsumeLog::getCreateDept, memberConsumeLog.getCreateDept());
        }
        if (memberConsumeLog.getCreateTime() != null) {
            chainWrapper.set(MemberConsumeLog::getCreateTime, memberConsumeLog.getCreateTime());
        }
        if (memberConsumeLog.getUpdateUser() != null) {
            chainWrapper.set(MemberConsumeLog::getUpdateUser, memberConsumeLog.getUpdateUser());
        }
        if (memberConsumeLog.getUpdateTime() != null) {
            chainWrapper.set(MemberConsumeLog::getUpdateTime, memberConsumeLog.getUpdateTime());
        }
        if (memberConsumeLog.getStatus() != null) {
            chainWrapper.set(MemberConsumeLog::getStatus, memberConsumeLog.getStatus());
        }
        if (memberConsumeLog.getIsDeleted() != null) {
            chainWrapper.set(MemberConsumeLog::getIsDeleted, memberConsumeLog.getIsDeleted());
        }
        if (memberConsumeLog.getDataSource() != null) {
            chainWrapper.set(MemberConsumeLog::getDataSource, memberConsumeLog.getDataSource());
        }
        if (memberConsumeLog.getIsReadly() != null) {
            chainWrapper.set(MemberConsumeLog::getIsReadly, memberConsumeLog.getIsReadly());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MemberConsumeLog::getId, memberConsumeLog.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(memberConsumeLog.getId());
        } else {
            return memberConsumeLog;
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
    public boolean saveMemberConsumeLogBatch(List<MemberConsumeLog> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MemberConsumeLog memberConsumeLog : insertList) {
            //使用默认的雪花算法生成
            memberConsumeLog.setId(null);
            //memberConsumeLog.setCreatedDt(currentDte);
            //memberConsumeLog.setUpdatedDt(currentDte);
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
    public Integer deleteMemberConsumeLogBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MemberConsumeLog> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


