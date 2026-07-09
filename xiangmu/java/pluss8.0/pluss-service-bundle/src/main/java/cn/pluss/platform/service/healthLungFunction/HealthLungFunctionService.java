package cn.pluss.platform.service.healthLungFunction;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthLungFunction;

public interface HealthLungFunctionService extends IService<HealthLungFunction> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthLungFunction> queryPage(Map map);

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
    public HealthLungFunction queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthLungFunction 实例对象
    * @return 实例对象
    */
    public HealthLungFunction queryOne(HealthLungFunction healthLungFunction);

    /**
    * 根据条件获取集合
    * @param healthLungFunction
    * @return
    */
    public List<HealthLungFunction> queryList(HealthLungFunction healthLungFunction);

    /**
    * 新增数据
    *
    * @param healthLungFunction 实例对象
    * @return 实例对象
    */
    public HealthLungFunction insert(HealthLungFunction healthLungFunction);

    /**
    * 更新数据
    *
    * @param healthLungFunction 实例对象
    * @return 实例对象
    */
    public HealthLungFunction update(HealthLungFunction healthLungFunction);

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
    public boolean saveHealthLungFunctionBatch(List<HealthLungFunction> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthLungFunctionBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthLungFunction> list);
 }
