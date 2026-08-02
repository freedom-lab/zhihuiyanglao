package cn.pluss.platform.service.memberChargeLog.impl;

import cn.pluss.platform.mapper.MemberChargeLogMapper;
import cn.pluss.platform.model.entity.MemberChargeLog;
import cn.pluss.platform.service.memberChargeLog.MemberChargeLogService;
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
@Service("memberChargeLogService")
public class MemberChargeLogServiceImpl extends ServiceImpl< MemberChargeLogMapper, MemberChargeLog> implements MemberChargeLogService {
    private static final Logger logger = LoggerFactory.getLogger(MemberChargeLogServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MemberChargeLog> queryPage(Map map) {
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
    public MemberChargeLog queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param memberChargeLog 实例对象
    * @return 实例对象
    */
    @Override
    public MemberChargeLog queryOne(MemberChargeLog memberChargeLog){
        LambdaQueryWrapper<MemberChargeLog> queryWrapper = getQueryWrapper(memberChargeLog);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param memberChargeLog
    * @return
    */
    @Override
    public List<MemberChargeLog> queryList(MemberChargeLog memberChargeLog) {
        LambdaQueryWrapper<MemberChargeLog> queryWrapper = getQueryWrapper(memberChargeLog);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param memberChargeLog
    * @return
    */
    public static LambdaQueryWrapper<MemberChargeLog> getQueryWrapper(MemberChargeLog memberChargeLog){
        LambdaQueryWrapper<MemberChargeLog> queryWrapper = new LambdaQueryWrapper<>();
        if (memberChargeLog.getId() != null) {
            queryWrapper.eq(MemberChargeLog::getId, memberChargeLog.getId());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getTenantId())) {
            queryWrapper.eq(MemberChargeLog::getTenantId, memberChargeLog.getTenantId());
        }
        if (memberChargeLog.getCorpId() != null) {
            queryWrapper.eq(MemberChargeLog::getCorpId, memberChargeLog.getCorpId());
        }
        if (memberChargeLog.getInstitutionId() != null) {
            queryWrapper.eq(MemberChargeLog::getInstitutionId, memberChargeLog.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getInstitutionName())) {
            queryWrapper.eq(MemberChargeLog::getInstitutionName, memberChargeLog.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getSerialNumber())) {
            queryWrapper.eq(MemberChargeLog::getSerialNumber, memberChargeLog.getSerialNumber());
        }
        if (memberChargeLog.getElderId() != null) {
            queryWrapper.eq(MemberChargeLog::getElderId, memberChargeLog.getElderId());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getElderName())) {
            queryWrapper.eq(MemberChargeLog::getElderName, memberChargeLog.getElderName());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getSex())) {
            queryWrapper.eq(MemberChargeLog::getSex, memberChargeLog.getSex());
        }
        if (memberChargeLog.getAge() != null) {
            queryWrapper.eq(MemberChargeLog::getAge, memberChargeLog.getAge());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getIdCard())) {
            queryWrapper.eq(MemberChargeLog::getIdCard, memberChargeLog.getIdCard());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getLinkTel())) {
            queryWrapper.eq(MemberChargeLog::getLinkTel, memberChargeLog.getLinkTel());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getMemberCard())) {
            queryWrapper.eq(MemberChargeLog::getMemberCard, memberChargeLog.getMemberCard());
        }
        if (memberChargeLog.getMemberLevel() != null) {
            queryWrapper.eq(MemberChargeLog::getMemberLevel, memberChargeLog.getMemberLevel());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getChangeType())) {
            queryWrapper.eq(MemberChargeLog::getChangeType, memberChargeLog.getChangeType());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getPayType())) {
            queryWrapper.eq(MemberChargeLog::getPayType, memberChargeLog.getPayType());
        }
        if (memberChargeLog.getLastAmount() != null) {
            queryWrapper.eq(MemberChargeLog::getLastAmount, memberChargeLog.getLastAmount());
        }
        if (memberChargeLog.getChargeAmount() != null) {
            queryWrapper.eq(MemberChargeLog::getChargeAmount, memberChargeLog.getChargeAmount());
        }
        if (memberChargeLog.getGiveAmount() != null) {
            queryWrapper.eq(MemberChargeLog::getGiveAmount, memberChargeLog.getGiveAmount());
        }
        if (memberChargeLog.getNewestAmount() != null) {
            queryWrapper.eq(MemberChargeLog::getNewestAmount, memberChargeLog.getNewestAmount());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getCreateName())) {
            queryWrapper.eq(MemberChargeLog::getCreateName, memberChargeLog.getCreateName());
        }
        if (memberChargeLog.getChargeTime() != null) {
            queryWrapper.eq(MemberChargeLog::getChargeTime, memberChargeLog.getChargeTime());
        }
        if (memberChargeLog.getAreaCode() != null) {
            queryWrapper.eq(MemberChargeLog::getAreaCode, memberChargeLog.getAreaCode());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getAreaName())) {
            queryWrapper.eq(MemberChargeLog::getAreaName, memberChargeLog.getAreaName());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getRemark())) {
            queryWrapper.eq(MemberChargeLog::getRemark, memberChargeLog.getRemark());
        }
        if (memberChargeLog.getCreateUser() != null) {
            queryWrapper.eq(MemberChargeLog::getCreateUser, memberChargeLog.getCreateUser());
        }
        if (memberChargeLog.getCreateDept() != null) {
            queryWrapper.eq(MemberChargeLog::getCreateDept, memberChargeLog.getCreateDept());
        }
        if (memberChargeLog.getCreateTime() != null) {
            queryWrapper.eq(MemberChargeLog::getCreateTime, memberChargeLog.getCreateTime());
        }
        if (memberChargeLog.getUpdateUser() != null) {
            queryWrapper.eq(MemberChargeLog::getUpdateUser, memberChargeLog.getUpdateUser());
        }
        if (memberChargeLog.getUpdateTime() != null) {
            queryWrapper.eq(MemberChargeLog::getUpdateTime, memberChargeLog.getUpdateTime());
        }
        if (memberChargeLog.getStatus() != null) {
            queryWrapper.eq(MemberChargeLog::getStatus, memberChargeLog.getStatus());
        }
        if (memberChargeLog.getIsDeleted() != null) {
            queryWrapper.eq(MemberChargeLog::getIsDeleted, memberChargeLog.getIsDeleted());
        }
        if (StringUtil.isNotEmpty(memberChargeLog.getOutTradeNo())) {
            queryWrapper.eq(MemberChargeLog::getOutTradeNo, memberChargeLog.getOutTradeNo());
        }
        if (memberChargeLog.getDataSource() != null) {
            queryWrapper.eq(MemberChargeLog::getDataSource, memberChargeLog.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param memberChargeLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MemberChargeLog insert(MemberChargeLog memberChargeLog) {
        memberChargeLog.setId(null);
        getBaseMapper().insert(memberChargeLog);
        return memberChargeLog;
    }

    /**
    * 更新数据
    *
    * @param memberChargeLog 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MemberChargeLog update(MemberChargeLog memberChargeLog) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MemberChargeLog> chainWrapper = new LambdaUpdateChainWrapper<MemberChargeLog>(getBaseMapper());
        if (memberChargeLog.getId() != null) {
            chainWrapper.set(MemberChargeLog::getId, memberChargeLog.getId());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getTenantId())) {
            chainWrapper.set(MemberChargeLog::getTenantId, memberChargeLog.getTenantId());
        }
        if (memberChargeLog.getCorpId() != null) {
            chainWrapper.set(MemberChargeLog::getCorpId, memberChargeLog.getCorpId());
        }
        if (memberChargeLog.getInstitutionId() != null) {
            chainWrapper.set(MemberChargeLog::getInstitutionId, memberChargeLog.getInstitutionId());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getInstitutionName())) {
            chainWrapper.set(MemberChargeLog::getInstitutionName, memberChargeLog.getInstitutionName());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getSerialNumber())) {
            chainWrapper.set(MemberChargeLog::getSerialNumber, memberChargeLog.getSerialNumber());
        }
        if (memberChargeLog.getElderId() != null) {
            chainWrapper.set(MemberChargeLog::getElderId, memberChargeLog.getElderId());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getElderName())) {
            chainWrapper.set(MemberChargeLog::getElderName, memberChargeLog.getElderName());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getSex())) {
            chainWrapper.set(MemberChargeLog::getSex, memberChargeLog.getSex());
        }
        if (memberChargeLog.getAge() != null) {
            chainWrapper.set(MemberChargeLog::getAge, memberChargeLog.getAge());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getIdCard())) {
            chainWrapper.set(MemberChargeLog::getIdCard, memberChargeLog.getIdCard());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getLinkTel())) {
            chainWrapper.set(MemberChargeLog::getLinkTel, memberChargeLog.getLinkTel());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getMemberCard())) {
            chainWrapper.set(MemberChargeLog::getMemberCard, memberChargeLog.getMemberCard());
        }
        if (memberChargeLog.getMemberLevel() != null) {
            chainWrapper.set(MemberChargeLog::getMemberLevel, memberChargeLog.getMemberLevel());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getChangeType())) {
            chainWrapper.set(MemberChargeLog::getChangeType, memberChargeLog.getChangeType());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getPayType())) {
            chainWrapper.set(MemberChargeLog::getPayType, memberChargeLog.getPayType());
        }
        if (memberChargeLog.getLastAmount() != null) {
            chainWrapper.set(MemberChargeLog::getLastAmount, memberChargeLog.getLastAmount());
        }
        if (memberChargeLog.getChargeAmount() != null) {
            chainWrapper.set(MemberChargeLog::getChargeAmount, memberChargeLog.getChargeAmount());
        }
        if (memberChargeLog.getGiveAmount() != null) {
            chainWrapper.set(MemberChargeLog::getGiveAmount, memberChargeLog.getGiveAmount());
        }
        if (memberChargeLog.getNewestAmount() != null) {
            chainWrapper.set(MemberChargeLog::getNewestAmount, memberChargeLog.getNewestAmount());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getCreateName())) {
            chainWrapper.set(MemberChargeLog::getCreateName, memberChargeLog.getCreateName());
        }
        if (memberChargeLog.getChargeTime() != null) {
            chainWrapper.set(MemberChargeLog::getChargeTime, memberChargeLog.getChargeTime());
        }
        if (memberChargeLog.getAreaCode() != null) {
            chainWrapper.set(MemberChargeLog::getAreaCode, memberChargeLog.getAreaCode());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getAreaName())) {
            chainWrapper.set(MemberChargeLog::getAreaName, memberChargeLog.getAreaName());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getRemark())) {
            chainWrapper.set(MemberChargeLog::getRemark, memberChargeLog.getRemark());
        }
        if (memberChargeLog.getCreateUser() != null) {
            chainWrapper.set(MemberChargeLog::getCreateUser, memberChargeLog.getCreateUser());
        }
        if (memberChargeLog.getCreateDept() != null) {
            chainWrapper.set(MemberChargeLog::getCreateDept, memberChargeLog.getCreateDept());
        }
        if (memberChargeLog.getCreateTime() != null) {
            chainWrapper.set(MemberChargeLog::getCreateTime, memberChargeLog.getCreateTime());
        }
        if (memberChargeLog.getUpdateUser() != null) {
            chainWrapper.set(MemberChargeLog::getUpdateUser, memberChargeLog.getUpdateUser());
        }
        if (memberChargeLog.getUpdateTime() != null) {
            chainWrapper.set(MemberChargeLog::getUpdateTime, memberChargeLog.getUpdateTime());
        }
        if (memberChargeLog.getStatus() != null) {
            chainWrapper.set(MemberChargeLog::getStatus, memberChargeLog.getStatus());
        }
        if (memberChargeLog.getIsDeleted() != null) {
            chainWrapper.set(MemberChargeLog::getIsDeleted, memberChargeLog.getIsDeleted());
        }
        if (StringUtil.isNotBlank(memberChargeLog.getOutTradeNo())) {
            chainWrapper.set(MemberChargeLog::getOutTradeNo, memberChargeLog.getOutTradeNo());
        }
        if (memberChargeLog.getDataSource() != null) {
            chainWrapper.set(MemberChargeLog::getDataSource, memberChargeLog.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MemberChargeLog::getId, memberChargeLog.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(memberChargeLog.getId());
        } else {
            return memberChargeLog;
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
    public boolean saveMemberChargeLogBatch(List<MemberChargeLog> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MemberChargeLog memberChargeLog : insertList) {
            //使用默认的雪花算法生成
            memberChargeLog.setId(null);
            //memberChargeLog.setCreatedDt(currentDte);
            //memberChargeLog.setUpdatedDt(currentDte);
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
    public Integer deleteMemberChargeLogBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MemberChargeLog> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


