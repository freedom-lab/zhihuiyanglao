package cn.pluss.platform.service.insStaffMemberCardInfo.impl;

import cn.pluss.platform.mapper.InsStaffMemberCardInfoMapper;
import cn.pluss.platform.model.entity.InsStaffMemberCardInfo;
import cn.pluss.platform.service.insStaffMemberCardInfo.InsStaffMemberCardInfoService;
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
@Service("insStaffMemberCardInfoService")
public class InsStaffMemberCardInfoServiceImpl extends ServiceImpl< InsStaffMemberCardInfoMapper, InsStaffMemberCardInfo> implements InsStaffMemberCardInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffMemberCardInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffMemberCardInfo> queryPage(Map map) {
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
    public InsStaffMemberCardInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffMemberCardInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffMemberCardInfo queryOne(InsStaffMemberCardInfo insStaffMemberCardInfo){
        LambdaQueryWrapper<InsStaffMemberCardInfo> queryWrapper = getQueryWrapper(insStaffMemberCardInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffMemberCardInfo
    * @return
    */
    @Override
    public List<InsStaffMemberCardInfo> queryList(InsStaffMemberCardInfo insStaffMemberCardInfo) {
        LambdaQueryWrapper<InsStaffMemberCardInfo> queryWrapper = getQueryWrapper(insStaffMemberCardInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffMemberCardInfo
    * @return
    */
    public static LambdaQueryWrapper<InsStaffMemberCardInfo> getQueryWrapper(InsStaffMemberCardInfo insStaffMemberCardInfo){
        LambdaQueryWrapper<InsStaffMemberCardInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffMemberCardInfo.getId() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getId, insStaffMemberCardInfo.getId());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getTenantId())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getTenantId, insStaffMemberCardInfo.getTenantId());
        }
        if (insStaffMemberCardInfo.getCorpId() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getCorpId, insStaffMemberCardInfo.getCorpId());
        }
        if (insStaffMemberCardInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getInstitutionId, insStaffMemberCardInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getInstitutionName())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getInstitutionName, insStaffMemberCardInfo.getInstitutionName());
        }
        if (insStaffMemberCardInfo.getStaffId() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getStaffId, insStaffMemberCardInfo.getStaffId());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getStaffName())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getStaffName, insStaffMemberCardInfo.getStaffName());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getSex())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getSex, insStaffMemberCardInfo.getSex());
        }
        if (insStaffMemberCardInfo.getAge() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getAge, insStaffMemberCardInfo.getAge());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getIdCard())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getIdCard, insStaffMemberCardInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getLinkTel())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getLinkTel, insStaffMemberCardInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getMemberCard())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getMemberCard, insStaffMemberCardInfo.getMemberCard());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getCardPass())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getCardPass, insStaffMemberCardInfo.getCardPass());
        }
        if (insStaffMemberCardInfo.getMemberLevel() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getMemberLevel, insStaffMemberCardInfo.getMemberLevel());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getMemberState())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getMemberState, insStaffMemberCardInfo.getMemberState());
        }
        if (insStaffMemberCardInfo.getCardDeposit() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getCardDeposit, insStaffMemberCardInfo.getCardDeposit());
        }
        if (insStaffMemberCardInfo.getMemberAmount() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getMemberAmount, insStaffMemberCardInfo.getMemberAmount());
        }
        if (insStaffMemberCardInfo.getMemberIntegral() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getMemberIntegral, insStaffMemberCardInfo.getMemberIntegral());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getCreateName())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getCreateName, insStaffMemberCardInfo.getCreateName());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getRefereeName())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getRefereeName, insStaffMemberCardInfo.getRefereeName());
        }
        if (insStaffMemberCardInfo.getEffectiveDate() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getEffectiveDate, insStaffMemberCardInfo.getEffectiveDate());
        }
        if (insStaffMemberCardInfo.getExpirationDate() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getExpirationDate, insStaffMemberCardInfo.getExpirationDate());
        }
        if (insStaffMemberCardInfo.getMaxConsumption() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getMaxConsumption, insStaffMemberCardInfo.getMaxConsumption());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getAreaCode())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getAreaCode, insStaffMemberCardInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getAreaName())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getAreaName, insStaffMemberCardInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(insStaffMemberCardInfo.getRemark())) {
            queryWrapper.eq(InsStaffMemberCardInfo::getRemark, insStaffMemberCardInfo.getRemark());
        }
        if (insStaffMemberCardInfo.getCreateUser() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getCreateUser, insStaffMemberCardInfo.getCreateUser());
        }
        if (insStaffMemberCardInfo.getCreateDept() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getCreateDept, insStaffMemberCardInfo.getCreateDept());
        }
        if (insStaffMemberCardInfo.getCreateTime() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getCreateTime, insStaffMemberCardInfo.getCreateTime());
        }
        if (insStaffMemberCardInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getUpdateUser, insStaffMemberCardInfo.getUpdateUser());
        }
        if (insStaffMemberCardInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getUpdateTime, insStaffMemberCardInfo.getUpdateTime());
        }
        if (insStaffMemberCardInfo.getStatus() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getStatus, insStaffMemberCardInfo.getStatus());
        }
        if (insStaffMemberCardInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffMemberCardInfo::getIsDeleted, insStaffMemberCardInfo.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffMemberCardInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffMemberCardInfo insert(InsStaffMemberCardInfo insStaffMemberCardInfo) {
        insStaffMemberCardInfo.setId(null);
        getBaseMapper().insert(insStaffMemberCardInfo);
        return insStaffMemberCardInfo;
    }

    /**
    * 更新数据
    *
    * @param insStaffMemberCardInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffMemberCardInfo update(InsStaffMemberCardInfo insStaffMemberCardInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffMemberCardInfo> chainWrapper = new LambdaUpdateChainWrapper<InsStaffMemberCardInfo>(getBaseMapper());
        if (insStaffMemberCardInfo.getId() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getId, insStaffMemberCardInfo.getId());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getTenantId())) {
            chainWrapper.set(InsStaffMemberCardInfo::getTenantId, insStaffMemberCardInfo.getTenantId());
        }
        if (insStaffMemberCardInfo.getCorpId() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getCorpId, insStaffMemberCardInfo.getCorpId());
        }
        if (insStaffMemberCardInfo.getInstitutionId() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getInstitutionId, insStaffMemberCardInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getInstitutionName())) {
            chainWrapper.set(InsStaffMemberCardInfo::getInstitutionName, insStaffMemberCardInfo.getInstitutionName());
        }
        if (insStaffMemberCardInfo.getStaffId() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getStaffId, insStaffMemberCardInfo.getStaffId());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getStaffName())) {
            chainWrapper.set(InsStaffMemberCardInfo::getStaffName, insStaffMemberCardInfo.getStaffName());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getSex())) {
            chainWrapper.set(InsStaffMemberCardInfo::getSex, insStaffMemberCardInfo.getSex());
        }
        if (insStaffMemberCardInfo.getAge() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getAge, insStaffMemberCardInfo.getAge());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getIdCard())) {
            chainWrapper.set(InsStaffMemberCardInfo::getIdCard, insStaffMemberCardInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getLinkTel())) {
            chainWrapper.set(InsStaffMemberCardInfo::getLinkTel, insStaffMemberCardInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getMemberCard())) {
            chainWrapper.set(InsStaffMemberCardInfo::getMemberCard, insStaffMemberCardInfo.getMemberCard());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getCardPass())) {
            chainWrapper.set(InsStaffMemberCardInfo::getCardPass, insStaffMemberCardInfo.getCardPass());
        }
        if (insStaffMemberCardInfo.getMemberLevel() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getMemberLevel, insStaffMemberCardInfo.getMemberLevel());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getMemberState())) {
            chainWrapper.set(InsStaffMemberCardInfo::getMemberState, insStaffMemberCardInfo.getMemberState());
        }
        if (insStaffMemberCardInfo.getCardDeposit() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getCardDeposit, insStaffMemberCardInfo.getCardDeposit());
        }
        if (insStaffMemberCardInfo.getMemberAmount() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getMemberAmount, insStaffMemberCardInfo.getMemberAmount());
        }
        if (insStaffMemberCardInfo.getMemberIntegral() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getMemberIntegral, insStaffMemberCardInfo.getMemberIntegral());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getCreateName())) {
            chainWrapper.set(InsStaffMemberCardInfo::getCreateName, insStaffMemberCardInfo.getCreateName());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getRefereeName())) {
            chainWrapper.set(InsStaffMemberCardInfo::getRefereeName, insStaffMemberCardInfo.getRefereeName());
        }
        if (insStaffMemberCardInfo.getEffectiveDate() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getEffectiveDate, insStaffMemberCardInfo.getEffectiveDate());
        }
        if (insStaffMemberCardInfo.getExpirationDate() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getExpirationDate, insStaffMemberCardInfo.getExpirationDate());
        }
        if (insStaffMemberCardInfo.getMaxConsumption() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getMaxConsumption, insStaffMemberCardInfo.getMaxConsumption());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getAreaCode())) {
            chainWrapper.set(InsStaffMemberCardInfo::getAreaCode, insStaffMemberCardInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getAreaName())) {
            chainWrapper.set(InsStaffMemberCardInfo::getAreaName, insStaffMemberCardInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(insStaffMemberCardInfo.getRemark())) {
            chainWrapper.set(InsStaffMemberCardInfo::getRemark, insStaffMemberCardInfo.getRemark());
        }
        if (insStaffMemberCardInfo.getCreateUser() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getCreateUser, insStaffMemberCardInfo.getCreateUser());
        }
        if (insStaffMemberCardInfo.getCreateDept() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getCreateDept, insStaffMemberCardInfo.getCreateDept());
        }
        if (insStaffMemberCardInfo.getCreateTime() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getCreateTime, insStaffMemberCardInfo.getCreateTime());
        }
        if (insStaffMemberCardInfo.getUpdateUser() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getUpdateUser, insStaffMemberCardInfo.getUpdateUser());
        }
        if (insStaffMemberCardInfo.getUpdateTime() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getUpdateTime, insStaffMemberCardInfo.getUpdateTime());
        }
        if (insStaffMemberCardInfo.getStatus() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getStatus, insStaffMemberCardInfo.getStatus());
        }
        if (insStaffMemberCardInfo.getIsDeleted() != null) {
            chainWrapper.set(InsStaffMemberCardInfo::getIsDeleted, insStaffMemberCardInfo.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffMemberCardInfo::getId, insStaffMemberCardInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffMemberCardInfo.getId());
        } else {
            return insStaffMemberCardInfo;
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
    public boolean saveInsStaffMemberCardInfoBatch(List<InsStaffMemberCardInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffMemberCardInfo insStaffMemberCardInfo : insertList) {
            //使用默认的雪花算法生成
            insStaffMemberCardInfo.setId(null);
            //insStaffMemberCardInfo.setCreatedDt(currentDte);
            //insStaffMemberCardInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffMemberCardInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffMemberCardInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


