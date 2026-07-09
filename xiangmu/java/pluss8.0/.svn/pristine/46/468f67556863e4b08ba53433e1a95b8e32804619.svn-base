package cn.pluss.platform.service.marketGoodsProp;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.MarketGoodsProp;

public interface MarketGoodsPropService extends IService<MarketGoodsProp> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MarketGoodsProp> queryPage(Map map);

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
    public MarketGoodsProp queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsProp 实例对象
    * @return 实例对象
    */
    public MarketGoodsProp queryOne(MarketGoodsProp marketGoodsProp);

    /**
    * 根据条件获取集合
    * @param marketGoodsProp
    * @return
    */
    public List<MarketGoodsProp> queryList(MarketGoodsProp marketGoodsProp);

    /**
    * 新增数据
    *
    * @param marketGoodsProp 实例对象
    * @return 实例对象
    */
    public MarketGoodsProp insert(MarketGoodsProp marketGoodsProp);

    /**
    * 更新数据
    *
    * @param marketGoodsProp 实例对象
    * @return 实例对象
    */
    public MarketGoodsProp update(MarketGoodsProp marketGoodsProp);

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
    public boolean saveMarketGoodsPropBatch(List<MarketGoodsProp> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMarketGoodsPropBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MarketGoodsProp> list);
 }
