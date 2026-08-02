package cn.pluss.platform.mapper;

import cn.pluss.platform.model.vo.BloodWeeklyStatVo;
import cn.pluss.platform.model.vo.SugarDetectionVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthBloodSugar;

@Mapper
public interface HealthBloodSugarMapper extends BaseMapper<HealthBloodSugar>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<HealthBloodSugar> list);

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


