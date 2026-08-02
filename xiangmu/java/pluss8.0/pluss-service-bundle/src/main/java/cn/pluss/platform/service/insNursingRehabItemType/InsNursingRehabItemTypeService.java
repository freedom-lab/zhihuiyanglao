package cn.pluss.platform.service.insNursingRehabItemType;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingRehabItemType;

public interface InsNursingRehabItemTypeService extends IService<InsNursingRehabItemType> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingRehabItemType> queryPage(Map map);

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
    public InsNursingRehabItemType queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRehabItemType 实例对象
    * @return 实例对象
    */
    public InsNursingRehabItemType queryOne(InsNursingRehabItemType insNursingRehabItemType);

    /**
    * 根据条件获取集合
    * @param insNursingRehabItemType
    * @return
    */
    public List<InsNursingRehabItemType> queryList(InsNursingRehabItemType insNursingRehabItemType);

    /**
    * 新增数据
    *
    * @param insNursingRehabItemType 实例对象
    * @return 实例对象
    */
    public InsNursingRehabItemType insert(InsNursingRehabItemType insNursingRehabItemType);

    /**
    * 更新数据
    *
    * @param insNursingRehabItemType 实例对象
    * @return 实例对象
    */
    public InsNursingRehabItemType update(InsNursingRehabItemType insNursingRehabItemType);

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
    public boolean saveInsNursingRehabItemTypeBatch(List<InsNursingRehabItemType> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingRehabItemTypeBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingRehabItemType> list);
 }
