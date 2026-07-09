package cn.pluss.platform.service.ocTrainCourse;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.OcTrainCourse;

public interface OcTrainCourseService extends IService<OcTrainCourse> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<OcTrainCourse> queryPage(Map map);

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
    public OcTrainCourse queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param ocTrainCourse 实例对象
    * @return 实例对象
    */
    public OcTrainCourse queryOne(OcTrainCourse ocTrainCourse);

    /**
    * 根据条件获取集合
    * @param ocTrainCourse
    * @return
    */
    public List<OcTrainCourse> queryList(OcTrainCourse ocTrainCourse);

    /**
    * 新增数据
    *
    * @param ocTrainCourse 实例对象
    * @return 实例对象
    */
    public OcTrainCourse insert(OcTrainCourse ocTrainCourse);

    /**
    * 更新数据
    *
    * @param ocTrainCourse 实例对象
    * @return 实例对象
    */
    public OcTrainCourse update(OcTrainCourse ocTrainCourse);

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
    public boolean saveOcTrainCourseBatch(List<OcTrainCourse> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteOcTrainCourseBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<OcTrainCourse> list);
 }
