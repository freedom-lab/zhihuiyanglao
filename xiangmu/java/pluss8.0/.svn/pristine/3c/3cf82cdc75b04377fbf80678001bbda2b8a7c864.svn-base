package cn.pluss.platform.service.bladeSms.impl;

import cn.pluss.platform.mapper.BladeSmsMapper;
import cn.pluss.platform.model.entity.BladeSms;
import cn.pluss.platform.service.bladeSms.BladeSmsService;
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
@Service("bladeSmsService")
public class BladeSmsServiceImpl extends ServiceImpl< BladeSmsMapper, BladeSms> implements BladeSmsService {
    private static final Logger logger = LoggerFactory.getLogger(BladeSmsServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<BladeSms> queryPage(Map map) {
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
    public BladeSms queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param bladeSms 实例对象
    * @return 实例对象
    */
    @Override
    public BladeSms queryOne(BladeSms bladeSms){
        LambdaQueryWrapper<BladeSms> queryWrapper = getQueryWrapper(bladeSms);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param bladeSms
    * @return
    */
    @Override
    public List<BladeSms> queryList(BladeSms bladeSms) {
        LambdaQueryWrapper<BladeSms> queryWrapper = getQueryWrapper(bladeSms);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param bladeSms
    * @return
    */
    public static LambdaQueryWrapper<BladeSms> getQueryWrapper(BladeSms bladeSms){
        LambdaQueryWrapper<BladeSms> queryWrapper = new LambdaQueryWrapper<>();
        if (bladeSms.getId() != null) {
            queryWrapper.eq(BladeSms::getId, bladeSms.getId());
        }
        if (StringUtil.isNotEmpty(bladeSms.getTenantId())) {
            queryWrapper.eq(BladeSms::getTenantId, bladeSms.getTenantId());
        }
        if (bladeSms.getCategory() != null) {
            queryWrapper.eq(BladeSms::getCategory, bladeSms.getCategory());
        }
        if (StringUtil.isNotEmpty(bladeSms.getSmsCode())) {
            queryWrapper.eq(BladeSms::getSmsCode, bladeSms.getSmsCode());
        }
        if (StringUtil.isNotEmpty(bladeSms.getTemplateId())) {
            queryWrapper.eq(BladeSms::getTemplateId, bladeSms.getTemplateId());
        }
        if (StringUtil.isNotEmpty(bladeSms.getAccessKey())) {
            queryWrapper.eq(BladeSms::getAccessKey, bladeSms.getAccessKey());
        }
        if (StringUtil.isNotEmpty(bladeSms.getSecretKey())) {
            queryWrapper.eq(BladeSms::getSecretKey, bladeSms.getSecretKey());
        }
        if (StringUtil.isNotEmpty(bladeSms.getRegionId())) {
            queryWrapper.eq(BladeSms::getRegionId, bladeSms.getRegionId());
        }
        if (StringUtil.isNotEmpty(bladeSms.getSignName())) {
            queryWrapper.eq(BladeSms::getSignName, bladeSms.getSignName());
        }
        if (StringUtil.isNotEmpty(bladeSms.getRemark())) {
            queryWrapper.eq(BladeSms::getRemark, bladeSms.getRemark());
        }
        if (bladeSms.getCreateUser() != null) {
            queryWrapper.eq(BladeSms::getCreateUser, bladeSms.getCreateUser());
        }
        if (bladeSms.getCreateDept() != null) {
            queryWrapper.eq(BladeSms::getCreateDept, bladeSms.getCreateDept());
        }
        if (bladeSms.getCreateTime() != null) {
            queryWrapper.eq(BladeSms::getCreateTime, bladeSms.getCreateTime());
        }
        if (bladeSms.getUpdateUser() != null) {
            queryWrapper.eq(BladeSms::getUpdateUser, bladeSms.getUpdateUser());
        }
        if (bladeSms.getUpdateTime() != null) {
            queryWrapper.eq(BladeSms::getUpdateTime, bladeSms.getUpdateTime());
        }
        if (bladeSms.getStatus() != null) {
            queryWrapper.eq(BladeSms::getStatus, bladeSms.getStatus());
        }
        if (bladeSms.getIsDeleted() != null) {
            queryWrapper.eq(BladeSms::getIsDeleted, bladeSms.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param bladeSms 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public BladeSms insert(BladeSms bladeSms) {
        bladeSms.setId(null);
        getBaseMapper().insert(bladeSms);
        return bladeSms;
    }

    /**
    * 更新数据
    *
    * @param bladeSms 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public BladeSms update(BladeSms bladeSms) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<BladeSms> chainWrapper = new LambdaUpdateChainWrapper<BladeSms>(getBaseMapper());
        if (bladeSms.getId() != null) {
            chainWrapper.set(BladeSms::getId, bladeSms.getId());
        }
        if (StringUtil.isNotBlank(bladeSms.getTenantId())) {
            chainWrapper.set(BladeSms::getTenantId, bladeSms.getTenantId());
        }
        if (bladeSms.getCategory() != null) {
            chainWrapper.set(BladeSms::getCategory, bladeSms.getCategory());
        }
        if (StringUtil.isNotBlank(bladeSms.getSmsCode())) {
            chainWrapper.set(BladeSms::getSmsCode, bladeSms.getSmsCode());
        }
        if (StringUtil.isNotBlank(bladeSms.getTemplateId())) {
            chainWrapper.set(BladeSms::getTemplateId, bladeSms.getTemplateId());
        }
        if (StringUtil.isNotBlank(bladeSms.getAccessKey())) {
            chainWrapper.set(BladeSms::getAccessKey, bladeSms.getAccessKey());
        }
        if (StringUtil.isNotBlank(bladeSms.getSecretKey())) {
            chainWrapper.set(BladeSms::getSecretKey, bladeSms.getSecretKey());
        }
        if (StringUtil.isNotBlank(bladeSms.getRegionId())) {
            chainWrapper.set(BladeSms::getRegionId, bladeSms.getRegionId());
        }
        if (StringUtil.isNotBlank(bladeSms.getSignName())) {
            chainWrapper.set(BladeSms::getSignName, bladeSms.getSignName());
        }
        if (StringUtil.isNotBlank(bladeSms.getRemark())) {
            chainWrapper.set(BladeSms::getRemark, bladeSms.getRemark());
        }
        if (bladeSms.getCreateUser() != null) {
            chainWrapper.set(BladeSms::getCreateUser, bladeSms.getCreateUser());
        }
        if (bladeSms.getCreateDept() != null) {
            chainWrapper.set(BladeSms::getCreateDept, bladeSms.getCreateDept());
        }
        if (bladeSms.getCreateTime() != null) {
            chainWrapper.set(BladeSms::getCreateTime, bladeSms.getCreateTime());
        }
        if (bladeSms.getUpdateUser() != null) {
            chainWrapper.set(BladeSms::getUpdateUser, bladeSms.getUpdateUser());
        }
        if (bladeSms.getUpdateTime() != null) {
            chainWrapper.set(BladeSms::getUpdateTime, bladeSms.getUpdateTime());
        }
        if (bladeSms.getStatus() != null) {
            chainWrapper.set(BladeSms::getStatus, bladeSms.getStatus());
        }
        if (bladeSms.getIsDeleted() != null) {
            chainWrapper.set(BladeSms::getIsDeleted, bladeSms.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(BladeSms::getId, bladeSms.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(bladeSms.getId());
        } else {
            return bladeSms;
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
    public boolean saveBladeSmsBatch(List<BladeSms> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (BladeSms bladeSms : insertList) {
            //使用默认的雪花算法生成
            bladeSms.setId(null);
            //bladeSms.setCreatedDt(currentDte);
            //bladeSms.setUpdatedDt(currentDte);
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
    public Integer deleteBladeSmsBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<BladeSms> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


