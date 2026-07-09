package cn.pluss.platform.service.insStaffEvaluationTemplate;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsStaffEvaluationTemplate;

public interface InsStaffEvaluationTemplateService extends IService<InsStaffEvaluationTemplate> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsStaffEvaluationTemplate> queryPage(Map map);

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
    public InsStaffEvaluationTemplate queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffEvaluationTemplate 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationTemplate queryOne(InsStaffEvaluationTemplate insStaffEvaluationTemplate);

    /**
    * 根据条件获取集合
    * @param insStaffEvaluationTemplate
    * @return
    */
    public List<InsStaffEvaluationTemplate> queryList(InsStaffEvaluationTemplate insStaffEvaluationTemplate);

    /**
    * 新增数据
    *
    * @param insStaffEvaluationTemplate 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationTemplate insert(InsStaffEvaluationTemplate insStaffEvaluationTemplate);

    /**
    * 更新数据
    *
    * @param insStaffEvaluationTemplate 实例对象
    * @return 实例对象
    */
    public InsStaffEvaluationTemplate update(InsStaffEvaluationTemplate insStaffEvaluationTemplate);

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
    public boolean saveInsStaffEvaluationTemplateBatch(List<InsStaffEvaluationTemplate> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsStaffEvaluationTemplateBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsStaffEvaluationTemplate> list);
 }
