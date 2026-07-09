package cn.pluss.platform.service.insHealthPhysicalReport.impl;

import cn.pluss.platform.mapper.InsHealthPhysicalReportMapper;
import cn.pluss.platform.model.entity.InsHealthPhysicalReport;
import cn.pluss.platform.service.insHealthPhysicalReport.InsHealthPhysicalReportService;
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
@Service("insHealthPhysicalReportService")
public class InsHealthPhysicalReportServiceImpl extends ServiceImpl< InsHealthPhysicalReportMapper, InsHealthPhysicalReport> implements InsHealthPhysicalReportService {
    private static final Logger logger = LoggerFactory.getLogger(InsHealthPhysicalReportServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsHealthPhysicalReport> queryPage(Map map) {
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
    public InsHealthPhysicalReport queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insHealthPhysicalReport 实例对象
    * @return 实例对象
    */
    @Override
    public InsHealthPhysicalReport queryOne(InsHealthPhysicalReport insHealthPhysicalReport){
        LambdaQueryWrapper<InsHealthPhysicalReport> queryWrapper = getQueryWrapper(insHealthPhysicalReport);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insHealthPhysicalReport
    * @return
    */
    @Override
    public List<InsHealthPhysicalReport> queryList(InsHealthPhysicalReport insHealthPhysicalReport) {
        LambdaQueryWrapper<InsHealthPhysicalReport> queryWrapper = getQueryWrapper(insHealthPhysicalReport);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insHealthPhysicalReport
    * @return
    */
    public static LambdaQueryWrapper<InsHealthPhysicalReport> getQueryWrapper(InsHealthPhysicalReport insHealthPhysicalReport){
        LambdaQueryWrapper<InsHealthPhysicalReport> queryWrapper = new LambdaQueryWrapper<>();
        if (insHealthPhysicalReport.getId() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getId, insHealthPhysicalReport.getId());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getTenantId())) {
            queryWrapper.eq(InsHealthPhysicalReport::getTenantId, insHealthPhysicalReport.getTenantId());
        }
        if (insHealthPhysicalReport.getCorpId() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getCorpId, insHealthPhysicalReport.getCorpId());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getCorpName())) {
            queryWrapper.eq(InsHealthPhysicalReport::getCorpName, insHealthPhysicalReport.getCorpName());
        }
        if (insHealthPhysicalReport.getInstitutionId() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getInstitutionId, insHealthPhysicalReport.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getInstitutionName())) {
            queryWrapper.eq(InsHealthPhysicalReport::getInstitutionName, insHealthPhysicalReport.getInstitutionName());
        }
        if (insHealthPhysicalReport.getCheckId() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getCheckId, insHealthPhysicalReport.getCheckId());
        }
        if (insHealthPhysicalReport.getCheckDate() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getCheckDate, insHealthPhysicalReport.getCheckDate());
        }
        if (insHealthPhysicalReport.getElderId() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getElderId, insHealthPhysicalReport.getElderId());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getElderName())) {
            queryWrapper.eq(InsHealthPhysicalReport::getElderName, insHealthPhysicalReport.getElderName());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getIdCard())) {
            queryWrapper.eq(InsHealthPhysicalReport::getIdCard, insHealthPhysicalReport.getIdCard());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getSex())) {
            queryWrapper.eq(InsHealthPhysicalReport::getSex, insHealthPhysicalReport.getSex());
        }
        if (insHealthPhysicalReport.getReportTime() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getReportTime, insHealthPhysicalReport.getReportTime());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getHospitalName())) {
            queryWrapper.eq(InsHealthPhysicalReport::getHospitalName, insHealthPhysicalReport.getHospitalName());
        }
        if (insHealthPhysicalReport.getReportType() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getReportType, insHealthPhysicalReport.getReportType());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getReportName())) {
            queryWrapper.eq(InsHealthPhysicalReport::getReportName, insHealthPhysicalReport.getReportName());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getReportPath())) {
            queryWrapper.eq(InsHealthPhysicalReport::getReportPath, insHealthPhysicalReport.getReportPath());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getAreaCode())) {
            queryWrapper.eq(InsHealthPhysicalReport::getAreaCode, insHealthPhysicalReport.getAreaCode());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getAreaName())) {
            queryWrapper.eq(InsHealthPhysicalReport::getAreaName, insHealthPhysicalReport.getAreaName());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getRemark())) {
            queryWrapper.eq(InsHealthPhysicalReport::getRemark, insHealthPhysicalReport.getRemark());
        }
        if (insHealthPhysicalReport.getCreateUser() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getCreateUser, insHealthPhysicalReport.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insHealthPhysicalReport.getCreateName())) {
            queryWrapper.eq(InsHealthPhysicalReport::getCreateName, insHealthPhysicalReport.getCreateName());
        }
        if (insHealthPhysicalReport.getCreateDept() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getCreateDept, insHealthPhysicalReport.getCreateDept());
        }
        if (insHealthPhysicalReport.getCreateTime() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getCreateTime, insHealthPhysicalReport.getCreateTime());
        }
        if (insHealthPhysicalReport.getUpdateUser() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getUpdateUser, insHealthPhysicalReport.getUpdateUser());
        }
        if (insHealthPhysicalReport.getUpdateTime() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getUpdateTime, insHealthPhysicalReport.getUpdateTime());
        }
        if (insHealthPhysicalReport.getIsDeleted() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getIsDeleted, insHealthPhysicalReport.getIsDeleted());
        }
        if (insHealthPhysicalReport.getStatus() != null) {
            queryWrapper.eq(InsHealthPhysicalReport::getStatus, insHealthPhysicalReport.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insHealthPhysicalReport 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsHealthPhysicalReport insert(InsHealthPhysicalReport insHealthPhysicalReport) {
        insHealthPhysicalReport.setId(null);
        getBaseMapper().insert(insHealthPhysicalReport);
        return insHealthPhysicalReport;
    }

    /**
    * 更新数据
    *
    * @param insHealthPhysicalReport 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsHealthPhysicalReport update(InsHealthPhysicalReport insHealthPhysicalReport) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsHealthPhysicalReport> chainWrapper = new LambdaUpdateChainWrapper<InsHealthPhysicalReport>(getBaseMapper());
        if (insHealthPhysicalReport.getId() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getId, insHealthPhysicalReport.getId());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getTenantId())) {
            chainWrapper.set(InsHealthPhysicalReport::getTenantId, insHealthPhysicalReport.getTenantId());
        }
        if (insHealthPhysicalReport.getCorpId() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getCorpId, insHealthPhysicalReport.getCorpId());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getCorpName())) {
            chainWrapper.set(InsHealthPhysicalReport::getCorpName, insHealthPhysicalReport.getCorpName());
        }
        if (insHealthPhysicalReport.getInstitutionId() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getInstitutionId, insHealthPhysicalReport.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getInstitutionName())) {
            chainWrapper.set(InsHealthPhysicalReport::getInstitutionName, insHealthPhysicalReport.getInstitutionName());
        }
        if (insHealthPhysicalReport.getCheckId() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getCheckId, insHealthPhysicalReport.getCheckId());
        }
        if (insHealthPhysicalReport.getCheckDate() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getCheckDate, insHealthPhysicalReport.getCheckDate());
        }
        if (insHealthPhysicalReport.getElderId() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getElderId, insHealthPhysicalReport.getElderId());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getElderName())) {
            chainWrapper.set(InsHealthPhysicalReport::getElderName, insHealthPhysicalReport.getElderName());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getIdCard())) {
            chainWrapper.set(InsHealthPhysicalReport::getIdCard, insHealthPhysicalReport.getIdCard());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getSex())) {
            chainWrapper.set(InsHealthPhysicalReport::getSex, insHealthPhysicalReport.getSex());
        }
        if (insHealthPhysicalReport.getReportTime() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getReportTime, insHealthPhysicalReport.getReportTime());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getHospitalName())) {
            chainWrapper.set(InsHealthPhysicalReport::getHospitalName, insHealthPhysicalReport.getHospitalName());
        }
        if (insHealthPhysicalReport.getReportType() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getReportType, insHealthPhysicalReport.getReportType());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getReportName())) {
            chainWrapper.set(InsHealthPhysicalReport::getReportName, insHealthPhysicalReport.getReportName());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getReportPath())) {
            chainWrapper.set(InsHealthPhysicalReport::getReportPath, insHealthPhysicalReport.getReportPath());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getAreaCode())) {
            chainWrapper.set(InsHealthPhysicalReport::getAreaCode, insHealthPhysicalReport.getAreaCode());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getAreaName())) {
            chainWrapper.set(InsHealthPhysicalReport::getAreaName, insHealthPhysicalReport.getAreaName());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getRemark())) {
            chainWrapper.set(InsHealthPhysicalReport::getRemark, insHealthPhysicalReport.getRemark());
        }
        if (insHealthPhysicalReport.getCreateUser() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getCreateUser, insHealthPhysicalReport.getCreateUser());
        }
        if (StringUtil.isNotBlank(insHealthPhysicalReport.getCreateName())) {
            chainWrapper.set(InsHealthPhysicalReport::getCreateName, insHealthPhysicalReport.getCreateName());
        }
        if (insHealthPhysicalReport.getCreateDept() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getCreateDept, insHealthPhysicalReport.getCreateDept());
        }
        if (insHealthPhysicalReport.getCreateTime() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getCreateTime, insHealthPhysicalReport.getCreateTime());
        }
        if (insHealthPhysicalReport.getUpdateUser() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getUpdateUser, insHealthPhysicalReport.getUpdateUser());
        }
        if (insHealthPhysicalReport.getUpdateTime() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getUpdateTime, insHealthPhysicalReport.getUpdateTime());
        }
        if (insHealthPhysicalReport.getIsDeleted() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getIsDeleted, insHealthPhysicalReport.getIsDeleted());
        }
        if (insHealthPhysicalReport.getStatus() != null) {
            chainWrapper.set(InsHealthPhysicalReport::getStatus, insHealthPhysicalReport.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsHealthPhysicalReport::getId, insHealthPhysicalReport.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insHealthPhysicalReport.getId());
        } else {
            return insHealthPhysicalReport;
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
    public boolean saveInsHealthPhysicalReportBatch(List<InsHealthPhysicalReport> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsHealthPhysicalReport insHealthPhysicalReport : insertList) {
            //使用默认的雪花算法生成
            insHealthPhysicalReport.setId(null);
            //insHealthPhysicalReport.setCreatedDt(currentDte);
            //insHealthPhysicalReport.setUpdatedDt(currentDte);
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
    public Integer deleteInsHealthPhysicalReportBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsHealthPhysicalReport> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


