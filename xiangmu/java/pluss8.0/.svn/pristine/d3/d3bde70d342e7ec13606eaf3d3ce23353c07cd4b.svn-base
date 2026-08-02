package cn.pluss.platform.service.bladeDict.impl;

import cn.pluss.platform.mapper.BladeDictMapper;
import cn.pluss.platform.model.entity.BladeDict;
import cn.pluss.platform.service.bladeDict.BladeDictService;
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
@Service("bladeDictService")
public class BladeDictServiceImpl extends ServiceImpl< BladeDictMapper, BladeDict> implements BladeDictService {
    private static final Logger logger = LoggerFactory.getLogger(BladeDictServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<BladeDict> queryPage(Map map) {
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
    public BladeDict queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param bladeDict 实例对象
    * @return 实例对象
    */
    @Override
    public BladeDict queryOne(BladeDict bladeDict){
        LambdaQueryWrapper<BladeDict> queryWrapper = getQueryWrapper(bladeDict);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param bladeDict
    * @return
    */
    @Override
    public List<BladeDict> queryList(BladeDict bladeDict) {
        LambdaQueryWrapper<BladeDict> queryWrapper = getQueryWrapper(bladeDict);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param bladeDict
    * @return
    */
    public static LambdaQueryWrapper<BladeDict> getQueryWrapper(BladeDict bladeDict){
        LambdaQueryWrapper<BladeDict> queryWrapper = new LambdaQueryWrapper<>();
        if (bladeDict.getId() != null) {
            queryWrapper.eq(BladeDict::getId, bladeDict.getId());
        }
        if (bladeDict.getParentId() != null) {
            queryWrapper.eq(BladeDict::getParentId, bladeDict.getParentId());
        }
        if (StringUtil.isNotEmpty(bladeDict.getCode())) {
            queryWrapper.eq(BladeDict::getCode, bladeDict.getCode());
        }
        if (StringUtil.isNotEmpty(bladeDict.getDictKey())) {
            queryWrapper.eq(BladeDict::getDictKey, bladeDict.getDictKey());
        }
        if (StringUtil.isNotEmpty(bladeDict.getDictValue())) {
            queryWrapper.eq(BladeDict::getDictValue, bladeDict.getDictValue());
        }
        if (bladeDict.getSort() != null) {
            queryWrapper.eq(BladeDict::getSort, bladeDict.getSort());
        }
        if (StringUtil.isNotEmpty(bladeDict.getRemark())) {
            queryWrapper.eq(BladeDict::getRemark, bladeDict.getRemark());
        }
        if (bladeDict.getIsSealed() != null) {
            queryWrapper.eq(BladeDict::getIsSealed, bladeDict.getIsSealed());
        }
        if (bladeDict.getIsDeleted() != null) {
            queryWrapper.eq(BladeDict::getIsDeleted, bladeDict.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param bladeDict 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public BladeDict insert(BladeDict bladeDict) {
        bladeDict.setId(null);
        getBaseMapper().insert(bladeDict);
        return bladeDict;
    }

    /**
    * 更新数据
    *
    * @param bladeDict 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public BladeDict update(BladeDict bladeDict) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<BladeDict> chainWrapper = new LambdaUpdateChainWrapper<BladeDict>(getBaseMapper());
        if (bladeDict.getId() != null) {
            chainWrapper.set(BladeDict::getId, bladeDict.getId());
        }
        if (bladeDict.getParentId() != null) {
            chainWrapper.set(BladeDict::getParentId, bladeDict.getParentId());
        }
        if (StringUtil.isNotBlank(bladeDict.getCode())) {
            chainWrapper.set(BladeDict::getCode, bladeDict.getCode());
        }
        if (StringUtil.isNotBlank(bladeDict.getDictKey())) {
            chainWrapper.set(BladeDict::getDictKey, bladeDict.getDictKey());
        }
        if (StringUtil.isNotBlank(bladeDict.getDictValue())) {
            chainWrapper.set(BladeDict::getDictValue, bladeDict.getDictValue());
        }
        if (bladeDict.getSort() != null) {
            chainWrapper.set(BladeDict::getSort, bladeDict.getSort());
        }
        if (StringUtil.isNotBlank(bladeDict.getRemark())) {
            chainWrapper.set(BladeDict::getRemark, bladeDict.getRemark());
        }
        if (bladeDict.getIsSealed() != null) {
            chainWrapper.set(BladeDict::getIsSealed, bladeDict.getIsSealed());
        }
        if (bladeDict.getIsDeleted() != null) {
            chainWrapper.set(BladeDict::getIsDeleted, bladeDict.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(BladeDict::getId, bladeDict.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(bladeDict.getId());
        } else {
            return bladeDict;
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
    public boolean saveBladeDictBatch(List<BladeDict> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (BladeDict bladeDict : insertList) {
            //使用默认的雪花算法生成
            bladeDict.setId(null);
            //bladeDict.setCreatedDt(currentDte);
            //bladeDict.setUpdatedDt(currentDte);
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
    public Integer deleteBladeDictBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<BladeDict> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


