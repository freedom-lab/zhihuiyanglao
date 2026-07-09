package cn.pluss.platform.service.insSecurityInspectionRouteDetail.impl;

import cn.pluss.platform.mapper.InsSecurityInspectionRouteDetailMapper;
import cn.pluss.platform.model.entity.InsSecurityInspectionRouteDetail;
import cn.pluss.platform.service.insSecurityInspectionRouteDetail.InsSecurityInspectionRouteDetailService;
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
@Service("insSecurityInspectionRouteDetailService")
public class InsSecurityInspectionRouteDetailServiceImpl extends ServiceImpl< InsSecurityInspectionRouteDetailMapper, InsSecurityInspectionRouteDetail> implements InsSecurityInspectionRouteDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsSecurityInspectionRouteDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSecurityInspectionRouteDetail> queryPage(Map map) {
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
    public InsSecurityInspectionRouteDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityInspectionRouteDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsSecurityInspectionRouteDetail queryOne(InsSecurityInspectionRouteDetail insSecurityInspectionRouteDetail){
        LambdaQueryWrapper<InsSecurityInspectionRouteDetail> queryWrapper = getQueryWrapper(insSecurityInspectionRouteDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityInspectionRouteDetail
    * @return
    */
    @Override
    public List<InsSecurityInspectionRouteDetail> queryList(InsSecurityInspectionRouteDetail insSecurityInspectionRouteDetail) {
        LambdaQueryWrapper<InsSecurityInspectionRouteDetail> queryWrapper = getQueryWrapper(insSecurityInspectionRouteDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSecurityInspectionRouteDetail
    * @return
    */
    public static LambdaQueryWrapper<InsSecurityInspectionRouteDetail> getQueryWrapper(InsSecurityInspectionRouteDetail insSecurityInspectionRouteDetail){
        LambdaQueryWrapper<InsSecurityInspectionRouteDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insSecurityInspectionRouteDetail.getId() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getId, insSecurityInspectionRouteDetail.getId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRouteDetail.getTenantId())) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getTenantId, insSecurityInspectionRouteDetail.getTenantId());
        }
        if (insSecurityInspectionRouteDetail.getCorpId() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getCorpId, insSecurityInspectionRouteDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRouteDetail.getCorpName())) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getCorpName, insSecurityInspectionRouteDetail.getCorpName());
        }
        if (insSecurityInspectionRouteDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getInstitutionId, insSecurityInspectionRouteDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRouteDetail.getInstitutionName())) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getInstitutionName, insSecurityInspectionRouteDetail.getInstitutionName());
        }
        if (insSecurityInspectionRouteDetail.getRouteId() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getRouteId, insSecurityInspectionRouteDetail.getRouteId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRouteDetail.getRouteName())) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getRouteName, insSecurityInspectionRouteDetail.getRouteName());
        }
        if (insSecurityInspectionRouteDetail.getPointId() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getPointId, insSecurityInspectionRouteDetail.getPointId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRouteDetail.getPointName())) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getPointName, insSecurityInspectionRouteDetail.getPointName());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRouteDetail.getQrCodePath())) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getQrCodePath, insSecurityInspectionRouteDetail.getQrCodePath());
        }
        if (insSecurityInspectionRouteDetail.getSortNum() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getSortNum, insSecurityInspectionRouteDetail.getSortNum());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRouteDetail.getRemark())) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getRemark, insSecurityInspectionRouteDetail.getRemark());
        }
        if (insSecurityInspectionRouteDetail.getCreateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getCreateUser, insSecurityInspectionRouteDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRouteDetail.getCreateName())) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getCreateName, insSecurityInspectionRouteDetail.getCreateName());
        }
        if (insSecurityInspectionRouteDetail.getCreateDept() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getCreateDept, insSecurityInspectionRouteDetail.getCreateDept());
        }
        if (insSecurityInspectionRouteDetail.getCreateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getCreateTime, insSecurityInspectionRouteDetail.getCreateTime());
        }
        if (insSecurityInspectionRouteDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getUpdateUser, insSecurityInspectionRouteDetail.getUpdateUser());
        }
        if (insSecurityInspectionRouteDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getUpdateTime, insSecurityInspectionRouteDetail.getUpdateTime());
        }
        if (insSecurityInspectionRouteDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getIsDeleted, insSecurityInspectionRouteDetail.getIsDeleted());
        }
        if (insSecurityInspectionRouteDetail.getStatus() != null) {
            queryWrapper.eq(InsSecurityInspectionRouteDetail::getStatus, insSecurityInspectionRouteDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSecurityInspectionRouteDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionRouteDetail insert(InsSecurityInspectionRouteDetail insSecurityInspectionRouteDetail) {
        insSecurityInspectionRouteDetail.setId(null);
        getBaseMapper().insert(insSecurityInspectionRouteDetail);
        return insSecurityInspectionRouteDetail;
    }

    /**
    * 更新数据
    *
    * @param insSecurityInspectionRouteDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionRouteDetail update(InsSecurityInspectionRouteDetail insSecurityInspectionRouteDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSecurityInspectionRouteDetail> chainWrapper = new LambdaUpdateChainWrapper<InsSecurityInspectionRouteDetail>(getBaseMapper());
        if (insSecurityInspectionRouteDetail.getId() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getId, insSecurityInspectionRouteDetail.getId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRouteDetail.getTenantId())) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getTenantId, insSecurityInspectionRouteDetail.getTenantId());
        }
        if (insSecurityInspectionRouteDetail.getCorpId() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getCorpId, insSecurityInspectionRouteDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRouteDetail.getCorpName())) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getCorpName, insSecurityInspectionRouteDetail.getCorpName());
        }
        if (insSecurityInspectionRouteDetail.getInstitutionId() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getInstitutionId, insSecurityInspectionRouteDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRouteDetail.getInstitutionName())) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getInstitutionName, insSecurityInspectionRouteDetail.getInstitutionName());
        }
        if (insSecurityInspectionRouteDetail.getRouteId() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getRouteId, insSecurityInspectionRouteDetail.getRouteId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRouteDetail.getRouteName())) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getRouteName, insSecurityInspectionRouteDetail.getRouteName());
        }
        if (insSecurityInspectionRouteDetail.getPointId() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getPointId, insSecurityInspectionRouteDetail.getPointId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRouteDetail.getPointName())) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getPointName, insSecurityInspectionRouteDetail.getPointName());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRouteDetail.getQrCodePath())) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getQrCodePath, insSecurityInspectionRouteDetail.getQrCodePath());
        }
        if (insSecurityInspectionRouteDetail.getSortNum() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getSortNum, insSecurityInspectionRouteDetail.getSortNum());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRouteDetail.getRemark())) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getRemark, insSecurityInspectionRouteDetail.getRemark());
        }
        if (insSecurityInspectionRouteDetail.getCreateUser() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getCreateUser, insSecurityInspectionRouteDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRouteDetail.getCreateName())) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getCreateName, insSecurityInspectionRouteDetail.getCreateName());
        }
        if (insSecurityInspectionRouteDetail.getCreateDept() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getCreateDept, insSecurityInspectionRouteDetail.getCreateDept());
        }
        if (insSecurityInspectionRouteDetail.getCreateTime() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getCreateTime, insSecurityInspectionRouteDetail.getCreateTime());
        }
        if (insSecurityInspectionRouteDetail.getUpdateUser() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getUpdateUser, insSecurityInspectionRouteDetail.getUpdateUser());
        }
        if (insSecurityInspectionRouteDetail.getUpdateTime() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getUpdateTime, insSecurityInspectionRouteDetail.getUpdateTime());
        }
        if (insSecurityInspectionRouteDetail.getIsDeleted() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getIsDeleted, insSecurityInspectionRouteDetail.getIsDeleted());
        }
        if (insSecurityInspectionRouteDetail.getStatus() != null) {
            chainWrapper.set(InsSecurityInspectionRouteDetail::getStatus, insSecurityInspectionRouteDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSecurityInspectionRouteDetail::getId, insSecurityInspectionRouteDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSecurityInspectionRouteDetail.getId());
        } else {
            return insSecurityInspectionRouteDetail;
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
    public boolean saveInsSecurityInspectionRouteDetailBatch(List<InsSecurityInspectionRouteDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSecurityInspectionRouteDetail insSecurityInspectionRouteDetail : insertList) {
            //使用默认的雪花算法生成
            insSecurityInspectionRouteDetail.setId(null);
            //insSecurityInspectionRouteDetail.setCreatedDt(currentDte);
            //insSecurityInspectionRouteDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsSecurityInspectionRouteDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSecurityInspectionRouteDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


