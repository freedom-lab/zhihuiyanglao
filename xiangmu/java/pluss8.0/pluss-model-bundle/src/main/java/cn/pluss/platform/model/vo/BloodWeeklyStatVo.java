package cn.pluss.platform.model.vo;

import lombok.Data;

/**
 * 近七天血压/血糖正常/异常统计VO（按天分组）
 */
@Data
public class BloodWeeklyStatVo {
    // 日期（yyyy-MM-dd）
    private String gaugeDate;
    // 正常血压数量
    private Integer normalCount;
    // 异常血压数量
    private Integer abnormalCount;
}
