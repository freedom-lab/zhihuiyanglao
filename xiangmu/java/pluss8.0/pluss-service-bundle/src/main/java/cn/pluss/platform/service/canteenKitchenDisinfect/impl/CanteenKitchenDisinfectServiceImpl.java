package cn.pluss.platform.service.canteenKitchenDisinfect.impl;

import cn.pluss.platform.mapper.CanteenKitchenDisinfectMapper;
import cn.pluss.platform.model.entity.CanteenKitchenDisinfect;
import cn.pluss.platform.service.canteenKitchenDisinfect.CanteenKitchenDisinfectService;
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
@Service("canteenKitchenDisinfectService")
public class CanteenKitchenDisinfectServiceImpl extends ServiceImpl< CanteenKitchenDisinfectMapper, CanteenKitchenDisinfect> implements CanteenKitchenDisinfectService {
    private static final Logger logger = LoggerFactory.getLogger(CanteenKitchenDisinfectServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CanteenKitchenDisinfect> queryPage(Map map) {
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
    public CanteenKitchenDisinfect queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param canteenKitchenDisinfect 实例对象
    * @return 实例对象
    */
    @Override
    public CanteenKitchenDisinfect queryOne(CanteenKitchenDisinfect canteenKitchenDisinfect){
        LambdaQueryWrapper<CanteenKitchenDisinfect> queryWrapper = getQueryWrapper(canteenKitchenDisinfect);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param canteenKitchenDisinfect
    * @return
    */
    @Override
    public List<CanteenKitchenDisinfect> queryList(CanteenKitchenDisinfect canteenKitchenDisinfect) {
        LambdaQueryWrapper<CanteenKitchenDisinfect> queryWrapper = getQueryWrapper(canteenKitchenDisinfect);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param canteenKitchenDisinfect
    * @return
    */
    public static LambdaQueryWrapper<CanteenKitchenDisinfect> getQueryWrapper(CanteenKitchenDisinfect canteenKitchenDisinfect){
        LambdaQueryWrapper<CanteenKitchenDisinfect> queryWrapper = new LambdaQueryWrapper<>();
        if (canteenKitchenDisinfect.getId() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getId, canteenKitchenDisinfect.getId());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getTenantId())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getTenantId, canteenKitchenDisinfect.getTenantId());
        }
        if (canteenKitchenDisinfect.getCorpId() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getCorpId, canteenKitchenDisinfect.getCorpId());
        }
        if (canteenKitchenDisinfect.getInstitutionId() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getInstitutionId, canteenKitchenDisinfect.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getInstitutionName())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getInstitutionName, canteenKitchenDisinfect.getInstitutionName());
        }
        if (canteenKitchenDisinfect.getDisinfectDate() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getDisinfectDate, canteenKitchenDisinfect.getDisinfectDate());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getDeviceName())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getDeviceName, canteenKitchenDisinfect.getDeviceName());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getDisinfectMethod())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getDisinfectMethod, canteenKitchenDisinfect.getDisinfectMethod());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getLinkMan())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getLinkMan, canteenKitchenDisinfect.getLinkMan());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getLinkTel())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getLinkTel, canteenKitchenDisinfect.getLinkTel());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getPhoto())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getPhoto, canteenKitchenDisinfect.getPhoto());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getRemark())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getRemark, canteenKitchenDisinfect.getRemark());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getCreateName())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getCreateName, canteenKitchenDisinfect.getCreateName());
        }
        if (canteenKitchenDisinfect.getAreaCode() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getAreaCode, canteenKitchenDisinfect.getAreaCode());
        }
        if (StringUtil.isNotEmpty(canteenKitchenDisinfect.getAreaName())) {
            queryWrapper.eq(CanteenKitchenDisinfect::getAreaName, canteenKitchenDisinfect.getAreaName());
        }
        if (canteenKitchenDisinfect.getCreateUser() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getCreateUser, canteenKitchenDisinfect.getCreateUser());
        }
        if (canteenKitchenDisinfect.getCreateDept() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getCreateDept, canteenKitchenDisinfect.getCreateDept());
        }
        if (canteenKitchenDisinfect.getCreateTime() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getCreateTime, canteenKitchenDisinfect.getCreateTime());
        }
        if (canteenKitchenDisinfect.getUpdateUser() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getUpdateUser, canteenKitchenDisinfect.getUpdateUser());
        }
        if (canteenKitchenDisinfect.getUpdateTime() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getUpdateTime, canteenKitchenDisinfect.getUpdateTime());
        }
        if (canteenKitchenDisinfect.getIsDeleted() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getIsDeleted, canteenKitchenDisinfect.getIsDeleted());
        }
        if (canteenKitchenDisinfect.getStatus() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getStatus, canteenKitchenDisinfect.getStatus());
        }
        if (canteenKitchenDisinfect.getGspState() != null) {
            queryWrapper.eq(CanteenKitchenDisinfect::getGspState, canteenKitchenDisinfect.getGspState());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param canteenKitchenDisinfect 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CanteenKitchenDisinfect insert(CanteenKitchenDisinfect canteenKitchenDisinfect) {
        canteenKitchenDisinfect.setId(null);
        getBaseMapper().insert(canteenKitchenDisinfect);
        return canteenKitchenDisinfect;
    }

    /**
    * 更新数据
    *
    * @param canteenKitchenDisinfect 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CanteenKitchenDisinfect update(CanteenKitchenDisinfect canteenKitchenDisinfect) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CanteenKitchenDisinfect> chainWrapper = new LambdaUpdateChainWrapper<CanteenKitchenDisinfect>(getBaseMapper());
        if (canteenKitchenDisinfect.getId() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getId, canteenKitchenDisinfect.getId());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getTenantId())) {
            chainWrapper.set(CanteenKitchenDisinfect::getTenantId, canteenKitchenDisinfect.getTenantId());
        }
        if (canteenKitchenDisinfect.getCorpId() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getCorpId, canteenKitchenDisinfect.getCorpId());
        }
        if (canteenKitchenDisinfect.getInstitutionId() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getInstitutionId, canteenKitchenDisinfect.getInstitutionId());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getInstitutionName())) {
            chainWrapper.set(CanteenKitchenDisinfect::getInstitutionName, canteenKitchenDisinfect.getInstitutionName());
        }
        if (canteenKitchenDisinfect.getDisinfectDate() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getDisinfectDate, canteenKitchenDisinfect.getDisinfectDate());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getDeviceName())) {
            chainWrapper.set(CanteenKitchenDisinfect::getDeviceName, canteenKitchenDisinfect.getDeviceName());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getDisinfectMethod())) {
            chainWrapper.set(CanteenKitchenDisinfect::getDisinfectMethod, canteenKitchenDisinfect.getDisinfectMethod());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getLinkMan())) {
            chainWrapper.set(CanteenKitchenDisinfect::getLinkMan, canteenKitchenDisinfect.getLinkMan());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getLinkTel())) {
            chainWrapper.set(CanteenKitchenDisinfect::getLinkTel, canteenKitchenDisinfect.getLinkTel());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getPhoto())) {
            chainWrapper.set(CanteenKitchenDisinfect::getPhoto, canteenKitchenDisinfect.getPhoto());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getRemark())) {
            chainWrapper.set(CanteenKitchenDisinfect::getRemark, canteenKitchenDisinfect.getRemark());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getCreateName())) {
            chainWrapper.set(CanteenKitchenDisinfect::getCreateName, canteenKitchenDisinfect.getCreateName());
        }
        if (canteenKitchenDisinfect.getAreaCode() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getAreaCode, canteenKitchenDisinfect.getAreaCode());
        }
        if (StringUtil.isNotBlank(canteenKitchenDisinfect.getAreaName())) {
            chainWrapper.set(CanteenKitchenDisinfect::getAreaName, canteenKitchenDisinfect.getAreaName());
        }
        if (canteenKitchenDisinfect.getCreateUser() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getCreateUser, canteenKitchenDisinfect.getCreateUser());
        }
        if (canteenKitchenDisinfect.getCreateDept() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getCreateDept, canteenKitchenDisinfect.getCreateDept());
        }
        if (canteenKitchenDisinfect.getCreateTime() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getCreateTime, canteenKitchenDisinfect.getCreateTime());
        }
        if (canteenKitchenDisinfect.getUpdateUser() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getUpdateUser, canteenKitchenDisinfect.getUpdateUser());
        }
        if (canteenKitchenDisinfect.getUpdateTime() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getUpdateTime, canteenKitchenDisinfect.getUpdateTime());
        }
        if (canteenKitchenDisinfect.getIsDeleted() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getIsDeleted, canteenKitchenDisinfect.getIsDeleted());
        }
        if (canteenKitchenDisinfect.getStatus() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getStatus, canteenKitchenDisinfect.getStatus());
        }
        if (canteenKitchenDisinfect.getGspState() != null) {
            chainWrapper.set(CanteenKitchenDisinfect::getGspState, canteenKitchenDisinfect.getGspState());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CanteenKitchenDisinfect::getId, canteenKitchenDisinfect.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(canteenKitchenDisinfect.getId());
        } else {
            return canteenKitchenDisinfect;
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
    public boolean saveCanteenKitchenDisinfectBatch(List<CanteenKitchenDisinfect> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CanteenKitchenDisinfect canteenKitchenDisinfect : insertList) {
            //使用默认的雪花算法生成
            canteenKitchenDisinfect.setId(null);
            //canteenKitchenDisinfect.setCreatedDt(currentDte);
            //canteenKitchenDisinfect.setUpdatedDt(currentDte);
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
    public Integer deleteCanteenKitchenDisinfectBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CanteenKitchenDisinfect> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


