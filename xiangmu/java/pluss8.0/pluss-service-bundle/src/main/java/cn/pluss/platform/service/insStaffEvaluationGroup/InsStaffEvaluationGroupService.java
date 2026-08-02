package cn.pluss.platform.service.insStaffEvaluationGroup;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsStaffEvaluationGroup;

public interface InsStaffEvaluationGroupService extends IService<InsStaffEvaluationGroup> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsStaffEvaluationGroup> queryPage(Map map);

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
    public InsStaffEvaluationGroup queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationGroup 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationGroup queryOne(InsStaffEvaluationGroup insStaffEvaluationGroup);

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationGroup
    * @return
    */
    public List<InsStaffEvaluationGroup> queryList(InsStaffEvaluationGroup insStaffEvaluationGroup);

    /**
    * 新增数据
    *
    * @param insStaffEvaluationGroup 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationGroup insert(InsStaffEvaluationGroup insStaffEvaluationGroup);

    /**
    * 更新数据
    *
    * @param insStaffEvaluationGroup 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationGroup update(InsStaffEvaluationGroup insStaffEvaluationGroup);

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
    public boolean saveInsStaffEvaluationGroupBatch(List<InsStaffEvaluationGroup> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsStaffEvaluationGroupBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsStaffEvaluationGroup> list);
 }
