package cn.pluss.platform.service.insElderCheckAudit.impl;

import cn.pluss.platform.mapper.InsElderCheckAuditMapper;
import cn.pluss.platform.model.entity.InsElderCheckAudit;
import cn.pluss.platform.service.insElderCheckAudit.InsElderCheckAuditService;
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
@Service("insElderCheckAuditService")
public class InsElderCheckAuditServiceImpl extends ServiceImpl< InsElderCheckAuditMapper, InsElderCheckAudit> implements InsElderCheckAuditService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderCheckAuditServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderCheckAudit> queryPage(Map map) {
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
    public InsElderCheckAudit queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderCheckAudit 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderCheckAudit queryOne(InsElderCheckAudit insElderCheckAudit){
        LambdaQueryWrapper<InsElderCheckAudit> queryWrapper = getQueryWrapper(insElderCheckAudit);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderCheckAudit
    * @return
    */
    @Override
    public List<InsElderCheckAudit> queryList(InsElderCheckAudit insElderCheckAudit) {
        LambdaQueryWrapper<InsElderCheckAudit> queryWrapper = getQueryWrapper(insElderCheckAudit);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderCheckAudit
    * @return
    */
    public static LambdaQueryWrapper<InsElderCheckAudit> getQueryWrapper(InsElderCheckAudit insElderCheckAudit){
        LambdaQueryWrapper<InsElderCheckAudit> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderCheckAudit.getId() != null) {
            queryWrapper.eq(InsElderCheckAudit::getId, insElderCheckAudit.getId());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getTenantId())) {
            queryWrapper.eq(InsElderCheckAudit::getTenantId, insElderCheckAudit.getTenantId());
        }
        if (insElderCheckAudit.getCorpId() != null) {
            queryWrapper.eq(InsElderCheckAudit::getCorpId, insElderCheckAudit.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getCorpName())) {
            queryWrapper.eq(InsElderCheckAudit::getCorpName, insElderCheckAudit.getCorpName());
        }
        if (insElderCheckAudit.getInstitutionId() != null) {
            queryWrapper.eq(InsElderCheckAudit::getInstitutionId, insElderCheckAudit.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getInstitutionName())) {
            queryWrapper.eq(InsElderCheckAudit::getInstitutionName, insElderCheckAudit.getInstitutionName());
        }
        if (insElderCheckAudit.getCheckId() != null) {
            queryWrapper.eq(InsElderCheckAudit::getCheckId, insElderCheckAudit.getCheckId());
        }
        if (insElderCheckAudit.getCheckDate() != null) {
            queryWrapper.eq(InsElderCheckAudit::getCheckDate, insElderCheckAudit.getCheckDate());
        }
        if (insElderCheckAudit.getElderId() != null) {
            queryWrapper.eq(InsElderCheckAudit::getElderId, insElderCheckAudit.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getElderName())) {
            queryWrapper.eq(InsElderCheckAudit::getElderName, insElderCheckAudit.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getIdCard())) {
            queryWrapper.eq(InsElderCheckAudit::getIdCard, insElderCheckAudit.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getSex())) {
            queryWrapper.eq(InsElderCheckAudit::getSex, insElderCheckAudit.getSex());
        }
        if (insElderCheckAudit.getAuditStep() != null) {
            queryWrapper.eq(InsElderCheckAudit::getAuditStep, insElderCheckAudit.getAuditStep());
        }
        if (insElderCheckAudit.getAuditState() != null) {
            queryWrapper.eq(InsElderCheckAudit::getAuditState, insElderCheckAudit.getAuditState());
        }
        if (insElderCheckAudit.getAuditId() != null) {
            queryWrapper.eq(InsElderCheckAudit::getAuditId, insElderCheckAudit.getAuditId());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getAuditName())) {
            queryWrapper.eq(InsElderCheckAudit::getAuditName, insElderCheckAudit.getAuditName());
        }
        if (insElderCheckAudit.getAuditTime() != null) {
            queryWrapper.eq(InsElderCheckAudit::getAuditTime, insElderCheckAudit.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getAuditMemo())) {
            queryWrapper.eq(InsElderCheckAudit::getAuditMemo, insElderCheckAudit.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getRemark())) {
            queryWrapper.eq(InsElderCheckAudit::getRemark, insElderCheckAudit.getRemark());
        }
        if (insElderCheckAudit.getCreateUser() != null) {
            queryWrapper.eq(InsElderCheckAudit::getCreateUser, insElderCheckAudit.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderCheckAudit.getCreateName())) {
            queryWrapper.eq(InsElderCheckAudit::getCreateName, insElderCheckAudit.getCreateName());
        }
        if (insElderCheckAudit.getCreateDept() != null) {
            queryWrapper.eq(InsElderCheckAudit::getCreateDept, insElderCheckAudit.getCreateDept());
        }
        if (insElderCheckAudit.getCreateTime() != null) {
            queryWrapper.eq(InsElderCheckAudit::getCreateTime, insElderCheckAudit.getCreateTime());
        }
        if (insElderCheckAudit.getUpdateUser() != null) {
            queryWrapper.eq(InsElderCheckAudit::getUpdateUser, insElderCheckAudit.getUpdateUser());
        }
        if (insElderCheckAudit.getUpdateTime() != null) {
            queryWrapper.eq(InsElderCheckAudit::getUpdateTime, insElderCheckAudit.getUpdateTime());
        }
        if (insElderCheckAudit.getIsDeleted() != null) {
            queryWrapper.eq(InsElderCheckAudit::getIsDeleted, insElderCheckAudit.getIsDeleted());
        }
        if (insElderCheckAudit.getStatus() != null) {
            queryWrapper.eq(InsElderCheckAudit::getStatus, insElderCheckAudit.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderCheckAudit 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderCheckAudit insert(InsElderCheckAudit insElderCheckAudit) {
        insElderCheckAudit.setId(null);
        getBaseMapper().insert(insElderCheckAudit);
        return insElderCheckAudit;
    }

    /**
    * 更新数据
    *
    * @param insElderCheckAudit 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderCheckAudit update(InsElderCheckAudit insElderCheckAudit) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderCheckAudit> chainWrapper = new LambdaUpdateChainWrapper<InsElderCheckAudit>(getBaseMapper());
        if (insElderCheckAudit.getId() != null) {
            chainWrapper.set(InsElderCheckAudit::getId, insElderCheckAudit.getId());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getTenantId())) {
            chainWrapper.set(InsElderCheckAudit::getTenantId, insElderCheckAudit.getTenantId());
        }
        if (insElderCheckAudit.getCorpId() != null) {
            chainWrapper.set(InsElderCheckAudit::getCorpId, insElderCheckAudit.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getCorpName())) {
            chainWrapper.set(InsElderCheckAudit::getCorpName, insElderCheckAudit.getCorpName());
        }
        if (insElderCheckAudit.getInstitutionId() != null) {
            chainWrapper.set(InsElderCheckAudit::getInstitutionId, insElderCheckAudit.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getInstitutionName())) {
            chainWrapper.set(InsElderCheckAudit::getInstitutionName, insElderCheckAudit.getInstitutionName());
        }
        if (insElderCheckAudit.getCheckId() != null) {
            chainWrapper.set(InsElderCheckAudit::getCheckId, insElderCheckAudit.getCheckId());
        }
        if (insElderCheckAudit.getCheckDate() != null) {
            chainWrapper.set(InsElderCheckAudit::getCheckDate, insElderCheckAudit.getCheckDate());
        }
        if (insElderCheckAudit.getElderId() != null) {
            chainWrapper.set(InsElderCheckAudit::getElderId, insElderCheckAudit.getElderId());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getElderName())) {
            chainWrapper.set(InsElderCheckAudit::getElderName, insElderCheckAudit.getElderName());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getIdCard())) {
            chainWrapper.set(InsElderCheckAudit::getIdCard, insElderCheckAudit.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getSex())) {
            chainWrapper.set(InsElderCheckAudit::getSex, insElderCheckAudit.getSex());
        }
        if (insElderCheckAudit.getAuditStep() != null) {
            chainWrapper.set(InsElderCheckAudit::getAuditStep, insElderCheckAudit.getAuditStep());
        }
        if (insElderCheckAudit.getAuditState() != null) {
            chainWrapper.set(InsElderCheckAudit::getAuditState, insElderCheckAudit.getAuditState());
        }
        if (insElderCheckAudit.getAuditId() != null) {
            chainWrapper.set(InsElderCheckAudit::getAuditId, insElderCheckAudit.getAuditId());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getAuditName())) {
            chainWrapper.set(InsElderCheckAudit::getAuditName, insElderCheckAudit.getAuditName());
        }
        if (insElderCheckAudit.getAuditTime() != null) {
            chainWrapper.set(InsElderCheckAudit::getAuditTime, insElderCheckAudit.getAuditTime());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getAuditMemo())) {
            chainWrapper.set(InsElderCheckAudit::getAuditMemo, insElderCheckAudit.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getRemark())) {
            chainWrapper.set(InsElderCheckAudit::getRemark, insElderCheckAudit.getRemark());
        }
        if (insElderCheckAudit.getCreateUser() != null) {
            chainWrapper.set(InsElderCheckAudit::getCreateUser, insElderCheckAudit.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderCheckAudit.getCreateName())) {
            chainWrapper.set(InsElderCheckAudit::getCreateName, insElderCheckAudit.getCreateName());
        }
        if (insElderCheckAudit.getCreateDept() != null) {
            chainWrapper.set(InsElderCheckAudit::getCreateDept, insElderCheckAudit.getCreateDept());
        }
        if (insElderCheckAudit.getCreateTime() != null) {
            chainWrapper.set(InsElderCheckAudit::getCreateTime, insElderCheckAudit.getCreateTime());
        }
        if (insElderCheckAudit.getUpdateUser() != null) {
            chainWrapper.set(InsElderCheckAudit::getUpdateUser, insElderCheckAudit.getUpdateUser());
        }
        if (insElderCheckAudit.getUpdateTime() != null) {
            chainWrapper.set(InsElderCheckAudit::getUpdateTime, insElderCheckAudit.getUpdateTime());
        }
        if (insElderCheckAudit.getIsDeleted() != null) {
            chainWrapper.set(InsElderCheckAudit::getIsDeleted, insElderCheckAudit.getIsDeleted());
        }
        if (insElderCheckAudit.getStatus() != null) {
            chainWrapper.set(InsElderCheckAudit::getStatus, insElderCheckAudit.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderCheckAudit::getId, insElderCheckAudit.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderCheckAudit.getId());
        } else {
            return insElderCheckAudit;
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
    public boolean saveInsElderCheckAuditBatch(List<InsElderCheckAudit> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderCheckAudit insElderCheckAudit : insertList) {
            //使用默认的雪花算法生成
            insElderCheckAudit.setId(null);
            //insElderCheckAudit.setCreatedDt(currentDte);
            //insElderCheckAudit.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderCheckAuditBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderCheckAudit> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


