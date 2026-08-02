package cn.pluss.platform.service.assessmentStandard;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.AssessmentStandard;

public interface AssessmentStandardService extends IService<AssessmentStandard> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentStandard> queryPage(Map map);

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
    public AssessmentStandard queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentStandard 实例对象
    * @return 实例对象
    */
    public AssessmentStandard queryOne(AssessmentStandard assessmentStandard);

    /**
    * 根据条件获取集合
    * @param assessmentStandard
    * @return
    */
    public List<AssessmentStandard> queryList(AssessmentStandard assessmentStandard);

    /**
    * 新增数据
    *
    * @param assessmentStandard 实例对象
    * @return 实例对象
    */
    public AssessmentStandard insert(AssessmentStandard assessmentStandard);

    /**
    * 更新数据
    *
    * @param assessmentStandard 实例对象
    * @return 实例对象
    */
    public AssessmentStandard update(AssessmentStandard assessmentStandard);

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
    public boolean saveAssessmentStandardBatch(List<AssessmentStandard> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteAssessmentStandardBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<AssessmentStandard> list);

    List<AssessmentStandard> queryAssessmentStandardsByTemplateId(Long id);

    List<AssessmentStandard> queryAssessmentStandardsByTemplateIds(List<Long> templateIds);
}
