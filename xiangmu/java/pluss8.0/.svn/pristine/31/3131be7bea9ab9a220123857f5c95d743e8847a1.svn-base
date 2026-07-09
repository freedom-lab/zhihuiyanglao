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

@TableName("tb_jiangyukeji_ins_logistics_procure_info")
@Data
public class InsLogisticsProcureInfo implements Serializable, Cloneable {

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

    /***** 采购日期 ***/
    @TableField(value = "procure_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date procureDate;

    /***** 采购编号 ***/
    @TableField(value = "procure_code")
    private String procureCode;

    /***** 入库类型(1采购入库 ***/
    @TableField(value = "rk_type")
    private Integer rkType;

    /***** 供应商id ***/
    @TableField(value = "supplier_id")
    private Long supplierId;

    /***** 供应商名称 ***/
    @TableField(value = "supplier_name")
    private String supplierName;

    /***** 仓库id ***/
    @TableField(value = "warehouse_id")
    private Long warehouseId;

    /***** 仓库名称 ***/
    @TableField(value = "warehouse_name")
    private String warehouseName;

    /***** 采购人 ***/
    @TableField(value = "procure_user")
    private String procureUser;

    /***** 采购金额(元) ***/
    @TableField(value = "procure_amount")
    private Double procureAmount;

    /***** 入库状态(1待入库 ***/
    @TableField(value = "rk_state")
    private Integer rkState;

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


