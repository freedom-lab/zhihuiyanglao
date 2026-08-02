package cn.pluss.platform.service.insElderRetreatInfo.impl;

import cn.pluss.platform.mapper.InsElderRetreatInfoMapper;
import cn.pluss.platform.model.dto.HealthDto;
import cn.pluss.platform.model.entity.InsElderRetreatInfo;
import cn.pluss.platform.service.insElderRetreatInfo.InsElderRetreatInfoService;
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
@Service("insElderRetreatInfoService")
public class InsElderRetreatInfoServiceImpl extends ServiceImpl< InsElderRetreatInfoMapper, InsElderRetreatInfo> implements InsElderRetreatInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderRetreatInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderRetreatInfo> queryPage(Map map) {
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
    public InsElderRetreatInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderRetreatInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderRetreatInfo queryOne(InsElderRetreatInfo insElderRetreatInfo){
        LambdaQueryWrapper<InsElderRetreatInfo> queryWrapper = getQueryWrapper(insElderRetreatInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderRetreatInfo
    * @return
    */
    @Override
    public List<InsElderRetreatInfo> queryList(InsElderRetreatInfo insElderRetreatInfo) {
        LambdaQueryWrapper<InsElderRetreatInfo> queryWrapper = getQueryWrapper(insElderRetreatInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderRetreatInfo
    * @return
    */
    public static LambdaQueryWrapper<InsElderRetreatInfo> getQueryWrapper(InsElderRetreatInfo insElderRetreatInfo){
        LambdaQueryWrapper<InsElderRetreatInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderRetreatInfo.getId() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getId, insElderRetreatInfo.getId());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getTenantId())) {
            queryWrapper.eq(InsElderRetreatInfo::getTenantId, insElderRetreatInfo.getTenantId());
        }
        if (insElderRetreatInfo.getCorpId() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getCorpId, insElderRetreatInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getCorpName())) {
            queryWrapper.eq(InsElderRetreatInfo::getCorpName, insElderRetreatInfo.getCorpName());
        }
        if (insElderRetreatInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getInstitutionId, insElderRetreatInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getInstitutionName())) {
            queryWrapper.eq(InsElderRetreatInfo::getInstitutionName, insElderRetreatInfo.getInstitutionName());
        }
        if (insElderRetreatInfo.getCheckId() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getCheckId, insElderRetreatInfo.getCheckId());
        }
        if (insElderRetreatInfo.getCheckDate() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getCheckDate, insElderRetreatInfo.getCheckDate());
        }
        if (insElderRetreatInfo.getCheckState() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getCheckState, insElderRetreatInfo.getCheckState());
        }
        if (insElderRetreatInfo.getElderId() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getElderId, insElderRetreatInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getElderName())) {
            queryWrapper.eq(InsElderRetreatInfo::getElderName, insElderRetreatInfo.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getIdCard())) {
            queryWrapper.eq(InsElderRetreatInfo::getIdCard, insElderRetreatInfo.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getSex())) {
            queryWrapper.eq(InsElderRetreatInfo::getSex, insElderRetreatInfo.getSex());
        }
        if (insElderRetreatInfo.getAge() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getAge, insElderRetreatInfo.getAge());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getBedInfo())) {
            queryWrapper.eq(InsElderRetreatInfo::getBedInfo, insElderRetreatInfo.getBedInfo());
        }
        if (insElderRetreatInfo.getRetreatTime() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getRetreatTime, insElderRetreatInfo.getRetreatTime());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getRetreatType())) {
            queryWrapper.eq(InsElderRetreatInfo::getRetreatType, insElderRetreatInfo.getRetreatType());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getRetreatMemo())) {
            queryWrapper.eq(InsElderRetreatInfo::getRetreatMemo, insElderRetreatInfo.getRetreatMemo());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getHandledName())) {
            queryWrapper.eq(InsElderRetreatInfo::getHandledName, insElderRetreatInfo.getHandledName());
        }
        if (insElderRetreatInfo.getAuditState() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getAuditState, insElderRetreatInfo.getAuditState());
        }
        if (insElderRetreatInfo.getAuditId() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getAuditId, insElderRetreatInfo.getAuditId());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getAuditName())) {
            queryWrapper.eq(InsElderRetreatInfo::getAuditName, insElderRetreatInfo.getAuditName());
        }
        if (insElderRetreatInfo.getAuditTime() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getAuditTime, insElderRetreatInfo.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getAuditMemo())) {
            queryWrapper.eq(InsElderRetreatInfo::getAuditMemo, insElderRetreatInfo.getAuditMemo());
        }
        if (insElderRetreatInfo.getIsCalculate() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getIsCalculate, insElderRetreatInfo.getIsCalculate());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getAreaCode())) {
            queryWrapper.eq(InsElderRetreatInfo::getAreaCode, insElderRetreatInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getAreaName())) {
            queryWrapper.eq(InsElderRetreatInfo::getAreaName, insElderRetreatInfo.getAreaName());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getRemark())) {
            queryWrapper.eq(InsElderRetreatInfo::getRemark, insElderRetreatInfo.getRemark());
        }
        if (insElderRetreatInfo.getCreateUser() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getCreateUser, insElderRetreatInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderRetreatInfo.getCreateName())) {
            queryWrapper.eq(InsElderRetreatInfo::getCreateName, insElderRetreatInfo.getCreateName());
        }
        if (insElderRetreatInfo.getCreateDept() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getCreateDept, insElderRetreatInfo.getCreateDept());
        }
        if (insElderRetreatInfo.getCreateTime() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getCreateTime, insElderRetreatInfo.getCreateTime());
        }
        if (insElderRetreatInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getUpdateUser, insElderRetreatInfo.getUpdateUser());
        }
        if (insElderRetreatInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getUpdateTime, insElderRetreatInfo.getUpdateTime());
        }
        if (insElderRetreatInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getIsDeleted, insElderRetreatInfo.getIsDeleted());
        }
        if (insElderRetreatInfo.getStatus() != null) {
            queryWrapper.eq(InsElderRetreatInfo::getStatus, insElderRetreatInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderRetreatInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderRetreatInfo insert(InsElderRetreatInfo insElderRetreatInfo) {
        insElderRetreatInfo.setId(null);
        getBaseMapper().insert(insElderRetreatInfo);
        return insElderRetreatInfo;
    }

    /**
    * 更新数据
    *
    * @param insElderRetreatInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderRetreatInfo update(InsElderRetreatInfo insElderRetreatInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderRetreatInfo> chainWrapper = new LambdaUpdateChainWrapper<InsElderRetreatInfo>(getBaseMapper());
        if (insElderRetreatInfo.getId() != null) {
            chainWrapper.set(InsElderRetreatInfo::getId, insElderRetreatInfo.getId());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getTenantId())) {
            chainWrapper.set(InsElderRetreatInfo::getTenantId, insElderRetreatInfo.getTenantId());
        }
        if (insElderRetreatInfo.getCorpId() != null) {
            chainWrapper.set(InsElderRetreatInfo::getCorpId, insElderRetreatInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getCorpName())) {
            chainWrapper.set(InsElderRetreatInfo::getCorpName, insElderRetreatInfo.getCorpName());
        }
        if (insElderRetreatInfo.getInstitutionId() != null) {
            chainWrapper.set(InsElderRetreatInfo::getInstitutionId, insElderRetreatInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getInstitutionName())) {
            chainWrapper.set(InsElderRetreatInfo::getInstitutionName, insElderRetreatInfo.getInstitutionName());
        }
        if (insElderRetreatInfo.getCheckId() != null) {
            chainWrapper.set(InsElderRetreatInfo::getCheckId, insElderRetreatInfo.getCheckId());
        }
        if (insElderRetreatInfo.getCheckDate() != null) {
            chainWrapper.set(InsElderRetreatInfo::getCheckDate, insElderRetreatInfo.getCheckDate());
        }
        if (insElderRetreatInfo.getCheckState() != null) {
            chainWrapper.set(InsElderRetreatInfo::getCheckState, insElderRetreatInfo.getCheckState());
        }
        if (insElderRetreatInfo.getElderId() != null) {
            chainWrapper.set(InsElderRetreatInfo::getElderId, insElderRetreatInfo.getElderId());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getElderName())) {
            chainWrapper.set(InsElderRetreatInfo::getElderName, insElderRetreatInfo.getElderName());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getIdCard())) {
            chainWrapper.set(InsElderRetreatInfo::getIdCard, insElderRetreatInfo.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getSex())) {
            chainWrapper.set(InsElderRetreatInfo::getSex, insElderRetreatInfo.getSex());
        }
        if (insElderRetreatInfo.getAge() != null) {
            chainWrapper.set(InsElderRetreatInfo::getAge, insElderRetreatInfo.getAge());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getBedInfo())) {
            chainWrapper.set(InsElderRetreatInfo::getBedInfo, insElderRetreatInfo.getBedInfo());
        }
        if (insElderRetreatInfo.getRetreatTime() != null) {
            chainWrapper.set(InsElderRetreatInfo::getRetreatTime, insElderRetreatInfo.getRetreatTime());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getRetreatType())) {
            chainWrapper.set(InsElderRetreatInfo::getRetreatType, insElderRetreatInfo.getRetreatType());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getRetreatMemo())) {
            chainWrapper.set(InsElderRetreatInfo::getRetreatMemo, insElderRetreatInfo.getRetreatMemo());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getHandledName())) {
            chainWrapper.set(InsElderRetreatInfo::getHandledName, insElderRetreatInfo.getHandledName());
        }
        if (insElderRetreatInfo.getAuditState() != null) {
            chainWrapper.set(InsElderRetreatInfo::getAuditState, insElderRetreatInfo.getAuditState());
        }
        if (insElderRetreatInfo.getAuditId() != null) {
            chainWrapper.set(InsElderRetreatInfo::getAuditId, insElderRetreatInfo.getAuditId());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getAuditName())) {
            chainWrapper.set(InsElderRetreatInfo::getAuditName, insElderRetreatInfo.getAuditName());
        }
        if (insElderRetreatInfo.getAuditTime() != null) {
            chainWrapper.set(InsElderRetreatInfo::getAuditTime, insElderRetreatInfo.getAuditTime());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getAuditMemo())) {
            chainWrapper.set(InsElderRetreatInfo::getAuditMemo, insElderRetreatInfo.getAuditMemo());
        }
        if (insElderRetreatInfo.getIsCalculate() != null) {
            chainWrapper.set(InsElderRetreatInfo::getIsCalculate, insElderRetreatInfo.getIsCalculate());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getAreaCode())) {
            chainWrapper.set(InsElderRetreatInfo::getAreaCode, insElderRetreatInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getAreaName())) {
            chainWrapper.set(InsElderRetreatInfo::getAreaName, insElderRetreatInfo.getAreaName());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getRemark())) {
            chainWrapper.set(InsElderRetreatInfo::getRemark, insElderRetreatInfo.getRemark());
        }
        if (insElderRetreatInfo.getCreateUser() != null) {
            chainWrapper.set(InsElderRetreatInfo::getCreateUser, insElderRetreatInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderRetreatInfo.getCreateName())) {
            chainWrapper.set(InsElderRetreatInfo::getCreateName, insElderRetreatInfo.getCreateName());
        }
        if (insElderRetreatInfo.getCreateDept() != null) {
            chainWrapper.set(InsElderRetreatInfo::getCreateDept, insElderRetreatInfo.getCreateDept());
        }
        if (insElderRetreatInfo.getCreateTime() != null) {
            chainWrapper.set(InsElderRetreatInfo::getCreateTime, insElderRetreatInfo.getCreateTime());
        }
        if (insElderRetreatInfo.getUpdateUser() != null) {
            chainWrapper.set(InsElderRetreatInfo::getUpdateUser, insElderRetreatInfo.getUpdateUser());
        }
        if (insElderRetreatInfo.getUpdateTime() != null) {
            chainWrapper.set(InsElderRetreatInfo::getUpdateTime, insElderRetreatInfo.getUpdateTime());
        }
        if (insElderRetreatInfo.getIsDeleted() != null) {
            chainWrapper.set(InsElderRetreatInfo::getIsDeleted, insElderRetreatInfo.getIsDeleted());
        }
        if (insElderRetreatInfo.getStatus() != null) {
            chainWrapper.set(InsElderRetreatInfo::getStatus, insElderRetreatInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderRetreatInfo::getId, insElderRetreatInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderRetreatInfo.getId());
        } else {
            return insElderRetreatInfo;
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
    public boolean saveInsElderRetreatInfoBatch(List<InsElderRetreatInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderRetreatInfo insElderRetreatInfo : insertList) {
            //使用默认的雪花算法生成
            insElderRetreatInfo.setId(null);
            //insElderRetreatInfo.setCreatedDt(currentDte);
            //insElderRetreatInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderRetreatInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderRetreatInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }


}


