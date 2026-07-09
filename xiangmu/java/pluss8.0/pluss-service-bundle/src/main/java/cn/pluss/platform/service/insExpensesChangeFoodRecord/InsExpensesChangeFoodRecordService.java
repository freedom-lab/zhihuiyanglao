package cn.pluss.platform.service.insExpensesChangeFoodRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsExpensesChangeFoodRecord;

public interface InsExpensesChangeFoodRecordService extends IService<InsExpensesChangeFoodRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsExpensesChangeFoodRecord> queryPage(Map map);

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
    public InsExpensesChangeFoodRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesChangeFoodRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesChangeFoodRecord queryOne(InsExpensesChangeFoodRecord insExpensesChangeFoodRecord);

    /**
    * 根据条件获取集合
    * @param insExpensesChangeFoodRecord
    * @return
    */
    public List<InsExpensesChangeFoodRecord> queryList(InsExpensesChangeFoodRecord insExpensesChangeFoodRecord);

    /**
    * 新增数据
    *
    * @param insExpensesChangeFoodRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesChangeFoodRecord insert(InsExpensesChangeFoodRecord insExpensesChangeFoodRecord);

    /**
    * 更新数据
    *
    * @param insExpensesChangeFoodRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesChangeFoodRecord update(InsExpensesChangeFoodRecord insExpensesChangeFoodRecord);

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
    public boolean saveInsExpensesChangeFoodRecordBatch(List<InsExpensesChangeFoodRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsExpensesChangeFoodRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsExpensesChangeFoodRecord> list);
 }
