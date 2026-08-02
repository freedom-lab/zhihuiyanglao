package cn.pluss.platform.service.canteenDeviceMaintain.impl;

import cn.pluss.platform.mapper.CanteenDeviceMaintainMapper;
import cn.pluss.platform.model.entity.CanteenDeviceMaintain;
import cn.pluss.platform.service.canteenDeviceMaintain.CanteenDeviceMaintainService;
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
@Service("canteenDeviceMaintainService")
public class CanteenDeviceMaintainServiceImpl extends ServiceImpl< CanteenDeviceMaintainMapper, CanteenDeviceMaintain> implements CanteenDeviceMaintainService {
    private static final Logger logger = LoggerFactory.getLogger(CanteenDeviceMaintainServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CanteenDeviceMaintain> queryPage(Map map) {
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
    public CanteenDeviceMaintain queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param canteenDeviceMaintain 实例对象
    * @return 实例对象
    */
    @Override
    public CanteenDeviceMaintain queryOne(CanteenDeviceMaintain canteenDeviceMaintain){
        LambdaQueryWrapper<CanteenDeviceMaintain> queryWrapper = getQueryWrapper(canteenDeviceMaintain);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param canteenDeviceMaintain
    * @return
    */
    @Override
    public List<CanteenDeviceMaintain> queryList(CanteenDeviceMaintain canteenDeviceMaintain) {
        LambdaQueryWrapper<CanteenDeviceMaintain> queryWrapper = getQueryWrapper(canteenDeviceMaintain);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param canteenDeviceMaintain
    * @return
    */
    public static LambdaQueryWrapper<CanteenDeviceMaintain> getQueryWrapper(CanteenDeviceMaintain canteenDeviceMaintain){
        LambdaQueryWrapper<CanteenDeviceMaintain> queryWrapper = new LambdaQueryWrapper<>();
        if (canteenDeviceMaintain.getId() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getId, canteenDeviceMaintain.getId());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getTenantId())) {
            queryWrapper.eq(CanteenDeviceMaintain::getTenantId, canteenDeviceMaintain.getTenantId());
        }
        if (canteenDeviceMaintain.getCorpId() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getCorpId, canteenDeviceMaintain.getCorpId());
        }
        if (canteenDeviceMaintain.getInstitutionId() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getInstitutionId, canteenDeviceMaintain.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getInstitutionName())) {
            queryWrapper.eq(CanteenDeviceMaintain::getInstitutionName, canteenDeviceMaintain.getInstitutionName());
        }
        if (canteenDeviceMaintain.getMaintainDate() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getMaintainDate, canteenDeviceMaintain.getMaintainDate());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getDevicePlace())) {
            queryWrapper.eq(CanteenDeviceMaintain::getDevicePlace, canteenDeviceMaintain.getDevicePlace());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getDeviceName())) {
            queryWrapper.eq(CanteenDeviceMaintain::getDeviceName, canteenDeviceMaintain.getDeviceName());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getMaintainMethod())) {
            queryWrapper.eq(CanteenDeviceMaintain::getMaintainMethod, canteenDeviceMaintain.getMaintainMethod());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getMaintainContent())) {
            queryWrapper.eq(CanteenDeviceMaintain::getMaintainContent, canteenDeviceMaintain.getMaintainContent());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getLinkMan())) {
            queryWrapper.eq(CanteenDeviceMaintain::getLinkMan, canteenDeviceMaintain.getLinkMan());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getLinkTel())) {
            queryWrapper.eq(CanteenDeviceMaintain::getLinkTel, canteenDeviceMaintain.getLinkTel());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getPhoto())) {
            queryWrapper.eq(CanteenDeviceMaintain::getPhoto, canteenDeviceMaintain.getPhoto());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getRemark())) {
            queryWrapper.eq(CanteenDeviceMaintain::getRemark, canteenDeviceMaintain.getRemark());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getCreateName())) {
            queryWrapper.eq(CanteenDeviceMaintain::getCreateName, canteenDeviceMaintain.getCreateName());
        }
        if (canteenDeviceMaintain.getAreaCode() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getAreaCode, canteenDeviceMaintain.getAreaCode());
        }
        if (StringUtil.isNotEmpty(canteenDeviceMaintain.getAreaName())) {
            queryWrapper.eq(CanteenDeviceMaintain::getAreaName, canteenDeviceMaintain.getAreaName());
        }
        if (canteenDeviceMaintain.getCreateUser() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getCreateUser, canteenDeviceMaintain.getCreateUser());
        }
        if (canteenDeviceMaintain.getCreateDept() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getCreateDept, canteenDeviceMaintain.getCreateDept());
        }
        if (canteenDeviceMaintain.getCreateTime() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getCreateTime, canteenDeviceMaintain.getCreateTime());
        }
        if (canteenDeviceMaintain.getUpdateUser() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getUpdateUser, canteenDeviceMaintain.getUpdateUser());
        }
        if (canteenDeviceMaintain.getUpdateTime() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getUpdateTime, canteenDeviceMaintain.getUpdateTime());
        }
        if (canteenDeviceMaintain.getIsDeleted() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getIsDeleted, canteenDeviceMaintain.getIsDeleted());
        }
        if (canteenDeviceMaintain.getStatus() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getStatus, canteenDeviceMaintain.getStatus());
        }
        if (canteenDeviceMaintain.getGspState() != null) {
            queryWrapper.eq(CanteenDeviceMaintain::getGspState, canteenDeviceMaintain.getGspState());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param canteenDeviceMaintain 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CanteenDeviceMaintain insert(CanteenDeviceMaintain canteenDeviceMaintain) {
        canteenDeviceMaintain.setId(null);
        getBaseMapper().insert(canteenDeviceMaintain);
        return canteenDeviceMaintain;
    }

    /**
    * 更新数据
    *
    * @param canteenDeviceMaintain 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CanteenDeviceMaintain update(CanteenDeviceMaintain canteenDeviceMaintain) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CanteenDeviceMaintain> chainWrapper = new LambdaUpdateChainWrapper<CanteenDeviceMaintain>(getBaseMapper());
        if (canteenDeviceMaintain.getId() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getId, canteenDeviceMaintain.getId());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getTenantId())) {
            chainWrapper.set(CanteenDeviceMaintain::getTenantId, canteenDeviceMaintain.getTenantId());
        }
        if (canteenDeviceMaintain.getCorpId() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getCorpId, canteenDeviceMaintain.getCorpId());
        }
        if (canteenDeviceMaintain.getInstitutionId() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getInstitutionId, canteenDeviceMaintain.getInstitutionId());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getInstitutionName())) {
            chainWrapper.set(CanteenDeviceMaintain::getInstitutionName, canteenDeviceMaintain.getInstitutionName());
        }
        if (canteenDeviceMaintain.getMaintainDate() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getMaintainDate, canteenDeviceMaintain.getMaintainDate());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getDevicePlace())) {
            chainWrapper.set(CanteenDeviceMaintain::getDevicePlace, canteenDeviceMaintain.getDevicePlace());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getDeviceName())) {
            chainWrapper.set(CanteenDeviceMaintain::getDeviceName, canteenDeviceMaintain.getDeviceName());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getMaintainMethod())) {
            chainWrapper.set(CanteenDeviceMaintain::getMaintainMethod, canteenDeviceMaintain.getMaintainMethod());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getMaintainContent())) {
            chainWrapper.set(CanteenDeviceMaintain::getMaintainContent, canteenDeviceMaintain.getMaintainContent());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getLinkMan())) {
            chainWrapper.set(CanteenDeviceMaintain::getLinkMan, canteenDeviceMaintain.getLinkMan());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getLinkTel())) {
            chainWrapper.set(CanteenDeviceMaintain::getLinkTel, canteenDeviceMaintain.getLinkTel());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getPhoto())) {
            chainWrapper.set(CanteenDeviceMaintain::getPhoto, canteenDeviceMaintain.getPhoto());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getRemark())) {
            chainWrapper.set(CanteenDeviceMaintain::getRemark, canteenDeviceMaintain.getRemark());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getCreateName())) {
            chainWrapper.set(CanteenDeviceMaintain::getCreateName, canteenDeviceMaintain.getCreateName());
        }
        if (canteenDeviceMaintain.getAreaCode() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getAreaCode, canteenDeviceMaintain.getAreaCode());
        }
        if (StringUtil.isNotBlank(canteenDeviceMaintain.getAreaName())) {
            chainWrapper.set(CanteenDeviceMaintain::getAreaName, canteenDeviceMaintain.getAreaName());
        }
        if (canteenDeviceMaintain.getCreateUser() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getCreateUser, canteenDeviceMaintain.getCreateUser());
        }
        if (canteenDeviceMaintain.getCreateDept() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getCreateDept, canteenDeviceMaintain.getCreateDept());
        }
        if (canteenDeviceMaintain.getCreateTime() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getCreateTime, canteenDeviceMaintain.getCreateTime());
        }
        if (canteenDeviceMaintain.getUpdateUser() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getUpdateUser, canteenDeviceMaintain.getUpdateUser());
        }
        if (canteenDeviceMaintain.getUpdateTime() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getUpdateTime, canteenDeviceMaintain.getUpdateTime());
        }
        if (canteenDeviceMaintain.getIsDeleted() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getIsDeleted, canteenDeviceMaintain.getIsDeleted());
        }
        if (canteenDeviceMaintain.getStatus() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getStatus, canteenDeviceMaintain.getStatus());
        }
        if (canteenDeviceMaintain.getGspState() != null) {
            chainWrapper.set(CanteenDeviceMaintain::getGspState, canteenDeviceMaintain.getGspState());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CanteenDeviceMaintain::getId, canteenDeviceMaintain.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(canteenDeviceMaintain.getId());
        } else {
            return canteenDeviceMaintain;
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
    public boolean saveCanteenDeviceMaintainBatch(List<CanteenDeviceMaintain> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CanteenDeviceMaintain canteenDeviceMaintain : insertList) {
            //使用默认的雪花算法生成
            canteenDeviceMaintain.setId(null);
            //canteenDeviceMaintain.setCreatedDt(currentDte);
            //canteenDeviceMaintain.setUpdatedDt(currentDte);
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
    public Integer deleteCanteenDeviceMaintainBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CanteenDeviceMaintain> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


