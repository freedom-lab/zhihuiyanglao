package cn.pluss.platform.service.insAffairsLiabilityInsurance.impl;

import cn.pluss.platform.mapper.InsAffairsLiabilityInsuranceMapper;
import cn.pluss.platform.model.entity.InsAffairsLiabilityInsurance;
import cn.pluss.platform.service.insAffairsLiabilityInsurance.InsAffairsLiabilityInsuranceService;
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
@Service("insAffairsLiabilityInsuranceService")
public class InsAffairsLiabilityInsuranceServiceImpl extends ServiceImpl< InsAffairsLiabilityInsuranceMapper, InsAffairsLiabilityInsurance> implements InsAffairsLiabilityInsuranceService {
    private static final Logger logger = LoggerFactory.getLogger(InsAffairsLiabilityInsuranceServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsAffairsLiabilityInsurance> queryPage(Map map) {
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
    public InsAffairsLiabilityInsurance queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insAffairsLiabilityInsurance 实例对象
    * @return 实例对象
    */
    @Override
    public InsAffairsLiabilityInsurance queryOne(InsAffairsLiabilityInsurance insAffairsLiabilityInsurance){
        LambdaQueryWrapper<InsAffairsLiabilityInsurance> queryWrapper = getQueryWrapper(insAffairsLiabilityInsurance);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insAffairsLiabilityInsurance
    * @return
    */
    @Override
    public List<InsAffairsLiabilityInsurance> queryList(InsAffairsLiabilityInsurance insAffairsLiabilityInsurance) {
        LambdaQueryWrapper<InsAffairsLiabilityInsurance> queryWrapper = getQueryWrapper(insAffairsLiabilityInsurance);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insAffairsLiabilityInsurance
    * @return
    */
    public static LambdaQueryWrapper<InsAffairsLiabilityInsurance> getQueryWrapper(InsAffairsLiabilityInsurance insAffairsLiabilityInsurance){
        LambdaQueryWrapper<InsAffairsLiabilityInsurance> queryWrapper = new LambdaQueryWrapper<>();
        if (insAffairsLiabilityInsurance.getId() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getId, insAffairsLiabilityInsurance.getId());
        }
        if (StringUtil.isNotEmpty(insAffairsLiabilityInsurance.getTenantId())) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getTenantId, insAffairsLiabilityInsurance.getTenantId());
        }
        if (insAffairsLiabilityInsurance.getCorpId() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getCorpId, insAffairsLiabilityInsurance.getCorpId());
        }
        if (StringUtil.isNotEmpty(insAffairsLiabilityInsurance.getCorpName())) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getCorpName, insAffairsLiabilityInsurance.getCorpName());
        }
        if (insAffairsLiabilityInsurance.getInstitutionId() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getInstitutionId, insAffairsLiabilityInsurance.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insAffairsLiabilityInsurance.getInstitutionName())) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getInstitutionName, insAffairsLiabilityInsurance.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insAffairsLiabilityInsurance.getInsuranceName())) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getInsuranceName, insAffairsLiabilityInsurance.getInsuranceName());
        }
        if (insAffairsLiabilityInsurance.getInsuranceAmount() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getInsuranceAmount, insAffairsLiabilityInsurance.getInsuranceAmount());
        }
        if (StringUtil.isNotEmpty(insAffairsLiabilityInsurance.getInsuranceCorp())) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getInsuranceCorp, insAffairsLiabilityInsurance.getInsuranceCorp());
        }
        if (insAffairsLiabilityInsurance.getPeriodValidity() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getPeriodValidity, insAffairsLiabilityInsurance.getPeriodValidity());
        }
        if (insAffairsLiabilityInsurance.getInsuranceDate() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getInsuranceDate, insAffairsLiabilityInsurance.getInsuranceDate());
        }
        if (StringUtil.isNotEmpty(insAffairsLiabilityInsurance.getImgPath())) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getImgPath, insAffairsLiabilityInsurance.getImgPath());
        }
        if (StringUtil.isNotEmpty(insAffairsLiabilityInsurance.getRemark())) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getRemark, insAffairsLiabilityInsurance.getRemark());
        }
        if (insAffairsLiabilityInsurance.getCreateUser() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getCreateUser, insAffairsLiabilityInsurance.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insAffairsLiabilityInsurance.getCreateName())) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getCreateName, insAffairsLiabilityInsurance.getCreateName());
        }
        if (insAffairsLiabilityInsurance.getCreateDept() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getCreateDept, insAffairsLiabilityInsurance.getCreateDept());
        }
        if (insAffairsLiabilityInsurance.getCreateTime() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getCreateTime, insAffairsLiabilityInsurance.getCreateTime());
        }
        if (insAffairsLiabilityInsurance.getUpdateUser() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getUpdateUser, insAffairsLiabilityInsurance.getUpdateUser());
        }
        if (insAffairsLiabilityInsurance.getUpdateTime() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getUpdateTime, insAffairsLiabilityInsurance.getUpdateTime());
        }
        if (insAffairsLiabilityInsurance.getIsDeleted() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getIsDeleted, insAffairsLiabilityInsurance.getIsDeleted());
        }
        if (insAffairsLiabilityInsurance.getStatus() != null) {
            queryWrapper.eq(InsAffairsLiabilityInsurance::getStatus, insAffairsLiabilityInsurance.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insAffairsLiabilityInsurance 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsAffairsLiabilityInsurance insert(InsAffairsLiabilityInsurance insAffairsLiabilityInsurance) {
        insAffairsLiabilityInsurance.setId(null);
        getBaseMapper().insert(insAffairsLiabilityInsurance);
        return insAffairsLiabilityInsurance;
    }

    /**
    * 更新数据
    *
    * @param insAffairsLiabilityInsurance 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsAffairsLiabilityInsurance update(InsAffairsLiabilityInsurance insAffairsLiabilityInsurance) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsAffairsLiabilityInsurance> chainWrapper = new LambdaUpdateChainWrapper<InsAffairsLiabilityInsurance>(getBaseMapper());
        if (insAffairsLiabilityInsurance.getId() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getId, insAffairsLiabilityInsurance.getId());
        }
        if (StringUtil.isNotBlank(insAffairsLiabilityInsurance.getTenantId())) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getTenantId, insAffairsLiabilityInsurance.getTenantId());
        }
        if (insAffairsLiabilityInsurance.getCorpId() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getCorpId, insAffairsLiabilityInsurance.getCorpId());
        }
        if (StringUtil.isNotBlank(insAffairsLiabilityInsurance.getCorpName())) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getCorpName, insAffairsLiabilityInsurance.getCorpName());
        }
        if (insAffairsLiabilityInsurance.getInstitutionId() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getInstitutionId, insAffairsLiabilityInsurance.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insAffairsLiabilityInsurance.getInstitutionName())) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getInstitutionName, insAffairsLiabilityInsurance.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insAffairsLiabilityInsurance.getInsuranceName())) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getInsuranceName, insAffairsLiabilityInsurance.getInsuranceName());
        }
        if (insAffairsLiabilityInsurance.getInsuranceAmount() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getInsuranceAmount, insAffairsLiabilityInsurance.getInsuranceAmount());
        }
        if (StringUtil.isNotBlank(insAffairsLiabilityInsurance.getInsuranceCorp())) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getInsuranceCorp, insAffairsLiabilityInsurance.getInsuranceCorp());
        }
        if (insAffairsLiabilityInsurance.getPeriodValidity() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getPeriodValidity, insAffairsLiabilityInsurance.getPeriodValidity());
        }
        if (insAffairsLiabilityInsurance.getInsuranceDate() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getInsuranceDate, insAffairsLiabilityInsurance.getInsuranceDate());
        }
        if (StringUtil.isNotBlank(insAffairsLiabilityInsurance.getImgPath())) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getImgPath, insAffairsLiabilityInsurance.getImgPath());
        }
        if (StringUtil.isNotBlank(insAffairsLiabilityInsurance.getRemark())) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getRemark, insAffairsLiabilityInsurance.getRemark());
        }
        if (insAffairsLiabilityInsurance.getCreateUser() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getCreateUser, insAffairsLiabilityInsurance.getCreateUser());
        }
        if (StringUtil.isNotBlank(insAffairsLiabilityInsurance.getCreateName())) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getCreateName, insAffairsLiabilityInsurance.getCreateName());
        }
        if (insAffairsLiabilityInsurance.getCreateDept() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getCreateDept, insAffairsLiabilityInsurance.getCreateDept());
        }
        if (insAffairsLiabilityInsurance.getCreateTime() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getCreateTime, insAffairsLiabilityInsurance.getCreateTime());
        }
        if (insAffairsLiabilityInsurance.getUpdateUser() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getUpdateUser, insAffairsLiabilityInsurance.getUpdateUser());
        }
        if (insAffairsLiabilityInsurance.getUpdateTime() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getUpdateTime, insAffairsLiabilityInsurance.getUpdateTime());
        }
        if (insAffairsLiabilityInsurance.getIsDeleted() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getIsDeleted, insAffairsLiabilityInsurance.getIsDeleted());
        }
        if (insAffairsLiabilityInsurance.getStatus() != null) {
            chainWrapper.set(InsAffairsLiabilityInsurance::getStatus, insAffairsLiabilityInsurance.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsAffairsLiabilityInsurance::getId, insAffairsLiabilityInsurance.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insAffairsLiabilityInsurance.getId());
        } else {
            return insAffairsLiabilityInsurance;
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
    public boolean saveInsAffairsLiabilityInsuranceBatch(List<InsAffairsLiabilityInsurance> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsAffairsLiabilityInsurance insAffairsLiabilityInsurance : insertList) {
            //使用默认的雪花算法生成
            insAffairsLiabilityInsurance.setId(null);
            //insAffairsLiabilityInsurance.setCreatedDt(currentDte);
            //insAffairsLiabilityInsurance.setUpdatedDt(currentDte);
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
    public Integer deleteInsAffairsLiabilityInsuranceBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsAffairsLiabilityInsurance> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


