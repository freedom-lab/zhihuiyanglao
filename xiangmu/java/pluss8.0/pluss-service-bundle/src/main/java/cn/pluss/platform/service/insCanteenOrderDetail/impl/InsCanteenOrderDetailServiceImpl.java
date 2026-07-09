package cn.pluss.platform.service.insCanteenOrderDetail.impl;

import cn.pluss.platform.mapper.InsCanteenOrderDetailMapper;
import cn.pluss.platform.model.entity.InsCanteenOrderDetail;
import cn.pluss.platform.service.insCanteenOrderDetail.InsCanteenOrderDetailService;
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
@Service("insCanteenOrderDetailService")
public class InsCanteenOrderDetailServiceImpl extends ServiceImpl< InsCanteenOrderDetailMapper, InsCanteenOrderDetail> implements InsCanteenOrderDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenOrderDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenOrderDetail> queryPage(Map map) {
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
    public InsCanteenOrderDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenOrderDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenOrderDetail queryOne(InsCanteenOrderDetail insCanteenOrderDetail){
        LambdaQueryWrapper<InsCanteenOrderDetail> queryWrapper = getQueryWrapper(insCanteenOrderDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenOrderDetail
    * @return
    */
    @Override
    public List<InsCanteenOrderDetail> queryList(InsCanteenOrderDetail insCanteenOrderDetail) {
        LambdaQueryWrapper<InsCanteenOrderDetail> queryWrapper = getQueryWrapper(insCanteenOrderDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenOrderDetail
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenOrderDetail> getQueryWrapper(InsCanteenOrderDetail insCanteenOrderDetail){
        LambdaQueryWrapper<InsCanteenOrderDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenOrderDetail.getId() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getId, insCanteenOrderDetail.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderDetail.getTenantId())) {
            queryWrapper.eq(InsCanteenOrderDetail::getTenantId, insCanteenOrderDetail.getTenantId());
        }
        if (insCanteenOrderDetail.getCorpId() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getCorpId, insCanteenOrderDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderDetail.getCorpName())) {
            queryWrapper.eq(InsCanteenOrderDetail::getCorpName, insCanteenOrderDetail.getCorpName());
        }
        if (insCanteenOrderDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getInstitutionId, insCanteenOrderDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderDetail.getInstitutionName())) {
            queryWrapper.eq(InsCanteenOrderDetail::getInstitutionName, insCanteenOrderDetail.getInstitutionName());
        }
        if (insCanteenOrderDetail.getOrderId() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getOrderId, insCanteenOrderDetail.getOrderId());
        }
        if (insCanteenOrderDetail.getFoodId() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getFoodId, insCanteenOrderDetail.getFoodId());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderDetail.getFoodName())) {
            queryWrapper.eq(InsCanteenOrderDetail::getFoodName, insCanteenOrderDetail.getFoodName());
        }
        if (insCanteenOrderDetail.getNum() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getNum, insCanteenOrderDetail.getNum());
        }
        if (insCanteenOrderDetail.getPrice() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getPrice, insCanteenOrderDetail.getPrice());
        }
        if (insCanteenOrderDetail.getAmount() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getAmount, insCanteenOrderDetail.getAmount());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderDetail.getRemark())) {
            queryWrapper.eq(InsCanteenOrderDetail::getRemark, insCanteenOrderDetail.getRemark());
        }
        if (insCanteenOrderDetail.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getCreateUser, insCanteenOrderDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenOrderDetail.getCreateName())) {
            queryWrapper.eq(InsCanteenOrderDetail::getCreateName, insCanteenOrderDetail.getCreateName());
        }
        if (insCanteenOrderDetail.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getCreateDept, insCanteenOrderDetail.getCreateDept());
        }
        if (insCanteenOrderDetail.getCreateTime() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getCreateTime, insCanteenOrderDetail.getCreateTime());
        }
        if (insCanteenOrderDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getUpdateUser, insCanteenOrderDetail.getUpdateUser());
        }
        if (insCanteenOrderDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getUpdateTime, insCanteenOrderDetail.getUpdateTime());
        }
        if (insCanteenOrderDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getIsDeleted, insCanteenOrderDetail.getIsDeleted());
        }
        if (insCanteenOrderDetail.getStatus() != null) {
            queryWrapper.eq(InsCanteenOrderDetail::getStatus, insCanteenOrderDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenOrderDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenOrderDetail insert(InsCanteenOrderDetail insCanteenOrderDetail) {
        insCanteenOrderDetail.setId(null);
        getBaseMapper().insert(insCanteenOrderDetail);
        return insCanteenOrderDetail;
    }

    /**
    * 更新数据
    *
    * @param insCanteenOrderDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenOrderDetail update(InsCanteenOrderDetail insCanteenOrderDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenOrderDetail> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenOrderDetail>(getBaseMapper());
        if (insCanteenOrderDetail.getId() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getId, insCanteenOrderDetail.getId());
        }
        if (StringUtil.isNotBlank(insCanteenOrderDetail.getTenantId())) {
            chainWrapper.set(InsCanteenOrderDetail::getTenantId, insCanteenOrderDetail.getTenantId());
        }
        if (insCanteenOrderDetail.getCorpId() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getCorpId, insCanteenOrderDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insCanteenOrderDetail.getCorpName())) {
            chainWrapper.set(InsCanteenOrderDetail::getCorpName, insCanteenOrderDetail.getCorpName());
        }
        if (insCanteenOrderDetail.getInstitutionId() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getInstitutionId, insCanteenOrderDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insCanteenOrderDetail.getInstitutionName())) {
            chainWrapper.set(InsCanteenOrderDetail::getInstitutionName, insCanteenOrderDetail.getInstitutionName());
        }
        if (insCanteenOrderDetail.getOrderId() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getOrderId, insCanteenOrderDetail.getOrderId());
        }
        if (insCanteenOrderDetail.getFoodId() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getFoodId, insCanteenOrderDetail.getFoodId());
        }
        if (StringUtil.isNotBlank(insCanteenOrderDetail.getFoodName())) {
            chainWrapper.set(InsCanteenOrderDetail::getFoodName, insCanteenOrderDetail.getFoodName());
        }
        if (insCanteenOrderDetail.getNum() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getNum, insCanteenOrderDetail.getNum());
        }
        if (insCanteenOrderDetail.getPrice() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getPrice, insCanteenOrderDetail.getPrice());
        }
        if (insCanteenOrderDetail.getAmount() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getAmount, insCanteenOrderDetail.getAmount());
        }
        if (StringUtil.isNotBlank(insCanteenOrderDetail.getRemark())) {
            chainWrapper.set(InsCanteenOrderDetail::getRemark, insCanteenOrderDetail.getRemark());
        }
        if (insCanteenOrderDetail.getCreateUser() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getCreateUser, insCanteenOrderDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenOrderDetail.getCreateName())) {
            chainWrapper.set(InsCanteenOrderDetail::getCreateName, insCanteenOrderDetail.getCreateName());
        }
        if (insCanteenOrderDetail.getCreateDept() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getCreateDept, insCanteenOrderDetail.getCreateDept());
        }
        if (insCanteenOrderDetail.getCreateTime() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getCreateTime, insCanteenOrderDetail.getCreateTime());
        }
        if (insCanteenOrderDetail.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getUpdateUser, insCanteenOrderDetail.getUpdateUser());
        }
        if (insCanteenOrderDetail.getUpdateTime() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getUpdateTime, insCanteenOrderDetail.getUpdateTime());
        }
        if (insCanteenOrderDetail.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getIsDeleted, insCanteenOrderDetail.getIsDeleted());
        }
        if (insCanteenOrderDetail.getStatus() != null) {
            chainWrapper.set(InsCanteenOrderDetail::getStatus, insCanteenOrderDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenOrderDetail::getId, insCanteenOrderDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenOrderDetail.getId());
        } else {
            return insCanteenOrderDetail;
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
    public boolean saveInsCanteenOrderDetailBatch(List<InsCanteenOrderDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenOrderDetail insCanteenOrderDetail : insertList) {
            //使用默认的雪花算法生成
            insCanteenOrderDetail.setId(null);
            //insCanteenOrderDetail.setCreatedDt(currentDte);
            //insCanteenOrderDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenOrderDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenOrderDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


