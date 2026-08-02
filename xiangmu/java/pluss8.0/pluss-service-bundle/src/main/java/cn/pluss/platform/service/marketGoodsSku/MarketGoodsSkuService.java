package cn.pluss.platform.service.marketGoodsSku;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.MarketGoodsSku;

public interface MarketGoodsSkuService extends IService<MarketGoodsSku> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MarketGoodsSku> queryPage(Map map);

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
    public MarketGoodsSku queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsSku 实例对象
    * @return 实例对象
    */
    public MarketGoodsSku queryOne(MarketGoodsSku marketGoodsSku);

    /**
    * 根据条件获取集合
    * @param marketGoodsSku
    * @return
    */
    public List<MarketGoodsSku> queryList(MarketGoodsSku marketGoodsSku);

    /**
    * 新增数据
    *
    * @param marketGoodsSku 实例对象
    * @return 实例对象
    */
    public MarketGoodsSku insert(MarketGoodsSku marketGoodsSku);

    /**
    * 更新数据
    *
    * @param marketGoodsSku 实例对象
    * @return 实例对象
    */
    public MarketGoodsSku update(MarketGoodsSku marketGoodsSku);

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
    public boolean saveMarketGoodsSkuBatch(List<MarketGoodsSku> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMarketGoodsSkuBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MarketGoodsSku> list);
 }
