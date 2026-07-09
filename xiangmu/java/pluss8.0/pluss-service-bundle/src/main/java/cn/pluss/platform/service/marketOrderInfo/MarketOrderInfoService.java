package cn.pluss.platform.service.marketOrderInfo;

import cn.pluss.platform.model.dto.HealthDto;
import cn.pluss.platform.model.entity.MarketOrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface MarketOrderInfoService extends IService<MarketOrderInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MarketOrderInfo> queryPage(Map map);

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
    public MarketOrderInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param marketOrderInfo 实例对象
    * @return 实例对象
    */
    public MarketOrderInfo queryOne(MarketOrderInfo marketOrderInfo);

    /**
    * 根据条件获取集合
    * @param marketOrderInfo
    * @return
    */
    public List<MarketOrderInfo> queryList(MarketOrderInfo marketOrderInfo);

    /**
    * 新增数据
    *
    * @param marketOrderInfo 实例对象
    * @return 实例对象
    */
    public MarketOrderInfo insert(MarketOrderInfo marketOrderInfo);

    /**
    * 更新数据
    *
    * @param marketOrderInfo 实例对象
    * @return 实例对象
    */
    public MarketOrderInfo update(MarketOrderInfo marketOrderInfo);

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
    public boolean saveMarketOrderInfoBatch(List<MarketOrderInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMarketOrderInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MarketOrderInfo> list);

    Object valueAddedRevenue(HealthDto healthDto);

    /**
     * 增值服务订单数量统计（本月+累计）
     * @param healthDto 包含stratTime/endTime为当月时间范围
     * @return 物品订单、自选服务订单的本月数和累计数
     */
    Map<String, Object> valueAddedRevenueCount(HealthDto healthDto);
}
