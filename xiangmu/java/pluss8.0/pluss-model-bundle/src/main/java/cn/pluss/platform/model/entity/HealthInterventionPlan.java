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

@TableName("tb_jiangyukeji_health_intervention_plan")
@Data
public class HealthInterventionPlan implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 所属运营公司id ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 所属运营公司名称 ***/
    @TableField(value = "corp_name")
    private String corpName;

    /***** 机构id ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 方案编号 ***/
    @TableField(value = "plan_no")
    private String planNo;

    /***** 档案ID ***/
    @TableField(value = "archive_id")
    private Long archiveId;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 制定医生ID ***/
    @TableField(value = "doctor_id")
    private Long doctorId;

    /***** 制定医生姓名 ***/
    @TableField(value = "doctor_name")
    private String doctorName;

    /***** 制定时间 ***/
    @TableField(value = "develop_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date developTime;

    /***** 干预周期-开始日期 ***/
    @TableField(value = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /***** 干预周期-结束日期 ***/
    @TableField(value = "end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /***** 干预目标 ***/
    @TableField(value = "intervention_target")
    private String interventionTarget;

    /***** 慢病id ***/
    @TableField(value = "disease_id")
    private Long diseaseId;

    /***** 慢病名称 ***/
    @TableField(value = "disease_name")
    private String diseaseName;

    /***** 病情分级id ***/
    @TableField(value = "disease_level_id")
    private Long diseaseLevelId;

    /***** 病情分级名称 ***/
    @TableField(value = "disease_level_name")
    private String diseaseLevelName;

    /***** 用药干预 ***/
    @TableField(value = "medication_plan")
    private String medicationPlan;

    /***** 饮食运动干预 ***/
    @TableField(value = "diet_plan")
    private String dietPlan;

    /***** 监测随访 ***/
    @TableField(value = "monitoring_plan")
    private String monitoringPlan;

    /***** 方案状态(0未开始 ***/
    @TableField(value = "plan_state")
    private Integer planState;

    /***** 执行率(%) ***/
    @TableField(value = "execution_rate")
    private Double executionRate;

    /***** 效果评估 ***/
    @TableField(value = "effect_evaluation")
    private String effectEvaluation;

    /***** 调整次数 ***/
    @TableField(value = "adjustment_count")
    private Integer adjustmentCount;

    /***** 最后调整时间 ***/
    @TableField(value = "last_adjust_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date lastAdjustTime;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人ID ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建人姓名 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 创建部门id ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 修改人ID ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 修改时间 ***/
    @TableField(value = "update_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /***** 是否已删除(0未删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 是否启用(1启用 ***/
    @TableField(value = "status")
    private Integer status;


}


