package cn.pluss.platform.service.healthChronicDiseaseArchive;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthChronicDiseaseArchive;

public interface HealthChronicDiseaseArchiveService extends IService<HealthChronicDiseaseArchive> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthChronicDiseaseArchive> queryPage(Map map);

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
    public HealthChronicDiseaseArchive queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthChronicDiseaseArchive 实例对象
    * @return 实例对象
    */
    public HealthChronicDiseaseArchive queryOne(HealthChronicDiseaseArchive healthChronicDiseaseArchive);

    /**
    * 根据条件获取集合
    * @param healthChronicDiseaseArchive
    * @return
    */
    public List<HealthChronicDiseaseArchive> queryList(HealthChronicDiseaseArchive healthChronicDiseaseArchive);

    /**
    * 新增数据
    *
    * @param healthChronicDiseaseArchive 实例对象
    * @return 实例对象
    */
    public HealthChronicDiseaseArchive insert(HealthChronicDiseaseArchive healthChronicDiseaseArchive);

    /**
    * 更新数据
    *
    * @param healthChronicDiseaseArchive 实例对象
    * @return 实例对象
    */
    public HealthChronicDiseaseArchive update(HealthChronicDiseaseArchive healthChronicDiseaseArchive);

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
    public boolean saveHealthChronicDiseaseArchiveBatch(List<HealthChronicDiseaseArchive> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthChronicDiseaseArchiveBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthChronicDiseaseArchive> list);
 }
