package cn.pluss.platform.service.assessmentResult;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.AssessmentResult;

public interface AssessmentResultService extends IService<AssessmentResult> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentResult> queryPage(Map map);

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
    public AssessmentResult queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentResult 实例对象
    * @return 实例对象
    */
    public AssessmentResult queryOne(AssessmentResult assessmentResult);

    /**
    * 根据条件获取集合
    * @param assessmentResult
    * @return
    */
    public List<AssessmentResult> queryList(AssessmentResult assessmentResult);

    /**
    * 新增数据
    *
    * @param assessmentResult 实例对象
    * @return 实例对象
    */
    public AssessmentResult insert(AssessmentResult assessmentResult);

    /**
    * 更新数据
    *
    * @param assessmentResult 实例对象
    * @return 实例对象
    */
    public AssessmentResult update(AssessmentResult assessmentResult);

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
    public boolean saveAssessmentResultBatch(List<AssessmentResult> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteAssessmentResultBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<AssessmentResult> list);
 }
