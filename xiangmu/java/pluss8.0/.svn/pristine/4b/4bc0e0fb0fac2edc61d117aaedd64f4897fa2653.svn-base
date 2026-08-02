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

@TableName("tb_jiangyukeji_market_order_info")
@Data
public class MarketOrderInfo implements Serializable, Cloneable {

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

    /***** 商品名称,多个商品将会以逗号隔开 ***/
    @TableField(value = "goods_name")
    private String goodsName;

    /***** 订单编号 ***/
    @TableField(value = "order_code")
    private String orderCode;

    /***** 总金额 ***/
    @TableField(value = "total")
    private Double total;

    /***** 会员折扣金额 ***/
    @TableField(value = "discount_amount")
    private Double discountAmount;

    /***** 优惠券抵扣金额 ***/
    @TableField(value = "coupon_amount")
    private Double couponAmount;

    /***** 积分抵扣金额 ***/
    @TableField(value = "integral_amount")
    private Double integralAmount;

    /***** 优惠总金额 ***/
    @TableField(value = "reduce_amount")
    private Double reduceAmount;

    /***** 实际支付金额 ***/
    @TableField(value = "actual_total")
    private Double actualTotal;

    /***** 支付方式 ***/
    @TableField(value = "pay_type")
    private String payType;

    /***** 订单状态 ***/
    @TableField(value = "order_state")
    private Integer orderState;

    /***** 配送类型(1快递邮寄2到店自取3送货上门) ***/
    @TableField(value = "express_type")
    private String expressType;

    /***** 物流单号 ***/
    @TableField(value = "express_code")
    private String expressCode;

    /***** 物流公司id ***/
    @TableField(value = "express_id")
    private Long expressId;

    /***** 物流公司名称 ***/
    @TableField(value = "express_name")
    private String expressName;

    /***** 订单运费 ***/
    @TableField(value = "express_fee")
    private Double expressFee;

    /***** 用户收货地址Id ***/
    @TableField(value = "address_id")
    private Long addressId;

    /***** 用户收货地址 ***/
    @TableField(value = "address")
    private String address;

    /***** 收货人电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 订单商品总数 ***/
    @TableField(value = "goods_nums")
    private Integer goodsNums;

    /***** 是否新用户下单(0否1是) ***/
    @TableField(value = "is_new_order")
    private String isNewOrder;

    /***** 下单人类型(1老人2子女3管家) ***/
    @TableField(value = "person_type")
    private String personType;

    /***** 下单用户ID ***/
    @TableField(value = "person_id")
    private Long personId;

    /***** 下单人 ***/
    @TableField(value = "person_name")
    private String personName;

    /***** 收件人类型(1老人2子女) ***/
    @TableField(value = "recipient_type")
    private String recipientType;

    /***** 收件人ID ***/
    @TableField(value = "recipient_id")
    private Long recipientId;

    /***** 收件人姓名 ***/
    @TableField(value = "recipient_name")
    private String recipientName;

    /***** 服务预约时间 ***/
    @TableField(value = "reservation_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date reservationTime;

    /***** 服务人员id ***/
    @TableField(value = "server_id")
    private Long serverId;

    /***** 服务人员姓名 ***/
    @TableField(value = "server_name")
    private String serverName;

    /***** 服务人员电话 ***/
    @TableField(value = "server_tel")
    private String serverTel;

    /***** 付款时间 ***/
    @TableField(value = "pay_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date payTime;

    /***** 发货时间 ***/
    @TableField(value = "send_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date sendTime;

    /***** 完成时间 ***/
    @TableField(value = "end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /***** 取消时间 ***/
    @TableField(value = "cancel_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date cancelTime;

    /***** 支付状态，1：已支付，0：未支付 ***/
    @TableField(value = "pay_state")
    private String payState;

    /***** 用户订单关闭状态，0：未关闭，1：已关闭 ***/
    @TableField(value = "delete_status")
    private String deleteStatus;

    /***** 订单类型(1服务项目2实物商品) ***/
    @TableField(value = "category_type")
    private String categoryType;

    /***** 订单关闭原因 ***/
    @TableField(value = "close_type")
    private String closeType;

    /***** 数据来源（0APP1小程序2PC端3管家端） ***/
    @TableField(value = "data_source")
    private Integer dataSource;

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

    /***** 服务前照片 ***/
    @TableField(value = "start_img")
    private String startImg;

    /***** 服务后照片 ***/
    @TableField(value = "end_img")
    private String endImg;

    /***** 视频文件 ***/
    @TableField(value = "video_url")
    private String videoUrl;

    /***** 订单支付流水号 ***/
    @TableField(value = "out_trade_no")
    private String outTradeNo;

    /***** 接单状态（0未接单1已接单） ***/
    @TableField(value = "is_assign")
    private Integer isAssign;

    /***** 派单时间 ***/
    @TableField(value = "assign_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date assignTime;

    /***** 接单时间 ***/
    @TableField(value = "accept_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date acceptTime;

    /***** 确认状态（0未确认1已确认） ***/
    @TableField(value = "confirm_state")
    private Integer confirmState;

    /***** 确认时间 ***/
    @TableField(value = "confirm_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date confirmTime;


}


