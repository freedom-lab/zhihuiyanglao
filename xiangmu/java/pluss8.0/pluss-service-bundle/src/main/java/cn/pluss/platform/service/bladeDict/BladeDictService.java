package cn.pluss.platform.service.bladeDict;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.BladeDict;

public interface BladeDictService extends IService<BladeDict> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<BladeDict> queryPage(Map map);

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
    public BladeDict queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param bladeDict 实例对象
    * @return 实例对象
    */
    public BladeDict queryOne(BladeDict bladeDict);

    /**
    * 根据条件获取集合
    * @param bladeDict
    * @return
    */
    public List<BladeDict> queryList(BladeDict bladeDict);

    /**
    * 新增数据
    *
    * @param bladeDict 实例对象
    * @return 实例对象
    */
    public BladeDict insert(BladeDict bladeDict);

    /**
    * 更新数据
    *
    * @param bladeDict 实例对象
    * @return 实例对象
    */
    public BladeDict update(BladeDict bladeDict);

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
    public boolean saveBladeDictBatch(List<BladeDict> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteBladeDictBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<BladeDict> list);
 }
