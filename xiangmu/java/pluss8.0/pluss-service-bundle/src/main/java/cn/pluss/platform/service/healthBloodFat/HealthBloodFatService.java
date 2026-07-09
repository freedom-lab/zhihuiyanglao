package cn.pluss.platform.service.healthBloodFat;

import cn.pluss.platform.model.entity.HealthBloodFat;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface HealthBloodFatService extends IService<HealthBloodFat> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthBloodFat> queryPage(Map map);

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
    public HealthBloodFat queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthBloodFat 实例对象
    * @return 实例对象
    */
    public HealthBloodFat queryOne(HealthBloodFat healthBloodFat);

    /**
    * 根据条件获取集合
    * @param healthBloodFat
    * @return
    */
    public List<HealthBloodFat> queryList(HealthBloodFat healthBloodFat);

    /**
    * 新增数据
    *
    * @param healthBloodFat 实例对象
    * @return 实例对象
    */
    public HealthBloodFat insert(HealthBloodFat healthBloodFat);

    /**
    * 更新数据
    *
    * @param healthBloodFat 实例对象
    * @return 实例对象
    */
    public HealthBloodFat update(HealthBloodFat healthBloodFat);

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
    public boolean saveHealthBloodFatBatch(List<HealthBloodFat> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthBloodFatBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthBloodFat> list);

    /**
     * 胆固醇监控
     * @param queryParam 查询条件
     * @return 包含 normalList 和 abnormalList 的结果Map
     */
    Map<String, Object> monitorCholesterol(HealthBloodFat queryParam);
 }
