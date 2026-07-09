package cn.pluss.platform.service.insNursingPlanRoomDetail.impl;

import cn.pluss.platform.mapper.InsNursingPlanRoomDetailMapper;
import cn.pluss.platform.model.entity.InsNursingPlanRoomDetail;
import cn.pluss.platform.service.insNursingPlanRoomDetail.InsNursingPlanRoomDetailService;
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
@Service("insNursingPlanRoomDetailService")
public class InsNursingPlanRoomDetailServiceImpl extends ServiceImpl< InsNursingPlanRoomDetailMapper, InsNursingPlanRoomDetail> implements InsNursingPlanRoomDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingPlanRoomDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingPlanRoomDetail> queryPage(Map map) {
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
    public InsNursingPlanRoomDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingPlanRoomDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingPlanRoomDetail queryOne(InsNursingPlanRoomDetail insNursingPlanRoomDetail){
        LambdaQueryWrapper<InsNursingPlanRoomDetail> queryWrapper = getQueryWrapper(insNursingPlanRoomDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingPlanRoomDetail
    * @return
    */
    @Override
    public List<InsNursingPlanRoomDetail> queryList(InsNursingPlanRoomDetail insNursingPlanRoomDetail) {
        LambdaQueryWrapper<InsNursingPlanRoomDetail> queryWrapper = getQueryWrapper(insNursingPlanRoomDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingPlanRoomDetail
    * @return
    */
    public static LambdaQueryWrapper<InsNursingPlanRoomDetail> getQueryWrapper(InsNursingPlanRoomDetail insNursingPlanRoomDetail){
        LambdaQueryWrapper<InsNursingPlanRoomDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingPlanRoomDetail.getId() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getId, insNursingPlanRoomDetail.getId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getTenantId())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getTenantId, insNursingPlanRoomDetail.getTenantId());
        }
        if (insNursingPlanRoomDetail.getCorpId() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getCorpId, insNursingPlanRoomDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getCorpName())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getCorpName, insNursingPlanRoomDetail.getCorpName());
        }
        if (insNursingPlanRoomDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getInstitutionId, insNursingPlanRoomDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getInstitutionName())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getInstitutionName, insNursingPlanRoomDetail.getInstitutionName());
        }
        if (insNursingPlanRoomDetail.getPlanId() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getPlanId, insNursingPlanRoomDetail.getPlanId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getPlanName())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getPlanName, insNursingPlanRoomDetail.getPlanName());
        }
        if (insNursingPlanRoomDetail.getBuildingId() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getBuildingId, insNursingPlanRoomDetail.getBuildingId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getBuildingName())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getBuildingName, insNursingPlanRoomDetail.getBuildingName());
        }
        if (insNursingPlanRoomDetail.getFloorId() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getFloorId, insNursingPlanRoomDetail.getFloorId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getFloorName())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getFloorName, insNursingPlanRoomDetail.getFloorName());
        }
        if (insNursingPlanRoomDetail.getRoomId() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getRoomId, insNursingPlanRoomDetail.getRoomId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getRoomName())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getRoomName, insNursingPlanRoomDetail.getRoomName());
        }
        if (insNursingPlanRoomDetail.getStaffId() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getStaffId, insNursingPlanRoomDetail.getStaffId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getStaffName())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getStaffName, insNursingPlanRoomDetail.getStaffName());
        }
        if (insNursingPlanRoomDetail.getNursingGroupId() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getNursingGroupId, insNursingPlanRoomDetail.getNursingGroupId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getNursingGroupName())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getNursingGroupName, insNursingPlanRoomDetail.getNursingGroupName());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getRemark())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getRemark, insNursingPlanRoomDetail.getRemark());
        }
        if (insNursingPlanRoomDetail.getCreateUser() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getCreateUser, insNursingPlanRoomDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoomDetail.getCreateName())) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getCreateName, insNursingPlanRoomDetail.getCreateName());
        }
        if (insNursingPlanRoomDetail.getCreateDept() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getCreateDept, insNursingPlanRoomDetail.getCreateDept());
        }
        if (insNursingPlanRoomDetail.getCreateTime() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getCreateTime, insNursingPlanRoomDetail.getCreateTime());
        }
        if (insNursingPlanRoomDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getUpdateUser, insNursingPlanRoomDetail.getUpdateUser());
        }
        if (insNursingPlanRoomDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getUpdateTime, insNursingPlanRoomDetail.getUpdateTime());
        }
        if (insNursingPlanRoomDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getIsDeleted, insNursingPlanRoomDetail.getIsDeleted());
        }
        if (insNursingPlanRoomDetail.getStatus() != null) {
            queryWrapper.eq(InsNursingPlanRoomDetail::getStatus, insNursingPlanRoomDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingPlanRoomDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingPlanRoomDetail insert(InsNursingPlanRoomDetail insNursingPlanRoomDetail) {
        insNursingPlanRoomDetail.setId(null);
        getBaseMapper().insert(insNursingPlanRoomDetail);
        return insNursingPlanRoomDetail;
    }

    /**
    * 更新数据
    *
    * @param insNursingPlanRoomDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingPlanRoomDetail update(InsNursingPlanRoomDetail insNursingPlanRoomDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingPlanRoomDetail> chainWrapper = new LambdaUpdateChainWrapper<InsNursingPlanRoomDetail>(getBaseMapper());
        if (insNursingPlanRoomDetail.getId() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getId, insNursingPlanRoomDetail.getId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getTenantId())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getTenantId, insNursingPlanRoomDetail.getTenantId());
        }
        if (insNursingPlanRoomDetail.getCorpId() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getCorpId, insNursingPlanRoomDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getCorpName())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getCorpName, insNursingPlanRoomDetail.getCorpName());
        }
        if (insNursingPlanRoomDetail.getInstitutionId() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getInstitutionId, insNursingPlanRoomDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getInstitutionName())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getInstitutionName, insNursingPlanRoomDetail.getInstitutionName());
        }
        if (insNursingPlanRoomDetail.getPlanId() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getPlanId, insNursingPlanRoomDetail.getPlanId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getPlanName())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getPlanName, insNursingPlanRoomDetail.getPlanName());
        }
        if (insNursingPlanRoomDetail.getBuildingId() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getBuildingId, insNursingPlanRoomDetail.getBuildingId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getBuildingName())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getBuildingName, insNursingPlanRoomDetail.getBuildingName());
        }
        if (insNursingPlanRoomDetail.getFloorId() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getFloorId, insNursingPlanRoomDetail.getFloorId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getFloorName())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getFloorName, insNursingPlanRoomDetail.getFloorName());
        }
        if (insNursingPlanRoomDetail.getRoomId() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getRoomId, insNursingPlanRoomDetail.getRoomId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getRoomName())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getRoomName, insNursingPlanRoomDetail.getRoomName());
        }
        if (insNursingPlanRoomDetail.getStaffId() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getStaffId, insNursingPlanRoomDetail.getStaffId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getStaffName())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getStaffName, insNursingPlanRoomDetail.getStaffName());
        }
        if (insNursingPlanRoomDetail.getNursingGroupId() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getNursingGroupId, insNursingPlanRoomDetail.getNursingGroupId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getNursingGroupName())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getNursingGroupName, insNursingPlanRoomDetail.getNursingGroupName());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getRemark())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getRemark, insNursingPlanRoomDetail.getRemark());
        }
        if (insNursingPlanRoomDetail.getCreateUser() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getCreateUser, insNursingPlanRoomDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoomDetail.getCreateName())) {
            chainWrapper.set(InsNursingPlanRoomDetail::getCreateName, insNursingPlanRoomDetail.getCreateName());
        }
        if (insNursingPlanRoomDetail.getCreateDept() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getCreateDept, insNursingPlanRoomDetail.getCreateDept());
        }
        if (insNursingPlanRoomDetail.getCreateTime() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getCreateTime, insNursingPlanRoomDetail.getCreateTime());
        }
        if (insNursingPlanRoomDetail.getUpdateUser() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getUpdateUser, insNursingPlanRoomDetail.getUpdateUser());
        }
        if (insNursingPlanRoomDetail.getUpdateTime() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getUpdateTime, insNursingPlanRoomDetail.getUpdateTime());
        }
        if (insNursingPlanRoomDetail.getIsDeleted() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getIsDeleted, insNursingPlanRoomDetail.getIsDeleted());
        }
        if (insNursingPlanRoomDetail.getStatus() != null) {
            chainWrapper.set(InsNursingPlanRoomDetail::getStatus, insNursingPlanRoomDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingPlanRoomDetail::getId, insNursingPlanRoomDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingPlanRoomDetail.getId());
        } else {
            return insNursingPlanRoomDetail;
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
    public boolean saveInsNursingPlanRoomDetailBatch(List<InsNursingPlanRoomDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingPlanRoomDetail insNursingPlanRoomDetail : insertList) {
            //使用默认的雪花算法生成
            insNursingPlanRoomDetail.setId(null);
            //insNursingPlanRoomDetail.setCreatedDt(currentDte);
            //insNursingPlanRoomDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingPlanRoomDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingPlanRoomDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


