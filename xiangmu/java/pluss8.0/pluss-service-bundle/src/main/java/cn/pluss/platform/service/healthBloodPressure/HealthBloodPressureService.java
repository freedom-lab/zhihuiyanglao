package cn.pluss.platform.service.healthBloodPressure;

import cn.pluss.platform.model.entity.HealthBloodPressure;
import cn.pluss.platform.model.vo.BloodDetectionVo;
import cn.pluss.platform.model.vo.BloodWeeklyStatVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface HealthBloodPressureService extends IService<HealthBloodPressure> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthBloodPressure> queryPage(Map map);

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
    public HealthBloodPressure queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthBloodPressure 实例对象
    * @return 实例对象
    */
    public HealthBloodPressure queryOne(HealthBloodPressure healthBloodPressure);

    /**
    * 根据条件获取集合
    * @param healthBloodPressure
    * @return
    */
    public List<HealthBloodPressure> queryList(HealthBloodPressure healthBloodPressure);

    /**
    * 新增数据
    *
    * @param healthBloodPressure 实例对象
    * @return 实例对象
    */
    public HealthBloodPressure insert(HealthBloodPressure healthBloodPressure);

    /**
    * 更新数据
    *
    * @param healthBloodPressure 实例对象
    * @return 实例对象
    */
    public HealthBloodPressure update(HealthBloodPressure healthBloodPressure);

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
    public boolean saveHealthBloodPressureBatch(List<HealthBloodPressure> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthBloodPressureBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthBloodPressure> list);

    BloodDetectionVo queryBloodPressureDetectionStatistics(HealthBloodPressure healthBloodPressure);

    /**
     * 近七天血压正常/异常统计（按天分组）
     * @return
     */
    List<BloodWeeklyStatVo> queryWeeklyBloodPressureStats();

    Map<String, Object> monitorBloodPressure(HealthBloodPressure healthBloodPressure);
}
