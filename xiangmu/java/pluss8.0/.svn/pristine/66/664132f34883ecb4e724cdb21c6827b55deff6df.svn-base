package cn.pluss.platform.service.insElderNoticeSign.impl;

import cn.pluss.platform.mapper.InsElderNoticeSignMapper;
import cn.pluss.platform.model.entity.InsElderNoticeSign;
import cn.pluss.platform.service.insElderNoticeSign.InsElderNoticeSignService;
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
@Service("insElderNoticeSignService")
public class InsElderNoticeSignServiceImpl extends ServiceImpl< InsElderNoticeSignMapper, InsElderNoticeSign> implements InsElderNoticeSignService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderNoticeSignServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderNoticeSign> queryPage(Map map) {
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
    public InsElderNoticeSign queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderNoticeSign 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderNoticeSign queryOne(InsElderNoticeSign insElderNoticeSign){
        LambdaQueryWrapper<InsElderNoticeSign> queryWrapper = getQueryWrapper(insElderNoticeSign);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderNoticeSign
    * @return
    */
    @Override
    public List<InsElderNoticeSign> queryList(InsElderNoticeSign insElderNoticeSign) {
        LambdaQueryWrapper<InsElderNoticeSign> queryWrapper = getQueryWrapper(insElderNoticeSign);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderNoticeSign
    * @return
    */
    public static LambdaQueryWrapper<InsElderNoticeSign> getQueryWrapper(InsElderNoticeSign insElderNoticeSign){
        LambdaQueryWrapper<InsElderNoticeSign> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderNoticeSign.getId() != null) {
            queryWrapper.eq(InsElderNoticeSign::getId, insElderNoticeSign.getId());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getTenantId())) {
            queryWrapper.eq(InsElderNoticeSign::getTenantId, insElderNoticeSign.getTenantId());
        }
        if (insElderNoticeSign.getCorpId() != null) {
            queryWrapper.eq(InsElderNoticeSign::getCorpId, insElderNoticeSign.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getCorpName())) {
            queryWrapper.eq(InsElderNoticeSign::getCorpName, insElderNoticeSign.getCorpName());
        }
        if (insElderNoticeSign.getInstitutionId() != null) {
            queryWrapper.eq(InsElderNoticeSign::getInstitutionId, insElderNoticeSign.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getInstitutionName())) {
            queryWrapper.eq(InsElderNoticeSign::getInstitutionName, insElderNoticeSign.getInstitutionName());
        }
        if (insElderNoticeSign.getCheckId() != null) {
            queryWrapper.eq(InsElderNoticeSign::getCheckId, insElderNoticeSign.getCheckId());
        }
        if (insElderNoticeSign.getCheckDate() != null) {
            queryWrapper.eq(InsElderNoticeSign::getCheckDate, insElderNoticeSign.getCheckDate());
        }
        if (insElderNoticeSign.getElderId() != null) {
            queryWrapper.eq(InsElderNoticeSign::getElderId, insElderNoticeSign.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getElderName())) {
            queryWrapper.eq(InsElderNoticeSign::getElderName, insElderNoticeSign.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getIdCard())) {
            queryWrapper.eq(InsElderNoticeSign::getIdCard, insElderNoticeSign.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getSex())) {
            queryWrapper.eq(InsElderNoticeSign::getSex, insElderNoticeSign.getSex());
        }
        if (insElderNoticeSign.getNoticeId() != null) {
            queryWrapper.eq(InsElderNoticeSign::getNoticeId, insElderNoticeSign.getNoticeId());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getNoticeName())) {
            queryWrapper.eq(InsElderNoticeSign::getNoticeName, insElderNoticeSign.getNoticeName());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getNoticeContent())) {
            queryWrapper.eq(InsElderNoticeSign::getNoticeContent, insElderNoticeSign.getNoticeContent());
        }
        if (insElderNoticeSign.getNoticeState() != null) {
            queryWrapper.eq(InsElderNoticeSign::getNoticeState, insElderNoticeSign.getNoticeState());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getCodePath())) {
            queryWrapper.eq(InsElderNoticeSign::getCodePath, insElderNoticeSign.getCodePath());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getElderSign())) {
            queryWrapper.eq(InsElderNoticeSign::getElderSign, insElderNoticeSign.getElderSign());
        }
        if (insElderNoticeSign.getElderDate() != null) {
            queryWrapper.eq(InsElderNoticeSign::getElderDate, insElderNoticeSign.getElderDate());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getGuardianSign())) {
            queryWrapper.eq(InsElderNoticeSign::getGuardianSign, insElderNoticeSign.getGuardianSign());
        }
        if (insElderNoticeSign.getGuardianDate() != null) {
            queryWrapper.eq(InsElderNoticeSign::getGuardianDate, insElderNoticeSign.getGuardianDate());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getPostName())) {
            queryWrapper.eq(InsElderNoticeSign::getPostName, insElderNoticeSign.getPostName());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getStafferSign())) {
            queryWrapper.eq(InsElderNoticeSign::getStafferSign, insElderNoticeSign.getStafferSign());
        }
        if (insElderNoticeSign.getStafferDate() != null) {
            queryWrapper.eq(InsElderNoticeSign::getStafferDate, insElderNoticeSign.getStafferDate());
        }
        if (insElderNoticeSign.getAuditState() != null) {
            queryWrapper.eq(InsElderNoticeSign::getAuditState, insElderNoticeSign.getAuditState());
        }
        if (insElderNoticeSign.getAuditId() != null) {
            queryWrapper.eq(InsElderNoticeSign::getAuditId, insElderNoticeSign.getAuditId());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getAuditName())) {
            queryWrapper.eq(InsElderNoticeSign::getAuditName, insElderNoticeSign.getAuditName());
        }
        if (insElderNoticeSign.getAuditTime() != null) {
            queryWrapper.eq(InsElderNoticeSign::getAuditTime, insElderNoticeSign.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getAuditMemo())) {
            queryWrapper.eq(InsElderNoticeSign::getAuditMemo, insElderNoticeSign.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getRemark())) {
            queryWrapper.eq(InsElderNoticeSign::getRemark, insElderNoticeSign.getRemark());
        }
        if (insElderNoticeSign.getCreateUser() != null) {
            queryWrapper.eq(InsElderNoticeSign::getCreateUser, insElderNoticeSign.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderNoticeSign.getCreateName())) {
            queryWrapper.eq(InsElderNoticeSign::getCreateName, insElderNoticeSign.getCreateName());
        }
        if (insElderNoticeSign.getCreateDept() != null) {
            queryWrapper.eq(InsElderNoticeSign::getCreateDept, insElderNoticeSign.getCreateDept());
        }
        if (insElderNoticeSign.getCreateTime() != null) {
            queryWrapper.eq(InsElderNoticeSign::getCreateTime, insElderNoticeSign.getCreateTime());
        }
        if (insElderNoticeSign.getUpdateUser() != null) {
            queryWrapper.eq(InsElderNoticeSign::getUpdateUser, insElderNoticeSign.getUpdateUser());
        }
        if (insElderNoticeSign.getUpdateTime() != null) {
            queryWrapper.eq(InsElderNoticeSign::getUpdateTime, insElderNoticeSign.getUpdateTime());
        }
        if (insElderNoticeSign.getIsDeleted() != null) {
            queryWrapper.eq(InsElderNoticeSign::getIsDeleted, insElderNoticeSign.getIsDeleted());
        }
        if (insElderNoticeSign.getStatus() != null) {
            queryWrapper.eq(InsElderNoticeSign::getStatus, insElderNoticeSign.getStatus());
        }
        if (insElderNoticeSign.getSendState() != null) {
            queryWrapper.eq(InsElderNoticeSign::getSendState, insElderNoticeSign.getSendState());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderNoticeSign 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderNoticeSign insert(InsElderNoticeSign insElderNoticeSign) {
        insElderNoticeSign.setId(null);
        getBaseMapper().insert(insElderNoticeSign);
        return insElderNoticeSign;
    }

    /**
    * 更新数据
    *
    * @param insElderNoticeSign 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderNoticeSign update(InsElderNoticeSign insElderNoticeSign) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderNoticeSign> chainWrapper = new LambdaUpdateChainWrapper<InsElderNoticeSign>(getBaseMapper());
        if (insElderNoticeSign.getId() != null) {
            chainWrapper.set(InsElderNoticeSign::getId, insElderNoticeSign.getId());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getTenantId())) {
            chainWrapper.set(InsElderNoticeSign::getTenantId, insElderNoticeSign.getTenantId());
        }
        if (insElderNoticeSign.getCorpId() != null) {
            chainWrapper.set(InsElderNoticeSign::getCorpId, insElderNoticeSign.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getCorpName())) {
            chainWrapper.set(InsElderNoticeSign::getCorpName, insElderNoticeSign.getCorpName());
        }
        if (insElderNoticeSign.getInstitutionId() != null) {
            chainWrapper.set(InsElderNoticeSign::getInstitutionId, insElderNoticeSign.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getInstitutionName())) {
            chainWrapper.set(InsElderNoticeSign::getInstitutionName, insElderNoticeSign.getInstitutionName());
        }
        if (insElderNoticeSign.getCheckId() != null) {
            chainWrapper.set(InsElderNoticeSign::getCheckId, insElderNoticeSign.getCheckId());
        }
        if (insElderNoticeSign.getCheckDate() != null) {
            chainWrapper.set(InsElderNoticeSign::getCheckDate, insElderNoticeSign.getCheckDate());
        }
        if (insElderNoticeSign.getElderId() != null) {
            chainWrapper.set(InsElderNoticeSign::getElderId, insElderNoticeSign.getElderId());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getElderName())) {
            chainWrapper.set(InsElderNoticeSign::getElderName, insElderNoticeSign.getElderName());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getIdCard())) {
            chainWrapper.set(InsElderNoticeSign::getIdCard, insElderNoticeSign.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getSex())) {
            chainWrapper.set(InsElderNoticeSign::getSex, insElderNoticeSign.getSex());
        }
        if (insElderNoticeSign.getNoticeId() != null) {
            chainWrapper.set(InsElderNoticeSign::getNoticeId, insElderNoticeSign.getNoticeId());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getNoticeName())) {
            chainWrapper.set(InsElderNoticeSign::getNoticeName, insElderNoticeSign.getNoticeName());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getNoticeContent())) {
            chainWrapper.set(InsElderNoticeSign::getNoticeContent, insElderNoticeSign.getNoticeContent());
        }
        if (insElderNoticeSign.getNoticeState() != null) {
            chainWrapper.set(InsElderNoticeSign::getNoticeState, insElderNoticeSign.getNoticeState());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getCodePath())) {
            chainWrapper.set(InsElderNoticeSign::getCodePath, insElderNoticeSign.getCodePath());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getElderSign())) {
            chainWrapper.set(InsElderNoticeSign::getElderSign, insElderNoticeSign.getElderSign());
        }
        if (insElderNoticeSign.getElderDate() != null) {
            chainWrapper.set(InsElderNoticeSign::getElderDate, insElderNoticeSign.getElderDate());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getGuardianSign())) {
            chainWrapper.set(InsElderNoticeSign::getGuardianSign, insElderNoticeSign.getGuardianSign());
        }
        if (insElderNoticeSign.getGuardianDate() != null) {
            chainWrapper.set(InsElderNoticeSign::getGuardianDate, insElderNoticeSign.getGuardianDate());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getPostName())) {
            chainWrapper.set(InsElderNoticeSign::getPostName, insElderNoticeSign.getPostName());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getStafferSign())) {
            chainWrapper.set(InsElderNoticeSign::getStafferSign, insElderNoticeSign.getStafferSign());
        }
        if (insElderNoticeSign.getStafferDate() != null) {
            chainWrapper.set(InsElderNoticeSign::getStafferDate, insElderNoticeSign.getStafferDate());
        }
        if (insElderNoticeSign.getAuditState() != null) {
            chainWrapper.set(InsElderNoticeSign::getAuditState, insElderNoticeSign.getAuditState());
        }
        if (insElderNoticeSign.getAuditId() != null) {
            chainWrapper.set(InsElderNoticeSign::getAuditId, insElderNoticeSign.getAuditId());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getAuditName())) {
            chainWrapper.set(InsElderNoticeSign::getAuditName, insElderNoticeSign.getAuditName());
        }
        if (insElderNoticeSign.getAuditTime() != null) {
            chainWrapper.set(InsElderNoticeSign::getAuditTime, insElderNoticeSign.getAuditTime());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getAuditMemo())) {
            chainWrapper.set(InsElderNoticeSign::getAuditMemo, insElderNoticeSign.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getRemark())) {
            chainWrapper.set(InsElderNoticeSign::getRemark, insElderNoticeSign.getRemark());
        }
        if (insElderNoticeSign.getCreateUser() != null) {
            chainWrapper.set(InsElderNoticeSign::getCreateUser, insElderNoticeSign.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderNoticeSign.getCreateName())) {
            chainWrapper.set(InsElderNoticeSign::getCreateName, insElderNoticeSign.getCreateName());
        }
        if (insElderNoticeSign.getCreateDept() != null) {
            chainWrapper.set(InsElderNoticeSign::getCreateDept, insElderNoticeSign.getCreateDept());
        }
        if (insElderNoticeSign.getCreateTime() != null) {
            chainWrapper.set(InsElderNoticeSign::getCreateTime, insElderNoticeSign.getCreateTime());
        }
        if (insElderNoticeSign.getUpdateUser() != null) {
            chainWrapper.set(InsElderNoticeSign::getUpdateUser, insElderNoticeSign.getUpdateUser());
        }
        if (insElderNoticeSign.getUpdateTime() != null) {
            chainWrapper.set(InsElderNoticeSign::getUpdateTime, insElderNoticeSign.getUpdateTime());
        }
        if (insElderNoticeSign.getIsDeleted() != null) {
            chainWrapper.set(InsElderNoticeSign::getIsDeleted, insElderNoticeSign.getIsDeleted());
        }
        if (insElderNoticeSign.getStatus() != null) {
            chainWrapper.set(InsElderNoticeSign::getStatus, insElderNoticeSign.getStatus());
        }
        if (insElderNoticeSign.getSendState() != null) {
            chainWrapper.set(InsElderNoticeSign::getSendState, insElderNoticeSign.getSendState());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderNoticeSign::getId, insElderNoticeSign.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderNoticeSign.getId());
        } else {
            return insElderNoticeSign;
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
    public boolean saveInsElderNoticeSignBatch(List<InsElderNoticeSign> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderNoticeSign insElderNoticeSign : insertList) {
            //使用默认的雪花算法生成
            insElderNoticeSign.setId(null);
            //insElderNoticeSign.setCreatedDt(currentDte);
            //insElderNoticeSign.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderNoticeSignBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderNoticeSign> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


