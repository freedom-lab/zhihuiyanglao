package cn.pluss.platform.service.iotDeviceDataLog;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.IotDeviceDataLog;

public interface IotDeviceDataLogService extends IService<IotDeviceDataLog> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<IotDeviceDataLog> queryPage(Map map);

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
    public IotDeviceDataLog queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param iotDeviceDataLog 实例对象
    * @return 实例对象
    */
    public IotDeviceDataLog queryOne(IotDeviceDataLog iotDeviceDataLog);

    /**
    * 根据条件获取集合
    * @param iotDeviceDataLog
    * @return
    */
    public List<IotDeviceDataLog> queryList(IotDeviceDataLog iotDeviceDataLog);

    /**
    * 新增数据
    *
    * @param iotDeviceDataLog 实例对象
    * @return 实例对象
    */
    public IotDeviceDataLog insert(IotDeviceDataLog iotDeviceDataLog);

    /**
    * 更新数据
    *
    * @param iotDeviceDataLog 实例对象
    * @return 实例对象
    */
    public IotDeviceDataLog update(IotDeviceDataLog iotDeviceDataLog);

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
    public boolean saveIotDeviceDataLogBatch(List<IotDeviceDataLog> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteIotDeviceDataLogBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<IotDeviceDataLog> list);
 }
