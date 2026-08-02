package cn.pluss.platform.service.insLogisticsOrderInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsOrderInfo;

public interface InsLogisticsOrderInfoService extends IService<InsLogisticsOrderInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsOrderInfo> queryPage(Map map);

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
    public InsLogisticsOrderInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsOrderInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsOrderInfo queryOne(InsLogisticsOrderInfo insLogisticsOrderInfo);

    /**
    * 根据条件获取集合
    * @param insLogisticsOrderInfo
    * @return
    */
    public List<InsLogisticsOrderInfo> queryList(InsLogisticsOrderInfo insLogisticsOrderInfo);

    /**
    * 新增数据
    *
    * @param insLogisticsOrderInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsOrderInfo insert(InsLogisticsOrderInfo insLogisticsOrderInfo);

    /**
    * 更新数据
    *
    * @param insLogisticsOrderInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsOrderInfo update(InsLogisticsOrderInfo insLogisticsOrderInfo);

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
    public boolean saveInsLogisticsOrderInfoBatch(List<InsLogisticsOrderInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsOrderInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsOrderInfo> list);
 }
