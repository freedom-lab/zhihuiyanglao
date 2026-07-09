package cn.pluss.platform.service.ocTrainRecord.impl;

import cn.pluss.platform.mapper.OcTrainRecordMapper;
import cn.pluss.platform.model.entity.OcTrainRecord;
import cn.pluss.platform.service.ocTrainRecord.OcTrainRecordService;
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
@Service("ocTrainRecordService")
public class OcTrainRecordServiceImpl extends ServiceImpl< OcTrainRecordMapper, OcTrainRecord> implements OcTrainRecordService {
    private static final Logger logger = LoggerFactory.getLogger(OcTrainRecordServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<OcTrainRecord> queryPage(Map map) {
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
    public OcTrainRecord queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param ocTrainRecord 实例对象
    * @return 实例对象
    */
    @Override
    public OcTrainRecord queryOne(OcTrainRecord ocTrainRecord){
        LambdaQueryWrapper<OcTrainRecord> queryWrapper = getQueryWrapper(ocTrainRecord);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param ocTrainRecord
    * @return
    */
    @Override
    public List<OcTrainRecord> queryList(OcTrainRecord ocTrainRecord) {
        LambdaQueryWrapper<OcTrainRecord> queryWrapper = getQueryWrapper(ocTrainRecord);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param ocTrainRecord
    * @return
    */
    public static LambdaQueryWrapper<OcTrainRecord> getQueryWrapper(OcTrainRecord ocTrainRecord){
        LambdaQueryWrapper<OcTrainRecord> queryWrapper = new LambdaQueryWrapper<>();
        if (ocTrainRecord.getId() != null) {
            queryWrapper.eq(OcTrainRecord::getId, ocTrainRecord.getId());
        }
        if (StringUtil.isNotEmpty(ocTrainRecord.getTenantId())) {
            queryWrapper.eq(OcTrainRecord::getTenantId, ocTrainRecord.getTenantId());
        }
        if (StringUtil.isNotEmpty(ocTrainRecord.getTrainName())) {
            queryWrapper.eq(OcTrainRecord::getTrainName, ocTrainRecord.getTrainName());
        }
        if (ocTrainRecord.getTrainTime() != null) {
            queryWrapper.eq(OcTrainRecord::getTrainTime, ocTrainRecord.getTrainTime());
        }
        if (StringUtil.isNotEmpty(ocTrainRecord.getAddress())) {
            queryWrapper.eq(OcTrainRecord::getAddress, ocTrainRecord.getAddress());
        }
        if (StringUtil.isNotEmpty(ocTrainRecord.getTrainTarget())) {
            queryWrapper.eq(OcTrainRecord::getTrainTarget, ocTrainRecord.getTrainTarget());
        }
        if (ocTrainRecord.getPersonNum() != null) {
            queryWrapper.eq(OcTrainRecord::getPersonNum, ocTrainRecord.getPersonNum());
        }
        if (StringUtil.isNotEmpty(ocTrainRecord.getTrainImg())) {
            queryWrapper.eq(OcTrainRecord::getTrainImg, ocTrainRecord.getTrainImg());
        }
        if (StringUtil.isNotEmpty(ocTrainRecord.getRemark())) {
            queryWrapper.eq(OcTrainRecord::getRemark, ocTrainRecord.getRemark());
        }
        if (StringUtil.isNotEmpty(ocTrainRecord.getDataSource())) {
            queryWrapper.eq(OcTrainRecord::getDataSource, ocTrainRecord.getDataSource());
        }
        if (ocTrainRecord.getAreaCode() != null) {
            queryWrapper.eq(OcTrainRecord::getAreaCode, ocTrainRecord.getAreaCode());
        }
        if (StringUtil.isNotEmpty(ocTrainRecord.getAreaName())) {
            queryWrapper.eq(OcTrainRecord::getAreaName, ocTrainRecord.getAreaName());
        }
        if (ocTrainRecord.getCreateUser() != null) {
            queryWrapper.eq(OcTrainRecord::getCreateUser, ocTrainRecord.getCreateUser());
        }
        if (ocTrainRecord.getCreateDept() != null) {
            queryWrapper.eq(OcTrainRecord::getCreateDept, ocTrainRecord.getCreateDept());
        }
        if (ocTrainRecord.getCreateTime() != null) {
            queryWrapper.eq(OcTrainRecord::getCreateTime, ocTrainRecord.getCreateTime());
        }
        if (ocTrainRecord.getUpdateUser() != null) {
            queryWrapper.eq(OcTrainRecord::getUpdateUser, ocTrainRecord.getUpdateUser());
        }
        if (ocTrainRecord.getUpdateTime() != null) {
            queryWrapper.eq(OcTrainRecord::getUpdateTime, ocTrainRecord.getUpdateTime());
        }
        if (ocTrainRecord.getIsDeleted() != null) {
            queryWrapper.eq(OcTrainRecord::getIsDeleted, ocTrainRecord.getIsDeleted());
        }
        if (ocTrainRecord.getStatus() != null) {
            queryWrapper.eq(OcTrainRecord::getStatus, ocTrainRecord.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param ocTrainRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public OcTrainRecord insert(OcTrainRecord ocTrainRecord) {
        ocTrainRecord.setId(null);
        getBaseMapper().insert(ocTrainRecord);
        return ocTrainRecord;
    }

    /**
    * 更新数据
    *
    * @param ocTrainRecord 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public OcTrainRecord update(OcTrainRecord ocTrainRecord) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<OcTrainRecord> chainWrapper = new LambdaUpdateChainWrapper<OcTrainRecord>(getBaseMapper());
        if (ocTrainRecord.getId() != null) {
            chainWrapper.set(OcTrainRecord::getId, ocTrainRecord.getId());
        }
        if (StringUtil.isNotBlank(ocTrainRecord.getTenantId())) {
            chainWrapper.set(OcTrainRecord::getTenantId, ocTrainRecord.getTenantId());
        }
        if (StringUtil.isNotBlank(ocTrainRecord.getTrainName())) {
            chainWrapper.set(OcTrainRecord::getTrainName, ocTrainRecord.getTrainName());
        }
        if (ocTrainRecord.getTrainTime() != null) {
            chainWrapper.set(OcTrainRecord::getTrainTime, ocTrainRecord.getTrainTime());
        }
        if (StringUtil.isNotBlank(ocTrainRecord.getAddress())) {
            chainWrapper.set(OcTrainRecord::getAddress, ocTrainRecord.getAddress());
        }
        if (StringUtil.isNotBlank(ocTrainRecord.getTrainTarget())) {
            chainWrapper.set(OcTrainRecord::getTrainTarget, ocTrainRecord.getTrainTarget());
        }
        if (ocTrainRecord.getPersonNum() != null) {
            chainWrapper.set(OcTrainRecord::getPersonNum, ocTrainRecord.getPersonNum());
        }
        if (StringUtil.isNotBlank(ocTrainRecord.getTrainImg())) {
            chainWrapper.set(OcTrainRecord::getTrainImg, ocTrainRecord.getTrainImg());
        }
        if (StringUtil.isNotBlank(ocTrainRecord.getRemark())) {
            chainWrapper.set(OcTrainRecord::getRemark, ocTrainRecord.getRemark());
        }
        if (StringUtil.isNotBlank(ocTrainRecord.getDataSource())) {
            chainWrapper.set(OcTrainRecord::getDataSource, ocTrainRecord.getDataSource());
        }
        if (ocTrainRecord.getAreaCode() != null) {
            chainWrapper.set(OcTrainRecord::getAreaCode, ocTrainRecord.getAreaCode());
        }
        if (StringUtil.isNotBlank(ocTrainRecord.getAreaName())) {
            chainWrapper.set(OcTrainRecord::getAreaName, ocTrainRecord.getAreaName());
        }
        if (ocTrainRecord.getCreateUser() != null) {
            chainWrapper.set(OcTrainRecord::getCreateUser, ocTrainRecord.getCreateUser());
        }
        if (ocTrainRecord.getCreateDept() != null) {
            chainWrapper.set(OcTrainRecord::getCreateDept, ocTrainRecord.getCreateDept());
        }
        if (ocTrainRecord.getCreateTime() != null) {
            chainWrapper.set(OcTrainRecord::getCreateTime, ocTrainRecord.getCreateTime());
        }
        if (ocTrainRecord.getUpdateUser() != null) {
            chainWrapper.set(OcTrainRecord::getUpdateUser, ocTrainRecord.getUpdateUser());
        }
        if (ocTrainRecord.getUpdateTime() != null) {
            chainWrapper.set(OcTrainRecord::getUpdateTime, ocTrainRecord.getUpdateTime());
        }
        if (ocTrainRecord.getIsDeleted() != null) {
            chainWrapper.set(OcTrainRecord::getIsDeleted, ocTrainRecord.getIsDeleted());
        }
        if (ocTrainRecord.getStatus() != null) {
            chainWrapper.set(OcTrainRecord::getStatus, ocTrainRecord.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(OcTrainRecord::getId, ocTrainRecord.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(ocTrainRecord.getId());
        } else {
            return ocTrainRecord;
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
    public boolean saveOcTrainRecordBatch(List<OcTrainRecord> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (OcTrainRecord ocTrainRecord : insertList) {
            //使用默认的雪花算法生成
            ocTrainRecord.setId(null);
            //ocTrainRecord.setCreatedDt(currentDte);
            //ocTrainRecord.setUpdatedDt(currentDte);
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
    public Integer deleteOcTrainRecordBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<OcTrainRecord> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


