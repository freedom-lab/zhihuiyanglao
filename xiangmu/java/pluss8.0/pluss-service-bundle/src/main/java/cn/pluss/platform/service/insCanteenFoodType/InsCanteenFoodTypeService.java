package cn.pluss.platform.service.insCanteenFoodType;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenFoodType;

public interface InsCanteenFoodTypeService extends IService<InsCanteenFoodType> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenFoodType> queryPage(Map map);

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
    public InsCanteenFoodType queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodType 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodType queryOne(InsCanteenFoodType insCanteenFoodType);

    /**
    * 根据条件获取集合
    * @param insCanteenFoodType
    * @return
    */
    public List<InsCanteenFoodType> queryList(InsCanteenFoodType insCanteenFoodType);

    /**
    * 新增数据
    *
    * @param insCanteenFoodType 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodType insert(InsCanteenFoodType insCanteenFoodType);

    /**
    * 更新数据
    *
    * @param insCanteenFoodType 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodType update(InsCanteenFoodType insCanteenFoodType);

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
    public boolean saveInsCanteenFoodTypeBatch(List<InsCanteenFoodType> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenFoodTypeBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenFoodType> list);
 }
