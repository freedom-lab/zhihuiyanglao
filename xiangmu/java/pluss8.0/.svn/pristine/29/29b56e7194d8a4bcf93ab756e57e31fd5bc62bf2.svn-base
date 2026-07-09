package cn.pluss.platform.service.communityMedicationDetail.impl;

import cn.pluss.platform.mapper.CommunityMedicationDetailMapper;
import cn.pluss.platform.model.entity.CommunityMedicationDetail;
import cn.pluss.platform.service.communityMedicationDetail.CommunityMedicationDetailService;
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
@Service("communityMedicationDetailService")
public class CommunityMedicationDetailServiceImpl extends ServiceImpl< CommunityMedicationDetailMapper, CommunityMedicationDetail> implements CommunityMedicationDetailService {
    private static final Logger logger = LoggerFactory.getLogger(CommunityMedicationDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CommunityMedicationDetail> queryPage(Map map) {
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
    public CommunityMedicationDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param communityMedicationDetail 实例对象
    * @return 实例对象
    */
    @Override
    public CommunityMedicationDetail queryOne(CommunityMedicationDetail communityMedicationDetail){
        LambdaQueryWrapper<CommunityMedicationDetail> queryWrapper = getQueryWrapper(communityMedicationDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param communityMedicationDetail
    * @return
    */
    @Override
    public List<CommunityMedicationDetail> queryList(CommunityMedicationDetail communityMedicationDetail) {
        LambdaQueryWrapper<CommunityMedicationDetail> queryWrapper = getQueryWrapper(communityMedicationDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param communityMedicationDetail
    * @return
    */
    public static LambdaQueryWrapper<CommunityMedicationDetail> getQueryWrapper(CommunityMedicationDetail communityMedicationDetail){
        LambdaQueryWrapper<CommunityMedicationDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (communityMedicationDetail.getId() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getId, communityMedicationDetail.getId());
        }
        if (StringUtil.isNotEmpty(communityMedicationDetail.getTenantId())) {
            queryWrapper.eq(CommunityMedicationDetail::getTenantId, communityMedicationDetail.getTenantId());
        }
        if (communityMedicationDetail.getCorpId() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getCorpId, communityMedicationDetail.getCorpId());
        }
        if (communityMedicationDetail.getInstitutionId() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getInstitutionId, communityMedicationDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(communityMedicationDetail.getInstitutionName())) {
            queryWrapper.eq(CommunityMedicationDetail::getInstitutionName, communityMedicationDetail.getInstitutionName());
        }
        if (communityMedicationDetail.getElderId() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getElderId, communityMedicationDetail.getElderId());
        }
        if (StringUtil.isNotEmpty(communityMedicationDetail.getElderName())) {
            queryWrapper.eq(CommunityMedicationDetail::getElderName, communityMedicationDetail.getElderName());
        }
        if (communityMedicationDetail.getMedicationId() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getMedicationId, communityMedicationDetail.getMedicationId());
        }
        if (StringUtil.isNotEmpty(communityMedicationDetail.getMedicationName())) {
            queryWrapper.eq(CommunityMedicationDetail::getMedicationName, communityMedicationDetail.getMedicationName());
        }
        if (communityMedicationDetail.getRemindDate() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getRemindDate, communityMedicationDetail.getRemindDate());
        }
        if (StringUtil.isNotEmpty(communityMedicationDetail.getMedicationTime())) {
            queryWrapper.eq(CommunityMedicationDetail::getMedicationTime, communityMedicationDetail.getMedicationTime());
        }
        if (StringUtil.isNotEmpty(communityMedicationDetail.getSendContext())) {
            queryWrapper.eq(CommunityMedicationDetail::getSendContext, communityMedicationDetail.getSendContext());
        }
        if (communityMedicationDetail.getSendState() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getSendState, communityMedicationDetail.getSendState());
        }
        if (communityMedicationDetail.getAreaCode() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getAreaCode, communityMedicationDetail.getAreaCode());
        }
        if (StringUtil.isNotEmpty(communityMedicationDetail.getAreaName())) {
            queryWrapper.eq(CommunityMedicationDetail::getAreaName, communityMedicationDetail.getAreaName());
        }
        if (StringUtil.isNotEmpty(communityMedicationDetail.getRemark())) {
            queryWrapper.eq(CommunityMedicationDetail::getRemark, communityMedicationDetail.getRemark());
        }
        if (communityMedicationDetail.getCreateUser() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getCreateUser, communityMedicationDetail.getCreateUser());
        }
        if (communityMedicationDetail.getCreateDept() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getCreateDept, communityMedicationDetail.getCreateDept());
        }
        if (communityMedicationDetail.getCreateTime() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getCreateTime, communityMedicationDetail.getCreateTime());
        }
        if (communityMedicationDetail.getUpdateUser() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getUpdateUser, communityMedicationDetail.getUpdateUser());
        }
        if (communityMedicationDetail.getUpdateTime() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getUpdateTime, communityMedicationDetail.getUpdateTime());
        }
        if (communityMedicationDetail.getStatus() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getStatus, communityMedicationDetail.getStatus());
        }
        if (communityMedicationDetail.getIsDeleted() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getIsDeleted, communityMedicationDetail.getIsDeleted());
        }
        if (communityMedicationDetail.getReadState() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getReadState, communityMedicationDetail.getReadState());
        }
        if (communityMedicationDetail.getReadTime() != null) {
            queryWrapper.eq(CommunityMedicationDetail::getReadTime, communityMedicationDetail.getReadTime());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param communityMedicationDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityMedicationDetail insert(CommunityMedicationDetail communityMedicationDetail) {
        communityMedicationDetail.setId(null);
        getBaseMapper().insert(communityMedicationDetail);
        return communityMedicationDetail;
    }

    /**
    * 更新数据
    *
    * @param communityMedicationDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityMedicationDetail update(CommunityMedicationDetail communityMedicationDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CommunityMedicationDetail> chainWrapper = new LambdaUpdateChainWrapper<CommunityMedicationDetail>(getBaseMapper());
        if (communityMedicationDetail.getId() != null) {
            chainWrapper.set(CommunityMedicationDetail::getId, communityMedicationDetail.getId());
        }
        if (StringUtil.isNotBlank(communityMedicationDetail.getTenantId())) {
            chainWrapper.set(CommunityMedicationDetail::getTenantId, communityMedicationDetail.getTenantId());
        }
        if (communityMedicationDetail.getCorpId() != null) {
            chainWrapper.set(CommunityMedicationDetail::getCorpId, communityMedicationDetail.getCorpId());
        }
        if (communityMedicationDetail.getInstitutionId() != null) {
            chainWrapper.set(CommunityMedicationDetail::getInstitutionId, communityMedicationDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(communityMedicationDetail.getInstitutionName())) {
            chainWrapper.set(CommunityMedicationDetail::getInstitutionName, communityMedicationDetail.getInstitutionName());
        }
        if (communityMedicationDetail.getElderId() != null) {
            chainWrapper.set(CommunityMedicationDetail::getElderId, communityMedicationDetail.getElderId());
        }
        if (StringUtil.isNotBlank(communityMedicationDetail.getElderName())) {
            chainWrapper.set(CommunityMedicationDetail::getElderName, communityMedicationDetail.getElderName());
        }
        if (communityMedicationDetail.getMedicationId() != null) {
            chainWrapper.set(CommunityMedicationDetail::getMedicationId, communityMedicationDetail.getMedicationId());
        }
        if (StringUtil.isNotBlank(communityMedicationDetail.getMedicationName())) {
            chainWrapper.set(CommunityMedicationDetail::getMedicationName, communityMedicationDetail.getMedicationName());
        }
        if (communityMedicationDetail.getRemindDate() != null) {
            chainWrapper.set(CommunityMedicationDetail::getRemindDate, communityMedicationDetail.getRemindDate());
        }
        if (StringUtil.isNotBlank(communityMedicationDetail.getMedicationTime())) {
            chainWrapper.set(CommunityMedicationDetail::getMedicationTime, communityMedicationDetail.getMedicationTime());
        }
        if (StringUtil.isNotBlank(communityMedicationDetail.getSendContext())) {
            chainWrapper.set(CommunityMedicationDetail::getSendContext, communityMedicationDetail.getSendContext());
        }
        if (communityMedicationDetail.getSendState() != null) {
            chainWrapper.set(CommunityMedicationDetail::getSendState, communityMedicationDetail.getSendState());
        }
        if (communityMedicationDetail.getAreaCode() != null) {
            chainWrapper.set(CommunityMedicationDetail::getAreaCode, communityMedicationDetail.getAreaCode());
        }
        if (StringUtil.isNotBlank(communityMedicationDetail.getAreaName())) {
            chainWrapper.set(CommunityMedicationDetail::getAreaName, communityMedicationDetail.getAreaName());
        }
        if (StringUtil.isNotBlank(communityMedicationDetail.getRemark())) {
            chainWrapper.set(CommunityMedicationDetail::getRemark, communityMedicationDetail.getRemark());
        }
        if (communityMedicationDetail.getCreateUser() != null) {
            chainWrapper.set(CommunityMedicationDetail::getCreateUser, communityMedicationDetail.getCreateUser());
        }
        if (communityMedicationDetail.getCreateDept() != null) {
            chainWrapper.set(CommunityMedicationDetail::getCreateDept, communityMedicationDetail.getCreateDept());
        }
        if (communityMedicationDetail.getCreateTime() != null) {
            chainWrapper.set(CommunityMedicationDetail::getCreateTime, communityMedicationDetail.getCreateTime());
        }
        if (communityMedicationDetail.getUpdateUser() != null) {
            chainWrapper.set(CommunityMedicationDetail::getUpdateUser, communityMedicationDetail.getUpdateUser());
        }
        if (communityMedicationDetail.getUpdateTime() != null) {
            chainWrapper.set(CommunityMedicationDetail::getUpdateTime, communityMedicationDetail.getUpdateTime());
        }
        if (communityMedicationDetail.getStatus() != null) {
            chainWrapper.set(CommunityMedicationDetail::getStatus, communityMedicationDetail.getStatus());
        }
        if (communityMedicationDetail.getIsDeleted() != null) {
            chainWrapper.set(CommunityMedicationDetail::getIsDeleted, communityMedicationDetail.getIsDeleted());
        }
        if (communityMedicationDetail.getReadState() != null) {
            chainWrapper.set(CommunityMedicationDetail::getReadState, communityMedicationDetail.getReadState());
        }
        if (communityMedicationDetail.getReadTime() != null) {
            chainWrapper.set(CommunityMedicationDetail::getReadTime, communityMedicationDetail.getReadTime());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CommunityMedicationDetail::getId, communityMedicationDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(communityMedicationDetail.getId());
        } else {
            return communityMedicationDetail;
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
    public boolean saveCommunityMedicationDetailBatch(List<CommunityMedicationDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CommunityMedicationDetail communityMedicationDetail : insertList) {
            //使用默认的雪花算法生成
            communityMedicationDetail.setId(null);
            //communityMedicationDetail.setCreatedDt(currentDte);
            //communityMedicationDetail.setUpdatedDt(currentDte);
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
    public Integer deleteCommunityMedicationDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CommunityMedicationDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


