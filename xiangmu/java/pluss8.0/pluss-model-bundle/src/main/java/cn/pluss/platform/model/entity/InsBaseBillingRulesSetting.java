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

@TableName("tb_jiangyukeji_ins_base_billing_rules_setting")
@Data
public class InsBaseBillingRulesSetting implements Serializable, Cloneable {

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

    /***** 入住流程步骤(多个逗号分隔(1,2,3,4,5,6,7)) ***/
    @TableField(value = "check_flow_path")
    private String checkFlowPath;

    /***** 入住当天是否收费(1收费 ***/
    @TableField(value = "check_day_charges")
    private Integer checkDayCharges;

    /***** 计费规则(1按自然月计费 ***/
    @TableField(value = "billing_rules")
    private Integer billingRules;

    /***** 单据标题前缀 ***/
    @TableField(value = "bill_title")
    private String billTitle;

    /***** 收费提醒天数 ***/
    @TableField(value = "fee_reminder_number")
    private Integer feeReminderNumber;

    /***** 请假退费天数(大于多少天退费) ***/
    @TableField(value = "leave_refund_number")
    private Integer leaveRefundNumber;

    /***** 退住当天是否收费(1收费 ***/
    @TableField(value = "retreat_day_charges")
    private Integer retreatDayCharges;

    /***** 费用保留小数位(1保留2位(四舍五入) ***/
    @TableField(value = "cost_reserve_number")
    private Integer costReserveNumber;

    /***** 水费单价(每吨) ***/
    @TableField(value = "water_price")
    private Double waterPrice;

    /***** 电费单价(每千瓦) ***/
    @TableField(value = "electric_price")
    private Double electricPrice;

    /***** 合同到期预警天数 ***/
    @TableField(value = "contract_number")
    private Integer contractNumber;

    /***** 评估提醒周期(月) ***/
    @TableField(value = "assess_number")
    private Integer assessNumber;

    /***** 护理超时提醒(分钟) ***/
    @TableField(value = "nursing_number")
    private Integer nursingNumber;

    /***** 甲方名称(合同签订) ***/
    @TableField(value = "party_name")
    private String partyName;

    /***** 甲方电话(合同签订) ***/
    @TableField(value = "party_tel")
    private String partyTel;

    /***** 甲方地址(合同签订) ***/
    @TableField(value = "party_address")
    private String partyAddress;

    /***** 二维码背景图路径 ***/
    @TableField(value = "code_img_path")
    private String codeImgPath;

    /***** 餐饮时段设置:早餐(格式：06:00-11:00) ***/
    @TableField(value = "breakfast_time")
    private String breakfastTime;

    /***** 餐饮时段设置:午餐(格式：06:00-11:00) ***/
    @TableField(value = "lunch_time")
    private String lunchTime;

    /***** 餐饮时段设置:晚餐(格式：06:00-11:00) ***/
    @TableField(value = "dinner_time")
    private String dinnerTime;

    /***** 打卡范围（米） ***/
    @TableField(value = "check_distance")
    private Double checkDistance;

    /***** 否开启打卡定位功能（1是 ***/
    @TableField(value = "check_position")
    private Integer checkPosition;

    /***** 每月休息天数(自动排班使用) ***/
    @TableField(value = "rest_days")
    private Integer restDays;

    /***** 公司印章(老人合同签署使用) ***/
    @TableField(value = "company_seal")
    private String companySeal;

    /***** 热水费单价(m²) ***/
    @TableField(value = "hot_water_price")
    private Double hotWaterPrice;

    /***** 供热费单价(m²) ***/
    @TableField(value = "heating_price")
    private Double heatingPrice;

    /***** 医疗专家数 ***/
    @TableField(value = "medical_expert")
    private Integer medicalExpert;

    /***** 建档率(%) ***/
    @TableField(value = "filing_rate")
    private Double filingRate;

    /***** 年度健康随访次数 ***/
    @TableField(value = "year_follow")
    private Integer yearFollow;

    /***** 药品预警值 ***/
    @TableField(value = "drug_warning")
    private Integer drugWarning;

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


