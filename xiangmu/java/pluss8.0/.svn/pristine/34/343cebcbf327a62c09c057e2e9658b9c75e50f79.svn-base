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

@TableName("tb_jiangyukeji_health_intervention_plan_adjust")
@Data
public class HealthInterventionPlanAdjust implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 方案ID ***/
    @TableField(value = "plan_id")
    private Long planId;

    /***** 调整时间 ***/
    @TableField(value = "adjust_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date adjustTime;

    /***** 调整原因 ***/
    @TableField(value = "adjust_reason")
    private String adjustReason;

    /***** 调整内容 ***/
    @TableField(value = "adjust_content")
    private String adjustContent;

    /***** 调整前方案内容 ***/
    @TableField(value = "before_adjustment")
    private String beforeAdjustment;

    /***** 调整后方案内容 ***/
    @TableField(value = "after_adjustment")
    private String afterAdjustment;

    /***** 调整医生ID ***/
    @TableField(value = "adjust_doctor_id")
    private Long adjustDoctorId;

    /***** 调整医生姓名 ***/
    @TableField(value = "adjust_doctor_name")
    private String adjustDoctorName;

    /***** 效果评估 ***/
    @TableField(value = "effect_evaluation")
    private String effectEvaluation;

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


