package cn.pluss.platform.service.insSchedulingTableDetail.impl;

import cn.pluss.platform.mapper.InsSchedulingTableDetailMapper;
import cn.pluss.platform.model.entity.InsSchedulingTableDetail;
import cn.pluss.platform.service.insSchedulingTableDetail.InsSchedulingTableDetailService;
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
@Service("insSchedulingTableDetailService")
public class InsSchedulingTableDetailServiceImpl extends ServiceImpl< InsSchedulingTableDetailMapper, InsSchedulingTableDetail> implements InsSchedulingTableDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsSchedulingTableDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSchedulingTableDetail> queryPage(Map map) {
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
    public InsSchedulingTableDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingTableDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsSchedulingTableDetail queryOne(InsSchedulingTableDetail insSchedulingTableDetail){
        LambdaQueryWrapper<InsSchedulingTableDetail> queryWrapper = getQueryWrapper(insSchedulingTableDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSchedulingTableDetail
    * @return
    */
    @Override
    public List<InsSchedulingTableDetail> queryList(InsSchedulingTableDetail insSchedulingTableDetail) {
        LambdaQueryWrapper<InsSchedulingTableDetail> queryWrapper = getQueryWrapper(insSchedulingTableDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSchedulingTableDetail
    * @return
    */
    public static LambdaQueryWrapper<InsSchedulingTableDetail> getQueryWrapper(InsSchedulingTableDetail insSchedulingTableDetail){
        LambdaQueryWrapper<InsSchedulingTableDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insSchedulingTableDetail.getId() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getId, insSchedulingTableDetail.getId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getTenantId())) {
            queryWrapper.eq(InsSchedulingTableDetail::getTenantId, insSchedulingTableDetail.getTenantId());
        }
        if (insSchedulingTableDetail.getCorpId() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getCorpId, insSchedulingTableDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getCorpName())) {
            queryWrapper.eq(InsSchedulingTableDetail::getCorpName, insSchedulingTableDetail.getCorpName());
        }
        if (insSchedulingTableDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getInstitutionId, insSchedulingTableDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getInstitutionName())) {
            queryWrapper.eq(InsSchedulingTableDetail::getInstitutionName, insSchedulingTableDetail.getInstitutionName());
        }
        if (insSchedulingTableDetail.getTableId() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getTableId, insSchedulingTableDetail.getTableId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getTableName())) {
            queryWrapper.eq(InsSchedulingTableDetail::getTableName, insSchedulingTableDetail.getTableName());
        }
        if (insSchedulingTableDetail.getTableDate() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getTableDate, insSchedulingTableDetail.getTableDate());
        }
        if (insSchedulingTableDetail.getWeek() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getWeek, insSchedulingTableDetail.getWeek());
        }
        if (insSchedulingTableDetail.getClassesId() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getClassesId, insSchedulingTableDetail.getClassesId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getClassesName())) {
            queryWrapper.eq(InsSchedulingTableDetail::getClassesName, insSchedulingTableDetail.getClassesName());
        }
        if (insSchedulingTableDetail.getStaffId() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getStaffId, insSchedulingTableDetail.getStaffId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getStaffName())) {
            queryWrapper.eq(InsSchedulingTableDetail::getStaffName, insSchedulingTableDetail.getStaffName());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getIdCard())) {
            queryWrapper.eq(InsSchedulingTableDetail::getIdCard, insSchedulingTableDetail.getIdCard());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getSex())) {
            queryWrapper.eq(InsSchedulingTableDetail::getSex, insSchedulingTableDetail.getSex());
        }
        if (insSchedulingTableDetail.getWorkStartTime() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getWorkStartTime, insSchedulingTableDetail.getWorkStartTime());
        }
        if (insSchedulingTableDetail.getWorkEndTime() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getWorkEndTime, insSchedulingTableDetail.getWorkEndTime());
        }
        if (insSchedulingTableDetail.getSigninTime() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getSigninTime, insSchedulingTableDetail.getSigninTime());
        }
        if (insSchedulingTableDetail.getSignoutTime() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getSignoutTime, insSchedulingTableDetail.getSignoutTime());
        }
        if (insSchedulingTableDetail.getWorkState() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getWorkState, insSchedulingTableDetail.getWorkState());
        }
        if (insSchedulingTableDetail.getOffState() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getOffState, insSchedulingTableDetail.getOffState());
        }
        if (insSchedulingTableDetail.getTableState() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getTableState, insSchedulingTableDetail.getTableState());
        }
        if (insSchedulingTableDetail.getSchedulingType() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getSchedulingType, insSchedulingTableDetail.getSchedulingType());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getRemark())) {
            queryWrapper.eq(InsSchedulingTableDetail::getRemark, insSchedulingTableDetail.getRemark());
        }
        if (insSchedulingTableDetail.getCreateUser() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getCreateUser, insSchedulingTableDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSchedulingTableDetail.getCreateName())) {
            queryWrapper.eq(InsSchedulingTableDetail::getCreateName, insSchedulingTableDetail.getCreateName());
        }
        if (insSchedulingTableDetail.getCreateDept() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getCreateDept, insSchedulingTableDetail.getCreateDept());
        }
        if (insSchedulingTableDetail.getCreateTime() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getCreateTime, insSchedulingTableDetail.getCreateTime());
        }
        if (insSchedulingTableDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getUpdateUser, insSchedulingTableDetail.getUpdateUser());
        }
        if (insSchedulingTableDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getUpdateTime, insSchedulingTableDetail.getUpdateTime());
        }
        if (insSchedulingTableDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getIsDeleted, insSchedulingTableDetail.getIsDeleted());
        }
        if (insSchedulingTableDetail.getStatus() != null) {
            queryWrapper.eq(InsSchedulingTableDetail::getStatus, insSchedulingTableDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSchedulingTableDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingTableDetail insert(InsSchedulingTableDetail insSchedulingTableDetail) {
        insSchedulingTableDetail.setId(null);
        getBaseMapper().insert(insSchedulingTableDetail);
        return insSchedulingTableDetail;
    }

    /**
    * 更新数据
    *
    * @param insSchedulingTableDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingTableDetail update(InsSchedulingTableDetail insSchedulingTableDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSchedulingTableDetail> chainWrapper = new LambdaUpdateChainWrapper<InsSchedulingTableDetail>(getBaseMapper());
        if (insSchedulingTableDetail.getId() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getId, insSchedulingTableDetail.getId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getTenantId())) {
            chainWrapper.set(InsSchedulingTableDetail::getTenantId, insSchedulingTableDetail.getTenantId());
        }
        if (insSchedulingTableDetail.getCorpId() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getCorpId, insSchedulingTableDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getCorpName())) {
            chainWrapper.set(InsSchedulingTableDetail::getCorpName, insSchedulingTableDetail.getCorpName());
        }
        if (insSchedulingTableDetail.getInstitutionId() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getInstitutionId, insSchedulingTableDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getInstitutionName())) {
            chainWrapper.set(InsSchedulingTableDetail::getInstitutionName, insSchedulingTableDetail.getInstitutionName());
        }
        if (insSchedulingTableDetail.getTableId() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getTableId, insSchedulingTableDetail.getTableId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getTableName())) {
            chainWrapper.set(InsSchedulingTableDetail::getTableName, insSchedulingTableDetail.getTableName());
        }
        if (insSchedulingTableDetail.getTableDate() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getTableDate, insSchedulingTableDetail.getTableDate());
        }
        if (insSchedulingTableDetail.getWeek() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getWeek, insSchedulingTableDetail.getWeek());
        }
        if (insSchedulingTableDetail.getClassesId() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getClassesId, insSchedulingTableDetail.getClassesId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getClassesName())) {
            chainWrapper.set(InsSchedulingTableDetail::getClassesName, insSchedulingTableDetail.getClassesName());
        }
        if (insSchedulingTableDetail.getStaffId() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getStaffId, insSchedulingTableDetail.getStaffId());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getStaffName())) {
            chainWrapper.set(InsSchedulingTableDetail::getStaffName, insSchedulingTableDetail.getStaffName());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getIdCard())) {
            chainWrapper.set(InsSchedulingTableDetail::getIdCard, insSchedulingTableDetail.getIdCard());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getSex())) {
            chainWrapper.set(InsSchedulingTableDetail::getSex, insSchedulingTableDetail.getSex());
        }
        if (insSchedulingTableDetail.getWorkStartTime() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getWorkStartTime, insSchedulingTableDetail.getWorkStartTime());
        }
        if (insSchedulingTableDetail.getWorkEndTime() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getWorkEndTime, insSchedulingTableDetail.getWorkEndTime());
        }
        if (insSchedulingTableDetail.getSigninTime() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getSigninTime, insSchedulingTableDetail.getSigninTime());
        }
        if (insSchedulingTableDetail.getSignoutTime() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getSignoutTime, insSchedulingTableDetail.getSignoutTime());
        }
        if (insSchedulingTableDetail.getWorkState() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getWorkState, insSchedulingTableDetail.getWorkState());
        }
        if (insSchedulingTableDetail.getOffState() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getOffState, insSchedulingTableDetail.getOffState());
        }
        if (insSchedulingTableDetail.getTableState() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getTableState, insSchedulingTableDetail.getTableState());
        }
        if (insSchedulingTableDetail.getSchedulingType() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getSchedulingType, insSchedulingTableDetail.getSchedulingType());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getRemark())) {
            chainWrapper.set(InsSchedulingTableDetail::getRemark, insSchedulingTableDetail.getRemark());
        }
        if (insSchedulingTableDetail.getCreateUser() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getCreateUser, insSchedulingTableDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSchedulingTableDetail.getCreateName())) {
            chainWrapper.set(InsSchedulingTableDetail::getCreateName, insSchedulingTableDetail.getCreateName());
        }
        if (insSchedulingTableDetail.getCreateDept() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getCreateDept, insSchedulingTableDetail.getCreateDept());
        }
        if (insSchedulingTableDetail.getCreateTime() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getCreateTime, insSchedulingTableDetail.getCreateTime());
        }
        if (insSchedulingTableDetail.getUpdateUser() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getUpdateUser, insSchedulingTableDetail.getUpdateUser());
        }
        if (insSchedulingTableDetail.getUpdateTime() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getUpdateTime, insSchedulingTableDetail.getUpdateTime());
        }
        if (insSchedulingTableDetail.getIsDeleted() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getIsDeleted, insSchedulingTableDetail.getIsDeleted());
        }
        if (insSchedulingTableDetail.getStatus() != null) {
            chainWrapper.set(InsSchedulingTableDetail::getStatus, insSchedulingTableDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSchedulingTableDetail::getId, insSchedulingTableDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSchedulingTableDetail.getId());
        } else {
            return insSchedulingTableDetail;
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
    public boolean saveInsSchedulingTableDetailBatch(List<InsSchedulingTableDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSchedulingTableDetail insSchedulingTableDetail : insertList) {
            //使用默认的雪花算法生成
            insSchedulingTableDetail.setId(null);
            //insSchedulingTableDetail.setCreatedDt(currentDte);
            //insSchedulingTableDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsSchedulingTableDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSchedulingTableDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


