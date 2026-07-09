package cn.pluss.platform.service.insSuddenRepairInfo.impl;

import cn.pluss.platform.mapper.InsSuddenRepairInfoMapper;
import cn.pluss.platform.model.entity.InsSuddenRepairInfo;
import cn.pluss.platform.service.insSuddenRepairInfo.InsSuddenRepairInfoService;
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
@Service("insSuddenRepairInfoService")
public class InsSuddenRepairInfoServiceImpl extends ServiceImpl< InsSuddenRepairInfoMapper, InsSuddenRepairInfo> implements InsSuddenRepairInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsSuddenRepairInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSuddenRepairInfo> queryPage(Map map) {
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
    public InsSuddenRepairInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSuddenRepairInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsSuddenRepairInfo queryOne(InsSuddenRepairInfo insSuddenRepairInfo){
        LambdaQueryWrapper<InsSuddenRepairInfo> queryWrapper = getQueryWrapper(insSuddenRepairInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSuddenRepairInfo
    * @return
    */
    @Override
    public List<InsSuddenRepairInfo> queryList(InsSuddenRepairInfo insSuddenRepairInfo) {
        LambdaQueryWrapper<InsSuddenRepairInfo> queryWrapper = getQueryWrapper(insSuddenRepairInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSuddenRepairInfo
    * @return
    */
    public static LambdaQueryWrapper<InsSuddenRepairInfo> getQueryWrapper(InsSuddenRepairInfo insSuddenRepairInfo){
        LambdaQueryWrapper<InsSuddenRepairInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insSuddenRepairInfo.getId() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getId, insSuddenRepairInfo.getId());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getTenantId())) {
            queryWrapper.eq(InsSuddenRepairInfo::getTenantId, insSuddenRepairInfo.getTenantId());
        }
        if (insSuddenRepairInfo.getCorpId() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getCorpId, insSuddenRepairInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getCorpName())) {
            queryWrapper.eq(InsSuddenRepairInfo::getCorpName, insSuddenRepairInfo.getCorpName());
        }
        if (insSuddenRepairInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getInstitutionId, insSuddenRepairInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getInstitutionName())) {
            queryWrapper.eq(InsSuddenRepairInfo::getInstitutionName, insSuddenRepairInfo.getInstitutionName());
        }
        if (insSuddenRepairInfo.getRepairTime() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getRepairTime, insSuddenRepairInfo.getRepairTime());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getRepairCode())) {
            queryWrapper.eq(InsSuddenRepairInfo::getRepairCode, insSuddenRepairInfo.getRepairCode());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getRepairType())) {
            queryWrapper.eq(InsSuddenRepairInfo::getRepairType, insSuddenRepairInfo.getRepairType());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getRepairPlace())) {
            queryWrapper.eq(InsSuddenRepairInfo::getRepairPlace, insSuddenRepairInfo.getRepairPlace());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getRepairMemo())) {
            queryWrapper.eq(InsSuddenRepairInfo::getRepairMemo, insSuddenRepairInfo.getRepairMemo());
        }
        if (insSuddenRepairInfo.getRepairLevel() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getRepairLevel, insSuddenRepairInfo.getRepairLevel());
        }
        if (insSuddenRepairInfo.getRepairId() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getRepairId, insSuddenRepairInfo.getRepairId());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getRepairName())) {
            queryWrapper.eq(InsSuddenRepairInfo::getRepairName, insSuddenRepairInfo.getRepairName());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getRepairImgPath())) {
            queryWrapper.eq(InsSuddenRepairInfo::getRepairImgPath, insSuddenRepairInfo.getRepairImgPath());
        }
        if (insSuddenRepairInfo.getHandleState() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getHandleState, insSuddenRepairInfo.getHandleState());
        }
        if (insSuddenRepairInfo.getHandleId() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getHandleId, insSuddenRepairInfo.getHandleId());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getHandleName())) {
            queryWrapper.eq(InsSuddenRepairInfo::getHandleName, insSuddenRepairInfo.getHandleName());
        }
        if (insSuddenRepairInfo.getHandleTime() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getHandleTime, insSuddenRepairInfo.getHandleTime());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getHandleMemo())) {
            queryWrapper.eq(InsSuddenRepairInfo::getHandleMemo, insSuddenRepairInfo.getHandleMemo());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getHandleImg())) {
            queryWrapper.eq(InsSuddenRepairInfo::getHandleImg, insSuddenRepairInfo.getHandleImg());
        }
        if (insSuddenRepairInfo.getConfirmState() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getConfirmState, insSuddenRepairInfo.getConfirmState());
        }
        if (insSuddenRepairInfo.getConfirmTime() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getConfirmTime, insSuddenRepairInfo.getConfirmTime());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getDuration())) {
            queryWrapper.eq(InsSuddenRepairInfo::getDuration, insSuddenRepairInfo.getDuration());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getRemark())) {
            queryWrapper.eq(InsSuddenRepairInfo::getRemark, insSuddenRepairInfo.getRemark());
        }
        if (insSuddenRepairInfo.getCreateUser() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getCreateUser, insSuddenRepairInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSuddenRepairInfo.getCreateName())) {
            queryWrapper.eq(InsSuddenRepairInfo::getCreateName, insSuddenRepairInfo.getCreateName());
        }
        if (insSuddenRepairInfo.getCreateDept() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getCreateDept, insSuddenRepairInfo.getCreateDept());
        }
        if (insSuddenRepairInfo.getCreateTime() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getCreateTime, insSuddenRepairInfo.getCreateTime());
        }
        if (insSuddenRepairInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getUpdateUser, insSuddenRepairInfo.getUpdateUser());
        }
        if (insSuddenRepairInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getUpdateTime, insSuddenRepairInfo.getUpdateTime());
        }
        if (insSuddenRepairInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getIsDeleted, insSuddenRepairInfo.getIsDeleted());
        }
        if (insSuddenRepairInfo.getStatus() != null) {
            queryWrapper.eq(InsSuddenRepairInfo::getStatus, insSuddenRepairInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSuddenRepairInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenRepairInfo insert(InsSuddenRepairInfo insSuddenRepairInfo) {
        insSuddenRepairInfo.setId(null);
        getBaseMapper().insert(insSuddenRepairInfo);
        return insSuddenRepairInfo;
    }

    /**
    * 更新数据
    *
    * @param insSuddenRepairInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenRepairInfo update(InsSuddenRepairInfo insSuddenRepairInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSuddenRepairInfo> chainWrapper = new LambdaUpdateChainWrapper<InsSuddenRepairInfo>(getBaseMapper());
        if (insSuddenRepairInfo.getId() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getId, insSuddenRepairInfo.getId());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getTenantId())) {
            chainWrapper.set(InsSuddenRepairInfo::getTenantId, insSuddenRepairInfo.getTenantId());
        }
        if (insSuddenRepairInfo.getCorpId() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getCorpId, insSuddenRepairInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getCorpName())) {
            chainWrapper.set(InsSuddenRepairInfo::getCorpName, insSuddenRepairInfo.getCorpName());
        }
        if (insSuddenRepairInfo.getInstitutionId() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getInstitutionId, insSuddenRepairInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getInstitutionName())) {
            chainWrapper.set(InsSuddenRepairInfo::getInstitutionName, insSuddenRepairInfo.getInstitutionName());
        }
        if (insSuddenRepairInfo.getRepairTime() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getRepairTime, insSuddenRepairInfo.getRepairTime());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getRepairCode())) {
            chainWrapper.set(InsSuddenRepairInfo::getRepairCode, insSuddenRepairInfo.getRepairCode());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getRepairType())) {
            chainWrapper.set(InsSuddenRepairInfo::getRepairType, insSuddenRepairInfo.getRepairType());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getRepairPlace())) {
            chainWrapper.set(InsSuddenRepairInfo::getRepairPlace, insSuddenRepairInfo.getRepairPlace());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getRepairMemo())) {
            chainWrapper.set(InsSuddenRepairInfo::getRepairMemo, insSuddenRepairInfo.getRepairMemo());
        }
        if (insSuddenRepairInfo.getRepairLevel() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getRepairLevel, insSuddenRepairInfo.getRepairLevel());
        }
        if (insSuddenRepairInfo.getRepairId() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getRepairId, insSuddenRepairInfo.getRepairId());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getRepairName())) {
            chainWrapper.set(InsSuddenRepairInfo::getRepairName, insSuddenRepairInfo.getRepairName());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getRepairImgPath())) {
            chainWrapper.set(InsSuddenRepairInfo::getRepairImgPath, insSuddenRepairInfo.getRepairImgPath());
        }
        if (insSuddenRepairInfo.getHandleState() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getHandleState, insSuddenRepairInfo.getHandleState());
        }
        if (insSuddenRepairInfo.getHandleId() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getHandleId, insSuddenRepairInfo.getHandleId());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getHandleName())) {
            chainWrapper.set(InsSuddenRepairInfo::getHandleName, insSuddenRepairInfo.getHandleName());
        }
        if (insSuddenRepairInfo.getHandleTime() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getHandleTime, insSuddenRepairInfo.getHandleTime());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getHandleMemo())) {
            chainWrapper.set(InsSuddenRepairInfo::getHandleMemo, insSuddenRepairInfo.getHandleMemo());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getHandleImg())) {
            chainWrapper.set(InsSuddenRepairInfo::getHandleImg, insSuddenRepairInfo.getHandleImg());
        }
        if (insSuddenRepairInfo.getConfirmState() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getConfirmState, insSuddenRepairInfo.getConfirmState());
        }
        if (insSuddenRepairInfo.getConfirmTime() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getConfirmTime, insSuddenRepairInfo.getConfirmTime());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getDuration())) {
            chainWrapper.set(InsSuddenRepairInfo::getDuration, insSuddenRepairInfo.getDuration());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getRemark())) {
            chainWrapper.set(InsSuddenRepairInfo::getRemark, insSuddenRepairInfo.getRemark());
        }
        if (insSuddenRepairInfo.getCreateUser() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getCreateUser, insSuddenRepairInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSuddenRepairInfo.getCreateName())) {
            chainWrapper.set(InsSuddenRepairInfo::getCreateName, insSuddenRepairInfo.getCreateName());
        }
        if (insSuddenRepairInfo.getCreateDept() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getCreateDept, insSuddenRepairInfo.getCreateDept());
        }
        if (insSuddenRepairInfo.getCreateTime() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getCreateTime, insSuddenRepairInfo.getCreateTime());
        }
        if (insSuddenRepairInfo.getUpdateUser() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getUpdateUser, insSuddenRepairInfo.getUpdateUser());
        }
        if (insSuddenRepairInfo.getUpdateTime() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getUpdateTime, insSuddenRepairInfo.getUpdateTime());
        }
        if (insSuddenRepairInfo.getIsDeleted() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getIsDeleted, insSuddenRepairInfo.getIsDeleted());
        }
        if (insSuddenRepairInfo.getStatus() != null) {
            chainWrapper.set(InsSuddenRepairInfo::getStatus, insSuddenRepairInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSuddenRepairInfo::getId, insSuddenRepairInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSuddenRepairInfo.getId());
        } else {
            return insSuddenRepairInfo;
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
    public boolean saveInsSuddenRepairInfoBatch(List<InsSuddenRepairInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSuddenRepairInfo insSuddenRepairInfo : insertList) {
            //使用默认的雪花算法生成
            insSuddenRepairInfo.setId(null);
            //insSuddenRepairInfo.setCreatedDt(currentDte);
            //insSuddenRepairInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsSuddenRepairInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSuddenRepairInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


