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

@TableName("tb_jiangyukeji_ins_scheduling_table_settings")
@Data
public class InsSchedulingTableSettings implements Serializable, Cloneable {

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

    /***** 排班表id ***/
    @TableField(value = "table_id")
    private Long tableId;

    /***** 排班表名称 ***/
    @TableField(value = "table_name")
    private String tableName;

    /***** 排班日期 ***/
    @TableField(value = "table_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date tableDate;

    /***** 锁定状态(0未锁定 ***/
    @TableField(value = "lock_state")
    private Integer lockState;

    /***** 班次id ***/
    @TableField(value = "classes_id")
    private Long classesId;

    /***** 班次名称 ***/
    @TableField(value = "classes_name")
    private String classesName;

    /***** 员工id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 员工姓名 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 身份证号码 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性別(1男2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 规定上班时间 ***/
    @TableField(value = "work_start_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date workStartTime;

    /***** 规定下班时间 ***/
    @TableField(value = "work_end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date workEndTime;

    /***** 实际签入时间 ***/
    @TableField(value = "signin_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date signinTime;

    /***** 实际签出时间 ***/
    @TableField(value = "signout_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date signoutTime;

    /***** 上班状态（1未签入 ***/
    @TableField(value = "work_state")
    private Integer workState;

    /***** 下班状态（1未签入 ***/
    @TableField(value = "off_state")
    private Integer offState;

    /***** 班次状态(0正常 ***/
    @TableField(value = "table_state")
    private Integer tableState;

    /***** 休息时长(单位：小时) ***/
    @TableField(value = "rest_duration")
    private Double restDuration;

    /***** 排班人员类型(1护理员排班 ***/
    @TableField(value = "scheduling_type")
    private Integer schedulingType;

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

    /***** 状态(0禁用 ***/
    @TableField(value = "status")
    private Integer status;


}


