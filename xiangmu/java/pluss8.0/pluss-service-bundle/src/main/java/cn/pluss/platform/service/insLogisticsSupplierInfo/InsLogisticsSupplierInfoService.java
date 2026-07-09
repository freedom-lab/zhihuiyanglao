package cn.pluss.platform.service.insLogisticsSupplierInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsSupplierInfo;

public interface InsLogisticsSupplierInfoService extends IService<InsLogisticsSupplierInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsSupplierInfo> queryPage(Map map);

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
    public InsLogisticsSupplierInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsSupplierInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsSupplierInfo queryOne(InsLogisticsSupplierInfo insLogisticsSupplierInfo);

    /**
    * 根据条件获取集合
    * @param insLogisticsSupplierInfo
    * @return
    */
    public List<InsLogisticsSupplierInfo> queryList(InsLogisticsSupplierInfo insLogisticsSupplierInfo);

    /**
    * 新增数据
    *
    * @param insLogisticsSupplierInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsSupplierInfo insert(InsLogisticsSupplierInfo insLogisticsSupplierInfo);

    /**
    * 更新数据
    *
    * @param insLogisticsSupplierInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsSupplierInfo update(InsLogisticsSupplierInfo insLogisticsSupplierInfo);

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
    public boolean saveInsLogisticsSupplierInfoBatch(List<InsLogisticsSupplierInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsSupplierInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsSupplierInfo> list);
 }
