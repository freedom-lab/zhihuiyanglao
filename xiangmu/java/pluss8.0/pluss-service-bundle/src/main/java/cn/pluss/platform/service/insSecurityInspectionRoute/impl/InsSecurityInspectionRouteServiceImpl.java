package cn.pluss.platform.service.insSecurityInspectionRoute.impl;

import cn.pluss.platform.mapper.InsSecurityInspectionRouteMapper;
import cn.pluss.platform.model.entity.InsSecurityInspectionRoute;
import cn.pluss.platform.service.insSecurityInspectionRoute.InsSecurityInspectionRouteService;
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
@Service("insSecurityInspectionRouteService")
public class InsSecurityInspectionRouteServiceImpl extends ServiceImpl< InsSecurityInspectionRouteMapper, InsSecurityInspectionRoute> implements InsSecurityInspectionRouteService {
    private static final Logger logger = LoggerFactory.getLogger(InsSecurityInspectionRouteServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSecurityInspectionRoute> queryPage(Map map) {
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
    public InsSecurityInspectionRoute queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityInspectionRoute 实例对象
    * @return 实例对象
    */
    @Override
    public InsSecurityInspectionRoute queryOne(InsSecurityInspectionRoute insSecurityInspectionRoute){
        LambdaQueryWrapper<InsSecurityInspectionRoute> queryWrapper = getQueryWrapper(insSecurityInspectionRoute);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityInspectionRoute
    * @return
    */
    @Override
    public List<InsSecurityInspectionRoute> queryList(InsSecurityInspectionRoute insSecurityInspectionRoute) {
        LambdaQueryWrapper<InsSecurityInspectionRoute> queryWrapper = getQueryWrapper(insSecurityInspectionRoute);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSecurityInspectionRoute
    * @return
    */
    public static LambdaQueryWrapper<InsSecurityInspectionRoute> getQueryWrapper(InsSecurityInspectionRoute insSecurityInspectionRoute){
        LambdaQueryWrapper<InsSecurityInspectionRoute> queryWrapper = new LambdaQueryWrapper<>();
        if (insSecurityInspectionRoute.getId() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getId, insSecurityInspectionRoute.getId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRoute.getTenantId())) {
            queryWrapper.eq(InsSecurityInspectionRoute::getTenantId, insSecurityInspectionRoute.getTenantId());
        }
        if (insSecurityInspectionRoute.getCorpId() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getCorpId, insSecurityInspectionRoute.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRoute.getCorpName())) {
            queryWrapper.eq(InsSecurityInspectionRoute::getCorpName, insSecurityInspectionRoute.getCorpName());
        }
        if (insSecurityInspectionRoute.getInstitutionId() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getInstitutionId, insSecurityInspectionRoute.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRoute.getInstitutionName())) {
            queryWrapper.eq(InsSecurityInspectionRoute::getInstitutionName, insSecurityInspectionRoute.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRoute.getRouteName())) {
            queryWrapper.eq(InsSecurityInspectionRoute::getRouteName, insSecurityInspectionRoute.getRouteName());
        }
        if (insSecurityInspectionRoute.getFrequency() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getFrequency, insSecurityInspectionRoute.getFrequency());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRoute.getRemark())) {
            queryWrapper.eq(InsSecurityInspectionRoute::getRemark, insSecurityInspectionRoute.getRemark());
        }
        if (insSecurityInspectionRoute.getCreateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getCreateUser, insSecurityInspectionRoute.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSecurityInspectionRoute.getCreateName())) {
            queryWrapper.eq(InsSecurityInspectionRoute::getCreateName, insSecurityInspectionRoute.getCreateName());
        }
        if (insSecurityInspectionRoute.getCreateDept() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getCreateDept, insSecurityInspectionRoute.getCreateDept());
        }
        if (insSecurityInspectionRoute.getCreateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getCreateTime, insSecurityInspectionRoute.getCreateTime());
        }
        if (insSecurityInspectionRoute.getUpdateUser() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getUpdateUser, insSecurityInspectionRoute.getUpdateUser());
        }
        if (insSecurityInspectionRoute.getUpdateTime() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getUpdateTime, insSecurityInspectionRoute.getUpdateTime());
        }
        if (insSecurityInspectionRoute.getIsDeleted() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getIsDeleted, insSecurityInspectionRoute.getIsDeleted());
        }
        if (insSecurityInspectionRoute.getStatus() != null) {
            queryWrapper.eq(InsSecurityInspectionRoute::getStatus, insSecurityInspectionRoute.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSecurityInspectionRoute 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionRoute insert(InsSecurityInspectionRoute insSecurityInspectionRoute) {
        insSecurityInspectionRoute.setId(null);
        getBaseMapper().insert(insSecurityInspectionRoute);
        return insSecurityInspectionRoute;
    }

    /**
    * 更新数据
    *
    * @param insSecurityInspectionRoute 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSecurityInspectionRoute update(InsSecurityInspectionRoute insSecurityInspectionRoute) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSecurityInspectionRoute> chainWrapper = new LambdaUpdateChainWrapper<InsSecurityInspectionRoute>(getBaseMapper());
        if (insSecurityInspectionRoute.getId() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getId, insSecurityInspectionRoute.getId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRoute.getTenantId())) {
            chainWrapper.set(InsSecurityInspectionRoute::getTenantId, insSecurityInspectionRoute.getTenantId());
        }
        if (insSecurityInspectionRoute.getCorpId() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getCorpId, insSecurityInspectionRoute.getCorpId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRoute.getCorpName())) {
            chainWrapper.set(InsSecurityInspectionRoute::getCorpName, insSecurityInspectionRoute.getCorpName());
        }
        if (insSecurityInspectionRoute.getInstitutionId() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getInstitutionId, insSecurityInspectionRoute.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRoute.getInstitutionName())) {
            chainWrapper.set(InsSecurityInspectionRoute::getInstitutionName, insSecurityInspectionRoute.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRoute.getRouteName())) {
            chainWrapper.set(InsSecurityInspectionRoute::getRouteName, insSecurityInspectionRoute.getRouteName());
        }
        if (insSecurityInspectionRoute.getFrequency() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getFrequency, insSecurityInspectionRoute.getFrequency());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRoute.getRemark())) {
            chainWrapper.set(InsSecurityInspectionRoute::getRemark, insSecurityInspectionRoute.getRemark());
        }
        if (insSecurityInspectionRoute.getCreateUser() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getCreateUser, insSecurityInspectionRoute.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSecurityInspectionRoute.getCreateName())) {
            chainWrapper.set(InsSecurityInspectionRoute::getCreateName, insSecurityInspectionRoute.getCreateName());
        }
        if (insSecurityInspectionRoute.getCreateDept() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getCreateDept, insSecurityInspectionRoute.getCreateDept());
        }
        if (insSecurityInspectionRoute.getCreateTime() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getCreateTime, insSecurityInspectionRoute.getCreateTime());
        }
        if (insSecurityInspectionRoute.getUpdateUser() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getUpdateUser, insSecurityInspectionRoute.getUpdateUser());
        }
        if (insSecurityInspectionRoute.getUpdateTime() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getUpdateTime, insSecurityInspectionRoute.getUpdateTime());
        }
        if (insSecurityInspectionRoute.getIsDeleted() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getIsDeleted, insSecurityInspectionRoute.getIsDeleted());
        }
        if (insSecurityInspectionRoute.getStatus() != null) {
            chainWrapper.set(InsSecurityInspectionRoute::getStatus, insSecurityInspectionRoute.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSecurityInspectionRoute::getId, insSecurityInspectionRoute.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSecurityInspectionRoute.getId());
        } else {
            return insSecurityInspectionRoute;
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
    public boolean saveInsSecurityInspectionRouteBatch(List<InsSecurityInspectionRoute> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSecurityInspectionRoute insSecurityInspectionRoute : insertList) {
            //使用默认的雪花算法生成
            insSecurityInspectionRoute.setId(null);
            //insSecurityInspectionRoute.setCreatedDt(currentDte);
            //insSecurityInspectionRoute.setUpdatedDt(currentDte);
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
    public Integer deleteInsSecurityInspectionRouteBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSecurityInspectionRoute> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


