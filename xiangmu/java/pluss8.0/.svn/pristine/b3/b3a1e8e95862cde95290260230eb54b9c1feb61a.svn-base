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

@TableName("tb_jiangyukeji_assessment_standard")
@Data
public class AssessmentStandard implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 评估级别名称 ***/
    @TableField(value = "level_name")
    private String levelName;

    /***** 模板ID ***/
    @TableField(value = "template_id")
    private Long templateId;

    /***** 起始值 ***/
    @TableField(value = "score_start")
    private Integer scoreStart;

    /***** 结束值 ***/
    @TableField(value = "score_end")
    private Integer scoreEnd;

    /***** 评估结果 ***/
    @TableField(value = "score_result")
    private String scoreResult;

    /***** 序号 ***/
    @TableField(value = "serial_number")
    private Integer serialNumber;

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

    /***** 状态 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 评估建议 ***/
    @TableField(value = "assessment_suggest")
    private String assessmentSuggest;


}


