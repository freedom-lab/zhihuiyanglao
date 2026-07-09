package cn.pluss.platform.service.smartAlarmRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.SmartAlarmRecord;

public interface SmartAlarmRecordService extends IService<SmartAlarmRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<SmartAlarmRecord> queryPage(Map map);

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
    public SmartAlarmRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param smartAlarmRecord 实例对象
    * @return 实例对象
    */
    public SmartAlarmRecord queryOne(SmartAlarmRecord smartAlarmRecord);

    /**
    * 根据条件获取集合
    * @param smartAlarmRecord
    * @return
    */
    public List<SmartAlarmRecord> queryList(SmartAlarmRecord smartAlarmRecord);

    /**
    * 新增数据
    *
    * @param smartAlarmRecord 实例对象
    * @return 实例对象
    */
    public SmartAlarmRecord insert(SmartAlarmRecord smartAlarmRecord);

    /**
    * 更新数据
    *
    * @param smartAlarmRecord 实例对象
    * @return 实例对象
    */
    public SmartAlarmRecord update(SmartAlarmRecord smartAlarmRecord);

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
    public boolean saveSmartAlarmRecordBatch(List<SmartAlarmRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteSmartAlarmRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<SmartAlarmRecord> list);
 }
