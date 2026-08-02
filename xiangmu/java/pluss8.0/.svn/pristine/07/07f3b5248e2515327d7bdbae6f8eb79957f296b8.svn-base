package cn.pluss.platform.service.iotDeviceType;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.IotDeviceType;

public interface IotDeviceTypeService extends IService<IotDeviceType> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<IotDeviceType> queryPage(Map map);

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
    public IotDeviceType queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param iotDeviceType 实例对象
    * @return 实例对象
    */
    public IotDeviceType queryOne(IotDeviceType iotDeviceType);

    /**
    * 根据条件获取集合
    * @param iotDeviceType
    * @return
    */
    public List<IotDeviceType> queryList(IotDeviceType iotDeviceType);

    /**
    * 新增数据
    *
    * @param iotDeviceType 实例对象
    * @return 实例对象
    */
    public IotDeviceType insert(IotDeviceType iotDeviceType);

    /**
    * 更新数据
    *
    * @param iotDeviceType 实例对象
    * @return 实例对象
    */
    public IotDeviceType update(IotDeviceType iotDeviceType);

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
    public boolean saveIotDeviceTypeBatch(List<IotDeviceType> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteIotDeviceTypeBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<IotDeviceType> list);
 }
