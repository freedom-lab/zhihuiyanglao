package cn.pluss.platform.service.insSecurityInspectionPoint.impl;

import cn.pluss.platform.mapper.InsSecurityInspectionPointMapper;
import cn.pluss.platform.model.entity.InsSecurityInspectionPoint;
import cn.pluss.platform.service.insSecurityInspectionPoint.InsSecurityInspectionPointService;
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
@Service("insSecurityInspectionPointService")
public class InsSecurityInspectionPointServiceImpl extends ServiceImpl< InsSecurityInspectionPointMapper, InsSecurityInspectionPoint> implements InsSecurityInspectionPointService {
    private static final Logger logger = LoggerFactory.getLogger(InsSecurityInspectionPointServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSecurityInspectionPoint> queryPage(Map map) {
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
    public InsSecurityInspectionPoint queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityInspectionPoint 实例对象
    * @return 实例对象
    */
    @Override
    public InsSecurityInspectionPoint queryOne(InsSecurityInspectionPoint insSecurityInspectionPoint){
        LambdaQueryWrapper<InsSecurityInspectionPoint> queryWrapper = getQueryWrapper(insSecurityInspectionPoint);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityInspectionPoint
    * @return
    */
    @Override
    public List<InsSecurityInspectionPoint> queryList(InsSecurityInspectionPoint insSecurityInspectionPoint) {
        LambdaQueryWrapper<InsSecurityInspectionPoint> queryWrapper = getQueryWrapper(insSecurityInspectionPoint);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSecurityInspectionPoint
    * @return
    */
    public static LambdaQueryWrapper<InsSecurityInspectionPoint> getQueryWrapper(InsSecurityInspectionPoint insSecurityInspectionPoint){
        LambdaQueryWrapper<InsSecurityInspectionPoint> queryWrapper = new LambdaQueryWrapper<>();
        if (insSecurityInspectionPoint.getId() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getId, insSecurityInspectionPoint.getId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionPoint.getTenantId())) {
            queryWrapper.eq(InsSecurityInspectionPoint::getTenantId, insSecurityInspectionPoint.getTenantId());
        }
        if (insSecurityInspectionPoint.getCorpId() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getCorpId, insSecurityInspectionPoint.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionPoint.getCorpName())) {
            queryWrapper.eq(InsSecurityInspectionPoint::getCorpName, insSecurityInspectionPoint.getCorpName());
        }
        if (insSecurityInspectionPoint.getInstitutionId() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getInstitutionId, insSecurityInspectionPoint.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionPoint.getInstitutionName())) {
            queryWrapper.eq(InsSecurityInspectionPoint::getInstitutionName, insSecurityInspectionPoint.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionPoint.getPointName())) {
            queryWrapper.eq(InsSecurityInspectionPoint::getPointName, insSecurityInspectionPoint.getPointName());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionPoint.getPointPosition())) {
            queryWrapper.eq(InsSecurityInspectionPoint::getPointPosition, insSecurityInspectionPoint.getPointPosition());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionPoint.getQrCodePath())) {
            queryWrapper.eq(InsSecurityInspectionPoint::getQrCodePath, insSecurityInspectionPoint.getQrCodePath());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionPoint.getRemark())) {
            queryWrapper.eq(InsSecurityInspectionPoint::getRemark, insSecurityInspectionPoint.getRemark());
        }
        if (insSecurityInspectionPoint.getCreateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getCreateUser, insSecurityInspectionPoint.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionPoint.getCreateName())) {
            queryWrapper.eq(InsSecurityInspectionPoint::getCreateName, insSecurityInspectionPoint.getCreateName());
        }
        if (insSecurityInspectionPoint.getCreateDept() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getCreateDept, insSecurityInspectionPoint.getCreateDept());
        }
        if (insSecurityInspectionPoint.getCreateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getCreateTime, insSecurityInspectionPoint.getCreateTime());
        }
        if (insSecurityInspectionPoint.getUpdateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getUpdateUser, insSecurityInspectionPoint.getUpdateUser());
        }
        if (insSecurityInspectionPoint.getUpdateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getUpdateTime, insSecurityInspectionPoint.getUpdateTime());
        }
        if (insSecurityInspectionPoint.getIsDeleted() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getIsDeleted, insSecurityInspectionPoint.getIsDeleted());
        }
        if (insSecurityInspectionPoint.getStatus() != null) {
            queryWrapper.eq(InsSecurityInspectionPoint::getStatus, insSecurityInspectionPoint.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSecurityInspectionPoint 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionPoint insert(InsSecurityInspectionPoint insSecurityInspectionPoint) {
        insSecurityInspectionPoint.setId(null);
        getBaseMapper().insert(insSecurityInspectionPoint);
        return insSecurityInspectionPoint;
    }

    /**
    * 更新数据
    *
    * @param insSecurityInspectionPoint 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionPoint update(InsSecurityInspectionPoint insSecurityInspectionPoint) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSecurityInspectionPoint> chainWrapper = new LambdaUpdateChainWrapper<InsSecurityInspectionPoint>(getBaseMapper());
        if (insSecurityInspectionPoint.getId() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getId, insSecurityInspectionPoint.getId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionPoint.getTenantId())) {
            chainWrapper.set(InsSecurityInspectionPoint::getTenantId, insSecurityInspectionPoint.getTenantId());
        }
        if (insSecurityInspectionPoint.getCorpId() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getCorpId, insSecurityInspectionPoint.getCorpId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionPoint.getCorpName())) {
            chainWrapper.set(InsSecurityInspectionPoint::getCorpName, insSecurityInspectionPoint.getCorpName());
        }
        if (insSecurityInspectionPoint.getInstitutionId() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getInstitutionId, insSecurityInspectionPoint.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionPoint.getInstitutionName())) {
            chainWrapper.set(InsSecurityInspectionPoint::getInstitutionName, insSecurityInspectionPoint.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionPoint.getPointName())) {
            chainWrapper.set(InsSecurityInspectionPoint::getPointName, insSecurityInspectionPoint.getPointName());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionPoint.getPointPosition())) {
            chainWrapper.set(InsSecurityInspectionPoint::getPointPosition, insSecurityInspectionPoint.getPointPosition());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionPoint.getQrCodePath())) {
            chainWrapper.set(InsSecurityInspectionPoint::getQrCodePath, insSecurityInspectionPoint.getQrCodePath());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionPoint.getRemark())) {
            chainWrapper.set(InsSecurityInspectionPoint::getRemark, insSecurityInspectionPoint.getRemark());
        }
        if (insSecurityInspectionPoint.getCreateUser() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getCreateUser, insSecurityInspectionPoint.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionPoint.getCreateName())) {
            chainWrapper.set(InsSecurityInspectionPoint::getCreateName, insSecurityInspectionPoint.getCreateName());
        }
        if (insSecurityInspectionPoint.getCreateDept() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getCreateDept, insSecurityInspectionPoint.getCreateDept());
        }
        if (insSecurityInspectionPoint.getCreateTime() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getCreateTime, insSecurityInspectionPoint.getCreateTime());
        }
        if (insSecurityInspectionPoint.getUpdateUser() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getUpdateUser, insSecurityInspectionPoint.getUpdateUser());
        }
        if (insSecurityInspectionPoint.getUpdateTime() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getUpdateTime, insSecurityInspectionPoint.getUpdateTime());
        }
        if (insSecurityInspectionPoint.getIsDeleted() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getIsDeleted, insSecurityInspectionPoint.getIsDeleted());
        }
        if (insSecurityInspectionPoint.getStatus() != null) {
            chainWrapper.set(InsSecurityInspectionPoint::getStatus, insSecurityInspectionPoint.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSecurityInspectionPoint::getId, insSecurityInspectionPoint.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSecurityInspectionPoint.getId());
        } else {
            return insSecurityInspectionPoint;
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
    public boolean saveInsSecurityInspectionPointBatch(List<InsSecurityInspectionPoint> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSecurityInspectionPoint insSecurityInspectionPoint : insertList) {
            //使用默认的雪花算法生成
            insSecurityInspectionPoint.setId(null);
            //insSecurityInspectionPoint.setCreatedDt(currentDte);
            //insSecurityInspectionPoint.setUpdatedDt(currentDte);
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
    public Integer deleteInsSecurityInspectionPointBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSecurityInspectionPoint> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


