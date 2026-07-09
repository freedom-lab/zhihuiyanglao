package cn.pluss.platform.service.insBaseCostItemInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsBaseCostItemInfo;

public interface InsBaseCostItemInfoService extends IService<InsBaseCostItemInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsBaseCostItemInfo> queryPage(Map map);

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
    public InsBaseCostItemInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseCostItemInfo 实例对象
    * @return 实例对象
    */
    public InsBaseCostItemInfo queryOne(InsBaseCostItemInfo insBaseCostItemInfo);

    /**
    * 根据条件获取集合
    * @param insBaseCostItemInfo
    * @return
    */
    public List<InsBaseCostItemInfo> queryList(InsBaseCostItemInfo insBaseCostItemInfo);

    /**
    * 新增数据
    *
    * @param insBaseCostItemInfo 实例对象
    * @return 实例对象
    */
    public InsBaseCostItemInfo insert(InsBaseCostItemInfo insBaseCostItemInfo);

    /**
    * 更新数据
    *
    * @param insBaseCostItemInfo 实例对象
    * @return 实例对象
    */
    public InsBaseCostItemInfo update(InsBaseCostItemInfo insBaseCostItemInfo);

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
    public boolean saveInsBaseCostItemInfoBatch(List<InsBaseCostItemInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsBaseCostItemInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsBaseCostItemInfo> list);
 }
