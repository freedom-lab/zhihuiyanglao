package cn.pluss.platform.service.insLogisticsOrderDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsOrderDetail;

public interface InsLogisticsOrderDetailService extends IService<InsLogisticsOrderDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsOrderDetail> queryPage(Map map);

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
    public InsLogisticsOrderDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsOrderDetail 实例对象
    * @return 实例对象
    */
    public InsLogisticsOrderDetail queryOne(InsLogisticsOrderDetail insLogisticsOrderDetail);

    /**
    * 根据条件获取集合
    * @param insLogisticsOrderDetail
    * @return
    */
    public List<InsLogisticsOrderDetail> queryList(InsLogisticsOrderDetail insLogisticsOrderDetail);

    /**
    * 新增数据
    *
    * @param insLogisticsOrderDetail 实例对象
    * @return 实例对象
    */
    public InsLogisticsOrderDetail insert(InsLogisticsOrderDetail insLogisticsOrderDetail);

    /**
    * 更新数据
    *
    * @param insLogisticsOrderDetail 实例对象
    * @return 实例对象
    */
    public InsLogisticsOrderDetail update(InsLogisticsOrderDetail insLogisticsOrderDetail);

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
    public boolean saveInsLogisticsOrderDetailBatch(List<InsLogisticsOrderDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsOrderDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsOrderDetail> list);
 }
