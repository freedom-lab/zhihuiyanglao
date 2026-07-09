package cn.pluss.platform.service.healthBloodSugar;

import cn.pluss.platform.model.entity.HealthBloodSugar;
import cn.pluss.platform.model.vo.BloodWeeklyStatVo;
import cn.pluss.platform.model.vo.SugarDetectionVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface HealthBloodSugarService extends IService<HealthBloodSugar> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthBloodSugar> queryPage(Map map);

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
    public HealthBloodSugar queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthBloodSugar 实例对象
    * @return 实例对象
    */
    public HealthBloodSugar queryOne(HealthBloodSugar healthBloodSugar);

    /**
    * 根据条件获取集合
    * @param healthBloodSugar
    * @return
    */
    public List<HealthBloodSugar> queryList(HealthBloodSugar healthBloodSugar);

    /**
    * 新增数据
    *
    * @param healthBloodSugar 实例对象
    * @return 实例对象
    */
    public HealthBloodSugar insert(HealthBloodSugar healthBloodSugar);

    /**
    * 更新数据
    *
    * @param healthBloodSugar 实例对象
    * @return 实例对象
    */
    public HealthBloodSugar update(HealthBloodSugar healthBloodSugar);

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
    public boolean saveHealthBloodSugarBatch(List<HealthBloodSugar> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthBloodSugarBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthBloodSugar> list);

    /**
     * 血糖监控
     * @param queryParam 查询条件
     * @return
     */
    Map<String, Object> monitorBloodSugar(HealthBloodSugar queryParam);

    /**
     * 血糖检测统计
     * @param healthBloodSugar
     * @return
     */
    SugarDetectionVo queryBloodSugarDetectionStatistics(HealthBloodSugar healthBloodSugar);

    /**
     * 近七天血糖正常/异常统计（按天分组）
     * @return
     */
    List<BloodWeeklyStatVo> queryWeeklyBloodSugarStats();
 }
