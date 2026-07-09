package cn.pluss.platform.service.communityRegisterConsultation.impl;

import cn.pluss.platform.mapper.CommunityRegisterConsultationMapper;
import cn.pluss.platform.model.entity.CommunityRegisterConsultation;
import cn.pluss.platform.service.communityRegisterConsultation.CommunityRegisterConsultationService;
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
@Service("communityRegisterConsultationService")
public class CommunityRegisterConsultationServiceImpl extends ServiceImpl< CommunityRegisterConsultationMapper, CommunityRegisterConsultation> implements CommunityRegisterConsultationService {
    private static final Logger logger = LoggerFactory.getLogger(CommunityRegisterConsultationServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CommunityRegisterConsultation> queryPage(Map map) {
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
    public CommunityRegisterConsultation queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param communityRegisterConsultation 实例对象
    * @return 实例对象
    */
    @Override
    public CommunityRegisterConsultation queryOne(CommunityRegisterConsultation communityRegisterConsultation){
        LambdaQueryWrapper<CommunityRegisterConsultation> queryWrapper = getQueryWrapper(communityRegisterConsultation);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param communityRegisterConsultation
    * @return
    */
    @Override
    public List<CommunityRegisterConsultation> queryList(CommunityRegisterConsultation communityRegisterConsultation) {
        LambdaQueryWrapper<CommunityRegisterConsultation> queryWrapper = getQueryWrapper(communityRegisterConsultation);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param communityRegisterConsultation
    * @return
    */
    public static LambdaQueryWrapper<CommunityRegisterConsultation> getQueryWrapper(CommunityRegisterConsultation communityRegisterConsultation){
        LambdaQueryWrapper<CommunityRegisterConsultation> queryWrapper = new LambdaQueryWrapper<>();
        if (communityRegisterConsultation.getId() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getId, communityRegisterConsultation.getId());
        }
        if (StringUtil.isNotEmpty(communityRegisterConsultation.getTenantId())) {
            queryWrapper.eq(CommunityRegisterConsultation::getTenantId, communityRegisterConsultation.getTenantId());
        }
        if (communityRegisterConsultation.getCorpId() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getCorpId, communityRegisterConsultation.getCorpId());
        }
        if (communityRegisterConsultation.getInstitutionId() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getInstitutionId, communityRegisterConsultation.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(communityRegisterConsultation.getInstitutionName())) {
            queryWrapper.eq(CommunityRegisterConsultation::getInstitutionName, communityRegisterConsultation.getInstitutionName());
        }
        if (communityRegisterConsultation.getElderId() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getElderId, communityRegisterConsultation.getElderId());
        }
        if (StringUtil.isNotEmpty(communityRegisterConsultation.getElderName())) {
            queryWrapper.eq(CommunityRegisterConsultation::getElderName, communityRegisterConsultation.getElderName());
        }
        if (communityRegisterConsultation.getReserveDate() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getReserveDate, communityRegisterConsultation.getReserveDate());
        }
        if (StringUtil.isNotEmpty(communityRegisterConsultation.getLinkTel())) {
            queryWrapper.eq(CommunityRegisterConsultation::getLinkTel, communityRegisterConsultation.getLinkTel());
        }
        if (StringUtil.isNotEmpty(communityRegisterConsultation.getReserveDesp())) {
            queryWrapper.eq(CommunityRegisterConsultation::getReserveDesp, communityRegisterConsultation.getReserveDesp());
        }
        if (communityRegisterConsultation.getDealState() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getDealState, communityRegisterConsultation.getDealState());
        }
        if (StringUtil.isNotEmpty(communityRegisterConsultation.getDealInfo())) {
            queryWrapper.eq(CommunityRegisterConsultation::getDealInfo, communityRegisterConsultation.getDealInfo());
        }
        if (communityRegisterConsultation.getDealTime() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getDealTime, communityRegisterConsultation.getDealTime());
        }
        if (communityRegisterConsultation.getAreaCode() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getAreaCode, communityRegisterConsultation.getAreaCode());
        }
        if (StringUtil.isNotEmpty(communityRegisterConsultation.getAreaName())) {
            queryWrapper.eq(CommunityRegisterConsultation::getAreaName, communityRegisterConsultation.getAreaName());
        }
        if (StringUtil.isNotEmpty(communityRegisterConsultation.getCreateUserName())) {
            queryWrapper.eq(CommunityRegisterConsultation::getCreateUserName, communityRegisterConsultation.getCreateUserName());
        }
        if (StringUtil.isNotEmpty(communityRegisterConsultation.getRemark())) {
            queryWrapper.eq(CommunityRegisterConsultation::getRemark, communityRegisterConsultation.getRemark());
        }
        if (communityRegisterConsultation.getCreateUser() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getCreateUser, communityRegisterConsultation.getCreateUser());
        }
        if (communityRegisterConsultation.getCreateDept() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getCreateDept, communityRegisterConsultation.getCreateDept());
        }
        if (communityRegisterConsultation.getCreateTime() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getCreateTime, communityRegisterConsultation.getCreateTime());
        }
        if (communityRegisterConsultation.getUpdateUser() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getUpdateUser, communityRegisterConsultation.getUpdateUser());
        }
        if (communityRegisterConsultation.getUpdateTime() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getUpdateTime, communityRegisterConsultation.getUpdateTime());
        }
        if (communityRegisterConsultation.getStatus() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getStatus, communityRegisterConsultation.getStatus());
        }
        if (communityRegisterConsultation.getIsDeleted() != null) {
            queryWrapper.eq(CommunityRegisterConsultation::getIsDeleted, communityRegisterConsultation.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param communityRegisterConsultation 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityRegisterConsultation insert(CommunityRegisterConsultation communityRegisterConsultation) {
        communityRegisterConsultation.setId(null);
        getBaseMapper().insert(communityRegisterConsultation);
        return communityRegisterConsultation;
    }

    /**
    * 更新数据
    *
    * @param communityRegisterConsultation 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CommunityRegisterConsultation update(CommunityRegisterConsultation communityRegisterConsultation) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CommunityRegisterConsultation> chainWrapper = new LambdaUpdateChainWrapper<CommunityRegisterConsultation>(getBaseMapper());
        if (communityRegisterConsultation.getId() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getId, communityRegisterConsultation.getId());
        }
        if (StringUtil.isNotBlank(communityRegisterConsultation.getTenantId())) {
            chainWrapper.set(CommunityRegisterConsultation::getTenantId, communityRegisterConsultation.getTenantId());
        }
        if (communityRegisterConsultation.getCorpId() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getCorpId, communityRegisterConsultation.getCorpId());
        }
        if (communityRegisterConsultation.getInstitutionId() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getInstitutionId, communityRegisterConsultation.getInstitutionId());
        }
        if (StringUtil.isNotBlank(communityRegisterConsultation.getInstitutionName())) {
            chainWrapper.set(CommunityRegisterConsultation::getInstitutionName, communityRegisterConsultation.getInstitutionName());
        }
        if (communityRegisterConsultation.getElderId() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getElderId, communityRegisterConsultation.getElderId());
        }
        if (StringUtil.isNotBlank(communityRegisterConsultation.getElderName())) {
            chainWrapper.set(CommunityRegisterConsultation::getElderName, communityRegisterConsultation.getElderName());
        }
        if (communityRegisterConsultation.getReserveDate() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getReserveDate, communityRegisterConsultation.getReserveDate());
        }
        if (StringUtil.isNotBlank(communityRegisterConsultation.getLinkTel())) {
            chainWrapper.set(CommunityRegisterConsultation::getLinkTel, communityRegisterConsultation.getLinkTel());
        }
        if (StringUtil.isNotBlank(communityRegisterConsultation.getReserveDesp())) {
            chainWrapper.set(CommunityRegisterConsultation::getReserveDesp, communityRegisterConsultation.getReserveDesp());
        }
        if (communityRegisterConsultation.getDealState() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getDealState, communityRegisterConsultation.getDealState());
        }
        if (StringUtil.isNotBlank(communityRegisterConsultation.getDealInfo())) {
            chainWrapper.set(CommunityRegisterConsultation::getDealInfo, communityRegisterConsultation.getDealInfo());
        }
        if (communityRegisterConsultation.getDealTime() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getDealTime, communityRegisterConsultation.getDealTime());
        }
        if (communityRegisterConsultation.getAreaCode() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getAreaCode, communityRegisterConsultation.getAreaCode());
        }
        if (StringUtil.isNotBlank(communityRegisterConsultation.getAreaName())) {
            chainWrapper.set(CommunityRegisterConsultation::getAreaName, communityRegisterConsultation.getAreaName());
        }
        if (StringUtil.isNotBlank(communityRegisterConsultation.getCreateUserName())) {
            chainWrapper.set(CommunityRegisterConsultation::getCreateUserName, communityRegisterConsultation.getCreateUserName());
        }
        if (StringUtil.isNotBlank(communityRegisterConsultation.getRemark())) {
            chainWrapper.set(CommunityRegisterConsultation::getRemark, communityRegisterConsultation.getRemark());
        }
        if (communityRegisterConsultation.getCreateUser() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getCreateUser, communityRegisterConsultation.getCreateUser());
        }
        if (communityRegisterConsultation.getCreateDept() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getCreateDept, communityRegisterConsultation.getCreateDept());
        }
        if (communityRegisterConsultation.getCreateTime() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getCreateTime, communityRegisterConsultation.getCreateTime());
        }
        if (communityRegisterConsultation.getUpdateUser() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getUpdateUser, communityRegisterConsultation.getUpdateUser());
        }
        if (communityRegisterConsultation.getUpdateTime() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getUpdateTime, communityRegisterConsultation.getUpdateTime());
        }
        if (communityRegisterConsultation.getStatus() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getStatus, communityRegisterConsultation.getStatus());
        }
        if (communityRegisterConsultation.getIsDeleted() != null) {
            chainWrapper.set(CommunityRegisterConsultation::getIsDeleted, communityRegisterConsultation.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CommunityRegisterConsultation::getId, communityRegisterConsultation.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(communityRegisterConsultation.getId());
        } else {
            return communityRegisterConsultation;
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
    public boolean saveCommunityRegisterConsultationBatch(List<CommunityRegisterConsultation> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CommunityRegisterConsultation communityRegisterConsultation : insertList) {
            //使用默认的雪花算法生成
            communityRegisterConsultation.setId(null);
            //communityRegisterConsultation.setCreatedDt(currentDte);
            //communityRegisterConsultation.setUpdatedDt(currentDte);
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
    public Integer deleteCommunityRegisterConsultationBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CommunityRegisterConsultation> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


