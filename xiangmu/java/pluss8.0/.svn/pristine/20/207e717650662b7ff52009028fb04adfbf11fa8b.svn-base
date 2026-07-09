package cn.pluss.platform.service.insElderHealthParam.impl;

import cn.pluss.platform.mapper.InsElderHealthParamMapper;
import cn.pluss.platform.model.entity.InsElderHealthParam;
import cn.pluss.platform.service.insElderHealthParam.InsElderHealthParamService;
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
@Service("insElderHealthParamService")
public class InsElderHealthParamServiceImpl extends ServiceImpl< InsElderHealthParamMapper, InsElderHealthParam> implements InsElderHealthParamService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderHealthParamServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderHealthParam> queryPage(Map map) {
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
    public InsElderHealthParam queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderHealthParam 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderHealthParam queryOne(InsElderHealthParam insElderHealthParam){
        LambdaQueryWrapper<InsElderHealthParam> queryWrapper = getQueryWrapper(insElderHealthParam);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderHealthParam
    * @return
    */
    @Override
    public List<InsElderHealthParam> queryList(InsElderHealthParam insElderHealthParam) {
        LambdaQueryWrapper<InsElderHealthParam> queryWrapper = getQueryWrapper(insElderHealthParam);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderHealthParam
    * @return
    */
    public static LambdaQueryWrapper<InsElderHealthParam> getQueryWrapper(InsElderHealthParam insElderHealthParam){
        LambdaQueryWrapper<InsElderHealthParam> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderHealthParam.getId() != null) {
            queryWrapper.eq(InsElderHealthParam::getId, insElderHealthParam.getId());
        }
        if (StringUtil.isNotEmpty(insElderHealthParam.getTenantId())) {
            queryWrapper.eq(InsElderHealthParam::getTenantId, insElderHealthParam.getTenantId());
        }
        if (insElderHealthParam.getCorpId() != null) {
            queryWrapper.eq(InsElderHealthParam::getCorpId, insElderHealthParam.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderHealthParam.getCorpName())) {
            queryWrapper.eq(InsElderHealthParam::getCorpName, insElderHealthParam.getCorpName());
        }
        if (insElderHealthParam.getInstitutionId() != null) {
            queryWrapper.eq(InsElderHealthParam::getInstitutionId, insElderHealthParam.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderHealthParam.getInstitutionName())) {
            queryWrapper.eq(InsElderHealthParam::getInstitutionName, insElderHealthParam.getInstitutionName());
        }
        if (insElderHealthParam.getCheckId() != null) {
            queryWrapper.eq(InsElderHealthParam::getCheckId, insElderHealthParam.getCheckId());
        }
        if (insElderHealthParam.getCheckDate() != null) {
            queryWrapper.eq(InsElderHealthParam::getCheckDate, insElderHealthParam.getCheckDate());
        }
        if (insElderHealthParam.getElderId() != null) {
            queryWrapper.eq(InsElderHealthParam::getElderId, insElderHealthParam.getElderId());
        }
        if (StringUtil.isNotEmpty(insElderHealthParam.getElderName())) {
            queryWrapper.eq(InsElderHealthParam::getElderName, insElderHealthParam.getElderName());
        }
        if (StringUtil.isNotEmpty(insElderHealthParam.getIdCard())) {
            queryWrapper.eq(InsElderHealthParam::getIdCard, insElderHealthParam.getIdCard());
        }
        if (StringUtil.isNotEmpty(insElderHealthParam.getSex())) {
            queryWrapper.eq(InsElderHealthParam::getSex, insElderHealthParam.getSex());
        }
        if (insElderHealthParam.getHealthType() != null) {
            queryWrapper.eq(InsElderHealthParam::getHealthType, insElderHealthParam.getHealthType());
        }
        if (insElderHealthParam.getMaxValue() != null) {
            queryWrapper.eq(InsElderHealthParam::getMaxValue, insElderHealthParam.getMaxValue());
        }
        if (insElderHealthParam.getMinValue() != null) {
            queryWrapper.eq(InsElderHealthParam::getMinValue, insElderHealthParam.getMinValue());
        }
        if (insElderHealthParam.getMaxTwoValue() != null) {
            queryWrapper.eq(InsElderHealthParam::getMaxTwoValue, insElderHealthParam.getMaxTwoValue());
        }
        if (insElderHealthParam.getMinTwoValue() != null) {
            queryWrapper.eq(InsElderHealthParam::getMinTwoValue, insElderHealthParam.getMinTwoValue());
        }
        if (StringUtil.isNotEmpty(insElderHealthParam.getRemark())) {
            queryWrapper.eq(InsElderHealthParam::getRemark, insElderHealthParam.getRemark());
        }
        if (insElderHealthParam.getCreateUser() != null) {
            queryWrapper.eq(InsElderHealthParam::getCreateUser, insElderHealthParam.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderHealthParam.getCreateName())) {
            queryWrapper.eq(InsElderHealthParam::getCreateName, insElderHealthParam.getCreateName());
        }
        if (insElderHealthParam.getCreateDept() != null) {
            queryWrapper.eq(InsElderHealthParam::getCreateDept, insElderHealthParam.getCreateDept());
        }
        if (insElderHealthParam.getCreateTime() != null) {
            queryWrapper.eq(InsElderHealthParam::getCreateTime, insElderHealthParam.getCreateTime());
        }
        if (insElderHealthParam.getUpdateUser() != null) {
            queryWrapper.eq(InsElderHealthParam::getUpdateUser, insElderHealthParam.getUpdateUser());
        }
        if (insElderHealthParam.getUpdateTime() != null) {
            queryWrapper.eq(InsElderHealthParam::getUpdateTime, insElderHealthParam.getUpdateTime());
        }
        if (insElderHealthParam.getIsDeleted() != null) {
            queryWrapper.eq(InsElderHealthParam::getIsDeleted, insElderHealthParam.getIsDeleted());
        }
        if (insElderHealthParam.getStatus() != null) {
            queryWrapper.eq(InsElderHealthParam::getStatus, insElderHealthParam.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderHealthParam 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderHealthParam insert(InsElderHealthParam insElderHealthParam) {
        insElderHealthParam.setId(null);
        getBaseMapper().insert(insElderHealthParam);
        return insElderHealthParam;
    }

    /**
    * 更新数据
    *
    * @param insElderHealthParam 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderHealthParam update(InsElderHealthParam insElderHealthParam) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderHealthParam> chainWrapper = new LambdaUpdateChainWrapper<InsElderHealthParam>(getBaseMapper());
        if (insElderHealthParam.getId() != null) {
            chainWrapper.set(InsElderHealthParam::getId, insElderHealthParam.getId());
        }
        if (StringUtil.isNotBlank(insElderHealthParam.getTenantId())) {
            chainWrapper.set(InsElderHealthParam::getTenantId, insElderHealthParam.getTenantId());
        }
        if (insElderHealthParam.getCorpId() != null) {
            chainWrapper.set(InsElderHealthParam::getCorpId, insElderHealthParam.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderHealthParam.getCorpName())) {
            chainWrapper.set(InsElderHealthParam::getCorpName, insElderHealthParam.getCorpName());
        }
        if (insElderHealthParam.getInstitutionId() != null) {
            chainWrapper.set(InsElderHealthParam::getInstitutionId, insElderHealthParam.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderHealthParam.getInstitutionName())) {
            chainWrapper.set(InsElderHealthParam::getInstitutionName, insElderHealthParam.getInstitutionName());
        }
        if (insElderHealthParam.getCheckId() != null) {
            chainWrapper.set(InsElderHealthParam::getCheckId, insElderHealthParam.getCheckId());
        }
        if (insElderHealthParam.getCheckDate() != null) {
            chainWrapper.set(InsElderHealthParam::getCheckDate, insElderHealthParam.getCheckDate());
        }
        if (insElderHealthParam.getElderId() != null) {
            chainWrapper.set(InsElderHealthParam::getElderId, insElderHealthParam.getElderId());
        }
        if (StringUtil.isNotBlank(insElderHealthParam.getElderName())) {
            chainWrapper.set(InsElderHealthParam::getElderName, insElderHealthParam.getElderName());
        }
        if (StringUtil.isNotBlank(insElderHealthParam.getIdCard())) {
            chainWrapper.set(InsElderHealthParam::getIdCard, insElderHealthParam.getIdCard());
        }
        if (StringUtil.isNotBlank(insElderHealthParam.getSex())) {
            chainWrapper.set(InsElderHealthParam::getSex, insElderHealthParam.getSex());
        }
        if (insElderHealthParam.getHealthType() != null) {
            chainWrapper.set(InsElderHealthParam::getHealthType, insElderHealthParam.getHealthType());
        }
        if (insElderHealthParam.getMaxValue() != null) {
            chainWrapper.set(InsElderHealthParam::getMaxValue, insElderHealthParam.getMaxValue());
        }
        if (insElderHealthParam.getMinValue() != null) {
            chainWrapper.set(InsElderHealthParam::getMinValue, insElderHealthParam.getMinValue());
        }
        if (insElderHealthParam.getMaxTwoValue() != null) {
            chainWrapper.set(InsElderHealthParam::getMaxTwoValue, insElderHealthParam.getMaxTwoValue());
        }
        if (insElderHealthParam.getMinTwoValue() != null) {
            chainWrapper.set(InsElderHealthParam::getMinTwoValue, insElderHealthParam.getMinTwoValue());
        }
        if (StringUtil.isNotBlank(insElderHealthParam.getRemark())) {
            chainWrapper.set(InsElderHealthParam::getRemark, insElderHealthParam.getRemark());
        }
        if (insElderHealthParam.getCreateUser() != null) {
            chainWrapper.set(InsElderHealthParam::getCreateUser, insElderHealthParam.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderHealthParam.getCreateName())) {
            chainWrapper.set(InsElderHealthParam::getCreateName, insElderHealthParam.getCreateName());
        }
        if (insElderHealthParam.getCreateDept() != null) {
            chainWrapper.set(InsElderHealthParam::getCreateDept, insElderHealthParam.getCreateDept());
        }
        if (insElderHealthParam.getCreateTime() != null) {
            chainWrapper.set(InsElderHealthParam::getCreateTime, insElderHealthParam.getCreateTime());
        }
        if (insElderHealthParam.getUpdateUser() != null) {
            chainWrapper.set(InsElderHealthParam::getUpdateUser, insElderHealthParam.getUpdateUser());
        }
        if (insElderHealthParam.getUpdateTime() != null) {
            chainWrapper.set(InsElderHealthParam::getUpdateTime, insElderHealthParam.getUpdateTime());
        }
        if (insElderHealthParam.getIsDeleted() != null) {
            chainWrapper.set(InsElderHealthParam::getIsDeleted, insElderHealthParam.getIsDeleted());
        }
        if (insElderHealthParam.getStatus() != null) {
            chainWrapper.set(InsElderHealthParam::getStatus, insElderHealthParam.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderHealthParam::getId, insElderHealthParam.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderHealthParam.getId());
        } else {
            return insElderHealthParam;
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
    public boolean saveInsElderHealthParamBatch(List<InsElderHealthParam> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderHealthParam insElderHealthParam : insertList) {
            //使用默认的雪花算法生成
            insElderHealthParam.setId(null);
            //insElderHealthParam.setCreatedDt(currentDte);
            //insElderHealthParam.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderHealthParamBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderHealthParam> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


