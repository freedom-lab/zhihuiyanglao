package cn.pluss.platform.service.jcSmsSend.impl;

import cn.pluss.platform.mapper.JcSmsSendMapper;
import cn.pluss.platform.model.entity.JcSmsSend;
import cn.pluss.platform.service.jcSmsSend.JcSmsSendService;
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
@Service("jcSmsSendService")
public class JcSmsSendServiceImpl extends ServiceImpl< JcSmsSendMapper, JcSmsSend> implements JcSmsSendService {
    private static final Logger logger = LoggerFactory.getLogger(JcSmsSendServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<JcSmsSend> queryPage(Map map) {
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
    public JcSmsSend queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param jcSmsSend 实例对象
    * @return 实例对象
    */
    @Override
    public JcSmsSend queryOne(JcSmsSend jcSmsSend){
        LambdaQueryWrapper<JcSmsSend> queryWrapper = getQueryWrapper(jcSmsSend);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param jcSmsSend
    * @return
    */
    @Override
    public List<JcSmsSend> queryList(JcSmsSend jcSmsSend) {
        LambdaQueryWrapper<JcSmsSend> queryWrapper = getQueryWrapper(jcSmsSend);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param jcSmsSend
    * @return
    */
    public static LambdaQueryWrapper<JcSmsSend> getQueryWrapper(JcSmsSend jcSmsSend){
        LambdaQueryWrapper<JcSmsSend> queryWrapper = new LambdaQueryWrapper<>();
        if (jcSmsSend.getId() != null) {
            queryWrapper.eq(JcSmsSend::getId, jcSmsSend.getId());
        }
        if (StringUtil.isNotEmpty(jcSmsSend.getTenantId())) {
            queryWrapper.eq(JcSmsSend::getTenantId, jcSmsSend.getTenantId());
        }
        if (jcSmsSend.getInstitutionId() != null) {
            queryWrapper.eq(JcSmsSend::getInstitutionId, jcSmsSend.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(jcSmsSend.getInstitutionName())) {
            queryWrapper.eq(JcSmsSend::getInstitutionName, jcSmsSend.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(jcSmsSend.getTelNum())) {
            queryWrapper.eq(JcSmsSend::getTelNum, jcSmsSend.getTelNum());
        }
        if (jcSmsSend.getTempletId() != null) {
            queryWrapper.eq(JcSmsSend::getTempletId, jcSmsSend.getTempletId());
        }
        if (StringUtil.isNotEmpty(jcSmsSend.getSmsContext())) {
            queryWrapper.eq(JcSmsSend::getSmsContext, jcSmsSend.getSmsContext());
        }
        if (jcSmsSend.getSendState() != null) {
            queryWrapper.eq(JcSmsSend::getSendState, jcSmsSend.getSendState());
        }
        if (StringUtil.isNotEmpty(jcSmsSend.getSendResult())) {
            queryWrapper.eq(JcSmsSend::getSendResult, jcSmsSend.getSendResult());
        }
        if (jcSmsSend.getSendTime() != null) {
            queryWrapper.eq(JcSmsSend::getSendTime, jcSmsSend.getSendTime());
        }
        if (jcSmsSend.getSendType() != null) {
            queryWrapper.eq(JcSmsSend::getSendType, jcSmsSend.getSendType());
        }
        if (jcSmsSend.getLogId() != null) {
            queryWrapper.eq(JcSmsSend::getLogId, jcSmsSend.getLogId());
        }
        if (StringUtil.isNotEmpty(jcSmsSend.getIp())) {
            queryWrapper.eq(JcSmsSend::getIp, jcSmsSend.getIp());
        }
        if (StringUtil.isNotEmpty(jcSmsSend.getRemark())) {
            queryWrapper.eq(JcSmsSend::getRemark, jcSmsSend.getRemark());
        }
        if (jcSmsSend.getCreateUser() != null) {
            queryWrapper.eq(JcSmsSend::getCreateUser, jcSmsSend.getCreateUser());
        }
        if (jcSmsSend.getCreateDept() != null) {
            queryWrapper.eq(JcSmsSend::getCreateDept, jcSmsSend.getCreateDept());
        }
        if (jcSmsSend.getCreateTime() != null) {
            queryWrapper.eq(JcSmsSend::getCreateTime, jcSmsSend.getCreateTime());
        }
        if (jcSmsSend.getUpdateUser() != null) {
            queryWrapper.eq(JcSmsSend::getUpdateUser, jcSmsSend.getUpdateUser());
        }
        if (jcSmsSend.getUpdateTime() != null) {
            queryWrapper.eq(JcSmsSend::getUpdateTime, jcSmsSend.getUpdateTime());
        }
        if (jcSmsSend.getIsDeleted() != null) {
            queryWrapper.eq(JcSmsSend::getIsDeleted, jcSmsSend.getIsDeleted());
        }
        if (jcSmsSend.getStatus() != null) {
            queryWrapper.eq(JcSmsSend::getStatus, jcSmsSend.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param jcSmsSend 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public JcSmsSend insert(JcSmsSend jcSmsSend) {
        jcSmsSend.setId(null);
        getBaseMapper().insert(jcSmsSend);
        return jcSmsSend;
    }

    /**
    * 更新数据
    *
    * @param jcSmsSend 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public JcSmsSend update(JcSmsSend jcSmsSend) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<JcSmsSend> chainWrapper = new LambdaUpdateChainWrapper<JcSmsSend>(getBaseMapper());
        if (jcSmsSend.getId() != null) {
            chainWrapper.set(JcSmsSend::getId, jcSmsSend.getId());
        }
        if (StringUtil.isNotBlank(jcSmsSend.getTenantId())) {
            chainWrapper.set(JcSmsSend::getTenantId, jcSmsSend.getTenantId());
        }
        if (jcSmsSend.getInstitutionId() != null) {
            chainWrapper.set(JcSmsSend::getInstitutionId, jcSmsSend.getInstitutionId());
        }
        if (StringUtil.isNotBlank(jcSmsSend.getInstitutionName())) {
            chainWrapper.set(JcSmsSend::getInstitutionName, jcSmsSend.getInstitutionName());
        }
        if (StringUtil.isNotBlank(jcSmsSend.getTelNum())) {
            chainWrapper.set(JcSmsSend::getTelNum, jcSmsSend.getTelNum());
        }
        if (jcSmsSend.getTempletId() != null) {
            chainWrapper.set(JcSmsSend::getTempletId, jcSmsSend.getTempletId());
        }
        if (StringUtil.isNotBlank(jcSmsSend.getSmsContext())) {
            chainWrapper.set(JcSmsSend::getSmsContext, jcSmsSend.getSmsContext());
        }
        if (jcSmsSend.getSendState() != null) {
            chainWrapper.set(JcSmsSend::getSendState, jcSmsSend.getSendState());
        }
        if (StringUtil.isNotBlank(jcSmsSend.getSendResult())) {
            chainWrapper.set(JcSmsSend::getSendResult, jcSmsSend.getSendResult());
        }
        if (jcSmsSend.getSendTime() != null) {
            chainWrapper.set(JcSmsSend::getSendTime, jcSmsSend.getSendTime());
        }
        if (jcSmsSend.getSendType() != null) {
            chainWrapper.set(JcSmsSend::getSendType, jcSmsSend.getSendType());
        }
        if (jcSmsSend.getLogId() != null) {
            chainWrapper.set(JcSmsSend::getLogId, jcSmsSend.getLogId());
        }
        if (StringUtil.isNotBlank(jcSmsSend.getIp())) {
            chainWrapper.set(JcSmsSend::getIp, jcSmsSend.getIp());
        }
        if (StringUtil.isNotBlank(jcSmsSend.getRemark())) {
            chainWrapper.set(JcSmsSend::getRemark, jcSmsSend.getRemark());
        }
        if (jcSmsSend.getCreateUser() != null) {
            chainWrapper.set(JcSmsSend::getCreateUser, jcSmsSend.getCreateUser());
        }
        if (jcSmsSend.getCreateDept() != null) {
            chainWrapper.set(JcSmsSend::getCreateDept, jcSmsSend.getCreateDept());
        }
        if (jcSmsSend.getCreateTime() != null) {
            chainWrapper.set(JcSmsSend::getCreateTime, jcSmsSend.getCreateTime());
        }
        if (jcSmsSend.getUpdateUser() != null) {
            chainWrapper.set(JcSmsSend::getUpdateUser, jcSmsSend.getUpdateUser());
        }
        if (jcSmsSend.getUpdateTime() != null) {
            chainWrapper.set(JcSmsSend::getUpdateTime, jcSmsSend.getUpdateTime());
        }
        if (jcSmsSend.getIsDeleted() != null) {
            chainWrapper.set(JcSmsSend::getIsDeleted, jcSmsSend.getIsDeleted());
        }
        if (jcSmsSend.getStatus() != null) {
            chainWrapper.set(JcSmsSend::getStatus, jcSmsSend.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(JcSmsSend::getId, jcSmsSend.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(jcSmsSend.getId());
        } else {
            return jcSmsSend;
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
    public boolean saveJcSmsSendBatch(List<JcSmsSend> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (JcSmsSend jcSmsSend : insertList) {
            //使用默认的雪花算法生成
            jcSmsSend.setId(null);
            //jcSmsSend.setCreatedDt(currentDte);
            //jcSmsSend.setUpdatedDt(currentDte);
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
    public Integer deleteJcSmsSendBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<JcSmsSend> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


