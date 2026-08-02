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

@TableName("tb_jiangyukeji_member_charge_log")
@Data
public class MemberChargeLog implements Serializable, Cloneable {

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

    /***** 充值流水号 ***/
    @TableField(value = "serial_number")
    private String serialNumber;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 性别(1男，2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 会员卡号 ***/
    @TableField(value = "member_card")
    private String memberCard;

    /***** 会员等级 ***/
    @TableField(value = "member_level")
    private Long memberLevel;

    /***** 变更类型(1增加2扣减) ***/
    @TableField(value = "change_type")
    private String changeType;

    /***** 1现金、2微信、3支付宝、4银联卡、5系统退款 ***/
    @TableField(value = "pay_type")
    private String payType;

    /***** 充值前余额 ***/
    @TableField(value = "last_amount")
    private Double lastAmount;

    /***** 本次充值 ***/
    @TableField(value = "charge_amount")
    private Double chargeAmount;

    /***** 赠送金额 ***/
    @TableField(value = "give_amount")
    private Double giveAmount;

    /***** 充值后余额 ***/
    @TableField(value = "newest_amount")
    private Double newestAmount;

    /***** 操作人 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 充值时间 ***/
    @TableField(value = "charge_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date chargeTime;

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

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 第三方支付商户订单号 ***/
    @TableField(value = "out_trade_no")
    private String outTradeNo;

    /***** 数据来源(1本系统 ***/
    @TableField(value = "data_source")
    private Integer dataSource;


}


