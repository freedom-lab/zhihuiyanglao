package cn.pluss.platform.service.careNursingPlanSetting;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CareNursingPlanSetting;

public interface CareNursingPlanSettingService extends IService<CareNursingPlanSetting> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CareNursingPlanSetting> queryPage(Map map);

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
    public CareNursingPlanSetting queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param careNursingPlanSetting 实例对象
    * @return 实例对象
    */
    public CareNursingPlanSetting queryOne(CareNursingPlanSetting careNursingPlanSetting);

    /**
    * 根据条件获取集合
    * @param careNursingPlanSetting
    * @return
    */
    public List<CareNursingPlanSetting> queryList(CareNursingPlanSetting careNursingPlanSetting);

    /**
    * 新增数据
    *
    * @param careNursingPlanSetting 实例对象
    * @return 实例对象
    */
    public CareNursingPlanSetting insert(CareNursingPlanSetting careNursingPlanSetting);

    /**
    * 更新数据
    *
    * @param careNursingPlanSetting 实例对象
    * @return 实例对象
    */
    public CareNursingPlanSetting update(CareNursingPlanSetting careNursingPlanSetting);

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
    public boolean saveCareNursingPlanSettingBatch(List<CareNursingPlanSetting> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCareNursingPlanSettingBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CareNursingPlanSetting> list);
 }
