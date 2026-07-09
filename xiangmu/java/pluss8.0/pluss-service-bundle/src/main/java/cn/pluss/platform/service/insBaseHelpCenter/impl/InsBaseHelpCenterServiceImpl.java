package cn.pluss.platform.service.insBaseHelpCenter.impl;

import cn.pluss.platform.mapper.InsBaseHelpCenterMapper;
import cn.pluss.platform.model.entity.InsBaseHelpCenter;
import cn.pluss.platform.service.insBaseHelpCenter.InsBaseHelpCenterService;
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
@Service("insBaseHelpCenterService")
public class InsBaseHelpCenterServiceImpl extends ServiceImpl< InsBaseHelpCenterMapper, InsBaseHelpCenter> implements InsBaseHelpCenterService {
    private static final Logger logger = LoggerFactory.getLogger(InsBaseHelpCenterServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsBaseHelpCenter> queryPage(Map map) {
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
    public InsBaseHelpCenter queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseHelpCenter 实例对象
    * @return 实例对象
    */
    @Override
    public InsBaseHelpCenter queryOne(InsBaseHelpCenter insBaseHelpCenter){
        LambdaQueryWrapper<InsBaseHelpCenter> queryWrapper = getQueryWrapper(insBaseHelpCenter);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insBaseHelpCenter
    * @return
    */
    @Override
    public List<InsBaseHelpCenter> queryList(InsBaseHelpCenter insBaseHelpCenter) {
        LambdaQueryWrapper<InsBaseHelpCenter> queryWrapper = getQueryWrapper(insBaseHelpCenter);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insBaseHelpCenter
    * @return
    */
    public static LambdaQueryWrapper<InsBaseHelpCenter> getQueryWrapper(InsBaseHelpCenter insBaseHelpCenter){
        LambdaQueryWrapper<InsBaseHelpCenter> queryWrapper = new LambdaQueryWrapper<>();
        if (insBaseHelpCenter.getId() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getId, insBaseHelpCenter.getId());
        }
        if (StringUtil.isNotEmpty(insBaseHelpCenter.getTenantId())) {
            queryWrapper.eq(InsBaseHelpCenter::getTenantId, insBaseHelpCenter.getTenantId());
        }
        if (insBaseHelpCenter.getHelpType() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getHelpType, insBaseHelpCenter.getHelpType());
        }
        if (insBaseHelpCenter.getParentId() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getParentId, insBaseHelpCenter.getParentId());
        }
        if (StringUtil.isNotEmpty(insBaseHelpCenter.getParentName())) {
            queryWrapper.eq(InsBaseHelpCenter::getParentName, insBaseHelpCenter.getParentName());
        }
        if (StringUtil.isNotEmpty(insBaseHelpCenter.getTitleName())) {
            queryWrapper.eq(InsBaseHelpCenter::getTitleName, insBaseHelpCenter.getTitleName());
        }
        if (StringUtil.isNotEmpty(insBaseHelpCenter.getContent())) {
            queryWrapper.eq(InsBaseHelpCenter::getContent, insBaseHelpCenter.getContent());
        }
        if (StringUtil.isNotEmpty(insBaseHelpCenter.getFilePath())) {
            queryWrapper.eq(InsBaseHelpCenter::getFilePath, insBaseHelpCenter.getFilePath());
        }
        if (insBaseHelpCenter.getSortNum() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getSortNum, insBaseHelpCenter.getSortNum());
        }
        if (StringUtil.isNotEmpty(insBaseHelpCenter.getRemark())) {
            queryWrapper.eq(InsBaseHelpCenter::getRemark, insBaseHelpCenter.getRemark());
        }
        if (insBaseHelpCenter.getCreateTime() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getCreateTime, insBaseHelpCenter.getCreateTime());
        }
        if (insBaseHelpCenter.getCreateUser() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getCreateUser, insBaseHelpCenter.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insBaseHelpCenter.getCreateName())) {
            queryWrapper.eq(InsBaseHelpCenter::getCreateName, insBaseHelpCenter.getCreateName());
        }
        if (insBaseHelpCenter.getCreateDept() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getCreateDept, insBaseHelpCenter.getCreateDept());
        }
        if (insBaseHelpCenter.getUpdateUser() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getUpdateUser, insBaseHelpCenter.getUpdateUser());
        }
        if (insBaseHelpCenter.getUpdateTime() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getUpdateTime, insBaseHelpCenter.getUpdateTime());
        }
        if (insBaseHelpCenter.getIsDeleted() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getIsDeleted, insBaseHelpCenter.getIsDeleted());
        }
        if (insBaseHelpCenter.getStatus() != null) {
            queryWrapper.eq(InsBaseHelpCenter::getStatus, insBaseHelpCenter.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insBaseHelpCenter 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseHelpCenter insert(InsBaseHelpCenter insBaseHelpCenter) {
        insBaseHelpCenter.setId(null);
        getBaseMapper().insert(insBaseHelpCenter);
        return insBaseHelpCenter;
    }

    /**
    * 更新数据
    *
    * @param insBaseHelpCenter 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsBaseHelpCenter update(InsBaseHelpCenter insBaseHelpCenter) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsBaseHelpCenter> chainWrapper = new LambdaUpdateChainWrapper<InsBaseHelpCenter>(getBaseMapper());
        if (insBaseHelpCenter.getId() != null) {
            chainWrapper.set(InsBaseHelpCenter::getId, insBaseHelpCenter.getId());
        }
        if (StringUtil.isNotBlank(insBaseHelpCenter.getTenantId())) {
            chainWrapper.set(InsBaseHelpCenter::getTenantId, insBaseHelpCenter.getTenantId());
        }
        if (insBaseHelpCenter.getHelpType() != null) {
            chainWrapper.set(InsBaseHelpCenter::getHelpType, insBaseHelpCenter.getHelpType());
        }
        if (insBaseHelpCenter.getParentId() != null) {
            chainWrapper.set(InsBaseHelpCenter::getParentId, insBaseHelpCenter.getParentId());
        }
        if (StringUtil.isNotBlank(insBaseHelpCenter.getParentName())) {
            chainWrapper.set(InsBaseHelpCenter::getParentName, insBaseHelpCenter.getParentName());
        }
        if (StringUtil.isNotBlank(insBaseHelpCenter.getTitleName())) {
            chainWrapper.set(InsBaseHelpCenter::getTitleName, insBaseHelpCenter.getTitleName());
        }
        if (StringUtil.isNotBlank(insBaseHelpCenter.getContent())) {
            chainWrapper.set(InsBaseHelpCenter::getContent, insBaseHelpCenter.getContent());
        }
        if (StringUtil.isNotBlank(insBaseHelpCenter.getFilePath())) {
            chainWrapper.set(InsBaseHelpCenter::getFilePath, insBaseHelpCenter.getFilePath());
        }
        if (insBaseHelpCenter.getSortNum() != null) {
            chainWrapper.set(InsBaseHelpCenter::getSortNum, insBaseHelpCenter.getSortNum());
        }
        if (StringUtil.isNotBlank(insBaseHelpCenter.getRemark())) {
            chainWrapper.set(InsBaseHelpCenter::getRemark, insBaseHelpCenter.getRemark());
        }
        if (insBaseHelpCenter.getCreateTime() != null) {
            chainWrapper.set(InsBaseHelpCenter::getCreateTime, insBaseHelpCenter.getCreateTime());
        }
        if (insBaseHelpCenter.getCreateUser() != null) {
            chainWrapper.set(InsBaseHelpCenter::getCreateUser, insBaseHelpCenter.getCreateUser());
        }
        if (StringUtil.isNotBlank(insBaseHelpCenter.getCreateName())) {
            chainWrapper.set(InsBaseHelpCenter::getCreateName, insBaseHelpCenter.getCreateName());
        }
        if (insBaseHelpCenter.getCreateDept() != null) {
            chainWrapper.set(InsBaseHelpCenter::getCreateDept, insBaseHelpCenter.getCreateDept());
        }
        if (insBaseHelpCenter.getUpdateUser() != null) {
            chainWrapper.set(InsBaseHelpCenter::getUpdateUser, insBaseHelpCenter.getUpdateUser());
        }
        if (insBaseHelpCenter.getUpdateTime() != null) {
            chainWrapper.set(InsBaseHelpCenter::getUpdateTime, insBaseHelpCenter.getUpdateTime());
        }
        if (insBaseHelpCenter.getIsDeleted() != null) {
            chainWrapper.set(InsBaseHelpCenter::getIsDeleted, insBaseHelpCenter.getIsDeleted());
        }
        if (insBaseHelpCenter.getStatus() != null) {
            chainWrapper.set(InsBaseHelpCenter::getStatus, insBaseHelpCenter.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsBaseHelpCenter::getId, insBaseHelpCenter.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insBaseHelpCenter.getId());
        } else {
            return insBaseHelpCenter;
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
    public boolean saveInsBaseHelpCenterBatch(List<InsBaseHelpCenter> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsBaseHelpCenter insBaseHelpCenter : insertList) {
            //使用默认的雪花算法生成
            insBaseHelpCenter.setId(null);
            //insBaseHelpCenter.setCreatedDt(currentDte);
            //insBaseHelpCenter.setUpdatedDt(currentDte);
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
    public Integer deleteInsBaseHelpCenterBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsBaseHelpCenter> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


