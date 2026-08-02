package cn.pluss.platform.service.insCanteenWeekMenu;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenWeekMenu;

public interface InsCanteenWeekMenuService extends IService<InsCanteenWeekMenu> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenWeekMenu> queryPage(Map map);

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
    public InsCanteenWeekMenu queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenWeekMenu 实例对象
    * @return 实例对象
    */
    public InsCanteenWeekMenu queryOne(InsCanteenWeekMenu insCanteenWeekMenu);

    /**
    * 根据条件获取集合
    * @param insCanteenWeekMenu
    * @return
    */
    public List<InsCanteenWeekMenu> queryList(InsCanteenWeekMenu insCanteenWeekMenu);

    /**
    * 新增数据
    *
    * @param insCanteenWeekMenu 实例对象
    * @return 实例对象
    */
    public InsCanteenWeekMenu insert(InsCanteenWeekMenu insCanteenWeekMenu);

    /**
    * 更新数据
    *
    * @param insCanteenWeekMenu 实例对象
    * @return 实例对象
    */
    public InsCanteenWeekMenu update(InsCanteenWeekMenu insCanteenWeekMenu);

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
    public boolean saveInsCanteenWeekMenuBatch(List<InsCanteenWeekMenu> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenWeekMenuBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenWeekMenu> list);
 }
