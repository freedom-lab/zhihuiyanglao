package cn.pluss.platform.service.healthEcgRecords;

import cn.pluss.platform.model.entity.HealthEcgRecords;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface HealthEcgRecordsService extends IService<HealthEcgRecords> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthEcgRecords> queryPage(Map map);

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
    public HealthEcgRecords queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthEcgRecords 实例对象
    * @return 实例对象
    */
    public HealthEcgRecords queryOne(HealthEcgRecords healthEcgRecords);

    /**
    * 根据条件获取集合
    * @param healthEcgRecords
    * @return
    */
    public List<HealthEcgRecords> queryList(HealthEcgRecords healthEcgRecords);

    /**
    * 新增数据
    *
    * @param healthEcgRecords 实例对象
    * @return 实例对象
    */
    public HealthEcgRecords insert(HealthEcgRecords healthEcgRecords);

    /**
    * 更新数据
    *
    * @param healthEcgRecords 实例对象
    * @return 实例对象
    */
    public HealthEcgRecords update(HealthEcgRecords healthEcgRecords);

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
    public boolean saveHealthEcgRecordsBatch(List<HealthEcgRecords> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthEcgRecordsBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthEcgRecords> list);

    /**
     * 心率监控
     * @param queryParam 查询条件
     * @return 包含 normalList 和 abnormalList 的结果Map
     */
    Map<String, Object> monitorHeartRate(HealthEcgRecords queryParam);
 }
