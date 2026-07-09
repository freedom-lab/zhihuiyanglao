package cn.pluss.platform.service.canteenKitchenHygiene.impl;

import cn.pluss.platform.mapper.CanteenKitchenHygieneMapper;
import cn.pluss.platform.model.entity.CanteenKitchenHygiene;
import cn.pluss.platform.service.canteenKitchenHygiene.CanteenKitchenHygieneService;
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
@Service("canteenKitchenHygieneService")
public class CanteenKitchenHygieneServiceImpl extends ServiceImpl< CanteenKitchenHygieneMapper, CanteenKitchenHygiene> implements CanteenKitchenHygieneService {
    private static final Logger logger = LoggerFactory.getLogger(CanteenKitchenHygieneServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<CanteenKitchenHygiene> queryPage(Map map) {
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
    public CanteenKitchenHygiene queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param canteenKitchenHygiene 实例对象
    * @return 实例对象
    */
    @Override
    public CanteenKitchenHygiene queryOne(CanteenKitchenHygiene canteenKitchenHygiene){
        LambdaQueryWrapper<CanteenKitchenHygiene> queryWrapper = getQueryWrapper(canteenKitchenHygiene);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param canteenKitchenHygiene
    * @return
    */
    @Override
    public List<CanteenKitchenHygiene> queryList(CanteenKitchenHygiene canteenKitchenHygiene) {
        LambdaQueryWrapper<CanteenKitchenHygiene> queryWrapper = getQueryWrapper(canteenKitchenHygiene);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param canteenKitchenHygiene
    * @return
    */
    public static LambdaQueryWrapper<CanteenKitchenHygiene> getQueryWrapper(CanteenKitchenHygiene canteenKitchenHygiene){
        LambdaQueryWrapper<CanteenKitchenHygiene> queryWrapper = new LambdaQueryWrapper<>();
        if (canteenKitchenHygiene.getId() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getId, canteenKitchenHygiene.getId());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getTenantId())) {
            queryWrapper.eq(CanteenKitchenHygiene::getTenantId, canteenKitchenHygiene.getTenantId());
        }
        if (canteenKitchenHygiene.getCorpId() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getCorpId, canteenKitchenHygiene.getCorpId());
        }
        if (canteenKitchenHygiene.getInstitutionId() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getInstitutionId, canteenKitchenHygiene.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getInstitutionName())) {
            queryWrapper.eq(CanteenKitchenHygiene::getInstitutionName, canteenKitchenHygiene.getInstitutionName());
        }
        if (canteenKitchenHygiene.getCheckDate() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getCheckDate, canteenKitchenHygiene.getCheckDate());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getCheckItem())) {
            queryWrapper.eq(CanteenKitchenHygiene::getCheckItem, canteenKitchenHygiene.getCheckItem());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getHygieneState())) {
            queryWrapper.eq(CanteenKitchenHygiene::getHygieneState, canteenKitchenHygiene.getHygieneState());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getCheckContent())) {
            queryWrapper.eq(CanteenKitchenHygiene::getCheckContent, canteenKitchenHygiene.getCheckContent());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getLinkMan())) {
            queryWrapper.eq(CanteenKitchenHygiene::getLinkMan, canteenKitchenHygiene.getLinkMan());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getLinkTel())) {
            queryWrapper.eq(CanteenKitchenHygiene::getLinkTel, canteenKitchenHygiene.getLinkTel());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getCheckName())) {
            queryWrapper.eq(CanteenKitchenHygiene::getCheckName, canteenKitchenHygiene.getCheckName());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getPhoto())) {
            queryWrapper.eq(CanteenKitchenHygiene::getPhoto, canteenKitchenHygiene.getPhoto());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getRemark())) {
            queryWrapper.eq(CanteenKitchenHygiene::getRemark, canteenKitchenHygiene.getRemark());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getCreateName())) {
            queryWrapper.eq(CanteenKitchenHygiene::getCreateName, canteenKitchenHygiene.getCreateName());
        }
        if (canteenKitchenHygiene.getAreaCode() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getAreaCode, canteenKitchenHygiene.getAreaCode());
        }
        if (StringUtil.isNotEmpty(canteenKitchenHygiene.getAreaName())) {
            queryWrapper.eq(CanteenKitchenHygiene::getAreaName, canteenKitchenHygiene.getAreaName());
        }
        if (canteenKitchenHygiene.getCreateUser() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getCreateUser, canteenKitchenHygiene.getCreateUser());
        }
        if (canteenKitchenHygiene.getCreateDept() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getCreateDept, canteenKitchenHygiene.getCreateDept());
        }
        if (canteenKitchenHygiene.getCreateTime() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getCreateTime, canteenKitchenHygiene.getCreateTime());
        }
        if (canteenKitchenHygiene.getUpdateUser() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getUpdateUser, canteenKitchenHygiene.getUpdateUser());
        }
        if (canteenKitchenHygiene.getUpdateTime() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getUpdateTime, canteenKitchenHygiene.getUpdateTime());
        }
        if (canteenKitchenHygiene.getIsDeleted() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getIsDeleted, canteenKitchenHygiene.getIsDeleted());
        }
        if (canteenKitchenHygiene.getStatus() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getStatus, canteenKitchenHygiene.getStatus());
        }
        if (canteenKitchenHygiene.getGspState() != null) {
            queryWrapper.eq(CanteenKitchenHygiene::getGspState, canteenKitchenHygiene.getGspState());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param canteenKitchenHygiene 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CanteenKitchenHygiene insert(CanteenKitchenHygiene canteenKitchenHygiene) {
        canteenKitchenHygiene.setId(null);
        getBaseMapper().insert(canteenKitchenHygiene);
        return canteenKitchenHygiene;
    }

    /**
    * 更新数据
    *
    * @param canteenKitchenHygiene 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public CanteenKitchenHygiene update(CanteenKitchenHygiene canteenKitchenHygiene) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<CanteenKitchenHygiene> chainWrapper = new LambdaUpdateChainWrapper<CanteenKitchenHygiene>(getBaseMapper());
        if (canteenKitchenHygiene.getId() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getId, canteenKitchenHygiene.getId());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getTenantId())) {
            chainWrapper.set(CanteenKitchenHygiene::getTenantId, canteenKitchenHygiene.getTenantId());
        }
        if (canteenKitchenHygiene.getCorpId() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getCorpId, canteenKitchenHygiene.getCorpId());
        }
        if (canteenKitchenHygiene.getInstitutionId() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getInstitutionId, canteenKitchenHygiene.getInstitutionId());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getInstitutionName())) {
            chainWrapper.set(CanteenKitchenHygiene::getInstitutionName, canteenKitchenHygiene.getInstitutionName());
        }
        if (canteenKitchenHygiene.getCheckDate() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getCheckDate, canteenKitchenHygiene.getCheckDate());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getCheckItem())) {
            chainWrapper.set(CanteenKitchenHygiene::getCheckItem, canteenKitchenHygiene.getCheckItem());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getHygieneState())) {
            chainWrapper.set(CanteenKitchenHygiene::getHygieneState, canteenKitchenHygiene.getHygieneState());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getCheckContent())) {
            chainWrapper.set(CanteenKitchenHygiene::getCheckContent, canteenKitchenHygiene.getCheckContent());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getLinkMan())) {
            chainWrapper.set(CanteenKitchenHygiene::getLinkMan, canteenKitchenHygiene.getLinkMan());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getLinkTel())) {
            chainWrapper.set(CanteenKitchenHygiene::getLinkTel, canteenKitchenHygiene.getLinkTel());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getCheckName())) {
            chainWrapper.set(CanteenKitchenHygiene::getCheckName, canteenKitchenHygiene.getCheckName());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getPhoto())) {
            chainWrapper.set(CanteenKitchenHygiene::getPhoto, canteenKitchenHygiene.getPhoto());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getRemark())) {
            chainWrapper.set(CanteenKitchenHygiene::getRemark, canteenKitchenHygiene.getRemark());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getCreateName())) {
            chainWrapper.set(CanteenKitchenHygiene::getCreateName, canteenKitchenHygiene.getCreateName());
        }
        if (canteenKitchenHygiene.getAreaCode() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getAreaCode, canteenKitchenHygiene.getAreaCode());
        }
        if (StringUtil.isNotBlank(canteenKitchenHygiene.getAreaName())) {
            chainWrapper.set(CanteenKitchenHygiene::getAreaName, canteenKitchenHygiene.getAreaName());
        }
        if (canteenKitchenHygiene.getCreateUser() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getCreateUser, canteenKitchenHygiene.getCreateUser());
        }
        if (canteenKitchenHygiene.getCreateDept() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getCreateDept, canteenKitchenHygiene.getCreateDept());
        }
        if (canteenKitchenHygiene.getCreateTime() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getCreateTime, canteenKitchenHygiene.getCreateTime());
        }
        if (canteenKitchenHygiene.getUpdateUser() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getUpdateUser, canteenKitchenHygiene.getUpdateUser());
        }
        if (canteenKitchenHygiene.getUpdateTime() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getUpdateTime, canteenKitchenHygiene.getUpdateTime());
        }
        if (canteenKitchenHygiene.getIsDeleted() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getIsDeleted, canteenKitchenHygiene.getIsDeleted());
        }
        if (canteenKitchenHygiene.getStatus() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getStatus, canteenKitchenHygiene.getStatus());
        }
        if (canteenKitchenHygiene.getGspState() != null) {
            chainWrapper.set(CanteenKitchenHygiene::getGspState, canteenKitchenHygiene.getGspState());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(CanteenKitchenHygiene::getId, canteenKitchenHygiene.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(canteenKitchenHygiene.getId());
        } else {
            return canteenKitchenHygiene;
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
    public boolean saveCanteenKitchenHygieneBatch(List<CanteenKitchenHygiene> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (CanteenKitchenHygiene canteenKitchenHygiene : insertList) {
            //使用默认的雪花算法生成
            canteenKitchenHygiene.setId(null);
            //canteenKitchenHygiene.setCreatedDt(currentDte);
            //canteenKitchenHygiene.setUpdatedDt(currentDte);
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
    public Integer deleteCanteenKitchenHygieneBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<CanteenKitchenHygiene> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


