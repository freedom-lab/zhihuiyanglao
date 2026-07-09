package cn.pluss.platform.service.insSecurityInspectionRecordDetail.impl;

import cn.pluss.platform.mapper.InsSecurityInspectionRecordDetailMapper;
import cn.pluss.platform.model.entity.InsSecurityInspectionRecordDetail;
import cn.pluss.platform.service.insSecurityInspectionRecordDetail.InsSecurityInspectionRecordDetailService;
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
@Service("insSecurityInspectionRecordDetailService")
public class InsSecurityInspectionRecordDetailServiceImpl extends ServiceImpl< InsSecurityInspectionRecordDetailMapper, InsSecurityInspectionRecordDetail> implements InsSecurityInspectionRecordDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsSecurityInspectionRecordDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSecurityInspectionRecordDetail> queryPage(Map map) {
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
    public InsSecurityInspectionRecordDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityInspectionRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsSecurityInspectionRecordDetail queryOne(InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail){
        LambdaQueryWrapper<InsSecurityInspectionRecordDetail> queryWrapper = getQueryWrapper(insSecurityInspectionRecordDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityInspectionRecordDetail
    * @return
    */
    @Override
    public List<InsSecurityInspectionRecordDetail> queryList(InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail) {
        LambdaQueryWrapper<InsSecurityInspectionRecordDetail> queryWrapper = getQueryWrapper(insSecurityInspectionRecordDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSecurityInspectionRecordDetail
    * @return
    */
    public static LambdaQueryWrapper<InsSecurityInspectionRecordDetail> getQueryWrapper(InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail){
        LambdaQueryWrapper<InsSecurityInspectionRecordDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insSecurityInspectionRecordDetail.getId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getId, insSecurityInspectionRecordDetail.getId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getTenantId())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getTenantId, insSecurityInspectionRecordDetail.getTenantId());
        }
        if (insSecurityInspectionRecordDetail.getCorpId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getCorpId, insSecurityInspectionRecordDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getCorpName())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getCorpName, insSecurityInspectionRecordDetail.getCorpName());
        }
        if (insSecurityInspectionRecordDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getInstitutionId, insSecurityInspectionRecordDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getInstitutionName())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getInstitutionName, insSecurityInspectionRecordDetail.getInstitutionName());
        }
        if (insSecurityInspectionRecordDetail.getRecordId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getRecordId, insSecurityInspectionRecordDetail.getRecordId());
        }
        if (insSecurityInspectionRecordDetail.getPointId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getPointId, insSecurityInspectionRecordDetail.getPointId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getPointName())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getPointName, insSecurityInspectionRecordDetail.getPointName());
        }
        if (insSecurityInspectionRecordDetail.getSortNum() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getSortNum, insSecurityInspectionRecordDetail.getSortNum());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getPointPosition())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getPointPosition, insSecurityInspectionRecordDetail.getPointPosition());
        }
        if (insSecurityInspectionRecordDetail.getInspectionTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getInspectionTime, insSecurityInspectionRecordDetail.getInspectionTime());
        }
        if (insSecurityInspectionRecordDetail.getStaffId() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getStaffId, insSecurityInspectionRecordDetail.getStaffId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getStaffName())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getStaffName, insSecurityInspectionRecordDetail.getStaffName());
        }
        if (insSecurityInspectionRecordDetail.getInspectionState() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getInspectionState, insSecurityInspectionRecordDetail.getInspectionState());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getPatrolIllustrate())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getPatrolIllustrate, insSecurityInspectionRecordDetail.getPatrolIllustrate());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getImgPath())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getImgPath, insSecurityInspectionRecordDetail.getImgPath());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getRemark())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getRemark, insSecurityInspectionRecordDetail.getRemark());
        }
        if (insSecurityInspectionRecordDetail.getCreateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getCreateUser, insSecurityInspectionRecordDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRecordDetail.getCreateName())) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getCreateName, insSecurityInspectionRecordDetail.getCreateName());
        }
        if (insSecurityInspectionRecordDetail.getCreateDept() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getCreateDept, insSecurityInspectionRecordDetail.getCreateDept());
        }
        if (insSecurityInspectionRecordDetail.getCreateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getCreateTime, insSecurityInspectionRecordDetail.getCreateTime());
        }
        if (insSecurityInspectionRecordDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getUpdateUser, insSecurityInspectionRecordDetail.getUpdateUser());
        }
        if (insSecurityInspectionRecordDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getUpdateTime, insSecurityInspectionRecordDetail.getUpdateTime());
        }
        if (insSecurityInspectionRecordDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getIsDeleted, insSecurityInspectionRecordDetail.getIsDeleted());
        }
        if (insSecurityInspectionRecordDetail.getStatus() != null) {
            queryWrapper.eq(InsSecurityInspectionRecordDetail::getStatus, insSecurityInspectionRecordDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSecurityInspectionRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionRecordDetail insert(InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail) {
        insSecurityInspectionRecordDetail.setId(null);
        getBaseMapper().insert(insSecurityInspectionRecordDetail);
        return insSecurityInspectionRecordDetail;
    }

    /**
    * 更新数据
    *
    * @param insSecurityInspectionRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionRecordDetail update(InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSecurityInspectionRecordDetail> chainWrapper = new LambdaUpdateChainWrapper<InsSecurityInspectionRecordDetail>(getBaseMapper());
        if (insSecurityInspectionRecordDetail.getId() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getId, insSecurityInspectionRecordDetail.getId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getTenantId())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getTenantId, insSecurityInspectionRecordDetail.getTenantId());
        }
        if (insSecurityInspectionRecordDetail.getCorpId() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getCorpId, insSecurityInspectionRecordDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getCorpName())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getCorpName, insSecurityInspectionRecordDetail.getCorpName());
        }
        if (insSecurityInspectionRecordDetail.getInstitutionId() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getInstitutionId, insSecurityInspectionRecordDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getInstitutionName())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getInstitutionName, insSecurityInspectionRecordDetail.getInstitutionName());
        }
        if (insSecurityInspectionRecordDetail.getRecordId() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getRecordId, insSecurityInspectionRecordDetail.getRecordId());
        }
        if (insSecurityInspectionRecordDetail.getPointId() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getPointId, insSecurityInspectionRecordDetail.getPointId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getPointName())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getPointName, insSecurityInspectionRecordDetail.getPointName());
        }
        if (insSecurityInspectionRecordDetail.getSortNum() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getSortNum, insSecurityInspectionRecordDetail.getSortNum());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getPointPosition())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getPointPosition, insSecurityInspectionRecordDetail.getPointPosition());
        }
        if (insSecurityInspectionRecordDetail.getInspectionTime() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getInspectionTime, insSecurityInspectionRecordDetail.getInspectionTime());
        }
        if (insSecurityInspectionRecordDetail.getStaffId() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getStaffId, insSecurityInspectionRecordDetail.getStaffId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getStaffName())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getStaffName, insSecurityInspectionRecordDetail.getStaffName());
        }
        if (insSecurityInspectionRecordDetail.getInspectionState() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getInspectionState, insSecurityInspectionRecordDetail.getInspectionState());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getPatrolIllustrate())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getPatrolIllustrate, insSecurityInspectionRecordDetail.getPatrolIllustrate());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getImgPath())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getImgPath, insSecurityInspectionRecordDetail.getImgPath());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getRemark())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getRemark, insSecurityInspectionRecordDetail.getRemark());
        }
        if (insSecurityInspectionRecordDetail.getCreateUser() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getCreateUser, insSecurityInspectionRecordDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRecordDetail.getCreateName())) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getCreateName, insSecurityInspectionRecordDetail.getCreateName());
        }
        if (insSecurityInspectionRecordDetail.getCreateDept() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getCreateDept, insSecurityInspectionRecordDetail.getCreateDept());
        }
        if (insSecurityInspectionRecordDetail.getCreateTime() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getCreateTime, insSecurityInspectionRecordDetail.getCreateTime());
        }
        if (insSecurityInspectionRecordDetail.getUpdateUser() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getUpdateUser, insSecurityInspectionRecordDetail.getUpdateUser());
        }
        if (insSecurityInspectionRecordDetail.getUpdateTime() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getUpdateTime, insSecurityInspectionRecordDetail.getUpdateTime());
        }
        if (insSecurityInspectionRecordDetail.getIsDeleted() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getIsDeleted, insSecurityInspectionRecordDetail.getIsDeleted());
        }
        if (insSecurityInspectionRecordDetail.getStatus() != null) {
            chainWrapper.set(InsSecurityInspectionRecordDetail::getStatus, insSecurityInspectionRecordDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSecurityInspectionRecordDetail::getId, insSecurityInspectionRecordDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSecurityInspectionRecordDetail.getId());
        } else {
            return insSecurityInspectionRecordDetail;
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
    public boolean saveInsSecurityInspectionRecordDetailBatch(List<InsSecurityInspectionRecordDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail : insertList) {
            //使用默认的雪花算法生成
            insSecurityInspectionRecordDetail.setId(null);
            //insSecurityInspectionRecordDetail.setCreatedDt(currentDte);
            //insSecurityInspectionRecordDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsSecurityInspectionRecordDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSecurityInspectionRecordDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


