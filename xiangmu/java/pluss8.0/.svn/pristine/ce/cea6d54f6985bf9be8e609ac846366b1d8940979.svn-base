package cn.pluss.platform.service.elderBaseInfo;

import cn.pluss.platform.model.entity.ElderBaseInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface ElderBaseInfoService extends IService<ElderBaseInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<ElderBaseInfo> queryPage(Map map);

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
    public ElderBaseInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param elderBaseInfo 实例对象
    * @return 实例对象
    */
    public ElderBaseInfo queryOne(ElderBaseInfo elderBaseInfo);

    /**
    * 根据条件获取集合
    * @param elderBaseInfo
    * @return
    */
    public List<ElderBaseInfo> queryList(ElderBaseInfo elderBaseInfo);

    /**
    * 新增数据
    *
    * @param elderBaseInfo 实例对象
    * @return 实例对象
    */
    public ElderBaseInfo insert(ElderBaseInfo elderBaseInfo);

    /**
    * 更新数据
    *
    * @param elderBaseInfo 实例对象
    * @return 实例对象
    */
    public ElderBaseInfo update(ElderBaseInfo elderBaseInfo);

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
    public boolean saveElderBaseInfoBatch(List<ElderBaseInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteElderBaseInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<ElderBaseInfo> list);

    Map<String, Object> getElderlyAgeGenderStatistics();

    Map<String, Long> getCompetencyAssessmentStatistics();

    Map<String, Object> getElderlyCategoryStatistics();

    Object getElderlyCareLevelStatistics();
}
