package cn.pluss.platform.service.insBaseLeaveRefundSetting.impl;

import cn.pluss.platform.mapper.InsBaseLeaveRefundSettingMapper;
import cn.pluss.platform.model.entity.InsBaseLeaveRefundSetting;
import cn.pluss.platform.service.insBaseLeaveRefundSetting.InsBaseLeaveRefundSettingService;
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
@Service("insBaseLeaveRefundSettingService")
public class InsBaseLeaveRefundSettingServiceImpl extends ServiceImpl< InsBaseLeaveRefundSettingMapper, InsBaseLeaveRefundSetting> implements InsBaseLeaveRefundSettingService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseLeaveRefundSettingServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseLeaveRefundSetting> queryPage(Map map) {
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
    public InsBaseLeaveRefundSetting queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseLeaveRefundSetting 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseLeaveRefundSetting queryOne(InsBaseLeaveRefundSetting insBaseLeaveRefundSetting){
        LambdaQueryWrapper<InsBaseLeaveRefundSetting> queryWrapper = getQueryWrapper(insBaseLeaveRefundSetting);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseLeaveRefundSetting
    * @return
    */
    @Override
    public List<InsBaseLeaveRefundSetting> queryList(InsBaseLeaveRefundSetting insBaseLeaveRefundSetting) {
        LambdaQueryWrapper<InsBaseLeaveRefundSetting> queryWrapper = getQueryWrapper(insBaseLeaveRefundSetting);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseLeaveRefundSetting
    * @return
    */
    public static LambdaQueryWrapper<InsBaseLeaveRefundSetting> getQueryWrapper(InsBaseLeaveRefundSetting insBaseLeaveRefundSetting){
        LambdaQueryWrapper<InsBaseLeaveRefundSetting> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseLeaveRefundSetting.getId() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getId, insBaseLeaveRefundSetting.getId());
        }
        if (StringUtil.isNotEmpty(insBaseLeaveRefundSetting.getTenantId())) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getTenantId, insBaseLeaveRefundSetting.getTenantId());
        }
        if (insBaseLeaveRefundSetting.getCorpId() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getCorpId, insBaseLeaveRefundSetting.getCorpId());
        }
        if (StringUtil.isNotEmpty(insBaseLeaveRefundSetting.getCorpName())) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getCorpName, insBaseLeaveRefundSetting.getCorpName());
        }
        if (insBaseLeaveRefundSetting.getInstitutionId() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getInstitutionId, insBaseLeaveRefundSetting.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insBaseLeaveRefundSetting.getInstitutionName())) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getInstitutionName, insBaseLeaveRefundSetting.getInstitutionName());
        }
        if (insBaseLeaveRefundSetting.getCostId() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getCostId, insBaseLeaveRefundSetting.getCostId());
        }
        if (StringUtil.isNotEmpty(insBaseLeaveRefundSetting.getCostCode())) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getCostCode, insBaseLeaveRefundSetting.getCostCode());
        }
        if (StringUtil.isNotEmpty(insBaseLeaveRefundSetting.getCostName())) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getCostName, insBaseLeaveRefundSetting.getCostName());
        }
        if (StringUtil.isNotEmpty(insBaseLeaveRefundSetting.getRemark())) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getRemark, insBaseLeaveRefundSetting.getRemark());
        }
        if (insBaseLeaveRefundSetting.getCreateUser() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getCreateUser, insBaseLeaveRefundSetting.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseLeaveRefundSetting.getCreateName())) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getCreateName, insBaseLeaveRefundSetting.getCreateName());
        }
        if (insBaseLeaveRefundSetting.getCreateDept() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getCreateDept, insBaseLeaveRefundSetting.getCreateDept());
        }
        if (insBaseLeaveRefundSetting.getCreateTime() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getCreateTime, insBaseLeaveRefundSetting.getCreateTime());
        }
        if (insBaseLeaveRefundSetting.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getUpdateUser, insBaseLeaveRefundSetting.getUpdateUser());
        }
        if (insBaseLeaveRefundSetting.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getUpdateTime, insBaseLeaveRefundSetting.getUpdateTime());
        }
        if (insBaseLeaveRefundSetting.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getIsDeleted, insBaseLeaveRefundSetting.getIsDeleted());
        }
        if (insBaseLeaveRefundSetting.getStatus() != null) {
            queryWrapper.eq(InsBaseLeaveRefundSetting::getStatus, insBaseLeaveRefundSetting.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseLeaveRefundSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseLeaveRefundSetting insert(InsBaseLeaveRefundSetting insBaseLeaveRefundSetting) {
        insBaseLeaveRefundSetting.setId(null);
        getBaseMapper().insert(insBaseLeaveRefundSetting);
        return insBaseLeaveRefundSetting;
    }

    /**
    * 更新数据
    *
    * @param insBaseLeaveRefundSetting 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseLeaveRefundSetting update(InsBaseLeaveRefundSetting insBaseLeaveRefundSetting) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseLeaveRefundSetting> chainWrapper = new LambdaUpdateChainWrapper<InsBaseLeaveRefundSetting>(getBaseMapper());
        if (insBaseLeaveRefundSetting.getId() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getId, insBaseLeaveRefundSetting.getId());
        }
        if (StringUtil.isNotBlank(insBaseLeaveRefundSetting.getTenantId())) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getTenantId, insBaseLeaveRefundSetting.getTenantId());
        }
        if (insBaseLeaveRefundSetting.getCorpId() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getCorpId, insBaseLeaveRefundSetting.getCorpId());
        }
        if (StringUtil.isNotBlank(insBaseLeaveRefundSetting.getCorpName())) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getCorpName, insBaseLeaveRefundSetting.getCorpName());
        }
        if (insBaseLeaveRefundSetting.getInstitutionId() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getInstitutionId, insBaseLeaveRefundSetting.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insBaseLeaveRefundSetting.getInstitutionName())) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getInstitutionName, insBaseLeaveRefundSetting.getInstitutionName());
        }
        if (insBaseLeaveRefundSetting.getCostId() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getCostId, insBaseLeaveRefundSetting.getCostId());
        }
        if (StringUtil.isNotBlank(insBaseLeaveRefundSetting.getCostCode())) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getCostCode, insBaseLeaveRefundSetting.getCostCode());
        }
        if (StringUtil.isNotBlank(insBaseLeaveRefundSetting.getCostName())) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getCostName, insBaseLeaveRefundSetting.getCostName());
        }
        if (StringUtil.isNotBlank(insBaseLeaveRefundSetting.getRemark())) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getRemark, insBaseLeaveRefundSetting.getRemark());
        }
        if (insBaseLeaveRefundSetting.getCreateUser() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getCreateUser, insBaseLeaveRefundSetting.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseLeaveRefundSetting.getCreateName())) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getCreateName, insBaseLeaveRefundSetting.getCreateName());
        }
        if (insBaseLeaveRefundSetting.getCreateDept() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getCreateDept, insBaseLeaveRefundSetting.getCreateDept());
        }
        if (insBaseLeaveRefundSetting.getCreateTime() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getCreateTime, insBaseLeaveRefundSetting.getCreateTime());
        }
        if (insBaseLeaveRefundSetting.getUpdateUser() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getUpdateUser, insBaseLeaveRefundSetting.getUpdateUser());
        }
        if (insBaseLeaveRefundSetting.getUpdateTime() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getUpdateTime, insBaseLeaveRefundSetting.getUpdateTime());
        }
        if (insBaseLeaveRefundSetting.getIsDeleted() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getIsDeleted, insBaseLeaveRefundSetting.getIsDeleted());
        }
        if (insBaseLeaveRefundSetting.getStatus() != null) {
            chainWrapper.set(InsBaseLeaveRefundSetting::getStatus, insBaseLeaveRefundSetting.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseLeaveRefundSetting::getId, insBaseLeaveRefundSetting.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseLeaveRefundSetting.getId());
        } else {
            return insBaseLeaveRefundSetting;
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
    public boolean saveInsBaseLeaveRefundSettingBatch(List<InsBaseLeaveRefundSetting> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseLeaveRefundSetting insBaseLeaveRefundSetting : insertList) {
            //使用默认的雪花算法生成
            insBaseLeaveRefundSetting.setId(null);
            //insBaseLeaveRefundSetting.setCreatedDt(currentDte);
            //insBaseLeaveRefundSetting.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseLeaveRefundSettingBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseLeaveRefundSetting> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


