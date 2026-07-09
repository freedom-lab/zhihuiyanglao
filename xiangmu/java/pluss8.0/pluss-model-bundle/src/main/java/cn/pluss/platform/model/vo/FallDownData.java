package cn.pluss.platform.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class FallDownData {
    @JsonProperty("SmbdFlag")
    @JSONField(name = "SmbdFlag")
    private String smbdFlag;

    @JsonProperty("ReportTime")
    @JSONField(name = "ReportTime")
    private Date reportTime;
}
