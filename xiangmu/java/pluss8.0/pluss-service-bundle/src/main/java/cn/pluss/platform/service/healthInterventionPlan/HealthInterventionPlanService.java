package cn.pluss.platform.service.healthInterventionPlan;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthInterventionPlan;

public interface HealthInterventionPlanService extends IService<HealthInterventionPlan> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthInterventionPlan> queryPage(Map map);

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
    public HealthInterventionPlan queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthInterventionPlan 实例对象
    * @return 实例对象
    */
    public HealthInterventionPlan queryOne(HealthInterventionPlan healthInterventionPlan);

    /**
    * 根据条件获取集合
    * @param healthInterventionPlan
    * @return
    */
    public List<HealthInterventionPlan> queryList(HealthInterventionPlan healthInterventionPlan);

    /**
    * 新增数据
    *
    * @param healthInterventionPlan 实例对象
    * @return 实例对象
    */
    public HealthInterventionPlan insert(HealthInterventionPlan healthInterventionPlan);

    /**
    * 更新数据
    *
    * @param healthInterventionPlan 实例对象
    * @return 实例对象
    */
    public HealthInterventionPlan update(HealthInterventionPlan healthInterventionPlan);

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
    public boolean saveHealthInterventionPlanBatch(List<HealthInterventionPlan> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthInterventionPlanBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthInterventionPlan> list);
 }
