package cn.pluss.platform.service.insElderContractWarning.impl;

import cn.pluss.platform.mapper.InsElderContractWarningMapper;
import cn.pluss.platform.model.entity.InsElderContractWarning;
import cn.pluss.platform.service.insElderContractWarning.InsElderContractWarningService;
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
@Service("insElderContractWarningService")
public class InsElderContractWarningServiceImpl extends ServiceImpl< InsElderContractWarningMapper, InsElderContractWarning> implements InsElderContractWarningService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderContractWarningServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderContractWarning> queryPage(Map map) {
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
    public InsElderContractWarning queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderContractWarning 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderContractWarning queryOne(InsElderContractWarning insElderContractWarning){
        LambdaQueryWrapper<InsElderContractWarning> queryWrapper = getQueryWrapper(insElderContractWarning);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderContractWarning
    * @return
    */
    @Override
    public List<InsElderContractWarning> queryList(InsElderContractWarning insElderContractWarning) {
        LambdaQueryWrapper<InsElderContractWarning> queryWrapper = getQueryWrapper(insElderContractWarning);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderContractWarning
    * @return
    */
    public static LambdaQueryWrapper<InsElderContractWarning> getQueryWrapper(InsElderContractWarning insElderContractWarning){
        LambdaQueryWrapper<InsElderContractWarning> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderContractWarning.getId() != null) {
            queryWrapper.eq(InsElderContractWarning::getId, insElderContractWarning.getId());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getTenantId())) {
            queryWrapper.eq(InsElderContractWarning::getTenantId, insElderContractWarning.getTenantId());
        }
        if (insElderContractWarning.getCorpId() != null) {
            queryWrapper.eq(InsElderContractWarning::getCorpId, insElderContractWarning.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getCorpName())) {
            queryWrapper.eq(InsElderContractWarning::getCorpName, insElderContractWarning.getCorpName());
        }
        if (insElderContractWarning.getInstitutionId() != null) {
            queryWrapper.eq(InsElderContractWarning::getInstitutionId, insElderContractWarning.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getInstitutionName())) {
            queryWrapper.eq(InsElderContractWarning::getInstitutionName, insElderContractWarning.getInstitutionName());
        }
        if (insElderContractWarning.getCheckId() != null) {
            queryWrapper.eq(InsElderContractWarning::getCheckId, insElderContractWarning.getCheckId());
        }
        if (insElderContractWarning.getElderId() != null) {
            queryWrapper.eq(InsElderContractWarning::getElderId, insElderContractWarning.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getElderName())) {
            queryWrapper.eq(InsElderContractWarning::getElderName, insElderContractWarning.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getIdCard())) {
            queryWrapper.eq(InsElderContractWarning::getIdCard, insElderContractWarning.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getSex())) {
            queryWrapper.eq(InsElderContractWarning::getSex, insElderContractWarning.getSex());
        }
        if (insElderContractWarning.getContractId() != null) {
            queryWrapper.eq(InsElderContractWarning::getContractId, insElderContractWarning.getContractId());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getContractCode())) {
            queryWrapper.eq(InsElderContractWarning::getContractCode, insElderContractWarning.getContractCode());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getContractName())) {
            queryWrapper.eq(InsElderContractWarning::getContractName, insElderContractWarning.getContractName());
        }
        if (insElderContractWarning.getSignTime() != null) {
            queryWrapper.eq(InsElderContractWarning::getSignTime, insElderContractWarning.getSignTime());
        }
        if (insElderContractWarning.getDayNum() != null) {
            queryWrapper.eq(InsElderContractWarning::getDayNum, insElderContractWarning.getDayNum());
        }
        if (insElderContractWarning.getWarningState() != null) {
            queryWrapper.eq(InsElderContractWarning::getWarningState, insElderContractWarning.getWarningState());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getAreaCode())) {
            queryWrapper.eq(InsElderContractWarning::getAreaCode, insElderContractWarning.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getAreaName())) {
            queryWrapper.eq(InsElderContractWarning::getAreaName, insElderContractWarning.getAreaName());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getRemark())) {
            queryWrapper.eq(InsElderContractWarning::getRemark, insElderContractWarning.getRemark());
        }
        if (insElderContractWarning.getCreateUser() != null) {
            queryWrapper.eq(InsElderContractWarning::getCreateUser, insElderContractWarning.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderContractWarning.getCreateName())) {
            queryWrapper.eq(InsElderContractWarning::getCreateName, insElderContractWarning.getCreateName());
        }
        if (insElderContractWarning.getCreateDept() != null) {
            queryWrapper.eq(InsElderContractWarning::getCreateDept, insElderContractWarning.getCreateDept());
        }
        if (insElderContractWarning.getCreateTime() != null) {
            queryWrapper.eq(InsElderContractWarning::getCreateTime, insElderContractWarning.getCreateTime());
        }
        if (insElderContractWarning.getUpdateUser() != null) {
            queryWrapper.eq(InsElderContractWarning::getUpdateUser, insElderContractWarning.getUpdateUser());
        }
        if (insElderContractWarning.getUpdateTime() != null) {
            queryWrapper.eq(InsElderContractWarning::getUpdateTime, insElderContractWarning.getUpdateTime());
        }
        if (insElderContractWarning.getIsDeleted() != null) {
            queryWrapper.eq(InsElderContractWarning::getIsDeleted, insElderContractWarning.getIsDeleted());
        }
        if (insElderContractWarning.getStatus() != null) {
            queryWrapper.eq(InsElderContractWarning::getStatus, insElderContractWarning.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderContractWarning 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderContractWarning insert(InsElderContractWarning insElderContractWarning) {
        insElderContractWarning.setId(null);
        getBaseMapper().insert(insElderContractWarning);
        return insElderContractWarning;
    }

    /**
    * 更新数据
    *
    * @param insElderContractWarning 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderContractWarning update(InsElderContractWarning insElderContractWarning) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderContractWarning> chainWrapper = new LambdaUpdateChainWrapper<InsElderContractWarning>(getBaseMapper());
        if (insElderContractWarning.getId() != null) {
            chainWrapper.set(InsElderContractWarning::getId, insElderContractWarning.getId());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getTenantId())) {
            chainWrapper.set(InsElderContractWarning::getTenantId, insElderContractWarning.getTenantId());
        }
        if (insElderContractWarning.getCorpId() != null) {
            chainWrapper.set(InsElderContractWarning::getCorpId, insElderContractWarning.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getCorpName())) {
            chainWrapper.set(InsElderContractWarning::getCorpName, insElderContractWarning.getCorpName());
        }
        if (insElderContractWarning.getInstitutionId() != null) {
            chainWrapper.set(InsElderContractWarning::getInstitutionId, insElderContractWarning.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getInstitutionName())) {
            chainWrapper.set(InsElderContractWarning::getInstitutionName, insElderContractWarning.getInstitutionName());
        }
        if (insElderContractWarning.getCheckId() != null) {
            chainWrapper.set(InsElderContractWarning::getCheckId, insElderContractWarning.getCheckId());
        }
        if (insElderContractWarning.getElderId() != null) {
            chainWrapper.set(InsElderContractWarning::getElderId, insElderContractWarning.getElderId());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getElderName())) {
            chainWrapper.set(InsElderContractWarning::getElderName, insElderContractWarning.getElderName());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getIdCard())) {
            chainWrapper.set(InsElderContractWarning::getIdCard, insElderContractWarning.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getSex())) {
            chainWrapper.set(InsElderContractWarning::getSex, insElderContractWarning.getSex());
        }
        if (insElderContractWarning.getContractId() != null) {
            chainWrapper.set(InsElderContractWarning::getContractId, insElderContractWarning.getContractId());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getContractCode())) {
            chainWrapper.set(InsElderContractWarning::getContractCode, insElderContractWarning.getContractCode());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getContractName())) {
            chainWrapper.set(InsElderContractWarning::getContractName, insElderContractWarning.getContractName());
        }
        if (insElderContractWarning.getSignTime() != null) {
            chainWrapper.set(InsElderContractWarning::getSignTime, insElderContractWarning.getSignTime());
        }
        if (insElderContractWarning.getDayNum() != null) {
            chainWrapper.set(InsElderContractWarning::getDayNum, insElderContractWarning.getDayNum());
        }
        if (insElderContractWarning.getWarningState() != null) {
            chainWrapper.set(InsElderContractWarning::getWarningState, insElderContractWarning.getWarningState());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getAreaCode())) {
            chainWrapper.set(InsElderContractWarning::getAreaCode, insElderContractWarning.getAreaCode());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getAreaName())) {
            chainWrapper.set(InsElderContractWarning::getAreaName, insElderContractWarning.getAreaName());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getRemark())) {
            chainWrapper.set(InsElderContractWarning::getRemark, insElderContractWarning.getRemark());
        }
        if (insElderContractWarning.getCreateUser() != null) {
            chainWrapper.set(InsElderContractWarning::getCreateUser, insElderContractWarning.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderContractWarning.getCreateName())) {
            chainWrapper.set(InsElderContractWarning::getCreateName, insElderContractWarning.getCreateName());
        }
        if (insElderContractWarning.getCreateDept() != null) {
            chainWrapper.set(InsElderContractWarning::getCreateDept, insElderContractWarning.getCreateDept());
        }
        if (insElderContractWarning.getCreateTime() != null) {
            chainWrapper.set(InsElderContractWarning::getCreateTime, insElderContractWarning.getCreateTime());
        }
        if (insElderContractWarning.getUpdateUser() != null) {
            chainWrapper.set(InsElderContractWarning::getUpdateUser, insElderContractWarning.getUpdateUser());
        }
        if (insElderContractWarning.getUpdateTime() != null) {
            chainWrapper.set(InsElderContractWarning::getUpdateTime, insElderContractWarning.getUpdateTime());
        }
        if (insElderContractWarning.getIsDeleted() != null) {
            chainWrapper.set(InsElderContractWarning::getIsDeleted, insElderContractWarning.getIsDeleted());
        }
        if (insElderContractWarning.getStatus() != null) {
            chainWrapper.set(InsElderContractWarning::getStatus, insElderContractWarning.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderContractWarning::getId, insElderContractWarning.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderContractWarning.getId());
        } else {
            return insElderContractWarning;
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
    public boolean saveInsElderContractWarningBatch(List<InsElderContractWarning> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderContractWarning insElderContractWarning : insertList) {
            //使用默认的雪花算法生成
            insElderContractWarning.setId(null);
            //insElderContractWarning.setCreatedDt(currentDte);
            //insElderContractWarning.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderContractWarningBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderContractWarning> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


