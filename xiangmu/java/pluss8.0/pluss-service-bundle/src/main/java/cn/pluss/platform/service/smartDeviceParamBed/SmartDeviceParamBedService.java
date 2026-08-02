package cn.pluss.platform.service.smartDeviceParamBed;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.SmartDeviceParamBed;

public interface SmartDeviceParamBedService extends IService<SmartDeviceParamBed> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<SmartDeviceParamBed> queryPage(Map map);

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
    public SmartDeviceParamBed queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceParamBed 实例对象
    * @return 实例对象
    */
    public SmartDeviceParamBed queryOne(SmartDeviceParamBed smartDeviceParamBed);

    /**
    * 根据条件获取集合
    * @param smartDeviceParamBed
    * @return
    */
    public List<SmartDeviceParamBed> queryList(SmartDeviceParamBed smartDeviceParamBed);

    /**
    * 新增数据
    *
    * @param smartDeviceParamBed 实例对象
    * @return 实例对象
    */
    public SmartDeviceParamBed insert(SmartDeviceParamBed smartDeviceParamBed);

    /**
    * 更新数据
    *
    * @param smartDeviceParamBed 实例对象
    * @return 实例对象
    */
    public SmartDeviceParamBed update(SmartDeviceParamBed smartDeviceParamBed);

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
    public boolean saveSmartDeviceParamBedBatch(List<SmartDeviceParamBed> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteSmartDeviceParamBedBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<SmartDeviceParamBed> list);

    /**
    * 根据deviceName更新数据
    *
    * @param smartDeviceParamBed 实例对象
    */
    void updateSmartDeviceParamBed(SmartDeviceParamBed smartDeviceParamBed);
}
