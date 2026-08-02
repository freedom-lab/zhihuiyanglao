package cn.pluss.platform.service.insLogisticsInventoryCheck;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsInventoryCheck;

public interface InsLogisticsInventoryCheckService extends IService<InsLogisticsInventoryCheck> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsInventoryCheck> queryPage(Map map);

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
    public InsLogisticsInventoryCheck queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsInventoryCheck 实例对象
    * @return 实例对象
    */
    public InsLogisticsInventoryCheck queryOne(InsLogisticsInventoryCheck insLogisticsInventoryCheck);

    /**
    * 根据条件获取集合
    * @param insLogisticsInventoryCheck
    * @return
    */
    public List<InsLogisticsInventoryCheck> queryList(InsLogisticsInventoryCheck insLogisticsInventoryCheck);

    /**
    * 新增数据
    *
    * @param insLogisticsInventoryCheck 实例对象
    * @return 实例对象
    */
    public InsLogisticsInventoryCheck insert(InsLogisticsInventoryCheck insLogisticsInventoryCheck);

    /**
    * 更新数据
    *
    * @param insLogisticsInventoryCheck 实例对象
    * @return 实例对象
    */
    public InsLogisticsInventoryCheck update(InsLogisticsInventoryCheck insLogisticsInventoryCheck);

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
    public boolean saveInsLogisticsInventoryCheckBatch(List<InsLogisticsInventoryCheck> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsInventoryCheckBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsInventoryCheck> list);
 }
