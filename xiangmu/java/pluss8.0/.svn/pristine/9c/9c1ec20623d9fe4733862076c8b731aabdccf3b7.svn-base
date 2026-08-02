package cn.pluss.platform.service.insNursingExecutionRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingExecutionRecord;

public interface InsNursingExecutionRecordService extends IService<InsNursingExecutionRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingExecutionRecord> queryPage(Map map);

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
    public InsNursingExecutionRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    public InsNursingExecutionRecord queryOne(InsNursingExecutionRecord insNursingExecutionRecord);

    /**
    * 根据条件获取集合
    * @param insNursingExecutionRecord
    * @return
    */
    public List<InsNursingExecutionRecord> queryList(InsNursingExecutionRecord insNursingExecutionRecord);

    /**
    * 新增数据
    *
    * @param insNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    public InsNursingExecutionRecord insert(InsNursingExecutionRecord insNursingExecutionRecord);

    /**
    * 更新数据
    *
    * @param insNursingExecutionRecord 实例对象
    * @return 实例对象
    */
    public InsNursingExecutionRecord update(InsNursingExecutionRecord insNursingExecutionRecord);

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
    public boolean saveInsNursingExecutionRecordBatch(List<InsNursingExecutionRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingExecutionRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingExecutionRecord> list);
 }
