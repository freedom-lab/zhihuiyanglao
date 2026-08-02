package cn.pluss.platform.service.insSecurityDangersCheckDetail.impl;

import cn.pluss.platform.mapper.InsSecurityDangersCheckDetailMapper;
import cn.pluss.platform.model.entity.InsSecurityDangersCheckDetail;
import cn.pluss.platform.service.insSecurityDangersCheckDetail.InsSecurityDangersCheckDetailService;
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
@Service("insSecurityDangersCheckDetailService")
public class InsSecurityDangersCheckDetailServiceImpl extends ServiceImpl< InsSecurityDangersCheckDetailMapper, InsSecurityDangersCheckDetail> implements InsSecurityDangersCheckDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsSecurityDangersCheckDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSecurityDangersCheckDetail> queryPage(Map map) {
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
    public InsSecurityDangersCheckDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityDangersCheckDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsSecurityDangersCheckDetail queryOne(InsSecurityDangersCheckDetail insSecurityDangersCheckDetail){
        LambdaQueryWrapper<InsSecurityDangersCheckDetail> queryWrapper = getQueryWrapper(insSecurityDangersCheckDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityDangersCheckDetail
    * @return
    */
    @Override
    public List<InsSecurityDangersCheckDetail> queryList(InsSecurityDangersCheckDetail insSecurityDangersCheckDetail) {
        LambdaQueryWrapper<InsSecurityDangersCheckDetail> queryWrapper = getQueryWrapper(insSecurityDangersCheckDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSecurityDangersCheckDetail
    * @return
    */
    public static LambdaQueryWrapper<InsSecurityDangersCheckDetail> getQueryWrapper(InsSecurityDangersCheckDetail insSecurityDangersCheckDetail){
        LambdaQueryWrapper<InsSecurityDangersCheckDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insSecurityDangersCheckDetail.getId() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getId, insSecurityDangersCheckDetail.getId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getTenantId())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getTenantId, insSecurityDangersCheckDetail.getTenantId());
        }
        if (insSecurityDangersCheckDetail.getCorpId() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCorpId, insSecurityDangersCheckDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getCorpName())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCorpName, insSecurityDangersCheckDetail.getCorpName());
        }
        if (insSecurityDangersCheckDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getInstitutionId, insSecurityDangersCheckDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getInstitutionName())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getInstitutionName, insSecurityDangersCheckDetail.getInstitutionName());
        }
        if (insSecurityDangersCheckDetail.getCheckId() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCheckId, insSecurityDangersCheckDetail.getCheckId());
        }
        if (insSecurityDangersCheckDetail.getCategoryId() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCategoryId, insSecurityDangersCheckDetail.getCategoryId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getCategoryName())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCategoryName, insSecurityDangersCheckDetail.getCategoryName());
        }
        if (insSecurityDangersCheckDetail.getQuestionId() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getQuestionId, insSecurityDangersCheckDetail.getQuestionId());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getQuestionName())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getQuestionName, insSecurityDangersCheckDetail.getQuestionName());
        }
        if (insSecurityDangersCheckDetail.getIsProblem() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getIsProblem, insSecurityDangersCheckDetail.getIsProblem());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getProblemSituation())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getProblemSituation, insSecurityDangersCheckDetail.getProblemSituation());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getProblemImgPath())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getProblemImgPath, insSecurityDangersCheckDetail.getProblemImgPath());
        }
        if (insSecurityDangersCheckDetail.getIsCorrection() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getIsCorrection, insSecurityDangersCheckDetail.getIsCorrection());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getUnregulatedReason())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getUnregulatedReason, insSecurityDangersCheckDetail.getUnregulatedReason());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getCorrectionImgPath())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCorrectionImgPath, insSecurityDangersCheckDetail.getCorrectionImgPath());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getRemark())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getRemark, insSecurityDangersCheckDetail.getRemark());
        }
        if (insSecurityDangersCheckDetail.getCreateUser() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCreateUser, insSecurityDangersCheckDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSecurityDangersCheckDetail.getCreateName())) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCreateName, insSecurityDangersCheckDetail.getCreateName());
        }
        if (insSecurityDangersCheckDetail.getCreateDept() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCreateDept, insSecurityDangersCheckDetail.getCreateDept());
        }
        if (insSecurityDangersCheckDetail.getCreateTime() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getCreateTime, insSecurityDangersCheckDetail.getCreateTime());
        }
        if (insSecurityDangersCheckDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getUpdateUser, insSecurityDangersCheckDetail.getUpdateUser());
        }
        if (insSecurityDangersCheckDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getUpdateTime, insSecurityDangersCheckDetail.getUpdateTime());
        }
        if (insSecurityDangersCheckDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getIsDeleted, insSecurityDangersCheckDetail.getIsDeleted());
        }
        if (insSecurityDangersCheckDetail.getStatus() != null) {
            queryWrapper.eq(InsSecurityDangersCheckDetail::getStatus, insSecurityDangersCheckDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSecurityDangersCheckDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityDangersCheckDetail insert(InsSecurityDangersCheckDetail insSecurityDangersCheckDetail) {
        insSecurityDangersCheckDetail.setId(null);
        getBaseMapper().insert(insSecurityDangersCheckDetail);
        return insSecurityDangersCheckDetail;
    }

    /**
    * 更新数据
    *
    * @param insSecurityDangersCheckDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityDangersCheckDetail update(InsSecurityDangersCheckDetail insSecurityDangersCheckDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSecurityDangersCheckDetail> chainWrapper = new LambdaUpdateChainWrapper<InsSecurityDangersCheckDetail>(getBaseMapper());
        if (insSecurityDangersCheckDetail.getId() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getId, insSecurityDangersCheckDetail.getId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getTenantId())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getTenantId, insSecurityDangersCheckDetail.getTenantId());
        }
        if (insSecurityDangersCheckDetail.getCorpId() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCorpId, insSecurityDangersCheckDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getCorpName())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCorpName, insSecurityDangersCheckDetail.getCorpName());
        }
        if (insSecurityDangersCheckDetail.getInstitutionId() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getInstitutionId, insSecurityDangersCheckDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getInstitutionName())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getInstitutionName, insSecurityDangersCheckDetail.getInstitutionName());
        }
        if (insSecurityDangersCheckDetail.getCheckId() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCheckId, insSecurityDangersCheckDetail.getCheckId());
        }
        if (insSecurityDangersCheckDetail.getCategoryId() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCategoryId, insSecurityDangersCheckDetail.getCategoryId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getCategoryName())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCategoryName, insSecurityDangersCheckDetail.getCategoryName());
        }
        if (insSecurityDangersCheckDetail.getQuestionId() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getQuestionId, insSecurityDangersCheckDetail.getQuestionId());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getQuestionName())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getQuestionName, insSecurityDangersCheckDetail.getQuestionName());
        }
        if (insSecurityDangersCheckDetail.getIsProblem() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getIsProblem, insSecurityDangersCheckDetail.getIsProblem());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getProblemSituation())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getProblemSituation, insSecurityDangersCheckDetail.getProblemSituation());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getProblemImgPath())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getProblemImgPath, insSecurityDangersCheckDetail.getProblemImgPath());
        }
        if (insSecurityDangersCheckDetail.getIsCorrection() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getIsCorrection, insSecurityDangersCheckDetail.getIsCorrection());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getUnregulatedReason())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getUnregulatedReason, insSecurityDangersCheckDetail.getUnregulatedReason());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getCorrectionImgPath())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCorrectionImgPath, insSecurityDangersCheckDetail.getCorrectionImgPath());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getRemark())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getRemark, insSecurityDangersCheckDetail.getRemark());
        }
        if (insSecurityDangersCheckDetail.getCreateUser() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCreateUser, insSecurityDangersCheckDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSecurityDangersCheckDetail.getCreateName())) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCreateName, insSecurityDangersCheckDetail.getCreateName());
        }
        if (insSecurityDangersCheckDetail.getCreateDept() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCreateDept, insSecurityDangersCheckDetail.getCreateDept());
        }
        if (insSecurityDangersCheckDetail.getCreateTime() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getCreateTime, insSecurityDangersCheckDetail.getCreateTime());
        }
        if (insSecurityDangersCheckDetail.getUpdateUser() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getUpdateUser, insSecurityDangersCheckDetail.getUpdateUser());
        }
        if (insSecurityDangersCheckDetail.getUpdateTime() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getUpdateTime, insSecurityDangersCheckDetail.getUpdateTime());
        }
        if (insSecurityDangersCheckDetail.getIsDeleted() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getIsDeleted, insSecurityDangersCheckDetail.getIsDeleted());
        }
        if (insSecurityDangersCheckDetail.getStatus() != null) {
            chainWrapper.set(InsSecurityDangersCheckDetail::getStatus, insSecurityDangersCheckDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSecurityDangersCheckDetail::getId, insSecurityDangersCheckDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSecurityDangersCheckDetail.getId());
        } else {
            return insSecurityDangersCheckDetail;
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
    public boolean saveInsSecurityDangersCheckDetailBatch(List<InsSecurityDangersCheckDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSecurityDangersCheckDetail insSecurityDangersCheckDetail : insertList) {
            //使用默认的雪花算法生成
            insSecurityDangersCheckDetail.setId(null);
            //insSecurityDangersCheckDetail.setCreatedDt(currentDte);
            //insSecurityDangersCheckDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsSecurityDangersCheckDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSecurityDangersCheckDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


