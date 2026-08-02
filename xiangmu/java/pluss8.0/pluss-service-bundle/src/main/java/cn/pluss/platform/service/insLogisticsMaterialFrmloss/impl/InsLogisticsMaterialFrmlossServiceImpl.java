package cn.pluss.platform.service.insLogisticsMaterialFrmloss.impl;

import cn.pluss.platform.mapper.InsLogisticsMaterialFrmlossMapper;
import cn.pluss.platform.model.entity.InsLogisticsMaterialFrmloss;
import cn.pluss.platform.service.insLogisticsMaterialFrmloss.InsLogisticsMaterialFrmlossService;
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
@Service("insLogisticsMaterialFrmlossService")
public class InsLogisticsMaterialFrmlossServiceImpl extends ServiceImpl< InsLogisticsMaterialFrmlossMapper, InsLogisticsMaterialFrmloss> implements InsLogisticsMaterialFrmlossService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsMaterialFrmlossServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsMaterialFrmloss> queryPage(Map map) {
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
    public InsLogisticsMaterialFrmloss queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsMaterialFrmloss 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsMaterialFrmloss queryOne(InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss){
        LambdaQueryWrapper<InsLogisticsMaterialFrmloss> queryWrapper = getQueryWrapper(insLogisticsMaterialFrmloss);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsMaterialFrmloss
    * @return
    */
    @Override
    public List<InsLogisticsMaterialFrmloss> queryList(InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss) {
        LambdaQueryWrapper<InsLogisticsMaterialFrmloss> queryWrapper = getQueryWrapper(insLogisticsMaterialFrmloss);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsMaterialFrmloss
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsMaterialFrmloss> getQueryWrapper(InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss){
        LambdaQueryWrapper<InsLogisticsMaterialFrmloss> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsMaterialFrmloss.getId() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getId, insLogisticsMaterialFrmloss.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialFrmloss.getTenantId())) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getTenantId, insLogisticsMaterialFrmloss.getTenantId());
        }
        if (insLogisticsMaterialFrmloss.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getCorpId, insLogisticsMaterialFrmloss.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialFrmloss.getCorpName())) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getCorpName, insLogisticsMaterialFrmloss.getCorpName());
        }
        if (insLogisticsMaterialFrmloss.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getInstitutionId, insLogisticsMaterialFrmloss.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialFrmloss.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getInstitutionName, insLogisticsMaterialFrmloss.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialFrmloss.getLossCode())) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getLossCode, insLogisticsMaterialFrmloss.getLossCode());
        }
        if (insLogisticsMaterialFrmloss.getMaterialId() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getMaterialId, insLogisticsMaterialFrmloss.getMaterialId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialFrmloss.getMaterialName())) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getMaterialName, insLogisticsMaterialFrmloss.getMaterialName());
        }
        if (insLogisticsMaterialFrmloss.getOutNum() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getOutNum, insLogisticsMaterialFrmloss.getOutNum());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialFrmloss.getRemark())) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getRemark, insLogisticsMaterialFrmloss.getRemark());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialFrmloss.getHandleMemo())) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getHandleMemo, insLogisticsMaterialFrmloss.getHandleMemo());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialFrmloss.getHandleName())) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getHandleName, insLogisticsMaterialFrmloss.getHandleName());
        }
        if (insLogisticsMaterialFrmloss.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getCreateUser, insLogisticsMaterialFrmloss.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialFrmloss.getCreateName())) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getCreateName, insLogisticsMaterialFrmloss.getCreateName());
        }
        if (insLogisticsMaterialFrmloss.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getCreateDept, insLogisticsMaterialFrmloss.getCreateDept());
        }
        if (insLogisticsMaterialFrmloss.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getCreateTime, insLogisticsMaterialFrmloss.getCreateTime());
        }
        if (insLogisticsMaterialFrmloss.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getUpdateUser, insLogisticsMaterialFrmloss.getUpdateUser());
        }
        if (insLogisticsMaterialFrmloss.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getUpdateTime, insLogisticsMaterialFrmloss.getUpdateTime());
        }
        if (insLogisticsMaterialFrmloss.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getIsDeleted, insLogisticsMaterialFrmloss.getIsDeleted());
        }
        if (insLogisticsMaterialFrmloss.getStatus() != null) {
            queryWrapper.eq(InsLogisticsMaterialFrmloss::getStatus, insLogisticsMaterialFrmloss.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsMaterialFrmloss 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsMaterialFrmloss insert(InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss) {
        insLogisticsMaterialFrmloss.setId(null);
        getBaseMapper().insert(insLogisticsMaterialFrmloss);
        return insLogisticsMaterialFrmloss;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsMaterialFrmloss 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsMaterialFrmloss update(InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsMaterialFrmloss> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsMaterialFrmloss>(getBaseMapper());
        if (insLogisticsMaterialFrmloss.getId() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getId, insLogisticsMaterialFrmloss.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialFrmloss.getTenantId())) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getTenantId, insLogisticsMaterialFrmloss.getTenantId());
        }
        if (insLogisticsMaterialFrmloss.getCorpId() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getCorpId, insLogisticsMaterialFrmloss.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialFrmloss.getCorpName())) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getCorpName, insLogisticsMaterialFrmloss.getCorpName());
        }
        if (insLogisticsMaterialFrmloss.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getInstitutionId, insLogisticsMaterialFrmloss.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialFrmloss.getInstitutionName())) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getInstitutionName, insLogisticsMaterialFrmloss.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialFrmloss.getLossCode())) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getLossCode, insLogisticsMaterialFrmloss.getLossCode());
        }
        if (insLogisticsMaterialFrmloss.getMaterialId() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getMaterialId, insLogisticsMaterialFrmloss.getMaterialId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialFrmloss.getMaterialName())) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getMaterialName, insLogisticsMaterialFrmloss.getMaterialName());
        }
        if (insLogisticsMaterialFrmloss.getOutNum() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getOutNum, insLogisticsMaterialFrmloss.getOutNum());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialFrmloss.getRemark())) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getRemark, insLogisticsMaterialFrmloss.getRemark());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialFrmloss.getHandleMemo())) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getHandleMemo, insLogisticsMaterialFrmloss.getHandleMemo());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialFrmloss.getHandleName())) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getHandleName, insLogisticsMaterialFrmloss.getHandleName());
        }
        if (insLogisticsMaterialFrmloss.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getCreateUser, insLogisticsMaterialFrmloss.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialFrmloss.getCreateName())) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getCreateName, insLogisticsMaterialFrmloss.getCreateName());
        }
        if (insLogisticsMaterialFrmloss.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getCreateDept, insLogisticsMaterialFrmloss.getCreateDept());
        }
        if (insLogisticsMaterialFrmloss.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getCreateTime, insLogisticsMaterialFrmloss.getCreateTime());
        }
        if (insLogisticsMaterialFrmloss.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getUpdateUser, insLogisticsMaterialFrmloss.getUpdateUser());
        }
        if (insLogisticsMaterialFrmloss.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getUpdateTime, insLogisticsMaterialFrmloss.getUpdateTime());
        }
        if (insLogisticsMaterialFrmloss.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getIsDeleted, insLogisticsMaterialFrmloss.getIsDeleted());
        }
        if (insLogisticsMaterialFrmloss.getStatus() != null) {
            chainWrapper.set(InsLogisticsMaterialFrmloss::getStatus, insLogisticsMaterialFrmloss.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsMaterialFrmloss::getId, insLogisticsMaterialFrmloss.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsMaterialFrmloss.getId());
        } else {
            return insLogisticsMaterialFrmloss;
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
    public boolean saveInsLogisticsMaterialFrmlossBatch(List<InsLogisticsMaterialFrmloss> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss : insertList) {
            //使用默认的雪花算法生成
            insLogisticsMaterialFrmloss.setId(null);
            //insLogisticsMaterialFrmloss.setCreatedDt(currentDte);
            //insLogisticsMaterialFrmloss.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsMaterialFrmlossBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsMaterialFrmloss> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


