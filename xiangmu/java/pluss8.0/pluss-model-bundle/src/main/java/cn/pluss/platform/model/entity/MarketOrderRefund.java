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

@TableName("tb_jiangyukeji_market_order_refund")
@Data
public class MarketOrderRefund implements Serializable, Cloneable {

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

    /***** 订单ID ***/
    @TableField(value = "order_id")
    private Long orderId;

    /***** 订单编号 ***/
    @TableField(value = "order_code")
    private String orderCode;

    /***** 订单总金额 ***/
    @TableField(value = "order_amount")
    private Double orderAmount;

    /***** 订单项ID ***/
    @TableField(value = "order_item_id")
    private Long orderItemId;

    /***** 退款编号 ***/
    @TableField(value = "refund_code")
    private String refundCode;

    /***** 订单支付流水号 ***/
    @TableField(value = "out_trade_no")
    private String outTradeNo;

    /***** 第三方退款单号 ***/
    @TableField(value = "out_refund_no")
    private String outRefundNo;

    /***** 订单支付方式 ***/
    @TableField(value = "pay_type")
    private String payType;

    /***** 退款人类别(1老人2子女) ***/
    @TableField(value = "person_type")
    private String personType;

    /***** 退款人ID ***/
    @TableField(value = "person_id")
    private Long personId;

    /***** 退款人 ***/
    @TableField(value = "person_name")
    private String personName;

    /***** 买家身份证号码 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 退货数量 ***/
    @TableField(value = "goods_num")
    private Integer goodsNum;

    /***** 退款金额 ***/
    @TableField(value = "refund_amount")
    private Double refundAmount;

    /***** 申请类型:1,仅退款,2退款退货 ***/
    @TableField(value = "apply_type")
    private String applyType;

    /***** 审核状态:0待审核,1同意,2不同意 ***/
    @TableField(value = "audit_state")
    private String auditState;

    /***** 审核人 ***/
    @TableField(value = "audit_name")
    private String auditName;

    /***** 审核意见 ***/
    @TableField(value = "audit_memo")
    private String auditMemo;

    /***** 处理退款状态: ***/
    @TableField(value = "return_state")
    private String returnState;

    /***** 申请时间 ***/
    @TableField(value = "apply_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date applyTime;

    /***** 卖家处理时间 ***/
    @TableField(value = "handle_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date handleTime;

    /***** 退款时间 ***/
    @TableField(value = "refund_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date refundTime;

    /***** 退款凭证照片 ***/
    @TableField(value = "pics")
    private String pics;

    /***** 申请原因 ***/
    @TableField(value = "apply_reason")
    private String applyReason;

    /***** 卖家备注 ***/
    @TableField(value = "seller_memo")
    private String sellerMemo;

    /***** 物流公司id ***/
    @TableField(value = "express_id")
    private Long expressId;

    /***** 物流公司名称 ***/
    @TableField(value = "express_name")
    private String expressName;

    /***** 物流单号 ***/
    @TableField(value = "express_no")
    private String expressNo;

    /***** 发货时间 ***/
    @TableField(value = "send_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date sendTime;

    /***** 收货时间 ***/
    @TableField(value = "receive_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date receiveTime;

    /***** 收货备注 ***/
    @TableField(value = "receive_memo")
    private String receiveMemo;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人 ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门 ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
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

    /***** 是否删除(0否1是) ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;


}


