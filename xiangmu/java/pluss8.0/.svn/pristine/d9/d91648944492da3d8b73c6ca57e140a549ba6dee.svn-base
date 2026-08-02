package cn.pluss.platform.service.insSchedulingTableChangeRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSchedulingTableChangeRecord;

public interface InsSchedulingTableChangeRecordService extends IService<InsSchedulingTableChangeRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSchedulingTableChangeRecord> queryPage(Map map);

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
    public InsSchedulingTableChangeRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingTableChangeRecord 实例对象
    * @return 实例对象
    */
    public InsSchedulingTableChangeRecord queryOne(InsSchedulingTableChangeRecord insSchedulingTableChangeRecord);

    /**
    * 根据条件获取集合
    * @param insSchedulingTableChangeRecord
    * @return
    */
    public List<InsSchedulingTableChangeRecord> queryList(InsSchedulingTableChangeRecord insSchedulingTableChangeRecord);

    /**
    * 新增数据
    *
    * @param insSchedulingTableChangeRecord 实例对象
    * @return 实例对象
    */
    public InsSchedulingTableChangeRecord insert(InsSchedulingTableChangeRecord insSchedulingTableChangeRecord);

    /**
    * 更新数据
    *
    * @param insSchedulingTableChangeRecord 实例对象
    * @return 实例对象
    */
    public InsSchedulingTableChangeRecord update(InsSchedulingTableChangeRecord insSchedulingTableChangeRecord);

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
    public boolean saveInsSchedulingTableChangeRecordBatch(List<InsSchedulingTableChangeRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSchedulingTableChangeRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSchedulingTableChangeRecord> list);
 }
