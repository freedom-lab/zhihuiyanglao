package cn.pluss.platform.service.jcProcessGuide.impl;

import cn.pluss.platform.mapper.JcProcessGuideMapper;
import cn.pluss.platform.model.entity.JcProcessGuide;
import cn.pluss.platform.service.jcProcessGuide.JcProcessGuideService;
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
@Service("jcProcessGuideService")
public class JcProcessGuideServiceImpl extends ServiceImpl< JcProcessGuideMapper, JcProcessGuide> implements JcProcessGuideService {
    private static final Logger logger = LoggerFactory.getLogger(JcProcessGuideServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<JcProcessGuide> queryPage(Map map) {
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
    public JcProcessGuide queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param jcProcessGuide 实例对象
    * @return 实例对象
    */
    @Override
    public JcProcessGuide queryOne(JcProcessGuide jcProcessGuide){
        LambdaQueryWrapper<JcProcessGuide> queryWrapper = getQueryWrapper(jcProcessGuide);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param jcProcessGuide
    * @return
    */
    @Override
    public List<JcProcessGuide> queryList(JcProcessGuide jcProcessGuide) {
        LambdaQueryWrapper<JcProcessGuide> queryWrapper = getQueryWrapper(jcProcessGuide);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param jcProcessGuide
    * @return
    */
    public static LambdaQueryWrapper<JcProcessGuide> getQueryWrapper(JcProcessGuide jcProcessGuide){
        LambdaQueryWrapper<JcProcessGuide> queryWrapper = new LambdaQueryWrapper<>();
        if (jcProcessGuide.getId() != null) {
            queryWrapper.eq(JcProcessGuide::getId, jcProcessGuide.getId());
        }
        if (StringUtil.isNotEmpty(jcProcessGuide.getGuideType())) {
            queryWrapper.eq(JcProcessGuide::getGuideType, jcProcessGuide.getGuideType());
        }
        if (StringUtil.isNotEmpty(jcProcessGuide.getProcessName())) {
            queryWrapper.eq(JcProcessGuide::getProcessName, jcProcessGuide.getProcessName());
        }
        if (StringUtil.isNotEmpty(jcProcessGuide.getProcessImg())) {
            queryWrapper.eq(JcProcessGuide::getProcessImg, jcProcessGuide.getProcessImg());
        }
        if (StringUtil.isNotEmpty(jcProcessGuide.getContent())) {
            queryWrapper.eq(JcProcessGuide::getContent, jcProcessGuide.getContent());
        }
        if (StringUtil.isNotEmpty(jcProcessGuide.getFunctionPath())) {
            queryWrapper.eq(JcProcessGuide::getFunctionPath, jcProcessGuide.getFunctionPath());
        }
        if (jcProcessGuide.getSort() != null) {
            queryWrapper.eq(JcProcessGuide::getSort, jcProcessGuide.getSort());
        }
        if (jcProcessGuide.getCreateUser() != null) {
            queryWrapper.eq(JcProcessGuide::getCreateUser, jcProcessGuide.getCreateUser());
        }
        if (jcProcessGuide.getCreateDept() != null) {
            queryWrapper.eq(JcProcessGuide::getCreateDept, jcProcessGuide.getCreateDept());
        }
        if (jcProcessGuide.getCreateTime() != null) {
            queryWrapper.eq(JcProcessGuide::getCreateTime, jcProcessGuide.getCreateTime());
        }
        if (jcProcessGuide.getUpdateUser() != null) {
            queryWrapper.eq(JcProcessGuide::getUpdateUser, jcProcessGuide.getUpdateUser());
        }
        if (jcProcessGuide.getUpdateTime() != null) {
            queryWrapper.eq(JcProcessGuide::getUpdateTime, jcProcessGuide.getUpdateTime());
        }
        if (jcProcessGuide.getStatus() != null) {
            queryWrapper.eq(JcProcessGuide::getStatus, jcProcessGuide.getStatus());
        }
        if (jcProcessGuide.getIsDeleted() != null) {
            queryWrapper.eq(JcProcessGuide::getIsDeleted, jcProcessGuide.getIsDeleted());
        }
        if (StringUtil.isNotEmpty(jcProcessGuide.getRemark())) {
            queryWrapper.eq(JcProcessGuide::getRemark, jcProcessGuide.getRemark());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param jcProcessGuide 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public JcProcessGuide insert(JcProcessGuide jcProcessGuide) {
        jcProcessGuide.setId(null);
        getBaseMapper().insert(jcProcessGuide);
        return jcProcessGuide;
    }

    /**
    * 更新数据
    *
    * @param jcProcessGuide 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public JcProcessGuide update(JcProcessGuide jcProcessGuide) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<JcProcessGuide> chainWrapper = new LambdaUpdateChainWrapper<JcProcessGuide>(getBaseMapper());
        if (jcProcessGuide.getId() != null) {
            chainWrapper.set(JcProcessGuide::getId, jcProcessGuide.getId());
        }
        if (StringUtil.isNotBlank(jcProcessGuide.getGuideType())) {
            chainWrapper.set(JcProcessGuide::getGuideType, jcProcessGuide.getGuideType());
        }
        if (StringUtil.isNotBlank(jcProcessGuide.getProcessName())) {
            chainWrapper.set(JcProcessGuide::getProcessName, jcProcessGuide.getProcessName());
        }
        if (StringUtil.isNotBlank(jcProcessGuide.getProcessImg())) {
            chainWrapper.set(JcProcessGuide::getProcessImg, jcProcessGuide.getProcessImg());
        }
        if (StringUtil.isNotBlank(jcProcessGuide.getContent())) {
            chainWrapper.set(JcProcessGuide::getContent, jcProcessGuide.getContent());
        }
        if (StringUtil.isNotBlank(jcProcessGuide.getFunctionPath())) {
            chainWrapper.set(JcProcessGuide::getFunctionPath, jcProcessGuide.getFunctionPath());
        }
        if (jcProcessGuide.getSort() != null) {
            chainWrapper.set(JcProcessGuide::getSort, jcProcessGuide.getSort());
        }
        if (jcProcessGuide.getCreateUser() != null) {
            chainWrapper.set(JcProcessGuide::getCreateUser, jcProcessGuide.getCreateUser());
        }
        if (jcProcessGuide.getCreateDept() != null) {
            chainWrapper.set(JcProcessGuide::getCreateDept, jcProcessGuide.getCreateDept());
        }
        if (jcProcessGuide.getCreateTime() != null) {
            chainWrapper.set(JcProcessGuide::getCreateTime, jcProcessGuide.getCreateTime());
        }
        if (jcProcessGuide.getUpdateUser() != null) {
            chainWrapper.set(JcProcessGuide::getUpdateUser, jcProcessGuide.getUpdateUser());
        }
        if (jcProcessGuide.getUpdateTime() != null) {
            chainWrapper.set(JcProcessGuide::getUpdateTime, jcProcessGuide.getUpdateTime());
        }
        if (jcProcessGuide.getStatus() != null) {
            chainWrapper.set(JcProcessGuide::getStatus, jcProcessGuide.getStatus());
        }
        if (jcProcessGuide.getIsDeleted() != null) {
            chainWrapper.set(JcProcessGuide::getIsDeleted, jcProcessGuide.getIsDeleted());
        }
        if (StringUtil.isNotBlank(jcProcessGuide.getRemark())) {
            chainWrapper.set(JcProcessGuide::getRemark, jcProcessGuide.getRemark());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(JcProcessGuide::getId, jcProcessGuide.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(jcProcessGuide.getId());
        } else {
            return jcProcessGuide;
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
    public boolean saveJcProcessGuideBatch(List<JcProcessGuide> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (JcProcessGuide jcProcessGuide : insertList) {
            //使用默认的雪花算法生成
            jcProcessGuide.setId(null);
            //jcProcessGuide.setCreatedDt(currentDte);
            //jcProcessGuide.setUpdatedDt(currentDte);
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
    public Integer deleteJcProcessGuideBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<JcProcessGuide> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


