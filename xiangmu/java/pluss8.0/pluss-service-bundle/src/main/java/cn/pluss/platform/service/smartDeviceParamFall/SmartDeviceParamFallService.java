package cn.pluss.platform.service.smartDeviceParamFall;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.SmartDeviceParamFall;

public interface SmartDeviceParamFallService extends IService<SmartDeviceParamFall> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<SmartDeviceParamFall> queryPage(Map map);

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
    public SmartDeviceParamFall queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceParamFall 实例对象
    * @return 实例对象
    */
    public SmartDeviceParamFall queryOne(SmartDeviceParamFall smartDeviceParamFall);

    /**
    * 根据条件获取集合
    * @param smartDeviceParamFall
    * @return
    */
    public List<SmartDeviceParamFall> queryList(SmartDeviceParamFall smartDeviceParamFall);

    /**
    * 新增数据
    *
    * @param smartDeviceParamFall 实例对象
    * @return 实例对象
    */
    public SmartDeviceParamFall insert(SmartDeviceParamFall smartDeviceParamFall);

    /**
    * 更新数据
    *
    * @param smartDeviceParamFall 实例对象
    * @return 实例对象
    */
    public SmartDeviceParamFall update(SmartDeviceParamFall smartDeviceParamFall);

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
    public boolean saveSmartDeviceParamFallBatch(List<SmartDeviceParamFall> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteSmartDeviceParamFallBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<SmartDeviceParamFall> list);

    /**
    * 根据设备序列号更新摔倒检测数据
    * @param smartDeviceParamFall 实例对象（deviceSerial 必填）
    * @return 更新后的对象
    */
    public void updateByDeviceSerial(SmartDeviceParamFall smartDeviceParamFall);
 }
