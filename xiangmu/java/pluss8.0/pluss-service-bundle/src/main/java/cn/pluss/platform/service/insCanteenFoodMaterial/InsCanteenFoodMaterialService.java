package cn.pluss.platform.service.insCanteenFoodMaterial;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenFoodMaterial;

public interface InsCanteenFoodMaterialService extends IService<InsCanteenFoodMaterial> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenFoodMaterial> queryPage(Map map);

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
    public InsCanteenFoodMaterial queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodMaterial 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodMaterial queryOne(InsCanteenFoodMaterial insCanteenFoodMaterial);

    /**
    * 根据条件获取集合
    * @param insCanteenFoodMaterial
    * @return
    */
    public List<InsCanteenFoodMaterial> queryList(InsCanteenFoodMaterial insCanteenFoodMaterial);

    /**
    * 新增数据
    *
    * @param insCanteenFoodMaterial 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodMaterial insert(InsCanteenFoodMaterial insCanteenFoodMaterial);

    /**
    * 更新数据
    *
    * @param insCanteenFoodMaterial 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodMaterial update(InsCanteenFoodMaterial insCanteenFoodMaterial);

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
    public boolean saveInsCanteenFoodMaterialBatch(List<InsCanteenFoodMaterial> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenFoodMaterialBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenFoodMaterial> list);
 }
