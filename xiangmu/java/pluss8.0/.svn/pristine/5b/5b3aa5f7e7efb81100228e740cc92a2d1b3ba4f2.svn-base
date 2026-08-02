package cn.pluss.platform.service.smartDeviceArchive;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.SmartDeviceArchive;

public interface SmartDeviceArchiveService extends IService<SmartDeviceArchive> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<SmartDeviceArchive> queryPage(Map map);

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
    public SmartDeviceArchive queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceArchive 实例对象
    * @return 实例对象
    */
    public SmartDeviceArchive queryOne(SmartDeviceArchive smartDeviceArchive);

    /**
    * 根据条件获取集合
    * @param smartDeviceArchive
    * @return
    */
    public List<SmartDeviceArchive> queryList(SmartDeviceArchive smartDeviceArchive);

    /**
    * 新增数据
    *
    * @param smartDeviceArchive 实例对象
    * @return 实例对象
    */
    public SmartDeviceArchive insert(SmartDeviceArchive smartDeviceArchive);

    /**
    * 更新数据
    *
    * @param smartDeviceArchive 实例对象
    * @return 实例对象
    */
    public SmartDeviceArchive update(SmartDeviceArchive smartDeviceArchive);

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
    public boolean saveSmartDeviceArchiveBatch(List<SmartDeviceArchive> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteSmartDeviceArchiveBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<SmartDeviceArchive> list);
 }
