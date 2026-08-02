package cn.pluss.platform.service.insExpensesElderCostStandard;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsExpensesElderCostStandard;

public interface InsExpensesElderCostStandardService extends IService<InsExpensesElderCostStandard> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsExpensesElderCostStandard> queryPage(Map map);

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
    public InsExpensesElderCostStandard queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesElderCostStandard 实例对象
    * @return 实例对象
    */
    public InsExpensesElderCostStandard queryOne(InsExpensesElderCostStandard insExpensesElderCostStandard);

    /**
    * 根据条件获取集合
    * @param insExpensesElderCostStandard
    * @return
    */
    public List<InsExpensesElderCostStandard> queryList(InsExpensesElderCostStandard insExpensesElderCostStandard);

    /**
    * 新增数据
    *
    * @param insExpensesElderCostStandard 实例对象
    * @return 实例对象
    */
    public InsExpensesElderCostStandard insert(InsExpensesElderCostStandard insExpensesElderCostStandard);

    /**
    * 更新数据
    *
    * @param insExpensesElderCostStandard 实例对象
    * @return 实例对象
    */
    public InsExpensesElderCostStandard update(InsExpensesElderCostStandard insExpensesElderCostStandard);

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
    public boolean saveInsExpensesElderCostStandardBatch(List<InsExpensesElderCostStandard> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsExpensesElderCostStandardBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsExpensesElderCostStandard> list);
 }
