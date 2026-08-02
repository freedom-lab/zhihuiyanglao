package cn.pluss.platform.service.iotDeviceAlarmLog;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.IotDeviceAlarmLog;

public interface IotDeviceAlarmLogService extends IService<IotDeviceAlarmLog> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<IotDeviceAlarmLog> queryPage(Map map);

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
    public IotDeviceAlarmLog queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param iotDeviceAlarmLog 实例对象
    * @return 实例对象
    */
    public IotDeviceAlarmLog queryOne(IotDeviceAlarmLog iotDeviceAlarmLog);

    /**
    * 根据条件获取集合
    * @param iotDeviceAlarmLog
    * @return
    */
    public List<IotDeviceAlarmLog> queryList(IotDeviceAlarmLog iotDeviceAlarmLog);

    /**
    * 新增数据
    *
    * @param iotDeviceAlarmLog 实例对象
    * @return 实例对象
    */
    public IotDeviceAlarmLog insert(IotDeviceAlarmLog iotDeviceAlarmLog);

    /**
    * 更新数据
    *
    * @param iotDeviceAlarmLog 实例对象
    * @return 实例对象
    */
    public IotDeviceAlarmLog update(IotDeviceAlarmLog iotDeviceAlarmLog);

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
    public boolean saveIotDeviceAlarmLogBatch(List<IotDeviceAlarmLog> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteIotDeviceAlarmLogBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<IotDeviceAlarmLog> list);
 }
