package cn.pluss.platform.service.insStaffDimissionRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsStaffDimissionRecord;

public interface InsStaffDimissionRecordService extends IService<InsStaffDimissionRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsStaffDimissionRecord> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);

    /**
    * 通过ID查询单条数据
    *
    * @param id 主键
    * @return 实例对象
    */
    public InsStaffDimissionRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffDimissionRecord 实例对象
    * @return 实例对象
    */
    public InsStaffDimissionRecord queryOne(InsStaffDimissionRecord insStaffDimissionRecord);

    /**
    * 根据条件获取集合
    * @param insStaffDimissionRecord
    * @return
    */
    public List<InsStaffDimissionRecord> queryList(InsStaffDimissionRecord insStaffDimissionRecord);

    /**
    * 新增数据
    *
    * @param insStaffDimissionRecord 实例对象
    * @return 实例对象
    */
    public InsStaffDimissionRecord insert(InsStaffDimissionRecord insStaffDimissionRecord);

    /**
    * 更新数据
    *
    * @param insStaffDimissionRecord 实例对象
    * @return 实例对象
    */
    public InsStaffDimissionRecord update(InsStaffDimissionRecord insStaffDimissionRecord);

    /**
    * 通过主键删除数据
    *
    * @param id 主键
    * @return 是否成功
    */
    public boolean deleteById(Long id);

    /**
    * 批量新增
    * @param insertList
    */
    public boolean saveInsStaffDimissionRecordBatch(List<InsStaffDimissionRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsStaffDimissionRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsStaffDimissionRecord> list);
 }
