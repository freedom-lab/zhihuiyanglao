package cn.pluss.platform.service.healthBloodOxygen;

import cn.pluss.platform.model.entity.HealthBloodOxygen;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface HealthBloodOxygenService extends IService<HealthBloodOxygen> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthBloodOxygen> queryPage(Map map);

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
    public HealthBloodOxygen queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthBloodOxygen 实例对象
    * @return 实例对象
    */
    public HealthBloodOxygen queryOne(HealthBloodOxygen healthBloodOxygen);

    /**
    * 根据条件获取集合
    * @param healthBloodOxygen
    * @return
    */
    public List<HealthBloodOxygen> queryList(HealthBloodOxygen healthBloodOxygen);

    /**
    * 新增数据
    *
    * @param healthBloodOxygen 实例对象
    * @return 实例对象
    */
    public HealthBloodOxygen insert(HealthBloodOxygen healthBloodOxygen);

    /**
    * 更新数据
    *
    * @param healthBloodOxygen 实例对象
    * @return 实例对象
    */
    public HealthBloodOxygen update(HealthBloodOxygen healthBloodOxygen);

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
    public boolean saveHealthBloodOxygenBatch(List<HealthBloodOxygen> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthBloodOxygenBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthBloodOxygen> list);

    /**
     * 血氧监控
     * @param queryParam 查询条件
     * @return 包含 normalList 和 abnormalList 的结果Map
     */
    Map<String, Object> monitorBloodOxygen(HealthBloodOxygen queryParam);
 }
