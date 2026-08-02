package cn.pluss.platform.service.insOfficeOnlineClass;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsOfficeOnlineClass;

public interface InsOfficeOnlineClassService extends IService<InsOfficeOnlineClass> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsOfficeOnlineClass> queryPage(Map map);

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
    public InsOfficeOnlineClass queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficeOnlineClass 实例对象
    * @return 实例对象
    */
    public InsOfficeOnlineClass queryOne(InsOfficeOnlineClass insOfficeOnlineClass);

    /**
    * 根据条件获取集合
    * @param insOfficeOnlineClass
    * @return
    */
    public List<InsOfficeOnlineClass> queryList(InsOfficeOnlineClass insOfficeOnlineClass);

    /**
    * 新增数据
    *
    * @param insOfficeOnlineClass 实例对象
    * @return 实例对象
    */
    public InsOfficeOnlineClass insert(InsOfficeOnlineClass insOfficeOnlineClass);

    /**
    * 更新数据
    *
    * @param insOfficeOnlineClass 实例对象
    * @return 实例对象
    */
    public InsOfficeOnlineClass update(InsOfficeOnlineClass insOfficeOnlineClass);

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
    public boolean saveInsOfficeOnlineClassBatch(List<InsOfficeOnlineClass> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsOfficeOnlineClassBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsOfficeOnlineClass> list);
 }
