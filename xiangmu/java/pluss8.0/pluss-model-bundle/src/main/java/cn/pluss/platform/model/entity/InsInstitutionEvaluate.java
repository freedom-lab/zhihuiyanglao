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

@TableName("tb_jiangyukeji_ins_institution_evaluate")
@Data
public class InsInstitutionEvaluate implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
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

    /***** 评价人id ***/
    @TableField(value = "evaluator_id")
    private Long evaluatorId;

    /***** 评价人姓名 ***/
    @TableField(value = "evaluator_name")
    private String evaluatorName;

    /***** 环境卫生评价(1-5星) ***/
    @TableField(value = "environment_evaluate")
    private Integer environmentEvaluate;

    /***** 服务态度评价(1-5星) ***/
    @TableField(value = "service_evaluate")
    private Integer serviceEvaluate;

    /***** 饮食质量评价(1-5星) ***/
    @TableField(value = "food_evaluate")
    private Integer foodEvaluate;

    /***** 综合评价(1-5星) ***/
    @TableField(value = "comp_evaluate")
    private Integer compEvaluate;

    /***** 评价内容 ***/
    @TableField(value = "evaluate_content")
    private String evaluateContent;

    /***** 评价图片(多个逗号分隔) ***/
    @TableField(value = "evaluate_img")
    private String evaluateImg;

    /*****  ***/
    @TableField(value = "audit_id")
    private Long auditId;

    /***** 审批状态(1未审批 ***/
    @TableField(value = "audit_state")
    private Integer auditState;

    /***** 审批人姓名 ***/
    @TableField(value = "audit_name")
    private String auditName;

    /***** 审批时间 ***/
    @TableField(value = "audit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    /***** 审批意见 ***/
    @TableField(value = "audit_memo")
    private String auditMemo;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建人名称 ***/
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

    /***** 是否启用(1启用 ***/
    @TableField(value = "status")
    private Integer status;


}


