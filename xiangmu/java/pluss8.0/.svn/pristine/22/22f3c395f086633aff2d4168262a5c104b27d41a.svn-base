package cn.pluss.platform.service.insNursingRehabItem.impl;

import cn.pluss.platform.mapper.InsNursingRehabItemMapper;
import cn.pluss.platform.model.entity.InsNursingRehabItem;
import cn.pluss.platform.service.insNursingRehabItem.InsNursingRehabItemService;
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
@Service("insNursingRehabItemService")
public class InsNursingRehabItemServiceImpl extends ServiceImpl< InsNursingRehabItemMapper, InsNursingRehabItem> implements InsNursingRehabItemService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingRehabItemServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingRehabItem> queryPage(Map map) {
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
    public InsNursingRehabItem queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRehabItem 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingRehabItem queryOne(InsNursingRehabItem insNursingRehabItem){
        LambdaQueryWrapper<InsNursingRehabItem> queryWrapper = getQueryWrapper(insNursingRehabItem);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRehabItem
    * @return
    */
    @Override
    public List<InsNursingRehabItem> queryList(InsNursingRehabItem insNursingRehabItem) {
        LambdaQueryWrapper<InsNursingRehabItem> queryWrapper = getQueryWrapper(insNursingRehabItem);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingRehabItem
    * @return
    */
    public static LambdaQueryWrapper<InsNursingRehabItem> getQueryWrapper(InsNursingRehabItem insNursingRehabItem){
        LambdaQueryWrapper<InsNursingRehabItem> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingRehabItem.getId() != null) {
            queryWrapper.eq(InsNursingRehabItem::getId, insNursingRehabItem.getId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItem.getTenantId())) {
            queryWrapper.eq(InsNursingRehabItem::getTenantId, insNursingRehabItem.getTenantId());
        }
        if (insNursingRehabItem.getCorpId() != null) {
            queryWrapper.eq(InsNursingRehabItem::getCorpId, insNursingRehabItem.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItem.getCorpName())) {
            queryWrapper.eq(InsNursingRehabItem::getCorpName, insNursingRehabItem.getCorpName());
        }
        if (insNursingRehabItem.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingRehabItem::getInstitutionId, insNursingRehabItem.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItem.getInstitutionName())) {
            queryWrapper.eq(InsNursingRehabItem::getInstitutionName, insNursingRehabItem.getInstitutionName());
        }
        if (insNursingRehabItem.getTypeId() != null) {
            queryWrapper.eq(InsNursingRehabItem::getTypeId, insNursingRehabItem.getTypeId());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItem.getTypeName())) {
            queryWrapper.eq(InsNursingRehabItem::getTypeName, insNursingRehabItem.getTypeName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItem.getItemName())) {
            queryWrapper.eq(InsNursingRehabItem::getItemName, insNursingRehabItem.getItemName());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItem.getTrainingContent())) {
            queryWrapper.eq(InsNursingRehabItem::getTrainingContent, insNursingRehabItem.getTrainingContent());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItem.getRemark())) {
            queryWrapper.eq(InsNursingRehabItem::getRemark, insNursingRehabItem.getRemark());
        }
        if (insNursingRehabItem.getCreateUser() != null) {
            queryWrapper.eq(InsNursingRehabItem::getCreateUser, insNursingRehabItem.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingRehabItem.getCreateName())) {
            queryWrapper.eq(InsNursingRehabItem::getCreateName, insNursingRehabItem.getCreateName());
        }
        if (insNursingRehabItem.getCreateDept() != null) {
            queryWrapper.eq(InsNursingRehabItem::getCreateDept, insNursingRehabItem.getCreateDept());
        }
        if (insNursingRehabItem.getCreateTime() != null) {
            queryWrapper.eq(InsNursingRehabItem::getCreateTime, insNursingRehabItem.getCreateTime());
        }
        if (insNursingRehabItem.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingRehabItem::getUpdateUser, insNursingRehabItem.getUpdateUser());
        }
        if (insNursingRehabItem.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingRehabItem::getUpdateTime, insNursingRehabItem.getUpdateTime());
        }
        if (insNursingRehabItem.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingRehabItem::getIsDeleted, insNursingRehabItem.getIsDeleted());
        }
        if (insNursingRehabItem.getStatus() != null) {
            queryWrapper.eq(InsNursingRehabItem::getStatus, insNursingRehabItem.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingRehabItem 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabItem insert(InsNursingRehabItem insNursingRehabItem) {
        insNursingRehabItem.setId(null);
        getBaseMapper().insert(insNursingRehabItem);
        return insNursingRehabItem;
    }

    /**
    * 更新数据
    *
    * @param insNursingRehabItem 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingRehabItem update(InsNursingRehabItem insNursingRehabItem) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingRehabItem> chainWrapper = new LambdaUpdateChainWrapper<InsNursingRehabItem>(getBaseMapper());
        if (insNursingRehabItem.getId() != null) {
            chainWrapper.set(InsNursingRehabItem::getId, insNursingRehabItem.getId());
        }
        if (StringUtil.isNotBlank(insNursingRehabItem.getTenantId())) {
            chainWrapper.set(InsNursingRehabItem::getTenantId, insNursingRehabItem.getTenantId());
        }
        if (insNursingRehabItem.getCorpId() != null) {
            chainWrapper.set(InsNursingRehabItem::getCorpId, insNursingRehabItem.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingRehabItem.getCorpName())) {
            chainWrapper.set(InsNursingRehabItem::getCorpName, insNursingRehabItem.getCorpName());
        }
        if (insNursingRehabItem.getInstitutionId() != null) {
            chainWrapper.set(InsNursingRehabItem::getInstitutionId, insNursingRehabItem.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingRehabItem.getInstitutionName())) {
            chainWrapper.set(InsNursingRehabItem::getInstitutionName, insNursingRehabItem.getInstitutionName());
        }
        if (insNursingRehabItem.getTypeId() != null) {
            chainWrapper.set(InsNursingRehabItem::getTypeId, insNursingRehabItem.getTypeId());
        }
        if (StringUtil.isNotBlank(insNursingRehabItem.getTypeName())) {
            chainWrapper.set(InsNursingRehabItem::getTypeName, insNursingRehabItem.getTypeName());
        }
        if (StringUtil.isNotBlank(insNursingRehabItem.getItemName())) {
            chainWrapper.set(InsNursingRehabItem::getItemName, insNursingRehabItem.getItemName());
        }
        if (StringUtil.isNotBlank(insNursingRehabItem.getTrainingContent())) {
            chainWrapper.set(InsNursingRehabItem::getTrainingContent, insNursingRehabItem.getTrainingContent());
        }
        if (StringUtil.isNotBlank(insNursingRehabItem.getRemark())) {
            chainWrapper.set(InsNursingRehabItem::getRemark, insNursingRehabItem.getRemark());
        }
        if (insNursingRehabItem.getCreateUser() != null) {
            chainWrapper.set(InsNursingRehabItem::getCreateUser, insNursingRehabItem.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingRehabItem.getCreateName())) {
            chainWrapper.set(InsNursingRehabItem::getCreateName, insNursingRehabItem.getCreateName());
        }
        if (insNursingRehabItem.getCreateDept() != null) {
            chainWrapper.set(InsNursingRehabItem::getCreateDept, insNursingRehabItem.getCreateDept());
        }
        if (insNursingRehabItem.getCreateTime() != null) {
            chainWrapper.set(InsNursingRehabItem::getCreateTime, insNursingRehabItem.getCreateTime());
        }
        if (insNursingRehabItem.getUpdateUser() != null) {
            chainWrapper.set(InsNursingRehabItem::getUpdateUser, insNursingRehabItem.getUpdateUser());
        }
        if (insNursingRehabItem.getUpdateTime() != null) {
            chainWrapper.set(InsNursingRehabItem::getUpdateTime, insNursingRehabItem.getUpdateTime());
        }
        if (insNursingRehabItem.getIsDeleted() != null) {
            chainWrapper.set(InsNursingRehabItem::getIsDeleted, insNursingRehabItem.getIsDeleted());
        }
        if (insNursingRehabItem.getStatus() != null) {
            chainWrapper.set(InsNursingRehabItem::getStatus, insNursingRehabItem.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingRehabItem::getId, insNursingRehabItem.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingRehabItem.getId());
        } else {
            return insNursingRehabItem;
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
    public boolean saveInsNursingRehabItemBatch(List<InsNursingRehabItem> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingRehabItem insNursingRehabItem : insertList) {
            //使用默认的雪花算法生成
            insNursingRehabItem.setId(null);
            //insNursingRehabItem.setCreatedDt(currentDte);
            //insNursingRehabItem.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingRehabItemBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingRehabItem> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


