package cn.pluss.platform.service.healthChronicDiseaseDict;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthChronicDiseaseDict;

public interface HealthChronicDiseaseDictService extends IService<HealthChronicDiseaseDict> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthChronicDiseaseDict> queryPage(Map map);

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
    public HealthChronicDiseaseDict queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthChronicDiseaseDict 实例对象
    * @return 实例对象
    */
    public HealthChronicDiseaseDict queryOne(HealthChronicDiseaseDict healthChronicDiseaseDict);

    /**
    * 根据条件获取集合
    * @param healthChronicDiseaseDict
    * @return
    */
    public List<HealthChronicDiseaseDict> queryList(HealthChronicDiseaseDict healthChronicDiseaseDict);

    /**
    * 新增数据
    *
    * @param healthChronicDiseaseDict 实例对象
    * @return 实例对象
    */
    public HealthChronicDiseaseDict insert(HealthChronicDiseaseDict healthChronicDiseaseDict);

    /**
    * 更新数据
    *
    * @param healthChronicDiseaseDict 实例对象
    * @return 实例对象
    */
    public HealthChronicDiseaseDict update(HealthChronicDiseaseDict healthChronicDiseaseDict);

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
    public boolean saveHealthChronicDiseaseDictBatch(List<HealthChronicDiseaseDict> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthChronicDiseaseDictBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthChronicDiseaseDict> list);
 }
