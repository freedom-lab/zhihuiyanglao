package cn.pluss.platform.service.insExpensesExpenditureRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsExpensesExpenditureRecord;

public interface InsExpensesExpenditureRecordService extends IService<InsExpensesExpenditureRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsExpensesExpenditureRecord> queryPage(Map map);

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
    public InsExpensesExpenditureRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesExpenditureRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesExpenditureRecord queryOne(InsExpensesExpenditureRecord insExpensesExpenditureRecord);

    /**
    * 根据条件获取集合
    * @param insExpensesExpenditureRecord
    * @return
    */
    public List<InsExpensesExpenditureRecord> queryList(InsExpensesExpenditureRecord insExpensesExpenditureRecord);

    /**
    * 新增数据
    *
    * @param insExpensesExpenditureRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesExpenditureRecord insert(InsExpensesExpenditureRecord insExpensesExpenditureRecord);

    /**
    * 更新数据
    *
    * @param insExpensesExpenditureRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesExpenditureRecord update(InsExpensesExpenditureRecord insExpensesExpenditureRecord);

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
    public boolean saveInsExpensesExpenditureRecordBatch(List<InsExpensesExpenditureRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsExpensesExpenditureRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsExpensesExpenditureRecord> list);
 }
