package cn.pluss.platform.service.insHealthPhysicalReport;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsHealthPhysicalReport;

public interface InsHealthPhysicalReportService extends IService<InsHealthPhysicalReport> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsHealthPhysicalReport> queryPage(Map map);

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
    public InsHealthPhysicalReport queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insHealthPhysicalReport 实例对象
    * @return 实例对象
    */
    public InsHealthPhysicalReport queryOne(InsHealthPhysicalReport insHealthPhysicalReport);

    /**
    * 根据条件获取集合
    * @param insHealthPhysicalReport
    * @return
    */
    public List<InsHealthPhysicalReport> queryList(InsHealthPhysicalReport insHealthPhysicalReport);

    /**
    * 新增数据
    *
    * @param insHealthPhysicalReport 实例对象
    * @return 实例对象
    */
    public InsHealthPhysicalReport insert(InsHealthPhysicalReport insHealthPhysicalReport);

    /**
    * 更新数据
    *
    * @param insHealthPhysicalReport 实例对象
    * @return 实例对象
    */
    public InsHealthPhysicalReport update(InsHealthPhysicalReport insHealthPhysicalReport);

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
    public boolean saveInsHealthPhysicalReportBatch(List<InsHealthPhysicalReport> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsHealthPhysicalReportBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsHealthPhysicalReport> list);
 }
