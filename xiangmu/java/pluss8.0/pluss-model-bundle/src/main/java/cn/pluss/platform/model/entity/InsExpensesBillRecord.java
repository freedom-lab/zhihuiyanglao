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

@TableName("tb_jiangyukeji_ins_expenses_bill_record")
@Data
public class InsExpensesBillRecord implements Serializable, Cloneable {

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

    /***** 性别(1男，2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 缴费账单编号 ***/
    @TableField(value = "bill_code")
    private String billCode;

    /***** 缴费账单类型(0入住缴费 ***/
    @TableField(value = "bill_type")
    private Integer billType;

    /***** 账单名称 ***/
    @TableField(value = "bill_name")
    private String billName;

    /***** 应缴金额 ***/
    @TableField(value = "receivable_amount")
    private Double receivableAmount;

    /***** 账单是否核算(1未核算 ***/
    @TableField(value = "is_calculate")
    private Integer isCalculate;

    /***** 折扣类型(1手动输入 ***/
    @TableField(value = "discount_type")
    private Integer discountType;

    /***** 核算人id ***/
    @TableField(value = "calculate_id")
    private Long calculateId;

    /***** 核算人 ***/
    @TableField(value = "calculate_name")
    private String calculateName;

    /***** 核算时间 ***/
    @TableField(value = "calculate_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date calculateTime;

    /***** 支付状态(1未支付 ***/
    @TableField(value = "pay_state")
    private Integer payState;

    /***** 支付方式(1现金 ***/
    @TableField(value = "pay_method")
    private Integer payMethod;

    /***** 实缴金额 ***/
    @TableField(value = "actual_amount")
    private Double actualAmount;

    /***** 大写金额 ***/
    @TableField(value = "capital_amount")
    private String capitalAmount;

    /***** 现金支付金额 ***/
    @TableField(value = "xj_amount")
    private Double xjAmount;

    /***** 微信支付金额 ***/
    @TableField(value = "wx_amount")
    private Double wxAmount;

    /***** 支付宝支付金额 ***/
    @TableField(value = "zfb_amount")
    private Double zfbAmount;

    /***** 银联卡支付金额 ***/
    @TableField(value = "ylk_amount")
    private Double ylkAmount;

    /***** 账户余额支付金额 ***/
    @TableField(value = "ye_amount")
    private Double yeAmount;

    /***** 代金卷支付金额 ***/
    @TableField(value = "djq_amount")
    private Double djqAmount;

    /***** 转账支付金额 ***/
    @TableField(value = "zz_amount")
    private Double zzAmount;

    /***** 其他支付金额 ***/
    @TableField(value = "qt_amount")
    private Double qtAmount;

    /***** 交款人 ***/
    @TableField(value = "payment_name")
    private String paymentName;

    /***** 交款时间 ***/
    @TableField(value = "payment_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date paymentTime;

    /***** 收款人id ***/
    @TableField(value = "payee_id")
    private Long payeeId;

    /***** 收款人 ***/
    @TableField(value = "payee_name")
    private String payeeName;

    /***** 收款时间 ***/
    @TableField(value = "payee_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date payeeTime;

    /***** 账单状态(1有效单据 ***/
    @TableField(value = "bill_state")
    private Integer billState;

    /***** 欠费提醒推送状态(0未推送 ***/
    @TableField(value = "push_state")
    private Integer pushState;

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


