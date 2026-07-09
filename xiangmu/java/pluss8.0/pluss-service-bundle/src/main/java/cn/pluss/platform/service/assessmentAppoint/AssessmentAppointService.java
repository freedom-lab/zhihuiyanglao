package cn.pluss.platform.service.assessmentAppoint;

import cn.pluss.platform.model.entity.AssessmentAppoint;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface AssessmentAppointService extends IService<AssessmentAppoint> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentAppoint> queryPage(Map map);

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
    public AssessmentAppoint queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentAppoint 实例对象
    * @return 实例对象
    */
    public AssessmentAppoint queryOne(AssessmentAppoint assessmentAppoint);

    /**
    * 根据条件获取集合
    * @param assessmentAppoint
    * @return
    */
    public List<AssessmentAppoint> queryList(AssessmentAppoint assessmentAppoint);

    /**
    * 新增数据
    *
    * @param assessmentAppoint 实例对象
    * @return 实例对象
    */
    public AssessmentAppoint insert(AssessmentAppoint assessmentAppoint);

    /**
    * 更新数据
    *
    * @param assessmentAppoint 实例对象
    * @return 实例对象
    */
    public AssessmentAppoint update(AssessmentAppoint assessmentAppoint);

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
    public boolean saveAssessmentAppointBatch(List<AssessmentAppoint> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteAssessmentAppointBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<AssessmentAppoint> list);

    List<AssessmentAppoint> queryTaskPage(Map<String, Object> map);

    Integer queryTaskPageCount(Map<String, Object> map);

    List<AssessmentAppoint> queryResultPage(Map<String, Object> map);

    Integer queryResultPageCount(Map<String, Object> map);
}
