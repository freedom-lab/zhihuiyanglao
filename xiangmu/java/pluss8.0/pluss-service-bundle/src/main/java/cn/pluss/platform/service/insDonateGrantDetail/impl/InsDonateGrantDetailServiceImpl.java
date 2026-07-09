package cn.pluss.platform.service.insDonateGrantDetail.impl;

import cn.pluss.platform.mapper.InsDonateGrantDetailMapper;
import cn.pluss.platform.model.entity.InsDonateGrantDetail;
import cn.pluss.platform.service.insDonateGrantDetail.InsDonateGrantDetailService;
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
@Service("insDonateGrantDetailService")
public class InsDonateGrantDetailServiceImpl extends ServiceImpl< InsDonateGrantDetailMapper, InsDonateGrantDetail> implements InsDonateGrantDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsDonateGrantDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsDonateGrantDetail> queryPage(Map map) {
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
    public InsDonateGrantDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insDonateGrantDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsDonateGrantDetail queryOne(InsDonateGrantDetail insDonateGrantDetail){
        LambdaQueryWrapper<InsDonateGrantDetail> queryWrapper = getQueryWrapper(insDonateGrantDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insDonateGrantDetail
    * @return
    */
    @Override
    public List<InsDonateGrantDetail> queryList(InsDonateGrantDetail insDonateGrantDetail) {
        LambdaQueryWrapper<InsDonateGrantDetail> queryWrapper = getQueryWrapper(insDonateGrantDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insDonateGrantDetail
    * @return
    */
    public static LambdaQueryWrapper<InsDonateGrantDetail> getQueryWrapper(InsDonateGrantDetail insDonateGrantDetail){
        LambdaQueryWrapper<InsDonateGrantDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insDonateGrantDetail.getId() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getId, insDonateGrantDetail.getId());
        }
        if (StringUtil.isNotEmpty(insDonateGrantDetail.getTenantId())) {
            queryWrapper.eq(InsDonateGrantDetail::getTenantId, insDonateGrantDetail.getTenantId());
        }
        if (insDonateGrantDetail.getCorpId() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getCorpId, insDonateGrantDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insDonateGrantDetail.getCorpName())) {
            queryWrapper.eq(InsDonateGrantDetail::getCorpName, insDonateGrantDetail.getCorpName());
        }
        if (insDonateGrantDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getInstitutionId, insDonateGrantDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insDonateGrantDetail.getInstitutionName())) {
            queryWrapper.eq(InsDonateGrantDetail::getInstitutionName, insDonateGrantDetail.getInstitutionName());
        }
        if (insDonateGrantDetail.getDonateId() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getDonateId, insDonateGrantDetail.getDonateId());
        }
        if (insDonateGrantDetail.getDetailId() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getDetailId, insDonateGrantDetail.getDetailId());
        }
        if (insDonateGrantDetail.getGrantTime() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getGrantTime, insDonateGrantDetail.getGrantTime());
        }
        if (StringUtil.isNotEmpty(insDonateGrantDetail.getGrantName())) {
            queryWrapper.eq(InsDonateGrantDetail::getGrantName, insDonateGrantDetail.getGrantName());
        }
        if (insDonateGrantDetail.getGrantNum() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getGrantNum, insDonateGrantDetail.getGrantNum());
        }
        if (insDonateGrantDetail.getGrantMoney() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getGrantMoney, insDonateGrantDetail.getGrantMoney());
        }
        if (StringUtil.isNotEmpty(insDonateGrantDetail.getGrantDescribe())) {
            queryWrapper.eq(InsDonateGrantDetail::getGrantDescribe, insDonateGrantDetail.getGrantDescribe());
        }
        if (StringUtil.isNotEmpty(insDonateGrantDetail.getRecipientName())) {
            queryWrapper.eq(InsDonateGrantDetail::getRecipientName, insDonateGrantDetail.getRecipientName());
        }
        if (StringUtil.isNotEmpty(insDonateGrantDetail.getRemark())) {
            queryWrapper.eq(InsDonateGrantDetail::getRemark, insDonateGrantDetail.getRemark());
        }
        if (insDonateGrantDetail.getCreateUser() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getCreateUser, insDonateGrantDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insDonateGrantDetail.getCreateName())) {
            queryWrapper.eq(InsDonateGrantDetail::getCreateName, insDonateGrantDetail.getCreateName());
        }
        if (insDonateGrantDetail.getCreateDept() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getCreateDept, insDonateGrantDetail.getCreateDept());
        }
        if (insDonateGrantDetail.getCreateTime() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getCreateTime, insDonateGrantDetail.getCreateTime());
        }
        if (insDonateGrantDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getUpdateUser, insDonateGrantDetail.getUpdateUser());
        }
        if (insDonateGrantDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getUpdateTime, insDonateGrantDetail.getUpdateTime());
        }
        if (insDonateGrantDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getIsDeleted, insDonateGrantDetail.getIsDeleted());
        }
        if (insDonateGrantDetail.getStatus() != null) {
            queryWrapper.eq(InsDonateGrantDetail::getStatus, insDonateGrantDetail.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insDonateGrantDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsDonateGrantDetail insert(InsDonateGrantDetail insDonateGrantDetail) {
        insDonateGrantDetail.setId(null);
        getBaseMapper().insert(insDonateGrantDetail);
        return insDonateGrantDetail;
    }

    /**
    * 更新数据
    *
    * @param insDonateGrantDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsDonateGrantDetail update(InsDonateGrantDetail insDonateGrantDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsDonateGrantDetail> chainWrapper = new LambdaUpdateChainWrapper<InsDonateGrantDetail>(getBaseMapper());
        if (insDonateGrantDetail.getId() != null) {
            chainWrapper.set(InsDonateGrantDetail::getId, insDonateGrantDetail.getId());
        }
        if (StringUtil.isNotBlank(insDonateGrantDetail.getTenantId())) {
            chainWrapper.set(InsDonateGrantDetail::getTenantId, insDonateGrantDetail.getTenantId());
        }
        if (insDonateGrantDetail.getCorpId() != null) {
            chainWrapper.set(InsDonateGrantDetail::getCorpId, insDonateGrantDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insDonateGrantDetail.getCorpName())) {
            chainWrapper.set(InsDonateGrantDetail::getCorpName, insDonateGrantDetail.getCorpName());
        }
        if (insDonateGrantDetail.getInstitutionId() != null) {
            chainWrapper.set(InsDonateGrantDetail::getInstitutionId, insDonateGrantDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insDonateGrantDetail.getInstitutionName())) {
            chainWrapper.set(InsDonateGrantDetail::getInstitutionName, insDonateGrantDetail.getInstitutionName());
        }
        if (insDonateGrantDetail.getDonateId() != null) {
            chainWrapper.set(InsDonateGrantDetail::getDonateId, insDonateGrantDetail.getDonateId());
        }
        if (insDonateGrantDetail.getDetailId() != null) {
            chainWrapper.set(InsDonateGrantDetail::getDetailId, insDonateGrantDetail.getDetailId());
        }
        if (insDonateGrantDetail.getGrantTime() != null) {
            chainWrapper.set(InsDonateGrantDetail::getGrantTime, insDonateGrantDetail.getGrantTime());
        }
        if (StringUtil.isNotBlank(insDonateGrantDetail.getGrantName())) {
            chainWrapper.set(InsDonateGrantDetail::getGrantName, insDonateGrantDetail.getGrantName());
        }
        if (insDonateGrantDetail.getGrantNum() != null) {
            chainWrapper.set(InsDonateGrantDetail::getGrantNum, insDonateGrantDetail.getGrantNum());
        }
        if (insDonateGrantDetail.getGrantMoney() != null) {
            chainWrapper.set(InsDonateGrantDetail::getGrantMoney, insDonateGrantDetail.getGrantMoney());
        }
        if (StringUtil.isNotBlank(insDonateGrantDetail.getGrantDescribe())) {
            chainWrapper.set(InsDonateGrantDetail::getGrantDescribe, insDonateGrantDetail.getGrantDescribe());
        }
        if (StringUtil.isNotBlank(insDonateGrantDetail.getRecipientName())) {
            chainWrapper.set(InsDonateGrantDetail::getRecipientName, insDonateGrantDetail.getRecipientName());
        }
        if (StringUtil.isNotBlank(insDonateGrantDetail.getRemark())) {
            chainWrapper.set(InsDonateGrantDetail::getRemark, insDonateGrantDetail.getRemark());
        }
        if (insDonateGrantDetail.getCreateUser() != null) {
            chainWrapper.set(InsDonateGrantDetail::getCreateUser, insDonateGrantDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insDonateGrantDetail.getCreateName())) {
            chainWrapper.set(InsDonateGrantDetail::getCreateName, insDonateGrantDetail.getCreateName());
        }
        if (insDonateGrantDetail.getCreateDept() != null) {
            chainWrapper.set(InsDonateGrantDetail::getCreateDept, insDonateGrantDetail.getCreateDept());
        }
        if (insDonateGrantDetail.getCreateTime() != null) {
            chainWrapper.set(InsDonateGrantDetail::getCreateTime, insDonateGrantDetail.getCreateTime());
        }
        if (insDonateGrantDetail.getUpdateUser() != null) {
            chainWrapper.set(InsDonateGrantDetail::getUpdateUser, insDonateGrantDetail.getUpdateUser());
        }
        if (insDonateGrantDetail.getUpdateTime() != null) {
            chainWrapper.set(InsDonateGrantDetail::getUpdateTime, insDonateGrantDetail.getUpdateTime());
        }
        if (insDonateGrantDetail.getIsDeleted() != null) {
            chainWrapper.set(InsDonateGrantDetail::getIsDeleted, insDonateGrantDetail.getIsDeleted());
        }
        if (insDonateGrantDetail.getStatus() != null) {
            chainWrapper.set(InsDonateGrantDetail::getStatus, insDonateGrantDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsDonateGrantDetail::getId, insDonateGrantDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insDonateGrantDetail.getId());
        } else {
            return insDonateGrantDetail;
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
    public boolean saveInsDonateGrantDetailBatch(List<InsDonateGrantDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsDonateGrantDetail insDonateGrantDetail : insertList) {
            //使用默认的雪花算法生成
            insDonateGrantDetail.setId(null);
            //insDonateGrantDetail.setCreatedDt(currentDte);
            //insDonateGrantDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsDonateGrantDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsDonateGrantDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


