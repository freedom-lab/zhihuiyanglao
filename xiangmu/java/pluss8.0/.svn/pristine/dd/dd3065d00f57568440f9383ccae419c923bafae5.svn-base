package cn.pluss.platform.service.assessmentDrugSituation.impl;

import cn.pluss.platform.mapper.AssessmentDrugSituationMapper;
import cn.pluss.platform.model.entity.AssessmentDrugSituation;
import cn.pluss.platform.service.assessmentDrugSituation.AssessmentDrugSituationService;
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
@Service("assessmentDrugSituationService")
public class AssessmentDrugSituationServiceImpl extends ServiceImpl< AssessmentDrugSituationMapper, AssessmentDrugSituation> implements AssessmentDrugSituationService {
    private static final Logger logger = LoggerFactory.getLogger(AssessmentDrugSituationServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<AssessmentDrugSituation> queryPage(Map map) {
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
    public AssessmentDrugSituation queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentDrugSituation 实例对象
    * @return 实例对象
    */
    @Override
    public AssessmentDrugSituation queryOne(AssessmentDrugSituation assessmentDrugSituation){
        LambdaQueryWrapper<AssessmentDrugSituation> queryWrapper = getQueryWrapper(assessmentDrugSituation);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param assessmentDrugSituation
    * @return
    */
    @Override
    public List<AssessmentDrugSituation> queryList(AssessmentDrugSituation assessmentDrugSituation) {
        LambdaQueryWrapper<AssessmentDrugSituation> queryWrapper = getQueryWrapper(assessmentDrugSituation);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param assessmentDrugSituation
    * @return
    */
    public static LambdaQueryWrapper<AssessmentDrugSituation> getQueryWrapper(AssessmentDrugSituation assessmentDrugSituation){
        LambdaQueryWrapper<AssessmentDrugSituation> queryWrapper = new LambdaQueryWrapper<>();
        if (assessmentDrugSituation.getId() != null) {
            queryWrapper.eq(AssessmentDrugSituation::getId, assessmentDrugSituation.getId());
        }
        if (StringUtil.isNotEmpty(assessmentDrugSituation.getTenantId())) {
            queryWrapper.eq(AssessmentDrugSituation::getTenantId, assessmentDrugSituation.getTenantId());
        }
        if (assessmentDrugSituation.getAppointId() != null) {
            queryWrapper.eq(AssessmentDrugSituation::getAppointId, assessmentDrugSituation.getAppointId());
        }
        if (StringUtil.isNotEmpty(assessmentDrugSituation.getDrugName())) {
            queryWrapper.eq(AssessmentDrugSituation::getDrugName, assessmentDrugSituation.getDrugName());
        }
        if (StringUtil.isNotEmpty(assessmentDrugSituation.getDrugMethod())) {
            queryWrapper.eq(AssessmentDrugSituation::getDrugMethod, assessmentDrugSituation.getDrugMethod());
        }
        if (StringUtil.isNotEmpty(assessmentDrugSituation.getDrugDosage())) {
            queryWrapper.eq(AssessmentDrugSituation::getDrugDosage, assessmentDrugSituation.getDrugDosage());
        }
        if (StringUtil.isNotEmpty(assessmentDrugSituation.getDrugRate())) {
            queryWrapper.eq(AssessmentDrugSituation::getDrugRate, assessmentDrugSituation.getDrugRate());
        }
        if (assessmentDrugSituation.getCreateUser() != null) {
            queryWrapper.eq(AssessmentDrugSituation::getCreateUser, assessmentDrugSituation.getCreateUser());
        }
        if (assessmentDrugSituation.getCreateDept() != null) {
            queryWrapper.eq(AssessmentDrugSituation::getCreateDept, assessmentDrugSituation.getCreateDept());
        }
        if (assessmentDrugSituation.getCreateTime() != null) {
            queryWrapper.eq(AssessmentDrugSituation::getCreateTime, assessmentDrugSituation.getCreateTime());
        }
        if (assessmentDrugSituation.getUpdateUser() != null) {
            queryWrapper.eq(AssessmentDrugSituation::getUpdateUser, assessmentDrugSituation.getUpdateUser());
        }
        if (assessmentDrugSituation.getUpdateTime() != null) {
            queryWrapper.eq(AssessmentDrugSituation::getUpdateTime, assessmentDrugSituation.getUpdateTime());
        }
        if (assessmentDrugSituation.getIsDeleted() != null) {
            queryWrapper.eq(AssessmentDrugSituation::getIsDeleted, assessmentDrugSituation.getIsDeleted());
        }
        if (assessmentDrugSituation.getStatus() != null) {
            queryWrapper.eq(AssessmentDrugSituation::getStatus, assessmentDrugSituation.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param assessmentDrugSituation 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentDrugSituation insert(AssessmentDrugSituation assessmentDrugSituation) {
        assessmentDrugSituation.setId(null);
        getBaseMapper().insert(assessmentDrugSituation);
        return assessmentDrugSituation;
    }

    /**
    * 更新数据
    *
    * @param assessmentDrugSituation 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public AssessmentDrugSituation update(AssessmentDrugSituation assessmentDrugSituation) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<AssessmentDrugSituation> chainWrapper = new LambdaUpdateChainWrapper<AssessmentDrugSituation>(getBaseMapper());
        if (assessmentDrugSituation.getId() != null) {
            chainWrapper.set(AssessmentDrugSituation::getId, assessmentDrugSituation.getId());
        }
        if (StringUtil.isNotBlank(assessmentDrugSituation.getTenantId())) {
            chainWrapper.set(AssessmentDrugSituation::getTenantId, assessmentDrugSituation.getTenantId());
        }
        if (assessmentDrugSituation.getAppointId() != null) {
            chainWrapper.set(AssessmentDrugSituation::getAppointId, assessmentDrugSituation.getAppointId());
        }
        if (StringUtil.isNotBlank(assessmentDrugSituation.getDrugName())) {
            chainWrapper.set(AssessmentDrugSituation::getDrugName, assessmentDrugSituation.getDrugName());
        }
        if (StringUtil.isNotBlank(assessmentDrugSituation.getDrugMethod())) {
            chainWrapper.set(AssessmentDrugSituation::getDrugMethod, assessmentDrugSituation.getDrugMethod());
        }
        if (StringUtil.isNotBlank(assessmentDrugSituation.getDrugDosage())) {
            chainWrapper.set(AssessmentDrugSituation::getDrugDosage, assessmentDrugSituation.getDrugDosage());
        }
        if (StringUtil.isNotBlank(assessmentDrugSituation.getDrugRate())) {
            chainWrapper.set(AssessmentDrugSituation::getDrugRate, assessmentDrugSituation.getDrugRate());
        }
        if (assessmentDrugSituation.getCreateUser() != null) {
            chainWrapper.set(AssessmentDrugSituation::getCreateUser, assessmentDrugSituation.getCreateUser());
        }
        if (assessmentDrugSituation.getCreateDept() != null) {
            chainWrapper.set(AssessmentDrugSituation::getCreateDept, assessmentDrugSituation.getCreateDept());
        }
        if (assessmentDrugSituation.getCreateTime() != null) {
            chainWrapper.set(AssessmentDrugSituation::getCreateTime, assessmentDrugSituation.getCreateTime());
        }
        if (assessmentDrugSituation.getUpdateUser() != null) {
            chainWrapper.set(AssessmentDrugSituation::getUpdateUser, assessmentDrugSituation.getUpdateUser());
        }
        if (assessmentDrugSituation.getUpdateTime() != null) {
            chainWrapper.set(AssessmentDrugSituation::getUpdateTime, assessmentDrugSituation.getUpdateTime());
        }
        if (assessmentDrugSituation.getIsDeleted() != null) {
            chainWrapper.set(AssessmentDrugSituation::getIsDeleted, assessmentDrugSituation.getIsDeleted());
        }
        if (assessmentDrugSituation.getStatus() != null) {
            chainWrapper.set(AssessmentDrugSituation::getStatus, assessmentDrugSituation.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(AssessmentDrugSituation::getId, assessmentDrugSituation.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(assessmentDrugSituation.getId());
        } else {
            return assessmentDrugSituation;
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
    public boolean saveAssessmentDrugSituationBatch(List<AssessmentDrugSituation> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (AssessmentDrugSituation assessmentDrugSituation : insertList) {
            //使用默认的雪花算法生成
            assessmentDrugSituation.setId(null);
            //assessmentDrugSituation.setCreatedDt(currentDte);
            //assessmentDrugSituation.setUpdatedDt(currentDte);
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
    public Integer deleteAssessmentDrugSituationBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<AssessmentDrugSituation> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


