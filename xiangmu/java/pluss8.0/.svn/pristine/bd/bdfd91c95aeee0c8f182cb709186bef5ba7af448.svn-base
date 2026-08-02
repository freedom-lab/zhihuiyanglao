package cn.pluss.platform.service.insTrainStaffRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsTrainStaffRecord;

public interface InsTrainStaffRecordService extends IService<InsTrainStaffRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsTrainStaffRecord> queryPage(Map map);

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
    public InsTrainStaffRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insTrainStaffRecord 实例对象
    * @return 实例对象
    */
    public InsTrainStaffRecord queryOne(InsTrainStaffRecord insTrainStaffRecord);

    /**
    * 根据条件获取集合
    * @param insTrainStaffRecord
    * @return
    */
    public List<InsTrainStaffRecord> queryList(InsTrainStaffRecord insTrainStaffRecord);

    /**
    * 新增数据
    *
    * @param insTrainStaffRecord 实例对象
    * @return 实例对象
    */
    public InsTrainStaffRecord insert(InsTrainStaffRecord insTrainStaffRecord);

    /**
    * 更新数据
    *
    * @param insTrainStaffRecord 实例对象
    * @return 实例对象
    */
    public InsTrainStaffRecord update(InsTrainStaffRecord insTrainStaffRecord);

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
    public boolean saveInsTrainStaffRecordBatch(List<InsTrainStaffRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsTrainStaffRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsTrainStaffRecord> list);
 }
