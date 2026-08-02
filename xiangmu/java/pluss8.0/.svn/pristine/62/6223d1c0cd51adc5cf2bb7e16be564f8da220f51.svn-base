package cn.pluss.platform.service.canteenKitchenHygiene;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CanteenKitchenHygiene;

public interface CanteenKitchenHygieneService extends IService<CanteenKitchenHygiene> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CanteenKitchenHygiene> queryPage(Map map);

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
    public CanteenKitchenHygiene queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param canteenKitchenHygiene 实例对象
    * @return 实例对象
    */
    public CanteenKitchenHygiene queryOne(CanteenKitchenHygiene canteenKitchenHygiene);

    /**
    * 根据条件获取集合
    * @param canteenKitchenHygiene
    * @return
    */
    public List<CanteenKitchenHygiene> queryList(CanteenKitchenHygiene canteenKitchenHygiene);

    /**
    * 新增数据
    *
    * @param canteenKitchenHygiene 实例对象
    * @return 实例对象
    */
    public CanteenKitchenHygiene insert(CanteenKitchenHygiene canteenKitchenHygiene);

    /**
    * 更新数据
    *
    * @param canteenKitchenHygiene 实例对象
    * @return 实例对象
    */
    public CanteenKitchenHygiene update(CanteenKitchenHygiene canteenKitchenHygiene);

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
    public boolean saveCanteenKitchenHygieneBatch(List<CanteenKitchenHygiene> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCanteenKitchenHygieneBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CanteenKitchenHygiene> list);
 }
