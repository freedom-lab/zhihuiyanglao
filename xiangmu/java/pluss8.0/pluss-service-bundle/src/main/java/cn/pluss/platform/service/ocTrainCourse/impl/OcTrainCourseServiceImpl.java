package cn.pluss.platform.service.ocTrainCourse.impl;

import cn.pluss.platform.mapper.OcTrainCourseMapper;
import cn.pluss.platform.model.entity.OcTrainCourse;
import cn.pluss.platform.service.ocTrainCourse.OcTrainCourseService;
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
@Service("ocTrainCourseService")
public class OcTrainCourseServiceImpl extends ServiceImpl< OcTrainCourseMapper, OcTrainCourse> implements OcTrainCourseService {
    private static final Logger logger = LoggerFactory.getLogger(OcTrainCourseServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<OcTrainCourse> queryPage(Map map) {
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
    public OcTrainCourse queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param ocTrainCourse 实例对象
    * @return 实例对象
    */
    @Override
    public OcTrainCourse queryOne(OcTrainCourse ocTrainCourse){
        LambdaQueryWrapper<OcTrainCourse> queryWrapper = getQueryWrapper(ocTrainCourse);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param ocTrainCourse
    * @return
    */
    @Override
    public List<OcTrainCourse> queryList(OcTrainCourse ocTrainCourse) {
        LambdaQueryWrapper<OcTrainCourse> queryWrapper = getQueryWrapper(ocTrainCourse);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param ocTrainCourse
    * @return
    */
    public static LambdaQueryWrapper<OcTrainCourse> getQueryWrapper(OcTrainCourse ocTrainCourse){
        LambdaQueryWrapper<OcTrainCourse> queryWrapper = new LambdaQueryWrapper<>();
        if (ocTrainCourse.getId() != null) {
            queryWrapper.eq(OcTrainCourse::getId, ocTrainCourse.getId());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getTenantId())) {
            queryWrapper.eq(OcTrainCourse::getTenantId, ocTrainCourse.getTenantId());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getCourseName())) {
            queryWrapper.eq(OcTrainCourse::getCourseName, ocTrainCourse.getCourseName());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getCourseBrief())) {
            queryWrapper.eq(OcTrainCourse::getCourseBrief, ocTrainCourse.getCourseBrief());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getCourseTarget())) {
            queryWrapper.eq(OcTrainCourse::getCourseTarget, ocTrainCourse.getCourseTarget());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getCourseObject())) {
            queryWrapper.eq(OcTrainCourse::getCourseObject, ocTrainCourse.getCourseObject());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getCourseLevel())) {
            queryWrapper.eq(OcTrainCourse::getCourseLevel, ocTrainCourse.getCourseLevel());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getCreateName())) {
            queryWrapper.eq(OcTrainCourse::getCreateName, ocTrainCourse.getCreateName());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getIsPublish())) {
            queryWrapper.eq(OcTrainCourse::getIsPublish, ocTrainCourse.getIsPublish());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getCourseImg())) {
            queryWrapper.eq(OcTrainCourse::getCourseImg, ocTrainCourse.getCourseImg());
        }
        if (ocTrainCourse.getAreaCode() != null) {
            queryWrapper.eq(OcTrainCourse::getAreaCode, ocTrainCourse.getAreaCode());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getAreaName())) {
            queryWrapper.eq(OcTrainCourse::getAreaName, ocTrainCourse.getAreaName());
        }
        if (StringUtil.isNotEmpty(ocTrainCourse.getRemark())) {
            queryWrapper.eq(OcTrainCourse::getRemark, ocTrainCourse.getRemark());
        }
        if (ocTrainCourse.getCreateUser() != null) {
            queryWrapper.eq(OcTrainCourse::getCreateUser, ocTrainCourse.getCreateUser());
        }
        if (ocTrainCourse.getCreateDept() != null) {
            queryWrapper.eq(OcTrainCourse::getCreateDept, ocTrainCourse.getCreateDept());
        }
        if (ocTrainCourse.getCreateTime() != null) {
            queryWrapper.eq(OcTrainCourse::getCreateTime, ocTrainCourse.getCreateTime());
        }
        if (ocTrainCourse.getUpdateUser() != null) {
            queryWrapper.eq(OcTrainCourse::getUpdateUser, ocTrainCourse.getUpdateUser());
        }
        if (ocTrainCourse.getUpdateTime() != null) {
            queryWrapper.eq(OcTrainCourse::getUpdateTime, ocTrainCourse.getUpdateTime());
        }
        if (ocTrainCourse.getIsDeleted() != null) {
            queryWrapper.eq(OcTrainCourse::getIsDeleted, ocTrainCourse.getIsDeleted());
        }
        if (ocTrainCourse.getStatus() != null) {
            queryWrapper.eq(OcTrainCourse::getStatus, ocTrainCourse.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param ocTrainCourse 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public OcTrainCourse insert(OcTrainCourse ocTrainCourse) {
        ocTrainCourse.setId(null);
        getBaseMapper().insert(ocTrainCourse);
        return ocTrainCourse;
    }

    /**
    * 更新数据
    *
    * @param ocTrainCourse 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public OcTrainCourse update(OcTrainCourse ocTrainCourse) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<OcTrainCourse> chainWrapper = new LambdaUpdateChainWrapper<OcTrainCourse>(getBaseMapper());
        if (ocTrainCourse.getId() != null) {
            chainWrapper.set(OcTrainCourse::getId, ocTrainCourse.getId());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getTenantId())) {
            chainWrapper.set(OcTrainCourse::getTenantId, ocTrainCourse.getTenantId());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getCourseName())) {
            chainWrapper.set(OcTrainCourse::getCourseName, ocTrainCourse.getCourseName());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getCourseBrief())) {
            chainWrapper.set(OcTrainCourse::getCourseBrief, ocTrainCourse.getCourseBrief());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getCourseTarget())) {
            chainWrapper.set(OcTrainCourse::getCourseTarget, ocTrainCourse.getCourseTarget());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getCourseObject())) {
            chainWrapper.set(OcTrainCourse::getCourseObject, ocTrainCourse.getCourseObject());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getCourseLevel())) {
            chainWrapper.set(OcTrainCourse::getCourseLevel, ocTrainCourse.getCourseLevel());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getCreateName())) {
            chainWrapper.set(OcTrainCourse::getCreateName, ocTrainCourse.getCreateName());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getIsPublish())) {
            chainWrapper.set(OcTrainCourse::getIsPublish, ocTrainCourse.getIsPublish());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getCourseImg())) {
            chainWrapper.set(OcTrainCourse::getCourseImg, ocTrainCourse.getCourseImg());
        }
        if (ocTrainCourse.getAreaCode() != null) {
            chainWrapper.set(OcTrainCourse::getAreaCode, ocTrainCourse.getAreaCode());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getAreaName())) {
            chainWrapper.set(OcTrainCourse::getAreaName, ocTrainCourse.getAreaName());
        }
        if (StringUtil.isNotBlank(ocTrainCourse.getRemark())) {
            chainWrapper.set(OcTrainCourse::getRemark, ocTrainCourse.getRemark());
        }
        if (ocTrainCourse.getCreateUser() != null) {
            chainWrapper.set(OcTrainCourse::getCreateUser, ocTrainCourse.getCreateUser());
        }
        if (ocTrainCourse.getCreateDept() != null) {
            chainWrapper.set(OcTrainCourse::getCreateDept, ocTrainCourse.getCreateDept());
        }
        if (ocTrainCourse.getCreateTime() != null) {
            chainWrapper.set(OcTrainCourse::getCreateTime, ocTrainCourse.getCreateTime());
        }
        if (ocTrainCourse.getUpdateUser() != null) {
            chainWrapper.set(OcTrainCourse::getUpdateUser, ocTrainCourse.getUpdateUser());
        }
        if (ocTrainCourse.getUpdateTime() != null) {
            chainWrapper.set(OcTrainCourse::getUpdateTime, ocTrainCourse.getUpdateTime());
        }
        if (ocTrainCourse.getIsDeleted() != null) {
            chainWrapper.set(OcTrainCourse::getIsDeleted, ocTrainCourse.getIsDeleted());
        }
        if (ocTrainCourse.getStatus() != null) {
            chainWrapper.set(OcTrainCourse::getStatus, ocTrainCourse.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(OcTrainCourse::getId, ocTrainCourse.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(ocTrainCourse.getId());
        } else {
            return ocTrainCourse;
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
    public boolean saveOcTrainCourseBatch(List<OcTrainCourse> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (OcTrainCourse ocTrainCourse : insertList) {
            //使用默认的雪花算法生成
            ocTrainCourse.setId(null);
            //ocTrainCourse.setCreatedDt(currentDte);
            //ocTrainCourse.setUpdatedDt(currentDte);
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
    public Integer deleteOcTrainCourseBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<OcTrainCourse> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


