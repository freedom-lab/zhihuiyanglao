package cn.pluss.platform.service.insNursingItemType;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingItemType;

public interface InsNursingItemTypeService extends IService<InsNursingItemType> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingItemType> queryPage(Map map);

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
    public InsNursingItemType queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingItemType 实例对象
    * @return 实例对象
    */
    public InsNursingItemType queryOne(InsNursingItemType insNursingItemType);

    /**
    * 根据条件获取集合
    * @param insNursingItemType
    * @return
    */
    public List<InsNursingItemType> queryList(InsNursingItemType insNursingItemType);

    /**
    * 新增数据
    *
    * @param insNursingItemType 实例对象
    * @return 实例对象
    */
    public InsNursingItemType insert(InsNursingItemType insNursingItemType);

    /**
    * 更新数据
    *
    * @param insNursingItemType 实例对象
    * @return 实例对象
    */
    public InsNursingItemType update(InsNursingItemType insNursingItemType);

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
    public boolean saveInsNursingItemTypeBatch(List<InsNursingItemType> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingItemTypeBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingItemType> list);
 }
