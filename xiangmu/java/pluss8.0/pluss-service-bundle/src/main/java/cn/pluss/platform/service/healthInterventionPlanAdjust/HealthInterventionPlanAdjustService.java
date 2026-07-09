package cn.pluss.platform.service.healthInterventionPlanAdjust;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthInterventionPlanAdjust;

public interface HealthInterventionPlanAdjustService extends IService<HealthInterventionPlanAdjust> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthInterventionPlanAdjust> queryPage(Map map);

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
    public HealthInterventionPlanAdjust queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthInterventionPlanAdjust 实例对象
    * @return 实例对象
    */
    public HealthInterventionPlanAdjust queryOne(HealthInterventionPlanAdjust healthInterventionPlanAdjust);

    /**
    * 根据条件获取集合
    * @param healthInterventionPlanAdjust
    * @return
    */
    public List<HealthInterventionPlanAdjust> queryList(HealthInterventionPlanAdjust healthInterventionPlanAdjust);

    /**
    * 新增数据
    *
    * @param healthInterventionPlanAdjust 实例对象
    * @return 实例对象
    */
    public HealthInterventionPlanAdjust insert(HealthInterventionPlanAdjust healthInterventionPlanAdjust);

    /**
    * 更新数据
    *
    * @param healthInterventionPlanAdjust 实例对象
    * @return 实例对象
    */
    public HealthInterventionPlanAdjust update(HealthInterventionPlanAdjust healthInterventionPlanAdjust);

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
    public boolean saveHealthInterventionPlanAdjustBatch(List<HealthInterventionPlanAdjust> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthInterventionPlanAdjustBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthInterventionPlanAdjust> list);
 }
