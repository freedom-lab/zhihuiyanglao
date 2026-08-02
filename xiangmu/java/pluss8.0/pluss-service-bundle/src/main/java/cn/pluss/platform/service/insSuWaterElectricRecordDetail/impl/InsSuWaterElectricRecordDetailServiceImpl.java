package cn.pluss.platform.service.insSuWaterElectricRecordDetail.impl;

import cn.pluss.platform.mapper.InsSuWaterElectricRecordDetailMapper;
import cn.pluss.platform.model.entity.InsSuWaterElectricRecordDetail;
import cn.pluss.platform.service.insSuWaterElectricRecordDetail.InsSuWaterElectricRecordDetailService;
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
@Service("insSuWaterElectricRecordDetailService")
public class InsSuWaterElectricRecordDetailServiceImpl extends ServiceImpl< InsSuWaterElectricRecordDetailMapper, InsSuWaterElectricRecordDetail> implements InsSuWaterElectricRecordDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsSuWaterElectricRecordDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSuWaterElectricRecordDetail> queryPage(Map map) {
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
    public InsSuWaterElectricRecordDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSuWaterElectricRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsSuWaterElectricRecordDetail queryOne(InsSuWaterElectricRecordDetail insSuWaterElectricRecordDetail){
        LambdaQueryWrapper<InsSuWaterElectricRecordDetail> queryWrapper = getQueryWrapper(insSuWaterElectricRecordDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSuWaterElectricRecordDetail
    * @return
    */
    @Override
    public List<InsSuWaterElectricRecordDetail> queryList(InsSuWaterElectricRecordDetail insSuWaterElectricRecordDetail) {
        LambdaQueryWrapper<InsSuWaterElectricRecordDetail> queryWrapper = getQueryWrapper(insSuWaterElectricRecordDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSuWaterElectricRecordDetail
    * @return
    */
    public static LambdaQueryWrapper<InsSuWaterElectricRecordDetail> getQueryWrapper(InsSuWaterElectricRecordDetail insSuWaterElectricRecordDetail){
        LambdaQueryWrapper<InsSuWaterElectricRecordDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insSuWaterElectricRecordDetail.getId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getId, insSuWaterElectricRecordDetail.getId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getTenantId())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getTenantId, insSuWaterElectricRecordDetail.getTenantId());
        }
        if (insSuWaterElectricRecordDetail.getCorpId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getCorpId, insSuWaterElectricRecordDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getCorpName())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getCorpName, insSuWaterElectricRecordDetail.getCorpName());
        }
        if (insSuWaterElectricRecordDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getInstitutionId, insSuWaterElectricRecordDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getInstitutionName())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getInstitutionName, insSuWaterElectricRecordDetail.getInstitutionName());
        }
        if (insSuWaterElectricRecordDetail.getRecordId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getRecordId, insSuWaterElectricRecordDetail.getRecordId());
        }
        if (insSuWaterElectricRecordDetail.getCheckId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getCheckId, insSuWaterElectricRecordDetail.getCheckId());
        }
        if (insSuWaterElectricRecordDetail.getCheckDate() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getCheckDate, insSuWaterElectricRecordDetail.getCheckDate());
        }
        if (insSuWaterElectricRecordDetail.getElderId() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getElderId, insSuWaterElectricRecordDetail.getElderId());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getElderName())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getElderName, insSuWaterElectricRecordDetail.getElderName());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getIdCard())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getIdCard, insSuWaterElectricRecordDetail.getIdCard());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getSex())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getSex, insSuWaterElectricRecordDetail.getSex());
        }
        if (insSuWaterElectricRecordDetail.getElectricAmount() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getElectricAmount, insSuWaterElectricRecordDetail.getElectricAmount());
        }
        if (insSuWaterElectricRecordDetail.getWaterAmount() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getWaterAmount, insSuWaterElectricRecordDetail.getWaterAmount());
        }
        if (insSuWaterElectricRecordDetail.getStartDate() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getStartDate, insSuWaterElectricRecordDetail.getStartDate());
        }
        if (insSuWaterElectricRecordDetail.getEndDate() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getEndDate, insSuWaterElectricRecordDetail.getEndDate());
        }
        if (insSuWaterElectricRecordDetail.getSettlementState() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getSettlementState, insSuWaterElectricRecordDetail.getSettlementState());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getAreaCode())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getAreaCode, insSuWaterElectricRecordDetail.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getAreaName())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getAreaName, insSuWaterElectricRecordDetail.getAreaName());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getRemark())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getRemark, insSuWaterElectricRecordDetail.getRemark());
        }
        if (insSuWaterElectricRecordDetail.getCreateUser() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getCreateUser, insSuWaterElectricRecordDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSuWaterElectricRecordDetail.getCreateName())) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getCreateName, insSuWaterElectricRecordDetail.getCreateName());
        }
        if (insSuWaterElectricRecordDetail.getCreateDept() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getCreateDept, insSuWaterElectricRecordDetail.getCreateDept());
        }
        if (insSuWaterElectricRecordDetail.getCreateTime() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getCreateTime, insSuWaterElectricRecordDetail.getCreateTime());
        }
        if (insSuWaterElectricRecordDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getUpdateUser, insSuWaterElectricRecordDetail.getUpdateUser());
        }
        if (insSuWaterElectricRecordDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getUpdateTime, insSuWaterElectricRecordDetail.getUpdateTime());
        }
        if (insSuWaterElectricRecordDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getIsDeleted, insSuWaterElectricRecordDetail.getIsDeleted());
        }
        if (insSuWaterElectricRecordDetail.getStatus() != null) {
            queryWrapper.eq(InsSuWaterElectricRecordDetail::getStatus, insSuWaterElectricRecordDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSuWaterElectricRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuWaterElectricRecordDetail insert(InsSuWaterElectricRecordDetail insSuWaterElectricRecordDetail) {
        insSuWaterElectricRecordDetail.setId(null);
        getBaseMapper().insert(insSuWaterElectricRecordDetail);
        return insSuWaterElectricRecordDetail;
    }

    /**
    * 更新数据
    *
    * @param insSuWaterElectricRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuWaterElectricRecordDetail update(InsSuWaterElectricRecordDetail insSuWaterElectricRecordDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSuWaterElectricRecordDetail> chainWrapper = new LambdaUpdateChainWrapper<InsSuWaterElectricRecordDetail>(getBaseMapper());
        if (insSuWaterElectricRecordDetail.getId() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getId, insSuWaterElectricRecordDetail.getId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getTenantId())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getTenantId, insSuWaterElectricRecordDetail.getTenantId());
        }
        if (insSuWaterElectricRecordDetail.getCorpId() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getCorpId, insSuWaterElectricRecordDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getCorpName())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getCorpName, insSuWaterElectricRecordDetail.getCorpName());
        }
        if (insSuWaterElectricRecordDetail.getInstitutionId() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getInstitutionId, insSuWaterElectricRecordDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getInstitutionName())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getInstitutionName, insSuWaterElectricRecordDetail.getInstitutionName());
        }
        if (insSuWaterElectricRecordDetail.getRecordId() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getRecordId, insSuWaterElectricRecordDetail.getRecordId());
        }
        if (insSuWaterElectricRecordDetail.getCheckId() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getCheckId, insSuWaterElectricRecordDetail.getCheckId());
        }
        if (insSuWaterElectricRecordDetail.getCheckDate() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getCheckDate, insSuWaterElectricRecordDetail.getCheckDate());
        }
        if (insSuWaterElectricRecordDetail.getElderId() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getElderId, insSuWaterElectricRecordDetail.getElderId());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getElderName())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getElderName, insSuWaterElectricRecordDetail.getElderName());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getIdCard())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getIdCard, insSuWaterElectricRecordDetail.getIdCard());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getSex())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getSex, insSuWaterElectricRecordDetail.getSex());
        }
        if (insSuWaterElectricRecordDetail.getElectricAmount() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getElectricAmount, insSuWaterElectricRecordDetail.getElectricAmount());
        }
        if (insSuWaterElectricRecordDetail.getWaterAmount() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getWaterAmount, insSuWaterElectricRecordDetail.getWaterAmount());
        }
        if (insSuWaterElectricRecordDetail.getStartDate() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getStartDate, insSuWaterElectricRecordDetail.getStartDate());
        }
        if (insSuWaterElectricRecordDetail.getEndDate() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getEndDate, insSuWaterElectricRecordDetail.getEndDate());
        }
        if (insSuWaterElectricRecordDetail.getSettlementState() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getSettlementState, insSuWaterElectricRecordDetail.getSettlementState());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getAreaCode())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getAreaCode, insSuWaterElectricRecordDetail.getAreaCode());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getAreaName())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getAreaName, insSuWaterElectricRecordDetail.getAreaName());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getRemark())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getRemark, insSuWaterElectricRecordDetail.getRemark());
        }
        if (insSuWaterElectricRecordDetail.getCreateUser() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getCreateUser, insSuWaterElectricRecordDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSuWaterElectricRecordDetail.getCreateName())) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getCreateName, insSuWaterElectricRecordDetail.getCreateName());
        }
        if (insSuWaterElectricRecordDetail.getCreateDept() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getCreateDept, insSuWaterElectricRecordDetail.getCreateDept());
        }
        if (insSuWaterElectricRecordDetail.getCreateTime() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getCreateTime, insSuWaterElectricRecordDetail.getCreateTime());
        }
        if (insSuWaterElectricRecordDetail.getUpdateUser() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getUpdateUser, insSuWaterElectricRecordDetail.getUpdateUser());
        }
        if (insSuWaterElectricRecordDetail.getUpdateTime() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getUpdateTime, insSuWaterElectricRecordDetail.getUpdateTime());
        }
        if (insSuWaterElectricRecordDetail.getIsDeleted() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getIsDeleted, insSuWaterElectricRecordDetail.getIsDeleted());
        }
        if (insSuWaterElectricRecordDetail.getStatus() != null) {
            chainWrapper.set(InsSuWaterElectricRecordDetail::getStatus, insSuWaterElectricRecordDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSuWaterElectricRecordDetail::getId, insSuWaterElectricRecordDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSuWaterElectricRecordDetail.getId());
        } else {
            return insSuWaterElectricRecordDetail;
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
    public boolean saveInsSuWaterElectricRecordDetailBatch(List<InsSuWaterElectricRecordDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSuWaterElectricRecordDetail insSuWaterElectricRecordDetail : insertList) {
            //使用默认的雪花算法生成
            insSuWaterElectricRecordDetail.setId(null);
            //insSuWaterElectricRecordDetail.setCreatedDt(currentDte);
            //insSuWaterElectricRecordDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsSuWaterElectricRecordDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSuWaterElectricRecordDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


