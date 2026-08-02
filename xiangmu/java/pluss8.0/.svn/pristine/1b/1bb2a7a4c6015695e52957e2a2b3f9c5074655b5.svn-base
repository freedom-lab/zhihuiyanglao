package cn.pluss.platform.service.insNursingPlanSetting;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingPlanSetting;

public interface InsNursingPlanSettingService extends IService<InsNursingPlanSetting> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingPlanSetting> queryPage(Map map);

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
    public InsNursingPlanSetting queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingPlanSetting 实例对象
    * @return 实例对象
    */
    public InsNursingPlanSetting queryOne(InsNursingPlanSetting insNursingPlanSetting);

    /**
    * 根据条件获取集合
    * @param insNursingPlanSetting
    * @return
    */
    public List<InsNursingPlanSetting> queryList(InsNursingPlanSetting insNursingPlanSetting);

    /**
    * 新增数据
    *
    * @param insNursingPlanSetting 实例对象
    * @return 实例对象
    */
    public InsNursingPlanSetting insert(InsNursingPlanSetting insNursingPlanSetting);

    /**
    * 更新数据
    *
    * @param insNursingPlanSetting 实例对象
    * @return 实例对象
    */
    public InsNursingPlanSetting update(InsNursingPlanSetting insNursingPlanSetting);

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
    public boolean saveInsNursingPlanSettingBatch(List<InsNursingPlanSetting> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingPlanSettingBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingPlanSetting> list);
 }
