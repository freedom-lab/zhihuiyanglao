package cn.pluss.platform.service.insLogisticsOrderDetail.impl;

import cn.pluss.platform.mapper.InsLogisticsOrderDetailMapper;
import cn.pluss.platform.model.entity.InsLogisticsOrderDetail;
import cn.pluss.platform.service.insLogisticsOrderDetail.InsLogisticsOrderDetailService;
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
@Service("insLogisticsOrderDetailService")
public class InsLogisticsOrderDetailServiceImpl extends ServiceImpl< InsLogisticsOrderDetailMapper, InsLogisticsOrderDetail> implements InsLogisticsOrderDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsOrderDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsOrderDetail> queryPage(Map map) {
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
    public InsLogisticsOrderDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsOrderDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsOrderDetail queryOne(InsLogisticsOrderDetail insLogisticsOrderDetail){
        LambdaQueryWrapper<InsLogisticsOrderDetail> queryWrapper = getQueryWrapper(insLogisticsOrderDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsOrderDetail
    * @return
    */
    @Override
    public List<InsLogisticsOrderDetail> queryList(InsLogisticsOrderDetail insLogisticsOrderDetail) {
        LambdaQueryWrapper<InsLogisticsOrderDetail> queryWrapper = getQueryWrapper(insLogisticsOrderDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsOrderDetail
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsOrderDetail> getQueryWrapper(InsLogisticsOrderDetail insLogisticsOrderDetail){
        LambdaQueryWrapper<InsLogisticsOrderDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsOrderDetail.getId() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getId, insLogisticsOrderDetail.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderDetail.getTenantId())) {
            queryWrapper.eq(InsLogisticsOrderDetail::getTenantId, insLogisticsOrderDetail.getTenantId());
        }
        if (insLogisticsOrderDetail.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getCorpId, insLogisticsOrderDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderDetail.getCorpName())) {
            queryWrapper.eq(InsLogisticsOrderDetail::getCorpName, insLogisticsOrderDetail.getCorpName());
        }
        if (insLogisticsOrderDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getInstitutionId, insLogisticsOrderDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderDetail.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsOrderDetail::getInstitutionName, insLogisticsOrderDetail.getInstitutionName());
        }
        if (insLogisticsOrderDetail.getOrderId() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getOrderId, insLogisticsOrderDetail.getOrderId());
        }
        if (insLogisticsOrderDetail.getGoodsId() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getGoodsId, insLogisticsOrderDetail.getGoodsId());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderDetail.getGoodsName())) {
            queryWrapper.eq(InsLogisticsOrderDetail::getGoodsName, insLogisticsOrderDetail.getGoodsName());
        }
        if (insLogisticsOrderDetail.getNum() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getNum, insLogisticsOrderDetail.getNum());
        }
        if (insLogisticsOrderDetail.getPrice() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getPrice, insLogisticsOrderDetail.getPrice());
        }
        if (insLogisticsOrderDetail.getAmount() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getAmount, insLogisticsOrderDetail.getAmount());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderDetail.getRemark())) {
            queryWrapper.eq(InsLogisticsOrderDetail::getRemark, insLogisticsOrderDetail.getRemark());
        }
        if (insLogisticsOrderDetail.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getCreateUser, insLogisticsOrderDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsOrderDetail.getCreateName())) {
            queryWrapper.eq(InsLogisticsOrderDetail::getCreateName, insLogisticsOrderDetail.getCreateName());
        }
        if (insLogisticsOrderDetail.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getCreateDept, insLogisticsOrderDetail.getCreateDept());
        }
        if (insLogisticsOrderDetail.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getCreateTime, insLogisticsOrderDetail.getCreateTime());
        }
        if (insLogisticsOrderDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getUpdateUser, insLogisticsOrderDetail.getUpdateUser());
        }
        if (insLogisticsOrderDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getUpdateTime, insLogisticsOrderDetail.getUpdateTime());
        }
        if (insLogisticsOrderDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getIsDeleted, insLogisticsOrderDetail.getIsDeleted());
        }
        if (insLogisticsOrderDetail.getStatus() != null) {
            queryWrapper.eq(InsLogisticsOrderDetail::getStatus, insLogisticsOrderDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsOrderDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOrderDetail insert(InsLogisticsOrderDetail insLogisticsOrderDetail) {
        insLogisticsOrderDetail.setId(null);
        getBaseMapper().insert(insLogisticsOrderDetail);
        return insLogisticsOrderDetail;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsOrderDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsOrderDetail update(InsLogisticsOrderDetail insLogisticsOrderDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsOrderDetail> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsOrderDetail>(getBaseMapper());
        if (insLogisticsOrderDetail.getId() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getId, insLogisticsOrderDetail.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderDetail.getTenantId())) {
            chainWrapper.set(InsLogisticsOrderDetail::getTenantId, insLogisticsOrderDetail.getTenantId());
        }
        if (insLogisticsOrderDetail.getCorpId() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getCorpId, insLogisticsOrderDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderDetail.getCorpName())) {
            chainWrapper.set(InsLogisticsOrderDetail::getCorpName, insLogisticsOrderDetail.getCorpName());
        }
        if (insLogisticsOrderDetail.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getInstitutionId, insLogisticsOrderDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderDetail.getInstitutionName())) {
            chainWrapper.set(InsLogisticsOrderDetail::getInstitutionName, insLogisticsOrderDetail.getInstitutionName());
        }
        if (insLogisticsOrderDetail.getOrderId() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getOrderId, insLogisticsOrderDetail.getOrderId());
        }
        if (insLogisticsOrderDetail.getGoodsId() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getGoodsId, insLogisticsOrderDetail.getGoodsId());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderDetail.getGoodsName())) {
            chainWrapper.set(InsLogisticsOrderDetail::getGoodsName, insLogisticsOrderDetail.getGoodsName());
        }
        if (insLogisticsOrderDetail.getNum() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getNum, insLogisticsOrderDetail.getNum());
        }
        if (insLogisticsOrderDetail.getPrice() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getPrice, insLogisticsOrderDetail.getPrice());
        }
        if (insLogisticsOrderDetail.getAmount() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getAmount, insLogisticsOrderDetail.getAmount());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderDetail.getRemark())) {
            chainWrapper.set(InsLogisticsOrderDetail::getRemark, insLogisticsOrderDetail.getRemark());
        }
        if (insLogisticsOrderDetail.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getCreateUser, insLogisticsOrderDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsOrderDetail.getCreateName())) {
            chainWrapper.set(InsLogisticsOrderDetail::getCreateName, insLogisticsOrderDetail.getCreateName());
        }
        if (insLogisticsOrderDetail.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getCreateDept, insLogisticsOrderDetail.getCreateDept());
        }
        if (insLogisticsOrderDetail.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getCreateTime, insLogisticsOrderDetail.getCreateTime());
        }
        if (insLogisticsOrderDetail.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getUpdateUser, insLogisticsOrderDetail.getUpdateUser());
        }
        if (insLogisticsOrderDetail.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getUpdateTime, insLogisticsOrderDetail.getUpdateTime());
        }
        if (insLogisticsOrderDetail.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getIsDeleted, insLogisticsOrderDetail.getIsDeleted());
        }
        if (insLogisticsOrderDetail.getStatus() != null) {
            chainWrapper.set(InsLogisticsOrderDetail::getStatus, insLogisticsOrderDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsOrderDetail::getId, insLogisticsOrderDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsOrderDetail.getId());
        } else {
            return insLogisticsOrderDetail;
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
    public boolean saveInsLogisticsOrderDetailBatch(List<InsLogisticsOrderDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsOrderDetail insLogisticsOrderDetail : insertList) {
            //使用默认的雪花算法生成
            insLogisticsOrderDetail.setId(null);
            //insLogisticsOrderDetail.setCreatedDt(currentDte);
            //insLogisticsOrderDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsOrderDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsOrderDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


