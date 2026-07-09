package cn.pluss.platform.service.healthMedicineRecords;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthMedicineRecords;

public interface HealthMedicineRecordsService extends IService<HealthMedicineRecords> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthMedicineRecords> queryPage(Map map);

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
    public HealthMedicineRecords queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthMedicineRecords 实例对象
    * @return 实例对象
    */
    public HealthMedicineRecords queryOne(HealthMedicineRecords healthMedicineRecords);

    /**
    * 根据条件获取集合
    * @param healthMedicineRecords
    * @return
    */
    public List<HealthMedicineRecords> queryList(HealthMedicineRecords healthMedicineRecords);

    /**
    * 新增数据
    *
    * @param healthMedicineRecords 实例对象
    * @return 实例对象
    */
    public HealthMedicineRecords insert(HealthMedicineRecords healthMedicineRecords);

    /**
    * 更新数据
    *
    * @param healthMedicineRecords 实例对象
    * @return 实例对象
    */
    public HealthMedicineRecords update(HealthMedicineRecords healthMedicineRecords);

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
    public boolean saveHealthMedicineRecordsBatch(List<HealthMedicineRecords> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthMedicineRecordsBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthMedicineRecords> list);
 }
