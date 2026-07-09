package cn.pluss.platform.service.marketGoodsAttributeValue;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.MarketGoodsAttributeValue;

public interface MarketGoodsAttributeValueService extends IService<MarketGoodsAttributeValue> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MarketGoodsAttributeValue> queryPage(Map map);

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
    public MarketGoodsAttributeValue queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsAttributeValue 实例对象
    * @return 实例对象
    */
    public MarketGoodsAttributeValue queryOne(MarketGoodsAttributeValue marketGoodsAttributeValue);

    /**
    * 根据条件获取集合
    * @param marketGoodsAttributeValue
    * @return
    */
    public List<MarketGoodsAttributeValue> queryList(MarketGoodsAttributeValue marketGoodsAttributeValue);

    /**
    * 新增数据
    *
    * @param marketGoodsAttributeValue 实例对象
    * @return 实例对象
    */
    public MarketGoodsAttributeValue insert(MarketGoodsAttributeValue marketGoodsAttributeValue);

    /**
    * 更新数据
    *
    * @param marketGoodsAttributeValue 实例对象
    * @return 实例对象
    */
    public MarketGoodsAttributeValue update(MarketGoodsAttributeValue marketGoodsAttributeValue);

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
    public boolean saveMarketGoodsAttributeValueBatch(List<MarketGoodsAttributeValue> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMarketGoodsAttributeValueBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MarketGoodsAttributeValue> list);
 }
