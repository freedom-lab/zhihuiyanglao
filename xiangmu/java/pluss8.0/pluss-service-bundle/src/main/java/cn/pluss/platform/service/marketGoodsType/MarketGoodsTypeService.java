package cn.pluss.platform.service.marketGoodsType;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.MarketGoodsType;

public interface MarketGoodsTypeService extends IService<MarketGoodsType> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MarketGoodsType> queryPage(Map map);

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
    public MarketGoodsType queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsType 实例对象
    * @return 实例对象
    */
    public MarketGoodsType queryOne(MarketGoodsType marketGoodsType);

    /**
    * 根据条件获取集合
    * @param marketGoodsType
    * @return
    */
    public List<MarketGoodsType> queryList(MarketGoodsType marketGoodsType);

    /**
    * 新增数据
    *
    * @param marketGoodsType 实例对象
    * @return 实例对象
    */
    public MarketGoodsType insert(MarketGoodsType marketGoodsType);

    /**
    * 更新数据
    *
    * @param marketGoodsType 实例对象
    * @return 实例对象
    */
    public MarketGoodsType update(MarketGoodsType marketGoodsType);

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
    public boolean saveMarketGoodsTypeBatch(List<MarketGoodsType> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMarketGoodsTypeBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MarketGoodsType> list);
 }
