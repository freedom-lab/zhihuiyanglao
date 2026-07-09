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

@TableName("tb_jiangyukeji_assessment_result")
@Data
public class AssessmentResult implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 评估指派记录id ***/
    @TableField(value = "appoint_id")
    private Long appointId;

    /***** 选中的选项ID串 ***/
    @TableField(value = "option_ids")
    private String optionIds;

    /***** 选中的问题ID串 ***/
    @TableField(value = "question_ids")
    private String questionIds;

    /***** 民政部能力评估分组类型（1自理能力2基础运动能力3精神状态4感知觉与社会参与） ***/
    @TableField(value = "step_id")
    private Integer stepId;

    /***** 分值 ***/
    @TableField(value = "result_mark")
    private Integer resultMark;

    /***** 评估时间 ***/
    @TableField(value = "assess_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date assessTime;

    /***** 评估结果 ***/
    @TableField(value = "assess_result")
    private String assessResult;

    /***** 选中的题目类型 ***/
    @TableField(value = "question_types")
    private String questionTypes;

    /***** 文本题目的内容 ***/
    @TableField(value = "text_memo")
    private String textMemo;

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

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;


}


