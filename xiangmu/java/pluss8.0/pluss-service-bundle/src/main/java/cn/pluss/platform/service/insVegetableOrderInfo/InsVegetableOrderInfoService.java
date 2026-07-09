package cn.pluss.platform.service.insVegetableOrderInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsVegetableOrderInfo;

public interface InsVegetableOrderInfoService extends IService<InsVegetableOrderInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsVegetableOrderInfo> queryPage(Map map);

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
    public InsVegetableOrderInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insVegetableOrderInfo 实例对象
    * @return 实例对象
    */
    public InsVegetableOrderInfo queryOne(InsVegetableOrderInfo insVegetableOrderInfo);

    /**
    * 根据条件获取集合
    * @param insVegetableOrderInfo
    * @return
    */
    public List<InsVegetableOrderInfo> queryList(InsVegetableOrderInfo insVegetableOrderInfo);

    /**
    * 新增数据
    *
    * @param insVegetableOrderInfo 实例对象
    * @return 实例对象
    */
    public InsVegetableOrderInfo insert(InsVegetableOrderInfo insVegetableOrderInfo);

    /**
    * 更新数据
    *
    * @param insVegetableOrderInfo 实例对象
    * @return 实例对象
    */
    public InsVegetableOrderInfo update(InsVegetableOrderInfo insVegetableOrderInfo);

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
    public boolean saveInsVegetableOrderInfoBatch(List<InsVegetableOrderInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsVegetableOrderInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsVegetableOrderInfo> list);
 }
