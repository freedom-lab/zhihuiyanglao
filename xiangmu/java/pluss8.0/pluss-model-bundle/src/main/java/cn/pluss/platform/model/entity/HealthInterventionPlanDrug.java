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

@TableName("tb_jiangyukeji_health_intervention_plan_drug")
@Data
public class HealthInterventionPlanDrug implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 方案ID ***/
    @TableField(value = "plan_id")
    private Long planId;

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 药品名称 ***/
    @TableField(value = "drug_name")
    private String drugName;

    /***** 规格 ***/
    @TableField(value = "drug_specs")
    private String drugSpecs;

    /***** 用法 ***/
    @TableField(value = "drug_method")
    private String drugMethod;

    /***** 用量 ***/
    @TableField(value = "drug_dosage")
    private String drugDosage;

    /***** 频次 ***/
    @TableField(value = "drug_rate")
    private String drugRate;

    /***** 药品厂家 ***/
    @TableField(value = "factory_name")
    private String factoryName;

    /***** 药品外包装图片 ***/
    @TableField(value = "img_path")
    private String imgPath;

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


