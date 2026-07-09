package cn.pluss.platform.service.insAptSatisfactionRecord.impl;

import cn.pluss.platform.mapper.InsAptSatisfactionRecordMapper;
import cn.pluss.platform.model.entity.InsAptSatisfactionRecord;
import cn.pluss.platform.service.insAptSatisfactionRecord.InsAptSatisfactionRecordService;
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
@Service("insAptSatisfactionRecordService")
public class InsAptSatisfactionRecordServiceImpl extends ServiceImpl< InsAptSatisfactionRecordMapper, InsAptSatisfactionRecord> implements InsAptSatisfactionRecordService {
    private static final Logger logger = LoggerFactory.getLogger(InsAptSatisfactionRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsAptSatisfactionRecord> queryPage(Map map) {
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
    public InsAptSatisfactionRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insAptSatisfactionRecord 实例对象
    * @return 实例对象
    */
    @Override
    public InsAptSatisfactionRecord queryOne(InsAptSatisfactionRecord insAptSatisfactionRecord){
        LambdaQueryWrapper<InsAptSatisfactionRecord> queryWrapper = getQueryWrapper(insAptSatisfactionRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insAptSatisfactionRecord
    * @return
    */
    @Override
    public List<InsAptSatisfactionRecord> queryList(InsAptSatisfactionRecord insAptSatisfactionRecord) {
        LambdaQueryWrapper<InsAptSatisfactionRecord> queryWrapper = getQueryWrapper(insAptSatisfactionRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insAptSatisfactionRecord
    * @return
    */
    public static LambdaQueryWrapper<InsAptSatisfactionRecord> getQueryWrapper(InsAptSatisfactionRecord insAptSatisfactionRecord){
        LambdaQueryWrapper<InsAptSatisfactionRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (insAptSatisfactionRecord.getId() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getId, insAptSatisfactionRecord.getId());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getTenantId())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getTenantId, insAptSatisfactionRecord.getTenantId());
        }
        if (insAptSatisfactionRecord.getCorpId() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getCorpId, insAptSatisfactionRecord.getCorpId());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getCorpName())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getCorpName, insAptSatisfactionRecord.getCorpName());
        }
        if (insAptSatisfactionRecord.getInstitutionId() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getInstitutionId, insAptSatisfactionRecord.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getInstitutionName())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getInstitutionName, insAptSatisfactionRecord.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionOne())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionOne, insAptSatisfactionRecord.getQuestionOne());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionTwo())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionTwo, insAptSatisfactionRecord.getQuestionTwo());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionThree())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionThree, insAptSatisfactionRecord.getQuestionThree());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionFour())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionFour, insAptSatisfactionRecord.getQuestionFour());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionFive())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionFive, insAptSatisfactionRecord.getQuestionFive());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionSix())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionSix, insAptSatisfactionRecord.getQuestionSix());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionSeven())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionSeven, insAptSatisfactionRecord.getQuestionSeven());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionEight())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionEight, insAptSatisfactionRecord.getQuestionEight());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionNine())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionNine, insAptSatisfactionRecord.getQuestionNine());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionTen())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionTen, insAptSatisfactionRecord.getQuestionTen());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionEleven())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionEleven, insAptSatisfactionRecord.getQuestionEleven());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionTwelve())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionTwelve, insAptSatisfactionRecord.getQuestionTwelve());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getQuestionThirteen())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getQuestionThirteen, insAptSatisfactionRecord.getQuestionThirteen());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getImproveContent())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getImproveContent, insAptSatisfactionRecord.getImproveContent());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getRemark())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getRemark, insAptSatisfactionRecord.getRemark());
        }
        if (insAptSatisfactionRecord.getCreateUser() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getCreateUser, insAptSatisfactionRecord.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insAptSatisfactionRecord.getCreateName())) {
            queryWrapper.eq(InsAptSatisfactionRecord::getCreateName, insAptSatisfactionRecord.getCreateName());
        }
        if (insAptSatisfactionRecord.getCreateDept() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getCreateDept, insAptSatisfactionRecord.getCreateDept());
        }
        if (insAptSatisfactionRecord.getCreateTime() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getCreateTime, insAptSatisfactionRecord.getCreateTime());
        }
        if (insAptSatisfactionRecord.getUpdateUser() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getUpdateUser, insAptSatisfactionRecord.getUpdateUser());
        }
        if (insAptSatisfactionRecord.getUpdateTime() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getUpdateTime, insAptSatisfactionRecord.getUpdateTime());
        }
        if (insAptSatisfactionRecord.getIsDeleted() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getIsDeleted, insAptSatisfactionRecord.getIsDeleted());
        }
        if (insAptSatisfactionRecord.getStatus() != null) {
            queryWrapper.eq(InsAptSatisfactionRecord::getStatus, insAptSatisfactionRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insAptSatisfactionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsAptSatisfactionRecord insert(InsAptSatisfactionRecord insAptSatisfactionRecord) {
        insAptSatisfactionRecord.setId(null);
        getBaseMapper().insert(insAptSatisfactionRecord);
        return insAptSatisfactionRecord;
    }

    /**
    * 更新数据
    *
    * @param insAptSatisfactionRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsAptSatisfactionRecord update(InsAptSatisfactionRecord insAptSatisfactionRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsAptSatisfactionRecord> chainWrapper = new LambdaUpdateChainWrapper<InsAptSatisfactionRecord>(getBaseMapper());
        if (insAptSatisfactionRecord.getId() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getId, insAptSatisfactionRecord.getId());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getTenantId())) {
            chainWrapper.set(InsAptSatisfactionRecord::getTenantId, insAptSatisfactionRecord.getTenantId());
        }
        if (insAptSatisfactionRecord.getCorpId() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getCorpId, insAptSatisfactionRecord.getCorpId());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getCorpName())) {
            chainWrapper.set(InsAptSatisfactionRecord::getCorpName, insAptSatisfactionRecord.getCorpName());
        }
        if (insAptSatisfactionRecord.getInstitutionId() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getInstitutionId, insAptSatisfactionRecord.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getInstitutionName())) {
            chainWrapper.set(InsAptSatisfactionRecord::getInstitutionName, insAptSatisfactionRecord.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionOne())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionOne, insAptSatisfactionRecord.getQuestionOne());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionTwo())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionTwo, insAptSatisfactionRecord.getQuestionTwo());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionThree())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionThree, insAptSatisfactionRecord.getQuestionThree());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionFour())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionFour, insAptSatisfactionRecord.getQuestionFour());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionFive())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionFive, insAptSatisfactionRecord.getQuestionFive());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionSix())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionSix, insAptSatisfactionRecord.getQuestionSix());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionSeven())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionSeven, insAptSatisfactionRecord.getQuestionSeven());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionEight())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionEight, insAptSatisfactionRecord.getQuestionEight());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionNine())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionNine, insAptSatisfactionRecord.getQuestionNine());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionTen())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionTen, insAptSatisfactionRecord.getQuestionTen());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionEleven())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionEleven, insAptSatisfactionRecord.getQuestionEleven());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionTwelve())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionTwelve, insAptSatisfactionRecord.getQuestionTwelve());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getQuestionThirteen())) {
            chainWrapper.set(InsAptSatisfactionRecord::getQuestionThirteen, insAptSatisfactionRecord.getQuestionThirteen());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getImproveContent())) {
            chainWrapper.set(InsAptSatisfactionRecord::getImproveContent, insAptSatisfactionRecord.getImproveContent());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getRemark())) {
            chainWrapper.set(InsAptSatisfactionRecord::getRemark, insAptSatisfactionRecord.getRemark());
        }
        if (insAptSatisfactionRecord.getCreateUser() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getCreateUser, insAptSatisfactionRecord.getCreateUser());
        }
        if (StringUtil.isNotBlank(insAptSatisfactionRecord.getCreateName())) {
            chainWrapper.set(InsAptSatisfactionRecord::getCreateName, insAptSatisfactionRecord.getCreateName());
        }
        if (insAptSatisfactionRecord.getCreateDept() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getCreateDept, insAptSatisfactionRecord.getCreateDept());
        }
        if (insAptSatisfactionRecord.getCreateTime() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getCreateTime, insAptSatisfactionRecord.getCreateTime());
        }
        if (insAptSatisfactionRecord.getUpdateUser() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getUpdateUser, insAptSatisfactionRecord.getUpdateUser());
        }
        if (insAptSatisfactionRecord.getUpdateTime() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getUpdateTime, insAptSatisfactionRecord.getUpdateTime());
        }
        if (insAptSatisfactionRecord.getIsDeleted() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getIsDeleted, insAptSatisfactionRecord.getIsDeleted());
        }
        if (insAptSatisfactionRecord.getStatus() != null) {
            chainWrapper.set(InsAptSatisfactionRecord::getStatus, insAptSatisfactionRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsAptSatisfactionRecord::getId, insAptSatisfactionRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insAptSatisfactionRecord.getId());
        } else {
            return insAptSatisfactionRecord;
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
    public boolean saveInsAptSatisfactionRecordBatch(List<InsAptSatisfactionRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsAptSatisfactionRecord insAptSatisfactionRecord : insertList) {
            //使用默认的雪花算法生成
            insAptSatisfactionRecord.setId(null);
            //insAptSatisfactionRecord.setCreatedDt(currentDte);
            //insAptSatisfactionRecord.setUpdatedDt(currentDte);
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
    public Integer deleteInsAptSatisfactionRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsAptSatisfactionRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


