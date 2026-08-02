package cn.pluss.platform.service.healthUricacidRecords;

import cn.pluss.platform.model.entity.HealthUricacidRecords;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface HealthUricacidRecordsService extends IService<HealthUricacidRecords> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthUricacidRecords> queryPage(Map map);

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
    public HealthUricacidRecords queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthUricacidRecords 实例对象
    * @return 实例对象
    */
    public HealthUricacidRecords queryOne(HealthUricacidRecords healthUricacidRecords);

    /**
    * 根据条件获取集合
    * @param healthUricacidRecords
    * @return
    */
    public List<HealthUricacidRecords> queryList(HealthUricacidRecords healthUricacidRecords);

    /**
    * 新增数据
    *
    * @param healthUricacidRecords 实例对象
    * @return 实例对象
    */
    public HealthUricacidRecords insert(HealthUricacidRecords healthUricacidRecords);

    /**
    * 更新数据
    *
    * @param healthUricacidRecords 实例对象
    * @return 实例对象
    */
    public HealthUricacidRecords update(HealthUricacidRecords healthUricacidRecords);

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
    public boolean saveHealthUricacidRecordsBatch(List<HealthUricacidRecords> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthUricacidRecordsBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthUricacidRecords> list);

    /**
     * 尿酸监控
     * @param queryParam 查询条件
     * @return 包含 normalList 和 abnormalList 的结果Map
     */
    Map<String, Object> monitorUricAcid(HealthUricacidRecords queryParam);
 }
