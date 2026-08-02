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

@TableName("tb_jiangyukeji_ins_logistics_transfer_info")
@Data
public class InsLogisticsTransferInfo implements Serializable, Cloneable {

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

    /***** 申请日期 ***/
    @TableField(value = "apply_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date applyDate;

    /***** 申请人 ***/
    @TableField(value = "apply_user")
    private String applyUser;

    /***** 期望收料日期 ***/
    @TableField(value = "expected_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date expectedDate;

    /***** 发料仓库id ***/
    @TableField(value = "warehouse_id")
    private Long warehouseId;

    /***** 发料仓库名称 ***/
    @TableField(value = "warehouse_name")
    private String warehouseName;

    /***** 收料机构id ***/
    @TableField(value = "receive_institution_id")
    private Long receiveInstitutionId;

    /***** 收料机构名称 ***/
    @TableField(value = "receive_institution_name")
    private String receiveInstitutionName;

    /***** 收料仓库id ***/
    @TableField(value = "receive_warehouse_id")
    private Long receiveWarehouseId;

    /***** 收料仓库名称 ***/
    @TableField(value = "receive_warehouse_name")
    private String receiveWarehouseName;

    /***** 调拨总金额(元) ***/
    @TableField(value = "transfer_amount")
    private Double transferAmount;

    /***** 调拨状态(1待调拨 ***/
    @TableField(value = "transfer_state")
    private Integer transferState;

    /***** 调拨原因 ***/
    @TableField(value = "transfer_memo")
    private String transferMemo;

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


