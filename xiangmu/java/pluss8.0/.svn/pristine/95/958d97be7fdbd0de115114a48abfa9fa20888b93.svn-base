package cn.pluss.platform.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Data
public class AlarmData {
    @JsonProperty("AlarmId")
    @JSONField(name = "AlarmId")
    private String alarmId;

    @JsonProperty("AlarmLevel")
    @JSONField(name = "AlarmLevel")
    private Integer alarmLevel;

    @JsonProperty("Value")
    @JSONField(name = "Value")
    private String value;

    @JsonProperty("AlarmReason")
    @JSONField(name = "AlarmReason")
    private String alarmReason;

    @JsonProperty("AlarmTStamp")
    @JSONField(name = "AlarmTStamp")
    private String alarmTStamp;

    @JsonProperty("AlarmParams")
    @JSONField(name = "AlarmParams")
    private String alarmParams;

    @JsonProperty("FwVer")
    @JSONField(name = "FwVer")
    private String fwVer;

    @JsonProperty("AlgoVer")
    @JSONField(name = "AlgoVer")
    private String algoVer;

    /**
     * 将 ISO 8601 格式的 AlarmTStamp 转为 Date
     * 格式示例：2024-08-09T16:54:00.002Z
     */
    public Date getAlarmTimeAsDate() {
        if (alarmTStamp == null || alarmTStamp.isEmpty()) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            return sdf.parse(alarmTStamp);
        } catch (Exception e) {
            // 兼容无毫秒格式：2024-08-09T16:54:00Z
            try {
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));
                return sdf2.parse(alarmTStamp);
            } catch (Exception e2) {
                return null;
            }
        }
    }
}
