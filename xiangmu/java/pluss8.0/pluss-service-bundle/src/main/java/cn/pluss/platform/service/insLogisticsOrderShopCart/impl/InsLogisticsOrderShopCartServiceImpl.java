package cn.pluss.platform.service.insLogisticsOrderShopCart.impl;

import cn.pluss.platform.mapper.InsLogisticsOrderShopCartMapper;
import cn.pluss.platform.model.entity.InsLogisticsOrderShopCart;
import cn.pluss.platform.service.insLogisticsOrderShopCart.InsLogisticsOrderShopCartService;
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
@Service("insLogisticsOrderShopCartService")
public class InsLogisticsOrderShopCartServiceImpl extends ServiceImpl< InsLogisticsOrderShopCartMapper, InsLogisticsOrderShopCart> implements InsLogisticsOrderShopCartService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsOrderShopCartServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsOrderShopCart> queryPage(Map map) {
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
    public InsLogisticsOrderShopCart queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsOrderShopCart 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsOrderShopCart queryOne(InsLogisticsOrderShopCart insLogisticsOrderShopCart){
        LambdaQueryWrapper<InsLogisticsOrderShopCart> queryWrapper = getQueryWrapper(insLogisticsOrderShopCart);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsOrderShopCart
    * @return
    */
    @Override
    public List<InsLogisticsOrderShopCart> queryList(InsLogisticsOrderShopCart insLogisticsOrderShopCart) {
        LambdaQueryWrapper<InsLogisticsOrderShopCart> queryWrapper = getQueryWrapper(insLogisticsOrderShopCart);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsOrderShopCart
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsOrderShopCart> getQueryWrapper(InsLogisticsOrderShopCart insLogisticsOrderShopCart){
        LambdaQueryWrapper<InsLogisticsOrderShopCart> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsOrderShopCart.getId() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getId, insLogisticsOrderShopCart.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderShopCart.getTenantId())) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getTenantId, insLogisticsOrderShopCart.getTenantId());
        }
        if (insLogisticsOrderShopCart.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getCorpId, insLogisticsOrderShopCart.getCorpId());
        }
        if (insLogisticsOrderShopCart.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getInstitutionId, insLogisticsOrderShopCart.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderShopCart.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getInstitutionName, insLogisticsOrderShopCart.getInstitutionName());
        }
        if (insLogisticsOrderShopCart.getUserId() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getUserId, insLogisticsOrderShopCart.getUserId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderShopCart.getUserName())) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getUserName, insLogisticsOrderShopCart.getUserName());
        }
        if (insLogisticsOrderShopCart.getCheckId() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getCheckId, insLogisticsOrderShopCart.getCheckId());
        }
        if (insLogisticsOrderShopCart.getElderId() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getElderId, insLogisticsOrderShopCart.getElderId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderShopCart.getElderName())) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getElderName, insLogisticsOrderShopCart.getElderName());
        }
        if (insLogisticsOrderShopCart.getGoodId() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getGoodId, insLogisticsOrderShopCart.getGoodId());
        }
        if (insLogisticsOrderShopCart.getNum() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getNum, insLogisticsOrderShopCart.getNum());
        }
        if (insLogisticsOrderShopCart.getIsChecked() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getIsChecked, insLogisticsOrderShopCart.getIsChecked());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderShopCart.getRemark())) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getRemark, insLogisticsOrderShopCart.getRemark());
        }
        if (insLogisticsOrderShopCart.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getCreateUser, insLogisticsOrderShopCart.getCreateUser());
        }
        if (insLogisticsOrderShopCart.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getCreateDept, insLogisticsOrderShopCart.getCreateDept());
        }
        if (insLogisticsOrderShopCart.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getCreateTime, insLogisticsOrderShopCart.getCreateTime());
        }
        if (insLogisticsOrderShopCart.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getUpdateUser, insLogisticsOrderShopCart.getUpdateUser());
        }
        if (insLogisticsOrderShopCart.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getUpdateTime, insLogisticsOrderShopCart.getUpdateTime());
        }
        if (insLogisticsOrderShopCart.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getIsDeleted, insLogisticsOrderShopCart.getIsDeleted());
        }
        if (insLogisticsOrderShopCart.getStatus() != null) {
            queryWrapper.eq(InsLogisticsOrderShopCart::getStatus, insLogisticsOrderShopCart.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsOrderShopCart 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOrderShopCart insert(InsLogisticsOrderShopCart insLogisticsOrderShopCart) {
        insLogisticsOrderShopCart.setId(null);
        getBaseMapper().insert(insLogisticsOrderShopCart);
        return insLogisticsOrderShopCart;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsOrderShopCart 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOrderShopCart update(InsLogisticsOrderShopCart insLogisticsOrderShopCart) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsOrderShopCart> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsOrderShopCart>(getBaseMapper());
        if (insLogisticsOrderShopCart.getId() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getId, insLogisticsOrderShopCart.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderShopCart.getTenantId())) {
            chainWrapper.set(InsLogisticsOrderShopCart::getTenantId, insLogisticsOrderShopCart.getTenantId());
        }
        if (insLogisticsOrderShopCart.getCorpId() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getCorpId, insLogisticsOrderShopCart.getCorpId());
        }
        if (insLogisticsOrderShopCart.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getInstitutionId, insLogisticsOrderShopCart.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderShopCart.getInstitutionName())) {
            chainWrapper.set(InsLogisticsOrderShopCart::getInstitutionName, insLogisticsOrderShopCart.getInstitutionName());
        }
        if (insLogisticsOrderShopCart.getUserId() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getUserId, insLogisticsOrderShopCart.getUserId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderShopCart.getUserName())) {
            chainWrapper.set(InsLogisticsOrderShopCart::getUserName, insLogisticsOrderShopCart.getUserName());
        }
        if (insLogisticsOrderShopCart.getCheckId() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getCheckId, insLogisticsOrderShopCart.getCheckId());
        }
        if (insLogisticsOrderShopCart.getElderId() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getElderId, insLogisticsOrderShopCart.getElderId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderShopCart.getElderName())) {
            chainWrapper.set(InsLogisticsOrderShopCart::getElderName, insLogisticsOrderShopCart.getElderName());
        }
        if (insLogisticsOrderShopCart.getGoodId() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getGoodId, insLogisticsOrderShopCart.getGoodId());
        }
        if (insLogisticsOrderShopCart.getNum() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getNum, insLogisticsOrderShopCart.getNum());
        }
        if (insLogisticsOrderShopCart.getIsChecked() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getIsChecked, insLogisticsOrderShopCart.getIsChecked());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderShopCart.getRemark())) {
            chainWrapper.set(InsLogisticsOrderShopCart::getRemark, insLogisticsOrderShopCart.getRemark());
        }
        if (insLogisticsOrderShopCart.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getCreateUser, insLogisticsOrderShopCart.getCreateUser());
        }
        if (insLogisticsOrderShopCart.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getCreateDept, insLogisticsOrderShopCart.getCreateDept());
        }
        if (insLogisticsOrderShopCart.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getCreateTime, insLogisticsOrderShopCart.getCreateTime());
        }
        if (insLogisticsOrderShopCart.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getUpdateUser, insLogisticsOrderShopCart.getUpdateUser());
        }
        if (insLogisticsOrderShopCart.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getUpdateTime, insLogisticsOrderShopCart.getUpdateTime());
        }
        if (insLogisticsOrderShopCart.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getIsDeleted, insLogisticsOrderShopCart.getIsDeleted());
        }
        if (insLogisticsOrderShopCart.getStatus() != null) {
            chainWrapper.set(InsLogisticsOrderShopCart::getStatus, insLogisticsOrderShopCart.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsOrderShopCart::getId, insLogisticsOrderShopCart.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsOrderShopCart.getId());
        } else {
            return insLogisticsOrderShopCart;
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
    public boolean saveInsLogisticsOrderShopCartBatch(List<InsLogisticsOrderShopCart> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsOrderShopCart insLogisticsOrderShopCart : insertList) {
            //使用默认的雪花算法生成
            insLogisticsOrderShopCart.setId(null);
            //insLogisticsOrderShopCart.setCreatedDt(currentDte);
            //insLogisticsOrderShopCart.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsOrderShopCartBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsOrderShopCart> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


