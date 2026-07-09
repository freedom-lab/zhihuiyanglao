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
import java.util.List;

@TableName("tb_jiangyukeji_assessment_template")
@Data
public class AssessmentTemplate implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 模板名称 ***/
    @TableField(value = "template_name")
    private String templateName;

    /***** 评估标准（01国家标准02行业标准03地方标准） ***/
    @TableField(value = "assessment_criteria")
    private String assessmentCriteria;

    /***** 模板类型(1.能力评估2专项评估3自定义评估) ***/
    @TableField(value = "template_type")
    private String templateType;

    /***** 模板状态(1启用0未启用)同一评估类型唯一启用 ***/
    @TableField(value = "status")
    private String status;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

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
    /***** 评估问题列表 ***/
    @TableField(exist = false)
    private List<AssessmentQuestion> assessmentQuestions;

    /***** 评估标准列表 ***/
    @TableField(exist = false)
    private List<AssessmentStandard> assessmentStandards;

    @TableField(exist = false)
    private String templateIds;
}


