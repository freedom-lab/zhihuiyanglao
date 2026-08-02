package cn.pluss.platform.service.insNursingServiceItem;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingServiceItem;

public interface InsNursingServiceItemService extends IService<InsNursingServiceItem> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingServiceItem> queryPage(Map map);

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
    public InsNursingServiceItem queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingServiceItem 实例对象
    * @return 实例对象
    */
    public InsNursingServiceItem queryOne(InsNursingServiceItem insNursingServiceItem);

    /**
    * 根据条件获取集合
    * @param insNursingServiceItem
    * @return
    */
    public List<InsNursingServiceItem> queryList(InsNursingServiceItem insNursingServiceItem);

    /**
    * 新增数据
    *
    * @param insNursingServiceItem 实例对象
    * @return 实例对象
    */
    public InsNursingServiceItem insert(InsNursingServiceItem insNursingServiceItem);

    /**
    * 更新数据
    *
    * @param insNursingServiceItem 实例对象
    * @return 实例对象
    */
    public InsNursingServiceItem update(InsNursingServiceItem insNursingServiceItem);

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
    public boolean saveInsNursingServiceItemBatch(List<InsNursingServiceItem> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingServiceItemBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingServiceItem> list);
 }
