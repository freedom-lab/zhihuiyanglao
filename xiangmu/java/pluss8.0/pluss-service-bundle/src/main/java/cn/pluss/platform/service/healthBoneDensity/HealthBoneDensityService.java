package cn.pluss.platform.service.healthBoneDensity;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthBoneDensity;

public interface HealthBoneDensityService extends IService<HealthBoneDensity> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthBoneDensity> queryPage(Map map);

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
    public HealthBoneDensity queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthBoneDensity 实例对象
    * @return 实例对象
    */
    public HealthBoneDensity queryOne(HealthBoneDensity healthBoneDensity);

    /**
    * 根据条件获取集合
    * @param healthBoneDensity
    * @return
    */
    public List<HealthBoneDensity> queryList(HealthBoneDensity healthBoneDensity);

    /**
    * 新增数据
    *
    * @param healthBoneDensity 实例对象
    * @return 实例对象
    */
    public HealthBoneDensity insert(HealthBoneDensity healthBoneDensity);

    /**
    * 更新数据
    *
    * @param healthBoneDensity 实例对象
    * @return 实例对象
    */
    public HealthBoneDensity update(HealthBoneDensity healthBoneDensity);

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
    public boolean saveHealthBoneDensityBatch(List<HealthBoneDensity> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthBoneDensityBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthBoneDensity> list);
 }
