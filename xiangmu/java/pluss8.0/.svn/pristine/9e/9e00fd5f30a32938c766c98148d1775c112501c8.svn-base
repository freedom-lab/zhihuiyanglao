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

@TableName("tb_jiangyukeji_ins_security_dangers_check_detail")
@Data
public class InsSecurityDangersCheckDetail implements Serializable, Cloneable {

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

    /***** 单位id ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 单位名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 自查记录表id ***/
    @TableField(value = "check_id")
    private Long checkId;

    /***** 类别id ***/
    @TableField(value = "category_id")
    private Long categoryId;

    /***** 类别名称 ***/
    @TableField(value = "category_name")
    private String categoryName;

    /***** 题目id ***/
    @TableField(value = "question_id")
    private Long questionId;

    /***** 题目名称 ***/
    @TableField(value = "question_name")
    private String questionName;

    /***** 是否存在问题(1是 ***/
    @TableField(value = "is_problem")
    private Integer isProblem;

    /***** 具体问题情况 ***/
    @TableField(value = "problem_situation")
    private String problemSituation;

    /***** 存在问题拍摄图片 ***/
    @TableField(value = "problem_img_path")
    private String problemImgPath;

    /***** 是否已整治(1是 ***/
    @TableField(value = "is_correction")
    private Integer isCorrection;

    /***** 未整治原因 ***/
    @TableField(value = "unregulated_reason")
    private String unregulatedReason;

    /***** 整治后拍摄图片 ***/
    @TableField(value = "correction_img_path")
    private String correctionImgPath;

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


