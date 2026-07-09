package cn.pluss.platform.service.insLogisticsMaterialOut.impl;

import cn.pluss.platform.mapper.InsLogisticsMaterialOutMapper;
import cn.pluss.platform.model.entity.InsLogisticsMaterialOut;
import cn.pluss.platform.service.insLogisticsMaterialOut.InsLogisticsMaterialOutService;
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
@Service("insLogisticsMaterialOutService")
public class InsLogisticsMaterialOutServiceImpl extends ServiceImpl< InsLogisticsMaterialOutMapper, InsLogisticsMaterialOut> implements InsLogisticsMaterialOutService {
    private static final Logger logger = LoggerFactory.getLogger(InsLogisticsMaterialOutServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsLogisticsMaterialOut> queryPage(Map map) {
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
    public InsLogisticsMaterialOut queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsMaterialOut 实例对象
    * @return 实例对象
    */
    @Override
    public InsLogisticsMaterialOut queryOne(InsLogisticsMaterialOut insLogisticsMaterialOut){
        LambdaQueryWrapper<InsLogisticsMaterialOut> queryWrapper = getQueryWrapper(insLogisticsMaterialOut);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsMaterialOut
    * @return
    */
    @Override
    public List<InsLogisticsMaterialOut> queryList(InsLogisticsMaterialOut insLogisticsMaterialOut) {
        LambdaQueryWrapper<InsLogisticsMaterialOut> queryWrapper = getQueryWrapper(insLogisticsMaterialOut);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insLogisticsMaterialOut
    * @return
    */
    public static LambdaQueryWrapper<InsLogisticsMaterialOut> getQueryWrapper(InsLogisticsMaterialOut insLogisticsMaterialOut){
        LambdaQueryWrapper<InsLogisticsMaterialOut> queryWrapper = new LambdaQueryWrapper<>();
        if (insLogisticsMaterialOut.getId() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getId, insLogisticsMaterialOut.getId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialOut.getTenantId())) {
            queryWrapper.eq(InsLogisticsMaterialOut::getTenantId, insLogisticsMaterialOut.getTenantId());
        }
        if (insLogisticsMaterialOut.getCorpId() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getCorpId, insLogisticsMaterialOut.getCorpId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialOut.getCorpName())) {
            queryWrapper.eq(InsLogisticsMaterialOut::getCorpName, insLogisticsMaterialOut.getCorpName());
        }
        if (insLogisticsMaterialOut.getInstitutionId() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getInstitutionId, insLogisticsMaterialOut.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialOut.getInstitutionName())) {
            queryWrapper.eq(InsLogisticsMaterialOut::getInstitutionName, insLogisticsMaterialOut.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialOut.getOutCode())) {
            queryWrapper.eq(InsLogisticsMaterialOut::getOutCode, insLogisticsMaterialOut.getOutCode());
        }
        if (insLogisticsMaterialOut.getOutType() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getOutType, insLogisticsMaterialOut.getOutType());
        }
        if (insLogisticsMaterialOut.getMaterialId() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getMaterialId, insLogisticsMaterialOut.getMaterialId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialOut.getMaterialName())) {
            queryWrapper.eq(InsLogisticsMaterialOut::getMaterialName, insLogisticsMaterialOut.getMaterialName());
        }
        if (insLogisticsMaterialOut.getOutTime() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getOutTime, insLogisticsMaterialOut.getOutTime());
        }
        if (insLogisticsMaterialOut.getOutNum() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getOutNum, insLogisticsMaterialOut.getOutNum());
        }
        if (insLogisticsMaterialOut.getStaffId() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getStaffId, insLogisticsMaterialOut.getStaffId());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialOut.getStaffName())) {
            queryWrapper.eq(InsLogisticsMaterialOut::getStaffName, insLogisticsMaterialOut.getStaffName());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialOut.getNeckDepartment())) {
            queryWrapper.eq(InsLogisticsMaterialOut::getNeckDepartment, insLogisticsMaterialOut.getNeckDepartment());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialOut.getRemark())) {
            queryWrapper.eq(InsLogisticsMaterialOut::getRemark, insLogisticsMaterialOut.getRemark());
        }
        if (insLogisticsMaterialOut.getState() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getState, insLogisticsMaterialOut.getState());
        }
        if (insLogisticsMaterialOut.getReturnTime() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getReturnTime, insLogisticsMaterialOut.getReturnTime());
        }
        if (insLogisticsMaterialOut.getCreateUser() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getCreateUser, insLogisticsMaterialOut.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insLogisticsMaterialOut.getCreateName())) {
            queryWrapper.eq(InsLogisticsMaterialOut::getCreateName, insLogisticsMaterialOut.getCreateName());
        }
        if (insLogisticsMaterialOut.getCreateDept() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getCreateDept, insLogisticsMaterialOut.getCreateDept());
        }
        if (insLogisticsMaterialOut.getCreateTime() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getCreateTime, insLogisticsMaterialOut.getCreateTime());
        }
        if (insLogisticsMaterialOut.getUpdateUser() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getUpdateUser, insLogisticsMaterialOut.getUpdateUser());
        }
        if (insLogisticsMaterialOut.getUpdateTime() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getUpdateTime, insLogisticsMaterialOut.getUpdateTime());
        }
        if (insLogisticsMaterialOut.getIsDeleted() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getIsDeleted, insLogisticsMaterialOut.getIsDeleted());
        }
        if (insLogisticsMaterialOut.getStatus() != null) {
            queryWrapper.eq(InsLogisticsMaterialOut::getStatus, insLogisticsMaterialOut.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insLogisticsMaterialOut 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsMaterialOut insert(InsLogisticsMaterialOut insLogisticsMaterialOut) {
        insLogisticsMaterialOut.setId(null);
        getBaseMapper().insert(insLogisticsMaterialOut);
        return insLogisticsMaterialOut;
    }

    /**
    * 更新数据
    *
    * @param insLogisticsMaterialOut 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsLogisticsMaterialOut update(InsLogisticsMaterialOut insLogisticsMaterialOut) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsLogisticsMaterialOut> chainWrapper = new LambdaUpdateChainWrapper<InsLogisticsMaterialOut>(getBaseMapper());
        if (insLogisticsMaterialOut.getId() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getId, insLogisticsMaterialOut.getId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialOut.getTenantId())) {
            chainWrapper.set(InsLogisticsMaterialOut::getTenantId, insLogisticsMaterialOut.getTenantId());
        }
        if (insLogisticsMaterialOut.getCorpId() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getCorpId, insLogisticsMaterialOut.getCorpId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialOut.getCorpName())) {
            chainWrapper.set(InsLogisticsMaterialOut::getCorpName, insLogisticsMaterialOut.getCorpName());
        }
        if (insLogisticsMaterialOut.getInstitutionId() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getInstitutionId, insLogisticsMaterialOut.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialOut.getInstitutionName())) {
            chainWrapper.set(InsLogisticsMaterialOut::getInstitutionName, insLogisticsMaterialOut.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialOut.getOutCode())) {
            chainWrapper.set(InsLogisticsMaterialOut::getOutCode, insLogisticsMaterialOut.getOutCode());
        }
        if (insLogisticsMaterialOut.getOutType() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getOutType, insLogisticsMaterialOut.getOutType());
        }
        if (insLogisticsMaterialOut.getMaterialId() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getMaterialId, insLogisticsMaterialOut.getMaterialId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialOut.getMaterialName())) {
            chainWrapper.set(InsLogisticsMaterialOut::getMaterialName, insLogisticsMaterialOut.getMaterialName());
        }
        if (insLogisticsMaterialOut.getOutTime() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getOutTime, insLogisticsMaterialOut.getOutTime());
        }
        if (insLogisticsMaterialOut.getOutNum() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getOutNum, insLogisticsMaterialOut.getOutNum());
        }
        if (insLogisticsMaterialOut.getStaffId() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getStaffId, insLogisticsMaterialOut.getStaffId());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialOut.getStaffName())) {
            chainWrapper.set(InsLogisticsMaterialOut::getStaffName, insLogisticsMaterialOut.getStaffName());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialOut.getNeckDepartment())) {
            chainWrapper.set(InsLogisticsMaterialOut::getNeckDepartment, insLogisticsMaterialOut.getNeckDepartment());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialOut.getRemark())) {
            chainWrapper.set(InsLogisticsMaterialOut::getRemark, insLogisticsMaterialOut.getRemark());
        }
        if (insLogisticsMaterialOut.getState() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getState, insLogisticsMaterialOut.getState());
        }
        if (insLogisticsMaterialOut.getReturnTime() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getReturnTime, insLogisticsMaterialOut.getReturnTime());
        }
        if (insLogisticsMaterialOut.getCreateUser() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getCreateUser, insLogisticsMaterialOut.getCreateUser());
        }
        if (StringUtil.isNotBlank(insLogisticsMaterialOut.getCreateName())) {
            chainWrapper.set(InsLogisticsMaterialOut::getCreateName, insLogisticsMaterialOut.getCreateName());
        }
        if (insLogisticsMaterialOut.getCreateDept() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getCreateDept, insLogisticsMaterialOut.getCreateDept());
        }
        if (insLogisticsMaterialOut.getCreateTime() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getCreateTime, insLogisticsMaterialOut.getCreateTime());
        }
        if (insLogisticsMaterialOut.getUpdateUser() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getUpdateUser, insLogisticsMaterialOut.getUpdateUser());
        }
        if (insLogisticsMaterialOut.getUpdateTime() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getUpdateTime, insLogisticsMaterialOut.getUpdateTime());
        }
        if (insLogisticsMaterialOut.getIsDeleted() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getIsDeleted, insLogisticsMaterialOut.getIsDeleted());
        }
        if (insLogisticsMaterialOut.getStatus() != null) {
            chainWrapper.set(InsLogisticsMaterialOut::getStatus, insLogisticsMaterialOut.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsLogisticsMaterialOut::getId, insLogisticsMaterialOut.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insLogisticsMaterialOut.getId());
        } else {
            return insLogisticsMaterialOut;
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
    public boolean saveInsLogisticsMaterialOutBatch(List<InsLogisticsMaterialOut> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsLogisticsMaterialOut insLogisticsMaterialOut : insertList) {
            //使用默认的雪花算法生成
            insLogisticsMaterialOut.setId(null);
            //insLogisticsMaterialOut.setCreatedDt(currentDte);
            //insLogisticsMaterialOut.setUpdatedDt(currentDte);
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
    public Integer deleteInsLogisticsMaterialOutBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsLogisticsMaterialOut> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


