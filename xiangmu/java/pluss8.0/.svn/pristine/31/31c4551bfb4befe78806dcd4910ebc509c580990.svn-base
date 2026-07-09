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

@TableName("tb_jiangyukeji_ins_logistics_outbound_info")
@Data
public class InsLogisticsOutboundInfo implements Serializable, Cloneable {

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

    /***** 出库日期 ***/
    @TableField(value = "outbound_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date outboundDate;

    /***** 出库编号 ***/
    @TableField(value = "outbound_code")
    private String outboundCode;

    /***** 出库类型(1销售出库 ***/
    @TableField(value = "ck_type")
    private Integer ckType;

    /***** 仓库id ***/
    @TableField(value = "warehouse_id")
    private Long warehouseId;

    /***** 仓库名称 ***/
    @TableField(value = "warehouse_name")
    private String warehouseName;

    /***** 领用类型(1部门领用 ***/
    @TableField(value = "neck_type")
    private Integer neckType;

    /***** 部门名称 ***/
    @TableField(value = "neck_department")
    private String neckDepartment;

    /***** 领用人id ***/
    @TableField(value = "neck_id")
    private Long neckId;

    /***** 领用人姓名 ***/
    @TableField(value = "neck_name")
    private String neckName;

    /***** 出库金额(元) ***/
    @TableField(value = "outbound_amount")
    private Double outboundAmount;

    /***** 出库状态(1待出库 ***/
    @TableField(value = "ck_state")
    private Integer ckState;

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

    /***** 物品购买订单id ***/
    @TableField(value = "order_id")
    private Long orderId;

    /***** 入住信息主键id ***/
    @TableField(value = "check_id")
    private Long checkId;

    /***** 入住日期 ***/
    @TableField(value = "check_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
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

    /***** 主回收状态(1 ***/
    @TableField(value = "recovery_status")
    private Integer recoveryStatus;

    /***** 回收时间 ***/
    @TableField(value = "recovery_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date recoveryTime;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 录单人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 录单人姓名 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 创建部门id ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 录单时间 ***/
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


