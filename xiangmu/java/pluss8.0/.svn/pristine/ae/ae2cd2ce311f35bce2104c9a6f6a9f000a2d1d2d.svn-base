package cn.pluss.platform.service.insElderRelativesBinding.impl;

import cn.pluss.platform.mapper.InsElderRelativesBindingMapper;
import cn.pluss.platform.model.entity.InsElderRelativesBinding;
import cn.pluss.platform.service.insElderRelativesBinding.InsElderRelativesBindingService;
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
@Service("insElderRelativesBindingService")
public class InsElderRelativesBindingServiceImpl extends ServiceImpl< InsElderRelativesBindingMapper, InsElderRelativesBinding> implements InsElderRelativesBindingService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderRelativesBindingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderRelativesBinding> queryPage(Map map) {
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
    public InsElderRelativesBinding queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderRelativesBinding 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderRelativesBinding queryOne(InsElderRelativesBinding insElderRelativesBinding){
        LambdaQueryWrapper<InsElderRelativesBinding> queryWrapper = getQueryWrapper(insElderRelativesBinding);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderRelativesBinding
    * @return
    */
    @Override
    public List<InsElderRelativesBinding> queryList(InsElderRelativesBinding insElderRelativesBinding) {
        LambdaQueryWrapper<InsElderRelativesBinding> queryWrapper = getQueryWrapper(insElderRelativesBinding);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderRelativesBinding
    * @return
    */
    public static LambdaQueryWrapper<InsElderRelativesBinding> getQueryWrapper(InsElderRelativesBinding insElderRelativesBinding){
        LambdaQueryWrapper<InsElderRelativesBinding> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderRelativesBinding.getId() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getId, insElderRelativesBinding.getId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getTenantId())) {
            queryWrapper.eq(InsElderRelativesBinding::getTenantId, insElderRelativesBinding.getTenantId());
        }
        if (insElderRelativesBinding.getCorpId() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getCorpId, insElderRelativesBinding.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getCorpName())) {
            queryWrapper.eq(InsElderRelativesBinding::getCorpName, insElderRelativesBinding.getCorpName());
        }
        if (insElderRelativesBinding.getInstitutionId() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getInstitutionId, insElderRelativesBinding.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getInstitutionName())) {
            queryWrapper.eq(InsElderRelativesBinding::getInstitutionName, insElderRelativesBinding.getInstitutionName());
        }
        if (insElderRelativesBinding.getRelativesId() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getRelativesId, insElderRelativesBinding.getRelativesId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getRelativesName())) {
            queryWrapper.eq(InsElderRelativesBinding::getRelativesName, insElderRelativesBinding.getRelativesName());
        }
        if (insElderRelativesBinding.getCheckId() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getCheckId, insElderRelativesBinding.getCheckId());
        }
        if (insElderRelativesBinding.getElderId() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getElderId, insElderRelativesBinding.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getElderName())) {
            queryWrapper.eq(InsElderRelativesBinding::getElderName, insElderRelativesBinding.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getIdCard())) {
            queryWrapper.eq(InsElderRelativesBinding::getIdCard, insElderRelativesBinding.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getSex())) {
            queryWrapper.eq(InsElderRelativesBinding::getSex, insElderRelativesBinding.getSex());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getRelationshipType())) {
            queryWrapper.eq(InsElderRelativesBinding::getRelationshipType, insElderRelativesBinding.getRelationshipType());
        }
        if (insElderRelativesBinding.getAuditState() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getAuditState, insElderRelativesBinding.getAuditState());
        }
        if (insElderRelativesBinding.getAuditId() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getAuditId, insElderRelativesBinding.getAuditId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getAuditName())) {
            queryWrapper.eq(InsElderRelativesBinding::getAuditName, insElderRelativesBinding.getAuditName());
        }
        if (insElderRelativesBinding.getAuditTime() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getAuditTime, insElderRelativesBinding.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getAuditMemo())) {
            queryWrapper.eq(InsElderRelativesBinding::getAuditMemo, insElderRelativesBinding.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getRemark())) {
            queryWrapper.eq(InsElderRelativesBinding::getRemark, insElderRelativesBinding.getRemark());
        }
        if (insElderRelativesBinding.getCreateUser() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getCreateUser, insElderRelativesBinding.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderRelativesBinding.getCreateName())) {
            queryWrapper.eq(InsElderRelativesBinding::getCreateName, insElderRelativesBinding.getCreateName());
        }
        if (insElderRelativesBinding.getCreateDept() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getCreateDept, insElderRelativesBinding.getCreateDept());
        }
        if (insElderRelativesBinding.getCreateTime() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getCreateTime, insElderRelativesBinding.getCreateTime());
        }
        if (insElderRelativesBinding.getUpdateUser() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getUpdateUser, insElderRelativesBinding.getUpdateUser());
        }
        if (insElderRelativesBinding.getUpdateTime() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getUpdateTime, insElderRelativesBinding.getUpdateTime());
        }
        if (insElderRelativesBinding.getIsDeleted() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getIsDeleted, insElderRelativesBinding.getIsDeleted());
        }
        if (insElderRelativesBinding.getStatus() != null) {
            queryWrapper.eq(InsElderRelativesBinding::getStatus, insElderRelativesBinding.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderRelativesBinding 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderRelativesBinding insert(InsElderRelativesBinding insElderRelativesBinding) {
        insElderRelativesBinding.setId(null);
        getBaseMapper().insert(insElderRelativesBinding);
        return insElderRelativesBinding;
    }

    /**
    * 更新数据
    *
    * @param insElderRelativesBinding 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderRelativesBinding update(InsElderRelativesBinding insElderRelativesBinding) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderRelativesBinding> chainWrapper = new LambdaUpdateChainWrapper<InsElderRelativesBinding>(getBaseMapper());
        if (insElderRelativesBinding.getId() != null) {
            chainWrapper.set(InsElderRelativesBinding::getId, insElderRelativesBinding.getId());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getTenantId())) {
            chainWrapper.set(InsElderRelativesBinding::getTenantId, insElderRelativesBinding.getTenantId());
        }
        if (insElderRelativesBinding.getCorpId() != null) {
            chainWrapper.set(InsElderRelativesBinding::getCorpId, insElderRelativesBinding.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getCorpName())) {
            chainWrapper.set(InsElderRelativesBinding::getCorpName, insElderRelativesBinding.getCorpName());
        }
        if (insElderRelativesBinding.getInstitutionId() != null) {
            chainWrapper.set(InsElderRelativesBinding::getInstitutionId, insElderRelativesBinding.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getInstitutionName())) {
            chainWrapper.set(InsElderRelativesBinding::getInstitutionName, insElderRelativesBinding.getInstitutionName());
        }
        if (insElderRelativesBinding.getRelativesId() != null) {
            chainWrapper.set(InsElderRelativesBinding::getRelativesId, insElderRelativesBinding.getRelativesId());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getRelativesName())) {
            chainWrapper.set(InsElderRelativesBinding::getRelativesName, insElderRelativesBinding.getRelativesName());
        }
        if (insElderRelativesBinding.getCheckId() != null) {
            chainWrapper.set(InsElderRelativesBinding::getCheckId, insElderRelativesBinding.getCheckId());
        }
        if (insElderRelativesBinding.getElderId() != null) {
            chainWrapper.set(InsElderRelativesBinding::getElderId, insElderRelativesBinding.getElderId());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getElderName())) {
            chainWrapper.set(InsElderRelativesBinding::getElderName, insElderRelativesBinding.getElderName());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getIdCard())) {
            chainWrapper.set(InsElderRelativesBinding::getIdCard, insElderRelativesBinding.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getSex())) {
            chainWrapper.set(InsElderRelativesBinding::getSex, insElderRelativesBinding.getSex());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getRelationshipType())) {
            chainWrapper.set(InsElderRelativesBinding::getRelationshipType, insElderRelativesBinding.getRelationshipType());
        }
        if (insElderRelativesBinding.getAuditState() != null) {
            chainWrapper.set(InsElderRelativesBinding::getAuditState, insElderRelativesBinding.getAuditState());
        }
        if (insElderRelativesBinding.getAuditId() != null) {
            chainWrapper.set(InsElderRelativesBinding::getAuditId, insElderRelativesBinding.getAuditId());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getAuditName())) {
            chainWrapper.set(InsElderRelativesBinding::getAuditName, insElderRelativesBinding.getAuditName());
        }
        if (insElderRelativesBinding.getAuditTime() != null) {
            chainWrapper.set(InsElderRelativesBinding::getAuditTime, insElderRelativesBinding.getAuditTime());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getAuditMemo())) {
            chainWrapper.set(InsElderRelativesBinding::getAuditMemo, insElderRelativesBinding.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getRemark())) {
            chainWrapper.set(InsElderRelativesBinding::getRemark, insElderRelativesBinding.getRemark());
        }
        if (insElderRelativesBinding.getCreateUser() != null) {
            chainWrapper.set(InsElderRelativesBinding::getCreateUser, insElderRelativesBinding.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderRelativesBinding.getCreateName())) {
            chainWrapper.set(InsElderRelativesBinding::getCreateName, insElderRelativesBinding.getCreateName());
        }
        if (insElderRelativesBinding.getCreateDept() != null) {
            chainWrapper.set(InsElderRelativesBinding::getCreateDept, insElderRelativesBinding.getCreateDept());
        }
        if (insElderRelativesBinding.getCreateTime() != null) {
            chainWrapper.set(InsElderRelativesBinding::getCreateTime, insElderRelativesBinding.getCreateTime());
        }
        if (insElderRelativesBinding.getUpdateUser() != null) {
            chainWrapper.set(InsElderRelativesBinding::getUpdateUser, insElderRelativesBinding.getUpdateUser());
        }
        if (insElderRelativesBinding.getUpdateTime() != null) {
            chainWrapper.set(InsElderRelativesBinding::getUpdateTime, insElderRelativesBinding.getUpdateTime());
        }
        if (insElderRelativesBinding.getIsDeleted() != null) {
            chainWrapper.set(InsElderRelativesBinding::getIsDeleted, insElderRelativesBinding.getIsDeleted());
        }
        if (insElderRelativesBinding.getStatus() != null) {
            chainWrapper.set(InsElderRelativesBinding::getStatus, insElderRelativesBinding.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderRelativesBinding::getId, insElderRelativesBinding.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderRelativesBinding.getId());
        } else {
            return insElderRelativesBinding;
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
    public boolean saveInsElderRelativesBindingBatch(List<InsElderRelativesBinding> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderRelativesBinding insElderRelativesBinding : insertList) {
            //使用默认的雪花算法生成
            insElderRelativesBinding.setId(null);
            //insElderRelativesBinding.setCreatedDt(currentDte);
            //insElderRelativesBinding.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderRelativesBindingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderRelativesBinding> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


