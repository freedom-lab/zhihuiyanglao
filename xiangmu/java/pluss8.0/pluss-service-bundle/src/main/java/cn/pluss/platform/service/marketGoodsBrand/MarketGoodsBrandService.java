package cn.pluss.platform.service.marketGoodsBrand;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.MarketGoodsBrand;

public interface MarketGoodsBrandService extends IService<MarketGoodsBrand> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MarketGoodsBrand> queryPage(Map map);

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
    public MarketGoodsBrand queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsBrand 实例对象
    * @return 实例对象
    */
    public MarketGoodsBrand queryOne(MarketGoodsBrand marketGoodsBrand);

    /**
    * 根据条件获取集合
    * @param marketGoodsBrand
    * @return
    */
    public List<MarketGoodsBrand> queryList(MarketGoodsBrand marketGoodsBrand);

    /**
    * 新增数据
    *
    * @param marketGoodsBrand 实例对象
    * @return 实例对象
    */
    public MarketGoodsBrand insert(MarketGoodsBrand marketGoodsBrand);

    /**
    * 更新数据
    *
    * @param marketGoodsBrand 实例对象
    * @return 实例对象
    */
    public MarketGoodsBrand update(MarketGoodsBrand marketGoodsBrand);

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
    public boolean saveMarketGoodsBrandBatch(List<MarketGoodsBrand> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMarketGoodsBrandBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MarketGoodsBrand> list);
 }
