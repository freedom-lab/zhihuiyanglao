package cn.pluss.platform.service.insCanteenFoodInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenFoodInfo;

public interface InsCanteenFoodInfoService extends IService<InsCanteenFoodInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenFoodInfo> queryPage(Map map);

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
    public InsCanteenFoodInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodInfo 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodInfo queryOne(InsCanteenFoodInfo insCanteenFoodInfo);

    /**
    * 根据条件获取集合
    * @param insCanteenFoodInfo
    * @return
    */
    public List<InsCanteenFoodInfo> queryList(InsCanteenFoodInfo insCanteenFoodInfo);

    /**
    * 新增数据
    *
    * @param insCanteenFoodInfo 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodInfo insert(InsCanteenFoodInfo insCanteenFoodInfo);

    /**
    * 更新数据
    *
    * @param insCanteenFoodInfo 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodInfo update(InsCanteenFoodInfo insCanteenFoodInfo);

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
    public boolean saveInsCanteenFoodInfoBatch(List<InsCanteenFoodInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenFoodInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenFoodInfo> list);
 }
