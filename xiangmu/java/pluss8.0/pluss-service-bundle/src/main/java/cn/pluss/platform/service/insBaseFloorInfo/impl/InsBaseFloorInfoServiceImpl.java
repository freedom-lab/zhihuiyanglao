package cn.pluss.platform.service.insBaseFloorInfo.impl;

import cn.pluss.platform.mapper.InsBaseFloorInfoMapper;
import cn.pluss.platform.model.entity.InsBaseFloorInfo;
import cn.pluss.platform.service.insBaseFloorInfo.InsBaseFloorInfoService;
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
@Service("insBaseFloorInfoService")
public class InsBaseFloorInfoServiceImpl extends ServiceImpl< InsBaseFloorInfoMapper, InsBaseFloorInfo> implements InsBaseFloorInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseFloorInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseFloorInfo> queryPage(Map map) {
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
    public InsBaseFloorInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseFloorInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseFloorInfo queryOne(InsBaseFloorInfo insBaseFloorInfo){
        LambdaQueryWrapper<InsBaseFloorInfo> queryWrapper = getQueryWrapper(insBaseFloorInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseFloorInfo
    * @return
    */
    @Override
    public List<InsBaseFloorInfo> queryList(InsBaseFloorInfo insBaseFloorInfo) {
        LambdaQueryWrapper<InsBaseFloorInfo> queryWrapper = getQueryWrapper(insBaseFloorInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseFloorInfo
    * @return
    */
    public static LambdaQueryWrapper<InsBaseFloorInfo> getQueryWrapper(InsBaseFloorInfo insBaseFloorInfo){
        LambdaQueryWrapper<InsBaseFloorInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseFloorInfo.getId() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getId, insBaseFloorInfo.getId());
        }
        if (StringUtil.isNotEmpty(insBaseFloorInfo.getTenantId())) {
            queryWrapper.eq(InsBaseFloorInfo::getTenantId, insBaseFloorInfo.getTenantId());
        }
        if (insBaseFloorInfo.getCorpId() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getCorpId, insBaseFloorInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insBaseFloorInfo.getCorpName())) {
            queryWrapper.eq(InsBaseFloorInfo::getCorpName, insBaseFloorInfo.getCorpName());
        }
        if (insBaseFloorInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getInstitutionId, insBaseFloorInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insBaseFloorInfo.getInstitutionName())) {
            queryWrapper.eq(InsBaseFloorInfo::getInstitutionName, insBaseFloorInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insBaseFloorInfo.getFloorName())) {
            queryWrapper.eq(InsBaseFloorInfo::getFloorName, insBaseFloorInfo.getFloorName());
        }
        if (insBaseFloorInfo.getRoomNum() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getRoomNum, insBaseFloorInfo.getRoomNum());
        }
        if (insBaseFloorInfo.getBuildingId() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getBuildingId, insBaseFloorInfo.getBuildingId());
        }
        if (StringUtil.isNotEmpty(insBaseFloorInfo.getBuildingName())) {
            queryWrapper.eq(InsBaseFloorInfo::getBuildingName, insBaseFloorInfo.getBuildingName());
        }
        if (insBaseFloorInfo.getSortNum() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getSortNum, insBaseFloorInfo.getSortNum());
        }
        if (StringUtil.isNotEmpty(insBaseFloorInfo.getRemark())) {
            queryWrapper.eq(InsBaseFloorInfo::getRemark, insBaseFloorInfo.getRemark());
        }
        if (insBaseFloorInfo.getCreateUser() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getCreateUser, insBaseFloorInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseFloorInfo.getCreateName())) {
            queryWrapper.eq(InsBaseFloorInfo::getCreateName, insBaseFloorInfo.getCreateName());
        }
        if (insBaseFloorInfo.getCreateDept() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getCreateDept, insBaseFloorInfo.getCreateDept());
        }
        if (insBaseFloorInfo.getCreateTime() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getCreateTime, insBaseFloorInfo.getCreateTime());
        }
        if (insBaseFloorInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getUpdateUser, insBaseFloorInfo.getUpdateUser());
        }
        if (insBaseFloorInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getUpdateTime, insBaseFloorInfo.getUpdateTime());
        }
        if (insBaseFloorInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getIsDeleted, insBaseFloorInfo.getIsDeleted());
        }
        if (insBaseFloorInfo.getStatus() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getStatus, insBaseFloorInfo.getStatus());
        }
        if (insBaseFloorInfo.getBedNum() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getBedNum, insBaseFloorInfo.getBedNum());
        }
        if (insBaseFloorInfo.getOccupancyNum() != null) {
            queryWrapper.eq(InsBaseFloorInfo::getOccupancyNum, insBaseFloorInfo.getOccupancyNum());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseFloorInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseFloorInfo insert(InsBaseFloorInfo insBaseFloorInfo) {
        insBaseFloorInfo.setId(null);
        getBaseMapper().insert(insBaseFloorInfo);
        return insBaseFloorInfo;
    }

    /**
    * 更新数据
    *
    * @param insBaseFloorInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseFloorInfo update(InsBaseFloorInfo insBaseFloorInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseFloorInfo> chainWrapper = new LambdaUpdateChainWrapper<InsBaseFloorInfo>(getBaseMapper());
        if (insBaseFloorInfo.getId() != null) {
            chainWrapper.set(InsBaseFloorInfo::getId, insBaseFloorInfo.getId());
        }
        if (StringUtil.isNotBlank(insBaseFloorInfo.getTenantId())) {
            chainWrapper.set(InsBaseFloorInfo::getTenantId, insBaseFloorInfo.getTenantId());
        }
        if (insBaseFloorInfo.getCorpId() != null) {
            chainWrapper.set(InsBaseFloorInfo::getCorpId, insBaseFloorInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insBaseFloorInfo.getCorpName())) {
            chainWrapper.set(InsBaseFloorInfo::getCorpName, insBaseFloorInfo.getCorpName());
        }
        if (insBaseFloorInfo.getInstitutionId() != null) {
            chainWrapper.set(InsBaseFloorInfo::getInstitutionId, insBaseFloorInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insBaseFloorInfo.getInstitutionName())) {
            chainWrapper.set(InsBaseFloorInfo::getInstitutionName, insBaseFloorInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insBaseFloorInfo.getFloorName())) {
            chainWrapper.set(InsBaseFloorInfo::getFloorName, insBaseFloorInfo.getFloorName());
        }
        if (insBaseFloorInfo.getRoomNum() != null) {
            chainWrapper.set(InsBaseFloorInfo::getRoomNum, insBaseFloorInfo.getRoomNum());
        }
        if (insBaseFloorInfo.getBuildingId() != null) {
            chainWrapper.set(InsBaseFloorInfo::getBuildingId, insBaseFloorInfo.getBuildingId());
        }
        if (StringUtil.isNotBlank(insBaseFloorInfo.getBuildingName())) {
            chainWrapper.set(InsBaseFloorInfo::getBuildingName, insBaseFloorInfo.getBuildingName());
        }
        if (insBaseFloorInfo.getSortNum() != null) {
            chainWrapper.set(InsBaseFloorInfo::getSortNum, insBaseFloorInfo.getSortNum());
        }
        if (StringUtil.isNotBlank(insBaseFloorInfo.getRemark())) {
            chainWrapper.set(InsBaseFloorInfo::getRemark, insBaseFloorInfo.getRemark());
        }
        if (insBaseFloorInfo.getCreateUser() != null) {
            chainWrapper.set(InsBaseFloorInfo::getCreateUser, insBaseFloorInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseFloorInfo.getCreateName())) {
            chainWrapper.set(InsBaseFloorInfo::getCreateName, insBaseFloorInfo.getCreateName());
        }
        if (insBaseFloorInfo.getCreateDept() != null) {
            chainWrapper.set(InsBaseFloorInfo::getCreateDept, insBaseFloorInfo.getCreateDept());
        }
        if (insBaseFloorInfo.getCreateTime() != null) {
            chainWrapper.set(InsBaseFloorInfo::getCreateTime, insBaseFloorInfo.getCreateTime());
        }
        if (insBaseFloorInfo.getUpdateUser() != null) {
            chainWrapper.set(InsBaseFloorInfo::getUpdateUser, insBaseFloorInfo.getUpdateUser());
        }
        if (insBaseFloorInfo.getUpdateTime() != null) {
            chainWrapper.set(InsBaseFloorInfo::getUpdateTime, insBaseFloorInfo.getUpdateTime());
        }
        if (insBaseFloorInfo.getIsDeleted() != null) {
            chainWrapper.set(InsBaseFloorInfo::getIsDeleted, insBaseFloorInfo.getIsDeleted());
        }
        if (insBaseFloorInfo.getStatus() != null) {
            chainWrapper.set(InsBaseFloorInfo::getStatus, insBaseFloorInfo.getStatus());
        }
        if (insBaseFloorInfo.getBedNum() != null) {
            chainWrapper.set(InsBaseFloorInfo::getBedNum, insBaseFloorInfo.getBedNum());
        }
        if (insBaseFloorInfo.getOccupancyNum() != null) {
            chainWrapper.set(InsBaseFloorInfo::getOccupancyNum, insBaseFloorInfo.getOccupancyNum());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseFloorInfo::getId, insBaseFloorInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseFloorInfo.getId());
        } else {
            return insBaseFloorInfo;
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
    public boolean saveInsBaseFloorInfoBatch(List<InsBaseFloorInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseFloorInfo insBaseFloorInfo : insertList) {
            //使用默认的雪花算法生成
            insBaseFloorInfo.setId(null);
            //insBaseFloorInfo.setCreatedDt(currentDte);
            //insBaseFloorInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseFloorInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseFloorInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


