package cn.pluss.platform.service.bladeProcessLeave;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.BladeProcessLeave;

public interface BladeProcessLeaveService extends IService<BladeProcessLeave> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<BladeProcessLeave> queryPage(Map map);

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
    public BladeProcessLeave queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param bladeProcessLeave 实例对象
    * @return 实例对象
    */
    public BladeProcessLeave queryOne(BladeProcessLeave bladeProcessLeave);

    /**
    * 根据条件获取集合
    * @param bladeProcessLeave
    * @return
    */
    public List<BladeProcessLeave> queryList(BladeProcessLeave bladeProcessLeave);

    /**
    * 新增数据
    *
    * @param bladeProcessLeave 实例对象
    * @return 实例对象
    */
    public BladeProcessLeave insert(BladeProcessLeave bladeProcessLeave);

    /**
    * 更新数据
    *
    * @param bladeProcessLeave 实例对象
    * @return 实例对象
    */
    public BladeProcessLeave update(BladeProcessLeave bladeProcessLeave);

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
    public boolean saveBladeProcessLeaveBatch(List<BladeProcessLeave> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteBladeProcessLeaveBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<BladeProcessLeave> list);
 }
