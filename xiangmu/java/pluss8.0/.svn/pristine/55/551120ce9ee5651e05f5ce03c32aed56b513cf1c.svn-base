package cn.pluss.platform.service.insNursingServiceItem.impl;

import cn.pluss.platform.mapper.InsNursingServiceItemMapper;
import cn.pluss.platform.model.entity.InsNursingServiceItem;
import cn.pluss.platform.service.insNursingServiceItem.InsNursingServiceItemService;
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
@Service("insNursingServiceItemService")
public class InsNursingServiceItemServiceImpl extends ServiceImpl< InsNursingServiceItemMapper, InsNursingServiceItem> implements InsNursingServiceItemService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingServiceItemServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingServiceItem> queryPage(Map map) {
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
    public InsNursingServiceItem queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingServiceItem 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingServiceItem queryOne(InsNursingServiceItem insNursingServiceItem){
        LambdaQueryWrapper<InsNursingServiceItem> queryWrapper = getQueryWrapper(insNursingServiceItem);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingServiceItem
    * @return
    */
    @Override
    public List<InsNursingServiceItem> queryList(InsNursingServiceItem insNursingServiceItem) {
        LambdaQueryWrapper<InsNursingServiceItem> queryWrapper = getQueryWrapper(insNursingServiceItem);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingServiceItem
    * @return
    */
    public static LambdaQueryWrapper<InsNursingServiceItem> getQueryWrapper(InsNursingServiceItem insNursingServiceItem){
        LambdaQueryWrapper<InsNursingServiceItem> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingServiceItem.getId() != null) {
            queryWrapper.eq(InsNursingServiceItem::getId, insNursingServiceItem.getId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getTenantId())) {
            queryWrapper.eq(InsNursingServiceItem::getTenantId, insNursingServiceItem.getTenantId());
        }
        if (insNursingServiceItem.getCorpId() != null) {
            queryWrapper.eq(InsNursingServiceItem::getCorpId, insNursingServiceItem.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getCorpName())) {
            queryWrapper.eq(InsNursingServiceItem::getCorpName, insNursingServiceItem.getCorpName());
        }
        if (insNursingServiceItem.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingServiceItem::getInstitutionId, insNursingServiceItem.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getInstitutionName())) {
            queryWrapper.eq(InsNursingServiceItem::getInstitutionName, insNursingServiceItem.getInstitutionName());
        }
        if (insNursingServiceItem.getTypeId() != null) {
            queryWrapper.eq(InsNursingServiceItem::getTypeId, insNursingServiceItem.getTypeId());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getTypeName())) {
            queryWrapper.eq(InsNursingServiceItem::getTypeName, insNursingServiceItem.getTypeName());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getItemName())) {
            queryWrapper.eq(InsNursingServiceItem::getItemName, insNursingServiceItem.getItemName());
        }
        if (insNursingServiceItem.getItemPrice() != null) {
            queryWrapper.eq(InsNursingServiceItem::getItemPrice, insNursingServiceItem.getItemPrice());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getPriceIllustrate())) {
            queryWrapper.eq(InsNursingServiceItem::getPriceIllustrate, insNursingServiceItem.getPriceIllustrate());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getIconPath())) {
            queryWrapper.eq(InsNursingServiceItem::getIconPath, insNursingServiceItem.getIconPath());
        }
        if (insNursingServiceItem.getIntegralNum() != null) {
            queryWrapper.eq(InsNursingServiceItem::getIntegralNum, insNursingServiceItem.getIntegralNum());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getRemark())) {
            queryWrapper.eq(InsNursingServiceItem::getRemark, insNursingServiceItem.getRemark());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getItemDescription())) {
            queryWrapper.eq(InsNursingServiceItem::getItemDescription, insNursingServiceItem.getItemDescription());
        }
        if (insNursingServiceItem.getCreateUser() != null) {
            queryWrapper.eq(InsNursingServiceItem::getCreateUser, insNursingServiceItem.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingServiceItem.getCreateName())) {
            queryWrapper.eq(InsNursingServiceItem::getCreateName, insNursingServiceItem.getCreateName());
        }
        if (insNursingServiceItem.getCreateDept() != null) {
            queryWrapper.eq(InsNursingServiceItem::getCreateDept, insNursingServiceItem.getCreateDept());
        }
        if (insNursingServiceItem.getCreateTime() != null) {
            queryWrapper.eq(InsNursingServiceItem::getCreateTime, insNursingServiceItem.getCreateTime());
        }
        if (insNursingServiceItem.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingServiceItem::getUpdateUser, insNursingServiceItem.getUpdateUser());
        }
        if (insNursingServiceItem.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingServiceItem::getUpdateTime, insNursingServiceItem.getUpdateTime());
        }
        if (insNursingServiceItem.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingServiceItem::getIsDeleted, insNursingServiceItem.getIsDeleted());
        }
        if (insNursingServiceItem.getStatus() != null) {
            queryWrapper.eq(InsNursingServiceItem::getStatus, insNursingServiceItem.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingServiceItem 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingServiceItem insert(InsNursingServiceItem insNursingServiceItem) {
        insNursingServiceItem.setId(null);
        getBaseMapper().insert(insNursingServiceItem);
        return insNursingServiceItem;
    }

    /**
    * 更新数据
    *
    * @param insNursingServiceItem 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingServiceItem update(InsNursingServiceItem insNursingServiceItem) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingServiceItem> chainWrapper = new LambdaUpdateChainWrapper<InsNursingServiceItem>(getBaseMapper());
        if (insNursingServiceItem.getId() != null) {
            chainWrapper.set(InsNursingServiceItem::getId, insNursingServiceItem.getId());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getTenantId())) {
            chainWrapper.set(InsNursingServiceItem::getTenantId, insNursingServiceItem.getTenantId());
        }
        if (insNursingServiceItem.getCorpId() != null) {
            chainWrapper.set(InsNursingServiceItem::getCorpId, insNursingServiceItem.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getCorpName())) {
            chainWrapper.set(InsNursingServiceItem::getCorpName, insNursingServiceItem.getCorpName());
        }
        if (insNursingServiceItem.getInstitutionId() != null) {
            chainWrapper.set(InsNursingServiceItem::getInstitutionId, insNursingServiceItem.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getInstitutionName())) {
            chainWrapper.set(InsNursingServiceItem::getInstitutionName, insNursingServiceItem.getInstitutionName());
        }
        if (insNursingServiceItem.getTypeId() != null) {
            chainWrapper.set(InsNursingServiceItem::getTypeId, insNursingServiceItem.getTypeId());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getTypeName())) {
            chainWrapper.set(InsNursingServiceItem::getTypeName, insNursingServiceItem.getTypeName());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getItemName())) {
            chainWrapper.set(InsNursingServiceItem::getItemName, insNursingServiceItem.getItemName());
        }
        if (insNursingServiceItem.getItemPrice() != null) {
            chainWrapper.set(InsNursingServiceItem::getItemPrice, insNursingServiceItem.getItemPrice());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getPriceIllustrate())) {
            chainWrapper.set(InsNursingServiceItem::getPriceIllustrate, insNursingServiceItem.getPriceIllustrate());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getIconPath())) {
            chainWrapper.set(InsNursingServiceItem::getIconPath, insNursingServiceItem.getIconPath());
        }
        if (insNursingServiceItem.getIntegralNum() != null) {
            chainWrapper.set(InsNursingServiceItem::getIntegralNum, insNursingServiceItem.getIntegralNum());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getRemark())) {
            chainWrapper.set(InsNursingServiceItem::getRemark, insNursingServiceItem.getRemark());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getItemDescription())) {
            chainWrapper.set(InsNursingServiceItem::getItemDescription, insNursingServiceItem.getItemDescription());
        }
        if (insNursingServiceItem.getCreateUser() != null) {
            chainWrapper.set(InsNursingServiceItem::getCreateUser, insNursingServiceItem.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingServiceItem.getCreateName())) {
            chainWrapper.set(InsNursingServiceItem::getCreateName, insNursingServiceItem.getCreateName());
        }
        if (insNursingServiceItem.getCreateDept() != null) {
            chainWrapper.set(InsNursingServiceItem::getCreateDept, insNursingServiceItem.getCreateDept());
        }
        if (insNursingServiceItem.getCreateTime() != null) {
            chainWrapper.set(InsNursingServiceItem::getCreateTime, insNursingServiceItem.getCreateTime());
        }
        if (insNursingServiceItem.getUpdateUser() != null) {
            chainWrapper.set(InsNursingServiceItem::getUpdateUser, insNursingServiceItem.getUpdateUser());
        }
        if (insNursingServiceItem.getUpdateTime() != null) {
            chainWrapper.set(InsNursingServiceItem::getUpdateTime, insNursingServiceItem.getUpdateTime());
        }
        if (insNursingServiceItem.getIsDeleted() != null) {
            chainWrapper.set(InsNursingServiceItem::getIsDeleted, insNursingServiceItem.getIsDeleted());
        }
        if (insNursingServiceItem.getStatus() != null) {
            chainWrapper.set(InsNursingServiceItem::getStatus, insNursingServiceItem.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingServiceItem::getId, insNursingServiceItem.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingServiceItem.getId());
        } else {
            return insNursingServiceItem;
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
    public boolean saveInsNursingServiceItemBatch(List<InsNursingServiceItem> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingServiceItem insNursingServiceItem : insertList) {
            //使用默认的雪花算法生成
            insNursingServiceItem.setId(null);
            //insNursingServiceItem.setCreatedDt(currentDte);
            //insNursingServiceItem.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingServiceItemBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingServiceItem> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


