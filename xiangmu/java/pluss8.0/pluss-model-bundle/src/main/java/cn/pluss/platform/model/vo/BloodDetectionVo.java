package cn.pluss.platform.model.vo;

import lombok.Data;

@Data
public class BloodDetectionVo {
    //血压测量总数
    private Integer bloodPressureCount;
    //正常血压统计
    private Integer normalBloodPressure;
    //正常血压统计比例
    private String normalBloodPressureProportion;
    //低压异常
    private Integer lowPressureAnomaly;
    //低压异常比例
    private String lowPressureAnomalyProportion;
    //高压异常
    private Integer highPressureAnomaly;
    //高压异常比例
    private String highPressureAnomalyProportion;
    //高低压异常
    private Integer bothPressureAnomaly;


}
