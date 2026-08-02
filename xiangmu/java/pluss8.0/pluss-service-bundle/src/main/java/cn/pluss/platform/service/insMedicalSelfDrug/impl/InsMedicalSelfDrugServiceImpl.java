package cn.pluss.platform.service.insMedicalSelfDrug.impl;

import cn.pluss.platform.mapper.InsMedicalSelfDrugMapper;
import cn.pluss.platform.model.entity.InsMedicalSelfDrug;
import cn.pluss.platform.service.insMedicalSelfDrug.InsMedicalSelfDrugService;
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
@Service("insMedicalSelfDrugService")
public class InsMedicalSelfDrugServiceImpl extends ServiceImpl< InsMedicalSelfDrugMapper, InsMedicalSelfDrug> implements InsMedicalSelfDrugService {
    private static final Logger logger = LoggerFactory.getLogger(InsMedicalSelfDrugServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsMedicalSelfDrug> queryPage(Map map) {
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
    public InsMedicalSelfDrug queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalSelfDrug 实例对象
    * @return 实例对象
    */
    @Override
    public InsMedicalSelfDrug queryOne(InsMedicalSelfDrug insMedicalSelfDrug){
        LambdaQueryWrapper<InsMedicalSelfDrug> queryWrapper = getQueryWrapper(insMedicalSelfDrug);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalSelfDrug
    * @return
    */
    @Override
    public List<InsMedicalSelfDrug> queryList(InsMedicalSelfDrug insMedicalSelfDrug) {
        LambdaQueryWrapper<InsMedicalSelfDrug> queryWrapper = getQueryWrapper(insMedicalSelfDrug);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insMedicalSelfDrug
    * @return
    */
    public static LambdaQueryWrapper<InsMedicalSelfDrug> getQueryWrapper(InsMedicalSelfDrug insMedicalSelfDrug){
        LambdaQueryWrapper<InsMedicalSelfDrug> queryWrapper = new LambdaQueryWrapper<>();
        if (insMedicalSelfDrug.getId() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getId, insMedicalSelfDrug.getId());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getTenantId())) {
            queryWrapper.eq(InsMedicalSelfDrug::getTenantId, insMedicalSelfDrug.getTenantId());
        }
        if (insMedicalSelfDrug.getCorpId() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getCorpId, insMedicalSelfDrug.getCorpId());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getCorpName())) {
            queryWrapper.eq(InsMedicalSelfDrug::getCorpName, insMedicalSelfDrug.getCorpName());
        }
        if (insMedicalSelfDrug.getInstitutionId() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getInstitutionId, insMedicalSelfDrug.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getInstitutionName())) {
            queryWrapper.eq(InsMedicalSelfDrug::getInstitutionName, insMedicalSelfDrug.getInstitutionName());
        }
        if (insMedicalSelfDrug.getCheckId() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getCheckId, insMedicalSelfDrug.getCheckId());
        }
        if (insMedicalSelfDrug.getCheckDate() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getCheckDate, insMedicalSelfDrug.getCheckDate());
        }
        if (insMedicalSelfDrug.getElderId() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getElderId, insMedicalSelfDrug.getElderId());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getElderName())) {
            queryWrapper.eq(InsMedicalSelfDrug::getElderName, insMedicalSelfDrug.getElderName());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getIdCard())) {
            queryWrapper.eq(InsMedicalSelfDrug::getIdCard, insMedicalSelfDrug.getIdCard());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getSex())) {
            queryWrapper.eq(InsMedicalSelfDrug::getSex, insMedicalSelfDrug.getSex());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getDrugName())) {
            queryWrapper.eq(InsMedicalSelfDrug::getDrugName, insMedicalSelfDrug.getDrugName());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getDrugPackageNum())) {
            queryWrapper.eq(InsMedicalSelfDrug::getDrugPackageNum, insMedicalSelfDrug.getDrugPackageNum());
        }
        if (insMedicalSelfDrug.getDrugNum() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getDrugNum, insMedicalSelfDrug.getDrugNum());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getDrugUnit())) {
            queryWrapper.eq(InsMedicalSelfDrug::getDrugUnit, insMedicalSelfDrug.getDrugUnit());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getDrugUsage())) {
            queryWrapper.eq(InsMedicalSelfDrug::getDrugUsage, insMedicalSelfDrug.getDrugUsage());
        }
        if (insMedicalSelfDrug.getEffectiveDate() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getEffectiveDate, insMedicalSelfDrug.getEffectiveDate());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getDeliveryPerson())) {
            queryWrapper.eq(InsMedicalSelfDrug::getDeliveryPerson, insMedicalSelfDrug.getDeliveryPerson());
        }
        if (insMedicalSelfDrug.getStaffId() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getStaffId, insMedicalSelfDrug.getStaffId());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getStaffName())) {
            queryWrapper.eq(InsMedicalSelfDrug::getStaffName, insMedicalSelfDrug.getStaffName());
        }
        if (insMedicalSelfDrug.getIsIntact() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getIsIntact, insMedicalSelfDrug.getIsIntact());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getRemark())) {
            queryWrapper.eq(InsMedicalSelfDrug::getRemark, insMedicalSelfDrug.getRemark());
        }
        if (insMedicalSelfDrug.getCreateUser() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getCreateUser, insMedicalSelfDrug.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insMedicalSelfDrug.getCreateName())) {
            queryWrapper.eq(InsMedicalSelfDrug::getCreateName, insMedicalSelfDrug.getCreateName());
        }
        if (insMedicalSelfDrug.getCreateDept() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getCreateDept, insMedicalSelfDrug.getCreateDept());
        }
        if (insMedicalSelfDrug.getCreateTime() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getCreateTime, insMedicalSelfDrug.getCreateTime());
        }
        if (insMedicalSelfDrug.getUpdateUser() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getUpdateUser, insMedicalSelfDrug.getUpdateUser());
        }
        if (insMedicalSelfDrug.getUpdateTime() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getUpdateTime, insMedicalSelfDrug.getUpdateTime());
        }
        if (insMedicalSelfDrug.getIsDeleted() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getIsDeleted, insMedicalSelfDrug.getIsDeleted());
        }
        if (insMedicalSelfDrug.getStatus() != null) {
            queryWrapper.eq(InsMedicalSelfDrug::getStatus, insMedicalSelfDrug.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insMedicalSelfDrug 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalSelfDrug insert(InsMedicalSelfDrug insMedicalSelfDrug) {
        insMedicalSelfDrug.setId(null);
        getBaseMapper().insert(insMedicalSelfDrug);
        return insMedicalSelfDrug;
    }

    /**
    * 更新数据
    *
    * @param insMedicalSelfDrug 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsMedicalSelfDrug update(InsMedicalSelfDrug insMedicalSelfDrug) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsMedicalSelfDrug> chainWrapper = new LambdaUpdateChainWrapper<InsMedicalSelfDrug>(getBaseMapper());
        if (insMedicalSelfDrug.getId() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getId, insMedicalSelfDrug.getId());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getTenantId())) {
            chainWrapper.set(InsMedicalSelfDrug::getTenantId, insMedicalSelfDrug.getTenantId());
        }
        if (insMedicalSelfDrug.getCorpId() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getCorpId, insMedicalSelfDrug.getCorpId());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getCorpName())) {
            chainWrapper.set(InsMedicalSelfDrug::getCorpName, insMedicalSelfDrug.getCorpName());
        }
        if (insMedicalSelfDrug.getInstitutionId() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getInstitutionId, insMedicalSelfDrug.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getInstitutionName())) {
            chainWrapper.set(InsMedicalSelfDrug::getInstitutionName, insMedicalSelfDrug.getInstitutionName());
        }
        if (insMedicalSelfDrug.getCheckId() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getCheckId, insMedicalSelfDrug.getCheckId());
        }
        if (insMedicalSelfDrug.getCheckDate() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getCheckDate, insMedicalSelfDrug.getCheckDate());
        }
        if (insMedicalSelfDrug.getElderId() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getElderId, insMedicalSelfDrug.getElderId());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getElderName())) {
            chainWrapper.set(InsMedicalSelfDrug::getElderName, insMedicalSelfDrug.getElderName());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getIdCard())) {
            chainWrapper.set(InsMedicalSelfDrug::getIdCard, insMedicalSelfDrug.getIdCard());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getSex())) {
            chainWrapper.set(InsMedicalSelfDrug::getSex, insMedicalSelfDrug.getSex());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getDrugName())) {
            chainWrapper.set(InsMedicalSelfDrug::getDrugName, insMedicalSelfDrug.getDrugName());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getDrugPackageNum())) {
            chainWrapper.set(InsMedicalSelfDrug::getDrugPackageNum, insMedicalSelfDrug.getDrugPackageNum());
        }
        if (insMedicalSelfDrug.getDrugNum() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getDrugNum, insMedicalSelfDrug.getDrugNum());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getDrugUnit())) {
            chainWrapper.set(InsMedicalSelfDrug::getDrugUnit, insMedicalSelfDrug.getDrugUnit());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getDrugUsage())) {
            chainWrapper.set(InsMedicalSelfDrug::getDrugUsage, insMedicalSelfDrug.getDrugUsage());
        }
        if (insMedicalSelfDrug.getEffectiveDate() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getEffectiveDate, insMedicalSelfDrug.getEffectiveDate());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getDeliveryPerson())) {
            chainWrapper.set(InsMedicalSelfDrug::getDeliveryPerson, insMedicalSelfDrug.getDeliveryPerson());
        }
        if (insMedicalSelfDrug.getStaffId() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getStaffId, insMedicalSelfDrug.getStaffId());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getStaffName())) {
            chainWrapper.set(InsMedicalSelfDrug::getStaffName, insMedicalSelfDrug.getStaffName());
        }
        if (insMedicalSelfDrug.getIsIntact() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getIsIntact, insMedicalSelfDrug.getIsIntact());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getRemark())) {
            chainWrapper.set(InsMedicalSelfDrug::getRemark, insMedicalSelfDrug.getRemark());
        }
        if (insMedicalSelfDrug.getCreateUser() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getCreateUser, insMedicalSelfDrug.getCreateUser());
        }
        if (StringUtil.isNotBlank(insMedicalSelfDrug.getCreateName())) {
            chainWrapper.set(InsMedicalSelfDrug::getCreateName, insMedicalSelfDrug.getCreateName());
        }
        if (insMedicalSelfDrug.getCreateDept() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getCreateDept, insMedicalSelfDrug.getCreateDept());
        }
        if (insMedicalSelfDrug.getCreateTime() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getCreateTime, insMedicalSelfDrug.getCreateTime());
        }
        if (insMedicalSelfDrug.getUpdateUser() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getUpdateUser, insMedicalSelfDrug.getUpdateUser());
        }
        if (insMedicalSelfDrug.getUpdateTime() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getUpdateTime, insMedicalSelfDrug.getUpdateTime());
        }
        if (insMedicalSelfDrug.getIsDeleted() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getIsDeleted, insMedicalSelfDrug.getIsDeleted());
        }
        if (insMedicalSelfDrug.getStatus() != null) {
            chainWrapper.set(InsMedicalSelfDrug::getStatus, insMedicalSelfDrug.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsMedicalSelfDrug::getId, insMedicalSelfDrug.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insMedicalSelfDrug.getId());
        } else {
            return insMedicalSelfDrug;
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
    public boolean saveInsMedicalSelfDrugBatch(List<InsMedicalSelfDrug> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsMedicalSelfDrug insMedicalSelfDrug : insertList) {
            //使用默认的雪花算法生成
            insMedicalSelfDrug.setId(null);
            //insMedicalSelfDrug.setCreatedDt(currentDte);
            //insMedicalSelfDrug.setUpdatedDt(currentDte);
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
    public Integer deleteInsMedicalSelfDrugBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsMedicalSelfDrug> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


