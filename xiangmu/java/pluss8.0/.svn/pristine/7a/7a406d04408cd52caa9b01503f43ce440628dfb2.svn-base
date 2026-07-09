package cn.pluss.platform.service.leaseContractRemind.impl;

import cn.pluss.platform.mapper.LeaseContractRemindMapper;
import cn.pluss.platform.model.entity.LeaseContractRemind;
import cn.pluss.platform.service.leaseContractRemind.LeaseContractRemindService;
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
@Service("leaseContractRemindService")
public class LeaseContractRemindServiceImpl extends ServiceImpl< LeaseContractRemindMapper, LeaseContractRemind> implements LeaseContractRemindService {
    private static final Logger logger = LoggerFactory.getLogger(LeaseContractRemindServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<LeaseContractRemind> queryPage(Map map) {
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
    public LeaseContractRemind queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param leaseContractRemind 实例对象
    * @return 实例对象
    */
    @Override
    public LeaseContractRemind queryOne(LeaseContractRemind leaseContractRemind){
        LambdaQueryWrapper<LeaseContractRemind> queryWrapper = getQueryWrapper(leaseContractRemind);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param leaseContractRemind
    * @return
    */
    @Override
    public List<LeaseContractRemind> queryList(LeaseContractRemind leaseContractRemind) {
        LambdaQueryWrapper<LeaseContractRemind> queryWrapper = getQueryWrapper(leaseContractRemind);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param leaseContractRemind
    * @return
    */
    public static LambdaQueryWrapper<LeaseContractRemind> getQueryWrapper(LeaseContractRemind leaseContractRemind){
        LambdaQueryWrapper<LeaseContractRemind> queryWrapper = new LambdaQueryWrapper<>();
        if (leaseContractRemind.getId() != null) {
            queryWrapper.eq(LeaseContractRemind::getId, leaseContractRemind.getId());
        }
        if (StringUtil.isNotEmpty(leaseContractRemind.getTenantId())) {
            queryWrapper.eq(LeaseContractRemind::getTenantId, leaseContractRemind.getTenantId());
        }
        if (leaseContractRemind.getCorpId() != null) {
            queryWrapper.eq(LeaseContractRemind::getCorpId, leaseContractRemind.getCorpId());
        }
        if (leaseContractRemind.getInstitutionId() != null) {
            queryWrapper.eq(LeaseContractRemind::getInstitutionId, leaseContractRemind.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(leaseContractRemind.getInstitutionName())) {
            queryWrapper.eq(LeaseContractRemind::getInstitutionName, leaseContractRemind.getInstitutionName());
        }
        if (leaseContractRemind.getRemindDay() != null) {
            queryWrapper.eq(LeaseContractRemind::getRemindDay, leaseContractRemind.getRemindDay());
        }
        if (leaseContractRemind.getCreateUser() != null) {
            queryWrapper.eq(LeaseContractRemind::getCreateUser, leaseContractRemind.getCreateUser());
        }
        if (leaseContractRemind.getCreateDept() != null) {
            queryWrapper.eq(LeaseContractRemind::getCreateDept, leaseContractRemind.getCreateDept());
        }
        if (leaseContractRemind.getCreateTime() != null) {
            queryWrapper.eq(LeaseContractRemind::getCreateTime, leaseContractRemind.getCreateTime());
        }
        if (leaseContractRemind.getUpdateUser() != null) {
            queryWrapper.eq(LeaseContractRemind::getUpdateUser, leaseContractRemind.getUpdateUser());
        }
        if (leaseContractRemind.getUpdateTime() != null) {
            queryWrapper.eq(LeaseContractRemind::getUpdateTime, leaseContractRemind.getUpdateTime());
        }
        if (leaseContractRemind.getStatus() != null) {
            queryWrapper.eq(LeaseContractRemind::getStatus, leaseContractRemind.getStatus());
        }
        if (leaseContractRemind.getIsDeleted() != null) {
            queryWrapper.eq(LeaseContractRemind::getIsDeleted, leaseContractRemind.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param leaseContractRemind 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public LeaseContractRemind insert(LeaseContractRemind leaseContractRemind) {
        leaseContractRemind.setId(null);
        getBaseMapper().insert(leaseContractRemind);
        return leaseContractRemind;
    }

    /**
    * 更新数据
    *
    * @param leaseContractRemind 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public LeaseContractRemind update(LeaseContractRemind leaseContractRemind) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<LeaseContractRemind> chainWrapper = new LambdaUpdateChainWrapper<LeaseContractRemind>(getBaseMapper());
        if (leaseContractRemind.getId() != null) {
            chainWrapper.set(LeaseContractRemind::getId, leaseContractRemind.getId());
        }
        if (StringUtil.isNotBlank(leaseContractRemind.getTenantId())) {
            chainWrapper.set(LeaseContractRemind::getTenantId, leaseContractRemind.getTenantId());
        }
        if (leaseContractRemind.getCorpId() != null) {
            chainWrapper.set(LeaseContractRemind::getCorpId, leaseContractRemind.getCorpId());
        }
        if (leaseContractRemind.getInstitutionId() != null) {
            chainWrapper.set(LeaseContractRemind::getInstitutionId, leaseContractRemind.getInstitutionId());
        }
        if (StringUtil.isNotBlank(leaseContractRemind.getInstitutionName())) {
            chainWrapper.set(LeaseContractRemind::getInstitutionName, leaseContractRemind.getInstitutionName());
        }
        if (leaseContractRemind.getRemindDay() != null) {
            chainWrapper.set(LeaseContractRemind::getRemindDay, leaseContractRemind.getRemindDay());
        }
        if (leaseContractRemind.getCreateUser() != null) {
            chainWrapper.set(LeaseContractRemind::getCreateUser, leaseContractRemind.getCreateUser());
        }
        if (leaseContractRemind.getCreateDept() != null) {
            chainWrapper.set(LeaseContractRemind::getCreateDept, leaseContractRemind.getCreateDept());
        }
        if (leaseContractRemind.getCreateTime() != null) {
            chainWrapper.set(LeaseContractRemind::getCreateTime, leaseContractRemind.getCreateTime());
        }
        if (leaseContractRemind.getUpdateUser() != null) {
            chainWrapper.set(LeaseContractRemind::getUpdateUser, leaseContractRemind.getUpdateUser());
        }
        if (leaseContractRemind.getUpdateTime() != null) {
            chainWrapper.set(LeaseContractRemind::getUpdateTime, leaseContractRemind.getUpdateTime());
        }
        if (leaseContractRemind.getStatus() != null) {
            chainWrapper.set(LeaseContractRemind::getStatus, leaseContractRemind.getStatus());
        }
        if (leaseContractRemind.getIsDeleted() != null) {
            chainWrapper.set(LeaseContractRemind::getIsDeleted, leaseContractRemind.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(LeaseContractRemind::getId, leaseContractRemind.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(leaseContractRemind.getId());
        } else {
            return leaseContractRemind;
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
    public boolean saveLeaseContractRemindBatch(List<LeaseContractRemind> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (LeaseContractRemind leaseContractRemind : insertList) {
            //使用默认的雪花算法生成
            leaseContractRemind.setId(null);
            //leaseContractRemind.setCreatedDt(currentDte);
            //leaseContractRemind.setUpdatedDt(currentDte);
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
    public Integer deleteLeaseContractRemindBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<LeaseContractRemind> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


