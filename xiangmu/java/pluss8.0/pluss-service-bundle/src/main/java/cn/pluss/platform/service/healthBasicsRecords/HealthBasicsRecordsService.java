package cn.pluss.platform.service.healthBasicsRecords;

import cn.pluss.platform.model.entity.HealthBasicsRecords;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface HealthBasicsRecordsService extends IService<HealthBasicsRecords> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthBasicsRecords> queryPage(Map map);

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
    public HealthBasicsRecords queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthBasicsRecords 实例对象
    * @return 实例对象
    */
    public HealthBasicsRecords queryOne(HealthBasicsRecords healthBasicsRecords);

    /**
    * 根据条件获取集合
    * @param healthBasicsRecords
    * @return
    */
    public List<HealthBasicsRecords> queryList(HealthBasicsRecords healthBasicsRecords);

    /**
    * 新增数据
    *
    * @param healthBasicsRecords 实例对象
    * @return 实例对象
    */
    public HealthBasicsRecords insert(HealthBasicsRecords healthBasicsRecords);

    /**
    * 更新数据
    *
    * @param healthBasicsRecords 实例对象
    * @return 实例对象
    */
    public HealthBasicsRecords update(HealthBasicsRecords healthBasicsRecords);

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
    public boolean saveHealthBasicsRecordsBatch(List<HealthBasicsRecords> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthBasicsRecordsBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthBasicsRecords> list);

    /**
     * BMI监控
     * @param queryParam 查询条件
     * @return 包含 normalList 和 abnormalList 的结果Map
     */
    Map<String, Object> monitorBmi(HealthBasicsRecords queryParam);
 }
