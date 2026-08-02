package cn.pluss.platform.service.insStaffEvaluationStandard;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsStaffEvaluationStandard;

public interface InsStaffEvaluationStandardService extends IService<InsStaffEvaluationStandard> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsStaffEvaluationStandard> queryPage(Map map);

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
    public InsStaffEvaluationStandard queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationStandard 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationStandard queryOne(InsStaffEvaluationStandard insStaffEvaluationStandard);

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationStandard
    * @return
    */
    public List<InsStaffEvaluationStandard> queryList(InsStaffEvaluationStandard insStaffEvaluationStandard);

    /**
    * 新增数据
    *
    * @param insStaffEvaluationStandard 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationStandard insert(InsStaffEvaluationStandard insStaffEvaluationStandard);

    /**
    * 更新数据
    *
    * @param insStaffEvaluationStandard 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationStandard update(InsStaffEvaluationStandard insStaffEvaluationStandard);

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
    public boolean saveInsStaffEvaluationStandardBatch(List<InsStaffEvaluationStandard> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsStaffEvaluationStandardBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsStaffEvaluationStandard> list);
 }
