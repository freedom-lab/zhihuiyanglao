package cn.pluss.platform.service.insCanteenPlanSetting;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenPlanSetting;

public interface InsCanteenPlanSettingService extends IService<InsCanteenPlanSetting> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenPlanSetting> queryPage(Map map);

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
    public InsCanteenPlanSetting queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenPlanSetting 实例对象
    * @return 实例对象
    */
    public InsCanteenPlanSetting queryOne(InsCanteenPlanSetting insCanteenPlanSetting);

    /**
    * 根据条件获取集合
    * @param insCanteenPlanSetting
    * @return
    */
    public List<InsCanteenPlanSetting> queryList(InsCanteenPlanSetting insCanteenPlanSetting);

    /**
    * 新增数据
    *
    * @param insCanteenPlanSetting 实例对象
    * @return 实例对象
    */
    public InsCanteenPlanSetting insert(InsCanteenPlanSetting insCanteenPlanSetting);

    /**
    * 更新数据
    *
    * @param insCanteenPlanSetting 实例对象
    * @return 实例对象
    */
    public InsCanteenPlanSetting update(InsCanteenPlanSetting insCanteenPlanSetting);

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
    public boolean saveInsCanteenPlanSettingBatch(List<InsCanteenPlanSetting> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenPlanSettingBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenPlanSetting> list);
 }
