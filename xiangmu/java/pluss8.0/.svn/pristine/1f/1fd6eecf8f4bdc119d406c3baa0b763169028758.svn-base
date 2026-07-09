package cn.pluss.platform.service.smartAlarmRemindSet;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.SmartAlarmRemindSet;

public interface SmartAlarmRemindSetService extends IService<SmartAlarmRemindSet> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<SmartAlarmRemindSet> queryPage(Map map);

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
    public SmartAlarmRemindSet queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param smartAlarmRemindSet 实例对象
    * @return 实例对象
    */
    public SmartAlarmRemindSet queryOne(SmartAlarmRemindSet smartAlarmRemindSet);

    /**
    * 根据条件获取集合
    * @param smartAlarmRemindSet
    * @return
    */
    public List<SmartAlarmRemindSet> queryList(SmartAlarmRemindSet smartAlarmRemindSet);

    /**
    * 新增数据
    *
    * @param smartAlarmRemindSet 实例对象
    * @return 实例对象
    */
    public SmartAlarmRemindSet insert(SmartAlarmRemindSet smartAlarmRemindSet);

    /**
    * 更新数据
    *
    * @param smartAlarmRemindSet 实例对象
    * @return 实例对象
    */
    public SmartAlarmRemindSet update(SmartAlarmRemindSet smartAlarmRemindSet);

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
    public boolean saveSmartAlarmRemindSetBatch(List<SmartAlarmRemindSet> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteSmartAlarmRemindSetBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<SmartAlarmRemindSet> list);
 }
