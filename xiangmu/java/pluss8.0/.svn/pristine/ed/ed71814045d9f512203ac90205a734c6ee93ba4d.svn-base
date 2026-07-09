package cn.pluss.platform.service.insLogisticsGoodsInfo.impl;

import cn.pluss.platform.mapper.InsLogisticsGoodsInfoMapper;
import cn.pluss.platform.model.entity.InsLogisticsGoodsInfo;
import cn.pluss.platform.service.insLogisticsGoodsInfo.InsLogisticsGoodsInfoService;
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
@Service("insLogisticsGoodsInfoService")
public class InsLogisticsGoodsInfoServiceImpl extends ServiceImpl< InsLogisticsGoodsInfoMapper, InsLogisticsGoodsInfo> implements InsLogisticsGoodsInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsGoodsInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsGoodsInfo> queryPage(Map map) {
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
    public InsLogisticsGoodsInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsGoodsInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsGoodsInfo queryOne(InsLogisticsGoodsInfo insLogisticsGoodsInfo){
        LambdaQueryWrapper<InsLogisticsGoodsInfo> queryWrapper = getQueryWrapper(insLogisticsGoodsInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsGoodsInfo
    * @return
    */
    @Override
    public List<InsLogisticsGoodsInfo> queryList(InsLogisticsGoodsInfo insLogisticsGoodsInfo) {
        LambdaQueryWrapper<InsLogisticsGoodsInfo> queryWrapper = getQueryWrapper(insLogisticsGoodsInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsGoodsInfo
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsGoodsInfo> getQueryWrapper(InsLogisticsGoodsInfo insLogisticsGoodsInfo){
        LambdaQueryWrapper<InsLogisticsGoodsInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsGoodsInfo.getId() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getId, insLogisticsGoodsInfo.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getTenantId())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getTenantId, insLogisticsGoodsInfo.getTenantId());
        }
        if (insLogisticsGoodsInfo.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getCorpId, insLogisticsGoodsInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getCorpName())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getCorpName, insLogisticsGoodsInfo.getCorpName());
        }
        if (insLogisticsGoodsInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getInstitutionId, insLogisticsGoodsInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getInstitutionName, insLogisticsGoodsInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getGoodsName())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getGoodsName, insLogisticsGoodsInfo.getGoodsName());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getGoodsCode())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getGoodsCode, insLogisticsGoodsInfo.getGoodsCode());
        }
        if (insLogisticsGoodsInfo.getTypeId() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getTypeId, insLogisticsGoodsInfo.getTypeId());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getTypeName())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getTypeName, insLogisticsGoodsInfo.getTypeName());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getGoodsUnit())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getGoodsUnit, insLogisticsGoodsInfo.getGoodsUnit());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getGoodsStandards())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getGoodsStandards, insLogisticsGoodsInfo.getGoodsStandards());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getBarCode())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getBarCode, insLogisticsGoodsInfo.getBarCode());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getManufactorName())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getManufactorName, insLogisticsGoodsInfo.getManufactorName());
        }
        if (insLogisticsGoodsInfo.getPeriodNum() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getPeriodNum, insLogisticsGoodsInfo.getPeriodNum());
        }
        if (insLogisticsGoodsInfo.getIsSales() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getIsSales, insLogisticsGoodsInfo.getIsSales());
        }
        if (insLogisticsGoodsInfo.getSellingPrice() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getSellingPrice, insLogisticsGoodsInfo.getSellingPrice());
        }
        if (insLogisticsGoodsInfo.getEarlyStock() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getEarlyStock, insLogisticsGoodsInfo.getEarlyStock());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getIconPath())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getIconPath, insLogisticsGoodsInfo.getIconPath());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getBriefContent())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getBriefContent, insLogisticsGoodsInfo.getBriefContent());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getDescription())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getDescription, insLogisticsGoodsInfo.getDescription());
        }
        if (insLogisticsGoodsInfo.getClickNum() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getClickNum, insLogisticsGoodsInfo.getClickNum());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getRemark())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getRemark, insLogisticsGoodsInfo.getRemark());
        }
        if (insLogisticsGoodsInfo.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getCreateUser, insLogisticsGoodsInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsGoodsInfo.getCreateName())) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getCreateName, insLogisticsGoodsInfo.getCreateName());
        }
        if (insLogisticsGoodsInfo.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getCreateDept, insLogisticsGoodsInfo.getCreateDept());
        }
        if (insLogisticsGoodsInfo.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getCreateTime, insLogisticsGoodsInfo.getCreateTime());
        }
        if (insLogisticsGoodsInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getUpdateUser, insLogisticsGoodsInfo.getUpdateUser());
        }
        if (insLogisticsGoodsInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getUpdateTime, insLogisticsGoodsInfo.getUpdateTime());
        }
        if (insLogisticsGoodsInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getIsDeleted, insLogisticsGoodsInfo.getIsDeleted());
        }
        if (insLogisticsGoodsInfo.getStatus() != null) {
            queryWrapper.eq(InsLogisticsGoodsInfo::getStatus, insLogisticsGoodsInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsGoodsInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsGoodsInfo insert(InsLogisticsGoodsInfo insLogisticsGoodsInfo) {
        insLogisticsGoodsInfo.setId(null);
        getBaseMapper().insert(insLogisticsGoodsInfo);
        return insLogisticsGoodsInfo;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsGoodsInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsGoodsInfo update(InsLogisticsGoodsInfo insLogisticsGoodsInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsGoodsInfo> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsGoodsInfo>(getBaseMapper());
        if (insLogisticsGoodsInfo.getId() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getId, insLogisticsGoodsInfo.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getTenantId())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getTenantId, insLogisticsGoodsInfo.getTenantId());
        }
        if (insLogisticsGoodsInfo.getCorpId() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getCorpId, insLogisticsGoodsInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getCorpName())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getCorpName, insLogisticsGoodsInfo.getCorpName());
        }
        if (insLogisticsGoodsInfo.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getInstitutionId, insLogisticsGoodsInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getInstitutionName())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getInstitutionName, insLogisticsGoodsInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getGoodsName())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getGoodsName, insLogisticsGoodsInfo.getGoodsName());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getGoodsCode())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getGoodsCode, insLogisticsGoodsInfo.getGoodsCode());
        }
        if (insLogisticsGoodsInfo.getTypeId() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getTypeId, insLogisticsGoodsInfo.getTypeId());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getTypeName())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getTypeName, insLogisticsGoodsInfo.getTypeName());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getGoodsUnit())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getGoodsUnit, insLogisticsGoodsInfo.getGoodsUnit());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getGoodsStandards())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getGoodsStandards, insLogisticsGoodsInfo.getGoodsStandards());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getBarCode())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getBarCode, insLogisticsGoodsInfo.getBarCode());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getManufactorName())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getManufactorName, insLogisticsGoodsInfo.getManufactorName());
        }
        if (insLogisticsGoodsInfo.getPeriodNum() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getPeriodNum, insLogisticsGoodsInfo.getPeriodNum());
        }
        if (insLogisticsGoodsInfo.getIsSales() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getIsSales, insLogisticsGoodsInfo.getIsSales());
        }
        if (insLogisticsGoodsInfo.getSellingPrice() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getSellingPrice, insLogisticsGoodsInfo.getSellingPrice());
        }
        if (insLogisticsGoodsInfo.getEarlyStock() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getEarlyStock, insLogisticsGoodsInfo.getEarlyStock());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getIconPath())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getIconPath, insLogisticsGoodsInfo.getIconPath());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getBriefContent())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getBriefContent, insLogisticsGoodsInfo.getBriefContent());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getDescription())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getDescription, insLogisticsGoodsInfo.getDescription());
        }
        if (insLogisticsGoodsInfo.getClickNum() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getClickNum, insLogisticsGoodsInfo.getClickNum());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getRemark())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getRemark, insLogisticsGoodsInfo.getRemark());
        }
        if (insLogisticsGoodsInfo.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getCreateUser, insLogisticsGoodsInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsGoodsInfo.getCreateName())) {
            chainWrapper.set(InsLogisticsGoodsInfo::getCreateName, insLogisticsGoodsInfo.getCreateName());
        }
        if (insLogisticsGoodsInfo.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getCreateDept, insLogisticsGoodsInfo.getCreateDept());
        }
        if (insLogisticsGoodsInfo.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getCreateTime, insLogisticsGoodsInfo.getCreateTime());
        }
        if (insLogisticsGoodsInfo.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getUpdateUser, insLogisticsGoodsInfo.getUpdateUser());
        }
        if (insLogisticsGoodsInfo.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getUpdateTime, insLogisticsGoodsInfo.getUpdateTime());
        }
        if (insLogisticsGoodsInfo.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getIsDeleted, insLogisticsGoodsInfo.getIsDeleted());
        }
        if (insLogisticsGoodsInfo.getStatus() != null) {
            chainWrapper.set(InsLogisticsGoodsInfo::getStatus, insLogisticsGoodsInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsGoodsInfo::getId, insLogisticsGoodsInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsGoodsInfo.getId());
        } else {
            return insLogisticsGoodsInfo;
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
    public boolean saveInsLogisticsGoodsInfoBatch(List<InsLogisticsGoodsInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsGoodsInfo insLogisticsGoodsInfo : insertList) {
            //使用默认的雪花算法生成
            insLogisticsGoodsInfo.setId(null);
            //insLogisticsGoodsInfo.setCreatedDt(currentDte);
            //insLogisticsGoodsInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsGoodsInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsGoodsInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


