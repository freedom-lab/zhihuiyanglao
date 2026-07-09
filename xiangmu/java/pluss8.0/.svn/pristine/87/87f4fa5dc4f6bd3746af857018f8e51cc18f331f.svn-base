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

@TableName("tb_jiangyukeji_ins_security_dangers_check")
@Data
public class InsSecurityDangersCheck implements Serializable, Cloneable {

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

    /***** 单位地址 ***/
    @TableField(value = "institution_address")
    private String institutionAddress;

    /***** 风险隐患大类(数据字典 ***/
    @TableField(value = "dangers_type")
    private String dangersType;

    /***** 自查时间 ***/
    @TableField(value = "check_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date checkDate;

    /***** 安全责任人 ***/
    @TableField(value = "pic_name")
    private String picName;

    /***** 安全管理人 ***/
    @TableField(value = "manager_name")
    private String managerName;

    /***** 单位建筑总数量 ***/
    @TableField(value = "building_num")
    private Integer buildingNum;

    /***** 单位人员数量 ***/
    @TableField(value = "staff_num")
    private Integer staffNum;

    /***** 单位总建筑面积 ***/
    @TableField(value = "area_num")
    private Double areaNum;

    /***** 集中住宿人员数量 ***/
    @TableField(value = "stay_num")
    private Integer stayNum;

    /***** 安全责任人签字 ***/
    @TableField(value = "pic_name_sign")
    private String picNameSign;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 提交状态（0未提交1已提交） ***/
    @TableField(value = "submit_state")
    private Integer submitState;

    /***** 存在其他问题情况 ***/
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

    /***** 任务主键id ***/
    @TableField(value = "task_id")
    private Long taskId;

    /***** 任务名称 ***/
    @TableField(value = "task_title")
    private String taskTitle;

    /***** 审核状态(0未审核 ***/
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


}


