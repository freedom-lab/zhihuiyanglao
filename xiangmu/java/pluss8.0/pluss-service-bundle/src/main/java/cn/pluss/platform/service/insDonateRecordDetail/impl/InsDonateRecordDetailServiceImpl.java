package cn.pluss.platform.service.insDonateRecordDetail.impl;

import cn.pluss.platform.mapper.InsDonateRecordDetailMapper;
import cn.pluss.platform.model.entity.InsDonateRecordDetail;
import cn.pluss.platform.service.insDonateRecordDetail.InsDonateRecordDetailService;
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
@Service("insDonateRecordDetailService")
public class InsDonateRecordDetailServiceImpl extends ServiceImpl< InsDonateRecordDetailMapper, InsDonateRecordDetail> implements InsDonateRecordDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsDonateRecordDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsDonateRecordDetail> queryPage(Map map) {
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
    public InsDonateRecordDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insDonateRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsDonateRecordDetail queryOne(InsDonateRecordDetail insDonateRecordDetail){
        LambdaQueryWrapper<InsDonateRecordDetail> queryWrapper = getQueryWrapper(insDonateRecordDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insDonateRecordDetail
    * @return
    */
    @Override
    public List<InsDonateRecordDetail> queryList(InsDonateRecordDetail insDonateRecordDetail) {
        LambdaQueryWrapper<InsDonateRecordDetail> queryWrapper = getQueryWrapper(insDonateRecordDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insDonateRecordDetail
    * @return
    */
    public static LambdaQueryWrapper<InsDonateRecordDetail> getQueryWrapper(InsDonateRecordDetail insDonateRecordDetail){
        LambdaQueryWrapper<InsDonateRecordDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insDonateRecordDetail.getId() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getId, insDonateRecordDetail.getId());
        }
        if (StringUtil.isNotEmpty(insDonateRecordDetail.getTenantId())) {
            queryWrapper.eq(InsDonateRecordDetail::getTenantId, insDonateRecordDetail.getTenantId());
        }
        if (insDonateRecordDetail.getCorpId() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getCorpId, insDonateRecordDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insDonateRecordDetail.getCorpName())) {
            queryWrapper.eq(InsDonateRecordDetail::getCorpName, insDonateRecordDetail.getCorpName());
        }
        if (insDonateRecordDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getInstitutionId, insDonateRecordDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insDonateRecordDetail.getInstitutionName())) {
            queryWrapper.eq(InsDonateRecordDetail::getInstitutionName, insDonateRecordDetail.getInstitutionName());
        }
        if (insDonateRecordDetail.getDonateId() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getDonateId, insDonateRecordDetail.getDonateId());
        }
        if (insDonateRecordDetail.getDonateType() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getDonateType, insDonateRecordDetail.getDonateType());
        }
        if (StringUtil.isNotEmpty(insDonateRecordDetail.getGoodsName())) {
            queryWrapper.eq(InsDonateRecordDetail::getGoodsName, insDonateRecordDetail.getGoodsName());
        }
        if (StringUtil.isNotEmpty(insDonateRecordDetail.getGoodsSpecificate())) {
            queryWrapper.eq(InsDonateRecordDetail::getGoodsSpecificate, insDonateRecordDetail.getGoodsSpecificate());
        }
        if (StringUtil.isNotEmpty(insDonateRecordDetail.getGoodsUnit())) {
            queryWrapper.eq(InsDonateRecordDetail::getGoodsUnit, insDonateRecordDetail.getGoodsUnit());
        }
        if (insDonateRecordDetail.getGoodsNum() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getGoodsNum, insDonateRecordDetail.getGoodsNum());
        }
        if (insDonateRecordDetail.getConverAmount() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getConverAmount, insDonateRecordDetail.getConverAmount());
        }
        if (StringUtil.isNotEmpty(insDonateRecordDetail.getStoragePosition())) {
            queryWrapper.eq(InsDonateRecordDetail::getStoragePosition, insDonateRecordDetail.getStoragePosition());
        }
        if (insDonateRecordDetail.getEffectiveDate() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getEffectiveDate, insDonateRecordDetail.getEffectiveDate());
        }
        if (insDonateRecordDetail.getSurplusNum() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getSurplusNum, insDonateRecordDetail.getSurplusNum());
        }
        if (StringUtil.isNotEmpty(insDonateRecordDetail.getRemark())) {
            queryWrapper.eq(InsDonateRecordDetail::getRemark, insDonateRecordDetail.getRemark());
        }
        if (insDonateRecordDetail.getCreateUser() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getCreateUser, insDonateRecordDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insDonateRecordDetail.getCreateName())) {
            queryWrapper.eq(InsDonateRecordDetail::getCreateName, insDonateRecordDetail.getCreateName());
        }
        if (insDonateRecordDetail.getCreateDept() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getCreateDept, insDonateRecordDetail.getCreateDept());
        }
        if (insDonateRecordDetail.getCreateTime() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getCreateTime, insDonateRecordDetail.getCreateTime());
        }
        if (insDonateRecordDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getUpdateUser, insDonateRecordDetail.getUpdateUser());
        }
        if (insDonateRecordDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getUpdateTime, insDonateRecordDetail.getUpdateTime());
        }
        if (insDonateRecordDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getIsDeleted, insDonateRecordDetail.getIsDeleted());
        }
        if (insDonateRecordDetail.getStatus() != null) {
            queryWrapper.eq(InsDonateRecordDetail::getStatus, insDonateRecordDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insDonateRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsDonateRecordDetail insert(InsDonateRecordDetail insDonateRecordDetail) {
        insDonateRecordDetail.setId(null);
        getBaseMapper().insert(insDonateRecordDetail);
        return insDonateRecordDetail;
    }

    /**
    * 更新数据
    *
    * @param insDonateRecordDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsDonateRecordDetail update(InsDonateRecordDetail insDonateRecordDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsDonateRecordDetail> chainWrapper = new LambdaUpdateChainWrapper<InsDonateRecordDetail>(getBaseMapper());
        if (insDonateRecordDetail.getId() != null) {
            chainWrapper.set(InsDonateRecordDetail::getId, insDonateRecordDetail.getId());
        }
        if (StringUtil.isNotBlank(insDonateRecordDetail.getTenantId())) {
            chainWrapper.set(InsDonateRecordDetail::getTenantId, insDonateRecordDetail.getTenantId());
        }
        if (insDonateRecordDetail.getCorpId() != null) {
            chainWrapper.set(InsDonateRecordDetail::getCorpId, insDonateRecordDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insDonateRecordDetail.getCorpName())) {
            chainWrapper.set(InsDonateRecordDetail::getCorpName, insDonateRecordDetail.getCorpName());
        }
        if (insDonateRecordDetail.getInstitutionId() != null) {
            chainWrapper.set(InsDonateRecordDetail::getInstitutionId, insDonateRecordDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insDonateRecordDetail.getInstitutionName())) {
            chainWrapper.set(InsDonateRecordDetail::getInstitutionName, insDonateRecordDetail.getInstitutionName());
        }
        if (insDonateRecordDetail.getDonateId() != null) {
            chainWrapper.set(InsDonateRecordDetail::getDonateId, insDonateRecordDetail.getDonateId());
        }
        if (insDonateRecordDetail.getDonateType() != null) {
            chainWrapper.set(InsDonateRecordDetail::getDonateType, insDonateRecordDetail.getDonateType());
        }
        if (StringUtil.isNotBlank(insDonateRecordDetail.getGoodsName())) {
            chainWrapper.set(InsDonateRecordDetail::getGoodsName, insDonateRecordDetail.getGoodsName());
        }
        if (StringUtil.isNotBlank(insDonateRecordDetail.getGoodsSpecificate())) {
            chainWrapper.set(InsDonateRecordDetail::getGoodsSpecificate, insDonateRecordDetail.getGoodsSpecificate());
        }
        if (StringUtil.isNotBlank(insDonateRecordDetail.getGoodsUnit())) {
            chainWrapper.set(InsDonateRecordDetail::getGoodsUnit, insDonateRecordDetail.getGoodsUnit());
        }
        if (insDonateRecordDetail.getGoodsNum() != null) {
            chainWrapper.set(InsDonateRecordDetail::getGoodsNum, insDonateRecordDetail.getGoodsNum());
        }
        if (insDonateRecordDetail.getConverAmount() != null) {
            chainWrapper.set(InsDonateRecordDetail::getConverAmount, insDonateRecordDetail.getConverAmount());
        }
        if (StringUtil.isNotBlank(insDonateRecordDetail.getStoragePosition())) {
            chainWrapper.set(InsDonateRecordDetail::getStoragePosition, insDonateRecordDetail.getStoragePosition());
        }
        if (insDonateRecordDetail.getEffectiveDate() != null) {
            chainWrapper.set(InsDonateRecordDetail::getEffectiveDate, insDonateRecordDetail.getEffectiveDate());
        }
        if (insDonateRecordDetail.getSurplusNum() != null) {
            chainWrapper.set(InsDonateRecordDetail::getSurplusNum, insDonateRecordDetail.getSurplusNum());
        }
        if (StringUtil.isNotBlank(insDonateRecordDetail.getRemark())) {
            chainWrapper.set(InsDonateRecordDetail::getRemark, insDonateRecordDetail.getRemark());
        }
        if (insDonateRecordDetail.getCreateUser() != null) {
            chainWrapper.set(InsDonateRecordDetail::getCreateUser, insDonateRecordDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insDonateRecordDetail.getCreateName())) {
            chainWrapper.set(InsDonateRecordDetail::getCreateName, insDonateRecordDetail.getCreateName());
        }
        if (insDonateRecordDetail.getCreateDept() != null) {
            chainWrapper.set(InsDonateRecordDetail::getCreateDept, insDonateRecordDetail.getCreateDept());
        }
        if (insDonateRecordDetail.getCreateTime() != null) {
            chainWrapper.set(InsDonateRecordDetail::getCreateTime, insDonateRecordDetail.getCreateTime());
        }
        if (insDonateRecordDetail.getUpdateUser() != null) {
            chainWrapper.set(InsDonateRecordDetail::getUpdateUser, insDonateRecordDetail.getUpdateUser());
        }
        if (insDonateRecordDetail.getUpdateTime() != null) {
            chainWrapper.set(InsDonateRecordDetail::getUpdateTime, insDonateRecordDetail.getUpdateTime());
        }
        if (insDonateRecordDetail.getIsDeleted() != null) {
            chainWrapper.set(InsDonateRecordDetail::getIsDeleted, insDonateRecordDetail.getIsDeleted());
        }
        if (insDonateRecordDetail.getStatus() != null) {
            chainWrapper.set(InsDonateRecordDetail::getStatus, insDonateRecordDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsDonateRecordDetail::getId, insDonateRecordDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insDonateRecordDetail.getId());
        } else {
            return insDonateRecordDetail;
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
    public boolean saveInsDonateRecordDetailBatch(List<InsDonateRecordDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsDonateRecordDetail insDonateRecordDetail : insertList) {
            //使用默认的雪花算法生成
            insDonateRecordDetail.setId(null);
            //insDonateRecordDetail.setCreatedDt(currentDte);
            //insDonateRecordDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsDonateRecordDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsDonateRecordDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


