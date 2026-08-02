package cn.pluss.platform.service.marketGoodsType.impl;

import cn.pluss.platform.mapper.MarketGoodsTypeMapper;
import cn.pluss.platform.model.entity.MarketGoodsType;
import cn.pluss.platform.service.marketGoodsType.MarketGoodsTypeService;
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
@Service("marketGoodsTypeService")
public class MarketGoodsTypeServiceImpl extends ServiceImpl< MarketGoodsTypeMapper, MarketGoodsType> implements MarketGoodsTypeService {
    private static final Logger logger = LoggerFactory.getLogger(MarketGoodsTypeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketGoodsType> queryPage(Map map) {
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
    public MarketGoodsType queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsType 实例对象
    * @return 实例对象
    */
    @Override
    public MarketGoodsType queryOne(MarketGoodsType marketGoodsType){
        LambdaQueryWrapper<MarketGoodsType> queryWrapper = getQueryWrapper(marketGoodsType);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketGoodsType
    * @return
    */
    @Override
    public List<MarketGoodsType> queryList(MarketGoodsType marketGoodsType) {
        LambdaQueryWrapper<MarketGoodsType> queryWrapper = getQueryWrapper(marketGoodsType);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketGoodsType
    * @return
    */
    public static LambdaQueryWrapper<MarketGoodsType> getQueryWrapper(MarketGoodsType marketGoodsType){
        LambdaQueryWrapper<MarketGoodsType> queryWrapper = new LambdaQueryWrapper<>();
        if (marketGoodsType.getId() != null) {
            queryWrapper.eq(MarketGoodsType::getId, marketGoodsType.getId());
        }
        if (StringUtil.isNotEmpty(marketGoodsType.getTenantId())) {
            queryWrapper.eq(MarketGoodsType::getTenantId, marketGoodsType.getTenantId());
        }
        if (marketGoodsType.getCorpId() != null) {
            queryWrapper.eq(MarketGoodsType::getCorpId, marketGoodsType.getCorpId());
        }
        if (marketGoodsType.getInstitutionId() != null) {
            queryWrapper.eq(MarketGoodsType::getInstitutionId, marketGoodsType.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(marketGoodsType.getInstitutionName())) {
            queryWrapper.eq(MarketGoodsType::getInstitutionName, marketGoodsType.getInstitutionName());
        }
        if (marketGoodsType.getParentId() != null) {
            queryWrapper.eq(MarketGoodsType::getParentId, marketGoodsType.getParentId());
        }
        if (StringUtil.isNotEmpty(marketGoodsType.getParentName())) {
            queryWrapper.eq(MarketGoodsType::getParentName, marketGoodsType.getParentName());
        }
        if (StringUtil.isNotEmpty(marketGoodsType.getCategoryType())) {
            queryWrapper.eq(MarketGoodsType::getCategoryType, marketGoodsType.getCategoryType());
        }
        if (StringUtil.isNotEmpty(marketGoodsType.getTypeName())) {
            queryWrapper.eq(MarketGoodsType::getTypeName, marketGoodsType.getTypeName());
        }
        if (StringUtil.isNotEmpty(marketGoodsType.getIcon())) {
            queryWrapper.eq(MarketGoodsType::getIcon, marketGoodsType.getIcon());
        }
        if (StringUtil.isNotEmpty(marketGoodsType.getPic())) {
            queryWrapper.eq(MarketGoodsType::getPic, marketGoodsType.getPic());
        }
        if (marketGoodsType.getSort() != null) {
            queryWrapper.eq(MarketGoodsType::getSort, marketGoodsType.getSort());
        }
        if (marketGoodsType.getGrade() != null) {
            queryWrapper.eq(MarketGoodsType::getGrade, marketGoodsType.getGrade());
        }
        if (StringUtil.isNotEmpty(marketGoodsType.getRemark())) {
            queryWrapper.eq(MarketGoodsType::getRemark, marketGoodsType.getRemark());
        }
        if (marketGoodsType.getCreateUser() != null) {
            queryWrapper.eq(MarketGoodsType::getCreateUser, marketGoodsType.getCreateUser());
        }
        if (marketGoodsType.getCreateDept() != null) {
            queryWrapper.eq(MarketGoodsType::getCreateDept, marketGoodsType.getCreateDept());
        }
        if (marketGoodsType.getCreateTime() != null) {
            queryWrapper.eq(MarketGoodsType::getCreateTime, marketGoodsType.getCreateTime());
        }
        if (marketGoodsType.getUpdateUser() != null) {
            queryWrapper.eq(MarketGoodsType::getUpdateUser, marketGoodsType.getUpdateUser());
        }
        if (marketGoodsType.getUpdateTime() != null) {
            queryWrapper.eq(MarketGoodsType::getUpdateTime, marketGoodsType.getUpdateTime());
        }
        if (marketGoodsType.getStatus() != null) {
            queryWrapper.eq(MarketGoodsType::getStatus, marketGoodsType.getStatus());
        }
        if (marketGoodsType.getIsDeleted() != null) {
            queryWrapper.eq(MarketGoodsType::getIsDeleted, marketGoodsType.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketGoodsType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsType insert(MarketGoodsType marketGoodsType) {
        marketGoodsType.setId(null);
        getBaseMapper().insert(marketGoodsType);
        return marketGoodsType;
    }

    /**
    * 更新数据
    *
    * @param marketGoodsType 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketGoodsType update(MarketGoodsType marketGoodsType) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketGoodsType> chainWrapper = new LambdaUpdateChainWrapper<MarketGoodsType>(getBaseMapper());
        if (marketGoodsType.getId() != null) {
            chainWrapper.set(MarketGoodsType::getId, marketGoodsType.getId());
        }
        if (StringUtil.isNotBlank(marketGoodsType.getTenantId())) {
            chainWrapper.set(MarketGoodsType::getTenantId, marketGoodsType.getTenantId());
        }
        if (marketGoodsType.getCorpId() != null) {
            chainWrapper.set(MarketGoodsType::getCorpId, marketGoodsType.getCorpId());
        }
        if (marketGoodsType.getInstitutionId() != null) {
            chainWrapper.set(MarketGoodsType::getInstitutionId, marketGoodsType.getInstitutionId());
        }
        if (StringUtil.isNotBlank(marketGoodsType.getInstitutionName())) {
            chainWrapper.set(MarketGoodsType::getInstitutionName, marketGoodsType.getInstitutionName());
        }
        if (marketGoodsType.getParentId() != null) {
            chainWrapper.set(MarketGoodsType::getParentId, marketGoodsType.getParentId());
        }
        if (StringUtil.isNotBlank(marketGoodsType.getParentName())) {
            chainWrapper.set(MarketGoodsType::getParentName, marketGoodsType.getParentName());
        }
        if (StringUtil.isNotBlank(marketGoodsType.getCategoryType())) {
            chainWrapper.set(MarketGoodsType::getCategoryType, marketGoodsType.getCategoryType());
        }
        if (StringUtil.isNotBlank(marketGoodsType.getTypeName())) {
            chainWrapper.set(MarketGoodsType::getTypeName, marketGoodsType.getTypeName());
        }
        if (StringUtil.isNotBlank(marketGoodsType.getIcon())) {
            chainWrapper.set(MarketGoodsType::getIcon, marketGoodsType.getIcon());
        }
        if (StringUtil.isNotBlank(marketGoodsType.getPic())) {
            chainWrapper.set(MarketGoodsType::getPic, marketGoodsType.getPic());
        }
        if (marketGoodsType.getSort() != null) {
            chainWrapper.set(MarketGoodsType::getSort, marketGoodsType.getSort());
        }
        if (marketGoodsType.getGrade() != null) {
            chainWrapper.set(MarketGoodsType::getGrade, marketGoodsType.getGrade());
        }
        if (StringUtil.isNotBlank(marketGoodsType.getRemark())) {
            chainWrapper.set(MarketGoodsType::getRemark, marketGoodsType.getRemark());
        }
        if (marketGoodsType.getCreateUser() != null) {
            chainWrapper.set(MarketGoodsType::getCreateUser, marketGoodsType.getCreateUser());
        }
        if (marketGoodsType.getCreateDept() != null) {
            chainWrapper.set(MarketGoodsType::getCreateDept, marketGoodsType.getCreateDept());
        }
        if (marketGoodsType.getCreateTime() != null) {
            chainWrapper.set(MarketGoodsType::getCreateTime, marketGoodsType.getCreateTime());
        }
        if (marketGoodsType.getUpdateUser() != null) {
            chainWrapper.set(MarketGoodsType::getUpdateUser, marketGoodsType.getUpdateUser());
        }
        if (marketGoodsType.getUpdateTime() != null) {
            chainWrapper.set(MarketGoodsType::getUpdateTime, marketGoodsType.getUpdateTime());
        }
        if (marketGoodsType.getStatus() != null) {
            chainWrapper.set(MarketGoodsType::getStatus, marketGoodsType.getStatus());
        }
        if (marketGoodsType.getIsDeleted() != null) {
            chainWrapper.set(MarketGoodsType::getIsDeleted, marketGoodsType.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketGoodsType::getId, marketGoodsType.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketGoodsType.getId());
        } else {
            return marketGoodsType;
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
    public boolean saveMarketGoodsTypeBatch(List<MarketGoodsType> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketGoodsType marketGoodsType : insertList) {
            //使用默认的雪花算法生成
            marketGoodsType.setId(null);
            //marketGoodsType.setCreatedDt(currentDte);
            //marketGoodsType.setUpdatedDt(currentDte);
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
    public Integer deleteMarketGoodsTypeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketGoodsType> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


