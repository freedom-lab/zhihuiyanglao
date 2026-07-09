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

@TableName("tb_jiangyukeji_ins_scheduling_table_change_record")
@Data
public class InsSchedulingTableChangeRecord implements Serializable, Cloneable {

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

    /***** 变更类型(1换班 ***/
    @TableField(value = "change_type")
    private Integer changeType;

    /***** 员工id(被换班或被替班员工id) ***/
    @TableField(value = "staff_id_one")
    private Long staffIdOne;

    /***** 员工姓名 ***/
    @TableField(value = "staff_name_one")
    private String staffNameOne;

    /***** 排班表id ***/
    @TableField(value = "table_id_one")
    private Long tableIdOne;

    /***** 排班日期 ***/
    @TableField(value = "table_date_one")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date tableDateOne;

    /***** 班次id ***/
    @TableField(value = "classes_id_one")
    private Long classesIdOne;

    /***** 班次名称 ***/
    @TableField(value = "classes_name_one")
    private String classesNameOne;

    /***** 员工id ***/
    @TableField(value = "staff_id_two")
    private Long staffIdTwo;

    /***** 员工姓名 ***/
    @TableField(value = "staff_name_two")
    private String staffNameTwo;

    /***** 排班表id ***/
    @TableField(value = "table_id_two")
    private Long tableIdTwo;

    /***** 排班日期 ***/
    @TableField(value = "table_date_two")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date tableDateTwo;

    /***** 班次id ***/
    @TableField(value = "classes_id_two")
    private Long classesIdTwo;

    /***** 班次名称 ***/
    @TableField(value = "classes_name_two")
    private String classesNameTwo;

    /***** 审核状态(1未审核 ***/
    @TableField(value = "audit_state")
    private Integer auditState;

    /***** 审核人主键id ***/
    @TableField(value = "audit_id")
    private Long auditId;

    /***** 审核人姓名 ***/
    @TableField(value = "audit_name")
    private String auditName;

    /***** 审核时间 ***/
    @TableField(value = "audit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    /***** 审核意见 ***/
    @TableField(value = "audit_memo")
    private String auditMemo;

    /***** 变更原因 ***/
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

    /***** 状态(0禁用 ***/
    @TableField(value = "status")
    private Integer status;


}


