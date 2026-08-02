package cn.pluss.platform.service.bladeNotice.impl;

import cn.pluss.platform.mapper.BladeNoticeMapper;
import cn.pluss.platform.model.entity.BladeNotice;
import cn.pluss.platform.service.bladeNotice.BladeNoticeService;
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
@Service("bladeNoticeService")
public class BladeNoticeServiceImpl extends ServiceImpl< BladeNoticeMapper, BladeNotice> implements BladeNoticeService {
    private static final Logger logger = LoggerFactory.getLogger(BladeNoticeServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<BladeNotice> queryPage(Map map) {
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
    public BladeNotice queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param bladeNotice 实例对象
    * @return 实例对象
    */
    @Override
    public BladeNotice queryOne(BladeNotice bladeNotice){
        LambdaQueryWrapper<BladeNotice> queryWrapper = getQueryWrapper(bladeNotice);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param bladeNotice
    * @return
    */
    @Override
    public List<BladeNotice> queryList(BladeNotice bladeNotice) {
        LambdaQueryWrapper<BladeNotice> queryWrapper = getQueryWrapper(bladeNotice);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param bladeNotice
    * @return
    */
    public static LambdaQueryWrapper<BladeNotice> getQueryWrapper(BladeNotice bladeNotice){
        LambdaQueryWrapper<BladeNotice> queryWrapper = new LambdaQueryWrapper<>();
        if (bladeNotice.getId() != null) {
            queryWrapper.eq(BladeNotice::getId, bladeNotice.getId());
        }
        if (StringUtil.isNotEmpty(bladeNotice.getTenantId())) {
            queryWrapper.eq(BladeNotice::getTenantId, bladeNotice.getTenantId());
        }
        if (StringUtil.isNotEmpty(bladeNotice.getTitle())) {
            queryWrapper.eq(BladeNotice::getTitle, bladeNotice.getTitle());
        }
        if (bladeNotice.getCategory() != null) {
            queryWrapper.eq(BladeNotice::getCategory, bladeNotice.getCategory());
        }
        if (bladeNotice.getReleaseTime() != null) {
            queryWrapper.eq(BladeNotice::getReleaseTime, bladeNotice.getReleaseTime());
        }
        if (StringUtil.isNotEmpty(bladeNotice.getContent())) {
            queryWrapper.eq(BladeNotice::getContent, bladeNotice.getContent());
        }
        if (bladeNotice.getCreateUser() != null) {
            queryWrapper.eq(BladeNotice::getCreateUser, bladeNotice.getCreateUser());
        }
        if (bladeNotice.getCreateDept() != null) {
            queryWrapper.eq(BladeNotice::getCreateDept, bladeNotice.getCreateDept());
        }
        if (bladeNotice.getCreateTime() != null) {
            queryWrapper.eq(BladeNotice::getCreateTime, bladeNotice.getCreateTime());
        }
        if (bladeNotice.getUpdateUser() != null) {
            queryWrapper.eq(BladeNotice::getUpdateUser, bladeNotice.getUpdateUser());
        }
        if (bladeNotice.getUpdateTime() != null) {
            queryWrapper.eq(BladeNotice::getUpdateTime, bladeNotice.getUpdateTime());
        }
        if (bladeNotice.getStatus() != null) {
            queryWrapper.eq(BladeNotice::getStatus, bladeNotice.getStatus());
        }
        if (bladeNotice.getIsDeleted() != null) {
            queryWrapper.eq(BladeNotice::getIsDeleted, bladeNotice.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param bladeNotice 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public BladeNotice insert(BladeNotice bladeNotice) {
        bladeNotice.setId(null);
        getBaseMapper().insert(bladeNotice);
        return bladeNotice;
    }

    /**
    * 更新数据
    *
    * @param bladeNotice 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public BladeNotice update(BladeNotice bladeNotice) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<BladeNotice> chainWrapper = new LambdaUpdateChainWrapper<BladeNotice>(getBaseMapper());
        if (bladeNotice.getId() != null) {
            chainWrapper.set(BladeNotice::getId, bladeNotice.getId());
        }
        if (StringUtil.isNotBlank(bladeNotice.getTenantId())) {
            chainWrapper.set(BladeNotice::getTenantId, bladeNotice.getTenantId());
        }
        if (StringUtil.isNotBlank(bladeNotice.getTitle())) {
            chainWrapper.set(BladeNotice::getTitle, bladeNotice.getTitle());
        }
        if (bladeNotice.getCategory() != null) {
            chainWrapper.set(BladeNotice::getCategory, bladeNotice.getCategory());
        }
        if (bladeNotice.getReleaseTime() != null) {
            chainWrapper.set(BladeNotice::getReleaseTime, bladeNotice.getReleaseTime());
        }
        if (StringUtil.isNotBlank(bladeNotice.getContent())) {
            chainWrapper.set(BladeNotice::getContent, bladeNotice.getContent());
        }
        if (bladeNotice.getCreateUser() != null) {
            chainWrapper.set(BladeNotice::getCreateUser, bladeNotice.getCreateUser());
        }
        if (bladeNotice.getCreateDept() != null) {
            chainWrapper.set(BladeNotice::getCreateDept, bladeNotice.getCreateDept());
        }
        if (bladeNotice.getCreateTime() != null) {
            chainWrapper.set(BladeNotice::getCreateTime, bladeNotice.getCreateTime());
        }
        if (bladeNotice.getUpdateUser() != null) {
            chainWrapper.set(BladeNotice::getUpdateUser, bladeNotice.getUpdateUser());
        }
        if (bladeNotice.getUpdateTime() != null) {
            chainWrapper.set(BladeNotice::getUpdateTime, bladeNotice.getUpdateTime());
        }
        if (bladeNotice.getStatus() != null) {
            chainWrapper.set(BladeNotice::getStatus, bladeNotice.getStatus());
        }
        if (bladeNotice.getIsDeleted() != null) {
            chainWrapper.set(BladeNotice::getIsDeleted, bladeNotice.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(BladeNotice::getId, bladeNotice.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(bladeNotice.getId());
        } else {
            return bladeNotice;
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
    public boolean saveBladeNoticeBatch(List<BladeNotice> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (BladeNotice bladeNotice : insertList) {
            //使用默认的雪花算法生成
            bladeNotice.setId(null);
            //bladeNotice.setCreatedDt(currentDte);
            //bladeNotice.setUpdatedDt(currentDte);
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
    public Integer deleteBladeNoticeBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<BladeNotice> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


