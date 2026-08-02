package cn.pluss.platform.service.insStaffSalaryRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsStaffSalaryRecord;

public interface InsStaffSalaryRecordService extends IService<InsStaffSalaryRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsStaffSalaryRecord> queryPage(Map map);

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
    public InsStaffSalaryRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffSalaryRecord 实例对象
    * @return 实例对象
    */
    public InsStaffSalaryRecord queryOne(InsStaffSalaryRecord insStaffSalaryRecord);

    /**
    * 根据条件获取集合
    * @param insStaffSalaryRecord
    * @return
    */
    public List<InsStaffSalaryRecord> queryList(InsStaffSalaryRecord insStaffSalaryRecord);

    /**
    * 新增数据
    *
    * @param insStaffSalaryRecord 实例对象
    * @return 实例对象
    */
    public InsStaffSalaryRecord insert(InsStaffSalaryRecord insStaffSalaryRecord);

    /**
    * 更新数据
    *
    * @param insStaffSalaryRecord 实例对象
    * @return 实例对象
    */
    public InsStaffSalaryRecord update(InsStaffSalaryRecord insStaffSalaryRecord);

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
    public boolean saveInsStaffSalaryRecordBatch(List<InsStaffSalaryRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsStaffSalaryRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsStaffSalaryRecord> list);
 }
