package cn.pluss.platform.service.canteenLeftoverDisposal.impl;

import cn.pluss.platform.mapper.CanteenLeftoverDisposalMapper;
import cn.pluss.platform.model.entity.CanteenLeftoverDisposal;
import cn.pluss.platform.service.canteenLeftoverDisposal.CanteenLeftoverDisposalService;
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
@Service("canteenLeftoverDisposalService")
public class CanteenLeftoverDisposalServiceImpl extends ServiceImpl< CanteenLeftoverDisposalMapper, CanteenLeftoverDisposal> implements CanteenLeftoverDisposalService {
    private static final Logger logger = LoggerFactory.getLogger(CanteenLeftoverDisposalServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CanteenLeftoverDisposal> queryPage(Map map) {
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
    public CanteenLeftoverDisposal queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param canteenLeftoverDisposal 实例对象
    * @return 实例对象
    */
    @Override
    public CanteenLeftoverDisposal queryOne(CanteenLeftoverDisposal canteenLeftoverDisposal){
        LambdaQueryWrapper<CanteenLeftoverDisposal> queryWrapper = getQueryWrapper(canteenLeftoverDisposal);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param canteenLeftoverDisposal
    * @return
    */
    @Override
    public List<CanteenLeftoverDisposal> queryList(CanteenLeftoverDisposal canteenLeftoverDisposal) {
        LambdaQueryWrapper<CanteenLeftoverDisposal> queryWrapper = getQueryWrapper(canteenLeftoverDisposal);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param canteenLeftoverDisposal
    * @return
    */
    public static LambdaQueryWrapper<CanteenLeftoverDisposal> getQueryWrapper(CanteenLeftoverDisposal canteenLeftoverDisposal){
        LambdaQueryWrapper<CanteenLeftoverDisposal> queryWrapper = new LambdaQueryWrapper<>();
        if (canteenLeftoverDisposal.getId() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getId, canteenLeftoverDisposal.getId());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getTenantId())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getTenantId, canteenLeftoverDisposal.getTenantId());
        }
        if (canteenLeftoverDisposal.getCorpId() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getCorpId, canteenLeftoverDisposal.getCorpId());
        }
        if (canteenLeftoverDisposal.getInstitutionId() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getInstitutionId, canteenLeftoverDisposal.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getInstitutionName())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getInstitutionName, canteenLeftoverDisposal.getInstitutionName());
        }
        if (canteenLeftoverDisposal.getDisposalDate() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getDisposalDate, canteenLeftoverDisposal.getDisposalDate());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getFoodType())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getFoodType, canteenLeftoverDisposal.getFoodType());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getFoodName())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getFoodName, canteenLeftoverDisposal.getFoodName());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getFoodSurplus())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getFoodSurplus, canteenLeftoverDisposal.getFoodSurplus());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getDisposalMethod())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getDisposalMethod, canteenLeftoverDisposal.getDisposalMethod());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getDisposalName())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getDisposalName, canteenLeftoverDisposal.getDisposalName());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getLinkTel())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getLinkTel, canteenLeftoverDisposal.getLinkTel());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getPhoto())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getPhoto, canteenLeftoverDisposal.getPhoto());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getRemark())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getRemark, canteenLeftoverDisposal.getRemark());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getCreateName())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getCreateName, canteenLeftoverDisposal.getCreateName());
        }
        if (canteenLeftoverDisposal.getAreaCode() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getAreaCode, canteenLeftoverDisposal.getAreaCode());
        }
        if (StringUtil.isNotEmpty(canteenLeftoverDisposal.getAreaName())) {
            queryWrapper.eq(CanteenLeftoverDisposal::getAreaName, canteenLeftoverDisposal.getAreaName());
        }
        if (canteenLeftoverDisposal.getCreateUser() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getCreateUser, canteenLeftoverDisposal.getCreateUser());
        }
        if (canteenLeftoverDisposal.getCreateDept() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getCreateDept, canteenLeftoverDisposal.getCreateDept());
        }
        if (canteenLeftoverDisposal.getCreateTime() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getCreateTime, canteenLeftoverDisposal.getCreateTime());
        }
        if (canteenLeftoverDisposal.getUpdateUser() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getUpdateUser, canteenLeftoverDisposal.getUpdateUser());
        }
        if (canteenLeftoverDisposal.getUpdateTime() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getUpdateTime, canteenLeftoverDisposal.getUpdateTime());
        }
        if (canteenLeftoverDisposal.getIsDeleted() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getIsDeleted, canteenLeftoverDisposal.getIsDeleted());
        }
        if (canteenLeftoverDisposal.getStatus() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getStatus, canteenLeftoverDisposal.getStatus());
        }
        if (canteenLeftoverDisposal.getGspState() != null) {
            queryWrapper.eq(CanteenLeftoverDisposal::getGspState, canteenLeftoverDisposal.getGspState());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param canteenLeftoverDisposal 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CanteenLeftoverDisposal insert(CanteenLeftoverDisposal canteenLeftoverDisposal) {
        canteenLeftoverDisposal.setId(null);
        getBaseMapper().insert(canteenLeftoverDisposal);
        return canteenLeftoverDisposal;
    }

    /**
    * 更新数据
    *
    * @param canteenLeftoverDisposal 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CanteenLeftoverDisposal update(CanteenLeftoverDisposal canteenLeftoverDisposal) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CanteenLeftoverDisposal> chainWrapper = new LambdaUpdateChainWrapper<CanteenLeftoverDisposal>(getBaseMapper());
        if (canteenLeftoverDisposal.getId() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getId, canteenLeftoverDisposal.getId());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getTenantId())) {
            chainWrapper.set(CanteenLeftoverDisposal::getTenantId, canteenLeftoverDisposal.getTenantId());
        }
        if (canteenLeftoverDisposal.getCorpId() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getCorpId, canteenLeftoverDisposal.getCorpId());
        }
        if (canteenLeftoverDisposal.getInstitutionId() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getInstitutionId, canteenLeftoverDisposal.getInstitutionId());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getInstitutionName())) {
            chainWrapper.set(CanteenLeftoverDisposal::getInstitutionName, canteenLeftoverDisposal.getInstitutionName());
        }
        if (canteenLeftoverDisposal.getDisposalDate() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getDisposalDate, canteenLeftoverDisposal.getDisposalDate());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getFoodType())) {
            chainWrapper.set(CanteenLeftoverDisposal::getFoodType, canteenLeftoverDisposal.getFoodType());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getFoodName())) {
            chainWrapper.set(CanteenLeftoverDisposal::getFoodName, canteenLeftoverDisposal.getFoodName());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getFoodSurplus())) {
            chainWrapper.set(CanteenLeftoverDisposal::getFoodSurplus, canteenLeftoverDisposal.getFoodSurplus());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getDisposalMethod())) {
            chainWrapper.set(CanteenLeftoverDisposal::getDisposalMethod, canteenLeftoverDisposal.getDisposalMethod());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getDisposalName())) {
            chainWrapper.set(CanteenLeftoverDisposal::getDisposalName, canteenLeftoverDisposal.getDisposalName());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getLinkTel())) {
            chainWrapper.set(CanteenLeftoverDisposal::getLinkTel, canteenLeftoverDisposal.getLinkTel());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getPhoto())) {
            chainWrapper.set(CanteenLeftoverDisposal::getPhoto, canteenLeftoverDisposal.getPhoto());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getRemark())) {
            chainWrapper.set(CanteenLeftoverDisposal::getRemark, canteenLeftoverDisposal.getRemark());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getCreateName())) {
            chainWrapper.set(CanteenLeftoverDisposal::getCreateName, canteenLeftoverDisposal.getCreateName());
        }
        if (canteenLeftoverDisposal.getAreaCode() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getAreaCode, canteenLeftoverDisposal.getAreaCode());
        }
        if (StringUtil.isNotBlank(canteenLeftoverDisposal.getAreaName())) {
            chainWrapper.set(CanteenLeftoverDisposal::getAreaName, canteenLeftoverDisposal.getAreaName());
        }
        if (canteenLeftoverDisposal.getCreateUser() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getCreateUser, canteenLeftoverDisposal.getCreateUser());
        }
        if (canteenLeftoverDisposal.getCreateDept() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getCreateDept, canteenLeftoverDisposal.getCreateDept());
        }
        if (canteenLeftoverDisposal.getCreateTime() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getCreateTime, canteenLeftoverDisposal.getCreateTime());
        }
        if (canteenLeftoverDisposal.getUpdateUser() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getUpdateUser, canteenLeftoverDisposal.getUpdateUser());
        }
        if (canteenLeftoverDisposal.getUpdateTime() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getUpdateTime, canteenLeftoverDisposal.getUpdateTime());
        }
        if (canteenLeftoverDisposal.getIsDeleted() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getIsDeleted, canteenLeftoverDisposal.getIsDeleted());
        }
        if (canteenLeftoverDisposal.getStatus() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getStatus, canteenLeftoverDisposal.getStatus());
        }
        if (canteenLeftoverDisposal.getGspState() != null) {
            chainWrapper.set(CanteenLeftoverDisposal::getGspState, canteenLeftoverDisposal.getGspState());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CanteenLeftoverDisposal::getId, canteenLeftoverDisposal.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(canteenLeftoverDisposal.getId());
        } else {
            return canteenLeftoverDisposal;
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
    public boolean saveCanteenLeftoverDisposalBatch(List<CanteenLeftoverDisposal> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CanteenLeftoverDisposal canteenLeftoverDisposal : insertList) {
            //使用默认的雪花算法生成
            canteenLeftoverDisposal.setId(null);
            //canteenLeftoverDisposal.setCreatedDt(currentDte);
            //canteenLeftoverDisposal.setUpdatedDt(currentDte);
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
    public Integer deleteCanteenLeftoverDisposalBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CanteenLeftoverDisposal> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


