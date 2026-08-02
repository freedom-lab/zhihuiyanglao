package cn.pluss.platform.service.insSchedulingTableSettings;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSchedulingTableSettings;

public interface InsSchedulingTableSettingsService extends IService<InsSchedulingTableSettings> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSchedulingTableSettings> queryPage(Map map);

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
    public InsSchedulingTableSettings queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingTableSettings 实例对象
    * @return 实例对象
    */
    public InsSchedulingTableSettings queryOne(InsSchedulingTableSettings insSchedulingTableSettings);

    /**
    * 根据条件获取集合
    * @param insSchedulingTableSettings
    * @return
    */
    public List<InsSchedulingTableSettings> queryList(InsSchedulingTableSettings insSchedulingTableSettings);

    /**
    * 新增数据
    *
    * @param insSchedulingTableSettings 实例对象
    * @return 实例对象
    */
    public InsSchedulingTableSettings insert(InsSchedulingTableSettings insSchedulingTableSettings);

    /**
    * 更新数据
    *
    * @param insSchedulingTableSettings 实例对象
    * @return 实例对象
    */
    public InsSchedulingTableSettings update(InsSchedulingTableSettings insSchedulingTableSettings);

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
    public boolean saveInsSchedulingTableSettingsBatch(List<InsSchedulingTableSettings> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSchedulingTableSettingsBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSchedulingTableSettings> list);
 }
