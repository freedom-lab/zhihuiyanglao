package cn.pluss.platform.service.iotDeviceInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.IotDeviceInfo;

public interface IotDeviceInfoService extends IService<IotDeviceInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<IotDeviceInfo> queryPage(Map map);

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
    public IotDeviceInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param iotDeviceInfo 实例对象
    * @return 实例对象
    */
    public IotDeviceInfo queryOne(IotDeviceInfo iotDeviceInfo);

    /**
    * 根据条件获取集合
    * @param iotDeviceInfo
    * @return
    */
    public List<IotDeviceInfo> queryList(IotDeviceInfo iotDeviceInfo);

    /**
    * 新增数据
    *
    * @param iotDeviceInfo 实例对象
    * @return 实例对象
    */
    public IotDeviceInfo insert(IotDeviceInfo iotDeviceInfo);

    /**
    * 更新数据
    *
    * @param iotDeviceInfo 实例对象
    * @return 实例对象
    */
    public IotDeviceInfo update(IotDeviceInfo iotDeviceInfo);

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
    public boolean saveIotDeviceInfoBatch(List<IotDeviceInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteIotDeviceInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<IotDeviceInfo> list);
 }
