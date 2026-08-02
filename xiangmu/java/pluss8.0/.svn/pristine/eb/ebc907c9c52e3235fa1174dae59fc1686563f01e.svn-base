package cn.pluss.platform.service.insLogisticsOrderShopCart;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsOrderShopCart;

public interface InsLogisticsOrderShopCartService extends IService<InsLogisticsOrderShopCart> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsOrderShopCart> queryPage(Map map);

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
    public InsLogisticsOrderShopCart queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsOrderShopCart 实例对象
    * @return 实例对象
    */
    public InsLogisticsOrderShopCart queryOne(InsLogisticsOrderShopCart insLogisticsOrderShopCart);

    /**
    * 根据条件获取集合
    * @param insLogisticsOrderShopCart
    * @return
    */
    public List<InsLogisticsOrderShopCart> queryList(InsLogisticsOrderShopCart insLogisticsOrderShopCart);

    /**
    * 新增数据
    *
    * @param insLogisticsOrderShopCart 实例对象
    * @return 实例对象
    */
    public InsLogisticsOrderShopCart insert(InsLogisticsOrderShopCart insLogisticsOrderShopCart);

    /**
    * 更新数据
    *
    * @param insLogisticsOrderShopCart 实例对象
    * @return 实例对象
    */
    public InsLogisticsOrderShopCart update(InsLogisticsOrderShopCart insLogisticsOrderShopCart);

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
    public boolean saveInsLogisticsOrderShopCartBatch(List<InsLogisticsOrderShopCart> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsOrderShopCartBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsOrderShopCart> list);
 }
