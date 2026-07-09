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

@TableName("tb_jiangyukeji_assessment_question")
@Data
public class AssessmentQuestion implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 题目名称 ***/
    @TableField(value = "question_name")
    private String questionName;

    /***** 题目类型(1单选题2多选题3文本题) ***/
    @TableField(value = "question_type")
    private String questionType;

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 模板id ***/
    @TableField(value = "template_id")
    private Long templateId;

    /***** 序号 ***/
    @TableField(value = "serial_number")
    private Integer serialNumber;

    /***** 民政部能力评估分组类型（1自理能力2基础运动能力3精神状态4感知觉与社会参与） ***/
    @TableField(value = "group_type")
    private Integer groupType;

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

    /***** 评估选项列表 ***/
    @TableField(exist = false)
    private List<AssessmentOption> assessmentOptions;

}


