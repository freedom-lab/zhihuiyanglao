package cn.pluss.platform.service.insNursingRehabItem;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingRehabItem;

public interface InsNursingRehabItemService extends IService<InsNursingRehabItem> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingRehabItem> queryPage(Map map);

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
    public InsNursingRehabItem queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRehabItem 实例对象
    * @return 实例对象
    */
    public InsNursingRehabItem queryOne(InsNursingRehabItem insNursingRehabItem);

    /**
    * 根据条件获取集合
    * @param insNursingRehabItem
    * @return
    */
    public List<InsNursingRehabItem> queryList(InsNursingRehabItem insNursingRehabItem);

    /**
    * 新增数据
    *
    * @param insNursingRehabItem 实例对象
    * @return 实例对象
    */
    public InsNursingRehabItem insert(InsNursingRehabItem insNursingRehabItem);

    /**
    * 更新数据
    *
    * @param insNursingRehabItem 实例对象
    * @return 实例对象
    */
    public InsNursingRehabItem update(InsNursingRehabItem insNursingRehabItem);

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
    public boolean saveInsNursingRehabItemBatch(List<InsNursingRehabItem> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingRehabItemBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingRehabItem> list);
 }
