package cn.pluss.platform.service.insCanteenFoodCategory;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenFoodCategory;

public interface InsCanteenFoodCategoryService extends IService<InsCanteenFoodCategory> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenFoodCategory> queryPage(Map map);

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
    public InsCanteenFoodCategory queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodCategory 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodCategory queryOne(InsCanteenFoodCategory insCanteenFoodCategory);

    /**
    * 根据条件获取集合
    * @param insCanteenFoodCategory
    * @return
    */
    public List<InsCanteenFoodCategory> queryList(InsCanteenFoodCategory insCanteenFoodCategory);

    /**
    * 新增数据
    *
    * @param insCanteenFoodCategory 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodCategory insert(InsCanteenFoodCategory insCanteenFoodCategory);

    /**
    * 更新数据
    *
    * @param insCanteenFoodCategory 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodCategory update(InsCanteenFoodCategory insCanteenFoodCategory);

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
    public boolean saveInsCanteenFoodCategoryBatch(List<InsCanteenFoodCategory> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenFoodCategoryBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenFoodCategory> list);
 }
