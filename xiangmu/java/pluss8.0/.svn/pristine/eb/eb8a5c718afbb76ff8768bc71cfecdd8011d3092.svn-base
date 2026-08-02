package cn.pluss.platform.service.marketGoodsInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.MarketGoodsInfo;

public interface MarketGoodsInfoService extends IService<MarketGoodsInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MarketGoodsInfo> queryPage(Map map);

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
    public MarketGoodsInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param marketGoodsInfo 实例对象
    * @return 实例对象
    */
    public MarketGoodsInfo queryOne(MarketGoodsInfo marketGoodsInfo);

    /**
    * 根据条件获取集合
    * @param marketGoodsInfo
    * @return
    */
    public List<MarketGoodsInfo> queryList(MarketGoodsInfo marketGoodsInfo);

    /**
    * 新增数据
    *
    * @param marketGoodsInfo 实例对象
    * @return 实例对象
    */
    public MarketGoodsInfo insert(MarketGoodsInfo marketGoodsInfo);

    /**
    * 更新数据
    *
    * @param marketGoodsInfo 实例对象
    * @return 实例对象
    */
    public MarketGoodsInfo update(MarketGoodsInfo marketGoodsInfo);

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
    public boolean saveMarketGoodsInfoBatch(List<MarketGoodsInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMarketGoodsInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MarketGoodsInfo> list);
 }
