package cn.pluss.platform.service.insMedicalDoctorAdvice.impl;

import cn.pluss.platform.mapper.InsMedicalDoctorAdviceMapper;
import cn.pluss.platform.model.entity.InsMedicalDoctorAdvice;
import cn.pluss.platform.service.insMedicalDoctorAdvice.InsMedicalDoctorAdviceService;
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
@Service("insMedicalDoctorAdviceService")
public class InsMedicalDoctorAdviceServiceImpl extends ServiceImpl< InsMedicalDoctorAdviceMapper, InsMedicalDoctorAdvice> implements InsMedicalDoctorAdviceService {
    private static final Logger logger = LoggerFactory.getLogger(InsMedicalDoctorAdviceServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsMedicalDoctorAdvice> queryPage(Map map) {
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
    public InsMedicalDoctorAdvice queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalDoctorAdvice 实例对象
    * @return 实例对象
    */
    @Override
    public InsMedicalDoctorAdvice queryOne(InsMedicalDoctorAdvice insMedicalDoctorAdvice){
        LambdaQueryWrapper<InsMedicalDoctorAdvice> queryWrapper = getQueryWrapper(insMedicalDoctorAdvice);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalDoctorAdvice
    * @return
    */
    @Override
    public List<InsMedicalDoctorAdvice> queryList(InsMedicalDoctorAdvice insMedicalDoctorAdvice) {
        LambdaQueryWrapper<InsMedicalDoctorAdvice> queryWrapper = getQueryWrapper(insMedicalDoctorAdvice);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insMedicalDoctorAdvice
    * @return
    */
    public static LambdaQueryWrapper<InsMedicalDoctorAdvice> getQueryWrapper(InsMedicalDoctorAdvice insMedicalDoctorAdvice){
        LambdaQueryWrapper<InsMedicalDoctorAdvice> queryWrapper = new LambdaQueryWrapper<>();
        if (insMedicalDoctorAdvice.getId() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getId, insMedicalDoctorAdvice.getId());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getTenantId())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getTenantId, insMedicalDoctorAdvice.getTenantId());
        }
        if (insMedicalDoctorAdvice.getCorpId() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getCorpId, insMedicalDoctorAdvice.getCorpId());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getCorpName())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getCorpName, insMedicalDoctorAdvice.getCorpName());
        }
        if (insMedicalDoctorAdvice.getInstitutionId() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getInstitutionId, insMedicalDoctorAdvice.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getInstitutionName())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getInstitutionName, insMedicalDoctorAdvice.getInstitutionName());
        }
        if (insMedicalDoctorAdvice.getCheckId() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getCheckId, insMedicalDoctorAdvice.getCheckId());
        }
        if (insMedicalDoctorAdvice.getCheckDate() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getCheckDate, insMedicalDoctorAdvice.getCheckDate());
        }
        if (insMedicalDoctorAdvice.getElderId() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getElderId, insMedicalDoctorAdvice.getElderId());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getElderName())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getElderName, insMedicalDoctorAdvice.getElderName());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getIdCard())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getIdCard, insMedicalDoctorAdvice.getIdCard());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getSex())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getSex, insMedicalDoctorAdvice.getSex());
        }
        if (insMedicalDoctorAdvice.getAge() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getAge, insMedicalDoctorAdvice.getAge());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getBedInfo())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getBedInfo, insMedicalDoctorAdvice.getBedInfo());
        }
        if (insMedicalDoctorAdvice.getIssuanceTime() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getIssuanceTime, insMedicalDoctorAdvice.getIssuanceTime());
        }
        if (insMedicalDoctorAdvice.getStartDate() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getStartDate, insMedicalDoctorAdvice.getStartDate());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getStartTime())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getStartTime, insMedicalDoctorAdvice.getStartTime());
        }
        if (insMedicalDoctorAdvice.getEndDate() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getEndDate, insMedicalDoctorAdvice.getEndDate());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getEndTime())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getEndTime, insMedicalDoctorAdvice.getEndTime());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getAdviceContent())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getAdviceContent, insMedicalDoctorAdvice.getAdviceContent());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getStartDoctorName())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getStartDoctorName, insMedicalDoctorAdvice.getStartDoctorName());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getStartNurseName())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getStartNurseName, insMedicalDoctorAdvice.getStartNurseName());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getEndDoctorName())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getEndDoctorName, insMedicalDoctorAdvice.getEndDoctorName());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getEndNurseName())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getEndNurseName, insMedicalDoctorAdvice.getEndNurseName());
        }
        if (insMedicalDoctorAdvice.getCheckTime() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getCheckTime, insMedicalDoctorAdvice.getCheckTime());
        }
        if (insMedicalDoctorAdvice.getAdviceType() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getAdviceType, insMedicalDoctorAdvice.getAdviceType());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getRemark())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getRemark, insMedicalDoctorAdvice.getRemark());
        }
        if (insMedicalDoctorAdvice.getCreateUser() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getCreateUser, insMedicalDoctorAdvice.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insMedicalDoctorAdvice.getCreateName())) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getCreateName, insMedicalDoctorAdvice.getCreateName());
        }
        if (insMedicalDoctorAdvice.getCreateDept() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getCreateDept, insMedicalDoctorAdvice.getCreateDept());
        }
        if (insMedicalDoctorAdvice.getCreateTime() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getCreateTime, insMedicalDoctorAdvice.getCreateTime());
        }
        if (insMedicalDoctorAdvice.getUpdateUser() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getUpdateUser, insMedicalDoctorAdvice.getUpdateUser());
        }
        if (insMedicalDoctorAdvice.getUpdateTime() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getUpdateTime, insMedicalDoctorAdvice.getUpdateTime());
        }
        if (insMedicalDoctorAdvice.getIsDeleted() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getIsDeleted, insMedicalDoctorAdvice.getIsDeleted());
        }
        if (insMedicalDoctorAdvice.getStatus() != null) {
            queryWrapper.eq(InsMedicalDoctorAdvice::getStatus, insMedicalDoctorAdvice.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insMedicalDoctorAdvice 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalDoctorAdvice insert(InsMedicalDoctorAdvice insMedicalDoctorAdvice) {
        insMedicalDoctorAdvice.setId(null);
        getBaseMapper().insert(insMedicalDoctorAdvice);
        return insMedicalDoctorAdvice;
    }

    /**
    * 更新数据
    *
    * @param insMedicalDoctorAdvice 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalDoctorAdvice update(InsMedicalDoctorAdvice insMedicalDoctorAdvice) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsMedicalDoctorAdvice> chainWrapper = new LambdaUpdateChainWrapper<InsMedicalDoctorAdvice>(getBaseMapper());
        if (insMedicalDoctorAdvice.getId() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getId, insMedicalDoctorAdvice.getId());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getTenantId())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getTenantId, insMedicalDoctorAdvice.getTenantId());
        }
        if (insMedicalDoctorAdvice.getCorpId() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getCorpId, insMedicalDoctorAdvice.getCorpId());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getCorpName())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getCorpName, insMedicalDoctorAdvice.getCorpName());
        }
        if (insMedicalDoctorAdvice.getInstitutionId() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getInstitutionId, insMedicalDoctorAdvice.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getInstitutionName())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getInstitutionName, insMedicalDoctorAdvice.getInstitutionName());
        }
        if (insMedicalDoctorAdvice.getCheckId() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getCheckId, insMedicalDoctorAdvice.getCheckId());
        }
        if (insMedicalDoctorAdvice.getCheckDate() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getCheckDate, insMedicalDoctorAdvice.getCheckDate());
        }
        if (insMedicalDoctorAdvice.getElderId() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getElderId, insMedicalDoctorAdvice.getElderId());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getElderName())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getElderName, insMedicalDoctorAdvice.getElderName());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getIdCard())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getIdCard, insMedicalDoctorAdvice.getIdCard());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getSex())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getSex, insMedicalDoctorAdvice.getSex());
        }
        if (insMedicalDoctorAdvice.getAge() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getAge, insMedicalDoctorAdvice.getAge());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getBedInfo())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getBedInfo, insMedicalDoctorAdvice.getBedInfo());
        }
        if (insMedicalDoctorAdvice.getIssuanceTime() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getIssuanceTime, insMedicalDoctorAdvice.getIssuanceTime());
        }
        if (insMedicalDoctorAdvice.getStartDate() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getStartDate, insMedicalDoctorAdvice.getStartDate());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getStartTime())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getStartTime, insMedicalDoctorAdvice.getStartTime());
        }
        if (insMedicalDoctorAdvice.getEndDate() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getEndDate, insMedicalDoctorAdvice.getEndDate());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getEndTime())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getEndTime, insMedicalDoctorAdvice.getEndTime());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getAdviceContent())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getAdviceContent, insMedicalDoctorAdvice.getAdviceContent());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getStartDoctorName())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getStartDoctorName, insMedicalDoctorAdvice.getStartDoctorName());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getStartNurseName())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getStartNurseName, insMedicalDoctorAdvice.getStartNurseName());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getEndDoctorName())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getEndDoctorName, insMedicalDoctorAdvice.getEndDoctorName());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getEndNurseName())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getEndNurseName, insMedicalDoctorAdvice.getEndNurseName());
        }
        if (insMedicalDoctorAdvice.getCheckTime() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getCheckTime, insMedicalDoctorAdvice.getCheckTime());
        }
        if (insMedicalDoctorAdvice.getAdviceType() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getAdviceType, insMedicalDoctorAdvice.getAdviceType());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getRemark())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getRemark, insMedicalDoctorAdvice.getRemark());
        }
        if (insMedicalDoctorAdvice.getCreateUser() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getCreateUser, insMedicalDoctorAdvice.getCreateUser());
        }
        if (StringUtil.isNotBlank(insMedicalDoctorAdvice.getCreateName())) {
            chainWrapper.set(InsMedicalDoctorAdvice::getCreateName, insMedicalDoctorAdvice.getCreateName());
        }
        if (insMedicalDoctorAdvice.getCreateDept() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getCreateDept, insMedicalDoctorAdvice.getCreateDept());
        }
        if (insMedicalDoctorAdvice.getCreateTime() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getCreateTime, insMedicalDoctorAdvice.getCreateTime());
        }
        if (insMedicalDoctorAdvice.getUpdateUser() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getUpdateUser, insMedicalDoctorAdvice.getUpdateUser());
        }
        if (insMedicalDoctorAdvice.getUpdateTime() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getUpdateTime, insMedicalDoctorAdvice.getUpdateTime());
        }
        if (insMedicalDoctorAdvice.getIsDeleted() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getIsDeleted, insMedicalDoctorAdvice.getIsDeleted());
        }
        if (insMedicalDoctorAdvice.getStatus() != null) {
            chainWrapper.set(InsMedicalDoctorAdvice::getStatus, insMedicalDoctorAdvice.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsMedicalDoctorAdvice::getId, insMedicalDoctorAdvice.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insMedicalDoctorAdvice.getId());
        } else {
            return insMedicalDoctorAdvice;
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
    public boolean saveInsMedicalDoctorAdviceBatch(List<InsMedicalDoctorAdvice> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsMedicalDoctorAdvice insMedicalDoctorAdvice : insertList) {
            //使用默认的雪花算法生成
            insMedicalDoctorAdvice.setId(null);
            //insMedicalDoctorAdvice.setCreatedDt(currentDte);
            //insMedicalDoctorAdvice.setUpdatedDt(currentDte);
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
    public Integer deleteInsMedicalDoctorAdviceBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsMedicalDoctorAdvice> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


