package cn.pluss.platform.service.healthLungBreathing;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthLungBreathing;

public interface HealthLungBreathingService extends IService<HealthLungBreathing> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthLungBreathing> queryPage(Map map);

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
    public HealthLungBreathing queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthLungBreathing 实例对象
    * @return 实例对象
    */
    public HealthLungBreathing queryOne(HealthLungBreathing healthLungBreathing);

    /**
    * 根据条件获取集合
    * @param healthLungBreathing
    * @return
    */
    public List<HealthLungBreathing> queryList(HealthLungBreathing healthLungBreathing);

    /**
    * 新增数据
    *
    * @param healthLungBreathing 实例对象
    * @return 实例对象
    */
    public HealthLungBreathing insert(HealthLungBreathing healthLungBreathing);

    /**
    * 更新数据
    *
    * @param healthLungBreathing 实例对象
    * @return 实例对象
    */
    public HealthLungBreathing update(HealthLungBreathing healthLungBreathing);

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
    public boolean saveHealthLungBreathingBatch(List<HealthLungBreathing> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthLungBreathingBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthLungBreathing> list);
 }
