package cn.pluss.platform.service.healthFollowUp;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthFollowUp;

public interface HealthFollowUpService extends IService<HealthFollowUp> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthFollowUp> queryPage(Map map);

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
    public HealthFollowUp queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthFollowUp 实例对象
    * @return 实例对象
    */
    public HealthFollowUp queryOne(HealthFollowUp healthFollowUp);

    /**
    * 根据条件获取集合
    * @param healthFollowUp
    * @return
    */
    public List<HealthFollowUp> queryList(HealthFollowUp healthFollowUp);

    /**
    * 新增数据
    *
    * @param healthFollowUp 实例对象
    * @return 实例对象
    */
    public HealthFollowUp insert(HealthFollowUp healthFollowUp);

    /**
    * 更新数据
    *
    * @param healthFollowUp 实例对象
    * @return 实例对象
    */
    public HealthFollowUp update(HealthFollowUp healthFollowUp);

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
    public boolean saveHealthFollowUpBatch(List<HealthFollowUp> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthFollowUpBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthFollowUp> list);
 }
