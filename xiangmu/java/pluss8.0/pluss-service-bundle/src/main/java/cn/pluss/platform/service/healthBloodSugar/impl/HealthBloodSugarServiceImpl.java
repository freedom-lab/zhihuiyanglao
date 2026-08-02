package cn.pluss.platform.service.healthBloodSugar.impl;

import cn.pluss.platform.mapper.HealthBloodSugarMapper;
import cn.pluss.platform.model.entity.HealthBloodSugar;
import cn.pluss.platform.model.entity.HealthParam;
import cn.pluss.platform.model.vo.BloodWeeklyStatVo;
import cn.pluss.platform.model.vo.SugarDetectionVo;
import cn.pluss.platform.service.healthBloodSugar.HealthBloodSugarService;
import cn.pluss.platform.service.healthParam.HealthParamService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;

@Transactional
@Service("healthBloodSugarService")
public class HealthBloodSugarServiceImpl extends ServiceImpl< HealthBloodSugarMapper, HealthBloodSugar> implements HealthBloodSugarService {
    private static final Logger logger = LoggerFactory.getLogger(HealthBloodSugarServiceImpl.class);

    @Resource
    private HealthParamService healthParamService;

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<HealthBloodSugar> queryPage(Map map) {
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
    public HealthBloodSugar queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param healthBloodSugar 实例对象
    * @return 实例对象
    */
    @Override
    public HealthBloodSugar queryOne(HealthBloodSugar healthBloodSugar){
        LambdaQueryWrapper<HealthBloodSugar> queryWrapper = getQueryWrapper(healthBloodSugar);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param healthBloodSugar
    * @return
    */
    @Override
    public List<HealthBloodSugar> queryList(HealthBloodSugar healthBloodSugar) {
        LambdaQueryWrapper<HealthBloodSugar> queryWrapper = getQueryWrapper(healthBloodSugar);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param healthBloodSugar
    * @return
    */
    public static LambdaQueryWrapper<HealthBloodSugar> getQueryWrapper(HealthBloodSugar healthBloodSugar){
        LambdaQueryWrapper<HealthBloodSugar> queryWrapper = new LambdaQueryWrapper<>();
        if (healthBloodSugar.getId() != null) {
            queryWrapper.eq(HealthBloodSugar::getId, healthBloodSugar.getId());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getTenantId())) {
            queryWrapper.eq(HealthBloodSugar::getTenantId, healthBloodSugar.getTenantId());
        }
        if (healthBloodSugar.getCorpId() != null) {
            queryWrapper.eq(HealthBloodSugar::getCorpId, healthBloodSugar.getCorpId());
        }
        if (healthBloodSugar.getInstitutionId() != null) {
            queryWrapper.eq(HealthBloodSugar::getInstitutionId, healthBloodSugar.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getInstitutionName())) {
            queryWrapper.eq(HealthBloodSugar::getInstitutionName, healthBloodSugar.getInstitutionName());
        }
        if (healthBloodSugar.getElderId() != null) {
            queryWrapper.eq(HealthBloodSugar::getElderId, healthBloodSugar.getElderId());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getElderName())) {
            queryWrapper.eq(HealthBloodSugar::getElderName, healthBloodSugar.getElderName());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getIdCard())) {
            queryWrapper.eq(HealthBloodSugar::getIdCard, healthBloodSugar.getIdCard());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getSex())) {
            queryWrapper.eq(HealthBloodSugar::getSex, healthBloodSugar.getSex());
        }
        if (healthBloodSugar.getAge() != null) {
            queryWrapper.eq(HealthBloodSugar::getAge, healthBloodSugar.getAge());
        }
        if (healthBloodSugar.getGaugeTime() != null) {
            queryWrapper.eq(HealthBloodSugar::getGaugeTime, healthBloodSugar.getGaugeTime());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getGaugeType())) {
            queryWrapper.eq(HealthBloodSugar::getGaugeType, healthBloodSugar.getGaugeType());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getConditions())) {
            queryWrapper.eq(HealthBloodSugar::getConditions, healthBloodSugar.getConditions());
        }
        if (healthBloodSugar.getBloodGlucose() != null) {
            queryWrapper.eq(HealthBloodSugar::getBloodGlucose, healthBloodSugar.getBloodGlucose());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getAnalysisResult())) {
            queryWrapper.eq(HealthBloodSugar::getAnalysisResult, healthBloodSugar.getAnalysisResult());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getOpinion())) {
            queryWrapper.eq(HealthBloodSugar::getOpinion, healthBloodSugar.getOpinion());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getWarnFlag())) {
            queryWrapper.eq(HealthBloodSugar::getWarnFlag, healthBloodSugar.getWarnFlag());
        }
        if (healthBloodSugar.getAreaCode() != null) {
            queryWrapper.eq(HealthBloodSugar::getAreaCode, healthBloodSugar.getAreaCode());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getAreaName())) {
            queryWrapper.eq(HealthBloodSugar::getAreaName, healthBloodSugar.getAreaName());
        }
        if (healthBloodSugar.getCreateUser() != null) {
            queryWrapper.eq(HealthBloodSugar::getCreateUser, healthBloodSugar.getCreateUser());
        }
        if (healthBloodSugar.getCreateDept() != null) {
            queryWrapper.eq(HealthBloodSugar::getCreateDept, healthBloodSugar.getCreateDept());
        }
        if (healthBloodSugar.getCreateTime() != null) {
            queryWrapper.eq(HealthBloodSugar::getCreateTime, healthBloodSugar.getCreateTime());
        }
        if (healthBloodSugar.getUpdateUser() != null) {
            queryWrapper.eq(HealthBloodSugar::getUpdateUser, healthBloodSugar.getUpdateUser());
        }
        if (healthBloodSugar.getUpdateTime() != null) {
            queryWrapper.eq(HealthBloodSugar::getUpdateTime, healthBloodSugar.getUpdateTime());
        }
        if (healthBloodSugar.getIsDeleted() != null) {
            queryWrapper.eq(HealthBloodSugar::getIsDeleted, healthBloodSugar.getIsDeleted());
        }
        if (healthBloodSugar.getStatus() != null) {
            queryWrapper.eq(HealthBloodSugar::getStatus, healthBloodSugar.getStatus());
        }
        if (StringUtil.isNotEmpty(healthBloodSugar.getDataSource())) {
            queryWrapper.eq(HealthBloodSugar::getDataSource, healthBloodSugar.getDataSource());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param healthBloodSugar 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodSugar insert(HealthBloodSugar healthBloodSugar) {
        healthBloodSugar.setId(null);
        getBaseMapper().insert(healthBloodSugar);
        return healthBloodSugar;
    }

    /**
    * 更新数据
    *
    * @param healthBloodSugar 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public HealthBloodSugar update(HealthBloodSugar healthBloodSugar) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<HealthBloodSugar> chainWrapper = new LambdaUpdateChainWrapper<HealthBloodSugar>(getBaseMapper());
        if (healthBloodSugar.getId() != null) {
            chainWrapper.set(HealthBloodSugar::getId, healthBloodSugar.getId());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getTenantId())) {
            chainWrapper.set(HealthBloodSugar::getTenantId, healthBloodSugar.getTenantId());
        }
        if (healthBloodSugar.getCorpId() != null) {
            chainWrapper.set(HealthBloodSugar::getCorpId, healthBloodSugar.getCorpId());
        }
        if (healthBloodSugar.getInstitutionId() != null) {
            chainWrapper.set(HealthBloodSugar::getInstitutionId, healthBloodSugar.getInstitutionId());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getInstitutionName())) {
            chainWrapper.set(HealthBloodSugar::getInstitutionName, healthBloodSugar.getInstitutionName());
        }
        if (healthBloodSugar.getElderId() != null) {
            chainWrapper.set(HealthBloodSugar::getElderId, healthBloodSugar.getElderId());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getElderName())) {
            chainWrapper.set(HealthBloodSugar::getElderName, healthBloodSugar.getElderName());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getIdCard())) {
            chainWrapper.set(HealthBloodSugar::getIdCard, healthBloodSugar.getIdCard());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getSex())) {
            chainWrapper.set(HealthBloodSugar::getSex, healthBloodSugar.getSex());
        }
        if (healthBloodSugar.getAge() != null) {
            chainWrapper.set(HealthBloodSugar::getAge, healthBloodSugar.getAge());
        }
        if (healthBloodSugar.getGaugeTime() != null) {
            chainWrapper.set(HealthBloodSugar::getGaugeTime, healthBloodSugar.getGaugeTime());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getGaugeType())) {
            chainWrapper.set(HealthBloodSugar::getGaugeType, healthBloodSugar.getGaugeType());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getConditions())) {
            chainWrapper.set(HealthBloodSugar::getConditions, healthBloodSugar.getConditions());
        }
        if (healthBloodSugar.getBloodGlucose() != null) {
            chainWrapper.set(HealthBloodSugar::getBloodGlucose, healthBloodSugar.getBloodGlucose());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getAnalysisResult())) {
            chainWrapper.set(HealthBloodSugar::getAnalysisResult, healthBloodSugar.getAnalysisResult());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getOpinion())) {
            chainWrapper.set(HealthBloodSugar::getOpinion, healthBloodSugar.getOpinion());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getWarnFlag())) {
            chainWrapper.set(HealthBloodSugar::getWarnFlag, healthBloodSugar.getWarnFlag());
        }
        if (healthBloodSugar.getAreaCode() != null) {
            chainWrapper.set(HealthBloodSugar::getAreaCode, healthBloodSugar.getAreaCode());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getAreaName())) {
            chainWrapper.set(HealthBloodSugar::getAreaName, healthBloodSugar.getAreaName());
        }
        if (healthBloodSugar.getCreateUser() != null) {
            chainWrapper.set(HealthBloodSugar::getCreateUser, healthBloodSugar.getCreateUser());
        }
        if (healthBloodSugar.getCreateDept() != null) {
            chainWrapper.set(HealthBloodSugar::getCreateDept, healthBloodSugar.getCreateDept());
        }
        if (healthBloodSugar.getCreateTime() != null) {
            chainWrapper.set(HealthBloodSugar::getCreateTime, healthBloodSugar.getCreateTime());
        }
        if (healthBloodSugar.getUpdateUser() != null) {
            chainWrapper.set(HealthBloodSugar::getUpdateUser, healthBloodSugar.getUpdateUser());
        }
        if (healthBloodSugar.getUpdateTime() != null) {
            chainWrapper.set(HealthBloodSugar::getUpdateTime, healthBloodSugar.getUpdateTime());
        }
        if (healthBloodSugar.getIsDeleted() != null) {
            chainWrapper.set(HealthBloodSugar::getIsDeleted, healthBloodSugar.getIsDeleted());
        }
        if (healthBloodSugar.getStatus() != null) {
            chainWrapper.set(HealthBloodSugar::getStatus, healthBloodSugar.getStatus());
        }
        if (StringUtil.isNotBlank(healthBloodSugar.getDataSource())) {
            chainWrapper.set(HealthBloodSugar::getDataSource, healthBloodSugar.getDataSource());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(HealthBloodSugar::getId, healthBloodSugar.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(healthBloodSugar.getId());
        } else {
            return healthBloodSugar;
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
    public boolean saveHealthBloodSugarBatch(List<HealthBloodSugar> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (HealthBloodSugar healthBloodSugar : insertList) {
            //使用默认的雪花算法生成
            healthBloodSugar.setId(null);
            //healthBloodSugar.setCreatedDt(currentDte);
            //healthBloodSugar.setUpdatedDt(currentDte);
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
    public Integer deleteHealthBloodSugarBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<HealthBloodSugar> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }

    @Override
    public Map<String, Object> monitorBloodSugar(HealthBloodSugar queryParam) {
        // 查询血糖记录
        List<HealthBloodSugar> bsList = queryList(queryParam);
        if (CollectionUtils.isEmpty(bsList)) {
            Map<String, Object> emptyResult = new HashMap<>();
            emptyResult.put("normalList", Collections.emptyList());
            emptyResult.put("abnormalList", Collections.emptyList());
            return emptyResult;
        }

        // 查出 空腹(XT_KF) 和 餐后(XT_CH) 的参考范围
        List<String> paramCodes = Arrays.asList("XT_KF", "XT_CH");
        List<HealthParam> params = healthParamService.list(
                new LambdaQueryWrapper<HealthParam>()
                        .in(HealthParam::getParamCode, paramCodes)
        );
        Map<String, HealthParam> paramMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(params)) {
            for (HealthParam p : params) {
                paramMap.put(p.getParamCode(), p);
            }
        }
        HealthParam xtKfParam = paramMap.get("XT_KF");
        HealthParam xtChParam = paramMap.get("XT_CH");

        // 根据测量条件选择对应参考范围
        List<HealthBloodSugar> normalList = new ArrayList<>();
        List<HealthBloodSugar> abnormalList = new ArrayList<>();
        for (HealthBloodSugar bs : bsList) {
            List<String> abnormalFields = new ArrayList<>();

            if (bs.getBloodGlucose() != null) {
                // conditions: "0"=餐后, "1"=餐前(空腹)
                HealthParam targetParam = null;
                if ("1".equals(bs.getConditions())) {
                    targetParam = xtKfParam;
                } else if ("0".equals(bs.getConditions())) {
                    targetParam = xtChParam;
                }

                if (targetParam != null) {
                    if (targetParam.getMinValue() != null && bs.getBloodGlucose() < targetParam.getMinValue()) {
                        abnormalFields.add("bloodGlucose");
                    }
                    if (targetParam.getMaxValue() != null && bs.getBloodGlucose() > targetParam.getMaxValue()) {
                        if (!abnormalFields.contains("bloodGlucose")) {
                            abnormalFields.add("bloodGlucose");
                        }
                    }
                }
            }

            if (!abnormalFields.isEmpty()) {
                bs.setAbnormalFields(abnormalFields);
                abnormalList.add(bs);
            } else {
                normalList.add(bs);
            }
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("normalList", normalList);
        resultMap.put("abnormalList", abnormalList);
        return resultMap;
    }

    @Override
    public SugarDetectionVo queryBloodSugarDetectionStatistics(HealthBloodSugar healthBloodSugar) {
        return getBaseMapper().queryBloodSugarDetectionStatistics(healthBloodSugar);
    }

    @Override
    public List<BloodWeeklyStatVo> queryWeeklyBloodSugarStats() {
        return getBaseMapper().queryWeeklyBloodSugarStats();
    }
}


