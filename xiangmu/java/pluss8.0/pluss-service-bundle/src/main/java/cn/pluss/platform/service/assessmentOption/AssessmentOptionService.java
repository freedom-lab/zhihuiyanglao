package cn.pluss.platform.service.assessmentOption;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.AssessmentOption;

public interface AssessmentOptionService extends IService<AssessmentOption> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentOption> queryPage(Map map);

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
    public AssessmentOption queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentOption 实例对象
    * @return 实例对象
    */
    public AssessmentOption queryOne(AssessmentOption assessmentOption);

    /**
    * 根据条件获取集合
    * @param assessmentOption
    * @return
    */
    public List<AssessmentOption> queryList(AssessmentOption assessmentOption);

    /**
    * 新增数据
    *
    * @param assessmentOption 实例对象
    * @return 实例对象
    */
    public AssessmentOption insert(AssessmentOption assessmentOption);

    /**
    * 更新数据
    *
    * @param assessmentOption 实例对象
    * @return 实例对象
    */
    public AssessmentOption update(AssessmentOption assessmentOption);

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
    public boolean saveAssessmentOptionBatch(List<AssessmentOption> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteAssessmentOptionBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<AssessmentOption> list);

    /**
    * 根据问题ID列表批量查询选项
    * @param questionIds
    * @return
    */
    List<AssessmentOption> selectByQuestionIds(List<Long> questionIds);
 }
