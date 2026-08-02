package cn.pluss.platform.service.smartDeviceParamPartner;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.SmartDeviceParamPartner;

public interface SmartDeviceParamPartnerService extends IService<SmartDeviceParamPartner> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<SmartDeviceParamPartner> queryPage(Map map);

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
    public SmartDeviceParamPartner queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param smartDeviceParamPartner 实例对象
    * @return 实例对象
    */
    public SmartDeviceParamPartner queryOne(SmartDeviceParamPartner smartDeviceParamPartner);

    /**
    * 根据条件获取集合
    * @param smartDeviceParamPartner
    * @return
    */
    public List<SmartDeviceParamPartner> queryList(SmartDeviceParamPartner smartDeviceParamPartner);

    /**
    * 新增数据
    *
    * @param smartDeviceParamPartner 实例对象
    * @return 实例对象
    */
    public SmartDeviceParamPartner insert(SmartDeviceParamPartner smartDeviceParamPartner);

    /**
    * 更新数据
    *
    * @param smartDeviceParamPartner 实例对象
    * @return 实例对象
    */
    public SmartDeviceParamPartner update(SmartDeviceParamPartner smartDeviceParamPartner);

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
    public boolean saveSmartDeviceParamPartnerBatch(List<SmartDeviceParamPartner> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteSmartDeviceParamPartnerBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<SmartDeviceParamPartner> list);
 }
