package cn.pluss.platform.service.insActivityRoomReserve.impl;

import cn.pluss.platform.mapper.InsActivityRoomReserveMapper;
import cn.pluss.platform.model.entity.InsActivityRoomReserve;
import cn.pluss.platform.service.insActivityRoomReserve.InsActivityRoomReserveService;
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
@Service("insActivityRoomReserveService")
public class InsActivityRoomReserveServiceImpl extends ServiceImpl< InsActivityRoomReserveMapper, InsActivityRoomReserve> implements InsActivityRoomReserveService {
    private static final Logger logger = LoggerFactory.getLogger(InsActivityRoomReserveServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsActivityRoomReserve> queryPage(Map map) {
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
    public InsActivityRoomReserve queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insActivityRoomReserve 实例对象
    * @return 实例对象
    */
    @Override
    public InsActivityRoomReserve queryOne(InsActivityRoomReserve insActivityRoomReserve){
        LambdaQueryWrapper<InsActivityRoomReserve> queryWrapper = getQueryWrapper(insActivityRoomReserve);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insActivityRoomReserve
    * @return
    */
    @Override
    public List<InsActivityRoomReserve> queryList(InsActivityRoomReserve insActivityRoomReserve) {
        LambdaQueryWrapper<InsActivityRoomReserve> queryWrapper = getQueryWrapper(insActivityRoomReserve);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insActivityRoomReserve
    * @return
    */
    public static LambdaQueryWrapper<InsActivityRoomReserve> getQueryWrapper(InsActivityRoomReserve insActivityRoomReserve){
        LambdaQueryWrapper<InsActivityRoomReserve> queryWrapper = new LambdaQueryWrapper<>();
        if (insActivityRoomReserve.getId() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getId, insActivityRoomReserve.getId());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getTenantId())) {
            queryWrapper.eq(InsActivityRoomReserve::getTenantId, insActivityRoomReserve.getTenantId());
        }
        if (insActivityRoomReserve.getCorpId() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getCorpId, insActivityRoomReserve.getCorpId());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getCorpName())) {
            queryWrapper.eq(InsActivityRoomReserve::getCorpName, insActivityRoomReserve.getCorpName());
        }
        if (insActivityRoomReserve.getInstitutionId() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getInstitutionId, insActivityRoomReserve.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getInstitutionName())) {
            queryWrapper.eq(InsActivityRoomReserve::getInstitutionName, insActivityRoomReserve.getInstitutionName());
        }
        if (insActivityRoomReserve.getRoomId() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getRoomId, insActivityRoomReserve.getRoomId());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getRoomName())) {
            queryWrapper.eq(InsActivityRoomReserve::getRoomName, insActivityRoomReserve.getRoomName());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getPersonnelName())) {
            queryWrapper.eq(InsActivityRoomReserve::getPersonnelName, insActivityRoomReserve.getPersonnelName());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getLinkTel())) {
            queryWrapper.eq(InsActivityRoomReserve::getLinkTel, insActivityRoomReserve.getLinkTel());
        }
        if (insActivityRoomReserve.getReserveDate() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getReserveDate, insActivityRoomReserve.getReserveDate());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getReserveStartTime())) {
            queryWrapper.eq(InsActivityRoomReserve::getReserveStartTime, insActivityRoomReserve.getReserveStartTime());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getReserveEndTime())) {
            queryWrapper.eq(InsActivityRoomReserve::getReserveEndTime, insActivityRoomReserve.getReserveEndTime());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getReserveType())) {
            queryWrapper.eq(InsActivityRoomReserve::getReserveType, insActivityRoomReserve.getReserveType());
        }
        if (insActivityRoomReserve.getPersonNum() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getPersonNum, insActivityRoomReserve.getPersonNum());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getPurpose())) {
            queryWrapper.eq(InsActivityRoomReserve::getPurpose, insActivityRoomReserve.getPurpose());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getUseState())) {
            queryWrapper.eq(InsActivityRoomReserve::getUseState, insActivityRoomReserve.getUseState());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getRemarks())) {
            queryWrapper.eq(InsActivityRoomReserve::getRemarks, insActivityRoomReserve.getRemarks());
        }
        if (insActivityRoomReserve.getCreateUser() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getCreateUser, insActivityRoomReserve.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insActivityRoomReserve.getCreateName())) {
            queryWrapper.eq(InsActivityRoomReserve::getCreateName, insActivityRoomReserve.getCreateName());
        }
        if (insActivityRoomReserve.getCreateDept() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getCreateDept, insActivityRoomReserve.getCreateDept());
        }
        if (insActivityRoomReserve.getCreateTime() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getCreateTime, insActivityRoomReserve.getCreateTime());
        }
        if (insActivityRoomReserve.getUpdateUser() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getUpdateUser, insActivityRoomReserve.getUpdateUser());
        }
        if (insActivityRoomReserve.getUpdateTime() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getUpdateTime, insActivityRoomReserve.getUpdateTime());
        }
        if (insActivityRoomReserve.getIsDeleted() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getIsDeleted, insActivityRoomReserve.getIsDeleted());
        }
        if (insActivityRoomReserve.getStatus() != null) {
            queryWrapper.eq(InsActivityRoomReserve::getStatus, insActivityRoomReserve.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insActivityRoomReserve 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityRoomReserve insert(InsActivityRoomReserve insActivityRoomReserve) {
        insActivityRoomReserve.setId(null);
        getBaseMapper().insert(insActivityRoomReserve);
        return insActivityRoomReserve;
    }

    /**
    * 更新数据
    *
    * @param insActivityRoomReserve 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsActivityRoomReserve update(InsActivityRoomReserve insActivityRoomReserve) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsActivityRoomReserve> chainWrapper = new LambdaUpdateChainWrapper<InsActivityRoomReserve>(getBaseMapper());
        if (insActivityRoomReserve.getId() != null) {
            chainWrapper.set(InsActivityRoomReserve::getId, insActivityRoomReserve.getId());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getTenantId())) {
            chainWrapper.set(InsActivityRoomReserve::getTenantId, insActivityRoomReserve.getTenantId());
        }
        if (insActivityRoomReserve.getCorpId() != null) {
            chainWrapper.set(InsActivityRoomReserve::getCorpId, insActivityRoomReserve.getCorpId());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getCorpName())) {
            chainWrapper.set(InsActivityRoomReserve::getCorpName, insActivityRoomReserve.getCorpName());
        }
        if (insActivityRoomReserve.getInstitutionId() != null) {
            chainWrapper.set(InsActivityRoomReserve::getInstitutionId, insActivityRoomReserve.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getInstitutionName())) {
            chainWrapper.set(InsActivityRoomReserve::getInstitutionName, insActivityRoomReserve.getInstitutionName());
        }
        if (insActivityRoomReserve.getRoomId() != null) {
            chainWrapper.set(InsActivityRoomReserve::getRoomId, insActivityRoomReserve.getRoomId());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getRoomName())) {
            chainWrapper.set(InsActivityRoomReserve::getRoomName, insActivityRoomReserve.getRoomName());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getPersonnelName())) {
            chainWrapper.set(InsActivityRoomReserve::getPersonnelName, insActivityRoomReserve.getPersonnelName());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getLinkTel())) {
            chainWrapper.set(InsActivityRoomReserve::getLinkTel, insActivityRoomReserve.getLinkTel());
        }
        if (insActivityRoomReserve.getReserveDate() != null) {
            chainWrapper.set(InsActivityRoomReserve::getReserveDate, insActivityRoomReserve.getReserveDate());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getReserveStartTime())) {
            chainWrapper.set(InsActivityRoomReserve::getReserveStartTime, insActivityRoomReserve.getReserveStartTime());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getReserveEndTime())) {
            chainWrapper.set(InsActivityRoomReserve::getReserveEndTime, insActivityRoomReserve.getReserveEndTime());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getReserveType())) {
            chainWrapper.set(InsActivityRoomReserve::getReserveType, insActivityRoomReserve.getReserveType());
        }
        if (insActivityRoomReserve.getPersonNum() != null) {
            chainWrapper.set(InsActivityRoomReserve::getPersonNum, insActivityRoomReserve.getPersonNum());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getPurpose())) {
            chainWrapper.set(InsActivityRoomReserve::getPurpose, insActivityRoomReserve.getPurpose());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getUseState())) {
            chainWrapper.set(InsActivityRoomReserve::getUseState, insActivityRoomReserve.getUseState());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getRemarks())) {
            chainWrapper.set(InsActivityRoomReserve::getRemarks, insActivityRoomReserve.getRemarks());
        }
        if (insActivityRoomReserve.getCreateUser() != null) {
            chainWrapper.set(InsActivityRoomReserve::getCreateUser, insActivityRoomReserve.getCreateUser());
        }
        if (StringUtil.isNotBlank(insActivityRoomReserve.getCreateName())) {
            chainWrapper.set(InsActivityRoomReserve::getCreateName, insActivityRoomReserve.getCreateName());
        }
        if (insActivityRoomReserve.getCreateDept() != null) {
            chainWrapper.set(InsActivityRoomReserve::getCreateDept, insActivityRoomReserve.getCreateDept());
        }
        if (insActivityRoomReserve.getCreateTime() != null) {
            chainWrapper.set(InsActivityRoomReserve::getCreateTime, insActivityRoomReserve.getCreateTime());
        }
        if (insActivityRoomReserve.getUpdateUser() != null) {
            chainWrapper.set(InsActivityRoomReserve::getUpdateUser, insActivityRoomReserve.getUpdateUser());
        }
        if (insActivityRoomReserve.getUpdateTime() != null) {
            chainWrapper.set(InsActivityRoomReserve::getUpdateTime, insActivityRoomReserve.getUpdateTime());
        }
        if (insActivityRoomReserve.getIsDeleted() != null) {
            chainWrapper.set(InsActivityRoomReserve::getIsDeleted, insActivityRoomReserve.getIsDeleted());
        }
        if (insActivityRoomReserve.getStatus() != null) {
            chainWrapper.set(InsActivityRoomReserve::getStatus, insActivityRoomReserve.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsActivityRoomReserve::getId, insActivityRoomReserve.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insActivityRoomReserve.getId());
        } else {
            return insActivityRoomReserve;
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
    public boolean saveInsActivityRoomReserveBatch(List<InsActivityRoomReserve> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsActivityRoomReserve insActivityRoomReserve : insertList) {
            //使用默认的雪花算法生成
            insActivityRoomReserve.setId(null);
            //insActivityRoomReserve.setCreatedDt(currentDte);
            //insActivityRoomReserve.setUpdatedDt(currentDte);
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
    public Integer deleteInsActivityRoomReserveBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsActivityRoomReserve> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


