package cn.pluss.platform.service.healthAiAnalysis;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthAiAnalysis;

public interface HealthAiAnalysisService extends IService<HealthAiAnalysis> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthAiAnalysis> queryPage(Map map);

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
    public HealthAiAnalysis queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthAiAnalysis 实例对象
    * @return 实例对象
    */
    public HealthAiAnalysis queryOne(HealthAiAnalysis healthAiAnalysis);

    /**
    * 根据条件获取集合
    * @param healthAiAnalysis
    * @return
    */
    public List<HealthAiAnalysis> queryList(HealthAiAnalysis healthAiAnalysis);

    /**
    * 新增数据
    *
    * @param healthAiAnalysis 实例对象
    * @return 实例对象
    */
    public HealthAiAnalysis insert(HealthAiAnalysis healthAiAnalysis);

    /**
    * 更新数据
    *
    * @param healthAiAnalysis 实例对象
    * @return 实例对象
    */
    public HealthAiAnalysis update(HealthAiAnalysis healthAiAnalysis);

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
    public boolean saveHealthAiAnalysisBatch(List<HealthAiAnalysis> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthAiAnalysisBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthAiAnalysis> list);
 }
