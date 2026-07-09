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

@TableName("tb_jiangyukeji_care_payment_info")
@Data
public class CarePaymentInfo implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 入托ID ***/
    @TableField(value = "enroll_id")
    private Long enrollId;

    /***** 缴费单号 ***/
    @TableField(value = "payment_code")
    private String paymentCode;

    /***** 缴费类型（1入托缴费 ***/
    @TableField(value = "payment_type")
    private String paymentType;

    /***** 应收金额 ***/
    @TableField(value = "receivable_amount")
    private Double receivableAmount;

    /***** 实收金额 ***/
    @TableField(value = "amount")
    private Double amount;

    /***** 账单是否确认（0未确认，1已确认） ***/
    @TableField(value = "is_bill_confirm")
    private String isBillConfirm;

    /***** 经办人 ***/
    @TableField(value = "handler")
    private String handler;

    /***** 经办时间 ***/
    @TableField(value = "handler_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date handlerTime;

    /***** 账单说明 ***/
    @TableField(value = "bill_explain")
    private String billExplain;

    /***** 支付方式(1现金 ***/
    @TableField(value = "pay_type")
    private String payType;

    /***** 账户支付金额 ***/
    @TableField(value = "account_pay_amount")
    private Double accountPayAmount;

    /***** 线下支付金额 ***/
    @TableField(value = "offline_pay_amount")
    private Double offlinePayAmount;

    /***** 支付状态(0未支付1已支付) ***/
    @TableField(value = "pay_state")
    private String payState;

    /***** 收款人 ***/
    @TableField(value = "payee_name")
    private String payeeName;

    /***** 收款时间 ***/
    @TableField(value = "payee_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date payeeTime;

    /***** 收款说明 ***/
    @TableField(value = "payee_explain")
    private String payeeExplain;

    /***** 付款人 ***/
    @TableField(value = "payment_name")
    private String paymentName;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人 ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门 ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 操作时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 修改人 ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 修改时间 ***/
    @TableField(value = "update_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;


}


