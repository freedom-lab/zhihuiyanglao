package cn.pluss.platform.service.insBaseRoomInfo.impl;

import cn.pluss.platform.mapper.InsBaseRoomInfoMapper;
import cn.pluss.platform.model.entity.InsBaseRoomInfo;
import cn.pluss.platform.service.insBaseRoomInfo.InsBaseRoomInfoService;
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
@Service("insBaseRoomInfoService")
public class InsBaseRoomInfoServiceImpl extends ServiceImpl< InsBaseRoomInfoMapper, InsBaseRoomInfo> implements InsBaseRoomInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseRoomInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseRoomInfo> queryPage(Map map) {
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
    public InsBaseRoomInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseRoomInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseRoomInfo queryOne(InsBaseRoomInfo insBaseRoomInfo){
        LambdaQueryWrapper<InsBaseRoomInfo> queryWrapper = getQueryWrapper(insBaseRoomInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseRoomInfo
    * @return
    */
    @Override
    public List<InsBaseRoomInfo> queryList(InsBaseRoomInfo insBaseRoomInfo) {
        LambdaQueryWrapper<InsBaseRoomInfo> queryWrapper = getQueryWrapper(insBaseRoomInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseRoomInfo
    * @return
    */
    public static LambdaQueryWrapper<InsBaseRoomInfo> getQueryWrapper(InsBaseRoomInfo insBaseRoomInfo){
        LambdaQueryWrapper<InsBaseRoomInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseRoomInfo.getId() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getId, insBaseRoomInfo.getId());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getTenantId())) {
            queryWrapper.eq(InsBaseRoomInfo::getTenantId, insBaseRoomInfo.getTenantId());
        }
        if (insBaseRoomInfo.getCorpId() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getCorpId, insBaseRoomInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getCorpName())) {
            queryWrapper.eq(InsBaseRoomInfo::getCorpName, insBaseRoomInfo.getCorpName());
        }
        if (insBaseRoomInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getInstitutionId, insBaseRoomInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getInstitutionName())) {
            queryWrapper.eq(InsBaseRoomInfo::getInstitutionName, insBaseRoomInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getRoomName())) {
            queryWrapper.eq(InsBaseRoomInfo::getRoomName, insBaseRoomInfo.getRoomName());
        }
        if (insBaseRoomInfo.getBuildingId() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getBuildingId, insBaseRoomInfo.getBuildingId());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getBuildingName())) {
            queryWrapper.eq(InsBaseRoomInfo::getBuildingName, insBaseRoomInfo.getBuildingName());
        }
        if (insBaseRoomInfo.getFloorId() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getFloorId, insBaseRoomInfo.getFloorId());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getFloorName())) {
            queryWrapper.eq(InsBaseRoomInfo::getFloorName, insBaseRoomInfo.getFloorName());
        }
        if (insBaseRoomInfo.getRoomArea() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getRoomArea, insBaseRoomInfo.getRoomArea());
        }
        if (insBaseRoomInfo.getShareArea() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getShareArea, insBaseRoomInfo.getShareArea());
        }
        if (insBaseRoomInfo.getIndoorArea() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getIndoorArea, insBaseRoomInfo.getIndoorArea());
        }
        if (insBaseRoomInfo.getBalconyArea() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getBalconyArea, insBaseRoomInfo.getBalconyArea());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getRoomType())) {
            queryWrapper.eq(InsBaseRoomInfo::getRoomType, insBaseRoomInfo.getRoomType());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getRoomOrientation())) {
            queryWrapper.eq(InsBaseRoomInfo::getRoomOrientation, insBaseRoomInfo.getRoomOrientation());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getRoomLighted())) {
            queryWrapper.eq(InsBaseRoomInfo::getRoomLighted, insBaseRoomInfo.getRoomLighted());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getRoomAirness())) {
            queryWrapper.eq(InsBaseRoomInfo::getRoomAirness, insBaseRoomInfo.getRoomAirness());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getHouseType())) {
            queryWrapper.eq(InsBaseRoomInfo::getHouseType, insBaseRoomInfo.getHouseType());
        }
        if (insBaseRoomInfo.getRoomDayPrice() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getRoomDayPrice, insBaseRoomInfo.getRoomDayPrice());
        }
        if (insBaseRoomInfo.getRoomMonthPrice() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getRoomMonthPrice, insBaseRoomInfo.getRoomMonthPrice());
        }
        if (insBaseRoomInfo.getRoomState() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getRoomState, insBaseRoomInfo.getRoomState());
        }
        if (insBaseRoomInfo.getSortNum() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getSortNum, insBaseRoomInfo.getSortNum());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getRemark())) {
            queryWrapper.eq(InsBaseRoomInfo::getRemark, insBaseRoomInfo.getRemark());
        }
        if (insBaseRoomInfo.getCreateUser() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getCreateUser, insBaseRoomInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getCreateName())) {
            queryWrapper.eq(InsBaseRoomInfo::getCreateName, insBaseRoomInfo.getCreateName());
        }
        if (insBaseRoomInfo.getCreateDept() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getCreateDept, insBaseRoomInfo.getCreateDept());
        }
        if (insBaseRoomInfo.getCreateTime() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getCreateTime, insBaseRoomInfo.getCreateTime());
        }
        if (insBaseRoomInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getUpdateUser, insBaseRoomInfo.getUpdateUser());
        }
        if (insBaseRoomInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getUpdateTime, insBaseRoomInfo.getUpdateTime());
        }
        if (insBaseRoomInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getIsDeleted, insBaseRoomInfo.getIsDeleted());
        }
        if (insBaseRoomInfo.getStatus() != null) {
            queryWrapper.eq(InsBaseRoomInfo::getStatus, insBaseRoomInfo.getStatus());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getIndoorPositioningId())) {
            queryWrapper.eq(InsBaseRoomInfo::getIndoorPositioningId, insBaseRoomInfo.getIndoorPositioningId());
        }
        if (StringUtil.isNotEmpty(insBaseRoomInfo.getIndoorMapId())) {
            queryWrapper.eq(InsBaseRoomInfo::getIndoorMapId, insBaseRoomInfo.getIndoorMapId());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseRoomInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseRoomInfo insert(InsBaseRoomInfo insBaseRoomInfo) {
        insBaseRoomInfo.setId(null);
        getBaseMapper().insert(insBaseRoomInfo);
        return insBaseRoomInfo;
    }

    /**
    * 更新数据
    *
    * @param insBaseRoomInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseRoomInfo update(InsBaseRoomInfo insBaseRoomInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseRoomInfo> chainWrapper = new LambdaUpdateChainWrapper<InsBaseRoomInfo>(getBaseMapper());
        if (insBaseRoomInfo.getId() != null) {
            chainWrapper.set(InsBaseRoomInfo::getId, insBaseRoomInfo.getId());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getTenantId())) {
            chainWrapper.set(InsBaseRoomInfo::getTenantId, insBaseRoomInfo.getTenantId());
        }
        if (insBaseRoomInfo.getCorpId() != null) {
            chainWrapper.set(InsBaseRoomInfo::getCorpId, insBaseRoomInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getCorpName())) {
            chainWrapper.set(InsBaseRoomInfo::getCorpName, insBaseRoomInfo.getCorpName());
        }
        if (insBaseRoomInfo.getInstitutionId() != null) {
            chainWrapper.set(InsBaseRoomInfo::getInstitutionId, insBaseRoomInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getInstitutionName())) {
            chainWrapper.set(InsBaseRoomInfo::getInstitutionName, insBaseRoomInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getRoomName())) {
            chainWrapper.set(InsBaseRoomInfo::getRoomName, insBaseRoomInfo.getRoomName());
        }
        if (insBaseRoomInfo.getBuildingId() != null) {
            chainWrapper.set(InsBaseRoomInfo::getBuildingId, insBaseRoomInfo.getBuildingId());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getBuildingName())) {
            chainWrapper.set(InsBaseRoomInfo::getBuildingName, insBaseRoomInfo.getBuildingName());
        }
        if (insBaseRoomInfo.getFloorId() != null) {
            chainWrapper.set(InsBaseRoomInfo::getFloorId, insBaseRoomInfo.getFloorId());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getFloorName())) {
            chainWrapper.set(InsBaseRoomInfo::getFloorName, insBaseRoomInfo.getFloorName());
        }
        if (insBaseRoomInfo.getRoomArea() != null) {
            chainWrapper.set(InsBaseRoomInfo::getRoomArea, insBaseRoomInfo.getRoomArea());
        }
        if (insBaseRoomInfo.getShareArea() != null) {
            chainWrapper.set(InsBaseRoomInfo::getShareArea, insBaseRoomInfo.getShareArea());
        }
        if (insBaseRoomInfo.getIndoorArea() != null) {
            chainWrapper.set(InsBaseRoomInfo::getIndoorArea, insBaseRoomInfo.getIndoorArea());
        }
        if (insBaseRoomInfo.getBalconyArea() != null) {
            chainWrapper.set(InsBaseRoomInfo::getBalconyArea, insBaseRoomInfo.getBalconyArea());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getRoomType())) {
            chainWrapper.set(InsBaseRoomInfo::getRoomType, insBaseRoomInfo.getRoomType());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getRoomOrientation())) {
            chainWrapper.set(InsBaseRoomInfo::getRoomOrientation, insBaseRoomInfo.getRoomOrientation());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getRoomLighted())) {
            chainWrapper.set(InsBaseRoomInfo::getRoomLighted, insBaseRoomInfo.getRoomLighted());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getRoomAirness())) {
            chainWrapper.set(InsBaseRoomInfo::getRoomAirness, insBaseRoomInfo.getRoomAirness());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getHouseType())) {
            chainWrapper.set(InsBaseRoomInfo::getHouseType, insBaseRoomInfo.getHouseType());
        }
        if (insBaseRoomInfo.getRoomDayPrice() != null) {
            chainWrapper.set(InsBaseRoomInfo::getRoomDayPrice, insBaseRoomInfo.getRoomDayPrice());
        }
        if (insBaseRoomInfo.getRoomMonthPrice() != null) {
            chainWrapper.set(InsBaseRoomInfo::getRoomMonthPrice, insBaseRoomInfo.getRoomMonthPrice());
        }
        if (insBaseRoomInfo.getRoomState() != null) {
            chainWrapper.set(InsBaseRoomInfo::getRoomState, insBaseRoomInfo.getRoomState());
        }
        if (insBaseRoomInfo.getSortNum() != null) {
            chainWrapper.set(InsBaseRoomInfo::getSortNum, insBaseRoomInfo.getSortNum());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getRemark())) {
            chainWrapper.set(InsBaseRoomInfo::getRemark, insBaseRoomInfo.getRemark());
        }
        if (insBaseRoomInfo.getCreateUser() != null) {
            chainWrapper.set(InsBaseRoomInfo::getCreateUser, insBaseRoomInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getCreateName())) {
            chainWrapper.set(InsBaseRoomInfo::getCreateName, insBaseRoomInfo.getCreateName());
        }
        if (insBaseRoomInfo.getCreateDept() != null) {
            chainWrapper.set(InsBaseRoomInfo::getCreateDept, insBaseRoomInfo.getCreateDept());
        }
        if (insBaseRoomInfo.getCreateTime() != null) {
            chainWrapper.set(InsBaseRoomInfo::getCreateTime, insBaseRoomInfo.getCreateTime());
        }
        if (insBaseRoomInfo.getUpdateUser() != null) {
            chainWrapper.set(InsBaseRoomInfo::getUpdateUser, insBaseRoomInfo.getUpdateUser());
        }
        if (insBaseRoomInfo.getUpdateTime() != null) {
            chainWrapper.set(InsBaseRoomInfo::getUpdateTime, insBaseRoomInfo.getUpdateTime());
        }
        if (insBaseRoomInfo.getIsDeleted() != null) {
            chainWrapper.set(InsBaseRoomInfo::getIsDeleted, insBaseRoomInfo.getIsDeleted());
        }
        if (insBaseRoomInfo.getStatus() != null) {
            chainWrapper.set(InsBaseRoomInfo::getStatus, insBaseRoomInfo.getStatus());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getIndoorPositioningId())) {
            chainWrapper.set(InsBaseRoomInfo::getIndoorPositioningId, insBaseRoomInfo.getIndoorPositioningId());
        }
        if (StringUtil.isNotBlank(insBaseRoomInfo.getIndoorMapId())) {
            chainWrapper.set(InsBaseRoomInfo::getIndoorMapId, insBaseRoomInfo.getIndoorMapId());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseRoomInfo::getId, insBaseRoomInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseRoomInfo.getId());
        } else {
            return insBaseRoomInfo;
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
    public boolean saveInsBaseRoomInfoBatch(List<InsBaseRoomInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseRoomInfo insBaseRoomInfo : insertList) {
            //使用默认的雪花算法生成
            insBaseRoomInfo.setId(null);
            //insBaseRoomInfo.setCreatedDt(currentDte);
            //insBaseRoomInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseRoomInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseRoomInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


