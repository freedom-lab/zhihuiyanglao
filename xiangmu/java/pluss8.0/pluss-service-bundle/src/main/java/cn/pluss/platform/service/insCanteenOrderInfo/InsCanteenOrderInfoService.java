package cn.pluss.platform.service.insCanteenOrderInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenOrderInfo;

public interface InsCanteenOrderInfoService extends IService<InsCanteenOrderInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenOrderInfo> queryPage(Map map);

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
    public InsCanteenOrderInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenOrderInfo 实例对象
    * @return 实例对象
    */
    public InsCanteenOrderInfo queryOne(InsCanteenOrderInfo insCanteenOrderInfo);

    /**
    * 根据条件获取集合
    * @param insCanteenOrderInfo
    * @return
    */
    public List<InsCanteenOrderInfo> queryList(InsCanteenOrderInfo insCanteenOrderInfo);

    /**
    * 新增数据
    *
    * @param insCanteenOrderInfo 实例对象
    * @return 实例对象
    */
    public InsCanteenOrderInfo insert(InsCanteenOrderInfo insCanteenOrderInfo);

    /**
    * 更新数据
    *
    * @param insCanteenOrderInfo 实例对象
    * @return 实例对象
    */
    public InsCanteenOrderInfo update(InsCanteenOrderInfo insCanteenOrderInfo);

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
    public boolean saveInsCanteenOrderInfoBatch(List<InsCanteenOrderInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenOrderInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenOrderInfo> list);
 }
