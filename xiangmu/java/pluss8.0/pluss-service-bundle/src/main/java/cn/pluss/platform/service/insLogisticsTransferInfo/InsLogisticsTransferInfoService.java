package cn.pluss.platform.service.insLogisticsTransferInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsTransferInfo;

public interface InsLogisticsTransferInfoService extends IService<InsLogisticsTransferInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsTransferInfo> queryPage(Map map);

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
    public InsLogisticsTransferInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsTransferInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsTransferInfo queryOne(InsLogisticsTransferInfo insLogisticsTransferInfo);

    /**
    * 根据条件获取集合
    * @param insLogisticsTransferInfo
    * @return
    */
    public List<InsLogisticsTransferInfo> queryList(InsLogisticsTransferInfo insLogisticsTransferInfo);

    /**
    * 新增数据
    *
    * @param insLogisticsTransferInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsTransferInfo insert(InsLogisticsTransferInfo insLogisticsTransferInfo);

    /**
    * 更新数据
    *
    * @param insLogisticsTransferInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsTransferInfo update(InsLogisticsTransferInfo insLogisticsTransferInfo);

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
    public boolean saveInsLogisticsTransferInfoBatch(List<InsLogisticsTransferInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsTransferInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsTransferInfo> list);
 }
