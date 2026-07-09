package cn.pluss.platform.service.insDonateInfo.impl;

import cn.pluss.platform.mapper.InsDonateInfoMapper;
import cn.pluss.platform.model.entity.InsDonateInfo;
import cn.pluss.platform.service.insDonateInfo.InsDonateInfoService;
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
@Service("insDonateInfoService")
public class InsDonateInfoServiceImpl extends ServiceImpl< InsDonateInfoMapper, InsDonateInfo> implements InsDonateInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsDonateInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsDonateInfo> queryPage(Map map) {
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
    public InsDonateInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insDonateInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsDonateInfo queryOne(InsDonateInfo insDonateInfo){
        LambdaQueryWrapper<InsDonateInfo> queryWrapper = getQueryWrapper(insDonateInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insDonateInfo
    * @return
    */
    @Override
    public List<InsDonateInfo> queryList(InsDonateInfo insDonateInfo) {
        LambdaQueryWrapper<InsDonateInfo> queryWrapper = getQueryWrapper(insDonateInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insDonateInfo
    * @return
    */
    public static LambdaQueryWrapper<InsDonateInfo> getQueryWrapper(InsDonateInfo insDonateInfo){
        LambdaQueryWrapper<InsDonateInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insDonateInfo.getId() != null) {
            queryWrapper.eq(InsDonateInfo::getId, insDonateInfo.getId());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getTenantId())) {
            queryWrapper.eq(InsDonateInfo::getTenantId, insDonateInfo.getTenantId());
        }
        if (insDonateInfo.getCorpId() != null) {
            queryWrapper.eq(InsDonateInfo::getCorpId, insDonateInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getCorpName())) {
            queryWrapper.eq(InsDonateInfo::getCorpName, insDonateInfo.getCorpName());
        }
        if (insDonateInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsDonateInfo::getInstitutionId, insDonateInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getInstitutionName())) {
            queryWrapper.eq(InsDonateInfo::getInstitutionName, insDonateInfo.getInstitutionName());
        }
        if (insDonateInfo.getDonateType() != null) {
            queryWrapper.eq(InsDonateInfo::getDonateType, insDonateInfo.getDonateType());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getDonateWay())) {
            queryWrapper.eq(InsDonateInfo::getDonateWay, insDonateInfo.getDonateWay());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getDonateName())) {
            queryWrapper.eq(InsDonateInfo::getDonateName, insDonateInfo.getDonateName());
        }
        if (insDonateInfo.getDonateAmount() != null) {
            queryWrapper.eq(InsDonateInfo::getDonateAmount, insDonateInfo.getDonateAmount());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getLinkTel())) {
            queryWrapper.eq(InsDonateInfo::getLinkTel, insDonateInfo.getLinkTel());
        }
        if (insDonateInfo.getDonateTime() != null) {
            queryWrapper.eq(InsDonateInfo::getDonateTime, insDonateInfo.getDonateTime());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getCardNo())) {
            queryWrapper.eq(InsDonateInfo::getCardNo, insDonateInfo.getCardNo());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getUsageDescribe())) {
            queryWrapper.eq(InsDonateInfo::getUsageDescribe, insDonateInfo.getUsageDescribe());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getRemark())) {
            queryWrapper.eq(InsDonateInfo::getRemark, insDonateInfo.getRemark());
        }
        if (insDonateInfo.getCreateUser() != null) {
            queryWrapper.eq(InsDonateInfo::getCreateUser, insDonateInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insDonateInfo.getCreateName())) {
            queryWrapper.eq(InsDonateInfo::getCreateName, insDonateInfo.getCreateName());
        }
        if (insDonateInfo.getCreateDept() != null) {
            queryWrapper.eq(InsDonateInfo::getCreateDept, insDonateInfo.getCreateDept());
        }
        if (insDonateInfo.getCreateTime() != null) {
            queryWrapper.eq(InsDonateInfo::getCreateTime, insDonateInfo.getCreateTime());
        }
        if (insDonateInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsDonateInfo::getUpdateUser, insDonateInfo.getUpdateUser());
        }
        if (insDonateInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsDonateInfo::getUpdateTime, insDonateInfo.getUpdateTime());
        }
        if (insDonateInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsDonateInfo::getIsDeleted, insDonateInfo.getIsDeleted());
        }
        if (insDonateInfo.getStatus() != null) {
            queryWrapper.eq(InsDonateInfo::getStatus, insDonateInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insDonateInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsDonateInfo insert(InsDonateInfo insDonateInfo) {
        insDonateInfo.setId(null);
        getBaseMapper().insert(insDonateInfo);
        return insDonateInfo;
    }

    /**
    * 更新数据
    *
    * @param insDonateInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsDonateInfo update(InsDonateInfo insDonateInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsDonateInfo> chainWrapper = new LambdaUpdateChainWrapper<InsDonateInfo>(getBaseMapper());
        if (insDonateInfo.getId() != null) {
            chainWrapper.set(InsDonateInfo::getId, insDonateInfo.getId());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getTenantId())) {
            chainWrapper.set(InsDonateInfo::getTenantId, insDonateInfo.getTenantId());
        }
        if (insDonateInfo.getCorpId() != null) {
            chainWrapper.set(InsDonateInfo::getCorpId, insDonateInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getCorpName())) {
            chainWrapper.set(InsDonateInfo::getCorpName, insDonateInfo.getCorpName());
        }
        if (insDonateInfo.getInstitutionId() != null) {
            chainWrapper.set(InsDonateInfo::getInstitutionId, insDonateInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getInstitutionName())) {
            chainWrapper.set(InsDonateInfo::getInstitutionName, insDonateInfo.getInstitutionName());
        }
        if (insDonateInfo.getDonateType() != null) {
            chainWrapper.set(InsDonateInfo::getDonateType, insDonateInfo.getDonateType());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getDonateWay())) {
            chainWrapper.set(InsDonateInfo::getDonateWay, insDonateInfo.getDonateWay());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getDonateName())) {
            chainWrapper.set(InsDonateInfo::getDonateName, insDonateInfo.getDonateName());
        }
        if (insDonateInfo.getDonateAmount() != null) {
            chainWrapper.set(InsDonateInfo::getDonateAmount, insDonateInfo.getDonateAmount());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getLinkTel())) {
            chainWrapper.set(InsDonateInfo::getLinkTel, insDonateInfo.getLinkTel());
        }
        if (insDonateInfo.getDonateTime() != null) {
            chainWrapper.set(InsDonateInfo::getDonateTime, insDonateInfo.getDonateTime());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getCardNo())) {
            chainWrapper.set(InsDonateInfo::getCardNo, insDonateInfo.getCardNo());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getUsageDescribe())) {
            chainWrapper.set(InsDonateInfo::getUsageDescribe, insDonateInfo.getUsageDescribe());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getRemark())) {
            chainWrapper.set(InsDonateInfo::getRemark, insDonateInfo.getRemark());
        }
        if (insDonateInfo.getCreateUser() != null) {
            chainWrapper.set(InsDonateInfo::getCreateUser, insDonateInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insDonateInfo.getCreateName())) {
            chainWrapper.set(InsDonateInfo::getCreateName, insDonateInfo.getCreateName());
        }
        if (insDonateInfo.getCreateDept() != null) {
            chainWrapper.set(InsDonateInfo::getCreateDept, insDonateInfo.getCreateDept());
        }
        if (insDonateInfo.getCreateTime() != null) {
            chainWrapper.set(InsDonateInfo::getCreateTime, insDonateInfo.getCreateTime());
        }
        if (insDonateInfo.getUpdateUser() != null) {
            chainWrapper.set(InsDonateInfo::getUpdateUser, insDonateInfo.getUpdateUser());
        }
        if (insDonateInfo.getUpdateTime() != null) {
            chainWrapper.set(InsDonateInfo::getUpdateTime, insDonateInfo.getUpdateTime());
        }
        if (insDonateInfo.getIsDeleted() != null) {
            chainWrapper.set(InsDonateInfo::getIsDeleted, insDonateInfo.getIsDeleted());
        }
        if (insDonateInfo.getStatus() != null) {
            chainWrapper.set(InsDonateInfo::getStatus, insDonateInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsDonateInfo::getId, insDonateInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insDonateInfo.getId());
        } else {
            return insDonateInfo;
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
    public boolean saveInsDonateInfoBatch(List<InsDonateInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsDonateInfo insDonateInfo : insertList) {
            //使用默认的雪花算法生成
            insDonateInfo.setId(null);
            //insDonateInfo.setCreatedDt(currentDte);
            //insDonateInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsDonateInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsDonateInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


