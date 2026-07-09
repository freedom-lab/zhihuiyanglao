package cn.pluss.platform.service.jcUserFunction.impl;

import cn.pluss.platform.mapper.JcUserFunctionMapper;
import cn.pluss.platform.model.entity.JcUserFunction;
import cn.pluss.platform.service.jcUserFunction.JcUserFunctionService;
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
@Service("jcUserFunctionService")
public class JcUserFunctionServiceImpl extends ServiceImpl< JcUserFunctionMapper, JcUserFunction> implements JcUserFunctionService {
    private static final Logger logger = LoggerFactory.getLogger(JcUserFunctionServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<JcUserFunction> queryPage(Map map) {
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
    public JcUserFunction queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param jcUserFunction 实例对象
    * @return 实例对象
    */
    @Override
    public JcUserFunction queryOne(JcUserFunction jcUserFunction){
        LambdaQueryWrapper<JcUserFunction> queryWrapper = getQueryWrapper(jcUserFunction);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param jcUserFunction
    * @return
    */
    @Override
    public List<JcUserFunction> queryList(JcUserFunction jcUserFunction) {
        LambdaQueryWrapper<JcUserFunction> queryWrapper = getQueryWrapper(jcUserFunction);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param jcUserFunction
    * @return
    */
    public static LambdaQueryWrapper<JcUserFunction> getQueryWrapper(JcUserFunction jcUserFunction){
        LambdaQueryWrapper<JcUserFunction> queryWrapper = new LambdaQueryWrapper<>();
        if (jcUserFunction.getId() != null) {
            queryWrapper.eq(JcUserFunction::getId, jcUserFunction.getId());
        }
        if (StringUtil.isNotEmpty(jcUserFunction.getTenantId())) {
            queryWrapper.eq(JcUserFunction::getTenantId, jcUserFunction.getTenantId());
        }
        if (StringUtil.isNotEmpty(jcUserFunction.getFunctionName())) {
            queryWrapper.eq(JcUserFunction::getFunctionName, jcUserFunction.getFunctionName());
        }
        if (StringUtil.isNotEmpty(jcUserFunction.getFunctionImg())) {
            queryWrapper.eq(JcUserFunction::getFunctionImg, jcUserFunction.getFunctionImg());
        }
        if (StringUtil.isNotEmpty(jcUserFunction.getFunctionPath())) {
            queryWrapper.eq(JcUserFunction::getFunctionPath, jcUserFunction.getFunctionPath());
        }
        if (jcUserFunction.getMenuId() != null) {
            queryWrapper.eq(JcUserFunction::getMenuId, jcUserFunction.getMenuId());
        }
        if (jcUserFunction.getCreateUser() != null) {
            queryWrapper.eq(JcUserFunction::getCreateUser, jcUserFunction.getCreateUser());
        }
        if (jcUserFunction.getCreateDept() != null) {
            queryWrapper.eq(JcUserFunction::getCreateDept, jcUserFunction.getCreateDept());
        }
        if (jcUserFunction.getCreateTime() != null) {
            queryWrapper.eq(JcUserFunction::getCreateTime, jcUserFunction.getCreateTime());
        }
        if (jcUserFunction.getUpdateUser() != null) {
            queryWrapper.eq(JcUserFunction::getUpdateUser, jcUserFunction.getUpdateUser());
        }
        if (jcUserFunction.getUpdateTime() != null) {
            queryWrapper.eq(JcUserFunction::getUpdateTime, jcUserFunction.getUpdateTime());
        }
        if (jcUserFunction.getStatus() != null) {
            queryWrapper.eq(JcUserFunction::getStatus, jcUserFunction.getStatus());
        }
        if (jcUserFunction.getIsDeleted() != null) {
            queryWrapper.eq(JcUserFunction::getIsDeleted, jcUserFunction.getIsDeleted());
        }
        if (StringUtil.isNotEmpty(jcUserFunction.getRemark())) {
            queryWrapper.eq(JcUserFunction::getRemark, jcUserFunction.getRemark());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param jcUserFunction 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public JcUserFunction insert(JcUserFunction jcUserFunction) {
        jcUserFunction.setId(null);
        getBaseMapper().insert(jcUserFunction);
        return jcUserFunction;
    }

    /**
    * 更新数据
    *
    * @param jcUserFunction 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public JcUserFunction update(JcUserFunction jcUserFunction) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<JcUserFunction> chainWrapper = new LambdaUpdateChainWrapper<JcUserFunction>(getBaseMapper());
        if (jcUserFunction.getId() != null) {
            chainWrapper.set(JcUserFunction::getId, jcUserFunction.getId());
        }
        if (StringUtil.isNotBlank(jcUserFunction.getTenantId())) {
            chainWrapper.set(JcUserFunction::getTenantId, jcUserFunction.getTenantId());
        }
        if (StringUtil.isNotBlank(jcUserFunction.getFunctionName())) {
            chainWrapper.set(JcUserFunction::getFunctionName, jcUserFunction.getFunctionName());
        }
        if (StringUtil.isNotBlank(jcUserFunction.getFunctionImg())) {
            chainWrapper.set(JcUserFunction::getFunctionImg, jcUserFunction.getFunctionImg());
        }
        if (StringUtil.isNotBlank(jcUserFunction.getFunctionPath())) {
            chainWrapper.set(JcUserFunction::getFunctionPath, jcUserFunction.getFunctionPath());
        }
        if (jcUserFunction.getMenuId() != null) {
            chainWrapper.set(JcUserFunction::getMenuId, jcUserFunction.getMenuId());
        }
        if (jcUserFunction.getCreateUser() != null) {
            chainWrapper.set(JcUserFunction::getCreateUser, jcUserFunction.getCreateUser());
        }
        if (jcUserFunction.getCreateDept() != null) {
            chainWrapper.set(JcUserFunction::getCreateDept, jcUserFunction.getCreateDept());
        }
        if (jcUserFunction.getCreateTime() != null) {
            chainWrapper.set(JcUserFunction::getCreateTime, jcUserFunction.getCreateTime());
        }
        if (jcUserFunction.getUpdateUser() != null) {
            chainWrapper.set(JcUserFunction::getUpdateUser, jcUserFunction.getUpdateUser());
        }
        if (jcUserFunction.getUpdateTime() != null) {
            chainWrapper.set(JcUserFunction::getUpdateTime, jcUserFunction.getUpdateTime());
        }
        if (jcUserFunction.getStatus() != null) {
            chainWrapper.set(JcUserFunction::getStatus, jcUserFunction.getStatus());
        }
        if (jcUserFunction.getIsDeleted() != null) {
            chainWrapper.set(JcUserFunction::getIsDeleted, jcUserFunction.getIsDeleted());
        }
        if (StringUtil.isNotBlank(jcUserFunction.getRemark())) {
            chainWrapper.set(JcUserFunction::getRemark, jcUserFunction.getRemark());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(JcUserFunction::getId, jcUserFunction.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(jcUserFunction.getId());
        } else {
            return jcUserFunction;
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
    public boolean saveJcUserFunctionBatch(List<JcUserFunction> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (JcUserFunction jcUserFunction : insertList) {
            //使用默认的雪花算法生成
            jcUserFunction.setId(null);
            //jcUserFunction.setCreatedDt(currentDte);
            //jcUserFunction.setUpdatedDt(currentDte);
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
    public Integer deleteJcUserFunctionBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<JcUserFunction> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


