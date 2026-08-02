package cn.pluss.platform.service.assessmentTemplate;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.AssessmentTemplate;

public interface AssessmentTemplateService extends IService<AssessmentTemplate> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentTemplate> queryPage(Map map);

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
    public AssessmentTemplate queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentTemplate 实例对象
    * @return 实例对象
    */
    public AssessmentTemplate queryOne(AssessmentTemplate assessmentTemplate);

    /**
    * 根据条件获取集合
    * @param assessmentTemplate
    * @return
    */
    public List<AssessmentTemplate> queryList(AssessmentTemplate assessmentTemplate);

    /**
    * 新增数据
    *
    * @param assessmentTemplate 实例对象
    * @return 实例对象
    */
    public AssessmentTemplate insert(AssessmentTemplate assessmentTemplate);

    /**
    * 更新数据
    *
    * @param assessmentTemplate 实例对象
    * @return 实例对象
    */
    public AssessmentTemplate update(AssessmentTemplate assessmentTemplate);

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
    public boolean saveAssessmentTemplateBatch(List<AssessmentTemplate> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteAssessmentTemplateBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<AssessmentTemplate> list);
 }
