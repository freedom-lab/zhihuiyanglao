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

@TableName("tb_jiangyukeji_ins_nursing_change_nursing_record")
@Data
public class InsNursingChangeNursingRecord implements Serializable, Cloneable {

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

    /***** 入住信息主键id ***/
    @TableField(value = "check_id")
    private Long checkId;

    /***** 入住日期 ***/
    @TableField(value = "check_date")
    private Date checkDate;

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1男，2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 执行状态(1待变更 ***/
    @TableField(value = "change_state")
    private Integer changeState;

    /***** 申请时间 ***/
    @TableField(value = "apply_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date applyTime;

    /***** 变更执行日期 ***/
    @TableField(value = "execute_date")
    private Date executeDate;

    /***** 原护理等级id ***/
    @TableField(value = "old_nursing_level_id")
    private Long oldNursingLevelId;

    /***** 原护理等级名称 ***/
    @TableField(value = "old_nursing_level_name")
    private String oldNursingLevelName;

    /***** 原护理费价格(元) ***/
    @TableField(value = "old_nursing_price")
    private Double oldNursingPrice;

    /***** 新护理等级id ***/
    @TableField(value = "new_nursing_level_id")
    private Long newNursingLevelId;

    /***** 新护理等级名称 ***/
    @TableField(value = "new_nursing_level_name")
    private String newNursingLevelName;

    /***** 新护理费价格(元) ***/
    @TableField(value = "new_nursing_price")
    private Double newNursingPrice;

    /***** 变更依据(图片路径) ***/
    @TableField(value = "according_path")
    private String accordingPath;

    /***** 变更依据说明 ***/
    @TableField(value = "according_describe")
    private String accordingDescribe;

    /***** 老人费用标准id ***/
    @TableField(value = "standard_id")
    private Long standardId;

    /***** 是否已核算差额(1未核算 ***/
    @TableField(value = "calculate_state")
    private Integer calculateState;

    /***** 结算状态(1未结算 ***/
    @TableField(value = "settlement_state")
    private Integer settlementState;

    /***** 缴费账单主键id ***/
    @TableField(value = "bill_id")
    private Long billId;

    /***** 审批状态(1未审批 ***/
    @TableField(value = "audit_state")
    private Integer auditState;

    /***** 审批人主键id ***/
    @TableField(value = "audit_id")
    private Long auditId;

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

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private String areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

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


