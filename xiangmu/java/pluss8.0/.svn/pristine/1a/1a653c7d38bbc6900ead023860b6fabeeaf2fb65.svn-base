package cn.pluss.platform.service.iinsElderRetreatCommunicate.impl;

import cn.pluss.platform.mapper.IinsElderRetreatCommunicateMapper;
import cn.pluss.platform.model.entity.IinsElderRetreatCommunicate;
import cn.pluss.platform.service.iinsElderRetreatCommunicate.IinsElderRetreatCommunicateService;
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
@Service("iinsElderRetreatCommunicateService")
public class IinsElderRetreatCommunicateServiceImpl extends ServiceImpl< IinsElderRetreatCommunicateMapper, IinsElderRetreatCommunicate> implements IinsElderRetreatCommunicateService {
    private static final Logger logger = LoggerFactory.getLogger(IinsElderRetreatCommunicateServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<IinsElderRetreatCommunicate> queryPage(Map map) {
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
    public IinsElderRetreatCommunicate queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param iinsElderRetreatCommunicate 实例对象
    * @return 实例对象
    */
    @Override
    public IinsElderRetreatCommunicate queryOne(IinsElderRetreatCommunicate iinsElderRetreatCommunicate){
        LambdaQueryWrapper<IinsElderRetreatCommunicate> queryWrapper = getQueryWrapper(iinsElderRetreatCommunicate);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param iinsElderRetreatCommunicate
    * @return
    */
    @Override
    public List<IinsElderRetreatCommunicate> queryList(IinsElderRetreatCommunicate iinsElderRetreatCommunicate) {
        LambdaQueryWrapper<IinsElderRetreatCommunicate> queryWrapper = getQueryWrapper(iinsElderRetreatCommunicate);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param iinsElderRetreatCommunicate
    * @return
    */
    public static LambdaQueryWrapper<IinsElderRetreatCommunicate> getQueryWrapper(IinsElderRetreatCommunicate iinsElderRetreatCommunicate){
        LambdaQueryWrapper<IinsElderRetreatCommunicate> queryWrapper = new LambdaQueryWrapper<>();
        if (iinsElderRetreatCommunicate.getId() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getId, iinsElderRetreatCommunicate.getId());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getTenantId())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getTenantId, iinsElderRetreatCommunicate.getTenantId());
        }
        if (iinsElderRetreatCommunicate.getCorpId() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCorpId, iinsElderRetreatCommunicate.getCorpId());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getCorpName())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCorpName, iinsElderRetreatCommunicate.getCorpName());
        }
        if (iinsElderRetreatCommunicate.getInstitutionId() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getInstitutionId, iinsElderRetreatCommunicate.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getInstitutionName())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getInstitutionName, iinsElderRetreatCommunicate.getInstitutionName());
        }
        if (iinsElderRetreatCommunicate.getCheckId() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCheckId, iinsElderRetreatCommunicate.getCheckId());
        }
        if (iinsElderRetreatCommunicate.getCheckDate() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCheckDate, iinsElderRetreatCommunicate.getCheckDate());
        }
        if (iinsElderRetreatCommunicate.getCheckState() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCheckState, iinsElderRetreatCommunicate.getCheckState());
        }
        if (iinsElderRetreatCommunicate.getElderId() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getElderId, iinsElderRetreatCommunicate.getElderId());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getElderName())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getElderName, iinsElderRetreatCommunicate.getElderName());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getIdCard())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getIdCard, iinsElderRetreatCommunicate.getIdCard());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getSex())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getSex, iinsElderRetreatCommunicate.getSex());
        }
        if (iinsElderRetreatCommunicate.getAge() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getAge, iinsElderRetreatCommunicate.getAge());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getBedInfo())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getBedInfo, iinsElderRetreatCommunicate.getBedInfo());
        }
        if (iinsElderRetreatCommunicate.getRetreatTime() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getRetreatTime, iinsElderRetreatCommunicate.getRetreatTime());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getRetreatType())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getRetreatType, iinsElderRetreatCommunicate.getRetreatType());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getRetreatMemo())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getRetreatMemo, iinsElderRetreatCommunicate.getRetreatMemo());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getHandledName())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getHandledName, iinsElderRetreatCommunicate.getHandledName());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getCommunicateMemo())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCommunicateMemo, iinsElderRetreatCommunicate.getCommunicateMemo());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getCommunicateResult())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCommunicateResult, iinsElderRetreatCommunicate.getCommunicateResult());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getCommunicateName())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCommunicateName, iinsElderRetreatCommunicate.getCommunicateName());
        }
        if (iinsElderRetreatCommunicate.getCommunicateTime() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCommunicateTime, iinsElderRetreatCommunicate.getCommunicateTime());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getAreaCode())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getAreaCode, iinsElderRetreatCommunicate.getAreaCode());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getAreaName())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getAreaName, iinsElderRetreatCommunicate.getAreaName());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getRemark())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getRemark, iinsElderRetreatCommunicate.getRemark());
        }
        if (iinsElderRetreatCommunicate.getCreateUser() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCreateUser, iinsElderRetreatCommunicate.getCreateUser());
        }
        if (StringUtil.isNotEmpty(iinsElderRetreatCommunicate.getCreateName())) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCreateName, iinsElderRetreatCommunicate.getCreateName());
        }
        if (iinsElderRetreatCommunicate.getCreateDept() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCreateDept, iinsElderRetreatCommunicate.getCreateDept());
        }
        if (iinsElderRetreatCommunicate.getCreateTime() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getCreateTime, iinsElderRetreatCommunicate.getCreateTime());
        }
        if (iinsElderRetreatCommunicate.getUpdateUser() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getUpdateUser, iinsElderRetreatCommunicate.getUpdateUser());
        }
        if (iinsElderRetreatCommunicate.getUpdateTime() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getUpdateTime, iinsElderRetreatCommunicate.getUpdateTime());
        }
        if (iinsElderRetreatCommunicate.getIsDeleted() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getIsDeleted, iinsElderRetreatCommunicate.getIsDeleted());
        }
        if (iinsElderRetreatCommunicate.getStatus() != null) {
            queryWrapper.eq(IinsElderRetreatCommunicate::getStatus, iinsElderRetreatCommunicate.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param iinsElderRetreatCommunicate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IinsElderRetreatCommunicate insert(IinsElderRetreatCommunicate iinsElderRetreatCommunicate) {
        iinsElderRetreatCommunicate.setId(null);
        getBaseMapper().insert(iinsElderRetreatCommunicate);
        return iinsElderRetreatCommunicate;
    }

    /**
    * 更新数据
    *
    * @param iinsElderRetreatCommunicate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public IinsElderRetreatCommunicate update(IinsElderRetreatCommunicate iinsElderRetreatCommunicate) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<IinsElderRetreatCommunicate> chainWrapper = new LambdaUpdateChainWrapper<IinsElderRetreatCommunicate>(getBaseMapper());
        if (iinsElderRetreatCommunicate.getId() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getId, iinsElderRetreatCommunicate.getId());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getTenantId())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getTenantId, iinsElderRetreatCommunicate.getTenantId());
        }
        if (iinsElderRetreatCommunicate.getCorpId() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCorpId, iinsElderRetreatCommunicate.getCorpId());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getCorpName())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCorpName, iinsElderRetreatCommunicate.getCorpName());
        }
        if (iinsElderRetreatCommunicate.getInstitutionId() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getInstitutionId, iinsElderRetreatCommunicate.getInstitutionId());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getInstitutionName())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getInstitutionName, iinsElderRetreatCommunicate.getInstitutionName());
        }
        if (iinsElderRetreatCommunicate.getCheckId() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCheckId, iinsElderRetreatCommunicate.getCheckId());
        }
        if (iinsElderRetreatCommunicate.getCheckDate() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCheckDate, iinsElderRetreatCommunicate.getCheckDate());
        }
        if (iinsElderRetreatCommunicate.getCheckState() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCheckState, iinsElderRetreatCommunicate.getCheckState());
        }
        if (iinsElderRetreatCommunicate.getElderId() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getElderId, iinsElderRetreatCommunicate.getElderId());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getElderName())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getElderName, iinsElderRetreatCommunicate.getElderName());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getIdCard())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getIdCard, iinsElderRetreatCommunicate.getIdCard());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getSex())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getSex, iinsElderRetreatCommunicate.getSex());
        }
        if (iinsElderRetreatCommunicate.getAge() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getAge, iinsElderRetreatCommunicate.getAge());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getBedInfo())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getBedInfo, iinsElderRetreatCommunicate.getBedInfo());
        }
        if (iinsElderRetreatCommunicate.getRetreatTime() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getRetreatTime, iinsElderRetreatCommunicate.getRetreatTime());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getRetreatType())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getRetreatType, iinsElderRetreatCommunicate.getRetreatType());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getRetreatMemo())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getRetreatMemo, iinsElderRetreatCommunicate.getRetreatMemo());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getHandledName())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getHandledName, iinsElderRetreatCommunicate.getHandledName());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getCommunicateMemo())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCommunicateMemo, iinsElderRetreatCommunicate.getCommunicateMemo());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getCommunicateResult())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCommunicateResult, iinsElderRetreatCommunicate.getCommunicateResult());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getCommunicateName())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCommunicateName, iinsElderRetreatCommunicate.getCommunicateName());
        }
        if (iinsElderRetreatCommunicate.getCommunicateTime() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCommunicateTime, iinsElderRetreatCommunicate.getCommunicateTime());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getAreaCode())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getAreaCode, iinsElderRetreatCommunicate.getAreaCode());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getAreaName())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getAreaName, iinsElderRetreatCommunicate.getAreaName());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getRemark())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getRemark, iinsElderRetreatCommunicate.getRemark());
        }
        if (iinsElderRetreatCommunicate.getCreateUser() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCreateUser, iinsElderRetreatCommunicate.getCreateUser());
        }
        if (StringUtil.isNotBlank(iinsElderRetreatCommunicate.getCreateName())) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCreateName, iinsElderRetreatCommunicate.getCreateName());
        }
        if (iinsElderRetreatCommunicate.getCreateDept() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCreateDept, iinsElderRetreatCommunicate.getCreateDept());
        }
        if (iinsElderRetreatCommunicate.getCreateTime() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getCreateTime, iinsElderRetreatCommunicate.getCreateTime());
        }
        if (iinsElderRetreatCommunicate.getUpdateUser() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getUpdateUser, iinsElderRetreatCommunicate.getUpdateUser());
        }
        if (iinsElderRetreatCommunicate.getUpdateTime() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getUpdateTime, iinsElderRetreatCommunicate.getUpdateTime());
        }
        if (iinsElderRetreatCommunicate.getIsDeleted() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getIsDeleted, iinsElderRetreatCommunicate.getIsDeleted());
        }
        if (iinsElderRetreatCommunicate.getStatus() != null) {
            chainWrapper.set(IinsElderRetreatCommunicate::getStatus, iinsElderRetreatCommunicate.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(IinsElderRetreatCommunicate::getId, iinsElderRetreatCommunicate.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(iinsElderRetreatCommunicate.getId());
        } else {
            return iinsElderRetreatCommunicate;
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
    public boolean saveIinsElderRetreatCommunicateBatch(List<IinsElderRetreatCommunicate> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (IinsElderRetreatCommunicate iinsElderRetreatCommunicate : insertList) {
            //使用默认的雪花算法生成
            iinsElderRetreatCommunicate.setId(null);
            //iinsElderRetreatCommunicate.setCreatedDt(currentDte);
            //iinsElderRetreatCommunicate.setUpdatedDt(currentDte);
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
    public Integer deleteIinsElderRetreatCommunicateBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<IinsElderRetreatCommunicate> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


