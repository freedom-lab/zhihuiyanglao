package cn.pluss.platform.service.assessmentElderBase;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.AssessmentElderBase;

public interface AssessmentElderBaseService extends IService<AssessmentElderBase> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentElderBase> queryPage(Map map);

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
    public AssessmentElderBase queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param assessmentElderBase 实例对象
    * @return 实例对象
    */
    public AssessmentElderBase queryOne(AssessmentElderBase assessmentElderBase);

    /**
    * 根据条件获取集合
    * @param assessmentElderBase
    * @return
    */
    public List<AssessmentElderBase> queryList(AssessmentElderBase assessmentElderBase);

    /**
    * 新增数据
    *
    * @param assessmentElderBase 实例对象
    * @return 实例对象
    */
    public AssessmentElderBase insert(AssessmentElderBase assessmentElderBase);

    /**
    * 更新数据
    *
    * @param assessmentElderBase 实例对象
    * @return 实例对象
    */
    public AssessmentElderBase update(AssessmentElderBase assessmentElderBase);

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
    public boolean saveAssessmentElderBaseBatch(List<AssessmentElderBase> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteAssessmentElderBaseBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<AssessmentElderBase> list);
 }
