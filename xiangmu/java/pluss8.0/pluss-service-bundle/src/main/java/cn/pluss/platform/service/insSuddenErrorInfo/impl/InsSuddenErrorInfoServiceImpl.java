package cn.pluss.platform.service.insSuddenErrorInfo.impl;

import cn.pluss.platform.mapper.InsSuddenErrorInfoMapper;
import cn.pluss.platform.model.entity.InsSuddenErrorInfo;
import cn.pluss.platform.service.insSuddenErrorInfo.InsSuddenErrorInfoService;
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
@Service("insSuddenErrorInfoService")
public class InsSuddenErrorInfoServiceImpl extends ServiceImpl< InsSuddenErrorInfoMapper, InsSuddenErrorInfo> implements InsSuddenErrorInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsSuddenErrorInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSuddenErrorInfo> queryPage(Map map) {
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
    public InsSuddenErrorInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSuddenErrorInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsSuddenErrorInfo queryOne(InsSuddenErrorInfo insSuddenErrorInfo){
        LambdaQueryWrapper<InsSuddenErrorInfo> queryWrapper = getQueryWrapper(insSuddenErrorInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSuddenErrorInfo
    * @return
    */
    @Override
    public List<InsSuddenErrorInfo> queryList(InsSuddenErrorInfo insSuddenErrorInfo) {
        LambdaQueryWrapper<InsSuddenErrorInfo> queryWrapper = getQueryWrapper(insSuddenErrorInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSuddenErrorInfo
    * @return
    */
    public static LambdaQueryWrapper<InsSuddenErrorInfo> getQueryWrapper(InsSuddenErrorInfo insSuddenErrorInfo){
        LambdaQueryWrapper<InsSuddenErrorInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insSuddenErrorInfo.getId() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getId, insSuddenErrorInfo.getId());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getTenantId())) {
            queryWrapper.eq(InsSuddenErrorInfo::getTenantId, insSuddenErrorInfo.getTenantId());
        }
        if (insSuddenErrorInfo.getCorpId() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getCorpId, insSuddenErrorInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getCorpName())) {
            queryWrapper.eq(InsSuddenErrorInfo::getCorpName, insSuddenErrorInfo.getCorpName());
        }
        if (insSuddenErrorInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getInstitutionId, insSuddenErrorInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getInstitutionName())) {
            queryWrapper.eq(InsSuddenErrorInfo::getInstitutionName, insSuddenErrorInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getErrorType())) {
            queryWrapper.eq(InsSuddenErrorInfo::getErrorType, insSuddenErrorInfo.getErrorType());
        }
        if (insSuddenErrorInfo.getErrorDate() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getErrorDate, insSuddenErrorInfo.getErrorDate());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getErrorLocation())) {
            queryWrapper.eq(InsSuddenErrorInfo::getErrorLocation, insSuddenErrorInfo.getErrorLocation());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getErrorMemo())) {
            queryWrapper.eq(InsSuddenErrorInfo::getErrorMemo, insSuddenErrorInfo.getErrorMemo());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getErrorImagePath())) {
            queryWrapper.eq(InsSuddenErrorInfo::getErrorImagePath, insSuddenErrorInfo.getErrorImagePath());
        }
        if (insSuddenErrorInfo.getHandleState() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getHandleState, insSuddenErrorInfo.getHandleState());
        }
        if (insSuddenErrorInfo.getStaffId() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getStaffId, insSuddenErrorInfo.getStaffId());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getStaffName())) {
            queryWrapper.eq(InsSuddenErrorInfo::getStaffName, insSuddenErrorInfo.getStaffName());
        }
        if (insSuddenErrorInfo.getHandleTime() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getHandleTime, insSuddenErrorInfo.getHandleTime());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getHandleResults())) {
            queryWrapper.eq(InsSuddenErrorInfo::getHandleResults, insSuddenErrorInfo.getHandleResults());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getRemark())) {
            queryWrapper.eq(InsSuddenErrorInfo::getRemark, insSuddenErrorInfo.getRemark());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getAreaCode())) {
            queryWrapper.eq(InsSuddenErrorInfo::getAreaCode, insSuddenErrorInfo.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getAreaName())) {
            queryWrapper.eq(InsSuddenErrorInfo::getAreaName, insSuddenErrorInfo.getAreaName());
        }
        if (insSuddenErrorInfo.getCreateUser() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getCreateUser, insSuddenErrorInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSuddenErrorInfo.getCreateName())) {
            queryWrapper.eq(InsSuddenErrorInfo::getCreateName, insSuddenErrorInfo.getCreateName());
        }
        if (insSuddenErrorInfo.getCreateDept() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getCreateDept, insSuddenErrorInfo.getCreateDept());
        }
        if (insSuddenErrorInfo.getCreateTime() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getCreateTime, insSuddenErrorInfo.getCreateTime());
        }
        if (insSuddenErrorInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getUpdateUser, insSuddenErrorInfo.getUpdateUser());
        }
        if (insSuddenErrorInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getUpdateTime, insSuddenErrorInfo.getUpdateTime());
        }
        if (insSuddenErrorInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getIsDeleted, insSuddenErrorInfo.getIsDeleted());
        }
        if (insSuddenErrorInfo.getStatus() != null) {
            queryWrapper.eq(InsSuddenErrorInfo::getStatus, insSuddenErrorInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSuddenErrorInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenErrorInfo insert(InsSuddenErrorInfo insSuddenErrorInfo) {
        insSuddenErrorInfo.setId(null);
        getBaseMapper().insert(insSuddenErrorInfo);
        return insSuddenErrorInfo;
    }

    /**
    * 更新数据
    *
    * @param insSuddenErrorInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenErrorInfo update(InsSuddenErrorInfo insSuddenErrorInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSuddenErrorInfo> chainWrapper = new LambdaUpdateChainWrapper<InsSuddenErrorInfo>(getBaseMapper());
        if (insSuddenErrorInfo.getId() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getId, insSuddenErrorInfo.getId());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getTenantId())) {
            chainWrapper.set(InsSuddenErrorInfo::getTenantId, insSuddenErrorInfo.getTenantId());
        }
        if (insSuddenErrorInfo.getCorpId() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getCorpId, insSuddenErrorInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getCorpName())) {
            chainWrapper.set(InsSuddenErrorInfo::getCorpName, insSuddenErrorInfo.getCorpName());
        }
        if (insSuddenErrorInfo.getInstitutionId() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getInstitutionId, insSuddenErrorInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getInstitutionName())) {
            chainWrapper.set(InsSuddenErrorInfo::getInstitutionName, insSuddenErrorInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getErrorType())) {
            chainWrapper.set(InsSuddenErrorInfo::getErrorType, insSuddenErrorInfo.getErrorType());
        }
        if (insSuddenErrorInfo.getErrorDate() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getErrorDate, insSuddenErrorInfo.getErrorDate());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getErrorLocation())) {
            chainWrapper.set(InsSuddenErrorInfo::getErrorLocation, insSuddenErrorInfo.getErrorLocation());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getErrorMemo())) {
            chainWrapper.set(InsSuddenErrorInfo::getErrorMemo, insSuddenErrorInfo.getErrorMemo());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getErrorImagePath())) {
            chainWrapper.set(InsSuddenErrorInfo::getErrorImagePath, insSuddenErrorInfo.getErrorImagePath());
        }
        if (insSuddenErrorInfo.getHandleState() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getHandleState, insSuddenErrorInfo.getHandleState());
        }
        if (insSuddenErrorInfo.getStaffId() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getStaffId, insSuddenErrorInfo.getStaffId());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getStaffName())) {
            chainWrapper.set(InsSuddenErrorInfo::getStaffName, insSuddenErrorInfo.getStaffName());
        }
        if (insSuddenErrorInfo.getHandleTime() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getHandleTime, insSuddenErrorInfo.getHandleTime());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getHandleResults())) {
            chainWrapper.set(InsSuddenErrorInfo::getHandleResults, insSuddenErrorInfo.getHandleResults());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getRemark())) {
            chainWrapper.set(InsSuddenErrorInfo::getRemark, insSuddenErrorInfo.getRemark());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getAreaCode())) {
            chainWrapper.set(InsSuddenErrorInfo::getAreaCode, insSuddenErrorInfo.getAreaCode());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getAreaName())) {
            chainWrapper.set(InsSuddenErrorInfo::getAreaName, insSuddenErrorInfo.getAreaName());
        }
        if (insSuddenErrorInfo.getCreateUser() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getCreateUser, insSuddenErrorInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSuddenErrorInfo.getCreateName())) {
            chainWrapper.set(InsSuddenErrorInfo::getCreateName, insSuddenErrorInfo.getCreateName());
        }
        if (insSuddenErrorInfo.getCreateDept() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getCreateDept, insSuddenErrorInfo.getCreateDept());
        }
        if (insSuddenErrorInfo.getCreateTime() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getCreateTime, insSuddenErrorInfo.getCreateTime());
        }
        if (insSuddenErrorInfo.getUpdateUser() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getUpdateUser, insSuddenErrorInfo.getUpdateUser());
        }
        if (insSuddenErrorInfo.getUpdateTime() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getUpdateTime, insSuddenErrorInfo.getUpdateTime());
        }
        if (insSuddenErrorInfo.getIsDeleted() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getIsDeleted, insSuddenErrorInfo.getIsDeleted());
        }
        if (insSuddenErrorInfo.getStatus() != null) {
            chainWrapper.set(InsSuddenErrorInfo::getStatus, insSuddenErrorInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSuddenErrorInfo::getId, insSuddenErrorInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSuddenErrorInfo.getId());
        } else {
            return insSuddenErrorInfo;
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
    public boolean saveInsSuddenErrorInfoBatch(List<InsSuddenErrorInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSuddenErrorInfo insSuddenErrorInfo : insertList) {
            //使用默认的雪花算法生成
            insSuddenErrorInfo.setId(null);
            //insSuddenErrorInfo.setCreatedDt(currentDte);
            //insSuddenErrorInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsSuddenErrorInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSuddenErrorInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


