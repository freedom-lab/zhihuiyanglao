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

@TableName("tb_jiangyukeji_ins_staff_evaluation_record")
@Data
public class InsStaffEvaluationRecord implements Serializable, Cloneable {

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

    /***** 模板id ***/
    @TableField(value = "template_id")
    private Long templateId;

    /***** 被考评人id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 被考评人姓名 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 性別(1男2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 身份证号码 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 任务id ***/
    @TableField(value = "task_id")
    private Long taskId;

    /***** 状态(0-未开始，1-已完成，2-已存档) ***/
    @TableField(value = "evaluation_state")
    private Integer evaluationState;

    /***** 考评类型(数据字典(ins_evaluation_type)) ***/
    @TableField(value = "evaluation_type")
    private String evaluationType;

    /***** 总得分 ***/
    @TableField(value = "total_score")
    private Double totalScore;

    /***** 考评结果 ***/
    @TableField(value = "score_result")
    private String scoreResult;

    /***** 综合评价 ***/
    @TableField(value = "summary_comments")
    private String summaryComments;

    /***** 改进建议 ***/
    @TableField(value = "improvement_suggestions")
    private String improvementSuggestions;

    /***** 考评时间 ***/
    @TableField(value = "evaluation_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date evaluationTime;

    /***** 考评人id ***/
    @TableField(value = "evaluator_id")
    private Long evaluatorId;

    /***** 考评人姓名 ***/
    @TableField(value = "evaluator_name")
    private String evaluatorName;

    /***** 选中的选项ID串 ***/
    @TableField(value = "option_ids")
    private String optionIds;

    /***** 选中的问题ID串 ***/
    @TableField(value = "question_ids")
    private String questionIds;

    /***** 选中的题目类型 ***/
    @TableField(value = "question_types")
    private String questionTypes;

    /***** 文本题目的内容 ***/
    @TableField(value = "text_memo")
    private String textMemo;

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


