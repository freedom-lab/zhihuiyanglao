package cn.pluss.platform.service.insNursingPlanRoom.impl;

import cn.pluss.platform.mapper.InsNursingPlanRoomMapper;
import cn.pluss.platform.model.entity.InsNursingPlanRoom;
import cn.pluss.platform.service.insNursingPlanRoom.InsNursingPlanRoomService;
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
@Service("insNursingPlanRoomService")
public class InsNursingPlanRoomServiceImpl extends ServiceImpl< InsNursingPlanRoomMapper, InsNursingPlanRoom> implements InsNursingPlanRoomService {
    private static final Logger logger = LoggerFactory.getLogger(InsNursingPlanRoomServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsNursingPlanRoom> queryPage(Map map) {
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
    public InsNursingPlanRoom queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingPlanRoom 实例对象
    * @return 实例对象
    */
    @Override
    public InsNursingPlanRoom queryOne(InsNursingPlanRoom insNursingPlanRoom){
        LambdaQueryWrapper<InsNursingPlanRoom> queryWrapper = getQueryWrapper(insNursingPlanRoom);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insNursingPlanRoom
    * @return
    */
    @Override
    public List<InsNursingPlanRoom> queryList(InsNursingPlanRoom insNursingPlanRoom) {
        LambdaQueryWrapper<InsNursingPlanRoom> queryWrapper = getQueryWrapper(insNursingPlanRoom);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insNursingPlanRoom
    * @return
    */
    public static LambdaQueryWrapper<InsNursingPlanRoom> getQueryWrapper(InsNursingPlanRoom insNursingPlanRoom){
        LambdaQueryWrapper<InsNursingPlanRoom> queryWrapper = new LambdaQueryWrapper<>();
        if (insNursingPlanRoom.getId() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getId, insNursingPlanRoom.getId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoom.getTenantId())) {
            queryWrapper.eq(InsNursingPlanRoom::getTenantId, insNursingPlanRoom.getTenantId());
        }
        if (insNursingPlanRoom.getCorpId() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getCorpId, insNursingPlanRoom.getCorpId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoom.getCorpName())) {
            queryWrapper.eq(InsNursingPlanRoom::getCorpName, insNursingPlanRoom.getCorpName());
        }
        if (insNursingPlanRoom.getInstitutionId() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getInstitutionId, insNursingPlanRoom.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoom.getInstitutionName())) {
            queryWrapper.eq(InsNursingPlanRoom::getInstitutionName, insNursingPlanRoom.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoom.getPlanName())) {
            queryWrapper.eq(InsNursingPlanRoom::getPlanName, insNursingPlanRoom.getPlanName());
        }
        if (insNursingPlanRoom.getStartDate() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getStartDate, insNursingPlanRoom.getStartDate());
        }
        if (insNursingPlanRoom.getEndDate() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getEndDate, insNursingPlanRoom.getEndDate());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoom.getTimeSlot())) {
            queryWrapper.eq(InsNursingPlanRoom::getTimeSlot, insNursingPlanRoom.getTimeSlot());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoom.getRemark())) {
            queryWrapper.eq(InsNursingPlanRoom::getRemark, insNursingPlanRoom.getRemark());
        }
        if (insNursingPlanRoom.getCreateUser() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getCreateUser, insNursingPlanRoom.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insNursingPlanRoom.getCreateName())) {
            queryWrapper.eq(InsNursingPlanRoom::getCreateName, insNursingPlanRoom.getCreateName());
        }
        if (insNursingPlanRoom.getCreateDept() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getCreateDept, insNursingPlanRoom.getCreateDept());
        }
        if (insNursingPlanRoom.getCreateTime() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getCreateTime, insNursingPlanRoom.getCreateTime());
        }
        if (insNursingPlanRoom.getUpdateUser() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getUpdateUser, insNursingPlanRoom.getUpdateUser());
        }
        if (insNursingPlanRoom.getUpdateTime() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getUpdateTime, insNursingPlanRoom.getUpdateTime());
        }
        if (insNursingPlanRoom.getIsDeleted() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getIsDeleted, insNursingPlanRoom.getIsDeleted());
        }
        if (insNursingPlanRoom.getStatus() != null) {
            queryWrapper.eq(InsNursingPlanRoom::getStatus, insNursingPlanRoom.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insNursingPlanRoom 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingPlanRoom insert(InsNursingPlanRoom insNursingPlanRoom) {
        insNursingPlanRoom.setId(null);
        getBaseMapper().insert(insNursingPlanRoom);
        return insNursingPlanRoom;
    }

    /**
    * 更新数据
    *
    * @param insNursingPlanRoom 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsNursingPlanRoom update(InsNursingPlanRoom insNursingPlanRoom) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsNursingPlanRoom> chainWrapper = new LambdaUpdateChainWrapper<InsNursingPlanRoom>(getBaseMapper());
        if (insNursingPlanRoom.getId() != null) {
            chainWrapper.set(InsNursingPlanRoom::getId, insNursingPlanRoom.getId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoom.getTenantId())) {
            chainWrapper.set(InsNursingPlanRoom::getTenantId, insNursingPlanRoom.getTenantId());
        }
        if (insNursingPlanRoom.getCorpId() != null) {
            chainWrapper.set(InsNursingPlanRoom::getCorpId, insNursingPlanRoom.getCorpId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoom.getCorpName())) {
            chainWrapper.set(InsNursingPlanRoom::getCorpName, insNursingPlanRoom.getCorpName());
        }
        if (insNursingPlanRoom.getInstitutionId() != null) {
            chainWrapper.set(InsNursingPlanRoom::getInstitutionId, insNursingPlanRoom.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoom.getInstitutionName())) {
            chainWrapper.set(InsNursingPlanRoom::getInstitutionName, insNursingPlanRoom.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoom.getPlanName())) {
            chainWrapper.set(InsNursingPlanRoom::getPlanName, insNursingPlanRoom.getPlanName());
        }
        if (insNursingPlanRoom.getStartDate() != null) {
            chainWrapper.set(InsNursingPlanRoom::getStartDate, insNursingPlanRoom.getStartDate());
        }
        if (insNursingPlanRoom.getEndDate() != null) {
            chainWrapper.set(InsNursingPlanRoom::getEndDate, insNursingPlanRoom.getEndDate());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoom.getTimeSlot())) {
            chainWrapper.set(InsNursingPlanRoom::getTimeSlot, insNursingPlanRoom.getTimeSlot());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoom.getRemark())) {
            chainWrapper.set(InsNursingPlanRoom::getRemark, insNursingPlanRoom.getRemark());
        }
        if (insNursingPlanRoom.getCreateUser() != null) {
            chainWrapper.set(InsNursingPlanRoom::getCreateUser, insNursingPlanRoom.getCreateUser());
        }
        if (StringUtil.isNotBlank(insNursingPlanRoom.getCreateName())) {
            chainWrapper.set(InsNursingPlanRoom::getCreateName, insNursingPlanRoom.getCreateName());
        }
        if (insNursingPlanRoom.getCreateDept() != null) {
            chainWrapper.set(InsNursingPlanRoom::getCreateDept, insNursingPlanRoom.getCreateDept());
        }
        if (insNursingPlanRoom.getCreateTime() != null) {
            chainWrapper.set(InsNursingPlanRoom::getCreateTime, insNursingPlanRoom.getCreateTime());
        }
        if (insNursingPlanRoom.getUpdateUser() != null) {
            chainWrapper.set(InsNursingPlanRoom::getUpdateUser, insNursingPlanRoom.getUpdateUser());
        }
        if (insNursingPlanRoom.getUpdateTime() != null) {
            chainWrapper.set(InsNursingPlanRoom::getUpdateTime, insNursingPlanRoom.getUpdateTime());
        }
        if (insNursingPlanRoom.getIsDeleted() != null) {
            chainWrapper.set(InsNursingPlanRoom::getIsDeleted, insNursingPlanRoom.getIsDeleted());
        }
        if (insNursingPlanRoom.getStatus() != null) {
            chainWrapper.set(InsNursingPlanRoom::getStatus, insNursingPlanRoom.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsNursingPlanRoom::getId, insNursingPlanRoom.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insNursingPlanRoom.getId());
        } else {
            return insNursingPlanRoom;
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
    public boolean saveInsNursingPlanRoomBatch(List<InsNursingPlanRoom> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsNursingPlanRoom insNursingPlanRoom : insertList) {
            //使用默认的雪花算法生成
            insNursingPlanRoom.setId(null);
            //insNursingPlanRoom.setCreatedDt(currentDte);
            //insNursingPlanRoom.setUpdatedDt(currentDte);
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
    public Integer deleteInsNursingPlanRoomBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsNursingPlanRoom> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


