package cn.pluss.platform.service.insExpensesBillRecord;

import cn.pluss.platform.model.dto.HealthDto;
import cn.pluss.platform.model.entity.InsExpensesBillRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface InsExpensesBillRecordService extends IService<InsExpensesBillRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsExpensesBillRecord> queryPage(Map map);

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
    public InsExpensesBillRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesBillRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesBillRecord queryOne(InsExpensesBillRecord insExpensesBillRecord);

    /**
    * 根据条件获取集合
    * @param insExpensesBillRecord
    * @return
    */
    public List<InsExpensesBillRecord> queryList(InsExpensesBillRecord insExpensesBillRecord);

    /**
    * 新增数据
    *
    * @param insExpensesBillRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesBillRecord insert(InsExpensesBillRecord insExpensesBillRecord);

    /**
    * 更新数据
    *
    * @param insExpensesBillRecord 实例对象
    * @return 实例对象
    */
    public InsExpensesBillRecord update(InsExpensesBillRecord insExpensesBillRecord);

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
    public boolean saveInsExpensesBillRecordBatch(List<InsExpensesBillRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsExpensesBillRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsExpensesBillRecord> list);

    Object getThisMonthRevenue(HealthDto healthDto);

    Object getThisMonthClassRevenue(HealthDto healthDto);

}
