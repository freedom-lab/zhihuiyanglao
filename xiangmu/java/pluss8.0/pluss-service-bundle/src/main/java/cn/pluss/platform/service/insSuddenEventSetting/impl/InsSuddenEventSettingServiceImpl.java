package cn.pluss.platform.service.insSuddenEventSetting.impl;

import cn.pluss.platform.mapper.InsSuddenEventSettingMapper;
import cn.pluss.platform.model.entity.InsSuddenEventSetting;
import cn.pluss.platform.service.insSuddenEventSetting.InsSuddenEventSettingService;
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
@Service("insSuddenEventSettingService")
public class InsSuddenEventSettingServiceImpl extends ServiceImpl< InsSuddenEventSettingMapper, InsSuddenEventSetting> implements InsSuddenEventSettingService {
    private static final Logger logger = LoggerFactory.getLogger(InsSuddenEventSettingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSuddenEventSetting> queryPage(Map map) {
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
    public InsSuddenEventSetting queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSuddenEventSetting 实例对象
    * @return 实例对象
    */
    @Override
    public InsSuddenEventSetting queryOne(InsSuddenEventSetting insSuddenEventSetting){
        LambdaQueryWrapper<InsSuddenEventSetting> queryWrapper = getQueryWrapper(insSuddenEventSetting);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSuddenEventSetting
    * @return
    */
    @Override
    public List<InsSuddenEventSetting> queryList(InsSuddenEventSetting insSuddenEventSetting) {
        LambdaQueryWrapper<InsSuddenEventSetting> queryWrapper = getQueryWrapper(insSuddenEventSetting);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSuddenEventSetting
    * @return
    */
    public static LambdaQueryWrapper<InsSuddenEventSetting> getQueryWrapper(InsSuddenEventSetting insSuddenEventSetting){
        LambdaQueryWrapper<InsSuddenEventSetting> queryWrapper = new LambdaQueryWrapper<>();
        if (insSuddenEventSetting.getId() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getId, insSuddenEventSetting.getId());
        }
        if (StringUtil.isNotEmpty(insSuddenEventSetting.getTenantId())) {
            queryWrapper.eq(InsSuddenEventSetting::getTenantId, insSuddenEventSetting.getTenantId());
        }
        if (insSuddenEventSetting.getCorpId() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getCorpId, insSuddenEventSetting.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSuddenEventSetting.getCorpName())) {
            queryWrapper.eq(InsSuddenEventSetting::getCorpName, insSuddenEventSetting.getCorpName());
        }
        if (insSuddenEventSetting.getInstitutionId() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getInstitutionId, insSuddenEventSetting.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSuddenEventSetting.getInstitutionName())) {
            queryWrapper.eq(InsSuddenEventSetting::getInstitutionName, insSuddenEventSetting.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSuddenEventSetting.getEventType())) {
            queryWrapper.eq(InsSuddenEventSetting::getEventType, insSuddenEventSetting.getEventType());
        }
        if (StringUtil.isNotEmpty(insSuddenEventSetting.getPlanName())) {
            queryWrapper.eq(InsSuddenEventSetting::getPlanName, insSuddenEventSetting.getPlanName());
        }
        if (StringUtil.isNotEmpty(insSuddenEventSetting.getPlanMemo())) {
            queryWrapper.eq(InsSuddenEventSetting::getPlanMemo, insSuddenEventSetting.getPlanMemo());
        }
        if (StringUtil.isNotEmpty(insSuddenEventSetting.getRemark())) {
            queryWrapper.eq(InsSuddenEventSetting::getRemark, insSuddenEventSetting.getRemark());
        }
        if (insSuddenEventSetting.getCreateUser() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getCreateUser, insSuddenEventSetting.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSuddenEventSetting.getCreateName())) {
            queryWrapper.eq(InsSuddenEventSetting::getCreateName, insSuddenEventSetting.getCreateName());
        }
        if (insSuddenEventSetting.getCreateDept() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getCreateDept, insSuddenEventSetting.getCreateDept());
        }
        if (insSuddenEventSetting.getCreateTime() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getCreateTime, insSuddenEventSetting.getCreateTime());
        }
        if (insSuddenEventSetting.getUpdateUser() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getUpdateUser, insSuddenEventSetting.getUpdateUser());
        }
        if (insSuddenEventSetting.getUpdateTime() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getUpdateTime, insSuddenEventSetting.getUpdateTime());
        }
        if (insSuddenEventSetting.getIsDeleted() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getIsDeleted, insSuddenEventSetting.getIsDeleted());
        }
        if (insSuddenEventSetting.getStatus() != null) {
            queryWrapper.eq(InsSuddenEventSetting::getStatus, insSuddenEventSetting.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSuddenEventSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenEventSetting insert(InsSuddenEventSetting insSuddenEventSetting) {
        insSuddenEventSetting.setId(null);
        getBaseMapper().insert(insSuddenEventSetting);
        return insSuddenEventSetting;
    }

    /**
    * 更新数据
    *
    * @param insSuddenEventSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSuddenEventSetting update(InsSuddenEventSetting insSuddenEventSetting) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSuddenEventSetting> chainWrapper = new LambdaUpdateChainWrapper<InsSuddenEventSetting>(getBaseMapper());
        if (insSuddenEventSetting.getId() != null) {
            chainWrapper.set(InsSuddenEventSetting::getId, insSuddenEventSetting.getId());
        }
        if (StringUtil.isNotBlank(insSuddenEventSetting.getTenantId())) {
            chainWrapper.set(InsSuddenEventSetting::getTenantId, insSuddenEventSetting.getTenantId());
        }
        if (insSuddenEventSetting.getCorpId() != null) {
            chainWrapper.set(InsSuddenEventSetting::getCorpId, insSuddenEventSetting.getCorpId());
        }
        if (StringUtil.isNotBlank(insSuddenEventSetting.getCorpName())) {
            chainWrapper.set(InsSuddenEventSetting::getCorpName, insSuddenEventSetting.getCorpName());
        }
        if (insSuddenEventSetting.getInstitutionId() != null) {
            chainWrapper.set(InsSuddenEventSetting::getInstitutionId, insSuddenEventSetting.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSuddenEventSetting.getInstitutionName())) {
            chainWrapper.set(InsSuddenEventSetting::getInstitutionName, insSuddenEventSetting.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSuddenEventSetting.getEventType())) {
            chainWrapper.set(InsSuddenEventSetting::getEventType, insSuddenEventSetting.getEventType());
        }
        if (StringUtil.isNotBlank(insSuddenEventSetting.getPlanName())) {
            chainWrapper.set(InsSuddenEventSetting::getPlanName, insSuddenEventSetting.getPlanName());
        }
        if (StringUtil.isNotBlank(insSuddenEventSetting.getPlanMemo())) {
            chainWrapper.set(InsSuddenEventSetting::getPlanMemo, insSuddenEventSetting.getPlanMemo());
        }
        if (StringUtil.isNotBlank(insSuddenEventSetting.getRemark())) {
            chainWrapper.set(InsSuddenEventSetting::getRemark, insSuddenEventSetting.getRemark());
        }
        if (insSuddenEventSetting.getCreateUser() != null) {
            chainWrapper.set(InsSuddenEventSetting::getCreateUser, insSuddenEventSetting.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSuddenEventSetting.getCreateName())) {
            chainWrapper.set(InsSuddenEventSetting::getCreateName, insSuddenEventSetting.getCreateName());
        }
        if (insSuddenEventSetting.getCreateDept() != null) {
            chainWrapper.set(InsSuddenEventSetting::getCreateDept, insSuddenEventSetting.getCreateDept());
        }
        if (insSuddenEventSetting.getCreateTime() != null) {
            chainWrapper.set(InsSuddenEventSetting::getCreateTime, insSuddenEventSetting.getCreateTime());
        }
        if (insSuddenEventSetting.getUpdateUser() != null) {
            chainWrapper.set(InsSuddenEventSetting::getUpdateUser, insSuddenEventSetting.getUpdateUser());
        }
        if (insSuddenEventSetting.getUpdateTime() != null) {
            chainWrapper.set(InsSuddenEventSetting::getUpdateTime, insSuddenEventSetting.getUpdateTime());
        }
        if (insSuddenEventSetting.getIsDeleted() != null) {
            chainWrapper.set(InsSuddenEventSetting::getIsDeleted, insSuddenEventSetting.getIsDeleted());
        }
        if (insSuddenEventSetting.getStatus() != null) {
            chainWrapper.set(InsSuddenEventSetting::getStatus, insSuddenEventSetting.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSuddenEventSetting::getId, insSuddenEventSetting.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSuddenEventSetting.getId());
        } else {
            return insSuddenEventSetting;
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
    public boolean saveInsSuddenEventSettingBatch(List<InsSuddenEventSetting> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSuddenEventSetting insSuddenEventSetting : insertList) {
            //使用默认的雪花算法生成
            insSuddenEventSetting.setId(null);
            //insSuddenEventSetting.setCreatedDt(currentDte);
            //insSuddenEventSetting.setUpdatedDt(currentDte);
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
    public Integer deleteInsSuddenEventSettingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSuddenEventSetting> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


