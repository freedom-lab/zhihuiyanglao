package cn.pluss.platform.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

/**
 * 设备对接平台统一响应格式
 */
@Data
public class PerceptorReslut<T> {

    @JsonProperty("request_id")
    @JSONField(name = "request_id")
    private String requestId;

    @JsonProperty("success")
    @JSONField(name = "success")
    private boolean success;

    @JsonProperty("code")
    @JSONField(name = "code")
    private String code;

    @JsonProperty("message")
    @JSONField(name = "message")
    private String message;

    @JsonProperty("timestamp")
    @JSONField(name = "timestamp")
    private long timestamp;

    @JsonProperty("data")
    @JSONField(name = "data")
    private T data;

    public static <T> PerceptorReslut<T> success() {
        PerceptorReslut<T> result = new PerceptorReslut<>();
        result.setRequestId(UUID.randomUUID().toString().toUpperCase());
        result.setSuccess(true);
        result.setCode("200");
        result.setMessage("调用成功！");
        result.setTimestamp(System.currentTimeMillis());
        return result;
    }

    public static <T> PerceptorReslut<T> success(T data) {
        PerceptorReslut<T> result = success();
        result.setData(data);
        return result;
    }

    public static <T> PerceptorReslut<T> fail(String code, String message) {
        PerceptorReslut<T> result = new PerceptorReslut<>();
        result.setRequestId(UUID.randomUUID().toString().toUpperCase());
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        result.setTimestamp(System.currentTimeMillis());
        return result;
    }
}
