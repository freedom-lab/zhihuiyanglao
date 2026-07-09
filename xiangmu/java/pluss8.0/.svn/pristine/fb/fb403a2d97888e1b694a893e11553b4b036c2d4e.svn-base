package cn.pluss.platform.service.assessmentDrugSituation;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.AssessmentDrugSituation;

public interface AssessmentDrugSituationService extends IService<AssessmentDrugSituation> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentDrugSituation> queryPage(Map map);

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
    public AssessmentDrugSituation queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentDrugSituation 实例对象
    * @return 实例对象
    */
    public AssessmentDrugSituation queryOne(AssessmentDrugSituation assessmentDrugSituation);

    /**
    * 根据条件获取集合
    * @param assessmentDrugSituation
    * @return
    */
    public List<AssessmentDrugSituation> queryList(AssessmentDrugSituation assessmentDrugSituation);

    /**
    * 新增数据
    *
    * @param assessmentDrugSituation 实例对象
    * @return 实例对象
    */
    public AssessmentDrugSituation insert(AssessmentDrugSituation assessmentDrugSituation);

    /**
    * 更新数据
    *
    * @param assessmentDrugSituation 实例对象
    * @return 实例对象
    */
    public AssessmentDrugSituation update(AssessmentDrugSituation assessmentDrugSituation);

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
    public boolean saveAssessmentDrugSituationBatch(List<AssessmentDrugSituation> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteAssessmentDrugSituationBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<AssessmentDrugSituation> list);
 }
