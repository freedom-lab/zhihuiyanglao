package cn.pluss.platform.service.insStaffEvaluateRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsStaffEvaluateRecord;

public interface InsStaffEvaluateRecordService extends IService<InsStaffEvaluateRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsStaffEvaluateRecord> queryPage(Map map);

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
    public InsStaffEvaluateRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluateRecord 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluateRecord queryOne(InsStaffEvaluateRecord insStaffEvaluateRecord);

    /**
    * 根据条件获取集合
    * @param insStaffEvaluateRecord
    * @return
    */
    public List<InsStaffEvaluateRecord> queryList(InsStaffEvaluateRecord insStaffEvaluateRecord);

    /**
    * 新增数据
    *
    * @param insStaffEvaluateRecord 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluateRecord insert(InsStaffEvaluateRecord insStaffEvaluateRecord);

    /**
    * 更新数据
    *
    * @param insStaffEvaluateRecord 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluateRecord update(InsStaffEvaluateRecord insStaffEvaluateRecord);

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
    public boolean saveInsStaffEvaluateRecordBatch(List<InsStaffEvaluateRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsStaffEvaluateRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsStaffEvaluateRecord> list);
 }
