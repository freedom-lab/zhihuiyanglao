package cn.pluss.platform.service.healthInterventions;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthInterventions;

public interface HealthInterventionsService extends IService<HealthInterventions> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthInterventions> queryPage(Map map);

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
    public HealthInterventions queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthInterventions 实例对象
    * @return 实例对象
    */
    public HealthInterventions queryOne(HealthInterventions healthInterventions);

    /**
    * 根据条件获取集合
    * @param healthInterventions
    * @return
    */
    public List<HealthInterventions> queryList(HealthInterventions healthInterventions);

    /**
    * 新增数据
    *
    * @param healthInterventions 实例对象
    * @return 实例对象
    */
    public HealthInterventions insert(HealthInterventions healthInterventions);

    /**
    * 更新数据
    *
    * @param healthInterventions 实例对象
    * @return 实例对象
    */
    public HealthInterventions update(HealthInterventions healthInterventions);

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
    public boolean saveHealthInterventionsBatch(List<HealthInterventions> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthInterventionsBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthInterventions> list);
 }
