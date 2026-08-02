package cn.pluss.platform.service.healthHemoglobinRecords;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthHemoglobinRecords;

public interface HealthHemoglobinRecordsService extends IService<HealthHemoglobinRecords> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthHemoglobinRecords> queryPage(Map map);

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
    public HealthHemoglobinRecords queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthHemoglobinRecords 实例对象
    * @return 实例对象
    */
    public HealthHemoglobinRecords queryOne(HealthHemoglobinRecords healthHemoglobinRecords);

    /**
    * 根据条件获取集合
    * @param healthHemoglobinRecords
    * @return
    */
    public List<HealthHemoglobinRecords> queryList(HealthHemoglobinRecords healthHemoglobinRecords);

    /**
    * 新增数据
    *
    * @param healthHemoglobinRecords 实例对象
    * @return 实例对象
    */
    public HealthHemoglobinRecords insert(HealthHemoglobinRecords healthHemoglobinRecords);

    /**
    * 更新数据
    *
    * @param healthHemoglobinRecords 实例对象
    * @return 实例对象
    */
    public HealthHemoglobinRecords update(HealthHemoglobinRecords healthHemoglobinRecords);

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
    public boolean saveHealthHemoglobinRecordsBatch(List<HealthHemoglobinRecords> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthHemoglobinRecordsBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthHemoglobinRecords> list);
 }
