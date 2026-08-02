package cn.pluss.platform.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("tb_jiangyukeji_health_ai_analysis")
@Data
public class HealthAiAnalysis implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1：男，2：女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 健康指标类型(BLOOD_PRESSURE-血压,BLOOD_SUGAR-血糖,HEART_RATE-心率,BLOOD_OXYGEN-血氧等) ***/
    @TableField(value = "health_indicator_type")
    private String healthIndicatorType;

    /***** 分析类型(SINGLE-单次分析,WEEKLY-7天分析,MONTHLY-30天分析,NO_MEASUREMENT_7DAYS-7天未测量风险分析) ***/
    @TableField(value = "analysis_type")
    private String analysisType;

    /***** 数据来源ID(对应健康指标记录ID) ***/
    @TableField(value = "data_source_id")
    private Long dataSourceId;

    /***** 数据分析起始时间 ***/
    @TableField(value = "data_start_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dataStartTime;

    /***** 数据分析结束时间 ***/
    @TableField(value = "data_end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dataEndTime;

    /***** 原始测量数据JSON(不同指标存储不同字段) ***/
    @TableField(value = "raw_data_json")
    private String rawDataJson;

    /***** 风险等级(低风险/中风险/高风险/紧急) ***/
    @TableField(value = "risk_level")
    private String riskLevel;

    /***** 趋势分析 ***/
    @TableField(value = "trend_analysis")
    private String trendAnalysis;

    /***** 预测结果(未来周期预测) ***/
    @TableField(value = "prediction_result")
    private String predictionResult;

    /***** 饮食建议 ***/
    @TableField(value = "diet_advice")
    private String dietAdvice;

    /***** 运动建议 ***/
    @TableField(value = "exercise_advice")
    private String exerciseAdvice;

    /***** 健康指导建议 ***/
    @TableField(value = "health_guidance")
    private String healthGuidance;

    /***** 预警信息 ***/
    @TableField(value = "warning_message")
    private String warningMessage;

    /***** 综合干预报告 ***/
    @TableField(value = "intervention_suggestions")
    private String interventionSuggestions;

    /***** 指标特有分析结果JSON(如血压的收缩压/舒张压分析，血糖的餐前餐后分析等) ***/
    @TableField(value = "indicator_specific_json")
    private String indicatorSpecificJson;

    /***** AI原始响应内容 ***/
    @TableField(value = "ai_raw_response")
    private String aiRawResponse;

    /***** 使用的AI模型 ***/
    @TableField(value = "ai_model")
    private String aiModel;

    /***** AI提示词版本 ***/
    @TableField(value = "ai_prompt_version")
    private String aiPromptVersion;

    /***** 分析时间 ***/
    @TableField(value = "analysis_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date analysisDate;

    /***** 分析耗时(毫秒) ***/
    @TableField(value = "analysis_duration_ms")
    private Integer analysisDurationMs;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人 ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门 ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 修改人 ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 修改时间 ***/
    @TableField(value = "update_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /***** 是否已删除(0:否,1:是) ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 是否启用(1启用 ***/
    @TableField(value = "status")
    private Integer status;


}


