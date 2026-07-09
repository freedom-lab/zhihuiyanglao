package cn.pluss.platform.service.insLogisticsWarehouseInfo.impl;

import cn.pluss.platform.mapper.InsLogisticsWarehouseInfoMapper;
import cn.pluss.platform.model.entity.InsLogisticsWarehouseInfo;
import cn.pluss.platform.service.insLogisticsWarehouseInfo.InsLogisticsWarehouseInfoService;
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
@Service("insLogisticsWarehouseInfoService")
public class InsLogisticsWarehouseInfoServiceImpl extends ServiceImpl< InsLogisticsWarehouseInfoMapper, InsLogisticsWarehouseInfo> implements InsLogisticsWarehouseInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsWarehouseInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsWarehouseInfo> queryPage(Map map) {
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
    public InsLogisticsWarehouseInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsWarehouseInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsWarehouseInfo queryOne(InsLogisticsWarehouseInfo insLogisticsWarehouseInfo){
        LambdaQueryWrapper<InsLogisticsWarehouseInfo> queryWrapper = getQueryWrapper(insLogisticsWarehouseInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsWarehouseInfo
    * @return
    */
    @Override
    public List<InsLogisticsWarehouseInfo> queryList(InsLogisticsWarehouseInfo insLogisticsWarehouseInfo) {
        LambdaQueryWrapper<InsLogisticsWarehouseInfo> queryWrapper = getQueryWrapper(insLogisticsWarehouseInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsWarehouseInfo
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsWarehouseInfo> getQueryWrapper(InsLogisticsWarehouseInfo insLogisticsWarehouseInfo){
        LambdaQueryWrapper<InsLogisticsWarehouseInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsWarehouseInfo.getId() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getId, insLogisticsWarehouseInfo.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsWarehouseInfo.getTenantId())) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getTenantId, insLogisticsWarehouseInfo.getTenantId());
        }
        if (insLogisticsWarehouseInfo.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getCorpId, insLogisticsWarehouseInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsWarehouseInfo.getCorpName())) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getCorpName, insLogisticsWarehouseInfo.getCorpName());
        }
        if (insLogisticsWarehouseInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getInstitutionId, insLogisticsWarehouseInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsWarehouseInfo.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getInstitutionName, insLogisticsWarehouseInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insLogisticsWarehouseInfo.getWarehouseName())) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getWarehouseName, insLogisticsWarehouseInfo.getWarehouseName());
        }
        if (StringUtil.isNotEmpty(insLogisticsWarehouseInfo.getWarehouseAddress())) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getWarehouseAddress, insLogisticsWarehouseInfo.getWarehouseAddress());
        }
        if (StringUtil.isNotEmpty(insLogisticsWarehouseInfo.getLinkMan())) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getLinkMan, insLogisticsWarehouseInfo.getLinkMan());
        }
        if (StringUtil.isNotEmpty(insLogisticsWarehouseInfo.getLinkTel())) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getLinkTel, insLogisticsWarehouseInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insLogisticsWarehouseInfo.getRemark())) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getRemark, insLogisticsWarehouseInfo.getRemark());
        }
        if (insLogisticsWarehouseInfo.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getCreateUser, insLogisticsWarehouseInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsWarehouseInfo.getCreateName())) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getCreateName, insLogisticsWarehouseInfo.getCreateName());
        }
        if (insLogisticsWarehouseInfo.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getCreateDept, insLogisticsWarehouseInfo.getCreateDept());
        }
        if (insLogisticsWarehouseInfo.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getCreateTime, insLogisticsWarehouseInfo.getCreateTime());
        }
        if (insLogisticsWarehouseInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getUpdateUser, insLogisticsWarehouseInfo.getUpdateUser());
        }
        if (insLogisticsWarehouseInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getUpdateTime, insLogisticsWarehouseInfo.getUpdateTime());
        }
        if (insLogisticsWarehouseInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getIsDeleted, insLogisticsWarehouseInfo.getIsDeleted());
        }
        if (insLogisticsWarehouseInfo.getStatus() != null) {
            queryWrapper.eq(InsLogisticsWarehouseInfo::getStatus, insLogisticsWarehouseInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsWarehouseInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsWarehouseInfo insert(InsLogisticsWarehouseInfo insLogisticsWarehouseInfo) {
        insLogisticsWarehouseInfo.setId(null);
        getBaseMapper().insert(insLogisticsWarehouseInfo);
        return insLogisticsWarehouseInfo;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsWarehouseInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsWarehouseInfo update(InsLogisticsWarehouseInfo insLogisticsWarehouseInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsWarehouseInfo> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsWarehouseInfo>(getBaseMapper());
        if (insLogisticsWarehouseInfo.getId() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getId, insLogisticsWarehouseInfo.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsWarehouseInfo.getTenantId())) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getTenantId, insLogisticsWarehouseInfo.getTenantId());
        }
        if (insLogisticsWarehouseInfo.getCorpId() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getCorpId, insLogisticsWarehouseInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsWarehouseInfo.getCorpName())) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getCorpName, insLogisticsWarehouseInfo.getCorpName());
        }
        if (insLogisticsWarehouseInfo.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getInstitutionId, insLogisticsWarehouseInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsWarehouseInfo.getInstitutionName())) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getInstitutionName, insLogisticsWarehouseInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insLogisticsWarehouseInfo.getWarehouseName())) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getWarehouseName, insLogisticsWarehouseInfo.getWarehouseName());
        }
        if (StringUtil.isNotBlank(insLogisticsWarehouseInfo.getWarehouseAddress())) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getWarehouseAddress, insLogisticsWarehouseInfo.getWarehouseAddress());
        }
        if (StringUtil.isNotBlank(insLogisticsWarehouseInfo.getLinkMan())) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getLinkMan, insLogisticsWarehouseInfo.getLinkMan());
        }
        if (StringUtil.isNotBlank(insLogisticsWarehouseInfo.getLinkTel())) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getLinkTel, insLogisticsWarehouseInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(insLogisticsWarehouseInfo.getRemark())) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getRemark, insLogisticsWarehouseInfo.getRemark());
        }
        if (insLogisticsWarehouseInfo.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getCreateUser, insLogisticsWarehouseInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsWarehouseInfo.getCreateName())) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getCreateName, insLogisticsWarehouseInfo.getCreateName());
        }
        if (insLogisticsWarehouseInfo.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getCreateDept, insLogisticsWarehouseInfo.getCreateDept());
        }
        if (insLogisticsWarehouseInfo.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getCreateTime, insLogisticsWarehouseInfo.getCreateTime());
        }
        if (insLogisticsWarehouseInfo.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getUpdateUser, insLogisticsWarehouseInfo.getUpdateUser());
        }
        if (insLogisticsWarehouseInfo.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getUpdateTime, insLogisticsWarehouseInfo.getUpdateTime());
        }
        if (insLogisticsWarehouseInfo.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getIsDeleted, insLogisticsWarehouseInfo.getIsDeleted());
        }
        if (insLogisticsWarehouseInfo.getStatus() != null) {
            chainWrapper.set(InsLogisticsWarehouseInfo::getStatus, insLogisticsWarehouseInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsWarehouseInfo::getId, insLogisticsWarehouseInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsWarehouseInfo.getId());
        } else {
            return insLogisticsWarehouseInfo;
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
    public boolean saveInsLogisticsWarehouseInfoBatch(List<InsLogisticsWarehouseInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsWarehouseInfo insLogisticsWarehouseInfo : insertList) {
            //使用默认的雪花算法生成
            insLogisticsWarehouseInfo.setId(null);
            //insLogisticsWarehouseInfo.setCreatedDt(currentDte);
            //insLogisticsWarehouseInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsWarehouseInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsWarehouseInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


