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

@TableName("tb_jiangyukeji_health_disease_follow")
@Data
public class HealthDiseaseFollow implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 慢病干预id（东营修改：1健康指导建议，2 ***/
    @TableField(value = "interventions_id")
    private Long interventionsId;

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 用药情况 ***/
    @TableField(value = "medication_condition")
    private String medicationCondition;

    /***** 饮食情况 ***/
    @TableField(value = "diet_condition")
    private String dietCondition;

    /***** 运动情况 ***/
    @TableField(value = "sport_condition")
    private String sportCondition;

    /***** 心理情况 ***/
    @TableField(value = "psychology_condition")
    private String psychologyCondition;

    /***** 健康指导 ***/
    @TableField(value = "health_context")
    private String healthContext;

    /***** 备注 ***/
    @TableField(value = "memo")
    private String memo;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 创建人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门id ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 修改人id ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 修改时间 ***/
    @TableField(value = "update_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 业务字段 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 记录人 ***/
    @TableField(value = "record_name")
    private String recordName;

    /***** 记录时间 ***/
    @TableField(value = "record_datetime")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date recordDatetime;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;


}


