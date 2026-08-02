package cn.pluss.platform.service.jcSmsTemplet.impl;

import cn.pluss.platform.mapper.JcSmsTempletMapper;
import cn.pluss.platform.model.entity.JcSmsTemplet;
import cn.pluss.platform.service.jcSmsTemplet.JcSmsTempletService;
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
@Service("jcSmsTempletService")
public class JcSmsTempletServiceImpl extends ServiceImpl< JcSmsTempletMapper, JcSmsTemplet> implements JcSmsTempletService {
    private static final Logger logger = LoggerFactory.getLogger(JcSmsTempletServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<JcSmsTemplet> queryPage(Map map) {
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
    public JcSmsTemplet queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param jcSmsTemplet 实例对象
    * @return 实例对象
    */
    @Override
    public JcSmsTemplet queryOne(JcSmsTemplet jcSmsTemplet){
        LambdaQueryWrapper<JcSmsTemplet> queryWrapper = getQueryWrapper(jcSmsTemplet);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param jcSmsTemplet
    * @return
    */
    @Override
    public List<JcSmsTemplet> queryList(JcSmsTemplet jcSmsTemplet) {
        LambdaQueryWrapper<JcSmsTemplet> queryWrapper = getQueryWrapper(jcSmsTemplet);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param jcSmsTemplet
    * @return
    */
    public static LambdaQueryWrapper<JcSmsTemplet> getQueryWrapper(JcSmsTemplet jcSmsTemplet){
        LambdaQueryWrapper<JcSmsTemplet> queryWrapper = new LambdaQueryWrapper<>();
        if (jcSmsTemplet.getId() != null) {
            queryWrapper.eq(JcSmsTemplet::getId, jcSmsTemplet.getId());
        }
        if (StringUtil.isNotEmpty(jcSmsTemplet.getTenantId())) {
            queryWrapper.eq(JcSmsTemplet::getTenantId, jcSmsTemplet.getTenantId());
        }
        if (jcSmsTemplet.getInstitutionId() != null) {
            queryWrapper.eq(JcSmsTemplet::getInstitutionId, jcSmsTemplet.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(jcSmsTemplet.getInstitutionName())) {
            queryWrapper.eq(JcSmsTemplet::getInstitutionName, jcSmsTemplet.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(jcSmsTemplet.getTempletName())) {
            queryWrapper.eq(JcSmsTemplet::getTempletName, jcSmsTemplet.getTempletName());
        }
        if (jcSmsTemplet.getTempletCode() != null) {
            queryWrapper.eq(JcSmsTemplet::getTempletCode, jcSmsTemplet.getTempletCode());
        }
        if (StringUtil.isNotEmpty(jcSmsTemplet.getSmsContext())) {
            queryWrapper.eq(JcSmsTemplet::getSmsContext, jcSmsTemplet.getSmsContext());
        }
        if (jcSmsTemplet.getTempletType() != null) {
            queryWrapper.eq(JcSmsTemplet::getTempletType, jcSmsTemplet.getTempletType());
        }
        if (StringUtil.isNotEmpty(jcSmsTemplet.getRemark())) {
            queryWrapper.eq(JcSmsTemplet::getRemark, jcSmsTemplet.getRemark());
        }
        if (jcSmsTemplet.getCreateUser() != null) {
            queryWrapper.eq(JcSmsTemplet::getCreateUser, jcSmsTemplet.getCreateUser());
        }
        if (jcSmsTemplet.getCreateDept() != null) {
            queryWrapper.eq(JcSmsTemplet::getCreateDept, jcSmsTemplet.getCreateDept());
        }
        if (jcSmsTemplet.getCreateTime() != null) {
            queryWrapper.eq(JcSmsTemplet::getCreateTime, jcSmsTemplet.getCreateTime());
        }
        if (jcSmsTemplet.getUpdateUser() != null) {
            queryWrapper.eq(JcSmsTemplet::getUpdateUser, jcSmsTemplet.getUpdateUser());
        }
        if (jcSmsTemplet.getUpdateTime() != null) {
            queryWrapper.eq(JcSmsTemplet::getUpdateTime, jcSmsTemplet.getUpdateTime());
        }
        if (jcSmsTemplet.getIsDeleted() != null) {
            queryWrapper.eq(JcSmsTemplet::getIsDeleted, jcSmsTemplet.getIsDeleted());
        }
        if (jcSmsTemplet.getStatus() != null) {
            queryWrapper.eq(JcSmsTemplet::getStatus, jcSmsTemplet.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param jcSmsTemplet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public JcSmsTemplet insert(JcSmsTemplet jcSmsTemplet) {
        jcSmsTemplet.setId(null);
        getBaseMapper().insert(jcSmsTemplet);
        return jcSmsTemplet;
    }

    /**
    * 更新数据
    *
    * @param jcSmsTemplet 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public JcSmsTemplet update(JcSmsTemplet jcSmsTemplet) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<JcSmsTemplet> chainWrapper = new LambdaUpdateChainWrapper<JcSmsTemplet>(getBaseMapper());
        if (jcSmsTemplet.getId() != null) {
            chainWrapper.set(JcSmsTemplet::getId, jcSmsTemplet.getId());
        }
        if (StringUtil.isNotBlank(jcSmsTemplet.getTenantId())) {
            chainWrapper.set(JcSmsTemplet::getTenantId, jcSmsTemplet.getTenantId());
        }
        if (jcSmsTemplet.getInstitutionId() != null) {
            chainWrapper.set(JcSmsTemplet::getInstitutionId, jcSmsTemplet.getInstitutionId());
        }
        if (StringUtil.isNotBlank(jcSmsTemplet.getInstitutionName())) {
            chainWrapper.set(JcSmsTemplet::getInstitutionName, jcSmsTemplet.getInstitutionName());
        }
        if (StringUtil.isNotBlank(jcSmsTemplet.getTempletName())) {
            chainWrapper.set(JcSmsTemplet::getTempletName, jcSmsTemplet.getTempletName());
        }
        if (jcSmsTemplet.getTempletCode() != null) {
            chainWrapper.set(JcSmsTemplet::getTempletCode, jcSmsTemplet.getTempletCode());
        }
        if (StringUtil.isNotBlank(jcSmsTemplet.getSmsContext())) {
            chainWrapper.set(JcSmsTemplet::getSmsContext, jcSmsTemplet.getSmsContext());
        }
        if (jcSmsTemplet.getTempletType() != null) {
            chainWrapper.set(JcSmsTemplet::getTempletType, jcSmsTemplet.getTempletType());
        }
        if (StringUtil.isNotBlank(jcSmsTemplet.getRemark())) {
            chainWrapper.set(JcSmsTemplet::getRemark, jcSmsTemplet.getRemark());
        }
        if (jcSmsTemplet.getCreateUser() != null) {
            chainWrapper.set(JcSmsTemplet::getCreateUser, jcSmsTemplet.getCreateUser());
        }
        if (jcSmsTemplet.getCreateDept() != null) {
            chainWrapper.set(JcSmsTemplet::getCreateDept, jcSmsTemplet.getCreateDept());
        }
        if (jcSmsTemplet.getCreateTime() != null) {
            chainWrapper.set(JcSmsTemplet::getCreateTime, jcSmsTemplet.getCreateTime());
        }
        if (jcSmsTemplet.getUpdateUser() != null) {
            chainWrapper.set(JcSmsTemplet::getUpdateUser, jcSmsTemplet.getUpdateUser());
        }
        if (jcSmsTemplet.getUpdateTime() != null) {
            chainWrapper.set(JcSmsTemplet::getUpdateTime, jcSmsTemplet.getUpdateTime());
        }
        if (jcSmsTemplet.getIsDeleted() != null) {
            chainWrapper.set(JcSmsTemplet::getIsDeleted, jcSmsTemplet.getIsDeleted());
        }
        if (jcSmsTemplet.getStatus() != null) {
            chainWrapper.set(JcSmsTemplet::getStatus, jcSmsTemplet.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(JcSmsTemplet::getId, jcSmsTemplet.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(jcSmsTemplet.getId());
        } else {
            return jcSmsTemplet;
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
    public boolean saveJcSmsTempletBatch(List<JcSmsTemplet> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (JcSmsTemplet jcSmsTemplet : insertList) {
            //使用默认的雪花算法生成
            jcSmsTemplet.setId(null);
            //jcSmsTemplet.setCreatedDt(currentDte);
            //jcSmsTemplet.setUpdatedDt(currentDte);
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
    public Integer deleteJcSmsTempletBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<JcSmsTemplet> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


