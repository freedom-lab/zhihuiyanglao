package cn.pluss.platform.service.insBaseBuildingInfo.impl;

import cn.pluss.platform.mapper.InsBaseBuildingInfoMapper;
import cn.pluss.platform.model.entity.InsBaseBuildingInfo;
import cn.pluss.platform.service.insBaseBuildingInfo.InsBaseBuildingInfoService;
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
@Service("insBaseBuildingInfoService")
public class InsBaseBuildingInfoServiceImpl extends ServiceImpl< InsBaseBuildingInfoMapper, InsBaseBuildingInfo> implements InsBaseBuildingInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseBuildingInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseBuildingInfo> queryPage(Map map) {
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
    public InsBaseBuildingInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseBuildingInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseBuildingInfo queryOne(InsBaseBuildingInfo insBaseBuildingInfo){
        LambdaQueryWrapper<InsBaseBuildingInfo> queryWrapper = getQueryWrapper(insBaseBuildingInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseBuildingInfo
    * @return
    */
    @Override
    public List<InsBaseBuildingInfo> queryList(InsBaseBuildingInfo insBaseBuildingInfo) {
        LambdaQueryWrapper<InsBaseBuildingInfo> queryWrapper = getQueryWrapper(insBaseBuildingInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseBuildingInfo
    * @return
    */
    public static LambdaQueryWrapper<InsBaseBuildingInfo> getQueryWrapper(InsBaseBuildingInfo insBaseBuildingInfo){
        LambdaQueryWrapper<InsBaseBuildingInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseBuildingInfo.getId() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getId, insBaseBuildingInfo.getId());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getTenantId())) {
            queryWrapper.eq(InsBaseBuildingInfo::getTenantId, insBaseBuildingInfo.getTenantId());
        }
        if (insBaseBuildingInfo.getCorpId() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getCorpId, insBaseBuildingInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getCorpName())) {
            queryWrapper.eq(InsBaseBuildingInfo::getCorpName, insBaseBuildingInfo.getCorpName());
        }
        if (insBaseBuildingInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getInstitutionId, insBaseBuildingInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getInstitutionName())) {
            queryWrapper.eq(InsBaseBuildingInfo::getInstitutionName, insBaseBuildingInfo.getInstitutionName());
        }
        if (insBaseBuildingInfo.getParentId() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getParentId, insBaseBuildingInfo.getParentId());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getParentName())) {
            queryWrapper.eq(InsBaseBuildingInfo::getParentName, insBaseBuildingInfo.getParentName());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getBuildingName())) {
            queryWrapper.eq(InsBaseBuildingInfo::getBuildingName, insBaseBuildingInfo.getBuildingName());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getImgPath())) {
            queryWrapper.eq(InsBaseBuildingInfo::getImgPath, insBaseBuildingInfo.getImgPath());
        }
        if (insBaseBuildingInfo.getFloorNum() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getFloorNum, insBaseBuildingInfo.getFloorNum());
        }
        if (insBaseBuildingInfo.getBuildingType() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getBuildingType, insBaseBuildingInfo.getBuildingType());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getHouseImg())) {
            queryWrapper.eq(InsBaseBuildingInfo::getHouseImg, insBaseBuildingInfo.getHouseImg());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getStructureImg())) {
            queryWrapper.eq(InsBaseBuildingInfo::getStructureImg, insBaseBuildingInfo.getStructureImg());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getIndoorPositioningId())) {
            queryWrapper.eq(InsBaseBuildingInfo::getIndoorPositioningId, insBaseBuildingInfo.getIndoorPositioningId());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getIndoorMapId())) {
            queryWrapper.eq(InsBaseBuildingInfo::getIndoorMapId, insBaseBuildingInfo.getIndoorMapId());
        }
        if (insBaseBuildingInfo.getIndoorCeilingNum() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getIndoorCeilingNum, insBaseBuildingInfo.getIndoorCeilingNum());
        }
        if (insBaseBuildingInfo.getIndoorGroundNum() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getIndoorGroundNum, insBaseBuildingInfo.getIndoorGroundNum());
        }
        if (insBaseBuildingInfo.getSortNum() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getSortNum, insBaseBuildingInfo.getSortNum());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getRemark())) {
            queryWrapper.eq(InsBaseBuildingInfo::getRemark, insBaseBuildingInfo.getRemark());
        }
        if (insBaseBuildingInfo.getCreateUser() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getCreateUser, insBaseBuildingInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseBuildingInfo.getCreateName())) {
            queryWrapper.eq(InsBaseBuildingInfo::getCreateName, insBaseBuildingInfo.getCreateName());
        }
        if (insBaseBuildingInfo.getCreateDept() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getCreateDept, insBaseBuildingInfo.getCreateDept());
        }
        if (insBaseBuildingInfo.getCreateTime() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getCreateTime, insBaseBuildingInfo.getCreateTime());
        }
        if (insBaseBuildingInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getUpdateUser, insBaseBuildingInfo.getUpdateUser());
        }
        if (insBaseBuildingInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getUpdateTime, insBaseBuildingInfo.getUpdateTime());
        }
        if (insBaseBuildingInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getIsDeleted, insBaseBuildingInfo.getIsDeleted());
        }
        if (insBaseBuildingInfo.getStatus() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getStatus, insBaseBuildingInfo.getStatus());
        }
        if (insBaseBuildingInfo.getBedNum() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getBedNum, insBaseBuildingInfo.getBedNum());
        }
        if (insBaseBuildingInfo.getOccupancyNum() != null) {
            queryWrapper.eq(InsBaseBuildingInfo::getOccupancyNum, insBaseBuildingInfo.getOccupancyNum());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseBuildingInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseBuildingInfo insert(InsBaseBuildingInfo insBaseBuildingInfo) {
        insBaseBuildingInfo.setId(null);
        getBaseMapper().insert(insBaseBuildingInfo);
        return insBaseBuildingInfo;
    }

    /**
    * 更新数据
    *
    * @param insBaseBuildingInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseBuildingInfo update(InsBaseBuildingInfo insBaseBuildingInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseBuildingInfo> chainWrapper = new LambdaUpdateChainWrapper<InsBaseBuildingInfo>(getBaseMapper());
        if (insBaseBuildingInfo.getId() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getId, insBaseBuildingInfo.getId());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getTenantId())) {
            chainWrapper.set(InsBaseBuildingInfo::getTenantId, insBaseBuildingInfo.getTenantId());
        }
        if (insBaseBuildingInfo.getCorpId() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getCorpId, insBaseBuildingInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getCorpName())) {
            chainWrapper.set(InsBaseBuildingInfo::getCorpName, insBaseBuildingInfo.getCorpName());
        }
        if (insBaseBuildingInfo.getInstitutionId() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getInstitutionId, insBaseBuildingInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getInstitutionName())) {
            chainWrapper.set(InsBaseBuildingInfo::getInstitutionName, insBaseBuildingInfo.getInstitutionName());
        }
        if (insBaseBuildingInfo.getParentId() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getParentId, insBaseBuildingInfo.getParentId());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getParentName())) {
            chainWrapper.set(InsBaseBuildingInfo::getParentName, insBaseBuildingInfo.getParentName());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getBuildingName())) {
            chainWrapper.set(InsBaseBuildingInfo::getBuildingName, insBaseBuildingInfo.getBuildingName());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getImgPath())) {
            chainWrapper.set(InsBaseBuildingInfo::getImgPath, insBaseBuildingInfo.getImgPath());
        }
        if (insBaseBuildingInfo.getFloorNum() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getFloorNum, insBaseBuildingInfo.getFloorNum());
        }
        if (insBaseBuildingInfo.getBuildingType() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getBuildingType, insBaseBuildingInfo.getBuildingType());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getHouseImg())) {
            chainWrapper.set(InsBaseBuildingInfo::getHouseImg, insBaseBuildingInfo.getHouseImg());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getStructureImg())) {
            chainWrapper.set(InsBaseBuildingInfo::getStructureImg, insBaseBuildingInfo.getStructureImg());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getIndoorPositioningId())) {
            chainWrapper.set(InsBaseBuildingInfo::getIndoorPositioningId, insBaseBuildingInfo.getIndoorPositioningId());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getIndoorMapId())) {
            chainWrapper.set(InsBaseBuildingInfo::getIndoorMapId, insBaseBuildingInfo.getIndoorMapId());
        }
        if (insBaseBuildingInfo.getIndoorCeilingNum() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getIndoorCeilingNum, insBaseBuildingInfo.getIndoorCeilingNum());
        }
        if (insBaseBuildingInfo.getIndoorGroundNum() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getIndoorGroundNum, insBaseBuildingInfo.getIndoorGroundNum());
        }
        if (insBaseBuildingInfo.getSortNum() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getSortNum, insBaseBuildingInfo.getSortNum());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getRemark())) {
            chainWrapper.set(InsBaseBuildingInfo::getRemark, insBaseBuildingInfo.getRemark());
        }
        if (insBaseBuildingInfo.getCreateUser() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getCreateUser, insBaseBuildingInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseBuildingInfo.getCreateName())) {
            chainWrapper.set(InsBaseBuildingInfo::getCreateName, insBaseBuildingInfo.getCreateName());
        }
        if (insBaseBuildingInfo.getCreateDept() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getCreateDept, insBaseBuildingInfo.getCreateDept());
        }
        if (insBaseBuildingInfo.getCreateTime() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getCreateTime, insBaseBuildingInfo.getCreateTime());
        }
        if (insBaseBuildingInfo.getUpdateUser() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getUpdateUser, insBaseBuildingInfo.getUpdateUser());
        }
        if (insBaseBuildingInfo.getUpdateTime() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getUpdateTime, insBaseBuildingInfo.getUpdateTime());
        }
        if (insBaseBuildingInfo.getIsDeleted() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getIsDeleted, insBaseBuildingInfo.getIsDeleted());
        }
        if (insBaseBuildingInfo.getStatus() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getStatus, insBaseBuildingInfo.getStatus());
        }
        if (insBaseBuildingInfo.getBedNum() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getBedNum, insBaseBuildingInfo.getBedNum());
        }
        if (insBaseBuildingInfo.getOccupancyNum() != null) {
            chainWrapper.set(InsBaseBuildingInfo::getOccupancyNum, insBaseBuildingInfo.getOccupancyNum());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseBuildingInfo::getId, insBaseBuildingInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseBuildingInfo.getId());
        } else {
            return insBaseBuildingInfo;
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
    public boolean saveInsBaseBuildingInfoBatch(List<InsBaseBuildingInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseBuildingInfo insBaseBuildingInfo : insertList) {
            //使用默认的雪花算法生成
            insBaseBuildingInfo.setId(null);
            //insBaseBuildingInfo.setCreatedDt(currentDte);
            //insBaseBuildingInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseBuildingInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseBuildingInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


