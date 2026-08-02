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

@TableName("tb_jiangyukeji_health_interventions_temple")
@Data
public class HealthInterventionsTemple implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 疾病分类(数据字典) ***/
    @TableField(value = "disease_id")
    private String diseaseId;

    /***** 疾病名称 ***/
    @TableField(value = "disease_name")
    private String diseaseName;

    /***** 控制目标 ***/
    @TableField(value = "control_plan")
    private String controlPlan;

    /***** 饮食指导 ***/
    @TableField(value = "diet_guide")
    private String dietGuide;

    /***** 运动指导 ***/
    @TableField(value = "sport_guide")
    private String sportGuide;

    /***** 参考食谱 ***/
    @TableField(value = "reference_recipe")
    private String referenceRecipe;

    /***** 中医药养 ***/
    @TableField(value = "traditional_medicine")
    private String traditionalMedicine;

    /***** 其他建议 ***/
    @TableField(value = "other_tips")
    private String otherTips;

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

    /***** 业务状态 ***/
    @TableField(value = "status")
    private Integer status;


}


