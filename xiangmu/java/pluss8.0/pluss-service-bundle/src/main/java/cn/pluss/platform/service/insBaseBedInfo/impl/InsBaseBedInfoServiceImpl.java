package cn.pluss.platform.service.insBaseBedInfo.impl;

import cn.pluss.platform.mapper.InsBaseBedInfoMapper;
import cn.pluss.platform.model.entity.InsBaseBedInfo;
import cn.pluss.platform.service.insBaseBedInfo.InsBaseBedInfoService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Transactional
@Service("insBaseBedInfoService")
public class InsBaseBedInfoServiceImpl extends ServiceImpl< InsBaseBedInfoMapper, InsBaseBedInfo> implements InsBaseBedInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseBedInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseBedInfo> queryPage(Map map) {
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
    public InsBaseBedInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseBedInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseBedInfo queryOne(InsBaseBedInfo insBaseBedInfo){
        LambdaQueryWrapper<InsBaseBedInfo> queryWrapper = getQueryWrapper(insBaseBedInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseBedInfo
    * @return
    */
    @Override
    public List<InsBaseBedInfo> queryList(InsBaseBedInfo insBaseBedInfo) {
        LambdaQueryWrapper<InsBaseBedInfo> queryWrapper = getQueryWrapper(insBaseBedInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseBedInfo
    * @return
    */
    public static LambdaQueryWrapper<InsBaseBedInfo> getQueryWrapper(InsBaseBedInfo insBaseBedInfo){
        LambdaQueryWrapper<InsBaseBedInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseBedInfo.getId() != null) {
            queryWrapper.eq(InsBaseBedInfo::getId, insBaseBedInfo.getId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getTenantId())) {
            queryWrapper.eq(InsBaseBedInfo::getTenantId, insBaseBedInfo.getTenantId());
        }
        if (insBaseBedInfo.getCorpId() != null) {
            queryWrapper.eq(InsBaseBedInfo::getCorpId, insBaseBedInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getCorpName())) {
            queryWrapper.eq(InsBaseBedInfo::getCorpName, insBaseBedInfo.getCorpName());
        }
        if (insBaseBedInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsBaseBedInfo::getInstitutionId, insBaseBedInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getInstitutionName())) {
            queryWrapper.eq(InsBaseBedInfo::getInstitutionName, insBaseBedInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getBedName())) {
            queryWrapper.eq(InsBaseBedInfo::getBedName, insBaseBedInfo.getBedName());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getBedCode())) {
            queryWrapper.eq(InsBaseBedInfo::getBedCode, insBaseBedInfo.getBedCode());
        }
        if (insBaseBedInfo.getBedDayPrice() != null) {
            queryWrapper.eq(InsBaseBedInfo::getBedDayPrice, insBaseBedInfo.getBedDayPrice());
        }
        if (insBaseBedInfo.getBedMonthPrice() != null) {
            queryWrapper.eq(InsBaseBedInfo::getBedMonthPrice, insBaseBedInfo.getBedMonthPrice());
        }
        if (insBaseBedInfo.getBuildingId() != null) {
            queryWrapper.eq(InsBaseBedInfo::getBuildingId, insBaseBedInfo.getBuildingId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getBuildingName())) {
            queryWrapper.eq(InsBaseBedInfo::getBuildingName, insBaseBedInfo.getBuildingName());
        }
        if (insBaseBedInfo.getFloorId() != null) {
            queryWrapper.eq(InsBaseBedInfo::getFloorId, insBaseBedInfo.getFloorId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getFloorName())) {
            queryWrapper.eq(InsBaseBedInfo::getFloorName, insBaseBedInfo.getFloorName());
        }
        if (insBaseBedInfo.getRoomId() != null) {
            queryWrapper.eq(InsBaseBedInfo::getRoomId, insBaseBedInfo.getRoomId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getRoomName())) {
            queryWrapper.eq(InsBaseBedInfo::getRoomName, insBaseBedInfo.getRoomName());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getBedType())) {
            queryWrapper.eq(InsBaseBedInfo::getBedType, insBaseBedInfo.getBedType());
        }
        if (insBaseBedInfo.getBedState() != null) {
            queryWrapper.eq(InsBaseBedInfo::getBedState, insBaseBedInfo.getBedState());
        }
        if (insBaseBedInfo.getSortNum() != null) {
            queryWrapper.eq(InsBaseBedInfo::getSortNum, insBaseBedInfo.getSortNum());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getRemark())) {
            queryWrapper.eq(InsBaseBedInfo::getRemark, insBaseBedInfo.getRemark());
        }
        if (insBaseBedInfo.getCreateUser() != null) {
            queryWrapper.eq(InsBaseBedInfo::getCreateUser, insBaseBedInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getCreateName())) {
            queryWrapper.eq(InsBaseBedInfo::getCreateName, insBaseBedInfo.getCreateName());
        }
        if (insBaseBedInfo.getCreateDept() != null) {
            queryWrapper.eq(InsBaseBedInfo::getCreateDept, insBaseBedInfo.getCreateDept());
        }
        if (insBaseBedInfo.getCreateTime() != null) {
            queryWrapper.eq(InsBaseBedInfo::getCreateTime, insBaseBedInfo.getCreateTime());
        }
        if (insBaseBedInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseBedInfo::getUpdateUser, insBaseBedInfo.getUpdateUser());
        }
        if (insBaseBedInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseBedInfo::getUpdateTime, insBaseBedInfo.getUpdateTime());
        }
        if (insBaseBedInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseBedInfo::getIsDeleted, insBaseBedInfo.getIsDeleted());
        }
        if (insBaseBedInfo.getStatus() != null) {
            queryWrapper.eq(InsBaseBedInfo::getStatus, insBaseBedInfo.getStatus());
        }
        if (insBaseBedInfo.getElderId() != null) {
            queryWrapper.eq(InsBaseBedInfo::getElderId, insBaseBedInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getElderName())) {
            queryWrapper.eq(InsBaseBedInfo::getElderName, insBaseBedInfo.getElderName());
        }
        if (insBaseBedInfo.getAge() != null) {
            queryWrapper.eq(InsBaseBedInfo::getAge, insBaseBedInfo.getAge());
        }
        if (insBaseBedInfo.getNursingLevelId() != null) {
            queryWrapper.eq(InsBaseBedInfo::getNursingLevelId, insBaseBedInfo.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getNursingLevelName())) {
            queryWrapper.eq(InsBaseBedInfo::getNursingLevelName, insBaseBedInfo.getNursingLevelName());
        }
        if (insBaseBedInfo.getCheckDate() != null) {
            queryWrapper.eq(InsBaseBedInfo::getCheckDate, insBaseBedInfo.getCheckDate());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseBedInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseBedInfo insert(InsBaseBedInfo insBaseBedInfo) {
        insBaseBedInfo.setId(null);
        getBaseMapper().insert(insBaseBedInfo);
        return insBaseBedInfo;
    }

    /**
    * 更新数据
    *
    * @param insBaseBedInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseBedInfo update(InsBaseBedInfo insBaseBedInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseBedInfo> chainWrapper = new LambdaUpdateChainWrapper<InsBaseBedInfo>(getBaseMapper());
        if (insBaseBedInfo.getId() != null) {
            chainWrapper.set(InsBaseBedInfo::getId, insBaseBedInfo.getId());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getTenantId())) {
            chainWrapper.set(InsBaseBedInfo::getTenantId, insBaseBedInfo.getTenantId());
        }
        if (insBaseBedInfo.getCorpId() != null) {
            chainWrapper.set(InsBaseBedInfo::getCorpId, insBaseBedInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getCorpName())) {
            chainWrapper.set(InsBaseBedInfo::getCorpName, insBaseBedInfo.getCorpName());
        }
        if (insBaseBedInfo.getInstitutionId() != null) {
            chainWrapper.set(InsBaseBedInfo::getInstitutionId, insBaseBedInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getInstitutionName())) {
            chainWrapper.set(InsBaseBedInfo::getInstitutionName, insBaseBedInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getBedName())) {
            chainWrapper.set(InsBaseBedInfo::getBedName, insBaseBedInfo.getBedName());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getBedCode())) {
            chainWrapper.set(InsBaseBedInfo::getBedCode, insBaseBedInfo.getBedCode());
        }
        if (insBaseBedInfo.getBedDayPrice() != null) {
            chainWrapper.set(InsBaseBedInfo::getBedDayPrice, insBaseBedInfo.getBedDayPrice());
        }
        if (insBaseBedInfo.getBedMonthPrice() != null) {
            chainWrapper.set(InsBaseBedInfo::getBedMonthPrice, insBaseBedInfo.getBedMonthPrice());
        }
        if (insBaseBedInfo.getBuildingId() != null) {
            chainWrapper.set(InsBaseBedInfo::getBuildingId, insBaseBedInfo.getBuildingId());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getBuildingName())) {
            chainWrapper.set(InsBaseBedInfo::getBuildingName, insBaseBedInfo.getBuildingName());
        }
        if (insBaseBedInfo.getFloorId() != null) {
            chainWrapper.set(InsBaseBedInfo::getFloorId, insBaseBedInfo.getFloorId());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getFloorName())) {
            chainWrapper.set(InsBaseBedInfo::getFloorName, insBaseBedInfo.getFloorName());
        }
        if (insBaseBedInfo.getRoomId() != null) {
            chainWrapper.set(InsBaseBedInfo::getRoomId, insBaseBedInfo.getRoomId());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getRoomName())) {
            chainWrapper.set(InsBaseBedInfo::getRoomName, insBaseBedInfo.getRoomName());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getBedType())) {
            chainWrapper.set(InsBaseBedInfo::getBedType, insBaseBedInfo.getBedType());
        }
        if (insBaseBedInfo.getBedState() != null) {
            chainWrapper.set(InsBaseBedInfo::getBedState, insBaseBedInfo.getBedState());
        }
        if (insBaseBedInfo.getSortNum() != null) {
            chainWrapper.set(InsBaseBedInfo::getSortNum, insBaseBedInfo.getSortNum());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getRemark())) {
            chainWrapper.set(InsBaseBedInfo::getRemark, insBaseBedInfo.getRemark());
        }
        if (insBaseBedInfo.getCreateUser() != null) {
            chainWrapper.set(InsBaseBedInfo::getCreateUser, insBaseBedInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseBedInfo.getCreateName())) {
            chainWrapper.set(InsBaseBedInfo::getCreateName, insBaseBedInfo.getCreateName());
        }
        if (insBaseBedInfo.getCreateDept() != null) {
            chainWrapper.set(InsBaseBedInfo::getCreateDept, insBaseBedInfo.getCreateDept());
        }
        if (insBaseBedInfo.getCreateTime() != null) {
            chainWrapper.set(InsBaseBedInfo::getCreateTime, insBaseBedInfo.getCreateTime());
        }
        if (insBaseBedInfo.getUpdateUser() != null) {
            chainWrapper.set(InsBaseBedInfo::getUpdateUser, insBaseBedInfo.getUpdateUser());
        }
        if (insBaseBedInfo.getUpdateTime() != null) {
            chainWrapper.set(InsBaseBedInfo::getUpdateTime, insBaseBedInfo.getUpdateTime());
        }
        if (insBaseBedInfo.getIsDeleted() != null) {
            chainWrapper.set(InsBaseBedInfo::getIsDeleted, insBaseBedInfo.getIsDeleted());
        }
        if (insBaseBedInfo.getStatus() != null) {
            chainWrapper.set(InsBaseBedInfo::getStatus, insBaseBedInfo.getStatus());
        }
        if (insBaseBedInfo.getElderId() != null) {
            chainWrapper.set(InsBaseBedInfo::getElderId, insBaseBedInfo.getElderId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getElderName())) {
            chainWrapper.set(InsBaseBedInfo::getElderName, insBaseBedInfo.getElderName());
        }
        if (insBaseBedInfo.getAge() != null) {
            chainWrapper.set(InsBaseBedInfo::getAge, insBaseBedInfo.getAge());
        }
        if (insBaseBedInfo.getNursingLevelId() != null) {
            chainWrapper.set(InsBaseBedInfo::getNursingLevelId, insBaseBedInfo.getNursingLevelId());
        }
        if (StringUtil.isNotEmpty(insBaseBedInfo.getNursingLevelName())) {
            chainWrapper.set(InsBaseBedInfo::getNursingLevelName, insBaseBedInfo.getNursingLevelName());
        }
        if (insBaseBedInfo.getCheckDate() != null) {
            chainWrapper.set(InsBaseBedInfo::getCheckDate, insBaseBedInfo.getCheckDate());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseBedInfo::getId, insBaseBedInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseBedInfo.getId());
        } else {
            return insBaseBedInfo;
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
    public boolean saveInsBaseBedInfoBatch(List<InsBaseBedInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseBedInfo insBaseBedInfo : insertList) {
            //使用默认的雪花算法生成
            insBaseBedInfo.setId(null);
            //insBaseBedInfo.setCreatedDt(currentDte);
            //insBaseBedInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseBedInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseBedInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<Integer, Long> getBedInfoStatistics() {
        List<InsBaseBedInfo> list = list();
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyMap();
        }
        Map<Integer, Long> collect = list.stream()
                .filter(e -> e.getBedState() != null && e.getBedState() != 5)
                .collect(Collectors.groupingBy(e -> e.getBedState(), Collectors.counting()));
        return collect;
    }

    @Override
    public List<Map<String, Object>> getBedInfoStatisticsCount() {
        // bed_state: 1空闲 2预订 3入住 4试住 5变更占用
        String[] stateNames = {"", "空闲", "预订", "入住", "试住", "变更占用"};
        List<InsBaseBedInfo> list = list();
        Map<Integer, Long> countMap = list.stream()
                .filter(e -> e.getBedState() != null)
                .collect(Collectors.groupingBy(InsBaseBedInfo::getBedState, Collectors.counting()));
        List<Map<String, Object>> result = new java.util.ArrayList<>();
        for (int i = 1; i < stateNames.length; i++) {
            Map<String, Object> item = new java.util.LinkedHashMap<>();
            item.put("category", stateNames[i]);
            item.put("value", countMap.getOrDefault(i, 0L));
            result.add(item);
        }
        return result;
    }

}


