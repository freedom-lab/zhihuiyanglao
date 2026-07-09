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

@TableName("tb_jiangyukeji_care_payment_detail")
@Data
public class CarePaymentDetail implements Serializable, Cloneable {

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

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人名称 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 缴费主表ID ***/
    @TableField(value = "payment_id")
    private Long paymentId;

    /***** 流水单号 ***/
    @TableField(value = "serial_code")
    private String serialCode;

    /***** 服务项目id ***/
    @TableField(value = "item_id")
    private Long itemId;

    /***** 服务项目 ***/
    @TableField(value = "item_name")
    private String itemName;

    /***** 服务项目单价 ***/
    @TableField(value = "item_price")
    private Double itemPrice;

    /***** 费用类型(1押金 ***/
    @TableField(value = "fee_type")
    private String feeType;

    /***** 收费方式(1一次性费用、2每月费用) ***/
    @TableField(value = "cost_type")
    private String costType;

    /***** 出院是否退款(0否1是) ***/
    @TableField(value = "is_refund")
    private String isRefund;

    /***** 优惠状态（0无优惠，1有优惠） ***/
    @TableField(value = "is_preferential")
    private String isPreferential;

    /***** 收费金额 ***/
    @TableField(value = "amount")
    private Double amount;

    /***** 优惠金额 ***/
    @TableField(value = "preferential_amount")
    private Double preferentialAmount;

    /***** 优惠后金额 ***/
    @TableField(value = "cost_amount")
    private Double costAmount;

    /***** 缴费开始日期 ***/
    @TableField(value = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /***** 缴费结束日期 ***/
    @TableField(value = "end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /***** 变更记录id(请假和费用变更) ***/
    @TableField(value = "change_id")
    private Long changeId;

    /***** 照料服务记录id和差额记录id ***/
    @TableField(value = "order_ids")
    private String orderIds;

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


