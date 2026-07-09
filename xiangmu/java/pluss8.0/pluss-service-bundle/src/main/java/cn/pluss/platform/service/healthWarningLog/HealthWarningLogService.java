package cn.pluss.platform.service.healthWarningLog;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthWarningLog;

public interface HealthWarningLogService extends IService<HealthWarningLog> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthWarningLog> queryPage(Map map);

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
    public HealthWarningLog queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthWarningLog 实例对象
    * @return 实例对象
    */
    public HealthWarningLog queryOne(HealthWarningLog healthWarningLog);

    /**
    * 根据条件获取集合
    * @param healthWarningLog
    * @return
    */
    public List<HealthWarningLog> queryList(HealthWarningLog healthWarningLog);

    /**
    * 新增数据
    *
    * @param healthWarningLog 实例对象
    * @return 实例对象
    */
    public HealthWarningLog insert(HealthWarningLog healthWarningLog);

    /**
    * 更新数据
    *
    * @param healthWarningLog 实例对象
    * @return 实例对象
    */
    public HealthWarningLog update(HealthWarningLog healthWarningLog);

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
    public boolean saveHealthWarningLogBatch(List<HealthWarningLog> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthWarningLogBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthWarningLog> list);
 }
