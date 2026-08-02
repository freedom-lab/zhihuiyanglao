package cn.pluss.platform.service.insStaffContractInfo.impl;

import cn.pluss.platform.mapper.InsStaffContractInfoMapper;
import cn.pluss.platform.model.entity.InsStaffContractInfo;
import cn.pluss.platform.service.insStaffContractInfo.InsStaffContractInfoService;
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
@Service("insStaffContractInfoService")
public class InsStaffContractInfoServiceImpl extends ServiceImpl< InsStaffContractInfoMapper, InsStaffContractInfo> implements InsStaffContractInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsStaffContractInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsStaffContractInfo> queryPage(Map map) {
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
    public InsStaffContractInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffContractInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsStaffContractInfo queryOne(InsStaffContractInfo insStaffContractInfo){
        LambdaQueryWrapper<InsStaffContractInfo> queryWrapper = getQueryWrapper(insStaffContractInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insStaffContractInfo
    * @return
    */
    @Override
    public List<InsStaffContractInfo> queryList(InsStaffContractInfo insStaffContractInfo) {
        LambdaQueryWrapper<InsStaffContractInfo> queryWrapper = getQueryWrapper(insStaffContractInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insStaffContractInfo
    * @return
    */
    public static LambdaQueryWrapper<InsStaffContractInfo> getQueryWrapper(InsStaffContractInfo insStaffContractInfo){
        LambdaQueryWrapper<InsStaffContractInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insStaffContractInfo.getId() != null) {
            queryWrapper.eq(InsStaffContractInfo::getId, insStaffContractInfo.getId());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getTenantId())) {
            queryWrapper.eq(InsStaffContractInfo::getTenantId, insStaffContractInfo.getTenantId());
        }
        if (insStaffContractInfo.getCorpId() != null) {
            queryWrapper.eq(InsStaffContractInfo::getCorpId, insStaffContractInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getCorpName())) {
            queryWrapper.eq(InsStaffContractInfo::getCorpName, insStaffContractInfo.getCorpName());
        }
        if (insStaffContractInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsStaffContractInfo::getInstitutionId, insStaffContractInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getInstitutionName())) {
            queryWrapper.eq(InsStaffContractInfo::getInstitutionName, insStaffContractInfo.getInstitutionName());
        }
        if (insStaffContractInfo.getStaffId() != null) {
            queryWrapper.eq(InsStaffContractInfo::getStaffId, insStaffContractInfo.getStaffId());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getStaffName())) {
            queryWrapper.eq(InsStaffContractInfo::getStaffName, insStaffContractInfo.getStaffName());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getSex())) {
            queryWrapper.eq(InsStaffContractInfo::getSex, insStaffContractInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getIdCard())) {
            queryWrapper.eq(InsStaffContractInfo::getIdCard, insStaffContractInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getContractCode())) {
            queryWrapper.eq(InsStaffContractInfo::getContractCode, insStaffContractInfo.getContractCode());
        }
        if (insStaffContractInfo.getSignTime() != null) {
            queryWrapper.eq(InsStaffContractInfo::getSignTime, insStaffContractInfo.getSignTime());
        }
        if (insStaffContractInfo.getStartDate() != null) {
            queryWrapper.eq(InsStaffContractInfo::getStartDate, insStaffContractInfo.getStartDate());
        }
        if (insStaffContractInfo.getEndDate() != null) {
            queryWrapper.eq(InsStaffContractInfo::getEndDate, insStaffContractInfo.getEndDate());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getContractDesp())) {
            queryWrapper.eq(InsStaffContractInfo::getContractDesp, insStaffContractInfo.getContractDesp());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getPartyNameA())) {
            queryWrapper.eq(InsStaffContractInfo::getPartyNameA, insStaffContractInfo.getPartyNameA());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getLinkTelA())) {
            queryWrapper.eq(InsStaffContractInfo::getLinkTelA, insStaffContractInfo.getLinkTelA());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getAddressA())) {
            queryWrapper.eq(InsStaffContractInfo::getAddressA, insStaffContractInfo.getAddressA());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getPartyNameB())) {
            queryWrapper.eq(InsStaffContractInfo::getPartyNameB, insStaffContractInfo.getPartyNameB());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getLinkTelB())) {
            queryWrapper.eq(InsStaffContractInfo::getLinkTelB, insStaffContractInfo.getLinkTelB());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getAddressB())) {
            queryWrapper.eq(InsStaffContractInfo::getAddressB, insStaffContractInfo.getAddressB());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getContractPath())) {
            queryWrapper.eq(InsStaffContractInfo::getContractPath, insStaffContractInfo.getContractPath());
        }
        if (insStaffContractInfo.getContractState() != null) {
            queryWrapper.eq(InsStaffContractInfo::getContractState, insStaffContractInfo.getContractState());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getAreaCode())) {
            queryWrapper.eq(InsStaffContractInfo::getAreaCode, insStaffContractInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getAreaName())) {
            queryWrapper.eq(InsStaffContractInfo::getAreaName, insStaffContractInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getRemark())) {
            queryWrapper.eq(InsStaffContractInfo::getRemark, insStaffContractInfo.getRemark());
        }
        if (insStaffContractInfo.getCreateUser() != null) {
            queryWrapper.eq(InsStaffContractInfo::getCreateUser, insStaffContractInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insStaffContractInfo.getCreateName())) {
            queryWrapper.eq(InsStaffContractInfo::getCreateName, insStaffContractInfo.getCreateName());
        }
        if (insStaffContractInfo.getCreateDept() != null) {
            queryWrapper.eq(InsStaffContractInfo::getCreateDept, insStaffContractInfo.getCreateDept());
        }
        if (insStaffContractInfo.getCreateTime() != null) {
            queryWrapper.eq(InsStaffContractInfo::getCreateTime, insStaffContractInfo.getCreateTime());
        }
        if (insStaffContractInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsStaffContractInfo::getUpdateUser, insStaffContractInfo.getUpdateUser());
        }
        if (insStaffContractInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsStaffContractInfo::getUpdateTime, insStaffContractInfo.getUpdateTime());
        }
        if (insStaffContractInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsStaffContractInfo::getIsDeleted, insStaffContractInfo.getIsDeleted());
        }
        if (insStaffContractInfo.getStatus() != null) {
            queryWrapper.eq(InsStaffContractInfo::getStatus, insStaffContractInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insStaffContractInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffContractInfo insert(InsStaffContractInfo insStaffContractInfo) {
        insStaffContractInfo.setId(null);
        getBaseMapper().insert(insStaffContractInfo);
        return insStaffContractInfo;
    }

    /**
    * 更新数据
    *
    * @param insStaffContractInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsStaffContractInfo update(InsStaffContractInfo insStaffContractInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsStaffContractInfo> chainWrapper = new LambdaUpdateChainWrapper<InsStaffContractInfo>(getBaseMapper());
        if (insStaffContractInfo.getId() != null) {
            chainWrapper.set(InsStaffContractInfo::getId, insStaffContractInfo.getId());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getTenantId())) {
            chainWrapper.set(InsStaffContractInfo::getTenantId, insStaffContractInfo.getTenantId());
        }
        if (insStaffContractInfo.getCorpId() != null) {
            chainWrapper.set(InsStaffContractInfo::getCorpId, insStaffContractInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getCorpName())) {
            chainWrapper.set(InsStaffContractInfo::getCorpName, insStaffContractInfo.getCorpName());
        }
        if (insStaffContractInfo.getInstitutionId() != null) {
            chainWrapper.set(InsStaffContractInfo::getInstitutionId, insStaffContractInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getInstitutionName())) {
            chainWrapper.set(InsStaffContractInfo::getInstitutionName, insStaffContractInfo.getInstitutionName());
        }
        if (insStaffContractInfo.getStaffId() != null) {
            chainWrapper.set(InsStaffContractInfo::getStaffId, insStaffContractInfo.getStaffId());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getStaffName())) {
            chainWrapper.set(InsStaffContractInfo::getStaffName, insStaffContractInfo.getStaffName());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getSex())) {
            chainWrapper.set(InsStaffContractInfo::getSex, insStaffContractInfo.getSex());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getIdCard())) {
            chainWrapper.set(InsStaffContractInfo::getIdCard, insStaffContractInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getContractCode())) {
            chainWrapper.set(InsStaffContractInfo::getContractCode, insStaffContractInfo.getContractCode());
        }
        if (insStaffContractInfo.getSignTime() != null) {
            chainWrapper.set(InsStaffContractInfo::getSignTime, insStaffContractInfo.getSignTime());
        }
        if (insStaffContractInfo.getStartDate() != null) {
            chainWrapper.set(InsStaffContractInfo::getStartDate, insStaffContractInfo.getStartDate());
        }
        if (insStaffContractInfo.getEndDate() != null) {
            chainWrapper.set(InsStaffContractInfo::getEndDate, insStaffContractInfo.getEndDate());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getContractDesp())) {
            chainWrapper.set(InsStaffContractInfo::getContractDesp, insStaffContractInfo.getContractDesp());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getPartyNameA())) {
            chainWrapper.set(InsStaffContractInfo::getPartyNameA, insStaffContractInfo.getPartyNameA());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getLinkTelA())) {
            chainWrapper.set(InsStaffContractInfo::getLinkTelA, insStaffContractInfo.getLinkTelA());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getAddressA())) {
            chainWrapper.set(InsStaffContractInfo::getAddressA, insStaffContractInfo.getAddressA());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getPartyNameB())) {
            chainWrapper.set(InsStaffContractInfo::getPartyNameB, insStaffContractInfo.getPartyNameB());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getLinkTelB())) {
            chainWrapper.set(InsStaffContractInfo::getLinkTelB, insStaffContractInfo.getLinkTelB());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getAddressB())) {
            chainWrapper.set(InsStaffContractInfo::getAddressB, insStaffContractInfo.getAddressB());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getContractPath())) {
            chainWrapper.set(InsStaffContractInfo::getContractPath, insStaffContractInfo.getContractPath());
        }
        if (insStaffContractInfo.getContractState() != null) {
            chainWrapper.set(InsStaffContractInfo::getContractState, insStaffContractInfo.getContractState());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getAreaCode())) {
            chainWrapper.set(InsStaffContractInfo::getAreaCode, insStaffContractInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getAreaName())) {
            chainWrapper.set(InsStaffContractInfo::getAreaName, insStaffContractInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getRemark())) {
            chainWrapper.set(InsStaffContractInfo::getRemark, insStaffContractInfo.getRemark());
        }
        if (insStaffContractInfo.getCreateUser() != null) {
            chainWrapper.set(InsStaffContractInfo::getCreateUser, insStaffContractInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insStaffContractInfo.getCreateName())) {
            chainWrapper.set(InsStaffContractInfo::getCreateName, insStaffContractInfo.getCreateName());
        }
        if (insStaffContractInfo.getCreateDept() != null) {
            chainWrapper.set(InsStaffContractInfo::getCreateDept, insStaffContractInfo.getCreateDept());
        }
        if (insStaffContractInfo.getCreateTime() != null) {
            chainWrapper.set(InsStaffContractInfo::getCreateTime, insStaffContractInfo.getCreateTime());
        }
        if (insStaffContractInfo.getUpdateUser() != null) {
            chainWrapper.set(InsStaffContractInfo::getUpdateUser, insStaffContractInfo.getUpdateUser());
        }
        if (insStaffContractInfo.getUpdateTime() != null) {
            chainWrapper.set(InsStaffContractInfo::getUpdateTime, insStaffContractInfo.getUpdateTime());
        }
        if (insStaffContractInfo.getIsDeleted() != null) {
            chainWrapper.set(InsStaffContractInfo::getIsDeleted, insStaffContractInfo.getIsDeleted());
        }
        if (insStaffContractInfo.getStatus() != null) {
            chainWrapper.set(InsStaffContractInfo::getStatus, insStaffContractInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsStaffContractInfo::getId, insStaffContractInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insStaffContractInfo.getId());
        } else {
            return insStaffContractInfo;
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
    public boolean saveInsStaffContractInfoBatch(List<InsStaffContractInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsStaffContractInfo insStaffContractInfo : insertList) {
            //使用默认的雪花算法生成
            insStaffContractInfo.setId(null);
            //insStaffContractInfo.setCreatedDt(currentDte);
            //insStaffContractInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsStaffContractInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsStaffContractInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


