package cn.pluss.platform.service.insCanteenWeekMenuDetail.impl;

import cn.pluss.platform.mapper.InsCanteenWeekMenuDetailMapper;
import cn.pluss.platform.model.entity.InsCanteenWeekMenuDetail;
import cn.pluss.platform.service.insCanteenWeekMenuDetail.InsCanteenWeekMenuDetailService;
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
@Service("insCanteenWeekMenuDetailService")
public class InsCanteenWeekMenuDetailServiceImpl extends ServiceImpl< InsCanteenWeekMenuDetailMapper, InsCanteenWeekMenuDetail> implements InsCanteenWeekMenuDetailService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenWeekMenuDetailServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenWeekMenuDetail> queryPage(Map map) {
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
    public InsCanteenWeekMenuDetail queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenWeekMenuDetail 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenWeekMenuDetail queryOne(InsCanteenWeekMenuDetail insCanteenWeekMenuDetail){
        LambdaQueryWrapper<InsCanteenWeekMenuDetail> queryWrapper = getQueryWrapper(insCanteenWeekMenuDetail);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenWeekMenuDetail
    * @return
    */
    @Override
    public List<InsCanteenWeekMenuDetail> queryList(InsCanteenWeekMenuDetail insCanteenWeekMenuDetail) {
        LambdaQueryWrapper<InsCanteenWeekMenuDetail> queryWrapper = getQueryWrapper(insCanteenWeekMenuDetail);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenWeekMenuDetail
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenWeekMenuDetail> getQueryWrapper(InsCanteenWeekMenuDetail insCanteenWeekMenuDetail){
        LambdaQueryWrapper<InsCanteenWeekMenuDetail> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenWeekMenuDetail.getId() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getId, insCanteenWeekMenuDetail.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenuDetail.getTenantId())) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getTenantId, insCanteenWeekMenuDetail.getTenantId());
        }
        if (insCanteenWeekMenuDetail.getCorpId() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getCorpId, insCanteenWeekMenuDetail.getCorpId());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenuDetail.getCorpName())) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getCorpName, insCanteenWeekMenuDetail.getCorpName());
        }
        if (insCanteenWeekMenuDetail.getInstitutionId() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getInstitutionId, insCanteenWeekMenuDetail.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenuDetail.getInstitutionName())) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getInstitutionName, insCanteenWeekMenuDetail.getInstitutionName());
        }
        if (insCanteenWeekMenuDetail.getMenuId() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getMenuId, insCanteenWeekMenuDetail.getMenuId());
        }
        if (insCanteenWeekMenuDetail.getWeekDate() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getWeekDate, insCanteenWeekMenuDetail.getWeekDate());
        }
        if (insCanteenWeekMenuDetail.getWeekNum() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getWeekNum, insCanteenWeekMenuDetail.getWeekNum());
        }
        if (insCanteenWeekMenuDetail.getDetailType() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getDetailType, insCanteenWeekMenuDetail.getDetailType());
        }
        if (insCanteenWeekMenuDetail.getFoodId() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getFoodId, insCanteenWeekMenuDetail.getFoodId());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenuDetail.getFoodName())) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getFoodName, insCanteenWeekMenuDetail.getFoodName());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenuDetail.getRemark())) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getRemark, insCanteenWeekMenuDetail.getRemark());
        }
        if (insCanteenWeekMenuDetail.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getCreateUser, insCanteenWeekMenuDetail.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenuDetail.getCreateName())) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getCreateName, insCanteenWeekMenuDetail.getCreateName());
        }
        if (insCanteenWeekMenuDetail.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getCreateDept, insCanteenWeekMenuDetail.getCreateDept());
        }
        if (insCanteenWeekMenuDetail.getCreateTime() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getCreateTime, insCanteenWeekMenuDetail.getCreateTime());
        }
        if (insCanteenWeekMenuDetail.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getUpdateUser, insCanteenWeekMenuDetail.getUpdateUser());
        }
        if (insCanteenWeekMenuDetail.getUpdateTime() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getUpdateTime, insCanteenWeekMenuDetail.getUpdateTime());
        }
        if (insCanteenWeekMenuDetail.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getIsDeleted, insCanteenWeekMenuDetail.getIsDeleted());
        }
        if (insCanteenWeekMenuDetail.getStatus() != null) {
            queryWrapper.eq(InsCanteenWeekMenuDetail::getStatus, insCanteenWeekMenuDetail.getStatus());
        }
        if (insCanteenWeekMenuDetail.getStartDate() != null && insCanteenWeekMenuDetail.getEndDate() != null) {
            queryWrapper.ge(InsCanteenWeekMenuDetail::getWeekDate, insCanteenWeekMenuDetail.getStartDate())
                    .le(InsCanteenWeekMenuDetail::getWeekDate, insCanteenWeekMenuDetail.getEndDate());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenWeekMenuDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenWeekMenuDetail insert(InsCanteenWeekMenuDetail insCanteenWeekMenuDetail) {
        insCanteenWeekMenuDetail.setId(null);
        getBaseMapper().insert(insCanteenWeekMenuDetail);
        return insCanteenWeekMenuDetail;
    }

    /**
    * 更新数据
    *
    * @param insCanteenWeekMenuDetail 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenWeekMenuDetail update(InsCanteenWeekMenuDetail insCanteenWeekMenuDetail) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenWeekMenuDetail> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenWeekMenuDetail>(getBaseMapper());
        if (insCanteenWeekMenuDetail.getId() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getId, insCanteenWeekMenuDetail.getId());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenuDetail.getTenantId())) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getTenantId, insCanteenWeekMenuDetail.getTenantId());
        }
        if (insCanteenWeekMenuDetail.getCorpId() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getCorpId, insCanteenWeekMenuDetail.getCorpId());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenuDetail.getCorpName())) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getCorpName, insCanteenWeekMenuDetail.getCorpName());
        }
        if (insCanteenWeekMenuDetail.getInstitutionId() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getInstitutionId, insCanteenWeekMenuDetail.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenuDetail.getInstitutionName())) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getInstitutionName, insCanteenWeekMenuDetail.getInstitutionName());
        }
        if (insCanteenWeekMenuDetail.getMenuId() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getMenuId, insCanteenWeekMenuDetail.getMenuId());
        }
        if (insCanteenWeekMenuDetail.getWeekDate() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getWeekDate, insCanteenWeekMenuDetail.getWeekDate());
        }
        if (insCanteenWeekMenuDetail.getWeekNum() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getWeekNum, insCanteenWeekMenuDetail.getWeekNum());
        }
        if (insCanteenWeekMenuDetail.getDetailType() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getDetailType, insCanteenWeekMenuDetail.getDetailType());
        }
        if (insCanteenWeekMenuDetail.getFoodId() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getFoodId, insCanteenWeekMenuDetail.getFoodId());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenuDetail.getFoodName())) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getFoodName, insCanteenWeekMenuDetail.getFoodName());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenuDetail.getRemark())) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getRemark, insCanteenWeekMenuDetail.getRemark());
        }
        if (insCanteenWeekMenuDetail.getCreateUser() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getCreateUser, insCanteenWeekMenuDetail.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenuDetail.getCreateName())) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getCreateName, insCanteenWeekMenuDetail.getCreateName());
        }
        if (insCanteenWeekMenuDetail.getCreateDept() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getCreateDept, insCanteenWeekMenuDetail.getCreateDept());
        }
        if (insCanteenWeekMenuDetail.getCreateTime() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getCreateTime, insCanteenWeekMenuDetail.getCreateTime());
        }
        if (insCanteenWeekMenuDetail.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getUpdateUser, insCanteenWeekMenuDetail.getUpdateUser());
        }
        if (insCanteenWeekMenuDetail.getUpdateTime() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getUpdateTime, insCanteenWeekMenuDetail.getUpdateTime());
        }
        if (insCanteenWeekMenuDetail.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getIsDeleted, insCanteenWeekMenuDetail.getIsDeleted());
        }
        if (insCanteenWeekMenuDetail.getStatus() != null) {
            chainWrapper.set(InsCanteenWeekMenuDetail::getStatus, insCanteenWeekMenuDetail.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenWeekMenuDetail::getId, insCanteenWeekMenuDetail.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenWeekMenuDetail.getId());
        } else {
            return insCanteenWeekMenuDetail;
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
    public boolean saveInsCanteenWeekMenuDetailBatch(List<InsCanteenWeekMenuDetail> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenWeekMenuDetail insCanteenWeekMenuDetail : insertList) {
            //使用默认的雪花算法生成
            insCanteenWeekMenuDetail.setId(null);
            //insCanteenWeekMenuDetail.setCreatedDt(currentDte);
            //insCanteenWeekMenuDetail.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenWeekMenuDetailBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenWeekMenuDetail> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


