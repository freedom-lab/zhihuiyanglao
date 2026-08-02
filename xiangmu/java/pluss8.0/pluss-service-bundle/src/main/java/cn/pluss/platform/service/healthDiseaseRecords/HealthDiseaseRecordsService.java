package cn.pluss.platform.service.healthDiseaseRecords;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthDiseaseRecords;

public interface HealthDiseaseRecordsService extends IService<HealthDiseaseRecords> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthDiseaseRecords> queryPage(Map map);

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
    public HealthDiseaseRecords queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthDiseaseRecords 实例对象
    * @return 实例对象
    */
    public HealthDiseaseRecords queryOne(HealthDiseaseRecords healthDiseaseRecords);

    /**
    * 根据条件获取集合
    * @param healthDiseaseRecords
    * @return
    */
    public List<HealthDiseaseRecords> queryList(HealthDiseaseRecords healthDiseaseRecords);

    /**
    * 新增数据
    *
    * @param healthDiseaseRecords 实例对象
    * @return 实例对象
    */
    public HealthDiseaseRecords insert(HealthDiseaseRecords healthDiseaseRecords);

    /**
    * 更新数据
    *
    * @param healthDiseaseRecords 实例对象
    * @return 实例对象
    */
    public HealthDiseaseRecords update(HealthDiseaseRecords healthDiseaseRecords);

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
    public boolean saveHealthDiseaseRecordsBatch(List<HealthDiseaseRecords> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthDiseaseRecordsBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthDiseaseRecords> list);
 }
