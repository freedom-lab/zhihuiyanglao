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
import java.util.List;

@TableName("tb_jiangyukeji_ins_canteen_order_info")
@Data
public class InsCanteenOrderInfo implements Serializable, Cloneable {

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

    /***** 就餐卡号 ***/
    @TableField(value = "card_no")
    private String cardNo;

    /***** 取餐号 ***/
    @TableField(value = "meal_num")
    private String mealNum;

    /***** 订单编号 ***/
    @TableField(value = "order_code")
    private String orderCode;

    /***** 订单类型(1堂食2送餐) ***/
    @TableField(value = "order_type")
    private Integer orderType;

    /***** 服务状态(1待派单2已派单3送餐中4送餐完成-1已退单) ***/
    @TableField(value = "order_state")
    private Integer orderState;

    /***** 用户类别(1入住老人2社会人员3散客来宾) ***/
    @TableField(value = "person_type")
    private Integer personType;

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

    /***** 送餐地址 ***/
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

    /***** 餐次时段(1早2中3晚) ***/
    @TableField(value = "meal_type")
    private Integer mealType;

    /***** 下单时间 ***/
    @TableField(value = "order_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date orderTime;

    /***** 支付状态(1未支付 ***/
    @TableField(value = "pay_state")
    private Integer payState;

    /***** 支付方式(1现金2微信3支付宝5账户余额 ***/
    @TableField(value = "pay_method")
    private Integer payMethod;

    /***** 支付时间 ***/
    @TableField(value = "pay_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date payTime;

    /***** 订单来源(1亲属端、2系统订单、3台式点餐机 ***/
    @TableField(value = "order_source")
    private Integer orderSource;

    /***** 识别方式(数据字典(identify_state)) ***/
    @TableField(value = "identify_state")
    private String identifyState;

    /***** 送餐人员id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 送餐人员名称 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 送餐人员电话 ***/
    @TableField(value = "staff_link_tel")
    private String staffLinkTel;

    /***** 预约送餐时间 ***/
    @TableField(value = "plan_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date planTime;

    /***** 送餐开始时间 ***/
    @TableField(value = "service_start_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date serviceStartTime;

    /***** 送餐完成时间 ***/
    @TableField(value = "service_end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date serviceEndTime;

    /***** 取餐照片（抓拍照片） ***/
    @TableField(value = "take_imgs")
    private String takeImgs;

    /***** 配送照片 ***/
    @TableField(value = "delivery_imgs")
    private String deliveryImgs;

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

    @TableField(exist = false)
    private List<Integer> orderStateList;


}


