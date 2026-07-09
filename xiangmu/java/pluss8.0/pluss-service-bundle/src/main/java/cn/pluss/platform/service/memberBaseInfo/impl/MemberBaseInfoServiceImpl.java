package cn.pluss.platform.service.memberBaseInfo.impl;

import cn.pluss.platform.mapper.MemberBaseInfoMapper;
import cn.pluss.platform.model.entity.MemberBaseInfo;
import cn.pluss.platform.service.memberBaseInfo.MemberBaseInfoService;
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
@Service("memberBaseInfoService")
public class MemberBaseInfoServiceImpl extends ServiceImpl< MemberBaseInfoMapper, MemberBaseInfo> implements MemberBaseInfoService {
    private static final Logger logger = LoggerFactory.getLogger(MemberBaseInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MemberBaseInfo> queryPage(Map map) {
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
    public MemberBaseInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param memberBaseInfo 实例对象
    * @return 实例对象
    */
    @Override
    public MemberBaseInfo queryOne(MemberBaseInfo memberBaseInfo){
        LambdaQueryWrapper<MemberBaseInfo> queryWrapper = getQueryWrapper(memberBaseInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param memberBaseInfo
    * @return
    */
    @Override
    public List<MemberBaseInfo> queryList(MemberBaseInfo memberBaseInfo) {
        LambdaQueryWrapper<MemberBaseInfo> queryWrapper = getQueryWrapper(memberBaseInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param memberBaseInfo
    * @return
    */
    public static LambdaQueryWrapper<MemberBaseInfo> getQueryWrapper(MemberBaseInfo memberBaseInfo){
        LambdaQueryWrapper<MemberBaseInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (memberBaseInfo.getId() != null) {
            queryWrapper.eq(MemberBaseInfo::getId, memberBaseInfo.getId());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getTenantId())) {
            queryWrapper.eq(MemberBaseInfo::getTenantId, memberBaseInfo.getTenantId());
        }
        if (memberBaseInfo.getCorpId() != null) {
            queryWrapper.eq(MemberBaseInfo::getCorpId, memberBaseInfo.getCorpId());
        }
        if (memberBaseInfo.getInstitutionId() != null) {
            queryWrapper.eq(MemberBaseInfo::getInstitutionId, memberBaseInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getInstitutionName())) {
            queryWrapper.eq(MemberBaseInfo::getInstitutionName, memberBaseInfo.getInstitutionName());
        }
        if (memberBaseInfo.getElderId() != null) {
            queryWrapper.eq(MemberBaseInfo::getElderId, memberBaseInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getElderName())) {
            queryWrapper.eq(MemberBaseInfo::getElderName, memberBaseInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getElderAge())) {
            queryWrapper.eq(MemberBaseInfo::getElderAge, memberBaseInfo.getElderAge());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getElderSex())) {
            queryWrapper.eq(MemberBaseInfo::getElderSex, memberBaseInfo.getElderSex());
        }
        if (memberBaseInfo.getElderCheckInTime() != null) {
            queryWrapper.eq(MemberBaseInfo::getElderCheckInTime, memberBaseInfo.getElderCheckInTime());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getElderRoomNum())) {
            queryWrapper.eq(MemberBaseInfo::getElderRoomNum, memberBaseInfo.getElderRoomNum());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getElderBedNum())) {
            queryWrapper.eq(MemberBaseInfo::getElderBedNum, memberBaseInfo.getElderBedNum());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getElderPhone())) {
            queryWrapper.eq(MemberBaseInfo::getElderPhone, memberBaseInfo.getElderPhone());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getElderIdCardNumber())) {
            queryWrapper.eq(MemberBaseInfo::getElderIdCardNumber, memberBaseInfo.getElderIdCardNumber());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getElderNursingLevel())) {
            queryWrapper.eq(MemberBaseInfo::getElderNursingLevel, memberBaseInfo.getElderNursingLevel());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getSex())) {
            queryWrapper.eq(MemberBaseInfo::getSex, memberBaseInfo.getSex());
        }
        if (memberBaseInfo.getAge() != null) {
            queryWrapper.eq(MemberBaseInfo::getAge, memberBaseInfo.getAge());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getIdCard())) {
            queryWrapper.eq(MemberBaseInfo::getIdCard, memberBaseInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getLinkTel())) {
            queryWrapper.eq(MemberBaseInfo::getLinkTel, memberBaseInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getMemberCard())) {
            queryWrapper.eq(MemberBaseInfo::getMemberCard, memberBaseInfo.getMemberCard());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getCardPass())) {
            queryWrapper.eq(MemberBaseInfo::getCardPass, memberBaseInfo.getCardPass());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getCardType())) {
            queryWrapper.eq(MemberBaseInfo::getCardType, memberBaseInfo.getCardType());
        }
        if (memberBaseInfo.getMemberLevel() != null) {
            queryWrapper.eq(MemberBaseInfo::getMemberLevel, memberBaseInfo.getMemberLevel());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getMemberState())) {
            queryWrapper.eq(MemberBaseInfo::getMemberState, memberBaseInfo.getMemberState());
        }
        if (memberBaseInfo.getCardDeposit() != null) {
            queryWrapper.eq(MemberBaseInfo::getCardDeposit, memberBaseInfo.getCardDeposit());
        }
        if (memberBaseInfo.getMemberAmount() != null) {
            queryWrapper.eq(MemberBaseInfo::getMemberAmount, memberBaseInfo.getMemberAmount());
        }
        if (memberBaseInfo.getMemberIntegral() != null) {
            queryWrapper.eq(MemberBaseInfo::getMemberIntegral, memberBaseInfo.getMemberIntegral());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getCreateName())) {
            queryWrapper.eq(MemberBaseInfo::getCreateName, memberBaseInfo.getCreateName());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getRefereeName())) {
            queryWrapper.eq(MemberBaseInfo::getRefereeName, memberBaseInfo.getRefereeName());
        }
        if (memberBaseInfo.getEffectiveDate() != null) {
            queryWrapper.eq(MemberBaseInfo::getEffectiveDate, memberBaseInfo.getEffectiveDate());
        }
        if (memberBaseInfo.getExpirationDate() != null) {
            queryWrapper.eq(MemberBaseInfo::getExpirationDate, memberBaseInfo.getExpirationDate());
        }
        if (memberBaseInfo.getMaxConsumption() != null) {
            queryWrapper.eq(MemberBaseInfo::getMaxConsumption, memberBaseInfo.getMaxConsumption());
        }
        if (memberBaseInfo.getAreaCode() != null) {
            queryWrapper.eq(MemberBaseInfo::getAreaCode, memberBaseInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getAreaName())) {
            queryWrapper.eq(MemberBaseInfo::getAreaName, memberBaseInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getRemark())) {
            queryWrapper.eq(MemberBaseInfo::getRemark, memberBaseInfo.getRemark());
        }
        if (memberBaseInfo.getCreateUser() != null) {
            queryWrapper.eq(MemberBaseInfo::getCreateUser, memberBaseInfo.getCreateUser());
        }
        if (memberBaseInfo.getCreateDept() != null) {
            queryWrapper.eq(MemberBaseInfo::getCreateDept, memberBaseInfo.getCreateDept());
        }
        if (memberBaseInfo.getCreateTime() != null) {
            queryWrapper.eq(MemberBaseInfo::getCreateTime, memberBaseInfo.getCreateTime());
        }
        if (memberBaseInfo.getUpdateUser() != null) {
            queryWrapper.eq(MemberBaseInfo::getUpdateUser, memberBaseInfo.getUpdateUser());
        }
        if (memberBaseInfo.getUpdateTime() != null) {
            queryWrapper.eq(MemberBaseInfo::getUpdateTime, memberBaseInfo.getUpdateTime());
        }
        if (memberBaseInfo.getStatus() != null) {
            queryWrapper.eq(MemberBaseInfo::getStatus, memberBaseInfo.getStatus());
        }
        if (memberBaseInfo.getIsDeleted() != null) {
            queryWrapper.eq(MemberBaseInfo::getIsDeleted, memberBaseInfo.getIsDeleted());
        }
        if (StringUtil.isNotEmpty(memberBaseInfo.getAccountNo())) {
            queryWrapper.eq(MemberBaseInfo::getAccountNo, memberBaseInfo.getAccountNo());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param memberBaseInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MemberBaseInfo insert(MemberBaseInfo memberBaseInfo) {
        memberBaseInfo.setId(null);
        getBaseMapper().insert(memberBaseInfo);
        return memberBaseInfo;
    }

    /**
    * 更新数据
    *
    * @param memberBaseInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MemberBaseInfo update(MemberBaseInfo memberBaseInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MemberBaseInfo> chainWrapper = new LambdaUpdateChainWrapper<MemberBaseInfo>(getBaseMapper());
        if (memberBaseInfo.getId() != null) {
            chainWrapper.set(MemberBaseInfo::getId, memberBaseInfo.getId());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getTenantId())) {
            chainWrapper.set(MemberBaseInfo::getTenantId, memberBaseInfo.getTenantId());
        }
        if (memberBaseInfo.getCorpId() != null) {
            chainWrapper.set(MemberBaseInfo::getCorpId, memberBaseInfo.getCorpId());
        }
        if (memberBaseInfo.getInstitutionId() != null) {
            chainWrapper.set(MemberBaseInfo::getInstitutionId, memberBaseInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getInstitutionName())) {
            chainWrapper.set(MemberBaseInfo::getInstitutionName, memberBaseInfo.getInstitutionName());
        }
        if (memberBaseInfo.getElderId() != null) {
            chainWrapper.set(MemberBaseInfo::getElderId, memberBaseInfo.getElderId());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getElderName())) {
            chainWrapper.set(MemberBaseInfo::getElderName, memberBaseInfo.getElderName());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getElderAge())) {
            chainWrapper.set(MemberBaseInfo::getElderAge, memberBaseInfo.getElderAge());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getElderSex())) {
            chainWrapper.set(MemberBaseInfo::getElderSex, memberBaseInfo.getElderSex());
        }
        if (memberBaseInfo.getElderCheckInTime() != null) {
            chainWrapper.set(MemberBaseInfo::getElderCheckInTime, memberBaseInfo.getElderCheckInTime());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getElderRoomNum())) {
            chainWrapper.set(MemberBaseInfo::getElderRoomNum, memberBaseInfo.getElderRoomNum());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getElderBedNum())) {
            chainWrapper.set(MemberBaseInfo::getElderBedNum, memberBaseInfo.getElderBedNum());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getElderPhone())) {
            chainWrapper.set(MemberBaseInfo::getElderPhone, memberBaseInfo.getElderPhone());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getElderIdCardNumber())) {
            chainWrapper.set(MemberBaseInfo::getElderIdCardNumber, memberBaseInfo.getElderIdCardNumber());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getElderNursingLevel())) {
            chainWrapper.set(MemberBaseInfo::getElderNursingLevel, memberBaseInfo.getElderNursingLevel());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getSex())) {
            chainWrapper.set(MemberBaseInfo::getSex, memberBaseInfo.getSex());
        }
        if (memberBaseInfo.getAge() != null) {
            chainWrapper.set(MemberBaseInfo::getAge, memberBaseInfo.getAge());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getIdCard())) {
            chainWrapper.set(MemberBaseInfo::getIdCard, memberBaseInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getLinkTel())) {
            chainWrapper.set(MemberBaseInfo::getLinkTel, memberBaseInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getMemberCard())) {
            chainWrapper.set(MemberBaseInfo::getMemberCard, memberBaseInfo.getMemberCard());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getCardPass())) {
            chainWrapper.set(MemberBaseInfo::getCardPass, memberBaseInfo.getCardPass());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getCardType())) {
            chainWrapper.set(MemberBaseInfo::getCardType, memberBaseInfo.getCardType());
        }
        if (memberBaseInfo.getMemberLevel() != null) {
            chainWrapper.set(MemberBaseInfo::getMemberLevel, memberBaseInfo.getMemberLevel());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getMemberState())) {
            chainWrapper.set(MemberBaseInfo::getMemberState, memberBaseInfo.getMemberState());
        }
        if (memberBaseInfo.getCardDeposit() != null) {
            chainWrapper.set(MemberBaseInfo::getCardDeposit, memberBaseInfo.getCardDeposit());
        }
        if (memberBaseInfo.getMemberAmount() != null) {
            chainWrapper.set(MemberBaseInfo::getMemberAmount, memberBaseInfo.getMemberAmount());
        }
        if (memberBaseInfo.getMemberIntegral() != null) {
            chainWrapper.set(MemberBaseInfo::getMemberIntegral, memberBaseInfo.getMemberIntegral());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getCreateName())) {
            chainWrapper.set(MemberBaseInfo::getCreateName, memberBaseInfo.getCreateName());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getRefereeName())) {
            chainWrapper.set(MemberBaseInfo::getRefereeName, memberBaseInfo.getRefereeName());
        }
        if (memberBaseInfo.getEffectiveDate() != null) {
            chainWrapper.set(MemberBaseInfo::getEffectiveDate, memberBaseInfo.getEffectiveDate());
        }
        if (memberBaseInfo.getExpirationDate() != null) {
            chainWrapper.set(MemberBaseInfo::getExpirationDate, memberBaseInfo.getExpirationDate());
        }
        if (memberBaseInfo.getMaxConsumption() != null) {
            chainWrapper.set(MemberBaseInfo::getMaxConsumption, memberBaseInfo.getMaxConsumption());
        }
        if (memberBaseInfo.getAreaCode() != null) {
            chainWrapper.set(MemberBaseInfo::getAreaCode, memberBaseInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getAreaName())) {
            chainWrapper.set(MemberBaseInfo::getAreaName, memberBaseInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getRemark())) {
            chainWrapper.set(MemberBaseInfo::getRemark, memberBaseInfo.getRemark());
        }
        if (memberBaseInfo.getCreateUser() != null) {
            chainWrapper.set(MemberBaseInfo::getCreateUser, memberBaseInfo.getCreateUser());
        }
        if (memberBaseInfo.getCreateDept() != null) {
            chainWrapper.set(MemberBaseInfo::getCreateDept, memberBaseInfo.getCreateDept());
        }
        if (memberBaseInfo.getCreateTime() != null) {
            chainWrapper.set(MemberBaseInfo::getCreateTime, memberBaseInfo.getCreateTime());
        }
        if (memberBaseInfo.getUpdateUser() != null) {
            chainWrapper.set(MemberBaseInfo::getUpdateUser, memberBaseInfo.getUpdateUser());
        }
        if (memberBaseInfo.getUpdateTime() != null) {
            chainWrapper.set(MemberBaseInfo::getUpdateTime, memberBaseInfo.getUpdateTime());
        }
        if (memberBaseInfo.getStatus() != null) {
            chainWrapper.set(MemberBaseInfo::getStatus, memberBaseInfo.getStatus());
        }
        if (memberBaseInfo.getIsDeleted() != null) {
            chainWrapper.set(MemberBaseInfo::getIsDeleted, memberBaseInfo.getIsDeleted());
        }
        if (StringUtil.isNotBlank(memberBaseInfo.getAccountNo())) {
            chainWrapper.set(MemberBaseInfo::getAccountNo, memberBaseInfo.getAccountNo());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MemberBaseInfo::getId, memberBaseInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(memberBaseInfo.getId());
        } else {
            return memberBaseInfo;
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
    public boolean saveMemberBaseInfoBatch(List<MemberBaseInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MemberBaseInfo memberBaseInfo : insertList) {
            //使用默认的雪花算法生成
            memberBaseInfo.setId(null);
            //memberBaseInfo.setCreatedDt(currentDte);
            //memberBaseInfo.setUpdatedDt(currentDte);
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
    public Integer deleteMemberBaseInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MemberBaseInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


