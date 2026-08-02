package cn.pluss.platform.service.insExpensesPurchaseRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsExpensesPurchaseRecord;

public interface InsExpensesPurchaseRecordService extends IService<InsExpensesPurchaseRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsExpensesPurchaseRecord> queryPage(Map map);

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
    public InsExpensesPurchaseRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesPurchaseRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesPurchaseRecord queryOne(InsExpensesPurchaseRecord insExpensesPurchaseRecord);

    /**
    * 根据条件获取集合
    * @param insExpensesPurchaseRecord
    * @return
    */
    public List<InsExpensesPurchaseRecord> queryList(InsExpensesPurchaseRecord insExpensesPurchaseRecord);

    /**
    * 新增数据
    *
    * @param insExpensesPurchaseRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesPurchaseRecord insert(InsExpensesPurchaseRecord insExpensesPurchaseRecord);

    /**
    * 更新数据
    *
    * @param insExpensesPurchaseRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesPurchaseRecord update(InsExpensesPurchaseRecord insExpensesPurchaseRecord);

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
    public boolean saveInsExpensesPurchaseRecordBatch(List<InsExpensesPurchaseRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsExpensesPurchaseRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsExpensesPurchaseRecord> list);
 }
