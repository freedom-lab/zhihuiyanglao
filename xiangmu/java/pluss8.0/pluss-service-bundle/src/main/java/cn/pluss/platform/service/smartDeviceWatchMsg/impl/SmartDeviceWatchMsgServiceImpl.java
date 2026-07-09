package cn.pluss.platform.service.smartDeviceWatchMsg.impl;

import cn.pluss.platform.mapper.SmartDeviceWatchMsgMapper;
import cn.pluss.platform.model.entity.SmartDeviceWatchMsg;
import cn.pluss.platform.service.smartDeviceWatchMsg.SmartDeviceWatchMsgService;
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
@Service("smartDeviceWatchMsgService")
public class SmartDeviceWatchMsgServiceImpl extends ServiceImpl< SmartDeviceWatchMsgMapper, SmartDeviceWatchMsg> implements SmartDeviceWatchMsgService {
    private static final Logger logger = LoggerFactory.getLogger(SmartDeviceWatchMsgServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<SmartDeviceWatchMsg> queryPage(Map map) {
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
    public SmartDeviceWatchMsg queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceWatchMsg 实例对象
    * @return 实例对象
    */
    @Override
    public SmartDeviceWatchMsg queryOne(SmartDeviceWatchMsg smartDeviceWatchMsg){
        LambdaQueryWrapper<SmartDeviceWatchMsg> queryWrapper = getQueryWrapper(smartDeviceWatchMsg);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceWatchMsg
    * @return
    */
    @Override
    public List<SmartDeviceWatchMsg> queryList(SmartDeviceWatchMsg smartDeviceWatchMsg) {
        LambdaQueryWrapper<SmartDeviceWatchMsg> queryWrapper = getQueryWrapper(smartDeviceWatchMsg);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param smartDeviceWatchMsg
    * @return
    */
    public static LambdaQueryWrapper<SmartDeviceWatchMsg> getQueryWrapper(SmartDeviceWatchMsg smartDeviceWatchMsg){
        LambdaQueryWrapper<SmartDeviceWatchMsg> queryWrapper = new LambdaQueryWrapper<>();
        if (smartDeviceWatchMsg.getId() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getId, smartDeviceWatchMsg.getId());
        }
        if (StringUtil.isNotEmpty(smartDeviceWatchMsg.getTenantId())) {
            queryWrapper.eq(SmartDeviceWatchMsg::getTenantId, smartDeviceWatchMsg.getTenantId());
        }
        if (smartDeviceWatchMsg.getCorpId() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getCorpId, smartDeviceWatchMsg.getCorpId());
        }
        if (StringUtil.isNotEmpty(smartDeviceWatchMsg.getCorpName())) {
            queryWrapper.eq(SmartDeviceWatchMsg::getCorpName, smartDeviceWatchMsg.getCorpName());
        }
        if (smartDeviceWatchMsg.getInstitutionId() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getInstitutionId, smartDeviceWatchMsg.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(smartDeviceWatchMsg.getInstitutionName())) {
            queryWrapper.eq(SmartDeviceWatchMsg::getInstitutionName, smartDeviceWatchMsg.getInstitutionName());
        }
        if (smartDeviceWatchMsg.getStaffId() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getStaffId, smartDeviceWatchMsg.getStaffId());
        }
        if (StringUtil.isNotEmpty(smartDeviceWatchMsg.getDeviceSerial())) {
            queryWrapper.eq(SmartDeviceWatchMsg::getDeviceSerial, smartDeviceWatchMsg.getDeviceSerial());
        }
        if (StringUtil.isNotEmpty(smartDeviceWatchMsg.getPushMsg())) {
            queryWrapper.eq(SmartDeviceWatchMsg::getPushMsg, smartDeviceWatchMsg.getPushMsg());
        }
        if (smartDeviceWatchMsg.getPushState() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getPushState, smartDeviceWatchMsg.getPushState());
        }
        if (smartDeviceWatchMsg.getPushTime() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getPushTime, smartDeviceWatchMsg.getPushTime());
        }
        if (StringUtil.isNotEmpty(smartDeviceWatchMsg.getRemark())) {
            queryWrapper.eq(SmartDeviceWatchMsg::getRemark, smartDeviceWatchMsg.getRemark());
        }
        if (smartDeviceWatchMsg.getCreateUser() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getCreateUser, smartDeviceWatchMsg.getCreateUser());
        }
        if (StringUtil.isNotEmpty(smartDeviceWatchMsg.getCreateName())) {
            queryWrapper.eq(SmartDeviceWatchMsg::getCreateName, smartDeviceWatchMsg.getCreateName());
        }
        if (smartDeviceWatchMsg.getCreateDept() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getCreateDept, smartDeviceWatchMsg.getCreateDept());
        }
        if (smartDeviceWatchMsg.getCreateTime() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getCreateTime, smartDeviceWatchMsg.getCreateTime());
        }
        if (smartDeviceWatchMsg.getUpdateUser() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getUpdateUser, smartDeviceWatchMsg.getUpdateUser());
        }
        if (smartDeviceWatchMsg.getUpdateTime() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getUpdateTime, smartDeviceWatchMsg.getUpdateTime());
        }
        if (smartDeviceWatchMsg.getIsDeleted() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getIsDeleted, smartDeviceWatchMsg.getIsDeleted());
        }
        if (smartDeviceWatchMsg.getStatus() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getStatus, smartDeviceWatchMsg.getStatus());
        }
        if (smartDeviceWatchMsg.getAlarmId() != null) {
            queryWrapper.eq(SmartDeviceWatchMsg::getAlarmId, smartDeviceWatchMsg.getAlarmId());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param smartDeviceWatchMsg 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceWatchMsg insert(SmartDeviceWatchMsg smartDeviceWatchMsg) {
        smartDeviceWatchMsg.setId(null);
        getBaseMapper().insert(smartDeviceWatchMsg);
        return smartDeviceWatchMsg;
    }

    /**
    * 更新数据
    *
    * @param smartDeviceWatchMsg 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public SmartDeviceWatchMsg update(SmartDeviceWatchMsg smartDeviceWatchMsg) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<SmartDeviceWatchMsg> chainWrapper = new LambdaUpdateChainWrapper<SmartDeviceWatchMsg>(getBaseMapper());
        if (smartDeviceWatchMsg.getId() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getId, smartDeviceWatchMsg.getId());
        }
        if (StringUtil.isNotBlank(smartDeviceWatchMsg.getTenantId())) {
            chainWrapper.set(SmartDeviceWatchMsg::getTenantId, smartDeviceWatchMsg.getTenantId());
        }
        if (smartDeviceWatchMsg.getCorpId() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getCorpId, smartDeviceWatchMsg.getCorpId());
        }
        if (StringUtil.isNotBlank(smartDeviceWatchMsg.getCorpName())) {
            chainWrapper.set(SmartDeviceWatchMsg::getCorpName, smartDeviceWatchMsg.getCorpName());
        }
        if (smartDeviceWatchMsg.getInstitutionId() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getInstitutionId, smartDeviceWatchMsg.getInstitutionId());
        }
        if (StringUtil.isNotBlank(smartDeviceWatchMsg.getInstitutionName())) {
            chainWrapper.set(SmartDeviceWatchMsg::getInstitutionName, smartDeviceWatchMsg.getInstitutionName());
        }
        if (smartDeviceWatchMsg.getStaffId() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getStaffId, smartDeviceWatchMsg.getStaffId());
        }
        if (StringUtil.isNotBlank(smartDeviceWatchMsg.getDeviceSerial())) {
            chainWrapper.set(SmartDeviceWatchMsg::getDeviceSerial, smartDeviceWatchMsg.getDeviceSerial());
        }
        if (StringUtil.isNotBlank(smartDeviceWatchMsg.getPushMsg())) {
            chainWrapper.set(SmartDeviceWatchMsg::getPushMsg, smartDeviceWatchMsg.getPushMsg());
        }
        if (smartDeviceWatchMsg.getPushState() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getPushState, smartDeviceWatchMsg.getPushState());
        }
        if (smartDeviceWatchMsg.getPushTime() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getPushTime, smartDeviceWatchMsg.getPushTime());
        }
        if (StringUtil.isNotBlank(smartDeviceWatchMsg.getRemark())) {
            chainWrapper.set(SmartDeviceWatchMsg::getRemark, smartDeviceWatchMsg.getRemark());
        }
        if (smartDeviceWatchMsg.getCreateUser() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getCreateUser, smartDeviceWatchMsg.getCreateUser());
        }
        if (StringUtil.isNotBlank(smartDeviceWatchMsg.getCreateName())) {
            chainWrapper.set(SmartDeviceWatchMsg::getCreateName, smartDeviceWatchMsg.getCreateName());
        }
        if (smartDeviceWatchMsg.getCreateDept() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getCreateDept, smartDeviceWatchMsg.getCreateDept());
        }
        if (smartDeviceWatchMsg.getCreateTime() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getCreateTime, smartDeviceWatchMsg.getCreateTime());
        }
        if (smartDeviceWatchMsg.getUpdateUser() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getUpdateUser, smartDeviceWatchMsg.getUpdateUser());
        }
        if (smartDeviceWatchMsg.getUpdateTime() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getUpdateTime, smartDeviceWatchMsg.getUpdateTime());
        }
        if (smartDeviceWatchMsg.getIsDeleted() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getIsDeleted, smartDeviceWatchMsg.getIsDeleted());
        }
        if (smartDeviceWatchMsg.getStatus() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getStatus, smartDeviceWatchMsg.getStatus());
        }
        if (smartDeviceWatchMsg.getAlarmId() != null) {
            chainWrapper.set(SmartDeviceWatchMsg::getAlarmId, smartDeviceWatchMsg.getAlarmId());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(SmartDeviceWatchMsg::getId, smartDeviceWatchMsg.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(smartDeviceWatchMsg.getId());
        } else {
            return smartDeviceWatchMsg;
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
    public boolean saveSmartDeviceWatchMsgBatch(List<SmartDeviceWatchMsg> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (SmartDeviceWatchMsg smartDeviceWatchMsg : insertList) {
            //使用默认的雪花算法生成
            smartDeviceWatchMsg.setId(null);
            //smartDeviceWatchMsg.setCreatedDt(currentDte);
            //smartDeviceWatchMsg.setUpdatedDt(currentDte);
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
    public Integer deleteSmartDeviceWatchMsgBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<SmartDeviceWatchMsg> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


