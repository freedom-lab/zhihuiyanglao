package cn.pluss.platform.service.insSchedulingTable.impl;

import cn.pluss.platform.mapper.InsSchedulingTableMapper;
import cn.pluss.platform.model.entity.InsSchedulingTable;
import cn.pluss.platform.service.insSchedulingTable.InsSchedulingTableService;
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
@Service("insSchedulingTableService")
public class InsSchedulingTableServiceImpl extends ServiceImpl< InsSchedulingTableMapper, InsSchedulingTable> implements InsSchedulingTableService {
    private static final Logger logger = LoggerFactory.getLogger(InsSchedulingTableServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsSchedulingTable> queryPage(Map map) {
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
    public InsSchedulingTable queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingTable 实例对象
    * @return 实例对象
    */
    @Override
    public InsSchedulingTable queryOne(InsSchedulingTable insSchedulingTable){
        LambdaQueryWrapper<InsSchedulingTable> queryWrapper = getQueryWrapper(insSchedulingTable);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insSchedulingTable
    * @return
    */
    @Override
    public List<InsSchedulingTable> queryList(InsSchedulingTable insSchedulingTable) {
        LambdaQueryWrapper<InsSchedulingTable> queryWrapper = getQueryWrapper(insSchedulingTable);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insSchedulingTable
    * @return
    */
    public static LambdaQueryWrapper<InsSchedulingTable> getQueryWrapper(InsSchedulingTable insSchedulingTable){
        LambdaQueryWrapper<InsSchedulingTable> queryWrapper = new LambdaQueryWrapper<>();
        if (insSchedulingTable.getId() != null) {
            queryWrapper.eq(InsSchedulingTable::getId, insSchedulingTable.getId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTable.getTenantId())) {
            queryWrapper.eq(InsSchedulingTable::getTenantId, insSchedulingTable.getTenantId());
        }
        if (insSchedulingTable.getCorpId() != null) {
            queryWrapper.eq(InsSchedulingTable::getCorpId, insSchedulingTable.getCorpId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTable.getCorpName())) {
            queryWrapper.eq(InsSchedulingTable::getCorpName, insSchedulingTable.getCorpName());
        }
        if (insSchedulingTable.getInstitutionId() != null) {
            queryWrapper.eq(InsSchedulingTable::getInstitutionId, insSchedulingTable.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insSchedulingTable.getInstitutionName())) {
            queryWrapper.eq(InsSchedulingTable::getInstitutionName, insSchedulingTable.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insSchedulingTable.getTableName())) {
            queryWrapper.eq(InsSchedulingTable::getTableName, insSchedulingTable.getTableName());
        }
        if (StringUtil.isNotEmpty(insSchedulingTable.getWeekNum())) {
            queryWrapper.eq(InsSchedulingTable::getWeekNum, insSchedulingTable.getWeekNum());
        }
        if (insSchedulingTable.getStartDate() != null) {
            queryWrapper.eq(InsSchedulingTable::getStartDate, insSchedulingTable.getStartDate());
        }
        if (insSchedulingTable.getEndDate() != null) {
            queryWrapper.eq(InsSchedulingTable::getEndDate, insSchedulingTable.getEndDate());
        }
        if (StringUtil.isNotEmpty(insSchedulingTable.getRemark())) {
            queryWrapper.eq(InsSchedulingTable::getRemark, insSchedulingTable.getRemark());
        }
        if (insSchedulingTable.getCreateUser() != null) {
            queryWrapper.eq(InsSchedulingTable::getCreateUser, insSchedulingTable.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insSchedulingTable.getCreateName())) {
            queryWrapper.eq(InsSchedulingTable::getCreateName, insSchedulingTable.getCreateName());
        }
        if (insSchedulingTable.getCreateDept() != null) {
            queryWrapper.eq(InsSchedulingTable::getCreateDept, insSchedulingTable.getCreateDept());
        }
        if (insSchedulingTable.getCreateTime() != null) {
            queryWrapper.eq(InsSchedulingTable::getCreateTime, insSchedulingTable.getCreateTime());
        }
        if (insSchedulingTable.getUpdateUser() != null) {
            queryWrapper.eq(InsSchedulingTable::getUpdateUser, insSchedulingTable.getUpdateUser());
        }
        if (insSchedulingTable.getUpdateTime() != null) {
            queryWrapper.eq(InsSchedulingTable::getUpdateTime, insSchedulingTable.getUpdateTime());
        }
        if (insSchedulingTable.getIsDeleted() != null) {
            queryWrapper.eq(InsSchedulingTable::getIsDeleted, insSchedulingTable.getIsDeleted());
        }
        if (insSchedulingTable.getStatus() != null) {
            queryWrapper.eq(InsSchedulingTable::getStatus, insSchedulingTable.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insSchedulingTable 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingTable insert(InsSchedulingTable insSchedulingTable) {
        insSchedulingTable.setId(null);
        getBaseMapper().insert(insSchedulingTable);
        return insSchedulingTable;
    }

    /**
    * 更新数据
    *
    * @param insSchedulingTable 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsSchedulingTable update(InsSchedulingTable insSchedulingTable) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsSchedulingTable> chainWrapper = new LambdaUpdateChainWrapper<InsSchedulingTable>(getBaseMapper());
        if (insSchedulingTable.getId() != null) {
            chainWrapper.set(InsSchedulingTable::getId, insSchedulingTable.getId());
        }
        if (StringUtil.isNotBlank(insSchedulingTable.getTenantId())) {
            chainWrapper.set(InsSchedulingTable::getTenantId, insSchedulingTable.getTenantId());
        }
        if (insSchedulingTable.getCorpId() != null) {
            chainWrapper.set(InsSchedulingTable::getCorpId, insSchedulingTable.getCorpId());
        }
        if (StringUtil.isNotBlank(insSchedulingTable.getCorpName())) {
            chainWrapper.set(InsSchedulingTable::getCorpName, insSchedulingTable.getCorpName());
        }
        if (insSchedulingTable.getInstitutionId() != null) {
            chainWrapper.set(InsSchedulingTable::getInstitutionId, insSchedulingTable.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insSchedulingTable.getInstitutionName())) {
            chainWrapper.set(InsSchedulingTable::getInstitutionName, insSchedulingTable.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insSchedulingTable.getTableName())) {
            chainWrapper.set(InsSchedulingTable::getTableName, insSchedulingTable.getTableName());
        }
        if (StringUtil.isNotBlank(insSchedulingTable.getWeekNum())) {
            chainWrapper.set(InsSchedulingTable::getWeekNum, insSchedulingTable.getWeekNum());
        }
        if (insSchedulingTable.getStartDate() != null) {
            chainWrapper.set(InsSchedulingTable::getStartDate, insSchedulingTable.getStartDate());
        }
        if (insSchedulingTable.getEndDate() != null) {
            chainWrapper.set(InsSchedulingTable::getEndDate, insSchedulingTable.getEndDate());
        }
        if (StringUtil.isNotBlank(insSchedulingTable.getRemark())) {
            chainWrapper.set(InsSchedulingTable::getRemark, insSchedulingTable.getRemark());
        }
        if (insSchedulingTable.getCreateUser() != null) {
            chainWrapper.set(InsSchedulingTable::getCreateUser, insSchedulingTable.getCreateUser());
        }
        if (StringUtil.isNotBlank(insSchedulingTable.getCreateName())) {
            chainWrapper.set(InsSchedulingTable::getCreateName, insSchedulingTable.getCreateName());
        }
        if (insSchedulingTable.getCreateDept() != null) {
            chainWrapper.set(InsSchedulingTable::getCreateDept, insSchedulingTable.getCreateDept());
        }
        if (insSchedulingTable.getCreateTime() != null) {
            chainWrapper.set(InsSchedulingTable::getCreateTime, insSchedulingTable.getCreateTime());
        }
        if (insSchedulingTable.getUpdateUser() != null) {
            chainWrapper.set(InsSchedulingTable::getUpdateUser, insSchedulingTable.getUpdateUser());
        }
        if (insSchedulingTable.getUpdateTime() != null) {
            chainWrapper.set(InsSchedulingTable::getUpdateTime, insSchedulingTable.getUpdateTime());
        }
        if (insSchedulingTable.getIsDeleted() != null) {
            chainWrapper.set(InsSchedulingTable::getIsDeleted, insSchedulingTable.getIsDeleted());
        }
        if (insSchedulingTable.getStatus() != null) {
            chainWrapper.set(InsSchedulingTable::getStatus, insSchedulingTable.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsSchedulingTable::getId, insSchedulingTable.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insSchedulingTable.getId());
        } else {
            return insSchedulingTable;
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
    public boolean saveInsSchedulingTableBatch(List<InsSchedulingTable> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsSchedulingTable insSchedulingTable : insertList) {
            //使用默认的雪花算法生成
            insSchedulingTable.setId(null);
            //insSchedulingTable.setCreatedDt(currentDte);
            //insSchedulingTable.setUpdatedDt(currentDte);
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
    public Integer deleteInsSchedulingTableBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsSchedulingTable> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


