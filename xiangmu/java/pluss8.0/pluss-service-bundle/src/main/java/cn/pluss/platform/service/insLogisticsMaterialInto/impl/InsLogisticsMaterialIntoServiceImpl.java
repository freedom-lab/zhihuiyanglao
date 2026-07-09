package cn.pluss.platform.service.insLogisticsMaterialInto.impl;

import cn.pluss.platform.mapper.InsLogisticsMaterialIntoMapper;
import cn.pluss.platform.model.entity.InsLogisticsMaterialInto;
import cn.pluss.platform.service.insLogisticsMaterialInto.InsLogisticsMaterialIntoService;
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
@Service("insLogisticsMaterialIntoService")
public class InsLogisticsMaterialIntoServiceImpl extends ServiceImpl< InsLogisticsMaterialIntoMapper, InsLogisticsMaterialInto> implements InsLogisticsMaterialIntoService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsMaterialIntoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsMaterialInto> queryPage(Map map) {
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
    public InsLogisticsMaterialInto queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsMaterialInto 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsMaterialInto queryOne(InsLogisticsMaterialInto insLogisticsMaterialInto){
        LambdaQueryWrapper<InsLogisticsMaterialInto> queryWrapper = getQueryWrapper(insLogisticsMaterialInto);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsMaterialInto
    * @return
    */
    @Override
    public List<InsLogisticsMaterialInto> queryList(InsLogisticsMaterialInto insLogisticsMaterialInto) {
        LambdaQueryWrapper<InsLogisticsMaterialInto> queryWrapper = getQueryWrapper(insLogisticsMaterialInto);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsMaterialInto
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsMaterialInto> getQueryWrapper(InsLogisticsMaterialInto insLogisticsMaterialInto){
        LambdaQueryWrapper<InsLogisticsMaterialInto> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsMaterialInto.getId() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getId, insLogisticsMaterialInto.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getTenantId())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getTenantId, insLogisticsMaterialInto.getTenantId());
        }
        if (insLogisticsMaterialInto.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getCorpId, insLogisticsMaterialInto.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getCorpName())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getCorpName, insLogisticsMaterialInto.getCorpName());
        }
        if (insLogisticsMaterialInto.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getInstitutionId, insLogisticsMaterialInto.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getInstitutionName, insLogisticsMaterialInto.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getIntoCode())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getIntoCode, insLogisticsMaterialInto.getIntoCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getMaterialType())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getMaterialType, insLogisticsMaterialInto.getMaterialType());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getMaterialSource())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getMaterialSource, insLogisticsMaterialInto.getMaterialSource());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getMaterialName())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getMaterialName, insLogisticsMaterialInto.getMaterialName());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getMaterialSpecs())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getMaterialSpecs, insLogisticsMaterialInto.getMaterialSpecs());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getMaterialUnit())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getMaterialUnit, insLogisticsMaterialInto.getMaterialUnit());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getFactoryName())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getFactoryName, insLogisticsMaterialInto.getFactoryName());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getLotNumber())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getLotNumber, insLogisticsMaterialInto.getLotNumber());
        }
        if (insLogisticsMaterialInto.getIntoNum() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getIntoNum, insLogisticsMaterialInto.getIntoNum());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getPlaceName())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getPlaceName, insLogisticsMaterialInto.getPlaceName());
        }
        if (insLogisticsMaterialInto.getSurplusNum() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getSurplusNum, insLogisticsMaterialInto.getSurplusNum());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getRemark())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getRemark, insLogisticsMaterialInto.getRemark());
        }
        if (insLogisticsMaterialInto.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getCreateUser, insLogisticsMaterialInto.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialInto.getCreateName())) {
            queryWrapper.eq(InsLogisticsMaterialInto::getCreateName, insLogisticsMaterialInto.getCreateName());
        }
        if (insLogisticsMaterialInto.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getCreateDept, insLogisticsMaterialInto.getCreateDept());
        }
        if (insLogisticsMaterialInto.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getCreateTime, insLogisticsMaterialInto.getCreateTime());
        }
        if (insLogisticsMaterialInto.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getUpdateUser, insLogisticsMaterialInto.getUpdateUser());
        }
        if (insLogisticsMaterialInto.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getUpdateTime, insLogisticsMaterialInto.getUpdateTime());
        }
        if (insLogisticsMaterialInto.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getIsDeleted, insLogisticsMaterialInto.getIsDeleted());
        }
        if (insLogisticsMaterialInto.getStatus() != null) {
            queryWrapper.eq(InsLogisticsMaterialInto::getStatus, insLogisticsMaterialInto.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsMaterialInto 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsMaterialInto insert(InsLogisticsMaterialInto insLogisticsMaterialInto) {
        insLogisticsMaterialInto.setId(null);
        getBaseMapper().insert(insLogisticsMaterialInto);
        return insLogisticsMaterialInto;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsMaterialInto 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsMaterialInto update(InsLogisticsMaterialInto insLogisticsMaterialInto) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsMaterialInto> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsMaterialInto>(getBaseMapper());
        if (insLogisticsMaterialInto.getId() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getId, insLogisticsMaterialInto.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getTenantId())) {
            chainWrapper.set(InsLogisticsMaterialInto::getTenantId, insLogisticsMaterialInto.getTenantId());
        }
        if (insLogisticsMaterialInto.getCorpId() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getCorpId, insLogisticsMaterialInto.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getCorpName())) {
            chainWrapper.set(InsLogisticsMaterialInto::getCorpName, insLogisticsMaterialInto.getCorpName());
        }
        if (insLogisticsMaterialInto.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getInstitutionId, insLogisticsMaterialInto.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getInstitutionName())) {
            chainWrapper.set(InsLogisticsMaterialInto::getInstitutionName, insLogisticsMaterialInto.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getIntoCode())) {
            chainWrapper.set(InsLogisticsMaterialInto::getIntoCode, insLogisticsMaterialInto.getIntoCode());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getMaterialType())) {
            chainWrapper.set(InsLogisticsMaterialInto::getMaterialType, insLogisticsMaterialInto.getMaterialType());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getMaterialSource())) {
            chainWrapper.set(InsLogisticsMaterialInto::getMaterialSource, insLogisticsMaterialInto.getMaterialSource());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getMaterialName())) {
            chainWrapper.set(InsLogisticsMaterialInto::getMaterialName, insLogisticsMaterialInto.getMaterialName());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getMaterialSpecs())) {
            chainWrapper.set(InsLogisticsMaterialInto::getMaterialSpecs, insLogisticsMaterialInto.getMaterialSpecs());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getMaterialUnit())) {
            chainWrapper.set(InsLogisticsMaterialInto::getMaterialUnit, insLogisticsMaterialInto.getMaterialUnit());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getFactoryName())) {
            chainWrapper.set(InsLogisticsMaterialInto::getFactoryName, insLogisticsMaterialInto.getFactoryName());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getLotNumber())) {
            chainWrapper.set(InsLogisticsMaterialInto::getLotNumber, insLogisticsMaterialInto.getLotNumber());
        }
        if (insLogisticsMaterialInto.getIntoNum() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getIntoNum, insLogisticsMaterialInto.getIntoNum());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getPlaceName())) {
            chainWrapper.set(InsLogisticsMaterialInto::getPlaceName, insLogisticsMaterialInto.getPlaceName());
        }
        if (insLogisticsMaterialInto.getSurplusNum() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getSurplusNum, insLogisticsMaterialInto.getSurplusNum());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getRemark())) {
            chainWrapper.set(InsLogisticsMaterialInto::getRemark, insLogisticsMaterialInto.getRemark());
        }
        if (insLogisticsMaterialInto.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getCreateUser, insLogisticsMaterialInto.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialInto.getCreateName())) {
            chainWrapper.set(InsLogisticsMaterialInto::getCreateName, insLogisticsMaterialInto.getCreateName());
        }
        if (insLogisticsMaterialInto.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getCreateDept, insLogisticsMaterialInto.getCreateDept());
        }
        if (insLogisticsMaterialInto.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getCreateTime, insLogisticsMaterialInto.getCreateTime());
        }
        if (insLogisticsMaterialInto.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getUpdateUser, insLogisticsMaterialInto.getUpdateUser());
        }
        if (insLogisticsMaterialInto.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getUpdateTime, insLogisticsMaterialInto.getUpdateTime());
        }
        if (insLogisticsMaterialInto.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getIsDeleted, insLogisticsMaterialInto.getIsDeleted());
        }
        if (insLogisticsMaterialInto.getStatus() != null) {
            chainWrapper.set(InsLogisticsMaterialInto::getStatus, insLogisticsMaterialInto.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsMaterialInto::getId, insLogisticsMaterialInto.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsMaterialInto.getId());
        } else {
            return insLogisticsMaterialInto;
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
    public boolean saveInsLogisticsMaterialIntoBatch(List<InsLogisticsMaterialInto> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsMaterialInto insLogisticsMaterialInto : insertList) {
            //使用默认的雪花算法生成
            insLogisticsMaterialInto.setId(null);
            //insLogisticsMaterialInto.setCreatedDt(currentDte);
            //insLogisticsMaterialInto.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsMaterialIntoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsMaterialInto> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


