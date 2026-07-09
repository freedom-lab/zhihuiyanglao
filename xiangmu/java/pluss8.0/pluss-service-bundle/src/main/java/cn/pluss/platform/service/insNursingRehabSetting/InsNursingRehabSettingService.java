package cn.pluss.platform.service.insNursingRehabSetting;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingRehabSetting;

public interface InsNursingRehabSettingService extends IService<InsNursingRehabSetting> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingRehabSetting> queryPage(Map map);

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
    public InsNursingRehabSetting queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRehabSetting 实例对象
    * @return 实例对象
    */
    public InsNursingRehabSetting queryOne(InsNursingRehabSetting insNursingRehabSetting);

    /**
    * 根据条件获取集合
    * @param insNursingRehabSetting
    * @return
    */
    public List<InsNursingRehabSetting> queryList(InsNursingRehabSetting insNursingRehabSetting);

    /**
    * 新增数据
    *
    * @param insNursingRehabSetting 实例对象
    * @return 实例对象
    */
    public InsNursingRehabSetting insert(InsNursingRehabSetting insNursingRehabSetting);

    /**
    * 更新数据
    *
    * @param insNursingRehabSetting 实例对象
    * @return 实例对象
    */
    public InsNursingRehabSetting update(InsNursingRehabSetting insNursingRehabSetting);

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
    public boolean saveInsNursingRehabSettingBatch(List<InsNursingRehabSetting> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingRehabSettingBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingRehabSetting> list);
 }
