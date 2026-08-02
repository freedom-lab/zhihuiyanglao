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

@TableName("tb_jiangyukeji_ins_expenses_bill_record_detail")
@Data
public class InsExpensesBillRecordDetail implements Serializable, Cloneable {

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

    /***** 缴费账单主键id ***/
    @TableField(value = "bill_id")
    private Long billId;

    /***** 缴费账单编号 ***/
    @TableField(value = "bill_code")
    private String billCode;

    /***** 缴费类型(1入住押金 ***/
    @TableField(value = "payment_type")
    private Integer paymentType;

    /***** 应缴金额 ***/
    @TableField(value = "receivable_amount")
    private Double receivableAmount;

    /***** 实缴金额 ***/
    @TableField(value = "actual_amount")
    private Double actualAmount;

    /***** 优惠金额 ***/
    @TableField(value = "preferential_amount")
    private Double preferentialAmount;

    /***** 折扣率 ***/
    @TableField(value = "discount_rate")
    private Double discountRate;

    /***** 计算类型(1无折扣 ***/
    @TableField(value = "tally_type")
    private Integer tallyType;

    /***** 费用说明 ***/
    @TableField(value = "cost_memo")
    private String costMemo;

    /***** 支付状态(1未支付 ***/
    @TableField(value = "pay_state")
    private Integer payState;

    /***** 费用项目主键id ***/
    @TableField(value = "item_id")
    private Long itemId;

    /***** 费用项目名称 ***/
    @TableField(value = "item_name")
    private String itemName;

    /***** 项目价格(元) ***/
    @TableField(value = "item_price")
    private Double itemPrice;

    /***** 收费方式(1一次费用 ***/
    @TableField(value = "cost_mode")
    private Integer costMode;

    /***** 最后一次收费开始日期 ***/
    @TableField(value = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /***** 最后一次收费截止日期 ***/
    @TableField(value = "end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /***** 变更记录id ***/
    @TableField(value = "change_id")
    private Long changeId;

    /***** 生成缴费明细对应的表主键id(多个逗号分隔)用于结算完成更新对应的记录表的结算状态 ***/
    @TableField(value = "detail_ids")
    private String detailIds;

    /***** 账单状态(1有效单据 ***/
    @TableField(value = "bill_state")
    private Integer billState;

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


