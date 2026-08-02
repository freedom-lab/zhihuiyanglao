package cn.pluss.platform.service.insInstitutionEvaluate.impl;

import cn.pluss.platform.mapper.InsInstitutionEvaluateMapper;
import cn.pluss.platform.model.entity.InsInstitutionEvaluate;
import cn.pluss.platform.service.insInstitutionEvaluate.InsInstitutionEvaluateService;
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
@Service("insInstitutionEvaluateService")
public class InsInstitutionEvaluateServiceImpl extends ServiceImpl< InsInstitutionEvaluateMapper, InsInstitutionEvaluate> implements InsInstitutionEvaluateService {
    private static final Logger logger = LoggerFactory.getLogger(InsInstitutionEvaluateServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsInstitutionEvaluate> queryPage(Map map) {
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
    public InsInstitutionEvaluate queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insInstitutionEvaluate 实例对象
    * @return 实例对象
    */
    @Override
    public InsInstitutionEvaluate queryOne(InsInstitutionEvaluate insInstitutionEvaluate){
        LambdaQueryWrapper<InsInstitutionEvaluate> queryWrapper = getQueryWrapper(insInstitutionEvaluate);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insInstitutionEvaluate
    * @return
    */
    @Override
    public List<InsInstitutionEvaluate> queryList(InsInstitutionEvaluate insInstitutionEvaluate) {
        LambdaQueryWrapper<InsInstitutionEvaluate> queryWrapper = getQueryWrapper(insInstitutionEvaluate);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insInstitutionEvaluate
    * @return
    */
    public static LambdaQueryWrapper<InsInstitutionEvaluate> getQueryWrapper(InsInstitutionEvaluate insInstitutionEvaluate){
        LambdaQueryWrapper<InsInstitutionEvaluate> queryWrapper = new LambdaQueryWrapper<>();
        if (insInstitutionEvaluate.getId() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getId, insInstitutionEvaluate.getId());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getTenantId())) {
            queryWrapper.eq(InsInstitutionEvaluate::getTenantId, insInstitutionEvaluate.getTenantId());
        }
        if (insInstitutionEvaluate.getCorpId() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getCorpId, insInstitutionEvaluate.getCorpId());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getCorpName())) {
            queryWrapper.eq(InsInstitutionEvaluate::getCorpName, insInstitutionEvaluate.getCorpName());
        }
        if (insInstitutionEvaluate.getInstitutionId() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getInstitutionId, insInstitutionEvaluate.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getInstitutionName())) {
            queryWrapper.eq(InsInstitutionEvaluate::getInstitutionName, insInstitutionEvaluate.getInstitutionName());
        }
        if (insInstitutionEvaluate.getEvaluatorId() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getEvaluatorId, insInstitutionEvaluate.getEvaluatorId());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getEvaluatorName())) {
            queryWrapper.eq(InsInstitutionEvaluate::getEvaluatorName, insInstitutionEvaluate.getEvaluatorName());
        }
        if (insInstitutionEvaluate.getEnvironmentEvaluate() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getEnvironmentEvaluate, insInstitutionEvaluate.getEnvironmentEvaluate());
        }
        if (insInstitutionEvaluate.getServiceEvaluate() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getServiceEvaluate, insInstitutionEvaluate.getServiceEvaluate());
        }
        if (insInstitutionEvaluate.getFoodEvaluate() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getFoodEvaluate, insInstitutionEvaluate.getFoodEvaluate());
        }
        if (insInstitutionEvaluate.getCompEvaluate() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getCompEvaluate, insInstitutionEvaluate.getCompEvaluate());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getEvaluateContent())) {
            queryWrapper.eq(InsInstitutionEvaluate::getEvaluateContent, insInstitutionEvaluate.getEvaluateContent());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getEvaluateImg())) {
            queryWrapper.eq(InsInstitutionEvaluate::getEvaluateImg, insInstitutionEvaluate.getEvaluateImg());
        }
        if (insInstitutionEvaluate.getAuditId() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getAuditId, insInstitutionEvaluate.getAuditId());
        }
        if (insInstitutionEvaluate.getAuditState() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getAuditState, insInstitutionEvaluate.getAuditState());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getAuditName())) {
            queryWrapper.eq(InsInstitutionEvaluate::getAuditName, insInstitutionEvaluate.getAuditName());
        }
        if (insInstitutionEvaluate.getAuditTime() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getAuditTime, insInstitutionEvaluate.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getAuditMemo())) {
            queryWrapper.eq(InsInstitutionEvaluate::getAuditMemo, insInstitutionEvaluate.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getRemark())) {
            queryWrapper.eq(InsInstitutionEvaluate::getRemark, insInstitutionEvaluate.getRemark());
        }
        if (insInstitutionEvaluate.getCreateUser() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getCreateUser, insInstitutionEvaluate.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insInstitutionEvaluate.getCreateName())) {
            queryWrapper.eq(InsInstitutionEvaluate::getCreateName, insInstitutionEvaluate.getCreateName());
        }
        if (insInstitutionEvaluate.getCreateDept() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getCreateDept, insInstitutionEvaluate.getCreateDept());
        }
        if (insInstitutionEvaluate.getCreateTime() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getCreateTime, insInstitutionEvaluate.getCreateTime());
        }
        if (insInstitutionEvaluate.getUpdateUser() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getUpdateUser, insInstitutionEvaluate.getUpdateUser());
        }
        if (insInstitutionEvaluate.getUpdateTime() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getUpdateTime, insInstitutionEvaluate.getUpdateTime());
        }
        if (insInstitutionEvaluate.getIsDeleted() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getIsDeleted, insInstitutionEvaluate.getIsDeleted());
        }
        if (insInstitutionEvaluate.getStatus() != null) {
            queryWrapper.eq(InsInstitutionEvaluate::getStatus, insInstitutionEvaluate.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insInstitutionEvaluate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsInstitutionEvaluate insert(InsInstitutionEvaluate insInstitutionEvaluate) {
        insInstitutionEvaluate.setId(null);
        getBaseMapper().insert(insInstitutionEvaluate);
        return insInstitutionEvaluate;
    }

    /**
    * 更新数据
    *
    * @param insInstitutionEvaluate 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsInstitutionEvaluate update(InsInstitutionEvaluate insInstitutionEvaluate) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsInstitutionEvaluate> chainWrapper = new LambdaUpdateChainWrapper<InsInstitutionEvaluate>(getBaseMapper());
        if (insInstitutionEvaluate.getId() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getId, insInstitutionEvaluate.getId());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getTenantId())) {
            chainWrapper.set(InsInstitutionEvaluate::getTenantId, insInstitutionEvaluate.getTenantId());
        }
        if (insInstitutionEvaluate.getCorpId() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getCorpId, insInstitutionEvaluate.getCorpId());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getCorpName())) {
            chainWrapper.set(InsInstitutionEvaluate::getCorpName, insInstitutionEvaluate.getCorpName());
        }
        if (insInstitutionEvaluate.getInstitutionId() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getInstitutionId, insInstitutionEvaluate.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getInstitutionName())) {
            chainWrapper.set(InsInstitutionEvaluate::getInstitutionName, insInstitutionEvaluate.getInstitutionName());
        }
        if (insInstitutionEvaluate.getEvaluatorId() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getEvaluatorId, insInstitutionEvaluate.getEvaluatorId());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getEvaluatorName())) {
            chainWrapper.set(InsInstitutionEvaluate::getEvaluatorName, insInstitutionEvaluate.getEvaluatorName());
        }
        if (insInstitutionEvaluate.getEnvironmentEvaluate() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getEnvironmentEvaluate, insInstitutionEvaluate.getEnvironmentEvaluate());
        }
        if (insInstitutionEvaluate.getServiceEvaluate() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getServiceEvaluate, insInstitutionEvaluate.getServiceEvaluate());
        }
        if (insInstitutionEvaluate.getFoodEvaluate() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getFoodEvaluate, insInstitutionEvaluate.getFoodEvaluate());
        }
        if (insInstitutionEvaluate.getCompEvaluate() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getCompEvaluate, insInstitutionEvaluate.getCompEvaluate());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getEvaluateContent())) {
            chainWrapper.set(InsInstitutionEvaluate::getEvaluateContent, insInstitutionEvaluate.getEvaluateContent());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getEvaluateImg())) {
            chainWrapper.set(InsInstitutionEvaluate::getEvaluateImg, insInstitutionEvaluate.getEvaluateImg());
        }
        if (insInstitutionEvaluate.getAuditId() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getAuditId, insInstitutionEvaluate.getAuditId());
        }
        if (insInstitutionEvaluate.getAuditState() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getAuditState, insInstitutionEvaluate.getAuditState());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getAuditName())) {
            chainWrapper.set(InsInstitutionEvaluate::getAuditName, insInstitutionEvaluate.getAuditName());
        }
        if (insInstitutionEvaluate.getAuditTime() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getAuditTime, insInstitutionEvaluate.getAuditTime());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getAuditMemo())) {
            chainWrapper.set(InsInstitutionEvaluate::getAuditMemo, insInstitutionEvaluate.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getRemark())) {
            chainWrapper.set(InsInstitutionEvaluate::getRemark, insInstitutionEvaluate.getRemark());
        }
        if (insInstitutionEvaluate.getCreateUser() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getCreateUser, insInstitutionEvaluate.getCreateUser());
        }
        if (StringUtil.isNotBlank(insInstitutionEvaluate.getCreateName())) {
            chainWrapper.set(InsInstitutionEvaluate::getCreateName, insInstitutionEvaluate.getCreateName());
        }
        if (insInstitutionEvaluate.getCreateDept() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getCreateDept, insInstitutionEvaluate.getCreateDept());
        }
        if (insInstitutionEvaluate.getCreateTime() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getCreateTime, insInstitutionEvaluate.getCreateTime());
        }
        if (insInstitutionEvaluate.getUpdateUser() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getUpdateUser, insInstitutionEvaluate.getUpdateUser());
        }
        if (insInstitutionEvaluate.getUpdateTime() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getUpdateTime, insInstitutionEvaluate.getUpdateTime());
        }
        if (insInstitutionEvaluate.getIsDeleted() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getIsDeleted, insInstitutionEvaluate.getIsDeleted());
        }
        if (insInstitutionEvaluate.getStatus() != null) {
            chainWrapper.set(InsInstitutionEvaluate::getStatus, insInstitutionEvaluate.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsInstitutionEvaluate::getId, insInstitutionEvaluate.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insInstitutionEvaluate.getId());
        } else {
            return insInstitutionEvaluate;
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
    public boolean saveInsInstitutionEvaluateBatch(List<InsInstitutionEvaluate> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsInstitutionEvaluate insInstitutionEvaluate : insertList) {
            //使用默认的雪花算法生成
            insInstitutionEvaluate.setId(null);
            //insInstitutionEvaluate.setCreatedDt(currentDte);
            //insInstitutionEvaluate.setUpdatedDt(currentDte);
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
    public Integer deleteInsInstitutionEvaluateBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsInstitutionEvaluate> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


