package cn.pluss.platform.service.insStaffEvaluationQuestion;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsStaffEvaluationQuestion;

public interface InsStaffEvaluationQuestionService extends IService<InsStaffEvaluationQuestion> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsStaffEvaluationQuestion> queryPage(Map map);

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
    public InsStaffEvaluationQuestion queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationQuestion 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationQuestion queryOne(InsStaffEvaluationQuestion insStaffEvaluationQuestion);

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationQuestion
    * @return
    */
    public List<InsStaffEvaluationQuestion> queryList(InsStaffEvaluationQuestion insStaffEvaluationQuestion);

    /**
    * 新增数据
    *
    * @param insStaffEvaluationQuestion 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationQuestion insert(InsStaffEvaluationQuestion insStaffEvaluationQuestion);

    /**
    * 更新数据
    *
    * @param insStaffEvaluationQuestion 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationQuestion update(InsStaffEvaluationQuestion insStaffEvaluationQuestion);

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
    public boolean saveInsStaffEvaluationQuestionBatch(List<InsStaffEvaluationQuestion> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsStaffEvaluationQuestionBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsStaffEvaluationQuestion> list);
 }
