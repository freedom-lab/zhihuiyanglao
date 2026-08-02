package cn.pluss.platform.service.insSchedulingClasses;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSchedulingClasses;

public interface InsSchedulingClassesService extends IService<InsSchedulingClasses> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSchedulingClasses> queryPage(Map map);

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
    public InsSchedulingClasses queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingClasses 实例对象
    * @return 实例对象
    */
    public InsSchedulingClasses queryOne(InsSchedulingClasses insSchedulingClasses);

    /**
    * 根据条件获取集合
    * @param insSchedulingClasses
    * @return
    */
    public List<InsSchedulingClasses> queryList(InsSchedulingClasses insSchedulingClasses);

    /**
    * 新增数据
    *
    * @param insSchedulingClasses 实例对象
    * @return 实例对象
    */
    public InsSchedulingClasses insert(InsSchedulingClasses insSchedulingClasses);

    /**
    * 更新数据
    *
    * @param insSchedulingClasses 实例对象
    * @return 实例对象
    */
    public InsSchedulingClasses update(InsSchedulingClasses insSchedulingClasses);

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
    public boolean saveInsSchedulingClassesBatch(List<InsSchedulingClasses> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSchedulingClassesBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSchedulingClasses> list);
 }
