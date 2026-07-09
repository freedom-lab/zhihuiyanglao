package cn.pluss.platform.service.healthInterventionPlanDrug;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthInterventionPlanDrug;

public interface HealthInterventionPlanDrugService extends IService<HealthInterventionPlanDrug> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthInterventionPlanDrug> queryPage(Map map);

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
    public HealthInterventionPlanDrug queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthInterventionPlanDrug 实例对象
    * @return 实例对象
    */
    public HealthInterventionPlanDrug queryOne(HealthInterventionPlanDrug healthInterventionPlanDrug);

    /**
    * 根据条件获取集合
    * @param healthInterventionPlanDrug
    * @return
    */
    public List<HealthInterventionPlanDrug> queryList(HealthInterventionPlanDrug healthInterventionPlanDrug);

    /**
    * 新增数据
    *
    * @param healthInterventionPlanDrug 实例对象
    * @return 实例对象
    */
    public HealthInterventionPlanDrug insert(HealthInterventionPlanDrug healthInterventionPlanDrug);

    /**
    * 更新数据
    *
    * @param healthInterventionPlanDrug 实例对象
    * @return 实例对象
    */
    public HealthInterventionPlanDrug update(HealthInterventionPlanDrug healthInterventionPlanDrug);

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
    public boolean saveHealthInterventionPlanDrugBatch(List<HealthInterventionPlanDrug> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthInterventionPlanDrugBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthInterventionPlanDrug> list);
 }
