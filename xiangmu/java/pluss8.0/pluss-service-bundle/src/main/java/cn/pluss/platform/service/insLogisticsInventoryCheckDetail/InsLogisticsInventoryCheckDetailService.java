package cn.pluss.platform.service.insLogisticsInventoryCheckDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsInventoryCheckDetail;

public interface InsLogisticsInventoryCheckDetailService extends IService<InsLogisticsInventoryCheckDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsInventoryCheckDetail> queryPage(Map map);

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
    public InsLogisticsInventoryCheckDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsInventoryCheckDetail 实例对象
    * @return 实例对象
    */
    public InsLogisticsInventoryCheckDetail queryOne(InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail);

    /**
    * 根据条件获取集合
    * @param insLogisticsInventoryCheckDetail
    * @return
    */
    public List<InsLogisticsInventoryCheckDetail> queryList(InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail);

    /**
    * 新增数据
    *
    * @param insLogisticsInventoryCheckDetail 实例对象
    * @return 实例对象
    */
    public InsLogisticsInventoryCheckDetail insert(InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail);

    /**
    * 更新数据
    *
    * @param insLogisticsInventoryCheckDetail 实例对象
    * @return 实例对象
    */
    public InsLogisticsInventoryCheckDetail update(InsLogisticsInventoryCheckDetail insLogisticsInventoryCheckDetail);

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
    public boolean saveInsLogisticsInventoryCheckDetailBatch(List<InsLogisticsInventoryCheckDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsInventoryCheckDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsInventoryCheckDetail> list);
 }
