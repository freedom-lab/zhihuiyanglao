package cn.pluss.platform.service.insExpensesRetreatSure.impl;

import cn.pluss.platform.mapper.InsExpensesRetreatSureMapper;
import cn.pluss.platform.model.entity.InsExpensesRetreatSure;
import cn.pluss.platform.service.insExpensesRetreatSure.InsExpensesRetreatSureService;
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
@Service("insExpensesRetreatSureService")
public class InsExpensesRetreatSureServiceImpl extends ServiceImpl< InsExpensesRetreatSureMapper, InsExpensesRetreatSure> implements InsExpensesRetreatSureService {
    private static final Logger logger = LoggerFactory.getLogger(InsExpensesRetreatSureServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsExpensesRetreatSure> queryPage(Map map) {
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
    public InsExpensesRetreatSure queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesRetreatSure 实例对象
    * @return 实例对象
    */
    @Override
    public InsExpensesRetreatSure queryOne(InsExpensesRetreatSure insExpensesRetreatSure){
        LambdaQueryWrapper<InsExpensesRetreatSure> queryWrapper = getQueryWrapper(insExpensesRetreatSure);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesRetreatSure
    * @return
    */
    @Override
    public List<InsExpensesRetreatSure> queryList(InsExpensesRetreatSure insExpensesRetreatSure) {
        LambdaQueryWrapper<InsExpensesRetreatSure> queryWrapper = getQueryWrapper(insExpensesRetreatSure);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insExpensesRetreatSure
    * @return
    */
    public static LambdaQueryWrapper<InsExpensesRetreatSure> getQueryWrapper(InsExpensesRetreatSure insExpensesRetreatSure){
        LambdaQueryWrapper<InsExpensesRetreatSure> queryWrapper = new LambdaQueryWrapper<>();
        if (insExpensesRetreatSure.getId() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getId, insExpensesRetreatSure.getId());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getTenantId())) {
            queryWrapper.eq(InsExpensesRetreatSure::getTenantId, insExpensesRetreatSure.getTenantId());
        }
        if (insExpensesRetreatSure.getCorpId() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getCorpId, insExpensesRetreatSure.getCorpId());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getCorpName())) {
            queryWrapper.eq(InsExpensesRetreatSure::getCorpName, insExpensesRetreatSure.getCorpName());
        }
        if (insExpensesRetreatSure.getInstitutionId() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getInstitutionId, insExpensesRetreatSure.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getInstitutionName())) {
            queryWrapper.eq(InsExpensesRetreatSure::getInstitutionName, insExpensesRetreatSure.getInstitutionName());
        }
        if (insExpensesRetreatSure.getCheckId() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getCheckId, insExpensesRetreatSure.getCheckId());
        }
        if (insExpensesRetreatSure.getCheckDate() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getCheckDate, insExpensesRetreatSure.getCheckDate());
        }
        if (insExpensesRetreatSure.getElderId() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getElderId, insExpensesRetreatSure.getElderId());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getElderName())) {
            queryWrapper.eq(InsExpensesRetreatSure::getElderName, insExpensesRetreatSure.getElderName());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getIdCard())) {
            queryWrapper.eq(InsExpensesRetreatSure::getIdCard, insExpensesRetreatSure.getIdCard());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getSex())) {
            queryWrapper.eq(InsExpensesRetreatSure::getSex, insExpensesRetreatSure.getSex());
        }
        if (insExpensesRetreatSure.getRetreatTime() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getRetreatTime, insExpensesRetreatSure.getRetreatTime());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getFilePath())) {
            queryWrapper.eq(InsExpensesRetreatSure::getFilePath, insExpensesRetreatSure.getFilePath());
        }
        if (insExpensesRetreatSure.getIsSure() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getIsSure, insExpensesRetreatSure.getIsSure());
        }
        if (insExpensesRetreatSure.getSureId() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getSureId, insExpensesRetreatSure.getSureId());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getSureName())) {
            queryWrapper.eq(InsExpensesRetreatSure::getSureName, insExpensesRetreatSure.getSureName());
        }
        if (insExpensesRetreatSure.getSureTime() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getSureTime, insExpensesRetreatSure.getSureTime());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getRemark())) {
            queryWrapper.eq(InsExpensesRetreatSure::getRemark, insExpensesRetreatSure.getRemark());
        }
        if (insExpensesRetreatSure.getCreateUser() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getCreateUser, insExpensesRetreatSure.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insExpensesRetreatSure.getCreateName())) {
            queryWrapper.eq(InsExpensesRetreatSure::getCreateName, insExpensesRetreatSure.getCreateName());
        }
        if (insExpensesRetreatSure.getCreateDept() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getCreateDept, insExpensesRetreatSure.getCreateDept());
        }
        if (insExpensesRetreatSure.getCreateTime() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getCreateTime, insExpensesRetreatSure.getCreateTime());
        }
        if (insExpensesRetreatSure.getUpdateUser() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getUpdateUser, insExpensesRetreatSure.getUpdateUser());
        }
        if (insExpensesRetreatSure.getUpdateTime() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getUpdateTime, insExpensesRetreatSure.getUpdateTime());
        }
        if (insExpensesRetreatSure.getIsDeleted() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getIsDeleted, insExpensesRetreatSure.getIsDeleted());
        }
        if (insExpensesRetreatSure.getStatus() != null) {
            queryWrapper.eq(InsExpensesRetreatSure::getStatus, insExpensesRetreatSure.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insExpensesRetreatSure 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesRetreatSure insert(InsExpensesRetreatSure insExpensesRetreatSure) {
        insExpensesRetreatSure.setId(null);
        getBaseMapper().insert(insExpensesRetreatSure);
        return insExpensesRetreatSure;
    }

    /**
    * 更新数据
    *
    * @param insExpensesRetreatSure 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsExpensesRetreatSure update(InsExpensesRetreatSure insExpensesRetreatSure) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsExpensesRetreatSure> chainWrapper = new LambdaUpdateChainWrapper<InsExpensesRetreatSure>(getBaseMapper());
        if (insExpensesRetreatSure.getId() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getId, insExpensesRetreatSure.getId());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getTenantId())) {
            chainWrapper.set(InsExpensesRetreatSure::getTenantId, insExpensesRetreatSure.getTenantId());
        }
        if (insExpensesRetreatSure.getCorpId() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getCorpId, insExpensesRetreatSure.getCorpId());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getCorpName())) {
            chainWrapper.set(InsExpensesRetreatSure::getCorpName, insExpensesRetreatSure.getCorpName());
        }
        if (insExpensesRetreatSure.getInstitutionId() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getInstitutionId, insExpensesRetreatSure.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getInstitutionName())) {
            chainWrapper.set(InsExpensesRetreatSure::getInstitutionName, insExpensesRetreatSure.getInstitutionName());
        }
        if (insExpensesRetreatSure.getCheckId() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getCheckId, insExpensesRetreatSure.getCheckId());
        }
        if (insExpensesRetreatSure.getCheckDate() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getCheckDate, insExpensesRetreatSure.getCheckDate());
        }
        if (insExpensesRetreatSure.getElderId() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getElderId, insExpensesRetreatSure.getElderId());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getElderName())) {
            chainWrapper.set(InsExpensesRetreatSure::getElderName, insExpensesRetreatSure.getElderName());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getIdCard())) {
            chainWrapper.set(InsExpensesRetreatSure::getIdCard, insExpensesRetreatSure.getIdCard());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getSex())) {
            chainWrapper.set(InsExpensesRetreatSure::getSex, insExpensesRetreatSure.getSex());
        }
        if (insExpensesRetreatSure.getRetreatTime() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getRetreatTime, insExpensesRetreatSure.getRetreatTime());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getFilePath())) {
            chainWrapper.set(InsExpensesRetreatSure::getFilePath, insExpensesRetreatSure.getFilePath());
        }
        if (insExpensesRetreatSure.getIsSure() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getIsSure, insExpensesRetreatSure.getIsSure());
        }
        if (insExpensesRetreatSure.getSureId() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getSureId, insExpensesRetreatSure.getSureId());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getSureName())) {
            chainWrapper.set(InsExpensesRetreatSure::getSureName, insExpensesRetreatSure.getSureName());
        }
        if (insExpensesRetreatSure.getSureTime() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getSureTime, insExpensesRetreatSure.getSureTime());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getRemark())) {
            chainWrapper.set(InsExpensesRetreatSure::getRemark, insExpensesRetreatSure.getRemark());
        }
        if (insExpensesRetreatSure.getCreateUser() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getCreateUser, insExpensesRetreatSure.getCreateUser());
        }
        if (StringUtil.isNotBlank(insExpensesRetreatSure.getCreateName())) {
            chainWrapper.set(InsExpensesRetreatSure::getCreateName, insExpensesRetreatSure.getCreateName());
        }
        if (insExpensesRetreatSure.getCreateDept() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getCreateDept, insExpensesRetreatSure.getCreateDept());
        }
        if (insExpensesRetreatSure.getCreateTime() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getCreateTime, insExpensesRetreatSure.getCreateTime());
        }
        if (insExpensesRetreatSure.getUpdateUser() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getUpdateUser, insExpensesRetreatSure.getUpdateUser());
        }
        if (insExpensesRetreatSure.getUpdateTime() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getUpdateTime, insExpensesRetreatSure.getUpdateTime());
        }
        if (insExpensesRetreatSure.getIsDeleted() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getIsDeleted, insExpensesRetreatSure.getIsDeleted());
        }
        if (insExpensesRetreatSure.getStatus() != null) {
            chainWrapper.set(InsExpensesRetreatSure::getStatus, insExpensesRetreatSure.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsExpensesRetreatSure::getId, insExpensesRetreatSure.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insExpensesRetreatSure.getId());
        } else {
            return insExpensesRetreatSure;
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
    public boolean saveInsExpensesRetreatSureBatch(List<InsExpensesRetreatSure> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsExpensesRetreatSure insExpensesRetreatSure : insertList) {
            //使用默认的雪花算法生成
            insExpensesRetreatSure.setId(null);
            //insExpensesRetreatSure.setCreatedDt(currentDte);
            //insExpensesRetreatSure.setUpdatedDt(currentDte);
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
    public Integer deleteInsExpensesRetreatSureBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsExpensesRetreatSure> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


