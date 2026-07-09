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

@TableName("tb_jiangyukeji_ins_elder_contract_info")
@Data
public class InsElderContractInfo implements Serializable, Cloneable {

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

    /***** 合同编号 ***/
    @TableField(value = "contract_code")
    private String contractCode;

    /***** 合同名称 ***/
    @TableField(value = "contract_name")
    private String contractName;

    /***** 合同模板主键id ***/
    @TableField(value = "template_id")
    private Long templateId;

    /***** 合同模板名称 ***/
    @TableField(value = "template_name")
    private String templateName;

    /***** 合同签订时间 ***/
    @TableField(value = "sign_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date signTime;

    /***** 合同开始日期 ***/
    @TableField(value = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /***** 合同结束日期 ***/
    @TableField(value = "end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /***** 入住押金金额(元) ***/
    @TableField(value = "deposit_amount")
    private Double depositAmount;

    /***** 费用类型(1年付 ***/
    @TableField(value = "cost_type")
    private Integer costType;

    /***** 床位类型(数据字典(ins_bed_type)) ***/
    @TableField(value = "bed_type")
    private String bedType;

    /***** 床位费(元) ***/
    @TableField(value = "bed_amount")
    private Double bedAmount;

    /***** 床位费押金(元) ***/
    @TableField(value = "bed_deposit_amount")
    private Double bedDepositAmount;

    /***** 护理等级id ***/
    @TableField(value = "nursing_level_id")
    private Long nursingLevelId;

    /***** 护理等级名称 ***/
    @TableField(value = "nursing_level_name")
    private String nursingLevelName;

    /***** 护理费(元) ***/
    @TableField(value = "nursing_amount")
    private Double nursingAmount;

    /***** 护理费押金(元) ***/
    @TableField(value = "nursing_deposit_amount")
    private Double nursingDepositAmount;

    /***** 餐饮费(元) ***/
    @TableField(value = "food_amount")
    private Double foodAmount;

    /***** 餐饮费押金(元) ***/
    @TableField(value = "food_deposit_amount")
    private Double foodDepositAmount;

    /***** 是否享受政策补贴(1否 ***/
    @TableField(value = "is_subsidy")
    private Integer isSubsidy;

    /***** 合同说明 ***/
    @TableField(value = "contract_desp")
    private String contractDesp;

    /***** 甲方名称 ***/
    @TableField(value = "party_name_a")
    private String partyNameA;

    /***** 甲方联系电话 ***/
    @TableField(value = "link_tel_a")
    private String linkTelA;

    /***** 甲方地址 ***/
    @TableField(value = "address_a")
    private String addressA;

    /***** 乙方名称 ***/
    @TableField(value = "party_name_b")
    private String partyNameB;

    /***** 乙方联系电话 ***/
    @TableField(value = "link_tel_b")
    private String linkTelB;

    /***** 乙方地址 ***/
    @TableField(value = "address_b")
    private String addressB;

    /***** 代理人名称 ***/
    @TableField(value = "party_name_c")
    private String partyNameC;

    /***** 代理人联系电话 ***/
    @TableField(value = "link_tel_c")
    private String linkTelC;

    /***** 代理人地址 ***/
    @TableField(value = "address_c")
    private String addressC;

    /***** 合同内容(默认填充合同模板内容) ***/
    @TableField(value = "template_content")
    private String templateContent;

    /***** 合同附件(多个逗号分隔) ***/
    @TableField(value = "contract_path")
    private String contractPath;

    /***** 发票附件(多个逗号分隔) ***/
    @TableField(value = "invoice_path")
    private String invoicePath;

    /***** 合同状态(1待签订 ***/
    @TableField(value = "contract_state")
    private Integer contractState;

    /***** 提交状态(1未提交 ***/
    @TableField(value = "submit_state")
    private Integer submitState;

    /***** 合同电子签名状态(0无需电子签名 ***/
    @TableField(value = "signing_state")
    private Integer signingState;

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

    /***** 二维码地址 ***/
    @TableField(value = "code_path")
    private String codePath;

    /***** 法定代表人或授权代表签字(甲方) ***/
    @TableField(value = "staffer_sign")
    private String stafferSign;

    /***** 法定代表人或授权代表签字日期(甲方) ***/
    @TableField(value = "staffer_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date stafferDate;

    /***** 乙方/乙方监护人签名 ***/
    @TableField(value = "guardian_sign")
    private String guardianSign;

    /***** 乙方/乙方监护人签名日期 ***/
    @TableField(value = "guardian_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date guardianDate;

    /***** 丙方签名 ***/
    @TableField(value = "other_sign")
    private String otherSign;

    /***** 丙方签名日期 ***/
    @TableField(value = "other_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date otherDate;

    /***** 审核状态(1未审核 ***/
    @TableField(value = "audit_state")
    private Integer auditState;

    /***** 审核人主键id ***/
    @TableField(value = "audit_id")
    private Long auditId;

    /***** 审核人姓名 ***/
    @TableField(value = "audit_name")
    private String auditName;

    /***** 审核时间 ***/
    @TableField(value = "audit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    /***** 审核说明 ***/
    @TableField(value = "audit_memo")
    private String auditMemo;

    /***** 发送状态(0未发送 ***/
    @TableField(value = "send_state")
    private Integer sendState;


}


