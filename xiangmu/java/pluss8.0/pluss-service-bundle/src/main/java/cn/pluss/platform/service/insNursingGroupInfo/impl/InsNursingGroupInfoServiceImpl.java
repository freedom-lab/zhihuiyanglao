package cn.pluss.platform.service.insNursingGroupInfo.impl;

import cn.pluss.platform.mapper.InsNursingGroupInfoMapper;
import cn.pluss.platform.model.entity.InsNursingGroupInfo;
import cn.pluss.platform.service.insNursingGroupInfo.InsNursingGroupInfoService;
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
@Service("insNursingGroupInfoService")
public class InsNursingGroupInfoServiceImpl extends ServiceImpl< InsNursingGroupInfoMapper, InsNursingGroupInfo> implements InsNursingGroupInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingGroupInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingGroupInfo> queryPage(Map map) {
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
    public InsNursingGroupInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingGroupInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingGroupInfo queryOne(InsNursingGroupInfo insNursingGroupInfo){
        LambdaQueryWrapper<InsNursingGroupInfo> queryWrapper = getQueryWrapper(insNursingGroupInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingGroupInfo
    * @return
    */
    @Override
    public List<InsNursingGroupInfo> queryList(InsNursingGroupInfo insNursingGroupInfo) {
        LambdaQueryWrapper<InsNursingGroupInfo> queryWrapper = getQueryWrapper(insNursingGroupInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingGroupInfo
    * @return
    */
    public static LambdaQueryWrapper<InsNursingGroupInfo> getQueryWrapper(InsNursingGroupInfo insNursingGroupInfo){
        LambdaQueryWrapper<InsNursingGroupInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingGroupInfo.getId() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getId, insNursingGroupInfo.getId());
        }
        if (StringUtil.isNotEmpty(insNursingGroupInfo.getTenantId())) {
            queryWrapper.eq(InsNursingGroupInfo::getTenantId, insNursingGroupInfo.getTenantId());
        }
        if (insNursingGroupInfo.getCorpId() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getCorpId, insNursingGroupInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingGroupInfo.getCorpName())) {
            queryWrapper.eq(InsNursingGroupInfo::getCorpName, insNursingGroupInfo.getCorpName());
        }
        if (insNursingGroupInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getInstitutionId, insNursingGroupInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingGroupInfo.getInstitutionName())) {
            queryWrapper.eq(InsNursingGroupInfo::getInstitutionName, insNursingGroupInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insNursingGroupInfo.getGroupName())) {
            queryWrapper.eq(InsNursingGroupInfo::getGroupName, insNursingGroupInfo.getGroupName());
        }
        if (insNursingGroupInfo.getGroupLeaderId() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getGroupLeaderId, insNursingGroupInfo.getGroupLeaderId());
        }
        if (StringUtil.isNotEmpty(insNursingGroupInfo.getGroupLeaderName())) {
            queryWrapper.eq(InsNursingGroupInfo::getGroupLeaderName, insNursingGroupInfo.getGroupLeaderName());
        }
        if (StringUtil.isNotEmpty(insNursingGroupInfo.getRemark())) {
            queryWrapper.eq(InsNursingGroupInfo::getRemark, insNursingGroupInfo.getRemark());
        }
        if (insNursingGroupInfo.getCreateUser() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getCreateUser, insNursingGroupInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingGroupInfo.getCreateName())) {
            queryWrapper.eq(InsNursingGroupInfo::getCreateName, insNursingGroupInfo.getCreateName());
        }
        if (insNursingGroupInfo.getCreateDept() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getCreateDept, insNursingGroupInfo.getCreateDept());
        }
        if (insNursingGroupInfo.getCreateTime() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getCreateTime, insNursingGroupInfo.getCreateTime());
        }
        if (insNursingGroupInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getUpdateUser, insNursingGroupInfo.getUpdateUser());
        }
        if (insNursingGroupInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getUpdateTime, insNursingGroupInfo.getUpdateTime());
        }
        if (insNursingGroupInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getIsDeleted, insNursingGroupInfo.getIsDeleted());
        }
        if (insNursingGroupInfo.getStatus() != null) {
            queryWrapper.eq(InsNursingGroupInfo::getStatus, insNursingGroupInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingGroupInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingGroupInfo insert(InsNursingGroupInfo insNursingGroupInfo) {
        insNursingGroupInfo.setId(null);
        getBaseMapper().insert(insNursingGroupInfo);
        return insNursingGroupInfo;
    }

    /**
    * 更新数据
    *
    * @param insNursingGroupInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingGroupInfo update(InsNursingGroupInfo insNursingGroupInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingGroupInfo> chainWrapper = new LambdaUpdateChainWrapper<InsNursingGroupInfo>(getBaseMapper());
        if (insNursingGroupInfo.getId() != null) {
            chainWrapper.set(InsNursingGroupInfo::getId, insNursingGroupInfo.getId());
        }
        if (StringUtil.isNotBlank(insNursingGroupInfo.getTenantId())) {
            chainWrapper.set(InsNursingGroupInfo::getTenantId, insNursingGroupInfo.getTenantId());
        }
        if (insNursingGroupInfo.getCorpId() != null) {
            chainWrapper.set(InsNursingGroupInfo::getCorpId, insNursingGroupInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingGroupInfo.getCorpName())) {
            chainWrapper.set(InsNursingGroupInfo::getCorpName, insNursingGroupInfo.getCorpName());
        }
        if (insNursingGroupInfo.getInstitutionId() != null) {
            chainWrapper.set(InsNursingGroupInfo::getInstitutionId, insNursingGroupInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingGroupInfo.getInstitutionName())) {
            chainWrapper.set(InsNursingGroupInfo::getInstitutionName, insNursingGroupInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insNursingGroupInfo.getGroupName())) {
            chainWrapper.set(InsNursingGroupInfo::getGroupName, insNursingGroupInfo.getGroupName());
        }
        if (insNursingGroupInfo.getGroupLeaderId() != null) {
            chainWrapper.set(InsNursingGroupInfo::getGroupLeaderId, insNursingGroupInfo.getGroupLeaderId());
        }
        if (StringUtil.isNotBlank(insNursingGroupInfo.getGroupLeaderName())) {
            chainWrapper.set(InsNursingGroupInfo::getGroupLeaderName, insNursingGroupInfo.getGroupLeaderName());
        }
        if (StringUtil.isNotBlank(insNursingGroupInfo.getRemark())) {
            chainWrapper.set(InsNursingGroupInfo::getRemark, insNursingGroupInfo.getRemark());
        }
        if (insNursingGroupInfo.getCreateUser() != null) {
            chainWrapper.set(InsNursingGroupInfo::getCreateUser, insNursingGroupInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingGroupInfo.getCreateName())) {
            chainWrapper.set(InsNursingGroupInfo::getCreateName, insNursingGroupInfo.getCreateName());
        }
        if (insNursingGroupInfo.getCreateDept() != null) {
            chainWrapper.set(InsNursingGroupInfo::getCreateDept, insNursingGroupInfo.getCreateDept());
        }
        if (insNursingGroupInfo.getCreateTime() != null) {
            chainWrapper.set(InsNursingGroupInfo::getCreateTime, insNursingGroupInfo.getCreateTime());
        }
        if (insNursingGroupInfo.getUpdateUser() != null) {
            chainWrapper.set(InsNursingGroupInfo::getUpdateUser, insNursingGroupInfo.getUpdateUser());
        }
        if (insNursingGroupInfo.getUpdateTime() != null) {
            chainWrapper.set(InsNursingGroupInfo::getUpdateTime, insNursingGroupInfo.getUpdateTime());
        }
        if (insNursingGroupInfo.getIsDeleted() != null) {
            chainWrapper.set(InsNursingGroupInfo::getIsDeleted, insNursingGroupInfo.getIsDeleted());
        }
        if (insNursingGroupInfo.getStatus() != null) {
            chainWrapper.set(InsNursingGroupInfo::getStatus, insNursingGroupInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingGroupInfo::getId, insNursingGroupInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingGroupInfo.getId());
        } else {
            return insNursingGroupInfo;
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
    public boolean saveInsNursingGroupInfoBatch(List<InsNursingGroupInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingGroupInfo insNursingGroupInfo : insertList) {
            //使用默认的雪花算法生成
            insNursingGroupInfo.setId(null);
            //insNursingGroupInfo.setCreatedDt(currentDte);
            //insNursingGroupInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingGroupInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingGroupInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


