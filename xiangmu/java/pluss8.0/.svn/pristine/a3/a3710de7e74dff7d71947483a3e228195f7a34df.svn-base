package cn.pluss.platform.service.insCanteenFoodTabooRel.impl;

import cn.pluss.platform.mapper.InsCanteenFoodTabooRelMapper;
import cn.pluss.platform.model.entity.InsCanteenFoodTabooRel;
import cn.pluss.platform.service.insCanteenFoodTabooRel.InsCanteenFoodTabooRelService;
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
@Service("insCanteenFoodTabooRelService")
public class InsCanteenFoodTabooRelServiceImpl extends ServiceImpl< InsCanteenFoodTabooRelMapper, InsCanteenFoodTabooRel> implements InsCanteenFoodTabooRelService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenFoodTabooRelServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenFoodTabooRel> queryPage(Map map) {
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
    public InsCanteenFoodTabooRel queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodTabooRel 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenFoodTabooRel queryOne(InsCanteenFoodTabooRel insCanteenFoodTabooRel){
        LambdaQueryWrapper<InsCanteenFoodTabooRel> queryWrapper = getQueryWrapper(insCanteenFoodTabooRel);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenFoodTabooRel
    * @return
    */
    @Override
    public List<InsCanteenFoodTabooRel> queryList(InsCanteenFoodTabooRel insCanteenFoodTabooRel) {
        LambdaQueryWrapper<InsCanteenFoodTabooRel> queryWrapper = getQueryWrapper(insCanteenFoodTabooRel);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenFoodTabooRel
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenFoodTabooRel> getQueryWrapper(InsCanteenFoodTabooRel insCanteenFoodTabooRel){
        LambdaQueryWrapper<InsCanteenFoodTabooRel> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenFoodTabooRel.getId() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getId, insCanteenFoodTabooRel.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodTabooRel.getTenantId())) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getTenantId, insCanteenFoodTabooRel.getTenantId());
        }
        if (insCanteenFoodTabooRel.getFoodId() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getFoodId, insCanteenFoodTabooRel.getFoodId());
        }
        if (insCanteenFoodTabooRel.getTabooId() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getTabooId, insCanteenFoodTabooRel.getTabooId());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodTabooRel.getRemark())) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getRemark, insCanteenFoodTabooRel.getRemark());
        }
        if (insCanteenFoodTabooRel.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getCreateUser, insCanteenFoodTabooRel.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenFoodTabooRel.getCreateName())) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getCreateName, insCanteenFoodTabooRel.getCreateName());
        }
        if (insCanteenFoodTabooRel.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getCreateDept, insCanteenFoodTabooRel.getCreateDept());
        }
        if (insCanteenFoodTabooRel.getCreateTime() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getCreateTime, insCanteenFoodTabooRel.getCreateTime());
        }
        if (insCanteenFoodTabooRel.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getUpdateUser, insCanteenFoodTabooRel.getUpdateUser());
        }
        if (insCanteenFoodTabooRel.getUpdateTime() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getUpdateTime, insCanteenFoodTabooRel.getUpdateTime());
        }
        if (insCanteenFoodTabooRel.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getIsDeleted, insCanteenFoodTabooRel.getIsDeleted());
        }
        if (insCanteenFoodTabooRel.getStatus() != null) {
            queryWrapper.eq(InsCanteenFoodTabooRel::getStatus, insCanteenFoodTabooRel.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenFoodTabooRel 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodTabooRel insert(InsCanteenFoodTabooRel insCanteenFoodTabooRel) {
        insCanteenFoodTabooRel.setId(null);
        getBaseMapper().insert(insCanteenFoodTabooRel);
        return insCanteenFoodTabooRel;
    }

    /**
    * 更新数据
    *
    * @param insCanteenFoodTabooRel 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenFoodTabooRel update(InsCanteenFoodTabooRel insCanteenFoodTabooRel) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenFoodTabooRel> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenFoodTabooRel>(getBaseMapper());
        if (insCanteenFoodTabooRel.getId() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getId, insCanteenFoodTabooRel.getId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodTabooRel.getTenantId())) {
            chainWrapper.set(InsCanteenFoodTabooRel::getTenantId, insCanteenFoodTabooRel.getTenantId());
        }
        if (insCanteenFoodTabooRel.getFoodId() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getFoodId, insCanteenFoodTabooRel.getFoodId());
        }
        if (insCanteenFoodTabooRel.getTabooId() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getTabooId, insCanteenFoodTabooRel.getTabooId());
        }
        if (StringUtil.isNotBlank(insCanteenFoodTabooRel.getRemark())) {
            chainWrapper.set(InsCanteenFoodTabooRel::getRemark, insCanteenFoodTabooRel.getRemark());
        }
        if (insCanteenFoodTabooRel.getCreateUser() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getCreateUser, insCanteenFoodTabooRel.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenFoodTabooRel.getCreateName())) {
            chainWrapper.set(InsCanteenFoodTabooRel::getCreateName, insCanteenFoodTabooRel.getCreateName());
        }
        if (insCanteenFoodTabooRel.getCreateDept() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getCreateDept, insCanteenFoodTabooRel.getCreateDept());
        }
        if (insCanteenFoodTabooRel.getCreateTime() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getCreateTime, insCanteenFoodTabooRel.getCreateTime());
        }
        if (insCanteenFoodTabooRel.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getUpdateUser, insCanteenFoodTabooRel.getUpdateUser());
        }
        if (insCanteenFoodTabooRel.getUpdateTime() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getUpdateTime, insCanteenFoodTabooRel.getUpdateTime());
        }
        if (insCanteenFoodTabooRel.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getIsDeleted, insCanteenFoodTabooRel.getIsDeleted());
        }
        if (insCanteenFoodTabooRel.getStatus() != null) {
            chainWrapper.set(InsCanteenFoodTabooRel::getStatus, insCanteenFoodTabooRel.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenFoodTabooRel::getId, insCanteenFoodTabooRel.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenFoodTabooRel.getId());
        } else {
            return insCanteenFoodTabooRel;
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
    public boolean saveInsCanteenFoodTabooRelBatch(List<InsCanteenFoodTabooRel> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenFoodTabooRel insCanteenFoodTabooRel : insertList) {
            //使用默认的雪花算法生成
            insCanteenFoodTabooRel.setId(null);
            //insCanteenFoodTabooRel.setCreatedDt(currentDte);
            //insCanteenFoodTabooRel.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenFoodTabooRelBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenFoodTabooRel> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


