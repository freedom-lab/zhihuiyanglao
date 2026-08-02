package cn.pluss.platform.service.insSchedulingTable;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSchedulingTable;

public interface InsSchedulingTableService extends IService<InsSchedulingTable> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSchedulingTable> queryPage(Map map);

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
    public InsSchedulingTable queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingTable 实例对象
    * @return 实例对象
    */
    public InsSchedulingTable queryOne(InsSchedulingTable insSchedulingTable);

    /**
    * 根据条件获取集合
    * @param insSchedulingTable
    * @return
    */
    public List<InsSchedulingTable> queryList(InsSchedulingTable insSchedulingTable);

    /**
    * 新增数据
    *
    * @param insSchedulingTable 实例对象
    * @return 实例对象
    */
    public InsSchedulingTable insert(InsSchedulingTable insSchedulingTable);

    /**
    * 更新数据
    *
    * @param insSchedulingTable 实例对象
    * @return 实例对象
    */
    public InsSchedulingTable update(InsSchedulingTable insSchedulingTable);

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
    public boolean saveInsSchedulingTableBatch(List<InsSchedulingTable> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSchedulingTableBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSchedulingTable> list);
 }
