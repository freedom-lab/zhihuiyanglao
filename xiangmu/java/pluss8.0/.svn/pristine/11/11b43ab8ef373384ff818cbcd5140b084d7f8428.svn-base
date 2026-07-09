package cn.pluss.platform.service.insCanteenOrderDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenOrderDetail;

public interface InsCanteenOrderDetailService extends IService<InsCanteenOrderDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenOrderDetail> queryPage(Map map);

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
    public InsCanteenOrderDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenOrderDetail 实例对象
    * @return 实例对象
    */
    public InsCanteenOrderDetail queryOne(InsCanteenOrderDetail insCanteenOrderDetail);

    /**
    * 根据条件获取集合
    * @param insCanteenOrderDetail
    * @return
    */
    public List<InsCanteenOrderDetail> queryList(InsCanteenOrderDetail insCanteenOrderDetail);

    /**
    * 新增数据
    *
    * @param insCanteenOrderDetail 实例对象
    * @return 实例对象
    */
    public InsCanteenOrderDetail insert(InsCanteenOrderDetail insCanteenOrderDetail);

    /**
    * 更新数据
    *
    * @param insCanteenOrderDetail 实例对象
    * @return 实例对象
    */
    public InsCanteenOrderDetail update(InsCanteenOrderDetail insCanteenOrderDetail);

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
    public boolean saveInsCanteenOrderDetailBatch(List<InsCanteenOrderDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenOrderDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenOrderDetail> list);
 }
