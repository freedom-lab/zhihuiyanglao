package cn.pluss.platform.service.assessmentElderBase.impl;

import cn.pluss.platform.mapper.AssessmentElderBaseMapper;
import cn.pluss.platform.model.entity.AssessmentElderBase;
import cn.pluss.platform.service.assessmentElderBase.AssessmentElderBaseService;
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
@Service("assessmentElderBaseService")
public class AssessmentElderBaseServiceImpl extends ServiceImpl< AssessmentElderBaseMapper, AssessmentElderBase> implements AssessmentElderBaseService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentElderBaseServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentElderBase> queryPage(Map map) {
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
    public AssessmentElderBase queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentElderBase 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentElderBase queryOne(AssessmentElderBase assessmentElderBase){
        LambdaQueryWrapper<AssessmentElderBase> queryWrapper = getQueryWrapper(assessmentElderBase);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentElderBase
    * @return
    */
    @Override
    public List<AssessmentElderBase> queryList(AssessmentElderBase assessmentElderBase) {
        LambdaQueryWrapper<AssessmentElderBase> queryWrapper = getQueryWrapper(assessmentElderBase);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentElderBase
    * @return
    */
    public static LambdaQueryWrapper<AssessmentElderBase> getQueryWrapper(AssessmentElderBase assessmentElderBase){
        LambdaQueryWrapper<AssessmentElderBase> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentElderBase.getId() != null) {
            queryWrapper.eq(AssessmentElderBase::getId, assessmentElderBase.getId());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getTenantId())) {
            queryWrapper.eq(AssessmentElderBase::getTenantId, assessmentElderBase.getTenantId());
        }
        if (assessmentElderBase.getAppointId() != null) {
            queryWrapper.eq(AssessmentElderBase::getAppointId, assessmentElderBase.getAppointId());
        }
        if (assessmentElderBase.getElderId() != null) {
            queryWrapper.eq(AssessmentElderBase::getElderId, assessmentElderBase.getElderId());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getElderName())) {
            queryWrapper.eq(AssessmentElderBase::getElderName, assessmentElderBase.getElderName());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getIdCard())) {
            queryWrapper.eq(AssessmentElderBase::getIdCard, assessmentElderBase.getIdCard());
        }
        if (assessmentElderBase.getBirthday() != null) {
            queryWrapper.eq(AssessmentElderBase::getBirthday, assessmentElderBase.getBirthday());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getSex())) {
            queryWrapper.eq(AssessmentElderBase::getSex, assessmentElderBase.getSex());
        }
        if (assessmentElderBase.getHeight() != null) {
            queryWrapper.eq(AssessmentElderBase::getHeight, assessmentElderBase.getHeight());
        }
        if (assessmentElderBase.getWeight() != null) {
            queryWrapper.eq(AssessmentElderBase::getWeight, assessmentElderBase.getWeight());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getNation())) {
            queryWrapper.eq(AssessmentElderBase::getNation, assessmentElderBase.getNation());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getReligionType())) {
            queryWrapper.eq(AssessmentElderBase::getReligionType, assessmentElderBase.getReligionType());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getDegreeEducation())) {
            queryWrapper.eq(AssessmentElderBase::getDegreeEducation, assessmentElderBase.getDegreeEducation());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getLiveState())) {
            queryWrapper.eq(AssessmentElderBase::getLiveState, assessmentElderBase.getLiveState());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getMarryState())) {
            queryWrapper.eq(AssessmentElderBase::getMarryState, assessmentElderBase.getMarryState());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getMedicalType())) {
            queryWrapper.eq(AssessmentElderBase::getMedicalType, assessmentElderBase.getMedicalType());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getEconomicSources())) {
            queryWrapper.eq(AssessmentElderBase::getEconomicSources, assessmentElderBase.getEconomicSources());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getAccidentOne())) {
            queryWrapper.eq(AssessmentElderBase::getAccidentOne, assessmentElderBase.getAccidentOne());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getAccidentTwo())) {
            queryWrapper.eq(AssessmentElderBase::getAccidentTwo, assessmentElderBase.getAccidentTwo());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getAccidentThree())) {
            queryWrapper.eq(AssessmentElderBase::getAccidentThree, assessmentElderBase.getAccidentThree());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getAccidentFour())) {
            queryWrapper.eq(AssessmentElderBase::getAccidentFour, assessmentElderBase.getAccidentFour());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getAccidentFive())) {
            queryWrapper.eq(AssessmentElderBase::getAccidentFive, assessmentElderBase.getAccidentFive());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getProvideName())) {
            queryWrapper.eq(AssessmentElderBase::getProvideName, assessmentElderBase.getProvideName());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getProvideRelation())) {
            queryWrapper.eq(AssessmentElderBase::getProvideRelation, assessmentElderBase.getProvideRelation());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getProvideMan())) {
            queryWrapper.eq(AssessmentElderBase::getProvideMan, assessmentElderBase.getProvideMan());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getProvideTel())) {
            queryWrapper.eq(AssessmentElderBase::getProvideTel, assessmentElderBase.getProvideTel());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getRemark())) {
            queryWrapper.eq(AssessmentElderBase::getRemark, assessmentElderBase.getRemark());
        }
        if (assessmentElderBase.getCreateUser() != null) {
            queryWrapper.eq(AssessmentElderBase::getCreateUser, assessmentElderBase.getCreateUser());
        }
        if (assessmentElderBase.getCreateDept() != null) {
            queryWrapper.eq(AssessmentElderBase::getCreateDept, assessmentElderBase.getCreateDept());
        }
        if (assessmentElderBase.getCreateTime() != null) {
            queryWrapper.eq(AssessmentElderBase::getCreateTime, assessmentElderBase.getCreateTime());
        }
        if (assessmentElderBase.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentElderBase::getUpdateUser, assessmentElderBase.getUpdateUser());
        }
        if (assessmentElderBase.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentElderBase::getUpdateTime, assessmentElderBase.getUpdateTime());
        }
        if (assessmentElderBase.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentElderBase::getIsDeleted, assessmentElderBase.getIsDeleted());
        }
        if (assessmentElderBase.getStatus() != null) {
            queryWrapper.eq(AssessmentElderBase::getStatus, assessmentElderBase.getStatus());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getAreaCode())) {
            queryWrapper.eq(AssessmentElderBase::getAreaCode, assessmentElderBase.getAreaCode());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getAreaName())) {
            queryWrapper.eq(AssessmentElderBase::getAreaName, assessmentElderBase.getAreaName());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getMajorDiseases())) {
            queryWrapper.eq(AssessmentElderBase::getMajorDiseases, assessmentElderBase.getMajorDiseases());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getMajorDiseasesName())) {
            queryWrapper.eq(AssessmentElderBase::getMajorDiseasesName, assessmentElderBase.getMajorDiseasesName());
        }
        if (assessmentElderBase.getHealthOne() != null) {
            queryWrapper.eq(AssessmentElderBase::getHealthOne, assessmentElderBase.getHealthOne());
        }
        if (assessmentElderBase.getHealthTwo() != null) {
            queryWrapper.eq(AssessmentElderBase::getHealthTwo, assessmentElderBase.getHealthTwo());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getHealthTwoMemo())) {
            queryWrapper.eq(AssessmentElderBase::getHealthTwoMemo, assessmentElderBase.getHealthTwoMemo());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getHealthThree())) {
            queryWrapper.eq(AssessmentElderBase::getHealthThree, assessmentElderBase.getHealthThree());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getHealthFour())) {
            queryWrapper.eq(AssessmentElderBase::getHealthFour, assessmentElderBase.getHealthFour());
        }
        if (assessmentElderBase.getHealthFive() != null) {
            queryWrapper.eq(AssessmentElderBase::getHealthFive, assessmentElderBase.getHealthFive());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getHealthSix())) {
            queryWrapper.eq(AssessmentElderBase::getHealthSix, assessmentElderBase.getHealthSix());
        }
        if (assessmentElderBase.getHealthSixThree() != null) {
            queryWrapper.eq(AssessmentElderBase::getHealthSixThree, assessmentElderBase.getHealthSixThree());
        }
        if (assessmentElderBase.getHealthSixFour() != null) {
            queryWrapper.eq(AssessmentElderBase::getHealthSixFour, assessmentElderBase.getHealthSixFour());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getHealthSeven())) {
            queryWrapper.eq(AssessmentElderBase::getHealthSeven, assessmentElderBase.getHealthSeven());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getHealthEight())) {
            queryWrapper.eq(AssessmentElderBase::getHealthEight, assessmentElderBase.getHealthEight());
        }
        if (assessmentElderBase.getHealthNine() != null) {
            queryWrapper.eq(AssessmentElderBase::getHealthNine, assessmentElderBase.getHealthNine());
        }
        if (assessmentElderBase.getHealthTen() != null) {
            queryWrapper.eq(AssessmentElderBase::getHealthTen, assessmentElderBase.getHealthTen());
        }
        if (assessmentElderBase.getHealthEleven() != null) {
            queryWrapper.eq(AssessmentElderBase::getHealthEleven, assessmentElderBase.getHealthEleven());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getHealthOther())) {
            queryWrapper.eq(AssessmentElderBase::getHealthOther, assessmentElderBase.getHealthOther());
        }
        if (StringUtil.isNotEmpty(assessmentElderBase.getMajorDiseasesOther())) {
            queryWrapper.eq(AssessmentElderBase::getMajorDiseasesOther, assessmentElderBase.getMajorDiseasesOther());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentElderBase 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentElderBase insert(AssessmentElderBase assessmentElderBase) {
        assessmentElderBase.setId(null);
        getBaseMapper().insert(assessmentElderBase);
        return assessmentElderBase;
    }

    /**
    * 更新数据
    *
    * @param assessmentElderBase 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentElderBase update(AssessmentElderBase assessmentElderBase) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentElderBase> chainWrapper = new LambdaUpdateChainWrapper<AssessmentElderBase>(getBaseMapper());
        if (assessmentElderBase.getId() != null) {
            chainWrapper.set(AssessmentElderBase::getId, assessmentElderBase.getId());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getTenantId())) {
            chainWrapper.set(AssessmentElderBase::getTenantId, assessmentElderBase.getTenantId());
        }
        if (assessmentElderBase.getAppointId() != null) {
            chainWrapper.set(AssessmentElderBase::getAppointId, assessmentElderBase.getAppointId());
        }
        if (assessmentElderBase.getElderId() != null) {
            chainWrapper.set(AssessmentElderBase::getElderId, assessmentElderBase.getElderId());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getElderName())) {
            chainWrapper.set(AssessmentElderBase::getElderName, assessmentElderBase.getElderName());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getIdCard())) {
            chainWrapper.set(AssessmentElderBase::getIdCard, assessmentElderBase.getIdCard());
        }
        if (assessmentElderBase.getBirthday() != null) {
            chainWrapper.set(AssessmentElderBase::getBirthday, assessmentElderBase.getBirthday());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getSex())) {
            chainWrapper.set(AssessmentElderBase::getSex, assessmentElderBase.getSex());
        }
        if (assessmentElderBase.getHeight() != null) {
            chainWrapper.set(AssessmentElderBase::getHeight, assessmentElderBase.getHeight());
        }
        if (assessmentElderBase.getWeight() != null) {
            chainWrapper.set(AssessmentElderBase::getWeight, assessmentElderBase.getWeight());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getNation())) {
            chainWrapper.set(AssessmentElderBase::getNation, assessmentElderBase.getNation());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getReligionType())) {
            chainWrapper.set(AssessmentElderBase::getReligionType, assessmentElderBase.getReligionType());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getDegreeEducation())) {
            chainWrapper.set(AssessmentElderBase::getDegreeEducation, assessmentElderBase.getDegreeEducation());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getLiveState())) {
            chainWrapper.set(AssessmentElderBase::getLiveState, assessmentElderBase.getLiveState());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getMarryState())) {
            chainWrapper.set(AssessmentElderBase::getMarryState, assessmentElderBase.getMarryState());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getMedicalType())) {
            chainWrapper.set(AssessmentElderBase::getMedicalType, assessmentElderBase.getMedicalType());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getEconomicSources())) {
            chainWrapper.set(AssessmentElderBase::getEconomicSources, assessmentElderBase.getEconomicSources());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getAccidentOne())) {
            chainWrapper.set(AssessmentElderBase::getAccidentOne, assessmentElderBase.getAccidentOne());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getAccidentTwo())) {
            chainWrapper.set(AssessmentElderBase::getAccidentTwo, assessmentElderBase.getAccidentTwo());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getAccidentThree())) {
            chainWrapper.set(AssessmentElderBase::getAccidentThree, assessmentElderBase.getAccidentThree());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getAccidentFour())) {
            chainWrapper.set(AssessmentElderBase::getAccidentFour, assessmentElderBase.getAccidentFour());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getAccidentFive())) {
            chainWrapper.set(AssessmentElderBase::getAccidentFive, assessmentElderBase.getAccidentFive());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getProvideName())) {
            chainWrapper.set(AssessmentElderBase::getProvideName, assessmentElderBase.getProvideName());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getProvideRelation())) {
            chainWrapper.set(AssessmentElderBase::getProvideRelation, assessmentElderBase.getProvideRelation());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getProvideMan())) {
            chainWrapper.set(AssessmentElderBase::getProvideMan, assessmentElderBase.getProvideMan());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getProvideTel())) {
            chainWrapper.set(AssessmentElderBase::getProvideTel, assessmentElderBase.getProvideTel());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getRemark())) {
            chainWrapper.set(AssessmentElderBase::getRemark, assessmentElderBase.getRemark());
        }
        if (assessmentElderBase.getCreateUser() != null) {
            chainWrapper.set(AssessmentElderBase::getCreateUser, assessmentElderBase.getCreateUser());
        }
        if (assessmentElderBase.getCreateDept() != null) {
            chainWrapper.set(AssessmentElderBase::getCreateDept, assessmentElderBase.getCreateDept());
        }
        if (assessmentElderBase.getCreateTime() != null) {
            chainWrapper.set(AssessmentElderBase::getCreateTime, assessmentElderBase.getCreateTime());
        }
        if (assessmentElderBase.getUpdateUser() != null) {
            chainWrapper.set(AssessmentElderBase::getUpdateUser, assessmentElderBase.getUpdateUser());
        }
        if (assessmentElderBase.getUpdateTime() != null) {
            chainWrapper.set(AssessmentElderBase::getUpdateTime, assessmentElderBase.getUpdateTime());
        }
        if (assessmentElderBase.getIsDeleted() != null) {
            chainWrapper.set(AssessmentElderBase::getIsDeleted, assessmentElderBase.getIsDeleted());
        }
        if (assessmentElderBase.getStatus() != null) {
            chainWrapper.set(AssessmentElderBase::getStatus, assessmentElderBase.getStatus());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getAreaCode())) {
            chainWrapper.set(AssessmentElderBase::getAreaCode, assessmentElderBase.getAreaCode());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getAreaName())) {
            chainWrapper.set(AssessmentElderBase::getAreaName, assessmentElderBase.getAreaName());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getMajorDiseases())) {
            chainWrapper.set(AssessmentElderBase::getMajorDiseases, assessmentElderBase.getMajorDiseases());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getMajorDiseasesName())) {
            chainWrapper.set(AssessmentElderBase::getMajorDiseasesName, assessmentElderBase.getMajorDiseasesName());
        }
        if (assessmentElderBase.getHealthOne() != null) {
            chainWrapper.set(AssessmentElderBase::getHealthOne, assessmentElderBase.getHealthOne());
        }
        if (assessmentElderBase.getHealthTwo() != null) {
            chainWrapper.set(AssessmentElderBase::getHealthTwo, assessmentElderBase.getHealthTwo());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getHealthTwoMemo())) {
            chainWrapper.set(AssessmentElderBase::getHealthTwoMemo, assessmentElderBase.getHealthTwoMemo());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getHealthThree())) {
            chainWrapper.set(AssessmentElderBase::getHealthThree, assessmentElderBase.getHealthThree());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getHealthFour())) {
            chainWrapper.set(AssessmentElderBase::getHealthFour, assessmentElderBase.getHealthFour());
        }
        if (assessmentElderBase.getHealthFive() != null) {
            chainWrapper.set(AssessmentElderBase::getHealthFive, assessmentElderBase.getHealthFive());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getHealthSix())) {
            chainWrapper.set(AssessmentElderBase::getHealthSix, assessmentElderBase.getHealthSix());
        }
        if (assessmentElderBase.getHealthSixThree() != null) {
            chainWrapper.set(AssessmentElderBase::getHealthSixThree, assessmentElderBase.getHealthSixThree());
        }
        if (assessmentElderBase.getHealthSixFour() != null) {
            chainWrapper.set(AssessmentElderBase::getHealthSixFour, assessmentElderBase.getHealthSixFour());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getHealthSeven())) {
            chainWrapper.set(AssessmentElderBase::getHealthSeven, assessmentElderBase.getHealthSeven());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getHealthEight())) {
            chainWrapper.set(AssessmentElderBase::getHealthEight, assessmentElderBase.getHealthEight());
        }
        if (assessmentElderBase.getHealthNine() != null) {
            chainWrapper.set(AssessmentElderBase::getHealthNine, assessmentElderBase.getHealthNine());
        }
        if (assessmentElderBase.getHealthTen() != null) {
            chainWrapper.set(AssessmentElderBase::getHealthTen, assessmentElderBase.getHealthTen());
        }
        if (assessmentElderBase.getHealthEleven() != null) {
            chainWrapper.set(AssessmentElderBase::getHealthEleven, assessmentElderBase.getHealthEleven());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getHealthOther())) {
            chainWrapper.set(AssessmentElderBase::getHealthOther, assessmentElderBase.getHealthOther());
        }
        if (StringUtil.isNotBlank(assessmentElderBase.getMajorDiseasesOther())) {
            chainWrapper.set(AssessmentElderBase::getMajorDiseasesOther, assessmentElderBase.getMajorDiseasesOther());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentElderBase::getId, assessmentElderBase.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentElderBase.getId());
        } else {
            return assessmentElderBase;
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
    public boolean saveAssessmentElderBaseBatch(List<AssessmentElderBase> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentElderBase assessmentElderBase : insertList) {
            //使用默认的雪花算法生成
            assessmentElderBase.setId(null);
            //assessmentElderBase.setCreatedDt(currentDte);
            //assessmentElderBase.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentElderBaseBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentElderBase> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


