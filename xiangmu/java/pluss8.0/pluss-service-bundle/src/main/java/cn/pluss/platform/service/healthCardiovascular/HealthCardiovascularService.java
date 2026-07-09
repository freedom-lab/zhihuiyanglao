package cn.pluss.platform.service.healthCardiovascular;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthCardiovascular;

public interface HealthCardiovascularService extends IService<HealthCardiovascular> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthCardiovascular> queryPage(Map map);

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
    public HealthCardiovascular queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthCardiovascular 实例对象
    * @return 实例对象
    */
    public HealthCardiovascular queryOne(HealthCardiovascular healthCardiovascular);

    /**
    * 根据条件获取集合
    * @param healthCardiovascular
    * @return
    */
    public List<HealthCardiovascular> queryList(HealthCardiovascular healthCardiovascular);

    /**
    * 新增数据
    *
    * @param healthCardiovascular 实例对象
    * @return 实例对象
    */
    public HealthCardiovascular insert(HealthCardiovascular healthCardiovascular);

    /**
    * 更新数据
    *
    * @param healthCardiovascular 实例对象
    * @return 实例对象
    */
    public HealthCardiovascular update(HealthCardiovascular healthCardiovascular);

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
    public boolean saveHealthCardiovascularBatch(List<HealthCardiovascular> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthCardiovascularBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthCardiovascular> list);
 }
