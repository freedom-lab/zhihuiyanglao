package cn.pluss.platform.mapper;

import cn.pluss.platform.model.vo.BloodDetectionVo;
import cn.pluss.platform.model.vo.BloodWeeklyStatVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthBloodPressure;

@Mapper
public interface HealthBloodPressureMapper extends BaseMapper<HealthBloodPressure>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<HealthBloodPressure> list);

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

    BloodDetectionVo queryBloodPressureDetectionStatistics(HealthBloodPressure healthBloodPressure);

    /**
     * 近七天血压正常/异常统计（按天分组）
     * @return
     */
    List<BloodWeeklyStatVo> queryWeeklyBloodPressureStats();
}


