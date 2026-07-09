package cn.pluss.platform.service.healthDiseaseEncyclopedia;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthDiseaseEncyclopedia;

public interface HealthDiseaseEncyclopediaService extends IService<HealthDiseaseEncyclopedia> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthDiseaseEncyclopedia> queryPage(Map map);

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
    public HealthDiseaseEncyclopedia queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthDiseaseEncyclopedia 实例对象
    * @return 实例对象
    */
    public HealthDiseaseEncyclopedia queryOne(HealthDiseaseEncyclopedia healthDiseaseEncyclopedia);

    /**
    * 根据条件获取集合
    * @param healthDiseaseEncyclopedia
    * @return
    */
    public List<HealthDiseaseEncyclopedia> queryList(HealthDiseaseEncyclopedia healthDiseaseEncyclopedia);

    /**
    * 新增数据
    *
    * @param healthDiseaseEncyclopedia 实例对象
    * @return 实例对象
    */
    public HealthDiseaseEncyclopedia insert(HealthDiseaseEncyclopedia healthDiseaseEncyclopedia);

    /**
    * 更新数据
    *
    * @param healthDiseaseEncyclopedia 实例对象
    * @return 实例对象
    */
    public HealthDiseaseEncyclopedia update(HealthDiseaseEncyclopedia healthDiseaseEncyclopedia);

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
    public boolean saveHealthDiseaseEncyclopediaBatch(List<HealthDiseaseEncyclopedia> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthDiseaseEncyclopediaBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthDiseaseEncyclopedia> list);
 }
