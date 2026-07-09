package cn.pluss.platform.service.insActivityRoomInfo.impl;

import cn.pluss.platform.mapper.InsActivityRoomInfoMapper;
import cn.pluss.platform.model.entity.InsActivityRoomInfo;
import cn.pluss.platform.service.insActivityRoomInfo.InsActivityRoomInfoService;
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
@Service("insActivityRoomInfoService")
public class InsActivityRoomInfoServiceImpl extends ServiceImpl< InsActivityRoomInfoMapper, InsActivityRoomInfo> implements InsActivityRoomInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsActivityRoomInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsActivityRoomInfo> queryPage(Map map) {
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
    public InsActivityRoomInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insActivityRoomInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsActivityRoomInfo queryOne(InsActivityRoomInfo insActivityRoomInfo){
        LambdaQueryWrapper<InsActivityRoomInfo> queryWrapper = getQueryWrapper(insActivityRoomInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insActivityRoomInfo
    * @return
    */
    @Override
    public List<InsActivityRoomInfo> queryList(InsActivityRoomInfo insActivityRoomInfo) {
        LambdaQueryWrapper<InsActivityRoomInfo> queryWrapper = getQueryWrapper(insActivityRoomInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insActivityRoomInfo
    * @return
    */
    public static LambdaQueryWrapper<InsActivityRoomInfo> getQueryWrapper(InsActivityRoomInfo insActivityRoomInfo){
        LambdaQueryWrapper<InsActivityRoomInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insActivityRoomInfo.getId() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getId, insActivityRoomInfo.getId());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getTenantId())) {
            queryWrapper.eq(InsActivityRoomInfo::getTenantId, insActivityRoomInfo.getTenantId());
        }
        if (insActivityRoomInfo.getCorpId() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getCorpId, insActivityRoomInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getCorpName())) {
            queryWrapper.eq(InsActivityRoomInfo::getCorpName, insActivityRoomInfo.getCorpName());
        }
        if (insActivityRoomInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getInstitutionId, insActivityRoomInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getInstitutionName())) {
            queryWrapper.eq(InsActivityRoomInfo::getInstitutionName, insActivityRoomInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getRoomName())) {
            queryWrapper.eq(InsActivityRoomInfo::getRoomName, insActivityRoomInfo.getRoomName());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getRoomCode())) {
            queryWrapper.eq(InsActivityRoomInfo::getRoomCode, insActivityRoomInfo.getRoomCode());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getRoomPic())) {
            queryWrapper.eq(InsActivityRoomInfo::getRoomPic, insActivityRoomInfo.getRoomPic());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getShowPics())) {
            queryWrapper.eq(InsActivityRoomInfo::getShowPics, insActivityRoomInfo.getShowPics());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getRoomFacilities())) {
            queryWrapper.eq(InsActivityRoomInfo::getRoomFacilities, insActivityRoomInfo.getRoomFacilities());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getRoomIntroduce())) {
            queryWrapper.eq(InsActivityRoomInfo::getRoomIntroduce, insActivityRoomInfo.getRoomIntroduce());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getManager())) {
            queryWrapper.eq(InsActivityRoomInfo::getManager, insActivityRoomInfo.getManager());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getLinkTel())) {
            queryWrapper.eq(InsActivityRoomInfo::getLinkTel, insActivityRoomInfo.getLinkTel());
        }
        if (insActivityRoomInfo.getPlaceArea() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getPlaceArea, insActivityRoomInfo.getPlaceArea());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getOpenTime())) {
            queryWrapper.eq(InsActivityRoomInfo::getOpenTime, insActivityRoomInfo.getOpenTime());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getCloseTime())) {
            queryWrapper.eq(InsActivityRoomInfo::getCloseTime, insActivityRoomInfo.getCloseTime());
        }
        if (insActivityRoomInfo.getCapacity() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getCapacity, insActivityRoomInfo.getCapacity());
        }
        if (insActivityRoomInfo.getUseState() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getUseState, insActivityRoomInfo.getUseState());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getRemark())) {
            queryWrapper.eq(InsActivityRoomInfo::getRemark, insActivityRoomInfo.getRemark());
        }
        if (insActivityRoomInfo.getCreateUser() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getCreateUser, insActivityRoomInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insActivityRoomInfo.getCreateName())) {
            queryWrapper.eq(InsActivityRoomInfo::getCreateName, insActivityRoomInfo.getCreateName());
        }
        if (insActivityRoomInfo.getCreateDept() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getCreateDept, insActivityRoomInfo.getCreateDept());
        }
        if (insActivityRoomInfo.getCreateTime() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getCreateTime, insActivityRoomInfo.getCreateTime());
        }
        if (insActivityRoomInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getUpdateUser, insActivityRoomInfo.getUpdateUser());
        }
        if (insActivityRoomInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getUpdateTime, insActivityRoomInfo.getUpdateTime());
        }
        if (insActivityRoomInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getIsDeleted, insActivityRoomInfo.getIsDeleted());
        }
        if (insActivityRoomInfo.getStatus() != null) {
            queryWrapper.eq(InsActivityRoomInfo::getStatus, insActivityRoomInfo.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insActivityRoomInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityRoomInfo insert(InsActivityRoomInfo insActivityRoomInfo) {
        insActivityRoomInfo.setId(null);
        getBaseMapper().insert(insActivityRoomInfo);
        return insActivityRoomInfo;
    }

    /**
    * 更新数据
    *
    * @param insActivityRoomInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityRoomInfo update(InsActivityRoomInfo insActivityRoomInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsActivityRoomInfo> chainWrapper = new LambdaUpdateChainWrapper<InsActivityRoomInfo>(getBaseMapper());
        if (insActivityRoomInfo.getId() != null) {
            chainWrapper.set(InsActivityRoomInfo::getId, insActivityRoomInfo.getId());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getTenantId())) {
            chainWrapper.set(InsActivityRoomInfo::getTenantId, insActivityRoomInfo.getTenantId());
        }
        if (insActivityRoomInfo.getCorpId() != null) {
            chainWrapper.set(InsActivityRoomInfo::getCorpId, insActivityRoomInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getCorpName())) {
            chainWrapper.set(InsActivityRoomInfo::getCorpName, insActivityRoomInfo.getCorpName());
        }
        if (insActivityRoomInfo.getInstitutionId() != null) {
            chainWrapper.set(InsActivityRoomInfo::getInstitutionId, insActivityRoomInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getInstitutionName())) {
            chainWrapper.set(InsActivityRoomInfo::getInstitutionName, insActivityRoomInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getRoomName())) {
            chainWrapper.set(InsActivityRoomInfo::getRoomName, insActivityRoomInfo.getRoomName());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getRoomCode())) {
            chainWrapper.set(InsActivityRoomInfo::getRoomCode, insActivityRoomInfo.getRoomCode());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getRoomPic())) {
            chainWrapper.set(InsActivityRoomInfo::getRoomPic, insActivityRoomInfo.getRoomPic());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getShowPics())) {
            chainWrapper.set(InsActivityRoomInfo::getShowPics, insActivityRoomInfo.getShowPics());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getRoomFacilities())) {
            chainWrapper.set(InsActivityRoomInfo::getRoomFacilities, insActivityRoomInfo.getRoomFacilities());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getRoomIntroduce())) {
            chainWrapper.set(InsActivityRoomInfo::getRoomIntroduce, insActivityRoomInfo.getRoomIntroduce());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getManager())) {
            chainWrapper.set(InsActivityRoomInfo::getManager, insActivityRoomInfo.getManager());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getLinkTel())) {
            chainWrapper.set(InsActivityRoomInfo::getLinkTel, insActivityRoomInfo.getLinkTel());
        }
        if (insActivityRoomInfo.getPlaceArea() != null) {
            chainWrapper.set(InsActivityRoomInfo::getPlaceArea, insActivityRoomInfo.getPlaceArea());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getOpenTime())) {
            chainWrapper.set(InsActivityRoomInfo::getOpenTime, insActivityRoomInfo.getOpenTime());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getCloseTime())) {
            chainWrapper.set(InsActivityRoomInfo::getCloseTime, insActivityRoomInfo.getCloseTime());
        }
        if (insActivityRoomInfo.getCapacity() != null) {
            chainWrapper.set(InsActivityRoomInfo::getCapacity, insActivityRoomInfo.getCapacity());
        }
        if (insActivityRoomInfo.getUseState() != null) {
            chainWrapper.set(InsActivityRoomInfo::getUseState, insActivityRoomInfo.getUseState());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getRemark())) {
            chainWrapper.set(InsActivityRoomInfo::getRemark, insActivityRoomInfo.getRemark());
        }
        if (insActivityRoomInfo.getCreateUser() != null) {
            chainWrapper.set(InsActivityRoomInfo::getCreateUser, insActivityRoomInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insActivityRoomInfo.getCreateName())) {
            chainWrapper.set(InsActivityRoomInfo::getCreateName, insActivityRoomInfo.getCreateName());
        }
        if (insActivityRoomInfo.getCreateDept() != null) {
            chainWrapper.set(InsActivityRoomInfo::getCreateDept, insActivityRoomInfo.getCreateDept());
        }
        if (insActivityRoomInfo.getCreateTime() != null) {
            chainWrapper.set(InsActivityRoomInfo::getCreateTime, insActivityRoomInfo.getCreateTime());
        }
        if (insActivityRoomInfo.getUpdateUser() != null) {
            chainWrapper.set(InsActivityRoomInfo::getUpdateUser, insActivityRoomInfo.getUpdateUser());
        }
        if (insActivityRoomInfo.getUpdateTime() != null) {
            chainWrapper.set(InsActivityRoomInfo::getUpdateTime, insActivityRoomInfo.getUpdateTime());
        }
        if (insActivityRoomInfo.getIsDeleted() != null) {
            chainWrapper.set(InsActivityRoomInfo::getIsDeleted, insActivityRoomInfo.getIsDeleted());
        }
        if (insActivityRoomInfo.getStatus() != null) {
            chainWrapper.set(InsActivityRoomInfo::getStatus, insActivityRoomInfo.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsActivityRoomInfo::getId, insActivityRoomInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insActivityRoomInfo.getId());
        } else {
            return insActivityRoomInfo;
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
    public boolean saveInsActivityRoomInfoBatch(List<InsActivityRoomInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsActivityRoomInfo insActivityRoomInfo : insertList) {
            //使用默认的雪花算法生成
            insActivityRoomInfo.setId(null);
            //insActivityRoomInfo.setCreatedDt(currentDte);
            //insActivityRoomInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsActivityRoomInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsActivityRoomInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


