package cn.pluss.platform.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class VitalSignsData {
    @JsonProperty("HeartRate")
    @JSONField(name = "HeartRate")
    private Integer heartRate;

    @JsonProperty("BreathRate")
    @JSONField(name = "BreathRate")
    private Integer breathRate;

    @JsonProperty("BodyShake")
    @JSONField(name = "BodyShake")
    private Integer bodyShake;

    @JsonProperty("Onbed")
    @JSONField(name = "Onbed")
    private Integer onbed;

    @JsonProperty("ReportTime")
    @JSONField(name = "ReportTime")
    private String reportTime;

    /**
     * 将时间戳字符串转为 Date
     */
    public Date getReportTimeAsDate() {
        if (reportTime == null || reportTime.isEmpty()) {
            return null;
        }
        try {
            return new Date(Long.parseLong(reportTime));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
