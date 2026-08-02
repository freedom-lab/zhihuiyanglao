package cn.pluss.platform.service.canteenDeviceMaintain;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CanteenDeviceMaintain;

public interface CanteenDeviceMaintainService extends IService<CanteenDeviceMaintain> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CanteenDeviceMaintain> queryPage(Map map);

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
    public CanteenDeviceMaintain queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param canteenDeviceMaintain 实例对象
    * @return 实例对象
    */
    public CanteenDeviceMaintain queryOne(CanteenDeviceMaintain canteenDeviceMaintain);

    /**
    * 根据条件获取集合
    * @param canteenDeviceMaintain
    * @return
    */
    public List<CanteenDeviceMaintain> queryList(CanteenDeviceMaintain canteenDeviceMaintain);

    /**
    * 新增数据
    *
    * @param canteenDeviceMaintain 实例对象
    * @return 实例对象
    */
    public CanteenDeviceMaintain insert(CanteenDeviceMaintain canteenDeviceMaintain);

    /**
    * 更新数据
    *
    * @param canteenDeviceMaintain 实例对象
    * @return 实例对象
    */
    public CanteenDeviceMaintain update(CanteenDeviceMaintain canteenDeviceMaintain);

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
    public boolean saveCanteenDeviceMaintainBatch(List<CanteenDeviceMaintain> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCanteenDeviceMaintainBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CanteenDeviceMaintain> list);
 }
