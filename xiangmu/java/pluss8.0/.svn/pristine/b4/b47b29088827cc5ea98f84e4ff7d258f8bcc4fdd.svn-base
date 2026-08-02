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

@TableName("tb_jiangyukeji_ins_logistics_order_info")
@Data
public class InsLogisticsOrderInfo implements Serializable, Cloneable {

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

    /***** 订单编号 ***/
    @TableField(value = "order_code")
    private String orderCode;

    /***** 订单状态(1待出库 ***/
    @TableField(value = "order_state")
    private Integer orderState;

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

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 地址 ***/
    @TableField(value = "address")
    private String address;

    /***** 应付金额(元) ***/
    @TableField(value = "total_amount")
    private Double totalAmount;

    /***** 实付金额(元) ***/
    @TableField(value = "pay_amount")
    private Double payAmount;

    /***** 优惠金额(元) ***/
    @TableField(value = "offer_amount")
    private Double offerAmount;

    /***** 下单时间 ***/
    @TableField(value = "order_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date orderTime;

    /***** 支付状态(1未支付 ***/
    @TableField(value = "pay_state")
    private Integer payState;

    /***** 支付方式(1现金 ***/
    @TableField(value = "pay_method")
    private Integer payMethod;

    /***** 支付时间 ***/
    @TableField(value = "pay_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date payTime;

    /***** 订单来源(1亲属端、2系统订单、3收银机 ***/
    @TableField(value = "order_source")
    private Integer orderSource;

    /***** 识别方式(数据字典(identify_state)) ***/
    @TableField(value = "identify_state")
    private String identifyState;

    /***** 配送人员id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 配送人员名称 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 配送人员电话 ***/
    @TableField(value = "staff_link_tel")
    private String staffLinkTel;

    /***** 送达状态（0未配送 ***/
    @TableField(value = "send_state")
    private Integer sendState;

    /***** 送达图片 ***/
    @TableField(value = "send_img")
    private String sendImg;

    /***** 送达时间 ***/
    @TableField(value = "send_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date sendTime;

    /***** 退单时间 ***/
    @TableField(value = "refund_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date refundTime;

    /***** 退单原因 ***/
    @TableField(value = "refund_reason")
    private String refundReason;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private String areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

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

    /***** 是否已删除(0未删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 状态(0禁用1启用) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 第三方支付商户订单号 ***/
    @TableField(value = "out_trade_no")
    private String outTradeNo;


}


