package cn.pluss.platform.service.insElderRelativesInfo.impl;

import cn.pluss.platform.mapper.InsElderRelativesInfoMapper;
import cn.pluss.platform.model.entity.InsElderRelativesInfo;
import cn.pluss.platform.service.insElderRelativesInfo.InsElderRelativesInfoService;
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
@Service("insElderRelativesInfoService")
public class InsElderRelativesInfoServiceImpl extends ServiceImpl< InsElderRelativesInfoMapper, InsElderRelativesInfo> implements InsElderRelativesInfoService {
    private static final Logger logger = LoggerFactory.getLogger(InsElderRelativesInfoServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsElderRelativesInfo> queryPage(Map map) {
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
    public InsElderRelativesInfo queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insElderRelativesInfo 实例对象
    * @return 实例对象
    */
    @Override
    public InsElderRelativesInfo queryOne(InsElderRelativesInfo insElderRelativesInfo){
        LambdaQueryWrapper<InsElderRelativesInfo> queryWrapper = getQueryWrapper(insElderRelativesInfo);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insElderRelativesInfo
    * @return
    */
    @Override
    public List<InsElderRelativesInfo> queryList(InsElderRelativesInfo insElderRelativesInfo) {
        LambdaQueryWrapper<InsElderRelativesInfo> queryWrapper = getQueryWrapper(insElderRelativesInfo);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insElderRelativesInfo
    * @return
    */
    public static LambdaQueryWrapper<InsElderRelativesInfo> getQueryWrapper(InsElderRelativesInfo insElderRelativesInfo){
        LambdaQueryWrapper<InsElderRelativesInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (insElderRelativesInfo.getId() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getId, insElderRelativesInfo.getId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getTenantId())) {
            queryWrapper.eq(InsElderRelativesInfo::getTenantId, insElderRelativesInfo.getTenantId());
        }
        if (insElderRelativesInfo.getCorpId() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getCorpId, insElderRelativesInfo.getCorpId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getCorpName())) {
            queryWrapper.eq(InsElderRelativesInfo::getCorpName, insElderRelativesInfo.getCorpName());
        }
        if (insElderRelativesInfo.getInstitutionId() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getInstitutionId, insElderRelativesInfo.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getInstitutionName())) {
            queryWrapper.eq(InsElderRelativesInfo::getInstitutionName, insElderRelativesInfo.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getRelativesName())) {
            queryWrapper.eq(InsElderRelativesInfo::getRelativesName, insElderRelativesInfo.getRelativesName());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getHeadPic())) {
            queryWrapper.eq(InsElderRelativesInfo::getHeadPic, insElderRelativesInfo.getHeadPic());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getSex())) {
            queryWrapper.eq(InsElderRelativesInfo::getSex, insElderRelativesInfo.getSex());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getLinkTel())) {
            queryWrapper.eq(InsElderRelativesInfo::getLinkTel, insElderRelativesInfo.getLinkTel());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getPassword())) {
            queryWrapper.eq(InsElderRelativesInfo::getPassword, insElderRelativesInfo.getPassword());
        }
        if (insElderRelativesInfo.getAuditState() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getAuditState, insElderRelativesInfo.getAuditState());
        }
        if (insElderRelativesInfo.getAuditId() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getAuditId, insElderRelativesInfo.getAuditId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getAuditName())) {
            queryWrapper.eq(InsElderRelativesInfo::getAuditName, insElderRelativesInfo.getAuditName());
        }
        if (insElderRelativesInfo.getAuditTime() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getAuditTime, insElderRelativesInfo.getAuditTime());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getAuditMemo())) {
            queryWrapper.eq(InsElderRelativesInfo::getAuditMemo, insElderRelativesInfo.getAuditMemo());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getRemark())) {
            queryWrapper.eq(InsElderRelativesInfo::getRemark, insElderRelativesInfo.getRemark());
        }
        if (insElderRelativesInfo.getCreateUser() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getCreateUser, insElderRelativesInfo.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getCreateName())) {
            queryWrapper.eq(InsElderRelativesInfo::getCreateName, insElderRelativesInfo.getCreateName());
        }
        if (insElderRelativesInfo.getCreateDept() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getCreateDept, insElderRelativesInfo.getCreateDept());
        }
        if (insElderRelativesInfo.getCreateTime() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getCreateTime, insElderRelativesInfo.getCreateTime());
        }
        if (insElderRelativesInfo.getUpdateUser() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getUpdateUser, insElderRelativesInfo.getUpdateUser());
        }
        if (insElderRelativesInfo.getUpdateTime() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getUpdateTime, insElderRelativesInfo.getUpdateTime());
        }
        if (insElderRelativesInfo.getIsDeleted() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getIsDeleted, insElderRelativesInfo.getIsDeleted());
        }
        if (insElderRelativesInfo.getStatus() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getStatus, insElderRelativesInfo.getStatus());
        }
        if (insElderRelativesInfo.getVideoId() != null) {
            queryWrapper.eq(InsElderRelativesInfo::getVideoId, insElderRelativesInfo.getVideoId());
        }
        if (StringUtil.isNotEmpty(insElderRelativesInfo.getIsOnline())) {
            queryWrapper.eq(InsElderRelativesInfo::getIsOnline, insElderRelativesInfo.getIsOnline());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insElderRelativesInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderRelativesInfo insert(InsElderRelativesInfo insElderRelativesInfo) {
        insElderRelativesInfo.setId(null);
        getBaseMapper().insert(insElderRelativesInfo);
        return insElderRelativesInfo;
    }

    /**
    * 更新数据
    *
    * @param insElderRelativesInfo 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsElderRelativesInfo update(InsElderRelativesInfo insElderRelativesInfo) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsElderRelativesInfo> chainWrapper = new LambdaUpdateChainWrapper<InsElderRelativesInfo>(getBaseMapper());
        if (insElderRelativesInfo.getId() != null) {
            chainWrapper.set(InsElderRelativesInfo::getId, insElderRelativesInfo.getId());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getTenantId())) {
            chainWrapper.set(InsElderRelativesInfo::getTenantId, insElderRelativesInfo.getTenantId());
        }
        if (insElderRelativesInfo.getCorpId() != null) {
            chainWrapper.set(InsElderRelativesInfo::getCorpId, insElderRelativesInfo.getCorpId());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getCorpName())) {
            chainWrapper.set(InsElderRelativesInfo::getCorpName, insElderRelativesInfo.getCorpName());
        }
        if (insElderRelativesInfo.getInstitutionId() != null) {
            chainWrapper.set(InsElderRelativesInfo::getInstitutionId, insElderRelativesInfo.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getInstitutionName())) {
            chainWrapper.set(InsElderRelativesInfo::getInstitutionName, insElderRelativesInfo.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getRelativesName())) {
            chainWrapper.set(InsElderRelativesInfo::getRelativesName, insElderRelativesInfo.getRelativesName());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getHeadPic())) {
            chainWrapper.set(InsElderRelativesInfo::getHeadPic, insElderRelativesInfo.getHeadPic());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getSex())) {
            chainWrapper.set(InsElderRelativesInfo::getSex, insElderRelativesInfo.getSex());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getLinkTel())) {
            chainWrapper.set(InsElderRelativesInfo::getLinkTel, insElderRelativesInfo.getLinkTel());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getPassword())) {
            chainWrapper.set(InsElderRelativesInfo::getPassword, insElderRelativesInfo.getPassword());
        }
        if (insElderRelativesInfo.getAuditState() != null) {
            chainWrapper.set(InsElderRelativesInfo::getAuditState, insElderRelativesInfo.getAuditState());
        }
        if (insElderRelativesInfo.getAuditId() != null) {
            chainWrapper.set(InsElderRelativesInfo::getAuditId, insElderRelativesInfo.getAuditId());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getAuditName())) {
            chainWrapper.set(InsElderRelativesInfo::getAuditName, insElderRelativesInfo.getAuditName());
        }
        if (insElderRelativesInfo.getAuditTime() != null) {
            chainWrapper.set(InsElderRelativesInfo::getAuditTime, insElderRelativesInfo.getAuditTime());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getAuditMemo())) {
            chainWrapper.set(InsElderRelativesInfo::getAuditMemo, insElderRelativesInfo.getAuditMemo());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getRemark())) {
            chainWrapper.set(InsElderRelativesInfo::getRemark, insElderRelativesInfo.getRemark());
        }
        if (insElderRelativesInfo.getCreateUser() != null) {
            chainWrapper.set(InsElderRelativesInfo::getCreateUser, insElderRelativesInfo.getCreateUser());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getCreateName())) {
            chainWrapper.set(InsElderRelativesInfo::getCreateName, insElderRelativesInfo.getCreateName());
        }
        if (insElderRelativesInfo.getCreateDept() != null) {
            chainWrapper.set(InsElderRelativesInfo::getCreateDept, insElderRelativesInfo.getCreateDept());
        }
        if (insElderRelativesInfo.getCreateTime() != null) {
            chainWrapper.set(InsElderRelativesInfo::getCreateTime, insElderRelativesInfo.getCreateTime());
        }
        if (insElderRelativesInfo.getUpdateUser() != null) {
            chainWrapper.set(InsElderRelativesInfo::getUpdateUser, insElderRelativesInfo.getUpdateUser());
        }
        if (insElderRelativesInfo.getUpdateTime() != null) {
            chainWrapper.set(InsElderRelativesInfo::getUpdateTime, insElderRelativesInfo.getUpdateTime());
        }
        if (insElderRelativesInfo.getIsDeleted() != null) {
            chainWrapper.set(InsElderRelativesInfo::getIsDeleted, insElderRelativesInfo.getIsDeleted());
        }
        if (insElderRelativesInfo.getStatus() != null) {
            chainWrapper.set(InsElderRelativesInfo::getStatus, insElderRelativesInfo.getStatus());
        }
        if (insElderRelativesInfo.getVideoId() != null) {
            chainWrapper.set(InsElderRelativesInfo::getVideoId, insElderRelativesInfo.getVideoId());
        }
        if (StringUtil.isNotBlank(insElderRelativesInfo.getIsOnline())) {
            chainWrapper.set(InsElderRelativesInfo::getIsOnline, insElderRelativesInfo.getIsOnline());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsElderRelativesInfo::getId, insElderRelativesInfo.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insElderRelativesInfo.getId());
        } else {
            return insElderRelativesInfo;
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
    public boolean saveInsElderRelativesInfoBatch(List<InsElderRelativesInfo> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsElderRelativesInfo insElderRelativesInfo : insertList) {
            //使用默认的雪花算法生成
            insElderRelativesInfo.setId(null);
            //insElderRelativesInfo.setCreatedDt(currentDte);
            //insElderRelativesInfo.setUpdatedDt(currentDte);
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
    public Integer deleteInsElderRelativesInfoBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsElderRelativesInfo> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


