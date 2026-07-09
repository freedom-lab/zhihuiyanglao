package cn.pluss.platform.service.insNursingRehabSettingDetail.impl;

import cn.pluss.platform.mapper.InsNursingRehabSettingDetailMapper;
import cn.pluss.platform.model.entity.InsNursingRehabSettingDetail;
import cn.pluss.platform.service.insNursingRehabSettingDetail.InsNursingRehabSettingDetailService;
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
@Service("insNursingRehabSettingDetailService")
public class InsNursingRehabSettingDetailServiceImpl extends ServiceImpl< InsNursingRehabSettingDetailMapper, InsNursingRehabSettingDetail> implements InsNursingRehabSettingDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingRehabSettingDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingRehabSettingDetail> queryPage(Map map) {
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
    public InsNursingRehabSettingDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRehabSettingDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingRehabSettingDetail queryOne(InsNursingRehabSettingDetail insNursingRehabSettingDetail){
        LambdaQueryWrapper<InsNursingRehabSettingDetail> queryWrapper = getQueryWrapper(insNursingRehabSettingDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRehabSettingDetail
    * @return
    */
    @Override
    public List<InsNursingRehabSettingDetail> queryList(InsNursingRehabSettingDetail insNursingRehabSettingDetail) {
        LambdaQueryWrapper<InsNursingRehabSettingDetail> queryWrapper = getQueryWrapper(insNursingRehabSettingDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingRehabSettingDetail
    * @return
    */
    public static LambdaQueryWrapper<InsNursingRehabSettingDetail> getQueryWrapper(InsNursingRehabSettingDetail insNursingRehabSettingDetail){
        LambdaQueryWrapper<InsNursingRehabSettingDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingRehabSettingDetail.getId() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getId, insNursingRehabSettingDetail.getId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getTenantId())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getTenantId, insNursingRehabSettingDetail.getTenantId());
        }
        if (insNursingRehabSettingDetail.getCorpId() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getCorpId, insNursingRehabSettingDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getCorpName())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getCorpName, insNursingRehabSettingDetail.getCorpName());
        }
        if (insNursingRehabSettingDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getInstitutionId, insNursingRehabSettingDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getInstitutionName())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getInstitutionName, insNursingRehabSettingDetail.getInstitutionName());
        }
        if (insNursingRehabSettingDetail.getCheckId() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getCheckId, insNursingRehabSettingDetail.getCheckId());
        }
        if (insNursingRehabSettingDetail.getCheckDate() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getCheckDate, insNursingRehabSettingDetail.getCheckDate());
        }
        if (insNursingRehabSettingDetail.getElderId() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getElderId, insNursingRehabSettingDetail.getElderId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getElderName())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getElderName, insNursingRehabSettingDetail.getElderName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getIdCard())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getIdCard, insNursingRehabSettingDetail.getIdCard());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getSex())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getSex, insNursingRehabSettingDetail.getSex());
        }
        if (insNursingRehabSettingDetail.getSettingId() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getSettingId, insNursingRehabSettingDetail.getSettingId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getPlanName())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getPlanName, insNursingRehabSettingDetail.getPlanName());
        }
        if (insNursingRehabSettingDetail.getItemId() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getItemId, insNursingRehabSettingDetail.getItemId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getItemName())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getItemName, insNursingRehabSettingDetail.getItemName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getStartTime())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getStartTime, insNursingRehabSettingDetail.getStartTime());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getEndTime())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getEndTime, insNursingRehabSettingDetail.getEndTime());
        }
        if (insNursingRehabSettingDetail.getExecuteDate() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getExecuteDate, insNursingRehabSettingDetail.getExecuteDate());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getTrainingContent())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getTrainingContent, insNursingRehabSettingDetail.getTrainingContent());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getRemark())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getRemark, insNursingRehabSettingDetail.getRemark());
        }
        if (insNursingRehabSettingDetail.getCreateUser() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getCreateUser, insNursingRehabSettingDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingRehabSettingDetail.getCreateName())) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getCreateName, insNursingRehabSettingDetail.getCreateName());
        }
        if (insNursingRehabSettingDetail.getCreateDept() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getCreateDept, insNursingRehabSettingDetail.getCreateDept());
        }
        if (insNursingRehabSettingDetail.getCreateTime() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getCreateTime, insNursingRehabSettingDetail.getCreateTime());
        }
        if (insNursingRehabSettingDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getUpdateUser, insNursingRehabSettingDetail.getUpdateUser());
        }
        if (insNursingRehabSettingDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getUpdateTime, insNursingRehabSettingDetail.getUpdateTime());
        }
        if (insNursingRehabSettingDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getIsDeleted, insNursingRehabSettingDetail.getIsDeleted());
        }
        if (insNursingRehabSettingDetail.getStatus() != null) {
            queryWrapper.eq(InsNursingRehabSettingDetail::getStatus, insNursingRehabSettingDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingRehabSettingDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabSettingDetail insert(InsNursingRehabSettingDetail insNursingRehabSettingDetail) {
        insNursingRehabSettingDetail.setId(null);
        getBaseMapper().insert(insNursingRehabSettingDetail);
        return insNursingRehabSettingDetail;
    }

    /**
    * 更新数据
    *
    * @param insNursingRehabSettingDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabSettingDetail update(InsNursingRehabSettingDetail insNursingRehabSettingDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingRehabSettingDetail> chainWrapper = new LambdaUpdateChainWrapper<InsNursingRehabSettingDetail>(getBaseMapper());
        if (insNursingRehabSettingDetail.getId() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getId, insNursingRehabSettingDetail.getId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getTenantId())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getTenantId, insNursingRehabSettingDetail.getTenantId());
        }
        if (insNursingRehabSettingDetail.getCorpId() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getCorpId, insNursingRehabSettingDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getCorpName())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getCorpName, insNursingRehabSettingDetail.getCorpName());
        }
        if (insNursingRehabSettingDetail.getInstitutionId() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getInstitutionId, insNursingRehabSettingDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getInstitutionName())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getInstitutionName, insNursingRehabSettingDetail.getInstitutionName());
        }
        if (insNursingRehabSettingDetail.getCheckId() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getCheckId, insNursingRehabSettingDetail.getCheckId());
        }
        if (insNursingRehabSettingDetail.getCheckDate() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getCheckDate, insNursingRehabSettingDetail.getCheckDate());
        }
        if (insNursingRehabSettingDetail.getElderId() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getElderId, insNursingRehabSettingDetail.getElderId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getElderName())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getElderName, insNursingRehabSettingDetail.getElderName());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getIdCard())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getIdCard, insNursingRehabSettingDetail.getIdCard());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getSex())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getSex, insNursingRehabSettingDetail.getSex());
        }
        if (insNursingRehabSettingDetail.getSettingId() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getSettingId, insNursingRehabSettingDetail.getSettingId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getPlanName())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getPlanName, insNursingRehabSettingDetail.getPlanName());
        }
        if (insNursingRehabSettingDetail.getItemId() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getItemId, insNursingRehabSettingDetail.getItemId());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getItemName())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getItemName, insNursingRehabSettingDetail.getItemName());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getStartTime())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getStartTime, insNursingRehabSettingDetail.getStartTime());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getEndTime())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getEndTime, insNursingRehabSettingDetail.getEndTime());
        }
        if (insNursingRehabSettingDetail.getExecuteDate() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getExecuteDate, insNursingRehabSettingDetail.getExecuteDate());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getTrainingContent())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getTrainingContent, insNursingRehabSettingDetail.getTrainingContent());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getRemark())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getRemark, insNursingRehabSettingDetail.getRemark());
        }
        if (insNursingRehabSettingDetail.getCreateUser() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getCreateUser, insNursingRehabSettingDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingRehabSettingDetail.getCreateName())) {
            chainWrapper.set(InsNursingRehabSettingDetail::getCreateName, insNursingRehabSettingDetail.getCreateName());
        }
        if (insNursingRehabSettingDetail.getCreateDept() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getCreateDept, insNursingRehabSettingDetail.getCreateDept());
        }
        if (insNursingRehabSettingDetail.getCreateTime() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getCreateTime, insNursingRehabSettingDetail.getCreateTime());
        }
        if (insNursingRehabSettingDetail.getUpdateUser() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getUpdateUser, insNursingRehabSettingDetail.getUpdateUser());
        }
        if (insNursingRehabSettingDetail.getUpdateTime() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getUpdateTime, insNursingRehabSettingDetail.getUpdateTime());
        }
        if (insNursingRehabSettingDetail.getIsDeleted() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getIsDeleted, insNursingRehabSettingDetail.getIsDeleted());
        }
        if (insNursingRehabSettingDetail.getStatus() != null) {
            chainWrapper.set(InsNursingRehabSettingDetail::getStatus, insNursingRehabSettingDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingRehabSettingDetail::getId, insNursingRehabSettingDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingRehabSettingDetail.getId());
        } else {
            return insNursingRehabSettingDetail;
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
    public boolean saveInsNursingRehabSettingDetailBatch(List<InsNursingRehabSettingDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingRehabSettingDetail insNursingRehabSettingDetail : insertList) {
            //使用默认的雪花算法生成
            insNursingRehabSettingDetail.setId(null);
            //insNursingRehabSettingDetail.setCreatedDt(currentDte);
            //insNursingRehabSettingDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingRehabSettingDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingRehabSettingDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


